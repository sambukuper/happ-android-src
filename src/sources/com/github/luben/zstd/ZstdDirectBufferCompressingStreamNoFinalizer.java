package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.bt;
import defpackage.u52;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {
    private int level;
    private final long stream;
    private ByteBuffer target;
    private int consumed = 0;
    private int produced = 0;
    private boolean closed = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private ZstdDictCompress fastDict = null;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i) throws IOException {
        this.level = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            bt.q("Target buffer should be a direct buffer");
            throw null;
        }
        this.target = byteBuffer;
        this.level = i;
        this.stream = createCStream();
    }

    private native long compressDirectByteBuffer(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native long createCStream();

    private native long endStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long flushStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private static native long freeCStream(long j);

    private native long initCStream(long j, int i);

    private native long initCStreamWithDict(long j, byte[] bArr, int i, int i2);

    private native long initCStreamWithFastDict(long j, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                while (true) {
                    ByteBuffer byteBuffer = this.target;
                    if (byteBuffer == null) {
                        throw new IOException("Stream closed");
                    }
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    try {
                        long jEndStream = zstdDirectBufferCompressingStreamNoFinalizer.endStream(this.stream, byteBuffer, byteBuffer.position(), byteBuffer.remaining());
                        if (Zstd.isError(jEndStream)) {
                            throw new ZstdIOException(jEndStream);
                        }
                        byteBuffer.position(byteBuffer.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
                        ByteBuffer byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.flushBuffer(byteBuffer);
                        zstdDirectBufferCompressingStreamNoFinalizer.target = byteBufferFlushBuffer;
                        if (!byteBufferFlushBuffer.isDirect()) {
                            throw new IllegalArgumentException("Target buffer should be a direct buffer");
                        }
                        if (jEndStream > 0 && !byteBufferFlushBuffer.hasRemaining()) {
                            throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                        }
                        if (jEndStream <= 0) {
                            break;
                        } else {
                            this = zstdDirectBufferCompressingStreamNoFinalizer;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    Throwable th2 = th;
                    freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
                    zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
                    zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
                    zstdDirectBufferCompressingStreamNoFinalizer.target = null;
                    ZstdDictCompress zstdDictCompress = zstdDirectBufferCompressingStreamNoFinalizer.fastDict;
                    if (zstdDictCompress != null) {
                        zstdDictCompress.releaseSharedLock();
                    }
                    zstdDirectBufferCompressingStreamNoFinalizer.fastDict = null;
                    zstdDirectBufferCompressingStreamNoFinalizer.dict = null;
                    throw th2;
                }
            }
            zstdDirectBufferCompressingStreamNoFinalizer = this;
            freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
            zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
            zstdDirectBufferCompressingStreamNoFinalizer.target = null;
            ZstdDictCompress zstdDictCompress2 = zstdDirectBufferCompressingStreamNoFinalizer.fastDict;
            if (zstdDictCompress2 != null) {
                zstdDictCompress2.releaseSharedLock();
            }
            zstdDirectBufferCompressingStreamNoFinalizer.fastDict = null;
            zstdDirectBufferCompressingStreamNoFinalizer.dict = null;
        } catch (Throwable th3) {
            th = th3;
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        }
    }

    public void compress(ByteBuffer byteBuffer) throws IOException {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long jInitCStream;
        if (!byteBuffer.isDirect()) {
            bt.q("Source buffer should be a direct buffer");
            return;
        }
        if (this.closed) {
            u52.s("Stream closed");
            return;
        }
        if (this.initialized) {
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        } else {
            ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                jInitCStream = initCStreamWithFastDict(this.stream, zstdDictCompress);
                zstdDirectBufferCompressingStreamNoFinalizer = this;
            } else {
                byte[] bArr = this.dict;
                long j = this.stream;
                if (bArr != null) {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    jInitCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStreamWithDict(j, bArr, bArr.length, this.level);
                } else {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    jInitCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStream(j, zstdDirectBufferCompressingStreamNoFinalizer.level);
                }
            }
            if (Zstd.isError(jInitCStream)) {
                throw new ZstdIOException(jInitCStream);
            }
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.target;
            if (byteBufferFlushBuffer == null) {
                u52.s("Stream closed");
                return;
            }
            if (!byteBufferFlushBuffer.hasRemaining()) {
                byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.flushBuffer(byteBufferFlushBuffer);
                zstdDirectBufferCompressingStreamNoFinalizer.target = byteBufferFlushBuffer;
                if (!byteBufferFlushBuffer.isDirect()) {
                    bt.q("Target buffer should be a direct buffer");
                    return;
                } else if (!byteBufferFlushBuffer.hasRemaining()) {
                    u52.s("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                    return;
                }
            }
            ByteBuffer byteBuffer2 = byteBufferFlushBuffer;
            ByteBuffer byteBuffer3 = byteBuffer;
            long jCompressDirectByteBuffer = zstdDirectBufferCompressingStreamNoFinalizer.compressDirectByteBuffer(zstdDirectBufferCompressingStreamNoFinalizer.stream, byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining(), byteBuffer3, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(jCompressDirectByteBuffer)) {
                throw new ZstdIOException(jCompressDirectByteBuffer);
            }
            byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
            byteBuffer3.position(byteBuffer3.position() + zstdDirectBufferCompressingStreamNoFinalizer.consumed);
            byteBuffer = byteBuffer3;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.closed) {
            u52.s("Already closed");
            return;
        }
        if (!this.initialized) {
            return;
        }
        while (true) {
            ByteBuffer byteBuffer = this.target;
            if (byteBuffer == null) {
                u52.s("Stream closed");
                return;
            }
            ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer = this;
            long jFlushStream = zstdDirectBufferCompressingStreamNoFinalizer.flushStream(this.stream, byteBuffer, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(jFlushStream)) {
                throw new ZstdIOException(jFlushStream);
            }
            byteBuffer.position(byteBuffer.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
            ByteBuffer byteBufferFlushBuffer = zstdDirectBufferCompressingStreamNoFinalizer.flushBuffer(byteBuffer);
            zstdDirectBufferCompressingStreamNoFinalizer.target = byteBufferFlushBuffer;
            if (!byteBufferFlushBuffer.isDirect()) {
                bt.q("Target buffer should be a direct buffer");
                return;
            } else if (jFlushStream > 0 && !byteBufferFlushBuffer.hasRemaining()) {
                u52.s("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                return;
            } else if (jFlushStream <= 0) {
                return;
            } else {
                this = zstdDirectBufferCompressingStreamNoFinalizer;
            }
        }
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (this.initialized) {
            bt.i("Change of parameter on initialized stream");
            return null;
        }
        this.dict = null;
        zstdDictCompress.acquireSharedLock();
        ZstdDictCompress zstdDictCompress2 = this.fastDict;
        if (zstdDictCompress2 != null) {
            zstdDictCompress2.releaseSharedLock();
        }
        this.fastDict = zstdDictCompress;
        return this;
    }

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(byte[] bArr) {
        if (!this.initialized) {
            this.dict = bArr;
            this.fastDict = null;
            return this;
        }
        bt.i("Change of parameter on initialized stream");
        return null;
    }
}

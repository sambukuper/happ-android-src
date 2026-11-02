package com.github.luben.zstd;

import defpackage.bt;
import defpackage.u52;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseZstdBufferDecompressingStreamNoFinalizer implements Closeable {
    private ZstdDictDecompress active_dict;
    int consumed;
    int produced;
    protected ByteBuffer source;
    protected long stream;
    protected boolean closed = false;
    private boolean finishedFrame = false;
    private boolean streamEnd = false;

    public BaseZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        this.source = byteBuffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            freeDStream(this.stream);
        } finally {
            this.closed = true;
            this.source = null;
            ZstdDictDecompress zstdDictDecompress = this.active_dict;
            if (zstdDictDecompress != null) {
                zstdDictDecompress.releaseSharedLock();
                this.active_dict = null;
            }
        }
    }

    public abstract long createDStream();

    public abstract long decompressStream(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public abstract long freeDStream(long j);

    public boolean hasRemaining() {
        ByteBuffer byteBuffer = this.source;
        if (byteBuffer == null || this.closed || this.streamEnd) {
            return false;
        }
        return byteBuffer.hasRemaining() || !this.finishedFrame;
    }

    public abstract long initDStream(long j);

    public abstract int read(ByteBuffer byteBuffer) throws IOException;

    public int readInternal(ByteBuffer byteBuffer, boolean z) throws IOException {
        if (this.closed) {
            u52.s("Stream closed");
            return 0;
        }
        if (this.streamEnd) {
            return 0;
        }
        ByteBuffer byteBufferRefill = this.source;
        if (byteBufferRefill == null) {
            u52.s("Stream closed");
            return 0;
        }
        long jDecompressStream = decompressStream(this.stream, byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBufferRefill, byteBufferRefill.position(), byteBufferRefill.remaining());
        if (Zstd.isError(jDecompressStream)) {
            throw new ZstdIOException(jDecompressStream);
        }
        byteBufferRefill.position(byteBufferRefill.position() + this.consumed);
        byteBuffer.position(byteBuffer.position() + this.produced);
        if (!byteBufferRefill.hasRemaining()) {
            byteBufferRefill = refill(byteBufferRefill);
            this.source = byteBufferRefill;
            if (!z && byteBufferRefill.isDirect()) {
                bt.q("Source buffer should be a non-direct buffer");
                return 0;
            }
            if (z && !byteBufferRefill.isDirect()) {
                bt.q("Source buffer should be a direct buffer");
                return 0;
            }
        }
        boolean z2 = jDecompressStream == 0;
        this.finishedFrame = z2;
        if (z2) {
            this.streamEnd = !byteBufferRefill.hasRemaining();
        }
        return this.produced;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        java.util.Objects.requireNonNull(zstdDictDecompress, "dict");
        if (this.closed) {
            u52.s("Stream closed");
            return null;
        }
        zstdDictDecompress.acquireSharedLock();
        long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
        if (Zstd.isError(jLoadFastDictDecompress)) {
            zstdDictDecompress.releaseSharedLock();
            throw new ZstdIOException(jLoadFastDictDecompress);
        }
        ZstdDictDecompress zstdDictDecompress2 = this.active_dict;
        if (zstdDictDecompress2 != null) {
            zstdDictDecompress2.releaseSharedLock();
        }
        this.active_dict = zstdDictDecompress;
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setLongMax(int i) throws IOException {
        if (this.closed) {
            u52.s("Stream closed");
            return null;
        }
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        java.util.Objects.requireNonNull(bArr, "dict");
        if (!this.closed) {
            long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
            if (Zstd.isError(jLoadDictDecompress)) {
                throw new ZstdIOException(jLoadDictDecompress);
            }
            return this;
        }
        u52.s("Stream closed");
        return null;
    }
}

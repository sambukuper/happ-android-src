package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.bt;
import defpackage.oi0;
import defpackage.u52;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    private static final int srcBuffSize;
    private ZstdDictDecompress active_dict;
    private final BufferPool bufferPool;
    private long dstPos;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead;
    private final byte[] src;
    private final ByteBuffer srcByteBuffer;
    private long srcPos;
    private long srcSize;
    private final long stream;

    static {
        Native.load();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, BufferPool bufferPool) throws IOException {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.needRead = true;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, srcBuffSize);
        this.srcByteBuffer = arrayBackedBuffer;
        this.src = arrayBackedBuffer.array();
        synchronized (this) {
            long jCreateDStream = createDStream();
            this.stream = jCreateDStream;
            initDStream(jCreateDStream);
        }
    }

    private static native long createDStream();

    private native long decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native long freeDStream(long j);

    private native int initDStream(long j);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.isClosed) {
                return;
            }
            ZstdDictDecompress zstdDictDecompress = this.active_dict;
            if (zstdDictDecompress != null) {
                zstdDictDecompress.releaseSharedLock();
                this.active_dict = null;
            }
            this.isClosed = true;
            this.bufferPool.release(this.srcByteBuffer);
            freeDStream(this.stream);
            ((FilterInputStream) this).in.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0 && i2 >= 0) {
            if (i2 <= bArr.length - i) {
                int internal = 0;
                if (i2 == 0) {
                    return 0;
                }
                while (internal == 0) {
                    internal = readInternal(bArr, i, i2);
                }
                return internal;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i2 + " from offset " + i + " in buffer of size " + bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int readInternal(byte[] bArr, int i, int i2) throws IOException {
        long j;
        boolean z = false;
        if (this.isClosed) {
            u52.s("Stream closed");
            return 0;
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            bt.f(bArr.length, oi0.r(i2, "Requested length ", i, " from offset ", " in buffer of size "));
            return 0;
        }
        int i3 = i + i2;
        long j2 = i;
        this.dstPos = j2;
        long j3 = -1;
        while (true) {
            j = this.dstPos;
            long j4 = i3;
            if (j >= j4 || j3 >= j) {
                break;
            }
            if (this.needRead && (((FilterInputStream) this).in.available() > 0 || this.dstPos == j2)) {
                long j5 = ((FilterInputStream) this).in.read(this.src, z ? 1 : 0, srcBuffSize);
                this.srcSize = j5;
                this.srcPos = 0L;
                if (j5 < 0) {
                    this.srcSize = 0L;
                    if (this.frameFinished) {
                        return -1;
                    }
                    if (!this.isContinuous) {
                        throw new ZstdIOException(Zstd.errCorruptionDetected(), "Truncated source");
                    }
                    long j6 = (int) (this.dstPos - j2);
                    this.srcSize = j6;
                    if (j6 > 0) {
                        return (int) j6;
                    }
                    return -1;
                }
                if (j5 == 0) {
                    continue;
                } else {
                    this.frameFinished = z;
                }
            }
            long j7 = this.dstPos;
            long j8 = this.stream;
            byte[] bArr2 = this.src;
            Object[] objArr = z ? 1 : 0;
            long j9 = j2;
            long jDecompressStream = decompressStream(j8, bArr, i3, bArr2, (int) this.srcSize);
            if (Zstd.isError(jDecompressStream)) {
                throw new ZstdIOException(jDecompressStream);
            }
            if (jDecompressStream == 0) {
                this.frameFinished = true;
                this.needRead = this.srcPos == this.srcSize ? true : objArr == true ? 1 : 0;
                return (int) (this.dstPos - j9);
            }
            this.needRead = this.dstPos >= j4 ? objArr == true ? 1 : 0 : true;
            j2 = j9;
            j3 = j7;
            z = objArr == true ? 1 : 0;
        }
        return (int) (j - j2);
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        try {
            if (this.isClosed) {
                throw new IOException("Stream closed");
            }
            if (zstdDictDecompress != null) {
                zstdDictDecompress.acquireSharedLock();
            }
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                if (zstdDictDecompress != null) {
                    zstdDictDecompress.releaseSharedLock();
                }
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
            ZstdDictDecompress zstdDictDecompress2 = this.active_dict;
            if (zstdDictDecompress2 != null) {
                zstdDictDecompress2.releaseSharedLock();
            }
            this.active_dict = zstdDictDecompress;
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setLongMax(int i) throws IOException {
        try {
            if (this.isClosed) {
                throw new IOException("Stream closed");
            }
            long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i);
            if (Zstd.isError(decompressionLongMax)) {
                throw new ZstdIOException(decompressionLongMax);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setRefMultipleDDicts(boolean z) throws IOException {
        try {
            if (this.isClosed) {
                throw new IOException("Stream closed");
            }
            long refMultipleDDicts = Zstd.setRefMultipleDDicts(this.stream, z);
            if (Zstd.isError(refMultipleDDicts)) {
                throw new ZstdIOException(refMultipleDDicts);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        int i;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (j <= 0) {
            return 0L;
        }
        int iRecommendedDOutSize = (int) recommendedDOutSize();
        if (iRecommendedDOutSize > j) {
            iRecommendedDOutSize = (int) j;
        }
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(this.bufferPool, iRecommendedDOutSize);
        try {
            byte[] bArrArray = arrayBackedBuffer.array();
            long j2 = j;
            while (j2 > 0 && (i = read(bArrArray, 0, (int) Math.min(iRecommendedDOutSize, j2))) >= 0) {
                j2 -= (long) i;
            }
            this.bufferPool.release(arrayBackedBuffer);
            return j - j2;
        } catch (Throwable th) {
            this.bufferPool.release(arrayBackedBuffer);
            throw th;
        }
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) throws IOException {
        this(inputStream, NoPool.INSTANCE);
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        try {
            if (!this.isClosed) {
                long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
                if (Zstd.isError(jLoadDictDecompress)) {
                    throw new ZstdIOException(jLoadDictDecompress);
                }
            } else {
                throw new IOException("Stream closed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        try {
            byte[] bArr = new byte[1];
            int internal = 0;
            while (internal == 0) {
                internal = readInternal(bArr, 0, 1);
            }
            if (internal != 1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (Throwable th) {
            throw th;
        }
    }
}

package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import defpackage.bt;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ZstdBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer.isDirect()) {
            bt.q("Source buffer should be a non-direct buffer");
            throw null;
        }
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private native long createDStreamNative();

    private native long decompressStreamNative(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native long freeDStreamNative(long j);

    private native long initDStreamNative(long j);

    private static native long recommendedDOutSizeNative();

    public static int recommendedTargetBufferSize() {
        return (int) recommendedDOutSizeNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long createDStream() {
        return createDStreamNative();
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long decompressStream(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        if (!byteBuffer2.hasArray()) {
            bt.q("provided source ByteBuffer lacks array");
            return 0L;
        }
        if (!byteBuffer.hasArray()) {
            bt.q("provided destination ByteBuffer lacks array");
            return 0L;
        }
        return decompressStreamNative(j, byteBuffer.array(), i + byteBuffer.arrayOffset(), i2, byteBuffer2.array(), i3 + byteBuffer2.arrayOffset(), i4);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long freeDStream(long j) {
        return freeDStreamNative(j);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public long initDStream(long j) {
        return initDStreamNative(j);
    }

    @Override // com.github.luben.zstd.BaseZstdBufferDecompressingStreamNoFinalizer
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.isDirect()) {
            return readInternal(byteBuffer, false);
        }
        bt.q("Target buffer should be a non-direct buffer");
        return 0;
    }
}

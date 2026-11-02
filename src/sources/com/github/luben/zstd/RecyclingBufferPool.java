package com.github.luben.zstd;

import defpackage.kp5;
import defpackage.pc6;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclingBufferPool implements BufferPool {
    public static final BufferPool INSTANCE = new RecyclingBufferPool();
    private static final int buffSize = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());
    private final ConcurrentLinkedQueue<SoftReference<ByteBuffer>> pool = new ConcurrentLinkedQueue<>();

    private RecyclingBufferPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i) {
        ByteBuffer byteBuffer;
        int i2 = buffSize;
        if (i > i2) {
            kp5.t(pc6.k(i, "Unsupported buffer size: ", i2, ". Supported buffer sizes: ", " or smaller."));
            return null;
        }
        do {
            SoftReference<ByteBuffer> softReferencePoll = this.pool.poll();
            if (softReferencePoll == null) {
                return ByteBuffer.allocate(buffSize);
            }
            byteBuffer = softReferencePoll.get();
        } while (byteBuffer == null);
        return byteBuffer;
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= buffSize) {
            byteBuffer.clear();
            this.pool.add(new SoftReference<>(byteBuffer));
        }
    }
}

package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface BufferPool {
    ByteBuffer get(int i);

    void release(ByteBuffer byteBuffer);
}

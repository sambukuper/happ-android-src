package com.github.luben.zstd;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ZstdException extends RuntimeException {
    private long code;

    public ZstdException(long j) {
        this(Zstd.getErrorCode(j), Zstd.getErrorName(j));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdException(long j, String str) {
        super(str);
        this.code = j;
    }
}

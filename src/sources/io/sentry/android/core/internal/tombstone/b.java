package io.sentry.android.core.internal.tombstone;

import io.sentry.protocol.DebugImage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public String a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    public final DebugImage a() {
        long j = this.c;
        String str = this.b;
        if (str.isEmpty()) {
            return null;
        }
        DebugImage debugImage = new DebugImage();
        debugImage.setCodeId(str);
        debugImage.setCodeFile(this.a);
        String strA = io.sentry.config.a.a(str);
        if (strA != null) {
            str = strA;
        }
        debugImage.setDebugId(str);
        debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
        debugImage.setImageSize(this.d - j);
        debugImage.setType("elf");
        return debugImage;
    }
}

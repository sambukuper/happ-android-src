package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ek2 extends ru2 {
    public static final Range d = new Range(30, 30);
    public final byte a = 60;
    public final byte b = 60;
    public final s82 c = s82.Y;

    @Override // defpackage.ru2
    public final s82 a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append((int) this.a);
        sb.append(", maxFps=");
        return pc6.r(sb, this.b, ')');
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public static final k1 b;
    public static final k1 c;
    public final Throwable a;

    static {
        if (r1.f0) {
            c = null;
            b = null;
        } else {
            c = new k1(null, false);
            b = new k1(null, true);
        }
    }

    public k1(Throwable th, boolean z) {
        this.a = th;
    }
}

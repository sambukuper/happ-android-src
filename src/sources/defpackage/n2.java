package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {
    public static final n2 c;
    public static final n2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (u2.f0) {
            d = null;
            c = null;
        } else {
            d = new n2(null, false);
            c = new n2(null, true);
        }
    }

    public n2(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}

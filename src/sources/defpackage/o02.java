package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o02 implements AutoCloseable {
    public static final o02 Z;
    public static cv5 f0;
    public static final n02 g0;
    public final Object X;
    public volatile boolean Y;

    static {
        o02 o02Var = new o02();
        Z = o02Var;
        i02 i02Var = new i02(o02Var);
        f0 = i02Var;
        g0 = new n02(-1L, -1L, "Empty Thread", i02Var);
        nx0.a.incrementAndGet();
    }

    public o02() {
        p02 p02Var = p02.X;
        this.X = new Object();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        p02.X.close();
    }
}

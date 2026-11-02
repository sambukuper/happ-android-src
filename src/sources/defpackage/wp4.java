package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wp4 extends vp4 {
    public static final long k0;
    public static final long l0;
    public final u97 Z;
    public final mj7 f0;
    public final w39 g0;
    public final c24 h0;
    public final md0 i0;
    public final pb1 j0;

    static {
        long j = 0;
        for (xp4 xp4Var : xp4.values()) {
            if (xp4Var.X) {
                j |= xp4Var.Y;
            }
        }
        k0 = j;
        l0 = xp4.h0.Y | xp4.i0.Y | xp4.j0.Y | xp4.k0.Y | xp4.g0.Y;
    }

    public wp4(wp4 wp4Var, long j) {
        super(wp4Var, j);
        this.Z = wp4Var.Z;
        this.f0 = wp4Var.f0;
        this.h0 = wp4Var.h0;
        this.g0 = wp4Var.g0;
        this.i0 = wp4Var.i0;
        this.j0 = wp4Var.j0;
    }

    @Override // defpackage.rs0
    public final Class a(Class cls) {
        return this.Z.a(cls);
    }

    public wp4(l20 l20Var, mj7 mj7Var, u97 u97Var, c24 c24Var, md0 md0Var, pb1 pb1Var) {
        super(l20Var, k0);
        this.Z = u97Var;
        this.f0 = mj7Var;
        this.h0 = c24Var;
        this.g0 = e51.j0;
        this.i0 = md0Var;
        this.j0 = pb1Var;
    }
}

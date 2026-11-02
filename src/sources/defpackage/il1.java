package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class il1 extends wp4 {
    public static final int n0 = vp4.b(kl1.class);
    public final int m0;

    public il1(l20 l20Var, mj7 mj7Var, u97 u97Var, c24 c24Var, md0 md0Var, ov0 ov0Var, pb1 pb1Var) {
        super(l20Var, mj7Var, u97Var, c24Var, md0Var, pb1Var);
        this.m0 = n0;
    }

    @Override // defpackage.vp4
    public final boolean e(nb1 nb1Var) {
        pb1 pb1Var = this.j0;
        pb1Var.getClass();
        int iB = nb1Var.b();
        if (iB == 0) {
            return nb1Var.a(pb1Var.X);
        }
        if (iB == 1) {
            return nb1Var.a(pb1Var.Y);
        }
        int i = ev8.a;
        kp5.t("Internal error: this code path should never get executed");
        return false;
    }

    public final wp4 g(long j) {
        return new il1(this, j, this.m0);
    }

    public il1(il1 il1Var, long j, int i) {
        super(il1Var, j);
        this.m0 = i;
    }
}

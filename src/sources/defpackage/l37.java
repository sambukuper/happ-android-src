package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l37 extends wp4 {
    public static final lf1 o0;
    public static final int p0;
    public final it5 m0;
    public final int n0;

    static {
        int i = it5.E;
        lf1 lf1Var = new lf1();
        lf1Var.X = kf1.X;
        lf1Var.Y = we1.f0;
        lf1Var.Z = new r37(" ");
        lf1Var.g0 = pc6.a(':', 4);
        lf1Var.h0 = pc6.a(',', 1);
        lf1Var.i0 = " ";
        lf1Var.j0 = pc6.a(',', 1);
        lf1Var.k0 = " ";
        o0 = lf1Var;
        p0 = vp4.b(n37.class);
    }

    public l37(l20 l20Var, mj7 mj7Var, u97 u97Var, c24 c24Var, md0 md0Var, pb1 pb1Var) {
        super(l20Var, mj7Var, u97Var, c24Var, md0Var, pb1Var);
        this.n0 = p0;
        this.m0 = o0;
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
        return new l37(this, j, this.n0);
    }

    public final it5 h() {
        it5 it5Var = this.m0;
        if (!(it5Var instanceof lf1)) {
            return it5Var;
        }
        lf1 lf1Var = (lf1) it5Var;
        lf1 lf1Var2 = new lf1();
        lf1Var2.X = kf1.X;
        lf1Var2.Y = we1.f0;
        lf1Var2.Z = lf1Var.Z;
        lf1Var2.X = lf1Var.X;
        lf1Var2.Y = lf1Var.Y;
        lf1Var2.f0 = lf1Var.f0;
        lf1Var2.g0 = lf1Var.g0;
        lf1Var2.h0 = lf1Var.h0;
        lf1Var2.i0 = lf1Var.i0;
        lf1Var2.j0 = lf1Var.j0;
        lf1Var2.k0 = lf1Var.k0;
        return lf1Var2;
    }

    public final z20 i(dh8 dh8Var) {
        ((b30) this.Y.Y).getClass();
        z20 z20VarE0 = b30.E0(this, dh8Var);
        Class cls = dh8Var.j0;
        if (z20VarE0 == null) {
            z20VarE0 = (!dh8Var.I0() || (dh8Var instanceof cu) || !it0.q(cls) || !(Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) || cls.toString().indexOf(36) > 0) ? null : z20.d(this, dh8Var, bl.g(this, dh8Var, this));
            if (z20VarE0 == null) {
                al alVarG = bl.g(this, dh8Var, this);
                return new z20(new pf5(this, dh8Var, alVarG, it0.t(cls) ? new be1(this, alVarG) : new ce1(this, "set")));
            }
        }
        return z20VarE0;
    }

    public final boolean j(n37 n37Var) {
        return (this.n0 & n37Var.Y) != 0;
    }

    public l37(l37 l37Var, long j, int i) {
        super(l37Var, j);
        this.n0 = i;
        this.m0 = l37Var.m0;
    }
}

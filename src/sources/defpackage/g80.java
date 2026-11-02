package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g80 {
    public static final s05 a = b(true);
    public static final s05 b = b(false);
    public static final ld c = ld.e;

    public static final void a(kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(-211209833);
        int i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(lp2Var.T);
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            kl5 kl5VarL = lp2Var.l();
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, c);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var, i, b2);
        }
    }

    public static final s05 b(boolean z) {
        s05 s05Var = new s05(9);
        p50 p50Var = pz2.Z;
        s05Var.l(p50Var, new k80(p50Var, z));
        p50 p50Var2 = pz2.f0;
        s05Var.l(p50Var2, new k80(p50Var2, z));
        p50 p50Var3 = pz2.g0;
        s05Var.l(p50Var3, new k80(p50Var3, z));
        p50 p50Var4 = pz2.h0;
        s05Var.l(p50Var4, new k80(p50Var4, z));
        p50 p50Var5 = pz2.i0;
        s05Var.l(p50Var5, new k80(p50Var5, z));
        p50 p50Var6 = pz2.j0;
        s05Var.l(p50Var6, new k80(p50Var6, z));
        p50 p50Var7 = pz2.k0;
        s05Var.l(p50Var7, new k80(p50Var7, z));
        p50 p50Var8 = pz2.l0;
        s05Var.l(p50Var8, new k80(p50Var8, z));
        p50 p50Var9 = pz2.m0;
        s05Var.l(p50Var9, new k80(p50Var9, z));
        return s05Var;
    }

    public static final xr4 c(p50 p50Var, boolean z) {
        xr4 xr4Var = (xr4) (z ? a : b).g(p50Var);
        return xr4Var == null ? new k80(p50Var, z) : xr4Var;
    }

    public static final void d(do5 do5Var, eo5 eo5Var, tr4 tr4Var, z24 z24Var, int i, int i2, p50 p50Var) {
        p50 p50Var2;
        Object objW = tr4Var.w();
        e80 e80Var = objW instanceof e80 ? (e80) objW : null;
        do5.g(do5Var, eo5Var, ((e80Var == null || (p50Var2 = e80Var.q0) == null) ? p50Var : p50Var2).a((((long) eo5Var.X) << 32) | (((long) eo5Var.Y) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), z24Var));
    }
}

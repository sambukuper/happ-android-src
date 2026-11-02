package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m87 {
    public static final sg8 a = wl7.i0(300, 2, yx1.a);

    public static final void a(zy0 zy0Var, lp2 lp2Var, int i) {
        zy0 zy0Var2;
        lp2 lp2Var2;
        lp2Var.X(1033612924);
        byte b = 1;
        if (lp2Var.N(i & 1, (i & 19) != 18)) {
            String strB = w79.B(a56.m3c_bottom_sheet_drag_handle_description, lp2Var);
            r03 r03Var = new r03(pz2.r0);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, r03Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            zy0Var2 = zy0Var;
            lp2Var2 = lp2Var;
            ec8.c(zb8.a(lp2Var, 390, 2), jm4.U(2059851063, new mg1(strB, b), lp2Var), ec8.e(lp2Var, 0, 7), null, false, zy0Var2, lp2Var2, 100663344);
            lp2Var2.p(true);
        } else {
            zy0Var2 = zy0Var;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new h8(zy0Var2, i, (byte) 9);
        }
    }
}

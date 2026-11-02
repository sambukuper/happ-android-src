package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vf1 {
    public static final vf1 a = new vf1();

    public final void a(ma7 ma7Var, lp2 lp2Var, int i) {
        lp2 lp2Var2 = lp2Var;
        float f = ma7Var.g;
        lp2Var2.X(2137486921);
        byte b = 2;
        int i2 = i | (lp2Var2.f(ma7Var) ? 4 : 2);
        byte b2 = 0;
        if (lp2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            kc8 kc8Var = ma7Var.i;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                bt.q("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = lp2Var2.f(kc8Var) | lp2Var2.f(null);
            Object objK = lp2Var2.K();
            be beVar = zz0.a;
            if (zF || objK == beVar) {
                objK = rd7.b(new f3(ma7Var, (byte) 9));
                lp2Var2.g0(objK);
            }
            lh7 lh7VarA = oa7.a(((dw0) ((lh7) objK).getValue()).a, w39.q0(ly4.Z, lp2Var2), null, lp2Var2, 0, 12);
            zy0 zy0VarU = jm4.U(-1658896622, new sb(ma7Var, b), lp2Var2);
            lp2Var2.W(690108113);
            lp2Var2.p(false);
            kx4 kx4Var = ma7Var.a;
            hx4 hx4Var = hx4.X;
            kx4 kx4VarY = kx4Var.y(hx4Var);
            boolean zF2 = lp2Var2.f(lh7VarA);
            Object objK2 = lp2Var2.K();
            if (zF2 || objK2 == beVar) {
                objK2 = new sf1(lh7VarA, b2);
                lp2Var2.g0(objK2);
            }
            kx4 kx4VarR = w79.r(kx4VarY, (gn2) objK2);
            Object objK3 = lp2Var2.K();
            if (objK3 == beVar) {
                objK3 = new h80((byte) 11);
                lp2Var2.g0(objK3);
            }
            kx4 kx4VarA = v07.a(kx4VarR, false, (gn2) objK3);
            Object objK4 = lp2Var2.K();
            if (objK4 == beVar) {
                objK4 = uf1.b;
                lp2Var2.g0(objK4);
            }
            kx4 kx4VarA2 = yy7.a(kx4VarA, dn8.a, (PointerInputEventHandler) objK4);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var2);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarA2);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, xr4VarC);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var2, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            kx4 kx4VarL = w39.l(z51.Y(hx4Var, ma7Var.h));
            ox1 ox1Var = zo.a;
            b2 = (i2 & 14) == 4 ? (byte) 1 : (byte) 0;
            Object objK5 = lp2Var2.K();
            if (b2 != 0 || objK5 == beVar) {
                objK5 = new tf1();
                lp2Var2.g0(objK5);
            }
            re2 re2Var = (re2) objK5;
            long j = kc8Var.c;
            long j2 = kc8Var.d;
            long j3 = kc8Var.e;
            long j4 = kc8Var.f;
            zy0 zy0Var = ma7Var.b;
            o88 o88Var = ma7Var.c;
            o88 o88Var2 = ma7Var.d;
            zy0 zy0Var2 = ma7Var.e;
            float f2 = ma7Var.g;
            Object objK6 = lp2Var2.K();
            if (objK6 == beVar) {
                objK6 = new w01((byte) 12);
                lp2Var2.g0(objK6);
            }
            zo.c(kx4VarL, re2Var, j, j2, j4, j3, zy0Var, o88Var, o88Var2, (dn2) objK6, zy0Var2, zy0VarU, f2, lp2Var2, 0);
            lp2Var2 = lp2Var2;
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 6, i, this, ma7Var);
        }
    }
}

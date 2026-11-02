package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final v30 v30Var, final kx4 kx4Var, final long j, lp2 lp2Var, final int i) {
        lp2Var.X(1776202187);
        int i2 = (lp2Var.f(v30Var) ? 4 : 2) | i | (lp2Var.f(kx4Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objK = lp2Var.K();
            if (z || objK == zz0.a) {
                objK = new y0(v30Var, (byte) 8);
                lp2Var.g0(objK);
            }
            w45.a(v30Var, pz2.f0, jm4.U(-1653527038, new yc(j, v07.a(kx4Var, false, (gn2) objK)), lp2Var), lp2Var, i3 | 432);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(kx4Var, j, i) { // from class: zc
                public final /* synthetic */ kx4 Y;
                public final /* synthetic */ long Z;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(385);
                    dd.a(this.X, this.Y, this.Z, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(kx4 kx4Var, lp2 lp2Var, int i, int i2) {
        int i3;
        lp2Var.X(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        }
        if (lp2Var.N(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                kx4Var = hx4.X;
            }
            ch3.f(lp2Var, w79.s(b.h(kx4Var, a, 25.0f), new bd(((h88) lp2Var.j(i88.a)).a, (byte) 0)));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ad(kx4Var, i, i2);
        }
    }
}

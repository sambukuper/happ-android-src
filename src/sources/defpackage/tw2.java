package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class tw2 implements rn2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ x67 Y;
    public final /* synthetic */ kx4 Z;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ dn2 g0;
    public final /* synthetic */ ig5 h0;
    public final /* synthetic */ lh7 i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ o88 k0;
    public final /* synthetic */ byte l0;
    public final /* synthetic */ byte m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ boolean p0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tw2(boolean z, x67 x67Var, kx4 kx4Var, boolean z2, dn2 dn2Var, ig5 ig5Var, lh7 lh7Var, String str, o88 o88Var, int i, int i2, int i3, int i4, boolean z3) {
        this.X = z;
        this.Y = x67Var;
        this.Z = kx4Var;
        this.f0 = z2;
        this.g0 = dn2Var;
        this.h0 = ig5Var;
        this.i0 = lh7Var;
        this.j0 = str;
        this.k0 = o88Var;
        this.l0 = i;
        this.m0 = i2;
        this.n0 = i3;
        this.o0 = i4;
        this.p0 = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z = false;
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z2 = this.X;
            Boolean boolValueOf = Boolean.valueOf(z2);
            hx4 hx4Var = hx4.X;
            final x67 x67Var = this.Y;
            kx4 kx4VarF = u15.f(w39.k(hx4Var, x67Var).y(this.Z), ((dw0) this.i0.getValue()).a, u70.e);
            final boolean z3 = this.f0;
            if (z3 && !z2) {
                z = true;
            }
            final dn2 dn2Var = this.g0;
            kx4 kx4VarW = os4.w(vj8.x(kx4VarF, z, (xz4) null, (c) null, (dn2) null, dn2Var, lp2Var, 13), this.h0);
            final byte b = 1;
            final String str = this.j0;
            final o88 o88Var = this.k0;
            final byte b2 = this.l0;
            final byte b3 = this.m0;
            final int i = this.n0;
            boolean z4 = this.o0;
            final boolean z5 = this.p0;
            final int i2 = z4 ? 1 : 0;
            km4.c(boolValueOf, kx4VarW, (ta2) null, (String) null, jm4.U(1819387577, new sn2() { // from class: vw2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object x(Object obj3, Object obj4, Object obj5) {
                    lp2 lp2Var2;
                    lp2 lp2Var3;
                    byte b4 = b;
                    dn8 dn8Var = dn8.a;
                    hx4 hx4Var2 = hx4.X;
                    switch (b4) {
                        case 0:
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            lp2 lp2Var4 = (lp2) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            p50 p50Var = pz2.i0;
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= lp2Var4.g(zBooleanValue) ? 4 : 2;
                            }
                            if (!lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                lp2Var4.Q();
                            } else {
                                FillElement fillElement = b.a;
                                xr4 xr4VarC = g80.c(pz2.Z, false);
                                int iHashCode = Long.hashCode(lp2Var4.T);
                                kl5 kl5VarL = lp2Var4.l();
                                kx4 kx4VarQ = w45.Q(lp2Var4, fillElement);
                                uz0.j.getClass();
                                lp2Var4.Z();
                                if (lp2Var4.S) {
                                    lp2Var4.k();
                                } else {
                                    lp2Var4.j0();
                                }
                                pn7.m(pz2.B0, lp2Var4, xr4VarC);
                                pn7.m(pz2.A0, lp2Var4, kl5VarL);
                                pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode));
                                pn7.l(lp2Var4);
                                pn7.m(pz2.z0, lp2Var4, kx4VarQ);
                                if (zBooleanValue) {
                                    lp2Var4.W(-556492207);
                                    hi5.L(lp2Var4, l80.a(b.g(hx4Var2, 24.0f), p50Var));
                                    lp2Var4.p(false);
                                    lp2Var2 = lp2Var4;
                                } else {
                                    lp2Var4.W(-71173657);
                                    z51.g(str, l80.a(fillElement, p50Var), z3, o88Var, b2, b3, i, i2 ? 1 : 0, z5, new ig5(0.0f, 0.0f, 0.0f, 0.0f), x67Var, dn2Var, lp2Var4, 805306368, 0);
                                    lp2Var2 = lp2Var4;
                                    lp2Var2.p(false);
                                }
                                lp2Var2.p(true);
                            }
                            break;
                        default:
                            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                            lp2 lp2Var5 = (lp2) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            p50 p50Var2 = pz2.i0;
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= lp2Var5.g(zBooleanValue2) ? 4 : 2;
                            }
                            if (!lp2Var5.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                lp2Var5.Q();
                            } else {
                                FillElement fillElement2 = b.a;
                                xr4 xr4VarC2 = g80.c(pz2.Z, false);
                                int iHashCode2 = Long.hashCode(lp2Var5.T);
                                kl5 kl5VarL2 = lp2Var5.l();
                                kx4 kx4VarQ2 = w45.Q(lp2Var5, fillElement2);
                                uz0.j.getClass();
                                lp2Var5.Z();
                                if (lp2Var5.S) {
                                    lp2Var5.k();
                                } else {
                                    lp2Var5.j0();
                                }
                                pn7.m(pz2.B0, lp2Var5, xr4VarC2);
                                pn7.m(pz2.A0, lp2Var5, kl5VarL2);
                                pn7.m(pz2.C0, lp2Var5, Integer.valueOf(iHashCode2));
                                pn7.l(lp2Var5);
                                pn7.m(pz2.z0, lp2Var5, kx4VarQ2);
                                if (zBooleanValue2) {
                                    lp2Var5.W(-1562218850);
                                    hi5.L(lp2Var5, l80.a(b.g(hx4Var2, 24.0f), p50Var2));
                                    lp2Var5.p(false);
                                    lp2Var3 = lp2Var5;
                                } else {
                                    lp2Var5.W(-1183929479);
                                    z51.g(str, l80.a(fillElement2, p50Var2), z3, o88Var, b2, b3, i, i2 ? 1 : 0, z5, new ig5(0.0f, 0.0f, 0.0f, 0.0f), x67Var, dn2Var, lp2Var5, 805306368, 0);
                                    lp2Var3 = lp2Var5;
                                    lp2Var3.p(false);
                                }
                                lp2Var3.p(true);
                            }
                            break;
                    }
                    return dn8Var;
                }
            }, lp2Var), lp2Var, 24576);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}

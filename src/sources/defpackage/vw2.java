package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vw2 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ o88 f0;
    public final /* synthetic */ byte g0;
    public final /* synthetic */ byte h0;
    public final /* synthetic */ int i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ x67 l0;
    public final /* synthetic */ dn2 m0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vw2(String str, boolean z, o88 o88Var, int i, int i2, int i3, int i4, boolean z2, x67 x67Var, dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = str;
        this.Z = z;
        this.f0 = o88Var;
        this.g0 = i;
        this.h0 = i2;
        this.i0 = i3;
        this.j0 = i4;
        this.k0 = z2;
        this.l0 = x67Var;
        this.m0 = dn2Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        lp2 lp2Var;
        lp2 lp2Var2;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        hx4 hx4Var = hx4.X;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                p50 p50Var = pz2.i0;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var3.g(zBooleanValue) ? 4 : 2;
                }
                if (!lp2Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var3.Q();
                } else {
                    FillElement fillElement = b.a;
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int iHashCode = Long.hashCode(lp2Var3.T);
                    kl5 kl5VarL = lp2Var3.l();
                    kx4 kx4VarQ = w45.Q(lp2Var3, fillElement);
                    uz0.j.getClass();
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    pn7.m(pz2.B0, lp2Var3, xr4VarC);
                    pn7.m(pz2.A0, lp2Var3, kl5VarL);
                    pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var3);
                    pn7.m(pz2.z0, lp2Var3, kx4VarQ);
                    if (zBooleanValue) {
                        lp2Var3.W(-556492207);
                        hi5.L(lp2Var3, l80.a(b.g(hx4Var, 24.0f), p50Var));
                        lp2Var3.p(false);
                        lp2Var = lp2Var3;
                    } else {
                        lp2Var3.W(-71173657);
                        z51.g(this.Y, l80.a(fillElement, p50Var), this.Z, this.f0, this.g0, this.h0, this.i0, this.j0 ? 1 : 0, this.k0, new ig5(0.0f, 0.0f, 0.0f, 0.0f), this.l0, this.m0, lp2Var3, 805306368, 0);
                        lp2Var = lp2Var3;
                        lp2Var.p(false);
                    }
                    lp2Var.p(true);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                p50 p50Var2 = pz2.i0;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= lp2Var4.g(zBooleanValue2) ? 4 : 2;
                }
                if (!lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    lp2Var4.Q();
                } else {
                    FillElement fillElement2 = b.a;
                    xr4 xr4VarC2 = g80.c(pz2.Z, false);
                    int iHashCode2 = Long.hashCode(lp2Var4.T);
                    kl5 kl5VarL2 = lp2Var4.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var4, fillElement2);
                    uz0.j.getClass();
                    lp2Var4.Z();
                    if (lp2Var4.S) {
                        lp2Var4.k();
                    } else {
                        lp2Var4.j0();
                    }
                    pn7.m(pz2.B0, lp2Var4, xr4VarC2);
                    pn7.m(pz2.A0, lp2Var4, kl5VarL2);
                    pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode2));
                    pn7.l(lp2Var4);
                    pn7.m(pz2.z0, lp2Var4, kx4VarQ2);
                    if (zBooleanValue2) {
                        lp2Var4.W(-1562218850);
                        hi5.L(lp2Var4, l80.a(b.g(hx4Var, 24.0f), p50Var2));
                        lp2Var4.p(false);
                        lp2Var2 = lp2Var4;
                    } else {
                        lp2Var4.W(-1183929479);
                        z51.g(this.Y, l80.a(fillElement2, p50Var2), this.Z, this.f0, this.g0, this.h0, this.i0, this.j0 ? 1 : 0, this.k0, new ig5(0.0f, 0.0f, 0.0f, 0.0f), this.l0, this.m0, lp2Var4, 805306368, 0);
                        lp2Var2 = lp2Var4;
                        lp2Var2.p(false);
                    }
                    lp2Var2.p(true);
                }
                break;
        }
        return dn8Var;
    }
}

package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dc8 implements rn2 {
    public final /* synthetic */ float X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zy0 Z;

    public dc8(float f, long j, zy0 zy0Var) {
        this.X = f;
        this.Y = j;
        this.Z = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ig5 ig5Var = ec8.a;
            kx4 kx4VarW = os4.w(b.j(hx4.X, 40.0f, 24.0f, this.X, 8), ec8.a);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarW);
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
            mb6.b(new t06[]{j41.a.a(new dw0(this.Y)), u78.a.a(yj8.a(u15.h, lp2Var))}, this.Z, lp2Var, 8);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}

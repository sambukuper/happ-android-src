package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zx7 implements rn2 {
    public final /* synthetic */ kx4 X;
    public final /* synthetic */ x67 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ float f0;
    public final /* synthetic */ d70 g0;
    public final /* synthetic */ float h0;
    public final /* synthetic */ zy0 i0;

    public zx7(kx4 kx4Var, x67 x67Var, long j, float f, d70 d70Var, float f2, zy0 zy0Var) {
        this.X = kx4Var;
        this.Y = x67Var;
        this.Z = j;
        this.f0 = f;
        this.g0 = d70Var;
        this.h0 = f2;
        this.i0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zN = lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2);
        dn8 dn8Var = dn8.a;
        if (!zN) {
            lp2Var.Q();
            return dn8Var;
        }
        iw0 iw0Var = (iw0) lp2Var.j(kw0.a);
        boolean zBooleanValue = ((Boolean) lp2Var.j(kw0.b)).booleanValue();
        long jS = iw0Var.p;
        int i = dw0.h;
        long j = this.Z;
        if (tk8.a(j, jS) && zBooleanValue) {
            float f = this.f0;
            if (!kt1.b(f, 0.0f)) {
                jS = z51.s(dw0.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, iw0Var.t), jS);
            }
            j = jS;
        }
        float fH0 = ((fi1) lp2Var.j(y01.h)).h0(this.h0);
        kx4 c70Var = hx4.X;
        x67 x67Var = this.Y;
        kx4 kx4VarY = this.X.y(fH0 > 0.0f ? jm4.K(c70Var, 0.0f, 0.0f, 0.0f, fH0, x67Var, 124895) : c70Var);
        d70 d70Var = this.g0;
        if (d70Var != null) {
            c70Var = new c70(d70Var.a, d70Var.b, x67Var);
        }
        kx4 kx4VarK = w39.k(u15.f(kx4VarY.y(c70Var), j, x67Var), x67Var);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = new zx6((byte) 24);
            lp2Var.g0(objK);
        }
        kx4 kx4VarA = v07.a(kx4VarK, false, (gn2) objK);
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = uf1.c;
            lp2Var.g0(objK2);
        }
        kx4 kx4VarA2 = yy7.a(kx4VarA, dn8Var, (PointerInputEventHandler) objK2);
        xr4 xr4VarC = g80.c(pz2.Z, true);
        int I = km4.I(lp2Var);
        kl5 kl5VarL = lp2Var.l();
        kx4 kx4VarQ = w45.Q(lp2Var, kx4VarA2);
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
        this.i0.K(lp2Var, 0);
        lp2Var.p(true);
        return dn8Var;
    }
}

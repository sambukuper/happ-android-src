package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ yc7(xt2 xt2Var, float f, s86 s86Var, df dfVar) {
        this.X = (byte) 2;
        this.Z = xt2Var;
        this.Y = f;
        this.f0 = s86Var;
        this.g0 = dfVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        float fA;
        sm0 sm0Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        float f = this.Y;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                ba6 ba6Var = (ba6) obj4;
                xx6 xx6Var = (xx6) obj3;
                gn2 gn2Var = (gn2) obj2;
                ok okVar = (ok) obj;
                float fAbs = Math.abs(((Number) okVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                rh5 rh5Var = okVar.e;
                if (fAbs < fAbs2) {
                    u70.u(okVar, xx6Var, gn2Var, ((Number) rh5Var.getValue()).floatValue() - ba6Var.X);
                    ba6Var.X = ((Number) rh5Var.getValue()).floatValue();
                } else {
                    float fA2 = u70.A(((Number) rh5Var.getValue()).floatValue(), f);
                    u70.u(okVar, xx6Var, gn2Var, fA2 - ba6Var.X);
                    okVar.a();
                    ba6Var.X = fA2;
                }
                break;
            case 1:
                ba6 ba6Var2 = (ba6) obj4;
                xx6 xx6Var2 = (xx6) obj3;
                gn2 gn2Var2 = (gn2) obj2;
                ok okVar2 = (ok) obj;
                float fA3 = u70.A(((Number) okVar2.e.getValue()).floatValue(), f);
                float f2 = fA3 - ba6Var2.X;
                try {
                    fA = xx6Var2.a(f2);
                } catch (CancellationException unused) {
                    okVar2.a();
                    fA = 0.0f;
                }
                gn2Var2.B(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fA3 != ((Number) okVar2.e.getValue()).floatValue()) {
                    okVar2.a();
                }
                ba6Var2.X += fA;
                break;
            default:
                xt2 xt2Var = (xt2) obj4;
                s86 s86Var = (s86) obj3;
                df dfVar = (df) obj2;
                p34 p34Var = (p34) obj;
                p34Var.getClass();
                um0 um0Var = p34Var.X;
                xt2Var.e(p34Var, p34Var.getLayoutDirection(), (((long) ((int) Float.intBitsToFloat((int) (um0Var.e() >> 32)))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (um0Var.e() & 4294967295L))))), new sn((Object) p34Var, (Object) p34Var.Y, (Object) new vj2(p34Var, (byte) 5), (byte) 11));
                p34Var.a();
                o60 o60Var = new o60(f, f);
                zt2 zt2Var = xt2Var.a;
                if (!dh3.f(zt2Var.e(), o60Var)) {
                    zt2Var.E(o60Var);
                }
                sm0 sm0VarK = um0Var.Y.k();
                sm0VarK.r(u70.n(0L, um0Var.e()), u15.c());
                i21.v(p34Var, xt2Var);
                if (s86Var != null) {
                    sm0Var = sm0VarK;
                    sm0Var.j(s86Var.a, s86Var.b, s86Var.c, s86Var.d, dfVar);
                } else {
                    sm0Var = sm0VarK;
                }
                sm0Var.p();
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ yc7(float f, ba6 ba6Var, xx6 xx6Var, gn2 gn2Var, byte b) {
        this.X = b;
        this.Y = f;
        this.Z = ba6Var;
        this.f0 = xx6Var;
        this.g0 = gn2Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n30 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ r68 Y;

    public /* synthetic */ n30(r68 r68Var, byte b) {
        this.X = b;
        this.Y = r68Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        y24 y24VarQ;
        s86 s86Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        r68 r68Var = this.Y;
        switch (b) {
            case 0:
                return Boolean.valueOf(r68Var.j(false).a);
            case 1:
                return r68Var.p(true, false);
            case 2:
                return r68Var.p(false, false);
            case 3:
                rh5 rh5Var = r68Var.s;
                kd8 kd8Var = r68Var.a;
                boolean zB = f88.b(kd8Var.d().f0);
                if (((zB && ((s88) rh5Var.getValue()) == s88.Y) || (!zB && ((s88) rh5Var.getValue()) == s88.Z)) && r68Var.l() == null && ((Boolean) r68Var.k.getValue()).booleanValue() && (y24VarQ = r68Var.q()) != null) {
                    s86 s86VarO0 = zc1.o0(y24VarQ);
                    s86 s86VarN = u70.n(y24VarQ.I(s86VarO0.f()), s86VarO0.e());
                    y24 y24VarQ2 = r68Var.q();
                    if (y24VarQ2 != null) {
                        long j = kd8Var.d().f0;
                        if (f88.b(j)) {
                            s86 s86VarK = r68Var.k();
                            s86Var = u70.n(y24VarQ2.I(s86VarK.f()), s86VarK.e());
                        } else {
                            long jI = y24VarQ2.I(r68Var.o(true));
                            long jI2 = y24VarQ2.I(r68Var.o(false));
                            x78 x78VarC = r68Var.b.c();
                            if (x78VarC == null) {
                                s86Var = s86.e;
                            } else {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (y24VarQ2.I((((long) Float.floatToRawIntBits(x78VarC.c((int) (j >> 32)).b)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (y24VarQ2.I((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(x78VarC.c((int) (j & 4294967295L)).b)) & 4294967295L)) & 4294967295L));
                                int i = (int) (jI >> 32);
                                int i2 = (int) (jI2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                float fMax = Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                if (fMin == fMax) {
                                    fMax += 1.0f;
                                }
                                s86Var = new s86(fMin, Math.min(fIntBitsToFloat, fIntBitsToFloat2), fMax, Math.max(Float.intBitsToFloat((int) (jI & 4294967295L)), Float.intBitsToFloat((int) (jI2 & 4294967295L))));
                            }
                        }
                        if (s86Var.i(s86VarN)) {
                            return s86Var.g(s86VarN);
                        }
                    } else {
                        zc3.d("textLayoutCoordinates should not be null.");
                        b61.n();
                    }
                }
                return null;
            case 4:
                return (s86) r68Var.x.getValue();
            case 5:
                return r68Var.a.d();
            case 6:
                r68Var.b();
                return dn8Var;
            case 7:
                return Boolean.valueOf(!((Boolean) r68Var.t.getValue()).booleanValue());
            case 8:
                kd8 kd8Var2 = r68Var.a;
                y68 y68Var = kd8Var2.a;
                de3 de3Var = kd8Var2.b;
                y68Var.b.a().A();
                g48 g48Var = y68Var.b;
                mn7.g(g48Var, 0, g48Var.Z.length());
                y68Var.b(de3Var, true, e58.X);
                y68Var.f(true);
                y68Var.e(y68Var.b.g0);
                return dn8Var;
            default:
                dn2 dn2Var = r68Var.l;
                if (dn2Var != null) {
                    dn2Var.invoke();
                }
                return dn8Var;
        }
    }
}

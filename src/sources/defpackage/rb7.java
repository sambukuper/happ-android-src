package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wb7 Y;

    public /* synthetic */ rb7(wb7 wb7Var, byte b) {
        this.X = b;
        this.Y = wb7Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Throwable {
        int i;
        byte b = this.X;
        boolean z = false;
        dn8 dn8Var = dn8.a;
        wb7 wb7Var = this.Y;
        switch (b) {
            case 0:
                pf3 pf3Var = (pf3) obj;
                wb7Var.l0.m((int) (pf3Var.a >> 32));
                wb7Var.m0.m((int) (pf3Var.a & 4294967295L));
                return dn8Var;
            case 1:
                f17 f17Var = (f17) obj;
                String strValueOf = String.valueOf(nr4.O(wb7Var.Z.l() * 100.0f) / 100.0f);
                nw3[] nw3VarArr = d17.a;
                e17 e17Var = c17.b;
                nw3 nw3Var = d17.a[0];
                e17Var.getClass();
                f17Var.a(e17Var, strValueOf);
                f17Var.a(s07.i, new q3(null, new rb7(wb7Var, (byte) 2)));
                return dn8Var;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                uu0 uu0Var = wb7Var.Y;
                nh5 nh5Var = wb7Var.Z;
                float f = uu0Var.X;
                float f2 = uu0Var.Y;
                float fM = x97.m(fFloatValue, f, f2);
                byte b2 = wb7Var.X;
                if (b2 > 0 && (i = b2 + 1) >= 0) {
                    float fAbs = fM;
                    float f3 = fAbs;
                    int i2 = 0;
                    while (true) {
                        float fH = w51.H(uu0Var.X, f2, i2 / i);
                        float f4 = fH - fM;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fH;
                        }
                        if (i2 != i) {
                            i2++;
                        } else {
                            fM = f3;
                        }
                    }
                }
                if (fM != nh5Var.l()) {
                    if (fM != nh5Var.l()) {
                        gn2 gn2Var = wb7Var.f0;
                        if (gn2Var != null) {
                            gn2Var.B(Float.valueOf(fM));
                        } else {
                            wb7Var.c(fM);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                wb7Var.a(0.0f);
                wb7Var.p0.invoke();
                return dn8Var;
        }
    }
}

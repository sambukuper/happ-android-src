package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xt4 implements gn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ xt4(ev2 ev2Var, da6 da6Var, da6 da6Var2, r68 r68Var, boolean z) {
        this.Z = da6Var;
        this.f0 = r68Var;
        this.Y = z;
        this.g0 = ev2Var;
        this.h0 = da6Var2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        float fFloatValue;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.h0;
        Object obj3 = this.g0;
        boolean z = this.Y;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        switch (b) {
            case 0:
                rh5 rh5Var = ((b15) obj5).c;
                y05 y05Var = (y05) obj4;
                lh7 lh7Var = (lh7) obj3;
                lh7 lh7Var2 = (lh7) obj2;
                pk6 pk6Var = (pk6) obj;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) rh5Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) lh7Var.getValue()).floatValue();
                }
                pk6Var.g(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) lh7Var.getValue()).floatValue();
                } else if (((Boolean) rh5Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                pk6Var.h(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) lh7Var2.getValue()).floatValue();
                } else if (!((Boolean) rh5Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                pk6Var.b(fFloatValue3);
                pk6Var.m(((gd8) y05Var.getValue()).a);
                break;
            default:
                r68 r68Var = (r68) obj4;
                long jA = n07.a(r68Var.o(z));
                ((da6) obj5).X = jA;
                r68Var.B((ev2) obj3, jA);
                ((da6) obj2).X = 0L;
                r68Var.v = -1;
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ xt4(boolean z, b15 b15Var, y05 y05Var, yd8 yd8Var, yd8 yd8Var2) {
        this.Y = z;
        this.Z = b15Var;
        this.f0 = y05Var;
        this.g0 = yd8Var;
        this.h0 = yd8Var2;
    }
}

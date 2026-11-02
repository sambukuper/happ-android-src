package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ oi Y;

    public /* synthetic */ vv2(oi oiVar, byte b) {
        this.X = b;
        this.Y = oiVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        oi oiVar = this.Y;
        pk6 pk6Var = (pk6) obj;
        switch (b) {
            case 0:
                pk6Var.getClass();
                pk6Var.b(((Number) oiVar.d()).floatValue());
                break;
            case 1:
                pk6Var.getClass();
                pk6Var.o((1.0f - ((Number) oiVar.d()).floatValue()) * Float.intBitsToFloat((int) (pk6Var.t0 & 4294967295L)));
                break;
            default:
                float fFloatValue = ((Number) oiVar.d()).floatValue();
                float fD = zw4.d(pk6Var, fFloatValue);
                float fE = zw4.e(pk6Var, fFloatValue);
                pk6Var.h(fE != 0.0f ? fD / fE : 1.0f);
                pk6Var.m(zw4.a);
                break;
        }
        return dn8Var;
    }
}

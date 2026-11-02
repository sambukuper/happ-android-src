package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t70 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ o87 Y;

    public /* synthetic */ t70(o87 o87Var, byte b) {
        this.X = b;
        this.Y = o87Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        o87 o87Var = this.Y;
        pk6 pk6Var = (pk6) obj;
        switch (b) {
            case 0:
                t5 t5Var = o87Var.d;
                float fL = ((nh5) t5Var.k0).l();
                float fC = t5Var.d().c();
                float f = fL < fC ? fC - fL : 0.0f;
                pk6Var.h(f > 0.0f ? (Float.intBitsToFloat((int) (pk6Var.t0 & 4294967295L)) + f) / Float.intBitsToFloat((int) (pk6Var.t0 & 4294967295L)) : 1.0f);
                pk6Var.m(pn7.h(0.5f, 0.0f));
                break;
            default:
                t5 t5Var2 = o87Var.d;
                float fL2 = ((nh5) t5Var2.k0).l();
                float fC2 = t5Var2.d().c();
                float f2 = fL2 < fC2 ? fC2 - fL2 : 0.0f;
                pk6Var.h(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (pk6Var.t0 & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & pk6Var.t0))) : 1.0f);
                pk6Var.m(pn7.h(0.5f, 0.0f));
                break;
        }
        return dn8Var;
    }
}

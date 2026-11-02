package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j9 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ha Y;
    public final /* synthetic */ ba6 Z;

    public /* synthetic */ j9(ha haVar, ba6 ba6Var, byte b) {
        this.X = b;
        this.Y = haVar;
        this.Z = ba6Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ba6 ba6Var = this.Z;
        ha haVar = this.Y;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                t5 t5Var = haVar.a;
                ((nh5) t5Var.k0).m(fFloatValue);
                ((nh5) t5Var.l0).m(fFloatValue2);
                ba6Var.X = fFloatValue;
                break;
            default:
                t5 t5Var2 = haVar.a;
                ((nh5) t5Var2.k0).m(fFloatValue);
                ((nh5) t5Var2.l0).m(fFloatValue2);
                ba6Var.X = fFloatValue;
                break;
        }
        return dn8Var;
    }
}

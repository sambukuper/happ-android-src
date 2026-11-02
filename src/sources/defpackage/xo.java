package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ dn2 Y;

    public /* synthetic */ xo(dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = dn2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        dn2 dn2Var = this.Y;
        switch (b) {
            case 0:
                ((pk6) obj).b(((Number) dn2Var.invoke()).floatValue());
                return dn8Var;
            case 1:
                dn2Var.invoke();
                return dn8Var;
            case 2:
                dn2Var.invoke();
                return dn8Var;
            case 3:
                dn2Var.invoke();
                return dn8Var;
            case 4:
                f17 f17Var = (f17) obj;
                Object objInvoke = dn2Var.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                qw5 qw5Var = new qw5(f != null ? f.floatValue() : 0.0f, 0, new uu0(0.0f, 1.0f));
                nw3[] nw3VarArr = d17.a;
                e17 e17Var = c17.c;
                nw3 nw3Var = d17.a[1];
                e17Var.getClass();
                f17Var.a(e17Var, qw5Var);
                return dn8Var;
            case 5:
                obj.getClass();
                return dn2Var.invoke();
            default:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) dn2Var.invoke()).floatValue());
        }
    }
}

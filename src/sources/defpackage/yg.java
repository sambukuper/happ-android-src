package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ch Y;
    public final /* synthetic */ h38 Z;

    public /* synthetic */ yg(ch chVar, h38 h38Var, byte b) {
        this.X = b;
        this.Y = chVar;
        this.Z = h38Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        byte b2 = 3;
        h38 h38Var = this.Z;
        ch chVar = this.Y;
        switch (b) {
            case 0:
                xg xgVar = chVar.f;
                o7 o7Var = new o7((Object) h38Var, (byte) 4);
                ea6 ea6Var = new ea6();
                chVar.e.c("dataBuilder", xgVar, new p5(ea6Var, o7Var, b2));
                Object obj = ea6Var.X;
                if (obj != null) {
                    return (g38) obj;
                }
                dh3.T("result");
                throw null;
            case 1:
                xg xgVar2 = chVar.g;
                yg ygVar = new yg(chVar, h38Var, (byte) 2);
                ea6 ea6Var2 = new ea6();
                chVar.e.c("positioner", xgVar2, new p5(ea6Var2, ygVar, b2));
                Object obj2 = ea6Var2.X;
                if (obj2 != null) {
                    return (s86) obj2;
                }
                dh3.T("result");
                throw null;
            default:
                Object objInvoke = chVar.c.invoke();
                y24 y24Var = (y24) (((y24) objInvoke).g() ? objInvoke : null);
                return y24Var == null ? s86.e : h38Var.m(y24Var).k(y24Var.I(0L));
        }
    }
}

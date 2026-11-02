package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ la Y;

    public /* synthetic */ ba(la laVar, byte b) {
        this.X = b;
        this.Y = laVar;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        la laVar = this.Y;
        switch (b) {
            case 0:
                Object value = laVar.h.getValue();
                if (value != null) {
                    return value;
                }
                float fL = laVar.f.l();
                rh5 rh5Var = laVar.c;
                if (Float.isNaN(fL)) {
                    return rh5Var.getValue();
                }
                float fC = laVar.b().c(rh5Var.getValue());
                if (Float.isNaN(fC) || fL == fC) {
                    return rh5Var.getValue();
                }
                Object objA = laVar.b().a(fL);
                return objA == null ? rh5Var.getValue() : objA;
            case 1:
                return laVar.b();
            default:
                return new qg5(laVar.b(), laVar.e.getValue());
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ t5 Y;

    public /* synthetic */ aa(t5 t5Var, byte b) {
        this.X = b;
        this.Y = t5Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        t5 t5Var = this.Y;
        switch (b) {
            case 0:
                Object value = ((rh5) t5Var.m0).getValue();
                if (value != null) {
                    return value;
                }
                float fL = ((nh5) t5Var.k0).l();
                boolean zIsNaN = Float.isNaN(fL);
                rh5 rh5Var = (rh5) t5Var.i0;
                return !zIsNaN ? t5Var.c(fL, 0.0f, rh5Var.getValue()) : rh5Var.getValue();
            case 1:
                Object value2 = ((rh5) t5Var.m0).getValue();
                if (value2 != null) {
                    return value2;
                }
                float fL2 = ((nh5) t5Var.k0).l();
                boolean zIsNaN2 = Float.isNaN(fL2);
                rh5 rh5Var2 = (rh5) t5Var.i0;
                if (zIsNaN2) {
                    return rh5Var2.getValue();
                }
                Object value3 = rh5Var2.getValue();
                lp4 lp4VarD = t5Var.d();
                float fD = lp4VarD.d(value3);
                if (fD != fL2 && !Float.isNaN(fD)) {
                    if (fD < fL2) {
                        Object objB = lp4VarD.b(fL2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = lp4VarD.b(fL2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case 2:
                return t5Var.d();
            default:
                return new qg5(t5Var.d(), ((zi1) t5Var.j0).getValue());
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cy2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ lh7 Y;

    public /* synthetic */ cy2(yd8 yd8Var, byte b) {
        this.X = b;
        this.Y = yd8Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        lh7 lh7Var = this.Y;
        switch (b) {
            case 0:
                return Float.valueOf(((Number) lh7Var.getValue()).floatValue());
            case 1:
                return Boolean.valueOf(((Number) lh7Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) lh7Var.getValue()).floatValue() > 0.0f);
        }
    }
}

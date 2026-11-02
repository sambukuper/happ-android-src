package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a95 extends oy1 {
    public final bq4 I0;
    public final float J0;

    public a95(bq4 bq4Var, float f) {
        super((byte) 0);
        this.I0 = bq4Var;
        this.J0 = f;
    }

    @Override // defpackage.oy1
    public final boolean w() {
        return true;
    }

    @Override // defpackage.oy1
    public final void x(float f, float f2, float f3, l77 l77Var) {
        this.I0.x(f, f2 - this.J0, f3, l77Var);
    }
}

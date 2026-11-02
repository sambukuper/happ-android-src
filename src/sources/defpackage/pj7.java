package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pj7 implements w80 {
    public final dn2 b;
    public final w80 c;

    public pj7(dn2 dn2Var, z24 z24Var, w80 w80Var) {
        this.b = dn2Var;
        this.c = w80Var;
    }

    @Override // defpackage.w80
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.invoke()).intValue();
        return this.c.a(f - fIntValue, f2, f3 - fIntValue);
    }
}

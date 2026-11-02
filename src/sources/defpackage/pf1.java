package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pf1 implements xx6 {
    public final /* synthetic */ fu6 a;

    public pf1(fu6 fu6Var) {
        this.a = fu6Var;
    }

    @Override // defpackage.xx6
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        fu6 fu6Var = this.a;
        float fFloatValue = ((Number) ((gn2) fu6Var.Y).B(Float.valueOf(f))).floatValue();
        ((rh5) fu6Var.h0).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((rh5) fu6Var.i0).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

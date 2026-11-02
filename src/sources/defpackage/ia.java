package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ia {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ la d;

    public ia(la laVar) {
        this.d = laVar;
    }

    public final void a(float f, float f2) {
        la laVar = this.d;
        rh5 rh5Var = laVar.c;
        nh5 nh5Var = laVar.f;
        float fL = nh5Var.l();
        nh5Var.m(f);
        laVar.g.m(f2);
        if (Float.isNaN(fL)) {
            return;
        }
        boolean z = f >= fL;
        if (nh5Var.l() == laVar.b().c(rh5Var.getValue())) {
            Object objB = laVar.b().b(nh5Var.l() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = rh5Var.getValue();
            }
            if (z) {
                this.a = rh5Var.getValue();
                this.b = objB;
            } else {
                this.a = objB;
                this.b = rh5Var.getValue();
            }
        } else {
            Object objB2 = laVar.b().b(nh5Var.l(), false);
            if (objB2 == null) {
                objB2 = rh5Var.getValue();
            }
            Object objB3 = laVar.b().b(nh5Var.l(), true);
            if (objB3 == null) {
                objB3 = rh5Var.getValue();
            }
            this.a = objB2;
            this.b = objB3;
        }
        ke1 ke1VarB = laVar.b();
        Object obj = this.a;
        obj.getClass();
        float fC = ke1VarB.c(obj);
        ke1 ke1VarB2 = laVar.b();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(fC - ke1VarB2.c(obj2));
        if (Math.abs(nh5Var.l() - laVar.b().c(rh5Var.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.a;
            if (value == null) {
                value = rh5Var.getValue();
            }
            rh5Var.setValue(value);
        }
    }
}

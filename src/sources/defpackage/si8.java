package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class si8 extends ri8 {
    public final vh8 a;
    public final d50 b;

    public si8(vh8 vh8Var, d50 d50Var) {
        this.a = vh8Var;
        this.b = d50Var;
    }

    @Override // defpackage.ri8
    public z76 e(ro3 ro3Var, z76 z76Var) {
        Object objB = z76Var.g0;
        if (objB == null) {
            Object obj = z76Var.Z;
            Class cls = (Class) z76Var.f0;
            vh8 vh8Var = this.a;
            objB = cls == null ? vh8Var.b(obj) : vh8Var.c(cls, obj);
            z76Var.g0 = objB;
        }
        if (objB != null) {
            ro3Var.e1(z76Var);
            return z76Var;
        }
        gr3 gr3Var = (gr3) z76Var.i0;
        z76Var.Y = false;
        if (gr3Var == gr3.START_OBJECT) {
            ro3Var.a1(z76Var.Z);
            return z76Var;
        }
        if (gr3Var == gr3.START_ARRAY) {
            ro3Var.J0(z76Var.Z);
        }
        return z76Var;
    }
}

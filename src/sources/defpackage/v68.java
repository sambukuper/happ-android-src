package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v68 {
    public z24 a;
    public fi1 b;
    public fi2 c;
    public o88 d;
    public Object e;
    public final rh5 f = z51.H(Boolean.TRUE);
    public long g = 0;

    public v68(z24 z24Var, fi1 fi1Var, fi2 fi2Var, o88 o88Var, Object obj) {
        this.a = z24Var;
        this.b = fi1Var;
        this.c = fi2Var;
        this.d = o88Var;
        this.e = obj;
    }

    public static void a(v68 v68Var, z24 z24Var, fi1 fi1Var, o88 o88Var, int i) {
        if ((i & 1) != 0) {
            z24Var = v68Var.a;
        }
        if ((i & 2) != 0) {
            fi1Var = v68Var.b;
        }
        fi2 fi2Var = v68Var.c;
        if ((i & 8) != 0) {
            o88Var = v68Var.d;
        }
        Object obj = v68Var.e;
        z24 z24Var2 = v68Var.a;
        rh5 rh5Var = v68Var.f;
        if (z24Var == z24Var2 && dh3.f(fi1Var, v68Var.b) && dh3.f(fi2Var, v68Var.c) && dh3.f(o88Var, v68Var.d)) {
            if (dh3.f(obj, v68Var.e)) {
                return;
            }
            v68Var.e = obj;
            rh5Var.setValue(Boolean.TRUE);
            return;
        }
        v68Var.a = z24Var;
        v68Var.b = fi1Var;
        v68Var.c = fi2Var;
        v68Var.d = o88Var;
        rh5Var.setValue(Boolean.TRUE);
    }
}

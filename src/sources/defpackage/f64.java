package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f64 {
    public final iv6 a;
    public final eh b;
    public final s05 c;

    public f64(iv6 iv6Var, eh ehVar) {
        this.a = iv6Var;
        this.b = ehVar;
        long[] jArr = uw6.a;
        this.c = new s05();
    }

    public final rn2 a(int i, Object obj, Object obj2) {
        s05 s05Var = this.c;
        e64 e64Var = (e64) s05Var.g(obj);
        byte b = 17;
        if (e64Var != null && e64Var.c == i && dh3.f(e64Var.b, obj2)) {
            zy0 zy0Var = e64Var.d;
            if (zy0Var != null) {
                return zy0Var;
            }
            zy0 zy0Var2 = new zy0(818252804, true, new i9(e64Var.e, e64Var, b));
            e64Var.d = zy0Var2;
            return zy0Var2;
        }
        e64 e64Var2 = new e64(this, i, obj, obj2);
        s05Var.l(obj, e64Var2);
        zy0 zy0Var3 = e64Var2.d;
        if (zy0Var3 != null) {
            return zy0Var3;
        }
        zy0 zy0Var4 = new zy0(818252804, true, new i9(this, e64Var2, b));
        e64Var2.d = zy0Var4;
        return zy0Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        e64 e64Var = (e64) this.c.g(obj);
        if (e64Var != null) {
            return e64Var.b;
        }
        z64 z64Var = (z64) this.b.invoke();
        int iE = z64Var.d.e(obj);
        if (iE != -1) {
            return z64Var.b(iE);
        }
        return null;
    }
}

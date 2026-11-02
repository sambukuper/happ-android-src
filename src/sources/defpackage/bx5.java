package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bx5 {
    public final yv3 a;
    public final String b;

    public bx5(yv3 yv3Var, String str) {
        yv3Var.getClass();
        str.getClass();
        this.a = yv3Var;
        this.b = str;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        bt.i(oi0.p(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }

    public final Object b(Object obj, Object obj2) {
        yv3 yv3Var = this.a;
        Object obj3 = yv3Var.get(obj);
        if (obj3 == null) {
            yv3Var.H(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }
}

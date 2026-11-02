package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xu {
    public static final xu a = new xu();

    public final boolean a(Object obj, v63 v63Var) {
        if (this == v63Var) {
            return true;
        }
        if (!(obj instanceof v63)) {
            return obj.equals(v63Var);
        }
        v63 v63Var2 = (v63) obj;
        return dh3.f(v63Var2.a, v63Var.a) && v63Var2.b.equals(v63Var.b) && v63Var2.d.equals(v63Var.d) && dh3.f(v63Var2.o, v63Var.o) && v63Var2.p == v63Var.p && v63Var2.q == v63Var.q;
    }

    public final int b(Object obj) {
        if (!(obj instanceof v63)) {
            return obj.hashCode();
        }
        v63 v63Var = (v63) obj;
        return v63Var.q.hashCode() + ((v63Var.p.hashCode() + ((v63Var.o.hashCode() + ((v63Var.d.hashCode() + ((v63Var.b.hashCode() + (v63Var.a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}

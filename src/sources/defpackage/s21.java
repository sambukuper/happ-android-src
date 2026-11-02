package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s21 {
    public final Object a;

    public s21(Object obj) {
        this.a = obj;
    }

    public t14 a(vx4 vx4Var) {
        vx4Var.getClass();
        return ((gm) this.a).c();
    }

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        s21 s21Var = obj instanceof s21 ? (s21) obj : null;
        return dh3.f(objB, s21Var != null ? s21Var.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}

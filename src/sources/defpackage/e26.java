package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e26 {
    public final Class a;
    public final Class b;

    public e26(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static e26 a(Class cls) {
        return new e26(d26.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e26.class != obj.getClass()) {
            return false;
        }
        e26 e26Var = (e26) obj;
        if (this.b.equals(e26Var.b)) {
            return this.a.equals(e26Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == d26.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}

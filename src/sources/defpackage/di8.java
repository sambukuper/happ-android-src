package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class di8 {
    public final int a;
    public final Class b;
    public final dh8 c;
    public final boolean d;

    public di8(Class cls, boolean z) {
        this.b = cls;
        this.c = null;
        this.d = z;
        this.a = z ? cls.getName().hashCode() + 1 : cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != di8.class) {
            return false;
        }
        di8 di8Var = (di8) obj;
        if (di8Var.d != this.d) {
            return false;
        }
        Class cls = this.b;
        if (cls != null) {
            return di8Var.b == cls;
        }
        return this.c.equals(di8Var.c);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.d;
        Class cls = this.b;
        if (cls != null) {
            return "{class: " + cls.getName() + ", typed? " + z + "}";
        }
        return "{type: " + this.c + ", typed? " + z + "}";
    }

    public di8(dh8 dh8Var) {
        this.c = dh8Var;
        this.b = null;
        this.d = false;
        this.a = dh8Var.hashCode() - 1;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g39 {
    public final Object a;
    public final boolean b;

    public g39(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public static g39 a(g39 g39Var, Object obj, boolean z, int i) {
        if ((i & 1) != 0) {
            obj = g39Var.a;
        }
        if ((i & 2) != 0) {
            z = g39Var.b;
        }
        g39Var.getClass();
        return new g39(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g39)) {
            return false;
        }
        g39 g39Var = (g39) obj;
        return dh3.f(this.a, g39Var.a) && this.b == g39Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "WithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }
}

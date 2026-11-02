package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gl5 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public gl5(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gl5.class != obj.getClass()) {
            return false;
        }
        gl5 gl5Var = (gl5) obj;
        if (this.b == gl5Var.b && this.c == gl5Var.c) {
            return this.a.equals(gl5Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        return "Permission{name='" + this.a + "', granted=" + this.b + ", shouldShowRequestPermissionRationale=" + this.c + '}';
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uw3 {
    public static final uw3 c = new uw3(null, null);
    public final yw3 a;
    public final pw3 b;

    public uw3(pw3 pw3Var, yw3 yw3Var) {
        String str;
        this.a = yw3Var;
        this.b = pw3Var;
        if ((yw3Var == null) == (pw3Var == null)) {
            return;
        }
        if (yw3Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + yw3Var + " requires type to be specified.";
        }
        em7.c(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw3)) {
            return false;
        }
        uw3 uw3Var = (uw3) obj;
        return this.a == uw3Var.a && dh3.f(this.b, uw3Var.b);
    }

    public final int hashCode() {
        yw3 yw3Var = this.a;
        int iHashCode = (yw3Var == null ? 0 : yw3Var.hashCode()) * 31;
        pw3 pw3Var = this.b;
        return iHashCode + (pw3Var != null ? pw3Var.hashCode() : 0);
    }

    public final String toString() {
        yw3 yw3Var = this.a;
        int i = yw3Var == null ? -1 : tw3.a[yw3Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        pw3 pw3Var = this.b;
        if (i == 1) {
            return String.valueOf(pw3Var);
        }
        if (i == 2) {
            return "in " + pw3Var;
        }
        if (i != 3) {
            b61.c();
            return null;
        }
        return "out " + pw3Var;
    }
}

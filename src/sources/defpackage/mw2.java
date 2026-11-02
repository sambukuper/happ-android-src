package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mw2 {
    public final String a;
    public final g73 b;
    public final dn2 c;

    public mw2(String str, g73 g73Var, dn2 dn2Var) {
        str.getClass();
        dn2Var.getClass();
        this.a = str;
        this.b = g73Var;
        this.c = dn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw2)) {
            return false;
        }
        mw2 mw2Var = (mw2) obj;
        return dh3.f(this.a, mw2Var.a) && dh3.f(this.b, mw2Var.b) && dh3.f(this.c, mw2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g73 g73Var = this.b;
        return this.c.hashCode() + ((iHashCode + (g73Var == null ? 0 : g73Var.hashCode())) * 31);
    }

    public final String toString() {
        return "HappDropdownMenuItem(text=" + this.a + ", icon=" + this.b + ", onClick=" + this.c + ")";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 {
    public final w15 a;
    public final fy5 b;
    public final s50 c;
    public final ke7 d;

    public hs0(w15 w15Var, fy5 fy5Var, s50 s50Var, ke7 ke7Var) {
        w15Var.getClass();
        fy5Var.getClass();
        ke7Var.getClass();
        this.a = w15Var;
        this.b = fy5Var;
        this.c = s50Var;
        this.d = ke7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs0)) {
            return false;
        }
        hs0 hs0Var = (hs0) obj;
        return dh3.f(this.a, hs0Var.a) && dh3.f(this.b, hs0Var.b) && this.c.equals(hs0Var.c) && dh3.f(this.d, hs0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sc6 extends g33 {
    public final g33 f;
    public final int g;

    public sc6(g33 g33Var, int i) {
        this.f = g33Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sc6)) {
            return false;
        }
        sc6 sc6Var = (sc6) obj;
        return sc6Var.f.equals(this.f) && sc6Var.g == this.g;
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.g * 31);
    }
}

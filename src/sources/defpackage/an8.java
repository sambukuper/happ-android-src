package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class an8 implements v09 {
    public final v09 a;
    public final v09 b;

    public an8(v09 v09Var, v09 v09Var2) {
        this.a = v09Var;
        this.b = v09Var2;
    }

    @Override // defpackage.v09
    public final int a(fi1 fi1Var) {
        return Math.max(this.a.a(fi1Var), this.b.a(fi1Var));
    }

    @Override // defpackage.v09
    public final int b(fi1 fi1Var, z24 z24Var) {
        return Math.max(this.a.b(fi1Var, z24Var), this.b.b(fi1Var, z24Var));
    }

    @Override // defpackage.v09
    public final int c(fi1 fi1Var) {
        return Math.max(this.a.c(fi1Var), this.b.c(fi1Var));
    }

    @Override // defpackage.v09
    public final int d(fi1 fi1Var, z24 z24Var) {
        return Math.max(this.a.d(fi1Var, z24Var), this.b.d(fi1Var, z24Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an8)) {
            return false;
        }
        an8 an8Var = (an8) obj;
        return dh3.f(an8Var.a, this.a) && dh3.f(an8Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}

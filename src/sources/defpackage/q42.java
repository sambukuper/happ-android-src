package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q42 implements v09 {
    public final v09 a;
    public final v09 b;

    public q42(v09 v09Var, v09 v09Var2) {
        this.a = v09Var;
        this.b = v09Var2;
    }

    @Override // defpackage.v09
    public final int a(fi1 fi1Var) {
        int iA = this.a.a(fi1Var) - this.b.a(fi1Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.v09
    public final int b(fi1 fi1Var, z24 z24Var) {
        int iB = this.a.b(fi1Var, z24Var) - this.b.b(fi1Var, z24Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.v09
    public final int c(fi1 fi1Var) {
        int iC = this.a.c(fi1Var) - this.b.c(fi1Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.v09
    public final int d(fi1 fi1Var, z24 z24Var) {
        int iD = this.a.d(fi1Var, z24Var) - this.b.d(fi1Var, z24Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q42)) {
            return false;
        }
        q42 q42Var = (q42) obj;
        return dh3.f(q42Var.a, this.a) && dh3.f(q42Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}

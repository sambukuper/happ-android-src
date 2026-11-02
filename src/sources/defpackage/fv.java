package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fv {
    public final v63 a;
    public final xu b;
    public final v76 c;

    public fv(xu xuVar, v63 v63Var, v76 v76Var) {
        this.a = v63Var;
        this.b = xuVar;
        this.c = v76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        xu xuVar = fvVar.b;
        xu xuVar2 = this.b;
        return dh3.f(xuVar2, xuVar) && xuVar2.a(this.a, fvVar.a) && this.c == fvVar.c;
    }

    public final int hashCode() {
        xu xuVar = this.b;
        return this.c.hashCode() + ((xuVar.b(this.a) + (xuVar.hashCode() * 31)) * 31);
    }
}

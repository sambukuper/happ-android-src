package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s28 {
    public final ql a;
    public ql b;
    public boolean c = false;
    public ez4 d = null;

    public s28(ql qlVar, ql qlVar2) {
        this.a = qlVar;
        this.b = qlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s28)) {
            return false;
        }
        s28 s28Var = (s28) obj;
        return dh3.f(this.a, s28Var.a) && dh3.f(this.b, s28Var.b) && this.c == s28Var.c && dh3.f(this.d, s28Var.d);
    }

    public final int hashCode() {
        int iF = pc6.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ez4 ez4Var = this.d;
        return iF + (ez4Var == null ? 0 : ez4Var.hashCode());
    }

    public final String toString() {
        ql qlVar = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) qlVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d83 implements i86 {
    public final sx4 X;

    public d83(sx4 sx4Var) {
        this.X = sx4Var;
    }

    @Override // defpackage.i86
    public final t14 c() {
        aa7 aa7VarX = this.X.X();
        aa7VarX.getClass();
        return aa7VarX;
    }

    public final boolean equals(Object obj) {
        d83 d83Var = obj instanceof d83 ? (d83) obj : null;
        return this.X.equals(d83Var != null ? d83Var.X : null);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        aa7 aa7VarX = this.X.X();
        aa7VarX.getClass();
        sb.append(aa7VarX);
        sb.append('}');
        return sb.toString();
    }
}

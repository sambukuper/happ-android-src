package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uq6 {
    public float a = 0.0f;
    public boolean b = true;
    public p71 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq6)) {
            return false;
        }
        uq6 uq6Var = (uq6) obj;
        return Float.compare(this.a, uq6Var.a) == 0 && this.b == uq6Var.b && dh3.f(this.c, uq6Var.c);
    }

    public final int hashCode() {
        int iF = pc6.f(Float.hashCode(this.a) * 31, 31, this.b);
        p71 p71Var = this.c;
        return (iF + (p71Var == null ? 0 : p71Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oa4 extends pa4 {
    public final String a;
    public final c88 b;

    public oa4(String str, c88 c88Var) {
        this.a = str;
        this.b = c88Var;
    }

    @Override // defpackage.pa4
    public final c88 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa4)) {
            return false;
        }
        oa4 oa4Var = (oa4) obj;
        return dh3.f(this.a, oa4Var.a) && dh3.f(this.b, oa4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c88 c88Var = this.b;
        return (iHashCode + (c88Var != null ? c88Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return pc6.p("LinkAnnotation.Url(url=", this.a, ")");
    }
}

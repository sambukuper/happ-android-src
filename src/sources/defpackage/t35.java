package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t35 {
    public final String a;
    public final String b;
    public final q35 c;
    public final s72 d;

    public t35(String str, String str2, q35 q35Var, s72 s72Var) {
        this.a = str;
        this.b = str2;
        this.c = q35Var;
        this.d = s72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t35)) {
            return false;
        }
        t35 t35Var = (t35) obj;
        return this.a.equals(t35Var.a) && dh3.f(this.b, t35Var.b) && this.c.equals(t35Var.c) && dh3.f(this.d, t35Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + pc6.e(this.a.hashCode() * 31, 31, this.b)) * 961);
    }

    public final String toString() {
        StringBuilder sbT = oi0.t("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbT.append(this.c);
        sbT.append(", body=null, extras=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}

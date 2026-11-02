package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c88 {
    public final qe7 a;
    public final qe7 b;
    public final qe7 c;
    public final qe7 d;

    public c88(qe7 qe7Var, qe7 qe7Var2, qe7 qe7Var3, qe7 qe7Var4) {
        this.a = qe7Var;
        this.b = qe7Var2;
        this.c = qe7Var3;
        this.d = qe7Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c88)) {
            return false;
        }
        c88 c88Var = (c88) obj;
        return dh3.f(this.a, c88Var.a) && dh3.f(this.b, c88Var.b) && dh3.f(this.c, c88Var.c) && dh3.f(this.d, c88Var.d);
    }

    public final int hashCode() {
        qe7 qe7Var = this.a;
        int iHashCode = (qe7Var != null ? qe7Var.hashCode() : 0) * 31;
        qe7 qe7Var2 = this.b;
        int iHashCode2 = (iHashCode + (qe7Var2 != null ? qe7Var2.hashCode() : 0)) * 31;
        qe7 qe7Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (qe7Var3 != null ? qe7Var3.hashCode() : 0)) * 31;
        qe7 qe7Var4 = this.d;
        return iHashCode3 + (qe7Var4 != null ? qe7Var4.hashCode() : 0);
    }
}

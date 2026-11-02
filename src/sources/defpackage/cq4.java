package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cq4 {
    public final String a;
    public final kf3 b;

    public cq4(String str, kf3 kf3Var) {
        this.a = str;
        this.b = kf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq4)) {
            return false;
        }
        cq4 cq4Var = (cq4) obj;
        return this.a.equals(cq4Var.a) && this.b.equals(cq4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}

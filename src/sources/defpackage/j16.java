package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j16 implements k16 {
    public final s5 a;
    public final s15 b;

    public j16(s5 s5Var, s15 s15Var) {
        this.a = s5Var;
        this.b = s15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j16)) {
            return false;
        }
        j16 j16Var = (j16) obj;
        return this.a == j16Var.a && this.b == j16Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ", token=" + this.b + ')';
    }
}

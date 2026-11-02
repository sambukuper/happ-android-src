package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q82 implements r82 {
    public final String a;
    public final ru2 b;

    public q82(String str, ru2 ru2Var) {
        ru2Var.getClass();
        this.a = str;
        this.b = ru2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q82)) {
            return false;
        }
        q82 q82Var = (q82) obj;
        return this.a.equals(q82Var.a) && dh3.f(this.b, q82Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}

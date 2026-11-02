package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tj6 {
    public final byte a;
    public final ee b;

    /* JADX WARN: Multi-variable type inference failed */
    public tj6(int i, ee eeVar) {
        this.a = i;
        this.b = eeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj6)) {
            return false;
        }
        tj6 tj6Var = (tj6) obj;
        return this.a == tj6Var.a && dh3.f(this.b, tj6Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        ee eeVar = this.b;
        return iHashCode + (eeVar == null ? 0 : eeVar.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + ((int) this.a) + ')')) + ", frameMetadata=" + this.b + ')';
    }
}

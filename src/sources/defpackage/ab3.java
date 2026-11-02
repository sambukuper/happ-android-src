package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ab3 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final hv4 d;
    public final String e;

    public ab3(Object obj, Object obj2, hv4 hv4Var, hv4 hv4Var2, String str) {
        this.a = obj;
        this.b = obj2;
        this.c = hv4Var;
        this.d = hv4Var2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab3)) {
            return false;
        }
        ab3 ab3Var = (ab3) obj;
        return this.a.equals(ab3Var.a) && dh3.f(this.b, ab3Var.b) && dh3.f(this.c, ab3Var.c) && this.d.equals(ab3Var.d) && this.e.equals(ab3Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return oi0.o(sb, this.e, ')');
    }
}

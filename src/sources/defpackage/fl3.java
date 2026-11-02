package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fl3 {
    public static final fl3 d = new fl3(je6.STRICT, 6);
    public final je6 a;
    public final b24 b;
    public final je6 c;

    public fl3(je6 je6Var, int i) {
        this(je6Var, (i & 2) != 0 ? new b24(1, 0, 0) : null, je6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return this.a == fl3Var.a && dh3.f(this.b, fl3Var.b) && this.c == fl3Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b24 b24Var = this.b;
        return this.c.hashCode() + ((iHashCode + (b24Var == null ? 0 : b24Var.f0)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public fl3(je6 je6Var, b24 b24Var, je6 je6Var2) {
        this.a = je6Var;
        this.b = b24Var;
        this.c = je6Var2;
    }
}

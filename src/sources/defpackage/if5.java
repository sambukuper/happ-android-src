package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class if5 {
    public final long a;
    public final ig5 b;

    public if5() {
        long jE = z51.e(4284900966L);
        ig5 ig5VarD = os4.d(3);
        this.a = jE;
        this.b = ig5VarD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!if5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        if5 if5Var = (if5) obj;
        long j = if5Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && this.b.equals(if5Var.b);
    }

    public final int hashCode() {
        int i = dw0.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + dw0.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}

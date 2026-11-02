package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t67 {
    public static final t67 d = new t67(z51.e(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public t67(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t67)) {
            return false;
        }
        t67 t67Var = (t67) obj;
        long j = t67Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && z85.b(this.b, t67Var.b) && this.c == t67Var.c;
    }

    public final int hashCode() {
        int i = dw0.h;
        return Float.hashCode(this.c) + p61.g(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbT = oi0.t("Shadow(color=", dw0.h(this.a), ", offset=", z85.h(this.b), ", blurRadius=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}

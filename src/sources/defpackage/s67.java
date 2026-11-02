package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s67 {
    public final float a;
    public final float b;
    public final byte c;
    public final long d;
    public final float e;

    public s67(float f, int i, long j) {
        this(f, (i & 4) != 0 ? 0.0f : 1.0f, 1.0f, 3, j == 16 ? dw0.b : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s67)) {
            return false;
        }
        s67 s67Var = (s67) obj;
        if (!kt1.b(this.a, s67Var.a) || !kt1.b(this.b, s67Var.b) || this.e != s67Var.e || this.c != s67Var.c) {
            return false;
        }
        long j = s67Var.d;
        int i = dw0.h;
        return tk8.a(this.d, j);
    }

    public final int hashCode() {
        int iE = oi0.e(this.c, pc6.d(p61.g(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), 0L, 31), this.e, 31), 31);
        int i = dw0.h;
        return p61.g(iE, this.d, 31);
    }

    public final String toString() {
        String strC = kt1.c(this.a);
        String strC2 = kt1.c(this.b);
        String strA = mt1.a(0L);
        String strF = oc.F(this.c);
        String strH = dw0.h(this.d);
        StringBuilder sbT = oi0.t("Shadow(radius=", strC, ", spread=", strC2, ", offset=");
        sbT.append(strA);
        sbT.append(", alpha=");
        sbT.append(this.e);
        sbT.append(", blendMode=");
        return oi0.q(sbT, strF, ", color=", strH, ", brush=null)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s67(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = j;
        this.e = x97.m(f3, 0.0f, 1.0f);
    }
}

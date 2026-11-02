package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b34 {
    public final int a;
    public final int b;
    public final boolean c;

    public b34(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b34)) {
            return false;
        }
        b34 b34Var = (b34) obj;
        return this.a == b34Var.a && this.b == b34Var.b && this.c == b34Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oi0.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return p61.o(oi0.r(this.a, "BidiRun(start=", this.b, ", end=", ", isRtl="), this.c, ")");
    }
}

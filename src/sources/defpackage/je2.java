package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 {
    public final float a;
    public final float b;
    public final long c;

    public je2(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je2)) {
            return false;
        }
        je2 je2Var = (je2) obj;
        return Float.compare(this.a, je2Var.a) == 0 && Float.compare(this.b, je2Var.b) == 0 && this.c == je2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + pc6.d(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return ie2.g(this.c, ")", ie2.k("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="));
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d70 {
    public final float a;
    public final fe7 b;

    public d70(float f, fe7 fe7Var) {
        this.a = f;
        this.b = fe7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d70)) {
            return false;
        }
        d70 d70Var = (d70) obj;
        return kt1.b(this.a, d70Var.a) && this.b.equals(d70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + kt1.c(this.a) + ", brush=" + this.b + ")";
    }
}

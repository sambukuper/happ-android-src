package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xj6 {
    public final float a;
    public final float b;

    public xj6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(xj6 xj6Var, xj6 xj6Var2) {
        float f = xj6Var.a;
        float f2 = xj6Var.b;
        double d = f - xj6Var2.a;
        double d2 = f2 - xj6Var2.b;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xj6) {
            xj6 xj6Var = (xj6) obj;
            if (this.a == xj6Var.a && this.b == xj6Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uu0 implements vu0 {
    public final float X;
    public final float Y;

    public uu0(float f, float f2) {
        this.X = f;
        this.Y = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.vu0
    public final Comparable a() {
        return Float.valueOf(this.X);
    }

    @Override // defpackage.vu0
    public final Comparable b() {
        return Float.valueOf(this.Y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uu0)) {
            return false;
        }
        if (isEmpty() && ((uu0) obj).isEmpty()) {
            return true;
        }
        uu0 uu0Var = (uu0) obj;
        return this.X == uu0Var.X && this.Y == uu0Var.Y;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.Y) + (Float.hashCode(this.X) * 31);
    }

    @Override // defpackage.vu0
    public final boolean isEmpty() {
        return this.X > this.Y;
    }

    public final String toString() {
        return this.X + ".." + this.Y;
    }
}

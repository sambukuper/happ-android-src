package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ii1 implements fi1 {
    public final float X;
    public final float Y;

    public ii1(float f, float f2) {
        this.X = f;
        this.Y = f2;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii1)) {
            return false;
        }
        ii1 ii1Var = (ii1) obj;
        return Float.compare(this.X, ii1Var.X) == 0 && Float.compare(this.Y, ii1Var.Y) == 0;
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X;
    }

    public final int hashCode() {
        return Float.hashCode(this.Y) + (Float.hashCode(this.X) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.X + ", fontScale=" + this.Y + ")";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ji1 implements fi1 {
    public final float X;
    public final float Y;
    public final xi2 Z;

    public ji1(float f, float f2, xi2 xi2Var) {
        this.X = f;
        this.Y = f2;
        this.Z = xi2Var;
    }

    @Override // defpackage.fi1
    public final float A(long j) {
        if (w88.a(v88.b(j), 4294967296L)) {
            return this.Z.b(v88.c(j));
        }
        bt.i("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji1)) {
            return false;
        }
        ji1 ji1Var = (ji1) obj;
        return Float.compare(this.X, ji1Var.X) == 0 && Float.compare(this.Y, ji1Var.Y) == 0 && this.Z.equals(ji1Var.Z);
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X;
    }

    public final int hashCode() {
        return this.Z.hashCode() + pc6.d(Float.hashCode(this.X) * 31, this.Y, 31);
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return eu7.i(this.Z.a(f), 4294967296L);
    }

    public final String toString() {
        StringBuilder sbK = ie2.k("DensityWithConverter(density=", this.X, ", fontScale=", this.Y, ", converter=");
        sbK.append(this.Z);
        sbK.append(")");
        return sbK.toString();
    }
}

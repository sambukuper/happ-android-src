package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n50 implements p8 {
    public final float a;

    public n50(float f) {
        this.a = f;
    }

    @Override // defpackage.p8
    public final int a(int i, int i2, z24 z24Var) {
        float f = (i2 - i) / 2.0f;
        z24 z24Var2 = z24.X;
        float f2 = this.a;
        if (z24Var != z24Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n50) && Float.compare(this.a, ((n50) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}

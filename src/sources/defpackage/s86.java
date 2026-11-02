package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s86 {
    public static final s86 e = new s86(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public s86(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static s86 b(s86 s86Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = s86Var.a;
        }
        return new s86(f, s86Var.b, f2, s86Var.d);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long d() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long e() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s86)) {
            return false;
        }
        s86 s86Var = (s86) obj;
        return Float.compare(this.a, s86Var.a) == 0 && Float.compare(this.b, s86Var.b) == 0 && Float.compare(this.c, s86Var.c) == 0 && Float.compare(this.d, s86Var.d) == 0;
    }

    public final long f() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final s86 g(s86 s86Var) {
        return new s86(Math.max(this.a, s86Var.a), Math.max(this.b, s86Var.b), Math.min(this.c, s86Var.c), Math.min(this.d, s86Var.d));
    }

    public final boolean h() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + pc6.d(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final boolean i(s86 s86Var) {
        return (this.a < s86Var.c) & (s86Var.a < this.c) & (this.b < s86Var.d) & (s86Var.b < this.d);
    }

    public final s86 j(float f, float f2) {
        return new s86(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final s86 k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new s86(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strG0 = yn0.g0(this.a);
        String strG1 = yn0.g0(this.b);
        return oi0.q(oi0.t("Rect.fromLTRB(", strG0, ", ", strG1, ", "), yn0.g0(this.c), ", ", yn0.g0(this.d), ")");
    }
}

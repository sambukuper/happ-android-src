package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jm6 implements x67 {
    public final n61 a;
    public final n61 b;
    public final n61 c;
    public final n61 d;

    public jm6(n61 n61Var, n61 n61Var2, n61 n61Var3, n61 n61Var4) {
        this.a = n61Var;
        this.b = n61Var2;
        this.c = n61Var3;
        this.d = n61Var4;
    }

    public static jm6 b(jm6 jm6Var, n61 n61Var, n61 n61Var2, n61 n61Var3, n61 n61Var4, int i) {
        if ((i & 1) != 0) {
            n61Var = jm6Var.a;
        }
        if ((i & 2) != 0) {
            n61Var2 = jm6Var.b;
        }
        if ((i & 4) != 0) {
            n61Var3 = jm6Var.c;
        }
        if ((i & 8) != 0) {
            n61Var4 = jm6Var.d;
        }
        jm6Var.getClass();
        return new jm6(n61Var, n61Var2, n61Var3, n61Var4);
    }

    @Override // defpackage.x67
    public final mb6 a(long j, z24 z24Var, fi1 fi1Var) {
        float fA = this.a.a(j, fi1Var);
        float fA2 = this.b.a(j, fi1Var);
        float fA3 = this.c.a(j, fi1Var);
        float fA4 = this.d.a(j, fi1Var);
        float fC = ua7.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbK = ie2.k("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbK.append(fA3);
            sbK.append(", bottomStart = ");
            sbK.append(fA4);
            sbK.append(")!");
            zc3.a(sbK.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new ae5(u70.n(0L, j));
        }
        s86 s86VarN = u70.n(0L, j);
        z24 z24Var2 = z24.X;
        float f5 = z24Var == z24Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (z24Var == z24Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = z24Var == z24Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (z24Var != z24Var2) {
            fA4 = fA3;
        }
        return new be5(new em6(s86VarN.a, s86VarN.b, s86VarN.c, s86VarN.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm6)) {
            return false;
        }
        jm6 jm6Var = (jm6) obj;
        return dh3.f(this.a, jm6Var.a) && dh3.f(this.b, jm6Var.b) && dh3.f(this.c, jm6Var.c) && dh3.f(this.d, jm6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}

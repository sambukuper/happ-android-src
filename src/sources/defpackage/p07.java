package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p07 {
    public final kd8 a;
    public final x78 b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final e68 f;
    public final h48 g;
    public final r07 h;
    public long i;
    public f09 j;
    public final String k;

    public p07(kd8 kd8Var, x78 x78Var, boolean z, boolean z2, float f, e68 e68Var) {
        this.a = kd8Var;
        this.b = x78Var;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = e68Var;
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            h48 h48VarD = kd8Var.d();
            this.g = h48VarD;
            this.h = (r07) kd8Var.e.getValue();
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            this.i = h48VarD.f0;
            this.k = h48VarD.Z.toString();
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    public final void a() {
        if (this.k.length() > 0) {
            h48 h48Var = this.g;
            boolean zB = f88.b(h48Var.f0);
            kd8 kd8Var = this.a;
            if (zB) {
                kd8.i(kd8Var, _UrlKt.FRAGMENT_ENCODE_SET, ct7.c((int) (h48Var.f0 >> 32), (int) (this.i & 4294967295L)), !this.c, this.d, 4);
            } else {
                kd8Var.c(this.d);
            }
            this.i = this.a.d().f0;
            this.j = f09.X;
        }
    }

    public final boolean b() {
        x78 x78Var = this.b;
        if (x78Var == null) {
            return true;
        }
        long j = this.i;
        int i = f88.c;
        return x78Var.i((int) (j & 4294967295L)) == lf6.X;
    }

    public final int c(x78 x78Var, int i) {
        long j = this.i;
        int i2 = f88.c;
        int i3 = (int) (j & 4294967295L);
        e68 e68Var = this.f;
        if (Float.isNaN(e68Var.a)) {
            e68Var.a = x78Var.c(i3).a;
        }
        bz4 bz4Var = x78Var.b;
        int iC = bz4Var.c(i3) + i;
        if (iC < 0) {
            return Integer.MIN_VALUE;
        }
        if (iC >= bz4Var.f) {
            return Integer.MAX_VALUE;
        }
        float fA = bz4Var.a(iC) - 1.0f;
        float f = e68Var.a;
        if ((b() && f >= x78Var.g(iC)) || (!b() && f <= x78Var.f(iC))) {
            return bz4Var.b(iC, true);
        }
        return bz4Var.f((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.g.f0;
        int i2 = f88.c;
        int i3 = (int) (j & 4294967295L);
        x78 x78Var = this.b;
        if (x78Var != null) {
            bz4 bz4Var = x78Var.b;
            float f = this.e;
            if (!Float.isNaN(f)) {
                s86 s86VarJ = x78Var.c(i3).j(0.0f, f * i);
                float f2 = s86VarJ.d;
                float f3 = s86VarJ.b;
                float fA = bz4Var.a(bz4Var.d(f3));
                if (Math.abs(f3 - fA) > Math.abs(f2 - fA)) {
                    return bz4Var.f(s86VarJ.f());
                }
                return bz4Var.f((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(s86VarJ.a) << 32));
            }
        }
        return i3;
    }

    public final void e() {
        x78 x78Var = this.b;
        int iC = x78Var != null ? c(x78Var, 1) : Integer.MAX_VALUE;
        if (iC == Integer.MAX_VALUE) {
            this.f.a = Float.NaN;
        }
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (iC > length) {
                iC = length;
            }
            long jC = bt7.c(iC, i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void f() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            long jC = bt7.c(d(1), i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void g() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            long jC = bt7.c(wl7.y(i2, str), i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void h() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int iW = x97.w(str, f88.c(j));
            if (iW == f88.c(this.i) && iW != str.length()) {
                iW = x97.w(str, iW + 1);
            }
            long jC = bt7.c(iW, i, this.a);
            int i2 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i2 != i || !f88.b(this.i)) {
                this.i = ct7.c(i2, i2);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void i() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            x78 x78Var = this.b;
            if (x78Var != null) {
                int i3 = i2;
                while (true) {
                    h48 h48Var = this.g;
                    if (i3 < h48Var.Z.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long jK = x78Var.k(length2);
                        int i4 = f88.c;
                        int i5 = (int) (jK & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = h48Var.Z.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jC = bt7.c(length, i2, this.a);
            int i6 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i6 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i6, i6);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void j() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            long jC = bt7.c(wl7.z(i2, str), i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void k() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int iX = x97.x(str, f88.d(j));
            if (iX == f88.d(this.i) && iX != 0) {
                iX = x97.x(str, iX - 1);
            }
            long jC = bt7.c(iX, i, this.a);
            int i2 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i2 != i || !f88.b(this.i)) {
                this.i = ct7.c(i2, i2);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void l() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            x78 x78Var = this.b;
            if (x78Var != null) {
                for (int i4 = i2; i4 > 0; i4--) {
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long jK = x78Var.k(length);
                    int i5 = f88.c;
                    int i6 = (int) (jK >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                }
            }
            long jC = bt7.c(i3, i2, this.a);
            int i7 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i7 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i7, i7);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void m() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            long jC = bt7.c(str.length(), i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void n() {
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            long jC = bt7.c(0, i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void o() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (4294967295L & j);
            x78 x78Var = this.b;
            if (x78Var != null) {
                bz4 bz4Var = x78Var.b;
                length = bz4Var.b(bz4Var.c(f88.c(j)), true);
            } else {
                length = str.length();
            }
            long jC = bt7.c(length, i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void p() {
        int iH;
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (4294967295L & j);
            x78 x78Var = this.b;
            if (x78Var != null) {
                iH = x78Var.h(x78Var.b.c(f88.d(j)));
            } else {
                iH = 0;
            }
            long jC = bt7.c(iH, i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void q() {
        x78 x78Var = this.b;
        int iC = x78Var != null ? c(x78Var, -1) : Integer.MIN_VALUE;
        if (iC == Integer.MIN_VALUE) {
            this.f.a = Float.NaN;
        }
        if (this.k.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            if (iC < 0) {
                iC = 0;
            }
            long jC = bt7.c(iC, i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void r() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = f88.c;
            int i2 = (int) (j & 4294967295L);
            long jC = bt7.c(d(-1), i2, this.a);
            int i3 = (int) (jC >> 32);
            f09 f09VarD = nr4.D(jC);
            if (i3 != i2 || !f88.b(this.i)) {
                this.i = ct7.c(i3, i3);
            }
            if (f09VarD != null) {
                this.j = f09VarD;
            }
        }
    }

    public final void s() {
        if (this.k.length() > 0) {
            long j = this.g.f0;
            int i = f88.c;
            this.i = ct7.c((int) (j >> 32), (int) (this.i & 4294967295L));
        }
    }
}

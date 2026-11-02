package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p38 {
    public static final float a = 64.0f;

    public static final void a(rb8 rb8Var, hq5 hq5Var) {
        gj4 gj4Var = (gj4) rb8Var.Y;
        vu8 vu8Var = (vu8) gj4Var.Z;
        vu8 vu8Var2 = (vu8) gj4Var.Y;
        boolean zK = vr3.k(hq5Var);
        long j = hq5Var.b;
        if (zK) {
            ka1[] ka1VarArr = vu8Var2.d;
            eu.m0(0, ka1VarArr.length, null, ka1VarArr);
            vu8Var2.e = 0;
            ka1[] ka1VarArr2 = vu8Var.d;
            eu.m0(0, ka1VarArr2.length, null, ka1VarArr2);
            vu8Var.e = 0;
            gj4Var.X = 0L;
        }
        if (!vr3.m(hq5Var)) {
            List listB = hq5Var.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                m03 m03Var = (m03) listB.get(i);
                gj4Var.f(m03Var.a, z85.f(m03Var.e, 0L));
            }
            gj4Var.f(j, z85.f(hq5Var.n, 0L));
        }
        if (vr3.m(hq5Var) && j - gj4Var.X > 40) {
            ka1[] ka1VarArr3 = vu8Var2.d;
            eu.m0(0, ka1VarArr3.length, null, ka1VarArr3);
            vu8Var2.e = 0;
            ka1[] ka1VarArr4 = vu8Var.d;
            eu.m0(0, ka1VarArr4.length, null, ka1VarArr4);
            vu8Var.e = 0;
            gj4Var.X = 0L;
        }
        gj4Var.X = j;
    }

    public static final g38 b(nh1 nh1Var) {
        s38 s38Var;
        e38 e38Var = new e38();
        ts7.g(nh1Var, i38.a, new py7(new py7((Object) e38Var, (byte) 3), new al5(1, e38Var, e38.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 23), (byte) 4));
        j05 j05Var = new j05();
        j05 j05Var2 = e38Var.a;
        Object[] objArr = j05Var2.a;
        int i = j05Var2.b;
        byte b = 0;
        int i2 = 0;
        boolean z = true;
        f38 f38Var = null;
        while (true) {
            s38Var = s38.b;
            if (i2 >= i) {
                break;
            }
            f38 f38Var2 = (f38) objArr[i2];
            if (!z || f38Var2 != s38Var) {
                if (f38Var2 == s38Var && f38Var == s38Var) {
                    z = false;
                } else {
                    if (f38Var2 != s38Var) {
                        j05 j05Var3 = e38Var.b;
                        Object[] objArr2 = j05Var3.a;
                        int i3 = j05Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((gn2) objArr2[i4]).B(f38Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    j05Var.a(f38Var2);
                    z = false;
                    f38Var = f38Var2;
                }
            }
            i2++;
        }
        if (((f38) (j05Var.i() ? null : j05Var.a[j05Var.b - 1])) == s38Var) {
            j05Var.l(j05Var.b - 1);
        }
        h05 h05Var = j05Var.c;
        if (h05Var == null) {
            h05Var = new h05(j05Var, b);
            j05Var.c = h05Var;
        }
        return new g38(h05Var);
    }

    public static final float c(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void d(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            wc3.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fC = c(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fC);
                }
            }
            float fSqrt = (float) Math.sqrt(c(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : c(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fC2 = c(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fC2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fC2 / fArr11[i14];
        }
    }

    public static final lk8 e(String str) {
        int i;
        km4.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new lk8(i2);
    }

    public static final tk8 f(String str) {
        str.getClass();
        int i = 10;
        km4.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new tk8(j);
    }

    public static void g(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }
}

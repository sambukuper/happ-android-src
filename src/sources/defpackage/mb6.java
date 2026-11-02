package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.gson.internal.bind.JsonElementTypeAdapter;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mb6 {
    public static final float[][] X = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] Y = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] Z = {95.047f, 100.0f, 108.883f};
    public static final float[][] f0 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final up5 g0 = new up5(null, new fp5());
    public static final StackTraceElement[] h0 = new StackTraceElement[0];
    public static final l98 i0 = new l98(0, new long[0], new Object[0]);

    public static boolean A(int i, int i2, int[] iArr) {
        int i3 = i2 ^ iArr[0];
        if (i3 == 0) {
            for (int i4 = 1; i4 < i; i4++) {
                i3 |= iArr[i4];
            }
            if (i3 == 0) {
                return true;
            }
        }
        return false;
    }

    public static long B(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, f(j2, j)));
        return j2;
    }

    public static final Object C(kb6 kb6Var) {
        Class clsV;
        kb6Var.getClass();
        Object objJ = kb6Var.J();
        if (!(kb6Var instanceof pb6) || !a28.o((pb6) kb6Var)) {
            Iterator it = kb6Var.l().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (((ob6) next).x() != fw3.f0) {
                    if (!z) {
                        z = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            ob6 ob6Var = (ob6) obj;
            pw3 pw3VarB = ob6Var != null ? ob6Var.B() : null;
            if (pw3VarB != null && (clsV = a28.v(pw3VarB)) != null) {
                return a28.f(clsV, kb6Var).invoke(objJ, null);
            }
        }
        return objJ;
    }

    public static String F(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static int G(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = Z;
        return qw0.a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static q51 H(q51 q51Var) {
        q51Var.getClass();
        s51 s51Var = q51Var instanceof s51 ? (s51) q51Var : null;
        if (s51Var == null || (q51Var = s51Var.Z) != null) {
            return q51Var;
        }
        u61 u61Var = (u61) s51Var.w().H0(pz2.E0);
        q51 np1Var = u61Var != null ? new np1(u61Var, s51Var) : s51Var;
        s51Var.Z = np1Var;
        return np1Var;
    }

    public static int I(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = (2 - (i * i2)) * i2;
        int i4 = (2 - (i * i3)) * i3;
        return (2 - (i * i4)) * i4;
    }

    public static final boolean J(kb6 kb6Var) {
        kb6Var.getClass();
        return L(kb6Var) && kb6Var.D().t().isAnnotation();
    }

    public static final boolean K(kb6 kb6Var) {
        kb6Var.getClass();
        return kb6Var.J() != nd0.NO_RECEIVER;
    }

    public static final boolean L(kb6 kb6Var) {
        kb6Var.getClass();
        return dh3.f(kb6Var.getName(), "<init>");
    }

    public static float N(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static int O(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int i = 1;
        int iNumberOfLeadingZeros = (length * 32) - Integer.numberOfLeadingZeros(iArr[length - 1]);
        int i2 = 30;
        int i3 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        iArr5[0] = 1;
        z(iNumberOfLeadingZeros, iArr2, iArr7);
        z(iNumberOfLeadingZeros, iArr, iArr8);
        System.arraycopy(iArr8, 0, iArr6, 0, i3);
        int I = I(iArr8[0]);
        int i4 = 0;
        int i5 = (int) (((((long) iNumberOfLeadingZeros) * 150964) + 99243) >>> 16);
        int i6 = 0;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = iArr6[i4];
            int i9 = iArr7[i4];
            int i10 = i6;
            int i11 = i8;
            int i12 = i4;
            int i13 = i3;
            int[] iArr9 = iArr4;
            int[] iArr10 = iArr5;
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = 1073741824;
            int i18 = i;
            int i19 = 1073741824;
            while (i14 < i2) {
                int i20 = i2;
                int i21 = i10 >> 31;
                int i22 = i14;
                int i23 = -(i9 & 1);
                int i24 = i9 - ((i11 ^ i21) & i23);
                int i25 = i16 - ((i17 ^ i21) & i23);
                int i26 = i19 - ((i15 ^ i21) & i23);
                int i27 = (~i21) & i23;
                i10 = (i10 ^ i27) + 1;
                i11 += i24 & i27;
                i17 += i25 & i27;
                i15 += i27 & i26;
                i9 = i24 >> 1;
                i16 = i25 >> 1;
                i19 = i26 >> 1;
                i14 = i22 + 1;
                i2 = i20;
            }
            int[] iArr11 = {i17, i15, i16, i19};
            i3 = i13;
            iArr4 = iArr9;
            iArr5 = iArr10;
            i0(i3, iArr4, iArr5, iArr11, I, iArr8);
            j0(i3, iArr6, iArr7, iArr11);
            i7 += 30;
            i4 = i12;
            i6 = i10;
            i = i18;
        }
        int i28 = i4;
        int i29 = i;
        int i30 = i3 - 1;
        int i31 = iArr6[i30] >> 31;
        int i32 = i28;
        int i33 = i32;
        while (i32 < i30) {
            int i34 = ((iArr6[i32] ^ i31) - i31) + i33;
            iArr6[i32] = i34 & 1073741823;
            i33 = i34 >> 30;
            i32++;
        }
        iArr6[i30] = ((iArr6[i30] ^ i31) - i31) + i33;
        int i35 = iArr4[i30] >> 31;
        int i36 = i28;
        int i37 = i36;
        while (i36 < i30) {
            int i38 = (((iArr4[i36] + (iArr8[i36] & i35)) ^ i31) - i31) + i37;
            iArr4[i36] = i38 & 1073741823;
            i37 = i38 >> 30;
            i36++;
        }
        int i39 = (((iArr4[i30] + (i35 & iArr8[i30])) ^ i31) - i31) + i37;
        iArr4[i30] = i39;
        int i40 = i39 >> 31;
        int i41 = i28;
        int i42 = i41;
        while (i41 < i30) {
            int i43 = iArr4[i41] + (iArr8[i41] & i40) + i42;
            iArr4[i41] = i43 & 1073741823;
            i42 = i43 >> 30;
            i41++;
        }
        iArr4[i30] = iArr4[i30] + (i40 & iArr8[i30]) + i42;
        y(iNumberOfLeadingZeros, iArr4, iArr3);
        int i44 = iArr6[i28] ^ 1;
        for (int i45 = i29; i45 < i3; i45++) {
            i44 |= iArr6[i45];
        }
        int i46 = (~i44) & (i44 - 1);
        int i47 = iArr7[i28];
        for (int i48 = i29; i48 < i3; i48++) {
            i47 |= iArr7[i48];
        }
        return (i46 & ((~i47) & (i47 - 1))) >> 31;
    }

    public static void P(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int iNumberOfLeadingZeros;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length = iArr.length;
        int i8 = length * 32;
        int i9 = 1;
        int i10 = length - 1;
        int iNumberOfLeadingZeros2 = i8 - Integer.numberOfLeadingZeros(iArr[i10]);
        int i11 = (iNumberOfLeadingZeros2 + 29) / 30;
        while (true) {
            i = 0;
            if (i10 < 0) {
                iNumberOfLeadingZeros = 0;
                break;
            }
            int i12 = iArr2[i10];
            if (i12 != 0) {
                iNumberOfLeadingZeros = (32 - Integer.numberOfLeadingZeros(i12)) + (i10 * 32);
                break;
            }
            i10--;
        }
        int i13 = iNumberOfLeadingZeros2 - iNumberOfLeadingZeros;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i11];
        int[] iArr9 = new int[i11];
        iArr6[0] = 1;
        z(iNumberOfLeadingZeros2, iArr2, iArr8);
        z(iNumberOfLeadingZeros2, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i11);
        int i14 = -i13;
        int I = I(iArr9[0]);
        int i15 = i11;
        int[] iArr10 = iArr7;
        int i16 = (int) (((((long) iNumberOfLeadingZeros2) * 188898) + ((long) (iNumberOfLeadingZeros2 < 46 ? 308405 : 181188))) >>> 16);
        int i17 = i15;
        while (!A(i17, i, iArr8)) {
            if (i13 >= i16) {
                return;
            }
            i13 += 30;
            int i18 = iArr10[i];
            int i19 = iArr8[i];
            int i20 = i9;
            int i21 = i20;
            int i22 = i;
            int i23 = i22;
            int i24 = 30;
            while (true) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i19 | ((-1) << i24));
                int i25 = i19 >> iNumberOfTrailingZeros;
                i2 = i;
                i3 = i20 << iNumberOfTrailingZeros;
                i4 = i9;
                i5 = i22 << iNumberOfTrailingZeros;
                i14 -= iNumberOfTrailingZeros;
                i24 -= iNumberOfTrailingZeros;
                if (i24 <= 0) {
                    break;
                }
                int i26 = i15;
                int i27 = i16;
                int[] iArr11 = iArr9;
                int[] iArr12 = iArr10;
                int i28 = I;
                int[] iArr13 = iArr6;
                int[] iArr14 = iArr5;
                if (i14 <= 0) {
                    i14 = 2 - i14;
                    int i29 = -i18;
                    i7 = -i3;
                    int i30 = -i5;
                    i6 = (((i25 * i25) - 2) * i25 * i29) & ((-1) >>> (32 - (i14 > i24 ? i24 : i14))) & 63;
                    int i31 = i21;
                    i21 = i30;
                    i5 = i31;
                    i25 = i29;
                    i18 = i25;
                } else {
                    i6 = ((i18 + (((i18 + 1) & 4) << 1)) * (-i25)) & ((-1) >>> (32 - (i14 > i24 ? i24 : i14))) & 15;
                    int i32 = i23;
                    i23 = i3;
                    i7 = i32;
                    i14 = i14;
                }
                i19 = (i18 * i6) + i25;
                int i33 = (i23 * i6) + i7;
                i21 = (i6 * i5) + i21;
                iArr9 = iArr11;
                i16 = i27;
                i15 = i26;
                iArr5 = iArr14;
                iArr6 = iArr13;
                I = i28;
                iArr10 = iArr12;
                i22 = i5;
                i9 = i4;
                i20 = i23;
                i23 = i33;
                i = i2;
            }
            iArr4[i2] = i3;
            iArr4[i4] = i5;
            iArr4[2] = i23;
            iArr4[3] = i21;
            int i34 = i15;
            i0(i34, iArr5, iArr6, iArr4, I, iArr9);
            int[] iArr15 = iArr9;
            int[] iArr16 = iArr10;
            int i35 = I;
            int[] iArr17 = iArr6;
            int[] iArr18 = iArr5;
            j0(i17, iArr16, iArr8, iArr4);
            int i36 = i17 - 1;
            int i37 = iArr16[i36];
            int i38 = iArr8[i36];
            int i39 = i17 - 2;
            if (((i39 >> 31) | (i37 ^ (i37 >> 31)) | (i38 ^ (i38 >> 31))) == 0) {
                iArr16[i39] = (i37 << 30) | iArr16[i39];
                iArr8[i39] = (i38 << 30) | iArr8[i39];
                i17--;
            }
            i15 = i34;
            iArr5 = iArr18;
            iArr6 = iArr17;
            I = i35;
            i = i2;
            iArr10 = iArr16;
            iArr9 = iArr15;
            i9 = i4;
        }
        int i40 = i9;
        int[] iArr19 = iArr5;
        int[] iArr20 = iArr9;
        int[] iArr21 = iArr10;
        int i41 = i15;
        int i42 = iArr21[i17 - 1] >> 31;
        int iR = iArr19[i41 - 1] >> 31;
        if (iR < 0) {
            iR = e(i41, iArr19, iArr20);
        }
        if (i42 < 0) {
            iR = R(iArr19, i41);
            R(iArr21, i17);
        }
        if (A(i17, i40, iArr21)) {
            if (iR < 0) {
                e(i41, iArr19, iArr20);
            }
            y(iNumberOfLeadingZeros2, iArr19, iArr3);
        }
    }

    public static long Q(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j2 == 0 || j3 / j2 == j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static int R(int[] iArr, int i) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static final kx4 S(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new fx3(gn2Var, null));
    }

    public static final kx4 T(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new fx3(null, gn2Var));
    }

    public static bo3 U(rq3 rq3Var) {
        boolean z;
        try {
            try {
                rq3Var.c0();
                z = false;
                try {
                    JsonElementTypeAdapter.a.getClass();
                    return JsonElementTypeAdapter.d(rq3Var);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return xp3.X;
                    }
                    throw new fr3(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (cp4 e3) {
            throw new fr3(e3);
        } catch (IOException e4) {
            throw new uo3(e4);
        } catch (NumberFormatException e5) {
            throw new fr3(e5);
        }
    }

    public static final km5 V(km5 km5Var, Iterable iterable) {
        km5Var.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            mm5 mm5Var = new mm5(km5Var);
            bw0.d0(mm5Var, iterable);
            return mm5Var.b();
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return km5Var;
        }
        mm5 mm5Var2 = new mm5(km5Var);
        mm5Var2.addAll(collection);
        return mm5Var2.b();
    }

    public static void W(AtomicLong atomicLong, ArrayDeque arrayDeque, aq7 aq7Var) {
        long jAddAndGet = atomicLong.get();
        if (jAddAndGet == Long.MAX_VALUE) {
            while (!aq7Var.X.Y) {
                Object objPoll = arrayDeque.poll();
                if (objPoll == null) {
                    aq7Var.b();
                    return;
                }
                aq7Var.onNext(objPoll);
            }
            return;
        }
        do {
            long j = Long.MIN_VALUE;
            while (true) {
                if (j == jAddAndGet) {
                    if (j == jAddAndGet) {
                        if (aq7Var.X.Y) {
                            return;
                        }
                        if (arrayDeque.isEmpty()) {
                            aq7Var.b();
                            return;
                        }
                    }
                    jAddAndGet = atomicLong.get();
                    if (jAddAndGet == j) {
                        break;
                    }
                } else {
                    if (aq7Var.X.Y) {
                        return;
                    }
                    Object objPoll2 = arrayDeque.poll();
                    if (objPoll2 == null) {
                        aq7Var.b();
                        return;
                    } else {
                        aq7Var.onNext(objPoll2);
                        j++;
                    }
                }
            }
            jAddAndGet = atomicLong.addAndGet(-(j & Long.MAX_VALUE));
        } while (jAddAndGet != Long.MIN_VALUE);
    }

    public static final void Z(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(t06 t06Var, rn2 rn2Var, lp2 lp2Var, int i) {
        jt8 jt8Var;
        boolean z;
        j86 j86VarR;
        lp2Var.X(-149765515);
        qf3 qf3Var = lp2Var.x;
        kl5 kl5VarL = lp2Var.l();
        lp2Var.T(201, d01.b);
        Object objK = lp2Var.K();
        if (dh3.f(objK, zz0.a)) {
            jt8Var = null;
        } else {
            objK.getClass();
            jt8Var = (jt8) objK;
        }
        q06 q06Var = t06Var.a;
        jt8 jt8VarD = q06Var.d(t06Var, jt8Var);
        boolean zEquals = jt8VarD.equals(jt8Var);
        if (!zEquals) {
            lp2Var.g0(jt8VarD);
        }
        if (!lp2Var.S) {
            xb7 xb7Var = lp2Var.G;
            Object objB = xb7Var.b(xb7Var.b, xb7Var.g);
            objB.getClass();
            kl5 kl5Var = (kl5) objB;
            if (!(lp2Var.z() && zEquals) && (t06Var.g || !kl5VarL.containsKey(q06Var))) {
                kl5VarL = kl5VarL.g(q06Var, jt8VarD);
            } else if ((zEquals && !lp2Var.w) || !lp2Var.w) {
                kl5VarL = kl5Var;
            }
            if (lp2Var.y || kl5Var != kl5VarL) {
                z = true;
            }
            if (z && !lp2Var.S) {
                lp2Var.I(kl5VarL);
            }
            qf3Var.e(lp2Var.w ? 1 : 0);
            lp2Var.w = z;
            lp2Var.K = kl5VarL;
            lp2Var.R(202, 0, d01.c, kl5VarL);
            rn2Var.K(lp2Var, Integer.valueOf((i >> 3) & 14));
            lp2Var.p(false);
            lp2Var.p(false);
            lp2Var.w = qf3Var.d() != 0;
            lp2Var.K = null;
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new sl((byte) 2, i, t06Var, rn2Var);
            }
        }
        if (t06Var.g || !kl5VarL.containsKey(q06Var)) {
            kl5VarL = kl5VarL.g(q06Var, jt8VarD);
        }
        lp2Var.J = true;
        z = false;
        if (z) {
            lp2Var.I(kl5VarL);
        }
        qf3Var.e(lp2Var.w ? 1 : 0);
        lp2Var.w = z;
        lp2Var.K = kl5VarL;
        lp2Var.R(202, 0, d01.c, kl5VarL);
        rn2Var.K(lp2Var, Integer.valueOf((i >> 3) & 14));
        lp2Var.p(false);
        lp2Var.p(false);
        lp2Var.w = qf3Var.d() != 0;
        lp2Var.K = null;
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl((byte) 2, i, t06Var, rn2Var);
        }
    }

    public static kx4 a0(kx4 kx4Var, float f, jm6 jm6Var) {
        boolean z = kt1.a(f, 0.0f) > 0;
        long j = bu2.a;
        return (kt1.a(f, 0.0f) > 0 || z) ? kx4Var.y(new u67(f, jm6Var, z, j, j)) : kx4Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(t06[] t06VarArr, rn2 rn2Var, lp2 lp2Var, int i) {
        kl5 kl5VarF0;
        boolean z;
        j86 j86VarR;
        lp2Var.X(415205898);
        qf3 qf3Var = lp2Var.x;
        kl5 kl5VarL = lp2Var.l();
        lp2Var.T(201, d01.b);
        if (lp2Var.S) {
            kl5VarF0 = lp2Var.f0(kl5VarL, x97.c0(t06VarArr, kl5VarL, kl5.f0));
            lp2Var.J = true;
        } else {
            xb7 xb7Var = lp2Var.G;
            Object objH = xb7Var.h(xb7Var.g, 0);
            objH.getClass();
            kl5 kl5Var = (kl5) objH;
            xb7 xb7Var2 = lp2Var.G;
            Object objH2 = xb7Var2.h(xb7Var2.g, 1);
            objH2.getClass();
            kl5 kl5Var2 = (kl5) objH2;
            kl5 kl5VarC0 = x97.c0(t06VarArr, kl5VarL, kl5Var2);
            if (!lp2Var.z() || lp2Var.y || !kl5Var2.equals(kl5VarC0)) {
                kl5VarF0 = lp2Var.f0(kl5VarL, kl5VarC0);
                if (lp2Var.y || !dh3.f(kl5VarF0, kl5Var)) {
                    z = true;
                }
                if (z && !lp2Var.S) {
                    lp2Var.I(kl5VarF0);
                }
                qf3Var.e(lp2Var.w ? 1 : 0);
                lp2Var.w = z;
                lp2Var.K = kl5VarF0;
                lp2Var.R(202, 0, d01.c, kl5VarF0);
                rn2Var.K(lp2Var, Integer.valueOf((i >> 3) & 14));
                lp2Var.p(false);
                lp2Var.p(false);
                lp2Var.w = qf3Var.d() != 0;
                lp2Var.K = null;
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new sl((byte) 3, i, t06VarArr, rn2Var);
                }
            }
            lp2Var.l = lp2Var.G.s() + lp2Var.l;
            kl5VarF0 = kl5Var;
        }
        z = false;
        if (z) {
            lp2Var.I(kl5VarF0);
        }
        qf3Var.e(lp2Var.w ? 1 : 0);
        lp2Var.w = z;
        lp2Var.K = kl5VarF0;
        lp2Var.R(202, 0, d01.c, kl5VarF0);
        rn2Var.K(lp2Var, Integer.valueOf((i >> 3) & 14));
        lp2Var.p(false);
        lp2Var.p(false);
        lp2Var.w = qf3Var.d() != 0;
        lp2Var.K = null;
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl((byte) 3, i, t06VarArr, rn2Var);
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String b0(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void c(kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        lp2 lp2Var2;
        kx4 kx4VarJ;
        lp2Var.X(514188831);
        if ((i & 6) == 0) {
            i2 = i | (lp2Var.f(kx4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            lc3 lc3VarL = zc1.l(zc1.h0(0, lp2Var), 0.0f, 360.0f, wl7.N(wl7.i0(2000, 2, yx1.d), 4), lp2Var, 29112, 0);
            g73 g73VarP = u28.p(q36.ic_loading, lp2Var);
            float fFloatValue = ((Number) lc3VarL.Z.getValue()).floatValue();
            if (fFloatValue == 0.0f) {
                kx4VarJ = kx4Var;
                kx4Var2 = kx4VarJ;
                lp2Var2 = lp2Var;
            } else {
                lp2Var2 = lp2Var;
                kx4VarJ = jm4.J(kx4Var, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, 0L, null, false, 0L, 0L, 1048319);
                kx4Var2 = kx4Var;
            }
            os4.a(g73VarP, kx4VarJ, null, ((dp) lp2Var2.j(ep.z)).c.a, lp2Var2, 0, 4);
        } else {
            kx4Var2 = kx4Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new gx2(kx4Var2, i, (byte) 0);
        }
    }

    public static final pw3 c0(kb6 kb6Var, pw3 pw3Var) {
        kb6Var.getClass();
        pw3Var.getClass();
        return ((lb6) kb6Var).X.b(kb6Var.getName(), kb6Var.getTypeParameters()).c(pw3Var, kb6Var.getName());
    }

    public static je d(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        wk6 wk6Var = nw0.e;
        Bitmap.Config configJ0 = ue3.j0(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = ue3.j(i, i2, i3, wk6Var);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configJ0);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new je(bitmapCreateBitmap);
    }

    public static final b83 d0(Iterable iterable) {
        iterable.getClass();
        b83 b83Var = iterable instanceof b83 ? (b83) iterable : null;
        return b83Var == null ? f0(iterable) : b83Var;
    }

    public static int e(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4] + iArr2[i4] + i3;
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = iArr[i2] + iArr2[i2] + i3;
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static final j2 e0(u27 u27Var) {
        ec7 ec7Var = ec7.Y;
        ec7Var.getClass();
        qm5 qm5VarC = ec7Var.c();
        Iterator it = u27Var.iterator();
        while (it.hasNext()) {
            qm5VarC.add(it.next());
        }
        return qm5VarC.c();
    }

    public static long f(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static final j2 f0(Iterable iterable) {
        iterable.getClass();
        j2 j2Var = iterable instanceof j2 ? (j2) iterable : null;
        if (j2Var != null) {
            return j2Var;
        }
        qm5 qm5Var = iterable instanceof qm5 ? (qm5) iterable : null;
        j2 j2VarC = qm5Var != null ? qm5Var.c() : null;
        if (j2VarC != null) {
            return j2VarC;
        }
        ec7 ec7Var = ec7.Y;
        ec7Var.getClass();
        if (iterable instanceof Collection) {
            return ec7Var.e((Collection) iterable);
        }
        qm5 qm5VarC = ec7Var.c();
        bw0.d0(qm5VarC, iterable);
        return qm5VarC.c();
    }

    public static final void g(g91 g91Var) {
        g91Var.getClass();
        g91Var.d();
        g91Var.j();
    }

    public static final km5 g0(Iterable iterable) {
        iterable.getClass();
        km5 km5Var = iterable instanceof km5 ? (km5) iterable : null;
        if (km5Var != null) {
            return km5Var;
        }
        mm5 mm5Var = iterable instanceof mm5 ? (mm5) iterable : null;
        km5 km5VarB = mm5Var != null ? mm5Var.b() : null;
        if (km5VarB != null) {
            return km5VarB;
        }
        km5 km5Var2 = km5.f0;
        return V(km5.f0, iterable);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(defpackage.bz7 r7, defpackage.bq5 r8, defpackage.r10 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.hj2
            if (r0 == 0) goto L13
            r0 = r9
            hj2 r0 = (defpackage.hj2) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            hj2 r0 = new hj2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.h0
            int r1 = r0.i0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            bq5 r7 = r0.g0
            bz7 r8 = r0.f0
            defpackage.w39.n0(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            r7 = 0
            return r7
        L34:
            defpackage.w39.n0(r9)
            cz7 r9 = r7.g0
            aq5 r9 = r9.u0
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            hq5 r5 = (defpackage.hq5) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.f0 = r7
            r0.g0 = r8
            r0.i0 = r3
            java.lang.Object r9 = r7.a(r8, r0)
            c71 r1 = defpackage.c71.X
            if (r9 != r1) goto L5d
            return r1
        L5d:
            aq5 r9 = (defpackage.aq5) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            hq5 r5 = (defpackage.hq5) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            dn8 r7 = defpackage.dn8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb6.h(bz7, bq5, r10):java.lang.Object");
    }

    public static final kb6 h0(kb6 kb6Var) {
        return !K(kb6Var) ? kb6Var : kb6Var.A(kb6Var.D(), ((lb6) kb6Var).X);
    }

    public static final Object i(mq5 mq5Var, rn2 rn2Var, q51 q51Var) {
        Object objY0 = ((cz7) mq5Var).Y0(new ij2(q51Var.w(), rn2Var, null, (byte) 0), q51Var);
        return objY0 == c71.X ? objY0 : dn8.a;
    }

    public static void i0(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j7 * j4) + (j2 * j6);
        int i14 = i11 - (((((int) j5) * i2) + i11) & 1073741823);
        long j9 = i13;
        long j10 = i14;
        long j11 = (j9 * j10) + j5;
        long j12 = i12 - (((((int) j8) * i2) + i12) & 1073741823);
        char c = 30;
        long j13 = j11 >> 30;
        long j14 = ((j9 * j12) + j8) >> 30;
        int i15 = 1;
        while (i15 < i3) {
            int i16 = iArr4[i15];
            char c2 = c;
            long j15 = j12;
            long j16 = iArr[i15];
            long j17 = j * j16;
            long j18 = iArr2[i15];
            long j19 = i16;
            long j20 = j10;
            long jI = p61.i(j19, j20, (j3 * j18) + j17, j13);
            long jI2 = p61.i(j19, j15, (j18 * j7) + (j6 * j16), j14);
            int i17 = i15 - 1;
            iArr[i17] = ((int) jI) & 1073741823;
            j13 = jI >> c2;
            iArr2[i17] = ((int) jI2) & 1073741823;
            j14 = jI2 >> c2;
            i15++;
            i3 = i;
            c = c2;
            j10 = j20;
            j12 = j15;
        }
        iArr[i8] = (int) j13;
        iArr2[i8] = (int) j14;
    }

    public static final String j(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static void j0(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr3[0];
        int i3 = 1;
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        long j = i2;
        long j2 = iArr[0];
        long j3 = i4;
        long j4 = iArr2[0];
        long j5 = (j3 * j4) + (j * j2);
        long j6 = i5;
        long j7 = i6;
        long j8 = ((j4 * j7) + (j2 * j6)) >> 30;
        int i7 = 1;
        long j9 = j5 >> 30;
        while (i7 < i) {
            long j10 = iArr[i7];
            int i8 = i3;
            long j11 = j6;
            long j12 = iArr2[i7];
            long jI = p61.i(j3, j12, j * j10, j9);
            long j13 = j7;
            long jI2 = p61.i(j13, j12, j11 * j10, j8);
            int i9 = i7 - 1;
            iArr[i9] = ((int) jI) & 1073741823;
            j9 = jI >> 30;
            iArr2[i9] = ((int) jI2) & 1073741823;
            j8 = jI2 >> 30;
            i7++;
            i3 = i8;
            j7 = j13;
            j6 = j11;
        }
        int i10 = i - i3;
        iArr[i10] = (int) j9;
        iArr2[i10] = (int) j8;
    }

    public static Object k0(rn2 rn2Var, Object obj, q51 q51Var) {
        rn2Var.getClass();
        s61 s61VarW = q51Var.w();
        Object ih3Var = s61VarW == b02.X ? new ih3(q51Var) : new jh3(q51Var, s61VarW);
        ci8.i(2, rn2Var);
        return rn2Var.K(obj, ih3Var);
    }

    public static void l0(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iS0 = s0(parcel, i);
        parcel.writeBundle(bundle);
        t0(parcel, iS0);
    }

    public static void m0(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iS0 = s0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        t0(parcel, iS0);
    }

    public static void n(boolean z) {
        if (z) {
            return;
        }
        kp5.e();
    }

    public static void n0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iS0 = s0(parcel, i);
        parcel.writeString(str);
        t0(parcel, iS0);
    }

    public static void o(boolean z, String str) {
        if (z) {
            return;
        }
        bt.q(str);
    }

    public static void o0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iS0 = s0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        t0(parcel, iS0);
    }

    public static void p(String str, int i, int i2, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void p0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iS0 = s0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        t0(parcel, iS0);
    }

    public static void q(int i) {
        if (i >= 0) {
            return;
        }
        kp5.e();
    }

    public static float q0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        b61.i(str);
    }

    public static void r0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void s(String str, boolean z) {
        if (z) {
            return;
        }
        bt.i(str);
    }

    public static int s0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String t(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static void t0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final boolean u(wt1 wt1Var, long j) {
        if (!wt1Var.X.p0) {
            return false;
        }
        fd3 fd3Var = (fd3) yn0.Z(wt1Var).H0.f0;
        if (!fd3Var.e1.p0) {
            return false;
        }
        long jI = fd3Var.I(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
        long j2 = wt1Var.t0;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    public static ww3 v(pw3 pw3Var) {
        boolean z;
        u1 u1Var = pw3Var instanceof u1 ? (u1) pw3Var : null;
        if (u1Var != null) {
            z = u1Var.F();
        }
        if (z) {
            pw3Var = x97.v(pw3Var, pw3Var, false);
        }
        qe4 qe4Var = qe4.q0;
        mh8 mh8VarE = qe4Var.E((u1) pw3Var);
        int iZ = qe4Var.Z(mh8VarE);
        ArrayList arrayList = new ArrayList(iZ);
        for (int i = 0; i < iZ; i++) {
            arrayList.add((rw3) qe4Var.h0(mh8VarE, i));
        }
        if (arrayList.size() == pw3Var.L().size()) {
            return arrayList.isEmpty() ? ww3.c.a(z) : new ww3(zp4.P(wv0.e1(arrayList, pw3Var.L())), z);
        }
        throw new IllegalStateException(("Params vs args count mismatch (" + arrayList.size() + " != " + pw3Var.L().size() + ") for type '" + pw3Var + '\'').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q51 w(q51 q51Var, q51 q51Var2, rn2 rn2Var) {
        rn2Var.getClass();
        if (rn2Var instanceof r10) {
            return ((r10) rn2Var).n(q51Var2, q51Var);
        }
        s61 s61VarW = q51Var2.w();
        return s61VarW == b02.X ? new gh3(q51Var2, q51Var, rn2Var) : new hh3(q51Var2, s61VarW, rn2Var, q51Var);
    }

    public static void x(Object obj, String str, String str2) {
        if (Log.isLoggable(F(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void y(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            while (i2 < Math.min(32, i)) {
                j |= ((long) iArr[i3]) << i2;
                i2 += 30;
                i3++;
            }
            iArr2[i4] = (int) j;
            j >>>= 32;
            i2 -= 32;
            i -= 32;
            i4++;
        }
    }

    public static void z(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (i2 < Math.min(30, i)) {
                j |= (((long) iArr[i3]) & 4294967295L) << i2;
                i2 += 32;
                i3++;
            }
            iArr2[i4] = ((int) j) & 1073741823;
            j >>>= 30;
            i2 -= 30;
            i -= 30;
            i4++;
        }
    }

    public abstract s86 D();

    public abstract dh8 E();

    public boolean M() {
        return E() != null;
    }

    public void X(q1 q1Var, q1 q1Var2) {
        q1Var.b = q1Var2;
    }

    public void Y(q1 q1Var, Thread thread) {
        q1Var.a = thread;
    }

    public boolean k(r1 r1Var, n1 n1Var, n1 n1Var2) {
        synchronized (r1Var) {
            try {
                if (r1Var.Y != n1Var) {
                    return false;
                }
                r1Var.Y = n1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(r1 r1Var, Object obj, Object obj2) {
        synchronized (r1Var) {
            try {
                if (r1Var.X != obj) {
                    return false;
                }
                r1Var.X = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m(r1 r1Var, q1 q1Var, q1 q1Var2) {
        synchronized (r1Var) {
            try {
                if (r1Var.Z != q1Var) {
                    return false;
                }
                r1Var.Z = q1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ea4 extends q67 {
    public final List c;
    public final long d;
    public final long e;

    public ea4(List list, long j, long j2) {
        this.c = list;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.q67
    public final Shader b(long j) {
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        long j2 = this.d;
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i3);
        int i4 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
        long j3 = this.e;
        int i5 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i5);
        int i6 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i6);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        if (list.size() < 2) {
            bt.q("colors must have length of at least 2 if colorStops is omitted.");
            return null;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            int size = list.size();
            long[] jArr = new long[size];
            for (int i8 = 0; i8 < size; i8++) {
                jArr[i8] = g33.U(((dw0) list.get(i8)).a);
            }
            return us2.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, jArr, null, 0);
        }
        if (i7 >= 26) {
            i = 0;
        } else {
            int size2 = list.size() - 1;
            i = 0;
            for (int i9 = 1; i9 < size2; i9++) {
                if (dw0.c(((dw0) list.get(i9)).a) == 0.0f) {
                    i++;
                }
            }
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        if (Build.VERSION.SDK_INT >= 26) {
            int size3 = list.size();
            iArr = new int[size3];
            for (int i10 = 0; i10 < size3; i10++) {
                iArr[i10] = z51.U(((dw0) list.get(i10)).a);
            }
        } else {
            iArr = new int[list.size() + i];
            int size4 = list.size() - 1;
            int size5 = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size5; i12++) {
                long j4 = ((dw0) list.get(i12)).a;
                if (dw0.c(j4) != 0.0f) {
                    i2 = i11 + 1;
                    iArr[i11] = z51.U(j4);
                } else if (i12 == 0) {
                    i2 = i11 + 1;
                    iArr[i11] = z51.U(dw0.b(0.0f, ((dw0) list.get(1)).a));
                } else {
                    if (i12 == size4) {
                        i2 = i11 + 1;
                        iArr[i11] = z51.U(dw0.b(0.0f, ((dw0) list.get(i12 - 1)).a));
                    } else {
                        int i13 = i11 + 1;
                        iArr[i11] = z51.U(dw0.b(0.0f, ((dw0) list.get(i12 - 1)).a));
                        i11 += 2;
                        iArr[i13] = z51.U(dw0.b(0.0f, ((dw0) list.get(i12 + 1)).a));
                    }
                }
                i11 = i2;
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            fArr = null;
        } else {
            float[] fArr2 = new float[list.size() + i];
            fArr2[0] = 0.0f;
            int size6 = list.size() - 1;
            int i14 = 1;
            for (int i15 = 1; i15 < size6; i15++) {
                long j5 = ((dw0) list.get(i15)).a;
                float size7 = i15 / (list.size() - 1);
                int i16 = i14 + 1;
                fArr2[i14] = size7;
                if (dw0.c(j5) == 0.0f) {
                    i14 += 2;
                    fArr2[i16] = size7;
                } else {
                    i14 = i16;
                }
            }
            fArr2[i14] = 1.0f;
            fArr = fArr2;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr2, fArr, x97.Y(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea4)) {
            return false;
        }
        ea4 ea4Var = (ea4) obj;
        return this.c.equals(ea4Var.c) && z85.b(this.d, ea4Var.d) && z85.b(this.e, ea4Var.e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + p61.g(p61.g(this.c.hashCode() * 961, this.d, 31), this.e, 31);
    }

    public final String toString() {
        long j = this.d;
        long j2 = (((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String strP = _UrlKt.FRAGMENT_ENCODE_SET;
        String strP2 = j2 == 0 ? pc6.p("start=", z85.h(j), ", ") : _UrlKt.FRAGMENT_ENCODE_SET;
        long j3 = this.e;
        if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            strP = pc6.p("end=", z85.h(j3), ", ");
        }
        return "LinearGradient(colors=" + this.c + ", stops=null, " + strP2 + strP + "tileMode=Clamp)";
    }
}

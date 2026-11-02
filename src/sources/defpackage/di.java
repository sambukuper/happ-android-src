package defpackage;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class di {
    public int a;
    public Object b;
    public int c;
    public Object d;
    public Object e;

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.d;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            eu.f0(jArr, jArr2, 0, 0, jArr.length);
            eu.h0(0, 0, 14, (int[]) this.b, iArr);
            this.d = jArr2;
            this.b = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.c >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            eu.h0(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.c;
        this.c = iArr2[i7];
        long[] jArr3 = (long[]) this.d;
        jArr3[i3] = j;
        ((int[]) this.b)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (dh3.l(jArr3[i8], j) <= 0) {
                break;
            }
            c(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public float b(TypedArray typedArray, String str, int i, float f) {
        if (a28.i((XmlPullParser) this.d, str)) {
            f = typedArray.getFloat(i, f);
        }
        d(typedArray.getChangingConfigurations());
        return f;
    }

    public void c(int i, int i2) {
        long[] jArr = (long[]) this.d;
        int[] iArr = (int[]) this.b;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void d(int i) {
        this.a = i | this.a;
    }
}

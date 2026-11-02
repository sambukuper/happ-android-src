package defpackage;

import java.lang.ref.SoftReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w33 {
    public int[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public v33 f;

    public final synchronized Object a(int i) {
        Object objA;
        int i2 = this.c;
        if (i2 >= 0) {
            int iBinarySearch = Arrays.binarySearch(this.a, 0, i2, i);
            if (iBinarySearch < 0) {
                return null;
            }
            objA = this.b[iBinarySearch];
        } else {
            objA = this.f.a(b(i));
            if (objA == null) {
                return null;
            }
        }
        if (objA instanceof SoftReference) {
            objA = ((SoftReference) objA).get();
        }
        return objA;
    }

    public final int b(int i) {
        int i2;
        int i3 = i >>> 28;
        if (i3 == 6) {
            i2 = 1;
        } else if (i3 == 5) {
            i2 = 3;
        } else {
            i2 = i3 == 9 ? 2 : 0;
        }
        return (i2 << this.d) | (i & 268435455);
    }

    public final synchronized Object c(int i, int i2, Object obj) {
        int i3 = this.c;
        if (i3 >= 0) {
            boolean z = false;
            int iBinarySearch = Arrays.binarySearch(this.a, 0, i3, i);
            if (iBinarySearch >= 0) {
                Object[] objArr = this.b;
                Object obj2 = objArr[iBinarySearch];
                if ((obj2 instanceof SoftReference) && (obj2 = ((SoftReference) obj2).get()) == null) {
                    objArr[iBinarySearch] = new SoftReference(obj);
                } else {
                    obj = obj2;
                }
                return obj;
            }
            int i4 = this.c;
            if (i4 < 32) {
                int i5 = ~iBinarySearch;
                if (i5 < i4) {
                    int[] iArr = this.a;
                    int i6 = i5 + 1;
                    System.arraycopy(iArr, i5, iArr, i6, i4 - i5);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i5, objArr2, i6, this.c - i5);
                }
                this.c++;
                this.a[i5] = i;
                Object[] objArr3 = this.b;
                if (i2 < 24) {
                    z = true;
                }
                objArr3[i5] = z ? obj : new SoftReference(obj);
                return obj;
            }
            this.f = new v33(this.e, 0);
            for (int i7 = 0; i7 < 32; i7++) {
                this.f.b(b(this.a[i7]), 0, this.b[i7]);
            }
            this.a = null;
            this.b = null;
            this.c = -1;
        }
        return this.f.b(b(i), i2, obj);
    }
}

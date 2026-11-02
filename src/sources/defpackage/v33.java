package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v33 {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final Object[] e;

    public v33(int i, int i2) {
        this.a = i;
        this.b = i2;
        int i3 = 1 << (i & 15);
        this.c = i3 - 1;
        this.d = new int[i3];
        this.e = new Object[i3];
    }

    public final Object a(int i) {
        v33 v33Var;
        int i2 = (i >> this.b) & this.c;
        int i3 = this.d[i2];
        Object[] objArr = this.e;
        if (i3 == i) {
            return objArr[i2];
        }
        if (i3 != 0 || (v33Var = (v33) objArr[i2]) == null) {
            return null;
        }
        return v33Var.a(i);
    }

    public final Object b(int i, int i2, Object obj) {
        int i3 = this.b;
        int i4 = (i >> i3) & this.c;
        int[] iArr = this.d;
        int i5 = iArr[i4];
        Object[] objArr = this.e;
        if (i5 == i) {
            Object obj2 = objArr[i4];
            if (!(obj2 instanceof SoftReference)) {
                return obj2;
            }
            Object obj3 = ((SoftReference) obj2).get();
            if (obj3 != null) {
                return obj3;
            }
            objArr[i4] = new SoftReference(obj);
            return obj;
        }
        if (i5 == 0) {
            v33 v33Var = (v33) objArr[i4];
            if (v33Var != null) {
                return v33Var.b(i, i2, obj);
            }
            iArr[i4] = i;
            objArr[i4] = i2 >= 24 ? new SoftReference(obj) : obj;
            return obj;
        }
        int i6 = this.a;
        int i7 = i3 + (i6 & 15);
        v33 v33Var2 = new v33(i6 >> 4, i7);
        int i8 = (i5 >> i7) & v33Var2.c;
        v33Var2.d[i8] = i5;
        v33Var2.e[i8] = objArr[i4];
        iArr[i4] = 0;
        objArr[i4] = v33Var2;
        return v33Var2.b(i, i2, obj);
    }
}

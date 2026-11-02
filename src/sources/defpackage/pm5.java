package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pm5 extends k2 {
    public final Object[] X;
    public final Object[] Y;
    public final int Z;
    public final int f0;

    public pm5(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.X = objArr;
        this.Y = objArr2;
        this.Z = i;
        this.f0 = i2;
        if (!(a() > 32)) {
            wr5.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] n(Object[] objArr, int i, int i2, Object obj, g4 g4Var) {
        int iF = c18.f(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iF == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            eu.g0(objArr, objArrCopyOf, iF + 1, iF, 31);
            g4Var.a = objArr[31];
            objArrCopyOf[iF] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iF];
        obj2.getClass();
        objArrCopyOf2[iF] = n((Object[]) obj2, i3, i2, obj, g4Var);
        while (true) {
            iF++;
            if (iF >= 32 || objArrCopyOf2[iF] == null) {
                break;
            }
            Object obj3 = objArr[iF];
            obj3.getClass();
            objArrCopyOf2[iF] = n((Object[]) obj3, i3, 0, g4Var.a, g4Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] q(Object[] objArr, int i, int i2, g4 g4Var) {
        Object[] objArrQ;
        int iF = c18.f(i2, i);
        if (i == 5) {
            g4Var.a = objArr[iF];
            objArrQ = null;
        } else {
            Object obj = objArr[iF];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, g4Var);
        }
        if (objArrQ == null && iF == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iF] = objArrQ;
        return objArrCopyOf;
    }

    public static Object[] x(int i, int i2, Object obj, Object[] objArr) {
        int iF = c18.f(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iF] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iF];
        obj2.getClass();
        objArrCopyOf[iF] = x(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z;
    }

    @Override // defpackage.k2
    public final k2 b(int i, Object obj) {
        int i2 = this.Z;
        ch3.m(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iW = w();
        Object[] objArr = this.X;
        if (i >= iW) {
            return o(objArr, i - iW, obj);
        }
        g4 g4Var = new g4(null);
        return o(n(objArr, this.f0, i, obj, g4Var), 0, g4Var.a);
    }

    @Override // defpackage.k2
    public final k2 c(Object obj) {
        int iW = w();
        int i = this.Z;
        int i2 = i - iW;
        Object[] objArr = this.X;
        Object[] objArr2 = this.Y;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new pm5(objArr, objArrCopyOf, i + 1, this.f0);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return r(objArr, objArr2, objArr3);
    }

    @Override // defpackage.k2
    public final rm5 f() {
        return new rm5(this, this.X, this.Y, this.f0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ch3.l(i, a());
        if (w() <= i) {
            objArr = this.Y;
        } else {
            Object[] objArr2 = this.X;
            for (int i2 = this.f0; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[c18.f(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.k2
    public final k2 h(i2 i2Var) {
        rm5 rm5Var = new rm5(this, this.X, this.Y, this.f0);
        rm5Var.H(i2Var);
        return rm5Var.c();
    }

    @Override // defpackage.k2
    public final k2 i(int i) {
        ch3.l(i, a());
        int iW = w();
        int i2 = this.f0;
        Object[] objArr = this.X;
        return i >= iW ? v(objArr, iW, i2, i - iW) : v(t(objArr, i2, i, new g4(this.Y[0])), iW, i2, 0);
    }

    @Override // defpackage.k2
    public final k2 j(int i, Object obj) {
        int i2 = this.Z;
        ch3.l(i, i2);
        int iW = w();
        Object[] objArr = this.X;
        Object[] objArr2 = this.Y;
        int i3 = this.f0;
        if (iW > i) {
            return new pm5(x(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new pm5(objArr, objArrCopyOf, i2, i3);
    }

    @Override // defpackage.z1, java.util.List
    public final ListIterator listIterator(int i) {
        ch3.m(i, this.Z);
        return new tm5(this.X, this.Y, i, this.Z, (this.f0 / 5) + 1);
    }

    public final pm5 o(Object[] objArr, int i, Object obj) {
        int iW = w();
        int i2 = this.Z;
        int i3 = i2 - iW;
        Object[] objArr2 = this.Y;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            eu.g0(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new pm5(objArr, objArrCopyOf, i2 + 1, this.f0);
        }
        Object obj2 = objArr2[31];
        eu.g0(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return r(objArr, objArrCopyOf, objArr3);
    }

    public final pm5 r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.Z;
        int i2 = i >> 5;
        int i3 = this.f0;
        if (i2 <= (1 << i3)) {
            return new pm5(s(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new pm5(s(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] s(int i, Object[] objArr, Object[] objArr2) {
        int iF = c18.f(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iF] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iF] = s(i - 5, (Object[]) objArrCopyOf[iF], objArr2);
        return objArrCopyOf;
    }

    public final Object[] t(Object[] objArr, int i, int i2, g4 g4Var) {
        int iF = c18.f(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iF == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            eu.g0(objArr, objArrCopyOf, iF, iF + 1, 32);
            objArrCopyOf[31] = g4Var.a;
            g4Var.a = objArr[iF];
            return objArrCopyOf;
        }
        int iF2 = objArr[31] == null ? c18.f(w() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iF + 1;
        if (i4 <= iF2) {
            while (true) {
                Object obj = objArrCopyOf2[iF2];
                obj.getClass();
                objArrCopyOf2[iF2] = t((Object[]) obj, i3, 0, g4Var);
                if (iF2 == i4) {
                    break;
                }
                iF2--;
            }
        }
        Object obj2 = objArrCopyOf2[iF];
        obj2.getClass();
        objArrCopyOf2[iF] = t((Object[]) obj2, i3, i2, g4Var);
        return objArrCopyOf2;
    }

    public final k2 v(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.Z - i;
        if (i4 != 1) {
            Object[] objArr2 = this.Y;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                eu.g0(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new pm5(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new fc7(objArr);
        }
        g4 g4Var = new g4(null);
        Object[] objArrQ = q(objArr, i2, i - 1, g4Var);
        objArrQ.getClass();
        Object obj = g4Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrQ[1] != null) {
            return new pm5(objArrQ, objArr3, i, i2);
        }
        Object obj2 = objArrQ[0];
        obj2.getClass();
        return new pm5((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int w() {
        return (this.Z - 1) & (-32);
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class l97 {
    public int[] X;
    public Object[] Y;
    public int Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l97(l97 l97Var) {
        this(0);
        int i = l97Var.Z;
        b(this.Z + i);
        if (this.Z != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(l97Var.g(i2), l97Var.j(i2));
            }
        } else if (i > 0) {
            eu.e0(0, 0, i, l97Var.X, this.X);
            eu.g0(l97Var.Y, this.Y, 0, 0, i << 1);
            this.Z = i;
        }
    }

    public final int a(Object obj) {
        int i = this.Z * 2;
        Object[] objArr = this.Y;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.Z;
        int[] iArr = this.X;
        if (iArr.length < i) {
            this.X = Arrays.copyOf(iArr, i);
            this.Y = Arrays.copyOf(this.Y, i * 2);
        }
        if (this.Z == i2) {
            return;
        }
        bt.c();
    }

    public final int c(int i, Object obj) {
        int i2 = this.Z;
        if (i2 == 0) {
            return -1;
        }
        int iK = w45.k(i2, i, this.X);
        if (iK < 0 || dh3.f(obj, this.Y[iK << 1])) {
            return iK;
        }
        int i3 = iK + 1;
        while (i3 < i2 && this.X[i3] == i) {
            if (dh3.f(obj, this.Y[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iK - 1; i4 >= 0 && this.X[i4] == i; i4--) {
            if (dh3.f(obj, this.Y[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        int i = this.Z;
        if (i > 0) {
            this.X = w45.b;
            this.Y = w45.d;
            i = 0;
            this.Z = 0;
        }
        if (i <= 0) {
            return;
        }
        bt.c();
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int e(Object obj) {
        return obj == null ? f() : c(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l97) {
                int i = this.Z;
                if (i != ((l97) obj).Z) {
                    return false;
                }
                l97 l97Var = (l97) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objG = g(i2);
                    Object objJ = j(i2);
                    Object obj2 = l97Var.get(objG);
                    if (objJ == null) {
                        if (obj2 != null || !l97Var.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.Z != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.Z;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objG2 = g(i4);
                Object objJ2 = j(i4);
                Object obj3 = ((Map) obj).get(objG2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.Z;
        if (i == 0) {
            return -1;
        }
        int iK = w45.k(i, 0, this.X);
        if (iK < 0 || this.Y[iK << 1] == null) {
            return iK;
        }
        int i2 = iK + 1;
        while (i2 < i && this.X[i2] == 0) {
            if (this.Y[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iK - 1; i3 >= 0 && this.X[i3] == 0; i3--) {
            if (this.Y[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object g(int i) {
        boolean z = false;
        if (i >= 0 && i < this.Z) {
            z = true;
        }
        if (z) {
            return this.Y[i << 1];
        }
        bt.q(pc6.j(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.Y[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.Y[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.Z)) {
            bt.q(pc6.j(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.Y;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.X;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                eu.e0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.Y;
                eu.g0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.Y;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.X = Arrays.copyOf(iArr, i7);
            this.Y = Arrays.copyOf(this.Y, i7 << 1);
            if (i2 != this.Z) {
                bt.c();
                return null;
            }
            if (i > 0) {
                eu.e0(0, 0, i, iArr, this.X);
                eu.g0(objArr, this.Y, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                eu.e0(i, i8, i2, iArr, this.X);
                eu.g0(objArr, this.Y, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 == this.Z) {
            this.Z = i4;
            return obj;
        }
        bt.c();
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.X;
        Object[] objArr = this.Y;
        int i = this.Z;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.Z) {
            z = true;
        }
        if (!z) {
            bt.q(pc6.j(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.Y;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.Z <= 0;
    }

    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.Z) {
            z = true;
        }
        if (z) {
            return this.Y[(i << 1) + 1];
        }
        bt.q(pc6.j(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.Z;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : f();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.Y;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.X;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.X = Arrays.copyOf(iArr, i4);
            this.Y = Arrays.copyOf(this.Y, i4 << 1);
            if (i != this.Z) {
                bt.c();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.X;
            int i5 = i3 + 1;
            eu.e0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.Y;
            eu.g0(objArr2, objArr2, i5 << 1, i3 << 1, this.Z << 1);
        }
        int i6 = this.Z;
        if (i == i6) {
            int[] iArr3 = this.X;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.Y;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.Z = i6 + 1;
                return null;
            }
        }
        bt.c();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !dh3.f(obj2, j(iE))) {
            return false;
        }
        h(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !dh3.f(obj2, j(iE))) {
            return false;
        }
        i(iE, obj3);
        return true;
    }

    public final int size() {
        return this.Z;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.Z * 28);
        sb.append('{');
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return h(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE, obj2);
        }
        return null;
    }

    public l97(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = w45.b;
        } else {
            iArr = new int[i];
        }
        this.X = iArr;
        if (i == 0) {
            objArr = w45.d;
        } else {
            objArr = new Object[i << 1];
        }
        this.Y = objArr;
    }
}

package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rm5 extends f2 implements Collection, rv3 {
    public k2 X;
    public Object[] Y;
    public Object[] Z;
    public int f0;
    public k32 g0 = new k32();
    public Object[] h0;
    public Object[] i0;
    public int j0;

    public rm5(k2 k2Var, Object[] objArr, Object[] objArr2, int i) {
        this.X = k2Var;
        this.Y = objArr;
        this.Z = objArr2;
        this.f0 = i;
        this.h0 = objArr;
        this.i0 = objArr2;
        this.j0 = k2Var.a();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.j0;
        int i2 = i >> 5;
        int i3 = this.f0;
        if (i2 > (1 << i3)) {
            this.h0 = B(this.f0 + 5, t(objArr), objArr2);
            this.i0 = objArr3;
            this.f0 += 5;
            this.j0++;
            return;
        }
        if (objArr == null) {
            this.h0 = objArr2;
            this.i0 = objArr3;
            this.j0 = i + 1;
        } else {
            this.h0 = B(i3, objArr, objArr2);
            this.i0 = objArr3;
            this.j0++;
        }
    }

    public final Object[] B(int i, Object[] objArr, Object[] objArr2) {
        int iF = c18.f(a() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iF] = objArr2;
            return objArrQ;
        }
        objArrQ[iF] = B(i - 5, (Object[]) objArrQ[iF], objArr2);
        return objArrQ;
    }

    public final int E(gn2 gn2Var, Object[] objArr, int i, int i2, g4 g4Var, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = g4Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) gn2Var.B(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i2 = 0;
                }
                objArrS[i2] = obj2;
                i2++;
            }
        }
        g4Var.a = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int F(gn2 gn2Var, Object[] objArr, int i, g4 g4Var) {
        Object[] objArrQ = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) gn2Var.B(obj)).booleanValue()) {
                if (!z) {
                    objArrQ = q(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrQ[i2] = obj;
                i2++;
            }
        }
        g4Var.a = objArrQ;
        return i2;
    }

    public final int G(gn2 gn2Var, int i, g4 g4Var) {
        int iF = F(gn2Var, this.i0, i, g4Var);
        Object obj = g4Var.a;
        if (iF == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iF, i, (Object) null);
        this.i0 = objArr;
        this.j0 -= i - iF;
        return iF;
    }

    public final boolean H(gn2 gn2Var) {
        int i;
        gn2 gn2Var2 = gn2Var;
        int iO = O();
        Object[] objArrV = null;
        g4 g4Var = new g4(null);
        boolean z = false;
        if (this.h0 != null) {
            a2 a2VarO = o(0);
            int iF = 32;
            while (iF == 32 && a2VarO.hasNext()) {
                iF = F(gn2Var2, (Object[]) a2VarO.next(), 32, g4Var);
            }
            if (iF == 32) {
                int iG = G(gn2Var2, iO, g4Var);
                if (iG == 0) {
                    x(this.h0, this.j0, this.f0);
                }
                if (iG != iO) {
                }
            } else {
                int i2 = (a2VarO.Y - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iE = iF;
                while (a2VarO.hasNext()) {
                    iE = E(gn2Var2, (Object[]) a2VarO.next(), 32, iE, g4Var, arrayList2, arrayList);
                    gn2Var2 = gn2Var;
                }
                int iE2 = E(gn2Var, this.i0, iO, iE, g4Var, arrayList2, arrayList);
                Object obj = g4Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iE2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrY = this.h0;
                if (zIsEmpty) {
                    objArrY.getClass();
                } else {
                    objArrY = y(objArrY, i2, this.f0, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    wr5.a("invalid size");
                }
                if (size == 0) {
                    this.f0 = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f0;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f0 = i - 5;
                        Object[] objArr2 = objArrY[0];
                        objArr2.getClass();
                        objArrY = objArr2;
                    }
                    objArrV = v(objArrY, i3, i);
                }
                this.h0 = objArrV;
                this.i0 = objArr;
                this.j0 = size + iE2;
            }
            z = true;
        } else if (G(gn2Var2, iO, g4Var) != iO) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] I(Object[] objArr, int i, int i2, g4 g4Var) {
        int iF = c18.f(i2, i);
        if (i == 0) {
            Object obj = objArr[iF];
            Object[] objArrQ = q(objArr);
            eu.g0(objArr, objArrQ, iF, iF + 1, 32);
            objArrQ[31] = g4Var.a;
            g4Var.a = obj;
            return objArrQ;
        }
        int iF2 = objArr[31] == null ? c18.f(L() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        int i4 = iF + 1;
        if (i4 <= iF2) {
            while (true) {
                Object obj2 = objArrQ2[iF2];
                obj2.getClass();
                objArrQ2[iF2] = I((Object[]) obj2, i3, 0, g4Var);
                if (iF2 == i4) {
                    break;
                }
                iF2--;
            }
        }
        Object obj3 = objArrQ2[iF];
        obj3.getClass();
        objArrQ2[iF] = I((Object[]) obj3, i3, i2, g4Var);
        return objArrQ2;
    }

    public final Object K(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.j0 - i;
        Object[] objArr2 = this.i0;
        if (i4 == 1) {
            Object obj = objArr2[0];
            x(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrQ = q(objArr2);
        eu.g0(objArr2, objArrQ, i3, i3 + 1, i4);
        objArrQ[i4 - 1] = null;
        this.h0 = objArr;
        this.i0 = objArrQ;
        this.j0 = (i + i4) - 1;
        this.f0 = i2;
        return obj2;
    }

    public final int L() {
        int i = this.j0;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i, int i2, Object obj, g4 g4Var) {
        int iF = c18.f(i2, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iF];
            obj2.getClass();
            objArrQ[iF] = M((Object[]) obj2, i - 5, i2, obj, g4Var);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        g4Var.a = objArrQ[iF];
        objArrQ[iF] = obj;
        return objArrQ;
    }

    public final void N(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrS;
        if (i3 < 1) {
            wr5.a("requires at least one nullBuffer");
        }
        Object[] objArrQ = q(objArr);
        objArr2[0] = objArrQ;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            eu.g0(objArrQ, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = s();
                i3--;
                objArr2[i3] = objArrS;
            }
            int i7 = i2 - i6;
            eu.g0(objArrQ, objArr3, 0, i7, i2);
            eu.g0(objArrQ, objArrS, size + 1, i4, i7);
            objArr3 = objArrS;
        }
        Iterator it = collection.iterator();
        e(objArrQ, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrS2 = s();
            e(objArrS2, 0, it);
            objArr2[i8] = objArrS2;
        }
        e(objArr3, 0, it);
    }

    public final int O() {
        int i = this.j0;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.f2
    public final int a() {
        return this.j0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ch3.m(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i >= iL) {
            j(this.h0, i - iL, obj);
            return;
        }
        g4 g4Var = new g4(null);
        Object[] objArr = this.h0;
        objArr.getClass();
        j(i(objArr, this.f0, i, obj, g4Var), 0, g4Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrS;
        ch3.m(i, this.j0);
        if (i == this.j0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.j0 - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.i0;
            Object[] objArrQ = q(objArr);
            eu.g0(objArr, objArrQ, size2 + 1, i3, O());
            e(objArrQ, i3, collection.iterator());
            this.i0 = objArrQ;
            this.j0 = collection.size() + this.j0;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iO = O();
        int size3 = collection.size() + this.j0;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= L()) {
            objArrS = s();
            collection2 = collection;
            N(collection2, i, this.i0, iO, objArr2, size, objArrS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.i0;
            if (size3 > iO) {
                int i4 = size3 - iO;
                Object[] objArrR = r(i4, objArr3);
                h(collection2, i, i4, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                objArrS = s();
                int i5 = iO - size3;
                eu.g0(objArr3, objArrS, 0, i5, iO);
                int i6 = 32 - i5;
                Object[] objArrR2 = r(i6, this.i0);
                int i7 = size - 1;
                objArr2[i7] = objArrR2;
                h(collection2, i, i6, objArr2, i7, objArrR2);
                collection2 = collection2;
            }
        }
        this.h0 = z(this.h0, i2, objArr2);
        this.i0 = objArrS;
        this.j0 = collection2.size() + this.j0;
        return true;
    }

    @Override // defpackage.f2
    public final Object b(int i) {
        ch3.l(i, a());
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i >= iL) {
            return K(this.h0, iL, this.f0, i - iL);
        }
        g4 g4Var = new g4(this.i0[0]);
        Object[] objArr = this.h0;
        objArr.getClass();
        K(I(objArr, this.f0, i, g4Var), iL, this.f0, 0);
        return g4Var.a;
    }

    public final k2 c() {
        k2 pm5Var;
        Object[] objArr = this.h0;
        if (objArr == this.Y && this.i0 == this.Z) {
            pm5Var = this.X;
        } else {
            this.g0 = new k32();
            this.Y = objArr;
            Object[] objArr2 = this.i0;
            this.Z = objArr2;
            if (objArr == null) {
                pm5Var = objArr2.length == 0 ? fc7.Y : new fc7(Arrays.copyOf(objArr2, this.j0));
            } else {
                pm5Var = new pm5(objArr, objArr2, this.j0, this.f0);
            }
        }
        this.X = pm5Var;
        return pm5Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ch3.l(i, a());
        if (L() <= i) {
            objArr = this.i0;
        } else {
            Object[] objArr2 = this.h0;
            objArr2.getClass();
            for (int i2 = this.f0; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[c18.f(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.h0 == null) {
            bt.i("root is null");
            return;
        }
        int i4 = i >> 5;
        a2 a2VarO = o(L() >> 5);
        int i5 = i3;
        Object[] objArrR = objArr2;
        while (a2VarO.Y - 1 != i4) {
            Object[] objArr3 = (Object[]) a2VarO.previous();
            eu.g0(objArr3, objArrR, 0, 32 - i2, 32);
            objArrR = r(i2, objArr3);
            i5--;
            objArr[i5] = objArrR;
        }
        Object[] objArr4 = (Object[]) a2VarO.previous();
        int iL = i3 - (((L() >> 5) - 1) - i4);
        if (iL < i3) {
            objArr2 = objArr[iL];
            objArr2.getClass();
        }
        N(collection, i, objArr4, 32, objArr, iL, objArr2);
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, g4 g4Var) {
        Object obj2;
        int iF = c18.f(i2, i);
        if (i == 0) {
            g4Var.a = objArr[31];
            Object[] objArrQ = q(objArr);
            eu.g0(objArr, objArrQ, iF + 1, iF, 31);
            objArrQ[iF] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        Object obj3 = objArrQ2[iF];
        obj3.getClass();
        objArrQ2[iF] = i((Object[]) obj3, i3, i2, obj, g4Var);
        while (true) {
            iF++;
            if (iF >= 32 || (obj2 = objArrQ2[iF]) == null) {
                break;
            }
            objArrQ2[iF] = i((Object[]) obj2, i3, 0, g4Var.a, g4Var);
        }
        return objArrQ2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Object[] objArr, int i, Object obj) {
        int iO = O();
        Object[] objArrQ = q(this.i0);
        Object[] objArr2 = this.i0;
        if (iO >= 32) {
            Object obj2 = objArr2[31];
            eu.g0(objArr2, objArrQ, i + 1, i, 31);
            objArrQ[i] = obj;
            A(objArr, objArrQ, t(obj2));
            return;
        }
        eu.g0(objArr2, objArrQ, i + 1, i, iO);
        objArrQ[i] = obj;
        this.h0 = objArr;
        this.i0 = objArrQ;
        this.j0++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ch3.m(i, this.j0);
        return new vm5(this, i);
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.g0;
    }

    public final a2 o(int i) {
        Object[] objArr = this.h0;
        if (objArr == null) {
            bt.i("Invalid root");
            return null;
        }
        int iL = L() >> 5;
        ch3.m(i, iL);
        int i2 = this.f0;
        return i2 == 0 ? new k90(objArr, i) : new hf8(objArr, i, iL, i2 / 5);
    }

    public final Object[] q(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        eu.i0(objArr, objArrS, 0, length, 6);
        return objArrS;
    }

    public final Object[] r(int i, Object[] objArr) {
        if (n(objArr)) {
            eu.g0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrS = s();
        eu.g0(objArr, objArrS, i, 0, 32 - i);
        return objArrS;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return H(new i2(collection, (byte) 2));
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.g0;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ch3.l(i, a());
        if (L() > i) {
            g4 g4Var = new g4(null);
            Object[] objArr = this.h0;
            objArr.getClass();
            this.h0 = M(objArr, this.f0, i, obj, g4Var);
            return g4Var.a;
        }
        Object[] objArrQ = q(this.i0);
        if (objArrQ != this.i0) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrQ[i2];
        objArrQ[i2] = obj;
        this.i0 = objArrQ;
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.g0;
        return objArr;
    }

    public final Object[] v(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            wr5.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iF = c18.f(i, i2);
        Object obj = objArr[iF];
        obj.getClass();
        Object objV = v((Object[]) obj, i, i2 - 5);
        if (iF < 31) {
            int i3 = iF + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrS = s();
                eu.g0(objArr, objArrS, 0, 0, i3);
                objArr = objArrS;
            }
        }
        if (objV == objArr[iF]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iF] = objV;
        return objArrQ;
    }

    public final Object[] w(Object[] objArr, int i, int i2, g4 g4Var) {
        Object[] objArrW;
        int iF = c18.f(i2 - 1, i);
        if (i == 5) {
            g4Var.a = objArr[iF];
            objArrW = null;
        } else {
            Object obj = objArr[iF];
            obj.getClass();
            objArrW = w((Object[]) obj, i - 5, i2, g4Var);
        }
        if (objArrW == null && iF == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iF] = objArrW;
        return objArrQ;
    }

    public final void x(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.h0 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.i0 = objArr;
            this.j0 = i;
            this.f0 = i2;
            return;
        }
        g4 g4Var = new g4(null);
        objArr.getClass();
        Object[] objArrW = w(objArr, i2, i, g4Var);
        objArrW.getClass();
        Object obj = g4Var.a;
        obj.getClass();
        this.i0 = (Object[]) obj;
        this.j0 = i;
        if (objArrW[1] == null) {
            this.h0 = (Object[]) objArrW[0];
            this.f0 = i2 - 5;
        } else {
            this.h0 = objArrW;
            this.f0 = i2;
        }
    }

    public final Object[] y(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            wr5.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            wr5.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iF = c18.f(i, i2);
        int i3 = i2 - 5;
        objArrQ[iF] = y((Object[]) objArrQ[iF], i, i3, it);
        while (true) {
            iF++;
            if (iF >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iF] = y((Object[]) objArrQ[iF], 0, i3, it);
        }
        return objArrQ;
    }

    public final Object[] z(Object[] objArr, int i, Object[][] objArr2) {
        w1 w1Var = new w1(objArr2);
        int i2 = i >> 5;
        int i3 = this.f0;
        Object[] objArrY = i2 < (1 << i3) ? y(objArr, i, i3, w1Var) : q(objArr);
        while (w1Var.hasNext()) {
            this.f0 += 5;
            objArrY = t(objArrY);
            int i4 = this.f0;
            y(objArrY, 1 << i4, i4, w1Var);
        }
        return objArrY;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrQ = q(this.i0);
            objArrQ[iO] = obj;
            this.i0 = objArrQ;
            this.j0 = a() + 1;
        } else {
            A(this.h0, this.i0, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator it = collection.iterator();
        if (32 - iO >= collection.size()) {
            Object[] objArrQ = q(this.i0);
            e(objArrQ, iO, it);
            this.i0 = objArrQ;
            this.j0 = collection.size() + this.j0;
            return true;
        }
        int size = ((collection.size() + iO) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.i0);
        e(objArrQ2, iO, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            e(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        this.h0 = z(this.h0, L(), objArr);
        Object[] objArrS2 = s();
        e(objArrS2, 0, it);
        this.i0 = objArrS2;
        this.j0 = collection.size() + this.j0;
        return true;
    }
}

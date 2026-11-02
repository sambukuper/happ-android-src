package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qm5 extends f2 implements Collection, rv3 {
    public int X;
    public j2 Y;
    public k42 Z;
    public Object[] f0;
    public Object[] g0;
    public int h0;

    public qm5(j2 j2Var, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.X = i;
        this.Y = j2Var;
        this.Z = new k42();
        this.f0 = objArr;
        this.g0 = objArr2;
        this.h0 = j2Var.a();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h0 >> 5;
        int i2 = this.X;
        if (i > (1 << i2)) {
            M(B(this.X + 5, t(objArr), objArr2));
            N(objArr3);
            this.X += 5;
            this.h0++;
            return;
        }
        if (objArr == null) {
            M(objArr2);
            N(objArr3);
            this.h0++;
        } else {
            M(B(i2, objArr, objArr2));
            N(objArr3);
            this.h0++;
        }
    }

    public final Object[] B(int i, Object[] objArr, Object[] objArr2) {
        int iH = y08.h(a() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iH] = objArr2;
            return objArrQ;
        }
        objArrQ[iH] = B(i - 5, (Object[]) objArrQ[iH], objArr2);
        return objArrQ;
    }

    public final int E(i2 i2Var, Object[] objArr, int i, int i2, f4 f4Var, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = f4Var.X;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) i2Var.B(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i2 = 0;
                }
                objArrS[i2] = obj2;
                i2++;
            }
        }
        f4Var.X = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int F(i2 i2Var, Object[] objArr, int i, f4 f4Var) {
        Object[] objArrQ = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) i2Var.B(obj)).booleanValue()) {
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
        f4Var.X = objArrQ;
        return i2;
    }

    public final int G(i2 i2Var, int i, f4 f4Var) {
        int iF = F(i2Var, this.g0, i, f4Var);
        if (iF == i) {
            return i;
        }
        Object obj = f4Var.X;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iF, i, (Object) null);
        N(objArr);
        this.h0 -= i - iF;
        return iF;
    }

    public final Object[] H(Object[] objArr, int i, int i2, f4 f4Var) {
        int iH = y08.h(i2, i);
        if (i == 0) {
            Object obj = objArr[iH];
            Object[] objArrQ = q(objArr);
            eu.g0(objArr, objArrQ, iH, iH + 1, 32);
            objArrQ[31] = f4Var.X;
            f4Var.X = obj;
            return objArrQ;
        }
        int iH2 = objArr[31] == null ? y08.h(K() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        int i4 = iH + 1;
        if (i4 <= iH2) {
            while (true) {
                Object obj2 = objArrQ2[iH2];
                obj2.getClass();
                objArrQ2[iH2] = H((Object[]) obj2, i3, 0, f4Var);
                if (iH2 == i4) {
                    break;
                }
                iH2--;
            }
        }
        Object obj3 = objArrQ2[iH];
        obj3.getClass();
        objArrQ2[iH] = H((Object[]) obj3, i3, i2, f4Var);
        return objArrQ2;
    }

    public final Object I(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h0 - i;
        Object[] objArr2 = this.g0;
        if (i4 == 1) {
            Object obj = objArr2[0];
            x(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrQ = q(objArr2);
        eu.g0(objArr2, objArrQ, i3, i3 + 1, i4);
        objArrQ[i4 - 1] = null;
        M(objArr);
        N(objArrQ);
        this.h0 = (i + i4) - 1;
        this.X = i2;
        return obj2;
    }

    public final int K() {
        int i = this.h0;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] L(Object[] objArr, int i, int i2, Object obj, f4 f4Var) {
        int iH = y08.h(i2, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iH];
            obj2.getClass();
            objArrQ[iH] = L((Object[]) obj2, i - 5, i2, obj, f4Var);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        f4Var.X = objArrQ[iH];
        objArrQ[iH] = obj;
        return objArrQ;
    }

    public final void M(Object[] objArr) {
        if (objArr != this.f0) {
            this.Y = null;
            this.f0 = objArr;
        }
    }

    public final void N(Object[] objArr) {
        if (objArr != this.g0) {
            this.Y = null;
            this.g0 = objArr;
        }
    }

    public final void O(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrS;
        if (i3 < 1) {
            bt.i("Check failed.");
            return;
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

    public final int P() {
        int i = this.h0;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.f2
    public final int a() {
        return this.h0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g33.g(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iK = K();
        if (i >= iK) {
            j(this.f0, i - iK, obj);
            return;
        }
        f4 f4Var = new f4(null);
        Object[] objArr = this.f0;
        objArr.getClass();
        j(h(objArr, this.X, i, obj, f4Var), 0, f4Var.X);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrS;
        collection.getClass();
        g33.g(i, this.h0);
        if (i == this.h0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h0 - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g0;
            Object[] objArrQ = q(objArr);
            eu.g0(objArr, objArrQ, size2 + 1, i3, P());
            e(objArrQ, i3, collection.iterator());
            N(objArrQ);
            this.h0 = collection.size() + this.h0;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iP = P();
        int size3 = collection.size() + this.h0;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= K()) {
            objArrS = s();
            collection2 = collection;
            O(collection2, i, this.g0, iP, objArr2, size, objArrS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g0;
            if (size3 > iP) {
                int i4 = size3 - iP;
                Object[] objArrR = r(i4, objArr3);
                i(collection2, i, i4, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                objArrS = s();
                int i5 = iP - size3;
                eu.g0(objArr3, objArrS, 0, i5, iP);
                int i6 = 32 - i5;
                Object[] objArrR2 = r(i6, this.g0);
                int i7 = size - 1;
                objArr2[i7] = objArrR2;
                i(collection2, i, i6, objArr2, i7, objArrR2);
                collection2 = collection2;
            }
        }
        M(z(this.f0, i2, objArr2));
        N(objArrS);
        this.h0 = collection2.size() + this.h0;
        return true;
    }

    @Override // defpackage.f2
    public final Object b(int i) {
        g33.f(i, a());
        ((AbstractList) this).modCount++;
        int iK = K();
        if (i >= iK) {
            return I(this.f0, iK, this.X, i - iK);
        }
        f4 f4Var = new f4(this.g0[0]);
        Object[] objArr = this.f0;
        objArr.getClass();
        I(H(objArr, this.X, i, f4Var), iK, this.X, 0);
        return f4Var.X;
    }

    public final j2 c() {
        j2 om5Var = this.Y;
        if (om5Var == null) {
            Object[] objArr = this.f0;
            Object[] objArr2 = this.g0;
            this.Z = new k42();
            if (objArr == null) {
                om5Var = objArr2.length == 0 ? ec7.Y : new ec7(Arrays.copyOf(objArr2, this.h0));
            } else {
                om5Var = new om5(objArr, objArr2, this.h0, this.X);
            }
            this.Y = om5Var;
        }
        return om5Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        g33.f(i, a());
        if (K() <= i) {
            objArr = this.g0;
        } else {
            Object[] objArr2 = this.f0;
            objArr2.getClass();
            for (int i2 = this.X; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[y08.h(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, f4 f4Var) {
        Object obj2;
        int iH = y08.h(i2, i);
        if (i == 0) {
            f4Var.X = objArr[31];
            Object[] objArrQ = q(objArr);
            eu.g0(objArr, objArrQ, iH + 1, iH, 31);
            objArrQ[iH] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        Object obj3 = objArrQ2[iH];
        obj3.getClass();
        objArrQ2[iH] = h((Object[]) obj3, i3, i2, obj, f4Var);
        while (true) {
            iH++;
            if (iH >= 32 || (obj2 = objArrQ2[iH]) == null) {
                break;
            }
            objArrQ2[iH] = h((Object[]) obj2, i3, 0, f4Var.X, f4Var);
        }
        return objArrQ2;
    }

    public final void i(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f0 == null) {
            bt.i("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        a2 a2VarO = o(K() >> 5);
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
        int iK = i3 - (((K() >> 5) - 1) - i4);
        if (iK < i3) {
            objArr2 = objArr[iK];
            objArr2.getClass();
        }
        O(collection, i, objArr4, 32, objArr, iK, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Object[] objArr, int i, Object obj) {
        int iP = P();
        Object[] objArrQ = q(this.g0);
        Object[] objArr2 = this.g0;
        if (iP >= 32) {
            Object obj2 = objArr2[31];
            eu.g0(objArr2, objArrQ, i + 1, i, 31);
            objArrQ[i] = obj;
            A(objArr, objArrQ, t(obj2));
            return;
        }
        eu.g0(objArr2, objArrQ, i + 1, i, iP);
        objArrQ[i] = obj;
        M(objArr);
        N(objArrQ);
        this.h0++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g33.g(i, this.h0);
        return new um5(this, i);
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.Z;
    }

    public final a2 o(int i) {
        if (this.f0 == null) {
            bt.i("Required value was null.");
            return null;
        }
        int iK = K() >> 5;
        g33.g(i, iK);
        int i2 = this.X;
        Object[] objArr = this.f0;
        if (i2 == 0) {
            objArr.getClass();
            return new j90(objArr, i);
        }
        objArr.getClass();
        return new gf8(objArr, i, iK, i2 / 5);
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

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        qm5 qm5Var;
        int i;
        collection.getClass();
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        i2 i2Var = new i2(collection, (byte) 1);
        int iP = P();
        Object[] objArrV = null;
        f4 f4Var = new f4(null);
        if (this.f0 != null) {
            a2 a2VarO = o(0);
            int iF = 32;
            while (iF == 32 && a2VarO.hasNext()) {
                iF = F(i2Var, (Object[]) a2VarO.next(), 32, f4Var);
            }
            if (iF == 32) {
                int iG = G(i2Var, iP, f4Var);
                if (iG == 0) {
                    x(this.f0, this.h0, this.X);
                }
                if (iG != iP) {
                    qm5Var = this;
                } else {
                    qm5Var = this;
                }
            } else {
                int i2 = (a2VarO.Y - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iE = iF;
                while (a2VarO.hasNext()) {
                    iE = E(i2Var, (Object[]) a2VarO.next(), 32, iE, f4Var, arrayList2, arrayList);
                }
                qm5Var = this;
                int iE2 = qm5Var.E(i2Var, qm5Var.g0, iP, iE, f4Var, arrayList2, arrayList);
                Object obj = f4Var.X;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iE2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrY = qm5Var.f0;
                if (zIsEmpty) {
                    objArrY.getClass();
                } else {
                    objArrY = qm5Var.y(objArrY, i2, qm5Var.X, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    bt.i("Check failed.");
                    return false;
                }
                if (size == 0) {
                    qm5Var.X = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = qm5Var.X;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        qm5Var.X = i - 5;
                        Object[] objArr2 = objArrY[0];
                        objArr2.getClass();
                        objArrY = objArr2;
                    }
                    objArrV = qm5Var.v(objArrY, i3, i);
                }
                qm5Var.M(objArrV);
                qm5Var.N(objArr);
                qm5Var.h0 = size + iE2;
            }
            z = true;
        } else if (G(i2Var, iP, f4Var) != iP) {
            qm5Var = this;
            z = true;
        } else {
            qm5Var = this;
        }
        if (z) {
            ((AbstractList) qm5Var).modCount++;
        }
        return z;
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.Z;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g33.f(i, a());
        if (K() > i) {
            f4 f4Var = new f4(null);
            Object[] objArr = this.f0;
            objArr.getClass();
            M(L(objArr, this.X, i, obj, f4Var));
            return f4Var.X;
        }
        Object[] objArrQ = q(this.g0);
        if (objArrQ != this.g0) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrQ[i2];
        objArrQ[i2] = obj;
        N(objArrQ);
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.Z;
        return objArr;
    }

    public final Object[] v(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            bt.i("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iH = y08.h(i, i2);
        Object obj = objArr[iH];
        obj.getClass();
        Object objV = v((Object[]) obj, i, i2 - 5);
        if (iH < 31) {
            int i3 = iH + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrS = s();
                eu.g0(objArr, objArrS, 0, 0, i3);
                objArr = objArrS;
            }
        }
        if (objV == objArr[iH]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iH] = objV;
        return objArrQ;
    }

    public final Object[] w(Object[] objArr, int i, int i2, f4 f4Var) {
        Object[] objArrW;
        int iH = y08.h(i2 - 1, i);
        if (i == 5) {
            f4Var.X = objArr[iH];
            objArrW = null;
        } else {
            Object obj = objArr[iH];
            obj.getClass();
            objArrW = w((Object[]) obj, i - 5, i2, f4Var);
        }
        if (objArrW == null && iH == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iH] = objArrW;
        return objArrQ;
    }

    public final void x(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            M(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            N(objArr);
            this.h0 = i;
            this.X = i2;
            return;
        }
        f4 f4Var = new f4(null);
        objArr.getClass();
        Object[] objArrW = w(objArr, i2, i, f4Var);
        objArrW.getClass();
        Object obj = f4Var.X;
        obj.getClass();
        N((Object[]) obj);
        this.h0 = i;
        if (objArrW[1] == null) {
            M((Object[]) objArrW[0]);
            this.X = i2 - 5;
        } else {
            M(objArrW);
            this.X = i2;
        }
    }

    public final Object[] y(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            bt.i("Check failed.");
            return null;
        }
        if (i2 < 0) {
            bt.i("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iH = y08.h(i, i2);
        int i3 = i2 - 5;
        objArrQ[iH] = y((Object[]) objArrQ[iH], i, i3, it);
        while (true) {
            iH++;
            if (iH >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iH] = y((Object[]) objArrQ[iH], 0, i3, it);
        }
        return objArrQ;
    }

    public final Object[] z(Object[] objArr, int i, Object[][] objArr2) {
        w1 w1Var = new w1(objArr2);
        int i2 = i >> 5;
        int i3 = this.X;
        Object[] objArrY = i2 < (1 << i3) ? y(objArr, i, i3, w1Var) : q(objArr);
        while (w1Var.hasNext()) {
            this.X += 5;
            objArrY = t(objArrY);
            int i4 = this.X;
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
        int iP = P();
        if (iP < 32) {
            Object[] objArrQ = q(this.g0);
            objArrQ[iP] = obj;
            N(objArrQ);
            this.h0 = a() + 1;
        } else {
            A(this.f0, this.g0, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iP = P();
        Iterator it = collection.iterator();
        if (32 - iP >= collection.size()) {
            Object[] objArrQ = q(this.g0);
            e(objArrQ, iP, it);
            N(objArrQ);
            this.h0 = collection.size() + this.h0;
            return true;
        }
        int size = ((collection.size() + iP) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.g0);
        e(objArrQ2, iP, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            e(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        M(z(this.f0, K(), objArr));
        Object[] objArrS2 = s();
        e(objArrS2, 0, it);
        N(objArrS2);
        this.h0 = collection.size() + this.h0;
        return true;
    }
}

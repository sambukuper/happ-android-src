package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fc7 extends k2 {
    public static final fc7 Y = new fc7(new Object[0]);
    public final Object[] X;

    public fc7(Object[] objArr) {
        this.X = objArr;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.X.length;
    }

    @Override // defpackage.k2
    public final k2 b(int i, Object obj) {
        Object[] objArr = this.X;
        ch3.m(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            eu.i0(objArr, objArr2, 0, i, 6);
            eu.g0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new fc7(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        eu.g0(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new pm5(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.k2
    public final k2 c(Object obj) {
        Object[] objArr = this.X;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new fc7(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new pm5(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.k2
    public final k2 e(Collection collection) {
        Object[] objArr = this.X;
        if (collection.size() + objArr.length > 32) {
            rm5 rm5VarF = f();
            rm5VarF.addAll(collection);
            return rm5VarF.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new fc7(objArrCopyOf);
    }

    @Override // defpackage.k2
    public final rm5 f() {
        return new rm5(this, null, this.X, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.X;
        ch3.l(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.k2
    public final k2 h(i2 i2Var) {
        Object[] objArr = this.X;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) i2Var.B(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? Y : new fc7(eu.k0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.k2
    public final k2 i(int i) {
        Object[] objArr = this.X;
        ch3.l(i, objArr.length);
        if (objArr.length == 1) {
            return Y;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        eu.g0(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new fc7(objArrCopyOf);
    }

    @Override // defpackage.z1, java.util.List
    public final int indexOf(Object obj) {
        return eu.v0(obj, this.X);
    }

    @Override // defpackage.k2
    public final k2 j(int i, Object obj) {
        Object[] objArr = this.X;
        ch3.l(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new fc7(objArrCopyOf);
    }

    @Override // defpackage.z1, java.util.List
    public final int lastIndexOf(Object obj) {
        return eu.z0(obj, this.X);
    }

    @Override // defpackage.z1, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.X;
        ch3.m(i, objArr.length);
        return new k90(objArr, i, objArr.length);
    }
}

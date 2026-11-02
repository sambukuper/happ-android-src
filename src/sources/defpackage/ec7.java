package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import su.happ.proxyutility.dto.ServerCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ec7 extends j2 {
    public static final ec7 Y = new ec7(new Object[0]);
    public final Object[] X;

    public ec7(Object[] objArr) {
        this.X = objArr;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.X.length;
    }

    @Override // defpackage.j2
    public final j2 b(ServerCache serverCache) {
        Object[] objArr = this.X;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = serverCache;
            return new ec7(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = serverCache;
        return new om5(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.j2
    public final qm5 c() {
        return new qm5(this, null, this.X, 0);
    }

    public final j2 e(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.X;
        if (collection.size() + objArr.length > 32) {
            qm5 qm5VarC = c();
            qm5VarC.addAll(collection);
            return qm5VarC.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new ec7(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.X;
        g33.f(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.z1, java.util.List
    public final int indexOf(Object obj) {
        return eu.v0(obj, this.X);
    }

    @Override // defpackage.z1, java.util.List
    public final int lastIndexOf(Object obj) {
        return eu.z0(obj, this.X);
    }

    @Override // defpackage.z1, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.X;
        g33.g(i, objArr.length);
        return new j90(objArr, i, objArr.length);
    }
}

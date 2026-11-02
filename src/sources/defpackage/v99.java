package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v99 extends t99 {
    public static final v99 g0 = new v99(0, new Object[0]);
    public final transient Object[] Z;
    public final transient int f0;

    public v99(int i, Object[] objArr) {
        this.Z = objArr;
        this.f0 = i;
    }

    @Override // defpackage.o99
    public final Object[] a() {
        return this.Z;
    }

    @Override // defpackage.o99
    public final int b() {
        return 0;
    }

    @Override // defpackage.o99
    public final int c() {
        return this.f0;
    }

    @Override // defpackage.t99, defpackage.o99
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.Z;
        int i = this.f0;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z38.e(i, this.f0);
        Object obj = this.Z[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f0;
    }
}

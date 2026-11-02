package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class od5 extends z1 implements RandomAccess {
    public final kb0[] X;
    public final int[] Y;

    public od5(kb0[] kb0VarArr, int[] iArr) {
        this.X = kb0VarArr;
        this.Y = iArr;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.X.length;
    }

    @Override // defpackage.z0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof kb0) {
            return super.contains((kb0) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.X[i];
    }

    @Override // defpackage.z1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof kb0) {
            return super.indexOf((kb0) obj);
        }
        return -1;
    }

    @Override // defpackage.z1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof kb0) {
            return super.lastIndexOf((kb0) obj);
        }
        return -1;
    }
}

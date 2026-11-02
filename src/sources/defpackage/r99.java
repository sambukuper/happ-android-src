package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r99 extends t99 {
    public final transient t99 Z;

    public r99(t99 t99Var) {
        this.Z = t99Var;
    }

    @Override // defpackage.t99, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.Z.contains(obj);
    }

    @Override // defpackage.t99
    public final t99 e() {
        return this.Z;
    }

    @Override // defpackage.t99, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final t99 subList(int i, int i2) {
        t99 t99Var = this.Z;
        z38.f(i, i2, t99Var.size());
        return t99Var.subList(t99Var.size() - i2, t99Var.size() - i).e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        t99 t99Var = this.Z;
        z38.e(i, t99Var.size());
        return t99Var.get((t99Var.size() - 1) - i);
    }

    @Override // defpackage.t99, java.util.List
    public final int indexOf(Object obj) {
        t99 t99Var = this.Z;
        int iLastIndexOf = t99Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (t99Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.t99, java.util.List
    public final int lastIndexOf(Object obj) {
        t99 t99Var = this.Z;
        int iIndexOf = t99Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (t99Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z.size();
    }
}

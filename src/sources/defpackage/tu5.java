package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tu5 extends AbstractCollection {
    public final /* synthetic */ wu5 X;

    public tu5(wu5 wu5Var) {
        this.X = wu5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qu5(this.X, (byte) 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.X.X.size();
    }
}

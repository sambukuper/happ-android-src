package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class on8 extends AbstractList implements RandomAccess, t74 {
    public final s74 X;

    public on8(s74 s74Var) {
        this.X = s74Var;
    }

    @Override // defpackage.t74
    public final void D(mc4 mc4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t74
    public final List g() {
        return Collections.unmodifiableList(this.X.X);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.X.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        nn8 nn8Var = new nn8();
        nn8Var.X = this.X.iterator();
        return nn8Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        mn8 mn8Var = new mn8();
        mn8Var.X = this.X.listIterator(i);
        return mn8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }

    @Override // defpackage.t74
    public final jb0 u(int i) {
        return this.X.u(i);
    }

    @Override // defpackage.t74
    public final on8 C() {
        return this;
    }
}

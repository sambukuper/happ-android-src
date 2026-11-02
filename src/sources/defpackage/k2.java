package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k2 extends z1 {
    public abstract k2 b(int i, Object obj);

    public abstract k2 c(Object obj);

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.z0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public k2 e(Collection collection) {
        rm5 rm5VarF = f();
        rm5VarF.addAll(collection);
        return rm5VarF.c();
    }

    public abstract rm5 f();

    public abstract k2 h(i2 i2Var);

    public abstract k2 i(int i);

    @Override // defpackage.z1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract k2 j(int i, Object obj);

    @Override // defpackage.z1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.z1, java.util.List
    public final List subList(int i, int i2) {
        return new a83(this, i, i2);
    }
}

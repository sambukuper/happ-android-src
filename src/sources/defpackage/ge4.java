package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ge4 implements Collection, qv3 {
    public static final ge4 Z = new ge4(d02.X);
    public final List X;
    public final int Y;

    public ge4(List list) {
        this.X = list;
        this.Y = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ce4)) {
            return false;
        }
        return this.X.contains((ce4) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.X.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ge4) {
            return this.X.equals(((ge4) obj).X);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.X.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.Y;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wl7.Z(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.X + ")";
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wl7.a0(this, objArr);
    }
}

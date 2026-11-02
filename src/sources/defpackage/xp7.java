package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xp7 implements Collection, qv3 {
    public final /* synthetic */ byte X = 0;
    public final Object Y;

    public xp7() {
        int i = rd5.a;
        this.Y = new l05(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.X) {
            case 0:
                return ((l05) this.Y).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.X) {
            case 0:
                ((l05) this.Y).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                return ((l05) obj2).c(obj);
            default:
                return ((s05) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((l05) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((s05) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((l05) obj).g == 0;
            default:
                return ((s05) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.X) {
            case 0:
                return new fq2(new n05((l05) this.Y));
            default:
                return jm4.P(new h22(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.X) {
            case 0:
                return ((l05) this.Y).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.X) {
            case 0:
                return ((l05) this.Y).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.X) {
            case 0:
                return ((l05) this.Y).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((l05) obj).g;
            default:
                return ((s05) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.X) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return wl7.a0(this, objArr);
    }

    public xp7(s05 s05Var) {
        this.Y = s05Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.X) {
            case 0:
                break;
        }
        return wl7.Z(this);
    }
}

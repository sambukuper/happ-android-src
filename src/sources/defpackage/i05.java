package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i05 implements List, sv3 {
    public final /* synthetic */ byte X;
    public final List Y;
    public final int Z;
    public int f0;

    public /* synthetic */ i05(List list, int i, int i2, byte b) {
        this.X = b;
        this.Y = list;
        this.Z = i;
        this.f0 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.X;
        int i2 = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                list.add(i + i2, obj);
                this.f0++;
                break;
            default:
                list.add(i + i2, obj);
                this.f0++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.X;
        int i2 = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(i + i2, collection);
                this.f0 = collection.size() + this.f0;
                return collection.size() > 0;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.f0 += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.X;
        List list = this.Y;
        int i = this.Z;
        switch (b) {
            case 0:
                int i2 = this.f0 - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.f0 = i;
                break;
            default:
                int i3 = this.f0 - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.f0 = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        List list = this.Y;
        int i = this.Z;
        switch (b) {
            case 0:
                int i2 = this.f0;
                while (i < i2) {
                    if (dh3.f(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.f0;
                while (i < i3) {
                    if (dh3.f(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.X) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.X;
        int i2 = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                h85.a(i, this);
                break;
            default:
                d15.a(i, this);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.X;
        List list = this.Y;
        int i = this.Z;
        switch (b) {
            case 0:
                int i2 = this.f0;
                for (int i3 = i; i3 < i2; i3++) {
                    if (dh3.f(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.f0;
                for (int i5 = i; i5 < i4; i5++) {
                    if (dh3.f(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.X) {
            case 0:
                return this.f0 == this.Z;
            default:
                return this.f0 == this.Z;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.X) {
            case 0:
                return new g05(this, 0, (byte) 0);
            default:
                return new g05(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.X;
        List list = this.Y;
        int i = this.Z;
        switch (b) {
            case 0:
                int i2 = this.f0 - 1;
                if (i > i2) {
                    return -1;
                }
                while (!dh3.f(list.get(i2), obj)) {
                    if (i2 == i) {
                        return -1;
                    }
                    i2--;
                }
                return i2 - i;
            default:
                int i3 = this.f0 - 1;
                if (i > i3) {
                    return -1;
                }
                while (!dh3.f(list.get(i3), obj)) {
                    if (i3 == i) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.X) {
            case 0:
                return new g05(this, 0, (byte) 0);
            default:
                return new g05(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.X;
        int i = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                int i2 = this.f0;
                while (i < i2) {
                    if (dh3.f(list.get(i), obj)) {
                        list.remove(i);
                        this.f0--;
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.f0;
                while (i < i3) {
                    if (dh3.f(list.get(i), obj)) {
                        list.remove(i);
                        this.f0--;
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.X) {
            case 0:
                collection.getClass();
                int i = this.f0;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f0;
            default:
                int i2 = this.f0;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.X;
        int i = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                int i2 = this.f0;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.f0--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                return i2 != this.f0;
            default:
                int i4 = this.f0;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.f0--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                return i4 != this.f0;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.X;
        int i2 = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                h85.a(i, this);
                break;
            default:
                d15.a(i, this);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.X) {
            case 0:
                i = this.f0;
                i2 = this.Z;
                break;
            default:
                i = this.f0;
                i2 = this.Z;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.X) {
            case 0:
                h85.b(i, i2, this);
                return new i05(this, i, i2, (byte) 0);
            default:
                d15.b(i, i2, this);
                return new i05(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.X) {
            case 0:
                objArr.getClass();
                break;
        }
        return wl7.a0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.X) {
            case 0:
                break;
        }
        return wl7.Z(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.X) {
            case 0:
                return new g05(this, i, (byte) 0);
            default:
                return new g05(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                int i = this.f0;
                this.f0 = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.f0;
                this.f0 = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(this.f0, collection);
                this.f0 = collection.size() + this.f0;
                return collection.size() > 0;
            default:
                list.addAll(this.f0, collection);
                int size = collection.size();
                this.f0 += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.X;
        int i2 = this.Z;
        List list = this.Y;
        switch (b) {
            case 0:
                h85.a(i, this);
                Object objRemove = list.remove(i + i2);
                this.f0--;
                return objRemove;
            default:
                d15.a(i, this);
                Object objRemove2 = list.remove(i + i2);
                this.f0--;
                return objRemove2;
        }
    }
}

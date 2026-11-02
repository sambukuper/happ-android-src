package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g05 implements ListIterator, qv3 {
    public final /* synthetic */ byte X;
    public final List Y;
    public int Z;

    public g05(List list, int i, byte b) {
        this.X = b;
        switch (b) {
            case 1:
                this.Y = list;
                this.Z = i;
                break;
            default:
                this.Y = list;
                this.Z = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                int i = this.Z + 1;
                this.Z = i;
                list.add(i, obj);
                break;
            default:
                list.add(this.Z, obj);
                this.Z++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                return this.Z < list.size() - 1;
            default:
                return this.Z < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.X) {
            case 0:
                return this.Z >= 0;
            default:
                return this.Z > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                int i = this.Z + 1;
                this.Z = i;
                return list.get(i);
            default:
                int i2 = this.Z;
                this.Z = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.X) {
            case 0:
                return this.Z + 1;
            default:
                return this.Z;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                int i = this.Z;
                this.Z = i - 1;
                return list.get(i);
            default:
                int i2 = this.Z - 1;
                this.Z = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.X) {
            case 0:
                return this.Z;
            default:
                return this.Z - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                list.remove(this.Z);
                this.Z--;
                break;
            default:
                int i = this.Z - 1;
                this.Z = i;
                list.remove(i);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.X;
        List list = this.Y;
        switch (b) {
            case 0:
                list.set(this.Z, obj);
                break;
            default:
                list.set(this.Z, obj);
                break;
        }
    }
}

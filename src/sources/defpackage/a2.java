package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 implements ListIterator, qv3 {
    public final /* synthetic */ byte X;
    public int Y;
    public int Z;

    public /* synthetic */ a2(int i, int i2, byte b) {
        this.X = b;
        this.Y = i;
        this.Z = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                return this.Y < this.Z;
            default:
                return this.Y < this.Z;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.X) {
            case 0:
                return this.Y > 0;
            default:
                return this.Y > 0;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Y;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.X) {
            case 0:
                i = this.Y;
                break;
            default:
                i = this.Y;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}

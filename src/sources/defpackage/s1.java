package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 implements Iterator, qv3 {
    public byte X;
    public Object Y;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        if (b == 0) {
            this.X = (byte) 3;
            a();
            return this.X == 1;
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        bt.q("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        if (b == 1) {
            this.X = (byte) 0;
            return this.Y;
        }
        if (b != 2) {
            this.X = (byte) 3;
            a();
            if (this.X == 1) {
                this.X = (byte) 0;
                return this.Y;
            }
        }
        bt.n();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 implements Iterator, qv3 {
    public final /* synthetic */ byte X = 1;
    public final Iterator Y;
    public int Z;

    public rw1(sw1 sw1Var) {
        this.Y = sw1Var.a.iterator();
        this.Z = sw1Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Iterator it = this.Y;
        switch (b) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.Z > 0 && it.hasNext()) {
            it.next();
            this.Z--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Iterator it = this.Y;
        switch (b) {
            case 0:
                break;
            default:
                int i = this.Z;
                this.Z = i + 1;
                if (i >= 0) {
                    return new pb3(i, it.next());
                }
                i21.X();
                throw null;
        }
        while (this.Z > 0 && it.hasNext()) {
            it.next();
            this.Z--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rw1(Iterator it) {
        it.getClass();
        this.Y = it;
    }
}

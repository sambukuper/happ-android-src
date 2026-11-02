package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 implements Iterator, qv3 {
    public final int X;
    public boolean Y;
    public int Z;

    public aq0(char c, char c2) {
        this.X = c2;
        boolean z = c <= c2;
        this.Y = z;
        this.Z = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.Z;
        if (i != this.X) {
            this.Z = i + 1;
        } else {
            if (!this.Y) {
                bt.n();
                return null;
            }
            this.Y = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

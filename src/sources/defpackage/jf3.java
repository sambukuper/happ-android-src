package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jf3 implements Iterator, qv3 {
    public final int X;
    public final int Y;
    public boolean Z;
    public int f0;

    public jf3(int i, int i2, int i3) {
        this.X = i3;
        this.Y = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.Z = z;
        this.f0 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f0;
        if (i != this.Y) {
            this.f0 = this.X + i;
            return i;
        }
        if (this.Z) {
            this.Z = false;
            return i;
        }
        bt.n();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

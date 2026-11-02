package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qu2 implements Iterator, qv3 {
    public final yb7 X;
    public final int Y;
    public int Z;
    public final int f0;

    public qu2(yb7 yb7Var, int i, int i2) {
        this.X = yb7Var;
        this.Y = i2;
        this.Z = i;
        this.f0 = yb7Var.j0;
        if (yb7Var.i0) {
            ac7.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z < this.Y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        yb7 yb7Var = this.X;
        int i = yb7Var.j0;
        int i2 = this.f0;
        if (i != i2) {
            ac7.e();
        }
        int i3 = this.Z;
        this.Z = yb7Var.X[(i3 * 5) + 3] + i3;
        return new zb7(yb7Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

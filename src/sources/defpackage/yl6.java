package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yl6 implements Iterator {
    public final bv0 X;
    public fb0 Y;
    public int Z;

    public yl6(zl6 zl6Var) {
        bv0 bv0Var = new bv0(zl6Var);
        this.X = bv0Var;
        this.Y = new fb0(bv0Var.a());
        this.Z = zl6Var.Y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.Y.hasNext()) {
            this.Y = new fb0(this.X.a());
        }
        this.Z--;
        return Byte.valueOf(this.Y.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

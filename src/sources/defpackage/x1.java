package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends w1 implements ListIterator {
    public final /* synthetic */ z1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, int i) {
        super(z1Var, (byte) 0);
        this.f0 = z1Var;
        int iA = z1Var.a();
        if (i < 0 || i > iA) {
            kp5.k(pc6.m("index: ", i, iA, ", size: "));
            throw null;
        }
        this.Y = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.Y > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.Y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            bt.n();
            return null;
        }
        int i = this.Y - 1;
        this.Y = i;
        return this.f0.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.Y - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

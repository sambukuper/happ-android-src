package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ka2 implements Iterator, qv3 {
    public final Iterator X;
    public int Y = -1;
    public Object Z;
    public final /* synthetic */ la2 f0;

    public ka2(la2 la2Var) {
        this.f0 = la2Var;
        this.X = la2Var.a.iterator();
    }

    public final void a() {
        Object next;
        la2 la2Var;
        do {
            Iterator it = this.X;
            if (!it.hasNext()) {
                this.Y = 0;
                return;
            } else {
                next = it.next();
                la2Var = this.f0;
            }
        } while (((Boolean) la2Var.c.B(next)).booleanValue() != la2Var.b);
        this.Z = next;
        this.Y = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.Y == -1) {
            a();
        }
        return this.Y == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.Y == -1) {
            a();
        }
        if (this.Y == 0) {
            bt.n();
            return null;
        }
        Object obj = this.Z;
        this.Z = null;
        this.Y = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

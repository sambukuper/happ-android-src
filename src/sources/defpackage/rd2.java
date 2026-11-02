package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rd2 implements Iterator, qv3 {
    public final Iterator X;
    public Iterator Y;
    public byte Z;
    public final /* synthetic */ sd2 f0;

    public rd2(sd2 sd2Var) {
        this.f0 = sd2Var;
        this.X = sd2Var.a.iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.Y;
        if (it2 != null && it2.hasNext()) {
            this.Z = (byte) 1;
            return true;
        }
        do {
            Iterator it3 = this.X;
            if (!it3.hasNext()) {
                this.Z = (byte) 2;
                this.Y = null;
                return false;
            }
            Object next = it3.next();
            sd2 sd2Var = this.f0;
            it = (Iterator) sd2Var.c.B(sd2Var.b.B(next));
        } while (!it.hasNext());
        this.Y = it;
        this.Z = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.Z;
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.Z;
        if (b == 2) {
            bt.n();
            return null;
        }
        if (b == 0 && !a()) {
            bt.n();
            return null;
        }
        this.Z = (byte) 0;
        Iterator it = this.Y;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

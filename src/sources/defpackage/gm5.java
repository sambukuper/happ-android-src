package defpackage;

import io.sentry.c2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gm5 implements Iterator, qv3 {
    public Object X;
    public final em5 Y;
    public Object Z = pz2.N0;
    public boolean f0;
    public int g0;
    public int h0;

    public gm5(Object obj, em5 em5Var) {
        this.X = obj;
        this.Y = em5Var;
        this.g0 = em5Var.f0.h0;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final za4 next() {
        ol5 ol5Var = this.Y.f0;
        if (ol5Var.h0 != this.g0) {
            bt.c();
            return null;
        }
        if (!hasNext()) {
            bt.n();
            return null;
        }
        Object obj = this.X;
        this.Z = obj;
        this.f0 = true;
        this.h0++;
        Object obj2 = ol5Var.get(obj);
        if (obj2 != null) {
            za4 za4Var = (za4) obj2;
            this.X = za4Var.c;
            return za4Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.X + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h0 < this.Y.f0.c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f0) {
            c2.g();
            return;
        }
        Object obj = this.Z;
        em5 em5Var = this.Y;
        ci8.f(em5Var).remove(obj);
        this.Z = null;
        this.f0 = false;
        this.g0 = em5Var.f0.h0;
        this.h0--;
    }
}

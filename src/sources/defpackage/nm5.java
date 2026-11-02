package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nm5 extends jm5 {
    public final mm5 g0;
    public Object h0;
    public boolean i0;
    public int j0;

    /* JADX WARN: Illegal instructions before constructor call */
    public nm5(mm5 mm5Var) {
        Object obj = mm5Var.Y;
        ol5 ol5Var = mm5Var.f0;
        super(obj, ol5Var, (byte) 1);
        this.g0 = mm5Var;
        this.j0 = ol5Var.g0;
    }

    @Override // defpackage.jm5, java.util.Iterator
    public final Object next() {
        if (this.g0.f0.g0 != this.j0) {
            bt.c();
            return null;
        }
        Object next = super.next();
        this.h0 = next;
        this.i0 = true;
        return next;
    }

    @Override // defpackage.jm5, java.util.Iterator
    public final void remove() {
        if (!this.i0) {
            c2.g();
            return;
        }
        Object obj = this.h0;
        mm5 mm5Var = this.g0;
        ci8.d(mm5Var).remove(obj);
        this.h0 = null;
        this.i0 = false;
        this.j0 = mm5Var.f0.g0;
        this.f0--;
    }
}

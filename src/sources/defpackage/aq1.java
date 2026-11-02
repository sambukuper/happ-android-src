package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aq1 extends jx4 implements rv1 {
    public d64 q0;

    @Override // defpackage.jx4
    public final void Q0() {
        this.q0.j = this;
    }

    @Override // defpackage.jx4
    public final void R0() {
        d64 d64Var = this.q0;
        d64Var.d();
        d64Var.b = null;
        d64Var.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq1) && dh3.f(this.q0, ((aq1) obj).q0);
    }

    public final int hashCode() {
        return this.q0.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.q0 + ")";
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        um0 um0Var = p34Var.X;
        ArrayList arrayList = this.q0.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z54 z54Var = (z54) arrayList.get(i);
            xt2 xt2Var = z54Var.o;
            if (xt2Var != null) {
                long j = z54Var.m;
                long j2 = xt2Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((wl6) um0Var.Y.Y).V(f, f2);
                try {
                    i21.v(p34Var, xt2Var);
                    ((wl6) um0Var.Y.Y).V(-f, -f2);
                } catch (Throwable th) {
                    ((wl6) um0Var.Y.Y).V(-f, -f2);
                    throw th;
                }
            }
        }
        p34Var.a();
    }
}

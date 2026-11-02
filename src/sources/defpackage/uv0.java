package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uv0 extends ju {
    public final boolean l0;

    public uv0(dh8 dh8Var, boolean z, si8 si8Var, ar3 ar3Var) {
        super(Collection.class, dh8Var, z, si8Var, ar3Var);
        this.l0 = dh8Var.J0() || dh8Var.K0();
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((Collection) obj).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // defpackage.ar3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r4, defpackage.ro3 r5, defpackage.t37 r6) throws java.io.IOException {
        /*
            r3 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L1f
            java.lang.Boolean r0 = r3.h0
            if (r0 != 0) goto L17
            n37 r1 = defpackage.n37.v0
            l37 r2 = r6.X
            boolean r1 = r2.j(r1)
            if (r1 != 0) goto L1b
        L17:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1f
        L1b:
            r3.q(r4, r5, r6)
            return
        L1f:
            r5.V0(r4)
            r3.q(r4, r5, r6)
            r5.D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv0.e(java.lang.Object, ro3, t37):void");
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        return new uv0(this, this.f0, ri8Var, this.j0, this.h0);
    }

    @Override // defpackage.ju
    public final ju r(d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool) {
        return new uv0(this, d50Var, ri8Var, ar3Var, bool);
    }

    @Override // defpackage.ju
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void q(Collection collection, ro3 ro3Var, t37 t37Var) throws IOException {
        dh8 dh8Var = this.Z;
        ro3Var.m(collection);
        int i = 0;
        ri8 ri8Var = this.i0;
        boolean z = this.l0;
        ar3 ar3Var = this.j0;
        if (ar3Var != null) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (z && (collection instanceof EnumSet)) {
                    ri8Var = null;
                }
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            t37Var.h(ro3Var);
                        } catch (Exception e) {
                            lj7.m(t37Var, e, collection, i);
                            throw null;
                        }
                    } else if (ri8Var == null) {
                        ar3Var.e(next, ro3Var, t37Var);
                    } else {
                        ar3Var.f(next, ro3Var, t37Var, ri8Var);
                    }
                    i++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator it2 = collection.iterator();
        if (it2.hasNext()) {
            g33 g33Var = this.k0;
            if (z && (collection instanceof EnumSet)) {
                ri8Var = null;
            }
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        t37Var.h(ro3Var);
                    } else {
                        Class<?> cls = next2.getClass();
                        ar3 ar3VarR = g33Var.R(cls);
                        if (ar3VarR == null) {
                            if (dh8Var.F0()) {
                                ar3VarR = p(g33Var, t37Var.e(dh8Var, cls), t37Var);
                            } else {
                                ar3VarR = t37Var.j(cls, this.f0);
                                g33 g33VarJ = g33Var.J(cls, ar3VarR);
                                if (g33Var != g33VarJ) {
                                    this.k0 = g33VarJ;
                                }
                            }
                            g33Var = this.k0;
                        }
                        if (ri8Var == null) {
                            ar3VarR.e(next2, ro3Var, t37Var);
                        } else {
                            ar3VarR.f(next2, ro3Var, t37Var, ri8Var);
                        }
                    }
                    i++;
                } catch (Exception e2) {
                    lj7.m(t37Var, e2, collection, i);
                    throw null;
                }
            } while (it2.hasNext());
        }
    }

    public uv0(uv0 uv0Var, d50 d50Var, ri8 ri8Var, ar3 ar3Var, Boolean bool) {
        super(uv0Var, d50Var, ri8Var, ar3Var, bool);
        this.l0 = uv0Var.l0;
    }
}

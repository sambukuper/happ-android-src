package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends nz6 {
    public final x90 i0;
    public final /* synthetic */ AtomicReferenceArray j0;

    public vp0(long j, vp0 vp0Var, x90 x90Var, int i) {
        super(j, vp0Var, i);
        this.i0 = x90Var;
        this.j0 = new AtomicReferenceArray(z90.b * 2);
    }

    @Override // defpackage.nz6
    public final int g() {
        return z90.b;
    }

    @Override // defpackage.nz6
    public final void h(int i, s61 s61Var) {
        x90 x90Var;
        int i2 = z90.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.j0.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof vz8;
            x90Var = this.i0;
            if (z2 || (objL instanceof wz8)) {
                if (k(i, objL, z ? z90.j : z90.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        x90Var.getClass();
                        gn2 gn2Var = x90Var.Y;
                        if (gn2Var != null) {
                            jm4.s(gn2Var, obj, s61Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objL == z90.j || objL == z90.k) {
                    break;
                }
                if (objL != z90.g && objL != z90.f) {
                    if (objL == z90.i || objL == z90.d || objL == z90.l) {
                        return;
                    }
                    b61.o(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            x90Var.getClass();
            gn2 gn2Var2 = x90Var.Y;
            if (gn2Var2 != null) {
                jm4.s(gn2Var2, obj, s61Var);
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.j0;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.j0.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            x90 x90Var = this.i0;
            x90Var.getClass();
            x90Var.P((this.f0 * ((long) z90.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.j0.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.j0.set((i * 2) + 1, obj);
    }
}

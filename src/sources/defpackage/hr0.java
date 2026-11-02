package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hr0 extends gm3 {
    public final mm0 g0;

    public hr0(mm0 mm0Var) {
        this.g0 = mm0Var;
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        rm3 rm3VarJ = j();
        mm0 mm0Var = this.g0;
        Throwable thP = mm0Var.p(rm3VarJ);
        if (mm0Var.x()) {
            np1 np1Var = (np1) mm0Var.f0;
            long j = np1.j0;
            loop0: while (true) {
                Object objectVolatile = iu.a.getObjectVolatile(np1Var, j);
                z31 z31Var = op1.b;
                if (dh3.f(objectVolatile, z31Var)) {
                    do {
                        unsafe = iu.a;
                        if (unsafe.compareAndSwapObject(np1Var, np1.j0, z31Var, thP)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(np1Var, j) == z31Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = iu.a;
                        if (unsafe2.compareAndSwapObject(np1Var, np1.j0, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(np1Var, j) == objectVolatile);
                }
            }
        }
        mm0Var.z(thP);
        if (mm0Var.x()) {
            return;
        }
        mm0Var.n();
    }
}

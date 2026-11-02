package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o98 extends gm3 {
    public static final /* synthetic */ long i0 = iu.a.objectFieldOffset(o98.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread g0 = Thread.currentThread();
    public gq1 h0;

    public static void p(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = i0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                p(intVolatile);
                throw null;
            }
            o98 o98Var = this;
            if (unsafe.compareAndSwapInt(o98Var, i0, intVolatile, 2)) {
                o98Var.g0.interrupt();
                unsafe.putIntVolatile(o98Var, j, 3);
                return;
            }
            this = o98Var;
        }
    }

    public final void o() {
        o98 o98Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = i0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                o98Var = this;
                if (unsafe.compareAndSwapInt(o98Var, j, intVolatile, 1)) {
                    gq1 gq1Var = o98Var.h0;
                    if (gq1Var != null) {
                        gq1Var.a();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        p(intVolatile);
                        throw null;
                    }
                }
                o98Var = this;
            }
            this = o98Var;
        }
    }
}

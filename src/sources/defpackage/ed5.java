package defpackage;

import java.util.AbstractQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ed5 extends aq7 {
    public static final int l0 = pr6.Y / 4;
    public final gd5 g0;
    public final long h0;
    public volatile boolean i0;
    public volatile pr6 j0;
    public int k0;

    public ed5(gd5 gd5Var, long j) {
        this.g0 = gd5Var;
        this.h0 = j;
    }

    @Override // defpackage.u85
    public final void b() throws Throwable {
        this.i0 = true;
        this.g0.h();
    }

    @Override // defpackage.aq7
    public final void d() {
        int i = pr6.Y;
        this.k0 = i;
        e(i);
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        this.g0.j().offer(th);
        this.i0 = true;
        this.g0.h();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x009f  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.u85
    public final void onNext(Object obj) throws Throwable {
        boolean z;
        AbstractQueue abstractQueue;
        gd5 gd5Var = this.g0;
        long j = gd5Var.j0.get();
        boolean z2 = true;
        if (j != 0) {
            synchronized (gd5Var) {
                try {
                    j = gd5Var.j0.get();
                    if (gd5Var.o0 || j == 0) {
                        z = false;
                    } else {
                        gd5Var.o0 = true;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            gd5.k(this, obj);
            gd5Var.h();
            return;
        }
        pr6 pr6Var = this.j0;
        if (pr6Var != null && (abstractQueue = pr6Var.X) != null && !abstractQueue.isEmpty()) {
            gd5.k(this, obj);
            gd5Var.i();
            return;
        }
        try {
            try {
                gd5Var.g0.onNext(obj);
            } catch (Throwable th2) {
                try {
                    if (!gd5Var.h0) {
                        vr3.c0(th2);
                        c();
                        onError(th2);
                        return;
                    }
                    gd5Var.j().offer(th2);
                } catch (Throwable th3) {
                    th = th3;
                    z2 = false;
                    if (!z2) {
                        synchronized (gd5Var) {
                            gd5Var.o0 = false;
                        }
                    }
                    throw th;
                }
            }
            if (j != Long.MAX_VALUE) {
                gd5Var.j0.addAndGet(-1L);
            }
            int i = this.k0 - 1;
            if (i > l0) {
                this.k0 = i;
            } else {
                int i2 = pr6.Y;
                this.k0 = i2;
                int i3 = i2 - i;
                if (i3 > 0) {
                    e(i3);
                }
            }
            synchronized (gd5Var) {
                try {
                    if (gd5Var.p0) {
                        gd5Var.p0 = false;
                        gd5Var.i();
                    } else {
                        gd5Var.o0 = false;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            if (!z2) {
                synchronized (gd5Var) {
                    gd5Var.o0 = false;
                }
            }
            throw th;
        }
    }
}

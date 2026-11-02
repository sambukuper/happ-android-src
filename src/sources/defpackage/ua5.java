package defpackage;

import java.util.AbstractQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ua5 extends aq7 {
    public final m5 g0;
    public final AbstractQueue j0;
    public final k37 m0;
    public volatile boolean n0;
    public volatile boolean o0;
    public final cn2 h0 = os8.X;
    public final jv5 i0 = new jv5();
    public final AtomicInteger k0 = new AtomicInteger();
    public final AtomicReference l0 = new AtomicReference();

    public ua5(m5 m5Var) {
        this.g0 = m5Var;
        this.j0 = (sn8.a == null || sn8.b) ? new bg7(2) : new xf7(2);
        this.m0 = new k37();
        e(2L);
    }

    @Override // defpackage.u85
    public final void b() {
        this.n0 = true;
        g();
    }

    public final void g() {
        if (this.k0.getAndIncrement() != 0) {
            return;
        }
        while (!this.g0.X.Y) {
            if (!this.o0) {
                boolean z = this.n0;
                Object objPoll = this.j0.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    Throwable thB = m42.b(this.l0);
                    if (thB == null) {
                        this.g0.b();
                        return;
                    } else {
                        if (thB == m42.X) {
                            return;
                        }
                        this.g0.onError(thB);
                        return;
                    }
                }
                if (!z2) {
                    try {
                        cn2 cn2Var = this.h0;
                        if (objPoll == ch3.d) {
                            objPoll = null;
                        }
                        q85 q85Var = (q85) cn2Var.a(objPoll);
                        if (q85Var == null) {
                            h(new NullPointerException("The source returned by the mapper was null"));
                            return;
                        }
                        if (q85Var != g02.X) {
                            if (q85Var instanceof ow6) {
                                this.o0 = true;
                                this.i0.b(new o8(((ow6) q85Var).Y, (Object) this, (byte) 6));
                            } else {
                                ta5 ta5Var = new ta5(this);
                                d37 d37Var = this.m0.X;
                                while (true) {
                                    cq7 cq7Var = (cq7) d37Var.get();
                                    if (cq7Var == ko8.X) {
                                        ta5Var.c();
                                        break;
                                    } else if (d37Var.compareAndSet(cq7Var, ta5Var)) {
                                        if (cq7Var == null) {
                                            break;
                                        }
                                        cq7Var.c();
                                        break;
                                    }
                                }
                                if (ta5Var.X.Y) {
                                    return;
                                }
                                this.o0 = true;
                                q85Var.d(ta5Var);
                            }
                            e(1L);
                        } else {
                            e(1L);
                        }
                    } catch (Throwable th) {
                        vr3.c0(th);
                        h(th);
                        return;
                    }
                }
            }
            if (this.k0.decrementAndGet() == 0) {
                return;
            }
        }
    }

    public final void h(Throwable th) {
        c();
        AtomicReference atomicReference = this.l0;
        if (!m42.a(atomicReference, th)) {
            jr6.b(th);
            return;
        }
        Throwable thB = m42.b(atomicReference);
        if (thB == m42.X) {
            return;
        }
        this.g0.onError(thB);
    }

    public final void i(long j) {
        if (j != 0) {
            jv5 jv5Var = this.i0;
            if (j > 0) {
                synchronized (jv5Var) {
                    try {
                        if (jv5Var.Z) {
                            jv5Var.g0 += j;
                        } else {
                            jv5Var.Z = true;
                            try {
                                long j2 = jv5Var.X;
                                if (j2 != Long.MAX_VALUE) {
                                    long j3 = j2 - j;
                                    if (j3 < 0) {
                                        throw new IllegalStateException("more items arrived than were requested");
                                    }
                                    jv5Var.X = j3;
                                }
                                jv5Var.a();
                            } catch (Throwable th) {
                                synchronized (jv5Var) {
                                    jv5Var.Z = false;
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                jv5Var.getClass();
                bt.q("n > 0 required");
            }
        }
        this.o0 = false;
        g();
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        if (!m42.a(this.l0, th)) {
            jr6.b(th);
            return;
        }
        this.n0 = true;
        Throwable thB = m42.b(this.l0);
        if (thB != m42.X) {
            this.g0.onError(thB);
        }
        this.m0.c();
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        if (obj == null) {
            obj = ch3.d;
        }
        if (this.j0.offer(obj)) {
            g();
        } else {
            c();
            onError(new aw4());
        }
    }
}

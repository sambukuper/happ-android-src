package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mq8 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public final /* synthetic */ nq8 h0;
    public boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq8(q51 q51Var, nq8 nq8Var, boolean z) {
        super(2, q51Var);
        this.h0 = nq8Var;
        this.i0 = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return ((mq8) n(q51Var, b71Var)).q(dn8Var);
            default:
                ((mq8) n(q51Var, b71Var)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        nq8 nq8Var = this.h0;
        switch (b) {
            case 0:
                return new mq8(q51Var, nq8Var);
            default:
                return new mq8(q51Var, nq8Var, this.i0);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        ux0 ux0Var;
        boolean zIsTerminated;
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z = this.i0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8.a;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                if (hi5.i0("CXCP")) {
                    Objects.toString(this.h0);
                }
                jr8 jr8Var = this.h0.a;
                if (jr8Var.e.d()) {
                    AutoCloseable autoCloseableA = jr8Var.a();
                    if (autoCloseableA instanceof AutoCloseable) {
                        autoCloseableA.close();
                    } else {
                        if (!(autoCloseableA instanceof ExecutorService)) {
                            kp5.e();
                            return null;
                        }
                        ExecutorService executorService = (ExecutorService) autoCloseableA;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z2 = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z2) {
                                        executorService.shutdownNow();
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                or8 or8Var = (or8) this.h0.i.getValue();
                synchronized (or8Var.e) {
                    try {
                        ux0Var = or8Var.i;
                        if (ux0Var != null) {
                            hi5.m0();
                        } else {
                            yg1 yg1Var = or8Var.f;
                            if (yg1Var != null) {
                                yg1Var.m(null);
                            }
                            or8Var.c.b();
                            or8Var.h = null;
                            ux0Var = new ux0();
                            or8Var.i = ux0Var;
                            or8Var.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.i0 = true;
                if (ux0Var.h(this) == c71Var) {
                    return c71Var;
                }
                return dn8.a;
            default:
                w39.n0(obj);
                if (this.h0.h.b()) {
                    hi5.i0("CXCP");
                } else {
                    qi0 qi0VarA = this.h0.a.a();
                    boolean z3 = this.i0;
                    ef0 ef0Var = qi0VarA.g0;
                    synchronized (ef0Var.q) {
                        ef0Var.r = z3;
                    }
                }
                return dn8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq8(q51 q51Var, nq8 nq8Var) {
        super(2, q51Var);
        this.h0 = nq8Var;
    }
}

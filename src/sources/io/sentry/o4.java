package io.sentry;

import defpackage.bt;
import defpackage.i61;
import defpackage.s91;
import defpackage.sc4;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 implements i1 {
    public final g1 a;
    public final g1 b;
    public final g1 c;
    public final o4 d;
    public final o e;
    public final n f;
    public final d g;

    public o4(g1 g1Var, g1 g1Var2, g1 g1Var3, o4 o4Var) {
        this.f = new n(g1Var3, g1Var2, g1Var, (byte) 0);
        this.a = g1Var;
        this.b = g1Var2;
        this.c = g1Var3;
        this.d = o4Var;
        s6 s6VarI = i();
        io.sentry.util.b.s(s6VarI, "SentryOptions is required.");
        if (s6VarI.getDsn() == null || s6VarI.getDsn().isEmpty()) {
            bt.q("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
            throw null;
        }
        this.e = s6VarI.getCompositePerformanceCollector();
        this.g = new d((Object) this, (byte) 1);
    }

    @Override // io.sentry.i1
    public final void a(g gVar, n0 n0Var) {
        if (isEnabled()) {
            this.f.a(gVar, n0Var);
        } else {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.i1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final b1 m16clone() {
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new s0((o4) x("scopes clone"));
    }

    @Override // io.sentry.i1
    public final void close(boolean z) {
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (y1 y1Var : i().getIntegrations()) {
                if (y1Var instanceof Closeable) {
                    try {
                        ((Closeable) y1Var).close();
                    } catch (Throwable th) {
                        i().getLogger().h(s5.WARNING, "Failed to close the integration {}.", y1Var, th);
                    }
                }
            }
            for (i0 i0Var : i().getEventProcessors()) {
                if (i0Var instanceof Closeable) {
                    try {
                        ((Closeable) i0Var).close();
                    } catch (Throwable th2) {
                        i().getLogger().h(s5.WARNING, "Failed to close the event processor {}.", i0Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            n nVar = this.f;
            if (zIsEnabled) {
                try {
                    nVar.d(null).clear();
                } catch (Throwable th3) {
                    i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            n4 n4Var = n4.ISOLATION;
            if (isEnabled()) {
                try {
                    nVar.d(n4Var).clear();
                } catch (Throwable th4) {
                    i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            i().getBackpressureMonitor().close();
            i().getTransactionProfiler().close();
            i().getContinuousProfiler().close(true);
            i().getCompositePerformanceCollector().close();
            i().getConnectionStatusProvider().close();
            if (!z) {
                i().getTimerExecutorService().a(i().getShutdownTimeoutMillis());
            }
            m1 executorService = i().getExecutorService();
            if (z) {
                try {
                    executorService.submit(new sc4((Object) this, (Object) executorService, (byte) 22));
                } catch (RejectedExecutionException e) {
                    i().getLogger().e(s5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.a(i().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(i().getShutdownTimeoutMillis());
            }
            n4 n4Var2 = n4.CURRENT;
            if (isEnabled()) {
                try {
                    nVar.d(n4Var2).v().close(z);
                } catch (Throwable th5) {
                    i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            n4 n4Var3 = n4.ISOLATION;
            if (isEnabled()) {
                try {
                    nVar.d(n4Var3).v().close(z);
                } catch (Throwable th6) {
                    i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            n4 n4Var4 = n4.GLOBAL;
            if (!isEnabled()) {
                i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                nVar.d(n4Var4).v().close(z);
            } catch (Throwable th7) {
                i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            i().getLogger().e(s5.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.i1
    public final s91 d() {
        return this.f.v().d();
    }

    @Override // io.sentry.i1
    public final boolean e() {
        return this.f.v().e();
    }

    @Override // io.sentry.i1
    public final void f(long j) {
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f.v().f(j);
        } catch (Throwable th) {
            i().getLogger().e(s5.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w g(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            io.sentry.protocol.w wVarG = this.f.v().g(cVar, n0Var);
            return wVarG != null ? wVarG : wVar;
        } catch (Throwable th) {
            i().getLogger().e(s5.ERROR, "Error while capturing envelope.", th);
            return wVar;
        }
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w h(w3 w3Var) {
        io.sentry.util.b.s(w3Var, "profilingContinuousData is required");
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return this.f.v().h(w3Var);
        } catch (Throwable th) {
            i().getLogger().e(s5.ERROR, "Error while capturing profile chunk with id: " + w3Var.Z, th);
            return wVar;
        }
    }

    @Override // io.sentry.i1
    public final s6 i() {
        return ((g1) this.f.b).i();
    }

    @Override // io.sentry.i1
    public final boolean isEnabled() {
        return this.f.v().isEnabled();
    }

    @Override // io.sentry.i1
    public final s1 j() {
        if (isEnabled()) {
            return this.f.j();
        }
        i().getLogger().h(s5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.i1
    public final void k() {
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        n nVar = this.f;
        d7 d7VarK = nVar.k();
        if (d7VarK != null) {
            nVar.v().a(d7VarK, io.sentry.util.b.f(new io.sentry.util.h()));
        }
    }

    @Override // io.sentry.i1
    public final void l() {
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        n nVar = this.f;
        io.sentry.internal.debugmeta.c cVarL = nVar.l();
        if (cVarL == null) {
            i().getLogger().h(s5.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        d7 d7Var = (d7) cVarL.Y;
        if (d7Var != null) {
            nVar.v().a(d7Var, io.sentry.util.b.f(new io.sentry.util.h()));
        }
        nVar.v().a((d7) cVarL.Z, io.sentry.util.b.f(new io.sentry.hints.j()));
    }

    @Override // io.sentry.i1
    public final s1 m(n7 n7Var, o7 o7Var) {
        Double dValueOf;
        n7Var.k0 = o7Var.d;
        boolean zIsEnabled = isEnabled();
        s1 s1VarA = n3.a;
        if (!zIsEnabled) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.p.a(n7Var.k0, i().getIgnoredSpanOrigins())) {
            i().getLogger().h(s5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", n7Var.k0);
        } else if (!i().getInstrumenter().equals(n7Var.n0)) {
            i().getLogger().h(s5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", n7Var.n0, i().getInstrumenter());
        } else if (i().isTracingEnabled()) {
            c cVar = n7Var.o0;
            if (cVar == null || (dValueOf = cVar.d) == null) {
                Double d = ((c) this.f.s().e).d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            b4 b4VarA = i().getInternalTracesSampler().a(new io.sentry.internal.debugmeta.c(n7Var, dValueOf));
            Boolean bool = (Boolean) b4VarA.a;
            n7Var.a(b4VarA);
            r1 spanFactory = i().getSpanFactory();
            if (bool.booleanValue() && i().isContinuousProfilingEnabled()) {
                y3 profileLifecycle = i().getProfileLifecycle();
                y3 y3Var = y3.TRACE;
                if (profileLifecycle == y3Var && n7Var.q0.equals(io.sentry.protocol.w.Y)) {
                    i().getContinuousProfiler().c(y3Var, i().getInternalTracesSampler());
                }
            }
            s1VarA = spanFactory.a(n7Var, this, o7Var, this.e);
            if (bool.booleanValue() && ((Boolean) b4VarA.d).booleanValue()) {
                t1 transactionProfiler = i().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(s1VarA);
                } else if (o7Var.e) {
                    transactionProfiler.a(s1VarA);
                }
            }
        } else {
            i().getLogger().h(s5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (k4.ON == o7Var.b) {
            s1VarA.l();
        }
        return s1VarA;
    }

    @Override // io.sentry.i1
    public final i1 n() {
        return this.d;
    }

    @Override // io.sentry.i1
    public final void o(l4 l4Var) {
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            l4Var.h(this.f.d(null));
        } catch (Throwable th) {
            i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w p(i61 i61Var, n0 n0Var) {
        io.sentry.protocol.w wVarJ = io.sentry.protocol.w.Y;
        boolean zIsEnabled = isEnabled();
        g1 g1Var = this.f;
        if (zIsEnabled) {
            try {
                j5 j5Var = new j5(i61Var);
                g1Var.z(j5Var);
                wVarJ = g1Var.v().j(j5Var, g1Var, n0Var);
            } catch (Throwable th) {
                i().getLogger().e(s5.ERROR, "Error while capturing exception: " + i61Var.getMessage(), th);
            }
        } else {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        }
        g1Var.E(wVarJ);
        return wVarJ;
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w r(u6 u6Var, n0 n0Var) {
        g1 g1Var = this.f;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return g1Var.v().c(u6Var, g1Var, n0Var);
        } catch (Throwable th) {
            i().getLogger().e(s5.ERROR, "Error while capturing replay", th);
            return wVar;
        }
    }

    @Override // io.sentry.i1
    public final g1 s() {
        return this.c;
    }

    @Override // io.sentry.i1
    public final g1 t() {
        return this.a;
    }

    @Override // io.sentry.i1
    public final a1 u() {
        return this.g;
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w v(String str, s5 s5Var) {
        io.sentry.protocol.w wVarJ = io.sentry.protocol.w.Y;
        boolean zIsEnabled = isEnabled();
        g1 g1Var = this.f;
        if (zIsEnabled) {
            try {
                l1 l1VarV = g1Var.v();
                l1VarV.getClass();
                j5 j5Var = new j5();
                io.sentry.protocol.p pVar = new io.sentry.protocol.p();
                pVar.X = str;
                j5Var.s0 = pVar;
                j5Var.w0 = s5Var;
                wVarJ = l1VarV.j(j5Var, g1Var, null);
            } catch (Throwable th) {
                i().getLogger().e(s5.ERROR, "Error while capturing message: ".concat(str), th);
            }
        } else {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        }
        g1Var.E(wVarJ);
        return wVarJ;
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w w(io.sentry.protocol.f0 f0Var, l7 l7Var, n0 n0Var, z3 z3Var) {
        io.sentry.protocol.f0 f0Var2;
        g1 g1Var = this.f;
        ArrayList arrayList = f0Var.u0;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (f0Var.t0 == null) {
            i().getLogger().h(s5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", f0Var.X);
            return wVar;
        }
        Boolean bool = Boolean.TRUE;
        f7 f7VarJ = f0Var.Y.j();
        b4 b4Var = f7VarJ == null ? null : f7VarJ.f0;
        if (!bool.equals(Boolean.valueOf(b4Var != null ? ((Boolean) b4Var.a).booleanValue() : false))) {
            i().getLogger().h(s5.DEBUG, "Transaction %s was dropped due to sampling decision.", f0Var.X);
            if (i().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.f clientReportRecorder = i().getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
                clientReportRecorder.a(dVar, p.Transaction);
                i().getClientReportRecorder().f(dVar, p.Span, arrayList.size() + 1);
                return wVar;
            }
            io.sentry.clientreport.f clientReportRecorder2 = i().getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
            clientReportRecorder2.a(dVar2, p.Transaction);
            i().getClientReportRecorder().f(dVar2, p.Span, arrayList.size() + 1);
            return wVar;
        }
        try {
            f0Var2 = f0Var;
            try {
                return g1Var.v().i(f0Var2, l7Var, g1Var, n0Var, z3Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                i().getLogger().e(s5.ERROR, "Error while capturing transaction with id: " + f0Var2.X, th2);
                return wVar;
            }
        } catch (Throwable th3) {
            th = th3;
            f0Var2 = f0Var;
        }
    }

    @Override // io.sentry.i1
    public final i1 x(String str) {
        return new o4(this.a.clone(), this.b.clone(), this.c, this);
    }

    @Override // io.sentry.i1
    public final boolean y(i1 i1Var) {
        if (i1Var == null) {
            return false;
        }
        if (this == i1Var) {
            return true;
        }
        if (i1Var.n() != null) {
            return y(i1Var.n());
        }
        return false;
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w z(j5 j5Var, n0 n0Var) {
        g1 g1Var = this.f;
        io.sentry.protocol.w wVarJ = io.sentry.protocol.w.Y;
        if (!isEnabled()) {
            i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            n0Var.d(Boolean.TRUE, "sentry:captureFailed");
            return wVarJ;
        }
        try {
            g1Var.z(j5Var);
            wVarJ = g1Var.v().j(j5Var, g1Var, n0Var);
            g1Var.E(wVarJ);
            return wVarJ;
        } catch (Throwable th) {
            i().getLogger().e(s5.ERROR, "Error while capturing event with id: " + j5Var.X, th);
            n0Var.d(Boolean.TRUE, "sentry:captureFailed");
            return wVarJ;
        }
    }
}

package io.sentry.android.core;

import defpackage.fl6;
import defpackage.s91;
import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.a6;
import io.sentry.e3;
import io.sentry.m7;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.v3;
import io.sentry.v4;
import io.sentry.y3;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements io.sentry.x0, io.sentry.transport.o {
    public final ILogger X;
    public final String Y;
    public final int Z;
    public final io.sentry.util.f f0;
    public final n0 g0;
    public final io.sentry.android.core.internal.util.t i0;
    public io.sentry.i1 l0;
    public Future m0;
    public io.sentry.o n0;
    public io.sentry.protocol.w p0;
    public io.sentry.protocol.w q0;
    public final AtomicBoolean r0;
    public a5 s0;
    public volatile boolean t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public final io.sentry.util.a x0;
    public final io.sentry.util.a y0;
    public boolean h0 = false;
    public u j0 = null;
    public boolean k0 = false;
    public final ArrayList o0 = new ArrayList();

    public h(n0 n0Var, io.sentry.android.core.internal.util.t tVar, ILogger iLogger, String str, int i, io.sentry.util.f fVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        this.p0 = wVar;
        this.q0 = wVar;
        this.r0 = new AtomicBoolean(false);
        this.s0 = new a6();
        this.t0 = true;
        this.u0 = false;
        this.v0 = false;
        this.w0 = 0;
        this.x0 = new io.sentry.util.a();
        this.y0 = new io.sentry.util.a();
        this.X = iLogger;
        this.i0 = tVar;
        this.g0 = n0Var;
        this.Y = str;
        this.Z = i;
        this.f0 = fVar;
    }

    @Override // io.sentry.x0
    public final io.sentry.profiling.c a(io.sentry.protocol.w wVar, a5 a5Var, a5 a5Var2) {
        return io.sentry.profiling.c.UNKNOWN;
    }

    @Override // io.sentry.x0
    public final void b(y3 y3Var) {
        io.sentry.util.a aVar = this.x0;
        aVar.g();
        try {
            int i = g.a[y3Var.ordinal()];
            if (i == 1) {
                int i2 = this.w0 - 1;
                this.w0 = i2;
                if (i2 > 0) {
                    aVar.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.w0 = 0;
                    }
                    this.u0 = true;
                }
            } else if (i == 2) {
                this.u0 = true;
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.x0
    public final void c(y3 y3Var, m7 m7Var) {
        io.sentry.util.a aVar = this.x0;
        aVar.g();
        try {
            if (this.t0) {
                this.v0 = m7Var.b(io.sentry.util.o.a().c());
                this.t0 = false;
            }
            if (!this.v0) {
                this.X.h(s5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = g.a[y3Var.ordinal()];
            if (i == 1) {
                int i2 = this.w0;
                if (i2 < 0) {
                    this.w0 = 0;
                    i2 = 0;
                }
                this.w0 = i2 + 1;
            } else if (i == 2 && this.k0) {
                this.X.h(s5.DEBUG, "Profiler is already running.", new Object[0]);
                aVar.close();
                return;
            }
            if (!this.k0) {
                this.X.h(s5.DEBUG, "Started Profiler.", new Object[0]);
                g();
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.x0
    public final void close(boolean z) {
        io.sentry.util.a aVar = this.x0;
        aVar.g();
        try {
            this.w0 = 0;
            this.u0 = true;
            if (z) {
                h(false);
                this.r0.set(true);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.x0
    public final void d() {
        this.t0 = true;
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.w e() {
        return this.p0;
    }

    public final void f() {
        io.sentry.i1 i1Var = this.l0;
        if ((i1Var == null || i1Var == e3.b) && v4.b() != e3.b) {
            this.l0 = v4.b();
            this.n0 = v4.b().i().getCompositePerformanceCollector();
            s91 s91VarD = this.l0.d();
            if (s91VarD != null) {
                ((CopyOnWriteArrayList) s91VarD.g0).add(this);
            }
        }
    }

    public final void g() {
        f();
        this.g0.getClass();
        if (!this.h0) {
            this.h0 = true;
            ILogger iLogger = this.X;
            String str = this.Y;
            if (str == null) {
                iLogger.h(s5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.Z;
                if (i <= 0) {
                    iLogger.h(s5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.j0 = new u(str, 1000000 / i, this.i0, null, iLogger);
                }
            }
        }
        if (this.j0 == null) {
            return;
        }
        io.sentry.i1 i1Var = this.l0;
        ILogger iLogger2 = this.X;
        if (i1Var != null) {
            s91 s91VarD = i1Var.d();
            if (s91VarD != null && (s91VarD.k(io.sentry.p.All) || s91VarD.k(io.sentry.p.ProfileChunkUi))) {
                iLogger2.h(s5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.l0.i().getConnectionStatusProvider().n0() == io.sentry.u0.DISCONNECTED) {
                    iLogger2.h(s5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.s0 = this.l0.i().getDateProvider().a();
            }
        } else {
            this.s0 = new a6();
        }
        if (this.j0.c() == null) {
            return;
        }
        this.k0 = true;
        io.sentry.protocol.w wVar = this.p0;
        io.sentry.protocol.w wVar2 = io.sentry.protocol.w.Y;
        if (wVar.equals(wVar2)) {
            this.p0 = new io.sentry.protocol.w();
        }
        if (this.q0.equals(wVar2)) {
            this.q0 = new io.sentry.protocol.w();
        }
        io.sentry.o oVar = this.n0;
        if (oVar != null) {
            oVar.a(this.q0.a());
        }
        try {
            this.m0 = ((io.sentry.m1) this.f0.e()).b(new fl6(this, (byte) 21), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        } catch (RejectedExecutionException e) {
            iLogger2.e(s5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.u0 = true;
        }
    }

    public final void h(boolean z) {
        f();
        io.sentry.util.a aVar = this.x0;
        aVar.g();
        try {
            Future future = this.m0;
            if (future != null) {
                future.cancel(true);
            }
            if (this.j0 != null && this.k0) {
                this.g0.getClass();
                io.sentry.o oVar = this.n0;
                s sVarA = this.j0.a(oVar != null ? oVar.c(this.q0.a()) : null, false);
                ILogger iLogger = this.X;
                if (sVarA == null) {
                    iLogger.h(s5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.util.a aVar2 = this.y0;
                    aVar2.g();
                    try {
                        this.o0.add(new v3(this.p0, this.q0, sVarA.d, sVarA.c, this.s0));
                        aVar2.close();
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                this.k0 = false;
                this.q0 = io.sentry.protocol.w.Y;
                io.sentry.i1 i1Var = this.l0;
                if (i1Var != null) {
                    s6 s6VarI = i1Var.i();
                    try {
                        s6VarI.getExecutorService().submit(new r1(this, s6VarI, i1Var, (byte) 2));
                    } catch (Throwable th3) {
                        s6VarI.getLogger().e(s5.DEBUG, "Failed to send profile chunks.", th3);
                    }
                }
                if (!z || this.u0) {
                    this.p0 = io.sentry.protocol.w.Y;
                    iLogger.h(s5.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    iLogger.h(s5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                aVar.close();
                return;
            }
            io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
            this.p0 = wVar;
            this.q0 = wVar;
            aVar.close();
        } catch (Throwable th4) {
            try {
                aVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.transport.o
    public final void p(s91 s91Var) {
        if (s91Var.k(io.sentry.p.All) || s91Var.k(io.sentry.p.ProfileChunkUi)) {
            this.X.h(s5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }
}

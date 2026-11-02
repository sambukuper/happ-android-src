package io.sentry.android.core;

import android.os.ProfilingResult;
import android.os.SystemClock;
import defpackage.ad1;
import defpackage.fl6;
import defpackage.s91;
import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.a6;
import io.sentry.e3;
import io.sentry.m7;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t3;
import io.sentry.v3;
import io.sentry.v4;
import io.sentry.y3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import okhttp3.internal.ws.RealWebSocket;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements io.sentry.x0, io.sentry.transport.o {
    public final ILogger X;
    public final o Y;
    public final p Z;
    public final ad1 g0;
    public io.sentry.i1 i0;
    public io.sentry.o j0;
    public Future k0;
    public io.sentry.protocol.w l0;
    public io.sentry.protocol.w m0;
    public final AtomicBoolean n0;
    public a5 o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public int s0;
    public final io.sentry.util.a t0;
    public final ArrayDeque u0;
    public final io.sentry.util.a v0;
    public m1 f0 = null;
    public boolean h0 = false;

    public j1(ILogger iLogger, io.sentry.android.core.internal.util.t tVar, o oVar, p pVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        this.l0 = wVar;
        this.m0 = wVar;
        this.n0 = new AtomicBoolean(false);
        this.o0 = new a6();
        this.p0 = true;
        this.q0 = false;
        this.r0 = false;
        this.s0 = 0;
        this.t0 = new io.sentry.util.a();
        this.u0 = new ArrayDeque(10);
        this.v0 = new io.sentry.util.a();
        this.X = iLogger;
        this.g0 = new ad1(tVar);
        this.Y = oVar;
        this.Z = pVar;
    }

    @Override // io.sentry.x0
    public final io.sentry.profiling.c a(io.sentry.protocol.w wVar, a5 a5Var, a5 a5Var2) {
        io.sentry.profiling.c cVar;
        io.sentry.util.a aVar = this.v0;
        aVar.g();
        try {
            boolean z = false;
            boolean z2 = false;
            for (io.sentry.android.core.internal.profiling.a aVar2 : this.u0) {
                if (aVar2.a.equals(wVar)) {
                    if (!(a5Var2.b(aVar2.b) < 0)) {
                        a5 a5Var3 = aVar2.c;
                        if (a5Var3 != null) {
                            if (a5Var.b(a5Var3) > 0) {
                                continue;
                            }
                        }
                        synchronized (aVar2) {
                            cVar = aVar2.d;
                        }
                        io.sentry.profiling.c cVar2 = io.sentry.profiling.c.RECORDED;
                        if (cVar == cVar2) {
                            aVar.close();
                            return cVar2;
                        }
                        if (cVar == io.sentry.profiling.c.UNKNOWN) {
                            z = true;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            if (z) {
                io.sentry.profiling.c cVar3 = io.sentry.profiling.c.UNKNOWN;
                aVar.close();
                return cVar3;
            }
            if (z2) {
                io.sentry.profiling.c cVar4 = io.sentry.profiling.c.NOT_RECORDED;
                aVar.close();
                return cVar4;
            }
            io.sentry.profiling.c cVar5 = io.sentry.profiling.c.UNKNOWN;
            aVar.close();
            return cVar5;
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
    public final void b(y3 y3Var) {
        io.sentry.util.a aVar = this.t0;
        aVar.g();
        try {
            int i = i1.a[y3Var.ordinal()];
            if (i == 1) {
                int i2 = this.s0 - 1;
                this.s0 = i2;
                int iMax = Math.max(0, i2);
                this.s0 = iMax;
                if (iMax > 0) {
                    aVar.close();
                    return;
                }
                this.q0 = true;
            } else if (i == 2) {
                this.q0 = true;
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
        io.sentry.util.a aVar = this.t0;
        aVar.g();
        try {
            if (this.p0) {
                this.r0 = m7Var.b(io.sentry.util.o.a().c());
                this.p0 = false;
            }
            boolean z = this.r0;
            ILogger iLogger = this.X;
            if (!z) {
                iLogger.h(s5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = i1.a[y3Var.ordinal()];
            if (i == 1) {
                this.s0 = Math.max(0, this.s0) + 1;
            } else if (i == 2 && f()) {
                iLogger.h(s5.WARNING, "Unexpected call to startProfiler(MANUAL) while profiler already running. Skipping.", new Object[0]);
                aVar.close();
                return;
            }
            if (!f()) {
                iLogger.h(s5.DEBUG, "Started Profiler.", new Object[0]);
                this.q0 = false;
                h();
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
        io.sentry.profiling.c cVar;
        io.sentry.util.a aVar = this.t0;
        aVar.g();
        try {
            this.s0 = 0;
            this.q0 = true;
            if (z) {
                this.n0.set(true);
                i(false);
                io.sentry.util.a aVar2 = this.v0;
                aVar2.g();
                try {
                    io.sentry.android.core.internal.profiling.a aVar3 = (io.sentry.android.core.internal.profiling.a) this.u0.peekLast();
                    if (aVar3 != null) {
                        synchronized (aVar3) {
                            cVar = aVar3.d;
                        }
                        if (cVar == io.sentry.profiling.c.UNKNOWN) {
                            aVar3.a(io.sentry.profiling.c.NOT_RECORDED);
                        }
                    }
                    aVar2.close();
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            aVar.close();
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.x0
    public final void d() {
        io.sentry.util.a aVar = this.t0;
        aVar.g();
        try {
            this.p0 = true;
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
    public final io.sentry.protocol.w e() {
        io.sentry.util.a aVar = this.t0;
        aVar.g();
        try {
            io.sentry.protocol.w wVar = this.l0;
            aVar.close();
            return wVar;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean f() {
        io.sentry.util.a aVar = this.t0;
        aVar.g();
        try {
            boolean z = this.h0;
            aVar.close();
            return z;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.i1 g() {
        io.sentry.i1 i1Var = this.i0;
        if (i1Var != null && i1Var != e3.b) {
            return i1Var;
        }
        io.sentry.i1 i1VarB = v4.b();
        if (i1VarB == e3.b) {
            this.X.h(s5.ERROR, "PerfettoContinuousProfiler: scopes not available. This is unexpected.", new Object[0]);
            return i1VarB;
        }
        this.i0 = i1VarB;
        this.j0 = i1VarB.i().getCompositePerformanceCollector();
        s91 s91VarD = i1VarB.d();
        if (s91VarD != null) {
            ((CopyOnWriteArrayList) s91VarD.g0).add(this);
        }
        return this.i0;
    }

    public final void h() {
        ArrayDeque arrayDeque = this.u0;
        io.sentry.i1 i1VarG = g();
        s91 s91VarD = i1VarG.d();
        ILogger iLogger = this.X;
        if (s91VarD != null && (s91VarD.k(io.sentry.p.All) || s91VarD.k(io.sentry.p.ProfileChunkUi))) {
            iLogger.h(s5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            i(false);
            return;
        }
        if (i1VarG.i().getConnectionStatusProvider().n0() == io.sentry.u0.DISCONNECTED) {
            iLogger.h(s5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
            i(false);
            return;
        }
        this.o0 = i1VarG.i().getDateProvider().a();
        this.f0 = (m1) this.Z.get();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (wVar.equals(this.l0)) {
            this.l0 = new io.sentry.protocol.w();
        }
        io.sentry.android.core.internal.profiling.a aVar = new io.sentry.android.core.internal.profiling.a(this.l0, this.o0);
        io.sentry.util.a aVar2 = this.v0;
        aVar2.g();
        try {
            if (arrayDeque.size() == 10) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(aVar);
            aVar2.close();
            if (!this.f0.c(aVar)) {
                aVar2.g();
                try {
                    arrayDeque.remove(aVar);
                    aVar2.close();
                    this.l0 = wVar;
                    this.m0 = wVar;
                    iLogger.h(s5.ERROR, "Failed to start Perfetto profiling.", new Object[0]);
                    return;
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            byte b = 1;
            this.h0 = true;
            if (this.m0.equals(wVar)) {
                this.m0 = new io.sentry.protocol.w();
            }
            io.sentry.o oVar = this.j0;
            String strA = this.m0.a();
            ad1 ad1Var = this.g0;
            ad1Var.d = oVar;
            ad1Var.e = strA;
            ad1Var.a = SystemClock.elapsedRealtimeNanos();
            ((ConcurrentLinkedDeque) ad1Var.f).clear();
            ((ConcurrentLinkedDeque) ad1Var.g).clear();
            ((ConcurrentLinkedDeque) ad1Var.h).clear();
            ad1Var.c = ((io.sentry.android.core.internal.util.t) ad1Var.b).c(new r(ad1Var, b));
            if (oVar != null) {
                oVar.a(strA);
            }
            try {
                this.k0 = this.Y.Y.getExecutorService().b(new fl6((Object) this, (byte) 25), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
            } catch (RejectedExecutionException e) {
                iLogger.e(s5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
                this.q0 = true;
            }
        } catch (Throwable th3) {
            try {
                aVar2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    public final void i(boolean z) {
        io.sentry.i1 i1Var;
        Object obj;
        final io.sentry.android.core.internal.profiling.a aVar;
        String str;
        m1 m1Var = this.f0;
        Future future = this.k0;
        if (future != null) {
            future.cancel(false);
        }
        if (m1Var == null || !this.h0) {
            io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
            this.l0 = wVar;
            this.m0 = wVar;
            return;
        }
        io.sentry.i1 i1VarG = g();
        final s6 s6VarI = i1VarG.i();
        ad1 ad1Var = this.g0;
        final HashMap map = new HashMap();
        ((io.sentry.android.core.internal.util.t) ad1Var.b).d((String) ad1Var.c);
        ad1Var.c = null;
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) ad1Var.h;
        ConcurrentLinkedDeque concurrentLinkedDeque2 = (ConcurrentLinkedDeque) ad1Var.g;
        ConcurrentLinkedDeque concurrentLinkedDeque3 = (ConcurrentLinkedDeque) ad1Var.f;
        if (!concurrentLinkedDeque3.isEmpty()) {
            map.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque3)));
        }
        if (!concurrentLinkedDeque2.isEmpty()) {
            map.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque2)));
        }
        if (!concurrentLinkedDeque.isEmpty()) {
            map.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", new ArrayList(concurrentLinkedDeque)));
        }
        io.sentry.o oVar = (io.sentry.o) ad1Var.d;
        if (oVar == null || (str = (String) ad1Var.e) == null) {
            i1Var = i1VarG;
            obj = null;
        } else {
            List listC = oVar.c(str);
            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = ad1Var.a;
            if (listC != null) {
                ArrayList arrayList = (ArrayList) listC;
                if (arrayList.isEmpty()) {
                    i1Var = i1VarG;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
                    ArrayDeque arrayDeque2 = new ArrayDeque(arrayList.size());
                    ArrayDeque arrayDeque3 = new ArrayDeque(arrayList.size());
                    synchronized (listC) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                t3 t3Var = (t3) it.next();
                                long j2 = jElapsedRealtimeNanos;
                                long j3 = t3Var.g;
                                long j4 = (j2 - (nanos - j3)) - j;
                                Iterator it2 = it;
                                if (t3Var.b) {
                                    arrayDeque.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j4), Double.valueOf(t3Var.a), j3));
                                }
                                if (t3Var.d) {
                                    arrayDeque2.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j4), Long.valueOf(t3Var.c), j3));
                                }
                                if (t3Var.f) {
                                    arrayDeque3.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j4), Long.valueOf(t3Var.e), j3));
                                }
                                jElapsedRealtimeNanos = j2;
                                it = it2;
                                i1VarG = i1VarG;
                                j = j;
                            }
                            i1Var = i1VarG;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!arrayDeque.isEmpty()) {
                        map.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque));
                    }
                    if (!arrayDeque2.isEmpty()) {
                        map.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
                    }
                    if (!arrayDeque3.isEmpty()) {
                        map.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque3));
                    }
                }
            } else {
                i1Var = i1VarG;
            }
            obj = null;
        }
        ad1Var.d = obj;
        ad1Var.e = obj;
        final io.sentry.protocol.w wVar2 = this.l0;
        final io.sentry.protocol.w wVar3 = this.m0;
        final a5 a5Var = this.o0;
        a5 a5VarA = s6VarI.getDateProvider().a();
        io.sentry.util.a aVar2 = this.v0;
        aVar2.g();
        try {
            io.sentry.android.core.internal.profiling.a aVar3 = (io.sentry.android.core.internal.profiling.a) this.u0.peekLast();
            if (aVar3 == null || aVar3.c != null) {
                aVar2.close();
                aVar = null;
            } else {
                aVar3.c = a5VarA;
                aVar2.close();
                aVar = aVar3;
            }
            this.h0 = false;
            this.f0 = null;
            io.sentry.protocol.w wVar4 = io.sentry.protocol.w.Y;
            this.m0 = wVar4;
            if (!z || this.q0) {
                this.l0 = wVar4;
            }
            final boolean z2 = z && !this.q0;
            final io.sentry.i1 i1Var2 = i1Var;
            Consumer consumer = new Consumer() { // from class: io.sentry.android.core.g1
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    File file = (File) obj2;
                    j1 j1Var = this.a;
                    AtomicBoolean atomicBoolean = j1Var.n0;
                    ILogger iLogger = j1Var.X;
                    io.sentry.android.core.internal.profiling.a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.a((file == null || atomicBoolean.get()) ? io.sentry.profiling.c.NOT_RECORDED : io.sentry.profiling.c.RECORDED);
                    }
                    if (file == null) {
                        iLogger.h(s5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                    } else {
                        v3 v3Var = new v3(wVar2, wVar3, map, file, a5Var);
                        v3Var.f = "application/x-perfetto-trace";
                        io.sentry.i1 i1Var3 = i1Var2;
                        s6 s6Var = s6VarI;
                        h1 h1Var = new h1(j1Var, i1Var3, v3Var, s6Var, (byte) 0);
                        try {
                            if (Thread.currentThread().getName().startsWith("SentryExecutorServiceThreadFactory")) {
                                h1Var.run();
                            } else {
                                j1Var.Y.Y.getExecutorService().submit(h1Var);
                            }
                        } catch (Throwable th2) {
                            s6Var.getLogger().e(s5.DEBUG, "Failed to send profile chunk.", th2);
                        }
                    }
                    if (!z2) {
                        iLogger.h(s5.DEBUG, "Profile chunk finished.", new Object[0]);
                        return;
                    }
                    io.sentry.util.a aVar5 = j1Var.t0;
                    aVar5.g();
                    try {
                        if (j1Var.h0 || atomicBoolean.get() || j1Var.q0) {
                            iLogger.h(s5.DEBUG, "Profile chunk finished, but profiler was already restarted, closed or stopped. Skipping.", new Object[0]);
                        } else {
                            iLogger.h(s5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                            j1Var.h();
                        }
                        aVar5.close();
                    } catch (Throwable th3) {
                        try {
                            aVar5.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
            };
            if (!m1Var.h) {
                m1Var.a.h(s5.WARNING, "PerfettoProfiler was never started", new Object[0]);
                consumer.accept(null);
                return;
            }
            m1Var.d.cancel();
            synchronized (m1Var.e) {
                try {
                    ProfilingResult profilingResult = m1Var.f;
                    if (profilingResult != null) {
                        consumer.accept(m1Var.b(profilingResult));
                        return;
                    }
                    m1Var.g = consumer;
                    try {
                        m1Var.b.b(new fl6((Object) m1Var, (byte) 26), StateDownloadFileV2.Success.OUTDATED_DURATION_MS);
                    } catch (RejectedExecutionException e) {
                        m1Var.a.e(s5.DEBUG, "Failed to schedule profiling result timeout.", e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                aVar2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // io.sentry.transport.o
    public final void p(s91 s91Var) {
        if (s91Var.k(io.sentry.p.All) || s91Var.k(io.sentry.p.ProfileChunkUi)) {
            io.sentry.util.a aVar = this.t0;
            aVar.g();
            try {
                this.X.h(s5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                i(false);
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
    }
}

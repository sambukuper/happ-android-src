package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.fl6;
import io.sentry.ILogger;
import io.sentry.s5;
import io.sentry.t3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final File b;
    public final int c;
    public String f;
    public final io.sentry.android.core.internal.util.t g;
    public final io.sentry.util.f l;
    public final ILogger m;
    public long a = 0;
    public Future d = null;
    public File e = null;
    public final ArrayDeque h = new ArrayDeque();
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();
    public volatile boolean n = false;
    public final io.sentry.util.a o = new io.sentry.util.a();

    public u(String str, int i, io.sentry.android.core.internal.util.t tVar, io.sentry.util.f fVar, ILogger iLogger) {
        io.sentry.util.b.s(str, "TracesFilesDirPath is required");
        this.b = new File(str);
        this.c = i;
        io.sentry.util.b.s(iLogger, "Logger is required");
        this.m = iLogger;
        this.l = fVar;
        this.g = tVar;
    }

    public final s a(List list, boolean z) {
        io.sentry.util.a aVar = this.o;
        aVar.g();
        try {
            if (!this.n) {
                this.m.h(s5.WARNING, "Profiler not running", new Object[0]);
                aVar.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th) {
                try {
                    this.m.e(s5.ERROR, "Error while stopping profiling: ", th);
                } catch (Throwable th2) {
                    this.n = false;
                    throw th2;
                }
            }
            this.n = false;
            this.g.d(this.f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.e == null) {
                this.m.h(s5.ERROR, "Trace file does not exists", new Object[0]);
                aVar.close();
                return null;
            }
            if (!this.i.isEmpty()) {
                this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
            }
            if (!this.j.isEmpty()) {
                this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.h.isEmpty()) {
                this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
            }
            b(list);
            Future future = this.d;
            if (future != null) {
                future.cancel(true);
                this.d = null;
            }
            s sVar = new s(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.k);
            aVar.close();
            return sVar;
        } catch (Throwable th3) {
            try {
                aVar.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final void b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        t3 t3Var = (t3) it.next();
                        long j = t3Var.g;
                        long j2 = j + jElapsedRealtimeNanos;
                        if (t3Var.b) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), Double.valueOf(t3Var.a), j));
                        }
                        if (t3Var.d) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), Long.valueOf(t3Var.c), j));
                        }
                        if (t3Var.f) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), Long.valueOf(t3Var.e), j));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final t c() {
        io.sentry.util.a aVar = this.o;
        aVar.g();
        try {
            int i = this.c;
            if (i == 0) {
                this.m.h(s5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                aVar.close();
                return null;
            }
            if (this.n) {
                this.m.h(s5.WARNING, "Profiling has already started...", new Object[0]);
                aVar.close();
                return null;
            }
            this.e = new File(this.b, io.sentry.config.a.f().concat(".trace"));
            this.k.clear();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            this.f = this.g.c(new r(this, (byte) 0));
            try {
                io.sentry.util.f fVar = this.l;
                if (fVar != null) {
                    this.d = ((io.sentry.m1) fVar.e()).b(new fl6(this, (byte) 22), 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.m.e(s5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.a = SystemClock.elapsedRealtimeNanos();
            Date date = new Date();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
                this.n = true;
                t tVar = new t(this.a, elapsedCpuTime, date);
                aVar.close();
                return tVar;
            } catch (Throwable th) {
                a(null, false);
                this.m.e(s5.ERROR, "Unable to start a profile: ", th);
                this.n = false;
                aVar.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                aVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}

package io.sentry.transport;

import defpackage.s91;
import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b0;
import io.sentry.b5;
import io.sentry.c5;
import io.sentry.h5;
import io.sentry.n0;
import io.sentry.p0;
import io.sentry.p7;
import io.sentry.s5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final n X;
    public final io.sentry.cache.d Y;
    public final SentryAndroidOptions Z;
    public final s91 f0;
    public final h g0;
    public final e h0;
    public volatile b i0;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(SentryAndroidOptions sentryAndroidOptions, s91 s91Var, h hVar, io.sentry.internal.debugmeta.c cVar) {
        int maxQueueSize = sentryAndroidOptions.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        final ILogger logger = sentryAndroidOptions.getLogger();
        b5 dateProvider = sentryAndroidOptions.getDateProvider();
        n nVar = new n(maxQueueSize, new p0((byte) 4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    n0 n0Var = bVar.Y;
                    if (!io.sentry.util.b.j(n0Var, io.sentry.hints.d.class)) {
                        envelopeDiskCache.m(bVar.X, n0Var);
                    }
                    Object objB = n0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB != null) {
                        ((io.sentry.hints.k) objB).b(false);
                    }
                    Object objB2 = n0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                        ((io.sentry.hints.h) objB2).c(true);
                    }
                    logger.h(s5.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(sentryAndroidOptions, cVar, s91Var);
        this.i0 = null;
        this.X = nVar;
        io.sentry.cache.d envelopeDiskCache2 = sentryAndroidOptions.getEnvelopeDiskCache();
        io.sentry.util.b.s(envelopeDiskCache2, "envelopeCache is required");
        this.Y = envelopeDiskCache2;
        this.Z = sentryAndroidOptions;
        this.f0 = s91Var;
        io.sentry.util.b.s(hVar, "transportGate is required");
        this.g0 = hVar;
        this.h0 = eVar;
    }

    @Override // io.sentry.transport.g
    public final void close(boolean z) {
        this.f0.close();
        this.X.shutdown();
        this.Z.getLogger().h(s5.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.Z.getFlushTimeoutMillis();
            if (this.X.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.Z.getLogger().h(s5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.X.shutdownNow();
            if (this.i0 != null) {
                this.X.getRejectedExecutionHandler().rejectedExecution(this.i0, this.X);
            }
        } catch (InterruptedException unused) {
            this.Z.getLogger().h(s5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final s91 d() {
        return this.f0;
    }

    @Override // io.sentry.transport.g
    public final boolean e() {
        boolean z;
        Iterator it = ((ConcurrentHashMap) this.f0.f0).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (!((io.sentry.time.a) it.next()).b()) {
                z = true;
                break;
            }
        }
        n nVar = this.X;
        a5 a5Var = nVar.Y;
        return (z || (a5Var != null && (nVar.f0.a().b(a5Var) > 2000000000L ? 1 : (nVar.f0.a().b(a5Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.g
    public final void f(long j) {
        n nVar = this.X;
        try {
            ((p) nVar.g0.Y).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            nVar.Z.e(s5.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void v0(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        io.sentry.cache.d dVar;
        boolean z;
        io.sentry.internal.debugmeta.c cVarJ;
        List listSingletonList;
        Iterable<h5> iterable = (Iterable) cVar.Z;
        boolean zJ = io.sentry.util.b.j(n0Var, io.sentry.hints.d.class);
        SentryAndroidOptions sentryAndroidOptions = this.Z;
        io.sentry.cache.d dVar2 = this.Y;
        if (zJ) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = i.X;
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        s91 s91Var = this.f0;
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) s91Var.Z;
        ArrayList arrayList = null;
        for (h5 h5Var : iterable) {
            String itemType = h5Var.a.g0.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(io.sentry.p.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(io.sentry.p.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(io.sentry.p.ProfileChunkUi, io.sentry.p.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(io.sentry.p.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(io.sentry.p.Feedback);
                    break;
                case "log":
                    listSingletonList = Arrays.asList(io.sentry.p.LogItem, io.sentry.p.LogByte);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(io.sentry.p.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(io.sentry.p.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Arrays.asList(io.sentry.p.TraceMetric, io.sentry.p.TraceMetricByte);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(io.sentry.p.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(io.sentry.p.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(io.sentry.p.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(io.sentry.p.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                if (s91Var.k((io.sentry.p) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(h5Var);
                    sentryAndroidOptions2.getClientReportRecorder().g(io.sentry.clientreport.d.RATELIMIT_BACKOFF, h5Var);
                    break;
                }
            }
        }
        if (arrayList != null) {
            sentryAndroidOptions2.getLogger().h(s5.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (h5 h5Var2 : iterable) {
                if (!arrayList.contains(h5Var2)) {
                    arrayList2.add(h5Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                sentryAndroidOptions2.getLogger().h(s5.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objB = n0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB != null) {
                    ((io.sentry.hints.k) objB).b(false);
                }
                Object objB2 = n0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    ((io.sentry.hints.h) objB2).c(false);
                }
                Object objB3 = n0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.c.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.c) objB3).X.countDown();
                    sentryAndroidOptions2.getLogger().h(s5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                cVarJ = null;
            } else {
                cVarJ = new io.sentry.internal.debugmeta.c((c5) cVar.Y, arrayList2);
            }
        } else {
            cVarJ = cVar;
        }
        if (cVarJ == null) {
            if (z) {
                dVar2.J(cVar);
                return;
            }
            return;
        }
        if (p7.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
            cVarJ = sentryAndroidOptions.getClientReportRecorder().j(cVarJ);
        }
        Future futureSubmit = this.X.submit(new b(this, cVarJ, n0Var, dVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            sentryAndroidOptions.getClientReportRecorder().b(io.sentry.clientreport.d.QUEUE_OVERFLOW, cVarJ);
            return;
        }
        Object objB4 = n0Var.b("sentry:typeCheckHint");
        if (!b0.class.isInstance(n0Var.b("sentry:typeCheckHint")) || objB4 == null) {
            return;
        }
        b0 b0Var = (b0) objB4;
        b0Var.i0.add(b0Var.h0);
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close(false);
    }
}

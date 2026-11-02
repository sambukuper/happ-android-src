package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import defpackage.dh3;
import defpackage.ea6;
import defpackage.fm7;
import defpackage.j78;
import defpackage.mm7;
import defpackage.nr4;
import defpackage.s91;
import defpackage.u15;
import defpackage.vz7;
import defpackage.wv0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c3;
import io.sentry.c4;
import io.sentry.d4;
import io.sentry.i1;
import io.sentry.m1;
import io.sentry.p4;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.u0;
import io.sentry.v0;
import io.sentry.v6;
import io.sentry.w6;
import io.sentry.y1;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0006\u0007\u0007\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/y1;", "Ljava/io/Closeable;", "Lio/sentry/d4;", "Lio/sentry/v0;", "Lio/sentry/transport/o;", "io/sentry/android/replay/o", "io/sentry/p0", "io/sentry/android/replay/p", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements y1, Closeable, d4, v0, io.sentry.transport.o {
    public static final /* synthetic */ int r0 = 0;
    public final Context X;
    public final io.sentry.transport.d Y;
    public u0 Z;
    public SentryAndroidOptions f0;
    public i1 g0;
    public k0 h0;
    public io.sentry.android.replay.gestures.b i0;
    public final ThreadLocal j0;
    public final vz7 k0;
    public final vz7 l0;
    public final vz7 m0;
    public final AtomicBoolean n0;
    public c4 o0;
    public final io.sentry.d p0;
    public final AtomicReference q0;

    static {
        q5.d().b("maven:io.sentry:sentry-android-replay", "8.59.0");
    }

    public ReplayIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        this.Y = io.sentry.transport.d.X;
        this.Z = u0.UNKNOWN;
        this.j0 = new ThreadLocal();
        this.k0 = new vz7(a.f0);
        this.l0 = new vz7(new t(this, (byte) 1));
        this.m0 = new vz7(new t(this, (byte) 0));
        this.n0 = new AtomicBoolean(false);
        this.o0 = c3.a;
        this.p0 = new io.sentry.d((byte) 7);
        y yVar = y.INITIAL;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        wVar.getClass();
        this.q0 = new AtomicReference(new p(0L, yVar, wVar, null));
    }

    public final void B0(int i, int i2) {
        k0 k0Var;
        h0 h0Var;
        c0 c0Var;
        if (this.n0.get() && ((p) this.q0.get()).b()) {
            SentryAndroidOptions sentryAndroidOptions = this.f0;
            if (sentryAndroidOptions == null) {
                dh3.T("options");
                throw null;
            }
            if (sentryAndroidOptions.getSessionReplay().k) {
                Context context = this.X;
                SentryAndroidOptions sentryAndroidOptions2 = this.f0;
                if (sentryAndroidOptions2 == null) {
                    dh3.T("options");
                    throw null;
                }
                w6 sessionReplay = sentryAndroidOptions2.getSessionReplay();
                sessionReplay.getClass();
                context.getClass();
                float f = i2;
                float f2 = f / context.getResources().getDisplayMetrics().density;
                v6 v6Var = sessionReplay.f;
                int iO = nr4.O(f2 * v6Var.sizeScale);
                int i3 = iO % 16;
                int iMax = i3 <= 8 ? Math.max(16, iO - i3) : iO + (16 - i3);
                float f3 = i;
                int iO2 = nr4.O((f3 / context.getResources().getDisplayMetrics().density) * v6Var.sizeScale);
                int i4 = iO2 % 16;
                int iMax2 = i4 <= 8 ? Math.max(16, iO2 - i4) : iO2 + (16 - i4);
                d0 d0Var = new d0(iMax2, iMax, iMax2 / f3, iMax / f, sessionReplay.g ? 1 : 0, v6Var.bitRate);
                p pVar = (p) this.q0.get();
                if (this.n0.get() && pVar.b()) {
                    io.sentry.android.replay.capture.c cVar = pVar.d;
                    if (cVar != null) {
                        cVar.g(d0Var);
                    }
                    k0 k0Var2 = this.h0;
                    if (k0Var2 != null && k0Var2.h0.get()) {
                        if (k0Var2.o0 == null) {
                            io.sentry.util.a aVar = k0Var2.m0;
                            aVar.g();
                            try {
                                if (k0Var2.o0 == null) {
                                    k0Var2.o0 = new h0(k0Var2.X, k0Var2.f0);
                                }
                                u15.h(aVar, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    u15.h(aVar, th);
                                    throw th2;
                                }
                            }
                        }
                        h0 h0Var2 = k0Var2.o0;
                        if (h0Var2 != null) {
                            h0Var2.f0 = d0Var;
                        }
                        h0 h0Var3 = k0Var2.o0;
                        if (h0Var3 != null) {
                            h0Var3.Z = new c0(k0Var2.X, k0Var2.Y, d0Var, k0Var2);
                        }
                        WeakReference weakReference = (WeakReference) wv0.B0(k0Var2.i0);
                        View view = weakReference != null ? (View) weakReference.get() : null;
                        if (view != null && (h0Var = k0Var2.o0) != null && (c0Var = h0Var.Z) != null) {
                            c0Var.a(view);
                        }
                        io.sentry.d dVar = k0Var2.f0;
                        h0 h0Var4 = k0Var2.o0;
                        Handler handler = (Handler) dVar.Y;
                        if (h0Var4 != null) {
                            handler.removeCallbacks(h0Var4);
                        }
                        io.sentry.d dVar2 = k0Var2.f0;
                        h0 h0Var5 = k0Var2.o0;
                        if (!(h0Var5 == null ? false : ((Handler) dVar2.Y).postDelayed(h0Var5, 100L))) {
                            k0Var2.X.getLogger().h(s5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                        }
                    }
                    if (pVar.b != y.PAUSED || (k0Var = this.h0) == null) {
                        return;
                    }
                    k0Var.p();
                }
            }
        }
    }

    @Override // io.sentry.d4
    public final void C(io.sentry.protocol.w wVar) {
        io.sentry.android.replay.capture.c cVar;
        wVar.getClass();
        p pVar = (p) this.q0.get();
        if (!this.n0.get() || !pVar.b() || (cVar = pVar.d) == null || wVar.equals(io.sentry.protocol.w.Y)) {
            return;
        }
        synchronized (cVar.r) {
            if (cVar.s.size() < 100) {
                cVar.s.add(wVar.a());
            }
        }
    }

    public final void C0() {
        AtomicReference atomicReference = this.q0;
        p pVar = (p) atomicReference.get();
        if (this.n0.get()) {
            y yVar = pVar.b;
            y yVar2 = y.PAUSED;
            if (io.sentry.config.a.o(yVar, yVar2)) {
                k0 k0Var = this.h0;
                if (k0Var != null) {
                    k0Var.p();
                }
                io.sentry.android.replay.capture.c cVar = pVar.d;
                if (cVar != null) {
                    cVar.j();
                }
                atomicReference.set(p.a(pVar, yVar2, null, null, 13));
            }
        }
    }

    @Override // io.sentry.d4
    public final void D() {
        u uVar = new u(this, (byte) 0);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(uVar);
    }

    public final void H0() {
        h0 h0Var;
        View view;
        s91 s91VarD;
        s91 s91VarD2;
        p pVar = (p) this.q0.get();
        if (this.n0.get()) {
            y yVar = pVar.b;
            y yVar2 = y.RESUMED;
            if (io.sentry.config.a.o(yVar, yVar2) && this.Z != u0.DISCONNECTED) {
                i1 i1Var = this.g0;
                if (i1Var == null || (s91VarD2 = i1Var.d()) == null || !s91VarD2.k(io.sentry.p.All)) {
                    i1 i1Var2 = this.g0;
                    if (i1Var2 == null || (s91VarD = i1Var2.d()) == null || !s91VarD.k(io.sentry.p.Replay)) {
                        io.sentry.android.replay.capture.c cVar = pVar.d;
                        if (cVar != null) {
                            cVar.d.submit(new io.sentry.android.replay.util.h(new io.sentry.android.core.anr.f(cVar, new Date(), (byte) 4), "CaptureStrategy.resume"));
                        }
                        k0 k0Var = this.h0;
                        if (k0Var != null && (h0Var = k0Var.o0) != null) {
                            io.sentry.d dVar = h0Var.Y;
                            SentryAndroidOptions sentryAndroidOptions = h0Var.X;
                            if (sentryAndroidOptions.getSessionReplay().m) {
                                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Resuming the capture runnable.", new Object[0]);
                            }
                            c0 c0Var = h0Var.Z;
                            if (c0Var != null) {
                                WeakReference weakReference = c0Var.Y;
                                if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                                    try {
                                        view.getViewTreeObserver().addOnDrawListener(c0Var);
                                    } catch (IllegalStateException unused) {
                                    }
                                }
                                c0Var.Z.set(true);
                            }
                            h0Var.g0.getAndSet(true);
                            ((Handler) dVar.Y).removeCallbacks(h0Var);
                            if (!((Handler) dVar.Y).post(h0Var)) {
                                sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
                            }
                        }
                        this.q0.set(p.a(pVar, yVar2, null, null, 13));
                    }
                }
            }
        }
    }

    @Override // io.sentry.d4
    public final void J(d dVar) {
        this.o0 = dVar;
    }

    public final boolean J0(Double d) {
        ThreadLocal threadLocal = this.j0;
        io.sentry.util.l lVar = (io.sentry.util.l) threadLocal.get();
        if (lVar == null) {
            lVar = new io.sentry.util.l();
            threadLocal.set(lVar);
        }
        return d != null && d.doubleValue() >= lVar.c();
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.f0 = sentryAndroidOptions;
        if (Build.VERSION.SDK_INT < 26) {
            sentryAndroidOptions.getLogger().h(s5.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        p4 p4Var = p4.a;
        this.g0 = p4Var;
        this.h0 = new k0(sentryAndroidOptions, this, this, this.p0, (io.sentry.android.replay.util.g) this.l0.getValue());
        this.i0 = new io.sentry.android.replay.gestures.b(sentryAndroidOptions, this);
        this.n0.set(true);
        sentryAndroidOptions.getConnectionStatusProvider().s0(this);
        s91 s91VarD = p4Var.d();
        if (s91VarD != null) {
            ((CopyOnWriteArrayList) s91VarD.g0).add(this);
        }
        io.sentry.util.b.a("Replay");
        SentryAndroidOptions sentryAndroidOptions2 = this.f0;
        if (sentryAndroidOptions2 == null) {
            dh3.T("options");
            throw null;
        }
        m1 executorService = sentryAndroidOptions2.getExecutorService();
        executorService.getClass();
        SentryAndroidOptions sentryAndroidOptions3 = this.f0;
        if (sentryAndroidOptions3 == null) {
            dh3.T("options");
            throw null;
        }
        try {
            executorService.submit(new io.sentry.android.core.anr.f(new io.sentry.android.core.internal.modules.a((Object) this, (byte) 2), sentryAndroidOptions3, (byte) 6));
        } catch (Throwable th) {
            sentryAndroidOptions3.getLogger().e(s5.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    @Override // io.sentry.d4
    public final void U() {
        u uVar = new u(this, (byte) 1);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(uVar);
    }

    public final void V0(boolean z) {
        if (this.l0.d()) {
            vz7 vz7Var = this.l0;
            if (z) {
                ((io.sentry.android.replay.util.g) vz7Var.getValue()).shutdown();
            } else {
                io.sentry.android.replay.util.g gVar = (io.sentry.android.replay.util.g) vz7Var.getValue();
                synchronized (gVar) {
                    if (!gVar.X.isShutdown()) {
                        gVar.X.shutdown();
                    }
                }
            }
        }
        if (this.m0.d()) {
            vz7 vz7Var2 = this.m0;
            if (z) {
                ((io.sentry.android.replay.util.g) vz7Var2.getValue()).shutdown();
                return;
            }
            io.sentry.android.replay.util.g gVar2 = (io.sentry.android.replay.util.g) vz7Var2.getValue();
            synchronized (gVar2) {
                if (!gVar2.X.isShutdown()) {
                    gVar2.X.shutdown();
                }
            }
        }
    }

    @Override // io.sentry.d4
    public final void X(String str) {
        io.sentry.android.replay.capture.c cVar;
        p pVar = (p) this.q0.get();
        if (!this.n0.get() || !pVar.b() || (cVar = pVar.d) == null || str.length() <= 0) {
            return;
        }
        synchronized (cVar.r) {
            if (cVar.t.size() < 100) {
                cVar.t.add(str);
            }
        }
    }

    @Override // io.sentry.d4
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final c4 getO0() {
        return this.o0;
    }

    public final void Z0(boolean z) {
        AtomicReference atomicReference = this.q0;
        p pVar = (p) atomicReference.get();
        if (this.n0.get() && io.sentry.config.a.o(pVar.b, y.STOPPED)) {
            k0 k0Var = this.h0;
            vz7 vz7Var = this.k0;
            if (k0Var != null) {
                io.sentry.android.core.e0 e0Var = ((a0) vz7Var.getValue()).Z;
                k0 k0Var2 = this.h0;
                k0Var2.getClass();
                e0Var.remove(k0Var2);
            }
            ((a0) vz7Var.getValue()).Z.remove(this.i0);
            k0 k0Var3 = this.h0;
            if (k0Var3 != null) {
                k0Var3.reset();
            }
            k0 k0Var4 = this.h0;
            if (k0Var4 != null) {
                k0Var4.u();
            }
            io.sentry.android.replay.gestures.b bVar = this.i0;
            if (bVar != null) {
                ArrayList arrayList = bVar.Z;
                io.sentry.util.a aVar = bVar.f0;
                aVar.g();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        View view = (View) ((WeakReference) it.next()).get();
                        if (view != null) {
                            bVar.b(view);
                        }
                    }
                    arrayList.clear();
                    u15.h(aVar, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u15.h(aVar, th);
                        throw th2;
                    }
                }
            }
            io.sentry.android.replay.capture.c cVar = pVar.d;
            if (cVar != null) {
                cVar.o();
            }
            y yVar = y.STOPPED;
            io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
            wVar.getClass();
            atomicReference.set(p.a(pVar, yVar, wVar, null, 1));
        }
    }

    public final void a0(String str) {
        File[] fileArrListFiles;
        SentryAndroidOptions sentryAndroidOptions = this.f0;
        if (sentryAndroidOptions == null) {
            dh3.T("options");
            throw null;
        }
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            if (mm7.Z(name, false, "replay_") && !fm7.d0(name, g().a(), false) && (fm7.o0(str) || !fm7.d0(name, str, false))) {
                io.sentry.util.b.g(file);
            }
        }
    }

    public final void c0() {
        s91 s91VarD;
        AtomicReference atomicReference = this.q0;
        y yVar = ((p) atomicReference.get()).b;
        y yVar2 = y.CLOSED;
        if (io.sentry.config.a.o(yVar, yVar2)) {
            SentryAndroidOptions sentryAndroidOptions = this.f0;
            if (sentryAndroidOptions == null) {
                dh3.T("options");
                throw null;
            }
            sentryAndroidOptions.getConnectionStatusProvider().I0(this);
            i1 i1Var = this.g0;
            if (i1Var != null && (s91VarD = i1Var.d()) != null) {
                ((CopyOnWriteArrayList) s91VarD.g0).remove(this);
            }
            Z0(true);
            k0 k0Var = this.h0;
            if (k0Var != null) {
                k0Var.close();
            }
            this.h0 = null;
            ((a0) this.k0.getValue()).close();
            Object obj = atomicReference.get();
            obj.getClass();
            atomicReference.set(p.a((p) obj, yVar2, null, null, 13));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n0.get()) {
            SentryAndroidOptions sentryAndroidOptions = this.f0;
            if (sentryAndroidOptions == null) {
                dh3.T("options");
                throw null;
            }
            if (sentryAndroidOptions.getThreadChecker().c()) {
                c0();
                V0(false);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            io.sentry.android.core.anr.f fVar = new io.sentry.android.core.anr.f(this, countDownLatch, (byte) 3);
            io.sentry.d dVar = this.p0;
            dVar.getClass();
            if (((Handler) dVar.Y).post(fVar)) {
                try {
                    SentryAndroidOptions sentryAndroidOptions2 = this.f0;
                    if (sentryAndroidOptions2 == null) {
                        dh3.T("options");
                        throw null;
                    }
                    if (countDownLatch.await(sentryAndroidOptions2.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                        V0(true);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.d4
    public final io.sentry.protocol.w g() {
        return ((p) this.q0.get()).c;
    }

    @Override // io.sentry.d4
    public final io.sentry.protocol.w k(Boolean bool) {
        p pVar = (p) this.q0.get();
        if (this.n0.get()) {
            boolean zB = pVar.b();
            io.sentry.android.replay.capture.c cVar = pVar.d;
            io.sentry.protocol.w wVar = pVar.c;
            if (zB) {
                io.sentry.protocol.w wVar2 = io.sentry.protocol.w.Y;
                byte b = 0;
                if (dh3.f(wVar, wVar2)) {
                    SentryAndroidOptions sentryAndroidOptions = this.f0;
                    if (sentryAndroidOptions == null) {
                        dh3.T("options");
                        throw null;
                    }
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    wVar2.getClass();
                    return wVar2;
                }
                if (cVar instanceof io.sentry.android.replay.capture.f) {
                    SentryAndroidOptions sentryAndroidOptions2 = this.f0;
                    if (sentryAndroidOptions2 == null) {
                        dh3.T("options");
                        throw null;
                    }
                    if (!J0(sentryAndroidOptions2.getSessionReplay().e)) {
                        SentryAndroidOptions sentryAndroidOptions3 = this.f0;
                        if (sentryAndroidOptions3 == null) {
                            dh3.T("options");
                            throw null;
                        }
                        sentryAndroidOptions3.getLogger().h(s5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
                        wVar2.getClass();
                        return wVar2;
                    }
                }
                i1 i1Var = this.g0;
                if (i1Var != null) {
                    i1Var.o(new j78(pVar, (byte) 20));
                }
                if (bool.equals(Boolean.TRUE)) {
                    if (cVar != null) {
                        cVar.a(c.g0, true);
                    }
                    return wVar;
                }
                s sVar = new s(this, pVar, b);
                io.sentry.d dVar = this.p0;
                dVar.getClass();
                ((Handler) dVar.Y).post(sVar);
                return wVar;
            }
        }
        io.sentry.protocol.w wVar3 = io.sentry.protocol.w.Y;
        wVar3.getClass();
        return wVar3;
    }

    @Override // io.sentry.d4
    public final void m(boolean z) {
        v vVar = new v(this, z);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(vVar);
    }

    @Override // io.sentry.transport.o
    public final void p(s91 s91Var) {
        s sVar = new s(this, s91Var, (byte) 2);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(sVar);
    }

    @Override // io.sentry.d4
    public final void stop() {
        u uVar = new u(this, (byte) 3);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(uVar);
    }

    @Override // io.sentry.v0
    public final void u(u0 u0Var) {
        u0Var.getClass();
        s sVar = new s(this, u0Var, (byte) 1);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(sVar);
    }

    public final void u0(Bitmap bitmap) {
        bitmap.getClass();
        ea6 ea6Var = new ea6();
        i1 i1Var = this.g0;
        if (i1Var != null) {
            i1Var.o(new n(ea6Var, (byte) 0));
        }
        io.sentry.android.replay.capture.c cVar = ((p) this.q0.get()).d;
        if (cVar != null) {
            cVar.h(new w(this, bitmap, ea6Var));
        }
        u uVar = new u(this, (byte) 2);
        io.sentry.d dVar = this.p0;
        dVar.getClass();
        ((Handler) dVar.Y).post(uVar);
    }
}

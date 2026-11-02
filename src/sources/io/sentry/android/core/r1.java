package io.sentry.android.core;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.s91;
import io.sentry.r4;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.v3;
import io.sentry.w3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ r1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.X = (byte) 4;
        this.Y = systemEventsBreadcrumbsIntegration;
        this.f0 = i1Var;
        this.Z = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.Y;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.Z;
                io.sentry.i1 i1Var = (io.sentry.i1) this.f0;
                try {
                    if (sendCachedEnvelopeIntegration.k0.get()) {
                        sentryAndroidOptions.getLogger().h(s5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.j0.getAndSet(true)) {
                        io.sentry.w0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f0 = connectionStatusProvider;
                        connectionStatusProvider.s0(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.i0 = sendCachedEnvelopeIntegration.X.a(i1Var, sentryAndroidOptions);
                    }
                    io.sentry.w0 w0Var = sendCachedEnvelopeIntegration.f0;
                    if (w0Var != null && w0Var.n0() == io.sentry.u0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().h(s5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    s91 s91VarD = i1Var.d();
                    if (s91VarD != null && s91VarD.k(io.sentry.p.All)) {
                        sentryAndroidOptions.getLogger().h(s5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    r4 r4Var = sendCachedEnvelopeIntegration.i0;
                    if (r4Var == null) {
                        sentryAndroidOptions.getLogger().h(s5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        r4Var.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                d dVar = (d) this.Y;
                Runnable runnable = (Runnable) this.Z;
                String str = (String) this.f0;
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) dVar.c).getLogger().h(s5.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                h hVar = (h) this.Y;
                s6 s6Var = (s6) this.Z;
                io.sentry.i1 i1Var2 = (io.sentry.i1) this.f0;
                ArrayList<v3> arrayList = hVar.o0;
                if (hVar.r0.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                io.sentry.util.a aVar = hVar.y0;
                aVar.g();
                try {
                    for (v3 v3Var : arrayList) {
                        w3 w3Var = new w3(v3Var.a, v3Var.b, v3Var.d, v3Var.c, Double.valueOf(v3Var.e), s6Var);
                        w3Var.m0 = v3Var.f;
                        arrayList2.add(w3Var);
                    }
                    arrayList.clear();
                    aVar.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        i1Var2.h((w3) it.next());
                    }
                    return;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.Y;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.Z;
                String str2 = (String) this.f0;
                io.sentry.util.a aVar2 = envelopeFileObserverIntegration.f0;
                aVar2.g();
                try {
                    if (!envelopeFileObserverIntegration.Z) {
                        envelopeFileObserverIntegration.g(sentryAndroidOptions2, str2);
                        break;
                    }
                    aVar2.close();
                    return;
                } catch (Throwable th4) {
                    try {
                        aVar2.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.Y;
                io.sentry.i1 i1Var3 = (io.sentry.i1) this.f0;
                SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.Z;
                io.sentry.util.a aVar3 = systemEventsBreadcrumbsIntegration.m0;
                aVar3.g();
                try {
                    if (!systemEventsBreadcrumbsIntegration.h0 && !systemEventsBreadcrumbsIntegration.i0 && systemEventsBreadcrumbsIntegration.Y == null) {
                        systemEventsBreadcrumbsIntegration.Y = new h2(systemEventsBreadcrumbsIntegration, i1Var3, sentryAndroidOptions3);
                        if (systemEventsBreadcrumbsIntegration.j0 == null) {
                            systemEventsBreadcrumbsIntegration.j0 = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.g0) {
                                systemEventsBreadcrumbsIntegration.j0.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.k0 == null) {
                            systemEventsBreadcrumbsIntegration.k0 = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.k0.start();
                        }
                        try {
                            m0.i(systemEventsBreadcrumbsIntegration.X, sentryAndroidOptions3, systemEventsBreadcrumbsIntegration.Y, systemEventsBreadcrumbsIntegration.j0, new Handler(systemEventsBreadcrumbsIntegration.k0.getLooper()));
                            if (!systemEventsBreadcrumbsIntegration.l0.getAndSet(true)) {
                                sentryAndroidOptions3.getLogger().h(s5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                io.sentry.util.b.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th6) {
                            sentryAndroidOptions3.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions3.getLogger().e(s5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th6);
                        }
                        break;
                    }
                    aVar3.close();
                    return;
                } catch (Throwable th7) {
                    try {
                        aVar3.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
        }
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}

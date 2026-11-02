package io.sentry.android.core.anr;

import android.view.Choreographer;
import defpackage.da2;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.t;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.util.h;
import io.sentry.ndk.NativeScope;
import io.sentry.s5;
import io.sentry.s6;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.X) {
            case 0:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.Y;
                d dVar = (d) this.Z;
                if (dVar == null) {
                    return;
                }
                try {
                    dVar.close();
                    return;
                } catch (IOException unused) {
                    anrProfilingIntegration.k0.h(s5.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    return;
                }
            case 1:
                t tVar = (t) this.Y;
                ILogger iLogger = (ILogger) this.Z;
                try {
                    tVar.m0 = Choreographer.getInstance();
                } catch (Throwable th) {
                    iLogger.e(s5.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
                }
                try {
                    tVar.n0 = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                    tVar.n0.setAccessible(true);
                    return;
                } catch (NoSuchFieldException e) {
                    iLogger.e(s5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
                    return;
                }
            case 2:
                io.sentry.android.ndk.b bVar = (io.sentry.android.ndk.b) this.Y;
                io.sentry.g gVar = (io.sentry.g) this.Z;
                SentryAndroidOptions sentryAndroidOptions = bVar.a;
                s5 s5Var = gVar.k0;
                String strD = null;
                String lowerCase = s5Var != null ? s5Var.name().toLowerCase(Locale.ROOT) : null;
                String strF = io.sentry.vendor.a.f(gVar.c().getTime());
                try {
                    Map mapB = gVar.b();
                    if (!mapB.isEmpty()) {
                        strD = sentryAndroidOptions.getSerializer().d(mapB);
                    }
                    break;
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(s5.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
                }
                NativeScope.nativeAddBreadcrumb(lowerCase, gVar.f0, gVar.i0, gVar.g0, strF, strD);
                return;
            case 3:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.Y;
                CountDownLatch countDownLatch = (CountDownLatch) this.Z;
                int i = ReplayIntegration.r0;
                try {
                    replayIntegration.c0();
                    return;
                } finally {
                    replayIntegration.V0(false);
                    countDownLatch.countDown();
                }
            case 4:
                ((io.sentry.android.replay.capture.c) this.Y).m((Date) this.Z);
                return;
            case 5:
                File file = (File) this.Y;
                io.sentry.android.replay.capture.f fVar = (io.sentry.android.replay.capture.f) this.Z;
                if (file != null) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.isDirectory() || !da2.S(file2).equals("mp4")) {
                                io.sentry.util.b.g(file2);
                            }
                        }
                    }
                    file.delete();
                }
                fVar.k(-1);
                return;
            case 6:
                io.sentry.android.core.internal.modules.a aVar = (io.sentry.android.core.internal.modules.a) this.Y;
                s6 s6Var = (s6) this.Z;
                try {
                    aVar.run();
                    return;
                } catch (Throwable th3) {
                    s6Var.getLogger().e(s5.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th3);
                    return;
                }
            default:
                Runnable runnable = (Runnable) this.Y;
                io.sentry.android.replay.util.g gVar2 = (io.sentry.android.replay.util.g) this.Z;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th4) {
                    gVar2.Y.getLogger().e(s5.ERROR, "Failed to execute task ".concat(runnable instanceof h ? ((h) runnable).X : _UrlKt.FRAGMENT_ENCODE_SET), th4);
                    return;
                }
        }
    }
}

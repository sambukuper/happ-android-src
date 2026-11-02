package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.u52;
import io.sentry.j5;
import io.sentry.s5;
import io.sentry.v4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Runnable {
    public final Context X;
    public final SentryAndroidOptions Y;
    public final k0 Z;
    public final long f0;

    public l0(Context context, SentryAndroidOptions sentryAndroidOptions, k0 k0Var) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        this.Y = sentryAndroidOptions;
        this.Z = k0Var;
        this.f0 = System.currentTimeMillis() - 7862400000L;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        k0 k0Var = this.Z;
        io.sentry.n nVarE = k0Var.e(applicationExitInfo, z);
        if (nVarE == null) {
            return;
        }
        io.sentry.n0 n0Var = (io.sentry.n0) nVarE.c;
        j5 j5Var = (j5) nVarE.b;
        boolean zEquals = v4.b().z(j5Var, n0Var).equals(io.sentry.protocol.w.Y);
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        if (!zEquals) {
            if (((io.sentry.hints.c) nVarE.d).d()) {
                return;
            }
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", k0Var.c(), j5Var.X);
        } else if (Boolean.TRUE.equals(n0Var.c(Boolean.class, "sentry:captureFailed"))) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing the %s event failed, leaving the exit for the next app start.", k0Var.c());
        } else {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "%s event was dropped, marking the exit as reported.", k0Var.c());
            k0Var.f(applicationExitInfo.getTimestamp());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.X.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.h()) {
                sentryAndroidOptions.getLogger().h(s5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.g0.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = u52.a(it.next());
            if (applicationExitInfoA != null) {
                arrayList.add(applicationExitInfoA);
            }
        }
        k0 k0Var = this.Z;
        Long lB = k0Var.b();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ApplicationExitInfo applicationExitInfoA2 = u52.a(it2.next());
            if (k0Var.a(applicationExitInfoA2)) {
                it2.remove();
                applicationExitInfo = applicationExitInfoA2;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "No %ss have been found in the historical exit reasons list.", k0Var.c());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j = this.f0;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Latest %s happened too long ago, returning early.", k0Var.c());
            return;
        }
        if (lB != null && applicationExitInfo.getTimestamp() <= lB.longValue()) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Latest %s has already been reported, returning early.", k0Var.c());
            return;
        }
        if (k0Var.d()) {
            Collections.reverse(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ApplicationExitInfo applicationExitInfoA3 = u52.a(it3.next());
                if (k0Var.a(applicationExitInfoA3)) {
                    if (applicationExitInfoA3.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "%s happened too long ago %s.", k0Var.c(), applicationExitInfoA3);
                    } else if (lB == null || applicationExitInfoA3.getTimestamp() > lB.longValue()) {
                        a(applicationExitInfoA3, false);
                    } else {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "%s has already been reported %s.", k0Var.c(), applicationExitInfoA3);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}

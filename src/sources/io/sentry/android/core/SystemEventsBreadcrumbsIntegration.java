package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import defpackage.fl6;
import io.sentry.p4;
import io.sentry.s5;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.y1, Closeable, d0 {
    public final Context X;
    public volatile h2 Y;
    public SentryAndroidOptions Z;
    public io.sentry.i1 f0;
    public final String[] g0;
    public volatile boolean h0 = false;
    public volatile boolean i0 = false;
    public volatile IntentFilter j0 = null;
    public volatile HandlerThread k0 = null;
    public final AtomicBoolean l0 = new AtomicBoolean(false);
    public final io.sentry.util.a m0 = new io.sentry.util.a();
    public g2 n0;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext == null ? context : applicationContext;
        this.g0 = strArr;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Z = sentryAndroidOptions;
        this.f0 = p4.a;
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.Z.isEnableSystemEventBreadcrumbs()));
        if (this.Z.isEnableSystemEventBreadcrumbs()) {
            g0.g0.g(this);
            if (m0.f()) {
                m(this.f0, this.Z);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.m0;
        aVar.g();
        try {
            this.h0 = true;
            this.j0 = null;
            if (this.k0 != null) {
                this.k0.quit();
            }
            this.k0 = null;
            aVar.close();
            g0.g0.p(this);
            SentryAndroidOptions sentryAndroidOptions = this.Z;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new fl6(this, (byte) 28));
                } catch (RejectedExecutionException unused) {
                    p(this.Z);
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.Z;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().h(s5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.d0
    public final void g() {
        if (this.f0 == null || this.Z == null) {
            return;
        }
        this.i0 = false;
        m(this.f0, this.Z);
    }

    @Override // io.sentry.android.core.d0
    public final void k() {
        SentryAndroidOptions sentryAndroidOptions = this.Z;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new fl6(this, (byte) 28));
        } catch (RejectedExecutionException unused) {
            p(this.Z);
        }
    }

    public final void m(io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.h0 && !this.i0 && this.Y == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new r1(this, i1Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void p(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.a aVar = this.m0;
        aVar.g();
        try {
            this.i0 = true;
            h2 h2Var = this.Y;
            this.Y = null;
            aVar.close();
            if (h2Var != null) {
                try {
                    this.X.unregisterReceiver(h2Var);
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(s5.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

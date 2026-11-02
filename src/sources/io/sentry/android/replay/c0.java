package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.b61;
import defpackage.hg;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ViewTreeObserver.OnDrawListener {
    public final SentryAndroidOptions X;
    public WeakReference Y;
    public final AtomicBoolean Z;
    public final AtomicBoolean f0;
    public final io.sentry.android.replay.screenshot.j g0;

    public c0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, d0 d0Var, k0 k0Var) {
        io.sentry.android.replay.screenshot.j bVar;
        k0Var.getClass();
        this.X = sentryAndroidOptions;
        this.Z = new AtomicBoolean(true);
        io.sentry.android.replay.util.b bVar2 = new io.sentry.android.replay.util.b();
        this.f0 = new AtomicBoolean(false);
        int i = b0.a[sentryAndroidOptions.getSessionReplay().n.ordinal()];
        if (i == 1) {
            bVar = new io.sentry.android.replay.screenshot.b(sentryAndroidOptions, replayIntegration, d0Var, k0Var);
        } else {
            if (i != 2) {
                b61.c();
                throw null;
            }
            bVar = new io.sentry.android.replay.screenshot.i(k0Var, replayIntegration, sentryAndroidOptions, d0Var, bVar2, new hg(this, (byte) 6));
        }
        this.g0 = bVar;
    }

    public final void a(View view) {
        view.getClass();
        WeakReference weakReference = this.Y;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.Y;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.Y = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.f0.set(true);
        this.g0.onContentChanged();
    }

    public final void b() {
        SentryAndroidOptions sentryAndroidOptions = this.X;
        boolean z = sentryAndroidOptions.getSessionReplay().m;
        AtomicBoolean atomicBoolean = this.Z;
        if (z) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = sentryAndroidOptions.getSessionReplay().m;
        io.sentry.android.replay.screenshot.j jVar = this.g0;
        AtomicBoolean atomicBoolean2 = this.f0;
        if (z2) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(jVar.a()));
        }
        if (!atomicBoolean2.get()) {
            jVar.c();
            return;
        }
        WeakReference weakReference = this.Y;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (io.sentry.config.a.k(view) == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            jVar.b(view);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to capture replay recording", th);
        }
    }

    public final void c(View view) {
        this.X.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.Z.get()) {
            WeakReference weakReference = this.Y;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.X.getLogger().h(s5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f0.set(true);
                this.g0.onContentChanged();
            }
        }
    }
}

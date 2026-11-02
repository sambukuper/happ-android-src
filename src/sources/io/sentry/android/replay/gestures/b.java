package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import defpackage.bw0;
import defpackage.u15;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.g;
import io.sentry.android.replay.j0;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {
    public final SentryAndroidOptions X;
    public final ReplayIntegration Y;
    public final ArrayList Z = new ArrayList();
    public final io.sentry.util.a f0 = new io.sentry.util.a();
    public final WeakHashMap g0 = new WeakHashMap();
    public final io.sentry.util.a h0 = new io.sentry.util.a();

    public b(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration) {
        this.X = sentryAndroidOptions;
        this.Y = replayIntegration;
    }

    public final void a(View view) throws IllegalAccessException {
        WeakHashMap weakHashMap = this.g0;
        Window windowK = io.sentry.config.a.k(view);
        SentryAndroidOptions sentryAndroidOptions = this.X;
        if (windowK == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.h0;
        aVar.g();
        try {
            WeakReference weakReference = (WeakReference) weakHashMap.get(windowK);
            if ((weakReference != null ? (a) weakReference.get() : null) != null) {
                u15.h(aVar, null);
                return;
            }
            u15.h(aVar, null);
            a aVar2 = new a(sentryAndroidOptions, this.Y, windowK.getCallback());
            windowK.setCallback(aVar2);
            aVar.g();
            try {
                weakHashMap.put(windowK, new WeakReference(aVar2));
                u15.h(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(aVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u15.h(aVar, th3);
                throw th4;
            }
        }
    }

    public final void b(View view) throws IllegalAccessException {
        Window windowK = io.sentry.config.a.k(view);
        if (windowK == null) {
            this.X.getLogger().h(s5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowK.getCallback();
        if (callback instanceof a) {
            windowK.setCallback(((a) callback).X);
            io.sentry.util.a aVar = this.h0;
            aVar.g();
            try {
                u15.h(aVar, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(aVar, th);
                    throw th2;
                }
            }
        }
        io.sentry.util.a aVar2 = this.h0;
        aVar2.g();
        try {
            WeakReference weakReference = (WeakReference) this.g0.get(windowK);
            a aVar3 = weakReference != null ? (a) weakReference.get() : null;
            u15.h(aVar2, null);
            if (aVar3 != null) {
                aVar3.Z = null;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u15.h(aVar2, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public final void g(View view, boolean z) {
        view.getClass();
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        ArrayList arrayList = this.Z;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                a(view);
            } else {
                b(view);
                bw0.h0(arrayList, new j0(view, (byte) 1));
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
}

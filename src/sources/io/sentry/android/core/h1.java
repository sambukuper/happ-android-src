package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.v3;
import io.sentry.w3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Object obj = this.g0;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                io.sentry.i1 i1Var = (io.sentry.i1) obj3;
                v3 v3Var = (v3) obj2;
                s6 s6Var = (s6) obj;
                if (((j1) obj4).n0.get()) {
                    return;
                }
                w3 w3Var = new w3(v3Var.a, v3Var.b, v3Var.d, v3Var.c, Double.valueOf(v3Var.e), s6Var);
                w3Var.m0 = v3Var.f;
                i1Var.h(w3Var);
                return;
            case 1:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((AtomicReference) obj3).set(((ScreenshotEventProcessor) obj4).d((Activity) obj2));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 2:
                Window window = (Window) obj4;
                Window.Callback callback = (Window.Callback) obj3;
                Runnable runnable = (Runnable) obj2;
                n0 n0Var = (n0) obj;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    io.sentry.android.core.internal.util.k.b(viewPeekDecorView, runnable, n0Var);
                    return;
                }
                return;
            default:
                ILogger iLogger = (ILogger) obj2;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                try {
                    ((View) obj4).draw((Canvas) obj3);
                    break;
                } catch (Throwable th) {
                    try {
                        iLogger.e(s5.ERROR, "Taking screenshot failed (view.draw).", th);
                    } finally {
                        countDownLatch2.countDown();
                    }
                    break;
                }
                return;
        }
    }
}

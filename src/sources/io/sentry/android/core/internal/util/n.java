package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.android.core.h1;
import io.sentry.android.core.n0;
import io.sentry.s5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static Bitmap a(Activity activity, io.sentry.util.thread.a aVar, ILogger iLogger, n0 n0Var) {
        boolean z = false;
        if (activity.isFinishing() || activity.isDestroyed()) {
            iLogger.h(s5.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.h(s5.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.h(s5.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.h(s5.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.h(s5.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            int i = Build.VERSION.SDK_INT;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (i >= 26) {
                HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                handlerThread.start();
                AtomicInteger atomicInteger = new AtomicInteger(-1);
                try {
                    PixelCopy.request(window, bitmapCreateBitmap, new m(atomicInteger, countDownLatch, (byte) 0), new Handler(handlerThread.getLooper()));
                    if (countDownLatch.await(1000L, timeUnit) && atomicInteger.get() == 0) {
                        z = true;
                    }
                } catch (Throwable th) {
                    try {
                        iLogger.e(s5.ERROR, "Taking screenshot using PixelCopy failed.", th);
                    } catch (Throwable th2) {
                        handlerThread.quit();
                        throw th2;
                    }
                }
                handlerThread.quit();
                if (!z) {
                    iLogger.h(s5.WARNING, "PixelCopy failed for screenshot capture (result=%d).", Integer.valueOf(atomicInteger.get()));
                    return null;
                }
            } else {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (aVar.c()) {
                    rootView.draw(canvas);
                    countDownLatch.countDown();
                } else {
                    activity.runOnUiThread(new h1(rootView, canvas, iLogger, countDownLatch, (byte) 3));
                }
                if (!countDownLatch.await(1000L, timeUnit)) {
                    return null;
                }
            }
            return bitmapCreateBitmap;
        } catch (Throwable th3) {
            iLogger.e(s5.ERROR, "Taking screenshot failed.", th3);
            return null;
        }
    }
}

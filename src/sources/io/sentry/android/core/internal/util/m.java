package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s5;
import io.sentry.w6;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((AtomicInteger) obj2).set(i);
                ((CountDownLatch) obj).countDown();
                break;
            default:
                final io.sentry.android.replay.screenshot.i iVar = (io.sentry.android.replay.screenshot.i) obj2;
                final View view = (View) obj;
                AtomicBoolean atomicBoolean = iVar.m;
                AtomicBoolean atomicBoolean2 = iVar.i;
                AtomicInteger atomicInteger = iVar.l;
                SentryAndroidOptions sentryAndroidOptions = iVar.b;
                if (atomicBoolean.get()) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                    iVar.h();
                } else if (i == 0) {
                    final boolean z = iVar.k.get();
                    if (z && atomicInteger.incrementAndGet() <= 1) {
                        sentryAndroidOptions.getLogger().h(s5.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                        atomicBoolean2.set(false);
                        iVar.h();
                    } else {
                        try {
                            w6 sessionReplay = sentryAndroidOptions.getSessionReplay();
                            sessionReplay.getClass();
                            final io.sentry.android.replay.viewhierarchy.g gVarE = io.sentry.config.a.e(view, null, sessionReplay);
                            ArrayList arrayList = sentryAndroidOptions.getSessionReplay().o ? new ArrayList() : null;
                            w6 sessionReplay2 = sentryAndroidOptions.getSessionReplay();
                            sessionReplay2.getClass();
                            ILogger logger = sentryAndroidOptions.getLogger();
                            logger.getClass();
                            io.sentry.android.replay.util.l.b(view, gVarE, sessionReplay2, logger, arrayList);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                iVar.d.invoke();
                                iVar.e(view, arrayList, gVarE, !z);
                            }
                            if (iVar.e.submit(new io.sentry.android.replay.util.h(new Runnable() { // from class: io.sentry.android.replay.screenshot.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i iVar2 = iVar;
                                    try {
                                        iVar2.d(view, gVarE, !z);
                                    } finally {
                                        iVar2.h();
                                    }
                                }
                            }, "screenshot_recorder.mask")) == null) {
                                iVar.h();
                            }
                        } catch (RuntimeException e) {
                            sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to process replay frame", e);
                            iVar.h();
                        }
                    }
                } else {
                    sentryAndroidOptions.getLogger().h(s5.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                    atomicInteger.set(0);
                    atomicBoolean2.set(false);
                    iVar.h();
                }
                break;
        }
    }
}

package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ey1;
import defpackage.p61;
import io.sentry.ILogger;
import io.sentry.j5;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.i0 {
    public final SentryAndroidOptions a;
    public final io.sentry.android.core.internal.util.h b = new io.sentry.android.core.internal.util.h(2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.b.a("ViewHierarchy");
        }
    }

    public static void d(View view, io.sentry.protocol.k0 k0Var, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw p61.k(it);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.k0 k0VarE = e(childAt);
                    arrayList.add(k0VarE);
                    d(childAt, k0VarE, list);
                }
            }
            k0Var.m0 = arrayList;
        }
    }

    public static io.sentry.protocol.k0 e(View view) {
        io.sentry.protocol.k0 k0Var = new io.sentry.protocol.k0();
        k0Var.Y = io.sentry.config.a.g(view);
        try {
            String strL = io.sentry.config.a.l(view);
            if (strL != null) {
                k0Var.Z = strL;
            }
        } catch (Throwable unused) {
        }
        k0Var.i0 = Double.valueOf(view.getX());
        k0Var.j0 = Double.valueOf(view.getY());
        k0Var.g0 = Double.valueOf(view.getWidth());
        k0Var.h0 = Double.valueOf(view.getHeight());
        k0Var.l0 = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k0Var.k0 = "visible";
        } else if (visibility == 4) {
            k0Var.k0 = "invisible";
        } else if (visibility == 8) {
            k0Var.k0 = "gone";
        }
        return k0Var;
    }

    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, io.sentry.n0 n0Var) {
        if (j5Var.g()) {
            SentryAndroidOptions sentryAndroidOptions = this.a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return j5Var;
            }
            if (!io.sentry.util.b.l(n0Var)) {
                boolean zA = this.b.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zA) {
                    WeakReference weakReference = (WeakReference) n0.b.a;
                    io.sentry.protocol.j0 j0Var = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<Object> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    ILogger logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.h(s5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.h(s5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.h(s5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.j0 j0Var2 = new io.sentry.protocol.j0("android_view_system", arrayList);
                                        io.sentry.protocol.k0 k0VarE = e(viewPeekDecorView);
                                        arrayList.add(k0VarE);
                                        d(viewPeekDecorView, k0VarE, viewHierarchyExporters);
                                        j0Var = j0Var2;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new ey1(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            j0Var = (io.sentry.protocol.j0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.e(s5.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (j0Var != null) {
                        n0Var.e = new io.sentry.a(j0Var);
                    }
                }
            }
        }
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.n0 n0Var) {
        return f0Var;
    }
}

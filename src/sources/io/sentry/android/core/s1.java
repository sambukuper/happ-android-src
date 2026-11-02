package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import defpackage.j78;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.s5;
import io.sentry.u4;
import io.sentry.v4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    public static final long a = SystemClock.uptimeMillis();
    public static final io.sentry.util.a b = new io.sentry.util.a();

    public static void a(SentryAndroidOptions sentryAndroidOptions, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (io.sentry.y1 y1Var : sentryAndroidOptions.getIntegrations()) {
            if (z && (y1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(y1Var);
            }
            if (z2 && (y1Var instanceof SentryTimberIntegration)) {
                arrayList.add(y1Var);
            }
            if (y1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(y1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.y1) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.y1) arrayList.get(i2));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.y1) arrayList3.get(i3));
            }
        }
    }

    public static void b(Context context, v vVar, u4 u4Var) {
        Trace.beginSection("SentryAndroid.init");
        try {
            try {
                try {
                    io.sentry.util.a aVar = b;
                    aVar.g();
                    try {
                        v4.c(new v((byte) 6), new e(vVar, context, u4Var));
                        io.sentry.i1 i1VarB = v4.b();
                        if (m0.f()) {
                            if (i1VarB.i().isEnableAutoSessionTracking()) {
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                i1VarB.o(new j78(atomicBoolean, (byte) 15));
                                if (!atomicBoolean.get()) {
                                    i1VarB.l();
                                }
                            }
                            i1VarB.i().getReplayController().m(true);
                        }
                        aVar.close();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IllegalAccessException e) {
                    vVar.e(s5.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (InvocationTargetException e2) {
                    vVar.e(s5.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (InstantiationException e3) {
                vVar.e(s5.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (NoSuchMethodException e4) {
                vVar.e(s5.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}

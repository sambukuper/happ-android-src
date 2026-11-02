package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import defpackage.c4;
import defpackage.j78;
import defpackage.k6;
import defpackage.l6;
import defpackage.n6;
import defpackage.pz2;
import defpackage.r6;
import defpackage.ym5;
import io.sentry.ILogger;
import io.sentry.s5;
import io.sentry.s6;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements io.sentry.transport.h {
    public static final n0 b = new n0();
    public Object a;

    public n0() {
        this.a = new Handler(Looper.getMainLooper());
    }

    public static n0 d(Activity activity, e eVar) {
        if (activity instanceof ComponentActivity) {
            return new n0(((ComponentActivity) activity).k0.c("sentry_user_feedback_screenshot_picker", new n6((byte) 0), new j78(eVar, (byte) 16)));
        }
        return null;
    }

    @Override // io.sentry.transport.h
    public boolean a() {
        int i = x.a[((s6) this.a).getConnectionStatusProvider().n0().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public Boolean b() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            ((ILogger) this.a).e(s5.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }

    public void c() {
        r6 r6Var = (r6) this.a;
        c4.g();
        pz2 pz2Var = pz2.Y;
        ym5 ym5Var = new ym5();
        ym5Var.a = k6.a;
        c4.g();
        ym5Var.a = l6.a;
        ym5Var.b = pz2Var;
        r6Var.h0(ym5Var);
    }

    public void e(Activity activity) {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference == null || weakReference.get() != activity) {
            this.a = new WeakReference(activity);
        }
    }

    public /* synthetic */ n0(Object obj) {
        this.a = obj;
    }

    public n0(ILogger iLogger) {
        io.sentry.util.b.s(iLogger, "The ILogger object is required.");
        this.a = iLogger;
    }
}

package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.s5;
import java.nio.charset.Charset;
import java.util.HashMap;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends BroadcastReceiver {
    public final io.sentry.i1 a;
    public final SentryAndroidOptions b;
    public final io.sentry.android.core.internal.util.h c = new io.sentry.android.core.internal.util.h(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, 0);
    public final char[] d = new char[64];
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration e;

    public h2(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.i1 i1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.e = systemEventsBreadcrumbsIntegration;
        this.a = i1Var;
        this.b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g2 g2Var;
        Bundle extras;
        int i;
        String action = intent.getAction();
        boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        SentryAndroidOptions sentryAndroidOptions = this.b;
        String str = null;
        if (!zEquals) {
            g2Var = null;
        } else {
            if (this.c.a()) {
                return;
            }
            Float fB = r0.b(intent, sentryAndroidOptions);
            g2Var = new g2(fB != null ? Integer.valueOf(fB.intValue()) : null, r0.c(intent, sentryAndroidOptions));
            SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.e;
            if (g2Var.equals(systemEventsBreadcrumbsIntegration.n0)) {
                return;
            } else {
                systemEventsBreadcrumbsIntegration.n0 = g2Var;
            }
        }
        io.sentry.g gVar = new io.sentry.g(System.currentTimeMillis());
        gVar.g0 = "system";
        gVar.i0 = "device.event";
        if (action != null) {
            int length = action.length();
            char[] cArr = this.d;
            int length2 = cArr.length;
            int i2 = length - 1;
            while (true) {
                if (i2 >= 0) {
                    char cCharAt = action.charAt(i2);
                    if (cCharAt == '.') {
                        str = new String(cArr, length2, cArr.length - length2);
                        break;
                    }
                    if (length2 == 0) {
                        Charset charset = io.sentry.util.q.a;
                        int iLastIndexOf = action.lastIndexOf(".");
                        if (iLastIndexOf >= 0 && action.length() > (i = iLastIndexOf + 1)) {
                            str = action.substring(i);
                            break;
                        }
                        break;
                    }
                    length2--;
                    cArr[length2] = cCharAt;
                    i2--;
                }
                str = action;
                break;
            }
        }
        if (str != null) {
            gVar.d(str, "action");
        }
        if (g2Var != null) {
            Integer num = g2Var.a;
            if (num != null) {
                gVar.d(num, "level");
            }
            Boolean bool = g2Var.b;
            if (bool != null) {
                gVar.d(bool, "charging");
            }
        } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
            HashMap map = new HashMap(extras.size());
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj != null) {
                        map.put(str2, obj.toString());
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(s5.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                }
            }
            gVar.d(map, "extras");
        }
        gVar.k0 = s5.INFO;
        io.sentry.n0 n0Var = new io.sentry.n0();
        n0Var.d(intent, "android:intent");
        this.a.a(gVar, n0Var);
    }
}

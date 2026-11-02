package io.sentry;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements e2, io.sentry.util.f, h4, io.sentry.transport.f, u4, l4 {
    public final /* synthetic */ byte X;

    public /* synthetic */ c2(byte b) {
        this.X = b;
    }

    public static /* synthetic */ void g() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void i(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m() {
        throw new ClassCastException();
    }

    @Override // io.sentry.e2
    public Object b() {
        return null;
    }

    @Override // io.sentry.transport.f
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.f
    public Object e() {
        switch (this.X) {
            case 4:
                return s6.empty();
            case 5:
                return s6.empty();
            case 9:
                return new x4();
            case 11:
                return new FrameMetricsAggregator();
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (p pVar : p.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), pVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    public Object f(Context context) {
        String string = null;
        switch (this.X) {
            case 13:
                return io.sentry.android.core.m0.g(context);
            case 14:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case 15:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i);
                    }
                    break;
                } catch (Throwable unused2) {
                }
                return string;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return io.sentry.android.core.m0.h(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    @Override // io.sentry.l4
    public void h(g1 g1Var) {
        g1Var.getClass();
        g1Var.h(io.sentry.protocol.w.Y);
    }

    @Override // io.sentry.h4
    public void a(d7 d7Var) {
    }

    @Override // io.sentry.u4
    public void c(SentryAndroidOptions sentryAndroidOptions) {
    }
}

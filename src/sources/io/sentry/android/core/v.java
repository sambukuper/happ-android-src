package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import defpackage.wg;
import io.sentry.ILogger;
import io.sentry.s5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements io.sentry.p1, w0, ILogger, io.sentry.logger.a, io.sentry.metrics.a {
    public static final v Y = new v(0);
    public static final v Z = new v(1);
    public final /* synthetic */ byte X;

    public /* synthetic */ v(byte b) {
        this.X = b;
    }

    @Override // io.sentry.logger.a
    public io.sentry.logger.b a(SentryAndroidOptions sentryAndroidOptions, wg wgVar) {
        l lVar = new l(sentryAndroidOptions, wgVar, (byte) 0);
        g0.g0.g(lVar);
        return lVar;
    }

    @Override // io.sentry.p1
    public void b() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.metrics.a
    public io.sentry.logger.b c(SentryAndroidOptions sentryAndroidOptions, wg wgVar) {
        n nVar = new n(sentryAndroidOptions, wgVar, (byte) 1);
        g0.g0.g(nVar);
        return nVar;
    }

    @Override // io.sentry.ILogger
    public void d(s5 s5Var, Throwable th, String str, Object... objArr) {
        switch (this.X) {
            case 2:
                if (objArr.length != 0) {
                    e(s5Var, String.format(str, objArr), th);
                } else {
                    e(s5Var, str, th);
                }
                break;
            default:
                if (objArr.length != 0) {
                    e(s5Var, String.format(str, objArr), th);
                } else {
                    e(s5Var, str, th);
                }
                break;
        }
    }

    @Override // io.sentry.ILogger
    public void e(s5 s5Var, String str, Throwable th) {
        switch (this.X) {
            case 2:
                Log.wtf("Sentry", str, th);
                break;
            default:
                if (k.a[s5Var.ordinal()] == 4) {
                    Log.wtf("Sentry", str, th);
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.p1
    public void f() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.ILogger
    public void h(s5 s5Var, String str, Object... objArr) {
        int i = 7;
        switch (this.X) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                if (objArr.length != 0) {
                    int i2 = k.a[s5Var.ordinal()];
                    if (i2 == 1) {
                        i = 4;
                    } else if (i2 == 2) {
                        i = 5;
                    } else if (i2 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", String.format(str, objArr));
                } else {
                    int i3 = k.a[s5Var.ordinal()];
                    if (i3 == 1) {
                        i = 4;
                    } else if (i3 == 2) {
                        i = 5;
                    } else if (i3 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.ILogger
    public boolean i(s5 s5Var) {
        switch (this.X) {
        }
        return true;
    }
}

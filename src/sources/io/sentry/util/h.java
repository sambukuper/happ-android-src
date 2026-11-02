package io.sentry.util;

import defpackage.wg;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s5;
import io.sentry.s6;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements io.sentry.hints.i, io.sentry.logger.a {
    public static boolean b(s6 s6Var, String str) {
        return c(str, s6Var != null ? s6Var.getLogger() : null);
    }

    public static boolean c(String str, ILogger iLogger) {
        return d(iLogger, str, false) != null;
    }

    public static Class d(ILogger iLogger, String str, boolean z) {
        try {
            return Class.forName(str, z, h.class.getClassLoader());
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.h(s5.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.e(s5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.e(s5.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.logger.a
    public io.sentry.logger.b a(SentryAndroidOptions sentryAndroidOptions, wg wgVar) {
        return new io.sentry.logger.b(sentryAndroidOptions, wgVar, (byte) 0);
    }
}

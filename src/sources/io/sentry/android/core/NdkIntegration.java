package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class NdkIntegration implements io.sentry.y1, Closeable {
    public final Class X;
    public SentryAndroidOptions Y;

    public NdkIntegration(Class cls) {
        this.X = cls;
    }

    public static void g(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        Class cls;
        this.Y = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.Y.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.X) == null) {
            g(this.Y);
            return;
        }
        if (this.Y.getCacheDirPath() == null) {
            this.Y.getLogger().h(s5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            g(this.Y);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.Y);
            this.Y.getLogger().h(s5Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.b.a("Ndk");
        } catch (NoSuchMethodException e) {
            g(this.Y);
            this.Y.getLogger().e(s5.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            g(this.Y);
            this.Y.getLogger().e(s5.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.X;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.Y.getLogger().h(s5.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e) {
            this.Y.getLogger().e(s5.ERROR, "Failed to invoke the SentryNdk.close method.", e);
        } catch (Throwable th) {
            this.Y.getLogger().e(s5.ERROR, "Failed to close SentryNdk.", th);
        } finally {
            g(this.Y);
        }
    }
}

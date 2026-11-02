package io.sentry;

import defpackage.sc4;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ShutdownHookIntegration implements y1, Closeable {
    public final Runtime X;
    public Thread Y;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.util.b.s(runtime, "Runtime is required");
        this.X = runtime;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        if (!sentryAndroidOptions.isEnableShutdownHook()) {
            sentryAndroidOptions.getLogger().h(s5.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.Y = new Thread(new t4(sentryAndroidOptions, (byte) 3), "sentry-shutdownhook");
        try {
            new sc4(this, sentryAndroidOptions, (byte) 23).run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Y != null) {
            try {
                this.X.removeShutdownHook(this.Y);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }
}

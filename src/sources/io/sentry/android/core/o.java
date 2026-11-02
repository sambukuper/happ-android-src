package io.sentry.android.core;

import io.sentry.s5;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements io.sentry.util.f {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SentryAndroidOptions Y;

    public /* synthetic */ o(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.X = b;
        this.Y = sentryAndroidOptions;
    }

    @Override // io.sentry.util.f
    public Object e() {
        byte b = this.X;
        SentryAndroidOptions sentryAndroidOptions = this.Y;
        switch (b) {
            case 0:
                return sentryAndroidOptions.getExecutorService();
            case 1:
                return sentryAndroidOptions.getExecutorService();
            case 2:
                List list = io.sentry.android.core.cache.b.m0;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                boolean z = false;
                if (outboxPath != null) {
                    File file = new File(outboxPath, "startup_crash");
                    try {
                        boolean zExists = file.exists();
                        if (zExists && !file.delete()) {
                            sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                        }
                        z = zExists;
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().e(s5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
                    }
                    break;
                } else {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                }
                return Boolean.valueOf(z);
            default:
                return sentryAndroidOptions.getExecutorService();
        }
    }
}

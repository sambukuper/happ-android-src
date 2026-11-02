package io.sentry;

import defpackage.o76;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements Runnable {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ t2(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj;
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath != null) {
                    io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
                    if (envelopeDiskCache instanceof io.sentry.cache.c) {
                        Charset charset = io.sentry.cache.c.k0;
                        io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
                        cVar.c(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                        cVar.g0.countDown();
                    }
                } else {
                    sentryAndroidOptions.getLogger().h(s5.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                }
                break;
            case 1:
                ((o76) obj).invoke();
                break;
            case 2:
                ((o76) obj).invoke();
                break;
            case 3:
                ((o76) obj).invoke();
                break;
            case 4:
                ((o76) obj).invoke();
                break;
            case 5:
                ((io.sentry.android.replay.capture.b) obj).invoke();
                break;
            case 6:
                ((io.sentry.android.replay.capture.b) obj).invoke();
                break;
            default:
                ((io.sentry.android.replay.capture.b) obj).invoke();
                break;
        }
    }
}

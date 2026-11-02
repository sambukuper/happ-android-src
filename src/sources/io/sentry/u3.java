package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 implements Runnable {
    public static final Charset Y = Charset.forName("UTF-8");
    public final SentryAndroidOptions X;

    public u3(SentryAndroidOptions sentryAndroidOptions) {
        this.X = sentryAndroidOptions;
    }

    public final Date a(File file) {
        SentryAndroidOptions sentryAndroidOptions = this.X;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Y));
            try {
                String line = bufferedReader.readLine();
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateH = io.sentry.config.a.h(line);
                bufferedReader.close();
                return dateH;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            sentryAndroidOptions.getLogger().d(s5.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SentryAndroidOptions sentryAndroidOptions = this.X;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryAndroidOptions.getLogger().h(s5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).h()) {
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.k0;
        File file = new File(cacheDirPath, "previous_session.json");
        o1 serializer = sentryAndroidOptions.getSerializer();
        if (file.exists()) {
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Y));
                try {
                    d7 d7Var = (d7) serializer.b(bufferedReader, d7.class);
                    if (d7Var == null) {
                        sentryAndroidOptions.getLogger().h(s5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(sentryAndroidOptions.getCacheDirPath(), ".sentry-native/last_crash");
                        c7 c7Var = d7Var.i0;
                        c7 c7Var2 = c7.Crashed;
                        if (c7Var == c7Var2) {
                            z4 z4Var = z4.c;
                            io.sentry.util.a aVar = z4Var.b;
                            aVar.g();
                            try {
                                z4Var.a = false;
                                aVar.close();
                                z4Var.a();
                            } catch (Throwable th) {
                                try {
                                    aVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (file2.exists()) {
                            sentryAndroidOptions.getLogger().h(s5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file2);
                            d7Var.c(c7Var2, null, true, null);
                            d7Var.b(dateA);
                        } else if (d7Var.p0 == null) {
                            d7Var.b(new Date());
                        }
                        if (file2.exists() && !file2.delete()) {
                            sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        v4.b().g(new io.sentry.internal.debugmeta.c((io.sentry.protocol.w) null, sentryAndroidOptions.getSdkVersion(), h5.e(serializer, d7Var)), new n0());
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().e(s5.ERROR, "Error processing previous session.", th5);
            }
            if (file.delete()) {
                return;
            }
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}

package io.sentry.android.core.cache;

import android.os.SystemClock;
import defpackage.pc6;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a1;
import io.sentry.android.core.i2;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.z;
import io.sentry.c2;
import io.sentry.cache.c;
import io.sentry.n0;
import io.sentry.p7;
import io.sentry.s5;
import io.sentry.s6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public static final List m0 = Arrays.asList(new a(z.class, "ANR", "last_anr_report", new c2((byte) 23)), new a(i2.class, "Tombstone", "last_tombstone_report", new c2((byte) 24)), new a(a1.class, "MemoryLimiter", "last_memory_limiter_report", new c2((byte) 25)));
    public final d l0;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.util.b.s(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.l0 = d.X;
    }

    public static Long j(s6 s6Var, String str, String str2) {
        String cacheDirPath = s6Var.getCacheDirPath();
        io.sentry.util.b.s(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strR = io.sentry.util.b.r(file);
            if (strR != null && !strR.equals("null")) {
                return Long.valueOf(Long.parseLong(strR.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                s6Var.getLogger().h(s5.DEBUG, pc6.p("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            s6Var.getLogger().e(s5.ERROR, pc6.p("Error reading last ", str2, " marker"), th);
            return null;
        }
    }

    public static void l(s6 s6Var, Long l, String str, String str2) {
        String cacheDirPath = s6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            s6Var.getLogger().h(s5.DEBUG, pc6.p("Cache dir path is null, the ", str2, " marker will not be written"), new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l).getBytes(c.k0));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            s6Var.getLogger().e(s5.ERROR, pc6.p("Error writing the ", str2, " marker to the disk"), th3);
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean m(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        Long lValueOf;
        boolean zM = super.m(cVar, n0Var);
        s6 s6Var = this.X;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) s6Var;
        h hVar = g.c().g0;
        if (p7.class.isInstance(n0Var.b("sentry:typeCheckHint")) && hVar.c()) {
            this.l0.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - hVar.Z;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                s5 s5Var = s5.DEBUG;
                logger.h(s5Var, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = s6Var.getOutboxPath();
                if (outboxPath == null) {
                    s6Var.getLogger().h(s5Var, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    File file = new File(outboxPath);
                    if (io.sentry.util.b.e(file)) {
                        try {
                            new File(file, "startup_crash").createNewFile();
                        } catch (Throwable th) {
                            s6Var.getLogger().e(s5.ERROR, "Error writing the startup crash marker file to the disk", th);
                        }
                    } else {
                        s6Var.getLogger().h(s5.ERROR, "Failed to create outbox dir %s", outboxPath);
                    }
                }
            }
        }
        for (a aVar : m0) {
            Class cls = aVar.a;
            Object objB = n0Var.b("sentry:typeCheckHint");
            if (cls.isInstance(n0Var.b("sentry:typeCheckHint")) && objB != null) {
                switch (aVar.d.X) {
                    case 23:
                        lValueOf = Long.valueOf(((z) objB).f0);
                        break;
                    case 24:
                        lValueOf = Long.valueOf(((i2) objB).f0);
                        break;
                    default:
                        lValueOf = Long.valueOf(((a1) objB).f0);
                        break;
                }
                ILogger logger2 = sentryAndroidOptions.getLogger();
                s5 s5Var2 = s5.DEBUG;
                String str = aVar.b;
                logger2.h(s5Var2, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                l(sentryAndroidOptions, lValueOf, aVar.c, str);
            }
        }
        return zM;
    }
}

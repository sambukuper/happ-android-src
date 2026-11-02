package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 {
    public final /* synthetic */ byte a;
    public final io.sentry.android.core.o b;

    public /* synthetic */ s4(io.sentry.android.core.o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    public static boolean b(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.h(s5.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public final r4 a(i1 i1Var, s6 s6Var) {
        byte b = this.a;
        io.sentry.android.core.o oVar = this.b;
        switch (b) {
            case 0:
                io.sentry.util.b.s(i1Var, "Scopes are required");
                io.sentry.util.b.s(s6Var, "SentryOptions is required");
                String cacheDirPath = oVar.Y.getCacheDirPath();
                if (cacheDirPath == null || !b(cacheDirPath, s6Var.getLogger())) {
                    s6Var.getLogger().h(s5.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new r4(s6Var.getLogger(), cacheDirPath, new h0(i1Var, s6Var.getSerializer(), s6Var.getLogger(), s6Var.getFlushTimeoutMillis(), s6Var.getMaxQueueSize()), new File(cacheDirPath));
            default:
                io.sentry.util.b.s(i1Var, "Scopes are required");
                io.sentry.util.b.s(s6Var, "SentryOptions is required");
                String outboxPath = oVar.Y.getOutboxPath();
                if (outboxPath == null || !b(outboxPath, s6Var.getLogger())) {
                    s6Var.getLogger().h(s5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new r4(s6Var.getLogger(), outboxPath, new s3(i1Var, s6Var.getEnvelopeReader(), s6Var.getSerializer(), s6Var.getLogger(), s6Var.getFlushTimeoutMillis(), s6Var.getMaxQueueSize()), new File(outboxPath));
        }
    }
}

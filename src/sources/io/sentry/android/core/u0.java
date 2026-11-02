package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.oi0;
import io.sentry.ILogger;
import io.sentry.s3;
import io.sentry.s5;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends FileObserver {
    public final String a;
    public final s3 b;
    public final ILogger c;
    public final long d;

    public u0(String str, s3 s3Var, ILogger iLogger, long j) {
        super(str);
        this.a = str;
        this.b = s3Var;
        io.sentry.util.b.s(iLogger, "Logger is required.");
        this.c = iLogger;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        s5 s5Var = s5.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        ILogger iLogger = this.c;
        iLogger.h(s5Var, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        io.sentry.n0 n0VarF = io.sentry.util.b.f(new t0(this.d, iLogger));
        this.b.b(new File(oi0.p(new StringBuilder(str2), File.separator, str)), n0VarF);
    }
}

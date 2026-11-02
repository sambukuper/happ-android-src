package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum w5 implements n2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    w5(int i) {
        this.severityNumber = i;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.n2
    public void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        ((io.sentry.internal.debugmeta.c) r3Var).y(name().toLowerCase(Locale.ROOT));
    }
}

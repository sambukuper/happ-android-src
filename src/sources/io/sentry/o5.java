package io.sentry;

import j$.time.Instant;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 extends a5 {
    public final Instant X = Instant.now();

    @Override // io.sentry.a5
    public final long d() {
        Instant instant = this.X;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}

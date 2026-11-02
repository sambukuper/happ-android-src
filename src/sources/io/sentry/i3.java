package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements m1 {
    public static final i3 a = new i3();

    @Override // io.sentry.m1
    public final Future b(Runnable runnable, long j) {
        return new h();
    }

    @Override // io.sentry.m1
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.m1
    public final Future submit(Runnable runnable) {
        return new h();
    }

    @Override // io.sentry.m1
    public final void a(long j) {
    }
}

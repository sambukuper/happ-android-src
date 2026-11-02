package io.sentry.exception;

import io.sentry.protocol.o;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {
    public final o X;
    public final Throwable Y;
    public final Thread Z;
    public final boolean f0;

    public a(o oVar, Throwable th, Thread thread, boolean z) {
        this.X = oVar;
        io.sentry.util.b.s(th, "Throwable is required.");
        this.Y = th;
        this.Z = thread;
        this.f0 = z;
    }
}

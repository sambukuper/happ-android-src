package io.sentry.transport;

import defpackage.s91;
import io.sentry.n0;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    void close(boolean z);

    s91 d();

    default boolean e() {
        return true;
    }

    void f(long j);

    void v0(io.sentry.internal.debugmeta.c cVar, n0 n0Var);
}

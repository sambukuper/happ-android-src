package io.sentry;

import defpackage.s91;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface l1 {
    void a(d7 d7Var, n0 n0Var);

    io.sentry.protocol.w b(io.sentry.protocol.k kVar, n0 n0Var, g1 g1Var);

    io.sentry.protocol.w c(u6 u6Var, g1 g1Var, n0 n0Var);

    void close(boolean z);

    s91 d();

    default boolean e() {
        return true;
    }

    void f(long j);

    io.sentry.protocol.w g(io.sentry.internal.debugmeta.c cVar, n0 n0Var);

    io.sentry.protocol.w h(w3 w3Var);

    io.sentry.protocol.w i(io.sentry.protocol.f0 f0Var, l7 l7Var, g1 g1Var, n0 n0Var, z3 z3Var);

    boolean isEnabled();

    io.sentry.protocol.w j(j5 j5Var, g1 g1Var, n0 n0Var);
}

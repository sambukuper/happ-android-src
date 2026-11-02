package io.sentry;

import defpackage.i61;
import defpackage.s91;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface i1 {
    void a(g gVar, n0 n0Var);

    b1 clone();

    void close(boolean z);

    s91 d();

    boolean e();

    void f(long j);

    io.sentry.protocol.w g(io.sentry.internal.debugmeta.c cVar, n0 n0Var);

    io.sentry.protocol.w h(w3 w3Var);

    s6 i();

    boolean isEnabled();

    s1 j();

    void k();

    void l();

    s1 m(n7 n7Var, o7 o7Var);

    i1 n();

    void o(l4 l4Var);

    io.sentry.protocol.w p(i61 i61Var, n0 n0Var);

    default boolean q() {
        return false;
    }

    io.sentry.protocol.w r(u6 u6Var, n0 n0Var);

    g1 s();

    g1 t();

    a1 u();

    io.sentry.protocol.w v(String str, s5 s5Var);

    io.sentry.protocol.w w(io.sentry.protocol.f0 f0Var, l7 l7Var, n0 n0Var, z3 z3Var);

    i1 x(String str);

    boolean y(i1 i1Var);

    io.sentry.protocol.w z(j5 j5Var, n0 n0Var);
}

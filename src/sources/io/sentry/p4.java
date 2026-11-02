package io.sentry;

import defpackage.i61;
import defpackage.s91;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p4 implements i1 {
    public static final p4 a = new p4();

    @Override // io.sentry.i1
    public final void a(g gVar, n0 n0Var) {
        v4.b().a(gVar, n0Var);
    }

    @Override // io.sentry.i1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final b1 m17clone() {
        return v4.b().m16clone();
    }

    @Override // io.sentry.i1
    public final void close(boolean z) {
        v4.a();
    }

    @Override // io.sentry.i1
    public final s91 d() {
        return v4.b().d();
    }

    @Override // io.sentry.i1
    public final boolean e() {
        return v4.b().e();
    }

    @Override // io.sentry.i1
    public final void f(long j) {
        v4.b().f(j);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w g(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        return v4.b().g(cVar, n0Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w h(w3 w3Var) {
        return v4.b().h(w3Var);
    }

    @Override // io.sentry.i1
    public final s6 i() {
        return v4.b().i();
    }

    @Override // io.sentry.i1
    public final boolean isEnabled() {
        return v4.b().isEnabled();
    }

    @Override // io.sentry.i1
    public final s1 j() {
        return v4.b().j();
    }

    @Override // io.sentry.i1
    public final void k() {
        v4.b().k();
    }

    @Override // io.sentry.i1
    public final void l() {
        v4.b().l();
    }

    @Override // io.sentry.i1
    public final s1 m(n7 n7Var, o7 o7Var) {
        return v4.b().m(n7Var, o7Var);
    }

    @Override // io.sentry.i1
    public final i1 n() {
        return v4.b().n();
    }

    @Override // io.sentry.i1
    public final void o(l4 l4Var) {
        v4.b().o(l4Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w p(i61 i61Var, n0 n0Var) {
        return v4.b().p(i61Var, n0Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w r(u6 u6Var, n0 n0Var) {
        return v4.b().r(u6Var, n0Var);
    }

    @Override // io.sentry.i1
    public final g1 s() {
        return v4.c;
    }

    @Override // io.sentry.i1
    public final g1 t() {
        return v4.b().t();
    }

    @Override // io.sentry.i1
    public final a1 u() {
        return v4.b().u();
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w v(String str, s5 s5Var) {
        return v4.b().v(str, s5Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w w(io.sentry.protocol.f0 f0Var, l7 l7Var, n0 n0Var, z3 z3Var) {
        return v4.b().w(f0Var, l7Var, n0Var, z3Var);
    }

    @Override // io.sentry.i1
    public final i1 x(String str) {
        return v4.b().x("getCurrentScopes");
    }

    @Override // io.sentry.i1
    public final boolean y(i1 i1Var) {
        return v4.b().y(i1Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w z(j5 j5Var, n0 n0Var) {
        return v4.b().z(j5Var, n0Var);
    }
}

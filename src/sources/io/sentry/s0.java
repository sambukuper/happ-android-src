package io.sentry;

import defpackage.i61;
import defpackage.s91;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements b1 {
    public final o4 a;

    public s0(o4 o4Var) {
        this.a = o4Var;
    }

    @Override // io.sentry.i1
    public final void a(g gVar, n0 n0Var) {
        this.a.a(gVar, n0Var);
    }

    @Override // io.sentry.i1
    /* JADX INFO: renamed from: clone */
    public final b1 m17clone() {
        return this.a.m17clone();
    }

    @Override // io.sentry.i1
    public final void close(boolean z) {
        this.a.close(z);
    }

    @Override // io.sentry.i1
    public final s91 d() {
        return this.a.d();
    }

    @Override // io.sentry.i1
    public final boolean e() {
        return this.a.e();
    }

    @Override // io.sentry.i1
    public final void f(long j) {
        this.a.f(j);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w g(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        return this.a.g(cVar, n0Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w h(w3 w3Var) {
        return this.a.h(w3Var);
    }

    @Override // io.sentry.i1
    public final s6 i() {
        return this.a.i();
    }

    @Override // io.sentry.i1
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // io.sentry.i1
    public final s1 j() {
        return this.a.j();
    }

    @Override // io.sentry.i1
    public final void k() {
        this.a.k();
    }

    @Override // io.sentry.i1
    public final void l() {
        this.a.l();
    }

    @Override // io.sentry.i1
    public final s1 m(n7 n7Var, o7 o7Var) {
        return this.a.m(n7Var, o7Var);
    }

    @Override // io.sentry.i1
    public final i1 n() {
        return this.a.d;
    }

    @Override // io.sentry.i1
    public final void o(l4 l4Var) {
        this.a.o(l4Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w p(i61 i61Var, n0 n0Var) {
        return this.a.p(i61Var, n0Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w r(u6 u6Var, n0 n0Var) {
        return this.a.r(u6Var, n0Var);
    }

    @Override // io.sentry.i1
    public final g1 s() {
        return v4.c;
    }

    @Override // io.sentry.i1
    public final g1 t() {
        return this.a.a;
    }

    @Override // io.sentry.i1
    public final a1 u() {
        return this.a.g;
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w v(String str, s5 s5Var) {
        return this.a.v(str, s5Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w w(io.sentry.protocol.f0 f0Var, l7 l7Var, n0 n0Var, z3 z3Var) {
        return this.a.w(f0Var, l7Var, n0Var, z3Var);
    }

    @Override // io.sentry.i1
    public final i1 x(String str) {
        return this.a.x("getCurrentScopes");
    }

    @Override // io.sentry.i1
    public final boolean y(i1 i1Var) {
        return this.a.y(i1Var);
    }

    @Override // io.sentry.i1
    public final io.sentry.protocol.w z(j5 j5Var, n0 n0Var) {
        return this.a.z(j5Var, n0Var);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m18clone() {
        return this.a.m17clone();
    }
}

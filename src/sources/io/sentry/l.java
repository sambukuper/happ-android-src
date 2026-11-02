package io.sentry;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends io.sentry.protocol.e {
    public final io.sentry.protocol.e Z;
    public final io.sentry.protocol.e f0;
    public final io.sentry.protocol.e g0;
    public final n4 h0;

    public l(io.sentry.protocol.e eVar, io.sentry.protocol.e eVar2, io.sentry.protocol.e eVar3, n4 n4Var) {
        this.Z = eVar;
        this.f0 = eVar2;
        this.g0 = eVar3;
        this.h0 = n4Var;
    }

    public final io.sentry.protocol.e A() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.m(this.Z);
        eVar.m(this.f0);
        eVar.m(this.g0);
        return eVar;
    }

    @Override // io.sentry.protocol.e
    public final void a() {
        z().a();
    }

    @Override // io.sentry.protocol.e
    public final boolean b(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Set c() {
        return A().X.entrySet();
    }

    @Override // io.sentry.protocol.e
    public final Object d(Object obj) {
        Object objD = this.g0.d(obj);
        if (objD != null) {
            return objD;
        }
        Object objD2 = this.f0.d(obj);
        return objD2 != null ? objD2 : this.Z.d(obj);
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.a e() {
        io.sentry.protocol.a aVarE = this.g0.e();
        if (aVarE != null) {
            return aVarE;
        }
        io.sentry.protocol.a aVarE2 = this.f0.e();
        return aVarE2 != null ? aVarE2 : this.Z.e();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.h f() {
        io.sentry.protocol.h hVarF = this.g0.f();
        if (hVarF != null) {
            return hVarF;
        }
        io.sentry.protocol.h hVarF2 = this.f0.f();
        return hVarF2 != null ? hVarF2 : this.Z.f();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.j g() {
        io.sentry.protocol.j jVarG = this.g0.g();
        if (jVarG != null) {
            return jVarG;
        }
        io.sentry.protocol.j jVarG2 = this.f0.g();
        return jVarG2 != null ? jVarG2 : this.Z.g();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.q h() {
        io.sentry.protocol.q qVarH = this.g0.h();
        if (qVarH != null) {
            return qVarH;
        }
        io.sentry.protocol.q qVarH2 = this.f0.h();
        return qVarH2 != null ? qVarH2 : this.Z.h();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.y i() {
        io.sentry.protocol.y yVarI = this.g0.i();
        if (yVarI != null) {
            return yVarI;
        }
        io.sentry.protocol.y yVarI2 = this.f0.i();
        return yVarI2 != null ? yVarI2 : this.Z.i();
    }

    @Override // io.sentry.protocol.e
    public final f7 j() {
        f7 f7VarJ = this.g0.j();
        if (f7VarJ != null) {
            return f7VarJ;
        }
        f7 f7VarJ2 = this.f0.j();
        return f7VarJ2 != null ? f7VarJ2 : this.Z.j();
    }

    @Override // io.sentry.protocol.e
    public final Enumeration k() {
        return A().X.keys();
    }

    @Override // io.sentry.protocol.e
    public final Object l(Object obj, String str) {
        return z().l(obj, str);
    }

    @Override // io.sentry.protocol.e
    public final void m(io.sentry.protocol.e eVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Object n(String str) {
        return z().n("profile");
    }

    @Override // io.sentry.protocol.e
    public final void o(io.sentry.protocol.a aVar) {
        z().o(aVar);
    }

    @Override // io.sentry.protocol.e
    public final void p(io.sentry.protocol.d dVar) {
        z().p(dVar);
    }

    @Override // io.sentry.protocol.e
    public final void q(io.sentry.protocol.h hVar) {
        z().q(hVar);
    }

    @Override // io.sentry.protocol.e
    public final void r(io.sentry.protocol.j jVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void s(io.sentry.protocol.m mVar) {
        z().s(mVar);
    }

    @Override // io.sentry.protocol.e, io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        A().serialize(r3Var, iLogger);
    }

    @Override // io.sentry.protocol.e
    public final void t(io.sentry.protocol.q qVar) {
        z().t(qVar);
    }

    @Override // io.sentry.protocol.e
    public final void u(io.sentry.protocol.s sVar) {
        z().u(sVar);
    }

    @Override // io.sentry.protocol.e
    public final void v(io.sentry.protocol.y yVar) {
        z().v(yVar);
    }

    @Override // io.sentry.protocol.e
    public final void w(io.sentry.protocol.g0 g0Var) {
        z().w(g0Var);
    }

    @Override // io.sentry.protocol.e
    public final void x(f7 f7Var) {
        z().x(f7Var);
    }

    public final io.sentry.protocol.e z() {
        int i = k.a[this.h0.ordinal()];
        io.sentry.protocol.e eVar = this.g0;
        if (i == 1) {
            return eVar;
        }
        if (i != 2) {
            return i != 3 ? eVar : this.Z;
        }
        return this.f0;
    }
}

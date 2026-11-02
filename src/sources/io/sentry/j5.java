package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends y4 implements n2 {
    public AbstractMap A0;
    public Date r0;
    public io.sentry.protocol.p s0;
    public String t0;
    public k2 u0;
    public k2 v0;
    public s5 w0;
    public String x0;
    public List y0;
    public ConcurrentHashMap z0;

    public j5() {
        io.sentry.protocol.w wVar = new io.sentry.protocol.w();
        Date date = new Date();
        super(wVar);
        this.r0 = date;
    }

    public final ArrayList d() {
        k2 k2Var = this.v0;
        if (k2Var == null) {
            return null;
        }
        return k2Var.a;
    }

    public final ArrayList e() {
        k2 k2Var = this.u0;
        if (k2Var != null) {
            return k2Var.a;
        }
        return null;
    }

    public final io.sentry.protocol.v f() {
        Boolean bool;
        k2 k2Var = this.v0;
        if (k2Var == null) {
            return null;
        }
        for (io.sentry.protocol.v vVar : k2Var.a) {
            io.sentry.protocol.o oVar = vVar.h0;
            if (oVar != null && (bool = oVar.f0) != null && !bool.booleanValue()) {
                return vVar;
            }
        }
        return null;
    }

    public final boolean g() {
        k2 k2Var = this.v0;
        return (k2Var == null || k2Var.a.isEmpty()) ? false : true;
    }

    public final void h(List list) {
        this.v0 = new k2(list);
    }

    public final void i(List list) {
        this.y0 = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("timestamp");
        cVar.v(iLogger, this.r0);
        if (this.s0 != null) {
            cVar.p("message");
            cVar.v(iLogger, this.s0);
        }
        if (this.t0 != null) {
            cVar.p("logger");
            cVar.y(this.t0);
        }
        k2 k2Var = this.u0;
        if (k2Var != null && !k2Var.a.isEmpty()) {
            cVar.p("threads");
            cVar.k();
            cVar.p("values");
            cVar.v(iLogger, this.u0.a);
            cVar.m();
        }
        k2 k2Var2 = this.v0;
        if (k2Var2 != null && !k2Var2.a.isEmpty()) {
            cVar.p("exception");
            cVar.k();
            cVar.p("values");
            cVar.v(iLogger, this.v0.a);
            cVar.m();
        }
        if (this.w0 != null) {
            cVar.p("level");
            cVar.v(iLogger, this.w0);
        }
        if (this.x0 != null) {
            cVar.p("transaction");
            cVar.y(this.x0);
        }
        if (this.y0 != null) {
            cVar.p("fingerprint");
            cVar.v(iLogger, this.y0);
        }
        if (this.A0 != null) {
            cVar.p("modules");
            cVar.v(iLogger, this.A0);
        }
        io.sentry.config.a.s(this, cVar, iLogger);
        ConcurrentHashMap concurrentHashMap = this.z0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.z0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }

    public j5(Exception exc) {
        this();
        this.l0 = exc;
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements n2 {
    public String X;
    public String Y;
    public String Z;
    public Object f0;
    public String g0;
    public ConcurrentHashMap h0;
    public ConcurrentHashMap i0;
    public Long j0;
    public ConcurrentHashMap k0;
    public String l0;
    public String m0;
    public ConcurrentHashMap n0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return io.sentry.util.b.i(this.X, rVar.X) && io.sentry.util.b.i(this.Y, rVar.Y) && io.sentry.util.b.i(this.Z, rVar.Z) && io.sentry.util.b.i(this.g0, rVar.g0) && io.sentry.util.b.i(this.h0, rVar.h0) && io.sentry.util.b.i(this.i0, rVar.i0) && io.sentry.util.b.i(this.j0, rVar.j0) && io.sentry.util.b.i(this.l0, rVar.l0) && io.sentry.util.b.i(this.m0, rVar.m0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.g0, this.h0, this.i0, this.j0, this.l0, this.m0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("url");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("method");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("query_string");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("data");
            cVar.v(iLogger, this.f0);
        }
        if (this.g0 != null) {
            cVar.p("cookies");
            cVar.y(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("headers");
            cVar.v(iLogger, this.h0);
        }
        if (this.i0 != null) {
            cVar.p("env");
            cVar.v(iLogger, this.i0);
        }
        if (this.k0 != null) {
            cVar.p("other");
            cVar.v(iLogger, this.k0);
        }
        if (this.l0 != null) {
            cVar.p(MetaParams.FRAGMENT);
            cVar.v(iLogger, this.l0);
        }
        if (this.j0 != null) {
            cVar.p("body_size");
            cVar.v(iLogger, this.j0);
        }
        if (this.m0 != null) {
            cVar.p("api_target");
            cVar.v(iLogger, this.m0);
        }
        ConcurrentHashMap concurrentHashMap = this.n0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.n0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.e7;
import io.sentry.f7;
import io.sentry.h7;
import io.sentry.j7;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements n2 {
    public final Double X;
    public final Double Y;
    public final w Z;
    public final h7 f0;
    public final h7 g0;
    public final String h0;
    public final String i0;
    public final j7 j0;
    public final String k0;
    public final Map l0;
    public Map m0;
    public final Map n0;
    public ConcurrentHashMap o0;

    public z(e7 e7Var) {
        ConcurrentHashMap concurrentHashMap = e7Var.j;
        f7 f7Var = e7Var.c;
        this.i0 = f7Var.h0;
        this.h0 = f7Var.g0;
        this.f0 = f7Var.Y;
        this.g0 = f7Var.Z;
        this.Z = f7Var.X;
        this.j0 = f7Var.i0;
        this.k0 = f7Var.k0;
        ConcurrentHashMap concurrentHashMapP = io.sentry.util.b.p(f7Var.j0);
        this.l0 = concurrentHashMapP == null ? new ConcurrentHashMap() : concurrentHashMapP;
        ConcurrentHashMap concurrentHashMapP2 = io.sentry.util.b.p(e7Var.k);
        this.n0 = concurrentHashMapP2 == null ? new ConcurrentHashMap() : concurrentHashMapP2;
        a5 a5Var = e7Var.b;
        this.Y = a5Var == null ? null : Double.valueOf(e7Var.a.c(a5Var) / 1.0E9d);
        this.X = Double.valueOf(e7Var.a.d() / 1.0E9d);
        this.m0 = concurrentHashMap;
        f7Var.p0.b();
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("start_timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.X.doubleValue()));
        Double d = this.Y;
        if (d != null) {
            cVar.p("timestamp");
            cVar.v(iLogger, io.sentry.config.a.c(d.doubleValue()));
        }
        cVar.p("trace_id");
        cVar.v(iLogger, this.Z);
        cVar.p("span_id");
        cVar.v(iLogger, this.f0);
        h7 h7Var = this.g0;
        if (h7Var != null) {
            cVar.p("parent_span_id");
            cVar.v(iLogger, h7Var);
        }
        cVar.p("op");
        cVar.y(this.h0);
        String str = this.i0;
        if (str != null) {
            cVar.p("description");
            cVar.y(str);
        }
        j7 j7Var = this.j0;
        if (j7Var != null) {
            cVar.p("status");
            cVar.v(iLogger, j7Var);
        }
        String str2 = this.k0;
        if (str2 != null) {
            cVar.p("origin");
            cVar.v(iLogger, str2);
        }
        Map map = this.l0;
        if (!map.isEmpty()) {
            cVar.p("tags");
            cVar.v(iLogger, map);
        }
        if (this.m0 != null) {
            cVar.p("data");
            cVar.v(iLogger, this.m0);
        }
        Map map2 = this.n0;
        if (!map2.isEmpty()) {
            cVar.p("measurements");
            cVar.v(iLogger, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.o0;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.o0, str3, cVar, str3, iLogger);
            }
        }
        cVar.m();
    }

    public z(Double d, Double d2, w wVar, h7 h7Var, h7 h7Var2, String str, String str2, j7 j7Var, String str3, Map map, Map map2, Map map3) {
        this.X = d;
        this.Y = d2;
        this.Z = wVar;
        this.f0 = h7Var;
        this.g0 = h7Var2;
        this.h0 = str;
        this.i0 = str2;
        this.j0 = j7Var;
        this.k0 = str3;
        this.l0 = map;
        this.n0 = map2;
        this.m0 = map3;
    }
}

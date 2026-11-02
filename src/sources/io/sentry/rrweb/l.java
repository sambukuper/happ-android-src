package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b implements n2 {
    public String Z;
    public String f0;
    public String g0;
    public double h0;
    public double i0;
    public ConcurrentHashMap j0;
    public HashMap k0;
    public ConcurrentHashMap l0;
    public ConcurrentHashMap m0;

    public l() {
        super(c.Custom);
        this.Z = "performanceSpan";
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("type");
        cVar.v(iLogger, this.X);
        cVar.p("timestamp");
        cVar.u(this.Y);
        cVar.p("data");
        cVar.k();
        cVar.p("tag");
        cVar.y(this.Z);
        cVar.p("payload");
        cVar.k();
        if (this.f0 != null) {
            cVar.p("op");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("description");
            cVar.y(this.g0);
        }
        cVar.p("startTimestamp");
        cVar.v(iLogger, BigDecimal.valueOf(this.h0));
        cVar.p("endTimestamp");
        cVar.v(iLogger, BigDecimal.valueOf(this.i0));
        if (this.j0 != null) {
            cVar.p("data");
            cVar.v(iLogger, this.j0);
        }
        ConcurrentHashMap concurrentHashMap = this.l0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.l0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.m0;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.m0, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
        HashMap map = this.k0;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.k0, str3, cVar, str3, iLogger);
            }
        }
        cVar.m();
    }
}

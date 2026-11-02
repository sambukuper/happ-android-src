package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 implements n2 {
    public String X;
    public String Y;
    public String Z;
    public Long f0;
    public Long g0;
    public Long h0;
    public Long i0;
    public ConcurrentHashMap j0;

    public a4(s1 s1Var, Long l, Long l2) {
        this.X = s1Var.p().a();
        this.Y = s1Var.s().X.a();
        this.Z = s1Var.getName().isEmpty() ? "unknown" : s1Var.getName();
        this.f0 = l;
        this.h0 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a4.class != obj.getClass()) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.X.equals(a4Var.X) && this.Y.equals(a4Var.Y) && this.Z.equals(a4Var.Z) && this.f0.equals(a4Var.f0) && this.h0.equals(a4Var.h0) && io.sentry.util.b.i(this.i0, a4Var.i0) && io.sentry.util.b.i(this.g0, a4Var.g0) && io.sentry.util.b.i(this.j0, a4Var.j0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("id");
        cVar.v(iLogger, this.X);
        cVar.p("trace_id");
        cVar.v(iLogger, this.Y);
        cVar.p("name");
        cVar.v(iLogger, this.Z);
        cVar.p("relative_start_ns");
        cVar.v(iLogger, this.f0);
        cVar.p("relative_end_ns");
        cVar.v(iLogger, this.g0);
        cVar.p("relative_cpu_start_ms");
        cVar.v(iLogger, this.h0);
        cVar.p("relative_cpu_end_ms");
        cVar.v(iLogger, this.i0);
        ConcurrentHashMap concurrentHashMap = this.j0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.j0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

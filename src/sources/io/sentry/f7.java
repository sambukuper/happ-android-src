package io.sentry;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class f7 implements n2 {
    public final io.sentry.protocol.w X;
    public final h7 Y;
    public final h7 Z;
    public transient b4 f0;
    public String g0;
    public String h0;
    public j7 i0;
    public ConcurrentHashMap j0;
    public String k0;
    public Map l0;
    public ConcurrentHashMap m0;
    public x1 n0;
    public c o0;
    public final d p0;
    public final io.sentry.protocol.w q0;

    public f7(io.sentry.protocol.w wVar, h7 h7Var, h7 h7Var2, String str, String str2, b4 b4Var, j7 j7Var, String str3) {
        this.j0 = new ConcurrentHashMap();
        this.k0 = "manual";
        this.l0 = new ConcurrentHashMap();
        this.n0 = x1.SENTRY;
        this.p0 = new d((byte) 10);
        this.q0 = io.sentry.protocol.w.Y;
        io.sentry.util.b.s(wVar, "traceId is required");
        this.X = wVar;
        io.sentry.util.b.s(h7Var, "spanId is required");
        this.Y = h7Var;
        io.sentry.util.b.s(str, "operation is required");
        this.g0 = str;
        this.Z = h7Var2;
        this.h0 = str2;
        this.i0 = j7Var;
        this.k0 = str3;
        a(b4Var);
        io.sentry.util.thread.a threadChecker = v4.b().i().getThreadChecker();
        this.l0.put("thread.id", String.valueOf(threadChecker.b()));
        this.l0.put("thread.name", threadChecker.a());
    }

    public final void a(b4 b4Var) {
        this.f0 = b4Var;
        c cVar = this.o0;
        if (cVar == null || b4Var == null) {
            return;
        }
        Boolean bool = (Boolean) b4Var.a;
        Charset charset = io.sentry.util.q.a;
        cVar.d("sentry-sampled", bool == null ? null : bool.toString());
        Double d = (Double) b4Var.c;
        if (d != null && cVar.f) {
            cVar.d = d;
        }
        Double d2 = (Double) b4Var.b;
        if (d2 != null) {
            cVar.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return this.X.equals(f7Var.X) && this.Y.equals(f7Var.Y) && io.sentry.util.b.i(this.Z, f7Var.Z) && this.g0.equals(f7Var.g0) && io.sentry.util.b.i(this.h0, f7Var.h0) && this.i0 == f7Var.i0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.g0, this.h0, this.i0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("trace_id");
        this.X.serialize(cVar, iLogger);
        cVar.p("span_id");
        this.Y.serialize(cVar, iLogger);
        h7 h7Var = this.Z;
        if (h7Var != null) {
            cVar.p("parent_span_id");
            h7Var.serialize(cVar, iLogger);
        }
        cVar.p("op");
        cVar.y(this.g0);
        if (this.h0 != null) {
            cVar.p("description");
            cVar.y(this.h0);
        }
        if (this.i0 != null) {
            cVar.p("status");
            cVar.v(iLogger, this.i0);
        }
        if (this.k0 != null) {
            cVar.p("origin");
            cVar.v(iLogger, this.k0);
        }
        if (!this.j0.isEmpty()) {
            cVar.p("tags");
            cVar.v(iLogger, this.j0);
        }
        if (!this.l0.isEmpty()) {
            cVar.p("data");
            cVar.v(iLogger, this.l0);
        }
        ConcurrentHashMap concurrentHashMap = this.m0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.m0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }

    public f7(io.sentry.protocol.w wVar, h7 h7Var, String str, h7 h7Var2) {
        this(wVar, h7Var, h7Var2, str, null, null, null, "manual");
    }

    public f7(f7 f7Var) {
        this.j0 = new ConcurrentHashMap();
        this.k0 = "manual";
        this.l0 = new ConcurrentHashMap();
        this.n0 = x1.SENTRY;
        this.p0 = new d((byte) 10);
        this.q0 = io.sentry.protocol.w.Y;
        this.X = f7Var.X;
        this.Y = f7Var.Y;
        this.Z = f7Var.Z;
        a(f7Var.f0);
        this.g0 = f7Var.g0;
        this.h0 = f7Var.h0;
        this.i0 = f7Var.i0;
        ConcurrentHashMap concurrentHashMapP = io.sentry.util.b.p(f7Var.j0);
        if (concurrentHashMapP != null) {
            this.j0 = concurrentHashMapP;
        }
        ConcurrentHashMap concurrentHashMapP2 = io.sentry.util.b.p(f7Var.m0);
        if (concurrentHashMapP2 != null) {
            this.m0 = concurrentHashMapP2;
        }
        this.o0 = f7Var.o0;
        ConcurrentHashMap concurrentHashMapP3 = io.sentry.util.b.p(f7Var.l0);
        if (concurrentHashMapP3 != null) {
            this.l0 = concurrentHashMapP3;
        }
    }
}

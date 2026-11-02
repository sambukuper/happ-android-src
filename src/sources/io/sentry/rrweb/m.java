package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b implements n2 {
    public String Z;
    public int f0;
    public long g0;
    public long h0;
    public String i0;
    public String j0;
    public int k0;
    public int l0;
    public int m0;
    public String n0;
    public int o0;
    public int p0;
    public int q0;
    public HashMap r0;
    public ConcurrentHashMap s0;
    public ConcurrentHashMap t0;

    public m() {
        super(c.Custom);
        this.i0 = "h264";
        this.j0 = "mp4";
        this.n0 = "constant";
        this.Z = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f0 == mVar.f0 && this.g0 == mVar.g0 && this.h0 == mVar.h0 && this.k0 == mVar.k0 && this.l0 == mVar.l0 && this.m0 == mVar.m0 && this.o0 == mVar.o0 && this.p0 == mVar.p0 && this.q0 == mVar.q0 && io.sentry.util.b.i(this.Z, mVar.Z) && io.sentry.util.b.i(this.i0, mVar.i0) && io.sentry.util.b.i(this.j0, mVar.j0) && io.sentry.util.b.i(this.n0, mVar.n0);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.Z, Integer.valueOf(this.f0), Long.valueOf(this.g0), Long.valueOf(this.h0), this.i0, this.j0, Integer.valueOf(this.k0), Integer.valueOf(this.l0), Integer.valueOf(this.m0), this.n0, Integer.valueOf(this.o0), Integer.valueOf(this.p0), Integer.valueOf(this.q0)});
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
        cVar.p("segmentId");
        cVar.u(this.f0);
        cVar.p("size");
        cVar.u(this.g0);
        cVar.p("duration");
        cVar.u(this.h0);
        cVar.p("encoding");
        cVar.y(this.i0);
        cVar.p("container");
        cVar.y(this.j0);
        cVar.p("height");
        cVar.u(this.k0);
        cVar.p("width");
        cVar.u(this.l0);
        cVar.p("frameCount");
        cVar.u(this.m0);
        cVar.p("frameRate");
        cVar.u(this.o0);
        cVar.p("frameRateType");
        cVar.y(this.n0);
        cVar.p("left");
        cVar.u(this.p0);
        cVar.p("top");
        cVar.u(this.q0);
        ConcurrentHashMap concurrentHashMap = this.s0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.s0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.t0;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.t0, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
        HashMap map = this.r0;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.r0, str3, cVar, str3, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n2 {
    public Date A0;
    public TimeZone B0;
    public String C0;
    public String D0;
    public String E0;
    public Float F0;
    public Integer G0;
    public Double H0;
    public String I0;
    public String J0;
    public ConcurrentHashMap K0;
    public String X;
    public String Y;
    public String Z;
    public String f0;
    public String g0;
    public String h0;
    public String[] i0;
    public Float j0;
    public Boolean k0;
    public Boolean l0;
    public g m0;
    public Boolean n0;
    public Long o0;
    public Long p0;
    public Long q0;
    public Boolean r0;
    public Long s0;
    public Long t0;
    public Long u0;
    public Long v0;
    public Integer w0;
    public Integer x0;
    public Float y0;
    public Integer z0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.util.b.i(this.X, hVar.X) && io.sentry.util.b.i(this.Y, hVar.Y) && io.sentry.util.b.i(this.Z, hVar.Z) && io.sentry.util.b.i(this.f0, hVar.f0) && io.sentry.util.b.i(this.g0, hVar.g0) && io.sentry.util.b.i(this.h0, hVar.h0) && Arrays.equals(this.i0, hVar.i0) && io.sentry.util.b.i(this.j0, hVar.j0) && io.sentry.util.b.i(this.k0, hVar.k0) && io.sentry.util.b.i(this.l0, hVar.l0) && this.m0 == hVar.m0 && io.sentry.util.b.i(this.n0, hVar.n0) && io.sentry.util.b.i(this.o0, hVar.o0) && io.sentry.util.b.i(this.p0, hVar.p0) && io.sentry.util.b.i(this.q0, hVar.q0) && io.sentry.util.b.i(this.r0, hVar.r0) && io.sentry.util.b.i(this.s0, hVar.s0) && io.sentry.util.b.i(this.t0, hVar.t0) && io.sentry.util.b.i(this.u0, hVar.u0) && io.sentry.util.b.i(this.v0, hVar.v0) && io.sentry.util.b.i(this.w0, hVar.w0) && io.sentry.util.b.i(this.x0, hVar.x0) && io.sentry.util.b.i(this.y0, hVar.y0) && io.sentry.util.b.i(this.z0, hVar.z0) && io.sentry.util.b.i(this.A0, hVar.A0) && io.sentry.util.b.i(this.C0, hVar.C0) && io.sentry.util.b.i(this.D0, hVar.D0) && io.sentry.util.b.i(this.E0, hVar.E0) && io.sentry.util.b.i(this.F0, hVar.F0) && io.sentry.util.b.i(this.G0, hVar.G0) && io.sentry.util.b.i(this.H0, hVar.H0) && io.sentry.util.b.i(this.I0, hVar.I0) && io.sentry.util.b.i(this.J0, hVar.J0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0}) * 31) + Arrays.hashCode(this.i0);
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("name");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("manufacturer");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("brand");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("family");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("model");
            cVar.y(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("model_id");
            cVar.y(this.h0);
        }
        if (this.i0 != null) {
            cVar.p("archs");
            cVar.v(iLogger, this.i0);
        }
        if (this.j0 != null) {
            cVar.p("battery_level");
            cVar.x(this.j0);
        }
        if (this.k0 != null) {
            cVar.p("charging");
            cVar.w(this.k0);
        }
        if (this.l0 != null) {
            cVar.p("online");
            cVar.w(this.l0);
        }
        if (this.m0 != null) {
            cVar.p("orientation");
            cVar.v(iLogger, this.m0);
        }
        if (this.n0 != null) {
            cVar.p("simulator");
            cVar.w(this.n0);
        }
        if (this.o0 != null) {
            cVar.p("memory_size");
            cVar.x(this.o0);
        }
        if (this.p0 != null) {
            cVar.p("free_memory");
            cVar.x(this.p0);
        }
        if (this.q0 != null) {
            cVar.p("usable_memory");
            cVar.x(this.q0);
        }
        if (this.r0 != null) {
            cVar.p("low_memory");
            cVar.w(this.r0);
        }
        if (this.s0 != null) {
            cVar.p("storage_size");
            cVar.x(this.s0);
        }
        if (this.t0 != null) {
            cVar.p("free_storage");
            cVar.x(this.t0);
        }
        if (this.u0 != null) {
            cVar.p("external_storage_size");
            cVar.x(this.u0);
        }
        if (this.v0 != null) {
            cVar.p("external_free_storage");
            cVar.x(this.v0);
        }
        if (this.w0 != null) {
            cVar.p("screen_width_pixels");
            cVar.x(this.w0);
        }
        if (this.x0 != null) {
            cVar.p("screen_height_pixels");
            cVar.x(this.x0);
        }
        if (this.y0 != null) {
            cVar.p("screen_density");
            cVar.x(this.y0);
        }
        if (this.z0 != null) {
            cVar.p("screen_dpi");
            cVar.x(this.z0);
        }
        if (this.A0 != null) {
            cVar.p("boot_time");
            cVar.v(iLogger, this.A0);
        }
        if (this.B0 != null) {
            cVar.p("timezone");
            cVar.v(iLogger, this.B0);
        }
        if (this.C0 != null) {
            cVar.p("id");
            cVar.y(this.C0);
        }
        if (this.E0 != null) {
            cVar.p("connection_type");
            cVar.y(this.E0);
        }
        if (this.F0 != null) {
            cVar.p("battery_temperature");
            cVar.x(this.F0);
        }
        if (this.D0 != null) {
            cVar.p("locale");
            cVar.y(this.D0);
        }
        if (this.G0 != null) {
            cVar.p("processor_count");
            cVar.x(this.G0);
        }
        if (this.H0 != null) {
            cVar.p("processor_frequency");
            cVar.x(this.H0);
        }
        if (this.I0 != null) {
            cVar.p("cpu_description");
            cVar.y(this.I0);
        }
        if (this.J0 != null) {
            cVar.p("chipset");
            cVar.y(this.J0);
        }
        ConcurrentHashMap concurrentHashMap = this.K0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.K0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

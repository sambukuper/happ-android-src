package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 implements n2 {
    public io.sentry.protocol.w Y;
    public io.sentry.protocol.w Z;
    public io.sentry.protocol.u f0;
    public final AbstractMap g0;
    public String h0;
    public String i0;
    public String j0;
    public String k0;
    public double l0;
    public String m0;
    public final File n0;
    public io.sentry.protocol.profiling.a p0;
    public ConcurrentHashMap q0;
    public String o0 = null;
    public io.sentry.protocol.f X = null;

    public w3(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, File file, AbstractMap abstractMap, Double d, s6 s6Var) {
        this.Y = wVar;
        this.Z = wVar2;
        this.n0 = file;
        this.g0 = abstractMap;
        this.f0 = s6Var.getSdkVersion();
        this.i0 = s6Var.getRelease() != null ? s6Var.getRelease() : _UrlKt.FRAGMENT_ENCODE_SET;
        this.j0 = s6Var.getEnvironment();
        this.h0 = "android";
        this.k0 = "2";
        this.l0 = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return this.X == w3Var.X && Objects.equals(this.Y, w3Var.Y) && Objects.equals(this.Z, w3Var.Z) && Objects.equals(this.f0, w3Var.f0) && this.g0.equals(w3Var.g0) && Objects.equals(this.h0, w3Var.h0) && Objects.equals(this.i0, w3Var.i0) && Objects.equals(this.j0, w3Var.j0) && Objects.equals(this.k0, w3Var.k0) && Objects.equals(this.o0, w3Var.o0) && Objects.equals(this.q0, w3Var.q0) && this.p0 == w3Var.p0;
    }

    public final int hashCode() {
        return Objects.hash(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.o0, this.p0, this.q0);
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("debug_meta");
            cVar.v(iLogger, this.X);
        }
        cVar.p("profiler_id");
        cVar.v(iLogger, this.Y);
        cVar.p("chunk_id");
        cVar.v(iLogger, this.Z);
        if (this.f0 != null) {
            cVar.p("client_sdk");
            cVar.v(iLogger, this.f0);
        }
        AbstractMap abstractMap = this.g0;
        if (!abstractMap.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.c) cVar.Y).f0;
            cVar.s(_UrlKt.FRAGMENT_ENCODE_SET);
            cVar.p("measurements");
            cVar.v(iLogger, abstractMap);
            cVar.s(str);
        }
        cVar.p("platform");
        cVar.v(iLogger, this.h0);
        cVar.p(BuildConfig.BUILD_TYPE);
        cVar.v(iLogger, this.i0);
        if (this.j0 != null) {
            cVar.p("environment");
            cVar.v(iLogger, this.j0);
        }
        cVar.p("version");
        cVar.v(iLogger, this.k0);
        if (this.m0 != null) {
            cVar.p("content_type");
            cVar.v(iLogger, this.m0);
        }
        if (this.o0 != null) {
            cVar.p("sampled_profile");
            cVar.v(iLogger, this.o0);
        }
        cVar.p("timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.l0));
        if (this.p0 != null) {
            cVar.p("profile");
            cVar.v(iLogger, this.p0);
        }
        ConcurrentHashMap concurrentHashMap = this.q0;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                e.b(this.q0, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
    }
}

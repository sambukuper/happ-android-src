package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n2 {
    public String X;
    public Integer Y;
    public String Z;
    public String f0;
    public Integer g0;
    public String h0;
    public Boolean i0;
    public String j0;
    public String k0;
    public ConcurrentHashMap l0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (io.sentry.util.b.i(this.X, mVar.X) && io.sentry.util.b.i(this.Y, mVar.Y) && io.sentry.util.b.i(this.Z, mVar.Z) && io.sentry.util.b.i(this.f0, mVar.f0) && io.sentry.util.b.i(this.g0, mVar.g0) && io.sentry.util.b.i(this.h0, mVar.h0) && io.sentry.util.b.i(this.i0, mVar.i0) && io.sentry.util.b.i(this.j0, mVar.j0) && io.sentry.util.b.i(this.k0, mVar.k0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0});
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
            cVar.p("id");
            cVar.x(this.Y);
        }
        if (this.Z != null) {
            cVar.p("vendor_id");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("vendor_name");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("memory_size");
            cVar.x(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("api_type");
            cVar.y(this.h0);
        }
        if (this.i0 != null) {
            cVar.p("multi_threaded_rendering");
            cVar.w(this.i0);
        }
        if (this.j0 != null) {
            cVar.p("version");
            cVar.y(this.j0);
        }
        if (this.k0 != null) {
            cVar.p("npot_support");
            cVar.y(this.k0);
        }
        ConcurrentHashMap concurrentHashMap = this.l0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.l0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

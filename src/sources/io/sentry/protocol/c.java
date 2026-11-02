package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n2 {
    public Long X;
    public Double Y;
    public Long Z;
    public Double f0;
    public Long g0;
    public Double h0;
    public Long i0;
    public Long j0;
    public Long k0;
    public Long l0;
    public Long m0;
    public ConcurrentHashMap n0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.util.b.i(this.X, cVar.X) && io.sentry.util.b.i(this.Y, cVar.Y) && io.sentry.util.b.i(this.Z, cVar.Z) && io.sentry.util.b.i(this.f0, cVar.f0) && io.sentry.util.b.i(this.g0, cVar.g0) && io.sentry.util.b.i(this.h0, cVar.h0) && io.sentry.util.b.i(this.i0, cVar.i0) && io.sentry.util.b.i(this.j0, cVar.j0) && io.sentry.util.b.i(this.k0, cVar.k0) && io.sentry.util.b.i(this.l0, cVar.l0) && io.sentry.util.b.i(this.m0, cVar.m0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("gc.total_count");
            cVar.x(this.X);
        }
        if (this.Y != null) {
            cVar.p("gc.total_time");
            cVar.x(this.Y);
        }
        if (this.Z != null) {
            cVar.p("gc.blocking_count");
            cVar.x(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("gc.blocking_time");
            cVar.x(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("gc.pre_oome_count");
            cVar.x(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("gc.waiting_time");
            cVar.x(this.h0);
        }
        if (this.i0 != null) {
            cVar.p("memory.free");
            cVar.x(this.i0);
        }
        if (this.j0 != null) {
            cVar.p("memory.free_until_gc");
            cVar.x(this.j0);
        }
        if (this.k0 != null) {
            cVar.p("memory.free_until_oome");
            cVar.x(this.k0);
        }
        if (this.l0 != null) {
            cVar.p("memory.total");
            cVar.x(this.l0);
        }
        if (this.m0 != null) {
            cVar.p("memory.max");
            cVar.x(this.m0);
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

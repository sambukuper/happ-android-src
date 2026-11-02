package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2 {
    public String X;
    public Date Y;
    public String Z;
    public String f0;
    public String g0;
    public String h0;
    public String i0;
    public AbstractMap j0;
    public List k0;
    public String l0;
    public Boolean m0;
    public Boolean n0;
    public List o0;
    public ConcurrentHashMap p0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.b.i(this.X, aVar.X) && io.sentry.util.b.i(this.Y, aVar.Y) && io.sentry.util.b.i(this.Z, aVar.Z) && io.sentry.util.b.i(this.f0, aVar.f0) && io.sentry.util.b.i(this.g0, aVar.g0) && io.sentry.util.b.i(this.h0, aVar.h0) && io.sentry.util.b.i(this.i0, aVar.i0) && io.sentry.util.b.i(this.j0, aVar.j0) && io.sentry.util.b.i(this.m0, aVar.m0) && io.sentry.util.b.i(this.k0, aVar.k0) && io.sentry.util.b.i(this.l0, aVar.l0) && io.sentry.util.b.i(this.n0, aVar.n0) && io.sentry.util.b.i(this.o0, aVar.o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.m0, this.k0, this.l0, this.n0, this.o0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("app_identifier");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("app_start_time");
            cVar.v(iLogger, this.Y);
        }
        if (this.Z != null) {
            cVar.p("device_app_hash");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("build_type");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("app_name");
            cVar.y(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("app_version");
            cVar.y(this.h0);
        }
        if (this.i0 != null) {
            cVar.p("app_build");
            cVar.y(this.i0);
        }
        AbstractMap abstractMap = this.j0;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.p("permissions");
            cVar.v(iLogger, this.j0);
        }
        if (this.m0 != null) {
            cVar.p("in_foreground");
            cVar.w(this.m0);
        }
        if (this.k0 != null) {
            cVar.p("view_names");
            cVar.v(iLogger, this.k0);
        }
        if (this.l0 != null) {
            cVar.p("start_type");
            cVar.y(this.l0);
        }
        if (this.n0 != null) {
            cVar.p("is_split_apks");
            cVar.w(this.n0);
        }
        List list = this.o0;
        if (list != null && !list.isEmpty()) {
            cVar.p("split_names");
            cVar.v(iLogger, this.o0);
        }
        ConcurrentHashMap concurrentHashMap = this.p0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.p0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

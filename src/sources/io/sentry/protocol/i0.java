package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements n2 {
    public String X;
    public String Y;
    public String Z;
    public String f0;
    public String g0;
    public l h0;
    public ConcurrentHashMap i0;
    public ConcurrentHashMap j0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (io.sentry.util.b.i(this.X, i0Var.X) && io.sentry.util.b.i(this.Y, i0Var.Y) && io.sentry.util.b.i(this.Z, i0Var.Z) && io.sentry.util.b.i(this.f0, i0Var.f0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.Z, this.f0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("email");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("id");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("username");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("ip_address");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("name");
            cVar.y(this.g0);
        }
        if (this.h0 != null) {
            cVar.p("geo");
            this.h0.serialize(cVar, iLogger);
        }
        if (this.i0 != null) {
            cVar.p("data");
            cVar.v(iLogger, this.i0);
        }
        ConcurrentHashMap concurrentHashMap = this.j0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.j0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

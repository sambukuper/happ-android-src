package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 implements n2 {
    public int X;
    public String Y;
    public String Z;
    public String f0;
    public Long g0;
    public ConcurrentHashMap h0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t5.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.b.i(this.Y, ((t5) obj).Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.Y});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("type");
        cVar.u(this.X);
        if (this.Y != null) {
            cVar.p("address");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("package_name");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("class_name");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("thread_id");
            cVar.x(this.g0);
        }
        ConcurrentHashMap concurrentHashMap = this.h0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.h0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

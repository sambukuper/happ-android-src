package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n2 {
    public String X;
    public ConcurrentHashMap Y;
    public Integer Z;
    public Long f0;
    public Object g0;
    public ConcurrentHashMap h0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("cookies");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("headers");
            cVar.v(iLogger, this.Y);
        }
        if (this.Z != null) {
            cVar.p("status_code");
            cVar.v(iLogger, this.Z);
        }
        if (this.f0 != null) {
            cVar.p("body_size");
            cVar.v(iLogger, this.f0);
        }
        if (this.g0 != null) {
            cVar.p("data");
            cVar.v(iLogger, this.g0);
        }
        ConcurrentHashMap concurrentHashMap = this.h0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.h0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

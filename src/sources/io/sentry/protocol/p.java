package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements n2 {
    public String X;
    public String Y;
    public List Z;
    public ConcurrentHashMap f0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("formatted");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("message");
            cVar.y(this.Y);
        }
        List list = this.Z;
        if (list != null && !list.isEmpty()) {
            cVar.p("params");
            cVar.v(iLogger, this.Z);
        }
        ConcurrentHashMap concurrentHashMap = this.f0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.f0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

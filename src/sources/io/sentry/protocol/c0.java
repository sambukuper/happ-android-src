package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n2 {
    public List X;
    public AbstractMap Y;
    public Boolean Z;
    public b0 f0;
    public ConcurrentHashMap g0;

    public c0(List list) {
        this.X = list;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("frames");
            cVar.v(iLogger, this.X);
        }
        if (this.Y != null) {
            cVar.p("registers");
            cVar.v(iLogger, this.Y);
        }
        if (this.Z != null) {
            cVar.p("snapshot");
            cVar.w(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("instruction_addr_adjustment");
            cVar.v(iLogger, this.f0);
        }
        ConcurrentHashMap concurrentHashMap = this.g0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.g0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.e;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2 {
    public List X = new ArrayList();
    public List Y = new ArrayList();
    public List Z = new ArrayList();
    public Map f0 = new HashMap();
    public ConcurrentHashMap g0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("samples");
        cVar.v(iLogger, this.X);
        cVar.p("stacks");
        cVar.v(iLogger, this.Y);
        cVar.p("frames");
        cVar.v(iLogger, this.Z);
        cVar.p("thread_metadata");
        cVar.v(iLogger, this.f0);
        ConcurrentHashMap concurrentHashMap = this.g0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.g0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

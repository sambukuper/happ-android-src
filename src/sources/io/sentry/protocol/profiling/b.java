package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n2 {
    public double X;
    public int Y;
    public String Z;
    public AbstractMap f0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.X));
        cVar.p("stack_id");
        cVar.v(iLogger, Integer.valueOf(this.Y));
        if (this.Z != null) {
            cVar.p("thread_id");
            cVar.v(iLogger, this.Z);
        }
        AbstractMap abstractMap = this.f0;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.f0.get(str);
                cVar.p(str);
                cVar.v(iLogger, obj);
            }
        }
        cVar.m();
    }
}

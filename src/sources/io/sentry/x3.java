package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 implements n2 {
    public io.sentry.protocol.w X;
    public ConcurrentHashMap Y;

    public x3(io.sentry.protocol.w wVar) {
        this.X = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x3) {
            return this.X.equals(((x3) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("profiler_id");
        cVar.v(iLogger, this.X);
        ConcurrentHashMap concurrentHashMap = this.Y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.Y, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

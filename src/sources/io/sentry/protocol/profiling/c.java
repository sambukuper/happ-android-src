package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.e;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n2 {
    public String X;
    public int Y;
    public HashMap Z;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("name");
            cVar.v(iLogger, this.X);
        }
        cVar.p("priority");
        cVar.v(iLogger, Integer.valueOf(this.Y));
        HashMap map = this.Z;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.Z, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

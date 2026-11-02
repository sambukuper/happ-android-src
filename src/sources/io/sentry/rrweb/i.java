package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e implements n2 {
    public int f0;
    public List g0;
    public HashMap h0;
    public HashMap i0;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("type");
        cVar.v(iLogger, this.X);
        cVar.p("timestamp");
        cVar.u(this.Y);
        cVar.p("data");
        cVar.k();
        cVar.p("source");
        cVar.v(iLogger, this.Z);
        List list = this.g0;
        if (list != null && !list.isEmpty()) {
            cVar.p("positions");
            cVar.v(iLogger, this.g0);
        }
        cVar.p("pointerId");
        cVar.u(this.f0);
        HashMap map = this.i0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.i0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
        HashMap map2 = this.h0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.e.a(this.h0, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
    }
}

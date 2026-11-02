package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 implements n2 {
    public io.sentry.protocol.w X;
    public h7 Y;
    public Double Z;
    public String f0;
    public String g0;
    public String h0;
    public Double i0;
    public Map j0;
    public HashMap k0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.Z.doubleValue()));
        cVar.p("type");
        cVar.y(this.h0);
        cVar.p("name");
        cVar.y(this.f0);
        cVar.p("value");
        cVar.x(this.i0);
        cVar.p("trace_id");
        cVar.v(iLogger, this.X);
        if (this.Y != null) {
            cVar.p("span_id");
            cVar.v(iLogger, this.Y);
        }
        if (this.g0 != null) {
            cVar.p("unit");
            cVar.v(iLogger, this.g0);
        }
        if (this.j0 != null) {
            cVar.p("attributes");
            cVar.v(iLogger, this.j0);
        }
        HashMap map = this.k0;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.k0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 implements n2 {
    public io.sentry.protocol.w X;
    public h7 Y;
    public Double Z;
    public String f0;
    public w5 g0;
    public Integer h0;
    public Map i0;
    public HashMap j0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.Z.doubleValue()));
        cVar.p("trace_id");
        cVar.v(iLogger, this.X);
        if (this.Y != null) {
            cVar.p("span_id");
            cVar.v(iLogger, this.Y);
        }
        cVar.p("body");
        cVar.y(this.f0);
        cVar.p("level");
        cVar.v(iLogger, this.g0);
        if (this.h0 != null) {
            cVar.p("severity_number");
            cVar.v(iLogger, this.h0);
        }
        if (this.i0 != null) {
            cVar.p("attributes");
            cVar.v(iLogger, this.i0);
        }
        HashMap map = this.j0;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.j0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

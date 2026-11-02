package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e implements n2 {
    public f f0;
    public int g0;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public HashMap l0;
    public HashMap m0;

    public g() {
        super(d.MouseInteraction);
        this.j0 = 2;
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
        cVar.p("type");
        cVar.v(iLogger, this.f0);
        cVar.p("id");
        cVar.u(this.g0);
        cVar.p("x");
        cVar.t(this.h0);
        cVar.p("y");
        cVar.t(this.i0);
        cVar.p("pointerType");
        cVar.u(this.j0);
        cVar.p("pointerId");
        cVar.u(this.k0);
        HashMap map = this.m0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.m0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
        HashMap map2 = this.l0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.e.a(this.l0, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
    }
}

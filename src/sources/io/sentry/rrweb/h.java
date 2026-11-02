package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n2 {
    public int X;
    public float Y;
    public float Z;
    public long f0;
    public HashMap g0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("id");
        cVar.u(this.X);
        cVar.p("x");
        cVar.t(this.Y);
        cVar.p("y");
        cVar.t(this.Z);
        cVar.p("timeOffset");
        cVar.u(this.f0);
        HashMap map = this.g0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.g0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 implements n2 {
    public final io.sentry.protocol.w X;
    public final io.sentry.protocol.u Y;
    public final l7 Z;
    public Date f0;
    public HashMap g0;

    public c5(io.sentry.protocol.w wVar, io.sentry.protocol.u uVar, l7 l7Var) {
        this.X = wVar;
        this.Y = uVar;
        this.Z = l7Var;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        io.sentry.protocol.w wVar = this.X;
        if (wVar != null) {
            cVar.p("event_id");
            cVar.v(iLogger, wVar);
        }
        io.sentry.protocol.u uVar = this.Y;
        if (uVar != null) {
            cVar.p("sdk");
            cVar.v(iLogger, uVar);
        }
        l7 l7Var = this.Z;
        if (l7Var != null) {
            cVar.p("trace");
            cVar.v(iLogger, l7Var);
        }
        if (this.f0 != null) {
            cVar.p("sent_at");
            cVar.v(iLogger, io.sentry.vendor.a.f(this.f0.getTime()));
        }
        HashMap map = this.g0;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.g0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

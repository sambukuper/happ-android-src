package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements n2 {
    public String X;
    public String Y;
    public String Z;
    public Long f0;
    public c0 g0;
    public o h0;
    public HashMap i0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("type");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("value");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.p("module");
            cVar.y(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("thread_id");
            cVar.x(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("stacktrace");
            cVar.v(iLogger, this.g0);
        }
        if (this.h0 != null) {
            cVar.p("mechanism");
            cVar.v(iLogger, this.h0);
        }
        HashMap map = this.i0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.i0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n2 {
    public String X;
    public Integer Y;
    public Integer Z;
    public Integer f0;
    public HashMap g0;

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.X != null) {
            cVar.p("sdk_name");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.p("version_major");
            cVar.x(this.Y);
        }
        if (this.Z != null) {
            cVar.p("version_minor");
            cVar.x(this.Z);
        }
        if (this.f0 != null) {
            cVar.p("version_patchlevel");
            cVar.x(this.f0);
        }
        HashMap map = this.g0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.g0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements n2 {
    public final String X;
    public final List Y;
    public HashMap Z;

    public j0(String str, List list) {
        this.X = str;
        this.Y = list;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        String str = this.X;
        if (str != null) {
            cVar.p("rendering_system");
            cVar.y(str);
        }
        List list = this.Y;
        if (list != null) {
            cVar.p("windows");
            cVar.v(iLogger, list);
        }
        HashMap map = this.Z;
        if (map != null) {
            for (String str2 : map.keySet()) {
                io.sentry.e.a(this.Z, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
    }
}

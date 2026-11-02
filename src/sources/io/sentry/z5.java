package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 implements n2 {
    public final List X;
    public HashMap Y;

    public z5(List list) {
        this.X = list;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("items");
        cVar.v(iLogger, this.X);
        HashMap map = this.Y;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.Y, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

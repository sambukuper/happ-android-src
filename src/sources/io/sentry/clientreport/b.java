package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n2 {
    public final Date X;
    public final ArrayList Y;
    public HashMap Z;

    public b(Date date, ArrayList arrayList) {
        this.X = date;
        this.Y = arrayList;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("timestamp");
        cVar.y(io.sentry.vendor.a.f(this.X.getTime()));
        cVar.p("discarded_events");
        cVar.v(iLogger, this.Y);
        HashMap map = this.Z;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.Z, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }
}

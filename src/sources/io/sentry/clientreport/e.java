package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n2 {
    public final String X;
    public final String Y;
    public final Long Z;
    public HashMap f0;

    public e(String str, String str2, Long l) {
        this.X = str;
        this.Y = str2;
        this.Z = l;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("reason");
        cVar.y(this.X);
        cVar.p("category");
        cVar.y(this.Y);
        cVar.p("quantity");
        cVar.x(this.Z);
        HashMap map = this.f0;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.f0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.X + "', category='" + this.Y + "', quantity=" + this.Z + '}';
    }
}

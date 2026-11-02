package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.n2;
import io.sentry.r3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements n2 {
    public final /* synthetic */ byte X = 1;
    public String Y;
    public Object Z;
    public AbstractMap f0;

    public n(Number number, String str) {
        this.Z = number;
        this.Y = str;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        switch (this.X) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
                cVar.k();
                cVar.p("value");
                cVar.x((Number) this.Z);
                String str = this.Y;
                if (str != null) {
                    cVar.p("unit");
                    cVar.y(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f0;
                if (concurrentHashMap != null) {
                    for (String str2 : concurrentHashMap.keySet()) {
                        io.sentry.e.b((ConcurrentHashMap) this.f0, str2, cVar, str2, iLogger);
                    }
                }
                cVar.m();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) r3Var;
                cVar2.k();
                cVar2.p("type");
                cVar2.v(iLogger, this.Y);
                cVar2.p("value");
                cVar2.v(iLogger, this.Z);
                HashMap map = (HashMap) this.f0;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        io.sentry.e.a((HashMap) this.f0, str3, cVar2, str3, iLogger);
                    }
                }
                cVar2.m();
                break;
        }
    }

    public /* synthetic */ n() {
    }
}

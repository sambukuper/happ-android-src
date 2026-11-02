package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 implements n2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public AbstractMap Z;

    public /* synthetic */ v5(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
                cVar.k();
                cVar.p("items");
                cVar.v(iLogger, (List) obj);
                HashMap map = (HashMap) this.Z;
                if (map != null) {
                    for (String str : map.keySet()) {
                        e.a((HashMap) this.Z, str, cVar, str, iLogger);
                    }
                }
                cVar.m();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) r3Var;
                cVar2.k();
                String str2 = (String) obj;
                if (str2 != null) {
                    cVar2.p("source");
                    cVar2.v(iLogger, str2);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.Z;
                if (concurrentHashMap != null) {
                    for (String str3 : concurrentHashMap.keySet()) {
                        e.b((ConcurrentHashMap) this.Z, str3, cVar2, str3, iLogger);
                    }
                }
                cVar2.m();
                break;
        }
    }
}

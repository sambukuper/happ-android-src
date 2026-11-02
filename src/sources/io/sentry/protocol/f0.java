package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b4;
import io.sentry.b7;
import io.sentry.e7;
import io.sentry.f7;
import io.sentry.n2;
import io.sentry.r3;
import io.sentry.v5;
import io.sentry.y4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends y4 implements n2 {
    public String r0;
    public Double s0;
    public Double t0;
    public final ArrayList u0;
    public final HashMap v0;
    public v5 w0;
    public ConcurrentHashMap x0;

    public f0(b7 b7Var) {
        super(b7Var.a);
        this.u0 = new ArrayList();
        this.v0 = new HashMap();
        e7 e7Var = b7Var.b;
        this.s0 = Double.valueOf(e7Var.a.d() / 1.0E9d);
        this.t0 = Double.valueOf(e7Var.a.c(e7Var.b) / 1.0E9d);
        this.r0 = b7Var.e;
        for (e7 e7Var2 : b7Var.c) {
            Boolean bool = Boolean.TRUE;
            b4 b4Var = e7Var2.c.f0;
            if (bool.equals(b4Var == null ? null : (Boolean) b4Var.a)) {
                this.u0.add(new z(e7Var2));
            }
        }
        e eVar = this.Y;
        eVar.m(b7Var.p);
        f7 f7Var = e7Var.c;
        ConcurrentHashMap concurrentHashMap = e7Var.j;
        f7 f7Var2 = new f7(f7Var.X, f7Var.Y, f7Var.Z, f7Var.g0, f7Var.h0, f7Var.f0, f7Var.i0, f7Var.k0);
        for (Map.Entry entry : f7Var.j0.entrySet()) {
            b((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (str != null) {
                Map map = f7Var2.l0;
                if (value == null) {
                    map.remove(str);
                } else {
                    map.put(str, value);
                }
            }
        }
        f7Var.p0.b();
        eVar.x(f7Var2);
        this.w0 = new v5(b7Var.n.apiName(), (byte) 1);
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        if (this.r0 != null) {
            cVar.p("transaction");
            cVar.y(this.r0);
        }
        cVar.p("start_timestamp");
        cVar.v(iLogger, io.sentry.config.a.c(this.s0.doubleValue()));
        if (this.t0 != null) {
            cVar.p("timestamp");
            cVar.v(iLogger, io.sentry.config.a.c(this.t0.doubleValue()));
        }
        ArrayList arrayList = this.u0;
        if (!arrayList.isEmpty()) {
            cVar.p("spans");
            cVar.v(iLogger, arrayList);
        }
        cVar.p("type");
        cVar.y("transaction");
        HashMap map = this.v0;
        if (!map.isEmpty()) {
            cVar.p("measurements");
            cVar.v(iLogger, map);
        }
        cVar.p("transaction_info");
        cVar.v(iLogger, this.w0);
        io.sentry.config.a.s(this, cVar, iLogger);
        ConcurrentHashMap concurrentHashMap = this.x0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.x0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }

    public f0(ArrayList arrayList, HashMap map, v5 v5Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.u0 = arrayList2;
        HashMap map2 = new HashMap();
        this.v0 = map2;
        this.r0 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.s0 = dValueOf;
        this.t0 = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.v0.putAll(((z) it.next()).n0);
        }
        this.w0 = v5Var;
    }
}

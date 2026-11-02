package io.sentry;

import defpackage.bt;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n2, Comparable {
    public static final Map m0 = Collections.EMPTY_MAP;
    public final Long X;
    public Date Y;
    public final Long Z;
    public String f0;
    public String g0;
    public volatile Map h0;
    public String i0;
    public String j0;
    public s5 k0;
    public ConcurrentHashMap l0;

    public g(g gVar) {
        ConcurrentHashMap concurrentHashMapP;
        this.h0 = m0;
        this.Z = gVar.Z;
        this.Y = gVar.Y;
        this.X = gVar.X;
        this.f0 = gVar.f0;
        this.g0 = gVar.g0;
        this.i0 = gVar.i0;
        this.j0 = gVar.j0;
        if (!gVar.h0.isEmpty() && (concurrentHashMapP = io.sentry.util.b.p(gVar.h0)) != null) {
            this.h0 = concurrentHashMapP;
        }
        this.l0 = io.sentry.util.b.p(gVar.l0);
        this.k0 = gVar.k0;
    }

    public static boolean a(g gVar, g gVar2) {
        return gVar.c().getTime() == gVar2.c().getTime() && io.sentry.util.b.i(gVar.f0, gVar2.f0) && io.sentry.util.b.i(gVar.g0, gVar2.g0) && io.sentry.util.b.i(gVar.i0, gVar2.i0) && io.sentry.util.b.i(gVar.j0, gVar2.j0) && gVar.k0 == gVar2.k0;
    }

    public final Map b() {
        Map concurrentHashMap;
        Map map = this.h0;
        Map map2 = m0;
        if (map != map2) {
            return map;
        }
        synchronized (this) {
            try {
                concurrentHashMap = this.h0;
                if (concurrentHashMap == map2) {
                    concurrentHashMap = new ConcurrentHashMap();
                    this.h0 = concurrentHashMap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentHashMap;
    }

    public final Date c() {
        Date date = this.Y;
        if (date != null) {
            return date;
        }
        Long l = this.X;
        if (l == null) {
            bt.i("No timestamp set for breadcrumb");
            return null;
        }
        Date date2 = new Date(l.longValue());
        this.Y = date2;
        return date2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        int iCompareTo = c().compareTo(gVar.c());
        return iCompareTo != 0 ? iCompareTo : this.Z.compareTo(gVar.Z);
    }

    public final void d(Object obj, String str) {
        if (str == null) {
            return;
        }
        if (obj != null) {
            b().put(str, obj);
            return;
        }
        Map map = this.h0;
        if (map != m0) {
            map.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if ("http".equals(this.g0)) {
            return a(this, gVar) && io.sentry.util.b.i(this.h0.get("status_code"), gVar.h0.get("status_code")) && io.sentry.util.b.i(this.h0.get("url"), gVar.h0.get("url")) && io.sentry.util.b.i(this.h0.get("method"), gVar.h0.get("method")) && io.sentry.util.b.i(this.h0.get("http.fragment"), gVar.h0.get("http.fragment")) && io.sentry.util.b.i(this.h0.get("http.query"), gVar.h0.get("http.query"));
        }
        return a(this, gVar);
    }

    public final int hashCode() {
        return "http".equals(this.g0) ? Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.f0, this.g0, this.i0, this.j0, this.k0, this.h0.get("status_code"), this.h0.get("url"), this.h0.get("method"), this.h0.get("http.fragment"), this.h0.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.f0, this.g0, this.i0, this.j0, this.k0});
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("timestamp");
        Long l = this.X;
        cVar.y(l != null ? io.sentry.vendor.a.f(l.longValue()) : io.sentry.vendor.a.f(c().getTime()));
        if (this.f0 != null) {
            cVar.p("message");
            cVar.y(this.f0);
        }
        if (this.g0 != null) {
            cVar.p("type");
            cVar.y(this.g0);
        }
        cVar.p("data");
        cVar.v(iLogger, this.h0);
        if (this.i0 != null) {
            cVar.p("category");
            cVar.y(this.i0);
        }
        if (this.j0 != null) {
            cVar.p("origin");
            cVar.y(this.j0);
        }
        if (this.k0 != null) {
            cVar.p("level");
            cVar.v(iLogger, this.k0);
        }
        ConcurrentHashMap concurrentHashMap = this.l0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.l0, str, cVar, str, iLogger);
            }
        }
        cVar.m();
    }

    public g(long j) {
        this.h0 = m0;
        this.Z = Long.valueOf(System.nanoTime());
        this.X = Long.valueOf(j);
        this.Y = null;
    }

    public g(Date date) {
        this.h0 = m0;
        this.Z = Long.valueOf(System.nanoTime());
        this.Y = date;
        this.X = null;
    }

    public g() {
        this(System.currentTimeMillis());
    }
}

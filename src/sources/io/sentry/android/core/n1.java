package io.sentry.android.core;

import io.sentry.f7;
import io.sentry.h7;
import io.sentry.j5;
import io.sentry.j7;
import io.sentry.s2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements io.sentry.i0 {
    public final d a;
    public final SentryAndroidOptions b;
    public final io.sentry.util.a c = new io.sentry.util.a();

    public n1(SentryAndroidOptions sentryAndroidOptions, d dVar) {
        this.b = sentryAndroidOptions;
        this.a = dVar;
    }

    public static void d(io.sentry.android.core.performance.g gVar, io.sentry.android.core.performance.f fVar, io.sentry.protocol.f0 f0Var) {
        h7 h7Var;
        if (fVar != io.sentry.android.core.performance.f.COLD) {
            return;
        }
        io.sentry.protocol.e eVar = f0Var.Y;
        ArrayList arrayList = f0Var.u0;
        f7 f7VarJ = eVar.j();
        if (f7VarJ == null) {
            return;
        }
        io.sentry.protocol.w wVar = f7VarJ.X;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h7Var = null;
                break;
            }
            io.sentry.protocol.z zVar = (io.sentry.protocol.z) it.next();
            if (zVar.h0.contentEquals("app.start.cold")) {
                h7Var = zVar.f0;
                break;
            }
        }
        if (h7Var == null && "app.start".equals(f7VarJ.g0)) {
            h7Var = f7VarJ.Y;
        }
        boolean zEquals = "app.start".equals(f7VarJ.g0);
        io.sentry.android.core.performance.h hVar = new io.sentry.android.core.performance.h();
        io.sentry.android.core.performance.h hVar2 = gVar.f0;
        long j = hVar2.Y;
        long j2 = hVar2.Z;
        long j3 = io.sentry.android.core.performance.g.A0;
        hVar.X = "Process Initialization";
        hVar.Y = j;
        hVar.Z = j2;
        hVar.f0 = j3;
        if (hVar.c() && Math.abs(hVar.a()) <= 10000) {
            arrayList.add(h(hVar, h7Var, wVar, "process.load", zEquals));
        }
        ArrayList arrayList2 = new ArrayList(gVar.i0.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(h((io.sentry.android.core.performance.h) it2.next(), h7Var, wVar, "contentprovider.load", zEquals));
            }
        }
        io.sentry.android.core.performance.h hVar3 = gVar.h0;
        if (hVar3.d()) {
            arrayList.add(h(hVar3, h7Var, wVar, "application.load", zEquals));
        }
    }

    public static boolean e(io.sentry.protocol.f0 f0Var) {
        for (io.sentry.protocol.z zVar : f0Var.u0) {
            if (zVar.h0.contentEquals("app.start.cold") || zVar.h0.contentEquals("app.start.warm")) {
                return true;
            }
        }
        f7 f7VarJ = f0Var.Y.j();
        return f7VarJ != null && f7VarJ.g0.equals("app.start");
    }

    public static void f(io.sentry.protocol.f0 f0Var, String str) {
        f7 f7VarJ = f0Var.Y.j();
        if (f7VarJ == null) {
            return;
        }
        f7VarJ.l0.put("app.vitals.start.type", str);
        Object obj = f7VarJ.l0.get("app.vitals.start.screen");
        for (io.sentry.protocol.z zVar : f0Var.u0) {
            Map concurrentHashMap = zVar.m0;
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                zVar.m0 = concurrentHashMap;
            }
            concurrentHashMap.put("app.vitals.start.type", str);
            if (obj != null) {
                concurrentHashMap.put("app.vitals.start.screen", obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    public static void g(io.sentry.protocol.f0 f0Var) {
        boolean z;
        Double d;
        Double d2;
        Object obj;
        ArrayList<io.sentry.protocol.z> arrayList = f0Var.u0;
        io.sentry.protocol.z zVar = null;
        io.sentry.protocol.z zVar2 = null;
        for (io.sentry.protocol.z zVar3 : arrayList) {
            if ("ui.load.initial_display".equals(zVar3.h0)) {
                zVar = zVar3;
            } else if ("ui.load.full_display".equals(zVar3.h0)) {
                zVar2 = zVar3;
            }
            if (zVar != null && zVar2 != null) {
                break;
            }
        }
        if (zVar == null && zVar2 == null) {
            return;
        }
        for (io.sentry.protocol.z zVar4 : arrayList) {
            if (zVar4 != zVar && zVar4 != zVar2) {
                Map map = zVar4.m0;
                Double d3 = zVar4.X;
                boolean z2 = false;
                boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (zVar != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (dDoubleValue < zVar.X.doubleValue() || (((d2 = zVar.Y) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (zVar2 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    if (dDoubleValue2 >= zVar2.X.doubleValue() && ((d = zVar2.Y) == null || dDoubleValue2 <= d.doubleValue())) {
                        z2 = true;
                    }
                }
                if (z || z2) {
                    Map concurrentHashMap = zVar4.m0;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        zVar4.m0 = concurrentHashMap;
                    }
                    if (z) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z2) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    public static io.sentry.protocol.z h(io.sentry.android.core.performance.h hVar, h7 h7Var, io.sentry.protocol.w wVar, String str, boolean z) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.f.b));
        map.put("thread.name", "main");
        if (!z) {
            Boolean bool = Boolean.TRUE;
            map.put("ui.contributes_to_ttid", bool);
            map.put("ui.contributes_to_ttfd", bool);
        }
        Double dValueOf = Double.valueOf(hVar.Y / 1000.0d);
        if (hVar.c()) {
            jA = hVar.a() + hVar.Y;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.z(dValueOf, Double.valueOf(jA / 1000.0d), wVar, new h7(), h7Var, str, hVar.X, j7.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.n0 n0Var) {
        Map map;
        io.sentry.android.core.performance.h hVarB;
        io.sentry.util.a aVar = this.c;
        aVar.g();
        try {
            if (!this.b.isTracingEnabled()) {
                aVar.close();
                return f0Var;
            }
            io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
            io.sentry.android.core.performance.f fVar = gVarC.X;
            if (e(f0Var)) {
                f7 f7VarJ = f0Var.Y.j();
                boolean z = true;
                boolean z2 = f7VarJ != null && "app.start".equals(f7VarJ.g0);
                boolean z3 = (f7VarJ == null || !z2 || f7VarJ.l0.containsKey("app.vitals.start.screen")) ? false : true;
                if (gVarC.o0 && (z3 || Boolean.TRUE.equals(gVarC.Y))) {
                    if (z3) {
                        hVarB = gVarC.f0;
                        if (!hVarB.c() || !hVarB.d()) {
                            hVarB = gVarC.g0;
                        }
                    } else {
                        hVarB = gVarC.b(this.b);
                    }
                    long jA = hVarB.a();
                    io.sentry.util.a aVar2 = (io.sentry.util.a) gVarC.z0.Y;
                    aVar2.g();
                    aVar2.close();
                    if (jA == 0) {
                        z = false;
                    }
                    if (z) {
                        if (z) {
                            f0Var.v0.put(fVar == io.sentry.android.core.performance.f.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.n(Float.valueOf(jA), s2.MILLISECOND.apiName()));
                        }
                        d(gVarC, fVar, f0Var);
                        gVarC.o0 = false;
                        gVarC.i0.clear();
                        gVarC.j0.clear();
                        io.sentry.util.a aVar3 = (io.sentry.util.a) gVarC.z0.Y;
                        aVar3.g();
                        aVar3.close();
                    }
                }
                io.sentry.protocol.a aVarE = f0Var.Y.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                    f0Var.Y.o(aVarE);
                }
                String str = fVar == io.sentry.android.core.performance.f.COLD ? "cold" : "warm";
                aVarE.l0 = str;
                if (z2) {
                    f(f0Var, str);
                }
            }
            g(f0Var);
            io.sentry.protocol.w wVar = f0Var.X;
            f7 f7VarJ2 = f0Var.Y.j();
            if (wVar != null && f7VarJ2 != null && f7VarJ2.g0.contentEquals("ui.load")) {
                d dVar = this.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.d;
                io.sentry.util.a aVar4 = (io.sentry.util.a) dVar.g;
                aVar4.g();
                try {
                    if (dVar.e()) {
                        map = (Map) concurrentHashMap.get(wVar);
                        concurrentHashMap.remove(wVar);
                        aVar4.close();
                    } else {
                        aVar4.close();
                        map = null;
                    }
                    if (map != null) {
                        f0Var.v0.putAll(map);
                    }
                } catch (Throwable th) {
                    try {
                        aVar4.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            aVar.close();
            return f0Var;
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, io.sentry.n0 n0Var) {
        return j5Var;
    }
}

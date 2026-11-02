package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.f7;
import io.sentry.n2;
import io.sentry.r3;
import io.sentry.x3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class e implements n2 {
    public final ConcurrentHashMap X = new ConcurrentHashMap();
    public final io.sentry.util.a Y = new io.sentry.util.a();

    public e(e eVar) {
        for (Map.Entry entry : eVar.c()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.i0 = aVar.i0;
                    aVar2.X = aVar.X;
                    aVar2.g0 = aVar.g0;
                    aVar2.Y = aVar.Y;
                    aVar2.h0 = aVar.h0;
                    aVar2.f0 = aVar.f0;
                    aVar2.Z = aVar.Z;
                    aVar2.j0 = io.sentry.util.b.p(aVar.j0);
                    aVar2.m0 = aVar.m0;
                    List list = aVar.k0;
                    aVar2.k0 = list != null ? new ArrayList(list) : null;
                    aVar2.l0 = aVar.l0;
                    aVar2.n0 = aVar.n0;
                    aVar2.o0 = aVar.o0;
                    aVar2.p0 = io.sentry.util.b.p(aVar.p0);
                    o(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    d dVar2 = new d();
                    dVar2.X = dVar.X;
                    dVar2.Y = dVar.Y;
                    dVar2.Z = io.sentry.util.b.p(dVar.Z);
                    p(dVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.X = hVar.X;
                    hVar2.Y = hVar.Y;
                    hVar2.Z = hVar.Z;
                    hVar2.f0 = hVar.f0;
                    hVar2.g0 = hVar.g0;
                    hVar2.h0 = hVar.h0;
                    hVar2.k0 = hVar.k0;
                    hVar2.l0 = hVar.l0;
                    hVar2.m0 = hVar.m0;
                    hVar2.n0 = hVar.n0;
                    hVar2.o0 = hVar.o0;
                    hVar2.p0 = hVar.p0;
                    hVar2.q0 = hVar.q0;
                    hVar2.r0 = hVar.r0;
                    hVar2.s0 = hVar.s0;
                    hVar2.t0 = hVar.t0;
                    hVar2.u0 = hVar.u0;
                    hVar2.v0 = hVar.v0;
                    hVar2.w0 = hVar.w0;
                    hVar2.x0 = hVar.x0;
                    hVar2.y0 = hVar.y0;
                    hVar2.z0 = hVar.z0;
                    hVar2.A0 = hVar.A0;
                    hVar2.C0 = hVar.C0;
                    hVar2.E0 = hVar.E0;
                    hVar2.F0 = hVar.F0;
                    hVar2.j0 = hVar.j0;
                    String[] strArr = hVar.i0;
                    hVar2.i0 = strArr != null ? (String[]) strArr.clone() : null;
                    hVar2.D0 = hVar.D0;
                    TimeZone timeZone = hVar.B0;
                    hVar2.B0 = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    hVar2.G0 = hVar.G0;
                    hVar2.H0 = hVar.H0;
                    hVar2.I0 = hVar.I0;
                    hVar2.J0 = hVar.J0;
                    hVar2.K0 = io.sentry.util.b.p(hVar.K0);
                    q(hVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof q)) {
                    q qVar = (q) value;
                    q qVar2 = new q();
                    qVar2.X = qVar.X;
                    qVar2.Y = qVar.Y;
                    qVar2.Z = qVar.Z;
                    qVar2.f0 = qVar.f0;
                    qVar2.g0 = qVar.g0;
                    qVar2.h0 = qVar.h0;
                    qVar2.i0 = io.sentry.util.b.p(qVar.i0);
                    t(qVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof y)) {
                    y yVar = (y) value;
                    y yVar2 = new y();
                    yVar2.X = yVar.X;
                    yVar2.Y = yVar.Y;
                    yVar2.Z = yVar.Z;
                    yVar2.f0 = io.sentry.util.b.p(yVar.f0);
                    v(yVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    k kVar2 = new k();
                    kVar2.X = kVar.X;
                    kVar2.Y = kVar.Y;
                    kVar2.Z = kVar.Z;
                    kVar2.f0 = kVar.f0;
                    kVar2.g0 = kVar.g0;
                    kVar2.h0 = kVar.h0;
                    kVar2.i0 = io.sentry.util.b.p(kVar.i0);
                    l(kVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.X = mVar.X;
                    mVar2.Y = mVar.Y;
                    mVar2.Z = mVar.Z;
                    mVar2.f0 = mVar.f0;
                    mVar2.g0 = mVar.g0;
                    mVar2.h0 = mVar.h0;
                    mVar2.i0 = mVar.i0;
                    mVar2.j0 = mVar.j0;
                    mVar2.k0 = mVar.k0;
                    mVar2.l0 = io.sentry.util.b.p(mVar.l0);
                    s(mVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof f7)) {
                    x(new f7((f7) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof x3)) {
                    x3 x3Var = (x3) value;
                    x3 x3Var2 = new x3();
                    x3Var2.X = x3Var.X;
                    ConcurrentHashMap concurrentHashMapP = io.sentry.util.b.p(x3Var.Y);
                    if (concurrentHashMapP != null) {
                        x3Var2.Y = concurrentHashMapP;
                    }
                    l(x3Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof s)) {
                    s sVar = (s) value;
                    s sVar2 = new s();
                    sVar2.X = sVar.X;
                    sVar2.Y = io.sentry.util.b.p(sVar.Y);
                    sVar2.h0 = io.sentry.util.b.p(sVar.h0);
                    sVar2.Z = sVar.Z;
                    sVar2.f0 = sVar.f0;
                    sVar2.g0 = sVar.g0;
                    u(sVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof g0)) {
                    g0 g0Var = (g0) value;
                    g0 g0Var2 = new g0();
                    g0Var2.X = g0Var.X;
                    g0Var2.Y = io.sentry.util.b.p(g0Var.Y);
                    w(g0Var2);
                } else if ("art".equals(entry.getKey()) && (value instanceof c)) {
                    c cVar = (c) value;
                    c cVar2 = new c();
                    cVar2.X = cVar.X;
                    cVar2.Y = cVar.Y;
                    cVar2.Z = cVar.Z;
                    cVar2.f0 = cVar.f0;
                    cVar2.g0 = cVar.g0;
                    cVar2.h0 = cVar.h0;
                    cVar2.i0 = cVar.i0;
                    cVar2.j0 = cVar.j0;
                    cVar2.k0 = cVar.k0;
                    cVar2.l0 = cVar.l0;
                    cVar2.m0 = cVar.m0;
                    cVar2.n0 = io.sentry.util.b.p(cVar.n0);
                    l(cVar2, "art");
                } else {
                    l(value, (String) entry.getKey());
                }
            }
        }
    }

    public void a() {
        this.X.clear();
    }

    public boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.X.containsKey(obj);
    }

    public Set c() {
        return this.X.entrySet();
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.X.get(obj);
    }

    public a e() {
        return (a) y(a.class, "app");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.X.equals(((e) obj).X);
        }
        return false;
    }

    public h f() {
        return (h) y(h.class, "device");
    }

    public j g() {
        return (j) y(j.class, "flags");
    }

    public q h() {
        return (q) y(q.class, "os");
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public y i() {
        return (y) y(y.class, "runtime");
    }

    public f7 j() {
        return (f7) y(f7.class, "trace");
    }

    public Enumeration k() {
        return this.X.keys();
    }

    public Object l(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.X;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void m(e eVar) {
        if (eVar == null) {
            return;
        }
        this.X.putAll(eVar.X);
    }

    public Object n(String str) {
        return this.X.remove(str);
    }

    public void o(a aVar) {
        l(aVar, "app");
    }

    public void p(d dVar) {
        l(dVar, "browser");
    }

    public void q(h hVar) {
        l(hVar, "device");
    }

    public void r(j jVar) {
        l(jVar, "flags");
    }

    public void s(m mVar) {
        l(mVar, "gpu");
    }

    @Override // io.sentry.n2
    public void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        Enumeration enumerationK = k();
        int size = this.X.size();
        String[] strArr = size == 0 ? io.sentry.util.b.a : new String[size];
        int i = 0;
        while (enumerationK.hasMoreElements()) {
            if (i == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            }
            strArr[i] = (String) enumerationK.nextElement();
            i++;
        }
        if (i != strArr.length) {
            strArr = (String[]) Arrays.copyOf(strArr, i);
        }
        Arrays.sort(strArr);
        for (String str : strArr) {
            Object objD = d(str);
            if (objD != null) {
                cVar.p(str);
                cVar.v(iLogger, objD);
            }
        }
        cVar.m();
    }

    public void t(q qVar) {
        l(qVar, "os");
    }

    public void u(s sVar) {
        io.sentry.util.a aVar = this.Y;
        aVar.g();
        try {
            l(sVar, "response");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void v(y yVar) {
        l(yVar, "runtime");
    }

    public void w(g0 g0Var) {
        l(g0Var, "spring");
    }

    public void x(f7 f7Var) {
        io.sentry.util.b.s(f7Var, "traceContext is required");
        l(f7Var, "trace");
    }

    public final Object y(Class cls, String str) {
        Object objD = d(str);
        if (cls.isInstance(objD)) {
            return cls.cast(objD);
        }
        return null;
    }

    public e() {
    }
}

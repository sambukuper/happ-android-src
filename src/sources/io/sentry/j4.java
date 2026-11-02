package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements g1 {
    public s1 a;
    public final WeakReference b;
    public io.sentry.protocol.i0 c;
    public String d;
    public io.sentry.protocol.r e;
    public final ArrayList f;
    public volatile Queue g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final CopyOnWriteArrayList k;
    public volatile s6 l;
    public volatile d7 m;
    public final io.sentry.util.a n;
    public final io.sentry.util.a o;
    public final io.sentry.util.a p;
    public final io.sentry.protocol.e q;
    public final CopyOnWriteArrayList r;
    public b4 s;
    public io.sentry.protocol.w t;
    public l1 u;
    public final Map v;
    public final io.sentry.featureflags.b w;

    public j4(j4 j4Var) {
        io.sentry.protocol.i0 i0Var;
        io.sentry.protocol.r rVar;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new io.sentry.util.a();
        this.o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.w.Y;
        this.u = h3.a;
        this.v = Collections.synchronizedMap(new WeakHashMap());
        this.a = j4Var.a;
        this.b = j4Var.b;
        this.m = j4Var.m;
        this.l = j4Var.l;
        this.u = j4Var.u;
        io.sentry.protocol.i0 i0Var2 = j4Var.c;
        if (i0Var2 != null) {
            i0Var = new io.sentry.protocol.i0();
            i0Var.X = i0Var2.X;
            i0Var.Z = i0Var2.Z;
            i0Var.Y = i0Var2.Y;
            i0Var.f0 = i0Var2.f0;
            i0Var.g0 = i0Var2.g0;
            i0Var.h0 = i0Var2.h0;
            i0Var.i0 = io.sentry.util.b.p(i0Var2.i0);
            i0Var.j0 = io.sentry.util.b.p(i0Var2.j0);
        } else {
            i0Var = null;
        }
        this.c = i0Var;
        this.d = j4Var.d;
        this.t = j4Var.t;
        io.sentry.protocol.r rVar2 = j4Var.e;
        if (rVar2 != null) {
            rVar = new io.sentry.protocol.r();
            rVar.X = rVar2.X;
            rVar.g0 = rVar2.g0;
            rVar.Y = rVar2.Y;
            rVar.Z = rVar2.Z;
            rVar.h0 = io.sentry.util.b.p(rVar2.h0);
            rVar.i0 = io.sentry.util.b.p(rVar2.i0);
            rVar.k0 = io.sentry.util.b.p(rVar2.k0);
            rVar.n0 = io.sentry.util.b.p(rVar2.n0);
            rVar.f0 = rVar2.f0;
            rVar.l0 = rVar2.l0;
            rVar.j0 = rVar2.j0;
            rVar.m0 = rVar2.m0;
        } else {
            rVar = null;
        }
        this.e = rVar;
        this.f = new ArrayList(j4Var.f);
        this.k = new CopyOnWriteArrayList(j4Var.k);
        g[] gVarArr = (g[]) j4Var.g.toArray(new g[0]);
        Queue queueC = c(j4Var.l.getMaxBreadcrumbs());
        for (g gVar : gVarArr) {
            queueC.add(new g(gVar));
        }
        this.g = queueC;
        ConcurrentHashMap concurrentHashMap = j4Var.h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = j4Var.i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                String str = (String) entry2.getKey();
                if (entry2.getValue() != null) {
                    c2.m();
                    throw null;
                }
                concurrentHashMap4.put(str, null);
            }
        }
        this.i = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = j4Var.j;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.j = concurrentHashMap6;
        this.q = new io.sentry.protocol.e(j4Var.q);
        this.r = new CopyOnWriteArrayList(j4Var.r);
        this.w = j4Var.w.m12clone();
        this.s = new b4(j4Var.s);
    }

    public static Queue c(int i) {
        return i > 0 ? new k7(new j(i)) : new e0();
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.e A() {
        return this.q;
    }

    @Override // io.sentry.g1
    public final b4 B(g4 g4Var) {
        io.sentry.util.a aVar = this.p;
        aVar.g();
        try {
            g4Var.a(this.s);
            b4 b4Var = new b4(this.s);
            aVar.close();
            return b4Var;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.g1
    public final String C() {
        return this.d;
    }

    @Override // io.sentry.g1
    public final void D(i4 i4Var) {
        io.sentry.util.a aVar = this.o;
        aVar.g();
        try {
            i4Var.f(this.a);
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

    @Override // io.sentry.g1
    public final void F(s1 s1Var) {
        io.sentry.util.a aVar = this.o;
        aVar.g();
        try {
            this.a = s1Var;
            for (h1 h1Var : this.l.getScopeObservers()) {
                if (s1Var != null) {
                    h1Var.e(s1Var.getName());
                    h1Var.c(s1Var.s(), this);
                } else {
                    h1Var.e(null);
                    h1Var.c(null, this);
                }
            }
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

    @Override // io.sentry.g1
    public final List G() {
        return this.f;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.i0 H() {
        return this.c;
    }

    @Override // io.sentry.g1
    public final List I() {
        return io.sentry.util.b.y(this.k);
    }

    @Override // io.sentry.g1
    public final String J() {
        s1 s1Var = this.a;
        if (s1Var != null) {
            return s1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.g1
    public final void K(b4 b4Var) {
        this.s = b4Var;
        f7 f7Var = new f7((io.sentry.protocol.w) b4Var.b, (h7) b4Var.c, "default", null);
        f7Var.k0 = "auto";
        Iterator<h1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().c(f7Var, this);
        }
    }

    @Override // io.sentry.g1
    public final void a(g gVar, n0 n0Var) {
        if (gVar == null || (this.g instanceof e0) || io.sentry.util.n.b()) {
            return;
        }
        d6 beforeBreadcrumb = this.l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            if (n0Var == null) {
                n0Var = new n0();
            }
            try {
                io.sentry.util.m mVarA = io.sentry.util.n.a();
                try {
                    gVar = ((d) beforeBreadcrumb).f(gVar, n0Var);
                    if (mVarA != null) {
                        mVarA.close();
                    }
                } catch (Throwable th) {
                    if (mVarA != null) {
                        try {
                            mVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.l.getLogger().e(s5.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th3);
                if (th3.getMessage() != null) {
                    gVar.d(th3.getMessage(), "sentry:message");
                }
            }
        }
        if (gVar == null) {
            this.l.getLogger().h(s5.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.g.add(gVar);
        for (h1 h1Var : this.l.getScopeObservers()) {
            h1Var.f(gVar);
            h1Var.a(this.g);
        }
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.j b() {
        return this.w.b();
    }

    @Override // io.sentry.g1
    public final void clear() {
        this.c = null;
        this.e = null;
        this.d = null;
        this.f.clear();
        this.g.clear();
        Iterator<h1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().a(this.g);
        }
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.q.a();
        this.k.clear();
        m();
        this.r.clear();
        Iterator<h1> it2 = this.l.getScopeObservers().iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        this.w.clear();
        Iterator<h1> it3 = this.l.getScopeObservers().iterator();
        while (it3.hasNext()) {
            it3.next().d(this.q);
        }
    }

    @Override // io.sentry.g1
    public final g1 clone() {
        return new j4(this);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w g() {
        return this.t;
    }

    @Override // io.sentry.g1
    public final Map getExtras() {
        return this.j;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.r getRequest() {
        return this.e;
    }

    @Override // io.sentry.g1
    public final void h(io.sentry.protocol.w wVar) {
        this.t = wVar;
        Iterator<h1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(wVar);
        }
    }

    @Override // io.sentry.g1
    public final s6 i() {
        return this.l;
    }

    @Override // io.sentry.g1
    public final s1 j() {
        return this.a;
    }

    @Override // io.sentry.g1
    public final d7 k() {
        io.sentry.util.a aVar = this.n;
        aVar.g();
        try {
            d7 d7Var = null;
            if (this.m != null) {
                d7 d7Var2 = this.m;
                d7Var2.getClass();
                d7Var2.b(new Date());
                this.l.getContinuousProfiler().d();
                d7 d7VarClone = this.m.clone();
                this.m = null;
                d7Var = d7VarClone;
            }
            aVar.close();
            return d7Var;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.g1
    public final io.sentry.internal.debugmeta.c l() {
        io.sentry.util.a aVar = this.n;
        aVar.g();
        try {
            if (this.m != null) {
                d7 d7Var = this.m;
                d7Var.getClass();
                d7Var.b(new Date());
                this.l.getContinuousProfiler().d();
            }
            d7 d7Var2 = this.m;
            io.sentry.internal.debugmeta.c cVar = null;
            if (this.l.getRelease() != null) {
                String distinctId = this.l.getDistinctId();
                io.sentry.protocol.i0 i0Var = this.c;
                this.m = new d7(c7.Ok, new Date(), new Date(), 0, distinctId, io.sentry.config.a.f(), Boolean.TRUE, null, null, i0Var != null ? i0Var.f0 : null, null, this.l.getEnvironment(), this.l.getRelease(), null);
                cVar = new io.sentry.internal.debugmeta.c((Object) this.m.clone(), (Object) (d7Var2 != null ? d7Var2.clone() : null), (byte) 7);
            } else {
                this.l.getLogger().h(s5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            aVar.close();
            return cVar;
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.g1
    public final void m() {
        io.sentry.util.a aVar = this.o;
        aVar.g();
        try {
            this.a = null;
            aVar.close();
            for (h1 h1Var : this.l.getScopeObservers()) {
                h1Var.e(null);
                h1Var.c(null, this);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.g1
    public final io.sentry.featureflags.b n() {
        return this.w;
    }

    @Override // io.sentry.g1
    public final q1 o() {
        q1 q1VarM;
        q1 q1Var = (q1) this.b.get();
        if (q1Var != null) {
            return q1Var;
        }
        s1 s1Var = this.a;
        return (s1Var == null || (q1VarM = s1Var.m()) == null) ? s1Var : q1VarM;
    }

    @Override // io.sentry.g1
    public final d7 p() {
        return this.m;
    }

    @Override // io.sentry.g1
    public final Queue q() {
        return this.g;
    }

    @Override // io.sentry.g1
    public final s5 r() {
        return null;
    }

    @Override // io.sentry.g1
    public final b4 s() {
        return this.s;
    }

    @Override // io.sentry.g1
    public final d7 t(h4 h4Var) {
        io.sentry.util.a aVar = this.n;
        aVar.g();
        try {
            h4Var.a(this.m);
            d7 d7VarClone = this.m != null ? this.m.clone() : null;
            aVar.close();
            return d7VarClone;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.g1
    public final void u(String str) {
        this.d = str;
        io.sentry.protocol.e eVar = this.q;
        io.sentry.protocol.a aVarE = eVar.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
            eVar.o(aVarE);
        }
        if (str == null) {
            aVarE.k0 = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarE.k0 = arrayList;
        }
        Iterator<h1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().d(eVar);
        }
    }

    @Override // io.sentry.g1
    public final l1 v() {
        return this.u;
    }

    @Override // io.sentry.g1
    public final Map w() {
        return io.sentry.util.b.p(this.h);
    }

    @Override // io.sentry.g1
    public final List x() {
        return this.k;
    }

    @Override // io.sentry.g1
    public final List y() {
        return new CopyOnWriteArrayList(this.r);
    }

    @Override // io.sentry.g1
    public final void z(j5 j5Var) {
        Throwable th;
        if (!this.l.isTracingEnabled() || j5Var.a() == null) {
            return;
        }
        Map map = this.v;
        Throwable thA = j5Var.a();
        io.sentry.util.b.s(thA, "throwable cannot be null");
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(thA);
        Throwable cause = thA.getCause();
        while (true) {
            Throwable th2 = cause;
            th = thA;
            thA = th2;
            if (thA == null || !setNewSetFromMap.add(thA)) {
                break;
            } else {
                cause = thA.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m14clone() {
        return new j4(this);
    }

    @Override // io.sentry.g1
    public final void E(io.sentry.protocol.w wVar) {
    }

    public j4(s6 s6Var) {
        io.sentry.featureflags.b aVar;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new io.sentry.util.a();
        this.o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.w.Y;
        this.u = h3.a;
        this.v = Collections.synchronizedMap(new WeakHashMap());
        io.sentry.util.b.s(s6Var, "SentryOptions is required.");
        this.l = s6Var;
        this.g = c(this.l.getMaxBreadcrumbs());
        int maxFeatureFlags = s6Var.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            aVar = new io.sentry.featureflags.a(maxFeatureFlags, Collections.EMPTY_LIST);
        } else {
            aVar = io.sentry.featureflags.c.X;
        }
        this.w = aVar;
        this.s = new b4();
    }
}

package io.sentry;

import defpackage.jn0;
import defpackage.mf1;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 implements s1 {
    public final e7 b;
    public final o4 d;
    public final String e;
    public volatile Future g;
    public volatile Future h;
    public volatile boolean i;
    public final io.sentry.util.a j;
    public final io.sentry.util.a k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final io.sentry.protocol.h0 n;
    public final x1 o;
    public final io.sentry.protocol.e p;
    public final o q;
    public final o7 r;
    public final io.sentry.protocol.w a = new io.sentry.protocol.w();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public a7 f = a7.c;

    public b7(n7 n7Var, o4 o4Var, o7 o7Var, o oVar) {
        this.i = false;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.k = new io.sentry.util.a();
        this.l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        this.p = eVar;
        e7 e7Var = new e7(n7Var, this, o4Var, o7Var);
        this.b = e7Var;
        this.e = n7Var.r0;
        this.o = n7Var.n0;
        this.d = o4Var;
        Boolean bool = Boolean.TRUE;
        oVar = bool.equals(C()) ? oVar : null;
        this.q = oVar;
        this.n = n7Var.s0;
        this.r = o7Var;
        D(e7Var);
        io.sentry.protocol.w wVarA = A();
        if (!wVarA.equals(io.sentry.protocol.w.Y) && bool.equals(C())) {
            eVar.l(new x3(wVarA), "profile");
        }
        if (oVar != null) {
            oVar.e(this);
        }
        if (o7Var.g == null && o7Var.h == null) {
            return;
        }
        boolean z = true;
        this.i = true;
        Long l = o7Var.h;
        if (l != null) {
            aVar.g();
            try {
                if (this.i) {
                    x();
                    atomicBoolean.set(true);
                    try {
                        this.h = o4Var.i().getTimerExecutorService().b(new z6(this, (byte) 1), l.longValue());
                    } catch (Throwable th) {
                        this.d.i().getLogger().e(s5.WARNING, "Failed to schedule finish timer", th);
                        j7 j7VarT = t();
                        if (j7VarT == null) {
                            j7VarT = j7.DEADLINE_EXCEEDED;
                        }
                        if (this.r.g == null) {
                            z = false;
                        }
                        f(j7VarT, z, null);
                        this.m.set(false);
                    }
                }
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        q();
    }

    public static boolean B(x0 x0Var, e7 e7Var, a5 a5Var) {
        Object obj = e7Var.j.get("profiler_id");
        if (!(obj instanceof String)) {
            return false;
        }
        try {
            io.sentry.protocol.w wVar = new io.sentry.protocol.w((String) obj);
            a5 a5Var2 = e7Var.b;
            a5 a5Var3 = e7Var.a;
            if (a5Var2 != null) {
                a5Var = a5Var2;
            }
            return x0Var.a(wVar, a5Var3, a5Var) == io.sentry.profiling.c.NOT_RECORDED;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final io.sentry.protocol.w A() {
        e7 e7Var = this.b;
        return !e7Var.c.q0.equals(io.sentry.protocol.w.Y) ? e7Var.c.q0 : this.d.i().getContinuousProfiler().e();
    }

    public final Boolean C() {
        b4 b4Var = this.b.c.f0;
        if (b4Var == null) {
            return null;
        }
        return (Boolean) b4Var.a;
    }

    public final void D(e7 e7Var) {
        io.sentry.util.thread.a threadChecker = this.d.i().getThreadChecker();
        io.sentry.protocol.w wVarA = A();
        if (!wVarA.equals(io.sentry.protocol.w.Y)) {
            Boolean bool = Boolean.TRUE;
            b4 b4Var = e7Var.c.f0;
            if (bool.equals(b4Var == null ? null : (Boolean) b4Var.a)) {
                e7Var.j(wVarA.a(), "profiler_id");
            }
        }
        e7Var.j(String.valueOf(threadChecker.b()), "thread.id");
        e7Var.j(threadChecker.a(), "thread.name");
    }

    public final void E(c cVar) {
        e7 e7Var = this.b;
        o4 o4Var = this.d;
        io.sentry.util.a aVar = this.k;
        aVar.g();
        try {
            if (cVar.f) {
                AtomicReference atomicReference = new AtomicReference();
                if (o4Var.isEnabled()) {
                    try {
                        atomicReference.set(o4Var.f.d(null).g());
                    } catch (Throwable th) {
                        o4Var.i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                } else {
                    o4Var.i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                cVar.e(e7Var.c.X, (io.sentry.protocol.w) atomicReference.get(), o4Var.i(), e7Var.c.f0, this.e, this.n);
                cVar.f = false;
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.q1
    public final String a() {
        return this.b.c.h0;
    }

    @Override // io.sentry.q1
    public final l7 b() {
        c cVar;
        if (!this.d.i().isTraceSampling() || (cVar = this.b.c.o0) == null) {
            return null;
        }
        E(cVar);
        return cVar.f();
    }

    @Override // io.sentry.q1
    public final y6 c() {
        return this.b.c();
    }

    @Override // io.sentry.q1
    public final q1 d(String str, a5 a5Var, x1 x1Var) {
        return n("activity.load", str, a5Var, x1Var, new i7());
    }

    @Override // io.sentry.q1
    public final boolean e() {
        return this.b.f;
    }

    @Override // io.sentry.s1
    public final void f(j7 j7Var, boolean z, n0 n0Var) {
        if (this.b.f) {
            return;
        }
        a5 a5VarA = this.d.i().getDateProvider().a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            e7 e7Var = (e7) listIterator.previous();
            e7Var.i = null;
            e7Var.v(j7Var, a5VarA);
        }
        z(j7Var, a5VarA, z, n0Var);
    }

    @Override // io.sentry.q1
    public final void g(Number number, String str) {
        this.b.g(number, str);
    }

    @Override // io.sentry.s1
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.q1
    public final void h(j7 j7Var) {
        v(j7Var, null);
    }

    @Override // io.sentry.q1
    public final void i() {
        v(t(), null);
    }

    @Override // io.sentry.q1
    public final void j(Object obj, String str) {
        e7 e7Var = this.b;
        if (e7Var.f) {
            this.d.i().getLogger().h(s5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            e7Var.j(obj, str);
        }
    }

    @Override // io.sentry.q1
    public final d k() {
        c cVar;
        String str;
        int i;
        String str2;
        c cVar2;
        String str3 = "%20";
        d dVar = null;
        if (!this.d.i().isTraceSampling() || (cVar = this.b.c.o0) == null) {
            return null;
        }
        ILogger iLogger = cVar.h;
        E(cVar);
        String str4 = c.a(iLogger, null, true).e;
        ConcurrentHashMap concurrentHashMap = cVar.a;
        StringBuilder sb = new StringBuilder();
        if (str4 == null || str4.isEmpty()) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
            i = 0;
        } else {
            sb.append(str4);
            Charset charset = io.sentry.util.q.a;
            int i2 = 0;
            for (int i3 = 0; i3 < str4.length(); i3++) {
                if (str4.charAt(i3) == ',') {
                    i2++;
                }
            }
            i = i2 + 1;
            str = ",";
        }
        io.sentry.util.a aVar = cVar.b;
        aVar.g();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            aVar.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            int i4 = i;
            String str5 = str;
            for (String str6 : treeSet) {
                d dVar2 = dVar;
                String strC = "sentry-sample_rate".equals(str6) ? c.c(cVar.c) : "sentry-sample_rand".equals(str6) ? c.c(cVar.d) : (String) concurrentHashMap.get(str6);
                if (strC == null) {
                    str2 = str3;
                    cVar2 = cVar;
                } else if (i4 >= 64) {
                    iLogger.h(s5.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str6, 64);
                    str2 = str3;
                    cVar2 = cVar;
                } else {
                    try {
                        cVar2 = cVar;
                        try {
                            str2 = str3;
                            try {
                                String str7 = str5 + URLEncoder.encode(str6, "UTF-8").replaceAll("\\+", str3) + "=" + URLEncoder.encode(strC, "UTF-8").replaceAll("\\+", str3);
                                if (sb.length() + str7.length() > 8192) {
                                    iLogger.h(s5.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str6, 8192);
                                } else {
                                    i4++;
                                    sb.append(str7);
                                    str5 = ",";
                                }
                            } catch (Throwable th) {
                                th = th;
                                iLogger.d(s5.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strC);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str3;
                        cVar2 = cVar;
                    }
                }
                dVar = dVar2;
                cVar = cVar2;
                str3 = str2;
            }
            d dVar3 = dVar;
            String string = sb.toString();
            return string.isEmpty() ? dVar3 : new d((Object) string, (byte) 0);
        } catch (Throwable th4) {
            try {
                aVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.q1
    public final void l() {
        o4 o4Var = this.d;
        if (!o4Var.isEnabled()) {
            o4Var.i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            o4Var.f.d(null).F(this);
        } catch (Throwable th) {
            o4Var.i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.s1
    public final q1 m() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            e7 e7Var = (e7) listIterator.previous();
            if (!e7Var.f) {
                return e7Var;
            }
        }
        return null;
    }

    @Override // io.sentry.q1
    public final q1 n(String str, String str2, a5 a5Var, x1 x1Var, i7 i7Var) {
        boolean z = this.b.f;
        l3 l3Var = l3.a;
        if (z || !this.o.equals(x1Var)) {
            return l3Var;
        }
        int size = this.c.size();
        o4 o4Var = this.d;
        if (size < o4Var.i().getMaxSpans()) {
            return this.b.n(str, str2, a5Var, x1Var, i7Var);
        }
        o4Var.i().getLogger().h(s5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return l3Var;
    }

    @Override // io.sentry.q1
    public final void o(String str) {
        e7 e7Var = this.b;
        if (e7Var.f) {
            this.d.i().getLogger().h(s5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            e7Var.c.h0 = str;
        }
    }

    @Override // io.sentry.s1
    public final io.sentry.protocol.w p() {
        return this.a;
    }

    @Override // io.sentry.s1
    public final void q() {
        Long l;
        io.sentry.util.a aVar = this.j;
        aVar.g();
        try {
            if (this.i && (l = this.r.g) != null) {
                y();
                this.l.set(true);
                try {
                    this.g = this.d.i().getTimerExecutorService().b(new z6(this, (byte) 0), l.longValue());
                } catch (Throwable th) {
                    this.d.i().getLogger().e(s5.WARNING, "Failed to schedule finish timer", th);
                    j7 j7VarT = t();
                    if (j7VarT == null) {
                        j7VarT = j7.OK;
                    }
                    v(j7VarT, null);
                    this.l.set(false);
                }
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q1
    public final void r(String str, Long l, s2 s2Var) {
        this.b.r(str, l, s2Var);
    }

    @Override // io.sentry.q1
    public final f7 s() {
        return this.b.c;
    }

    @Override // io.sentry.q1
    public final j7 t() {
        return this.b.c.i0;
    }

    @Override // io.sentry.q1
    public final a5 u() {
        return this.b.b;
    }

    @Override // io.sentry.q1
    public final void v(j7 j7Var, a5 a5Var) {
        z(j7Var, a5Var, true, null);
    }

    @Override // io.sentry.q1
    public final a5 w() {
        return this.b.a;
    }

    public final void x() {
        io.sentry.util.a aVar = this.j;
        aVar.g();
        try {
            if (this.h != null) {
                this.h.cancel(false);
                this.m.set(false);
                this.h = null;
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

    public final void y() {
        io.sentry.util.a aVar = this.j;
        aVar.g();
        try {
            if (this.g != null) {
                this.g.cancel(false);
                this.l.set(false);
                this.g = null;
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

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    public final void z(j7 j7Var, a5 a5Var, boolean z, n0 n0Var) {
        z3 z3VarB;
        a5 a5Var2 = this.b.b;
        if (a5Var == null) {
            a5Var = a5Var2;
        }
        if (a5Var == null) {
            a5Var = this.d.i().getDateProvider().a();
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i7 i7Var = ((e7) it.next()).h;
        }
        this.f = new a7(true, j7Var);
        if (this.b.f) {
            return;
        }
        if (this.r.f) {
            ListIterator listIterator = this.c.listIterator();
            while (listIterator.hasNext()) {
                e7 e7Var = (e7) listIterator.next();
                if (!e7Var.f && e7Var.b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        e7 e7Var2 = this.b;
        e7Var2.i = new mf1((Object) this, (Object) e7Var2.i, (Object) atomicReference, (byte) 10);
        e7Var2.v(this.f.b, a5Var);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(C())) {
            b4 b4Var = this.b.c.f0;
            if (bool.equals(b4Var == null ? null : (Boolean) b4Var.d)) {
                z3VarB = this.d.i().getTransactionProfiler().b(this, (List) atomicReference.get(), this.d.i());
            } else {
                z3VarB = null;
            }
        } else {
            z3VarB = null;
        }
        if (this.d.i().isContinuousProfilingEnabled()) {
            y3 profileLifecycle = this.d.i().getProfileLifecycle();
            y3 y3Var = y3.TRACE;
            if (profileLifecycle == y3Var && this.b.c.q0.equals(io.sentry.protocol.w.Y)) {
                this.d.i().getContinuousProfiler().b(y3Var);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        o4 o4Var = this.d;
        if (o4Var.isEnabled()) {
            try {
                g1 g1VarD = o4Var.f.d(null);
                g1VarD.D(new jn0(this, g1VarD, (byte) 19));
            } catch (Throwable th) {
                o4Var.i().getLogger().e(s5.ERROR, "Error in the 'configureScope' callback.", th);
            }
        } else {
            o4Var.i().getLogger().h(s5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        e7 e7Var3 = this.b;
        o4 o4Var2 = this.d;
        x0 continuousProfiler = o4Var2.i().getContinuousProfiler();
        if (!(continuousProfiler instanceof x2)) {
            if (B(continuousProfiler, e7Var3, a5Var)) {
                e7Var3.j(null, "profiler_id");
                this.p.n("profile");
                o4Var2.i().getLogger().h(s5.DEBUG, "No profile was recorded for transaction, dropping its profiler id.", new Object[0]);
            }
            for (e7 e7Var4 : this.c) {
                if (B(continuousProfiler, e7Var4, a5Var)) {
                    e7Var4.j(null, "profiler_id");
                }
            }
        }
        io.sentry.protocol.f0 f0Var = new io.sentry.protocol.f0(this);
        if (this.i) {
            io.sentry.util.a aVar = this.j;
            aVar.g();
            try {
                if (this.i) {
                    y();
                    x();
                    this.i = false;
                }
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (z && this.c.isEmpty() && this.r.g != null) {
            this.d.i().getLogger().h(s5.DEBUG, "Dropping idle transaction %s because it has no child spans", this.e);
        } else {
            f0Var.v0.putAll(this.b.k);
            this.d.w(f0Var, b(), n0Var, z3VarB);
        }
    }
}

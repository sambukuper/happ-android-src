package io.sentry;

import defpackage.j78;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e7 implements q1 {
    public final a5 a;
    public a5 b;
    public final f7 c;
    public final b7 d;
    public final i1 e;
    public final i7 h;
    public g7 i;
    public boolean f = false;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public e7(b7 b7Var, o4 o4Var, f7 f7Var, i7 i7Var, j78 j78Var) {
        new ConcurrentHashMap();
        this.c = f7Var;
        f7Var.k0 = i7Var.d;
        this.d = b7Var;
        io.sentry.util.b.s(o4Var, "Scopes are required");
        this.e = o4Var;
        this.h = i7Var;
        this.i = j78Var;
        a5 a5Var = i7Var.a;
        if (a5Var != null) {
            this.a = a5Var;
        } else {
            this.a = o4Var.i().getDateProvider().a();
        }
    }

    @Override // io.sentry.q1
    public final String a() {
        return this.c.h0;
    }

    @Override // io.sentry.q1
    public final y6 c() {
        f7 f7Var = this.c;
        io.sentry.protocol.w wVar = f7Var.X;
        h7 h7Var = f7Var.Y;
        b4 b4Var = f7Var.f0;
        return new y6(wVar, h7Var, b4Var == null ? null : (Boolean) b4Var.a);
    }

    @Override // io.sentry.q1
    public final q1 d(String str, a5 a5Var, x1 x1Var) {
        return n("activity.load", str, a5Var, x1Var, new i7());
    }

    @Override // io.sentry.q1
    public final boolean e() {
        return this.f;
    }

    @Override // io.sentry.q1
    public final void g(Number number, String str) {
        if (this.f) {
            this.e.i().getLogger().h(s5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.n(number, null));
        b7 b7Var = this.d;
        e7 e7Var = b7Var.b;
        if (e7Var == this || e7Var.k.containsKey(str)) {
            return;
        }
        b7Var.g(number, str);
    }

    @Override // io.sentry.q1
    public final void h(j7 j7Var) {
        v(j7Var, this.e.i().getDateProvider().a());
    }

    @Override // io.sentry.q1
    public final void i() {
        h(this.c.i0);
    }

    @Override // io.sentry.q1
    public final void j(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.j;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.q1
    public final q1 n(String str, String str2, a5 a5Var, x1 x1Var, i7 i7Var) {
        boolean z = this.f;
        l3 l3Var = l3.a;
        if (!z) {
            h7 h7Var = this.c.Y;
            b7 b7Var = this.d;
            e7 e7Var = b7Var.b;
            f7 f7Var = e7Var.c;
            f7 f7Var2 = new f7(f7Var.X, new h7(), h7Var, str, null, f7Var.f0, null, "manual");
            f7Var2.h0 = str2;
            f7Var2.n0 = x1Var;
            i7Var.a = a5Var;
            CopyOnWriteArrayList copyOnWriteArrayList = b7Var.c;
            o4 o4Var = b7Var.d;
            if (!e7Var.f && b7Var.o.equals(x1Var)) {
                if (!io.sentry.util.p.a(i7Var.d, o4Var.i().getIgnoredSpanOrigins())) {
                    String str3 = f7Var2.g0;
                    String str4 = f7Var2.h0;
                    if (copyOnWriteArrayList.size() >= o4Var.i().getMaxSpans()) {
                        o4Var.i().getLogger().h(s5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str3, str4);
                        return l3Var;
                    }
                    io.sentry.util.b.s(f7Var2.Z, "parentSpanId is required");
                    io.sentry.util.b.s(str3, "operation is required");
                    b7Var.y();
                    e7 e7Var2 = new e7(b7Var, b7Var.d, f7Var2, i7Var, new j78(b7Var, (byte) 10));
                    b7Var.D(e7Var2);
                    copyOnWriteArrayList.add(e7Var2);
                    o oVar = b7Var.q;
                    if (oVar != null) {
                        oVar.d(e7Var2);
                    }
                    return e7Var2;
                }
            }
        }
        return l3Var;
    }

    @Override // io.sentry.q1
    public final void o(String str) {
        this.c.h0 = str;
    }

    @Override // io.sentry.q1
    public final void r(String str, Long l, s2 s2Var) {
        if (this.f) {
            this.e.i().getLogger().h(s5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.n(l, s2Var.apiName()));
        b7 b7Var = this.d;
        e7 e7Var = b7Var.b;
        if (e7Var == this || e7Var.k.containsKey(str)) {
            return;
        }
        b7Var.r(str, l, s2Var);
    }

    @Override // io.sentry.q1
    public final f7 s() {
        return this.c;
    }

    @Override // io.sentry.q1
    public final j7 t() {
        return this.c.i0;
    }

    @Override // io.sentry.q1
    public final a5 u() {
        return this.b;
    }

    @Override // io.sentry.q1
    public final void v(j7 j7Var, a5 a5Var) {
        List<e7> list;
        a5 a5Var2;
        a5 a5Var3;
        b7 b7Var = this.d;
        CopyOnWriteArrayList<e7> copyOnWriteArrayList = b7Var.c;
        f7 f7Var = this.c;
        h7 h7Var = f7Var.Y;
        if (this.f || !this.g.compareAndSet(false, true)) {
            return;
        }
        f7Var.i0 = j7Var;
        if (a5Var == null) {
            a5Var = this.e.i().getDateProvider().a();
        }
        this.b = a5Var;
        i7 i7Var = this.h;
        if (i7Var.c) {
            if (!b7Var.b.c.Y.equals(h7Var)) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (e7 e7Var : copyOnWriteArrayList) {
                    h7 h7Var2 = e7Var.c.Z;
                    if (h7Var2 != null && h7Var2.equals(h7Var)) {
                        arrayList.add(e7Var);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            a5 a5Var4 = null;
            a5 a5Var5 = null;
            for (e7 e7Var2 : list) {
                if (a5Var4 == null || e7Var2.a.b(a5Var4) < 0) {
                    a5Var4 = e7Var2.a;
                }
                if (a5Var5 == null || ((a5Var3 = e7Var2.b) != null && a5Var3.b(a5Var5) > 0)) {
                    a5Var5 = e7Var2.b;
                }
            }
            if (i7Var.c && a5Var5 != null && (((a5Var2 = this.b) == null || a5Var2.b(a5Var5) > 0) && this.b != null)) {
                this.b = a5Var5;
            }
        }
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.d(this);
        }
        this.f = true;
    }

    @Override // io.sentry.q1
    public final a5 w() {
        return this.a;
    }

    public e7(n7 n7Var, b7 b7Var, o4 o4Var, o7 o7Var) {
        new ConcurrentHashMap();
        this.c = n7Var;
        n7Var.k0 = o7Var.d;
        this.d = b7Var;
        this.e = o4Var;
        this.i = null;
        a5 a5Var = o7Var.a;
        if (a5Var != null) {
            this.a = a5Var;
        } else {
            this.a = o4Var.i().getDateProvider().a();
        }
        this.h = o7Var;
    }
}

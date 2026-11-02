package io.sentry;

import defpackage.oi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements o {
    public final boolean f;
    public final s6 g;
    public final io.sentry.util.a a = new io.sentry.util.a();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public w(s6 s6Var) {
        boolean z = false;
        this.g = s6Var;
        for (d1 d1Var : s6Var.getPerformanceCollectors()) {
            if (d1Var instanceof e1) {
                this.d.add((e1) d1Var);
            }
            if (d1Var instanceof io.sentry.android.core.f2) {
                this.e.add((io.sentry.android.core.f2) d1Var);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.o
    public final void a(String str) {
        if (this.f) {
            this.g.getLogger().h(s5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new v(this, null));
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        io.sentry.util.a aVar = this.a;
        aVar.g();
        try {
            if (this.b == null) {
                this.b = new Timer(true);
            }
            this.b.schedule(new t(this), 0L);
            this.b.schedule(new u(this, new ArrayList()), 100L, 100L);
            aVar.close();
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

    @Override // io.sentry.o
    public final void b(e7 e7Var) throws Throwable {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).e(e7Var);
        }
    }

    @Override // io.sentry.o
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        v vVar = (v) concurrentHashMap.remove(str);
        this.g.getLogger().h(s5.DEBUG, oi0.l("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    @Override // io.sentry.o
    public final void close() {
        this.g.getLogger().h(s5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).d();
        }
        if (this.h.getAndSet(false)) {
            io.sentry.util.a aVar = this.a;
            aVar.g();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
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
    }

    @Override // io.sentry.o
    public final void d(e7 e7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).f(e7Var);
        }
    }

    @Override // io.sentry.o
    public final void e(b7 b7Var) {
        if (this.f) {
            this.g.getLogger().h(s5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).f(b7Var);
        }
        String strA = b7Var.a.a();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(strA)) {
            concurrentHashMap.put(strA, new v(this, b7Var));
        }
        a(strA);
    }

    @Override // io.sentry.o
    public final List f(s1 s1Var) {
        this.g.getLogger().h(s5.DEBUG, "stop collecting performance info for transactions %s (%s)", s1Var.getName(), s1Var.s().X.a());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).e(s1Var);
        }
        return c(s1Var.p().a());
    }
}

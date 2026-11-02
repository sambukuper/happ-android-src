package io.sentry.cache;

import defpackage.j78;
import io.sentry.b4;
import io.sentry.f7;
import io.sentry.h7;
import io.sentry.j4;
import io.sentry.m4;
import io.sentry.protocol.w;
import io.sentry.s5;
import io.sentry.s6;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m4 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final Object g = new Object();
    public static final Object h = new Object();
    public final s6 a;
    public final io.sentry.util.g b = new io.sentry.util.g(new j78(this, 24));
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public g(s6 s6Var) {
        this.a = s6Var;
    }

    @Override // io.sentry.m4, io.sentry.h1
    public final void a(Collection collection) {
        if (collection.isEmpty() && this.a.isEnableScopePersistence()) {
            this.d.offer(h);
            k();
        }
    }

    @Override // io.sentry.h1
    public final void c(f7 f7Var, j4 j4Var) {
        if (f7Var == null) {
            b4 b4Var = j4Var.s;
            f7 f7Var2 = new f7((w) b4Var.b, (h7) b4Var.c, "default", null);
            f7Var2.k0 = "auto";
            f7Var = f7Var2;
        }
        i(f7Var, "trace.json");
    }

    @Override // io.sentry.m4, io.sentry.h1
    public final void d(io.sentry.protocol.e eVar) {
        i(eVar, "contexts.json");
    }

    @Override // io.sentry.m4, io.sentry.h1
    public final void e(String str) {
        i(str, "transaction.json");
    }

    @Override // io.sentry.h1
    public final void f(io.sentry.g gVar) {
        if (this.a.isEnableScopePersistence()) {
            this.d.offer(gVar);
            k();
        }
    }

    public final void g(String str) {
        a.a(this.a, ".scope-cache", str);
    }

    @Override // io.sentry.m4, io.sentry.h1
    public final void h(w wVar) {
        i(wVar, "replay.json");
    }

    public final void i(Object obj, String str) {
        if (this.a.isEnableScopePersistence()) {
            if (obj == null) {
                obj = g;
            }
            this.c.put(str, obj);
            k();
        }
    }

    public final Object j(s6 s6Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(s6Var, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.g) this.b.a()).U());
        } catch (IOException unused) {
            s6Var.getLogger().h(s5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void k() {
        s6 s6Var = this.a;
        AtomicBoolean atomicBoolean = this.e;
        byte b = 0;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                if (s6Var.getExecutorService().submit(new f(this, b)).isCancelled()) {
                    atomicBoolean.set(false);
                }
            } catch (Throwable th) {
                atomicBoolean.set(false);
                s6Var.getLogger().e(s5.ERROR, "Scope persistence flush could not be submitted", th);
            }
        }
    }
}

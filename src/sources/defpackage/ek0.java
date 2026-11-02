package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ek0 {
    public final Executor a;
    public final lv2 b;
    public ScheduledFuture e;
    public t6 f;
    public jk0 g;
    public bo5 h;
    public h70 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final dk0 j = new dk0(this, 0);
    public volatile List k = d02.X;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public ek0(Executor executor, lv2 lv2Var) {
        this.a = executor;
        this.b = lv2Var;
    }

    public final void a(String str) {
        jk0 jk0Var = this.g;
        if (jk0Var == null) {
            return;
        }
        try {
            aj0 aj0VarS = jk0Var.b(str).s();
            aj0VarS.getClass();
            e(aj0VarS);
        } catch (IllegalArgumentException unused) {
            hi5.z0("CameraPresencePrvdr");
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<ck0> copyOnWriteArrayList = this.n;
        if (!zIsEmpty) {
            set.size();
            hi5.z0("CameraPresencePrvdr");
            for (ck0 ck0Var : copyOnWriteArrayList) {
                ck0Var.b.execute(new v7(ck0Var, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        set2.size();
        hi5.z0("CameraPresencePrvdr");
        for (ck0 ck0Var2 : copyOnWriteArrayList) {
            ck0Var2.b.execute(new sc(ck0Var2, set2, (byte) 4));
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            v85 v85Var = (v85) this.o.remove(str);
            jk0 jk0Var = this.g;
            if (v85Var != null && jk0Var != null) {
                try {
                    cj0 cj0VarB = jk0Var.b(str);
                    ((lv2) km4.J()).execute(new sc(cj0VarB, v85Var, (byte) 5));
                    hi5.z0("CameraPresencePrvdr");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i, List list) {
        if (i > 0 && this.l.get()) {
            this.e = this.b.schedule(new zj0(this, list, i, (byte) 1), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            hi5.z0("CameraPresencePrvdr");
        }
    }

    public final void e(aj0 aj0Var) {
        String strE = aj0Var.e();
        strE.getClass();
        if (this.l.get()) {
            synchronized (this.c) {
                if (this.o.containsKey(strE)) {
                    return;
                }
                bk0 bk0Var = new bk0(this, strE);
                ((lv2) km4.J()).execute(new sc(aj0Var, bk0Var, (byte) 6));
                this.o.put(strE, bk0Var);
                hi5.z0("CameraPresencePrvdr");
            }
        }
    }

    public final void f() {
        if (!this.l.getAndSet(false)) {
            hi5.z0("CameraPresencePrvdr");
            return;
        }
        hi5.z0("CameraPresencePrvdr");
        synchronized (this.d) {
            try {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        bo5 bo5Var = this.h;
        if (bo5Var != null) {
            bo5Var.i(this.j);
        }
        synchronized (this.c) {
            if (!this.o.isEmpty()) {
                Map mapQ = zp4.Q(this.o);
                this.o.clear();
                jk0 jk0Var = this.g;
                if (jk0Var != null) {
                    LinkedHashSet<cj0> linkedHashSetC = jk0Var.c();
                    ArrayList arrayList = new ArrayList();
                    for (cj0 cj0Var : linkedHashSetC) {
                        aj0 aj0VarS = cj0Var != null ? cj0Var.s() : null;
                        if (aj0VarS != null) {
                            arrayList.add(aj0VarS);
                        }
                    }
                    mapQ.size();
                    hi5.z0("CameraPresencePrvdr");
                    for (Map.Entry entry : mapQ.entrySet()) {
                        ((lv2) km4.J()).execute(new j0((Object) arrayList, entry.getValue(), (Object) ((String) entry.getKey()), (byte) 4));
                    }
                }
            }
        }
        this.i = null;
        this.m.clear();
        this.n.clear();
        this.k = d02.X;
        this.f = null;
        this.g = null;
    }

    public final void g(h70 h70Var, t6 t6Var, jk0 jk0Var) {
        t6Var.getClass();
        jk0Var.getClass();
        if (this.l.compareAndSet(false, true)) {
            hi5.z0("CameraPresencePrvdr");
            this.i = h70Var;
            Set<String> setH = t6Var.h();
            ArrayList arrayList = new ArrayList(xv0.Z(setH, 10));
            for (String str : setH) {
                str.getClass();
                arrayList.add(z68.v(str, null, null));
            }
            this.k = arrayList;
            this.f = t6Var;
            this.g = jk0Var;
            this.h = (bo5) t6Var.i0;
            this.a.execute(new ak0(this, (byte) 2));
            bo5 bo5Var = this.h;
            if (bo5Var != null) {
                bo5Var.c(new c37(this.a), this.j);
            }
        }
    }
}

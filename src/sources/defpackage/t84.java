package defpackage;

import androidx.activity.ComponentActivity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t84 {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public vh0 e;

    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:38:0x0078, B:39:0x007b, B:44:0x008e, B:45:0x0091, B:48:0x0094, B:49:0x0099, B:20:0x003b, B:21:0x003c, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:30:0x0069, B:31:0x006b, B:33:0x006d, B:34:0x0074, B:37:0x0077, B:32:0x006c, B:14:0x0033), top: B:54:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(p84 p84Var, xy0 xy0Var, vh0 vh0Var) {
        Iterator it;
        p84 p84Var2;
        boolean z;
        synchronized (this.a) {
            try {
                boolean z2 = true;
                mb6.n(!((List) xy0Var.h0).isEmpty());
                this.e = vh0Var;
                d94 d94VarF = p84Var.f();
                e(d94VarF);
                s84 s84VarC = c(d94VarF);
                if (s84VarC == null) {
                    return;
                }
                Set set = (Set) this.c.get(s84VarC);
                vh0 vh0Var2 = this.e;
                if (vh0Var2 != null) {
                    synchronized (vh0Var2.b) {
                        z = vh0Var2.e;
                    }
                    if (z != 2) {
                        it = set.iterator();
                        while (it.hasNext()) {
                            p84Var2 = (p84) this.b.get((sy) it.next());
                            p84Var2.getClass();
                            if (!p84Var2.equals(p84Var) && !p84Var2.i().isEmpty()) {
                                synchronized (p84Var2.X) {
                                }
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                        }
                    }
                    throw th;
                }
                it = set.iterator();
                while (it.hasNext()) {
                    p84Var2 = (p84) this.b.get((sy) it.next());
                    p84Var2.getClass();
                    if (!p84Var2.equals(p84Var)) {
                        synchronized (p84Var2.X) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                    }
                }
                try {
                    p84Var.d(xy0Var);
                    if (((ComponentActivity) d94VarF).X.i.compareTo(o84.f0) < 0) {
                        z2 = false;
                    }
                    if (z2) {
                        g(d94VarF);
                    }
                } catch (nl0 e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p84 b(ScannerActivity scannerActivity, tl0 tl0Var, dm6 dm6Var) {
        synchronized (this.a) {
            try {
                mb6.o(this.b.get(new sy(System.identityHashCode(scannerActivity), tl0Var.f0)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                p84 p84Var = new p84(scannerActivity, tl0Var, dm6Var);
                if (((ArrayList) tl0Var.A()).isEmpty()) {
                    p84Var.t();
                }
                if (scannerActivity.X.i == o84.X) {
                    return p84Var;
                }
                f(p84Var);
                return p84Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s84 c(d94 d94Var) {
        synchronized (this.a) {
            try {
                for (s84 s84Var : this.c.keySet()) {
                    if (d94Var.equals(s84Var.Y)) {
                        return s84Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(d94 d94Var) {
        synchronized (this.a) {
            try {
                s84 s84VarC = c(d94Var);
                if (s84VarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(s84VarC)).iterator();
                while (it.hasNext()) {
                    p84 p84Var = (p84) this.b.get((sy) it.next());
                    p84Var.getClass();
                    if (!p84Var.i().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(d94 d94Var) {
        HashMap map;
        b7 b7Var;
        s84 s84VarC = c(d94Var);
        if (s84VarC == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.c.get(s84VarC);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.b;
            if (!zHasNext) {
                break;
            }
            sy syVar = (sy) it.next();
            p84 p84Var = (p84) map.get(syVar);
            if (p84Var != null) {
                tl0 tl0Var = p84Var.Z;
                if (tl0Var.X.X.m() || ((b7Var = tl0Var.Y) != null && b7Var.X.m())) {
                    hashSet.add(syVar);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        hashSet.size();
        hi5.z0("LifecycleCameraRepository");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            p84 p84Var2 = (p84) map.get((sy) it2.next());
            Objects.requireNonNull(p84Var2);
            k(p84Var2);
        }
    }

    public final void f(p84 p84Var) {
        synchronized (this.a) {
            try {
                d94 d94VarF = p84Var.f();
                sy syVar = new sy(System.identityHashCode(d94VarF), p84Var.Z.f0);
                s84 s84VarC = c(d94VarF);
                Set hashSet = s84VarC != null ? (Set) this.c.get(s84VarC) : new HashSet();
                hashSet.add(syVar);
                this.b.put(syVar, p84Var);
                if (s84VarC == null) {
                    s84 s84Var = new s84(d94VarF, this);
                    this.c.put(s84Var, hashSet);
                    ((ComponentActivity) d94VarF).X.a(s84Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003a A[Catch: all -> 0x000b, TryCatch #1 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000d, B:12:0x0015, B:28:0x0047, B:29:0x004a, B:13:0x001b, B:15:0x001f, B:16:0x0021, B:18:0x0024, B:23:0x002a, B:24:0x002b, B:25:0x002c, B:27:0x003a, B:17:0x0022), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(d94 d94Var) {
        d94 d94Var2;
        boolean z;
        synchronized (this.a) {
            try {
                if (d(d94Var)) {
                    if (this.d.isEmpty()) {
                        this.d.push(d94Var);
                    } else {
                        vh0 vh0Var = this.e;
                        if (vh0Var != null) {
                            synchronized (vh0Var.b) {
                                z = vh0Var.e;
                            }
                            if (z != 2) {
                                d94Var2 = (d94) this.d.peek();
                                if (!d94Var.equals(d94Var2)) {
                                    i(d94Var2);
                                    this.d.remove(d94Var);
                                    this.d.push(d94Var);
                                }
                            }
                        } else {
                            d94Var2 = (d94) this.d.peek();
                            if (!d94Var.equals(d94Var2)) {
                                i(d94Var2);
                                this.d.remove(d94Var);
                                this.d.push(d94Var);
                            }
                        }
                    }
                    m(d94Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(d94 d94Var) {
        synchronized (this.a) {
            try {
                this.d.remove(d94Var);
                i(d94Var);
                if (!this.d.isEmpty()) {
                    m((d94) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(d94 d94Var) {
        synchronized (this.a) {
            try {
                s84 s84VarC = c(d94Var);
                if (s84VarC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(s84VarC)).iterator();
                while (it.hasNext()) {
                    p84 p84Var = (p84) this.b.get((sy) it.next());
                    p84Var.getClass();
                    p84Var.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(HashSet hashSet) {
        synchronized (this.a) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    p84 p84Var = (p84) this.b.get((sy) it.next());
                    if (p84Var != null) {
                        p84Var.u();
                        h(p84Var.f());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(p84 p84Var) {
        synchronized (this.a) {
            try {
                d94 d94VarF = p84Var.f();
                sy syVar = new sy(System.identityHashCode(d94VarF), p84Var.Z.f0);
                this.b.remove(syVar);
                HashSet hashSet = new HashSet();
                for (s84 s84Var : this.c.keySet()) {
                    if (d94VarF.equals(s84Var.Y)) {
                        Set set = (Set) this.c.get(s84Var);
                        set.remove(syVar);
                        if (set.isEmpty()) {
                            hashSet.add(s84Var.Y);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((d94) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(d94 d94Var) {
        synchronized (this.a) {
            try {
                s84 s84VarC = c(d94Var);
                if (s84VarC == null) {
                    return;
                }
                h(d94Var);
                Iterator it = ((Set) this.c.get(s84VarC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((sy) it.next());
                }
                this.c.remove(s84VarC);
                s84VarC.Y.getX().f(s84VarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(d94 d94Var) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(d94Var))).iterator();
                while (it.hasNext()) {
                    p84 p84Var = (p84) this.b.get((sy) it.next());
                    p84Var.getClass();
                    if (!p84Var.i().isEmpty()) {
                        p84Var.v();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

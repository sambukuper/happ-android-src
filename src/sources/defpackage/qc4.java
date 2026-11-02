package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc4 {
    public static final Object k = new Object();
    public final Object a;
    public final yu6 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final xb j;

    public qc4() {
        this.a = new Object();
        this.b = new yu6();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new xb(this, (byte) 17);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ys.y().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        bt.i(pc6.p("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(pc4 pc4Var) {
        if (pc4Var.Y) {
            if (!pc4Var.d()) {
                pc4Var.a(false);
                return;
            }
            int i = pc4Var.Z;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            pc4Var.Z = i2;
            pc4Var.X.a(this.e);
        }
    }

    public final void c(pc4 pc4Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (pc4Var != null) {
                b(pc4Var);
                pc4Var = null;
            } else {
                yu6 yu6Var = this.b;
                wu6 wu6Var = new wu6(yu6Var);
                yu6Var.Z.put(wu6Var, Boolean.FALSE);
                while (wu6Var.hasNext()) {
                    b((pc4) ((Map.Entry) wu6Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(BaseActivity baseActivity, v85 v85Var) {
        a("observe");
        g94 g94Var = baseActivity.X;
        if (g94Var.i == o84.X) {
            return;
        }
        oc4 oc4Var = new oc4(this, baseActivity, v85Var);
        pc4 pc4Var = (pc4) this.b.a(v85Var, oc4Var);
        if (pc4Var != null && !pc4Var.c(baseActivity)) {
            bt.q("Cannot add the same observer with different lifecycles");
        } else {
            if (pc4Var != null) {
                return;
            }
            g94Var.a(oc4Var);
        }
    }

    public final void f(v85 v85Var) {
        a("observeForever");
        nc4 nc4Var = new nc4(this, v85Var);
        pc4 pc4Var = (pc4) this.b.a(v85Var, nc4Var);
        if (pc4Var instanceof oc4) {
            bt.q("Cannot add the same observer with different lifecycles");
        } else {
            if (pc4Var != null) {
                return;
            }
            nc4Var.a(true);
        }
    }

    public final void i(v85 v85Var) {
        a("removeObserver");
        yu6 yu6Var = this.b;
        WeakHashMap weakHashMap = yu6Var.Z;
        vu6 vu6Var = yu6Var.X;
        while (vu6Var != null && !vu6Var.X.equals(v85Var)) {
            vu6Var = vu6Var.Z;
        }
        Object obj = null;
        if (vu6Var != null) {
            yu6Var.f0--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((xu6) it.next()).a(vu6Var);
                }
            }
            vu6 vu6Var2 = vu6Var.f0;
            vu6 vu6Var3 = vu6Var.Z;
            if (vu6Var2 != null) {
                vu6Var2.Z = vu6Var3;
            } else {
                yu6Var.X = vu6Var3;
            }
            vu6 vu6Var4 = vu6Var.Z;
            if (vu6Var4 != null) {
                vu6Var4.f0 = vu6Var2;
            } else {
                yu6Var.Y = vu6Var2;
            }
            vu6Var.Z = null;
            vu6Var.f0 = null;
            obj = vu6Var.Y;
        }
        pc4 pc4Var = (pc4) obj;
        if (pc4Var == null) {
            return;
        }
        pc4Var.b();
        pc4Var.a(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void g() {
    }

    public void h() {
    }

    public qc4(Object obj) {
        this.a = new Object();
        this.b = new yu6();
        this.c = 0;
        this.f = k;
        this.j = new xb(this, (byte) 17);
        this.e = obj;
        this.g = 0;
    }
}

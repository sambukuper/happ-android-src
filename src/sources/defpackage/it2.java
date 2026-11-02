package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class it2 {
    public final ni0 a;
    public final ht2 b;
    public final List c;
    public final oh7 d;

    public it2(s98 s98Var, ni0 ni0Var, hi0 hi0Var, kc4 kc4Var, List list, jg0 jg0Var) {
        s98Var.getClass();
        kc4Var.getClass();
        list.getClass();
        jg0Var.getClass();
        this.a = ni0Var;
        this.c = hi0Var.k;
        Map map = hi0Var.i;
        Map map2 = hi0Var.l;
        xu4 xu4Var = sj0.c;
        Object obj = map.get(xu4Var);
        Boolean bool = Boolean.TRUE;
        if (dh3.f(obj, bool) || dh3.f(map2.get(xu4Var), bool)) {
            Objects.toString(xu4Var);
        }
        ji0 ji0Var = hi0Var.n;
        jg0Var.b.getClass();
        r75 r75Var = ji0Var.b;
        Set set = (Set) jg0.c.get(Build.MANUFACTURER);
        int iMax = Math.max((set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10), r75Var.Y);
        an0 an0Var = iMax != 0 ? new an0(iMax) : null;
        ht2 ht2Var = new ht2(ni0Var, map, map2, wv0.H0(list, i21.M(an0Var)), eu.q0(new Object[]{kc4Var, an0Var}), s98Var.a, s98Var.h);
        this.b = ht2Var;
        if (an0Var != null) {
            if (an0Var.Z != null) {
                bt.i("GraphLoop has already been set!");
                throw null;
            }
            an0Var.Z = ht2Var;
            ht2Var.U(false);
            ht2Var.toString();
        }
        this.d = ph7.a(ot2.b);
    }

    public final void a(mt2 mt2Var) {
        oh7 oh7Var;
        Object value;
        rt2 rt2Var;
        toString();
        mt2Var.toString();
        do {
            oh7Var = this.d;
            value = oh7Var.getValue();
            rt2Var = (rt2) value;
        } while (!oh7Var.k(value, ((rt2Var instanceof pt2) || (rt2Var instanceof ot2)) ? ot2.b : mt2Var));
        for (st2 st2Var : this.c) {
            st2Var.getClass();
            st2Var.a.b(st2Var.a(), mt2Var);
        }
    }

    public final void b() {
        toString();
        oh7 oh7Var = this.d;
        ot2 ot2Var = ot2.b;
        oh7Var.m(ot2Var);
        this.b.X(null);
        for (st2 st2Var : this.c) {
            st2Var.a.b(st2Var.a(), ot2Var);
        }
    }

    public final void c(ne6 ne6Var) {
        ht2 ht2Var = this.b;
        synchronized (ht2Var.j0) {
            try {
                ne6 ne6Var2 = ht2Var.m0;
                ht2Var.m0 = ne6Var;
                if (ne6Var2 != null || ne6Var != null) {
                    y5 y5Var = ht2Var.i0;
                    if (ne6Var != null) {
                        y5Var.g0(new zs2(ne6Var));
                    } else {
                        y5Var.g0(vs2.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ne6Var == null) {
            int size = ht2Var.f0.size();
            for (int i = 0; i < size; i++) {
                ((dt2) ht2Var.f0.get(i)).c();
            }
        }
    }

    public final void d(LinkedHashMap linkedHashMap) {
        ht2 ht2Var = this.b;
        synchronized (ht2Var.j0) {
            ht2Var.i0.g0(new ys2(ht2Var.n0, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.a + ')';
    }
}

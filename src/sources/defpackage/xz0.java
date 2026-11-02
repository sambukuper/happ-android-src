package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xz0 {
    public final View a;
    public boolean b;
    public m01 c;
    public d94 d;
    public yv6 e;
    public fx8 f;
    public final j73 g;
    public final pf6 h;
    public final Configuration i;
    public final y05 j;
    public final ra k;
    public final bi l;
    public final dq m;
    public final iu0 n;
    public final ei2 o;
    public final y05 p;
    public final ez2 q;
    public final ei r;
    public final p34 s;
    public final y74 t;
    public final vm0 u;
    public int v;
    public final o7 w;
    public ug x;
    public final wz0 y;

    public xz0(xz0 xz0Var, View view, m01 m01Var, d94 d94Var, yv6 yv6Var, fx8 fx8Var) {
        j73 j73Var;
        Configuration configuration;
        y05 y05VarH;
        ra raVar;
        bi biVar;
        dq dqVar;
        iu0 kbVar;
        ei2 raVar2;
        y05 rh5Var;
        ei eiVar;
        boolean zF = dh3.f(xz0Var != null ? xz0Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = m01Var;
        this.d = d94Var;
        this.e = yv6Var;
        this.f = fx8Var;
        if (zF) {
            xz0Var.getClass();
            j73Var = xz0Var.g;
        } else {
            j73Var = new j73();
        }
        this.g = j73Var;
        this.h = xz0Var != null ? xz0Var.h : new pf6();
        if (zF) {
            xz0Var.getClass();
            configuration = xz0Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zF) {
            xz0Var.getClass();
            y05VarH = xz0Var.j;
        } else {
            y05VarH = z51.H(new Configuration(configuration));
        }
        this.j = y05VarH;
        if (zF) {
            xz0Var.getClass();
            raVar = xz0Var.k;
        } else {
            Context context = view.getContext();
            raVar = new ra((byte) 0, false);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = raVar;
        if (zF) {
            xz0Var.getClass();
            biVar = xz0Var.l;
        } else {
            biVar = new bi(view.getContext());
        }
        this.l = biVar;
        if (zF) {
            xz0Var.getClass();
            dqVar = xz0Var.m;
        } else {
            dqVar = new dq((Object) view.getContext(), (byte) 8);
        }
        this.m = dqVar;
        if (zF) {
            xz0Var.getClass();
            kbVar = xz0Var.n;
        } else {
            kbVar = new kb(dqVar);
        }
        this.n = kbVar;
        if (zF) {
            xz0Var.getClass();
            raVar2 = xz0Var.o;
        } else {
            view.getContext();
            raVar2 = new ra((byte) 1, false);
        }
        this.o = raVar2;
        if (zF) {
            xz0Var.getClass();
            rh5Var = xz0Var.p;
        } else {
            rh5Var = new rh5(w45.C(view.getContext()), lh4.x0);
        }
        this.p = rh5Var;
        this.q = view == (xz0Var != null ? xz0Var.a : null) ? xz0Var.q : new so5(view);
        if (zF) {
            xz0Var.getClass();
            eiVar = xz0Var.r;
        } else {
            eiVar = new ei(ViewConfiguration.get(view.getContext()));
        }
        this.r = eiVar;
        this.s = xz0Var != null ? xz0Var.s : new p34();
        this.t = new y74();
        this.u = xz0Var != null ? xz0Var.u : new vm0();
        this.w = new o7(this, (byte) 22);
        this.y = new wz0(this);
    }

    public final void a(AndroidComposeView androidComposeView, zy0 zy0Var, lp2 lp2Var, int i) {
        lp2Var.X(123858079);
        int i2 = (lp2Var.h(androidComposeView) ? 4 : 2) | i | (lp2Var.h(zy0Var) ? 32 : 16) | (lp2Var.h(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(g46.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof qv3) && !(tag instanceof aw3))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(g46.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof qv3) || (tag2 instanceof aw3))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(lp2Var.v());
                lp2Var.q = true;
                lp2Var.C = true;
                lp2Var.c.b();
                lp2Var.H.b();
                bc7 bc7Var = lp2Var.I;
                yb7 yb7Var = bc7Var.a;
                bc7Var.e = yb7Var.l0;
                bc7Var.f = yb7Var.m0;
            }
            boolean zF = lp2Var.f(androidComposeView.getView());
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (zF || objK == beVar) {
                androidComposeView.getView();
                objK = new zx8();
                lp2Var.g0(objK);
            }
            zx8 zx8Var = (zx8) objK;
            t06 t06VarA = rd4.a.a(d());
            q06 q06Var = vd4.a;
            g();
            yv6 yv6Var = this.e;
            yv6Var.getClass();
            t06 t06VarA2 = q06Var.a(yv6Var);
            t06 t06VarA3 = pc.d.a(this.g);
            t06 t06VarA4 = pc.e.a(this.h);
            ox1 ox1Var = y01.v;
            boolean zH = lp2Var.h(this);
            Object objK2 = lp2Var.K();
            if (zH || objK2 == beVar) {
                objK2 = new y0((Object) this, (byte) 18);
                lp2Var.g0(objK2);
            }
            t06 t06VarC = ox1Var.c((gn2) objK2);
            t06 t06VarA5 = pc.b.a(androidComposeView.getContext());
            t06 t06VarA6 = re3.a.a(set);
            t06 t06VarA7 = pc.a.a(androidComposeView.getConfiguration());
            ox1 ox1Var2 = mv6.a;
            boolean zH2 = lp2Var.h(androidComposeView);
            Object objK3 = lp2Var.K();
            if (zH2 || objK3 == beVar) {
                objK3 = new lb(androidComposeView, (byte) 3);
                lp2Var.g0(objK3);
            }
            t06 t06VarC2 = ox1Var2.c((gn2) objK3);
            t06 t06VarA8 = pc.f.a(androidComposeView.getView());
            ox1 ox1Var3 = y01.x;
            boolean zH3 = lp2Var.h(androidComposeView);
            Object objK4 = lp2Var.K();
            if (zH3 || objK4 == beVar) {
                objK4 = new lb(androidComposeView, (byte) 4);
                lp2Var.g0(objK4);
            }
            mb6.b(new t06[]{t06VarA, t06VarA2, t06VarA3, t06VarA4, t06VarC, t06VarA5, t06VarA6, t06VarA7, t06VarC2, t06VarA8, ox1Var3.c((gn2) objK4), y01.t.a(androidComposeView.getViewConfiguration()), z03.a.a(zx8Var)}, jm4.U(1317454175, new vz0(androidComposeView, this, zy0Var), lp2Var), lp2Var, 56);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new vz0(this, androidComposeView, zy0Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            wz0 wz0Var = this.y;
            context.unregisterComponentCallbacks(wz0Var);
            y74 y74Var = this.t;
            if (y74Var.b == null) {
                y74Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(wz0Var);
        }
    }

    public final m01 c() {
        g();
        m01 m01Var = this.c;
        m01Var.getClass();
        return m01Var;
    }

    public final d94 d() {
        g();
        d94 d94Var = this.d;
        d94Var.getClass();
        return d94Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            wz0 wz0Var = this.y;
            context.registerComponentCallbacks(wz0Var);
            f(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            y74 y74Var = this.t;
            y74Var.c.setValue(Boolean.valueOf(zHasWindowFocus));
            rh5 rh5Var = y74Var.b;
            o7 o7Var = this.w;
            if (rh5Var == null) {
                y74Var.a = o7Var;
            }
            if (rh5Var != null) {
                rh5Var.setValue(o7Var.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(wz0Var);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                h73 h73Var = (h73) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (h73Var == null || Configuration.needNewResources(iUpdateFrom, h73Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            pf6 pf6Var = this.h;
            synchronized (pf6Var) {
                pf6Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(w45.C(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                y74 y74Var = this.t;
                o7 o7Var = this.w;
                rh5 rh5Var = y74Var.b;
                if (rh5Var != null) {
                    rh5Var.setValue(o7Var.invoke());
                }
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        m01 m01Var = this.c;
        View view = this.a;
        if (m01Var == null) {
            m01 m01VarA = q29.a(view);
            if (m01VarA == null) {
                Object parent = view.getParent();
                while (m01VarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    m01VarA = q29.a(view2);
                    parent = ts7.d(view2);
                }
            }
            if (m01VarA == null) {
                m01VarA = q29.b(view);
            }
            this.c = m01VarA;
        }
        if (this.d == null) {
            d94 d94VarB = us7.b(view);
            if (d94VarB == null) {
                bt.i("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = d94VarB;
        }
        if (this.e == null) {
            yv6 yv6VarD = ys7.d(view);
            if (yv6VarD == null) {
                bt.i("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = yv6VarD;
        }
        if (this.f == null) {
            this.f = gs8.j(view);
        }
    }
}

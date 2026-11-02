package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c29 {
    public static final WeakHashMap w = new WeakHashMap();
    public final hi a;
    public final hi b;
    public final hi c;
    public final hi d;
    public final hi e;
    public final hi f;
    public final hi g;
    public final hi h;
    public final hi i;
    public final kt8 j;
    public final rh5 k;
    public final an8 l;
    public final kt8 m;
    public final kt8 n;
    public final kt8 o;
    public final kt8 p;
    public final kt8 q;
    public final kt8 r;
    public final kt8 s;
    public final boolean t;
    public int u;
    public final ke3 v;

    public c29(View view) {
        hi hiVar = new hi(4, "captionBar");
        this.a = hiVar;
        hi hiVar2 = new hi(128, "displayCutout");
        this.b = hiVar2;
        hi hiVar3 = new hi(8, "ime");
        this.c = hiVar3;
        hi hiVar4 = new hi(32, "mandatorySystemGestures");
        this.d = hiVar4;
        hi hiVar5 = new hi(2, "navigationBars");
        this.e = hiVar5;
        hi hiVar6 = new hi(1, "statusBars");
        this.f = hiVar6;
        hi hiVar7 = new hi(519, "systemBars");
        this.g = hiVar7;
        hi hiVar8 = new hi(16, "systemGestures");
        this.h = hiVar8;
        hi hiVar9 = new hi(64, "tappableElement");
        this.i = hiVar9;
        kt8 kt8Var = new kt8(new pe3(0, 0, 0, 0), "waterfall");
        this.j = kt8Var;
        this.k = z51.H(null);
        an8 an8Var = new an8(new an8(hiVar7, hiVar3), hiVar2);
        this.l = an8Var;
        new an8(an8Var, new an8(new an8(new an8(hiVar9, hiVar4), hiVar8), kt8Var));
        this.m = hw7.j(4, "captionBarIgnoringVisibility");
        this.n = hw7.j(2, "navigationBarsIgnoringVisibility");
        this.o = hw7.j(1, "statusBarsIgnoringVisibility");
        this.p = hw7.j(519, "systemBarsIgnoringVisibility");
        this.q = hw7.j(64, "tappableElementIgnoringVisibility");
        this.r = new kt8(new pe3(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new kt8(new pe3(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(g46.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new ke3(this);
        WeakHashMap weakHashMap = cw8.a;
        w19 w19VarA = vv8.a(view);
        if (w19VarA != null) {
            t19 t19Var = w19VarA.a;
            hiVar.f(t19Var.t(4));
            hiVar2.f(t19Var.t(128));
            hiVar3.f(t19Var.t(8));
            hiVar4.f(t19Var.t(32));
            hiVar5.f(t19Var.t(2));
            hiVar6.f(t19Var.t(1));
            hiVar7.f(t19Var.t(519));
            hiVar8.f(t19Var.t(16));
            hiVar9.f(t19Var.t(64));
        }
    }

    public static void b(c29 c29Var, w19 w19Var) {
        boolean z = false;
        c29Var.a.g(w19Var, 0);
        c29Var.c.g(w19Var, 0);
        c29Var.b.g(w19Var, 0);
        c29Var.e.g(w19Var, 0);
        c29Var.f.g(w19Var, 0);
        c29Var.g.g(w19Var, 0);
        c29Var.h.g(w19Var, 0);
        c29Var.i.g(w19Var, 0);
        c29Var.d.g(w19Var, 0);
        c29Var.m.f(ry7.i(w19Var.a.i(4)));
        c29Var.n.f(ry7.i(w19Var.a.i(2)));
        c29Var.o.f(ry7.i(w19Var.a.i(1)));
        c29Var.p.f(ry7.i(w19Var.a.i(519)));
        c29Var.q.f(ry7.i(w19Var.a.i(64)));
        up1 up1VarG = w19Var.a.g();
        c29Var.j.f(ry7.i(up1VarG != null ? up1VarG.a() : fe3.e));
        lf lfVar = null;
        if (up1VarG != null) {
            Path pathJ = Build.VERSION.SDK_INT >= 31 ? tc.j(up1VarG.a) : null;
            if (pathJ != null) {
                lfVar = new lf(pathJ);
            }
        }
        c29Var.k.setValue(lfVar);
        synchronized (kd7.c) {
            t05 t05Var = kd7.j.h;
            if (t05Var != null && t05Var.h()) {
                z = true;
            }
        }
        if (z) {
            kd7.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            ke3 ke3Var = this.v;
            ke3Var.f0 = false;
            ke3Var.g0 = false;
            ke3Var.h0 = null;
            WeakHashMap weakHashMap = cw8.a;
            uv8.c(view, ke3Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(ke3Var);
            c19.a(view, ke3Var);
        }
        this.u++;
    }
}

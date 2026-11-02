package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q29 {
    public static final s05 a;

    static {
        long[] jArr = uw6.a;
        a = new s05();
    }

    public static final m01 a(View view) {
        Object tag = view.getTag(g46.androidx_compose_ui_view_composition_context);
        if (tag instanceof m01) {
            return (m01) tag;
        }
        return null;
    }

    public static final p86 b(View view) {
        s61 s61Var;
        ai aiVar;
        if (!view.isAttachedToWindow()) {
            wc3.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objD = ts7.d(view);
        while (objD instanceof View) {
            View view2 = (View) objD;
            if (view2.getId() == 16908290) {
                break;
            }
            objD = view2.getParent();
            view = view2;
        }
        m01 m01VarA = a(view);
        q51 q51Var = null;
        if (m01VarA != null) {
            if (m01VarA instanceof p86) {
                return (p86) m01VarA;
            }
            bt.i("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((m29) n29.a.get()).getClass();
        s61 s61Var2 = b02.X;
        vz7 vz7Var = yh.o0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            s61Var = (s61) yh.o0.getValue();
        } else {
            s61Var = (s61) yh.p0.get();
            if (s61Var == null) {
                bt.i("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        s61 s61VarB0 = s61Var.B0(s61Var2);
        ai aiVar2 = (ai) s61VarB0.H0(qe4.f0);
        if (aiVar2 != null) {
            aiVar = new ai(aiVar2);
            sa2 sa2Var = (sa2) aiVar.Z;
            synchronized (sa2Var.a) {
                sa2Var.b = false;
            }
        } else {
            aiVar = null;
        }
        ea6 ea6Var = new ea6();
        s61 fy4Var = (ey4) s61VarB0.H0(lh4.h0);
        if (fy4Var == null) {
            fy4Var = new fy4(view.getContext().getApplicationContext());
            ea6Var.X = fy4Var;
        }
        if (aiVar != null) {
            s61Var2 = aiVar;
        }
        s61 s61VarB1 = s61VarB0.B0(s61Var2).B0(fy4Var);
        p86 p86Var = new p86(s61VarB1);
        synchronized (p86Var.c) {
            p86Var.t = true;
        }
        m51 m51VarC = gv3.c(s61VarB1);
        d94 d94VarB = us7.b(view);
        g94 x = d94VarB != null ? d94VarB.getH0() : null;
        if (x == null) {
            wc3.c("ViewTreeLifecycleOwner not found from " + view);
            b61.n();
            return null;
        }
        view.addOnAttachStateChangeListener(new al2(view, p86Var, (byte) 2));
        x.a(new p29(m51VarC, aiVar, p86Var, ea6Var));
        view.setTag(g46.androidx_compose_ui_view_composition_context, p86Var);
        cs2 cs2Var = cs2.X;
        Handler handler = view.getHandler();
        int i = iv2.a;
        view.addOnAttachStateChangeListener(new ge(w51.G(cs2Var, new hv2(handler, "windowRecomposer cleanup", false).h0, null, new t17(p86Var, view, q51Var, (byte) 21), 2), (byte) 8));
        return p86Var;
    }
}

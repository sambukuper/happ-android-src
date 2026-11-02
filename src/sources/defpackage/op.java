package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class op implements p95, hu4 {
    public final /* synthetic */ wp X;

    public /* synthetic */ op(wp wpVar) {
        this.X = wpVar;
    }

    @Override // defpackage.p95
    public w19 C(View view, w19 w19Var) {
        k19 e19Var;
        w19 w19VarB = w19Var;
        int iD = w19VarB.d();
        int iD2 = w19VarB.d();
        wp wpVar = this.X;
        ActionBarContextView actionBarContextView = wpVar.w0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wpVar.w0.getLayoutParams();
            boolean z = false;
            if (wpVar.w0.isShown()) {
                if (wpVar.c1 == null) {
                    wpVar.c1 = new Rect();
                    wpVar.d1 = new Rect();
                }
                Rect rect = wpVar.c1;
                Rect rect2 = wpVar.d1;
                rect.set(w19VarB.b(), w19VarB.d(), w19VarB.c(), w19VarB.a());
                fe3 fe3VarH = w19VarB.a.h(2);
                ViewGroup viewGroup = wpVar.B0;
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = cy8.a;
                    wa.b(rect, rect2, viewGroup);
                } else {
                    if (!cy8.a) {
                        cy8.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            cy8.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                cy8.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = cy8.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                fe3 fe3VarC = fe3.c(Math.max(0, fe3VarH.a - rect2.left), Math.max(0, fe3VarH.b - rect2.top), Math.max(0, fe3VarH.c - rect2.right), Math.max(0, fe3VarH.d - rect2.bottom));
                int i = fe3VarC.c;
                int i2 = marginLayoutParams.leftMargin;
                int i3 = fe3VarC.a;
                if (i2 == i3 && marginLayoutParams.rightMargin == i) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i;
                }
                ActionBarContextView actionBarContextView2 = wpVar.w0;
                int i4 = rect.left - i3;
                int i5 = rect.top;
                int i6 = rect.right - i;
                actionBarContextView2.z0 = i4;
                actionBarContextView2.A0 = i5;
                actionBarContextView2.B0 = i6;
                actionBarContextView2.k();
                if (!wpVar.H0 && rect.top > 0) {
                    iD2 = 0;
                }
                z = z2;
            }
            if (z) {
                wpVar.w0.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = w19VarB.b();
            int iC = w19VarB.c();
            int iA = w19VarB.a();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 36) {
                e19Var = new j19(w19VarB);
            } else if (i7 >= 35) {
                e19Var = new i19(w19VarB);
            } else if (i7 >= 34) {
                e19Var = new h19(w19VarB);
            } else if (i7 >= 31) {
                e19Var = new g19(w19VarB);
            } else if (i7 >= 30) {
                e19Var = new f19(w19VarB);
            } else {
                e19Var = i7 >= 29 ? new e19(w19VarB) : new d19(w19VarB);
            }
            e19Var.h(fe3.c(iB, iD2, iC, iA));
            w19VarB = e19Var.b();
        }
        WeakHashMap weakHashMap = cw8.a;
        WindowInsets windowInsetsF = w19VarB.f();
        if (windowInsetsF == null) {
            return w19VarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsF) ? w19.g(view, windowInsetsOnApplyWindowInsets) : w19VarB;
    }

    @Override // defpackage.hu4
    public boolean N(nt4 nt4Var) {
        Window.Callback callback = this.X.n0.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, nt4Var);
        return true;
    }

    @Override // defpackage.hu4
    public void b(nt4 nt4Var, boolean z) {
        this.X.q(nt4Var);
    }
}

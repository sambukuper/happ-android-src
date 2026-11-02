package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.gn7;
import defpackage.iu4;
import defpackage.nt4;
import defpackage.qv0;
import defpackage.st4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements iu4 {
    public nt4 X;
    public st4 Y;
    public final /* synthetic */ Toolbar Z;

    public h(Toolbar toolbar) {
        this.Z = toolbar;
    }

    @Override // defpackage.iu4
    public final boolean c(gn7 gn7Var) {
        return false;
    }

    @Override // defpackage.iu4
    public final boolean d() {
        return false;
    }

    @Override // defpackage.iu4
    public final boolean e(st4 st4Var) {
        Toolbar toolbar = this.Z;
        KeyEvent.Callback callback = toolbar.n0;
        if (callback instanceof qv0) {
            ((qv0) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n0);
        toolbar.removeView(toolbar.m0);
        toolbar.n0 = null;
        ArrayList arrayList = toolbar.J0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.Y = null;
        toolbar.requestLayout();
        st4Var.C = false;
        st4Var.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.iu4
    public final boolean h(st4 st4Var) {
        Toolbar toolbar = this.Z;
        toolbar.c();
        ViewParent parent = toolbar.m0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m0);
            }
            toolbar.addView(toolbar.m0);
        }
        View actionView = st4Var.getActionView();
        toolbar.n0 = actionView;
        this.Y = st4Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n0);
            }
            Toolbar.LayoutParams layoutParamsH = Toolbar.h();
            layoutParamsH.a = (toolbar.s0 & 112) | 8388611;
            layoutParamsH.b = (byte) 2;
            toolbar.n0.setLayoutParams(layoutParamsH);
            toolbar.addView(toolbar.n0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Toolbar.LayoutParams) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f0) {
                toolbar.removeViewAt(childCount);
                toolbar.J0.add(childAt);
            }
        }
        toolbar.requestLayout();
        st4Var.C = true;
        st4Var.n.p(false);
        KeyEvent.Callback callback = toolbar.n0;
        if (callback instanceof qv0) {
            ((qv0) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.iu4
    public final void i() {
        if (this.Y != null) {
            nt4 nt4Var = this.X;
            if (nt4Var != null) {
                int size = nt4Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.X.getItem(i) == this.Y) {
                        return;
                    }
                }
            }
            e(this.Y);
        }
    }

    @Override // defpackage.iu4
    public final void k(Context context, nt4 nt4Var) {
        st4 st4Var;
        nt4 nt4Var2 = this.X;
        if (nt4Var2 != null && (st4Var = this.Y) != null) {
            nt4Var2.d(st4Var);
        }
        this.X = nt4Var;
    }

    @Override // defpackage.iu4
    public final void b(nt4 nt4Var, boolean z) {
    }
}

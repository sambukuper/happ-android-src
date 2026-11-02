package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import defpackage.bt;
import defpackage.c82;
import defpackage.e03;
import defpackage.f03;
import defpackage.g03;
import defpackage.ge;
import defpackage.ie2;
import defpackage.jm4;
import defpackage.p61;
import defpackage.rk;
import defpackage.u26;
import defpackage.u70;
import defpackage.z39;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int o = u26.motionDurationLong2;
    public static final int p = u26.motionDurationMedium4;
    public static final int q = u26.motionEasingEmphasizedInterpolator;
    public jm4 a;
    public AccessibilityManager b;
    public e03 c;
    public final boolean d;
    public final LinkedHashSet e;
    public int f;
    public int g;
    public TimeInterpolator h;
    public TimeInterpolator i;
    public int j;
    public byte k;
    public ViewPropertyAnimator l;
    public int m;
    public int n;

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = (byte) 2;
        this.m = 0;
        this.n = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        if (accessibilityManager != null && this.c == null) {
            e03 e03Var = new e03(this, view, (byte) 1);
            this.c = e03Var;
            accessibilityManager.addTouchExplorationStateChangeListener(e03Var);
            view.addOnAttachStateChangeListener(new ge(this, (byte) 5));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((b) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            v(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            v((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.j = this.a.F(view, marginLayoutParams);
        this.f = u70.g0(view.getContext(), o, 225);
        this.g = u70.g0(view.getContext(), p, 175);
        Context context = view.getContext();
        c82 c82Var = rk.d;
        int i3 = q;
        this.h = z39.D(context, i3, c82Var);
        this.i = z39.D(view.getContext(), i3, rk.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                w(view);
            }
        } else {
            if (this.k == 1) {
                return;
            }
            if (this.d && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.l;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            x(view, 1);
            this.l = this.a.H(view, this.j).setInterpolator(this.i).setDuration(this.g).setListener(new f03(this, view, (byte) 1));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean s(View view, int i, int i2) {
        return i == 2;
    }

    public final void v(int i) {
        jm4 jm4Var = this.a;
        if (jm4Var == null || jm4Var.G() != i) {
            if (i == 0) {
                this.a = new g03((byte) 2);
                return;
            }
            if (i == 1) {
                this.a = new g03((byte) 0);
            } else if (i == 2) {
                this.a = new g03((byte) 1);
            } else {
                bt.q(ie2.h("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void w(View view) {
        if (this.k == 2) {
            return;
        }
        x(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.l = this.a.H(view, 0).setInterpolator(this.h).setDuration(this.f).setListener(new f03(this, view, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(View view, int i) {
        this.k = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.m = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.n = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.m);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.n);
            }
        }
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
    }

    public HideViewOnScrollBehavior() {
        this.d = true;
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = (byte) 2;
        this.m = 0;
        this.n = 0;
    }
}

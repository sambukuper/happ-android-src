package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a4;
import defpackage.cw8;
import defpackage.jz7;
import defpackage.mw8;
import defpackage.wl6;
import defpackage.y45;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public mw8 a;
    public wl6 b;
    public boolean c;
    public boolean d;
    public byte e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final jz7 h = new jz7(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM = coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zM;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (zM) {
            mw8 mw8Var = this.a;
            if (mw8Var == null) {
                mw8Var = new mw8(coordinatorLayout.getContext(), coordinatorLayout, this.h);
                this.a = mw8Var;
            }
            if (!this.d && mw8Var.q(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            cw8.k(view, 1048576);
            cw8.i(view, 0);
            if (v(view)) {
                cw8.l(view, a4.m, null, new y45(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}

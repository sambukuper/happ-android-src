package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cb0;
import defpackage.cw8;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public cb0 a;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        cb0 cb0Var = this.a;
        if (cb0Var == null) {
            cb0Var = new cb0(view);
            this.a = cb0Var;
        }
        View view2 = (View) cb0Var.f0;
        cb0Var.Y = view2.getTop();
        cb0Var.Z = view2.getLeft();
        cb0 cb0Var2 = this.a;
        View view3 = (View) cb0Var2.f0;
        int top = 0 - (view3.getTop() - cb0Var2.Y);
        WeakHashMap weakHashMap = cw8.a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - cb0Var2.Z));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.o(view, i);
    }
}

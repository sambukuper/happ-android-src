package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    public int b;

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout$ScrollingViewBehavior.w(coordinatorLayout.j(view));
        coordinatorLayout.o(view, i);
    }
}

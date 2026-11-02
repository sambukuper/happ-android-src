package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.gr4;
import defpackage.rc6;
import defpackage.s46;
import defpackage.v56;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class RadialViewGroup extends ConstraintLayout {
    public final d v0;
    public int w0;
    public final gr4 x0;

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.material.timepicker.d] */
    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(s46.material_radial_view_group, this);
        gr4 gr4Var = new gr4();
        this.x0 = gr4Var;
        gr4Var.setShapeAppearanceModel(gr4Var.Y.a.e(new rc6(0.5f)));
        this.x0.t(ColorStateList.valueOf(-1));
        setBackground(this.x0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.RadialViewGroup, i, 0);
        this.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.RadialViewGroup_materialCircleRadius, 0);
        this.v0 = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.X.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            d dVar = this.v0;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            d dVar = this.v0;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x0.t(ColorStateList.valueOf(i));
    }
}

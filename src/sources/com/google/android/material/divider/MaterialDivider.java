package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.c98;
import defpackage.gr4;
import defpackage.j36;
import defpackage.mr4;
import defpackage.o56;
import defpackage.u26;
import defpackage.v56;
import defpackage.ys0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public static final int k0 = o56.Widget_MaterialComponents_MaterialDivider;
    public final gr4 f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        int i2 = k0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f0 = new gr4();
        TypedArray typedArrayD = c98.d(context2, attributeSet, v56.MaterialDivider, i, i2, new int[0]);
        this.g0 = typedArrayD.getDimensionPixelSize(v56.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(j36.material_divider_thickness));
        this.i0 = typedArrayD.getDimensionPixelOffset(v56.MaterialDivider_dividerInsetStart, 0);
        this.j0 = typedArrayD.getDimensionPixelOffset(v56.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(ys0.x(context2, typedArrayD, v56.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayD.recycle();
    }

    public int getDividerColor() {
        return this.h0;
    }

    public int getDividerInsetEnd() {
        return this.j0;
    }

    public int getDividerInsetStart() {
        return this.i0;
    }

    public int getDividerThickness() {
        return this.g0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.j0 : this.i0;
        if (z) {
            width = getWidth();
            i = this.i0;
        } else {
            width = getWidth();
            i = this.j0;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        gr4 gr4Var = this.f0;
        gr4Var.setBounds(i2, 0, i3, bottom);
        gr4Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.g0;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            this.f0.t(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.j0 = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.i0 = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.materialDividerStyle);
    }
}

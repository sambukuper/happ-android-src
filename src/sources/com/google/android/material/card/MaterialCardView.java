package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import defpackage.a77;
import defpackage.c98;
import defpackage.gr4;
import defpackage.i21;
import defpackage.mr4;
import defpackage.n77;
import defpackage.o56;
import defpackage.th7;
import defpackage.u26;
import defpackage.u70;
import defpackage.uf7;
import defpackage.v56;
import defpackage.w26;
import defpackage.w79;
import defpackage.xq4;
import defpackage.yn0;
import defpackage.ys0;
import defpackage.z39;
import defpackage.zq4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, n77 {
    public static final int[] p0 = {R.attr.state_checkable};
    public static final int[] q0 = {R.attr.state_checked};
    public static final int[] r0 = {u26.state_dragged};
    public static final int[] s0 = {R.attr.state_hovered};
    public static final int t0 = o56.Widget_MaterialComponents_CardView;
    public final zq4 l0;
    public final boolean m0;
    public boolean n0;
    public boolean o0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        th7 th7VarG;
        int i2 = t0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.n0 = false;
        this.o0 = false;
        this.m0 = true;
        TypedArray typedArrayD = c98.d(getContext(), attributeSet, v56.MaterialCardView, i, i2, new int[0]);
        zq4 zq4Var = new zq4(this, attributeSet, i);
        this.l0 = zq4Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        gr4 gr4Var = zq4Var.c;
        gr4Var.t(cardBackgroundColor);
        zq4Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        zq4Var.l();
        MaterialCardView materialCardView = zq4Var.a;
        ColorStateList colorStateListX = ys0.x(materialCardView.getContext(), typedArrayD, v56.MaterialCardView_strokeColor);
        zq4Var.o = colorStateListX;
        if (colorStateListX == null) {
            zq4Var.o = ColorStateList.valueOf(-1);
        }
        zq4Var.i = typedArrayD.getDimensionPixelSize(v56.MaterialCardView_strokeWidth, 0);
        boolean z = typedArrayD.getBoolean(v56.MaterialCardView_android_checkable, false);
        zq4Var.t = z;
        materialCardView.setLongClickable(z);
        zq4Var.m = ys0.x(materialCardView.getContext(), typedArrayD, v56.MaterialCardView_checkedIconTint);
        zq4Var.g(ys0.B(materialCardView.getContext(), typedArrayD, v56.MaterialCardView_checkedIcon));
        zq4Var.g = typedArrayD.getDimensionPixelSize(v56.MaterialCardView_checkedIconSize, 0);
        zq4Var.f = typedArrayD.getDimensionPixelSize(v56.MaterialCardView_checkedIconMargin, 0);
        zq4Var.h = typedArrayD.getInteger(v56.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListX2 = ys0.x(materialCardView.getContext(), typedArrayD, v56.MaterialCardView_rippleColor);
        zq4Var.l = colorStateListX2;
        if (colorStateListX2 == null) {
            zq4Var.l = ColorStateList.valueOf(yn0.b0(materialCardView.getContext(), u70.j0(materialCardView, w26.colorControlHighlight)));
        }
        ColorStateList colorStateListX3 = ys0.x(materialCardView.getContext(), typedArrayD, v56.MaterialCardView_cardForegroundColor);
        colorStateListX3 = colorStateListX3 == null ? ColorStateList.valueOf(0) : colorStateListX3;
        gr4 gr4Var2 = zq4Var.d;
        gr4Var2.t(colorStateListX3);
        RippleDrawable rippleDrawable = zq4Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(zq4Var.l);
        }
        gr4Var.s(materialCardView.getCardElevation());
        float f = zq4Var.i;
        ColorStateList colorStateList = zq4Var.o;
        gr4Var2.A(f);
        gr4Var2.y(colorStateList);
        materialCardView.setBackgroundInternal(zq4Var.d(gr4Var));
        Drawable drawableC = zq4Var.j() ? zq4Var.c() : gr4Var2;
        zq4Var.j = drawableC;
        materialCardView.setForeground(zq4Var.d(drawableC));
        if (zq4Var.e == -1.0f && (th7VarG = th7.g(materialCardView.getContext(), typedArrayD, v56.MaterialCardView_shapeAppearance)) != null) {
            uf7 uf7VarE = z39.E(materialCardView.getContext(), u26.motionSpringFastSpatial, o56.Motion_Material3_Spring_Standard_Fast_Spatial);
            gr4Var.r(uf7VarE);
            gr4Var2.r(uf7VarE);
            gr4 gr4Var3 = zq4Var.r;
            if (gr4Var3 != null) {
                gr4Var3.r(uf7VarE);
            }
            zq4Var.h(th7VarG);
        }
        typedArrayD.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l0.c.getBounds());
        return rectF;
    }

    public final void b() {
        zq4 zq4Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (zq4Var = this.l0).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        zq4Var.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        zq4Var.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.l0.c.Y.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.l0.d.Y.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.l0.k;
    }

    public int getCheckedIconGravity() {
        return this.l0.h;
    }

    public int getCheckedIconMargin() {
        return this.l0.f;
    }

    public int getCheckedIconSize() {
        return this.l0.g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.l0.m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.l0.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.l0.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.l0.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.l0.b.top;
    }

    public float getProgress() {
        return this.l0.c.Y.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.l0.c.m();
    }

    public ColorStateList getRippleColor() {
        return this.l0.l;
    }

    public a77 getShapeAppearanceModel() {
        return this.l0.n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.l0.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.l0.o;
    }

    public int getStrokeWidth() {
        return this.l0.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zq4 zq4Var = this.l0;
        zq4Var.k();
        i21.T(this, zq4Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        zq4 zq4Var = this.l0;
        if (zq4Var != null && zq4Var.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p0);
        }
        if (this.n0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q0);
        }
        if (this.o0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r0);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, s0);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.n0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        zq4 zq4Var = this.l0;
        accessibilityNodeInfo.setCheckable(zq4Var != null && zq4Var.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n0);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.l0.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.m0) {
            zq4 zq4Var = this.l0;
            if (!zq4Var.s) {
                zq4Var.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.l0.c.t(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        zq4 zq4Var = this.l0;
        zq4Var.c.s(zq4Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        gr4 gr4Var = this.l0.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gr4Var.t(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.l0.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.n0 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.l0.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        zq4 zq4Var = this.l0;
        if (zq4Var.h != i) {
            zq4Var.h = i;
            MaterialCardView materialCardView = zq4Var.a;
            zq4Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.l0.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.l0.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.l0.g(u70.O(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.l0.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.l0.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        zq4 zq4Var = this.l0;
        zq4Var.m = colorStateList;
        Drawable drawable = zq4Var.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        zq4 zq4Var = this.l0;
        if (zq4Var != null) {
            zq4Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.o0 != z) {
            this.o0 = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l0.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        zq4 zq4Var = this.l0;
        zq4Var.m();
        zq4Var.l();
    }

    public void setProgress(float f) {
        zq4 zq4Var = this.l0;
        zq4Var.c.u(f);
        gr4 gr4Var = zq4Var.d;
        if (gr4Var != null) {
            gr4Var.u(f);
        }
        gr4 gr4Var2 = zq4Var.r;
        if (gr4Var2 != null) {
            gr4Var2.u(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        zq4 zq4Var = this.l0;
        zq4Var.e = f;
        zq4Var.h(zq4Var.n.d().a(f));
        zq4Var.j.invalidateSelf();
        if (zq4Var.i() || (zq4Var.a.getPreventCornerOverlap() && !zq4Var.c.q())) {
            zq4Var.l();
        }
        if (zq4Var.i()) {
            zq4Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        zq4 zq4Var = this.l0;
        zq4Var.l = colorStateList;
        RippleDrawable rippleDrawable = zq4Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListV = w79.v(getContext(), i);
        zq4 zq4Var = this.l0;
        zq4Var.l = colorStateListV;
        RippleDrawable rippleDrawable = zq4Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListV);
        }
    }

    @Override // defpackage.n77
    public void setShapeAppearanceModel(a77 a77Var) {
        setClipToOutline(a77Var.j(getBoundsAsRectF()));
        this.l0.h(a77Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        zq4 zq4Var = this.l0;
        if (zq4Var.o != colorStateList) {
            zq4Var.o = colorStateList;
            gr4 gr4Var = zq4Var.d;
            gr4Var.A(zq4Var.i);
            gr4Var.y(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        zq4 zq4Var = this.l0;
        if (i != zq4Var.i) {
            zq4Var.i = i;
            gr4 gr4Var = zq4Var.d;
            ColorStateList colorStateList = zq4Var.o;
            gr4Var.A(i);
            gr4Var.y(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        zq4 zq4Var = this.l0;
        zq4Var.m();
        zq4Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        zq4 zq4Var = this.l0;
        if (zq4Var != null && zq4Var.t && isEnabled()) {
            this.n0 = !this.n0;
            refreshDrawableState();
            b();
            zq4Var.f(this.n0, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l0.c.t(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(xq4 xq4Var) {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.materialCardViewStyle);
    }
}

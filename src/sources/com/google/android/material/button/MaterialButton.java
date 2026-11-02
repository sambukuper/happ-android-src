package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.a77;
import defpackage.bt;
import defpackage.bt7;
import defpackage.c1;
import defpackage.c98;
import defpackage.gr4;
import defpackage.i21;
import defpackage.mr4;
import defpackage.n77;
import defpackage.nq4;
import defpackage.o56;
import defpackage.o61;
import defpackage.om1;
import defpackage.oq4;
import defpackage.p61;
import defpackage.pq4;
import defpackage.q02;
import defpackage.qq4;
import defpackage.rh;
import defpackage.rq4;
import defpackage.sc4;
import defpackage.tf7;
import defpackage.th7;
import defpackage.u26;
import defpackage.u70;
import defpackage.uf7;
import defpackage.uh7;
import defpackage.v56;
import defpackage.vh7;
import defpackage.w79;
import defpackage.y67;
import defpackage.ys0;
import defpackage.z39;
import defpackage.z51;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n77 {
    public static final int[] T0 = {R.attr.state_checkable};
    public static final int[] U0 = {R.attr.state_checked};
    public static final int V0 = o56.Widget_MaterialComponents_Button;
    public static final int W0 = u26.materialSizeOverlay;
    public static final om1 X0 = new om1(1);
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public int E0;
    public float F0;
    public int G0;
    public int H0;
    public LinearLayout.LayoutParams I0;
    public boolean J0;
    public int K0;
    public boolean L0;
    public int M0;
    public vh7 N0;
    public int O0;
    public qq4 P0;
    public float Q0;
    public float R0;
    public tf7 S0;
    public final rq4 j0;
    public final LinkedHashSet k0;
    public oq4 l0;
    public PorterDuff.Mode m0;
    public ColorStateList n0;
    public Drawable o0;
    public PorterDuff.Mode p0;
    public ColorStateList q0;
    public Drawable r0;
    public boolean s0;
    public String t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int[] iArr = {W0};
        int i2 = V0;
        super(mr4.a(i, i2, context, attributeSet, iArr), attributeSet, i);
        this.k0 = new LinkedHashSet();
        this.A0 = false;
        this.B0 = false;
        this.E0 = Integer.MIN_VALUE;
        this.F0 = -2.1474836E9f;
        this.G0 = Integer.MIN_VALUE;
        this.H0 = Integer.MIN_VALUE;
        this.M0 = Integer.MIN_VALUE;
        this.P0 = qq4.f0;
        Context context2 = getContext();
        TypedArray typedArrayD = c98.d(context2, attributeSet, v56.MaterialButton, i, i2, new int[0]);
        this.x0 = typedArrayD.getDimensionPixelSize(v56.MaterialButton_iconPadding, 0);
        int i3 = typedArrayD.getInt(v56.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.m0 = bt7.g(i3, mode);
        this.n0 = ys0.x(getContext(), typedArrayD, v56.MaterialButton_iconTint);
        this.o0 = ys0.B(getContext(), typedArrayD, v56.MaterialButton_icon);
        this.C0 = typedArrayD.getInteger(v56.MaterialButton_iconGravity, 1);
        this.u0 = typedArrayD.getDimensionPixelSize(v56.MaterialButton_iconSize, 0);
        this.p0 = bt7.g(typedArrayD.getInt(v56.MaterialButton_secondaryIconTintMode, -1), mode);
        this.q0 = typedArrayD.hasValue(v56.MaterialButton_secondaryIconTint) ? ys0.x(getContext(), typedArrayD, v56.MaterialButton_secondaryIconTint) : this.n0;
        this.D0 = typedArrayD.getInteger(v56.MaterialButton_secondaryIconGravity, 3);
        Drawable drawableB = ys0.B(getContext(), typedArrayD, v56.MaterialButton_secondaryIcon);
        this.r0 = drawableB;
        this.s0 = drawableB == null;
        y67 y67VarG = th7.g(context2, typedArrayD, v56.MaterialButton_shapeAppearance);
        y67VarG = y67VarG == null ? a77.g(context2, attributeSet, i, i2).a() : y67VarG;
        boolean z = typedArrayD.getBoolean(v56.MaterialButton_opticalCenterEnabled, false);
        rq4 rq4Var = new rq4(this, y67VarG);
        this.j0 = rq4Var;
        rq4Var.e = typedArrayD.getDimensionPixelOffset(v56.MaterialButton_android_insetLeft, 0);
        rq4Var.f = typedArrayD.getDimensionPixelOffset(v56.MaterialButton_android_insetRight, 0);
        rq4Var.g = typedArrayD.getDimensionPixelOffset(v56.MaterialButton_android_insetTop, 0);
        rq4Var.h = typedArrayD.getDimensionPixelOffset(v56.MaterialButton_android_insetBottom, 0);
        if (typedArrayD.hasValue(v56.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(v56.MaterialButton_cornerRadius, -1);
            rq4Var.i = dimensionPixelSize;
            rq4Var.b = rq4Var.b.a(dimensionPixelSize);
            rq4Var.d();
            rq4Var.r = true;
        }
        rq4Var.j = typedArrayD.getDimensionPixelSize(v56.MaterialButton_strokeWidth, 0);
        rq4Var.k = bt7.g(typedArrayD.getInt(v56.MaterialButton_backgroundTintMode, -1), mode);
        rq4Var.l = ys0.x(getContext(), typedArrayD, v56.MaterialButton_backgroundTint);
        rq4Var.m = ys0.x(getContext(), typedArrayD, v56.MaterialButton_strokeColor);
        rq4Var.n = ys0.x(getContext(), typedArrayD, v56.MaterialButton_rippleColor);
        rq4Var.s = typedArrayD.getBoolean(v56.MaterialButton_android_checkable, false);
        rq4Var.v = typedArrayD.getDimensionPixelSize(v56.MaterialButton_elevation, 0);
        rq4Var.t = typedArrayD.getBoolean(v56.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(v56.MaterialButton_android_background)) {
            rq4Var.q = true;
            setSupportBackgroundTintList(rq4Var.l);
            setSupportBackgroundTintMode(rq4Var.k);
        } else {
            rq4Var.c();
        }
        setPaddingRelative(paddingStart + rq4Var.e, paddingTop + rq4Var.g, paddingEnd + rq4Var.f, paddingBottom + rq4Var.h);
        setCheckedInternal(typedArrayD.getBoolean(v56.MaterialButton_android_checked, false));
        if (y67VarG instanceof th7) {
            rq4Var.c = z39.E(getContext(), u26.motionSpringFastSpatial, o56.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (rq4Var.b instanceof th7) {
                rq4Var.d();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.x0);
        u(this.o0 != null);
        x(this.r0 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.Q0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        gr4 gr4VarA;
        if (this.J0 && this.L0 && (gr4VarA = this.j0.a(false)) != null) {
            return (int) (gr4VarA.j() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        if (!j() || this.A0 == z) {
            return;
        }
        this.A0 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.A0;
            if (!materialButtonToggleGroup.t0) {
                materialButtonToggleGroup.k(getId(), z2);
            }
        }
        if (this.B0) {
            return;
        }
        this.B0 = true;
        Iterator it = this.k0.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        this.B0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.Q0 != f) {
            this.Q0 = f;
            w();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) getParent();
                int i = (int) this.Q0;
                int iIndexOfChild = materialButtonGroup.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonG = materialButtonGroup.g(iIndexOfChild);
                MaterialButton materialButtonF = materialButtonGroup.f(iIndexOfChild);
                if (materialButtonG == null && materialButtonF == null) {
                    return;
                }
                if (materialButtonG == null) {
                    materialButtonF.setDisplayedWidthDecrease(i);
                }
                if (materialButtonF == null) {
                    materialButtonG.setDisplayedWidthDecrease(i);
                }
                if (materialButtonG == null || materialButtonF == null) {
                    return;
                }
                materialButtonG.setDisplayedWidthDecrease(i / 2);
                materialButtonF.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (l() && o()) {
            return true;
        }
        if (k() && n()) {
            return true;
        }
        return m() && p();
    }

    public final boolean e(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final int f(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.o0;
        if (drawable != null) {
            intrinsicWidth = this.u0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.r0;
        if (drawable2 != null) {
            intrinsicWidth2 = this.u0;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.x0) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int g(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.x0) - getPaddingBottom()) / 2);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.t0)) {
            return (j() ? CompoundButton.class : Button.class).getName();
        }
        return this.t0;
    }

    public int getAllowedWidthDecrease() {
        return this.M0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (q()) {
            return this.j0.i;
        }
        return 0;
    }

    public uf7 getCornerSpringForce() {
        return this.j0.c;
    }

    public Drawable getIcon() {
        return this.o0;
    }

    public int getIconGravity() {
        return this.C0;
    }

    public int getIconPadding() {
        return this.x0;
    }

    public int getIconSize() {
        return this.u0;
    }

    public ColorStateList getIconTint() {
        return this.n0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.m0;
    }

    public int getInsetBottom() {
        return this.j0.h;
    }

    public int getInsetLeft() {
        return this.j0.e;
    }

    public int getInsetRight() {
        return this.j0.f;
    }

    public int getInsetTop() {
        return this.j0.g;
    }

    public ColorStateList getRippleColor() {
        if (q()) {
            return this.j0.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.r0;
    }

    public int getSecondaryIconGravity() {
        return this.D0;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.q0;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.p0;
    }

    public y67 getShapeAppearance() {
        if (q()) {
            return this.j0.b;
        }
        bt.i("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public a77 getShapeAppearanceModel() {
        if (q()) {
            return this.j0.b.d();
        }
        bt.i("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (q()) {
            return this.j0.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (q()) {
            return this.j0.j;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return q() ? this.j0.l : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return q() ? this.j0.k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.r0 == null || !o()) {
                return null;
            }
            return this.r0;
        }
        if (i == 1) {
            if (this.r0 == null || !p()) {
                return null;
            }
            return this.r0;
        }
        if (i == 2 && this.r0 != null && n()) {
            return this.r0;
        }
        return null;
    }

    public final Drawable i(int i) {
        if (i == 0) {
            if (this.o0 == null || !l()) {
                return null;
            }
            return this.o0;
        }
        if (i == 1) {
            if (this.o0 == null || !k()) {
                return null;
            }
            return this.o0;
        }
        if (i == 2 && this.o0 != null && k()) {
            return this.o0;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A0;
    }

    public final boolean j() {
        rq4 rq4Var = this.j0;
        return rq4Var != null && rq4Var.s;
    }

    public final boolean k() {
        int i = this.C0;
        return i == 3 || i == 4;
    }

    public final boolean l() {
        int i = this.C0;
        return i == 1 || i == 2;
    }

    public final boolean m() {
        int i = this.C0;
        return i == 16 || i == 32;
    }

    public final boolean n() {
        int i = this.D0;
        return i == 3 || i == 4;
    }

    public final boolean o() {
        int i = this.D0;
        return i == 1 || i == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q()) {
            i21.T(this, this.j0.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T0);
        }
        if (this.A0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.A0);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.A0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.E0 != i6) {
            this.E0 = i6;
            this.F0 = -2.1474836E9f;
        }
        if (this.F0 == -2.1474836E9f) {
            this.F0 = getMeasuredWidth();
            if (this.I0 == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.I0 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.I0);
                layoutParams.width = (int) this.F0;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.M0 == Integer.MIN_VALUE) {
            if (this.o0 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.u0;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.o0.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.M0 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.G0 == Integer.MIN_VALUE) {
            this.G0 = getPaddingStart();
        }
        if (this.H0 == Integer.MIN_VALUE) {
            this.H0 = getPaddingEnd();
        }
        if ((getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.L0 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pq4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pq4 pq4Var = (pq4) parcelable;
        super.onRestoreInstanceState(pq4Var.X);
        setChecked(pq4Var.Z);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        pq4 pq4Var = new pq4(super.onSaveInstanceState());
        pq4Var.Z = this.A0;
        return pq4Var;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i = this.D0;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean z;
        if (isEnabled() && this.j0.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final boolean q() {
        rq4 rq4Var = this.j0;
        return (rq4Var == null || rq4Var.q) ? false : true;
    }

    public final /* synthetic */ void r() {
        this.K0 = getOpticalCenterShift();
        w();
        invalidate();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.o0 != null) {
            if (this.o0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public final void s(boolean z) {
        int i;
        if (this.N0 == null) {
            return;
        }
        if (this.S0 == null) {
            tf7 tf7Var = new tf7(this, X0);
            this.S0 = tf7Var;
            tf7Var.m = z39.E(getContext(), u26.motionSpringFastSpatial, o56.Motion_Material3_Spring_Standard_Fast_Spatial);
        }
        if (this.L0) {
            int iOrdinal = this.P0.ordinal();
            int i2 = 0;
            int i3 = (iOrdinal == 1 || iOrdinal == 2) ? this.O0 / 2 : iOrdinal != 3 ? 0 : this.O0;
            vh7 vh7Var = this.N0;
            int[] drawableState = getDrawableState();
            int[][] iArr = vh7Var.c;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= vh7Var.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = vh7Var.c;
                for (int i5 = 0; i5 < vh7Var.a; i5++) {
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                }
                i4 = i;
            }
            uh7 uh7Var = (uh7) (i4 < 0 ? vh7Var.b : vh7Var.d[i4]).Y;
            int width = getWidth();
            float f = uh7Var.b;
            int i6 = uh7Var.a;
            if (i6 != 1) {
                if (i6 == 2) {
                }
                this.S0.a(Math.min(i3, i2));
                if (z) {
                    this.S0.f();
                }
            }
            f *= width;
            i2 = (int) f;
            this.S0.a(Math.min(i3, i2));
            if (z) {
                this.S0.f();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.t0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!q()) {
            super.setBackgroundColor(i);
            return;
        }
        rq4 rq4Var = this.j0;
        if (rq4Var.a(false) != null) {
            rq4Var.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!q()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        rq4 rq4Var = this.j0;
        rq4Var.q = true;
        MaterialButton materialButton = rq4Var.a;
        materialButton.setSupportBackgroundTintList(rq4Var.l);
        materialButton.setSupportBackgroundTintMode(rq4Var.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? u70.O(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (q()) {
            this.j0.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.F0 = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (q()) {
            rq4 rq4Var = this.j0;
            if (rq4Var.r && rq4Var.i == i) {
                return;
            }
            rq4Var.i = i;
            rq4Var.r = true;
            rq4Var.b = rq4Var.b.a(i);
            rq4Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (q()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(uf7 uf7Var) {
        rq4 rq4Var = this.j0;
        rq4Var.c = uf7Var;
        if (rq4Var.b instanceof th7) {
            rq4Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.R0 = Math.min(i, this.M0);
        w();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (q()) {
            this.j0.a(false).s(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.o0 == drawable || t(new nq4(this, drawable, (byte) 1))) {
            return;
        }
        this.F0 = -2.1474836E9f;
        this.o0 = drawable;
        u(true);
        v(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.C0 != i) {
            if (this.o0 != null && this.r0 != null && d()) {
                bt.q("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.C0 = i;
                v(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? u70.O(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            bt.q("iconSize cannot be less than 0");
            return;
        }
        if (this.u0 == i || t(new rh(this, i, (byte) 3))) {
            return;
        }
        this.F0 = -2.1474836E9f;
        this.u0 = i;
        u(true);
        x(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            u(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.m0 != mode) {
            this.m0 = mode;
            u(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(w79.v(getContext(), i));
    }

    public void setInsetBottom(int i) {
        rq4 rq4Var = this.j0;
        rq4Var.b(rq4Var.e, rq4Var.g, rq4Var.f, i);
    }

    public void setInsetLeft(int i) {
        rq4 rq4Var = this.j0;
        rq4Var.b(i, rq4Var.g, rq4Var.f, rq4Var.h);
    }

    public void setInsetRight(int i) {
        rq4 rq4Var = this.j0;
        rq4Var.b(rq4Var.e, rq4Var.g, i, rq4Var.h);
    }

    public void setInsetTop(int i) {
        rq4 rq4Var = this.j0;
        rq4Var.b(rq4Var.e, i, rq4Var.f, rq4Var.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(oq4 oq4Var) {
        this.l0 = oq4Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.J0 != z) {
            this.J0 = z;
            rq4 rq4Var = this.j0;
            if (z) {
                o61 o61Var = new o61(this, (byte) 17);
                rq4Var.d = o61Var;
                gr4 gr4VarA = rq4Var.a(false);
                if (gr4VarA != null) {
                    gr4VarA.F0 = o61Var;
                }
            } else {
                rq4Var.d = null;
                gr4 gr4VarA2 = rq4Var.a(false);
                if (gr4VarA2 != null) {
                    gr4VarA2.F0 = null;
                }
            }
            post(new c1(this, (byte) 26));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        oq4 oq4Var = this.l0;
        if (oq4Var != null) {
            ((MaterialButtonGroup) ((q02) oq4Var).Y).invalidate();
        }
        super.setPressed(z);
        s(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (q()) {
            rq4 rq4Var = this.j0;
            MaterialButton materialButton = rq4Var.a;
            if (rq4Var.n != colorStateList) {
                rq4Var.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(z51.S(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (q()) {
            setRippleColor(w79.v(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.r0 == drawable || t(new nq4(this, drawable, (byte) 0))) {
            return;
        }
        this.F0 = -2.1474836E9f;
        this.r0 = drawable;
        this.s0 = false;
        x(true);
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.D0 != i) {
            if (this.r0 != null && this.o0 != null && d()) {
                bt.q("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.D0 = i;
                y(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? u70.O(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.q0 != colorStateList) {
            this.q0 = colorStateList;
            x(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.p0 != mode) {
            this.p0 = mode;
            x(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(w79.v(getContext(), i));
    }

    public void setShapeAppearance(y67 y67Var) {
        if (!q()) {
            bt.i("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        rq4 rq4Var = this.j0;
        if (rq4Var.c == null && y67Var.f()) {
            rq4Var.c = z39.E(getContext(), u26.motionSpringFastSpatial, o56.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (rq4Var.b instanceof th7) {
                rq4Var.d();
            }
        }
        rq4Var.b = y67Var;
        rq4Var.d();
    }

    @Override // defpackage.n77
    public void setShapeAppearanceModel(a77 a77Var) {
        if (!q()) {
            bt.i("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        rq4 rq4Var = this.j0;
        rq4Var.b = a77Var;
        rq4Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (q()) {
            rq4 rq4Var = this.j0;
            rq4Var.p = z;
            rq4Var.e();
        }
    }

    public void setSizeChange(vh7 vh7Var) {
        if (this.N0 != vh7Var) {
            this.N0 = vh7Var;
            s(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (q()) {
            rq4 rq4Var = this.j0;
            if (rq4Var.m != colorStateList) {
                rq4Var.m = colorStateList;
                rq4Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (q()) {
            setStrokeColor(w79.v(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (q()) {
            rq4 rq4Var = this.j0;
            if (rq4Var.j != i) {
                rq4Var.j = i;
                rq4Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (q()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!q()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        rq4 rq4Var = this.j0;
        if (rq4Var.l != colorStateList) {
            rq4Var.l = colorStateList;
            if (rq4Var.a(false) != null) {
                rq4Var.a(false).setTintList(rq4Var.l);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!q()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        rq4 rq4Var = this.j0;
        if (rq4Var.k != mode) {
            rq4Var.k = mode;
            if (rq4Var.a(false) == null || rq4Var.k == null) {
                return;
            }
            rq4Var.a(false).setTintMode(rq4Var.k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.F0 = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.F0 = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.F0 = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.j0.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.F0 = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(qq4 qq4Var) {
        if (this.P0 != qq4Var) {
            this.P0 = qq4Var;
            s(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.O0 != i) {
            this.O0 = i;
            s(true);
        }
    }

    public final boolean t(Runnable runnable) {
        tf7 tf7Var = this.S0;
        if (tf7Var == null || !tf7Var.f) {
            return false;
        }
        post(new sc4((Object) this, (Object) runnable, (byte) 2));
        return true;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A0);
    }

    public final void u(boolean z) {
        Drawable drawable = this.o0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.o0 = drawableMutate;
            drawableMutate.setTintList(this.n0);
            PorterDuff.Mode mode = this.m0;
            if (mode != null) {
                this.o0.setTintMode(mode);
            }
            int intrinsicWidth = this.u0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.o0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.u0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.o0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.o0;
            int i = this.v0;
            int i2 = this.w0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.o0.setVisible(true, z);
        }
        if (this.o0 != null && this.r0 != null && d()) {
            bt.q("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.o0 == null && this.r0 != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (l() && compoundDrawablesRelative[0] != this.o0) || (k() && compoundDrawablesRelative[2] != this.o0) || (m() && compoundDrawablesRelative[1] != this.o0);
        if (z || z2) {
            if (l()) {
                setCompoundDrawablesRelative(this.o0, h(1), h(2), null);
            } else if (k()) {
                setCompoundDrawablesRelative(h(0), h(1), this.o0, null);
            } else if (m()) {
                setCompoundDrawablesRelative(h(0), this.o0, h(2), null);
            }
        }
    }

    public final void v(int i, int i2) {
        if (this.o0 == null || getLayout() == null) {
            return;
        }
        if (l() || k()) {
            this.w0 = 0;
            if (e(this.C0)) {
                this.v0 = 0;
                u(false);
                return;
            }
            int iF = f(i, this.C0);
            if (this.v0 != iF) {
                this.v0 = iF;
                u(false);
                return;
            }
            return;
        }
        if (m()) {
            this.v0 = 0;
            if (this.C0 == 16) {
                this.w0 = 0;
                u(false);
                return;
            }
            int intrinsicHeight = this.u0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.o0.getIntrinsicHeight();
            }
            int iG = g(i2, intrinsicHeight);
            if (this.w0 != iG) {
                this.w0 = iG;
                u(false);
            }
        }
    }

    public final void w() {
        int i = (int) (this.Q0 - this.R0);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.K0;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.F0 + i);
        }
        setPaddingRelative(this.G0 + i3, getPaddingTop(), (this.H0 + i) - i3, getPaddingBottom());
    }

    public final void x(boolean z) {
        Drawable drawable = this.r0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.r0 = drawableMutate;
            drawableMutate.setTintList(this.q0);
            PorterDuff.Mode mode = this.p0;
            if (mode != null) {
                this.r0.setTintMode(mode);
            }
            int intrinsicWidth = this.u0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.r0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.u0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.r0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.r0;
            int i = this.y0;
            int i2 = this.z0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.r0.setVisible(true, z);
        }
        if (this.r0 != null && this.o0 != null && d()) {
            bt.q("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.r0 == null) {
            if (this.s0) {
                return;
            }
            if (this.o0 != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (o() && compoundDrawablesRelative[0] != this.r0) || (n() && compoundDrawablesRelative[2] != this.r0) || (p() && compoundDrawablesRelative[1] != this.r0);
        if (z || z2) {
            if (o()) {
                setCompoundDrawablesRelative(this.r0, i(1), i(2), null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), i(1), this.r0, null);
            } else if (p()) {
                setCompoundDrawablesRelative(i(0), this.r0, i(2), null);
            }
        }
    }

    public final void y(int i, int i2) {
        if (this.r0 == null || getLayout() == null) {
            return;
        }
        if (o() || n()) {
            this.z0 = 0;
            if (e(this.D0)) {
                this.y0 = 0;
                x(false);
                return;
            }
            int iF = f(i, this.D0);
            if (this.y0 != iF) {
                this.y0 = iF;
                x(false);
                return;
            }
            return;
        }
        if (p()) {
            this.y0 = 0;
            if (this.D0 == 16) {
                this.z0 = 0;
                x(false);
                return;
            }
            int intrinsicHeight = this.u0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.r0.getIntrinsicHeight();
            }
            int iG = g(i2, intrinsicHeight);
            if (this.z0 != iG) {
                this.z0 = iG;
                x(false);
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.materialButtonStyle);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u20 extends FrameLayout {
    public static final t20 q0 = new t20((byte) 0);
    public v20 f0;
    public final a77 g0;
    public int h0;
    public final float i0;
    public final float j0;
    public final int k0;
    public final int l0;
    public ColorStateList m0;
    public PorterDuff.Mode n0;
    public Rect o0;
    public boolean p0;

    public u20(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(mr4.b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, v56.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(v56.SnackbarLayout_elevation)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.SnackbarLayout_elevation, 0));
        }
        this.h0 = typedArrayObtainStyledAttributes.getInt(v56.SnackbarLayout_animationMode, 0);
        if (typedArrayObtainStyledAttributes.hasValue(v56.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(v56.SnackbarLayout_shapeAppearanceOverlay)) {
            this.g0 = a77.g(context2, attributeSet, 0, 0).a();
        }
        this.i0 = typedArrayObtainStyledAttributes.getFloat(v56.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(ys0.x(context2, typedArrayObtainStyledAttributes, v56.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(bt7.g(typedArrayObtainStyledAttributes.getInt(v56.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.j0 = typedArrayObtainStyledAttributes.getFloat(v56.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.SnackbarLayout_android_maxWidth, -1);
        this.l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(q0);
        setFocusable(true);
        if (getBackground() == null) {
            int iN = yn0.N(yn0.b0(getContext(), u70.j0(this, u26.colorSurface)), getBackgroundOverlayColorAlpha(), yn0.b0(getContext(), u70.j0(this, u26.colorOnSurface)));
            a77 a77Var = this.g0;
            if (a77Var != null) {
                c82 c82Var = v20.w;
                gr4 gr4Var = new gr4(a77Var);
                gr4Var.t(ColorStateList.valueOf(iN));
                drawable = gr4Var;
            } else {
                Resources resources = getResources();
                c82 c82Var2 = v20.w;
                float dimension = resources.getDimension(j36.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iN);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.m0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(v20 v20Var) {
        this.f0 = v20Var;
    }

    public float getActionTextColorAlpha() {
        return this.j0;
    }

    public int getAnimationMode() {
        return this.h0;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.i0;
    }

    public int getMaxInlineActionWidth() {
        return this.l0;
    }

    public int getMaxWidth() {
        return this.k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v20 v20Var = this.f0;
        if (v20Var != null) {
            v20Var.b();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        byte b;
        boolean z;
        super.onDetachedFromWindow();
        v20 v20Var = this.f0;
        if (v20Var != null) {
            yr6 yr6VarF = yr6.f();
            s20 s20Var = v20Var.v;
            synchronized (yr6VarF.Y) {
                b = 1;
                if (!yr6VarF.h(s20Var)) {
                    rc7 rc7Var = (rc7) yr6VarF.g0;
                    z = rc7Var != null && s20Var != null && rc7Var.a.get() == s20Var;
                }
            }
            if (z) {
                v20.z.post(new q20(v20Var, b));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v20 v20Var = this.f0;
        if (v20Var == null || !v20Var.r) {
            return;
        }
        v20Var.e();
        v20Var.r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.k0;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.h0 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.m0 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.m0);
            drawable.setTintMode(this.n0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.m0 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.n0);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.n0 = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.p0 || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.o0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        v20 v20Var = this.f0;
        if (v20Var != null) {
            c82 c82Var = v20.w;
            v20Var.f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : q0);
        super.setOnClickListener(onClickListener);
    }
}

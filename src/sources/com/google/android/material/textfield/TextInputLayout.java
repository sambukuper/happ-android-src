package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a77;
import defpackage.aj1;
import defpackage.aq;
import defpackage.bt;
import defpackage.c0;
import defpackage.c36;
import defpackage.c46;
import defpackage.c48;
import defpackage.c98;
import defpackage.cw8;
import defpackage.dw1;
import defpackage.em7;
import defpackage.er4;
import defpackage.f12;
import defpackage.fl6;
import defpackage.g12;
import defpackage.g70;
import defpackage.gr4;
import defpackage.h56;
import defpackage.h70;
import defpackage.hw1;
import defpackage.i21;
import defpackage.ie8;
import defpackage.ii7;
import defpackage.j36;
import defpackage.j78;
import defpackage.k78;
import defpackage.km0;
import defpackage.l78;
import defpackage.lm6;
import defpackage.m61;
import defpackage.m78;
import defpackage.mr4;
import defpackage.n78;
import defpackage.o56;
import defpackage.oi0;
import defpackage.oy1;
import defpackage.q56;
import defpackage.qw0;
import defpackage.r50;
import defpackage.r81;
import defpackage.rk;
import defpackage.rv0;
import defpackage.s81;
import defpackage.t81;
import defpackage.u26;
import defpackage.u70;
import defpackage.ue3;
import defpackage.v56;
import defpackage.w26;
import defpackage.w79;
import defpackage.wl6;
import defpackage.xb;
import defpackage.yb3;
import defpackage.yg7;
import defpackage.yn0;
import defpackage.ys0;
import defpackage.yw1;
import defpackage.z28;
import defpackage.z39;
import defpackage.z67;
import defpackage.z91;
import defpackage.zv7;
import io.sentry.c2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int F1 = o56.Widget_Design_TextInputLayout;
    public static final int[][] G1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A0;
    public boolean A1;
    public int B0;
    public ValueAnimator B1;
    public Fade C0;
    public boolean C1;
    public Fade D0;
    public boolean D1;
    public ColorStateList E0;
    public boolean E1;
    public ColorStateList F0;
    public ColorStateList G0;
    public ColorStateList H0;
    public boolean I0;
    public CharSequence J0;
    public boolean K0;
    public gr4 L0;
    public gr4 M0;
    public StateListDrawable N0;
    public boolean O0;
    public gr4 P0;
    public gr4 Q0;
    public a77 R0;
    public boolean S0;
    public final int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public final Rect b1;
    public final Rect c1;
    public final RectF d1;
    public Typeface e1;
    public final FrameLayout f0;
    public ColorDrawable f1;
    public final yg7 g0;
    public int g1;
    public final g12 h0;
    public final LinkedHashSet h1;
    public final int i0;
    public ColorDrawable i1;
    public EditText j0;
    public int j1;
    public CharSequence k0;
    public Drawable k1;
    public int l0;
    public ColorStateList l1;
    public int m0;
    public ColorStateList m1;
    public int n0;
    public int n1;
    public int o0;
    public int o1;
    public final yb3 p0;
    public int p1;
    public boolean q0;
    public ColorStateList q1;
    public int r0;
    public int r1;
    public boolean s0;
    public int s1;
    public m78 t0;
    public int t1;
    public AppCompatTextView u0;
    public int u1;
    public int v0;
    public int v1;
    public int w0;
    public int w1;
    public CharSequence x0;
    public boolean x1;
    public boolean y0;
    public final rv0 y1;
    public AppCompatTextView z0;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = F1;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = new yb3(this);
        this.t0 = new em7((byte) 4);
        this.b1 = new Rect();
        this.c1 = new Rect();
        this.d1 = new RectF();
        this.h1 = new LinkedHashSet();
        rv0 rv0Var = new rv0(this);
        this.y1 = rv0Var;
        this.E1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = rk.a;
        rv0Var.R = linearInterpolator;
        rv0Var.j(false);
        rv0Var.Q = linearInterpolator;
        rv0Var.j(false);
        if (rv0Var.g != 8388659) {
            rv0Var.g = 8388659;
            rv0Var.j(false);
        }
        int[] iArr = v56.TextInputLayout;
        int[] iArr2 = {v56.TextInputLayout_counterTextAppearance, v56.TextInputLayout_counterOverflowTextAppearance, v56.TextInputLayout_errorTextAppearance, v56.TextInputLayout_helperTextTextAppearance, v56.TextInputLayout_hintTextAppearance};
        c98.a(context2, attributeSet, i, i2);
        c98.b(context2, attributeSet, iArr, i, i2, iArr2);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        zv7 zv7Var = new zv7(context2, typedArrayObtainStyledAttributes);
        yg7 yg7Var = new yg7(this, zv7Var);
        this.g0 = yg7Var;
        this.I0 = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_hintEnabled, true);
        setHint(typedArrayObtainStyledAttributes.getText(v56.TextInputLayout_android_hint));
        this.A1 = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_hintAnimationEnabled, true);
        this.z1 = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_expandedHintEnabled, true);
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_android_minEms)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(v56.TextInputLayout_android_minEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.TextInputLayout_android_minWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(v56.TextInputLayout_android_maxEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.TextInputLayout_android_maxWidth, -1));
        }
        this.R0 = a77.g(context2, attributeSet, i, i2).a();
        this.T0 = context2.getResources().getDimensionPixelOffset(j36.mtrl_textinput_box_label_cutout_padding);
        this.V0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(v56.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.i0 = getResources().getDimensionPixelSize(j36.m3_multiline_hint_filled_text_extra_space);
        this.X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(j36.mtrl_textinput_box_stroke_width_default));
        this.Y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(j36.mtrl_textinput_box_stroke_width_focused));
        this.W0 = this.X0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(v56.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(v56.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(v56.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(v56.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        z67 z67VarK = this.R0.k();
        if (dimension >= 0.0f) {
            z67VarK.e = new c0(dimension);
        }
        if (dimension2 >= 0.0f) {
            z67VarK.f = new c0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            z67VarK.g = new c0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            z67VarK.h = new c0(dimension4);
        }
        this.R0 = z67VarK.a();
        ColorStateList colorStateListW = ys0.w(context2, zv7Var, v56.TextInputLayout_boxBackgroundColor);
        if (colorStateListW != null) {
            int defaultColor = colorStateListW.getDefaultColor();
            this.r1 = defaultColor;
            this.a1 = defaultColor;
            if (colorStateListW.isStateful()) {
                this.s1 = colorStateListW.getColorForState(new int[]{-16842910}, -1);
                this.t1 = colorStateListW.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.u1 = colorStateListW.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.t1 = this.r1;
                ColorStateList colorStateListV = w79.v(context2, c36.mtrl_filled_background_color);
                this.s1 = colorStateListV.getColorForState(new int[]{-16842910}, -1);
                this.u1 = colorStateListV.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.a1 = 0;
            this.r1 = 0;
            this.s1 = 0;
            this.t1 = 0;
            this.u1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListC = zv7Var.c(v56.TextInputLayout_android_textColorHint);
            this.m1 = colorStateListC;
            this.l1 = colorStateListC;
        }
        ColorStateList colorStateListW2 = ys0.w(context2, zv7Var, v56.TextInputLayout_boxStrokeColor);
        this.p1 = typedArrayObtainStyledAttributes.getColor(v56.TextInputLayout_boxStrokeColor, 0);
        this.n1 = context2.getColor(c36.mtrl_textinput_default_box_stroke_color);
        this.v1 = context2.getColor(c36.mtrl_textinput_disabled_color);
        this.o1 = context2.getColor(c36.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListW2 != null) {
            setBoxStrokeColorStateList(colorStateListW2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(ys0.w(context2, zv7Var, v56.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_hintTextAppearance, 0));
        }
        this.G0 = zv7Var.c(v56.TextInputLayout_cursorColor);
        this.H0 = zv7Var.c(v56.TextInputLayout_cursorErrorColor);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(v56.TextInputLayout_errorContentDescription);
        int i3 = typedArrayObtainStyledAttributes.getInt(v56.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(v56.TextInputLayout_helperText);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(v56.TextInputLayout_placeholderText);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(v56.TextInputLayout_counterMaxLength, -1));
        this.w0 = typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_counterTextAppearance, 0);
        this.v0 = typedArrayObtainStyledAttributes.getResourceId(v56.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(v56.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.v0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.w0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_errorTextColor)) {
            setErrorTextColor(zv7Var.c(v56.TextInputLayout_errorTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(zv7Var.c(v56.TextInputLayout_helperTextTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_hintTextColor)) {
            setHintTextColor(zv7Var.c(v56.TextInputLayout_hintTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_counterTextColor)) {
            setCounterTextColor(zv7Var.c(v56.TextInputLayout_counterTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(zv7Var.c(v56.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(zv7Var.c(v56.TextInputLayout_placeholderTextColor));
        }
        g12 g12Var = new g12(this, zv7Var);
        this.h0 = g12Var;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(v56.TextInputLayout_android_enabled, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(v56.TextInputLayout_hintMaxLines, 1));
        zv7Var.v();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(yg7Var);
        frameLayout.addView(g12Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.j0;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L0;
        }
        EditText editText2 = this.j0;
        int iB0 = yn0.b0(editText2.getContext(), u70.j0(editText2, w26.colorControlHighlight));
        int i = this.U0;
        int[][] iArr = G1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            gr4 gr4Var = this.L0;
            int i2 = this.a1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{yn0.N(iB0, 0.1f, i2), i2}), gr4Var, gr4Var);
        }
        Context context = getContext();
        gr4 gr4Var2 = this.L0;
        int iB1 = yn0.b0(context, u70.i0(u26.colorSurface, context, "TextInputLayout"));
        gr4 gr4Var3 = new gr4(gr4Var2.k());
        int iN = yn0.N(iB0, 0.1f, iB1);
        gr4Var3.t(new ColorStateList(iArr, new int[]{iN, 0}));
        gr4Var3.setTint(iB1);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iN, iB1});
        gr4 gr4Var4 = new gr4(gr4Var2.k());
        gr4Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gr4Var3, gr4Var4), gr4Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.N0.addState(new int[0], h(false));
        }
        return this.N0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        gr4 gr4Var = this.M0;
        if (gr4Var != null) {
            return gr4Var;
        }
        gr4 gr4VarH = h(true);
        this.M0 = gr4VarH;
        return gr4VarH;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.j0 != null) {
            bt.q("We already have an EditText, can only have one");
            return;
        }
        getEndIconMode();
        this.j0 = editText;
        int i = this.l0;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.n0);
        }
        int i2 = this.m0;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.o0);
        }
        this.O0 = false;
        k();
        setTextInputAccessibilityDelegate(new l78(this));
        Typeface typeface = this.j0.getTypeface();
        rv0 rv0Var = this.y1;
        rv0Var.n(typeface);
        float textSize = this.j0.getTextSize();
        if (rv0Var.h != textSize) {
            rv0Var.h = textSize;
            rv0Var.j(false);
        }
        float letterSpacing = this.j0.getLetterSpacing();
        if (rv0Var.X != letterSpacing) {
            rv0Var.X = letterSpacing;
            rv0Var.j(false);
        }
        int gravity = this.j0.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (rv0Var.g != i3) {
            rv0Var.g = i3;
            rv0Var.j(false);
        }
        if (rv0Var.f != gravity) {
            rv0Var.f = gravity;
            rv0Var.j(false);
        }
        this.w1 = editText.getMinimumHeight();
        this.j0.addTextChangedListener(new k78(this, editText));
        if (this.l1 == null) {
            this.l1 = this.j0.getHintTextColors();
        }
        if (this.I0) {
            if (TextUtils.isEmpty(this.J0)) {
                CharSequence hint = this.j0.getHint();
                this.k0 = hint;
                setHint(hint);
                this.j0.setHint((CharSequence) null);
            }
            this.K0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.u0 != null) {
            p(this.j0.getText());
        }
        t();
        this.p0.b();
        this.g0.bringToFront();
        g12 g12Var = this.h0;
        g12Var.bringToFront();
        Iterator it = this.h1.iterator();
        while (it.hasNext()) {
            ((f12) it.next()).a(this);
        }
        g12Var.n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.J0)) {
            return;
        }
        this.J0 = charSequence;
        rv0 rv0Var = this.y1;
        if (charSequence == null || !TextUtils.equals(rv0Var.B, charSequence)) {
            rv0Var.B = charSequence;
            rv0Var.C = null;
            rv0Var.j(false);
        }
        if (this.x1) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.y0 == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.z0;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.z0 = null;
        } else if (appCompatTextView != null) {
            this.f0.addView(appCompatTextView);
            this.z0.setVisibility(0);
        }
        this.y0 = z;
    }

    public final void a() {
        if (this.j0 == null || this.U0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.j0;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.y1.f() + this.i0), this.j0.getPaddingEnd(), getResources().getDimensionPixelSize(j36.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j0;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(j36.material_filled_edittext_font_2_0_padding_top), this.j0.getPaddingEnd(), getResources().getDimensionPixelSize(j36.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ys0.H(getContext())) {
            EditText editText3 = this.j0;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(j36.material_filled_edittext_font_1_3_padding_top), this.j0.getPaddingEnd(), getResources().getDimensionPixelSize(j36.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f0;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        rv0 rv0Var = this.y1;
        if (rv0Var.b == f) {
            return;
        }
        if (this.B1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.B1 = valueAnimator;
            valueAnimator.setInterpolator(z39.D(getContext(), u26.motionEasingEmphasizedInterpolator, rk.b));
            this.B1.setDuration(u70.g0(getContext(), u26.motionDurationMedium4, 167));
            this.B1.addUpdateListener(new g70(this, (byte) 3));
        }
        this.B1.setFloatValues(rv0Var.b, f);
        this.B1.start();
    }

    public final void c() {
        int i;
        int i2;
        gr4 gr4Var = this.L0;
        if (gr4Var == null) {
            return;
        }
        a77 a77VarK = gr4Var.k();
        a77 a77Var = this.R0;
        if (a77VarK != a77Var) {
            this.L0.setShapeAppearanceModel(a77Var);
        }
        if (this.U0 == 2 && (i = this.W0) > -1 && (i2 = this.Z0) != 0) {
            gr4 gr4Var2 = this.L0;
            gr4Var2.A(i);
            gr4Var2.y(ColorStateList.valueOf(i2));
        }
        int iB = this.a1;
        if (this.U0 == 1) {
            iB = qw0.b(this.a1, yn0.C(getContext(), u26.colorSurface, 0));
        }
        this.a1 = iB;
        this.L0.t(ColorStateList.valueOf(iB));
        gr4 gr4Var3 = this.P0;
        if (gr4Var3 != null && this.Q0 != null) {
            if (this.W0 > -1 && this.Z0 != 0) {
                gr4Var3.t(this.j0.isFocused() ? ColorStateList.valueOf(this.n1) : ColorStateList.valueOf(this.Z0));
                this.Q0.t(ColorStateList.valueOf(this.Z0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.j0 == null) {
            c2.g();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.c1;
        rect2.bottom = i;
        int i2 = this.U0;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.V0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.j0.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.j0.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.j0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.k0 != null) {
            boolean z = this.K0;
            this.K0 = false;
            CharSequence hint = editText.getHint();
            this.j0.setHint(this.k0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.j0.setHint(hint);
                this.K0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f0;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.j0) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        gr4 gr4Var;
        super.draw(canvas);
        boolean z = this.I0;
        rv0 rv0Var = this.y1;
        if (z) {
            TextPaint textPaint = rv0Var.O;
            RectF rectF = rv0Var.e;
            int iSave = canvas.save();
            if (rv0Var.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(rv0Var.G);
                float f = rv0Var.q;
                float f2 = rv0Var.r;
                float f3 = rv0Var.F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if ((rv0Var.e0 > 1 || rv0Var.f0 > 1) && !rv0Var.D && rv0Var.o()) {
                    float lineStart = rv0Var.q - rv0Var.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (rv0Var.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(rv0Var.H, rv0Var.I, rv0Var.J, yn0.v(rv0Var.K, textPaint.getAlpha()));
                    }
                    rv0Var.Z.draw(canvas);
                    textPaint.setAlpha((int) (rv0Var.b0 * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(rv0Var.H, rv0Var.I, rv0Var.J, yn0.v(rv0Var.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = rv0Var.Z.getLineBaseline(0);
                    CharSequence charSequence = rv0Var.d0;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(rv0Var.H, rv0Var.I, rv0Var.J, rv0Var.K);
                    }
                    String strTrim = rv0Var.d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(rv0Var.Z.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f, f2);
                    rv0Var.Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.Q0 == null || (gr4Var = this.P0) == null) {
            return;
        }
        gr4Var.draw(canvas);
        if (this.j0.isFocused()) {
            Rect bounds = this.Q0.getBounds();
            Rect bounds2 = this.P0.getBounds();
            float f6 = rv0Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = rk.c(iCenterX, f6, bounds2.left);
            bounds.right = rk.c(iCenterX, f6, bounds2.right);
            this.Q0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.C1) {
            return;
        }
        this.C1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        rv0 rv0Var = this.y1;
        if (rv0Var != null) {
            rv0Var.M = drawableState;
            ColorStateList colorStateList2 = rv0Var.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = rv0Var.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                rv0Var.j(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.j0 != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z) {
            invalidate();
        }
        this.C1 = false;
    }

    public final int e() {
        if (this.I0) {
            int i = this.U0;
            rv0 rv0Var = this.y1;
            if (i == 0) {
                return (int) rv0Var.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (rv0Var.f() / 2.0f);
                }
                float f = rv0Var.f();
                TextPaint textPaint = rv0Var.P;
                textPaint.setTextSize(rv0Var.i);
                textPaint.setTypeface(rv0Var.s);
                textPaint.setLetterSpacing(rv0Var.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final Fade f() {
        Fade fade = new Fade();
        fade.Z = u70.g0(getContext(), u26.motionDurationShort2, 87);
        fade.f0 = z39.D(getContext(), u26.motionEasingLinearInterpolator, rk.a);
        return fade;
    }

    public final boolean g() {
        return this.I0 && !TextUtils.isEmpty(this.J0) && (this.L0 instanceof t81);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.j0;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public gr4 getBoxBackground() {
        int i = this.U0;
        if (i == 1 || i == 2) {
            return this.L0;
        }
        c2.g();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.a1;
    }

    public int getBoxBackgroundMode() {
        return this.U0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        a77 a77Var = this.R0;
        RectF rectF = this.d1;
        return layoutDirection == 1 ? a77Var.h.a(rectF) : a77Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        a77 a77Var = this.R0;
        RectF rectF = this.d1;
        return layoutDirection == 1 ? a77Var.g.a(rectF) : a77Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        a77 a77Var = this.R0;
        RectF rectF = this.d1;
        return layoutDirection == 1 ? a77Var.e.a(rectF) : a77Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        a77 a77Var = this.R0;
        RectF rectF = this.d1;
        return layoutDirection == 1 ? a77Var.f.a(rectF) : a77Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.p1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.q1;
    }

    public int getBoxStrokeWidth() {
        return this.X0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Y0;
    }

    public int getCounterMaxLength() {
        return this.r0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.q0 && this.s0 && (appCompatTextView = this.u0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.F0;
    }

    public ColorStateList getCounterTextColor() {
        return this.E0;
    }

    public ColorStateList getCursorColor() {
        return this.G0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.H0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.l1;
    }

    public EditText getEditText() {
        return this.j0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h0.l0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h0.l0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h0.r0;
    }

    public int getEndIconMode() {
        return this.h0.n0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h0.s0;
    }

    public CheckableImageButton getEndIconView() {
        return this.h0.l0;
    }

    public CharSequence getError() {
        yb3 yb3Var = this.p0;
        if (yb3Var.q) {
            return yb3Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.p0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.p0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.p0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h0.h0.getDrawable();
    }

    public CharSequence getHelperText() {
        yb3 yb3Var = this.p0;
        if (yb3Var.x) {
            return yb3Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.p0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I0) {
            return this.J0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.y1.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        rv0 rv0Var = this.y1;
        return rv0Var.g(rv0Var.k);
    }

    public int getHintMaxLines() {
        return this.y1.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.m1;
    }

    public m78 getLengthCounter() {
        return this.t0;
    }

    public int getMaxEms() {
        return this.m0;
    }

    public int getMaxWidth() {
        return this.o0;
    }

    public int getMinEms() {
        return this.l0;
    }

    public int getMinWidth() {
        return this.n0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h0.l0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h0.l0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.y0) {
            return this.x0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A0;
    }

    public CharSequence getPrefixText() {
        return this.g0.h0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.g0.g0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.g0.g0;
    }

    public a77 getShapeAppearanceModel() {
        return this.R0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.g0.i0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.g0.i0.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.g0.l0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.g0.m0;
    }

    public CharSequence getSuffixText() {
        return this.h0.u0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h0.v0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h0.v0;
    }

    public Typeface getTypeface() {
        return this.e1;
    }

    public final gr4 h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(j36.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j0;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(j36.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(j36.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        lm6 lm6Var = new lm6();
        lm6 lm6Var2 = new lm6();
        lm6 lm6Var3 = new lm6();
        lm6 lm6Var4 = new lm6();
        byte b = 0;
        oy1 oy1Var = new oy1(b);
        oy1 oy1Var2 = new oy1(b);
        oy1 oy1Var3 = new oy1(b);
        oy1 oy1Var4 = new oy1(b);
        c0 c0Var = new c0(f);
        c0 c0Var2 = new c0(f);
        c0 c0Var3 = new c0(dimensionPixelOffset);
        c0 c0Var4 = new c0(dimensionPixelOffset);
        a77 a77Var = new a77();
        a77Var.a = lm6Var;
        a77Var.b = lm6Var2;
        a77Var.c = lm6Var3;
        a77Var.d = lm6Var4;
        a77Var.e = c0Var;
        a77Var.f = c0Var2;
        a77Var.g = c0Var4;
        a77Var.h = c0Var3;
        a77Var.i = oy1Var;
        a77Var.j = oy1Var2;
        a77Var.k = oy1Var3;
        a77Var.l = oy1Var4;
        EditText editText2 = this.j0;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = gr4.G0;
            dropDownBackgroundTintList = ColorStateList.valueOf(yn0.b0(context, u70.i0(u26.colorSurface, context, gr4.class.getSimpleName())));
        }
        gr4 gr4Var = new gr4();
        gr4Var.p(context);
        gr4Var.t(dropDownBackgroundTintList);
        gr4Var.s(popupElevation);
        gr4Var.setShapeAppearanceModel(a77Var);
        er4 er4Var = gr4Var.Y;
        if (er4Var.h == null) {
            er4Var.h = new Rect();
        }
        gr4Var.Y.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gr4Var.invalidateSelf();
        return gr4Var;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.j0.getCompoundPaddingLeft() : this.h0.c();
        } else {
            compoundPaddingLeft = this.g0.a();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.j0.getCompoundPaddingRight() : this.g0.a();
        } else {
            compoundPaddingRight = this.h0.c();
        }
        return i - compoundPaddingRight;
    }

    public final void k() {
        int i = this.U0;
        if (i == 0) {
            this.L0 = null;
            this.P0 = null;
            this.Q0 = null;
        } else if (i == 1) {
            this.L0 = new gr4(this.R0);
            this.P0 = new gr4();
            this.Q0 = new gr4();
        } else {
            if (i != 2) {
                bt.q(oi0.n(new StringBuilder(), this.U0, " is illegal; only @BoxBackgroundMode constants are supported."));
                return;
            }
            if (!this.I0 || (this.L0 instanceof t81)) {
                this.L0 = new gr4(this.R0);
            } else {
                a77 a77Var = this.R0;
                int i2 = t81.J0;
                if (a77Var == null) {
                    a77Var = new a77();
                }
                r81 r81Var = new r81(a77Var, new RectF());
                s81 s81Var = new s81(r81Var);
                s81Var.I0 = r81Var;
                this.L0 = s81Var;
            }
            this.P0 = null;
            this.Q0 = null;
        }
        u();
        z();
        if (this.U0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V0 = getResources().getDimensionPixelSize(j36.material_font_2_0_box_collapsed_padding_top);
            } else if (ys0.H(getContext())) {
                this.V0 = getResources().getDimensionPixelSize(j36.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U0 != 0) {
            v();
        }
        EditText editText = this.j0;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.U0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        float lineWidth;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.j0.getWidth();
            int gravity = this.j0.getGravity();
            rv0 rv0Var = this.y1;
            boolean zC = rv0Var.c(rv0Var.B);
            rv0Var.D = zC;
            Rect rect = rv0Var.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = rv0Var.a0;
                    }
                } else if (zC) {
                    f = rect.right;
                    f2 = rv0Var.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.d1;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (rv0Var.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (rv0Var.D) {
                        f5 = rv0Var.a0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (rv0Var.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = rv0Var.a0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = rv0Var.f() + rect.top;
                if (rv0Var.Z != null && !rv0Var.o()) {
                    StaticLayout staticLayout = rv0Var.Z;
                    lineWidth = (rv0Var.i / rv0Var.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (rv0Var.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.T0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W0);
                rectF.top = 0.0f;
                t81 t81Var = (t81) this.L0;
                t81Var.getClass();
                t81Var.F(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = rv0Var.a0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.d1;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (rv0Var.a0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (rv0Var.a0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = rv0Var.f() + rect.top;
            if (rv0Var.Z != null) {
                StaticLayout staticLayout2 = rv0Var.Z;
                lineWidth = (rv0Var.i / rv0Var.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (rv0Var.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(q56.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(c36.design_error));
    }

    public final boolean o() {
        yb3 yb3Var = this.p0;
        return (yb3Var.o != 1 || yb3Var.r == null || TextUtils.isEmpty(yb3Var.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y1.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        g12 g12Var = this.h0;
        g12Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.E1 = false;
        if (this.j0 != null && this.j0.getMeasuredHeight() < (iMax = Math.max(g12Var.getMeasuredHeight(), this.g0.getMeasuredHeight()))) {
            this.j0.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.j0.post(new fl6((Object) this, (byte) 11));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.j0;
        if (editText != null) {
            ThreadLocal threadLocal = aj1.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.b1;
            rect.set(0, 0, width, height);
            aj1.b(this, editText, rect);
            gr4 gr4Var = this.P0;
            if (gr4Var != null) {
                int i6 = rect.bottom;
                gr4Var.setBounds(rect.left, i6 - this.X0, rect.right, i6);
            }
            gr4 gr4Var2 = this.Q0;
            if (gr4Var2 != null) {
                int i7 = rect.bottom;
                gr4Var2.setBounds(rect.left, i7 - this.Y0, rect.right, i7);
            }
            if (this.I0) {
                float textSize = this.j0.getTextSize();
                rv0 rv0Var = this.y1;
                float f = rv0Var.h;
                TextPaint textPaint = rv0Var.P;
                if (f != textSize) {
                    rv0Var.h = textSize;
                    rv0Var.j(false);
                }
                int gravity = this.j0.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (rv0Var.g != i8) {
                    rv0Var.g = i8;
                    rv0Var.j(false);
                }
                if (rv0Var.f != gravity) {
                    rv0Var.f = gravity;
                    rv0Var.j(false);
                }
                Rect rectD = d(rect);
                int i9 = rectD.left;
                int i10 = rectD.top;
                int i11 = rectD.right;
                int i12 = rectD.bottom;
                Rect rect2 = rv0Var.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    rv0Var.N = true;
                }
                if (this.j0 == null) {
                    c2.g();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(rv0Var.h);
                    textPaint.setTypeface(rv0Var.v);
                    textPaint.setLetterSpacing(rv0Var.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(rv0Var.h);
                    textPaint.setTypeface(rv0Var.v);
                    textPaint.setLetterSpacing(rv0Var.X);
                    fDescent = rv0Var.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j0.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.c1;
                rect3.left = compoundPaddingLeft;
                if (this.U0 != 1 || this.j0.getMinLines() > 1) {
                    if (this.U0 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(rv0Var.h);
                        textPaint.setTypeface(rv0Var.v);
                        textPaint.setLetterSpacing(rv0Var.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.j0.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.j0.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U0 != 1 || this.j0.getMinLines() > 1) ? rect.bottom - this.j0.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = rv0Var.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != rv0Var.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    rv0Var.N = true;
                    rv0Var.k0 = true;
                }
                rv0Var.j(false);
                if (!g() || this.x1) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.E1;
        g12 g12Var = this.h0;
        if (!z) {
            g12Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E1 = true;
        }
        if (this.z0 != null && (editText = this.j0) != null) {
            this.z0.setGravity(editText.getGravity());
            this.z0.setPadding(this.j0.getCompoundPaddingLeft(), this.j0.getCompoundPaddingTop(), this.j0.getCompoundPaddingRight(), this.j0.getCompoundPaddingBottom());
        }
        g12Var.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j0.getMeasuredWidth() - this.j0.getCompoundPaddingLeft()) - this.j0.getCompoundPaddingRight();
        rv0 rv0Var = this.y1;
        TextPaint textPaint = rv0Var.P;
        textPaint.setTextSize(rv0Var.i);
        textPaint.setTypeface(rv0Var.s);
        textPaint.setLetterSpacing(rv0Var.W);
        float f2 = measuredWidth;
        rv0Var.i0 = rv0Var.e(rv0Var.f0, textPaint, rv0Var.B, (rv0Var.i / rv0Var.h) * f2, rv0Var.D).getHeight();
        textPaint.setTextSize(rv0Var.h);
        textPaint.setTypeface(rv0Var.v);
        textPaint.setLetterSpacing(rv0Var.X);
        rv0Var.j0 = rv0Var.e(rv0Var.e0, textPaint, rv0Var.B, f2, rv0Var.D).getHeight();
        EditText editText2 = this.j0;
        ThreadLocal threadLocal = aj1.a;
        int width = editText2.getWidth();
        int height = editText2.getHeight();
        Rect rect = this.b1;
        byte b = 0;
        rect.set(0, 0, width, height);
        aj1.b(this, editText2, rect);
        Rect rectD = d(rect);
        int i3 = rectD.left;
        int i4 = rectD.top;
        int i5 = rectD.right;
        int i6 = rectD.bottom;
        Rect rect2 = rv0Var.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            rv0Var.N = true;
        }
        v();
        a();
        if (this.j0 == null) {
            return;
        }
        int i7 = rv0Var.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = rv0Var.P;
            textPaint2.setTextSize(rv0Var.h);
            textPaint2.setTypeface(rv0Var.v);
            textPaint2.setLetterSpacing(rv0Var.X);
            f = -textPaint2.ascent();
        }
        float f3 = 0.0f;
        if (this.x0 != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z0.getPaint());
            textPaint3.setTextSize(this.z0.getTextSize());
            textPaint3.setTypeface(this.z0.getTypeface());
            textPaint3.setLetterSpacing(this.z0.getLetterSpacing());
            ii7 ii7Var = new ii7(this.x0, textPaint3, measuredWidth);
            ii7Var.k = getLayoutDirection() == 1;
            ii7Var.j = true;
            float lineSpacingExtra = this.z0.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z0.getLineSpacingMultiplier();
            ii7Var.g = lineSpacingExtra;
            ii7Var.h = lineSpacingMultiplier;
            ii7Var.m = new j78(this, b);
            f3 = (this.U0 == 1 ? rv0Var.f() + this.V0 + this.i0 : 0.0f) + ii7Var.a().getHeight();
        }
        float fMax = Math.max(f, f3);
        if (this.j0.getMeasuredHeight() < fMax) {
            this.j0.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n78)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n78 n78Var = (n78) parcelable;
        super.onRestoreInstanceState(n78Var.X);
        setError(n78Var.Z);
        if (n78Var.f0) {
            post(new xb(this, (byte) 22));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S0) {
            m61 m61Var = this.R0.e;
            RectF rectF = this.d1;
            float fA = m61Var.a(rectF);
            float fA2 = this.R0.f.a(rectF);
            float fA3 = this.R0.h.a(rectF);
            float fA4 = this.R0.g.a(rectF);
            a77 a77Var = this.R0;
            z91 z91Var = a77Var.a;
            z91 z91Var2 = a77Var.b;
            z91 z91Var3 = a77Var.d;
            z91 z91Var4 = a77Var.c;
            oy1 oy1Var = new oy1((byte) 0);
            oy1 oy1Var2 = new oy1((byte) 0);
            oy1 oy1Var3 = new oy1((byte) 0);
            oy1 oy1Var4 = new oy1((byte) 0);
            c0 c0Var = new c0(fA2);
            c0 c0Var2 = new c0(fA);
            c0 c0Var3 = new c0(fA4);
            c0 c0Var4 = new c0(fA3);
            a77 a77Var2 = new a77();
            a77Var2.a = z91Var2;
            a77Var2.b = z91Var;
            a77Var2.c = z91Var3;
            a77Var2.d = z91Var4;
            a77Var2.e = c0Var;
            a77Var2.f = c0Var2;
            a77Var2.g = c0Var4;
            a77Var2.h = c0Var3;
            a77Var2.i = oy1Var;
            a77Var2.j = oy1Var2;
            a77Var2.k = oy1Var3;
            a77Var2.l = oy1Var4;
            this.S0 = z;
            setShapeAppearanceModel(a77Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n78 n78Var = new n78(super.onSaveInstanceState());
        if (o()) {
            n78Var.Z = getError();
        }
        g12 g12Var = this.h0;
        n78Var.f0 = g12Var.n0 != 0 && g12Var.l0.i0;
        return n78Var;
    }

    public final void p(Editable editable) {
        ((em7) this.t0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.s0;
        int i = this.r0;
        if (i == -1) {
            this.u0.setText(String.valueOf(length));
            this.u0.setContentDescription(null);
            this.s0 = false;
        } else {
            this.s0 = length > i;
            Context context = getContext();
            this.u0.setContentDescription(context.getString(this.s0 ? h56.character_counter_overflowed_content_description : h56.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r0)));
            if (z != this.s0) {
                q();
            }
            String str = r50.b;
            r50 r50Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? r50.e : r50.d;
            AppCompatTextView appCompatTextView = this.u0;
            String string = getContext().getString(h56.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r0));
            r50Var.getClass();
            h70 h70Var = c48.a;
            appCompatTextView.setText(string != null ? r50Var.c(string).toString() : null);
        }
        if (this.j0 == null || z == this.s0) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.u0;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.s0 ? this.v0 : this.w0);
            if (!this.s0 && (colorStateList2 = this.E0) != null) {
                this.u0.setTextColor(colorStateList2);
            }
            if (!this.s0 || (colorStateList = this.F0) == null) {
                return;
            }
            this.u0.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.G0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueE0 = u70.e0(context.getTheme(), w26.colorControlActivated);
            if (typedValueE0 != null) {
                int i = typedValueE0.resourceId;
                if (i != 0) {
                    colorStateListValueOf = w79.v(context, i);
                } else {
                    int i2 = typedValueE0.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.j0;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.j0.getTextCursorDrawable().mutate();
        if ((o() || (this.u0 != null && this.s0)) && (colorStateList = this.H0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public final boolean s() {
        boolean z;
        if (this.j0 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            yg7 yg7Var = this.g0;
            if (yg7Var.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, yg7Var.getMeasuredWidth() - this.j0.getPaddingLeft());
                if (this.f1 == null || this.g1 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f1 = colorDrawable;
                    this.g1 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.j0.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f1;
                if (drawable != colorDrawable2) {
                    this.j0.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.j0.getCompoundDrawablesRelative();
                this.j0.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f1 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f1 != null) {
            Drawable[] compoundDrawablesRelative3 = this.j0.getCompoundDrawablesRelative();
            this.j0.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f1 = null;
            z = true;
        } else {
            z = false;
        }
        g12 g12Var = this.h0;
        if ((g12Var.e() || ((g12Var.n0 != 0 && g12Var.d()) || g12Var.u0 != null)) && g12Var.getMeasuredWidth() > 0) {
            int measuredWidth = g12Var.v0.getMeasuredWidth() - this.j0.getPaddingRight();
            if (g12Var.e()) {
                checkableImageButton = g12Var.h0;
            } else if (g12Var.n0 != 0 && g12Var.d()) {
                checkableImageButton = g12Var.l0;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative4 = this.j0.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.i1;
            if (colorDrawable3 != null && this.j1 != iMax2) {
                this.j1 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.j0.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.i1, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.i1 = colorDrawable4;
                this.j1 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.i1;
            if (drawable2 != colorDrawable5) {
                this.k1 = drawable2;
                this.j0.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.i1 != null) {
            Drawable[] compoundDrawablesRelative5 = this.j0.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.i1) {
                this.j0.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.k1, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.i1 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.a1 != i) {
            this.a1 = i;
            this.r1 = i;
            this.t1 = i;
            this.u1 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.r1 = defaultColor;
        this.a1 = defaultColor;
        this.s1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.t1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.u1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U0) {
            return;
        }
        this.U0 = i;
        if (this.j0 != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.V0 = i;
    }

    public void setBoxCornerFamily(int i) {
        z67 z67VarK = this.R0.k();
        m61 m61Var = this.R0.e;
        z67VarK.a = i21.q(i);
        z67VarK.e = m61Var;
        m61 m61Var2 = this.R0.f;
        z67VarK.b = i21.q(i);
        z67VarK.f = m61Var2;
        m61 m61Var3 = this.R0.h;
        z67VarK.d = i21.q(i);
        z67VarK.h = m61Var3;
        m61 m61Var4 = this.R0.g;
        z67VarK.c = i21.q(i);
        z67VarK.g = m61Var4;
        this.R0 = z67VarK.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.p1 != i) {
            this.p1 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.n1 = colorStateList.getDefaultColor();
            this.v1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.o1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.p1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.p1 != colorStateList.getDefaultColor()) {
            this.p1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.q1 != colorStateList) {
            this.q1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.X0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.Y0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.q0 != z) {
            yb3 yb3Var = this.p0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.u0 = appCompatTextView;
                appCompatTextView.setId(c46.textinput_counter);
                Typeface typeface = this.e1;
                if (typeface != null) {
                    this.u0.setTypeface(typeface);
                }
                this.u0.setMaxLines(1);
                yb3Var.a(this.u0, 2);
                ((ViewGroup.MarginLayoutParams) this.u0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(j36.mtrl_textinput_counter_margin_start));
                q();
                if (this.u0 != null) {
                    EditText editText = this.j0;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                yb3Var.g(this.u0, 2);
                this.u0 = null;
            }
            this.q0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.r0 != i) {
            if (i > 0) {
                this.r0 = i;
            } else {
                this.r0 = -1;
            }
            if (!this.q0 || this.u0 == null) {
                return;
            }
            EditText editText = this.j0;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            if (o() || (this.u0 != null && this.s0)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.l1 = colorStateList;
        this.m1 = colorStateList;
        if (this.j0 != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.h0.l0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.h0.l0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        g12 g12Var = this.h0;
        g12Var.g(i != 0 ? g12Var.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        g12 g12Var = this.h0;
        Drawable drawableO = i != 0 ? u70.O(g12Var.getContext(), i) : null;
        TextInputLayout textInputLayout = g12Var.f0;
        CheckableImageButton checkableImageButton = g12Var.l0;
        checkableImageButton.setImageDrawable(drawableO);
        if (drawableO != null) {
            ue3.b(textInputLayout, checkableImageButton, g12Var.p0, g12Var.q0);
            ue3.F(textInputLayout, checkableImageButton, g12Var.p0);
        }
    }

    public void setEndIconMinSize(int i) {
        g12 g12Var = this.h0;
        if (i < 0) {
            g12Var.getClass();
            bt.q("endIconSize cannot be less than 0");
        } else if (i != g12Var.r0) {
            g12Var.r0 = i;
            CheckableImageButton checkableImageButton = g12Var.l0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = g12Var.h0;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h0.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        g12 g12Var = this.h0;
        CheckableImageButton checkableImageButton = g12Var.l0;
        View.OnLongClickListener onLongClickListener = g12Var.t0;
        checkableImageButton.setOnClickListener(onClickListener);
        ue3.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        g12 g12Var = this.h0;
        g12Var.t0 = onLongClickListener;
        CheckableImageButton checkableImageButton = g12Var.l0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ue3.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        g12 g12Var = this.h0;
        g12Var.s0 = scaleType;
        g12Var.l0.setScaleType(scaleType);
        g12Var.h0.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        g12 g12Var = this.h0;
        if (g12Var.p0 != colorStateList) {
            g12Var.p0 = colorStateList;
            ue3.b(g12Var.f0, g12Var.l0, colorStateList, g12Var.q0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        g12 g12Var = this.h0;
        if (g12Var.q0 != mode) {
            g12Var.q0 = mode;
            ue3.b(g12Var.f0, g12Var.l0, g12Var.p0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h0.i(z);
    }

    public void setError(CharSequence charSequence) {
        yb3 yb3Var = this.p0;
        if (!yb3Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            yb3Var.f();
            return;
        }
        yb3Var.c();
        yb3Var.p = charSequence;
        yb3Var.r.setText(charSequence);
        byte b = yb3Var.n;
        if (b != 1) {
            yb3Var.o = (byte) 1;
        }
        yb3Var.i(b, yb3Var.o, yb3Var.h(yb3Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        yb3 yb3Var = this.p0;
        yb3Var.t = i;
        AppCompatTextView appCompatTextView = yb3Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        yb3 yb3Var = this.p0;
        yb3Var.s = charSequence;
        AppCompatTextView appCompatTextView = yb3Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        yb3 yb3Var = this.p0;
        TextInputLayout textInputLayout = yb3Var.h;
        if (yb3Var.q == z) {
            return;
        }
        yb3Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(yb3Var.g, null);
            yb3Var.r = appCompatTextView;
            appCompatTextView.setId(c46.textinput_error);
            yb3Var.r.setTextAlignment(5);
            Typeface typeface = yb3Var.B;
            if (typeface != null) {
                yb3Var.r.setTypeface(typeface);
            }
            int i = yb3Var.u;
            yb3Var.u = i;
            AppCompatTextView appCompatTextView2 = yb3Var.r;
            if (appCompatTextView2 != null) {
                yb3Var.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = yb3Var.v;
            yb3Var.v = colorStateList;
            AppCompatTextView appCompatTextView3 = yb3Var.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = yb3Var.s;
            yb3Var.s = charSequence;
            AppCompatTextView appCompatTextView4 = yb3Var.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = yb3Var.t;
            yb3Var.t = i2;
            AppCompatTextView appCompatTextView5 = yb3Var.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            yb3Var.r.setVisibility(4);
            yb3Var.a(yb3Var.r, 0);
        } else {
            yb3Var.f();
            yb3Var.g(yb3Var.r, 0);
            yb3Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        yb3Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        g12 g12Var = this.h0;
        g12Var.j(i != 0 ? u70.O(g12Var.getContext(), i) : null);
        ue3.F(g12Var.f0, g12Var.h0, g12Var.i0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        g12 g12Var = this.h0;
        CheckableImageButton checkableImageButton = g12Var.h0;
        View.OnLongClickListener onLongClickListener = g12Var.k0;
        checkableImageButton.setOnClickListener(onClickListener);
        ue3.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        g12 g12Var = this.h0;
        g12Var.k0 = onLongClickListener;
        CheckableImageButton checkableImageButton = g12Var.h0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ue3.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        g12 g12Var = this.h0;
        if (g12Var.i0 != colorStateList) {
            g12Var.i0 = colorStateList;
            ue3.b(g12Var.f0, g12Var.h0, colorStateList, g12Var.j0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        g12 g12Var = this.h0;
        if (g12Var.j0 != mode) {
            g12Var.j0 = mode;
            ue3.b(g12Var.f0, g12Var.h0, g12Var.i0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        yb3 yb3Var = this.p0;
        yb3Var.u = i;
        AppCompatTextView appCompatTextView = yb3Var.r;
        if (appCompatTextView != null) {
            yb3Var.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        yb3 yb3Var = this.p0;
        yb3Var.v = colorStateList;
        AppCompatTextView appCompatTextView = yb3Var.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.z1 != z) {
            this.z1 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        yb3 yb3Var = this.p0;
        if (zIsEmpty) {
            if (yb3Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!yb3Var.x) {
            setHelperTextEnabled(true);
        }
        yb3Var.c();
        yb3Var.w = charSequence;
        yb3Var.y.setText(charSequence);
        byte b = yb3Var.n;
        if (b != 2) {
            yb3Var.o = (byte) 2;
        }
        yb3Var.i(b, yb3Var.o, yb3Var.h(yb3Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        yb3 yb3Var = this.p0;
        yb3Var.A = colorStateList;
        AppCompatTextView appCompatTextView = yb3Var.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        yb3 yb3Var = this.p0;
        TextInputLayout textInputLayout = yb3Var.h;
        if (yb3Var.x == z) {
            return;
        }
        yb3Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(yb3Var.g, null);
            yb3Var.y = appCompatTextView;
            appCompatTextView.setId(c46.textinput_helper_text);
            yb3Var.y.setTextAlignment(5);
            Typeface typeface = yb3Var.B;
            if (typeface != null) {
                yb3Var.y.setTypeface(typeface);
            }
            yb3Var.y.setVisibility(4);
            yb3Var.y.setImportantForAccessibility(2);
            int i = yb3Var.z;
            yb3Var.z = i;
            AppCompatTextView appCompatTextView2 = yb3Var.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = yb3Var.A;
            yb3Var.A = colorStateList;
            AppCompatTextView appCompatTextView3 = yb3Var.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            yb3Var.a(yb3Var.y, 1);
        } else {
            yb3Var.c();
            byte b = yb3Var.n;
            if (b == 2) {
                yb3Var.o = (byte) 0;
            }
            yb3Var.i(b, yb3Var.o, yb3Var.h(yb3Var.y, _UrlKt.FRAGMENT_ENCODE_SET));
            yb3Var.g(yb3Var.y, 1);
            yb3Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        yb3Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        yb3 yb3Var = this.p0;
        yb3Var.z = i;
        AppCompatTextView appCompatTextView = yb3Var.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.I0) {
            this.I0 = z;
            if (z) {
                CharSequence hint = this.j0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J0)) {
                        setHint(hint);
                    }
                    this.j0.setHint((CharSequence) null);
                }
                this.K0 = true;
            } else {
                this.K0 = false;
                if (!TextUtils.isEmpty(this.J0) && TextUtils.isEmpty(this.j0.getHint())) {
                    this.j0.setHint(this.J0);
                }
                setHintInternal(null);
            }
            if (this.j0 != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        rv0 rv0Var = this.y1;
        if (i != rv0Var.f0) {
            rv0Var.f0 = i;
            rv0Var.j(false);
        }
        if (i != rv0Var.e0) {
            rv0Var.e0 = i;
            rv0Var.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        rv0 rv0Var = this.y1;
        TextInputLayout textInputLayout = rv0Var.a;
        z28 z28Var = new z28(textInputLayout.getContext(), i);
        ColorStateList colorStateList = z28Var.k;
        if (colorStateList != null) {
            rv0Var.k = colorStateList;
        }
        float f = z28Var.l;
        if (f != 0.0f) {
            rv0Var.i = f;
        }
        ColorStateList colorStateList2 = z28Var.a;
        if (colorStateList2 != null) {
            rv0Var.V = colorStateList2;
        }
        rv0Var.T = z28Var.f;
        rv0Var.U = z28Var.g;
        rv0Var.S = z28Var.h;
        rv0Var.W = z28Var.j;
        km0 km0Var = rv0Var.z;
        if (km0Var != null) {
            km0Var.c = true;
        }
        wl6 wl6Var = new wl6((Object) rv0Var, (byte) 20);
        z28Var.a();
        rv0Var.z = new km0(wl6Var, z28Var.p);
        z28Var.b(textInputLayout.getContext(), rv0Var.z);
        rv0Var.j(false);
        this.m1 = rv0Var.k;
        if (this.j0 != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.m1 != colorStateList) {
            if (this.l1 == null) {
                rv0 rv0Var = this.y1;
                if (rv0Var.k != colorStateList) {
                    rv0Var.k = colorStateList;
                    rv0Var.j(false);
                }
            }
            this.m1 = colorStateList;
            if (this.j0 != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(m78 m78Var) {
        this.t0 = m78Var;
    }

    public void setMaxEms(int i) {
        this.m0 = i;
        EditText editText = this.j0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.o0 = i;
        EditText editText = this.j0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.l0 = i;
        EditText editText = this.j0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.n0 = i;
        EditText editText = this.j0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        g12 g12Var = this.h0;
        g12Var.l0.setContentDescription(i != 0 ? g12Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        g12 g12Var = this.h0;
        g12Var.l0.setImageDrawable(i != 0 ? u70.O(g12Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        g12 g12Var = this.h0;
        if (z && g12Var.n0 != 1) {
            g12Var.h(1);
        } else if (z) {
            g12Var.getClass();
        } else {
            g12Var.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        g12 g12Var = this.h0;
        g12Var.p0 = colorStateList;
        ue3.b(g12Var.f0, g12Var.l0, colorStateList, g12Var.q0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        g12 g12Var = this.h0;
        g12Var.q0 = mode;
        ue3.b(g12Var.f0, g12Var.l0, g12Var.p0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.z0 = appCompatTextView;
            appCompatTextView.setId(c46.textinput_placeholder);
            this.z0.setImportantForAccessibility(1);
            this.z0.setAccessibilityLiveRegion(1);
            Fade fadeF = f();
            this.C0 = fadeF;
            fadeF.Y = 67L;
            this.D0 = f();
            setPlaceholderTextAppearance(this.B0);
            setPlaceholderTextColor(this.A0);
            cw8.n(this.z0, new hw1((byte) 5));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.y0) {
                setPlaceholderTextEnabled(true);
            }
            this.x0 = charSequence;
        }
        EditText editText = this.j0;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B0 = i;
        AppCompatTextView appCompatTextView = this.z0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            AppCompatTextView appCompatTextView = this.z0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        yg7 yg7Var = this.g0;
        yg7Var.getClass();
        yg7Var.h0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yg7Var.g0.setText(charSequence);
        yg7Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.g0.g0.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g0.g0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(a77 a77Var) {
        gr4 gr4Var = this.L0;
        if (gr4Var == null || gr4Var.k() == a77Var) {
            return;
        }
        this.R0 = a77Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g0.i0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? u70.O(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        yg7 yg7Var = this.g0;
        if (i < 0) {
            yg7Var.getClass();
            bt.q("startIconSize cannot be less than 0");
        } else if (i != yg7Var.l0) {
            yg7Var.l0 = i;
            CheckableImageButton checkableImageButton = yg7Var.i0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        yg7 yg7Var = this.g0;
        CheckableImageButton checkableImageButton = yg7Var.i0;
        View.OnLongClickListener onLongClickListener = yg7Var.n0;
        checkableImageButton.setOnClickListener(onClickListener);
        ue3.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        yg7 yg7Var = this.g0;
        yg7Var.n0 = onLongClickListener;
        CheckableImageButton checkableImageButton = yg7Var.i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ue3.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        yg7 yg7Var = this.g0;
        yg7Var.m0 = scaleType;
        yg7Var.i0.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        yg7 yg7Var = this.g0;
        if (yg7Var.j0 != colorStateList) {
            yg7Var.j0 = colorStateList;
            ue3.b(yg7Var.f0, yg7Var.i0, colorStateList, yg7Var.k0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        yg7 yg7Var = this.g0;
        if (yg7Var.k0 != mode) {
            yg7Var.k0 = mode;
            ue3.b(yg7Var.f0, yg7Var.i0, yg7Var.j0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g0.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        g12 g12Var = this.h0;
        g12Var.getClass();
        g12Var.u0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        g12Var.v0.setText(charSequence);
        g12Var.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h0.v0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h0.v0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(l78 l78Var) {
        EditText editText = this.j0;
        if (editText != null) {
            cw8.n(editText, l78Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.e1) {
            this.e1 = typeface;
            this.y1.n(typeface);
            yb3 yb3Var = this.p0;
            if (typeface != yb3Var.B) {
                yb3Var.B = typeface;
                AppCompatTextView appCompatTextView = yb3Var.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = yb3Var.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.u0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.j0;
        if (editText == null || this.U0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = dw1.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(aq.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s0 && (appCompatTextView = this.u0) != null) {
            drawableMutate.setColorFilter(aq.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.j0.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.j0;
        if (editText == null || this.L0 == null) {
            return;
        }
        if ((this.O0 || editText.getBackground() == null) && this.U0 != 0) {
            this.j0.setBackground(getEditTextBoxBackground());
            this.O0 = true;
        }
    }

    public final void v() {
        if (this.U0 != 1) {
            FrameLayout frameLayout = this.f0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.j0;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j0;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.l1;
        rv0 rv0Var = this.y1;
        if (colorStateList2 != null) {
            rv0Var.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.l1;
            int colorForState = this.v1;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            rv0Var.k(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.p0.r;
            rv0Var.k(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.s0 && (appCompatTextView = this.u0) != null) {
            rv0Var.k(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.m1) != null && rv0Var.k != colorStateList) {
            rv0Var.k = colorStateList;
            rv0Var.j(false);
        }
        g12 g12Var = this.h0;
        yg7 yg7Var = this.g0;
        if (z3 || !this.z1 || (isEnabled() && z4)) {
            if (z2 || this.x1) {
                ValueAnimator valueAnimator = this.B1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B1.cancel();
                }
                if (z && this.A1) {
                    b(1.0f);
                } else {
                    rv0Var.m(1.0f);
                }
                this.x1 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j0;
                x(editText3 != null ? editText3.getText() : null);
                yg7Var.o0 = false;
                yg7Var.f();
                g12Var.w0 = false;
                g12Var.o();
                return;
            }
            return;
        }
        if (z2 || !this.x1) {
            ValueAnimator valueAnimator2 = this.B1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B1.cancel();
            }
            if (z && this.A1) {
                b(0.0f);
            } else {
                rv0Var.m(0.0f);
            }
            if (g() && !((t81) this.L0).I0.s.isEmpty() && g()) {
                ((t81) this.L0).F(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.x1 = true;
            AppCompatTextView appCompatTextView3 = this.z0;
            if (appCompatTextView3 != null && this.y0) {
                appCompatTextView3.setText((CharSequence) null);
                ie8.a(this.f0, this.D0);
                this.z0.setVisibility(4);
            }
            yg7Var.o0 = true;
            yg7Var.f();
            g12Var.w0 = true;
            g12Var.o();
        }
    }

    public final void x(Editable editable) {
        ((em7) this.t0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f0;
        if (length != 0 || this.x1) {
            AppCompatTextView appCompatTextView = this.z0;
            if (appCompatTextView == null || !this.y0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            ie8.a(frameLayout, this.D0);
            this.z0.setVisibility(4);
            return;
        }
        if (this.z0 == null || !this.y0 || TextUtils.isEmpty(this.x0)) {
            return;
        }
        this.z0.setText(this.x0);
        ie8.a(frameLayout, this.C0);
        this.z0.setVisibility(0);
        this.z0.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.q1.getDefaultColor();
        int colorForState = this.q1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.q1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.Z0 = colorForState2;
        } else if (z2) {
            this.Z0 = colorForState;
        } else {
            this.Z0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.L0 == null || this.U0 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.j0) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.j0) != null && editText.isHovered());
        if (!isEnabled()) {
            this.Z0 = this.v1;
        } else if (o()) {
            if (this.q1 != null) {
                y(z, z2);
            } else {
                this.Z0 = getErrorCurrentTextColors();
            }
        } else if (!this.s0 || (appCompatTextView = this.u0) == null) {
            if (z) {
                this.Z0 = this.p1;
            } else if (z2) {
                this.Z0 = this.o1;
            } else {
                this.Z0 = this.n1;
            }
        } else if (this.q1 != null) {
            y(z, z2);
        } else {
            this.Z0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        g12 g12Var = this.h0;
        TextInputLayout textInputLayout = g12Var.f0;
        CheckableImageButton checkableImageButton = g12Var.l0;
        TextInputLayout textInputLayout2 = g12Var.f0;
        g12Var.m();
        ue3.F(textInputLayout2, g12Var.h0, g12Var.i0);
        ue3.F(textInputLayout2, checkableImageButton, g12Var.p0);
        if (g12Var.b() instanceof yw1) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                ue3.b(textInputLayout, checkableImageButton, g12Var.p0, g12Var.q0);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        yg7 yg7Var = this.g0;
        ue3.F(yg7Var.f0, yg7Var.i0, yg7Var.j0);
        if (this.U0 == 2) {
            int i2 = this.W0;
            if (z && isEnabled()) {
                i = this.Y0;
                this.W0 = i;
            } else {
                i = this.X0;
                this.W0 = i;
            }
            if (i != i2 && g() && !this.x1) {
                if (g()) {
                    ((t81) this.L0).F(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U0 == 1) {
            if (!isEnabled()) {
                this.a1 = this.s1;
            } else if (z2 && !z) {
                this.a1 = this.u1;
            } else if (z) {
                this.a1 = this.t1;
            } else {
                this.a1 = this.r1;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.j0;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.g0.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.g0.c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.h0.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h0.l0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h0.l0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h0.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        g12 g12Var = this.h0;
        TextInputLayout textInputLayout = g12Var.f0;
        CheckableImageButton checkableImageButton = g12Var.l0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ue3.b(textInputLayout, checkableImageButton, g12Var.p0, g12Var.q0);
            ue3.F(textInputLayout, checkableImageButton, g12Var.p0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.textInputStyle);
    }
}

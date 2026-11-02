package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import defpackage.c98;
import defpackage.mr4;
import defpackage.o56;
import defpackage.u26;
import defpackage.u70;
import defpackage.v56;
import defpackage.w26;
import defpackage.yn0;
import defpackage.ys0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int l0 = o56.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] m0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j0;
    public boolean k0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = l0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = c98.d(context2, attributeSet, v56.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayD.hasValue(v56.MaterialRadioButton_buttonTint)) {
            setButtonTintList(ys0.x(context2, typedArrayD, v56.MaterialRadioButton_buttonTint));
        }
        if (typedArrayD.hasValue(v56.MaterialRadioButton_rippleColor)) {
            setRippleColor(ys0.x(context2, typedArrayD, v56.MaterialRadioButton_rippleColor));
        }
        this.k0 = typedArrayD.getBoolean(v56.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayD.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.j0;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB0 = yn0.b0(getContext(), u70.j0(this, w26.colorControlActivated));
        int iB1 = yn0.b0(getContext(), u70.j0(this, u26.colorOnSurface));
        int iB2 = yn0.b0(getContext(), u70.j0(this, u26.colorSurface));
        ColorStateList colorStateList2 = new ColorStateList(m0, new int[]{yn0.N(iB2, 1.0f, iB0), yn0.N(iB2, 0.54f, iB1), yn0.N(iB2, 0.38f, iB1), yn0.N(iB2, 0.38f, iB1)});
        this.j0 = colorStateList2;
        return colorStateList2;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k0 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.radioButtonStyle);
    }
}

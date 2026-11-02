package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import defpackage.ar4;
import defpackage.bt7;
import defpackage.c46;
import defpackage.c98;
import defpackage.h56;
import defpackage.i20;
import defpackage.mi;
import defpackage.mr4;
import defpackage.o56;
import defpackage.p36;
import defpackage.p61;
import defpackage.u26;
import defpackage.u70;
import defpackage.uj;
import defpackage.v56;
import defpackage.vj;
import defpackage.w26;
import defpackage.wj;
import defpackage.xf6;
import defpackage.xj;
import defpackage.xw3;
import defpackage.yn0;
import defpackage.ys0;
import defpackage.z4;
import defpackage.zv7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int D0 = o56.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] E0 = {u26.state_indeterminate};
    public static final int[] F0;
    public static final int[][] G0;
    public static final int H0;
    public CompoundButton.OnCheckedChangeListener A0;
    public final xj B0;
    public final i20 C0;
    public final LinkedHashSet j0;
    public final LinkedHashSet k0;
    public ColorStateList l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public CharSequence p0;
    public Drawable q0;
    public Drawable r0;
    public boolean s0;
    public ColorStateList t0;
    public ColorStateList u0;
    public PorterDuff.Mode v0;
    public int w0;
    public int[] x0;
    public boolean y0;
    public CharSequence z0;

    static {
        int i = u26.state_error;
        F0 = new int[]{i};
        G0 = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        H0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = D0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.j0 = new LinkedHashSet();
        this.k0 = new LinkedHashSet();
        Context context2 = getContext();
        int i3 = p36.mtrl_checkbox_button_checked_unchecked;
        xj xjVar = new xj(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = xf6.a;
        Drawable drawable = resources.getDrawable(i3, theme);
        drawable.setCallback(xjVar.h0);
        new vj(drawable.getConstantState());
        xjVar.X = drawable;
        this.B0 = xjVar;
        this.C0 = new i20(this, (byte) 2);
        Context context3 = getContext();
        this.q0 = getButtonDrawable();
        this.t0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = v56.MaterialCheckBox;
        c98.a(context3, attributeSet, i, i2);
        c98.b(context3, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, i, i2);
        zv7 zv7Var = new zv7(context3, typedArrayObtainStyledAttributes);
        this.r0 = zv7Var.e(v56.MaterialCheckBox_buttonIcon);
        if (this.q0 != null) {
            if (u70.f0(context3.getTheme(), u26.isMaterial3Theme, false)) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCheckBox_android_button, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCheckBox_buttonCompat, 0);
                if (resourceId == H0 && resourceId2 == 0) {
                    super.setButtonDrawable((Drawable) null);
                    this.q0 = u70.O(context3, p36.mtrl_checkbox_button);
                    this.s0 = true;
                    if (this.r0 == null) {
                        this.r0 = u70.O(context3, p36.mtrl_checkbox_button_icon);
                    }
                }
            }
        }
        this.u0 = ys0.w(context3, zv7Var, v56.MaterialCheckBox_buttonIconTint);
        this.v0 = bt7.g(typedArrayObtainStyledAttributes.getInt(v56.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.m0 = typedArrayObtainStyledAttributes.getBoolean(v56.MaterialCheckBox_useMaterialThemeColors, false);
        this.n0 = typedArrayObtainStyledAttributes.getBoolean(v56.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.o0 = typedArrayObtainStyledAttributes.getBoolean(v56.MaterialCheckBox_errorShown, false);
        this.p0 = typedArrayObtainStyledAttributes.getText(v56.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArrayObtainStyledAttributes.hasValue(v56.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(v56.MaterialCheckBox_checkedState, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.MaterialCheckBox_rippleColor)) {
            setRippleColor(ys0.w(context3, zv7Var, v56.MaterialCheckBox_rippleColor));
        }
        zv7Var.v();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.w0;
        if (i == 1) {
            return getResources().getString(h56.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(h56.mtrl_checkbox_state_description_unchecked) : getResources().getString(h56.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.l0;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB0 = yn0.b0(getContext(), u70.j0(this, w26.colorControlActivated));
        int iB1 = yn0.b0(getContext(), u70.j0(this, w26.colorError));
        int iB2 = yn0.b0(getContext(), u70.j0(this, u26.colorSurface));
        int iB3 = yn0.b0(getContext(), u70.j0(this, u26.colorOnSurface));
        ColorStateList colorStateList2 = new ColorStateList(G0, new int[]{yn0.N(iB2, 1.0f, iB1), yn0.N(iB2, 1.0f, iB0), yn0.N(iB2, 0.54f, iB3), yn0.N(iB2, 0.38f, iB3), yn0.N(iB2, 0.38f, iB3)});
        this.l0 = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.t0;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
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

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        z4 z4Var;
        Drawable drawableMutate = this.q0;
        ColorStateList colorStateList3 = this.t0;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.q0 = drawableMutate;
        Drawable drawableMutate2 = this.r0;
        ColorStateList colorStateList4 = this.u0;
        PorterDuff.Mode mode = this.v0;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.r0 = drawableMutate2;
        if (this.s0) {
            xj xjVar = this.B0;
            if (xjVar != null) {
                uj ujVar = xjVar.Y;
                i20 i20Var = this.C0;
                if (i20Var != null) {
                    Drawable drawable = xjVar.X;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        mi miVar = i20Var.a;
                        if (miVar == null) {
                            miVar = new mi(i20Var);
                            i20Var.a = miVar;
                        }
                        wj.c(animatedVectorDrawable, miVar);
                    }
                    ArrayList arrayList = xjVar.g0;
                    if (arrayList != null) {
                        arrayList.remove(i20Var);
                        if (xjVar.g0.size() == 0 && (z4Var = xjVar.f0) != null) {
                            ujVar.b.removeListener(z4Var);
                            xjVar.f0 = null;
                        }
                    }
                }
                if (i20Var != null) {
                    Drawable drawable2 = xjVar.X;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        mi miVar2 = i20Var.a;
                        if (miVar2 == null) {
                            miVar2 = new mi(i20Var);
                            i20Var.a = miVar2;
                        }
                        wj.b(animatedVectorDrawable2, miVar2);
                    } else {
                        ArrayList arrayList2 = xjVar.g0;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            xjVar.g0 = arrayList2;
                        }
                        if (!arrayList2.contains(i20Var)) {
                            xjVar.g0.add(i20Var);
                            z4 z4Var2 = xjVar.f0;
                            if (z4Var2 == null) {
                                z4Var2 = new z4(xjVar, (byte) 1);
                                xjVar.f0 = z4Var2;
                            }
                            ujVar.b.addListener(z4Var2);
                        }
                    }
                }
            }
            Drawable drawable3 = this.q0;
            if ((drawable3 instanceof AnimatedStateListDrawable) && xjVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(c46.checked, c46.unchecked, xjVar, false);
                ((AnimatedStateListDrawable) this.q0).addTransition(c46.indeterminate, c46.unchecked, xjVar, false);
            }
        }
        Drawable drawable4 = this.q0;
        if (drawable4 != null && (colorStateList2 = this.t0) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.r0;
        if (drawable5 != null && (colorStateList = this.u0) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q0;
        Drawable drawable7 = this.r0;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.q0;
    }

    public Drawable getButtonIconDrawable() {
        return this.r0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.u0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.v0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.t0;
    }

    public int getCheckedState() {
        return this.w0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.p0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.w0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m0 && this.t0 == null && this.u0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E0);
        }
        if (this.o0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F0);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.x0 = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.x0 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.n0 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.o0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.p0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ar4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ar4 ar4Var = (ar4) parcelable;
        super.onRestoreInstanceState(ar4Var.getSuperState());
        setCheckedState(ar4Var.X);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ar4 ar4Var = new ar4(super.onSaveInstanceState());
        ar4Var.X = getCheckedState();
        return ar4Var;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(u70.O(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.r0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(u70.O(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.u0 == colorStateList) {
            return;
        }
        this.u0 = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.v0 == mode) {
            return;
        }
        this.v0 = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.t0 == colorStateList) {
            return;
        }
        this.t0 = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.n0 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerB;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.w0 != i) {
            this.w0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.z0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.y0) {
                return;
            }
            this.y0 = true;
            LinkedHashSet linkedHashSet = this.k0;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
            }
            if (this.w0 != 2 && (onCheckedChangeListener = this.A0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManagerB = xw3.b(getContext().getSystemService(xw3.d()))) != null) {
                autofillManagerB.notifyValueChanged(this);
            }
            this.y0 = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.p0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.o0 == z) {
            return;
        }
        this.o0 = z;
        refreshDrawableState();
        Iterator it = this.j0.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.z0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.m0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.q0 = drawable;
        this.s0 = false;
        a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.checkboxStyle);
    }
}

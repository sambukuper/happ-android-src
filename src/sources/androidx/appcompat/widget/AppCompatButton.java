package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.cq;
import defpackage.cy8;
import defpackage.d7;
import defpackage.d98;
import defpackage.hp;
import defpackage.hw7;
import defpackage.sq;
import defpackage.tq;
import defpackage.w26;
import defpackage.zq;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {
    public final d7 f0;
    public final tq g0;
    public cq h0;
    public sq i0;

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d98.a(this, getContext());
        d7 d7Var = new d7(this);
        this.f0 = d7Var;
        d7Var.z(attributeSet, i);
        tq tqVar = new tq(this);
        this.g0 = tqVar;
        tqVar.h(attributeSet, i);
        tqVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private cq getEmojiTextViewHelper() {
        cq cqVar = this.h0;
        if (cqVar != null) {
            return cqVar;
        }
        cq cqVar2 = new cq(this);
        this.h0 = cqVar2;
        return cqVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.b();
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cy8.c) {
            return super.getAutoSizeMaxTextSize();
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            return Math.round(tqVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cy8.c) {
            return super.getAutoSizeMinTextSize();
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            return Math.round(tqVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cy8.c) {
            return super.getAutoSizeStepGranularity();
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            return Math.round(tqVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cy8.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        tq tqVar = this.g0;
        return tqVar != null ? tqVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (cy8.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            return tqVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hw7.i(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public sq getFontVariationSettingsManager() {
        sq sqVar = this.i0;
        if (sqVar != null) {
            return sqVar;
        }
        sq sqVar2 = new sq(this, new hp(this, (byte) 0));
        this.i0 = sqVar2;
        return sqVar2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            return d7Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            return d7Var.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g0.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g0.g();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tq tqVar = this.g0;
        if (tqVar == null || cy8.c) {
            return;
        }
        tqVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        tq tqVar = this.g0;
        if (tqVar != null) {
            zq zqVar = tqVar.i;
            if (cy8.c || !zqVar.e()) {
                return;
            }
            zqVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (cy8.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (cy8.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.k(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (cy8.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.l(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.C(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hw7.k(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    public void setSupportAllCaps(boolean z) {
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.N(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        tq tqVar = this.g0;
        tqVar.m(colorStateList);
        tqVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        tq tqVar = this.g0;
        tqVar.n(mode);
        tqVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = cy8.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        tq tqVar = this.g0;
        if (tqVar != null) {
            zq zqVar = tqVar.i;
            if (z || zqVar.e()) {
                return;
            }
            zqVar.f(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        sq fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.buttonStyle);
    }
}

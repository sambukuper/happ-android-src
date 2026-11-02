package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import defpackage.cq;
import defpackage.d7;
import defpackage.d98;
import defpackage.tq;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {
    public final d7 f0;
    public final tq g0;
    public cq h0;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d98.a(this, getContext());
        d7 d7Var = new d7(this);
        this.f0 = d7Var;
        d7Var.z(attributeSet, i);
        tq tqVar = new tq(this);
        this.g0 = tqVar;
        tqVar.h(attributeSet, i);
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

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }
}

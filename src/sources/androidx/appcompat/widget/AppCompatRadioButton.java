package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import defpackage.cq;
import defpackage.d7;
import defpackage.d98;
import defpackage.jp;
import defpackage.tq;
import defpackage.u70;
import defpackage.w26;
import defpackage.za8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements za8 {
    public final jp f0;
    public final d7 g0;
    public final tq h0;
    public cq i0;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d98.a(this, getContext());
        jp jpVar = new jp(this, (byte) 1);
        this.f0 = jpVar;
        jpVar.d(attributeSet, i);
        d7 d7Var = new d7(this);
        this.g0 = d7Var;
        d7Var.z(attributeSet, i);
        tq tqVar = new tq(this);
        this.h0 = tqVar;
        tqVar.h(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private cq getEmojiTextViewHelper() {
        cq cqVar = this.i0;
        if (cqVar != null) {
            return cqVar;
        }
        cq cqVar2 = new cq(this);
        this.i0 = cqVar2;
        return cqVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d7 d7Var = this.g0;
        if (d7Var != null) {
            d7Var.b();
        }
        tq tqVar = this.h0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d7 d7Var = this.g0;
        if (d7Var != null) {
            return d7Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d7 d7Var = this.g0;
        if (d7Var != null) {
            return d7Var.w();
        }
        return null;
    }

    @Override // defpackage.za8
    public ColorStateList getSupportButtonTintList() {
        jp jpVar = this.f0;
        if (jpVar != null) {
            return (ColorStateList) jpVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        jp jpVar = this.f0;
        if (jpVar != null) {
            return (PorterDuff.Mode) jpVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h0.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h0.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d7 d7Var = this.g0;
        if (d7Var != null) {
            d7Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d7 d7Var = this.g0;
        if (d7Var != null) {
            d7Var.C(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        jp jpVar = this.f0;
        if (jpVar != null) {
            if (jpVar.f) {
                jpVar.f = false;
            } else {
                jpVar.f = true;
                jpVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        tq tqVar = this.h0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        tq tqVar = this.h0;
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
        d7 d7Var = this.g0;
        if (d7Var != null) {
            d7Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d7 d7Var = this.g0;
        if (d7Var != null) {
            d7Var.N(mode);
        }
    }

    @Override // defpackage.za8
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        jp jpVar = this.f0;
        if (jpVar != null) {
            jpVar.b = colorStateList;
            jpVar.d = true;
            jpVar.b();
        }
    }

    @Override // defpackage.za8
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        jp jpVar = this.f0;
        if (jpVar != null) {
            jpVar.c = mode;
            jpVar.e = true;
            jpVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        tq tqVar = this.h0;
        tqVar.m(colorStateList);
        tqVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        tq tqVar = this.h0;
        tqVar.n(mode);
        tqVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(u70.O(getContext(), i));
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.radioButtonStyle);
    }
}

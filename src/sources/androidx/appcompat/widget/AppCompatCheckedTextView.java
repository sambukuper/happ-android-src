package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import defpackage.cq;
import defpackage.cw8;
import defpackage.d7;
import defpackage.d98;
import defpackage.dw1;
import defpackage.h66;
import defpackage.hw7;
import defpackage.jp;
import defpackage.pu;
import defpackage.tq;
import defpackage.u70;
import defpackage.w26;
import defpackage.zv7;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {
    public final jp f0;
    public final d7 g0;
    public final tq h0;
    public cq i0;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i);
        d98.a(this, getContext());
        tq tqVar = new tq(this);
        this.h0 = tqVar;
        tqVar.h(attributeSet, i);
        tqVar.b();
        d7 d7Var = new d7(this);
        this.g0 = d7Var;
        d7Var.z(attributeSet, i);
        this.f0 = new jp(this, (byte) 0);
        zv7 zv7VarR = zv7.r(i, 0, getContext(), attributeSet, h66.CheckedTextView);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        cw8.m(this, getContext(), h66.CheckedTextView, attributeSet, (TypedArray) zv7VarR.Y, i);
        try {
            if (typedArray.hasValue(h66.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(h66.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(u70.O(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(h66.CheckedTextView_android_checkMark)) {
                        setCheckMarkDrawable(u70.O(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(h66.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(h66.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(u70.O(getContext(), resourceId));
            }
            if (typedArray.hasValue(h66.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(zv7VarR.c(h66.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(h66.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(dw1.c(typedArray.getInt(h66.CheckedTextView_checkMarkTintMode, -1), null));
            }
            zv7VarR.v();
            getEmojiTextViewHelper().b(attributeSet, i);
        } catch (Throwable th) {
            zv7VarR.v();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        tq tqVar = this.h0;
        if (tqVar != null) {
            tqVar.b();
        }
        d7 d7Var = this.g0;
        if (d7Var != null) {
            d7Var.b();
        }
        jp jpVar = this.f0;
        if (jpVar != null) {
            jpVar.c();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hw7.i(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        jp jpVar = this.f0;
        if (jpVar != null) {
            return (ColorStateList) jpVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        pu.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        jp jpVar = this.f0;
        if (jpVar != null) {
            if (jpVar.f) {
                jpVar.f = false;
            } else {
                jpVar.f = true;
                jpVar.c();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hw7.k(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        jp jpVar = this.f0;
        if (jpVar != null) {
            jpVar.b = colorStateList;
            jpVar.d = true;
            jpVar.c();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        jp jpVar = this.f0;
        if (jpVar != null) {
            jpVar.c = mode;
            jpVar.e = true;
            jpVar.c();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tq tqVar = this.h0;
        if (tqVar != null) {
            tqVar.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(u70.O(getContext(), i));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.checkedTextViewStyle);
    }
}

package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.bq;
import defpackage.cw8;
import defpackage.d7;
import defpackage.d98;
import defpackage.dq;
import defpackage.hp;
import defpackage.hw7;
import defpackage.o61;
import defpackage.p41;
import defpackage.pu;
import defpackage.py1;
import defpackage.q41;
import defpackage.r41;
import defpackage.sq;
import defpackage.t41;
import defpackage.tq;
import defpackage.ue3;
import defpackage.vr3;
import defpackage.w26;
import defpackage.y88;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText {
    public final d7 f0;
    public final tq g0;
    public final dq h0;
    public final y88 i0;
    public final dq j0;
    public bq k0;
    public sq l0;

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d98.a(this, getContext());
        d7 d7Var = new d7(this);
        this.f0 = d7Var;
        d7Var.z(attributeSet, i);
        tq tqVar = new tq(this);
        this.g0 = tqVar;
        tqVar.h(attributeSet, i);
        tqVar.b();
        dq dqVar = new dq((byte) 18, false);
        dqVar.Y = this;
        this.h0 = dqVar;
        this.i0 = new y88();
        dq dqVar2 = new dq(this);
        this.j0 = dqVar2;
        dqVar2.A(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerW = dqVar2.w(keyListener);
        if (keyListenerW == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerW);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private bq getSuperCaller() {
        bq bqVar = this.k0;
        if (bqVar != null) {
            return bqVar;
        }
        bq bqVar2 = new bq(this);
        this.k0 = bqVar2;
        return bqVar2;
    }

    public final t41 b(t41 t41Var) {
        this.i0.getClass();
        return y88.a(this, t41Var);
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hw7.i(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public sq getFontVariationSettingsManager() {
        sq sqVar = this.l0;
        if (sqVar != null) {
            return sqVar;
        }
        sq sqVar2 = new sq(this, new hp(this, (byte) 1));
        this.l0 = sqVar2;
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        dq dqVar;
        if (Build.VERSION.SDK_INT >= 28 || (dqVar = this.h0) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) dqVar.Z;
        return textClassifier == null ? ue3.x((TextView) dqVar.Y) : textClassifier;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g0.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            py1.d(editorInfo, getText());
        }
        pu.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrH = cw8.h(this)) != null) {
            py1.c(editorInfo, strArrH);
            inputConnectionOnCreateInputConnection = vr3.s(inputConnectionOnCreateInputConnection, editorInfo, new o61(this, (byte) 11));
        }
        return this.j0.E(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        q41 p41Var;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && cw8.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        p41Var = new p41(clipData, 3);
                    } else {
                        r41 r41Var = new r41();
                        r41Var.b = clipData;
                        r41Var.c = (byte) 3;
                        p41Var = r41Var;
                    }
                    cw8.j(this, p41Var.build());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        r41 r41Var;
        q41 q41Var;
        int i2;
        p41 p41Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || cw8.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                p41Var = new p41(primaryClip, 1);
            } else {
                r41Var = new r41();
                r41Var.b = primaryClip;
                r41Var.c = (byte) 1;
            }
            if (i == 16908322) {
                q41Var = r41Var;
                q41Var = p41Var;
                i2 = 0;
            } else {
                q41Var = r41Var;
                q41Var = p41Var;
                i2 = 1;
            }
            q41Var.c(i2);
            cw8.j(this, q41Var.build());
        }
        return true;
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hw7.k(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j0.M(z);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j0.w(keyListener));
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        dq dqVar;
        if (Build.VERSION.SDK_INT >= 28 || (dqVar = this.h0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            dqVar.Z = textClassifier;
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

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.editTextStyle);
    }
}

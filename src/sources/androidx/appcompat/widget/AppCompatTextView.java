package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.bt;
import defpackage.cq;
import defpackage.cy8;
import defpackage.d7;
import defpackage.d98;
import defpackage.dq;
import defpackage.g28;
import defpackage.hj8;
import defpackage.hp;
import defpackage.hw7;
import defpackage.pu;
import defpackage.py1;
import defpackage.sq;
import defpackage.tq;
import defpackage.u3;
import defpackage.u70;
import defpackage.ue3;
import defpackage.uq;
import defpackage.ur5;
import defpackage.vq;
import defpackage.vr5;
import defpackage.wl6;
import defpackage.wq;
import defpackage.zq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    public final d7 f0;
    public final tq g0;
    public final dq h0;
    public cq i0;
    public boolean j0;
    public wl6 k0;
    public Future l0;
    public sq m0;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j0 = false;
        this.k0 = null;
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
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public sq getFontVariationSettingsManager() {
        sq sqVar = this.m0;
        if (sqVar != null) {
            return sqVar;
        }
        sq sqVar2 = new sq(this, new hp(this, (byte) 2));
        this.m0 = sqVar2;
        return sqVar2;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public uq getSuperCaller() {
        wl6 wl6Var = this.k0;
        if (wl6Var != null) {
            return wl6Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            wq wqVar = new wq(this);
            this.k0 = wqVar;
            return wqVar;
        }
        if (i >= 28) {
            vq vqVar = new vq(this);
            this.k0 = vqVar;
            return vqVar;
        }
        if (i < 26) {
            return wl6Var;
        }
        wl6 wl6Var2 = new wl6((Object) this, (byte) 8);
        this.k0 = wl6Var2;
        return wl6Var2;
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
    public CharSequence getText() {
        Future future = this.l0;
        if (future != null) {
            try {
                this.l0 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                hw7.d(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
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

    public ur5 getTextMetricsParamsCompat() {
        return hw7.d(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g0.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            py1.d(editorInfo, getText());
        }
        pu.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tq tqVar = this.g0;
        if (tqVar == null || cy8.c) {
            return;
        }
        tqVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.l0;
        if (future != null) {
            try {
                this.l0 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                hw7.d(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? u70.O(context, i) : null, i2 != 0 ? u70.O(context, i2) : null, i3 != 0 ? u70.O(context, i3) : null, i4 != 0 ? u70.O(context, i4) : null);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? u70.O(context, i) : null, i2 != 0 ? u70.O(context, i2) : null, i3 != 0 ? u70.O(context, i3) : null, i4 != 0 ? u70.O(context, i4) : null);
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
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().E(i);
        } else {
            hw7.f(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().y(i);
        } else {
            hw7.g(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().I(i, f);
        } else if (i2 >= 34) {
            u3.F(this, i, f);
        } else {
            hw7.h(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(vr5 vr5Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        hw7.d(this);
        throw null;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        dq dqVar;
        if (Build.VERSION.SDK_INT >= 28 || (dqVar = this.h0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            dqVar.Z = textClassifier;
        }
    }

    public void setTextFuture(Future<vr5> future) {
        this.l0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(ur5 ur5Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = ur5Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(ur5Var.a);
        setBreakStrategy(ur5Var.c);
        setHyphenationFrequency(ur5Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
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
    public final void setTypeface(Typeface typeface, int i) {
        if (this.j0) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            g28 g28Var = hj8.a;
            if (context == null) {
                bt.q("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.j0 = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.j0 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        hw7.h(this, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            sq fontVariationSettingsManager = getFontVariationSettingsManager();
            fontVariationSettingsManager.c = typeface;
            fontVariationSettingsManager.d = typeface;
            fontVariationSettingsManager.b.accept(typeface);
            return;
        }
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        tq tqVar = this.g0;
        if (tqVar != null) {
            tqVar.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}

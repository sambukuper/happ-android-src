package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yg7 extends LinearLayout {
    public final TextInputLayout f0;
    public final AppCompatTextView g0;
    public CharSequence h0;
    public final CheckableImageButton i0;
    public ColorStateList j0;
    public PorterDuff.Mode k0;
    public int l0;
    public ImageView.ScaleType m0;
    public View.OnLongClickListener n0;
    public boolean o0;

    public yg7(TextInputLayout textInputLayout, zv7 zv7Var) {
        super(textInputLayout.getContext());
        this.f0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(s46.design_text_input_start_icon, (ViewGroup) this, false);
        this.i0 = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.g0 = appCompatTextView;
        if (ys0.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n0;
        checkableImageButton.setOnClickListener(null);
        ue3.W(checkableImageButton, onLongClickListener);
        this.n0 = null;
        checkableImageButton.setOnLongClickListener(null);
        ue3.W(checkableImageButton, null);
        int i = v56.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) zv7Var.Y;
        if (typedArray.hasValue(i)) {
            this.j0 = ys0.w(getContext(), zv7Var, v56.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(v56.TextInputLayout_startIconTintMode)) {
            this.k0 = bt7.g(typedArray.getInt(v56.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(v56.TextInputLayout_startIconDrawable)) {
            c(zv7Var.e(v56.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(v56.TextInputLayout_startIconContentDescription)) {
                b(typedArray.getText(v56.TextInputLayout_startIconContentDescription));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(v56.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(v56.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(j36.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            bt.q("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.l0) {
            this.l0 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(v56.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeI = ue3.i(typedArray.getInt(v56.TextInputLayout_startIconScaleType, -1));
            this.m0 = scaleTypeI;
            checkableImageButton.setScaleType(scaleTypeI);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(c46.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(v56.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(v56.TextInputLayout_prefixTextColor)) {
            appCompatTextView.setTextColor(zv7Var.c(v56.TextInputLayout_prefixTextColor));
        }
        CharSequence text = typedArray.getText(v56.TextInputLayout_prefixText);
        this.h0 = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        f();
        addView(checkableImageButton);
        addView(appCompatTextView);
        checkableImageButton.setOnFocusableChangedListener(new o61(this, (byte) 27));
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.i0;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.g0.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.i0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            ue3.m0(checkableImageButton, this.n0, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.j0;
            PorterDuff.Mode mode = this.k0;
            TextInputLayout textInputLayout = this.f0;
            ue3.b(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            ue3.F(textInputLayout, checkableImageButton, this.j0);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.n0;
        checkableImageButton.setOnClickListener(null);
        ue3.W(checkableImageButton, onLongClickListener);
        this.n0 = null;
        checkableImageButton.setOnLongClickListener(null);
        ue3.W(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.i0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f0.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.f0.j0;
        if (editText == null) {
            return;
        }
        this.g0.setPaddingRelative(this.i0.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(j36.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i = (this.h0 == null || this.o0) ? 8 : 0;
        setVisibility((this.i0.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.g0.setVisibility(i);
        this.f0.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        e();
    }
}

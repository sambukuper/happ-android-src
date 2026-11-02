package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g12 extends LinearLayout {
    public final e12 A0;
    public final TextInputLayout f0;
    public final FrameLayout g0;
    public final CheckableImageButton h0;
    public ColorStateList i0;
    public PorterDuff.Mode j0;
    public View.OnLongClickListener k0;
    public final CheckableImageButton l0;
    public final nv0 m0;
    public int n0;
    public final LinkedHashSet o0;
    public ColorStateList p0;
    public PorterDuff.Mode q0;
    public int r0;
    public ImageView.ScaleType s0;
    public View.OnLongClickListener t0;
    public CharSequence u0;
    public final AppCompatTextView v0;
    public boolean w0;
    public EditText x0;
    public final AccessibilityManager y0;
    public AccessibilityManager.TouchExplorationStateChangeListener z0;

    public g12(TextInputLayout textInputLayout, zv7 zv7Var) {
        super(textInputLayout.getContext());
        final byte b = 0;
        this.n0 = 0;
        this.o0 = new LinkedHashSet();
        this.A0 = new e12(this);
        f12 f12Var = new f12(this);
        this.y0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(c46.text_input_error_icon, layoutInflaterFrom, this);
        this.h0 = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(c46.text_input_end_icon, layoutInflaterFrom, frameLayout);
        this.l0 = checkableImageButtonA2;
        nv0 nv0Var = new nv0();
        nv0Var.Z = new SparseArray();
        nv0Var.f0 = this;
        int i = v56.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) zv7Var.Y;
        nv0Var.X = typedArray.getResourceId(i, 0);
        nv0Var.Y = typedArray.getResourceId(v56.TextInputLayout_passwordToggleDrawable, 0);
        this.m0 = nv0Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.v0 = appCompatTextView;
        int i2 = v56.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) zv7Var.Y;
        if (typedArray2.hasValue(i2)) {
            this.i0 = ys0.w(getContext(), zv7Var, v56.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(v56.TextInputLayout_errorIconTintMode)) {
            this.j0 = bt7.g(typedArray2.getInt(v56.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(v56.TextInputLayout_errorIconDrawable)) {
            j(zv7Var.e(v56.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(h56.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(v56.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(v56.TextInputLayout_endIconTint)) {
                this.p0 = ys0.w(getContext(), zv7Var, v56.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(v56.TextInputLayout_endIconTintMode)) {
                this.q0 = bt7.g(typedArray2.getInt(v56.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray2.hasValue(v56.TextInputLayout_endIconMode)) {
            h(typedArray2.getInt(v56.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(v56.TextInputLayout_endIconContentDescription)) {
                g(typedArray2.getText(v56.TextInputLayout_endIconContentDescription));
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(v56.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(v56.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(v56.TextInputLayout_passwordToggleTint)) {
                this.p0 = ys0.w(getContext(), zv7Var, v56.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(v56.TextInputLayout_passwordToggleTintMode)) {
                this.q0 = bt7.g(typedArray2.getInt(v56.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            h(typedArray2.getBoolean(v56.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            g(typedArray2.getText(v56.TextInputLayout_passwordToggleContentDescription));
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(v56.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(j36.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            bt.q("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.r0) {
            this.r0 = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(v56.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeI = ue3.i(typedArray2.getInt(v56.TextInputLayout_endIconScaleType, -1));
            this.s0 = scaleTypeI;
            checkableImageButtonA2.setScaleType(scaleTypeI);
            checkableImageButtonA.setScaleType(scaleTypeI);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(c46.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(v56.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray2.hasValue(v56.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(zv7Var.c(v56.TextInputLayout_suffixTextColor));
        }
        CharSequence text = typedArray2.getText(v56.TextInputLayout_suffixText);
        this.u0 = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        o();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        checkableImageButtonA.setOnFocusableChangedListener(new cr0(this) { // from class: d12
            public final /* synthetic */ g12 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.cr0
            public final void b() {
                byte b2 = b;
                g12 g12Var = this.Y;
                switch (b2) {
                    case 0:
                        CheckableImageButton checkableImageButton = g12Var.h0;
                        ue3.m0(checkableImageButton, g12Var.k0, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = g12Var.l0;
                        ue3.m0(checkableImageButton2, g12Var.t0, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        final byte b2 = 1;
        checkableImageButtonA2.setOnFocusableChangedListener(new cr0(this) { // from class: d12
            public final /* synthetic */ g12 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.cr0
            public final void b() {
                byte b3 = b2;
                g12 g12Var = this.Y;
                switch (b3) {
                    case 0:
                        CheckableImageButton checkableImageButton = g12Var.h0;
                        ue3.m0(checkableImageButton, g12Var.k0, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = g12Var.l0;
                        ue3.m0(checkableImageButton2, g12Var.t0, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.h1.add(f12Var);
        if (textInputLayout.j0 != null) {
            f12Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ge(this, (byte) 2));
    }

    public final CheckableImageButton a(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(s46.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ys0.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final h12 b() {
        h12 n81Var;
        int i = this.n0;
        nv0 nv0Var = this.m0;
        SparseArray sparseArray = (SparseArray) nv0Var.Z;
        h12 h12Var = (h12) sparseArray.get(i);
        if (h12Var != null) {
            return h12Var;
        }
        g12 g12Var = (g12) nv0Var.f0;
        if (i != -1) {
            byte b = 1;
            if (i == 0) {
                n81Var = new n81(g12Var, b);
            } else if (i == 1) {
                n81Var = new ni5(g12Var, nv0Var.Y);
            } else if (i == 2) {
                n81Var = new wt0(g12Var);
            } else {
                if (i != 3) {
                    bt.q(pc6.j(i, "Invalid end icon mode: "));
                    return null;
                }
                n81Var = new yw1(g12Var);
            }
        } else {
            n81Var = new n81(g12Var, (byte) 0);
        }
        sparseArray.append(i, n81Var);
        return n81Var;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.l0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.v0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.g0.getVisibility() == 0 && this.l0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.h0.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        h12 h12VarB = b();
        boolean zJ = h12VarB.j();
        CheckableImageButton checkableImageButton = this.l0;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.i0) == h12VarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(h12VarB instanceof yw1) || (zIsActivated = checkableImageButton.isActivated()) == ((yw1) h12VarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ue3.F(this.f0, checkableImageButton, this.p0);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.l0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            ue3.m0(checkableImageButton, this.t0, charSequence);
        }
    }

    public final void h(int i) {
        if (this.n0 == i) {
            return;
        }
        h12 h12VarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.z0;
        AccessibilityManager accessibilityManager = this.y0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.z0 = null;
        h12VarB.r();
        this.n0 = i;
        Iterator it = this.o0.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        i(i != 0);
        h12 h12VarB2 = b();
        int iD = this.m0.X;
        if (iD == 0) {
            iD = h12VarB2.d();
        }
        Drawable drawableO = iD != 0 ? u70.O(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.l0;
        checkableImageButton.setImageDrawable(drawableO);
        TextInputLayout textInputLayout = this.f0;
        if (drawableO != null) {
            ue3.b(textInputLayout, checkableImageButton, this.p0, this.q0);
            ue3.F(textInputLayout, checkableImageButton, this.p0);
        }
        checkableImageButton.setCheckable(h12VarB2.j());
        if (!h12VarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        h12VarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = h12VarB2.h();
        this.z0 = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.z0);
        }
        View.OnClickListener onClickListenerF = h12VarB2.f();
        View.OnLongClickListener onLongClickListener = this.t0;
        checkableImageButton.setOnClickListener(onClickListenerF);
        ue3.W(checkableImageButton, onLongClickListener);
        int iC = h12VarB2.c();
        g(iC != 0 ? getResources().getText(iC) : null);
        EditText editText = this.x0;
        if (editText != null) {
            h12VarB2.l(editText);
            k(h12VarB2);
        }
        ue3.b(textInputLayout, checkableImageButton, this.p0, this.q0);
        f(true);
    }

    public final void i(boolean z) {
        EditText editText;
        if (d() != z) {
            CheckableImageButton checkableImageButton = this.l0;
            if (!z && checkableImageButton.hasFocus() && (editText = this.x0) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            l();
            n();
            this.f0.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h0;
        checkableImageButton.setImageDrawable(drawable);
        m();
        ue3.b(this.f0, checkableImageButton, this.i0, this.j0);
    }

    public final void k(h12 h12Var) {
        if (this.x0 == null) {
            return;
        }
        if (h12Var.e() != null) {
            this.x0.setOnFocusChangeListener(h12Var.e());
        }
        if (h12Var.g() != null) {
            this.l0.setOnFocusChangeListener(h12Var.g());
        }
    }

    public final void l() {
        this.g0.setVisibility((this.l0.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.u0 == null || this.w0) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.h0;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f0;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.p0.q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.n0 != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.f0;
        if (textInputLayout.j0 == null) {
            return;
        }
        this.v0.setPaddingRelative(getContext().getResources().getDimensionPixelSize(j36.material_input_text_to_prefix_suffix_padding), textInputLayout.j0.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.j0.getPaddingEnd(), textInputLayout.j0.getPaddingBottom());
    }

    public final void o() {
        AppCompatTextView appCompatTextView = this.v0;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.u0 == null || this.w0) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        appCompatTextView.setVisibility(i);
        this.f0.s();
    }
}

package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a77;
import defpackage.br4;
import defpackage.c48;
import defpackage.c98;
import defpackage.cw8;
import defpackage.e48;
import defpackage.h70;
import defpackage.i21;
import defpackage.mr4;
import defpackage.my4;
import defpackage.n77;
import defpackage.o56;
import defpackage.pr0;
import defpackage.qr0;
import defpackage.r50;
import defpackage.rr0;
import defpackage.sr0;
import defpackage.tr0;
import defpackage.u26;
import defpackage.u52;
import defpackage.u70;
import defpackage.ur0;
import defpackage.v56;
import defpackage.w79;
import defpackage.ys0;
import defpackage.z28;
import defpackage.z51;
import java.lang.ref.WeakReference;
import java.util.Locale;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements tr0, n77, Checkable {
    public static final int B0 = o56.Widget_MaterialComponents_Chip_Action;
    public static final Rect C0 = new Rect();
    public static final int[] D0 = {R.attr.state_selected};
    public static final int[] E0 = {R.attr.state_checkable};
    public final qr0 A0;
    public ur0 j0;
    public InsetDrawable k0;
    public RippleDrawable l0;
    public View.OnClickListener m0;
    public CompoundButton.OnCheckedChangeListener n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public int u0;
    public CharSequence v0;
    public final sr0 w0;
    public boolean x0;
    public final Rect y0;
    public final RectF z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i2 = B0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.y0 = new Rect();
        this.z0 = new RectF();
        byte b = 0;
        this.A0 = new qr0(this, b);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                u52.k("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                u52.k("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                u52.k("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                u52.k("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                u52.k("Chip does not support multi-line text");
                throw null;
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        ur0 ur0Var = new ur0(context2, attributeSet, i);
        TypedArray typedArrayD = c98.d(ur0Var.p1, attributeSet, v56.Chip, i, i2, new int[0]);
        ur0Var.P1 = typedArrayD.hasValue(v56.Chip_shapeAppearance);
        int i3 = v56.Chip_chipSurfaceColor;
        Context context3 = ur0Var.p1;
        ColorStateList colorStateListX = ys0.x(context3, typedArrayD, i3);
        if (ur0Var.I0 != colorStateListX) {
            ur0Var.I0 = colorStateListX;
            ur0Var.onStateChange(ur0Var.getState());
        }
        ColorStateList colorStateListX2 = ys0.x(context3, typedArrayD, v56.Chip_chipBackgroundColor);
        if (ur0Var.J0 != colorStateListX2) {
            ur0Var.J0 = colorStateListX2;
            ur0Var.onStateChange(ur0Var.getState());
        }
        float dimension = typedArrayD.getDimension(v56.Chip_chipMinHeight, 0.0f);
        if (ur0Var.K0 != dimension) {
            ur0Var.K0 = dimension;
            ur0Var.invalidateSelf();
            ur0Var.M();
        }
        if (typedArrayD.hasValue(v56.Chip_chipCornerRadius)) {
            ur0Var.S(typedArrayD.getDimension(v56.Chip_chipCornerRadius, 0.0f));
        }
        ur0Var.X(ys0.x(context3, typedArrayD, v56.Chip_chipStrokeColor));
        ur0Var.Y(typedArrayD.getDimension(v56.Chip_chipStrokeWidth, 0.0f));
        ur0Var.i0(ys0.x(context3, typedArrayD, v56.Chip_rippleColor));
        CharSequence text = typedArrayD.getText(v56.Chip_android_text);
        text = text == null ? _UrlKt.FRAGMENT_ENCODE_SET : text;
        boolean zEquals = TextUtils.equals(ur0Var.P0, text);
        e48 e48Var = ur0Var.v1;
        if (!zEquals) {
            ur0Var.P0 = text;
            e48Var.d = true;
            ur0Var.invalidateSelf();
            ur0Var.M();
        }
        int i4 = v56.Chip_android_textAppearance;
        z28 z28Var = (!typedArrayD.hasValue(i4) || (resourceId3 = typedArrayD.getResourceId(i4, 0)) == 0) ? null : new z28(context3, resourceId3);
        z28Var.l = typedArrayD.getDimension(v56.Chip_android_textSize, z28Var.l);
        if (Build.VERSION.SDK_INT >= 26) {
            int i5 = v56.Chip_fontVariationSettings;
            i5 = typedArrayD.hasValue(i5) ? i5 : v56.Chip_android_fontVariationSettings;
            if (typedArrayD.hasValue(i5)) {
                z28Var.c = typedArrayD.getString(i5);
            }
        }
        e48Var.b(z28Var, context3);
        int i6 = typedArrayD.getInt(v56.Chip_android_ellipsize, 0);
        if (i6 == 1) {
            ur0Var.M1 = TextUtils.TruncateAt.START;
        } else if (i6 == 2) {
            ur0Var.M1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i6 == 3) {
            ur0Var.M1 = TextUtils.TruncateAt.END;
        }
        ur0Var.W(typedArrayD.getBoolean(v56.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            ur0Var.W(typedArrayD.getBoolean(v56.Chip_chipIconEnabled, false));
        }
        ur0Var.T(ys0.B(context3, typedArrayD, v56.Chip_chipIcon));
        if (typedArrayD.hasValue(v56.Chip_chipIconTint)) {
            ur0Var.V(ys0.x(context3, typedArrayD, v56.Chip_chipIconTint));
        }
        ur0Var.U(typedArrayD.getDimension(v56.Chip_chipIconSize, -1.0f));
        ur0Var.f0(typedArrayD.getBoolean(v56.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            ur0Var.f0(typedArrayD.getBoolean(v56.Chip_closeIconEnabled, false));
        }
        ur0Var.Z(ys0.B(context3, typedArrayD, v56.Chip_closeIcon));
        ur0Var.e0(ys0.x(context3, typedArrayD, v56.Chip_closeIconTint));
        ur0Var.b0(typedArrayD.getDimension(v56.Chip_closeIconSize, 0.0f));
        ur0Var.O(typedArrayD.getBoolean(v56.Chip_android_checkable, false));
        ur0Var.R(typedArrayD.getBoolean(v56.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            ur0Var.R(typedArrayD.getBoolean(v56.Chip_checkedIconEnabled, false));
        }
        ur0Var.P(ys0.B(context3, typedArrayD, v56.Chip_checkedIcon));
        if (typedArrayD.hasValue(v56.Chip_checkedIconTint)) {
            ur0Var.Q(ys0.x(context3, typedArrayD, v56.Chip_checkedIconTint));
        }
        int i7 = v56.Chip_showMotionSpec;
        ur0Var.f1 = (!typedArrayD.hasValue(i7) || (resourceId2 = typedArrayD.getResourceId(i7, 0)) == 0) ? null : my4.a(context3, resourceId2);
        int i8 = v56.Chip_hideMotionSpec;
        ur0Var.g1 = (!typedArrayD.hasValue(i8) || (resourceId = typedArrayD.getResourceId(i8, 0)) == 0) ? null : my4.a(context3, resourceId);
        float dimension2 = typedArrayD.getDimension(v56.Chip_chipStartPadding, 0.0f);
        if (ur0Var.h1 != dimension2) {
            ur0Var.h1 = dimension2;
            ur0Var.invalidateSelf();
            ur0Var.M();
        }
        ur0Var.h0(typedArrayD.getDimension(v56.Chip_iconStartPadding, 0.0f));
        ur0Var.g0(typedArrayD.getDimension(v56.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayD.getDimension(v56.Chip_textStartPadding, 0.0f);
        if (ur0Var.k1 != dimension3) {
            ur0Var.k1 = dimension3;
            ur0Var.invalidateSelf();
            ur0Var.M();
        }
        float dimension4 = typedArrayD.getDimension(v56.Chip_textEndPadding, 0.0f);
        if (ur0Var.l1 != dimension4) {
            ur0Var.l1 = dimension4;
            ur0Var.invalidateSelf();
            ur0Var.M();
        }
        ur0Var.c0(typedArrayD.getDimension(v56.Chip_closeIconStartPadding, 0.0f));
        ur0Var.a0(typedArrayD.getDimension(v56.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayD.getDimension(v56.Chip_chipEndPadding, 0.0f);
        if (ur0Var.o1 != dimension5) {
            ur0Var.o1 = dimension5;
            ur0Var.invalidateSelf();
            ur0Var.M();
        }
        ur0Var.O1 = typedArrayD.getDimensionPixelSize(v56.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayD.recycle();
        int[] iArr = v56.Chip;
        c98.a(context2, attributeSet, i, i2);
        c98.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.s0 = typedArrayObtainStyledAttributes.getBoolean(v56.Chip_ensureMinTouchTargetSize, false);
        this.u0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(v56.Chip_chipMinTouchTargetSize, u70.h0(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(ur0Var);
        ur0Var.s(getElevation());
        int[] iArr2 = v56.Chip;
        c98.a(context2, attributeSet, i, i2);
        c98.b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(v56.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.w0 = new sr0(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new rr0(this, b));
        }
        setChecked(this.o0);
        setText(ur0Var.P0);
        setEllipsize(ur0Var.M1);
        h();
        if (!this.j0.N1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.s0) {
            setMinHeight(this.u0);
        }
        this.t0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new pr0(this, b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.z0;
        rectF.setEmpty();
        if (d() && this.m0 != null) {
            ur0 ur0Var = this.j0;
            Rect bounds = ur0Var.getBounds();
            rectF.setEmpty();
            if (ur0Var.l0()) {
                float f = ur0Var.o1 + ur0Var.n1 + ur0Var.Z0 + ur0Var.m1 + ur0Var.l1;
                if (ur0Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.y0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private z28 getTextAppearance() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.v1.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.q0 != z) {
            this.q0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.p0 != z) {
            this.p0 = z;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.u0 = i;
        if (!this.s0) {
            InsetDrawable insetDrawable = this.k0;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.k0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.j0.K0));
        int iMax2 = Math.max(0, i - this.j0.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.k0;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.k0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.k0 != null) {
            Rect rect = new Rect();
            this.k0.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.k0 = new InsetDrawable((Drawable) this.j0, i2, i3, i2, i3);
        f();
    }

    public final boolean d() {
        ur0 ur0Var = this.j0;
        if (ur0Var == null) {
            return false;
        }
        Drawable drawable = ur0Var.W0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.x0) {
            return this.w0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.x0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sr0 sr0Var = this.w0;
        sr0Var.getClass();
        boolean zP = false;
        int i2 = 0;
        zP = false;
        zP = false;
        zP = false;
        zP = false;
        zP = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && sr0Var.p(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zP = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = sr0Var.n0;
                                if (i != Integer.MIN_VALUE) {
                                    sr0Var.r(i, 16, null);
                                }
                                zP = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = sr0Var.n0;
                    if (i != Integer.MIN_VALUE) {
                        sr0Var.r(i, 16, null);
                    }
                    zP = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zP = sr0Var.p(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zP = sr0Var.p(1, null);
            }
        }
        if (!zP || sr0Var.n0 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        ur0 ur0Var = this.j0;
        boolean zD0 = false;
        int i2 = 0;
        zD0 = false;
        if (ur0Var != null && ur0.L(ur0Var.W0)) {
            ur0 ur0Var2 = this.j0;
            ?? IsEnabled = isEnabled();
            if (this.r0) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.q0) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.p0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.r0) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.q0) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.p0) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zD0 = ur0Var2.d0(iArr);
        }
        if (zD0) {
            invalidate();
        }
    }

    public final void e() {
        ur0 ur0Var;
        if (!d() || (ur0Var = this.j0) == null || !ur0Var.V0 || this.m0 == null) {
            cw8.n(this, null);
            this.x0 = false;
        } else {
            cw8.n(this, this.w0);
            this.x0 = true;
        }
    }

    public final void f() {
        RippleDrawable rippleDrawable = new RippleDrawable(z51.S(this.j0.O0), getBackgroundDrawable(), null);
        FocusRingDrawable.f(getContext(), rippleDrawable, this.j0);
        this.l0 = rippleDrawable;
        this.j0.getClass();
        setBackground(this.l0);
        g();
    }

    public final void g() {
        ur0 ur0Var;
        if (TextUtils.isEmpty(getText()) || (ur0Var = this.j0) == null) {
            return;
        }
        int I = (int) (ur0Var.I() + ur0Var.o1 + ur0Var.l1);
        ur0 ur0Var2 = this.j0;
        int iH = (int) (ur0Var2.H() + ur0Var2.h1 + ur0Var2.k1);
        if (this.k0 != null) {
            Rect rect = new Rect();
            this.k0.getPadding(rect);
            iH += rect.left;
            I += rect.right;
        }
        setPaddingRelative(iH, getPaddingTop(), I, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.v0)) {
            return this.v0;
        }
        ur0 ur0Var = this.j0;
        if (ur0Var == null || !ur0Var.b1) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.k0;
        return insetDrawable == null ? this.j0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.d1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.e1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.J0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return Math.max(0.0f, ur0Var.J());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j0;
    }

    public float getChipEndPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.o1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ur0 ur0Var = this.j0;
        if (ur0Var == null || (drawable = ur0Var.R0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.T0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.S0;
        }
        return null;
    }

    public float getChipMinHeight() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.K0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.h1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.M0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.N0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ur0 ur0Var = this.j0;
        if (ur0Var == null || (drawable = ur0Var.W0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.a1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.n1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.Z0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.m1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.Y0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.M1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.x0) {
            sr0 sr0Var = this.w0;
            if (sr0Var.n0 == 1 || sr0Var.m0 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        ur0 ur0Var = this.j0;
        if (ur0Var == null) {
            return super.getFontVariationSettings();
        }
        z28 z28Var = ur0Var.v1.f;
        if (z28Var == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return z28Var.c;
    }

    public my4 getHideMotionSpec() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.g1;
        }
        return null;
    }

    public float getIconEndPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.j1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.i1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.O0;
        }
        return null;
    }

    public a77 getShapeAppearanceModel() {
        return this.j0.k();
    }

    public my4 getShowMotionSpec() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.f1;
        }
        return null;
    }

    public float getTextEndPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.l1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            return ur0Var.k1;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            paint.drawableState = ur0Var.getState();
        }
        z28 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i21.T(this, this.j0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D0);
        }
        ur0 ur0Var = this.j0;
        if (ur0Var != null && ur0Var.b1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.x0) {
            sr0 sr0Var = this.w0;
            int i2 = sr0Var.n0;
            if (i2 != Integer.MIN_VALUE) {
                sr0Var.j(i2);
            }
            if (z) {
                sr0Var.p(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ur0 ur0Var = this.j0;
        accessibilityNodeInfo.setCheckable(ur0Var != null && ur0Var.b1);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.t0 != i) {
            this.t0 = i;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.p0) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.p0) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.m0;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.x0) {
                        this.w0.w(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.v0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l0) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l0) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.O(z);
        }
    }

    public void setCheckableResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.O(ur0Var.p1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null) {
            this.o0 = z;
        } else if (ur0Var.b1) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.P(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.P(u70.O(ur0Var.p1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.Q(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.Q(w79.v(ur0Var.p1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.R(ur0Var.p1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.J0 == colorStateList) {
            return;
        }
        ur0Var.J0 = colorStateList;
        ur0Var.onStateChange(ur0Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListV;
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.J0 == (colorStateListV = w79.v(ur0Var.p1, i))) {
            return;
        }
        ur0Var.J0 = colorStateListV;
        ur0Var.onStateChange(ur0Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.S(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.S(ur0Var.p1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ur0 ur0Var) {
        ur0 ur0Var2 = this.j0;
        if (ur0Var2 != ur0Var) {
            if (ur0Var2 != null) {
                ur0Var2.L1 = new WeakReference(null);
            }
            this.j0 = ur0Var;
            ur0Var.N1 = false;
            ur0Var.L1 = new WeakReference(this);
            c(this.u0);
        }
    }

    public void setChipEndPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.o1 == f) {
            return;
        }
        ur0Var.o1 = f;
        ur0Var.invalidateSelf();
        ur0Var.M();
    }

    public void setChipEndPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            float dimension = ur0Var.p1.getResources().getDimension(i);
            if (ur0Var.o1 != dimension) {
                ur0Var.o1 = dimension;
                ur0Var.invalidateSelf();
                ur0Var.M();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.T(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.T(u70.O(ur0Var.p1, i));
        }
    }

    public void setChipIconSize(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.U(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.U(ur0Var.p1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.V(w79.v(ur0Var.p1, i));
        }
    }

    public void setChipIconVisible(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.W(ur0Var.p1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.K0 == f) {
            return;
        }
        ur0Var.K0 = f;
        ur0Var.invalidateSelf();
        ur0Var.M();
    }

    public void setChipMinHeightResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            float dimension = ur0Var.p1.getResources().getDimension(i);
            if (ur0Var.K0 != dimension) {
                ur0Var.K0 = dimension;
                ur0Var.invalidateSelf();
                ur0Var.M();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.h1 == f) {
            return;
        }
        ur0Var.h1 = f;
        ur0Var.invalidateSelf();
        ur0Var.M();
    }

    public void setChipStartPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            float dimension = ur0Var.p1.getResources().getDimension(i);
            if (ur0Var.h1 != dimension) {
                ur0Var.h1 = dimension;
                ur0Var.invalidateSelf();
                ur0Var.M();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.X(w79.v(ur0Var.p1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.Y(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.Y(ur0Var.p1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.Z(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.a1 == charSequence) {
            return;
        }
        String str = r50.b;
        r50 r50Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? r50.e : r50.d;
        r50Var.getClass();
        h70 h70Var = c48.a;
        ur0Var.a1 = r50Var.c(charSequence);
        ur0Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.a0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.a0(ur0Var.p1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.Z(u70.O(ur0Var.p1, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.b0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.b0(ur0Var.p1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.c0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.c0(ur0Var.p1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.e0(w79.v(ur0Var.p1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            u52.k("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            u52.k("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            u52.k("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            u52.k("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            u52.k("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            u52.k("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            u52.k("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            u52.k("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.s(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j0 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            u52.k("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.M1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.s0 = z;
        c(this.u0);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        ur0 ur0Var = this.j0;
        if (ur0Var == null) {
            return false;
        }
        z28 z28Var = ur0Var.v1.f;
        if (z28Var != null && Build.VERSION.SDK_INT >= 26) {
            z28Var.c = str;
        }
        h();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(my4 my4Var) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.g1 = my4Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.g1 = my4.a(ur0Var.p1, i);
        }
    }

    public void setIconEndPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.g0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.g0(ur0Var.p1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.h0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.h0(ur0Var.p1.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.j0 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            u52.k("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            u52.k("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.O1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            u52.k("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.n0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.m0 = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.i0(colorStateList);
        }
        this.j0.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.i0(w79.v(ur0Var.p1, i));
            this.j0.getClass();
            f();
        }
    }

    @Override // defpackage.n77
    public void setShapeAppearanceModel(a77 a77Var) {
        this.j0.setShapeAppearanceModel(a77Var);
    }

    public void setShowMotionSpec(my4 my4Var) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.f1 = my4Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.f1 = my4.a(ur0Var.p1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            u52.k("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        super.setText(ur0Var.N1 ? null : charSequence, bufferType);
        ur0 ur0Var2 = this.j0;
        if (ur0Var2 == null || TextUtils.equals(ur0Var2.P0, charSequence)) {
            return;
        }
        ur0Var2.P0 = charSequence;
        ur0Var2.v1.d = true;
        ur0Var2.invalidateSelf();
        ur0Var2.M();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            Context context2 = ur0Var.p1;
            ur0Var.v1.b(new z28(context2, i), context2);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.l1 == f) {
            return;
        }
        ur0Var.l1 = f;
        ur0Var.invalidateSelf();
        ur0Var.M();
    }

    public void setTextEndPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            float dimension = ur0Var.p1.getResources().getDimension(i);
            if (ur0Var.l1 != dimension) {
                ur0Var.l1 = dimension;
                ur0Var.invalidateSelf();
                ur0Var.M();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            e48 e48Var = ur0Var.v1;
            z28 z28Var = e48Var.f;
            if (z28Var != null) {
                z28Var.l = fApplyDimension;
                e48Var.a.setTextSize(fApplyDimension);
                ur0Var.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        ur0 ur0Var = this.j0;
        if (ur0Var == null || ur0Var.k1 == f) {
            return;
        }
        ur0Var.k1 = f;
        ur0Var.invalidateSelf();
        ur0Var.M();
    }

    public void setTextStartPaddingResource(int i) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            float dimension = ur0Var.p1.getResources().getDimension(i);
            if (ur0Var.k1 != dimension) {
                ur0Var.k1 = dimension;
                ur0Var.invalidateSelf();
                ur0Var.M();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.f0(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.R(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.W(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            u52.k("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            u52.k("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            u52.k("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            u52.k("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(z28 z28Var) {
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            ur0Var.v1.b(z28Var, ur0Var.p1);
        }
        h();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setInternalOnCheckedChangeListener(br4 br4Var) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ur0 ur0Var = this.j0;
        if (ur0Var != null) {
            Context context = ur0Var.p1;
            ur0Var.v1.b(new z28(context, i), context);
        }
        h();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.chipStyle);
    }
}

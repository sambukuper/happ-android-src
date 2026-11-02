package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.ap0;
import defpackage.cq;
import defpackage.cw8;
import defpackage.cy8;
import defpackage.d98;
import defpackage.dw1;
import defpackage.h66;
import defpackage.hw7;
import defpackage.i56;
import defpackage.j46;
import defpackage.mz7;
import defpackage.qv8;
import defpackage.tq;
import defpackage.u70;
import defpackage.w26;
import defpackage.w79;
import defpackage.y8;
import defpackage.yn0;
import defpackage.yy1;
import defpackage.zv7;
import java.util.WeakHashMap;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final ap0 V0 = new ap0(Float.class, "thumbPos", (byte) 15);
    public static final int[] W0 = {R.attr.state_checked};
    public float A0;
    public float B0;
    public final VelocityTracker C0;
    public final int D0;
    public float E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public final TextPaint M0;
    public final ColorStateList N0;
    public StaticLayout O0;
    public StaticLayout P0;
    public final y8 Q0;
    public ObjectAnimator R0;
    public cq S0;
    public mz7 T0;
    public final Rect U0;
    public Drawable f0;
    public ColorStateList g0;
    public PorterDuff.Mode h0;
    public boolean i0;
    public boolean j0;
    public Drawable k0;
    public ColorStateList l0;
    public PorterDuff.Mode m0;
    private int mSwitchWidth;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public CharSequence t0;
    public CharSequence u0;
    public CharSequence v0;
    public CharSequence w0;
    public boolean x0;
    public byte y0;
    public final int z0;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.g0 = null;
        this.h0 = null;
        this.i0 = false;
        this.j0 = false;
        this.l0 = null;
        this.m0 = null;
        this.n0 = false;
        this.o0 = false;
        this.C0 = VelocityTracker.obtain();
        this.L0 = true;
        this.U0 = new Rect();
        d98.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.M0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        zv7 zv7VarR = zv7.r(i, 0, context, attributeSet, h66.SwitchCompat);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        cw8.m(this, context, h66.SwitchCompat, attributeSet, typedArray, i);
        Drawable drawableE = zv7VarR.e(h66.SwitchCompat_android_thumb);
        this.f0 = drawableE;
        if (drawableE != null) {
            drawableE.setCallback(this);
        }
        Drawable drawableE2 = zv7VarR.e(h66.SwitchCompat_track);
        this.k0 = drawableE2;
        if (drawableE2 != null) {
            drawableE2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(h66.SwitchCompat_android_textOn));
        setTextOffInternal(typedArray.getText(h66.SwitchCompat_android_textOff));
        this.x0 = typedArray.getBoolean(h66.SwitchCompat_showText, true);
        this.p0 = typedArray.getDimensionPixelSize(h66.SwitchCompat_thumbTextPadding, 0);
        this.q0 = typedArray.getDimensionPixelSize(h66.SwitchCompat_switchMinWidth, 0);
        this.r0 = typedArray.getDimensionPixelSize(h66.SwitchCompat_switchPadding, 0);
        this.s0 = typedArray.getBoolean(h66.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListC = zv7VarR.c(h66.SwitchCompat_thumbTint);
        if (colorStateListC != null) {
            this.g0 = colorStateListC;
            this.i0 = true;
        }
        PorterDuff.Mode modeC = dw1.c(typedArray.getInt(h66.SwitchCompat_thumbTintMode, -1), null);
        if (this.h0 != modeC) {
            this.h0 = modeC;
            this.j0 = true;
        }
        if (this.i0 || this.j0) {
            a();
        }
        ColorStateList colorStateListC2 = zv7VarR.c(h66.SwitchCompat_trackTint);
        if (colorStateListC2 != null) {
            this.l0 = colorStateListC2;
            this.n0 = true;
        }
        PorterDuff.Mode modeC2 = dw1.c(typedArray.getInt(h66.SwitchCompat_trackTintMode, -1), null);
        if (this.m0 != modeC2) {
            this.m0 = modeC2;
            this.o0 = true;
        }
        if (this.n0 || this.o0) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(h66.SwitchCompat_switchTextAppearance, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, h66.TextAppearance);
            int i2 = h66.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0 || (colorStateList = w79.v(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i2) : colorStateList;
            if (colorStateList != null) {
                this.N0 = colorStateList;
            } else {
                this.N0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h66.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(h66.TextAppearance_android_typeface, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(h66.TextAppearance_android_textStyle, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i4 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i5 = i4 & (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0));
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(h66.TextAppearance_textAllCaps, false)) {
                Context context2 = getContext();
                y8 y8Var = new y8();
                y8Var.X = context2.getResources().getConfiguration().locale;
                this.Q0 = y8Var;
            } else {
                this.Q0 = null;
            }
            setTextOnInternal(this.t0);
            setTextOffInternal(this.v0);
            typedArrayObtainStyledAttributes.recycle();
        }
        new tq(this).h(attributeSet, i);
        zv7VarR.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z0 = viewConfiguration.getScaledTouchSlop();
        this.D0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private cq getEmojiTextViewHelper() {
        cq cqVar = this.S0;
        if (cqVar != null) {
            return cqVar;
        }
        cq cqVar2 = new cq(this);
        this.S0 = cqVar2;
        return cqVar2;
    }

    private boolean getTargetCheckedState() {
        return this.E0 > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = cy8.a;
        int layoutDirection = getLayoutDirection();
        float f = this.E0;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.k0;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.U0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f0;
        Rect rectB = drawable2 != null ? dw1.b(drawable2) : dw1.c;
        return ((((this.mSwitchWidth - this.G0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.v0 = charSequence;
        TransformationMethod transformationMethodI0 = ((yn0) getEmojiTextViewHelper().b.Y).i0(this.Q0);
        if (transformationMethodI0 != null) {
            charSequence = transformationMethodI0.getTransformation(charSequence, this);
        }
        this.w0 = charSequence;
        this.P0 = null;
        if (this.x0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.t0 = charSequence;
        TransformationMethod transformationMethodI0 = ((yn0) getEmojiTextViewHelper().b.Y).i0(this.Q0);
        if (transformationMethodI0 != null) {
            charSequence = transformationMethodI0.getTransformation(charSequence, this);
        }
        this.u0 = charSequence;
        this.O0 = null;
        if (this.x0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f0;
        if (drawable != null) {
            if (this.i0 || this.j0) {
                Drawable drawableMutate = drawable.mutate();
                this.f0 = drawableMutate;
                if (this.i0) {
                    drawableMutate.setTintList(this.g0);
                }
                if (this.j0) {
                    this.f0.setTintMode(this.h0);
                }
                if (this.f0.isStateful()) {
                    this.f0.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.k0;
        if (drawable != null) {
            if (this.n0 || this.o0) {
                Drawable drawableMutate = drawable.mutate();
                this.k0 = drawableMutate;
                if (this.n0) {
                    drawableMutate.setTintList(this.l0);
                }
                if (this.o0) {
                    this.k0.setTintMode(this.m0);
                }
                if (this.k0.isStateful()) {
                    this.k0.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.t0);
        setTextOffInternal(this.v0);
        requestLayout();
    }

    public final void d() {
        if (this.T0 == null && ((yn0) this.S0.b.Y).M() && yy1.d()) {
            yy1 yy1VarA = yy1.a();
            int iC = yy1VarA.c();
            if (iC == 3 || iC == 0) {
                mz7 mz7Var = new mz7(this);
                this.T0 = mz7Var;
                yy1VarA.h(mz7Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.H0;
        int i4 = this.I0;
        int i5 = this.J0;
        int i6 = this.K0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f0;
        Rect rectB = drawable != null ? dw1.b(drawable) : dw1.c;
        Drawable drawable2 = this.k0;
        Rect rect = this.U0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.k0.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.k0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f0;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.G0 + rect.right;
            this.f0.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.k0;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f0;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.k0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = cy8.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = cy8.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hw7.i(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.x0;
    }

    public boolean getSplitTrack() {
        return this.s0;
    }

    public int getSwitchMinWidth() {
        return this.q0;
    }

    public int getSwitchPadding() {
        return this.r0;
    }

    public CharSequence getTextOff() {
        return this.v0;
    }

    public CharSequence getTextOn() {
        return this.t0;
    }

    public Drawable getThumbDrawable() {
        return this.f0;
    }

    public final float getThumbPosition() {
        return this.E0;
    }

    public int getThumbTextPadding() {
        return this.p0;
    }

    public ColorStateList getThumbTintList() {
        return this.g0;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.h0;
    }

    public Drawable getTrackDrawable() {
        return this.k0;
    }

    public ColorStateList getTrackTintList() {
        return this.l0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.m0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.k0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.R0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.R0.end();
        this.R0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, W0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.k0;
        Rect rect = this.U0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.I0;
        int i2 = this.K0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f0;
        if (drawable != null) {
            if (!this.s0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = dw1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.O0 : this.P0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.M0;
            ColorStateList colorStateList = this.N0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t0 : this.v0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f0 != null) {
            Drawable drawable = this.k0;
            Rect rect = this.U0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = dw1.b(this.f0);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = cy8.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.F0;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.F0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.F0;
        }
        this.H0 = paddingLeft;
        this.I0 = paddingTop;
        this.K0 = height;
        this.J0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.x0) {
            StaticLayout staticLayout = this.O0;
            TextPaint textPaint = this.M0;
            if (staticLayout == null) {
                CharSequence charSequence = this.u0;
                this.O0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.P0 == null) {
                CharSequence charSequence2 = this.w0;
                this.P0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f0;
        Rect rect = this.U0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f0.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f0.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.x0) {
            iMax = (this.p0 * 2) + Math.max(this.O0.getWidth(), this.P0.getWidth());
        } else {
            iMax = 0;
        }
        this.G0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.k0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.k0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f0;
        if (drawable3 != null) {
            Rect rectB = dw1.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.L0;
        int iMax4 = this.q0;
        if (z) {
            iMax4 = Math.max(iMax4, (this.G0 * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax4;
        this.F0 = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t0 : this.v0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.C0;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.z0;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.y0 == 2) {
                    this.y0 = (byte) 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.D0) {
                            boolean z2 = cy8.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.y0 = (byte) 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                byte b = this.y0;
                if (b == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.A0) > f3 || Math.abs(y - this.B0) > f3) {
                        this.y0 = (byte) 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A0 = x;
                        this.B0 = y;
                        return true;
                    }
                } else if (b == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.A0;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = cy8.a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.E0;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.A0 = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.y0 == 2) {
                    this.y0 = (byte) 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.D0) {
                            boolean z4 = cy8.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.y0 = (byte) 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f0 != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f0;
                Rect rect = this.U0;
                drawable.getPadding(rect);
                int i2 = this.I0 - i;
                int i3 = (this.H0 + thumbOffset) - i;
                int i4 = this.G0 + i3 + rect.left + rect.right + i;
                int i5 = this.K0 + i;
                if (x3 > i3 && x3 < i4 && y2 > i2 && y2 < i5) {
                    this.y0 = (byte) 1;
                    this.A0 = x3;
                    this.B0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.t0;
                if (string == null) {
                    string = getResources().getString(i56.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = cw8.a;
                new qv8(j46.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.v0;
            if (string2 == null) {
                string2 = getResources().getString(i56.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = cw8.a;
            new qv8(j46.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.R0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, V0, zIsChecked ? 1.0f : 0.0f);
        this.R0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.R0.setAutoCancel(true);
        this.R0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hw7.k(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.t0);
        setTextOffInternal(this.v0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.L0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.s0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.q0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.r0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.M0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.v0;
        if (string == null) {
            string = getResources().getString(i56.abc_capital_off);
        }
        WeakHashMap weakHashMap = cw8.a;
        new qv8(j46.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.t0;
        if (string == null) {
            string = getResources().getString(i56.abc_capital_on);
        }
        WeakHashMap weakHashMap = cw8.a;
        new qv8(j46.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.E0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(u70.O(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.p0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        this.i0 = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.h0 = mode;
        this.j0 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.k0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(u70.O(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        this.n0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.m0 = mode;
        this.o0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f0 || drawable == this.k0;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.switchStyle);
    }
}

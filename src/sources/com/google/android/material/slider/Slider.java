package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import defpackage.bt;
import defpackage.f24;
import defpackage.gr4;
import defpackage.ie2;
import defpackage.u26;
import defpackage.u70;
import defpackage.vx2;
import defpackage.w79;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Slider extends BaseSlider<Slider, Object, Object> {
    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void S(vx2 vx2Var) {
        this.r0.add(vx2Var);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.u1;
    }

    public int getContinuousModeTickCount() {
        return this.x1;
    }

    public int getFocusedThumbIndex() {
        return this.v1;
    }

    public int getHaloRadius() {
        return this.O0;
    }

    public ColorStateList getHaloTintList() {
        return this.F1;
    }

    public int getLabelBehavior() {
        return this.J0;
    }

    public float getStepSize() {
        return this.w1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getThumbElevation() {
        return this.W1;
    }

    public int getThumbHeight() {
        return this.N0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public int getThumbRadius() {
        return this.M0 / 2;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public ColorStateList getThumbStrokeColor() {
        return this.Y1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getThumbStrokeWidth() {
        return this.X1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public ColorStateList getThumbTintList() {
        return this.Z1;
    }

    public int getThumbTrackGapSize() {
        return this.P0;
    }

    public int getThumbWidth() {
        return this.M0;
    }

    public int getTickActiveRadius() {
        return this.A1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.G1;
    }

    public int getTickInactiveRadius() {
        return this.B1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.H1;
    }

    public ColorStateList getTickTintList() {
        if (this.H1.equals(this.G1)) {
            return this.G1;
        }
        bt.i("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public int getTickVisibilityMode() {
        return this.z1;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.I1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public int getTrackCornerSize() {
        int i = this.U0;
        return i == -1 ? this.K0 / 2 : i;
    }

    public int getTrackHeight() {
        return this.K0;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.b1;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.Z0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.X0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.g1;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.e1;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.c1;
    }

    public int getTrackIconSize() {
        return this.h1;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.J1;
    }

    public int getTrackInsideCornerSize() {
        return this.V0;
    }

    public int getTrackSidePadding() {
        return this.L0;
    }

    public int getTrackStopIndicatorSize() {
        return this.T0;
    }

    public ColorStateList getTrackTintList() {
        if (this.J1.equals(this.I1)) {
            return this.I1;
        }
        bt.i("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.C1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return this.r1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return this.s1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCentered(boolean z) {
        if (this.W0 == z) {
            return;
        }
        this.W0 = z;
        float f = this.r1;
        if (z) {
            setValues(Float.valueOf((f + this.s1) / 2.0f));
        } else {
            setValues(Float.valueOf(f));
        }
        O(true);
    }

    public void setContinuousModeTickCount(int i) {
        if (i < 0) {
            bt.q(ie2.h("The continuousModeTickCount(", i, ") must be greater than or equal to 0"));
        } else if (this.x1 != i) {
            this.x1 = i;
            this.E1 = true;
            postInvalidate();
        }
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(this.M0, drawableNewDrawable);
        this.U1 = drawableNewDrawable;
        this.V1.clear();
        postInvalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.t1.size()) {
            bt.q("index out of range");
            return;
        }
        this.v1 = i;
        this.m0.v(i);
        postInvalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setHaloRadius(int i) {
        if (i == this.O0) {
            return;
        }
        this.O0 = i;
        RippleDrawable rippleDrawableN = n();
        if (n() == null || rippleDrawableN == null) {
            postInvalidate();
        } else {
            rippleDrawableN.setRadius(this.O0);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.F1)) {
            return;
        }
        this.F1 = colorStateList;
        RippleDrawable rippleDrawableN = n();
        if (n() != null && rippleDrawableN != null) {
            rippleDrawableN.setColor(colorStateList);
            return;
        }
        int iO = o(colorStateList);
        Paint paint = this.i0;
        paint.setColor(iO);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setLabelBehavior(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            O(true);
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setOrientation(int i) {
        if (this.G0 == i) {
            return;
        }
        this.G0 = i;
        O(true);
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.w1 != f) {
                this.w1 = f;
                this.E1 = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f2 = this.r1;
        float f3 = this.s1;
        StringBuilder sbK = ie2.k("The stepSize(", f, ") must be 0, or a factor of the valueFrom(", f2, ")-valueTo(");
        sbK.append(f3);
        sbK.append(") range");
        throw new IllegalArgumentException(sbK.toString());
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbElevation(float f) {
        if (f == this.W1) {
            return;
        }
        this.W1 = f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i >= arrayList.size()) {
                return;
            }
            ((gr4) arrayList.get(i)).s(this.W1);
            i++;
        }
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbHeight(int i) {
        if (i == this.N0) {
            return;
        }
        this.N0 = i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((gr4) arrayList.get(i2)).setBounds(0, 0, this.M0, this.N0);
            i2++;
        }
        Drawable drawable = this.U1;
        if (drawable != null) {
            a(this.M0, drawable);
        }
        Iterator it = this.V1.iterator();
        while (it.hasNext()) {
            a(this.M0, (Drawable) it.next());
        }
        O(false);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        if (colorStateList == this.Y1) {
            return;
        }
        this.Y1 = colorStateList;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i >= arrayList.size()) {
                postInvalidate();
                return;
            } else {
                ((gr4) arrayList.get(i)).y(colorStateList);
                i++;
            }
        }
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(w79.v(getContext(), i));
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeWidth(float f) {
        if (f == this.X1) {
            return;
        }
        this.X1 = f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i >= arrayList.size()) {
                postInvalidate();
                return;
            } else {
                ((gr4) arrayList.get(i)).A(f);
                i++;
            }
        }
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.Z1)) {
            return;
        }
        this.Z1 = colorStateList;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((gr4) arrayList.get(i)).t(this.Z1);
                i++;
            }
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbTrackGapSize(int i) {
        if (this.P0 == i) {
            return;
        }
        this.P0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setThumbWidth(int i) {
        if (i == this.M0) {
            return;
        }
        this.M0 = i;
        Drawable drawable = this.U1;
        if (drawable != null) {
            a(i, drawable);
        }
        for (int i2 = 0; i2 < this.V1.size(); i2++) {
            a(i, (Drawable) this.V1.get(i2));
        }
        y(i, -1, null);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTickActiveRadius(int i) {
        if (this.A1 != i) {
            this.A1 = i;
            this.k0.setStrokeWidth(i * 2);
            O(false);
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.G1)) {
            return;
        }
        this.G1 = colorStateList;
        this.k0.setColor(o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTickInactiveRadius(int i) {
        if (this.B1 != i) {
            this.B1 = i;
            this.j0.setStrokeWidth(i * 2);
            O(false);
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.H1)) {
            return;
        }
        this.H1 = colorStateList;
        this.j0.setColor(o(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.z1 != i) {
            this.z1 = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(z ? 0 : 2);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.I1)) {
            return;
        }
        this.I1 = colorStateList;
        this.g0.setColor(o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackCornerSize(int i) {
        if (this.U0 == i) {
            return;
        }
        this.U0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackHeight(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            this.f0.setStrokeWidth(i);
            this.g0.setStrokeWidth(this.K0);
            O(false);
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.b1) {
            return;
        }
        this.b1 = colorStateList;
        L();
        K();
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.Z0) {
            return;
        }
        this.Z0 = drawable;
        this.a1 = false;
        K();
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.X0) {
            return;
        }
        this.X0 = drawable;
        this.Y0 = false;
        L();
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.g1) {
            return;
        }
        this.g1 = colorStateList;
        N();
        M();
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.e1) {
            return;
        }
        this.e1 = drawable;
        this.f1 = false;
        M();
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.c1) {
            return;
        }
        this.c1 = drawable;
        this.d1 = false;
        N();
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackIconSize(int i) {
        if (this.h1 == i) {
            return;
        }
        this.h1 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.J1)) {
            return;
        }
        this.J1 = colorStateList;
        this.f0.setColor(o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackInsideCornerSize(int i) {
        if (this.V0 == i) {
            return;
        }
        this.V0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setTrackStopIndicatorSize(int i) {
        if (this.T0 == i) {
            return;
        }
        this.T0 = i;
        this.l0.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.r1 = f;
        this.E1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.s1 = f;
        this.E1 = true;
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? u70.O(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? u70.O(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? u70.O(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? u70.O(getContext(), i) : null);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(f24 f24Var) {
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.sliderStyle);
    }
}

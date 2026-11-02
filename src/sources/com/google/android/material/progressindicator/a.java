package com.google.android.material.progressindicator;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.bt;
import defpackage.c98;
import defpackage.fw1;
import defpackage.g20;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.lb3;
import defpackage.mr4;
import defpackage.mw1;
import defpackage.o56;
import defpackage.pm1;
import defpackage.v56;
import defpackage.w26;
import defpackage.yk;
import defpackage.yn0;
import java.util.ArrayList;
import java.util.Arrays;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ProgressBar {
    public static final int u0 = o56.Widget_MaterialComponents_ProgressIndicator;
    public final j20 f0;
    public int g0;
    public boolean h0;
    public final boolean i0;
    public final int j0;
    public long k0;
    public yk l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public final g20 p0;
    public final h20 q0;
    public final h20 r0;
    public final i20 s0;
    public final i20 t0;

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(mr4.b(context, attributeSet, i, u0), attributeSet, i);
        this.k0 = -1L;
        this.m0 = false;
        this.n0 = 4;
        this.p0 = new g20(this);
        this.q0 = new h20(this, (byte) 0);
        this.r0 = new h20(this, (byte) 1);
        this.s0 = new i20(this, (byte) 0);
        this.t0 = new i20(this, (byte) 1);
        Context context2 = getContext();
        this.f0 = a(context2, attributeSet);
        TypedArray typedArrayD = c98.d(context2, attributeSet, v56.BaseProgressIndicator, i, i2, new int[0]);
        typedArrayD.getInt(v56.BaseProgressIndicator_showDelay, -1);
        this.j0 = Math.min(typedArrayD.getInt(v56.BaseProgressIndicator_minHideDelay, -1), XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
        typedArrayD.recycle();
        this.l0 = new yk();
        this.i0 = true;
    }

    private mw1 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().p0;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().p0;
    }

    public j20 a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().q0.q(this.s0);
    }

    public void c(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.g0 = i;
            this.h0 = z;
            this.m0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                yk ykVar = this.l0;
                ContentResolver contentResolver = getContext().getContentResolver();
                ykVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().q0.r();
                    return;
                }
            }
            this.s0.a(getIndeterminateDrawable());
        }
    }

    public final boolean d() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f0.h;
    }

    @Override // android.widget.ProgressBar
    public lb3 getIndeterminateDrawable() {
        return (lb3) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f0.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f0.i;
    }

    @Override // android.widget.ProgressBar
    public pm1 getProgressDrawable() {
        return (pm1) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f0.g;
    }

    public int getTrackColor() {
        return this.f0.f;
    }

    public int getTrackCornerRadius() {
        return this.f0.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f0.c;
    }

    public int getTrackThickness() {
        return this.f0.a;
    }

    public int getWaveAmplitude() {
        return this.f0.l;
    }

    public int getWaveSpeed() {
        return this.f0.m;
    }

    public int getWavelengthDeterminate() {
        return this.f0.j;
    }

    public int getWavelengthIndeterminate() {
        return this.f0.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        pm1 progressDrawable = getProgressDrawable();
        i20 i20Var = this.t0;
        if (progressDrawable != null) {
            pm1 progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.i0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.i0 = arrayList;
            }
            if (!arrayList.contains(i20Var)) {
                progressDrawable2.i0.add(i20Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            lb3 indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.i0;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.i0 = arrayList2;
            }
            if (!arrayList2.contains(i20Var)) {
                indeterminateDrawable.i0.add(i20Var);
            }
        }
        if (d()) {
            if (this.j0 > 0) {
                this.k0 = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r0);
        removeCallbacks(this.q0);
        ((fw1) getCurrentDrawable()).d(false, false, false);
        lb3 indeterminateDrawable = getIndeterminateDrawable();
        i20 i20Var = this.t0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(i20Var);
            getIndeterminateDrawable().q0.x();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(i20Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            mw1 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.i0) {
            ((fw1) getCurrentDrawable()).d(d(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.i0) {
            ((fw1) getCurrentDrawable()).d(d(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(yk ykVar) {
        this.l0 = ykVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().Z = ykVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().Z = ykVar;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        g20 g20Var = this.p0;
        if (z) {
            ArrayList arrayList = getProgressDrawable().q0.k;
            if (arrayList.contains(g20Var)) {
                return;
            }
            arrayList.add(g20Var);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().q0.k;
        int iIndexOf = arrayList2.indexOf(g20Var);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f0.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            fw1 fw1Var = (fw1) getCurrentDrawable();
            if (fw1Var != null) {
                fw1Var.d(false, false, false);
            }
            super.setIndeterminate(z);
            fw1 fw1Var2 = (fw1) getCurrentDrawable();
            if (fw1Var2 != null) {
                fw1Var2.d(d(), false, false);
            }
            if ((fw1Var2 instanceof lb3) && d()) {
                ((lb3) fw1Var2).q0.v();
            }
            this.m0 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        j20 j20Var = this.f0;
        if (j20Var.n != f) {
            j20Var.n = f;
            getIndeterminateDrawable().q0.n();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof lb3) {
            ((fw1) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.o0) {
            bt.q("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{yn0.C(getContext(), w26.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f0.e = iArr;
        getIndeterminateDrawable().q0.n();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        j20 j20Var = this.f0;
        if (j20Var.i != i) {
            j20Var.i = i;
            j20Var.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        c(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof pm1) {
            pm1 pm1Var = (pm1) drawable;
            pm1Var.d(false, false, false);
            super.setProgressDrawable(pm1Var);
            pm1Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.o0) {
            bt.q("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f0.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        j20 j20Var = this.f0;
        if (j20Var.f != i) {
            j20Var.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        j20 j20Var = this.f0;
        if (j20Var.b != i) {
            j20Var.b = Math.min(i, j20Var.a / 2);
            j20Var.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        j20 j20Var = this.f0;
        if (j20Var.c != f) {
            j20Var.c = Math.min(f, 0.5f);
            j20Var.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        j20 j20Var = this.f0;
        if (j20Var.a != i) {
            j20Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.n0 = i;
        } else {
            bt.q("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        j20 j20Var = this.f0;
        if (j20Var.l != i) {
            j20Var.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        pm1 progressDrawable = getProgressDrawable();
        progressDrawable.Y.p = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        pm1 progressDrawable = getProgressDrawable();
        progressDrawable.Y.o = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        j20 j20Var = this.f0;
        j20Var.m = i;
        pm1 progressDrawable = getProgressDrawable();
        boolean z = j20Var.m != 0;
        ValueAnimator valueAnimator = progressDrawable.u0;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        j20 j20Var = this.f0;
        if (j20Var.j != i) {
            j20Var.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        j20 j20Var = this.f0;
        if (j20Var.k != i) {
            j20Var.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}

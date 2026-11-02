package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.j36;
import defpackage.o56;
import defpackage.ou0;
import defpackage.pu0;
import defpackage.rk;
import defpackage.u26;
import defpackage.u70;
import defpackage.v56;
import defpackage.z39;
import java.util.ArrayList;
import java.util.Iterator;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int s0 = 0;
    public final ValueAnimator f0;
    public boolean g0;
    public final ArrayList h0;
    public final int i0;
    public final float j0;
    public final Paint k0;
    public final RectF l0;
    public final int m0;
    public float n0;
    public boolean o0;
    public double p0;
    public int q0;
    public int r0;

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f0 = valueAnimator;
        this.h0 = new ArrayList();
        Paint paint = new Paint();
        this.k0 = paint;
        this.l0 = new RectF();
        this.r0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.ClockHandView, i, o56.Widget_MaterialComponents_TimePicker_Clock);
        u70.g0(context, u26.motionDurationLong2, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
        z39.D(context, u26.motionEasingEmphasizedInterpolator, rk.b);
        this.q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ClockHandView_materialCircleRadius, 0);
        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.m0 = resources.getDimensionPixelSize(j36.material_clock_hand_stroke_width);
        this.j0 = resources.getDimensionPixelSize(j36.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(v56.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2 = ClockHandView.s0;
                this.a.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new ou0());
    }

    public final void a(float f) {
        this.f0.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.n0 = f2;
        this.p0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.r0;
        int iRound = this.q0;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.p0)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.p0))) + height;
        float f5 = this.i0;
        this.l0.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        Iterator it = this.h0.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((pu0) it.next());
            if (Math.abs(clockFaceView.L0 - f2) > 0.001f) {
                clockFaceView.L0 = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.r0;
        int iRound = this.q0;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.p0)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.p0))) + f3;
        Paint paint = this.k0;
        paint.setStrokeWidth(0.0f);
        int i2 = this.i0;
        canvas.drawCircle(fCos, fSin, i2, paint);
        double dSin = Math.sin(this.p0);
        double d = iRound - i2;
        paint.setStrokeWidth(this.m0);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.p0) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.j0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f0.isRunning()) {
            return;
        }
        a(this.n0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.o0 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.o0;
            if (this.g0) {
                this.r0 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.q0) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.o0;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.n0 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            a(f);
            z3 = true;
        }
        this.o0 = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.materialClockStyle);
    }
}

package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 extends fw1 {
    public static final om1 z0 = new om1(0);
    public final mw1 p0;
    public final tf7 q0;
    public final kw1 r0;
    public float s0;
    public boolean t0;
    public final ValueAnimator u0;
    public ValueAnimator v0;
    public TimeInterpolator w0;
    public TimeInterpolator x0;
    public TimeInterpolator y0;

    public pm1(Context context, final j20 j20Var, mw1 mw1Var) {
        super(context, j20Var);
        this.t0 = false;
        this.p0 = mw1Var;
        kw1 kw1Var = new kw1();
        this.r0 = kw1Var;
        kw1Var.h = true;
        tf7 tf7Var = new tf7(this, z0);
        this.q0 = tf7Var;
        uf7 uf7Var = new uf7();
        uf7Var.a(1.0f);
        uf7Var.b(50.0f);
        tf7Var.m = uf7Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.u0 = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mm1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                j20 j20Var2 = j20Var;
                if (!j20Var2.b(true) || j20Var2.m == 0) {
                    return;
                }
                pm1 pm1Var = this.a;
                if (pm1Var.isVisible()) {
                    pm1Var.invalidateSelf();
                }
            }
        });
        if (j20Var.b(true) && j20Var.m != 0) {
            valueAnimator.start();
        }
        if (this.k0 != 1.0f) {
            this.k0 = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.n0)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f0;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.g0;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            mw1 mw1Var = this.p0;
            mw1Var.a.d();
            mw1Var.a(canvas, bounds, fB, z, z2);
            float fC = c();
            kw1 kw1Var = this.r0;
            kw1Var.f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.l0;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            j20 j20Var = this.Y;
            kw1Var.c = j20Var.e[0];
            int iL = j20Var.i;
            mw1 mw1Var2 = this.p0;
            if (iL > 0) {
                if (!(mw1Var2 instanceof ca4)) {
                    iL = (int) ((z91.l(kw1Var.b, 0.0f, 0.01f) * iL) / 0.01f);
                }
                this.p0.d(canvas, paint, kw1Var.b, 1.0f, j20Var.f, this.m0, iL);
            } else {
                mw1Var2.d(canvas, paint, 0.0f, 1.0f, j20Var.f, this.m0, 0);
            }
            int i = this.m0;
            mw1 mw1Var3 = this.p0;
            mw1Var3.c(canvas, paint, kw1Var, i);
            mw1Var3.b(j20Var.e[0], this.m0, canvas, paint);
            canvas.restore();
        }
    }

    @Override // defpackage.fw1
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        yk ykVar = this.Z;
        ContentResolver contentResolver = this.X.getContentResolver();
        ykVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.t0 = true;
            return zE;
        }
        this.t0 = false;
        this.q0.m.b(50.0f / f);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.p0.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.q0.f();
        this.r0.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        j20 j20Var = this.Y;
        float f2 = (f < j20Var.o * 10000.0f || f > j20Var.p * 10000.0f) ? 0.0f : 1.0f;
        boolean z = this.t0;
        kw1 kw1Var = this.r0;
        tf7 tf7Var = this.q0;
        if (z) {
            tf7Var.f();
            kw1Var.b = f / 10000.0f;
            invalidateSelf();
            kw1Var.e = f2;
            invalidateSelf();
        } else {
            int iWidth = getBounds().width();
            int iHeight = getBounds().height();
            if (iWidth > 0 && iHeight > 0) {
                if (this.p0 instanceof ca4) {
                    tf7Var.d(10000.0f / iWidth);
                } else {
                    tf7Var.d((float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d)));
                }
            }
            tf7Var.b = kw1Var.b * 10000.0f;
            tf7Var.c = true;
            tf7Var.a(f);
        }
        return true;
    }
}

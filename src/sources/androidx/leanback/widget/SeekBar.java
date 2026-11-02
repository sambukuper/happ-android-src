package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.h36;
import defpackage.lz6;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class SeekBar extends View {
    public final RectF f0;
    public final RectF g0;
    public final RectF h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new RectF();
        Paint paint = new Paint(1);
        this.i0 = paint;
        Paint paint2 = new Paint(1);
        this.j0 = paint2;
        Paint paint3 = new Paint(1);
        this.k0 = paint3;
        Paint paint4 = new Paint(1);
        this.l0 = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.r0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_progressbar_bar_height);
        this.s0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_progressbar_active_bar_height);
        this.q0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_progressbar_active_radius);
    }

    public final void a() {
        int i = isFocused() ? this.s0 : this.r0;
        int width = getWidth();
        int height = getHeight();
        int i2 = (height - i) / 2;
        int i3 = this.r0;
        float f = i2;
        float f2 = height - i2;
        this.h0.set(i3 / 2, f, width - (i3 / 2), f2);
        int i4 = isFocused() ? this.q0 : this.r0 / 2;
        float f3 = width - (i4 * 2);
        float f4 = (this.m0 / this.o0) * f3;
        int i5 = this.r0;
        RectF rectF = this.f0;
        rectF.set(i5 / 2, f, (i5 / 2) + f4, f2);
        this.g0.set(rectF.right, f, (this.r0 / 2) + ((this.n0 / this.o0) * f3), f2);
        this.p0 = i4 + ((int) f4);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.o0;
    }

    public int getProgress() {
        return this.m0;
    }

    public int getSecondProgress() {
        return this.n0;
    }

    public int getSecondaryProgressColor() {
        return this.i0.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = isFocused() ? this.q0 : this.r0 / 2;
        canvas.drawRoundRect(this.h0, f, f, this.k0);
        RectF rectF = this.g0;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.i0);
        }
        canvas.drawRoundRect(this.f0, f, f, this.j0);
        canvas.drawCircle(this.p0, getHeight() / 2, f, this.l0);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public void setActiveBarHeight(int i) {
        this.s0 = i;
        a();
    }

    public void setActiveRadius(int i) {
        this.q0 = i;
        a();
    }

    public void setBarHeight(int i) {
        this.r0 = i;
        a();
    }

    public void setMax(int i) {
        this.o0 = i;
        a();
    }

    public void setProgress(int i) {
        int i2 = this.o0;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.m0 = i;
        a();
    }

    public void setProgressColor(int i) {
        this.j0.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.o0;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.n0 = i;
        a();
    }

    public void setSecondaryProgressColor(int i) {
        this.i0.setColor(i);
    }

    public void setAccessibilitySeekListener(lz6 lz6Var) {
    }
}

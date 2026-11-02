package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gl6 extends View {
    public static final int[] k0 = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] l0 = new int[0];
    public rn8 f0;
    public Boolean g0;
    public Long h0;
    public fl6 i0;
    public hg j0;

    private final void setRippleState(boolean z) throws InterruptedException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.i0;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.h0;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? k0 : l0;
            rn8 rn8Var = this.f0;
            if (rn8Var != null) {
                rn8Var.setState(iArr);
            }
        } else {
            fl6 fl6Var = new fl6((Object) this, (byte) 0);
            this.i0 = fl6Var;
            postDelayed(fl6Var, 50L);
        }
        this.h0 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(gl6 gl6Var) {
        rn8 rn8Var = gl6Var.f0;
        if (rn8Var != null) {
            rn8Var.setState(l0);
        }
        gl6Var.i0 = null;
    }

    public final void b(ft5 ft5Var, boolean z, long j, int i, long j2, hg hgVar) throws InterruptedException {
        long j3 = ft5Var.a;
        if (this.f0 == null || !Boolean.valueOf(z).equals(this.g0)) {
            rn8 rn8Var = new rn8(z);
            setBackground(rn8Var);
            this.f0 = rn8Var;
            this.g0 = Boolean.valueOf(z);
        }
        rn8 rn8Var2 = this.f0;
        rn8Var2.getClass();
        this.j0 = hgVar;
        e(i, j, j2);
        if (z) {
            rn8Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            rn8Var2.setHotspot(rn8Var2.getBounds().centerX(), rn8Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws InterruptedException {
        this.j0 = null;
        fl6 fl6Var = this.i0;
        if (fl6Var != null) {
            removeCallbacks(fl6Var);
            fl6 fl6Var2 = this.i0;
            fl6Var2.getClass();
            fl6Var2.run();
        } else {
            rn8 rn8Var = this.f0;
            if (rn8Var != null) {
                rn8Var.setState(l0);
            }
        }
        rn8 rn8Var2 = this.f0;
        if (rn8Var2 == null) {
            return;
        }
        rn8Var2.setVisible(false, false);
        unscheduleDrawable(rn8Var2);
    }

    public final void d() throws InterruptedException {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws InterruptedException {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j, long j2) {
        rn8 rn8Var = this.f0;
        if (rn8Var == null) {
            return;
        }
        Integer num = rn8Var.Z;
        if (num == null || num.intValue() != i) {
            rn8Var.Z = Integer.valueOf(i);
            rn8Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = dw0.b(f, j2);
        dw0 dw0Var = rn8Var.Y;
        if (!(dw0Var == null ? false : tk8.a(dw0Var.a, jB))) {
            rn8Var.Y = new dw0(jB);
            rn8Var.setColor(ColorStateList.valueOf(z51.U(jB)));
        }
        Rect rect = new Rect(0, 0, nr4.O(ua7.d(j)), nr4.O(ua7.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rn8Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        hg hgVar = this.j0;
        if (hgVar != null) {
            hgVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

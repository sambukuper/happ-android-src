package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fw1 extends Drawable implements Animatable {
    public static final ap0 o0 = new ap0(Float.class, "growFraction", 9);
    public final Context X;
    public final j20 Y;
    public ObjectAnimator f0;
    public ObjectAnimator g0;
    public ArrayList i0;
    public boolean j0;
    public float k0;
    public int m0;
    public final float h0 = -1.0f;
    public final Paint l0 = new Paint();
    public final Rect n0 = new Rect();
    public yk Z = new yk();

    public fw1(Context context, j20 j20Var) {
        this.X = context;
        this.Y = j20Var;
        setAlpha(255);
    }

    public final float b() {
        j20 j20Var = this.Y;
        if (j20Var.g == 0 && j20Var.h == 0) {
            return 1.0f;
        }
        return this.k0;
    }

    public final float c() {
        float f = this.h0;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof pm1;
        j20 j20Var = this.Y;
        if (j20Var.b(z) && j20Var.m != 0) {
            yk ykVar = this.Z;
            ContentResolver contentResolver = this.X.getContentResolver();
            ykVar.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                int i = (int) ((((z ? j20Var.j : j20Var.k) * 1000.0f) / j20Var.m) * f2);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i)) / i;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        yk ykVar = this.Z;
        ContentResolver contentResolver = this.X.getContentResolver();
        ykVar.getClass();
        return e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f0;
        byte b = 0;
        ap0 ap0Var = o0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ap0Var, 0.0f, 1.0f);
            this.f0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f0.setInterpolator(rk.b);
            ObjectAnimator objectAnimator2 = this.f0;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                bt.q("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f0 = objectAnimator2;
            objectAnimator2.addListener(new ew1(this, b));
        }
        byte b2 = 1;
        if (this.g0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, ap0Var, 1.0f, 0.0f);
            this.g0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.g0.setInterpolator(rk.b);
            ObjectAnimator objectAnimator3 = this.g0;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                bt.q("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.g0 = objectAnimator3;
            objectAnimator3.addListener(new ew1(this, b2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f0 : this.g0;
            ObjectAnimator objectAnimator5 = z ? this.g0 : this.f0;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.j0;
                    this.j0 = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.j0 = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.j0;
                    this.j0 = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.j0 = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                j20 j20Var = this.Y;
                if (!z ? j20Var.h != 0 : j20Var.g != 0) {
                    boolean z7 = this.j0;
                    this.j0 = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.j0 = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void f(i20 i20Var) {
        ArrayList arrayList = this.i0;
        if (arrayList == null || !arrayList.contains(i20Var)) {
            return;
        }
        this.i0.remove(i20Var);
        if (this.i0.isEmpty()) {
            this.i0 = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.g0;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}

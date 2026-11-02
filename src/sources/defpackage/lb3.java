package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lb3 extends fw1 {
    public final mw1 p0;
    public v3 q0;
    public eu8 r0;

    public lb3(Context context, j20 j20Var, mw1 mw1Var, v3 v3Var) {
        super(context, j20Var);
        this.p0 = mw1Var;
        this.q0 = v3Var;
        v3Var.a = this;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        eu8 eu8Var;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.n0)) {
            yk ykVar = this.Z;
            j20 j20Var = this.Y;
            if (ykVar != null && Settings.Global.getFloat(this.X.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (eu8Var = this.r0) != null) {
                eu8Var.setBounds(getBounds());
                this.r0.setTint(j20Var.e[0]);
                this.r0.draw(canvas);
                return;
            }
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
            int i2 = j20Var.i;
            int i3 = this.m0;
            boolean z3 = (j20Var instanceof LinearProgressIndicatorSpec) || ((j20Var instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) j20Var).u);
            boolean z4 = z3 && i2 == 0 && !j20Var.b(false);
            Paint paint = this.l0;
            if (!z4) {
                if (z3) {
                    kw1 kw1Var = (kw1) ((ArrayList) this.q0.b).get(0);
                    kw1 kw1Var2 = (kw1) oi0.h(1, (ArrayList) this.q0.b);
                    mw1 mw1Var2 = this.p0;
                    if (mw1Var2 instanceof ca4) {
                        i = i2;
                        mw1Var2.d(canvas, paint, 0.0f, kw1Var.a, j20Var.f, i3, i);
                        this.p0.d(canvas, paint, kw1Var2.b, 1.0f, j20Var.f, i3, i);
                    } else {
                        i = i2;
                        canvas.save();
                        canvas.rotate(kw1Var2.g);
                        this.p0.d(canvas, paint, kw1Var2.b, kw1Var.a + 1.0f, j20Var.f, i3, i);
                        canvas.restore();
                    }
                }
                for (int i4 = 0; i4 < ((ArrayList) this.q0.b).size(); i4++) {
                    kw1 kw1Var3 = (kw1) ((ArrayList) this.q0.b).get(i4);
                    kw1Var3.f = c();
                    this.p0.c(canvas, paint, kw1Var3, this.m0);
                    if (i4 <= 0 && !z4 && z3) {
                        this.p0.d(canvas, paint, ((kw1) ((ArrayList) this.q0.b).get(i4 - 1)).b, kw1Var3.a, j20Var.f, i3, i);
                    }
                }
                canvas.restore();
            }
            this.p0.d(canvas, paint, 0.0f, 1.0f, j20Var.f, i3, 0);
            i = i2;
            while (i4 < ((ArrayList) this.q0.b).size()) {
                kw1 kw1Var4 = (kw1) ((ArrayList) this.q0.b).get(i4);
                kw1Var4.f = c();
                this.p0.c(canvas, paint, kw1Var4, this.m0);
                if (i4 <= 0) {
                }
            }
            canvas.restore();
        }
    }

    @Override // defpackage.fw1
    public final boolean e(boolean z, boolean z2, boolean z3) {
        eu8 eu8Var;
        boolean zE = super.e(z, z2, z3);
        if (this.Z != null && Settings.Global.getFloat(this.X.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (eu8Var = this.r0) != null) {
            return eu8Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.q0.e();
        }
        if (z && z3) {
            this.q0.v();
        }
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
}

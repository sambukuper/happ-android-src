package defpackage;

import android.animation.ObjectAnimator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fa4 extends v3 {
    public static final ap0 i = new ap0(Float.class, "animationFraction", (byte) 10);
    public ObjectAnimator c;
    public final c82 d;
    public final LinearProgressIndicatorSpec e;
    public int f;
    public boolean g;
    public float h;

    public fa4(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f = 1;
        this.e = linearProgressIndicatorSpec;
        this.d = new c82((byte) 1);
    }

    @Override // defpackage.v3
    public final void e() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.v3
    public final void n() {
        y();
        this.c.setDuration((long) (this.e.n * 333.0f));
        z();
    }

    @Override // defpackage.v3
    public final void v() {
        y();
        z();
        this.c.start();
    }

    public final void y() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new z4(this, (byte) 5));
        }
    }

    public final void z() {
        this.g = true;
        this.f = 1;
        for (kw1 kw1Var : (ArrayList) this.b) {
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.e;
            kw1Var.c = linearProgressIndicatorSpec.e[0];
            kw1Var.d = linearProgressIndicatorSpec.i / 2;
        }
    }
}

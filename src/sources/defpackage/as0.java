package defpackage;

import android.animation.ObjectAnimator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.ArrayList;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class as0 extends v3 {
    public static final int[] k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, 2350, 3700, 5050};
    public static final ap0 n = new ap0(Float.class, "animationFraction", (byte) 5);
    public static final ap0 o = new ap0(Float.class, "completeEndFraction", (byte) 6);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final c82 e;
    public final CircularProgressIndicatorSpec f;
    public int g;
    public float h;
    public float i;
    public ni j;

    public as0(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = circularProgressIndicatorSpec;
        this.e = new c82((byte) 1);
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
        ObjectAnimator objectAnimator = this.c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.n * 5400.0f));
        this.d.setDuration((long) (circularProgressIndicatorSpec.n * 333.0f));
        this.g = 0;
        ((kw1) ((ArrayList) this.b).get(0)).c = circularProgressIndicatorSpec.e[0];
        this.i = 0.0f;
    }

    @Override // defpackage.v3
    public final void q(i20 i20Var) {
        this.j = i20Var;
    }

    @Override // defpackage.v3
    public final void r() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((lb3) this.a).isVisible()) {
            this.d.start();
        } else {
            e();
        }
    }

    @Override // defpackage.v3
    public final void v() {
        y();
        this.g = 0;
        ((kw1) ((ArrayList) this.b).get(0)).c = this.f.e[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.v3
    public final void x() {
        this.j = null;
    }

    public final void y() {
        ObjectAnimator objectAnimator = this.c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (circularProgressIndicatorSpec.n * 5400.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new zr0(this, (byte) 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (circularProgressIndicatorSpec.n * 333.0f));
            this.d.setInterpolator(this.e);
            this.d.addListener(new zr0(this, (byte) 1));
        }
    }
}

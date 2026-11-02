package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;
import java.util.Iterator;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ha4 extends v3 {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, 333, 0};
    public static final ap0 m = new ap0(Float.class, "animationFraction", (byte) 11);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final LinearProgressIndicatorSpec f;
    public int g;
    public boolean h;
    public float i;
    public ni j;

    public ha4(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = linearProgressIndicatorSpec;
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, k26.linear_indeterminate_line1_head_interpolator);
        g33.N(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(context, k26.linear_indeterminate_line1_tail_interpolator);
        g33.N(interpolatorLoadInterpolator2, "Failed to parse interpolator, no start tag found");
        Interpolator interpolatorLoadInterpolator3 = AnimationUtils.loadInterpolator(context, k26.linear_indeterminate_line2_head_interpolator);
        g33.N(interpolatorLoadInterpolator3, "Failed to parse interpolator, no start tag found");
        Interpolator interpolatorLoadInterpolator4 = AnimationUtils.loadInterpolator(context, k26.linear_indeterminate_line2_tail_interpolator);
        g33.N(interpolatorLoadInterpolator4, "Failed to parse interpolator, no start tag found");
        this.e = new Interpolator[]{interpolatorLoadInterpolator, interpolatorLoadInterpolator2, interpolatorLoadInterpolator3, interpolatorLoadInterpolator4};
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
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f;
        objectAnimator.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
        this.d.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
        z();
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
        e();
        if (((lb3) this.a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.v3
    public final void v() {
        y();
        z();
        this.c.start();
    }

    @Override // defpackage.v3
    public final void x() {
        this.j = null;
    }

    public final void y() {
        ObjectAnimator objectAnimator = this.c;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f;
        ap0 ap0Var = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ap0Var, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new ga4(this, (byte) 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, ap0Var, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (linearProgressIndicatorSpec.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new ga4(this, (byte) 1));
        }
    }

    public final void z() {
        this.g = 0;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((kw1) it.next()).c = this.f.e[0];
        }
    }
}

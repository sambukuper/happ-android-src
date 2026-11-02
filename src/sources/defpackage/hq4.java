package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hq4 {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public j00 f;

    public hq4(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = u70.g0(context, u26.motionDurationMedium2, 300);
        this.d = u70.g0(context, u26.motionDurationShort3, 150);
        this.e = u70.g0(context, u26.motionDurationShort2, 100);
    }
}

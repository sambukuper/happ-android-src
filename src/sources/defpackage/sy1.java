package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public sy1(Context context) {
        boolean zF0 = u70.f0(context.getTheme(), u26.elevationOverlayEnabled, false);
        int iC = yn0.C(context, u26.elevationOverlayColor, 0);
        int iC2 = yn0.C(context, u26.elevationOverlayAccentColor, 0);
        int iC3 = yn0.C(context, u26.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zF0;
        this.b = iC;
        this.c = iC2;
        this.d = iC3;
        this.e = f2;
    }
}

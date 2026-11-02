package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class us8 extends Animatable2.AnimationCallback {
    public final /* synthetic */ dn2 a;
    public final /* synthetic */ dn2 b;

    public us8(dn2 dn2Var, dn2 dn2Var2) {
        this.a = dn2Var;
        this.b = dn2Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        dn2 dn2Var = this.b;
        if (dn2Var != null) {
            dn2Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        dn2 dn2Var = this.a;
        if (dn2Var != null) {
            dn2Var.invoke();
        }
    }
}

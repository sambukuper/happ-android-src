package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zf1 implements Animation.AnimationListener {
    public final /* synthetic */ xe7 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ag1 d;

    public zf1(xe7 xe7Var, ViewGroup viewGroup, View view, ag1 ag1Var) {
        this.a = xe7Var;
        this.b = viewGroup;
        this.c = view;
        this.d = ag1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new j0((Object) viewGroup, (Object) this.c, (Object) this.d, (byte) 6));
        if (ml2.K(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (ml2.K(2)) {
            Objects.toString(this.a);
        }
    }
}

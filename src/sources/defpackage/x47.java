package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x47 implements Runnable {
    public final /* synthetic */ byte X = 1;
    public boolean Y;
    public final Object Z;
    public final Object f0;

    public x47(g94 g94Var, n84 n84Var) {
        n84Var.getClass();
        this.Z = g94Var;
        this.f0 = n84Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wl6 wl6Var;
        byte b = this.X;
        Object obj = this.f0;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                if (!this.Y) {
                    ((g94) obj2).d((n84) obj);
                    this.Y = true;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                mw8 mw8Var = swipeDismissBehavior.a;
                if (mw8Var != null && mw8Var.g()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.Y && (wl6Var = swipeDismissBehavior.b) != null) {
                    wl6Var.R(view);
                    break;
                }
                break;
        }
    }

    public x47(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f0 = swipeDismissBehavior;
        this.Z = view;
        this.Y = z;
    }
}

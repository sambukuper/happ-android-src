package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vx8 implements ViewTreeObserver.OnPreDrawListener {
    public boolean X;
    public final /* synthetic */ f86 Y;
    public final /* synthetic */ ViewTreeObserver Z;
    public final /* synthetic */ mm0 f0;

    public vx8(f86 f86Var, ViewTreeObserver viewTreeObserver, mm0 mm0Var) {
        this.Y = f86Var;
        this.Z = viewTreeObserver;
        this.f0 = mm0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f86 f86Var = this.Y;
        ta7 ta7VarC = f86Var.c();
        if (ta7VarC != null) {
            ViewTreeObserver viewTreeObserver = this.Z;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                f86Var.X.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.X) {
                this.X = true;
                this.f0.f(ta7VarC);
            }
        }
        return true;
    }
}

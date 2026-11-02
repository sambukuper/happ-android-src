package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout X;

    public f61(CoordinatorLayout coordinatorLayout) {
        this.X = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.X.n(0);
        return true;
    }
}

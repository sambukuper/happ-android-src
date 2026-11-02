package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iy8 extends hy8 {
    @Override // defpackage.ct7
    public final float e(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.ct7
    public final void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.hy8
    public final void h(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.hy8
    public final void i(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.hy8
    public final void j(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.hy8
    public final void k(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}

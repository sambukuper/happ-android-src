package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import androidx.recyclerview.widget.c;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ku2 extends c {
    public boolean p;
    public final /* synthetic */ GridLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku2(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager.t0.getContext());
        this.q = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.c, defpackage.p96
    public final void c() {
        super.c();
        if (!this.p) {
            k();
        }
        GridLayoutManager gridLayoutManager = this.q;
        if (gridLayoutManager.H0 == this) {
            gridLayoutManager.H0 = null;
        }
        if (gridLayoutManager.I0 == this) {
            gridLayoutManager.I0 = null;
        }
    }

    @Override // androidx.recyclerview.widget.c, defpackage.p96
    public final void d(View view, n96 n96Var) {
        int i;
        int i2;
        int[] iArr = GridLayoutManager.i1;
        GridLayoutManager gridLayoutManager = this.q;
        if (gridLayoutManager.k1(view, null, iArr)) {
            if (gridLayoutManager.u0) {
                i = iArr[1];
                i2 = iArr[0];
            } else {
                i = iArr[0];
                i2 = iArr[1];
            }
            int iCeil = (int) Math.ceil(((double) j((int) Math.sqrt((i2 * i2) + (i * i)))) / 0.3356d);
            n96Var.a = i;
            n96Var.b = i2;
            n96Var.c = iCeil;
            n96Var.e = this.i;
            n96Var.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final float i(DisplayMetrics displayMetrics) {
        return super.i(displayMetrics) * this.q.r0;
    }

    @Override // androidx.recyclerview.widget.c
    public final int j(int i) {
        int iJ = super.j(i);
        int i2 = ((m09) this.q.Z0.f0).i;
        if (i2 > 0) {
            float f = (30.0f / i2) * i;
            if (iJ < f) {
                return (int) f;
            }
        }
        return iJ;
    }

    public void k() {
        View viewD = this.b.s0.D(this.a);
        GridLayoutManager gridLayoutManager = this.q;
        if (viewD == null) {
            int i = this.a;
            if (i >= 0) {
                gridLayoutManager.A1(i, false);
                return;
            }
            return;
        }
        int i2 = gridLayoutManager.G0;
        int i3 = this.a;
        if (i2 != i3) {
            gridLayoutManager.G0 = i3;
        }
        if (gridLayoutManager.X()) {
            gridLayoutManager.E0 |= 32;
            viewD.requestFocus();
            gridLayoutManager.E0 &= -33;
        }
        gridLayoutManager.b1();
        gridLayoutManager.c1();
    }
}

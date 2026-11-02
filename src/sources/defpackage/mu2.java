package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mu2 extends ku2 {
    public final boolean r;
    public int s;
    public final /* synthetic */ GridLayoutManager t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu2(GridLayoutManager gridLayoutManager, int i, boolean z) {
        super(gridLayoutManager);
        this.t = gridLayoutManager;
        this.s = i;
        this.r = z;
        this.a = -2;
    }

    @Override // defpackage.p96
    public final PointF a(int i) {
        int i2 = this.s;
        if (i2 == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.t;
        int i3 = ((gridLayoutManager.E0 & 262144) == 0 ? i2 >= 0 : i2 <= 0) ? 1 : -1;
        return !gridLayoutManager.u0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // defpackage.ku2
    public final void k() {
        super.k();
        this.s = 0;
        View viewD = this.b.s0.D(this.a);
        if (viewD != null) {
            this.t.B1(viewD, viewD.findFocus(), true);
        }
    }
}

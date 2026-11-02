package defpackage;

import android.graphics.PointF;
import androidx.leanback.widget.GridLayoutManager;
import androidx.recyclerview.widget.j;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ju2 extends ku2 {
    public final /* synthetic */ GridLayoutManager r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager);
        this.r = gridLayoutManager;
    }

    @Override // defpackage.p96
    public final PointF a(int i) {
        if (this.b.s0.I() == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.r;
        int iT = j.T(gridLayoutManager.H(0));
        int i2 = ((gridLayoutManager.E0 & 262144) == 0 ? i >= iT : i <= iT) ? 1 : -1;
        return !gridLayoutManager.u0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }
}

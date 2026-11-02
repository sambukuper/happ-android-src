package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.k;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jx8 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx8(ViewPager2 viewPager2) {
        super(1);
        this.G0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean C0(k kVar, q96 q96Var, int i, Bundle bundle) {
        this.G0.y0.getClass();
        return super.C0(kVar, q96Var, i, bundle);
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean J0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(q96 q96Var, int[] iArr) {
        ViewPager2 viewPager2 = this.G0;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.a1(q96Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final void k0(k kVar, q96 q96Var, h4 h4Var) {
        super.k0(kVar, q96Var, h4Var);
        this.G0.y0.getClass();
    }

    @Override // androidx.recyclerview.widget.j
    public final void m0(k kVar, q96 q96Var, View view, h4 h4Var) {
        int iT;
        int iT2;
        ViewPager2 viewPager2 = (ViewPager2) this.G0.y0.g0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.l0.getClass();
            iT = j.T(view);
        } else {
            iT = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.l0.getClass();
            iT2 = j.T(view);
        } else {
            iT2 = 0;
        }
        h4Var.o(g4.a(iT, false, 1, iT2, 1));
    }
}

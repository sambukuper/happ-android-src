package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.a;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 extends du4 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ a n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(a aVar, Context context, gn7 gn7Var, View view) {
        super(w26.actionOverflowMenuStyle, 0, gn7Var, context, view, false);
        this.n = aVar;
        if ((gn7Var.A.x & 32) != 32) {
            View view2 = aVar.k0;
            this.f = view2 == null ? (View) aVar.j0 : view2;
        }
        yr2 yr2Var = aVar.y0;
        this.i = yr2Var;
        bu4 bu4Var = this.j;
        if (bu4Var != null) {
            bu4Var.g(yr2Var);
        }
    }

    @Override // defpackage.du4
    public final void c() {
        byte b = this.m;
        a aVar = this.n;
        switch (b) {
            case 0:
                aVar.v0 = null;
                super.c();
                break;
            default:
                nt4 nt4Var = aVar.Z;
                if (nt4Var != null) {
                    nt4Var.c(true);
                }
                aVar.u0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(a aVar, Context context, nt4 nt4Var, View view) {
        super(w26.actionOverflowMenuStyle, 0, nt4Var, context, view, true);
        this.n = aVar;
        this.g = 8388613;
        yr2 yr2Var = aVar.y0;
        this.i = yr2Var;
        bu4 bu4Var = this.j;
        if (bu4Var != null) {
            bu4Var.g(yr2Var);
        }
    }
}

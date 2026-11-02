package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.c;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lg5 extends c {
    public final /* synthetic */ mg5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg5(mg5 mg5Var, Context context) {
        super(context);
        this.p = mg5Var;
    }

    @Override // androidx.recyclerview.widget.c, defpackage.p96
    public final void d(View view, n96 n96Var) {
        mg5 mg5Var = this.p;
        int[] iArrB = mg5Var.b(mg5Var.a.getLayoutManager(), view);
        int i = iArrB[0];
        int i2 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) j(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            n96Var.a = i;
            n96Var.b = i2;
            n96Var.c = iCeil;
            n96Var.e = this.i;
            n96Var.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.c
    public final float i(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.c
    public final int j(int i) {
        return Math.min(100, super.j(i));
    }
}

package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e82 extends i96 {
    public final /* synthetic */ g82 a;

    public e82(g82 g82Var) {
        this.a = g82Var;
    }

    @Override // defpackage.i96
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        g82 g82Var = this.a;
        int i3 = g82Var.a;
        int iComputeVerticalScrollRange = g82Var.s.computeVerticalScrollRange();
        int i4 = g82Var.r;
        g82Var.t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = g82Var.s.computeHorizontalScrollRange();
        int i5 = g82Var.q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        g82Var.u = z;
        boolean z2 = g82Var.t;
        if (!z2 && !z) {
            if (g82Var.v != 0) {
                g82Var.l(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            g82Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            g82Var.k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (g82Var.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            g82Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            g82Var.n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        byte b = g82Var.v;
        if (b == 0 || b == 1) {
            g82Var.l(1);
        }
    }
}

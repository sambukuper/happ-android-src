package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tq4 extends LinearLayoutManager {
    public final /* synthetic */ int G0;
    public final /* synthetic */ wq4 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq4(wq4 wq4Var, int i, int i2) {
        super(i);
        this.H0 = wq4Var;
        this.G0 = i2;
    }

    @Override // androidx.recyclerview.widget.j
    public final void X0(RecyclerView recyclerView, int i) {
        io0 io0Var = new io0(recyclerView.getContext());
        io0Var.a = i;
        Y0(io0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(q96 q96Var, int[] iArr) {
        wq4 wq4Var = this.H0;
        RecyclerView recyclerView = wq4Var.k1;
        if (this.G0 == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = wq4Var.k1.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = wq4Var.k1.getHeight();
        }
    }
}

package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr2 extends z51 {
    public final /* synthetic */ ArrayList p;
    public final /* synthetic */ xr2 q;

    public wr2(ArrayList arrayList, xr2 xr2Var) {
        this.p = arrayList;
        this.q = xr2Var;
    }

    @Override // defpackage.z51
    public final void k(ld0 ld0Var) {
        ld0Var.getClass();
        hf5.r(ld0Var, null);
        this.p.add(ld0Var);
    }

    @Override // defpackage.z51
    public final void u(ld0 ld0Var, ld0 ld0Var2) {
        throw new IllegalStateException(("Conflict in scope of " + this.q.b + ": " + ld0Var + " vs " + ld0Var2).toString());
    }
}

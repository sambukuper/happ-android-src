package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kl2 implements jl2 {
    public final int a;
    public final /* synthetic */ ml2 b;

    public kl2(ml2 ml2Var, int i) {
        this.b = ml2Var;
        this.a = i;
    }

    @Override // defpackage.jl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ml2 ml2Var = this.b;
        qk2 qk2Var = ml2Var.z;
        int i = this.a;
        if (qk2Var == null || i >= 0 || !qk2Var.j().T(-1, 0)) {
            return ml2Var.U(i, 1, arrayList, arrayList2);
        }
        return false;
    }
}

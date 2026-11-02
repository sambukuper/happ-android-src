package defpackage;

import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class he5 implements rn2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ xz4 Z;
    public final /* synthetic */ i48 f0;
    public final /* synthetic */ x67 g0;

    public he5(boolean z, boolean z2, xz4 xz4Var, i48 i48Var, x67 x67Var) {
        this.X = z;
        this.Y = z2;
        this.Z = xz4Var;
        this.f0 = i48Var;
        this.g0 = x67Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            qe4.l0.O(this.X, this.Y, this.Z, null, this.f0, this.g0, 0.0f, 0.0f, lp2Var, 100663296, MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}

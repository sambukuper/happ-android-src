package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x34 extends l34 {
    public final /* synthetic */ b44 b;
    public final /* synthetic */ rn2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x34(b44 b44Var, rn2 rn2Var, String str) {
        super(str);
        this.b = b44Var;
        this.c = rn2Var;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        b44 b44Var = this.b;
        v34 v34Var = b44Var.j0;
        v34Var.X = zr4Var.getLayoutDirection();
        v34Var.Y = zr4Var.getDensity();
        v34Var.Z = zr4Var.b0();
        boolean zC0 = zr4Var.c0();
        rn2 rn2Var = this.c;
        if (zC0 || b44Var.X.k0 == null) {
            b44Var.f0 = 0;
            yr4 yr4Var = (yr4) rn2Var.K(v34Var, new q31(j));
            return new w34(yr4Var, b44Var, b44Var.f0, yr4Var, (byte) 1);
        }
        b44Var.g0 = 0;
        yr4 yr4Var2 = (yr4) rn2Var.K(b44Var.k0, new q31(j));
        return new w34(yr4Var2, b44Var, b44Var.g0, yr4Var2, (byte) 0);
    }
}

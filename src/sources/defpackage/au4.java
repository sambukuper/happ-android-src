package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class au4 implements rn2 {
    public final /* synthetic */ rn2 X;
    public final /* synthetic */ qt4 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zy0 f0;

    public au4(rn2 rn2Var, qt4 qt4Var, boolean z, zy0 zy0Var) {
        this.X = rn2Var;
        this.Y = qt4Var;
        this.Z = z;
        this.f0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 2;
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.Z;
            qt4 qt4Var = this.Y;
            rn2 rn2Var = this.X;
            if (rn2Var != null) {
                lp2Var.W(-864613220);
                mb6.a(j41.a.a(new dw0(z ? qt4Var.b : qt4Var.e)), jm4.U(1241781204, new i8(rn2Var, b), lp2Var), lp2Var, 56);
                lp2Var.p(false);
            } else {
                lp2Var.W(-864293207);
                lp2Var.p(false);
            }
            mb6.a(j41.a.a(new dw0(z ? qt4Var.a : qt4Var.d)), jm4.U(-893579015, new n40(rn2Var, this.f0, (byte) 3), lp2Var), lp2Var, 56);
            lp2Var.W(-863072055);
            lp2Var.p(false);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}

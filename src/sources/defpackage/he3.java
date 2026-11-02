package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he3 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ie3 Y;

    public /* synthetic */ he3(ie3 ie3Var, byte b) {
        this.X = b;
        this.Y = ie3Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        ie3 ie3Var = this.Y;
        ye8 ye8Var = (ye8) obj;
        switch (b) {
            case 0:
                ye8Var.getClass();
                ie3 ie3Var2 = (ie3) ye8Var;
                v09 v09Var = ie3Var.r0;
                if (!dh3.f(ie3Var2.q0, v09Var)) {
                    ie3Var2.q0 = v09Var;
                    ie3Var2.Z0();
                }
                return xe8.Y;
            default:
                ye8Var.getClass();
                ie3Var.q0 = ((ie3) ye8Var).r0;
                return Boolean.FALSE;
        }
    }
}

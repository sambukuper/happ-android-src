package defpackage;

import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q30 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ q30(boolean z, Object obj, byte b) {
        this.X = b;
        this.Y = z;
        this.Z = obj;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj = this.Z;
        boolean z = this.Y;
        switch (b) {
            case 0:
                w05 w05Var = (w05) obj;
                if (z) {
                    w05Var.g(dn8Var);
                }
                break;
            case 1:
                dn2 dn2Var = (dn2) obj;
                if (z) {
                    dn2Var.invoke();
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                int i = MainActivity.y1;
                if (!z) {
                    u84 u84VarH = i21.H(mainActivity);
                    nf1 nf1Var = tp1.a;
                    jm4.Q(u84VarH, dm4.a, new nk4(mainActivity, null, (byte) 0), 2);
                }
                break;
        }
        return dn8Var;
    }
}

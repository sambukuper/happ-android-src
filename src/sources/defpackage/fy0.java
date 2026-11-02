package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy0 implements a94 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ fy0(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ComponentActivity.i((z95) obj2, (ComponentActivity) obj, d94Var, n84Var);
                break;
            default:
                y05 y05Var = (y05) obj;
                if (n84Var == ((n84) obj2)) {
                    ((dn2) y05Var.getValue()).invoke();
                }
                break;
        }
    }
}

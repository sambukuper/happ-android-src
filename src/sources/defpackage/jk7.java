package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class jk7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ok7 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jk7(ok7 ok7Var, byte b) {
        this.X = b;
        this.Y = ok7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        ok7 ok7Var = this.Y;
        switch (b) {
            case 0:
                ((u95) obj).getClass();
                if (!((pk7) ok7Var.Y().d.X.getValue()).b) {
                    ok7Var.R(false, false);
                }
                return dn8.a;
            default:
                pk7 pk7Var = (pk7) obj;
                pk7Var.getClass();
                Bundle bundle = ((qk2) ok7Var).h0;
                boolean z = bundle != null ? bundle.getBoolean("is_force") : false;
                Bundle bundle2 = ((qk2) ok7Var).h0;
                ld6[] ld6VarArr = bundle2 != null ? (ld6[]) c4.k(bundle2, yb6.a.b(ld6.class)) : null;
                if (ld6VarArr == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                ec7 ec7Var = ec7.Y;
                ec7Var.getClass();
                qm5 qm5VarC = ec7Var.c();
                bw0.e0(qm5VarC, ld6VarArr);
                return pk7.a(pk7Var, qm5VarC.c(), z, 0, null, 12);
        }
    }
}

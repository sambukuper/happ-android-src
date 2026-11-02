package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm0 implements dn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ String Y;
    public final /* synthetic */ x39 Z;

    public /* synthetic */ hm0(x39 x39Var, String str) {
        this.Z = x39Var;
        this.Y = str;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        x39 x39Var = this.Z;
        String str = this.Y;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = x39Var.k0;
                workDatabase.getClass();
                workDatabase.o(new jm0(workDatabase, str, x39Var, (byte) 1));
                ax6.b(x39Var.j0, x39Var.k0, x39Var.m0);
                break;
            default:
                str.getClass();
                x39Var.getClass();
                WorkDatabase workDatabase2 = x39Var.k0;
                workDatabase2.getClass();
                workDatabase2.o(new jm0(workDatabase2, str, x39Var, (byte) 0));
                ax6.b(x39Var.j0, workDatabase2, x39Var.m0);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ hm0(String str, x39 x39Var) {
        this.Y = str;
        this.Z = x39Var;
    }
}

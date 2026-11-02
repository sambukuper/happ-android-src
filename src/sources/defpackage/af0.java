package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class af0 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ef0 Y;

    public /* synthetic */ af0(ef0 ef0Var, byte b) {
        this.X = b;
        this.Y = ef0Var;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ef0 ef0Var = this.Y;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) obj;
                hi0 hi0Var = ef0Var.d;
                if (dl0Var instanceof zk0) {
                    if (((zk0) dl0Var).a.equals(hi0Var.a)) {
                        ef0Var.d(dl0Var);
                        return dn8Var;
                    }
                    bt.i("Check failed.");
                } else {
                    if (!(dl0Var instanceof bl0)) {
                        return dn8Var;
                    }
                    if (dh3.f(((bl0) dl0Var).a, hi0Var.a)) {
                        ef0Var.d(dl0Var);
                        return dn8Var;
                    }
                    bt.i("Check failed.");
                }
                return null;
            default:
                ef0Var.d(al0.a);
                return dn8Var;
        }
    }
}

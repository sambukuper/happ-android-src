package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr0 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ f17 Y;

    public /* synthetic */ mr0(f17 f17Var, byte b) {
        this.X = b;
        this.Y = f17Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        boolean z = true;
        f17 f17Var = this.Y;
        switch (b) {
            case 0:
                ye8 ye8Var = (ye8) obj;
                ye8Var.getClass();
                di5 di5Var = (di5) ye8Var;
                di5Var.r0 = true;
                di5Var.q0.B(f17Var);
                ch3.I(di5Var);
                return Boolean.FALSE;
            default:
                Boolean boolA = ((yd) ((ga2) obj)).a();
                if (boolA != null) {
                    ib8 ib8Var = boolA.booleanValue() ? ib8.X : ib8.Y;
                    nw3[] nw3VarArr = d17.a;
                    e17 e17Var = c17.L;
                    nw3 nw3Var = d17.a[26];
                    e17Var.getClass();
                    f17Var.a(e17Var, ib8Var);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}

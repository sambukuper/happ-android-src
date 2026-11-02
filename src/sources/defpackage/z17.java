package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class z17 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ j31 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z17(j31 j31Var, byte b) {
        this.X = b;
        this.Y = j31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object a(ze2 ze2Var, q51 q51Var) {
        x17 x17Var;
        a27 a27Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        j31 j31Var = this.Y;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                if (q51Var instanceof x17) {
                    x17Var = (x17) q51Var;
                    int i = x17Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        x17Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        x17Var = new x17(this, q51Var);
                    }
                } else {
                    x17Var = new x17(this, q51Var);
                }
                Object obj = x17Var.f0;
                int i2 = x17Var.g0;
                if (i2 == 0) {
                    w39.n0(obj);
                    n nVar = new n(ze2Var, (byte) 29);
                    x17Var.g0 = 1;
                    return j31Var.a(nVar, x17Var) == c71Var ? c71Var : dn8Var;
                }
                if (i2 == 1) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (q51Var instanceof a27) {
                    a27Var = (a27) q51Var;
                    int i3 = a27Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a27Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        a27Var = new a27(this, q51Var);
                    }
                } else {
                    a27Var = new a27(this, q51Var);
                }
                Object obj2 = a27Var.f0;
                int i4 = a27Var.g0;
                if (i4 == 0) {
                    w39.n0(obj2);
                    c27 c27Var = new c27(ze2Var, (byte) 0);
                    a27Var.g0 = 1;
                    return j31Var.a(c27Var, a27Var) == c71Var ? c71Var : dn8Var;
                }
                if (i4 == 1) {
                    w39.n0(obj2);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

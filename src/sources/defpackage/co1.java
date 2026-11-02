package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class co1 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ h76 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ co1(h76 h76Var, byte b) {
        this.X = b;
        this.Y = h76Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object a(ze2 ze2Var, q51 q51Var) {
        ao1 ao1Var;
        uo4 uo4Var;
        byte b = this.X;
        h76 h76Var = this.Y;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                if (q51Var instanceof ao1) {
                    ao1Var = (ao1) q51Var;
                    int i = ao1Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ao1Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        ao1Var = new ao1(this, q51Var);
                    }
                } else {
                    ao1Var = new ao1(this, q51Var);
                }
                Object obj = ao1Var.f0;
                int i2 = ao1Var.g0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                n nVar = new n(ze2Var, (byte) 3);
                ao1Var.g0 = 1;
                h76Var.a(nVar, ao1Var);
                return c71Var;
            default:
                if (q51Var instanceof uo4) {
                    uo4Var = (uo4) q51Var;
                    int i3 = uo4Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uo4Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        uo4Var = new uo4(this, q51Var);
                    }
                } else {
                    uo4Var = new uo4(this, q51Var);
                }
                Object obj2 = uo4Var.f0;
                int i4 = uo4Var.g0;
                if (i4 != 0) {
                    if (i4 == 1) {
                        w39.n0(obj2);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj2);
                n nVar2 = new n(ze2Var, (byte) 21);
                uo4Var.g0 = 1;
                h76Var.a(nVar2, uo4Var);
                return c71Var;
        }
    }
}

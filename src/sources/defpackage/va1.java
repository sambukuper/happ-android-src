package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class va1 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ sf2 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ va1(sf2 sf2Var, byte b) {
        this.X = b;
        this.Y = sf2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final Object a(ze2 ze2Var, q51 q51Var) {
        mo4 mo4Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        sf2 sf2Var = this.Y;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                Object objA = sf2Var.a(new n(ze2Var, (byte) 2), q51Var);
                return objA == c71Var ? objA : dn8Var;
            default:
                if (q51Var instanceof mo4) {
                    mo4Var = (mo4) q51Var;
                    int i = mo4Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mo4Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        mo4Var = new mo4(this, q51Var);
                    }
                } else {
                    mo4Var = new mo4(this, q51Var);
                }
                Object obj = mo4Var.f0;
                int i2 = mo4Var.g0;
                if (i2 == 0) {
                    w39.n0(obj);
                    n nVar = new n(ze2Var, (byte) 20);
                    mo4Var.g0 = 1;
                    return sf2Var.a(nVar, mo4Var) == c71Var ? c71Var : dn8Var;
                }
                if (i2 == 1) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

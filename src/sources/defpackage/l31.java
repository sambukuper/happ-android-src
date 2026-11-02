package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l31 {
    public static final /* synthetic */ int a = 0;

    static {
        lh4.a1("ConstraintTrkngWrkr");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(cc0 cc0Var, l49 l49Var, s51 s51Var) {
        k31 k31Var;
        if (s51Var instanceof k31) {
            k31Var = (k31) s51Var;
            int i = k31Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                k31Var.g0 = i - Integer.MIN_VALUE;
            } else {
                k31Var = new k31(s51Var);
            }
        } else {
            k31Var = new k31(s51Var);
        }
        Object objQ = k31Var.f0;
        int i2 = k31Var.g0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objQ);
            j31 j31Var = new j31(new sf2(cc0Var.g(l49Var), new l40((Object) l49Var, q51Var, (byte) 2), (byte) 2), (byte) 0);
            k31Var.g0 = 1;
            objQ = gv3.q(j31Var, k31Var);
            c71 c71Var = c71.X;
            if (objQ == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objQ);
        }
        return new Integer(((w31) objQ).a);
    }
}

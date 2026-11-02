package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t9 {
    public static final y2 a = new y2((byte) 4);
    public static final bd1 b = new bd1(new lh4((byte) 29));

    public static Object a(la laVar, Object obj, q51 q51Var) {
        laVar.getClass();
        Object objA = laVar.a(obj, f15.X, new l9(laVar, g9.a, null), q51Var);
        return objA == c71.X ? objA : dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(dn2 dn2Var, rn2 rn2Var, s51 s51Var) {
        n9 n9Var;
        if (s51Var instanceof n9) {
            n9Var = (n9) s51Var;
            int i = n9Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9Var.g0 = i - Integer.MIN_VALUE;
            } else {
                n9Var = new n9(s51Var);
            }
        } else {
            n9Var = new n9(s51Var);
        }
        Object obj = n9Var.f0;
        int i2 = n9Var.g0;
        q51 q51Var = null;
        byte b2 = 1;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                s9 s9Var = new s9(dn2Var, rn2Var, q51Var, b2);
                n9Var.g0 = 1;
                Object objN = gv3.n(s9Var, n9Var);
                c71 c71Var = c71.X;
                if (objN == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
            }
        } catch (f9 unused) {
        }
        return dn8.a;
    }
}

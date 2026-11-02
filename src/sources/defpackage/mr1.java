package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mr1 implements dq2 {
    public static final mr1 a;
    private static final e37 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        mr1 mr1Var = new mr1();
        a = mr1Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.util.dnsttv.DnsTunnelController.JwtResponseCode", mr1Var, 1);
        zp5Var.k("rc", true);
        descriptor = zp5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ol7 ol7Var, Object obj) {
        or1 or1Var = (or1) obj;
        or1Var.getClass();
        Integer num = or1Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        if (ol7VarA.w(e37Var) || num != null) {
            ol7VarA.p(e37Var, 0, nf3.a, num);
        }
        ol7VarA.v(e37Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: fn8 */
    public final Object b(rd1 rd1Var) throws fn8 {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        Integer num = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else {
                if (iE != 0) {
                    throw new fn8(iE);
                }
                num = (Integer) f01VarT.x(e37Var, 0, nf3.a, num);
                i = 1;
            }
        }
        f01VarT.n(e37Var);
        return new or1(i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ow3[] c() {
        return new ow3[]{zc1.Q(nf3.a)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e37 d() {
        return descriptor;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ea1 implements dq2 {
    public static final ea1 a;
    private static final e37 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ea1 ea1Var = new ea1();
        a = ea1Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.firebase.entity.notification.DataLocaleItem", ea1Var, 3);
        zp5Var.k("title", true);
        zp5Var.k("body", false);
        zp5Var.k("link-for-open", true);
        descriptor = zp5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ol7 ol7Var, Object obj) {
        ga1 ga1Var = (ga1) obj;
        ga1Var.getClass();
        String str = ga1Var.X;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        if (ol7VarA.w(e37Var) || str != null) {
            ol7VarA.p(e37Var, 0, yl7.a, str);
        }
        String str2 = ga1Var.Y;
        String str3 = ga1Var.Z;
        ol7VarA.u(e37Var, 1, str2);
        if (ol7VarA.w(e37Var) || str3 != null) {
            ol7VarA.p(e37Var, 2, yl7.a, str3);
        }
        ol7VarA.v(e37Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: fn8 */
    public final Object b(rd1 rd1Var) throws fn8 {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        String str = null;
        boolean z = true;
        int i = 0;
        String strK = null;
        String str2 = null;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                str = (String) f01VarT.x(e37Var, 0, yl7.a, str);
                i |= 1;
            } else if (iE == 1) {
                strK = f01VarT.k(e37Var, 1);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new fn8(iE);
                }
                str2 = (String) f01VarT.x(e37Var, 2, yl7.a, str2);
                i |= 4;
            }
        }
        f01VarT.n(e37Var);
        return new ga1(i, str, strK, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ow3[] c() {
        ow3 ow3Var = yl7.a;
        return new ow3[]{zc1.Q(ow3Var), ow3Var, zc1.Q(ow3Var)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e37 d() {
        return descriptor;
    }
}

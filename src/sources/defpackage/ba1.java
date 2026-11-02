package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ba1 implements dq2 {
    public static final ba1 a;
    private static final e37 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ba1 ba1Var = new ba1();
        a = ba1Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.firebase.entity.notification.DataLocale", ba1Var, 5);
        zp5Var.k("DEFAULT", false);
        zp5Var.k("EN", true);
        zp5Var.k("RU", true);
        zp5Var.k("CN", true);
        zp5Var.k("FA", true);
        descriptor = zp5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ol7 ol7Var, Object obj) {
        da1 da1Var = (da1) obj;
        da1Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        ea1 ea1Var = ea1.a;
        ga1 ga1Var = da1Var.X;
        ga1 ga1Var2 = da1Var.g0;
        ga1 ga1Var3 = da1Var.f0;
        ga1 ga1Var4 = da1Var.Z;
        ga1 ga1Var5 = da1Var.Y;
        ol7VarA.q(e37Var, 0, ea1Var, ga1Var);
        if (ol7VarA.w(e37Var) || ga1Var5 != null) {
            ol7VarA.p(e37Var, 1, ea1Var, ga1Var5);
        }
        if (ol7VarA.w(e37Var) || ga1Var4 != null) {
            ol7VarA.p(e37Var, 2, ea1Var, ga1Var4);
        }
        if (ol7VarA.w(e37Var) || ga1Var3 != null) {
            ol7VarA.p(e37Var, 3, ea1Var, ga1Var3);
        }
        if (ol7VarA.w(e37Var) || ga1Var2 != null) {
            ol7VarA.p(e37Var, 4, ea1Var, ga1Var2);
        }
        ol7VarA.v(e37Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: fn8 */
    public final Object b(rd1 rd1Var) throws fn8 {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        int i = 0;
        ga1 ga1Var = null;
        ga1 ga1Var2 = null;
        ga1 ga1Var3 = null;
        ga1 ga1Var4 = null;
        ga1 ga1Var5 = null;
        boolean z = true;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                ga1Var = (ga1) f01VarT.q(e37Var, 0, ea1.a, ga1Var);
                i |= 1;
            } else if (iE == 1) {
                ga1Var2 = (ga1) f01VarT.x(e37Var, 1, ea1.a, ga1Var2);
                i |= 2;
            } else if (iE == 2) {
                ga1Var3 = (ga1) f01VarT.x(e37Var, 2, ea1.a, ga1Var3);
                i |= 4;
            } else if (iE == 3) {
                ga1Var4 = (ga1) f01VarT.x(e37Var, 3, ea1.a, ga1Var4);
                i |= 8;
            } else {
                if (iE != 4) {
                    throw new fn8(iE);
                }
                ga1Var5 = (ga1) f01VarT.x(e37Var, 4, ea1.a, ga1Var5);
                i |= 16;
            }
        }
        f01VarT.n(e37Var);
        return new da1(i, ga1Var, ga1Var2, ga1Var3, ga1Var4, ga1Var5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ow3[] c() {
        ow3 ow3Var = ea1.a;
        return new ow3[]{ow3Var, zc1.Q(ow3Var), zc1.Q(ow3Var), zc1.Q(ow3Var), zc1.Q(ow3Var)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e37 d() {
        return descriptor;
    }
}

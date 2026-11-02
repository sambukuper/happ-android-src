package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gs7 implements dq2 {
    public static final gs7 a;
    private static final e37 descriptor;

    static {
        gs7 gs7Var = new gs7();
        a = gs7Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.sub.SubscriptionProperties.AutoUpdateProperties", gs7Var, 5);
        zp5Var.k("isEnabled", true);
        zp5Var.k("isBlocked", true);
        zp5Var.k("updateInterval", true);
        zp5Var.k("initialDelay", true);
        zp5Var.k("showNotifications", true);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        is7 is7Var = (is7) obj;
        is7Var.getClass();
        boolean z = is7Var.e;
        int i = is7Var.d;
        int i2 = is7Var.c;
        boolean z2 = is7Var.b;
        boolean z3 = is7Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        if (ol7VarA.w(e37Var) || z3) {
            ol7VarA.c(e37Var, 0, z3);
        }
        if (ol7VarA.w(e37Var) || z2) {
            ol7VarA.c(e37Var, 1, z2);
        }
        if (ol7VarA.w(e37Var) || i2 != 1) {
            ol7VarA.l(2, i2, e37Var);
        }
        if (ol7VarA.w(e37Var) || i != 1) {
            ol7VarA.l(3, i, e37Var);
        }
        if (ol7VarA.w(e37Var) || z) {
            ol7VarA.c(e37Var, 4, z);
        }
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int iR = 0;
        int iR2 = 0;
        boolean z4 = false;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                z2 = f01VarT.z(e37Var, 0);
                i |= 1;
            } else if (iE == 1) {
                z3 = f01VarT.z(e37Var, 1);
                i |= 2;
            } else if (iE == 2) {
                iR = f01VarT.r(e37Var, 2);
                i |= 4;
            } else if (iE == 3) {
                iR2 = f01VarT.r(e37Var, 3);
                i |= 8;
            } else {
                if (iE != 4) {
                    throw new fn8(iE);
                }
                z4 = f01VarT.z(e37Var, 4);
                i |= 16;
            }
        }
        f01VarT.n(e37Var);
        return new is7(i, z2, z3, iR, iR2, z4);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        u60 u60Var = u60.a;
        nf3 nf3Var = nf3.a;
        return new ow3[]{u60Var, u60Var, nf3Var, nf3Var, u60Var};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks7 implements dq2 {
    public static final ks7 a;
    private static final e37 descriptor;

    static {
        ks7 ks7Var = new ks7();
        a = ks7Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.sub.SubscriptionProperties.SendingDataProperties", ks7Var, 2);
        zp5Var.k("isSendHwidEnabled", true);
        zp5Var.k("isSendHwidAlwaysEnabled", true);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ms7 ms7Var = (ms7) obj;
        ms7Var.getClass();
        boolean z = ms7Var.b;
        boolean z2 = ms7Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        if (ol7VarA.w(e37Var) || !z2) {
            ol7VarA.c(e37Var, 0, z2);
        }
        if (ol7VarA.w(e37Var) || z) {
            ol7VarA.c(e37Var, 1, z);
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
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                z2 = f01VarT.z(e37Var, 0);
                i |= 1;
            } else {
                if (iE != 1) {
                    throw new fn8(iE);
                }
                z3 = f01VarT.z(e37Var, 1);
                i |= 2;
            }
        }
        f01VarT.n(e37Var);
        return new ms7(i, z2, z3);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        u60 u60Var = u60.a;
        return new ow3[]{u60Var, u60Var};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}

package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns7 implements dq2 {
    public static final ns7 a;
    private static final e37 descriptor;

    static {
        ns7 ns7Var = new ns7();
        a = ns7Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.sub.SubscriptionProperties.UserAgentProperties", ns7Var, 2);
        zp5Var.k("value", true);
        zp5Var.k("isBlocked", true);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ps7 ps7Var = (ps7) obj;
        ps7Var.getClass();
        boolean z = ps7Var.b;
        String str = ps7Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        if (ol7VarA.w(e37Var) || !dh3.f(str, _UrlKt.FRAGMENT_ENCODE_SET)) {
            ol7VarA.u(e37Var, 0, str);
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
        String strK = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strK = f01VarT.k(e37Var, 0);
                i |= 1;
            } else {
                if (iE != 1) {
                    throw new fn8(iE);
                }
                z2 = f01VarT.z(e37Var, 1);
                i |= 2;
            }
        }
        f01VarT.n(e37Var);
        return new ps7(i, strK, z2);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        return new ow3[]{yl7.a, u60.a};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}

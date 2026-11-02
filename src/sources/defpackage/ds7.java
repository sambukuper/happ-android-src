package defpackage;

import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds7 implements dq2 {
    public static final ds7 a;
    private static final e37 descriptor;

    static {
        ds7 ds7Var = new ds7();
        a = ds7Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.sub.SubscriptionProperties.AutoConnectProperties", ds7Var, 2);
        zp5Var.k("isEnabled", true);
        zp5Var.k("connectType", true);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        fs7 fs7Var = (fs7) obj;
        fs7Var.getClass();
        SubscriptionAutoConnectType subscriptionAutoConnectType = fs7Var.b;
        boolean z = fs7Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        g44[] g44VarArr = fs7.c;
        if (ol7VarA.w(e37Var) || z) {
            ol7VarA.c(e37Var, 0, z);
        }
        if (ol7VarA.w(e37Var) || subscriptionAutoConnectType != SubscriptionAutoConnectType.LAST_USED) {
            ol7VarA.q(e37Var, 1, (ow3) g44VarArr[1].getValue(), subscriptionAutoConnectType);
        }
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        g44[] g44VarArr = fs7.c;
        SubscriptionAutoConnectType subscriptionAutoConnectType = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
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
                subscriptionAutoConnectType = (SubscriptionAutoConnectType) f01VarT.q(e37Var, 1, (ow3) g44VarArr[1].getValue(), subscriptionAutoConnectType);
                i |= 2;
            }
        }
        f01VarT.n(e37Var);
        return new fs7(i, z2, subscriptionAutoConnectType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dq2
    public final ow3[] c() {
        return new ow3[]{u60.a, fs7.c[1].getValue()};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}

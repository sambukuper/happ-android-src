package defpackage;

import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs7 implements dq2 {
    public static final cs7 a;
    private static final e37 descriptor;

    static {
        cs7 cs7Var = new cs7();
        a = cs7Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.sub.SubscriptionProperties", cs7Var, 10);
        zp5Var.k("autoUpdate", true);
        zp5Var.k("updateOnOpen", true);
        zp5Var.k("pingOnOpen", true);
        zp5Var.k("autoConnect", true);
        zp5Var.k("isCollapseAllowed", true);
        zp5Var.k("dontUseFilter", true);
        zp5Var.k("sendingData", true);
        zp5Var.k("requestTimeoutSec", true);
        zp5Var.k("userAgent", true);
        zp5Var.k("sortType", true);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        qs7 qs7Var = (qs7) obj;
        qs7Var.getClass();
        SubscriptionSortType subscriptionSortType = qs7Var.j;
        ps7 ps7Var = qs7Var.i;
        int i = qs7Var.h;
        ms7 ms7Var = qs7Var.g;
        boolean z = qs7Var.f;
        boolean z2 = qs7Var.e;
        fs7 fs7Var = qs7Var.d;
        boolean z3 = qs7Var.c;
        boolean z4 = qs7Var.b;
        is7 is7Var = qs7Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        g44[] g44VarArr = qs7.k;
        if (ol7VarA.w(e37Var) || !dh3.f(is7Var, new is7())) {
            ol7VarA.q(e37Var, 0, gs7.a, is7Var);
        }
        if (ol7VarA.w(e37Var) || z4) {
            ol7VarA.c(e37Var, 1, z4);
        }
        if (ol7VarA.w(e37Var) || z3) {
            ol7VarA.c(e37Var, 2, z3);
        }
        if (ol7VarA.w(e37Var) || !dh3.f(fs7Var, new fs7())) {
            ol7VarA.q(e37Var, 3, ds7.a, fs7Var);
        }
        if (ol7VarA.w(e37Var) || !z2) {
            ol7VarA.c(e37Var, 4, z2);
        }
        if (ol7VarA.w(e37Var) || z) {
            ol7VarA.c(e37Var, 5, z);
        }
        if (ol7VarA.w(e37Var) || !dh3.f(ms7Var, new ms7())) {
            ol7VarA.q(e37Var, 6, ks7.a, ms7Var);
        }
        if (ol7VarA.w(e37Var) || i != 7) {
            ol7VarA.l(7, i, e37Var);
        }
        if (ol7VarA.w(e37Var) || !dh3.f(ps7Var, new ps7())) {
            ol7VarA.q(e37Var, 8, ns7.a, ps7Var);
        }
        if (ol7VarA.w(e37Var) || subscriptionSortType != SubscriptionSortType.WITHOUT) {
            ol7VarA.q(e37Var, 9, (ow3) g44VarArr[9].getValue(), subscriptionSortType);
        }
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        g44[] g44VarArr = qs7.k;
        ps7 ps7Var = null;
        SubscriptionSortType subscriptionSortType = null;
        is7 is7Var = null;
        fs7 fs7Var = null;
        ms7 ms7Var = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int iR = 0;
        while (z) {
            int iE = f01VarT.e(e37Var);
            switch (iE) {
                case -1:
                    z = false;
                    break;
                case 0:
                    is7Var = (is7) f01VarT.q(e37Var, 0, gs7.a, is7Var);
                    i |= 1;
                    break;
                case 1:
                    z2 = f01VarT.z(e37Var, 1);
                    i |= 2;
                    break;
                case 2:
                    z3 = f01VarT.z(e37Var, 2);
                    i |= 4;
                    break;
                case 3:
                    fs7Var = (fs7) f01VarT.q(e37Var, 3, ds7.a, fs7Var);
                    i |= 8;
                    break;
                case 4:
                    z4 = f01VarT.z(e37Var, 4);
                    i |= 16;
                    break;
                case 5:
                    z5 = f01VarT.z(e37Var, 5);
                    i |= 32;
                    break;
                case 6:
                    ms7Var = (ms7) f01VarT.q(e37Var, 6, ks7.a, ms7Var);
                    i |= 64;
                    break;
                case 7:
                    iR = f01VarT.r(e37Var, 7);
                    i |= 128;
                    break;
                case 8:
                    ps7Var = (ps7) f01VarT.q(e37Var, 8, ns7.a, ps7Var);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 9:
                    subscriptionSortType = (SubscriptionSortType) f01VarT.q(e37Var, 9, (ow3) g44VarArr[9].getValue(), subscriptionSortType);
                    i |= 512;
                    break;
                default:
                    throw new fn8(iE);
            }
        }
        f01VarT.n(e37Var);
        return new qs7(i, is7Var, z2, z3, fs7Var, z4, z5, ms7Var, iR, ps7Var, subscriptionSortType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dq2
    public final ow3[] c() {
        g44[] g44VarArr = qs7.k;
        u60 u60Var = u60.a;
        return new ow3[]{gs7.a, u60Var, u60Var, ds7.a, u60Var, u60Var, ks7.a, nf3.a, ns7.a, g44VarArr[9].getValue()};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}

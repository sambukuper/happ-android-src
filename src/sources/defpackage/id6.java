package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class id6 implements dq2 {
    public static final id6 a;
    private static final e37 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        id6 id6Var = new id6();
        a = id6Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.firebase.entity.notification.RemoteMessageEntity", id6Var, 6);
        zp5Var.k("id", false);
        zp5Var.k("dataLocale", false);
        zp5Var.k("expireTimestamp", false);
        zp5Var.k("image", true);
        zp5Var.k("pushType", true);
        zp5Var.k("isWatched", true);
        descriptor = zp5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ol7 ol7Var, Object obj) {
        ld6 ld6Var = (ld6) obj;
        ld6Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        g44[] g44VarArr = ld6.i0;
        md6 md6Var = md6.a;
        String str = ld6Var.X;
        boolean z = ld6Var.h0;
        kd6 kd6Var = ld6Var.g0;
        String str2 = ld6Var.f0;
        ol7VarA.q(e37Var, 0, md6Var, new od6(str));
        ol7VarA.q(e37Var, 1, ba1.a, ld6Var.Y);
        ol7VarA.n(e37Var, 2, ld6Var.Z);
        if (ol7VarA.w(e37Var) || str2 != null) {
            ol7VarA.p(e37Var, 3, yl7.a, str2);
        }
        if (ol7VarA.w(e37Var) || kd6Var != kd6.Z) {
            ol7VarA.q(e37Var, 4, (ow3) g44VarArr[4].getValue(), kd6Var);
        }
        if (ol7VarA.w(e37Var) || z) {
            ol7VarA.c(e37Var, 5, z);
        }
        ol7VarA.v(e37Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: fn8 */
    public final Object b(rd1 rd1Var) throws fn8 {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        g44[] g44VarArr = ld6.i0;
        int i = 0;
        boolean z = false;
        String str = null;
        da1 da1Var = null;
        String str2 = null;
        kd6 kd6Var = null;
        long jD = 0;
        boolean z2 = true;
        while (z2) {
            int iE = f01VarT.e(e37Var);
            switch (iE) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    od6 od6Var = (od6) f01VarT.q(e37Var, 0, md6.a, str != null ? new od6(str) : null);
                    str = od6Var != null ? od6Var.X : null;
                    i |= 1;
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                    da1Var = (da1) f01VarT.q(e37Var, 1, ba1.a, da1Var);
                    i |= 2;
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                    jD = f01VarT.D(e37Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) f01VarT.x(e37Var, 3, yl7.a, str2);
                    i |= 8;
                    break;
                case 4:
                    kd6Var = (kd6) f01VarT.q(e37Var, 4, (ow3) g44VarArr[4].getValue(), kd6Var);
                    i |= 16;
                    break;
                case 5:
                    z = f01VarT.z(e37Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new fn8(iE);
            }
        }
        f01VarT.n(e37Var);
        return new ld6(i, str, da1Var, jD, str2, kd6Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: ow3[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final ow3[] c() {
        return new ow3[]{md6.a, ba1.a, oi4.a, zc1.Q(yl7.a), ld6.i0[4].getValue(), u60.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e37 d() {
        return descriptor;
    }
}

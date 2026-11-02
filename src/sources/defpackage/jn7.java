package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class jn7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ qn7 Y;
    public final /* synthetic */ kx4 Z;
    public final /* synthetic */ gn2 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jn7(qn7 qn7Var, kx4 kx4Var, gn2 gn2Var) {
        this.X = (byte) 1;
        this.Y = qn7Var;
        this.Z = kx4Var;
        this.f0 = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        kx4 kx4Var = this.Z;
        dn8 dn8Var = dn8.a;
        gn2 gn2Var = this.f0;
        qn7 qn7Var = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ln7.a(qn7Var, gn2Var, kx4Var, (lp2) obj, w79.P(385));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    String strJ0 = vj8.j0(y46.sub_routing_general_sub_name, lp2Var);
                    String str = qn7Var.b;
                    boolean z = qn7Var.c;
                    String strJ1 = "";
                    if (str == null) {
                        lp2Var.W(1009050849);
                        lp2Var.p(false);
                    } else if (str.equals("")) {
                        lp2Var.W(-383089849);
                        strJ1 = vj8.j0(y46.title_server_list, lp2Var);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(-383087420);
                        lp2Var.p(false);
                        strJ1 = qn7Var.b;
                    }
                    kx4 kx4Var2 = this.Z;
                    u15.a(strJ0, strJ1, kx4Var2, lp2Var, 384);
                    String strJ2 = vj8.j0(y46.sub_routing_general_enable_routing, lp2Var);
                    boolean z2 = qn7Var.d;
                    b83 b83Var = qn7Var.f;
                    boolean z3 = (b83Var == null || !(b83Var.isEmpty() ^ true) || z) ? false : true;
                    boolean zF = lp2Var.f(gn2Var);
                    Object objK = lp2Var.K();
                    Object obj3 = zz0.a;
                    if (zF || objK == obj3) {
                        objK = new pr2(gn2Var, (byte) 3);
                        lp2Var.g0(objK);
                    }
                    gn2 gn2Var2 = (gn2) objK;
                    boolean zF2 = lp2Var.f(qn7Var) | lp2Var.f(gn2Var);
                    Object objK2 = lp2Var.K();
                    if (zF2 || objK2 == obj3) {
                        objK2 = new gq6(qn7Var, gn2Var, (byte) 8);
                        lp2Var.g0(objK2);
                    }
                    g33.a(strJ2, z2, gn2Var2, kx4Var2, z3, (String) null, (gn2) objK2, lp2Var, 3072, 96);
                    if (!z) {
                        lp2Var.W(1010148344);
                        String strJ3 = vj8.j0(y46.sub_routing_general_ignore_routing_import, lp2Var);
                        boolean z4 = qn7Var.e;
                        boolean zF3 = lp2Var.f(gn2Var);
                        Object objK3 = lp2Var.K();
                        if (zF3 || objK3 == obj3) {
                            objK3 = new pr2(gn2Var, (byte) 4);
                            lp2Var.g0(objK3);
                        }
                        g33.a(strJ3, z4, (gn2) objK3, kx4Var2, false, (String) null, (gn2) null, lp2Var, 3072, 240);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(1010543749);
                        lp2Var.p(false);
                    }
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                ((Integer) obj2).getClass();
                pn7.f(qn7Var, gn2Var, kx4Var, (lp2) obj, w79.P(385));
                break;
            default:
                ((Integer) obj2).getClass();
                pn7.e(qn7Var, gn2Var, kx4Var, (lp2) obj, w79.P(385));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ jn7(qn7 qn7Var, gn2 gn2Var, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = qn7Var;
        this.f0 = gn2Var;
        this.Z = kx4Var;
    }
}

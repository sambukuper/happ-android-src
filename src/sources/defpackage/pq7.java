package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class pq7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ sq7 Y;
    public final /* synthetic */ gn2 Z;
    public final /* synthetic */ kx4 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pq7(sq7 sq7Var, gn2 gn2Var, kx4 kx4Var) {
        this.X = (byte) 1;
        this.Y = sq7Var;
        this.Z = gn2Var;
        this.f0 = kx4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        kx4 kx4Var = this.f0;
        dn8 dn8Var = dn8.a;
        gn2 gn2Var = this.Z;
        sq7 sq7Var = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                rq7.c(sq7Var, gn2Var, kx4Var, (lp2) obj, w79.P(385));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    String strJ0 = vj8.j0(y46.dialog_subscription_hide_settings, lp2Var);
                    boolean z = sq7Var.Z;
                    boolean z2 = !sq7Var.f0;
                    String strJ1 = vj8.j0(y46.dialog_subscription_warning_hide_settings, lp2Var);
                    boolean zF = lp2Var.f(gn2Var);
                    Object objK = lp2Var.K();
                    Object obj3 = zz0.a;
                    if (zF || objK == obj3) {
                        objK = new pr2(gn2Var, (byte) 5);
                        lp2Var.g0(objK);
                    }
                    kx4 kx4Var2 = this.f0;
                    g33.a(strJ0, z, (gn2) objK, kx4Var2, z2, strJ1, (gn2) null, lp2Var, 3072, 160);
                    String strJ2 = vj8.j0(y46.dialog_subscription_encrypted, lp2Var);
                    boolean z3 = sq7Var.g0;
                    Object objK2 = lp2Var.K();
                    if (objK2 == obj3) {
                        objK2 = new zx6((byte) 10);
                        lp2Var.g0(objK2);
                    }
                    g33.a(strJ2, z3, (gn2) objK2, kx4Var2, false, (String) null, (gn2) null, lp2Var, 28032, 224);
                    String strJ3 = vj8.j0(y46.dialog_subscription_edit_allow_insecure, lp2Var);
                    boolean z4 = sq7Var.h0;
                    boolean zF2 = lp2Var.f(gn2Var);
                    Object objK3 = lp2Var.K();
                    if (zF2 || objK3 == obj3) {
                        objK3 = new pr2(gn2Var, (byte) 6);
                        lp2Var.g0(objK3);
                    }
                    g33.a(strJ3, z4, (gn2) objK3, kx4Var2, false, (String) null, (gn2) null, lp2Var, 3072, 240);
                    String strJ4 = vj8.j0(y46.title_pref_send_hwid_in_cookie, lp2Var);
                    boolean z5 = sq7Var.i0;
                    boolean z6 = !sq7Var.j0;
                    boolean zF3 = lp2Var.f(gn2Var);
                    Object objK4 = lp2Var.K();
                    if (zF3 || objK4 == obj3) {
                        objK4 = new pr2(gn2Var, (byte) 7);
                        lp2Var.g0(objK4);
                    }
                    g33.a(strJ4, z5, (gn2) objK4, kx4Var2, z6, (String) null, (gn2) null, lp2Var, 3072, 224);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rq7.d(sq7Var, gn2Var, kx4Var, (lp2) obj, w79.P(385));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ pq7(sq7 sq7Var, gn2 gn2Var, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Y = sq7Var;
        this.Z = gn2Var;
        this.f0 = kx4Var;
    }
}

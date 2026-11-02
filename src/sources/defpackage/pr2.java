package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class pr2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pr2(gn2 gn2Var, byte b) {
        this.X = b;
        this.Y = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                or2 or2Var = (ye8) obj;
                if (or2Var instanceof or2) {
                    return Boolean.valueOf(((Boolean) gn2Var.B(or2Var.q0)).booleanValue());
                }
                bt.i("Node is not a GestureNode instance");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                dd7 dd7Var = (dd7) gn2Var.B((id7) obj);
                synchronized (kd7.c) {
                    kd7.d = kd7.d.f(dd7Var.g());
                }
                return dd7Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                Long l = (Long) obj;
                l.getClass();
                gn2Var.B(l);
                return dn8.a;
            case 3:
                gn2Var.B(new wo7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 4:
                gn2Var.B(new xo7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 5:
                gn2Var.B(new cr7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 6:
                gn2Var.B(new br7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 7:
                gn2Var.B(new dr7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 8:
                String str = (String) obj;
                str.getClass();
                gn2Var.B(new er7(str));
                return dn8.a;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                gn2Var.B(new fr7(str2));
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                gn2Var.B(new ju7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 11:
                gn2Var.B(new ku7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 12:
                gn2Var.B(new jt7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                gn2Var.B(new kt7(str3));
                return dn8.a;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                gn2Var.B(new ot7(str4));
                return dn8.a;
            case 15:
                gn2Var.B(new lt7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 16:
                gn2Var.B(new ut7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 17:
                gn2Var.B(new qt7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 18:
                gn2Var.B(new ht7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 19:
                gn2Var.B(new gt7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 20:
                gn2Var.B(new nt7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                gn2Var.B(new rt7((int) ((Float) obj).floatValue()));
                return dn8.a;
            case 22:
                gn2Var.B(new st7(((Boolean) obj).booleanValue()));
                return dn8.a;
            case 23:
                gn2Var.B(new tt7(((Integer) obj).intValue()));
                return dn8.a;
            case 24:
                String str5 = (String) obj;
                str5.getClass();
                gn2Var.B(new vt7(str5));
                return dn8.a;
            case 25:
                Long l2 = (Long) obj;
                l2.getClass();
                return gn2Var.B(l2);
            default:
                cc1 cc1Var = (cc1) obj;
                cc1Var.getClass();
                gn2Var.B(cc1Var);
                return dn8.a;
        }
    }
}

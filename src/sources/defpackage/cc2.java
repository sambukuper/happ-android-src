package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cc2 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xe2 Y;
    public final /* synthetic */ qc2 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cc2(xe2 xe2Var, qc2 qc2Var, byte b) {
        this.X = b;
        this.Y = xe2Var;
        this.Z = qc2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object a(ze2 ze2Var, q51 q51Var) {
        zb2 zb2Var;
        fc2 fc2Var;
        hc2 hc2Var;
        jc2 jc2Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        qc2 qc2Var = this.Z;
        xe2 xe2Var = this.Y;
        c71 c71Var = c71.X;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (q51Var instanceof zb2) {
                    zb2Var = (zb2) q51Var;
                    int i = zb2Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zb2Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        zb2Var = new zb2(this, q51Var);
                    }
                } else {
                    zb2Var = new zb2(this, q51Var);
                }
                Object obj = zb2Var.f0;
                int i2 = zb2Var.g0;
                if (i2 == 0) {
                    w39.n0(obj);
                    bc2 bc2Var = new bc2(ze2Var, qc2Var, (byte) 0);
                    zb2Var.g0 = 1;
                    return xe2Var.a(bc2Var, zb2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i2 == 1) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                if (q51Var instanceof fc2) {
                    fc2Var = (fc2) q51Var;
                    int i3 = fc2Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fc2Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        fc2Var = new fc2(this, q51Var);
                    }
                } else {
                    fc2Var = new fc2(this, q51Var);
                }
                Object obj2 = fc2Var.f0;
                int i4 = fc2Var.g0;
                if (i4 == 0) {
                    w39.n0(obj2);
                    bc2 bc2Var2 = new bc2(ze2Var, qc2Var, b2);
                    fc2Var.g0 = 1;
                    return xe2Var.a(bc2Var2, fc2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i4 == 1) {
                    w39.n0(obj2);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                if (q51Var instanceof hc2) {
                    hc2Var = (hc2) q51Var;
                    int i5 = hc2Var.g0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hc2Var.g0 = i5 - Integer.MIN_VALUE;
                    } else {
                        hc2Var = new hc2(this, q51Var);
                    }
                } else {
                    hc2Var = new hc2(this, q51Var);
                }
                Object obj3 = hc2Var.f0;
                int i6 = hc2Var.g0;
                if (i6 == 0) {
                    w39.n0(obj3);
                    bc2 bc2Var3 = new bc2(ze2Var, qc2Var, (byte) 2);
                    hc2Var.g0 = 1;
                    return xe2Var.a(bc2Var3, hc2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i6 == 1) {
                    w39.n0(obj3);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (q51Var instanceof jc2) {
                    jc2Var = (jc2) q51Var;
                    int i7 = jc2Var.g0;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        jc2Var.g0 = i7 - Integer.MIN_VALUE;
                    } else {
                        jc2Var = new jc2(this, q51Var);
                    }
                } else {
                    jc2Var = new jc2(this, q51Var);
                }
                Object obj4 = jc2Var.f0;
                int i8 = jc2Var.g0;
                if (i8 == 0) {
                    w39.n0(obj4);
                    bc2 bc2Var4 = new bc2(ze2Var, qc2Var, (byte) 3);
                    jc2Var.g0 = 1;
                    return xe2Var.a(bc2Var4, jc2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i8 == 1) {
                    w39.n0(obj4);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

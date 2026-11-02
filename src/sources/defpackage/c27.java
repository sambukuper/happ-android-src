package defpackage;

import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.dto.SendTVGetResponse;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class c27 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ze2 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c27(ze2 ze2Var, byte b) {
        this.X = b;
        this.Y = ze2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object l(Object obj, q51 q51Var) {
        b27 b27Var;
        String data;
        y57 y57Var;
        nk7 nk7Var;
        mp8 mp8Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ze2 ze2Var = this.Y;
        c71 c71Var = c71.X;
        String str = null;
        switch (b) {
            case 0:
                if (q51Var instanceof b27) {
                    b27Var = (b27) q51Var;
                    int i = b27Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b27Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        b27Var = new b27(this, q51Var);
                    }
                } else {
                    b27Var = new b27(this, q51Var);
                }
                Object obj2 = b27Var.f0;
                int i2 = b27Var.g0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w39.n0(obj2);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj2);
                Object obj3 = ((sj6) obj).X;
                if (obj3 instanceof rj6) {
                    obj3 = null;
                }
                SendTVGetResponse sendTVGetResponse = (SendTVGetResponse) obj3;
                if (sendTVGetResponse != null && (data = sendTVGetResponse.getData()) != null && !fm7.o0(data)) {
                    str = data;
                }
                if (str == null) {
                    return dn8Var;
                }
                b27Var.g0 = 1;
                return ze2Var.l(str, b27Var) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                if (q51Var instanceof y57) {
                    y57Var = (y57) q51Var;
                    int i3 = y57Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        y57Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        y57Var = new y57(this, q51Var);
                    }
                } else {
                    y57Var = new y57(this, q51Var);
                }
                Object obj4 = y57Var.f0;
                int i4 = y57Var.g0;
                if (i4 == 0) {
                    w39.n0(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((e67) obj).b);
                    y57Var.g0 = 1;
                    return ze2Var.l(boolValueOf, y57Var) == c71Var ? c71Var : dn8Var;
                }
                if (i4 == 1) {
                    w39.n0(obj4);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                if (q51Var instanceof nk7) {
                    nk7Var = (nk7) q51Var;
                    int i5 = nk7Var.g0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        nk7Var.g0 = i5 - Integer.MIN_VALUE;
                    } else {
                        nk7Var = new nk7(this, q51Var);
                    }
                } else {
                    nk7Var = new nk7(this, q51Var);
                }
                Object obj5 = nk7Var.f0;
                int i6 = nk7Var.g0;
                if (i6 == 0) {
                    w39.n0(obj5);
                    Integer num = new Integer(((pk7) obj).c);
                    nk7Var.g0 = 1;
                    return ze2Var.l(num, nk7Var) == c71Var ? c71Var : dn8Var;
                }
                if (i6 == 1) {
                    w39.n0(obj5);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (q51Var instanceof mp8) {
                    mp8Var = (mp8) q51Var;
                    int i7 = mp8Var.g0;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        mp8Var.g0 = i7 - Integer.MIN_VALUE;
                    } else {
                        mp8Var = new mp8(this, q51Var);
                    }
                } else {
                    mp8Var = new mp8(this, q51Var);
                }
                Object obj6 = mp8Var.f0;
                int i8 = mp8Var.g0;
                if (i8 != 0) {
                    if (i8 == 1) {
                        w39.n0(obj6);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj6);
                DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) obj;
                Long l = new Long(downloadFilesInfo != null ? downloadFilesInfo.c() : 0L);
                mp8Var.g0 = 1;
                return ze2Var.l(l, mp8Var) == c71Var ? c71Var : dn8Var;
        }
    }
}

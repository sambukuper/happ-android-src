package defpackage;

import java.io.PrintWriter;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class za2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MetaParams Y;
    public final /* synthetic */ SubscriptionItem Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ za2(MetaParams metaParams, SubscriptionItem subscriptionItem, byte b) {
        this.X = b;
        this.Y = metaParams;
        this.Z = subscriptionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        SubscriptionItem subscriptionItem = this.Z;
        MetaParams metaParams = this.Y;
        PrintWriter printWriter = (PrintWriter) obj;
        switch (b) {
            case 0:
                printWriter.println(p61.q(printWriter) + " Front info (2): " + metaParams.j1() + " Added: " + (subscriptionItem.b0() ? 1 : 0));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                int i = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Front info (1): " + metaParams.j1() + " Added: " + (subscriptionItem.b0() ? 1 : 0));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                printWriter.println(p61.q(printWriter) + " Front info (4): " + metaParams.j1() + " Added: " + (subscriptionItem.b0() ? 1 : 0));
                break;
            default:
                printWriter.println(p61.q(printWriter) + " Front info (3): " + metaParams.j1() + " Added: " + (subscriptionItem.b0() ? 1 : 0));
                break;
        }
        return dn8Var;
    }
}

package defpackage;

import java.io.PrintWriter;
import java.util.Date;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class uq0 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SubscriptionItem Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ uq0(SubscriptionItem subscriptionItem, byte b) {
        this.X = b;
        this.Y = subscriptionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        SubscriptionItem subscriptionItem = this.Y;
        PrintWriter printWriter = (PrintWriter) obj;
        switch (b) {
            case 0:
                Date dateQ = p61.q(printWriter);
                MetaParams metaParams = subscriptionItem.getMetaParams();
                printWriter.println(dateQ + " Has reset before extra: " + (metaParams != null ? metaParams.getReset() : null));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                printWriter.getClass();
                printWriter.println("*** Subscription " + subscriptionItem.getRemarks() + ": ***");
                printWriter.println("Failed to start AntiFilter");
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                printWriter.println(p61.q(printWriter) + " UPDATED Sub (1) " + subscriptionItem.getRemarks());
                break;
            case 3:
                int i = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " UPDATED Sub (3) " + subscriptionItem.getRemarks());
                break;
            case 4:
                int i2 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Sub " + subscriptionItem.getRemarks() + " successfully updated (1)");
                break;
            case 5:
                int i3 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Sub " + (subscriptionItem != null ? subscriptionItem.getRemarks() : null) + " servers were removed because of failure");
                break;
            case 6:
                int i4 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Sub " + subscriptionItem.getRemarks() + " successfully updated (2)");
                break;
            case 7:
                int i5 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " Sub " + subscriptionItem.getRemarks() + " successfully added");
                break;
            case 8:
                int i6 = MainActivity.y1;
                printWriter.println(p61.q(printWriter) + " UPDATED Sub (4) " + subscriptionItem.getRemarks());
                break;
            case 9:
                printWriter.println(new Date() + " Sub " + subscriptionItem.getRemarks() + " successfully updated (3)");
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                printWriter.println(p61.q(printWriter) + " UPDATED Sub (2) " + subscriptionItem.getRemarks());
                break;
            case 11:
                printWriter.println(new Date() + " UPDATED Sub (6) " + subscriptionItem.getRemarks());
                break;
            case 12:
                printWriter.println(new Date() + " UPDATED Sub (5) " + subscriptionItem.getRemarks());
                break;
            case 13:
                printWriter.println(p61.q(printWriter) + " UPDATED Sub (1) " + subscriptionItem.getRemarks());
                break;
            case 14:
                printWriter.println(p61.q(printWriter) + " CREATED Sub " + subscriptionItem.getRemarks());
                break;
            case 15:
                printWriter.getClass();
                printWriter.println("check: " + subscriptionItem.getTypeCheck());
                Long extraCheckTimestampMs = subscriptionItem.getExtraCheckTimestampMs();
                printWriter.println("lastcheck: " + (extraCheckTimestampMs != null ? ue3.i0(7, extraCheckTimestampMs.longValue()) : null));
                printWriter.println("import: " + subscriptionItem.getImport());
                MetaParams metaParams2 = subscriptionItem.getMetaParams();
                printWriter.println("fallbackURL: " + ((metaParams2 != null ? metaParams2.getFallbackUrl() : null) != null));
                break;
            case 16:
                printWriter.getClass();
                printWriter.println("*** Subscription " + subscriptionItem.getRemarks() + ": ***");
                printWriter.println("Failed to start AntiFilter");
                break;
            case 17:
                printWriter.println(p61.q(printWriter) + " SubscriptionUpdater: " + subscriptionItem.getRemarks() + " update interval was not reached");
                break;
            default:
                printWriter.println(p61.q(printWriter) + " SubscriptionUpdater: automatic update: " + subscriptionItem.getRemarks());
                break;
        }
        return dn8Var;
    }
}

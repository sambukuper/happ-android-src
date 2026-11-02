package defpackage;

import java.util.List;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditSearchActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class yp6 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ RoutingSettingsEditSearchActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ yp6(RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity, byte b) {
        this.X = b;
        this.Y = routingSettingsEditSearchActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity = this.Y;
        switch (b) {
            case 0:
                List list = (List) obj;
                int i = RoutingSettingsEditSearchActivity.U0;
                list.getClass();
                lr2 lr2Var = (lr2) routingSettingsEditSearchActivity.T0.getValue();
                lr2Var.getClass();
                lr2Var.f.b(list);
                break;
            default:
                int i2 = RoutingSettingsEditSearchActivity.U0;
                List listF = routingSettingsEditSearchActivity.A().f();
                if (listF != null) {
                    lr2 lr2Var2 = (lr2) routingSettingsEditSearchActivity.T0.getValue();
                    lr2Var2.getClass();
                    lr2Var2.f.b(listF);
                }
                break;
        }
        return dn8Var;
    }
}

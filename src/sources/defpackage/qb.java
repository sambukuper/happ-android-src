package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.io.PrintWriter;
import java.util.Date;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.enums.RoutingOrder;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;

    public /* synthetic */ qb(j74 j74Var, int i) {
        this.X = (byte) 6;
        this.Y = i;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Y;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.J1;
                return Boolean.valueOf(((ai2) obj).g1(i));
            case 1:
                Class cls2 = AndroidComposeView.J1;
                return Boolean.valueOf(((ai2) obj).g1(i));
            case 2:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            case 3:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.getClass();
                if (i > 0) {
                    printWriter.println(new Date() + " control type:clear-stories count:" + i);
                } else {
                    printWriter.println(new Date() + " control type:clear-stories clear nothing");
                }
                return dn8Var;
            case 4:
                return Boolean.valueOf(((ai2) obj).g1(i));
            case 5:
                return Boolean.valueOf(((ai2) obj).g1(i));
            case 6:
                n64 n64Var = (n64) obj;
                dd7 dd7VarD = yn0.D();
                yn0.c0(dd7VarD, yn0.P(dd7VarD), dd7VarD != null ? dd7VarD.e() : null);
                n64Var.getClass();
                return dn8Var;
            case 7:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                int i2 = RoutingSettingsActivity.T0;
                routeSettingsCache.getClass();
                RouteSettings routeSettings = routeSettingsCache.getRouteSettings();
                RoutingOrder routingOrder = (RoutingOrder) wv0.u0(i, RoutingOrder.a());
                if (routingOrder == null) {
                    RouteSettings.INSTANCE.getClass();
                    routingOrder = RouteSettings.DEFAULT_ROUTE_ORDER;
                }
                return RouteSettingsCache.a(routeSettingsCache, null, RouteSettings.e(routeSettings, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, routingOrder, 4194303), null, null, false, 29);
            default:
                qs7 qs7Var = (qs7) obj;
                qs7Var.getClass();
                return qs7.a(qs7Var, null, false, false, null, false, false, null, this.Y, null, null, 895);
        }
    }

    public /* synthetic */ qb(byte b, int i) {
        this.X = b;
        this.Y = i;
    }
}

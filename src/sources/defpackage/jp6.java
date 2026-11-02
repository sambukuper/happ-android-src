package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.enums.EDnsType;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class jp6 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ EDnsType Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jp6(EDnsType eDnsType, byte b) {
        this.X = b;
        this.Y = eDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        switch (this.X) {
            case 0:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                int i = RoutingRulesActivity.X0;
                routeSettingsCache.getClass();
                return RouteSettingsCache.a(routeSettingsCache, null, RouteSettings.e(routeSettingsCache.getRouteSettings(), false, null, null, null, this.Y, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388591), null, null, false, 29);
            default:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                int i2 = RoutingRulesActivity.X0;
                routeSettingsCache2.getClass();
                return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettingsCache2.getRouteSettings(), false, null, null, this.Y, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388599), null, null, false, 29);
        }
    }
}

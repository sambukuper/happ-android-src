package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zm6 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ RouteSettings Y;

    public /* synthetic */ zm6(RouteSettings routeSettings, byte b) {
        this.X = b;
        this.Y = routeSettings;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        switch (this.X) {
            case 0:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                routeSettingsCache.getClass();
                return RouteSettingsCache.a(routeSettingsCache, null, this.Y, null, null, false, 29);
            default:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                routeSettingsCache2.getClass();
                RouteSettings routeSettings = this.Y;
                if (routeSettings == null) {
                    routeSettings = routeSettingsCache2.getRouteSettings();
                }
                return RouteSettingsCache.a(routeSettingsCache2, null, null, null, routeSettings, false, 23);
        }
    }
}

package su.happ.proxyutility.domain.routing.entity;

import kotlin.Metadata;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;", "", "", "name", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lsu/happ/proxyutility/dto/RouteSettings;", "routeSettings", "Lsu/happ/proxyutility/dto/RouteSettings;", "f", "()Lsu/happ/proxyutility/dto/RouteSettings;", "defaultValue", "d", "updateValue", "g", "", "isSelected", "Z", "h", "()Z", "", "dateLastUpdateSite", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "dateLastUpdateIp", "b", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class RouteSettingsCache {
    public static final int $stable = RouteSettings.$stable;
    private final Long dateLastUpdateIp;
    private final Long dateLastUpdateSite;
    private final RouteSettings defaultValue;
    private final boolean isSelected;
    private final String name;
    private final RouteSettings routeSettings;
    private final RouteSettings updateValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RouteSettingsCache(String str, RouteSettings routeSettings, RouteSettings routeSettings2, RouteSettings routeSettings3, boolean z) {
        Long dateLastUpdateIp;
        Long dateLastUpdateSite;
        str.getClass();
        this.name = str;
        this.routeSettings = routeSettings;
        this.defaultValue = routeSettings2;
        this.updateValue = routeSettings3;
        this.isSelected = z;
        this.dateLastUpdateSite = (routeSettings3 == null || (dateLastUpdateSite = routeSettings3.getDateLastUpdateSite()) == null) ? routeSettings.getDateLastUpdateSite() : dateLastUpdateSite;
        this.dateLastUpdateIp = (routeSettings3 == null || (dateLastUpdateIp = routeSettings3.getDateLastUpdateIp()) == null) ? routeSettings.getDateLastUpdateIp() : dateLastUpdateIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RouteSettingsCache a(RouteSettingsCache routeSettingsCache, String str, RouteSettings routeSettings, RouteSettings routeSettings2, RouteSettings routeSettings3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = routeSettingsCache.name;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            routeSettings = routeSettingsCache.routeSettings;
        }
        RouteSettings routeSettings4 = routeSettings;
        if ((i & 4) != 0) {
            routeSettings2 = routeSettingsCache.defaultValue;
        }
        RouteSettings routeSettings5 = routeSettings2;
        if ((i & 8) != 0) {
            routeSettings3 = routeSettingsCache.updateValue;
        }
        RouteSettings routeSettings6 = routeSettings3;
        if ((i & 16) != 0) {
            z = routeSettingsCache.isSelected;
        }
        routeSettingsCache.getClass();
        str2.getClass();
        routeSettings4.getClass();
        return new RouteSettingsCache(str2, routeSettings4, routeSettings5, routeSettings6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDateLastUpdateIp() {
        return this.dateLastUpdateIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getDateLastUpdateSite() {
        return this.dateLastUpdateSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final RouteSettings getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSettingsCache)) {
            return false;
        }
        RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
        return dh3.f(this.name, routeSettingsCache.name) && dh3.f(this.routeSettings, routeSettingsCache.routeSettings) && dh3.f(this.defaultValue, routeSettingsCache.defaultValue) && dh3.f(this.updateValue, routeSettingsCache.updateValue) && this.isSelected == routeSettingsCache.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final RouteSettings getRouteSettings() {
        return this.routeSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g, reason: from getter */
    public final RouteSettings getUpdateValue() {
        return this.updateValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.routeSettings.hashCode() + (this.name.hashCode() * 31)) * 31;
        RouteSettings routeSettings = this.defaultValue;
        int iHashCode2 = (iHashCode + (routeSettings == null ? 0 : routeSettings.hashCode())) * 31;
        RouteSettings routeSettings2 = this.updateValue;
        return Boolean.hashCode(this.isSelected) + ((iHashCode2 + (routeSettings2 != null ? routeSettings2.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.name;
        RouteSettings routeSettings = this.routeSettings;
        RouteSettings routeSettings2 = this.defaultValue;
        RouteSettings routeSettings3 = this.updateValue;
        boolean z = this.isSelected;
        StringBuilder sb = new StringBuilder("RouteSettingsCache(name=");
        sb.append(str);
        sb.append(", routeSettings=");
        sb.append(routeSettings);
        sb.append(", defaultValue=");
        sb.append(routeSettings2);
        sb.append(", updateValue=");
        sb.append(routeSettings3);
        sb.append(", isSelected=");
        return p61.o(sb, z, ")");
    }
}

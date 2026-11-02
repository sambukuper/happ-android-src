package defpackage;

import android.os.Bundle;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.GeoFileSearchCache;
import su.happ.proxyutility.dto.LanguageData;
import su.happ.proxyutility.dto.PingTypeData;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class h52 extends nr4 {
    public final /* synthetic */ byte M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h52(byte b) {
        super((byte) 13);
        this.M = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(Object obj, Object obj2) {
        switch (this.M) {
            case 0:
                return ((ExcludeSettingsCache) obj).equals((ExcludeSettingsCache) obj2);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((GeoFileSearchCache) obj).equals((GeoFileSearchCache) obj2);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((LanguageData) obj).equals((LanguageData) obj2);
            case 3:
                return ((AppInfo) obj).equals((AppInfo) obj2);
            default:
                return ((PingTypeData) obj).equals((PingTypeData) obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Object obj, Object obj2) {
        switch (this.M) {
            case 0:
                return dh3.f(((ExcludeSettingsCache) obj).getValue(), ((ExcludeSettingsCache) obj2).getValue());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return dh3.f(((GeoFileSearchCache) obj).getValue(), ((GeoFileSearchCache) obj2).getValue());
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((LanguageData) obj).getSelected() == ((LanguageData) obj2).getSelected();
            case 3:
                return dh3.f(((AppInfo) obj).getPackageName(), ((AppInfo) obj2).getPackageName());
            default:
                return ((PingTypeData) obj).getSelected() == ((PingTypeData) obj2).getSelected();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object y(Object obj, Object obj2) {
        switch (this.M) {
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                Bundle bundle = new Bundle();
                if (((GeoFileSearchCache) obj).getIsSelected() != ((GeoFileSearchCache) obj2).getIsSelected()) {
                    bundle.putBoolean("update", true);
                }
                if (bundle.isEmpty()) {
                    return null;
                }
                return bundle;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                Bundle bundle2 = new Bundle();
                if (((LanguageData) obj).getSelected() != ((LanguageData) obj2).getSelected()) {
                    bundle2.putBoolean("update", true);
                }
                if (bundle2.isEmpty()) {
                    return null;
                }
                return bundle2;
            case 3:
                Bundle bundle3 = new Bundle();
                if (((AppInfo) obj).getIsSelected() != ((AppInfo) obj2).getIsSelected()) {
                    bundle3.putBoolean("select", true);
                }
                if (bundle3.isEmpty()) {
                    return null;
                }
                return bundle3;
            case 4:
                Bundle bundle4 = new Bundle();
                if (((PingTypeData) obj).getSelected() != ((PingTypeData) obj2).getSelected()) {
                    bundle4.putBoolean("update", true);
                }
                if (bundle4.isEmpty()) {
                    return null;
                }
                return bundle4;
            default:
                return super.y(obj, obj2);
        }
    }
}

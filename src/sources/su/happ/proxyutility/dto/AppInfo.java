package su.happ.proxyutility.dto;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsu/happ/proxyutility/dto/AppInfo;", "", "", "appName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "packageName", "d", "Landroid/graphics/drawable/Drawable;", "appIcon", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "", "isSystemApp", "Z", "f", "()Z", "", "isSelected", "I", "e", "()I", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class AppInfo {
    public static final int $stable = 8;
    private final Drawable appIcon;
    private final String appName;
    private final int isSelected;
    private final boolean isSystemApp;
    private final String packageName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppInfo(String str, String str2, Drawable drawable, boolean z, int i) {
        str.getClass();
        this.appName = str;
        this.packageName = str2;
        this.appIcon = drawable;
        this.isSystemApp = z;
        this.isSelected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AppInfo a(AppInfo appInfo, int i) {
        String str = appInfo.appName;
        String str2 = appInfo.packageName;
        Drawable drawable = appInfo.appIcon;
        boolean z = appInfo.isSystemApp;
        appInfo.getClass();
        str.getClass();
        str2.getClass();
        drawable.getClass();
        return new AppInfo(str, str2, drawable, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIsSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return dh3.f(this.appName, appInfo.appName) && dh3.f(this.packageName, appInfo.packageName) && dh3.f(this.appIcon, appInfo.appIcon) && this.isSystemApp == appInfo.isSystemApp && this.isSelected == appInfo.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSystemApp() {
        return this.isSystemApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.isSelected) + pc6.f((this.appIcon.hashCode() + pc6.e(this.appName.hashCode() * 31, 31, this.packageName)) * 31, 31, this.isSystemApp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.appName;
        String str2 = this.packageName;
        Drawable drawable = this.appIcon;
        boolean z = this.isSystemApp;
        int i = this.isSelected;
        StringBuilder sbT = oi0.t("AppInfo(appName=", str, ", packageName=", str2, ", appIcon=");
        sbT.append(drawable);
        sbT.append(", isSystemApp=");
        sbT.append(z);
        sbT.append(", isSelected=");
        return oi0.n(sbT, i, ")");
    }
}

package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.LogFileInfo;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class m40 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m40(sz2 sz2Var, String str) {
        this.X = (byte) 9;
        this.Y = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) throws Exception {
        byte b = this.X;
        Object objValueOf = null;
        boolean z = true;
        boolean z2 = false;
        dn8 dn8Var = dn8.a;
        String str = this.Y;
        switch (b) {
            case 0:
                f17 f17Var = (f17) obj;
                nw3[] nw3VarArr = d17.a;
                e17 e17Var = c17.k;
                nw3[] nw3VarArr2 = d17.a;
                nw3 nw3Var = nw3VarArr2[3];
                uc4 uc4Var = new uc4();
                e17Var.getClass();
                f17Var.a(e17Var, uc4Var);
                e17 e17Var2 = c17.d;
                nw3 nw3Var2 = nw3VarArr2[2];
                e17Var2.getClass();
                f17Var.a(e17Var2, str);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                nw3[] nw3VarArr3 = d17.a;
                e17 e17Var3 = c17.d;
                nw3 nw3Var3 = d17.a[2];
                e17Var3.getClass();
                ((f17) obj).a(e17Var3, str);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                xr6 xr6VarX0 = qr6Var.X0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    xr6VarX0.T(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (xr6VarX0.S0()) {
                        arrayList.add(xr6VarX0.p0(0));
                    }
                    xr6VarX0.close();
                    return arrayList;
                } catch (Throwable th) {
                    xr6VarX0.close();
                    throw th;
                }
            case 3:
                qr6 qr6Var2 = (qr6) obj;
                qr6Var2.getClass();
                xr6 xr6VarX1 = qr6Var2.X0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    xr6VarX1.T(1, str);
                    if (xr6VarX1.S0()) {
                        z2 = ((int) xr6VarX1.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z2);
                } finally {
                    xr6VarX1.close();
                }
            case 4:
                qr6 qr6Var3 = (qr6) obj;
                qr6Var3.getClass();
                xr6 xr6VarX2 = qr6Var3.X0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    xr6VarX2.T(1, str);
                    if (xr6VarX2.S0()) {
                        z2 = ((int) xr6VarX2.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z2);
                } finally {
                    xr6VarX2.close();
                }
            case 5:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.getClass();
                printWriter.println(str);
                return dn8Var;
            case 6:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                String providerId = ((SubscriptionItem) qg5Var.Y).getProviderId();
                return Boolean.valueOf(dh3.f(providerId != null ? providerId : null, str));
            case 7:
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.println(p61.q(printWriter2) + " control type:import-data data:" + str.length());
                return dn8Var;
            case 8:
                qg5 qg5Var2 = (qg5) obj;
                String str2 = (String) qg5Var2.X;
                ld6 ld6Var = (ld6) qg5Var2.Y;
                if (!dh3.f(ld6Var.X, str)) {
                    return str2;
                }
                um3 um3Var = vm3.d;
                String str3 = ld6Var.X;
                da1 da1Var = ld6Var.Y;
                long j = ld6Var.Z;
                String str4 = ld6Var.f0;
                kd6 kd6Var = ld6Var.g0;
                str3.getClass();
                da1Var.getClass();
                kd6Var.getClass();
                ld6 ld6Var2 = new ld6(str3, da1Var, j, str4, kd6Var, true);
                g55 g55Var = ((vm3) um3Var).b;
                return um3Var.b(ld6.Companion.serializer(), ld6Var2);
            case 9:
                o05 o05Var = (o05) obj;
                o05Var.e(sz2.d, str);
                sz2.d(o05Var, str);
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                f17 f17Var2 = (f17) obj;
                d17.b(f17Var2, str);
                d17.d(f17Var2, 5);
                return dn8Var;
            case 11:
                LogFileInfo logFileInfo = (LogFileInfo) obj;
                logFileInfo.getClass();
                return Boolean.valueOf(dh3.f(logFileInfo.getPath(), str));
            case 12:
                qg5 qg5Var3 = (qg5) obj;
                qg5Var3.getClass();
                return Boolean.valueOf(dh3.f(((ServerConfig) qg5Var3.Y).getSubscriptionId(), str));
            case 13:
                PrintWriter printWriter3 = (PrintWriter) obj;
                printWriter3.println(p61.q(printWriter3) + " Warning: Invalid providerId was skipped: " + str);
                return dn8Var;
            case 14:
                PrintWriter printWriter4 = (PrintWriter) obj;
                printWriter4.println(p61.q(printWriter4) + " Invalid ProviderId: " + str);
                return dn8Var;
            case 15:
                f17 f17Var3 = (f17) obj;
                nw3[] nw3VarArr4 = d17.a;
                e17 e17Var4 = c17.d;
                nw3[] nw3VarArr5 = d17.a;
                nw3 nw3Var4 = nw3VarArr5[2];
                e17Var4.getClass();
                f17Var3.a(e17Var4, str);
                e17 e17Var5 = c17.u;
                nw3 nw3Var5 = nw3VarArr5[11];
                Float fValueOf = Float.valueOf(0.0f);
                e17Var5.getClass();
                f17Var3.a(e17Var5, fValueOf);
                return dn8Var;
            case 16:
                AppInfo appInfo = (AppInfo) obj;
                if (str.length() != 0) {
                    String appName = appInfo.getAppName();
                    Locale locale = Locale.ROOT;
                    String lowerCase = appName.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!fm7.d0(lowerCase, str, false)) {
                        String lowerCase2 = appInfo.getPackageName().toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!fm7.d0(lowerCase2, str, false)) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                qr6 qr6Var4 = (qr6) obj;
                qr6Var4.getClass();
                xr6 xr6VarX3 = qr6Var4.X0("SELECT long_value FROM Preference where `key`=?");
                try {
                    xr6VarX3.T(1, str);
                    if (xr6VarX3.S0() && !xr6VarX3.isNull(0)) {
                        objValueOf = Long.valueOf(xr6VarX3.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    xr6VarX3.close();
                }
            case 18:
                return Boolean.valueOf(!dh3.f(((SubId) ((Map.Entry) obj).getKey()).d(), str));
            case 19:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                routeSettingsCache.getClass();
                return RouteSettingsCache.a(routeSettingsCache, this.Y, null, null, null, false, 30);
            case 20:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                int i = RoutingRulesActivity.X0;
                routeSettingsCache2.getClass();
                return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettingsCache2.getRouteSettings(), false, null, this.Y, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388603), null, null, false, 29);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                RouteSettingsCache routeSettingsCache3 = (RouteSettingsCache) obj;
                int i2 = RoutingRulesActivity.X0;
                routeSettingsCache3.getClass();
                RouteSettings routeSettings = routeSettingsCache3.getRouteSettings();
                String str5 = this.Y;
                str5.getClass();
                return RouteSettingsCache.a(routeSettingsCache3, null, RouteSettings.e(routeSettings, false, null, null, null, null, null, null, null, null, str5, null, null, null, null, null, null, false, null, null, null, null, 8388095), null, null, false, 29);
            case 22:
                RouteSettingsCache routeSettingsCache4 = (RouteSettingsCache) obj;
                int i3 = RoutingRulesActivity.X0;
                routeSettingsCache4.getClass();
                return RouteSettingsCache.a(routeSettingsCache4, null, RouteSettings.e(routeSettingsCache4.getRouteSettings(), false, null, null, null, null, null, this.Y, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388543), null, null, false, 29);
            case 23:
                RouteSettingsCache routeSettingsCache5 = (RouteSettingsCache) obj;
                int i4 = RoutingRulesActivity.X0;
                routeSettingsCache5.getClass();
                return RouteSettingsCache.a(routeSettingsCache5, null, RouteSettings.e(routeSettingsCache5.getRouteSettings(), false, this.Y, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388605), null, null, false, 29);
            case 24:
                RouteSettingsCache routeSettingsCache6 = (RouteSettingsCache) obj;
                int i5 = RoutingRulesActivity.X0;
                routeSettingsCache6.getClass();
                return RouteSettingsCache.a(routeSettingsCache6, null, RouteSettings.e(routeSettingsCache6.getRouteSettings(), false, null, null, null, null, this.Y, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388575), null, null, false, 29);
            case 25:
                RouteSettingsCache routeSettingsCache7 = (RouteSettingsCache) obj;
                int i6 = RoutingRulesActivity.X0;
                routeSettingsCache7.getClass();
                return RouteSettingsCache.a(routeSettingsCache7, null, RouteSettings.e(routeSettingsCache7.getRouteSettings(), false, null, null, null, null, null, null, null, this.Y, null, null, null, null, null, null, null, false, null, null, null, null, 8388351), null, null, false, 29);
            case 26:
                RouteSettingsCache routeSettingsCache8 = (RouteSettingsCache) obj;
                int i7 = RoutingRulesActivity.X0;
                routeSettingsCache8.getClass();
                return RouteSettingsCache.a(routeSettingsCache8, null, RouteSettings.e(routeSettingsCache8.getRouteSettings(), false, null, null, null, null, null, null, this.Y, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388479), null, null, false, 29);
            case 27:
                d17.b((f17) obj, str);
                return dn8Var;
            case 28:
                qs7 qs7Var = (qs7) obj;
                qs7Var.getClass();
                return qs7.a(qs7Var, (is7) null, false, false, (fs7) null, false, false, (ms7) null, 0, ps7.a(qs7Var.i, str, false, 2), (SubscriptionSortType) null, 767);
            default:
                String str6 = (String) obj;
                str6.getClass();
                if (fm7.o0(str6)) {
                    return str6.length() < str.length() ? str : str6;
                }
                return str.concat(str6);
        }
    }

    public /* synthetic */ m40(String str, byte b) {
        this.X = b;
        this.Y = str;
    }
}

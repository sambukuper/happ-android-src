package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.ui.widget.QROverlayView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw5 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ zw5(ql6 ql6Var) {
        this.X = (byte) 10;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        qe7 qe7Var = null;
        qe7Var = null;
        switch (b) {
            case 0:
                qw5 qw5Var = qw5.d;
                nw3[] nw3VarArr = d17.a;
                e17 e17Var = c17.c;
                nw3 nw3Var = d17.a[1];
                e17Var.getClass();
                ((f17) obj).a(e17Var, qw5Var);
                return dn8Var;
            case 1:
                PackageInfo packageInfo = (PackageInfo) obj;
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    return new qg5(packageInfo, applicationInfo);
                }
                return null;
            case 2:
                bo3 bo3Var = (bo3) obj;
                bo3Var.getClass();
                return Boolean.valueOf(bo3Var instanceof bq3);
            case 3:
                return ((bo3) obj).c();
            case 4:
                bo3 bo3Var2 = (bo3) obj;
                bo3Var2.getClass();
                return Boolean.valueOf(bo3Var2 instanceof bq3);
            case 5:
                return ((bo3) obj).c();
            case 6:
                ((List) obj).getClass();
                return dn8Var;
            case 7:
                ((Boolean) obj).getClass();
                int i = QROverlayView.s0;
                return dn8Var;
            case 8:
                k79 k79Var = (k79) obj;
                k79Var.getClass();
                oi5 oi5Var = of6.f0;
                return Boolean.valueOf(x97.N(k79Var.a));
            case 9:
                ((dn8) obj).getClass();
                return Boolean.TRUE;
            case 10:
                ((lb1) obj).getClass();
                throw new g65(0);
            case 11:
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                int i2 = RoutingRulesActivity.X0;
                routeSettingsCache.getClass();
                return RouteSettingsCache.a(routeSettingsCache, null, RouteSettings.e(routeSettingsCache.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 7864319), null, null, false, 29);
            case 13:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                int i3 = RoutingRulesActivity.X0;
                routeSettingsCache2.getClass();
                return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettingsCache2.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 7340031), null, null, false, 29);
            case 14:
                RouteSettingsCache routeSettingsCache3 = (RouteSettingsCache) obj;
                int i4 = RoutingRulesActivity.X0;
                routeSettingsCache3.getClass();
                RouteSettings routeSettings = routeSettingsCache3.getRouteSettings();
                RouteSettings defaultValue = routeSettingsCache3.getDefaultValue();
                if (defaultValue != null) {
                    return RouteSettingsCache.a(routeSettingsCache3, null, RouteSettings.e(routeSettings, false, null, null, null, null, null, null, null, defaultValue.getGeoSiteUrl(), null, null, null, null, null, null, null, false, null, null, null, null, 8388351), null, null, false, 29);
                }
                bt.q("Required value was null.");
                return null;
            case 15:
                RouteSettingsCache routeSettingsCache4 = (RouteSettingsCache) obj;
                int i5 = RoutingRulesActivity.X0;
                routeSettingsCache4.getClass();
                return RouteSettingsCache.a(routeSettingsCache4, null, RouteSettings.e(routeSettingsCache4.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 7864319), null, null, false, 29);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                RouteSettingsCache routeSettingsCache5 = (RouteSettingsCache) obj;
                int i6 = RoutingRulesActivity.X0;
                routeSettingsCache5.getClass();
                RouteSettings routeSettings2 = routeSettingsCache5.getRouteSettings();
                RouteSettings defaultValue2 = routeSettingsCache5.getDefaultValue();
                if (defaultValue2 != null) {
                    return RouteSettingsCache.a(routeSettingsCache5, null, RouteSettings.e(routeSettings2, false, null, null, null, null, null, null, defaultValue2.getGeoIpUrl(), null, null, null, null, null, null, null, null, false, null, null, null, null, 8388479), null, null, false, 29);
                }
                bt.q("Required value was null.");
                return null;
            case 17:
                RouteSettingsCache routeSettingsCache6 = (RouteSettingsCache) obj;
                int i7 = RoutingRulesActivity.X0;
                routeSettingsCache6.getClass();
                return RouteSettingsCache.a(routeSettingsCache6, null, RouteSettings.e(routeSettingsCache6.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 7340031), null, null, false, 29);
            case 18:
                ((List) obj).getClass();
                return dn8Var;
            case 19:
                String value = ((SubId) ((qg5) obj).X).getValue();
                kw4 kw4Var = kw4.a;
                return Boolean.valueOf(!kw4.o(value));
            case 20:
                return new jv6((Map) obj);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return obj;
            case 22:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                gn2 gn2Var = (gn2) gw6.h.Z;
                Boolean bool = Boolean.FALSE;
                qe7 qe7Var2 = (dh3.f(obj2, bool) || obj2 == null) ? null : (qe7) gn2Var.B(obj2);
                Object obj3 = list.get(1);
                qe7 qe7Var3 = (dh3.f(obj3, bool) || obj3 == null) ? null : (qe7) gn2Var.B(obj3);
                Object obj4 = list.get(2);
                qe7 qe7Var4 = (dh3.f(obj4, bool) || obj4 == null) ? null : (qe7) gn2Var.B(obj4);
                Object obj5 = list.get(3);
                if (!dh3.f(obj5, bool) && obj5 != null) {
                    qe7Var = (qe7) gn2Var.B(obj5);
                }
                return new c88(qe7Var2, qe7Var3, qe7Var4, qe7Var);
            case 23:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (dh3.f(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((gn2) gw6.a.Z).B(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new ql(list3, str);
            case 24:
                obj.getClass();
                return new x38(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list4 = (List) obj;
                return new g78(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 26:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                w88[] w88VarArr = v88.b;
                gn2 gn2Var2 = gw6.v.Y;
                Boolean bool2 = Boolean.FALSE;
                dh3.f(obj8, bool2);
                v88 v88Var = obj8 != null ? (v88) gn2Var2.B(obj8) : null;
                v88Var.getClass();
                long j = v88Var.a;
                Object obj9 = list5.get(1);
                dh3.f(obj9, bool2);
                v88 v88Var2 = obj9 != null ? (v88) gn2Var2.B(obj9) : null;
                v88Var2.getClass();
                return new i78(j, v88Var2.a);
            case 27:
                obj.getClass();
                return new dj2(((Integer) obj).intValue());
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                obj.getClass();
                return new x20(((Float) obj).floatValue());
            default:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new f88(ct7.c(iIntValue, num2.intValue()));
        }
    }

    public /* synthetic */ zw5(byte b) {
        this.X = b;
    }
}

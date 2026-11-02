package defpackage;

import java.io.PrintWriter;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class as implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;

    public /* synthetic */ as(byte b, boolean z) {
        this.X = b;
        this.Y = z;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z = this.Y;
        switch (b) {
            case 0:
                return Boolean.valueOf(z);
            case 1:
                return Boolean.valueOf(z || !((AppInfo) obj).getIsSystemApp());
            case 2:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                int i = RoutingRulesActivity.X0;
                routeSettingsCache.getClass();
                return RouteSettingsCache.a(routeSettingsCache, null, RouteSettings.e(routeSettingsCache.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.Y, null, null, null, null, 8257535), null, null, false, 29);
            case 3:
                RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                int i2 = RoutingSettingsActivity.T0;
                routeSettingsCache2.getClass();
                return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettingsCache2.getRouteSettings(), this.Y, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388606), null, null, false, 29);
            case 4:
                qs7 qs7Var = (qs7) obj;
                qs7Var.getClass();
                return qs7.a(qs7Var, null, false, false, fs7.a(qs7Var.d, z, null, 2), false, false, null, 0, null, null, 1015);
            case 5:
                qs7 qs7Var2 = (qs7) obj;
                qs7Var2.getClass();
                return qs7.a(qs7Var2, null, false, false, null, this.Y, false, null, 0, null, null, 1007);
            case 6:
                qs7 qs7Var3 = (qs7) obj;
                qs7Var3.getClass();
                return qs7.a(qs7Var3, null, false, false, null, false, this.Y, null, 0, null, null, 991);
            case 7:
                qs7 qs7Var4 = (qs7) obj;
                qs7Var4.getClass();
                return qs7.a(qs7Var4, null, false, false, null, false, false, ms7.a(qs7Var4.g, z, false, 2), 0, null, null, 959);
            case 8:
                qs7 qs7Var5 = (qs7) obj;
                qs7Var5.getClass();
                ms7 ms7Var = qs7Var5.g;
                boolean z2 = z || ms7Var.b;
                ms7 ms7VarA = ms7.a(ms7Var, false, z2, 1);
                if (z2) {
                    ms7VarA = ms7.a(ms7VarA, true, false, 2);
                }
                return qs7.a(qs7Var5, null, false, false, null, false, false, ms7VarA, 0, null, null, 959);
            case 9:
                qs7 qs7Var6 = (qs7) obj;
                qs7Var6.getClass();
                ps7 ps7VarA = ps7.a(qs7Var6.i, null, z, 1);
                if (z) {
                    ps7VarA = ps7.a(ps7VarA, _UrlKt.FRAGMENT_ENCODE_SET, false, 2);
                }
                return qs7.a(qs7Var6, null, false, false, null, false, false, null, 0, ps7VarA, null, 767);
            case 10:
                qs7 qs7Var7 = (qs7) obj;
                qs7Var7.getClass();
                return qs7.a(qs7Var7, null, this.Y, false, null, false, false, null, 0, null, null, 1021);
            case 11:
                qs7 qs7Var8 = (qs7) obj;
                qs7Var8.getClass();
                return qs7.a(qs7Var8, null, false, this.Y, null, false, false, null, 0, null, null, 1019);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                boolean z3 = true;
                qs7 qs7Var9 = (qs7) obj;
                qs7Var9.getClass();
                ms7 ms7Var2 = qs7Var9.g;
                if (!z && ms7Var2.b) {
                    z3 = false;
                }
                return qs7.a(qs7Var9, null, false, false, null, false, false, ms7.a(ms7Var2, z3, false, 2), 0, null, null, 959);
            case 13:
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " Should handle extra params: " + z);
                return dn8Var;
            default:
                wr8 wr8Var = (wr8) obj;
                wr8Var.getClass();
                if (z) {
                    z68.t(wr8Var, ':');
                }
                wr8.r(wr8Var);
                return dn8Var;
        }
    }
}

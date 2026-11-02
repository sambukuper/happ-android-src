package defpackage;

import com.tencent.mmkv.MMKV;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zs1 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ zs1(Object obj, boolean z, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = z;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        RouteSettings routeSettingsE = null;
        routeSettingsE = null;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Z;
        boolean z = this.Y;
        switch (b) {
            case 0:
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                routeSettingsCache.getClass();
                int iOrdinal = ((mr2) obj2).ordinal();
                if (iOrdinal == 0) {
                    RouteSettings updateValue = routeSettingsCache.getUpdateValue();
                    if (updateValue != null) {
                        routeSettingsE = RouteSettings.e(updateValue, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, z ? Long.valueOf(new Date().getTime()) : null, null, null, 7864319);
                    }
                } else {
                    if (iOrdinal != 1) {
                        b61.c();
                        return null;
                    }
                    RouteSettings updateValue2 = routeSettingsCache.getUpdateValue();
                    if (updateValue2 != null) {
                        routeSettingsE = RouteSettings.e(updateValue2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, z ? Long.valueOf(new Date().getTime()) : null, null, 7340031);
                    }
                }
                return RouteSettingsCache.a(routeSettingsCache, null, null, null, routeSettingsE, false, 23);
            case 1:
                l72 l72Var = (l72) obj2;
                PrintWriter printWriter = (PrintWriter) obj;
                Date dateQ = p61.q(printWriter);
                boolean zF = l72Var.f();
                long jF = ((MMKV) l72Var.a.getValue()).f(-1L, "extra_file_timestamp");
                Long lValueOf = jF != -1 ? Long.valueOf(jF) : null;
                printWriter.println(dateQ + " Hash is found: " + z + "\nIs extra file outdated: " + zF + ":\nDownload ts: " + lValueOf + "\nBuild ts: " + mm7.c0("1792654306601") + "\nNow: " + we3.a.a().a());
                return dn8Var;
            case 2:
                dn2 dn2Var = (dn2) obj2;
                if (z) {
                    dn2Var.invoke();
                }
                return dn8Var;
            case 3:
                ((fi1) obj).getClass();
                float fL = ((la) obj2).f.l();
                Float fValueOf = Float.isNaN(fL) ? null : Float.valueOf(fL);
                int iO = fValueOf != null ? nr4.O(fValueOf.floatValue()) : 0;
                if (z) {
                    iO = -iO;
                }
                return new hf3(((long) iO) << 32);
            case 4:
                MainActivity mainActivity = (MainActivity) obj2;
                ImportResult importResult = (ImportResult) obj;
                int i = MainActivity.y1;
                importResult.getClass();
                return Boolean.valueOf((importResult.getStatus() instanceof r83) || (importResult.getLastParseError() instanceof r83) || (importResult.getLastParseError() instanceof m83) || (importResult.getLastParseError() instanceof p83) || !mainActivity.W(importResult, z, true));
            case 5:
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.println(p61.q(printWriter2) + " send token with providerid:" + ((List) obj2).size() + " success:" + z);
                return dn8Var;
            default:
                g09 g09Var = (g09) obj2;
                wr8 wr8Var = (wr8) obj;
                wr8Var.getClass();
                if (z) {
                    z68.t(wr8Var, ':');
                }
                wr8.q(wr8Var);
                zr8.a(wr8Var, g09Var, new as((byte) 14, z));
                return dn8Var;
        }
    }

    public /* synthetic */ zs1(boolean z, Object obj, byte b) {
        this.X = b;
        this.Y = z;
        this.Z = obj;
    }
}

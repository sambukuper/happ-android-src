package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import libxray.Libxray;
import libxray.XRayPoint;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class db2 extends uy7 implements rn2 {
    public final /* synthetic */ ea6 g0;
    public final /* synthetic */ Map h0;
    public final /* synthetic */ HashMap i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db2(ea6 ea6Var, Map map, HashMap map2, q51 q51Var) {
        super(2, q51Var);
        this.g0 = ea6Var;
        this.h0 = map;
        this.i0 = map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new db2(this.g0, this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    public final Object q(Object obj) {
        boolean z;
        w39.n0(obj);
        XRayPoint xRayPointNewXRayPoint = Libxray.newXRayPoint(new s18((byte) 15), Build.VERSION.SDK_INT >= 25);
        ea6 ea6Var = this.g0;
        ea6Var.X = xRayPointNewXRayPoint;
        vz7 vz7Var = d69.a;
        HappApplication happApplication = HappApplication.M0;
        Context applicationContext = k32.i().getApplicationContext();
        applicationContext.getClass();
        Map map = this.h0;
        String strK = XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(map);
        if (strK == null) {
            strK = "tlshello";
        }
        String strE = XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(map);
        if (strE == null) {
            strE = "50-100";
        }
        String strD = XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(map);
        if (strD == null) {
            strD = "10-20";
        }
        String strG = XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.g(map);
        if (strG == null) {
            strG = "100-200";
        }
        LinkedHashMap linkedHashMapC = XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.c(strG, strD, strE, strK);
        List listK = i21.K(new XRayConfig.OutboundBean.OutSettingsBean.NoisesBean(31, null, null, null));
        HashMap map2 = this.i0;
        if (map2 == null) {
            map2 = new HashMap();
        }
        b69 b69VarH = d69.h(applicationContext, linkedHashMapC, listK, map2);
        if (b69VarH.a) {
            ((XRayPoint) ea6Var.X).coreRunLoop(b69VarH.b);
            z = ((XRayPoint) ea6Var.X).getIsRunning() ? false : true;
        }
        return Boolean.valueOf(z);
    }
}

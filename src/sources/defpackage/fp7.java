package defpackage;

import java.util.ArrayList;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class fp7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ np7 h0;
    public final /* synthetic */ String i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp7(np7 np7Var, String str, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = np7Var;
        this.i0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        String str = this.i0;
        np7 np7Var = this.h0;
        switch (b) {
            case 0:
                return new fp7(np7Var, str, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new fp7(np7Var, str, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new fp7(np7Var, str, q51Var, (byte) 2);
            default:
                return new fp7(np7Var, str, q51Var, (byte) 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        boolean z = true;
        np7 np7Var = this.h0;
        String str = this.i0;
        switch (b) {
            case 0:
                w39.n0(obj);
                kw4 kw4Var = kw4.a;
                gb4 gb4VarR = i21.r();
                String[] strArrA = kw4.m().a();
                if (strArrA == null) {
                    strArrA = new String[0];
                }
                ArrayList arrayList = new ArrayList(strArrA.length);
                for (String str2 : strArrA) {
                    str2.getClass();
                    arrayList.add(new SubId(str2));
                }
                gb4VarR.addAll(arrayList);
                SubId.Companion.getClass();
                gb4VarR.add(new SubId(SubId.c()));
                rd2 rd2Var = new rd2(new sd2(new la2(wv0.l0(i21.j(gb4VarR)), true, new gw4(str, (byte) 3)), new al5(1, this.h0, np7.class, "fetchProfiles", "fetchProfiles-PzuDCJM(Ljava/lang/String;)Lkotlinx/collections/immutable/PersistentList;", 0, (byte) 17), z27.X));
                while (rd2Var.hasNext()) {
                    if (!((um6) rd2Var.next()).b) {
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                return np7Var.e(str);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                w39.n0(obj);
                return np7Var.f().q(str);
            default:
                w39.n0(obj);
                String strP = np7Var.f().p(str, true);
                if (strP != null) {
                    return new RouteProfileId(strP);
                }
                return null;
        }
    }
}

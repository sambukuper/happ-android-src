package defpackage;

import java.util.ListIterator;
import java.util.Set;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class qk5 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Set Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qk5(Set set, byte b) {
        this.X = b;
        this.Y = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        Set set = this.Y;
        switch (b) {
            case 0:
                lk5 lk5Var = (lk5) obj;
                lk5Var.getClass();
                km5 km5VarG0 = mb6.g0(wv0.T0(set, lk5Var.d));
                j2 j2Var = lk5Var.c;
                qm5 qm5VarC = ec7.Y.c();
                ListIterator listIterator = j2Var.listIterator(0);
                while (listIterator.hasNext()) {
                    AppInfo appInfo = (AppInfo) listIterator.next();
                    qm5VarC.add(AppInfo.a(appInfo, 1 - appInfo.getIsSelected()));
                }
                return lk5.a(lk5Var, null, null, qm5VarC.c(), km5VarG0, null, false, 51);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return Boolean.valueOf(set.contains(new SubId(((ConfigGroupCache) obj).getSubId())));
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return Boolean.valueOf(!set.contains(new SubId(((ConfigGroupCache) obj).getSubId())));
            case 3:
                return new la2(w27.l0(new la2(wv0.l0(((ConfigGroupCache) obj).getConfigs()), true, new qk5(set, (byte) 4)), new zx6((byte) 3)), true, i27.X);
            default:
                return Boolean.valueOf(set.contains(new GuId(((ServerCache) obj).getGuid())));
        }
    }
}

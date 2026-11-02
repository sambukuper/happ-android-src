package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pn4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ MainViewModel h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ long j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn4(MainViewModel mainViewModel, String str, long j, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = mainViewModel;
        this.i0 = str;
        this.j0 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n(q51Var, b71Var).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                n(q51Var, b71Var).q(dn8Var);
                break;
            default:
                n(q51Var, b71Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new pn4(this.h0, this.i0, this.j0, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new pn4(this.h0, this.i0, this.j0, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new pn4(this.h0, this.i0, this.j0, q51Var, (byte) 2);
            default:
                return new pn4(this.h0, this.i0, this.j0, q51Var, (byte) 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object value;
        xm4 xm4Var;
        Object value2;
        xm4 xm4Var2;
        Object value3;
        xm4 xm4Var3;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        long j = this.j0;
        String str = this.i0;
        MainViewModel mainViewModel = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                Long l = new Long(j);
                Long l2 = l.longValue() > -1 ? l : null;
                mainViewModel.V(l2 != null ? l2.longValue() : -1L, str);
                oh7 oh7Var = mainViewModel.w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                mainViewModel.V(j, str);
                oh7 oh7Var2 = mainViewModel.w;
                do {
                    value2 = oh7Var2.getValue();
                    xm4Var2 = (xm4) value2;
                } while (!oh7Var2.k(value2, xm4.a(xm4Var2, null, 0L, null, null, false, xm4Var2.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                w39.n0(obj);
                mainViewModel.V(j, str);
                oh7 oh7Var3 = mainViewModel.w;
                do {
                    value3 = oh7Var3.getValue();
                    xm4Var3 = (xm4) value3;
                } while (!oh7Var3.k(value3, xm4.a(xm4Var3, null, 0L, null, null, false, xm4Var3.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                break;
            default:
                w39.n0(obj);
                ArrayList arrayList = mainViewModel.r;
                mainViewModel.o().getClass();
                un5.d(j, str);
                qg5 qg5VarP = mainViewModel.p(str);
                CopyOnWriteArrayList copyOnWriteArrayList = mainViewModel.q;
                int iIntValue = ((Number) qg5VarP.X).intValue();
                int iIntValue2 = ((Number) qg5VarP.Y).intValue();
                if (iIntValue != -1 && iIntValue2 != -1) {
                    ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue)).getConfigs().set(iIntValue2, ServerCache.a((ServerCache) ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue)).getConfigs().get(iIntValue2), null, mainViewModel.o().c(str), false, 11));
                    mainViewModel.s();
                }
                if (arrayList.contains(new GuId(str))) {
                    arrayList.remove(new GuId(str));
                    if (arrayList.isEmpty()) {
                        a23 a23Var = mainViewModel.s;
                        if (a23Var != null) {
                            a23Var.invoke();
                        }
                        mainViewModel.s = null;
                    }
                }
                break;
        }
        return dn8Var;
    }
}

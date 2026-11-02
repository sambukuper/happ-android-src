package su.happ.proxyutility.util.adapters;

import com.google.gson.b;
import defpackage.be2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import su.happ.proxyutility.dto.FlexibleStringList;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/util/adapters/FlexibleStringListAdapter;", "Lcom/google/gson/b;", "Lsu/happ/proxyutility/dto/FlexibleStringList;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class FlexibleStringListAdapter extends b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(rq3 rq3Var) {
        String strR;
        rq3Var.getClass();
        int iC0 = rq3Var.c0();
        int i = iC0 == 0 ? -1 : be2.a[p61.B(iC0)];
        if (i == 1) {
            strR = rq3Var.r();
        } else if (i != 2) {
            strR = null;
            if (i != 3) {
                rq3Var.v();
            } else {
                rq3Var.X();
            }
        } else {
            gb4 gb4VarR = i21.r();
            rq3Var.Q0();
            while (rq3Var.hasNext()) {
                gb4VarR.add(rq3Var.r());
            }
            rq3Var.K0();
            strR = i21.j(gb4VarR);
        }
        return new FlexibleStringList(strR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(hs3 hs3Var, Object obj) {
        FlexibleStringList flexibleStringList = (FlexibleStringList) obj;
        hs3Var.getClass();
        Object value = flexibleStringList != null ? flexibleStringList.getValue() : null;
        if (value instanceof String) {
            hs3Var.c0((String) value);
            return;
        }
        if (!(value instanceof List)) {
            hs3Var.u();
            return;
        }
        hs3Var.Q0();
        Iterator it = ((Iterable) value).iterator();
        while (it.hasNext()) {
            hs3Var.c0(String.valueOf(it.next()));
        }
        hs3Var.K0();
    }
}

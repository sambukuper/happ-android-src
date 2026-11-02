package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class y59 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    public static final gg8 a(XRayConfig.DnsBean dnsBean) {
        String str;
        String rj6Var;
        String str2;
        ArrayList servers = dnsBean.getServers();
        Object objT0 = servers != null ? wv0.t0(servers) : null;
        if (objT0 instanceof String) {
            str = (String) objT0;
        } else if (objT0 instanceof Map) {
            Object obj = ((Map) objT0).get("address");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str == null) {
            return eg8.X;
        }
        String strW = mm7.W(str, "https+local", "https", false);
        ss8 ss8Var = ss8.a;
        if (ss8.y(strW)) {
            str2 = strW;
        } else if (mm7.Z(strW, false, "https://")) {
            try {
                rj6Var = new URL(strW).getHost();
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = null;
            }
            str2 = rj6Var;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return new dg8(strW);
        }
        ss8 ss8Var2 = ss8.a;
        if (ss8.y(str2)) {
            return new fg8(str2);
        }
        Map hosts = dnsBean.getHosts();
        Object obj2 = hosts != null ? hosts.get(str2) : null;
        if (obj2 instanceof String) {
            return new fg8((String) obj2);
        }
        boolean z = obj2 instanceof List;
        gg8 dg8Var = cg8.X;
        if (z) {
            Object objT1 = wv0.t0((List) obj2);
            boolean z2 = objT1 instanceof String;
            if (z2) {
                String str3 = (String) objT1;
                if (ss8.y(str3)) {
                    return new fg8(str3);
                }
            }
            if (z2) {
                dg8Var = new dg8((String) objT1);
            }
        }
        return dg8Var;
    }
}

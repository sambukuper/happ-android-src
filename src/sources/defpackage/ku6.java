package defpackage;

import java.util.HashMap;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ku6 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(13);
        a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        pc6.t(1, map, "bolder", -1, "lighter");
        pc6.t(100, map, "100", MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, "200");
        map.put("300", 300);
        map.put("400", 400);
        pc6.t(500, map, "500", XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMax, "600");
        map.put("700", 700);
        map.put("800", 800);
        map.put("900", 900);
    }
}

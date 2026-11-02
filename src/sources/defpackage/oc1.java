package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc1 {
    public static final fc1 Companion = new fc1();
    public static final jc1 a;

    static {
        new nc1(1L).b(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax).b(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax).b(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax).b(60).b(60);
        a = new jc1(1);
        new jc1(Math.multiplyExact(1, 7));
        new lc1(1);
        new lc1(Math.multiplyExact(1, 3));
        int iMultiplyExact = Math.multiplyExact(1, 12);
        new lc1(iMultiplyExact);
        new lc1(Math.multiplyExact(iMultiplyExact, 100));
    }

    public static String a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}

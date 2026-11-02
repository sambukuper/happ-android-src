package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class cb8 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        ArrayList arrayList;
        str.getClass();
        streamSettingsBean.r(str);
        String str12 = dh3.f(streamSettingsBean.getSecurity(), XRayConfig.TLS) ? str5 : null;
        if (str6 == null || str6.length() == 0) {
            arrayList = null;
        } else {
            List listF0 = fm7.F0(str6, new String[]{","}, 6);
            ArrayList arrayList2 = new ArrayList(xv0.Z(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                arrayList2.add(fm7.R0((String) it.next()).toString());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettingsBean = new XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean(str2, arrayList, null, null, null, null, str3, null, null, null, str4, str12, str11, false, str7, str8, str9, str10, null, null);
        if (fm7.o0(streamSettingsBean.getSecurity())) {
            streamSettingsBean.t(null);
            streamSettingsBean.q(null);
        } else if (dh3.f(streamSettingsBean.getSecurity(), XRayConfig.TLS)) {
            streamSettingsBean.t(tlsSettingsBean);
            streamSettingsBean.q(null);
        } else if (dh3.f(streamSettingsBean.getSecurity(), XRayConfig.REALITY)) {
            streamSettingsBean.t(null);
            streamSettingsBean.q(tlsSettingsBean);
        }
    }
}

package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.gson.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class i47 {
    public static final kc6 a = new kc6();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(Uri uri) {
        String strC = rp7.c(uri, "fp", 0, 6);
        if (strC != null) {
            return strC;
        }
        String strC2 = rp7.c(uri, "fingerprint", 0, 6);
        return strC2 == null ? "" : strC2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(ServerConfig serverConfig, Uri uri) {
        List listD = rp7.d(uri, "advancedfragment");
        if (listD.isEmpty()) {
            listD = null;
        }
        if (listD == null) {
            listD = rp7.d(uri, "advancedFragment");
        }
        String str = (String) wv0.t0(listD);
        if (str != null) {
            ss8 ss8Var = ss8.a;
            serverConfig.j(ss8.a(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean, Uri uri) {
        String str = (String) wv0.t0(rp7.d(uri, MetaParams.FRAGMENT));
        if (str != null) {
            List listE0 = fm7.E0(str, new char[]{','});
            int size = listE0.size();
            if (3 > size || size >= 5) {
                listE0 = null;
            }
            if (listE0 != null) {
                if (streamSettingsBean.getFinalMask() == null) {
                    streamSettingsBean.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask = streamSettingsBean.getFinalMask();
                if (finalMask != null) {
                    finalMask.e(i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean(XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.c((String) wv0.u0(3, listE0), (String) listE0.get(1), (String) listE0.get(0), (String) listE0.get(2)))));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean, Uri uri) {
        String str = (String) wv0.t0(rp7.d(uri, "noises"));
        if (str != null) {
            List listE0 = fm7.E0(str, new char[]{','});
            if (listE0.size() != 3) {
                listE0 = null;
            }
            if (listE0 != null) {
                if (streamSettingsBean.getFinalMask() == null) {
                    streamSettingsBean.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask = streamSettingsBean.getFinalMask();
                if (finalMask != null) {
                    finalMask.f(i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean("noise", XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, i21.K(new XRayConfig.OutboundBean.OutSettingsBean.NoisesBean(17, (String) listE0.get(0), (String) listE0.get(1), (String) listE0.get(2))), null, null, 495))));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String f(XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean, Uri uri) {
        Integer numValueOf;
        Object next;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean;
        Integer numValueOf2;
        Integer numB0;
        int iIntValue;
        Integer numB1;
        Integer numB2;
        Integer numB3;
        String strC = rp7.c(uri, "mtu", 0, 6);
        Integer numValueOf3 = null;
        if (strC == null || (numB3 = mm7.b0(strC)) == null) {
            numValueOf = null;
        } else {
            int iIntValue2 = numB3.intValue();
            if (iIntValue2 < 21) {
                iIntValue2 = 21;
            }
            numValueOf = Integer.valueOf(iIntValue2);
        }
        EConfigNetworkType.Companion companion = EConfigNetworkType.INSTANCE;
        String strC2 = rp7.c(uri, "type", 0, 6);
        companion.getClass();
        Iterator it = EConfigNetworkType.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!dh3.f(((EConfigNetworkType) next).getType(), strC2));
        EConfigNetworkType eConfigNetworkType = (EConfigNetworkType) next;
        if (eConfigNetworkType == null) {
            eConfigNetworkType = EConfigNetworkType.TCP;
        }
        if (eConfigNetworkType == EConfigNetworkType.QUIC) {
            eConfigNetworkType = EConfigNetworkType.TCP;
        }
        String type = eConfigNetworkType.getType();
        String strC3 = rp7.c(uri, "headerType", 0, 6);
        String strC4 = rp7.c(uri, MetaParams.HOST, 0, 6);
        String strC5 = rp7.c(uri, "path", 0, 6);
        String strC6 = rp7.c(uri, "seed", 0, 6);
        String strC7 = rp7.c(uri, "mode", 0, 6);
        String strC8 = rp7.c(uri, "serviceName", 0, 6);
        String strC9 = rp7.c(uri, "authority", 0, 6);
        String strC10 = rp7.c(uri, "extra", 0, 6);
        String strC11 = rp7.c(uri, "fm", 0, 6);
        if (strC11 != null) {
            a aVar = yw2.c;
            aVar.getClass();
            finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) aVar.c(strC11, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
        } else {
            finalMaskBean = null;
        }
        String strC12 = rp7.c(uri, "tti", 0, 6);
        Integer numValueOf4 = (strC12 == null || (numB2 = mm7.b0(strC12)) == null) ? null : Integer.valueOf(x97.n(numB2.intValue(), 10, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax));
        String strC13 = rp7.c(uri, "cwndMultiplier", 0, 6);
        if (strC13 == null || (numB1 = mm7.b0(strC13)) == null) {
            numValueOf2 = null;
        } else {
            int iIntValue3 = numB1.intValue();
            if (iIntValue3 < 1) {
                iIntValue3 = 1;
            }
            numValueOf2 = Integer.valueOf(iIntValue3);
        }
        String strC14 = rp7.c(uri, "maxSendingWindow", 0, 6);
        if (strC14 != null && (numB0 = mm7.b0(strC14)) != null) {
            int iIntValue4 = numB0.intValue();
            if (numValueOf != null && iIntValue4 < (iIntValue = numValueOf.intValue())) {
                iIntValue4 = iIntValue;
            }
            numValueOf3 = Integer.valueOf(iIntValue4);
        }
        return XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettingsBean, type, strC3, strC4, strC5, strC6, strC7, strC8, strC9, null, null, null, strC10, finalMaskBean, numValueOf, numValueOf4, numValueOf2, numValueOf3, rp7.c(uri, "headers", 0, 6), 1792);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String h(String str) {
        String str2;
        String rj6Var;
        str.getClass();
        fq4 fq4VarA = kc6.a(a, str);
        if (fq4VarA == null || (str2 = (String) wv0.u0(1, fq4VarA.a())) == null) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            bArrDecode.getClass();
            rj6Var = new String(bArrDecode, iq0.a);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return rj6Var instanceof rj6 ? null : rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String i(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '?') {
                str = str.substring(0, i);
                break;
            }
        }
        String string = fm7.R0(eq8.a(1, str, (6 & 2) != 0)).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String j(String str) {
        String strSubstring;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '#') {
                strSubstring = str.substring(i);
                return i(fm7.f0(1, strSubstring));
            }
        }
        strSubstring = "";
        return i(fm7.f0(1, strSubstring));
    }

    public abstract x83 b(String str);

    public abstract String g(ServerConfig serverConfig);
}

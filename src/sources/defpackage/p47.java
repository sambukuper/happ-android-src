package defpackage;

import android.net.Uri;
import com.google.gson.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class p47 extends i47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0115 */
    @Override // defpackage.i47
    public final x83 b(String str) {
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        Object rj6Var;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        XRayConfig.OutboundBean.OutSettingsBean settings;
        XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean;
        str.getClass();
        Uri uri = Uri.parse(str);
        ServerConfig.Companion companion = ServerConfig.INSTANCE;
        EConfigType eConfigType = EConfigType.WIREGUARD;
        companion.getClass();
        ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
        String strE = wl7.E(uri);
        if (strE == null) {
            strE = "";
        }
        String strI = i47.i(strE);
        if (strI == null) {
            strI = x79.a(uri);
        }
        serverConfigA.m(strI);
        if (uri.getQuery() != null) {
            XRayConfig.OutboundBean outboundBean2 = serverConfigA.getOutboundBean();
            Object obj = null;
            if (outboundBean2 != null && (settings = outboundBean2.getSettings()) != null) {
                settings.u(uri.getUserInfo());
                String strC = rp7.c(uri, "address", 0, 6);
                if (strC == null) {
                    strC = "172.16.0.2/32";
                }
                kc6 kc6Var = x79.a;
                Pattern patternCompile = Pattern.compile("\\s+");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(strC).replaceAll("");
                strReplaceAll.getClass();
                settings.m(fm7.F0(strReplaceAll, new String[]{","}, 6));
                List peers = settings.getPeers();
                if (peers != null && (wireGuardBean = (XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers.get(0)) != null) {
                    String strC2 = rp7.c(uri, "publickey", 0, 6);
                    wireGuardBean.f(strC2 != null ? strC2 : "");
                    String strC3 = rp7.c(uri, "presharedkey", 0, 6);
                    if (strC3 == null && (strC3 = rp7.c(uri, "preSharedKey", 0, 6)) == null) {
                        strC3 = rp7.c(uri, "PreSharedKey", 0, 6);
                    }
                    if (strC3 != null) {
                        if (strC3.length() <= 0) {
                            strC3 = null;
                        }
                        if (strC3 != null) {
                            wireGuardBean.e(strC3);
                        }
                    }
                    wireGuardBean.d(x79.b(uri) + ":" + uri.getPort());
                }
                ss8 ss8Var = ss8.a;
                String strC4 = rp7.c(uri, "mtu", 0, 6);
                if (strC4 == null) {
                    strC4 = "1420";
                }
                settings.r(Integer.valueOf(ss8.C(0, strC4)));
                List listD = rp7.d(uri, "reserved");
                ArrayList arrayList = new ArrayList();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    Integer numB0 = mm7.b0((String) it.next());
                    if (numB0 != null) {
                        arrayList.add(numB0);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                List listL = arrayList;
                if (zIsEmpty) {
                    listL = null;
                }
                if (listL == null) {
                    listL = i21.L(new Integer[]{0, 0, 0});
                }
                settings.t(listL);
            }
            XRayConfig.OutboundBean outboundBean3 = serverConfigA.getOutboundBean();
            if (outboundBean3 != null && (streamSettings3 = outboundBean3.getStreamSettings()) != null) {
                i47.d(streamSettings3, uri);
            }
            XRayConfig.OutboundBean outboundBean4 = serverConfigA.getOutboundBean();
            if (outboundBean4 != null && (streamSettings2 = outboundBean4.getStreamSettings()) != null) {
                i47.e(streamSettings2, uri);
            }
            i47.c(serverConfigA, uri);
            ka2 ka2Var = new ka2(w27.m0(new hu(new kf3(1, 3, 1), (byte) 1), new zo6(uri, (byte) 6)));
            while (ka2Var.hasNext()) {
                String str2 = (String) ka2Var.next();
                try {
                    a aVar = yw2.c;
                    aVar.getClass();
                    rj6Var = aVar.c(str2, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                if (rj6Var instanceof rj6) {
                    rj6Var = null;
                }
                if (rj6Var != null) {
                    obj = rj6Var;
                    break;
                }
            }
            XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) obj;
            if (finalMaskBean != null && (outboundBean = serverConfigA.getOutboundBean()) != null && (streamSettings = outboundBean.getStreamSettings()) != null) {
                streamSettings.o(finalMaskBean);
            }
        }
        String strH = i47.h(str);
        if (strH != null) {
            serverConfigA.l(serverConfigA.getMeta() != null ? new ServerConfig.Meta(strH) : new ServerConfig.Meta(strH));
        }
        return new j83(serverConfigA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final String g(ServerConfig serverConfig) {
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean;
        Map settings;
        List listB;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean tcpMasksBean;
        Integer mtu;
        String strValueOf;
        Object address;
        List reserved;
        List peers;
        XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean;
        String preSharedKey;
        List peers2;
        XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean2;
        String publicKey;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask3;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG != null) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings2 = outboundBeanG.getStreamSettings();
            if (streamSettings2 == null) {
                streamSettings2 = new XRayConfig.OutboundBean.StreamSettingsBean(null, null, null, 16383);
            }
            String strValueOf2 = String.valueOf(outboundBeanG.d());
            ss8 ss8Var = ss8.a;
            String strG = outboundBeanG.g();
            if (strG != null) {
                String strM = ss8.m(strG);
                Integer numH = outboundBeanG.h();
                Uri.Builder builder = new Uri.Builder();
                EConfigType eConfigType = EConfigType.WIREGUARD;
                Uri.Builder builderEncodedAuthority = builder.scheme(eConfigType.getProtocolScheme()).encodedAuthority(strValueOf2 + "@" + strM + ":" + numH);
                XRayConfig.OutboundBean outboundBean = serverConfig.getOutboundBean();
                if (outboundBean != null && (streamSettings = outboundBean.getStreamSettings()) != null && (finalMask3 = streamSettings.getFinalMask()) != null) {
                    builderEncodedAuthority.appendQueryParameter("fm", yw2.c.h(finalMask3));
                }
                XRayConfig.OutboundBean.OutSettingsBean settings2 = outboundBeanG.getSettings();
                if (settings2 != null && (peers2 = settings2.getPeers()) != null && (wireGuardBean2 = (XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers2.get(0)) != null && (publicKey = wireGuardBean2.getPublicKey()) != null) {
                    builderEncodedAuthority.appendQueryParameter("publickey", publicKey);
                }
                XRayConfig.OutboundBean.OutSettingsBean settings3 = outboundBeanG.getSettings();
                if (settings3 != null && (peers = settings3.getPeers()) != null && (wireGuardBean = (XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers.get(0)) != null && (preSharedKey = wireGuardBean.getPreSharedKey()) != null) {
                    builderEncodedAuthority.appendQueryParameter("presharedkey", preSharedKey);
                }
                XRayConfig.OutboundBean.OutSettingsBean settings4 = outboundBeanG.getSettings();
                if (settings4 != null && (reserved = settings4.getReserved()) != null) {
                    builderEncodedAuthority.appendQueryParameter("reserved", wv0.y0(reserved, (CharSequence) null, (String) null, (String) null, (gn2) null, 63));
                }
                XRayConfig.OutboundBean.OutSettingsBean settings5 = outboundBeanG.getSettings();
                if (settings5 != null && (address = settings5.getAddress()) != null) {
                    List list = address instanceof List ? (List) address : null;
                    if (list != null) {
                        builderEncodedAuthority.appendQueryParameter("address", wv0.y0(list, (CharSequence) null, (String) null, (String) null, (gn2) null, 63));
                    }
                }
                XRayConfig.OutboundBean.OutSettingsBean settings6 = outboundBeanG.getSettings();
                if (settings6 != null && (mtu = settings6.getMtu()) != null && (strValueOf = String.valueOf(mtu.intValue())) != null) {
                    builderEncodedAuthority.appendQueryParameter("mtu", strValueOf);
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings3 = outboundBeanG.getStreamSettings();
                if (streamSettings3 != null && (finalMask2 = streamSettings3.getFinalMask()) != null) {
                    List tcp = finalMask2.getTcp();
                    Map settings7 = (tcp == null || (tcpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean) wv0.t0(tcp)) == null) ? null : tcpMasksBean.getSettings();
                    if (settings7 != null) {
                        builderEncodedAuthority.appendQueryParameter(MetaParams.FRAGMENT, XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(settings7) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(settings7) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(settings7) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.g(settings7));
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBeanG.getStreamSettings();
                if (streamSettings4 != null && (finalMask = streamSettings4.getFinalMask()) != null) {
                    List udp = finalMask.getUdp();
                    XRayConfig.OutboundBean.OutSettingsBean.NoisesBean noisesBean = (udp == null || (udpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) wv0.t0(udp)) == null || (settings = udpMasksBean.getSettings()) == null || (listB = XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.b(settings)) == null) ? null : (XRayConfig.OutboundBean.OutSettingsBean.NoisesBean) wv0.t0(listB);
                    if (noisesBean != null) {
                        builderEncodedAuthority.appendQueryParameter("noises", noisesBean.getRand() + "," + noisesBean.getRandRange() + "," + noisesBean.getDelay());
                    }
                }
                String advancedFragment = serverConfig.getAdvancedFragment();
                if (advancedFragment != null) {
                    builderEncodedAuthority.appendQueryParameter("advancedFragment", advancedFragment);
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask4 = streamSettings2.getFinalMask();
                if (finalMask4 != null) {
                    builderEncodedAuthority.appendQueryParameter("fm", yw2.c.h(finalMask4));
                }
                ServerConfig.Meta meta = serverConfig.getMeta();
                String serverDescription = meta != null ? meta.getServerDescription() : null;
                String strConcat = serverDescription != null ? "?serverDescription=".concat(wl7.b0(0, serverDescription)) : null;
                if (strConcat == null) {
                    strConcat = "";
                }
                builderEncodedAuthority.fragment(serverConfig.getRemarks() + strConcat);
                String string = builderEncodedAuthority.build().toString();
                string.getClass();
                return mm7.W(string, eConfigType.getProtocolScheme() + "://", "", false);
            }
        }
        return "";
    }
}

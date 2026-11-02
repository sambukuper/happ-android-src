package defpackage;

import android.net.Uri;
import com.google.gson.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class j47 extends i47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    @Override // defpackage.i47
    public final x83 b(String str) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        String strC;
        Object rj6Var;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        List udp;
        XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean;
        Map settings;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask3;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        Object next;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask4;
        String lowerCase;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask5;
        List udp2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings4;
        Integer numB0;
        Integer numValueOf;
        String strSubstring;
        str.getClass();
        ss8 ss8Var = ss8.a;
        String strC2 = ss8.c(str);
        Uri uri = Uri.parse(strC2);
        ServerConfig.Companion companion = ServerConfig.INSTANCE;
        EConfigType eConfigType = EConfigType.HYSTERIA;
        companion.getClass();
        ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
        XRayConfig.OutboundBean outboundBean = serverConfigA.getOutboundBean();
        if (outboundBean == null || (streamSettings = outboundBean.getStreamSettings()) == null) {
            return new q83("hysteria");
        }
        XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean hysteriaSettings = streamSettings.getHysteriaSettings();
        if (hysteriaSettings == null) {
            return new q83("hysteria");
        }
        String strE = wl7.E(uri);
        if (strE == null) {
            strE = "";
        }
        String strI = i47.i(strE);
        if (strI == null) {
            strI = x79.a(uri);
        }
        serverConfigA.m(strI);
        XRayConfig.OutboundBean.OutSettingsBean settings2 = serverConfigA.getOutboundBean().getSettings();
        if (settings2 != null) {
            settings2.m(x79.a(uri));
            String host = uri.getHost();
            if (host != null) {
                String strJ = x79.j(host);
                int length = strJ.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strSubstring = "";
                        break;
                    }
                    if (strJ.charAt(i) == ':') {
                        strSubstring = strJ.substring(i);
                        break;
                    }
                    i++;
                }
                String strF0 = fm7.f0(1, strSubstring);
                int length2 = strF0.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    if (!Character.isDigit(strF0.charAt(i2))) {
                        strF0 = strF0.substring(0, i2);
                        break;
                    }
                }
                numValueOf = mm7.b0(strF0);
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                int port = uri.getPort();
                numValueOf = port != -1 ? Integer.valueOf(port) : null;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(XRayConfig.DEFAULT_PORT);
                }
            }
            settings2.s(numValueOf);
        }
        String userInfo = uri.getUserInfo();
        hysteriaSettings.c(userInfo != null ? userInfo : "");
        String strC3 = rp7.c(uri, "uit", 0, 6);
        if (strC3 != null && (numB0 = mm7.b0(strC3)) != null) {
            hysteriaSettings.d(Integer.valueOf(x97.n(numB0.intValue(), 2, XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMax)));
        }
        kc6 kc6Var = x79.a;
        String host2 = uri.getHost();
        if (host2 != null) {
            fq4 fq4VarA = kc6.a(x79.a, x79.j(host2));
            if (fq4VarA != null) {
                strC = (String) wv0.u0(1, fq4VarA.a());
            } else {
                strC = null;
            }
        } else {
            strC = null;
        }
        if (strC == null) {
            strC = rp7.c(uri, "mport", 0, 6);
        }
        if (strC != null) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings5 = serverConfigA.getOutboundBean().getStreamSettings();
            if ((streamSettings5 != null ? streamSettings5.getFinalMask() : null) == null && (streamSettings4 = serverConfigA.getOutboundBean().getStreamSettings()) != null) {
                streamSettings4.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
            }
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings6 = serverConfigA.getOutboundBean().getStreamSettings();
            ArrayList arrayList = (streamSettings6 == null || (finalMask5 = streamSettings6.getFinalMask()) == null || (udp2 = finalMask5.getUdp()) == null) ? new ArrayList() : new ArrayList(udp2);
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                lowerCase = ((XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) next).getType().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } while (!lowerCase.equals("udphop"));
            XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean2 = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) next;
            if (udpMasksBean2 == null) {
                udpMasksBean2 = new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean("udphop", XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, null, null, null, 511));
                arrayList.add(udpMasksBean2);
            }
            if (udpMasksBean2.getSettings() == null) {
                udpMasksBean2.c(XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, null, null, null, 511));
            }
            Map settings3 = udpMasksBean2.getSettings();
            settings3.getClass();
            settings3.put("mode", "intervalRemote");
            Map settings4 = udpMasksBean2.getSettings();
            settings4.getClass();
            settings4.put("remotePorts", strC);
            Map settings5 = udpMasksBean2.getSettings();
            settings5.getClass();
            settings5.put("interval", rp7.c(uri, "mportHopInt", 0, 6));
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings7 = serverConfigA.getOutboundBean().getStreamSettings();
            if (streamSettings7 != null && (finalMask4 = streamSettings7.getFinalMask()) != null) {
                finalMask4.f(arrayList);
            }
        }
        streamSettings.p(EConfigNetworkType.HYSTERIA.getType());
        String strC4 = rp7.c(uri, "security", 0, 6);
        if (strC4 == null) {
            strC4 = XRayConfig.TLS;
        }
        String str2 = strC4;
        String strC5 = rp7.c(uri, "sni", 0, 6);
        if (strC5 == null) {
            strC5 = x79.a(uri);
        }
        String str3 = strC5;
        String strC6 = rp7.c(uri, "pcs", 0, 6);
        if (strC6 == null) {
            strC6 = rp7.c(uri, "pinSHA256", 0, 6);
        }
        String str4 = strC6;
        String strC7 = rp7.c(uri, "pcn", 0, 6);
        if (strC7 == null) {
            strC7 = rp7.c(uri, "vcn", 0, 6);
        }
        cb8.a(streamSettings, str2, str3, null, str4, strC7, "h3", null, null, null, null, null);
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings8 = serverConfigA.getOutboundBean().getStreamSettings();
        if (streamSettings8 != null) {
            i47.d(streamSettings8, uri);
        }
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings9 = serverConfigA.getOutboundBean().getStreamSettings();
        if (streamSettings9 != null) {
            i47.e(streamSettings9, uri);
        }
        i47.c(serverConfigA, uri);
        ka2 ka2Var = new ka2(w27.m0(new hu(new kf3(1, 3, 1), (byte) 1), new zo6(uri, (byte) 6)));
        do {
            if (!ka2Var.hasNext()) {
                rj6Var = null;
                break;
            }
            String str5 = (String) ka2Var.next();
            try {
                a aVar = yw2.c;
                aVar.getClass();
                rj6Var = aVar.c(str5, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = null;
            }
        } while (rj6Var == null);
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) rj6Var;
        if (finalMaskBean != null) {
            streamSettings.o(finalMaskBean);
        } else {
            String strC8 = rp7.c(uri, "obfs-password", 0, 6);
            if (strC8 != null) {
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings10 = serverConfigA.getOutboundBean().getStreamSettings();
                if ((streamSettings10 != null ? streamSettings10.getFinalMask() : null) == null && (streamSettings3 = serverConfigA.getOutboundBean().getStreamSettings()) != null) {
                    streamSettings3.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings11 = serverConfigA.getOutboundBean().getStreamSettings();
                if (((streamSettings11 == null || (finalMask3 = streamSettings11.getFinalMask()) == null) ? null : finalMask3.getUdp()) == null && (streamSettings2 = serverConfigA.getOutboundBean().getStreamSettings()) != null && (finalMask2 = streamSettings2.getFinalMask()) != null) {
                    finalMask2.f(i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean((LinkedHashMap) null, 3)));
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings12 = serverConfigA.getOutboundBean().getStreamSettings();
                if (streamSettings12 != null && (finalMask = streamSettings12.getFinalMask()) != null && (udp = finalMask.getUdp()) != null && (udpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) wv0.t0(udp)) != null) {
                    udpMasksBean.d();
                    if (udpMasksBean.getSettings() == null) {
                        udpMasksBean.c(XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, null, null, null, 511));
                    }
                    Map settings6 = udpMasksBean.getSettings();
                    if (settings6 != null) {
                        settings6.put("password", strC8);
                    }
                    String strC9 = rp7.c(uri, "obfs-packet-size", 0, 6);
                    if (strC9 != null && (settings = udpMasksBean.getSettings()) != null) {
                        settings.put("packetSize", strC9);
                    }
                }
            }
        }
        String strH = i47.h(strC2);
        if (strH != null) {
            serverConfigA.l(serverConfigA.getMeta() != null ? new ServerConfig.Meta(strH) : new ServerConfig.Meta(strH));
        }
        return new j83(serverConfigA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final String g(ServerConfig serverConfig) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean;
        Map settings;
        List listB;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean tcpMasksBean;
        List udp;
        Object next;
        Map settings2;
        String lowerCase;
        List udp2;
        Object next2;
        Map settings3;
        String lowerCase2;
        Integer udpIdleTimeout;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG != null && (streamSettings = outboundBeanG.getStreamSettings()) != null) {
            String strD = outboundBeanG.d();
            ss8 ss8Var = ss8.a;
            String strG = outboundBeanG.g();
            if (strG != null) {
                String strM = ss8.m(strG);
                Integer numH = outboundBeanG.h();
                Uri.Builder builderEncodedAuthority = new Uri.Builder().scheme(EConfigType.HYSTERIA.getProtocolScheme()).encodedAuthority(strD + "@" + strM + ":" + numH);
                String security = streamSettings.getSecurity();
                if (security.length() == 0) {
                    security = "none";
                }
                builderEncodedAuthority.appendQueryParameter("security", security);
                XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean hysteriaSettings = streamSettings.getHysteriaSettings();
                if (hysteriaSettings != null && (udpIdleTimeout = hysteriaSettings.getUdpIdleTimeout()) != null) {
                    builderEncodedAuthority.appendQueryParameter("uit", String.valueOf(udpIdleTimeout.intValue()));
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask3 = streamSettings.getFinalMask();
                if (finalMask3 != null) {
                    builderEncodedAuthority.appendQueryParameter("fm", yw2.c.h(finalMask3));
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask4 = streamSettings.getFinalMask();
                if (finalMask4 != null && (udp2 = finalMask4.getUdp()) != null) {
                    Iterator it = udp2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        lowerCase2 = ((XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) next2).getType().toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    } while (!lowerCase2.equals("udphop"));
                    XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean2 = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) next2;
                    if (udpMasksBean2 != null && (settings3 = udpMasksBean2.getSettings()) != null) {
                        Object obj = settings3.get("remotePorts");
                        String str = obj instanceof String ? (String) obj : null;
                        if (str != null) {
                            builderEncodedAuthority.appendQueryParameter("mport", str);
                        }
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask5 = streamSettings.getFinalMask();
                if (finalMask5 != null && (udp = finalMask5.getUdp()) != null) {
                    Iterator it2 = udp.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        lowerCase = ((XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) next).getType().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } while (!lowerCase.equals("udphop"));
                    XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean3 = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) next;
                    if (udpMasksBean3 != null && (settings2 = udpMasksBean3.getSettings()) != null) {
                        Object obj2 = settings2.get("interval");
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 != null) {
                            builderEncodedAuthority.appendQueryParameter("mportHopInt", str2);
                        }
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings = streamSettings.getTlsSettings();
                if (tlsSettings != null) {
                    String serverName = tlsSettings.getServerName();
                    if (serverName != null) {
                        if (fm7.o0(serverName)) {
                            serverName = null;
                        }
                        if (serverName != null) {
                            builderEncodedAuthority.appendQueryParameter("sni", serverName);
                        }
                    }
                    String pinnedPeerCertSha256 = tlsSettings.getPinnedPeerCertSha256();
                    if (pinnedPeerCertSha256 != null) {
                        if (fm7.o0(pinnedPeerCertSha256)) {
                            pinnedPeerCertSha256 = null;
                        }
                        if (pinnedPeerCertSha256 != null) {
                            builderEncodedAuthority.appendQueryParameter("pinSHA256", pinnedPeerCertSha256);
                        }
                    }
                    String verifyPeerCertByName = tlsSettings.getVerifyPeerCertByName();
                    if (verifyPeerCertByName != null) {
                        if (fm7.o0(verifyPeerCertByName)) {
                            verifyPeerCertByName = null;
                        }
                        if (verifyPeerCertByName != null) {
                            builderEncodedAuthority.appendQueryParameter("pcn", verifyPeerCertByName);
                        }
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings2 = outboundBeanG.getStreamSettings();
                if (streamSettings2 != null && (finalMask2 = streamSettings2.getFinalMask()) != null) {
                    List tcp = finalMask2.getTcp();
                    Map settings4 = (tcp == null || (tcpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean) wv0.t0(tcp)) == null) ? null : tcpMasksBean.getSettings();
                    if (settings4 != null) {
                        builderEncodedAuthority.appendQueryParameter(MetaParams.FRAGMENT, XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.g(settings4));
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings3 = outboundBeanG.getStreamSettings();
                if (streamSettings3 != null && (finalMask = streamSettings3.getFinalMask()) != null) {
                    List udp3 = finalMask.getUdp();
                    XRayConfig.OutboundBean.OutSettingsBean.NoisesBean noisesBean = (udp3 == null || (udpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) wv0.t0(udp3)) == null || (settings = udpMasksBean.getSettings()) == null || (listB = XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.b(settings)) == null) ? null : (XRayConfig.OutboundBean.OutSettingsBean.NoisesBean) wv0.t0(listB);
                    if (noisesBean != null) {
                        builderEncodedAuthority.appendQueryParameter("noises", noisesBean.getRand() + "," + noisesBean.getRandRange() + "," + noisesBean.getDelay());
                    }
                }
                String advancedFragment = serverConfig.getAdvancedFragment();
                if (advancedFragment != null) {
                    builderEncodedAuthority.appendQueryParameter("advancedfragment", advancedFragment);
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
                return mm7.W(string, EConfigType.HYSTERIA.getProtocolScheme() + "://", "", false);
            }
        }
        return "";
    }
}

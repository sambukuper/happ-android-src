package defpackage;

import android.net.Uri;
import com.google.gson.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class n47 extends i47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final x83 b(String str) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        Object rj6Var;
        str.getClass();
        ss8 ss8Var = ss8.a;
        String strC = ss8.c(str);
        Uri uri = Uri.parse(strC);
        ServerConfig.Companion companion = ServerConfig.INSTANCE;
        EConfigType eConfigType = EConfigType.VLESS;
        companion.getClass();
        ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
        XRayConfig.OutboundBean outboundBean = serverConfigA.getOutboundBean();
        if (outboundBean == null || (streamSettings = outboundBean.getStreamSettings()) == null) {
            return new q83("vless");
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
        XRayConfig.OutboundBean.OutSettingsBean settings = serverConfigA.getOutboundBean().getSettings();
        Object obj = null;
        if (settings != null) {
            settings.m(x79.b(uri));
            settings.s(Integer.valueOf(uri.getPort()));
            String userInfo = uri.getUserInfo();
            if (userInfo == null) {
                userInfo = "";
            }
            settings.q(userInfo);
            String strC2 = rp7.c(uri, "encryption", 0, 6);
            if (strC2 == null) {
                strC2 = "none";
            }
            settings.o(strC2);
            String strC3 = rp7.c(uri, "flow", 0, 6);
            if (strC3 == null || fm7.o0(strC3) || strC3.equalsIgnoreCase("none")) {
                strC3 = null;
            }
            if (strC3 == null) {
                strC3 = "";
            }
            settings.p(strC3);
        }
        String strF = i47.f(streamSettings, uri);
        String strC4 = rp7.c(uri, "security", 0, 6);
        String str2 = strC4 != null ? strC4 : "";
        String strC5 = rp7.c(uri, "sni", 0, 6);
        if (strC5 != null) {
            strF = strC5;
        }
        String strA = i47.a(uri);
        String strC6 = rp7.c(uri, "alpn", 0, 6);
        String strC7 = rp7.c(uri, "pbk", 0, 6);
        String strC8 = rp7.c(uri, "sid", 0, 6);
        String strC9 = rp7.c(uri, "spx", 0, 6);
        String strC10 = rp7.c(uri, "pqv", 0, 6);
        String strC11 = rp7.c(uri, "pcs", 0, 6);
        String strC12 = rp7.c(uri, "pcn", 0, 6);
        if (strC12 == null) {
            strC12 = rp7.c(uri, "vcn", 0, 6);
        }
        String strC13 = rp7.c(uri, "ech", 0, 6);
        if (strC13 == null) {
            strC13 = rp7.c(uri, "echcl", 0, 6);
        }
        strF.getClass();
        cb8.a(streamSettings, str2, strF, strA, strC11, strC12, strC6, strC7, strC8, strC9, strC10, strC13);
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3 = serverConfigA.getOutboundBean().getStreamSettings();
        if (streamSettings3 != null) {
            i47.d(streamSettings3, uri);
        }
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = serverConfigA.getOutboundBean().getStreamSettings();
        if (streamSettings4 != null) {
            i47.e(streamSettings4, uri);
        }
        i47.c(serverConfigA, uri);
        ka2 ka2Var = new ka2(w27.m0(new hu(new kf3(1, 3, 1), (byte) 1), new zo6(uri, (byte) 6)));
        while (ka2Var.hasNext()) {
            String str3 = (String) ka2Var.next();
            try {
                a aVar = yw2.c;
                aVar.getClass();
                rj6Var = aVar.c(str3, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
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
        if (finalMaskBean != null && (streamSettings2 = serverConfigA.getOutboundBean().getStreamSettings()) != null) {
            streamSettings2.o(finalMaskBean);
        }
        String strH = i47.h(strC);
        if (strH != null) {
            serverConfigA.l(serverConfigA.getMeta() != null ? new ServerConfig.Meta(strH) : new ServerConfig.Meta(strH));
        }
        return new j83(serverConfigA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final String g(ServerConfig serverConfig) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        String flow;
        List vnext;
        XRayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean;
        List users;
        XRayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean;
        String strF;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean;
        Map settings;
        List listB;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean tcpMasksBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean kcpSettings;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask3;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG != null && (streamSettings = outboundBeanG.getStreamSettings()) != null) {
            String strValueOf = String.valueOf(outboundBeanG.d());
            ss8 ss8Var = ss8.a;
            String strG = outboundBeanG.g();
            if (strG != null) {
                String strM = ss8.m(strG);
                Integer numH = outboundBeanG.h();
                Uri.Builder builder = new Uri.Builder();
                EConfigType eConfigType = EConfigType.VLESS;
                Uri.Builder builderEncodedAuthority = builder.scheme(eConfigType.getProtocolScheme()).encodedAuthority(strValueOf + "@" + strM + ":" + numH);
                XRayConfig.OutboundBean.OutSettingsBean settings2 = outboundBeanG.getSettings();
                if (settings2 == null || (flow = settings2.getFlow()) == null) {
                    XRayConfig.OutboundBean.OutSettingsBean settings3 = outboundBeanG.getSettings();
                    flow = (settings3 == null || (vnext = settings3.getVnext()) == null || (vnextBean = (XRayConfig.OutboundBean.OutSettingsBean.VnextBean) vnext.get(0)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (XRayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean) users.get(0)) == null) ? null : usersBean.getFlow();
                }
                if (flow != null) {
                    if (fm7.o0(flow)) {
                        flow = null;
                    }
                    if (flow != null) {
                        builderEncodedAuthority.appendQueryParameter("flow", flow);
                    }
                }
                String strF2 = outboundBeanG.f();
                if (strF2 == null || strF2.length() == 0) {
                    strF = "none";
                } else {
                    strF = outboundBeanG.f();
                    if (strF == null) {
                        strF = "";
                    }
                }
                builderEncodedAuthority.appendQueryParameter("encryption", strF);
                String security = streamSettings.getSecurity();
                if (security.length() == 0) {
                    security = "none";
                }
                builderEncodedAuthority.appendQueryParameter("security", security);
                XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings = streamSettings.getTlsSettings();
                if (tlsSettings == null) {
                    tlsSettings = streamSettings.getRealitySettings();
                }
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
                    List alpn = tlsSettings.getAlpn();
                    if (alpn != null) {
                        String strY0 = wv0.y0(alpn, (CharSequence) null, (String) null, (String) null, (gn2) null, 63);
                        if (fm7.o0(strY0)) {
                            strY0 = null;
                        }
                        if (strY0 != null) {
                            builderEncodedAuthority.appendQueryParameter("alpn", strY0);
                        }
                    }
                    String fingerprint = tlsSettings.getFingerprint();
                    if (fingerprint != null) {
                        if (fm7.o0(fingerprint)) {
                            fingerprint = null;
                        }
                        if (fingerprint != null) {
                            builderEncodedAuthority.appendQueryParameter("fp", fingerprint);
                        }
                    }
                    String echConfigList = tlsSettings.getEchConfigList();
                    if (echConfigList != null) {
                        if (fm7.o0(echConfigList)) {
                            echConfigList = null;
                        }
                        if (echConfigList != null) {
                            builderEncodedAuthority.appendQueryParameter("ech", echConfigList);
                        }
                    }
                    String publicKey = tlsSettings.getPublicKey();
                    if (publicKey != null) {
                        if (fm7.o0(publicKey)) {
                            publicKey = null;
                        }
                        if (publicKey != null) {
                            builderEncodedAuthority.appendQueryParameter("pbk", publicKey);
                        }
                    }
                    String shortId = tlsSettings.getShortId();
                    if (shortId != null) {
                        if (fm7.o0(shortId)) {
                            shortId = null;
                        }
                        if (shortId != null) {
                            builderEncodedAuthority.appendQueryParameter("sid", shortId);
                        }
                    }
                    String spiderX = tlsSettings.getSpiderX();
                    if (spiderX != null) {
                        if (fm7.o0(spiderX)) {
                            spiderX = null;
                        }
                        if (spiderX != null) {
                            builderEncodedAuthority.appendQueryParameter("spx", spiderX);
                        }
                    }
                    String mldsa65Verify = tlsSettings.getMldsa65Verify();
                    if (mldsa65Verify != null) {
                        if (fm7.o0(mldsa65Verify)) {
                            mldsa65Verify = null;
                        }
                        if (mldsa65Verify != null) {
                            builderEncodedAuthority.appendQueryParameter("pqv", mldsa65Verify);
                        }
                    }
                    String pinnedPeerCertSha256 = tlsSettings.getPinnedPeerCertSha256();
                    if (pinnedPeerCertSha256 != null) {
                        if (fm7.o0(pinnedPeerCertSha256)) {
                            pinnedPeerCertSha256 = null;
                        }
                        if (pinnedPeerCertSha256 != null) {
                            builderEncodedAuthority.appendQueryParameter("pcs", pinnedPeerCertSha256);
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
                String network = streamSettings.getNetwork();
                if (network.length() == 0) {
                    XRayConfig.INSTANCE.getClass();
                    network = XRayConfig.DEFAULT_NETWORK;
                }
                builderEncodedAuthority.appendQueryParameter("type", network);
                List listL = outboundBeanG.l();
                if (listL != null) {
                    String network2 = streamSettings.getNetwork();
                    if (dh3.f(network2, EConfigNetworkType.TCP.getType())) {
                        CharSequence charSequence = (CharSequence) listL.get(0);
                        builderEncodedAuthority.appendQueryParameter("headerType", (String) (charSequence.length() != 0 ? charSequence : "none"));
                        Object obj = listL.get(1);
                        if (fm7.o0((String) obj)) {
                            obj = null;
                        }
                        String str = (String) obj;
                        if (str != null) {
                            builderEncodedAuthority.appendQueryParameter(MetaParams.HOST, str);
                        }
                    } else if (dh3.f(network2, EConfigNetworkType.KCP.getType())) {
                        XRayConfig.OutboundBean outboundBean = serverConfig.getOutboundBean();
                        if (outboundBean != null && (streamSettings3 = outboundBean.getStreamSettings()) != null && (finalMask3 = streamSettings3.getFinalMask()) != null) {
                            builderEncodedAuthority.appendQueryParameter("fm", yw2.c.h(finalMask3));
                        }
                        XRayConfig.OutboundBean outboundBean2 = serverConfig.getOutboundBean();
                        if (outboundBean2 != null && (streamSettings2 = outboundBean2.getStreamSettings()) != null && (kcpSettings = streamSettings2.getKcpSettings()) != null) {
                            builderEncodedAuthority.appendQueryParameter("mtu", String.valueOf(kcpSettings.getMtu()));
                            builderEncodedAuthority.appendQueryParameter("tti", String.valueOf(kcpSettings.getTti()));
                            Integer cwndMultiplier = kcpSettings.getCwndMultiplier();
                            if (cwndMultiplier != null) {
                                builderEncodedAuthority.appendQueryParameter("cwndMultiplier", String.valueOf(cwndMultiplier.intValue()));
                            }
                            Integer maxSendingWindow = kcpSettings.getMaxSendingWindow();
                            if (maxSendingWindow != null) {
                                builderEncodedAuthority.appendQueryParameter("maxSendingWindow", String.valueOf(maxSendingWindow.intValue()));
                            }
                        }
                    } else if (dh3.f(network2, EConfigNetworkType.WS.getType()) || dh3.f(network2, EConfigNetworkType.HTTP_UPGRADE.getType())) {
                        Object obj2 = listL.get(1);
                        if (fm7.o0((String) obj2)) {
                            obj2 = null;
                        }
                        String str2 = (String) obj2;
                        if (str2 != null) {
                            builderEncodedAuthority.appendQueryParameter(MetaParams.HOST, str2);
                        }
                        Object obj3 = listL.get(2);
                        if (fm7.o0((String) obj3)) {
                            obj3 = null;
                        }
                        String str3 = (String) obj3;
                        if (str3 != null) {
                            builderEncodedAuthority.appendQueryParameter("path", str3);
                        }
                        Object obj4 = listL.get(3);
                        if (fm7.o0((String) obj4)) {
                            obj4 = null;
                        }
                        String str4 = (String) obj4;
                        if (str4 != null) {
                            builderEncodedAuthority.appendQueryParameter("headers", str4);
                        }
                    } else if (dh3.f(network2, EConfigNetworkType.SPLIT_HTTP.getType()) || dh3.f(network2, EConfigNetworkType.XHTTP.getType())) {
                        Object obj5 = listL.get(0);
                        if (fm7.o0((String) obj5)) {
                            obj5 = null;
                        }
                        String str5 = (String) obj5;
                        if (str5 != null) {
                            builderEncodedAuthority.appendQueryParameter("mode", str5);
                        }
                        Object obj6 = listL.get(1);
                        if (fm7.o0((String) obj6)) {
                            obj6 = null;
                        }
                        String str6 = (String) obj6;
                        if (str6 != null) {
                            builderEncodedAuthority.appendQueryParameter(MetaParams.HOST, str6);
                        }
                        Object obj7 = listL.get(2);
                        if (fm7.o0((String) obj7)) {
                            obj7 = null;
                        }
                        String str7 = (String) obj7;
                        if (str7 != null) {
                            builderEncodedAuthority.appendQueryParameter("path", str7);
                        }
                        Object obj8 = listL.get(3);
                        if (fm7.o0((String) obj8)) {
                            obj8 = null;
                        }
                        String str8 = (String) obj8;
                        if (str8 != null) {
                            builderEncodedAuthority.appendQueryParameter("extra", str8);
                        }
                    } else if (dh3.f(network2, EConfigNetworkType.GRPC.getType())) {
                        builderEncodedAuthority.appendQueryParameter("mode", (String) listL.get(0));
                        builderEncodedAuthority.appendQueryParameter("authority", (String) listL.get(1));
                        builderEncodedAuthority.appendQueryParameter("serviceName", (String) listL.get(2));
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBeanG.getStreamSettings();
                if (streamSettings4 != null && (finalMask2 = streamSettings4.getFinalMask()) != null) {
                    List tcp = finalMask2.getTcp();
                    Map settings4 = (tcp == null || (tcpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean) wv0.t0(tcp)) == null) ? null : tcpMasksBean.getSettings();
                    if (settings4 != null) {
                        builderEncodedAuthority.appendQueryParameter(MetaParams.FRAGMENT, XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.g(settings4));
                    }
                }
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings5 = outboundBeanG.getStreamSettings();
                if (streamSettings5 != null && (finalMask = streamSettings5.getFinalMask()) != null) {
                    List udp = finalMask.getUdp();
                    XRayConfig.OutboundBean.OutSettingsBean.NoisesBean noisesBean = (udp == null || (udpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) wv0.t0(udp)) == null || (settings = udpMasksBean.getSettings()) == null || (listB = XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.b(settings)) == null) ? null : (XRayConfig.OutboundBean.OutSettingsBean.NoisesBean) wv0.t0(listB);
                    if (noisesBean != null) {
                        builderEncodedAuthority.appendQueryParameter("noises", noisesBean.getRand() + "," + noisesBean.getRandRange() + "," + noisesBean.getDelay());
                    }
                }
                String advancedFragment = serverConfig.getAdvancedFragment();
                if (advancedFragment != null) {
                    builderEncodedAuthority.appendQueryParameter("advancedfragment", advancedFragment);
                }
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask4 = streamSettings.getFinalMask();
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

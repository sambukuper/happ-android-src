package defpackage;

import android.net.Uri;
import com.google.gson.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class k47 extends i47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x0154 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:27:0x0097, B:28:0x00a6, B:30:0x00ac, B:32:0x00bb, B:36:0x00c8, B:37:0x00e3, B:40:0x00f4, B:42:0x0106, B:44:0x010c, B:46:0x0112, B:56:0x01ab, B:58:0x01b3, B:60:0x01b9, B:66:0x01c8, B:68:0x01dc, B:69:0x01e4, B:70:0x01ed, B:72:0x01f3, B:74:0x01f9, B:76:0x0201, B:78:0x0213, B:80:0x0219, B:82:0x021f, B:84:0x0225, B:86:0x022b, B:88:0x0234, B:91:0x023b, B:48:0x0154, B:50:0x0160, B:52:0x016c, B:54:0x0172), top: B:170:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0160 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:27:0x0097, B:28:0x00a6, B:30:0x00ac, B:32:0x00bb, B:36:0x00c8, B:37:0x00e3, B:40:0x00f4, B:42:0x0106, B:44:0x010c, B:46:0x0112, B:56:0x01ab, B:58:0x01b3, B:60:0x01b9, B:66:0x01c8, B:68:0x01dc, B:69:0x01e4, B:70:0x01ed, B:72:0x01f3, B:74:0x01f9, B:76:0x0201, B:78:0x0213, B:80:0x0219, B:82:0x021f, B:84:0x0225, B:86:0x022b, B:88:0x0234, B:91:0x023b, B:48:0x0154, B:50:0x0160, B:52:0x016c, B:54:0x0172), top: B:170:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // defpackage.i47
    public final x83 b(String str) throws Throwable {
        int i;
        dn8 rj6Var;
        boolean z;
        ka2 ka2Var;
        Object obj;
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        Object rj6Var2;
        String strA;
        XRayConfig.OutboundBean.OutSettingsBean settings;
        List servers;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        XRayConfig.OutboundBean.OutSettingsBean settings2;
        List servers2;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean2;
        String strN;
        XRayConfig.OutboundBean outboundBean2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean;
        XRayConfig.OutboundBean outboundBean3;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings4;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings5;
        str.getClass();
        ss8 ss8Var = ss8.a;
        Uri uri = Uri.parse(ss8.c(str));
        ServerConfig.Companion companion = ServerConfig.INSTANCE;
        EConfigType eConfigType = EConfigType.SHADOWSOCKS;
        companion.getClass();
        ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
        ?? r12 = 0;
        try {
            Uri uri2 = Uri.parse(str);
            String userInfo = uri2.getUserInfo();
            if (userInfo == null) {
                z = false;
                i = 1;
            } else {
                String strE = wl7.E(uri2);
                if (strE == null) {
                    strE = "";
                }
                String strI = i47.i(strE);
                if (strI == null) {
                    strI = x79.a(uri2);
                }
                serverConfigA.m(strI);
                List listF0 = fm7.d0(userInfo, ":", false) ? fm7.F0(userInfo, new String[]{":"}, 2) : fm7.F0(ss8.a(userInfo), new String[]{":"}, 2);
                if (listF0.size() == 2) {
                    String str2 = (String) wv0.r0(listF0);
                    String str3 = (String) wv0.A0(listF0);
                    String query = uri2.getQuery();
                    if (query == null) {
                        query = "";
                    }
                    String strA2 = eq8.a(1, query, (6 & 2) != 0);
                    if (strA2.equals("")) {
                        i = 1;
                    } else {
                        HashMap map = new HashMap();
                        i = 1;
                        try {
                            List listF1 = fm7.F0(strA2, new String[]{";"}, 6);
                            listF1.toString();
                            Iterator it = listF1.iterator();
                            while (it.hasNext()) {
                                String str4 = (String) it.next();
                                int iM0 = fm7.m0(str4, "=", (int) r12, (boolean) r12, 6);
                                if (iM0 == -1) {
                                    map.put(eq8.a(1, str4, (6 & 2) != 0), "");
                                } else {
                                    map.put(eq8.a(1, str4.substring(0, iM0), (6 & 2) != 0), eq8.a(1, str4.substring(iM0 + 1), (6 & 2) != 0));
                                    it = it;
                                }
                                r12 = 0;
                            }
                            map.toString();
                            if (dh3.f(map.get("plugin"), "obfs-local")) {
                                Object obj2 = map.get("obfs");
                                EConfigNetworkType eConfigNetworkType = EConfigNetworkType.HTTP;
                                if (dh3.f(obj2, eConfigNetworkType.getType())) {
                                    XRayConfig.OutboundBean outboundBean4 = serverConfigA.getOutboundBean();
                                    if (outboundBean4 == null || (streamSettings5 = outboundBean4.getStreamSettings()) == null) {
                                        strN = null;
                                    } else {
                                        strN = XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettings5, EConfigNetworkType.TCP.getType(), eConfigNetworkType.getType(), (String) map.get("obfs-host"), (String) map.get("path"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 261888);
                                    }
                                } else if (dh3.f(map.get("plugin"), "v2ray-plugin")) {
                                    String type = EConfigNetworkType.WS.getType();
                                    outboundBean2 = serverConfigA.getOutboundBean();
                                    if (outboundBean2 != null || (streamSettings2 = outboundBean2.getStreamSettings()) == null) {
                                        strN = null;
                                    } else {
                                        strN = XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettings2, type, null, (String) map.get(MetaParams.HOST), (String) map.get("path"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 261888);
                                    }
                                } else {
                                    strN = "";
                                }
                            } else if (dh3.f(map.get("plugin"), "v2ray-plugin")) {
                                String type2 = EConfigNetworkType.WS.getType();
                                outboundBean2 = serverConfigA.getOutboundBean();
                                if (outboundBean2 != null) {
                                    strN = null;
                                } else {
                                    strN = null;
                                }
                            } else {
                                strN = "";
                            }
                            if (map.containsKey(XRayConfig.TLS) && (outboundBean3 = serverConfigA.getOutboundBean()) != null && (streamSettings4 = outboundBean3.getStreamSettings()) != null) {
                                String str5 = strN == null ? "" : strN;
                                String str6 = (String) map.get("pcs");
                                String str7 = (String) map.get("pcn");
                                if (str7 == null) {
                                    str7 = (String) map.get("vcn");
                                }
                                cb8.a(streamSettings4, XRayConfig.TLS, str5, null, str6, str7, null, null, null, null, null, null);
                            }
                            XRayConfig.OutboundBean outboundBean5 = serverConfigA.getOutboundBean();
                            if (outboundBean5 != null && (streamSettings3 = outboundBean5.getStreamSettings()) != null) {
                                String str8 = (String) map.get("fm");
                                if (str8 != null) {
                                    a aVar = yw2.c;
                                    aVar.getClass();
                                    finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) aVar.c(str8, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                                } else {
                                    finalMaskBean = null;
                                }
                                streamSettings3.o(finalMaskBean);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                throw th;
                            }
                            rj6Var = new rj6(th);
                        }
                    }
                    XRayConfig.OutboundBean outboundBean6 = serverConfigA.getOutboundBean();
                    if (outboundBean6 == null || (settings2 = outboundBean6.getSettings()) == null || (servers2 = settings2.getServers()) == null || (serversBean2 = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers2.get(0)) == null) {
                        rj6Var = null;
                    } else {
                        String host = uri2.getHost();
                        if (host == null) {
                            host = "";
                        }
                        serversBean2.g(host);
                        serversBean2.k(uri2.getPort());
                        serversBean2.j(str3);
                        serversBean2.i(str2);
                        rj6Var = dn8.a;
                    }
                    z = !(rj6Var instanceof rj6);
                } else {
                    i = 1;
                    z = false;
                }
            }
            while (true) {
                if (!ka2Var.hasNext()) {
                    obj = null;
                    break;
                }
                String str9 = (String) ka2Var.next();
                try {
                    a aVar2 = yw2.c;
                    aVar2.getClass();
                    rj6Var2 = aVar2.c(str9, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                if (rj6Var2 instanceof rj6) {
                    rj6Var2 = null;
                }
                if (rj6Var2 != null) {
                    obj = rj6Var2;
                    break;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i = 1;
        }
        if (!z) {
            String strW = mm7.W(str, EConfigType.SHADOWSOCKS.getProtocolScheme() + "://", "", false);
            int iM1 = fm7.m0(strW, "#", 0, false, 6);
            if (iM1 > 0) {
                String strJ = i47.j(strW);
                if (strJ == null) {
                    strJ = x79.a(uri);
                }
                serverConfigA.m(strJ);
                strW = strW.substring(0, iM1);
            }
            int iM2 = fm7.m0(strW, "@", 0, false, 6);
            if (iM2 > 0) {
                ss8 ss8Var2 = ss8.a;
                strA = ss8.a(strW.substring(0, iM2)).concat(strW.substring(iM2, strW.length()));
            } else {
                ss8 ss8Var3 = ss8.a;
                strA = ss8.a(strW);
            }
            Pattern patternCompile = Pattern.compile("^(.+?):(.*)@(.+?):(\\d+?)/?$");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(strA);
            matcher.getClass();
            fq4 fq4Var = !matcher.matches() ? null : new fq4(matcher, strA);
            if (fq4Var == null) {
                Matcher matcher2 = patternCompile.matcher(str);
                matcher2.getClass();
                fq4Var = !matcher2.matches() ? null : new fq4(matcher2, str);
                if (fq4Var == null) {
                    return new l83(y46.toast_incorrect_protocol);
                }
            }
            XRayConfig.OutboundBean outboundBean7 = serverConfigA.getOutboundBean();
            if (outboundBean7 != null && (settings = outboundBean7.getSettings()) != null && (servers = settings.getServers()) != null && (serversBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers.get(0)) != null) {
                serversBean.g(fm7.z0((String) fq4Var.a().get(3), "[", "]"));
                serversBean.k(Integer.parseInt((String) fq4Var.a().get(4)));
                serversBean.j((String) fq4Var.a().get(2));
                String lowerCase = ((String) fq4Var.a().get(i)).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                serversBean.i(lowerCase);
            }
        }
        ka2Var = new ka2(w27.m0(new hu(new kf3(1, 3, 1), (byte) 1), new zo6(uri, (byte) 6)));
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean2 = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) obj;
        if (finalMaskBean2 != null && (outboundBean = serverConfigA.getOutboundBean()) != null && (streamSettings = outboundBean.getStreamSettings()) != null) {
            streamSettings.o(finalMaskBean2);
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
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG != null && (streamSettings = outboundBeanG.getStreamSettings()) != null) {
            String str = outboundBeanG.f() + ":" + outboundBeanG.d();
            ss8 ss8Var = ss8.a;
            String strG = outboundBeanG.g();
            if (strG != null) {
                String strM = ss8.m(strG);
                Integer numH = outboundBeanG.h();
                Uri.Builder builder = new Uri.Builder();
                EConfigType eConfigType = EConfigType.SHADOWSOCKS;
                Uri.Builder builderEncodedAuthority = builder.scheme(eConfigType.getProtocolScheme()).encodedAuthority(str + "@" + strM + ":" + numH);
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask = streamSettings.getFinalMask();
                if (finalMask != null) {
                    builderEncodedAuthority.appendQueryParameter("fm", yw2.c.h(finalMask));
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

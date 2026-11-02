package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.a;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.VmessQRCode;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class o47 extends i47 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:103:0x0267  */
    /* JADX WARN: Code duplicated, block: B:107:0x0292  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0303  */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170 A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:50:0x010f, B:61:0x0126, B:65:0x0162, B:67:0x0170, B:68:0x0176, B:70:0x018e, B:71:0x0191, B:73:0x019b, B:74:0x019e, B:76:0x01a9, B:78:0x01bd, B:80:0x01c7, B:81:0x01ca, B:84:0x01d1, B:85:0x0201, B:86:0x0202, B:87:0x020b), top: B:193:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018e A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:50:0x010f, B:61:0x0126, B:65:0x0162, B:67:0x0170, B:68:0x0176, B:70:0x018e, B:71:0x0191, B:73:0x019b, B:74:0x019e, B:76:0x01a9, B:78:0x01bd, B:80:0x01c7, B:81:0x01ca, B:84:0x01d1, B:85:0x0201, B:86:0x0202, B:87:0x020b), top: B:193:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x019b A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:50:0x010f, B:61:0x0126, B:65:0x0162, B:67:0x0170, B:68:0x0176, B:70:0x018e, B:71:0x0191, B:73:0x019b, B:74:0x019e, B:76:0x01a9, B:78:0x01bd, B:80:0x01c7, B:81:0x01ca, B:84:0x01d1, B:85:0x0201, B:86:0x0202, B:87:0x020b), top: B:193:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9 A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:50:0x010f, B:61:0x0126, B:65:0x0162, B:67:0x0170, B:68:0x0176, B:70:0x018e, B:71:0x0191, B:73:0x019b, B:74:0x019e, B:76:0x01a9, B:78:0x01bd, B:80:0x01c7, B:81:0x01ca, B:84:0x01d1, B:85:0x0201, B:86:0x0202, B:87:0x020b), top: B:193:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01bd A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:50:0x010f, B:61:0x0126, B:65:0x0162, B:67:0x0170, B:68:0x0176, B:70:0x018e, B:71:0x0191, B:73:0x019b, B:74:0x019e, B:76:0x01a9, B:78:0x01bd, B:80:0x01c7, B:81:0x01ca, B:84:0x01d1, B:85:0x0201, B:86:0x0202, B:87:0x020b), top: B:193:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7 A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:50:0x010f, B:61:0x0126, B:65:0x0162, B:67:0x0170, B:68:0x0176, B:70:0x018e, B:71:0x0191, B:73:0x019b, B:74:0x019e, B:76:0x01a9, B:78:0x01bd, B:80:0x01c7, B:81:0x01ca, B:84:0x01d1, B:85:0x0201, B:86:0x0202, B:87:0x020b), top: B:193:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0220  */
    /* JADX WARN: Code duplicated, block: B:97:0x022a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0249  */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x02d3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x022a, please report this as an issue */
    @Override // defpackage.i47
    public final x83 b(String str) throws Throwable {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        int i;
        dn8 rj6Var;
        boolean z;
        String strA;
        VmessQRCode vmessQRCode;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        String strW;
        int iM0;
        int i2;
        List listE0;
        List listE1;
        List listE2;
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.OutSettingsBean settings;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings4;
        String str2;
        String str3;
        String strC;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings5;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings6;
        String strC2;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings7;
        String str4;
        str.getClass();
        ServerConfig.Companion companion = ServerConfig.INSTANCE;
        EConfigType eConfigType = EConfigType.VMESS;
        companion.getClass();
        ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
        XRayConfig.OutboundBean outboundBean2 = serverConfigA.getOutboundBean();
        if (outboundBean2 == null || (streamSettings = outboundBean2.getStreamSettings()) == null) {
            return new q83("vmess");
        }
        try {
            Uri uri = Uri.parse(str);
            try {
                if (!dh3.f(uri.getScheme(), "vmess")) {
                    throw new IllegalStateException("Check failed.");
                }
                Pattern patternCompile = Pattern.compile("(tcp|ws|kcp|grpc)(\\+tls)?:([0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12})");
                patternCompile.getClass();
                String userInfo = uri.getUserInfo();
                if (userInfo == null) {
                    userInfo = "";
                }
                Matcher matcher = patternCompile.matcher(userInfo);
                matcher.getClass();
                fq4 fq4Var = !matcher.matches() ? null : new fq4(matcher, userInfo);
                if (fq4Var == null) {
                    throw new IllegalStateException(("parse user info fail: RAW: " + str + "; URI: " + uri + "; USER: " + uri.getUserInfo() + ";").toString());
                }
                dq4 dq4VarA = fq4Var.a();
                String str5 = (String) dq4VarA.get(1);
                String str6 = (String) dq4VarA.get(2);
                String str7 = (String) dq4VarA.get(3);
                boolean zO0 = fm7.o0(str6);
                XRayConfig.OutboundBean outboundBean3 = serverConfigA.getOutboundBean();
                if (outboundBean3 == null || (streamSettings4 = outboundBean3.getStreamSettings()) == null) {
                    i = 1;
                    z = false;
                } else {
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
                        settings2.m(x79.b(uri));
                        settings2.s(Integer.valueOf(uri.getPort()));
                        settings2.q(str7);
                        settings2.v("auto");
                    }
                    XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings = streamSettings4.getTlsSettings();
                    String fingerprint = tlsSettings != null ? tlsSettings.getFingerprint() : null;
                    String strC3 = rp7.c(uri, "type", 0, 6);
                    String strC4 = rp7.c(uri, MetaParams.HOST, 0, 6);
                    String str8 = (strC4 == null || (str4 = (String) fm7.F0(strC4, new String[]{"|"}, 6).get(0)) == null) ? "" : str4;
                    String strC5 = rp7.c(uri, "path", 0, 6);
                    if (strC5 != null) {
                        i = 1;
                        if (dh3.f(fm7.R0(strC5).toString(), "/")) {
                            strC5 = null;
                        }
                        if (strC5 != null) {
                            str2 = strC5;
                        }
                        String strN = XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettings4, str5, strC3, str8, str2, rp7.c(uri, "seed", 0, 6), rp7.c(uri, "mode", 0, 6), rp7.c(uri, "serviceName", 0, 6), rp7.c(uri, "authority", 0, 6), null, null, null, null, null, null, null, null, null, null, 261888);
                        if (zO0) {
                            str3 = "";
                        } else {
                            str3 = XRayConfig.TLS;
                        }
                        String strC6 = rp7.c(uri, "pcs", 0, 6);
                        strC = rp7.c(uri, "pcn", 0, 6);
                        if (strC == null) {
                            strC = rp7.c(uri, "vcn", 0, 6);
                        }
                        strN.getClass();
                        cb8.a(streamSettings4, str3, strN, fingerprint, strC6, strC, null, null, null, null, null, null);
                        streamSettings5 = serverConfigA.getOutboundBean().getStreamSettings();
                        if (streamSettings5 != null) {
                            i47.d(streamSettings5, uri);
                        }
                        streamSettings6 = serverConfigA.getOutboundBean().getStreamSettings();
                        if (streamSettings6 != null) {
                            i47.e(streamSettings6, uri);
                        }
                        i47.c(serverConfigA, uri);
                        strC2 = rp7.c(uri, "fm", 0, 6);
                        if (strC2 != null) {
                            a aVar = yw2.c;
                            aVar.getClass();
                            finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) aVar.c(strC2, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                            if (finalMaskBean != null) {
                                streamSettings7 = serverConfigA.getOutboundBean().getStreamSettings();
                                if (streamSettings7 != null) {
                                    streamSettings7.o(finalMaskBean);
                                }
                                rj6Var = dn8.a;
                            } else {
                                rj6Var = null;
                            }
                        } else {
                            rj6Var = null;
                        }
                        z = !(rj6Var instanceof rj6);
                    } else {
                        i = 1;
                    }
                    str2 = "";
                    String strN2 = XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettings4, str5, strC3, str8, str2, rp7.c(uri, "seed", 0, 6), rp7.c(uri, "mode", 0, 6), rp7.c(uri, "serviceName", 0, 6), rp7.c(uri, "authority", 0, 6), null, null, null, null, null, null, null, null, null, null, 261888);
                    if (zO0) {
                        str3 = XRayConfig.TLS;
                    } else {
                        str3 = "";
                    }
                    String strC7 = rp7.c(uri, "pcs", 0, 6);
                    strC = rp7.c(uri, "pcn", 0, 6);
                    if (strC == null) {
                        strC = rp7.c(uri, "vcn", 0, 6);
                    }
                    strN2.getClass();
                    cb8.a(streamSettings4, str3, strN2, fingerprint, strC7, strC, null, null, null, null, null, null);
                    streamSettings5 = serverConfigA.getOutboundBean().getStreamSettings();
                    if (streamSettings5 != null) {
                        i47.d(streamSettings5, uri);
                    }
                    streamSettings6 = serverConfigA.getOutboundBean().getStreamSettings();
                    if (streamSettings6 != null) {
                        i47.e(streamSettings6, uri);
                    }
                    i47.c(serverConfigA, uri);
                    strC2 = rp7.c(uri, "fm", 0, 6);
                    if (strC2 != null) {
                        a aVar2 = yw2.c;
                        aVar2.getClass();
                        finalMaskBean = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) aVar2.c(strC2, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                        if (finalMaskBean != null) {
                            streamSettings7 = serverConfigA.getOutboundBean().getStreamSettings();
                            if (streamSettings7 != null) {
                                streamSettings7.o(finalMaskBean);
                            }
                            rj6Var = dn8.a;
                        } else {
                            rj6Var = null;
                        }
                    } else {
                        rj6Var = null;
                    }
                    z = !(rj6Var instanceof rj6);
                }
                if (!z) {
                    if (fm7.m0(str, "?", 0, false, 6) <= 0) {
                        strW = mm7.W(str, EConfigType.VMESS.getProtocolScheme() + "://", "", false);
                        iM0 = fm7.m0(strW, "?", 0, false, 6);
                        if (iM0 > 0) {
                            strW = fm7.Q0(iM0, strW);
                        }
                        ss8 ss8Var = ss8.a;
                        String strA2 = ss8.a(strW);
                        i2 = i;
                        char[] cArr = new char[i2];
                        cArr[0] = '@';
                        listE0 = fm7.E0(strA2, cArr);
                        if (listE0.size() == 2) {
                            CharSequence charSequence = (CharSequence) listE0.get(0);
                            char[] cArr2 = new char[i2];
                            cArr2[0] = ':';
                            listE1 = fm7.E0(charSequence, cArr2);
                            CharSequence charSequence2 = (CharSequence) listE0.get(i2);
                            char[] cArr3 = new char[i2];
                            cArr3[0] = ':';
                            listE2 = fm7.E0(charSequence2, cArr3);
                            if (listE1.size() == 2) {
                                serverConfigA.m("Alien");
                                outboundBean = serverConfigA.getOutboundBean();
                                if (outboundBean != null && (settings = outboundBean.getSettings()) != null) {
                                    settings.m(listE2.get(0));
                                    String str9 = (String) listE2.get(1);
                                    str9.getClass();
                                    settings.s(Integer.valueOf(ss8.C(0, str9)));
                                    settings.q((String) listE1.get(1));
                                    settings.v((String) listE1.get(0));
                                }
                            }
                        }
                        return new q83("vmess");
                    }
                    int i3 = i;
                    String strW2 = mm7.W(str, EConfigType.VMESS.getProtocolScheme() + "://", "", false);
                    ss8 ss8Var2 = ss8.a;
                    strA = ss8.a(strW2);
                    if (TextUtils.isEmpty(strA)) {
                        return new l83(y46.toast_decoding_failed);
                    }
                    a aVar3 = yw2.b;
                    aVar3.getClass();
                    vmessQRCode = (VmessQRCode) aVar3.c(strA, new yi8(VmessQRCode.class));
                    if (!TextUtils.isEmpty(vmessQRCode.getAdd()) || TextUtils.isEmpty(vmessQRCode.getPort()) || TextUtils.isEmpty(vmessQRCode.getId()) || TextUtils.isEmpty(vmessQRCode.getNet())) {
                        return new q83("vmess");
                    }
                    serverConfigA.m(vmessQRCode.getPs());
                    XRayConfig.OutboundBean.OutSettingsBean settings3 = serverConfigA.getOutboundBean().getSettings();
                    if (settings3 != null) {
                        settings3.m(vmessQRCode.getAdd());
                        String port = vmessQRCode.getPort();
                        port.getClass();
                        settings3.s(Integer.valueOf(ss8.C(0, port)));
                        settings3.q(vmessQRCode.getId());
                        settings3.v(TextUtils.isEmpty(vmessQRCode.getScy()) ? "auto" : vmessQRCode.getScy());
                    }
                    String strN3 = XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettings, vmessQRCode.getNet(), vmessQRCode.getType(), vmessQRCode.getHost(), vmessQRCode.getPath(), vmessQRCode.getPath(), vmessQRCode.getType(), vmessQRCode.getPath(), vmessQRCode.getHost(), null, null, null, null, null, null, null, null, null, null, 261888);
                    String fp = vmessQRCode.getFp();
                    String sni = strN3;
                    String tls = vmessQRCode.getTls();
                    if (!TextUtils.isEmpty(vmessQRCode.getSni())) {
                        sni = vmessQRCode.getSni();
                    }
                    String alpn = vmessQRCode.getAlpn();
                    String pcs = vmessQRCode.getPcs();
                    String pcn = vmessQRCode.getPcn();
                    if (pcn == null) {
                        pcn = vmessQRCode.getVcn();
                    }
                    tls.getClass();
                    sni.getClass();
                    cb8.a(streamSettings, tls, sni, fp, pcs, pcn, alpn, null, null, null, null, null);
                    String fragment = vmessQRCode.getFragment();
                    if (fragment != null) {
                        XRayConfig.OutboundBean.StreamSettingsBean streamSettings8 = serverConfigA.getOutboundBean().getStreamSettings();
                        if ((streamSettings8 != null ? streamSettings8.getFinalMask() : null) == null && (streamSettings3 = serverConfigA.getOutboundBean().getStreamSettings()) != null) {
                            streamSettings3.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
                        }
                        List listF0 = fm7.F0(fragment, new String[]{","}, 6);
                        XRayConfig.OutboundBean.StreamSettingsBean streamSettings9 = serverConfigA.getOutboundBean().getStreamSettings();
                        if (streamSettings9 != null && (finalMask2 = streamSettings9.getFinalMask()) != null) {
                            String str10 = (String) listF0.get(0);
                            String str11 = (String) listF0.get(i3);
                            String str12 = (String) listF0.get(2);
                            String str13 = (String) wv0.u0(3, listF0);
                            if (str13 == null) {
                                str13 = "100-200";
                            }
                            finalMask2.e(i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean(XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.c(str13, str11, str10, str12))));
                        }
                    }
                    String noises = vmessQRCode.getNoises();
                    if (noises != null) {
                        XRayConfig.OutboundBean.StreamSettingsBean streamSettings10 = serverConfigA.getOutboundBean().getStreamSettings();
                        if ((streamSettings10 != null ? streamSettings10.getFinalMask() : null) == null && (streamSettings2 = serverConfigA.getOutboundBean().getStreamSettings()) != null) {
                            streamSettings2.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
                        }
                        List listF1 = fm7.F0(noises, new String[]{","}, 6);
                        XRayConfig.OutboundBean.StreamSettingsBean streamSettings11 = serverConfigA.getOutboundBean().getStreamSettings();
                        if (streamSettings11 != null && (finalMask = streamSettings11.getFinalMask()) != null) {
                            finalMask.f(i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean(XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, i21.K(new XRayConfig.OutboundBean.OutSettingsBean.NoisesBean(17, (String) wv0.u0(0, listF1), (String) wv0.u0(i3, listF1), (String) wv0.u0(2, listF1))), null, null, 495), i3)));
                        }
                    }
                    String advancedFragment = vmessQRCode.getAdvancedFragment();
                    if (advancedFragment != null) {
                        serverConfigA.j(ss8.a(advancedFragment));
                    }
                    String serverDescription = vmessQRCode.getServerDescription();
                    if (serverDescription != null) {
                        serverConfigA.l(serverConfigA.getMeta() != null ? new ServerConfig.Meta(serverDescription) : new ServerConfig.Meta(serverDescription));
                    }
                    return new j83(serverConfigA);
                }
                return new q83("vmess");
            } catch (Throwable th) {
                th = th;
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 1;
        }
        if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
            throw th;
        }
        rj6Var = new rj6(th);
        z = !(rj6Var instanceof rj6);
        if (!z) {
            if (fm7.m0(str, "?", 0, false, 6) <= 0) {
                int i4 = i;
                String strW3 = mm7.W(str, EConfigType.VMESS.getProtocolScheme() + "://", "", false);
                ss8 ss8Var3 = ss8.a;
                strA = ss8.a(strW3);
                if (TextUtils.isEmpty(strA)) {
                    return new l83(y46.toast_decoding_failed);
                }
                a aVar4 = yw2.b;
                aVar4.getClass();
                vmessQRCode = (VmessQRCode) aVar4.c(strA, new yi8(VmessQRCode.class));
                if (TextUtils.isEmpty(vmessQRCode.getAdd())) {
                }
                return new q83("vmess");
            }
            strW = mm7.W(str, EConfigType.VMESS.getProtocolScheme() + "://", "", false);
            iM0 = fm7.m0(strW, "?", 0, false, 6);
            if (iM0 > 0) {
                strW = fm7.Q0(iM0, strW);
            }
            ss8 ss8Var4 = ss8.a;
            String strA3 = ss8.a(strW);
            i2 = i;
            char[] cArr4 = new char[i2];
            cArr4[0] = '@';
            listE0 = fm7.E0(strA3, cArr4);
            if (listE0.size() == 2) {
                CharSequence charSequence3 = (CharSequence) listE0.get(0);
                char[] cArr5 = new char[i2];
                cArr5[0] = ':';
                listE1 = fm7.E0(charSequence3, cArr5);
                CharSequence charSequence4 = (CharSequence) listE0.get(i2);
                char[] cArr6 = new char[i2];
                cArr6[0] = ':';
                listE2 = fm7.E0(charSequence4, cArr6);
                if (listE1.size() == 2) {
                    serverConfigA.m("Alien");
                    outboundBean = serverConfigA.getOutboundBean();
                    if (outboundBean != null) {
                        settings.m(listE2.get(0));
                        String str14 = (String) listE2.get(1);
                        str14.getClass();
                        settings.s(Integer.valueOf(ss8.C(0, str14)));
                        settings.q((String) listE1.get(1));
                        settings.v((String) listE1.get(0));
                    }
                }
            }
            return new q83("vmess");
        }
        return new q83("vmess");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i47
    public final String g(ServerConfig serverConfig) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        String security;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        String rj6Var;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2;
        XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean udpMasksBean;
        Map settings;
        List listB;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask3;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean tcpMasksBean;
        List alpn;
        List vnext;
        XRayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean;
        List users;
        XRayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG == null || (streamSettings = outboundBeanG.getStreamSettings()) == null) {
            return "";
        }
        VmessQRCode vmessQRCode = new VmessQRCode(0);
        vmessQRCode.P();
        vmessQRCode.J(serverConfig.getRemarks());
        ServerConfig.Meta meta = serverConfig.getMeta();
        XRayConfig.OutboundBean.OutSettingsBean.NoisesBean noisesBean = null;
        vmessQRCode.L(meta != null ? meta.getServerDescription() : null);
        String strG = outboundBeanG.g();
        if (strG == null) {
            strG = "";
        }
        vmessQRCode.u(strG);
        vmessQRCode.I(String.valueOf(outboundBeanG.h()));
        String strD = outboundBeanG.d();
        if (strD == null) {
            strD = "";
        }
        vmessQRCode.C(strD);
        vmessQRCode.w();
        XRayConfig.OutboundBean.OutSettingsBean settings2 = outboundBeanG.getSettings();
        if (settings2 == null || (vnext = settings2.getVnext()) == null || (vnextBean = (XRayConfig.OutboundBean.OutSettingsBean.VnextBean) vnext.get(0)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (XRayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean) users.get(0)) == null || (security = usersBean.getSecurity()) == null) {
            XRayConfig.OutboundBean.OutSettingsBean settings3 = outboundBeanG.getSettings();
            security = settings3 != null ? settings3.getSecurity() : null;
        }
        vmessQRCode.K(String.valueOf(security));
        vmessQRCode.D(streamSettings.getNetwork());
        vmessQRCode.N(streamSettings.getSecurity());
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings = streamSettings.getTlsSettings();
        String serverName = tlsSettings != null ? tlsSettings.getServerName() : null;
        if (serverName == null) {
            serverName = "";
        }
        vmessQRCode.M(serverName);
        ss8 ss8Var = ss8.a;
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings2 = streamSettings.getTlsSettings();
        String strY0 = (tlsSettings2 == null || (alpn = tlsSettings2.getAlpn()) == null) ? null : wv0.y0(alpn, (CharSequence) null, (String) null, (String) null, (gn2) null, 63);
        String strW = strY0 != null ? mm7.W(strY0, " ", "", false) : null;
        if (strW == null) {
            strW = "";
        }
        vmessQRCode.x(strW);
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings3 = streamSettings.getTlsSettings();
        String fingerprint = tlsSettings3 != null ? tlsSettings3.getFingerprint() : null;
        vmessQRCode.z(fingerprint != null ? fingerprint : "");
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings4 = streamSettings.getTlsSettings();
        vmessQRCode.H(tlsSettings4 != null ? tlsSettings4.getPinnedPeerCertSha256() : null);
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings5 = streamSettings.getTlsSettings();
        vmessQRCode.G(tlsSettings5 != null ? tlsSettings5.getVerifyPeerCertByName() : null);
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2 = outboundBeanG.getStreamSettings();
        if (streamSettings2 != null && (finalMask3 = streamSettings2.getFinalMask()) != null) {
            List tcp = finalMask3.getTcp();
            Map settings4 = (tcp == null || (tcpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean) wv0.t0(tcp)) == null) ? null : tcpMasksBean.getSettings();
            if (settings4 != null) {
                vmessQRCode.A(XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.e(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.d(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.k(settings4) + "," + XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.g(settings4));
            }
        }
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3 = outboundBeanG.getStreamSettings();
        if (streamSettings3 != null && (finalMask2 = streamSettings3.getFinalMask()) != null) {
            List udp = finalMask2.getUdp();
            if (udp != null && (udpMasksBean = (XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean) wv0.t0(udp)) != null && (settings = udpMasksBean.getSettings()) != null && (listB = XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.b(settings)) != null) {
                noisesBean = (XRayConfig.OutboundBean.OutSettingsBean.NoisesBean) wv0.t0(listB);
            }
            if (noisesBean != null) {
                vmessQRCode.E(noisesBean.getRand() + "," + noisesBean.getRandRange() + "," + noisesBean.getDelay());
            }
        }
        String advancedFragment = serverConfig.getAdvancedFragment();
        if (advancedFragment != null) {
            vmessQRCode.v(ss8.b(advancedFragment));
        }
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBeanG.getStreamSettings();
        if (streamSettings4 != null && (finalMask = streamSettings4.getFinalMask()) != null) {
            String strH = yw2.c.h(finalMask);
            try {
                rj6Var = URLEncoder.encode(strH, "UTF-8");
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (!(rj6Var instanceof rj6)) {
                strH = rj6Var;
            }
            vmessQRCode.y(strH);
        }
        List listL = outboundBeanG.l();
        if (listL != null) {
            vmessQRCode.O((String) listL.get(0));
            vmessQRCode.B((String) listL.get(1));
            vmessQRCode.F((String) listL.get(2));
        }
        String strH2 = yw2.b.h(vmessQRCode);
        ss8 ss8Var2 = ss8.a;
        return ss8.b(strH2);
    }
}

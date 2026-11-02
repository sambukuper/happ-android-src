package defpackage;

import android.content.Intent;
import com.tencent.mmkv.MMKV;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import okhttp3.HttpUrl;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.dto.enums.FragmentationPackets;
import su.happ.proxyutility.dto.enums.FragmentationType;
import su.happ.proxyutility.dto.enums.GeoUserAgent;
import su.happ.proxyutility.dto.enums.GoPingType;
import su.happ.proxyutility.dto.enums.MuxQuicType;
import su.happ.proxyutility.dto.enums.NoisesPacketType;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ek7 {
    public final vz7 a = new vz7(new r47((byte) 16));
    public final vz7 b = new vz7(new r47((byte) 17));
    public final vz7 c = new vz7(new r47((byte) 18));
    public final vz7 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ek7() {
        new vz7(new r47((byte) 19));
        this.d = new vz7(new r47((byte) 20));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV a() {
        return (MMKV) this.a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zt7 b() {
        return (zt7) this.c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:154:0x0376  */
    /* JADX WARN: Code duplicated, block: B:157:0x0399  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03df  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0405  */
    /* JADX WARN: Code duplicated, block: B:173:0x0418  */
    /* JADX WARN: Code duplicated, block: B:176:0x042b  */
    /* JADX WARN: Code duplicated, block: B:179:0x043e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0453  */
    /* JADX WARN: Code duplicated, block: B:185:0x0462  */
    /* JADX WARN: Code duplicated, block: B:188:0x0472 A[Catch: all -> 0x0482, LOOP:0: B:188:0x0472->B:292:?, LOOP_START, TryCatch #0 {all -> 0x0482, blocks: (B:186:0x046a, B:188:0x0472, B:196:0x0495, B:193:0x0484, B:194:0x0488), top: B:283:0x046a }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0484 A[Catch: all -> 0x0482, TryCatch #0 {all -> 0x0482, blocks: (B:186:0x046a, B:188:0x0472, B:196:0x0495, B:193:0x0484, B:194:0x0488), top: B:283:0x046a }] */
    /* JADX WARN: Code duplicated, block: B:205:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:209:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:212:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:216:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:219:0x0500 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x0502 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x0504  */
    /* JADX WARN: Code duplicated, block: B:222:0x0506  */
    /* JADX WARN: Code duplicated, block: B:223:0x0508 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:225:0x050b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x051d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0525 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0527 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0529  */
    /* JADX WARN: Code duplicated, block: B:234:0x052b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x052e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0534  */
    /* JADX WARN: Code duplicated, block: B:241:0x0543  */
    /* JADX WARN: Code duplicated, block: B:244:0x0556  */
    /* JADX WARN: Code duplicated, block: B:247:0x0569  */
    /* JADX WARN: Code duplicated, block: B:250:0x057c  */
    /* JADX WARN: Code duplicated, block: B:253:0x058f  */
    /* JADX WARN: Code duplicated, block: B:256:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:259:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:262:0x05d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:279:0x062b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(String str, MetaParams metaParams, s51 s51Var) {
        ck7 ck7Var;
        MetaParams metaParams2;
        String str2;
        List list;
        HttpUrl rj6Var;
        List perAppProxyListInvert;
        String str3;
        List perAppProxyListSet;
        Boolean muxEnable;
        Integer muxTcpConnections;
        Integer muxXudpConnections;
        MuxQuicType muxQuic;
        Boolean sniffingEnable;
        vn5 pingResult;
        String excludeRoutes;
        vz7 vz7Var;
        String excludeRoutesSet;
        Boolean dnsFromJsonEnable;
        GeoUserAgent userAgentGeoFiles;
        vz7 vz7Var2;
        String string;
        Boolean subscriptionPin;
        Boolean bool;
        boolean zEquals;
        Boolean inboundHttpEnable;
        Boolean xrayTunEnable;
        Integer xrayTunMtu;
        Boolean blockBindToTunnelEnable;
        GoPingType proxyPingMode;
        Integer proxyPingTimeout;
        Boolean reset;
        String originUrl;
        SubscriptionItem subscriptionItemF;
        boolean zEquals2;
        oh7 oh7Var;
        sj6 rj6Var2;
        Set setC;
        Object value;
        Object value2;
        if (s51Var instanceof ck7) {
            ck7Var = (ck7) s51Var;
            int i = ck7Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck7Var.k0 = i - Integer.MIN_VALUE;
            } else {
                ck7Var = new ck7(this, s51Var);
            }
        } else {
            ck7Var = new ck7(this, s51Var);
        }
        Object objW = ck7Var.i0;
        int i2 = ck7Var.k0;
        SubscriptionItem subscriptionItemF2 = null;
        c71 c71Var = c71.X;
        if (i2 != 0) {
            if (i2 == 1) {
                list = ck7Var.h0;
                metaParams2 = ck7Var.g0;
                str2 = ck7Var.f0;
                w39.n0(objW);
            } else {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                perAppProxyListInvert = ck7Var.h0;
                metaParams2 = ck7Var.g0;
                str3 = ck7Var.f0;
                w39.n0(objW);
            }
            Set setO0 = w27.o0(w27.l0(wv0.l0((Iterable) objW), dk7.X));
            Set setC1 = wv0.c1(perAppProxyListInvert);
            vz7 vz7Var3 = x06.a;
            ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", q57.Y(setO0, setC1));
            str2 = str3;
            perAppProxyListSet = metaParams2.getPerAppProxyListSet();
            if (perAppProxyListSet != null) {
                vz7 vz7Var4 = x06.a;
                ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", wv0.c1(perAppProxyListSet));
            }
            muxEnable = metaParams2.getMuxEnable();
            if (muxEnable != null) {
                a().p("pref_mux_enabled", muxEnable.booleanValue());
            }
            muxTcpConnections = metaParams2.getMuxTcpConnections();
            if (muxTcpConnections != null) {
                a().l(muxTcpConnections.intValue(), "pref_mux_concurency");
            }
            muxXudpConnections = metaParams2.getMuxXudpConnections();
            if (muxXudpConnections != null) {
                a().l(muxXudpConnections.intValue(), "pref_mux_xudp_concurency");
            }
            muxQuic = metaParams2.getMuxQuic();
            if (muxQuic != null) {
                a().q("pref_mux_xudp_quic", muxQuic.getTitle());
            }
            sniffingEnable = metaParams2.getSniffingEnable();
            if (sniffingEnable != null) {
                a().p("pref_sniffing_enabled", sniffingEnable.booleanValue());
            }
            pingResult = metaParams2.getPingResult();
            if (pingResult != null) {
                a().l(pingResult.ordinal(), "pref_ping_result");
            }
            excludeRoutes = metaParams2.getExcludeRoutes();
            vz7Var = this.b;
            if (excludeRoutes != null) {
                ((u42) vz7Var.getValue()).a(excludeRoutes, null, null);
            }
            excludeRoutesSet = metaParams2.getExcludeRoutesSet();
            if (excludeRoutesSet != null) {
                u42 u42Var = (u42) vz7Var.getValue();
                oh7Var = u42Var.b;
                try {
                    if (excludeRoutesSet.equalsIgnoreCase("reset")) {
                        do {
                            value2 = oh7Var.getValue();
                        } while (!oh7Var.k(value2, m02.X));
                    } else {
                        setC = u42.c(excludeRoutesSet);
                        do {
                            value = oh7Var.getValue();
                        } while (!oh7Var.k(value, setC));
                    }
                    rj6Var2 = new sj6(u42Var.d());
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var2 = new rj6(th);
                }
                if (sj6.a(rj6Var2) == null) {
                }
            }
            dnsFromJsonEnable = metaParams2.getDnsFromJsonEnable();
            if (dnsFromJsonEnable != null) {
                a().p("pref_dns_from_json", dnsFromJsonEnable.booleanValue());
            }
            userAgentGeoFiles = metaParams2.getUserAgentGeoFiles();
            if (userAgentGeoFiles != null) {
                a().l(userAgentGeoFiles.ordinal(), "pref_geo_custom_ua");
            }
            vz7Var2 = this.d;
            ak7 ak7Var = (ak7) vz7Var2.getValue();
            ak7Var.getClass();
            string = ak7Var.a.getString("pinSubIdInStorage", null);
            if (string == null) {
                string = null;
            }
            subscriptionPin = metaParams2.getSubscriptionPin();
            bool = Boolean.TRUE;
            zEquals = false;
            if (dh3.f(subscriptionPin, bool)) {
                if (string == null) {
                    if (str2 == null) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                } else if (str2 == null) {
                    zEquals2 = false;
                } else {
                    zEquals2 = string.equals(str2);
                }
                if (zEquals2 && str2 != null) {
                    ((ak7) vz7Var2.getValue()).d("pinSubIdInStorage", str2);
                } else if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                    if (string == null) {
                        if (str2 == null) {
                            zEquals = true;
                        }
                    } else if (str2 != null) {
                        zEquals = string.equals(str2);
                    }
                    if (zEquals) {
                        ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                    }
                }
            } else if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                if (string == null) {
                    if (str2 == null) {
                        zEquals = true;
                    }
                } else if (str2 != null) {
                    zEquals = string.equals(str2);
                }
                if (zEquals) {
                    ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                }
            }
            inboundHttpEnable = metaParams2.getInboundHttpEnable();
            if (inboundHttpEnable != null) {
                a().p("pref_http_auth_enabled", inboundHttpEnable.booleanValue());
            }
            xrayTunEnable = metaParams2.getXrayTunEnable();
            if (xrayTunEnable != null) {
                a().p("pref_xray_tun_enabled", xrayTunEnable.booleanValue());
            }
            xrayTunMtu = metaParams2.getXrayTunMtu();
            if (xrayTunMtu != null) {
                a().l(xrayTunMtu.intValue(), "pref_tun_mtu");
            }
            blockBindToTunnelEnable = metaParams2.getBlockBindToTunnelEnable();
            if (blockBindToTunnelEnable != null) {
                a().p("pref_block_bindtodevice_enabled", blockBindToTunnelEnable.booleanValue());
            }
            proxyPingMode = metaParams2.getProxyPingMode();
            if (proxyPingMode != null) {
                a().l(proxyPingMode.ordinal(), "pref_ping_mode");
            }
            proxyPingTimeout = metaParams2.getProxyPingTimeout();
            if (proxyPingTimeout != null) {
                a().l(proxyPingTimeout.intValue(), "pref_proxy_ping_timeout");
            }
            reset = metaParams2.getReset();
            if (str2 != null) {
                kw4 kw4Var = kw4.a;
                subscriptionItemF2 = kw4.f(str2);
            }
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new gq6(reset, subscriptionItemF2, (byte) 6));
            if (dh3.f(reset, bool) && subscriptionItemF2 != null && !subscriptionItemF2.getResetHandled()) {
                HappApplication happApplicationI = k32.i();
                originUrl = subscriptionItemF2.getOriginUrl();
                if (originUrl == null) {
                    originUrl = "";
                }
                String strW = mm7.W(mm7.W(mm7.W(mm7.W(originUrl, "reset=1&", "", true), "reset=true&", "", true), "reset=1", "", true), "reset=true", "", true);
                try {
                    Intent intent = new Intent();
                    intent.setAction("su.happ.proxyutility.action.activity");
                    intent.setPackage("su.happ.proxyutility");
                    intent.putExtra("key", 131);
                    intent.putExtra("content", (Serializable) strW);
                    happApplicationI.sendBroadcast(intent);
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                }
                kw4 kw4Var2 = kw4.a;
                subscriptionItemF = kw4.f(str2);
                if (subscriptionItemF != null) {
                    kw4.u(SubscriptionItem.d(subscriptionItemF, 0L, false, null, false, null, 134217727), str2);
                }
            }
            return dn8.a;
        }
        w39.n0(objW);
        Boolean fragmentationEnable = metaParams.getFragmentationEnable();
        if (fragmentationEnable != null) {
            a().p("pref_fragment_enabled", fragmentationEnable.booleanValue());
        }
        FragmentationPackets fragmentationPackets = metaParams.getFragmentationPackets();
        if (fragmentationPackets != null) {
            a().q("pref_fragment_packets", fragmentationPackets.getValue());
        }
        String fragmentationLength = metaParams.getFragmentationLength();
        if (fragmentationLength != null) {
            a().q("pref_fragment_length", fragmentationLength);
        }
        String fragmentationDelay = metaParams.getFragmentationDelay();
        if (fragmentationDelay == null) {
            fragmentationDelay = metaParams.getFragmentationInterval();
        }
        if (fragmentationDelay != null) {
            a().q("pref_fragment_interval", fragmentationDelay);
        }
        FragmentationType fragmentationType = metaParams.getFragmentationType();
        if (fragmentationType != null) {
            a().q("pref_fragment_type", fragmentationType.getValue());
        }
        String fragmentationAdvancedParam = metaParams.getFragmentationAdvancedParam();
        if (fragmentationAdvancedParam != null) {
            a().q("pref_antifilter_params", fragmentationAdvancedParam);
        }
        String fragmentationMaxSplit = metaParams.getFragmentationMaxSplit();
        if (fragmentationMaxSplit != null) {
            a().q("pref_fragment_max_split", fragmentationMaxSplit);
        }
        Boolean noisesEnable = metaParams.getNoisesEnable();
        if (noisesEnable != null) {
            a().p("pref_noises_enabled", noisesEnable.booleanValue());
        }
        NoisesPacketType noisesPacketType = metaParams.getNoisesPacketType();
        if (noisesPacketType != null) {
            a().q("pref_noises_type", noisesPacketType.getValue());
        }
        String noisesPacket = metaParams.getNoisesPacket();
        if (noisesPacket != null) {
            a().q("pref_noises_packet", noisesPacket);
        }
        String noisesDelay = metaParams.getNoisesDelay();
        if (noisesDelay != null) {
            a().q("pref_noises_delay", noisesDelay);
        }
        String noisesRand = metaParams.getNoisesRand();
        if (noisesRand != null) {
            a().q("pref_noises_rand", noisesRand);
        }
        String noisesRandRange = metaParams.getNoisesRandRange();
        if (noisesRandRange != null) {
            a().q("pref_noises_rand_range", noisesRandRange);
        }
        Boolean localDnsEnable = metaParams.getLocalDnsEnable();
        if (localDnsEnable != null) {
            a().p("pref_local_dns_enabled", localDnsEnable.booleanValue());
        }
        if (str != null) {
            Boolean subscriptionAutoUpdateOpenEnable = metaParams.getSubscriptionAutoUpdateOpenEnable();
            if (subscriptionAutoUpdateOpenEnable != null) {
                b().b(str, new as((byte) 10, subscriptionAutoUpdateOpenEnable.booleanValue()));
            }
            Boolean subscriptionPingOnOpenEnabled = metaParams.getSubscriptionPingOnOpenEnabled();
            if (subscriptionPingOnOpenEnabled != null) {
                b().b(str, new as((byte) 11, subscriptionPingOnOpenEnabled.booleanValue()));
            }
            Boolean subscriptionAutoConnect = metaParams.getSubscriptionAutoConnect();
            if (subscriptionAutoConnect != null) {
                b().b(str, new as((byte) 4, subscriptionAutoConnect.booleanValue()));
            }
            SubscriptionAutoConnectType subscriptionAutoConnectType = metaParams.getSubscriptionAutoConnectType();
            if (subscriptionAutoConnectType != null) {
                b().b(str, new t16(subscriptionAutoConnectType, (byte) 23));
            }
            Boolean subscriptionsCollapse = metaParams.getSubscriptionsCollapse();
            if (subscriptionsCollapse != null) {
                b().b(str, new as((byte) 5, subscriptionsCollapse.booleanValue()));
            }
            Boolean dontUseFilter = metaParams.getDontUseFilter();
            if (dontUseFilter != null) {
                b().b(str, new as((byte) 6, dontUseFilter.booleanValue()));
            }
            Boolean subscriptionSendHwidEnabled = metaParams.getSubscriptionSendHwidEnabled();
            if (subscriptionSendHwidEnabled != null) {
                b().b(str, new as((byte) 7, subscriptionSendHwidEnabled.booleanValue()));
            }
            Boolean subscriptionAlwaysHwidEnable = metaParams.getSubscriptionAlwaysHwidEnable();
            if (subscriptionAlwaysHwidEnable != null) {
                b().b(str, new as((byte) 8, subscriptionAlwaysHwidEnable.booleanValue()));
            }
            Integer subscriptionRequestTimeout = metaParams.getSubscriptionRequestTimeout();
            if (subscriptionRequestTimeout != null) {
                b().b(str, new qb((byte) 8, subscriptionRequestTimeout.intValue()));
            }
            Boolean manualBlockUserAgent = metaParams.getManualBlockUserAgent();
            if (manualBlockUserAgent != null) {
                b().b(str, new as((byte) 9, manualBlockUserAgent.booleanValue()));
            }
            String changeUserAgent = metaParams.getChangeUserAgent();
            if (changeUserAgent != null) {
                b().b(str, new m40(changeUserAgent, (byte) 28));
            }
            SubscriptionSortType subscriptionsSortType = metaParams.getSubscriptionsSortType();
            if (subscriptionsSortType != null) {
                b().b(str, new t16(subscriptionsSortType, (byte) 24));
                if (subscriptionsSortType == SubscriptionSortType.PING) {
                    HappApplication happApplication2 = HappApplication.M0;
                    HappApplication happApplicationI2 = k32.i();
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction("su.happ.proxyutility.action.activity");
                        intent2.setPackage("su.happ.proxyutility");
                        intent2.putExtra("key", 128);
                        intent2.putExtra("content", (Serializable) str);
                        happApplicationI2.sendBroadcast(intent2);
                    } catch (Throwable th3) {
                        if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                            throw th3;
                        }
                    }
                }
            }
        }
        EPingType pingType = metaParams.getPingType();
        if (pingType != null) {
            a().l(pingType.ordinal(), "pref_ping_type");
        }
        String checkUrlViaProxy = metaParams.getCheckUrlViaProxy();
        if (checkUrlViaProxy != null) {
            ss8 ss8Var = ss8.a;
            try {
                rj6Var = HttpUrl.Companion.get(ss8.c(checkUrlViaProxy));
            } catch (Throwable th4) {
                if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                    throw th4;
                }
                rj6Var = new rj6(th4);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = null;
            }
            HttpUrl httpUrl = rj6Var;
            if (httpUrl != null) {
                a().q("pref_delay_test_url", httpUrl.toString());
            }
        }
        Boolean appAutoStart = metaParams.getAppAutoStart();
        if (appAutoStart != null) {
            a().p("pref_auto_start_vpn", appAutoStart.booleanValue());
        }
        Boolean resolveAddressServerEnable = metaParams.getResolveAddressServerEnable();
        if (resolveAddressServerEnable != null) {
            a().p("pref_resolve_server_before_start_enabled", resolveAddressServerEnable.booleanValue());
        }
        String resolveAddressServerDnsIp = metaParams.getResolveAddressServerDnsIp();
        if (resolveAddressServerDnsIp != null) {
            a().q("pref_resolve_server_before_start_dns_ip", resolveAddressServerDnsIp);
        }
        String resolveAddressServerDnsDomain = metaParams.getResolveAddressServerDnsDomain();
        if (resolveAddressServerDnsDomain != null) {
            a().q("pref_resolve_server_before_start_dns_domain", resolveAddressServerDnsDomain);
        }
        jk5 perAppProxyMode = metaParams.getPerAppProxyMode();
        if (perAppProxyMode != null) {
            a().l(perAppProxyMode.ordinal(), "perAppProxyMode");
        }
        List perAppProxyList = metaParams.getPerAppProxyList();
        if (perAppProxyList == null) {
            metaParams2 = metaParams;
            str2 = str;
            perAppProxyListInvert = metaParams2.getPerAppProxyListInvert();
            if (perAppProxyListInvert != null) {
                vz7 vz7Var5 = x06.a;
                HappApplication happApplication3 = HappApplication.M0;
                HappApplication happApplicationI3 = k32.i();
                ck7Var.f0 = str2;
                ck7Var.g0 = metaParams2;
                ck7Var.h0 = perAppProxyListInvert;
                ck7Var.k0 = 2;
                nf1 nf1Var = tp1.a;
                objW = w51.W(ye1.Z, new l40(happApplicationI3, (q51) null, (byte) 10), ck7Var);
                if (objW != c71Var) {
                    str3 = str2;
                    Set setO1 = w27.o0(w27.l0(wv0.l0((Iterable) objW), dk7.X));
                    Set setC2 = wv0.c1(perAppProxyListInvert);
                    vz7 vz7Var6 = x06.a;
                    ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", q57.Y(setO1, setC2));
                    str2 = str3;
                }
            }
            perAppProxyListSet = metaParams2.getPerAppProxyListSet();
            if (perAppProxyListSet != null) {
                vz7 vz7Var7 = x06.a;
                ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", wv0.c1(perAppProxyListSet));
            }
            muxEnable = metaParams2.getMuxEnable();
            if (muxEnable != null) {
                a().p("pref_mux_enabled", muxEnable.booleanValue());
            }
            muxTcpConnections = metaParams2.getMuxTcpConnections();
            if (muxTcpConnections != null) {
                a().l(muxTcpConnections.intValue(), "pref_mux_concurency");
            }
            muxXudpConnections = metaParams2.getMuxXudpConnections();
            if (muxXudpConnections != null) {
                a().l(muxXudpConnections.intValue(), "pref_mux_xudp_concurency");
            }
            muxQuic = metaParams2.getMuxQuic();
            if (muxQuic != null) {
                a().q("pref_mux_xudp_quic", muxQuic.getTitle());
            }
            sniffingEnable = metaParams2.getSniffingEnable();
            if (sniffingEnable != null) {
                a().p("pref_sniffing_enabled", sniffingEnable.booleanValue());
            }
            pingResult = metaParams2.getPingResult();
            if (pingResult != null) {
                a().l(pingResult.ordinal(), "pref_ping_result");
            }
            excludeRoutes = metaParams2.getExcludeRoutes();
            vz7Var = this.b;
            if (excludeRoutes != null) {
                ((u42) vz7Var.getValue()).a(excludeRoutes, null, null);
            }
            excludeRoutesSet = metaParams2.getExcludeRoutesSet();
            if (excludeRoutesSet != null) {
                u42 u42Var2 = (u42) vz7Var.getValue();
                oh7Var = u42Var2.b;
                if (excludeRoutesSet.equalsIgnoreCase("reset")) {
                    do {
                        value2 = oh7Var.getValue();
                    } while (!oh7Var.k(value2, m02.X));
                } else {
                    setC = u42.c(excludeRoutesSet);
                    do {
                        value = oh7Var.getValue();
                    } while (!oh7Var.k(value, setC));
                }
                rj6Var2 = new sj6(u42Var2.d());
                if (sj6.a(rj6Var2) == null) {
                }
            }
            dnsFromJsonEnable = metaParams2.getDnsFromJsonEnable();
            if (dnsFromJsonEnable != null) {
                a().p("pref_dns_from_json", dnsFromJsonEnable.booleanValue());
            }
            userAgentGeoFiles = metaParams2.getUserAgentGeoFiles();
            if (userAgentGeoFiles != null) {
                a().l(userAgentGeoFiles.ordinal(), "pref_geo_custom_ua");
            }
            vz7Var2 = this.d;
            ak7 ak7Var2 = (ak7) vz7Var2.getValue();
            ak7Var2.getClass();
            string = ak7Var2.a.getString("pinSubIdInStorage", null);
            if (string == null) {
                string = null;
            }
            subscriptionPin = metaParams2.getSubscriptionPin();
            bool = Boolean.TRUE;
            zEquals = false;
            if (dh3.f(subscriptionPin, bool)) {
                if (string == null) {
                    if (str2 == null) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                } else if (str2 == null) {
                    zEquals2 = false;
                } else {
                    zEquals2 = string.equals(str2);
                }
                if (zEquals2) {
                    if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                        if (string == null) {
                            if (str2 == null) {
                                zEquals = true;
                            }
                        } else if (str2 != null) {
                            zEquals = string.equals(str2);
                        }
                        if (zEquals) {
                            ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                        }
                    }
                } else if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                    if (string == null) {
                        if (str2 == null) {
                            zEquals = true;
                        }
                    } else if (str2 != null) {
                        zEquals = string.equals(str2);
                    }
                    if (zEquals) {
                        ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                    }
                }
            } else if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                if (string == null) {
                    if (str2 == null) {
                        zEquals = true;
                    }
                } else if (str2 != null) {
                    zEquals = string.equals(str2);
                }
                if (zEquals) {
                    ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                }
            }
            inboundHttpEnable = metaParams2.getInboundHttpEnable();
            if (inboundHttpEnable != null) {
                a().p("pref_http_auth_enabled", inboundHttpEnable.booleanValue());
            }
            xrayTunEnable = metaParams2.getXrayTunEnable();
            if (xrayTunEnable != null) {
                a().p("pref_xray_tun_enabled", xrayTunEnable.booleanValue());
            }
            xrayTunMtu = metaParams2.getXrayTunMtu();
            if (xrayTunMtu != null) {
                a().l(xrayTunMtu.intValue(), "pref_tun_mtu");
            }
            blockBindToTunnelEnable = metaParams2.getBlockBindToTunnelEnable();
            if (blockBindToTunnelEnable != null) {
                a().p("pref_block_bindtodevice_enabled", blockBindToTunnelEnable.booleanValue());
            }
            proxyPingMode = metaParams2.getProxyPingMode();
            if (proxyPingMode != null) {
                a().l(proxyPingMode.ordinal(), "pref_ping_mode");
            }
            proxyPingTimeout = metaParams2.getProxyPingTimeout();
            if (proxyPingTimeout != null) {
                a().l(proxyPingTimeout.intValue(), "pref_proxy_ping_timeout");
            }
            reset = metaParams2.getReset();
            if (str2 != null) {
                kw4 kw4Var3 = kw4.a;
                subscriptionItemF2 = kw4.f(str2);
            }
            HappApplication happApplication4 = HappApplication.M0;
            k32.i().d().h(new gq6(reset, subscriptionItemF2, (byte) 6));
            if (dh3.f(reset, bool)) {
                HappApplication happApplicationI4 = k32.i();
                originUrl = subscriptionItemF2.getOriginUrl();
                if (originUrl == null) {
                    originUrl = "";
                }
                String strW2 = mm7.W(mm7.W(mm7.W(mm7.W(originUrl, "reset=1&", "", true), "reset=true&", "", true), "reset=1", "", true), "reset=true", "", true);
                Intent intent3 = new Intent();
                intent3.setAction("su.happ.proxyutility.action.activity");
                intent3.setPackage("su.happ.proxyutility");
                intent3.putExtra("key", 131);
                intent3.putExtra("content", (Serializable) strW2);
                happApplicationI4.sendBroadcast(intent3);
                kw4 kw4Var4 = kw4.a;
                subscriptionItemF = kw4.f(str2);
                if (subscriptionItemF != null) {
                    kw4.u(SubscriptionItem.d(subscriptionItemF, 0L, false, null, false, null, 134217727), str2);
                }
            }
            return dn8.a;
        }
        vz7 vz7Var8 = x06.a;
        ck7Var.f0 = str;
        metaParams2 = metaParams;
        ck7Var.g0 = metaParams2;
        ck7Var.h0 = perAppProxyList;
        ck7Var.k0 = 1;
        nf1 nf1Var2 = tp1.a;
        Object objW2 = w51.W(ye1.Z, new vh(2, null, (byte) 3), ck7Var);
        if (objW2 != c71Var) {
            str2 = str;
            list = perAppProxyList;
            objW = objW2;
        }
        return c71Var;
        vz7 vz7Var9 = x06.a;
        Set set = (Set) objW;
        set.getClass();
        list.getClass();
        Set setB1 = wv0.b1(set);
        bw0.d0(setB1, list);
        ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", setB1);
        perAppProxyListInvert = metaParams2.getPerAppProxyListInvert();
        if (perAppProxyListInvert != null) {
            vz7 vz7Var10 = x06.a;
            HappApplication happApplication5 = HappApplication.M0;
            HappApplication happApplicationI5 = k32.i();
            ck7Var.f0 = str2;
            ck7Var.g0 = metaParams2;
            ck7Var.h0 = perAppProxyListInvert;
            ck7Var.k0 = 2;
            nf1 nf1Var3 = tp1.a;
            objW = w51.W(ye1.Z, new l40(happApplicationI5, (q51) null, (byte) 10), ck7Var);
            if (objW != c71Var) {
                str3 = str2;
                Set setO2 = w27.o0(w27.l0(wv0.l0((Iterable) objW), dk7.X));
                Set setC3 = wv0.c1(perAppProxyListInvert);
                vz7 vz7Var11 = x06.a;
                ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", q57.Y(setO2, setC3));
                str2 = str3;
            }
            return c71Var;
        }
        perAppProxyListSet = metaParams2.getPerAppProxyListSet();
        if (perAppProxyListSet != null) {
            vz7 vz7Var12 = x06.a;
            ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", wv0.c1(perAppProxyListSet));
        }
        muxEnable = metaParams2.getMuxEnable();
        if (muxEnable != null) {
            a().p("pref_mux_enabled", muxEnable.booleanValue());
        }
        muxTcpConnections = metaParams2.getMuxTcpConnections();
        if (muxTcpConnections != null) {
            a().l(muxTcpConnections.intValue(), "pref_mux_concurency");
        }
        muxXudpConnections = metaParams2.getMuxXudpConnections();
        if (muxXudpConnections != null) {
            a().l(muxXudpConnections.intValue(), "pref_mux_xudp_concurency");
        }
        muxQuic = metaParams2.getMuxQuic();
        if (muxQuic != null) {
            a().q("pref_mux_xudp_quic", muxQuic.getTitle());
        }
        sniffingEnable = metaParams2.getSniffingEnable();
        if (sniffingEnable != null) {
            a().p("pref_sniffing_enabled", sniffingEnable.booleanValue());
        }
        pingResult = metaParams2.getPingResult();
        if (pingResult != null) {
            a().l(pingResult.ordinal(), "pref_ping_result");
        }
        excludeRoutes = metaParams2.getExcludeRoutes();
        vz7Var = this.b;
        if (excludeRoutes != null) {
            ((u42) vz7Var.getValue()).a(excludeRoutes, null, null);
        }
        excludeRoutesSet = metaParams2.getExcludeRoutesSet();
        if (excludeRoutesSet != null) {
            u42 u42Var3 = (u42) vz7Var.getValue();
            oh7Var = u42Var3.b;
            if (excludeRoutesSet.equalsIgnoreCase("reset")) {
                do {
                    value2 = oh7Var.getValue();
                } while (!oh7Var.k(value2, m02.X));
            } else {
                setC = u42.c(excludeRoutesSet);
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, setC));
            }
            rj6Var2 = new sj6(u42Var3.d());
            if (sj6.a(rj6Var2) == null) {
            }
        }
        dnsFromJsonEnable = metaParams2.getDnsFromJsonEnable();
        if (dnsFromJsonEnable != null) {
            a().p("pref_dns_from_json", dnsFromJsonEnable.booleanValue());
        }
        userAgentGeoFiles = metaParams2.getUserAgentGeoFiles();
        if (userAgentGeoFiles != null) {
            a().l(userAgentGeoFiles.ordinal(), "pref_geo_custom_ua");
        }
        vz7Var2 = this.d;
        ak7 ak7Var3 = (ak7) vz7Var2.getValue();
        ak7Var3.getClass();
        string = ak7Var3.a.getString("pinSubIdInStorage", null);
        if (string == null) {
            string = null;
        }
        subscriptionPin = metaParams2.getSubscriptionPin();
        bool = Boolean.TRUE;
        zEquals = false;
        if (dh3.f(subscriptionPin, bool)) {
            if (string == null) {
                if (str2 == null) {
                    zEquals2 = true;
                } else {
                    zEquals2 = false;
                }
            } else if (str2 == null) {
                zEquals2 = false;
            } else {
                zEquals2 = string.equals(str2);
            }
            if (zEquals2) {
                if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                    if (string == null) {
                        if (str2 == null) {
                            zEquals = true;
                        }
                    } else if (str2 != null) {
                        zEquals = string.equals(str2);
                    }
                    if (zEquals) {
                        ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                    }
                }
            } else if (dh3.f(subscriptionPin, Boolean.FALSE)) {
                if (string == null) {
                    if (str2 == null) {
                        zEquals = true;
                    }
                } else if (str2 != null) {
                    zEquals = string.equals(str2);
                }
                if (zEquals) {
                    ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
                }
            }
        } else if (dh3.f(subscriptionPin, Boolean.FALSE)) {
            if (string == null) {
                if (str2 == null) {
                    zEquals = true;
                }
            } else if (str2 != null) {
                zEquals = string.equals(str2);
            }
            if (zEquals) {
                ((ak7) vz7Var2.getValue()).b("pinSubIdInStorage");
            }
        }
        inboundHttpEnable = metaParams2.getInboundHttpEnable();
        if (inboundHttpEnable != null) {
            a().p("pref_http_auth_enabled", inboundHttpEnable.booleanValue());
        }
        xrayTunEnable = metaParams2.getXrayTunEnable();
        if (xrayTunEnable != null) {
            a().p("pref_xray_tun_enabled", xrayTunEnable.booleanValue());
        }
        xrayTunMtu = metaParams2.getXrayTunMtu();
        if (xrayTunMtu != null) {
            a().l(xrayTunMtu.intValue(), "pref_tun_mtu");
        }
        blockBindToTunnelEnable = metaParams2.getBlockBindToTunnelEnable();
        if (blockBindToTunnelEnable != null) {
            a().p("pref_block_bindtodevice_enabled", blockBindToTunnelEnable.booleanValue());
        }
        proxyPingMode = metaParams2.getProxyPingMode();
        if (proxyPingMode != null) {
            a().l(proxyPingMode.ordinal(), "pref_ping_mode");
        }
        proxyPingTimeout = metaParams2.getProxyPingTimeout();
        if (proxyPingTimeout != null) {
            a().l(proxyPingTimeout.intValue(), "pref_proxy_ping_timeout");
        }
        reset = metaParams2.getReset();
        if (str2 != null) {
            kw4 kw4Var5 = kw4.a;
            subscriptionItemF2 = kw4.f(str2);
        }
        HappApplication happApplication6 = HappApplication.M0;
        k32.i().d().h(new gq6(reset, subscriptionItemF2, (byte) 6));
        if (dh3.f(reset, bool)) {
            HappApplication happApplicationI6 = k32.i();
            originUrl = subscriptionItemF2.getOriginUrl();
            if (originUrl == null) {
                originUrl = "";
            }
            String strW3 = mm7.W(mm7.W(mm7.W(mm7.W(originUrl, "reset=1&", "", true), "reset=true&", "", true), "reset=1", "", true), "reset=true", "", true);
            Intent intent4 = new Intent();
            intent4.setAction("su.happ.proxyutility.action.activity");
            intent4.setPackage("su.happ.proxyutility");
            intent4.putExtra("key", 131);
            intent4.putExtra("content", (Serializable) strW3);
            happApplicationI6.sendBroadcast(intent4);
            kw4 kw4Var6 = kw4.a;
            subscriptionItemF = kw4.f(str2);
            if (subscriptionItemF != null) {
                kw4.u(SubscriptionItem.d(subscriptionItemF, 0L, false, null, false, null, 134217727), str2);
            }
        }
        return dn8.a;
    }
}

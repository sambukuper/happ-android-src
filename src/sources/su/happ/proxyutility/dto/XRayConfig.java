package su.happ.proxyutility.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.a;
import defpackage.eq8;
import defpackage.x79;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 P2\u00020\u0001:\fPQRSTUVWXYZ[R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R2\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001bj\b\u0012\u0004\u0012\u00020\"`\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0019\u0010:\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b;\u0010\fR\u0019\u0010<\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b=\u0010\fR$\u0010>\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u0019\u0010A\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR$\u0010C\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010\u000eR$\u0010F\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\n\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006\\"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig;", "", "", "remarks", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "stats", "Ljava/lang/Object;", "getStats", "()Ljava/lang/Object;", "u", "(Ljava/lang/Object;)V", "Lsu/happ/proxyutility/dto/XRayConfig$LogBean;", "log", "Lsu/happ/proxyutility/dto/XRayConfig$LogBean;", "g", "()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;", "Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean;", "policy", "Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean;", "getPolicy", "()Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean;", "s", "(Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean;)V", "Ljava/util/ArrayList;", "Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;", "Lkotlin/collections/ArrayList;", "inbounds", "Ljava/util/ArrayList;", "f", "()Ljava/util/ArrayList;", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;", "outbounds", "i", "r", "(Ljava/util/ArrayList;)V", "Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;", "dns", "Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;", "e", "()Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;", "o", "(Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;", MetaParams.ROUTING, "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;", "l", "()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;", "Lsu/happ/proxyutility/dto/XRayConfig$Api;", "api", "Lsu/happ/proxyutility/dto/XRayConfig$Api;", "getApi", "()Lsu/happ/proxyutility/dto/XRayConfig$Api;", "m", "(Lsu/happ/proxyutility/dto/XRayConfig$Api;)V", "transport", "getTransport", "reverse", "getReverse", "fakedns", "getFakedns", "p", "browserForwarder", "getBrowserForwarder", "observatory", "getObservatory", "q", "burstObservatory", "getBurstObservatory", "n", "Lsu/happ/proxyutility/dto/XRayConfig$Meta;", "meta", "Lsu/happ/proxyutility/dto/XRayConfig$Meta;", "h", "()Lsu/happ/proxyutility/dto/XRayConfig$Meta;", "setMeta", "(Lsu/happ/proxyutility/dto/XRayConfig$Meta;)V", "Companion", "Api", "LogBean", "InboundBean", "OutboundBean", "DnsBean", "RoutingBean", "PolicyBean", "ObservatoryObject", "BurstObservatoryObject", "FakednsBean", "Meta", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class XRayConfig {
    public static final int $stable = 8;
    public static final int DEFAULT_LEVEL = 8;
    public static final int DEFAULT_PORT = 443;
    public static final String DEFAULT_SECURITY = "auto";
    public static final String DEFAULT_XHTTP_MODE = "auto";
    public static final String REALITY = "reality";
    public static final String TLS = "tls";
    private Api api;
    private final Object browserForwarder;
    private Object burstObservatory;
    private DnsBean dns;
    private Object fakedns;
    private final ArrayList<InboundBean> inbounds;
    private final LogBean log;

    @p37("meta")
    private Meta meta;
    private Object observatory;
    private ArrayList<OutboundBean> outbounds;
    private PolicyBean policy;
    private String remarks;
    private final Object reverse;
    private final RoutingBean routing;
    private Object stats;
    private final Object transport;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String DEFAULT_NETWORK = EConfigNetworkType.TCP.getType();
    private static final String HTTP = EConfigNetworkType.HTTP.getType();
    private static final String QUIC = EConfigNetworkType.QUIC.getType();

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$Api;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "services", "Ljava/util/ArrayList;", "getServices", "()Ljava/util/ArrayList;", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "listen", "getListen", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class Api {
        public static final int $stable = 8;
        private final ArrayList<String> services;
        private final String tag = "api";
        private final String listen = "[::1]:10085";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Api(ArrayList arrayList) {
            this.services = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Api)) {
                return false;
            }
            Api api = (Api) obj;
            return dh3.f(this.services, api.services) && dh3.f(this.tag, api.tag) && dh3.f(this.listen, api.listen);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            return this.listen.hashCode() + pc6.e(this.services.hashCode() * 31, 31, this.tag);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            ArrayList<String> arrayList = this.services;
            String str = this.tag;
            String str2 = this.listen;
            StringBuilder sb = new StringBuilder("Api(services=");
            sb.append(arrayList);
            sb.append(", tag=");
            sb.append(str);
            sb.append(", listen=");
            return oi0.p(sb, str2, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject;", "", "", "", "subjectSelector", "Ljava/util/List;", "getSubjectSelector", "()Ljava/util/List;", "Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;", "pingConfig", "Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;", "getPingConfig", "()Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;", "PingConfigObject", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class BurstObservatoryObject {
        public static final int $stable = 8;
        private final PingConfigObject pingConfig;
        private final List<String> subjectSelector;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;", "", "", "destination", "Ljava/lang/String;", "getDestination", "()Ljava/lang/String;", "connectivity", "getConnectivity", "interval", "getInterval", "", "sampling", "I", "getSampling", "()I", "timeout", "getTimeout", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class PingConfigObject {
            public static final int $stable = 0;
            private final String connectivity;
            private final String destination;
            private final String interval;
            private final int sampling;
            private final String timeout;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public PingConfigObject(String str) {
                str.getClass();
                this.destination = str;
                this.connectivity = null;
                this.interval = "5m";
                this.sampling = 2;
                this.timeout = "30s";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PingConfigObject)) {
                    return false;
                }
                PingConfigObject pingConfigObject = (PingConfigObject) obj;
                return dh3.f(this.destination, pingConfigObject.destination) && dh3.f(this.connectivity, pingConfigObject.connectivity) && dh3.f(this.interval, pingConfigObject.interval) && this.sampling == pingConfigObject.sampling && dh3.f(this.timeout, pingConfigObject.timeout);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                int iHashCode = this.destination.hashCode() * 31;
                String str = this.connectivity;
                int iE = oi0.e(this.sampling, pc6.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.interval), 31);
                String str2 = this.timeout;
                return iE + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                String str = this.destination;
                String str2 = this.connectivity;
                String str3 = this.interval;
                int i = this.sampling;
                String str4 = this.timeout;
                StringBuilder sbT = oi0.t("PingConfigObject(destination=", str, ", connectivity=", str2, ", interval=");
                sbT.append(str3);
                sbT.append(", sampling=");
                sbT.append(i);
                sbT.append(", timeout=");
                return oi0.p(sbT, str4, ")");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BurstObservatoryObject(List list, PingConfigObject pingConfigObject) {
            this.subjectSelector = list;
            this.pingConfig = pingConfigObject;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BurstObservatoryObject)) {
                return false;
            }
            BurstObservatoryObject burstObservatoryObject = (BurstObservatoryObject) obj;
            return dh3.f(this.subjectSelector, burstObservatoryObject.subjectSelector) && dh3.f(this.pingConfig, burstObservatoryObject.pingConfig);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            return this.pingConfig.hashCode() + (this.subjectSelector.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            return "BurstObservatoryObject(subjectSelector=" + this.subjectSelector + ", pingConfig=" + this.pingConfig + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$Companion;", "", "", "DEFAULT_PORT", "I", "", "DEFAULT_SECURITY", "Ljava/lang/String;", "DEFAULT_LEVEL", "DEFAULT_XHTTP_MODE", "TLS", "REALITY", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(R6\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "servers", "Ljava/util/ArrayList;", "b", "()Ljava/util/ArrayList;", "setServers", "(Ljava/util/ArrayList;)V", "", "", "hosts", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "clientIp", "Ljava/lang/String;", "getClientIp", "()Ljava/lang/String;", "", "disableCache", "Ljava/lang/Boolean;", "getDisableCache", "()Ljava/lang/Boolean;", "queryStrategy", "getQueryStrategy", "tag", "getTag", "setTag", "(Ljava/lang/String;)V", "", "timeoutMs", "Ljava/lang/Integer;", "getTimeoutMs", "()Ljava/lang/Integer;", "setTimeoutMs", "(Ljava/lang/Integer;)V", "ServersBean", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class DnsBean {
        public static final int $stable = 8;
        private Map<String, ? extends Object> hosts;
        private final String queryStrategy;
        private ArrayList<Object> servers;
        private final String clientIp = null;
        private final Boolean disableCache = null;
        private String tag = null;
        private Integer timeoutMs = null;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;", "", "", "address", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "", "port", "Ljava/lang/Integer;", "getPort", "()Ljava/lang/Integer;", "setPort", "(Ljava/lang/Integer;)V", "", "domains", "Ljava/util/List;", "getDomains", "()Ljava/util/List;", "setDomains", "(Ljava/util/List;)V", "expectedIPs", "getExpectedIPs", "setExpectedIPs", "clientIp", "getClientIp", "", "skipFallback", "Ljava/lang/Boolean;", "getSkipFallback", "()Ljava/lang/Boolean;", "tag", "getTag", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class ServersBean {
            public static final int $stable = 8;
            private String address;
            private final String clientIp;
            private List<String> domains;
            private List<String> expectedIPs;
            private Integer port;
            private final Boolean skipFallback;
            private final String tag;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ServersBean(String str, Integer num, List list, int i) {
                num = (i & 2) != 0 ? null : num;
                str.getClass();
                this.address = str;
                this.port = num;
                this.domains = list;
                this.expectedIPs = null;
                this.clientIp = null;
                this.skipFallback = null;
                this.tag = null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServersBean)) {
                    return false;
                }
                ServersBean serversBean = (ServersBean) obj;
                return dh3.f(this.address, serversBean.address) && dh3.f(this.port, serversBean.port) && dh3.f(this.domains, serversBean.domains) && dh3.f(this.expectedIPs, serversBean.expectedIPs) && dh3.f(this.clientIp, serversBean.clientIp) && dh3.f(this.skipFallback, serversBean.skipFallback) && dh3.f(this.tag, serversBean.tag);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                int iHashCode = this.address.hashCode() * 31;
                Integer num = this.port;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                List<String> list = this.domains;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                List<String> list2 = this.expectedIPs;
                int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str = this.clientIp;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.skipFallback;
                int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.tag;
                return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                String str = this.address;
                Integer num = this.port;
                List<String> list = this.domains;
                List<String> list2 = this.expectedIPs;
                String str2 = this.clientIp;
                Boolean bool = this.skipFallback;
                String str3 = this.tag;
                StringBuilder sb = new StringBuilder("ServersBean(address=");
                sb.append(str);
                sb.append(", port=");
                sb.append(num);
                sb.append(", domains=");
                sb.append(list);
                sb.append(", expectedIPs=");
                sb.append(list2);
                sb.append(", clientIp=");
                sb.append(str2);
                sb.append(", skipFallback=");
                sb.append(bool);
                sb.append(", tag=");
                return oi0.p(sb, str3, ")");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DnsBean(ArrayList arrayList, Map map, String str) {
            this.servers = arrayList;
            this.hosts = map;
            this.queryStrategy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Map getHosts() {
            return this.hosts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ArrayList getServers() {
            return this.servers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void c(LinkedHashMap linkedHashMap) {
            this.hosts = linkedHashMap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DnsBean)) {
                return false;
            }
            DnsBean dnsBean = (DnsBean) obj;
            return dh3.f(this.servers, dnsBean.servers) && dh3.f(this.hosts, dnsBean.hosts) && dh3.f(this.clientIp, dnsBean.clientIp) && dh3.f(this.disableCache, dnsBean.disableCache) && dh3.f(this.queryStrategy, dnsBean.queryStrategy) && dh3.f(this.tag, dnsBean.tag) && dh3.f(this.timeoutMs, dnsBean.timeoutMs);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            ArrayList<Object> arrayList = this.servers;
            int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
            Map<String, ? extends Object> map = this.hosts;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.clientIp;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.disableCache;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.queryStrategy;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.timeoutMs;
            return iHashCode6 + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            ArrayList<Object> arrayList = this.servers;
            Map<String, ? extends Object> map = this.hosts;
            String str = this.clientIp;
            Boolean bool = this.disableCache;
            String str2 = this.queryStrategy;
            String str3 = this.tag;
            Integer num = this.timeoutMs;
            StringBuilder sb = new StringBuilder("DnsBean(servers=");
            sb.append(arrayList);
            sb.append(", hosts=");
            sb.append(map);
            sb.append(", clientIp=");
            sb.append(str);
            sb.append(", disableCache=");
            sb.append(bool);
            sb.append(", queryStrategy=");
            oi0.y(sb, str2, ", tag=", str3, ", timeoutMs=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$FakednsBean;", "", "", "ipPool", "Ljava/lang/String;", "getIpPool", "()Ljava/lang/String;", "setIpPool", "(Ljava/lang/String;)V", "", "poolSize", "I", "getPoolSize", "()I", "setPoolSize", "(I)V", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class FakednsBean {
        public static final int $stable = 8;
        private String ipPool = "198.18.0.0/15";
        private int poolSize = 10000;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FakednsBean)) {
                return false;
            }
            FakednsBean fakednsBean = (FakednsBean) obj;
            return dh3.f(this.ipPool, fakednsBean.ipPool) && this.poolSize == fakednsBean.poolSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            return Integer.hashCode(this.poolSize) + (this.ipPool.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            return "FakednsBean(ipPool=" + this.ipPool + ", poolSize=" + this.poolSize + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$LogBean;", "", "", "access", "Ljava/lang/String;", "getAccess", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "error", "getError", "b", "loglevel", "getLoglevel", "c", "", "dnsLog", "Ljava/lang/Boolean;", "getDnsLog", "()Ljava/lang/Boolean;", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class LogBean {
        public static final int $stable = 8;
        private String access;
        private final Boolean dnsLog;
        private String error;
        private String loglevel;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void a(String str) {
            this.access = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void b(String str) {
            this.error = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void c(String str) {
            this.loglevel = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogBean)) {
                return false;
            }
            LogBean logBean = (LogBean) obj;
            return dh3.f(this.access, logBean.access) && dh3.f(this.error, logBean.error) && dh3.f(this.loglevel, logBean.loglevel) && dh3.f(this.dnsLog, logBean.dnsLog);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            int iE = pc6.e(this.access.hashCode() * 31, 31, this.error);
            String str = this.loglevel;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.dnsLog;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            String str = this.access;
            String str2 = this.error;
            String str3 = this.loglevel;
            Boolean bool = this.dnsLog;
            StringBuilder sbT = oi0.t("LogBean(access=", str, ", error=", str2, ", loglevel=");
            sbT.append(str3);
            sbT.append(", dnsLog=");
            sbT.append(bool);
            sbT.append(")");
            return sbT.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$Meta;", "", "", "serverDescription", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class Meta {
        public static final int $stable = 0;

        @p37("serverDescription")
        private final String serverDescription = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getServerDescription() {
            return this.serverDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Meta) && dh3.f(this.serverDescription, ((Meta) obj).serverDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            if (this.serverDescription == null) {
                return 0;
            }
            return this.serverDescription.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            return pc6.p("Meta(serverDescription=", this.serverDescription, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$ObservatoryObject;", "", "", "", "subjectSelector", "Ljava/util/List;", "getSubjectSelector", "()Ljava/util/List;", "probeUrl", "Ljava/lang/String;", "getProbeUrl", "()Ljava/lang/String;", "probeInterval", "getProbeInterval", "", "enableConcurrency", "Z", "getEnableConcurrency", "()Z", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class ObservatoryObject {
        public static final int $stable = 8;
        private final boolean enableConcurrency;
        private final String probeInterval;
        private final String probeUrl;
        private final List<String> subjectSelector;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ObservatoryObject(List list, String str) {
            str.getClass();
            this.subjectSelector = list;
            this.probeUrl = str;
            this.probeInterval = "3m";
            this.enableConcurrency = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObservatoryObject)) {
                return false;
            }
            ObservatoryObject observatoryObject = (ObservatoryObject) obj;
            return dh3.f(this.subjectSelector, observatoryObject.subjectSelector) && dh3.f(this.probeUrl, observatoryObject.probeUrl) && dh3.f(this.probeInterval, observatoryObject.probeInterval) && this.enableConcurrency == observatoryObject.enableConcurrency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            return Boolean.hashCode(this.enableConcurrency) + pc6.e(pc6.e(this.subjectSelector.hashCode() * 31, 31, this.probeUrl), 31, this.probeInterval);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            return "ObservatoryObject(subjectSelector=" + this.subjectSelector + ", probeUrl=" + this.probeUrl + ", probeInterval=" + this.probeInterval + ", enableConcurrency=" + this.enableConcurrency + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean;", "", "", "", "Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean$LevelBean;", "levels", "Ljava/util/Map;", "getLevels", "()Ljava/util/Map;", "setLevels", "(Ljava/util/Map;)V", "system", "Ljava/lang/Object;", "getSystem", "()Ljava/lang/Object;", "setSystem", "(Ljava/lang/Object;)V", "LevelBean", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class PolicyBean {
        public static final int $stable = 8;
        private Map<String, LevelBean> levels;
        private Object system;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$PolicyBean$LevelBean;", "", "", "handshake", "Ljava/lang/Integer;", "getHandshake", "()Ljava/lang/Integer;", "setHandshake", "(Ljava/lang/Integer;)V", "connIdle", "getConnIdle", "setConnIdle", "uplinkOnly", "getUplinkOnly", "setUplinkOnly", "downlinkOnly", "getDownlinkOnly", "setDownlinkOnly", "", "statsUserUplink", "Ljava/lang/Boolean;", "getStatsUserUplink", "()Ljava/lang/Boolean;", "statsUserDownlink", "getStatsUserDownlink", "bufferSize", "getBufferSize", "setBufferSize", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class LevelBean {
            public static final int $stable = 8;
            private Integer bufferSize;
            private Integer connIdle;
            private Integer downlinkOnly;
            private Integer handshake;
            private final Boolean statsUserDownlink;
            private final Boolean statsUserUplink;
            private Integer uplinkOnly;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LevelBean)) {
                    return false;
                }
                LevelBean levelBean = (LevelBean) obj;
                return dh3.f(this.handshake, levelBean.handshake) && dh3.f(this.connIdle, levelBean.connIdle) && dh3.f(this.uplinkOnly, levelBean.uplinkOnly) && dh3.f(this.downlinkOnly, levelBean.downlinkOnly) && dh3.f(this.statsUserUplink, levelBean.statsUserUplink) && dh3.f(this.statsUserDownlink, levelBean.statsUserDownlink) && dh3.f(this.bufferSize, levelBean.bufferSize);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                Integer num = this.handshake;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.connIdle;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.uplinkOnly;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.downlinkOnly;
                int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Boolean bool = this.statsUserUplink;
                int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.statsUserDownlink;
                int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num5 = this.bufferSize;
                return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "LevelBean(handshake=" + this.handshake + ", connIdle=" + this.connIdle + ", uplinkOnly=" + this.uplinkOnly + ", downlinkOnly=" + this.downlinkOnly + ", statsUserUplink=" + this.statsUserUplink + ", statsUserDownlink=" + this.statsUserDownlink + ", bufferSize=" + this.bufferSize + ")";
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PolicyBean)) {
                return false;
            }
            PolicyBean policyBean = (PolicyBean) obj;
            return dh3.f(this.levels, policyBean.levels) && dh3.f(this.system, policyBean.system);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            int iHashCode = this.levels.hashCode() * 31;
            Object obj = this.system;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            return "PolicyBean(levels=" + this.levels + ", system=" + this.system + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u001d\u001e\u001f !R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR2\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;", "", "", "domainStrategy", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "domainMatcher", "getDomainMatcher", "setDomainMatcher", "Ljava/util/ArrayList;", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;", "Lkotlin/collections/ArrayList;", "rules", "Ljava/util/ArrayList;", "b", "()Ljava/util/ArrayList;", "setRules", "(Ljava/util/ArrayList;)V", "", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;", "balancers", "Ljava/util/List;", "getBalancers", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "RulesBean", "BalancerBean", "StrategyObject", "StrategySettingsObject", "CostObject", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class RoutingBean {
        public static final int $stable = 8;
        private List<BalancerBean> balancers;
        private String domainMatcher;
        private String domainStrategy;
        private ArrayList<RulesBean> rules;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;", "", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "", "selector", "Ljava/util/List;", "getSelector", "()Ljava/util/List;", "fallbackTag", "getFallbackTag", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;", "strategy", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;", "getStrategy", "()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class BalancerBean {
            public static final int $stable = 0;
            private final List<String> selector;
            private final StrategyObject strategy;
            private final String tag = "proxy-balancer";
            private final String fallbackTag = null;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public BalancerBean(List list, StrategyObject strategyObject) {
                this.selector = list;
                this.strategy = strategyObject;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BalancerBean)) {
                    return false;
                }
                BalancerBean balancerBean = (BalancerBean) obj;
                return dh3.f(this.tag, balancerBean.tag) && dh3.f(this.selector, balancerBean.selector) && dh3.f(this.fallbackTag, balancerBean.fallbackTag) && dh3.f(this.strategy, balancerBean.strategy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                int iF = p61.f(this.tag.hashCode() * 31, 31, this.selector);
                String str = this.fallbackTag;
                int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
                StrategyObject strategyObject = this.strategy;
                return iHashCode + (strategyObject != null ? strategyObject.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "BalancerBean(tag=" + this.tag + ", selector=" + this.selector + ", fallbackTag=" + this.fallbackTag + ", strategy=" + this.strategy + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$CostObject;", "", "", "regexp", "Z", "getRegexp", "()Z", "", "match", "Ljava/lang/String;", "getMatch", "()Ljava/lang/String;", "", "value", "D", "getValue", "()D", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class CostObject {
            public static final int $stable = 0;
            private final String match;
            private final boolean regexp;
            private final double value;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CostObject)) {
                    return false;
                }
                CostObject costObject = (CostObject) obj;
                return this.regexp == costObject.regexp && dh3.f(this.match, costObject.match) && Double.compare(this.value, costObject.value) == 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                return Double.hashCode(this.value) + pc6.e(Boolean.hashCode(this.regexp) * 31, 31, this.match);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "CostObject(regexp=" + this.regexp + ", match=" + this.match + ", value=" + this.value + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R6\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010+R\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u00101\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b1\u0010\u000f\u001a\u0004\b2\u0010\u0011R\u0019\u00103\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u0010\u000f\u001a\u0004\b4\u0010\u0011¨\u00065"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "ip", "Ljava/util/ArrayList;", "b", "()Ljava/util/ArrayList;", "f", "(Ljava/util/ArrayList;)V", "domain", "a", "e", "outboundTag", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "balancerTag", "getBalancerTag", "d", "port", "getPort", "h", "sourcePort", "getSourcePort", "network", "getNetwork", "process", "getProcess", "setProcess", "", "source", "Ljava/util/List;", "getSource", "()Ljava/util/List;", "user", "getUser", "inboundTag", "getInboundTag", "setInboundTag", "(Ljava/util/List;)V", "Lsu/happ/proxyutility/dto/FlexibleStringList;", "protocol", "Lsu/happ/proxyutility/dto/FlexibleStringList;", "getProtocol-emY-p_E", "()Lsu/happ/proxyutility/dto/FlexibleStringList;", "attrs", "getAttrs", "domainMatcher", "getDomainMatcher", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class RulesBean {
            public static final int $stable = 8;
            private final String attrs;
            private String balancerTag;
            private ArrayList<String> domain;
            private final String domainMatcher;
            private List<String> inboundTag;
            private ArrayList<String> ip;
            private final String network;
            private String outboundTag;
            private String port;
            private ArrayList<String> process;
            private final FlexibleStringList protocol;
            private final List<String> source;
            private final String sourcePort;
            private final List<String> user;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public RulesBean(ArrayList arrayList, String str, String str2, ArrayList arrayList2, ArrayList arrayList3, int i) {
                arrayList = (i & 1) != 0 ? null : arrayList;
                str = (i & 4) != 0 ? null : str;
                String str3 = (i & 8) != 0 ? null : "proxy-balancer";
                str2 = (i & 16) != 0 ? null : str2;
                String str4 = (i & 64) != 0 ? null : "tcp,udp";
                arrayList2 = (i & 128) != 0 ? null : arrayList2;
                arrayList3 = (i & 1024) != 0 ? null : arrayList3;
                this.ip = arrayList;
                this.domain = null;
                this.outboundTag = str;
                this.balancerTag = str3;
                this.port = str2;
                this.sourcePort = null;
                this.network = str4;
                this.process = arrayList2;
                this.source = null;
                this.user = null;
                this.inboundTag = arrayList3;
                this.protocol = null;
                this.attrs = null;
                this.domainMatcher = null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: a, reason: from getter */
            public final ArrayList getDomain() {
                return this.domain;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: b, reason: from getter */
            public final ArrayList getIp() {
                return this.ip;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getOutboundTag() {
                return this.outboundTag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void d() {
                this.balancerTag = "proxy-balancer";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void e(ArrayList arrayList) {
                this.domain = arrayList;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RulesBean)) {
                    return false;
                }
                RulesBean rulesBean = (RulesBean) obj;
                return dh3.f(this.ip, rulesBean.ip) && dh3.f(this.domain, rulesBean.domain) && dh3.f(this.outboundTag, rulesBean.outboundTag) && dh3.f(this.balancerTag, rulesBean.balancerTag) && dh3.f(this.port, rulesBean.port) && dh3.f(this.sourcePort, rulesBean.sourcePort) && dh3.f(this.network, rulesBean.network) && dh3.f(this.process, rulesBean.process) && dh3.f(this.source, rulesBean.source) && dh3.f(this.user, rulesBean.user) && dh3.f(this.inboundTag, rulesBean.inboundTag) && dh3.f(this.protocol, rulesBean.protocol) && dh3.f(this.attrs, rulesBean.attrs) && dh3.f(this.domainMatcher, rulesBean.domainMatcher);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void f(ArrayList arrayList) {
                this.ip = arrayList;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void g(String str) {
                this.outboundTag = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void h() {
                this.port = "53";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                Object value;
                ArrayList<String> arrayList = this.ip;
                int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
                ArrayList<String> arrayList2 = this.domain;
                int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
                String str = this.outboundTag;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.balancerTag;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.port;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.sourcePort;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.network;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                ArrayList<String> arrayList3 = this.process;
                int iHashCode8 = (iHashCode7 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
                List<String> list = this.source;
                int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
                List<String> list2 = this.user;
                int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<String> list3 = this.inboundTag;
                int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
                FlexibleStringList flexibleStringList = this.protocol;
                int iHashCode12 = (iHashCode11 + ((flexibleStringList == null || (value = flexibleStringList.getValue()) == null) ? 0 : value.hashCode())) * 31;
                String str6 = this.attrs;
                int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.domainMatcher;
                return iHashCode13 + (str7 != null ? str7.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                ArrayList<String> arrayList = this.ip;
                ArrayList<String> arrayList2 = this.domain;
                String str = this.outboundTag;
                String str2 = this.balancerTag;
                String str3 = this.port;
                String str4 = this.sourcePort;
                String str5 = this.network;
                ArrayList<String> arrayList3 = this.process;
                List<String> list = this.source;
                List<String> list2 = this.user;
                List<String> list3 = this.inboundTag;
                FlexibleStringList flexibleStringList = this.protocol;
                String str6 = this.attrs;
                String str7 = this.domainMatcher;
                StringBuilder sb = new StringBuilder("RulesBean(ip=");
                sb.append(arrayList);
                sb.append(", domain=");
                sb.append(arrayList2);
                sb.append(", outboundTag=");
                oi0.y(sb, str, ", balancerTag=", str2, ", port=");
                oi0.y(sb, str3, ", sourcePort=", str4, ", network=");
                sb.append(str5);
                sb.append(", process=");
                sb.append(arrayList3);
                sb.append(", source=");
                sb.append(list);
                sb.append(", user=");
                sb.append(list2);
                sb.append(", inboundTag=");
                sb.append(list3);
                sb.append(", protocol=");
                sb.append(flexibleStringList);
                sb.append(", attrs=");
                return oi0.q(sb, str6, ", domainMatcher=", str7, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategySettingsObject;", "settings", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategySettingsObject;", "getSettings", "()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategySettingsObject;", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class StrategyObject {
            public static final int $stable = 0;
            private final StrategySettingsObject settings;
            private final String type;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public StrategyObject(String str) {
                str.getClass();
                this.type = str;
                this.settings = null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StrategyObject)) {
                    return false;
                }
                StrategyObject strategyObject = (StrategyObject) obj;
                return dh3.f(this.type, strategyObject.type) && dh3.f(this.settings, strategyObject.settings);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                StrategySettingsObject strategySettingsObject = this.settings;
                return iHashCode + (strategySettingsObject == null ? 0 : strategySettingsObject.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "StrategyObject(type=" + this.type + ", settings=" + this.settings + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategySettingsObject;", "", "", "expected", "Ljava/lang/Integer;", "getExpected", "()Ljava/lang/Integer;", "", "maxRTT", "Ljava/lang/String;", "getMaxRTT", "()Ljava/lang/String;", "", "tolerance", "Ljava/lang/Double;", "getTolerance", "()Ljava/lang/Double;", "", "baselines", "Ljava/util/List;", "getBaselines", "()Ljava/util/List;", "Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$CostObject;", "costs", "getCosts", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class StrategySettingsObject {
            public static final int $stable = 0;
            private final List<String> baselines;
            private final List<CostObject> costs;
            private final Integer expected;
            private final String maxRTT;
            private final Double tolerance;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StrategySettingsObject)) {
                    return false;
                }
                StrategySettingsObject strategySettingsObject = (StrategySettingsObject) obj;
                return dh3.f(this.expected, strategySettingsObject.expected) && dh3.f(this.maxRTT, strategySettingsObject.maxRTT) && dh3.f(this.tolerance, strategySettingsObject.tolerance) && dh3.f(this.baselines, strategySettingsObject.baselines) && dh3.f(this.costs, strategySettingsObject.costs);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                Integer num = this.expected;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.maxRTT;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Double d = this.tolerance;
                int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
                List<String> list = this.baselines;
                int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                List<CostObject> list2 = this.costs;
                return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "StrategySettingsObject(expected=" + this.expected + ", maxRTT=" + this.maxRTT + ", tolerance=" + this.tolerance + ", baselines=" + this.baselines + ", costs=" + this.costs + ")";
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDomainStrategy() {
            return this.domainStrategy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ArrayList getRules() {
            return this.rules;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void c(List list) {
            this.balancers = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void d(String str) {
            this.domainStrategy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoutingBean)) {
                return false;
            }
            RoutingBean routingBean = (RoutingBean) obj;
            return dh3.f(this.domainStrategy, routingBean.domainStrategy) && dh3.f(this.domainMatcher, routingBean.domainMatcher) && dh3.f(this.rules, routingBean.rules) && dh3.f(this.balancers, routingBean.balancers);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            int iHashCode = this.domainStrategy.hashCode() * 31;
            String str = this.domainMatcher;
            int iHashCode2 = (this.rules.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            List<BalancerBean> list = this.balancers;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            String str = this.domainStrategy;
            String str2 = this.domainMatcher;
            ArrayList<RulesBean> arrayList = this.rules;
            List<BalancerBean> list = this.balancers;
            StringBuilder sbT = oi0.t("RoutingBean(domainStrategy=", str, ", domainMatcher=", str2, ", rules=");
            sbT.append(arrayList);
            sbT.append(", balancers=");
            sbT.append(list);
            sbT.append(")");
            return sbT.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList d() {
        ArrayList<OutboundBean> arrayList = this.outbounds;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            OutboundBean outboundBean = (OutboundBean) obj;
            l22 l22VarA = EConfigType.a();
            if (l22VarA == null || !l22VarA.isEmpty()) {
                Iterator it = l22VarA.iterator();
                while (it.hasNext()) {
                    if (mm7.S(((EConfigType) it.next()).name(), outboundBean.getProtocol())) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final DnsBean getDns() {
        return this.dns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XRayConfig)) {
            return false;
        }
        XRayConfig xRayConfig = (XRayConfig) obj;
        return dh3.f(this.remarks, xRayConfig.remarks) && dh3.f(this.stats, xRayConfig.stats) && dh3.f(this.log, xRayConfig.log) && dh3.f(this.policy, xRayConfig.policy) && dh3.f(this.inbounds, xRayConfig.inbounds) && dh3.f(this.outbounds, xRayConfig.outbounds) && dh3.f(this.dns, xRayConfig.dns) && dh3.f(this.routing, xRayConfig.routing) && dh3.f(this.api, xRayConfig.api) && dh3.f(this.transport, xRayConfig.transport) && dh3.f(this.reverse, xRayConfig.reverse) && dh3.f(this.fakedns, xRayConfig.fakedns) && dh3.f(this.browserForwarder, xRayConfig.browserForwarder) && dh3.f(this.observatory, xRayConfig.observatory) && dh3.f(this.burstObservatory, xRayConfig.burstObservatory) && dh3.f(this.meta, xRayConfig.meta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getInbounds() {
        return this.inbounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g, reason: from getter */
    public final LogBean getLog() {
        return this.log;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.remarks;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.stats;
        int iHashCode2 = (this.log.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        PolicyBean policyBean = this.policy;
        int iHashCode3 = (this.outbounds.hashCode() + ((this.inbounds.hashCode() + ((iHashCode2 + (policyBean == null ? 0 : policyBean.hashCode())) * 31)) * 31)) * 31;
        DnsBean dnsBean = this.dns;
        int iHashCode4 = (this.api.hashCode() + ((this.routing.hashCode() + ((iHashCode3 + (dnsBean == null ? 0 : dnsBean.hashCode())) * 31)) * 31)) * 31;
        Object obj2 = this.transport;
        int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.reverse;
        int iHashCode6 = (iHashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.fakedns;
        int iHashCode7 = (iHashCode6 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.browserForwarder;
        int iHashCode8 = (iHashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.observatory;
        int iHashCode9 = (iHashCode8 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.burstObservatory;
        return ((iHashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31) + (this.meta != null ? this.meta.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ArrayList getOutbounds() {
        return this.outbounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OutboundBean j() {
        for (OutboundBean outboundBean : this.outbounds) {
            Iterator it = EConfigType.a().iterator();
            while (it.hasNext()) {
                if (mm7.S(outboundBean.getProtocol(), ((EConfigType) it.next()).name())) {
                    return outboundBean;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l, reason: from getter */
    public final RoutingBean getRouting() {
        return this.routing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(Api api) {
        this.api = api;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(BurstObservatoryObject burstObservatoryObject) {
        this.burstObservatory = burstObservatoryObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(DnsBean dnsBean) {
        this.dns = dnsBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(List list) {
        this.fakedns = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(ObservatoryObject observatoryObject) {
        this.observatory = observatoryObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(ArrayList arrayList) {
        this.outbounds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        this.policy = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(String str) {
        this.remarks = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "XRayConfig(remarks=" + this.remarks + ", stats=" + this.stats + ", log=" + this.log + ", policy=" + this.policy + ", inbounds=" + this.inbounds + ", outbounds=" + this.outbounds + ", dns=" + this.dns + ", routing=" + this.routing + ", api=" + this.api + ", transport=" + this.transport + ", reverse=" + this.reverse + ", fakedns=" + this.fakedns + ", browserForwarder=" + this.browserForwarder + ", observatory=" + this.observatory + ", burstObservatory=" + this.burstObservatory + ", meta=" + this.meta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        this.stats = null;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003'()R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;", "", "", "tag", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "protocol", "e", "setProtocol", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;", "settings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;", "i", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;", "o", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;", "streamSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;", "j", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;", "p", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;)V", "proxySettings", "Ljava/lang/Object;", "getProxySettings", "()Ljava/lang/Object;", "sendThrough", "getSendThrough", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;", "mux", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;", "c", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;", "m", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;)V", "OutSettingsBean", "StreamSettingsBean", "MuxBean", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class OutboundBean {
        public static final int $stable = 8;
        private MuxBean mux;
        private String protocol;
        private final Object proxySettings;
        private final String sendThrough;
        private OutSettingsBean settings;
        private StreamSettingsBean streamSettings;
        private String tag;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;", "", "", "enabled", "Z", "getEnabled", "()Z", "b", "(Z)V", "", "concurrency", "I", "getConcurrency", "()I", "a", "(I)V", "xudpConcurrency", "getXudpConcurrency", "c", "", "xudpProxyUDP443", "Ljava/lang/String;", "getXudpProxyUDP443", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class MuxBean {
            public static final int $stable = 8;
            private boolean enabled = false;
            private int concurrency = 8;
            private int xudpConcurrency = 8;
            private String xudpProxyUDP443 = "";

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void a(int i) {
                this.concurrency = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void b(boolean z) {
                this.enabled = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void c(int i) {
                this.xudpConcurrency = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void d(String str) {
                str.getClass();
                this.xudpProxyUDP443 = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MuxBean)) {
                    return false;
                }
                MuxBean muxBean = (MuxBean) obj;
                return this.enabled == muxBean.enabled && this.concurrency == muxBean.concurrency && this.xudpConcurrency == muxBean.xudpConcurrency && dh3.f(this.xudpProxyUDP443, muxBean.xudpProxyUDP443);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                return this.xudpProxyUDP443.hashCode() + oi0.e(this.xudpConcurrency, oi0.e(this.concurrency, Boolean.hashCode(this.enabled) * 31, 31), 31);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "MuxBean(enabled=" + this.enabled + ", concurrency=" + this.concurrency + ", xudpConcurrency=" + this.xudpConcurrency + ", xudpProxyUDP443=" + this.xudpProxyUDP443 + ")";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (wrap java.lang.String:0x0006: TERNARY null = ((wrap int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? ("proxy") : (r9v0 java.lang.String))
  (r10v0 java.lang.String)
  (wrap su.happ.proxyutility.dto.XRayConfig$OutboundBean$OutSettingsBean:?: TERNARY null = ((wrap int:0x0007: ARITH (r13v0 int) & (4 int) A[WRAPPED] (LINE:8)) != (0 int)) ? (null su.happ.proxyutility.dto.XRayConfig$OutboundBean$OutSettingsBean) : (r11v0 su.happ.proxyutility.dto.XRayConfig$OutboundBean$OutSettingsBean))
  (wrap su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean:?: TERNARY null = ((wrap int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED] (LINE:16)) != (0 int)) ? (null su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean) : (r12v0 su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean))
  (null java.lang.Object)
  (null java.lang.String)
  (wrap su.happ.proxyutility.dto.XRayConfig$OutboundBean$MuxBean:?: TERNARY null = ((wrap int:0x0016: ARITH (r13v0 int) & (64 int) A[WRAPPED] (LINE:23)) != (0 int)) ? (wrap su.happ.proxyutility.dto.XRayConfig$OutboundBean$MuxBean:0x001c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:29) call: su.happ.proxyutility.dto.XRayConfig.OutboundBean.MuxBean.<init>():void type: CONSTRUCTOR) : (null su.happ.proxyutility.dto.XRayConfig$OutboundBean$MuxBean))
 A[MD:(java.lang.String, java.lang.String, su.happ.proxyutility.dto.XRayConfig$OutboundBean$OutSettingsBean, su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean, java.lang.Object, java.lang.String, su.happ.proxyutility.dto.XRayConfig$OutboundBean$MuxBean):void (m)] (LINE:37) call: su.happ.proxyutility.dto.XRayConfig.OutboundBean.<init>(java.lang.String, java.lang.String, su.happ.proxyutility.dto.XRayConfig$OutboundBean$OutSettingsBean, su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean, java.lang.Object, java.lang.String, su.happ.proxyutility.dto.XRayConfig$OutboundBean$MuxBean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ OutboundBean(String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, int i) {
            this((i & 1) != 0 ? "proxy" : str, str2, (i & 4) != 0 ? null : outSettingsBean, (i & 8) != 0 ? null : streamSettingsBean, null, null, (i & 64) != 0 ? new MuxBean() : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static OutboundBean a(OutboundBean outboundBean) {
            String str = outboundBean.tag;
            String str2 = outboundBean.protocol;
            OutSettingsBean outSettingsBean = outboundBean.settings;
            StreamSettingsBean streamSettingsBean = outboundBean.streamSettings;
            Object obj = outboundBean.proxySettings;
            String str3 = outboundBean.sendThrough;
            MuxBean muxBean = outboundBean.mux;
            str.getClass();
            str2.getClass();
            return new OutboundBean(str, str2, outSettingsBean, streamSettingsBean, obj, str3, muxBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final StreamSettingsBean.SockoptBean b() {
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            if (streamSettingsBean == null) {
                streamSettingsBean = new StreamSettingsBean(null, null, null, 16383);
                this.streamSettings = streamSettingsBean;
            }
            StreamSettingsBean.SockoptBean sockopt = streamSettingsBean.getSockopt();
            if (sockopt != null) {
                return sockopt;
            }
            StreamSettingsBean.SockoptBean sockoptBean = new StreamSettingsBean.SockoptBean(255);
            streamSettingsBean.s(sockoptBean);
            return sockoptBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c, reason: from getter */
        public final MuxBean getMux() {
            return this.mux;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String d() {
            List vnext;
            OutSettingsBean.VnextBean vnextBean;
            List users;
            OutSettingsBean.VnextBean.UsersBean usersBean;
            String id;
            List servers;
            OutSettingsBean.ServersBean serversBean;
            StreamSettingsBean streamSettingsBean;
            StreamSettingsBean.HysteriaSettingsBean hysteriaSettings;
            List servers2;
            OutSettingsBean.ServersBean serversBean2;
            List users2;
            OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean;
            if (mm7.S(this.protocol, "VMESS") || mm7.S(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean = this.settings;
                if (outSettingsBean != null && (id = outSettingsBean.getId()) != null) {
                    return id;
                }
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) vnext.get(0)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (OutSettingsBean.VnextBean.UsersBean) users.get(0)) == null) {
                    return null;
                }
                return usersBean.getId();
            }
            if (mm7.S(this.protocol, "SHADOWSOCKS") || mm7.S(this.protocol, "TROJAN")) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (servers = outSettingsBean3.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) servers.get(0)) == null) {
                    return null;
                }
                return serversBean.getPassword();
            }
            if (mm7.S(this.protocol, "SOCKS")) {
                OutSettingsBean outSettingsBean4 = this.settings;
                if (outSettingsBean4 == null || (servers2 = outSettingsBean4.getServers()) == null || (serversBean2 = (OutSettingsBean.ServersBean) servers2.get(0)) == null || (users2 = serversBean2.getUsers()) == null || (socksUsersBean = (OutSettingsBean.ServersBean.SocksUsersBean) users2.get(0)) == null) {
                    return null;
                }
                return socksUsersBean.getPass();
            }
            if (mm7.S(this.protocol, "WIREGUARD")) {
                OutSettingsBean outSettingsBean5 = this.settings;
                if (outSettingsBean5 != null) {
                    return outSettingsBean5.getSecretKey();
                }
                return null;
            }
            if (!mm7.S(this.protocol, "HYSTERIA") || (streamSettingsBean = this.streamSettings) == null || (hysteriaSettings = streamSettingsBean.getHysteriaSettings()) == null) {
                return null;
            }
            return hysteriaSettings.getAuth();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getProtocol() {
            return this.protocol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundBean)) {
                return false;
            }
            OutboundBean outboundBean = (OutboundBean) obj;
            return dh3.f(this.tag, outboundBean.tag) && dh3.f(this.protocol, outboundBean.protocol) && dh3.f(this.settings, outboundBean.settings) && dh3.f(this.streamSettings, outboundBean.streamSettings) && dh3.f(this.proxySettings, outboundBean.proxySettings) && dh3.f(this.sendThrough, outboundBean.sendThrough) && dh3.f(this.mux, outboundBean.mux);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String f() {
            OutSettingsBean outSettingsBean;
            List servers;
            OutSettingsBean.ServersBean serversBean;
            List vnext;
            OutSettingsBean.VnextBean vnextBean;
            List users;
            OutSettingsBean.VnextBean.UsersBean usersBean;
            String encryption;
            List vnext2;
            OutSettingsBean.VnextBean vnextBean2;
            List users2;
            OutSettingsBean.VnextBean.UsersBean usersBean2;
            String security;
            if (mm7.S(this.protocol, "VMESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 != null && (vnext2 = outSettingsBean2.getVnext()) != null && (vnextBean2 = (OutSettingsBean.VnextBean) vnext2.get(0)) != null && (users2 = vnextBean2.getUsers()) != null && (usersBean2 = (OutSettingsBean.VnextBean.UsersBean) users2.get(0)) != null && (security = usersBean2.getSecurity()) != null) {
                    return security;
                }
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 != null) {
                    return outSettingsBean3.getSecurity();
                }
                return null;
            }
            if (!mm7.S(this.protocol, "VLESS")) {
                if (!mm7.S(this.protocol, "SHADOWSOCKS") || (outSettingsBean = this.settings) == null || (servers = outSettingsBean.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) servers.get(0)) == null) {
                    return null;
                }
                return serversBean.getMethod();
            }
            OutSettingsBean outSettingsBean4 = this.settings;
            if (outSettingsBean4 != null && (encryption = outSettingsBean4.getEncryption()) != null) {
                return encryption;
            }
            OutSettingsBean outSettingsBean5 = this.settings;
            if (outSettingsBean5 == null || (vnext = outSettingsBean5.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) vnext.get(0)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (OutSettingsBean.VnextBean.UsersBean) users.get(0)) == null) {
                return null;
            }
            return usersBean.getEncryption();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String g() {
            List vnext;
            OutSettingsBean.VnextBean vnextBean;
            List servers;
            OutSettingsBean.ServersBean serversBean;
            List peers;
            OutSettingsBean.WireGuardBean wireGuardBean;
            String endpoint;
            if (mm7.S(this.protocol, "VMESS") || mm7.S(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean = this.settings;
                Object address = outSettingsBean != null ? outSettingsBean.getAddress() : null;
                String str = address instanceof String ? (String) address : null;
                if (str != null) {
                    return str;
                }
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 != null && (vnext = outSettingsBean2.getVnext()) != null && (vnextBean = (OutSettingsBean.VnextBean) vnext.get(0)) != null) {
                    return vnextBean.getAddress();
                }
            } else if (mm7.S(this.protocol, "SHADOWSOCKS") || mm7.S(this.protocol, "SOCKS") || mm7.S(this.protocol, "TROJAN")) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 != null && (servers = outSettingsBean3.getServers()) != null && (serversBean = (OutSettingsBean.ServersBean) servers.get(0)) != null) {
                    return serversBean.getAddress();
                }
            } else if (mm7.S(this.protocol, "WIREGUARD")) {
                OutSettingsBean outSettingsBean4 = this.settings;
                if (outSettingsBean4 != null && (peers = outSettingsBean4.getPeers()) != null && (wireGuardBean = (OutSettingsBean.WireGuardBean) peers.get(0)) != null && (endpoint = wireGuardBean.getEndpoint()) != null) {
                    int iR0 = fm7.r0(endpoint, ":", 0, 6);
                    return iR0 == -1 ? endpoint : endpoint.substring(0, iR0);
                }
            } else if (mm7.S(this.protocol, "HYSTERIA")) {
                OutSettingsBean outSettingsBean5 = this.settings;
                return String.valueOf(outSettingsBean5 != null ? outSettingsBean5.getAddress() : null);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Integer h() {
            List vnext;
            OutSettingsBean.VnextBean vnextBean;
            Integer port;
            List servers;
            OutSettingsBean.ServersBean serversBean;
            OutSettingsBean outSettingsBean;
            List peers;
            OutSettingsBean.WireGuardBean wireGuardBean;
            String endpoint;
            if (mm7.S(this.protocol, "VMESS") || mm7.S(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 != null && (port = outSettingsBean2.getPort()) != null) {
                    return port;
                }
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (vnext = outSettingsBean3.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) vnext.get(0)) == null) {
                    return null;
                }
                return Integer.valueOf(vnextBean.getPort());
            }
            if (mm7.S(this.protocol, "SHADOWSOCKS") || mm7.S(this.protocol, "SOCKS") || mm7.S(this.protocol, "TROJAN")) {
                OutSettingsBean outSettingsBean4 = this.settings;
                if (outSettingsBean4 == null || (servers = outSettingsBean4.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) servers.get(0)) == null) {
                    return null;
                }
                return Integer.valueOf(serversBean.getPort());
            }
            if (!mm7.S(this.protocol, "WIREGUARD")) {
                if (!mm7.S(this.protocol, "HYSTERIA") || (outSettingsBean = this.settings) == null) {
                    return null;
                }
                return outSettingsBean.getPort();
            }
            OutSettingsBean outSettingsBean5 = this.settings;
            if (outSettingsBean5 == null || (peers = outSettingsBean5.getPeers()) == null || (wireGuardBean = (OutSettingsBean.WireGuardBean) peers.get(0)) == null || (endpoint = wireGuardBean.getEndpoint()) == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(fm7.L0(endpoint, ":")));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            int iE = pc6.e(this.tag.hashCode() * 31, 31, this.protocol);
            OutSettingsBean outSettingsBean = this.settings;
            int iHashCode = (iE + (outSettingsBean == null ? 0 : outSettingsBean.hashCode())) * 31;
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            int iHashCode2 = (iHashCode + (streamSettingsBean == null ? 0 : streamSettingsBean.hashCode())) * 31;
            Object obj = this.proxySettings;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str = this.sendThrough;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            MuxBean muxBean = this.mux;
            return iHashCode4 + (muxBean != null ? muxBean.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i, reason: from getter */
        public final OutSettingsBean getSettings() {
            return this.settings;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j, reason: from getter */
        public final StreamSettingsBean getStreamSettings() {
            return this.streamSettings;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Code duplicated, block: B:77:0x0113 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x0115  */
        /* JADX WARN: Code duplicated, block: B:80:0x011b  */
        /* JADX WARN: Code duplicated, block: B:81:0x011d  */
        public final List l() {
            StreamSettingsBean streamSettingsBean;
            String network;
            StreamSettingsBean.XhttpSettingsBean xhttpSettings;
            String string;
            StreamSettingsBean streamSettingsBean2;
            StreamSettingsBean.GrpcSettingsBean grpcSettings;
            StreamSettingsBean.HttpupgradeSettingsBean httpupgradeSettings;
            StreamSettingsBean.WsSettingsBean wsSettings;
            String type;
            StreamSettingsBean.KcpSettingsBean.HeaderBean header;
            String str;
            StreamSettingsBean.UdpMasksBean udpMasksBean;
            Map settings;
            StreamSettingsBean.UdpMasksBean udpMasksBean2;
            String type2;
            StreamSettingsBean.FinalMaskBean finalMask;
            StreamSettingsBean.TcpSettingsBean tcpSettings;
            List path;
            StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers;
            List host;
            String seed = null;
            if ((mm7.S(this.protocol, "VMESS") || mm7.S(this.protocol, "VLESS") || mm7.S(this.protocol, "TROJAN") || mm7.S(this.protocol, "SHADOWSOCKS")) && (streamSettingsBean = this.streamSettings) != null && (network = streamSettingsBean.getNetwork()) != null) {
                if (network.equals(EConfigNetworkType.TCP.getType())) {
                    StreamSettingsBean streamSettingsBean3 = this.streamSettings;
                    if (streamSettingsBean3 != null && (tcpSettings = streamSettingsBean3.getTcpSettings()) != null) {
                        String type3 = tcpSettings.getHeader().getType();
                        StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request = tcpSettings.getHeader().getRequest();
                        String strY0 = (request == null || (headers = request.getHeaders()) == null || (host = headers.getHost()) == null) ? null : wv0.y0(host, (CharSequence) null, (String) null, (String) null, (gn2) null, 63);
                        if (strY0 == null) {
                            strY0 = "";
                        }
                        StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request2 = tcpSettings.getHeader().getRequest();
                        if (request2 != null && (path = request2.getPath()) != null) {
                            seed = wv0.y0(path, (CharSequence) null, (String) null, (String) null, (gn2) null, 63);
                        }
                        return i21.L(new String[]{type3, strY0, seed != null ? seed : ""});
                    }
                } else {
                    if (network.equals(EConfigNetworkType.KCP.getType())) {
                        StreamSettingsBean streamSettingsBean4 = this.streamSettings;
                        List udp = (streamSettingsBean4 == null || (finalMask = streamSettingsBean4.getFinalMask()) == null) ? null : finalMask.getUdp();
                        StreamSettingsBean streamSettingsBean5 = this.streamSettings;
                        StreamSettingsBean.KcpSettingsBean kcpSettings = streamSettingsBean5 != null ? streamSettingsBean5.getKcpSettings() : null;
                        if (udp == null || (udpMasksBean2 = (StreamSettingsBean.UdpMasksBean) wv0.u0(0, udp)) == null || (type2 = udpMasksBean2.getType()) == null) {
                            type = (kcpSettings == null || (header = kcpSettings.getHeader()) == null) ? null : header.getType();
                            if (type == null) {
                                type = "";
                            }
                        } else {
                            type = mm7.W(type2, "header-", "", false);
                        }
                        if (udp == null || (udpMasksBean = (StreamSettingsBean.UdpMasksBean) wv0.u0(1, udp)) == null || (settings = udpMasksBean.getSettings()) == null) {
                            seed = kcpSettings != null ? kcpSettings.getSeed() : null;
                            if (seed == null) {
                                str = "";
                            } else {
                                str = seed;
                            }
                        } else {
                            Object obj = settings.get("password");
                            str = obj instanceof String ? (String) obj : null;
                            if (str == null) {
                                if (kcpSettings != null) {
                                }
                                if (seed == null) {
                                    str = "";
                                } else {
                                    str = seed;
                                }
                            }
                        }
                        return i21.L(new String[]{type, "", str});
                    }
                    if (network.equals(EConfigNetworkType.WS.getType())) {
                        StreamSettingsBean streamSettingsBean6 = this.streamSettings;
                        if (streamSettingsBean6 != null && (wsSettings = streamSettingsBean6.getWsSettings()) != null) {
                            return i21.L(new String[]{"", wsSettings.b(), wsSettings.getPath(), x79.e(wsSettings.getHeaders())});
                        }
                    } else if (network.equals(EConfigNetworkType.HTTP_UPGRADE.getType())) {
                        StreamSettingsBean streamSettingsBean7 = this.streamSettings;
                        if (streamSettingsBean7 != null && (httpupgradeSettings = streamSettingsBean7.getHttpupgradeSettings()) != null) {
                            return i21.L(new String[]{"", httpupgradeSettings.getHost(), httpupgradeSettings.getPath()});
                        }
                    } else if (network.equals(EConfigNetworkType.SPLIT_HTTP.getType()) || network.equals(EConfigNetworkType.XHTTP.getType())) {
                        StreamSettingsBean streamSettingsBean8 = this.streamSettings;
                        if (streamSettingsBean8 != null && (xhttpSettings = streamSettingsBean8.getXhttpSettings()) != null) {
                            if (xhttpSettings.getExtra() != null) {
                                try {
                                    string = new a().h(xhttpSettings.getExtra()).toString();
                                } catch (Throwable th) {
                                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                        throw th;
                                    }
                                    string = null;
                                }
                            } else {
                                string = null;
                            }
                            String mode = xhttpSettings.getMode();
                            String host2 = xhttpSettings.getHost();
                            String path2 = xhttpSettings.getPath();
                            seed = string != null ? string : null;
                            return i21.L(new String[]{mode, host2, path2, seed != null ? seed : ""});
                        }
                    } else if (network.equals(EConfigNetworkType.GRPC.getType()) && (streamSettingsBean2 = this.streamSettings) != null && (grpcSettings = streamSettingsBean2.getGrpcSettings()) != null) {
                        String str2 = dh3.f(grpcSettings.getMultiMode(), Boolean.TRUE) ? "multi" : "gun";
                        String authority = grpcSettings.getAuthority();
                        return i21.L(new String[]{str2, authority != null ? authority : "", grpcSettings.getServiceName()});
                    }
                }
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void m() {
            this.mux = null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void n(String str) {
            List vnext;
            OutSettingsBean.VnextBean vnextBean;
            List servers;
            OutSettingsBean.ServersBean serversBean;
            OutSettingsBean outSettingsBean;
            List peers;
            OutSettingsBean.WireGuardBean wireGuardBean;
            str.getClass();
            if (mm7.S(this.protocol, "VMESS") || mm7.S(this.protocol, "VLESS")) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 != null) {
                    outSettingsBean2.m(str);
                }
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (vnext = outSettingsBean3.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) vnext.get(0)) == null) {
                    return;
                }
                vnextBean.d();
                return;
            }
            if (mm7.S(this.protocol, "SHADOWSOCKS") || mm7.S(this.protocol, "SOCKS") || mm7.S(this.protocol, "TROJAN")) {
                OutSettingsBean outSettingsBean4 = this.settings;
                if (outSettingsBean4 == null || (servers = outSettingsBean4.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) servers.get(0)) == null) {
                    return;
                }
                serversBean.g(str);
                return;
            }
            if (!mm7.S(this.protocol, "WIREGUARD")) {
                if (!mm7.S(this.protocol, "HYSTERIA") || (outSettingsBean = this.settings) == null) {
                    return;
                }
                outSettingsBean.m(str);
                return;
            }
            OutSettingsBean outSettingsBean5 = this.settings;
            if (outSettingsBean5 == null || (peers = outSettingsBean5.getPeers()) == null || (wireGuardBean = (OutSettingsBean.WireGuardBean) peers.get(0)) == null) {
                return;
            }
            wireGuardBean.d(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void o(OutSettingsBean outSettingsBean) {
            this.settings = outSettingsBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void p(StreamSettingsBean streamSettingsBean) {
            this.streamSettings = streamSettingsBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void q(String str) {
            this.tag = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            String str = this.tag;
            String str2 = this.protocol;
            OutSettingsBean outSettingsBean = this.settings;
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            Object obj = this.proxySettings;
            String str3 = this.sendThrough;
            MuxBean muxBean = this.mux;
            StringBuilder sbT = oi0.t("OutboundBean(tag=", str, ", protocol=", str2, ", settings=");
            sbT.append(outSettingsBean);
            sbT.append(", streamSettings=");
            sbT.append(streamSettingsBean);
            sbT.append(", proxySettings=");
            sbT.append(obj);
            sbT.append(", sendThrough=");
            sbT.append(str3);
            sbT.append(", mux=");
            sbT.append(muxBean);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\rYZ[\\]^_`abcdeR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0019\u0010N\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;", "", "", "network", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "security", "h", "r", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "tcpSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "j", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "setTcpSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "kcpSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "e", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "setKcpSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "wsSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "l", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "setWsSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "httpupgradeSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "c", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "setHttpupgradeSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", "xhttpSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", "m", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", "setXhttpSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "tlsSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "k", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "t", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;)V", "realitySettings", "g", "q", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "grpcSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "b", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "setGrpcSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;", "hysteriaSettings", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;", "d", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;", "setHysteriaSettings", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;", "finalMask", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;", "a", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;", "o", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V", "dsSettings", "Ljava/lang/Object;", "getDsSettings", "()Ljava/lang/Object;", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "sockopt", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "i", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "s", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;)V", "TcpSettingsBean", "KcpSettingsBean", "WsSettingsBean", "HttpupgradeSettingsBean", "XhttpSettingsBean", "SockoptBean", "TlsSettingsBean", "GrpcSettingsBean", "HysteriaSettingsBean", "TcpMasksBean", "UdpMasksBean", "QuicParamsBean", "FinalMaskBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class StreamSettingsBean {
            public static final int $stable = 8;
            private final Object dsSettings;

            @p37("finalmask")
            private FinalMaskBean finalMask;
            private GrpcSettingsBean grpcSettings;
            private HttpupgradeSettingsBean httpupgradeSettings;
            private HysteriaSettingsBean hysteriaSettings;
            private KcpSettingsBean kcpSettings;
            private String network;
            private TlsSettingsBean realitySettings;
            private String security;
            private SockoptBean sockopt;
            private TcpSettingsBean tcpSettings;
            private TlsSettingsBean tlsSettings;
            private WsSettingsBean wsSettings;
            private XhttpSettingsBean xhttpSettings;

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;", "", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;", "tcp", "Ljava/util/List;", "b", "()Ljava/util/List;", "e", "(Ljava/util/List;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;", "udp", "c", "f", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$QuicParamsBean;", "quicParams", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$QuicParamsBean;", "a", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$QuicParamsBean;", "d", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$QuicParamsBean;)V", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class FinalMaskBean {
                public static final int $stable = 8;
                private QuicParamsBean quicParams;
                private List<TcpMasksBean> tcp;
                private List<UdpMasksBean> udp;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public FinalMaskBean(List list, List list2, int i) {
                    list = (i & 1) != 0 ? null : list;
                    list2 = (i & 2) != 0 ? null : list2;
                    this.tcp = list;
                    this.udp = list2;
                    this.quicParams = null;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final QuicParamsBean getQuicParams() {
                    return this.quicParams;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final List getTcp() {
                    return this.tcp;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final List getUdp() {
                    return this.udp;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d(QuicParamsBean quicParamsBean) {
                    this.quicParams = quicParamsBean;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void e(List list) {
                    this.tcp = list;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FinalMaskBean)) {
                        return false;
                    }
                    FinalMaskBean finalMaskBean = (FinalMaskBean) obj;
                    return dh3.f(this.tcp, finalMaskBean.tcp) && dh3.f(this.udp, finalMaskBean.udp) && dh3.f(this.quicParams, finalMaskBean.quicParams);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void f(List list) {
                    this.udp = list;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    List<TcpMasksBean> list = this.tcp;
                    int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                    List<UdpMasksBean> list2 = this.udp;
                    int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
                    QuicParamsBean quicParamsBean = this.quicParams;
                    return iHashCode2 + (quicParamsBean != null ? quicParamsBean.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "FinalMaskBean(tcp=" + this.tcp + ", udp=" + this.udp + ", quicParams=" + this.quicParams + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "", "", "serviceName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "authority", "a", "d", "", "multiMode", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "e", "(Ljava/lang/Boolean;)V", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class GrpcSettingsBean {
                public static final int $stable = 8;
                private String serviceName = "";
                private String authority = null;
                private Boolean multiMode = null;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAuthority() {
                    return this.authority;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final Boolean getMultiMode() {
                    return this.multiMode;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getServiceName() {
                    return this.serviceName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d(String str) {
                    this.authority = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void e(Boolean bool) {
                    this.multiMode = bool;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof GrpcSettingsBean)) {
                        return false;
                    }
                    GrpcSettingsBean grpcSettingsBean = (GrpcSettingsBean) obj;
                    return dh3.f(this.serviceName, grpcSettingsBean.serviceName) && dh3.f(this.authority, grpcSettingsBean.authority) && dh3.f(this.multiMode, grpcSettingsBean.multiMode);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void f(String str) {
                    this.serviceName = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.serviceName.hashCode() * 31;
                    String str = this.authority;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.multiMode;
                    return iHashCode2 + (bool != null ? bool.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.serviceName;
                    String str2 = this.authority;
                    Boolean bool = this.multiMode;
                    StringBuilder sbT = oi0.t("GrpcSettingsBean(serviceName=", str, ", authority=", str2, ", multiMode=");
                    sbT.append(bool);
                    sbT.append(")");
                    return sbT.toString();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "", "", "path", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", MetaParams.HOST, "a", "c", "", "acceptProxyProtocol", "Ljava/lang/Boolean;", "getAcceptProxyProtocol", "()Ljava/lang/Boolean;", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class HttpupgradeSettingsBean {
                public static final int $stable = 8;
                private String path = "";
                private String host = "";
                private final Boolean acceptProxyProtocol = null;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getHost() {
                    return this.host;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void c(String str) {
                    this.host = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d(String str) {
                    this.path = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HttpupgradeSettingsBean)) {
                        return false;
                    }
                    HttpupgradeSettingsBean httpupgradeSettingsBean = (HttpupgradeSettingsBean) obj;
                    return dh3.f(this.path, httpupgradeSettingsBean.path) && dh3.f(this.host, httpupgradeSettingsBean.host) && dh3.f(this.acceptProxyProtocol, httpupgradeSettingsBean.acceptProxyProtocol);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iE = pc6.e(this.path.hashCode() * 31, 31, this.host);
                    Boolean bool = this.acceptProxyProtocol;
                    return iE + (bool == null ? 0 : bool.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.path;
                    String str2 = this.host;
                    Boolean bool = this.acceptProxyProtocol;
                    StringBuilder sbT = oi0.t("HttpupgradeSettingsBean(path=", str, ", host=", str2, ", acceptProxyProtocol=");
                    sbT.append(bool);
                    sbT.append(")");
                    return sbT.toString();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;", "", "", "auth", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "", "version", "I", "getVersion", "()I", "setVersion", "(I)V", "udpIdleTimeout", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "(Ljava/lang/Integer;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean$Masquerade;", "masquerade", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean$Masquerade;", "getMasquerade", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean$Masquerade;", "setMasquerade", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean$Masquerade;)V", "Companion", "Masquerade", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class HysteriaSettingsBean {
                public static final int $stable = 8;
                public static final int udpIdleTimeoutMax = 600;
                public static final int udpIdleTimeoutMin = 2;
                private String auth = "";
                private int version = 2;
                private Integer udpIdleTimeout = null;
                private Masquerade masquerade = null;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean$Masquerade;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "dir", "getDir", "setDir", "url", "getUrl", "setUrl", "", "rewriteHost", "Z", "getRewriteHost", "()Z", "setRewriteHost", "(Z)V", MetaParams.INSECURE, "getInsecure", "setInsecure", "content", "getContent", "setContent", "", "headers", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "", "statusCode", "I", "getStatusCode", "()I", "setStatusCode", "(I)V", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class Masquerade {
                    public static final int $stable = 8;
                    private String content;
                    private String dir;
                    private Map<String, String> headers;
                    private boolean insecure;
                    private boolean rewriteHost;
                    private int statusCode;
                    private String type;
                    private String url;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Masquerade)) {
                            return false;
                        }
                        Masquerade masquerade = (Masquerade) obj;
                        return dh3.f(this.type, masquerade.type) && dh3.f(this.dir, masquerade.dir) && dh3.f(this.url, masquerade.url) && this.rewriteHost == masquerade.rewriteHost && this.insecure == masquerade.insecure && dh3.f(this.content, masquerade.content) && dh3.f(this.headers, masquerade.headers) && this.statusCode == masquerade.statusCode;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        return Integer.hashCode(this.statusCode) + ((this.headers.hashCode() + pc6.e(pc6.f(pc6.f(pc6.e(pc6.e(this.type.hashCode() * 31, 31, this.dir), 31, this.url), 31, this.rewriteHost), 31, this.insecure), 31, this.content)) * 31);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        String str = this.type;
                        String str2 = this.dir;
                        String str3 = this.url;
                        boolean z = this.rewriteHost;
                        boolean z2 = this.insecure;
                        String str4 = this.content;
                        Map<String, String> map = this.headers;
                        int i = this.statusCode;
                        StringBuilder sbT = oi0.t("Masquerade(type=", str, ", dir=", str2, ", url=");
                        sbT.append(str3);
                        sbT.append(", rewriteHost=");
                        sbT.append(z);
                        sbT.append(", insecure=");
                        sbT.append(z2);
                        sbT.append(", content=");
                        sbT.append(str4);
                        sbT.append(", headers=");
                        sbT.append(map);
                        sbT.append(", statusCode=");
                        sbT.append(i);
                        sbT.append(")");
                        return sbT.toString();
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAuth() {
                    return this.auth;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final Integer getUdpIdleTimeout() {
                    return this.udpIdleTimeout;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void c(String str) {
                    this.auth = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d(Integer num) {
                    this.udpIdleTimeout = num;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HysteriaSettingsBean)) {
                        return false;
                    }
                    HysteriaSettingsBean hysteriaSettingsBean = (HysteriaSettingsBean) obj;
                    return dh3.f(this.auth, hysteriaSettingsBean.auth) && this.version == hysteriaSettingsBean.version && dh3.f(this.udpIdleTimeout, hysteriaSettingsBean.udpIdleTimeout) && dh3.f(this.masquerade, hysteriaSettingsBean.masquerade);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iE = oi0.e(this.version, this.auth.hashCode() * 31, 31);
                    Integer num = this.udpIdleTimeout;
                    int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
                    Masquerade masquerade = this.masquerade;
                    return iHashCode + (masquerade != null ? masquerade.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "HysteriaSettingsBean(auth=" + this.auth + ", version=" + this.version + ", udpIdleTimeout=" + this.udpIdleTimeout + ", masquerade=" + this.masquerade + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002,-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R*\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010#\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "", "", "mtu", "I", "d", "()I", "setMtu", "(I)V", "tti", "f", "setTti", "uplinkCapacity", "getUplinkCapacity", "setUplinkCapacity", "downlinkCapacity", "getDownlinkCapacity", "setDownlinkCapacity", "cwndMultiplier", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "setCwndMultiplier", "(Ljava/lang/Integer;)V", "maxSendingWindow", "c", "setMaxSendingWindow", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "header", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "b", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "setHeader", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;)V", "getHeader$annotations", "()V", "", "seed", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setSeed", "(Ljava/lang/String;)V", "getSeed$annotations", "Companion", "HeaderBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class KcpSettingsBean {
                public static final int $stable = 8;
                public static final int cwndMultiplierMin = 1;
                public static final int mtuMin = 21;
                public static final int ttiMax = 1000;
                public static final int ttiMin = 10;
                private Integer cwndMultiplier;
                private Integer maxSendingWindow;
                private int mtu;
                private int tti;
                private int uplinkCapacity = 12;
                private int downlinkCapacity = 100;
                private HeaderBean header = null;
                private String seed = null;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "domain", "getDomain", "setDomain", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class HeaderBean {
                    public static final int $stable = 8;
                    private String domain;
                    private String type;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof HeaderBean)) {
                            return false;
                        }
                        HeaderBean headerBean = (HeaderBean) obj;
                        return dh3.f(this.type, headerBean.type) && dh3.f(this.domain, headerBean.domain);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        int iHashCode = this.type.hashCode() * 31;
                        String str = this.domain;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        return pc6.q("HeaderBean(type=", this.type, ", domain=", this.domain, ")");
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public KcpSettingsBean(int i, int i2, Integer num, Integer num2) {
                    this.mtu = i;
                    this.tti = i2;
                    this.cwndMultiplier = num;
                    this.maxSendingWindow = num2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Integer getCwndMultiplier() {
                    return this.cwndMultiplier;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final HeaderBean getHeader() {
                    return this.header;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final Integer getMaxSendingWindow() {
                    return this.maxSendingWindow;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: d, reason: from getter */
                public final int getMtu() {
                    return this.mtu;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getSeed() {
                    return this.seed;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof KcpSettingsBean)) {
                        return false;
                    }
                    KcpSettingsBean kcpSettingsBean = (KcpSettingsBean) obj;
                    return this.mtu == kcpSettingsBean.mtu && this.tti == kcpSettingsBean.tti && this.uplinkCapacity == kcpSettingsBean.uplinkCapacity && this.downlinkCapacity == kcpSettingsBean.downlinkCapacity && dh3.f(this.cwndMultiplier, kcpSettingsBean.cwndMultiplier) && dh3.f(this.maxSendingWindow, kcpSettingsBean.maxSendingWindow) && dh3.f(this.header, kcpSettingsBean.header) && dh3.f(this.seed, kcpSettingsBean.seed);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: f, reason: from getter */
                public final int getTti() {
                    return this.tti;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iE = oi0.e(this.downlinkCapacity, oi0.e(this.uplinkCapacity, oi0.e(this.tti, Integer.hashCode(this.mtu) * 31, 31), 31), 31);
                    Integer num = this.cwndMultiplier;
                    int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.maxSendingWindow;
                    int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    HeaderBean headerBean = this.header;
                    int iHashCode3 = (iHashCode2 + (headerBean == null ? 0 : headerBean.hashCode())) * 31;
                    String str = this.seed;
                    return iHashCode3 + (str != null ? str.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    int i = this.mtu;
                    int i2 = this.tti;
                    int i3 = this.uplinkCapacity;
                    int i4 = this.downlinkCapacity;
                    Integer num = this.cwndMultiplier;
                    Integer num2 = this.maxSendingWindow;
                    HeaderBean headerBean = this.header;
                    String str = this.seed;
                    StringBuilder sbR = oi0.r(i, "KcpSettingsBean(mtu=", i2, ", tti=", ", uplinkCapacity=");
                    oi0.x(sbR, i3, ", downlinkCapacity=", i4, ", cwndMultiplier=");
                    sbR.append(num);
                    sbR.append(", maxSendingWindow=");
                    sbR.append(num2);
                    sbR.append(", header=");
                    sbR.append(headerBean);
                    sbR.append(", seed=");
                    sbR.append(str);
                    sbR.append(")");
                    return sbR.toString();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR$\u0010)\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR$\u0010,\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR$\u0010/\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R$\u00102\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001fR$\u00105\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$QuicParamsBean;", "", "", "congestion", "Ljava/lang/String;", "getCongestion", "()Ljava/lang/String;", "setCongestion", "(Ljava/lang/String;)V", "bbrProfile", "getBbrProfile", "setBbrProfile", "", "debug", "Ljava/lang/Boolean;", "getDebug", "()Ljava/lang/Boolean;", "setDebug", "(Ljava/lang/Boolean;)V", "brutalUp", "getBrutalUp", "setBrutalUp", "brutalDown", "getBrutalDown", "setBrutalDown", "", "initStreamReceiveWindow", "Ljava/lang/Integer;", "getInitStreamReceiveWindow", "()Ljava/lang/Integer;", "setInitStreamReceiveWindow", "(Ljava/lang/Integer;)V", "maxStreamReceiveWindow", "getMaxStreamReceiveWindow", "setMaxStreamReceiveWindow", "initConnectionReceiveWindow", "getInitConnectionReceiveWindow", "setInitConnectionReceiveWindow", "maxConnectionReceiveWindow", "getMaxConnectionReceiveWindow", "setMaxConnectionReceiveWindow", "maxIdleTimeout", "getMaxIdleTimeout", "setMaxIdleTimeout", "keepAlivePeriod", "getKeepAlivePeriod", "setKeepAlivePeriod", "disablePathMTUDiscovery", "getDisablePathMTUDiscovery", "setDisablePathMTUDiscovery", "maxIncomingStreams", "getMaxIncomingStreams", "setMaxIncomingStreams", "udpHop", "Ljava/lang/Object;", "getUdpHop", "()Ljava/lang/Object;", "setUdpHop", "(Ljava/lang/Object;)V", "Companion", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class QuicParamsBean {
                public static final int $stable = 8;
                public static final int DEFAULT_CONNECTION_WINDOW = 20971520;
                public static final int DEFAULT_MAX_IDLE_TIMEOUT = 30;
                public static final int DEFAULT_STREAM_WINDOW = 8388608;
                private String brutalDown;
                private String brutalUp;
                private String congestion = null;
                private String bbrProfile = null;
                private Boolean debug = null;
                private Integer initStreamReceiveWindow = null;
                private Integer maxStreamReceiveWindow = null;
                private Integer initConnectionReceiveWindow = null;
                private Integer maxConnectionReceiveWindow = null;
                private Integer maxIdleTimeout = null;
                private Integer keepAlivePeriod = null;
                private Boolean disablePathMTUDiscovery = null;
                private Integer maxIncomingStreams = null;
                private Object udpHop = null;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public QuicParamsBean(String str, String str2) {
                    this.brutalUp = str;
                    this.brutalDown = str2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QuicParamsBean)) {
                        return false;
                    }
                    QuicParamsBean quicParamsBean = (QuicParamsBean) obj;
                    return dh3.f(this.congestion, quicParamsBean.congestion) && dh3.f(this.bbrProfile, quicParamsBean.bbrProfile) && dh3.f(this.debug, quicParamsBean.debug) && dh3.f(this.brutalUp, quicParamsBean.brutalUp) && dh3.f(this.brutalDown, quicParamsBean.brutalDown) && dh3.f(this.initStreamReceiveWindow, quicParamsBean.initStreamReceiveWindow) && dh3.f(this.maxStreamReceiveWindow, quicParamsBean.maxStreamReceiveWindow) && dh3.f(this.initConnectionReceiveWindow, quicParamsBean.initConnectionReceiveWindow) && dh3.f(this.maxConnectionReceiveWindow, quicParamsBean.maxConnectionReceiveWindow) && dh3.f(this.maxIdleTimeout, quicParamsBean.maxIdleTimeout) && dh3.f(this.keepAlivePeriod, quicParamsBean.keepAlivePeriod) && dh3.f(this.disablePathMTUDiscovery, quicParamsBean.disablePathMTUDiscovery) && dh3.f(this.maxIncomingStreams, quicParamsBean.maxIncomingStreams) && dh3.f(this.udpHop, quicParamsBean.udpHop);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    String str = this.congestion;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.bbrProfile;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Boolean bool = this.debug;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    String str3 = this.brutalUp;
                    int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.brutalDown;
                    int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    Integer num = this.initStreamReceiveWindow;
                    int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.maxStreamReceiveWindow;
                    int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.initConnectionReceiveWindow;
                    int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Integer num4 = this.maxConnectionReceiveWindow;
                    int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.maxIdleTimeout;
                    int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Integer num6 = this.keepAlivePeriod;
                    int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                    Boolean bool2 = this.disablePathMTUDiscovery;
                    int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num7 = this.maxIncomingStreams;
                    int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                    Object obj = this.udpHop;
                    return iHashCode13 + (obj != null ? obj.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.congestion;
                    String str2 = this.bbrProfile;
                    Boolean bool = this.debug;
                    String str3 = this.brutalUp;
                    String str4 = this.brutalDown;
                    Integer num = this.initStreamReceiveWindow;
                    Integer num2 = this.maxStreamReceiveWindow;
                    Integer num3 = this.initConnectionReceiveWindow;
                    Integer num4 = this.maxConnectionReceiveWindow;
                    Integer num5 = this.maxIdleTimeout;
                    Integer num6 = this.keepAlivePeriod;
                    Boolean bool2 = this.disablePathMTUDiscovery;
                    Integer num7 = this.maxIncomingStreams;
                    Object obj = this.udpHop;
                    StringBuilder sbT = oi0.t("QuicParamsBean(congestion=", str, ", bbrProfile=", str2, ", debug=");
                    sbT.append(bool);
                    sbT.append(", brutalUp=");
                    sbT.append(str3);
                    sbT.append(", brutalDown=");
                    sbT.append(str4);
                    sbT.append(", initStreamReceiveWindow=");
                    sbT.append(num);
                    sbT.append(", maxStreamReceiveWindow=");
                    sbT.append(num2);
                    sbT.append(", initConnectionReceiveWindow=");
                    sbT.append(num3);
                    sbT.append(", maxConnectionReceiveWindow=");
                    sbT.append(num4);
                    sbT.append(", maxIdleTimeout=");
                    sbT.append(num5);
                    sbT.append(", keepAlivePeriod=");
                    sbT.append(num6);
                    sbT.append(", disablePathMTUDiscovery=");
                    sbT.append(bool2);
                    sbT.append(", maxIncomingStreams=");
                    sbT.append(num7);
                    sbT.append(", udpHop=");
                    sbT.append(obj);
                    sbT.append(")");
                    return sbT.toString();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR$\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "", "", "TcpNoDelay", "Ljava/lang/Boolean;", "getTcpNoDelay", "()Ljava/lang/Boolean;", "setTcpNoDelay", "(Ljava/lang/Boolean;)V", "", "tcpKeepAliveIdle", "Ljava/lang/Integer;", "getTcpKeepAliveIdle", "()Ljava/lang/Integer;", "setTcpKeepAliveIdle", "(Ljava/lang/Integer;)V", "tcpFastOpen", "getTcpFastOpen", "setTcpFastOpen", "", "tproxy", "Ljava/lang/String;", "getTproxy", "()Ljava/lang/String;", "setTproxy", "(Ljava/lang/String;)V", "mark", "getMark", "setMark", "dialerProxy", "getDialerProxy", "a", "domainStrategy", "getDomainStrategy", "b", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean$HappyEyeballsBean;", "happyEyeballs", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean$HappyEyeballsBean;", "getHappyEyeballs", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean$HappyEyeballsBean;", "setHappyEyeballs", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean$HappyEyeballsBean;)V", "HappyEyeballsBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class SockoptBean {
                public static final int $stable = 8;
                private Boolean TcpNoDelay;
                private String dialerProxy;
                private String domainStrategy;
                private HappyEyeballsBean happyEyeballs;
                private Integer mark;
                private Boolean tcpFastOpen;
                private Integer tcpKeepAliveIdle;
                private String tproxy;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean$HappyEyeballsBean;", "", "", "prioritizeIPv6", "Ljava/lang/Boolean;", "getPrioritizeIPv6", "()Ljava/lang/Boolean;", "setPrioritizeIPv6", "(Ljava/lang/Boolean;)V", "", "maxConcurrentTry", "Ljava/lang/Integer;", "getMaxConcurrentTry", "()Ljava/lang/Integer;", "setMaxConcurrentTry", "(Ljava/lang/Integer;)V", "tryDelayMs", "getTryDelayMs", "setTryDelayMs", "interleave", "getInterleave", "setInterleave", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class HappyEyeballsBean {
                    public static final int $stable = 8;
                    private Integer interleave;
                    private Integer maxConcurrentTry;
                    private Boolean prioritizeIPv6;
                    private Integer tryDelayMs;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof HappyEyeballsBean)) {
                            return false;
                        }
                        HappyEyeballsBean happyEyeballsBean = (HappyEyeballsBean) obj;
                        return dh3.f(this.prioritizeIPv6, happyEyeballsBean.prioritizeIPv6) && dh3.f(this.maxConcurrentTry, happyEyeballsBean.maxConcurrentTry) && dh3.f(this.tryDelayMs, happyEyeballsBean.tryDelayMs) && dh3.f(this.interleave, happyEyeballsBean.interleave);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        Boolean bool = this.prioritizeIPv6;
                        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                        Integer num = this.maxConcurrentTry;
                        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                        Integer num2 = this.tryDelayMs;
                        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                        Integer num3 = this.interleave;
                        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        return "HappyEyeballsBean(prioritizeIPv6=" + this.prioritizeIPv6 + ", maxConcurrentTry=" + this.maxConcurrentTry + ", tryDelayMs=" + this.tryDelayMs + ", interleave=" + this.interleave + ")";
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public SockoptBean(int i) {
                    Boolean bool = (i & 1) != 0 ? null : Boolean.TRUE;
                    Integer num = (i & 16) != 0 ? null : 255;
                    this.TcpNoDelay = bool;
                    this.tcpKeepAliveIdle = null;
                    this.tcpFastOpen = null;
                    this.tproxy = null;
                    this.mark = num;
                    this.dialerProxy = null;
                    this.domainStrategy = null;
                    this.happyEyeballs = null;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void a() {
                    this.dialerProxy = "antifilter";
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void b(String str) {
                    this.domainStrategy = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SockoptBean)) {
                        return false;
                    }
                    SockoptBean sockoptBean = (SockoptBean) obj;
                    return dh3.f(this.TcpNoDelay, sockoptBean.TcpNoDelay) && dh3.f(this.tcpKeepAliveIdle, sockoptBean.tcpKeepAliveIdle) && dh3.f(this.tcpFastOpen, sockoptBean.tcpFastOpen) && dh3.f(this.tproxy, sockoptBean.tproxy) && dh3.f(this.mark, sockoptBean.mark) && dh3.f(this.dialerProxy, sockoptBean.dialerProxy) && dh3.f(this.domainStrategy, sockoptBean.domainStrategy) && dh3.f(this.happyEyeballs, sockoptBean.happyEyeballs);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    Boolean bool = this.TcpNoDelay;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.tcpKeepAliveIdle;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.tcpFastOpen;
                    int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    String str = this.tproxy;
                    int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num2 = this.mark;
                    int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    String str2 = this.dialerProxy;
                    int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.domainStrategy;
                    int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    HappyEyeballsBean happyEyeballsBean = this.happyEyeballs;
                    return iHashCode7 + (happyEyeballsBean != null ? happyEyeballsBean.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "SockoptBean(TcpNoDelay=" + this.TcpNoDelay + ", tcpKeepAliveIdle=" + this.tcpKeepAliveIdle + ", tcpFastOpen=" + this.tcpFastOpen + ", tproxy=" + this.tproxy + ", mark=" + this.mark + ", dialerProxy=" + this.dialerProxy + ", domainStrategy=" + this.domainStrategy + ", happyEyeballs=" + this.happyEyeballs + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001AR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR$\u00104\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=¨\u0006B"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "", "", "serverName", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "setServerName", "(Ljava/lang/String;)V", "", "alpn", "Ljava/util/List;", "b", "()Ljava/util/List;", "minVersion", "getMinVersion", "maxVersion", "getMaxVersion", "", "preferServerCipherSuites", "Ljava/lang/Boolean;", "getPreferServerCipherSuites", "()Ljava/lang/Boolean;", "cipherSuites", "getCipherSuites", "fingerprint", "d", "certificates", "getCertificates", "disableSystemRoot", "getDisableSystemRoot", "enableSessionResumption", "getEnableSessionResumption", "pinnedPeerCertSha256", "f", "verifyPeerCertByName", "k", "echConfigList", "c", "show", "Z", "getShow", "()Z", "publicKey", "g", "setPublicKey", "shortId", "i", "setShortId", "spiderX", "j", "setSpiderX", "mldsa65Verify", "e", "setMldsa65Verify", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean$LimitFallbackBean;", "limitFallbackUpload", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean$LimitFallbackBean;", "getLimitFallbackUpload", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean$LimitFallbackBean;", "setLimitFallbackUpload", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean$LimitFallbackBean;)V", "limitFallbackDownload", "getLimitFallbackDownload", "setLimitFallbackDownload", "LimitFallbackBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class TlsSettingsBean {
                public static final int $stable = 8;
                private final List<String> alpn;
                private final List<Object> certificates;
                private final String cipherSuites;
                private final Boolean disableSystemRoot;
                private final String echConfigList;
                private final Boolean enableSessionResumption;
                private final String fingerprint;
                private LimitFallbackBean limitFallbackDownload;
                private LimitFallbackBean limitFallbackUpload;
                private final String maxVersion;
                private final String minVersion;
                private String mldsa65Verify;
                private final String pinnedPeerCertSha256;
                private final Boolean preferServerCipherSuites;
                private String publicKey;
                private String serverName;
                private String shortId;
                private final boolean show;
                private String spiderX;
                private final String verifyPeerCertByName;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean$LimitFallbackBean;", "", "", "afterBytes", "I", "getAfterBytes", "()I", "setAfterBytes", "(I)V", "bytesPerSec", "getBytesPerSec", "setBytesPerSec", "burstBytesPerSec", "getBurstBytesPerSec", "setBurstBytesPerSec", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class LimitFallbackBean {
                    public static final int $stable = 8;
                    private int afterBytes;
                    private int burstBytesPerSec;
                    private int bytesPerSec;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof LimitFallbackBean)) {
                            return false;
                        }
                        LimitFallbackBean limitFallbackBean = (LimitFallbackBean) obj;
                        return this.afterBytes == limitFallbackBean.afterBytes && this.bytesPerSec == limitFallbackBean.bytesPerSec && this.burstBytesPerSec == limitFallbackBean.burstBytesPerSec;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        return Integer.hashCode(this.burstBytesPerSec) + oi0.e(this.bytesPerSec, Integer.hashCode(this.afterBytes) * 31, 31);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        int i = this.afterBytes;
                        int i2 = this.bytesPerSec;
                        return oi0.n(oi0.r(i, "LimitFallbackBean(afterBytes=", i2, ", bytesPerSec=", ", burstBytesPerSec="), this.burstBytesPerSec, ")");
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public TlsSettingsBean(String str, List list, String str2, String str3, Boolean bool, String str4, String str5, List list2, Boolean bool2, Boolean bool3, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, LimitFallbackBean limitFallbackBean, LimitFallbackBean limitFallbackBean2) {
                    this.serverName = str;
                    this.alpn = list;
                    this.minVersion = str2;
                    this.maxVersion = str3;
                    this.preferServerCipherSuites = bool;
                    this.cipherSuites = str4;
                    this.fingerprint = str5;
                    this.certificates = list2;
                    this.disableSystemRoot = bool2;
                    this.enableSessionResumption = bool3;
                    this.pinnedPeerCertSha256 = str6;
                    this.verifyPeerCertByName = str7;
                    this.echConfigList = str8;
                    this.show = z;
                    this.publicKey = str9;
                    this.shortId = str10;
                    this.spiderX = str11;
                    this.mldsa65Verify = str12;
                    this.limitFallbackUpload = limitFallbackBean;
                    this.limitFallbackDownload = limitFallbackBean2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public static TlsSettingsBean a(TlsSettingsBean tlsSettingsBean, List list) {
                    return new TlsSettingsBean(tlsSettingsBean.serverName, list, tlsSettingsBean.minVersion, tlsSettingsBean.maxVersion, tlsSettingsBean.preferServerCipherSuites, tlsSettingsBean.cipherSuites, tlsSettingsBean.fingerprint, tlsSettingsBean.certificates, tlsSettingsBean.disableSystemRoot, tlsSettingsBean.enableSessionResumption, tlsSettingsBean.pinnedPeerCertSha256, tlsSettingsBean.verifyPeerCertByName, tlsSettingsBean.echConfigList, tlsSettingsBean.show, tlsSettingsBean.publicKey, tlsSettingsBean.shortId, tlsSettingsBean.spiderX, tlsSettingsBean.mldsa65Verify, tlsSettingsBean.limitFallbackUpload, tlsSettingsBean.limitFallbackDownload);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final List getAlpn() {
                    return this.alpn;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getEchConfigList() {
                    return this.echConfigList;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getFingerprint() {
                    return this.fingerprint;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getMldsa65Verify() {
                    return this.mldsa65Verify;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TlsSettingsBean)) {
                        return false;
                    }
                    TlsSettingsBean tlsSettingsBean = (TlsSettingsBean) obj;
                    return dh3.f(this.serverName, tlsSettingsBean.serverName) && dh3.f(this.alpn, tlsSettingsBean.alpn) && dh3.f(this.minVersion, tlsSettingsBean.minVersion) && dh3.f(this.maxVersion, tlsSettingsBean.maxVersion) && dh3.f(this.preferServerCipherSuites, tlsSettingsBean.preferServerCipherSuites) && dh3.f(this.cipherSuites, tlsSettingsBean.cipherSuites) && dh3.f(this.fingerprint, tlsSettingsBean.fingerprint) && dh3.f(this.certificates, tlsSettingsBean.certificates) && dh3.f(this.disableSystemRoot, tlsSettingsBean.disableSystemRoot) && dh3.f(this.enableSessionResumption, tlsSettingsBean.enableSessionResumption) && dh3.f(this.pinnedPeerCertSha256, tlsSettingsBean.pinnedPeerCertSha256) && dh3.f(this.verifyPeerCertByName, tlsSettingsBean.verifyPeerCertByName) && dh3.f(this.echConfigList, tlsSettingsBean.echConfigList) && this.show == tlsSettingsBean.show && dh3.f(this.publicKey, tlsSettingsBean.publicKey) && dh3.f(this.shortId, tlsSettingsBean.shortId) && dh3.f(this.spiderX, tlsSettingsBean.spiderX) && dh3.f(this.mldsa65Verify, tlsSettingsBean.mldsa65Verify) && dh3.f(this.limitFallbackUpload, tlsSettingsBean.limitFallbackUpload) && dh3.f(this.limitFallbackDownload, tlsSettingsBean.limitFallbackDownload);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: f, reason: from getter */
                public final String getPinnedPeerCertSha256() {
                    return this.pinnedPeerCertSha256;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: g, reason: from getter */
                public final String getPublicKey() {
                    return this.publicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: h, reason: from getter */
                public final String getServerName() {
                    return this.serverName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    String str = this.serverName;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    List<String> list = this.alpn;
                    int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                    String str2 = this.minVersion;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.maxVersion;
                    int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Boolean bool = this.preferServerCipherSuites;
                    int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                    String str4 = this.cipherSuites;
                    int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.fingerprint;
                    int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    List<Object> list2 = this.certificates;
                    int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    Boolean bool2 = this.disableSystemRoot;
                    int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Boolean bool3 = this.enableSessionResumption;
                    int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    String str6 = this.pinnedPeerCertSha256;
                    int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    String str7 = this.verifyPeerCertByName;
                    int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.echConfigList;
                    int iF = pc6.f((iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.show);
                    String str9 = this.publicKey;
                    int iHashCode13 = (iF + (str9 == null ? 0 : str9.hashCode())) * 31;
                    String str10 = this.shortId;
                    int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
                    String str11 = this.spiderX;
                    int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
                    String str12 = this.mldsa65Verify;
                    int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
                    LimitFallbackBean limitFallbackBean = this.limitFallbackUpload;
                    int iHashCode17 = (iHashCode16 + (limitFallbackBean == null ? 0 : limitFallbackBean.hashCode())) * 31;
                    LimitFallbackBean limitFallbackBean2 = this.limitFallbackDownload;
                    return iHashCode17 + (limitFallbackBean2 != null ? limitFallbackBean2.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: i, reason: from getter */
                public final String getShortId() {
                    return this.shortId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: j, reason: from getter */
                public final String getSpiderX() {
                    return this.spiderX;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: k, reason: from getter */
                public final String getVerifyPeerCertByName() {
                    return this.verifyPeerCertByName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.serverName;
                    List<String> list = this.alpn;
                    String str2 = this.minVersion;
                    String str3 = this.maxVersion;
                    Boolean bool = this.preferServerCipherSuites;
                    String str4 = this.cipherSuites;
                    String str5 = this.fingerprint;
                    List<Object> list2 = this.certificates;
                    Boolean bool2 = this.disableSystemRoot;
                    Boolean bool3 = this.enableSessionResumption;
                    String str6 = this.pinnedPeerCertSha256;
                    String str7 = this.verifyPeerCertByName;
                    String str8 = this.echConfigList;
                    boolean z = this.show;
                    String str9 = this.publicKey;
                    String str10 = this.shortId;
                    String str11 = this.spiderX;
                    String str12 = this.mldsa65Verify;
                    LimitFallbackBean limitFallbackBean = this.limitFallbackUpload;
                    LimitFallbackBean limitFallbackBean2 = this.limitFallbackDownload;
                    StringBuilder sb = new StringBuilder("TlsSettingsBean(serverName=");
                    sb.append(str);
                    sb.append(", alpn=");
                    sb.append(list);
                    sb.append(", minVersion=");
                    oi0.y(sb, str2, ", maxVersion=", str3, ", preferServerCipherSuites=");
                    sb.append(bool);
                    sb.append(", cipherSuites=");
                    sb.append(str4);
                    sb.append(", fingerprint=");
                    sb.append(str5);
                    sb.append(", certificates=");
                    sb.append(list2);
                    sb.append(", disableSystemRoot=");
                    sb.append(bool2);
                    sb.append(", enableSessionResumption=");
                    sb.append(bool3);
                    sb.append(", pinnedPeerCertSha256=");
                    oi0.y(sb, str6, ", verifyPeerCertByName=", str7, ", echConfigList=");
                    sb.append(str8);
                    sb.append(", show=");
                    sb.append(z);
                    sb.append(", publicKey=");
                    oi0.y(sb, str9, ", shortId=", str10, ", spiderX=");
                    oi0.y(sb, str11, ", mldsa65Verify=", str12, ", limitFallbackUpload=");
                    sb.append(limitFallbackBean);
                    sb.append(", limitFallbackDownload=");
                    sb.append(limitFallbackBean2);
                    sb.append(")");
                    return sb.toString();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "", "", "path", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "headers", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "setHeaders", "(Ljava/lang/Object;)V", "", "maxEarlyData", "Ljava/lang/Integer;", "getMaxEarlyData", "()Ljava/lang/Integer;", "", "useBrowserForwarding", "Ljava/lang/Boolean;", "getUseBrowserForwarding", "()Ljava/lang/Boolean;", "acceptProxyProtocol", "getAcceptProxyProtocol", "HeadersBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class WsSettingsBean {
                public static final int $stable = 8;
                private Object headers;
                private String path = "";
                private final Integer maxEarlyData = null;
                private final Boolean useBrowserForwarding = null;
                private final Boolean acceptProxyProtocol = null;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", "", "", MetaParams.HOST, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class HeadersBean {
                    public static final int $stable = 8;

                    @p37("Host")
                    private String host = "";

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final String getHost() {
                        return this.host;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof HeadersBean) && dh3.f(this.host, ((HeadersBean) obj).host);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        return this.host.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        return pc6.p("HeadersBean(host=", this.host, ")");
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public WsSettingsBean(bq3 bq3Var) {
                    this.headers = bq3Var;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Object getHeaders() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                public final String b() {
                    bo3 bo3VarJ;
                    String strG;
                    Object obj = this.headers;
                    if (obj instanceof HeadersBean) {
                        strG = ((HeadersBean) obj).getHost();
                    } else if (obj instanceof Map) {
                        Object obj2 = ((Map) obj).get("Host");
                        if (obj2 != null) {
                            strG = obj2.toString();
                        } else {
                            strG = null;
                        }
                    } else if (!(obj instanceof bq3) || (bo3VarJ = ((bq3) obj).j("Host")) == null) {
                        strG = null;
                    } else {
                        strG = i21.g(bo3VarJ);
                    }
                    return strG == null ? "" : strG;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d(String str) {
                    this.path = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof WsSettingsBean)) {
                        return false;
                    }
                    WsSettingsBean wsSettingsBean = (WsSettingsBean) obj;
                    return dh3.f(this.path, wsSettingsBean.path) && dh3.f(this.headers, wsSettingsBean.headers) && dh3.f(this.maxEarlyData, wsSettingsBean.maxEarlyData) && dh3.f(this.useBrowserForwarding, wsSettingsBean.useBrowserForwarding) && dh3.f(this.acceptProxyProtocol, wsSettingsBean.acceptProxyProtocol);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = (this.headers.hashCode() + (this.path.hashCode() * 31)) * 31;
                    Integer num = this.maxEarlyData;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool = this.useBrowserForwarding;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Boolean bool2 = this.acceptProxyProtocol;
                    return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "WsSettingsBean(path=" + this.path + ", headers=" + this.headers + ", maxEarlyData=" + this.maxEarlyData + ", useBrowserForwarding=" + this.useBrowserForwarding + ", acceptProxyProtocol=" + this.acceptProxyProtocol + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", "", "", "path", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", MetaParams.HOST, "b", "i", "mode", "c", "j", "extra", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "scMaxEachPostBytes", "f", "m", "scMaxConcurrentPosts", "e", "l", "scMinPostsIntervalMs", "g", "n", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class XhttpSettingsBean {
                public static final int $stable = 8;
                private String path = "";
                private String host = "";
                private String mode = "auto";
                private Object extra = null;
                private Object scMaxEachPostBytes = null;
                private Object scMaxConcurrentPosts = null;
                private Object scMinPostsIntervalMs = null;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Object getExtra() {
                    return this.extra;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getHost() {
                    return this.host;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getMode() {
                    return this.mode;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: e, reason: from getter */
                public final Object getScMaxConcurrentPosts() {
                    return this.scMaxConcurrentPosts;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof XhttpSettingsBean)) {
                        return false;
                    }
                    XhttpSettingsBean xhttpSettingsBean = (XhttpSettingsBean) obj;
                    return dh3.f(this.path, xhttpSettingsBean.path) && dh3.f(this.host, xhttpSettingsBean.host) && dh3.f(this.mode, xhttpSettingsBean.mode) && dh3.f(this.extra, xhttpSettingsBean.extra) && dh3.f(this.scMaxEachPostBytes, xhttpSettingsBean.scMaxEachPostBytes) && dh3.f(this.scMaxConcurrentPosts, xhttpSettingsBean.scMaxConcurrentPosts) && dh3.f(this.scMinPostsIntervalMs, xhttpSettingsBean.scMinPostsIntervalMs);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: f, reason: from getter */
                public final Object getScMaxEachPostBytes() {
                    return this.scMaxEachPostBytes;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: g, reason: from getter */
                public final Object getScMinPostsIntervalMs() {
                    return this.scMinPostsIntervalMs;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void h(bq3 bq3Var) {
                    this.extra = bq3Var;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iE = pc6.e(pc6.e(this.path.hashCode() * 31, 31, this.host), 31, this.mode);
                    Object obj = this.extra;
                    int iHashCode = (iE + (obj == null ? 0 : obj.hashCode())) * 31;
                    Object obj2 = this.scMaxEachPostBytes;
                    int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
                    Object obj3 = this.scMaxConcurrentPosts;
                    int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
                    Object obj4 = this.scMinPostsIntervalMs;
                    return iHashCode3 + (obj4 != null ? obj4.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void i(String str) {
                    this.host = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void j(String str) {
                    this.mode = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void k(String str) {
                    this.path = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void l(String str) {
                    this.scMaxConcurrentPosts = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void m(String str) {
                    this.scMaxEachPostBytes = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void n(String str) {
                    this.scMinPostsIntervalMs = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.path;
                    String str2 = this.host;
                    String str3 = this.mode;
                    Object obj = this.extra;
                    Object obj2 = this.scMaxEachPostBytes;
                    Object obj3 = this.scMaxConcurrentPosts;
                    Object obj4 = this.scMinPostsIntervalMs;
                    StringBuilder sbT = oi0.t("XhttpSettingsBean(path=", str, ", host=", str2, ", mode=");
                    sbT.append(str3);
                    sbT.append(", extra=");
                    sbT.append(obj);
                    sbT.append(", scMaxEachPostBytes=");
                    sbT.append(obj2);
                    sbT.append(", scMaxConcurrentPosts=");
                    sbT.append(obj3);
                    sbT.append(", scMinPostsIntervalMs=");
                    sbT.append(obj4);
                    sbT.append(")");
                    return sbT.toString();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public StreamSettingsBean(HysteriaSettingsBean hysteriaSettingsBean, FinalMaskBean finalMaskBean, SockoptBean sockoptBean, int i) {
                XRayConfig.INSTANCE.getClass();
                String str = XRayConfig.DEFAULT_NETWORK;
                hysteriaSettingsBean = (i & 1024) != 0 ? null : hysteriaSettingsBean;
                finalMaskBean = (i & 2048) != 0 ? null : finalMaskBean;
                sockoptBean = (i & 8192) != 0 ? null : sockoptBean;
                str.getClass();
                this.network = str;
                this.security = "";
                this.tcpSettings = null;
                this.kcpSettings = null;
                this.wsSettings = null;
                this.httpupgradeSettings = null;
                this.xhttpSettings = null;
                this.tlsSettings = null;
                this.realitySettings = null;
                this.grpcSettings = null;
                this.hysteriaSettings = hysteriaSettingsBean;
                this.finalMask = finalMaskBean;
                this.dsSettings = null;
                this.sockopt = sockoptBean;
            }

            /* JADX DEBUG: Class process forced to load method for inline: eq8.b(int, java.lang.String):java.lang.String */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v29, resolved type: java.lang.Object[] */
            /* JADX WARN: Code duplicated, block: B:105:0x01d3 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:106:0x01d5  */
            /* JADX WARN: Code duplicated, block: B:132:0x0241  */
            /* JADX WARN: Code duplicated, block: B:134:0x0248  */
            /* JADX WARN: Multi-variable type inference failed */
            public static String n(StreamSettingsBean streamSettingsBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, FinalMaskBean finalMaskBean, Integer num, Integer num2, Integer num3, Integer num4, String str13, int i) {
                bq3 bq3VarC;
                bq3 bq3Var;
                UdpMasksBean udpMasksBean;
                UdpMasksBean udpMasksBean2;
                List list;
                LinkedHashMap linkedHashMapA;
                Integer num5;
                String str14 = str2;
                String str15 = (i & 256) != 0 ? null : str9;
                String str16 = (i & 512) != 0 ? null : str10;
                String str17 = (i & 1024) != 0 ? null : str11;
                String str18 = (i & 2048) != 0 ? null : str12;
                FinalMaskBean finalMaskBean2 = (i & 4096) != 0 ? null : finalMaskBean;
                Integer num6 = (i & 8192) != 0 ? null : num;
                Integer num7 = (i & 16384) != 0 ? null : num2;
                Integer num8 = (32768 & i) != 0 ? null : num3;
                Integer num9 = (65536 & i) != 0 ? null : num4;
                String str19 = (i & 131072) != 0 ? null : str13;
                str.getClass();
                streamSettingsBean.network = str;
                String host = "";
                String str20 = str19;
                if (str.equals(EConfigNetworkType.TCP.getType())) {
                    TcpSettingsBean tcpSettingsBean = new TcpSettingsBean();
                    XRayConfig.INSTANCE.getClass();
                    if (dh3.f(str14, XRayConfig.HTTP)) {
                        tcpSettingsBean.getHeader().d(XRayConfig.HTTP);
                        if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                            TcpSettingsBean.HeaderBean.RequestBean requestBean = new TcpSettingsBean.HeaderBean.RequestBean();
                            TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers = requestBean.getHeaders();
                            List listF0 = fm7.F0(str3 == null ? "" : str3, new String[]{","}, 6);
                            ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
                            Iterator it = listF0.iterator();
                            while (it.hasNext()) {
                                arrayList.add(fm7.R0((String) it.next()).toString());
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (((String) obj).length() > 0) {
                                    arrayList2.add(obj);
                                }
                            }
                            headers.b(arrayList2);
                            List listF1 = fm7.F0(str4 == null ? "" : str4, new String[]{","}, 6);
                            ArrayList arrayList3 = new ArrayList(xv0.Z(listF1, 10));
                            Iterator it2 = listF1.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(fm7.R0((String) it2.next()).toString());
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : arrayList3) {
                                if (((String) obj2).length() > 0) {
                                    arrayList4.add(obj2);
                                }
                            }
                            requestBean.c(arrayList4);
                            tcpSettingsBean.getHeader().c(requestBean);
                            String str21 = (String) wv0.u0(0, requestBean.getHeaders().getHost());
                            if (str21 != null) {
                                host = str21;
                            }
                        }
                    } else {
                        tcpSettingsBean.getHeader().d("none");
                        if (str3 != null) {
                            host = str3;
                        }
                    }
                    streamSettingsBean.tcpSettings = tcpSettingsBean;
                } else if (str.equals(EConfigNetworkType.KCP.getType())) {
                    int iIntValue = 1350;
                    if (finalMaskBean2 != null) {
                        List udp = finalMaskBean2.getUdp();
                        if (udp != null) {
                            if (udp.isEmpty()) {
                                num5 = null;
                                break;
                            }
                            Iterator it3 = udp.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    num5 = null;
                                    break;
                                }
                                if (dh3.f(((UdpMasksBean) it3.next()).getType(), "xdns")) {
                                    num5 = 77;
                                    break;
                                }
                            }
                            if (num5 != null) {
                                iIntValue = num5.intValue();
                            } else if (num6 != null) {
                                iIntValue = num6.intValue();
                            }
                        } else if (num6 != null) {
                            iIntValue = num6.intValue();
                        }
                        streamSettingsBean.kcpSettings = new KcpSettingsBean(iIntValue, num7 != null ? num7.intValue() : 50, num8, num9);
                    } else {
                        streamSettingsBean.kcpSettings = new KcpSettingsBean(num6 != null ? num6.intValue() : 1350, num7 != null ? num7.intValue() : 50, num8, num9);
                        if (str14 == null) {
                            udpMasksBean = null;
                        } else {
                            if (str14.length() <= 0 || str14.equals("none")) {
                                str14 = null;
                            }
                            if (str14 != null) {
                                String strW = mm7.W(str14, "-video", "", false);
                                String strConcat = "header-".concat(strW);
                                if (str3 == null) {
                                    linkedHashMapA = null;
                                } else {
                                    String str22 = strW.equals("dns") ? str3 : null;
                                    if (str22 != null) {
                                        linkedHashMapA = UdpMasksBean.UdpMaskSettingBean.a(null, str22, null, null, null, 507);
                                    } else {
                                        linkedHashMapA = null;
                                    }
                                }
                                udpMasksBean = new UdpMasksBean(strConcat, linkedHashMapA);
                            } else {
                                udpMasksBean = null;
                            }
                        }
                        if (str5 != null) {
                            udpMasksBean2 = new UdpMasksBean("mkcp-aes128gcm", UdpMasksBean.UdpMaskSettingBean.a(str5, null, null, null, null, 509));
                            list = null;
                        } else {
                            list = null;
                            udpMasksBean2 = new UdpMasksBean((LinkedHashMap) (null == true ? 1 : 0), 2);
                        }
                        streamSettingsBean.finalMask = new FinalMaskBean(list, eu.q0(new UdpMasksBean[]{udpMasksBean, udpMasksBean2}), 5);
                    }
                } else if (str.equals(EConfigNetworkType.WS.getType())) {
                    String string = str20 != null ? str20.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    try {
                        bq3Var = z51.L(mm7.W(eq8.a(1, string, (6 & 2) != 0), "\\\"", "\"", false)).c();
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        bq3Var = null;
                    }
                    if (bq3Var == null) {
                        bq3Var = new bq3();
                    }
                    bo3 bo3VarJ = bq3Var.j("Host");
                    String strG = bo3VarJ != null ? i21.g(bo3VarJ) : null;
                    host = str3 != null ? str3 : "";
                    bq3Var.e("Host", new iq3(strG == null ? host : strG));
                    WsSettingsBean wsSettingsBean = new WsSettingsBean(bq3Var);
                    if (strG != null) {
                        host = strG;
                    }
                    wsSettingsBean.d(str4 != null ? str4 : "/");
                    streamSettingsBean.wsSettings = wsSettingsBean;
                } else if (str.equals(EConfigNetworkType.HTTP_UPGRADE.getType())) {
                    HttpupgradeSettingsBean httpupgradeSettingsBean = new HttpupgradeSettingsBean();
                    httpupgradeSettingsBean.c(str3 != null ? str3 : "");
                    host = httpupgradeSettingsBean.getHost();
                    httpupgradeSettingsBean.d(str4 != null ? str4 : "/");
                    streamSettingsBean.httpupgradeSettings = httpupgradeSettingsBean;
                } else if (str.equals(EConfigNetworkType.SPLIT_HTTP.getType()) || str.equals(EConfigNetworkType.XHTTP.getType())) {
                    XhttpSettingsBean xhttpSettingsBean = new XhttpSettingsBean();
                    xhttpSettingsBean.i(str3 != null ? str3 : "");
                    host = xhttpSettingsBean.getHost();
                    xhttpSettingsBean.k(str4 != null ? str4 : "/");
                    xhttpSettingsBean.j(str6 == null ? "auto" : str6);
                    if (str16 == null) {
                        str16 = "10";
                    }
                    xhttpSettingsBean.l(str16);
                    if (str15 == null) {
                        str15 = "1000000";
                    }
                    xhttpSettingsBean.m(str15);
                    if (str17 == null) {
                        str17 = "30";
                    }
                    xhttpSettingsBean.n(str17);
                    try {
                        bq3VarC = z51.L(mm7.W(eq8.a(1, String.valueOf(str18), (6 & 2) != 0), "\\\"", "\"", false)).c();
                    } catch (Throwable th2) {
                        if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                            throw th2;
                        }
                        bq3VarC = null;
                    }
                    xhttpSettingsBean.h(bq3VarC);
                    streamSettingsBean.xhttpSettings = xhttpSettingsBean;
                } else if (str.equals(EConfigNetworkType.GRPC.getType())) {
                    GrpcSettingsBean grpcSettingsBean = new GrpcSettingsBean();
                    grpcSettingsBean.e(Boolean.valueOf(dh3.f(str6, "multi")));
                    grpcSettingsBean.f(str7 == null ? "" : str7);
                    grpcSettingsBean.d(str8 == null ? "" : str8);
                    host = str8 != null ? str8 : "";
                    streamSettingsBean.grpcSettings = grpcSettingsBean;
                }
                if (finalMaskBean2 != null) {
                    streamSettingsBean.finalMask = finalMaskBean2;
                }
                return host;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: a, reason: from getter */
            public final FinalMaskBean getFinalMask() {
                return this.finalMask;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: b, reason: from getter */
            public final GrpcSettingsBean getGrpcSettings() {
                return this.grpcSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: c, reason: from getter */
            public final HttpupgradeSettingsBean getHttpupgradeSettings() {
                return this.httpupgradeSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: d, reason: from getter */
            public final HysteriaSettingsBean getHysteriaSettings() {
                return this.hysteriaSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: e, reason: from getter */
            public final KcpSettingsBean getKcpSettings() {
                return this.kcpSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StreamSettingsBean)) {
                    return false;
                }
                StreamSettingsBean streamSettingsBean = (StreamSettingsBean) obj;
                return dh3.f(this.network, streamSettingsBean.network) && dh3.f(this.security, streamSettingsBean.security) && dh3.f(this.tcpSettings, streamSettingsBean.tcpSettings) && dh3.f(this.kcpSettings, streamSettingsBean.kcpSettings) && dh3.f(this.wsSettings, streamSettingsBean.wsSettings) && dh3.f(this.httpupgradeSettings, streamSettingsBean.httpupgradeSettings) && dh3.f(this.xhttpSettings, streamSettingsBean.xhttpSettings) && dh3.f(this.tlsSettings, streamSettingsBean.tlsSettings) && dh3.f(this.realitySettings, streamSettingsBean.realitySettings) && dh3.f(this.grpcSettings, streamSettingsBean.grpcSettings) && dh3.f(this.hysteriaSettings, streamSettingsBean.hysteriaSettings) && dh3.f(this.finalMask, streamSettingsBean.finalMask) && dh3.f(this.dsSettings, streamSettingsBean.dsSettings) && dh3.f(this.sockopt, streamSettingsBean.sockopt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: g, reason: from getter */
            public final TlsSettingsBean getRealitySettings() {
                return this.realitySettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getSecurity() {
                return this.security;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                int iE = pc6.e(this.network.hashCode() * 31, 31, this.security);
                TcpSettingsBean tcpSettingsBean = this.tcpSettings;
                int iHashCode = (iE + (tcpSettingsBean == null ? 0 : tcpSettingsBean.hashCode())) * 31;
                KcpSettingsBean kcpSettingsBean = this.kcpSettings;
                int iHashCode2 = (iHashCode + (kcpSettingsBean == null ? 0 : kcpSettingsBean.hashCode())) * 31;
                WsSettingsBean wsSettingsBean = this.wsSettings;
                int iHashCode3 = (iHashCode2 + (wsSettingsBean == null ? 0 : wsSettingsBean.hashCode())) * 31;
                HttpupgradeSettingsBean httpupgradeSettingsBean = this.httpupgradeSettings;
                int iHashCode4 = (iHashCode3 + (httpupgradeSettingsBean == null ? 0 : httpupgradeSettingsBean.hashCode())) * 31;
                XhttpSettingsBean xhttpSettingsBean = this.xhttpSettings;
                int iHashCode5 = (iHashCode4 + (xhttpSettingsBean == null ? 0 : xhttpSettingsBean.hashCode())) * 31;
                TlsSettingsBean tlsSettingsBean = this.tlsSettings;
                int iHashCode6 = (iHashCode5 + (tlsSettingsBean == null ? 0 : tlsSettingsBean.hashCode())) * 31;
                TlsSettingsBean tlsSettingsBean2 = this.realitySettings;
                int iHashCode7 = (iHashCode6 + (tlsSettingsBean2 == null ? 0 : tlsSettingsBean2.hashCode())) * 31;
                GrpcSettingsBean grpcSettingsBean = this.grpcSettings;
                int iHashCode8 = (iHashCode7 + (grpcSettingsBean == null ? 0 : grpcSettingsBean.hashCode())) * 31;
                HysteriaSettingsBean hysteriaSettingsBean = this.hysteriaSettings;
                int iHashCode9 = (((iHashCode8 + (hysteriaSettingsBean == null ? 0 : hysteriaSettingsBean.hashCode())) * 31) + (this.finalMask == null ? 0 : this.finalMask.hashCode())) * 31;
                Object obj = this.dsSettings;
                int iHashCode10 = (iHashCode9 + (obj == null ? 0 : obj.hashCode())) * 31;
                SockoptBean sockoptBean = this.sockopt;
                return iHashCode10 + (sockoptBean != null ? sockoptBean.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: i, reason: from getter */
            public final SockoptBean getSockopt() {
                return this.sockopt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: j, reason: from getter */
            public final TcpSettingsBean getTcpSettings() {
                return this.tcpSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: k, reason: from getter */
            public final TlsSettingsBean getTlsSettings() {
                return this.tlsSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: l, reason: from getter */
            public final WsSettingsBean getWsSettings() {
                return this.wsSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: m, reason: from getter */
            public final XhttpSettingsBean getXhttpSettings() {
                return this.xhttpSettings;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void o(FinalMaskBean finalMaskBean) {
                this.finalMask = finalMaskBean;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void p(String str) {
                str.getClass();
                this.network = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void q(TlsSettingsBean tlsSettingsBean) {
                this.realitySettings = tlsSettingsBean;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void r(String str) {
                str.getClass();
                this.security = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void s(SockoptBean sockoptBean) {
                this.sockopt = sockoptBean;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void t(TlsSettingsBean tlsSettingsBean) {
                this.tlsSettings = tlsSettingsBean;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                String str = this.network;
                String str2 = this.security;
                TcpSettingsBean tcpSettingsBean = this.tcpSettings;
                KcpSettingsBean kcpSettingsBean = this.kcpSettings;
                WsSettingsBean wsSettingsBean = this.wsSettings;
                HttpupgradeSettingsBean httpupgradeSettingsBean = this.httpupgradeSettings;
                XhttpSettingsBean xhttpSettingsBean = this.xhttpSettings;
                TlsSettingsBean tlsSettingsBean = this.tlsSettings;
                TlsSettingsBean tlsSettingsBean2 = this.realitySettings;
                GrpcSettingsBean grpcSettingsBean = this.grpcSettings;
                HysteriaSettingsBean hysteriaSettingsBean = this.hysteriaSettings;
                FinalMaskBean finalMaskBean = this.finalMask;
                Object obj = this.dsSettings;
                SockoptBean sockoptBean = this.sockopt;
                StringBuilder sbT = oi0.t("StreamSettingsBean(network=", str, ", security=", str2, ", tcpSettings=");
                sbT.append(tcpSettingsBean);
                sbT.append(", kcpSettings=");
                sbT.append(kcpSettingsBean);
                sbT.append(", wsSettings=");
                sbT.append(wsSettingsBean);
                sbT.append(", httpupgradeSettings=");
                sbT.append(httpupgradeSettingsBean);
                sbT.append(", xhttpSettings=");
                sbT.append(xhttpSettingsBean);
                sbT.append(", tlsSettings=");
                sbT.append(tlsSettingsBean);
                sbT.append(", realitySettings=");
                sbT.append(tlsSettingsBean2);
                sbT.append(", grpcSettings=");
                sbT.append(grpcSettingsBean);
                sbT.append(", hysteriaSettings=");
                sbT.append(hysteriaSettingsBean);
                sbT.append(", finalMask=");
                sbT.append(finalMaskBean);
                sbT.append(", dsSettings=");
                sbT.append(obj);
                sbT.append(", sockopt=");
                sbT.append(sockoptBean);
                sbT.append(")");
                return sbT.toString();
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;", "Landroid/os/Parcelable;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;", "settings", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "setSettings-v1I5dns", "(Ljava/util/Map;)V", "TcpMaskSettingBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class TcpMasksBean implements Parcelable {
                public static final int $stable = 8;
                public static final Parcelable.Creator<TcpMasksBean> CREATOR = new Creator();
                private Map<String, Object> settings;
                private String type;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(k = 3, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
                public static final class Creator implements Parcelable.Creator<TcpMasksBean> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // android.os.Parcelable.Creator
                    public final TcpMasksBean createFromParcel(Parcel parcel) {
                        TcpMaskSettingBean tcpMaskSettingBeanCreateFromParcel;
                        parcel.getClass();
                        String string = parcel.readString();
                        Map value = null;
                        if (parcel.readInt() != 0 && (tcpMaskSettingBeanCreateFromParcel = TcpMaskSettingBean.CREATOR.createFromParcel(parcel)) != null) {
                            value = tcpMaskSettingBeanCreateFromParcel.getValue();
                        }
                        return new TcpMasksBean(string, value);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
                    @Override // android.os.Parcelable.Creator
                    public final TcpMasksBean[] newArray(int i) {
                        return new TcpMasksBean[i];
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0005\u0092\u0001\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¨\u0006\t"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;", "Landroid/os/Parcelable;", "", "", "", "value", "Ljava/util/Map;", "getValue", "()Ljava/util/Map;", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final class TcpMaskSettingBean implements Parcelable {
                    public static final Parcelable.Creator<TcpMaskSettingBean> CREATOR = new Creator();
                    private final Map<String, Object> value;

                    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                    @Metadata(k = 3, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
                    public static final class Creator implements Parcelable.Creator<TcpMaskSettingBean> {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // android.os.Parcelable.Creator
                        public final TcpMaskSettingBean createFromParcel(Parcel parcel) {
                            parcel.getClass();
                            int i = parcel.readInt();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                            for (int i2 = 0; i2 != i; i2++) {
                                linkedHashMap.put(parcel.readString(), parcel.readValue(TcpMaskSettingBean.class.getClassLoader()));
                            }
                            return new TcpMaskSettingBean(linkedHashMap);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
                        @Override // android.os.Parcelable.Creator
                        public final TcpMaskSettingBean[] newArray(int i) {
                            return new TcpMaskSettingBean[i];
                        }
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Marked for inline */
                    /* JADX DEBUG: Method not inlined, still used in: [kw4.p(java.lang.String, java.lang.String, boolean, b12, java.lang.String, s51):java.lang.Object, su.happ.proxyutility.dto.XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.Creator.createFromParcel(android.os.Parcel):su.happ.proxyutility.dto.XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean] */
                    public /* synthetic */ TcpMaskSettingBean(Map map) {
                        this.value = map;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static LinkedHashMap c(String str, String str2, String str3, String str4) {
                        return zp4.K(new qg5[]{new qg5("delay", str2), new qg5("length", str3), new qg5("packets", str4), new qg5("maxSplit", str), new qg5("lengths", (Object) null), new qg5("delays", (Object) null)});
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static final String d(Map map) {
                        Object obj = map.get("delay");
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        return null;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static final String e(Map map) {
                        Object obj = map.get("length");
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        return null;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static final String g(Map map) {
                        Object obj = map.get("maxSplit");
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        return null;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static final String k(Map map) {
                        Object obj = map.get("packets");
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        return null;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static String l(Map map) {
                        return "TcpMaskSettingBean(value=" + map + ")";
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static final void p(Map map, Parcel parcel) {
                        parcel.writeInt(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            parcel.writeString((String) entry.getKey());
                            parcel.writeValue(entry.getValue());
                        }
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        return (obj instanceof TcpMaskSettingBean) && dh3.f(this.value, ((TcpMaskSettingBean) obj).value);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        return this.value.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: m, reason: from getter */
                    public final /* synthetic */ Map getValue() {
                        return this.value;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        return l(this.value);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        p(this.value, parcel);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public TcpMasksBean(String str, Map map) {
                    str.getClass();
                    this.type = str;
                    this.settings = map;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final Map getSettings() {
                    return this.settings;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Code duplicated, block: B:15:0x0021  */
                public final boolean equals(Object obj) {
                    boolean zEquals;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TcpMasksBean)) {
                        return false;
                    }
                    TcpMasksBean tcpMasksBean = (TcpMasksBean) obj;
                    if (!dh3.f(this.type, tcpMasksBean.type)) {
                        return false;
                    }
                    Map<String, Object> map = this.settings;
                    Map<String, Object> map2 = tcpMasksBean.settings;
                    if (map == null) {
                        if (map2 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (map2 == null) {
                        zEquals = false;
                    } else {
                        zEquals = map.equals(map2);
                    }
                    return zEquals;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.type.hashCode() * 31;
                    Map<String, Object> map = this.settings;
                    return iHashCode + (map == null ? 0 : map.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.type;
                    Map<String, Object> map = this.settings;
                    return pc6.q("TcpMasksBean(type=", str, ", settings=", map == null ? "null" : TcpMaskSettingBean.l(map), ")");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.type);
                    Map<String, Object> map = this.settings;
                    if (map == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        TcpMaskSettingBean.p(map, parcel);
                    }
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR 
  (wrap java.lang.String:SGET  A[WRAPPED] su.happ.proxyutility.dto.MetaParams.FRAGMENT java.lang.String)
  (r2v0 java.util.LinkedHashMap)
 A[MD:(java.lang.String, java.util.Map):void (m)] (LINE:13) call: su.happ.proxyutility.dto.XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.<init>(java.lang.String, java.util.Map):void type: THIS */
                public /* synthetic */ TcpMasksBean(LinkedHashMap linkedHashMap) {
                    this(MetaParams.FRAGMENT, linkedHashMap);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "header", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "a", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "setHeader", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;)V", "", "acceptProxyProtocol", "Ljava/lang/Boolean;", "getAcceptProxyProtocol", "()Ljava/lang/Boolean;", "HeaderBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class TcpSettingsBean {
                public static final int $stable = 8;
                private HeaderBean header = new HeaderBean();
                private final Boolean acceptProxyProtocol = null;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final HeaderBean getHeader() {
                    return this.header;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TcpSettingsBean)) {
                        return false;
                    }
                    TcpSettingsBean tcpSettingsBean = (TcpSettingsBean) obj;
                    return dh3.f(this.header, tcpSettingsBean.header) && dh3.f(this.acceptProxyProtocol, tcpSettingsBean.acceptProxyProtocol);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.header.hashCode() * 31;
                    Boolean bool = this.acceptProxyProtocol;
                    return iHashCode + (bool == null ? 0 : bool.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "TcpSettingsBean(header=" + this.header + ", acceptProxyProtocol=" + this.acceptProxyProtocol + ")";
                }

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "", "", "type", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "request", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "a", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "c", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;)V", "response", "Ljava/lang/Object;", "getResponse", "()Ljava/lang/Object;", "setResponse", "(Ljava/lang/Object;)V", "RequestBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class HeaderBean {
                    public static final int $stable = 8;
                    private String type = "none";
                    private RequestBean request = null;
                    private Object response = null;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final RequestBean getRequest() {
                        return this.request;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final void c(RequestBean requestBean) {
                        this.request = requestBean;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final void d(String str) {
                        str.getClass();
                        this.type = str;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof HeaderBean)) {
                            return false;
                        }
                        HeaderBean headerBean = (HeaderBean) obj;
                        return dh3.f(this.type, headerBean.type) && dh3.f(this.request, headerBean.request) && dh3.f(this.response, headerBean.response);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        int iHashCode = this.type.hashCode() * 31;
                        RequestBean requestBean = this.request;
                        int iHashCode2 = (iHashCode + (requestBean == null ? 0 : requestBean.hashCode())) * 31;
                        Object obj = this.response;
                        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        return "HeaderBean(type=" + this.type + ", request=" + this.request + ", response=" + this.response + ")";
                    }

                    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "", "", "", "path", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "headers", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "a", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "setHeaders", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;)V", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "method", "getMethod", "HeadersBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                    public static final /* data */ class RequestBean {
                        public static final int $stable = 8;
                        private HeadersBean headers;
                        private final String method;
                        private List<String> path;
                        private final String version;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public RequestBean() {
                            ArrayList arrayList = new ArrayList();
                            HeadersBean headersBean = new HeadersBean(0);
                            this.path = arrayList;
                            this.headers = headersBean;
                            this.version = null;
                            this.method = null;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX INFO: renamed from: a, reason: from getter */
                        public final HeadersBean getHeaders() {
                            return this.headers;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX INFO: renamed from: b, reason: from getter */
                        public final List getPath() {
                            return this.path;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final void c(List list) {
                            list.getClass();
                            this.path = list;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof RequestBean)) {
                                return false;
                            }
                            RequestBean requestBean = (RequestBean) obj;
                            return dh3.f(this.path, requestBean.path) && dh3.f(this.headers, requestBean.headers) && dh3.f(this.version, requestBean.version) && dh3.f(this.method, requestBean.method);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final int hashCode() {
                            int iHashCode = (this.headers.hashCode() + (this.path.hashCode() * 31)) * 31;
                            String str = this.version;
                            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                            String str2 = this.method;
                            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final String toString() {
                            List<String> list = this.path;
                            HeadersBean headersBean = this.headers;
                            String str = this.version;
                            String str2 = this.method;
                            StringBuilder sb = new StringBuilder("RequestBean(path=");
                            sb.append(list);
                            sb.append(", headers=");
                            sb.append(headersBean);
                            sb.append(", version=");
                            return oi0.q(sb, str, ", method=", str2, ")");
                        }

                        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "", "", "", "Host", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "(Ljava/util/List;)V", "userAgent", "getUserAgent", "acceptEncoding", "getAcceptEncoding", "Connection", "getConnection", "Pragma", "Ljava/lang/String;", "getPragma", "()Ljava/lang/String;", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                        public static final /* data */ class HeadersBean {
                            public static final int $stable = 8;
                            private final List<String> Connection;
                            private List<String> Host;
                            private final String Pragma;

                            @p37("Accept-Encoding")
                            private final List<String> acceptEncoding;

                            @p37("User-Agent")
                            private final List<String> userAgent;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public HeadersBean(int i) {
                                this.Host = new ArrayList();
                                this.userAgent = null;
                                this.acceptEncoding = null;
                                this.Connection = null;
                                this.Pragma = null;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            /* JADX INFO: renamed from: a, reason: from getter */
                            public final List getHost() {
                                return this.Host;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final void b(List list) {
                                this.Host = list;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof HeadersBean)) {
                                    return false;
                                }
                                HeadersBean headersBean = (HeadersBean) obj;
                                return dh3.f(this.Host, headersBean.Host) && dh3.f(this.userAgent, headersBean.userAgent) && dh3.f(this.acceptEncoding, headersBean.acceptEncoding) && dh3.f(this.Connection, headersBean.Connection) && dh3.f(this.Pragma, headersBean.Pragma);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final int hashCode() {
                                int iHashCode = ((((this.Host.hashCode() * 31) + (this.userAgent == null ? 0 : this.userAgent.hashCode())) * 31) + (this.acceptEncoding == null ? 0 : this.acceptEncoding.hashCode())) * 31;
                                List<String> list = this.Connection;
                                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                                String str = this.Pragma;
                                return iHashCode2 + (str != null ? str.hashCode() : 0);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final String toString() {
                                List<String> list = this.Host;
                                List<String> list2 = this.userAgent;
                                List<String> list3 = this.acceptEncoding;
                                List<String> list4 = this.Connection;
                                String str = this.Pragma;
                                StringBuilder sb = new StringBuilder("HeadersBean(Host=");
                                sb.append(list);
                                sb.append(", userAgent=");
                                sb.append(list2);
                                sb.append(", acceptEncoding=");
                                sb.append(list3);
                                sb.append(", Connection=");
                                sb.append(list4);
                                sb.append(", Pragma=");
                                return oi0.p(sb, str, ")");
                            }

                            public HeadersBean() {
                                this(0);
                            }
                        }
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;", "", "", "type", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;", "settings", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "UdpMaskSettingBean", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class UdpMasksBean {
                public static final int $stable = 8;
                private Map<String, Object> settings;
                private String type;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0004\u0092\u0001\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¨\u0006\b"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;", "", "", "", "value", "Ljava/util/Map;", "getValue", "()Ljava/util/Map;", "app"}, k = KcpSettingsBean.cwndMultiplierMin, mv = {HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final class UdpMaskSettingBean {
                    private final Map<String, Object> value;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static LinkedHashMap a(String str, String str2, List list, String str3, String str4, int i) {
                        return zp4.K(new qg5[]{new qg5("reset", (Object) null), new qg5("password", (i & 2) != 0 ? null : str), new qg5("domain", (i & 4) != 0 ? null : str2), new qg5("packetSize", (Object) null), new qg5("noise", (i & 16) != 0 ? null : list), new qg5("mode", (i & 32) != 0 ? null : "intervalRemote"), new qg5("interval", (i & 64) != 0 ? null : str3), new qg5("remotePorts", (i & 128) != 0 ? null : str4), new qg5("remoteIPs", (Object) null)});
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static final List b(Map map) {
                        Object obj = map.get("noise");
                        if (obj instanceof List) {
                            return (List) obj;
                        }
                        return null;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        return (obj instanceof UdpMaskSettingBean) && dh3.f(this.value, ((UdpMaskSettingBean) obj).value);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        return this.value.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        return "UdpMaskSettingBean(value=" + this.value + ")";
                    }
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? ("") : ("mkcp-original"))
  (wrap java.util.LinkedHashMap:?: TERNARY null = ((wrap int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED] (LINE:10)) != (0 int)) ? (null java.util.LinkedHashMap) : (r2v0 java.util.LinkedHashMap))
 A[MD:(java.lang.String, java.util.Map):void (m)] (LINE:15) call: su.happ.proxyutility.dto.XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.<init>(java.lang.String, java.util.Map):void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ UdpMasksBean(LinkedHashMap linkedHashMap, int i) {
                    this((i & 1) != 0 ? "" : "mkcp-original", (i & 2) != 0 ? null : linkedHashMap);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final Map getSettings() {
                    return this.settings;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void c(LinkedHashMap linkedHashMap) {
                    this.settings = linkedHashMap;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d() {
                    this.type = "salamander";
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Code duplicated, block: B:15:0x0021  */
                public final boolean equals(Object obj) {
                    boolean zEquals;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UdpMasksBean)) {
                        return false;
                    }
                    UdpMasksBean udpMasksBean = (UdpMasksBean) obj;
                    if (!dh3.f(this.type, udpMasksBean.type)) {
                        return false;
                    }
                    Map<String, Object> map = this.settings;
                    Map<String, Object> map2 = udpMasksBean.settings;
                    if (map == null) {
                        if (map2 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (map2 == null) {
                        zEquals = false;
                    } else {
                        zEquals = map.equals(map2);
                    }
                    return zEquals;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.type.hashCode() * 31;
                    Map<String, Object> map = this.settings;
                    return iHashCode + (map == null ? 0 : map.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str;
                    String str2 = this.type;
                    Map<String, Object> map = this.settings;
                    if (map == null) {
                        str = "null";
                    } else {
                        str = "UdpMaskSettingBean(value=" + map + ")";
                    }
                    return pc6.q("UdpMasksBean(type=", str2, ", settings=", str, ")");
                }

                public UdpMasksBean(String str, Map map) {
                    str.getClass();
                    this.type = str;
                    this.settings = map;
                }
            }

            public StreamSettingsBean() {
                this(null, null, null, 16383);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0007efghijkR0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0019\u0010,\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000e\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R*\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0005\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR$\u0010;\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0016\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR\u0019\u0010>\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b>\u0010\u0016\u001a\u0004\b?\u0010\u0018R\u0019\u0010@\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b@\u0010\u000e\u001a\u0004\bA\u0010\u0010R*\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0005\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR\u0019\u0010F\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bF\u0010\u0016\u001a\u0004\bG\u0010\u0018R$\u0010H\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0016\u001a\u0004\bI\u0010\u0018\"\u0004\bJ\u0010\u001aR\u001f\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\u0005\u001a\u0004\bM\u0010\u0007R*\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0005\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR$\u0010Q\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u000e\u001a\u0004\bR\u0010\u0010\"\u0004\bS\u0010\u0012R$\u0010T\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0016\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u0010\u001aR$\u0010W\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0016\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010\u001aR$\u0010Z\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0016\u001a\u0004\b[\u0010\u0018\"\u0004\b\\\u0010\u001aR$\u0010]\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010\u000e\u001a\u0004\b^\u0010\u0010\"\u0004\b_\u0010\u0012R*\u0010`\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0005\u001a\u0004\ba\u0010\u0007\"\u0004\bb\u0010\tR\u0019\u0010c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bc\u0010\u000e\u001a\u0004\bd\u0010\u0010¨\u0006l"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;", "", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;", "vnext", "Ljava/util/List;", "l", "()Ljava/util/List;", "w", "(Ljava/util/List;)V", "getVnext$annotations", "()V", "", "alterId", "Ljava/lang/Integer;", "getAlterId", "()Ljava/lang/Integer;", "setAlterId", "(Ljava/lang/Integer;)V", "getAlterId$annotations", "", "security", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "v", "(Ljava/lang/String;)V", "level", "I", "getLevel", "()I", "setLevel", "(I)V", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;", "servers", "k", "setServers", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;", "response", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;", "getResponse", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;", "setResponse", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;)V", "network", "getNetwork", "address", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "port", "g", "s", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule;", "rules", "getRules", "setRules", "domainStrategy", "getDomainStrategy", "n", "redirect", "getRedirect", "userLevel", "getUserLevel", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule;", "finalRules", "getFinalRules", "setFinalRules", "inboundTag", "getInboundTag", "secretKey", "i", "u", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$WireGuardBean;", "peers", "f", "reserved", "h", "t", "mtu", "e", "r", "encryption", "b", "o", "flow", "c", "p", "id", "d", "q", "testPre", "getTestPre", "setTestPre", "testSeed", "getTestSeed", "setTestSeed", "version", "getVersion", "VnextBean", "NoisesBean", "ServersBean", "Response", "DNSRule", "FreedomFinalRule", "WireGuardBean", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class OutSettingsBean {
            public static final int $stable = 8;
            private Object address;
            private Integer alterId;
            private String domainStrategy;

            @p37("encryption")
            private String encryption;
            private List<FreedomFinalRule> finalRules;

            @p37("flow")
            private String flow;

            @p37("id")
            private String id;
            private final String inboundTag;
            private int level;
            private Integer mtu;
            private final String network;
            private final List<WireGuardBean> peers;
            private Integer port;
            private final String redirect;
            private List<Integer> reserved;
            private Response response;
            private List<DNSRule> rules;
            private String secretKey;
            private String security;
            private List<ServersBean> servers;

            @p37("testpre")
            private Integer testPre;

            @p37("testseed")
            private List<Integer> testSeed;
            private final Integer userLevel;
            private final Integer version;
            private List<VnextBean> vnext;

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule;", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule$Action;", "action", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule$Action;", "getAction", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule$Action;", "setAction", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule$Action;)V", "", "qType", "Ljava/lang/String;", "getQType", "()Ljava/lang/String;", "setQType", "(Ljava/lang/String;)V", "", "domain", "Ljava/util/List;", "getDomain", "()Ljava/util/List;", "setDomain", "(Ljava/util/List;)V", "", "rCode", "Ljava/lang/Integer;", "getRCode", "()Ljava/lang/Integer;", "setRCode", "(Ljava/lang/Integer;)V", "Action", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class DNSRule {
                public static final int $stable = 8;
                private Action action;
                private List<String> domain;
                private String qType;
                private Integer rCode;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$DNSRule$Action;", "", "direct", "drop", "return", "hijack", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final class Action {
                    private static final /* synthetic */ l22 $ENTRIES;
                    private static final /* synthetic */ Action[] $VALUES;

                    @p37("direct")
                    public static final Action direct;

                    @p37("drop")
                    public static final Action drop;

                    @p37("hijack")
                    public static final Action hijack;

                    /* JADX INFO: renamed from: return, reason: not valid java name */
                    @p37("return")
                    public static final Action f3return;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    static {
                        Action action = new Action("direct", 0);
                        direct = action;
                        Action action2 = new Action("drop", 1);
                        drop = action2;
                        Action action3 = new Action("return", 2);
                        f3return = action3;
                        Action action4 = new Action("hijack", 3);
                        hijack = action4;
                        Action[] actionArr = {action, action2, action3, action4};
                        $VALUES = actionArr;
                        $ENTRIES = new n22(actionArr);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static Action valueOf(String str) {
                        return (Action) Enum.valueOf(Action.class, str);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static Action[] values() {
                        return (Action[]) $VALUES.clone();
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DNSRule)) {
                        return false;
                    }
                    DNSRule dNSRule = (DNSRule) obj;
                    return this.action == dNSRule.action && dh3.f(this.qType, dNSRule.qType) && dh3.f(this.domain, dNSRule.domain) && dh3.f(this.rCode, dNSRule.rCode);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.action.hashCode() * 31;
                    String str = this.qType;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    List<String> list = this.domain;
                    int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                    Integer num = this.rCode;
                    return iHashCode3 + (num != null ? num.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "DNSRule(action=" + this.action + ", qType=" + this.qType + ", domain=" + this.domain + ", rCode=" + this.rCode + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016¨\u0006\""}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule;", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule$Action;", "action", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule$Action;", "getAction", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule$Action;", "setAction", "(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule$Action;)V", "Lsu/happ/proxyutility/dto/FlexibleStringList;", "network", "Lsu/happ/proxyutility/dto/FlexibleStringList;", "getNetwork-emY-p_E", "()Lsu/happ/proxyutility/dto/FlexibleStringList;", "setNetwork-PUIeKWs", "(Lsu/happ/proxyutility/dto/FlexibleStringList;)V", "", "port", "Ljava/lang/String;", "getPort", "()Ljava/lang/String;", "setPort", "(Ljava/lang/String;)V", "", "ip", "Ljava/util/List;", "getIp", "()Ljava/util/List;", "setIp", "(Ljava/util/List;)V", "blockDelay", "getBlockDelay", "setBlockDelay", "Action", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class FreedomFinalRule {
                public static final int $stable = 8;
                private Action action;
                private String blockDelay;
                private List<String> ip;
                private FlexibleStringList network;
                private String port;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$FreedomFinalRule$Action;", "", "allow", "block", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final class Action {
                    private static final /* synthetic */ l22 $ENTRIES;
                    private static final /* synthetic */ Action[] $VALUES;

                    @p37("allow")
                    public static final Action allow;

                    @p37("block")
                    public static final Action block;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    static {
                        Action action = new Action("allow", 0);
                        allow = action;
                        Action action2 = new Action("block", 1);
                        block = action2;
                        Action[] actionArr = {action, action2};
                        $VALUES = actionArr;
                        $ENTRIES = new n22(actionArr);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static Action valueOf(String str) {
                        return (Action) Enum.valueOf(Action.class, str);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public static Action[] values() {
                        return (Action[]) $VALUES.clone();
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FreedomFinalRule)) {
                        return false;
                    }
                    FreedomFinalRule freedomFinalRule = (FreedomFinalRule) obj;
                    return this.action == freedomFinalRule.action && dh3.f(this.network, freedomFinalRule.network) && dh3.f(this.port, freedomFinalRule.port) && dh3.f(this.ip, freedomFinalRule.ip) && dh3.f(this.blockDelay, freedomFinalRule.blockDelay);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    Object value;
                    int iHashCode = this.action.hashCode() * 31;
                    FlexibleStringList flexibleStringList = this.network;
                    int iHashCode2 = (iHashCode + ((flexibleStringList == null || (value = flexibleStringList.getValue()) == null) ? 0 : value.hashCode())) * 31;
                    String str = this.port;
                    int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    List<String> list = this.ip;
                    int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                    String str2 = this.blockDelay;
                    return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    Action action = this.action;
                    FlexibleStringList flexibleStringList = this.network;
                    String str = this.port;
                    List<String> list = this.ip;
                    String str2 = this.blockDelay;
                    StringBuilder sb = new StringBuilder("FreedomFinalRule(action=");
                    sb.append(action);
                    sb.append(", network=");
                    sb.append(flexibleStringList);
                    sb.append(", port=");
                    sb.append(str);
                    sb.append(", ip=");
                    sb.append(list);
                    sb.append(", blockDelay=");
                    return oi0.p(sb, str2, ")");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$Response;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class Response {
                public static final int $stable = 8;
                private String type;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Response) && dh3.f(this.type, ((Response) obj).type);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    return this.type.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return pc6.p("Response(type=", this.type, ")");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001KR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u0019\u0010%\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R*\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(\"\u0004\b7\u00104R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b@\u0010(\"\u0004\bA\u00104R$\u0010B\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010&\u001a\u0004\bC\u0010(\"\u0004\bD\u00104R$\u0010E\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;", "", "", "address", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "method", "c", "i", "", "ota", "Z", "getOta", "()Z", "setOta", "(Z)V", "password", "d", "j", "", "port", "I", "e", "()I", "k", "(I)V", "level", "getLevel", "setLevel", "email", "getEmail", "flow", "b", "h", "ivCheck", "Ljava/lang/Boolean;", "getIvCheck", "()Ljava/lang/Boolean;", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean$SocksUsersBean;", "users", "Ljava/util/List;", "f", "()Ljava/util/List;", "l", "(Ljava/util/List;)V", "actPrior", "getActPrior", "setActPrior", "(Ljava/lang/Boolean;)V", "actUnprior", "getActUnprior", "setActUnprior", "", "timeoutMs", "Ljava/lang/Long;", "getTimeoutMs", "()Ljava/lang/Long;", "setTimeoutMs", "(Ljava/lang/Long;)V", "disableCache", "getDisableCache", "setDisableCache", "finalQuery", "getFinalQuery", "setFinalQuery", "unexpected_geoip", "Ljava/lang/Object;", "getUnexpected_geoip", "()Ljava/lang/Object;", "setUnexpected_geoip", "(Ljava/lang/Object;)V", "SocksUsersBean", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class ServersBean {
                public static final int $stable = 8;
                private Boolean actPrior;
                private Boolean actUnprior;
                private String address;
                private Boolean disableCache;
                private final String email;
                private Boolean finalQuery;
                private String flow;
                private final Boolean ivCheck;
                private int level;
                private String method;
                private boolean ota;
                private String password;
                private int port;
                private Long timeoutMs;
                private Object unexpected_geoip;
                private List<SocksUsersBean> users;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean$SocksUsersBean;", "", "", "user", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "pass", "a", "c", "", "level", "I", "getLevel", "()I", "setLevel", "(I)V", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                public static final /* data */ class SocksUsersBean {
                    public static final int $stable = 8;
                    private String user = "";
                    private String pass = "";
                    private int level = 8;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final String getPass() {
                        return this.pass;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final String getUser() {
                        return this.user;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final void c(String str) {
                        str.getClass();
                        this.pass = str;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final void d(String str) {
                        str.getClass();
                        this.user = str;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof SocksUsersBean)) {
                            return false;
                        }
                        SocksUsersBean socksUsersBean = (SocksUsersBean) obj;
                        return dh3.f(this.user, socksUsersBean.user) && dh3.f(this.pass, socksUsersBean.pass) && this.level == socksUsersBean.level;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        return Integer.hashCode(this.level) + pc6.e(this.user.hashCode() * 31, 31, this.pass);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        String str = this.user;
                        String str2 = this.pass;
                        return oi0.n(oi0.t("SocksUsersBean(user=", str, ", pass=", str2, ", level="), this.level, ")");
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public ServersBean(int i, int i2) {
                    String str = (i2 & 1) != 0 ? "" : "127.0.0.1";
                    i = (i2 & 16) != 0 ? XRayConfig.DEFAULT_PORT : i;
                    this.address = str;
                    this.method = "chacha20-poly1305";
                    this.ota = false;
                    this.password = "";
                    this.port = i;
                    this.level = 8;
                    this.email = null;
                    this.flow = null;
                    this.ivCheck = null;
                    this.users = null;
                    this.actPrior = null;
                    this.actUnprior = null;
                    this.timeoutMs = null;
                    this.disableCache = null;
                    this.finalQuery = null;
                    this.unexpected_geoip = null;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAddress() {
                    return this.address;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getFlow() {
                    return this.flow;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getMethod() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getPassword() {
                    return this.password;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: e, reason: from getter */
                public final int getPort() {
                    return this.port;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ServersBean)) {
                        return false;
                    }
                    ServersBean serversBean = (ServersBean) obj;
                    return dh3.f(this.address, serversBean.address) && dh3.f(this.method, serversBean.method) && this.ota == serversBean.ota && dh3.f(this.password, serversBean.password) && this.port == serversBean.port && this.level == serversBean.level && dh3.f(this.email, serversBean.email) && dh3.f(this.flow, serversBean.flow) && dh3.f(this.ivCheck, serversBean.ivCheck) && dh3.f(this.users, serversBean.users) && dh3.f(this.actPrior, serversBean.actPrior) && dh3.f(this.actUnprior, serversBean.actUnprior) && dh3.f(this.timeoutMs, serversBean.timeoutMs) && dh3.f(this.disableCache, serversBean.disableCache) && dh3.f(this.finalQuery, serversBean.finalQuery) && dh3.f(this.unexpected_geoip, serversBean.unexpected_geoip);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: f, reason: from getter */
                public final List getUsers() {
                    return this.users;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void g(String str) {
                    str.getClass();
                    this.address = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void h(String str) {
                    this.flow = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iE = oi0.e(this.level, oi0.e(this.port, pc6.e(pc6.f(pc6.e(this.address.hashCode() * 31, 31, this.method), 31, this.ota), 31, this.password), 31), 31);
                    String str = this.email;
                    int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.flow;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Boolean bool = this.ivCheck;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    List<SocksUsersBean> list = this.users;
                    int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                    Boolean bool2 = this.actPrior;
                    int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Boolean bool3 = this.actUnprior;
                    int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Long l = this.timeoutMs;
                    int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                    Boolean bool4 = this.disableCache;
                    int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Boolean bool5 = this.finalQuery;
                    int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
                    Object obj = this.unexpected_geoip;
                    return iHashCode9 + (obj != null ? obj.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void i(String str) {
                    str.getClass();
                    this.method = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void j(String str) {
                    str.getClass();
                    this.password = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void k(int i) {
                    this.port = i;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void l(List list) {
                    this.users = list;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.address;
                    String str2 = this.method;
                    boolean z = this.ota;
                    String str3 = this.password;
                    int i = this.port;
                    int i2 = this.level;
                    String str4 = this.email;
                    String str5 = this.flow;
                    Boolean bool = this.ivCheck;
                    List<SocksUsersBean> list = this.users;
                    Boolean bool2 = this.actPrior;
                    Boolean bool3 = this.actUnprior;
                    Long l = this.timeoutMs;
                    Boolean bool4 = this.disableCache;
                    Boolean bool5 = this.finalQuery;
                    Object obj = this.unexpected_geoip;
                    StringBuilder sbT = oi0.t("ServersBean(address=", str, ", method=", str2, ", ota=");
                    sbT.append(z);
                    sbT.append(", password=");
                    sbT.append(str3);
                    sbT.append(", port=");
                    oi0.x(sbT, i, ", level=", i2, ", email=");
                    oi0.y(sbT, str4, ", flow=", str5, ", ivCheck=");
                    sbT.append(bool);
                    sbT.append(", users=");
                    sbT.append(list);
                    sbT.append(", actPrior=");
                    sbT.append(bool2);
                    sbT.append(", actUnprior=");
                    sbT.append(bool3);
                    sbT.append(", timeoutMs=");
                    sbT.append(l);
                    sbT.append(", disableCache=");
                    sbT.append(bool4);
                    sbT.append(", finalQuery=");
                    sbT.append(bool5);
                    sbT.append(", unexpected_geoip=");
                    sbT.append(obj);
                    sbT.append(")");
                    return sbT.toString();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;", "", "", "address", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "", "port", "I", "b", "()I", "setPort", "(I)V", "", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "users", "Ljava/util/List;", "c", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "UsersBean", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            @ti1
            public static final /* data */ class VnextBean {
                public static final int $stable = 8;
                private String address;
                private int port;
                private List<UsersBean> users;

                /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "", "", "id", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "", "alterId", "Ljava/lang/Integer;", "getAlterId", "()Ljava/lang/Integer;", "setAlterId", "(Ljava/lang/Integer;)V", "getAlterId$annotations", "()V", "security", "d", "setSecurity", "level", "I", "getLevel", "()I", "setLevel", "(I)V", "encryption", "a", "setEncryption", "flow", "b", "setFlow", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
                @ti1
                public static final /* data */ class UsersBean {
                    public static final int $stable = 8;
                    private Integer alterId;
                    private String encryption;
                    private String flow;
                    private String id;
                    private int level;
                    private String security;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final String getEncryption() {
                        return this.encryption;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final String getFlow() {
                        return this.flow;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final String getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final String getSecurity() {
                        return this.security;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof UsersBean)) {
                            return false;
                        }
                        UsersBean usersBean = (UsersBean) obj;
                        return dh3.f(this.id, usersBean.id) && dh3.f(this.alterId, usersBean.alterId) && dh3.f(this.security, usersBean.security) && this.level == usersBean.level && dh3.f(this.encryption, usersBean.encryption) && dh3.f(this.flow, usersBean.flow);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final int hashCode() {
                        int iHashCode = this.id.hashCode() * 31;
                        Integer num = this.alterId;
                        return this.flow.hashCode() + pc6.e(oi0.e(this.level, pc6.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.security), 31), 31, this.encryption);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final String toString() {
                        String str = this.id;
                        Integer num = this.alterId;
                        String str2 = this.security;
                        int i = this.level;
                        String str3 = this.encryption;
                        String str4 = this.flow;
                        StringBuilder sb = new StringBuilder("UsersBean(id=");
                        sb.append(str);
                        sb.append(", alterId=");
                        sb.append(num);
                        sb.append(", security=");
                        sb.append(str2);
                        sb.append(", level=");
                        sb.append(i);
                        sb.append(", encryption=");
                        return oi0.q(sb, str3, ", flow=", str4, ")");
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAddress() {
                    return this.address;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getPort() {
                    return this.port;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final List getUsers() {
                    return this.users;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d() {
                    this.address = null;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof VnextBean)) {
                        return false;
                    }
                    VnextBean vnextBean = (VnextBean) obj;
                    return dh3.f(this.address, vnextBean.address) && this.port == vnextBean.port && dh3.f(this.users, vnextBean.users);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    String str = this.address;
                    return this.users.hashCode() + oi0.e(this.port, (str == null ? 0 : str.hashCode()) * 31, 31);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    return "VnextBean(address=" + this.address + ", port=" + this.port + ", users=" + this.users + ")";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$WireGuardBean;", "", "", "publicKey", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "preSharedKey", "b", "e", "endpoint", "a", "d", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class WireGuardBean {
                public static final int $stable = 8;
                private String publicKey = "";
                private String preSharedKey = null;
                private String endpoint = "";

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getEndpoint() {
                    return this.endpoint;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getPreSharedKey() {
                    return this.preSharedKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getPublicKey() {
                    return this.publicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void d(String str) {
                    str.getClass();
                    this.endpoint = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void e(String str) {
                    this.preSharedKey = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof WireGuardBean)) {
                        return false;
                    }
                    WireGuardBean wireGuardBean = (WireGuardBean) obj;
                    return dh3.f(this.publicKey, wireGuardBean.publicKey) && dh3.f(this.preSharedKey, wireGuardBean.preSharedKey) && dh3.f(this.endpoint, wireGuardBean.endpoint);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final void f(String str) {
                    str.getClass();
                    this.publicKey = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.publicKey.hashCode() * 31;
                    String str = this.preSharedKey;
                    return this.endpoint.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.publicKey;
                    String str2 = this.preSharedKey;
                    return oi0.p(oi0.t("WireGuardBean(publicKey=", str, ", preSharedKey=", str2, ", endpoint="), this.endpoint, ")");
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public OutSettingsBean(List list, List list2, int i) {
                Integer numValueOf = Integer.valueOf(XRayConfig.DEFAULT_PORT);
                list = (i & 16) != 0 ? null : list;
                Object obj = (i & 128) != 0 ? null : "";
                numValueOf = (i & 256) != 0 ? null : numValueOf;
                String str = (i & 1024) != 0 ? null : "UseIP";
                String str2 = (32768 & i) != 0 ? null : "";
                list2 = (65536 & i) != 0 ? null : list2;
                String str3 = (524288 & i) != 0 ? null : "";
                String str4 = (1048576 & i) != 0 ? null : "";
                String str5 = (2097152 & i) != 0 ? null : "";
                Integer num = (i & 16777216) != 0 ? null : 2;
                this.vnext = null;
                this.alterId = null;
                this.security = "auto";
                this.level = 8;
                this.servers = list;
                this.response = null;
                this.network = null;
                this.address = obj;
                this.port = numValueOf;
                this.rules = null;
                this.domainStrategy = str;
                this.redirect = null;
                this.userLevel = null;
                this.finalRules = null;
                this.inboundTag = null;
                this.secretKey = str2;
                this.peers = list2;
                this.reserved = null;
                this.mtu = null;
                this.encryption = str3;
                this.flow = str4;
                this.id = str5;
                this.testPre = null;
                this.testSeed = null;
                this.version = num;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Object getAddress() {
                return this.address;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getEncryption() {
                return this.encryption;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getFlow() {
                return this.flow;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: e, reason: from getter */
            public final Integer getMtu() {
                return this.mtu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OutSettingsBean)) {
                    return false;
                }
                OutSettingsBean outSettingsBean = (OutSettingsBean) obj;
                return dh3.f(this.vnext, outSettingsBean.vnext) && dh3.f(this.alterId, outSettingsBean.alterId) && dh3.f(this.security, outSettingsBean.security) && this.level == outSettingsBean.level && dh3.f(this.servers, outSettingsBean.servers) && dh3.f(this.response, outSettingsBean.response) && dh3.f(this.network, outSettingsBean.network) && dh3.f(this.address, outSettingsBean.address) && dh3.f(this.port, outSettingsBean.port) && dh3.f(this.rules, outSettingsBean.rules) && dh3.f(this.domainStrategy, outSettingsBean.domainStrategy) && dh3.f(this.redirect, outSettingsBean.redirect) && dh3.f(this.userLevel, outSettingsBean.userLevel) && dh3.f(this.finalRules, outSettingsBean.finalRules) && dh3.f(this.inboundTag, outSettingsBean.inboundTag) && dh3.f(this.secretKey, outSettingsBean.secretKey) && dh3.f(this.peers, outSettingsBean.peers) && dh3.f(this.reserved, outSettingsBean.reserved) && dh3.f(this.mtu, outSettingsBean.mtu) && dh3.f(this.encryption, outSettingsBean.encryption) && dh3.f(this.flow, outSettingsBean.flow) && dh3.f(this.id, outSettingsBean.id) && dh3.f(this.testPre, outSettingsBean.testPre) && dh3.f(this.testSeed, outSettingsBean.testSeed) && dh3.f(this.version, outSettingsBean.version);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: f, reason: from getter */
            public final List getPeers() {
                return this.peers;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: g, reason: from getter */
            public final Integer getPort() {
                return this.port;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: h, reason: from getter */
            public final List getReserved() {
                return this.reserved;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                List<VnextBean> list = this.vnext;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.alterId;
                int iE = oi0.e(this.level, pc6.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.security), 31);
                List<ServersBean> list2 = this.servers;
                int iHashCode2 = (iE + (list2 == null ? 0 : list2.hashCode())) * 31;
                Response response = this.response;
                int iHashCode3 = (iHashCode2 + (response == null ? 0 : response.hashCode())) * 31;
                String str = this.network;
                int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                Object obj = this.address;
                int iHashCode5 = (iHashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
                Integer num2 = this.port;
                int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                List<DNSRule> list3 = this.rules;
                int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
                String str2 = this.domainStrategy;
                int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.redirect;
                int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num3 = this.userLevel;
                int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
                List<FreedomFinalRule> list4 = this.finalRules;
                int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
                String str4 = this.inboundTag;
                int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.secretKey;
                int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
                List<WireGuardBean> list5 = this.peers;
                int iHashCode14 = (iHashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
                List<Integer> list6 = this.reserved;
                int iHashCode15 = (iHashCode14 + (list6 == null ? 0 : list6.hashCode())) * 31;
                Integer num4 = this.mtu;
                int iHashCode16 = (((((((((((iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31) + (this.encryption == null ? 0 : this.encryption.hashCode())) * 31) + (this.flow == null ? 0 : this.flow.hashCode())) * 31) + (this.id == null ? 0 : this.id.hashCode())) * 31) + (this.testPre == null ? 0 : this.testPre.hashCode())) * 31) + (this.testSeed == null ? 0 : this.testSeed.hashCode())) * 31;
                Integer num5 = this.version;
                return iHashCode16 + (num5 != null ? num5.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getSecretKey() {
                return this.secretKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getSecurity() {
                return this.security;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: k, reason: from getter */
            public final List getServers() {
                return this.servers;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: l, reason: from getter */
            public final List getVnext() {
                return this.vnext;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void m(Object obj) {
                this.address = obj;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void n() {
                this.domainStrategy = "UseIP";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void o(String str) {
                this.encryption = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void p(String str) {
                this.flow = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void q(String str) {
                this.id = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void r(Integer num) {
                this.mtu = num;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void s(Integer num) {
                this.port = num;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void t(List list) {
                this.reserved = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                List<VnextBean> list = this.vnext;
                Integer num = this.alterId;
                String str = this.security;
                int i = this.level;
                List<ServersBean> list2 = this.servers;
                Response response = this.response;
                String str2 = this.network;
                Object obj = this.address;
                Integer num2 = this.port;
                List<DNSRule> list3 = this.rules;
                String str3 = this.domainStrategy;
                String str4 = this.redirect;
                Integer num3 = this.userLevel;
                List<FreedomFinalRule> list4 = this.finalRules;
                String str5 = this.inboundTag;
                String str6 = this.secretKey;
                List<WireGuardBean> list5 = this.peers;
                List<Integer> list6 = this.reserved;
                Integer num4 = this.mtu;
                String str7 = this.encryption;
                String str8 = this.flow;
                String str9 = this.id;
                Integer num5 = this.testPre;
                List<Integer> list7 = this.testSeed;
                Integer num6 = this.version;
                StringBuilder sb = new StringBuilder("OutSettingsBean(vnext=");
                sb.append(list);
                sb.append(", alterId=");
                sb.append(num);
                sb.append(", security=");
                sb.append(str);
                sb.append(", level=");
                sb.append(i);
                sb.append(", servers=");
                sb.append(list2);
                sb.append(", response=");
                sb.append(response);
                sb.append(", network=");
                sb.append(str2);
                sb.append(", address=");
                sb.append(obj);
                sb.append(", port=");
                sb.append(num2);
                sb.append(", rules=");
                sb.append(list3);
                sb.append(", domainStrategy=");
                oi0.y(sb, str3, ", redirect=", str4, ", userLevel=");
                sb.append(num3);
                sb.append(", finalRules=");
                sb.append(list4);
                sb.append(", inboundTag=");
                oi0.y(sb, str5, ", secretKey=", str6, ", peers=");
                sb.append(list5);
                sb.append(", reserved=");
                sb.append(list6);
                sb.append(", mtu=");
                sb.append(num4);
                sb.append(", encryption=");
                sb.append(str7);
                sb.append(", flow=");
                oi0.y(sb, str8, ", id=", str9, ", testPre=");
                sb.append(num5);
                sb.append(", testSeed=");
                sb.append(list7);
                sb.append(", version=");
                sb.append(num6);
                sb.append(")");
                return sb.toString();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void u(String str) {
                this.secretKey = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void v(String str) {
                str.getClass();
                this.security = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void w() {
                this.vnext = null;
            }

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "rand", "b", "setRand", "randRange", "c", "setRandRange", "delay", "a", "setDelay", "Ljava/io/Serializable;", "packet", "Ljava/io/Serializable;", "getPacket", "()Ljava/io/Serializable;", "setPacket", "(Ljava/io/Serializable;)V", "app"}, k = StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
            public static final /* data */ class NoisesBean {
                public static final int $stable = 8;
                private String delay;
                private Serializable packet;
                private String rand;
                private String randRange;
                private String type;

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (null java.lang.String)
  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0008: ARITH (r9v0 int) & (4 int) A[WRAPPED] (LINE:9)) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000f: ARITH (r9v0 int) & (8 int) A[WRAPPED] (LINE:16)) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (null java.io.Serializable)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.io.Serializable):void (m)] (LINE:26) call: su.happ.proxyutility.dto.XRayConfig.OutboundBean.OutSettingsBean.NoisesBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.io.Serializable):void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ NoisesBean(int i, String str, String str2, String str3) {
                    this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDelay() {
                    return this.delay;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getRand() {
                    return this.rand;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getRandRange() {
                    return this.randRange;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NoisesBean)) {
                        return false;
                    }
                    NoisesBean noisesBean = (NoisesBean) obj;
                    return dh3.f(this.type, noisesBean.type) && dh3.f(this.rand, noisesBean.rand) && dh3.f(this.randRange, noisesBean.randRange) && dh3.f(this.delay, noisesBean.delay) && dh3.f(this.packet, noisesBean.packet);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    String str = this.type;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.rand;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.randRange;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.delay;
                    int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    Serializable serializable = this.packet;
                    return iHashCode4 + (serializable != null ? serializable.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final String toString() {
                    String str = this.type;
                    String str2 = this.rand;
                    String str3 = this.randRange;
                    String str4 = this.delay;
                    Serializable serializable = this.packet;
                    StringBuilder sbT = oi0.t("NoisesBean(type=", str, ", rand=", str2, ", randRange=");
                    oi0.y(sbT, str3, ", delay=", str4, ", packet=");
                    sbT.append(serializable);
                    sbT.append(")");
                    return sbT.toString();
                }

                public NoisesBean(String str, String str2, String str3, String str4, Serializable serializable) {
                    this.type = str;
                    this.rand = str2;
                    this.randRange = str3;
                    this.delay = str4;
                    this.packet = serializable;
                }
            }

            public OutSettingsBean() {
                this(null, null, 33554431);
            }
        }

        public OutboundBean(String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, Object obj, String str3, MuxBean muxBean) {
            str.getClass();
            this.tag = str;
            this.protocol = str2;
            this.settings = outSettingsBean;
            this.streamSettings = streamSettingsBean;
            this.proxySettings = obj;
            this.sendThrough = str3;
            this.mux = muxBean;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0019\u0010$\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010(\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;", "", "", "tag", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "", "port", "I", "a", "()I", "g", "(I)V", "protocol", "b", "setProtocol", "listen", "getListen", "f", "Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;", "settings", "Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;", "c", "()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;", "h", "(Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;)V", "Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;", "sniffing", "Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;", "d", "()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;", "i", "(Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;)V", "streamSettings", "Ljava/lang/Object;", "getStreamSettings", "()Ljava/lang/Object;", "allocate", "getAllocate", "InSettingsBean", "SniffingBean", "Account", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class InboundBean {
        public static final int $stable = 8;
        private int port;
        private InSettingsBean settings;
        private String tag = "dns-in";
        private String protocol = "dokodemo-door";
        private String listen = "127.0.0.1";
        private SniffingBean sniffing = null;
        private final Object streamSettings = null;
        private final Object allocate = null;

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$Account;", "", "", "user", "Ljava/lang/String;", "getUser", "()Ljava/lang/String;", "setUser", "(Ljava/lang/String;)V", "pass", "getPass", "setPass", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class Account {
            public static final int $stable = 8;
            private String pass;
            private String user;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Account(String str, String str2) {
                this.user = str;
                this.pass = str2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Account)) {
                    return false;
                }
                Account account = (Account) obj;
                return dh3.f(this.user, account.user) && dh3.f(this.pass, account.pass);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                String str = this.user;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.pass;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return pc6.q("Account(user=", this.user, ", pass=", this.pass, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;", "", "", "enabled", "Z", "getEnabled", "()Z", "b", "(Z)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "destOverride", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "metadataOnly", "Ljava/lang/Boolean;", "getMetadataOnly", "()Ljava/lang/Boolean;", "routeOnly", "getRouteOnly", "setRouteOnly", "(Ljava/lang/Boolean;)V", "", "domainsExcluded", "Ljava/util/List;", "getDomainsExcluded", "()Ljava/util/List;", "setDomainsExcluded", "(Ljava/util/List;)V", "ipsExcluded", "getIpsExcluded", "setIpsExcluded", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class SniffingBean {
            public static final int $stable = 8;
            private final ArrayList<String> destOverride;
            private boolean enabled = true;
            private final Boolean metadataOnly = null;
            private Boolean routeOnly = null;
            private List<String> domainsExcluded = null;
            private List<String> ipsExcluded = null;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public SniffingBean(ArrayList arrayList) {
                this.destOverride = arrayList;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: renamed from: a, reason: from getter */
            public final ArrayList getDestOverride() {
                return this.destOverride;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void b(boolean z) {
                this.enabled = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SniffingBean)) {
                    return false;
                }
                SniffingBean sniffingBean = (SniffingBean) obj;
                return this.enabled == sniffingBean.enabled && dh3.f(this.destOverride, sniffingBean.destOverride) && dh3.f(this.metadataOnly, sniffingBean.metadataOnly) && dh3.f(this.routeOnly, sniffingBean.routeOnly) && dh3.f(this.domainsExcluded, sniffingBean.domainsExcluded) && dh3.f(this.ipsExcluded, sniffingBean.ipsExcluded);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                int iHashCode = (this.destOverride.hashCode() + (Boolean.hashCode(this.enabled) * 31)) * 31;
                Boolean bool = this.metadataOnly;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.routeOnly;
                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                List<String> list = this.domainsExcluded;
                int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                List<String> list2 = this.ipsExcluded;
                return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                return "SniffingBean(enabled=" + this.enabled + ", destOverride=" + this.destOverride + ", metadataOnly=" + this.metadataOnly + ", routeOnly=" + this.routeOnly + ", domainsExcluded=" + this.domainsExcluded + ", ipsExcluded=" + this.ipsExcluded + ")";
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public InboundBean(int i, InSettingsBean inSettingsBean) {
            this.port = i;
            this.settings = inSettingsBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getProtocol() {
            return this.protocol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c, reason: from getter */
        public final InSettingsBean getSettings() {
            return this.settings;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d, reason: from getter */
        public final SniffingBean getSniffing() {
            return this.sniffing;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InboundBean)) {
                return false;
            }
            InboundBean inboundBean = (InboundBean) obj;
            return dh3.f(this.tag, inboundBean.tag) && this.port == inboundBean.port && dh3.f(this.protocol, inboundBean.protocol) && dh3.f(this.listen, inboundBean.listen) && dh3.f(this.settings, inboundBean.settings) && dh3.f(this.sniffing, inboundBean.sniffing) && dh3.f(this.streamSettings, inboundBean.streamSettings) && dh3.f(this.allocate, inboundBean.allocate);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void f() {
            this.listen = "127.0.0.1";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void g(int i) {
            this.port = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void h(InSettingsBean inSettingsBean) {
            this.settings = inSettingsBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            int iE = pc6.e(oi0.e(this.port, this.tag.hashCode() * 31, 31), 31, this.protocol);
            String str = this.listen;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            InSettingsBean inSettingsBean = this.settings;
            int iHashCode2 = (iHashCode + (inSettingsBean == null ? 0 : inSettingsBean.hashCode())) * 31;
            SniffingBean sniffingBean = this.sniffing;
            int iHashCode3 = (iHashCode2 + (sniffingBean == null ? 0 : sniffingBean.hashCode())) * 31;
            Object obj = this.streamSettings;
            int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.allocate;
            return iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void i(SniffingBean sniffingBean) {
            this.sniffing = sniffingBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            String str = this.tag;
            int i = this.port;
            String str2 = this.protocol;
            String str3 = this.listen;
            InSettingsBean inSettingsBean = this.settings;
            SniffingBean sniffingBean = this.sniffing;
            Object obj = this.streamSettings;
            Object obj2 = this.allocate;
            StringBuilder sb = new StringBuilder("InboundBean(tag=");
            sb.append(str);
            sb.append(", port=");
            sb.append(i);
            sb.append(", protocol=");
            oi0.y(sb, str2, ", listen=", str3, ", settings=");
            sb.append(inSettingsBean);
            sb.append(", sniffing=");
            sb.append(sniffingBean);
            sb.append(", streamSettings=");
            sb.append(obj);
            sb.append(", allocate=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR$\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0019\u0010'\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006¨\u0006+"}, d2 = {"Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;", "", "", "auth", "Ljava/lang/String;", "getAuth", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "", "Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$Account;", "accounts", "Ljava/util/List;", "getAccounts", "()Ljava/util/List;", "a", "(Ljava/util/List;)V", "", "udp", "Ljava/lang/Boolean;", "getUdp", "()Ljava/lang/Boolean;", "setUdp", "(Ljava/lang/Boolean;)V", "", "userLevel", "Ljava/lang/Integer;", "getUserLevel", "()Ljava/lang/Integer;", "setUserLevel", "(Ljava/lang/Integer;)V", "name", "getName", "setName", "mtu", "getMtu", "c", "address", "getAddress", "port", "getPort", "network", "getNetwork", "app"}, k = OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
        public static final /* data */ class InSettingsBean {
            public static final int $stable = 8;
            private List<Account> accounts;
            private final String address;
            private String auth;

            @p37("MTU")
            private Integer mtu;
            private String name;
            private final String network;
            private final Integer port;
            private Boolean udp;
            private Integer userLevel;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public InSettingsBean(String str, int i) {
                str = (i & 64) != 0 ? null : str;
                Integer num = (i & 128) != 0 ? null : 53;
                String str2 = (i & 256) != 0 ? null : "tcp,udp";
                this.auth = null;
                this.accounts = null;
                this.udp = null;
                this.userLevel = null;
                this.name = null;
                this.mtu = null;
                this.address = str;
                this.port = num;
                this.network = str2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void a(List list) {
                this.accounts = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void b(String str) {
                this.auth = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void c(Integer num) {
                this.mtu = num;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InSettingsBean)) {
                    return false;
                }
                InSettingsBean inSettingsBean = (InSettingsBean) obj;
                return dh3.f(this.auth, inSettingsBean.auth) && dh3.f(this.accounts, inSettingsBean.accounts) && dh3.f(this.udp, inSettingsBean.udp) && dh3.f(this.userLevel, inSettingsBean.userLevel) && dh3.f(this.name, inSettingsBean.name) && dh3.f(this.mtu, inSettingsBean.mtu) && dh3.f(this.address, inSettingsBean.address) && dh3.f(this.port, inSettingsBean.port) && dh3.f(this.network, inSettingsBean.network);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                String str = this.auth;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<Account> list = this.accounts;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                Boolean bool = this.udp;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num = this.userLevel;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.name;
                int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.mtu == null ? 0 : this.mtu.hashCode())) * 31;
                String str3 = this.address;
                int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num2 = this.port;
                int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str4 = this.network;
                return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final String toString() {
                String str = this.auth;
                List<Account> list = this.accounts;
                Boolean bool = this.udp;
                Integer num = this.userLevel;
                String str2 = this.name;
                Integer num2 = this.mtu;
                String str3 = this.address;
                Integer num3 = this.port;
                String str4 = this.network;
                StringBuilder sb = new StringBuilder("InSettingsBean(auth=");
                sb.append(str);
                sb.append(", accounts=");
                sb.append(list);
                sb.append(", udp=");
                sb.append(bool);
                sb.append(", userLevel=");
                sb.append(num);
                sb.append(", name=");
                sb.append(str2);
                sb.append(", mtu=");
                sb.append(num2);
                sb.append(", address=");
                sb.append(str3);
                sb.append(", port=");
                sb.append(num3);
                sb.append(", network=");
                return oi0.p(sb, str4, ")");
            }

            public InSettingsBean() {
                this(null, 511);
            }
        }
    }
}

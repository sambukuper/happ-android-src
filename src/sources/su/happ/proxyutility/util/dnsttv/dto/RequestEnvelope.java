package su.happ.proxyutility.util.dnsttv.dto;

import defpackage.ss8;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0003564R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010%\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010'\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0019\u0010)\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u001f\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u0019\u00102\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b3\u0010\"¨\u00067"}, d2 = {"Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;", "", "Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;", "deviceOS", "Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;", "getDeviceOS", "()Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;", "", "apiMajor", "I", "getApiMajor", "()I", "apiMinor", "getApiMinor", "appMajor", "getAppMajor", "appMinor", "getAppMinor", "appPatch", "getAppPatch", "Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;", "url", "Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;", "b", "()Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;", "", "subExpire", "Ljava/lang/Long;", "getSubExpire", "()Ljava/lang/Long;", "", "osVersion", "Ljava/lang/String;", "getOsVersion", "()Ljava/lang/String;", "hwid", "getHwid", "bundleId", "getBundleId", "deviceModel", "getDeviceModel", "domainHash", "getDomainHash", "", "pids", "Ljava/util/List;", "getPids", "()Ljava/util/List;", "iid", "getIid", "tid", "getTid", "Companion", "DeviceOS", "Route", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class RequestEnvelope {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final byte VERSION = 1;
    private final int apiMajor;
    private final int apiMinor;
    private final int appMajor;
    private final int appMinor;
    private final int appPatch;
    private final String bundleId;
    private final String deviceModel;
    private final DeviceOS deviceOS;
    private final String domainHash;
    private final String hwid;
    private final String iid;
    private final String osVersion;
    private final List<String> pids;
    private final Long subExpire;
    private final String tid;
    private final Route url;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Companion;", "", "", "VERSION", "B", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static void a(ArrayList arrayList, byte[] bArr) {
            int length = bArr.length;
            arrayList.add(Byte.valueOf((byte) ((length >>> 8) & 255)));
            arrayList.add(Byte.valueOf((byte) (length & 255)));
            for (byte b : bArr) {
                arrayList.add(Byte.valueOf(b));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static byte b(int i) {
            if (i < 0) {
                i = 0;
            } else if (i > 255) {
                i = 255;
            }
            return (byte) i;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope$DeviceOS[], still in use, count: 1, list:
  (r0v1 su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope$DeviceOS[]) from 0x004e: CONSTRUCTOR (r0v1 su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope$DeviceOS[]) A[WRAPPED] (LINE:79) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;", "", "", "raw", "B", "a", "()B", "iOS", "tvOS", "macOS", "Android", "AndroidTV", "Windows", "Linux", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class DeviceOS {
        iOS((byte) 0),
        tvOS((byte) 1),
        macOS((byte) 2),
        Android((byte) 3),
        AndroidTV((byte) 4),
        Windows((byte) 5),
        Linux((byte) 6);

        private static final /* synthetic */ l22 $ENTRIES;
        private final byte raw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            $ENTRIES = new n22(deviceOSArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DeviceOS(byte b) {
            super(str, i);
            this.raw = b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static DeviceOS valueOf(String str) {
            return (DeviceOS) Enum.valueOf(DeviceOS.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static DeviceOS[] values() {
            return (DeviceOS[]) $VALUES.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte getRaw() {
            return this.raw;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope$Route[], still in use, count: 1, list:
  (r0v1 su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope$Route[]) from 0x0026: CONSTRUCTOR (r0v1 su.happ.proxyutility.util.dnsttv.dto.RequestEnvelope$Route[]) A[WRAPPED] (LINE:39) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;", "", "", "raw", "B", "a", "()B", "Provider", "RemotePush", "Install", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Route {
        Provider((byte) 0),
        RemotePush((byte) 1),
        Install((byte) 2);

        private static final /* synthetic */ l22 $ENTRIES;
        private final byte raw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            $ENTRIES = new n22(routeArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Route(byte b) {
            super(str, i);
            this.raw = b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Route valueOf(String str) {
            return (Route) Enum.valueOf(Route.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Route[] values() {
            return (Route[]) $VALUES.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte getRaw() {
            return this.raw;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RequestEnvelope(DeviceOS deviceOS, int i, int i2, int i3, Route route, Long l, String str, String str2, String str3, String str4, List list, String str5, String str6) {
        deviceOS.getClass();
        route.getClass();
        str.getClass();
        str2.getClass();
        this.deviceOS = deviceOS;
        this.apiMajor = 1;
        this.apiMinor = 0;
        this.appMajor = i;
        this.appMinor = i2;
        this.appPatch = i3;
        this.url = route;
        this.subExpire = l;
        this.osVersion = str;
        this.hwid = str2;
        this.bundleId = "su.happ.proxyutility";
        this.deviceModel = str3;
        this.domainHash = str4;
        this.pids = list;
        this.iid = str5;
        this.tid = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] a() {
        byte[] bytes;
        byte[] bytes2;
        byte[] bytes3;
        int i = 0;
        ArrayList arrayList = new ArrayList(128);
        arrayList.add((byte) 1);
        arrayList.add(Byte.valueOf(this.deviceOS.getRaw()));
        Companion companion = INSTANCE;
        int i2 = this.apiMajor;
        companion.getClass();
        arrayList.add(Byte.valueOf(Companion.b(i2)));
        arrayList.add(Byte.valueOf(Companion.b(this.apiMinor)));
        arrayList.add(Byte.valueOf(Companion.b(this.appMajor)));
        arrayList.add(Byte.valueOf(Companion.b(this.appMinor)));
        arrayList.add(Byte.valueOf(Companion.b(this.appPatch)));
        arrayList.add(Byte.valueOf(this.url.getRaw()));
        Long l = this.subExpire;
        if (l != null) {
            long jLongValue = l.longValue();
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 56) & 255)));
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 48) & 255)));
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 40) & 255)));
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 32) & 255)));
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 24) & 255)));
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 16) & 255)));
            arrayList.add(Byte.valueOf((byte) ((jLongValue >>> 8) & 255)));
            arrayList.add(Byte.valueOf((byte) (jLongValue & 255)));
        } else {
            for (int i3 = 1; i3 < 9; i3++) {
                arrayList.add((byte) 0);
            }
        }
        Companion companion2 = INSTANCE;
        String str = this.osVersion;
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes4 = str.getBytes(charset);
        bytes4.getClass();
        companion2.getClass();
        Companion.a(arrayList, bytes4);
        ss8 ss8Var = ss8.a;
        Companion.a(arrayList, ss8.r(this.hwid));
        byte[] bytes5 = this.bundleId.getBytes(charset);
        bytes5.getClass();
        Companion.a(arrayList, bytes5);
        String str2 = this.deviceModel;
        if (str2 != null) {
            bytes = str2.getBytes(charset);
            bytes.getClass();
        } else {
            bytes = new byte[0];
        }
        Companion.a(arrayList, bytes);
        String str3 = this.domainHash;
        Companion.a(arrayList, str3 != null ? ss8.r(str3) : new byte[0]);
        List<String> list = this.pids;
        if (list == null) {
            arrayList.add((byte) 0);
        } else {
            if (list.size() > 255) {
                em7.c(ie2.h("pids list exceeds 255 entries (got ", list.size(), ")"));
                return null;
            }
            arrayList.add(Byte.valueOf((byte) list.size()));
            for (String str4 : list) {
                Companion companion3 = INSTANCE;
                Charset charset2 = StandardCharsets.UTF_8;
                charset2.getClass();
                byte[] bytes6 = str4.getBytes(charset2);
                bytes6.getClass();
                companion3.getClass();
                Companion.a(arrayList, bytes6);
            }
        }
        Companion companion4 = INSTANCE;
        String str5 = this.iid;
        if (str5 != null) {
            Charset charset3 = StandardCharsets.UTF_8;
            charset3.getClass();
            bytes2 = str5.getBytes(charset3);
            bytes2.getClass();
        } else {
            bytes2 = new byte[0];
        }
        companion4.getClass();
        Companion.a(arrayList, bytes2);
        String str6 = this.tid;
        if (str6 != null) {
            Charset charset4 = StandardCharsets.UTF_8;
            charset4.getClass();
            bytes3 = str6.getBytes(charset4);
            bytes3.getClass();
        } else {
            bytes3 = new byte[0];
        }
        Companion.a(arrayList, bytes3);
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Route getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestEnvelope)) {
            return false;
        }
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        return this.deviceOS == requestEnvelope.deviceOS && this.apiMajor == requestEnvelope.apiMajor && this.apiMinor == requestEnvelope.apiMinor && this.appMajor == requestEnvelope.appMajor && this.appMinor == requestEnvelope.appMinor && this.appPatch == requestEnvelope.appPatch && this.url == requestEnvelope.url && dh3.f(this.subExpire, requestEnvelope.subExpire) && dh3.f(this.osVersion, requestEnvelope.osVersion) && dh3.f(this.bundleId, requestEnvelope.bundleId) && dh3.f(this.deviceModel, requestEnvelope.deviceModel) && dh3.f(this.pids, requestEnvelope.pids) && dh3.f(this.iid, requestEnvelope.iid) && dh3.f(this.tid, requestEnvelope.tid) && this.hwid.contentEquals(requestEnvelope.hwid) && mm7.Q(this.domainHash, requestEnvelope.domainHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        byte[] bytes;
        int iHashCode = (this.url.hashCode() + (((((((((((this.deviceOS.hashCode() * 31) + this.apiMajor) * 31) + this.apiMinor) * 31) + this.appMajor) * 31) + this.appMinor) * 31) + this.appPatch) * 31)) * 31;
        Long l = this.subExpire;
        int iE = pc6.e(pc6.e((iHashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.osVersion), 31, this.bundleId);
        String str = this.deviceModel;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.pids;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.iid;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tid;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.hwid;
        Charset charset = iq0.a;
        byte[] bytes2 = str4.getBytes(charset);
        bytes2.getClass();
        int iHashCode6 = (Arrays.hashCode(bytes2) + iHashCode5) * 31;
        String str5 = this.domainHash;
        if (str5 != null) {
            bytes = str5.getBytes(charset);
            bytes.getClass();
        } else {
            bytes = null;
        }
        return Arrays.hashCode(bytes) + iHashCode6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        DeviceOS deviceOS = this.deviceOS;
        int i = this.apiMajor;
        int i2 = this.apiMinor;
        int i3 = this.appMajor;
        int i4 = this.appMinor;
        int i5 = this.appPatch;
        Route route = this.url;
        Long l = this.subExpire;
        String str = this.osVersion;
        String str2 = this.hwid;
        String str3 = this.bundleId;
        String str4 = this.deviceModel;
        String str5 = this.domainHash;
        List<String> list = this.pids;
        String str6 = this.iid;
        String str7 = this.tid;
        StringBuilder sb = new StringBuilder("RequestEnvelope(deviceOS=");
        sb.append(deviceOS);
        sb.append(", apiMajor=");
        sb.append(i);
        sb.append(", apiMinor=");
        oi0.x(sb, i2, ", appMajor=", i3, ", appMinor=");
        oi0.x(sb, i4, ", appPatch=", i5, ", url=");
        sb.append(route);
        sb.append(", subExpire=");
        sb.append(l);
        sb.append(", osVersion=");
        oi0.y(sb, str, ", hwid=", str2, ", bundleId=");
        oi0.y(sb, str3, ", deviceModel=", str4, ", domainHash=");
        sb.append(str5);
        sb.append(", pids=");
        sb.append(list);
        sb.append(", iid=");
        return oi0.q(sb, str6, ", tid=", str7, ")");
    }
}

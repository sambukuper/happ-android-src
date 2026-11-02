package okhttp3.internal.dns;

import defpackage.d02;
import defpackage.dh3;
import defpackage.ge1;
import defpackage.kb0;
import defpackage.oi0;
import defpackage.p61;
import defpackage.pc6;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/ResourceRecord;", _UrlKt.FRAGMENT_ENCODE_SET, "name", _UrlKt.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "timeToLive", _UrlKt.FRAGMENT_ENCODE_SET, "getTimeToLive", "()I", "IpAddress", "Https", "Lokhttp3/internal/dns/ResourceRecord$Https;", "Lokhttp3/internal/dns/ResourceRecord$IpAddress;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ResourceRecord {

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/dns/ResourceRecord$IpAddress;", "Lokhttp3/internal/dns/ResourceRecord;", "name", _UrlKt.FRAGMENT_ENCODE_SET, "timeToLive", _UrlKt.FRAGMENT_ENCODE_SET, "address", "Ljava/net/InetAddress;", "<init>", "(Ljava/lang/String;ILjava/net/InetAddress;)V", "getName", "()Ljava/lang/String;", "getTimeToLive", "()I", "getAddress", "()Ljava/net/InetAddress;", "component1", "component2", "component3", "copy", "equals", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "toString", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IpAddress implements ResourceRecord {
        private final InetAddress address;
        private final String name;
        private final int timeToLive;

        public IpAddress(String str, int i, InetAddress inetAddress) {
            str.getClass();
            inetAddress.getClass();
            this.name = str;
            this.timeToLive = i;
            this.address = inetAddress;
        }

        public static /* synthetic */ IpAddress copy$default(IpAddress ipAddress, String str, int i, InetAddress inetAddress, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = ipAddress.name;
            }
            if ((i2 & 2) != 0) {
                i = ipAddress.timeToLive;
            }
            if ((i2 & 4) != 0) {
                inetAddress = ipAddress.address;
            }
            return ipAddress.copy(str, i, inetAddress);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTimeToLive() {
            return this.timeToLive;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final InetAddress getAddress() {
            return this.address;
        }

        public final IpAddress copy(String name, int timeToLive, InetAddress address) {
            name.getClass();
            address.getClass();
            return new IpAddress(name, timeToLive, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IpAddress)) {
                return false;
            }
            IpAddress ipAddress = (IpAddress) other;
            return dh3.f(this.name, ipAddress.name) && this.timeToLive == ipAddress.timeToLive && dh3.f(this.address, ipAddress.address);
        }

        public final InetAddress getAddress() {
            return this.address;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public String getName() {
            return this.name;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public int getTimeToLive() {
            return this.timeToLive;
        }

        public int hashCode() {
            return this.address.hashCode() + oi0.e(this.timeToLive, this.name.hashCode() * 31, 31);
        }

        public String toString() {
            return "IpAddress(name=" + this.name + ", timeToLive=" + this.timeToLive + ", address=" + this.address + ')';
        }
    }

    String getName();

    int getTimeToLive();

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJp\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0012R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0018R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u00100R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b1\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001c¨\u00064"}, d2 = {"Lokhttp3/internal/dns/ResourceRecord$Https;", "Lokhttp3/internal/dns/ResourceRecord;", _UrlKt.FRAGMENT_ENCODE_SET, "name", _UrlKt.FRAGMENT_ENCODE_SET, "timeToLive", "priority", "targetName", _UrlKt.FRAGMENT_ENCODE_SET, "alpnIds", "port", "Ljava/net/InetAddress;", "ipAddressHints", "Lkb0;", "echConfigList", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;ILjava/util/List;Lkb0;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lkb0;", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;ILjava/util/List;Lkb0;)Lokhttp3/internal/dns/ResourceRecord$Https;", "toString", "hashCode", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "I", "getTimeToLive", "getPriority", "getTargetName", "Ljava/util/List;", "getAlpnIds", "getPort", "setPort", "(I)V", "getIpAddressHints", "Lkb0;", "getEchConfigList", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Https implements ResourceRecord {
        private final List<String> alpnIds;
        private final kb0 echConfigList;
        private final List<InetAddress> ipAddressHints;
        private final String name;
        private int port;
        private final int priority;
        private final String targetName;
        private final int timeToLive;

        public /* synthetic */ Https(String str, int i, int i2, String str2, List list, int i3, List list2, kb0 kb0Var, int i4, ge1 ge1Var) {
            this(str, i, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str2, (i4 & 16) != 0 ? null : list, (i4 & 32) != 0 ? 443 : i3, (i4 & 64) != 0 ? d02.X : list2, (i4 & 128) != 0 ? null : kb0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Https copy$default(Https https, String str, int i, int i2, String str2, List list, int i3, List list2, kb0 kb0Var, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = https.name;
            }
            if ((i4 & 2) != 0) {
                i = https.timeToLive;
            }
            if ((i4 & 4) != 0) {
                i2 = https.priority;
            }
            if ((i4 & 8) != 0) {
                str2 = https.targetName;
            }
            if ((i4 & 16) != 0) {
                list = https.alpnIds;
            }
            if ((i4 & 32) != 0) {
                i3 = https.port;
            }
            if ((i4 & 64) != 0) {
                list2 = https.ipAddressHints;
            }
            if ((i4 & 128) != 0) {
                kb0Var = https.echConfigList;
            }
            List list3 = list2;
            kb0 kb0Var2 = kb0Var;
            List list4 = list;
            int i5 = i3;
            return https.copy(str, i, i2, str2, list4, i5, list3, kb0Var2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTimeToLive() {
            return this.timeToLive;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTargetName() {
            return this.targetName;
        }

        public final List<String> component5() {
            return this.alpnIds;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final List<InetAddress> component7() {
            return this.ipAddressHints;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final kb0 getEchConfigList() {
            return this.echConfigList;
        }

        public final Https copy(String name, int timeToLive, int priority, String targetName, List<String> alpnIds, int port, List<? extends InetAddress> ipAddressHints, kb0 echConfigList) {
            name.getClass();
            targetName.getClass();
            ipAddressHints.getClass();
            return new Https(name, timeToLive, priority, targetName, alpnIds, port, ipAddressHints, echConfigList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Https)) {
                return false;
            }
            Https https = (Https) other;
            return dh3.f(this.name, https.name) && this.timeToLive == https.timeToLive && this.priority == https.priority && dh3.f(this.targetName, https.targetName) && dh3.f(this.alpnIds, https.alpnIds) && this.port == https.port && dh3.f(this.ipAddressHints, https.ipAddressHints) && dh3.f(this.echConfigList, https.echConfigList);
        }

        public final List<String> getAlpnIds() {
            return this.alpnIds;
        }

        public final kb0 getEchConfigList() {
            return this.echConfigList;
        }

        public final List<InetAddress> getIpAddressHints() {
            return this.ipAddressHints;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public String getName() {
            return this.name;
        }

        public final int getPort() {
            return this.port;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final String getTargetName() {
            return this.targetName;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public int getTimeToLive() {
            return this.timeToLive;
        }

        public int hashCode() {
            int iE = pc6.e(oi0.e(this.priority, oi0.e(this.timeToLive, this.name.hashCode() * 31, 31), 31), 31, this.targetName);
            List<String> list = this.alpnIds;
            int iF = p61.f(oi0.e(this.port, (iE + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.ipAddressHints);
            kb0 kb0Var = this.echConfigList;
            return iF + (kb0Var != null ? kb0Var.hashCode() : 0);
        }

        public final void setPort(int i) {
            this.port = i;
        }

        public String toString() {
            return "Https(name=" + this.name + ", timeToLive=" + this.timeToLive + ", priority=" + this.priority + ", targetName=" + this.targetName + ", alpnIds=" + this.alpnIds + ", port=" + this.port + ", ipAddressHints=" + this.ipAddressHints + ", echConfigList=" + this.echConfigList + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Https(String str, int i, int i2, String str2, List<String> list, int i3, List<? extends InetAddress> list2, kb0 kb0Var) {
            str.getClass();
            str2.getClass();
            list2.getClass();
            this.name = str;
            this.timeToLive = i;
            this.priority = i2;
            this.targetName = str2;
            this.alpnIds = list;
            this.port = i3;
            this.ipAddressHints = list2;
            this.echConfigList = kb0Var;
        }
    }
}

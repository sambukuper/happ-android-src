package su.happ.proxyutility.util.dnsttv.dto;

import defpackage.br1;
import java.util.Arrays;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;", "", "Lbr1;", "name", "Lbr1;", "c", "()Lbr1;", "Ldl8;", "type", "S", "e", "()S", "cls", "a", "Llk8;", "ttl", "I", "d", "()I", "", "data", "[B", "b", "()[B", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class DnsRR {
    public static final int $stable = 8;
    private final short cls;
    private final byte[] data;
    private final br1 name;
    private final int ttl;
    private final short type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DnsRR(br1 br1Var, short s, short s2, int i, byte[] bArr) {
        br1Var.getClass();
        this.name = br1Var;
        this.type = s;
        this.cls = s2;
        this.ttl = i;
        this.data = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final short getCls() {
        return this.cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final br1 getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTtl() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final short getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DnsRR)) {
            return false;
        }
        DnsRR dnsRR = (DnsRR) obj;
        return dh3.f(this.name, dnsRR.name) && this.type == dnsRR.type && this.cls == dnsRR.cls && this.ttl == dnsRR.ttl && Arrays.equals(this.data, dnsRR.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.data) + oi0.e(this.ttl, (Short.hashCode(this.cls) + ((Short.hashCode(this.type) + (this.name.hashCode() * 31)) * 31)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        br1 br1Var = this.name;
        String strA = dl8.a(this.type);
        String strA2 = dl8.a(this.cls);
        String strValueOf = String.valueOf(((long) this.ttl) & 4294967295L);
        String string = Arrays.toString(this.data);
        StringBuilder sb = new StringBuilder("DnsRR(name=");
        sb.append(br1Var);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", cls=");
        oi0.y(sb, strA2, ", ttl=", strValueOf, ", data=");
        return oi0.p(sb, string, ")");
    }
}

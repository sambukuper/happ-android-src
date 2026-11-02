package su.happ.proxyutility.dto.enums;

import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 su.happ.proxyutility.dto.enums.RoutingOrder[], still in use, count: 1, list:
  (r0v1 su.happ.proxyutility.dto.enums.RoutingOrder[]) from 0x0050: CONSTRUCTOR (r0v1 su.happ.proxyutility.dto.enums.RoutingOrder[]) A[WRAPPED] (LINE:81) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lsu/happ/proxyutility/dto/enums/RoutingOrder;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "BLOCK_PROXY_DIRECT", "BLOCK_DIRECT_PROXY", "PROXY_DIRECT_BLOCK", "PROXY_BLOCK_DIRECT", "DIRECT_PROXY_BLOCK", "DIRECT_BLOCK_PROXY", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class RoutingOrder {
    BLOCK_PROXY_DIRECT("block-proxy-direct"),
    BLOCK_DIRECT_PROXY("block-direct-proxy"),
    PROXY_DIRECT_BLOCK("proxy-direct-block"),
    PROXY_BLOCK_DIRECT("proxy-block-direct"),
    DIRECT_PROXY_BLOCK("direct-proxy-block"),
    DIRECT_BLOCK_PROXY("direct-block-proxy");

    private static final /* synthetic */ l22 $ENTRIES;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        $ENTRIES = new n22(new RoutingOrder[]{r0, r1, r2, r3, r4, r5});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RoutingOrder(String str) {
        super(str, i);
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l22 a() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RoutingOrder valueOf(String str) {
        return (RoutingOrder) Enum.valueOf(RoutingOrder.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RoutingOrder[] values() {
        return (RoutingOrder[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

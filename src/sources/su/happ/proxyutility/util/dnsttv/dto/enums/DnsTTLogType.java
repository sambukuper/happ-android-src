package su.happ.proxyutility.util.dnsttv.dto.enums;

import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;", "", "DEBUG", "INFO", "NONCE", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class DnsTTLogType {
    private static final /* synthetic */ l22 $ENTRIES;
    private static final /* synthetic */ DnsTTLogType[] $VALUES;
    public static final DnsTTLogType DEBUG;
    public static final DnsTTLogType INFO;
    public static final DnsTTLogType NONCE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        DnsTTLogType dnsTTLogType = new DnsTTLogType("DEBUG", 0);
        DEBUG = dnsTTLogType;
        DnsTTLogType dnsTTLogType2 = new DnsTTLogType("INFO", 1);
        INFO = dnsTTLogType2;
        DnsTTLogType dnsTTLogType3 = new DnsTTLogType("NONCE", 2);
        NONCE = dnsTTLogType3;
        DnsTTLogType[] dnsTTLogTypeArr = {dnsTTLogType, dnsTTLogType2, dnsTTLogType3};
        $VALUES = dnsTTLogTypeArr;
        $ENTRIES = new n22(dnsTTLogTypeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DnsTTLogType valueOf(String str) {
        return (DnsTTLogType) Enum.valueOf(DnsTTLogType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DnsTTLogType[] values() {
        return (DnsTTLogType[]) $VALUES.clone();
    }
}

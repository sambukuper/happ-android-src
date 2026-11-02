package su.happ.proxyutility.dto.enums;

import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/dto/enums/InboundAuthType;", "", "SOCKS", "HTTP", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class InboundAuthType {
    private static final /* synthetic */ l22 $ENTRIES;
    private static final /* synthetic */ InboundAuthType[] $VALUES;
    public static final InboundAuthType HTTP;
    public static final InboundAuthType SOCKS;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        InboundAuthType inboundAuthType = new InboundAuthType("SOCKS", 0);
        SOCKS = inboundAuthType;
        InboundAuthType inboundAuthType2 = new InboundAuthType("HTTP", 1);
        HTTP = inboundAuthType2;
        InboundAuthType[] inboundAuthTypeArr = {inboundAuthType, inboundAuthType2};
        $VALUES = inboundAuthTypeArr;
        $ENTRIES = new n22(inboundAuthTypeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InboundAuthType valueOf(String str) {
        return (InboundAuthType) Enum.valueOf(InboundAuthType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InboundAuthType[] values() {
        return (InboundAuthType[]) $VALUES.clone();
    }
}

package su.happ.proxyutility.dto.enums;

import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/dto/enums/ERoutingSettingsType;", "", "PROXY", "DIRECT", "BLOCK", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ERoutingSettingsType {
    private static final /* synthetic */ l22 $ENTRIES;
    private static final /* synthetic */ ERoutingSettingsType[] $VALUES;
    public static final ERoutingSettingsType BLOCK;
    public static final ERoutingSettingsType DIRECT;
    public static final ERoutingSettingsType PROXY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ERoutingSettingsType eRoutingSettingsType = new ERoutingSettingsType("PROXY", 0);
        PROXY = eRoutingSettingsType;
        ERoutingSettingsType eRoutingSettingsType2 = new ERoutingSettingsType("DIRECT", 1);
        DIRECT = eRoutingSettingsType2;
        ERoutingSettingsType eRoutingSettingsType3 = new ERoutingSettingsType("BLOCK", 2);
        BLOCK = eRoutingSettingsType3;
        ERoutingSettingsType[] eRoutingSettingsTypeArr = {eRoutingSettingsType, eRoutingSettingsType2, eRoutingSettingsType3};
        $VALUES = eRoutingSettingsTypeArr;
        $ENTRIES = new n22(eRoutingSettingsTypeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l22 a() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ERoutingSettingsType valueOf(String str) {
        return (ERoutingSettingsType) Enum.valueOf(ERoutingSettingsType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ERoutingSettingsType[] values() {
        return (ERoutingSettingsType[]) $VALUES.clone();
    }
}

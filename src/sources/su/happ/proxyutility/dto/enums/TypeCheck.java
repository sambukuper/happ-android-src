package su.happ.proxyutility.dto.enums;

import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/dto/enums/TypeCheck;", "", "FILE", "DNSTT", "REST", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class TypeCheck {
    private static final /* synthetic */ l22 $ENTRIES;
    private static final /* synthetic */ TypeCheck[] $VALUES;
    public static final TypeCheck DNSTT;
    public static final TypeCheck FILE;
    public static final TypeCheck REST;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        TypeCheck typeCheck = new TypeCheck("FILE", 0);
        FILE = typeCheck;
        TypeCheck typeCheck2 = new TypeCheck("DNSTT", 1);
        DNSTT = typeCheck2;
        TypeCheck typeCheck3 = new TypeCheck("REST", 2);
        REST = typeCheck3;
        TypeCheck[] typeCheckArr = {typeCheck, typeCheck2, typeCheck3};
        $VALUES = typeCheckArr;
        $ENTRIES = new n22(typeCheckArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeCheck valueOf(String str) {
        return (TypeCheck) Enum.valueOf(TypeCheck.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeCheck[] values() {
        return (TypeCheck[]) $VALUES.clone();
    }
}

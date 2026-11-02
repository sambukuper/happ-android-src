package su.happ.proxyutility.dto;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class AdditionalInfoCodeKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(int i, String str) {
        str.getClass();
        if (i == 100) {
            return "100 - Your device time is out of sync with the server by more than 24 hours.";
        }
        if (i == 106) {
            return "106 - The tariff is limited.";
        }
        if (i == 112) {
            return pc6.p("112 - Domain hash not found current hash: ", str, ".");
        }
        if (i == 121) {
            return "121 - Limited Link: Error install code.";
        }
        if (i == 122) {
            return pc6.p("122 - Domain hash not found current hash: ", str, ".");
        }
        if (i == 124) {
            return "124 - Limited Link: Install code not found.";
        }
        if (i == 125) {
            return "125 - Limited Link: The installation limit has been reached.";
        }
        return i + ".";
    }
}

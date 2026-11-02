package su.happ.proxyutility.util;

import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsu/happ/proxyutility/util/ErrorCodeJNIWrapper;", "", "", "errorCode", "", "jniGetErrorMessageFromCode", "(I)Ljava/lang/String;", "errorString", "errorType", "", "jniGetErrorMessageFromString", "(Ljava/lang/String;I)[B", "jniGetErrorMessageFromString2", "(Ljava/lang/String;)[B", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ErrorCodeJNIWrapper {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ErrorCodeJNIWrapper() {
        System.loadLibrary("error-code");
    }

    private final native String jniGetErrorMessageFromCode(int errorCode);

    private final native byte[] jniGetErrorMessageFromString(String errorString, int errorType);

    private final native byte[] jniGetErrorMessageFromString2(String errorString);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(int i) {
        return jniGetErrorMessageFromCode(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(int i, String str) {
        str.getClass();
        return new String(jniGetErrorMessageFromString(str, i), iq0.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c(String str) {
        return new String(jniGetErrorMessageFromString2(str), iq0.a);
    }
}

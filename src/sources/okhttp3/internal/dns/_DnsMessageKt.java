package okhttp3.internal.dns;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"TYPE_A", _UrlKt.FRAGMENT_ENCODE_SET, "getTYPE_A$annotations", "()V", "TYPE_AAAA", "getTYPE_AAAA$annotations", "TYPE_HTTPS", "getTYPE_HTTPS$annotations", "CLASS_IN", "getCLASS_IN$annotations", "RESPONSE_CODE_SUCCESS", "RESPONSE_CODE_SERVER_FAILURE", "SERVICE_PARAMETER_MANDATORY", "SERVICE_PARAMETER_ALPN", "SERVICE_PARAMETER_NO_DEFAULT_ALPN", "SERVICE_PARAMETER_PORT", "SERVICE_PARAMETER_IPV4_HINT", "SERVICE_PARAMETER_ECH", "SERVICE_PARAMETER_IPV6_HINT", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _DnsMessageKt {
    public static final int CLASS_IN = 1;
    public static final int RESPONSE_CODE_SERVER_FAILURE = 2;
    public static final int RESPONSE_CODE_SUCCESS = 0;
    public static final int SERVICE_PARAMETER_ALPN = 1;
    public static final int SERVICE_PARAMETER_ECH = 5;
    public static final int SERVICE_PARAMETER_IPV4_HINT = 4;
    public static final int SERVICE_PARAMETER_IPV6_HINT = 6;
    public static final int SERVICE_PARAMETER_MANDATORY = 0;
    public static final int SERVICE_PARAMETER_NO_DEFAULT_ALPN = 2;
    public static final int SERVICE_PARAMETER_PORT = 3;
    public static final int TYPE_A = 1;
    public static final int TYPE_AAAA = 28;
    public static final int TYPE_HTTPS = 65;

    public static /* synthetic */ void getCLASS_IN$annotations() {
    }

    public static /* synthetic */ void getTYPE_A$annotations() {
    }

    public static /* synthetic */ void getTYPE_AAAA$annotations() {
    }

    public static /* synthetic */ void getTYPE_HTTPS$annotations() {
    }
}

package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 q23[], still in use, count: 1, list:
  (r0v19 q23[]) from 0x0117: CONSTRUCTOR (r0v19 q23[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:280) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class q23 {
    /* JADX INFO: Fake field, exist only in values array */
    BAD_REQUEST(400, "Bad Request"),
    /* JADX INFO: Fake field, exist only in values array */
    UNAUTHORIZED(401, "Unauthorized"),
    /* JADX INFO: Fake field, exist only in values array */
    FORBIDDEN(403, "Forbidden"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(404, "Not Found"),
    /* JADX INFO: Fake field, exist only in values array */
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_TIMEOUT(408, "Request Timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    CONFLICT(409, "Conflict"),
    /* JADX INFO: Fake field, exist only in values array */
    GONE(410, "Gone"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYLOAD_TO_LARGE(413, "Payload Too Large"),
    /* JADX INFO: Fake field, exist only in values array */
    URI_TOO_LARGE(414, "URI Too Long"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    FRONTING_ERROR(499, _UrlKt.FRAGMENT_ENCODE_SET),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IMPLEMENTED(501, "Not Implemented"),
    /* JADX INFO: Fake field, exist only in values array */
    BAD_GATEWAY(502, "Bad Gateway"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    GATEWAY_TIMEOUT(504, "Gateway Timeout");

    public static final k42 Z = new k42();
    public static final /* synthetic */ n22 h0;
    public final short X;
    public final String Y;

    static {
        h0 = new n22(new q23[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, new q23(500, "Internal Server Error"), new q23(501, "Not Implemented"), new q23(502, "Bad Gateway"), new q23(503, "Service Unavailable"), new q23(504, "Gateway Timeout")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q23(int i, String str) {
        super(str, i);
        this.X = i;
        this.Y = str;
    }

    public static q23 valueOf(String str) {
        return (q23) Enum.valueOf(q23.class, str);
    }

    public static q23[] values() {
        return (q23[]) g0.clone();
    }
}

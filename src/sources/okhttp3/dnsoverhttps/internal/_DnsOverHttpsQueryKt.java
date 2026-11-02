package okhttp3.dnsoverhttps.internal;

import defpackage.i90;
import defpackage.oc;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.dns.DnsMessage;
import okhttp3.internal.dns.DnsMessageReader;
import okhttp3.internal.dns.DnsMessageWriter;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"asQueryParameter", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/dns/DnsMessage;", "toRequestBody", "Lokhttp3/RequestBody;", "decodeResponse", "response", "Lokhttp3/Response;", "okhttp-dnsoverhttps"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _DnsOverHttpsQueryKt {
    public static final String asQueryParameter(DnsMessage dnsMessage) {
        dnsMessage.getClass();
        i90 i90Var = new i90();
        new DnsMessageWriter(i90Var).write(dnsMessage);
        return i90Var.s(i90Var.Y).b();
    }

    public static final DnsMessage decodeResponse(Response response) throws IOException {
        response.getClass();
        if (response.cacheResponse() == null && response.protocol() != Protocol.HTTP_2 && response.protocol() != Protocol.QUIC) {
            Platform.log$default(Platform.INSTANCE.get(), "Unexpected protocol: " + response.protocol(), 5, null, 4, null);
        }
        try {
            if (!response.getIsSuccessful()) {
                throw new IOException("response: " + response.code() + ' ' + response.message());
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody.getContentLength() <= 65536) {
                DnsMessage dnsMessage = new DnsMessageReader(responseBodyBody.getBodySource()).read();
                response.close();
                return dnsMessage;
            }
            throw new ProtocolException("response size exceeds limit (65536 bytes): " + responseBodyBody.getContentLength() + " bytes");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oc.h(response, th);
                throw th2;
            }
        }
    }

    public static final RequestBody toRequestBody(DnsMessage dnsMessage) {
        dnsMessage.getClass();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        i90 i90Var = new i90();
        new DnsMessageWriter(i90Var).write(dnsMessage);
        return companion.create(i90Var.s(i90Var.Y), DnsOverHttps.INSTANCE.getDNS_MESSAGE());
    }
}

package okhttp3.dnsoverhttps.internal;

import defpackage.dn2;
import defpackage.dn8;
import defpackage.oi0;
import java.io.IOException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsMessage;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery;", "Lokhttp3/internal/dns/DnsQuery;", "Lokhttp3/Call;", "call", "<init>", "(Lokhttp3/Call;)V", "Lokhttp3/internal/dns/DnsQuery$Callback;", "callback", "Ldn8;", "enqueue", "(Lokhttp3/internal/dns/DnsQuery$Callback;)V", "cancel", "()V", "Lokhttp3/Call;", "Factory", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DnsOverHttpsQuery implements DnsQuery {
    private final Call call;

    public DnsOverHttpsQuery(Call call) {
        call.getClass();
        this.call = call;
    }

    @Override // okhttp3.internal.dns.DnsQuery
    public void cancel() {
        this.call.cancel();
    }

    @Override // okhttp3.internal.dns.DnsQuery
    public void enqueue(final DnsQuery.Callback callback) {
        callback.getClass();
        this.call.enqueue(new Callback() { // from class: okhttp3.dnsoverhttps.internal.DnsOverHttpsQuery.enqueue.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                call.getClass();
                e.getClass();
                callback.onFailure(e);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                call.getClass();
                response.getClass();
                try {
                    callback.onResponse(_DnsOverHttpsQueryKt.decodeResponse(response));
                } catch (IOException e) {
                    callback.onFailure(e);
                }
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;", "Lokhttp3/internal/dns/DnsQuery$Factory;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "resolvePrivateAddresses", _UrlKt.FRAGMENT_ENCODE_SET, "resolvePublicAddresses", "client", "Lokhttp3/OkHttpClient;", "dnsUrl", "Lokhttp3/HttpUrl;", "post", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;ZZLokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Z)V", "newQuery", "Lokhttp3/internal/dns/DnsQuery;", "question", "Lokhttp3/internal/dns/Question;", "overrideQuery", "ResolveUnsupportedQuery", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements DnsQuery.Factory {
        private final OkHttpClient client;
        private final HttpUrl dnsUrl;
        private final boolean post;
        private final boolean resolvePrivateAddresses;
        private final boolean resolvePublicAddresses;
        private final TaskRunner taskRunner;

        public Factory(TaskRunner taskRunner, boolean z, boolean z2, OkHttpClient okHttpClient, HttpUrl httpUrl, boolean z3) {
            taskRunner.getClass();
            okHttpClient.getClass();
            httpUrl.getClass();
            this.taskRunner = taskRunner;
            this.resolvePrivateAddresses = z;
            this.resolvePublicAddresses = z2;
            this.client = okHttpClient;
            this.dnsUrl = httpUrl;
            this.post = z3;
        }

        private final DnsQuery overrideQuery(Question question) {
            String str;
            if (this.resolvePrivateAddresses && this.resolvePublicAddresses) {
                return null;
            }
            boolean zIsPrivateHost$okhttp_dnsoverhttps = DnsOverHttps.INSTANCE.isPrivateHost$okhttp_dnsoverhttps(question.getName());
            if (zIsPrivateHost$okhttp_dnsoverhttps && !this.resolvePrivateAddresses) {
                str = "private hosts not resolved";
            } else {
                if (zIsPrivateHost$okhttp_dnsoverhttps || this.resolvePublicAddresses) {
                    return null;
                }
                str = "public hosts not resolved";
            }
            return new ResolveUnsupportedQuery(this, question.getName(), str);
        }

        @Override // okhttp3.internal.dns.DnsQuery.Factory
        public DnsQuery newQuery(Question question) {
            question.getClass();
            DnsQuery dnsQueryOverrideQuery = overrideQuery(question);
            if (dnsQueryOverrideQuery != null) {
                return dnsQueryOverrideQuery;
            }
            DnsMessage dnsMessageQuery = DnsMessage.INSTANCE.query(question);
            OkHttpClient okHttpClient = this.client;
            Request.Builder builderHeader = new Request.Builder().header("Accept", DnsOverHttps.INSTANCE.getDNS_MESSAGE().toString());
            boolean z = this.post;
            HttpUrl httpUrl = this.dnsUrl;
            if (z) {
                builderHeader.url(httpUrl);
                builderHeader.cacheUrlOverride(this.dnsUrl.newBuilder().addQueryParameter("hostname", question.getName()).addQueryParameter("type", String.valueOf(question.getType())).build());
                builderHeader.post(_DnsOverHttpsQueryKt.toRequestBody(dnsMessageQuery));
            } else {
                builderHeader.url(httpUrl.newBuilder().addQueryParameter("dns", _DnsOverHttpsQueryKt.asQueryParameter(dnsMessageQuery)).build());
            }
            return new DnsOverHttpsQuery(okHttpClient.newCall(builderHeader.build()));
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;", "Lokhttp3/internal/dns/DnsQuery;", _UrlKt.FRAGMENT_ENCODE_SET, "hostname", "message", "<init>", "(Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/internal/dns/DnsQuery$Callback;", "callback", "Ldn8;", "enqueue", "(Lokhttp3/internal/dns/DnsQuery$Callback;)V", "cancel", "()V", "Ljava/lang/String;", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class ResolveUnsupportedQuery implements DnsQuery {
            private final String hostname;
            private final String message;
            final /* synthetic */ Factory this$0;

            public ResolveUnsupportedQuery(Factory factory, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.this$0 = factory;
                this.hostname = str;
                this.message = str2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final dn8 enqueue$lambda$0(DnsQuery.Callback callback, ResolveUnsupportedQuery resolveUnsupportedQuery) {
                callback.onFailure(new UnknownHostException(resolveUnsupportedQuery.message));
                return dn8.a;
            }

            @Override // okhttp3.internal.dns.DnsQuery
            public void enqueue(final DnsQuery.Callback callback) {
                callback.getClass();
                TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), oi0.p(new StringBuilder(), this.hostname, " dns"), 0L, false, new dn2() { // from class: okhttp3.dnsoverhttps.internal.a
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        return DnsOverHttpsQuery.Factory.ResolveUnsupportedQuery.enqueue$lambda$0(callback, this);
                    }
                }, 6, null);
            }

            @Override // okhttp3.internal.dns.DnsQuery
            public void cancel() {
            }
        }
    }
}

package okhttp3.android;

import android.net.DnsResolver;
import android.net.DnsResolver$Callback;
import android.net.Network;
import android.os.Build;
import android.os.CancellationSignal;
import android.security.NetworkSecurityPolicy;
import defpackage.dn2;
import defpackage.dn8;
import defpackage.g44;
import defpackage.ge1;
import defpackage.i21;
import defpackage.i90;
import defpackage.nd;
import defpackage.o61;
import defpackage.vz7;
import defpackage.x;
import defpackage.xv0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.DnsCache;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsMessage;
import okhttp3.internal.dns.DnsMessageReader;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import okhttp3.internal.dns.ResourceRecord;
import okhttp3.internal.dns.StateMachineDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00019BI\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012B3\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u001b\u00105\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lokhttp3/android/AndroidDns;", "Lokhttp3/Dns;", "Landroid/net/DnsResolver;", "dnsResolver", "Landroid/net/Network;", "network", "Lokhttp3/DnsCache;", "dnsCache", _UrlKt.FRAGMENT_ENCODE_SET, "includeServiceMetadata", "Ljava/util/concurrent/Executor;", "executor", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lg44;", "Landroid/security/NetworkSecurityPolicy;", "lazyNetworkSecurityPolicy", "<init>", "(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;ZLjava/util/concurrent/Executor;Lokhttp3/internal/concurrent/TaskRunner;Lg44;)V", "(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;Z)V", "Lokhttp3/Dns$Request;", "request", "Lokhttp3/internal/dns/StateMachineDnsCall;", "call", "(Lokhttp3/Dns$Request;Z)Lokhttp3/internal/dns/StateMachineDnsCall;", "includeServiceMetadataForRequest", "(Lokhttp3/Dns$Request;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/Dns$Call;", "newCall", "(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;", "Landroid/net/DnsResolver;", "getDnsResolver$okhttp", "()Landroid/net/DnsResolver;", "Landroid/net/Network;", "getNetwork$okhttp", "()Landroid/net/Network;", "Z", "getIncludeServiceMetadata$okhttp", "()Z", "Ljava/util/concurrent/Executor;", "getExecutor$okhttp", "()Ljava/util/concurrent/Executor;", "Lokhttp3/internal/concurrent/TaskRunner;", "networkSecurityPolicy$delegate", "Lg44;", "getNetworkSecurityPolicy", "()Landroid/security/NetworkSecurityPolicy;", "networkSecurityPolicy", "Lokhttp3/internal/dns/DnsQuery$Factory;", "queryFactory", "Lokhttp3/internal/dns/DnsQuery$Factory;", "AndroidQuery", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidDns implements Dns {
    private final DnsResolver dnsResolver;
    private final Executor executor;
    private final boolean includeServiceMetadata;
    private final Network network;

    /* JADX INFO: renamed from: networkSecurityPolicy$delegate, reason: from kotlin metadata */
    private final g44 networkSecurityPolicy;
    private final DnsQuery.Factory queryFactory;
    private final TaskRunner taskRunner;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/android/AndroidDns$AndroidQuery;", "Lokhttp3/internal/dns/DnsQuery;", "Lokhttp3/internal/dns/Question;", "question", "<init>", "(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)V", "Lokhttp3/internal/dns/DnsQuery$Callback;", "callback", "Ldn8;", "resolveAddresses", "(Lokhttp3/internal/dns/DnsQuery$Callback;)V", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "addresses", "Lokhttp3/internal/dns/DnsMessage;", "response", "([Ljava/net/InetAddress;)Lokhttp3/internal/dns/DnsMessage;", "queryServiceMetadata", "enqueue", "cancel", "()V", "Lokhttp3/internal/dns/Question;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/CancellationSignal;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AndroidQuery implements DnsQuery {
        private final CancellationSignal cancellationSignal;
        private final Question question;
        final /* synthetic */ AndroidDns this$0;

        public AndroidQuery(AndroidDns androidDns, Question question) {
            question.getClass();
            this.this$0 = androidDns;
            this.question = question;
            this.cancellationSignal = question.getType() == 65 ? new CancellationSignal() : null;
        }

        private final void queryServiceMetadata(final DnsQuery.Callback callback) {
            try {
                this.this$0.getDnsResolver().rawQuery(this.this$0.getNetwork(), this.question.getName(), 1, 65, 0, this.this$0.getExecutor(), this.cancellationSignal, new DnsResolver$Callback() { // from class: okhttp3.android.AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1
                    public void onAnswer(byte[] answer, int rcode) {
                        answer.getClass();
                        try {
                            i90 i90Var = new i90();
                            i90Var.write(answer, 0, answer.length);
                            callback.onResponse(new DnsMessageReader(i90Var).read());
                        } catch (IOException e) {
                            callback.onFailure(e);
                        }
                    }

                    public void onError(DnsResolver.DnsException e) {
                        e.getClass();
                        callback.onFailure(new IOException("HTTPS query failed with code " + e.code, e));
                    }
                });
            } catch (SecurityException e) {
                TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), this.question.getName() + " dns", 0L, false, new dn2() { // from class: okhttp3.android.b
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        return AndroidDns.AndroidQuery.queryServiceMetadata$lambda$0(callback, e);
                    }
                }, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dn8 queryServiceMetadata$lambda$0(DnsQuery.Callback callback, SecurityException securityException) {
            callback.onFailure(new IOException(securityException));
            return dn8.a;
        }

        private final void resolveAddresses(final DnsQuery.Callback callback) {
            TaskQueue taskQueueNewQueue = this.this$0.taskRunner.newQueue();
            String str = this.question.getName() + " dns";
            final AndroidDns androidDns = this.this$0;
            TaskQueue.execute$default(taskQueueNewQueue, str, 0L, false, new dn2() { // from class: okhttp3.android.a
                @Override // defpackage.dn2
                public final Object invoke() {
                    return AndroidDns.AndroidQuery.resolveAddresses$lambda$0(androidDns, this, callback);
                }
            }, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dn8 resolveAddresses$lambda$0(AndroidDns androidDns, AndroidQuery androidQuery, DnsQuery.Callback callback) {
            InetAddress[] allByName;
            try {
                Network network = androidDns.getNetwork();
                if (network == null || (allByName = network.getAllByName(androidQuery.question.getName())) == null) {
                    allByName = InetAddress.getAllByName(androidQuery.question.getName());
                }
                allByName.getClass();
                callback.onResponse(androidQuery.response(allByName));
            } catch (UnknownHostException e) {
                callback.onFailure(e);
            }
            return dn8.a;
        }

        private final DnsMessage response(InetAddress[] addresses) {
            DnsMessage.Companion companion = DnsMessage.INSTANCE;
            List listK = i21.K(this.question);
            ArrayList arrayList = new ArrayList(addresses.length);
            for (InetAddress inetAddress : addresses) {
                arrayList.add(new ResourceRecord.IpAddress(this.question.getName(), 0, inetAddress));
            }
            return DnsMessage.Companion.response$default(companion, (short) 0, listK, arrayList, 1, null);
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void cancel() {
            CancellationSignal cancellationSignal = this.cancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void enqueue(DnsQuery.Callback callback) {
            callback.getClass();
            int type = this.question.getType();
            if (type == 1) {
                resolveAddresses(callback);
            } else {
                if (type == 65) {
                    queryServiceMetadata(callback);
                    return;
                }
                throw new IllegalStateException(("unexpected query type " + this.question.getType()).toString());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AndroidDns(DnsResolver dnsResolver, Network network, DnsCache dnsCache, boolean z, int i, ge1 ge1Var) {
        DnsResolver dnsResolver2;
        if ((i & 1) != 0) {
            dnsResolver2 = DnsResolver.getInstance();
            dnsResolver2.getClass();
        } else {
            dnsResolver2 = dnsResolver;
        }
        this(dnsResolver2, (i & 2) != 0 ? null : network, (i & 4) != 0 ? new DnsCache(0L, 0L, 0L, 0L, 0, 31, null) : dnsCache, (i & 8) != 0 ? true : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkSecurityPolicy _init_$lambda$1() {
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        networkSecurityPolicy.getClass();
        return networkSecurityPolicy;
    }

    private final StateMachineDnsCall call(Dns.Request request, boolean includeServiceMetadata) {
        return new StateMachineDnsCall(this.taskRunner, request, this.queryFactory, false, includeServiceMetadata && includeServiceMetadataForRequest(request));
    }

    private final NetworkSecurityPolicy getNetworkSecurityPolicy() {
        return (NetworkSecurityPolicy) this.networkSecurityPolicy.getValue();
    }

    private final boolean includeServiceMetadataForRequest(Dns.Request request) {
        if (Build.VERSION.SDK_INT < 37) {
            return false;
        }
        int domainEncryptionMode = getNetworkSecurityPolicy().getDomainEncryptionMode(request.getHostname());
        return domainEncryptionMode == 2 || domainEncryptionMode == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DnsQuery queryFactory$lambda$0(AndroidDns androidDns, Question question) {
        question.getClass();
        return new AndroidQuery(androidDns, question);
    }

    /* JADX INFO: renamed from: getDnsResolver$okhttp, reason: from getter */
    public final DnsResolver getDnsResolver() {
        return this.dnsResolver;
    }

    /* JADX INFO: renamed from: getExecutor$okhttp, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: getIncludeServiceMetadata$okhttp, reason: from getter */
    public final boolean getIncludeServiceMetadata() {
        return this.includeServiceMetadata;
    }

    /* JADX INFO: renamed from: getNetwork$okhttp, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        hostname.getClass();
        List<Dns.Record> listExecute = _ExecuteDnsKt.execute(call(new Dns.Request(hostname, 0, 2, null), false));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listExecute) {
            if (obj instanceof Dns.Record.IpAddress) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Dns.Record.IpAddress) it.next()).getAddress());
        }
        return arrayList2;
    }

    @Override // okhttp3.Dns
    public Dns.Call newCall(Dns.Request request) {
        request.getClass();
        return call(request, this.includeServiceMetadata);
    }

    public AndroidDns(DnsResolver dnsResolver, Network network, DnsCache dnsCache, boolean z, Executor executor, TaskRunner taskRunner, g44 g44Var) {
        dnsResolver.getClass();
        dnsCache.getClass();
        executor.getClass();
        taskRunner.getClass();
        g44Var.getClass();
        this.dnsResolver = dnsResolver;
        this.network = network;
        this.includeServiceMetadata = z;
        this.executor = executor;
        this.taskRunner = taskRunner;
        this.networkSecurityPolicy = g44Var;
        this.queryFactory = dnsCache.-delegate.wrap(new o61(this, (byte) 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidDns(DnsResolver dnsResolver, Network network, DnsCache dnsCache, boolean z) {
        this(dnsResolver, network, dnsCache, z, new nd((byte) 0), TaskRunner.INSTANCE, new vz7(new x((byte) 13)));
        dnsResolver.getClass();
        dnsCache.getClass();
    }
}

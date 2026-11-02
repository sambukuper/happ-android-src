package okhttp3.internal.dns;

import defpackage.b61;
import defpackage.be;
import defpackage.bt;
import defpackage.d02;
import defpackage.dh3;
import defpackage.dn2;
import defpackage.dn8;
import defpackage.dw4;
import defpackage.ge1;
import defpackage.gx1;
import defpackage.i21;
import defpackage.jn0;
import defpackage.ka8;
import defpackage.la8;
import defpackage.lx1;
import defpackage.p61;
import defpackage.qx0;
import defpackage.vj8;
import defpackage.wv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001\u001d\b\u0007\u0018\u00002\u00020\u0001:\u000501234B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010-\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0014\u0010/\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010&¨\u00065"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lla8;", "timeSource", "Lgx1;", "minimumTimeToLive", "maximumTimeToLive", "failureTimeToLive", "revalidateBeforeExpire", _UrlKt.FRAGMENT_ENCODE_SET, "maxEntryCount", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJILge1;)V", "Ldn8;", "evictAll", "()V", "Lokhttp3/internal/dns/DnsQuery$Factory;", "delegate", "wrap", "(Lokhttp3/internal/dns/DnsQuery$Factory;)Lokhttp3/internal/dns/DnsQuery$Factory;", "Lokhttp3/internal/concurrent/TaskRunner;", "J", "getMinimumTimeToLive-UwyO8pc$okhttp", "()J", "getMaximumTimeToLive-UwyO8pc$okhttp", "getFailureTimeToLive-UwyO8pc$okhttp", "getRevalidateBeforeExpire-UwyO8pc$okhttp", "okhttp3/internal/dns/RealDnsCache$cache$1", "cache", "Lokhttp3/internal/dns/RealDnsCache$cache$1;", "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicNetworkCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicHitCount", "atomicRequestCount", "getSize$okhttp", "()I", "size", "getMaxSize$okhttp", "maxSize", "getNetworkCount$okhttp", "networkCount", "getHitCount$okhttp", "hitCount", "getRequestCount$okhttp", "requestCount", "CacheQuery", "Entry", "State", "InFlightCall", "Result", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealDnsCache {
    private final AtomicInteger atomicHitCount;
    private final AtomicInteger atomicNetworkCount;
    private final AtomicInteger atomicRequestCount;
    private final RealDnsCache$cache$1 cache;
    private final long failureTimeToLive;
    private final long maximumTimeToLive;
    private final long minimumTimeToLive;
    private final long revalidateBeforeExpire;
    private final TaskRunner taskRunner;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$CacheQuery;", "Lokhttp3/internal/dns/DnsQuery;", "Lokhttp3/internal/dns/DnsQuery$Callback;", "Lokhttp3/internal/dns/Question;", "question", "Lokhttp3/internal/dns/DnsQuery$Factory;", "delegate", "Lokhttp3/internal/dns/RealDnsCache$Entry;", "entry", "<init>", "(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/RealDnsCache$Entry;)V", "callback", "Ldn8;", "enqueue", "(Lokhttp3/internal/dns/DnsQuery$Callback;)V", "cancel", "()V", "Lokhttp3/internal/dns/DnsMessage;", "dnsResponse", "onResponse", "(Lokhttp3/internal/dns/DnsMessage;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lokhttp3/internal/dns/Question;", "getQuestion", "()Lokhttp3/internal/dns/Question;", "Lokhttp3/internal/dns/DnsQuery$Factory;", "getDelegate", "()Lokhttp3/internal/dns/DnsQuery$Factory;", "Lokhttp3/internal/dns/RealDnsCache$Entry;", "getEntry", "()Lokhttp3/internal/dns/RealDnsCache$Entry;", "Lokhttp3/internal/dns/DnsQuery$Callback;", "getCallback", "()Lokhttp3/internal/dns/DnsQuery$Callback;", "setCallback", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class CacheQuery implements DnsQuery, DnsQuery.Callback {
        private DnsQuery.Callback callback;
        private final DnsQuery.Factory delegate;
        private final Entry entry;
        private final Question question;
        final /* synthetic */ RealDnsCache this$0;

        public CacheQuery(RealDnsCache realDnsCache, Question question, DnsQuery.Factory factory, Entry entry) {
            question.getClass();
            factory.getClass();
            entry.getClass();
            this.this$0 = realDnsCache;
            this.question = question;
            this.delegate = factory;
            this.entry = entry;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dn8 cancel$lambda$0(CacheQuery cacheQuery) {
            DnsQuery.Callback callback = cacheQuery.callback;
            callback.getClass();
            callback.onFailure(new IOException("canceled"));
            return dn8.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dn8 enqueue$lambda$1(Result result, DnsQuery.Callback callback) {
            if (result instanceof Result.Success) {
                callback.onResponse(((Result.Success) result).getMessage());
            } else {
                if (!(result instanceof Result.Failure)) {
                    b61.c();
                    return null;
                }
                callback.onFailure(((Result.Failure) result).getException());
            }
            return dn8.a;
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void cancel() {
            while (true) {
                State state = this.entry.getState().get();
                InFlightCall inFlightCall = state.getInFlightCall();
                if (inFlightCall == null) {
                    return;
                }
                ArrayList arrayListD0 = wv0.D0(inFlightCall.getQueries(), this);
                if (arrayListD0.size() == inFlightCall.getQueries().size()) {
                    return;
                }
                State stateCopy$default = State.copy$default(state, null, InFlightCall.copy$default(inFlightCall, null, null, arrayListD0, 3, null), null, 5, null);
                AtomicReference<State> state2 = this.entry.getState();
                do {
                    if (state2.compareAndSet(state, stateCopy$default)) {
                        TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), this.question.getName() + " dns", 0L, false, new dn2() { // from class: okhttp3.internal.dns.c
                            @Override // defpackage.dn2
                            public final Object invoke() {
                                return RealDnsCache.CacheQuery.cancel$lambda$0(this.X);
                            }
                        }, 6, null);
                        return;
                    }
                } while (state2.get() == state);
            }
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void enqueue(final DnsQuery.Callback callback) {
            final Result result;
            boolean z;
            InFlightCall inFlightCall;
            State stateCopy$default;
            callback.getClass();
            if (this.callback != null) {
                bt.i("already enqueued");
                return;
            }
            this.callback = callback;
            ka8 ka8VarF0 = getTimeSource().F0();
            loop0: while (true) {
                State state = this.entry.getState().get();
                result = state.getResult();
                InFlightCall inFlightCall2 = state.getInFlightCall();
                z = result != null && ka8VarF0.compareTo(result.getExpireAt()) < 0;
                if (inFlightCall2 != null && z) {
                    inFlightCall = inFlightCall2;
                } else if (inFlightCall2 != null) {
                    inFlightCall = inFlightCall2;
                    inFlightCall2 = InFlightCall.copy$default(inFlightCall2, null, null, wv0.I0(inFlightCall2.getQueries(), this), 3, null);
                } else {
                    inFlightCall = inFlightCall2;
                    if (result == null || ka8VarF0.compareTo(result.getRevalidateAt()) >= 0) {
                        inFlightCall2 = new InFlightCall(this.delegate.newQuery(this.question), ka8VarF0, z ? d02.X : i21.K(this));
                    } else {
                        inFlightCall2 = null;
                    }
                }
                stateCopy$default = State.copy$default(state, ka8VarF0, inFlightCall2, null, 4, null);
                AtomicReference<State> state2 = this.entry.getState();
                do {
                    if (state2.compareAndSet(state, stateCopy$default)) {
                        break loop0;
                    }
                } while (state2.get() == state);
            }
            this.this$0.atomicRequestCount.incrementAndGet();
            if (inFlightCall == null && stateCopy$default.getInFlightCall() != null) {
                this.this$0.atomicNetworkCount.incrementAndGet();
                stateCopy$default.getInFlightCall().getQuery().enqueue(this);
            }
            if (z) {
                this.this$0.atomicHitCount.incrementAndGet();
                TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), this.question.getName() + " dns", 0L, false, new dn2() { // from class: okhttp3.internal.dns.b
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        return RealDnsCache.CacheQuery.enqueue$lambda$1(result, callback);
                    }
                }, 6, null);
            }
        }

        public final DnsQuery.Callback getCallback() {
            return this.callback;
        }

        public final DnsQuery.Factory getDelegate() {
            return this.delegate;
        }

        public final Entry getEntry() {
            return this.entry;
        }

        public final Question getQuestion() {
            return this.question;
        }

        @Override // okhttp3.internal.dns.DnsQuery.Callback
        public void onFailure(IOException e) {
            State state;
            e.getClass();
            loop0: while (true) {
                state = this.entry.getState().get();
                InFlightCall inFlightCall = state.getInFlightCall();
                inFlightCall.getClass();
                qx0 sentAt = inFlightCall.getSentAt();
                gx1 gx1Var = new gx1(gx1.i(this.this$0.getFailureTimeToLive(), gx1.k(this.this$0.getRevalidateBeforeExpire())));
                gx1 gx1Var2 = new gx1(vj8.l0(0, lx1.SECONDS));
                if (gx1Var.compareTo(gx1Var2) < 0) {
                    gx1Var = gx1Var2;
                }
                ka8 ka8Var = (ka8) sentAt;
                State stateCopy$default = State.copy$default(state, null, null, new Result.Failure(ka8Var.d(gx1Var.X), ka8Var.d(this.this$0.getFailureTimeToLive()), e), 1, null);
                AtomicReference<State> state2 = this.entry.getState();
                do {
                    if (state2.compareAndSet(state, stateCopy$default)) {
                        break loop0;
                    }
                } while (state2.get() == state);
            }
            Iterator<CacheQuery> it = state.getInFlightCall().getQueries().iterator();
            while (it.hasNext()) {
                DnsQuery.Callback callback = it.next().callback;
                callback.getClass();
                callback.onFailure(e);
            }
        }

        @Override // okhttp3.internal.dns.DnsQuery.Callback
        public void onResponse(DnsMessage dnsResponse) {
            long failureTimeToLive;
            dnsResponse.getClass();
            while (true) {
                State state = this.entry.getState().get();
                InFlightCall inFlightCall = state.getInFlightCall();
                inFlightCall.getClass();
                qx0 sentAt = inFlightCall.getSentAt();
                boolean zIsEmpty = dnsResponse.getAnswers().isEmpty();
                lx1 lx1Var = lx1.SECONDS;
                if (zIsEmpty) {
                    failureTimeToLive = this.this$0.getFailureTimeToLive();
                } else {
                    be beVar = gx1.Y;
                    Iterator<T> it = dnsResponse.getAnswers().iterator();
                    if (!it.hasNext()) {
                        bt.n();
                        return;
                    }
                    int timeToLive = ((ResourceRecord) it.next()).getTimeToLive();
                    while (it.hasNext()) {
                        int timeToLive2 = ((ResourceRecord) it.next()).getTimeToLive();
                        if (timeToLive > timeToLive2) {
                            timeToLive = timeToLive2;
                        }
                    }
                    gx1 gx1Var = new gx1(vj8.l0(timeToLive, lx1Var));
                    gx1 gx1Var2 = new gx1(this.this$0.getMinimumTimeToLive());
                    gx1 gx1Var3 = new gx1(this.this$0.getMaximumTimeToLive());
                    if (gx1Var2.compareTo(gx1Var3) > 0) {
                        bt.k("Cannot coerce value to an empty range: maximum ", gx1Var3, " is less than minimum ", gx1Var2, 46);
                        return;
                    }
                    if (gx1Var.compareTo(gx1Var2) < 0) {
                        gx1Var = gx1Var2;
                    } else if (gx1Var.compareTo(gx1Var3) > 0) {
                        gx1Var = gx1Var3;
                    }
                    failureTimeToLive = gx1Var.X;
                }
                gx1 gx1Var4 = new gx1(gx1.i(failureTimeToLive, gx1.k(this.this$0.getRevalidateBeforeExpire())));
                gx1 gx1Var5 = new gx1(vj8.l0(0, lx1Var));
                if (gx1Var4.compareTo(gx1Var5) < 0) {
                    gx1Var4 = gx1Var5;
                }
                ka8 ka8Var = (ka8) sentAt;
                State stateCopy$default = State.copy$default(state, null, null, new Result.Success(ka8Var.d(gx1Var4.X), ka8Var.d(failureTimeToLive), dnsResponse), 1, null);
                AtomicReference<State> state2 = this.entry.getState();
                do {
                    if (state2.compareAndSet(state, stateCopy$default)) {
                        Iterator<CacheQuery> it2 = state.getInFlightCall().getQueries().iterator();
                        while (it2.hasNext()) {
                            DnsQuery.Callback callback = it2.next().callback;
                            callback.getClass();
                            callback.onResponse(dnsResponse);
                        }
                        return;
                    }
                } while (state2.get() == state);
            }
        }

        public final void setCallback(DnsQuery.Callback callback) {
            this.callback = callback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Entry;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/dns/RealDnsCache$State;", "kotlin.jvm.PlatformType", "getState", "()Ljava/util/concurrent/atomic/AtomicReference;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Entry {
        private final AtomicReference<State> state = new AtomicReference<>(new State(null, null, null, 7, null));

        public final AtomicReference<State> getState() {
            return this.state;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR!\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$InFlightCall;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/dns/DnsQuery;", "query", "Lqx0;", "sentAt", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;", "Lokhttp3/internal/dns/RealDnsCache;", "queries", "<init>", "(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)V", "component1", "()Lokhttp3/internal/dns/DnsQuery;", "component2", "()Lqx0;", "component3", "()Ljava/util/List;", "copy", "(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/internal/dns/DnsQuery;", "getQuery", "Lqx0;", "getSentAt", "Ljava/util/List;", "getQueries", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InFlightCall {
        private final List<CacheQuery> queries;
        private final DnsQuery query;
        private final qx0 sentAt;

        public InFlightCall(DnsQuery dnsQuery, qx0 qx0Var, List<CacheQuery> list) {
            dnsQuery.getClass();
            qx0Var.getClass();
            list.getClass();
            this.query = dnsQuery;
            this.sentAt = qx0Var;
            this.queries = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InFlightCall copy$default(InFlightCall inFlightCall, DnsQuery dnsQuery, qx0 qx0Var, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                dnsQuery = inFlightCall.query;
            }
            if ((i & 2) != 0) {
                qx0Var = inFlightCall.sentAt;
            }
            if ((i & 4) != 0) {
                list = inFlightCall.queries;
            }
            return inFlightCall.copy(dnsQuery, qx0Var, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DnsQuery getQuery() {
            return this.query;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final qx0 getSentAt() {
            return this.sentAt;
        }

        public final List<CacheQuery> component3() {
            return this.queries;
        }

        public final InFlightCall copy(DnsQuery query, qx0 sentAt, List<CacheQuery> queries) {
            query.getClass();
            sentAt.getClass();
            queries.getClass();
            return new InFlightCall(query, sentAt, queries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InFlightCall)) {
                return false;
            }
            InFlightCall inFlightCall = (InFlightCall) other;
            return dh3.f(this.query, inFlightCall.query) && dh3.f(this.sentAt, inFlightCall.sentAt) && dh3.f(this.queries, inFlightCall.queries);
        }

        public final List<CacheQuery> getQueries() {
            return this.queries;
        }

        public final DnsQuery getQuery() {
            return this.query;
        }

        public final qx0 getSentAt() {
            return this.sentAt;
        }

        public int hashCode() {
            return this.queries.hashCode() + p61.g(this.query.hashCode() * 31, ((ka8) this.sentAt).X, 31);
        }

        public String toString() {
            return "InFlightCall(query=" + this.query + ", sentAt=" + this.sentAt + ", queries=" + this.queries + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Result;", _UrlKt.FRAGMENT_ENCODE_SET, "Lqx0;", "getRevalidateAt", "()Lqx0;", "revalidateAt", "getExpireAt", "expireAt", "Failure", "Success", "Lokhttp3/internal/dns/RealDnsCache$Result$Failure;", "Lokhttp3/internal/dns/RealDnsCache$Result$Success;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Result$Failure;", "Lokhttp3/internal/dns/RealDnsCache$Result;", "Lqx0;", "revalidateAt", "expireAt", "Ljava/io/IOException;", "exception", "<init>", "(Lqx0;Lqx0;Ljava/io/IOException;)V", "Lqx0;", "getRevalidateAt", "()Lqx0;", "getExpireAt", "Ljava/io/IOException;", "getException", "()Ljava/io/IOException;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failure implements Result {
            private final IOException exception;
            private final qx0 expireAt;
            private final qx0 revalidateAt;

            public Failure(qx0 qx0Var, qx0 qx0Var2, IOException iOException) {
                qx0Var.getClass();
                qx0Var2.getClass();
                iOException.getClass();
                this.revalidateAt = qx0Var;
                this.expireAt = qx0Var2;
                this.exception = iOException;
            }

            public final IOException getException() {
                return this.exception;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public qx0 getExpireAt() {
                return this.expireAt;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public qx0 getRevalidateAt() {
                return this.revalidateAt;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Result$Success;", "Lokhttp3/internal/dns/RealDnsCache$Result;", "Lqx0;", "revalidateAt", "expireAt", "Lokhttp3/internal/dns/DnsMessage;", "message", "<init>", "(Lqx0;Lqx0;Lokhttp3/internal/dns/DnsMessage;)V", "Lqx0;", "getRevalidateAt", "()Lqx0;", "getExpireAt", "Lokhttp3/internal/dns/DnsMessage;", "getMessage", "()Lokhttp3/internal/dns/DnsMessage;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Success implements Result {
            private final qx0 expireAt;
            private final DnsMessage message;
            private final qx0 revalidateAt;

            public Success(qx0 qx0Var, qx0 qx0Var2, DnsMessage dnsMessage) {
                qx0Var.getClass();
                qx0Var2.getClass();
                dnsMessage.getClass();
                this.revalidateAt = qx0Var;
                this.expireAt = qx0Var2;
                this.message = dnsMessage;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public qx0 getExpireAt() {
                return this.expireAt;
            }

            public final DnsMessage getMessage() {
                return this.message;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public qx0 getRevalidateAt() {
                return this.revalidateAt;
            }
        }

        qx0 getExpireAt();

        qx0 getRevalidateAt();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [okhttp3.internal.dns.RealDnsCache$cache$1] */
    private RealDnsCache(TaskRunner taskRunner, final la8 la8Var, long j, long j2, long j3, long j4, final int i) {
        taskRunner.getClass();
        la8Var.getClass();
        this.taskRunner = taskRunner;
        this.minimumTimeToLive = j;
        this.maximumTimeToLive = j2;
        this.failureTimeToLive = j3;
        this.revalidateBeforeExpire = j4;
        this.cache = new MemoryCache<Question, Entry>(la8Var, i) { // from class: okhttp3.internal.dns.RealDnsCache$cache$1
            @Override // okhttp3.internal.dns.MemoryCache
            public qx0 lastRequestedAt(qx0 now, RealDnsCache.Entry value) {
                RealDnsCache.Result result;
                qx0 expireAt;
                now.getClass();
                value.getClass();
                RealDnsCache.State state = value.getState().get();
                if (state.getInFlightCall() == null && ((result = state.getResult()) == null || (expireAt = result.getExpireAt()) == null || ((ka8) expireAt).compareTo(now) <= 0)) {
                    return null;
                }
                return state.getLastRequestedAt();
            }
        };
        this.atomicNetworkCount = new AtomicInteger();
        this.atomicHitCount = new AtomicInteger();
        this.atomicRequestCount = new AtomicInteger();
        be beVar = gx1.Y;
        lx1 lx1Var = lx1.SECONDS;
        if (gx1.c(j3, vj8.l0(0, lx1Var)) < 0) {
            bt.q("Failed requirement.");
            throw null;
        }
        if (gx1.c(j, vj8.l0(0, lx1Var)) < 0) {
            bt.q("Failed requirement.");
            throw null;
        }
        if (gx1.c(j2, j) < 0) {
            bt.q("Failed requirement.");
            throw null;
        }
        if (gx1.c(j4, vj8.l0(0, lx1Var)) >= 0) {
            return;
        }
        bt.q("Failed requirement.");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DnsQuery wrap$lambda$0(RealDnsCache realDnsCache, DnsQuery.Factory factory, Question question) {
        question.getClass();
        return new CacheQuery(realDnsCache, question, factory, realDnsCache.cache.computeIfAbsent(question, new dw4((byte) 29)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Entry wrap$lambda$0$0() {
        return new Entry();
    }

    public final void evictAll() {
        evictAll();
    }

    /* JADX INFO: renamed from: getFailureTimeToLive-UwyO8pc$okhttp, reason: not valid java name and from getter */
    public final long getFailureTimeToLive() {
        return this.failureTimeToLive;
    }

    public final int getHitCount$okhttp() {
        return this.atomicHitCount.get();
    }

    public final int getMaxSize$okhttp() {
        return getMaxSize();
    }

    /* JADX INFO: renamed from: getMaximumTimeToLive-UwyO8pc$okhttp, reason: not valid java name and from getter */
    public final long getMaximumTimeToLive() {
        return this.maximumTimeToLive;
    }

    /* JADX INFO: renamed from: getMinimumTimeToLive-UwyO8pc$okhttp, reason: not valid java name and from getter */
    public final long getMinimumTimeToLive() {
        return this.minimumTimeToLive;
    }

    public final int getNetworkCount$okhttp() {
        return this.atomicNetworkCount.get();
    }

    public final int getRequestCount$okhttp() {
        return this.atomicRequestCount.get();
    }

    /* JADX INFO: renamed from: getRevalidateBeforeExpire-UwyO8pc$okhttp, reason: not valid java name and from getter */
    public final long getRevalidateBeforeExpire() {
        return this.revalidateBeforeExpire;
    }

    public final int getSize$okhttp() {
        return getSize();
    }

    public final DnsQuery.Factory wrap(DnsQuery.Factory delegate) {
        delegate.getClass();
        return new jn0(this, delegate, (byte) 8);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$State;", _UrlKt.FRAGMENT_ENCODE_SET, "Lqx0;", "lastRequestedAt", "Lokhttp3/internal/dns/RealDnsCache$InFlightCall;", "inFlightCall", "Lokhttp3/internal/dns/RealDnsCache$Result;", "result", "<init>", "(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)V", "component1", "()Lqx0;", "component2", "()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;", "component3", "()Lokhttp3/internal/dns/RealDnsCache$Result;", "copy", "(Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;)Lokhttp3/internal/dns/RealDnsCache$State;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Lqx0;", "getLastRequestedAt", "Lokhttp3/internal/dns/RealDnsCache$InFlightCall;", "getInFlightCall", "Lokhttp3/internal/dns/RealDnsCache$Result;", "getResult", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        private final InFlightCall inFlightCall;
        private final qx0 lastRequestedAt;
        private final Result result;

        public /* synthetic */ State(qx0 qx0Var, InFlightCall inFlightCall, Result result, int i, ge1 ge1Var) {
            this((i & 1) != 0 ? null : qx0Var, (i & 2) != 0 ? null : inFlightCall, (i & 4) != 0 ? null : result);
        }

        public static /* synthetic */ State copy$default(State state, qx0 qx0Var, InFlightCall inFlightCall, Result result, int i, Object obj) {
            if ((i & 1) != 0) {
                qx0Var = state.lastRequestedAt;
            }
            if ((i & 2) != 0) {
                inFlightCall = state.inFlightCall;
            }
            if ((i & 4) != 0) {
                result = state.result;
            }
            return state.copy(qx0Var, inFlightCall, result);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final qx0 getLastRequestedAt() {
            return this.lastRequestedAt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InFlightCall getInFlightCall() {
            return this.inFlightCall;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Result getResult() {
            return this.result;
        }

        public final State copy(qx0 lastRequestedAt, InFlightCall inFlightCall, Result result) {
            return new State(lastRequestedAt, inFlightCall, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return dh3.f(this.lastRequestedAt, state.lastRequestedAt) && dh3.f(this.inFlightCall, state.inFlightCall) && dh3.f(this.result, state.result);
        }

        public final InFlightCall getInFlightCall() {
            return this.inFlightCall;
        }

        public final qx0 getLastRequestedAt() {
            return this.lastRequestedAt;
        }

        public final Result getResult() {
            return this.result;
        }

        public int hashCode() {
            qx0 qx0Var = this.lastRequestedAt;
            int iHashCode = (qx0Var == null ? 0 : Long.hashCode(((ka8) qx0Var).X)) * 31;
            InFlightCall inFlightCall = this.inFlightCall;
            int iHashCode2 = (iHashCode + (inFlightCall == null ? 0 : inFlightCall.hashCode())) * 31;
            Result result = this.result;
            return iHashCode2 + (result != null ? result.hashCode() : 0);
        }

        public String toString() {
            return "State(lastRequestedAt=" + this.lastRequestedAt + ", inFlightCall=" + this.inFlightCall + ", result=" + this.result + ')';
        }

        public State(qx0 qx0Var, InFlightCall inFlightCall, Result result) {
            this.lastRequestedAt = qx0Var;
            this.inFlightCall = inFlightCall;
            this.result = result;
        }

        public State() {
            this(null, null, null, 7, null);
        }
    }

    public /* synthetic */ RealDnsCache(TaskRunner taskRunner, la8 la8Var, long j, long j2, long j3, long j4, int i, ge1 ge1Var) {
        this(taskRunner, la8Var, j, j2, j3, j4, i);
    }
}

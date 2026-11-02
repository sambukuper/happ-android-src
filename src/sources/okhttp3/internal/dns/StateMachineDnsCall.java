package okhttp3.internal.dns;

import defpackage.a23;
import defpackage.aq4;
import defpackage.bt;
import defpackage.d02;
import defpackage.dh3;
import defpackage.dn8;
import defpackage.gb4;
import defpackage.ge1;
import defpackage.i21;
import defpackage.o03;
import defpackage.wv0;
import defpackage.xv0;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.Protocol;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u0014\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall;", "Lokhttp3/Dns$Call;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Dns$Request;", "request", "Lokhttp3/internal/dns/DnsQuery$Factory;", "queryFactory", _UrlKt.FRAGMENT_ENCODE_SET, "includeIPv6", "includeServiceMetadata", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns$Request;Lokhttp3/internal/dns/DnsQuery$Factory;ZZ)V", "Lokhttp3/internal/dns/Question;", "question", "Lokhttp3/internal/dns/DnsQuery;", "completedQuery", "Lokhttp3/internal/dns/DnsMessage;", "dnsResponse", "Ldn8;", "updateStateAndCallCallbacks", "(Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;Lokhttp3/internal/dns/DnsMessage;)V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Dns$Record;", "newRecords", "Ljava/io/IOException;", "newException", "lockHeldByThisThread", "(Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;Z)V", "isCanceled", "()Z", "Lokhttp3/Dns$Callback;", "callback", "enqueue", "(Lokhttp3/Dns$Callback;)V", "cancel", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/Dns$Request;", "getRequest", "()Lokhttp3/Dns$Request;", "Lokhttp3/internal/dns/DnsQuery$Factory;", "Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "State", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StateMachineDnsCall implements Dns.Call {
    private final boolean includeIPv6;
    private final boolean includeServiceMetadata;
    private final DnsQuery.Factory queryFactory;
    private final Dns.Request request;
    private final AtomicReference<State> state;
    private final TaskRunner taskRunner;

    public StateMachineDnsCall(TaskRunner taskRunner, Dns.Request request, DnsQuery.Factory factory, boolean z, boolean z2) {
        taskRunner.getClass();
        request.getClass();
        factory.getClass();
        this.taskRunner = taskRunner;
        this.request = request;
        this.queryFactory = factory;
        this.includeIPv6 = z;
        this.includeServiceMetadata = z2;
        this.state = new AtomicReference<>(new State.Idle(false, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn8 enqueue$lambda$1(Dns.Callback callback, StateMachineDnsCall stateMachineDnsCall) {
        callback.onFailure(stateMachineDnsCall, new IOException("canceled"));
        return dn8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateAndCallCallbacks(Question question, DnsQuery completedQuery, DnsMessage dnsResponse) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Protocol protocol;
        try {
            int responseCode = dnsResponse.getResponseCode();
            if (responseCode != 0) {
                if (responseCode == 2) {
                    throw new UnknownHostException("DNS server failure");
                }
                throw new UnknownHostException();
            }
            List<ResourceRecord> answers = dnsResponse.getAnswers();
            int type = question.getType();
            if (type == 1 || type == 28) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : answers) {
                    if (obj instanceof ResourceRecord.IpAddress) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new Dns.Record.IpAddress(getRequest().getHostname(), ((ResourceRecord.IpAddress) it.next()).getAddress()));
                }
                arrayList = arrayList4;
            } else {
                if (type != 65) {
                    bt.i("unexpected question type");
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : answers) {
                    if (obj2 instanceof ResourceRecord.Https) {
                        arrayList5.add(obj2);
                    }
                }
                List listA1 = wv0.a1(arrayList5);
                Collections.shuffle(listA1);
                List<ResourceRecord.Https> listS0 = wv0.S0(listA1, new Comparator() { // from class: okhttp3.internal.dns.StateMachineDnsCall$updateStateAndCallCallbacks$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return Integer.valueOf(((ResourceRecord.Https) t).getPriority()).compareTo(Integer.valueOf(((ResourceRecord.Https) t2).getPriority()));
                    }
                });
                ArrayList arrayList6 = new ArrayList(xv0.Z(listS0, 10));
                for (ResourceRecord.Https https : listS0) {
                    if (https.getPriority() == 0) {
                        updateStateAndCallCallbacks$default(this, completedQuery, null, null, false, 14, null);
                        return;
                    }
                    String targetName = https.getTargetName();
                    if (dh3.f(targetName, _UrlKt.FRAGMENT_ENCODE_SET)) {
                        targetName = null;
                    }
                    if (targetName == null) {
                        targetName = getRequest().getHostname();
                    }
                    String str = targetName;
                    List<String> alpnIds = https.getAlpnIds();
                    if (alpnIds != null) {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator<T> it2 = alpnIds.iterator();
                        while (it2.hasNext()) {
                            try {
                                protocol = Protocol.INSTANCE.get((String) it2.next());
                            } catch (IOException unused) {
                                protocol = null;
                            }
                            if (protocol != null) {
                                arrayList7.add(protocol);
                            }
                        }
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList6.add(new Dns.Record.ServiceMetadata(str, arrayList2, https.getPort(), https.getIpAddressHints(), https.getEchConfigList()));
                }
                arrayList = arrayList6;
            }
            updateStateAndCallCallbacks$default(this, completedQuery, arrayList, null, false, 12, null);
        } catch (IOException e) {
            updateStateAndCallCallbacks$default(this, completedQuery, null, e, false, 10, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateStateAndCallCallbacks$default(StateMachineDnsCall stateMachineDnsCall, DnsQuery dnsQuery, List list, IOException iOException, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dnsQuery = null;
        }
        if ((i & 2) != 0) {
            list = d02.X;
        }
        if ((i & 4) != 0) {
            iOException = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        stateMachineDnsCall.updateStateAndCallCallbacks(dnsQuery, list, iOException, z);
    }

    @Override // okhttp3.Dns.Call
    public void cancel() {
        State state;
        loop0: while (true) {
            state = this.state.get();
            State stateCancel = state.cancel();
            AtomicReference<State> atomicReference = this.state;
            do {
                if (atomicReference.compareAndSet(state, stateCancel)) {
                    break loop0;
                }
            } while (atomicReference.get() == state);
        }
        if (state instanceof State.Running) {
            Iterator<DnsQuery> it = ((State.Running) state).getRunningQueries().iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }

    @Override // okhttp3.Dns.Call
    public void enqueue(Dns.Callback callback) {
        callback.getClass();
        gb4 gb4VarR = i21.r();
        if (this.includeServiceMetadata) {
            gb4VarR.add(new Question(getRequest().getPort() == 443 ? getRequest().getHostname() : "_" + getRequest().getPort() + "._https." + getRequest().getHostname(), 65, 0, 4, null));
        }
        if (this.includeIPv6) {
            gb4VarR.add(new Question(getRequest().getHostname(), 28, 0, 4, null));
        }
        gb4VarR.add(new Question(getRequest().getHostname(), 1, 0, 4, null));
        gb4 gb4VarJ = i21.j(gb4VarR);
        while (true) {
            State state = this.state.get();
            State.Idle idle = state instanceof State.Idle ? (State.Idle) state : null;
            if (idle == null) {
                bt.i("already enqueued");
                return;
            }
            if (idle.getCanceled()) {
                State.Complete complete = new State.Complete(true);
                AtomicReference<State> atomicReference = this.state;
                do {
                    if (atomicReference.compareAndSet(idle, complete)) {
                        TaskQueue.execute$default(this.taskRunner.newQueue(), getRequest().getHostname() + " dns", 0L, false, new a23((Object) callback, (Object) this, (byte) 21), 6, null);
                        return;
                    }
                } while (atomicReference.get() == idle);
            } else {
                int iG = aq4.G(xv0.Z(gb4VarJ, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                ListIterator listIterator = gb4VarJ.listIterator(0);
                while (true) {
                    o03 o03Var = (o03) listIterator;
                    if (!o03Var.hasNext()) {
                        break;
                    }
                    Object next = o03Var.next();
                    linkedHashMap.put(next, this.queryFactory.newQuery((Question) next));
                }
                State.Running running = new State.Running(false, callback, false, wv0.Y0(linkedHashMap.values()), null, null, 52, null);
                AtomicReference<State> atomicReference2 = this.state;
                do {
                    if (atomicReference2.compareAndSet(idle, running)) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            final Question question = (Question) entry.getKey();
                            final DnsQuery dnsQuery = (DnsQuery) entry.getValue();
                            dnsQuery.enqueue(new DnsQuery.Callback() { // from class: okhttp3.internal.dns.StateMachineDnsCall.enqueue.2
                                @Override // okhttp3.internal.dns.DnsQuery.Callback
                                public void onFailure(IOException e) {
                                    e.getClass();
                                    StateMachineDnsCall.updateStateAndCallCallbacks$default(StateMachineDnsCall.this, dnsQuery, null, e, false, 10, null);
                                }

                                @Override // okhttp3.internal.dns.DnsQuery.Callback
                                public void onResponse(DnsMessage dnsResponse) {
                                    dnsResponse.getClass();
                                    StateMachineDnsCall.this.updateStateAndCallCallbacks(question, dnsQuery, dnsResponse);
                                }
                            });
                        }
                        return;
                    }
                } while (atomicReference2.get() == idle);
            }
        }
    }

    @Override // okhttp3.Dns.Call
    public Dns.Request getRequest() {
        return this.request;
    }

    @Override // okhttp3.Dns.Call
    public boolean isCanceled() {
        return this.state.get().getCanceled();
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\b\u0010\u0006\u001a\u00020\u0000H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State;", _UrlKt.FRAGMENT_ENCODE_SET, "canceled", _UrlKt.FRAGMENT_ENCODE_SET, "getCanceled", "()Z", "cancel", "Idle", "Running", "Complete", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "canceled", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Z)V", "getCanceled", "()Z", "cancel", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Complete implements State {
            private final boolean canceled;

            public Complete(boolean z) {
                this.canceled = z;
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public Idle cancel() {
                return new Idle(true);
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                return this.canceled;
            }
        }

        State cancel();

        boolean getCanceled();

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0000H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "canceled", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Z)V", "getCanceled", "()Z", "cancel", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Idle implements State {
            private final boolean canceled;

            public /* synthetic */ Idle(boolean z, int i, ge1 ge1Var) {
                this((i & 1) != 0 ? false : z);
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public Idle cancel() {
                return new Idle(true);
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                return this.canceled;
            }

            public Idle(boolean z) {
                this.canceled = z;
            }

            public Idle() {
                this(false, 1, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0000H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "canceled", _UrlKt.FRAGMENT_ENCODE_SET, "callback", "Lokhttp3/Dns$Callback;", "lockHeld", "runningQueries", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/dns/DnsQuery;", "pendingRecords", "Lokhttp3/Dns$Record;", "pendingExceptions", "Ljava/io/IOException;", "<init>", "(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCanceled", "()Z", "getCallback", "()Lokhttp3/Dns$Callback;", "getLockHeld", "getRunningQueries", "()Ljava/util/List;", "getPendingRecords", "getPendingExceptions", "cancel", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Running implements State {
            private final Dns.Callback callback;
            private final boolean canceled;
            private final boolean lockHeld;
            private final List<IOException> pendingExceptions;
            private final List<Dns.Record> pendingRecords;
            private final List<DnsQuery> runningQueries;

            /* JADX WARN: Multi-variable type inference failed */
            public Running(boolean z, Dns.Callback callback, boolean z2, List<? extends DnsQuery> list, List<? extends Dns.Record> list2, List<? extends IOException> list3) {
                callback.getClass();
                list.getClass();
                list2.getClass();
                list3.getClass();
                this.canceled = z;
                this.callback = callback;
                this.lockHeld = z2;
                this.runningQueries = list;
                this.pendingRecords = list2;
                this.pendingExceptions = list3;
                if (list2.isEmpty() || z2) {
                    return;
                }
                bt.i("Check failed.");
                throw null;
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public Running cancel() {
                return new Running(true, this.callback, this.lockHeld, this.runningQueries, this.pendingRecords, this.pendingExceptions);
            }

            public final Dns.Callback getCallback() {
                return this.callback;
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                return this.canceled;
            }

            public final boolean getLockHeld() {
                return this.lockHeld;
            }

            public final List<IOException> getPendingExceptions() {
                return this.pendingExceptions;
            }

            public final List<Dns.Record> getPendingRecords() {
                return this.pendingRecords;
            }

            public final List<DnsQuery> getRunningQueries() {
                return this.runningQueries;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Running(boolean z, Dns.Callback callback, boolean z2, List list, List list2, List list3, int i, ge1 ge1Var) {
                boolean z3 = (i & 4) != 0 ? false : z2;
                int i2 = i & 16;
                d02 d02Var = d02.X;
                this(z, callback, z3, list, i2 != 0 ? d02Var : list2, (i & 32) != 0 ? d02Var : list3);
            }
        }
    }

    private final void updateStateAndCallCallbacks(DnsQuery completedQuery, List<? extends Dns.Record> newRecords, IOException newException, boolean lockHeldByThisThread) {
        List<DnsQuery> runningQueries;
        List<IOException> pendingExceptions;
        d02 d02Var;
        List<Dns.Record> list;
        State running;
        DnsQuery dnsQuery = completedQuery;
        List<? extends Dns.Record> list2 = newRecords;
        IOException iOException = newException;
        boolean z = lockHeldByThisThread;
        while (true) {
            State state = this.state.get();
            State.Running running2 = state instanceof State.Running ? (State.Running) state : null;
            if (running2 == null) {
                return;
            }
            if (dnsQuery != null) {
                runningQueries = wv0.D0(running2.getRunningQueries(), dnsQuery);
            } else {
                runningQueries = running2.getRunningQueries();
            }
            List<DnsQuery> list3 = runningQueries;
            if (iOException != null) {
                pendingExceptions = wv0.I0(running2.getPendingExceptions(), iOException);
            } else {
                pendingExceptions = running2.getPendingExceptions();
            }
            List<IOException> list4 = pendingExceptions;
            List<Dns.Record> listH0 = !list2.isEmpty() ? wv0.H0(running2.getPendingRecords(), list2) : running2.getPendingRecords();
            boolean zIsEmpty = list3.isEmpty();
            boolean z2 = false;
            boolean z3 = !z && running2.getLockHeld();
            if ((!zIsEmpty && listH0.isEmpty()) || z3) {
                State.Running running3 = new State.Running(running2.getCanceled(), running2.getCallback(), z3, list3, listH0, list4);
                AtomicReference<State> atomicReference = this.state;
                while (!atomicReference.compareAndSet(running2, running3)) {
                    if (atomicReference.get() != running2) {
                    }
                }
                return;
            }
            d02 d02Var2 = d02.X;
            if (zIsEmpty) {
                running = new State.Complete(running2.getCanceled());
                list = listH0;
                d02Var = d02Var2;
            } else {
                d02Var = d02Var2;
                list = listH0;
                running = new State.Running(running2.getCanceled(), running2.getCallback(), true, list3, d02Var, list4);
            }
            AtomicReference<State> atomicReference2 = this.state;
            while (true) {
                if (atomicReference2.compareAndSet(running2, running)) {
                    if (zIsEmpty && list4.isEmpty()) {
                        z2 = true;
                    }
                    if (!list.isEmpty() || z2) {
                        running2.getCallback().onRecords(this, z2, list);
                    }
                    if (zIsEmpty && !list4.isEmpty()) {
                        _StateMachineDnsCallKt.onFailure(running2.getCallback(), this, list4);
                    }
                    dnsQuery = null;
                    iOException = null;
                    list2 = d02Var;
                    z = true;
                    break;
                }
                List<Dns.Record> list5 = list;
                if (atomicReference2.get() != running2) {
                    break;
                } else {
                    list = list5;
                }
            }
        }
    }
}

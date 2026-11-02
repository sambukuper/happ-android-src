package okhttp3.internal.dns;

import defpackage.b61;
import defpackage.bt;
import defpackage.dh3;
import defpackage.xv0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall;", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/Dns$Call;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Dns;", "delegate", "Lokhttp3/Dns$Request;", "request", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns;Lokhttp3/Dns$Request;)V", "Lokhttp3/Dns$Callback;", "callback", "Ldn8;", "enqueue", "(Lokhttp3/Dns$Callback;)V", "cancel", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "isCanceled", "()Z", _UrlKt.FRAGMENT_ENCODE_SET, "runOnce", "()J", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/Dns;", "Lokhttp3/Dns$Request;", "getRequest", "()Lokhttp3/Dns$Request;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "State", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LookupDnsCall extends Task implements Dns.Call {
    private final Dns delegate;
    private final Dns.Request request;
    private final AtomicReference<State> state;
    private final TaskRunner taskRunner;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State;", _UrlKt.FRAGMENT_ENCODE_SET, "Idle", "Running", "Complete", "Canceled", "Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;", "Lokhttp3/internal/dns/LookupDnsCall$State$Complete;", "Lokhttp3/internal/dns/LookupDnsCall$State$Idle;", "Lokhttp3/internal/dns/LookupDnsCall$State$Running;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Canceled implements State {
            public static final Canceled INSTANCE = new Canceled();

            private Canceled() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Complete;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Complete implements State {
            public static final Complete INSTANCE = new Complete();

            private Complete() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Idle;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Idle implements State {
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Running;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "callback", "Lokhttp3/Dns$Callback;", "<init>", "(Lokhttp3/Dns$Callback;)V", "getCallback", "()Lokhttp3/Dns$Callback;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Running implements State {
            private final Dns.Callback callback;

            public Running(Dns.Callback callback) {
                callback.getClass();
                this.callback = callback;
            }

            public final Dns.Callback getCallback() {
                return this.callback;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupDnsCall(TaskRunner taskRunner, Dns dns, Dns.Request request) {
        super(request.getHostname() + " dns", false);
        taskRunner.getClass();
        dns.getClass();
        request.getClass();
        this.taskRunner = taskRunner;
        this.delegate = dns;
        this.request = request;
        this.state = new AtomicReference<>(State.Idle.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cancel$lambda$0(State state) {
        state.getClass();
        return (state instanceof State.Running) || state.equals(State.Idle.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueue$lambda$0(State state) {
        state.getClass();
        return state instanceof State.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runOnce$lambda$0(State state) {
        state.getClass();
        return state instanceof State.Running;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runOnce$lambda$2(State state) {
        state.getClass();
        return state instanceof State.Running;
    }

    @Override // okhttp3.Dns.Call
    public void cancel() {
        Dns.Callback callback;
        State state = (State) _UtilJvmKt.testAndSet(this.state, State.Canceled.INSTANCE, new a((byte) 3));
        State.Running running = state instanceof State.Running ? (State.Running) state : null;
        if (running == null || (callback = running.getCallback()) == null) {
            return;
        }
        callback.onFailure(this, new IOException("canceled"));
    }

    @Override // okhttp3.Dns.Call
    public void enqueue(Dns.Callback callback) {
        callback.getClass();
        State state = (State) _UtilJvmKt.testAndSet(this.state, new State.Running(callback), new a((byte) 0));
        if (state instanceof State.Idle) {
            TaskQueue.schedule$default(this.taskRunner.newQueue(), this, 0L, 2, null);
            return;
        }
        if ((state instanceof State.Running) || dh3.f(state, State.Complete.INSTANCE)) {
            bt.i("already enqueued");
        } else if (dh3.f(state, State.Canceled.INSTANCE)) {
            callback.onFailure(this, new IOException("canceled"));
        } else {
            b61.c();
        }
    }

    @Override // okhttp3.Dns.Call
    public Dns.Request getRequest() {
        return this.request;
    }

    @Override // okhttp3.Dns.Call
    public boolean isCanceled() {
        return this.state.get() instanceof State.Canceled;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        Dns.Callback callback;
        Dns.Callback callback2;
        try {
            List<InetAddress> listLookup = this.delegate.lookup(getRequest().getHostname());
            State state = (State) _UtilJvmKt.testAndSet(this.state, State.Complete.INSTANCE, new a((byte) 1));
            State.Running running = state instanceof State.Running ? (State.Running) state : null;
            if (running == null || (callback2 = running.getCallback()) == null) {
                return -1L;
            }
            ArrayList arrayList = new ArrayList(xv0.Z(listLookup, 10));
            Iterator<T> it = listLookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dns.Record.IpAddress(getRequest().getHostname(), (InetAddress) it.next()));
            }
            callback2.onRecords(this, true, arrayList);
            return -1L;
        } catch (UnknownHostException e) {
            State state2 = (State) _UtilJvmKt.testAndSet(this.state, State.Complete.INSTANCE, new a((byte) 2));
            State.Running running2 = state2 instanceof State.Running ? (State.Running) state2 : null;
            if (running2 == null || (callback = running2.getCallback()) == null) {
                return -1L;
            }
            callback.onFailure(this, e);
            return -1L;
        }
    }
}

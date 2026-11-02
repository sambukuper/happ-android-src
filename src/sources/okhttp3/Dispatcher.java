package okhttp3;

import defpackage.dh3;
import defpackage.em7;
import defpackage.pc6;
import defpackage.ti1;
import defpackage.wv0;
import defpackage.xv0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0018\u00010\tR\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\r\u001a\b\u0018\u00010\tR\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0018\u00010\tR\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\tR\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\tR\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001eJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010&J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)R*\u0010*\u001a\u00020$2\u0006\u0010*\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010&\"\u0004\b-\u0010.R*\u0010/\u001a\u00020$2\u0006\u0010/\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b0\u0010&\"\u0004\b1\u0010.R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010<\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010>\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010)¨\u0006@"}, d2 = {"Lokhttp3/Dispatcher;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", _UrlKt.FRAGMENT_ENCODE_SET, MetaParams.HOST, "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "findExistingCallWithHost", "(Ljava/lang/String;)Lokhttp3/internal/connection/RealCall$AsyncCall;", "enqueuedCall", "finishedCall", "finishedAsyncCall", "Ldn8;", "promoteAndExecute", "(Lokhttp3/internal/connection/RealCall$AsyncCall;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "call", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", _UrlKt.FRAGMENT_ENCODE_SET, "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)Z", "executed", "finished$okhttp", "finished", "(Lokhttp3/internal/connection/RealCall;)V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Call;", "queuedCalls", "()Ljava/util/List;", "runningCalls", _UrlKt.FRAGMENT_ENCODE_SET, "queuedCallsCount", "()I", "runningCallsCount", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "maxRequests", "I", "getMaxRequests", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "idleCallback", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "executorServiceOrNull", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "runningAsyncCalls", "runningSyncCalls", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"okhttp3/Dispatcher$promoteAndExecute$Effects", _UrlKt.FRAGMENT_ENCODE_SET, "callsToExecute", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "idleCallbackToRun", "Ljava/lang/Runnable;", "<init>", "(Ljava/util/List;Ljava/lang/Runnable;)V", "getCallsToExecute", "()Ljava/util/List;", "getIdleCallbackToRun", "()Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Effects {
        private final List<RealCall.AsyncCall> callsToExecute;
        private final Runnable idleCallbackToRun;

        public Effects(List<RealCall.AsyncCall> list, Runnable runnable) {
            list.getClass();
            this.callsToExecute = list;
            this.idleCallbackToRun = runnable;
        }

        public final List<RealCall.AsyncCall> getCallsToExecute() {
            return this.callsToExecute;
        }

        public final Runnable getIdleCallbackToRun() {
            return this.idleCallbackToRun;
        }
    }

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String host) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (dh3.f(next.getHost(), host)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (dh3.f(next2.getHost(), host)) {
                return next2;
            }
        }
        return null;
    }

    private final void promoteAndExecute(RealCall.AsyncCall enqueuedCall, RealCall finishedCall, RealCall.AsyncCall finishedAsyncCall) {
        Effects effects;
        RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        _UtilJvmKt.assertLockNotHeld(this);
        boolean zIsShutdown = executorService().isShutdown();
        synchronized (this) {
            if (finishedCall != null) {
                try {
                    if (!this.runningSyncCalls.remove(finishedCall)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (finishedAsyncCall != null) {
                finishedAsyncCall.getCallsPerHost().decrementAndGet();
                if (!this.runningAsyncCalls.remove(finishedAsyncCall)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (enqueuedCall != null) {
                this.readyAsyncCalls.add(enqueuedCall);
                if (!enqueuedCall.getThis$0().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(enqueuedCall.getHost())) != null) {
                    enqueuedCall.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
                }
            }
            Runnable runnable = (!(finishedCall == null && finishedAsyncCall == null) && (zIsShutdown || this.runningAsyncCalls.isEmpty()) && this.runningSyncCalls.isEmpty()) ? this.idleCallback : null;
            if (zIsShutdown) {
                List listY0 = wv0.Y0(this.readyAsyncCalls);
                this.readyAsyncCalls.clear();
                effects = new Effects(listY0, runnable);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                it.getClass();
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                effects = new Effects(arrayList, runnable);
            }
        }
        int size = effects.getCallsToExecute().size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            RealCall.AsyncCall asyncCall = effects.getCallsToExecute().get(i);
            if (asyncCall == enqueuedCall) {
                z = false;
            } else {
                asyncCall.getThis$0().getEventListener().dispatcherQueueEnd(asyncCall.getThis$0(), this);
            }
            if (zIsShutdown) {
                RealCall.AsyncCall.failRejected$okhttp$default(asyncCall, null, 1, null);
            } else {
                asyncCall.executeOn(executorService());
            }
        }
        if (z && enqueuedCall != null) {
            enqueuedCall.getThis$0().getEventListener().dispatcherQueueStart(enqueuedCall.getThis$0(), this);
        }
        Runnable idleCallbackToRun = effects.getIdleCallbackToRun();
        if (idleCallbackToRun != null) {
            idleCallbackToRun.run();
        }
    }

    public static /* synthetic */ void promoteAndExecute$default(Dispatcher dispatcher, RealCall.AsyncCall asyncCall, RealCall realCall, RealCall.AsyncCall asyncCall2, int i, Object obj) {
        if ((i & 1) != 0) {
            asyncCall = null;
        }
        if ((i & 2) != 0) {
            realCall = null;
        }
        if ((i & 4) != 0) {
            asyncCall2 = null;
        }
        dispatcher.promoteAndExecute(asyncCall, realCall, asyncCall2);
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m64deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().getThis$0().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                it2.next().getThis$0().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall call) {
        call.getClass();
        promoteAndExecute$default(this, call, null, null, 6, null);
    }

    public final synchronized boolean executed$okhttp(RealCall call) {
        call.getClass();
        return this.runningSyncCalls.add(call);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            executorService = this.executorServiceOrNull;
            if (executorService == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), _UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " Dispatcher", false));
                this.executorServiceOrNull = threadPoolExecutor;
                executorService = threadPoolExecutor;
            }
            executorService.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall call) {
        call.getClass();
        promoteAndExecute$default(this, null, null, call, 3, null);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(xv0.Z(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
            ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(xv0.Z(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
            }
            listUnmodifiableList = Collections.unmodifiableList(wv0.H0(arrayDeque, arrayList));
            listUnmodifiableList.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        if (i < 1) {
            em7.c(pc6.j(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.maxRequests = i;
        }
        promoteAndExecute$default(this, null, null, null, 7, null);
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            em7.c(pc6.j(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.maxRequestsPerHost = i;
        }
        promoteAndExecute$default(this, null, null, null, 7, null);
    }

    public final void finished$okhttp(RealCall call) {
        call.getClass();
        promoteAndExecute$default(this, null, call, null, 5, null);
    }

    public Dispatcher(ExecutorService executorService) {
        this();
        this.executorServiceOrNull = executorService;
    }
}

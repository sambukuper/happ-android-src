package okhttp3.internal.connection;

import defpackage.gv3;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\b0\b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lokhttp3/internal/connection/FastFallbackExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RoutePlanner;", "routePlanner", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/connection/RoutePlanner;Lokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "launchTcpConnect", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", _UrlKt.FRAGMENT_ENCODE_SET, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitTcpConnect", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "Ldn8;", "cancelInFlightConnects", "()V", "Lokhttp3/internal/connection/RealConnection;", "find", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RoutePlanner;", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/concurrent/TaskRunner;", "connectDelayNanos", "J", "nextTcpConnectAtNanos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "tcpConnectsInFlight", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/BlockingQueue;", "kotlin.jvm.PlatformType", "connectResults", "Ljava/util/concurrent/BlockingQueue;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastFallbackExchangeFinder implements ExchangeFinder {
    private final long connectDelayNanos;
    private final BlockingQueue<RoutePlanner.ConnectResult> connectResults;
    private long nextTcpConnectAtNanos;
    private final RoutePlanner routePlanner;
    private final TaskRunner taskRunner;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> tcpConnectsInFlight;

    public FastFallbackExchangeFinder(RoutePlanner routePlanner, TaskRunner taskRunner) {
        routePlanner.getClass();
        taskRunner.getClass();
        this.routePlanner = routePlanner;
        this.taskRunner = taskRunner;
        this.connectDelayNanos = 250000000L;
        this.nextTcpConnectAtNanos = Long.MIN_VALUE;
        this.tcpConnectsInFlight = new CopyOnWriteArrayList<>();
        this.connectResults = taskRunner.getBackend().decorate(new LinkedBlockingDeque());
    }

    private final RoutePlanner.ConnectResult awaitTcpConnect(long timeout, TimeUnit unit) {
        RoutePlanner.ConnectResult connectResultPoll;
        if (this.tcpConnectsInFlight.isEmpty() || (connectResultPoll = this.connectResults.poll(timeout, unit)) == null) {
            return null;
        }
        this.tcpConnectsInFlight.remove(connectResultPoll.getPlan());
        return connectResultPoll;
    }

    private final void cancelInFlightConnects() {
        Iterator<RoutePlanner.Plan> it = this.tcpConnectsInFlight.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner.Plan next = it.next();
            next.mo167cancel();
            RoutePlanner.Plan planMo169retry = next.mo169retry();
            if (planMo169retry != null) {
                getRoutePlanner().getDeferredPlans().addLast(planMo169retry);
            }
        }
        this.tcpConnectsInFlight.clear();
    }

    private final RoutePlanner.ConnectResult launchTcpConnect() throws IOException {
        final RoutePlanner.Plan failedPlan;
        if (RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
            try {
                failedPlan = getRoutePlanner().plan();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.getIsReady()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6, null);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).getResult();
            }
            this.tcpConnectsInFlight.add(failedPlan);
            TaskQueue.schedule$default(this.taskRunner.newQueue(), new Task(_UtilJvmKt.okHttpName + " connect " + getRoutePlanner().getAddress().url().redact()) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder.launchTcpConnect.1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() throws InterruptedException {
                    RoutePlanner.ConnectResult connectResult;
                    try {
                        connectResult = failedPlan.getResult();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(failedPlan, null, th2, 2, null);
                    }
                    if (!this.tcpConnectsInFlight.contains(failedPlan)) {
                        return -1L;
                    }
                    this.connectResults.put(connectResult);
                    return -1L;
                }
            }, 0L, 2, null);
        }
        return null;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RealConnection find() throws IOException {
        RoutePlanner.ConnectResult connectResultLaunchTcpConnect;
        long j;
        IOException iOException = null;
        while (true) {
            try {
                if (this.tcpConnectsInFlight.isEmpty() && !RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    break;
                }
                if (getRoutePlanner().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jNanoTime = this.taskRunner.getBackend().nanoTime();
                long j2 = this.nextTcpConnectAtNanos - jNanoTime;
                if (this.tcpConnectsInFlight.isEmpty() || j2 <= 0) {
                    connectResultLaunchTcpConnect = launchTcpConnect();
                    j = this.connectDelayNanos;
                    this.nextTcpConnectAtNanos = jNanoTime + j;
                } else {
                    j = j2;
                    connectResultLaunchTcpConnect = null;
                }
                if (connectResultLaunchTcpConnect != null || (connectResultLaunchTcpConnect = awaitTcpConnect(j, TimeUnit.NANOSECONDS)) != null) {
                    if (connectResultLaunchTcpConnect.isSuccess()) {
                        cancelInFlightConnects();
                        if (!connectResultLaunchTcpConnect.getPlan().getIsReady()) {
                            connectResultLaunchTcpConnect = connectResultLaunchTcpConnect.getPlan().mo172connectTlsEtc();
                        }
                        if (connectResultLaunchTcpConnect.isSuccess()) {
                            RealConnection realConnectionMo168handleSuccess = connectResultLaunchTcpConnect.getPlan().mo168handleSuccess();
                            cancelInFlightConnects();
                            return realConnectionMo168handleSuccess;
                        }
                    }
                    Throwable throwable = connectResultLaunchTcpConnect.getThrowable();
                    if (throwable != null) {
                        if (!(throwable instanceof IOException)) {
                            throw throwable;
                        }
                        if (iOException == null) {
                            iOException = (IOException) throwable;
                        } else {
                            gv3.g(iOException, throwable);
                        }
                        if (!RetryTlsHandshakeKt.attemptAnotherConnection((IOException) throwable)) {
                            break;
                        }
                    }
                    RoutePlanner.Plan nextPlan = connectResultLaunchTcpConnect.getNextPlan();
                    if (nextPlan != null) {
                        getRoutePlanner().getDeferredPlans().addFirst(nextPlan);
                    }
                }
            } catch (Throwable th) {
                cancelInFlightConnects();
                throw th;
            }
        }
        cancelInFlightConnects();
        iOException.getClass();
        throw iOException;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}

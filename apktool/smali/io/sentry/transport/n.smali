.class public final Lio/sentry/transport/n;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final X:I

.field public Y:Lio/sentry/a5;

.field public final Z:Lio/sentry/ILogger;

.field public final f0:Lio/sentry/b5;

.field public final g0:Lio/sentry/d;


# direct methods
.method public constructor <init>(ILio/sentry/p0;Lio/sentry/transport/a;Lio/sentry/ILogger;Lio/sentry/b5;)V
    .locals 9

    .line 1
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 2
    .line 3
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    move v2, v1

    .line 12
    move-object v0, p0

    .line 13
    move-object v7, p2

    .line 14
    move-object v8, p3

    .line 15
    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    iput-object p0, v0, Lio/sentry/transport/n;->Y:Lio/sentry/a5;

    .line 20
    .line 21
    new-instance p0, Lio/sentry/d;

    .line 22
    .line 23
    const/16 p2, 0xb

    .line 24
    .line 25
    invoke-direct {p0, p2}, Lio/sentry/d;-><init>(B)V

    .line 26
    .line 27
    .line 28
    iput-object p0, v0, Lio/sentry/transport/n;->g0:Lio/sentry/d;

    .line 29
    .line 30
    iput p1, v0, Lio/sentry/transport/n;->X:I

    .line 31
    .line 32
    iput-object p4, v0, Lio/sentry/transport/n;->Z:Lio/sentry/ILogger;

    .line 33
    .line 34
    iput-object p5, v0, Lio/sentry/transport/n;->f0:Lio/sentry/b5;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/transport/n;->g0:Lio/sentry/d;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lio/sentry/transport/p;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    sget p0, Lio/sentry/transport/p;->X:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    sget p1, Lio/sentry/transport/p;->X:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public final synthetic close()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->isTerminated()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 19
    .line 20
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    const-wide/16 v3, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, v3, v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 25
    .line 26
    .line 27
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_1
    return-void
.end method

.method public final submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/transport/n;->g0:Lio/sentry/d;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lio/sentry/transport/p;

    .line 6
    .line 7
    sget v1, Lio/sentry/transport/p;->X:I

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/transport/p;->a()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p0, Lio/sentry/transport/n;->X:I

    .line 14
    .line 15
    iget-object v3, p0, Lio/sentry/transport/n;->Z:Lio/sentry/ILogger;

    .line 16
    .line 17
    iget-object v4, p0, Lio/sentry/transport/n;->f0:Lio/sentry/b5;

    .line 18
    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/sentry/transport/p;->b()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-super {p0, p1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object p0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    .line 32
    .line 33
    .line 34
    invoke-interface {v4}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lio/sentry/transport/n;->Y:Lio/sentry/a5;

    .line 39
    .line 40
    sget-object p0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 41
    .line 42
    const-string v0, "Submit rejected by thread pool executor"

    .line 43
    .line 44
    invoke-interface {v3, p0, v0, p1}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Lio/sentry/transport/m;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_0
    invoke-interface {v4}, Lio/sentry/b5;->a()Lio/sentry/a5;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lio/sentry/transport/n;->Y:Lio/sentry/a5;

    .line 58
    .line 59
    sget-object p0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    new-array p1, p1, [Ljava/lang/Object;

    .line 63
    .line 64
    const-string v0, "Submit cancelled"

    .line 65
    .line 66
    invoke-interface {v3, p0, v0, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Lio/sentry/transport/m;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

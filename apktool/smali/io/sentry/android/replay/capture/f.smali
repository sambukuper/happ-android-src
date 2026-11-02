.class public final Lio/sentry/android/replay/capture/f;
.super Lio/sentry/android/replay/capture/c;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final v:Lio/sentry/s6;

.field public final w:Lio/sentry/i1;

.field public final x:Lio/sentry/transport/f;

.field public final y:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/i1;Lio/sentry/transport/d;Lio/sentry/android/replay/util/g;Lio/sentry/android/replay/util/g;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct/range {p0 .. p5}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/s6;Lio/sentry/i1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 17
    .line 18
    iput-object p2, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/i1;

    .line 19
    .line 20
    iput-object p3, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/f;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lio/sentry/android/replay/capture/f;->y:Ljava/util/ArrayList;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lgn2;Z)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 17
    .line 18
    const-string p2, "Not capturing replay for crashed event, will be captured on next launch"

    .line 19
    .line 20
    new-array v0, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p2, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/i1;

    .line 27
    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    invoke-interface {p2}, Lio/sentry/i1;->d()Ls91;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    sget-object v3, Lio/sentry/p;->All:Lio/sentry/p;

    .line 37
    .line 38
    invoke-virtual {p2, v3}, Ls91;->k(Lio/sentry/p;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    sget-object v3, Lio/sentry/p;->Replay:Lio/sentry/p;

    .line 45
    .line 46
    invoke-virtual {p2, v3}, Ls91;->k(Lio/sentry/p;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object p1, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 57
    .line 58
    const-string p2, "Replay is rate-limited, not capturing for event"

    .line 59
    .line 60
    new-array v0, v1, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lio/sentry/s6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lio/sentry/clientreport/d;->RATELIMIT_BACKOFF:Lio/sentry/clientreport/d;

    .line 70
    .line 71
    sget-object p2, Lio/sentry/p;->Replay:Lio/sentry/p;

    .line 72
    .line 73
    invoke-interface {p0, p1, p2}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/p;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    new-instance p2, Li79;

    .line 78
    .line 79
    invoke-direct {p2, p0, p1, v0}, Li79;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    const-string p1, "capture_replay"

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/replay/capture/f;->p(Ljava/lang/String;Lgn2;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final b()Lio/sentry/android/replay/capture/c;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 17
    .line 18
    const-string v3, "Not converting to session mode, because the process is about to terminate"

    .line 19
    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/i1;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Lio/sentry/i1;->d()Ls91;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object v2, Lio/sentry/p;->All:Lio/sentry/p;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ls91;->k(Lio/sentry/p;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    sget-object v2, Lio/sentry/p;->Replay:Lio/sentry/p;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ls91;->k(Lio/sentry/p;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    :cond_1
    const/4 v0, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v0, v1

    .line 55
    :goto_0
    iget-object v3, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 64
    .line 65
    const-string v3, "Not converting to session mode, because replay is rate-limited"

    .line 66
    .line 67
    new-array v1, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    new-instance v2, Lio/sentry/android/replay/capture/m;

    .line 74
    .line 75
    iget-object v6, p0, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 76
    .line 77
    iget-object v7, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 78
    .line 79
    iget-object v4, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/i1;

    .line 80
    .line 81
    iget-object v5, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/f;

    .line 82
    .line 83
    invoke-direct/range {v2 .. v7}, Lio/sentry/android/replay/capture/m;-><init>(Lio/sentry/s6;Lio/sentry/i1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->f()Lio/sentry/android/replay/d0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v2, v0}, Lio/sentry/android/replay/capture/c;->l(Lio/sentry/android/replay/d0;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->e()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    sget-object v1, Lio/sentry/t6;->BUFFER:Lio/sentry/t6;

    .line 102
    .line 103
    invoke-virtual {v2, v0, p0, v1}, Lio/sentry/android/replay/capture/m;->n(ILio/sentry/protocol/w;Lio/sentry/t6;)V

    .line 104
    .line 105
    .line 106
    return-object v2
.end method

.method public final g(Lio/sentry/android/replay/d0;)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/capture/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/e;-><init>(Lio/sentry/android/replay/capture/f;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "configuration_changed"

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/f;->p(Ljava/lang/String;Lgn2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->l(Lio/sentry/android/replay/d0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final h(Lio/sentry/android/replay/w;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/transport/f;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    new-instance v0, Lio/sentry/android/replay/util/h;

    .line 8
    .line 9
    new-instance v1, Lvg0;

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    invoke-direct/range {v1 .. v6}, Lvg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 15
    .line 16
    .line 17
    const-string p0, "BufferCaptureStrategy.add_frame"

    .line 18
    .line 19
    invoke-direct {v0, v1, p0}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, v2, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final i(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lio/sentry/android/replay/capture/c;->i(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/f;

    .line 5
    .line 6
    invoke-interface {p1}, Lio/sentry/transport/f;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-short p1, p1, Lio/sentry/w6;->h:S

    .line 17
    .line 18
    int-to-long v2, p1

    .line 19
    sub-long/2addr v0, v2

    .line 20
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->q:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lio/sentry/rrweb/b;

    .line 43
    .line 44
    iget-wide v2, p1, Lio/sentry/rrweb/b;->Y:J

    .line 45
    .line 46
    cmp-long p1, v2, v0

    .line 47
    .line 48
    if-gez p1, :cond_0

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/capture/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/e;-><init>(Lio/sentry/android/replay/capture/f;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "pause"

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/f;->p(Ljava/lang/String;Lgn2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final p(Ljava/lang/String;Lgn2;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->f()Lio/sentry/android/replay/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 6
    .line 7
    if-nez v6, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 14
    .line 15
    const-string v0, "Recorder config is not set, not creating segment for task: "

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    new-array v0, v0, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {p0, p2, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v0}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-short v0, v0, Lio/sentry/w6;->h:S

    .line 33
    .line 34
    int-to-long v0, v0

    .line 35
    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/f;

    .line 36
    .line 37
    invoke-interface {v2}, Lio/sentry/transport/f;->d()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    iget-object v4, p0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    iget-object v5, v4, Lio/sentry/android/replay/l;->g0:Lio/sentry/util/a;

    .line 46
    .line 47
    invoke-virtual {v5}, Lio/sentry/util/a;->g()V

    .line 48
    .line 49
    .line 50
    :try_start_0
    iget-object v4, v4, Lio/sentry/android/replay/l;->j0:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {v4}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lio/sentry/android/replay/m;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    iget-wide v8, v4, Lio/sentry/android/replay/m;->b:J

    .line 62
    .line 63
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p0, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object v4, v7

    .line 72
    :goto_0
    invoke-static {v5, v7}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    new-instance v4, Ljava/util/Date;

    .line 82
    .line 83
    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :goto_1
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    :catchall_1
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    invoke-static {v5, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_2
    sub-long v0, v2, v0

    .line 95
    .line 96
    new-instance v4, Ljava/util/Date;

    .line 97
    .line 98
    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    sub-long/2addr v2, v0

    .line 106
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    new-instance v8, Lio/sentry/android/replay/util/h;

    .line 111
    .line 112
    const-string v0, "BufferCaptureStrategy."

    .line 113
    .line 114
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v0, Lio/sentry/android/replay/capture/d;

    .line 119
    .line 120
    move-object v1, p0

    .line 121
    move-object v7, p2

    .line 122
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/capture/d;-><init>(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/w;Lio/sentry/android/replay/d0;Lgn2;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v8, v0, p1}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object p0, v1, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 129
    .line 130
    invoke-interface {p0, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 131
    .line 132
    .line 133
    return-void
.end method

.class public final Lio/sentry/android/replay/capture/m;
.super Lio/sentry/android/replay/capture/c;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final v:Lio/sentry/s6;

.field public final w:Lio/sentry/i1;

.field public final x:Lio/sentry/transport/f;


# direct methods
.method public constructor <init>(Lio/sentry/s6;Lio/sentry/i1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V
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
    iput-object p1, p0, Lio/sentry/android/replay/capture/m;->v:Lio/sentry/s6;

    .line 17
    .line 18
    iput-object p2, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 19
    .line 20
    iput-object p3, p0, Lio/sentry/android/replay/capture/m;->x:Lio/sentry/transport/f;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Lgn2;Z)V
    .locals 3

    .line 1
    iget-object p1, p0, Lio/sentry/android/replay/capture/m;->v:Lio/sentry/s6;

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lio/sentry/w6;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "Replay is already running in \'session\' mode, not capturing for event"

    .line 21
    .line 22
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final g(Lio/sentry/android/replay/d0;)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/capture/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/l;-><init>(Lio/sentry/android/replay/capture/m;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "onConfigurationChanged"

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/m;->p(Ljava/lang/String;Lgn2;)V

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
    .locals 8

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->f()Lio/sentry/android/replay/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    iget-object v0, p0, Lio/sentry/android/replay/capture/m;->x:Lio/sentry/transport/f;

    .line 6
    .line 7
    invoke-interface {v0}, Lio/sentry/transport/f;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    new-instance v7, Lio/sentry/android/replay/util/h;

    .line 12
    .line 13
    new-instance v0, Lix0;

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    invoke-direct/range {v0 .. v6}, Lix0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    const-string p0, "SessionCaptureStrategy.add_frame"

    .line 22
    .line 23
    invoke-direct {v7, v0, p0}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, v1, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    invoke-interface {p0, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/capture/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/l;-><init>(Lio/sentry/android/replay/capture/m;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "pause"

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/m;->p(Ljava/lang/String;Lgn2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final n(ILio/sentry/protocol/w;Lio/sentry/t6;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Lio/sentry/android/replay/capture/c;->n(ILio/sentry/protocol/w;Lio/sentry/t6;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p2, Lj78;

    .line 12
    .line 13
    const/16 p3, 0x16

    .line 14
    .line 15
    invoke-direct {p2, p0, p3}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p2}, Lio/sentry/i1;->o(Lio/sentry/l4;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/l;->m()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    new-instance v1, Li79;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v1, p0, v0, v2}, Li79;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    const-string v0, "stop"

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lio/sentry/android/replay/capture/m;->p(Ljava/lang/String;Lgn2;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v1, Lio/sentry/c2;

    .line 27
    .line 28
    const/16 v2, 0x1b

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lio/sentry/c2;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Lio/sentry/i1;->o(Lio/sentry/l4;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance v0, Lio/sentry/android/replay/util/h;

    .line 37
    .line 38
    new-instance v1, Lio/sentry/android/core/internal/modules/a;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v1, p0, v2}, Lio/sentry/android/core/internal/modules/a;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    const-string v2, "CaptureStrategy.stop"

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 50
    .line 51
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final p(Ljava/lang/String;Lgn2;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->f()Lio/sentry/android/replay/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    if-nez v5, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/android/replay/capture/m;->v:Lio/sentry/s6;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

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
    iget-object v0, p0, Lio/sentry/android/replay/capture/m;->x:Lio/sentry/transport/f;

    .line 29
    .line 30
    invoke-interface {v0}, Lio/sentry/transport/f;->d()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v7, Lio/sentry/android/replay/util/h;

    .line 39
    .line 40
    const-string v0, "SessionCaptureStrategy."

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Lug0;

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    move-object v6, p2

    .line 50
    invoke-direct/range {v0 .. v6}, Lug0;-><init>(Lio/sentry/android/replay/capture/m;JLio/sentry/protocol/w;Lio/sentry/android/replay/d0;Lgn2;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v7, v0, p1}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, v1, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 57
    .line 58
    invoke-interface {p0, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 59
    .line 60
    .line 61
    return-void
.end method

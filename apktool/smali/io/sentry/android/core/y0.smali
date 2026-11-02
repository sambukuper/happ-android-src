.class public final Lio/sentry/android/core/y0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/android/core/d0;


# instance fields
.field public final X:Ljava/util/concurrent/atomic/AtomicLong;

.field public final Y:J

.field public Z:Ljava/util/concurrent/Future;

.field public final f0:Lio/sentry/util/a;

.field public final g0:Z

.field public final h0:Z


# direct methods
.method public constructor <init>(JZZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/sentry/android/core/y0;->X:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    new-instance v0, Lio/sentry/util/a;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/sentry/android/core/y0;->f0:Lio/sentry/util/a;

    .line 19
    .line 20
    iput-wide p1, p0, Lio/sentry/android/core/y0;->Y:J

    .line 21
    .line 22
    iput-boolean p3, p0, Lio/sentry/android/core/y0;->g0:Z

    .line 23
    .line 24
    iput-boolean p4, p0, Lio/sentry/android/core/y0;->h0:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Lio/sentry/android/core/y0;->h0:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lio/sentry/g;

    .line 6
    .line 7
    invoke-direct {p0}, Lio/sentry/g;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v0, "navigation"

    .line 11
    .line 12
    iput-object v0, p0, Lio/sentry/g;->g0:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "state"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lio/sentry/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p1, "app.lifecycle"

    .line 20
    .line 21
    iput-object p1, p0, Lio/sentry/g;->i0:Ljava/lang/String;

    .line 22
    .line 23
    sget-object p1, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 24
    .line 25
    iput-object p1, p0, Lio/sentry/g;->k0:Lio/sentry/s5;

    .line 26
    .line 27
    new-instance p1, Lio/sentry/n0;

    .line 28
    .line 29
    invoke-direct {p1}, Lio/sentry/n0;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0, p0, p1}, Lio/sentry/i1;->a(Lio/sentry/g;Lio/sentry/n0;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/y0;->f0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/y0;->Z:Ljava/util/concurrent/Future;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lio/sentry/android/core/y0;->Z:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_2
    throw p0
.end method

.method public final g()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/y0;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    new-instance v2, Lj78;

    .line 9
    .line 10
    const/16 v3, 0xe

    .line 11
    .line 12
    invoke-direct {v2, p0, v3}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3, v2}, Lio/sentry/i1;->o(Lio/sentry/l4;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lio/sentry/android/core/y0;->X:Ljava/util/concurrent/atomic/AtomicLong;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    cmp-long v5, v3, v5

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    iget-wide v5, p0, Lio/sentry/android/core/y0;->Y:J

    .line 35
    .line 36
    add-long/2addr v3, v5

    .line 37
    cmp-long v3, v3, v0

    .line 38
    .line 39
    if-gtz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v3, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 45
    :goto_1
    if-eqz v3, :cond_2

    .line 46
    .line 47
    iget-boolean v4, p0, Lio/sentry/android/core/y0;->g0:Z

    .line 48
    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v4}, Lio/sentry/i1;->l()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Lio/sentry/s6;->getReplayController()Lio/sentry/d4;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v4, v3}, Lio/sentry/d4;->m(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 74
    .line 75
    .line 76
    const-string v0, "foreground"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lio/sentry/android/core/y0;->a(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final k()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lio/sentry/android/core/y0;->X:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lio/sentry/s6;->getReplayController()Lio/sentry/d4;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Lio/sentry/d4;->D()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/android/core/y0;->f0:Lio/sentry/util/a;

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/y0;->b()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lfl6;

    .line 34
    .line 35
    const/16 v2, 0x18

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, Lfl6;-><init>(Ljava/lang/Object;B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Lio/sentry/s6;->getTimerExecutorService()Lio/sentry/m1;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-wide v3, p0, Lio/sentry/android/core/y0;->Y:J

    .line 53
    .line 54
    invoke-interface {v2, v1, v3, v4}, Lio/sentry/m1;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, p0, Lio/sentry/android/core/y0;->Z:Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v2

    .line 62
    :try_start_2
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v3}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    sget-object v4, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 75
    .line 76
    const-string v5, "Failed to schedule end of session. Ending it now."

    .line 77
    .line 78
    invoke-interface {v3, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lfl6;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    .line 83
    .line 84
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 85
    .line 86
    .line 87
    const-string v0, "background"

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lio/sentry/android/core/y0;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :catchall_1
    move-exception p0

    .line 94
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_2
    move-exception v0

    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    throw p0
.end method

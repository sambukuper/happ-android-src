.class public final Lio/sentry/android/replay/q;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:Lio/sentry/android/replay/ReplayIntegration;

.field public final synthetic Y:J

.field public final synthetic Z:Lio/sentry/protocol/w;

.field public final synthetic f0:Lea6;

.field public final synthetic g0:Ljava/util/Date;


# direct methods
.method public constructor <init>(Lio/sentry/android/replay/ReplayIntegration;JLio/sentry/protocol/w;Lea6;Ljava/util/Date;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/q;->X:Lio/sentry/android/replay/ReplayIntegration;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/android/replay/q;->Y:J

    .line 7
    .line 8
    iput-object p4, p0, Lio/sentry/android/replay/q;->Z:Lio/sentry/protocol/w;

    .line 9
    .line 10
    iput-object p5, p0, Lio/sentry/android/replay/q;->f0:Lea6;

    .line 11
    .line 12
    iput-object p6, p0, Lio/sentry/android/replay/q;->g0:Ljava/util/Date;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/q;->X:Lio/sentry/android/replay/ReplayIntegration;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->q0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/sentry/android/replay/p;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lio/sentry/android/replay/q;->Z:Lio/sentry/protocol/w;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/android/replay/p;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-wide v2, v0, Lio/sentry/android/replay/p;->a:J

    .line 26
    .line 27
    iget-wide v4, p0, Lio/sentry/android/replay/q;->Y:J

    .line 28
    .line 29
    cmp-long v2, v2, v4

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    iget-object v2, v0, Lio/sentry/android/replay/p;->c:Lio/sentry/protocol/w;

    .line 34
    .line 35
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lio/sentry/android/replay/p;->d:Lio/sentry/android/replay/capture/c;

    .line 42
    .line 43
    iget-object v1, p0, Lio/sentry/android/replay/q;->f0:Lea6;

    .line 44
    .line 45
    iget-object v2, v1, Lea6;->X:Ljava/lang/Object;

    .line 46
    .line 47
    if-ne v0, v2, :cond_1

    .line 48
    .line 49
    check-cast v2, Lio/sentry/android/replay/capture/c;

    .line 50
    .line 51
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/c;->e()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v1, Lea6;->X:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lio/sentry/android/replay/capture/c;

    .line 63
    .line 64
    iget-object p0, p0, Lio/sentry/android/replay/q;->g0:Ljava/util/Date;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, v1, Lea6;->X:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lio/sentry/android/replay/capture/c;

    .line 72
    .line 73
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->p:Lio/sentry/android/replay/capture/a;

    .line 74
    .line 75
    sget-object v0, Lio/sentry/android/replay/capture/c;->u:[Lnw3;

    .line 76
    .line 77
    const/4 v1, 0x6

    .line 78
    aget-object v0, v0, v1

    .line 79
    .line 80
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_1

    .line 99
    .line 100
    new-instance v2, Lo76;

    .line 101
    .line 102
    iget-object v3, p0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/android/replay/capture/c;

    .line 103
    .line 104
    const/4 v4, 0x4

    .line 105
    invoke-direct {v2, v0, v1, v3, v4}, Lo76;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lio/sentry/android/replay/capture/a;->c:Lio/sentry/android/replay/capture/c;

    .line 109
    .line 110
    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/s6;

    .line 111
    .line 112
    invoke-virtual {v0}, Lio/sentry/s6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_0

    .line 121
    .line 122
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 123
    .line 124
    new-instance v0, Lio/sentry/android/replay/util/h;

    .line 125
    .line 126
    new-instance v1, Lio/sentry/t2;

    .line 127
    .line 128
    invoke-direct {v1, v2, v4}, Lio/sentry/t2;-><init>(Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    const-string v2, "CaptureStrategy.runInBackground"

    .line 132
    .line 133
    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Lo76;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 150
    .line 151
    const-string v2, "Failed to execute task CaptureStrategy.runInBackground"

    .line 152
    .line 153
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    :cond_1
    return-void
.end method

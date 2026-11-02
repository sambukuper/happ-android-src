.class public final Lio/sentry/android/core/p0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/i0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/android/core/n0;

.field public final c:Lio/sentry/android/core/SentryAndroidOptions;

.field public final d:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/n0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/p0;->a:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Lio/sentry/android/core/p0;->b:Lio/sentry/android/core/n0;

    .line 16
    .line 17
    iput-object p3, p0, Lio/sentry/android/core/p0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 18
    .line 19
    new-instance p1, Lio/sentry/android/core/o0;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    new-instance p2, Li82;

    .line 29
    .line 30
    const/4 v0, 0x6

    .line 31
    invoke-direct {p2, p0, p3, v0}, Li82;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 35
    .line 36
    .line 37
    move-result-object p2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p2

    .line 40
    invoke-virtual {p3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 45
    .line 46
    const-string v1, "Device info caching task rejected."

    .line 47
    .line 48
    invoke-interface {p3, v0, v1, p2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    :goto_0
    iput-object p2, p0, Lio/sentry/android/core/p0;->d:Ljava/util/concurrent/Future;

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/u6;Lio/sentry/n0;)Lio/sentry/u6;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/p0;->f(Lio/sentry/y4;Lio/sentry/n0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/p0;->d(Lio/sentry/y4;Lio/sentry/n0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/p0;->e(Lio/sentry/y4;ZZ)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final b(Lio/sentry/j5;Lio/sentry/n0;)Lio/sentry/j5;
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/p0;->f(Lio/sentry/y4;Lio/sentry/n0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/p0;->d(Lio/sentry/y4;Lio/sentry/n0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/j5;->e()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-static {p2}, Lio/sentry/util/b;->l(Lio/sentry/n0;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, Lio/sentry/j5;->e()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lio/sentry/protocol/e0;

    .line 40
    .line 41
    sget-object v4, Lio/sentry/android/core/internal/util/f;->a:Lio/sentry/android/core/internal/util/f;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v4, v3, Lio/sentry/protocol/e0;->X:Ljava/lang/Long;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v6}, Lio/sentry/android/core/internal/util/f;->d(Ljava/lang/Thread;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    cmp-long v4, v6, v4

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    move v4, v1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const/4 v4, 0x0

    .line 73
    :goto_1
    iget-object v5, v3, Lio/sentry/protocol/e0;->h0:Ljava/lang/Boolean;

    .line 74
    .line 75
    if-nez v5, :cond_2

    .line 76
    .line 77
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iput-object v5, v3, Lio/sentry/protocol/e0;->h0:Ljava/lang/Boolean;

    .line 82
    .line 83
    :cond_2
    if-nez p2, :cond_0

    .line 84
    .line 85
    iget-object v5, v3, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 86
    .line 87
    if-nez v5, :cond_0

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iput-object v4, v3, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {p0, p1, v1, v0}, Lio/sentry/android/core/p0;->e(Lio/sentry/y4;ZZ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lio/sentry/j5;->d()Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-le p2, v1, :cond_5

    .line 110
    .line 111
    invoke-static {v1, p0}, Loi0;->h(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, Lio/sentry/protocol/v;

    .line 116
    .line 117
    const-string v0, "java.lang"

    .line 118
    .line 119
    iget-object v1, p2, Lio/sentry/protocol/v;->Z:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    iget-object p2, p2, Lio/sentry/protocol/v;->g0:Lio/sentry/protocol/c0;

    .line 128
    .line 129
    if-eqz p2, :cond_5

    .line 130
    .line 131
    iget-object p2, p2, Lio/sentry/protocol/c0;->X:Ljava/util/List;

    .line 132
    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lio/sentry/protocol/a0;

    .line 150
    .line 151
    const-string v1, "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"

    .line 152
    .line 153
    iget-object v0, v0, Lio/sentry/protocol/a0;->h0:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    return-object p1
.end method

.method public final c(Lio/sentry/protocol/f0;Lio/sentry/n0;)Lio/sentry/protocol/f0;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/p0;->f(Lio/sentry/y4;Lio/sentry/n0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/p0;->d(Lio/sentry/y4;Lio/sentry/n0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/p0;->e(Lio/sentry/y4;ZZ)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final d(Lio/sentry/y4;Lio/sentry/n0;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lio/sentry/y4;->Y:Lio/sentry/protocol/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/protocol/e;->e()Lio/sentry/protocol/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/sentry/protocol/a;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/p0;->a:Landroid/content/Context;

    .line 15
    .line 16
    sget-object v2, Lio/sentry/android/core/m0;->c:Lf51;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Lf51;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    iput-object v1, v0, Lio/sentry/protocol/a;->g0:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p0, Lio/sentry/android/core/p0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->c()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->b()Lio/sentry/x5;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    move-object v4, v3

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-wide v1, v1, Lio/sentry/x5;->X:J

    .line 52
    .line 53
    long-to-double v1, v1

    .line 54
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    div-double/2addr v1, v4

    .line 60
    double-to-long v1, v1

    .line 61
    new-instance v4, Ljava/util/Date;

    .line 62
    .line 63
    invoke-direct {v4, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 64
    .line 65
    .line 66
    :goto_0
    iput-object v4, v0, Lio/sentry/protocol/a;->Y:Ljava/util/Date;

    .line 67
    .line 68
    :cond_2
    invoke-static {p2}, Lio/sentry/util/b;->l(Lio/sentry/n0;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    iget-object p2, v0, Lio/sentry/protocol/a;->m0:Ljava/lang/Boolean;

    .line 75
    .line 76
    if-nez p2, :cond_3

    .line 77
    .line 78
    sget-object p2, Lio/sentry/android/core/g0;->g0:Lio/sentry/android/core/g0;

    .line 79
    .line 80
    iget-object p2, p2, Lio/sentry/android/core/g0;->f0:Ljava/lang/Boolean;

    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    xor-int/lit8 p2, p2, 0x1

    .line 89
    .line 90
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, v0, Lio/sentry/protocol/a;->m0:Ljava/lang/Boolean;

    .line 95
    .line 96
    :cond_3
    iget-object p2, p0, Lio/sentry/android/core/p0;->a:Landroid/content/Context;

    .line 97
    .line 98
    iget-object v1, p0, Lio/sentry/android/core/p0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 99
    .line 100
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v4, p0, Lio/sentry/android/core/p0;->b:Lio/sentry/android/core/n0;

    .line 105
    .line 106
    invoke-static {p2, v2, v4}, Lio/sentry/android/core/m0;->c(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/n0;)Landroid/content/pm/PackageInfo;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    if-eqz p2, :cond_8

    .line 111
    .line 112
    invoke-static {p2, v4}, Lio/sentry/android/core/m0;->e(Landroid/content/pm/PackageInfo;Lio/sentry/android/core/n0;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object v5, p1, Lio/sentry/y4;->n0:Ljava/lang/String;

    .line 117
    .line 118
    if-nez v5, :cond_4

    .line 119
    .line 120
    iput-object v2, p1, Lio/sentry/y4;->n0:Ljava/lang/String;

    .line 121
    .line 122
    :cond_4
    iget-object p0, p0, Lio/sentry/android/core/p0;->d:Ljava/util/concurrent/Future;

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    const-string v5, "Failed to retrieve device info"

    .line 126
    .line 127
    if-eqz p0, :cond_5

    .line 128
    .line 129
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lio/sentry/android/core/r0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    move-object v3, p0

    .line 136
    goto :goto_1

    .line 137
    :catchall_0
    move-exception p0

    .line 138
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    sget-object v6, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 143
    .line 144
    invoke-interface {v1, v6, v5, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 153
    .line 154
    new-array v6, v2, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-interface {p0, v1, v5, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    iget-object p0, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 160
    .line 161
    iput-object p0, v0, Lio/sentry/protocol/a;->X:Ljava/lang/String;

    .line 162
    .line 163
    iget-object p0, p2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 164
    .line 165
    iput-object p0, v0, Lio/sentry/protocol/a;->h0:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {p2, v4}, Lio/sentry/android/core/m0;->e(Landroid/content/pm/PackageInfo;Lio/sentry/android/core/n0;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    iput-object p0, v0, Lio/sentry/protocol/a;->i0:Ljava/lang/String;

    .line 172
    .line 173
    new-instance p0, Ljava/util/HashMap;

    .line 174
    .line 175
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 176
    .line 177
    .line 178
    iget-object v1, p2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 179
    .line 180
    iget-object p2, p2, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 181
    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    array-length v4, v1

    .line 185
    if-lez v4, :cond_7

    .line 186
    .line 187
    if-eqz p2, :cond_7

    .line 188
    .line 189
    array-length v4, p2

    .line 190
    if-lez v4, :cond_7

    .line 191
    .line 192
    :goto_2
    array-length v4, v1

    .line 193
    if-ge v2, v4, :cond_7

    .line 194
    .line 195
    aget-object v4, v1, v2

    .line 196
    .line 197
    const/16 v5, 0x2e

    .line 198
    .line 199
    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    add-int/lit8 v5, v5, 0x1

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    aget v5, p2, v2

    .line 210
    .line 211
    const/4 v6, 0x2

    .line 212
    and-int/2addr v5, v6

    .line 213
    if-ne v5, v6, :cond_6

    .line 214
    .line 215
    const-string v5, "granted"

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_6
    const-string v5, "not_granted"

    .line 219
    .line 220
    :goto_3
    invoke-virtual {p0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    add-int/lit8 v2, v2, 0x1

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_7
    iput-object p0, v0, Lio/sentry/protocol/a;->j0:Ljava/util/AbstractMap;

    .line 227
    .line 228
    if-eqz v3, :cond_8

    .line 229
    .line 230
    :try_start_1
    iget-object p0, v3, Lio/sentry/android/core/r0;->f:Lh70;

    .line 231
    .line 232
    if-eqz p0, :cond_8

    .line 233
    .line 234
    iget-boolean p2, p0, Lh70;->Y:Z

    .line 235
    .line 236
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    iput-object p2, v0, Lio/sentry/protocol/a;->n0:Ljava/lang/Boolean;

    .line 241
    .line 242
    iget-object p0, p0, Lh70;->Z:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, [Ljava/lang/String;

    .line 245
    .line 246
    if-eqz p0, :cond_8

    .line 247
    .line 248
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    iput-object p0, v0, Lio/sentry/protocol/a;->o0:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 253
    .line 254
    :catchall_1
    :cond_8
    iget-object p0, p1, Lio/sentry/y4;->Y:Lio/sentry/protocol/e;

    .line 255
    .line 256
    invoke-virtual {p0, v0}, Lio/sentry/protocol/e;->o(Lio/sentry/protocol/a;)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public final e(Lio/sentry/y4;ZZ)V
    .locals 7

    .line 1
    iget-object v0, p1, Lio/sentry/y4;->k0:Lio/sentry/protocol/i0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/sentry/protocol/i0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p1, Lio/sentry/y4;->k0:Lio/sentry/protocol/i0;

    .line 11
    .line 12
    :cond_0
    iget-object v1, v0, Lio/sentry/protocol/i0;->Y:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/android/core/p0;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1}, Lio/sentry/android/core/x0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, v0, Lio/sentry/protocol/i0;->Y:Ljava/lang/String;

    .line 23
    .line 24
    :cond_1
    iget-object v1, v0, Lio/sentry/protocol/i0;->f0:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p0, Lio/sentry/android/core/p0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2}, Lio/sentry/s6;->getDataCollectionResolver()Lio/sentry/r;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Lio/sentry/r;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const-string v1, "{{auto}}"

    .line 41
    .line 42
    iput-object v1, v0, Lio/sentry/protocol/i0;->f0:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    iget-object v0, p1, Lio/sentry/y4;->Y:Lio/sentry/protocol/e;

    .line 45
    .line 46
    invoke-virtual {v0}, Lio/sentry/protocol/e;->f()Lio/sentry/protocol/h;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v3, "Failed to retrieve device info"

    .line 51
    .line 52
    iget-object p0, p0, Lio/sentry/android/core/p0;->d:Ljava/util/concurrent/Future;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    if-nez v1, :cond_6

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lio/sentry/android/core/r0;

    .line 64
    .line 65
    invoke-virtual {v1, p2, p3}, Lio/sentry/android/core/r0;->a(ZZ)Lio/sentry/protocol/h;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {v0, p2}, Lio/sentry/protocol/e;->q(Lio/sentry/protocol/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p2

    .line 74
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 79
    .line 80
    invoke-interface {p3, v1, v3, p2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    sget-object p3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 89
    .line 90
    new-array v1, v4, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {p2, p3, v3, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-virtual {v0}, Lio/sentry/protocol/e;->h()Lio/sentry/protocol/q;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    if-eqz p0, :cond_4

    .line 100
    .line 101
    :try_start_1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    check-cast p3, Lio/sentry/android/core/r0;

    .line 106
    .line 107
    iget-object p3, p3, Lio/sentry/android/core/r0;->g:Lio/sentry/protocol/q;

    .line 108
    .line 109
    invoke-virtual {v0, p3}, Lio/sentry/protocol/e;->t(Lio/sentry/protocol/q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_1
    move-exception p3

    .line 114
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v5, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 119
    .line 120
    const-string v6, "Failed to retrieve os system"

    .line 121
    .line 122
    invoke-interface {v1, v5, v6, p3}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 131
    .line 132
    new-array v5, v4, [Ljava/lang/Object;

    .line 133
    .line 134
    invoke-interface {p3, v1, v3, v5}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    if-eqz p2, :cond_6

    .line 138
    .line 139
    iget-object p3, p2, Lio/sentry/protocol/q;->X:Ljava/lang/String;

    .line 140
    .line 141
    if-eqz p3, :cond_5

    .line 142
    .line 143
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_5

    .line 148
    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v5, "os_"

    .line 152
    .line 153
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 161
    .line 162
    invoke-virtual {p3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    goto :goto_2

    .line 174
    :cond_5
    const-string p3, "os_1"

    .line 175
    .line 176
    :goto_2
    invoke-virtual {v0, p2, p3}, Lio/sentry/protocol/e;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    :cond_6
    if-eqz p0, :cond_8

    .line 180
    .line 181
    :try_start_2
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, Lio/sentry/android/core/r0;

    .line 186
    .line 187
    iget-object p0, p0, Lio/sentry/android/core/r0;->e:Lrl6;

    .line 188
    .line 189
    if-eqz p0, :cond_9

    .line 190
    .line 191
    new-instance p2, Ljava/util/HashMap;

    .line 192
    .line 193
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string p3, "isSideLoaded"

    .line 197
    .line 198
    iget-boolean v0, p0, Lrl6;->a:Z

    .line 199
    .line 200
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {p2, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    iget-object p0, p0, Lrl6;->b:Ljava/lang/String;

    .line 208
    .line 209
    if-eqz p0, :cond_7

    .line 210
    .line 211
    const-string p3, "installerStore"

    .line 212
    .line 213
    invoke-virtual {p2, p3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    :cond_7
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    if-eqz p2, :cond_9

    .line 229
    .line 230
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    check-cast p2, Ljava/util/Map$Entry;

    .line 235
    .line 236
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    check-cast p3, Ljava/lang/String;

    .line 241
    .line 242
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    check-cast p2, Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {p1, p3, p2}, Lio/sentry/y4;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :catchall_2
    move-exception p0

    .line 253
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    sget-object p2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 258
    .line 259
    const-string p3, "Error getting side loaded info."

    .line 260
    .line 261
    invoke-interface {p1, p2, p3, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    sget-object p1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 270
    .line 271
    new-array p2, v4, [Ljava/lang/Object;

    .line 272
    .line 273
    invoke-interface {p0, p1, v3, p2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_9
    :goto_4
    return-void
.end method

.method public final f(Lio/sentry/y4;Lio/sentry/n0;)Z
    .locals 1

    .line 1
    invoke-static {p2}, Lio/sentry/util/b;->u(Lio/sentry/n0;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lio/sentry/android/core/p0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 16
    .line 17
    iget-object p1, p1, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "Event was cached so not applying data relevant to the current app execution/version: %s"

    .line 24
    .line 25
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0
.end method

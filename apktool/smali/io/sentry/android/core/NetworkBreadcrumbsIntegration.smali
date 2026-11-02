.class public final Lio/sentry/android/core/NetworkBreadcrumbsIntegration;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/y1;
.implements Ljava/io/Closeable;


# instance fields
.field public final X:Landroid/content/Context;

.field public final Y:Lio/sentry/android/core/n0;

.field public final Z:Lio/sentry/util/a;

.field public volatile f0:Lio/sentry/android/core/f1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/n0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->Z:Lio/sentry/util/a;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->X:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->Y:Lio/sentry/android/core/n0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final R(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "NetworkBreadcrumbsIntegration enabled: %s"

    .line 20
    .line 21
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->Z:Lio/sentry/util/a;

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 33
    .line 34
    .line 35
    :try_start_0
    new-instance v2, Lio/sentry/android/core/f1;

    .line 36
    .line 37
    iget-object v3, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->Y:Lio/sentry/android/core/n0;

    .line 38
    .line 39
    invoke-virtual {p1}, Lio/sentry/s6;->getDateProvider()Lio/sentry/b5;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-direct {v2, v3, v4}, Lio/sentry/android/core/f1;-><init>(Lio/sentry/android/core/n0;Lio/sentry/b5;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->f0:Lio/sentry/android/core/f1;

    .line 47
    .line 48
    iget-object v2, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->X:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object p0, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->f0:Lio/sentry/android/core/f1;

    .line 55
    .line 56
    sget-object v4, Lio/sentry/android/core/internal/util/c;->n0:Lio/sentry/util/a;

    .line 57
    .line 58
    invoke-static {v2}, Lio/sentry/config/a;->n(Landroid/content/Context;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v4, 0x0

    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    sget-object p0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 66
    .line 67
    const-string v2, "No permission (ACCESS_NETWORK_STATE) to check network status."

    .line 68
    .line 69
    new-array v5, v4, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-interface {v3, p0, v2, v5}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move p0, v4

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    sget-object v2, Lio/sentry/android/core/internal/util/c;->p0:Lio/sentry/util/a;

    .line 77
    .line 78
    invoke-virtual {v2}, Lio/sentry/util/a;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    :try_start_1
    sget-object v3, Lio/sentry/android/core/internal/util/c;->q0:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    .line 85
    .line 86
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x1

    .line 90
    :goto_0
    if-eqz p0, :cond_1

    .line 91
    .line 92
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    const-string p1, "NetworkBreadcrumbsIntegration installed."

    .line 97
    .line 98
    new-array v2, v4, [Ljava/lang/Object;

    .line 99
    .line 100
    invoke-interface {p0, v1, p1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const-string p0, "NetworkBreadcrumbs"

    .line 104
    .line 105
    invoke-static {p0}, Lio/sentry/util/b;->a(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_3

    .line 111
    :cond_1
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const-string p1, "NetworkBreadcrumbsIntegration not installed."

    .line 116
    .line 117
    new-array v2, v4, [Ljava/lang/Object;

    .line 118
    .line 119
    invoke-interface {p0, v1, p1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    .line 122
    :goto_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    :try_start_3
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :catchall_2
    move-exception p1

    .line 132
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    :goto_3
    :try_start_5
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :catchall_3
    move-exception p1

    .line 141
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    :goto_4
    throw p0

    .line 145
    :cond_2
    return-void
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->Z:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->f0:Lio/sentry/android/core/f1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, p0, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;->f0:Lio/sentry/android/core/f1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 12
    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object p0, Lio/sentry/android/core/internal/util/c;->p0:Lio/sentry/util/a;

    .line 17
    .line 18
    invoke-virtual {p0}, Lio/sentry/util/a;->g()V

    .line 19
    .line 20
    .line 21
    :try_start_1
    sget-object v0, Lio/sentry/android/core/internal/util/c;->q0:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_2
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    throw v0

    .line 40
    :cond_0
    return-void

    .line 41
    :catchall_2
    move-exception p0

    .line 42
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_3
    move-exception v0

    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    throw p0
.end method

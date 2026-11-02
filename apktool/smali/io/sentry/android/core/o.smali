.class public final synthetic Lio/sentry/android/core/o;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/util/f;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lio/sentry/android/core/o;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/core/o;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lio/sentry/android/core/o;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/android/core/o;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/s6;->getExecutorService()Lio/sentry/m1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    sget-object v0, Lio/sentry/android/core/cache/b;->m0:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/sentry/s6;->getOutboxPath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 27
    .line 28
    const-string v2, "Outbox path is null, the startup crash marker file does not exist"

    .line 29
    .line 30
    new-array v3, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {p0, v0, v2, v3}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 37
    .line 38
    const-string v3, "startup_crash"

    .line 39
    .line 40
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    sget-object v4, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 60
    .line 61
    const-string v5, "Failed to delete the startup crash marker file. %s."

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v3, v4, v5, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    :cond_1
    move v1, v0

    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 82
    .line 83
    const-string v3, "Error reading/deleting the startup crash marker file on the disk"

    .line 84
    .line 85
    invoke-interface {p0, v2, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/s6;->getExecutorService()Lio/sentry/m1;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/s6;->getExecutorService()Lio/sentry/m1;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

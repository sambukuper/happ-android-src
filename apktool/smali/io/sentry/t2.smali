.class public final Lio/sentry/t2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lio/sentry/t2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/t2;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, Lio/sentry/t2;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/t2;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lio/sentry/android/replay/capture/b;

    .line 9
    .line 10
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/b;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lio/sentry/android/replay/capture/b;

    .line 15
    .line 16
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/b;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p0, Lio/sentry/android/replay/capture/b;

    .line 21
    .line 22
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/b;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p0, Lo76;

    .line 27
    .line 28
    invoke-virtual {p0}, Lo76;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_3
    check-cast p0, Lo76;

    .line 33
    .line 34
    invoke-virtual {p0}, Lo76;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_4
    check-cast p0, Lo76;

    .line 39
    .line 40
    invoke-virtual {p0}, Lo76;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_5
    check-cast p0, Lo76;

    .line 45
    .line 46
    invoke-virtual {p0}, Lo76;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_6
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 51
    .line 52
    invoke-virtual {p0}, Lio/sentry/s6;->getCacheDirPath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v2, "Cache dir is not set, not moving the previous session."

    .line 68
    .line 69
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p0}, Lio/sentry/s6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    instance-of v1, p0, Lio/sentry/cache/c;

    .line 78
    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    sget-object v1, Lio/sentry/cache/c;->k0:Ljava/nio/charset/Charset;

    .line 82
    .line 83
    new-instance v1, Ljava/io/File;

    .line 84
    .line 85
    const-string v2, "session.json"

    .line 86
    .line 87
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/io/File;

    .line 91
    .line 92
    const-string v3, "previous_session.json"

    .line 93
    .line 94
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    check-cast p0, Lio/sentry/cache/c;

    .line 98
    .line 99
    invoke-virtual {p0, v1, v2}, Lio/sentry/cache/c;->c(Ljava/io/File;Ljava/io/File;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lio/sentry/cache/c;->g0:Ljava/util/concurrent/CountDownLatch;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 105
    .line 106
    .line 107
    :cond_1
    :goto_0
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

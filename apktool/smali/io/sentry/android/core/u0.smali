.class public final Lio/sentry/android/core/u0;
.super Landroid/os/FileObserver;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lio/sentry/s3;

.field public final c:Lio/sentry/ILogger;

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/sentry/s3;Lio/sentry/ILogger;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/u0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/u0;->b:Lio/sentry/s3;

    .line 7
    .line 8
    const-string p1, "Logger is required."

    .line 9
    .line 10
    invoke-static {p3, p1}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Lio/sentry/android/core/u0;->c:Lio/sentry/ILogger;

    .line 14
    .line 15
    iput-wide p4, p0, Lio/sentry/android/core/u0;->d:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final onEvent(ILjava/lang/String;)V
    .locals 5

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, Lio/sentry/android/core/u0;->a:Ljava/lang/String;

    .line 15
    .line 16
    filled-new-array {p1, v1, p2}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v2, p0, Lio/sentry/android/core/u0;->c:Lio/sentry/ILogger;

    .line 21
    .line 22
    const-string v3, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s."

    .line 23
    .line 24
    invoke-interface {v2, v0, v3, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lio/sentry/android/core/t0;

    .line 28
    .line 29
    iget-wide v3, p0, Lio/sentry/android/core/u0;->d:J

    .line 30
    .line 31
    invoke-direct {p1, v3, v4, v2}, Lio/sentry/android/core/t0;-><init>(JLio/sentry/ILogger;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lio/sentry/util/b;->f(Ljava/lang/Object;)Lio/sentry/n0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v1, p2}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v0, Ljava/io/File;

    .line 50
    .line 51
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lio/sentry/android/core/u0;->b:Lio/sentry/s3;

    .line 55
    .line 56
    invoke-virtual {p0, v0, p1}, Lio/sentry/s3;->b(Ljava/io/File;Lio/sentry/n0;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method

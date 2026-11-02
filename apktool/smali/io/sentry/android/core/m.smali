.class public final Lio/sentry/android/core/m;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/e1;


# virtual methods
.method public final a(Lio/sentry/t3;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Runtime;->totalMemory()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Runtime;->freeMemory()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    sub-long/2addr v0, v2

    .line 18
    invoke-static {}, Landroid/os/Debug;->getNativeHeapSize()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-static {}, Landroid/os/Debug;->getNativeHeapFreeSize()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    sub-long/2addr v2, v4

    .line 27
    iput-wide v0, p1, Lio/sentry/t3;->c:J

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    iput-boolean p0, p1, Lio/sentry/t3;->d:Z

    .line 31
    .line 32
    iput-wide v2, p1, Lio/sentry/t3;->e:J

    .line 33
    .line 34
    iput-boolean p0, p1, Lio/sentry/t3;->f:Z

    .line 35
    .line 36
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

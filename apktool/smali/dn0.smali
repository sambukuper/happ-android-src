.class public final Ldn0;
.super Lxg0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final d(II)V
    .locals 1

    .line 1
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lv7;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Lv7;-><init>(Ldn0;I)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Llv2;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Llv2;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final e(I)V
    .locals 1

    .line 1
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lv7;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lv7;-><init>(Ldn0;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Llv2;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Llv2;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

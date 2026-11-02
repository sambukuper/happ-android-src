.class public final Lpg3;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ldn2;


# direct methods
.method public synthetic constructor <init>(Ldn2;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lpg3;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lpg3;->i0:Ldn2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lpg3;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lov5;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lpg3;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lpg3;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lpg3;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lb71;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lpg3;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lpg3;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lpg3;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lpg3;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lpg3;->i0:Ldn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lpg3;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Lpg3;->h0:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lpg3;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p1, v1}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 21
    .line 22
    .line 23
    iput-object p2, v0, Lpg3;->h0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lpg3;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lpg3;->i0:Ldn2;

    .line 5
    .line 6
    iget-object p0, p0, Lpg3;->h0:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lov5;

    .line 12
    .line 13
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object v1, Ldn8;->a:Ldn8;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-object v1

    .line 28
    :pswitch_0
    check-cast p0, Lb71;

    .line 29
    .line 30
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Lb71;->getCoroutineContext()Ls61;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :try_start_0
    new-instance v4, Lo98;

    .line 38
    .line 39
    invoke-direct {v4}, Lo98;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Lu70;->Q(Ls61;)Lbm3;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/4 p1, 0x1

    .line 47
    invoke-static {p0, p1, v4}, Lu70;->W(Lbm3;ZLgm3;)Lgq1;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iput-object p0, v4, Lo98;->h0:Lgq1;

    .line 52
    .line 53
    :cond_1
    sget-object v3, Liu;->a:Lsun/misc/Unsafe;

    .line 54
    .line 55
    sget-wide v5, Lo98;->i0:J

    .line 56
    .line 57
    invoke-virtual {v3, v4, v5, v6}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    const/4 p0, 0x2

    .line 64
    if-eq v7, p0, :cond_4

    .line 65
    .line 66
    const/4 p0, 0x3

    .line 67
    if-ne v7, p0, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {v7}, Lo98;->p(I)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_3
    const/4 v8, 0x0

    .line 75
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 76
    .line 77
    .line 78
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    :cond_4
    :goto_1
    :try_start_1
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :try_start_2
    invoke-virtual {v4}, Lo98;->o()V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    invoke-virtual {v4}, Lo98;->o()V

    .line 92
    .line 93
    .line 94
    throw p0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    :catch_0
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 98
    .line 99
    const-string v0, "Blocking call was interrupted due to parent cancellation"

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    throw p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

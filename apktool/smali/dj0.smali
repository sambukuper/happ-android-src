.class public final Ldj0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lej0;


# direct methods
.method public synthetic constructor <init>(Lej0;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ldj0;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Ldj0;->i0:Lej0;

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
    iget-byte v0, p0, Ldj0;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Ldj0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldj0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldj0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ldj0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ldj0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ldj0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Ldj0;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Ldj0;->i0:Lej0;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Ldj0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Ldj0;-><init>(Lej0;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Ldj0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Ldj0;-><init>(Lej0;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Ldj0;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldj0;->i0:Lej0;

    .line 9
    .line 10
    sget-object v3, Lc71;->X:Lc71;

    .line 11
    .line 12
    iget-boolean v4, p0, Ldj0;->h0:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v0, Lej0;->X:Llr8;

    .line 32
    .line 33
    iput-boolean v1, p0, Ldj0;->h0:Z

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Llr8;->e(Luy7;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v3, :cond_2

    .line 40
    .line 41
    move-object v2, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    iget-object p0, v0, Lej0;->f0:Lpr8;

    .line 44
    .line 45
    iget-object p0, p0, Lpr8;->a:Lm51;

    .line 46
    .line 47
    invoke-static {p0, v2}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 48
    .line 49
    .line 50
    sget-object v2, Ldn8;->a:Ldn8;

    .line 51
    .line 52
    :goto_1
    return-object v2

    .line 53
    :pswitch_0
    sget-object v0, Lc71;->X:Lc71;

    .line 54
    .line 55
    iget-boolean v3, p0, Ldj0;->h0:Z

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    if-ne v3, v1, :cond_3

    .line 60
    .line 61
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Ldj0;->i0:Lej0;

    .line 75
    .line 76
    iget-object p1, p1, Lej0;->g0:Lok0;

    .line 77
    .line 78
    new-instance v3, Lvx;

    .line 79
    .line 80
    const/16 v4, 0x8

    .line 81
    .line 82
    invoke-direct {v3, v4}, Lvx;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iget-object v4, p1, Lok0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter v4

    .line 88
    :try_start_0
    iget-boolean v5, p1, Lok0;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    if-eqz v5, :cond_5

    .line 91
    .line 92
    :goto_2
    monitor-exit v4

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    :try_start_1
    const-string v5, "CXCP"

    .line 95
    .line 96
    invoke-static {v5}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    iput-boolean v1, p1, Lok0;->g:Z

    .line 100
    .line 101
    sget-object v5, Lbj0;->Z:Lbj0;

    .line 102
    .line 103
    iput-object v5, p1, Lok0;->e:Lbj0;

    .line 104
    .line 105
    iput-object v3, p1, Lok0;->f:Lvx;

    .line 106
    .line 107
    invoke-virtual {p1, v5, v3}, Lok0;->c(Lbj0;Lvx;)V

    .line 108
    .line 109
    .line 110
    iput-object v2, p1, Lok0;->d:Lqi0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :goto_3
    iget-object p1, p0, Ldj0;->i0:Lej0;

    .line 114
    .line 115
    iget-object p1, p1, Lej0;->X:Llr8;

    .line 116
    .line 117
    iput-boolean v1, p0, Ldj0;->h0:Z

    .line 118
    .line 119
    invoke-virtual {p1, p0}, Llr8;->e(Luy7;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-ne p0, v0, :cond_6

    .line 124
    .line 125
    move-object v2, v0

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    :goto_4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 128
    .line 129
    :goto_5
    return-object v2

    .line 130
    :catchall_0
    move-exception p0

    .line 131
    monitor-exit v4

    .line 132
    throw p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

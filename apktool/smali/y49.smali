.class public final Ly49;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:La59;


# direct methods
.method public synthetic constructor <init>(La59;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ly49;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Ly49;->i0:La59;

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
    iget-byte v0, p0, Ly49;->g0:B

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
    invoke-virtual {p0, p2, p1}, Ly49;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ly49;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ly49;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ly49;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ly49;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ly49;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Ly49;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Ly49;->i0:La59;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Ly49;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Ly49;-><init>(La59;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Ly49;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Ly49;-><init>(La59;Lq51;B)V

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
    .locals 7

    .line 1
    iget-byte v0, p0, Ly49;->g0:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Lc71;->X:Lc71;

    .line 6
    .line 7
    iget-object v3, p0, Ly49;->i0:La59;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Ly49;->h0:Z

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-ne v0, v4, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lr49; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v2, v5

    .line 31
    goto :goto_3

    .line 32
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :try_start_1
    iget-object p1, v3, La59;->l:Ldm3;

    .line 36
    .line 37
    new-instance v0, Ly49;

    .line 38
    .line 39
    invoke-direct {v0, v3, v5, v6}, Ly49;-><init>(La59;Lq51;B)V

    .line 40
    .line 41
    .line 42
    iput-boolean v4, p0, Ly49;->h0:Z

    .line 43
    .line 44
    invoke-static {p1, v0, p0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v2, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    :goto_0
    check-cast p1, Lx49;
    :try_end_1
    .catch Lr49; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    sget p0, Lb59;->a:I

    .line 55
    .line 56
    invoke-static {}, Llh4;->P0()Llh4;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance p1, Lw49;

    .line 64
    .line 65
    invoke-direct {p1, v6}, Lw49;-><init>(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_1
    new-instance p1, Lt49;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :goto_1
    new-instance p1, Lv49;

    .line 76
    .line 77
    iget p0, p0, Lr49;->X:I

    .line 78
    .line 79
    invoke-direct {p1, p0}, Lv49;-><init>(I)V

    .line 80
    .line 81
    .line 82
    :goto_2
    new-instance p0, Laa6;

    .line 83
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v0, v3, La59;->h:Landroidx/work/impl/WorkDatabase;

    .line 88
    .line 89
    new-instance v1, Lj0;

    .line 90
    .line 91
    const/16 v2, 0x12

    .line 92
    .line 93
    invoke-direct {v1, p1, p0, v3, v2}, Lj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lql6;->o(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    iget-boolean p0, p0, Laa6;->X:Z

    .line 100
    .line 101
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :goto_3
    return-object v2

    .line 106
    :pswitch_0
    iget-boolean v0, p0, Ly49;->h0:Z

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    if-ne v0, v4, :cond_3

    .line 111
    .line 112
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_3
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object p1, v5

    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iput-boolean v4, p0, Ly49;->h0:Z

    .line 125
    .line 126
    invoke-virtual {v3, p0}, La59;->d(Ls51;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v2, :cond_5

    .line 131
    .line 132
    move-object p1, v2

    .line 133
    :cond_5
    :goto_4
    return-object p1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

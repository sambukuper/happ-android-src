.class public final Lar6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 13
    iput-byte p4, p0, Lar6;->g0:B

    iput-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    iput-object p2, p0, Lar6;->i0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, Lar6;->g0:B

    iput-object p1, p0, Lar6;->i0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Lq51;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lar6;->g0:B

    .line 2
    .line 3
    iput-object p2, p0, Lar6;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lar6;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpk7;

    .line 4
    .line 5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lok7;

    .line 11
    .line 12
    iget-object p0, p0, Lok7;->t1:Lwk2;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p0, Lxk2;

    .line 17
    .line 18
    iput-object v0, p0, Lwk2;->v0:Lpk7;

    .line 19
    .line 20
    monitor-enter p0

    .line 21
    :try_start_0
    iget-wide v0, p0, Lxk2;->x0:J

    .line 22
    .line 23
    const-wide/16 v2, 0x1

    .line 24
    .line 25
    or-long/2addr v0, v2

    .line 26
    iput-wide v0, p0, Lxk2;->x0:J

    .line 27
    .line 28
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    monitor-enter p0

    .line 30
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    invoke-virtual {p0}, Lkw8;->f()V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    throw p1

    .line 40
    :catchall_1
    move-exception p1

    .line 41
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 42
    throw p1

    .line 43
    :cond_0
    const-string p0, "binding"

    .line 44
    .line 45
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lar6;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lb71;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lar6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lar6;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lb71;

    .line 37
    .line 38
    check-cast p2, Lq51;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lar6;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_2
    check-cast p1, Lb71;

    .line 51
    .line 52
    check-cast p2, Lq51;

    .line 53
    .line 54
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lar6;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_3
    check-cast p1, Lpk7;

    .line 66
    .line 67
    check-cast p2, Lq51;

    .line 68
    .line 69
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lar6;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :pswitch_4
    check-cast p1, Lb71;

    .line 80
    .line 81
    check-cast p2, Lq51;

    .line 82
    .line 83
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lar6;

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :pswitch_5
    check-cast p1, Lb71;

    .line 94
    .line 95
    check-cast p2, Lq51;

    .line 96
    .line 97
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Lar6;

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :pswitch_6
    check-cast p1, Lo05;

    .line 108
    .line 109
    check-cast p2, Lq51;

    .line 110
    .line 111
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Lar6;

    .line 116
    .line 117
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :pswitch_7
    check-cast p1, Lb71;

    .line 123
    .line 124
    check-cast p2, Lq51;

    .line 125
    .line 126
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Lar6;

    .line 131
    .line 132
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :pswitch_8
    check-cast p1, Lb71;

    .line 137
    .line 138
    check-cast p2, Lq51;

    .line 139
    .line 140
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    check-cast p0, Lar6;

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_9
    check-cast p1, Lb71;

    .line 152
    .line 153
    check-cast p2, Lq51;

    .line 154
    .line 155
    invoke-virtual {p0, p2, p1}, Lar6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Lar6;

    .line 160
    .line 161
    invoke-virtual {p0, v1}, Lar6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lar6;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lar6;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lar6;

    .line 9
    .line 10
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    check-cast v1, Lsu/happ/proxyutility/service/XRayTestService;

    .line 15
    .line 16
    const/16 v0, 0xa

    .line 17
    .line 18
    invoke-direct {p2, p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    new-instance p2, Lar6;

    .line 23
    .line 24
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lh69;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    const/16 v0, 0x9

    .line 31
    .line 32
    invoke-direct {p2, p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :pswitch_1
    new-instance p2, Lar6;

    .line 37
    .line 38
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lh57;

    .line 41
    .line 42
    check-cast v1, Lug1;

    .line 43
    .line 44
    const/16 v0, 0x8

    .line 45
    .line 46
    invoke-direct {p2, p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :pswitch_2
    new-instance p0, Lar6;

    .line 51
    .line 52
    check-cast v1, Lr68;

    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    invoke-direct {p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lar6;->h0:Ljava/lang/Object;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_3
    new-instance p0, Lar6;

    .line 62
    .line 63
    check-cast v1, Lok7;

    .line 64
    .line 65
    const/4 v0, 0x6

    .line 66
    invoke-direct {p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, Lar6;->h0:Ljava/lang/Object;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_4
    new-instance p2, Lar6;

    .line 73
    .line 74
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lkh7;

    .line 77
    .line 78
    check-cast v1, Lda6;

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    invoke-direct {p2, p1, p0, v1, v0}, Lar6;-><init>(Lq51;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    return-object p2

    .line 85
    :pswitch_5
    new-instance p2, Lar6;

    .line 86
    .line 87
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ljava/util/Set;

    .line 90
    .line 91
    check-cast v1, Lkh7;

    .line 92
    .line 93
    const/4 v0, 0x4

    .line 94
    invoke-direct {p2, p1, p0, v1, v0}, Lar6;-><init>(Lq51;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :pswitch_6
    new-instance p0, Lar6;

    .line 99
    .line 100
    check-cast v1, Ljava/util/Set;

    .line 101
    .line 102
    const/4 v0, 0x3

    .line 103
    invoke-direct {p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 104
    .line 105
    .line 106
    iput-object p2, p0, Lar6;->h0:Ljava/lang/Object;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_7
    new-instance p2, Lar6;

    .line 110
    .line 111
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;

    .line 114
    .line 115
    check-cast v1, Ljava/lang/Throwable;

    .line 116
    .line 117
    const/4 v0, 0x2

    .line 118
    invoke-direct {p2, p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 119
    .line 120
    .line 121
    return-object p2

    .line 122
    :pswitch_8
    new-instance p2, Lar6;

    .line 123
    .line 124
    iget-object p0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 127
    .line 128
    check-cast v1, [Ljava/lang/String;

    .line 129
    .line 130
    const/4 v0, 0x1

    .line 131
    invoke-direct {p2, p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 132
    .line 133
    .line 134
    return-object p2

    .line 135
    :pswitch_9
    new-instance p0, Lar6;

    .line 136
    .line 137
    check-cast v1, Lrn2;

    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    invoke-direct {p0, v1, p1, v0}, Lar6;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 141
    .line 142
    .line 143
    iput-object p2, p0, Lar6;->h0:Ljava/lang/Object;

    .line 144
    .line 145
    return-object p0

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lar6;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lsu/happ/proxyutility/service/XRayTestService;

    .line 20
    .line 21
    :try_start_0
    sget-object v0, Lyw2;->b:Lcom/google/gson/a;

    .line 22
    .line 23
    const-class v1, Lsu/happ/proxyutility/dto/ResolveForPingData;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v2, Lyi8;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lsu/happ/proxyutility/dto/ResolveForPingData;

    .line 38
    .line 39
    sget-object v1, Lof7;->a:Lof7;

    .line 40
    .line 41
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ResolveForPingData;->a()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lsu/happ/proxyutility/dto/enums/EPingType;->VIA_PROXY_GET:Lsu/happ/proxyutility/dto/enums/EPingType;

    .line 46
    .line 47
    invoke-static {v1, v2}, Lof7;->e(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EPingType;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ResolveForPingData;->b()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ResolveForPingData;->a()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v4, Lsu/happ/proxyutility/dto/ResolveForPingResultData;

    .line 60
    .line 61
    invoke-direct {v4, v1, v2, v3, p1}, Lsu/happ/proxyutility/dto/ResolveForPingResultData;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v4}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, "su.happ.proxyutility.action.service"

    .line 69
    .line 70
    const/16 v1, 0x51

    .line 71
    .line 72
    invoke-static {p0, v0, v1, p1}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p0, v0

    .line 78
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 79
    .line 80
    if-nez p1, :cond_0

    .line 81
    .line 82
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 83
    .line 84
    if-nez p1, :cond_0

    .line 85
    .line 86
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_0
    throw p0

    .line 90
    :pswitch_0
    iget-object v0, p0, Lar6;->h0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lh69;

    .line 93
    .line 94
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Ln69;->a:Llibxray/XRayPoint;

    .line 98
    .line 99
    sget-object p1, Ln69;->a:Llibxray/XRayPoint;

    .line 100
    .line 101
    invoke-virtual {p1}, Llibxray/XRayPoint;->getIsRunning()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    invoke-interface {v0}, Lw47;->b()V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Landroid/content/Context;

    .line 113
    .line 114
    new-instance p1, Lxl0;

    .line 115
    .line 116
    const/4 v1, 0x5

    .line 117
    invoke-direct {p1, p0, v1}, Lxl0;-><init>(Landroid/content/Context;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v3, p1}, Ln69;->d(Lh69;ZLxl0;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Lh57;

    .line 132
    .line 133
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Lug1;

    .line 136
    .line 137
    iget-object p0, p0, Lug1;->X:Lwg1;

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Lh57;->a(Lwg1;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Ldn8;->a:Ldn8;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, Lb71;

    .line 151
    .line 152
    new-instance v0, Lx48;

    .line 153
    .line 154
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, Lr68;

    .line 157
    .line 158
    invoke-direct {v0, p0, v2, v4}, Lx48;-><init>(Lr68;Lq51;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v2, v2, v0, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 162
    .line 163
    .line 164
    new-instance v0, Lx48;

    .line 165
    .line 166
    const/4 v3, 0x2

    .line 167
    invoke-direct {v0, p0, v2, v3}, Lx48;-><init>(Lr68;Lq51;B)V

    .line 168
    .line 169
    .line 170
    invoke-static {p1, v2, v2, v0, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_3
    invoke-direct {p0, p1}, Lar6;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    :pswitch_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p1, Lkh7;

    .line 186
    .line 187
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p0, Lda6;

    .line 190
    .line 191
    iget-wide v5, p0, Lda6;->X:J

    .line 192
    .line 193
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    iget-object v0, p1, Lkh7;->e:Lqq8;

    .line 198
    .line 199
    if-nez v0, :cond_2

    .line 200
    .line 201
    new-instance p0, Lnh0;

    .line 202
    .line 203
    const-string v0, "Camera is not active."

    .line 204
    .line 205
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, p0}, Lkh7;->c(Ljava/lang/Exception;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_6

    .line 212
    .line 213
    :cond_2
    iget-object v2, p1, Lkh7;->d:Ljava/lang/Object;

    .line 214
    .line 215
    monitor-enter v2

    .line 216
    :try_start_1
    iget-wide v7, p1, Lkh7;->g:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 217
    .line 218
    cmp-long v5, v5, v7

    .line 219
    .line 220
    if-nez v5, :cond_3

    .line 221
    .line 222
    move v5, v4

    .line 223
    goto :goto_1

    .line 224
    :cond_3
    move v5, v3

    .line 225
    :goto_1
    monitor-exit v2

    .line 226
    if-nez v5, :cond_4

    .line 227
    .line 228
    goto/16 :goto_6

    .line 229
    .line 230
    :cond_4
    iget-object v2, p1, Lkh7;->d:Ljava/lang/Object;

    .line 231
    .line 232
    monitor-enter v2

    .line 233
    :try_start_2
    iget v5, p1, Lkh7;->h:I

    .line 234
    .line 235
    iget v6, p1, Lkh7;->i:I

    .line 236
    .line 237
    iget-boolean v7, p1, Lkh7;->j:Z

    .line 238
    .line 239
    iget-object v8, p1, Lkh7;->k:Ljava/lang/Integer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 240
    .line 241
    monitor-exit v2

    .line 242
    invoke-virtual {p1, v5, v7, v8}, Lkh7;->d(IZLjava/lang/Integer;)I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    const/4 v5, 0x4

    .line 247
    if-eq v6, v4, :cond_5

    .line 248
    .line 249
    if-eq v6, v1, :cond_6

    .line 250
    .line 251
    :cond_5
    move v1, v5

    .line 252
    :cond_6
    sget-object v6, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 253
    .line 254
    iget-object v7, p1, Lkh7;->a:Lqj0;

    .line 255
    .line 256
    iget-object v7, v7, Lqj0;->b:Ljj0;

    .line 257
    .line 258
    invoke-static {v7, v2}, Lvj8;->P(Ljj0;I)I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    new-instance v7, Lqg5;

    .line 267
    .line 268
    invoke-direct {v7, v6, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 272
    .line 273
    iget-object v6, p1, Lkh7;->a:Lqj0;

    .line 274
    .line 275
    iget-object v6, v6, Lqj0;->b:Ljj0;

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-static {v6}, Lvj8;->E(Ljj0;)Lfu;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    invoke-virtual {v8, v9}, Lfu;->contains(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    if-eqz v8, :cond_7

    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_7
    invoke-static {v6}, Lvj8;->E(Ljj0;)Lfu;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-virtual {v1, v8}, Lfu;->contains(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_8

    .line 308
    .line 309
    move v1, v5

    .line 310
    goto :goto_2

    .line 311
    :cond_8
    invoke-static {v6}, Lvj8;->E(Ljj0;)Lfu;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v1, p0}, Lfu;->contains(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_9

    .line 320
    .line 321
    move v1, v4

    .line 322
    goto :goto_2

    .line 323
    :cond_9
    move v1, v3

    .line 324
    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    new-instance v6, Lqg5;

    .line 329
    .line 330
    invoke-direct {v6, v2, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 334
    .line 335
    iget-object v2, p1, Lkh7;->a:Lqj0;

    .line 336
    .line 337
    iget-object v2, v2, Lqj0;->b:Ljj0;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v2}, Lvj8;->F(Ljj0;)Lfu;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    invoke-virtual {v8, p0}, Lfu;->contains(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    if-eqz v8, :cond_a

    .line 351
    .line 352
    :goto_3
    move v3, v4

    .line 353
    goto :goto_4

    .line 354
    :cond_a
    invoke-static {v2}, Lvj8;->F(Ljj0;)Lfu;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-virtual {v2, p0}, Lfu;->contains(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    if-eqz p0, :cond_b

    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_b
    :goto_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    new-instance v2, Lqg5;

    .line 370
    .line 371
    invoke-direct {v2, v1, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    filled-new-array {v7, v6, v2}, [Lqg5;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-static {p0}, Lzp4;->J([Lqg5;)Ljava/util/Map;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    :try_start_3
    sget-object v1, Lpq8;->Y:Lpq8;

    .line 383
    .line 384
    sget-object v2, Loq8;->b:Lk11;

    .line 385
    .line 386
    invoke-interface {v0, p0, v1, v2}, Lqq8;->g(Ljava/util/Map;Lpq8;Lk11;)Lxg1;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    iget-object v1, p1, Lkh7;->d:Ljava/lang/Object;

    .line 391
    .line 392
    monitor-enter v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 393
    :try_start_4
    iget-object v0, p1, Lkh7;->f:Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 399
    :try_start_5
    monitor-exit v1

    .line 400
    new-instance v1, Lgq6;

    .line 401
    .line 402
    invoke-direct {v1, v0, p1, v5}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 403
    .line 404
    .line 405
    check-cast p0, Lrm3;

    .line 406
    .line 407
    invoke-virtual {p0, v1}, Lrm3;->D(Lgn2;)Lgq1;

    .line 408
    .line 409
    .line 410
    goto :goto_6

    .line 411
    :catch_0
    move-exception v0

    .line 412
    move-object p0, v0

    .line 413
    goto :goto_5

    .line 414
    :catchall_1
    move-exception v0

    .line 415
    move-object p0, v0

    .line 416
    monitor-exit v1

    .line 417
    throw p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 418
    :goto_5
    invoke-virtual {p1, p0}, Lkh7;->c(Ljava/lang/Exception;)V

    .line 419
    .line 420
    .line 421
    :goto_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 422
    .line 423
    return-object p0

    .line 424
    :catchall_2
    move-exception v0

    .line 425
    move-object p0, v0

    .line 426
    monitor-exit v2

    .line 427
    throw p0

    .line 428
    :catchall_3
    move-exception v0

    .line 429
    move-object p0, v0

    .line 430
    monitor-exit v2

    .line 431
    throw p0

    .line 432
    :pswitch_5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast p1, Ljava/util/Set;

    .line 438
    .line 439
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    if-nez p1, :cond_10

    .line 444
    .line 445
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast p1, Ljava/util/Set;

    .line 448
    .line 449
    new-instance v0, Lh57;

    .line 450
    .line 451
    check-cast p1, Ljava/util/Collection;

    .line 452
    .line 453
    invoke-direct {v0, p1, v4}, Lh57;-><init>(Ljava/util/Collection;Z)V

    .line 454
    .line 455
    .line 456
    iget-object p1, v0, Lh57;->e:Lvz7;

    .line 457
    .line 458
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    check-cast p1, Le57;

    .line 463
    .line 464
    invoke-virtual {p1}, Le57;->c()Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    if-eqz p1, :cond_c

    .line 469
    .line 470
    iget-object p1, v0, Lh57;->f:Lvz7;

    .line 471
    .line 472
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    check-cast p1, Lf57;

    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_c
    move-object p1, v2

    .line 480
    :goto_7
    if-eqz p1, :cond_e

    .line 481
    .line 482
    iget-object p1, p1, Lf57;->g:Lym0;

    .line 483
    .line 484
    iget p1, p1, Lym0;->c:I

    .line 485
    .line 486
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    const/4 v1, -0x1

    .line 491
    if-eq p1, v1, :cond_d

    .line 492
    .line 493
    move-object v2, v0

    .line 494
    :cond_d
    if-eqz v2, :cond_e

    .line 495
    .line 496
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 497
    .line 498
    .line 499
    move-result p1

    .line 500
    goto :goto_8

    .line 501
    :cond_e
    move p1, v4

    .line 502
    :goto_8
    iget-object v0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v0, Lkh7;

    .line 505
    .line 506
    iget-object v1, v0, Lkh7;->d:Ljava/lang/Object;

    .line 507
    .line 508
    monitor-enter v1

    .line 509
    :try_start_6
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast p0, Lkh7;

    .line 512
    .line 513
    iget v0, p0, Lkh7;->i:I

    .line 514
    .line 515
    if-eq v0, p1, :cond_f

    .line 516
    .line 517
    iput p1, p0, Lkh7;->i:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 518
    .line 519
    move v3, v4

    .line 520
    goto :goto_9

    .line 521
    :catchall_4
    move-exception v0

    .line 522
    move-object p0, v0

    .line 523
    goto :goto_a

    .line 524
    :cond_f
    :goto_9
    monitor-exit v1

    .line 525
    if-eqz v3, :cond_10

    .line 526
    .line 527
    invoke-virtual {p0}, Lkh7;->f()Lux0;

    .line 528
    .line 529
    .line 530
    goto :goto_b

    .line 531
    :goto_a
    monitor-exit v1

    .line 532
    throw p0

    .line 533
    :cond_10
    :goto_b
    sget-object p0, Ldn8;->a:Ldn8;

    .line 534
    .line 535
    return-object p0

    .line 536
    :pswitch_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast p1, Lo05;

    .line 542
    .line 543
    invoke-virtual {p1}, Lo05;->a()Ljava/util/Map;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    check-cast p1, Ljava/lang/Iterable;

    .line 552
    .line 553
    new-instance v0, Ljava/util/ArrayList;

    .line 554
    .line 555
    const/16 v1, 0xa

    .line 556
    .line 557
    invoke-static {p1, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 562
    .line 563
    .line 564
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    if-eqz v1, :cond_11

    .line 573
    .line 574
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    check-cast v1, Ljs5;

    .line 579
    .line 580
    iget-object v1, v1, Ljs5;->a:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    goto :goto_c

    .line 586
    :cond_11
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast p0, Ljava/util/Set;

    .line 589
    .line 590
    sget-object p1, Lc87;->a:Ljava/util/LinkedHashSet;

    .line 591
    .line 592
    if-ne p0, p1, :cond_12

    .line 593
    .line 594
    :goto_d
    move v3, v4

    .line 595
    goto :goto_e

    .line 596
    :cond_12
    check-cast p0, Ljava/lang/Iterable;

    .line 597
    .line 598
    instance-of p1, p0, Ljava/util/Collection;

    .line 599
    .line 600
    if-eqz p1, :cond_13

    .line 601
    .line 602
    move-object p1, p0

    .line 603
    check-cast p1, Ljava/util/Collection;

    .line 604
    .line 605
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    move-result p1

    .line 609
    if-eqz p1, :cond_13

    .line 610
    .line 611
    goto :goto_e

    .line 612
    :cond_13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    :cond_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    if-eqz p1, :cond_15

    .line 621
    .line 622
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    check-cast p1, Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result p1

    .line 632
    if-nez p1, :cond_14

    .line 633
    .line 634
    goto :goto_d

    .line 635
    :cond_15
    :goto_e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    return-object p0

    .line 640
    :pswitch_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast p1, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;

    .line 646
    .line 647
    sget v0, Ly46;->toast_malformed_json:I

    .line 648
    .line 649
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast p0, Ljava/lang/Throwable;

    .line 656
    .line 657
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 658
    .line 659
    .line 660
    move-result-object p0

    .line 661
    if-eqz p0, :cond_16

    .line 662
    .line 663
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    goto :goto_f

    .line 668
    :cond_16
    move-object p0, v2

    .line 669
    :goto_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 670
    .line 671
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    const-string v0, " "

    .line 678
    .line 679
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    const/4 v0, 0x6

    .line 690
    invoke-static {p1, p0, v2, v0}, Lpu;->N(Lsu/happ/proxyutility/ui/SnackbarHostActivity;Ljava/lang/String;Ljava/util/List;I)V

    .line 691
    .line 692
    .line 693
    sget-object p0, Ldn8;->a:Ldn8;

    .line 694
    .line 695
    return-object p0

    .line 696
    :pswitch_8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast p1, Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 702
    .line 703
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 704
    .line 705
    move-object v5, p0

    .line 706
    check-cast v5, [Ljava/lang/String;

    .line 707
    .line 708
    :try_start_7
    new-instance p0, Ljava/net/Socket;

    .line 709
    .line 710
    invoke-direct {p0}, Ljava/net/Socket;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    .line 711
    .line 712
    .line 713
    :try_start_8
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SocketServerInfo;->c()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    if-eqz v0, :cond_17

    .line 718
    .line 719
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SocketServerInfo;->d()Ljava/lang/Integer;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    if-eqz v0, :cond_17

    .line 724
    .line 725
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 726
    .line 727
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SocketServerInfo;->c()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SocketServerInfo;->d()Ljava/lang/Integer;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 736
    .line 737
    .line 738
    move-result p1

    .line 739
    invoke-direct {v0, v1, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 740
    .line 741
    .line 742
    const/16 p1, 0x3a98

    .line 743
    .line 744
    invoke-virtual {p0, v0, p1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 745
    .line 746
    .line 747
    new-instance p1, Ljava/io/PrintWriter;

    .line 748
    .line 749
    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-direct {p1, v0, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 754
    .line 755
    .line 756
    :try_start_9
    const-string v6, "\n"

    .line 757
    .line 758
    const/4 v9, 0x0

    .line 759
    const/16 v10, 0x3e

    .line 760
    .line 761
    const/4 v7, 0x0

    .line 762
    const/4 v8, 0x0

    .line 763
    invoke-static/range {v5 .. v10}, Leu;->x0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 768
    .line 769
    .line 770
    :try_start_a
    invoke-virtual {p1}, Ljava/io/PrintWriter;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 771
    .line 772
    .line 773
    goto :goto_10

    .line 774
    :catchall_5
    move-exception v0

    .line 775
    move-object p1, v0

    .line 776
    goto :goto_11

    .line 777
    :catchall_6
    move-exception v0

    .line 778
    move-object v1, v0

    .line 779
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 780
    :catchall_7
    move-exception v0

    .line 781
    :try_start_c
    invoke-static {p1, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 782
    .line 783
    .line 784
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 785
    :cond_17
    :goto_10
    :try_start_d
    invoke-virtual {p0}, Ljava/net/Socket;->close()V

    .line 786
    .line 787
    .line 788
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 789
    .line 790
    goto :goto_12

    .line 791
    :goto_11
    :try_start_e
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 792
    :catchall_8
    move-exception v0

    .line 793
    :try_start_f
    invoke-static {p0, p1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 794
    .line 795
    .line 796
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 797
    :catchall_9
    move-exception v0

    .line 798
    move-object p0, v0

    .line 799
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 800
    .line 801
    if-nez p1, :cond_18

    .line 802
    .line 803
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 804
    .line 805
    if-nez p1, :cond_18

    .line 806
    .line 807
    new-instance p1, Lrj6;

    .line 808
    .line 809
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 810
    .line 811
    .line 812
    move-object p0, p1

    .line 813
    :goto_12
    new-instance p1, Lsj6;

    .line 814
    .line 815
    invoke-direct {p1, p0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    return-object p1

    .line 819
    :cond_18
    throw p0

    .line 820
    :pswitch_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    iget-object p1, p0, Lar6;->h0:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast p1, Lb71;

    .line 826
    .line 827
    invoke-interface {p1}, Lb71;->getCoroutineContext()Ls61;

    .line 828
    .line 829
    .line 830
    move-result-object p1

    .line 831
    sget-object v0, Lpz2;->E0:Lpz2;

    .line 832
    .line 833
    invoke-interface {p1, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 834
    .line 835
    .line 836
    move-result-object p1

    .line 837
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    check-cast p1, Lu61;

    .line 841
    .line 842
    new-instance v0, Lux0;

    .line 843
    .line 844
    invoke-direct {v0}, Lux0;-><init>()V

    .line 845
    .line 846
    .line 847
    sget-object v1, Lcs2;->X:Lcs2;

    .line 848
    .line 849
    sget-object v3, Le71;->f0:Le71;

    .line 850
    .line 851
    new-instance v5, Lqk4;

    .line 852
    .line 853
    iget-object p0, p0, Lar6;->i0:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast p0, Lrn2;

    .line 856
    .line 857
    const/16 v6, 0xf

    .line 858
    .line 859
    invoke-direct {v5, v0, p0, v2, v6}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 860
    .line 861
    .line 862
    invoke-static {v1, p1, v3, v5}, Lw51;->F(Lb71;Ls61;Le71;Lrn2;)Log7;

    .line 863
    .line 864
    .line 865
    :catch_1
    invoke-virtual {v0}, Lrm3;->S()Z

    .line 866
    .line 867
    .line 868
    move-result p0

    .line 869
    if-nez p0, :cond_19

    .line 870
    .line 871
    :try_start_10
    new-instance p0, Lve0;

    .line 872
    .line 873
    invoke-direct {p0, v0, v2, v4}, Lve0;-><init>(Lux0;Lq51;B)V

    .line 874
    .line 875
    .line 876
    invoke-static {p1, p0}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object p0
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_10 .. :try_end_10} :catch_1

    .line 880
    goto :goto_13

    .line 881
    :cond_19
    invoke-virtual {v0}, Lrm3;->G()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object p0

    .line 885
    :goto_13
    return-object p0

    .line 886
    nop

    .line 887
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

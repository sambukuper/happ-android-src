.class public final Lak4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lak4;->h0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lak4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lak4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lak4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 0

    .line 1
    new-instance p2, Lak4;

    .line 2
    .line 3
    iget-object p0, p0, Lak4;->h0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p2, p0, p1}, Lak4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-boolean v0, p0, Lak4;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Lsj6;

    .line 13
    .line 14
    iget-object p0, p1, Lsj6;->X:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lak4;->h0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 28
    .line 29
    const-string v0, "keyForStatistics"

    .line 30
    .line 31
    const-string v4, "I8AmwFEw"

    .line 32
    .line 33
    const-string v5, "438188ae27605b83f6ba5c5aee91993ce6bf7031c489999c97150b95417a9856"

    .line 34
    .line 35
    :try_start_1
    sget v3, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 36
    .line 37
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->H()Lcom/tencent/mmkv/MMKV;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-wide/16 v6, 0x0

    .line 42
    .line 43
    invoke-virtual {v3, v6, v7, v0}, Lcom/tencent/mmkv/MMKV;->f(JLjava/lang/String;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v6

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v8

    .line 51
    const-wide/32 v10, 0x5265c00

    .line 52
    .line 53
    .line 54
    add-long/2addr v6, v10

    .line 55
    cmp-long v3, v6, v8

    .line 56
    .line 57
    if-gez v3, :cond_5

    .line 58
    .line 59
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->H()Lcom/tencent/mmkv/MMKV;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, v8, v9, v0}, Lcom/tencent/mmkv/MMKV;->m(JLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 67
    .line 68
    const v0, 0xfffffff

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, v2, v0, v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lsu/happ/proxyutility/dto/ProviderId;->Companion:Lsu/happ/proxyutility/dto/ProviderId$Companion;

    .line 75
    .line 76
    invoke-virtual {p1, v4, v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->t0(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 80
    .line 81
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->a()Lqo;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    if-eqz v6, :cond_2

    .line 100
    .line 101
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;

    .line 102
    .line 103
    invoke-direct {v7, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;-><init>(Ljava/util/Map;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    move-object v7, v2

    .line 108
    :goto_0
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    filled-new-array {v7, v6, v8, v0}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    xor-int/2addr v0, v1

    .line 133
    if-ne v0, v1, :cond_3

    .line 134
    .line 135
    sget-object v0, Ltn;->Z:Ltn;

    .line 136
    .line 137
    :goto_1
    move-object v6, v0

    .line 138
    goto :goto_2

    .line 139
    :cond_3
    sget-object v0, Ltn;->Y:Ltn;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_2
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_4

    .line 147
    .line 148
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->Z0()Lsu/happ/proxyutility/dto/SubscriptionUserInfo;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_4

    .line 153
    .line 154
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionUserInfo;->d()J

    .line 155
    .line 156
    .line 157
    move-result-wide v7

    .line 158
    new-instance v2, Ljava/lang/Long;

    .line 159
    .line 160
    invoke-direct {v2, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 161
    .line 162
    .line 163
    :cond_4
    move-object v7, v2

    .line 164
    iput-boolean v1, p0, Lak4;->g0:Z

    .line 165
    .line 166
    move-object v8, p0

    .line 167
    invoke-virtual/range {v3 .. v8}, Lqo;->f(Ljava/lang/String;Ljava/lang/String;Ltn;Ljava/lang/Long;Ls51;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    sget-object p1, Lc71;->X:Lc71;

    .line 172
    .line 173
    if-ne p0, p1, :cond_5

    .line 174
    .line 175
    return-object p1

    .line 176
    :catchall_0
    move-exception v0

    .line 177
    move-object p0, v0

    .line 178
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 179
    .line 180
    if-nez p1, :cond_6

    .line 181
    .line 182
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 183
    .line 184
    if-nez p1, :cond_6

    .line 185
    .line 186
    :cond_5
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_6
    throw p0
.end method

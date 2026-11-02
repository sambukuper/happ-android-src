.class public final Lfo;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt80;Li55;Lp5;Lg00;Lq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lfo;->g0:B

    .line 19
    iput-object p1, p0, Lfo;->i0:Ljava/lang/Object;

    iput-object p2, p0, Lfo;->j0:Ljava/lang/Object;

    iput-object p3, p0, Lfo;->k0:Ljava/lang/Object;

    iput-object p4, p0, Lfo;->l0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Ltn;Ljava/lang/String;Lqo;Ljava/lang/String;Ljava/lang/Long;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lfo;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lfo;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lfo;->i0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lfo;->k0:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lfo;->j0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lfo;->l0:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lfo;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lfo;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lfo;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lfo;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lfo;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lfo;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lfo;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, Lfo;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lfo;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lfo;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lfo;->j0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lfo;->i0:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v5, Lfo;

    .line 15
    .line 16
    move-object v6, v4

    .line 17
    check-cast v6, Lt80;

    .line 18
    .line 19
    move-object v7, v3

    .line 20
    check-cast v7, Li55;

    .line 21
    .line 22
    move-object v8, v2

    .line 23
    check-cast v8, Lp5;

    .line 24
    .line 25
    move-object v9, v1

    .line 26
    check-cast v9, Lg00;

    .line 27
    .line 28
    move-object v10, p1

    .line 29
    invoke-direct/range {v5 .. v10}, Lfo;-><init>(Lt80;Li55;Lp5;Lg00;Lq51;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, v5, Lfo;->h0:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v5

    .line 35
    :pswitch_0
    move-object v10, p1

    .line 36
    new-instance v6, Lfo;

    .line 37
    .line 38
    iget-object p0, p0, Lfo;->h0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v7, p0

    .line 41
    check-cast v7, Ltn;

    .line 42
    .line 43
    move-object v8, v4

    .line 44
    check-cast v8, Ljava/lang/String;

    .line 45
    .line 46
    move-object v9, v2

    .line 47
    check-cast v9, Lqo;

    .line 48
    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    move-object v11, v1

    .line 52
    check-cast v11, Ljava/lang/Long;

    .line 53
    .line 54
    move-object v12, v10

    .line 55
    move-object v10, v3

    .line 56
    invoke-direct/range {v6 .. v12}, Lfo;-><init>(Ltn;Ljava/lang/String;Lqo;Ljava/lang/String;Ljava/lang/Long;Lq51;)V

    .line 57
    .line 58
    .line 59
    return-object v6

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lfo;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lfo;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lfo;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lfo;->j0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lfo;->i0:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lfo;->h0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lb71;

    .line 20
    .line 21
    new-instance v5, Lr0;

    .line 22
    .line 23
    move-object v6, v4

    .line 24
    check-cast v6, Lt80;

    .line 25
    .line 26
    move-object v7, v3

    .line 27
    check-cast v7, Li55;

    .line 28
    .line 29
    move-object v8, v2

    .line 30
    check-cast v8, Lp5;

    .line 31
    .line 32
    const/4 v10, 0x6

    .line 33
    const/4 v9, 0x0

    .line 34
    invoke-direct/range {v5 .. v10}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x3

    .line 38
    invoke-static {p0, v9, v9, v5, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lq0;

    .line 42
    .line 43
    check-cast v1, Lg00;

    .line 44
    .line 45
    const/16 v2, 0x8

    .line 46
    .line 47
    invoke-direct {v0, v6, v1, v9, v2}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v9, v9, v0, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lfo;->h0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ltn;

    .line 61
    .line 62
    iget-object p0, p0, Ltn;->X:Ljava/lang/String;

    .line 63
    .line 64
    check-cast v4, Ljava/lang/String;

    .line 65
    .line 66
    sget-object p1, Lsu/happ/proxyutility/dto/ProviderId;->Companion:Lsu/happ/proxyutility/dto/ProviderId$Companion;

    .line 67
    .line 68
    const-string p1, "/v1provider?id="

    .line 69
    .line 70
    invoke-static {p0, p1, v4}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object v7, Lun;->Y:Lun;

    .line 75
    .line 76
    move-object v4, v2

    .line 77
    check-cast v4, Lqo;

    .line 78
    .line 79
    move-object v10, v3

    .line 80
    check-cast v10, Ljava/lang/String;

    .line 81
    .line 82
    move-object v13, v1

    .line 83
    check-cast v13, Ljava/lang/Long;

    .line 84
    .line 85
    const-string v12, "close"

    .line 86
    .line 87
    :try_start_0
    sget-object p1, Lss8;->a:Lss8;

    .line 88
    .line 89
    iget-object p1, v4, Lqo;->a:Landroid/content/Context;

    .line 90
    .line 91
    invoke-static {p1}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object v0, p1, Lyf8;->X:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lsu/happ/proxyutility/dto/HWID;

    .line 98
    .line 99
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    iget-object v0, p1, Lyf8;->Y:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lsu/happ/proxyutility/dto/VersionOS;

    .line 106
    .line 107
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    iget-object p1, p1, Lyf8;->Z:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 114
    .line 115
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    const/4 p1, 0x1

    .line 120
    const/16 v0, 0x2328

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    invoke-virtual {v4, v0, p1, v1}, Lqo;->b(IZZ)Lokhttp3/OkHttpClient;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance v5, Ljava/net/URL;

    .line 128
    .line 129
    invoke-direct {v5, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const/4 v11, 0x0

    .line 133
    invoke-virtual/range {v4 .. v13}, Lqo;->a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {}, Lss8;->t()Z

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    new-instance v0, Ljava/lang/Integer;

    .line 165
    .line 166
    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lyw2;->b:Lcom/google/gson/a;

    .line 170
    .line 171
    const-class v1, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v2, Lyi8;

    .line 177
    .line 178
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p1, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-eqz p0, :cond_0

    .line 186
    .line 187
    new-instance p1, Lqg5;

    .line 188
    .line 189
    invoke-direct {p1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_0
    const-string p0, "Required value was null."

    .line 194
    .line 195
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 196
    .line 197
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    move-object p0, v0

    .line 203
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 204
    .line 205
    if-nez p1, :cond_1

    .line 206
    .line 207
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 208
    .line 209
    if-nez p1, :cond_1

    .line 210
    .line 211
    new-instance p1, Lrj6;

    .line 212
    .line 213
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    :goto_0
    new-instance p0, Lsj6;

    .line 217
    .line 218
    invoke-direct {p0, p1}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :cond_1
    throw p0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

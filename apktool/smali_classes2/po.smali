.class public final Lpo;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Lqo;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lqo;Ljava/lang/String;[Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpo;->g0:Lqo;

    .line 2
    .line 3
    iput-object p2, p0, Lpo;->h0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lpo;->i0:[Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
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
    invoke-virtual {p0, p2, p1}, Lpo;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lpo;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lpo;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance p2, Lpo;

    .line 2
    .line 3
    iget-object v0, p0, Lpo;->h0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lpo;->i0:[Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lpo;->g0:Lqo;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lpo;-><init>(Lqo;Ljava/lang/String;[Ljava/lang/String;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpo;->g0:Lqo;

    .line 5
    .line 6
    iget-object p1, p0, Lpo;->h0:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "https://ntp2-sync.com/v1sendtv/"

    .line 9
    .line 10
    invoke-static {v1, p1}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v3, Lun;->f0:Lun;

    .line 15
    .line 16
    iget-object p0, p0, Lpo;->i0:[Ljava/lang/String;

    .line 17
    .line 18
    const-string v8, "close"

    .line 19
    .line 20
    :try_start_0
    sget-object v1, Lss8;->a:Lss8;

    .line 21
    .line 22
    iget-object v1, v0, Lqo;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {v1}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, v1, Lyf8;->X:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lsu/happ/proxyutility/dto/HWID;

    .line 31
    .line 32
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v4, v1, Lyf8;->Y:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Lsu/happ/proxyutility/dto/VersionOS;

    .line 39
    .line 40
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v1, v1, Lyf8;->Z:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 47
    .line 48
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/16 v1, 0x2328

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    invoke-virtual {v0, v1, v6, v6}, Lqo;->b(IZZ)Lokhttp3/OkHttpClient;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    new-instance v1, Ljava/net/URL;

    .line 60
    .line 61
    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    invoke-virtual/range {v0 .. v9}, Lqo;->a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object v0, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 72
    .line 73
    sget-object v1, Lyw2;->b:Lcom/google/gson/a;

    .line 74
    .line 75
    new-instance v2, Lsu/happ/proxyutility/dto/SendTVRequest;

    .line 76
    .line 77
    const-string v5, "\n"

    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    const/16 v9, 0x3e

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    move-object v4, p0

    .line 85
    invoke-static/range {v4 .. v9}, Leu;->x0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const/16 v3, 0xa

    .line 90
    .line 91
    invoke-static {v3, p0}, Lwl7;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-direct {v2, p0}, Lsu/happ/proxyutility/dto/SendTVRequest;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object v2, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 103
    .line 104
    const-string v3, "application/json"

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, p0, v2}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p1, p0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v10, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {}, Lss8;->t()Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    new-instance v0, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 148
    .line 149
    .line 150
    const-class p0, Lsu/happ/proxyutility/dto/SendTVGetResponse;

    .line 151
    .line 152
    new-instance v2, Lyi8;

    .line 153
    .line 154
    invoke-direct {v2, p0}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, p1, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_0

    .line 162
    .line 163
    new-instance p1, Lqg5;

    .line 164
    .line 165
    invoke-direct {p1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_0
    const-string p0, "Required value was null."

    .line 170
    .line 171
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    :catchall_0
    move-exception v0

    .line 178
    move-object p0, v0

    .line 179
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 180
    .line 181
    if-nez p1, :cond_2

    .line 182
    .line 183
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 184
    .line 185
    if-nez p1, :cond_2

    .line 186
    .line 187
    new-instance p1, Lrj6;

    .line 188
    .line 189
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :goto_0
    instance-of p0, p1, Lrj6;

    .line 193
    .line 194
    if-nez p0, :cond_1

    .line 195
    .line 196
    check-cast p1, Lqg5;

    .line 197
    .line 198
    iget-object p0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p0, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    new-instance p1, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 209
    .line 210
    .line 211
    :cond_1
    new-instance p0, Lsj6;

    .line 212
    .line 213
    invoke-direct {p0, p1}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_2
    throw p0
.end method

.class public final Llo;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Ljava/lang/String;

.field public final synthetic h0:Ljava/util/List;

.field public final synthetic i0:Lqo;

.field public final synthetic j0:S


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lqo;ILq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llo;->g0:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Llo;->h0:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Llo;->i0:Lqo;

    .line 6
    .line 7
    iput-short p4, p0, Llo;->j0:S

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p2, p1}, Llo;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Llo;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Llo;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Llo;

    .line 2
    .line 3
    iget-object v3, p0, Llo;->i0:Lqo;

    .line 4
    .line 5
    iget-short v4, p0, Llo;->j0:S

    .line 6
    .line 7
    iget-object v1, p0, Llo;->g0:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Llo;->h0:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Llo;-><init>(Ljava/lang/String;Ljava/util/List;Lqo;ILq51;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Llo;->g0:Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, "https://ntp2-sync.com/v1remotepush?token="

    .line 7
    .line 8
    invoke-static {v0, p1}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v3, Lun;->g0:Lun;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/16 v9, 0x3f

    .line 16
    .line 17
    iget-object v4, p0, Llo;->h0:Ljava/util/List;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-static/range {v4 .. v9}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    iget-object v0, p0, Llo;->i0:Lqo;

    .line 27
    .line 28
    iget-short p0, p0, Llo;->j0:S

    .line 29
    .line 30
    const-string v8, "close"

    .line 31
    .line 32
    :try_start_0
    sget-object v1, Lss8;->a:Lss8;

    .line 33
    .line 34
    iget-object v1, v0, Lqo;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v1}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, v1, Lyf8;->X:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lsu/happ/proxyutility/dto/HWID;

    .line 43
    .line 44
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v4, v1, Lyf8;->Y:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lsu/happ/proxyutility/dto/VersionOS;

    .line 51
    .line 52
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v1, v1, Lyf8;->Z:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 59
    .line 60
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    const/4 v10, 0x0

    .line 65
    invoke-virtual {v0, p0, v10, v10}, Lqo;->b(IZZ)Lokhttp3/OkHttpClient;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v1, Ljava/net/URL;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    invoke-virtual/range {v0 .. v9}, Lqo;->a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object v0, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 81
    .line 82
    new-array v1, v10, [B

    .line 83
    .line 84
    const/4 v5, 0x7

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-static/range {v0 .. v6}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {}, Lss8;->t()Z

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    new-instance v0, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 127
    .line 128
    .line 129
    sget-object p0, Lyw2;->b:Lcom/google/gson/a;

    .line 130
    .line 131
    const-class v1, Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v2, Lyi8;

    .line 137
    .line 138
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_0

    .line 146
    .line 147
    new-instance p1, Lqg5;

    .line 148
    .line 149
    invoke-direct {p1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_0
    const-string p0, "Required value was null."

    .line 154
    .line 155
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 156
    .line 157
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object p0, v0

    .line 163
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 164
    .line 165
    if-nez p1, :cond_1

    .line 166
    .line 167
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 168
    .line 169
    if-nez p1, :cond_1

    .line 170
    .line 171
    new-instance p1, Lrj6;

    .line 172
    .line 173
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    :goto_0
    new-instance p0, Lsj6;

    .line 177
    .line 178
    invoke-direct {p0, p1}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_1
    throw p0
.end method

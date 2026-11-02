.class public final Ljo;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Lqo;

.field public final synthetic h0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lqo;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljo;->g0:Lqo;

    .line 2
    .line 3
    iput-object p2, p0, Ljo;->h0:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Ljo;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljo;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljo;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance p2, Ljo;

    .line 2
    .line 3
    iget-object v0, p0, Ljo;->g0:Lqo;

    .line 4
    .line 5
    iget-object p0, p0, Ljo;->h0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Ljo;-><init>(Lqo;Ljava/lang/String;Lq51;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljo;->g0:Lqo;

    .line 5
    .line 6
    iget-object p0, p0, Ljo;->h0:Ljava/lang/String;

    .line 7
    .line 8
    const-string p1, "https://ntp2-sync.com/v1sendtv/"

    .line 9
    .line 10
    invoke-static {p1, p0}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v3, Lun;->f0:Lun;

    .line 15
    .line 16
    const-string v8, "close"

    .line 17
    .line 18
    :try_start_0
    sget-object p1, Lss8;->a:Lss8;

    .line 19
    .line 20
    iget-object p1, v0, Lqo;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v1, p1, Lyf8;->X:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lsu/happ/proxyutility/dto/HWID;

    .line 29
    .line 30
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v1, p1, Lyf8;->Y:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lsu/happ/proxyutility/dto/VersionOS;

    .line 37
    .line 38
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    iget-object p1, p1, Lyf8;->Z:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 45
    .line 46
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const/16 p1, 0x2328

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, p1, v1, v1}, Lqo;->b(IZZ)Lokhttp3/OkHttpClient;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Ljava/net/URL;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    invoke-virtual/range {v0 .. v9}, Lqo;->a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p1, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {}, Lss8;->t()Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    new-instance v0, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lyw2;->b:Lcom/google/gson/a;

    .line 106
    .line 107
    const-class v1, Lsu/happ/proxyutility/dto/SendTVGetResponse;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v2, Lyi8;

    .line 113
    .line 114
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_0

    .line 122
    .line 123
    new-instance p1, Lqg5;

    .line 124
    .line 125
    invoke-direct {p1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_0
    const-string p0, "Required value was null."

    .line 130
    .line 131
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 132
    .line 133
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    move-object p0, v0

    .line 139
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 140
    .line 141
    if-nez p1, :cond_2

    .line 142
    .line 143
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 144
    .line 145
    if-nez p1, :cond_2

    .line 146
    .line 147
    new-instance p1, Lrj6;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :goto_0
    instance-of p0, p1, Lrj6;

    .line 153
    .line 154
    if-nez p0, :cond_1

    .line 155
    .line 156
    check-cast p1, Lqg5;

    .line 157
    .line 158
    iget-object p0, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 159
    .line 160
    move-object p1, p0

    .line 161
    check-cast p1, Lsu/happ/proxyutility/dto/SendTVGetResponse;

    .line 162
    .line 163
    :cond_1
    new-instance p0, Lsj6;

    .line 164
    .line 165
    invoke-direct {p0, p1}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :cond_2
    throw p0
.end method

.class public final Lai3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lai3;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {p1, v1}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v3

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    .line 29
    :cond_1
    move-object v6, v0

    .line 30
    :try_start_0
    sget-object v0, Lmr;->a:Lcp3;

    .line 31
    .line 32
    iget-object v4, v0, Lvm3;->b:Lg55;

    .line 33
    .line 34
    sget-object v4, Lyh3;->Companion:Lxh3;

    .line 35
    .line 36
    invoke-virtual {v4}, Lxh3;->serializer()Low3;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Low3;

    .line 41
    .line 42
    invoke-virtual {v0, v4, v6}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 49
    .line 50
    if-nez v4, :cond_8

    .line 51
    .line 52
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 53
    .line 54
    if-nez v4, :cond_8

    .line 55
    .line 56
    new-instance v4, Lrj6;

    .line 57
    .line 58
    invoke-direct {v4, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object v0, v4

    .line 62
    :goto_1
    nop

    .line 63
    instance-of v4, v0, Lrj6;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    move-object v0, v3

    .line 68
    :cond_2
    check-cast v0, Lyh3;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Lyh3;->a:Lsu/happ/proxyutility/dto/AdditionalInfoCode;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object v0, v3

    .line 76
    :goto_2
    invoke-virtual {v1}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v5, "X-Domain-Hash"

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v4, v3

    .line 90
    :goto_3
    const-string v3, "su.happ.proxyutility.action.activity"

    .line 91
    .line 92
    const/16 v5, 0x7f

    .line 93
    .line 94
    iget-object p0, p0, Lai3;->a:Landroid/content/Context;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/AdditionalInfoCode;->a()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    const/16 v8, 0x64

    .line 103
    .line 104
    if-ne v7, v8, :cond_5

    .line 105
    .line 106
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-static {p0, v3, v5, v7}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-static {p0, v3, v5, v7}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 115
    .line 116
    .line 117
    :goto_4
    if-eqz v0, :cond_6

    .line 118
    .line 119
    if-eqz v4, :cond_6

    .line 120
    .line 121
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 122
    .line 123
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    move-object v3, v0

    .line 132
    new-instance v0, Lii;

    .line 133
    .line 134
    const/4 v5, 0x3

    .line 135
    invoke-direct/range {v0 .. v5}, Lii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lkf4;->h(Lgn2;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    invoke-virtual {v2}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-nez p1, :cond_7

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    new-instance v0, Lzh3;

    .line 149
    .line 150
    invoke-direct {v0, v6, p1}, Lzh3;-><init>(Ljava/lang/String;Lokhttp3/ResponseBody;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v0}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :goto_5
    invoke-virtual {p0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :cond_8
    throw v0
.end method

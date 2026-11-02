.class public final Lc16;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lvz7;

.field public e:Ljava/lang/String;

.field public f:Landroid/net/Network;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc16;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ldw4;

    .line 7
    .line 8
    const/16 v0, 0x1b

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ldw4;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lvz7;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lc16;->b:Lvz7;

    .line 19
    .line 20
    new-instance p1, Ldw4;

    .line 21
    .line 22
    const/16 v0, 0x1c

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ldw4;-><init>(B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lvz7;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lc16;->c:Lvz7;

    .line 33
    .line 34
    new-instance p1, Ly06;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {p1, p0, v0}, Ly06;-><init>(Lc16;B)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lvz7;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lc16;->d:Lvz7;

    .line 46
    .line 47
    const-string p1, "happ_user"

    .line 48
    .line 49
    iput-object p1, p0, Lc16;->g:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p1, p0, Lc16;->i:Ljava/lang/String;

    .line 52
    .line 53
    :try_start_0
    new-instance p1, Landroid/net/NetworkRequest$Builder;

    .line 54
    .line 55
    invoke-direct {p1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0xf

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Landroid/net/NetworkRequest$Builder;->removeCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v1, Lb16;

    .line 69
    .line 70
    invoke-direct {v1, p0}, Lb16;-><init>(Lc16;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 78
    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    invoke-virtual {v0, p1, v1}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 87
    .line 88
    if-nez v0, :cond_1

    .line 89
    .line 90
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 91
    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    :cond_0
    :goto_0
    new-instance p1, Ly06;

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    invoke-direct {p1, p0, v0}, Ly06;-><init>(Lc16;B)V

    .line 98
    .line 99
    .line 100
    new-instance p0, Lvz7;

    .line 101
    .line 102
    invoke-direct {p0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_1
    throw p1
.end method

.method public static c()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Lbq0;

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    const/16 v2, 0x39

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lbq0;-><init>(CC)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lbq0;

    .line 11
    .line 12
    const/16 v2, 0x61

    .line 13
    .line 14
    const/16 v3, 0x7a

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lbq0;-><init>(CC)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lbq0;

    .line 20
    .line 21
    const/16 v3, 0x41

    .line 22
    .line 23
    const/16 v4, 0x5a

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lbq0;-><init>(CC)V

    .line 26
    .line 27
    .line 28
    filled-new-array {v0, v1, v2}, [Lbq0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lxv0;->a0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    const/16 v2, 0xc

    .line 42
    .line 43
    invoke-static {v1, v2}, Lx97;->a0(II)Lkf3;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v3, 0xa

    .line 50
    .line 51
    invoke-static {v1, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lif3;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    move-object v4, v1

    .line 63
    check-cast v4, Ljf3;

    .line 64
    .line 65
    iget-boolean v5, v4, Ljf3;->Z:Z

    .line 66
    .line 67
    if-eqz v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {v4}, Ljf3;->nextInt()I

    .line 70
    .line 71
    .line 72
    sget-object v4, Lm66;->X:Ll66;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    sget-object v5, Lm66;->Y:Ll2;

    .line 79
    .line 80
    invoke-virtual {v5, v4}, Ll2;->g(I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v2, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_1

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/Character;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    const/4 v9, 0x0

    .line 135
    const/16 v10, 0x3e

    .line 136
    .line 137
    const-string v6, ""

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v8, 0x0

    .line 141
    invoke-static/range {v5 .. v10}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0
.end method


# virtual methods
.method public final a(Lokhttp3/OkHttpClient$Builder;I)Lokhttp3/OkHttpClient$Builder;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lc16;->h()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lc16;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v0, Lss8;->a:Lss8;

    .line 15
    .line 16
    invoke-static {}, Lss8;->t()Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lc16;->h:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    new-instance v1, Lrw;

    .line 24
    .line 25
    invoke-static {}, Ln67;->d()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object p0, p0, Lc16;->g:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v1, p0, v2, p2, v0}, Lrw;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lokhttp3/OkHttpClient$Builder;->socketFactory(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object p0

    .line 42
    :cond_2
    :goto_0
    new-instance p0, Ljava/net/Proxy;

    .line 43
    .line 44
    sget-object p2, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 45
    .line 46
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 47
    .line 48
    const-string v1, "127.0.0.1"

    .line 49
    .line 50
    invoke-static {}, Ln67;->d()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, p2, v0}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p0}, Lokhttp3/OkHttpClient$Builder;->proxy(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v3, "pref_proxy_sharing_enabled"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-virtual {v0, v3, v4}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lc16;->i()V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_1a

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v3, "pref_socks_auth_mode"

    .line 28
    .line 29
    const/4 v4, -0x1

    .line 30
    invoke-virtual {v0, v4, v3}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eq v0, v4, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x0

    .line 42
    :goto_0
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->b()Ll22;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ln22;

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ln22;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    sget-object v0, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->Companion:Lsu/happ/proxyutility/dto/enums/InboundAuthMode$Companion;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->a()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :goto_1
    sget-object v3, Lz06;->b:[I

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    aget v0, v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 79
    .line 80
    iget-object v3, v1, Lc16;->c:Lvz7;

    .line 81
    .line 82
    const-string v6, "pass"

    .line 83
    .line 84
    const-string v7, "user"

    .line 85
    .line 86
    const-string v8, "accounts"

    .line 87
    .line 88
    const-string v9, "settings"

    .line 89
    .line 90
    const-string v10, "port"

    .line 91
    .line 92
    const-string v11, "protocol"

    .line 93
    .line 94
    const/4 v14, 0x2

    .line 95
    const-string v15, "happ-socks"

    .line 96
    .line 97
    const-string v4, "inbounds"

    .line 98
    .line 99
    const-class v5, Lbq3;

    .line 100
    .line 101
    const/4 v12, 0x1

    .line 102
    const-string v13, ""

    .line 103
    .line 104
    if-eq v0, v12, :cond_9

    .line 105
    .line 106
    if-eq v0, v14, :cond_8

    .line 107
    .line 108
    const/4 v14, 0x3

    .line 109
    if-eq v0, v14, :cond_5

    .line 110
    .line 111
    const/4 v14, 0x4

    .line 112
    if-ne v0, v14, :cond_4

    .line 113
    .line 114
    :try_start_1
    iput-object v15, v1, Lc16;->g:Ljava/lang/String;

    .line 115
    .line 116
    const/4 v14, 0x0

    .line 117
    iput-object v14, v1, Lc16;->h:Ljava/lang/String;

    .line 118
    .line 119
    :cond_3
    :goto_2
    move-object/from16 v17, v3

    .line 120
    .line 121
    goto/16 :goto_d

    .line 122
    .line 123
    :cond_4
    new-instance v0, Lb55;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_5
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v14, "pref_socks_auth_manual_user"

    .line 134
    .line 135
    invoke-virtual {v0, v14, v13}, Lcom/tencent/mmkv/MMKV;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-nez v0, :cond_6

    .line 140
    .line 141
    move-object v0, v13

    .line 142
    :cond_6
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    const-string v15, "pref_socks_auth_manual_pass"

    .line 147
    .line 148
    invoke-virtual {v14, v15, v13}, Lcom/tencent/mmkv/MMKV;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    if-nez v14, :cond_7

    .line 153
    .line 154
    move-object v14, v13

    .line 155
    :cond_7
    iput-object v0, v1, Lc16;->g:Ljava/lang/String;

    .line 156
    .line 157
    iput-object v14, v1, Lc16;->h:Ljava/lang/String;

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    iput-object v15, v1, Lc16;->g:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {}, Lc16;->c()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, v1, Lc16;->h:Ljava/lang/String;

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_9
    sget-object v0, Lkw4;->a:Lkw4;

    .line 170
    .line 171
    invoke-static {v2}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->c()Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    sget-object v16, Lz06;->a:[I

    .line 182
    .line 183
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    aget v14, v16, v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 188
    .line 189
    if-ne v14, v12, :cond_15

    .line 190
    .line 191
    :try_start_2
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    check-cast v14, Lcom/tencent/mmkv/MMKV;

    .line 196
    .line 197
    invoke-virtual {v14, v2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    if-eqz v14, :cond_b

    .line 202
    .line 203
    invoke-static {v14}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    if-eqz v15, :cond_a

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_a
    sget-object v0, Lyw2;->c:Lcom/google/gson/a;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v15, Lyi8;

    .line 216
    .line 217
    invoke-direct {v15, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v14, v15}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Lbq3;

    .line 225
    .line 226
    :goto_3
    move-object v14, v0

    .line 227
    goto :goto_5

    .line 228
    :catchall_0
    move-exception v0

    .line 229
    move-object/from16 v17, v3

    .line 230
    .line 231
    goto/16 :goto_c

    .line 232
    .line 233
    :cond_b
    :goto_4
    sget-object v14, Lyw2;->c:Lcom/google/gson/a;

    .line 234
    .line 235
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->d()Lsu/happ/proxyutility/dto/XRayConfig;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance v15, Lyi8;

    .line 247
    .line 248
    invoke-direct {v15, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v14, v0, v15}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Lbq3;

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :goto_5
    invoke-static {}, Ln67;->d()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    iget-object v15, v14, Lbq3;->X:Lya4;

    .line 263
    .line 264
    invoke-virtual {v15, v4}, Lya4;->containsKey(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    if-eqz v15, :cond_c

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_c
    const/4 v14, 0x0

    .line 272
    :goto_6
    if-eqz v14, :cond_3

    .line 273
    .line 274
    iget-object v14, v14, Lbq3;->X:Lya4;

    .line 275
    .line 276
    invoke-virtual {v14, v4}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    check-cast v14, Len3;

    .line 281
    .line 282
    if-eqz v14, :cond_3

    .line 283
    .line 284
    new-instance v15, Lhu;

    .line 285
    .line 286
    invoke-direct {v15, v14, v12}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 287
    .line 288
    .line 289
    new-instance v14, Lzw5;

    .line 290
    .line 291
    const/4 v12, 0x2

    .line 292
    invoke-direct {v14, v12}, Lzw5;-><init>(B)V

    .line 293
    .line 294
    .line 295
    new-instance v12, Lla2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 296
    .line 297
    move-object/from16 v17, v3

    .line 298
    .line 299
    const/4 v3, 0x1

    .line 300
    :try_start_3
    invoke-direct {v12, v15, v3, v14}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 301
    .line 302
    .line 303
    new-instance v3, Lzw5;

    .line 304
    .line 305
    const/4 v14, 0x3

    .line 306
    invoke-direct {v3, v14}, Lzw5;-><init>(B)V

    .line 307
    .line 308
    .line 309
    invoke-static {v12, v3}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    iget-object v12, v3, Lmd8;->a:Lu27;

    .line 314
    .line 315
    invoke-interface {v12}, Lu27;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    if-eqz v14, :cond_e

    .line 324
    .line 325
    iget-object v14, v3, Lmd8;->b:Lgn2;

    .line 326
    .line 327
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v15

    .line 331
    invoke-interface {v14, v15}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    move-object v15, v14

    .line 336
    check-cast v15, Lbq3;

    .line 337
    .line 338
    invoke-virtual {v15, v11}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 339
    .line 340
    .line 341
    move-result-object v18

    .line 342
    move-object/from16 v19, v3

    .line 343
    .line 344
    invoke-virtual/range {v18 .. v18}, Lbo3;->d()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    move-object/from16 v18, v12

    .line 349
    .line 350
    const-string v12, "socks"

    .line 351
    .line 352
    invoke-static {v3, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_d

    .line 357
    .line 358
    invoke-virtual {v15, v10}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v3}, Lbo3;->a()I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-ne v3, v0, :cond_d

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :catchall_1
    move-exception v0

    .line 370
    goto :goto_c

    .line 371
    :cond_d
    move-object/from16 v12, v18

    .line 372
    .line 373
    move-object/from16 v3, v19

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_e
    const/4 v14, 0x0

    .line 377
    :goto_8
    check-cast v14, Lbq3;

    .line 378
    .line 379
    if-eqz v14, :cond_16

    .line 380
    .line 381
    invoke-virtual {v14, v9}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 382
    .line 383
    .line 384
    move-result-object v14

    .line 385
    if-eqz v14, :cond_16

    .line 386
    .line 387
    instance-of v0, v14, Lbq3;

    .line 388
    .line 389
    if-eqz v0, :cond_f

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_f
    const/4 v14, 0x0

    .line 393
    :goto_9
    if-eqz v14, :cond_16

    .line 394
    .line 395
    invoke-virtual {v14}, Lbo3;->c()Lbq3;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0, v8}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    if-eqz v0, :cond_10

    .line 404
    .line 405
    invoke-virtual {v0}, Lbo3;->b()Len3;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lwv0;->q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, Lbo3;

    .line 414
    .line 415
    if-eqz v0, :cond_10

    .line 416
    .line 417
    invoke-virtual {v0}, Lbo3;->c()Lbq3;

    .line 418
    .line 419
    .line 420
    move-result-object v14

    .line 421
    goto :goto_a

    .line 422
    :cond_10
    const/4 v14, 0x0

    .line 423
    :goto_a
    if-eqz v14, :cond_11

    .line 424
    .line 425
    invoke-virtual {v14, v7}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-eqz v0, :cond_11

    .line 430
    .line 431
    invoke-virtual {v0}, Lbo3;->d()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-nez v0, :cond_12

    .line 436
    .line 437
    :cond_11
    iget-object v0, v1, Lc16;->g:Ljava/lang/String;

    .line 438
    .line 439
    :cond_12
    iput-object v0, v1, Lc16;->g:Ljava/lang/String;

    .line 440
    .line 441
    if-eqz v14, :cond_13

    .line 442
    .line 443
    invoke-virtual {v14, v6}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    if-eqz v0, :cond_13

    .line 448
    .line 449
    invoke-virtual {v0}, Lbo3;->d()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v14

    .line 453
    goto :goto_b

    .line 454
    :cond_13
    const/4 v14, 0x0

    .line 455
    :goto_b
    iput-object v14, v1, Lc16;->h:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :goto_c
    :try_start_4
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 459
    .line 460
    if-nez v3, :cond_14

    .line 461
    .line 462
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 463
    .line 464
    if-nez v3, :cond_14

    .line 465
    .line 466
    goto :goto_d

    .line 467
    :cond_14
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 468
    :catchall_2
    move-exception v0

    .line 469
    :try_start_5
    throw v0

    .line 470
    :cond_15
    move-object/from16 v17, v3

    .line 471
    .line 472
    iput-object v15, v1, Lc16;->g:Ljava/lang/String;

    .line 473
    .line 474
    invoke-static {}, Lc16;->c()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iput-object v0, v1, Lc16;->h:Ljava/lang/String;

    .line 479
    .line 480
    :cond_16
    :goto_d
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    const-string v3, "pref_http_auth_mode"

    .line 485
    .line 486
    const/4 v12, -0x1

    .line 487
    invoke-virtual {v0, v12, v3}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v14

    .line 495
    if-eq v0, v12, :cond_17

    .line 496
    .line 497
    goto :goto_e

    .line 498
    :cond_17
    const/4 v14, 0x0

    .line 499
    :goto_e
    if-eqz v14, :cond_18

    .line 500
    .line 501
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->b()Ll22;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    check-cast v3, Ln22;

    .line 510
    .line 511
    invoke-virtual {v3, v0}, Ln22;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 516
    .line 517
    if-eqz v0, :cond_18

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :cond_18
    sget-object v0, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->Companion:Lsu/happ/proxyutility/dto/enums/InboundAuthMode$Companion;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->a()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    :goto_f
    sget-object v3, Lz06;->b:[I

    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    aget v0, v3, v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 536
    .line 537
    const-string v3, "happ-http"

    .line 538
    .line 539
    const/4 v12, 0x1

    .line 540
    if-eq v0, v12, :cond_1e

    .line 541
    .line 542
    const/4 v12, 0x2

    .line 543
    if-eq v0, v12, :cond_1d

    .line 544
    .line 545
    const/4 v14, 0x3

    .line 546
    if-eq v0, v14, :cond_1a

    .line 547
    .line 548
    const/4 v14, 0x4

    .line 549
    if-ne v0, v14, :cond_19

    .line 550
    .line 551
    :try_start_6
    iput-object v3, v1, Lc16;->i:Ljava/lang/String;

    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    iput-object v14, v1, Lc16;->j:Ljava/lang/String;

    .line 555
    .line 556
    goto/16 :goto_19

    .line 557
    .line 558
    :cond_19
    new-instance v0, Lb55;

    .line 559
    .line 560
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 561
    .line 562
    .line 563
    throw v0

    .line 564
    :cond_1a
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    const-string v2, "pref_http_auth_manual_user"

    .line 569
    .line 570
    invoke-virtual {v0, v2, v13}, Lcom/tencent/mmkv/MMKV;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    if-nez v0, :cond_1b

    .line 575
    .line 576
    move-object v0, v13

    .line 577
    :cond_1b
    invoke-virtual {v1}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const-string v3, "pref_http_auth_manual_pass"

    .line 582
    .line 583
    invoke-virtual {v2, v3, v13}, Lcom/tencent/mmkv/MMKV;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    if-nez v2, :cond_1c

    .line 588
    .line 589
    goto :goto_10

    .line 590
    :cond_1c
    move-object v13, v2

    .line 591
    :goto_10
    iput-object v0, v1, Lc16;->i:Ljava/lang/String;

    .line 592
    .line 593
    iput-object v13, v1, Lc16;->j:Ljava/lang/String;

    .line 594
    .line 595
    goto/16 :goto_19

    .line 596
    .line 597
    :cond_1d
    iput-object v3, v1, Lc16;->i:Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {}, Lc16;->c()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    iput-object v0, v1, Lc16;->j:Ljava/lang/String;

    .line 604
    .line 605
    goto/16 :goto_19

    .line 606
    .line 607
    :cond_1e
    const/4 v14, 0x0

    .line 608
    sget-object v0, Lkw4;->a:Lkw4;

    .line 609
    .line 610
    invoke-static {v2}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    if-eqz v0, :cond_2b

    .line 615
    .line 616
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->c()Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 617
    .line 618
    .line 619
    move-result-object v12

    .line 620
    sget-object v13, Lz06;->a:[I

    .line 621
    .line 622
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 623
    .line 624
    .line 625
    move-result v12

    .line 626
    aget v12, v13, v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 627
    .line 628
    const/4 v13, 0x1

    .line 629
    if-ne v12, v13, :cond_2a

    .line 630
    .line 631
    :try_start_7
    invoke-virtual/range {v17 .. v17}, Lvz7;->getValue()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    check-cast v3, Lcom/tencent/mmkv/MMKV;

    .line 636
    .line 637
    invoke-virtual {v3, v2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    if-eqz v2, :cond_20

    .line 642
    .line 643
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 644
    .line 645
    .line 646
    move-result v3

    .line 647
    if-eqz v3, :cond_1f

    .line 648
    .line 649
    goto :goto_11

    .line 650
    :cond_1f
    sget-object v0, Lyw2;->c:Lcom/google/gson/a;

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    new-instance v3, Lyi8;

    .line 656
    .line 657
    invoke-direct {v3, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v2, v3}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    check-cast v0, Lbq3;

    .line 665
    .line 666
    goto :goto_12

    .line 667
    :catchall_3
    move-exception v0

    .line 668
    goto/16 :goto_18

    .line 669
    .line 670
    :cond_20
    :goto_11
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 671
    .line 672
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->d()Lsu/happ/proxyutility/dto/XRayConfig;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    new-instance v3, Lyi8;

    .line 684
    .line 685
    invoke-direct {v3, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2, v0, v3}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Lbq3;

    .line 693
    .line 694
    :goto_12
    invoke-static {}, Ln67;->b()I

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    iget-object v3, v0, Lbq3;->X:Lya4;

    .line 699
    .line 700
    invoke-virtual {v3, v4}, Lya4;->containsKey(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    if-eqz v3, :cond_21

    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_21
    move-object v0, v14

    .line 708
    :goto_13
    if-eqz v0, :cond_2b

    .line 709
    .line 710
    iget-object v0, v0, Lbq3;->X:Lya4;

    .line 711
    .line 712
    invoke-virtual {v0, v4}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    check-cast v0, Len3;

    .line 717
    .line 718
    if-eqz v0, :cond_2b

    .line 719
    .line 720
    new-instance v3, Lhu;

    .line 721
    .line 722
    const/4 v12, 0x1

    .line 723
    invoke-direct {v3, v0, v12}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 724
    .line 725
    .line 726
    new-instance v0, Lzw5;

    .line 727
    .line 728
    const/4 v4, 0x4

    .line 729
    invoke-direct {v0, v4}, Lzw5;-><init>(B)V

    .line 730
    .line 731
    .line 732
    new-instance v4, Lla2;

    .line 733
    .line 734
    invoke-direct {v4, v3, v12, v0}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 735
    .line 736
    .line 737
    new-instance v0, Lzw5;

    .line 738
    .line 739
    const/4 v3, 0x5

    .line 740
    invoke-direct {v0, v3}, Lzw5;-><init>(B)V

    .line 741
    .line 742
    .line 743
    invoke-static {v4, v0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    iget-object v3, v0, Lmd8;->a:Lu27;

    .line 748
    .line 749
    invoke-interface {v3}, Lu27;->iterator()Ljava/util/Iterator;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    :cond_22
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    if-eqz v4, :cond_23

    .line 758
    .line 759
    iget-object v4, v0, Lmd8;->b:Lgn2;

    .line 760
    .line 761
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    invoke-interface {v4, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    move-object v5, v4

    .line 770
    check-cast v5, Lbq3;

    .line 771
    .line 772
    invoke-virtual {v5, v11}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 773
    .line 774
    .line 775
    move-result-object v12

    .line 776
    invoke-virtual {v12}, Lbo3;->d()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v12

    .line 780
    const-string v13, "http"

    .line 781
    .line 782
    invoke-static {v12, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v12

    .line 786
    if-eqz v12, :cond_22

    .line 787
    .line 788
    invoke-virtual {v5, v10}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    invoke-virtual {v5}, Lbo3;->a()I

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    if-ne v5, v2, :cond_22

    .line 797
    .line 798
    goto :goto_14

    .line 799
    :cond_23
    move-object v4, v14

    .line 800
    :goto_14
    check-cast v4, Lbq3;

    .line 801
    .line 802
    if-eqz v4, :cond_2b

    .line 803
    .line 804
    invoke-virtual {v4, v9}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    if-eqz v0, :cond_2b

    .line 809
    .line 810
    instance-of v2, v0, Lbq3;

    .line 811
    .line 812
    if-eqz v2, :cond_24

    .line 813
    .line 814
    goto :goto_15

    .line 815
    :cond_24
    move-object v0, v14

    .line 816
    :goto_15
    if-eqz v0, :cond_2b

    .line 817
    .line 818
    invoke-virtual {v0}, Lbo3;->c()Lbq3;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-virtual {v0, v8}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    if-eqz v0, :cond_25

    .line 827
    .line 828
    invoke-virtual {v0}, Lbo3;->b()Len3;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    invoke-static {v0}, Lwv0;->q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    check-cast v0, Lbo3;

    .line 837
    .line 838
    if-eqz v0, :cond_25

    .line 839
    .line 840
    invoke-virtual {v0}, Lbo3;->c()Lbq3;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    goto :goto_16

    .line 845
    :cond_25
    move-object v0, v14

    .line 846
    :goto_16
    if-eqz v0, :cond_26

    .line 847
    .line 848
    invoke-virtual {v0, v7}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    if-eqz v2, :cond_26

    .line 853
    .line 854
    invoke-virtual {v2}, Lbo3;->d()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    if-nez v2, :cond_27

    .line 859
    .line 860
    :cond_26
    iget-object v2, v1, Lc16;->i:Ljava/lang/String;

    .line 861
    .line 862
    :cond_27
    iput-object v2, v1, Lc16;->i:Ljava/lang/String;

    .line 863
    .line 864
    if-eqz v0, :cond_28

    .line 865
    .line 866
    invoke-virtual {v0, v6}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    if-eqz v0, :cond_28

    .line 871
    .line 872
    invoke-virtual {v0}, Lbo3;->d()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    goto :goto_17

    .line 877
    :cond_28
    move-object v5, v14

    .line 878
    :goto_17
    iput-object v5, v1, Lc16;->j:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 879
    .line 880
    goto :goto_19

    .line 881
    :goto_18
    :try_start_8
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 882
    .line 883
    if-nez v2, :cond_29

    .line 884
    .line 885
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 886
    .line 887
    if-nez v2, :cond_29

    .line 888
    .line 889
    goto :goto_19

    .line 890
    :cond_29
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 891
    :catchall_4
    move-exception v0

    .line 892
    :try_start_9
    throw v0

    .line 893
    :cond_2a
    iput-object v3, v1, Lc16;->i:Ljava/lang/String;

    .line 894
    .line 895
    invoke-static {}, Lc16;->c()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    iput-object v0, v1, Lc16;->j:Ljava/lang/String;

    .line 900
    .line 901
    :cond_2b
    :goto_19
    invoke-virtual {v1}, Lc16;->j()Ljava/io/Serializable;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 902
    .line 903
    .line 904
    goto :goto_1a

    .line 905
    :catchall_5
    move-exception v0

    .line 906
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 907
    .line 908
    if-nez v1, :cond_2c

    .line 909
    .line 910
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 911
    .line 912
    if-nez v1, :cond_2c

    .line 913
    .line 914
    :goto_1a
    return-void

    .line 915
    :cond_2c
    throw v0
.end method

.method public final d()Lsu/happ/proxyutility/dto/AuthData;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc16;->h()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsu/happ/proxyutility/dto/AuthData;

    .line 5
    .line 6
    iget-object v1, p0, Lc16;->i:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lc16;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lsu/happ/proxyutility/dto/AuthData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final e()Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    iget-object p0, p0, Lc16;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f()Lsu/happ/proxyutility/dto/AuthData;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc16;->h()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsu/happ/proxyutility/dto/AuthData;

    .line 5
    .line 6
    iget-object v1, p0, Lc16;->g:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lc16;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lsu/happ/proxyutility/dto/AuthData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final g()Z
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/Socket;

    .line 2
    .line 3
    const-string v1, "127.0.0.1"

    .line 4
    .line 5
    invoke-static {}, Ln67;->d()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v1, v2}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 13
    .line 14
    .line 15
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    new-instance v1, Lrj6;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v1

    .line 33
    :goto_0
    instance-of v0, v0, Lrj6;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v1, 0x1e

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-lt v0, v1, :cond_0

    .line 43
    .line 44
    iget-object p0, p0, Lc16;->e:Ljava/lang/String;

    .line 45
    .line 46
    const-string v0, "su.happ.proxyutility"

    .line 47
    .line 48
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move p0, v2

    .line 54
    :goto_1
    if-eqz p0, :cond_1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    const/4 v2, 0x0

    .line 58
    :goto_2
    return v2

    .line 59
    :cond_2
    throw v0
.end method

.method public final h()V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "proxy_controller_auth_data"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v1, La16;

    .line 14
    .line 15
    invoke-direct {v1}, Lyi8;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 19
    .line 20
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Lcom/google/gson/a;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lsu/happ/proxyutility/dto/AuthData;

    .line 62
    .line 63
    const-string v3, "SOCKS"

    .line 64
    .line 65
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AuthData;->b()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iput-object v2, p0, Lc16;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AuthData;->a()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, p0, Lc16;->h:Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    const-string v3, "HTTP"

    .line 85
    .line 86
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_0

    .line 91
    .line 92
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AuthData;->b()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iput-object v2, p0, Lc16;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AuthData;->a()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, p0, Lc16;->j:Ljava/lang/String;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_0
    move-exception p0

    .line 109
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 110
    .line 111
    if-nez v0, :cond_4

    .line 112
    .line 113
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 114
    .line 115
    if-nez v0, :cond_4

    .line 116
    .line 117
    new-instance v0, Lrj6;

    .line 118
    .line 119
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, v0

    .line 123
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 124
    .line 125
    instance-of v1, p0, Lrj6;

    .line 126
    .line 127
    if-eqz v1, :cond_3

    .line 128
    .line 129
    move-object p0, v0

    .line 130
    :cond_3
    check-cast p0, Ljava/lang/Boolean;

    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    throw p0
.end method

.method public final i()V
    .locals 2

    .line 1
    const-string v0, "happ_user"

    .line 2
    .line 3
    :try_start_0
    iput-object v0, p0, Lc16;->g:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lc16;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lc16;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v1, p0, Lc16;->j:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0}, Lc16;->j()Ljava/io/Serializable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    throw p0
.end method

.method public final j()Ljava/io/Serializable;
    .locals 5

    .line 1
    :try_start_0
    const-string v0, "SOCKS"

    .line 2
    .line 3
    new-instance v1, Lsu/happ/proxyutility/dto/AuthData;

    .line 4
    .line 5
    iget-object v2, p0, Lc16;->g:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lc16;->h:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3}, Lsu/happ/proxyutility/dto/AuthData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lqg5;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "HTTP"

    .line 18
    .line 19
    new-instance v1, Lsu/happ/proxyutility/dto/AuthData;

    .line 20
    .line 21
    iget-object v3, p0, Lc16;->i:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p0, Lc16;->j:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v1, v3, v4}, Lsu/happ/proxyutility/dto/AuthData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lqg5;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v2, v3}, [Lqg5;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lzp4;->J([Lqg5;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Lc16;->e()Lcom/tencent/mmkv/MMKV;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v1, "proxy_controller_auth_data"

    .line 46
    .line 47
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v1, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    return-object p0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 64
    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 68
    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    new-instance v0, Lrj6;

    .line 72
    .line 73
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_0
    throw p0
.end method

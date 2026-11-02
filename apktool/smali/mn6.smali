.class public final Lmn6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j:Lvz7;

.field public static final k:Lvz7;


# instance fields
.field public final a:Lcom/tencent/mmkv/MMKV;

.field public final b:Lcom/tencent/mmkv/MMKV;

.field public final c:Lvz7;

.field public final d:Lfn6;

.field public final e:Ljava/util/concurrent/ConcurrentLinkedDeque;

.field public final f:Loh7;

.field public final g:Lh76;

.field public final h:Lvz7;

.field public final i:Lm51;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw76;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lvz7;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lmn6;->j:Lvz7;

    .line 14
    .line 15
    new-instance v0, Lw76;

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lvz7;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lmn6;->k:Lvz7;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lkw4;->a:Lkw4;

    .line 2
    .line 3
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lkw4;->h:Lvz7;

    .line 8
    .line 9
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lmn6;->a:Lcom/tencent/mmkv/MMKV;

    .line 22
    .line 23
    iput-object v1, p0, Lmn6;->b:Lcom/tencent/mmkv/MMKV;

    .line 24
    .line 25
    new-instance v0, Lw76;

    .line 26
    .line 27
    const/16 v1, 0xb

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lvz7;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lmn6;->c:Lvz7;

    .line 38
    .line 39
    new-instance v0, Lfn6;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, p0, v1}, Lfn6;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lmn6;->d:Lfn6;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lmn6;->e:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 53
    .line 54
    sget-object v0, Ldm5;->f0:Ldm5;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lmn6;->f:Loh7;

    .line 64
    .line 65
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lmn6;->g:Lh76;

    .line 70
    .line 71
    new-instance v0, Lhr5;

    .line 72
    .line 73
    const/4 v1, 0x7

    .line 74
    invoke-direct {v0, p0, v1}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lvz7;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lmn6;->h:Lvz7;

    .line 83
    .line 84
    invoke-static {}, Lpw7;->b()Low7;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v1, Ltp1;->a:Lnf1;

    .line 89
    .line 90
    sget-object v1, Ldm4;->a:Lhv2;

    .line 91
    .line 92
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, Lmn6;->i:Lm51;

    .line 101
    .line 102
    invoke-virtual {p0}, Lmn6;->v()V

    .line 103
    .line 104
    .line 105
    new-instance p0, Ljava/io/File;

    .line 106
    .line 107
    sget-object v0, Lss8;->a:Lss8;

    .line 108
    .line 109
    invoke-static {}, Lmn6;->j()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lss8;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v1, "geoip.dat"

    .line 118
    .line 119
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, Lqg5;

    .line 123
    .line 124
    sget-object v1, Lmr2;->Z:Lmr2;

    .line 125
    .line 126
    invoke-direct {v0, v1, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, Ljava/io/File;

    .line 130
    .line 131
    invoke-static {}, Lmn6;->j()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1}, Lss8;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v2, "geosite.dat"

    .line 140
    .line 141
    invoke-direct {p0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v1, Lqg5;

    .line 145
    .line 146
    sget-object v2, Lmr2;->Y:Lmr2;

    .line 147
    .line 148
    invoke-direct {v1, v2, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    filled-new-array {v0, v1}, [Lqg5;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, Lzp4;->K([Lqg5;)Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public static d(Ljava/lang/String;)Lsu/happ/proxyutility/dto/RouteSettings;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsu/happ/proxyutility/dto/RouteSettings;->Companion:Lsu/happ/proxyutility/dto/RouteSettings$Companion;

    .line 5
    .line 6
    invoke-static {}, Lmn6;->j()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lsu/happ/proxyutility/dto/RouteSettings;

    .line 17
    .line 18
    sget-object v2, Lss8;->a:Lss8;

    .line 19
    .line 20
    invoke-static {v1}, Lss8;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const v2, 0x7bffff

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Lsu/happ/proxyutility/dto/RouteSettings;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lmn6;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Lsu/happ/proxyutility/dto/RouteSettings;->Q(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/Object;
    .locals 21

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Lmn6;->j:Lvz7;

    .line 5
    .line 6
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/google/gson/a;

    .line 11
    .line 12
    const-class v1, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Lyi8;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p0

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_12

    .line 29
    .line 30
    move-object v2, v0

    .line 31
    check-cast v2, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 32
    .line 33
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->v()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const-string v0, "1.1.1.1"

    .line 40
    .line 41
    :cond_0
    move-object v3, v0

    .line 42
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->j()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    const-string v0, "8.8.8.8"

    .line 49
    .line 50
    :cond_1
    move-object v4, v0

    .line 51
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->w()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    sget-object v0, Lsu/happ/proxyutility/dto/RouteSettings;->Companion:Lsu/happ/proxyutility/dto/RouteSettings$Companion;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lsu/happ/proxyutility/dto/RouteSettings;->b()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/EDnsType;->b()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_2
    move-object v5, v0

    .line 71
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->k()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    sget-object v0, Lsu/happ/proxyutility/dto/RouteSettings;->Companion:Lsu/happ/proxyutility/dto/RouteSettings$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lsu/happ/proxyutility/dto/RouteSettings;->b()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/EDnsType;->b()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_3
    move-object v6, v0

    .line 91
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->u()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    const-string v0, "https://cloudflare-dns.com/dns-query"

    .line 98
    .line 99
    :cond_4
    move-object v7, v0

    .line 100
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->i()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    const-string v0, "https://dns.google/dns-query"

    .line 107
    .line 108
    :cond_5
    move-object v8, v0

    .line 109
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->o()Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    goto :goto_0

    .line 120
    :cond_6
    const/4 v0, 0x1

    .line 121
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->m()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-nez v0, :cond_7

    .line 130
    .line 131
    const-string v0, "https://github.com/Loyalsoldier/v2ray-rules-dat/releases/latest/download/geoip.dat"

    .line 132
    .line 133
    :cond_7
    move-object v10, v0

    .line 134
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->n()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-nez v0, :cond_8

    .line 139
    .line 140
    const-string v0, "https://github.com/Loyalsoldier/v2ray-rules-dat/releases/latest/download/geosite.dat"

    .line 141
    .line 142
    :cond_8
    move-object v11, v0

    .line 143
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->g()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-nez v0, :cond_9

    .line 148
    .line 149
    const-string v0, "IPIfNonMatch"

    .line 150
    .line 151
    :cond_9
    move-object v12, v0

    .line 152
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->f()Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    sget-object v0, Lsu/happ/proxyutility/dto/RouteSettings;->Companion:Lsu/happ/proxyutility/dto/RouteSettings$Companion;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Lsu/happ/proxyutility/dto/RouteSettings;->a()Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :cond_a
    move-object v13, v0

    .line 168
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->s()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Lmn6;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-nez v0, :cond_b

    .line 177
    .line 178
    new-instance v0, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    :cond_b
    move-object v14, v0

    .line 184
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->r()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lmn6;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-nez v0, :cond_c

    .line 193
    .line 194
    new-instance v0, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    :cond_c
    move-object v15, v0

    .line 200
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->e()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Lmn6;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-nez v0, :cond_d

    .line 209
    .line 210
    new-instance v0, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    :cond_d
    move-object/from16 v16, v0

    .line 216
    .line 217
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->d()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lmn6;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-nez v0, :cond_e

    .line 226
    .line 227
    new-instance v0, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 230
    .line 231
    .line 232
    :cond_e
    move-object/from16 v17, v0

    .line 233
    .line 234
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->c()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Lmn6;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-nez v0, :cond_f

    .line 243
    .line 244
    new-instance v0, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    :cond_f
    move-object/from16 v18, v0

    .line 250
    .line 251
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->b()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v0}, Lmn6;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-nez v0, :cond_10

    .line 260
    .line 261
    new-instance v0, Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 264
    .line 265
    .line 266
    :cond_10
    move-object/from16 v19, v0

    .line 267
    .line 268
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->x()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-nez v0, :cond_11

    .line 273
    .line 274
    sget-object v0, Lsu/happ/proxyutility/dto/RouteSettings;->Companion:Lsu/happ/proxyutility/dto/RouteSettings$Companion;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Lsu/happ/proxyutility/dto/RouteSettings;->c()Lsu/happ/proxyutility/dto/enums/RoutingOrder;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/RoutingOrder;->b()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    :cond_11
    move-object/from16 v20, v0

    .line 288
    .line 289
    invoke-static/range {v2 .. v20}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->a(Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :cond_12
    const-string v0, "Required value was null."

    .line 295
    .line 296
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 297
    .line 298
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 304
    .line 305
    if-nez v1, :cond_13

    .line 306
    .line 307
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 308
    .line 309
    if-nez v1, :cond_13

    .line 310
    .line 311
    new-instance v1, Lrj6;

    .line 312
    .line 313
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    return-object v1

    .line 317
    :cond_13
    throw v0
.end method

.method public static i(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static j()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 2
    .line 3
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->L0:Lu5;

    .line 8
    .line 9
    iget-object v0, v0, Lu5;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public static k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkw4;->h()Lcom/tencent/mmkv/MMKV;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "SELECTED_SERVER"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :goto_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {p0, v0, v2}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    return-object v1
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lss8;->a:Lss8;

    .line 2
    .line 3
    invoke-static {}, Lmn6;->j()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lss8;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "/"

    .line 12
    .line 13
    invoke-static {v0, v1, p0}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static r(Lmn6;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->e()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2, v0}, Lmn6;->u(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v2, v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 26
    .line 27
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, v3

    .line 34
    :goto_0
    if-nez v2, :cond_1

    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-static {v2}, Lmn6;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v22

    .line 45
    const/16 v25, 0x0

    .line 46
    .line 47
    const v26, 0x7bffff

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const/16 v23, 0x0

    .line 74
    .line 75
    const/16 v24, 0x0

    .line 76
    .line 77
    invoke-static/range {v4 .. v26}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 78
    .line 79
    .line 80
    move-result-object v29

    .line 81
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->d()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    invoke-static {v2}, Lmn6;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v22

    .line 91
    const/16 v25, 0x0

    .line 92
    .line 93
    const v26, 0x7bffff

    .line 94
    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v8, 0x0

    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v11, 0x0

    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v13, 0x0

    .line 105
    const/4 v14, 0x0

    .line 106
    const/4 v15, 0x0

    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const/16 v19, 0x0

    .line 114
    .line 115
    const/16 v20, 0x0

    .line 116
    .line 117
    const/16 v21, 0x0

    .line 118
    .line 119
    const/16 v23, 0x0

    .line 120
    .line 121
    const/16 v24, 0x0

    .line 122
    .line 123
    invoke-static/range {v4 .. v26}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object/from16 v30, v0

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    move-object/from16 v30, v3

    .line 131
    .line 132
    :goto_1
    const/16 v32, 0x0

    .line 133
    .line 134
    const/16 v33, 0x19

    .line 135
    .line 136
    const/16 v28, 0x0

    .line 137
    .line 138
    const/16 v31, 0x0

    .line 139
    .line 140
    move-object/from16 v27, p1

    .line 141
    .line 142
    invoke-static/range {v27 .. v33}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v1}, Lmn6;->l()Lht1;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/RouteSettings;->v()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/RouteSettings;->v()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    :try_start_0
    sget-object v7, Lmr2;->Z:Lmr2;

    .line 176
    .line 177
    invoke-static {v0, v5, v6, v7}, Lht1;->d(Lht1;Ljava/lang/String;Ljava/lang/String;Lmr2;)V

    .line 178
    .line 179
    .line 180
    sget-object v7, Lmr2;->Y:Lmr2;

    .line 181
    .line 182
    invoke-static {v0, v5, v6, v7}, Lht1;->d(Lht1;Ljava/lang/String;Ljava/lang/String;Lmr2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    instance-of v5, v0, Ljava/lang/InterruptedException;

    .line 188
    .line 189
    if-nez v5, :cond_3

    .line 190
    .line 191
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 192
    .line 193
    if-nez v5, :cond_3

    .line 194
    .line 195
    :goto_2
    new-instance v0, Ljava/io/File;

    .line 196
    .line 197
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/RouteSettings;->v()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 209
    .line 210
    .line 211
    new-instance v0, Lt16;

    .line 212
    .line 213
    const/4 v5, 0x6

    .line 214
    invoke-direct {v0, v4, v5}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v2, v3, v0}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :cond_3
    throw v0
.end method

.method public static w(Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;)Lsu/happ/proxyutility/dto/RouteSettings;
    .locals 47

    .line 1
    const/16 v22, 0x0

    .line 2
    .line 3
    const v23, 0x7fffff

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v12, 0x0

    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v14, 0x0

    .line 19
    const/4 v15, 0x0

    .line 20
    const/16 v16, 0x0

    .line 21
    .line 22
    const/16 v17, 0x0

    .line 23
    .line 24
    const/16 v18, 0x0

    .line 25
    .line 26
    const/16 v19, 0x0

    .line 27
    .line 28
    const/16 v20, 0x0

    .line 29
    .line 30
    const/16 v21, 0x0

    .line 31
    .line 32
    move-object/from16 v1, p0

    .line 33
    .line 34
    invoke-static/range {v1 .. v23}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->o()Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->t()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_0
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/RouteSettings;->O(Z)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->w()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object v2, v1

    .line 75
    :goto_1
    if-eqz v2, :cond_2

    .line 76
    .line 77
    sget-object v3, Lsu/happ/proxyutility/dto/enums/EDnsType;->Companion:Lsu/happ/proxyutility/dto/enums/EDnsType$Companion;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v2}, Lsu/happ/proxyutility/dto/enums/EDnsType$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->A()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_2
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->V(Lsu/happ/proxyutility/dto/enums/EDnsType;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->k()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_3

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    move-object v2, v1

    .line 112
    :goto_3
    if-eqz v2, :cond_4

    .line 113
    .line 114
    sget-object v3, Lsu/happ/proxyutility/dto/enums/EDnsType;->Companion:Lsu/happ/proxyutility/dto/enums/EDnsType$Companion;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, Lsu/happ/proxyutility/dto/enums/EDnsType$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_4
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->p()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    :goto_4
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->K(Lsu/happ/proxyutility/dto/enums/EDnsType;)V

    .line 131
    .line 132
    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->v()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-nez v3, :cond_5

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_5
    move-object v2, v1

    .line 149
    :goto_5
    if-eqz v2, :cond_6

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_6
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->z()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :goto_6
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->U(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->j()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_8

    .line 166
    .line 167
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-nez v3, :cond_7

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_7
    move-object v2, v1

    .line 175
    :goto_7
    if-eqz v2, :cond_8

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_8
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->o()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    :goto_8
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->J(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    if-eqz p1, :cond_a

    .line 186
    .line 187
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->u()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-eqz v2, :cond_a

    .line 192
    .line 193
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-nez v3, :cond_9

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_9
    move-object v2, v1

    .line 201
    :goto_9
    if-eqz v2, :cond_a

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_a
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->y()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    :goto_a
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->T(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    if-eqz p1, :cond_c

    .line 212
    .line 213
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->i()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    if-eqz v2, :cond_c

    .line 218
    .line 219
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v3, :cond_b

    .line 224
    .line 225
    goto :goto_b

    .line 226
    :cond_b
    move-object v2, v1

    .line 227
    :goto_b
    if-eqz v2, :cond_c

    .line 228
    .line 229
    goto :goto_c

    .line 230
    :cond_c
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->n()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    :goto_c
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->I(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    if-eqz p1, :cond_e

    .line 238
    .line 239
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->t()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-eqz v2, :cond_e

    .line 244
    .line 245
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-nez v3, :cond_d

    .line 250
    .line 251
    goto :goto_d

    .line 252
    :cond_d
    move-object v2, v1

    .line 253
    :goto_d
    if-eqz v2, :cond_e

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->U(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :cond_e
    if-eqz p1, :cond_10

    .line 259
    .line 260
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->h()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    if-eqz v2, :cond_10

    .line 265
    .line 266
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-nez v3, :cond_f

    .line 271
    .line 272
    goto :goto_e

    .line 273
    :cond_f
    move-object v2, v1

    .line 274
    :goto_e
    if-eqz v2, :cond_10

    .line 275
    .line 276
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->J(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_10
    if-eqz p1, :cond_12

    .line 280
    .line 281
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->m()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    if-eqz v2, :cond_12

    .line 286
    .line 287
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-nez v3, :cond_11

    .line 292
    .line 293
    goto :goto_f

    .line 294
    :cond_11
    move-object v2, v1

    .line 295
    :goto_f
    if-eqz v2, :cond_12

    .line 296
    .line 297
    goto :goto_10

    .line 298
    :cond_12
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    :goto_10
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->M(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    if-eqz p1, :cond_14

    .line 306
    .line 307
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->n()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    if-eqz v2, :cond_14

    .line 312
    .line 313
    invoke-static {v2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_13

    .line 318
    .line 319
    goto :goto_11

    .line 320
    :cond_13
    move-object v2, v1

    .line 321
    :goto_11
    if-eqz v2, :cond_14

    .line 322
    .line 323
    goto :goto_12

    .line 324
    :cond_14
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    :goto_12
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->N(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    if-eqz p1, :cond_17

    .line 332
    .line 333
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->g()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    if-eqz v2, :cond_17

    .line 338
    .line 339
    invoke-static {}, Lmn6;->j()Landroid/content/Context;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    sget v4, Lm26;->routing_domain_strategy:I

    .line 348
    .line 349
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->m()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    array-length v5, v3

    .line 361
    const/4 v6, 0x0

    .line 362
    :goto_13
    if-ge v6, v5, :cond_16

    .line 363
    .line 364
    aget-object v7, v3, v6

    .line 365
    .line 366
    invoke-static {v7, v2}, Lmm7;->S(Ljava/lang/String;Ljava/lang/String;)Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    if-eqz v8, :cond_15

    .line 371
    .line 372
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    move-object v4, v7

    .line 376
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 377
    .line 378
    goto :goto_13

    .line 379
    :cond_16
    invoke-virtual {v0, v4}, Lsu/happ/proxyutility/dto/RouteSettings;->H(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    :cond_17
    if-eqz p1, :cond_19

    .line 383
    .line 384
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->f()Ljava/util/Map;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    if-eqz v2, :cond_19

    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    if-nez v3, :cond_18

    .line 395
    .line 396
    goto :goto_14

    .line 397
    :cond_18
    move-object v2, v1

    .line 398
    :goto_14
    if-eqz v2, :cond_19

    .line 399
    .line 400
    goto :goto_15

    .line 401
    :cond_19
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->l()Ljava/util/Map;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    :goto_15
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->G(Ljava/util/Map;)V

    .line 406
    .line 407
    .line 408
    if-eqz p1, :cond_1b

    .line 409
    .line 410
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->s()Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-eqz v2, :cond_1b

    .line 415
    .line 416
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-nez v3, :cond_1a

    .line 421
    .line 422
    goto :goto_16

    .line 423
    :cond_1a
    move-object v2, v1

    .line 424
    :goto_16
    if-eqz v2, :cond_1b

    .line 425
    .line 426
    goto :goto_17

    .line 427
    :cond_1b
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->x()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    :goto_17
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->S(Ljava/util/List;)V

    .line 432
    .line 433
    .line 434
    if-eqz p1, :cond_1d

    .line 435
    .line 436
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->r()Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    if-eqz v2, :cond_1d

    .line 441
    .line 442
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    if-nez v3, :cond_1c

    .line 447
    .line 448
    goto :goto_18

    .line 449
    :cond_1c
    move-object v2, v1

    .line 450
    :goto_18
    if-eqz v2, :cond_1d

    .line 451
    .line 452
    goto :goto_19

    .line 453
    :cond_1d
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->w()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    :goto_19
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->R(Ljava/util/List;)V

    .line 458
    .line 459
    .line 460
    if-eqz p1, :cond_1f

    .line 461
    .line 462
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->e()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    if-eqz v2, :cond_1f

    .line 467
    .line 468
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-nez v3, :cond_1e

    .line 473
    .line 474
    goto :goto_1a

    .line 475
    :cond_1e
    move-object v2, v1

    .line 476
    :goto_1a
    if-eqz v2, :cond_1f

    .line 477
    .line 478
    goto :goto_1b

    .line 479
    :cond_1f
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->k()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    :goto_1b
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->F(Ljava/util/List;)V

    .line 484
    .line 485
    .line 486
    if-eqz p1, :cond_21

    .line 487
    .line 488
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->d()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    if-eqz v2, :cond_21

    .line 493
    .line 494
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    if-nez v3, :cond_20

    .line 499
    .line 500
    goto :goto_1c

    .line 501
    :cond_20
    move-object v2, v1

    .line 502
    :goto_1c
    if-eqz v2, :cond_21

    .line 503
    .line 504
    goto :goto_1d

    .line 505
    :cond_21
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->j()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    :goto_1d
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->E(Ljava/util/List;)V

    .line 510
    .line 511
    .line 512
    if-eqz p1, :cond_23

    .line 513
    .line 514
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->c()Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    if-eqz v2, :cond_23

    .line 519
    .line 520
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    if-nez v3, :cond_22

    .line 525
    .line 526
    goto :goto_1e

    .line 527
    :cond_22
    move-object v2, v1

    .line 528
    :goto_1e
    if-eqz v2, :cond_23

    .line 529
    .line 530
    goto :goto_1f

    .line 531
    :cond_23
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->g()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    :goto_1f
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->D(Ljava/util/List;)V

    .line 536
    .line 537
    .line 538
    if-eqz p1, :cond_25

    .line 539
    .line 540
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->b()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    if-eqz v2, :cond_25

    .line 545
    .line 546
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    if-nez v3, :cond_24

    .line 551
    .line 552
    goto :goto_20

    .line 553
    :cond_24
    move-object v2, v1

    .line 554
    :goto_20
    if-eqz v2, :cond_25

    .line 555
    .line 556
    goto :goto_21

    .line 557
    :cond_25
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->f()Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    :goto_21
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->C(Ljava/util/List;)V

    .line 562
    .line 563
    .line 564
    if-eqz p1, :cond_26

    .line 565
    .line 566
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->p()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    if-eqz v2, :cond_26

    .line 571
    .line 572
    invoke-static {v2}, Lmm7;->c0(Ljava/lang/String;)Ljava/lang/Long;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    goto :goto_22

    .line 577
    :cond_26
    move-object v2, v1

    .line 578
    :goto_22
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->P(Ljava/lang/Long;)V

    .line 579
    .line 580
    .line 581
    if-eqz p1, :cond_27

    .line 582
    .line 583
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->l()Z

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    goto :goto_23

    .line 588
    :cond_27
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->q()Z

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    :goto_23
    invoke-virtual {v0, v2}, Lsu/happ/proxyutility/dto/RouteSettings;->L(Z)V

    .line 593
    .line 594
    .line 595
    if-eqz p1, :cond_2b

    .line 596
    .line 597
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->x()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    if-eqz v2, :cond_2b

    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-lez v3, :cond_28

    .line 608
    .line 609
    goto :goto_24

    .line 610
    :cond_28
    move-object v2, v1

    .line 611
    :goto_24
    if-eqz v2, :cond_2b

    .line 612
    .line 613
    sget-object v3, Lsu/happ/proxyutility/dto/enums/RoutingOrder;->Companion:Lsu/happ/proxyutility/dto/enums/RoutingOrder$Companion;

    .line 614
    .line 615
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 619
    .line 620
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/RoutingOrder;->a()Ll22;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    :cond_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 636
    .line 637
    .line 638
    move-result v4

    .line 639
    if-eqz v4, :cond_2a

    .line 640
    .line 641
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    move-object v5, v4

    .line 646
    check-cast v5, Lsu/happ/proxyutility/dto/enums/RoutingOrder;

    .line 647
    .line 648
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/enums/RoutingOrder;->b()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v5

    .line 652
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 653
    .line 654
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v5

    .line 658
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v5

    .line 665
    if-eqz v5, :cond_29

    .line 666
    .line 667
    move-object v1, v4

    .line 668
    :cond_2a
    check-cast v1, Lsu/happ/proxyutility/dto/enums/RoutingOrder;

    .line 669
    .line 670
    if-eqz v1, :cond_2b

    .line 671
    .line 672
    goto :goto_25

    .line 673
    :cond_2b
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->B()Lsu/happ/proxyutility/dto/enums/RoutingOrder;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    :goto_25
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/RouteSettings;->W(Lsu/happ/proxyutility/dto/enums/RoutingOrder;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->k()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    invoke-static {v1}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 685
    .line 686
    .line 687
    move-result-object v37

    .line 688
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->j()Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-static {v1}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 693
    .line 694
    .line 695
    move-result-object v38

    .line 696
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->w()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-static {v1}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 701
    .line 702
    .line 703
    move-result-object v36

    .line 704
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->x()Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-static {v1}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 709
    .line 710
    .line 711
    move-result-object v35

    .line 712
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->f()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-static {v1}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 717
    .line 718
    .line 719
    move-result-object v40

    .line 720
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->g()Ljava/util/List;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-static {v1}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 725
    .line 726
    .line 727
    move-result-object v39

    .line 728
    const/16 v45, 0x0

    .line 729
    .line 730
    const v46, 0x7e07ff

    .line 731
    .line 732
    .line 733
    const/16 v25, 0x0

    .line 734
    .line 735
    const/16 v26, 0x0

    .line 736
    .line 737
    const/16 v27, 0x0

    .line 738
    .line 739
    const/16 v28, 0x0

    .line 740
    .line 741
    const/16 v29, 0x0

    .line 742
    .line 743
    const/16 v30, 0x0

    .line 744
    .line 745
    const/16 v31, 0x0

    .line 746
    .line 747
    const/16 v32, 0x0

    .line 748
    .line 749
    const/16 v33, 0x0

    .line 750
    .line 751
    const/16 v34, 0x0

    .line 752
    .line 753
    const/16 v41, 0x0

    .line 754
    .line 755
    const/16 v42, 0x0

    .line 756
    .line 757
    const/16 v43, 0x0

    .line 758
    .line 759
    const/16 v44, 0x0

    .line 760
    .line 761
    move-object/from16 v24, v0

    .line 762
    .line 763
    invoke-static/range {v24 .. v46}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    return-object v0
.end method

.method public static z(Lmn6;Ljava/lang/String;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->h()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lec7;->Y:Lec7;

    .line 28
    .line 29
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 48
    .line 49
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/4 v8, 0x0

    .line 54
    const/16 v9, 0xf

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-static/range {v3 .. v9}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v2, v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Lmn6;->f:Loh7;

    .line 77
    .line 78
    :cond_2
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    move-object v3, v2

    .line 83
    check-cast v3, Lcm5;

    .line 84
    .line 85
    new-instance v4, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 86
    .line 87
    invoke-direct {v4, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v3, v4, v0}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v1, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    invoke-virtual {p0}, Lmn6;->A()V

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lmn6;->g:Lh76;

    .line 2
    .line 3
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 4
    .line 5
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcm5;

    .line 10
    .line 11
    check-cast v0, Lb2;

    .line 12
    .line 13
    invoke-virtual {v0}, Lb2;->a()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-static {v1, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Lcom/google/gson/a;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/google/gson/a;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/google/gson/a;->k(Ljava/lang/Object;)Lbo3;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lbo3;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object p0, p0, Lmn6;->a:Lcom/tencent/mmkv/MMKV;

    .line 62
    .line 63
    const-string v1, "routing_profile_list"

    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v0, v1}, Lmn6;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lec7;->Y:Lec7;

    .line 35
    .line 36
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 55
    .line 56
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const/16 v9, 0xf

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-static/range {v3 .. v9}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v2, v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_3
    iget-object v0, p0, Lmn6;->f:Loh7;

    .line 91
    .line 92
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v2, v1

    .line 97
    check-cast v2, Lcm5;

    .line 98
    .line 99
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-instance v4, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 104
    .line 105
    invoke-direct {v4, v3}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v4, p1}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    invoke-virtual {p0}, Lmn6;->A()V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;Lmr2;ZLs51;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, Lkn6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lkn6;

    .line 7
    .line 8
    iget v1, v0, Lkn6;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkn6;->j0:I

    .line 18
    .line 19
    :goto_0
    move-object v2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lkn6;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lkn6;-><init>(Lmn6;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v2, Lkn6;->h0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v2, Lkn6;->j0:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    iget-boolean p4, v2, Lkn6;->g0:Z

    .line 37
    .line 38
    iget-object p1, v2, Lkn6;->f0:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v1, p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 p5, 0x0

    .line 56
    new-array p5, p5, [Lfn6;

    .line 57
    .line 58
    sget-object v0, Ld02;->X:Ld02;

    .line 59
    .line 60
    invoke-interface {v0, p5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p5

    .line 64
    check-cast p5, [Lfn6;

    .line 65
    .line 66
    array-length v0, p5

    .line 67
    invoke-static {p5, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p5

    .line 71
    move-object v7, p5

    .line 72
    check-cast v7, [Lfn6;

    .line 73
    .line 74
    iput-object p1, v2, Lkn6;->f0:Ljava/lang/String;

    .line 75
    .line 76
    iput-boolean p4, v2, Lkn6;->g0:Z

    .line 77
    .line 78
    iput v1, v2, Lkn6;->j0:I

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    move-object v1, p0

    .line 82
    move-object v4, p1

    .line 83
    move-object v5, p2

    .line 84
    move-object v3, p3

    .line 85
    invoke-virtual/range {v1 .. v7}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    sget-object p0, Lc71;->X:Lc71;

    .line 90
    .line 91
    if-ne p5, p0, :cond_3

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_3
    move-object p1, v4

    .line 95
    :goto_2
    check-cast p5, Lbm3;

    .line 96
    .line 97
    if-eqz p5, :cond_4

    .line 98
    .line 99
    if-eqz p4, :cond_4

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Lmn6;->a(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 105
    .line 106
    return-object p0
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p3, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 29
    .line 30
    invoke-static {p2, p3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    sget-object p3, Lec7;->Y:Lec7;

    .line 35
    .line 36
    invoke-virtual {p3}, Lec7;->c()Lqm5;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 55
    .line 56
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v2, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    move-object v1, p2

    .line 67
    :cond_1
    invoke-virtual {p3, v1}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {p3}, Lqm5;->c()Lj2;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_3
    iget-object p3, p0, Lmn6;->f:Loh7;

    .line 76
    .line 77
    invoke-virtual {p3}, Loh7;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move-object v1, v0

    .line 82
    check-cast v1, Lcm5;

    .line 83
    .line 84
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 89
    .line 90
    invoke-direct {v3, v2}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v3, p1}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p3, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-eqz p3, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0}, Lmn6;->A()V

    .line 104
    .line 105
    .line 106
    return-object p2
.end method

.method public final E(Ljava/lang/String;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    move/from16 v10, p5

    .line 10
    .line 11
    move-object/from16 v1, p6

    .line 12
    .line 13
    instance-of v2, v1, Lln6;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lln6;

    .line 19
    .line 20
    iget v3, v2, Lln6;->o0:I

    .line 21
    .line 22
    const/high16 v4, -0x80000000

    .line 23
    .line 24
    and-int v5, v3, v4

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    sub-int/2addr v3, v4

    .line 29
    iput v3, v2, Lln6;->o0:I

    .line 30
    .line 31
    :goto_0
    move-object v1, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v2, Lln6;

    .line 34
    .line 35
    invoke-direct {v2, v0, v1}, Lln6;-><init>(Lmn6;Ls51;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v2, v1, Lln6;->m0:Ljava/lang/Object;

    .line 40
    .line 41
    iget v3, v1, Lln6;->o0:I

    .line 42
    .line 43
    sget-object v11, Ldn8;->a:Ldn8;

    .line 44
    .line 45
    const/4 v12, 0x2

    .line 46
    const/4 v14, 0x1

    .line 47
    const/4 v15, 0x0

    .line 48
    sget-object v4, Lc71;->X:Lc71;

    .line 49
    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    if-eq v3, v14, :cond_2

    .line 53
    .line 54
    if-ne v3, v12, :cond_1

    .line 55
    .line 56
    iget-object v3, v1, Lln6;->g0:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, v1, Lln6;->f0:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_8

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v15

    .line 71
    :cond_2
    iget v3, v1, Lln6;->l0:I

    .line 72
    .line 73
    iget-boolean v5, v1, Lln6;->k0:Z

    .line 74
    .line 75
    iget-object v6, v1, Lln6;->j0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 76
    .line 77
    iget-object v7, v1, Lln6;->i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 78
    .line 79
    iget-object v8, v1, Lln6;->h0:[Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v8, [Lfn6;

    .line 82
    .line 83
    iget-object v9, v1, Lln6;->g0:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v10, v1, Lln6;->f0:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object v13, v4

    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_3
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz v10, :cond_4

    .line 97
    .line 98
    invoke-virtual/range {p0 .. p1}, Lmn6;->a(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {v0, v7, v15}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    goto/16 :goto_a

    .line 108
    .line 109
    :cond_5
    new-instance v3, Lt16;

    .line 110
    .line 111
    move-object/from16 v5, p2

    .line 112
    .line 113
    invoke-direct {v3, v0, v5}, Lt16;-><init>(Lmn6;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v7, v8, v3}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-nez v3, :cond_6

    .line 121
    .line 122
    goto/16 :goto_a

    .line 123
    .line 124
    :cond_6
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/RouteSettings;->u()Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-eqz v5, :cond_7

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    invoke-static {}, Ly08;->c()J

    .line 143
    .line 144
    .line 145
    move-result-wide v16

    .line 146
    cmp-long v5, v5, v16

    .line 147
    .line 148
    if-lez v5, :cond_7

    .line 149
    .line 150
    move v5, v14

    .line 151
    goto :goto_2

    .line 152
    :cond_7
    const/4 v5, 0x0

    .line 153
    :goto_2
    if-nez v5, :cond_9

    .line 154
    .line 155
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 168
    .line 169
    .line 170
    move-result-object v16

    .line 171
    invoke-virtual/range {v16 .. v16}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 172
    .line 173
    .line 174
    move-result-object v16

    .line 175
    invoke-virtual/range {v16 .. v16}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    invoke-static {v6, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-nez v6, :cond_8

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    move-object v0, v9

    .line 187
    move-object v9, v8

    .line 188
    move-object v8, v0

    .line 189
    move-object v13, v4

    .line 190
    move v4, v5

    .line 191
    move v5, v10

    .line 192
    const/4 v0, 0x0

    .line 193
    move-object v10, v7

    .line 194
    goto :goto_6

    .line 195
    :cond_9
    :goto_3
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    move-object v13, v4

    .line 200
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    array-length v12, v9

    .line 205
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    check-cast v12, [Lfn6;

    .line 210
    .line 211
    iput-object v7, v1, Lln6;->f0:Ljava/lang/String;

    .line 212
    .line 213
    iput-object v8, v1, Lln6;->g0:Ljava/lang/String;

    .line 214
    .line 215
    iput-object v9, v1, Lln6;->h0:[Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v2, v1, Lln6;->i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 218
    .line 219
    iput-object v3, v1, Lln6;->j0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 220
    .line 221
    iput-boolean v10, v1, Lln6;->k0:Z

    .line 222
    .line 223
    iput v5, v1, Lln6;->l0:I

    .line 224
    .line 225
    iput v14, v1, Lln6;->o0:I

    .line 226
    .line 227
    move/from16 v17, v5

    .line 228
    .line 229
    const/4 v5, 0x0

    .line 230
    move-object/from16 v18, v2

    .line 231
    .line 232
    sget-object v2, Lmr2;->Z:Lmr2;

    .line 233
    .line 234
    move-object/from16 v19, v12

    .line 235
    .line 236
    move-object v12, v3

    .line 237
    move-object v3, v6

    .line 238
    move-object/from16 v6, v19

    .line 239
    .line 240
    invoke-virtual/range {v0 .. v6}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    if-ne v2, v13, :cond_a

    .line 245
    .line 246
    goto/16 :goto_7

    .line 247
    .line 248
    :cond_a
    move-object v3, v9

    .line 249
    move-object v9, v8

    .line 250
    move-object v8, v3

    .line 251
    move v5, v10

    .line 252
    move-object v6, v12

    .line 253
    move/from16 v3, v17

    .line 254
    .line 255
    move-object v10, v7

    .line 256
    move-object/from16 v7, v18

    .line 257
    .line 258
    :goto_4
    if-eqz v2, :cond_b

    .line 259
    .line 260
    move v0, v14

    .line 261
    goto :goto_5

    .line 262
    :cond_b
    const/4 v0, 0x0

    .line 263
    :goto_5
    move v4, v3

    .line 264
    move-object v3, v6

    .line 265
    move-object v2, v7

    .line 266
    :goto_6
    if-nez v4, :cond_c

    .line 267
    .line 268
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-static {v2, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    if-nez v2, :cond_f

    .line 297
    .line 298
    :cond_c
    move-object v6, v3

    .line 299
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    array-length v2, v8

    .line 308
    invoke-static {v8, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    move-object v6, v2

    .line 313
    check-cast v6, [Lfn6;

    .line 314
    .line 315
    iput-object v10, v1, Lln6;->f0:Ljava/lang/String;

    .line 316
    .line 317
    iput-object v9, v1, Lln6;->g0:Ljava/lang/String;

    .line 318
    .line 319
    iput-object v15, v1, Lln6;->h0:[Ljava/lang/Object;

    .line 320
    .line 321
    iput-object v15, v1, Lln6;->i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 322
    .line 323
    iput-object v15, v1, Lln6;->j0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 324
    .line 325
    iput-boolean v5, v1, Lln6;->k0:Z

    .line 326
    .line 327
    iput v4, v1, Lln6;->l0:I

    .line 328
    .line 329
    const/4 v2, 0x2

    .line 330
    iput v2, v1, Lln6;->o0:I

    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    sget-object v2, Lmr2;->Y:Lmr2;

    .line 334
    .line 335
    move-object v4, v0

    .line 336
    move-object/from16 v0, p0

    .line 337
    .line 338
    invoke-virtual/range {v0 .. v6}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    if-ne v2, v13, :cond_d

    .line 343
    .line 344
    :goto_7
    return-object v13

    .line 345
    :cond_d
    move-object v3, v9

    .line 346
    move-object v1, v10

    .line 347
    :goto_8
    if-eqz v2, :cond_e

    .line 348
    .line 349
    move v13, v14

    .line 350
    goto :goto_9

    .line 351
    :cond_e
    const/4 v13, 0x0

    .line 352
    :goto_9
    move-object v10, v1

    .line 353
    move-object v9, v3

    .line 354
    move v0, v13

    .line 355
    :cond_f
    if-nez v0, :cond_10

    .line 356
    .line 357
    invoke-virtual/range {p0 .. p0}, Lmn6;->l()Lht1;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-object v0, v0, Lht1;->a:Ljava/util/List;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance v1, Ltm6;

    .line 367
    .line 368
    const/4 v2, 0x1

    .line 369
    move-object/from16 p4, p0

    .line 370
    .line 371
    move-object/from16 p3, v0

    .line 372
    .line 373
    move-object/from16 p1, v1

    .line 374
    .line 375
    move/from16 p6, v2

    .line 376
    .line 377
    move-object/from16 p5, v9

    .line 378
    .line 379
    move-object/from16 p2, v10

    .line 380
    .line 381
    invoke-direct/range {p1 .. p6}, Ltm6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v0, p4

    .line 385
    .line 386
    iget-object v0, v0, Lmn6;->e:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-static {v0, v1, v14}, Lbw0;->g0(Ljava/util/Collection;Lgn2;Z)Z

    .line 392
    .line 393
    .line 394
    :cond_10
    :goto_a
    return-object v11
.end method

.method public final F(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lmn6;->q(Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 12
    .line 13
    invoke-direct {v0, v1, v1}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;-><init>(ZZ)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-nez p1, :cond_2

    .line 25
    .line 26
    const-string p1, "Server-List"

    .line 27
    .line 28
    :cond_2
    const/4 v2, 0x2

    .line 29
    invoke-static {v0, p2, v1, v2}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->c(Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;ZZI)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object p0, p0, Lmn6;->b:Lcom/tencent/mmkv/MMKV;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/tencent/mmkv/MMKV;->o(Ljava/lang/String;Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lmn6;->e:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addFirst(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lmn6;->l()Lht1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, Lht1;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, Lat1;

    .line 42
    .line 43
    iget-object v3, v3, Lat1;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 p1, 0xa

    .line 58
    .line 59
    invoke-static {v1, p1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v2, 0x1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Lat1;

    .line 82
    .line 83
    iget-object v3, v1, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 84
    .line 85
    iget-object v1, v1, Lat1;->c:Lmr2;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    if-ne v1, v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->h()Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 109
    .line 110
    .line 111
    return v0

    .line 112
    :cond_4
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->i()Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_2
    new-instance v2, Lqg5;

    .line 125
    .line 126
    invoke-direct {v2, v3, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_6

    .line 138
    .line 139
    return v0

    .line 140
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_9

    .line 149
    .line 150
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Lqg5;

    .line 155
    .line 156
    iget-object p2, p1, Lqg5;->X:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p2, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 159
    .line 160
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Ljava/lang/Long;

    .line 163
    .line 164
    sget-object v1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 165
    .line 166
    if-eq p2, v1, :cond_8

    .line 167
    .line 168
    sget-object v1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->LINK_NOT_CORRECT:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 169
    .line 170
    if-ne p2, v1, :cond_7

    .line 171
    .line 172
    :cond_8
    if-nez p1, :cond_7

    .line 173
    .line 174
    return v2

    .line 175
    :cond_9
    return v0
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lmn6;->g:Lh76;

    .line 2
    .line 3
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 4
    .line 5
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 36
    .line 37
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lb83;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 62
    .line 63
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p0, v3, v2}, Lmn6;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lmn6;->e:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->clear()V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v0, p0, Lmn6;->f:Loh7;

    .line 77
    .line 78
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    move-object v2, v1

    .line 83
    check-cast v2, Lcm5;

    .line 84
    .line 85
    sget-object v2, Ldm5;->f0:Ldm5;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;[Lfn6;Ls51;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v7, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lcn6;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcn6;

    .line 11
    .line 12
    iget v3, v2, Lcn6;->l0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcn6;->l0:I

    .line 22
    .line 23
    :goto_0
    move-object v1, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcn6;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, Lcn6;-><init>(Lmn6;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v2, v1, Lcn6;->j0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v3, v1, Lcn6;->l0:I

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v9, 0x2

    .line 38
    const/4 v10, 0x0

    .line 39
    sget-object v11, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    if-ne v3, v9, :cond_1

    .line 46
    .line 47
    iget v3, v1, Lcn6;->i0:I

    .line 48
    .line 49
    iget-object v0, v1, Lcn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v10

    .line 65
    :cond_2
    iget v3, v1, Lcn6;->i0:I

    .line 66
    .line 67
    iget-object v4, v1, Lcn6;->h0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 68
    .line 69
    iget-object v5, v1, Lcn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 70
    .line 71
    iget-object v6, v1, Lcn6;->f0:[Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, [Lfn6;

    .line 74
    .line 75
    :try_start_1
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    move v7, v3

    .line 79
    move-object v12, v5

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :try_start_2
    invoke-virtual/range {p0 .. p2}, Lmn6;->u(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    instance-of v2, v12, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 89
    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    return-object v12

    .line 93
    :cond_4
    move-object v2, v12

    .line 94
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 95
    .line 96
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;->c()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {p0, v2, v10}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    if-nez v13, :cond_5

    .line 105
    .line 106
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 107
    .line 108
    return-object v0

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    move v3, v8

    .line 111
    goto :goto_5

    .line 112
    :cond_5
    sget-object v2, Lmr2;->Z:Lmr2;

    .line 113
    .line 114
    invoke-virtual {v13}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v13}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    array-length v6, v7

    .line 123
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    check-cast v6, [Lfn6;

    .line 128
    .line 129
    iput-object v7, v1, Lcn6;->f0:[Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v12, v1, Lcn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 132
    .line 133
    iput-object v13, v1, Lcn6;->h0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 134
    .line 135
    iput v8, v1, Lcn6;->i0:I

    .line 136
    .line 137
    iput v4, v1, Lcn6;->l0:I

    .line 138
    .line 139
    move-object v4, v5

    .line 140
    const/4 v5, 0x0

    .line 141
    move-object v0, p0

    .line 142
    invoke-virtual/range {v0 .. v6}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    if-ne v2, v11, :cond_6

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    move-object v6, v7

    .line 150
    move v7, v8

    .line 151
    move-object v4, v13

    .line 152
    :goto_2
    :try_start_3
    sget-object v2, Lmr2;->Y:Lmr2;

    .line 153
    .line 154
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    array-length v0, v6

    .line 163
    invoke-static {v6, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    move-object v6, v0

    .line 168
    check-cast v6, [Lfn6;

    .line 169
    .line 170
    iput-object v10, v1, Lcn6;->f0:[Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v12, v1, Lcn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 173
    .line 174
    iput-object v10, v1, Lcn6;->h0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 175
    .line 176
    iput v7, v1, Lcn6;->i0:I

    .line 177
    .line 178
    iput v9, v1, Lcn6;->l0:I

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    move-object v0, p0

    .line 182
    invoke-virtual/range {v0 .. v6}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    if-ne v0, v11, :cond_7

    .line 187
    .line 188
    :goto_3
    return-object v11

    .line 189
    :cond_7
    move v3, v7

    .line 190
    move-object v0, v12

    .line 191
    :goto_4
    :try_start_4
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 192
    .line 193
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;->c()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 198
    .line 199
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :catchall_2
    move-exception v0

    .line 204
    move v3, v7

    .line 205
    :goto_5
    if-eqz v3, :cond_8

    .line 206
    .line 207
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    const-string v2, "util.protection"

    .line 212
    .line 213
    invoke-static {v1, v2, v8}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-nez v1, :cond_8

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 220
    .line 221
    .line 222
    :cond_8
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 223
    .line 224
    if-nez v1, :cond_a

    .line 225
    .line 226
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 227
    .line 228
    if-nez v1, :cond_a

    .line 229
    .line 230
    new-instance v1, Lrj6;

    .line 231
    .line 232
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    :goto_6
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 236
    .line 237
    instance-of v2, v1, Lrj6;

    .line 238
    .line 239
    if-eqz v2, :cond_9

    .line 240
    .line 241
    move-object v1, v0

    .line 242
    :cond_9
    return-object v1

    .line 243
    :cond_a
    throw v0
.end method

.method public final g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Lzm6;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p5, v1}, Lzm6;-><init>(Lsu/happ/proxyutility/dto/RouteSettings;B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3, p4, v0}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 8
    .line 9
    .line 10
    move-result-object p5

    .line 11
    if-eqz p5, :cond_0

    .line 12
    .line 13
    invoke-virtual {p5}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    if-eqz p5, :cond_0

    .line 18
    .line 19
    invoke-virtual {p5}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->g()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lmn6;->l()Lht1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance p5, Lps;

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-direct {p5, v1}, Lps;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lmn6;->d:Lfn6;

    .line 36
    .line 37
    invoke-virtual {p5, p0}, Lps;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p5, p6}, Lps;->c(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p5, Lps;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    new-array p5, p5, [Lfn6;

    .line 50
    .line 51
    invoke-virtual {p0, p5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    move-object v6, p0

    .line 56
    check-cast v6, [Lfn6;

    .line 57
    .line 58
    move-object v1, p1

    .line 59
    move-object v2, p2

    .line 60
    move-object v3, p3

    .line 61
    move-object v4, p4

    .line 62
    invoke-virtual/range {v0 .. v6}, Lht1;->a(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;
    .locals 1

    .line 1
    const-string v0, "happ://"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-virtual {p0, p1, p2}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    sget-object p0, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$NoProfileSelected;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$NoProfileSelected;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0, p2, p1}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    sget-object p0, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$NoProfileSelected;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$NoProfileSelected;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    :try_start_0
    sget-object p1, Lss8;->a:Lss8;

    .line 28
    .line 29
    new-instance p1, Lcom/google/gson/a;

    .line 30
    .line 31
    invoke-direct {p1}, Lcom/google/gson/a;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->e()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p2, p0}, Lys0;->e0(Lsu/happ/proxyutility/dto/RouteSettings;Ljava/lang/String;)Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, p0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object p1, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->ROUTING:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 63
    .line 64
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance p2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, "add/"

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 91
    .line 92
    if-nez p1, :cond_3

    .line 93
    .line 94
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 95
    .line 96
    if-nez p1, :cond_3

    .line 97
    .line 98
    new-instance p1, Lrj6;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    move-object p0, p1

    .line 104
    :goto_0
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-nez p1, :cond_2

    .line 109
    .line 110
    check-cast p0, Ljava/lang/String;

    .line 111
    .line 112
    new-instance p1, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Success;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Success;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    sget-object p1, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Error;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Error;

    .line 119
    .line 120
    :goto_1
    return-object p1

    .line 121
    :cond_3
    throw p0
.end method

.method public final l()Lht1;
    .locals 0

    .line 1
    iget-object p0, p0, Lmn6;->c:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lht1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object p0, p0, Lmn6;->g:Lh76;

    .line 6
    .line 7
    if-nez p2, :cond_2

    .line 8
    .line 9
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 10
    .line 11
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcm5;

    .line 16
    .line 17
    check-cast p0, Lb2;

    .line 18
    .line 19
    invoke-virtual {p0}, Lb2;->e()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lxv0;->a0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    move-object v1, p2

    .line 42
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 43
    .line 44
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move-object v0, p2

    .line 55
    :cond_1
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 59
    .line 60
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Lcm5;

    .line 65
    .line 66
    new-instance v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 67
    .line 68
    invoke-direct {v1, p2}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lb83;

    .line 76
    .line 77
    if-eqz p0, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    move-object v1, p2

    .line 94
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 95
    .line 96
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    move-object v0, p2

    .line 107
    :cond_4
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 108
    .line 109
    :cond_5
    return-object v0
.end method

.method public final o(Ljava/lang/String;)Lb83;
    .locals 1

    .line 1
    iget-object p0, p0, Lmn6;->g:Lh76;

    .line 2
    .line 3
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 4
    .line 5
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcm5;

    .line 10
    .line 11
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lb83;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Lec7;->Y:Lec7;

    .line 25
    .line 26
    :cond_0
    return-object p0
.end method

.method public final p(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lmn6;->q(Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz p2, :cond_3

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0, p1}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    move-object p2, p1

    .line 40
    check-cast p2, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 41
    .line 42
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->h()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object p1, v1

    .line 54
    :goto_1
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object p1, v1

    .line 58
    :goto_2
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    return-object v1
.end method

.method public final q(Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    const-string p1, "Server-List"

    .line 15
    .line 16
    :cond_1
    iget-object p0, p0, Lmn6;->b:Lcom/tencent/mmkv/MMKV;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/tencent/mmkv/MMKV;->h(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 23
    .line 24
    return-object p0
.end method

.method public final s(Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;[Lfn6;ZZLs51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p3

    .line 6
    .line 7
    move/from16 v8, p4

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v1, p6

    .line 12
    .line 13
    instance-of v3, v1, Lgn6;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    check-cast v3, Lgn6;

    .line 19
    .line 20
    iget v4, v3, Lgn6;->o0:I

    .line 21
    .line 22
    const/high16 v6, -0x80000000

    .line 23
    .line 24
    and-int v9, v4, v6

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v4, v6

    .line 29
    iput v4, v3, Lgn6;->o0:I

    .line 30
    .line 31
    :goto_0
    move-object v1, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v3, Lgn6;

    .line 34
    .line 35
    invoke-direct {v3, v0, v1}, Lgn6;-><init>(Lmn6;Ls51;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v3, v1, Lgn6;->m0:Ljava/lang/Object;

    .line 40
    .line 41
    iget v4, v1, Lgn6;->o0:I

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x3

    .line 45
    const/4 v6, 0x1

    .line 46
    const/4 v11, 0x2

    .line 47
    const/4 v12, 0x0

    .line 48
    sget-object v13, Lc71;->X:Lc71;

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    if-eq v4, v6, :cond_3

    .line 53
    .line 54
    if-eq v4, v11, :cond_2

    .line 55
    .line 56
    if-ne v4, v10, :cond_1

    .line 57
    .line 58
    iget v2, v1, Lgn6;->l0:I

    .line 59
    .line 60
    iget-object v0, v1, Lgn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 61
    .line 62
    :try_start_0
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v12

    .line 76
    :cond_2
    iget v2, v1, Lgn6;->l0:I

    .line 77
    .line 78
    iget-boolean v4, v1, Lgn6;->k0:Z

    .line 79
    .line 80
    iget-boolean v5, v1, Lgn6;->j0:Z

    .line 81
    .line 82
    iget-object v6, v1, Lgn6;->i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 83
    .line 84
    iget-object v7, v1, Lgn6;->h0:Lsu/happ/proxyutility/dto/RouteSettings;

    .line 85
    .line 86
    iget-object v8, v1, Lgn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 87
    .line 88
    iget-object v11, v1, Lgn6;->f0:[Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v11, [Lfn6;

    .line 91
    .line 92
    :try_start_1
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    .line 95
    move v15, v4

    .line 96
    move-object v0, v7

    .line 97
    move-object v14, v8

    .line 98
    move v7, v2

    .line 99
    goto/16 :goto_3

    .line 100
    .line 101
    :cond_3
    iget v2, v1, Lgn6;->l0:I

    .line 102
    .line 103
    iget-object v0, v1, Lgn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 104
    .line 105
    :try_start_2
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :try_start_3
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->q()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    move-object/from16 v4, p2

    .line 117
    .line 118
    invoke-virtual {v0, v3, v4}, Lmn6;->u(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    instance-of v3, v14, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 123
    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    if-nez v8, :cond_5

    .line 127
    .line 128
    sget-object v0, Lmn6;->j:Lvz7;

    .line 129
    .line 130
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lcom/google/gson/a;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v14, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 141
    .line 142
    invoke-static {v14, v5, v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->c(Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;ZLjava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :catchall_1
    move-exception v0

    .line 148
    move v2, v9

    .line 149
    goto/16 :goto_6

    .line 150
    .line 151
    :cond_5
    instance-of v3, v14, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 152
    .line 153
    if-eqz v3, :cond_7

    .line 154
    .line 155
    move-object v3, v14

    .line 156
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 157
    .line 158
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    array-length v10, v7

    .line 163
    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    check-cast v7, [Lfn6;

    .line 168
    .line 169
    iput-object v12, v1, Lgn6;->f0:[Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v14, v1, Lgn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 172
    .line 173
    iput-boolean v8, v1, Lgn6;->j0:Z

    .line 174
    .line 175
    iput-boolean v5, v1, Lgn6;->k0:Z

    .line 176
    .line 177
    iput v9, v1, Lgn6;->l0:I

    .line 178
    .line 179
    iput v6, v1, Lgn6;->o0:I

    .line 180
    .line 181
    move-object v6, v1

    .line 182
    move-object v1, v3

    .line 183
    move-object v3, v4

    .line 184
    move-object v4, v7

    .line 185
    invoke-virtual/range {v0 .. v6}, Lmn6;->E(Ljava/lang/String;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 189
    if-ne v0, v13, :cond_6

    .line 190
    .line 191
    goto/16 :goto_4

    .line 192
    .line 193
    :cond_6
    move v2, v9

    .line 194
    move-object v0, v14

    .line 195
    :goto_2
    :try_start_4
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 196
    .line 197
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 205
    .line 206
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :cond_7
    move v15, v5

    .line 211
    :try_start_5
    instance-of v3, v14, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 212
    .line 213
    if-nez v3, :cond_8

    .line 214
    .line 215
    return-object v14

    .line 216
    :cond_8
    move-object v3, v14

    .line 217
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 218
    .line 219
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;->c()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v0, v3, v12}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    if-nez v3, :cond_9

    .line 228
    .line 229
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_9
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-static {v4, v2}, Lmn6;->w(Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    new-instance v4, Lzm6;

    .line 253
    .line 254
    invoke-direct {v4, v5, v9}, Lzm6;-><init>(Lsu/happ/proxyutility/dto/RouteSettings;B)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v2, v3, v4}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    if-nez v2, :cond_a

    .line 262
    .line 263
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 264
    .line 265
    return-object v0

    .line 266
    :cond_a
    if-eqz v15, :cond_b

    .line 267
    .line 268
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v0, v3}, Lmn6;->a(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :cond_b
    sget-object v3, Lmr2;->Z:Lmr2;

    .line 276
    .line 277
    move-object v4, v3

    .line 278
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    move-object v6, v4

    .line 283
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    array-length v10, v7

    .line 288
    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v10

    .line 292
    check-cast v10, [Lfn6;

    .line 293
    .line 294
    iput-object v7, v1, Lgn6;->f0:[Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v14, v1, Lgn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 297
    .line 298
    iput-object v5, v1, Lgn6;->h0:Lsu/happ/proxyutility/dto/RouteSettings;

    .line 299
    .line 300
    iput-object v2, v1, Lgn6;->i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 301
    .line 302
    iput-boolean v8, v1, Lgn6;->j0:Z

    .line 303
    .line 304
    iput-boolean v15, v1, Lgn6;->k0:Z

    .line 305
    .line 306
    iput v9, v1, Lgn6;->l0:I

    .line 307
    .line 308
    iput v11, v1, Lgn6;->o0:I

    .line 309
    .line 310
    move-object/from16 v16, v10

    .line 311
    .line 312
    move-object v10, v2

    .line 313
    move-object v2, v6

    .line 314
    move-object/from16 v6, v16

    .line 315
    .line 316
    invoke-virtual/range {v0 .. v6}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 320
    if-ne v2, v13, :cond_c

    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_c
    move-object v0, v5

    .line 324
    move-object v11, v7

    .line 325
    move v5, v8

    .line 326
    move v7, v9

    .line 327
    move-object v6, v10

    .line 328
    :goto_3
    :try_start_6
    sget-object v2, Lmr2;->Y:Lmr2;

    .line 329
    .line 330
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    array-length v6, v11

    .line 339
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    check-cast v6, [Lfn6;

    .line 344
    .line 345
    iput-object v12, v1, Lgn6;->f0:[Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v14, v1, Lgn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 348
    .line 349
    iput-object v12, v1, Lgn6;->h0:Lsu/happ/proxyutility/dto/RouteSettings;

    .line 350
    .line 351
    iput-object v12, v1, Lgn6;->i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 352
    .line 353
    iput-boolean v5, v1, Lgn6;->j0:Z

    .line 354
    .line 355
    iput-boolean v15, v1, Lgn6;->k0:Z

    .line 356
    .line 357
    iput v7, v1, Lgn6;->l0:I

    .line 358
    .line 359
    const/4 v5, 0x3

    .line 360
    iput v5, v1, Lgn6;->o0:I

    .line 361
    .line 362
    move-object v5, v0

    .line 363
    move-object/from16 v0, p0

    .line 364
    .line 365
    invoke-virtual/range {v0 .. v6}, Lmn6;->g(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 369
    if-ne v0, v13, :cond_d

    .line 370
    .line 371
    :goto_4
    return-object v13

    .line 372
    :cond_d
    move v2, v7

    .line 373
    move-object v0, v14

    .line 374
    :goto_5
    :try_start_7
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 375
    .line 376
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;->c()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    new-instance v1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 381
    .line 382
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :catchall_2
    move-exception v0

    .line 387
    move v2, v7

    .line 388
    :goto_6
    if-eqz v2, :cond_e

    .line 389
    .line 390
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    const-string v2, "util.protection"

    .line 395
    .line 396
    invoke-static {v1, v2, v9}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-nez v1, :cond_e

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 403
    .line 404
    .line 405
    :cond_e
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 406
    .line 407
    if-nez v1, :cond_10

    .line 408
    .line 409
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 410
    .line 411
    if-nez v1, :cond_10

    .line 412
    .line 413
    new-instance v1, Lrj6;

    .line 414
    .line 415
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    :goto_7
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 419
    .line 420
    instance-of v2, v1, Lrj6;

    .line 421
    .line 422
    if-eqz v2, :cond_f

    .line 423
    .line 424
    move-object v1, v0

    .line 425
    :cond_f
    return-object v1

    .line 426
    :cond_10
    throw v0
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Lhn6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lhn6;

    .line 7
    .line 8
    iget v1, v0, Lhn6;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lhn6;->j0:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lhn6;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lhn6;-><init>(Lmn6;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v7, Lhn6;->h0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v7, Lhn6;->j0:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v8, 0x1

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    if-ne v0, v8, :cond_1

    .line 36
    .line 37
    iget-object p1, v7, Lhn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;

    .line 38
    .line 39
    iget-object p2, v7, Lhn6;->f0:Ljava/lang/String;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    move-object v1, p0

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const/4 p5, 0x0

    .line 60
    const-string v0, "happ://"

    .line 61
    .line 62
    invoke-static {p1, p5, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_3

    .line 67
    .line 68
    sget-object p0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_3
    invoke-static {p1}, Lae1;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v0, p1}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz v2, :cond_c

    .line 80
    .line 81
    invoke-static {p1, v2}, Lae1;->c(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDeeplinkType;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string v0, "add/"

    .line 86
    .line 87
    invoke-static {p1, p5, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const-string v2, "onadd/"

    .line 92
    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    invoke-static {p1, p5, v2}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    const-string v1, "off"

    .line 102
    .line 103
    invoke-static {p1, p5, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    sget-object p0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    invoke-static {p1, p5, v2}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    new-instance p5, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;

    .line 119
    .line 120
    invoke-static {v2, p1}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p5, p1, v8, v8}, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;-><init>(Ljava/lang/String;ZZ)V

    .line 125
    .line 126
    .line 127
    move-object p1, p5

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-virtual {p0, p2, v8}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    new-instance v1, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;

    .line 136
    .line 137
    invoke-static {v0, p1}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-direct {v1, p1, p5, p5}, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;-><init>(Ljava/lang/String;ZZ)V

    .line 142
    .line 143
    .line 144
    :goto_2
    move-object p1, v1

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    new-instance v1, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;

    .line 147
    .line 148
    invoke-static {v0, p1}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {v1, p1, v8, p5}, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;-><init>(Ljava/lang/String;ZZ)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :goto_3
    sget-object p5, Lss8;->a:Lss8;

    .line 157
    .line 158
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;->b()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p5

    .line 162
    invoke-static {p5}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p5

    .line 166
    :try_start_1
    invoke-static {p5}, Lmn6;->f(Ljava/lang/String;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p5

    .line 170
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-object v2, p5

    .line 174
    check-cast v2, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 175
    .line 176
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->q()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p5

    .line 180
    invoke-static {p5}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result p5

    .line 184
    if-eqz p5, :cond_7

    .line 185
    .line 186
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;->y()V

    .line 187
    .line 188
    .line 189
    :cond_7
    array-length p5, p3

    .line 190
    invoke-static {p3, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    move-object v4, p3

    .line 195
    check-cast v4, [Lfn6;

    .line 196
    .line 197
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;->a()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    iput-object p2, v7, Lhn6;->f0:Ljava/lang/String;

    .line 202
    .line 203
    iput-object p1, v7, Lhn6;->g0:Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;

    .line 204
    .line 205
    iput v8, v7, Lhn6;->j0:I

    .line 206
    .line 207
    move-object v1, p0

    .line 208
    move-object v3, p2

    .line 209
    move v5, p4

    .line 210
    invoke-virtual/range {v1 .. v7}, Lmn6;->s(Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;[Lfn6;ZZLs51;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    sget-object p0, Lc71;->X:Lc71;

    .line 215
    .line 216
    if-ne p5, p0, :cond_8

    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_8
    move-object p2, v3

    .line 220
    :goto_4
    :try_start_2
    check-cast p5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 221
    .line 222
    instance-of p0, p5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 223
    .line 224
    if-eqz p0, :cond_9

    .line 225
    .line 226
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;->c()Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-eqz p0, :cond_9

    .line 231
    .line 232
    invoke-virtual {v1, p2, v8}, Lmn6;->F(Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :catchall_0
    move-exception v0

    .line 237
    move-object p0, v0

    .line 238
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 239
    .line 240
    if-nez p1, :cond_b

    .line 241
    .line 242
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 243
    .line 244
    if-nez p1, :cond_b

    .line 245
    .line 246
    new-instance p5, Lrj6;

    .line 247
    .line 248
    invoke-direct {p5, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    :cond_9
    :goto_5
    invoke-static {p5}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    if-nez p0, :cond_a

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_a
    sget-object p5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 259
    .line 260
    :goto_6
    return-object p5

    .line 261
    :cond_b
    throw p0

    .line 262
    :cond_c
    const-string p0, "Required value was null."

    .line 263
    .line 264
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object v1
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;->INSTANCE:Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {v0, v7}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v5, v3

    .line 36
    check-cast v5, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 37
    .line 38
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->e()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v5, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object v3, v4

    .line 54
    :goto_0
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    new-instance v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 59
    .line 60
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-direct {v0, v1, v2, v4, v3}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    sget-object v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;->Companion:Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId$Companion;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v9}, Lmn6;->d(Ljava/lang/String;)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v1, v0, Lmn6;->f:Loh7;

    .line 90
    .line 91
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lcm5;

    .line 96
    .line 97
    new-instance v5, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 98
    .line 99
    invoke-direct {v5, v7}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Lb83;

    .line 107
    .line 108
    const/4 v5, 0x1

    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    check-cast v4, Lz0;

    .line 112
    .line 113
    invoke-virtual {v4}, Lz0;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    move/from16 v33, v4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    move/from16 v33, v5

    .line 121
    .line 122
    :goto_1
    new-instance v4, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 123
    .line 124
    move-object v6, v1

    .line 125
    new-instance v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 126
    .line 127
    const/16 v31, 0x0

    .line 128
    .line 129
    const v32, 0x7fffff

    .line 130
    .line 131
    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    const/4 v14, 0x0

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/16 v23, 0x0

    .line 152
    .line 153
    const/16 v24, 0x0

    .line 154
    .line 155
    const/16 v25, 0x0

    .line 156
    .line 157
    const/16 v26, 0x0

    .line 158
    .line 159
    const/16 v27, 0x0

    .line 160
    .line 161
    const/16 v28, 0x0

    .line 162
    .line 163
    const/16 v29, 0x0

    .line 164
    .line 165
    const/16 v30, 0x0

    .line 166
    .line 167
    move-object v10, v3

    .line 168
    invoke-static/range {v10 .. v32}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    move-object v11, v6

    .line 173
    const/4 v6, 0x0

    .line 174
    move v12, v5

    .line 175
    const/4 v5, 0x0

    .line 176
    move-object/from16 v34, v4

    .line 177
    .line 178
    move-object v4, v3

    .line 179
    move-object v3, v10

    .line 180
    move-object/from16 v10, v34

    .line 181
    .line 182
    invoke-direct/range {v1 .. v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Z)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v10, v9, v7, v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;)V

    .line 186
    .line 187
    .line 188
    sget-object v1, Lec7;->Y:Lec7;

    .line 189
    .line 190
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v1, v8}, Lqm5;->addAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v10}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    :cond_5
    invoke-virtual {v11}, Loh7;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    move-object v3, v2

    .line 209
    check-cast v3, Lcm5;

    .line 210
    .line 211
    new-instance v4, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 212
    .line 213
    invoke-direct {v4, v7}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v3, v4, v1}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v11, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_5

    .line 225
    .line 226
    invoke-virtual {v0}, Lmn6;->A()V

    .line 227
    .line 228
    .line 229
    if-eqz v33, :cond_6

    .line 230
    .line 231
    invoke-virtual {v0, v7, v12}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v9, v7}, Lmn6;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_6
    new-instance v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 238
    .line 239
    invoke-direct {v0, v9}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object v0
.end method

.method public final v()V
    .locals 9

    .line 1
    const-string v0, "setting_geo_routing_profile"

    .line 2
    .line 3
    iget-object v1, p0, Lmn6;->a:Lcom/tencent/mmkv/MMKV;

    .line 4
    .line 5
    const-string v2, "setting_geo_routing_array_profiles"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    :try_start_0
    new-instance v5, Lin6;

    .line 17
    .line 18
    invoke-direct {v5}, Lyi8;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v5, v5, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 22
    .line 23
    sget-object v6, Lyw2;->a:Lsu2;

    .line 24
    .line 25
    new-instance v7, Lsu/happ/proxyutility/util/adapters/ParsingRoutingAdapter;

    .line 26
    .line 27
    invoke-direct {v7}, Lsu/happ/proxyutility/util/adapters/ParsingRoutingAdapter;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6, v5, v7}, Lsu2;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lcom/google/gson/a;

    .line 34
    .line 35
    invoke-direct {v7, v6}, Lcom/google/gson/a;-><init>(Lsu2;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    new-instance v8, Lyi8;

    .line 43
    .line 44
    invoke-direct {v8, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7, v3, v8}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast v3, Ljava/lang/Iterable;

    .line 55
    .line 56
    new-instance v5, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 76
    .line 77
    invoke-static {p0, v7}, Lmn6;->r(Lmn6;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_4

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    move-object v7, v5

    .line 104
    check-cast v7, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 105
    .line 106
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->e()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v7, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_3

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    move-object v5, v4

    .line 122
    :goto_1
    check-cast v5, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 123
    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {p0, v3, v4}, Lmn6;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v1, v0}, Lcom/tencent/mmkv/MMKV;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lcom/tencent/mmkv/MMKV;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :goto_2
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 141
    .line 142
    if-nez v2, :cond_e

    .line 143
    .line 144
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 145
    .line 146
    if-nez v2, :cond_e

    .line 147
    .line 148
    :goto_3
    const-string v0, "routing_profile_list"

    .line 149
    .line 150
    invoke-virtual {v1, v0}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-nez v2, :cond_6

    .line 155
    .line 156
    goto/16 :goto_7

    .line 157
    .line 158
    :cond_6
    :try_start_1
    new-instance v3, Ljn6;

    .line 159
    .line 160
    invoke-direct {v3}, Lyi8;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-object v3, v3, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 164
    .line 165
    sget-object v5, Lmn6;->k:Lvz7;

    .line 166
    .line 167
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    check-cast v5, Lcom/google/gson/a;

    .line 172
    .line 173
    invoke-virtual {v5, v2, v3}, Lcom/google/gson/a;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Ljava/util/List;

    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-nez v3, :cond_7

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 194
    .line 195
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->d()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-nez v3, :cond_7

    .line 204
    .line 205
    invoke-virtual {v1, v0}, Lcom/tencent/mmkv/MMKV;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lmn6;->i:Lm51;

    .line 209
    .line 210
    sget-object v1, Ltp1;->a:Lnf1;

    .line 211
    .line 212
    sget-object v1, Ldm4;->a:Lhv2;

    .line 213
    .line 214
    new-instance v3, Lr5;

    .line 215
    .line 216
    const/16 v5, 0x1b

    .line 217
    .line 218
    invoke-direct {v3, p0, v4, v5}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 219
    .line 220
    .line 221
    const/4 v4, 0x2

    .line 222
    invoke-static {v0, v1, v3, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 223
    .line 224
    .line 225
    :cond_7
    iget-object p0, p0, Lmn6;->f:Loh7;

    .line 226
    .line 227
    :cond_8
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object v1, v0

    .line 232
    check-cast v1, Lcm5;

    .line 233
    .line 234
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 235
    .line 236
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-eqz v4, :cond_a

    .line 248
    .line 249
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    move-object v5, v4

    .line 254
    check-cast v5, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 255
    .line 256
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    new-instance v6, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 261
    .line 262
    invoke-direct {v6, v5}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    if-nez v5, :cond_9

    .line 270
    .line 271
    new-instance v5, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_9
    check-cast v5, Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_a
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 286
    .line 287
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    invoke-static {v4}, Laq4;->G(I)I

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v1, Ljava/lang/Iterable;

    .line 303
    .line 304
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_b

    .line 313
    .line 314
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    move-object v5, v4

    .line 319
    check-cast v5, Ljava/util/Map$Entry;

    .line 320
    .line 321
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    check-cast v4, Ljava/util/Map$Entry;

    .line 326
    .line 327
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    check-cast v4, Ljava/lang/Iterable;

    .line 332
    .line 333
    invoke-static {v4}, Lmb6;->d0(Ljava/lang/Iterable;)Lb83;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_b
    sget-object v1, Ldm5;->f0:Ldm5;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-eqz v4, :cond_c

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_c
    new-instance v4, Lem5;

    .line 354
    .line 355
    invoke-direct {v4, v1}, Lem5;-><init>(Ldm5;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v4, v3}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v4}, Lem5;->f()Lcm5;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    :goto_6
    invoke-virtual {p0, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 369
    if-eqz v0, :cond_8

    .line 370
    .line 371
    goto :goto_7

    .line 372
    :catchall_1
    move-exception p0

    .line 373
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 374
    .line 375
    if-nez v0, :cond_d

    .line 376
    .line 377
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 378
    .line 379
    if-nez v0, :cond_d

    .line 380
    .line 381
    :goto_7
    return-void

    .line 382
    :cond_d
    throw p0

    .line 383
    :cond_e
    throw v0
.end method

.method public final x(Ljava/lang/String;Z)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0, v1, v2}, Lmn6;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lmn6;->e:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {p0, p2, v1}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lmn6;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {p0}, Lmn6;->l()Lht1;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object v5, p2, Lht1;->a:Ljava/util/List;

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v3, Ltm6;

    .line 58
    .line 59
    const/4 v8, 0x1

    .line 60
    move-object v6, p0

    .line 61
    move-object v4, p1

    .line 62
    invoke-direct/range {v3 .. v8}, Ltm6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3, v1}, Lbw0;->g0(Ljava/util/Collection;Lgn2;Z)Z

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    move-object v6, p0

    .line 73
    move-object v4, p1

    .line 74
    new-instance p0, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 75
    .line 76
    invoke-direct {p0, v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-static {v6, v4}, Lmn6;->z(Lmn6;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/io/File;

    .line 20
    .line 21
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->v()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lda2;->R(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lmn6;->l()Lht1;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v4, Lmr2;->Y:Lmr2;

    .line 52
    .line 53
    invoke-virtual {v1, v4, v2}, Lht1;->e(Lmr2;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v5, v1, Lht1;->b:Loh7;

    .line 57
    .line 58
    :cond_1
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    move-object v7, v6

    .line 63
    check-cast v7, Lcm5;

    .line 64
    .line 65
    new-instance v8, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 66
    .line 67
    invoke-direct {v8, v4, v2, v3}, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;-><init>(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {v7, v8}, Lcm5;->l(Landroid/os/Parcelable;)Lcm5;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v5, v6, v7}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    sget-object v8, Lmr2;->Z:Lmr2;

    .line 92
    .line 93
    invoke-virtual {v1, v8, v6}, Lht1;->e(Lmr2;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Lcm5;

    .line 102
    .line 103
    new-instance v3, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 104
    .line 105
    invoke-direct {v3, v8, v6, v7}, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;-><init>(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-interface {v2, v3}, Lcm5;->l(Landroid/os/Parcelable;)Lcm5;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v5, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const/4 v2, 0x1

    .line 126
    invoke-virtual {p0, v1, v2}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v2, Lec7;->Y:Lec7;

    .line 134
    .line 135
    invoke-virtual {v2}, Lec7;->c()Lqm5;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    new-instance v3, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_4

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-nez v5, :cond_3

    .line 163
    .line 164
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_4
    invoke-virtual {v2, v3}, Lqm5;->addAll(Ljava/util/Collection;)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Lqm5;->c()Lj2;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    :cond_5
    iget-object v0, p0, Lmn6;->f:Loh7;

    .line 176
    .line 177
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    move-object v4, v3

    .line 182
    check-cast v4, Lcm5;

    .line 183
    .line 184
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    new-instance v6, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 189
    .line 190
    invoke-direct {v6, v5}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v4, v6, v2}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v0, v3, v4}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    const/4 v0, 0x0

    .line 204
    if-nez v1, :cond_6

    .line 205
    .line 206
    move p1, v0

    .line 207
    goto :goto_1

    .line 208
    :cond_6
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    :goto_1
    if-eqz p1, :cond_a

    .line 213
    .line 214
    invoke-virtual {v2, v0}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    move-object v2, v1

    .line 229
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 230
    .line 231
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {p0, v3, v2}, Lmn6;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_7

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_8
    const/4 v1, 0x0

    .line 247
    :goto_2
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 248
    .line 249
    if-eqz v1, :cond_9

    .line 250
    .line 251
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-virtual {p0, p1, p2}, Lmn6;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_9
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p0, p1, v0}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_a
    if-nez v1, :cond_b

    .line 272
    .line 273
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p0, p1, v0}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 278
    .line 279
    .line 280
    :cond_b
    :goto_3
    invoke-virtual {p0}, Lmn6;->A()V

    .line 281
    .line 282
    .line 283
    return-void
.end method

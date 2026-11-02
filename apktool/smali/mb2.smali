.class public final Lmb2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lnb2;


# static fields
.field public static final l:Ljava/lang/Object;


# instance fields
.field public final a:Lxa2;

.field public final b:Lkb2;

.field public final c:Lzz2;

.field public final d:Lts8;

.field public final e:Lh44;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/util/concurrent/ExecutorService;

.field public final h:Lb37;

.field public i:Ljava/lang/String;

.field public final j:Ljava/util/HashSet;

.field public final k:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmb2;->l:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lxa2;Lw06;Ljava/util/concurrent/ExecutorService;Lb37;)V
    .locals 5

    .line 1
    new-instance v0, Lkb2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lxa2;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lxa2;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lkb2;-><init>(Landroid/content/Context;Lw06;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lzz2;

    .line 12
    .line 13
    const/16 v1, 0x15

    .line 14
    .line 15
    invoke-direct {p2, p1, v1}, Lzz2;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lwe5;->Y:Lwe5;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Lwe5;

    .line 23
    .line 24
    const/16 v2, 0x1d

    .line 25
    .line 26
    invoke-direct {v1, v2}, Lwe5;-><init>(B)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lwe5;->Y:Lwe5;

    .line 30
    .line 31
    :cond_0
    sget-object v2, Lts8;->b:Lts8;

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    new-instance v2, Lts8;

    .line 36
    .line 37
    invoke-direct {v2, v1}, Lts8;-><init>(Lwe5;)V

    .line 38
    .line 39
    .line 40
    sput-object v2, Lts8;->b:Lts8;

    .line 41
    .line 42
    :cond_1
    new-instance v1, Lh44;

    .line 43
    .line 44
    new-instance v3, Lqy0;

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-direct {v3, p1, v4}, Lqy0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v3}, Lh44;-><init>(Lw06;)V

    .line 51
    .line 52
    .line 53
    new-instance v3, Ln66;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v3, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v3, p0, Lmb2;->f:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance v3, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, Lmb2;->j:Ljava/util/HashSet;

    .line 71
    .line 72
    new-instance v3, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v3, p0, Lmb2;->k:Ljava/util/ArrayList;

    .line 78
    .line 79
    iput-object p1, p0, Lmb2;->a:Lxa2;

    .line 80
    .line 81
    iput-object v0, p0, Lmb2;->b:Lkb2;

    .line 82
    .line 83
    iput-object p2, p0, Lmb2;->c:Lzz2;

    .line 84
    .line 85
    iput-object v2, p0, Lmb2;->d:Lts8;

    .line 86
    .line 87
    iput-object v1, p0, Lmb2;->e:Lh44;

    .line 88
    .line 89
    iput-object p3, p0, Lmb2;->g:Ljava/util/concurrent/ExecutorService;

    .line 90
    .line 91
    iput-object p4, p0, Lmb2;->h:Lb37;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    sget-object v0, Lmb2;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lmb2;->a:Lxa2;

    .line 5
    .line 6
    invoke-virtual {v1}, Lxa2;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, v1, Lxa2;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v1}, Lmj0;->t(Landroid/content/Context;)Lmj0;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object v2, p0, Lmb2;->c:Lzz2;

    .line 16
    .line 17
    invoke-virtual {v2}, Lzz2;->K0()Lbz;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v3, v2, Lbz;->b:I

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x1

    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    if-ne v3, v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move v3, v5

    .line 33
    :goto_1
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lmb2;->f(Lbz;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v4, p0, Lmb2;->c:Lzz2;

    .line 40
    .line 41
    invoke-virtual {v2}, Lbz;->a()Laz;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput-object v3, v2, Laz;->a:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    iput v3, v2, Laz;->b:I

    .line 49
    .line 50
    invoke-virtual {v2}, Laz;->a()Lbz;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v4, v2}, Lzz2;->r0(Lbz;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_4

    .line 60
    :cond_2
    :goto_2
    if-eqz v1, :cond_3

    .line 61
    .line 62
    :try_start_2
    invoke-virtual {v1}, Lmj0;->V()V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    goto :goto_5

    .line 68
    :cond_3
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    invoke-virtual {p0, v2}, Lmb2;->i(Lbz;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lmb2;->h:Lb37;

    .line 73
    .line 74
    new-instance v1, Llb2;

    .line 75
    .line 76
    invoke-direct {v1, p0, v5}, Llb2;-><init>(Lmb2;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lb37;->execute(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :goto_4
    if-eqz v1, :cond_4

    .line 84
    .line 85
    :try_start_3
    invoke-virtual {v1}, Lmj0;->V()V

    .line 86
    .line 87
    .line 88
    :cond_4
    throw p0

    .line 89
    :goto_5
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    throw p0
.end method

.method public final b(Lbz;)Lbz;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lmb2;->b:Lkb2;

    .line 6
    .line 7
    iget-object v3, v1, Lmb2;->a:Lxa2;

    .line 8
    .line 9
    invoke-virtual {v3}, Lxa2;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v3, v3, Lxa2;->c:Luc2;

    .line 13
    .line 14
    iget-object v3, v3, Luc2;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, v0, Lbz;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, v1, Lmb2;->a:Lxa2;

    .line 19
    .line 20
    invoke-virtual {v5}, Lxa2;->a()V

    .line 21
    .line 22
    .line 23
    iget-object v5, v5, Lxa2;->c:Luc2;

    .line 24
    .line 25
    iget-object v5, v5, Luc2;->h:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v6, v0, Lbz;->d:Ljava/lang/String;

    .line 28
    .line 29
    const-string v7, "Firebase Installations Service is unavailable. Please try again later."

    .line 30
    .line 31
    iget-object v8, v2, Lkb2;->c:Lxe3;

    .line 32
    .line 33
    invoke-virtual {v8}, Lxe3;->a()Z

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    if-eqz v9, :cond_c

    .line 38
    .line 39
    new-instance v9, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v10, "projects/"

    .line 42
    .line 43
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v5, "/installations/"

    .line 50
    .line 51
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v4, "/authTokens:generate"

    .line 58
    .line 59
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4}, Lkb2;->a(Ljava/lang/String;)Ljava/net/URL;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const/4 v9, 0x0

    .line 71
    :goto_0
    const/4 v10, 0x1

    .line 72
    if-gt v9, v10, :cond_b

    .line 73
    .line 74
    const v11, 0x8003

    .line 75
    .line 76
    .line 77
    invoke-static {v11}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4, v3}, Lkb2;->c(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    :try_start_0
    const-string v12, "POST"

    .line 85
    .line 86
    invoke-virtual {v11, v12}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v12, "Authorization"

    .line 90
    .line 91
    new-instance v13, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v14, "FIS_v2 "

    .line 97
    .line 98
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    invoke-virtual {v11, v12, v13}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11, v10}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 112
    .line 113
    .line 114
    invoke-static {v11}, Lkb2;->h(Ljava/net/HttpURLConnection;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-virtual {v8, v12}, Lxe3;->c(I)V

    .line 122
    .line 123
    .line 124
    const/16 v13, 0xc8

    .line 125
    .line 126
    if-lt v12, v13, :cond_0

    .line 127
    .line 128
    const/16 v13, 0x12c

    .line 129
    .line 130
    if-ge v12, v13, :cond_0

    .line 131
    .line 132
    move v13, v10

    .line 133
    goto :goto_1

    .line 134
    :cond_0
    const/4 v13, 0x0

    .line 135
    :goto_1
    const/4 v14, 0x2

    .line 136
    const/4 v15, 0x0

    .line 137
    if-eqz v13, :cond_1

    .line 138
    .line 139
    invoke-static {v11}, Lkb2;->f(Ljava/net/HttpURLConnection;)Lpz;

    .line 140
    .line 141
    .line 142
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 144
    .line 145
    .line 146
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :catch_0
    move-object/from16 v16, v6

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_1
    :try_start_1
    invoke-static {v11, v15}, Lkb2;->b(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    .line 158
    .line 159
    const/16 v13, 0x191

    .line 160
    .line 161
    move-object/from16 v16, v6

    .line 162
    .line 163
    const-wide/16 v5, 0x0

    .line 164
    .line 165
    if-eq v12, v13, :cond_6

    .line 166
    .line 167
    const/16 v13, 0x194

    .line 168
    .line 169
    if-ne v12, v13, :cond_2

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_2
    const/16 v13, 0x1ad

    .line 173
    .line 174
    if-eq v12, v13, :cond_5

    .line 175
    .line 176
    const/16 v13, 0x1f4

    .line 177
    .line 178
    if-lt v12, v13, :cond_3

    .line 179
    .line 180
    const/16 v13, 0x258

    .line 181
    .line 182
    if-ge v12, v13, :cond_3

    .line 183
    .line 184
    :catch_1
    :goto_2
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_7

    .line 191
    .line 192
    :cond_3
    const/4 v12, 0x0

    .line 193
    or-int/2addr v12, v10

    .line 194
    int-to-byte v12, v12

    .line 195
    if-ne v12, v10, :cond_4

    .line 196
    .line 197
    :try_start_2
    new-instance v12, Lpz;

    .line 198
    .line 199
    invoke-direct {v12, v14, v15, v5, v6}, Lpz;-><init>(ILjava/lang/String;J)V
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    .line 201
    .line 202
    :goto_3
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 206
    .line 207
    .line 208
    move-object v2, v12

    .line 209
    goto :goto_5

    .line 210
    :cond_4
    :try_start_3
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    const-string v6, "Missing required properties: tokenExpirationTimestamp"

    .line 213
    .line 214
    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v5

    .line 218
    :cond_5
    new-instance v5, Lob2;

    .line 219
    .line 220
    const-string v6, "Firebase servers have received too many requests from this client in a short period of time. Please try again later."

    .line 221
    .line 222
    invoke-direct {v5, v6}, Lob2;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v5

    .line 226
    :cond_6
    :goto_4
    const/4 v12, 0x0

    .line 227
    or-int/2addr v12, v10

    .line 228
    int-to-byte v12, v12

    .line 229
    if-ne v12, v10, :cond_a

    .line 230
    .line 231
    new-instance v12, Lpz;

    .line 232
    .line 233
    const/4 v13, 0x3

    .line 234
    invoke-direct {v12, v13, v15, v5, v6}, Lpz;-><init>(ILjava/lang/String;J)V
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :goto_5
    iget v3, v2, Lpz;->c:I

    .line 239
    .line 240
    invoke-static {v3}, Lp61;->B(I)I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_9

    .line 245
    .line 246
    if-eq v3, v10, :cond_8

    .line 247
    .line 248
    if-ne v3, v14, :cond_7

    .line 249
    .line 250
    monitor-enter p0

    .line 251
    :try_start_4
    iput-object v15, v1, Lmb2;->i:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 252
    .line 253
    monitor-exit p0

    .line 254
    invoke-virtual {v0}, Lbz;->a()Laz;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    iput v14, v0, Laz;->b:I

    .line 259
    .line 260
    invoke-virtual {v0}, Laz;->a()Lbz;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    :catchall_1
    move-exception v0

    .line 266
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 267
    throw v0

    .line 268
    :cond_7
    new-instance v0, Lob2;

    .line 269
    .line 270
    invoke-direct {v0, v7}, Lob2;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v0

    .line 274
    :cond_8
    const-string v1, "BAD CONFIG"

    .line 275
    .line 276
    invoke-virtual {v0}, Lbz;->a()Laz;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iput-object v1, v0, Laz;->g:Ljava/lang/String;

    .line 281
    .line 282
    const/4 v1, 0x5

    .line 283
    iput v1, v0, Laz;->b:I

    .line 284
    .line 285
    invoke-virtual {v0}, Laz;->a()Lbz;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :cond_9
    iget-object v1, v2, Lpz;->a:Ljava/lang/String;

    .line 291
    .line 292
    iget-wide v2, v2, Lpz;->b:J

    .line 293
    .line 294
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    const-wide/16 v6, 0x3e8

    .line 299
    .line 300
    div-long/2addr v4, v6

    .line 301
    invoke-virtual {v0}, Lbz;->a()Laz;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    iput-object v1, v0, Laz;->c:Ljava/lang/String;

    .line 306
    .line 307
    iput-wide v2, v0, Laz;->e:J

    .line 308
    .line 309
    iget-byte v1, v0, Laz;->h:B

    .line 310
    .line 311
    or-int/2addr v1, v10

    .line 312
    int-to-byte v1, v1

    .line 313
    iput-wide v4, v0, Laz;->f:J

    .line 314
    .line 315
    or-int/2addr v1, v14

    .line 316
    int-to-byte v1, v1

    .line 317
    iput-byte v1, v0, Laz;->h:B

    .line 318
    .line 319
    invoke-virtual {v0}, Laz;->a()Lbz;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :cond_a
    :try_start_6
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 325
    .line 326
    const-string v6, "Missing required properties: tokenExpirationTimestamp"

    .line 327
    .line 328
    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v5
    :try_end_6
    .catch Ljava/lang/AssertionError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 332
    :goto_6
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 336
    .line 337
    .line 338
    throw v0

    .line 339
    :goto_7
    add-int/lit8 v9, v9, 0x1

    .line 340
    .line 341
    move-object/from16 v6, v16

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_b
    new-instance v0, Lob2;

    .line 346
    .line 347
    invoke-direct {v0, v7}, Lob2;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v0

    .line 351
    :cond_c
    new-instance v0, Lob2;

    .line 352
    .line 353
    invoke-direct {v0, v7}, Lob2;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v0
.end method

.method public final c()Lfb9;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmb2;->e()V

    .line 2
    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lmb2;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lg28;->l(Ljava/lang/Object;)Lfb9;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Lz18;

    .line 16
    .line 17
    invoke-direct {v0}, Lz18;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lrr2;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lrr2;-><init>(Lz18;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lmb2;->f:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v2

    .line 28
    :try_start_1
    iget-object v3, p0, Lmb2;->k:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    iget-object v0, v0, Lz18;->a:Lfb9;

    .line 35
    .line 36
    iget-object v1, p0, Lmb2;->g:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    new-instance v2, Llb2;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-direct {v2, p0, v3}, Llb2;-><init>(Lmb2;B)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    throw p0

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    throw v0
.end method

.method public final d()Lfb9;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmb2;->e()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz18;

    .line 5
    .line 6
    invoke-direct {v0}, Lz18;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lqr2;

    .line 10
    .line 11
    iget-object v2, p0, Lmb2;->d:Lts8;

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Lqr2;-><init>(Lts8;Lz18;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lmb2;->f:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    iget-object v3, p0, Lmb2;->k:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    iget-object v0, v0, Lz18;->a:Lfb9;

    .line 26
    .line 27
    iget-object v1, p0, Lmb2;->g:Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    new-instance v2, Llb2;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v2, p0, v3}, Llb2;-><init>(Lmb2;B)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object p0, p0, Lmb2;->a:Lxa2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxa2;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxa2;->c:Luc2;

    .line 7
    .line 8
    iget-object v0, v0, Luc2;->b:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lw45;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lxa2;->a()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lxa2;->c:Luc2;

    .line 19
    .line 20
    iget-object v0, v0, Luc2;->h:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    .line 23
    .line 24
    invoke-static {v0, v2}, Lw45;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lxa2;->a()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lxa2;->c:Luc2;

    .line 31
    .line 32
    iget-object v0, v0, Luc2;->a:Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    .line 35
    .line 36
    invoke-static {v0, v2}, Lw45;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lxa2;->a()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lxa2;->c:Luc2;

    .line 43
    .line 44
    iget-object v0, v0, Luc2;->b:Ljava/lang/String;

    .line 45
    .line 46
    sget-object v3, Lts8;->a:Ljava/util/regex/Pattern;

    .line 47
    .line 48
    const-string v3, ":"

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0, v1}, Lw45;->n(ZLjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lxa2;->a()V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lxa2;->c:Luc2;

    .line 61
    .line 62
    iget-object p0, p0, Luc2;->a:Ljava/lang/String;

    .line 63
    .line 64
    sget-object v0, Lts8;->a:Ljava/util/regex/Pattern;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {p0, v2}, Lw45;->n(ZLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final f(Lbz;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb2;->a:Lxa2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxa2;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lxa2;->b:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "CHIME_ANDROID_SDK"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lxa2;->a()V

    .line 17
    .line 18
    .line 19
    const-string v0, "[DEFAULT]"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_5

    .line 26
    .line 27
    :cond_0
    iget p1, p1, Lbz;->b:I

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    if-ne p1, v0, :cond_5

    .line 31
    .line 32
    iget-object p0, p0, Lmb2;->e:Lh44;

    .line 33
    .line 34
    invoke-virtual {p0}, Lh44;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lz43;

    .line 39
    .line 40
    iget-object p0, p0, Lz43;->a:Lak3;

    .line 41
    .line 42
    sget-object p1, Lz43;->d:Ljs5;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, p1, v0}, Lak3;->b(Ljs5;Ljava/lang/Long;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    move-object v0, p1

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    sget-object p1, Lz43;->c:Ljs5;

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, Lak3;->b(Ljs5;Ljava/lang/Long;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/String;

    .line 62
    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/16 p1, 0x8

    .line 67
    .line 68
    :try_start_0
    invoke-static {p0, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v1, "RSA"

    .line 73
    .line 74
    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Ljava/security/spec/X509EncodedKeySpec;

    .line 79
    .line 80
    invoke-direct {v2, p0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_1

    .line 88
    :catch_0
    move-exception p0

    .line 89
    goto :goto_0

    .line 90
    :catch_1
    move-exception p0

    .line 91
    goto :goto_0

    .line 92
    :catch_2
    move-exception p0

    .line 93
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-object p0, v0

    .line 97
    :goto_1
    if-nez p0, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :try_start_1
    const-string v1, "SHA1"

    .line 105
    .line 106
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const/4 v1, 0x0

    .line 115
    aget-byte v2, p0, v1

    .line 116
    .line 117
    and-int/lit8 v2, v2, 0xf

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x70

    .line 120
    .line 121
    and-int/lit16 v2, v2, 0xff

    .line 122
    .line 123
    int-to-byte v2, v2

    .line 124
    aput-byte v2, p0, v1

    .line 125
    .line 126
    const/16 v2, 0xb

    .line 127
    .line 128
    invoke-static {p0, v1, p1, v2}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_3

    .line 132
    :catch_3
    :goto_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_4

    .line 137
    .line 138
    invoke-static {}, Ln66;->a()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :cond_4
    return-object v0

    .line 143
    :cond_5
    invoke-static {}, Ln66;->a()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method

.method public final g(Lbz;)Lbz;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lbz;->a:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const/16 v6, 0xb

    .line 16
    .line 17
    if-ne v5, v6, :cond_2

    .line 18
    .line 19
    iget-object v5, v0, Lmb2;->e:Lh44;

    .line 20
    .line 21
    invoke-virtual {v5}, Lh44;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lz43;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v6, Lz43;->e:[Ljava/lang/String;

    .line 31
    .line 32
    array-length v7, v6

    .line 33
    move v8, v3

    .line 34
    :goto_0
    if-ge v8, v7, :cond_2

    .line 35
    .line 36
    aget-object v9, v6, v8

    .line 37
    .line 38
    iget-object v10, v5, Lz43;->b:Ljava/lang/String;

    .line 39
    .line 40
    const-string v11, "|T|"

    .line 41
    .line 42
    const-string v12, "|"

    .line 43
    .line 44
    invoke-static {v11, v10, v12, v9}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    new-instance v10, Ljs5;

    .line 49
    .line 50
    invoke-direct {v10, v9}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v9, v5, Lz43;->a:Lak3;

    .line 54
    .line 55
    invoke-virtual {v9, v10, v4}, Lak3;->b(Ljs5;Ljava/lang/Long;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    check-cast v9, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v9, :cond_1

    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_1

    .line 68
    .line 69
    const-string v5, "{"

    .line 70
    .line 71
    invoke-virtual {v9, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_0

    .line 76
    .line 77
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-direct {v5, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v6, "token"

    .line 83
    .line 84
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    move-object v4, v9

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    :cond_2
    :goto_1
    iget-object v5, v0, Lmb2;->a:Lxa2;

    .line 95
    .line 96
    invoke-virtual {v5}, Lxa2;->a()V

    .line 97
    .line 98
    .line 99
    iget-object v6, v5, Lxa2;->c:Luc2;

    .line 100
    .line 101
    iget-object v6, v6, Luc2;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v5}, Lxa2;->a()V

    .line 104
    .line 105
    .line 106
    iget-object v7, v5, Lxa2;->c:Luc2;

    .line 107
    .line 108
    iget-object v7, v7, Luc2;->h:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v5}, Lxa2;->a()V

    .line 111
    .line 112
    .line 113
    iget-object v5, v5, Lxa2;->c:Luc2;

    .line 114
    .line 115
    iget-object v5, v5, Luc2;->b:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v0, v0, Lmb2;->b:Lkb2;

    .line 118
    .line 119
    iget-object v8, v0, Lkb2;->c:Lxe3;

    .line 120
    .line 121
    invoke-virtual {v8}, Lxe3;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    const-string v10, "Firebase Installations Service is unavailable. Please try again later."

    .line 126
    .line 127
    if-eqz v9, :cond_b

    .line 128
    .line 129
    new-instance v9, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v11, "projects/"

    .line 132
    .line 133
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v7, "/installations"

    .line 140
    .line 141
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v7}, Lkb2;->a(Ljava/lang/String;)Ljava/net/URL;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    move v9, v3

    .line 153
    :goto_2
    const/4 v11, 0x1

    .line 154
    if-gt v9, v11, :cond_a

    .line 155
    .line 156
    const v12, 0x8001

    .line 157
    .line 158
    .line 159
    invoke-static {v12}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v7, v6}, Lkb2;->c(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    :try_start_1
    const-string v13, "POST"

    .line 167
    .line 168
    invoke-virtual {v12, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v11}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 172
    .line 173
    .line 174
    if-eqz v4, :cond_3

    .line 175
    .line 176
    const-string v13, "x-goog-fis-android-iid-migration-auth"

    .line 177
    .line 178
    invoke-virtual {v12, v13, v4}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :cond_3
    :goto_3
    invoke-static {v12, v2, v5}, Lkb2;->g(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v8, v13}, Lxe3;->c(I)V

    .line 193
    .line 194
    .line 195
    const/16 v14, 0xc8

    .line 196
    .line 197
    if-lt v13, v14, :cond_4

    .line 198
    .line 199
    const/16 v14, 0x12c

    .line 200
    .line 201
    if-ge v13, v14, :cond_4

    .line 202
    .line 203
    move v14, v11

    .line 204
    goto :goto_4

    .line 205
    :cond_4
    move v14, v3

    .line 206
    :goto_4
    if-eqz v14, :cond_5

    .line 207
    .line 208
    invoke-static {v12}, Lkb2;->e(Ljava/net/HttpURLConnection;)Lpy;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_5
    :try_start_2
    invoke-static {v12, v5}, Lkb2;->b(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 220
    .line 221
    .line 222
    const/16 v14, 0x1ad

    .line 223
    .line 224
    if-eq v13, v14, :cond_9

    .line 225
    .line 226
    const/16 v14, 0x1f4

    .line 227
    .line 228
    if-lt v13, v14, :cond_6

    .line 229
    .line 230
    const/16 v14, 0x258

    .line 231
    .line 232
    if-ge v13, v14, :cond_6

    .line 233
    .line 234
    :catch_1
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_6
    :try_start_3
    new-instance v15, Lpy;

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    const/16 v20, 0x2

    .line 252
    .line 253
    invoke-direct/range {v15 .. v20}, Lpy;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpz;I)V
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 260
    .line 261
    .line 262
    move-object v0, v15

    .line 263
    :goto_5
    iget v2, v0, Lpy;->e:I

    .line 264
    .line 265
    invoke-static {v2}, Lp61;->B(I)I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_8

    .line 270
    .line 271
    if-ne v2, v11, :cond_7

    .line 272
    .line 273
    invoke-virtual {v1}, Lbz;->a()Laz;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const-string v1, "BAD CONFIG"

    .line 278
    .line 279
    iput-object v1, v0, Laz;->g:Ljava/lang/String;

    .line 280
    .line 281
    const/4 v1, 0x5

    .line 282
    iput v1, v0, Laz;->b:I

    .line 283
    .line 284
    invoke-virtual {v0}, Laz;->a()Lbz;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :cond_7
    new-instance v0, Lob2;

    .line 290
    .line 291
    invoke-direct {v0, v10}, Lob2;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_8
    iget-object v2, v0, Lpy;->b:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v3, v0, Lpy;->c:Ljava/lang/String;

    .line 298
    .line 299
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    const-wide/16 v6, 0x3e8

    .line 304
    .line 305
    div-long/2addr v4, v6

    .line 306
    iget-object v0, v0, Lpy;->d:Lpz;

    .line 307
    .line 308
    iget-object v6, v0, Lpz;->a:Ljava/lang/String;

    .line 309
    .line 310
    iget-wide v7, v0, Lpz;->b:J

    .line 311
    .line 312
    invoke-virtual {v1}, Lbz;->a()Laz;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iput-object v2, v0, Laz;->a:Ljava/lang/String;

    .line 317
    .line 318
    const/4 v1, 0x4

    .line 319
    iput v1, v0, Laz;->b:I

    .line 320
    .line 321
    iput-object v6, v0, Laz;->c:Ljava/lang/String;

    .line 322
    .line 323
    iput-object v3, v0, Laz;->d:Ljava/lang/String;

    .line 324
    .line 325
    iput-wide v7, v0, Laz;->e:J

    .line 326
    .line 327
    iget-byte v1, v0, Laz;->h:B

    .line 328
    .line 329
    or-int/2addr v1, v11

    .line 330
    int-to-byte v1, v1

    .line 331
    iput-wide v4, v0, Laz;->f:J

    .line 332
    .line 333
    or-int/lit8 v1, v1, 0x2

    .line 334
    .line 335
    int-to-byte v1, v1

    .line 336
    iput-byte v1, v0, Laz;->h:B

    .line 337
    .line 338
    invoke-virtual {v0}, Laz;->a()Lbz;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    return-object v0

    .line 343
    :cond_9
    :try_start_4
    new-instance v11, Lob2;

    .line 344
    .line 345
    const-string v13, "Firebase servers have received too many requests from this client in a short period of time. Please try again later."

    .line 346
    .line 347
    invoke-direct {v11, v13}, Lob2;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v11
    :try_end_4
    .catch Ljava/lang/AssertionError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 351
    :goto_6
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 352
    .line 353
    .line 354
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :goto_7
    add-int/lit8 v9, v9, 0x1

    .line 359
    .line 360
    goto/16 :goto_2

    .line 361
    .line 362
    :cond_a
    new-instance v0, Lob2;

    .line 363
    .line 364
    invoke-direct {v0, v10}, Lob2;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_b
    new-instance v0, Lob2;

    .line 369
    .line 370
    invoke-direct {v0, v10}, Lob2;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v0
.end method

.method public final h(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmb2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lmb2;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lxh7;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Lxh7;->a(Ljava/lang/Exception;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0
.end method

.method public final i(Lbz;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmb2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lmb2;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lxh7;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Lxh7;->b(Lbz;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0
.end method

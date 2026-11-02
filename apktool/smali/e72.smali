.class public Le72;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lvz7;

.field public final c:Lvz7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le72;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lw01;

    .line 7
    .line 8
    const/16 v0, 0x1a

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lw01;-><init>(B)V

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
    iput-object v0, p0, Le72;->b:Lvz7;

    .line 19
    .line 20
    new-instance p1, Lw01;

    .line 21
    .line 22
    const/16 v0, 0x1b

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lw01;-><init>(B)V

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
    iput-object v0, p0, Le72;->c:Lvz7;

    .line 33
    .line 34
    return-void
.end method

.method public static d(Le72;Ljava/lang/Long;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLdn2;Ls51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p7

    .line 4
    .line 5
    instance-of v1, v0, La72;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, La72;

    .line 11
    .line 12
    iget v3, v1, La72;->m0:I

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
    iput v3, v1, La72;->m0:I

    .line 22
    .line 23
    :goto_0
    move-object v10, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, La72;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, La72;-><init>(Le72;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v10, La72;->k0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, v10, La72;->m0:I

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x1

    .line 37
    const/4 v13, 0x2

    .line 38
    const/4 v14, 0x0

    .line 39
    sget-object v15, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    if-eq v1, v12, :cond_2

    .line 44
    .line 45
    if-ne v1, v13, :cond_1

    .line 46
    .line 47
    iget v1, v10, La72;->i0:I

    .line 48
    .line 49
    iget-object v2, v10, La72;->g0:Lokhttp3/Response;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_8

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
    return-object v14

    .line 65
    :cond_2
    iget-wide v1, v10, La72;->j0:J

    .line 66
    .line 67
    iget v3, v10, La72;->i0:I

    .line 68
    .line 69
    iget-boolean v4, v10, La72;->h0:Z

    .line 70
    .line 71
    iget-object v5, v10, La72;->f0:Le72;

    .line 72
    .line 73
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    move v8, v4

    .line 77
    move-wide/from16 v16, v1

    .line 78
    .line 79
    move v1, v3

    .line 80
    move-wide/from16 v3, v16

    .line 81
    .line 82
    move-object v2, v5

    .line 83
    goto :goto_3

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    move v1, v3

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :try_start_2
    invoke-interface/range {p6 .. p6}, Ldn2;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object v1, v0

    .line 96
    check-cast v1, Lokhttp3/Request$Builder;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    goto :goto_2

    .line 105
    :catchall_2
    move-exception v0

    .line 106
    move v1, v11

    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_4
    new-instance v0, Ljava/lang/Integer;

    .line 110
    .line 111
    const/4 v3, 0x7

    .line 112
    invoke-direct {v0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    const-wide/16 v5, 0x3e8

    .line 120
    .line 121
    mul-long/2addr v3, v5

    .line 122
    :goto_2
    sget-object v0, Ltp1;->a:Lnf1;

    .line 123
    .line 124
    sget-object v0, Lye1;->Z:Lye1;

    .line 125
    .line 126
    move-object v5, v0

    .line 127
    new-instance v0, Lb72;

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    move-object/from16 v6, p3

    .line 131
    .line 132
    move-object/from16 v7, p4

    .line 133
    .line 134
    move/from16 v8, p5

    .line 135
    .line 136
    move-object v13, v5

    .line 137
    move-object/from16 v5, p2

    .line 138
    .line 139
    invoke-direct/range {v0 .. v9}, Lb72;-><init>(Lokhttp3/Request$Builder;Le72;JLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLq51;)V

    .line 140
    .line 141
    .line 142
    iput-object v2, v10, La72;->f0:Le72;

    .line 143
    .line 144
    move/from16 v8, p5

    .line 145
    .line 146
    iput-boolean v8, v10, La72;->h0:Z

    .line 147
    .line 148
    iput v11, v10, La72;->i0:I

    .line 149
    .line 150
    iput-wide v3, v10, La72;->j0:J

    .line 151
    .line 152
    iput v12, v10, La72;->m0:I

    .line 153
    .line 154
    invoke-static {v13, v0, v10}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 158
    if-ne v0, v15, :cond_5

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_5
    move v1, v11

    .line 162
    :goto_3
    :try_start_3
    check-cast v0, Lyf8;

    .line 163
    .line 164
    iget-object v5, v0, Lyf8;->X:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, Lokhttp3/Response;

    .line 167
    .line 168
    iget-object v6, v0, Lyf8;->Y:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v6, Ljava/lang/String;

    .line 171
    .line 172
    iget-object v0, v0, Lyf8;->Z:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/lang/Throwable;

    .line 175
    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    iget-object v2, v2, Le72;->c:Lvz7;

    .line 179
    .line 180
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, [Lzu3;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    sget-object v9, Lyb6;->a:Lzb6;

    .line 191
    .line 192
    invoke-virtual {v9, v7}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-static {v7, v2}, Leu;->Z(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    move-object v0, v14

    .line 204
    :goto_4
    if-nez v0, :cond_7

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_7
    throw v0

    .line 208
    :cond_8
    :goto_5
    if-eqz v5, :cond_c

    .line 209
    .line 210
    invoke-virtual {v5}, Lokhttp3/Response;->isSuccessful()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    sget-object v0, Ltp1;->a:Lnf1;

    .line 217
    .line 218
    sget-object v0, Lye1;->Z:Lye1;

    .line 219
    .line 220
    new-instance v2, Lc72;

    .line 221
    .line 222
    invoke-direct {v2, v5, v14, v11}, Lc72;-><init>(Lokhttp3/Response;Lq51;B)V

    .line 223
    .line 224
    .line 225
    iput-object v14, v10, La72;->f0:Le72;

    .line 226
    .line 227
    iput-object v5, v10, La72;->g0:Lokhttp3/Response;

    .line 228
    .line 229
    iput-boolean v8, v10, La72;->h0:Z

    .line 230
    .line 231
    iput v1, v10, La72;->i0:I

    .line 232
    .line 233
    iput-wide v3, v10, La72;->j0:J

    .line 234
    .line 235
    const/4 v3, 0x2

    .line 236
    iput v3, v10, La72;->m0:I

    .line 237
    .line 238
    invoke-static {v0, v2, v10}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-ne v0, v15, :cond_9

    .line 243
    .line 244
    :goto_6
    return-object v15

    .line 245
    :cond_9
    move-object v2, v5

    .line 246
    :goto_7
    move-object v14, v0

    .line 247
    check-cast v14, Ljava/lang/String;

    .line 248
    .line 249
    move-object v5, v2

    .line 250
    :cond_a
    if-nez v14, :cond_b

    .line 251
    .line 252
    const-string v14, ""

    .line 253
    .line 254
    :cond_b
    invoke-virtual {v5}, Lokhttp3/Response;->code()I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-virtual {v5}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    new-instance v3, Ljava/util/TreeMap;

    .line 266
    .line 267
    sget-object v4, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 268
    .line 269
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-direct {v3, v4}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v2, v3}, Lzp4;->R(Ljava/lang/Iterable;Ljava/util/AbstractMap;)V

    .line 276
    .line 277
    .line 278
    new-instance v2, Lpr;

    .line 279
    .line 280
    new-instance v4, Ljava/lang/Integer;

    .line 281
    .line 282
    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v2, v14, v3, v4}, Lpr;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V

    .line 286
    .line 287
    .line 288
    return-object v2

    .line 289
    :cond_c
    new-instance v0, Ljava/lang/RuntimeException;

    .line 290
    .line 291
    invoke-direct {v0, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 295
    :goto_8
    if-eqz v1, :cond_d

    .line 296
    .line 297
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v2, "util.protection"

    .line 302
    .line 303
    invoke-static {v1, v2, v11}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-nez v1, :cond_d

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 310
    .line 311
    .line 312
    :cond_d
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 313
    .line 314
    if-nez v1, :cond_e

    .line 315
    .line 316
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 317
    .line 318
    if-nez v1, :cond_e

    .line 319
    .line 320
    new-instance v1, Lrj6;

    .line 321
    .line 322
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    return-object v1

    .line 326
    :cond_e
    throw v0
.end method


# virtual methods
.method public final b(Lokhttp3/Request;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lokhttp3/Response;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-virtual {v0, p3, p4, v1}, Lokhttp3/OkHttpClient$Builder;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p3, p4, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p3, p4, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p3, p4, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lokhttp3/JavaNetCookieJar;

    .line 25
    .line 26
    iget-object p0, p0, Le72;->b:Lvz7;

    .line 27
    .line 28
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/net/CookieManager;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lokhttp3/JavaNetCookieJar;-><init>(Ljava/net/CookieHandler;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->cache(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v1, Ly62;

    .line 47
    .line 48
    invoke-direct {v1, p6, p2}, Ly62;-><init>(Ljava/util/HashMap;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p7, :cond_0

    .line 56
    .line 57
    new-instance p2, La13;

    .line 58
    .line 59
    invoke-direct {p2, p7}, La13;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Lokhttp3/OkHttpClient$Builder;->addNetworkInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 63
    .line 64
    .line 65
    :cond_0
    new-instance p2, Lw96;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 71
    .line 72
    .line 73
    if-eqz p8, :cond_1

    .line 74
    .line 75
    new-instance p2, Ld72;

    .line 76
    .line 77
    const/4 p6, 0x0

    .line 78
    invoke-direct {p2, p6}, Ld72;-><init>(B)V

    .line 79
    .line 80
    .line 81
    const/4 p7, 0x1

    .line 82
    new-array p8, p7, [Ljavax/net/ssl/X509TrustManager;

    .line 83
    .line 84
    aput-object p2, p8, p6

    .line 85
    .line 86
    const-string p2, "SSL"

    .line 87
    .line 88
    invoke-static {p2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    move-object v1, p8

    .line 93
    check-cast v1, [Ljavax/net/ssl/TrustManager;

    .line 94
    .line 95
    new-instance v2, Ljava/security/SecureRandom;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0, v1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    aget-object p6, p8, p6

    .line 111
    .line 112
    invoke-virtual {p0, p2, p6}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    .line 113
    .line 114
    .line 115
    new-instance p2, Lrn;

    .line 116
    .line 117
    invoke-direct {p2, p7}, Lrn;-><init>(B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p2}, Lokhttp3/OkHttpClient$Builder;->hostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;

    .line 121
    .line 122
    .line 123
    :cond_1
    if-eqz p5, :cond_2

    .line 124
    .line 125
    invoke-virtual {p0, p5}, Lokhttp3/OkHttpClient$Builder;->proxy(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    goto :goto_0

    .line 130
    :cond_2
    sget-object p2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 131
    .line 132
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p2}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p2}, Lc16;->g()Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-eqz p2, :cond_3

    .line 145
    .line 146
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    long-to-int p3, p3

    .line 155
    invoke-virtual {p2, p0, p3}, Lc16;->a(Lokhttp3/OkHttpClient$Builder;I)Lokhttp3/OkHttpClient$Builder;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0
.end method

.method public final c(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lz62;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz62;

    .line 7
    .line 8
    iget v1, v0, Lz62;->h0:I

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
    iput v1, v0, Lz62;->h0:I

    .line 18
    .line 19
    :goto_0
    move-object v8, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lz62;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lz62;-><init>(Le72;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v8, Lz62;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v8, Lz62;->h0:I

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
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, Lsj6;

    .line 40
    .line 41
    iget-object p0, p2, Lsj6;->X:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Lp5;

    .line 55
    .line 56
    const/16 p2, 0x16

    .line 57
    .line 58
    invoke-direct {v7, p0, p1, p2}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    iput v1, v8, Lz62;->h0:I

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    move-object v1, p0

    .line 69
    invoke-static/range {v1 .. v8}, Le72;->d(Le72;Ljava/lang/Long;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLdn2;Ls51;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, Lc71;->X:Lc71;

    .line 74
    .line 75
    if-ne p0, p1, :cond_3

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_3
    return-object p0
.end method

.method public final e(Ljava/net/URL;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-static {p2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_1
    iget-object p0, p0, Le72;->a:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p0}, Lue3;->y(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    const-string p0, "AndroidTV"

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const-string p0, "Android"

    .line 26
    .line 27
    :goto_1
    invoke-static {p0}, Lch3;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :goto_2
    new-instance p0, Lokhttp3/Request$Builder;

    .line 32
    .line 33
    invoke-direct {p0}, Lokhttp3/Request$Builder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->url(Ljava/net/URL;)Lokhttp3/Request$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "Connection"

    .line 41
    .line 42
    const-string v1, "close"

    .line 43
    .line 44
    invoke-virtual {p0, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v0, "User-agent"

    .line 49
    .line 50
    invoke-virtual {p0, v0, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    sget-object p2, Lss8;->a:Lss8;

    .line 55
    .line 56
    invoke-static {}, Lss8;->n()Ljava/util/Locale;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const-string v0, "X-Device-Locale"

    .line 68
    .line 69
    invoke-virtual {p0, v0, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    const/4 p2, 0x6

    .line 80
    invoke-static {p2, p1}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string p2, "Basic "

    .line 89
    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string p2, "Authorization"

    .line 95
    .line 96
    invoke-virtual {p0, p2, p1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 97
    .line 98
    .line 99
    :cond_3
    return-object p0
.end method

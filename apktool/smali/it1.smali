.class public final Lit1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Ljava/lang/Object;

.field public h0:Lda6;

.field public i0:Lda6;

.field public j0:Ljava/io/Closeable;

.field public k0:Ljava/io/InputStream;

.field public l0:Ljava/io/Closeable;

.field public m0:Ljava/io/FileOutputStream;

.field public n0:[B

.field public o0:Lca6;

.field public p0:I

.field public q0:J

.field public r0:B

.field public synthetic s0:Ljava/lang/Object;

.field public final synthetic t0:Ljava/lang/String;

.field public final synthetic u0:J

.field public final synthetic v0:Ljava/lang/String;

.field public final synthetic w0:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;JLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lit1;->t0:Ljava/lang/String;

    .line 2
    .line 3
    iput-wide p2, p0, Lit1;->u0:J

    .line 4
    .line 5
    iput-object p4, p0, Lit1;->v0:Ljava/lang/String;

    .line 6
    .line 7
    iput-wide p5, p0, Lit1;->w0:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p7}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lze2;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lit1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lit1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lit1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 8

    .line 1
    new-instance v0, Lit1;

    .line 2
    .line 3
    iget-object v4, p0, Lit1;->v0:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v5, p0, Lit1;->w0:J

    .line 6
    .line 7
    iget-object v1, p0, Lit1;->t0:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v2, p0, Lit1;->u0:J

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    invoke-direct/range {v0 .. v7}, Lit1;-><init>(Ljava/lang/String;JLjava/lang/String;JLq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lit1;->s0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "bytes="

    .line 4
    .line 5
    iget-object v2, v1, Lit1;->s0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lze2;

    .line 8
    .line 9
    iget-byte v3, v1, Lit1;->r0:B

    .line 10
    .line 11
    sget-object v4, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    const/4 v7, 0x5

    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x3

    .line 16
    const/4 v11, 0x2

    .line 17
    const/4 v13, 0x1

    .line 18
    const/4 v14, 0x0

    .line 19
    sget-object v15, Lc71;->X:Lc71;

    .line 20
    .line 21
    if-eqz v3, :cond_5

    .line 22
    .line 23
    if-eq v3, v13, :cond_4

    .line 24
    .line 25
    if-eq v3, v11, :cond_3

    .line 26
    .line 27
    if-eq v3, v9, :cond_2

    .line 28
    .line 29
    if-eq v3, v8, :cond_1

    .line 30
    .line 31
    if-ne v3, v7, :cond_0

    .line 32
    .line 33
    iget-object v0, v1, Lit1;->h0:Lda6;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Throwable;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v18, v4

    .line 41
    .line 42
    goto/16 :goto_1c

    .line 43
    .line 44
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v14

    .line 50
    :cond_1
    iget v3, v1, Lit1;->p0:I

    .line 51
    .line 52
    iget-object v0, v1, Lit1;->l0:Ljava/io/Closeable;

    .line 53
    .line 54
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 55
    .line 56
    iget-object v5, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 57
    .line 58
    iget-object v0, v1, Lit1;->g0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lokhttp3/Request;

    .line 61
    .line 62
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    move-object/from16 v18, v4

    .line 66
    .line 67
    move-object v4, v14

    .line 68
    goto/16 :goto_13

    .line 69
    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object/from16 v18, v4

    .line 72
    .line 73
    :goto_0
    move v4, v3

    .line 74
    move-object v3, v2

    .line 75
    :goto_1
    move-object v2, v0

    .line 76
    goto/16 :goto_18

    .line 77
    .line 78
    :cond_2
    const-wide/16 v16, 0x0

    .line 79
    .line 80
    iget-wide v5, v1, Lit1;->q0:J

    .line 81
    .line 82
    iget v3, v1, Lit1;->p0:I

    .line 83
    .line 84
    iget-object v0, v1, Lit1;->o0:Lca6;

    .line 85
    .line 86
    iget-object v11, v1, Lit1;->n0:[B

    .line 87
    .line 88
    iget-object v7, v1, Lit1;->m0:Ljava/io/FileOutputStream;

    .line 89
    .line 90
    iget-object v8, v1, Lit1;->l0:Ljava/io/Closeable;

    .line 91
    .line 92
    iget-object v9, v1, Lit1;->k0:Ljava/io/InputStream;

    .line 93
    .line 94
    iget-object v12, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 95
    .line 96
    iget-object v14, v1, Lit1;->i0:Lda6;

    .line 97
    .line 98
    iget-object v10, v1, Lit1;->h0:Lda6;

    .line 99
    .line 100
    iget-object v13, v1, Lit1;->g0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v13, Lokhttp3/Request;

    .line 103
    .line 104
    :try_start_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    move-object/from16 v18, v4

    .line 108
    .line 109
    move-wide/from16 v20, v5

    .line 110
    .line 111
    move-object v6, v10

    .line 112
    move-object v5, v12

    .line 113
    const/4 v4, 0x3

    .line 114
    goto/16 :goto_d

    .line 115
    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object/from16 v18, v4

    .line 118
    .line 119
    move-object v5, v12

    .line 120
    :goto_2
    move v4, v3

    .line 121
    move-object v3, v2

    .line 122
    :goto_3
    move-object v2, v0

    .line 123
    goto/16 :goto_14

    .line 124
    .line 125
    :cond_3
    iget v3, v1, Lit1;->p0:I

    .line 126
    .line 127
    iget-object v0, v1, Lit1;->k0:Ljava/io/InputStream;

    .line 128
    .line 129
    check-cast v0, Lze2;

    .line 130
    .line 131
    iget-object v5, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 132
    .line 133
    iget-object v0, v1, Lit1;->g0:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Lokhttp3/Request;

    .line 136
    .line 137
    :try_start_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    .line 139
    .line 140
    move-object/from16 v18, v4

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    goto/16 :goto_13

    .line 144
    .line 145
    :cond_4
    iget v3, v1, Lit1;->p0:I

    .line 146
    .line 147
    iget-object v5, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 148
    .line 149
    iget-object v0, v1, Lit1;->g0:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lokhttp3/Request;

    .line 152
    .line 153
    :try_start_3
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 154
    .line 155
    .line 156
    :goto_4
    const/4 v6, 0x0

    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :cond_5
    const-wide/16 v16, 0x0

    .line 160
    .line 161
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance v3, Ljava/io/File;

    .line 165
    .line 166
    iget-object v5, v1, Lit1;->t0:Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-wide v5, v1, Lit1;->u0:J

    .line 172
    .line 173
    iget-object v7, v1, Lit1;->v0:Ljava/lang/String;

    .line 174
    .line 175
    :try_start_4
    new-instance v8, Lokhttp3/OkHttpClient$Builder;

    .line 176
    .line 177
    invoke-direct {v8}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 178
    .line 179
    .line 180
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 181
    .line 182
    const-wide/32 v12, 0x2bf20

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v12, v13, v9}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-virtual {v8, v12, v13, v9}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual {v8, v12, v13, v9}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    const/4 v9, 0x1

    .line 198
    invoke-virtual {v8, v9}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-virtual {v8, v9}, Lokhttp3/OkHttpClient$Builder;->followSslRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    sget-object v9, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 207
    .line 208
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    invoke-virtual {v9}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    const/16 v10, 0x1b58

    .line 217
    .line 218
    invoke-virtual {v9, v8, v10}, Lc16;->a(Lokhttp3/OkHttpClient$Builder;I)Lokhttp3/OkHttpClient$Builder;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-virtual {v8}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    new-instance v9, Lokhttp3/Request$Builder;

    .line 227
    .line 228
    invoke-direct {v9}, Lokhttp3/Request$Builder;-><init>()V

    .line 229
    .line 230
    .line 231
    const-string v10, "Range"

    .line 232
    .line 233
    new-instance v12, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v0, "-"

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v9, v10, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0, v7}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget-object v7, Lkw4;->a:Lkw4;

    .line 259
    .line 260
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    const-string v9, "pref_geo_custom_ua"

    .line 265
    .line 266
    const/4 v10, -0x1

    .line 267
    invoke-virtual {v7, v10, v9}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 271
    :try_start_5
    new-instance v9, Ljava/lang/Integer;

    .line 272
    .line 273
    invoke-direct {v9, v7}, Ljava/lang/Integer;-><init>(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_10

    .line 274
    .line 275
    .line 276
    :try_start_6
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-eq v7, v10, :cond_6

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_6
    const/4 v9, 0x0

    .line 284
    :goto_5
    if-eqz v9, :cond_7

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/GeoUserAgent;->b()Ll22;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    check-cast v9, Ln22;

    .line 295
    .line 296
    invoke-virtual {v9, v7}, Ln22;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    check-cast v7, Lsu/happ/proxyutility/dto/enums/GeoUserAgent;

    .line 301
    .line 302
    if-eqz v7, :cond_7

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :catchall_2
    move-exception v0

    .line 306
    :goto_6
    move-object/from16 v18, v4

    .line 307
    .line 308
    const/4 v3, 0x0

    .line 309
    goto/16 :goto_19

    .line 310
    .line 311
    :cond_7
    sget-object v7, Lsu/happ/proxyutility/dto/enums/GeoUserAgent;->Companion:Lsu/happ/proxyutility/dto/enums/GeoUserAgent$Companion;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 312
    .line 313
    :try_start_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/GeoUserAgent;->a()Lsu/happ/proxyutility/dto/enums/GeoUserAgent;

    .line 317
    .line 318
    .line 319
    move-result-object v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    .line 320
    :goto_7
    :try_start_8
    const-string v9, "User-Agent"

    .line 321
    .line 322
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/enums/GeoUserAgent;->c()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-virtual {v0, v9, v7}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    new-instance v7, Lda6;

    .line 339
    .line 340
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 341
    .line 342
    .line 343
    iput-wide v5, v7, Lda6;->X:J

    .line 344
    .line 345
    new-instance v9, Lda6;

    .line 346
    .line 347
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v8, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 355
    .line 356
    .line 357
    move-result-object v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 358
    :try_start_9
    invoke-virtual {v8}, Lokhttp3/Response;->isSuccessful()Z

    .line 359
    .line 360
    .line 361
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_c

    .line 362
    iget-wide v12, v1, Lit1;->w0:J

    .line 363
    .line 364
    if-nez v0, :cond_9

    .line 365
    .line 366
    :try_start_a
    new-instance v20, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 367
    .line 368
    sget-object v23, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 369
    .line 370
    const-wide/16 v26, 0x0

    .line 371
    .line 372
    const/16 v28, 0x0

    .line 373
    .line 374
    const-wide/16 v24, 0x0

    .line 375
    .line 376
    move-wide/from16 v21, v12

    .line 377
    .line 378
    invoke-direct/range {v20 .. v28}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;-><init>(JLsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;JJI)V

    .line 379
    .line 380
    .line 381
    move-object/from16 v0, v20

    .line 382
    .line 383
    iput-object v2, v1, Lit1;->s0:Ljava/lang/Object;

    .line 384
    .line 385
    const/4 v3, 0x0

    .line 386
    iput-object v3, v1, Lit1;->g0:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v3, v1, Lit1;->h0:Lda6;

    .line 389
    .line 390
    iput-object v3, v1, Lit1;->i0:Lda6;

    .line 391
    .line 392
    iput-object v8, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 393
    .line 394
    const/4 v3, 0x0

    .line 395
    iput v3, v1, Lit1;->p0:I

    .line 396
    .line 397
    const/4 v10, 0x1

    .line 398
    iput-byte v10, v1, Lit1;->r0:B

    .line 399
    .line 400
    invoke-interface {v2, v0, v1}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 404
    if-ne v0, v15, :cond_8

    .line 405
    .line 406
    goto/16 :goto_1b

    .line 407
    .line 408
    :cond_8
    move-object v5, v8

    .line 409
    const/4 v3, 0x0

    .line 410
    goto/16 :goto_4

    .line 411
    .line 412
    :goto_8
    :try_start_b
    invoke-static {v5, v6}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 413
    .line 414
    .line 415
    move-object/from16 v18, v4

    .line 416
    .line 417
    goto/16 :goto_17

    .line 418
    .line 419
    :catchall_3
    move-exception v0

    .line 420
    move-object/from16 v18, v4

    .line 421
    .line 422
    goto/16 :goto_19

    .line 423
    .line 424
    :catchall_4
    move-exception v0

    .line 425
    move-object v3, v2

    .line 426
    move-object/from16 v18, v4

    .line 427
    .line 428
    :goto_9
    move-object v5, v8

    .line 429
    const/4 v4, 0x0

    .line 430
    goto/16 :goto_1

    .line 431
    .line 432
    :cond_9
    move-wide/from16 v21, v12

    .line 433
    .line 434
    const/4 v10, 0x1

    .line 435
    :try_start_c
    invoke-virtual {v8}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 436
    .line 437
    .line 438
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 439
    if-eqz v0, :cond_a

    .line 440
    .line 441
    :try_start_d
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    .line 442
    .line 443
    .line 444
    move-result-wide v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 445
    add-long/2addr v12, v5

    .line 446
    goto :goto_a

    .line 447
    :cond_a
    const-wide/16 v12, -0x1

    .line 448
    .line 449
    :goto_a
    :try_start_e
    iput-wide v12, v9, Lda6;->X:J

    .line 450
    .line 451
    invoke-virtual {v8}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-eqz v0, :cond_b

    .line 456
    .line 457
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    if-nez v0, :cond_c

    .line 462
    .line 463
    :cond_b
    move-object/from16 v18, v4

    .line 464
    .line 465
    goto/16 :goto_16

    .line 466
    .line 467
    :cond_c
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 468
    .line 469
    .line 470
    move-result-object v11
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 471
    if-eqz v11, :cond_d

    .line 472
    .line 473
    :try_start_f
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    if-nez v11, :cond_d

    .line 478
    .line 479
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 480
    .line 481
    .line 482
    move-result-object v11

    .line 483
    if-eqz v11, :cond_d

    .line 484
    .line 485
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 486
    .line 487
    .line 488
    :cond_d
    :try_start_10
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 489
    .line 490
    .line 491
    move-result v11
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    .line 492
    if-nez v11, :cond_e

    .line 493
    .line 494
    :try_start_11
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 495
    .line 496
    .line 497
    :cond_e
    :try_start_12
    new-instance v11, Ljava/io/FileOutputStream;

    .line 498
    .line 499
    cmp-long v12, v5, v16

    .line 500
    .line 501
    if-lez v12, :cond_f

    .line 502
    .line 503
    move v12, v10

    .line 504
    goto :goto_b

    .line 505
    :cond_f
    const/4 v12, 0x0

    .line 506
    :goto_b
    invoke-direct {v11, v3, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 507
    .line 508
    .line 509
    :try_start_13
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-virtual {v3, v5, v6}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 514
    .line 515
    .line 516
    const/16 v3, 0x1000

    .line 517
    .line 518
    new-array v3, v3, [B

    .line 519
    .line 520
    new-instance v5, Lca6;

    .line 521
    .line 522
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 523
    .line 524
    .line 525
    move-object v6, v7

    .line 526
    move-object v14, v9

    .line 527
    move-object v7, v11

    .line 528
    move-wide/from16 v20, v21

    .line 529
    .line 530
    move-object v9, v0

    .line 531
    move-object v11, v3

    .line 532
    move-object v0, v5

    .line 533
    move-object v5, v8

    .line 534
    move-object v8, v7

    .line 535
    const/4 v3, 0x0

    .line 536
    :goto_c
    :try_start_14
    invoke-virtual {v9, v11}, Ljava/io/InputStream;->read([B)I

    .line 537
    .line 538
    .line 539
    move-result v12

    .line 540
    iput v12, v0, Lca6;->X:I

    .line 541
    .line 542
    const-wide/16 v22, 0x64

    .line 543
    .line 544
    const/4 v13, -0x1

    .line 545
    if-eq v12, v13, :cond_11

    .line 546
    .line 547
    move-object/from16 v18, v14

    .line 548
    .line 549
    iget-wide v13, v6, Lda6;->X:J

    .line 550
    .line 551
    move-object/from16 v29, v11

    .line 552
    .line 553
    int-to-long v10, v12

    .line 554
    add-long/2addr v13, v10

    .line 555
    iput-wide v13, v6, Lda6;->X:J

    .line 556
    .line 557
    move-object/from16 v10, v29

    .line 558
    .line 559
    const/4 v11, 0x0

    .line 560
    invoke-virtual {v7, v10, v11, v12}, Ljava/io/FileOutputStream;->write([BII)V

    .line 561
    .line 562
    .line 563
    new-instance v19, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 564
    .line 565
    move-wide/from16 v11, v22

    .line 566
    .line 567
    sget-object v22, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->PROGRESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 568
    .line 569
    iget-wide v13, v6, Lda6;->X:J

    .line 570
    .line 571
    move-wide/from16 v23, v11

    .line 572
    .line 573
    move-wide/from16 v25, v13

    .line 574
    .line 575
    move-object/from16 v11, v18

    .line 576
    .line 577
    iget-wide v12, v11, Lda6;->X:J

    .line 578
    .line 579
    mul-long v23, v23, v25

    .line 580
    .line 581
    move-wide/from16 v29, v12

    .line 582
    .line 583
    div-long v12, v23, v29

    .line 584
    .line 585
    long-to-int v12, v12

    .line 586
    move/from16 v27, v12

    .line 587
    .line 588
    move-wide/from16 v23, v25

    .line 589
    .line 590
    move-wide/from16 v25, v29

    .line 591
    .line 592
    invoke-direct/range {v19 .. v27}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;-><init>(JLsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;JJI)V

    .line 593
    .line 594
    .line 595
    move-object/from16 v14, v19

    .line 596
    .line 597
    move-wide/from16 v12, v20

    .line 598
    .line 599
    iput-object v2, v1, Lit1;->s0:Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 600
    .line 601
    move-object/from16 v18, v4

    .line 602
    .line 603
    const/4 v4, 0x0

    .line 604
    :try_start_15
    iput-object v4, v1, Lit1;->g0:Ljava/lang/Object;

    .line 605
    .line 606
    iput-object v6, v1, Lit1;->h0:Lda6;

    .line 607
    .line 608
    iput-object v11, v1, Lit1;->i0:Lda6;

    .line 609
    .line 610
    iput-object v5, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 611
    .line 612
    iput-object v9, v1, Lit1;->k0:Ljava/io/InputStream;

    .line 613
    .line 614
    iput-object v8, v1, Lit1;->l0:Ljava/io/Closeable;

    .line 615
    .line 616
    iput-object v7, v1, Lit1;->m0:Ljava/io/FileOutputStream;

    .line 617
    .line 618
    iput-object v10, v1, Lit1;->n0:[B

    .line 619
    .line 620
    iput-object v0, v1, Lit1;->o0:Lca6;

    .line 621
    .line 622
    iput v3, v1, Lit1;->p0:I

    .line 623
    .line 624
    iput-wide v12, v1, Lit1;->q0:J

    .line 625
    .line 626
    const/4 v4, 0x3

    .line 627
    iput-byte v4, v1, Lit1;->r0:B

    .line 628
    .line 629
    invoke-interface {v2, v14, v1}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v14

    .line 633
    if-ne v14, v15, :cond_10

    .line 634
    .line 635
    goto/16 :goto_1b

    .line 636
    .line 637
    :cond_10
    move-object v14, v11

    .line 638
    move-wide/from16 v20, v12

    .line 639
    .line 640
    move-object v11, v10

    .line 641
    :goto_d
    move-object/from16 v4, v18

    .line 642
    .line 643
    const/4 v10, 0x1

    .line 644
    goto :goto_c

    .line 645
    :catchall_5
    move-exception v0

    .line 646
    goto/16 :goto_2

    .line 647
    .line 648
    :catchall_6
    move-exception v0

    .line 649
    move-object/from16 v18, v4

    .line 650
    .line 651
    goto/16 :goto_2

    .line 652
    .line 653
    :cond_11
    move-object/from16 v18, v4

    .line 654
    .line 655
    move-object v11, v14

    .line 656
    move-wide/from16 v12, v20

    .line 657
    .line 658
    move-wide/from16 v23, v22

    .line 659
    .line 660
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V

    .line 661
    .line 662
    .line 663
    iget-wide v9, v6, Lda6;->X:J

    .line 664
    .line 665
    move-wide/from16 v19, v9

    .line 666
    .line 667
    iget-wide v9, v11, Lda6;->X:J
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 668
    .line 669
    cmp-long v0, v19, v9

    .line 670
    .line 671
    if-ltz v0, :cond_12

    .line 672
    .line 673
    const/4 v0, 0x1

    .line 674
    :goto_e
    const/4 v4, 0x0

    .line 675
    goto :goto_f

    .line 676
    :cond_12
    const/4 v0, 0x0

    .line 677
    goto :goto_e

    .line 678
    :goto_f
    :try_start_16
    invoke-static {v8, v4}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 679
    .line 680
    .line 681
    if-eqz v0, :cond_13

    .line 682
    .line 683
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->SUCCESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 684
    .line 685
    :goto_10
    move-object/from16 v22, v0

    .line 686
    .line 687
    goto :goto_11

    .line 688
    :catchall_7
    move-exception v0

    .line 689
    goto/16 :goto_0

    .line 690
    .line 691
    :cond_13
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 692
    .line 693
    goto :goto_10

    .line 694
    :goto_11
    iget-wide v7, v11, Lda6;->X:J

    .line 695
    .line 696
    cmp-long v0, v7, v16

    .line 697
    .line 698
    const/16 v4, 0x64

    .line 699
    .line 700
    if-lez v0, :cond_15

    .line 701
    .line 702
    iget-wide v9, v6, Lda6;->X:J

    .line 703
    .line 704
    mul-long v9, v9, v23

    .line 705
    .line 706
    div-long/2addr v9, v7

    .line 707
    long-to-int v0, v9

    .line 708
    if-le v0, v4, :cond_14

    .line 709
    .line 710
    goto :goto_12

    .line 711
    :cond_14
    move v4, v0

    .line 712
    :cond_15
    :goto_12
    move/from16 v27, v4

    .line 713
    .line 714
    new-instance v19, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 715
    .line 716
    iget-wide v6, v6, Lda6;->X:J

    .line 717
    .line 718
    iget-wide v8, v11, Lda6;->X:J

    .line 719
    .line 720
    move-wide/from16 v23, v6

    .line 721
    .line 722
    move-wide/from16 v25, v8

    .line 723
    .line 724
    move-wide/from16 v20, v12

    .line 725
    .line 726
    invoke-direct/range {v19 .. v27}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;-><init>(JLsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;JJI)V

    .line 727
    .line 728
    .line 729
    move-object/from16 v0, v19

    .line 730
    .line 731
    iput-object v2, v1, Lit1;->s0:Ljava/lang/Object;

    .line 732
    .line 733
    const/4 v4, 0x0

    .line 734
    iput-object v4, v1, Lit1;->g0:Ljava/lang/Object;

    .line 735
    .line 736
    iput-object v4, v1, Lit1;->h0:Lda6;

    .line 737
    .line 738
    iput-object v4, v1, Lit1;->i0:Lda6;

    .line 739
    .line 740
    iput-object v5, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 741
    .line 742
    iput-object v4, v1, Lit1;->k0:Ljava/io/InputStream;

    .line 743
    .line 744
    iput-object v4, v1, Lit1;->l0:Ljava/io/Closeable;

    .line 745
    .line 746
    iput-object v4, v1, Lit1;->m0:Ljava/io/FileOutputStream;

    .line 747
    .line 748
    iput-object v4, v1, Lit1;->n0:[B

    .line 749
    .line 750
    iput-object v4, v1, Lit1;->o0:Lca6;

    .line 751
    .line 752
    iput v3, v1, Lit1;->p0:I

    .line 753
    .line 754
    const/4 v6, 0x4

    .line 755
    iput-byte v6, v1, Lit1;->r0:B

    .line 756
    .line 757
    invoke-interface {v2, v0, v1}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    .line 761
    if-ne v0, v15, :cond_16

    .line 762
    .line 763
    goto/16 :goto_1b

    .line 764
    .line 765
    :cond_16
    :goto_13
    :try_start_17
    invoke-static {v5, v4}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 766
    .line 767
    .line 768
    goto :goto_17

    .line 769
    :catchall_8
    move-exception v0

    .line 770
    goto :goto_19

    .line 771
    :catchall_9
    move-exception v0

    .line 772
    move-object/from16 v18, v4

    .line 773
    .line 774
    move-object v3, v2

    .line 775
    move-object v5, v8

    .line 776
    move-object v8, v11

    .line 777
    const/4 v4, 0x0

    .line 778
    goto/16 :goto_3

    .line 779
    .line 780
    :goto_14
    :try_start_18
    throw v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 781
    :catchall_a
    move-exception v0

    .line 782
    :try_start_19
    invoke-static {v8, v2}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 783
    .line 784
    .line 785
    throw v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    .line 786
    :catchall_b
    move-exception v0

    .line 787
    goto/16 :goto_1

    .line 788
    .line 789
    :catchall_c
    move-exception v0

    .line 790
    move-object/from16 v18, v4

    .line 791
    .line 792
    :goto_15
    move-object v3, v2

    .line 793
    goto/16 :goto_9

    .line 794
    .line 795
    :goto_16
    :try_start_1a
    new-instance v20, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 796
    .line 797
    sget-object v23, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 798
    .line 799
    const-wide/16 v26, 0x0

    .line 800
    .line 801
    const/16 v28, 0x0

    .line 802
    .line 803
    const-wide/16 v24, 0x0

    .line 804
    .line 805
    invoke-direct/range {v20 .. v28}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;-><init>(JLsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;JJI)V

    .line 806
    .line 807
    .line 808
    move-object/from16 v0, v20

    .line 809
    .line 810
    iput-object v2, v1, Lit1;->s0:Ljava/lang/Object;

    .line 811
    .line 812
    const/4 v4, 0x0

    .line 813
    iput-object v4, v1, Lit1;->g0:Ljava/lang/Object;

    .line 814
    .line 815
    iput-object v4, v1, Lit1;->h0:Lda6;

    .line 816
    .line 817
    iput-object v4, v1, Lit1;->i0:Lda6;

    .line 818
    .line 819
    iput-object v8, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 820
    .line 821
    iput-object v4, v1, Lit1;->k0:Ljava/io/InputStream;

    .line 822
    .line 823
    const/4 v3, 0x0

    .line 824
    iput v3, v1, Lit1;->p0:I

    .line 825
    .line 826
    iput-byte v11, v1, Lit1;->r0:B

    .line 827
    .line 828
    invoke-interface {v2, v0, v1}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_d

    .line 832
    if-ne v0, v15, :cond_17

    .line 833
    .line 834
    goto :goto_1b

    .line 835
    :cond_17
    move-object v5, v8

    .line 836
    const/4 v3, 0x0

    .line 837
    goto :goto_13

    .line 838
    :goto_17
    move-object/from16 v3, v18

    .line 839
    .line 840
    goto :goto_1a

    .line 841
    :catchall_d
    move-exception v0

    .line 842
    goto :goto_15

    .line 843
    :goto_18
    :try_start_1b
    throw v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_e

    .line 844
    :catchall_e
    move-exception v0

    .line 845
    :try_start_1c
    invoke-static {v5, v2}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 846
    .line 847
    .line 848
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_f

    .line 849
    :catchall_f
    move-exception v0

    .line 850
    move-object v2, v3

    .line 851
    move v3, v4

    .line 852
    goto :goto_19

    .line 853
    :catchall_10
    move-exception v0

    .line 854
    goto/16 :goto_6

    .line 855
    .line 856
    :goto_19
    if-eqz v3, :cond_18

    .line 857
    .line 858
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v3

    .line 862
    const-string v4, "util.protection"

    .line 863
    .line 864
    const/4 v11, 0x0

    .line 865
    invoke-static {v3, v4, v11}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    if-nez v3, :cond_18

    .line 870
    .line 871
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 872
    .line 873
    .line 874
    :cond_18
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 875
    .line 876
    if-nez v3, :cond_1a

    .line 877
    .line 878
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 879
    .line 880
    if-nez v3, :cond_1a

    .line 881
    .line 882
    new-instance v3, Lrj6;

    .line 883
    .line 884
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 885
    .line 886
    .line 887
    :goto_1a
    invoke-static {v3}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    if-eqz v0, :cond_19

    .line 892
    .line 893
    new-instance v4, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 894
    .line 895
    sget-object v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 896
    .line 897
    const-wide/16 v10, 0x0

    .line 898
    .line 899
    const/4 v12, 0x0

    .line 900
    iget-wide v5, v1, Lit1;->w0:J

    .line 901
    .line 902
    const-wide/16 v8, 0x0

    .line 903
    .line 904
    invoke-direct/range {v4 .. v12}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;-><init>(JLsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;JJI)V

    .line 905
    .line 906
    .line 907
    const/4 v6, 0x0

    .line 908
    iput-object v6, v1, Lit1;->s0:Ljava/lang/Object;

    .line 909
    .line 910
    iput-object v3, v1, Lit1;->g0:Ljava/lang/Object;

    .line 911
    .line 912
    iput-object v6, v1, Lit1;->h0:Lda6;

    .line 913
    .line 914
    iput-object v6, v1, Lit1;->i0:Lda6;

    .line 915
    .line 916
    iput-object v6, v1, Lit1;->j0:Ljava/io/Closeable;

    .line 917
    .line 918
    iput-object v6, v1, Lit1;->k0:Ljava/io/InputStream;

    .line 919
    .line 920
    iput-object v6, v1, Lit1;->l0:Ljava/io/Closeable;

    .line 921
    .line 922
    iput-object v6, v1, Lit1;->m0:Ljava/io/FileOutputStream;

    .line 923
    .line 924
    iput-object v6, v1, Lit1;->n0:[B

    .line 925
    .line 926
    iput-object v6, v1, Lit1;->o0:Lca6;

    .line 927
    .line 928
    const/4 v3, 0x5

    .line 929
    iput-byte v3, v1, Lit1;->r0:B

    .line 930
    .line 931
    invoke-interface {v2, v4, v1}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    if-ne v0, v15, :cond_19

    .line 936
    .line 937
    :goto_1b
    return-object v15

    .line 938
    :cond_19
    :goto_1c
    return-object v18

    .line 939
    :cond_1a
    throw v0
.end method

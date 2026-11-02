.class public final Lxr7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmq7;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lxr7;->a:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lmq7;

    .line 18
    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lvz7;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lxr7;->b:Lvz7;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    instance-of v4, v3, Lrr7;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lrr7;

    .line 15
    .line 16
    iget v5, v4, Lrr7;->s0:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lrr7;->s0:I

    .line 26
    .line 27
    :goto_0
    move-object v13, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v4, Lrr7;

    .line 30
    .line 31
    invoke-direct {v4, v0, v3}, Lrr7;-><init>(Lxr7;Ls51;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v3, v13, Lrr7;->q0:Ljava/lang/Object;

    .line 36
    .line 37
    iget v4, v13, Lrr7;->s0:I

    .line 38
    .line 39
    const/4 v14, 0x5

    .line 40
    const/4 v15, 0x4

    .line 41
    const/4 v5, 0x3

    .line 42
    const/4 v6, 0x2

    .line 43
    const/4 v8, 0x1

    .line 44
    const/4 v9, 0x0

    .line 45
    sget-object v10, Lc71;->X:Lc71;

    .line 46
    .line 47
    if-eqz v4, :cond_6

    .line 48
    .line 49
    if-eq v4, v8, :cond_5

    .line 50
    .line 51
    if-eq v4, v6, :cond_4

    .line 52
    .line 53
    if-eq v4, v5, :cond_3

    .line 54
    .line 55
    if-eq v4, v15, :cond_2

    .line 56
    .line 57
    if-ne v4, v14, :cond_1

    .line 58
    .line 59
    iget-object v0, v13, Lrr7;->m0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 60
    .line 61
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_13

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v9

    .line 72
    :cond_2
    iget v0, v13, Lrr7;->p0:I

    .line 73
    .line 74
    iget v1, v13, Lrr7;->o0:I

    .line 75
    .line 76
    iget-boolean v2, v13, Lrr7;->n0:Z

    .line 77
    .line 78
    iget-object v4, v13, Lrr7;->m0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 79
    .line 80
    iget-object v5, v13, Lrr7;->l0:Lea6;

    .line 81
    .line 82
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move v8, v2

    .line 86
    move-object v14, v5

    .line 87
    move-object v2, v10

    .line 88
    move-object v5, v4

    .line 89
    move-object v4, v9

    .line 90
    goto/16 :goto_11

    .line 91
    .line 92
    :cond_3
    iget v1, v13, Lrr7;->p0:I

    .line 93
    .line 94
    iget v2, v13, Lrr7;->o0:I

    .line 95
    .line 96
    iget-boolean v4, v13, Lrr7;->n0:Z

    .line 97
    .line 98
    iget-object v5, v13, Lrr7;->l0:Lea6;

    .line 99
    .line 100
    iget-object v6, v13, Lrr7;->g0:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v3, Lsj6;

    .line 106
    .line 107
    iget-object v3, v3, Lsj6;->X:Ljava/lang/Object;

    .line 108
    .line 109
    move v8, v4

    .line 110
    move-object v14, v5

    .line 111
    move-object v4, v9

    .line 112
    move-object v5, v3

    .line 113
    move v3, v2

    .line 114
    move-object v2, v10

    .line 115
    goto/16 :goto_10

    .line 116
    .line 117
    :cond_4
    iget-object v0, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 118
    .line 119
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_c

    .line 123
    .line 124
    :cond_5
    iget v1, v13, Lrr7;->o0:I

    .line 125
    .line 126
    iget-boolean v2, v13, Lrr7;->n0:Z

    .line 127
    .line 128
    iget-object v4, v13, Lrr7;->l0:Lea6;

    .line 129
    .line 130
    iget-object v8, v13, Lrr7;->k0:Ljava/util/HashMap;

    .line 131
    .line 132
    iget-object v11, v13, Lrr7;->j0:Ljava/lang/Boolean;

    .line 133
    .line 134
    iget-object v12, v13, Lrr7;->i0:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v7, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 137
    .line 138
    iget-object v14, v13, Lrr7;->g0:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v15, v13, Lrr7;->f0:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    move v5, v2

    .line 146
    move-object v2, v7

    .line 147
    goto/16 :goto_a

    .line 148
    .line 149
    :cond_6
    invoke-static {v3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    if-eqz p5, :cond_7

    .line 153
    .line 154
    invoke-virtual/range {p5 .. p5}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-nez v3, :cond_8

    .line 159
    .line 160
    :cond_7
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->E()Ljava/util/Map;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :cond_8
    if-eqz p5, :cond_9

    .line 165
    .line 166
    invoke-virtual/range {p5 .. p5}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-nez v4, :cond_a

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->T()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    :cond_a
    if-eqz p5, :cond_c

    .line 177
    .line 178
    invoke-virtual/range {p5 .. p5}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    if-nez v7, :cond_b

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_b
    :goto_2
    move-object v12, v7

    .line 186
    goto :goto_4

    .line 187
    :cond_c
    :goto_3
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->H()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    goto :goto_2

    .line 192
    :goto_4
    if-nez p6, :cond_e

    .line 193
    .line 194
    if-eqz p5, :cond_d

    .line 195
    .line 196
    invoke-virtual/range {p5 .. p5}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    goto :goto_5

    .line 201
    :cond_d
    move-object v7, v9

    .line 202
    :goto_5
    if-nez v7, :cond_f

    .line 203
    .line 204
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->L()Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    goto :goto_6

    .line 209
    :cond_e
    move-object/from16 v7, p6

    .line 210
    .line 211
    :cond_f
    :goto_6
    if-eqz v3, :cond_10

    .line 212
    .line 213
    move v11, v8

    .line 214
    goto :goto_7

    .line 215
    :cond_10
    const/4 v11, 0x0

    .line 216
    :goto_7
    invoke-virtual {v2, v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    if-eqz v4, :cond_11

    .line 221
    .line 222
    new-instance v15, Ljava/net/URL;

    .line 223
    .line 224
    invoke-direct {v15, v14}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v15}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    new-instance v15, Lqg5;

    .line 232
    .line 233
    invoke-direct {v15, v14, v4}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    filled-new-array {v15}, [Lqg5;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-static {v4}, Lzp4;->I([Lqg5;)Ljava/util/HashMap;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    goto :goto_8

    .line 245
    :cond_11
    move-object v4, v9

    .line 246
    :goto_8
    new-instance v14, Lea6;

    .line 247
    .line 248
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 249
    .line 250
    .line 251
    if-nez v11, :cond_12

    .line 252
    .line 253
    move/from16 v8, p4

    .line 254
    .line 255
    move-object v6, v1

    .line 256
    move v1, v11

    .line 257
    const/4 v3, 0x0

    .line 258
    move-object v11, v7

    .line 259
    move-object/from16 v7, p2

    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_12
    sget-object v15, Ltp1;->a:Lnf1;

    .line 263
    .line 264
    sget-object v15, Ldm4;->a:Lhv2;

    .line 265
    .line 266
    new-instance v6, Lsr7;

    .line 267
    .line 268
    invoke-direct {v6, v14, v3, v4, v9}, Lsr7;-><init>(Lea6;Ljava/util/Map;Ljava/util/HashMap;Lq51;)V

    .line 269
    .line 270
    .line 271
    iput-object v1, v13, Lrr7;->f0:Ljava/lang/String;

    .line 272
    .line 273
    move-object/from16 v3, p2

    .line 274
    .line 275
    iput-object v3, v13, Lrr7;->g0:Ljava/lang/String;

    .line 276
    .line 277
    iput-object v2, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 278
    .line 279
    iput-object v12, v13, Lrr7;->i0:Ljava/lang/String;

    .line 280
    .line 281
    iput-object v7, v13, Lrr7;->j0:Ljava/lang/Boolean;

    .line 282
    .line 283
    iput-object v4, v13, Lrr7;->k0:Ljava/util/HashMap;

    .line 284
    .line 285
    iput-object v14, v13, Lrr7;->l0:Lea6;

    .line 286
    .line 287
    move/from16 v5, p4

    .line 288
    .line 289
    iput-boolean v5, v13, Lrr7;->n0:Z

    .line 290
    .line 291
    iput v11, v13, Lrr7;->o0:I

    .line 292
    .line 293
    iput v8, v13, Lrr7;->s0:I

    .line 294
    .line 295
    invoke-static {v15, v6, v13}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    if-ne v6, v10, :cond_13

    .line 300
    .line 301
    :goto_9
    move-object v2, v10

    .line 302
    goto/16 :goto_12

    .line 303
    .line 304
    :cond_13
    move-object v15, v1

    .line 305
    move-object v8, v4

    .line 306
    move v1, v11

    .line 307
    move-object v4, v14

    .line 308
    move-object v14, v3

    .line 309
    move-object v3, v6

    .line 310
    move-object v11, v7

    .line 311
    :goto_a
    check-cast v3, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    move-object v7, v14

    .line 318
    move-object v6, v15

    .line 319
    move-object v14, v4

    .line 320
    move-object v4, v8

    .line 321
    move v8, v5

    .line 322
    :goto_b
    if-eqz v3, :cond_15

    .line 323
    .line 324
    sget-object v0, Ltp1;->a:Lnf1;

    .line 325
    .line 326
    sget-object v0, Ldm4;->a:Lhv2;

    .line 327
    .line 328
    new-instance v4, Lcb2;

    .line 329
    .line 330
    const/4 v5, 0x3

    .line 331
    invoke-direct {v4, v14, v9, v5}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 332
    .line 333
    .line 334
    iput-object v9, v13, Lrr7;->f0:Ljava/lang/String;

    .line 335
    .line 336
    iput-object v9, v13, Lrr7;->g0:Ljava/lang/String;

    .line 337
    .line 338
    iput-object v2, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 339
    .line 340
    iput-object v9, v13, Lrr7;->i0:Ljava/lang/String;

    .line 341
    .line 342
    iput-object v9, v13, Lrr7;->j0:Ljava/lang/Boolean;

    .line 343
    .line 344
    iput-object v9, v13, Lrr7;->k0:Ljava/util/HashMap;

    .line 345
    .line 346
    iput-object v9, v13, Lrr7;->l0:Lea6;

    .line 347
    .line 348
    iput-boolean v8, v13, Lrr7;->n0:Z

    .line 349
    .line 350
    iput v1, v13, Lrr7;->o0:I

    .line 351
    .line 352
    iput v3, v13, Lrr7;->p0:I

    .line 353
    .line 354
    const/4 v1, 0x2

    .line 355
    iput v1, v13, Lrr7;->s0:I

    .line 356
    .line 357
    invoke-static {v0, v4, v13}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    if-ne v0, v10, :cond_14

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_14
    move-object v0, v2

    .line 365
    :goto_c
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 366
    .line 367
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    new-instance v2, Luq0;

    .line 376
    .line 377
    const/16 v3, 0x10

    .line 378
    .line 379
    invoke-direct {v2, v0, v3}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v2}, Lkf4;->h(Lgn2;)V

    .line 383
    .line 384
    .line 385
    new-instance v0, Lym;

    .line 386
    .line 387
    const-string v1, "Failed to start AntiFilter"

    .line 388
    .line 389
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :cond_15
    iget-object v2, v0, Lxr7;->b:Lvz7;

    .line 394
    .line 395
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    move-object v5, v2

    .line 400
    check-cast v5, La93;

    .line 401
    .line 402
    if-eqz v1, :cond_16

    .line 403
    .line 404
    new-instance v2, Ljava/net/Proxy;

    .line 405
    .line 406
    sget-object v15, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 407
    .line 408
    new-instance v9, Ljava/net/InetSocketAddress;

    .line 409
    .line 410
    move-object/from16 p1, v4

    .line 411
    .line 412
    const-string v4, "127.0.0.1"

    .line 413
    .line 414
    move-object/from16 p2, v5

    .line 415
    .line 416
    invoke-static {}, Ln67;->d()I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    invoke-direct {v9, v4, v5}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 421
    .line 422
    .line 423
    invoke-direct {v2, v15, v9}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 424
    .line 425
    .line 426
    move-object v9, v2

    .line 427
    goto :goto_d

    .line 428
    :cond_16
    move-object/from16 p1, v4

    .line 429
    .line 430
    move-object/from16 p2, v5

    .line 431
    .line 432
    const/4 v9, 0x0

    .line 433
    :goto_d
    if-eqz v11, :cond_17

    .line 434
    .line 435
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    :goto_e
    const/4 v4, 0x0

    .line 440
    goto :goto_f

    .line 441
    :cond_17
    const/4 v2, 0x0

    .line 442
    goto :goto_e

    .line 443
    :goto_f
    iput-object v4, v13, Lrr7;->f0:Ljava/lang/String;

    .line 444
    .line 445
    iput-object v7, v13, Lrr7;->g0:Ljava/lang/String;

    .line 446
    .line 447
    iput-object v4, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 448
    .line 449
    iput-object v4, v13, Lrr7;->i0:Ljava/lang/String;

    .line 450
    .line 451
    iput-object v4, v13, Lrr7;->j0:Ljava/lang/Boolean;

    .line 452
    .line 453
    iput-object v4, v13, Lrr7;->k0:Ljava/util/HashMap;

    .line 454
    .line 455
    iput-object v14, v13, Lrr7;->l0:Lea6;

    .line 456
    .line 457
    iput-boolean v8, v13, Lrr7;->n0:Z

    .line 458
    .line 459
    iput v1, v13, Lrr7;->o0:I

    .line 460
    .line 461
    iput v3, v13, Lrr7;->p0:I

    .line 462
    .line 463
    const/4 v5, 0x3

    .line 464
    iput v5, v13, Lrr7;->s0:I

    .line 465
    .line 466
    move-object/from16 v5, p2

    .line 467
    .line 468
    move-object v11, v12

    .line 469
    move v12, v2

    .line 470
    move-object v2, v10

    .line 471
    move-object/from16 v10, p1

    .line 472
    .line 473
    invoke-virtual/range {v5 .. v13}, La93;->b(Ljava/lang/String;Ljava/lang/String;ZLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    if-ne v5, v2, :cond_18

    .line 478
    .line 479
    goto/16 :goto_12

    .line 480
    .line 481
    :cond_18
    move v6, v3

    .line 482
    move v3, v1

    .line 483
    move v1, v6

    .line 484
    move-object v6, v7

    .line 485
    :goto_10
    invoke-static {v5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    check-cast v5, Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 489
    .line 490
    sget-object v7, Lkw4;->a:Lkw4;

    .line 491
    .line 492
    invoke-static {v6}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    if-eqz v7, :cond_1a

    .line 497
    .line 498
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    if-eqz v9, :cond_1a

    .line 503
    .line 504
    iget-object v0, v0, Lxr7;->a:Lvz7;

    .line 505
    .line 506
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, Lgk7;

    .line 511
    .line 512
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    iput-object v4, v13, Lrr7;->f0:Ljava/lang/String;

    .line 517
    .line 518
    iput-object v4, v13, Lrr7;->g0:Ljava/lang/String;

    .line 519
    .line 520
    iput-object v4, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 521
    .line 522
    iput-object v4, v13, Lrr7;->i0:Ljava/lang/String;

    .line 523
    .line 524
    iput-object v4, v13, Lrr7;->j0:Ljava/lang/Boolean;

    .line 525
    .line 526
    iput-object v4, v13, Lrr7;->k0:Ljava/util/HashMap;

    .line 527
    .line 528
    iput-object v14, v13, Lrr7;->l0:Lea6;

    .line 529
    .line 530
    iput-object v5, v13, Lrr7;->m0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 531
    .line 532
    iput-boolean v8, v13, Lrr7;->n0:Z

    .line 533
    .line 534
    iput v3, v13, Lrr7;->o0:I

    .line 535
    .line 536
    iput v1, v13, Lrr7;->p0:I

    .line 537
    .line 538
    const/4 v10, 0x4

    .line 539
    iput v10, v13, Lrr7;->s0:I

    .line 540
    .line 541
    invoke-virtual {v0, v9, v7, v6, v13}, Lgk7;->a(Lsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/String;Ls51;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    if-ne v0, v2, :cond_19

    .line 546
    .line 547
    goto :goto_12

    .line 548
    :cond_19
    move v0, v1

    .line 549
    move v1, v3

    .line 550
    :goto_11
    move v3, v1

    .line 551
    move v1, v0

    .line 552
    :cond_1a
    move-object v0, v5

    .line 553
    sget-object v5, Ltp1;->a:Lnf1;

    .line 554
    .line 555
    sget-object v5, Ldm4;->a:Lhv2;

    .line 556
    .line 557
    new-instance v6, Lcb2;

    .line 558
    .line 559
    const/4 v10, 0x4

    .line 560
    invoke-direct {v6, v14, v4, v10}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 561
    .line 562
    .line 563
    iput-object v4, v13, Lrr7;->f0:Ljava/lang/String;

    .line 564
    .line 565
    iput-object v4, v13, Lrr7;->g0:Ljava/lang/String;

    .line 566
    .line 567
    iput-object v4, v13, Lrr7;->h0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 568
    .line 569
    iput-object v4, v13, Lrr7;->i0:Ljava/lang/String;

    .line 570
    .line 571
    iput-object v4, v13, Lrr7;->j0:Ljava/lang/Boolean;

    .line 572
    .line 573
    iput-object v4, v13, Lrr7;->k0:Ljava/util/HashMap;

    .line 574
    .line 575
    iput-object v4, v13, Lrr7;->l0:Lea6;

    .line 576
    .line 577
    iput-object v0, v13, Lrr7;->m0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 578
    .line 579
    iput-boolean v8, v13, Lrr7;->n0:Z

    .line 580
    .line 581
    iput v3, v13, Lrr7;->o0:I

    .line 582
    .line 583
    iput v1, v13, Lrr7;->p0:I

    .line 584
    .line 585
    const/4 v1, 0x5

    .line 586
    iput v1, v13, Lrr7;->s0:I

    .line 587
    .line 588
    invoke-static {v5, v6, v13}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    if-ne v1, v2, :cond_1b

    .line 593
    .line 594
    :goto_12
    return-object v2

    .line 595
    :cond_1b
    :goto_13
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->d()Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    if-nez v1, :cond_1d

    .line 600
    .line 601
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->c()Lpr;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    iget-object v1, v1, Lpr;->a:Ljava/lang/String;

    .line 606
    .line 607
    const-string v2, "sub_restricted"

    .line 608
    .line 609
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    if-nez v1, :cond_1c

    .line 614
    .line 615
    goto :goto_14

    .line 616
    :cond_1c
    new-instance v0, Lau7;

    .line 617
    .line 618
    const-string v1, "Subscription is restricted"

    .line 619
    .line 620
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    throw v0

    .line 624
    :cond_1d
    :goto_14
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->b()Lq23;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    if-nez v1, :cond_1e

    .line 629
    .line 630
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->c()Lpr;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    iget-object v0, v0, Lpr;->a:Ljava/lang/String;

    .line 635
    .line 636
    return-object v0

    .line 637
    :cond_1e
    new-instance v1, Lqr7;

    .line 638
    .line 639
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->b()Lq23;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-direct {v1, v0}, Lqr7;-><init>(Lq23;)V

    .line 644
    .line 645
    .line 646
    throw v1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lgn2;Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Ltr7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Ltr7;

    .line 7
    .line 8
    iget v1, v0, Ltr7;->l0:I

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
    iput v1, v0, Ltr7;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltr7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Ltr7;-><init>(Lxr7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Ltr7;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget p4, v0, Ltr7;->l0:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x1

    .line 32
    sget-object v4, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz p4, :cond_3

    .line 35
    .line 36
    if-eq p4, v3, :cond_2

    .line 37
    .line 38
    if-ne p4, v1, :cond_1

    .line 39
    .line 40
    iget-boolean p1, v0, Ltr7;->i0:Z

    .line 41
    .line 42
    iget-object p2, v0, Ltr7;->h0:Lgn2;

    .line 43
    .line 44
    iget-object p3, v0, Ltr7;->g0:Ljava/lang/String;

    .line 45
    .line 46
    iget-object p4, v0, Ltr7;->f0:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    iget-boolean p1, v0, Ltr7;->i0:Z

    .line 60
    .line 61
    iget-object p3, v0, Ltr7;->h0:Lgn2;

    .line 62
    .line 63
    iget-object p2, v0, Ltr7;->g0:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p4, v0, Ltr7;->f0:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v9, p2

    .line 71
    move p2, p1

    .line 72
    move-object p1, p4

    .line 73
    :goto_1
    move-object p4, p3

    .line 74
    move-object p3, v9

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_12

    .line 84
    .line 85
    invoke-static {p2}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    sget-object p4, Lkw2;->a:Lkw2;

    .line 90
    .line 91
    iput-object p1, v0, Ltr7;->f0:Ljava/lang/String;

    .line 92
    .line 93
    iput-object p2, v0, Ltr7;->g0:Ljava/lang/String;

    .line 94
    .line 95
    iput-object p3, v0, Ltr7;->h0:Lgn2;

    .line 96
    .line 97
    iput-boolean p0, v0, Ltr7;->i0:Z

    .line 98
    .line 99
    iput v3, v0, Ltr7;->l0:I

    .line 100
    .line 101
    invoke-virtual {p4, p1, p2, p0, v0}, Lkw2;->d(Ljava/lang/String;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    if-ne p4, v4, :cond_4

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    move-object v9, p2

    .line 109
    move p2, p0

    .line 110
    move-object p0, p4

    .line 111
    goto :goto_1

    .line 112
    :goto_2
    move-object v5, p0

    .line 113
    check-cast v5, Lsu/happ/proxyutility/dto/ImportResult;

    .line 114
    .line 115
    sget-object v6, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 116
    .line 117
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v6}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    new-instance v7, Lqj4;

    .line 126
    .line 127
    const/4 v8, 0x3

    .line 128
    invoke-direct {v7, v5, v8}, Lqj4;-><init>(Lsu/happ/proxyutility/dto/ImportResult;B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v7}, Lkf4;->h(Lgn2;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    instance-of v6, v6, Lv83;

    .line 139
    .line 140
    if-eqz v6, :cond_6

    .line 141
    .line 142
    if-eqz p4, :cond_5

    .line 143
    .line 144
    invoke-interface {p4, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    check-cast v5, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-ne v5, v3, :cond_5

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_5
    move-object p0, v2

    .line 158
    :cond_6
    :goto_3
    check-cast p0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 159
    .line 160
    if-eqz p0, :cond_7

    .line 161
    .line 162
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-gtz v5, :cond_b

    .line 167
    .line 168
    :cond_7
    sget-object p0, Lkw2;->a:Lkw2;

    .line 169
    .line 170
    sget-object v5, Lss8;->a:Lss8;

    .line 171
    .line 172
    invoke-static {p1}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    iput-object p1, v0, Ltr7;->f0:Ljava/lang/String;

    .line 177
    .line 178
    iput-object p3, v0, Ltr7;->g0:Ljava/lang/String;

    .line 179
    .line 180
    iput-object p4, v0, Ltr7;->h0:Lgn2;

    .line 181
    .line 182
    iput-boolean p2, v0, Ltr7;->i0:Z

    .line 183
    .line 184
    iput v1, v0, Ltr7;->l0:I

    .line 185
    .line 186
    invoke-virtual {p0, v5, p3, p2, v0}, Lkw2;->d(Ljava/lang/String;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-ne p0, v4, :cond_8

    .line 191
    .line 192
    :goto_4
    return-object v4

    .line 193
    :cond_8
    move-object v9, p4

    .line 194
    move-object p4, p1

    .line 195
    move p1, p2

    .line 196
    move-object p2, v9

    .line 197
    :goto_5
    move-object v0, p0

    .line 198
    check-cast v0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 199
    .line 200
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 201
    .line 202
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    new-instance v4, Lqj4;

    .line 211
    .line 212
    const/4 v5, 0x4

    .line 213
    invoke-direct {v4, v0, v5}, Lqj4;-><init>(Lsu/happ/proxyutility/dto/ImportResult;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v4}, Lkf4;->h(Lgn2;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    instance-of v1, v1, Lv83;

    .line 224
    .line 225
    if-eqz v1, :cond_a

    .line 226
    .line 227
    if-eqz p2, :cond_9

    .line 228
    .line 229
    invoke-interface {p2, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-ne v0, v3, :cond_9

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_9
    move-object p0, v2

    .line 243
    :cond_a
    :goto_6
    check-cast p0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 244
    .line 245
    move-object v9, p2

    .line 246
    move p2, p1

    .line 247
    move-object p1, p4

    .line 248
    move-object p4, v9

    .line 249
    :cond_b
    if-eqz p0, :cond_c

    .line 250
    .line 251
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-gtz v0, :cond_f

    .line 256
    .line 257
    :cond_c
    sget-object p0, Lkw2;->a:Lkw2;

    .line 258
    .line 259
    invoke-static {p1, p2, p3}, Lkw2;->a(Ljava/lang/String;ZLjava/lang/String;)Lsu/happ/proxyutility/dto/ImportResult;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    new-instance p2, Lqj4;

    .line 272
    .line 273
    const/4 v0, 0x5

    .line 274
    invoke-direct {p2, p0, v0}, Lqj4;-><init>(Lsu/happ/proxyutility/dto/ImportResult;B)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, p2}, Lkf4;->h(Lgn2;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    instance-of p1, p1, Lv83;

    .line 285
    .line 286
    if-eqz p1, :cond_d

    .line 287
    .line 288
    if-eqz p4, :cond_e

    .line 289
    .line 290
    invoke-interface {p4, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    check-cast p1, Ljava/lang/Boolean;

    .line 295
    .line 296
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-ne p1, v3, :cond_e

    .line 301
    .line 302
    :cond_d
    move-object v2, p0

    .line 303
    :cond_e
    move-object p0, v2

    .line 304
    :cond_f
    if-eqz p0, :cond_11

    .line 305
    .line 306
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-gtz p1, :cond_10

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_10
    return-object p0

    .line 314
    :cond_11
    :goto_7
    sget-object p1, Lkw4;->a:Lkw4;

    .line 315
    .line 316
    invoke-static {p3}, Lkw4;->r(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object p0

    .line 320
    :cond_12
    new-instance p0, Lxz1;

    .line 321
    .line 322
    const-string p1, "Empty batch input"

    .line 323
    .line 324
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw p0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Lgn2;Lrn2;Ls51;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p6, Lur7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lur7;

    .line 7
    .line 8
    iget v1, v0, Lur7;->l0:I

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
    iput v1, v0, Lur7;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lur7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lur7;-><init>(Lxr7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lur7;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lur7;->l0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lur7;->i0:Lsu/happ/proxyutility/dto/ImportResult;

    .line 41
    .line 42
    iget-object p1, v0, Lur7;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 43
    .line 44
    iget-object p2, v0, Lur7;->f0:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p6}, Lw39;->n0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v4

    .line 56
    :cond_2
    iget-object p0, v0, Lur7;->h0:Luy7;

    .line 57
    .line 58
    move-object p5, p0

    .line 59
    check-cast p5, Lrn2;

    .line 60
    .line 61
    iget-object p3, v0, Lur7;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 62
    .line 63
    iget-object p2, v0, Lur7;->f0:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {p6}, Lw39;->n0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p6}, Lw39;->n0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object p2, v0, Lur7;->f0:Ljava/lang/String;

    .line 73
    .line 74
    iput-object p3, v0, Lur7;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 75
    .line 76
    move-object p6, p5

    .line 77
    check-cast p6, Luy7;

    .line 78
    .line 79
    iput-object p6, v0, Lur7;->h0:Luy7;

    .line 80
    .line 81
    iput v3, v0, Lur7;->l0:I

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2, p4, v0}, Lxr7;->b(Ljava/lang/String;Ljava/lang/String;Lgn2;Ls51;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p6

    .line 87
    if-ne p6, v5, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    :goto_1
    move-object p0, p6

    .line 91
    check-cast p0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 92
    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    if-eqz p5, :cond_6

    .line 96
    .line 97
    iput-object p2, v0, Lur7;->f0:Ljava/lang/String;

    .line 98
    .line 99
    iput-object p3, v0, Lur7;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 100
    .line 101
    iput-object v4, v0, Lur7;->h0:Luy7;

    .line 102
    .line 103
    iput-object p0, v0, Lur7;->i0:Lsu/happ/proxyutility/dto/ImportResult;

    .line 104
    .line 105
    iput v2, v0, Lur7;->l0:I

    .line 106
    .line 107
    invoke-interface {p5, p0, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v5, :cond_5

    .line 112
    .line 113
    :goto_2
    return-object v5

    .line 114
    :cond_5
    move-object p1, p3

    .line 115
    :goto_3
    move-object p3, p1

    .line 116
    :cond_6
    if-eqz p0, :cond_8

    .line 117
    .line 118
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    sget-object p4, Lw83;->a:Lw83;

    .line 123
    .line 124
    invoke-static {p1, p4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-lez p0, :cond_8

    .line 135
    .line 136
    :cond_7
    move p0, v3

    .line 137
    goto :goto_4

    .line 138
    :cond_8
    const/4 p0, 0x0

    .line 139
    :goto_4
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_a

    .line 144
    .line 145
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object p4

    .line 149
    if-eqz p4, :cond_9

    .line 150
    .line 151
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;

    .line 152
    .line 153
    invoke-direct {v4, p4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;-><init>(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    :cond_9
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p5

    .line 164
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object p6

    .line 168
    filled-new-array {v4, p4, p5, p6}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    invoke-static {p4}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object p4

    .line 176
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result p4

    .line 180
    xor-int/2addr p4, v3

    .line 181
    if-ne p4, v3, :cond_a

    .line 182
    .line 183
    sget-object p4, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 184
    .line 185
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 186
    .line 187
    .line 188
    move-result-object p4

    .line 189
    invoke-virtual {p4}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 190
    .line 191
    .line 192
    move-result-object p4

    .line 193
    new-instance p5, Lza2;

    .line 194
    .line 195
    const/4 p6, 0x3

    .line 196
    invoke-direct {p5, p1, p3, p6}, Lza2;-><init>(Lsu/happ/proxyutility/dto/MetaParams;Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p4, p5}, Lkf4;->h(Lgn2;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    if-eqz p0, :cond_c

    .line 203
    .line 204
    sget-object p1, Lkw4;->a:Lkw4;

    .line 205
    .line 206
    invoke-static {p2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-nez v0, :cond_b

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_b
    invoke-static {}, Ly08;->c()J

    .line 214
    .line 215
    .line 216
    move-result-wide v1

    .line 217
    const/4 v6, 0x0

    .line 218
    const v7, 0xffffdff

    .line 219
    .line 220
    .line 221
    const/4 v3, 0x0

    .line 222
    const/4 v4, 0x0

    .line 223
    const/4 v5, 0x0

    .line 224
    invoke-static/range {v0 .. v7}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {p1, p2}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_c
    :goto_5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0
.end method

.method public final d(Ljava/lang/String;ZLjava/lang/String;Ldn2;Lgn2;Lgn2;Lsn2;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    instance-of v1, v0, Lvr7;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lvr7;

    .line 9
    .line 10
    iget v2, v1, Lvr7;->r0:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lvr7;->r0:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    :goto_0
    move-object v9, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lvr7;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lvr7;-><init>(Lxr7;Ls51;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v9, Lvr7;->p0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, v9, Lvr7;->r0:I

    .line 36
    .line 37
    const/4 v10, 0x5

    .line 38
    const/4 v11, 0x4

    .line 39
    const/4 v12, 0x3

    .line 40
    const/4 v13, 0x1

    .line 41
    const/4 v14, 0x2

    .line 42
    const/4 v15, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    sget-object v4, Lc71;->X:Lc71;

    .line 45
    .line 46
    if-eqz v1, :cond_6

    .line 47
    .line 48
    if-eq v1, v13, :cond_5

    .line 49
    .line 50
    if-eq v1, v14, :cond_4

    .line 51
    .line 52
    if-eq v1, v12, :cond_3

    .line 53
    .line 54
    if-eq v1, v11, :cond_2

    .line 55
    .line 56
    if-ne v1, v10, :cond_1

    .line 57
    .line 58
    iget v1, v9, Lvr7;->o0:I

    .line 59
    .line 60
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    goto/16 :goto_26

    .line 64
    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto/16 :goto_2b

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v3

    .line 74
    :cond_2
    iget-boolean v1, v9, Lvr7;->n0:Z

    .line 75
    .line 76
    iget v5, v9, Lvr7;->o0:I

    .line 77
    .line 78
    iget-boolean v6, v9, Lvr7;->m0:Z

    .line 79
    .line 80
    iget-object v7, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 81
    .line 82
    iget-object v8, v9, Lvr7;->j0:Lsn2;

    .line 83
    .line 84
    iget-object v11, v9, Lvr7;->i0:Lgn2;

    .line 85
    .line 86
    iget-object v12, v9, Lvr7;->f0:Ljava/lang/String;

    .line 87
    .line 88
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    move-object v13, v4

    .line 92
    goto/16 :goto_20

    .line 93
    .line 94
    :catchall_1
    move-exception v0

    .line 95
    move v2, v1

    .line 96
    move-object v13, v4

    .line 97
    :goto_2
    move v1, v5

    .line 98
    goto/16 :goto_23

    .line 99
    .line 100
    :cond_3
    iget-boolean v1, v9, Lvr7;->n0:Z

    .line 101
    .line 102
    iget v5, v9, Lvr7;->o0:I

    .line 103
    .line 104
    iget-boolean v6, v9, Lvr7;->m0:Z

    .line 105
    .line 106
    iget-object v7, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 107
    .line 108
    iget-object v8, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 109
    .line 110
    iget-object v12, v9, Lvr7;->j0:Lsn2;

    .line 111
    .line 112
    iget-object v14, v9, Lvr7;->i0:Lgn2;

    .line 113
    .line 114
    iget-object v10, v9, Lvr7;->g0:Ldn2;

    .line 115
    .line 116
    iget-object v11, v9, Lvr7;->f0:Ljava/lang/String;

    .line 117
    .line 118
    :try_start_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 119
    .line 120
    .line 121
    move-object v13, v4

    .line 122
    goto/16 :goto_1d

    .line 123
    .line 124
    :catchall_2
    move-exception v0

    .line 125
    move v1, v5

    .line 126
    goto/16 :goto_2b

    .line 127
    .line 128
    :cond_4
    iget v1, v9, Lvr7;->o0:I

    .line 129
    .line 130
    iget-boolean v5, v9, Lvr7;->m0:Z

    .line 131
    .line 132
    iget-object v6, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 133
    .line 134
    iget-object v7, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 135
    .line 136
    iget-object v8, v9, Lvr7;->j0:Lsn2;

    .line 137
    .line 138
    iget-object v10, v9, Lvr7;->i0:Lgn2;

    .line 139
    .line 140
    iget-object v11, v9, Lvr7;->h0:Lgn2;

    .line 141
    .line 142
    iget-object v14, v9, Lvr7;->g0:Ldn2;

    .line 143
    .line 144
    iget-object v12, v9, Lvr7;->f0:Ljava/lang/String;

    .line 145
    .line 146
    :try_start_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 147
    .line 148
    .line 149
    move-object v13, v4

    .line 150
    goto/16 :goto_13

    .line 151
    .line 152
    :catchall_3
    move-exception v0

    .line 153
    move-object v13, v4

    .line 154
    goto/16 :goto_18

    .line 155
    .line 156
    :cond_5
    iget v1, v9, Lvr7;->o0:I

    .line 157
    .line 158
    iget-boolean v5, v9, Lvr7;->m0:Z

    .line 159
    .line 160
    iget-object v6, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 161
    .line 162
    iget-object v7, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 163
    .line 164
    iget-object v8, v9, Lvr7;->j0:Lsn2;

    .line 165
    .line 166
    iget-object v10, v9, Lvr7;->i0:Lgn2;

    .line 167
    .line 168
    iget-object v11, v9, Lvr7;->h0:Lgn2;

    .line 169
    .line 170
    iget-object v12, v9, Lvr7;->g0:Ldn2;

    .line 171
    .line 172
    iget-object v14, v9, Lvr7;->f0:Ljava/lang/String;

    .line 173
    .line 174
    :try_start_4
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 175
    .line 176
    .line 177
    move-object v2, v12

    .line 178
    move-object v12, v10

    .line 179
    move-object v10, v2

    .line 180
    move v2, v1

    .line 181
    move-object v1, v3

    .line 182
    move-object v13, v4

    .line 183
    goto/16 :goto_7

    .line 184
    .line 185
    :catchall_4
    move-exception v0

    .line 186
    move-object v2, v12

    .line 187
    move-object v12, v10

    .line 188
    move-object v10, v2

    .line 189
    move v2, v1

    .line 190
    move-object v1, v3

    .line 191
    move-object v13, v4

    .line 192
    goto/16 :goto_e

    .line 193
    .line 194
    :cond_6
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :try_start_5
    sget-object v0, Lkw4;->a:Lkw4;

    .line 198
    .line 199
    invoke-static/range {p1 .. p1}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    if-nez v5, :cond_7

    .line 204
    .line 205
    new-instance v0, Lxu7;

    .line 206
    .line 207
    invoke-direct {v0, v3}, Lxu7;-><init>(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1d

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :goto_3
    move v1, v15

    .line 212
    goto/16 :goto_2b

    .line 213
    .line 214
    :cond_7
    if-nez p3, :cond_8

    .line 215
    .line 216
    :try_start_6
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 220
    :goto_4
    move-object v1, v4

    .line 221
    move-object/from16 v4, p1

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :catchall_5
    move-exception v0

    .line 225
    move-object/from16 v14, p1

    .line 226
    .line 227
    move-object/from16 v10, p4

    .line 228
    .line 229
    move-object/from16 v11, p5

    .line 230
    .line 231
    move-object/from16 v12, p6

    .line 232
    .line 233
    move-object/from16 v8, p7

    .line 234
    .line 235
    move-object/from16 v7, p8

    .line 236
    .line 237
    move-object v1, v3

    .line 238
    move-object v13, v4

    .line 239
    move-object v6, v5

    .line 240
    move v2, v15

    .line 241
    :goto_5
    move/from16 v5, p2

    .line 242
    .line 243
    goto/16 :goto_e

    .line 244
    .line 245
    :cond_8
    move-object/from16 v0, p3

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :goto_6
    :try_start_7
    iput-object v4, v9, Lvr7;->f0:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_c

    .line 249
    .line 250
    move-object/from16 v10, p4

    .line 251
    .line 252
    :try_start_8
    iput-object v10, v9, Lvr7;->g0:Ldn2;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 253
    .line 254
    move-object/from16 v11, p5

    .line 255
    .line 256
    :try_start_9
    iput-object v11, v9, Lvr7;->h0:Lgn2;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 257
    .line 258
    move-object/from16 v12, p6

    .line 259
    .line 260
    :try_start_a
    iput-object v12, v9, Lvr7;->i0:Lgn2;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 261
    .line 262
    move-object/from16 v14, p7

    .line 263
    .line 264
    :try_start_b
    iput-object v14, v9, Lvr7;->j0:Lsn2;

    .line 265
    .line 266
    move-object/from16 v8, p8

    .line 267
    .line 268
    iput-object v8, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 269
    .line 270
    iput-object v5, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 271
    .line 272
    move/from16 v6, p2

    .line 273
    .line 274
    iput-boolean v6, v9, Lvr7;->m0:Z

    .line 275
    .line 276
    iput v15, v9, Lvr7;->o0:I

    .line 277
    .line 278
    iput v13, v9, Lvr7;->r0:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    move-object v13, v1

    .line 282
    move-object v1, v3

    .line 283
    move-object v3, v0

    .line 284
    :try_start_c
    invoke-virtual/range {v2 .. v9}, Lxr7;->a(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 288
    if-ne v0, v13, :cond_9

    .line 289
    .line 290
    goto/16 :goto_25

    .line 291
    .line 292
    :cond_9
    move-object/from16 v7, p8

    .line 293
    .line 294
    move-object v6, v5

    .line 295
    move-object v8, v14

    .line 296
    move v2, v15

    .line 297
    move-object/from16 v14, p1

    .line 298
    .line 299
    move/from16 v5, p2

    .line 300
    .line 301
    :goto_7
    :try_start_d
    check-cast v0, Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 302
    .line 303
    :goto_8
    move-object v3, v14

    .line 304
    move-object v14, v10

    .line 305
    move-object v10, v12

    .line 306
    goto :goto_f

    .line 307
    :catchall_6
    move-exception v0

    .line 308
    goto :goto_e

    .line 309
    :catchall_7
    move-exception v0

    .line 310
    :goto_9
    move-object/from16 v7, p8

    .line 311
    .line 312
    move-object v6, v5

    .line 313
    move-object v8, v14

    .line 314
    move v2, v15

    .line 315
    move-object/from16 v14, p1

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :catchall_8
    move-exception v0

    .line 319
    :goto_a
    move-object v13, v1

    .line 320
    move-object v1, v3

    .line 321
    goto :goto_9

    .line 322
    :catchall_9
    move-exception v0

    .line 323
    :goto_b
    move-object/from16 v14, p7

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :catchall_a
    move-exception v0

    .line 327
    :goto_c
    move-object/from16 v12, p6

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :catchall_b
    move-exception v0

    .line 331
    :goto_d
    move-object/from16 v11, p5

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :catchall_c
    move-exception v0

    .line 335
    move-object/from16 v10, p4

    .line 336
    .line 337
    goto :goto_d

    .line 338
    :goto_e
    :try_start_e
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 339
    .line 340
    if-nez v3, :cond_21

    .line 341
    .line 342
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 343
    .line 344
    if-nez v3, :cond_21

    .line 345
    .line 346
    new-instance v3, Lrj6;

    .line 347
    .line 348
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1c

    .line 349
    .line 350
    .line 351
    move-object v0, v3

    .line 352
    goto :goto_8

    .line 353
    :goto_f
    :try_start_f
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    if-nez v4, :cond_a

    .line 358
    .line 359
    check-cast v0, Ljava/lang/String;

    .line 360
    .line 361
    new-instance v4, Lsj6;

    .line 362
    .line 363
    invoke-direct {v4, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 367
    .line 368
    new-instance v12, Lqg5;

    .line 369
    .line 370
    invoke-direct {v12, v4, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :goto_10
    move v1, v2

    .line 374
    goto/16 :goto_1b

    .line 375
    .line 376
    :goto_11
    move v1, v2

    .line 377
    goto/16 :goto_2b

    .line 378
    .line 379
    :catchall_d
    move-exception v0

    .line 380
    goto :goto_11

    .line 381
    :cond_a
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->D()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    if-eqz v0, :cond_10

    .line 386
    .line 387
    sget-object v4, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 388
    .line 389
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-virtual {v4}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    new-instance v12, Lzx6;

    .line 398
    .line 399
    const/16 v1, 0xb

    .line 400
    .line 401
    invoke-direct {v12, v1}, Lzx6;-><init>(B)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4, v12}, Lkf4;->h(Lgn2;)V

    .line 405
    .line 406
    .line 407
    if-eqz v14, :cond_b

    .line 408
    .line 409
    invoke-interface {v14}, Ldn2;->invoke()Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_d

    .line 410
    .line 411
    .line 412
    :cond_b
    :try_start_10
    invoke-static {v0}, Lzl7;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_11

    .line 416
    :try_start_11
    new-instance v4, Ljava/net/URI;

    .line 417
    .line 418
    invoke-direct {v4, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-static {v0}, Lzl7;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 429
    .line 430
    .line 431
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 432
    goto :goto_12

    .line 433
    :catchall_e
    move-exception v0

    .line 434
    :try_start_12
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 435
    .line 436
    if-nez v4, :cond_e

    .line 437
    .line 438
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 439
    .line 440
    if-nez v4, :cond_e

    .line 441
    .line 442
    new-instance v4, Lrj6;

    .line 443
    .line 444
    invoke-direct {v4, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 445
    .line 446
    .line 447
    move-object v0, v4

    .line 448
    :goto_12
    :try_start_13
    nop

    .line 449
    instance-of v4, v0, Lrj6;

    .line 450
    .line 451
    if-eqz v4, :cond_c

    .line 452
    .line 453
    const/4 v0, 0x0

    .line 454
    :cond_c
    check-cast v0, Lsu/happ/proxyutility/dto/MetaParams;

    .line 455
    .line 456
    iput-object v3, v9, Lvr7;->f0:Ljava/lang/String;

    .line 457
    .line 458
    iput-object v14, v9, Lvr7;->g0:Ldn2;

    .line 459
    .line 460
    iput-object v11, v9, Lvr7;->h0:Lgn2;

    .line 461
    .line 462
    iput-object v10, v9, Lvr7;->i0:Lgn2;

    .line 463
    .line 464
    iput-object v8, v9, Lvr7;->j0:Lsn2;

    .line 465
    .line 466
    iput-object v7, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 467
    .line 468
    iput-object v6, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 469
    .line 470
    iput-boolean v5, v9, Lvr7;->m0:Z

    .line 471
    .line 472
    iput v2, v9, Lvr7;->o0:I

    .line 473
    .line 474
    const/4 v4, 0x2

    .line 475
    iput v4, v9, Lvr7;->r0:I
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    .line 476
    .line 477
    move-object/from16 p1, p0

    .line 478
    .line 479
    move-object/from16 p6, v0

    .line 480
    .line 481
    move-object/from16 p2, v1

    .line 482
    .line 483
    move-object/from16 p3, v3

    .line 484
    .line 485
    move/from16 p5, v5

    .line 486
    .line 487
    move-object/from16 p4, v6

    .line 488
    .line 489
    move-object/from16 p7, v7

    .line 490
    .line 491
    move-object/from16 p8, v9

    .line 492
    .line 493
    :try_start_14
    invoke-virtual/range {p1 .. p8}, Lxr7;->a(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    .line 497
    move-object/from16 v12, p3

    .line 498
    .line 499
    move-object/from16 v6, p4

    .line 500
    .line 501
    move/from16 v5, p5

    .line 502
    .line 503
    move-object/from16 v7, p7

    .line 504
    .line 505
    move-object/from16 v9, p8

    .line 506
    .line 507
    if-ne v0, v13, :cond_d

    .line 508
    .line 509
    goto/16 :goto_25

    .line 510
    .line 511
    :cond_d
    move v1, v2

    .line 512
    :goto_13
    :try_start_15
    check-cast v0, Ljava/lang/String;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_f

    .line 513
    .line 514
    :goto_14
    move-object v3, v12

    .line 515
    goto :goto_19

    .line 516
    :catchall_f
    move-exception v0

    .line 517
    goto :goto_18

    .line 518
    :catchall_10
    move-exception v0

    .line 519
    move-object/from16 v12, p3

    .line 520
    .line 521
    move-object/from16 v6, p4

    .line 522
    .line 523
    move/from16 v5, p5

    .line 524
    .line 525
    move-object/from16 v7, p7

    .line 526
    .line 527
    move-object/from16 v9, p8

    .line 528
    .line 529
    :goto_15
    move v1, v2

    .line 530
    goto :goto_18

    .line 531
    :catchall_11
    move-exception v0

    .line 532
    move-object v12, v3

    .line 533
    goto :goto_15

    .line 534
    :cond_e
    move-object v12, v3

    .line 535
    goto :goto_16

    .line 536
    :catchall_12
    move-exception v0

    .line 537
    move-object v12, v3

    .line 538
    goto :goto_17

    .line 539
    :goto_16
    :try_start_16
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 540
    :catchall_13
    move-exception v0

    .line 541
    :goto_17
    :try_start_17
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_14

    .line 542
    :catchall_14
    move-exception v0

    .line 543
    goto :goto_15

    .line 544
    :goto_18
    :try_start_18
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 545
    .line 546
    if-nez v2, :cond_f

    .line 547
    .line 548
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 549
    .line 550
    if-nez v2, :cond_f

    .line 551
    .line 552
    new-instance v2, Lrj6;

    .line 553
    .line 554
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_15

    .line 555
    .line 556
    .line 557
    move-object v0, v2

    .line 558
    goto :goto_14

    .line 559
    :goto_19
    :try_start_19
    new-instance v2, Lsj6;

    .line 560
    .line 561
    invoke-direct {v2, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 565
    .line 566
    new-instance v4, Lqg5;

    .line 567
    .line 568
    invoke-direct {v4, v2, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    .line 569
    .line 570
    .line 571
    move v2, v1

    .line 572
    move-object v12, v4

    .line 573
    goto/16 :goto_10

    .line 574
    .line 575
    :catchall_15
    move-exception v0

    .line 576
    goto :goto_1a

    .line 577
    :cond_f
    :try_start_1a
    throw v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_15

    .line 578
    :goto_1a
    :try_start_1b
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 579
    :cond_10
    move-object v12, v3

    .line 580
    :try_start_1c
    new-instance v0, Lrj6;

    .line 581
    .line 582
    invoke-direct {v0, v4}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 583
    .line 584
    .line 585
    new-instance v1, Lsj6;

    .line 586
    .line 587
    invoke-direct {v1, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 591
    .line 592
    new-instance v3, Lqg5;

    .line 593
    .line 594
    invoke-direct {v3, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_d

    .line 595
    .line 596
    .line 597
    move-object/from16 v16, v12

    .line 598
    .line 599
    move-object v12, v3

    .line 600
    move-object/from16 v3, v16

    .line 601
    .line 602
    goto/16 :goto_10

    .line 603
    .line 604
    :goto_1b
    :try_start_1d
    iget-object v0, v12, Lqg5;->X:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v0, Lsj6;

    .line 607
    .line 608
    iget-object v0, v0, Lsj6;->X:Ljava/lang/Object;

    .line 609
    .line 610
    iget-object v2, v12, Lqg5;->Y:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v2, Ljava/lang/Boolean;

    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    if-eqz v4, :cond_11

    .line 623
    .line 624
    if-eqz v11, :cond_11

    .line 625
    .line 626
    invoke-interface {v11, v4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    :cond_11
    instance-of v4, v0, Lrj6;

    .line 630
    .line 631
    if-eqz v4, :cond_12

    .line 632
    .line 633
    const/4 v0, 0x0

    .line 634
    :cond_12
    check-cast v0, Ljava/lang/String;

    .line 635
    .line 636
    if-nez v0, :cond_13

    .line 637
    .line 638
    :goto_1c
    move v13, v15

    .line 639
    goto/16 :goto_28

    .line 640
    .line 641
    :cond_13
    invoke-static {v0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    if-nez v4, :cond_20

    .line 646
    .line 647
    new-instance v4, Lwr7;

    .line 648
    .line 649
    const/4 v11, 0x0

    .line 650
    invoke-direct {v4, v8, v0, v11, v15}, Lwr7;-><init>(Lsn2;Ljava/lang/String;Lq51;B)V

    .line 651
    .line 652
    .line 653
    iput-object v3, v9, Lvr7;->f0:Ljava/lang/String;

    .line 654
    .line 655
    iput-object v14, v9, Lvr7;->g0:Ldn2;

    .line 656
    .line 657
    iput-object v11, v9, Lvr7;->h0:Lgn2;

    .line 658
    .line 659
    iput-object v10, v9, Lvr7;->i0:Lgn2;

    .line 660
    .line 661
    iput-object v8, v9, Lvr7;->j0:Lsn2;

    .line 662
    .line 663
    iput-object v7, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 664
    .line 665
    iput-object v6, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 666
    .line 667
    iput-boolean v5, v9, Lvr7;->m0:Z

    .line 668
    .line 669
    iput v1, v9, Lvr7;->o0:I

    .line 670
    .line 671
    iput-boolean v2, v9, Lvr7;->n0:Z

    .line 672
    .line 673
    const/4 v11, 0x3

    .line 674
    iput v11, v9, Lvr7;->r0:I

    .line 675
    .line 676
    move-object/from16 p1, p0

    .line 677
    .line 678
    move-object/from16 p2, v0

    .line 679
    .line 680
    move-object/from16 p3, v3

    .line 681
    .line 682
    move-object/from16 p6, v4

    .line 683
    .line 684
    move-object/from16 p4, v6

    .line 685
    .line 686
    move-object/from16 p7, v9

    .line 687
    .line 688
    move-object/from16 p5, v10

    .line 689
    .line 690
    invoke-virtual/range {p1 .. p7}, Lxr7;->c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Lgn2;Lrn2;Ls51;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    .line 694
    move-object/from16 v11, p3

    .line 695
    .line 696
    move-object/from16 v6, p4

    .line 697
    .line 698
    move-object/from16 v10, p5

    .line 699
    .line 700
    move-object/from16 v9, p7

    .line 701
    .line 702
    if-ne v0, v13, :cond_14

    .line 703
    .line 704
    goto/16 :goto_25

    .line 705
    .line 706
    :cond_14
    move-object v12, v14

    .line 707
    move-object v14, v10

    .line 708
    move-object v10, v12

    .line 709
    move-object v12, v8

    .line 710
    move-object v8, v7

    .line 711
    move-object v7, v6

    .line 712
    move v6, v5

    .line 713
    move v5, v1

    .line 714
    move v1, v2

    .line 715
    :goto_1d
    :try_start_1e
    check-cast v0, Ljava/lang/Boolean;

    .line 716
    .line 717
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-eqz v0, :cond_15

    .line 722
    .line 723
    const/4 v13, 0x1

    .line 724
    goto/16 :goto_27

    .line 725
    .line 726
    :cond_15
    if-eqz v1, :cond_16

    .line 727
    .line 728
    :goto_1e
    move v13, v15

    .line 729
    goto/16 :goto_27

    .line 730
    .line 731
    :cond_16
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/SubscriptionItem;->D()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    if-nez v2, :cond_17

    .line 736
    .line 737
    goto :goto_1e

    .line 738
    :cond_17
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 739
    .line 740
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    new-instance v3, Lzx6;

    .line 749
    .line 750
    const/16 v4, 0xc

    .line 751
    .line 752
    invoke-direct {v3, v4}, Lzx6;-><init>(B)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0, v3}, Lkf4;->h(Lgn2;)V

    .line 756
    .line 757
    .line 758
    if-eqz v10, :cond_18

    .line 759
    .line 760
    invoke-interface {v10}, Ldn2;->invoke()Ljava/lang/Object;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    .line 761
    .line 762
    .line 763
    :cond_18
    :try_start_1f
    sget-object v0, Lzl7;->a:Lkc6;

    .line 764
    .line 765
    new-instance v0, Ljava/net/URI;

    .line 766
    .line 767
    invoke-direct {v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v0}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    invoke-static {v0}, Lzl7;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 778
    .line 779
    .line 780
    move-result-object v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_16

    .line 781
    move-object v3, v0

    .line 782
    goto :goto_1f

    .line 783
    :catchall_16
    move-exception v0

    .line 784
    :try_start_20
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 785
    .line 786
    if-nez v3, :cond_1b

    .line 787
    .line 788
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 789
    .line 790
    if-nez v3, :cond_1b

    .line 791
    .line 792
    new-instance v3, Lrj6;

    .line 793
    .line 794
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1a

    .line 795
    .line 796
    .line 797
    :goto_1f
    :try_start_21
    instance-of v0, v3, Lrj6;

    .line 798
    .line 799
    if-eqz v0, :cond_19

    .line 800
    .line 801
    const/4 v3, 0x0

    .line 802
    :cond_19
    check-cast v3, Lsu/happ/proxyutility/dto/MetaParams;

    .line 803
    .line 804
    iput-object v11, v9, Lvr7;->f0:Ljava/lang/String;

    .line 805
    .line 806
    const/4 v4, 0x0

    .line 807
    iput-object v4, v9, Lvr7;->g0:Ldn2;

    .line 808
    .line 809
    iput-object v4, v9, Lvr7;->h0:Lgn2;

    .line 810
    .line 811
    iput-object v14, v9, Lvr7;->i0:Lgn2;

    .line 812
    .line 813
    iput-object v12, v9, Lvr7;->j0:Lsn2;

    .line 814
    .line 815
    iput-object v4, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 816
    .line 817
    iput-object v7, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 818
    .line 819
    iput-boolean v6, v9, Lvr7;->m0:Z

    .line 820
    .line 821
    iput v5, v9, Lvr7;->o0:I

    .line 822
    .line 823
    iput-boolean v1, v9, Lvr7;->n0:Z

    .line 824
    .line 825
    const/4 v4, 0x4

    .line 826
    iput v4, v9, Lvr7;->r0:I
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_19

    .line 827
    .line 828
    move-object/from16 p1, p0

    .line 829
    .line 830
    move-object/from16 p2, v2

    .line 831
    .line 832
    move-object/from16 p6, v3

    .line 833
    .line 834
    move/from16 p5, v6

    .line 835
    .line 836
    move-object/from16 p4, v7

    .line 837
    .line 838
    move-object/from16 p7, v8

    .line 839
    .line 840
    move-object/from16 p8, v9

    .line 841
    .line 842
    move-object/from16 p3, v11

    .line 843
    .line 844
    :try_start_22
    invoke-virtual/range {p1 .. p8}, Lxr7;->a(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v0
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_18

    .line 848
    move-object/from16 v11, p3

    .line 849
    .line 850
    move-object/from16 v7, p4

    .line 851
    .line 852
    move/from16 v6, p5

    .line 853
    .line 854
    move-object/from16 v9, p8

    .line 855
    .line 856
    if-ne v0, v13, :cond_1a

    .line 857
    .line 858
    goto/16 :goto_25

    .line 859
    .line 860
    :cond_1a
    move-object v8, v12

    .line 861
    move-object v12, v11

    .line 862
    move-object v11, v14

    .line 863
    :goto_20
    :try_start_23
    check-cast v0, Ljava/lang/String;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_17

    .line 864
    .line 865
    move-object v3, v0

    .line 866
    move v2, v1

    .line 867
    move v1, v5

    .line 868
    goto :goto_24

    .line 869
    :catchall_17
    move-exception v0

    .line 870
    move v2, v1

    .line 871
    goto/16 :goto_2

    .line 872
    .line 873
    :catchall_18
    move-exception v0

    .line 874
    move-object/from16 v11, p3

    .line 875
    .line 876
    move-object/from16 v7, p4

    .line 877
    .line 878
    move/from16 v6, p5

    .line 879
    .line 880
    move-object/from16 v9, p8

    .line 881
    .line 882
    :goto_21
    move v2, v1

    .line 883
    move v1, v5

    .line 884
    move-object v8, v12

    .line 885
    move-object v12, v11

    .line 886
    move-object v11, v14

    .line 887
    goto :goto_23

    .line 888
    :catchall_19
    move-exception v0

    .line 889
    goto :goto_21

    .line 890
    :catchall_1a
    move-exception v0

    .line 891
    goto :goto_22

    .line 892
    :cond_1b
    :try_start_24
    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1a

    .line 893
    :goto_22
    :try_start_25
    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_19

    .line 894
    :goto_23
    :try_start_26
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 895
    .line 896
    if-nez v3, :cond_1f

    .line 897
    .line 898
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 899
    .line 900
    if-nez v3, :cond_1f

    .line 901
    .line 902
    new-instance v3, Lrj6;

    .line 903
    .line 904
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_1b

    .line 905
    .line 906
    .line 907
    :goto_24
    :try_start_27
    instance-of v0, v3, Lrj6;

    .line 908
    .line 909
    if-eqz v0, :cond_1c

    .line 910
    .line 911
    const/4 v3, 0x0

    .line 912
    :cond_1c
    check-cast v3, Ljava/lang/String;

    .line 913
    .line 914
    if-nez v3, :cond_1d

    .line 915
    .line 916
    goto/16 :goto_1c

    .line 917
    .line 918
    :cond_1d
    new-instance v0, Lwr7;

    .line 919
    .line 920
    const/4 v4, 0x1

    .line 921
    const/4 v5, 0x0

    .line 922
    invoke-direct {v0, v8, v3, v5, v4}, Lwr7;-><init>(Lsn2;Ljava/lang/String;Lq51;B)V

    .line 923
    .line 924
    .line 925
    iput-object v5, v9, Lvr7;->f0:Ljava/lang/String;

    .line 926
    .line 927
    iput-object v5, v9, Lvr7;->g0:Ldn2;

    .line 928
    .line 929
    iput-object v5, v9, Lvr7;->h0:Lgn2;

    .line 930
    .line 931
    iput-object v5, v9, Lvr7;->i0:Lgn2;

    .line 932
    .line 933
    iput-object v5, v9, Lvr7;->j0:Lsn2;

    .line 934
    .line 935
    iput-object v5, v9, Lvr7;->k0:Ljava/lang/Boolean;

    .line 936
    .line 937
    iput-object v5, v9, Lvr7;->l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 938
    .line 939
    iput-boolean v6, v9, Lvr7;->m0:Z

    .line 940
    .line 941
    iput v1, v9, Lvr7;->o0:I

    .line 942
    .line 943
    iput-boolean v2, v9, Lvr7;->n0:Z

    .line 944
    .line 945
    const/4 v2, 0x5

    .line 946
    iput v2, v9, Lvr7;->r0:I

    .line 947
    .line 948
    move-object/from16 p1, p0

    .line 949
    .line 950
    move-object/from16 p6, v0

    .line 951
    .line 952
    move-object/from16 p2, v3

    .line 953
    .line 954
    move-object/from16 p4, v7

    .line 955
    .line 956
    move-object/from16 p7, v9

    .line 957
    .line 958
    move-object/from16 p5, v11

    .line 959
    .line 960
    move-object/from16 p3, v12

    .line 961
    .line 962
    invoke-virtual/range {p1 .. p7}, Lxr7;->c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Lgn2;Lrn2;Ls51;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    if-ne v0, v13, :cond_1e

    .line 967
    .line 968
    :goto_25
    return-object v13

    .line 969
    :cond_1e
    :goto_26
    check-cast v0, Ljava/lang/Boolean;

    .line 970
    .line 971
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 972
    .line 973
    .line 974
    move-result v13

    .line 975
    move v5, v1

    .line 976
    :goto_27
    move v1, v5

    .line 977
    :goto_28
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 978
    .line 979
    .line 980
    move-result-object v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_0

    .line 981
    goto :goto_2c

    .line 982
    :catchall_1b
    move-exception v0

    .line 983
    goto :goto_29

    .line 984
    :cond_1f
    :try_start_28
    throw v0
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_1b

    .line 985
    :goto_29
    :try_start_29
    throw v0

    .line 986
    :cond_20
    new-instance v0, Lj02;

    .line 987
    .line 988
    const-string v2, "Empty response body"

    .line 989
    .line 990
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    throw v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_0

    .line 994
    :catchall_1c
    move-exception v0

    .line 995
    goto :goto_2a

    .line 996
    :cond_21
    :try_start_2a
    throw v0
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_1c

    .line 997
    :goto_2a
    :try_start_2b
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_d

    .line 998
    :catchall_1d
    move-exception v0

    .line 999
    goto/16 :goto_3

    .line 1000
    .line 1001
    :goto_2b
    if-eqz v1, :cond_22

    .line 1002
    .line 1003
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    const-string v2, "util.protection"

    .line 1008
    .line 1009
    invoke-static {v1, v2, v15}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v1

    .line 1013
    if-nez v1, :cond_22

    .line 1014
    .line 1015
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1016
    .line 1017
    .line 1018
    :cond_22
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 1019
    .line 1020
    if-nez v1, :cond_25

    .line 1021
    .line 1022
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 1023
    .line 1024
    if-nez v1, :cond_25

    .line 1025
    .line 1026
    new-instance v1, Lrj6;

    .line 1027
    .line 1028
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1029
    .line 1030
    .line 1031
    move-object v0, v1

    .line 1032
    :goto_2c
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    if-nez v1, :cond_24

    .line 1037
    .line 1038
    check-cast v0, Ljava/lang/Boolean;

    .line 1039
    .line 1040
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_23

    .line 1045
    .line 1046
    sget-object v0, Lzu7;->a:Lzu7;

    .line 1047
    .line 1048
    goto :goto_2d

    .line 1049
    :cond_23
    new-instance v0, Lxu7;

    .line 1050
    .line 1051
    const/4 v11, 0x0

    .line 1052
    invoke-direct {v0, v11}, Lxu7;-><init>(Ljava/lang/Throwable;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_2d

    .line 1056
    :cond_24
    new-instance v0, Lxu7;

    .line 1057
    .line 1058
    invoke-direct {v0, v1}, Lxu7;-><init>(Ljava/lang/Throwable;)V

    .line 1059
    .line 1060
    .line 1061
    :goto_2d
    return-object v0

    .line 1062
    :cond_25
    throw v0
.end method

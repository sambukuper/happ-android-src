.class public final Lht1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Loh7;

.field public final c:Lh76;

.field public final d:Lvz7;

.field public final e:Lvz7;

.field public final f:Lm51;

.field public final g:Lq15;


# direct methods
.method public constructor <init>()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lgt1;

    .line 7
    .line 8
    invoke-direct {v0}, Lyi8;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, v1, Lht1;->a:Ljava/util/List;

    .line 23
    .line 24
    sget-object v3, Ldm5;->f0:Ldm5;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iput-object v3, v1, Lht1;->b:Loh7;

    .line 34
    .line 35
    invoke-static {v3}, Ljm4;->n(Loh7;)Lh76;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, v1, Lht1;->c:Lh76;

    .line 40
    .line 41
    new-instance v3, Lw01;

    .line 42
    .line 43
    const/16 v4, 0x14

    .line 44
    .line 45
    invoke-direct {v3, v4}, Lw01;-><init>(B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, Lvz7;

    .line 49
    .line 50
    invoke-direct {v4, v3}, Lvz7;-><init>(Ldn2;)V

    .line 51
    .line 52
    .line 53
    iput-object v4, v1, Lht1;->d:Lvz7;

    .line 54
    .line 55
    new-instance v3, Lw01;

    .line 56
    .line 57
    const/16 v4, 0x15

    .line 58
    .line 59
    invoke-direct {v3, v4}, Lw01;-><init>(B)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Lvz7;

    .line 63
    .line 64
    invoke-direct {v4, v3}, Lvz7;-><init>(Ldn2;)V

    .line 65
    .line 66
    .line 67
    iput-object v4, v1, Lht1;->e:Lvz7;

    .line 68
    .line 69
    invoke-static {}, Lpw7;->b()Low7;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    sget-object v5, Ltp1;->a:Lnf1;

    .line 74
    .line 75
    sget-object v5, Ldm4;->a:Lhv2;

    .line 76
    .line 77
    invoke-static {v3, v5}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3}, Lgv3;->c(Ls61;)Lm51;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iput-object v3, v1, Lht1;->f:Lm51;

    .line 86
    .line 87
    invoke-static {}, Lr15;->a()Lq15;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iput-object v3, v1, Lht1;->g:Lq15;

    .line 92
    .line 93
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lcom/tencent/mmkv/MMKV;

    .line 98
    .line 99
    const-string v4, "listDataDownloadGeoFilesInStorage"

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_15

    .line 106
    .line 107
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 108
    .line 109
    .line 110
    :try_start_0
    sget-object v5, Lyw2;->b:Lcom/google/gson/a;

    .line 111
    .line 112
    invoke-virtual {v5, v3, v0}, Lcom/google/gson/a;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/util/List;

    .line 117
    .line 118
    if-eqz v0, :cond_1

    .line 119
    .line 120
    new-instance v3, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_2

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    move-object v6, v5

    .line 140
    check-cast v6, Lat1;

    .line 141
    .line 142
    iget-object v7, v1, Lht1;->d:Lvz7;

    .line 143
    .line 144
    invoke-virtual {v7}, Lvz7;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    check-cast v7, Lmn6;

    .line 149
    .line 150
    iget-object v8, v6, Lat1;->a:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v6, v6, Lat1;->b:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v7, v8, v6}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    if-eqz v6, :cond_0

    .line 159
    .line 160
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    goto/16 :goto_e

    .line 166
    .line 167
    :cond_1
    sget-object v3, Ld02;->X:Ld02;

    .line 168
    .line 169
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 170
    .line 171
    const/16 v5, 0xa

    .line 172
    .line 173
    invoke-static {v3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    const/4 v8, 0x1

    .line 189
    const/4 v10, 0x4

    .line 190
    const/4 v11, 0x3

    .line 191
    const/4 v12, 0x2

    .line 192
    const/4 v13, -0x1

    .line 193
    if-eqz v6, :cond_a

    .line 194
    .line 195
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    check-cast v6, Lat1;

    .line 200
    .line 201
    invoke-static {}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->a()Ll22;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    :cond_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    if-eqz v15, :cond_4

    .line 214
    .line 215
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    move-object/from16 v16, v15

    .line 220
    .line 221
    check-cast v16, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 222
    .line 223
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    iget-object v9, v6, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 228
    .line 229
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-static {v7, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_3

    .line 238
    .line 239
    move-object v7, v15

    .line 240
    goto :goto_2

    .line 241
    :cond_4
    const/4 v7, 0x0

    .line 242
    :goto_2
    check-cast v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 243
    .line 244
    if-nez v7, :cond_5

    .line 245
    .line 246
    move v7, v13

    .line 247
    goto :goto_3

    .line 248
    :cond_5
    sget-object v9, Lbt1;->a:[I

    .line 249
    .line 250
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    aget v7, v9, v7

    .line 255
    .line 256
    :goto_3
    if-eq v7, v13, :cond_9

    .line 257
    .line 258
    if-eq v7, v8, :cond_8

    .line 259
    .line 260
    if-eq v7, v12, :cond_8

    .line 261
    .line 262
    if-eq v7, v11, :cond_8

    .line 263
    .line 264
    if-eq v7, v10, :cond_7

    .line 265
    .line 266
    const/4 v8, 0x5

    .line 267
    if-ne v7, v8, :cond_6

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_6
    new-instance v0, Lb55;

    .line 271
    .line 272
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_7
    sget-object v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->LINK_NOT_CORRECT:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 277
    .line 278
    :goto_4
    move-object v12, v7

    .line 279
    goto :goto_6

    .line 280
    :cond_8
    sget-object v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_9
    :goto_5
    sget-object v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->SUCCESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :goto_6
    iget-object v9, v6, Lat1;->a:Ljava/lang/String;

    .line 287
    .line 288
    iget-object v10, v6, Lat1;->b:Ljava/lang/String;

    .line 289
    .line 290
    iget-object v11, v6, Lat1;->c:Lmr2;

    .line 291
    .line 292
    iget-object v13, v6, Lat1;->e:Lbm3;

    .line 293
    .line 294
    iget-object v14, v6, Lat1;->f:Ljava/util/List;

    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    new-instance v8, Lat1;

    .line 309
    .line 310
    invoke-direct/range {v8 .. v14}, Lat1;-><init>(Ljava/lang/String;Ljava/lang/String;Lmr2;Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;Lbm3;Ljava/util/List;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :cond_a
    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 319
    .line 320
    .line 321
    iget-object v0, v1, Lht1;->b:Loh7;

    .line 322
    .line 323
    :goto_7
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    move-object v5, v2

    .line 328
    check-cast v5, Lcm5;

    .line 329
    .line 330
    sget-object v5, Ldm5;->f0:Ldm5;

    .line 331
    .line 332
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    new-instance v6, Lem5;

    .line 336
    .line 337
    invoke-direct {v6, v5}, Lem5;-><init>(Ldm5;)V

    .line 338
    .line 339
    .line 340
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    if-eqz v7, :cond_12

    .line 349
    .line 350
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    check-cast v7, Lat1;

    .line 355
    .line 356
    new-instance v9, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 357
    .line 358
    iget-object v14, v7, Lat1;->a:Ljava/lang/String;

    .line 359
    .line 360
    iget-object v15, v7, Lat1;->b:Ljava/lang/String;

    .line 361
    .line 362
    iget-object v10, v7, Lat1;->c:Lmr2;

    .line 363
    .line 364
    invoke-direct {v9, v10, v14, v15}, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;-><init>(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-static {}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->a()Ll22;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v14

    .line 379
    if-eqz v14, :cond_c

    .line 380
    .line 381
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v14

    .line 385
    move-object v15, v14

    .line 386
    check-cast v15, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 387
    .line 388
    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v15

    .line 392
    iget-object v11, v7, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 393
    .line 394
    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    invoke-static {v15, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    if-eqz v11, :cond_b

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_b
    const/4 v11, 0x3

    .line 406
    goto :goto_9

    .line 407
    :cond_c
    const/4 v14, 0x0

    .line 408
    :goto_a
    check-cast v14, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 409
    .line 410
    if-nez v14, :cond_d

    .line 411
    .line 412
    move v7, v13

    .line 413
    goto :goto_b

    .line 414
    :cond_d
    sget-object v7, Lbt1;->a:[I

    .line 415
    .line 416
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    aget v7, v7, v10

    .line 421
    .line 422
    :goto_b
    if-eq v7, v13, :cond_11

    .line 423
    .line 424
    if-eq v7, v8, :cond_10

    .line 425
    .line 426
    if-eq v7, v12, :cond_10

    .line 427
    .line 428
    const/4 v10, 0x3

    .line 429
    if-eq v7, v10, :cond_10

    .line 430
    .line 431
    const/4 v11, 0x4

    .line 432
    if-eq v7, v11, :cond_f

    .line 433
    .line 434
    const/4 v14, 0x5

    .line 435
    if-ne v7, v14, :cond_e

    .line 436
    .line 437
    goto :goto_c

    .line 438
    :cond_e
    new-instance v0, Lb55;

    .line 439
    .line 440
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 441
    .line 442
    .line 443
    throw v0

    .line 444
    :cond_f
    const/4 v14, 0x5

    .line 445
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 446
    .line 447
    .line 448
    move-result-wide v10

    .line 449
    new-instance v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$LinkNotCorrect;

    .line 450
    .line 451
    invoke-direct {v7, v10, v11}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$LinkNotCorrect;-><init>(J)V

    .line 452
    .line 453
    .line 454
    goto :goto_d

    .line 455
    :cond_10
    const/4 v14, 0x5

    .line 456
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 457
    .line 458
    .line 459
    move-result-wide v10

    .line 460
    new-instance v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$Failure;

    .line 461
    .line 462
    invoke-direct {v7, v10, v11}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$Failure;-><init>(J)V

    .line 463
    .line 464
    .line 465
    goto :goto_d

    .line 466
    :cond_11
    const/4 v14, 0x5

    .line 467
    :goto_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 468
    .line 469
    .line 470
    move-result-wide v10

    .line 471
    new-instance v7, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;

    .line 472
    .line 473
    invoke-direct {v7, v10, v11}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;-><init>(J)V

    .line 474
    .line 475
    .line 476
    :goto_d
    invoke-virtual {v6, v9, v7}, Lem5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    const/4 v10, 0x4

    .line 480
    const/4 v11, 0x3

    .line 481
    goto/16 :goto_8

    .line 482
    .line 483
    :cond_12
    const/4 v14, 0x5

    .line 484
    invoke-virtual {v6}, Lem5;->f()Lcm5;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    invoke-virtual {v0, v2, v5}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-eqz v2, :cond_13

    .line 493
    .line 494
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_13
    const/4 v10, 0x4

    .line 498
    const/4 v11, 0x3

    .line 499
    goto/16 :goto_7

    .line 500
    .line 501
    :goto_e
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 502
    .line 503
    if-nez v2, :cond_14

    .line 504
    .line 505
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 506
    .line 507
    if-nez v2, :cond_14

    .line 508
    .line 509
    new-instance v2, Lrj6;

    .line 510
    .line 511
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 512
    .line 513
    .line 514
    move-object v0, v2

    .line 515
    :goto_f
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    if-eqz v0, :cond_15

    .line 520
    .line 521
    iget-object v0, v1, Lht1;->e:Lvz7;

    .line 522
    .line 523
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 528
    .line 529
    invoke-virtual {v0, v4}, Lcom/tencent/mmkv/MMKV;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 530
    .line 531
    .line 532
    goto :goto_10

    .line 533
    :cond_14
    throw v0

    .line 534
    :cond_15
    :goto_10
    return-void
.end method

.method public static c(Lmr2;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lmr2;->X:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "/"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final d(Lht1;Ljava/lang/String;Ljava/lang/String;Lmr2;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {p3, p1}, Lht1;->c(Lmr2;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/io/File;

    .line 11
    .line 12
    invoke-static {p3, p2}, Lht1;->c(Lmr2;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ls51;Lmr2;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;[Lfn6;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v9, v4, Lht1;->a:Ljava/util/List;

    .line 6
    .line 7
    instance-of v1, v0, Lct1;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lct1;

    .line 13
    .line 14
    iget v2, v1, Lct1;->n0:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    and-int v5, v2, v3

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    iput v2, v1, Lct1;->n0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, Lct1;

    .line 27
    .line 28
    invoke-direct {v1, v4, v0}, Lct1;-><init>(Lht1;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lct1;->l0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v1, Lct1;->n0:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v10, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Lct1;->k0:Lq15;

    .line 42
    .line 43
    iget-object v5, v1, Lct1;->j0:[Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v5, [Lfn6;

    .line 46
    .line 47
    iget-object v6, v1, Lct1;->i0:Lsu/happ/proxyutility/dto/RouteSettings;

    .line 48
    .line 49
    iget-object v7, v1, Lct1;->h0:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v8, v1, Lct1;->g0:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, v1, Lct1;->f0:Lmr2;

    .line 54
    .line 55
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v15, v1

    .line 59
    move-object v14, v7

    .line 60
    move-object v13, v8

    .line 61
    move-object v7, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v10

    .line 69
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v0, p2

    .line 73
    .line 74
    iput-object v0, v1, Lct1;->f0:Lmr2;

    .line 75
    .line 76
    move-object/from16 v2, p3

    .line 77
    .line 78
    iput-object v2, v1, Lct1;->g0:Ljava/lang/String;

    .line 79
    .line 80
    move-object/from16 v5, p4

    .line 81
    .line 82
    iput-object v5, v1, Lct1;->h0:Ljava/lang/String;

    .line 83
    .line 84
    move-object/from16 v6, p5

    .line 85
    .line 86
    iput-object v6, v1, Lct1;->i0:Lsu/happ/proxyutility/dto/RouteSettings;

    .line 87
    .line 88
    move-object/from16 v7, p6

    .line 89
    .line 90
    iput-object v7, v1, Lct1;->j0:[Ljava/lang/Object;

    .line 91
    .line 92
    iget-object v8, v4, Lht1;->g:Lq15;

    .line 93
    .line 94
    iput-object v8, v1, Lct1;->k0:Lq15;

    .line 95
    .line 96
    iput v3, v1, Lct1;->n0:I

    .line 97
    .line 98
    invoke-virtual {v8, v1}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v11, Lc71;->X:Lc71;

    .line 103
    .line 104
    if-ne v1, v11, :cond_3

    .line 105
    .line 106
    return-object v11

    .line 107
    :cond_3
    move-object v15, v0

    .line 108
    move-object v13, v2

    .line 109
    move-object v14, v5

    .line 110
    move-object v2, v8

    .line 111
    :goto_1
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    move-object v5, v1

    .line 129
    check-cast v5, Lat1;

    .line 130
    .line 131
    iget-object v8, v5, Lat1;->a:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v8, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_4

    .line 138
    .line 139
    iget-object v5, v5, Lat1;->c:Lmr2;

    .line 140
    .line 141
    if-ne v5, v15, :cond_4

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_5
    move-object v1, v10

    .line 148
    :goto_2
    check-cast v1, Lat1;

    .line 149
    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    iget-object v0, v1, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move-object v0, v10

    .line 156
    :goto_3
    if-nez v0, :cond_7

    .line 157
    .line 158
    const/4 v0, -0x1

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    sget-object v1, Lbt1;->a:[I

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    aget v0, v1, v0

    .line 167
    .line 168
    :goto_4
    const/4 v11, 0x2

    .line 169
    if-eq v0, v3, :cond_8

    .line 170
    .line 171
    if-eq v0, v11, :cond_8

    .line 172
    .line 173
    invoke-virtual {v4, v15, v13}, Lht1;->e(Lmr2;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    new-instance v12, Lat1;

    .line 177
    .line 178
    sget-object v16, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->START:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    new-instance v0, Ljava/util/ArrayList;

    .line 184
    .line 185
    new-instance v1, Ljt;

    .line 186
    .line 187
    const/4 v5, 0x0

    .line 188
    invoke-direct {v1, v7, v5}, Ljt;-><init>([Ljava/lang/Object;Z)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 192
    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    move-object/from16 v18, v0

    .line 197
    .line 198
    invoke-direct/range {v12 .. v18}, Lat1;-><init>(Ljava/lang/String;Ljava/lang/String;Lmr2;Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;Lbm3;Ljava/util/List;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_8
    move v5, v3

    .line 206
    :goto_5
    invoke-interface {v2, v10}, Lo15;->m(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    if-eqz v5, :cond_9

    .line 210
    .line 211
    return-object v10

    .line 212
    :cond_9
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_b

    .line 217
    .line 218
    if-ne v0, v3, :cond_a

    .line 219
    .line 220
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :goto_6
    move-object v1, v0

    .line 225
    goto :goto_7

    .line 226
    :cond_a
    invoke-static {}, Lb61;->c()V

    .line 227
    .line 228
    .line 229
    return-object v10

    .line 230
    :cond_b
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    goto :goto_6

    .line 235
    :goto_7
    sget-object v0, Ltp1;->a:Lnf1;

    .line 236
    .line 237
    sget-object v12, Ldm4;->a:Lhv2;

    .line 238
    .line 239
    new-instance v0, Lft1;

    .line 240
    .line 241
    const/4 v8, 0x0

    .line 242
    move-object v3, v6

    .line 243
    move-object v5, v13

    .line 244
    move-object v6, v14

    .line 245
    move-object v2, v15

    .line 246
    invoke-direct/range {v0 .. v8}, Lft1;-><init>(Ljava/lang/String;Lmr2;Lsu/happ/proxyutility/dto/RouteSettings;Lht1;Ljava/lang/String;Ljava/lang/String;[Lfn6;Lq51;)V

    .line 247
    .line 248
    .line 249
    iget-object v1, v4, Lht1;->f:Lm51;

    .line 250
    .line 251
    invoke-static {v1, v12, v0, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_d

    .line 264
    .line 265
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    move-object v3, v2

    .line 270
    check-cast v3, Lat1;

    .line 271
    .line 272
    iget-object v5, v3, Lat1;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v5, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eqz v5, :cond_c

    .line 279
    .line 280
    iget-object v3, v3, Lat1;->c:Lmr2;

    .line 281
    .line 282
    if-ne v3, v15, :cond_c

    .line 283
    .line 284
    move-object v10, v2

    .line 285
    :cond_d
    check-cast v10, Lat1;

    .line 286
    .line 287
    if-eqz v10, :cond_e

    .line 288
    .line 289
    iput-object v0, v10, Lat1;->e:Lbm3;

    .line 290
    .line 291
    :cond_e
    invoke-virtual {v4}, Lht1;->f()V

    .line 292
    .line 293
    .line 294
    return-object v0

    .line 295
    :goto_8
    invoke-interface {v2, v10}, Lo15;->m(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    throw v0
.end method

.method public final b(Lmr2;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lht1;->d:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lmn6;

    .line 8
    .line 9
    new-instance v2, Lzs1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p1, p4, v3}, Lzs1;-><init>(Ljava/lang/Object;ZB)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p2, p3, v2}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lht1;->a:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v4, v3

    .line 43
    check-cast v4, Lat1;

    .line 44
    .line 45
    iget-object v4, v4, Lat1;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v4, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    move-object v4, v3

    .line 72
    check-cast v4, Lat1;

    .line 73
    .line 74
    iget-object v4, v4, Lat1;->c:Lmr2;

    .line 75
    .line 76
    if-ne v4, p1, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/4 v3, 0x0

    .line 80
    :goto_1
    check-cast v3, Lat1;

    .line 81
    .line 82
    if-eqz v3, :cond_6

    .line 83
    .line 84
    if-eqz p4, :cond_4

    .line 85
    .line 86
    sget-object p1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->SUCCESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    sget-object p1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->FAILURE:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 90
    .line 91
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iput-object p1, v3, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 95
    .line 96
    iget-object p1, v3, Lat1;->f:Ljava/util/List;

    .line 97
    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lfn6;

    .line 115
    .line 116
    invoke-virtual {v1, p2, p4}, Lfn6;->a(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-virtual {p0}, Lht1;->f()V

    .line 121
    .line 122
    .line 123
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_7

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result p4

    .line 138
    if-eqz p4, :cond_9

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    check-cast p4, Lat1;

    .line 145
    .line 146
    iget-object p4, p4, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 147
    .line 148
    sget-object v1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->SUCCESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 149
    .line 150
    if-ne p4, v1, :cond_8

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    return-void

    .line 154
    :cond_9
    :goto_5
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Lmn6;

    .line 159
    .line 160
    new-instance p4, Ly0;

    .line 161
    .line 162
    const/16 v0, 0x18

    .line 163
    .line 164
    invoke-direct {p4, p0, v0}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p2, p3, p4}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public final e(Lmr2;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lht1;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move-object v4, v2

    .line 22
    check-cast v4, Lat1;

    .line 23
    .line 24
    iget-object v5, v4, Lat1;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v5, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    iget-object v4, v4, Lat1;->c:Lmr2;

    .line 33
    .line 34
    if-ne v4, p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v2, v3

    .line 38
    :goto_0
    check-cast v2, Lat1;

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object p1, v2, Lat1;->e:Lbm3;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, v3}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lht1;->f()V

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lht1;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "listDataDownloadGeoFilesInStorage"

    .line 11
    .line 12
    iget-object p0, p0, Lht1;->e:Lvz7;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 21
    .line 22
    sget-object v1, Lyw2;->b:Lcom/google/gson/a;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v2, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lcom/tencent/mmkv/MMKV;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    return-void
.end method

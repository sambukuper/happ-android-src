.class public final synthetic Lub;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lub;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lmo2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lub;->X:B

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    sget-object v8, Ldn8;->a:Ldn8;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Low2;

    .line 18
    .line 19
    invoke-virtual {v0}, Low2;->a()V

    .line 20
    .line 21
    .line 22
    return-object v8

    .line 23
    :pswitch_0
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lql6;

    .line 26
    .line 27
    iget-object v1, v0, Lql6;->a:Lm51;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {v1, v7}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lql6;->f()Lfi3;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Lql6;->d:Lby0;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, v0, Lby0;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lt11;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 46
    .line 47
    .line 48
    return-object v8

    .line 49
    :cond_0
    const-string v0, "connectionManager"

    .line 50
    .line 51
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v7

    .line 55
    :cond_1
    const-string v0, "coroutineScope"

    .line 56
    .line 57
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v7

    .line 61
    :pswitch_1
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Llb6;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Lxu3;->g()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v0}, Lmb6;->L(Lkb6;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    invoke-interface {v0}, Lkb6;->r()Lwd0;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Lwd0;->b()Ljava/lang/reflect/Member;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    instance-of v3, v2, Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move-object v2, v7

    .line 94
    :goto_0
    if-eqz v2, :cond_3

    .line 95
    .line 96
    invoke-static {v2}, Lzc1;->U(Ljava/lang/reflect/Constructor;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-ne v2, v5, :cond_3

    .line 101
    .line 102
    move v2, v5

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move v2, v6

    .line 105
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-interface {v0}, Lxu3;->h()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    add-int/2addr v0, v3

    .line 114
    add-int/2addr v0, v2

    .line 115
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    move v4, v6

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    move v4, v6

    .line 128
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_8

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, Lob6;

    .line 139
    .line 140
    invoke-virtual {v8}, Lob6;->x()Lfw3;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    sget-object v10, Lfw3;->f0:Lfw3;

    .line 145
    .line 146
    if-eq v9, v10, :cond_6

    .line 147
    .line 148
    invoke-virtual {v8}, Lob6;->x()Lfw3;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    sget-object v9, Lfw3;->Y:Lfw3;

    .line 153
    .line 154
    if-ne v8, v9, :cond_5

    .line 155
    .line 156
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 157
    .line 158
    if-ltz v4, :cond_7

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    invoke-static {}, Li21;->W()V

    .line 162
    .line 163
    .line 164
    throw v7

    .line 165
    :cond_8
    :goto_3
    add-int/2addr v4, v2

    .line 166
    add-int/lit8 v4, v4, 0x1f

    .line 167
    .line 168
    div-int/lit8 v4, v4, 0x20

    .line 169
    .line 170
    add-int v2, v0, v4

    .line 171
    .line 172
    add-int/2addr v2, v5

    .line 173
    new-array v2, v2, [Ljava/lang/Object;

    .line 174
    .line 175
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_e

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Lob6;

    .line 190
    .line 191
    invoke-virtual {v3}, Lob6;->F()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_c

    .line 196
    .line 197
    invoke-virtual {v3}, Lob6;->B()Lpw3;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {v5}, Lms8;->i(Lpw3;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-nez v5, :cond_c

    .line 206
    .line 207
    invoke-virtual {v3}, Lob6;->v()I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    invoke-virtual {v3}, Lob6;->B()Lpw3;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    instance-of v8, v3, Lu1;

    .line 219
    .line 220
    if-eqz v8, :cond_b

    .line 221
    .line 222
    move-object v8, v3

    .line 223
    check-cast v8, Lu1;

    .line 224
    .line 225
    iget-object v8, v8, Lu1;->X:Ltb6;

    .line 226
    .line 227
    if-eqz v8, :cond_a

    .line 228
    .line 229
    invoke-virtual {v8}, Ltb6;->invoke()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    check-cast v8, Ljava/lang/reflect/Type;

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_a
    move-object v8, v7

    .line 237
    :goto_5
    if-eqz v8, :cond_b

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_b
    invoke-static {v3, v6}, Lvj8;->v(Lpw3;Z)Ljava/lang/reflect/Type;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    :goto_6
    invoke-static {v8}, Lms8;->f(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    aput-object v3, v2, v5

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_c
    invoke-virtual {v3}, Lob6;->G()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_9

    .line 256
    .line 257
    invoke-virtual {v3}, Lob6;->v()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    invoke-virtual {v3}, Lob6;->B()Lpw3;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-static {v3}, Lci8;->v(Lpw3;)Lzu3;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-static {v3}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    if-eqz v8, :cond_d

    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-static {v3, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    aput-object v3, v2, v5

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_d
    new-instance v0, Lp14;

    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    new-instance v2, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v3, "Cannot instantiate the default empty array of type "

    .line 302
    .line 303
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    const-string v1, ", because it is not an array type"

    .line 310
    .line 311
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v0

    .line 322
    :cond_e
    move v1, v6

    .line 323
    :goto_7
    if-ge v1, v4, :cond_f

    .line 324
    .line 325
    add-int v3, v0, v1

    .line 326
    .line 327
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    aput-object v5, v2, v3

    .line 332
    .line 333
    add-int/lit8 v1, v1, 0x1

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_f
    return-object v2

    .line 337
    :pswitch_2
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Lcn7;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Lrl8;->a()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    new-instance v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 349
    .line 350
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-object v1

    .line 354
    :pswitch_3
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lwu2;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-static {}, Lrl8;->a()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    new-instance v1, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 366
    .line 367
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/sub/GuId;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-object v1

    .line 371
    :pswitch_4
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 374
    .line 375
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 376
    .line 377
    :cond_10
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    move-object v9, v0

    .line 382
    check-cast v9, Lxm4;

    .line 383
    .line 384
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    sget-object v26, Lrm4;->a:Lrm4;

    .line 388
    .line 389
    const/16 v27, 0x7fff

    .line 390
    .line 391
    const/4 v10, 0x0

    .line 392
    const-wide/16 v11, 0x0

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    const/4 v14, 0x0

    .line 396
    const/4 v15, 0x0

    .line 397
    const/16 v16, 0x0

    .line 398
    .line 399
    const/16 v17, 0x0

    .line 400
    .line 401
    const/16 v18, 0x0

    .line 402
    .line 403
    const/16 v19, 0x0

    .line 404
    .line 405
    const/16 v20, 0x0

    .line 406
    .line 407
    const/16 v21, 0x0

    .line 408
    .line 409
    const/16 v22, 0x0

    .line 410
    .line 411
    const/16 v23, 0x0

    .line 412
    .line 413
    const/16 v24, 0x0

    .line 414
    .line 415
    const/16 v25, 0x0

    .line 416
    .line 417
    invoke-static/range {v9 .. v27}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-virtual {v1, v0, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_10

    .line 426
    .line 427
    return-object v8

    .line 428
    :pswitch_5
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 431
    .line 432
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 433
    .line 434
    :cond_11
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    move-object v9, v0

    .line 439
    check-cast v9, Lxm4;

    .line 440
    .line 441
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    const/16 v26, 0x0

    .line 445
    .line 446
    const v27, 0xbfff

    .line 447
    .line 448
    .line 449
    const/4 v10, 0x0

    .line 450
    const-wide/16 v11, 0x0

    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    const/4 v14, 0x0

    .line 454
    const/4 v15, 0x0

    .line 455
    const/16 v16, 0x0

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/16 v18, 0x0

    .line 460
    .line 461
    const/16 v19, 0x0

    .line 462
    .line 463
    const/16 v20, 0x0

    .line 464
    .line 465
    const/16 v21, 0x0

    .line 466
    .line 467
    const/16 v22, 0x0

    .line 468
    .line 469
    const/16 v23, 0x0

    .line 470
    .line 471
    const/16 v24, 0x0

    .line 472
    .line 473
    const/16 v25, 0x0

    .line 474
    .line 475
    invoke-static/range {v9 .. v27}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    invoke-virtual {v1, v0, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-eqz v0, :cond_11

    .line 484
    .line 485
    return-object v8

    .line 486
    :pswitch_6
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 489
    .line 490
    iget-object v1, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 491
    .line 492
    :cond_12
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    move-object v9, v0

    .line 497
    check-cast v9, Lxm4;

    .line 498
    .line 499
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    const/16 v26, 0x0

    .line 503
    .line 504
    const v27, 0xdfff

    .line 505
    .line 506
    .line 507
    const/4 v10, 0x0

    .line 508
    const-wide/16 v11, 0x0

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const/4 v14, 0x0

    .line 512
    const/4 v15, 0x0

    .line 513
    const/16 v16, 0x0

    .line 514
    .line 515
    const/16 v17, 0x0

    .line 516
    .line 517
    const/16 v18, 0x0

    .line 518
    .line 519
    const/16 v19, 0x0

    .line 520
    .line 521
    const/16 v20, 0x0

    .line 522
    .line 523
    const/16 v21, 0x0

    .line 524
    .line 525
    const/16 v22, 0x0

    .line 526
    .line 527
    const/16 v23, 0x0

    .line 528
    .line 529
    const/16 v24, 0x0

    .line 530
    .line 531
    const/16 v25, 0x0

    .line 532
    .line 533
    invoke-static/range {v9 .. v27}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-virtual {v1, v0, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_12

    .line 542
    .line 543
    return-object v8

    .line 544
    :pswitch_7
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    new-instance v2, Lxn4;

    .line 556
    .line 557
    invoke-direct {v2, v0, v7, v3}, Lxn4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 558
    .line 559
    .line 560
    invoke-static {v1, v7, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 561
    .line 562
    .line 563
    return-object v8

    .line 564
    :pswitch_8
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 567
    .line 568
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->v()V

    .line 569
    .line 570
    .line 571
    return-object v8

    .line 572
    :pswitch_9
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, Low2;

    .line 575
    .line 576
    invoke-virtual {v0}, Low2;->a()V

    .line 577
    .line 578
    .line 579
    return-object v8

    .line 580
    :pswitch_a
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v0, Lev3;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    iget-object v1, v0, Lev3;->Y:Ljava/lang/Class;

    .line 588
    .line 589
    invoke-static {}, Li21;->r()Lgb4;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    sget-boolean v4, Lq08;->a:Z

    .line 594
    .line 595
    sget-object v8, Lss4;->X:Lss4;

    .line 596
    .line 597
    if-nez v4, :cond_34

    .line 598
    .line 599
    invoke-virtual {v0}, Lev3;->k0()Z

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    if-nez v4, :cond_34

    .line 604
    .line 605
    invoke-virtual {v0}, Lev3;->i0()Lyy3;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    if-eqz v4, :cond_13

    .line 610
    .line 611
    goto/16 :goto_1c

    .line 612
    .line 613
    :cond_13
    invoke-static {v0}, Lgv3;->w(Lev3;)Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v9

    .line 625
    if-eqz v9, :cond_2c

    .line 626
    .line 627
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v9

    .line 631
    move-object v10, v9

    .line 632
    check-cast v10, Lvk3;

    .line 633
    .line 634
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v10}, Lvk3;->getName()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v11

    .line 641
    invoke-static {v11}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 642
    .line 643
    .line 644
    move-result-object v11

    .line 645
    invoke-static {v11}, Lz91;->F(Lv15;)Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v11

    .line 649
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v12

    .line 653
    if-eqz v12, :cond_15

    .line 654
    .line 655
    :cond_14
    move-object/from16 v20, v1

    .line 656
    .line 657
    goto/16 :goto_17

    .line 658
    .line 659
    :cond_15
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object v11

    .line 663
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v12

    .line 667
    if-eqz v12, :cond_14

    .line 668
    .line 669
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v12

    .line 673
    check-cast v12, Lv15;

    .line 674
    .line 675
    invoke-virtual {v12}, Lv15;->b()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v12

    .line 679
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0}, Lev3;->c()Ljava/util/List;

    .line 683
    .line 684
    .line 685
    move-result-object v13

    .line 686
    new-instance v14, Ljava/util/ArrayList;

    .line 687
    .line 688
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 689
    .line 690
    .line 691
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 692
    .line 693
    .line 694
    move-result-object v13

    .line 695
    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 696
    .line 697
    .line 698
    move-result v15

    .line 699
    if-eqz v15, :cond_20

    .line 700
    .line 701
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v15

    .line 705
    check-cast v15, Lpw3;

    .line 706
    .line 707
    invoke-interface {v15}, Lpw3;->M()Llv3;

    .line 708
    .line 709
    .line 710
    move-result-object v15

    .line 711
    instance-of v7, v15, Lzu3;

    .line 712
    .line 713
    if-eqz v7, :cond_16

    .line 714
    .line 715
    check-cast v15, Lzu3;

    .line 716
    .line 717
    goto :goto_b

    .line 718
    :cond_16
    const/4 v15, 0x0

    .line 719
    :goto_b
    if-eqz v15, :cond_1d

    .line 720
    .line 721
    invoke-interface {v15}, Lzu3;->P()Ljava/util/Collection;

    .line 722
    .line 723
    .line 724
    move-result-object v7

    .line 725
    check-cast v7, Ljava/lang/Iterable;

    .line 726
    .line 727
    new-instance v15, Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 730
    .line 731
    .line 732
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 733
    .line 734
    .line 735
    move-result-object v7

    .line 736
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v17

    .line 740
    if-eqz v17, :cond_1b

    .line 741
    .line 742
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v6

    .line 746
    move-object v5, v6

    .line 747
    check-cast v5, Lxu3;

    .line 748
    .line 749
    instance-of v2, v5, Llw3;

    .line 750
    .line 751
    if-eqz v2, :cond_1a

    .line 752
    .line 753
    instance-of v2, v5, Lpb6;

    .line 754
    .line 755
    if-eqz v2, :cond_1a

    .line 756
    .line 757
    check-cast v5, Lkb6;

    .line 758
    .line 759
    invoke-static {v5}, Ly72;->f(Lkb6;)Z

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    if-nez v2, :cond_1a

    .line 764
    .line 765
    invoke-interface {v5}, Lkb6;->l()Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    if-eqz v2, :cond_18

    .line 770
    .line 771
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    if-eqz v5, :cond_18

    .line 776
    .line 777
    :cond_17
    move-object/from16 v20, v1

    .line 778
    .line 779
    goto :goto_e

    .line 780
    :cond_18
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    if-eqz v5, :cond_17

    .line 789
    .line 790
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    check-cast v5, Lob6;

    .line 795
    .line 796
    invoke-virtual {v5}, Lob6;->x()Lfw3;

    .line 797
    .line 798
    .line 799
    move-result-object v5

    .line 800
    move-object/from16 v20, v1

    .line 801
    .line 802
    sget-object v1, Lfw3;->Z:Lfw3;

    .line 803
    .line 804
    if-ne v5, v1, :cond_19

    .line 805
    .line 806
    goto :goto_f

    .line 807
    :cond_19
    move-object/from16 v1, v20

    .line 808
    .line 809
    goto :goto_d

    .line 810
    :goto_e
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    :goto_f
    move-object/from16 v1, v20

    .line 814
    .line 815
    const/4 v5, 0x1

    .line 816
    const/4 v6, 0x0

    .line 817
    goto :goto_c

    .line 818
    :cond_1a
    move-object/from16 v20, v1

    .line 819
    .line 820
    goto :goto_f

    .line 821
    :cond_1b
    move-object/from16 v20, v1

    .line 822
    .line 823
    new-instance v1, Ljava/util/ArrayList;

    .line 824
    .line 825
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    :cond_1c
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    if-eqz v5, :cond_1e

    .line 837
    .line 838
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v5

    .line 842
    move-object v6, v5

    .line 843
    check-cast v6, Llw3;

    .line 844
    .line 845
    invoke-interface {v6}, Lxu3;->getName()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    invoke-static {v6, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v6

    .line 853
    if-eqz v6, :cond_1c

    .line 854
    .line 855
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    goto :goto_10

    .line 859
    :cond_1d
    move-object/from16 v20, v1

    .line 860
    .line 861
    const/4 v1, 0x0

    .line 862
    :cond_1e
    if-nez v1, :cond_1f

    .line 863
    .line 864
    sget-object v1, Ld02;->X:Ld02;

    .line 865
    .line 866
    :cond_1f
    invoke-static {v14, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 867
    .line 868
    .line 869
    move-object/from16 v1, v20

    .line 870
    .line 871
    const/4 v5, 0x1

    .line 872
    const/4 v6, 0x0

    .line 873
    const/4 v7, 0x0

    .line 874
    goto/16 :goto_a

    .line 875
    .line 876
    :cond_20
    move-object/from16 v20, v1

    .line 877
    .line 878
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 879
    .line 880
    .line 881
    move-result v1

    .line 882
    if-eqz v1, :cond_21

    .line 883
    .line 884
    goto/16 :goto_16

    .line 885
    .line 886
    :cond_21
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    :cond_22
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    if-eqz v2, :cond_2b

    .line 895
    .line 896
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    check-cast v2, Llw3;

    .line 901
    .line 902
    new-instance v5, Ld3;

    .line 903
    .line 904
    const/16 v6, 0x8

    .line 905
    .line 906
    invoke-direct {v5, v10, v0, v6}, Ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 907
    .line 908
    .line 909
    instance-of v6, v2, Lcl3;

    .line 910
    .line 911
    if-eqz v6, :cond_23

    .line 912
    .line 913
    goto :goto_11

    .line 914
    :cond_23
    invoke-interface {v2}, Lxu3;->getName()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v6

    .line 918
    invoke-static {v6}, Ljs3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v6

    .line 922
    invoke-virtual {v5, v6}, Ld3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v6

    .line 926
    check-cast v6, Ljava/lang/Iterable;

    .line 927
    .line 928
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 929
    .line 930
    .line 931
    move-result-object v6

    .line 932
    :cond_24
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 933
    .line 934
    .line 935
    move-result v7

    .line 936
    if-eqz v7, :cond_25

    .line 937
    .line 938
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v7

    .line 942
    move-object v12, v7

    .line 943
    check-cast v12, Lnb6;

    .line 944
    .line 945
    invoke-static {v12}, Lnr4;->C(Lxu3;)Ljava/util/ArrayList;

    .line 946
    .line 947
    .line 948
    move-result-object v13

    .line 949
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 950
    .line 951
    .line 952
    move-result v13

    .line 953
    if-eqz v13, :cond_24

    .line 954
    .line 955
    invoke-interface {v12}, Lxu3;->j()Lpw3;

    .line 956
    .line 957
    .line 958
    move-result-object v12

    .line 959
    invoke-interface {v2}, Lxu3;->j()Lpw3;

    .line 960
    .line 961
    .line 962
    move-result-object v13

    .line 963
    invoke-static {v12, v13}, Lz68;->p0(Lpw3;Lpw3;)Z

    .line 964
    .line 965
    .line 966
    move-result v12

    .line 967
    if-eqz v12, :cond_24

    .line 968
    .line 969
    goto :goto_12

    .line 970
    :cond_25
    const/4 v7, 0x0

    .line 971
    :goto_12
    check-cast v7, Lnb6;

    .line 972
    .line 973
    invoke-interface {v2}, Lxu3;->getName()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    invoke-static {v6}, Ljs3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v6

    .line 981
    invoke-virtual {v5, v6}, Ld3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v5

    .line 985
    check-cast v5, Ljava/lang/Iterable;

    .line 986
    .line 987
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 988
    .line 989
    .line 990
    move-result-object v5

    .line 991
    :cond_26
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 992
    .line 993
    .line 994
    move-result v6

    .line 995
    if-eqz v6, :cond_27

    .line 996
    .line 997
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v6

    .line 1001
    move-object v12, v6

    .line 1002
    check-cast v12, Lnb6;

    .line 1003
    .line 1004
    invoke-static {v12}, Lnr4;->C(Lxu3;)Ljava/util/ArrayList;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v13

    .line 1008
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1009
    .line 1010
    .line 1011
    move-result v14

    .line 1012
    const/4 v15, 0x1

    .line 1013
    if-ne v14, v15, :cond_26

    .line 1014
    .line 1015
    invoke-interface {v12}, Lxu3;->j()Lpw3;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v12

    .line 1019
    sget-object v14, Lrg7;->e:Ls97;

    .line 1020
    .line 1021
    invoke-static {v12, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v12

    .line 1025
    if-eqz v12, :cond_26

    .line 1026
    .line 1027
    invoke-static {v13}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v12

    .line 1031
    check-cast v12, Lob6;

    .line 1032
    .line 1033
    invoke-virtual {v12}, Lob6;->B()Lpw3;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v12

    .line 1037
    invoke-interface {v2}, Lxu3;->j()Lpw3;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v13

    .line 1041
    invoke-static {v12, v13}, Lwl7;->l(Lpw3;Lpw3;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v12

    .line 1045
    if-eqz v12, :cond_26

    .line 1046
    .line 1047
    goto :goto_13

    .line 1048
    :cond_27
    const/4 v6, 0x0

    .line 1049
    :goto_13
    check-cast v6, Lnb6;

    .line 1050
    .line 1051
    if-nez v7, :cond_28

    .line 1052
    .line 1053
    goto/16 :goto_11

    .line 1054
    .line 1055
    :cond_28
    instance-of v2, v2, Lzv3;

    .line 1056
    .line 1057
    if-nez v2, :cond_29

    .line 1058
    .line 1059
    goto :goto_14

    .line 1060
    :cond_29
    if-eqz v6, :cond_22

    .line 1061
    .line 1062
    invoke-interface {v6}, Lkb6;->m()Lex4;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v5

    .line 1066
    invoke-interface {v7}, Lkb6;->m()Lex4;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v6

    .line 1070
    if-ne v5, v6, :cond_22

    .line 1071
    .line 1072
    :goto_14
    if-nez v2, :cond_2a

    .line 1073
    .line 1074
    invoke-virtual {v10}, Lvk3;->getName()Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    sget-object v5, Ljs3;->a:Lfk2;

    .line 1079
    .line 1080
    const-string v5, "set"

    .line 1081
    .line 1082
    const/4 v6, 0x0

    .line 1083
    invoke-static {v2, v6, v5}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v2

    .line 1087
    if-nez v2, :cond_22

    .line 1088
    .line 1089
    :cond_2a
    :goto_15
    move-object/from16 v1, v20

    .line 1090
    .line 1091
    const/4 v5, 0x1

    .line 1092
    const/4 v6, 0x0

    .line 1093
    const/4 v7, 0x0

    .line 1094
    goto/16 :goto_8

    .line 1095
    .line 1096
    :cond_2b
    :goto_16
    move-object/from16 v1, v20

    .line 1097
    .line 1098
    const/4 v5, 0x1

    .line 1099
    const/4 v6, 0x0

    .line 1100
    const/4 v7, 0x0

    .line 1101
    goto/16 :goto_9

    .line 1102
    .line 1103
    :goto_17
    invoke-virtual {v3, v9}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    goto :goto_15

    .line 1107
    :cond_2c
    move-object/from16 v20, v1

    .line 1108
    .line 1109
    invoke-virtual {v0}, Lev3;->h0()Lsx4;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    invoke-virtual {v1}, Lsx4;->X()Laa7;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v1

    .line 1117
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    invoke-static {v0, v1, v8}, Lgv3;->x(Lev3;Let4;Lss4;)Ljava/util/List;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    :cond_2d
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v2

    .line 1133
    if-eqz v2, :cond_2e

    .line 1134
    .line 1135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    move-object v4, v2

    .line 1140
    check-cast v4, Lej1;

    .line 1141
    .line 1142
    instance-of v4, v4, Lnw3;

    .line 1143
    .line 1144
    if-eqz v4, :cond_2d

    .line 1145
    .line 1146
    invoke-virtual {v3, v2}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    goto :goto_18

    .line 1150
    :cond_2e
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v1

    .line 1154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    array-length v2, v1

    .line 1158
    const/4 v4, 0x0

    .line 1159
    :goto_19
    if-ge v4, v2, :cond_30

    .line 1160
    .line 1161
    aget-object v5, v1, v4

    .line 1162
    .line 1163
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1164
    .line 1165
    .line 1166
    move-result v6

    .line 1167
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v6

    .line 1171
    if-eqz v6, :cond_2f

    .line 1172
    .line 1173
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v6

    .line 1177
    if-nez v6, :cond_2f

    .line 1178
    .line 1179
    new-instance v6, Lvk3;

    .line 1180
    .line 1181
    sget-object v7, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 1182
    .line 1183
    sget-object v8, Lyu3;->k:Lyu3;

    .line 1184
    .line 1185
    invoke-direct {v6, v0, v5, v7, v8}, Lvk3;-><init>(Lov3;Ljava/lang/reflect/Method;Ljava/lang/Object;Lyu3;)V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v3, v6}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1189
    .line 1190
    .line 1191
    :cond_2f
    add-int/lit8 v4, v4, 0x1

    .line 1192
    .line 1193
    goto :goto_19

    .line 1194
    :cond_30
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v1

    .line 1198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    array-length v2, v1

    .line 1202
    const/4 v6, 0x0

    .line 1203
    :goto_1a
    if-ge v6, v2, :cond_33

    .line 1204
    .line 1205
    aget-object v4, v1, v6

    .line 1206
    .line 1207
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 1208
    .line 1209
    .line 1210
    move-result v5

    .line 1211
    if-nez v5, :cond_32

    .line 1212
    .line 1213
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1214
    .line 1215
    .line 1216
    move-result v5

    .line 1217
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v5

    .line 1221
    if-eqz v5, :cond_32

    .line 1222
    .line 1223
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v5

    .line 1227
    if-nez v5, :cond_32

    .line 1228
    .line 1229
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1230
    .line 1231
    .line 1232
    move-result v5

    .line 1233
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v5

    .line 1237
    if-eqz v5, :cond_31

    .line 1238
    .line 1239
    new-instance v5, Lcl3;

    .line 1240
    .line 1241
    sget-object v7, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 1242
    .line 1243
    sget-object v8, Lyu3;->k:Lyu3;

    .line 1244
    .line 1245
    invoke-direct {v5, v0, v4, v7, v8}, Lcl3;-><init>(Lov3;Ljava/lang/reflect/Field;Ljava/lang/Object;Lyu3;)V

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v3, v5}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    goto :goto_1b

    .line 1252
    :cond_31
    new-instance v5, Lsk3;

    .line 1253
    .line 1254
    sget-object v7, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 1255
    .line 1256
    sget-object v8, Lyu3;->k:Lyu3;

    .line 1257
    .line 1258
    invoke-direct {v5, v0, v4, v7, v8}, Lsk3;-><init>(Lov3;Ljava/lang/reflect/Field;Ljava/lang/Object;Lyu3;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v3, v5}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    :cond_32
    :goto_1b
    add-int/lit8 v6, v6, 0x1

    .line 1265
    .line 1266
    goto :goto_1a

    .line 1267
    :cond_33
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->isEnum()Z

    .line 1268
    .line 1269
    .line 1270
    move-result v1

    .line 1271
    if-eqz v1, :cond_35

    .line 1272
    .line 1273
    new-instance v1, Ljk3;

    .line 1274
    .line 1275
    invoke-direct {v1, v0}, Ljk3;-><init>(Lev3;)V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v3, v1}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1279
    .line 1280
    .line 1281
    goto :goto_1d

    .line 1282
    :cond_34
    :goto_1c
    invoke-virtual {v0}, Lev3;->h0()Lsx4;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    invoke-virtual {v1}, Lsx4;->X()Laa7;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v1

    .line 1290
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    invoke-static {v0, v1, v8}, Lgv3;->x(Lev3;Let4;Lss4;)Ljava/util/List;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    invoke-virtual {v3, v1}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v0}, Lev3;->h0()Lsx4;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v1

    .line 1305
    invoke-virtual {v1}, Lsx4;->o0()Let4;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1310
    .line 1311
    .line 1312
    invoke-static {v0, v1, v8}, Lgv3;->x(Lev3;Let4;Lss4;)Ljava/util/List;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    invoke-virtual {v3, v0}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 1317
    .line 1318
    .line 1319
    :cond_35
    :goto_1d
    invoke-static {v3}, Li21;->j(Lgb4;)Lgb4;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    return-object v0

    .line 1324
    :pswitch_b
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1325
    .line 1326
    check-cast v0, Lev3;

    .line 1327
    .line 1328
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    iget-object v1, v0, Lev3;->Z:Lg44;

    .line 1332
    .line 1333
    sget-boolean v2, Lq08;->b:Z

    .line 1334
    .line 1335
    if-eqz v2, :cond_3f

    .line 1336
    .line 1337
    sget-boolean v2, Lq08;->a:Z

    .line 1338
    .line 1339
    if-nez v2, :cond_3f

    .line 1340
    .line 1341
    invoke-virtual {v0}, Lev3;->k0()Z

    .line 1342
    .line 1343
    .line 1344
    move-result v2

    .line 1345
    if-eqz v2, :cond_36

    .line 1346
    .line 1347
    goto/16 :goto_22

    .line 1348
    .line 1349
    :cond_36
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v2

    .line 1353
    check-cast v2, Lcv3;

    .line 1354
    .line 1355
    iget-object v2, v2, Lcv3;->p:Ltb6;

    .line 1356
    .line 1357
    sget-object v3, Lcv3;->r:[Lnw3;

    .line 1358
    .line 1359
    const/16 v5, 0xc

    .line 1360
    .line 1361
    aget-object v3, v3, v5

    .line 1362
    .line 1363
    invoke-virtual {v2}, Ltb6;->invoke()Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    check-cast v2, Ljava/util/Map;

    .line 1371
    .line 1372
    invoke-static {v0}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v3

    .line 1376
    sget-object v5, Ly72;->a:Ltx0;

    .line 1377
    .line 1378
    const-class v5, Lkotlin/Metadata;

    .line 1379
    .line 1380
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v3

    .line 1384
    if-eqz v3, :cond_37

    .line 1385
    .line 1386
    const/4 v6, 0x1

    .line 1387
    goto :goto_1e

    .line 1388
    :cond_37
    const/4 v6, 0x0

    .line 1389
    :goto_1e
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 1390
    .line 1391
    .line 1392
    move-result v3

    .line 1393
    new-instance v5, Ljava/util/HashMap;

    .line 1394
    .line 1395
    if-ge v3, v4, :cond_38

    .line 1396
    .line 1397
    goto :goto_1f

    .line 1398
    :cond_38
    div-int/lit8 v4, v3, 0x3

    .line 1399
    .line 1400
    add-int/2addr v4, v3

    .line 1401
    const/16 v18, 0x1

    .line 1402
    .line 1403
    add-int/lit8 v4, v4, 0x1

    .line 1404
    .line 1405
    :goto_1f
    invoke-direct {v5, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 1406
    .line 1407
    .line 1408
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v2

    .line 1412
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v2

    .line 1416
    :cond_39
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1417
    .line 1418
    .line 1419
    move-result v3

    .line 1420
    if-eqz v3, :cond_3c

    .line 1421
    .line 1422
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v3

    .line 1426
    check-cast v3, Ljava/util/Map$Entry;

    .line 1427
    .line 1428
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v4

    .line 1432
    check-cast v4, Lkb6;

    .line 1433
    .line 1434
    if-eqz v6, :cond_3a

    .line 1435
    .line 1436
    invoke-static {v4}, Ly72;->f(Lkb6;)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v7

    .line 1440
    if-eqz v7, :cond_3a

    .line 1441
    .line 1442
    move-object v7, v4

    .line 1443
    check-cast v7, Llb6;

    .line 1444
    .line 1445
    iget-object v7, v7, Llb6;->X:Lyu3;

    .line 1446
    .line 1447
    invoke-virtual {v7}, Lyu3;->c()Z

    .line 1448
    .line 1449
    .line 1450
    move-result v7

    .line 1451
    if-nez v7, :cond_39

    .line 1452
    .line 1453
    :cond_3a
    invoke-interface {v4}, Lkb6;->R()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v7

    .line 1457
    if-eqz v7, :cond_3b

    .line 1458
    .line 1459
    invoke-static {v4}, Ly72;->d(Lkb6;)Lov3;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v4

    .line 1463
    invoke-interface {v4}, Lfs0;->t()Ljava/lang/Class;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v4

    .line 1467
    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v4

    .line 1471
    invoke-static {v0}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v7

    .line 1475
    invoke-virtual {v7}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v7

    .line 1479
    invoke-static {v4, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v4

    .line 1483
    if-nez v4, :cond_3b

    .line 1484
    .line 1485
    goto :goto_20

    .line 1486
    :cond_3b
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v4

    .line 1490
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v3

    .line 1494
    invoke-virtual {v5, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    goto :goto_20

    .line 1498
    :cond_3c
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v2

    .line 1502
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1503
    .line 1504
    .line 1505
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    check-cast v1, Lcv3;

    .line 1510
    .line 1511
    invoke-virtual {v1}, Lcv3;->a()Ljava/util/Collection;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    check-cast v1, Ljava/lang/Iterable;

    .line 1516
    .line 1517
    new-instance v3, Ljava/util/ArrayList;

    .line 1518
    .line 1519
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1520
    .line 1521
    .line 1522
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v1

    .line 1526
    :cond_3d
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1527
    .line 1528
    .line 1529
    move-result v4

    .line 1530
    if-eqz v4, :cond_3e

    .line 1531
    .line 1532
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v4

    .line 1536
    move-object v5, v4

    .line 1537
    check-cast v5, Lkb6;

    .line 1538
    .line 1539
    invoke-static {v0, v5}, Ly72;->e(Lev3;Lkb6;)Z

    .line 1540
    .line 1541
    .line 1542
    move-result v5

    .line 1543
    if-eqz v5, :cond_3d

    .line 1544
    .line 1545
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    goto :goto_21

    .line 1549
    :cond_3e
    invoke-static {v2, v3}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    goto :goto_23

    .line 1554
    :cond_3f
    :goto_22
    invoke-static {}, Li21;->r()Lgb4;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v2

    .line 1558
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v1

    .line 1562
    check-cast v1, Lcv3;

    .line 1563
    .line 1564
    invoke-virtual {v1}, Lcv3;->a()Ljava/util/Collection;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v1

    .line 1568
    invoke-virtual {v2, v1}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 1569
    .line 1570
    .line 1571
    invoke-virtual {v0}, Lev3;->h0()Lsx4;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v1

    .line 1575
    invoke-virtual {v1}, Lsx4;->X()Laa7;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v1

    .line 1579
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v1

    .line 1583
    sget-object v3, Lss4;->Y:Lss4;

    .line 1584
    .line 1585
    invoke-static {v0, v1, v3}, Lgv3;->x(Lev3;Let4;Lss4;)Ljava/util/List;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v1

    .line 1589
    invoke-virtual {v2, v1}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v0}, Lev3;->h0()Lsx4;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v1

    .line 1596
    invoke-virtual {v1}, Lsx4;->o0()Let4;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v1

    .line 1600
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    invoke-static {v0, v1, v3}, Lgv3;->x(Lev3;Let4;Lss4;)Ljava/util/List;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    invoke-virtual {v2, v0}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 1608
    .line 1609
    .line 1610
    invoke-static {v2}, Li21;->j(Lgb4;)Lgb4;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    :goto_23
    return-object v0

    .line 1615
    :pswitch_c
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1616
    .line 1617
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1618
    .line 1619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1620
    .line 1621
    .line 1622
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1623
    .line 1624
    .line 1625
    move-result v1

    .line 1626
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v1

    .line 1630
    if-eqz v1, :cond_41

    .line 1631
    .line 1632
    :cond_40
    :goto_24
    const/4 v5, 0x0

    .line 1633
    goto/16 :goto_27

    .line 1634
    .line 1635
    :cond_41
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v1

    .line 1639
    invoke-static {v1}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v1

    .line 1643
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v2

    .line 1647
    array-length v2, v2

    .line 1648
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->isVarArgs()Z

    .line 1649
    .line 1650
    .line 1651
    move-result v5

    .line 1652
    sget-object v6, Lid5;->i:Lv15;

    .line 1653
    .line 1654
    invoke-virtual {v1, v6}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v6

    .line 1658
    if-eqz v6, :cond_42

    .line 1659
    .line 1660
    const/4 v15, 0x1

    .line 1661
    if-lt v2, v15, :cond_40

    .line 1662
    .line 1663
    :goto_25
    const/4 v5, 0x1

    .line 1664
    goto/16 :goto_27

    .line 1665
    .line 1666
    :cond_42
    sget-object v6, Lid5;->j:Lv15;

    .line 1667
    .line 1668
    invoke-virtual {v1, v6}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1669
    .line 1670
    .line 1671
    move-result v6

    .line 1672
    if-eqz v6, :cond_43

    .line 1673
    .line 1674
    if-lt v2, v3, :cond_40

    .line 1675
    .line 1676
    if-nez v5, :cond_40

    .line 1677
    .line 1678
    goto :goto_25

    .line 1679
    :cond_43
    sget-object v6, Lid5;->a:Lv15;

    .line 1680
    .line 1681
    invoke-virtual {v1, v6}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    move-result v6

    .line 1685
    const-class v7, Lnw3;

    .line 1686
    .line 1687
    if-eqz v6, :cond_44

    .line 1688
    .line 1689
    if-nez v5, :cond_40

    .line 1690
    .line 1691
    if-ne v2, v3, :cond_40

    .line 1692
    .line 1693
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v0

    .line 1697
    const/16 v18, 0x1

    .line 1698
    .line 1699
    aget-object v0, v0, v18

    .line 1700
    .line 1701
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1702
    .line 1703
    .line 1704
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v0

    .line 1708
    if-eqz v0, :cond_40

    .line 1709
    .line 1710
    goto :goto_25

    .line 1711
    :cond_44
    sget-object v6, Lid5;->b:Lv15;

    .line 1712
    .line 1713
    invoke-virtual {v1, v6}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1714
    .line 1715
    .line 1716
    move-result v6

    .line 1717
    if-eqz v6, :cond_45

    .line 1718
    .line 1719
    if-nez v5, :cond_40

    .line 1720
    .line 1721
    if-ne v2, v4, :cond_40

    .line 1722
    .line 1723
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v0

    .line 1727
    const/16 v18, 0x1

    .line 1728
    .line 1729
    aget-object v0, v0, v18

    .line 1730
    .line 1731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1735
    .line 1736
    .line 1737
    move-result v0

    .line 1738
    if-eqz v0, :cond_40

    .line 1739
    .line 1740
    goto :goto_25

    .line 1741
    :cond_45
    sget-object v4, Lid5;->c:Lv15;

    .line 1742
    .line 1743
    invoke-virtual {v1, v4}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1744
    .line 1745
    .line 1746
    move-result v4

    .line 1747
    if-eqz v4, :cond_46

    .line 1748
    .line 1749
    if-nez v5, :cond_40

    .line 1750
    .line 1751
    if-ne v2, v3, :cond_40

    .line 1752
    .line 1753
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v0

    .line 1757
    const/16 v18, 0x1

    .line 1758
    .line 1759
    aget-object v0, v0, v18

    .line 1760
    .line 1761
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1765
    .line 1766
    .line 1767
    move-result v0

    .line 1768
    if-eqz v0, :cond_40

    .line 1769
    .line 1770
    goto :goto_25

    .line 1771
    :cond_46
    sget-object v3, Lid5;->g:Lv15;

    .line 1772
    .line 1773
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    move-result v3

    .line 1777
    if-eqz v3, :cond_47

    .line 1778
    .line 1779
    goto :goto_25

    .line 1780
    :cond_47
    sget-object v3, Lid5;->f:Lv15;

    .line 1781
    .line 1782
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v3

    .line 1786
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1787
    .line 1788
    if-eqz v3, :cond_48

    .line 1789
    .line 1790
    const/4 v15, 0x1

    .line 1791
    if-ne v2, v15, :cond_40

    .line 1792
    .line 1793
    if-nez v5, :cond_40

    .line 1794
    .line 1795
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    invoke-static {v0, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1800
    .line 1801
    .line 1802
    move-result v0

    .line 1803
    if-eqz v0, :cond_40

    .line 1804
    .line 1805
    goto/16 :goto_25

    .line 1806
    .line 1807
    :cond_48
    sget-object v3, Lid5;->h:Lv15;

    .line 1808
    .line 1809
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v3

    .line 1813
    if-eqz v3, :cond_49

    .line 1814
    .line 1815
    if-nez v2, :cond_40

    .line 1816
    .line 1817
    goto/16 :goto_25

    .line 1818
    .line 1819
    :cond_49
    sget-object v3, Lid5;->k:Lv15;

    .line 1820
    .line 1821
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1822
    .line 1823
    .line 1824
    move-result v3

    .line 1825
    if-eqz v3, :cond_4a

    .line 1826
    .line 1827
    if-nez v2, :cond_40

    .line 1828
    .line 1829
    goto/16 :goto_25

    .line 1830
    .line 1831
    :cond_4a
    sget-object v3, Lid5;->l:Lv15;

    .line 1832
    .line 1833
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v3

    .line 1837
    if-eqz v3, :cond_4b

    .line 1838
    .line 1839
    if-nez v2, :cond_40

    .line 1840
    .line 1841
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v0

    .line 1845
    invoke-static {v0, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1846
    .line 1847
    .line 1848
    move-result v0

    .line 1849
    if-eqz v0, :cond_40

    .line 1850
    .line 1851
    goto/16 :goto_25

    .line 1852
    .line 1853
    :cond_4b
    sget-object v3, Lid5;->d:Lv15;

    .line 1854
    .line 1855
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v3

    .line 1859
    if-eqz v3, :cond_4c

    .line 1860
    .line 1861
    const/4 v15, 0x1

    .line 1862
    if-ne v2, v15, :cond_40

    .line 1863
    .line 1864
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v0

    .line 1868
    const/16 v17, 0x0

    .line 1869
    .line 1870
    aget-object v0, v0, v17

    .line 1871
    .line 1872
    const-class v1, Ljava/lang/Object;

    .line 1873
    .line 1874
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1875
    .line 1876
    .line 1877
    move-result v0

    .line 1878
    if-eqz v0, :cond_40

    .line 1879
    .line 1880
    goto/16 :goto_25

    .line 1881
    .line 1882
    :cond_4c
    sget-object v3, Lid5;->e:Lv15;

    .line 1883
    .line 1884
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v3

    .line 1888
    if-eqz v3, :cond_4d

    .line 1889
    .line 1890
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v0

    .line 1894
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1895
    .line 1896
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1897
    .line 1898
    .line 1899
    move-result v0

    .line 1900
    if-eqz v0, :cond_40

    .line 1901
    .line 1902
    const/4 v15, 0x1

    .line 1903
    if-ne v2, v15, :cond_40

    .line 1904
    .line 1905
    if-nez v5, :cond_40

    .line 1906
    .line 1907
    move v5, v15

    .line 1908
    goto :goto_27

    .line 1909
    :cond_4d
    const/4 v15, 0x1

    .line 1910
    sget-object v3, Lid5;->y:Ljava/util/Set;

    .line 1911
    .line 1912
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v3

    .line 1916
    if-eqz v3, :cond_4e

    .line 1917
    .line 1918
    if-ne v2, v15, :cond_40

    .line 1919
    .line 1920
    if-nez v5, :cond_40

    .line 1921
    .line 1922
    goto/16 :goto_25

    .line 1923
    .line 1924
    :cond_4e
    sget-object v3, Lid5;->x:Ljava/util/Set;

    .line 1925
    .line 1926
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1927
    .line 1928
    .line 1929
    move-result v3

    .line 1930
    if-eqz v3, :cond_4f

    .line 1931
    .line 1932
    if-nez v2, :cond_40

    .line 1933
    .line 1934
    goto/16 :goto_25

    .line 1935
    .line 1936
    :cond_4f
    sget-object v3, Lid5;->n:Lv15;

    .line 1937
    .line 1938
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1939
    .line 1940
    .line 1941
    move-result v3

    .line 1942
    if-nez v3, :cond_53

    .line 1943
    .line 1944
    sget-object v3, Lid5;->o:Lv15;

    .line 1945
    .line 1946
    invoke-virtual {v1, v3}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 1947
    .line 1948
    .line 1949
    move-result v3

    .line 1950
    if-eqz v3, :cond_50

    .line 1951
    .line 1952
    goto :goto_26

    .line 1953
    :cond_50
    sget-object v3, Lid5;->z:Ljava/util/Set;

    .line 1954
    .line 1955
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1956
    .line 1957
    .line 1958
    move-result v3

    .line 1959
    if-eqz v3, :cond_51

    .line 1960
    .line 1961
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v0

    .line 1965
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 1966
    .line 1967
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1968
    .line 1969
    .line 1970
    move-result v0

    .line 1971
    if-eqz v0, :cond_40

    .line 1972
    .line 1973
    const/4 v15, 0x1

    .line 1974
    if-ne v2, v15, :cond_40

    .line 1975
    .line 1976
    if-nez v5, :cond_40

    .line 1977
    .line 1978
    goto/16 :goto_25

    .line 1979
    .line 1980
    :cond_51
    invoke-virtual {v1}, Lv15;->b()Ljava/lang/String;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v0

    .line 1984
    if-nez v0, :cond_52

    .line 1985
    .line 1986
    goto/16 :goto_24

    .line 1987
    .line 1988
    :cond_52
    sget-object v1, Lid5;->m:Lkc6;

    .line 1989
    .line 1990
    invoke-virtual {v1, v0}, Lkc6;->d(Ljava/lang/CharSequence;)Z

    .line 1991
    .line 1992
    .line 1993
    move-result v5

    .line 1994
    goto :goto_27

    .line 1995
    :cond_53
    :goto_26
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v1

    .line 1999
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v0

    .line 2003
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2004
    .line 2005
    .line 2006
    move-result v5

    .line 2007
    :goto_27
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v0

    .line 2011
    return-object v0

    .line 2012
    :pswitch_d
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2013
    .line 2014
    move-object v1, v0

    .line 2015
    check-cast v1, Ly68;

    .line 2016
    .line 2017
    iget-object v0, v1, Ly68;->c:Lrh5;

    .line 2018
    .line 2019
    iget-object v2, v1, Ly68;->c:Lrh5;

    .line 2020
    .line 2021
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v3

    .line 2025
    if-eqz v3, :cond_54

    .line 2026
    .line 2027
    invoke-virtual {v3}, Ldd7;->e()Lgn2;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v7

    .line 2031
    goto :goto_28

    .line 2032
    :cond_54
    const/4 v7, 0x0

    .line 2033
    :goto_28
    invoke-static {v3}, Lyn0;->P(Ldd7;)Ldd7;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v4

    .line 2037
    :try_start_0
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v5

    .line 2041
    check-cast v5, Ljava/lang/Boolean;

    .line 2042
    .line 2043
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2044
    .line 2045
    .line 2046
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2047
    invoke-static {v3, v4, v7}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 2048
    .line 2049
    .line 2050
    if-eqz v5, :cond_55

    .line 2051
    .line 2052
    const-string v3, "TextFieldState does not support concurrent or nested editing."

    .line 2053
    .line 2054
    invoke-static {v3}, Lzc3;->c(Ljava/lang/String;)V

    .line 2055
    .line 2056
    .line 2057
    :cond_55
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2058
    .line 2059
    invoke-virtual {v0, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2060
    .line 2061
    .line 2062
    new-instance v9, Lg48;

    .line 2063
    .line 2064
    invoke-virtual {v1}, Ly68;->c()Lh48;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v10

    .line 2068
    const/4 v13, 0x0

    .line 2069
    const/16 v14, 0xe

    .line 2070
    .line 2071
    const/4 v11, 0x0

    .line 2072
    const/4 v12, 0x0

    .line 2073
    invoke-direct/range {v9 .. v14}, Lg48;-><init>(Lh48;Lmj0;Lh48;Lqf3;I)V

    .line 2074
    .line 2075
    .line 2076
    :try_start_1
    iget-object v0, v9, Lg48;->Z:Lmi5;

    .line 2077
    .line 2078
    invoke-virtual {v0}, Lmi5;->length()I

    .line 2079
    .line 2080
    .line 2081
    move-result v0

    .line 2082
    const-string v3, ""

    .line 2083
    .line 2084
    const/4 v6, 0x0

    .line 2085
    invoke-virtual {v9, v6, v0, v3}, Lg48;->c(IILjava/lang/String;)V

    .line 2086
    .line 2087
    .line 2088
    invoke-static {v9}, Lmn7;->f(Lg48;)V

    .line 2089
    .line 2090
    .line 2091
    invoke-virtual {v1, v9}, Ly68;->a(Lg48;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2092
    .line 2093
    .line 2094
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2095
    .line 2096
    invoke-virtual {v2, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2097
    .line 2098
    .line 2099
    invoke-virtual {v1, v6}, Ly68;->f(Z)V

    .line 2100
    .line 2101
    .line 2102
    return-object v8

    .line 2103
    :catchall_0
    move-exception v0

    .line 2104
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2105
    .line 2106
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 2107
    .line 2108
    .line 2109
    const/4 v6, 0x0

    .line 2110
    invoke-virtual {v1, v6}, Ly68;->f(Z)V

    .line 2111
    .line 2112
    .line 2113
    throw v0

    .line 2114
    :catchall_1
    move-exception v0

    .line 2115
    invoke-static {v3, v4, v7}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 2116
    .line 2117
    .line 2118
    throw v0

    .line 2119
    :pswitch_e
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2120
    .line 2121
    check-cast v0, Low2;

    .line 2122
    .line 2123
    invoke-virtual {v0}, Low2;->a()V

    .line 2124
    .line 2125
    .line 2126
    return-object v8

    .line 2127
    :pswitch_f
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2128
    .line 2129
    check-cast v0, Lci2;

    .line 2130
    .line 2131
    iget-object v0, v0, Lci2;->x0:Lai2;

    .line 2132
    .line 2133
    invoke-static {v0}, Lai2;->h1(Lai2;)Z

    .line 2134
    .line 2135
    .line 2136
    move-result v0

    .line 2137
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v0

    .line 2141
    return-object v0

    .line 2142
    :pswitch_10
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2143
    .line 2144
    check-cast v0, Lbh2;

    .line 2145
    .line 2146
    iget-object v1, v0, Lbh2;->c:Lt05;

    .line 2147
    .line 2148
    iget-object v2, v0, Lbh2;->d:Lt05;

    .line 2149
    .line 2150
    iget-object v4, v0, Lbh2;->a:Lgh2;

    .line 2151
    .line 2152
    invoke-virtual {v4}, Lgh2;->f()Lai2;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v5

    .line 2156
    sget-object v6, Lyh2;->Z:Lyh2;

    .line 2157
    .line 2158
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    if-nez v5, :cond_59

    .line 2164
    .line 2165
    iget-object v5, v2, Lt05;->b:[Ljava/lang/Object;

    .line 2166
    .line 2167
    iget-object v15, v2, Lt05;->a:[J

    .line 2168
    .line 2169
    move/from16 v20, v3

    .line 2170
    .line 2171
    array-length v3, v15

    .line 2172
    add-int/lit8 v3, v3, -0x2

    .line 2173
    .line 2174
    if-ltz v3, :cond_66

    .line 2175
    .line 2176
    const/16 p0, 0x7

    .line 2177
    .line 2178
    const/4 v7, 0x0

    .line 2179
    const-wide/16 v21, 0x80

    .line 2180
    .line 2181
    :goto_29
    aget-wide v9, v15, v7

    .line 2182
    .line 2183
    const-wide/16 v23, 0xff

    .line 2184
    .line 2185
    not-long v11, v9

    .line 2186
    shl-long v11, v11, p0

    .line 2187
    .line 2188
    and-long/2addr v11, v9

    .line 2189
    and-long/2addr v11, v13

    .line 2190
    cmp-long v11, v11, v13

    .line 2191
    .line 2192
    if-eqz v11, :cond_58

    .line 2193
    .line 2194
    sub-int v11, v7, v3

    .line 2195
    .line 2196
    not-int v11, v11

    .line 2197
    ushr-int/lit8 v11, v11, 0x1f

    .line 2198
    .line 2199
    const/16 v19, 0x8

    .line 2200
    .line 2201
    rsub-int/lit8 v11, v11, 0x8

    .line 2202
    .line 2203
    move-wide/from16 v25, v9

    .line 2204
    .line 2205
    const/4 v9, 0x0

    .line 2206
    :goto_2a
    if-ge v9, v11, :cond_57

    .line 2207
    .line 2208
    and-long v27, v25, v23

    .line 2209
    .line 2210
    cmp-long v10, v27, v21

    .line 2211
    .line 2212
    if-gez v10, :cond_56

    .line 2213
    .line 2214
    shl-int/lit8 v10, v7, 0x3

    .line 2215
    .line 2216
    add-int/2addr v10, v9

    .line 2217
    aget-object v10, v5, v10

    .line 2218
    .line 2219
    check-cast v10, Lvg2;

    .line 2220
    .line 2221
    invoke-interface {v10, v6}, Lvg2;->H(Lyh2;)V

    .line 2222
    .line 2223
    .line 2224
    :cond_56
    const/16 v10, 0x8

    .line 2225
    .line 2226
    shr-long v25, v25, v10

    .line 2227
    .line 2228
    add-int/lit8 v9, v9, 0x1

    .line 2229
    .line 2230
    goto :goto_2a

    .line 2231
    :cond_57
    const/16 v10, 0x8

    .line 2232
    .line 2233
    if-ne v11, v10, :cond_66

    .line 2234
    .line 2235
    :cond_58
    if-eq v7, v3, :cond_66

    .line 2236
    .line 2237
    add-int/lit8 v7, v7, 0x1

    .line 2238
    .line 2239
    goto :goto_29

    .line 2240
    :cond_59
    move/from16 v20, v3

    .line 2241
    .line 2242
    const/16 p0, 0x7

    .line 2243
    .line 2244
    const-wide/16 v21, 0x80

    .line 2245
    .line 2246
    const-wide/16 v23, 0xff

    .line 2247
    .line 2248
    iget-boolean v3, v5, Ljx4;->p0:Z

    .line 2249
    .line 2250
    if-eqz v3, :cond_66

    .line 2251
    .line 2252
    invoke-virtual {v1, v5}, Lt05;->c(Ljava/lang/Object;)Z

    .line 2253
    .line 2254
    .line 2255
    move-result v3

    .line 2256
    if-eqz v3, :cond_5a

    .line 2257
    .line 2258
    invoke-virtual {v5}, Lai2;->e1()V

    .line 2259
    .line 2260
    .line 2261
    :cond_5a
    invoke-virtual {v5}, Lai2;->d1()Lyh2;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v3

    .line 2265
    iget-object v7, v5, Ljx4;->X:Ljx4;

    .line 2266
    .line 2267
    iget-boolean v7, v7, Ljx4;->p0:Z

    .line 2268
    .line 2269
    if-nez v7, :cond_5b

    .line 2270
    .line 2271
    const-string v7, "visitAncestors called on an unattached node"

    .line 2272
    .line 2273
    invoke-static {v7}, Lwc3;->b(Ljava/lang/String;)V

    .line 2274
    .line 2275
    .line 2276
    :cond_5b
    iget-object v7, v5, Ljx4;->X:Ljx4;

    .line 2277
    .line 2278
    invoke-static {v5}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v5

    .line 2282
    move-object v9, v7

    .line 2283
    const/4 v7, 0x0

    .line 2284
    :goto_2b
    if-eqz v5, :cond_62

    .line 2285
    .line 2286
    iget-object v10, v5, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 2287
    .line 2288
    iget-object v10, v10, Lt6;->i0:Ljava/lang/Object;

    .line 2289
    .line 2290
    check-cast v10, Ljx4;

    .line 2291
    .line 2292
    iget v10, v10, Ljx4;->f0:I

    .line 2293
    .line 2294
    and-int/lit16 v10, v10, 0x1400

    .line 2295
    .line 2296
    if-eqz v10, :cond_60

    .line 2297
    .line 2298
    :goto_2c
    if-eqz v9, :cond_60

    .line 2299
    .line 2300
    iget v10, v9, Ljx4;->Z:I

    .line 2301
    .line 2302
    and-int/lit16 v11, v10, 0x1400

    .line 2303
    .line 2304
    if-eqz v11, :cond_5f

    .line 2305
    .line 2306
    and-int/lit16 v10, v10, 0x400

    .line 2307
    .line 2308
    if-eqz v10, :cond_5c

    .line 2309
    .line 2310
    add-int/lit8 v7, v7, 0x1

    .line 2311
    .line 2312
    :cond_5c
    instance-of v10, v9, Lvg2;

    .line 2313
    .line 2314
    if-eqz v10, :cond_5f

    .line 2315
    .line 2316
    invoke-virtual {v2, v9}, Lt05;->c(Ljava/lang/Object;)Z

    .line 2317
    .line 2318
    .line 2319
    move-result v10

    .line 2320
    if-nez v10, :cond_5d

    .line 2321
    .line 2322
    goto :goto_2e

    .line 2323
    :cond_5d
    const/4 v15, 0x1

    .line 2324
    if-gt v7, v15, :cond_5e

    .line 2325
    .line 2326
    move-object v10, v9

    .line 2327
    check-cast v10, Lvg2;

    .line 2328
    .line 2329
    invoke-interface {v10, v3}, Lvg2;->H(Lyh2;)V

    .line 2330
    .line 2331
    .line 2332
    goto :goto_2d

    .line 2333
    :cond_5e
    move-object v10, v9

    .line 2334
    check-cast v10, Lvg2;

    .line 2335
    .line 2336
    sget-object v11, Lyh2;->Y:Lyh2;

    .line 2337
    .line 2338
    invoke-interface {v10, v11}, Lvg2;->H(Lyh2;)V

    .line 2339
    .line 2340
    .line 2341
    :goto_2d
    invoke-virtual {v2, v9}, Lt05;->l(Ljava/lang/Object;)Z

    .line 2342
    .line 2343
    .line 2344
    goto :goto_2f

    .line 2345
    :cond_5f
    :goto_2e
    const/4 v15, 0x1

    .line 2346
    :goto_2f
    iget-object v9, v9, Ljx4;->g0:Ljx4;

    .line 2347
    .line 2348
    goto :goto_2c

    .line 2349
    :cond_60
    const/4 v15, 0x1

    .line 2350
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v5

    .line 2354
    if-eqz v5, :cond_61

    .line 2355
    .line 2356
    iget-object v9, v5, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 2357
    .line 2358
    if-eqz v9, :cond_61

    .line 2359
    .line 2360
    iget-object v9, v9, Lt6;->h0:Ljava/lang/Object;

    .line 2361
    .line 2362
    check-cast v9, Lf18;

    .line 2363
    .line 2364
    goto :goto_2b

    .line 2365
    :cond_61
    const/4 v9, 0x0

    .line 2366
    goto :goto_2b

    .line 2367
    :cond_62
    iget-object v3, v2, Lt05;->b:[Ljava/lang/Object;

    .line 2368
    .line 2369
    iget-object v5, v2, Lt05;->a:[J

    .line 2370
    .line 2371
    array-length v7, v5

    .line 2372
    add-int/lit8 v7, v7, -0x2

    .line 2373
    .line 2374
    if-ltz v7, :cond_66

    .line 2375
    .line 2376
    const/4 v9, 0x0

    .line 2377
    :goto_30
    aget-wide v10, v5, v9

    .line 2378
    .line 2379
    move-wide/from16 v25, v13

    .line 2380
    .line 2381
    not-long v13, v10

    .line 2382
    shl-long v12, v13, p0

    .line 2383
    .line 2384
    and-long/2addr v12, v10

    .line 2385
    and-long v12, v12, v25

    .line 2386
    .line 2387
    cmp-long v12, v12, v25

    .line 2388
    .line 2389
    if-eqz v12, :cond_65

    .line 2390
    .line 2391
    sub-int v12, v9, v7

    .line 2392
    .line 2393
    not-int v12, v12

    .line 2394
    ushr-int/lit8 v12, v12, 0x1f

    .line 2395
    .line 2396
    const/16 v19, 0x8

    .line 2397
    .line 2398
    rsub-int/lit8 v12, v12, 0x8

    .line 2399
    .line 2400
    move-wide v13, v10

    .line 2401
    const/4 v10, 0x0

    .line 2402
    :goto_31
    if-ge v10, v12, :cond_64

    .line 2403
    .line 2404
    and-long v15, v13, v23

    .line 2405
    .line 2406
    cmp-long v11, v15, v21

    .line 2407
    .line 2408
    if-gez v11, :cond_63

    .line 2409
    .line 2410
    shl-int/lit8 v11, v9, 0x3

    .line 2411
    .line 2412
    add-int/2addr v11, v10

    .line 2413
    aget-object v11, v3, v11

    .line 2414
    .line 2415
    check-cast v11, Lvg2;

    .line 2416
    .line 2417
    invoke-interface {v11, v6}, Lvg2;->H(Lyh2;)V

    .line 2418
    .line 2419
    .line 2420
    :cond_63
    const/16 v11, 0x8

    .line 2421
    .line 2422
    shr-long/2addr v13, v11

    .line 2423
    add-int/lit8 v10, v10, 0x1

    .line 2424
    .line 2425
    goto :goto_31

    .line 2426
    :cond_64
    const/16 v11, 0x8

    .line 2427
    .line 2428
    if-ne v12, v11, :cond_66

    .line 2429
    .line 2430
    goto :goto_32

    .line 2431
    :cond_65
    const/16 v11, 0x8

    .line 2432
    .line 2433
    :goto_32
    if-eq v9, v7, :cond_66

    .line 2434
    .line 2435
    add-int/lit8 v9, v9, 0x1

    .line 2436
    .line 2437
    move-wide/from16 v13, v25

    .line 2438
    .line 2439
    goto :goto_30

    .line 2440
    :cond_66
    invoke-virtual {v4}, Lgh2;->f()Lai2;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v3

    .line 2444
    if-eqz v3, :cond_67

    .line 2445
    .line 2446
    iget-object v3, v4, Lgh2;->c:Lai2;

    .line 2447
    .line 2448
    invoke-virtual {v3}, Lai2;->d1()Lyh2;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v3

    .line 2452
    if-ne v3, v6, :cond_68

    .line 2453
    .line 2454
    :cond_67
    invoke-virtual {v4}, Lgh2;->c()V

    .line 2455
    .line 2456
    .line 2457
    :cond_68
    invoke-virtual {v1}, Lt05;->b()V

    .line 2458
    .line 2459
    .line 2460
    invoke-virtual {v2}, Lt05;->b()V

    .line 2461
    .line 2462
    .line 2463
    const/4 v6, 0x0

    .line 2464
    iput-boolean v6, v0, Lbh2;->e:Z

    .line 2465
    .line 2466
    return-object v8

    .line 2467
    :pswitch_11
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2468
    .line 2469
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2470
    .line 2471
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2472
    .line 2473
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->C()V

    .line 2474
    .line 2475
    .line 2476
    return-object v8

    .line 2477
    :pswitch_12
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2478
    .line 2479
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2480
    .line 2481
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2482
    .line 2483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2484
    .line 2485
    .line 2486
    sget v1, Ly46;->toast_success:I

    .line 2487
    .line 2488
    invoke-static {v0, v1}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 2489
    .line 2490
    .line 2491
    return-object v8

    .line 2492
    :pswitch_13
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2493
    .line 2494
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2495
    .line 2496
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2497
    .line 2498
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->C()V

    .line 2499
    .line 2500
    .line 2501
    return-object v8

    .line 2502
    :pswitch_14
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2503
    .line 2504
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2505
    .line 2506
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2507
    .line 2508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2509
    .line 2510
    .line 2511
    sget v1, Ly46;->toast_success:I

    .line 2512
    .line 2513
    invoke-static {v0, v1}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 2514
    .line 2515
    .line 2516
    return-object v8

    .line 2517
    :pswitch_15
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2518
    .line 2519
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2520
    .line 2521
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2522
    .line 2523
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->C()V

    .line 2524
    .line 2525
    .line 2526
    return-object v8

    .line 2527
    :pswitch_16
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2528
    .line 2529
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2530
    .line 2531
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2532
    .line 2533
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2534
    .line 2535
    .line 2536
    sget v1, Ly46;->toast_success:I

    .line 2537
    .line 2538
    invoke-static {v0, v1}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 2539
    .line 2540
    .line 2541
    return-object v8

    .line 2542
    :pswitch_17
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2543
    .line 2544
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2545
    .line 2546
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2547
    .line 2548
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->C()V

    .line 2549
    .line 2550
    .line 2551
    return-object v8

    .line 2552
    :pswitch_18
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2553
    .line 2554
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2555
    .line 2556
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2557
    .line 2558
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->C()V

    .line 2559
    .line 2560
    .line 2561
    return-object v8

    .line 2562
    :pswitch_19
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2563
    .line 2564
    check-cast v0, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 2565
    .line 2566
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 2567
    .line 2568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2569
    .line 2570
    .line 2571
    sget v1, Ly46;->toast_success:I

    .line 2572
    .line 2573
    invoke-static {v0, v1}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 2574
    .line 2575
    .line 2576
    return-object v8

    .line 2577
    :pswitch_1a
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2578
    .line 2579
    check-cast v0, Lh38;

    .line 2580
    .line 2581
    invoke-interface {v0}, Lh38;->S()Lg38;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v0

    .line 2585
    return-object v0

    .line 2586
    :pswitch_1b
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 2587
    .line 2588
    check-cast v0, Landroid/view/View;

    .line 2589
    .line 2590
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2591
    .line 2592
    const/16 v2, 0x1e

    .line 2593
    .line 2594
    if-lt v1, v2, :cond_69

    .line 2595
    .line 2596
    invoke-static {v0}, Lb4;->s(Landroid/view/View;)V

    .line 2597
    .line 2598
    .line 2599
    :cond_69
    const/16 v2, 0x1d

    .line 2600
    .line 2601
    if-lt v1, v2, :cond_6b

    .line 2602
    .line 2603
    invoke-static {v0}, Lwa;->p(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 2604
    .line 2605
    .line 2606
    move-result-object v1

    .line 2607
    if-nez v1, :cond_6a

    .line 2608
    .line 2609
    goto :goto_33

    .line 2610
    :cond_6a
    new-instance v7, Lh41;

    .line 2611
    .line 2612
    invoke-direct {v7, v1, v0}, Lh41;-><init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V

    .line 2613
    .line 2614
    .line 2615
    goto :goto_34

    .line 2616
    :cond_6b
    :goto_33
    const/4 v7, 0x0

    .line 2617
    :goto_34
    return-object v7

    .line 2618
    nop

    .line 2619
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

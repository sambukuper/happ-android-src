.class public final synthetic Li9;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, Li9;->X:B

    .line 2
    .line 3
    iput-object p3, p0, Li9;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Li9;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, Li9;->X:B

    iput-object p1, p0, Li9;->Y:Ljava/lang/Object;

    iput-object p2, p0, Li9;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 59

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li9;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lf64;

    .line 6
    .line 7
    iget-object v0, v0, Li9;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ld74;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, Lwp7;

    .line 14
    .line 15
    move-object/from16 v3, p2

    .line 16
    .line 17
    check-cast v3, Lq31;

    .line 18
    .line 19
    new-instance v13, Li64;

    .line 20
    .line 21
    invoke-direct {v13, v1, v2}, Li64;-><init>(Lf64;Lwp7;)V

    .line 22
    .line 23
    .line 24
    iget-wide v3, v3, Lq31;->a:J

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Ld74;->d:Lgt;

    .line 30
    .line 31
    iget-object v5, v0, Ld74;->b:Lgg5;

    .line 32
    .line 33
    iget-object v6, v0, Ld74;->a:Lj74;

    .line 34
    .line 35
    iget-object v7, v6, Lj74;->v0:Ly05;

    .line 36
    .line 37
    iget-object v8, v6, Lj74;->g0:Lwg;

    .line 38
    .line 39
    invoke-interface {v7}, Llh7;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-boolean v7, v6, Lj74;->Y:Z

    .line 43
    .line 44
    if-nez v7, :cond_1

    .line 45
    .line 46
    invoke-interface {v2}, Lug3;->c0()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/16 v22, 0x0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :goto_0
    const/16 v22, 0x1

    .line 57
    .line 58
    :goto_1
    sget-object v7, Lsd5;->X:Lsd5;

    .line 59
    .line 60
    invoke-static {v3, v4, v7}, Los4;->j(JLsd5;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Lug3;->getLayoutDirection()Lz24;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-interface {v5, v11}, Lgg5;->b(Lz24;)F

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    invoke-interface {v2, v11}, Lfi1;->x0(F)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-interface {v2}, Lug3;->getLayoutDirection()Lz24;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    invoke-interface {v5, v12}, Lgg5;->c(Lz24;)F

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-interface {v2, v12}, Lfi1;->x0(F)I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    invoke-interface {v5}, Lgg5;->d()F

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    invoke-interface {v2, v14}, Lfi1;->x0(F)I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    invoke-interface {v5}, Lgg5;->a()F

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-interface {v2, v5}, Lfi1;->x0(F)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    add-int/2addr v5, v14

    .line 104
    add-int/2addr v12, v11

    .line 105
    move-object v15, v8

    .line 106
    move-object v8, v13

    .line 107
    sub-int v13, v5, v14

    .line 108
    .line 109
    neg-int v9, v12

    .line 110
    neg-int v10, v5

    .line 111
    invoke-static {v9, v3, v4, v10}, Ls31;->i(IJI)J

    .line 112
    .line 113
    .line 114
    move-result-wide v9

    .line 115
    move-wide/from16 v16, v3

    .line 116
    .line 117
    iget-object v3, v0, Ld74;->c:Ldn2;

    .line 118
    .line 119
    invoke-interface {v3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lz64;

    .line 124
    .line 125
    iget-object v4, v3, Lz64;->c:Lk44;

    .line 126
    .line 127
    move-object/from16 p2, v3

    .line 128
    .line 129
    invoke-static {v9, v10}, Lq31;->h(J)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    move/from16 v18, v5

    .line 134
    .line 135
    invoke-static {v9, v10}, Lq31;->g(J)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    move-object/from16 v19, v6

    .line 140
    .line 141
    iget-object v6, v4, Lk44;->a:Loh5;

    .line 142
    .line 143
    invoke-virtual {v6, v3}, Loh5;->m(I)V

    .line 144
    .line 145
    .line 146
    iget-object v3, v4, Lk44;->b:Loh5;

    .line 147
    .line 148
    invoke-virtual {v3, v5}, Loh5;->m(I)V

    .line 149
    .line 150
    .line 151
    const-string v3, "null verticalArrangement when isVertical == true"

    .line 152
    .line 153
    if-eqz v1, :cond_74

    .line 154
    .line 155
    invoke-interface {v1}, Lgt;->a()F

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-interface {v2, v4}, Lfi1;->x0(F)I

    .line 160
    .line 161
    .line 162
    move-result v23

    .line 163
    invoke-virtual/range {p2 .. p2}, Lz64;->c()I

    .line 164
    .line 165
    .line 166
    move-result v20

    .line 167
    invoke-static/range {v16 .. v17}, Lq31;->g(J)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    sub-int v4, v4, v18

    .line 172
    .line 173
    int-to-long v5, v11

    .line 174
    const/16 v27, 0x20

    .line 175
    .line 176
    shl-long v5, v5, v27

    .line 177
    .line 178
    move-object/from16 v21, v3

    .line 179
    .line 180
    move v11, v4

    .line 181
    int-to-long v3, v14

    .line 182
    const-wide v28, 0xffffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    and-long v3, v3, v28

    .line 188
    .line 189
    or-long/2addr v3, v5

    .line 190
    move v5, v12

    .line 191
    move v12, v14

    .line 192
    move-wide/from16 v57, v3

    .line 193
    .line 194
    move-object v3, v15

    .line 195
    move-wide/from16 v14, v57

    .line 196
    .line 197
    new-instance v4, Lc74;

    .line 198
    .line 199
    move v6, v11

    .line 200
    iget-object v11, v0, Ld74;->h:Lp8;

    .line 201
    .line 202
    move-object/from16 v24, v3

    .line 203
    .line 204
    iget-object v3, v0, Ld74;->a:Lj74;

    .line 205
    .line 206
    move-object/from16 p1, v2

    .line 207
    .line 208
    move/from16 v32, v5

    .line 209
    .line 210
    move/from16 v33, v6

    .line 211
    .line 212
    move-object/from16 v34, v7

    .line 213
    .line 214
    move-wide v5, v9

    .line 215
    move/from16 v31, v18

    .line 216
    .line 217
    move/from16 v9, v20

    .line 218
    .line 219
    move/from16 v10, v23

    .line 220
    .line 221
    const/16 p0, 0x1

    .line 222
    .line 223
    move-object/from16 v7, p2

    .line 224
    .line 225
    move-object/from16 p2, v19

    .line 226
    .line 227
    move-wide/from16 v57, v16

    .line 228
    .line 229
    move-object/from16 v17, v1

    .line 230
    .line 231
    move-object/from16 v16, v3

    .line 232
    .line 233
    move-wide/from16 v1, v57

    .line 234
    .line 235
    move-object/from16 v3, v24

    .line 236
    .line 237
    invoke-direct/range {v4 .. v16}, Lc74;-><init>(JLz64;Li64;IILp8;IIJLj74;)V

    .line 238
    .line 239
    .line 240
    move-object/from16 v57, v8

    .line 241
    .line 242
    move-object v8, v4

    .line 243
    move-object v4, v7

    .line 244
    move-wide v6, v5

    .line 245
    move v5, v13

    .line 246
    move-object/from16 v13, v57

    .line 247
    .line 248
    iget-object v11, v8, Lc74;->b:Lz64;

    .line 249
    .line 250
    iget-object v14, v11, Lz64;->d:Lne;

    .line 251
    .line 252
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 253
    .line 254
    .line 255
    move-result-object v15

    .line 256
    const/16 v35, 0x0

    .line 257
    .line 258
    if-eqz v15, :cond_2

    .line 259
    .line 260
    invoke-virtual {v15}, Ldd7;->e()Lgn2;

    .line 261
    .line 262
    .line 263
    move-result-object v16

    .line 264
    move/from16 v36, v5

    .line 265
    .line 266
    move-object/from16 v5, v16

    .line 267
    .line 268
    :goto_2
    move-object/from16 v20, v8

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_2
    move/from16 v36, v5

    .line 272
    .line 273
    move-object/from16 v5, v35

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :goto_3
    invoke-static {v15}, Lyn0;->P(Ldd7;)Ldd7;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    move/from16 v37, v10

    .line 281
    .line 282
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lj74;->c()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    move-object/from16 v38, v13

    .line 287
    .line 288
    iget-object v13, v3, Lwg;->d:Ljava/lang/Object;

    .line 289
    .line 290
    invoke-static {v10, v4, v13}, Lz68;->z(ILz64;Ljava/lang/Object;)I

    .line 291
    .line 292
    .line 293
    move-result v13

    .line 294
    if-eq v10, v13, :cond_4

    .line 295
    .line 296
    move-object/from16 v19, v14

    .line 297
    .line 298
    iget-object v14, v3, Lwg;->b:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v14, Loh5;

    .line 301
    .line 302
    invoke-virtual {v14, v13}, Loh5;->m(I)V

    .line 303
    .line 304
    .line 305
    iget-object v14, v3, Lwg;->e:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v14, Lj64;

    .line 308
    .line 309
    move-object/from16 v39, v11

    .line 310
    .line 311
    iget v11, v14, Lj64;->Y:I

    .line 312
    .line 313
    if-eq v10, v11, :cond_3

    .line 314
    .line 315
    iput v10, v14, Lj64;->Y:I

    .line 316
    .line 317
    div-int/lit8 v10, v10, 0x1e

    .line 318
    .line 319
    mul-int/lit8 v10, v10, 0x1e

    .line 320
    .line 321
    add-int/lit8 v11, v10, -0x64

    .line 322
    .line 323
    move/from16 v40, v9

    .line 324
    .line 325
    const/4 v9, 0x0

    .line 326
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    add-int/lit16 v10, v10, 0x82

    .line 331
    .line 332
    invoke-static {v11, v10}, Lx97;->a0(II)Lkf3;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    iget-object v10, v14, Lj64;->X:Lrh5;

    .line 337
    .line 338
    invoke-virtual {v10, v9}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_3
    move/from16 v40, v9

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_4
    move/from16 v40, v9

    .line 346
    .line 347
    move-object/from16 v39, v11

    .line 348
    .line 349
    move-object/from16 v19, v14

    .line 350
    .line 351
    :goto_4
    iget-object v3, v3, Lwg;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v3, Loh5;

    .line 354
    .line 355
    invoke-virtual {v3}, Loh5;->l()I

    .line 356
    .line 357
    .line 358
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    invoke-static {v15, v8, v5}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v3, p2

    .line 363
    .line 364
    iget-object v5, v3, Lj74;->u0:Lm64;

    .line 365
    .line 366
    iget-object v8, v3, Lj74;->q0:Lvk1;

    .line 367
    .line 368
    iget-object v5, v5, Lm64;->X:Lvd7;

    .line 369
    .line 370
    invoke-static {v5}, Lhi5;->c0(Lvd7;)Lwh7;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    iget-object v5, v5, Lwh7;->c:Lk2;

    .line 375
    .line 376
    iget-object v9, v8, Lvk1;->Y:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v9, Lc15;

    .line 379
    .line 380
    iget v11, v9, Lc15;->Z:I

    .line 381
    .line 382
    if-eqz v11, :cond_5

    .line 383
    .line 384
    move/from16 v11, p0

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_5
    const/4 v11, 0x0

    .line 388
    :goto_5
    if-nez v11, :cond_6

    .line 389
    .line 390
    invoke-virtual {v5}, Lz0;->isEmpty()Z

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    if-eqz v11, :cond_6

    .line 395
    .line 396
    sget-object v4, Lef3;->a:Luz4;

    .line 397
    .line 398
    move/from16 p2, v10

    .line 399
    .line 400
    goto/16 :goto_e

    .line 401
    .line 402
    :cond_6
    new-instance v11, Luz4;

    .line 403
    .line 404
    invoke-direct {v11}, Luz4;-><init>()V

    .line 405
    .line 406
    .line 407
    iget-object v8, v8, Lvk1;->Y:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v8, Lc15;

    .line 410
    .line 411
    iget v8, v8, Lc15;->Z:I

    .line 412
    .line 413
    if-eqz v8, :cond_e

    .line 414
    .line 415
    iget v8, v9, Lc15;->Z:I

    .line 416
    .line 417
    const-string v14, "MutableVector is empty."

    .line 418
    .line 419
    if-eqz v8, :cond_d

    .line 420
    .line 421
    iget-object v15, v9, Lc15;->X:[Ljava/lang/Object;

    .line 422
    .line 423
    const/16 v30, 0x0

    .line 424
    .line 425
    aget-object v16, v15, v30

    .line 426
    .line 427
    move/from16 p2, v10

    .line 428
    .line 429
    move-object/from16 v10, v16

    .line 430
    .line 431
    check-cast v10, Lr54;

    .line 432
    .line 433
    iget v10, v10, Lr54;->a:I

    .line 434
    .line 435
    move-object/from16 v16, v14

    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    :goto_6
    if-ge v14, v8, :cond_8

    .line 439
    .line 440
    aget-object v18, v15, v14

    .line 441
    .line 442
    move/from16 v23, v8

    .line 443
    .line 444
    move-object/from16 v8, v18

    .line 445
    .line 446
    check-cast v8, Lr54;

    .line 447
    .line 448
    iget v8, v8, Lr54;->a:I

    .line 449
    .line 450
    if-ge v8, v10, :cond_7

    .line 451
    .line 452
    move v10, v8

    .line 453
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 454
    .line 455
    move/from16 v8, v23

    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_8
    if-ltz v10, :cond_9

    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_9
    const-string v8, "negative minIndex"

    .line 462
    .line 463
    invoke-static {v8}, Lzc3;->a(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    :goto_7
    iget v8, v9, Lc15;->Z:I

    .line 467
    .line 468
    if-eqz v8, :cond_c

    .line 469
    .line 470
    iget-object v9, v9, Lc15;->X:[Ljava/lang/Object;

    .line 471
    .line 472
    const/16 v30, 0x0

    .line 473
    .line 474
    aget-object v14, v9, v30

    .line 475
    .line 476
    check-cast v14, Lr54;

    .line 477
    .line 478
    iget v14, v14, Lr54;->b:I

    .line 479
    .line 480
    move v15, v14

    .line 481
    const/4 v14, 0x0

    .line 482
    :goto_8
    if-ge v14, v8, :cond_b

    .line 483
    .line 484
    aget-object v16, v9, v14

    .line 485
    .line 486
    move/from16 v18, v8

    .line 487
    .line 488
    move-object/from16 v8, v16

    .line 489
    .line 490
    check-cast v8, Lr54;

    .line 491
    .line 492
    iget v8, v8, Lr54;->b:I

    .line 493
    .line 494
    if-le v8, v15, :cond_a

    .line 495
    .line 496
    move v15, v8

    .line 497
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 498
    .line 499
    move/from16 v8, v18

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_b
    invoke-virtual {v4}, Lz64;->c()I

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    add-int/lit8 v8, v8, -0x1

    .line 507
    .line 508
    invoke-static {v15, v8}, Ljava/lang/Math;->min(II)I

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    move v9, v10

    .line 513
    move v10, v8

    .line 514
    goto :goto_9

    .line 515
    :cond_c
    invoke-static/range {v16 .. v16}, Lem7;->g(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    return-object v35

    .line 519
    :cond_d
    move-object/from16 v16, v14

    .line 520
    .line 521
    invoke-static/range {v16 .. v16}, Lem7;->g(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    return-object v35

    .line 525
    :cond_e
    move/from16 p2, v10

    .line 526
    .line 527
    const/4 v10, 0x0

    .line 528
    move/from16 v9, p0

    .line 529
    .line 530
    :goto_9
    invoke-virtual {v5}, Lz0;->a()I

    .line 531
    .line 532
    .line 533
    move-result v8

    .line 534
    const/4 v14, 0x0

    .line 535
    :goto_a
    if-ge v14, v8, :cond_11

    .line 536
    .line 537
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v15

    .line 541
    check-cast v15, Lk64;

    .line 542
    .line 543
    move-object/from16 v16, v5

    .line 544
    .line 545
    iget-object v5, v15, Lk64;->a:Ljava/lang/Object;

    .line 546
    .line 547
    iget v15, v15, Lk64;->c:I

    .line 548
    .line 549
    invoke-static {v15, v4, v5}, Lz68;->z(ILz64;Ljava/lang/Object;)I

    .line 550
    .line 551
    .line 552
    move-result v5

    .line 553
    if-gt v9, v5, :cond_f

    .line 554
    .line 555
    if-gt v5, v10, :cond_f

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_f
    if-ltz v5, :cond_10

    .line 559
    .line 560
    invoke-virtual {v4}, Lz64;->c()I

    .line 561
    .line 562
    .line 563
    move-result v15

    .line 564
    if-ge v5, v15, :cond_10

    .line 565
    .line 566
    invoke-virtual {v11, v5}, Luz4;->a(I)V

    .line 567
    .line 568
    .line 569
    :cond_10
    :goto_b
    add-int/lit8 v14, v14, 0x1

    .line 570
    .line 571
    move-object/from16 v5, v16

    .line 572
    .line 573
    goto :goto_a

    .line 574
    :cond_11
    if-gt v9, v10, :cond_12

    .line 575
    .line 576
    :goto_c
    invoke-virtual {v11, v9}, Luz4;->a(I)V

    .line 577
    .line 578
    .line 579
    if-eq v9, v10, :cond_12

    .line 580
    .line 581
    add-int/lit8 v9, v9, 0x1

    .line 582
    .line 583
    goto :goto_c

    .line 584
    :cond_12
    iget v4, v11, Luz4;->b:I

    .line 585
    .line 586
    if-nez v4, :cond_13

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_13
    iget-object v5, v11, Luz4;->a:[I

    .line 590
    .line 591
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    const/4 v9, 0x0

    .line 595
    invoke-static {v5, v9, v4}, Ljava/util/Arrays;->sort([III)V

    .line 596
    .line 597
    .line 598
    :goto_d
    move-object v4, v11

    .line 599
    :goto_e
    invoke-interface/range {p1 .. p1}, Lug3;->c0()Z

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    if-nez v5, :cond_15

    .line 604
    .line 605
    if-nez v22, :cond_14

    .line 606
    .line 607
    goto :goto_f

    .line 608
    :cond_14
    iget-object v5, v3, Lj74;->z0:Lzz2;

    .line 609
    .line 610
    iget-object v5, v5, Lzz2;->Z:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v5, Lqk;

    .line 613
    .line 614
    iget-object v5, v5, Lqk;->Y:Lrh5;

    .line 615
    .line 616
    invoke-virtual {v5}, Lrh5;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    check-cast v5, Ljava/lang/Number;

    .line 621
    .line 622
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    goto :goto_10

    .line 627
    :cond_15
    :goto_f
    iget v5, v3, Lj74;->j0:F

    .line 628
    .line 629
    :goto_10
    iget-object v14, v3, Lj74;->p0:Ld64;

    .line 630
    .line 631
    move-object/from16 v8, v21

    .line 632
    .line 633
    invoke-interface/range {p1 .. p1}, Lug3;->c0()Z

    .line 634
    .line 635
    .line 636
    move-result v21

    .line 637
    iget-object v9, v0, Ld74;->e:Lb71;

    .line 638
    .line 639
    iget-object v10, v3, Lj74;->y0:Ly05;

    .line 640
    .line 641
    iget-object v11, v0, Ld74;->f:Lvt2;

    .line 642
    .line 643
    iget-object v0, v0, Ld74;->g:Lwe5;

    .line 644
    .line 645
    if-ltz v12, :cond_16

    .line 646
    .line 647
    goto :goto_11

    .line 648
    :cond_16
    const-string v15, "invalid beforeContentPadding"

    .line 649
    .line 650
    invoke-static {v15}, Lzc3;->a(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    :goto_11
    if-ltz v36, :cond_17

    .line 654
    .line 655
    goto :goto_12

    .line 656
    :cond_17
    const-string v15, "invalid afterContentPadding"

    .line 657
    .line 658
    invoke-static {v15}, Lzc3;->a(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    :goto_12
    sget-object v15, Le02;->X:Le02;

    .line 662
    .line 663
    move-object/from16 v16, v8

    .line 664
    .line 665
    move-object/from16 v25, v9

    .line 666
    .line 667
    const-wide/16 v8, 0x0

    .line 668
    .line 669
    sget-object v41, Ld02;->X:Ld02;

    .line 670
    .line 671
    if-gtz v40, :cond_19

    .line 672
    .line 673
    invoke-static {v6, v7}, Lq31;->j(J)I

    .line 674
    .line 675
    .line 676
    move-result v16

    .line 677
    invoke-static {v6, v7}, Lq31;->i(J)I

    .line 678
    .line 679
    .line 680
    move-result v17

    .line 681
    new-instance v18, Ljava/util/ArrayList;

    .line 682
    .line 683
    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 684
    .line 685
    .line 686
    const/16 v23, 0x0

    .line 687
    .line 688
    const/16 v24, 0x0

    .line 689
    .line 690
    move-object v0, v15

    .line 691
    const/4 v15, 0x0

    .line 692
    move-object/from16 v26, v11

    .line 693
    .line 694
    move-object v11, v0

    .line 695
    invoke-virtual/range {v14 .. v26}, Ld64;->c(IIILjava/util/ArrayList;Lne;Lc74;ZZIILb71;Lvt2;)V

    .line 696
    .line 697
    .line 698
    move-object v15, v14

    .line 699
    move-object/from16 v14, v20

    .line 700
    .line 701
    if-nez v21, :cond_18

    .line 702
    .line 703
    invoke-virtual {v15}, Ld64;->a()J

    .line 704
    .line 705
    .line 706
    move-result-wide v4

    .line 707
    invoke-static {v4, v5, v8, v9}, Lpf3;->a(JJ)Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-nez v0, :cond_18

    .line 712
    .line 713
    shr-long v8, v4, v27

    .line 714
    .line 715
    long-to-int v0, v8

    .line 716
    invoke-static {v0, v6, v7}, Ls31;->g(IJ)I

    .line 717
    .line 718
    .line 719
    move-result v16

    .line 720
    and-long v4, v4, v28

    .line 721
    .line 722
    long-to-int v0, v4

    .line 723
    invoke-static {v0, v6, v7}, Ls31;->f(IJ)I

    .line 724
    .line 725
    .line 726
    move-result v17

    .line 727
    :cond_18
    new-instance v0, Luh3;

    .line 728
    .line 729
    const/4 v4, 0x5

    .line 730
    invoke-direct {v0, v4}, Luh3;-><init>(B)V

    .line 731
    .line 732
    .line 733
    add-int v4, v16, v32

    .line 734
    .line 735
    invoke-static {v4, v1, v2}, Ls31;->g(IJ)I

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    add-int v5, v17, v31

    .line 740
    .line 741
    invoke-static {v5, v1, v2}, Ls31;->f(IJ)I

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    move-object/from16 v2, p1

    .line 746
    .line 747
    invoke-interface {v2, v4, v1, v11, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 748
    .line 749
    .line 750
    move-result-object v9

    .line 751
    neg-int v0, v12

    .line 752
    add-int v19, v33, v36

    .line 753
    .line 754
    new-instance v4, Le74;

    .line 755
    .line 756
    const/16 v16, 0x0

    .line 757
    .line 758
    const/16 v20, 0x0

    .line 759
    .line 760
    const/4 v5, 0x0

    .line 761
    const/4 v6, 0x0

    .line 762
    const/4 v7, 0x0

    .line 763
    const/4 v8, 0x0

    .line 764
    const/4 v10, 0x0

    .line 765
    const/4 v11, 0x0

    .line 766
    iget-wide v14, v14, Lc74;->d:J

    .line 767
    .line 768
    move/from16 v18, v0

    .line 769
    .line 770
    move-object/from16 v12, v25

    .line 771
    .line 772
    move-object/from16 v21, v34

    .line 773
    .line 774
    move/from16 v22, v36

    .line 775
    .line 776
    move/from16 v23, v37

    .line 777
    .line 778
    move-object/from16 v13, v38

    .line 779
    .line 780
    move-object/from16 v17, v41

    .line 781
    .line 782
    invoke-direct/range {v4 .. v23}, Le74;-><init>(Lf74;IZFLyr4;FZLb71;Lfi1;JILjava/util/List;IIILsd5;II)V

    .line 783
    .line 784
    .line 785
    move-object/from16 p2, v3

    .line 786
    .line 787
    goto/16 :goto_5a

    .line 788
    .line 789
    :cond_19
    move-object/from16 v42, p1

    .line 790
    .line 791
    move-object/from16 v26, v11

    .line 792
    .line 793
    move-object v11, v15

    .line 794
    move-object/from16 v8, v38

    .line 795
    .line 796
    move/from16 v9, v40

    .line 797
    .line 798
    move-object/from16 v38, v0

    .line 799
    .line 800
    move-object v15, v14

    .line 801
    move-object/from16 v14, v20

    .line 802
    .line 803
    move/from16 v0, v33

    .line 804
    .line 805
    move-object/from16 v40, v34

    .line 806
    .line 807
    if-lt v13, v9, :cond_1a

    .line 808
    .line 809
    add-int/lit8 v13, v9, -0x1

    .line 810
    .line 811
    move/from16 v18, v13

    .line 812
    .line 813
    const/4 v13, 0x0

    .line 814
    goto :goto_13

    .line 815
    :cond_1a
    move/from16 v18, v13

    .line 816
    .line 817
    move/from16 v13, p2

    .line 818
    .line 819
    :goto_13
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 820
    .line 821
    .line 822
    move-result v20

    .line 823
    sub-int v13, v13, v20

    .line 824
    .line 825
    if-nez v18, :cond_1b

    .line 826
    .line 827
    if-gez v13, :cond_1b

    .line 828
    .line 829
    add-int v20, v20, v13

    .line 830
    .line 831
    const/4 v13, 0x0

    .line 832
    :cond_1b
    move/from16 p1, v5

    .line 833
    .line 834
    new-instance v5, Lkt;

    .line 835
    .line 836
    invoke-direct {v5}, Lkt;-><init>()V

    .line 837
    .line 838
    .line 839
    move/from16 p2, v13

    .line 840
    .line 841
    neg-int v13, v12

    .line 842
    if-gez v37, :cond_1c

    .line 843
    .line 844
    move/from16 v23, v37

    .line 845
    .line 846
    :goto_14
    move-object/from16 v24, v15

    .line 847
    .line 848
    goto :goto_15

    .line 849
    :cond_1c
    const/16 v23, 0x0

    .line 850
    .line 851
    goto :goto_14

    .line 852
    :goto_15
    add-int v15, v13, v23

    .line 853
    .line 854
    add-int v23, p2, v15

    .line 855
    .line 856
    move-wide/from16 v44, v1

    .line 857
    .line 858
    move-object/from16 p2, v3

    .line 859
    .line 860
    move-object/from16 v43, v11

    .line 861
    .line 862
    move/from16 v11, v23

    .line 863
    .line 864
    const/4 v3, 0x0

    .line 865
    :goto_16
    iget-wide v1, v14, Lc74;->d:J

    .line 866
    .line 867
    if-gez v11, :cond_1d

    .line 868
    .line 869
    if-lez v18, :cond_1d

    .line 870
    .line 871
    move-object/from16 v46, v10

    .line 872
    .line 873
    add-int/lit8 v10, v18, -0x1

    .line 874
    .line 875
    invoke-virtual {v14, v10, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    const/4 v2, 0x0

    .line 880
    invoke-virtual {v5, v2, v1}, Lkt;->add(ILjava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    iget v2, v1, Lf74;->q:I

    .line 884
    .line 885
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    invoke-virtual {v1}, Lf74;->a()I

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    add-int/2addr v11, v1

    .line 894
    move/from16 v18, v10

    .line 895
    .line 896
    move-object/from16 v10, v46

    .line 897
    .line 898
    goto :goto_16

    .line 899
    :cond_1d
    move-object/from16 v46, v10

    .line 900
    .line 901
    if-ge v11, v15, :cond_1e

    .line 902
    .line 903
    sub-int v10, v15, v11

    .line 904
    .line 905
    sub-int v20, v20, v10

    .line 906
    .line 907
    move v11, v15

    .line 908
    :cond_1e
    move/from16 v10, v20

    .line 909
    .line 910
    sub-int/2addr v11, v15

    .line 911
    add-int v47, v0, v36

    .line 912
    .line 913
    move/from16 v20, v3

    .line 914
    .line 915
    if-gez v47, :cond_1f

    .line 916
    .line 917
    const/4 v3, 0x0

    .line 918
    :goto_17
    move/from16 v48, v13

    .line 919
    .line 920
    goto :goto_18

    .line 921
    :cond_1f
    move/from16 v3, v47

    .line 922
    .line 923
    goto :goto_17

    .line 924
    :goto_18
    neg-int v13, v11

    .line 925
    move-object/from16 v51, v8

    .line 926
    .line 927
    move/from16 v23, v11

    .line 928
    .line 929
    move/from16 v50, v18

    .line 930
    .line 931
    const/4 v11, 0x0

    .line 932
    const/16 v49, 0x0

    .line 933
    .line 934
    :goto_19
    iget v8, v5, Lkt;->Z:I

    .line 935
    .line 936
    if-ge v11, v8, :cond_21

    .line 937
    .line 938
    if-lt v13, v3, :cond_20

    .line 939
    .line 940
    invoke-virtual {v5, v11}, Lkt;->b(I)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move/from16 v49, p0

    .line 944
    .line 945
    goto :goto_19

    .line 946
    :cond_20
    add-int/lit8 v50, v50, 0x1

    .line 947
    .line 948
    invoke-virtual {v5, v11}, Lkt;->get(I)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v8

    .line 952
    check-cast v8, Lf74;

    .line 953
    .line 954
    invoke-virtual {v8}, Lf74;->a()I

    .line 955
    .line 956
    .line 957
    move-result v8

    .line 958
    add-int/2addr v8, v13

    .line 959
    add-int/lit8 v11, v11, 0x1

    .line 960
    .line 961
    move v13, v8

    .line 962
    goto :goto_19

    .line 963
    :cond_21
    move/from16 v8, v20

    .line 964
    .line 965
    move/from16 v11, v50

    .line 966
    .line 967
    :goto_1a
    if-ge v11, v9, :cond_25

    .line 968
    .line 969
    if-lt v13, v3, :cond_22

    .line 970
    .line 971
    if-lez v13, :cond_22

    .line 972
    .line 973
    invoke-virtual {v5}, Lkt;->isEmpty()Z

    .line 974
    .line 975
    .line 976
    move-result v20

    .line 977
    if-eqz v20, :cond_25

    .line 978
    .line 979
    :cond_22
    move/from16 v20, v3

    .line 980
    .line 981
    invoke-virtual {v14, v11, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    invoke-virtual {v3}, Lf74;->a()I

    .line 986
    .line 987
    .line 988
    move-result v50

    .line 989
    add-int v13, v50, v13

    .line 990
    .line 991
    if-gt v13, v15, :cond_23

    .line 992
    .line 993
    move/from16 v50, v13

    .line 994
    .line 995
    add-int/lit8 v13, v9, -0x1

    .line 996
    .line 997
    if-eq v11, v13, :cond_24

    .line 998
    .line 999
    add-int/lit8 v13, v11, 0x1

    .line 1000
    .line 1001
    invoke-virtual {v3}, Lf74;->a()I

    .line 1002
    .line 1003
    .line 1004
    move-result v3

    .line 1005
    sub-int v23, v23, v3

    .line 1006
    .line 1007
    move/from16 v49, p0

    .line 1008
    .line 1009
    move/from16 v18, v13

    .line 1010
    .line 1011
    goto :goto_1b

    .line 1012
    :cond_23
    move/from16 v50, v13

    .line 1013
    .line 1014
    :cond_24
    iget v13, v3, Lf74;->q:I

    .line 1015
    .line 1016
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 1017
    .line 1018
    .line 1019
    move-result v8

    .line 1020
    invoke-virtual {v5, v3}, Lkt;->addLast(Ljava/lang/Object;)V

    .line 1021
    .line 1022
    .line 1023
    :goto_1b
    add-int/lit8 v11, v11, 0x1

    .line 1024
    .line 1025
    move/from16 v3, v20

    .line 1026
    .line 1027
    move/from16 v13, v50

    .line 1028
    .line 1029
    goto :goto_1a

    .line 1030
    :cond_25
    if-ge v13, v0, :cond_28

    .line 1031
    .line 1032
    sub-int v3, v0, v13

    .line 1033
    .line 1034
    sub-int v23, v23, v3

    .line 1035
    .line 1036
    add-int/2addr v13, v3

    .line 1037
    move/from16 v15, v23

    .line 1038
    .line 1039
    :goto_1c
    if-ge v15, v12, :cond_26

    .line 1040
    .line 1041
    if-lez v18, :cond_26

    .line 1042
    .line 1043
    move/from16 v20, v3

    .line 1044
    .line 1045
    add-int/lit8 v3, v18, -0x1

    .line 1046
    .line 1047
    move/from16 v50, v12

    .line 1048
    .line 1049
    invoke-virtual {v14, v3, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v12

    .line 1053
    move/from16 v18, v3

    .line 1054
    .line 1055
    const/4 v3, 0x0

    .line 1056
    invoke-virtual {v5, v3, v12}, Lkt;->add(ILjava/lang/Object;)V

    .line 1057
    .line 1058
    .line 1059
    iget v3, v12, Lf74;->q:I

    .line 1060
    .line 1061
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 1062
    .line 1063
    .line 1064
    move-result v8

    .line 1065
    invoke-virtual {v12}, Lf74;->a()I

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    add-int/2addr v15, v3

    .line 1070
    move/from16 v3, v20

    .line 1071
    .line 1072
    move/from16 v12, v50

    .line 1073
    .line 1074
    goto :goto_1c

    .line 1075
    :cond_26
    move/from16 v20, v3

    .line 1076
    .line 1077
    move/from16 v50, v12

    .line 1078
    .line 1079
    add-int v3, v10, v20

    .line 1080
    .line 1081
    if-gez v15, :cond_27

    .line 1082
    .line 1083
    add-int/2addr v3, v15

    .line 1084
    add-int/2addr v13, v15

    .line 1085
    move/from16 v12, v18

    .line 1086
    .line 1087
    const/4 v15, 0x0

    .line 1088
    goto :goto_1d

    .line 1089
    :cond_27
    move/from16 v12, v18

    .line 1090
    .line 1091
    goto :goto_1d

    .line 1092
    :cond_28
    move/from16 v50, v12

    .line 1093
    .line 1094
    move v3, v10

    .line 1095
    move/from16 v12, v18

    .line 1096
    .line 1097
    move/from16 v15, v23

    .line 1098
    .line 1099
    :goto_1d
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->round(F)I

    .line 1100
    .line 1101
    .line 1102
    move-result v18

    .line 1103
    move/from16 v20, v8

    .line 1104
    .line 1105
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->signum(I)I

    .line 1106
    .line 1107
    .line 1108
    move-result v8

    .line 1109
    move/from16 v52, v9

    .line 1110
    .line 1111
    invoke-static {v3}, Ljava/lang/Integer;->signum(I)I

    .line 1112
    .line 1113
    .line 1114
    move-result v9

    .line 1115
    if-ne v8, v9, :cond_29

    .line 1116
    .line 1117
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->round(F)I

    .line 1118
    .line 1119
    .line 1120
    move-result v8

    .line 1121
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 1122
    .line 1123
    .line 1124
    move-result v8

    .line 1125
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 1126
    .line 1127
    .line 1128
    move-result v9

    .line 1129
    if-lt v8, v9, :cond_29

    .line 1130
    .line 1131
    int-to-float v8, v3

    .line 1132
    goto :goto_1e

    .line 1133
    :cond_29
    move/from16 v8, p1

    .line 1134
    .line 1135
    :goto_1e
    sub-float v9, p1, v8

    .line 1136
    .line 1137
    const/16 v18, 0x0

    .line 1138
    .line 1139
    if-eqz v21, :cond_2a

    .line 1140
    .line 1141
    if-le v3, v10, :cond_2a

    .line 1142
    .line 1143
    cmpg-float v23, v9, v18

    .line 1144
    .line 1145
    if-gtz v23, :cond_2a

    .line 1146
    .line 1147
    sub-int/2addr v3, v10

    .line 1148
    int-to-float v3, v3

    .line 1149
    add-float v18, v3, v9

    .line 1150
    .line 1151
    :cond_2a
    move/from16 v10, v18

    .line 1152
    .line 1153
    if-ltz v15, :cond_2b

    .line 1154
    .line 1155
    goto :goto_1f

    .line 1156
    :cond_2b
    const-string v3, "negative currentFirstItemScrollOffset"

    .line 1157
    .line 1158
    invoke-static {v3}, Lzc3;->a(Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    :goto_1f
    neg-int v3, v15

    .line 1162
    invoke-virtual {v5}, Lkt;->first()Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v9

    .line 1166
    check-cast v9, Lf74;

    .line 1167
    .line 1168
    if-gtz v50, :cond_2c

    .line 1169
    .line 1170
    if-gez v37, :cond_2d

    .line 1171
    .line 1172
    :cond_2c
    move/from16 v18, v3

    .line 1173
    .line 1174
    goto :goto_21

    .line 1175
    :cond_2d
    move/from16 v18, v3

    .line 1176
    .line 1177
    move/from16 v23, v15

    .line 1178
    .line 1179
    :goto_20
    const/4 v3, 0x0

    .line 1180
    goto :goto_23

    .line 1181
    :goto_21
    invoke-virtual {v5}, Lkt;->a()I

    .line 1182
    .line 1183
    .line 1184
    move-result v3

    .line 1185
    move-object/from16 p1, v9

    .line 1186
    .line 1187
    move v9, v15

    .line 1188
    const/4 v15, 0x0

    .line 1189
    :goto_22
    if-ge v15, v3, :cond_2e

    .line 1190
    .line 1191
    invoke-virtual {v5, v15}, Lkt;->get(I)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v23

    .line 1195
    check-cast v23, Lf74;

    .line 1196
    .line 1197
    move/from16 v50, v3

    .line 1198
    .line 1199
    invoke-virtual/range {v23 .. v23}, Lf74;->a()I

    .line 1200
    .line 1201
    .line 1202
    move-result v3

    .line 1203
    if-eqz v9, :cond_2e

    .line 1204
    .line 1205
    if-gt v3, v9, :cond_2e

    .line 1206
    .line 1207
    invoke-virtual {v5}, Lkt;->a()I

    .line 1208
    .line 1209
    .line 1210
    move-result v23

    .line 1211
    move/from16 v53, v3

    .line 1212
    .line 1213
    add-int/lit8 v3, v23, -0x1

    .line 1214
    .line 1215
    if-eq v15, v3, :cond_2e

    .line 1216
    .line 1217
    sub-int v9, v9, v53

    .line 1218
    .line 1219
    add-int/lit8 v15, v15, 0x1

    .line 1220
    .line 1221
    invoke-virtual {v5, v15}, Lkt;->get(I)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    check-cast v3, Lf74;

    .line 1226
    .line 1227
    move-object/from16 p1, v3

    .line 1228
    .line 1229
    move/from16 v3, v50

    .line 1230
    .line 1231
    goto :goto_22

    .line 1232
    :cond_2e
    move/from16 v23, v9

    .line 1233
    .line 1234
    move-object/from16 v9, p1

    .line 1235
    .line 1236
    goto :goto_20

    .line 1237
    :goto_23
    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    .line 1238
    .line 1239
    .line 1240
    move-result v15

    .line 1241
    add-int/lit8 v12, v12, -0x1

    .line 1242
    .line 1243
    if-gt v15, v12, :cond_30

    .line 1244
    .line 1245
    move-object/from16 v3, v35

    .line 1246
    .line 1247
    :goto_24
    if-nez v3, :cond_2f

    .line 1248
    .line 1249
    new-instance v3, Ljava/util/ArrayList;

    .line 1250
    .line 1251
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1252
    .line 1253
    .line 1254
    :cond_2f
    move/from16 p1, v10

    .line 1255
    .line 1256
    invoke-virtual {v14, v12, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v10

    .line 1260
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    if-eq v12, v15, :cond_31

    .line 1264
    .line 1265
    add-int/lit8 v12, v12, -0x1

    .line 1266
    .line 1267
    move/from16 v10, p1

    .line 1268
    .line 1269
    goto :goto_24

    .line 1270
    :cond_30
    move/from16 p1, v10

    .line 1271
    .line 1272
    move-object/from16 v3, v35

    .line 1273
    .line 1274
    :cond_31
    iget-object v10, v4, Luz4;->a:[I

    .line 1275
    .line 1276
    iget v12, v4, Luz4;->b:I

    .line 1277
    .line 1278
    add-int/lit8 v12, v12, -0x1

    .line 1279
    .line 1280
    move-object/from16 v50, v3

    .line 1281
    .line 1282
    :goto_25
    const/4 v3, -0x1

    .line 1283
    if-ge v3, v12, :cond_34

    .line 1284
    .line 1285
    aget v3, v10, v12

    .line 1286
    .line 1287
    if-ge v3, v15, :cond_33

    .line 1288
    .line 1289
    if-nez v50, :cond_32

    .line 1290
    .line 1291
    new-instance v50, Ljava/util/ArrayList;

    .line 1292
    .line 1293
    invoke-direct/range {v50 .. v50}, Ljava/util/ArrayList;-><init>()V

    .line 1294
    .line 1295
    .line 1296
    :cond_32
    move-object/from16 v53, v10

    .line 1297
    .line 1298
    move-object/from16 v10, v50

    .line 1299
    .line 1300
    invoke-virtual {v14, v3, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1305
    .line 1306
    .line 1307
    move-object/from16 v50, v10

    .line 1308
    .line 1309
    goto :goto_26

    .line 1310
    :cond_33
    move-object/from16 v53, v10

    .line 1311
    .line 1312
    :goto_26
    add-int/lit8 v12, v12, -0x1

    .line 1313
    .line 1314
    move-object/from16 v10, v53

    .line 1315
    .line 1316
    goto :goto_25

    .line 1317
    :cond_34
    if-nez v50, :cond_35

    .line 1318
    .line 1319
    move-object/from16 v10, v41

    .line 1320
    .line 1321
    goto :goto_27

    .line 1322
    :cond_35
    move-object/from16 v10, v50

    .line 1323
    .line 1324
    :goto_27
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1325
    .line 1326
    .line 1327
    move-result v12

    .line 1328
    move/from16 v15, v20

    .line 1329
    .line 1330
    const/4 v3, 0x0

    .line 1331
    :goto_28
    if-ge v3, v12, :cond_36

    .line 1332
    .line 1333
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v20

    .line 1337
    move/from16 v53, v3

    .line 1338
    .line 1339
    move-object/from16 v3, v20

    .line 1340
    .line 1341
    check-cast v3, Lf74;

    .line 1342
    .line 1343
    iget v3, v3, Lf74;->q:I

    .line 1344
    .line 1345
    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    .line 1346
    .line 1347
    .line 1348
    move-result v15

    .line 1349
    add-int/lit8 v3, v53, 0x1

    .line 1350
    .line 1351
    goto :goto_28

    .line 1352
    :cond_36
    invoke-static {v5}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    check-cast v3, Lf74;

    .line 1357
    .line 1358
    iget v3, v3, Lf74;->a:I

    .line 1359
    .line 1360
    add-int/lit8 v12, v52, -0x1

    .line 1361
    .line 1362
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    .line 1363
    .line 1364
    .line 1365
    move-result v3

    .line 1366
    invoke-static {v5}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v12

    .line 1370
    check-cast v12, Lf74;

    .line 1371
    .line 1372
    iget v12, v12, Lf74;->a:I

    .line 1373
    .line 1374
    add-int/lit8 v12, v12, 0x1

    .line 1375
    .line 1376
    if-gt v12, v3, :cond_38

    .line 1377
    .line 1378
    move-object/from16 v20, v35

    .line 1379
    .line 1380
    :goto_29
    if-nez v20, :cond_37

    .line 1381
    .line 1382
    new-instance v20, Ljava/util/ArrayList;

    .line 1383
    .line 1384
    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    .line 1385
    .line 1386
    .line 1387
    :cond_37
    move/from16 v54, v11

    .line 1388
    .line 1389
    move/from16 v53, v15

    .line 1390
    .line 1391
    move-object/from16 v15, v20

    .line 1392
    .line 1393
    invoke-virtual {v14, v12, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v11

    .line 1397
    invoke-interface {v15, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    if-eq v12, v3, :cond_39

    .line 1401
    .line 1402
    add-int/lit8 v12, v12, 0x1

    .line 1403
    .line 1404
    move-object/from16 v20, v15

    .line 1405
    .line 1406
    move/from16 v15, v53

    .line 1407
    .line 1408
    move/from16 v11, v54

    .line 1409
    .line 1410
    goto :goto_29

    .line 1411
    :cond_38
    move/from16 v54, v11

    .line 1412
    .line 1413
    move/from16 v53, v15

    .line 1414
    .line 1415
    move-object/from16 v15, v35

    .line 1416
    .line 1417
    :cond_39
    if-eqz v15, :cond_3a

    .line 1418
    .line 1419
    invoke-static {v15}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v11

    .line 1423
    check-cast v11, Lf74;

    .line 1424
    .line 1425
    iget v11, v11, Lf74;->a:I

    .line 1426
    .line 1427
    if-le v11, v3, :cond_3a

    .line 1428
    .line 1429
    invoke-static {v15}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    check-cast v3, Lf74;

    .line 1434
    .line 1435
    iget v3, v3, Lf74;->a:I

    .line 1436
    .line 1437
    :cond_3a
    iget-object v11, v4, Luz4;->a:[I

    .line 1438
    .line 1439
    iget v4, v4, Luz4;->b:I

    .line 1440
    .line 1441
    const/4 v12, 0x0

    .line 1442
    :goto_2a
    if-ge v12, v4, :cond_3d

    .line 1443
    .line 1444
    move/from16 v20, v4

    .line 1445
    .line 1446
    aget v4, v11, v12

    .line 1447
    .line 1448
    if-le v4, v3, :cond_3c

    .line 1449
    .line 1450
    if-nez v15, :cond_3b

    .line 1451
    .line 1452
    new-instance v15, Ljava/util/ArrayList;

    .line 1453
    .line 1454
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1455
    .line 1456
    .line 1457
    :cond_3b
    invoke-virtual {v14, v4, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v4

    .line 1461
    invoke-interface {v15, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1462
    .line 1463
    .line 1464
    :cond_3c
    add-int/lit8 v12, v12, 0x1

    .line 1465
    .line 1466
    move/from16 v4, v20

    .line 1467
    .line 1468
    goto :goto_2a

    .line 1469
    :cond_3d
    if-nez v15, :cond_3e

    .line 1470
    .line 1471
    move-object/from16 v15, v41

    .line 1472
    .line 1473
    :cond_3e
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 1474
    .line 1475
    .line 1476
    move-result v3

    .line 1477
    move/from16 v11, v53

    .line 1478
    .line 1479
    const/4 v4, 0x0

    .line 1480
    :goto_2b
    if-ge v4, v3, :cond_3f

    .line 1481
    .line 1482
    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v12

    .line 1486
    check-cast v12, Lf74;

    .line 1487
    .line 1488
    iget v12, v12, Lf74;->q:I

    .line 1489
    .line 1490
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    .line 1491
    .line 1492
    .line 1493
    move-result v11

    .line 1494
    add-int/lit8 v4, v4, 0x1

    .line 1495
    .line 1496
    goto :goto_2b

    .line 1497
    :cond_3f
    invoke-virtual {v5}, Lkt;->first()Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    invoke-static {v9, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1502
    .line 1503
    .line 1504
    move-result v3

    .line 1505
    if-eqz v3, :cond_40

    .line 1506
    .line 1507
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1508
    .line 1509
    .line 1510
    move-result v3

    .line 1511
    if-eqz v3, :cond_40

    .line 1512
    .line 1513
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 1514
    .line 1515
    .line 1516
    move-result v3

    .line 1517
    if-eqz v3, :cond_40

    .line 1518
    .line 1519
    move/from16 v3, p0

    .line 1520
    .line 1521
    goto :goto_2c

    .line 1522
    :cond_40
    const/4 v3, 0x0

    .line 1523
    :goto_2c
    invoke-static {v11, v6, v7}, Ls31;->g(IJ)I

    .line 1524
    .line 1525
    .line 1526
    move-result v4

    .line 1527
    invoke-static {v13, v6, v7}, Ls31;->f(IJ)I

    .line 1528
    .line 1529
    .line 1530
    move-result v11

    .line 1531
    invoke-static {v11, v0}, Ljava/lang/Math;->min(II)I

    .line 1532
    .line 1533
    .line 1534
    move-result v12

    .line 1535
    if-ge v13, v12, :cond_41

    .line 1536
    .line 1537
    move/from16 v12, p0

    .line 1538
    .line 1539
    goto :goto_2d

    .line 1540
    :cond_41
    const/4 v12, 0x0

    .line 1541
    :goto_2d
    if-eqz v12, :cond_43

    .line 1542
    .line 1543
    if-nez v18, :cond_42

    .line 1544
    .line 1545
    goto :goto_2e

    .line 1546
    :cond_42
    const-string v20, "non-zero itemsScrollOffset"

    .line 1547
    .line 1548
    invoke-static/range {v20 .. v20}, Lzc3;->c(Ljava/lang/String;)V

    .line 1549
    .line 1550
    .line 1551
    :cond_43
    :goto_2e
    move/from16 v53, v3

    .line 1552
    .line 1553
    new-instance v3, Ljava/util/ArrayList;

    .line 1554
    .line 1555
    invoke-virtual {v5}, Lkt;->a()I

    .line 1556
    .line 1557
    .line 1558
    move-result v20

    .line 1559
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1560
    .line 1561
    .line 1562
    move-result v55

    .line 1563
    add-int v55, v55, v20

    .line 1564
    .line 1565
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1566
    .line 1567
    .line 1568
    move-result v20

    .line 1569
    move-object/from16 v56, v9

    .line 1570
    .line 1571
    add-int v9, v20, v55

    .line 1572
    .line 1573
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1574
    .line 1575
    .line 1576
    if-eqz v12, :cond_4a

    .line 1577
    .line 1578
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1579
    .line 1580
    .line 1581
    move-result v9

    .line 1582
    if-eqz v9, :cond_44

    .line 1583
    .line 1584
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 1585
    .line 1586
    .line 1587
    move-result v9

    .line 1588
    if-eqz v9, :cond_44

    .line 1589
    .line 1590
    goto :goto_2f

    .line 1591
    :cond_44
    const-string v9, "no extra items"

    .line 1592
    .line 1593
    invoke-static {v9}, Lzc3;->a(Ljava/lang/String;)V

    .line 1594
    .line 1595
    .line 1596
    :goto_2f
    invoke-virtual {v5}, Lkt;->a()I

    .line 1597
    .line 1598
    .line 1599
    move-result v9

    .line 1600
    new-array v10, v9, [I

    .line 1601
    .line 1602
    const/4 v12, 0x0

    .line 1603
    :goto_30
    if-ge v12, v9, :cond_45

    .line 1604
    .line 1605
    invoke-virtual {v5, v12}, Lkt;->get(I)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v15

    .line 1609
    check-cast v15, Lf74;

    .line 1610
    .line 1611
    iget v15, v15, Lf74;->n:I

    .line 1612
    .line 1613
    aput v15, v10, v12

    .line 1614
    .line 1615
    add-int/lit8 v12, v12, 0x1

    .line 1616
    .line 1617
    goto :goto_30

    .line 1618
    :cond_45
    new-array v12, v9, [I

    .line 1619
    .line 1620
    if-eqz v17, :cond_49

    .line 1621
    .line 1622
    move-object/from16 v15, v17

    .line 1623
    .line 1624
    move/from16 v17, v9

    .line 1625
    .line 1626
    move-object v9, v15

    .line 1627
    move-object/from16 v15, v51

    .line 1628
    .line 1629
    invoke-interface {v9, v11, v15, v10, v12}, Lgt;->e(ILzr4;[I[I)V

    .line 1630
    .line 1631
    .line 1632
    new-instance v9, Lkf3;

    .line 1633
    .line 1634
    add-int/lit8 v10, v17, -0x1

    .line 1635
    .line 1636
    move-object/from16 v17, v12

    .line 1637
    .line 1638
    move/from16 v20, v13

    .line 1639
    .line 1640
    const/4 v13, 0x0

    .line 1641
    move/from16 v12, p0

    .line 1642
    .line 1643
    invoke-direct {v9, v13, v10, v12}, Lif3;-><init>(III)V

    .line 1644
    .line 1645
    .line 1646
    iget v10, v9, Lif3;->Y:I

    .line 1647
    .line 1648
    iget v9, v9, Lif3;->Z:I

    .line 1649
    .line 1650
    if-lez v9, :cond_46

    .line 1651
    .line 1652
    if-gez v10, :cond_47

    .line 1653
    .line 1654
    :cond_46
    if-gez v9, :cond_48

    .line 1655
    .line 1656
    if-gtz v10, :cond_48

    .line 1657
    .line 1658
    :cond_47
    const/4 v12, 0x0

    .line 1659
    :goto_31
    aget v13, v17, v12

    .line 1660
    .line 1661
    invoke-virtual {v5, v12}, Lkt;->get(I)Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v16

    .line 1665
    move/from16 v18, v9

    .line 1666
    .line 1667
    move-object/from16 v9, v16

    .line 1668
    .line 1669
    check-cast v9, Lf74;

    .line 1670
    .line 1671
    invoke-virtual {v9, v13, v4, v11}, Lf74;->d(III)V

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    if-eq v12, v10, :cond_48

    .line 1678
    .line 1679
    add-int v12, v12, v18

    .line 1680
    .line 1681
    move/from16 v9, v18

    .line 1682
    .line 1683
    goto :goto_31

    .line 1684
    :cond_48
    move-object v13, v15

    .line 1685
    goto/16 :goto_35

    .line 1686
    .line 1687
    :cond_49
    invoke-static/range {v16 .. v16}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v0

    .line 1691
    throw v0

    .line 1692
    :cond_4a
    move/from16 v20, v13

    .line 1693
    .line 1694
    move-object/from16 v13, v51

    .line 1695
    .line 1696
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1697
    .line 1698
    .line 1699
    move-result v9

    .line 1700
    move/from16 v16, v18

    .line 1701
    .line 1702
    const/4 v12, 0x0

    .line 1703
    :goto_32
    if-ge v12, v9, :cond_4b

    .line 1704
    .line 1705
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v17

    .line 1709
    move/from16 v51, v9

    .line 1710
    .line 1711
    move-object/from16 v9, v17

    .line 1712
    .line 1713
    check-cast v9, Lf74;

    .line 1714
    .line 1715
    invoke-virtual {v9}, Lf74;->a()I

    .line 1716
    .line 1717
    .line 1718
    move-result v17

    .line 1719
    move-object/from16 v55, v10

    .line 1720
    .line 1721
    sub-int v10, v16, v17

    .line 1722
    .line 1723
    invoke-virtual {v9, v10, v4, v11}, Lf74;->d(III)V

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1727
    .line 1728
    .line 1729
    add-int/lit8 v12, v12, 0x1

    .line 1730
    .line 1731
    move/from16 v16, v10

    .line 1732
    .line 1733
    move/from16 v9, v51

    .line 1734
    .line 1735
    move-object/from16 v10, v55

    .line 1736
    .line 1737
    goto :goto_32

    .line 1738
    :cond_4b
    invoke-virtual {v5}, Lkt;->a()I

    .line 1739
    .line 1740
    .line 1741
    move-result v9

    .line 1742
    move/from16 v10, v18

    .line 1743
    .line 1744
    const/4 v12, 0x0

    .line 1745
    :goto_33
    if-ge v12, v9, :cond_4c

    .line 1746
    .line 1747
    invoke-virtual {v5, v12}, Lkt;->get(I)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v16

    .line 1751
    move/from16 v17, v9

    .line 1752
    .line 1753
    move-object/from16 v9, v16

    .line 1754
    .line 1755
    check-cast v9, Lf74;

    .line 1756
    .line 1757
    invoke-virtual {v9, v10, v4, v11}, Lf74;->d(III)V

    .line 1758
    .line 1759
    .line 1760
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual {v9}, Lf74;->a()I

    .line 1764
    .line 1765
    .line 1766
    move-result v9

    .line 1767
    add-int/2addr v10, v9

    .line 1768
    add-int/lit8 v12, v12, 0x1

    .line 1769
    .line 1770
    move/from16 v9, v17

    .line 1771
    .line 1772
    goto :goto_33

    .line 1773
    :cond_4c
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 1774
    .line 1775
    .line 1776
    move-result v9

    .line 1777
    move v12, v10

    .line 1778
    const/4 v10, 0x0

    .line 1779
    :goto_34
    if-ge v10, v9, :cond_4d

    .line 1780
    .line 1781
    invoke-interface {v15, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v16

    .line 1785
    move/from16 v17, v9

    .line 1786
    .line 1787
    move-object/from16 v9, v16

    .line 1788
    .line 1789
    check-cast v9, Lf74;

    .line 1790
    .line 1791
    invoke-virtual {v9, v12, v4, v11}, Lf74;->d(III)V

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v9}, Lf74;->a()I

    .line 1798
    .line 1799
    .line 1800
    move-result v9

    .line 1801
    add-int/2addr v12, v9

    .line 1802
    add-int/lit8 v10, v10, 0x1

    .line 1803
    .line 1804
    move/from16 v9, v17

    .line 1805
    .line 1806
    goto :goto_34

    .line 1807
    :cond_4d
    :goto_35
    float-to-int v15, v8

    .line 1808
    move/from16 v16, v20

    .line 1809
    .line 1810
    move-object/from16 v20, v14

    .line 1811
    .line 1812
    move-object/from16 v14, v24

    .line 1813
    .line 1814
    move/from16 v24, v16

    .line 1815
    .line 1816
    move-object/from16 v18, v3

    .line 1817
    .line 1818
    move/from16 v16, v4

    .line 1819
    .line 1820
    move/from16 v17, v11

    .line 1821
    .line 1822
    invoke-virtual/range {v14 .. v26}, Ld64;->c(IIILjava/util/ArrayList;Lne;Lc74;ZZIILb71;Lvt2;)V

    .line 1823
    .line 1824
    .line 1825
    move-object v15, v14

    .line 1826
    move-object/from16 v10, v18

    .line 1827
    .line 1828
    move-object/from16 v14, v20

    .line 1829
    .line 1830
    move/from16 v3, v21

    .line 1831
    .line 1832
    move/from16 v9, v24

    .line 1833
    .line 1834
    if-nez v3, :cond_4f

    .line 1835
    .line 1836
    move-object/from16 v51, v13

    .line 1837
    .line 1838
    invoke-virtual {v15}, Ld64;->a()J

    .line 1839
    .line 1840
    .line 1841
    move-result-wide v12

    .line 1842
    move v15, v8

    .line 1843
    move/from16 v20, v9

    .line 1844
    .line 1845
    const-wide/16 v8, 0x0

    .line 1846
    .line 1847
    invoke-static {v12, v13, v8, v9}, Lpf3;->a(JJ)Z

    .line 1848
    .line 1849
    .line 1850
    move-result v8

    .line 1851
    if-nez v8, :cond_50

    .line 1852
    .line 1853
    shr-long v8, v12, v27

    .line 1854
    .line 1855
    long-to-int v8, v8

    .line 1856
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    .line 1857
    .line 1858
    .line 1859
    move-result v4

    .line 1860
    invoke-static {v4, v6, v7}, Ls31;->g(IJ)I

    .line 1861
    .line 1862
    .line 1863
    move-result v4

    .line 1864
    and-long v8, v12, v28

    .line 1865
    .line 1866
    long-to-int v8, v8

    .line 1867
    invoke-static {v11, v8}, Ljava/lang/Math;->max(II)I

    .line 1868
    .line 1869
    .line 1870
    move-result v8

    .line 1871
    invoke-static {v8, v6, v7}, Ls31;->f(IJ)I

    .line 1872
    .line 1873
    .line 1874
    move-result v6

    .line 1875
    if-eq v6, v11, :cond_4e

    .line 1876
    .line 1877
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1878
    .line 1879
    .line 1880
    move-result v7

    .line 1881
    const/4 v8, 0x0

    .line 1882
    :goto_36
    if-ge v8, v7, :cond_4e

    .line 1883
    .line 1884
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v9

    .line 1888
    check-cast v9, Lf74;

    .line 1889
    .line 1890
    iput v6, v9, Lf74;->s:I

    .line 1891
    .line 1892
    iget v11, v9, Lf74;->f:I

    .line 1893
    .line 1894
    add-int/2addr v11, v6

    .line 1895
    iput v11, v9, Lf74;->u:I

    .line 1896
    .line 1897
    add-int/lit8 v8, v8, 0x1

    .line 1898
    .line 1899
    goto :goto_36

    .line 1900
    :cond_4e
    move v11, v6

    .line 1901
    goto :goto_37

    .line 1902
    :cond_4f
    move v15, v8

    .line 1903
    move/from16 v20, v9

    .line 1904
    .line 1905
    move-object/from16 v51, v13

    .line 1906
    .line 1907
    :cond_50
    :goto_37
    invoke-virtual {v5}, Lkt;->isEmpty()Z

    .line 1908
    .line 1909
    .line 1910
    move-result v6

    .line 1911
    if-eqz v6, :cond_51

    .line 1912
    .line 1913
    move-object/from16 v6, v35

    .line 1914
    .line 1915
    goto :goto_38

    .line 1916
    :cond_51
    iget-object v6, v5, Lkt;->Y:[Ljava/lang/Object;

    .line 1917
    .line 1918
    iget v7, v5, Lkt;->X:I

    .line 1919
    .line 1920
    aget-object v6, v6, v7

    .line 1921
    .line 1922
    :goto_38
    check-cast v6, Lf74;

    .line 1923
    .line 1924
    if-eqz v6, :cond_52

    .line 1925
    .line 1926
    iget v6, v6, Lf74;->a:I

    .line 1927
    .line 1928
    goto :goto_39

    .line 1929
    :cond_52
    const/4 v6, 0x0

    .line 1930
    :goto_39
    invoke-virtual {v5}, Lkt;->h()Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v7

    .line 1934
    check-cast v7, Lf74;

    .line 1935
    .line 1936
    if-eqz v7, :cond_53

    .line 1937
    .line 1938
    iget v7, v7, Lf74;->a:I

    .line 1939
    .line 1940
    :goto_3a
    move-object/from16 v8, v39

    .line 1941
    .line 1942
    goto :goto_3b

    .line 1943
    :cond_53
    const/4 v7, 0x0

    .line 1944
    goto :goto_3a

    .line 1945
    :goto_3b
    iget-object v8, v8, Lz64;->b:Ly64;

    .line 1946
    .line 1947
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1948
    .line 1949
    .line 1950
    sget-object v8, Lef3;->a:Luz4;

    .line 1951
    .line 1952
    if-eqz v38, :cond_66

    .line 1953
    .line 1954
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1955
    .line 1956
    .line 1957
    move-result v9

    .line 1958
    if-nez v9, :cond_66

    .line 1959
    .line 1960
    iget v9, v8, Luz4;->b:I

    .line 1961
    .line 1962
    if-eqz v9, :cond_66

    .line 1963
    .line 1964
    sub-int/2addr v7, v6

    .line 1965
    if-ltz v7, :cond_58

    .line 1966
    .line 1967
    if-nez v9, :cond_54

    .line 1968
    .line 1969
    goto :goto_3e

    .line 1970
    :cond_54
    const/4 v13, 0x0

    .line 1971
    invoke-static {v13, v9}, Lx97;->a0(II)Lkf3;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v7

    .line 1975
    iget v9, v7, Lif3;->X:I

    .line 1976
    .line 1977
    iget v7, v7, Lif3;->Y:I

    .line 1978
    .line 1979
    if-gt v9, v7, :cond_56

    .line 1980
    .line 1981
    const/4 v12, -0x1

    .line 1982
    :goto_3c
    invoke-virtual {v8, v9}, Luz4;->c(I)I

    .line 1983
    .line 1984
    .line 1985
    move-result v13

    .line 1986
    if-gt v13, v6, :cond_55

    .line 1987
    .line 1988
    invoke-virtual {v8, v9}, Luz4;->c(I)I

    .line 1989
    .line 1990
    .line 1991
    move-result v12

    .line 1992
    if-eq v9, v7, :cond_55

    .line 1993
    .line 1994
    add-int/lit8 v9, v9, 0x1

    .line 1995
    .line 1996
    goto :goto_3c

    .line 1997
    :cond_55
    const/4 v6, -0x1

    .line 1998
    goto :goto_3d

    .line 1999
    :cond_56
    const/4 v6, -0x1

    .line 2000
    const/4 v12, -0x1

    .line 2001
    :goto_3d
    if-ne v12, v6, :cond_57

    .line 2002
    .line 2003
    sget-object v6, Lef3;->a:Luz4;

    .line 2004
    .line 2005
    goto :goto_3f

    .line 2006
    :cond_57
    new-instance v6, Luz4;

    .line 2007
    .line 2008
    const/4 v7, 0x1

    .line 2009
    invoke-direct {v6, v7}, Luz4;-><init>(I)V

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v6, v12}, Luz4;->a(I)V

    .line 2013
    .line 2014
    .line 2015
    goto :goto_3f

    .line 2016
    :cond_58
    :goto_3e
    move-object v6, v8

    .line 2017
    :goto_3f
    new-instance v7, Ljava/util/ArrayList;

    .line 2018
    .line 2019
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2020
    .line 2021
    .line 2022
    new-instance v9, Ljava/util/ArrayList;

    .line 2023
    .line 2024
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 2025
    .line 2026
    .line 2027
    move-result v12

    .line 2028
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 2032
    .line 2033
    .line 2034
    move-result v12

    .line 2035
    const/4 v13, 0x0

    .line 2036
    :goto_40
    if-ge v13, v12, :cond_5b

    .line 2037
    .line 2038
    move/from16 v16, v12

    .line 2039
    .line 2040
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v12

    .line 2044
    move/from16 v17, v13

    .line 2045
    .line 2046
    move-object v13, v12

    .line 2047
    check-cast v13, Lf74;

    .line 2048
    .line 2049
    iget v13, v13, Lf74;->a:I

    .line 2050
    .line 2051
    move/from16 v18, v15

    .line 2052
    .line 2053
    iget-object v15, v8, Luz4;->a:[I

    .line 2054
    .line 2055
    move-object/from16 v19, v15

    .line 2056
    .line 2057
    iget v15, v8, Luz4;->b:I

    .line 2058
    .line 2059
    move-object/from16 v21, v8

    .line 2060
    .line 2061
    const/4 v8, 0x0

    .line 2062
    :goto_41
    if-ge v8, v15, :cond_5a

    .line 2063
    .line 2064
    move/from16 v22, v8

    .line 2065
    .line 2066
    aget v8, v19, v22

    .line 2067
    .line 2068
    if-ne v8, v13, :cond_59

    .line 2069
    .line 2070
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2071
    .line 2072
    .line 2073
    goto :goto_42

    .line 2074
    :cond_59
    add-int/lit8 v8, v22, 0x1

    .line 2075
    .line 2076
    goto :goto_41

    .line 2077
    :cond_5a
    :goto_42
    add-int/lit8 v13, v17, 0x1

    .line 2078
    .line 2079
    move/from16 v12, v16

    .line 2080
    .line 2081
    move/from16 v15, v18

    .line 2082
    .line 2083
    move-object/from16 v8, v21

    .line 2084
    .line 2085
    goto :goto_40

    .line 2086
    :cond_5b
    move/from16 v18, v15

    .line 2087
    .line 2088
    iget-object v8, v6, Luz4;->a:[I

    .line 2089
    .line 2090
    iget v6, v6, Luz4;->b:I

    .line 2091
    .line 2092
    const/4 v12, 0x0

    .line 2093
    :goto_43
    if-ge v12, v6, :cond_65

    .line 2094
    .line 2095
    aget v13, v8, v12

    .line 2096
    .line 2097
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v15

    .line 2101
    const/16 v16, 0x0

    .line 2102
    .line 2103
    :goto_44
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 2104
    .line 2105
    .line 2106
    move-result v17

    .line 2107
    if-eqz v17, :cond_5d

    .line 2108
    .line 2109
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v17

    .line 2113
    move/from16 v19, v6

    .line 2114
    .line 2115
    move-object/from16 v6, v17

    .line 2116
    .line 2117
    check-cast v6, Lf74;

    .line 2118
    .line 2119
    iget v6, v6, Lf74;->a:I

    .line 2120
    .line 2121
    if-ne v6, v13, :cond_5c

    .line 2122
    .line 2123
    move/from16 v6, v16

    .line 2124
    .line 2125
    :goto_45
    const/4 v15, -0x1

    .line 2126
    goto :goto_46

    .line 2127
    :cond_5c
    add-int/lit8 v16, v16, 0x1

    .line 2128
    .line 2129
    move/from16 v6, v19

    .line 2130
    .line 2131
    goto :goto_44

    .line 2132
    :cond_5d
    move/from16 v19, v6

    .line 2133
    .line 2134
    const/4 v6, -0x1

    .line 2135
    goto :goto_45

    .line 2136
    :goto_46
    if-ne v6, v15, :cond_5e

    .line 2137
    .line 2138
    invoke-virtual {v14, v13, v1, v2}, Lc74;->a(IJ)Lf74;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v16

    .line 2142
    :goto_47
    move-object/from16 v17, v16

    .line 2143
    .line 2144
    goto :goto_48

    .line 2145
    :cond_5e
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v16

    .line 2149
    check-cast v16, Lf74;

    .line 2150
    .line 2151
    goto :goto_47

    .line 2152
    :goto_48
    invoke-static/range {v17 .. v17}, Lz39;->B(Lf74;)I

    .line 2153
    .line 2154
    .line 2155
    move-result v16

    .line 2156
    move-wide/from16 v21, v1

    .line 2157
    .line 2158
    if-ne v6, v15, :cond_5f

    .line 2159
    .line 2160
    const/high16 v1, -0x80000000

    .line 2161
    .line 2162
    goto :goto_49

    .line 2163
    :cond_5f
    move-object/from16 v2, v17

    .line 2164
    .line 2165
    const/4 v6, 0x0

    .line 2166
    invoke-virtual {v2, v6}, Lf74;->b(I)J

    .line 2167
    .line 2168
    .line 2169
    move-result-wide v26

    .line 2170
    and-long v1, v26, v28

    .line 2171
    .line 2172
    long-to-int v1, v1

    .line 2173
    :goto_49
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 2174
    .line 2175
    .line 2176
    move-result v2

    .line 2177
    const/4 v6, 0x0

    .line 2178
    :goto_4a
    if-ge v6, v2, :cond_61

    .line 2179
    .line 2180
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v26

    .line 2184
    move-object/from16 v15, v26

    .line 2185
    .line 2186
    check-cast v15, Lf74;

    .line 2187
    .line 2188
    iget v15, v15, Lf74;->a:I

    .line 2189
    .line 2190
    if-eq v15, v13, :cond_60

    .line 2191
    .line 2192
    goto :goto_4b

    .line 2193
    :cond_60
    add-int/lit8 v6, v6, 0x1

    .line 2194
    .line 2195
    const/4 v15, -0x1

    .line 2196
    goto :goto_4a

    .line 2197
    :cond_61
    move-object/from16 v26, v35

    .line 2198
    .line 2199
    :goto_4b
    move-object/from16 v2, v26

    .line 2200
    .line 2201
    check-cast v2, Lf74;

    .line 2202
    .line 2203
    if-eqz v2, :cond_62

    .line 2204
    .line 2205
    const/4 v13, 0x0

    .line 2206
    invoke-virtual {v2, v13}, Lf74;->b(I)J

    .line 2207
    .line 2208
    .line 2209
    move-result-wide v26

    .line 2210
    move-object v6, v8

    .line 2211
    move-object v2, v9

    .line 2212
    and-long v8, v26, v28

    .line 2213
    .line 2214
    long-to-int v8, v8

    .line 2215
    :goto_4c
    const/high16 v9, -0x80000000

    .line 2216
    .line 2217
    goto :goto_4d

    .line 2218
    :cond_62
    move-object v6, v8

    .line 2219
    move-object v2, v9

    .line 2220
    const/high16 v8, -0x80000000

    .line 2221
    .line 2222
    goto :goto_4c

    .line 2223
    :goto_4d
    if-ne v1, v9, :cond_63

    .line 2224
    .line 2225
    move/from16 v1, v48

    .line 2226
    .line 2227
    move v13, v1

    .line 2228
    goto :goto_4e

    .line 2229
    :cond_63
    move/from16 v13, v48

    .line 2230
    .line 2231
    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    .line 2232
    .line 2233
    .line 2234
    move-result v1

    .line 2235
    :goto_4e
    if-eq v8, v9, :cond_64

    .line 2236
    .line 2237
    sub-int v8, v8, v16

    .line 2238
    .line 2239
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 2240
    .line 2241
    .line 2242
    move-result v1

    .line 2243
    :cond_64
    move-object/from16 v8, v17

    .line 2244
    .line 2245
    const/4 v9, 0x1

    .line 2246
    iput-boolean v9, v8, Lf74;->r:Z

    .line 2247
    .line 2248
    invoke-virtual {v8, v1, v4, v11}, Lf74;->d(III)V

    .line 2249
    .line 2250
    .line 2251
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2252
    .line 2253
    .line 2254
    add-int/lit8 v12, v12, 0x1

    .line 2255
    .line 2256
    move-object v9, v2

    .line 2257
    move-object v8, v6

    .line 2258
    move/from16 v48, v13

    .line 2259
    .line 2260
    move/from16 v6, v19

    .line 2261
    .line 2262
    move-wide/from16 v1, v21

    .line 2263
    .line 2264
    goto/16 :goto_43

    .line 2265
    .line 2266
    :cond_65
    move/from16 v13, v48

    .line 2267
    .line 2268
    const/4 v9, 0x1

    .line 2269
    goto :goto_4f

    .line 2270
    :cond_66
    move/from16 v18, v15

    .line 2271
    .line 2272
    move/from16 v13, v48

    .line 2273
    .line 2274
    const/4 v9, 0x1

    .line 2275
    move-object/from16 v7, v41

    .line 2276
    .line 2277
    :goto_4f
    if-eqz v53, :cond_68

    .line 2278
    .line 2279
    invoke-static {v10}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v1

    .line 2283
    check-cast v1, Lf74;

    .line 2284
    .line 2285
    if-eqz v1, :cond_67

    .line 2286
    .line 2287
    iget v1, v1, Lf74;->a:I

    .line 2288
    .line 2289
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v1

    .line 2293
    goto :goto_51

    .line 2294
    :cond_67
    move-object/from16 v1, v35

    .line 2295
    .line 2296
    goto :goto_51

    .line 2297
    :cond_68
    invoke-virtual {v5}, Lkt;->isEmpty()Z

    .line 2298
    .line 2299
    .line 2300
    move-result v1

    .line 2301
    if-eqz v1, :cond_69

    .line 2302
    .line 2303
    move-object/from16 v1, v35

    .line 2304
    .line 2305
    goto :goto_50

    .line 2306
    :cond_69
    iget-object v1, v5, Lkt;->Y:[Ljava/lang/Object;

    .line 2307
    .line 2308
    iget v2, v5, Lkt;->X:I

    .line 2309
    .line 2310
    aget-object v1, v1, v2

    .line 2311
    .line 2312
    :goto_50
    check-cast v1, Lf74;

    .line 2313
    .line 2314
    if-eqz v1, :cond_67

    .line 2315
    .line 2316
    iget v1, v1, Lf74;->a:I

    .line 2317
    .line 2318
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v1

    .line 2322
    :goto_51
    if-eqz v53, :cond_6b

    .line 2323
    .line 2324
    invoke-static {v10}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v2

    .line 2328
    check-cast v2, Lf74;

    .line 2329
    .line 2330
    if-eqz v2, :cond_6a

    .line 2331
    .line 2332
    iget v2, v2, Lf74;->a:I

    .line 2333
    .line 2334
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v35

    .line 2338
    :cond_6a
    :goto_52
    move/from16 v2, v52

    .line 2339
    .line 2340
    move/from16 v5, v54

    .line 2341
    .line 2342
    goto :goto_53

    .line 2343
    :cond_6b
    invoke-virtual {v5}, Lkt;->h()Ljava/lang/Object;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v2

    .line 2347
    check-cast v2, Lf74;

    .line 2348
    .line 2349
    if-eqz v2, :cond_6a

    .line 2350
    .line 2351
    iget v2, v2, Lf74;->a:I

    .line 2352
    .line 2353
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v35

    .line 2357
    goto :goto_52

    .line 2358
    :goto_53
    if-lt v5, v2, :cond_6d

    .line 2359
    .line 2360
    move/from16 v5, v20

    .line 2361
    .line 2362
    if-le v5, v0, :cond_6c

    .line 2363
    .line 2364
    goto :goto_54

    .line 2365
    :cond_6c
    const/4 v9, 0x0

    .line 2366
    :cond_6d
    :goto_54
    new-instance v0, Lkg;

    .line 2367
    .line 2368
    move-object/from16 v5, v46

    .line 2369
    .line 2370
    invoke-direct {v0, v5, v10, v7, v3}, Lkg;-><init>(Ly05;Ljava/util/ArrayList;Ljava/util/List;Z)V

    .line 2371
    .line 2372
    .line 2373
    add-int v4, v4, v32

    .line 2374
    .line 2375
    move-wide/from16 v5, v44

    .line 2376
    .line 2377
    invoke-static {v4, v5, v6}, Ls31;->g(IJ)I

    .line 2378
    .line 2379
    .line 2380
    move-result v3

    .line 2381
    add-int v11, v11, v31

    .line 2382
    .line 2383
    invoke-static {v11, v5, v6}, Ls31;->f(IJ)I

    .line 2384
    .line 2385
    .line 2386
    move-result v4

    .line 2387
    move-object/from16 v5, v42

    .line 2388
    .line 2389
    move-object/from16 v11, v43

    .line 2390
    .line 2391
    invoke-interface {v5, v3, v4, v11, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v0

    .line 2395
    if-eqz v1, :cond_6e

    .line 2396
    .line 2397
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2398
    .line 2399
    .line 2400
    move-result v1

    .line 2401
    goto :goto_55

    .line 2402
    :cond_6e
    const/4 v1, 0x0

    .line 2403
    :goto_55
    if-eqz v35, :cond_6f

    .line 2404
    .line 2405
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Integer;->intValue()I

    .line 2406
    .line 2407
    .line 2408
    move-result v3

    .line 2409
    goto :goto_56

    .line 2410
    :cond_6f
    const/4 v3, 0x0

    .line 2411
    :goto_56
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2412
    .line 2413
    .line 2414
    move-result v4

    .line 2415
    if-eqz v4, :cond_70

    .line 2416
    .line 2417
    move-object/from16 v17, v41

    .line 2418
    .line 2419
    goto :goto_58

    .line 2420
    :cond_70
    new-instance v4, Ljava/util/ArrayList;

    .line 2421
    .line 2422
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2423
    .line 2424
    .line 2425
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 2426
    .line 2427
    .line 2428
    move-result v6

    .line 2429
    const/4 v8, 0x0

    .line 2430
    :goto_57
    if-ge v8, v6, :cond_72

    .line 2431
    .line 2432
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v11

    .line 2436
    check-cast v11, Lf74;

    .line 2437
    .line 2438
    iget v12, v11, Lf74;->a:I

    .line 2439
    .line 2440
    if-gt v1, v12, :cond_71

    .line 2441
    .line 2442
    if-gt v12, v3, :cond_71

    .line 2443
    .line 2444
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2445
    .line 2446
    .line 2447
    :cond_71
    add-int/lit8 v8, v8, 0x1

    .line 2448
    .line 2449
    goto :goto_57

    .line 2450
    :cond_72
    sget-object v1, Lz39;->f0:Lcg;

    .line 2451
    .line 2452
    invoke-static {v4, v1}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2453
    .line 2454
    .line 2455
    move-object/from16 v17, v4

    .line 2456
    .line 2457
    :goto_58
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 2458
    .line 2459
    .line 2460
    move-result v1

    .line 2461
    const/4 v10, 0x0

    .line 2462
    const/16 v16, 0x0

    .line 2463
    .line 2464
    :goto_59
    if-ge v10, v1, :cond_73

    .line 2465
    .line 2466
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v3

    .line 2470
    check-cast v3, Lf74;

    .line 2471
    .line 2472
    iget v3, v3, Lf74;->n:I

    .line 2473
    .line 2474
    add-int v16, v16, v3

    .line 2475
    .line 2476
    add-int/lit8 v10, v10, 0x1

    .line 2477
    .line 2478
    goto :goto_59

    .line 2479
    :cond_73
    new-instance v4, Le74;

    .line 2480
    .line 2481
    iget-wide v14, v14, Lc74;->d:J

    .line 2482
    .line 2483
    move/from16 v10, p1

    .line 2484
    .line 2485
    move/from16 v20, v2

    .line 2486
    .line 2487
    move-object v2, v5

    .line 2488
    move v7, v9

    .line 2489
    move/from16 v8, v18

    .line 2490
    .line 2491
    move/from16 v6, v23

    .line 2492
    .line 2493
    move-object/from16 v12, v25

    .line 2494
    .line 2495
    move/from16 v22, v36

    .line 2496
    .line 2497
    move/from16 v23, v37

    .line 2498
    .line 2499
    move-object/from16 v21, v40

    .line 2500
    .line 2501
    move/from16 v19, v47

    .line 2502
    .line 2503
    move/from16 v11, v49

    .line 2504
    .line 2505
    move-object/from16 v5, v56

    .line 2506
    .line 2507
    move-object v9, v0

    .line 2508
    move/from16 v18, v13

    .line 2509
    .line 2510
    move-object/from16 v13, v51

    .line 2511
    .line 2512
    invoke-direct/range {v4 .. v23}, Le74;-><init>(Lf74;IZFLyr4;FZLb71;Lfi1;JILjava/util/List;IIILsd5;II)V

    .line 2513
    .line 2514
    .line 2515
    :goto_5a
    invoke-interface {v2}, Lug3;->c0()Z

    .line 2516
    .line 2517
    .line 2518
    move-result v0

    .line 2519
    move-object/from16 v3, p2

    .line 2520
    .line 2521
    const/4 v13, 0x0

    .line 2522
    invoke-virtual {v3, v4, v0, v13}, Lj74;->a(Le74;ZZ)V

    .line 2523
    .line 2524
    .line 2525
    return-object v4

    .line 2526
    :catchall_0
    move-exception v0

    .line 2527
    invoke-static {v15, v8, v5}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 2528
    .line 2529
    .line 2530
    throw v0

    .line 2531
    :cond_74
    move-object/from16 v16, v3

    .line 2532
    .line 2533
    invoke-static/range {v16 .. v16}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v0

    .line 2537
    throw v0
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, Li9;->X:B

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/16 v4, 0x39

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const/16 v6, 0x31

    .line 13
    .line 14
    const/4 v7, 0x7

    .line 15
    sget-object v8, Lzz0;->a:Lbe;

    .line 16
    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v11, 0x1

    .line 19
    sget-object v12, Ldn8;->a:Ldn8;

    .line 20
    .line 21
    iget-object v13, v0, Li9;->Z:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v14, v0, Li9;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast v14, Ltn6;

    .line 29
    .line 30
    check-cast v13, Lkx4;

    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, Llp2;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v11}, Lw79;->P(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v14, v13, v0, v1}, Lg33;->d(Ltn6;Lkx4;Llp2;I)V

    .line 46
    .line 47
    .line 48
    return-object v12

    .line 49
    :pswitch_0
    check-cast v14, Lvo6;

    .line 50
    .line 51
    check-cast v13, Lkx4;

    .line 52
    .line 53
    move-object/from16 v0, p1

    .line 54
    .line 55
    check-cast v0, Llp2;

    .line 56
    .line 57
    check-cast v1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v11}, Lw79;->P(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-static {v14, v13, v0, v1}, Lz51;->i(Lvo6;Lkx4;Llp2;I)V

    .line 67
    .line 68
    .line 69
    return-object v12

    .line 70
    :pswitch_1
    check-cast v14, Lsn6;

    .line 71
    .line 72
    check-cast v13, Lgn2;

    .line 73
    .line 74
    move-object/from16 v5, p1

    .line 75
    .line 76
    check-cast v5, Llp2;

    .line 77
    .line 78
    move-object v0, v1

    .line 79
    check-cast v0, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    and-int/lit8 v1, v0, 0x3

    .line 86
    .line 87
    if-eq v1, v9, :cond_0

    .line 88
    .line 89
    move v1, v11

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const/4 v1, 0x0

    .line 92
    :goto_0
    and-int/2addr v0, v11

    .line 93
    invoke-virtual {v5, v0, v1}, Llp2;->N(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 100
    .line 101
    sget v0, Ly46;->settings_profile_use_custom_ua_dropdown:I

    .line 102
    .line 103
    invoke-static {v0, v5}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget v3, v14, Lsn6;->j:I

    .line 108
    .line 109
    const v1, -0x2b817ba5

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    .line 113
    .line 114
    .line 115
    sget v1, Lm26;->settings_profile_custom_ua:I

    .line 116
    .line 117
    sget-object v4, Lpc;->c:Lz01;

    .line 118
    .line 119
    invoke-virtual {v5, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Landroid/content/res/Resources;

    .line 124
    .line 125
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sget-object v4, Lec7;->Y:Lec7;

    .line 130
    .line 131
    invoke-virtual {v4}, Lec7;->c()Lqm5;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    array-length v6, v1

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v9, 0x0

    .line 138
    :goto_1
    if-ge v7, v6, :cond_3

    .line 139
    .line 140
    aget-object v14, v1, v7

    .line 141
    .line 142
    add-int/lit8 v15, v9, 0x1

    .line 143
    .line 144
    invoke-virtual {v5, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v16

    .line 148
    invoke-virtual {v5, v9}, Llp2;->d(I)Z

    .line 149
    .line 150
    .line 151
    move-result v17

    .line 152
    or-int v16, v16, v17

    .line 153
    .line 154
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    if-nez v16, :cond_1

    .line 159
    .line 160
    if-ne v10, v8, :cond_2

    .line 161
    .line 162
    :cond_1
    new-instance v10, Llx2;

    .line 163
    .line 164
    invoke-direct {v10, v13, v9, v11}, Llx2;-><init>(Lgn2;IB)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_2
    check-cast v10, Ldn2;

    .line 171
    .line 172
    new-instance v9, Lmw2;

    .line 173
    .line 174
    move/from16 v16, v11

    .line 175
    .line 176
    const/4 v11, 0x0

    .line 177
    invoke-direct {v9, v14, v11, v10}, Lmw2;-><init>(Ljava/lang/String;Lg73;Ldn2;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v9}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-int/lit8 v7, v7, 0x1

    .line 184
    .line 185
    move v9, v15

    .line 186
    move/from16 v11, v16

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_3
    invoke-virtual {v4}, Lqm5;->c()Lj2;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const/4 v4, 0x0

    .line 194
    invoke-virtual {v5, v4}, Llp2;->p(Z)V

    .line 195
    .line 196
    .line 197
    const/16 v6, 0x180

    .line 198
    .line 199
    const/16 v7, 0x30

    .line 200
    .line 201
    const/4 v4, 0x0

    .line 202
    invoke-static/range {v0 .. v7}, Lys0;->g(Ljava/lang/String;Lb83;Lkx4;ILtn2;Llp2;II)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    invoke-virtual {v5}, Llp2;->Q()V

    .line 207
    .line 208
    .line 209
    :goto_2
    return-object v12

    .line 210
    :pswitch_2
    move/from16 v16, v11

    .line 211
    .line 212
    move-object/from16 v20, v14

    .line 213
    .line 214
    check-cast v20, Ly68;

    .line 215
    .line 216
    check-cast v13, Ly05;

    .line 217
    .line 218
    move-object/from16 v0, p1

    .line 219
    .line 220
    check-cast v0, Llp2;

    .line 221
    .line 222
    check-cast v1, Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    and-int/lit8 v2, v1, 0x3

    .line 229
    .line 230
    if-eq v2, v9, :cond_5

    .line 231
    .line 232
    move/from16 v10, v16

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_5
    const/4 v10, 0x0

    .line 236
    :goto_3
    and-int/lit8 v1, v1, 0x1

    .line 237
    .line 238
    invoke-virtual {v0, v1, v10}, Llp2;->N(IZ)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_8

    .line 243
    .line 244
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 245
    .line 246
    new-instance v2, Lft;

    .line 247
    .line 248
    new-instance v3, Lbt;

    .line 249
    .line 250
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 251
    .line 252
    .line 253
    const/high16 v4, 0x40800000    # 4.0f

    .line 254
    .line 255
    invoke-direct {v2, v4, v3}, Lft;-><init>(FLbt;)V

    .line 256
    .line 257
    .line 258
    sget-object v3, Lpz2;->q0:Ln50;

    .line 259
    .line 260
    const/4 v4, 0x6

    .line 261
    invoke-static {v2, v3, v0, v4}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    iget-wide v3, v0, Llp2;->T:J

    .line 266
    .line 267
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    invoke-virtual {v0}, Llp2;->l()Lkl5;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {v0, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    sget-object v7, Luz0;->j:Lpz2;

    .line 280
    .line 281
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Llp2;->Z()V

    .line 285
    .line 286
    .line 287
    iget-boolean v7, v0, Llp2;->S:Z

    .line 288
    .line 289
    if-eqz v7, :cond_6

    .line 290
    .line 291
    invoke-virtual {v0}, Llp2;->k()V

    .line 292
    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_6
    invoke-virtual {v0}, Llp2;->j0()V

    .line 296
    .line 297
    .line 298
    :goto_4
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 299
    .line 300
    invoke-static {v7, v0, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 304
    .line 305
    invoke-static {v2, v0, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 313
    .line 314
    invoke-static {v3, v0, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v0}, Lpn7;->l(Llp2;)V

    .line 318
    .line 319
    .line 320
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 321
    .line 322
    invoke-static {v2, v0, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v13}, Llh7;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    check-cast v2, Ljava/lang/Boolean;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 332
    .line 333
    .line 334
    move-result v22

    .line 335
    sget v2, Ly46;->routing_settings_title_name:I

    .line 336
    .line 337
    invoke-static {v2, v0}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v17

    .line 341
    sget-object v2, Les;->a:Lox1;

    .line 342
    .line 343
    invoke-virtual {v0, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, Lds;

    .line 348
    .line 349
    iget-object v3, v3, Lds;->c:Lo88;

    .line 350
    .line 351
    sget-object v4, Lep;->z:Lox1;

    .line 352
    .line 353
    invoke-virtual {v0, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    check-cast v6, Ldp;

    .line 358
    .line 359
    iget-object v6, v6, Ldp;->c:Lxr;

    .line 360
    .line 361
    iget-wide v6, v6, Lxr;->b:J

    .line 362
    .line 363
    const/16 v34, 0x0

    .line 364
    .line 365
    const v35, 0xfffffe

    .line 366
    .line 367
    .line 368
    const-wide/16 v26, 0x0

    .line 369
    .line 370
    const/16 v28, 0x0

    .line 371
    .line 372
    const/16 v29, 0x0

    .line 373
    .line 374
    const-wide/16 v30, 0x0

    .line 375
    .line 376
    const-wide/16 v32, 0x0

    .line 377
    .line 378
    move-object/from16 v23, v3

    .line 379
    .line 380
    move-wide/from16 v24, v6

    .line 381
    .line 382
    invoke-static/range {v23 .. v35}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 383
    .line 384
    .line 385
    move-result-object v21

    .line 386
    new-instance v3, Lrr4;

    .line 387
    .line 388
    const/16 v6, 0x80

    .line 389
    .line 390
    invoke-direct {v3, v6}, Lrr4;-><init>(I)V

    .line 391
    .line 392
    .line 393
    new-instance v6, Lha2;

    .line 394
    .line 395
    invoke-direct {v6, v3}, Lha2;-><init>(Lrr4;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    if-ne v3, v8, :cond_7

    .line 403
    .line 404
    new-instance v3, Lgh;

    .line 405
    .line 406
    invoke-direct {v3, v13, v5}, Lgh;-><init>(Ly05;B)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_7
    move-object/from16 v18, v3

    .line 413
    .line 414
    check-cast v18, Lgn2;

    .line 415
    .line 416
    const/16 v24, 0x0

    .line 417
    .line 418
    const/16 v27, 0x1b0

    .line 419
    .line 420
    const/16 v23, 0x0

    .line 421
    .line 422
    move-object/from16 v26, v0

    .line 423
    .line 424
    move-object/from16 v19, v1

    .line 425
    .line 426
    move-object/from16 v25, v6

    .line 427
    .line 428
    invoke-static/range {v17 .. v27}, Lx97;->a(Ljava/lang/String;Lgn2;Lkx4;Ly68;Lo88;ZLwx3;Lw58;Lde3;Llp2;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v20}, Ly68;->c()Lh48;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    iget-object v3, v3, Lh48;->Z:Ljava/lang/CharSequence;

    .line 436
    .line 437
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    new-instance v5, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    const-string v3, "/128"

    .line 450
    .line 451
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v21

    .line 458
    sget-object v3, Lpz2;->s0:Ln50;

    .line 459
    .line 460
    new-instance v5, Lr03;

    .line 461
    .line 462
    invoke-direct {v5, v3}, Lr03;-><init>(Ln50;)V

    .line 463
    .line 464
    .line 465
    invoke-interface {v1, v5}, Lkx4;->y(Lkx4;)Lkx4;

    .line 466
    .line 467
    .line 468
    move-result-object v22

    .line 469
    invoke-virtual {v0, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Lds;

    .line 474
    .line 475
    iget-object v1, v1, Lds;->d:Lo88;

    .line 476
    .line 477
    invoke-virtual {v0, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    check-cast v2, Ldp;

    .line 482
    .line 483
    iget-object v2, v2, Ldp;->c:Lxr;

    .line 484
    .line 485
    iget-wide v2, v2, Lxr;->c:J

    .line 486
    .line 487
    const/16 v34, 0x0

    .line 488
    .line 489
    const v35, 0xfffffe

    .line 490
    .line 491
    .line 492
    const-wide/16 v26, 0x0

    .line 493
    .line 494
    const/16 v28, 0x0

    .line 495
    .line 496
    const/16 v29, 0x0

    .line 497
    .line 498
    const-wide/16 v30, 0x0

    .line 499
    .line 500
    const-wide/16 v32, 0x0

    .line 501
    .line 502
    move-object/from16 v23, v1

    .line 503
    .line 504
    move-wide/from16 v24, v2

    .line 505
    .line 506
    invoke-static/range {v23 .. v35}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 507
    .line 508
    .line 509
    move-result-object v23

    .line 510
    const/high16 v31, 0x30000

    .line 511
    .line 512
    const/16 v32, 0x1d0

    .line 513
    .line 514
    const/16 v24, 0x6

    .line 515
    .line 516
    const/16 v25, 0x0

    .line 517
    .line 518
    const/16 v26, 0x1

    .line 519
    .line 520
    const/16 v27, 0x0

    .line 521
    .line 522
    const/16 v28, 0x0

    .line 523
    .line 524
    move-object/from16 v30, v0

    .line 525
    .line 526
    invoke-static/range {v21 .. v32}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 527
    .line 528
    .line 529
    move/from16 v1, v16

    .line 530
    .line 531
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    .line 532
    .line 533
    .line 534
    goto :goto_5

    .line 535
    :cond_8
    invoke-virtual {v0}, Llp2;->Q()V

    .line 536
    .line 537
    .line 538
    :goto_5
    return-object v12

    .line 539
    :pswitch_3
    move-object/from16 v28, v14

    .line 540
    .line 541
    check-cast v28, Ldn2;

    .line 542
    .line 543
    check-cast v13, Ldn2;

    .line 544
    .line 545
    move-object/from16 v0, p1

    .line 546
    .line 547
    check-cast v0, Llp2;

    .line 548
    .line 549
    check-cast v1, Ljava/lang/Integer;

    .line 550
    .line 551
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    and-int/lit8 v2, v1, 0x3

    .line 556
    .line 557
    if-eq v2, v9, :cond_9

    .line 558
    .line 559
    const/4 v10, 0x1

    .line 560
    :goto_6
    const/16 v16, 0x1

    .line 561
    .line 562
    goto :goto_7

    .line 563
    :cond_9
    const/4 v10, 0x0

    .line 564
    goto :goto_6

    .line 565
    :goto_7
    and-int/lit8 v1, v1, 0x1

    .line 566
    .line 567
    invoke-virtual {v0, v1, v10}, Llp2;->N(IZ)Z

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    if-eqz v1, :cond_d

    .line 572
    .line 573
    sget-object v1, Lpz2;->o0:Lo50;

    .line 574
    .line 575
    new-instance v2, Lft;

    .line 576
    .line 577
    new-instance v3, Lbt;

    .line 578
    .line 579
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 580
    .line 581
    .line 582
    const/high16 v4, 0x41000000    # 8.0f

    .line 583
    .line 584
    invoke-direct {v2, v4, v3}, Lft;-><init>(FLbt;)V

    .line 585
    .line 586
    .line 587
    const/16 v3, 0x36

    .line 588
    .line 589
    invoke-static {v2, v1, v0, v3}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iget-wide v2, v0, Llp2;->T:J

    .line 594
    .line 595
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    invoke-virtual {v0}, Llp2;->l()Lkl5;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    sget-object v4, Lhx4;->X:Lhx4;

    .line 604
    .line 605
    invoke-static {v0, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    sget-object v5, Luz0;->j:Lpz2;

    .line 610
    .line 611
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0}, Llp2;->Z()V

    .line 615
    .line 616
    .line 617
    iget-boolean v5, v0, Llp2;->S:Z

    .line 618
    .line 619
    if-eqz v5, :cond_a

    .line 620
    .line 621
    invoke-virtual {v0}, Llp2;->k()V

    .line 622
    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_a
    invoke-virtual {v0}, Llp2;->j0()V

    .line 626
    .line 627
    .line 628
    :goto_8
    sget-object v5, Lpz2;->B0:Ldx0;

    .line 629
    .line 630
    invoke-static {v5, v0, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 634
    .line 635
    invoke-static {v1, v0, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 643
    .line 644
    invoke-static {v2, v0, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    invoke-static {v0}, Lpn7;->l(Llp2;)V

    .line 648
    .line 649
    .line 650
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 651
    .line 652
    invoke-static {v1, v0, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    sget v1, Ly46;->no:I

    .line 656
    .line 657
    invoke-static {v1, v0}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v17

    .line 661
    sget-object v1, Les;->a:Lox1;

    .line 662
    .line 663
    invoke-virtual {v0, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    check-cast v2, Lds;

    .line 668
    .line 669
    iget-object v2, v2, Lds;->c:Lo88;

    .line 670
    .line 671
    sget-object v3, Lep;->z:Lox1;

    .line 672
    .line 673
    invoke-virtual {v0, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v4

    .line 677
    check-cast v4, Ldp;

    .line 678
    .line 679
    iget-object v4, v4, Ldp;->c:Lxr;

    .line 680
    .line 681
    iget-wide v4, v4, Lxr;->a:J

    .line 682
    .line 683
    sget-object v34, Ldj2;->f0:Ldj2;

    .line 684
    .line 685
    const/16 v40, 0x0

    .line 686
    .line 687
    const v41, 0xfffffa

    .line 688
    .line 689
    .line 690
    const-wide/16 v32, 0x0

    .line 691
    .line 692
    const/16 v35, 0x0

    .line 693
    .line 694
    const-wide/16 v36, 0x0

    .line 695
    .line 696
    const-wide/16 v38, 0x0

    .line 697
    .line 698
    move-object/from16 v29, v2

    .line 699
    .line 700
    move-wide/from16 v30, v4

    .line 701
    .line 702
    invoke-static/range {v29 .. v41}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 703
    .line 704
    .line 705
    move-result-object v20

    .line 706
    const/high16 v30, 0x180000

    .line 707
    .line 708
    const/16 v31, 0xfb6

    .line 709
    .line 710
    const/16 v18, 0x0

    .line 711
    .line 712
    const/16 v19, 0x0

    .line 713
    .line 714
    const/16 v21, 0x0

    .line 715
    .line 716
    const/16 v22, 0x0

    .line 717
    .line 718
    const/16 v23, 0x1

    .line 719
    .line 720
    const/16 v24, 0x0

    .line 721
    .line 722
    const/16 v25, 0x0

    .line 723
    .line 724
    const/16 v26, 0x0

    .line 725
    .line 726
    const/16 v27, 0x0

    .line 727
    .line 728
    move-object/from16 v29, v0

    .line 729
    .line 730
    invoke-static/range {v17 .. v31}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    .line 731
    .line 732
    .line 733
    move-object/from16 v14, v28

    .line 734
    .line 735
    sget v2, Ly46;->yes:I

    .line 736
    .line 737
    invoke-static {v2, v0}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    invoke-virtual {v0, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    check-cast v1, Lds;

    .line 746
    .line 747
    iget-object v1, v1, Lds;->c:Lo88;

    .line 748
    .line 749
    invoke-virtual {v0, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    check-cast v3, Ldp;

    .line 754
    .line 755
    iget-wide v3, v3, Ldp;->a:J

    .line 756
    .line 757
    move-object/from16 v29, v1

    .line 758
    .line 759
    move-wide/from16 v30, v3

    .line 760
    .line 761
    invoke-static/range {v29 .. v41}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 762
    .line 763
    .line 764
    move-result-object v32

    .line 765
    invoke-virtual {v0, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v1

    .line 769
    invoke-virtual {v0, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    or-int/2addr v1, v3

    .line 774
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    if-nez v1, :cond_b

    .line 779
    .line 780
    if-ne v3, v8, :cond_c

    .line 781
    .line 782
    :cond_b
    new-instance v3, La23;

    .line 783
    .line 784
    const/16 v1, 0xd

    .line 785
    .line 786
    invoke-direct {v3, v13, v14, v1}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    :cond_c
    move-object/from16 v40, v3

    .line 793
    .line 794
    check-cast v40, Ldn2;

    .line 795
    .line 796
    const/high16 v42, 0x180000

    .line 797
    .line 798
    const/16 v43, 0xfb6

    .line 799
    .line 800
    const/16 v30, 0x0

    .line 801
    .line 802
    const/16 v31, 0x0

    .line 803
    .line 804
    const/16 v33, 0x0

    .line 805
    .line 806
    const/16 v34, 0x0

    .line 807
    .line 808
    const/16 v35, 0x1

    .line 809
    .line 810
    const/16 v36, 0x0

    .line 811
    .line 812
    const/16 v37, 0x0

    .line 813
    .line 814
    const/16 v38, 0x0

    .line 815
    .line 816
    const/16 v39, 0x0

    .line 817
    .line 818
    move-object/from16 v41, v0

    .line 819
    .line 820
    move-object/from16 v29, v2

    .line 821
    .line 822
    invoke-static/range {v29 .. v43}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    .line 823
    .line 824
    .line 825
    const/4 v1, 0x1

    .line 826
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    .line 827
    .line 828
    .line 829
    goto :goto_9

    .line 830
    :cond_d
    invoke-virtual {v0}, Llp2;->Q()V

    .line 831
    .line 832
    .line 833
    :goto_9
    return-object v12

    .line 834
    :pswitch_4
    check-cast v14, Lde5;

    .line 835
    .line 836
    check-cast v13, Lzy0;

    .line 837
    .line 838
    move-object/from16 v0, p1

    .line 839
    .line 840
    check-cast v0, Llp2;

    .line 841
    .line 842
    check-cast v1, Ljava/lang/Integer;

    .line 843
    .line 844
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    invoke-static {v7}, Lw79;->P(I)I

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    invoke-virtual {v14, v13, v0, v1}, Lde5;->j(Lzy0;Llp2;I)V

    .line 852
    .line 853
    .line 854
    return-object v12

    .line 855
    :pswitch_5
    check-cast v14, Li55;

    .line 856
    .line 857
    check-cast v13, Le55;

    .line 858
    .line 859
    move-object/from16 v0, p1

    .line 860
    .line 861
    check-cast v0, Lsm0;

    .line 862
    .line 863
    check-cast v1, Lxt2;

    .line 864
    .line 865
    iget-object v2, v14, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 866
    .line 867
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    if-eqz v3, :cond_e

    .line 872
    .line 873
    iput-object v0, v14, Li55;->R0:Lsm0;

    .line 874
    .line 875
    iput-object v1, v14, Li55;->Q0:Lxt2;

    .line 876
    .line 877
    invoke-static {v2}, Lq34;->a(Landroidx/compose/ui/node/LayoutNode;)Lmf5;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-interface {v0}, Lmf5;->getSnapshotObserver()Lof5;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    sget-object v1, Li55;->Y0:Ldx4;

    .line 886
    .line 887
    iget-object v0, v0, Lof5;->a:Lxd7;

    .line 888
    .line 889
    invoke-virtual {v0, v14, v1, v13}, Lxd7;->c(Ljava/lang/Object;Lgn2;Ldn2;)V

    .line 890
    .line 891
    .line 892
    const/4 v4, 0x0

    .line 893
    iput-boolean v4, v14, Li55;->U0:Z

    .line 894
    .line 895
    goto :goto_a

    .line 896
    :cond_e
    const/4 v1, 0x1

    .line 897
    iput-boolean v1, v14, Li55;->U0:Z

    .line 898
    .line 899
    :goto_a
    return-object v12

    .line 900
    :pswitch_6
    check-cast v14, Lci4;

    .line 901
    .line 902
    check-cast v13, Lkx4;

    .line 903
    .line 904
    move-object/from16 v0, p1

    .line 905
    .line 906
    check-cast v0, Llp2;

    .line 907
    .line 908
    check-cast v1, Ljava/lang/Integer;

    .line 909
    .line 910
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    invoke-static {v4}, Lw79;->P(I)I

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    invoke-static {v14, v13, v0, v1}, Lwl7;->f(Lci4;Lkx4;Llp2;I)V

    .line 918
    .line 919
    .line 920
    return-object v12

    .line 921
    :pswitch_7
    check-cast v14, Llg4;

    .line 922
    .line 923
    check-cast v13, Lpv3;

    .line 924
    .line 925
    move-object/from16 v0, p1

    .line 926
    .line 927
    check-cast v0, Llp2;

    .line 928
    .line 929
    check-cast v1, Ljava/lang/Integer;

    .line 930
    .line 931
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 932
    .line 933
    .line 934
    move-result v1

    .line 935
    and-int/lit8 v2, v1, 0x3

    .line 936
    .line 937
    if-eq v2, v9, :cond_f

    .line 938
    .line 939
    const/4 v10, 0x1

    .line 940
    :goto_b
    const/16 v16, 0x1

    .line 941
    .line 942
    goto :goto_c

    .line 943
    :cond_f
    const/4 v10, 0x0

    .line 944
    goto :goto_b

    .line 945
    :goto_c
    and-int/lit8 v1, v1, 0x1

    .line 946
    .line 947
    invoke-virtual {v0, v1, v10}, Llp2;->N(IZ)Z

    .line 948
    .line 949
    .line 950
    move-result v1

    .line 951
    if-eqz v1, :cond_10

    .line 952
    .line 953
    check-cast v13, Lgn2;

    .line 954
    .line 955
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 956
    .line 957
    invoke-static {v1}, Lch3;->u(Lkx4;)Lkx4;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    const/16 v2, 0x180

    .line 962
    .line 963
    invoke-static {v14, v13, v1, v0, v2}, Lu15;->b(Llg4;Lgn2;Lkx4;Llp2;I)V

    .line 964
    .line 965
    .line 966
    goto :goto_d

    .line 967
    :cond_10
    invoke-virtual {v0}, Llp2;->Q()V

    .line 968
    .line 969
    .line 970
    :goto_d
    return-object v12

    .line 971
    :pswitch_8
    check-cast v14, Lth4;

    .line 972
    .line 973
    check-cast v13, Lkx4;

    .line 974
    .line 975
    move-object/from16 v0, p1

    .line 976
    .line 977
    check-cast v0, Llp2;

    .line 978
    .line 979
    check-cast v1, Ljava/lang/Integer;

    .line 980
    .line 981
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    invoke-static {v4}, Lw79;->P(I)I

    .line 985
    .line 986
    .line 987
    move-result v1

    .line 988
    invoke-static {v14, v13, v0, v1}, Lx97;->b(Lth4;Lkx4;Llp2;I)V

    .line 989
    .line 990
    .line 991
    return-object v12

    .line 992
    :pswitch_9
    check-cast v14, Lzy0;

    .line 993
    .line 994
    check-cast v13, Lo74;

    .line 995
    .line 996
    move-object/from16 v0, p1

    .line 997
    .line 998
    check-cast v0, Llp2;

    .line 999
    .line 1000
    check-cast v1, Ljava/lang/Integer;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1003
    .line 1004
    .line 1005
    move-result v1

    .line 1006
    and-int/lit8 v2, v1, 0x3

    .line 1007
    .line 1008
    if-eq v2, v9, :cond_11

    .line 1009
    .line 1010
    const/4 v2, 0x1

    .line 1011
    :goto_e
    const/16 v16, 0x1

    .line 1012
    .line 1013
    goto :goto_f

    .line 1014
    :cond_11
    const/4 v2, 0x0

    .line 1015
    goto :goto_e

    .line 1016
    :goto_f
    and-int/lit8 v1, v1, 0x1

    .line 1017
    .line 1018
    invoke-virtual {v0, v1, v2}, Llp2;->N(IZ)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v1

    .line 1022
    if-eqz v1, :cond_12

    .line 1023
    .line 1024
    const/16 v17, 0x0

    .line 1025
    .line 1026
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    invoke-virtual {v14, v13, v0, v1}, Lzy0;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    goto :goto_10

    .line 1034
    :cond_12
    invoke-virtual {v0}, Llp2;->Q()V

    .line 1035
    .line 1036
    .line 1037
    :goto_10
    return-object v12

    .line 1038
    :pswitch_a
    invoke-direct/range {p0 .. p2}, Li9;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    return-object v0

    .line 1043
    :pswitch_b
    check-cast v14, Lf64;

    .line 1044
    .line 1045
    check-cast v13, Le64;

    .line 1046
    .line 1047
    iget-object v0, v13, Le64;->a:Ljava/lang/Object;

    .line 1048
    .line 1049
    move-object/from16 v2, p1

    .line 1050
    .line 1051
    check-cast v2, Llp2;

    .line 1052
    .line 1053
    check-cast v1, Ljava/lang/Integer;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1056
    .line 1057
    .line 1058
    move-result v1

    .line 1059
    and-int/lit8 v4, v1, 0x3

    .line 1060
    .line 1061
    if-eq v4, v9, :cond_13

    .line 1062
    .line 1063
    const/4 v4, 0x1

    .line 1064
    :goto_11
    const/16 v16, 0x1

    .line 1065
    .line 1066
    goto :goto_12

    .line 1067
    :cond_13
    const/4 v4, 0x0

    .line 1068
    goto :goto_11

    .line 1069
    :goto_12
    and-int/lit8 v1, v1, 0x1

    .line 1070
    .line 1071
    invoke-virtual {v2, v1, v4}, Llp2;->N(IZ)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    if-eqz v1, :cond_19

    .line 1076
    .line 1077
    iget-object v1, v14, Lf64;->b:Leh;

    .line 1078
    .line 1079
    invoke-virtual {v1}, Leh;->invoke()Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    check-cast v1, Lz64;

    .line 1084
    .line 1085
    iget v4, v13, Le64;->c:I

    .line 1086
    .line 1087
    invoke-virtual {v1}, Lz64;->c()I

    .line 1088
    .line 1089
    .line 1090
    move-result v6

    .line 1091
    if-ge v4, v6, :cond_14

    .line 1092
    .line 1093
    invoke-virtual {v1, v4}, Lz64;->d(I)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v6

    .line 1097
    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v6

    .line 1101
    if-nez v6, :cond_15

    .line 1102
    .line 1103
    :cond_14
    iget-object v4, v1, Lz64;->d:Lne;

    .line 1104
    .line 1105
    invoke-virtual {v4, v0}, Lne;->e(Ljava/lang/Object;)I

    .line 1106
    .line 1107
    .line 1108
    move-result v4

    .line 1109
    if-eq v4, v3, :cond_15

    .line 1110
    .line 1111
    iput v4, v13, Le64;->c:I

    .line 1112
    .line 1113
    :cond_15
    if-eq v4, v3, :cond_16

    .line 1114
    .line 1115
    const v3, -0x6339ef97

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v2, v3}, Llp2;->W(I)V

    .line 1119
    .line 1120
    .line 1121
    iget-object v3, v14, Lf64;->a:Liv6;

    .line 1122
    .line 1123
    const/16 v23, 0x0

    .line 1124
    .line 1125
    move-object/from16 v21, v0

    .line 1126
    .line 1127
    move-object/from16 v18, v1

    .line 1128
    .line 1129
    move-object/from16 v22, v2

    .line 1130
    .line 1131
    move-object/from16 v19, v3

    .line 1132
    .line 1133
    move/from16 v20, v4

    .line 1134
    .line 1135
    invoke-static/range {v18 .. v23}, Lwl7;->k(Lz64;Ljava/lang/Object;ILjava/lang/Object;Llp2;I)V

    .line 1136
    .line 1137
    .line 1138
    move-object/from16 v1, v22

    .line 1139
    .line 1140
    const/4 v4, 0x0

    .line 1141
    invoke-virtual {v1, v4}, Llp2;->p(Z)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_13

    .line 1145
    :cond_16
    move-object v1, v2

    .line 1146
    const/4 v4, 0x0

    .line 1147
    const v2, -0x633657e2

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v1, v2}, Llp2;->W(I)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v1, v4}, Llp2;->p(Z)V

    .line 1154
    .line 1155
    .line 1156
    :goto_13
    invoke-virtual {v1, v13}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1157
    .line 1158
    .line 1159
    move-result v2

    .line 1160
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v3

    .line 1164
    if-nez v2, :cond_17

    .line 1165
    .line 1166
    if-ne v3, v8, :cond_18

    .line 1167
    .line 1168
    :cond_17
    new-instance v3, Lvj2;

    .line 1169
    .line 1170
    invoke-direct {v3, v13, v5}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v1, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1174
    .line 1175
    .line 1176
    :cond_18
    check-cast v3, Lgn2;

    .line 1177
    .line 1178
    invoke-static {v0, v3, v1}, Lu70;->a(Ljava/lang/Object;Lgn2;Llp2;)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_14

    .line 1182
    :cond_19
    move-object v1, v2

    .line 1183
    invoke-virtual {v1}, Llp2;->Q()V

    .line 1184
    .line 1185
    .line 1186
    :goto_14
    return-object v12

    .line 1187
    :pswitch_c
    check-cast v14, Lt34;

    .line 1188
    .line 1189
    check-cast v13, Lrn2;

    .line 1190
    .line 1191
    move-object/from16 v0, p1

    .line 1192
    .line 1193
    check-cast v0, Llp2;

    .line 1194
    .line 1195
    check-cast v1, Ljava/lang/Integer;

    .line 1196
    .line 1197
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    and-int/lit8 v2, v1, 0x3

    .line 1202
    .line 1203
    if-eq v2, v9, :cond_1a

    .line 1204
    .line 1205
    const/4 v2, 0x1

    .line 1206
    :goto_15
    const/16 v16, 0x1

    .line 1207
    .line 1208
    goto :goto_16

    .line 1209
    :cond_1a
    const/4 v2, 0x0

    .line 1210
    goto :goto_15

    .line 1211
    :goto_16
    and-int/lit8 v1, v1, 0x1

    .line 1212
    .line 1213
    invoke-virtual {v0, v1, v2}, Llp2;->N(IZ)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v1

    .line 1217
    if-eqz v1, :cond_20

    .line 1218
    .line 1219
    iget-object v1, v14, Lt34;->g:Lrh5;

    .line 1220
    .line 1221
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v1

    .line 1225
    check-cast v1, Ljava/lang/Boolean;

    .line 1226
    .line 1227
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    invoke-virtual {v0, v1}, Llp2;->Y(Ljava/lang/Object;)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v0, v2}, Llp2;->g(Z)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v1

    .line 1238
    if-eqz v2, :cond_1b

    .line 1239
    .line 1240
    const/16 v17, 0x0

    .line 1241
    .line 1242
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    invoke-interface {v13, v0, v1}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    goto :goto_18

    .line 1250
    :cond_1b
    iget v2, v0, Llp2;->l:I

    .line 1251
    .line 1252
    if-nez v2, :cond_1c

    .line 1253
    .line 1254
    goto :goto_17

    .line 1255
    :cond_1c
    const-string v2, "No nodes can be emitted before calling deactivateToEndGroup"

    .line 1256
    .line 1257
    invoke-static {v2}, Ld01;->a(Ljava/lang/String;)V

    .line 1258
    .line 1259
    .line 1260
    :goto_17
    iget-boolean v2, v0, Llp2;->S:Z

    .line 1261
    .line 1262
    if-nez v2, :cond_1e

    .line 1263
    .line 1264
    if-nez v1, :cond_1d

    .line 1265
    .line 1266
    invoke-virtual {v0}, Llp2;->P()V

    .line 1267
    .line 1268
    .line 1269
    goto :goto_18

    .line 1270
    :cond_1d
    iget-object v1, v0, Llp2;->G:Lxb7;

    .line 1271
    .line 1272
    iget v2, v1, Lxb7;->g:I

    .line 1273
    .line 1274
    iget v1, v1, Lxb7;->h:I

    .line 1275
    .line 1276
    iget-object v4, v0, Llp2;->M:La01;

    .line 1277
    .line 1278
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1279
    .line 1280
    .line 1281
    const/4 v5, 0x0

    .line 1282
    invoke-virtual {v4, v5}, La01;->d(Z)V

    .line 1283
    .line 1284
    .line 1285
    iget-object v4, v4, La01;->b:Lep0;

    .line 1286
    .line 1287
    iget-object v4, v4, Lep0;->i0:Lwc5;

    .line 1288
    .line 1289
    sget-object v5, Lqb5;->d:Lqb5;

    .line 1290
    .line 1291
    invoke-virtual {v4, v5}, Lwc5;->b0(Lld2;)V

    .line 1292
    .line 1293
    .line 1294
    iget-object v4, v0, Llp2;->s:Ljava/util/ArrayList;

    .line 1295
    .line 1296
    invoke-static {v2, v1, v4}, Lgv3;->T(IILjava/util/List;)V

    .line 1297
    .line 1298
    .line 1299
    iget-object v1, v0, Llp2;->G:Lxb7;

    .line 1300
    .line 1301
    invoke-virtual {v1}, Lxb7;->t()V

    .line 1302
    .line 1303
    .line 1304
    :cond_1e
    :goto_18
    iget-boolean v1, v0, Llp2;->y:Z

    .line 1305
    .line 1306
    if-eqz v1, :cond_1f

    .line 1307
    .line 1308
    iget-object v1, v0, Llp2;->G:Lxb7;

    .line 1309
    .line 1310
    iget v1, v1, Lxb7;->i:I

    .line 1311
    .line 1312
    iget v2, v0, Llp2;->z:I

    .line 1313
    .line 1314
    if-ne v1, v2, :cond_1f

    .line 1315
    .line 1316
    iput v3, v0, Llp2;->z:I

    .line 1317
    .line 1318
    const/4 v4, 0x0

    .line 1319
    iput-boolean v4, v0, Llp2;->y:Z

    .line 1320
    .line 1321
    goto :goto_19

    .line 1322
    :cond_1f
    const/4 v4, 0x0

    .line 1323
    :goto_19
    invoke-virtual {v0, v4}, Llp2;->p(Z)V

    .line 1324
    .line 1325
    .line 1326
    goto :goto_1a

    .line 1327
    :cond_20
    invoke-virtual {v0}, Llp2;->Q()V

    .line 1328
    .line 1329
    .line 1330
    :goto_1a
    return-object v12

    .line 1331
    :pswitch_d
    check-cast v14, Ly68;

    .line 1332
    .line 1333
    check-cast v13, Lkx4;

    .line 1334
    .line 1335
    move-object/from16 v0, p1

    .line 1336
    .line 1337
    check-cast v0, Llp2;

    .line 1338
    .line 1339
    check-cast v1, Ljava/lang/Integer;

    .line 1340
    .line 1341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    invoke-static {v6}, Lw79;->P(I)I

    .line 1345
    .line 1346
    .line 1347
    move-result v1

    .line 1348
    invoke-static {v14, v13, v0, v1}, Lz91;->e(Ly68;Lkx4;Llp2;I)V

    .line 1349
    .line 1350
    .line 1351
    return-object v12

    .line 1352
    :pswitch_e
    check-cast v14, Lky2;

    .line 1353
    .line 1354
    check-cast v13, Lkx4;

    .line 1355
    .line 1356
    move-object/from16 v0, p1

    .line 1357
    .line 1358
    check-cast v0, Llp2;

    .line 1359
    .line 1360
    check-cast v1, Ljava/lang/Integer;

    .line 1361
    .line 1362
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1363
    .line 1364
    .line 1365
    invoke-static {v7}, Lw79;->P(I)I

    .line 1366
    .line 1367
    .line 1368
    move-result v1

    .line 1369
    invoke-static {v14, v13, v0, v1}, Lyn0;->g(Lky2;Lkx4;Llp2;I)V

    .line 1370
    .line 1371
    .line 1372
    return-object v12

    .line 1373
    :pswitch_f
    move-object v2, v14

    .line 1374
    check-cast v2, Lg73;

    .line 1375
    .line 1376
    check-cast v13, Lmw2;

    .line 1377
    .line 1378
    move-object/from16 v7, p1

    .line 1379
    .line 1380
    check-cast v7, Llp2;

    .line 1381
    .line 1382
    move-object v0, v1

    .line 1383
    check-cast v0, Ljava/lang/Integer;

    .line 1384
    .line 1385
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1386
    .line 1387
    .line 1388
    move-result v0

    .line 1389
    and-int/lit8 v1, v0, 0x3

    .line 1390
    .line 1391
    if-eq v1, v9, :cond_21

    .line 1392
    .line 1393
    const/4 v10, 0x1

    .line 1394
    :goto_1b
    const/16 v16, 0x1

    .line 1395
    .line 1396
    goto :goto_1c

    .line 1397
    :cond_21
    const/4 v10, 0x0

    .line 1398
    goto :goto_1b

    .line 1399
    :goto_1c
    and-int/lit8 v0, v0, 0x1

    .line 1400
    .line 1401
    invoke-virtual {v7, v0, v10}, Llp2;->N(IZ)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v0

    .line 1405
    if-eqz v0, :cond_22

    .line 1406
    .line 1407
    iget-object v4, v13, Lmw2;->a:Ljava/lang/String;

    .line 1408
    .line 1409
    sget-object v0, Lep;->z:Lox1;

    .line 1410
    .line 1411
    invoke-virtual {v7, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    check-cast v0, Ldp;

    .line 1416
    .line 1417
    iget-object v0, v0, Ldp;->h:Lkr;

    .line 1418
    .line 1419
    iget-wide v5, v0, Lkr;->a:J

    .line 1420
    .line 1421
    const/4 v8, 0x0

    .line 1422
    const/4 v9, 0x2

    .line 1423
    const/4 v3, 0x0

    .line 1424
    invoke-static/range {v2 .. v9}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 1425
    .line 1426
    .line 1427
    goto :goto_1d

    .line 1428
    :cond_22
    invoke-virtual {v7}, Llp2;->Q()V

    .line 1429
    .line 1430
    .line 1431
    :goto_1d
    return-object v12

    .line 1432
    :pswitch_10
    check-cast v14, Ldn2;

    .line 1433
    .line 1434
    check-cast v13, Landroid/app/Activity;

    .line 1435
    .line 1436
    move-object/from16 v0, p1

    .line 1437
    .line 1438
    check-cast v0, Llp2;

    .line 1439
    .line 1440
    check-cast v1, Ljava/lang/Integer;

    .line 1441
    .line 1442
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1443
    .line 1444
    .line 1445
    move-result v1

    .line 1446
    and-int/lit8 v2, v1, 0x3

    .line 1447
    .line 1448
    if-eq v2, v9, :cond_23

    .line 1449
    .line 1450
    const/4 v10, 0x1

    .line 1451
    :goto_1e
    const/16 v16, 0x1

    .line 1452
    .line 1453
    goto :goto_1f

    .line 1454
    :cond_23
    const/4 v10, 0x0

    .line 1455
    goto :goto_1e

    .line 1456
    :goto_1f
    and-int/lit8 v1, v1, 0x1

    .line 1457
    .line 1458
    invoke-virtual {v0, v1, v10}, Llp2;->N(IZ)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v1

    .line 1462
    if-eqz v1, :cond_26

    .line 1463
    .line 1464
    invoke-virtual {v0, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v1

    .line 1468
    invoke-virtual {v0, v13}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v2

    .line 1472
    or-int/2addr v1, v2

    .line 1473
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v2

    .line 1477
    if-nez v1, :cond_24

    .line 1478
    .line 1479
    if-ne v2, v8, :cond_25

    .line 1480
    .line 1481
    :cond_24
    new-instance v2, Lp5;

    .line 1482
    .line 1483
    const/16 v1, 0x1a

    .line 1484
    .line 1485
    invoke-direct {v2, v14, v13, v1}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1489
    .line 1490
    .line 1491
    :cond_25
    move-object/from16 v18, v2

    .line 1492
    .line 1493
    check-cast v18, Ldn2;

    .line 1494
    .line 1495
    sget-object v24, Lz39;->Y:Lzy0;

    .line 1496
    .line 1497
    const/high16 v26, 0x180000

    .line 1498
    .line 1499
    const/16 v27, 0x3e

    .line 1500
    .line 1501
    const/16 v19, 0x0

    .line 1502
    .line 1503
    const/16 v20, 0x0

    .line 1504
    .line 1505
    const/16 v21, 0x0

    .line 1506
    .line 1507
    const/16 v22, 0x0

    .line 1508
    .line 1509
    const/16 v23, 0x0

    .line 1510
    .line 1511
    move-object/from16 v25, v0

    .line 1512
    .line 1513
    invoke-static/range {v18 .. v27}, Lw45;->c(Ldn2;Lkx4;ZLs43;Lxz4;Lx67;Lzy0;Llp2;II)V

    .line 1514
    .line 1515
    .line 1516
    goto :goto_20

    .line 1517
    :cond_26
    move-object/from16 v25, v0

    .line 1518
    .line 1519
    invoke-virtual/range {v25 .. v25}, Llp2;->Q()V

    .line 1520
    .line 1521
    .line 1522
    :goto_20
    return-object v12

    .line 1523
    :pswitch_11
    check-cast v14, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;

    .line 1524
    .line 1525
    check-cast v13, Lkx4;

    .line 1526
    .line 1527
    move-object/from16 v0, p1

    .line 1528
    .line 1529
    check-cast v0, Llp2;

    .line 1530
    .line 1531
    check-cast v1, Ljava/lang/Integer;

    .line 1532
    .line 1533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1534
    .line 1535
    .line 1536
    invoke-static {v6}, Lw79;->P(I)I

    .line 1537
    .line 1538
    .line 1539
    move-result v1

    .line 1540
    invoke-static {v14, v13, v0, v1}, Lgr2;->d(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;Lkx4;Llp2;I)V

    .line 1541
    .line 1542
    .line 1543
    return-object v12

    .line 1544
    :pswitch_12
    check-cast v14, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;

    .line 1545
    .line 1546
    check-cast v13, Lkx4;

    .line 1547
    .line 1548
    move-object/from16 v0, p1

    .line 1549
    .line 1550
    check-cast v0, Llp2;

    .line 1551
    .line 1552
    check-cast v1, Ljava/lang/Integer;

    .line 1553
    .line 1554
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1555
    .line 1556
    .line 1557
    invoke-static {v6}, Lw79;->P(I)I

    .line 1558
    .line 1559
    .line 1560
    move-result v1

    .line 1561
    invoke-static {v14, v13, v0, v1}, Lgr2;->e(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;Lkx4;Llp2;I)V

    .line 1562
    .line 1563
    .line 1564
    return-object v12

    .line 1565
    :pswitch_13
    check-cast v14, Lp91;

    .line 1566
    .line 1567
    check-cast v13, Lbc7;

    .line 1568
    .line 1569
    move-object/from16 v0, p1

    .line 1570
    .line 1571
    check-cast v0, Ljava/lang/Integer;

    .line 1572
    .line 1573
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1574
    .line 1575
    .line 1576
    move-result v0

    .line 1577
    instance-of v2, v1, Ljz0;

    .line 1578
    .line 1579
    if-eqz v2, :cond_27

    .line 1580
    .line 1581
    move-object v0, v1

    .line 1582
    check-cast v0, Ljz0;

    .line 1583
    .line 1584
    iget-object v1, v14, Lp91;->f:Ljava/lang/Object;

    .line 1585
    .line 1586
    check-cast v1, Lc15;

    .line 1587
    .line 1588
    invoke-virtual {v1, v0}, Lc15;->b(Ljava/lang/Object;)V

    .line 1589
    .line 1590
    .line 1591
    goto :goto_21

    .line 1592
    :cond_27
    instance-of v2, v1, Lok6;

    .line 1593
    .line 1594
    if-nez v2, :cond_29

    .line 1595
    .line 1596
    instance-of v2, v1, Lpp2;

    .line 1597
    .line 1598
    if-eqz v2, :cond_28

    .line 1599
    .line 1600
    invoke-static {v13, v0, v1}, Lgv3;->S(Lbc7;ILjava/lang/Object;)V

    .line 1601
    .line 1602
    .line 1603
    move-object v0, v1

    .line 1604
    check-cast v0, Lpp2;

    .line 1605
    .line 1606
    invoke-virtual {v14, v0}, Lp91;->f(Lpp2;)V

    .line 1607
    .line 1608
    .line 1609
    goto :goto_21

    .line 1610
    :cond_28
    instance-of v2, v1, Lj86;

    .line 1611
    .line 1612
    if-eqz v2, :cond_29

    .line 1613
    .line 1614
    invoke-static {v13, v0, v1}, Lgv3;->S(Lbc7;ILjava/lang/Object;)V

    .line 1615
    .line 1616
    .line 1617
    move-object v0, v1

    .line 1618
    check-cast v0, Lj86;

    .line 1619
    .line 1620
    invoke-virtual {v0}, Lj86;->c()V

    .line 1621
    .line 1622
    .line 1623
    :cond_29
    :goto_21
    return-object v12

    .line 1624
    :pswitch_14
    check-cast v14, Lh30;

    .line 1625
    .line 1626
    check-cast v13, Lg38;

    .line 1627
    .line 1628
    move-object/from16 v0, p1

    .line 1629
    .line 1630
    check-cast v0, Llp2;

    .line 1631
    .line 1632
    check-cast v1, Ljava/lang/Integer;

    .line 1633
    .line 1634
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1635
    .line 1636
    .line 1637
    const/16 v16, 0x1

    .line 1638
    .line 1639
    invoke-static/range {v16 .. v16}, Lw79;->P(I)I

    .line 1640
    .line 1641
    .line 1642
    move-result v1

    .line 1643
    invoke-static {v14, v13, v0, v1}, Lng1;->a(Lh30;Lg38;Llp2;I)V

    .line 1644
    .line 1645
    .line 1646
    return-object v12

    .line 1647
    :pswitch_15
    move-object v4, v14

    .line 1648
    check-cast v4, Lh38;

    .line 1649
    .line 1650
    check-cast v13, Lh30;

    .line 1651
    .line 1652
    move-object/from16 v0, p1

    .line 1653
    .line 1654
    check-cast v0, Llp2;

    .line 1655
    .line 1656
    check-cast v1, Ljava/lang/Integer;

    .line 1657
    .line 1658
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1659
    .line 1660
    .line 1661
    move-result v1

    .line 1662
    and-int/lit8 v2, v1, 0x3

    .line 1663
    .line 1664
    if-eq v2, v9, :cond_2a

    .line 1665
    .line 1666
    const/4 v2, 0x1

    .line 1667
    :goto_22
    const/16 v16, 0x1

    .line 1668
    .line 1669
    goto :goto_23

    .line 1670
    :cond_2a
    const/4 v2, 0x0

    .line 1671
    goto :goto_22

    .line 1672
    :goto_23
    and-int/lit8 v1, v1, 0x1

    .line 1673
    .line 1674
    invoke-virtual {v0, v1, v2}, Llp2;->N(IZ)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v1

    .line 1678
    if-eqz v1, :cond_2d

    .line 1679
    .line 1680
    invoke-virtual {v0, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1681
    .line 1682
    .line 1683
    move-result v1

    .line 1684
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v2

    .line 1688
    if-nez v1, :cond_2b

    .line 1689
    .line 1690
    if-ne v2, v8, :cond_2c

    .line 1691
    .line 1692
    :cond_2b
    new-instance v2, Lub;

    .line 1693
    .line 1694
    const/4 v8, 0x0

    .line 1695
    const/4 v9, 0x1

    .line 1696
    const/4 v3, 0x0

    .line 1697
    const-class v5, Lh38;

    .line 1698
    .line 1699
    const-string v6, "data"

    .line 1700
    .line 1701
    const-string v7, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"

    .line 1702
    .line 1703
    invoke-direct/range {v2 .. v9}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1704
    .line 1705
    .line 1706
    invoke-static {v2}, Lrd7;->b(Ldn2;)Lzi1;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v2

    .line 1710
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1711
    .line 1712
    .line 1713
    :cond_2c
    check-cast v2, Llh7;

    .line 1714
    .line 1715
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v1

    .line 1719
    check-cast v1, Lg38;

    .line 1720
    .line 1721
    const/4 v4, 0x0

    .line 1722
    invoke-static {v13, v1, v0, v4}, Lng1;->a(Lh30;Lg38;Llp2;I)V

    .line 1723
    .line 1724
    .line 1725
    goto :goto_24

    .line 1726
    :cond_2d
    invoke-virtual {v0}, Llp2;->Q()V

    .line 1727
    .line 1728
    .line 1729
    :goto_24
    return-object v12

    .line 1730
    :pswitch_16
    check-cast v14, Lvf1;

    .line 1731
    .line 1732
    check-cast v13, Lma7;

    .line 1733
    .line 1734
    move-object/from16 v0, p1

    .line 1735
    .line 1736
    check-cast v0, Llp2;

    .line 1737
    .line 1738
    check-cast v1, Ljava/lang/Integer;

    .line 1739
    .line 1740
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1741
    .line 1742
    .line 1743
    const/16 v16, 0x1

    .line 1744
    .line 1745
    invoke-static/range {v16 .. v16}, Lw79;->P(I)I

    .line 1746
    .line 1747
    .line 1748
    move-result v1

    .line 1749
    invoke-virtual {v14, v13, v0, v1}, Lvf1;->a(Lma7;Llp2;I)V

    .line 1750
    .line 1751
    .line 1752
    return-object v12

    .line 1753
    :pswitch_17
    move/from16 v16, v11

    .line 1754
    .line 1755
    check-cast v14, Lde1;

    .line 1756
    .line 1757
    check-cast v13, Llr;

    .line 1758
    .line 1759
    move-object/from16 v0, p1

    .line 1760
    .line 1761
    check-cast v0, Llp2;

    .line 1762
    .line 1763
    check-cast v1, Ljava/lang/Integer;

    .line 1764
    .line 1765
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1766
    .line 1767
    .line 1768
    invoke-static/range {v16 .. v16}, Lw79;->P(I)I

    .line 1769
    .line 1770
    .line 1771
    move-result v1

    .line 1772
    invoke-virtual {v14, v13, v0, v1}, Lde1;->a(Llr;Llp2;I)V

    .line 1773
    .line 1774
    .line 1775
    return-object v12

    .line 1776
    :pswitch_18
    move/from16 v16, v11

    .line 1777
    .line 1778
    check-cast v14, Li51;

    .line 1779
    .line 1780
    check-cast v13, Lh51;

    .line 1781
    .line 1782
    move-object/from16 v0, p1

    .line 1783
    .line 1784
    check-cast v0, Llp2;

    .line 1785
    .line 1786
    check-cast v1, Ljava/lang/Integer;

    .line 1787
    .line 1788
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1789
    .line 1790
    .line 1791
    invoke-static/range {v16 .. v16}, Lw79;->P(I)I

    .line 1792
    .line 1793
    .line 1794
    move-result v1

    .line 1795
    invoke-virtual {v14, v13, v0, v1}, Li51;->a(Lh51;Llp2;I)V

    .line 1796
    .line 1797
    .line 1798
    return-object v12

    .line 1799
    :pswitch_19
    check-cast v14, Loy1;

    .line 1800
    .line 1801
    check-cast v13, Lzy0;

    .line 1802
    .line 1803
    move-object/from16 v0, p1

    .line 1804
    .line 1805
    check-cast v0, Llp2;

    .line 1806
    .line 1807
    check-cast v1, Ljava/lang/Integer;

    .line 1808
    .line 1809
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    invoke-static {v7}, Lw79;->P(I)I

    .line 1813
    .line 1814
    .line 1815
    move-result v1

    .line 1816
    invoke-virtual {v14, v13, v0, v1}, Loy1;->j(Lzy0;Llp2;I)V

    .line 1817
    .line 1818
    .line 1819
    return-object v12

    .line 1820
    :pswitch_1a
    check-cast v14, Lkx4;

    .line 1821
    .line 1822
    check-cast v13, Lrn2;

    .line 1823
    .line 1824
    move-object/from16 v0, p1

    .line 1825
    .line 1826
    check-cast v0, Llp2;

    .line 1827
    .line 1828
    check-cast v1, Ljava/lang/Integer;

    .line 1829
    .line 1830
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1831
    .line 1832
    .line 1833
    const/16 v16, 0x1

    .line 1834
    .line 1835
    invoke-static/range {v16 .. v16}, Lw79;->P(I)I

    .line 1836
    .line 1837
    .line 1838
    move-result v1

    .line 1839
    invoke-static {v14, v13, v0, v1}, Ljm4;->e(Lkx4;Lrn2;Llp2;I)V

    .line 1840
    .line 1841
    .line 1842
    return-object v12

    .line 1843
    :pswitch_1b
    check-cast v14, Lz07;

    .line 1844
    .line 1845
    check-cast v13, Lvc;

    .line 1846
    .line 1847
    move-object/from16 v0, p1

    .line 1848
    .line 1849
    check-cast v0, Ljava/lang/Integer;

    .line 1850
    .line 1851
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1852
    .line 1853
    .line 1854
    move-result v0

    .line 1855
    check-cast v1, Ly07;

    .line 1856
    .line 1857
    iget-object v2, v14, Lz07;->b:Lwz4;

    .line 1858
    .line 1859
    iget v3, v1, Ly07;->f:I

    .line 1860
    .line 1861
    invoke-virtual {v2, v3}, Lwz4;->b(I)Z

    .line 1862
    .line 1863
    .line 1864
    move-result v2

    .line 1865
    if-nez v2, :cond_2e

    .line 1866
    .line 1867
    invoke-virtual {v13, v0, v1}, Lvc;->h(ILy07;)V

    .line 1868
    .line 1869
    .line 1870
    iget-object v0, v13, Lvc;->i0:Lx90;

    .line 1871
    .line 1872
    invoke-interface {v0, v12}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1873
    .line 1874
    .line 1875
    :cond_2e
    return-object v12

    .line 1876
    :pswitch_1c
    check-cast v14, Lia;

    .line 1877
    .line 1878
    check-cast v13, Lba6;

    .line 1879
    .line 1880
    move-object/from16 v0, p1

    .line 1881
    .line 1882
    check-cast v0, Ljava/lang/Float;

    .line 1883
    .line 1884
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1885
    .line 1886
    .line 1887
    move-result v0

    .line 1888
    check-cast v1, Ljava/lang/Float;

    .line 1889
    .line 1890
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1891
    .line 1892
    .line 1893
    move-result v1

    .line 1894
    invoke-virtual {v14, v0, v1}, Lia;->a(FF)V

    .line 1895
    .line 1896
    .line 1897
    iput v0, v13, Lba6;->X:F

    .line 1898
    .line 1899
    return-object v12

    .line 1900
    nop

    .line 1901
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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

.class public final synthetic Lhr5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhr5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhr5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lhr5;->X:B

    .line 4
    .line 5
    const-wide/16 v4, 0xff

    .line 6
    .line 7
    const-wide v6, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v8, 0x7

    .line 13
    const/16 v9, 0x8

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroid/app/RemoteAction;

    .line 22
    .line 23
    invoke-static {v0}, Lts2;->h(Landroid/app/RemoteAction;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ldn8;->a:Ldn8;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lt28;

    .line 32
    .line 33
    iput-object v13, v0, Lt28;->G0:Ls28;

    .line 34
    .line 35
    invoke-static {v0}, Lch3;->I(Lw07;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lnr4;->E(Lg34;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lz68;->W(Lrv1;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_1
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, Lgz7;

    .line 51
    .line 52
    const-string v2, "100%"

    .line 53
    .line 54
    const-string v3, "SVG document is empty"

    .line 55
    .line 56
    iget-object v0, v1, Lgz7;->a:Ld73;

    .line 57
    .line 58
    iget-object v4, v1, Lgz7;->b:Lpd5;

    .line 59
    .line 60
    invoke-interface {v0}, Ld73;->source()Lba0;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    sget-object v0, Ldz7;->a:Ldz7;

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {v0, v5}, Ldz7;->a(Lba0;)Ldq;

    .line 67
    .line 68
    .line 69
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 70
    :try_start_1
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    move-object v0, v13

    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    move-object v6, v0

    .line 79
    :try_start_2
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_2
    move-exception v0

    .line 84
    invoke-static {v6, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    move-object v0, v6

    .line 88
    move-object v6, v13

    .line 89
    :goto_1
    if-nez v0, :cond_13

    .line 90
    .line 91
    iget-object v0, v6, Ldq;->Y:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lf63;

    .line 94
    .line 95
    iget-object v5, v0, Lf63;->Y:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v5, Lzs6;

    .line 98
    .line 99
    if-eqz v5, :cond_12

    .line 100
    .line 101
    iget-object v5, v5, Lkt6;->o:Lr05;

    .line 102
    .line 103
    if-nez v5, :cond_0

    .line 104
    .line 105
    move-object v7, v13

    .line 106
    goto :goto_2

    .line 107
    :cond_0
    new-instance v7, Landroid/graphics/RectF;

    .line 108
    .line 109
    iget v8, v5, Lr05;->b:F

    .line 110
    .line 111
    iget v9, v5, Lr05;->c:F

    .line 112
    .line 113
    invoke-virtual {v5}, Lr05;->c()F

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    invoke-virtual {v5}, Lr05;->d()F

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-direct {v7, v8, v9, v14, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 122
    .line 123
    .line 124
    :goto_2
    if-eqz v7, :cond_1

    .line 125
    .line 126
    new-instance v5, Lez7;

    .line 127
    .line 128
    iget v8, v7, Landroid/graphics/RectF;->left:F

    .line 129
    .line 130
    iget v9, v7, Landroid/graphics/RectF;->top:F

    .line 131
    .line 132
    iget v14, v7, Landroid/graphics/RectF;->right:F

    .line 133
    .line 134
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 135
    .line 136
    invoke-direct {v5, v8, v9, v14, v7}, Lez7;-><init>(FFFF)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_1
    move-object v5, v13

    .line 141
    :goto_3
    if-eqz v5, :cond_2

    .line 142
    .line 143
    iget v7, v5, Lez7;->c:F

    .line 144
    .line 145
    iget v8, v5, Lez7;->a:F

    .line 146
    .line 147
    sub-float/2addr v7, v8

    .line 148
    iget v8, v5, Lez7;->d:F

    .line 149
    .line 150
    iget v9, v5, Lez7;->b:F

    .line 151
    .line 152
    sub-float/2addr v8, v9

    .line 153
    goto :goto_4

    .line 154
    :cond_2
    iget-object v7, v0, Lf63;->Y:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v7, Lzs6;

    .line 157
    .line 158
    if-eqz v7, :cond_11

    .line 159
    .line 160
    invoke-virtual {v0}, Lf63;->o()Lr05;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    iget v7, v7, Lr05;->d:F

    .line 165
    .line 166
    iget-object v8, v0, Lf63;->Y:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v8, Lzs6;

    .line 169
    .line 170
    if-eqz v8, :cond_10

    .line 171
    .line 172
    invoke-virtual {v0}, Lf63;->o()Lr05;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    iget v8, v8, Lr05;->e:F

    .line 177
    .line 178
    :goto_4
    iget-object v9, v4, Lpd5;->b:Lta7;

    .line 179
    .line 180
    iget-object v14, v4, Lpd5;->c:Lpw6;

    .line 181
    .line 182
    sget-object v15, Lta7;->c:Lta7;

    .line 183
    .line 184
    invoke-static {v9, v15}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    const/4 v15, 0x0

    .line 189
    if-eqz v9, :cond_4

    .line 190
    .line 191
    iget-object v1, v1, Lgz7;->c:Lgn2;

    .line 192
    .line 193
    iget-object v9, v4, Lpd5;->a:Landroid/content/Context;

    .line 194
    .line 195
    invoke-interface {v1, v9}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Ljava/lang/Number;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    cmpl-float v9, v7, v15

    .line 206
    .line 207
    if-lez v9, :cond_3

    .line 208
    .line 209
    mul-float/2addr v7, v1

    .line 210
    :cond_3
    cmpl-float v9, v8, v15

    .line 211
    .line 212
    if-lez v9, :cond_4

    .line 213
    .line 214
    mul-float/2addr v8, v1

    .line 215
    :cond_4
    cmpl-float v1, v7, v15

    .line 216
    .line 217
    if-lez v1, :cond_5

    .line 218
    .line 219
    invoke-static {v7}, Lnr4;->O(F)I

    .line 220
    .line 221
    .line 222
    move-result v16

    .line 223
    move/from16 v9, v16

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_5
    const/16 v9, 0x200

    .line 227
    .line 228
    :goto_5
    cmpl-float v16, v8, v15

    .line 229
    .line 230
    if-lez v16, :cond_6

    .line 231
    .line 232
    invoke-static {v8}, Lnr4;->O(F)I

    .line 233
    .line 234
    .line 235
    move-result v17

    .line 236
    move/from16 v26, v17

    .line 237
    .line 238
    move-object/from16 v17, v13

    .line 239
    .line 240
    move/from16 v13, v26

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_6
    move-object/from16 v17, v13

    .line 244
    .line 245
    const/16 v13, 0x200

    .line 246
    .line 247
    :goto_6
    iget-object v11, v4, Lpd5;->b:Lta7;

    .line 248
    .line 249
    sget-object v12, Ly63;->b:Lf4;

    .line 250
    .line 251
    invoke-static {v4, v12}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v19

    .line 255
    move/from16 p0, v15

    .line 256
    .line 257
    move-object/from16 v15, v19

    .line 258
    .line 259
    check-cast v15, Lta7;

    .line 260
    .line 261
    invoke-static {v9, v13, v11, v14, v15}, Lw79;->l(IILta7;Lpw6;Lta7;)J

    .line 262
    .line 263
    .line 264
    move-result-wide v19

    .line 265
    const/16 v9, 0x20

    .line 266
    .line 267
    shr-long v10, v19, v9

    .line 268
    .line 269
    long-to-int v9, v10

    .line 270
    const-wide v10, 0xffffffffL

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    and-long v10, v19, v10

    .line 276
    .line 277
    long-to-int v10, v10

    .line 278
    if-lez v1, :cond_c

    .line 279
    .line 280
    if-lez v16, :cond_c

    .line 281
    .line 282
    int-to-float v1, v9

    .line 283
    int-to-float v9, v10

    .line 284
    invoke-static {v4, v12}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    check-cast v10, Lta7;

    .line 289
    .line 290
    div-float/2addr v1, v7

    .line 291
    div-float/2addr v9, v8

    .line 292
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    if-eqz v11, :cond_8

    .line 297
    .line 298
    const/4 v13, 0x1

    .line 299
    if-ne v11, v13, :cond_7

    .line 300
    .line 301
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    goto :goto_8

    .line 306
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 307
    .line 308
    .line 309
    :goto_7
    move-object/from16 v13, v17

    .line 310
    .line 311
    goto/16 :goto_a

    .line 312
    .line 313
    :cond_8
    invoke-static {v1, v9}, Ljava/lang/Math;->max(FF)F

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    :goto_8
    iget-object v9, v10, Lta7;->a:Lyo1;

    .line 318
    .line 319
    instance-of v11, v9, Lwo1;

    .line 320
    .line 321
    if-eqz v11, :cond_9

    .line 322
    .line 323
    check-cast v9, Lwo1;

    .line 324
    .line 325
    iget v9, v9, Lwo1;->a:I

    .line 326
    .line 327
    int-to-float v9, v9

    .line 328
    div-float/2addr v9, v7

    .line 329
    cmpl-float v11, v1, v9

    .line 330
    .line 331
    if-lez v11, :cond_9

    .line 332
    .line 333
    move v1, v9

    .line 334
    :cond_9
    iget-object v9, v10, Lta7;->b:Lyo1;

    .line 335
    .line 336
    instance-of v10, v9, Lwo1;

    .line 337
    .line 338
    if-eqz v10, :cond_a

    .line 339
    .line 340
    check-cast v9, Lwo1;

    .line 341
    .line 342
    iget v9, v9, Lwo1;->a:I

    .line 343
    .line 344
    int-to-float v9, v9

    .line 345
    div-float/2addr v9, v8

    .line 346
    cmpl-float v10, v1, v9

    .line 347
    .line 348
    if-lez v10, :cond_a

    .line 349
    .line 350
    move v1, v9

    .line 351
    :cond_a
    mul-float v9, v1, v7

    .line 352
    .line 353
    float-to-int v9, v9

    .line 354
    mul-float/2addr v1, v8

    .line 355
    float-to-int v10, v1

    .line 356
    if-nez v5, :cond_c

    .line 357
    .line 358
    sub-float v7, v7, p0

    .line 359
    .line 360
    sub-float v8, v8, p0

    .line 361
    .line 362
    iget-object v1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v1, Lzs6;

    .line 365
    .line 366
    if-eqz v1, :cond_b

    .line 367
    .line 368
    new-instance v5, Lr05;

    .line 369
    .line 370
    move/from16 v11, p0

    .line 371
    .line 372
    invoke-direct {v5, v11, v11, v7, v8}, Lr05;-><init>(FFFF)V

    .line 373
    .line 374
    .line 375
    iput-object v5, v1, Lkt6;->o:Lr05;

    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_b
    invoke-static {v3}, Lbt;->q(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_c
    :goto_9
    iget-object v1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v1, Lzs6;

    .line 385
    .line 386
    if-eqz v1, :cond_f

    .line 387
    .line 388
    invoke-static {v2}, Lpu6;->s(Ljava/lang/String;)Lks6;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    iput-object v5, v1, Lzs6;->r:Lks6;

    .line 393
    .line 394
    iget-object v1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v1, Lzs6;

    .line 397
    .line 398
    if-eqz v1, :cond_e

    .line 399
    .line 400
    invoke-static {v2}, Lpu6;->s(Ljava/lang/String;)Lks6;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    iput-object v2, v1, Lzs6;->s:Lks6;

    .line 405
    .line 406
    sget-object v1, La73;->a:Lf4;

    .line 407
    .line 408
    invoke-static {v4, v1}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    check-cast v1, Ljava/lang/String;

    .line 413
    .line 414
    if-eqz v1, :cond_d

    .line 415
    .line 416
    new-instance v2, Lxd6;

    .line 417
    .line 418
    const/4 v3, 0x0

    .line 419
    invoke-direct {v2, v3}, Lxd6;-><init>(B)V

    .line 420
    .line 421
    .line 422
    new-instance v3, Lfc0;

    .line 423
    .line 424
    const/4 v4, 0x2

    .line 425
    invoke-direct {v3, v4}, Lfc0;-><init>(I)V

    .line 426
    .line 427
    .line 428
    new-instance v4, Lsb0;

    .line 429
    .line 430
    invoke-direct {v4, v1}, Lsb0;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4}, Lnv0;->T()V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3, v4}, Lfc0;->e(Lsb0;)Lcc0;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    iput-object v1, v2, Lxd6;->Y:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v2, v6, Ldq;->Z:Ljava/lang/Object;

    .line 443
    .line 444
    :cond_d
    new-instance v1, Liz7;

    .line 445
    .line 446
    iget-object v2, v6, Ldq;->Z:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v2, Lxd6;

    .line 449
    .line 450
    invoke-direct {v1, v0, v2, v9, v10}, Liz7;-><init>(Lf63;Lxd6;II)V

    .line 451
    .line 452
    .line 453
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 454
    .line 455
    invoke-static {v9, v10, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v2, Landroid/graphics/Canvas;

    .line 460
    .line 461
    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v2}, Liz7;->d(Landroid/graphics/Canvas;)V

    .line 465
    .line 466
    .line 467
    new-instance v1, Ld60;

    .line 468
    .line 469
    invoke-direct {v1, v0}, Ld60;-><init>(Landroid/graphics/Bitmap;)V

    .line 470
    .line 471
    .line 472
    new-instance v0, Lnd1;

    .line 473
    .line 474
    const/4 v13, 0x1

    .line 475
    invoke-direct {v0, v1, v13}, Lnd1;-><init>(Ld53;Z)V

    .line 476
    .line 477
    .line 478
    move-object v13, v0

    .line 479
    goto :goto_a

    .line 480
    :cond_e
    invoke-static {v3}, Lbt;->q(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_7

    .line 484
    .line 485
    :cond_f
    invoke-static {v3}, Lbt;->q(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_7

    .line 489
    .line 490
    :cond_10
    move-object/from16 v17, v13

    .line 491
    .line 492
    invoke-static {v3}, Lbt;->q(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_11
    move-object/from16 v17, v13

    .line 497
    .line 498
    invoke-static {v3}, Lbt;->q(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_12
    move-object/from16 v17, v13

    .line 503
    .line 504
    invoke-static {v3}, Lbt;->q(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :goto_a
    return-object v13

    .line 508
    :cond_13
    throw v0

    .line 509
    :pswitch_2
    move-object/from16 v17, v13

    .line 510
    .line 511
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, Lwu7;

    .line 514
    .line 515
    new-instance v1, Lou7;

    .line 516
    .line 517
    iget-object v0, v0, Lwu7;->t1:Lyk2;

    .line 518
    .line 519
    if-eqz v0, :cond_14

    .line 520
    .line 521
    invoke-direct {v1, v0}, Lou7;-><init>(Lyk2;)V

    .line 522
    .line 523
    .line 524
    return-object v1

    .line 525
    :cond_14
    const-string v0, "binding"

    .line 526
    .line 527
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    throw v17

    .line 531
    :pswitch_3
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Lvp7;

    .line 534
    .line 535
    invoke-virtual {v0}, Lvp7;->a()Lb44;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    iget-object v1, v0, Lb44;->X:Landroidx/compose/ui/node/LayoutNode;

    .line 540
    .line 541
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->n()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    check-cast v10, Lh05;

    .line 546
    .line 547
    iget-object v10, v10, Lh05;->Y:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v10, Lc15;

    .line 550
    .line 551
    iget v10, v10, Lc15;->Z:I

    .line 552
    .line 553
    iget v11, v0, Lb44;->p0:I

    .line 554
    .line 555
    if-eq v11, v10, :cond_1a

    .line 556
    .line 557
    iget-object v0, v0, Lb44;->h0:Ls05;

    .line 558
    .line 559
    iget-object v10, v0, Ls05;->c:[Ljava/lang/Object;

    .line 560
    .line 561
    iget-object v0, v0, Ls05;->a:[J

    .line 562
    .line 563
    array-length v11, v0

    .line 564
    const/16 v18, 0x2

    .line 565
    .line 566
    add-int/lit8 v11, v11, -0x2

    .line 567
    .line 568
    if-ltz v11, :cond_18

    .line 569
    .line 570
    const/4 v12, 0x0

    .line 571
    :goto_b
    aget-wide v14, v0, v12

    .line 572
    .line 573
    const-wide/16 v16, 0x80

    .line 574
    .line 575
    not-long v2, v14

    .line 576
    shl-long/2addr v2, v8

    .line 577
    and-long/2addr v2, v14

    .line 578
    and-long/2addr v2, v6

    .line 579
    cmp-long v2, v2, v6

    .line 580
    .line 581
    if-eqz v2, :cond_17

    .line 582
    .line 583
    sub-int v2, v12, v11

    .line 584
    .line 585
    not-int v2, v2

    .line 586
    ushr-int/lit8 v2, v2, 0x1f

    .line 587
    .line 588
    rsub-int/lit8 v2, v2, 0x8

    .line 589
    .line 590
    const/4 v3, 0x0

    .line 591
    :goto_c
    if-ge v3, v2, :cond_16

    .line 592
    .line 593
    and-long v19, v14, v4

    .line 594
    .line 595
    cmp-long v18, v19, v16

    .line 596
    .line 597
    if-gez v18, :cond_15

    .line 598
    .line 599
    shl-int/lit8 v18, v12, 0x3

    .line 600
    .line 601
    add-int v18, v18, v3

    .line 602
    .line 603
    aget-object v18, v10, v18

    .line 604
    .line 605
    move-wide/from16 v19, v4

    .line 606
    .line 607
    move-object/from16 v4, v18

    .line 608
    .line 609
    check-cast v4, Lt34;

    .line 610
    .line 611
    const/4 v13, 0x1

    .line 612
    iput-boolean v13, v4, Lt34;->d:Z

    .line 613
    .line 614
    goto :goto_d

    .line 615
    :cond_15
    move-wide/from16 v19, v4

    .line 616
    .line 617
    :goto_d
    shr-long/2addr v14, v9

    .line 618
    add-int/lit8 v3, v3, 0x1

    .line 619
    .line 620
    move-wide/from16 v4, v19

    .line 621
    .line 622
    goto :goto_c

    .line 623
    :cond_16
    move-wide/from16 v19, v4

    .line 624
    .line 625
    if-ne v2, v9, :cond_18

    .line 626
    .line 627
    goto :goto_e

    .line 628
    :cond_17
    move-wide/from16 v19, v4

    .line 629
    .line 630
    :goto_e
    if-eq v12, v11, :cond_18

    .line 631
    .line 632
    add-int/lit8 v12, v12, 0x1

    .line 633
    .line 634
    move-wide/from16 v4, v19

    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_18
    iget-object v0, v1, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 638
    .line 639
    if-eqz v0, :cond_19

    .line 640
    .line 641
    iget-object v0, v1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 642
    .line 643
    iget-boolean v0, v0, Lr34;->e:Z

    .line 644
    .line 645
    if-nez v0, :cond_1a

    .line 646
    .line 647
    const/4 v3, 0x0

    .line 648
    invoke-static {v1, v3, v8}, Landroidx/compose/ui/node/LayoutNode;->W(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 649
    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_19
    const/4 v3, 0x0

    .line 653
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->q()Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-nez v0, :cond_1a

    .line 658
    .line 659
    invoke-static {v1, v3, v8}, Landroidx/compose/ui/node/LayoutNode;->Y(Landroidx/compose/ui/node/LayoutNode;ZI)V

    .line 660
    .line 661
    .line 662
    :cond_1a
    :goto_f
    sget-object v0, Ldn8;->a:Ldn8;

    .line 663
    .line 664
    return-object v0

    .line 665
    :pswitch_4
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v0, Lsu/happ/proxyutility/feature/stories/StoryProgressView;

    .line 668
    .line 669
    sget v1, Lsu/happ/proxyutility/feature/stories/StoryProgressView;->p0:I

    .line 670
    .line 671
    const/4 v4, 0x2

    .line 672
    new-array v1, v4, [F

    .line 673
    .line 674
    fill-array-data v1, :array_0

    .line 675
    .line 676
    .line 677
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    const-wide/16 v2, 0x2710

    .line 682
    .line 683
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 684
    .line 685
    .line 686
    new-instance v2, Lnm1;

    .line 687
    .line 688
    const/4 v3, 0x3

    .line 689
    invoke-direct {v2, v0, v3}, Lnm1;-><init>(Ljava/lang/Object;B)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 693
    .line 694
    .line 695
    new-instance v2, Lsk7;

    .line 696
    .line 697
    invoke-direct {v2, v0, v1}, Lsk7;-><init>(Lsu/happ/proxyutility/feature/stories/StoryProgressView;Landroid/animation/ValueAnimator;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 701
    .line 702
    .line 703
    return-object v1

    .line 704
    :pswitch_5
    move-object/from16 v17, v13

    .line 705
    .line 706
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v0, Lsu/happ/proxyutility/feature/statistics/StatisticsSettingsActivity;

    .line 709
    .line 710
    new-instance v1, Lni7;

    .line 711
    .line 712
    iget-object v0, v0, Lsu/happ/proxyutility/feature/statistics/StatisticsSettingsActivity;->Q0:Lu6;

    .line 713
    .line 714
    if-eqz v0, :cond_1b

    .line 715
    .line 716
    invoke-direct {v1, v0}, Lni7;-><init>(Lu6;)V

    .line 717
    .line 718
    .line 719
    return-object v1

    .line 720
    :cond_1b
    const-string v0, "binding"

    .line 721
    .line 722
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    throw v17

    .line 726
    :pswitch_6
    move-wide/from16 v19, v4

    .line 727
    .line 728
    const-wide/16 v16, 0x80

    .line 729
    .line 730
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 731
    .line 732
    move-object v1, v0

    .line 733
    check-cast v1, Lxd7;

    .line 734
    .line 735
    :goto_10
    iget-object v2, v1, Lxd7;->g:Ljava/lang/Object;

    .line 736
    .line 737
    monitor-enter v2

    .line 738
    :try_start_3
    iget-boolean v0, v1, Lxd7;->c:Z

    .line 739
    .line 740
    if-nez v0, :cond_21

    .line 741
    .line 742
    const/4 v13, 0x1

    .line 743
    iput-boolean v13, v1, Lxd7;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 744
    .line 745
    :try_start_4
    iget-object v0, v1, Lxd7;->f:Lc15;

    .line 746
    .line 747
    iget-object v3, v0, Lc15;->X:[Ljava/lang/Object;

    .line 748
    .line 749
    iget v0, v0, Lc15;->Z:I

    .line 750
    .line 751
    const/4 v4, 0x0

    .line 752
    :goto_11
    if-ge v4, v0, :cond_20

    .line 753
    .line 754
    aget-object v5, v3, v4

    .line 755
    .line 756
    check-cast v5, Lwd7;

    .line 757
    .line 758
    iget-object v10, v5, Lwd7;->g:Lt05;

    .line 759
    .line 760
    iget-object v5, v5, Lwd7;->a:Lgn2;

    .line 761
    .line 762
    iget-object v11, v10, Lt05;->b:[Ljava/lang/Object;

    .line 763
    .line 764
    iget-object v12, v10, Lt05;->a:[J

    .line 765
    .line 766
    array-length v14, v12

    .line 767
    const/16 v18, 0x2

    .line 768
    .line 769
    add-int/lit8 v14, v14, -0x2

    .line 770
    .line 771
    move-wide/from16 v21, v6

    .line 772
    .line 773
    if-ltz v14, :cond_1f

    .line 774
    .line 775
    const/4 v15, 0x0

    .line 776
    :goto_12
    aget-wide v6, v12, v15

    .line 777
    .line 778
    move/from16 v23, v14

    .line 779
    .line 780
    not-long v13, v6

    .line 781
    shl-long/2addr v13, v8

    .line 782
    and-long/2addr v13, v6

    .line 783
    and-long v13, v13, v21

    .line 784
    .line 785
    cmp-long v13, v13, v21

    .line 786
    .line 787
    if-eqz v13, :cond_1e

    .line 788
    .line 789
    sub-int v13, v15, v23

    .line 790
    .line 791
    not-int v13, v13

    .line 792
    ushr-int/lit8 v13, v13, 0x1f

    .line 793
    .line 794
    rsub-int/lit8 v13, v13, 0x8

    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    :goto_13
    if-ge v14, v13, :cond_1d

    .line 798
    .line 799
    and-long v24, v6, v19

    .line 800
    .line 801
    cmp-long v24, v24, v16

    .line 802
    .line 803
    if-gez v24, :cond_1c

    .line 804
    .line 805
    shl-int/lit8 v24, v15, 0x3

    .line 806
    .line 807
    add-int v24, v24, v14

    .line 808
    .line 809
    aget-object v8, v11, v24

    .line 810
    .line 811
    invoke-interface {v5, v8}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    :cond_1c
    shr-long/2addr v6, v9

    .line 815
    add-int/lit8 v14, v14, 0x1

    .line 816
    .line 817
    const/4 v8, 0x7

    .line 818
    goto :goto_13

    .line 819
    :cond_1d
    if-ne v13, v9, :cond_1f

    .line 820
    .line 821
    :cond_1e
    move/from16 v14, v23

    .line 822
    .line 823
    if-eq v15, v14, :cond_1f

    .line 824
    .line 825
    add-int/lit8 v15, v15, 0x1

    .line 826
    .line 827
    const/4 v8, 0x7

    .line 828
    const/4 v13, 0x1

    .line 829
    goto :goto_12

    .line 830
    :cond_1f
    invoke-virtual {v10}, Lt05;->b()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 831
    .line 832
    .line 833
    add-int/lit8 v4, v4, 0x1

    .line 834
    .line 835
    move-wide/from16 v6, v21

    .line 836
    .line 837
    const/4 v8, 0x7

    .line 838
    const/4 v13, 0x1

    .line 839
    goto :goto_11

    .line 840
    :goto_14
    const/4 v3, 0x0

    .line 841
    goto :goto_15

    .line 842
    :catchall_3
    move-exception v0

    .line 843
    goto :goto_14

    .line 844
    :cond_20
    move-wide/from16 v21, v6

    .line 845
    .line 846
    const/4 v3, 0x0

    .line 847
    const/16 v18, 0x2

    .line 848
    .line 849
    :try_start_5
    iput-boolean v3, v1, Lxd7;->c:Z

    .line 850
    .line 851
    goto :goto_16

    .line 852
    :catchall_4
    move-exception v0

    .line 853
    goto :goto_17

    .line 854
    :goto_15
    iput-boolean v3, v1, Lxd7;->c:Z

    .line 855
    .line 856
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 857
    :cond_21
    move-wide/from16 v21, v6

    .line 858
    .line 859
    const/16 v18, 0x2

    .line 860
    .line 861
    :goto_16
    monitor-exit v2

    .line 862
    invoke-virtual {v1}, Lxd7;->b()Z

    .line 863
    .line 864
    .line 865
    move-result v0

    .line 866
    if-nez v0, :cond_22

    .line 867
    .line 868
    sget-object v0, Ldn8;->a:Ldn8;

    .line 869
    .line 870
    return-object v0

    .line 871
    :cond_22
    move-wide/from16 v6, v21

    .line 872
    .line 873
    const/4 v8, 0x7

    .line 874
    goto/16 :goto_10

    .line 875
    .line 876
    :goto_17
    monitor-exit v2

    .line 877
    throw v0

    .line 878
    :pswitch_7
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v0, Lwb7;

    .line 881
    .line 882
    iget-object v0, v0, Lwb7;->o0:Lrh5;

    .line 883
    .line 884
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    check-cast v0, Ljava/lang/Boolean;

    .line 889
    .line 890
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 891
    .line 892
    .line 893
    sget-object v0, Ldn8;->a:Ldn8;

    .line 894
    .line 895
    return-object v0

    .line 896
    :pswitch_8
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v0, Lo87;

    .line 899
    .line 900
    iget-object v0, v0, Lo87;->c:Lta2;

    .line 901
    .line 902
    return-object v0

    .line 903
    :pswitch_9
    move-object/from16 v17, v13

    .line 904
    .line 905
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lr67;

    .line 908
    .line 909
    iget-object v1, v0, Lr67;->Z:Lrh5;

    .line 910
    .line 911
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    check-cast v2, Lua7;

    .line 916
    .line 917
    iget-wide v2, v2, Lua7;->a:J

    .line 918
    .line 919
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    cmp-long v2, v2, v4

    .line 925
    .line 926
    if-nez v2, :cond_23

    .line 927
    .line 928
    goto :goto_18

    .line 929
    :cond_23
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    check-cast v2, Lua7;

    .line 934
    .line 935
    iget-wide v2, v2, Lua7;->a:J

    .line 936
    .line 937
    invoke-static {v2, v3}, Lua7;->e(J)Z

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    if-eqz v2, :cond_24

    .line 942
    .line 943
    :goto_18
    move-object/from16 v13, v17

    .line 944
    .line 945
    goto :goto_19

    .line 946
    :cond_24
    iget-object v0, v0, Lr67;->X:Lq67;

    .line 947
    .line 948
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    check-cast v1, Lua7;

    .line 953
    .line 954
    iget-wide v1, v1, Lua7;->a:J

    .line 955
    .line 956
    invoke-virtual {v0, v1, v2}, Lq67;->b(J)Landroid/graphics/Shader;

    .line 957
    .line 958
    .line 959
    move-result-object v13

    .line 960
    :goto_19
    return-object v13

    .line 961
    :pswitch_a
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v0, Lg37;

    .line 964
    .line 965
    iget-object v1, v0, Lg37;->j:[Le37;

    .line 966
    .line 967
    invoke-static {v0, v1}, Ldh3;->z(Le37;[Le37;)I

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    return-object v0

    .line 976
    :pswitch_b
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 977
    .line 978
    return-object v0

    .line 979
    :pswitch_c
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v0, Landroid/app/Application;

    .line 982
    .line 983
    new-instance v1, Lak7;

    .line 984
    .line 985
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    invoke-direct {v1, v0}, Lak7;-><init>(Landroid/content/Context;)V

    .line 993
    .line 994
    .line 995
    return-object v1

    .line 996
    :pswitch_d
    move-object/from16 v17, v13

    .line 997
    .line 998
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v0, Lcy6;

    .line 1001
    .line 1002
    sget-object v1, Lkf5;->a:Lz01;

    .line 1003
    .line 1004
    invoke-static {v0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    check-cast v1, Lud;

    .line 1009
    .line 1010
    iput-object v1, v0, Lcy6;->C0:Lud;

    .line 1011
    .line 1012
    if-eqz v1, :cond_25

    .line 1013
    .line 1014
    new-instance v2, Ltd;

    .line 1015
    .line 1016
    iget-object v3, v1, Lud;->a:Landroid/content/Context;

    .line 1017
    .line 1018
    iget-object v4, v1, Lud;->b:Lfi1;

    .line 1019
    .line 1020
    iget-wide v5, v1, Lud;->c:J

    .line 1021
    .line 1022
    iget-object v7, v1, Lud;->d:Lig5;

    .line 1023
    .line 1024
    invoke-direct/range {v2 .. v7}, Ltd;-><init>(Landroid/content/Context;Lfi1;JLig5;)V

    .line 1025
    .line 1026
    .line 1027
    move-object v13, v2

    .line 1028
    goto :goto_1a

    .line 1029
    :cond_25
    move-object/from16 v13, v17

    .line 1030
    .line 1031
    :goto_1a
    iput-object v13, v0, Lcy6;->D0:Ltd;

    .line 1032
    .line 1033
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1034
    .line 1035
    return-object v0

    .line 1036
    :pswitch_e
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, Lyv6;

    .line 1039
    .line 1040
    invoke-interface {v0}, Ld94;->h()Lg94;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v1

    .line 1044
    new-instance v2, Lr86;

    .line 1045
    .line 1046
    const/4 v3, 0x0

    .line 1047
    invoke-direct {v2, v0, v3}, Lr86;-><init>(Ljava/lang/Object;B)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v1, v2}, Lg94;->a(Lc94;)V

    .line 1051
    .line 1052
    .line 1053
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1054
    .line 1055
    return-object v0

    .line 1056
    :pswitch_f
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v0, Lfx8;

    .line 1059
    .line 1060
    invoke-static {v0}, Lsv6;->c(Lfx8;)Luv6;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    return-object v0

    .line 1065
    :pswitch_10
    move-object/from16 v17, v13

    .line 1066
    .line 1067
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v0, Lnv6;

    .line 1070
    .line 1071
    iget-object v0, v0, Lnv6;->Z:Lxd6;

    .line 1072
    .line 1073
    if-eqz v0, :cond_27

    .line 1074
    .line 1075
    const/4 v3, 0x0

    .line 1076
    new-array v1, v3, [Lqg5;

    .line 1077
    .line 1078
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    check-cast v1, [Lqg5;

    .line 1083
    .line 1084
    invoke-static {v1}, Ldh3;->h([Lqg5;)Landroid/os/Bundle;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    invoke-virtual {v0, v1}, Lxd6;->z(Landroid/os/Bundle;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v0

    .line 1095
    if-eqz v0, :cond_26

    .line 1096
    .line 1097
    goto :goto_1b

    .line 1098
    :cond_26
    move-object v13, v1

    .line 1099
    goto :goto_1c

    .line 1100
    :cond_27
    :goto_1b
    move-object/from16 v13, v17

    .line 1101
    .line 1102
    :goto_1c
    return-object v13

    .line 1103
    :pswitch_11
    move-object/from16 v17, v13

    .line 1104
    .line 1105
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1106
    .line 1107
    check-cast v0, Lhv6;

    .line 1108
    .line 1109
    iget-object v1, v0, Lhv6;->X:Lbw6;

    .line 1110
    .line 1111
    iget-object v2, v0, Lhv6;->f0:Ljava/lang/Object;

    .line 1112
    .line 1113
    if-eqz v2, :cond_28

    .line 1114
    .line 1115
    invoke-interface {v1, v0, v2}, Lbw6;->U(Lhv6;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v13

    .line 1119
    goto :goto_1d

    .line 1120
    :cond_28
    const-string v0, "Value should be initialized"

    .line 1121
    .line 1122
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1123
    .line 1124
    .line 1125
    move-object/from16 v13, v17

    .line 1126
    .line 1127
    :goto_1d
    return-object v13

    .line 1128
    :pswitch_12
    move-object/from16 v17, v13

    .line 1129
    .line 1130
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1131
    .line 1132
    check-cast v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditActivity;

    .line 1133
    .line 1134
    new-instance v1, Lym6;

    .line 1135
    .line 1136
    iget-object v0, v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditActivity;->Q0:Lfu6;

    .line 1137
    .line 1138
    if-eqz v0, :cond_29

    .line 1139
    .line 1140
    invoke-direct {v1, v0}, Lym6;-><init>(Lfu6;)V

    .line 1141
    .line 1142
    .line 1143
    return-object v1

    .line 1144
    :cond_29
    const-string v0, "binding"

    .line 1145
    .line 1146
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    throw v17

    .line 1150
    :pswitch_13
    move-object/from16 v17, v13

    .line 1151
    .line 1152
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;

    .line 1155
    .line 1156
    new-instance v1, Lwm6;

    .line 1157
    .line 1158
    iget-object v0, v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->Q0:Ld6;

    .line 1159
    .line 1160
    if-eqz v0, :cond_2a

    .line 1161
    .line 1162
    invoke-direct {v1, v0}, Lwm6;-><init>(Ld6;)V

    .line 1163
    .line 1164
    .line 1165
    return-object v1

    .line 1166
    :cond_2a
    const-string v0, "binding"

    .line 1167
    .line 1168
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    throw v17

    .line 1172
    :pswitch_14
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v0, Lsq6;

    .line 1175
    .line 1176
    sget-object v1, Loq6;->a:Loq6;

    .line 1177
    .line 1178
    invoke-virtual {v0, v1}, Lsq6;->f(Lqq6;)V

    .line 1179
    .line 1180
    .line 1181
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1182
    .line 1183
    return-object v0

    .line 1184
    :pswitch_15
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v0, Lmn6;

    .line 1187
    .line 1188
    invoke-virtual {v0}, Lmn6;->l()Lht1;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    iget-object v0, v0, Lht1;->c:Lh76;

    .line 1193
    .line 1194
    return-object v0

    .line 1195
    :pswitch_16
    move-object/from16 v17, v13

    .line 1196
    .line 1197
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1198
    .line 1199
    check-cast v0, Lof6;

    .line 1200
    .line 1201
    iget-object v1, v0, Lof6;->X:Ljava/lang/ClassLoader;

    .line 1202
    .line 1203
    iget-object v0, v0, Lof6;->Y:Ls92;

    .line 1204
    .line 1205
    const-string v2, ""

    .line 1206
    .line 1207
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v2

    .line 1218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    new-instance v3, Ljava/util/ArrayList;

    .line 1222
    .line 1223
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1224
    .line 1225
    .line 1226
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    :cond_2b
    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v4

    .line 1234
    if-eqz v4, :cond_2d

    .line 1235
    .line 1236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v4

    .line 1240
    check-cast v4, Ljava/net/URL;

    .line 1241
    .line 1242
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v5

    .line 1249
    const-string v6, "file"

    .line 1250
    .line 1251
    invoke-static {v5, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v5

    .line 1255
    if-nez v5, :cond_2c

    .line 1256
    .line 1257
    move-object/from16 v5, v17

    .line 1258
    .line 1259
    goto :goto_1f

    .line 1260
    :cond_2c
    sget-object v5, Loi5;->Y:Ljava/lang/String;

    .line 1261
    .line 1262
    new-instance v5, Ljava/io/File;

    .line 1263
    .line 1264
    invoke-virtual {v4}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v4

    .line 1268
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-static {v5}, Lg55;->s(Ljava/io/File;)Loi5;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v4

    .line 1275
    new-instance v5, Lqg5;

    .line 1276
    .line 1277
    invoke-direct {v5, v0, v4}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1278
    .line 1279
    .line 1280
    :goto_1f
    if-eqz v5, :cond_2b

    .line 1281
    .line 1282
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    goto :goto_1e

    .line 1286
    :cond_2d
    const-string v2, "META-INF/MANIFEST.MF"

    .line 1287
    .line 1288
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v1

    .line 1292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1293
    .line 1294
    .line 1295
    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v1

    .line 1299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    new-instance v2, Ljava/util/ArrayList;

    .line 1303
    .line 1304
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1305
    .line 1306
    .line 1307
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    :cond_2e
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1312
    .line 1313
    .line 1314
    move-result v4

    .line 1315
    if-eqz v4, :cond_31

    .line 1316
    .line 1317
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    check-cast v4, Ljava/net/URL;

    .line 1322
    .line 1323
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v4

    .line 1330
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1331
    .line 1332
    .line 1333
    const-string v5, "jar:file:"

    .line 1334
    .line 1335
    const/4 v6, 0x0

    .line 1336
    invoke-static {v4, v6, v5}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v5

    .line 1340
    if-nez v5, :cond_2f

    .line 1341
    .line 1342
    :goto_21
    move-object/from16 v7, v17

    .line 1343
    .line 1344
    goto :goto_22

    .line 1345
    :cond_2f
    const-string v5, "!"

    .line 1346
    .line 1347
    const/4 v7, 0x6

    .line 1348
    invoke-static {v4, v5, v6, v7}, Lfm7;->r0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 1349
    .line 1350
    .line 1351
    move-result v5

    .line 1352
    const/4 v7, -0x1

    .line 1353
    if-ne v5, v7, :cond_30

    .line 1354
    .line 1355
    goto :goto_21

    .line 1356
    :cond_30
    sget-object v7, Loi5;->Y:Ljava/lang/String;

    .line 1357
    .line 1358
    new-instance v7, Ljava/io/File;

    .line 1359
    .line 1360
    const/4 v8, 0x4

    .line 1361
    invoke-virtual {v4, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v4

    .line 1365
    invoke-static {v4}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v4

    .line 1369
    invoke-direct {v7, v4}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 1370
    .line 1371
    .line 1372
    invoke-static {v7}, Lg55;->s(Ljava/io/File;)Loi5;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v4

    .line 1376
    new-instance v5, Lzw5;

    .line 1377
    .line 1378
    invoke-direct {v5, v9}, Lzw5;-><init>(B)V

    .line 1379
    .line 1380
    .line 1381
    invoke-static {v4, v0, v5}, Lu28;->l(Loi5;Ls92;Lgn2;)Ll79;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v4

    .line 1385
    sget-object v5, Lof6;->f0:Loi5;

    .line 1386
    .line 1387
    new-instance v7, Lqg5;

    .line 1388
    .line 1389
    invoke-direct {v7, v4, v5}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1390
    .line 1391
    .line 1392
    :goto_22
    if-eqz v7, :cond_2e

    .line 1393
    .line 1394
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1395
    .line 1396
    .line 1397
    goto :goto_20

    .line 1398
    :cond_31
    invoke-static {v3, v2}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    return-object v0

    .line 1403
    :pswitch_17
    move-object/from16 v17, v13

    .line 1404
    .line 1405
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1406
    .line 1407
    check-cast v0, Lu86;

    .line 1408
    .line 1409
    move-object/from16 v1, v17

    .line 1410
    .line 1411
    iput-object v1, v0, Lu86;->i:Lpb;

    .line 1412
    .line 1413
    const-string v1, "OnPositionedDispatch"

    .line 1414
    .line 1415
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1416
    .line 1417
    .line 1418
    :try_start_6
    invoke-virtual {v0}, Lu86;->a()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1419
    .line 1420
    .line 1421
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1422
    .line 1423
    .line 1424
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1425
    .line 1426
    return-object v0

    .line 1427
    :catchall_5
    move-exception v0

    .line 1428
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1429
    .line 1430
    .line 1431
    throw v0

    .line 1432
    :pswitch_18
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1433
    .line 1434
    check-cast v0, Lokhttp3/internal/ws/WebSocketWriter;

    .line 1435
    .line 1436
    invoke-static {v0}, Lokhttp3/internal/ws/RealWebSocket;->a(Lokhttp3/internal/ws/WebSocketWriter;)Ldn8;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    return-object v0

    .line 1441
    :pswitch_19
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1442
    .line 1443
    check-cast v0, Lokhttp3/internal/ws/RealWebSocket;

    .line 1444
    .line 1445
    invoke-static {v0}, Lokhttp3/internal/ws/RealWebSocket;->b(Lokhttp3/internal/ws/RealWebSocket;)Ldn8;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    return-object v0

    .line 1450
    :pswitch_1a
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1451
    .line 1452
    check-cast v0, Lsu/happ/proxyutility/service/QSTileService;

    .line 1453
    .line 1454
    sget v1, Lsu/happ/proxyutility/service/QSTileService;->Y:I

    .line 1455
    .line 1456
    new-instance v1, Lb26;

    .line 1457
    .line 1458
    invoke-direct {v1, v0}, Lb26;-><init>(Lsu/happ/proxyutility/service/QSTileService;)V

    .line 1459
    .line 1460
    .line 1461
    return-object v1

    .line 1462
    :pswitch_1b
    move-object v1, v13

    .line 1463
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1464
    .line 1465
    check-cast v0, La23;

    .line 1466
    .line 1467
    invoke-virtual {v0}, La23;->invoke()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    check-cast v0, Ljava/io/File;

    .line 1472
    .line 1473
    invoke-static {v0}, Lda2;->S(Ljava/io/File;)Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v2

    .line 1477
    const-string v3, "preferences_pb"

    .line 1478
    .line 1479
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v2

    .line 1483
    if-eqz v2, :cond_32

    .line 1484
    .line 1485
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v13

    .line 1489
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1490
    .line 1491
    .line 1492
    goto :goto_23

    .line 1493
    :cond_32
    const-string v2, "File extension for file: "

    .line 1494
    .line 1495
    const-string v3, " does not match required extension for Preferences file: preferences_pb"

    .line 1496
    .line 1497
    invoke-static {v2, v0, v3}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    move-object v13, v1

    .line 1501
    :goto_23
    return-object v13

    .line 1502
    :pswitch_1c
    iget-object v0, v0, Lhr5;->Y:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v0, Lir5;

    .line 1505
    .line 1506
    invoke-static {v0}, Lir5;->l(Lir5;)Z

    .line 1507
    .line 1508
    .line 1509
    move-result v0

    .line 1510
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v0

    .line 1514
    return-object v0

    .line 1515
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

    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.class public final synthetic Lo90;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lgn2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lo90;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lo90;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lo90;->Y:Ljava/lang/Object;

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
    iput-byte p3, p0, Lo90;->X:B

    iput-object p1, p0, Lo90;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lo90;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lo90;->X:B

    .line 4
    .line 5
    sget-object v2, Lec7;->Y:Lec7;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/high16 v5, 0x42b80000    # 92.0f

    .line 9
    .line 10
    const/16 v6, 0x180

    .line 11
    .line 12
    sget-object v8, Lhx4;->X:Lhx4;

    .line 13
    .line 14
    const/16 v9, 0x10

    .line 15
    .line 16
    sget-object v10, Lzz0;->a:Lbe;

    .line 17
    .line 18
    const/16 v11, 0x12

    .line 19
    .line 20
    const/4 v13, 0x6

    .line 21
    const/4 v14, 0x2

    .line 22
    sget-object v15, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    iget-object v12, v0, Lo90;->Z:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, v0, Lo90;->Y:Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v7, 0x1

    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    check-cast v0, Lpv3;

    .line 34
    .line 35
    check-cast v12, Llh7;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Lqs7;

    .line 40
    .line 41
    move-object/from16 v2, p2

    .line 42
    .line 43
    check-cast v2, Llp2;

    .line 44
    .line 45
    move-object/from16 v4, p3

    .line 46
    .line 47
    check-cast v4, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    and-int/lit8 v5, v4, 0x6

    .line 57
    .line 58
    if-nez v5, :cond_1

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    const/4 v14, 0x4

    .line 67
    :cond_0
    or-int/2addr v4, v14

    .line 68
    :cond_1
    and-int/lit8 v5, v4, 0x13

    .line 69
    .line 70
    if-eq v5, v11, :cond_2

    .line 71
    .line 72
    move v3, v7

    .line 73
    :cond_2
    and-int/lit8 v5, v4, 0x1

    .line 74
    .line 75
    invoke-virtual {v2, v5, v3}, Llp2;->N(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    invoke-interface {v12}, Llh7;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Let7;

    .line 86
    .line 87
    iget-boolean v3, v3, Let7;->d:Z

    .line 88
    .line 89
    invoke-interface {v12}, Llh7;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Let7;

    .line 94
    .line 95
    iget-boolean v5, v5, Let7;->b:Z

    .line 96
    .line 97
    move-object/from16 v20, v0

    .line 98
    .line 99
    check-cast v20, Lgn2;

    .line 100
    .line 101
    sget-object v21, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 102
    .line 103
    shl-int/lit8 v0, v4, 0x6

    .line 104
    .line 105
    and-int/lit16 v0, v0, 0x380

    .line 106
    .line 107
    or-int/lit16 v0, v0, 0x6000

    .line 108
    .line 109
    move/from16 v23, v0

    .line 110
    .line 111
    move-object/from16 v19, v1

    .line 112
    .line 113
    move-object/from16 v22, v2

    .line 114
    .line 115
    move/from16 v17, v3

    .line 116
    .line 117
    move/from16 v18, v5

    .line 118
    .line 119
    invoke-static/range {v17 .. v23}, Lbt7;->a(ZZLqs7;Lgn2;Lkx4;Llp2;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    move-object/from16 v22, v2

    .line 124
    .line 125
    invoke-virtual/range {v22 .. v22}, Llp2;->Q()V

    .line 126
    .line 127
    .line 128
    :goto_0
    return-object v15

    .line 129
    :pswitch_0
    check-cast v12, Lqn7;

    .line 130
    .line 131
    check-cast v0, Lgn2;

    .line 132
    .line 133
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, Lek;

    .line 136
    .line 137
    move-object/from16 v4, p2

    .line 138
    .line 139
    check-cast v4, Llp2;

    .line 140
    .line 141
    move-object/from16 v5, p3

    .line 142
    .line 143
    check-cast v5, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    and-int/lit8 v1, v5, 0x11

    .line 153
    .line 154
    if-eq v1, v9, :cond_4

    .line 155
    .line 156
    move v1, v7

    .line 157
    goto :goto_1

    .line 158
    :cond_4
    move v1, v3

    .line 159
    :goto_1
    and-int/2addr v5, v7

    .line 160
    invoke-virtual {v4, v5, v1}, Llp2;->N(IZ)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    iget-boolean v1, v12, Lqn7;->c:Z

    .line 167
    .line 168
    if-eqz v1, :cond_5

    .line 169
    .line 170
    const v1, -0x73b02a93

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v1}, Llp2;->W(I)V

    .line 174
    .line 175
    .line 176
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 177
    .line 178
    invoke-static {v12, v0, v1, v4, v6}, Lpn7;->e(Lqn7;Lgn2;Lkx4;Llp2;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v3}, Llp2;->p(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    const v1, -0x73b0119b

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v1}, Llp2;->W(I)V

    .line 189
    .line 190
    .line 191
    iget-boolean v1, v12, Lqn7;->p:Z

    .line 192
    .line 193
    iget-object v5, v12, Lqn7;->f:Lb83;

    .line 194
    .line 195
    if-nez v5, :cond_6

    .line 196
    .line 197
    move-object/from16 v17, v2

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_6
    move-object/from16 v17, v5

    .line 201
    .line 202
    :goto_2
    iget-object v2, v12, Lqn7;->j:Ljava/lang/String;

    .line 203
    .line 204
    iget-object v5, v12, Lqn7;->k:Ljava/lang/String;

    .line 205
    .line 206
    sget-object v21, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 207
    .line 208
    const/high16 v23, 0x30000

    .line 209
    .line 210
    move-object/from16 v20, v0

    .line 211
    .line 212
    move/from16 v16, v1

    .line 213
    .line 214
    move-object/from16 v18, v2

    .line 215
    .line 216
    move-object/from16 v22, v4

    .line 217
    .line 218
    move-object/from16 v19, v5

    .line 219
    .line 220
    invoke-static/range {v16 .. v23}, Lpn7;->d(ZLb83;Ljava/lang/String;Ljava/lang/String;Lgn2;Lkx4;Llp2;I)V

    .line 221
    .line 222
    .line 223
    move-object/from16 v0, v22

    .line 224
    .line 225
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_7
    move-object v0, v4

    .line 230
    invoke-virtual {v0}, Llp2;->Q()V

    .line 231
    .line 232
    .line 233
    :goto_3
    return-object v15

    .line 234
    :pswitch_1
    check-cast v0, Landroid/text/Spannable;

    .line 235
    .line 236
    check-cast v12, Ljf;

    .line 237
    .line 238
    move-object/from16 v1, p1

    .line 239
    .line 240
    check-cast v1, Lqe7;

    .line 241
    .line 242
    move-object/from16 v2, p2

    .line 243
    .line 244
    check-cast v2, Ljava/lang/Integer;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    move-object/from16 v4, p3

    .line 251
    .line 252
    check-cast v4, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    new-instance v5, Lji2;

    .line 259
    .line 260
    iget-object v6, v1, Lqe7;->f:Lgi2;

    .line 261
    .line 262
    iget-object v8, v1, Lqe7;->c:Ldj2;

    .line 263
    .line 264
    if-nez v8, :cond_8

    .line 265
    .line 266
    sget-object v8, Ldj2;->g0:Ldj2;

    .line 267
    .line 268
    :cond_8
    iget-object v9, v1, Lqe7;->d:Lbj2;

    .line 269
    .line 270
    if-eqz v9, :cond_9

    .line 271
    .line 272
    iget v3, v9, Lbj2;->a:I

    .line 273
    .line 274
    :cond_9
    iget-object v1, v1, Lqe7;->e:Lcj2;

    .line 275
    .line 276
    if-eqz v1, :cond_a

    .line 277
    .line 278
    iget v1, v1, Lcj2;->a:I

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    const v1, 0xffff

    .line 282
    .line 283
    .line 284
    :goto_4
    iget-object v9, v12, Ljf;->Y:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v9, Lkf;

    .line 287
    .line 288
    iget-object v10, v9, Lkf;->g0:Lfi2;

    .line 289
    .line 290
    check-cast v10, Lhi2;

    .line 291
    .line 292
    invoke-virtual {v10, v6, v8, v3, v1}, Lhi2;->b(Lgi2;Ldj2;II)Lrj8;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    instance-of v3, v1, Lrj8;

    .line 297
    .line 298
    if-nez v3, :cond_b

    .line 299
    .line 300
    new-instance v3, Lzv7;

    .line 301
    .line 302
    iget-object v6, v9, Lkf;->l0:Lzv7;

    .line 303
    .line 304
    invoke-direct {v3, v1, v6}, Lzv7;-><init>(Lrj8;Lzv7;)V

    .line 305
    .line 306
    .line 307
    iput-object v3, v9, Lkf;->l0:Lzv7;

    .line 308
    .line 309
    iget-object v1, v3, Lzv7;->Z:Ljava/lang/Object;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    check-cast v1, Landroid/graphics/Typeface;

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_b
    iget-object v1, v1, Lrj8;->X:Ljava/lang/Object;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    check-cast v1, Landroid/graphics/Typeface;

    .line 323
    .line 324
    :goto_5
    invoke-direct {v5, v1, v7}, Lji2;-><init>(Ljava/lang/Object;B)V

    .line 325
    .line 326
    .line 327
    const/16 v1, 0x21

    .line 328
    .line 329
    invoke-interface {v0, v5, v2, v4, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 330
    .line 331
    .line 332
    return-object v15

    .line 333
    :pswitch_2
    check-cast v0, Ltn6;

    .line 334
    .line 335
    check-cast v12, Lkx4;

    .line 336
    .line 337
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, Lk44;

    .line 340
    .line 341
    move-object/from16 v2, p2

    .line 342
    .line 343
    check-cast v2, Llp2;

    .line 344
    .line 345
    move-object/from16 v4, p3

    .line 346
    .line 347
    check-cast v4, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    and-int/lit8 v5, v4, 0x6

    .line 357
    .line 358
    if-nez v5, :cond_d

    .line 359
    .line 360
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_c

    .line 365
    .line 366
    const/4 v14, 0x4

    .line 367
    :cond_c
    or-int/2addr v4, v14

    .line 368
    :cond_d
    and-int/lit8 v5, v4, 0x13

    .line 369
    .line 370
    if-eq v5, v11, :cond_e

    .line 371
    .line 372
    move v5, v7

    .line 373
    goto :goto_6

    .line 374
    :cond_e
    move v5, v3

    .line 375
    :goto_6
    and-int/2addr v4, v7

    .line 376
    invoke-virtual {v2, v4, v5}, Llp2;->N(IZ)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_f

    .line 381
    .line 382
    invoke-static {v1, v12}, Ldh3;->p(Lk44;Lkx4;)Lkx4;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-static {v0, v1, v2, v3}, Lg33;->d(Ltn6;Lkx4;Llp2;I)V

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_f
    invoke-virtual {v2}, Llp2;->Q()V

    .line 391
    .line 392
    .line 393
    :goto_7
    return-object v15

    .line 394
    :pswitch_3
    check-cast v0, Lgn2;

    .line 395
    .line 396
    check-cast v12, Lvo6;

    .line 397
    .line 398
    move-object/from16 v1, p1

    .line 399
    .line 400
    check-cast v1, Ll80;

    .line 401
    .line 402
    move-object/from16 v2, p2

    .line 403
    .line 404
    check-cast v2, Llp2;

    .line 405
    .line 406
    move-object/from16 v4, p3

    .line 407
    .line 408
    check-cast v4, Ljava/lang/Integer;

    .line 409
    .line 410
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    and-int/lit8 v6, v4, 0x6

    .line 418
    .line 419
    if-nez v6, :cond_11

    .line 420
    .line 421
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_10

    .line 426
    .line 427
    const/16 v16, 0x4

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_10
    move/from16 v16, v14

    .line 431
    .line 432
    :goto_8
    or-int v4, v4, v16

    .line 433
    .line 434
    :cond_11
    and-int/lit8 v1, v4, 0x13

    .line 435
    .line 436
    if-eq v1, v11, :cond_12

    .line 437
    .line 438
    move v1, v7

    .line 439
    goto :goto_9

    .line 440
    :cond_12
    move v1, v3

    .line 441
    :goto_9
    and-int/2addr v4, v7

    .line 442
    invoke-virtual {v2, v4, v1}, Llp2;->N(IZ)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_17

    .line 447
    .line 448
    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/b;->k(Lkx4;F)Lkx4;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    sget-object v4, Lpz2;->j0:Lp50;

    .line 453
    .line 454
    invoke-static {v1, v4}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-virtual {v2, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    or-int/2addr v5, v6

    .line 467
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    if-nez v5, :cond_13

    .line 472
    .line 473
    if-ne v6, v10, :cond_14

    .line 474
    .line 475
    :cond_13
    new-instance v6, Lrn6;

    .line 476
    .line 477
    invoke-direct {v6, v0, v12, v7}, Lrn6;-><init>(Lgn2;Lvo6;B)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    :cond_14
    check-cast v6, Ldn2;

    .line 484
    .line 485
    invoke-static {v4, v6, v2, v3}, Lgv3;->e(Lkx4;Ldn2;Llp2;I)V

    .line 486
    .line 487
    .line 488
    sget-object v4, Lpz2;->h0:Lp50;

    .line 489
    .line 490
    invoke-static {v1, v4}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-virtual {v2, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    or-int/2addr v4, v5

    .line 503
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    if-nez v4, :cond_15

    .line 508
    .line 509
    if-ne v5, v10, :cond_16

    .line 510
    .line 511
    :cond_15
    new-instance v5, Lrn6;

    .line 512
    .line 513
    invoke-direct {v5, v0, v12, v14}, Lrn6;-><init>(Lgn2;Lvo6;B)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    :cond_16
    check-cast v5, Ldn2;

    .line 520
    .line 521
    invoke-static {v1, v5, v2, v3}, Lpu;->b(Lkx4;Ldn2;Llp2;I)V

    .line 522
    .line 523
    .line 524
    goto :goto_a

    .line 525
    :cond_17
    invoke-virtual {v2}, Llp2;->Q()V

    .line 526
    .line 527
    .line 528
    :goto_a
    return-object v15

    .line 529
    :pswitch_4
    check-cast v12, Lsn6;

    .line 530
    .line 531
    check-cast v0, Lgn2;

    .line 532
    .line 533
    move-object/from16 v1, p1

    .line 534
    .line 535
    check-cast v1, Luw0;

    .line 536
    .line 537
    move-object/from16 v2, p2

    .line 538
    .line 539
    check-cast v2, Llp2;

    .line 540
    .line 541
    move-object/from16 v5, p3

    .line 542
    .line 543
    check-cast v5, Ljava/lang/Integer;

    .line 544
    .line 545
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    and-int/lit8 v1, v5, 0x11

    .line 553
    .line 554
    if-eq v1, v9, :cond_18

    .line 555
    .line 556
    move v3, v7

    .line 557
    :cond_18
    and-int/lit8 v1, v5, 0x1

    .line 558
    .line 559
    invoke-virtual {v2, v1, v3}, Llp2;->N(IZ)Z

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    if-eqz v1, :cond_19

    .line 564
    .line 565
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 566
    .line 567
    new-instance v3, Li9;

    .line 568
    .line 569
    const/16 v5, 0x1b

    .line 570
    .line 571
    invoke-direct {v3, v12, v0, v5}, Li9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 572
    .line 573
    .line 574
    const v0, -0x57aff3a9

    .line 575
    .line 576
    .line 577
    invoke-static {v0, v3, v2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    const/16 v3, 0x186

    .line 582
    .line 583
    invoke-static {v1, v4, v0, v2, v3}, Lw79;->a(Lkx4;Lrn2;Lzy0;Llp2;I)V

    .line 584
    .line 585
    .line 586
    goto :goto_b

    .line 587
    :cond_19
    invoke-virtual {v2}, Llp2;->Q()V

    .line 588
    .line 589
    .line 590
    :goto_b
    return-object v15

    .line 591
    :pswitch_5
    check-cast v12, Low2;

    .line 592
    .line 593
    check-cast v0, Lgn2;

    .line 594
    .line 595
    move-object/from16 v1, p1

    .line 596
    .line 597
    check-cast v1, Lxq6;

    .line 598
    .line 599
    move-object/from16 v4, p2

    .line 600
    .line 601
    check-cast v4, Llp2;

    .line 602
    .line 603
    move-object/from16 v5, p3

    .line 604
    .line 605
    check-cast v5, Ljava/lang/Integer;

    .line 606
    .line 607
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    and-int/lit8 v1, v5, 0x11

    .line 615
    .line 616
    if-eq v1, v9, :cond_1a

    .line 617
    .line 618
    move v1, v7

    .line 619
    goto :goto_c

    .line 620
    :cond_1a
    move v1, v3

    .line 621
    :goto_c
    and-int/2addr v5, v7

    .line 622
    invoke-virtual {v4, v5, v1}, Llp2;->N(IZ)Z

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    if-eqz v1, :cond_22

    .line 627
    .line 628
    sget-object v1, Lpz2;->Z:Lp50;

    .line 629
    .line 630
    invoke-static {v1, v3}, Lg80;->c(Lp50;Z)Lxr4;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    iget-wide v5, v4, Llp2;->T:J

    .line 635
    .line 636
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    invoke-virtual {v4}, Llp2;->l()Lkl5;

    .line 641
    .line 642
    .line 643
    move-result-object v5

    .line 644
    invoke-static {v4, v8}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    sget-object v8, Luz0;->j:Lpz2;

    .line 649
    .line 650
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v4}, Llp2;->Z()V

    .line 654
    .line 655
    .line 656
    iget-boolean v8, v4, Llp2;->S:Z

    .line 657
    .line 658
    if-eqz v8, :cond_1b

    .line 659
    .line 660
    invoke-virtual {v4}, Llp2;->k()V

    .line 661
    .line 662
    .line 663
    goto :goto_d

    .line 664
    :cond_1b
    invoke-virtual {v4}, Llp2;->j0()V

    .line 665
    .line 666
    .line 667
    :goto_d
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 668
    .line 669
    invoke-static {v8, v4, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 673
    .line 674
    invoke-static {v1, v4, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 682
    .line 683
    invoke-static {v3, v4, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    invoke-static {v4}, Lpn7;->l(Llp2;)V

    .line 687
    .line 688
    .line 689
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 690
    .line 691
    invoke-static {v1, v4, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v4, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v1

    .line 698
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    if-nez v1, :cond_1c

    .line 703
    .line 704
    if-ne v3, v10, :cond_1d

    .line 705
    .line 706
    :cond_1c
    new-instance v16, Lub;

    .line 707
    .line 708
    const/16 v22, 0x0

    .line 709
    .line 710
    const/16 v23, 0x1c

    .line 711
    .line 712
    const/16 v17, 0x0

    .line 713
    .line 714
    const-class v19, Low2;

    .line 715
    .line 716
    const-string v20, "toggle"

    .line 717
    .line 718
    const-string v21, "toggle()V"

    .line 719
    .line 720
    move-object/from16 v18, v12

    .line 721
    .line 722
    invoke-direct/range {v16 .. v23}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 723
    .line 724
    .line 725
    move-object/from16 v3, v16

    .line 726
    .line 727
    invoke-virtual {v4, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    :cond_1d
    check-cast v3, Lpv3;

    .line 731
    .line 732
    move-object/from16 v16, v3

    .line 733
    .line 734
    check-cast v16, Ldn2;

    .line 735
    .line 736
    sget-object v22, Lch3;->b:Lzy0;

    .line 737
    .line 738
    const/high16 v24, 0x180000

    .line 739
    .line 740
    const/16 v25, 0x3e

    .line 741
    .line 742
    const/16 v17, 0x0

    .line 743
    .line 744
    const/16 v18, 0x0

    .line 745
    .line 746
    const/16 v19, 0x0

    .line 747
    .line 748
    const/16 v20, 0x0

    .line 749
    .line 750
    const/16 v21, 0x0

    .line 751
    .line 752
    move-object/from16 v23, v4

    .line 753
    .line 754
    invoke-static/range {v16 .. v25}, Lw45;->c(Ldn2;Lkx4;ZLs43;Lxz4;Lx67;Lzy0;Llp2;II)V

    .line 755
    .line 756
    .line 757
    move-object/from16 v1, v23

    .line 758
    .line 759
    sget v3, Ly46;->menu_item_create_profile:I

    .line 760
    .line 761
    invoke-static {v3, v1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    sget v4, Lq36;->ic_routing_add:I

    .line 766
    .line 767
    invoke-static {v4, v1}, Lu28;->p(ILlp2;)Lg73;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-virtual {v1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    if-nez v5, :cond_1e

    .line 780
    .line 781
    if-ne v6, v10, :cond_1f

    .line 782
    .line 783
    :cond_1e
    new-instance v6, Lba3;

    .line 784
    .line 785
    invoke-direct {v6, v0, v13}, Lba3;-><init>(Lgn2;B)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    :cond_1f
    check-cast v6, Ldn2;

    .line 792
    .line 793
    new-instance v5, Lmw2;

    .line 794
    .line 795
    invoke-direct {v5, v3, v4, v6}, Lmw2;-><init>(Ljava/lang/String;Lg73;Ldn2;)V

    .line 796
    .line 797
    .line 798
    sget v3, Ly46;->menu_item_import_profile:I

    .line 799
    .line 800
    invoke-static {v3, v1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    sget v4, Lq36;->ic_routing_import:I

    .line 805
    .line 806
    invoke-static {v4, v1}, Lu28;->p(ILlp2;)Lg73;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    invoke-virtual {v1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v6

    .line 814
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    if-nez v6, :cond_20

    .line 819
    .line 820
    if-ne v8, v10, :cond_21

    .line 821
    .line 822
    :cond_20
    new-instance v8, Lba3;

    .line 823
    .line 824
    const/4 v6, 0x7

    .line 825
    invoke-direct {v8, v0, v6}, Lba3;-><init>(Lgn2;B)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v1, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    :cond_21
    check-cast v8, Ldn2;

    .line 832
    .line 833
    new-instance v0, Lmw2;

    .line 834
    .line 835
    invoke-direct {v0, v3, v4, v8}, Lmw2;-><init>(Ljava/lang/String;Lg73;Ldn2;)V

    .line 836
    .line 837
    .line 838
    filled-new-array {v5, v0}, [Lmw2;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-virtual {v2, v0}, Lec7;->e(Ljava/util/Collection;)Lj2;

    .line 853
    .line 854
    .line 855
    move-result-object v8

    .line 856
    const/4 v13, 0x0

    .line 857
    const/16 v14, 0x1a

    .line 858
    .line 859
    const/4 v9, 0x0

    .line 860
    const/4 v11, 0x0

    .line 861
    move-object v10, v12

    .line 862
    move-object v12, v1

    .line 863
    invoke-static/range {v8 .. v14}, Ljm4;->i(Lb83;Lkx4;Low2;Ltn2;Llp2;II)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12, v7}, Llp2;->p(Z)V

    .line 867
    .line 868
    .line 869
    goto :goto_e

    .line 870
    :cond_22
    move-object v12, v4

    .line 871
    invoke-virtual {v12}, Llp2;->Q()V

    .line 872
    .line 873
    .line 874
    :goto_e
    return-object v15

    .line 875
    :pswitch_6
    check-cast v0, Lgn2;

    .line 876
    .line 877
    check-cast v12, Lum6;

    .line 878
    .line 879
    move-object/from16 v1, p1

    .line 880
    .line 881
    check-cast v1, Ll80;

    .line 882
    .line 883
    move-object/from16 v2, p2

    .line 884
    .line 885
    check-cast v2, Llp2;

    .line 886
    .line 887
    move-object/from16 v4, p3

    .line 888
    .line 889
    check-cast v4, Ljava/lang/Integer;

    .line 890
    .line 891
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 892
    .line 893
    .line 894
    move-result v4

    .line 895
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    and-int/lit8 v6, v4, 0x6

    .line 899
    .line 900
    if-nez v6, :cond_24

    .line 901
    .line 902
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    move-result v1

    .line 906
    if-eqz v1, :cond_23

    .line 907
    .line 908
    const/4 v14, 0x4

    .line 909
    :cond_23
    or-int/2addr v4, v14

    .line 910
    :cond_24
    and-int/lit8 v1, v4, 0x13

    .line 911
    .line 912
    if-eq v1, v11, :cond_25

    .line 913
    .line 914
    move v1, v7

    .line 915
    goto :goto_f

    .line 916
    :cond_25
    move v1, v3

    .line 917
    :goto_f
    and-int/2addr v4, v7

    .line 918
    invoke-virtual {v2, v4, v1}, Llp2;->N(IZ)Z

    .line 919
    .line 920
    .line 921
    move-result v1

    .line 922
    if-eqz v1, :cond_2a

    .line 923
    .line 924
    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/b;->k(Lkx4;F)Lkx4;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    sget-object v4, Lpz2;->j0:Lp50;

    .line 929
    .line 930
    invoke-static {v1, v4}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 931
    .line 932
    .line 933
    move-result-object v4

    .line 934
    invoke-virtual {v2, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v5

    .line 938
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    or-int/2addr v5, v6

    .line 943
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v6

    .line 947
    if-nez v5, :cond_26

    .line 948
    .line 949
    if-ne v6, v10, :cond_27

    .line 950
    .line 951
    :cond_26
    new-instance v6, Lqm6;

    .line 952
    .line 953
    invoke-direct {v6, v0, v12, v3}, Lqm6;-><init>(Lgn2;Lum6;B)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v2, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    :cond_27
    check-cast v6, Ldn2;

    .line 960
    .line 961
    invoke-static {v4, v6, v2, v3}, Lgv3;->e(Lkx4;Ldn2;Llp2;I)V

    .line 962
    .line 963
    .line 964
    sget-object v4, Lpz2;->h0:Lp50;

    .line 965
    .line 966
    invoke-static {v1, v4}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-virtual {v2, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v4

    .line 974
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v5

    .line 978
    or-int/2addr v4, v5

    .line 979
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    if-nez v4, :cond_28

    .line 984
    .line 985
    if-ne v5, v10, :cond_29

    .line 986
    .line 987
    :cond_28
    new-instance v5, Lqm6;

    .line 988
    .line 989
    invoke-direct {v5, v0, v12, v7}, Lqm6;-><init>(Lgn2;Lum6;B)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v2, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 993
    .line 994
    .line 995
    :cond_29
    check-cast v5, Ldn2;

    .line 996
    .line 997
    invoke-static {v1, v5, v2, v3}, Lpu;->b(Lkx4;Ldn2;Llp2;I)V

    .line 998
    .line 999
    .line 1000
    goto :goto_10

    .line 1001
    :cond_2a
    invoke-virtual {v2}, Llp2;->Q()V

    .line 1002
    .line 1003
    .line 1004
    :goto_10
    return-object v15

    .line 1005
    :pswitch_7
    check-cast v12, Lsf4;

    .line 1006
    .line 1007
    check-cast v0, Lgn2;

    .line 1008
    .line 1009
    move-object/from16 v1, p1

    .line 1010
    .line 1011
    check-cast v1, Lk44;

    .line 1012
    .line 1013
    move-object/from16 v2, p2

    .line 1014
    .line 1015
    check-cast v2, Llp2;

    .line 1016
    .line 1017
    move-object/from16 v4, p3

    .line 1018
    .line 1019
    check-cast v4, Ljava/lang/Integer;

    .line 1020
    .line 1021
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1022
    .line 1023
    .line 1024
    move-result v4

    .line 1025
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1026
    .line 1027
    .line 1028
    and-int/lit8 v1, v4, 0x11

    .line 1029
    .line 1030
    if-eq v1, v9, :cond_2b

    .line 1031
    .line 1032
    move v3, v7

    .line 1033
    :cond_2b
    and-int/lit8 v1, v4, 0x1

    .line 1034
    .line 1035
    invoke-virtual {v2, v1, v3}, Llp2;->N(IZ)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v1

    .line 1039
    if-eqz v1, :cond_2c

    .line 1040
    .line 1041
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1042
    .line 1043
    invoke-static {v12, v0, v1, v2, v6}, Los4;->c(Lsf4;Lgn2;Lkx4;Llp2;I)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_11

    .line 1047
    :cond_2c
    invoke-virtual {v2}, Llp2;->Q()V

    .line 1048
    .line 1049
    .line 1050
    :goto_11
    return-object v15

    .line 1051
    :pswitch_8
    check-cast v0, Lgn2;

    .line 1052
    .line 1053
    check-cast v12, Llf4;

    .line 1054
    .line 1055
    move-object/from16 v1, p1

    .line 1056
    .line 1057
    check-cast v1, Ll80;

    .line 1058
    .line 1059
    move-object/from16 v2, p2

    .line 1060
    .line 1061
    check-cast v2, Llp2;

    .line 1062
    .line 1063
    move-object/from16 v4, p3

    .line 1064
    .line 1065
    check-cast v4, Ljava/lang/Integer;

    .line 1066
    .line 1067
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1068
    .line 1069
    .line 1070
    move-result v4

    .line 1071
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    and-int/lit8 v6, v4, 0x6

    .line 1075
    .line 1076
    if-nez v6, :cond_2e

    .line 1077
    .line 1078
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    if-eqz v1, :cond_2d

    .line 1083
    .line 1084
    const/4 v14, 0x4

    .line 1085
    :cond_2d
    or-int/2addr v4, v14

    .line 1086
    :cond_2e
    and-int/lit8 v1, v4, 0x13

    .line 1087
    .line 1088
    if-eq v1, v11, :cond_2f

    .line 1089
    .line 1090
    move v1, v7

    .line 1091
    goto :goto_12

    .line 1092
    :cond_2f
    move v1, v3

    .line 1093
    :goto_12
    and-int/2addr v4, v7

    .line 1094
    invoke-virtual {v2, v4, v1}, Llp2;->N(IZ)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v1

    .line 1098
    if-eqz v1, :cond_32

    .line 1099
    .line 1100
    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/b;->k(Lkx4;F)Lkx4;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    const/high16 v4, 0x41400000    # 12.0f

    .line 1105
    .line 1106
    const/4 v5, 0x0

    .line 1107
    invoke-static {v1, v5, v4, v7}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    sget-object v4, Lpz2;->j0:Lp50;

    .line 1112
    .line 1113
    invoke-static {v1, v4}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v1

    .line 1117
    invoke-virtual {v2, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v4

    .line 1121
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v5

    .line 1125
    or-int/2addr v4, v5

    .line 1126
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v5

    .line 1130
    if-nez v4, :cond_30

    .line 1131
    .line 1132
    if-ne v5, v10, :cond_31

    .line 1133
    .line 1134
    :cond_30
    new-instance v5, Lff4;

    .line 1135
    .line 1136
    invoke-direct {v5, v0, v12, v7}, Lff4;-><init>(Lgn2;Llf4;B)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v2, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1140
    .line 1141
    .line 1142
    :cond_31
    check-cast v5, Ldn2;

    .line 1143
    .line 1144
    invoke-static {v1, v5, v2, v3}, Lgv3;->e(Lkx4;Ldn2;Llp2;I)V

    .line 1145
    .line 1146
    .line 1147
    goto :goto_13

    .line 1148
    :cond_32
    invoke-virtual {v2}, Llp2;->Q()V

    .line 1149
    .line 1150
    .line 1151
    :goto_13
    return-object v15

    .line 1152
    :pswitch_9
    check-cast v0, Lpv3;

    .line 1153
    .line 1154
    check-cast v12, Ly05;

    .line 1155
    .line 1156
    move-object/from16 v1, p1

    .line 1157
    .line 1158
    check-cast v1, Ljava/lang/String;

    .line 1159
    .line 1160
    move-object/from16 v1, p2

    .line 1161
    .line 1162
    check-cast v1, Llp2;

    .line 1163
    .line 1164
    move-object/from16 v2, p3

    .line 1165
    .line 1166
    check-cast v2, Ljava/lang/Integer;

    .line 1167
    .line 1168
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1169
    .line 1170
    .line 1171
    move-result v2

    .line 1172
    and-int/lit8 v5, v2, 0x11

    .line 1173
    .line 1174
    if-eq v5, v9, :cond_33

    .line 1175
    .line 1176
    move v5, v7

    .line 1177
    goto :goto_14

    .line 1178
    :cond_33
    move v5, v3

    .line 1179
    :goto_14
    and-int/2addr v2, v7

    .line 1180
    invoke-virtual {v1, v2, v5}, Llp2;->N(IZ)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    if-eqz v2, :cond_39

    .line 1185
    .line 1186
    invoke-interface {v12}, Llh7;->getValue()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    check-cast v2, Lja3;

    .line 1191
    .line 1192
    instance-of v5, v2, Lia3;

    .line 1193
    .line 1194
    if-eqz v5, :cond_35

    .line 1195
    .line 1196
    const v0, -0x3706ec6e

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v1, v0}, Llp2;->W(I)V

    .line 1200
    .line 1201
    .line 1202
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1203
    .line 1204
    sget-object v2, Lpz2;->Z:Lp50;

    .line 1205
    .line 1206
    invoke-static {v2, v3}, Lg80;->c(Lp50;Z)Lxr4;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v2

    .line 1210
    iget-wide v4, v1, Llp2;->T:J

    .line 1211
    .line 1212
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 1213
    .line 1214
    .line 1215
    move-result v4

    .line 1216
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v5

    .line 1220
    invoke-static {v1, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    sget-object v6, Luz0;->j:Lpz2;

    .line 1225
    .line 1226
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v1}, Llp2;->Z()V

    .line 1230
    .line 1231
    .line 1232
    iget-boolean v6, v1, Llp2;->S:Z

    .line 1233
    .line 1234
    if-eqz v6, :cond_34

    .line 1235
    .line 1236
    invoke-virtual {v1}, Llp2;->k()V

    .line 1237
    .line 1238
    .line 1239
    goto :goto_15

    .line 1240
    :cond_34
    invoke-virtual {v1}, Llp2;->j0()V

    .line 1241
    .line 1242
    .line 1243
    :goto_15
    sget-object v6, Lpz2;->B0:Ldx0;

    .line 1244
    .line 1245
    invoke-static {v6, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 1246
    .line 1247
    .line 1248
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 1249
    .line 1250
    invoke-static {v2, v1, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    sget-object v4, Lpz2;->C0:Ldx0;

    .line 1258
    .line 1259
    invoke-static {v4, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-static {v1}, Lpn7;->l(Llp2;)V

    .line 1263
    .line 1264
    .line 1265
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 1266
    .line 1267
    invoke-static {v2, v1, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 1268
    .line 1269
    .line 1270
    const/high16 v4, 0x41400000    # 12.0f

    .line 1271
    .line 1272
    const/4 v5, 0x0

    .line 1273
    invoke-static {v8, v5, v4, v7}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    sget-object v2, Lpz2;->i0:Lp50;

    .line 1278
    .line 1279
    invoke-static {v0, v2}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    invoke-static {v1, v0}, Lhi5;->L(Llp2;Lkx4;)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v1, v7}, Llp2;->p(Z)V

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v1, v3}, Llp2;->p(Z)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_16

    .line 1293
    :cond_35
    instance-of v5, v2, Lha3;

    .line 1294
    .line 1295
    if-eqz v5, :cond_36

    .line 1296
    .line 1297
    const v4, -0x3706c6c3

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v1, v4}, Llp2;->W(I)V

    .line 1301
    .line 1302
    .line 1303
    check-cast v2, Lha3;

    .line 1304
    .line 1305
    check-cast v0, Lgn2;

    .line 1306
    .line 1307
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1308
    .line 1309
    invoke-static {v2, v0, v4, v1, v6}, Lyn0;->h(Lha3;Lgn2;Lkx4;Llp2;I)V

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v1, v3}, Llp2;->p(Z)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_16

    .line 1316
    :cond_36
    instance-of v5, v2, Lga3;

    .line 1317
    .line 1318
    if-eqz v5, :cond_37

    .line 1319
    .line 1320
    const v4, -0x3706a9df

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v1, v4}, Llp2;->W(I)V

    .line 1324
    .line 1325
    .line 1326
    check-cast v2, Lga3;

    .line 1327
    .line 1328
    check-cast v0, Lgn2;

    .line 1329
    .line 1330
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1331
    .line 1332
    invoke-static {v2, v0, v4, v1, v6}, Lys0;->h(Lga3;Lgn2;Lkx4;Llp2;I)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v1, v3}, Llp2;->p(Z)V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_16

    .line 1339
    :cond_37
    instance-of v5, v2, Lfa3;

    .line 1340
    .line 1341
    if-eqz v5, :cond_38

    .line 1342
    .line 1343
    const v4, -0x37068c7f

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v1, v4}, Llp2;->W(I)V

    .line 1347
    .line 1348
    .line 1349
    check-cast v2, Lfa3;

    .line 1350
    .line 1351
    check-cast v0, Lgn2;

    .line 1352
    .line 1353
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1354
    .line 1355
    invoke-static {v2, v0, v4, v1, v6}, Lu70;->f(Lfa3;Lgn2;Lkx4;Llp2;I)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v1, v3}, Llp2;->p(Z)V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_16

    .line 1362
    :cond_38
    const v0, -0x3706f2a5

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v1, v0}, Llp2;->W(I)V

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v1, v3}, Llp2;->p(Z)V

    .line 1369
    .line 1370
    .line 1371
    invoke-static {}, Lb61;->c()V

    .line 1372
    .line 1373
    .line 1374
    goto :goto_17

    .line 1375
    :cond_39
    invoke-virtual {v1}, Llp2;->Q()V

    .line 1376
    .line 1377
    .line 1378
    :goto_16
    move-object v4, v15

    .line 1379
    :goto_17
    return-object v4

    .line 1380
    :pswitch_a
    check-cast v0, Lkx4;

    .line 1381
    .line 1382
    check-cast v12, Ly68;

    .line 1383
    .line 1384
    move-object/from16 v1, p1

    .line 1385
    .line 1386
    check-cast v1, Lek;

    .line 1387
    .line 1388
    move-object/from16 v2, p2

    .line 1389
    .line 1390
    check-cast v2, Llp2;

    .line 1391
    .line 1392
    move-object/from16 v4, p3

    .line 1393
    .line 1394
    check-cast v4, Ljava/lang/Integer;

    .line 1395
    .line 1396
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1397
    .line 1398
    .line 1399
    move-result v4

    .line 1400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1401
    .line 1402
    .line 1403
    and-int/lit8 v1, v4, 0x11

    .line 1404
    .line 1405
    if-eq v1, v9, :cond_3a

    .line 1406
    .line 1407
    move v1, v7

    .line 1408
    goto :goto_18

    .line 1409
    :cond_3a
    move v1, v3

    .line 1410
    :goto_18
    and-int/2addr v4, v7

    .line 1411
    invoke-virtual {v2, v4, v1}, Llp2;->N(IZ)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v1

    .line 1415
    if-eqz v1, :cond_3e

    .line 1416
    .line 1417
    sget-object v1, Lw79;->h:Lg73;

    .line 1418
    .line 1419
    if-eqz v1, :cond_3b

    .line 1420
    .line 1421
    goto :goto_19

    .line 1422
    :cond_3b
    new-instance v18, Lf73;

    .line 1423
    .line 1424
    const/16 v26, 0x0

    .line 1425
    .line 1426
    const/16 v28, 0x60

    .line 1427
    .line 1428
    const-string v19, "Filled.Close"

    .line 1429
    .line 1430
    const/high16 v20, 0x41c00000    # 24.0f

    .line 1431
    .line 1432
    const/high16 v21, 0x41c00000    # 24.0f

    .line 1433
    .line 1434
    const/high16 v22, 0x41c00000    # 24.0f

    .line 1435
    .line 1436
    const/high16 v23, 0x41c00000    # 24.0f

    .line 1437
    .line 1438
    const-wide/16 v24, 0x0

    .line 1439
    .line 1440
    const/16 v27, 0x0

    .line 1441
    .line 1442
    invoke-direct/range {v18 .. v28}, Lf73;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 1443
    .line 1444
    .line 1445
    move-object/from16 v1, v18

    .line 1446
    .line 1447
    sget v4, Lgu8;->a:I

    .line 1448
    .line 1449
    new-instance v4, Lfe7;

    .line 1450
    .line 1451
    sget-wide v5, Ldw0;->b:J

    .line 1452
    .line 1453
    invoke-direct {v4, v5, v6}, Lfe7;-><init>(J)V

    .line 1454
    .line 1455
    .line 1456
    new-instance v5, Lcc0;

    .line 1457
    .line 1458
    invoke-direct {v5, v14}, Lcc0;-><init>(B)V

    .line 1459
    .line 1460
    .line 1461
    const/high16 v6, 0x41980000    # 19.0f

    .line 1462
    .line 1463
    const v7, 0x40cd1eb8    # 6.41f

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v5, v6, v7}, Lcc0;->e(FF)V

    .line 1467
    .line 1468
    .line 1469
    const v8, 0x418cb852    # 17.59f

    .line 1470
    .line 1471
    .line 1472
    const/high16 v9, 0x40a00000    # 5.0f

    .line 1473
    .line 1474
    invoke-virtual {v5, v8, v9}, Lcc0;->d(FF)V

    .line 1475
    .line 1476
    .line 1477
    const v11, 0x412970a4    # 10.59f

    .line 1478
    .line 1479
    .line 1480
    const/high16 v13, 0x41400000    # 12.0f

    .line 1481
    .line 1482
    invoke-virtual {v5, v13, v11}, Lcc0;->d(FF)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v5, v7, v9}, Lcc0;->d(FF)V

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v5, v9, v7}, Lcc0;->d(FF)V

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v5, v11, v13}, Lcc0;->d(FF)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v5, v9, v8}, Lcc0;->d(FF)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v5, v7, v6}, Lcc0;->d(FF)V

    .line 1498
    .line 1499
    .line 1500
    const v7, 0x41568f5c    # 13.41f

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v5, v13, v7}, Lcc0;->d(FF)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v5, v8, v6}, Lcc0;->d(FF)V

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v5, v6, v8}, Lcc0;->d(FF)V

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v5, v7, v13}, Lcc0;->d(FF)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v5}, Lcc0;->c()V

    .line 1516
    .line 1517
    .line 1518
    iget-object v5, v5, Lcc0;->b:Ljava/util/ArrayList;

    .line 1519
    .line 1520
    invoke-static {v1, v5, v4}, Lf73;->a(Lf73;Ljava/util/ArrayList;Lfe7;)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v1}, Lf73;->b()Lg73;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    sput-object v1, Lw79;->h:Lg73;

    .line 1528
    .line 1529
    :goto_19
    sget-object v4, Lep;->z:Lox1;

    .line 1530
    .line 1531
    invoke-virtual {v2, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v4

    .line 1535
    check-cast v4, Ldp;

    .line 1536
    .line 1537
    iget-object v4, v4, Ldp;->c:Lxr;

    .line 1538
    .line 1539
    iget-wide v4, v4, Lxr;->a:J

    .line 1540
    .line 1541
    sget v6, Ly46;->logcat_clear:I

    .line 1542
    .line 1543
    invoke-static {v6, v2}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v6

    .line 1547
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1548
    .line 1549
    .line 1550
    move-result v7

    .line 1551
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v8

    .line 1555
    if-nez v7, :cond_3c

    .line 1556
    .line 1557
    if-ne v8, v10, :cond_3d

    .line 1558
    .line 1559
    :cond_3c
    new-instance v18, Lub;

    .line 1560
    .line 1561
    const/16 v24, 0x1

    .line 1562
    .line 1563
    const/16 v25, 0xe

    .line 1564
    .line 1565
    const/16 v19, 0x0

    .line 1566
    .line 1567
    const-class v21, Lz68;

    .line 1568
    .line 1569
    const-string v22, "clearText"

    .line 1570
    .line 1571
    const-string v23, "clearText(Landroidx/compose/foundation/text/input/TextFieldState;)V"

    .line 1572
    .line 1573
    move-object/from16 v20, v12

    .line 1574
    .line 1575
    invoke-direct/range {v18 .. v25}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1576
    .line 1577
    .line 1578
    move-object/from16 v8, v18

    .line 1579
    .line 1580
    invoke-virtual {v2, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1581
    .line 1582
    .line 1583
    :cond_3d
    check-cast v8, Lpv3;

    .line 1584
    .line 1585
    check-cast v8, Ldn2;

    .line 1586
    .line 1587
    invoke-static {v0, v8, v2, v3}, Lvj8;->e0(Lkx4;Ldn2;Llp2;I)Lkx4;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v19

    .line 1591
    const/16 v24, 0x0

    .line 1592
    .line 1593
    const/16 v25, 0x0

    .line 1594
    .line 1595
    move-object/from16 v18, v1

    .line 1596
    .line 1597
    move-object/from16 v23, v2

    .line 1598
    .line 1599
    move-wide/from16 v21, v4

    .line 1600
    .line 1601
    move-object/from16 v20, v6

    .line 1602
    .line 1603
    invoke-static/range {v18 .. v25}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 1604
    .line 1605
    .line 1606
    goto :goto_1a

    .line 1607
    :cond_3e
    move-object/from16 v23, v2

    .line 1608
    .line 1609
    invoke-virtual/range {v23 .. v23}, Llp2;->Q()V

    .line 1610
    .line 1611
    .line 1612
    :goto_1a
    return-object v15

    .line 1613
    :pswitch_b
    check-cast v0, Ly05;

    .line 1614
    .line 1615
    move-object/from16 v20, v12

    .line 1616
    .line 1617
    check-cast v20, Lky2;

    .line 1618
    .line 1619
    move-object/from16 v1, p1

    .line 1620
    .line 1621
    check-cast v1, Lek;

    .line 1622
    .line 1623
    move-object/from16 v2, p2

    .line 1624
    .line 1625
    check-cast v2, Llp2;

    .line 1626
    .line 1627
    move-object/from16 v5, p3

    .line 1628
    .line 1629
    check-cast v5, Ljava/lang/Integer;

    .line 1630
    .line 1631
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1632
    .line 1633
    .line 1634
    move-result v5

    .line 1635
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    and-int/lit8 v6, v5, 0x6

    .line 1639
    .line 1640
    if-nez v6, :cond_41

    .line 1641
    .line 1642
    and-int/lit8 v6, v5, 0x8

    .line 1643
    .line 1644
    if-nez v6, :cond_3f

    .line 1645
    .line 1646
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v6

    .line 1650
    goto :goto_1b

    .line 1651
    :cond_3f
    invoke-virtual {v2, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1652
    .line 1653
    .line 1654
    move-result v6

    .line 1655
    :goto_1b
    if-eqz v6, :cond_40

    .line 1656
    .line 1657
    const/4 v12, 0x4

    .line 1658
    goto :goto_1c

    .line 1659
    :cond_40
    move v12, v14

    .line 1660
    :goto_1c
    or-int/2addr v5, v12

    .line 1661
    :cond_41
    and-int/lit8 v6, v5, 0x13

    .line 1662
    .line 1663
    if-eq v6, v11, :cond_42

    .line 1664
    .line 1665
    move v6, v7

    .line 1666
    goto :goto_1d

    .line 1667
    :cond_42
    move v6, v3

    .line 1668
    :goto_1d
    and-int/2addr v5, v7

    .line 1669
    invoke-virtual {v2, v5, v6}, Llp2;->N(IZ)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v5

    .line 1673
    if-eqz v5, :cond_50

    .line 1674
    .line 1675
    invoke-interface {v1}, Lek;->a()Lce8;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v1

    .line 1679
    sget-object v25, Lys0;->j0:Lug8;

    .line 1680
    .line 1681
    invoke-virtual {v1}, Lce8;->g()Z

    .line 1682
    .line 1683
    .line 1684
    move-result v5

    .line 1685
    if-nez v5, :cond_46

    .line 1686
    .line 1687
    const v5, 0x6355e4b0

    .line 1688
    .line 1689
    .line 1690
    invoke-virtual {v2, v5}, Llp2;->W(I)V

    .line 1691
    .line 1692
    .line 1693
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1694
    .line 1695
    .line 1696
    move-result v5

    .line 1697
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v6

    .line 1701
    if-nez v5, :cond_43

    .line 1702
    .line 1703
    if-ne v6, v10, :cond_45

    .line 1704
    .line 1705
    :cond_43
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v5

    .line 1709
    if-eqz v5, :cond_44

    .line 1710
    .line 1711
    invoke-virtual {v5}, Ldd7;->e()Lgn2;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v6

    .line 1715
    goto :goto_1e

    .line 1716
    :cond_44
    move-object v6, v4

    .line 1717
    :goto_1e
    invoke-static {v5}, Lyn0;->P(Ldd7;)Ldd7;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v7

    .line 1721
    :try_start_0
    invoke-virtual {v1}, Lce8;->c()Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1725
    invoke-static {v5, v7, v6}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v2, v9}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1729
    .line 1730
    .line 1731
    move-object v6, v9

    .line 1732
    :cond_45
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_1f

    .line 1736
    :catchall_0
    move-exception v0

    .line 1737
    invoke-static {v5, v7, v6}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 1738
    .line 1739
    .line 1740
    throw v0

    .line 1741
    :cond_46
    const v5, 0x6359c50d

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v2, v5}, Llp2;->W(I)V

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v1}, Lce8;->c()Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v6

    .line 1754
    :goto_1f
    check-cast v6, Lr12;

    .line 1755
    .line 1756
    const v5, -0x6c6c7f61

    .line 1757
    .line 1758
    .line 1759
    invoke-virtual {v2, v5}, Llp2;->W(I)V

    .line 1760
    .line 1761
    .line 1762
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1763
    .line 1764
    sget-object v9, Lr12;->Y:Lr12;

    .line 1765
    .line 1766
    if-ne v6, v9, :cond_47

    .line 1767
    .line 1768
    move v6, v7

    .line 1769
    goto :goto_20

    .line 1770
    :cond_47
    const/4 v6, 0x0

    .line 1771
    :goto_20
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1772
    .line 1773
    .line 1774
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v22

    .line 1778
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1779
    .line 1780
    .line 1781
    move-result v6

    .line 1782
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v11

    .line 1786
    if-nez v6, :cond_48

    .line 1787
    .line 1788
    if-ne v11, v10, :cond_49

    .line 1789
    .line 1790
    :cond_48
    new-instance v6, Ls71;

    .line 1791
    .line 1792
    invoke-direct {v6, v1, v14}, Ls71;-><init>(Lce8;B)V

    .line 1793
    .line 1794
    .line 1795
    invoke-static {v6}, Lrd7;->b(Ldn2;)Lzi1;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v11

    .line 1799
    invoke-virtual {v2, v11}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1800
    .line 1801
    .line 1802
    :cond_49
    check-cast v11, Llh7;

    .line 1803
    .line 1804
    invoke-interface {v11}, Llh7;->getValue()Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v6

    .line 1808
    check-cast v6, Lr12;

    .line 1809
    .line 1810
    invoke-virtual {v2, v5}, Llp2;->W(I)V

    .line 1811
    .line 1812
    .line 1813
    if-ne v6, v9, :cond_4a

    .line 1814
    .line 1815
    goto :goto_21

    .line 1816
    :cond_4a
    const/4 v7, 0x0

    .line 1817
    :goto_21
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1818
    .line 1819
    .line 1820
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v23

    .line 1824
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v5

    .line 1828
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v6

    .line 1832
    if-nez v5, :cond_4b

    .line 1833
    .line 1834
    if-ne v6, v10, :cond_4c

    .line 1835
    .line 1836
    :cond_4b
    new-instance v5, Ls71;

    .line 1837
    .line 1838
    const/4 v6, 0x3

    .line 1839
    invoke-direct {v5, v1, v6}, Ls71;-><init>(Lce8;B)V

    .line 1840
    .line 1841
    .line 1842
    invoke-static {v5}, Lrd7;->b(Ldn2;)Lzi1;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v6

    .line 1846
    invoke-virtual {v2, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1847
    .line 1848
    .line 1849
    :cond_4c
    check-cast v6, Llh7;

    .line 1850
    .line 1851
    invoke-interface {v6}, Llh7;->getValue()Ljava/lang/Object;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v5

    .line 1855
    check-cast v5, Lwd8;

    .line 1856
    .line 1857
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1858
    .line 1859
    .line 1860
    const v5, 0x3cc05471

    .line 1861
    .line 1862
    .line 1863
    invoke-virtual {v2, v5}, Llp2;->W(I)V

    .line 1864
    .line 1865
    .line 1866
    const/high16 v5, 0x43c80000    # 400.0f

    .line 1867
    .line 1868
    const/4 v6, 0x5

    .line 1869
    const/4 v7, 0x0

    .line 1870
    invoke-static {v7, v5, v4, v6}, Lwl7;->V(FFLjava/lang/Object;I)Lwf7;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v24

    .line 1874
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1875
    .line 1876
    .line 1877
    const/high16 v27, 0x30000

    .line 1878
    .line 1879
    move-object/from16 v21, v1

    .line 1880
    .line 1881
    move-object/from16 v26, v2

    .line 1882
    .line 1883
    invoke-static/range {v21 .. v27}, Lrq7;->h(Lce8;Ljava/lang/Object;Ljava/lang/Object;Lta2;Lug8;Llp2;I)Lyd8;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v1

    .line 1887
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    move-object/from16 v19, v0

    .line 1892
    .line 1893
    check-cast v19, Lby2;

    .line 1894
    .line 1895
    if-nez v19, :cond_4d

    .line 1896
    .line 1897
    const v0, 0x7c4e8e2b

    .line 1898
    .line 1899
    .line 1900
    invoke-virtual {v2, v0}, Llp2;->W(I)V

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1904
    .line 1905
    .line 1906
    goto :goto_22

    .line 1907
    :cond_4d
    const v0, 0x7c4e8e2c

    .line 1908
    .line 1909
    .line 1910
    invoke-virtual {v2, v0}, Llp2;->W(I)V

    .line 1911
    .line 1912
    .line 1913
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v0

    .line 1917
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v4

    .line 1921
    if-nez v0, :cond_4e

    .line 1922
    .line 1923
    if-ne v4, v10, :cond_4f

    .line 1924
    .line 1925
    :cond_4e
    new-instance v4, Lcy2;

    .line 1926
    .line 1927
    invoke-direct {v4, v1, v3}, Lcy2;-><init>(Lyd8;B)V

    .line 1928
    .line 1929
    .line 1930
    invoke-virtual {v2, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1931
    .line 1932
    .line 1933
    :cond_4f
    move-object/from16 v21, v4

    .line 1934
    .line 1935
    check-cast v21, Ldn2;

    .line 1936
    .line 1937
    const/high16 v0, 0x43960000    # 300.0f

    .line 1938
    .line 1939
    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/b;->k(Lkx4;F)Lkx4;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v22

    .line 1943
    const/16 v24, 0xc00

    .line 1944
    .line 1945
    move-object/from16 v23, v2

    .line 1946
    .line 1947
    invoke-static/range {v19 .. v24}, Lyn0;->d(Lby2;Lky2;Ldn2;Lkx4;Llp2;I)V

    .line 1948
    .line 1949
    .line 1950
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 1951
    .line 1952
    .line 1953
    goto :goto_22

    .line 1954
    :cond_50
    invoke-virtual {v2}, Llp2;->Q()V

    .line 1955
    .line 1956
    .line 1957
    :goto_22
    return-object v15

    .line 1958
    :pswitch_c
    check-cast v0, Lkx4;

    .line 1959
    .line 1960
    check-cast v12, Lzy0;

    .line 1961
    .line 1962
    move-object/from16 v1, p1

    .line 1963
    .line 1964
    check-cast v1, Ljava/lang/Boolean;

    .line 1965
    .line 1966
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1967
    .line 1968
    .line 1969
    move-result v1

    .line 1970
    move-object/from16 v2, p2

    .line 1971
    .line 1972
    check-cast v2, Llp2;

    .line 1973
    .line 1974
    move-object/from16 v4, p3

    .line 1975
    .line 1976
    check-cast v4, Ljava/lang/Integer;

    .line 1977
    .line 1978
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1979
    .line 1980
    .line 1981
    move-result v4

    .line 1982
    and-int/lit8 v5, v4, 0x6

    .line 1983
    .line 1984
    if-nez v5, :cond_52

    .line 1985
    .line 1986
    invoke-virtual {v2, v1}, Llp2;->g(Z)Z

    .line 1987
    .line 1988
    .line 1989
    move-result v5

    .line 1990
    if-eqz v5, :cond_51

    .line 1991
    .line 1992
    const/4 v14, 0x4

    .line 1993
    :cond_51
    or-int/2addr v4, v14

    .line 1994
    :cond_52
    and-int/lit8 v5, v4, 0x13

    .line 1995
    .line 1996
    if-eq v5, v11, :cond_53

    .line 1997
    .line 1998
    move v5, v7

    .line 1999
    goto :goto_23

    .line 2000
    :cond_53
    move v5, v3

    .line 2001
    :goto_23
    and-int/2addr v4, v7

    .line 2002
    invoke-virtual {v2, v4, v5}, Llp2;->N(IZ)Z

    .line 2003
    .line 2004
    .line 2005
    move-result v4

    .line 2006
    if-eqz v4, :cond_56

    .line 2007
    .line 2008
    if-eqz v1, :cond_55

    .line 2009
    .line 2010
    const v1, -0x32abb414

    .line 2011
    .line 2012
    .line 2013
    invoke-virtual {v2, v1}, Llp2;->W(I)V

    .line 2014
    .line 2015
    .line 2016
    sget-object v1, Lpz2;->Z:Lp50;

    .line 2017
    .line 2018
    invoke-static {v1, v3}, Lg80;->c(Lp50;Z)Lxr4;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v1

    .line 2022
    iget-wide v4, v2, Llp2;->T:J

    .line 2023
    .line 2024
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 2025
    .line 2026
    .line 2027
    move-result v4

    .line 2028
    invoke-virtual {v2}, Llp2;->l()Lkl5;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v5

    .line 2032
    invoke-static {v2, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v0

    .line 2036
    sget-object v6, Luz0;->j:Lpz2;

    .line 2037
    .line 2038
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v2}, Llp2;->Z()V

    .line 2042
    .line 2043
    .line 2044
    iget-boolean v6, v2, Llp2;->S:Z

    .line 2045
    .line 2046
    if-eqz v6, :cond_54

    .line 2047
    .line 2048
    invoke-virtual {v2}, Llp2;->k()V

    .line 2049
    .line 2050
    .line 2051
    goto :goto_24

    .line 2052
    :cond_54
    invoke-virtual {v2}, Llp2;->j0()V

    .line 2053
    .line 2054
    .line 2055
    :goto_24
    sget-object v6, Lpz2;->B0:Ldx0;

    .line 2056
    .line 2057
    invoke-static {v6, v2, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 2058
    .line 2059
    .line 2060
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 2061
    .line 2062
    invoke-static {v1, v2, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 2063
    .line 2064
    .line 2065
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v1

    .line 2069
    sget-object v4, Lpz2;->C0:Ldx0;

    .line 2070
    .line 2071
    invoke-static {v4, v2, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 2072
    .line 2073
    .line 2074
    invoke-static {v2}, Lpn7;->l(Llp2;)V

    .line 2075
    .line 2076
    .line 2077
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 2078
    .line 2079
    invoke-static {v1, v2, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 2080
    .line 2081
    .line 2082
    sget-object v0, Lpz2;->i0:Lp50;

    .line 2083
    .line 2084
    invoke-static {v8, v0}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    invoke-static {v2, v0}, Lhi5;->L(Llp2;Lkx4;)V

    .line 2089
    .line 2090
    .line 2091
    invoke-virtual {v2, v7}, Llp2;->p(Z)V

    .line 2092
    .line 2093
    .line 2094
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 2095
    .line 2096
    .line 2097
    goto :goto_25

    .line 2098
    :cond_55
    const v0, -0x32aba2fb    # -2.2267912E8f

    .line 2099
    .line 2100
    .line 2101
    invoke-virtual {v2, v0}, Llp2;->W(I)V

    .line 2102
    .line 2103
    .line 2104
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v0

    .line 2108
    invoke-virtual {v12, v2, v0}, Lzy0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 2112
    .line 2113
    .line 2114
    goto :goto_25

    .line 2115
    :cond_56
    invoke-virtual {v2}, Llp2;->Q()V

    .line 2116
    .line 2117
    .line 2118
    :goto_25
    return-object v15

    .line 2119
    :pswitch_d
    check-cast v12, Lb83;

    .line 2120
    .line 2121
    check-cast v0, Lgn2;

    .line 2122
    .line 2123
    move-object/from16 v1, p1

    .line 2124
    .line 2125
    check-cast v1, Ljava/lang/Boolean;

    .line 2126
    .line 2127
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2128
    .line 2129
    .line 2130
    move-result v1

    .line 2131
    move-object/from16 v2, p2

    .line 2132
    .line 2133
    check-cast v2, Llp2;

    .line 2134
    .line 2135
    move-object/from16 v4, p3

    .line 2136
    .line 2137
    check-cast v4, Ljava/lang/Integer;

    .line 2138
    .line 2139
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2140
    .line 2141
    .line 2142
    move-result v4

    .line 2143
    and-int/lit8 v5, v4, 0x6

    .line 2144
    .line 2145
    if-nez v5, :cond_58

    .line 2146
    .line 2147
    invoke-virtual {v2, v1}, Llp2;->g(Z)Z

    .line 2148
    .line 2149
    .line 2150
    move-result v5

    .line 2151
    if-eqz v5, :cond_57

    .line 2152
    .line 2153
    const/4 v14, 0x4

    .line 2154
    :cond_57
    or-int/2addr v4, v14

    .line 2155
    :cond_58
    and-int/lit8 v5, v4, 0x13

    .line 2156
    .line 2157
    if-eq v5, v11, :cond_59

    .line 2158
    .line 2159
    move v5, v7

    .line 2160
    goto :goto_26

    .line 2161
    :cond_59
    move v5, v3

    .line 2162
    :goto_26
    and-int/2addr v4, v7

    .line 2163
    invoke-virtual {v2, v4, v5}, Llp2;->N(IZ)Z

    .line 2164
    .line 2165
    .line 2166
    move-result v4

    .line 2167
    if-eqz v4, :cond_5d

    .line 2168
    .line 2169
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 2170
    .line 2171
    if-eqz v1, :cond_5a

    .line 2172
    .line 2173
    const v0, -0x75b2102c

    .line 2174
    .line 2175
    .line 2176
    invoke-virtual {v2, v0}, Llp2;->W(I)V

    .line 2177
    .line 2178
    .line 2179
    const/high16 v0, 0x41c00000    # 24.0f

    .line 2180
    .line 2181
    const/4 v5, 0x0

    .line 2182
    invoke-static {v4, v5, v0, v7}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v0

    .line 2186
    invoke-static {v0, v2, v13}, Lu70;->d(Lkx4;Llp2;I)V

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {v2, v3}, Llp2;->p(Z)V

    .line 2190
    .line 2191
    .line 2192
    goto :goto_27

    .line 2193
    :cond_5a
    const v1, -0x408e292a

    .line 2194
    .line 2195
    .line 2196
    invoke-virtual {v2, v1}, Llp2;->W(I)V

    .line 2197
    .line 2198
    .line 2199
    const/high16 v1, 0x41800000    # 16.0f

    .line 2200
    .line 2201
    invoke-static {v4, v1}, Los4;->x(Lkx4;F)Lkx4;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v1

    .line 2205
    invoke-static {v4}, Lg33;->e(Lkx4;)Lkx4;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v5

    .line 2209
    sget-object v6, Lep;->z:Lox1;

    .line 2210
    .line 2211
    invoke-virtual {v2, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v6

    .line 2215
    check-cast v6, Ldp;

    .line 2216
    .line 2217
    iget-object v6, v6, Ldp;->b:Luo;

    .line 2218
    .line 2219
    iget-wide v6, v6, Luo;->a:J

    .line 2220
    .line 2221
    sget-object v8, Lu70;->e:Lx03;

    .line 2222
    .line 2223
    invoke-static {v5, v6, v7, v8}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v19

    .line 2227
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 2228
    .line 2229
    .line 2230
    move-result v5

    .line 2231
    invoke-virtual {v2, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 2232
    .line 2233
    .line 2234
    move-result v6

    .line 2235
    or-int/2addr v5, v6

    .line 2236
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v6

    .line 2240
    if-nez v5, :cond_5b

    .line 2241
    .line 2242
    if-ne v6, v10, :cond_5c

    .line 2243
    .line 2244
    :cond_5b
    new-instance v6, Lii;

    .line 2245
    .line 2246
    invoke-direct {v6, v12, v0, v1, v4}, Lii;-><init>(Lb83;Lgn2;Lkx4;Lkx4;)V

    .line 2247
    .line 2248
    .line 2249
    invoke-virtual {v2, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 2250
    .line 2251
    .line 2252
    :cond_5c
    move-object/from16 v29, v6

    .line 2253
    .line 2254
    check-cast v29, Lgn2;

    .line 2255
    .line 2256
    const/16 v31, 0x0

    .line 2257
    .line 2258
    const/16 v32, 0x7fe

    .line 2259
    .line 2260
    const/16 v20, 0x0

    .line 2261
    .line 2262
    const/16 v21, 0x0

    .line 2263
    .line 2264
    const/16 v22, 0x0

    .line 2265
    .line 2266
    const/16 v23, 0x0

    .line 2267
    .line 2268
    const/16 v24, 0x0

    .line 2269
    .line 2270
    const/16 v25, 0x0

    .line 2271
    .line 2272
    const/16 v26, 0x0

    .line 2273
    .line 2274
    const/16 v27, 0x0

    .line 2275
    .line 2276
    const/16 v28, 0x0

    .line 2277
    .line 2278
    move-object/from16 v30, v2

    .line 2279
    .line 2280
    invoke-static/range {v19 .. v32}, Ljb5;->a(Lkx4;Lj74;FLgg5;Lgt;Lp8;Lhe2;ZLtd;ZLgn2;Llp2;II)V

    .line 2281
    .line 2282
    .line 2283
    move-object/from16 v0, v30

    .line 2284
    .line 2285
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 2286
    .line 2287
    .line 2288
    goto :goto_27

    .line 2289
    :cond_5d
    move-object v0, v2

    .line 2290
    invoke-virtual {v0}, Llp2;->Q()V

    .line 2291
    .line 2292
    .line 2293
    :goto_27
    return-object v15

    .line 2294
    :pswitch_e
    check-cast v0, Lgn2;

    .line 2295
    .line 2296
    check-cast v12, Lh51;

    .line 2297
    .line 2298
    move-object/from16 v1, p1

    .line 2299
    .line 2300
    check-cast v1, Luw0;

    .line 2301
    .line 2302
    move-object/from16 v1, p2

    .line 2303
    .line 2304
    check-cast v1, Llp2;

    .line 2305
    .line 2306
    move-object/from16 v2, p3

    .line 2307
    .line 2308
    check-cast v2, Ljava/lang/Integer;

    .line 2309
    .line 2310
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2311
    .line 2312
    .line 2313
    move-result v2

    .line 2314
    and-int/lit8 v4, v2, 0x11

    .line 2315
    .line 2316
    if-eq v4, v9, :cond_5e

    .line 2317
    .line 2318
    move v4, v7

    .line 2319
    goto :goto_28

    .line 2320
    :cond_5e
    move v4, v3

    .line 2321
    :goto_28
    and-int/2addr v2, v7

    .line 2322
    invoke-virtual {v1, v2, v4}, Llp2;->N(IZ)Z

    .line 2323
    .line 2324
    .line 2325
    move-result v2

    .line 2326
    if-eqz v2, :cond_60

    .line 2327
    .line 2328
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v2

    .line 2332
    if-ne v2, v10, :cond_5f

    .line 2333
    .line 2334
    new-instance v2, Li51;

    .line 2335
    .line 2336
    invoke-direct {v2}, Li51;-><init>()V

    .line 2337
    .line 2338
    .line 2339
    invoke-virtual {v1, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 2340
    .line 2341
    .line 2342
    :cond_5f
    check-cast v2, Li51;

    .line 2343
    .line 2344
    iget-object v4, v2, Li51;->a:Lvd7;

    .line 2345
    .line 2346
    invoke-virtual {v4}, Lvd7;->clear()V

    .line 2347
    .line 2348
    .line 2349
    invoke-interface {v0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v2, v12, v1, v3}, Li51;->a(Lh51;Llp2;I)V

    .line 2353
    .line 2354
    .line 2355
    goto :goto_29

    .line 2356
    :cond_60
    invoke-virtual {v1}, Llp2;->Q()V

    .line 2357
    .line 2358
    .line 2359
    :goto_29
    return-object v15

    .line 2360
    :pswitch_f
    check-cast v0, Lgn2;

    .line 2361
    .line 2362
    move-object/from16 v1, p1

    .line 2363
    .line 2364
    check-cast v1, Ljava/lang/Throwable;

    .line 2365
    .line 2366
    move-object/from16 v1, p3

    .line 2367
    .line 2368
    check-cast v1, Ls61;

    .line 2369
    .line 2370
    invoke-static {v0, v12, v1}, Ljm4;->s(Lgn2;Ljava/lang/Object;Ls61;)V

    .line 2371
    .line 2372
    .line 2373
    return-object v15

    .line 2374
    nop

    .line 2375
    :pswitch_data_0
    .packed-switch 0x0
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

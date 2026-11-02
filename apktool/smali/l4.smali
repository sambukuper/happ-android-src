.class public final synthetic Ll4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Ll4;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, Ll4;->X:B

    .line 4
    .line 5
    const/high16 v1, 0x41800000    # 16.0f

    .line 6
    .line 7
    const/high16 v2, 0x41200000    # 10.0f

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    sget-object v4, Lhx4;->X:Lhx4;

    .line 11
    .line 12
    const/16 v5, 0x12

    .line 13
    .line 14
    const/4 v6, 0x4

    .line 15
    sget-object v7, Le02;->X:Le02;

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x6

    .line 19
    const/16 v10, 0x10

    .line 20
    .line 21
    sget-object v11, Ldn8;->a:Ldn8;

    .line 22
    .line 23
    const/4 v12, 0x1

    .line 24
    const/4 v13, 0x0

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, Lzr4;

    .line 31
    .line 32
    move-object/from16 v1, p2

    .line 33
    .line 34
    check-cast v1, Ltr4;

    .line 35
    .line 36
    move-object/from16 v2, p3

    .line 37
    .line 38
    check-cast v2, Lq31;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/16 v2, 0xf

    .line 47
    .line 48
    invoke-static {v13, v13, v13, v13, v2}, Ls31;->b(IIIII)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-interface {v1, v2, v3}, Ltr4;->o(J)Leo5;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Ld1;

    .line 57
    .line 58
    const/4 v3, 0x5

    .line 59
    invoke-direct {v2, v1, v3}, Ld1;-><init>(Leo5;B)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v13, v13, v7, v2}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :pswitch_0
    move-object/from16 v0, p1

    .line 68
    .line 69
    check-cast v0, Luw0;

    .line 70
    .line 71
    move-object/from16 v1, p2

    .line 72
    .line 73
    check-cast v1, Llp2;

    .line 74
    .line 75
    move-object/from16 v2, p3

    .line 76
    .line 77
    check-cast v2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    and-int/lit8 v0, v2, 0x11

    .line 87
    .line 88
    if-eq v0, v10, :cond_0

    .line 89
    .line 90
    move v13, v12

    .line 91
    :cond_0
    and-int/lit8 v0, v2, 0x1

    .line 92
    .line 93
    invoke-virtual {v1, v0, v13}, Llp2;->N(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {v1}, Llp2;->Q()V

    .line 101
    .line 102
    .line 103
    :goto_0
    return-object v11

    .line 104
    :pswitch_1
    move-object/from16 v0, p1

    .line 105
    .line 106
    check-cast v0, Lk44;

    .line 107
    .line 108
    move-object/from16 v1, p2

    .line 109
    .line 110
    check-cast v1, Llp2;

    .line 111
    .line 112
    move-object/from16 v2, p3

    .line 113
    .line 114
    check-cast v2, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    and-int/lit8 v3, v2, 0x6

    .line 124
    .line 125
    if-nez v3, :cond_3

    .line 126
    .line 127
    invoke-virtual {v1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_2

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    move v6, v8

    .line 135
    :goto_1
    or-int/2addr v2, v6

    .line 136
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 137
    .line 138
    if-eq v3, v5, :cond_4

    .line 139
    .line 140
    move v13, v12

    .line 141
    :cond_4
    and-int/2addr v2, v12

    .line 142
    invoke-virtual {v1, v2, v13}, Llp2;->N(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_5

    .line 147
    .line 148
    sget-object v2, Lhr;->a:Lox1;

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lgr;

    .line 155
    .line 156
    iget-object v2, v2, Lgr;->a:Lsr;

    .line 157
    .line 158
    const/high16 v2, 0x41c00000    # 24.0f

    .line 159
    .line 160
    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v0, v2}, Ldh3;->p(Lk44;Lkx4;)Lkx4;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v1, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_5
    invoke-virtual {v1}, Llp2;->Q()V

    .line 173
    .line 174
    .line 175
    :goto_2
    return-object v11

    .line 176
    :pswitch_2
    move-object/from16 v0, p1

    .line 177
    .line 178
    check-cast v0, Lek;

    .line 179
    .line 180
    move-object/from16 v6, p2

    .line 181
    .line 182
    check-cast v6, Llp2;

    .line 183
    .line 184
    move-object/from16 v1, p3

    .line 185
    .line 186
    check-cast v1, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    and-int/lit8 v0, v1, 0x11

    .line 196
    .line 197
    if-eq v0, v10, :cond_6

    .line 198
    .line 199
    move v13, v12

    .line 200
    :cond_6
    and-int/lit8 v0, v1, 0x1

    .line 201
    .line 202
    invoke-virtual {v6, v0, v13}, Llp2;->N(IZ)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    sget v0, Lq36;->icon_warning:I

    .line 209
    .line 210
    invoke-static {v0, v6}, Lu28;->p(ILlp2;)Lg73;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    sget v0, Ly46;->routing_downloading_geo_files_failure:I

    .line 215
    .line 216
    invoke-static {v0, v6}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    const/4 v7, 0x0

    .line 221
    const/16 v8, 0xa

    .line 222
    .line 223
    const/4 v2, 0x0

    .line 224
    const-wide/16 v4, 0x0

    .line 225
    .line 226
    invoke-static/range {v1 .. v8}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_7
    invoke-virtual {v6}, Llp2;->Q()V

    .line 231
    .line 232
    .line 233
    :goto_3
    return-object v11

    .line 234
    :pswitch_3
    move-object/from16 v0, p1

    .line 235
    .line 236
    check-cast v0, Lek;

    .line 237
    .line 238
    move-object/from16 v6, p2

    .line 239
    .line 240
    check-cast v6, Llp2;

    .line 241
    .line 242
    move-object/from16 v1, p3

    .line 243
    .line 244
    check-cast v1, Ljava/lang/Integer;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    and-int/lit8 v0, v1, 0x11

    .line 254
    .line 255
    if-eq v0, v10, :cond_8

    .line 256
    .line 257
    move v13, v12

    .line 258
    :cond_8
    and-int/lit8 v0, v1, 0x1

    .line 259
    .line 260
    invoke-virtual {v6, v0, v13}, Llp2;->N(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_9

    .line 265
    .line 266
    sget v0, Lq36;->icon_warning:I

    .line 267
    .line 268
    invoke-static {v0, v6}, Lu28;->p(ILlp2;)Lg73;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    sget v0, Ly46;->routing_downloading_geo_files_failure:I

    .line 273
    .line 274
    invoke-static {v0, v6}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    const/4 v7, 0x0

    .line 279
    const/16 v8, 0xa

    .line 280
    .line 281
    const/4 v2, 0x0

    .line 282
    const-wide/16 v4, 0x0

    .line 283
    .line 284
    invoke-static/range {v1 .. v8}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_9
    invoke-virtual {v6}, Llp2;->Q()V

    .line 289
    .line 290
    .line 291
    :goto_4
    return-object v11

    .line 292
    :pswitch_4
    move-object/from16 v0, p1

    .line 293
    .line 294
    check-cast v0, Lk44;

    .line 295
    .line 296
    move-object/from16 v2, p2

    .line 297
    .line 298
    check-cast v2, Llp2;

    .line 299
    .line 300
    move-object/from16 v3, p3

    .line 301
    .line 302
    check-cast v3, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    and-int/lit8 v0, v3, 0x11

    .line 312
    .line 313
    if-eq v0, v10, :cond_a

    .line 314
    .line 315
    move v13, v12

    .line 316
    :cond_a
    and-int/lit8 v0, v3, 0x1

    .line 317
    .line 318
    invoke-virtual {v2, v0, v13}, Llp2;->N(IZ)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_b

    .line 323
    .line 324
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 325
    .line 326
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    sget-object v1, Lep;->z:Lox1;

    .line 331
    .line 332
    invoke-virtual {v2, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Ldp;

    .line 337
    .line 338
    iget-object v1, v1, Ldp;->b:Luo;

    .line 339
    .line 340
    iget-wide v3, v1, Luo;->b:J

    .line 341
    .line 342
    sget-object v1, Lu70;->e:Lx03;

    .line 343
    .line 344
    invoke-static {v0, v3, v4, v1}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v2, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 349
    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_b
    invoke-virtual {v2}, Llp2;->Q()V

    .line 353
    .line 354
    .line 355
    :goto_5
    return-object v11

    .line 356
    :pswitch_5
    move-object/from16 v0, p1

    .line 357
    .line 358
    check-cast v0, Lk44;

    .line 359
    .line 360
    move-object/from16 v1, p2

    .line 361
    .line 362
    check-cast v1, Llp2;

    .line 363
    .line 364
    move-object/from16 v2, p3

    .line 365
    .line 366
    check-cast v2, Ljava/lang/Integer;

    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    and-int/lit8 v0, v2, 0x11

    .line 376
    .line 377
    if-eq v0, v10, :cond_c

    .line 378
    .line 379
    move v0, v12

    .line 380
    goto :goto_6

    .line 381
    :cond_c
    move v0, v13

    .line 382
    :goto_6
    and-int/2addr v2, v12

    .line 383
    invoke-virtual {v1, v2, v0}, Llp2;->N(IZ)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_d

    .line 388
    .line 389
    invoke-static {v3, v1, v13, v12}, Lz39;->c(Lkx4;Llp2;II)V

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_d
    invoke-virtual {v1}, Llp2;->Q()V

    .line 394
    .line 395
    .line 396
    :goto_7
    return-object v11

    .line 397
    :pswitch_6
    move-object/from16 v0, p1

    .line 398
    .line 399
    check-cast v0, Lk44;

    .line 400
    .line 401
    move-object/from16 v1, p2

    .line 402
    .line 403
    check-cast v1, Llp2;

    .line 404
    .line 405
    move-object/from16 v2, p3

    .line 406
    .line 407
    check-cast v2, Ljava/lang/Integer;

    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    and-int/lit8 v0, v2, 0x11

    .line 417
    .line 418
    if-eq v0, v10, :cond_e

    .line 419
    .line 420
    move v13, v12

    .line 421
    :cond_e
    and-int/lit8 v0, v2, 0x1

    .line 422
    .line 423
    invoke-virtual {v1, v0, v13}, Llp2;->N(IZ)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_f

    .line 428
    .line 429
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 430
    .line 431
    invoke-static {v0, v1, v9}, Lg28;->a(Lkx4;Llp2;I)V

    .line 432
    .line 433
    .line 434
    goto :goto_8

    .line 435
    :cond_f
    invoke-virtual {v1}, Llp2;->Q()V

    .line 436
    .line 437
    .line 438
    :goto_8
    return-object v11

    .line 439
    :pswitch_7
    move-object/from16 v0, p1

    .line 440
    .line 441
    check-cast v0, Lk44;

    .line 442
    .line 443
    move-object/from16 v1, p2

    .line 444
    .line 445
    check-cast v1, Llp2;

    .line 446
    .line 447
    move-object/from16 v2, p3

    .line 448
    .line 449
    check-cast v2, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    and-int/lit8 v0, v2, 0x11

    .line 459
    .line 460
    if-eq v0, v10, :cond_10

    .line 461
    .line 462
    move v0, v12

    .line 463
    goto :goto_9

    .line 464
    :cond_10
    move v0, v13

    .line 465
    :goto_9
    and-int/2addr v2, v12

    .line 466
    invoke-virtual {v1, v2, v0}, Llp2;->N(IZ)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-eqz v0, :cond_11

    .line 471
    .line 472
    invoke-static {v3, v1, v13, v12}, Lz39;->c(Lkx4;Llp2;II)V

    .line 473
    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_11
    invoke-virtual {v1}, Llp2;->Q()V

    .line 477
    .line 478
    .line 479
    :goto_a
    return-object v11

    .line 480
    :pswitch_8
    move-object/from16 v0, p1

    .line 481
    .line 482
    check-cast v0, Lk44;

    .line 483
    .line 484
    move-object/from16 v1, p2

    .line 485
    .line 486
    check-cast v1, Llp2;

    .line 487
    .line 488
    move-object/from16 v2, p3

    .line 489
    .line 490
    check-cast v2, Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    and-int/lit8 v0, v2, 0x11

    .line 500
    .line 501
    if-eq v0, v10, :cond_12

    .line 502
    .line 503
    move v0, v12

    .line 504
    goto :goto_b

    .line 505
    :cond_12
    move v0, v13

    .line 506
    :goto_b
    and-int/2addr v2, v12

    .line 507
    invoke-virtual {v1, v2, v0}, Llp2;->N(IZ)Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-eqz v0, :cond_13

    .line 512
    .line 513
    invoke-static {v3, v1, v13, v12}, Lz39;->c(Lkx4;Llp2;II)V

    .line 514
    .line 515
    .line 516
    goto :goto_c

    .line 517
    :cond_13
    invoke-virtual {v1}, Llp2;->Q()V

    .line 518
    .line 519
    .line 520
    :goto_c
    return-object v11

    .line 521
    :pswitch_9
    move-object/from16 v0, p1

    .line 522
    .line 523
    check-cast v0, Lk44;

    .line 524
    .line 525
    move-object/from16 v1, p2

    .line 526
    .line 527
    check-cast v1, Llp2;

    .line 528
    .line 529
    move-object/from16 v2, p3

    .line 530
    .line 531
    check-cast v2, Ljava/lang/Integer;

    .line 532
    .line 533
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    and-int/lit8 v0, v2, 0x11

    .line 541
    .line 542
    if-eq v0, v10, :cond_14

    .line 543
    .line 544
    move v13, v12

    .line 545
    :cond_14
    and-int/lit8 v0, v2, 0x1

    .line 546
    .line 547
    invoke-virtual {v1, v0, v13}, Llp2;->N(IZ)Z

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    if-eqz v0, :cond_15

    .line 552
    .line 553
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 554
    .line 555
    invoke-static {v0, v1, v9}, Lkm4;->f(Lkx4;Llp2;I)V

    .line 556
    .line 557
    .line 558
    goto :goto_d

    .line 559
    :cond_15
    invoke-virtual {v1}, Llp2;->Q()V

    .line 560
    .line 561
    .line 562
    :goto_d
    return-object v11

    .line 563
    :pswitch_a
    move-object/from16 v0, p1

    .line 564
    .line 565
    check-cast v0, Lk44;

    .line 566
    .line 567
    move-object/from16 v2, p2

    .line 568
    .line 569
    check-cast v2, Llp2;

    .line 570
    .line 571
    move-object/from16 v3, p3

    .line 572
    .line 573
    check-cast v3, Ljava/lang/Integer;

    .line 574
    .line 575
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    and-int/lit8 v0, v3, 0x11

    .line 583
    .line 584
    if-eq v0, v10, :cond_16

    .line 585
    .line 586
    move v13, v12

    .line 587
    :cond_16
    and-int/lit8 v0, v3, 0x1

    .line 588
    .line 589
    invoke-virtual {v2, v0, v13}, Llp2;->N(IZ)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_17

    .line 594
    .line 595
    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-static {v2, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 600
    .line 601
    .line 602
    goto :goto_e

    .line 603
    :cond_17
    invoke-virtual {v2}, Llp2;->Q()V

    .line 604
    .line 605
    .line 606
    :goto_e
    return-object v11

    .line 607
    :pswitch_b
    move-object/from16 v0, p1

    .line 608
    .line 609
    check-cast v0, Ljava/lang/Boolean;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    move-object/from16 v1, p2

    .line 616
    .line 617
    check-cast v1, Llp2;

    .line 618
    .line 619
    move-object/from16 v3, p3

    .line 620
    .line 621
    check-cast v3, Ljava/lang/Integer;

    .line 622
    .line 623
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    and-int/lit8 v4, v3, 0x6

    .line 628
    .line 629
    if-nez v4, :cond_19

    .line 630
    .line 631
    invoke-virtual {v1, v0}, Llp2;->g(Z)Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-eqz v4, :cond_18

    .line 636
    .line 637
    goto :goto_f

    .line 638
    :cond_18
    move v6, v8

    .line 639
    :goto_f
    or-int/2addr v3, v6

    .line 640
    :cond_19
    and-int/lit8 v4, v3, 0x13

    .line 641
    .line 642
    if-eq v4, v5, :cond_1a

    .line 643
    .line 644
    move v4, v12

    .line 645
    goto :goto_10

    .line 646
    :cond_1a
    move v4, v13

    .line 647
    :goto_10
    and-int/2addr v3, v12

    .line 648
    invoke-virtual {v1, v3, v4}, Llp2;->N(IZ)Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-eqz v3, :cond_1e

    .line 653
    .line 654
    const/16 v3, 0x20

    .line 655
    .line 656
    const/high16 v4, 0x41600000    # 14.0f

    .line 657
    .line 658
    const/high16 v5, 0x40a00000    # 5.0f

    .line 659
    .line 660
    if-eqz v0, :cond_1c

    .line 661
    .line 662
    const v0, 0x15bebdc1

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1, v0}, Llp2;->W(I)V

    .line 666
    .line 667
    .line 668
    sget-object v0, Lg33;->e:Lg73;

    .line 669
    .line 670
    if-eqz v0, :cond_1b

    .line 671
    .line 672
    :goto_11
    move-object v14, v0

    .line 673
    goto :goto_12

    .line 674
    :cond_1b
    new-instance v14, Lf73;

    .line 675
    .line 676
    const/16 v22, 0x0

    .line 677
    .line 678
    const/16 v24, 0x60

    .line 679
    .line 680
    const-string v15, "Filled.PlayArrow"

    .line 681
    .line 682
    const/high16 v16, 0x41c00000    # 24.0f

    .line 683
    .line 684
    const/high16 v17, 0x41c00000    # 24.0f

    .line 685
    .line 686
    const/high16 v18, 0x41c00000    # 24.0f

    .line 687
    .line 688
    const/high16 v19, 0x41c00000    # 24.0f

    .line 689
    .line 690
    const-wide/16 v20, 0x0

    .line 691
    .line 692
    const/16 v23, 0x0

    .line 693
    .line 694
    invoke-direct/range {v14 .. v24}, Lf73;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 695
    .line 696
    .line 697
    sget v0, Lgu8;->a:I

    .line 698
    .line 699
    new-instance v0, Lfe7;

    .line 700
    .line 701
    sget-wide v6, Ldw0;->b:J

    .line 702
    .line 703
    invoke-direct {v0, v6, v7}, Lfe7;-><init>(J)V

    .line 704
    .line 705
    .line 706
    new-instance v2, Ljava/util/ArrayList;

    .line 707
    .line 708
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 709
    .line 710
    .line 711
    new-instance v3, Lvi5;

    .line 712
    .line 713
    const/high16 v6, 0x41000000    # 8.0f

    .line 714
    .line 715
    invoke-direct {v3, v6, v5}, Lvi5;-><init>(FF)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    new-instance v3, Lhj5;

    .line 722
    .line 723
    invoke-direct {v3, v4}, Lhj5;-><init>(F)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    new-instance v3, Lcj5;

    .line 730
    .line 731
    const/high16 v4, 0x41300000    # 11.0f

    .line 732
    .line 733
    const/high16 v5, -0x3f200000    # -7.0f

    .line 734
    .line 735
    invoke-direct {v3, v4, v5}, Lcj5;-><init>(FF)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    sget-object v3, Lri5;->c:Lri5;

    .line 742
    .line 743
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    invoke-static {v14, v2, v0}, Lf73;->a(Lf73;Ljava/util/ArrayList;Lfe7;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v14}, Lf73;->b()Lg73;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    sput-object v0, Lg33;->e:Lg73;

    .line 754
    .line 755
    goto :goto_11

    .line 756
    :goto_12
    sget-object v0, Lep;->z:Lox1;

    .line 757
    .line 758
    invoke-virtual {v1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    check-cast v0, Ldp;

    .line 763
    .line 764
    iget-object v0, v0, Ldp;->c:Lxr;

    .line 765
    .line 766
    iget-wide v2, v0, Lxr;->a:J

    .line 767
    .line 768
    const/16 v20, 0x0

    .line 769
    .line 770
    const/16 v21, 0x6

    .line 771
    .line 772
    const/4 v15, 0x0

    .line 773
    const/16 v16, 0x0

    .line 774
    .line 775
    move-object/from16 v19, v1

    .line 776
    .line 777
    move-wide/from16 v17, v2

    .line 778
    .line 779
    invoke-static/range {v14 .. v21}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 780
    .line 781
    .line 782
    move-object/from16 v0, v19

    .line 783
    .line 784
    invoke-virtual {v0, v13}, Llp2;->p(Z)V

    .line 785
    .line 786
    .line 787
    goto/16 :goto_15

    .line 788
    .line 789
    :cond_1c
    move-object v0, v1

    .line 790
    const v1, 0x15becedc

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 794
    .line 795
    .line 796
    sget-object v1, Li21;->h0:Lg73;

    .line 797
    .line 798
    if-eqz v1, :cond_1d

    .line 799
    .line 800
    :goto_13
    move-object v14, v1

    .line 801
    goto/16 :goto_14

    .line 802
    .line 803
    :cond_1d
    new-instance v14, Lf73;

    .line 804
    .line 805
    const/16 v22, 0x0

    .line 806
    .line 807
    const/16 v24, 0x60

    .line 808
    .line 809
    const-string v15, "Filled.Pause"

    .line 810
    .line 811
    const/high16 v16, 0x41c00000    # 24.0f

    .line 812
    .line 813
    const/high16 v17, 0x41c00000    # 24.0f

    .line 814
    .line 815
    const/high16 v18, 0x41c00000    # 24.0f

    .line 816
    .line 817
    const/high16 v19, 0x41c00000    # 24.0f

    .line 818
    .line 819
    const-wide/16 v20, 0x0

    .line 820
    .line 821
    const/16 v23, 0x0

    .line 822
    .line 823
    invoke-direct/range {v14 .. v24}, Lf73;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 824
    .line 825
    .line 826
    sget v1, Lgu8;->a:I

    .line 827
    .line 828
    new-instance v1, Lfe7;

    .line 829
    .line 830
    sget-wide v6, Ldw0;->b:J

    .line 831
    .line 832
    invoke-direct {v1, v6, v7}, Lfe7;-><init>(J)V

    .line 833
    .line 834
    .line 835
    new-instance v6, Ljava/util/ArrayList;

    .line 836
    .line 837
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 838
    .line 839
    .line 840
    new-instance v3, Lvi5;

    .line 841
    .line 842
    const/high16 v7, 0x40c00000    # 6.0f

    .line 843
    .line 844
    const/high16 v8, 0x41980000    # 19.0f

    .line 845
    .line 846
    invoke-direct {v3, v7, v8}, Lvi5;-><init>(FF)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    new-instance v3, Lbj5;

    .line 853
    .line 854
    const/high16 v8, 0x40800000    # 4.0f

    .line 855
    .line 856
    invoke-direct {v3, v8}, Lbj5;-><init>(F)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    new-instance v3, Lui5;

    .line 863
    .line 864
    invoke-direct {v3, v2, v5}, Lui5;-><init>(FF)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    new-instance v2, Lui5;

    .line 871
    .line 872
    invoke-direct {v2, v7, v5}, Lui5;-><init>(FF)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    new-instance v2, Lhj5;

    .line 879
    .line 880
    invoke-direct {v2, v4}, Lhj5;-><init>(F)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    sget-object v2, Lri5;->c:Lri5;

    .line 887
    .line 888
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    new-instance v2, Lvi5;

    .line 892
    .line 893
    invoke-direct {v2, v4, v5}, Lvi5;-><init>(FF)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    new-instance v2, Lhj5;

    .line 900
    .line 901
    invoke-direct {v2, v4}, Lhj5;-><init>(F)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    new-instance v2, Lbj5;

    .line 908
    .line 909
    invoke-direct {v2, v8}, Lbj5;-><init>(F)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 913
    .line 914
    .line 915
    new-instance v2, Lui5;

    .line 916
    .line 917
    const/high16 v3, 0x41900000    # 18.0f

    .line 918
    .line 919
    invoke-direct {v2, v3, v5}, Lui5;-><init>(FF)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    new-instance v2, Lbj5;

    .line 926
    .line 927
    const/high16 v3, -0x3f800000    # -4.0f

    .line 928
    .line 929
    invoke-direct {v2, v3}, Lbj5;-><init>(F)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 933
    .line 934
    .line 935
    sget-object v2, Lri5;->c:Lri5;

    .line 936
    .line 937
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    invoke-static {v14, v6, v1}, Lf73;->a(Lf73;Ljava/util/ArrayList;Lfe7;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v14}, Lf73;->b()Lg73;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    sput-object v1, Li21;->h0:Lg73;

    .line 948
    .line 949
    goto/16 :goto_13

    .line 950
    .line 951
    :goto_14
    sget-object v1, Lep;->z:Lox1;

    .line 952
    .line 953
    invoke-virtual {v0, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    check-cast v1, Ldp;

    .line 958
    .line 959
    iget-object v1, v1, Ldp;->c:Lxr;

    .line 960
    .line 961
    iget-wide v1, v1, Lxr;->a:J

    .line 962
    .line 963
    const/16 v20, 0x0

    .line 964
    .line 965
    const/16 v21, 0x6

    .line 966
    .line 967
    const/4 v15, 0x0

    .line 968
    const/16 v16, 0x0

    .line 969
    .line 970
    move-object/from16 v19, v0

    .line 971
    .line 972
    move-wide/from16 v17, v1

    .line 973
    .line 974
    invoke-static/range {v14 .. v21}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0, v13}, Llp2;->p(Z)V

    .line 978
    .line 979
    .line 980
    goto :goto_15

    .line 981
    :cond_1e
    move-object v0, v1

    .line 982
    invoke-virtual {v0}, Llp2;->Q()V

    .line 983
    .line 984
    .line 985
    :goto_15
    return-object v11

    .line 986
    :pswitch_c
    move-object/from16 v0, p1

    .line 987
    .line 988
    check-cast v0, Lxq6;

    .line 989
    .line 990
    move-object/from16 v1, p2

    .line 991
    .line 992
    check-cast v1, Llp2;

    .line 993
    .line 994
    move-object/from16 v2, p3

    .line 995
    .line 996
    check-cast v2, Ljava/lang/Integer;

    .line 997
    .line 998
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 999
    .line 1000
    .line 1001
    move-result v2

    .line 1002
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    and-int/lit8 v0, v2, 0x11

    .line 1006
    .line 1007
    if-eq v0, v10, :cond_1f

    .line 1008
    .line 1009
    move v13, v12

    .line 1010
    :cond_1f
    and-int/lit8 v0, v2, 0x1

    .line 1011
    .line 1012
    invoke-virtual {v1, v0, v13}, Llp2;->N(IZ)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    if-eqz v0, :cond_20

    .line 1017
    .line 1018
    goto :goto_16

    .line 1019
    :cond_20
    invoke-virtual {v1}, Llp2;->Q()V

    .line 1020
    .line 1021
    .line 1022
    :goto_16
    return-object v11

    .line 1023
    :pswitch_d
    move-object/from16 v0, p1

    .line 1024
    .line 1025
    check-cast v0, Lh51;

    .line 1026
    .line 1027
    move-object/from16 v1, p2

    .line 1028
    .line 1029
    check-cast v1, Llp2;

    .line 1030
    .line 1031
    move-object/from16 v2, p3

    .line 1032
    .line 1033
    check-cast v2, Ljava/lang/Integer;

    .line 1034
    .line 1035
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1036
    .line 1037
    .line 1038
    move-result v2

    .line 1039
    and-int/lit8 v3, v2, 0x6

    .line 1040
    .line 1041
    if-nez v3, :cond_22

    .line 1042
    .line 1043
    invoke-virtual {v1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v3

    .line 1047
    if-eqz v3, :cond_21

    .line 1048
    .line 1049
    goto :goto_17

    .line 1050
    :cond_21
    move v6, v8

    .line 1051
    :goto_17
    or-int/2addr v2, v6

    .line 1052
    :cond_22
    and-int/lit8 v3, v2, 0x13

    .line 1053
    .line 1054
    if-eq v3, v5, :cond_23

    .line 1055
    .line 1056
    move v3, v12

    .line 1057
    goto :goto_18

    .line 1058
    :cond_23
    move v3, v13

    .line 1059
    :goto_18
    and-int/2addr v2, v12

    .line 1060
    invoke-virtual {v1, v2, v3}, Llp2;->N(IZ)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v2

    .line 1064
    if-eqz v2, :cond_24

    .line 1065
    .line 1066
    sget v2, Lj51;->g:F

    .line 1067
    .line 1068
    const/4 v3, 0x0

    .line 1069
    invoke-static {v4, v3, v2, v12}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1074
    .line 1075
    invoke-interface {v2, v3}, Lkx4;->y(Lkx4;)Lkx4;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    sget v3, Lj51;->f:F

    .line 1080
    .line 1081
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    iget-wide v3, v0, Lh51;->c:J

    .line 1086
    .line 1087
    sget-object v0, Lu70;->e:Lx03;

    .line 1088
    .line 1089
    invoke-static {v2, v3, v4, v0}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-static {v0, v1, v13}, Lg80;->a(Lkx4;Llp2;I)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_19

    .line 1097
    :cond_24
    invoke-virtual {v1}, Llp2;->Q()V

    .line 1098
    .line 1099
    .line 1100
    :goto_19
    return-object v11

    .line 1101
    :pswitch_e
    move-object/from16 v0, p1

    .line 1102
    .line 1103
    check-cast v0, Lzr4;

    .line 1104
    .line 1105
    move-object/from16 v1, p2

    .line 1106
    .line 1107
    check-cast v1, Ltr4;

    .line 1108
    .line 1109
    move-object/from16 v3, p3

    .line 1110
    .line 1111
    check-cast v3, Lq31;

    .line 1112
    .line 1113
    invoke-interface {v0, v2}, Lfi1;->x0(F)I

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    iget-wide v3, v3, Lq31;->a:J

    .line 1118
    .line 1119
    mul-int/lit8 v5, v2, 0x2

    .line 1120
    .line 1121
    invoke-static {v13, v3, v4, v5}, Ls31;->i(IJI)J

    .line 1122
    .line 1123
    .line 1124
    move-result-wide v3

    .line 1125
    invoke-interface {v1, v3, v4}, Ltr4;->o(J)Leo5;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    iget v3, v1, Leo5;->Y:I

    .line 1130
    .line 1131
    sub-int/2addr v3, v5

    .line 1132
    iget v4, v1, Leo5;->X:I

    .line 1133
    .line 1134
    new-instance v5, Lk4;

    .line 1135
    .line 1136
    invoke-direct {v5, v1, v2, v13}, Lk4;-><init>(Leo5;IB)V

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v0, v4, v3, v7, v5}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    return-object v0

    .line 1144
    :pswitch_f
    move-object/from16 v0, p1

    .line 1145
    .line 1146
    check-cast v0, Lzr4;

    .line 1147
    .line 1148
    move-object/from16 v1, p2

    .line 1149
    .line 1150
    check-cast v1, Ltr4;

    .line 1151
    .line 1152
    move-object/from16 v3, p3

    .line 1153
    .line 1154
    check-cast v3, Lq31;

    .line 1155
    .line 1156
    invoke-interface {v0, v2}, Lfi1;->x0(F)I

    .line 1157
    .line 1158
    .line 1159
    move-result v2

    .line 1160
    iget-wide v3, v3, Lq31;->a:J

    .line 1161
    .line 1162
    mul-int/lit8 v5, v2, 0x2

    .line 1163
    .line 1164
    invoke-static {v5, v3, v4, v13}, Ls31;->i(IJI)J

    .line 1165
    .line 1166
    .line 1167
    move-result-wide v3

    .line 1168
    invoke-interface {v1, v3, v4}, Ltr4;->o(J)Leo5;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v1

    .line 1172
    iget v3, v1, Leo5;->Y:I

    .line 1173
    .line 1174
    iget v4, v1, Leo5;->X:I

    .line 1175
    .line 1176
    sub-int/2addr v4, v5

    .line 1177
    new-instance v5, Lk4;

    .line 1178
    .line 1179
    invoke-direct {v5, v1, v2, v12}, Lk4;-><init>(Leo5;IB)V

    .line 1180
    .line 1181
    .line 1182
    invoke-interface {v0, v4, v3, v7, v5}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    return-object v0

    .line 1187
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

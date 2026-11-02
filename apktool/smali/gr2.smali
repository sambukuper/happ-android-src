.class public abstract Lgr2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;Lgn2;Lkx4;Llp2;I)V
    .locals 49

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v14, p4

    .line 10
    .line 11
    move/from16 v0, p5

    .line 12
    .line 13
    const v5, 0x75e409e3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v14, v5}, Llp2;->X(I)Llp2;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v5, v0, 0x6

    .line 20
    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    invoke-virtual {v14, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x2

    .line 32
    :goto_0
    or-int/2addr v5, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v5, v0

    .line 35
    :goto_1
    and-int/lit8 v7, v0, 0x30

    .line 36
    .line 37
    if-nez v7, :cond_3

    .line 38
    .line 39
    invoke-virtual {v14, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v5, v7

    .line 51
    :cond_3
    and-int/lit16 v7, v0, 0x180

    .line 52
    .line 53
    if-nez v7, :cond_5

    .line 54
    .line 55
    invoke-virtual {v14, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const/16 v7, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v7, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v5, v7

    .line 67
    :cond_5
    and-int/lit16 v7, v0, 0xc00

    .line 68
    .line 69
    if-nez v7, :cond_7

    .line 70
    .line 71
    invoke-virtual {v14, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_6

    .line 76
    .line 77
    const/16 v7, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v7, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v5, v7

    .line 83
    :cond_7
    and-int/lit16 v7, v5, 0x493

    .line 84
    .line 85
    const/16 v9, 0x492

    .line 86
    .line 87
    if-eq v7, v9, :cond_8

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/4 v7, 0x0

    .line 92
    :goto_5
    and-int/lit8 v9, v5, 0x1

    .line 93
    .line 94
    invoke-virtual {v14, v9, v7}, Llp2;->N(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_15

    .line 99
    .line 100
    new-instance v7, Lft;

    .line 101
    .line 102
    new-instance v9, Lbt;

    .line 103
    .line 104
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    const/high16 v12, 0x41800000    # 16.0f

    .line 108
    .line 109
    invoke-direct {v7, v12, v9}, Lft;-><init>(FLbt;)V

    .line 110
    .line 111
    .line 112
    sget-object v9, Lpz2;->q0:Ln50;

    .line 113
    .line 114
    const/4 v13, 0x6

    .line 115
    invoke-static {v7, v9, v14, v13}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    iget-wide v8, v14, Llp2;->T:J

    .line 120
    .line 121
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    invoke-virtual {v14}, Llp2;->l()Lkl5;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-static {v14, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget-object v17, Luz0;->j:Lpz2;

    .line 134
    .line 135
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v14}, Llp2;->Z()V

    .line 139
    .line 140
    .line 141
    iget-boolean v10, v14, Llp2;->S:Z

    .line 142
    .line 143
    if-eqz v10, :cond_9

    .line 144
    .line 145
    invoke-virtual {v14}, Llp2;->k()V

    .line 146
    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_9
    invoke-virtual {v14}, Llp2;->j0()V

    .line 150
    .line 151
    .line 152
    :goto_6
    sget-object v10, Lpz2;->B0:Ldx0;

    .line 153
    .line 154
    invoke-static {v10, v14, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object v7, Lpz2;->A0:Ldx0;

    .line 158
    .line 159
    invoke-static {v7, v14, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    sget-object v9, Lpz2;->C0:Ldx0;

    .line 167
    .line 168
    invoke-static {v9, v14, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v14}, Lpn7;->l(Llp2;)V

    .line 172
    .line 173
    .line 174
    sget-object v8, Lpz2;->z0:Ldx0;

    .line 175
    .line 176
    invoke-static {v8, v14, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object v6, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 180
    .line 181
    instance-of v11, v2, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$Failure;

    .line 182
    .line 183
    if-eqz v11, :cond_a

    .line 184
    .line 185
    sget v11, Ly46;->geo_file_download_failure:I

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_a
    instance-of v11, v2, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$LinkNotCorrect;

    .line 189
    .line 190
    if-eqz v11, :cond_14

    .line 191
    .line 192
    sget v11, Ly46;->geo_file_download_link_not_correct:I

    .line 193
    .line 194
    :goto_7
    invoke-static {v11, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    invoke-static {v14}, Lys0;->D(Llp2;)Lds;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    iget-object v12, v12, Lds;->d:Lo88;

    .line 203
    .line 204
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    iget-object v13, v13, Ldp;->c:Lxr;

    .line 209
    .line 210
    move/from16 v33, v5

    .line 211
    .line 212
    iget-wide v4, v13, Lxr;->c:J

    .line 213
    .line 214
    const/16 v31, 0x0

    .line 215
    .line 216
    const v32, 0xfffffe

    .line 217
    .line 218
    .line 219
    const-wide/16 v23, 0x0

    .line 220
    .line 221
    const/16 v25, 0x0

    .line 222
    .line 223
    const/16 v26, 0x0

    .line 224
    .line 225
    const-wide/16 v27, 0x0

    .line 226
    .line 227
    const-wide/16 v29, 0x0

    .line 228
    .line 229
    move-wide/from16 v21, v4

    .line 230
    .line 231
    move-object/from16 v20, v12

    .line 232
    .line 233
    invoke-static/range {v20 .. v32}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    const/16 v5, 0x100

    .line 238
    .line 239
    const/16 v15, 0x30

    .line 240
    .line 241
    const/4 v12, 0x4

    .line 242
    const/16 v16, 0x1f8

    .line 243
    .line 244
    move-object v13, v8

    .line 245
    const/4 v8, 0x0

    .line 246
    move-object/from16 v20, v9

    .line 247
    .line 248
    const/4 v9, 0x0

    .line 249
    move-object/from16 v21, v10

    .line 250
    .line 251
    const/4 v10, 0x0

    .line 252
    move/from16 v22, v5

    .line 253
    .line 254
    move-object v5, v11

    .line 255
    const/4 v11, 0x0

    .line 256
    move/from16 v23, v12

    .line 257
    .line 258
    const/4 v12, 0x0

    .line 259
    move-object/from16 v24, v13

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    move-object v2, v7

    .line 263
    move-object/from16 v1, v20

    .line 264
    .line 265
    move-object/from16 v0, v21

    .line 266
    .line 267
    move-object/from16 v3, v24

    .line 268
    .line 269
    move-object v7, v4

    .line 270
    const/4 v4, 0x6

    .line 271
    invoke-static/range {v5 .. v16}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 272
    .line 273
    .line 274
    new-instance v5, Lft;

    .line 275
    .line 276
    new-instance v7, Lbt;

    .line 277
    .line 278
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    const/high16 v8, 0x41000000    # 8.0f

    .line 282
    .line 283
    invoke-direct {v5, v8, v7}, Lft;-><init>(FLbt;)V

    .line 284
    .line 285
    .line 286
    sget-object v7, Lpz2;->n0:Lo50;

    .line 287
    .line 288
    invoke-static {v5, v7, v14, v4}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    iget-wide v7, v14, Llp2;->T:J

    .line 293
    .line 294
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    invoke-virtual {v14}, Llp2;->l()Lkl5;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-static {v14, v6}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-virtual {v14}, Llp2;->Z()V

    .line 307
    .line 308
    .line 309
    iget-boolean v8, v14, Llp2;->S:Z

    .line 310
    .line 311
    if-eqz v8, :cond_b

    .line 312
    .line 313
    invoke-virtual {v14}, Llp2;->k()V

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_b
    invoke-virtual {v14}, Llp2;->j0()V

    .line 318
    .line 319
    .line 320
    :goto_8
    invoke-static {v0, v14, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v2, v14, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v5, v14, v1, v14}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v3, v14, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    new-instance v0, Ld44;

    .line 333
    .line 334
    const/high16 v1, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/4 v2, 0x1

    .line 337
    invoke-direct {v0, v1, v2}, Ld44;-><init>(FZ)V

    .line 338
    .line 339
    .line 340
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    iget-object v1, v1, Ldp;->g:Lir;

    .line 345
    .line 346
    iget-wide v1, v1, Lir;->i:J

    .line 347
    .line 348
    sget-object v3, Lu70;->e:Lx03;

    .line 349
    .line 350
    invoke-static {v0, v1, v2, v3}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    new-instance v15, Lig5;

    .line 355
    .line 356
    const/high16 v0, 0x41800000    # 16.0f

    .line 357
    .line 358
    invoke-direct {v15, v0, v0, v0, v0}, Lig5;-><init>(FFFF)V

    .line 359
    .line 360
    .line 361
    invoke-static {v14}, Lys0;->D(Llp2;)Lds;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    iget-object v0, v0, Lds;->c:Lo88;

    .line 366
    .line 367
    sget-object v40, Ldj2;->f0:Ldj2;

    .line 368
    .line 369
    const/16 v46, 0x0

    .line 370
    .line 371
    const v47, 0xfffffb

    .line 372
    .line 373
    .line 374
    const-wide/16 v36, 0x0

    .line 375
    .line 376
    const-wide/16 v38, 0x0

    .line 377
    .line 378
    const/16 v41, 0x0

    .line 379
    .line 380
    const-wide/16 v42, 0x0

    .line 381
    .line 382
    const-wide/16 v44, 0x0

    .line 383
    .line 384
    move-object/from16 v35, v0

    .line 385
    .line 386
    invoke-static/range {v35 .. v47}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    sget v0, Ly46;->geo_file_download_open_profile:I

    .line 391
    .line 392
    invoke-static {v0, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iget-object v0, v0, Ldp;->g:Lir;

    .line 401
    .line 402
    iget-wide v0, v0, Lir;->e:J

    .line 403
    .line 404
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    iget-object v2, v2, Ldp;->g:Lir;

    .line 409
    .line 410
    iget-wide v2, v2, Lir;->i:J

    .line 411
    .line 412
    new-instance v4, Ldw0;

    .line 413
    .line 414
    invoke-direct {v4, v0, v1}, Ldw0;-><init>(J)V

    .line 415
    .line 416
    .line 417
    new-instance v0, Ldw0;

    .line 418
    .line 419
    invoke-direct {v0, v2, v3}, Ldw0;-><init>(J)V

    .line 420
    .line 421
    .line 422
    move/from16 v1, v33

    .line 423
    .line 424
    and-int/lit16 v2, v1, 0x380

    .line 425
    .line 426
    const/16 v3, 0x100

    .line 427
    .line 428
    if-ne v2, v3, :cond_c

    .line 429
    .line 430
    const/4 v10, 0x1

    .line 431
    goto :goto_9

    .line 432
    :cond_c
    const/4 v10, 0x0

    .line 433
    :goto_9
    and-int/lit8 v1, v1, 0xe

    .line 434
    .line 435
    const/4 v7, 0x4

    .line 436
    if-ne v1, v7, :cond_d

    .line 437
    .line 438
    const/4 v8, 0x1

    .line 439
    goto :goto_a

    .line 440
    :cond_d
    const/4 v8, 0x0

    .line 441
    :goto_a
    or-int/2addr v8, v10

    .line 442
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    sget-object v11, Lzz0;->a:Lbe;

    .line 447
    .line 448
    if-nez v8, :cond_f

    .line 449
    .line 450
    if-ne v10, v11, :cond_e

    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_e
    const/4 v13, 0x0

    .line 454
    move-object/from16 v8, p0

    .line 455
    .line 456
    move-object/from16 v12, p2

    .line 457
    .line 458
    goto :goto_c

    .line 459
    :cond_f
    :goto_b
    new-instance v10, Lfr2;

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    move-object/from16 v8, p0

    .line 463
    .line 464
    move-object/from16 v12, p2

    .line 465
    .line 466
    invoke-direct {v10, v12, v8, v13}, Lfr2;-><init>(Lgn2;Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;B)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v14, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    :goto_c
    move-object/from16 v21, v10

    .line 473
    .line 474
    check-cast v21, Ldn2;

    .line 475
    .line 476
    const/high16 v23, 0xc00000

    .line 477
    .line 478
    const v24, 0x76b6c

    .line 479
    .line 480
    .line 481
    move/from16 v16, v7

    .line 482
    .line 483
    const/4 v7, 0x0

    .line 484
    const/4 v8, 0x0

    .line 485
    const/4 v10, 0x0

    .line 486
    move-object/from16 v17, v11

    .line 487
    .line 488
    const/4 v11, 0x0

    .line 489
    const/4 v12, 0x1

    .line 490
    move/from16 v25, v13

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const/4 v14, 0x0

    .line 494
    move/from16 v34, v16

    .line 495
    .line 496
    const/16 v16, 0x0

    .line 497
    .line 498
    const/16 v18, 0x0

    .line 499
    .line 500
    const/16 v20, 0x0

    .line 501
    .line 502
    move-object/from16 v22, p4

    .line 503
    .line 504
    move-object/from16 v19, v0

    .line 505
    .line 506
    move-object/from16 v48, v17

    .line 507
    .line 508
    move-object/from16 v0, p0

    .line 509
    .line 510
    move-object/from16 v17, v4

    .line 511
    .line 512
    move-object/from16 v4, p2

    .line 513
    .line 514
    invoke-static/range {v5 .. v24}, Lkm4;->e(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldw0;Ldw0;Ldn2;Llp2;II)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v14, v22

    .line 518
    .line 519
    sget v5, Ly46;->geo_file_download_retry:I

    .line 520
    .line 521
    invoke-static {v5, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    iget-object v7, v7, Ldp;->g:Lir;

    .line 530
    .line 531
    iget-wide v7, v7, Lir;->e:J

    .line 532
    .line 533
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    iget-object v10, v10, Ldp;->g:Lir;

    .line 538
    .line 539
    iget-wide v10, v10, Lir;->i:J

    .line 540
    .line 541
    new-instance v12, Ldw0;

    .line 542
    .line 543
    invoke-direct {v12, v7, v8}, Ldw0;-><init>(J)V

    .line 544
    .line 545
    .line 546
    new-instance v7, Ldw0;

    .line 547
    .line 548
    invoke-direct {v7, v10, v11}, Ldw0;-><init>(J)V

    .line 549
    .line 550
    .line 551
    if-ne v2, v3, :cond_10

    .line 552
    .line 553
    const/4 v10, 0x1

    .line 554
    :goto_d
    const/4 v2, 0x4

    .line 555
    goto :goto_e

    .line 556
    :cond_10
    move/from16 v10, v25

    .line 557
    .line 558
    goto :goto_d

    .line 559
    :goto_e
    if-ne v1, v2, :cond_11

    .line 560
    .line 561
    const/16 v25, 0x1

    .line 562
    .line 563
    :cond_11
    or-int v1, v10, v25

    .line 564
    .line 565
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    if-nez v1, :cond_12

    .line 570
    .line 571
    move-object/from16 v1, v48

    .line 572
    .line 573
    if-ne v2, v1, :cond_13

    .line 574
    .line 575
    :cond_12
    new-instance v2, Lfr2;

    .line 576
    .line 577
    const/4 v1, 0x1

    .line 578
    invoke-direct {v2, v4, v0, v1}, Lfr2;-><init>(Lgn2;Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;B)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v14, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_13
    move-object/from16 v21, v2

    .line 585
    .line 586
    check-cast v21, Ldn2;

    .line 587
    .line 588
    const/high16 v23, 0xc00000

    .line 589
    .line 590
    const v24, 0x76b6c

    .line 591
    .line 592
    .line 593
    move-object/from16 v19, v7

    .line 594
    .line 595
    const/4 v7, 0x0

    .line 596
    const/4 v8, 0x0

    .line 597
    const/4 v10, 0x0

    .line 598
    const/4 v11, 0x0

    .line 599
    move-object/from16 v17, v12

    .line 600
    .line 601
    const/4 v12, 0x1

    .line 602
    const/4 v13, 0x0

    .line 603
    const/4 v14, 0x0

    .line 604
    const/16 v16, 0x0

    .line 605
    .line 606
    const/16 v18, 0x0

    .line 607
    .line 608
    const/16 v20, 0x0

    .line 609
    .line 610
    move-object/from16 v22, p4

    .line 611
    .line 612
    invoke-static/range {v5 .. v24}, Lkm4;->e(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldw0;Ldw0;Ldn2;Llp2;II)V

    .line 613
    .line 614
    .line 615
    move-object/from16 v14, v22

    .line 616
    .line 617
    const/4 v1, 0x1

    .line 618
    invoke-virtual {v14, v1}, Llp2;->p(Z)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v14, v1}, Llp2;->p(Z)V

    .line 622
    .line 623
    .line 624
    goto :goto_f

    .line 625
    :cond_14
    invoke-static {}, Lb61;->c()V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :cond_15
    move-object v0, v1

    .line 630
    move-object v4, v3

    .line 631
    invoke-virtual {v14}, Llp2;->Q()V

    .line 632
    .line 633
    .line 634
    :goto_f
    invoke-virtual {v14}, Llp2;->r()Lj86;

    .line 635
    .line 636
    .line 637
    move-result-object v7

    .line 638
    if-eqz v7, :cond_16

    .line 639
    .line 640
    new-instance v0, Li40;

    .line 641
    .line 642
    const/4 v6, 0x2

    .line 643
    move-object/from16 v1, p0

    .line 644
    .line 645
    move-object/from16 v2, p1

    .line 646
    .line 647
    move/from16 v5, p5

    .line 648
    .line 649
    move-object v3, v4

    .line 650
    move-object/from16 v4, p3

    .line 651
    .line 652
    invoke-direct/range {v0 .. v6}, Li40;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 653
    .line 654
    .line 655
    iput-object v0, v7, Lj86;->d:Lrn2;

    .line 656
    .line 657
    :cond_16
    return-void
.end method

.method public static final b(Lir2;Lkx4;Llp2;I)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    const v2, 0x6767b612

    .line 8
    .line 9
    .line 10
    invoke-virtual {v10, v2}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, p3, 0x6

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v10, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x2

    .line 26
    :goto_0
    or-int v2, p3, v2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move/from16 v2, p3

    .line 30
    .line 31
    :goto_1
    and-int/lit8 v3, p3, 0x30

    .line 32
    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    invoke-virtual {v10, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    const/16 v3, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v3, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v2, v3

    .line 47
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 48
    .line 49
    const/16 v4, 0x12

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    const/4 v6, 0x0

    .line 53
    if-eq v3, v4, :cond_4

    .line 54
    .line 55
    move v3, v5

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move v3, v6

    .line 58
    :goto_3
    and-int/2addr v2, v5

    .line 59
    invoke-virtual {v10, v2, v3}, Llp2;->N(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_7

    .line 64
    .line 65
    new-instance v2, Lft;

    .line 66
    .line 67
    new-instance v3, Lbt;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    const/high16 v4, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-direct {v2, v4, v3}, Lft;-><init>(FLbt;)V

    .line 75
    .line 76
    .line 77
    sget-object v3, Lpz2;->q0:Ln50;

    .line 78
    .line 79
    const/4 v4, 0x6

    .line 80
    invoke-static {v2, v3, v10, v4}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-wide v3, v10, Llp2;->T:J

    .line 85
    .line 86
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-virtual {v10}, Llp2;->l()Lkl5;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v10, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    sget-object v8, Luz0;->j:Lpz2;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10}, Llp2;->Z()V

    .line 104
    .line 105
    .line 106
    iget-boolean v8, v10, Llp2;->S:Z

    .line 107
    .line 108
    if-eqz v8, :cond_5

    .line 109
    .line 110
    invoke-virtual {v10}, Llp2;->k()V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    invoke-virtual {v10}, Llp2;->j0()V

    .line 115
    .line 116
    .line 117
    :goto_4
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 118
    .line 119
    invoke-static {v8, v10, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 123
    .line 124
    invoke-static {v2, v10, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 132
    .line 133
    invoke-static {v3, v10, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v10}, Lpn7;->l(Llp2;)V

    .line 137
    .line 138
    .line 139
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 140
    .line 141
    invoke-static {v2, v10, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 145
    .line 146
    iget-object v2, v0, Lir2;->e:Ljava/lang/String;

    .line 147
    .line 148
    sget-object v4, Les;->a:Lox1;

    .line 149
    .line 150
    invoke-virtual {v10, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    check-cast v7, Lds;

    .line 155
    .line 156
    iget-object v7, v7, Lds;->b:Lo88;

    .line 157
    .line 158
    sget-object v8, Lep;->z:Lox1;

    .line 159
    .line 160
    invoke-virtual {v10, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    check-cast v9, Ldp;

    .line 165
    .line 166
    iget-object v9, v9, Ldp;->c:Lxr;

    .line 167
    .line 168
    iget-wide v11, v9, Lxr;->a:J

    .line 169
    .line 170
    sget-object v21, Ldj2;->f0:Ldj2;

    .line 171
    .line 172
    const/16 v27, 0x0

    .line 173
    .line 174
    const v28, 0xfffffa

    .line 175
    .line 176
    .line 177
    const-wide/16 v19, 0x0

    .line 178
    .line 179
    const/16 v22, 0x0

    .line 180
    .line 181
    const-wide/16 v23, 0x0

    .line 182
    .line 183
    const-wide/16 v25, 0x0

    .line 184
    .line 185
    move-object/from16 v16, v7

    .line 186
    .line 187
    move-wide/from16 v17, v11

    .line 188
    .line 189
    invoke-static/range {v16 .. v28}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    const v12, 0x30030

    .line 194
    .line 195
    .line 196
    const/16 v13, 0x1d8

    .line 197
    .line 198
    move v9, v5

    .line 199
    const/4 v5, 0x0

    .line 200
    move v11, v6

    .line 201
    const/4 v6, 0x0

    .line 202
    move-object/from16 v16, v4

    .line 203
    .line 204
    move-object v4, v7

    .line 205
    const/4 v7, 0x1

    .line 206
    move-object/from16 v17, v8

    .line 207
    .line 208
    const/4 v8, 0x0

    .line 209
    move/from16 v18, v9

    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x0

    .line 213
    move v14, v11

    .line 214
    move-object/from16 v15, v16

    .line 215
    .line 216
    move-object/from16 v1, v17

    .line 217
    .line 218
    move-object/from16 v11, p2

    .line 219
    .line 220
    invoke-static/range {v2 .. v13}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 221
    .line 222
    .line 223
    move-object v10, v11

    .line 224
    new-instance v2, Lol;

    .line 225
    .line 226
    invoke-direct {v2}, Lol;-><init>()V

    .line 227
    .line 228
    .line 229
    sget v4, Ly46;->geo_file_download_item_profile:I

    .line 230
    .line 231
    invoke-static {v4, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v2, v4}, Lol;->b(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    const-string v13, ": "

    .line 239
    .line 240
    invoke-virtual {v2, v13}, Lol;->b(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    new-instance v16, Lqe7;

    .line 244
    .line 245
    const/16 v34, 0x0

    .line 246
    .line 247
    const v35, 0xfffb

    .line 248
    .line 249
    .line 250
    const-wide/16 v17, 0x0

    .line 251
    .line 252
    const/16 v23, 0x0

    .line 253
    .line 254
    const/16 v24, 0x0

    .line 255
    .line 256
    const/16 v25, 0x0

    .line 257
    .line 258
    const-wide/16 v26, 0x0

    .line 259
    .line 260
    const/16 v28, 0x0

    .line 261
    .line 262
    const/16 v29, 0x0

    .line 263
    .line 264
    const/16 v30, 0x0

    .line 265
    .line 266
    const-wide/16 v31, 0x0

    .line 267
    .line 268
    const/16 v33, 0x0

    .line 269
    .line 270
    invoke-direct/range {v16 .. v35}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v4, v16

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Lol;->d(Lqe7;)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    :try_start_0
    iget-object v5, v0, Lir2;->c:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v2, v5}, Lol;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v4}, Lol;->c(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Lol;->e()Lql;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v10, v15}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, Lds;

    .line 296
    .line 297
    iget-object v4, v4, Lds;->d:Lo88;

    .line 298
    .line 299
    invoke-virtual {v10, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    check-cast v5, Ldp;

    .line 304
    .line 305
    iget-object v5, v5, Ldp;->c:Lxr;

    .line 306
    .line 307
    iget-wide v5, v5, Lxr;->c:J

    .line 308
    .line 309
    const/16 v33, 0x0

    .line 310
    .line 311
    const v34, 0xfffffe

    .line 312
    .line 313
    .line 314
    const-wide/16 v25, 0x0

    .line 315
    .line 316
    const/16 v27, 0x0

    .line 317
    .line 318
    const/16 v28, 0x0

    .line 319
    .line 320
    const-wide/16 v29, 0x0

    .line 321
    .line 322
    const-wide/16 v31, 0x0

    .line 323
    .line 324
    move-object/from16 v22, v4

    .line 325
    .line 326
    move-wide/from16 v23, v5

    .line 327
    .line 328
    invoke-static/range {v22 .. v34}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    const v11, 0x30030

    .line 333
    .line 334
    .line 335
    const/16 v12, 0xd8

    .line 336
    .line 337
    const/4 v5, 0x0

    .line 338
    const/4 v6, 0x0

    .line 339
    const/4 v7, 0x1

    .line 340
    const/4 v8, 0x0

    .line 341
    const/4 v9, 0x0

    .line 342
    invoke-static/range {v2 .. v12}, Lzc1;->f(Lql;Lkx4;Lo88;IIIIZLlp2;II)V

    .line 343
    .line 344
    .line 345
    const v2, -0x2e0f5e15

    .line 346
    .line 347
    .line 348
    invoke-virtual {v10, v2}, Llp2;->W(I)V

    .line 349
    .line 350
    .line 351
    new-instance v2, Lol;

    .line 352
    .line 353
    invoke-direct {v2}, Lol;-><init>()V

    .line 354
    .line 355
    .line 356
    sget v4, Ly46;->geo_file_download_item_subscription:I

    .line 357
    .line 358
    invoke-static {v4, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-virtual {v2, v4}, Lol;->b(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v13}, Lol;->b(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    const v4, -0x2e0f4b7d

    .line 369
    .line 370
    .line 371
    invoke-virtual {v10, v4}, Llp2;->W(I)V

    .line 372
    .line 373
    .line 374
    new-instance v16, Lqe7;

    .line 375
    .line 376
    const/16 v34, 0x0

    .line 377
    .line 378
    const v35, 0xfffb

    .line 379
    .line 380
    .line 381
    const-wide/16 v17, 0x0

    .line 382
    .line 383
    const-wide/16 v19, 0x0

    .line 384
    .line 385
    const/16 v22, 0x0

    .line 386
    .line 387
    const/16 v23, 0x0

    .line 388
    .line 389
    const/16 v24, 0x0

    .line 390
    .line 391
    const/16 v25, 0x0

    .line 392
    .line 393
    const-wide/16 v26, 0x0

    .line 394
    .line 395
    const/16 v29, 0x0

    .line 396
    .line 397
    const/16 v30, 0x0

    .line 398
    .line 399
    invoke-direct/range {v16 .. v35}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    .line 400
    .line 401
    .line 402
    move-object/from16 v4, v16

    .line 403
    .line 404
    invoke-virtual {v2, v4}, Lol;->d(Lqe7;)I

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    :try_start_1
    iget-object v5, v0, Lir2;->d:Ljava/lang/String;

    .line 409
    .line 410
    if-nez v5, :cond_6

    .line 411
    .line 412
    const v5, 0x44d1fa2d

    .line 413
    .line 414
    .line 415
    invoke-virtual {v10, v5}, Llp2;->W(I)V

    .line 416
    .line 417
    .line 418
    sget v5, Ly46;->title_server_list:I

    .line 419
    .line 420
    invoke-static {v5, v10}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    :goto_5
    invoke-virtual {v10, v14}, Llp2;->p(Z)V

    .line 425
    .line 426
    .line 427
    goto :goto_6

    .line 428
    :catchall_0
    move-exception v0

    .line 429
    goto :goto_7

    .line 430
    :cond_6
    const v6, 0x44d1f28c

    .line 431
    .line 432
    .line 433
    invoke-virtual {v10, v6}, Llp2;->W(I)V

    .line 434
    .line 435
    .line 436
    goto :goto_5

    .line 437
    :goto_6
    invoke-virtual {v2, v5}, Lol;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4}, Lol;->c(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v10, v14}, Llp2;->p(Z)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Lol;->e()Lql;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-virtual {v10, v14}, Llp2;->p(Z)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v10, v15}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lds;

    .line 458
    .line 459
    iget-object v11, v4, Lds;->d:Lo88;

    .line 460
    .line 461
    invoke-virtual {v10, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    check-cast v1, Ldp;

    .line 466
    .line 467
    iget-object v1, v1, Ldp;->c:Lxr;

    .line 468
    .line 469
    iget-wide v12, v1, Lxr;->c:J

    .line 470
    .line 471
    const/16 v22, 0x0

    .line 472
    .line 473
    const v23, 0xfffffe

    .line 474
    .line 475
    .line 476
    const-wide/16 v14, 0x0

    .line 477
    .line 478
    const/16 v16, 0x0

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const-wide/16 v18, 0x0

    .line 483
    .line 484
    const-wide/16 v20, 0x0

    .line 485
    .line 486
    invoke-static/range {v11 .. v23}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    const v11, 0x30030

    .line 491
    .line 492
    .line 493
    const/16 v12, 0xd8

    .line 494
    .line 495
    const/4 v5, 0x0

    .line 496
    const/4 v6, 0x0

    .line 497
    const/4 v7, 0x1

    .line 498
    const/4 v8, 0x0

    .line 499
    const/4 v9, 0x0

    .line 500
    invoke-static/range {v2 .. v12}, Lzc1;->f(Lql;Lkx4;Lo88;IIIIZLlp2;II)V

    .line 501
    .line 502
    .line 503
    const/4 v9, 0x1

    .line 504
    invoke-virtual {v10, v9}, Llp2;->p(Z)V

    .line 505
    .line 506
    .line 507
    goto :goto_8

    .line 508
    :goto_7
    invoke-virtual {v2, v4}, Lol;->c(I)V

    .line 509
    .line 510
    .line 511
    throw v0

    .line 512
    :catchall_1
    move-exception v0

    .line 513
    invoke-virtual {v2, v4}, Lol;->c(I)V

    .line 514
    .line 515
    .line 516
    throw v0

    .line 517
    :cond_7
    invoke-virtual {v10}, Llp2;->Q()V

    .line 518
    .line 519
    .line 520
    :goto_8
    invoke-virtual {v10}, Llp2;->r()Lj86;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    if-eqz v1, :cond_8

    .line 525
    .line 526
    new-instance v2, Lsl;

    .line 527
    .line 528
    move-object/from16 v3, p1

    .line 529
    .line 530
    move/from16 v14, p3

    .line 531
    .line 532
    const/4 v4, 0x4

    .line 533
    invoke-direct {v2, v4, v14, v0, v3}, Lsl;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    iput-object v2, v1, Lj86;->d:Lrn2;

    .line 537
    .line 538
    :cond_8
    return-void
.end method

.method public static final c(Lir2;Lgn2;Lkx4;Llp2;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    iget-object v0, v1, Lir2;->b:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v2, -0xfda029b

    .line 11
    .line 12
    .line 13
    invoke-virtual {v6, v2}, Llp2;->X(I)Llp2;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v6, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    :goto_0
    or-int v2, p4, v2

    .line 26
    .line 27
    move-object/from16 v4, p1

    .line 28
    .line 29
    invoke-virtual {v6, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v2, v3

    .line 41
    move-object/from16 v8, p2

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Llp2;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    const/16 v3, 0x100

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v3, 0x80

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v3

    .line 55
    and-int/lit16 v3, v2, 0x93

    .line 56
    .line 57
    const/16 v5, 0x92

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    if-eq v3, v5, :cond_3

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v3, v10

    .line 65
    :goto_3
    and-int/lit8 v5, v2, 0x1

    .line 66
    .line 67
    invoke-virtual {v6, v5, v3}, Llp2;->N(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_9

    .line 72
    .line 73
    invoke-static {v8}, Lg33;->e(Lkx4;)Lkx4;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sget-object v5, Lht;->c:Ldt;

    .line 78
    .line 79
    sget-object v7, Lpz2;->q0:Ln50;

    .line 80
    .line 81
    invoke-static {v5, v7, v6, v10}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-wide v11, v6, Llp2;->T:J

    .line 86
    .line 87
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-static {v6, v3}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    sget-object v12, Luz0;->j:Lpz2;

    .line 100
    .line 101
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Llp2;->Z()V

    .line 105
    .line 106
    .line 107
    iget-boolean v12, v6, Llp2;->S:Z

    .line 108
    .line 109
    if-eqz v12, :cond_4

    .line 110
    .line 111
    invoke-virtual {v6}, Llp2;->k()V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    invoke-virtual {v6}, Llp2;->j0()V

    .line 116
    .line 117
    .line 118
    :goto_4
    sget-object v12, Lpz2;->B0:Ldx0;

    .line 119
    .line 120
    invoke-static {v12, v6, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object v5, Lpz2;->A0:Ldx0;

    .line 124
    .line 125
    invoke-static {v5, v6, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    sget-object v11, Lpz2;->C0:Ldx0;

    .line 133
    .line 134
    invoke-static {v11, v6, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v6}, Lpn7;->l(Llp2;)V

    .line 138
    .line 139
    .line 140
    sget-object v7, Lpz2;->z0:Ldx0;

    .line 141
    .line 142
    invoke-static {v7, v6, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v13, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 146
    .line 147
    sget-object v3, Lpz2;->o0:Lo50;

    .line 148
    .line 149
    new-instance v14, Lft;

    .line 150
    .line 151
    new-instance v15, Lbt;

    .line 152
    .line 153
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    const/high16 v10, 0x41000000    # 8.0f

    .line 157
    .line 158
    invoke-direct {v14, v10, v15}, Lft;-><init>(FLbt;)V

    .line 159
    .line 160
    .line 161
    const/16 v10, 0x36

    .line 162
    .line 163
    invoke-static {v14, v3, v6, v10}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iget-wide v14, v6, Llp2;->T:J

    .line 168
    .line 169
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    invoke-static {v6, v13}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    invoke-virtual {v6}, Llp2;->Z()V

    .line 182
    .line 183
    .line 184
    iget-boolean v9, v6, Llp2;->S:Z

    .line 185
    .line 186
    if-eqz v9, :cond_5

    .line 187
    .line 188
    invoke-virtual {v6}, Llp2;->k()V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_5
    invoke-virtual {v6}, Llp2;->j0()V

    .line 193
    .line 194
    .line 195
    :goto_5
    invoke-static {v12, v6, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v5, v6, v14}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v10, v6, v11, v6}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v7, v6, v15}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    const/high16 v3, 0x41c00000    # 24.0f

    .line 208
    .line 209
    sget-object v5, Lhx4;->X:Lhx4;

    .line 210
    .line 211
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    const/16 v5, 0x30

    .line 216
    .line 217
    invoke-static {v0, v3, v6, v5}, Lgr2;->e(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;Lkx4;Llp2;I)V

    .line 218
    .line 219
    .line 220
    new-instance v3, Ld44;

    .line 221
    .line 222
    const/high16 v7, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v9, 0x1

    .line 225
    invoke-direct {v3, v7, v9}, Ld44;-><init>(FZ)V

    .line 226
    .line 227
    .line 228
    and-int/lit8 v7, v2, 0xe

    .line 229
    .line 230
    invoke-static {v1, v3, v6, v7}, Lgr2;->b(Lir2;Lkx4;Llp2;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v9}, Llp2;->p(Z)V

    .line 234
    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    const/16 v18, 0xd

    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    const/high16 v15, 0x41800000    # 16.0f

    .line 242
    .line 243
    const/16 v16, 0x0

    .line 244
    .line 245
    invoke-static/range {v13 .. v18}, Los4;->A(Lkx4;FFFFI)Lkx4;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    instance-of v7, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;

    .line 250
    .line 251
    if-eqz v7, :cond_6

    .line 252
    .line 253
    const v5, 0x36f7d144

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v5}, Llp2;->W(I)V

    .line 257
    .line 258
    .line 259
    move v5, v2

    .line 260
    iget-object v2, v1, Lir2;->a:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 261
    .line 262
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;

    .line 263
    .line 264
    shl-int/lit8 v5, v5, 0x3

    .line 265
    .line 266
    and-int/lit16 v5, v5, 0x380

    .line 267
    .line 268
    or-int/lit16 v7, v5, 0xc00

    .line 269
    .line 270
    move-object v5, v3

    .line 271
    move-object v3, v0

    .line 272
    invoke-static/range {v2 .. v7}, Lgr2;->a(Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;Lgn2;Lkx4;Llp2;I)V

    .line 273
    .line 274
    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-virtual {v6, v2}, Llp2;->p(Z)V

    .line 277
    .line 278
    .line 279
    :goto_6
    const/4 v9, 0x1

    .line 280
    goto :goto_7

    .line 281
    :cond_6
    const/4 v2, 0x0

    .line 282
    instance-of v4, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;

    .line 283
    .line 284
    if-eqz v4, :cond_7

    .line 285
    .line 286
    const v4, 0x36f7f186

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, v4}, Llp2;->W(I)V

    .line 290
    .line 291
    .line 292
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;

    .line 293
    .line 294
    invoke-static {v0, v3, v6, v5}, Lgr2;->d(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;Lkx4;Llp2;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, v2}, Llp2;->p(Z)V

    .line 298
    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_7
    instance-of v0, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;

    .line 302
    .line 303
    if-eqz v0, :cond_8

    .line 304
    .line 305
    const v0, 0x36f805f8

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v0}, Llp2;->W(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v2}, Llp2;->p(Z)V

    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :goto_7
    invoke-virtual {v6, v9}, Llp2;->p(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_8
    const v0, 0x36f7c5d4

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6, v0}, Llp2;->W(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v6, v2}, Llp2;->p(Z)V

    .line 326
    .line 327
    .line 328
    invoke-static {}, Lb61;->c()V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_9
    invoke-virtual {v6}, Llp2;->Q()V

    .line 333
    .line 334
    .line 335
    :goto_8
    invoke-virtual {v6}, Llp2;->r()Lj86;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    if-eqz v6, :cond_a

    .line 340
    .line 341
    new-instance v0, Lfh;

    .line 342
    .line 343
    const/4 v5, 0x2

    .line 344
    move-object/from16 v2, p1

    .line 345
    .line 346
    move/from16 v4, p4

    .line 347
    .line 348
    move-object v3, v8

    .line 349
    invoke-direct/range {v0 .. v5}, Lfh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkx4;IB)V

    .line 350
    .line 351
    .line 352
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 353
    .line 354
    :cond_a
    return-void
.end method

.method public static final d(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;Lkx4;Llp2;I)V
    .locals 13

    .line 1
    move/from16 v8, p3

    .line 2
    .line 3
    const v0, -0x5fb1ecc2

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x4

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v0, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x2

    .line 19
    :goto_0
    or-int/2addr v0, v8

    .line 20
    and-int/lit8 v2, v0, 0x13

    .line 21
    .line 22
    const/16 v3, 0x12

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v9, 0x1

    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    move v2, v9

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v4

    .line 31
    :goto_1
    and-int/lit8 v3, v0, 0x1

    .line 32
    .line 33
    invoke-virtual {p2, v3, v2}, Llp2;->N(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_c

    .line 38
    .line 39
    and-int/lit8 v0, v0, 0xe

    .line 40
    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    move v0, v9

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v0, v4

    .line 46
    :goto_2
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v3, Lzz0;->a:Lbe;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    if-ne v2, v3, :cond_5

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    instance-of v0, p0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    move-object v0, p0

    .line 65
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 66
    .line 67
    move-object v2, v0

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move-object v2, v5

    .line 70
    :goto_3
    invoke-virtual {p2, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 74
    .line 75
    new-instance v0, Lft;

    .line 76
    .line 77
    new-instance v7, Lbt;

    .line 78
    .line 79
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    const/high16 v10, 0x41000000    # 8.0f

    .line 83
    .line 84
    invoke-direct {v0, v10, v7}, Lft;-><init>(FLbt;)V

    .line 85
    .line 86
    .line 87
    sget-object v7, Lpz2;->q0:Ln50;

    .line 88
    .line 89
    const/4 v10, 0x6

    .line 90
    invoke-static {v0, v7, p2, v10}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-wide v10, p2, Llp2;->T:J

    .line 95
    .line 96
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-virtual {p2}, Llp2;->l()Lkl5;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-static {p2, p1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    sget-object v12, Luz0;->j:Lpz2;

    .line 109
    .line 110
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Llp2;->Z()V

    .line 114
    .line 115
    .line 116
    iget-boolean v12, p2, Llp2;->S:Z

    .line 117
    .line 118
    if-eqz v12, :cond_6

    .line 119
    .line 120
    invoke-virtual {p2}, Llp2;->k()V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-virtual {p2}, Llp2;->j0()V

    .line 125
    .line 126
    .line 127
    :goto_4
    sget-object v12, Lpz2;->B0:Ldx0;

    .line 128
    .line 129
    invoke-static {v12, p2, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 133
    .line 134
    invoke-static {v0, p2, v10}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sget-object v7, Lpz2;->C0:Ldx0;

    .line 142
    .line 143
    invoke-static {v7, p2, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p2}, Lpn7;->l(Llp2;)V

    .line 147
    .line 148
    .line 149
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 150
    .line 151
    invoke-static {v0, p2, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 155
    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->d()Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    goto :goto_5

    .line 163
    :cond_7
    move-object v7, v5

    .line 164
    :goto_5
    if-nez v7, :cond_8

    .line 165
    .line 166
    const v3, -0x2e542fdc

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, v3}, Llp2;->W(I)V

    .line 170
    .line 171
    .line 172
    :goto_6
    invoke-virtual {p2, v4}, Llp2;->p(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_8
    const v5, -0x2e542fdb

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v5}, Llp2;->W(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    invoke-virtual {p2, v5}, Llp2;->d(I)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    if-nez v7, :cond_9

    .line 195
    .line 196
    if-ne v10, v3, :cond_a

    .line 197
    .line 198
    :cond_9
    new-instance v10, Lth2;

    .line 199
    .line 200
    invoke-direct {v10, v9, v5}, Lth2;-><init>(BI)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_a
    move-object v5, v10

    .line 207
    check-cast v5, Ldn2;

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :goto_7
    sget-object v3, Lep;->z:Lox1;

    .line 211
    .line 212
    invoke-virtual {p2, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    check-cast v3, Ldp;

    .line 217
    .line 218
    iget-object v3, v3, Ldp;->l:Lqr;

    .line 219
    .line 220
    iget-wide v10, v3, Lqr;->b:J

    .line 221
    .line 222
    invoke-static {v0, v5, v10, v11, p2}, Lhi5;->K(Lkx4;Ldn2;JLlp2;)V

    .line 223
    .line 224
    .line 225
    if-eqz v2, :cond_b

    .line 226
    .line 227
    move v4, v9

    .line 228
    :cond_b
    new-instance v3, Lm30;

    .line 229
    .line 230
    invoke-direct {v3, v2, v1}, Lm30;-><init>(Ljava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    const v1, -0xf91550

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v3, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    const v7, 0x180186

    .line 241
    .line 242
    .line 243
    const/4 v2, 0x0

    .line 244
    const/4 v3, 0x0

    .line 245
    move-object v1, v0

    .line 246
    move v0, v4

    .line 247
    const/4 v4, 0x0

    .line 248
    move-object v6, p2

    .line 249
    invoke-static/range {v0 .. v7}, Lzc1;->d(ZLkx4;Lg22;Lh62;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, v9}, Llp2;->p(Z)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_c
    invoke-virtual {p2}, Llp2;->Q()V

    .line 257
    .line 258
    .line 259
    :goto_8
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-eqz v0, :cond_d

    .line 264
    .line 265
    new-instance v1, Li9;

    .line 266
    .line 267
    const/16 v2, 0xb

    .line 268
    .line 269
    invoke-direct {v1, v2, v8, p0, p1}, Li9;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 273
    .line 274
    :cond_d
    return-void
.end method

.method public static final e(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;Lkx4;Llp2;I)V
    .locals 10

    .line 1
    const v1, -0x70c3125c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v1}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    :goto_0
    or-int/2addr v1, p3

    .line 17
    and-int/lit8 v2, v1, 0x13

    .line 18
    .line 19
    const/16 v3, 0x12

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v9, 0x0

    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    move v2, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v2, v9

    .line 28
    :goto_1
    and-int/2addr v1, v4

    .line 29
    invoke-virtual {p2, v1, v2}, Llp2;->N(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_5

    .line 34
    .line 35
    instance-of v1, p0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const v1, -0x4c47d984

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v1}, Llp2;->W(I)V

    .line 43
    .line 44
    .line 45
    sget v1, Lq36;->ic_error:I

    .line 46
    .line 47
    invoke-static {v1, p2}, Lu28;->p(ILlp2;)Lg73;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget v2, Ly46;->toast_failure:I

    .line 52
    .line 53
    invoke-static {v2, p2}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/16 v7, 0x30

    .line 58
    .line 59
    const/16 v8, 0x8

    .line 60
    .line 61
    const-wide/16 v4, 0x0

    .line 62
    .line 63
    move-object v2, p1

    .line 64
    move-object v6, p2

    .line 65
    invoke-static/range {v1 .. v8}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v9}, Llp2;->p(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    instance-of v1, p0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    const v1, -0x4c47bd82

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, Llp2;->W(I)V

    .line 80
    .line 81
    .line 82
    sget v1, Lq36;->ic_success:I

    .line 83
    .line 84
    invoke-static {v1, p2}, Lu28;->p(ILlp2;)Lg73;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget v2, Ly46;->toast_success:I

    .line 89
    .line 90
    invoke-static {v2, p2}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const/16 v7, 0x30

    .line 95
    .line 96
    const/16 v8, 0x8

    .line 97
    .line 98
    const-wide/16 v4, 0x0

    .line 99
    .line 100
    move-object v2, p1

    .line 101
    move-object v6, p2

    .line 102
    invoke-static/range {v1 .. v8}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v9}, Llp2;->p(Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    instance-of v1, p0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;

    .line 110
    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    const v1, -0x4c47a1d0

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v1}, Llp2;->W(I)V

    .line 117
    .line 118
    .line 119
    const/4 v1, 0x6

    .line 120
    invoke-static {p1, p2, v1}, Lmb6;->c(Lkx4;Llp2;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v9}, Llp2;->p(Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    const v0, -0x4c47de79

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v0}, Llp2;->W(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v9}, Llp2;->p(Z)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lb61;->c()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-virtual {p2}, Llp2;->Q()V

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    new-instance v3, Li9;

    .line 150
    .line 151
    const/16 v4, 0xa

    .line 152
    .line 153
    invoke-direct {v3, v4, p3, p0, p1}, Li9;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iput-object v3, v1, Lj86;->d:Lrn2;

    .line 157
    .line 158
    :cond_6
    return-void
.end method

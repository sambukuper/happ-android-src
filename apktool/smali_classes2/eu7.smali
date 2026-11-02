.class public abstract Leu7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lfu7;Lgn2;Lkx4;Llp2;I)V
    .locals 43

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
    move-object/from16 v13, p3

    .line 8
    .line 9
    move/from16 v0, p4

    .line 10
    .line 11
    const v4, -0x6dcf6f6f    # -5.5714E-28f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v13, v4}, Llp2;->X(I)Llp2;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v0, 0x6

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v13, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    const/4 v4, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v4, v5

    .line 31
    :goto_0
    or-int/2addr v4, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v0

    .line 34
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-virtual {v13, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    const/16 v6, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v4, v6

    .line 50
    :cond_3
    and-int/lit16 v6, v0, 0x180

    .line 51
    .line 52
    if-nez v6, :cond_5

    .line 53
    .line 54
    invoke-virtual {v13, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_4

    .line 59
    .line 60
    const/16 v6, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v6, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v4, v6

    .line 66
    :cond_5
    and-int/lit16 v6, v4, 0x93

    .line 67
    .line 68
    const/16 v7, 0x92

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    if-eq v6, v7, :cond_6

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    move v6, v8

    .line 76
    :goto_4
    and-int/lit8 v7, v4, 0x1

    .line 77
    .line 78
    invoke-virtual {v13, v7, v6}, Llp2;->N(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_8

    .line 83
    .line 84
    sget-object v6, Lpc;->b:Lox1;

    .line 85
    .line 86
    invoke-virtual {v13, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Landroid/content/Context;

    .line 91
    .line 92
    const/high16 v10, 0x43a00000    # 320.0f

    .line 93
    .line 94
    invoke-static {v10, v13}, Los4;->S(FLlp2;)F

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    float-to-int v10, v10

    .line 99
    sget-object v11, Lht;->c:Ldt;

    .line 100
    .line 101
    sget-object v12, Lpz2;->q0:Ln50;

    .line 102
    .line 103
    invoke-static {v11, v12, v13, v8}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget-wide v11, v13, Llp2;->T:J

    .line 108
    .line 109
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    invoke-virtual {v13}, Llp2;->l()Lkl5;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-static {v13, v3}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    sget-object v15, Luz0;->j:Lpz2;

    .line 122
    .line 123
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v13}, Llp2;->Z()V

    .line 127
    .line 128
    .line 129
    iget-boolean v15, v13, Llp2;->S:Z

    .line 130
    .line 131
    if-eqz v15, :cond_7

    .line 132
    .line 133
    invoke-virtual {v13}, Llp2;->k()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    invoke-virtual {v13}, Llp2;->j0()V

    .line 138
    .line 139
    .line 140
    :goto_5
    sget-object v15, Lpz2;->B0:Ldx0;

    .line 141
    .line 142
    invoke-static {v15, v13, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v8, Lpz2;->A0:Ldx0;

    .line 146
    .line 147
    invoke-static {v8, v13, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    sget-object v11, Lpz2;->C0:Ldx0;

    .line 155
    .line 156
    invoke-static {v11, v13, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v13}, Lpn7;->l(Llp2;)V

    .line 160
    .line 161
    .line 162
    sget-object v8, Lpz2;->z0:Ldx0;

    .line 163
    .line 164
    invoke-static {v8, v13, v14}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 168
    .line 169
    invoke-static {v8}, Lch3;->u(Lkx4;)Lkx4;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    const/high16 v12, 0x41800000    # 16.0f

    .line 174
    .line 175
    const/4 v14, 0x0

    .line 176
    move v15, v5

    .line 177
    invoke-static {v8, v12, v14, v15}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    move-object/from16 v16, v7

    .line 182
    .line 183
    sget-object v7, Lhx4;->X:Lhx4;

    .line 184
    .line 185
    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    and-int/lit8 v12, v4, 0xe

    .line 190
    .line 191
    or-int/lit16 v12, v12, 0x180

    .line 192
    .line 193
    and-int/lit8 v4, v4, 0x70

    .line 194
    .line 195
    or-int/2addr v4, v12

    .line 196
    invoke-static {v1, v2, v11, v13, v4}, Lbs7;->a(Lfu7;Lgn2;Lkx4;Llp2;I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v13, v9}, Lch3;->f(Llp2;Lkx4;)V

    .line 200
    .line 201
    .line 202
    sget v4, Ly46;->sub_properties_migration_info_title:I

    .line 203
    .line 204
    invoke-static {v4, v13}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    sget-object v9, Les;->a:Lox1;

    .line 209
    .line 210
    invoke-virtual {v13, v9}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    check-cast v11, Lds;

    .line 215
    .line 216
    iget-object v11, v11, Lds;->a:Lcs;

    .line 217
    .line 218
    iget-object v11, v11, Lcs;->c:Lo88;

    .line 219
    .line 220
    sget-object v12, Lep;->z:Lox1;

    .line 221
    .line 222
    invoke-virtual {v13, v12}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v17

    .line 226
    move-object/from16 v14, v17

    .line 227
    .line 228
    check-cast v14, Ldp;

    .line 229
    .line 230
    iget-object v14, v14, Ldp;->c:Lxr;

    .line 231
    .line 232
    iget-wide v0, v14, Lxr;->c:J

    .line 233
    .line 234
    sget-object v22, Ldj2;->i0:Ldj2;

    .line 235
    .line 236
    const/16 v28, 0x0

    .line 237
    .line 238
    const v29, 0xfffffa

    .line 239
    .line 240
    .line 241
    const-wide/16 v20, 0x0

    .line 242
    .line 243
    const/16 v23, 0x0

    .line 244
    .line 245
    const-wide/16 v24, 0x0

    .line 246
    .line 247
    const-wide/16 v26, 0x0

    .line 248
    .line 249
    move-wide/from16 v18, v0

    .line 250
    .line 251
    move-object/from16 v17, v11

    .line 252
    .line 253
    invoke-static/range {v17 .. v29}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const/16 v14, 0x30

    .line 258
    .line 259
    move v1, v15

    .line 260
    const/16 v15, 0x1f0

    .line 261
    .line 262
    move-object v11, v7

    .line 263
    const/4 v7, 0x3

    .line 264
    move-object/from16 v17, v8

    .line 265
    .line 266
    const/4 v8, 0x0

    .line 267
    move-object/from16 v18, v9

    .line 268
    .line 269
    const/4 v9, 0x0

    .line 270
    move/from16 v19, v10

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    move-object/from16 v20, v11

    .line 274
    .line 275
    const/4 v11, 0x0

    .line 276
    move-object/from16 v21, v12

    .line 277
    .line 278
    const/4 v12, 0x0

    .line 279
    move-object/from16 v1, v16

    .line 280
    .line 281
    move-object/from16 v3, v18

    .line 282
    .line 283
    move-object/from16 v2, v20

    .line 284
    .line 285
    move-object/from16 v16, v6

    .line 286
    .line 287
    move-object v6, v0

    .line 288
    move-object/from16 v0, v21

    .line 289
    .line 290
    invoke-static/range {v4 .. v15}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 291
    .line 292
    .line 293
    const/high16 v4, 0x41400000    # 12.0f

    .line 294
    .line 295
    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-static {v13, v4}, Lch3;->f(Llp2;Lkx4;)V

    .line 300
    .line 301
    .line 302
    sget v4, Ly46;->sub_properties_migration_info_description:I

    .line 303
    .line 304
    invoke-static {v4, v13}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {v13, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    check-cast v3, Lds;

    .line 313
    .line 314
    iget-object v3, v3, Lds;->b:Lo88;

    .line 315
    .line 316
    invoke-virtual {v13, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    check-cast v0, Ldp;

    .line 321
    .line 322
    iget-object v0, v0, Ldp;->c:Lxr;

    .line 323
    .line 324
    iget-wide v6, v0, Lxr;->c:J

    .line 325
    .line 326
    const/16 v41, 0x0

    .line 327
    .line 328
    const v42, 0xfffffe

    .line 329
    .line 330
    .line 331
    const-wide/16 v33, 0x0

    .line 332
    .line 333
    const/16 v35, 0x0

    .line 334
    .line 335
    const/16 v36, 0x0

    .line 336
    .line 337
    const-wide/16 v37, 0x0

    .line 338
    .line 339
    const-wide/16 v39, 0x0

    .line 340
    .line 341
    move-object/from16 v30, v3

    .line 342
    .line 343
    move-wide/from16 v31, v6

    .line 344
    .line 345
    invoke-static/range {v30 .. v42}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    const/4 v7, 0x3

    .line 350
    invoke-static/range {v4 .. v15}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x42000000    # 32.0f

    .line 354
    .line 355
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v13, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 360
    .line 361
    .line 362
    sget v0, Ly46;->sub_properties_migration_info_title:I

    .line 363
    .line 364
    invoke-static {v0, v13}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    new-instance v0, Ls63;

    .line 369
    .line 370
    invoke-direct {v0, v1}, Ls63;-><init>(Landroid/content/Context;)V

    .line 371
    .line 372
    .line 373
    sget-object v1, Lpw6;->Y:Lpw6;

    .line 374
    .line 375
    iput-object v1, v0, Ls63;->j:Lpw6;

    .line 376
    .line 377
    new-instance v1, Lta7;

    .line 378
    .line 379
    invoke-static/range {v19 .. v19}, Lwo1;->a(I)V

    .line 380
    .line 381
    .line 382
    new-instance v2, Lwo1;

    .line 383
    .line 384
    move/from16 v3, v19

    .line 385
    .line 386
    invoke-direct {v2, v3}, Lwo1;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-static {v3}, Lwo1;->a(I)V

    .line 390
    .line 391
    .line 392
    new-instance v4, Lwo1;

    .line 393
    .line 394
    invoke-direct {v4, v3}, Lwo1;-><init>(I)V

    .line 395
    .line 396
    .line 397
    invoke-direct {v1, v2, v4}, Lta7;-><init>(Lyo1;Lyo1;)V

    .line 398
    .line 399
    .line 400
    new-instance v2, Lc86;

    .line 401
    .line 402
    invoke-direct {v2, v1}, Lc86;-><init>(Lta7;)V

    .line 403
    .line 404
    .line 405
    iput-object v2, v0, Ls63;->i:Lab7;

    .line 406
    .line 407
    sget v1, Lw46;->sub_settings_migration:I

    .line 408
    .line 409
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    iput-object v1, v0, Ls63;->c:Ljava/lang/Object;

    .line 414
    .line 415
    invoke-virtual {v0}, Ls63;->a()Lv63;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    move-object/from16 v1, v17

    .line 420
    .line 421
    const/4 v2, 0x0

    .line 422
    const/high16 v3, 0x41800000    # 16.0f

    .line 423
    .line 424
    const/4 v15, 0x2

    .line 425
    invoke-static {v1, v3, v2, v15}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    sget-object v8, Lpz2;->i0:Lp50;

    .line 430
    .line 431
    move-object/from16 v1, v16

    .line 432
    .line 433
    invoke-virtual {v13, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    check-cast v1, Landroid/content/Context;

    .line 438
    .line 439
    invoke-static {v1}, Lpa7;->a(Landroid/content/Context;)Lv76;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    new-instance v4, Lfv;

    .line 444
    .line 445
    sget-object v2, Lzc4;->a:Lox1;

    .line 446
    .line 447
    invoke-virtual {v13, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    check-cast v2, Lxu;

    .line 452
    .line 453
    invoke-direct {v4, v2, v0, v1}, Lfv;-><init>(Lxu;Lv63;Lv76;)V

    .line 454
    .line 455
    .line 456
    const/16 v11, 0x180

    .line 457
    .line 458
    const/4 v12, 0x0

    .line 459
    sget-object v7, Lcoil3/compose/AsyncImagePainter;->v0:Ly2;

    .line 460
    .line 461
    sget-object v9, Ly41;->a:Lbe;

    .line 462
    .line 463
    move-object v10, v13

    .line 464
    invoke-static/range {v4 .. v12}, Lkm4;->a(Lfv;Ljava/lang/String;Lkx4;Lgn2;Lq8;Lz41;Llp2;II)V

    .line 465
    .line 466
    .line 467
    const/4 v0, 0x1

    .line 468
    invoke-virtual {v13, v0}, Llp2;->p(Z)V

    .line 469
    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_8
    invoke-virtual {v13}, Llp2;->Q()V

    .line 473
    .line 474
    .line 475
    :goto_6
    invoke-virtual {v13}, Llp2;->r()Lj86;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    if-eqz v6, :cond_9

    .line 480
    .line 481
    new-instance v0, Las7;

    .line 482
    .line 483
    const/4 v5, 0x1

    .line 484
    move-object/from16 v1, p0

    .line 485
    .line 486
    move-object/from16 v2, p1

    .line 487
    .line 488
    move-object/from16 v3, p2

    .line 489
    .line 490
    move/from16 v4, p4

    .line 491
    .line 492
    invoke-direct/range {v0 .. v5}, Las7;-><init>(Lfu7;Lgn2;Lkx4;IB)V

    .line 493
    .line 494
    .line 495
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 496
    .line 497
    :cond_9
    return-void
.end method

.method public static final b(Lmu7;Lkx4;Llp2;I)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x583fd32d

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 8
    .line 9
    .line 10
    sget-object v0, Ly01;->n:Lox1;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v8, v0

    .line 17
    check-cast v8, Lz24;

    .line 18
    .line 19
    iget-object v0, p0, Lmu7;->c:Lh76;

    .line 20
    .line 21
    invoke-static {v0, p2}, Li21;->o(Lmh7;Llp2;)Ly05;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    invoke-virtual {p2, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v11, Lzz0;->a:Lbe;

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-ne v1, v11, :cond_1

    .line 38
    .line 39
    :cond_0
    new-instance v0, Lal5;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/16 v7, 0x14

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    const-class v3, Lmu7;

    .line 46
    .line 47
    const-string v4, "onUiIntent"

    .line 48
    .line 49
    const-string v5, "onUiIntent(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsUiIntent;)V"

    .line 50
    .line 51
    move-object v2, p0

    .line 52
    invoke-direct/range {v0 .. v7}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v0

    .line 59
    :cond_1
    move-object v5, v1

    .line 60
    check-cast v5, Lpv3;

    .line 61
    .line 62
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-ne v0, v11, :cond_2

    .line 67
    .line 68
    new-instance v0, Loh2;

    .line 69
    .line 70
    invoke-direct {v0}, Loh2;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    move-object v3, v0

    .line 77
    check-cast v3, Loh2;

    .line 78
    .line 79
    new-instance v0, Loh4;

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-direct {v0, v3, v1}, Loh4;-><init>(Loh2;B)V

    .line 83
    .line 84
    .line 85
    const v1, -0x5e51802a

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, Lh64;

    .line 93
    .line 94
    const/16 v6, 0x8

    .line 95
    .line 96
    move-object v2, v8

    .line 97
    move-object v4, v10

    .line 98
    invoke-direct/range {v1 .. v6}, Lh64;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    const v2, -0x594ee313

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v1, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const v10, 0xc00036

    .line 109
    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const-wide/16 v5, 0x0

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    move-object v9, p2

    .line 118
    move-object v1, v0

    .line 119
    move-object v0, p1

    .line 120
    invoke-static/range {v0 .. v10}, Lsx2;->b(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Llp2;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    new-instance v1, Ld67;

    .line 130
    .line 131
    const/4 v2, 0x3

    .line 132
    move v4, p3

    .line 133
    invoke-direct {v1, v2, p3, p0, p1}, Ld67;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 137
    .line 138
    :cond_3
    return-void
.end method

.method public static final c(J)V
    .locals 2

    .line 1
    sget-object v0, Lv88;->b:[Lw88;

    .line 2
    .line 3
    const-wide v0, 0xff00000000L

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr p0, v0

    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long p0, p0, v0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const-string p0, "Cannot perform operation for Unspecified type."

    .line 21
    .line 22
    invoke-static {p0}, Lyc3;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public static final d(JJ)V
    .locals 6

    .line 1
    sget-object v0, Lv88;->b:[Lw88;

    .line 2
    .line 3
    const-wide v0, 0xff00000000L

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long v2, p0, v0

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    and-long/2addr v0, p2

    .line 18
    cmp-long v0, v0, v4

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    :goto_0
    const-string v0, "Cannot perform operation for Unspecified type."

    .line 23
    .line 24
    invoke-static {v0}, Lyc3;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {p0, p1}, Lv88;->b(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {p2, p3}, Lv88;->b(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v0, v1, v2, v3}, Lw88;->a(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-static {p0, p1}, Lv88;->b(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p0

    .line 45
    invoke-static {p0, p1}, Lw88;->b(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p2, p3}, Lv88;->b(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    invoke-static {p1, p2}, Lw88;->b(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string p3, "Cannot perform operation for "

    .line 60
    .line 61
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p0, " and "

    .line 68
    .line 69
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Lyc3;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void
.end method

.method public static final e(Lpw3;Lpw3;Z)Lu1;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-boolean v0, Lq08;->a:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Lkk1;

    .line 13
    .line 14
    iget-object p0, p0, Lkk1;->Y:Lt14;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p0, Laa7;

    .line 20
    .line 21
    check-cast p1, Lkk1;

    .line 22
    .line 23
    iget-object p1, p1, Lkk1;->Y:Lt14;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p1, Laa7;

    .line 29
    .line 30
    new-instance v0, Lkk1;

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    new-instance p2, Lr66;

    .line 35
    .line 36
    invoke-direct {p2, p0, p1}, Lce2;-><init>(Laa7;Laa7;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Lv14;->a:Lq45;

    .line 40
    .line 41
    invoke-virtual {v2, p0, p1}, Lq45;->b(Lt14;Lt14;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {p0, p1}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    :goto_0
    const/4 p0, 0x0

    .line 50
    invoke-direct {v0, p2, v1, p0}, Lkk1;-><init>(Lt14;Ldn2;Z)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_1
    check-cast p0, Lu1;

    .line 55
    .line 56
    check-cast p1, Lu1;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lu1;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_2
    new-instance v0, Lae2;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1, p2, v1}, Lae2;-><init>(Lu1;Lu1;ZLdn2;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public static final f(D)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    double-to-float p0, p0

    .line 7
    invoke-static {p0, v0, v1}, Leu7;->i(FJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static final g(I)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-float p0, p0

    .line 7
    invoke-static {p0, v0, v1}, Leu7;->i(FJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static final i(FJ)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr v0, v2

    .line 12
    or-long p0, p1, v0

    .line 13
    .line 14
    sget-object p2, Lv88;->b:[Lw88;

    .line 15
    .line 16
    return-wide p0
.end method


# virtual methods
.method public abstract h()Z
.end method

.method public j(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract k(Z)V
.end method

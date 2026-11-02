.class public final synthetic Lzv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, Lzv2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzv2;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lzv2;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lzv2;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lzv2;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lzv2;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lzv2;->X:B

    .line 4
    .line 5
    sget-object v2, Lzz0;->a:Lbe;

    .line 6
    .line 7
    sget-object v3, Lhx4;->X:Lhx4;

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    sget-object v8, Ldn8;->a:Ldn8;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    iget-object v10, v0, Lzv2;->h0:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v11, v0, Lzv2;->g0:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v12, v0, Lzv2;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v13, v0, Lzv2;->Z:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, v0, Lzv2;->Y:Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v14, 0x1

    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v0, Lz24;

    .line 33
    .line 34
    check-cast v13, Loh2;

    .line 35
    .line 36
    check-cast v12, Lyt7;

    .line 37
    .line 38
    check-cast v11, Llh7;

    .line 39
    .line 40
    check-cast v10, Lpv3;

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Lgg5;

    .line 45
    .line 46
    move-object/from16 v15, p2

    .line 47
    .line 48
    check-cast v15, Llp2;

    .line 49
    .line 50
    move-object/from16 v16, p3

    .line 51
    .line 52
    check-cast v16, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v16

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    and-int/lit8 v17, v16, 0x6

    .line 62
    .line 63
    if-nez v17, :cond_1

    .line 64
    .line 65
    invoke-virtual {v15, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v17

    .line 69
    if-eqz v17, :cond_0

    .line 70
    .line 71
    move v6, v7

    .line 72
    :cond_0
    or-int v16, v16, v6

    .line 73
    .line 74
    :cond_1
    and-int/lit8 v6, v16, 0x13

    .line 75
    .line 76
    if-eq v6, v5, :cond_2

    .line 77
    .line 78
    move v5, v14

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v5, v9

    .line 81
    :goto_0
    and-int/lit8 v6, v16, 0x1

    .line 82
    .line 83
    invoke-virtual {v15, v6, v5}, Llp2;->N(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_6

    .line 88
    .line 89
    sget-object v16, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 90
    .line 91
    invoke-static {v1, v0}, Los4;->h(Lgg5;Lz24;)F

    .line 92
    .line 93
    .line 94
    move-result v17

    .line 95
    invoke-static {v1, v0}, Los4;->g(Lgg5;Lz24;)F

    .line 96
    .line 97
    .line 98
    move-result v19

    .line 99
    const/16 v20, 0x0

    .line 100
    .line 101
    const/16 v21, 0xa

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    invoke-static/range {v16 .. v21}, Los4;->A(Lkx4;FFFFI)Lkx4;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v15}, Ldh3;->G(Llp2;)Lay6;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v0, v5}, Ldh3;->V(Lkx4;Lay6;)Lkx4;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0, v13}, Lzc1;->I(Lkx4;Loh2;)Lkx4;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lch3;->u(Lkx4;)Lkx4;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v5, Lht;->c:Ldt;

    .line 126
    .line 127
    sget-object v6, Lpz2;->q0:Ln50;

    .line 128
    .line 129
    invoke-static {v5, v6, v15, v9}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    iget-wide v6, v15, Llp2;->T:J

    .line 134
    .line 135
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-virtual {v15}, Llp2;->l()Lkl5;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-static {v15, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget-object v9, Luz0;->j:Lpz2;

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15}, Llp2;->Z()V

    .line 153
    .line 154
    .line 155
    iget-boolean v9, v15, Llp2;->S:Z

    .line 156
    .line 157
    if-eqz v9, :cond_3

    .line 158
    .line 159
    invoke-virtual {v15}, Llp2;->k()V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    invoke-virtual {v15}, Llp2;->j0()V

    .line 164
    .line 165
    .line 166
    :goto_1
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 167
    .line 168
    invoke-static {v9, v15, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget-object v5, Lpz2;->A0:Ldx0;

    .line 172
    .line 173
    invoke-static {v5, v15, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    sget-object v6, Lpz2;->C0:Ldx0;

    .line 181
    .line 182
    invoke-static {v6, v15, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v15}, Lpn7;->l(Llp2;)V

    .line 186
    .line 187
    .line 188
    sget-object v5, Lpz2;->z0:Ldx0;

    .line 189
    .line 190
    invoke-static {v5, v15, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v1}, Lgg5;->d()F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v15, v0}, Lch3;->f(Llp2;Lkx4;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v11}, Llh7;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Let7;

    .line 209
    .line 210
    iget-object v0, v0, Let7;->c:Lqs7;

    .line 211
    .line 212
    sget-object v16, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 213
    .line 214
    new-instance v5, Lo90;

    .line 215
    .line 216
    invoke-direct {v5, v10, v11, v4}, Lo90;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    const v4, 0x374747fb

    .line 220
    .line 221
    .line 222
    invoke-static {v4, v5, v15}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 223
    .line 224
    .line 225
    move-result-object v18

    .line 226
    const/16 v20, 0xc30

    .line 227
    .line 228
    const/16 v21, 0x4

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    move-object/from16 v19, v15

    .line 233
    .line 234
    move-object v15, v0

    .line 235
    invoke-static/range {v15 .. v21}, Lhi5;->I(Ljava/lang/Object;Lkx4;Lkx4;Lzy0;Llp2;II)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v0, v19

    .line 239
    .line 240
    invoke-interface {v1}, Lgg5;->a()F

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v0, v1}, Lch3;->f(Llp2;Lkx4;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v14}, Llp2;->p(Z)V

    .line 252
    .line 253
    .line 254
    iget-object v1, v12, Lyt7;->g:Lf76;

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    sget-object v3, Lpc;->b:Lox1;

    .line 260
    .line 261
    invoke-virtual {v0, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, Landroid/content/Context;

    .line 266
    .line 267
    sget-object v4, Lyc4;->a:Lz01;

    .line 268
    .line 269
    invoke-virtual {v0, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Landroid/app/Activity;

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    invoke-virtual {v0, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    or-int/2addr v5, v6

    .line 284
    invoke-virtual {v0, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    or-int/2addr v5, v6

    .line 289
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    if-nez v5, :cond_4

    .line 294
    .line 295
    if-ne v6, v2, :cond_5

    .line 296
    .line 297
    :cond_4
    new-instance v15, Lqk4;

    .line 298
    .line 299
    const/16 v20, 0x14

    .line 300
    .line 301
    const/16 v19, 0x0

    .line 302
    .line 303
    move-object/from16 v16, v1

    .line 304
    .line 305
    move-object/from16 v17, v3

    .line 306
    .line 307
    move-object/from16 v18, v4

    .line 308
    .line 309
    invoke-direct/range {v15 .. v20}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v15}, Llp2;->g0(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    move-object v6, v15

    .line 316
    :cond_5
    check-cast v6, Lrn2;

    .line 317
    .line 318
    invoke-static {v6, v0, v1}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_6
    move-object v0, v15

    .line 323
    invoke-virtual {v0}, Llp2;->Q()V

    .line 324
    .line 325
    .line 326
    :goto_2
    return-object v8

    .line 327
    :pswitch_0
    check-cast v0, Lis7;

    .line 328
    .line 329
    check-cast v13, Lgn2;

    .line 330
    .line 331
    check-cast v12, Lkx4;

    .line 332
    .line 333
    check-cast v11, Ly68;

    .line 334
    .line 335
    check-cast v10, Ly68;

    .line 336
    .line 337
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, Luw0;

    .line 340
    .line 341
    move-object/from16 v2, p2

    .line 342
    .line 343
    check-cast v2, Llp2;

    .line 344
    .line 345
    move-object/from16 v3, p3

    .line 346
    .line 347
    check-cast v3, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    and-int/lit8 v1, v3, 0x11

    .line 357
    .line 358
    if-eq v1, v4, :cond_7

    .line 359
    .line 360
    move v9, v14

    .line 361
    :cond_7
    and-int/lit8 v1, v3, 0x1

    .line 362
    .line 363
    invoke-virtual {v2, v1, v9}, Llp2;->N(IZ)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_8

    .line 368
    .line 369
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 370
    .line 371
    new-instance v9, Lno5;

    .line 372
    .line 373
    move-object v14, v13

    .line 374
    move-object v13, v11

    .line 375
    move-object v11, v14

    .line 376
    move-object v14, v10

    .line 377
    move-object v10, v0

    .line 378
    invoke-direct/range {v9 .. v14}, Lno5;-><init>(Lis7;Lgn2;Lkx4;Ly68;Ly68;)V

    .line 379
    .line 380
    .line 381
    const v0, -0x540dbbdc

    .line 382
    .line 383
    .line 384
    invoke-static {v0, v9, v2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const/16 v3, 0x186

    .line 389
    .line 390
    const/4 v4, 0x0

    .line 391
    invoke-static {v1, v4, v0, v2, v3}, Lw79;->a(Lkx4;Lrn2;Lzy0;Llp2;I)V

    .line 392
    .line 393
    .line 394
    goto :goto_3

    .line 395
    :cond_8
    invoke-virtual {v2}, Llp2;->Q()V

    .line 396
    .line 397
    .line 398
    :goto_3
    return-object v8

    .line 399
    :pswitch_1
    check-cast v0, Lum6;

    .line 400
    .line 401
    iget-object v1, v0, Lum6;->c:Ljava/lang/String;

    .line 402
    .line 403
    check-cast v13, Ljava/lang/String;

    .line 404
    .line 405
    check-cast v12, Ljava/lang/String;

    .line 406
    .line 407
    check-cast v11, Lgn2;

    .line 408
    .line 409
    check-cast v10, Lkx4;

    .line 410
    .line 411
    move-object/from16 v2, p1

    .line 412
    .line 413
    check-cast v2, Lk44;

    .line 414
    .line 415
    move v15, v14

    .line 416
    move-object/from16 v14, p2

    .line 417
    .line 418
    check-cast v14, Llp2;

    .line 419
    .line 420
    move-object/from16 v3, p3

    .line 421
    .line 422
    check-cast v3, Ljava/lang/Integer;

    .line 423
    .line 424
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    and-int/lit8 v4, v3, 0x6

    .line 432
    .line 433
    if-nez v4, :cond_a

    .line 434
    .line 435
    invoke-virtual {v14, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-eqz v4, :cond_9

    .line 440
    .line 441
    move v6, v7

    .line 442
    :cond_9
    or-int/2addr v3, v6

    .line 443
    :cond_a
    and-int/lit8 v4, v3, 0x13

    .line 444
    .line 445
    if-eq v4, v5, :cond_b

    .line 446
    .line 447
    move v4, v15

    .line 448
    goto :goto_4

    .line 449
    :cond_b
    move v4, v9

    .line 450
    :goto_4
    and-int/2addr v3, v15

    .line 451
    invoke-virtual {v14, v3, v4}, Llp2;->N(IZ)Z

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    if-eqz v3, :cond_e

    .line 456
    .line 457
    if-nez v13, :cond_c

    .line 458
    .line 459
    move v3, v9

    .line 460
    goto :goto_5

    .line 461
    :cond_c
    invoke-virtual {v13, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    :goto_5
    if-nez v12, :cond_d

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_d
    invoke-virtual {v12, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    :goto_6
    invoke-static {v2, v10}, Ldh3;->p(Lk44;Lkx4;)Lkx4;

    .line 473
    .line 474
    .line 475
    move-result-object v13

    .line 476
    const/4 v15, 0x0

    .line 477
    move v10, v3

    .line 478
    move-object v12, v11

    .line 479
    move v11, v9

    .line 480
    move-object v9, v0

    .line 481
    invoke-static/range {v9 .. v15}, Lu70;->o(Lum6;ZZLgn2;Lkx4;Llp2;I)V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_e
    invoke-virtual {v14}, Llp2;->Q()V

    .line 486
    .line 487
    .line 488
    :goto_7
    return-object v8

    .line 489
    :pswitch_2
    move v15, v14

    .line 490
    check-cast v0, Lum6;

    .line 491
    .line 492
    move-object v1, v13

    .line 493
    check-cast v1, Lgn2;

    .line 494
    .line 495
    check-cast v12, Loh2;

    .line 496
    .line 497
    check-cast v11, Loh2;

    .line 498
    .line 499
    move-object/from16 v16, v10

    .line 500
    .line 501
    check-cast v16, Lla;

    .line 502
    .line 503
    move-object/from16 v5, p1

    .line 504
    .line 505
    check-cast v5, Ll80;

    .line 506
    .line 507
    move-object/from16 v10, p2

    .line 508
    .line 509
    check-cast v10, Llp2;

    .line 510
    .line 511
    move-object/from16 v13, p3

    .line 512
    .line 513
    check-cast v13, Ljava/lang/Integer;

    .line 514
    .line 515
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result v13

    .line 519
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    and-int/lit8 v5, v13, 0x11

    .line 523
    .line 524
    if-eq v5, v4, :cond_f

    .line 525
    .line 526
    move v9, v15

    .line 527
    :cond_f
    and-int/lit8 v4, v13, 0x1

    .line 528
    .line 529
    invoke-virtual {v10, v4, v9}, Llp2;->N(IZ)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_17

    .line 534
    .line 535
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    if-ne v4, v2, :cond_10

    .line 540
    .line 541
    invoke-static {v10}, Lu70;->D(Llp2;)Lb71;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-virtual {v10, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :cond_10
    check-cast v4, Lb71;

    .line 549
    .line 550
    invoke-static {v3, v12}, Lzc1;->I(Lkx4;Loh2;)Lkx4;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-virtual {v10, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v9

    .line 558
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v13

    .line 562
    if-nez v9, :cond_11

    .line 563
    .line 564
    if-ne v13, v2, :cond_12

    .line 565
    .line 566
    :cond_11
    new-instance v13, Lbz2;

    .line 567
    .line 568
    invoke-direct {v13, v11, v7}, Lbz2;-><init>(Loh2;B)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v10, v13}, Llp2;->g0(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    :cond_12
    check-cast v13, Lgn2;

    .line 575
    .line 576
    invoke-static {v5, v13}, Lz91;->C(Lkx4;Lgn2;)Lkx4;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 581
    .line 582
    invoke-interface {v5, v7}, Lkx4;->y(Lkx4;)Lkx4;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    sget-object v7, Lep;->z:Lox1;

    .line 587
    .line 588
    invoke-virtual {v10, v7}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v7

    .line 592
    check-cast v7, Ldp;

    .line 593
    .line 594
    iget-object v7, v7, Ldp;->b:Luo;

    .line 595
    .line 596
    iget-wide v13, v7, Luo;->b:J

    .line 597
    .line 598
    sget-object v7, Lu70;->e:Lx03;

    .line 599
    .line 600
    invoke-static {v5, v13, v14, v7}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 601
    .line 602
    .line 603
    move-result-object v17

    .line 604
    iget-boolean v5, v0, Lum6;->b:Z

    .line 605
    .line 606
    xor-int/lit8 v18, v5, 0x1

    .line 607
    .line 608
    invoke-virtual {v10, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    invoke-virtual {v10, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v7

    .line 616
    or-int/2addr v5, v7

    .line 617
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    if-nez v5, :cond_13

    .line 622
    .line 623
    if-ne v7, v2, :cond_14

    .line 624
    .line 625
    :cond_13
    new-instance v7, Lqm6;

    .line 626
    .line 627
    invoke-direct {v7, v1, v0, v6}, Lqm6;-><init>(Lgn2;Lum6;B)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v10, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    :cond_14
    move-object/from16 v22, v7

    .line 634
    .line 635
    check-cast v22, Ldn2;

    .line 636
    .line 637
    const/16 v24, 0x1d

    .line 638
    .line 639
    const/16 v19, 0x0

    .line 640
    .line 641
    const/16 v20, 0x0

    .line 642
    .line 643
    const/16 v21, 0x0

    .line 644
    .line 645
    move-object/from16 v23, v10

    .line 646
    .line 647
    invoke-static/range {v17 .. v24}, Lvj8;->x(Lkx4;ZLxz4;Landroidx/compose/material3/c;Ldn2;Ldn2;Llp2;I)Lkx4;

    .line 648
    .line 649
    .line 650
    move-result-object v5

    .line 651
    move-object/from16 v6, v23

    .line 652
    .line 653
    const/high16 v7, 0x40800000    # 4.0f

    .line 654
    .line 655
    const/4 v9, 0x0

    .line 656
    invoke-static {v5, v9, v7, v15}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    new-instance v15, Ltm6;

    .line 661
    .line 662
    const/16 v20, 0x0

    .line 663
    .line 664
    move-object/from16 v19, v0

    .line 665
    .line 666
    move-object/from16 v18, v1

    .line 667
    .line 668
    move-object/from16 v17, v4

    .line 669
    .line 670
    invoke-direct/range {v15 .. v20}, Ltm6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 671
    .line 672
    .line 673
    invoke-static {v5, v15}, Lmb6;->S(Lkx4;Lgn2;)Lkx4;

    .line 674
    .line 675
    .line 676
    move-result-object v4

    .line 677
    invoke-static {v3, v11}, Lzc1;->I(Lkx4;Loh2;)Lkx4;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    invoke-virtual {v6, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    if-nez v5, :cond_15

    .line 690
    .line 691
    if-ne v7, v2, :cond_16

    .line 692
    .line 693
    :cond_15
    new-instance v7, Lbz2;

    .line 694
    .line 695
    const/4 v2, 0x3

    .line 696
    invoke-direct {v7, v12, v2}, Lbz2;-><init>(Loh2;B)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v6, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    :cond_16
    check-cast v7, Lgn2;

    .line 703
    .line 704
    invoke-static {v3, v7}, Lz91;->C(Lkx4;Lgn2;)Lkx4;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    const/4 v5, 0x0

    .line 709
    move-object v2, v4

    .line 710
    move-object v4, v6

    .line 711
    invoke-static/range {v0 .. v5}, Lu70;->p(Lum6;Lgn2;Lkx4;Lkx4;Llp2;I)V

    .line 712
    .line 713
    .line 714
    goto :goto_8

    .line 715
    :cond_17
    move-object v4, v10

    .line 716
    invoke-virtual {v4}, Llp2;->Q()V

    .line 717
    .line 718
    .line 719
    :goto_8
    return-object v8

    .line 720
    :pswitch_3
    move v15, v14

    .line 721
    check-cast v0, Lzy0;

    .line 722
    .line 723
    check-cast v13, Ldn2;

    .line 724
    .line 725
    check-cast v12, Landroid/content/Context;

    .line 726
    .line 727
    check-cast v11, Landroid/app/Activity;

    .line 728
    .line 729
    check-cast v10, Landroid/content/res/Configuration;

    .line 730
    .line 731
    move-object/from16 v1, p1

    .line 732
    .line 733
    check-cast v1, Luw0;

    .line 734
    .line 735
    move-object/from16 v2, p2

    .line 736
    .line 737
    check-cast v2, Llp2;

    .line 738
    .line 739
    move-object/from16 v3, p3

    .line 740
    .line 741
    check-cast v3, Ljava/lang/Integer;

    .line 742
    .line 743
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 744
    .line 745
    .line 746
    move-result v3

    .line 747
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    and-int/lit8 v4, v3, 0x6

    .line 751
    .line 752
    if-nez v4, :cond_19

    .line 753
    .line 754
    invoke-virtual {v2, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    if-eqz v4, :cond_18

    .line 759
    .line 760
    move v6, v7

    .line 761
    :cond_18
    or-int/2addr v3, v6

    .line 762
    :cond_19
    and-int/lit8 v4, v3, 0x13

    .line 763
    .line 764
    if-eq v4, v5, :cond_1a

    .line 765
    .line 766
    move v9, v15

    .line 767
    :cond_1a
    and-int/2addr v3, v15

    .line 768
    invoke-virtual {v2, v3, v9}, Llp2;->N(IZ)Z

    .line 769
    .line 770
    .line 771
    move-result v3

    .line 772
    if-eqz v3, :cond_1b

    .line 773
    .line 774
    new-instance v3, Ldw2;

    .line 775
    .line 776
    invoke-direct {v3, v0, v1, v13, v15}, Ldw2;-><init>(Lzy0;Luw0;Ldn2;B)V

    .line 777
    .line 778
    .line 779
    const v0, 0x5a3d5e8d

    .line 780
    .line 781
    .line 782
    invoke-static {v0, v3, v2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-static {v12, v11, v10, v0, v2}, Lvr3;->e(Landroid/content/Context;Landroid/app/Activity;Landroid/content/res/Configuration;Lzy0;Llp2;)V

    .line 787
    .line 788
    .line 789
    goto :goto_9

    .line 790
    :cond_1b
    invoke-virtual {v2}, Llp2;->Q()V

    .line 791
    .line 792
    .line 793
    :goto_9
    return-object v8

    .line 794
    nop

    .line 795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public abstract Lbg;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;

.field public static final b:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lx;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lbg;->a:Lox1;

    .line 15
    .line 16
    new-instance v0, Lj72;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lox1;

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lbg;->b:Lox1;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(Lnr5;Ldn2;Lor5;Lzy0;Llp2;II)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p4

    .line 4
    .line 5
    move/from16 v10, p5

    .line 6
    .line 7
    const v0, -0x699ff8ef

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, v0}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v10, 0x6

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v9, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int/2addr v0, v10

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v10

    .line 29
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    or-int/lit8 v0, v0, 0x30

    .line 34
    .line 35
    :cond_2
    move-object/from16 v3, p1

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v3, v10, 0x30

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    move-object/from16 v3, p1

    .line 43
    .line 44
    invoke-virtual {v9, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    const/16 v4, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    const/16 v4, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v0, v4

    .line 56
    :goto_3
    and-int/lit16 v4, v10, 0x180

    .line 57
    .line 58
    if-nez v4, :cond_6

    .line 59
    .line 60
    move-object/from16 v4, p2

    .line 61
    .line 62
    invoke-virtual {v9, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    const/16 v5, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v5, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v0, v5

    .line 74
    goto :goto_5

    .line 75
    :cond_6
    move-object/from16 v4, p2

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v5, v10, 0xc00

    .line 78
    .line 79
    move-object/from16 v14, p3

    .line 80
    .line 81
    if-nez v5, :cond_8

    .line 82
    .line 83
    invoke-virtual {v9, v14}, Llp2;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    const/16 v5, 0x800

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_7
    const/16 v5, 0x400

    .line 93
    .line 94
    :goto_6
    or-int/2addr v0, v5

    .line 95
    :cond_8
    move v15, v0

    .line 96
    and-int/lit16 v0, v15, 0x493

    .line 97
    .line 98
    const/16 v5, 0x492

    .line 99
    .line 100
    const/4 v7, 0x0

    .line 101
    if-eq v0, v5, :cond_9

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    goto :goto_7

    .line 105
    :cond_9
    move v0, v7

    .line 106
    :goto_7
    and-int/lit8 v5, v15, 0x1

    .line 107
    .line 108
    invoke-virtual {v9, v5, v0}, Llp2;->N(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1f

    .line 113
    .line 114
    if-eqz v2, :cond_a

    .line 115
    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    goto :goto_8

    .line 119
    :cond_a
    move-object/from16 v16, v3

    .line 120
    .line 121
    :goto_8
    sget-object v2, Lpc;->f:Lox1;

    .line 122
    .line 123
    invoke-virtual {v9, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Landroid/view/View;

    .line 128
    .line 129
    sget-object v3, Ly01;->h:Lox1;

    .line 130
    .line 131
    invoke-virtual {v9, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    move-object v5, v3

    .line 136
    check-cast v5, Lfi1;

    .line 137
    .line 138
    sget-object v3, Lbg;->a:Lox1;

    .line 139
    .line 140
    invoke-virtual {v9, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    move-object/from16 v18, v3

    .line 145
    .line 146
    check-cast v18, Ljava/lang/String;

    .line 147
    .line 148
    sget-object v3, Ly01;->n:Lox1;

    .line 149
    .line 150
    invoke-virtual {v9, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    move-object/from16 v19, v3

    .line 155
    .line 156
    check-cast v19, Lz24;

    .line 157
    .line 158
    invoke-static {v9}, Lkm4;->j0(Llp2;)Ljp2;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static/range {p3 .. p4}, Lz51;->P(Ljava/lang/Object;Llp2;)Ly05;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    new-array v0, v7, [Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    sget-object v11, Lzz0;->a:Lbe;

    .line 173
    .line 174
    if-ne v6, v11, :cond_b

    .line 175
    .line 176
    new-instance v6, Lx;

    .line 177
    .line 178
    const/16 v7, 0x11

    .line 179
    .line 180
    invoke-direct {v6, v7}, Lx;-><init>(B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_b
    check-cast v6, Ldn2;

    .line 187
    .line 188
    invoke-static {v0, v6, v9}, Ljm4;->W([Ljava/lang/Object;Ldn2;Llp2;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object v7, v0

    .line 193
    check-cast v7, Ljava/util/UUID;

    .line 194
    .line 195
    sget-object v0, Lbg;->b:Lox1;

    .line 196
    .line 197
    invoke-virtual {v9, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    if-ne v6, v11, :cond_c

    .line 212
    .line 213
    move-object/from16 v21, v8

    .line 214
    .line 215
    move v8, v0

    .line 216
    new-instance v0, Lir5;

    .line 217
    .line 218
    move-object v6, v4

    .line 219
    move-object v4, v2

    .line 220
    move-object v2, v6

    .line 221
    move-object v6, v1

    .line 222
    move-object v12, v3

    .line 223
    move-object/from16 v1, v16

    .line 224
    .line 225
    move-object/from16 v3, v18

    .line 226
    .line 227
    move-object/from16 v10, v21

    .line 228
    .line 229
    const/4 v13, 0x1

    .line 230
    invoke-direct/range {v0 .. v8}, Lir5;-><init>(Ldn2;Lor5;Ljava/lang/String;Landroid/view/View;Lfi1;Lnr5;Ljava/util/UUID;Z)V

    .line 231
    .line 232
    .line 233
    move-object v1, v6

    .line 234
    new-instance v2, Ltf;

    .line 235
    .line 236
    invoke-direct {v2, v0, v10, v13}, Ltf;-><init>(Lir5;Ly05;B)V

    .line 237
    .line 238
    .line 239
    new-instance v4, Lzy0;

    .line 240
    .line 241
    const v5, -0x11bbdae4

    .line 242
    .line 243
    .line 244
    invoke-direct {v4, v5, v13, v2}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v12, v4}, Lir5;->m(Lm01;Lrn2;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object v6, v0

    .line 254
    goto :goto_9

    .line 255
    :cond_c
    move-object/from16 v3, v18

    .line 256
    .line 257
    const/4 v13, 0x1

    .line 258
    :goto_9
    check-cast v6, Lir5;

    .line 259
    .line 260
    invoke-virtual {v9, v6}, Llp2;->h(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    and-int/lit8 v2, v15, 0x70

    .line 265
    .line 266
    const/16 v4, 0x20

    .line 267
    .line 268
    if-ne v2, v4, :cond_d

    .line 269
    .line 270
    move v4, v13

    .line 271
    goto :goto_a

    .line 272
    :cond_d
    const/4 v4, 0x0

    .line 273
    :goto_a
    or-int/2addr v0, v4

    .line 274
    and-int/lit16 v4, v15, 0x380

    .line 275
    .line 276
    const/16 v5, 0x100

    .line 277
    .line 278
    if-ne v4, v5, :cond_e

    .line 279
    .line 280
    move v5, v13

    .line 281
    goto :goto_b

    .line 282
    :cond_e
    const/4 v5, 0x0

    .line 283
    :goto_b
    or-int/2addr v0, v5

    .line 284
    invoke-virtual {v9, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    or-int/2addr v0, v5

    .line 289
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    invoke-virtual {v9, v5}, Llp2;->d(I)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    or-int/2addr v0, v5

    .line 298
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    if-nez v0, :cond_10

    .line 303
    .line 304
    if-ne v5, v11, :cond_f

    .line 305
    .line 306
    goto :goto_c

    .line 307
    :cond_f
    move v0, v15

    .line 308
    move-object v15, v6

    .line 309
    goto :goto_d

    .line 310
    :cond_10
    :goto_c
    new-instance v14, Lvf;

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    move-object/from16 v17, p2

    .line 315
    .line 316
    move-object/from16 v18, v3

    .line 317
    .line 318
    move v0, v15

    .line 319
    move-object v15, v6

    .line 320
    invoke-direct/range {v14 .. v20}, Lvf;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;B)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9, v14}, Llp2;->g0(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    move-object v5, v14

    .line 327
    :goto_d
    check-cast v5, Lgn2;

    .line 328
    .line 329
    invoke-static {v15, v5, v9}, Lu70;->a(Ljava/lang/Object;Lgn2;Llp2;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    const/16 v6, 0x20

    .line 337
    .line 338
    if-ne v2, v6, :cond_11

    .line 339
    .line 340
    move v6, v13

    .line 341
    goto :goto_e

    .line 342
    :cond_11
    const/4 v6, 0x0

    .line 343
    :goto_e
    or-int v2, v5, v6

    .line 344
    .line 345
    const/16 v5, 0x100

    .line 346
    .line 347
    if-ne v4, v5, :cond_12

    .line 348
    .line 349
    move v6, v13

    .line 350
    goto :goto_f

    .line 351
    :cond_12
    const/4 v6, 0x0

    .line 352
    :goto_f
    or-int/2addr v2, v6

    .line 353
    invoke-virtual {v9, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    or-int/2addr v2, v4

    .line 358
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    invoke-virtual {v9, v4}, Llp2;->d(I)Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    or-int/2addr v2, v4

    .line 367
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    if-nez v2, :cond_14

    .line 372
    .line 373
    if-ne v4, v11, :cond_13

    .line 374
    .line 375
    goto :goto_10

    .line 376
    :cond_13
    move-object/from16 v3, v19

    .line 377
    .line 378
    goto :goto_11

    .line 379
    :cond_14
    :goto_10
    new-instance v14, Lwf;

    .line 380
    .line 381
    move-object/from16 v17, p2

    .line 382
    .line 383
    move-object/from16 v18, v3

    .line 384
    .line 385
    invoke-direct/range {v14 .. v19}, Lwf;-><init>(Lir5;Ldn2;Lor5;Ljava/lang/String;Lz24;)V

    .line 386
    .line 387
    .line 388
    move-object/from16 v3, v19

    .line 389
    .line 390
    invoke-virtual {v9, v14}, Llp2;->g0(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    move-object v4, v14

    .line 394
    :goto_11
    check-cast v4, Ldn2;

    .line 395
    .line 396
    invoke-static {v4, v9}, Lu70;->q(Ldn2;Llp2;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v9, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    and-int/lit8 v0, v0, 0xe

    .line 404
    .line 405
    const/4 v4, 0x4

    .line 406
    if-ne v0, v4, :cond_15

    .line 407
    .line 408
    move v6, v13

    .line 409
    goto :goto_12

    .line 410
    :cond_15
    const/4 v6, 0x0

    .line 411
    :goto_12
    or-int v0, v2, v6

    .line 412
    .line 413
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    const/4 v4, 0x3

    .line 418
    if-nez v0, :cond_16

    .line 419
    .line 420
    if-ne v2, v11, :cond_17

    .line 421
    .line 422
    :cond_16
    new-instance v2, Lp0;

    .line 423
    .line 424
    invoke-direct {v2, v15, v1, v4}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v9, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_17
    check-cast v2, Lgn2;

    .line 431
    .line 432
    invoke-static {v1, v2, v9}, Lu70;->a(Ljava/lang/Object;Lgn2;Llp2;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v9, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    if-nez v0, :cond_18

    .line 444
    .line 445
    if-ne v2, v11, :cond_19

    .line 446
    .line 447
    :cond_18
    new-instance v2, Lq0;

    .line 448
    .line 449
    const/4 v0, 0x0

    .line 450
    invoke-direct {v2, v15, v0, v4}, Lq0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v9, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :cond_19
    check-cast v2, Lrn2;

    .line 457
    .line 458
    invoke-static {v2, v9, v15}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    if-nez v0, :cond_1a

    .line 470
    .line 471
    if-ne v2, v11, :cond_1b

    .line 472
    .line 473
    :cond_1a
    new-instance v2, Luf;

    .line 474
    .line 475
    invoke-direct {v2, v15, v13}, Luf;-><init>(Lir5;B)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v9, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_1b
    check-cast v2, Lgn2;

    .line 482
    .line 483
    sget-object v0, Lhx4;->X:Lhx4;

    .line 484
    .line 485
    invoke-static {v0, v2}, Lvr3;->Q(Lkx4;Lgn2;)Lkx4;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v9, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    invoke-virtual {v9, v4}, Llp2;->d(I)Z

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    or-int/2addr v2, v4

    .line 502
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    if-nez v2, :cond_1c

    .line 507
    .line 508
    if-ne v4, v11, :cond_1d

    .line 509
    .line 510
    :cond_1c
    new-instance v4, Lyf;

    .line 511
    .line 512
    const/4 v2, 0x0

    .line 513
    invoke-direct {v4, v15, v3, v2}, Lyf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v9, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    :cond_1d
    check-cast v4, Lxr4;

    .line 520
    .line 521
    iget-wide v2, v9, Llp2;->T:J

    .line 522
    .line 523
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    invoke-virtual {v9}, Llp2;->l()Lkl5;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    invoke-static {v9, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sget-object v5, Luz0;->j:Lpz2;

    .line 536
    .line 537
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v9}, Llp2;->Z()V

    .line 541
    .line 542
    .line 543
    iget-boolean v5, v9, Llp2;->S:Z

    .line 544
    .line 545
    if-eqz v5, :cond_1e

    .line 546
    .line 547
    invoke-virtual {v9}, Llp2;->k()V

    .line 548
    .line 549
    .line 550
    goto :goto_13

    .line 551
    :cond_1e
    invoke-virtual {v9}, Llp2;->j0()V

    .line 552
    .line 553
    .line 554
    :goto_13
    sget-object v5, Lpz2;->B0:Ldx0;

    .line 555
    .line 556
    invoke-static {v5, v9, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    sget-object v4, Lpz2;->A0:Ldx0;

    .line 560
    .line 561
    invoke-static {v4, v9, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 569
    .line 570
    invoke-static {v3, v9, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    invoke-static {v9}, Lpn7;->l(Llp2;)V

    .line 574
    .line 575
    .line 576
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 577
    .line 578
    invoke-static {v2, v9, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v9, v13}, Llp2;->p(Z)V

    .line 582
    .line 583
    .line 584
    move-object/from16 v2, v16

    .line 585
    .line 586
    goto :goto_14

    .line 587
    :cond_1f
    invoke-virtual {v9}, Llp2;->Q()V

    .line 588
    .line 589
    .line 590
    move-object v2, v3

    .line 591
    :goto_14
    invoke-virtual {v9}, Llp2;->r()Lj86;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    if-eqz v8, :cond_20

    .line 596
    .line 597
    new-instance v0, Lxf;

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    move-object/from16 v3, p2

    .line 601
    .line 602
    move-object/from16 v4, p3

    .line 603
    .line 604
    move/from16 v5, p5

    .line 605
    .line 606
    move/from16 v6, p6

    .line 607
    .line 608
    invoke-direct/range {v0 .. v7}, Lxf;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ltn2;IIB)V

    .line 609
    .line 610
    .line 611
    iput-object v0, v8, Lj86;->d:Lrn2;

    .line 612
    .line 613
    :cond_20
    return-void
.end method

.method public static final b(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 21
    .line 22
    and-int/lit16 p0, p0, 0x2000

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v0
.end method

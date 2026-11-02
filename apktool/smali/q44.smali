.class public final Lq44;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lz47;

.field public final Z:Lt44;


# direct methods
.method public constructor <init>(Lt44;Lz47;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lq44;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lq44;->Z:Lt44;

    .line 8
    .line 9
    iput-object p2, p0, Lq44;->Y:Lz47;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lz47;Lt44;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lq44;->X:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq44;->Y:Lz47;

    iput-object p2, p0, Lq44;->Z:Lt44;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lq44;->X:B

    .line 4
    .line 5
    iget-object v2, v0, Lq44;->Y:Lz47;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v2, Lz47;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lc6;

    .line 13
    .line 14
    iget-object v1, v1, Lc6;->r0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La08;

    .line 17
    .line 18
    iget-object v0, v0, Lq44;->Z:Lt44;

    .line 19
    .line 20
    iget-object v0, v0, Lt44;->n:Lsx4;

    .line 21
    .line 22
    check-cast v1, Lra;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_0
    sget-object v7, Loy1;->f0:Lrm;

    .line 41
    .line 42
    iget-object v0, v0, Lq44;->Z:Lt44;

    .line 43
    .line 44
    iget-object v1, v0, Lt44;->o:Lta6;

    .line 45
    .line 46
    iget-object v15, v0, Lf54;->b:Lz47;

    .line 47
    .line 48
    iget-object v3, v0, Lt44;->n:Lsx4;

    .line 49
    .line 50
    iget-object v4, v1, Lta6;->a:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Leu;->Y([Ljava/lang/Object;)Lu27;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget-object v5, Loa6;->X:Loa6;

    .line 64
    .line 65
    new-instance v6, Lla2;

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    invoke-direct {v6, v4, v8, v5}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 69
    .line 70
    .line 71
    sget-object v4, Lpa6;->X:Lpa6;

    .line 72
    .line 73
    invoke-static {v6, v4}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    new-instance v5, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    const/4 v10, 0x1

    .line 99
    if-eqz v6, :cond_5

    .line 100
    .line 101
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Lwa6;

    .line 106
    .line 107
    invoke-static {v15, v6}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-static {v6}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-static {v3, v11, v8, v12}, Lyj3;->X0(Lsx4;Lsm;ZLhr6;)Lyj3;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-virtual {v3}, Lsx4;->k0()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    iget-object v13, v15, Lz47;->f0:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v13, Lg44;

    .line 130
    .line 131
    iget-object v14, v15, Lz47;->Y:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v14, Lc6;

    .line 134
    .line 135
    new-instance v9, Lxm0;

    .line 136
    .line 137
    invoke-direct {v9, v15, v11, v6, v12}, Lxm0;-><init>(Lz47;Led1;Lpl3;I)V

    .line 138
    .line 139
    .line 140
    new-instance v12, Lz47;

    .line 141
    .line 142
    invoke-direct {v12, v14, v9, v13}, Lz47;-><init>(Lc6;Lki8;Lg44;)V

    .line 143
    .line 144
    .line 145
    iget-object v9, v6, Lwa6;->a:Ljava/lang/reflect/Constructor;

    .line 146
    .line 147
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    array-length v14, v13

    .line 155
    if-nez v14, :cond_0

    .line 156
    .line 157
    sget-object v9, Ld02;->X:Ld02;

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_0
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    invoke-virtual {v14}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v16

    .line 168
    if-eqz v16, :cond_1

    .line 169
    .line 170
    invoke-virtual {v14}, Ljava/lang/Class;->getModifiers()I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-nez v14, :cond_1

    .line 179
    .line 180
    array-length v14, v13

    .line 181
    invoke-static {v13, v10, v14}, Leu;->k0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    move-object v13, v10

    .line 186
    check-cast v13, [Ljava/lang/reflect/Type;

    .line 187
    .line 188
    :cond_1
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    array-length v14, v10

    .line 193
    array-length v8, v13

    .line 194
    if-lt v14, v8, :cond_4

    .line 195
    .line 196
    array-length v8, v10

    .line 197
    array-length v14, v13

    .line 198
    if-le v8, v14, :cond_2

    .line 199
    .line 200
    array-length v8, v10

    .line 201
    array-length v14, v13

    .line 202
    sub-int/2addr v8, v14

    .line 203
    array-length v14, v10

    .line 204
    invoke-static {v10, v8, v14}, Leu;->k0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    move-object v10, v8

    .line 209
    check-cast v10, [[Ljava/lang/annotation/Annotation;

    .line 210
    .line 211
    :cond_2
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->isVarArgs()Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    invoke-virtual {v6, v13, v10, v8}, Lbb6;->d([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/ArrayList;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    :goto_1
    invoke-static {v12, v11, v9}, Lf54;->u(Lz47;Ljo2;Ljava/util/List;)Lfj2;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    invoke-virtual {v3}, Lsx4;->k0()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6}, Lwa6;->getTypeParameters()Ljava/util/ArrayList;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    new-instance v13, Ljava/util/ArrayList;

    .line 235
    .line 236
    const/16 v14, 0xa

    .line 237
    .line 238
    invoke-static {v10, v14}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    if-eqz v14, :cond_3

    .line 254
    .line 255
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    check-cast v14, Lhb6;

    .line 260
    .line 261
    move-object/from16 v17, v0

    .line 262
    .line 263
    iget-object v0, v12, Lz47;->Z:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lki8;

    .line 266
    .line 267
    invoke-interface {v0, v14}, Lki8;->M(Lhb6;)Lhi8;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-object/from16 v0, v17

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_3
    move-object/from16 v17, v0

    .line 281
    .line 282
    invoke-static {v9, v13}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    iget-object v9, v8, Lfj2;->a:Ljava/util/List;

    .line 287
    .line 288
    invoke-virtual {v6}, Lbb6;->e()Ll5;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-static {v6}, Ls08;->k(Ll5;)Lfl1;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v11, v9, v6, v0}, Lgs0;->V0(Ljava/util/List;Lfl1;Ljava/util/List;)V

    .line 297
    .line 298
    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-virtual {v11, v0}, Lyj3;->N0(Z)V

    .line 301
    .line 302
    .line 303
    iget-boolean v0, v8, Lfj2;->b:Z

    .line 304
    .line 305
    invoke-virtual {v11, v0}, Lyj3;->O0(Z)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, Lsx4;->X()Laa7;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v11, v0}, Ljo2;->P0(Laa7;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-object/from16 v0, v17

    .line 319
    .line 320
    const/4 v8, 0x0

    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_4
    const-string v0, "Illegal generic signature: "

    .line 324
    .line 325
    invoke-static {v9, v0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const/4 v9, 0x0

    .line 329
    goto/16 :goto_f

    .line 330
    .line 331
    :cond_5
    move-object/from16 v17, v0

    .line 332
    .line 333
    invoke-virtual {v1}, Lta6;->g()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iget-object v4, v1, Lta6;->a:Ljava/lang/Class;

    .line 338
    .line 339
    const/4 v6, 0x6

    .line 340
    sget-object v8, Lzi8;->Y:Lzi8;

    .line 341
    .line 342
    if-eqz v0, :cond_b

    .line 343
    .line 344
    iget-object v0, v15, Lz47;->Y:Ljava/lang/Object;

    .line 345
    .line 346
    invoke-static {v1}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v3, v7, v10, v0}, Lyj3;->X0(Lsx4;Lsm;ZLhr6;)Lyj3;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v1}, Lta6;->f()Ljava/util/ArrayList;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    new-instance v11, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 365
    .line 366
    .line 367
    const/4 v12, 0x0

    .line 368
    const/4 v13, 0x0

    .line 369
    invoke-static {v8, v12, v13, v6}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 370
    .line 371
    .line 372
    move-result-object v14

    .line 373
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v16

    .line 377
    move v9, v6

    .line 378
    move v6, v12

    .line 379
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v18

    .line 383
    if-eqz v18, :cond_6

    .line 384
    .line 385
    add-int/lit8 v18, v6, 0x1

    .line 386
    .line 387
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v19

    .line 391
    check-cast v19, Lfb6;

    .line 392
    .line 393
    iget-object v9, v15, Lz47;->g0:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v9, Lf63;

    .line 396
    .line 397
    invoke-virtual/range {v19 .. v19}, Lfb6;->f()Lgb6;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    invoke-virtual {v9, v10, v14}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    move-object v10, v3

    .line 406
    new-instance v3, Lot8;

    .line 407
    .line 408
    move-object/from16 v21, v8

    .line 409
    .line 410
    invoke-virtual/range {v19 .. v19}, Lbb6;->c()Lv15;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    move/from16 v22, v12

    .line 415
    .line 416
    const/4 v12, 0x0

    .line 417
    invoke-static/range {v19 .. v19}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 418
    .line 419
    .line 420
    move-result-object v19

    .line 421
    move-object/from16 v23, v5

    .line 422
    .line 423
    const/4 v5, 0x0

    .line 424
    move-object/from16 v24, v10

    .line 425
    .line 426
    const/4 v10, 0x0

    .line 427
    move-object/from16 v25, v11

    .line 428
    .line 429
    const/4 v11, 0x0

    .line 430
    move-object/from16 v26, v13

    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    move-object/from16 v20, v4

    .line 434
    .line 435
    move-object/from16 v27, v21

    .line 436
    .line 437
    move-object v4, v0

    .line 438
    move-object/from16 v21, v14

    .line 439
    .line 440
    move-object/from16 v14, v19

    .line 441
    .line 442
    move-object/from16 v0, v23

    .line 443
    .line 444
    move-object/from16 v19, v1

    .line 445
    .line 446
    move-object/from16 v1, v25

    .line 447
    .line 448
    invoke-direct/range {v3 .. v14}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-object v5, v0

    .line 455
    move-object v11, v1

    .line 456
    move-object v0, v4

    .line 457
    move/from16 v6, v18

    .line 458
    .line 459
    move-object/from16 v1, v19

    .line 460
    .line 461
    move-object/from16 v4, v20

    .line 462
    .line 463
    move-object/from16 v14, v21

    .line 464
    .line 465
    move-object/from16 v3, v24

    .line 466
    .line 467
    move-object/from16 v8, v27

    .line 468
    .line 469
    const/4 v9, 0x6

    .line 470
    const/4 v10, 0x1

    .line 471
    const/4 v12, 0x0

    .line 472
    const/4 v13, 0x0

    .line 473
    goto :goto_3

    .line 474
    :cond_6
    move-object/from16 v19, v1

    .line 475
    .line 476
    move-object/from16 v24, v3

    .line 477
    .line 478
    move-object/from16 v20, v4

    .line 479
    .line 480
    move-object/from16 v27, v8

    .line 481
    .line 482
    move-object v1, v11

    .line 483
    move-object v4, v0

    .line 484
    move-object v0, v5

    .line 485
    invoke-virtual {v4, v12}, Lyj3;->O0(Z)V

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v24 .. v24}, Lsx4;->e()Lfl1;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    sget-object v5, Lek3;->b:Lfl1;

    .line 496
    .line 497
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-eqz v5, :cond_7

    .line 502
    .line 503
    sget-object v3, Lek3;->c:Lfl1;

    .line 504
    .line 505
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    :cond_7
    invoke-virtual {v4, v1, v3}, Lgs0;->U0(Ljava/util/List;Lfl1;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v4, v12}, Lyj3;->N0(Z)V

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v24 .. v24}, Lsx4;->X()Laa7;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-virtual {v4, v1}, Ljo2;->P0(Laa7;)V

    .line 519
    .line 520
    .line 521
    const/4 v1, 0x2

    .line 522
    invoke-static {v4, v1}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 527
    .line 528
    .line 529
    move-result v5

    .line 530
    if-eqz v5, :cond_8

    .line 531
    .line 532
    goto :goto_4

    .line 533
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    if-eqz v6, :cond_a

    .line 542
    .line 543
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    check-cast v6, Lgs0;

    .line 548
    .line 549
    invoke-static {v6, v1}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-eqz v6, :cond_9

    .line 558
    .line 559
    goto :goto_5

    .line 560
    :cond_a
    :goto_4
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    iget-object v1, v2, Lz47;->Y:Ljava/lang/Object;

    .line 564
    .line 565
    goto :goto_5

    .line 566
    :cond_b
    move-object/from16 v19, v1

    .line 567
    .line 568
    move-object/from16 v24, v3

    .line 569
    .line 570
    move-object/from16 v20, v4

    .line 571
    .line 572
    move-object v0, v5

    .line 573
    move-object/from16 v27, v8

    .line 574
    .line 575
    :goto_5
    iget-object v1, v2, Lz47;->Y:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v1, Lc6;

    .line 578
    .line 579
    iget-object v1, v1, Lc6;->r0:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v1, La08;

    .line 582
    .line 583
    check-cast v1, Lra;

    .line 584
    .line 585
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iget-object v1, v2, Lz47;->Y:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v1, Lc6;

    .line 594
    .line 595
    iget-object v1, v1, Lc6;->q0:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v1, Lwe5;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-eqz v3, :cond_15

    .line 604
    .line 605
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->isAnnotation()Z

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->isInterface()Z

    .line 610
    .line 611
    .line 612
    if-nez v0, :cond_c

    .line 613
    .line 614
    const/4 v9, 0x0

    .line 615
    goto/16 :goto_d

    .line 616
    .line 617
    :cond_c
    iget-object v3, v15, Lz47;->Y:Ljava/lang/Object;

    .line 618
    .line 619
    iget-object v3, v15, Lz47;->g0:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v3, Lf63;

    .line 622
    .line 623
    invoke-static/range {v19 .. v19}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    move-object/from16 v5, v24

    .line 628
    .line 629
    const/4 v6, 0x1

    .line 630
    invoke-static {v5, v7, v6, v4}, Lyj3;->X0(Lsx4;Lsm;ZLhr6;)Lyj3;

    .line 631
    .line 632
    .line 633
    move-result-object v10

    .line 634
    if-eqz v0, :cond_13

    .line 635
    .line 636
    invoke-virtual/range {v19 .. v19}, Lta6;->d()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    new-instance v9, Ljava/util/ArrayList;

    .line 641
    .line 642
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v7, v27

    .line 650
    .line 651
    const/4 v4, 0x6

    .line 652
    const/4 v13, 0x0

    .line 653
    invoke-static {v7, v6, v13, v4}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    new-instance v7, Ljava/util/ArrayList;

    .line 658
    .line 659
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 660
    .line 661
    .line 662
    new-instance v15, Ljava/util/ArrayList;

    .line 663
    .line 664
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 665
    .line 666
    .line 667
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v8

    .line 675
    if-eqz v8, :cond_e

    .line 676
    .line 677
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v8

    .line 681
    move-object v11, v8

    .line 682
    check-cast v11, Lcb6;

    .line 683
    .line 684
    invoke-virtual {v11}, Lbb6;->c()Lv15;

    .line 685
    .line 686
    .line 687
    move-result-object v11

    .line 688
    sget-object v12, Lks3;->b:Lv15;

    .line 689
    .line 690
    invoke-static {v11, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v11

    .line 694
    if-eqz v11, :cond_d

    .line 695
    .line 696
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    goto :goto_6

    .line 700
    :cond_d
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    goto :goto_6

    .line 704
    :cond_e
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 705
    .line 706
    .line 707
    invoke-static {v7}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    move-object v12, v0

    .line 712
    check-cast v12, Lcb6;

    .line 713
    .line 714
    if-eqz v12, :cond_10

    .line 715
    .line 716
    invoke-virtual {v12}, Lcb6;->f()Lgb6;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    instance-of v7, v0, Lna6;

    .line 721
    .line 722
    if-eqz v7, :cond_f

    .line 723
    .line 724
    new-instance v7, Lqg5;

    .line 725
    .line 726
    check-cast v0, Lna6;

    .line 727
    .line 728
    invoke-virtual {v3, v0, v4, v6}, Lf63;->B(Lna6;Lnl3;Z)Lmo8;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    iget-object v0, v0, Lna6;->b:Lgb6;

    .line 733
    .line 734
    invoke-virtual {v3, v0, v4}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-direct {v7, v8, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    goto :goto_7

    .line 742
    :cond_f
    new-instance v7, Lqg5;

    .line 743
    .line 744
    invoke-virtual {v3, v0, v4}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-direct {v7, v0, v13}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    :goto_7
    iget-object v0, v7, Lqg5;->X:Ljava/lang/Object;

    .line 752
    .line 753
    move-object v13, v0

    .line 754
    check-cast v13, Lt14;

    .line 755
    .line 756
    iget-object v0, v7, Lqg5;->Y:Ljava/lang/Object;

    .line 757
    .line 758
    move-object v14, v0

    .line 759
    check-cast v14, Lt14;

    .line 760
    .line 761
    const/4 v11, 0x0

    .line 762
    move-object/from16 v8, v17

    .line 763
    .line 764
    invoke-virtual/range {v8 .. v14}, Lt44;->v(Ljava/util/ArrayList;Lyj3;ILcb6;Lt14;Lt14;)V

    .line 765
    .line 766
    .line 767
    goto :goto_8

    .line 768
    :cond_10
    move-object/from16 v8, v17

    .line 769
    .line 770
    :goto_8
    if-eqz v12, :cond_11

    .line 771
    .line 772
    move v0, v6

    .line 773
    goto :goto_9

    .line 774
    :cond_11
    const/4 v0, 0x0

    .line 775
    :goto_9
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 776
    .line 777
    .line 778
    move-result-object v7

    .line 779
    const/4 v11, 0x0

    .line 780
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 781
    .line 782
    .line 783
    move-result v12

    .line 784
    if-eqz v12, :cond_12

    .line 785
    .line 786
    add-int/lit8 v15, v11, 0x1

    .line 787
    .line 788
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v12

    .line 792
    check-cast v12, Lcb6;

    .line 793
    .line 794
    invoke-virtual {v12}, Lcb6;->f()Lgb6;

    .line 795
    .line 796
    .line 797
    move-result-object v13

    .line 798
    invoke-virtual {v3, v13, v4}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 799
    .line 800
    .line 801
    move-result-object v13

    .line 802
    add-int/2addr v11, v0

    .line 803
    const/4 v14, 0x0

    .line 804
    invoke-virtual/range {v8 .. v14}, Lt44;->v(Ljava/util/ArrayList;Lyj3;ILcb6;Lt14;Lt14;)V

    .line 805
    .line 806
    .line 807
    move v11, v15

    .line 808
    goto :goto_a

    .line 809
    :cond_12
    :goto_b
    const/4 v12, 0x0

    .line 810
    goto :goto_c

    .line 811
    :cond_13
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 812
    .line 813
    goto :goto_b

    .line 814
    :goto_c
    invoke-virtual {v10, v12}, Lyj3;->O0(Z)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v5}, Lsx4;->e()Lfl1;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    sget-object v3, Lek3;->b:Lfl1;

    .line 825
    .line 826
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    if-eqz v3, :cond_14

    .line 831
    .line 832
    sget-object v0, Lek3;->c:Lfl1;

    .line 833
    .line 834
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    :cond_14
    invoke-virtual {v10, v9, v0}, Lgs0;->U0(Ljava/util/List;Lfl1;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v10, v6}, Lyj3;->N0(Z)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v5}, Lsx4;->X()Laa7;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v10, v0}, Ljo2;->P0(Laa7;)V

    .line 848
    .line 849
    .line 850
    move-object v9, v10

    .line 851
    :goto_d
    invoke-static {v9}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    goto :goto_e

    .line 856
    :cond_15
    move-object v5, v0

    .line 857
    :goto_e
    invoke-virtual {v1, v2, v5}, Lwe5;->k(Lz47;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 862
    .line 863
    .line 864
    move-result-object v9

    .line 865
    :goto_f
    return-object v9

    .line 866
    nop

    .line 867
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

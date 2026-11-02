.class public final synthetic Lm30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, Lm30;->X:B

    iput-object p1, p0, Lm30;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq15;Lp15;)V
    .locals 0

    .line 1
    const/4 p2, 0x5

    .line 2
    iput-byte p2, p0, Lm30;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm30;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-byte v2, v0, Lm30;->X:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    sget-object v7, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    iget-object v0, v0, Lm30;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, Ly48;

    .line 19
    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    check-cast v2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    move-object/from16 v3, p2

    .line 29
    .line 30
    check-cast v3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    check-cast v1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget-object v4, v0, Ly48;->s0:Lkd8;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    iget-object v4, v4, Lkd8;->a:Ly68;

    .line 47
    .line 48
    invoke-virtual {v4}, Ly68;->c()Lh48;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v4}, Lkd8;->d()Lh48;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :goto_0
    iget-wide v7, v4, Lh48;->f0:J

    .line 58
    .line 59
    iget-boolean v9, v0, Ly48;->w0:Z

    .line 60
    .line 61
    if-eqz v9, :cond_6

    .line 62
    .line 63
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-ltz v9, :cond_6

    .line 68
    .line 69
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    iget-object v4, v4, Lh48;->Z:Ljava/lang/CharSequence;

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-le v9, v4, :cond_1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_1
    sget v4, Lf88;->c:I

    .line 83
    .line 84
    const/16 v4, 0x20

    .line 85
    .line 86
    shr-long v9, v7, v4

    .line 87
    .line 88
    long-to-int v4, v9

    .line 89
    if-ne v2, v4, :cond_2

    .line 90
    .line 91
    const-wide v9, 0xffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long v6, v7, v9

    .line 97
    .line 98
    long-to-int v4, v6

    .line 99
    if-ne v3, v4, :cond_2

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_2
    invoke-static {v2, v3}, Lct7;->c(II)J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    if-ne v2, v3, :cond_3

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iget-object v2, v0, Ly48;->u0:Lr68;

    .line 112
    .line 113
    sget-object v3, Ls88;->Z:Ls88;

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Lr68;->y(Ls88;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    :goto_1
    iget-object v2, v0, Ly48;->u0:Lr68;

    .line 120
    .line 121
    sget-object v3, Ls88;->X:Ls88;

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Lr68;->y(Ls88;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    iget-object v0, v0, Ly48;->s0:Lkd8;

    .line 127
    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    invoke-virtual {v0, v6, v7}, Lkd8;->k(J)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    invoke-virtual {v0, v6, v7}, Lkd8;->j(J)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    :goto_3
    move v5, v6

    .line 139
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :pswitch_0
    check-cast v0, Lpv3;

    .line 145
    .line 146
    move-object/from16 v2, p1

    .line 147
    .line 148
    check-cast v2, Lfu7;

    .line 149
    .line 150
    move-object/from16 v3, p2

    .line 151
    .line 152
    check-cast v3, Llp2;

    .line 153
    .line 154
    check-cast v1, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    and-int/lit8 v8, v1, 0x6

    .line 164
    .line 165
    if-nez v8, :cond_8

    .line 166
    .line 167
    invoke-virtual {v3, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_7

    .line 172
    .line 173
    const/4 v4, 0x4

    .line 174
    :cond_7
    or-int/2addr v1, v4

    .line 175
    :cond_8
    and-int/lit8 v4, v1, 0x13

    .line 176
    .line 177
    const/16 v8, 0x12

    .line 178
    .line 179
    if-eq v4, v8, :cond_9

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_9
    move v5, v6

    .line 183
    :goto_5
    and-int/lit8 v4, v1, 0x1

    .line 184
    .line 185
    invoke-virtual {v3, v4, v5}, Llp2;->N(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_a

    .line 190
    .line 191
    check-cast v0, Lgn2;

    .line 192
    .line 193
    sget-object v4, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 194
    .line 195
    and-int/lit8 v1, v1, 0xe

    .line 196
    .line 197
    or-int/lit16 v1, v1, 0x180

    .line 198
    .line 199
    invoke-static {v2, v0, v4, v3, v1}, Leu7;->a(Lfu7;Lgn2;Lkx4;Llp2;I)V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_a
    invoke-virtual {v3}, Llp2;->Q()V

    .line 204
    .line 205
    .line 206
    :goto_6
    return-object v7

    .line 207
    :pswitch_1
    check-cast v0, Lwb7;

    .line 208
    .line 209
    move-object/from16 v2, p1

    .line 210
    .line 211
    check-cast v2, Lzr4;

    .line 212
    .line 213
    move-object/from16 v3, p2

    .line 214
    .line 215
    check-cast v3, Ltr4;

    .line 216
    .line 217
    check-cast v1, Lq31;

    .line 218
    .line 219
    iget-wide v5, v1, Lq31;->a:J

    .line 220
    .line 221
    invoke-interface {v3, v5, v6}, Ltr4;->o(J)Leo5;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 226
    .line 227
    invoke-static {v3, v3}, Lkt1;->b(FF)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_c

    .line 232
    .line 233
    iget-object v0, v0, Lwb7;->n0:Lsd5;

    .line 234
    .line 235
    sget-object v3, Lsd5;->X:Lsd5;

    .line 236
    .line 237
    if-ne v0, v3, :cond_b

    .line 238
    .line 239
    iget v0, v1, Leo5;->X:I

    .line 240
    .line 241
    div-int/2addr v0, v4

    .line 242
    goto :goto_7

    .line 243
    :cond_b
    iget v0, v1, Leo5;->Y:I

    .line 244
    .line 245
    div-int/2addr v0, v4

    .line 246
    goto :goto_7

    .line 247
    :cond_c
    invoke-interface {v2, v3}, Lfi1;->x0(F)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    :goto_7
    iget v3, v1, Leo5;->X:I

    .line 252
    .line 253
    iget v4, v1, Leo5;->Y:I

    .line 254
    .line 255
    sget-object v5, Lvb7;->f:Liv8;

    .line 256
    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v5, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    new-instance v5, Ld1;

    .line 269
    .line 270
    const/16 v6, 0xc

    .line 271
    .line 272
    invoke-direct {v5, v1, v6}, Ld1;-><init>(Leo5;B)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v2, v3, v4, v0, v5}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0

    .line 280
    :pswitch_2
    check-cast v0, Lj17;

    .line 281
    .line 282
    move-object/from16 v2, p1

    .line 283
    .line 284
    check-cast v2, Ljava/lang/Throwable;

    .line 285
    .line 286
    move-object/from16 v2, p2

    .line 287
    .line 288
    check-cast v2, Ldn8;

    .line 289
    .line 290
    check-cast v1, Ls61;

    .line 291
    .line 292
    invoke-virtual {v0}, Lj17;->c()V

    .line 293
    .line 294
    .line 295
    return-object v7

    .line 296
    :pswitch_3
    check-cast v0, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;

    .line 297
    .line 298
    move-object/from16 v2, p1

    .line 299
    .line 300
    check-cast v2, Lcom/google/android/material/slider/Slider;

    .line 301
    .line 302
    move-object/from16 v3, p2

    .line 303
    .line 304
    check-cast v3, Ljava/lang/Float;

    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    check-cast v1, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    sget v1, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->U0:I

    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->A()Lcom/tencent/mmkv/MMKV;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    const-string v1, "pref_proxy_ping_timeout"

    .line 325
    .line 326
    float-to-int v2, v3

    .line 327
    invoke-virtual {v0, v2, v1}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 328
    .line 329
    .line 330
    return-object v7

    .line 331
    :pswitch_4
    check-cast v0, Lq15;

    .line 332
    .line 333
    move-object/from16 v2, p1

    .line 334
    .line 335
    check-cast v2, Ljava/lang/Throwable;

    .line 336
    .line 337
    move-object/from16 v2, p2

    .line 338
    .line 339
    check-cast v2, Ldn8;

    .line 340
    .line 341
    check-cast v1, Ls61;

    .line 342
    .line 343
    sget-object v1, Lq15;->k0:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 344
    .line 345
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v3}, Lq15;->m(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object v7

    .line 352
    :pswitch_5
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 353
    .line 354
    move-object/from16 v2, p1

    .line 355
    .line 356
    check-cast v2, Lek;

    .line 357
    .line 358
    move-object/from16 v4, p2

    .line 359
    .line 360
    check-cast v4, Llp2;

    .line 361
    .line 362
    check-cast v1, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    and-int/lit8 v2, v1, 0x11

    .line 372
    .line 373
    const/16 v8, 0x10

    .line 374
    .line 375
    if-eq v2, v8, :cond_d

    .line 376
    .line 377
    move v2, v5

    .line 378
    goto :goto_8

    .line 379
    :cond_d
    move v2, v6

    .line 380
    :goto_8
    and-int/2addr v1, v5

    .line 381
    invoke-virtual {v4, v1, v2}, Llp2;->N(IZ)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_13

    .line 386
    .line 387
    if-eqz v0, :cond_12

    .line 388
    .line 389
    const v1, -0x3a15e844

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4, v1}, Llp2;->W(I)V

    .line 393
    .line 394
    .line 395
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 396
    .line 397
    new-instance v2, Lft;

    .line 398
    .line 399
    new-instance v8, Lbt;

    .line 400
    .line 401
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 402
    .line 403
    .line 404
    const/high16 v9, 0x41000000    # 8.0f

    .line 405
    .line 406
    invoke-direct {v2, v9, v8}, Lft;-><init>(FLbt;)V

    .line 407
    .line 408
    .line 409
    sget-object v8, Lpz2;->n0:Lo50;

    .line 410
    .line 411
    const/4 v9, 0x6

    .line 412
    invoke-static {v2, v8, v4, v9}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    iget-wide v8, v4, Llp2;->T:J

    .line 417
    .line 418
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    invoke-virtual {v4}, Llp2;->l()Lkl5;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    invoke-static {v4, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    sget-object v10, Luz0;->j:Lpz2;

    .line 431
    .line 432
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v4}, Llp2;->Z()V

    .line 436
    .line 437
    .line 438
    iget-boolean v10, v4, Llp2;->S:Z

    .line 439
    .line 440
    if-eqz v10, :cond_e

    .line 441
    .line 442
    invoke-virtual {v4}, Llp2;->k()V

    .line 443
    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_e
    invoke-virtual {v4}, Llp2;->j0()V

    .line 447
    .line 448
    .line 449
    :goto_9
    sget-object v10, Lpz2;->B0:Ldx0;

    .line 450
    .line 451
    invoke-static {v10, v4, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 455
    .line 456
    invoke-static {v2, v4, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    sget-object v8, Lpz2;->C0:Ldx0;

    .line 464
    .line 465
    invoke-static {v8, v4, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    invoke-static {v4}, Lpn7;->l(Llp2;)V

    .line 469
    .line 470
    .line 471
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 472
    .line 473
    invoke-static {v2, v4, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    invoke-static {}, Lxq6;->a()Lkx4;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->c()J

    .line 481
    .line 482
    .line 483
    move-result-wide v1

    .line 484
    invoke-static {v1, v2}, Lx79;->g(J)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->e()Ljava/lang/Long;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    if-eqz v2, :cond_f

    .line 493
    .line 494
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 495
    .line 496
    .line 497
    move-result-wide v2

    .line 498
    invoke-static {v2, v3}, Lx79;->g(J)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    :cond_f
    if-nez v3, :cond_10

    .line 503
    .line 504
    const v2, -0x6ddf440f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v4, v2}, Llp2;->W(I)V

    .line 508
    .line 509
    .line 510
    sget v2, Ly46;->unknown:I

    .line 511
    .line 512
    invoke-static {v2, v4}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    :goto_a
    invoke-virtual {v4, v6}, Llp2;->p(Z)V

    .line 517
    .line 518
    .line 519
    goto :goto_b

    .line 520
    :cond_10
    const v2, -0x6ddf4e1c

    .line 521
    .line 522
    .line 523
    invoke-virtual {v4, v2}, Llp2;->W(I)V

    .line 524
    .line 525
    .line 526
    goto :goto_a

    .line 527
    :goto_b
    const-string v2, " / "

    .line 528
    .line 529
    invoke-static {v1, v2, v3}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    sget-object v1, Les;->a:Lox1;

    .line 534
    .line 535
    invoke-virtual {v4, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    check-cast v2, Lds;

    .line 540
    .line 541
    iget-object v10, v2, Lds;->d:Lo88;

    .line 542
    .line 543
    sget-object v2, Lep;->z:Lox1;

    .line 544
    .line 545
    invoke-virtual {v4, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    check-cast v3, Ldp;

    .line 550
    .line 551
    iget-object v3, v3, Ldp;->c:Lxr;

    .line 552
    .line 553
    iget-wide v11, v3, Lxr;->c:J

    .line 554
    .line 555
    const/16 v21, 0x0

    .line 556
    .line 557
    const v22, 0xfffffe

    .line 558
    .line 559
    .line 560
    const-wide/16 v13, 0x0

    .line 561
    .line 562
    const/4 v15, 0x0

    .line 563
    const/16 v16, 0x0

    .line 564
    .line 565
    const-wide/16 v17, 0x0

    .line 566
    .line 567
    const-wide/16 v19, 0x0

    .line 568
    .line 569
    invoke-static/range {v10 .. v22}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 570
    .line 571
    .line 572
    move-result-object v10

    .line 573
    const/high16 v18, 0x30000

    .line 574
    .line 575
    const/16 v19, 0x1d0

    .line 576
    .line 577
    const/4 v11, 0x5

    .line 578
    const/4 v12, 0x0

    .line 579
    const/4 v13, 0x1

    .line 580
    const/4 v14, 0x0

    .line 581
    const/4 v15, 0x0

    .line 582
    move-object/from16 v17, v4

    .line 583
    .line 584
    invoke-static/range {v8 .. v19}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 585
    .line 586
    .line 587
    move-object/from16 v3, v17

    .line 588
    .line 589
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->d()Ljava/lang/Integer;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    if-eqz v4, :cond_11

    .line 594
    .line 595
    const v4, -0x4e04833c

    .line 596
    .line 597
    .line 598
    invoke-virtual {v3, v4}, Llp2;->W(I)V

    .line 599
    .line 600
    .line 601
    invoke-static {}, Lxq6;->a()Lkx4;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->d()Ljava/lang/Integer;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    new-instance v4, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    const-string v0, "%"

    .line 618
    .line 619
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    invoke-virtual {v3, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    check-cast v0, Lds;

    .line 631
    .line 632
    iget-object v10, v0, Lds;->d:Lo88;

    .line 633
    .line 634
    invoke-virtual {v3, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    check-cast v0, Ldp;

    .line 639
    .line 640
    iget-object v0, v0, Ldp;->c:Lxr;

    .line 641
    .line 642
    iget-wide v11, v0, Lxr;->c:J

    .line 643
    .line 644
    const/16 v21, 0x0

    .line 645
    .line 646
    const v22, 0xfffffe

    .line 647
    .line 648
    .line 649
    const-wide/16 v13, 0x0

    .line 650
    .line 651
    const/4 v15, 0x0

    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    const-wide/16 v17, 0x0

    .line 655
    .line 656
    const-wide/16 v19, 0x0

    .line 657
    .line 658
    invoke-static/range {v10 .. v22}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 659
    .line 660
    .line 661
    move-result-object v10

    .line 662
    const/high16 v18, 0x30000

    .line 663
    .line 664
    const/16 v19, 0x1d0

    .line 665
    .line 666
    const/4 v11, 0x6

    .line 667
    const/4 v12, 0x0

    .line 668
    const/4 v13, 0x1

    .line 669
    const/4 v14, 0x0

    .line 670
    const/4 v15, 0x0

    .line 671
    move-object/from16 v17, v3

    .line 672
    .line 673
    invoke-static/range {v8 .. v19}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v3, v6}, Llp2;->p(Z)V

    .line 677
    .line 678
    .line 679
    goto :goto_c

    .line 680
    :cond_11
    const v0, -0x4dfde38f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v3, v6}, Llp2;->p(Z)V

    .line 687
    .line 688
    .line 689
    :goto_c
    invoke-virtual {v3, v5}, Llp2;->p(Z)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v3, v6}, Llp2;->p(Z)V

    .line 693
    .line 694
    .line 695
    goto :goto_d

    .line 696
    :cond_12
    move-object v3, v4

    .line 697
    const v0, -0x3a02588e

    .line 698
    .line 699
    .line 700
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v3, v6}, Llp2;->p(Z)V

    .line 704
    .line 705
    .line 706
    goto :goto_d

    .line 707
    :cond_13
    move-object v3, v4

    .line 708
    invoke-virtual {v3}, Llp2;->Q()V

    .line 709
    .line 710
    .line 711
    :goto_d
    return-object v7

    .line 712
    :pswitch_6
    check-cast v0, Lgn2;

    .line 713
    .line 714
    move-object/from16 v2, p1

    .line 715
    .line 716
    check-cast v2, Lhq5;

    .line 717
    .line 718
    move-object/from16 v2, p2

    .line 719
    .line 720
    check-cast v2, Lhq5;

    .line 721
    .line 722
    check-cast v1, Lz85;

    .line 723
    .line 724
    iget-wide v1, v2, Lhq5;->c:J

    .line 725
    .line 726
    new-instance v3, Lz85;

    .line 727
    .line 728
    invoke-direct {v3, v1, v2}, Lz85;-><init>(J)V

    .line 729
    .line 730
    .line 731
    invoke-interface {v0, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    return-object v7

    .line 735
    :pswitch_7
    check-cast v0, Lvj2;

    .line 736
    .line 737
    move-object/from16 v2, p1

    .line 738
    .line 739
    check-cast v2, Ljava/lang/Throwable;

    .line 740
    .line 741
    check-cast v1, Ls61;

    .line 742
    .line 743
    invoke-virtual {v0, v2}, Lvj2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    return-object v7

    .line 747
    :pswitch_8
    check-cast v0, Lx90;

    .line 748
    .line 749
    move-object/from16 v2, p1

    .line 750
    .line 751
    check-cast v2, Ltz6;

    .line 752
    .line 753
    new-instance v3, Lp90;

    .line 754
    .line 755
    invoke-direct {v3, v1, v0, v2, v6}, Lp90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 756
    .line 757
    .line 758
    return-object v3

    .line 759
    :pswitch_9
    check-cast v0, Ly78;

    .line 760
    .line 761
    move-object/from16 v2, p1

    .line 762
    .line 763
    check-cast v2, Lzr4;

    .line 764
    .line 765
    move-object/from16 v3, p2

    .line 766
    .line 767
    check-cast v3, Ltr4;

    .line 768
    .line 769
    check-cast v1, Lq31;

    .line 770
    .line 771
    iget-object v0, v0, Ly78;->f:Lrh5;

    .line 772
    .line 773
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, Lkt1;

    .line 778
    .line 779
    iget v0, v0, Lkt1;->X:F

    .line 780
    .line 781
    invoke-interface {v2, v0}, Lfi1;->x0(F)I

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    iget-wide v7, v1, Lq31;->a:J

    .line 786
    .line 787
    const/4 v1, 0x0

    .line 788
    invoke-static {v0, v1}, Lkt1;->b(FF)Z

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    const v1, 0x7fffffff

    .line 793
    .line 794
    .line 795
    if-eqz v0, :cond_14

    .line 796
    .line 797
    move v0, v1

    .line 798
    goto :goto_e

    .line 799
    :cond_14
    move v0, v5

    .line 800
    :goto_e
    invoke-static {v6, v1, v5, v0}, Ls31;->a(IIII)J

    .line 801
    .line 802
    .line 803
    move-result-wide v0

    .line 804
    invoke-static {v7, v8, v0, v1}, Ls31;->e(JJ)J

    .line 805
    .line 806
    .line 807
    move-result-wide v0

    .line 808
    invoke-interface {v3, v0, v1}, Ltr4;->o(J)Leo5;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    iget v1, v0, Leo5;->X:I

    .line 813
    .line 814
    iget v3, v0, Leo5;->Y:I

    .line 815
    .line 816
    new-instance v5, Ld1;

    .line 817
    .line 818
    invoke-direct {v5, v0, v4}, Ld1;-><init>(Leo5;B)V

    .line 819
    .line 820
    .line 821
    sget-object v0, Le02;->X:Le02;

    .line 822
    .line 823
    invoke-interface {v2, v1, v3, v0, v5}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    return-object v0

    .line 828
    nop

    .line 829
    :pswitch_data_0
    .packed-switch 0x0
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

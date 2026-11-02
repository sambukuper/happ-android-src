.class public final synthetic Lb58;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Lb58;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Loi8;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput-byte p1, p0, Lb58;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, Lb58;->X:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "z"

    .line 7
    .line 8
    const-string v3, "Z"

    .line 9
    .line 10
    const/16 v4, 0x3a

    .line 11
    .line 12
    const-wide v5, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/16 v7, 0x20

    .line 18
    .line 19
    const-string v8, ""

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    sget-object v10, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, Ltk;

    .line 30
    .line 31
    iget v1, v0, Ltk;->a:F

    .line 32
    .line 33
    iget v0, v0, Ltk;->b:F

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-long v1, v1

    .line 40
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-long v3, v0

    .line 45
    shl-long v0, v1, v7

    .line 46
    .line 47
    and-long v2, v3, v5

    .line 48
    .line 49
    or-long/2addr v0, v2

    .line 50
    new-instance v2, Lmt1;

    .line 51
    .line 52
    invoke-direct {v2, v0, v1}, Lmt1;-><init>(J)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :pswitch_0
    move-object/from16 v0, p1

    .line 57
    .line 58
    check-cast v0, Lmt1;

    .line 59
    .line 60
    new-instance v1, Ltk;

    .line 61
    .line 62
    iget-wide v2, v0, Lmt1;->a:J

    .line 63
    .line 64
    shr-long/2addr v2, v7

    .line 65
    long-to-int v2, v2

    .line 66
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget-wide v3, v0, Lmt1;->a:J

    .line 71
    .line 72
    and-long/2addr v3, v5

    .line 73
    long-to-int v0, v3

    .line 74
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-direct {v1, v2, v0}, Ltk;-><init>(FF)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_1
    move-object/from16 v0, p1

    .line 83
    .line 84
    check-cast v0, Lsk;

    .line 85
    .line 86
    iget v0, v0, Lsk;->a:F

    .line 87
    .line 88
    new-instance v1, Lkt1;

    .line 89
    .line 90
    invoke-direct {v1, v0}, Lkt1;-><init>(F)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :pswitch_2
    move-object/from16 v0, p1

    .line 95
    .line 96
    check-cast v0, Lkt1;

    .line 97
    .line 98
    new-instance v1, Lsk;

    .line 99
    .line 100
    iget v0, v0, Lkt1;->X:F

    .line 101
    .line 102
    invoke-direct {v1, v0}, Lsk;-><init>(F)V

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :pswitch_3
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, Lsk;

    .line 109
    .line 110
    iget v0, v0, Lsk;->a:F

    .line 111
    .line 112
    float-to-int v0, v0

    .line 113
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :pswitch_4
    move-object/from16 v0, p1

    .line 119
    .line 120
    check-cast v0, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    new-instance v1, Lsk;

    .line 127
    .line 128
    int-to-float v0, v0

    .line 129
    invoke-direct {v1, v0}, Lsk;-><init>(F)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :pswitch_5
    move-object/from16 v0, p1

    .line 134
    .line 135
    check-cast v0, Ljava/lang/Float;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    new-instance v1, Lsk;

    .line 142
    .line 143
    invoke-direct {v1, v0}, Lsk;-><init>(F)V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :pswitch_6
    move-object/from16 v0, p1

    .line 148
    .line 149
    check-cast v0, Ldo5;

    .line 150
    .line 151
    return-object v10

    .line 152
    :pswitch_7
    move-object/from16 v0, p1

    .line 153
    .line 154
    check-cast v0, Ljava/net/InetAddress;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    xor-int/2addr v0, v9

    .line 161
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    return-object v0

    .line 166
    :pswitch_8
    move-object/from16 v0, p1

    .line 167
    .line 168
    check-cast v0, Lwr8;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const/16 v1, 0x7a

    .line 174
    .line 175
    invoke-static {v0, v1}, Lz68;->t(Lcc1;C)V

    .line 176
    .line 177
    .line 178
    return-object v10

    .line 179
    :pswitch_9
    move-object/from16 v0, p1

    .line 180
    .line 181
    check-cast v0, Lwr8;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {v0}, Lwr8;->p(Lwr8;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v4}, Lz68;->t(Lcc1;C)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Lwr8;->q(Lwr8;)V

    .line 193
    .line 194
    .line 195
    new-instance v1, Lb58;

    .line 196
    .line 197
    const/16 v2, 0xd

    .line 198
    .line 199
    invoke-direct {v1, v2}, Lb58;-><init>(B)V

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v8, v1}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 203
    .line 204
    .line 205
    return-object v10

    .line 206
    :pswitch_a
    move-object/from16 v0, p1

    .line 207
    .line 208
    check-cast v0, Lwr8;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v1, Lb58;

    .line 214
    .line 215
    const/16 v2, 0xb

    .line 216
    .line 217
    invoke-direct {v1, v2}, Lb58;-><init>(B)V

    .line 218
    .line 219
    .line 220
    invoke-static {v0, v3, v1}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 221
    .line 222
    .line 223
    return-object v10

    .line 224
    :pswitch_b
    move-object/from16 v0, p1

    .line 225
    .line 226
    check-cast v0, Lwr8;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-interface {v0, v2}, Lcc1;->a(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object v10

    .line 235
    :pswitch_c
    move-object/from16 v0, p1

    .line 236
    .line 237
    check-cast v0, Lwr8;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    new-instance v1, Lb58;

    .line 243
    .line 244
    const/16 v2, 0x13

    .line 245
    .line 246
    invoke-direct {v1, v2}, Lb58;-><init>(B)V

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v3, v1}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 250
    .line 251
    .line 252
    return-object v10

    .line 253
    :pswitch_d
    move-object/from16 v0, p1

    .line 254
    .line 255
    check-cast v0, Lwr8;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-interface {v0, v2}, Lcc1;->a(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    return-object v10

    .line 264
    :pswitch_e
    move-object/from16 v0, p1

    .line 265
    .line 266
    check-cast v0, Lwr8;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {v0}, Lwr8;->r(Lwr8;)V

    .line 272
    .line 273
    .line 274
    return-object v10

    .line 275
    :pswitch_f
    move-object/from16 v0, p1

    .line 276
    .line 277
    check-cast v0, Lwr8;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v0, v4}, Lz68;->t(Lcc1;C)V

    .line 283
    .line 284
    .line 285
    invoke-static {v0}, Lwr8;->r(Lwr8;)V

    .line 286
    .line 287
    .line 288
    return-object v10

    .line 289
    :pswitch_10
    move-object/from16 v0, p1

    .line 290
    .line 291
    check-cast v0, Lwr8;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {v0}, Lwr8;->q(Lwr8;)V

    .line 297
    .line 298
    .line 299
    new-instance v1, Lb58;

    .line 300
    .line 301
    const/16 v2, 0xe

    .line 302
    .line 303
    invoke-direct {v1, v2}, Lb58;-><init>(B)V

    .line 304
    .line 305
    .line 306
    invoke-static {v0, v8, v1}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 307
    .line 308
    .line 309
    return-object v10

    .line 310
    :pswitch_11
    move-object/from16 v0, p1

    .line 311
    .line 312
    check-cast v0, Lwr8;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-static {v0}, Lwr8;->p(Lwr8;)V

    .line 318
    .line 319
    .line 320
    new-instance v1, Lb58;

    .line 321
    .line 322
    const/16 v2, 0xc

    .line 323
    .line 324
    invoke-direct {v1, v2}, Lb58;-><init>(B)V

    .line 325
    .line 326
    .line 327
    invoke-static {v0, v8, v1}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 328
    .line 329
    .line 330
    return-object v10

    .line 331
    :pswitch_12
    move-object/from16 v0, p1

    .line 332
    .line 333
    check-cast v0, Lhq8;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    iget-object v0, v0, Lhq8;->h:Ler8;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_13
    move-object/from16 v0, p1

    .line 342
    .line 343
    check-cast v0, Lcc1;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    return-object v10

    .line 349
    :pswitch_14
    move-object/from16 v0, p1

    .line 350
    .line 351
    check-cast v0, Luw3;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v1, v0, Luw3;->a:Lyw3;

    .line 357
    .line 358
    if-nez v1, :cond_0

    .line 359
    .line 360
    const-string v0, "*"

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :cond_0
    iget-object v0, v0, Luw3;->b:Lpw3;

    .line 364
    .line 365
    instance-of v2, v0, Loi8;

    .line 366
    .line 367
    const/4 v3, 0x0

    .line 368
    if-eqz v2, :cond_1

    .line 369
    .line 370
    move-object v2, v0

    .line 371
    check-cast v2, Loi8;

    .line 372
    .line 373
    goto :goto_0

    .line 374
    :cond_1
    move-object v2, v3

    .line 375
    :goto_0
    if-eqz v2, :cond_2

    .line 376
    .line 377
    invoke-virtual {v2, v9}, Loi8;->f(Z)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    goto :goto_1

    .line 382
    :cond_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_5

    .line 391
    .line 392
    if-eq v1, v9, :cond_4

    .line 393
    .line 394
    const/4 v2, 0x2

    .line 395
    if-ne v1, v2, :cond_3

    .line 396
    .line 397
    const-string v1, "out "

    .line 398
    .line 399
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    goto :goto_2

    .line 404
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 405
    .line 406
    .line 407
    move-object v0, v3

    .line 408
    goto :goto_2

    .line 409
    :cond_4
    const-string v1, "in "

    .line 410
    .line 411
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    :cond_5
    :goto_2
    return-object v0

    .line 416
    :pswitch_15
    move-object/from16 v0, p1

    .line 417
    .line 418
    check-cast v0, Lxr6;

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    new-instance v2, Lo57;

    .line 424
    .line 425
    invoke-direct {v2}, Lo57;-><init>()V

    .line 426
    .line 427
    .line 428
    :goto_3
    invoke-interface {v0}, Lxr6;->S0()Z

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    if-eqz v3, :cond_6

    .line 433
    .line 434
    invoke-interface {v0, v1}, Lxr6;->getLong(I)J

    .line 435
    .line 436
    .line 437
    move-result-wide v3

    .line 438
    long-to-int v3, v3

    .line 439
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-virtual {v2, v3}, Lo57;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_6
    invoke-static {v2}, Lw45;->m(Lo57;)Lo57;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    return-object v0

    .line 452
    :pswitch_16
    move-object/from16 v0, p1

    .line 453
    .line 454
    check-cast v0, Lxr6;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    invoke-interface {v0}, Lxr6;->S0()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_17
    move-object/from16 v0, p1

    .line 469
    .line 470
    check-cast v0, Ltj6;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    return-object v10

    .line 476
    :pswitch_18
    move-object/from16 v0, p1

    .line 477
    .line 478
    check-cast v0, Lf17;

    .line 479
    .line 480
    sget-object v1, Lc17;->B:Le17;

    .line 481
    .line 482
    invoke-interface {v0, v1, v10}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    return-object v10

    .line 486
    :pswitch_19
    move-object/from16 v0, p1

    .line 487
    .line 488
    check-cast v0, Lpl;

    .line 489
    .line 490
    iget-object v1, v0, Lpl;->a:Ljava/lang/Object;

    .line 491
    .line 492
    instance-of v2, v1, Lpa4;

    .line 493
    .line 494
    if-eqz v2, :cond_a

    .line 495
    .line 496
    check-cast v1, Lpa4;

    .line 497
    .line 498
    invoke-virtual {v1}, Lpa4;->a()Lc88;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-eqz v1, :cond_a

    .line 503
    .line 504
    iget-object v2, v1, Lc88;->a:Lqe7;

    .line 505
    .line 506
    if-nez v2, :cond_7

    .line 507
    .line 508
    iget-object v2, v1, Lc88;->b:Lqe7;

    .line 509
    .line 510
    if-nez v2, :cond_7

    .line 511
    .line 512
    iget-object v2, v1, Lc88;->c:Lqe7;

    .line 513
    .line 514
    if-nez v2, :cond_7

    .line 515
    .line 516
    iget-object v1, v1, Lc88;->d:Lqe7;

    .line 517
    .line 518
    if-nez v1, :cond_7

    .line 519
    .line 520
    goto :goto_4

    .line 521
    :cond_7
    new-instance v1, Lpl;

    .line 522
    .line 523
    iget-object v2, v0, Lpl;->a:Ljava/lang/Object;

    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    check-cast v2, Lpa4;

    .line 529
    .line 530
    invoke-virtual {v2}, Lpa4;->a()Lc88;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    if-eqz v2, :cond_8

    .line 535
    .line 536
    iget-object v2, v2, Lc88;->a:Lqe7;

    .line 537
    .line 538
    if-nez v2, :cond_9

    .line 539
    .line 540
    :cond_8
    new-instance v3, Lqe7;

    .line 541
    .line 542
    const/16 v21, 0x0

    .line 543
    .line 544
    const v22, 0xffff

    .line 545
    .line 546
    .line 547
    const-wide/16 v4, 0x0

    .line 548
    .line 549
    const-wide/16 v6, 0x0

    .line 550
    .line 551
    const/4 v8, 0x0

    .line 552
    const/4 v9, 0x0

    .line 553
    const/4 v10, 0x0

    .line 554
    const/4 v11, 0x0

    .line 555
    const/4 v12, 0x0

    .line 556
    const-wide/16 v13, 0x0

    .line 557
    .line 558
    const/4 v15, 0x0

    .line 559
    const/16 v16, 0x0

    .line 560
    .line 561
    const/16 v17, 0x0

    .line 562
    .line 563
    const-wide/16 v18, 0x0

    .line 564
    .line 565
    const/16 v20, 0x0

    .line 566
    .line 567
    invoke-direct/range {v3 .. v22}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    .line 568
    .line 569
    .line 570
    move-object v2, v3

    .line 571
    :cond_9
    iget v3, v0, Lpl;->b:I

    .line 572
    .line 573
    iget v4, v0, Lpl;->c:I

    .line 574
    .line 575
    invoke-direct {v1, v3, v4, v2}, Lpl;-><init>(IILjava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    filled-new-array {v0, v1}, [Lpl;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    goto :goto_5

    .line 587
    :cond_a
    :goto_4
    filled-new-array {v0}, [Lpl;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    :goto_5
    return-object v0

    .line 596
    :pswitch_1a
    move-object/from16 v0, p1

    .line 597
    .line 598
    check-cast v0, Lx78;

    .line 599
    .line 600
    return-object v10

    .line 601
    :pswitch_1b
    move-object/from16 v0, p1

    .line 602
    .line 603
    check-cast v0, Ls86;

    .line 604
    .line 605
    if-nez v0, :cond_b

    .line 606
    .line 607
    move v1, v9

    .line 608
    :cond_b
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    return-object v0

    .line 613
    :pswitch_1c
    move-object/from16 v0, p1

    .line 614
    .line 615
    check-cast v0, Ljava/lang/Integer;

    .line 616
    .line 617
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 618
    .line 619
    .line 620
    sget-object v0, Lc58;->a:Ljava/lang/String;

    .line 621
    .line 622
    return-object v0

    .line 623
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

.class public final Let8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lwd0;


# instance fields
.field public final a:Lwd0;

.field public final b:Z

.field public final c:Lzv7;


# direct methods
.method public constructor <init>(Lwd0;Lkb6;Ljava/util/List;Z)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Let8;->a:Lwd0;

    .line 5
    .line 6
    iput-boolean p4, p0, Let8;->b:Z

    .line 7
    .line 8
    invoke-interface {p2}, Lxu3;->j()Lpw3;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    instance-of v0, p2, Lnb6;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    move-object v3, p2

    .line 19
    check-cast v3, Lnb6;

    .line 20
    .line 21
    invoke-interface {v3}, Lpv3;->h()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-static {p4}, Lms8;->s(Lpw3;)Lpw3;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, La28;->n(Lpw3;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-ne v3, v2, :cond_1

    .line 38
    .line 39
    :cond_0
    move-object v3, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p4}, La28;->v(Lpw3;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    if-eqz p4, :cond_0

    .line 46
    .line 47
    :try_start_0
    const-string v3, "box-impl"

    .line 48
    .line 49
    invoke-static {p4, p2}, La28;->f(Ljava/lang/Class;Lkb6;)Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {p4, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    const-string p0, "No box method found in inline class: "

    .line 70
    .line 71
    const-string p1, " (calling "

    .line 72
    .line 73
    invoke-static {p0, p4, p1, p2}, Lom0;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :goto_0
    instance-of p4, p2, Lhw3;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    if-eqz p4, :cond_2

    .line 81
    .line 82
    move-object p4, p2

    .line 83
    check-cast p4, Lhw3;

    .line 84
    .line 85
    invoke-interface {p4}, Lgw3;->f()Lnw3;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast p4, Lpb6;

    .line 93
    .line 94
    invoke-static {p4}, La28;->o(Lpb6;)Z

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    if-eqz p4, :cond_2

    .line 99
    .line 100
    new-instance p1, Lzv7;

    .line 101
    .line 102
    sget-object p2, Lkf3;->f0:Lkf3;

    .line 103
    .line 104
    new-array p3, v4, [Ljava/lang/reflect/Method;

    .line 105
    .line 106
    invoke-direct {p1, p2, p3, v3}, Lzv7;-><init>(Lkf3;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_12

    .line 110
    .line 111
    :cond_2
    instance-of p4, p1, Lle0;

    .line 112
    .line 113
    sget-object v5, Lfw3;->X:Lfw3;

    .line 114
    .line 115
    const/4 v6, -0x1

    .line 116
    if-eqz p4, :cond_3

    .line 117
    .line 118
    move-object p4, p1

    .line 119
    check-cast p4, Lle0;

    .line 120
    .line 121
    iget-boolean p4, p4, Lle0;->f:Z

    .line 122
    .line 123
    if-nez p4, :cond_3

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_3
    invoke-static {p2}, Lmb6;->L(Lkb6;)Z

    .line 127
    .line 128
    .line 129
    move-result p4

    .line 130
    if-eqz p4, :cond_5

    .line 131
    .line 132
    instance-of p1, p1, Ly70;

    .line 133
    .line 134
    if-eqz p1, :cond_4

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    :goto_1
    move v6, v4

    .line 138
    goto :goto_4

    .line 139
    :cond_5
    invoke-interface {p2}, Lxu3;->g()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result p4

    .line 149
    if-eqz p4, :cond_6

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    if-eqz p4, :cond_4

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p4

    .line 166
    check-cast p4, Lob6;

    .line 167
    .line 168
    invoke-virtual {p4}, Lob6;->x()Lfw3;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    if-ne p4, v5, :cond_7

    .line 173
    .line 174
    invoke-interface {p2}, Lkb6;->D()Lov3;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    instance-of p4, p1, Lev3;

    .line 179
    .line 180
    if-eqz p4, :cond_8

    .line 181
    .line 182
    check-cast p1, Lev3;

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    move-object p1, v1

    .line 186
    :goto_2
    if-eqz p1, :cond_a

    .line 187
    .line 188
    invoke-virtual {p1}, Lev3;->C()Z

    .line 189
    .line 190
    .line 191
    move-result p4

    .line 192
    if-eqz p4, :cond_a

    .line 193
    .line 194
    invoke-virtual {p1}, Lev3;->i0()Lyy3;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-eqz p1, :cond_9

    .line 199
    .line 200
    iget-object p1, p1, Lyy3;->m:Ljava/lang/String;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_9
    move-object p1, v1

    .line 204
    :goto_3
    if-eqz p1, :cond_a

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_a
    move v6, v2

    .line 208
    :goto_4
    iget-object p1, p0, Let8;->a:Lwd0;

    .line 209
    .line 210
    invoke-interface {p1}, Lwd0;->b()Ljava/lang/reflect/Member;

    .line 211
    .line 212
    .line 213
    new-instance p1, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-interface {p2}, Lkb6;->D()Lov3;

    .line 219
    .line 220
    .line 221
    move-result-object p4

    .line 222
    invoke-static {p2}, Lmb6;->L(Lkb6;)Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-nez v7, :cond_b

    .line 227
    .line 228
    instance-of v7, p4, Lzu3;

    .line 229
    .line 230
    if-eqz v7, :cond_b

    .line 231
    .line 232
    move-object v7, p4

    .line 233
    check-cast v7, Lzu3;

    .line 234
    .line 235
    invoke-interface {v7}, Lzu3;->C()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_b

    .line 240
    .line 241
    invoke-static {v7}, Lu15;->j(Lzu3;)Lu1;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    :cond_b
    invoke-static {p2}, Lmb6;->L(Lkb6;)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_d

    .line 253
    .line 254
    instance-of v7, p4, Lzu3;

    .line 255
    .line 256
    if-eqz v7, :cond_c

    .line 257
    .line 258
    check-cast p4, Lzu3;

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_c
    move-object p4, v1

    .line 262
    :goto_5
    if-eqz p4, :cond_d

    .line 263
    .line 264
    invoke-interface {p4}, Lzu3;->n()Z

    .line 265
    .line 266
    .line 267
    move-result p4

    .line 268
    if-ne p4, v2, :cond_d

    .line 269
    .line 270
    move p4, v2

    .line 271
    goto :goto_6

    .line 272
    :cond_d
    move p4, v4

    .line 273
    :goto_6
    invoke-interface {p2}, Lkb6;->l()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    :cond_e
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    if-eqz v8, :cond_10

    .line 286
    .line 287
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    check-cast v8, Lob6;

    .line 292
    .line 293
    invoke-virtual {v8}, Lob6;->x()Lfw3;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    if-ne v9, v5, :cond_f

    .line 298
    .line 299
    if-eqz p4, :cond_e

    .line 300
    .line 301
    :cond_f
    invoke-virtual {v8}, Lob6;->B()Lpw3;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_10
    invoke-interface {p2}, Lkb6;->l()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object p4

    .line 313
    if-eqz p4, :cond_11

    .line 314
    .line 315
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-eqz v5, :cond_11

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_11
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object p4

    .line 326
    :cond_12
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-eqz v5, :cond_13

    .line 331
    .line 332
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    check-cast v5, Lob6;

    .line 337
    .line 338
    invoke-virtual {v5}, Lob6;->x()Lfw3;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    sget-object v7, Lfw3;->Z:Lfw3;

    .line 343
    .line 344
    if-ne v5, v7, :cond_12

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 347
    .line 348
    .line 349
    move-result p4

    .line 350
    sub-int/2addr p4, v2

    .line 351
    goto :goto_9

    .line 352
    :cond_13
    :goto_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result p4

    .line 356
    :goto_9
    iget-object v5, p0, Let8;->a:Lwd0;

    .line 357
    .line 358
    invoke-interface {v5}, Lwd0;->a()Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    if-eqz v5, :cond_14

    .line 363
    .line 364
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    if-eqz v7, :cond_14

    .line 369
    .line 370
    move v7, v4

    .line 371
    goto :goto_b

    .line 372
    :cond_14
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    move v7, v4

    .line 377
    :cond_15
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v8

    .line 381
    if-eqz v8, :cond_17

    .line 382
    .line 383
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    check-cast v8, Ljava/lang/reflect/Type;

    .line 388
    .line 389
    instance-of v9, v8, Ljava/lang/Class;

    .line 390
    .line 391
    if-eqz v9, :cond_15

    .line 392
    .line 393
    check-cast v8, Ljava/lang/Class;

    .line 394
    .line 395
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    sget-object v9, Lnu3;->a:Lfk2;

    .line 400
    .line 401
    iget-object v9, v9, Lfk2;->a:Lgk2;

    .line 402
    .line 403
    iget-object v9, v9, Lgk2;->a:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    if-eqz v8, :cond_15

    .line 410
    .line 411
    add-int/lit8 v7, v7, 0x1

    .line 412
    .line 413
    if-ltz v7, :cond_16

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_16
    invoke-static {}, Li21;->W()V

    .line 417
    .line 418
    .line 419
    throw v1

    .line 420
    :cond_17
    :goto_b
    iget-boolean v5, p0, Let8;->b:Z

    .line 421
    .line 422
    if-eqz v5, :cond_18

    .line 423
    .line 424
    add-int/2addr p4, v7

    .line 425
    add-int/lit8 p4, p4, 0x1f

    .line 426
    .line 427
    div-int/lit8 p4, p4, 0x20

    .line 428
    .line 429
    add-int/2addr p4, v2

    .line 430
    goto :goto_c

    .line 431
    :cond_18
    move p4, v4

    .line 432
    :goto_c
    if-eqz v0, :cond_19

    .line 433
    .line 434
    move-object v0, p2

    .line 435
    check-cast v0, Lnb6;

    .line 436
    .line 437
    invoke-interface {v0}, Lpv3;->h()Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_19

    .line 442
    .line 443
    move v0, v2

    .line 444
    goto :goto_d

    .line 445
    :cond_19
    move v0, v4

    .line 446
    :goto_d
    add-int/2addr p4, v0

    .line 447
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    add-int/2addr v0, v6

    .line 452
    add-int/2addr v0, p4

    .line 453
    add-int/2addr v0, v7

    .line 454
    iget-boolean p4, p0, Let8;->b:Z

    .line 455
    .line 456
    invoke-virtual {p0}, Let8;->a()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-ne v5, v0, :cond_1f

    .line 465
    .line 466
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    .line 467
    .line 468
    .line 469
    move-result p4

    .line 470
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 471
    .line 472
    .line 473
    move-result v5

    .line 474
    add-int/2addr v5, v6

    .line 475
    invoke-static {p4, v5}, Lx97;->a0(II)Lkf3;

    .line 476
    .line 477
    .line 478
    move-result-object p4

    .line 479
    new-array v5, v0, [Ljava/lang/reflect/Method;

    .line 480
    .line 481
    move v7, v4

    .line 482
    :goto_e
    if-ge v7, v0, :cond_1b

    .line 483
    .line 484
    iget v8, p4, Lif3;->X:I

    .line 485
    .line 486
    iget v9, p4, Lif3;->Y:I

    .line 487
    .line 488
    if-gt v7, v9, :cond_1a

    .line 489
    .line 490
    if-gt v8, v7, :cond_1a

    .line 491
    .line 492
    sub-int v8, v7, v6

    .line 493
    .line 494
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    check-cast v8, Lpw3;

    .line 499
    .line 500
    invoke-static {v8}, La28;->v(Lpw3;)Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    move-result-object v8

    .line 504
    if-eqz v8, :cond_1a

    .line 505
    .line 506
    invoke-static {v8, p2}, La28;->f(Ljava/lang/Class;Lkb6;)Ljava/lang/reflect/Method;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    goto :goto_f

    .line 511
    :cond_1a
    move-object v8, v1

    .line 512
    :goto_f
    aput-object v8, v5, v7

    .line 513
    .line 514
    add-int/lit8 v7, v7, 0x1

    .line 515
    .line 516
    goto :goto_e

    .line 517
    :cond_1b
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 522
    .line 523
    .line 524
    move-result p3

    .line 525
    if-eqz p3, :cond_1c

    .line 526
    .line 527
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p3

    .line 531
    check-cast p3, Ljava/lang/Number;

    .line 532
    .line 533
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result p3

    .line 537
    aput-object v1, v5, p3

    .line 538
    .line 539
    goto :goto_10

    .line 540
    :cond_1c
    invoke-interface {p2}, Lkb6;->D()Lov3;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    invoke-static {p2}, Lmb6;->L(Lkb6;)Z

    .line 545
    .line 546
    .line 547
    move-result p2

    .line 548
    if-nez p2, :cond_1e

    .line 549
    .line 550
    instance-of p2, p1, Lzu3;

    .line 551
    .line 552
    if-eqz p2, :cond_1e

    .line 553
    .line 554
    check-cast p1, Lzu3;

    .line 555
    .line 556
    invoke-interface {p1}, Lzu3;->C()Z

    .line 557
    .line 558
    .line 559
    move-result p1

    .line 560
    if-eqz p1, :cond_1e

    .line 561
    .line 562
    iget-object p1, p0, Let8;->a:Lwd0;

    .line 563
    .line 564
    invoke-interface {p1}, Lwd0;->b()Ljava/lang/reflect/Member;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    if-eqz p1, :cond_1e

    .line 569
    .line 570
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    if-nez p1, :cond_1d

    .line 575
    .line 576
    move p1, v4

    .line 577
    goto :goto_11

    .line 578
    :cond_1d
    sget-object p2, Lyb6;->a:Lzb6;

    .line 579
    .line 580
    invoke-virtual {p2, p1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 581
    .line 582
    .line 583
    move-result-object p1

    .line 584
    invoke-interface {p1}, Lzu3;->C()Z

    .line 585
    .line 586
    .line 587
    move-result p1

    .line 588
    xor-int/2addr p1, v2

    .line 589
    :goto_11
    if-ne p1, v2, :cond_1e

    .line 590
    .line 591
    aput-object v1, v5, v4

    .line 592
    .line 593
    :cond_1e
    new-instance p1, Lzv7;

    .line 594
    .line 595
    invoke-direct {p1, p4, v5, v3}, Lzv7;-><init>(Lkf3;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 596
    .line 597
    .line 598
    :goto_12
    iput-object p1, p0, Let8;->c:Lzv7;

    .line 599
    .line 600
    return-void

    .line 601
    :cond_1f
    new-instance p1, Lp14;

    .line 602
    .line 603
    new-instance p3, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    const-string v1, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    .line 606
    .line 607
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    iget-object v1, p0, Let8;->a:Lwd0;

    .line 611
    .line 612
    invoke-interface {v1}, Lwd0;->a()Ljava/util/List;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string v1, " != "

    .line 624
    .line 625
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    const-string v0, "\nCalling: "

    .line 632
    .line 633
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    iget-object p0, p0, Let8;->a:Lwd0;

    .line 640
    .line 641
    invoke-interface {p0}, Lwd0;->a()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object p0

    .line 645
    const-string p2, "\nParameter types: "

    .line 646
    .line 647
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    const-string p0, ")\nDefault: "

    .line 654
    .line 655
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    invoke-direct {p1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    throw p1
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Let8;->a:Lwd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lwd0;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Let8;->a:Lwd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lwd0;->b()Ljava/lang/reflect/Member;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Let8;->a:Lwd0;

    .line 2
    .line 3
    instance-of p0, p0, Lje0;

    .line 4
    .line 5
    return p0
.end method

.method public final d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Let8;->c:Lzv7;

    .line 2
    .line 3
    iget-object v1, v0, Lzv7;->X:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkf3;

    .line 6
    .line 7
    iget-object v2, v0, Lzv7;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, [Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iget-object v0, v0, Lzv7;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/reflect/Method;

    .line 14
    .line 15
    array-length v3, p1

    .line 16
    new-array v4, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    :goto_0
    const/4 v6, 0x0

    .line 20
    if-ge v5, v3, :cond_3

    .line 21
    .line 22
    aget-object v7, p1, v5

    .line 23
    .line 24
    iget v8, v1, Lif3;->X:I

    .line 25
    .line 26
    iget v9, v1, Lif3;->Y:I

    .line 27
    .line 28
    if-gt v5, v9, :cond_2

    .line 29
    .line 30
    if-gt v8, v5, :cond_2

    .line 31
    .line 32
    aget-object v8, v2, v5

    .line 33
    .line 34
    if-nez v8, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    if-eqz v7, :cond_1

    .line 38
    .line 39
    invoke-virtual {v8, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v6}, Lms8;->f(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    :cond_2
    :goto_1
    aput-object v7, v4, v5

    .line 56
    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget-object p0, p0, Let8;->a:Lwd0;

    .line 61
    .line 62
    invoke-interface {p0, v4}, Lwd0;->d([Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Lc71;->X:Lc71;

    .line 67
    .line 68
    if-ne p0, p1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    if-eqz v0, :cond_6

    .line 72
    .line 73
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, v6, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    return-object p1

    .line 85
    :cond_6
    :goto_2
    return-object p0
.end method

.method public final j()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Let8;->a:Lwd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lwd0;->j()Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

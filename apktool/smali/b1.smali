.class public final synthetic Lb1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lb1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lb1;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 9
    iput-byte p3, p0, Lb1;->X:B

    iput-object p1, p0, Lb1;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-byte v3, v0, Lb1;->X:B

    .line 8
    .line 9
    const/4 v9, 0x7

    .line 10
    const/16 v10, 0x8

    .line 11
    .line 12
    const/4 v13, 0x3

    .line 13
    const/4 v14, 0x2

    .line 14
    const/4 v15, 0x0

    .line 15
    const/high16 v16, 0x40000000    # 2.0f

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const-wide/16 v17, 0x80

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    packed-switch v3, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ln50;

    .line 27
    .line 28
    check-cast v1, Lpf3;

    .line 29
    .line 30
    check-cast v2, Lz24;

    .line 31
    .line 32
    iget-wide v5, v1, Lpf3;->a:J

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    shr-long/2addr v5, v1

    .line 37
    long-to-int v3, v5

    .line 38
    invoke-virtual {v0, v4, v3, v2}, Ln50;->a(IILz24;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v2, v0

    .line 43
    shl-long v0, v2, v1

    .line 44
    .line 45
    new-instance v2, Lhf3;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1}, Lhf3;-><init>(J)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :pswitch_0
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lb88;

    .line 54
    .line 55
    check-cast v1, Llp2;

    .line 56
    .line 57
    check-cast v2, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v5}, Lw79;->P(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v2, v1}, Lb88;->a(ILlp2;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Ldn8;->a:Ldn8;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_1
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroid/app/RemoteAction;

    .line 75
    .line 76
    check-cast v1, Llp2;

    .line 77
    .line 78
    check-cast v2, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Lts2;->g(Landroid/app/RemoteAction;Llp2;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :pswitch_2
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/view/textclassifier/TextClassification;

    .line 91
    .line 92
    check-cast v1, Llp2;

    .line 93
    .line 94
    check-cast v2, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Lts2;->f(Landroid/view/textclassifier/TextClassification;Llp2;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_3
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/util/List;

    .line 107
    .line 108
    move-object v8, v1

    .line 109
    check-cast v8, Ljava/lang/CharSequence;

    .line 110
    .line 111
    move-object v1, v2

    .line 112
    check-cast v1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-ne v2, v5, :cond_2

    .line 126
    .line 127
    invoke-static {v0}, Lwv0;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/lang/String;

    .line 132
    .line 133
    const/4 v2, 0x4

    .line 134
    invoke-static {v8, v0, v1, v4, v2}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-gez v1, :cond_1

    .line 139
    .line 140
    :cond_0
    move-object v2, v15

    .line 141
    goto/16 :goto_4

    .line 142
    .line 143
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    new-instance v2, Lqg5;

    .line 148
    .line 149
    invoke-direct {v2, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_2
    new-instance v2, Lkf3;

    .line 155
    .line 156
    if-gez v1, :cond_3

    .line 157
    .line 158
    move v1, v4

    .line 159
    :cond_3
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-direct {v2, v1, v3, v5}, Lif3;-><init>(III)V

    .line 164
    .line 165
    .line 166
    iget v3, v2, Lif3;->Z:I

    .line 167
    .line 168
    iget v2, v2, Lif3;->Y:I

    .line 169
    .line 170
    instance-of v5, v8, Ljava/lang/String;

    .line 171
    .line 172
    if-eqz v5, :cond_9

    .line 173
    .line 174
    if-lez v3, :cond_4

    .line 175
    .line 176
    if-le v1, v2, :cond_5

    .line 177
    .line 178
    :cond_4
    if-gez v3, :cond_0

    .line 179
    .line 180
    if-gt v2, v1, :cond_0

    .line 181
    .line 182
    :cond_5
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eqz v6, :cond_7

    .line 191
    .line 192
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    move-object v7, v6

    .line 197
    check-cast v7, Ljava/lang/String;

    .line 198
    .line 199
    move-object v9, v8

    .line 200
    check-cast v9, Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual {v7, v4, v9, v1, v10}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_6

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_7
    move-object v6, v15

    .line 214
    :goto_1
    check-cast v6, Ljava/lang/String;

    .line 215
    .line 216
    if-eqz v6, :cond_8

    .line 217
    .line 218
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    new-instance v2, Lqg5;

    .line 223
    .line 224
    invoke-direct {v2, v0, v6}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_8
    if-eq v1, v2, :cond_0

    .line 229
    .line 230
    add-int/2addr v1, v3

    .line 231
    goto :goto_0

    .line 232
    :cond_9
    if-lez v3, :cond_a

    .line 233
    .line 234
    if-le v1, v2, :cond_b

    .line 235
    .line 236
    :cond_a
    if-gez v3, :cond_0

    .line 237
    .line 238
    if-gt v2, v1, :cond_0

    .line 239
    .line 240
    :cond_b
    move v9, v1

    .line 241
    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_d

    .line 250
    .line 251
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    move-object v6, v4

    .line 256
    check-cast v6, Ljava/lang/String;

    .line 257
    .line 258
    const/4 v7, 0x0

    .line 259
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    const/4 v11, 0x0

    .line 264
    invoke-static/range {v6 .. v11}, Lfm7;->w0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_c

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_d
    move-object v4, v15

    .line 272
    :goto_3
    check-cast v4, Ljava/lang/String;

    .line 273
    .line 274
    if-eqz v4, :cond_e

    .line 275
    .line 276
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v2, Lqg5;

    .line 281
    .line 282
    invoke-direct {v2, v0, v4}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_e
    if-eq v9, v2, :cond_0

    .line 287
    .line 288
    add-int/2addr v9, v3

    .line 289
    goto :goto_2

    .line 290
    :goto_4
    if-eqz v2, :cond_f

    .line 291
    .line 292
    iget-object v0, v2, Lqg5;->X:Ljava/lang/Object;

    .line 293
    .line 294
    iget-object v1, v2, Lqg5;->Y:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v1, Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    new-instance v15, Lqg5;

    .line 307
    .line 308
    invoke-direct {v15, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    :cond_f
    return-object v15

    .line 312
    :pswitch_4
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, [C

    .line 315
    .line 316
    check-cast v1, Ljava/lang/CharSequence;

    .line 317
    .line 318
    check-cast v2, Ljava/lang/Integer;

    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-static {v1, v0, v2, v4}, Lfm7;->n0(Ljava/lang/CharSequence;[CIZ)I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-gez v0, :cond_10

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    new-instance v15, Lqg5;

    .line 343
    .line 344
    invoke-direct {v15, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :goto_5
    return-object v15

    .line 348
    :pswitch_5
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, Lxd7;

    .line 351
    .line 352
    check-cast v1, Ljava/util/Set;

    .line 353
    .line 354
    check-cast v2, Ldd7;

    .line 355
    .line 356
    iget-object v2, v0, Lxd7;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 357
    .line 358
    :goto_6
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    if-nez v3, :cond_11

    .line 363
    .line 364
    move-object v6, v1

    .line 365
    check-cast v6, Ljava/util/Collection;

    .line 366
    .line 367
    goto :goto_7

    .line 368
    :cond_11
    instance-of v6, v3, Ljava/util/Set;

    .line 369
    .line 370
    if-eqz v6, :cond_12

    .line 371
    .line 372
    new-array v6, v14, [Ljava/util/Set;

    .line 373
    .line 374
    aput-object v3, v6, v4

    .line 375
    .line 376
    aput-object v1, v6, v5

    .line 377
    .line 378
    invoke-static {v6}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    goto :goto_7

    .line 383
    :cond_12
    instance-of v6, v3, Ljava/util/List;

    .line 384
    .line 385
    if-eqz v6, :cond_16

    .line 386
    .line 387
    move-object v6, v3

    .line 388
    check-cast v6, Ljava/util/Collection;

    .line 389
    .line 390
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    invoke-static {v6, v7}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    :cond_13
    :goto_7
    invoke-virtual {v2, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    if-eqz v7, :cond_15

    .line 403
    .line 404
    invoke-virtual {v0}, Lxd7;->b()Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_14

    .line 409
    .line 410
    iget-object v1, v0, Lxd7;->a:Lgn2;

    .line 411
    .line 412
    new-instance v2, Lhr5;

    .line 413
    .line 414
    const/16 v3, 0x16

    .line 415
    .line 416
    invoke-direct {v2, v0, v3}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v1, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    :cond_14
    sget-object v15, Ldn8;->a:Ldn8;

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_15
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v7

    .line 429
    if-eq v7, v3, :cond_13

    .line 430
    .line 431
    goto :goto_6

    .line 432
    :cond_16
    const-string v0, "Unexpected notification"

    .line 433
    .line 434
    invoke-static {v0}, Ld01;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 435
    .line 436
    .line 437
    invoke-static {}, Lb61;->n()V

    .line 438
    .line 439
    .line 440
    :goto_8
    return-object v15

    .line 441
    :pswitch_6
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Ljb7;

    .line 444
    .line 445
    check-cast v1, Lsv1;

    .line 446
    .line 447
    check-cast v2, Lz85;

    .line 448
    .line 449
    sget-object v3, Lpb7;->a:Lpb7;

    .line 450
    .line 451
    iget-wide v3, v0, Ljb7;->b:J

    .line 452
    .line 453
    sget v0, Lpb7;->b:F

    .line 454
    .line 455
    iget-wide v5, v2, Lz85;->a:J

    .line 456
    .line 457
    invoke-interface {v1, v0}, Lfi1;->h0(F)F

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    div-float v0, v0, v16

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const/16 v8, 0x78

    .line 465
    .line 466
    move-wide v2, v3

    .line 467
    move v4, v0

    .line 468
    invoke-static/range {v1 .. v8}, Lsv1;->o0(Lsv1;JFJLtv1;I)V

    .line 469
    .line 470
    .line 471
    sget-object v0, Ldn8;->a:Ldn8;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_7
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v0, Lna7;

    .line 477
    .line 478
    check-cast v1, Ljava/util/Set;

    .line 479
    .line 480
    check-cast v2, Ldd7;

    .line 481
    .line 482
    iget-object v2, v0, Lcw0;->X:Ljava/lang/Object;

    .line 483
    .line 484
    monitor-enter v2

    .line 485
    :try_start_0
    iget-object v3, v0, Lna7;->h0:Lt05;

    .line 486
    .line 487
    if-nez v3, :cond_17

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Iterable;

    .line 490
    .line 491
    iget-object v3, v0, Lna7;->f0:Ljava/lang/Object;

    .line 492
    .line 493
    invoke-static {v1, v3}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    if-eqz v1, :cond_1b

    .line 498
    .line 499
    iget-object v15, v0, Lna7;->j0:Ln17;

    .line 500
    .line 501
    goto :goto_b

    .line 502
    :catchall_0
    move-exception v0

    .line 503
    goto :goto_c

    .line 504
    :cond_17
    iget-object v5, v3, Lt05;->b:[Ljava/lang/Object;

    .line 505
    .line 506
    iget-object v3, v3, Lt05;->a:[J

    .line 507
    .line 508
    array-length v6, v3

    .line 509
    sub-int/2addr v6, v14

    .line 510
    if-ltz v6, :cond_1b

    .line 511
    .line 512
    move v13, v4

    .line 513
    const-wide/16 v19, 0xff

    .line 514
    .line 515
    :goto_9
    aget-wide v7, v3, v13

    .line 516
    .line 517
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    not-long v11, v7

    .line 523
    shl-long/2addr v11, v9

    .line 524
    and-long/2addr v11, v7

    .line 525
    and-long v11, v11, v21

    .line 526
    .line 527
    cmp-long v11, v11, v21

    .line 528
    .line 529
    if-eqz v11, :cond_1a

    .line 530
    .line 531
    sub-int v11, v13, v6

    .line 532
    .line 533
    not-int v11, v11

    .line 534
    ushr-int/lit8 v11, v11, 0x1f

    .line 535
    .line 536
    rsub-int/lit8 v11, v11, 0x8

    .line 537
    .line 538
    move v12, v4

    .line 539
    :goto_a
    if-ge v12, v11, :cond_19

    .line 540
    .line 541
    and-long v23, v7, v19

    .line 542
    .line 543
    cmp-long v14, v23, v17

    .line 544
    .line 545
    if-gez v14, :cond_18

    .line 546
    .line 547
    shl-int/lit8 v14, v13, 0x3

    .line 548
    .line 549
    add-int/2addr v14, v12

    .line 550
    aget-object v14, v5, v14

    .line 551
    .line 552
    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v14

    .line 556
    if-eqz v14, :cond_18

    .line 557
    .line 558
    iget-object v15, v0, Lna7;->j0:Ln17;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 559
    .line 560
    goto :goto_b

    .line 561
    :cond_18
    shr-long/2addr v7, v10

    .line 562
    add-int/lit8 v12, v12, 0x1

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_19
    if-ne v11, v10, :cond_1b

    .line 566
    .line 567
    :cond_1a
    if-eq v13, v6, :cond_1b

    .line 568
    .line 569
    add-int/lit8 v13, v13, 0x1

    .line 570
    .line 571
    goto :goto_9

    .line 572
    :cond_1b
    :goto_b
    monitor-exit v2

    .line 573
    if-eqz v15, :cond_1c

    .line 574
    .line 575
    sget-object v0, Ldn8;->a:Ldn8;

    .line 576
    .line 577
    invoke-interface {v15, v0}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    :cond_1c
    sget-object v0, Ldn8;->a:Ldn8;

    .line 581
    .line 582
    return-object v0

    .line 583
    :goto_c
    monitor-exit v2

    .line 584
    throw v0

    .line 585
    :pswitch_8
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v0, Li97;

    .line 588
    .line 589
    check-cast v2, Ljava/lang/Boolean;

    .line 590
    .line 591
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    iget-object v0, v0, Li97;->b:Ljava/util/Set;

    .line 596
    .line 597
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-eqz v3, :cond_1e

    .line 606
    .line 607
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    check-cast v3, Le95;

    .line 612
    .line 613
    iget-object v6, v3, Le95;->a:Lbx5;

    .line 614
    .line 615
    iget-object v6, v6, Lbx5;->a:Lyv3;

    .line 616
    .line 617
    invoke-interface {v6, v1}, Llw3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 622
    .line 623
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    iget-object v3, v3, Le95;->a:Lbx5;

    .line 628
    .line 629
    if-eq v2, v6, :cond_1d

    .line 630
    .line 631
    move v6, v5

    .line 632
    goto :goto_e

    .line 633
    :cond_1d
    move v6, v4

    .line 634
    :goto_e
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    invoke-virtual {v3, v1, v6}, Lbx5;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    goto :goto_d

    .line 642
    :cond_1e
    sget-object v0, Ldn8;->a:Ldn8;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_9
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Lda6;

    .line 648
    .line 649
    check-cast v1, Lhq5;

    .line 650
    .line 651
    check-cast v2, Lz85;

    .line 652
    .line 653
    invoke-virtual {v1}, Lhq5;->a()V

    .line 654
    .line 655
    .line 656
    iget-wide v1, v2, Lz85;->a:J

    .line 657
    .line 658
    iput-wide v1, v0, Lda6;->X:J

    .line 659
    .line 660
    sget-object v0, Ldn8;->a:Ldn8;

    .line 661
    .line 662
    return-object v0

    .line 663
    :pswitch_a
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, Lqu6;

    .line 666
    .line 667
    check-cast v1, Ljava/lang/Integer;

    .line 668
    .line 669
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    move-object v1, v2

    .line 674
    check-cast v1, Lq61;

    .line 675
    .line 676
    invoke-interface {v1}, Lq61;->getKey()Lr61;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    iget-object v0, v0, Lqu6;->g0:Ls61;

    .line 681
    .line 682
    invoke-interface {v0, v2}, Ls61;->H0(Lr61;)Lq61;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    sget-object v4, Loy1;->E0:Loy1;

    .line 687
    .line 688
    if-eq v2, v4, :cond_20

    .line 689
    .line 690
    if-eq v1, v0, :cond_1f

    .line 691
    .line 692
    const/high16 v3, -0x80000000

    .line 693
    .line 694
    goto :goto_11

    .line 695
    :cond_1f
    add-int/lit8 v3, v3, 0x1

    .line 696
    .line 697
    goto :goto_11

    .line 698
    :cond_20
    move-object v6, v0

    .line 699
    check-cast v6, Lbm3;

    .line 700
    .line 701
    check-cast v1, Lbm3;

    .line 702
    .line 703
    :goto_f
    if-nez v1, :cond_21

    .line 704
    .line 705
    move-object v1, v15

    .line 706
    goto :goto_10

    .line 707
    :cond_21
    if-ne v1, v6, :cond_22

    .line 708
    .line 709
    goto :goto_10

    .line 710
    :cond_22
    instance-of v0, v1, Lfx6;

    .line 711
    .line 712
    if-nez v0, :cond_24

    .line 713
    .line 714
    :goto_10
    if-ne v1, v6, :cond_23

    .line 715
    .line 716
    if-nez v6, :cond_1f

    .line 717
    .line 718
    :goto_11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object v15

    .line 722
    goto :goto_12

    .line 723
    :cond_23
    const-string v0, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 724
    .line 725
    const-string v2, ", expected child of "

    .line 726
    .line 727
    const-string v3, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 728
    .line 729
    invoke-static {v0, v1, v2, v6, v3}, Lxw3;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    :goto_12
    return-object v15

    .line 733
    :cond_24
    check-cast v1, Lfx6;

    .line 734
    .line 735
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 736
    .line 737
    sget-wide v4, Lrm3;->X:J

    .line 738
    .line 739
    invoke-virtual {v0, v1, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    check-cast v0, Lir0;

    .line 744
    .line 745
    if-eqz v0, :cond_25

    .line 746
    .line 747
    invoke-interface {v0}, Lir0;->getParent()Lbm3;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    move-object v1, v0

    .line 752
    goto :goto_f

    .line 753
    :cond_25
    move-object v1, v15

    .line 754
    goto :goto_f

    .line 755
    :pswitch_b
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v0, Lpv3;

    .line 758
    .line 759
    check-cast v1, Llp2;

    .line 760
    .line 761
    check-cast v2, Ljava/lang/Integer;

    .line 762
    .line 763
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    and-int/lit8 v3, v2, 0x3

    .line 768
    .line 769
    if-eq v3, v14, :cond_26

    .line 770
    .line 771
    move v4, v5

    .line 772
    :cond_26
    and-int/2addr v2, v5

    .line 773
    invoke-virtual {v1, v2, v4}, Llp2;->N(IZ)Z

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    if-eqz v2, :cond_27

    .line 778
    .line 779
    check-cast v0, Lgn2;

    .line 780
    .line 781
    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 782
    .line 783
    const/16 v3, 0x30

    .line 784
    .line 785
    invoke-static {v3, v0, v1, v2}, Li21;->d(ILgn2;Llp2;Lkx4;)V

    .line 786
    .line 787
    .line 788
    goto :goto_13

    .line 789
    :cond_27
    invoke-virtual {v1}, Llp2;->Q()V

    .line 790
    .line 791
    .line 792
    :goto_13
    sget-object v0, Ldn8;->a:Ldn8;

    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_c
    const-wide/16 v19, 0xff

    .line 796
    .line 797
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v0, Lp86;

    .line 805
    .line 806
    check-cast v1, Ljava/util/Set;

    .line 807
    .line 808
    check-cast v2, Ldd7;

    .line 809
    .line 810
    iget-object v2, v0, Lp86;->c:Ljava/lang/Object;

    .line 811
    .line 812
    monitor-enter v2

    .line 813
    :try_start_1
    iget-object v3, v0, Lp86;->u:Loh7;

    .line 814
    .line 815
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    check-cast v3, Lm86;

    .line 820
    .line 821
    sget-object v6, Lm86;->g0:Lm86;

    .line 822
    .line 823
    invoke-virtual {v3, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    if-ltz v3, :cond_2f

    .line 828
    .line 829
    iget-object v3, v0, Lp86;->h:Lt05;

    .line 830
    .line 831
    instance-of v6, v1, Lww6;

    .line 832
    .line 833
    if-eqz v6, :cond_2c

    .line 834
    .line 835
    check-cast v1, Lww6;

    .line 836
    .line 837
    iget-object v1, v1, Lww6;->X:Lt05;

    .line 838
    .line 839
    iget-object v6, v1, Lt05;->b:[Ljava/lang/Object;

    .line 840
    .line 841
    iget-object v1, v1, Lt05;->a:[J

    .line 842
    .line 843
    array-length v7, v1

    .line 844
    sub-int/2addr v7, v14

    .line 845
    if-ltz v7, :cond_2e

    .line 846
    .line 847
    move v8, v4

    .line 848
    :goto_14
    aget-wide v11, v1, v8

    .line 849
    .line 850
    not-long v13, v11

    .line 851
    shl-long/2addr v13, v9

    .line 852
    and-long/2addr v13, v11

    .line 853
    and-long v13, v13, v21

    .line 854
    .line 855
    cmp-long v13, v13, v21

    .line 856
    .line 857
    if-eqz v13, :cond_2b

    .line 858
    .line 859
    sub-int v13, v8, v7

    .line 860
    .line 861
    not-int v13, v13

    .line 862
    ushr-int/lit8 v13, v13, 0x1f

    .line 863
    .line 864
    rsub-int/lit8 v13, v13, 0x8

    .line 865
    .line 866
    move v14, v4

    .line 867
    :goto_15
    if-ge v14, v13, :cond_2a

    .line 868
    .line 869
    and-long v15, v11, v19

    .line 870
    .line 871
    cmp-long v15, v15, v17

    .line 872
    .line 873
    if-gez v15, :cond_29

    .line 874
    .line 875
    shl-int/lit8 v15, v8, 0x3

    .line 876
    .line 877
    add-int/2addr v15, v14

    .line 878
    aget-object v15, v6, v15

    .line 879
    .line 880
    move/from16 v23, v9

    .line 881
    .line 882
    instance-of v9, v15, Lzh7;

    .line 883
    .line 884
    if-eqz v9, :cond_28

    .line 885
    .line 886
    move-object v9, v15

    .line 887
    check-cast v9, Lzh7;

    .line 888
    .line 889
    invoke-virtual {v9, v5}, Lzh7;->g(I)Z

    .line 890
    .line 891
    .line 892
    move-result v9

    .line 893
    if-nez v9, :cond_28

    .line 894
    .line 895
    goto :goto_16

    .line 896
    :catchall_1
    move-exception v0

    .line 897
    goto :goto_19

    .line 898
    :cond_28
    invoke-virtual {v3, v15}, Lt05;->a(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    goto :goto_16

    .line 902
    :cond_29
    move/from16 v23, v9

    .line 903
    .line 904
    :goto_16
    shr-long/2addr v11, v10

    .line 905
    add-int/lit8 v14, v14, 0x1

    .line 906
    .line 907
    move/from16 v9, v23

    .line 908
    .line 909
    goto :goto_15

    .line 910
    :cond_2a
    move/from16 v23, v9

    .line 911
    .line 912
    if-ne v13, v10, :cond_2e

    .line 913
    .line 914
    goto :goto_17

    .line 915
    :cond_2b
    move/from16 v23, v9

    .line 916
    .line 917
    :goto_17
    if-eq v8, v7, :cond_2e

    .line 918
    .line 919
    add-int/lit8 v8, v8, 0x1

    .line 920
    .line 921
    move/from16 v9, v23

    .line 922
    .line 923
    goto :goto_14

    .line 924
    :cond_2c
    check-cast v1, Ljava/lang/Iterable;

    .line 925
    .line 926
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    if-eqz v4, :cond_2e

    .line 935
    .line 936
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v4

    .line 940
    instance-of v6, v4, Lzh7;

    .line 941
    .line 942
    if-eqz v6, :cond_2d

    .line 943
    .line 944
    move-object v6, v4

    .line 945
    check-cast v6, Lzh7;

    .line 946
    .line 947
    invoke-virtual {v6, v5}, Lzh7;->g(I)Z

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    if-nez v6, :cond_2d

    .line 952
    .line 953
    goto :goto_18

    .line 954
    :cond_2d
    invoke-virtual {v3, v4}, Lt05;->a(Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    goto :goto_18

    .line 958
    :cond_2e
    invoke-virtual {v0}, Lp86;->y()Llm0;

    .line 959
    .line 960
    .line 961
    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 962
    :cond_2f
    monitor-exit v2

    .line 963
    if-eqz v15, :cond_30

    .line 964
    .line 965
    sget-object v0, Ldn8;->a:Ldn8;

    .line 966
    .line 967
    check-cast v15, Lmm0;

    .line 968
    .line 969
    invoke-virtual {v15, v0}, Lmm0;->f(Ljava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    :cond_30
    sget-object v0, Ldn8;->a:Ldn8;

    .line 973
    .line 974
    return-object v0

    .line 975
    :goto_19
    monitor-exit v2

    .line 976
    throw v0

    .line 977
    :pswitch_d
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 978
    .line 979
    check-cast v0, Lir5;

    .line 980
    .line 981
    check-cast v1, Llp2;

    .line 982
    .line 983
    check-cast v2, Ljava/lang/Integer;

    .line 984
    .line 985
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    invoke-static {v5}, Lw79;->P(I)I

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    invoke-virtual {v0, v2, v1}, Lir5;->a(ILlp2;)V

    .line 993
    .line 994
    .line 995
    sget-object v0, Ldn8;->a:Ldn8;

    .line 996
    .line 997
    return-object v0

    .line 998
    :pswitch_e
    move/from16 v23, v9

    .line 999
    .line 1000
    const-wide/16 v19, 0xff

    .line 1001
    .line 1002
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast v0, Ljz4;

    .line 1010
    .line 1011
    check-cast v1, Ljava/util/Set;

    .line 1012
    .line 1013
    check-cast v2, Ldd7;

    .line 1014
    .line 1015
    new-instance v2, Lea6;

    .line 1016
    .line 1017
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1018
    .line 1019
    .line 1020
    iget-object v3, v0, Lcw0;->X:Ljava/lang/Object;

    .line 1021
    .line 1022
    monitor-enter v3

    .line 1023
    :try_start_2
    iget-object v6, v0, Ljz4;->f0:Ls05;

    .line 1024
    .line 1025
    new-instance v7, Lsn;

    .line 1026
    .line 1027
    const/16 v8, 0x11

    .line 1028
    .line 1029
    invoke-direct {v7, v1, v0, v2, v8}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v5, v7}, Lci8;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    iget-object v0, v6, Ls05;->b:[Ljava/lang/Object;

    .line 1036
    .line 1037
    iget-object v1, v6, Ls05;->a:[J

    .line 1038
    .line 1039
    array-length v5, v1

    .line 1040
    sub-int/2addr v5, v14

    .line 1041
    if-ltz v5, :cond_34

    .line 1042
    .line 1043
    move v6, v4

    .line 1044
    :goto_1a
    aget-wide v8, v1, v6

    .line 1045
    .line 1046
    not-long v11, v8

    .line 1047
    shl-long v11, v11, v23

    .line 1048
    .line 1049
    and-long/2addr v11, v8

    .line 1050
    and-long v11, v11, v21

    .line 1051
    .line 1052
    cmp-long v11, v11, v21

    .line 1053
    .line 1054
    if-eqz v11, :cond_33

    .line 1055
    .line 1056
    sub-int v11, v6, v5

    .line 1057
    .line 1058
    not-int v11, v11

    .line 1059
    ushr-int/lit8 v11, v11, 0x1f

    .line 1060
    .line 1061
    rsub-int/lit8 v11, v11, 0x8

    .line 1062
    .line 1063
    move v12, v4

    .line 1064
    :goto_1b
    if-ge v12, v11, :cond_32

    .line 1065
    .line 1066
    and-long v13, v8, v19

    .line 1067
    .line 1068
    cmp-long v13, v13, v17

    .line 1069
    .line 1070
    if-gez v13, :cond_31

    .line 1071
    .line 1072
    shl-int/lit8 v13, v6, 0x3

    .line 1073
    .line 1074
    add-int/2addr v13, v12

    .line 1075
    aget-object v13, v0, v13

    .line 1076
    .line 1077
    invoke-virtual {v7, v13}, Lsn;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    :cond_31
    shr-long/2addr v8, v10

    .line 1081
    add-int/lit8 v12, v12, 0x1

    .line 1082
    .line 1083
    goto :goto_1b

    .line 1084
    :cond_32
    if-ne v11, v10, :cond_34

    .line 1085
    .line 1086
    :cond_33
    if-eq v6, v5, :cond_34

    .line 1087
    .line 1088
    add-int/lit8 v6, v6, 0x1

    .line 1089
    .line 1090
    goto :goto_1a

    .line 1091
    :cond_34
    iget-object v0, v2, Lea6;->X:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v0, Ljava/util/List;

    .line 1094
    .line 1095
    if-eqz v0, :cond_35

    .line 1096
    .line 1097
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1098
    .line 1099
    .line 1100
    move-result v1

    .line 1101
    :goto_1c
    if-ge v4, v1, :cond_35

    .line 1102
    .line 1103
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    check-cast v2, Ln17;

    .line 1108
    .line 1109
    sget-object v5, Ldn8;->a:Ldn8;

    .line 1110
    .line 1111
    invoke-interface {v2, v5}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1112
    .line 1113
    .line 1114
    add-int/lit8 v4, v4, 0x1

    .line 1115
    .line 1116
    goto :goto_1c

    .line 1117
    :catchall_2
    move-exception v0

    .line 1118
    goto :goto_1d

    .line 1119
    :cond_35
    monitor-exit v3

    .line 1120
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1121
    .line 1122
    return-object v0

    .line 1123
    :goto_1d
    monitor-exit v3

    .line 1124
    throw v0

    .line 1125
    :pswitch_f
    sget-object v3, Lp87;->Z:Lp87;

    .line 1126
    .line 1127
    sget-object v4, Lp87;->Y:Lp87;

    .line 1128
    .line 1129
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1130
    .line 1131
    check-cast v0, Lo87;

    .line 1132
    .line 1133
    check-cast v1, Lpf3;

    .line 1134
    .line 1135
    check-cast v2, Lq31;

    .line 1136
    .line 1137
    iget-wide v6, v2, Lq31;->a:J

    .line 1138
    .line 1139
    invoke-static {v6, v7}, Lq31;->g(J)I

    .line 1140
    .line 1141
    .line 1142
    move-result v2

    .line 1143
    int-to-float v2, v2

    .line 1144
    new-instance v6, Llp4;

    .line 1145
    .line 1146
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1147
    .line 1148
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1149
    .line 1150
    .line 1151
    sget-object v8, Lp87;->X:Lp87;

    .line 1152
    .line 1153
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    iget-wide v9, v1, Lpf3;->a:J

    .line 1161
    .line 1162
    const-wide v11, 0xffffffffL

    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    and-long/2addr v9, v11

    .line 1168
    long-to-int v9, v9

    .line 1169
    int-to-float v9, v9

    .line 1170
    div-float v10, v2, v16

    .line 1171
    .line 1172
    cmpl-float v9, v9, v10

    .line 1173
    .line 1174
    if-lez v9, :cond_36

    .line 1175
    .line 1176
    iget-boolean v9, v0, Lo87;->a:Z

    .line 1177
    .line 1178
    if-nez v9, :cond_36

    .line 1179
    .line 1180
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v9

    .line 1184
    invoke-interface {v7, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    :cond_36
    iget-wide v9, v1, Lpf3;->a:J

    .line 1188
    .line 1189
    and-long/2addr v9, v11

    .line 1190
    long-to-int v1, v9

    .line 1191
    if-eqz v1, :cond_37

    .line 1192
    .line 1193
    int-to-float v1, v1

    .line 1194
    sub-float/2addr v2, v1

    .line 1195
    const/4 v1, 0x0

    .line 1196
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 1197
    .line 1198
    .line 1199
    move-result v1

    .line 1200
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    invoke-interface {v7, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    :cond_37
    invoke-direct {v6, v7}, Llp4;-><init>(Ljava/util/Map;)V

    .line 1208
    .line 1209
    .line 1210
    iget-object v0, v0, Lo87;->d:Lt5;

    .line 1211
    .line 1212
    iget-object v0, v0, Lt5;->j0:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v0, Lzi1;

    .line 1215
    .line 1216
    invoke-virtual {v0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    check-cast v0, Lp87;

    .line 1221
    .line 1222
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    if-eqz v0, :cond_3c

    .line 1227
    .line 1228
    if-eq v0, v5, :cond_3b

    .line 1229
    .line 1230
    if-ne v0, v14, :cond_3a

    .line 1231
    .line 1232
    invoke-interface {v7, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1233
    .line 1234
    .line 1235
    move-result v0

    .line 1236
    if-eqz v0, :cond_38

    .line 1237
    .line 1238
    goto :goto_1e

    .line 1239
    :cond_38
    invoke-interface {v7, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v0

    .line 1243
    if-eqz v0, :cond_39

    .line 1244
    .line 1245
    move-object v3, v4

    .line 1246
    goto :goto_1e

    .line 1247
    :cond_39
    move-object v3, v8

    .line 1248
    :goto_1e
    move-object v4, v3

    .line 1249
    goto :goto_1f

    .line 1250
    :cond_3a
    invoke-static {}, Lb61;->c()V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_20

    .line 1254
    :cond_3b
    invoke-interface {v7, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v0

    .line 1258
    if-eqz v0, :cond_3c

    .line 1259
    .line 1260
    goto :goto_1f

    .line 1261
    :cond_3c
    move-object v4, v8

    .line 1262
    :goto_1f
    new-instance v15, Lqg5;

    .line 1263
    .line 1264
    invoke-direct {v15, v6, v4}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1265
    .line 1266
    .line 1267
    :goto_20
    return-object v15

    .line 1268
    :pswitch_10
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v0, Llw4;

    .line 1271
    .line 1272
    check-cast v1, Llp2;

    .line 1273
    .line 1274
    check-cast v2, Ljava/lang/Integer;

    .line 1275
    .line 1276
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1277
    .line 1278
    .line 1279
    invoke-static {v5}, Lw79;->P(I)I

    .line 1280
    .line 1281
    .line 1282
    move-result v2

    .line 1283
    invoke-virtual {v0, v2, v1}, Llw4;->a(ILlp2;)V

    .line 1284
    .line 1285
    .line 1286
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1287
    .line 1288
    return-object v0

    .line 1289
    :pswitch_11
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1290
    .line 1291
    check-cast v0, Lnw2;

    .line 1292
    .line 1293
    check-cast v1, Lhv6;

    .line 1294
    .line 1295
    invoke-virtual {v0, v1, v2}, Lnw2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    check-cast v0, Ljava/util/List;

    .line 1300
    .line 1301
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1302
    .line 1303
    .line 1304
    move-result v2

    .line 1305
    :goto_21
    if-ge v4, v2, :cond_3f

    .line 1306
    .line 1307
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v3

    .line 1311
    if-eqz v3, :cond_3e

    .line 1312
    .line 1313
    iget-object v5, v1, Lhv6;->Y:Lkv6;

    .line 1314
    .line 1315
    if-eqz v5, :cond_3e

    .line 1316
    .line 1317
    invoke-interface {v5, v3}, Lkv6;->c(Ljava/lang/Object;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v5

    .line 1321
    if-eqz v5, :cond_3d

    .line 1322
    .line 1323
    goto :goto_22

    .line 1324
    :cond_3d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1325
    .line 1326
    const-string v1, "item at index "

    .line 1327
    .line 1328
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1332
    .line 1333
    .line 1334
    const-string v1, " can\'t be saved: "

    .line 1335
    .line 1336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1347
    .line 1348
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    throw v1

    .line 1356
    :cond_3e
    :goto_22
    add-int/lit8 v4, v4, 0x1

    .line 1357
    .line 1358
    goto :goto_21

    .line 1359
    :cond_3f
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v1

    .line 1363
    if-nez v1, :cond_40

    .line 1364
    .line 1365
    new-instance v15, Ljava/util/ArrayList;

    .line 1366
    .line 1367
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1368
    .line 1369
    .line 1370
    :cond_40
    return-object v15

    .line 1371
    :pswitch_12
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v0, Lnc3;

    .line 1374
    .line 1375
    check-cast v1, Llp2;

    .line 1376
    .line 1377
    check-cast v2, Ljava/lang/Integer;

    .line 1378
    .line 1379
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1380
    .line 1381
    .line 1382
    invoke-static {v5}, Lw79;->P(I)I

    .line 1383
    .line 1384
    .line 1385
    move-result v2

    .line 1386
    invoke-virtual {v0, v2, v1}, Lnc3;->a(ILlp2;)V

    .line 1387
    .line 1388
    .line 1389
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1390
    .line 1391
    return-object v0

    .line 1392
    :pswitch_13
    move-object v0, v1

    .line 1393
    check-cast v0, Llp2;

    .line 1394
    .line 1395
    move-object v1, v2

    .line 1396
    check-cast v1, Ljava/lang/Integer;

    .line 1397
    .line 1398
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1399
    .line 1400
    .line 1401
    move-result v1

    .line 1402
    and-int/lit8 v2, v1, 0x3

    .line 1403
    .line 1404
    if-eq v2, v14, :cond_41

    .line 1405
    .line 1406
    move v4, v5

    .line 1407
    :cond_41
    and-int/2addr v1, v5

    .line 1408
    invoke-virtual {v0, v1, v4}, Llp2;->N(IZ)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v1

    .line 1412
    if-nez v1, :cond_42

    .line 1413
    .line 1414
    invoke-virtual {v0}, Llp2;->Q()V

    .line 1415
    .line 1416
    .line 1417
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1418
    .line 1419
    return-object v0

    .line 1420
    :cond_42
    throw v15

    .line 1421
    :pswitch_14
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1422
    .line 1423
    move-object v3, v0

    .line 1424
    check-cast v3, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 1425
    .line 1426
    move-object v0, v1

    .line 1427
    check-cast v0, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 1428
    .line 1429
    move-object v9, v2

    .line 1430
    check-cast v9, Ljava/lang/String;

    .line 1431
    .line 1432
    sget v1, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->U0:I

    .line 1433
    .line 1434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v3}, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;->B()Lm52;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v10

    .line 1444
    new-instance v1, Lub;

    .line 1445
    .line 1446
    const-class v4, Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;

    .line 1447
    .line 1448
    const-string v5, "showSuccessSnackbar"

    .line 1449
    .line 1450
    const-string v6, "showSuccessSnackbar()V"

    .line 1451
    .line 1452
    const/4 v7, 0x0

    .line 1453
    const/4 v8, 0x2

    .line 1454
    const/4 v2, 0x0

    .line 1455
    invoke-direct/range {v1 .. v8}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1456
    .line 1457
    .line 1458
    move-object v11, v1

    .line 1459
    new-instance v1, Lub;

    .line 1460
    .line 1461
    const-string v5, "showFailureSnackbar"

    .line 1462
    .line 1463
    const-string v6, "showFailureSnackbar()V"

    .line 1464
    .line 1465
    const/4 v8, 0x3

    .line 1466
    invoke-direct/range {v1 .. v8}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v10}, Lm52;->f()Lu42;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v2

    .line 1473
    invoke-virtual {v2, v9, v0}, Lu42;->e(Ljava/lang/String;Lsu/happ/proxyutility/dto/ExcludeSettingsCache;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    if-nez v2, :cond_43

    .line 1482
    .line 1483
    check-cast v0, Ldn8;

    .line 1484
    .line 1485
    invoke-virtual {v11}, Lub;->invoke()Ljava/lang/Object;

    .line 1486
    .line 1487
    .line 1488
    goto :goto_23

    .line 1489
    :cond_43
    invoke-virtual {v1}, Lub;->invoke()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    :goto_23
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1493
    .line 1494
    return-object v0

    .line 1495
    :pswitch_15
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1496
    .line 1497
    check-cast v0, Lun1;

    .line 1498
    .line 1499
    check-cast v1, Llp2;

    .line 1500
    .line 1501
    check-cast v2, Ljava/lang/Integer;

    .line 1502
    .line 1503
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1504
    .line 1505
    .line 1506
    invoke-static {v5}, Lw79;->P(I)I

    .line 1507
    .line 1508
    .line 1509
    move-result v2

    .line 1510
    invoke-virtual {v0, v2, v1}, Lun1;->a(ILlp2;)V

    .line 1511
    .line 1512
    .line 1513
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1514
    .line 1515
    return-object v0

    .line 1516
    :pswitch_16
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1517
    .line 1518
    check-cast v0, Ln38;

    .line 1519
    .line 1520
    check-cast v1, Llp2;

    .line 1521
    .line 1522
    check-cast v2, Ljava/lang/Integer;

    .line 1523
    .line 1524
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1525
    .line 1526
    .line 1527
    const v2, 0x27b3a34e

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v1, v2}, Llp2;->W(I)V

    .line 1531
    .line 1532
    .line 1533
    iget-object v0, v0, Ln38;->b:Ljava/lang/String;

    .line 1534
    .line 1535
    invoke-virtual {v1, v4}, Llp2;->p(Z)V

    .line 1536
    .line 1537
    .line 1538
    return-object v0

    .line 1539
    :pswitch_17
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v0, Lp91;

    .line 1542
    .line 1543
    check-cast v1, Ljava/lang/Integer;

    .line 1544
    .line 1545
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    instance-of v1, v2, Ljz0;

    .line 1549
    .line 1550
    if-eqz v1, :cond_45

    .line 1551
    .line 1552
    move-object v1, v2

    .line 1553
    check-cast v1, Ljz0;

    .line 1554
    .line 1555
    iget-object v3, v0, Lp91;->h:Ljava/lang/Object;

    .line 1556
    .line 1557
    check-cast v3, Lt05;

    .line 1558
    .line 1559
    if-nez v3, :cond_44

    .line 1560
    .line 1561
    sget-object v3, Lvw6;->a:Lt05;

    .line 1562
    .line 1563
    new-instance v3, Lt05;

    .line 1564
    .line 1565
    invoke-direct {v3}, Lt05;-><init>()V

    .line 1566
    .line 1567
    .line 1568
    iput-object v3, v0, Lp91;->h:Ljava/lang/Object;

    .line 1569
    .line 1570
    :cond_44
    invoke-virtual {v3, v1}, Lt05;->k(Ljava/lang/Object;)V

    .line 1571
    .line 1572
    .line 1573
    iget-object v3, v0, Lp91;->f:Ljava/lang/Object;

    .line 1574
    .line 1575
    check-cast v3, Lc15;

    .line 1576
    .line 1577
    invoke-virtual {v3, v1}, Lc15;->b(Ljava/lang/Object;)V

    .line 1578
    .line 1579
    .line 1580
    :cond_45
    instance-of v1, v2, Lpp2;

    .line 1581
    .line 1582
    if-eqz v1, :cond_46

    .line 1583
    .line 1584
    move-object v1, v2

    .line 1585
    check-cast v1, Lpp2;

    .line 1586
    .line 1587
    invoke-virtual {v0, v1}, Lp91;->f(Lpp2;)V

    .line 1588
    .line 1589
    .line 1590
    :cond_46
    instance-of v0, v2, Lj86;

    .line 1591
    .line 1592
    if-eqz v0, :cond_47

    .line 1593
    .line 1594
    move-object v0, v2

    .line 1595
    check-cast v0, Lj86;

    .line 1596
    .line 1597
    invoke-virtual {v0}, Lj86;->c()V

    .line 1598
    .line 1599
    .line 1600
    :cond_47
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1601
    .line 1602
    return-object v0

    .line 1603
    :pswitch_18
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1604
    .line 1605
    check-cast v0, Llp2;

    .line 1606
    .line 1607
    check-cast v1, Lkx4;

    .line 1608
    .line 1609
    check-cast v2, Lix4;

    .line 1610
    .line 1611
    instance-of v3, v2, Lyz0;

    .line 1612
    .line 1613
    if-eqz v3, :cond_48

    .line 1614
    .line 1615
    check-cast v2, Lyz0;

    .line 1616
    .line 1617
    iget-object v2, v2, Lyz0;->m0:Lsn2;

    .line 1618
    .line 1619
    invoke-static {v13, v2}, Lci8;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    sget-object v3, Lhx4;->X:Lhx4;

    .line 1623
    .line 1624
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v4

    .line 1628
    invoke-interface {v2, v3, v0, v4}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    check-cast v2, Lkx4;

    .line 1633
    .line 1634
    invoke-static {v0, v2}, Lw45;->P(Llp2;Lkx4;)Lkx4;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v2

    .line 1638
    :cond_48
    invoke-interface {v1, v2}, Lkx4;->y(Lkx4;)Lkx4;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v0

    .line 1642
    return-object v0

    .line 1643
    :pswitch_19
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1644
    .line 1645
    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    .line 1646
    .line 1647
    check-cast v1, Llp2;

    .line 1648
    .line 1649
    check-cast v2, Ljava/lang/Integer;

    .line 1650
    .line 1651
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1652
    .line 1653
    .line 1654
    sget v2, Landroidx/compose/ui/platform/ComposeView;->r0:I

    .line 1655
    .line 1656
    invoke-static {v5}, Lw79;->P(I)I

    .line 1657
    .line 1658
    .line 1659
    move-result v2

    .line 1660
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ComposeView;->a(ILlp2;)V

    .line 1661
    .line 1662
    .line 1663
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1664
    .line 1665
    return-object v0

    .line 1666
    :pswitch_1a
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1667
    .line 1668
    check-cast v0, Lem7;

    .line 1669
    .line 1670
    check-cast v1, Landroid/graphics/RectF;

    .line 1671
    .line 1672
    check-cast v2, Landroid/graphics/RectF;

    .line 1673
    .line 1674
    invoke-static {v1}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v1

    .line 1678
    invoke-static {v2}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v2

    .line 1682
    iget-byte v0, v0, Lem7;->X:B

    .line 1683
    .line 1684
    packed-switch v0, :pswitch_data_1

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v1}, Ls86;->d()J

    .line 1688
    .line 1689
    .line 1690
    move-result-wide v0

    .line 1691
    invoke-virtual {v2, v0, v1}, Ls86;->a(J)Z

    .line 1692
    .line 1693
    .line 1694
    move-result v0

    .line 1695
    goto :goto_24

    .line 1696
    :pswitch_1b
    invoke-virtual {v1, v2}, Ls86;->i(Ls86;)Z

    .line 1697
    .line 1698
    .line 1699
    move-result v0

    .line 1700
    :goto_24
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v0

    .line 1704
    return-object v0

    .line 1705
    :pswitch_1c
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v0, Lmy6;

    .line 1708
    .line 1709
    check-cast v1, Ljava/lang/Float;

    .line 1710
    .line 1711
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1712
    .line 1713
    .line 1714
    move-result v1

    .line 1715
    check-cast v2, Ljava/lang/Float;

    .line 1716
    .line 1717
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 1718
    .line 1719
    .line 1720
    move-result v2

    .line 1721
    invoke-virtual {v0}, Ljx4;->M0()Lb71;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v3

    .line 1725
    new-instance v4, Lw2;

    .line 1726
    .line 1727
    invoke-direct {v4, v0, v1, v2, v15}, Lw2;-><init>(Lmy6;FFLq51;)V

    .line 1728
    .line 1729
    .line 1730
    invoke-static {v3, v15, v15, v4, v13}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 1731
    .line 1732
    .line 1733
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1734
    .line 1735
    return-object v0

    .line 1736
    :pswitch_1d
    iget-object v0, v0, Lb1;->Y:Ljava/lang/Object;

    .line 1737
    .line 1738
    check-cast v0, Landroidx/compose/ui/platform/AbstractComposeView;

    .line 1739
    .line 1740
    check-cast v1, Llp2;

    .line 1741
    .line 1742
    check-cast v2, Ljava/lang/Integer;

    .line 1743
    .line 1744
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1745
    .line 1746
    .line 1747
    move-result v2

    .line 1748
    sget v3, Landroidx/compose/ui/platform/AbstractComposeView;->o0:I

    .line 1749
    .line 1750
    and-int/lit8 v3, v2, 0x3

    .line 1751
    .line 1752
    if-eq v3, v14, :cond_49

    .line 1753
    .line 1754
    move v3, v5

    .line 1755
    goto :goto_25

    .line 1756
    :cond_49
    move v3, v4

    .line 1757
    :goto_25
    and-int/2addr v2, v5

    .line 1758
    invoke-virtual {v1, v2, v3}, Llp2;->N(IZ)Z

    .line 1759
    .line 1760
    .line 1761
    move-result v2

    .line 1762
    if-eqz v2, :cond_4a

    .line 1763
    .line 1764
    invoke-virtual {v0, v4, v1}, Landroidx/compose/ui/platform/AbstractComposeView;->a(ILlp2;)V

    .line 1765
    .line 1766
    .line 1767
    goto :goto_26

    .line 1768
    :cond_4a
    invoke-virtual {v1}, Llp2;->Q()V

    .line 1769
    .line 1770
    .line 1771
    :goto_26
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1772
    .line 1773
    return-object v0

    .line 1774
    nop

    .line 1775
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
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

    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1b
    .end packed-switch
.end method

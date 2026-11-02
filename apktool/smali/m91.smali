.class public final Lm91;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu06;


# instance fields
.field public final synthetic X:B

.field public final Y:B

.field public final Z:Ljava/lang/Object;

.field public final f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lm91;->X:B

    .line 2
    .line 3
    iput-object p3, p0, Lm91;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Lm91;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    iput-byte p2, p0, Lm91;->Y:B

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lm91;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-byte v1, v0, Lm91;->Y:B

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_1

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :pswitch_0
    new-instance v0, Lqt2;

    .line 24
    .line 25
    invoke-direct {v0}, Lqt2;-><init>()V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :pswitch_1
    new-instance v1, Lu51;

    .line 31
    .line 32
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lq91;

    .line 35
    .line 36
    iget-object v2, v2, Lq91;->e:Lyr2;

    .line 37
    .line 38
    invoke-virtual {v2}, Lyr2;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lit2;

    .line 43
    .line 44
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Lq91;

    .line 47
    .line 48
    iget-object v3, v3, Lq91;->c:Lu06;

    .line 49
    .line 50
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljj0;

    .line 55
    .line 56
    iget-object v4, v0, Lm91;->f0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lq91;

    .line 59
    .line 60
    iget-object v4, v4, Lq91;->q:Lu06;

    .line 61
    .line 62
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lqt2;

    .line 67
    .line 68
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lq91;

    .line 71
    .line 72
    iget-object v0, v0, Lq91;->d:Lu06;

    .line 73
    .line 74
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lkc4;

    .line 79
    .line 80
    invoke-direct {v1, v2, v3, v4, v0}, Lu51;-><init>(Lit2;Ljj0;Lqt2;Lkc4;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    move-object v0, v1

    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :pswitch_2
    new-instance v1, Lsi0;

    .line 87
    .line 88
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lq91;

    .line 91
    .line 92
    iget-object v2, v2, Lq91;->m:Lu06;

    .line 93
    .line 94
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Llt2;

    .line 99
    .line 100
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Lq91;

    .line 103
    .line 104
    iget-object v3, v3, Lq91;->e:Lyr2;

    .line 105
    .line 106
    invoke-virtual {v3}, Lyr2;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lit2;

    .line 111
    .line 112
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lq91;

    .line 115
    .line 116
    iget-object v0, v0, Lq91;->n:Lu06;

    .line 117
    .line 118
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lb71;

    .line 123
    .line 124
    invoke-direct {v1, v2, v3, v0}, Lsi0;-><init>(Llt2;Lit2;Lb71;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_3
    iget-object v1, v0, Lm91;->Z:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lr91;

    .line 131
    .line 132
    iget-object v1, v1, Lr91;->f:Lu06;

    .line 133
    .line 134
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Ls98;

    .line 139
    .line 140
    iget-object v0, v0, Lm91;->Z:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lr91;

    .line 143
    .line 144
    iget-object v0, v0, Lr91;->d:Lu06;

    .line 145
    .line 146
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lbm3;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v2, Low7;

    .line 159
    .line 160
    invoke-direct {v2, v0}, Ldm3;-><init>(Lbm3;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v1, Ls98;->h:Lu61;

    .line 164
    .line 165
    new-instance v1, Lx61;

    .line 166
    .line 167
    const-string v3, "CXCP-Graph"

    .line 168
    .line 169
    invoke-direct {v1, v3}, Lx61;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v2, v0}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    goto/16 :goto_5

    .line 185
    .line 186
    :pswitch_4
    new-instance v0, Llt2;

    .line 187
    .line 188
    invoke-direct {v0}, Llt2;-><init>()V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_5

    .line 192
    .line 193
    :pswitch_5
    new-instance v1, Lri0;

    .line 194
    .line 195
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, Lq91;

    .line 198
    .line 199
    iget-object v2, v2, Lq91;->m:Lu06;

    .line 200
    .line 201
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    check-cast v2, Llt2;

    .line 206
    .line 207
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v3, Lq91;

    .line 210
    .line 211
    iget-object v3, v3, Lq91;->e:Lyr2;

    .line 212
    .line 213
    invoke-virtual {v3}, Lyr2;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    check-cast v3, Lit2;

    .line 218
    .line 219
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lq91;

    .line 222
    .line 223
    iget-object v0, v0, Lq91;->n:Lu06;

    .line 224
    .line 225
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Lb71;

    .line 230
    .line 231
    invoke-direct {v1, v2, v3, v0}, Lri0;-><init>(Llt2;Lit2;Lb71;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :pswitch_6
    const-wide v0, 0x7fffffffffffffffL

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    move-wide v5, v0

    .line 242
    move v2, v4

    .line 243
    :goto_1
    if-ge v2, v3, :cond_1

    .line 244
    .line 245
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 246
    .line 247
    .line 248
    move-result-wide v7

    .line 249
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 250
    .line 251
    .line 252
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 253
    .line 254
    .line 255
    move-result-wide v9

    .line 256
    sub-long/2addr v9, v7

    .line 257
    cmp-long v7, v9, v5

    .line 258
    .line 259
    if-gez v7, :cond_0

    .line 260
    .line 261
    move-wide v5, v9

    .line 262
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_1
    :goto_2
    if-ge v4, v3, :cond_3

    .line 266
    .line 267
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 268
    .line 269
    .line 270
    move-result-wide v5

    .line 271
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 272
    .line 273
    .line 274
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 275
    .line 276
    .line 277
    move-result-wide v7

    .line 278
    sub-long/2addr v7, v5

    .line 279
    cmp-long v2, v7, v0

    .line 280
    .line 281
    if-gez v2, :cond_2

    .line 282
    .line 283
    move-wide v0, v7

    .line 284
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_3
    new-instance v0, Lg08;

    .line 288
    .line 289
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_5

    .line 293
    .line 294
    :pswitch_7
    new-instance v0, Lhm2;

    .line 295
    .line 296
    invoke-direct {v0}, Lhm2;-><init>()V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_5

    .line 300
    .line 301
    :pswitch_8
    iget-object v1, v0, Lm91;->f0:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Lq91;

    .line 304
    .line 305
    iget-object v1, v1, Lq91;->f:Lyr2;

    .line 306
    .line 307
    invoke-virtual {v1}, Lyr2;->get()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lcl7;

    .line 312
    .line 313
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v2, Lq91;

    .line 316
    .line 317
    iget-object v2, v2, Lq91;->g:Lyr2;

    .line 318
    .line 319
    iget-object v0, v0, Lm91;->Z:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Lr91;

    .line 322
    .line 323
    iget-object v0, v0, Lr91;->z:Lu06;

    .line 324
    .line 325
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    check-cast v0, Ljl0;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v3, Lyx7;

    .line 341
    .line 342
    iget-object v4, v1, Lcl7;->g0:Lip4;

    .line 343
    .line 344
    invoke-direct {v3, v1, v2, v0, v4}, Lyx7;-><init>(Lcl7;Lyr2;Ljl0;Ljava/util/Map;)V

    .line 345
    .line 346
    .line 347
    :goto_3
    move-object v0, v3

    .line 348
    goto/16 :goto_5

    .line 349
    .line 350
    :pswitch_9
    iget-object v1, v0, Lm91;->f0:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v1, Lq91;

    .line 353
    .line 354
    iget-object v2, v1, Lq91;->a:Ldq;

    .line 355
    .line 356
    iget-object v3, v2, Ldq;->Z:Ljava/lang/Object;

    .line 357
    .line 358
    move-object v6, v3

    .line 359
    check-cast v6, Lni0;

    .line 360
    .line 361
    iget-object v2, v2, Ldq;->Y:Ljava/lang/Object;

    .line 362
    .line 363
    move-object v7, v2

    .line 364
    check-cast v7, Lhi0;

    .line 365
    .line 366
    iget-object v1, v1, Lq91;->b:Lu06;

    .line 367
    .line 368
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Lmg0;

    .line 373
    .line 374
    iget-object v2, v0, Lm91;->Z:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v2, Lr91;

    .line 377
    .line 378
    iget-object v2, v2, Lr91;->y:Lu06;

    .line 379
    .line 380
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    check-cast v2, Lyj0;

    .line 385
    .line 386
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v3, Lq91;

    .line 389
    .line 390
    iget-object v3, v3, Lq91;->e:Lyr2;

    .line 391
    .line 392
    invoke-virtual {v3}, Lyr2;->get()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    move-object v8, v3

    .line 397
    check-cast v8, Lit2;

    .line 398
    .line 399
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v3, Lq91;

    .line 402
    .line 403
    iget-object v3, v3, Lq91;->f:Lyr2;

    .line 404
    .line 405
    invoke-virtual {v3}, Lyr2;->get()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    move-object v9, v3

    .line 410
    check-cast v9, Lcl7;

    .line 411
    .line 412
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v0, Lq91;

    .line 415
    .line 416
    iget-object v0, v0, Lq91;->h:Lu06;

    .line 417
    .line 418
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    move-object v10, v0

    .line 423
    check-cast v10, Lyx7;

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    move-object v5, v1

    .line 441
    check-cast v5, Lre0;

    .line 442
    .line 443
    iget-object v0, v5, Lre0;->e:Lyr2;

    .line 444
    .line 445
    new-instance v4, Lfu6;

    .line 446
    .line 447
    move-object v11, v5

    .line 448
    invoke-direct/range {v4 .. v11}, Lfu6;-><init>(Lre0;Lni0;Lhi0;Lit2;Lcl7;Lyx7;Lre0;)V

    .line 449
    .line 450
    .line 451
    new-instance v1, Lp91;

    .line 452
    .line 453
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lr91;

    .line 456
    .line 457
    invoke-direct {v1, v0, v4}, Lp91;-><init>(Lr91;Lfu6;)V

    .line 458
    .line 459
    .line 460
    iget-object v0, v1, Lp91;->f:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Lu06;

    .line 463
    .line 464
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    check-cast v0, Lef0;

    .line 469
    .line 470
    iget-object v1, v5, Lre0;->f:Ljava/lang/Object;

    .line 471
    .line 472
    monitor-enter v1

    .line 473
    :try_start_0
    iget-object v2, v5, Lre0;->g:Ljava/util/LinkedHashSet;

    .line 474
    .line 475
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    .line 477
    .line 478
    monitor-exit v1

    .line 479
    invoke-static {v0}, Lhi5;->R(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_5

    .line 483
    .line 484
    :catchall_0
    move-exception v0

    .line 485
    monitor-exit v1

    .line 486
    throw v0

    .line 487
    :pswitch_a
    new-instance v1, Lcl7;

    .line 488
    .line 489
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v2, Lq91;

    .line 492
    .line 493
    iget-object v2, v2, Lq91;->c:Lu06;

    .line 494
    .line 495
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    check-cast v2, Ljj0;

    .line 500
    .line 501
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v3, Lq91;

    .line 504
    .line 505
    iget-object v3, v3, Lq91;->a:Ldq;

    .line 506
    .line 507
    iget-object v3, v3, Ldq;->Y:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v3, Lhi0;

    .line 510
    .line 511
    iget-object v4, v0, Lm91;->Z:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v4, Lr91;

    .line 514
    .line 515
    new-instance v5, Lk32;

    .line 516
    .line 517
    iget-object v4, v4, Lr91;->f:Lu06;

    .line 518
    .line 519
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    check-cast v4, Ls98;

    .line 524
    .line 525
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 529
    .line 530
    .line 531
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Lq91;

    .line 534
    .line 535
    iget-object v0, v0, Lq91;->g:Lyr2;

    .line 536
    .line 537
    invoke-direct {v1, v2, v3, v5, v0}, Lcl7;-><init>(Ljj0;Lhi0;Lk32;Lyr2;)V

    .line 538
    .line 539
    .line 540
    goto/16 :goto_0

    .line 541
    .line 542
    :pswitch_b
    iget-object v1, v0, Lm91;->f0:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v1, Lq91;

    .line 545
    .line 546
    iget-object v1, v1, Lq91;->f:Lyr2;

    .line 547
    .line 548
    invoke-virtual {v1}, Lyr2;->get()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    check-cast v1, Lcl7;

    .line 553
    .line 554
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v2, Lq91;

    .line 557
    .line 558
    iget-object v2, v2, Lq91;->i:Lu06;

    .line 559
    .line 560
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    check-cast v2, Lhm2;

    .line 565
    .line 566
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v3, Lq91;

    .line 569
    .line 570
    iget-object v3, v3, Lq91;->c:Lu06;

    .line 571
    .line 572
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    check-cast v3, Ljj0;

    .line 577
    .line 578
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Lq91;

    .line 581
    .line 582
    iget-object v0, v0, Lq91;->j:Lu06;

    .line 583
    .line 584
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    check-cast v0, Lg08;

    .line 589
    .line 590
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_TIMESTAMP_SOURCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    check-cast v3, Llf0;

    .line 608
    .line 609
    invoke-virtual {v3, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    check-cast v0, Ljava/lang/Integer;

    .line 614
    .line 615
    if-nez v0, :cond_4

    .line 616
    .line 617
    goto :goto_4

    .line 618
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    :goto_4
    new-instance v0, Ljm2;

    .line 623
    .line 624
    invoke-direct {v0, v1, v2}, Ljm2;-><init>(Lcl7;Lhm2;)V

    .line 625
    .line 626
    .line 627
    goto/16 :goto_5

    .line 628
    .line 629
    :pswitch_c
    iget-object v1, v0, Lm91;->f0:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v1, Lq91;

    .line 632
    .line 633
    iget-object v2, v1, Lq91;->a:Ldq;

    .line 634
    .line 635
    iget-object v2, v2, Ldq;->Y:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v2, Lhi0;

    .line 638
    .line 639
    iget-object v1, v1, Lq91;->d:Lu06;

    .line 640
    .line 641
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    check-cast v1, Lkc4;

    .line 646
    .line 647
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v0, Lq91;

    .line 650
    .line 651
    iget-object v0, v0, Lq91;->k:Lu06;

    .line 652
    .line 653
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    check-cast v0, Ljm2;

    .line 658
    .line 659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    new-array v3, v5, [Lme6;

    .line 666
    .line 667
    aput-object v1, v3, v4

    .line 668
    .line 669
    invoke-static {v3}, Li21;->N([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    iget-object v0, v2, Lhi0;->j:Ljava/util/List;

    .line 680
    .line 681
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 682
    .line 683
    .line 684
    goto/16 :goto_3

    .line 685
    .line 686
    :pswitch_d
    new-instance v0, Lkc4;

    .line 687
    .line 688
    invoke-direct {v0}, Lkc4;-><init>()V

    .line 689
    .line 690
    .line 691
    goto/16 :goto_5

    .line 692
    .line 693
    :pswitch_e
    new-instance v1, Lit2;

    .line 694
    .line 695
    iget-object v2, v0, Lm91;->Z:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v2, Lr91;

    .line 698
    .line 699
    iget-object v2, v2, Lr91;->f:Lu06;

    .line 700
    .line 701
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    check-cast v2, Ls98;

    .line 706
    .line 707
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v3, Lq91;

    .line 710
    .line 711
    iget-object v4, v3, Lq91;->a:Ldq;

    .line 712
    .line 713
    iget-object v5, v4, Ldq;->Z:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v5, Lni0;

    .line 716
    .line 717
    iget-object v4, v4, Ldq;->Y:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v4, Lhi0;

    .line 720
    .line 721
    iget-object v3, v3, Lq91;->d:Lu06;

    .line 722
    .line 723
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    check-cast v3, Lkc4;

    .line 728
    .line 729
    iget-object v6, v0, Lm91;->f0:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v6, Lq91;

    .line 732
    .line 733
    iget-object v6, v6, Lq91;->l:Lu06;

    .line 734
    .line 735
    invoke-interface {v6}, Lv06;->get()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v6

    .line 739
    check-cast v6, Ljava/util/List;

    .line 740
    .line 741
    iget-object v0, v0, Lm91;->Z:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v0, Lr91;

    .line 744
    .line 745
    iget-object v0, v0, Lr91;->p:Lu06;

    .line 746
    .line 747
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    move-object v7, v0

    .line 752
    check-cast v7, Ljg0;

    .line 753
    .line 754
    move-object/from16 v21, v5

    .line 755
    .line 756
    move-object v5, v3

    .line 757
    move-object/from16 v3, v21

    .line 758
    .line 759
    invoke-direct/range {v1 .. v7}, Lit2;-><init>(Ls98;Lni0;Lhi0;Lkc4;Ljava/util/List;Ljg0;)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_0

    .line 763
    .line 764
    :pswitch_f
    iget-object v1, v0, Lm91;->Z:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v1, Lr91;

    .line 767
    .line 768
    iget-object v1, v1, Lr91;->w:Lu06;

    .line 769
    .line 770
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    check-cast v1, Log0;

    .line 775
    .line 776
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v2, Lq91;

    .line 779
    .line 780
    iget-object v2, v2, Lq91;->a:Ldq;

    .line 781
    .line 782
    iget-object v0, v0, Lm91;->Z:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Lr91;

    .line 785
    .line 786
    iget-object v0, v0, Lr91;->y:Lu06;

    .line 787
    .line 788
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    check-cast v0, Lyj0;

    .line 793
    .line 794
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    iget-object v0, v1, Log0;->d:Lmg0;

    .line 801
    .line 802
    invoke-static {v0}, Lhi5;->R(Ljava/lang/Object;)V

    .line 803
    .line 804
    .line 805
    goto/16 :goto_5

    .line 806
    .line 807
    :pswitch_10
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v0, Lq91;

    .line 810
    .line 811
    iget-object v1, v0, Lq91;->a:Ldq;

    .line 812
    .line 813
    iget-object v1, v1, Ldq;->Y:Ljava/lang/Object;

    .line 814
    .line 815
    check-cast v1, Lhi0;

    .line 816
    .line 817
    iget-object v0, v0, Lq91;->b:Lu06;

    .line 818
    .line 819
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    check-cast v0, Lmg0;

    .line 824
    .line 825
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    iget-object v1, v1, Lhi0;->a:Ljava/lang/String;

    .line 829
    .line 830
    check-cast v0, Lre0;

    .line 831
    .line 832
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    iget-object v0, v0, Lre0;->c:Lhg0;

    .line 836
    .line 837
    invoke-virtual {v0, v1}, Lhg0;->a(Ljava/lang/String;)Ljj0;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    goto/16 :goto_5

    .line 842
    .line 843
    :pswitch_11
    new-instance v1, Lqi0;

    .line 844
    .line 845
    iget-object v2, v0, Lm91;->f0:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v2, Lq91;

    .line 848
    .line 849
    iget-object v3, v2, Lq91;->a:Ldq;

    .line 850
    .line 851
    iget-object v3, v3, Ldq;->Y:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v3, Lhi0;

    .line 854
    .line 855
    iget-object v2, v2, Lq91;->c:Lu06;

    .line 856
    .line 857
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    check-cast v2, Ljj0;

    .line 862
    .line 863
    iget-object v4, v0, Lm91;->f0:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v4, Lq91;

    .line 866
    .line 867
    iget-object v4, v4, Lq91;->e:Lyr2;

    .line 868
    .line 869
    invoke-virtual {v4}, Lyr2;->get()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    check-cast v4, Lit2;

    .line 874
    .line 875
    iget-object v5, v0, Lm91;->f0:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v5, Lq91;

    .line 878
    .line 879
    iget-object v5, v5, Lq91;->e:Lyr2;

    .line 880
    .line 881
    invoke-virtual {v5}, Lyr2;->get()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    check-cast v5, Lit2;

    .line 886
    .line 887
    iget-object v6, v0, Lm91;->f0:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v6, Lq91;

    .line 890
    .line 891
    iget-object v6, v6, Lq91;->f:Lyr2;

    .line 892
    .line 893
    invoke-virtual {v6}, Lyr2;->get()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v6

    .line 897
    check-cast v6, Lcl7;

    .line 898
    .line 899
    iget-object v7, v0, Lm91;->f0:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v7, Lq91;

    .line 902
    .line 903
    iget-object v7, v7, Lq91;->h:Lu06;

    .line 904
    .line 905
    invoke-interface {v7}, Lv06;->get()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v7

    .line 909
    check-cast v7, Lyx7;

    .line 910
    .line 911
    iget-object v8, v0, Lm91;->f0:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v8, Lq91;

    .line 914
    .line 915
    iget-object v8, v8, Lq91;->g:Lyr2;

    .line 916
    .line 917
    invoke-virtual {v8}, Lyr2;->get()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v8

    .line 921
    check-cast v8, Lef0;

    .line 922
    .line 923
    iget-object v9, v0, Lm91;->f0:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast v9, Lq91;

    .line 926
    .line 927
    iget-object v9, v9, Lq91;->k:Lu06;

    .line 928
    .line 929
    invoke-interface {v9}, Lv06;->get()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v9

    .line 933
    check-cast v9, Ljm2;

    .line 934
    .line 935
    iget-object v10, v0, Lm91;->f0:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v10, Lq91;

    .line 938
    .line 939
    iget-object v10, v10, Lq91;->i:Lu06;

    .line 940
    .line 941
    invoke-interface {v10}, Lv06;->get()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v10

    .line 945
    check-cast v10, Lhm2;

    .line 946
    .line 947
    iget-object v11, v0, Lm91;->Z:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v11, Lr91;

    .line 950
    .line 951
    iget-object v11, v11, Lr91;->r:Lu06;

    .line 952
    .line 953
    invoke-interface {v11}, Lv06;->get()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v11

    .line 957
    check-cast v11, Lpw;

    .line 958
    .line 959
    iget-object v12, v0, Lm91;->f0:Ljava/lang/Object;

    .line 960
    .line 961
    check-cast v12, Lq91;

    .line 962
    .line 963
    iget-object v13, v12, Lq91;->a:Ldq;

    .line 964
    .line 965
    iget-object v13, v13, Ldq;->Z:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v13, Lni0;

    .line 968
    .line 969
    iget-object v12, v12, Lq91;->o:Lu06;

    .line 970
    .line 971
    invoke-interface {v12}, Lv06;->get()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v12

    .line 975
    check-cast v12, Lri0;

    .line 976
    .line 977
    iget-object v14, v0, Lm91;->f0:Ljava/lang/Object;

    .line 978
    .line 979
    check-cast v14, Lq91;

    .line 980
    .line 981
    iget-object v14, v14, Lq91;->p:Lu06;

    .line 982
    .line 983
    invoke-interface {v14}, Lv06;->get()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v14

    .line 987
    check-cast v14, Lsi0;

    .line 988
    .line 989
    iget-object v15, v0, Lm91;->f0:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v15, Lq91;

    .line 992
    .line 993
    iget-object v15, v15, Lq91;->m:Lu06;

    .line 994
    .line 995
    invoke-interface {v15}, Lv06;->get()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v15

    .line 999
    check-cast v15, Llt2;

    .line 1000
    .line 1001
    move-object/from16 v16, v1

    .line 1002
    .line 1003
    iget-object v1, v0, Lm91;->f0:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v1, Lq91;

    .line 1006
    .line 1007
    iget-object v1, v1, Lq91;->n:Lu06;

    .line 1008
    .line 1009
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    check-cast v1, Lb71;

    .line 1014
    .line 1015
    iget-object v0, v0, Lm91;->f0:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v0, Lq91;

    .line 1018
    .line 1019
    iget-object v0, v0, Lq91;->r:Lu06;

    .line 1020
    .line 1021
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    move-object/from16 v17, v0

    .line 1026
    .line 1027
    check-cast v17, Lu51;

    .line 1028
    .line 1029
    move-object/from16 v21, v16

    .line 1030
    .line 1031
    move-object/from16 v16, v1

    .line 1032
    .line 1033
    move-object/from16 v1, v21

    .line 1034
    .line 1035
    move-object/from16 v21, v3

    .line 1036
    .line 1037
    move-object v3, v2

    .line 1038
    move-object/from16 v2, v21

    .line 1039
    .line 1040
    move-object/from16 v21, v13

    .line 1041
    .line 1042
    move-object v13, v12

    .line 1043
    move-object/from16 v12, v21

    .line 1044
    .line 1045
    invoke-direct/range {v1 .. v17}, Lqi0;-><init>(Lhi0;Ljj0;Lit2;Lit2;Lcl7;Lyx7;Lef0;Ljm2;Lhm2;Lpw;Lni0;Lri0;Lsi0;Llt2;Lb71;Lu51;)V

    .line 1046
    .line 1047
    .line 1048
    move-object/from16 v16, v1

    .line 1049
    .line 1050
    move-object/from16 v0, v16

    .line 1051
    .line 1052
    :goto_5
    return-object v0

    .line 1053
    :pswitch_12
    iget-object v1, v0, Lm91;->Z:Ljava/lang/Object;

    .line 1054
    .line 1055
    check-cast v1, Lr91;

    .line 1056
    .line 1057
    iget-object v3, v0, Lm91;->f0:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v3, Lp91;

    .line 1060
    .line 1061
    iget-object v6, v3, Lp91;->a:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v6, Lfu6;

    .line 1064
    .line 1065
    iget-byte v0, v0, Lm91;->Y:B

    .line 1066
    .line 1067
    packed-switch v0, :pswitch_data_2

    .line 1068
    .line 1069
    .line 1070
    new-instance v1, Ljava/lang/AssertionError;

    .line 1071
    .line 1072
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(I)V

    .line 1073
    .line 1074
    .line 1075
    throw v1

    .line 1076
    :pswitch_13
    new-instance v2, Lwd;

    .line 1077
    .line 1078
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 1079
    .line 1080
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    move-object v3, v0

    .line 1085
    check-cast v3, Ls98;

    .line 1086
    .line 1087
    iget-object v0, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1088
    .line 1089
    move-object v4, v0

    .line 1090
    check-cast v4, Lhi0;

    .line 1091
    .line 1092
    iget-object v0, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1093
    .line 1094
    move-object v5, v0

    .line 1095
    check-cast v5, Lcl7;

    .line 1096
    .line 1097
    iget-object v0, v1, Lr91;->n:Lu06;

    .line 1098
    .line 1099
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    move-object v6, v0

    .line 1104
    check-cast v6, Lig0;

    .line 1105
    .line 1106
    iget-object v0, v1, Lr91;->o:Lu06;

    .line 1107
    .line 1108
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    move-object v7, v0

    .line 1113
    check-cast v7, Ltl7;

    .line 1114
    .line 1115
    invoke-direct/range {v2 .. v7}, Lwd;-><init>(Ls98;Lhi0;Lcl7;Lig0;Ltl7;)V

    .line 1116
    .line 1117
    .line 1118
    goto/16 :goto_6

    .line 1119
    .line 1120
    :pswitch_14
    new-instance v2, Lcf;

    .line 1121
    .line 1122
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 1123
    .line 1124
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    check-cast v0, Ls98;

    .line 1129
    .line 1130
    iget-object v1, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1131
    .line 1132
    check-cast v1, Lhi0;

    .line 1133
    .line 1134
    iget-object v3, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v3, Lcl7;

    .line 1137
    .line 1138
    invoke-direct {v2, v0, v1, v3}, Lcf;-><init>(Ls98;Lhi0;Lcl7;)V

    .line 1139
    .line 1140
    .line 1141
    goto/16 :goto_6

    .line 1142
    .line 1143
    :pswitch_15
    new-instance v2, Lue;

    .line 1144
    .line 1145
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 1146
    .line 1147
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    check-cast v0, Ls98;

    .line 1152
    .line 1153
    iget-object v1, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v1, Lcl7;

    .line 1156
    .line 1157
    iget-object v3, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1158
    .line 1159
    check-cast v3, Lhi0;

    .line 1160
    .line 1161
    invoke-direct {v2, v0, v1, v3, v5}, Lue;-><init>(Ls98;Lcl7;Lhi0;B)V

    .line 1162
    .line 1163
    .line 1164
    goto/16 :goto_6

    .line 1165
    .line 1166
    :pswitch_16
    new-instance v2, Lte;

    .line 1167
    .line 1168
    iget-object v0, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1169
    .line 1170
    check-cast v0, Lcl7;

    .line 1171
    .line 1172
    iget-object v1, v1, Lr91;->f:Lu06;

    .line 1173
    .line 1174
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    check-cast v1, Ls98;

    .line 1179
    .line 1180
    invoke-direct {v2, v0, v1}, Lte;-><init>(Lcl7;Ls98;)V

    .line 1181
    .line 1182
    .line 1183
    goto/16 :goto_6

    .line 1184
    .line 1185
    :pswitch_17
    new-instance v2, Lue;

    .line 1186
    .line 1187
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 1188
    .line 1189
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    check-cast v0, Ls98;

    .line 1194
    .line 1195
    iget-object v1, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v1, Lcl7;

    .line 1198
    .line 1199
    iget-object v3, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1200
    .line 1201
    check-cast v3, Lhi0;

    .line 1202
    .line 1203
    invoke-direct {v2, v0, v1, v3, v4}, Lue;-><init>(Ls98;Lcl7;Lhi0;B)V

    .line 1204
    .line 1205
    .line 1206
    goto/16 :goto_6

    .line 1207
    .line 1208
    :pswitch_18
    iget-object v0, v3, Lp91;->g:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v0, Lm91;

    .line 1211
    .line 1212
    iget-object v1, v3, Lp91;->h:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v1, Lm91;

    .line 1215
    .line 1216
    iget-object v4, v3, Lp91;->i:Ljava/lang/Object;

    .line 1217
    .line 1218
    check-cast v4, Lm91;

    .line 1219
    .line 1220
    iget-object v7, v3, Lp91;->j:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v7, Lm91;

    .line 1223
    .line 1224
    iget-object v3, v3, Lp91;->k:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v3, Lm91;

    .line 1227
    .line 1228
    iget-object v6, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v6, Lhi0;

    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1245
    .line 1246
    .line 1247
    iget v0, v6, Lhi0;->h:I

    .line 1248
    .line 1249
    const/4 v6, 0x2

    .line 1250
    if-ne v0, v6, :cond_6

    .line 1251
    .line 1252
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1253
    .line 1254
    const/16 v1, 0x1f

    .line 1255
    .line 1256
    if-lt v0, v1, :cond_5

    .line 1257
    .line 1258
    invoke-virtual {v3}, Lm91;->get()Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    move-object v2, v0

    .line 1263
    check-cast v2, Lmn0;

    .line 1264
    .line 1265
    goto/16 :goto_6

    .line 1266
    .line 1267
    :cond_5
    const-string v0, "Cannot use Extension sessions below Android S"

    .line 1268
    .line 1269
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    goto/16 :goto_6

    .line 1273
    .line 1274
    :cond_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1275
    .line 1276
    const/16 v3, 0x1c

    .line 1277
    .line 1278
    if-lt v2, v3, :cond_7

    .line 1279
    .line 1280
    invoke-virtual {v7}, Lm91;->get()Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    move-object v2, v0

    .line 1285
    check-cast v2, Lmn0;

    .line 1286
    .line 1287
    goto/16 :goto_6

    .line 1288
    .line 1289
    :cond_7
    if-ne v0, v5, :cond_8

    .line 1290
    .line 1291
    invoke-virtual {v1}, Lm91;->get()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    move-object v2, v0

    .line 1296
    check-cast v2, Lmn0;

    .line 1297
    .line 1298
    goto/16 :goto_6

    .line 1299
    .line 1300
    :cond_8
    invoke-virtual {v4}, Lm91;->get()Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v0

    .line 1304
    move-object v2, v0

    .line 1305
    check-cast v2, Lmn0;

    .line 1306
    .line 1307
    goto/16 :goto_6

    .line 1308
    .line 1309
    :pswitch_19
    iget-object v0, v1, Lr91;->g:Lu06;

    .line 1310
    .line 1311
    iget-object v2, v1, Lr91;->f:Lu06;

    .line 1312
    .line 1313
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v2

    .line 1317
    check-cast v2, Ls98;

    .line 1318
    .line 1319
    iget-object v3, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v3, Lhi0;

    .line 1322
    .line 1323
    iget-object v1, v1, Lr91;->d:Lu06;

    .line 1324
    .line 1325
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    check-cast v1, Lbm3;

    .line 1330
    .line 1331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1338
    .line 1339
    .line 1340
    new-instance v4, Lnf0;

    .line 1341
    .line 1342
    iget-object v3, v3, Lhi0;->a:Ljava/lang/String;

    .line 1343
    .line 1344
    invoke-direct {v4, v0, v2, v3, v1}, Lnf0;-><init>(Lv06;Ls98;Ljava/lang/String;Lbm3;)V

    .line 1345
    .line 1346
    .line 1347
    move-object v2, v4

    .line 1348
    goto/16 :goto_6

    .line 1349
    .line 1350
    :pswitch_1a
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 1351
    .line 1352
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    check-cast v0, Ls98;

    .line 1357
    .line 1358
    iget-object v1, v1, Lr91;->d:Lu06;

    .line 1359
    .line 1360
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    check-cast v1, Lbm3;

    .line 1365
    .line 1366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1370
    .line 1371
    .line 1372
    new-instance v2, Low7;

    .line 1373
    .line 1374
    invoke-direct {v2, v1}, Ldm3;-><init>(Lbm3;)V

    .line 1375
    .line 1376
    .line 1377
    iget-object v0, v0, Ls98;->h:Lu61;

    .line 1378
    .line 1379
    new-instance v1, Lx61;

    .line 1380
    .line 1381
    const-string v3, "CXCP-Camera2Controller"

    .line 1382
    .line 1383
    invoke-direct {v1, v3}, Lx61;-><init>(Ljava/lang/String;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    invoke-static {v2, v0}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v2

    .line 1398
    goto/16 :goto_6

    .line 1399
    .line 1400
    :pswitch_1b
    new-instance v0, Lef0;

    .line 1401
    .line 1402
    iget-object v2, v3, Lp91;->c:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v2, Lu06;

    .line 1405
    .line 1406
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    move-object v4, v2

    .line 1411
    check-cast v4, Lb71;

    .line 1412
    .line 1413
    iget-object v2, v1, Lr91;->f:Lu06;

    .line 1414
    .line 1415
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    move-object v5, v2

    .line 1420
    check-cast v5, Ls98;

    .line 1421
    .line 1422
    iget-object v2, v1, Lr91;->o:Lu06;

    .line 1423
    .line 1424
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    check-cast v2, Ltl7;

    .line 1429
    .line 1430
    iget-object v7, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v7, Lhi0;

    .line 1433
    .line 1434
    iget-object v8, v6, Lfu6;->f0:Ljava/lang/Object;

    .line 1435
    .line 1436
    check-cast v8, Lit2;

    .line 1437
    .line 1438
    iget-object v9, v6, Lfu6;->h0:Ljava/lang/Object;

    .line 1439
    .line 1440
    check-cast v9, Lyx7;

    .line 1441
    .line 1442
    iget-object v10, v3, Lp91;->d:Ljava/lang/Object;

    .line 1443
    .line 1444
    check-cast v10, Lu06;

    .line 1445
    .line 1446
    invoke-interface {v10}, Lv06;->get()Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v10

    .line 1450
    check-cast v10, Lnf0;

    .line 1451
    .line 1452
    iget-object v11, v3, Lp91;->e:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v11, Lu06;

    .line 1455
    .line 1456
    invoke-interface {v11}, Lv06;->get()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v11

    .line 1460
    check-cast v11, Lmn0;

    .line 1461
    .line 1462
    new-instance v12, Ly5;

    .line 1463
    .line 1464
    iget-object v3, v3, Lp91;->b:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v3, Lr91;

    .line 1467
    .line 1468
    iget-object v13, v3, Lr91;->f:Lu06;

    .line 1469
    .line 1470
    invoke-interface {v13}, Lv06;->get()Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v13

    .line 1474
    check-cast v13, Ls98;

    .line 1475
    .line 1476
    iget-object v14, v6, Lfu6;->Z:Ljava/lang/Object;

    .line 1477
    .line 1478
    check-cast v14, Lhi0;

    .line 1479
    .line 1480
    iget-object v15, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1481
    .line 1482
    check-cast v15, Lcl7;

    .line 1483
    .line 1484
    move-object/from16 p0, v0

    .line 1485
    .line 1486
    iget-object v0, v3, Lr91;->p:Lu06;

    .line 1487
    .line 1488
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    move-object/from16 v16, v0

    .line 1493
    .line 1494
    check-cast v16, Ljg0;

    .line 1495
    .line 1496
    iget-object v0, v3, Lr91;->o:Lu06;

    .line 1497
    .line 1498
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    move-object/from16 v17, v0

    .line 1503
    .line 1504
    check-cast v17, Ltl7;

    .line 1505
    .line 1506
    invoke-direct/range {v12 .. v17}, Ly5;-><init>(Ls98;Lhi0;Lcl7;Ljg0;Ltl7;)V

    .line 1507
    .line 1508
    .line 1509
    iget-object v0, v1, Lr91;->u:Lu06;

    .line 1510
    .line 1511
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    move-object v13, v0

    .line 1516
    check-cast v13, Ls16;

    .line 1517
    .line 1518
    iget-object v0, v1, Lr91;->z:Lu06;

    .line 1519
    .line 1520
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v0

    .line 1524
    move-object v14, v0

    .line 1525
    check-cast v14, Ljl0;

    .line 1526
    .line 1527
    iget-object v0, v1, Lr91;->p:Lu06;

    .line 1528
    .line 1529
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    move-object v15, v0

    .line 1534
    check-cast v15, Ljg0;

    .line 1535
    .line 1536
    iget-object v0, v1, Lr91;->m:Lu06;

    .line 1537
    .line 1538
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    move-object/from16 v16, v0

    .line 1543
    .line 1544
    check-cast v16, Lu08;

    .line 1545
    .line 1546
    iget-object v0, v6, Lfu6;->Y:Ljava/lang/Object;

    .line 1547
    .line 1548
    move-object/from16 v17, v0

    .line 1549
    .line 1550
    check-cast v17, Lni0;

    .line 1551
    .line 1552
    iget-object v0, v6, Lfu6;->i0:Ljava/lang/Object;

    .line 1553
    .line 1554
    move-object/from16 v18, v0

    .line 1555
    .line 1556
    check-cast v18, Lre0;

    .line 1557
    .line 1558
    iget-object v0, v6, Lfu6;->g0:Ljava/lang/Object;

    .line 1559
    .line 1560
    move-object/from16 v19, v0

    .line 1561
    .line 1562
    check-cast v19, Lcl7;

    .line 1563
    .line 1564
    iget-object v0, v1, Lr91;->A:Lu06;

    .line 1565
    .line 1566
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v0

    .line 1570
    move-object/from16 v20, v0

    .line 1571
    .line 1572
    check-cast v20, Lj11;

    .line 1573
    .line 1574
    move-object/from16 v3, p0

    .line 1575
    .line 1576
    move-object v6, v2

    .line 1577
    invoke-direct/range {v3 .. v20}, Lef0;-><init>(Lb71;Ls98;Ltl7;Lhi0;Lit2;Lyx7;Lnf0;Lmn0;Ly5;Ls16;Ljl0;Ljg0;Lu08;Lni0;Lre0;Lcl7;Lj11;)V

    .line 1578
    .line 1579
    .line 1580
    move-object v2, v3

    .line 1581
    :goto_6
    return-object v2

    .line 1582
    :pswitch_1c
    iget-object v1, v0, Lm91;->Z:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v1, Ll91;

    .line 1585
    .line 1586
    iget-object v6, v0, Lm91;->f0:Ljava/lang/Object;

    .line 1587
    .line 1588
    check-cast v6, Ln91;

    .line 1589
    .line 1590
    iget-byte v0, v0, Lm91;->Y:B

    .line 1591
    .line 1592
    packed-switch v0, :pswitch_data_3

    .line 1593
    .line 1594
    .line 1595
    new-instance v1, Ljava/lang/AssertionError;

    .line 1596
    .line 1597
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(I)V

    .line 1598
    .line 1599
    .line 1600
    throw v1

    .line 1601
    :pswitch_1d
    new-instance v2, Loh0;

    .line 1602
    .line 1603
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 1604
    .line 1605
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    move-object v3, v0

    .line 1610
    check-cast v3, Lqj0;

    .line 1611
    .line 1612
    iget-object v0, v6, Ln91;->p:Lu06;

    .line 1613
    .line 1614
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v0

    .line 1618
    move-object v4, v0

    .line 1619
    check-cast v4, Lx32;

    .line 1620
    .line 1621
    iget-object v0, v6, Ln91;->r:Lu06;

    .line 1622
    .line 1623
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    move-object v5, v0

    .line 1628
    check-cast v5, Lpd2;

    .line 1629
    .line 1630
    iget-object v0, v6, Ln91;->s:Lu06;

    .line 1631
    .line 1632
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    check-cast v0, Ldh2;

    .line 1637
    .line 1638
    iget-object v1, v6, Ln91;->t:Lu06;

    .line 1639
    .line 1640
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v1

    .line 1644
    move-object v7, v1

    .line 1645
    check-cast v7, Ltj7;

    .line 1646
    .line 1647
    iget-object v1, v6, Ln91;->q:Lu06;

    .line 1648
    .line 1649
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v1

    .line 1653
    move-object v8, v1

    .line 1654
    check-cast v8, Luc8;

    .line 1655
    .line 1656
    iget-object v1, v6, Ln91;->n:Lu06;

    .line 1657
    .line 1658
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v1

    .line 1662
    move-object v9, v1

    .line 1663
    check-cast v9, Ldj4;

    .line 1664
    .line 1665
    iget-object v1, v6, Ln91;->v:Lu06;

    .line 1666
    .line 1667
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v1

    .line 1671
    move-object v10, v1

    .line 1672
    check-cast v10, Lr79;

    .line 1673
    .line 1674
    iget-object v1, v6, Ln91;->f:Lu06;

    .line 1675
    .line 1676
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v1

    .line 1680
    move-object v11, v1

    .line 1681
    check-cast v11, Lt79;

    .line 1682
    .line 1683
    iget-object v1, v6, Ln91;->x:Lu06;

    .line 1684
    .line 1685
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v1

    .line 1689
    move-object v12, v1

    .line 1690
    check-cast v12, Lxe0;

    .line 1691
    .line 1692
    iget-object v1, v6, Ln91;->H:Lu06;

    .line 1693
    .line 1694
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v1

    .line 1698
    move-object v13, v1

    .line 1699
    check-cast v13, Llr8;

    .line 1700
    .line 1701
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 1702
    .line 1703
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v1

    .line 1707
    move-object v14, v1

    .line 1708
    check-cast v14, Lpr8;

    .line 1709
    .line 1710
    iget-object v1, v6, Ln91;->u:Lu06;

    .line 1711
    .line 1712
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v1

    .line 1716
    move-object v15, v1

    .line 1717
    check-cast v15, Lnv8;

    .line 1718
    .line 1719
    move-object v6, v0

    .line 1720
    invoke-direct/range {v2 .. v15}, Loh0;-><init>(Lqj0;Lx32;Lpd2;Ldh2;Ltj7;Luc8;Ldj4;Lr79;Lt79;Lxe0;Llr8;Lpr8;Lnv8;)V

    .line 1721
    .line 1722
    .line 1723
    goto/16 :goto_10

    .line 1724
    .line 1725
    :pswitch_1e
    new-instance v3, Lmi0;

    .line 1726
    .line 1727
    iget-object v0, v6, Ln91;->B:Lu06;

    .line 1728
    .line 1729
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    move-object v4, v0

    .line 1734
    check-cast v4, Lwg0;

    .line 1735
    .line 1736
    iget-object v0, v6, Ln91;->m:Lu06;

    .line 1737
    .line 1738
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    move-object v5, v0

    .line 1743
    check-cast v5, Llx0;

    .line 1744
    .line 1745
    iget-object v0, v6, Ln91;->a:Ljh0;

    .line 1746
    .line 1747
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1748
    .line 1749
    .line 1750
    iget-object v2, v6, Ln91;->j:Lu06;

    .line 1751
    .line 1752
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v2

    .line 1756
    move-object v7, v2

    .line 1757
    check-cast v7, Lik0;

    .line 1758
    .line 1759
    iget-object v2, v6, Ln91;->f:Lu06;

    .line 1760
    .line 1761
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v2

    .line 1765
    move-object v8, v2

    .line 1766
    check-cast v8, Lt79;

    .line 1767
    .line 1768
    invoke-virtual {v6}, Ln91;->a()Lk28;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v9

    .line 1772
    iget-object v2, v6, Ln91;->d:Lu06;

    .line 1773
    .line 1774
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v2

    .line 1778
    move-object v10, v2

    .line 1779
    check-cast v10, Ljj0;

    .line 1780
    .line 1781
    iget-object v1, v1, Ll91;->a:Lfu6;

    .line 1782
    .line 1783
    iget-object v2, v1, Lfu6;->i0:Ljava/lang/Object;

    .line 1784
    .line 1785
    move-object v11, v2

    .line 1786
    check-cast v11, Lbm0;

    .line 1787
    .line 1788
    iget-object v1, v1, Lfu6;->g0:Ljava/lang/Object;

    .line 1789
    .line 1790
    move-object v12, v1

    .line 1791
    check-cast v12, Ldq;

    .line 1792
    .line 1793
    move-object v6, v0

    .line 1794
    invoke-direct/range {v3 .. v12}, Lmi0;-><init>(Lwg0;Llx0;Ljh0;Lik0;Lt79;Lk28;Ljj0;Lbm0;Ldq;)V

    .line 1795
    .line 1796
    .line 1797
    :goto_7
    move-object v2, v3

    .line 1798
    goto/16 :goto_10

    .line 1799
    .line 1800
    :pswitch_1f
    new-instance v2, Lbh3;

    .line 1801
    .line 1802
    invoke-virtual {v1}, Ll91;->a()Lzh0;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v0

    .line 1806
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1807
    .line 1808
    .line 1809
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1810
    .line 1811
    .line 1812
    goto/16 :goto_10

    .line 1813
    .line 1814
    :pswitch_20
    iget-object v0, v6, Ln91;->a:Ljh0;

    .line 1815
    .line 1816
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1817
    .line 1818
    .line 1819
    iget-object v2, v0, Ljh0;->Y:Ljava/lang/String;

    .line 1820
    .line 1821
    invoke-static {v2}, Lhi5;->R(Ljava/lang/Object;)V

    .line 1822
    .line 1823
    .line 1824
    goto/16 :goto_10

    .line 1825
    .line 1826
    :pswitch_21
    iget-object v0, v6, Ln91;->C:Lu06;

    .line 1827
    .line 1828
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v0

    .line 1832
    check-cast v0, Ljava/lang/String;

    .line 1833
    .line 1834
    iget-object v1, v6, Ln91;->j:Lu06;

    .line 1835
    .line 1836
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v1

    .line 1840
    check-cast v1, Lik0;

    .line 1841
    .line 1842
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1843
    .line 1844
    .line 1845
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1846
    .line 1847
    .line 1848
    new-instance v2, Lx02;

    .line 1849
    .line 1850
    invoke-virtual {v1}, Lik0;->a()Li26;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v1

    .line 1854
    invoke-direct {v2, v0, v1}, Lx02;-><init>(Ljava/lang/String;Li26;)V

    .line 1855
    .line 1856
    .line 1857
    goto/16 :goto_10

    .line 1858
    .line 1859
    :pswitch_22
    new-instance v2, Lwg0;

    .line 1860
    .line 1861
    invoke-direct {v2}, Lwg0;-><init>()V

    .line 1862
    .line 1863
    .line 1864
    goto/16 :goto_10

    .line 1865
    .line 1866
    :pswitch_23
    new-instance v2, Lrh0;

    .line 1867
    .line 1868
    iget-object v0, v6, Ln91;->v:Lu06;

    .line 1869
    .line 1870
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v0

    .line 1874
    check-cast v0, Lr79;

    .line 1875
    .line 1876
    iget-object v1, v6, Ln91;->p:Lu06;

    .line 1877
    .line 1878
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v1

    .line 1882
    check-cast v1, Lx32;

    .line 1883
    .line 1884
    iget-object v3, v6, Ln91;->q:Lu06;

    .line 1885
    .line 1886
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v3

    .line 1890
    check-cast v3, Luc8;

    .line 1891
    .line 1892
    iget-object v4, v6, Ln91;->n:Lu06;

    .line 1893
    .line 1894
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v4

    .line 1898
    check-cast v4, Ldj4;

    .line 1899
    .line 1900
    invoke-direct {v2, v0, v1, v3, v4}, Lrh0;-><init>(Lr79;Lx32;Luc8;Ldj4;)V

    .line 1901
    .line 1902
    .line 1903
    goto/16 :goto_10

    .line 1904
    .line 1905
    :pswitch_24
    new-instance v5, Lzi0;

    .line 1906
    .line 1907
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 1908
    .line 1909
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    check-cast v0, Lqj0;

    .line 1914
    .line 1915
    iget-object v7, v6, Ln91;->a:Ljh0;

    .line 1916
    .line 1917
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1918
    .line 1919
    .line 1920
    iget-object v1, v6, Ln91;->y:Lu06;

    .line 1921
    .line 1922
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v1

    .line 1926
    move-object v8, v1

    .line 1927
    check-cast v8, Lok0;

    .line 1928
    .line 1929
    iget-object v1, v6, Ln91;->A:Lu06;

    .line 1930
    .line 1931
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v1

    .line 1935
    move-object v9, v1

    .line 1936
    check-cast v9, Lrh0;

    .line 1937
    .line 1938
    iget-object v1, v6, Ln91;->B:Lu06;

    .line 1939
    .line 1940
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v1

    .line 1944
    move-object v10, v1

    .line 1945
    check-cast v10, Lwg0;

    .line 1946
    .line 1947
    iget-object v1, v6, Ln91;->s:Lu06;

    .line 1948
    .line 1949
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v1

    .line 1953
    move-object v11, v1

    .line 1954
    check-cast v11, Ldh2;

    .line 1955
    .line 1956
    iget-object v1, v6, Ln91;->j:Lu06;

    .line 1957
    .line 1958
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v1

    .line 1962
    move-object v12, v1

    .line 1963
    check-cast v12, Lik0;

    .line 1964
    .line 1965
    iget-object v1, v6, Ln91;->D:Lu06;

    .line 1966
    .line 1967
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v1

    .line 1971
    move-object v13, v1

    .line 1972
    check-cast v13, Lw02;

    .line 1973
    .line 1974
    iget-object v1, v6, Ln91;->i:Lu06;

    .line 1975
    .line 1976
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v1

    .line 1980
    move-object v14, v1

    .line 1981
    check-cast v14, Lvk7;

    .line 1982
    .line 1983
    iget-object v1, v6, Ln91;->E:Lu06;

    .line 1984
    .line 1985
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v1

    .line 1989
    move-object v15, v1

    .line 1990
    check-cast v15, Lbh3;

    .line 1991
    .line 1992
    iget-object v1, v6, Ln91;->b:Lxd6;

    .line 1993
    .line 1994
    move-object v6, v0

    .line 1995
    move-object/from16 v16, v1

    .line 1996
    .line 1997
    invoke-direct/range {v5 .. v16}, Lzi0;-><init>(Lqj0;Ljh0;Lok0;Lrh0;Lwg0;Ldh2;Lik0;Lw02;Lvk7;Lbh3;Lxd6;)V

    .line 1998
    .line 1999
    .line 2000
    move-object v2, v5

    .line 2001
    goto/16 :goto_10

    .line 2002
    .line 2003
    :pswitch_25
    new-instance v2, Lok0;

    .line 2004
    .line 2005
    invoke-direct {v2}, Lok0;-><init>()V

    .line 2006
    .line 2007
    .line 2008
    goto/16 :goto_10

    .line 2009
    .line 2010
    :pswitch_26
    new-instance v2, Lye0;

    .line 2011
    .line 2012
    invoke-direct {v2}, Lye0;-><init>()V

    .line 2013
    .line 2014
    .line 2015
    goto/16 :goto_10

    .line 2016
    .line 2017
    :pswitch_27
    iget-object v0, v6, Ln91;->w:Lu06;

    .line 2018
    .line 2019
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v0

    .line 2023
    check-cast v0, Lye0;

    .line 2024
    .line 2025
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 2026
    .line 2027
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v1

    .line 2031
    check-cast v1, Lpr8;

    .line 2032
    .line 2033
    iget-object v2, v6, Ln91;->m:Lu06;

    .line 2034
    .line 2035
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v2

    .line 2039
    check-cast v2, Llx0;

    .line 2040
    .line 2041
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2042
    .line 2043
    .line 2044
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2045
    .line 2046
    .line 2047
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2048
    .line 2049
    .line 2050
    new-instance v3, Lxe0;

    .line 2051
    .line 2052
    invoke-direct {v3, v0, v1, v2}, Lxe0;-><init>(Lye0;Lpr8;Llx0;)V

    .line 2053
    .line 2054
    .line 2055
    goto/16 :goto_7

    .line 2056
    .line 2057
    :pswitch_28
    new-instance v2, Lr79;

    .line 2058
    .line 2059
    invoke-virtual {v6}, Ln91;->b()Lp79;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v0

    .line 2063
    invoke-direct {v2, v0}, Lr79;-><init>(Lp79;)V

    .line 2064
    .line 2065
    .line 2066
    goto/16 :goto_10

    .line 2067
    .line 2068
    :pswitch_29
    new-instance v2, Lnv8;

    .line 2069
    .line 2070
    invoke-direct {v2}, Lnv8;-><init>()V

    .line 2071
    .line 2072
    .line 2073
    goto/16 :goto_10

    .line 2074
    .line 2075
    :pswitch_2a
    new-instance v2, Ltj7;

    .line 2076
    .line 2077
    iget-object v0, v6, Ln91;->r:Lu06;

    .line 2078
    .line 2079
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v0

    .line 2083
    check-cast v0, Lpd2;

    .line 2084
    .line 2085
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 2086
    .line 2087
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v1

    .line 2091
    check-cast v1, Lpr8;

    .line 2092
    .line 2093
    invoke-direct {v2, v0, v1}, Ltj7;-><init>(Lpd2;Lpr8;)V

    .line 2094
    .line 2095
    .line 2096
    goto/16 :goto_10

    .line 2097
    .line 2098
    :pswitch_2b
    new-instance v3, Ldh2;

    .line 2099
    .line 2100
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 2101
    .line 2102
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    move-object v4, v0

    .line 2107
    check-cast v4, Lqj0;

    .line 2108
    .line 2109
    iget-object v0, v6, Ln91;->j:Lu06;

    .line 2110
    .line 2111
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v0

    .line 2115
    check-cast v0, Lik0;

    .line 2116
    .line 2117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2118
    .line 2119
    .line 2120
    invoke-virtual {v0}, Lik0;->a()Li26;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    const-class v1, Landroidx/camera/camera2/compat/quirk/AfRegionFlipHorizontallyQuirk;

    .line 2125
    .line 2126
    invoke-virtual {v0, v1}, Li26;->a(Ljava/lang/Class;)Z

    .line 2127
    .line 2128
    .line 2129
    move-result v0

    .line 2130
    if-eqz v0, :cond_9

    .line 2131
    .line 2132
    sget-object v0, Llh4;->g0:Llh4;

    .line 2133
    .line 2134
    :goto_8
    move-object v5, v0

    .line 2135
    goto :goto_9

    .line 2136
    :cond_9
    sget-object v0, Lqe4;->i0:Lqe4;

    .line 2137
    .line 2138
    goto :goto_8

    .line 2139
    :goto_9
    iget-object v0, v6, Ln91;->l:Lu06;

    .line 2140
    .line 2141
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v0

    .line 2145
    check-cast v0, Lkh7;

    .line 2146
    .line 2147
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 2148
    .line 2149
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v1

    .line 2153
    move-object v7, v1

    .line 2154
    check-cast v7, Lpr8;

    .line 2155
    .line 2156
    invoke-virtual {v6}, Ln91;->b()Lp79;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v8

    .line 2160
    move-object v6, v0

    .line 2161
    invoke-direct/range {v3 .. v8}, Ldh2;-><init>(Lqj0;Ljv4;Lkh7;Lpr8;Lp79;)V

    .line 2162
    .line 2163
    .line 2164
    goto/16 :goto_7

    .line 2165
    .line 2166
    :pswitch_2c
    new-instance v2, Luc8;

    .line 2167
    .line 2168
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 2169
    .line 2170
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v0

    .line 2174
    check-cast v0, Lqj0;

    .line 2175
    .line 2176
    iget-object v1, v6, Ln91;->l:Lu06;

    .line 2177
    .line 2178
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v1

    .line 2182
    check-cast v1, Lkh7;

    .line 2183
    .line 2184
    iget-object v3, v6, Ln91;->k:Lu06;

    .line 2185
    .line 2186
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v3

    .line 2190
    check-cast v3, Lpr8;

    .line 2191
    .line 2192
    invoke-direct {v2, v0, v1, v3}, Luc8;-><init>(Lqj0;Lkh7;Lpr8;)V

    .line 2193
    .line 2194
    .line 2195
    goto/16 :goto_10

    .line 2196
    .line 2197
    :pswitch_2d
    new-instance v4, Lpd2;

    .line 2198
    .line 2199
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 2200
    .line 2201
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v0

    .line 2205
    move-object v5, v0

    .line 2206
    check-cast v5, Lqj0;

    .line 2207
    .line 2208
    iget-object v0, v6, Ln91;->l:Lu06;

    .line 2209
    .line 2210
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v0

    .line 2214
    check-cast v0, Lkh7;

    .line 2215
    .line 2216
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 2217
    .line 2218
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v1

    .line 2222
    move-object v7, v1

    .line 2223
    check-cast v7, Lpr8;

    .line 2224
    .line 2225
    iget-object v1, v6, Ln91;->q:Lu06;

    .line 2226
    .line 2227
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v1

    .line 2231
    move-object v8, v1

    .line 2232
    check-cast v8, Luc8;

    .line 2233
    .line 2234
    iget-object v1, v6, Ln91;->j:Lu06;

    .line 2235
    .line 2236
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v1

    .line 2240
    check-cast v1, Lik0;

    .line 2241
    .line 2242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2243
    .line 2244
    .line 2245
    invoke-virtual {v1}, Lik0;->a()Li26;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v1

    .line 2249
    const-class v2, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;

    .line 2250
    .line 2251
    invoke-virtual {v1, v2}, Li26;->a(Ljava/lang/Class;)Z

    .line 2252
    .line 2253
    .line 2254
    move-result v1

    .line 2255
    if-eqz v1, :cond_a

    .line 2256
    .line 2257
    sget-object v1, Llh4;->M0:Llh4;

    .line 2258
    .line 2259
    :goto_a
    move-object v6, v0

    .line 2260
    move-object v9, v1

    .line 2261
    goto :goto_b

    .line 2262
    :cond_a
    sget-object v1, Llh4;->l0:Llh4;

    .line 2263
    .line 2264
    goto :goto_a

    .line 2265
    :goto_b
    invoke-direct/range {v4 .. v9}, Lpd2;-><init>(Lqj0;Lkh7;Lpr8;Luc8;Llh4;)V

    .line 2266
    .line 2267
    .line 2268
    :goto_c
    move-object v2, v4

    .line 2269
    goto/16 :goto_10

    .line 2270
    .line 2271
    :pswitch_2e
    new-instance v2, Lz32;

    .line 2272
    .line 2273
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 2274
    .line 2275
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v0

    .line 2279
    check-cast v0, Lqj0;

    .line 2280
    .line 2281
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 2282
    .line 2283
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v1

    .line 2287
    check-cast v1, Lpr8;

    .line 2288
    .line 2289
    iget-object v3, v6, Ln91;->m:Lu06;

    .line 2290
    .line 2291
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v3

    .line 2295
    check-cast v3, Llx0;

    .line 2296
    .line 2297
    invoke-direct {v2, v0, v1, v3}, Lz32;-><init>(Lqj0;Lpr8;Llx0;)V

    .line 2298
    .line 2299
    .line 2300
    goto/16 :goto_10

    .line 2301
    .line 2302
    :pswitch_2f
    new-instance v2, Lx32;

    .line 2303
    .line 2304
    iget-object v0, v6, Ln91;->o:Lu06;

    .line 2305
    .line 2306
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v0

    .line 2310
    check-cast v0, Lz32;

    .line 2311
    .line 2312
    invoke-direct {v2, v0}, Lx32;-><init>(Lz32;)V

    .line 2313
    .line 2314
    .line 2315
    goto/16 :goto_10

    .line 2316
    .line 2317
    :pswitch_30
    new-instance v2, Llx0;

    .line 2318
    .line 2319
    invoke-direct {v2}, Llx0;-><init>()V

    .line 2320
    .line 2321
    .line 2322
    goto/16 :goto_10

    .line 2323
    .line 2324
    :pswitch_31
    iget-object v0, v6, Ln91;->a:Ljh0;

    .line 2325
    .line 2326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2327
    .line 2328
    .line 2329
    iget-object v1, v1, Ll91;->a:Lfu6;

    .line 2330
    .line 2331
    iget-object v1, v1, Lfu6;->Z:Ljava/lang/Object;

    .line 2332
    .line 2333
    check-cast v1, Lwx;

    .line 2334
    .line 2335
    iget-object v1, v1, Lwx;->a:Ljava/util/concurrent/Executor;

    .line 2336
    .line 2337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2338
    .line 2339
    .line 2340
    invoke-static {v1}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v2

    .line 2344
    invoke-static {}, Lpw7;->b()Low7;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v3

    .line 2348
    invoke-static {v3, v2}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v3

    .line 2352
    new-instance v4, Lx61;

    .line 2353
    .line 2354
    new-instance v5, Ljava/lang/StringBuilder;

    .line 2355
    .line 2356
    const-string v6, "CXCP-UseCase-"

    .line 2357
    .line 2358
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2359
    .line 2360
    .line 2361
    iget-object v0, v0, Ljh0;->Y:Ljava/lang/String;

    .line 2362
    .line 2363
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2364
    .line 2365
    .line 2366
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v0

    .line 2370
    invoke-direct {v4, v0}, Lx61;-><init>(Ljava/lang/String;)V

    .line 2371
    .line 2372
    .line 2373
    invoke-interface {v3, v4}, Ls61;->B0(Ls61;)Ls61;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v0

    .line 2377
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 2378
    .line 2379
    .line 2380
    move-result-object v0

    .line 2381
    new-instance v3, Lpr8;

    .line 2382
    .line 2383
    invoke-direct {v3, v0, v1, v2}, Lpr8;-><init>(Lm51;Ljava/util/concurrent/Executor;Lu61;)V

    .line 2384
    .line 2385
    .line 2386
    goto/16 :goto_7

    .line 2387
    .line 2388
    :pswitch_32
    new-instance v2, Lue5;

    .line 2389
    .line 2390
    iget-object v0, v6, Ln91;->d:Lu06;

    .line 2391
    .line 2392
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v0

    .line 2396
    check-cast v0, Ljj0;

    .line 2397
    .line 2398
    iget-object v1, v6, Ln91;->g:Lu06;

    .line 2399
    .line 2400
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v1

    .line 2404
    check-cast v1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 2405
    .line 2406
    invoke-direct {v2, v0}, Lue5;-><init>(Ljj0;)V

    .line 2407
    .line 2408
    .line 2409
    goto/16 :goto_10

    .line 2410
    .line 2411
    :pswitch_33
    iget-object v0, v6, Ln91;->d:Lu06;

    .line 2412
    .line 2413
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v0

    .line 2417
    check-cast v0, Ljj0;

    .line 2418
    .line 2419
    if-eqz v0, :cond_f

    .line 2420
    .line 2421
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2422
    .line 2423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2424
    .line 2425
    .line 2426
    check-cast v0, Llf0;

    .line 2427
    .line 2428
    invoke-virtual {v0, v1}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v0

    .line 2432
    move-object v2, v0

    .line 2433
    check-cast v2, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 2434
    .line 2435
    goto/16 :goto_10

    .line 2436
    .line 2437
    :pswitch_34
    new-instance v2, Lvk7;

    .line 2438
    .line 2439
    iget-object v0, v6, Ln91;->g:Lu06;

    .line 2440
    .line 2441
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v0

    .line 2445
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 2446
    .line 2447
    iget-object v1, v6, Ln91;->h:Lu06;

    .line 2448
    .line 2449
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v1

    .line 2453
    check-cast v1, Lue5;

    .line 2454
    .line 2455
    invoke-direct {v2, v0, v1}, Lvk7;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lue5;)V

    .line 2456
    .line 2457
    .line 2458
    goto/16 :goto_10

    .line 2459
    .line 2460
    :pswitch_35
    new-instance v2, Lik0;

    .line 2461
    .line 2462
    iget-object v0, v6, Ln91;->d:Lu06;

    .line 2463
    .line 2464
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v0

    .line 2468
    check-cast v0, Ljj0;

    .line 2469
    .line 2470
    iget-object v1, v6, Ln91;->i:Lu06;

    .line 2471
    .line 2472
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v1

    .line 2476
    check-cast v1, Lvk7;

    .line 2477
    .line 2478
    invoke-direct {v2, v0, v1}, Lik0;-><init>(Ljj0;Lvk7;)V

    .line 2479
    .line 2480
    .line 2481
    goto/16 :goto_10

    .line 2482
    .line 2483
    :pswitch_36
    new-instance v2, Lkh7;

    .line 2484
    .line 2485
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 2486
    .line 2487
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v0

    .line 2491
    check-cast v0, Lqj0;

    .line 2492
    .line 2493
    iget-object v1, v6, Ln91;->j:Lu06;

    .line 2494
    .line 2495
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v1

    .line 2499
    check-cast v1, Lik0;

    .line 2500
    .line 2501
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2502
    .line 2503
    .line 2504
    invoke-virtual {v1}, Lik0;->a()Li26;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v1

    .line 2508
    const-class v3, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;

    .line 2509
    .line 2510
    invoke-virtual {v1, v3}, Li26;->a(Ljava/lang/Class;)Z

    .line 2511
    .line 2512
    .line 2513
    move-result v1

    .line 2514
    const-class v3, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 2515
    .line 2516
    invoke-static {}, Lum1;->a()Li26;

    .line 2517
    .line 2518
    .line 2519
    move-result-object v4

    .line 2520
    invoke-virtual {v4, v3}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v3

    .line 2524
    if-eqz v3, :cond_b

    .line 2525
    .line 2526
    goto :goto_d

    .line 2527
    :cond_b
    if-eqz v1, :cond_c

    .line 2528
    .line 2529
    :goto_d
    sget-object v1, Lpz2;->u0:Lpz2;

    .line 2530
    .line 2531
    goto :goto_e

    .line 2532
    :cond_c
    sget-object v1, Lqe4;->h0:Lqe4;

    .line 2533
    .line 2534
    :goto_e
    iget-object v3, v6, Ln91;->k:Lu06;

    .line 2535
    .line 2536
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v3

    .line 2540
    check-cast v3, Lpr8;

    .line 2541
    .line 2542
    invoke-direct {v2, v0, v1, v3}, Lkh7;-><init>(Lqj0;Lax;Lpr8;)V

    .line 2543
    .line 2544
    .line 2545
    goto/16 :goto_10

    .line 2546
    .line 2547
    :pswitch_37
    new-instance v2, Ldj4;

    .line 2548
    .line 2549
    iget-object v0, v6, Ln91;->d:Lu06;

    .line 2550
    .line 2551
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v0

    .line 2555
    check-cast v0, Ljj0;

    .line 2556
    .line 2557
    iget-object v1, v6, Ln91;->l:Lu06;

    .line 2558
    .line 2559
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v1

    .line 2563
    check-cast v1, Lkh7;

    .line 2564
    .line 2565
    iget-object v3, v6, Ln91;->k:Lu06;

    .line 2566
    .line 2567
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2568
    .line 2569
    .line 2570
    move-result-object v3

    .line 2571
    check-cast v3, Lpr8;

    .line 2572
    .line 2573
    iget-object v4, v6, Ln91;->m:Lu06;

    .line 2574
    .line 2575
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 2576
    .line 2577
    .line 2578
    move-result-object v4

    .line 2579
    check-cast v4, Llx0;

    .line 2580
    .line 2581
    invoke-direct {v2, v0, v1, v3, v4}, Ldj4;-><init>(Ljj0;Lkh7;Lpr8;Llx0;)V

    .line 2582
    .line 2583
    .line 2584
    goto/16 :goto_10

    .line 2585
    .line 2586
    :pswitch_38
    iget-object v0, v1, Ll91;->a:Lfu6;

    .line 2587
    .line 2588
    iget-object v0, v0, Lfu6;->f0:Ljava/lang/Object;

    .line 2589
    .line 2590
    check-cast v0, Lrj0;

    .line 2591
    .line 2592
    invoke-static {v0}, Lhi5;->R(Ljava/lang/Object;)V

    .line 2593
    .line 2594
    .line 2595
    iget-object v1, v6, Ln91;->a:Ljh0;

    .line 2596
    .line 2597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2598
    .line 2599
    .line 2600
    :try_start_1
    invoke-virtual {v0}, Lrj0;->b()Lzh0;

    .line 2601
    .line 2602
    .line 2603
    move-result-object v0

    .line 2604
    iget-object v1, v1, Ljh0;->Y:Ljava/lang/String;

    .line 2605
    .line 2606
    invoke-static {v0, v1}, Lzh0;->b(Lzh0;Ljava/lang/String;)Ljj0;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v2
    :try_end_1
    .catch Lms1; {:try_start_1 .. :try_end_1} :catch_0

    .line 2610
    goto/16 :goto_10

    .line 2611
    .line 2612
    :catch_0
    invoke-static {}, Lhi5;->j0()Z

    .line 2613
    .line 2614
    .line 2615
    goto/16 :goto_10

    .line 2616
    .line 2617
    :pswitch_39
    new-instance v2, Lqj0;

    .line 2618
    .line 2619
    iget-object v0, v6, Ln91;->a:Ljh0;

    .line 2620
    .line 2621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2622
    .line 2623
    .line 2624
    iget-object v1, v6, Ln91;->d:Lu06;

    .line 2625
    .line 2626
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2627
    .line 2628
    .line 2629
    move-result-object v1

    .line 2630
    check-cast v1, Ljj0;

    .line 2631
    .line 2632
    invoke-direct {v2, v0, v1}, Lqj0;-><init>(Ljh0;Ljj0;)V

    .line 2633
    .line 2634
    .line 2635
    goto/16 :goto_10

    .line 2636
    .line 2637
    :pswitch_3a
    iget-object v0, v6, Ln91;->e:Lu06;

    .line 2638
    .line 2639
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v0

    .line 2643
    check-cast v0, Lqj0;

    .line 2644
    .line 2645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2646
    .line 2647
    .line 2648
    new-instance v2, Lu79;

    .line 2649
    .line 2650
    invoke-direct {v2, v0}, Lu79;-><init>(Lqj0;)V

    .line 2651
    .line 2652
    .line 2653
    goto/16 :goto_10

    .line 2654
    .line 2655
    :pswitch_3b
    new-instance v0, Llr8;

    .line 2656
    .line 2657
    iget-object v2, v1, Ll91;->a:Lfu6;

    .line 2658
    .line 2659
    iget-object v7, v1, Ll91;->a:Lfu6;

    .line 2660
    .line 2661
    iget-object v2, v2, Lfu6;->f0:Ljava/lang/Object;

    .line 2662
    .line 2663
    check-cast v2, Lrj0;

    .line 2664
    .line 2665
    invoke-static {v2}, Lhi5;->R(Ljava/lang/Object;)V

    .line 2666
    .line 2667
    .line 2668
    iget-object v8, v7, Lfu6;->h0:Ljava/lang/Object;

    .line 2669
    .line 2670
    check-cast v8, Lvh0;

    .line 2671
    .line 2672
    invoke-static {v8}, Lhi5;->R(Ljava/lang/Object;)V

    .line 2673
    .line 2674
    .line 2675
    new-instance v9, Lmj0;

    .line 2676
    .line 2677
    const/16 v10, 0xd

    .line 2678
    .line 2679
    invoke-direct {v9, v1, v6, v10}, Lmj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2680
    .line 2681
    .line 2682
    iget-object v1, v6, Ln91;->f:Lu06;

    .line 2683
    .line 2684
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v1

    .line 2688
    check-cast v1, Lt79;

    .line 2689
    .line 2690
    iget-object v10, v6, Ln91;->n:Lu06;

    .line 2691
    .line 2692
    invoke-interface {v10}, Lv06;->get()Ljava/lang/Object;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v10

    .line 2696
    check-cast v10, Ldj4;

    .line 2697
    .line 2698
    new-instance v11, Lps;

    .line 2699
    .line 2700
    invoke-direct {v11, v3}, Lps;-><init>(B)V

    .line 2701
    .line 2702
    .line 2703
    iget-object v3, v6, Ln91;->p:Lu06;

    .line 2704
    .line 2705
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2706
    .line 2707
    .line 2708
    move-result-object v3

    .line 2709
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2710
    .line 2711
    .line 2712
    iget-object v3, v6, Ln91;->r:Lu06;

    .line 2713
    .line 2714
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2715
    .line 2716
    .line 2717
    move-result-object v3

    .line 2718
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2719
    .line 2720
    .line 2721
    iget-object v3, v6, Ln91;->s:Lu06;

    .line 2722
    .line 2723
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2724
    .line 2725
    .line 2726
    move-result-object v3

    .line 2727
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2728
    .line 2729
    .line 2730
    iget-object v3, v6, Ln91;->l:Lu06;

    .line 2731
    .line 2732
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2733
    .line 2734
    .line 2735
    move-result-object v3

    .line 2736
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2737
    .line 2738
    .line 2739
    iget-object v3, v6, Ln91;->t:Lu06;

    .line 2740
    .line 2741
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2742
    .line 2743
    .line 2744
    move-result-object v3

    .line 2745
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2746
    .line 2747
    .line 2748
    iget-object v3, v6, Ln91;->q:Lu06;

    .line 2749
    .line 2750
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2751
    .line 2752
    .line 2753
    move-result-object v3

    .line 2754
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2755
    .line 2756
    .line 2757
    iget-object v3, v6, Ln91;->n:Lu06;

    .line 2758
    .line 2759
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2760
    .line 2761
    .line 2762
    move-result-object v3

    .line 2763
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2764
    .line 2765
    .line 2766
    iget-object v3, v6, Ln91;->u:Lu06;

    .line 2767
    .line 2768
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2769
    .line 2770
    .line 2771
    move-result-object v3

    .line 2772
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2773
    .line 2774
    .line 2775
    iget-object v3, v6, Ln91;->v:Lu06;

    .line 2776
    .line 2777
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v3

    .line 2781
    invoke-virtual {v11, v3}, Lps;->b(Ljava/lang/Object;)V

    .line 2782
    .line 2783
    .line 2784
    iget-object v3, v11, Lps;->b:Ljava/util/ArrayList;

    .line 2785
    .line 2786
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2787
    .line 2788
    .line 2789
    move-result v11

    .line 2790
    if-eqz v11, :cond_d

    .line 2791
    .line 2792
    sget-object v3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2793
    .line 2794
    goto :goto_f

    .line 2795
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2796
    .line 2797
    .line 2798
    move-result v11

    .line 2799
    if-ne v11, v5, :cond_e

    .line 2800
    .line 2801
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2802
    .line 2803
    .line 2804
    move-result-object v3

    .line 2805
    invoke-static {v3}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v3

    .line 2809
    goto :goto_f

    .line 2810
    :cond_e
    new-instance v4, Ljava/util/HashSet;

    .line 2811
    .line 2812
    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 2813
    .line 2814
    .line 2815
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 2816
    .line 2817
    .line 2818
    move-result-object v3

    .line 2819
    :goto_f
    iget-object v4, v6, Ln91;->x:Lu06;

    .line 2820
    .line 2821
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 2822
    .line 2823
    .line 2824
    move-result-object v4

    .line 2825
    check-cast v4, Lxe0;

    .line 2826
    .line 2827
    iget-object v5, v6, Ln91;->y:Lu06;

    .line 2828
    .line 2829
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 2830
    .line 2831
    .line 2832
    move-result-object v5

    .line 2833
    move-object v11, v5

    .line 2834
    check-cast v11, Lok0;

    .line 2835
    .line 2836
    iget-object v12, v6, Ln91;->z:Lyr2;

    .line 2837
    .line 2838
    iget-object v13, v6, Ln91;->k:Lu06;

    .line 2839
    .line 2840
    iget-object v14, v6, Ln91;->F:Lu06;

    .line 2841
    .line 2842
    iget-object v5, v6, Ln91;->D:Lu06;

    .line 2843
    .line 2844
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 2845
    .line 2846
    .line 2847
    move-result-object v5

    .line 2848
    move-object v15, v5

    .line 2849
    check-cast v15, Lw02;

    .line 2850
    .line 2851
    iget-object v5, v6, Ln91;->e:Lu06;

    .line 2852
    .line 2853
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 2854
    .line 2855
    .line 2856
    move-result-object v5

    .line 2857
    move-object/from16 v16, v5

    .line 2858
    .line 2859
    check-cast v16, Lqj0;

    .line 2860
    .line 2861
    iget-object v5, v7, Lfu6;->i0:Ljava/lang/Object;

    .line 2862
    .line 2863
    move-object/from16 v17, v5

    .line 2864
    .line 2865
    check-cast v17, Lbm0;

    .line 2866
    .line 2867
    iget-object v5, v6, Ln91;->G:Lu06;

    .line 2868
    .line 2869
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 2870
    .line 2871
    .line 2872
    move-result-object v5

    .line 2873
    move-object/from16 v18, v5

    .line 2874
    .line 2875
    check-cast v18, Lmi0;

    .line 2876
    .line 2877
    iget-object v5, v7, Lfu6;->Y:Ljava/lang/Object;

    .line 2878
    .line 2879
    check-cast v5, Landroid/content/Context;

    .line 2880
    .line 2881
    sget-object v6, Lwp1;->g:Lbe;

    .line 2882
    .line 2883
    invoke-virtual {v6, v5}, Lbe;->i(Landroid/content/Context;)Lwp1;

    .line 2884
    .line 2885
    .line 2886
    move-result-object v20

    .line 2887
    move-object v7, v1

    .line 2888
    move-object/from16 v19, v5

    .line 2889
    .line 2890
    move-object v5, v8

    .line 2891
    move-object v6, v9

    .line 2892
    move-object v8, v10

    .line 2893
    move-object v9, v3

    .line 2894
    move-object v10, v4

    .line 2895
    move-object v3, v0

    .line 2896
    move-object v4, v2

    .line 2897
    invoke-direct/range {v3 .. v20}, Llr8;-><init>(Lrj0;Lvh0;Lmj0;Lt79;Ldj4;Ljava/util/Set;Lxe0;Lok0;Lyr2;Lv06;Lv06;Lw02;Lqj0;Lbm0;Lmi0;Landroid/content/Context;Lwp1;)V

    .line 2898
    .line 2899
    .line 2900
    goto/16 :goto_7

    .line 2901
    .line 2902
    :pswitch_3c
    new-instance v4, Lej0;

    .line 2903
    .line 2904
    iget-object v5, v6, Ln91;->a:Ljh0;

    .line 2905
    .line 2906
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2907
    .line 2908
    .line 2909
    iget-object v0, v6, Ln91;->H:Lu06;

    .line 2910
    .line 2911
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 2912
    .line 2913
    .line 2914
    move-result-object v0

    .line 2915
    check-cast v0, Llr8;

    .line 2916
    .line 2917
    iget-object v1, v6, Ln91;->F:Lu06;

    .line 2918
    .line 2919
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2920
    .line 2921
    .line 2922
    move-result-object v1

    .line 2923
    move-object v7, v1

    .line 2924
    check-cast v7, Laj0;

    .line 2925
    .line 2926
    iget-object v1, v6, Ln91;->I:Lu06;

    .line 2927
    .line 2928
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2929
    .line 2930
    .line 2931
    move-result-object v1

    .line 2932
    move-object v8, v1

    .line 2933
    check-cast v8, Lqh0;

    .line 2934
    .line 2935
    iget-object v1, v6, Ln91;->k:Lu06;

    .line 2936
    .line 2937
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2938
    .line 2939
    .line 2940
    move-result-object v1

    .line 2941
    move-object v9, v1

    .line 2942
    check-cast v9, Lpr8;

    .line 2943
    .line 2944
    iget-object v1, v6, Ln91;->y:Lu06;

    .line 2945
    .line 2946
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 2947
    .line 2948
    .line 2949
    move-result-object v1

    .line 2950
    move-object v10, v1

    .line 2951
    check-cast v10, Lok0;

    .line 2952
    .line 2953
    move-object v6, v0

    .line 2954
    invoke-direct/range {v4 .. v10}, Lej0;-><init>(Ljh0;Llr8;Laj0;Lqh0;Lpr8;Lok0;)V

    .line 2955
    .line 2956
    .line 2957
    goto/16 :goto_c

    .line 2958
    .line 2959
    :cond_f
    :goto_10
    return-object v2

    .line 2960
    nop

    .line 2961
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_12
    .end packed-switch

    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    :pswitch_data_1
    .packed-switch 0x0
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

    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
    .end packed-switch
.end method

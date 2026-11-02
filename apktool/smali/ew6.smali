.class public final synthetic Lew6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lew6;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, Lew6;->X:B

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    check-cast v0, Ltr4;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-interface {v0, v1}, Ltr4;->K(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_0
    move-object/from16 v0, p1

    .line 30
    .line 31
    check-cast v0, Ltr4;

    .line 32
    .line 33
    move-object/from16 v1, p2

    .line 34
    .line 35
    check-cast v1, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-interface {v0, v1}, Ltr4;->m(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_1
    move-object/from16 v0, p1

    .line 51
    .line 52
    check-cast v0, Ltr4;

    .line 53
    .line 54
    move-object/from16 v1, p2

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-interface {v0, v1}, Ltr4;->k(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_2
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, Lhv6;

    .line 74
    .line 75
    move-object/from16 v0, p2

    .line 76
    .line 77
    check-cast v0, Lo87;

    .line 78
    .line 79
    iget-object v0, v0, Lo87;->d:Lt5;

    .line 80
    .line 81
    iget-object v0, v0, Lt5;->i0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lrh5;

    .line 84
    .line 85
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lp87;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_3
    move-object/from16 v0, p1

    .line 93
    .line 94
    check-cast v0, Ly07;

    .line 95
    .line 96
    move-object/from16 v1, p2

    .line 97
    .line 98
    check-cast v1, Ly07;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v0, v0, Ly07;->d:Lt07;

    .line 106
    .line 107
    sget-object v3, Lc17;->u:Le17;

    .line 108
    .line 109
    iget-object v0, v0, Lt07;->X:Ls05;

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-nez v0, :cond_0

    .line 116
    .line 117
    move-object v0, v2

    .line 118
    :cond_0
    check-cast v0, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-object v1, v1, Ly07;->d:Lt07;

    .line 125
    .line 126
    iget-object v1, v1, Lt07;->X:Ls05;

    .line 127
    .line 128
    invoke-virtual {v1, v3}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-nez v1, :cond_1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    move-object v2, v1

    .line 136
    :goto_0
    check-cast v2, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    :pswitch_4
    if-nez p1, :cond_2

    .line 152
    .line 153
    move-object/from16 v0, p2

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    move-object/from16 v0, p1

    .line 157
    .line 158
    :goto_1
    return-object v0

    .line 159
    :pswitch_5
    if-nez p1, :cond_3

    .line 160
    .line 161
    if-nez p2, :cond_3

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 165
    .line 166
    .line 167
    :goto_2
    const/4 v0, 0x0

    .line 168
    return-object v0

    .line 169
    :pswitch_6
    move-object/from16 v0, p1

    .line 170
    .line 171
    check-cast v0, Ljava/lang/Boolean;

    .line 172
    .line 173
    move-object/from16 v1, p2

    .line 174
    .line 175
    check-cast v1, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_7
    move-object/from16 v0, p1

    .line 182
    .line 183
    check-cast v0, Lga2;

    .line 184
    .line 185
    move-object/from16 v1, p2

    .line 186
    .line 187
    check-cast v1, Lga2;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_8
    move-object/from16 v0, p1

    .line 191
    .line 192
    check-cast v0, Lwc;

    .line 193
    .line 194
    move-object/from16 v1, p2

    .line 195
    .line 196
    check-cast v1, Lwc;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_9
    move-object/from16 v0, p1

    .line 200
    .line 201
    check-cast v0, Lc51;

    .line 202
    .line 203
    move-object/from16 v1, p2

    .line 204
    .line 205
    check-cast v1, Lc51;

    .line 206
    .line 207
    return-object v0

    .line 208
    :pswitch_a
    move-object/from16 v0, p1

    .line 209
    .line 210
    check-cast v0, Ljava/lang/String;

    .line 211
    .line 212
    move-object/from16 v0, p2

    .line 213
    .line 214
    check-cast v0, Ljava/lang/String;

    .line 215
    .line 216
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    const-string v1, "merge function called on unmergeable property PaneTitle."

    .line 219
    .line 220
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :pswitch_b
    move-object/from16 v0, p1

    .line 225
    .line 226
    check-cast v0, Lx67;

    .line 227
    .line 228
    move-object/from16 v1, p2

    .line 229
    .line 230
    check-cast v1, Lx67;

    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_c
    move-object/from16 v0, p1

    .line 234
    .line 235
    check-cast v0, Ljava/util/List;

    .line 236
    .line 237
    move-object/from16 v1, p2

    .line 238
    .line 239
    check-cast v1, Ljava/util/List;

    .line 240
    .line 241
    if-eqz v0, :cond_4

    .line 242
    .line 243
    new-instance v2, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 249
    .line 250
    .line 251
    move-object v1, v2

    .line 252
    :cond_4
    return-object v1

    .line 253
    :pswitch_d
    move-object/from16 v0, p1

    .line 254
    .line 255
    check-cast v0, Ldn8;

    .line 256
    .line 257
    move-object/from16 v1, p2

    .line 258
    .line 259
    check-cast v1, Ldn8;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_e
    move-object/from16 v0, p1

    .line 263
    .line 264
    check-cast v0, Ljava/lang/String;

    .line 265
    .line 266
    move-object/from16 v1, p2

    .line 267
    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_f
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, Lkl6;

    .line 274
    .line 275
    move-object/from16 v1, p2

    .line 276
    .line 277
    check-cast v1, Lkl6;

    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_10
    move-object/from16 v0, p1

    .line 281
    .line 282
    check-cast v0, Ldn8;

    .line 283
    .line 284
    move-object/from16 v0, p2

    .line 285
    .line 286
    check-cast v0, Ldn8;

    .line 287
    .line 288
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 289
    .line 290
    const-string v1, "merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node."

    .line 291
    .line 292
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :pswitch_11
    move-object/from16 v0, p1

    .line 297
    .line 298
    check-cast v0, Ldn8;

    .line 299
    .line 300
    move-object/from16 v0, p2

    .line 301
    .line 302
    check-cast v0, Ldn8;

    .line 303
    .line 304
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    const-string v1, "merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node."

    .line 307
    .line 308
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0

    .line 312
    :pswitch_12
    move-object/from16 v0, p1

    .line 313
    .line 314
    check-cast v0, Ljava/lang/Float;

    .line 315
    .line 316
    move-object/from16 v1, p2

    .line 317
    .line 318
    check-cast v1, Ljava/lang/Float;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_13
    move-object/from16 v0, p1

    .line 325
    .line 326
    check-cast v0, Ljava/util/List;

    .line 327
    .line 328
    move-object/from16 v1, p2

    .line 329
    .line 330
    check-cast v1, Ljava/util/List;

    .line 331
    .line 332
    if-eqz v0, :cond_5

    .line 333
    .line 334
    new-instance v2, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 340
    .line 341
    .line 342
    move-object v1, v2

    .line 343
    :cond_5
    return-object v1

    .line 344
    :pswitch_14
    move-object/from16 v0, p1

    .line 345
    .line 346
    check-cast v0, Ljava/util/List;

    .line 347
    .line 348
    move-object/from16 v1, p2

    .line 349
    .line 350
    check-cast v1, Ljava/util/List;

    .line 351
    .line 352
    if-nez v0, :cond_6

    .line 353
    .line 354
    sget-object v0, Ld02;->X:Ld02;

    .line 355
    .line 356
    :cond_6
    invoke-static {v0, v1}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    return-object v0

    .line 361
    :pswitch_15
    move-object/from16 v0, p1

    .line 362
    .line 363
    check-cast v0, Lhv6;

    .line 364
    .line 365
    move-object/from16 v0, p2

    .line 366
    .line 367
    check-cast v0, Lay6;

    .line 368
    .line 369
    iget-object v0, v0, Lay6;->X:Loh5;

    .line 370
    .line 371
    invoke-virtual {v0}, Loh5;->l()I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    return-object v0

    .line 380
    :pswitch_16
    move-object/from16 v0, p1

    .line 381
    .line 382
    check-cast v0, Lhv6;

    .line 383
    .line 384
    move-object/from16 v0, p2

    .line 385
    .line 386
    check-cast v0, Ld88;

    .line 387
    .line 388
    iget v0, v0, Ld88;->a:I

    .line 389
    .line 390
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    return-object v0

    .line 395
    :pswitch_17
    move-object/from16 v0, p1

    .line 396
    .line 397
    check-cast v0, Lhv6;

    .line 398
    .line 399
    move-object/from16 v1, p2

    .line 400
    .line 401
    check-cast v1, Le88;

    .line 402
    .line 403
    iget v2, v1, Le88;->a:I

    .line 404
    .line 405
    new-instance v3, Ld88;

    .line 406
    .line 407
    invoke-direct {v3, v2}, Ld88;-><init>(I)V

    .line 408
    .line 409
    .line 410
    sget-object v2, Lzc1;->g:Lxd6;

    .line 411
    .line 412
    invoke-static {v3, v2, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    iget-boolean v1, v1, Le88;->b:Z

    .line 417
    .line 418
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    return-object v0

    .line 431
    :pswitch_18
    move-object/from16 v0, p1

    .line 432
    .line 433
    check-cast v0, Lhv6;

    .line 434
    .line 435
    move-object/from16 v0, p2

    .line 436
    .line 437
    check-cast v0, Lv94;

    .line 438
    .line 439
    iget v0, v0, Lv94;->a:I

    .line 440
    .line 441
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    return-object v0

    .line 446
    :pswitch_19
    move-object/from16 v0, p1

    .line 447
    .line 448
    check-cast v0, Lhv6;

    .line 449
    .line 450
    move-object/from16 v0, p2

    .line 451
    .line 452
    check-cast v0, Lnz1;

    .line 453
    .line 454
    iget v0, v0, Lnz1;->a:I

    .line 455
    .line 456
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    return-object v0

    .line 461
    :pswitch_1a
    move-object/from16 v0, p1

    .line 462
    .line 463
    check-cast v0, Lhv6;

    .line 464
    .line 465
    move-object/from16 v1, p2

    .line 466
    .line 467
    check-cast v1, Lfp5;

    .line 468
    .line 469
    iget-boolean v2, v1, Lfp5;->a:Z

    .line 470
    .line 471
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    sget-object v3, Lgw6;->a:Lxd6;

    .line 476
    .line 477
    iget v1, v1, Lfp5;->b:I

    .line 478
    .line 479
    new-instance v3, Lnz1;

    .line 480
    .line 481
    invoke-direct {v3, v1}, Lnz1;-><init>(I)V

    .line 482
    .line 483
    .line 484
    sget-object v1, Lzc1;->d:Lxd6;

    .line 485
    .line 486
    invoke-static {v3, v1, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    return-object v0

    .line 499
    :pswitch_1b
    move-object/from16 v0, p1

    .line 500
    .line 501
    check-cast v0, Lhv6;

    .line 502
    .line 503
    move-object/from16 v1, p2

    .line 504
    .line 505
    check-cast v1, Lc88;

    .line 506
    .line 507
    iget-object v2, v1, Lc88;->a:Lqe7;

    .line 508
    .line 509
    sget-object v3, Lgw6;->h:Lxd6;

    .line 510
    .line 511
    invoke-static {v2, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    iget-object v4, v1, Lc88;->b:Lqe7;

    .line 516
    .line 517
    invoke-static {v4, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v4

    .line 521
    iget-object v5, v1, Lc88;->c:Lqe7;

    .line 522
    .line 523
    invoke-static {v5, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    iget-object v1, v1, Lc88;->d:Lqe7;

    .line 528
    .line 529
    invoke-static {v1, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    filled-new-array {v2, v4, v5, v0}, [Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    return-object v0

    .line 542
    :pswitch_1c
    move-object/from16 v0, p1

    .line 543
    .line 544
    check-cast v0, Lhv6;

    .line 545
    .line 546
    move-object/from16 v1, p2

    .line 547
    .line 548
    check-cast v1, Lqe7;

    .line 549
    .line 550
    iget-object v2, v1, Lqe7;->a:Lf78;

    .line 551
    .line 552
    invoke-interface {v2}, Lf78;->b()J

    .line 553
    .line 554
    .line 555
    move-result-wide v2

    .line 556
    new-instance v4, Ldw0;

    .line 557
    .line 558
    invoke-direct {v4, v2, v3}, Ldw0;-><init>(J)V

    .line 559
    .line 560
    .line 561
    sget-object v2, Lgw6;->p:Lfw6;

    .line 562
    .line 563
    invoke-static {v4, v2, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    iget-wide v3, v1, Lqe7;->b:J

    .line 568
    .line 569
    new-instance v6, Lv88;

    .line 570
    .line 571
    invoke-direct {v6, v3, v4}, Lv88;-><init>(J)V

    .line 572
    .line 573
    .line 574
    sget-object v3, Lgw6;->v:Lfw6;

    .line 575
    .line 576
    invoke-static {v6, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    iget-object v4, v1, Lqe7;->c:Ldj2;

    .line 581
    .line 582
    sget-object v7, Ldj2;->Y:Ldj2;

    .line 583
    .line 584
    sget-object v7, Lgw6;->m:Lxd6;

    .line 585
    .line 586
    invoke-static {v4, v7, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    iget-object v4, v1, Lqe7;->d:Lbj2;

    .line 591
    .line 592
    sget-object v8, Lgw6;->t:Lxd6;

    .line 593
    .line 594
    invoke-static {v4, v8, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    iget-object v4, v1, Lqe7;->e:Lcj2;

    .line 599
    .line 600
    sget-object v9, Lgw6;->u:Lxd6;

    .line 601
    .line 602
    invoke-static {v4, v9, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v9

    .line 606
    const/4 v4, -0x1

    .line 607
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object v10

    .line 611
    iget-object v11, v1, Lqe7;->g:Ljava/lang/String;

    .line 612
    .line 613
    iget-wide v12, v1, Lqe7;->h:J

    .line 614
    .line 615
    new-instance v4, Lv88;

    .line 616
    .line 617
    invoke-direct {v4, v12, v13}, Lv88;-><init>(J)V

    .line 618
    .line 619
    .line 620
    invoke-static {v4, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v12

    .line 624
    iget-object v3, v1, Lqe7;->i:Lx20;

    .line 625
    .line 626
    sget-object v4, Lgw6;->n:Lxd6;

    .line 627
    .line 628
    invoke-static {v3, v4, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v13

    .line 632
    iget-object v3, v1, Lqe7;->j:Lg78;

    .line 633
    .line 634
    sget-object v4, Lgw6;->k:Lxd6;

    .line 635
    .line 636
    invoke-static {v3, v4, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v14

    .line 640
    iget-object v3, v1, Lqe7;->k:Lge4;

    .line 641
    .line 642
    sget-object v4, Lge4;->Z:Lge4;

    .line 643
    .line 644
    sget-object v4, Lgw6;->y:Lxd6;

    .line 645
    .line 646
    invoke-static {v3, v4, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v15

    .line 650
    iget-wide v3, v1, Lqe7;->l:J

    .line 651
    .line 652
    move-object/from16 p0, v5

    .line 653
    .line 654
    new-instance v5, Ldw0;

    .line 655
    .line 656
    invoke-direct {v5, v3, v4}, Ldw0;-><init>(J)V

    .line 657
    .line 658
    .line 659
    invoke-static {v5, v2, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v16

    .line 663
    iget-object v2, v1, Lqe7;->m:Lx38;

    .line 664
    .line 665
    sget-object v3, Lgw6;->j:Lxd6;

    .line 666
    .line 667
    invoke-static {v2, v3, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v17

    .line 671
    iget-object v1, v1, Lqe7;->n:Lt67;

    .line 672
    .line 673
    sget-object v2, Lt67;->d:Lt67;

    .line 674
    .line 675
    sget-object v2, Lgw6;->o:Lxd6;

    .line 676
    .line 677
    invoke-static {v1, v2, v0}, Lgw6;->a(Ljava/lang/Object;Lbw6;Lhv6;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v18

    .line 681
    move-object/from16 v5, p0

    .line 682
    .line 683
    filled-new-array/range {v5 .. v18}, [Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    return-object v0

    .line 692
    nop

    .line 693
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

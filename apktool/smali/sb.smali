.class public final Lsb;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lsb;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lsb;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lsb;->X:B

    .line 4
    .line 5
    sget-object v2, Lzz0;->a:Lbe;

    .line 6
    .line 7
    sget-object v3, Lhx4;->X:Lhx4;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    sget-object v7, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    iget-object v0, v0, Lsb;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Llp2;

    .line 22
    .line 23
    move-object/from16 v2, p2

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    and-int/lit8 v3, v2, 0x3

    .line 32
    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    move v5, v6

    .line 36
    :cond_0
    and-int/2addr v2, v6

    .line 37
    invoke-virtual {v1, v2, v5}, Llp2;->N(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    move-object v8, v0

    .line 44
    check-cast v8, Ljava/lang/String;

    .line 45
    .line 46
    const/16 v28, 0x0

    .line 47
    .line 48
    const v29, 0x3fffe

    .line 49
    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    const-wide/16 v10, 0x0

    .line 53
    .line 54
    const/4 v12, 0x0

    .line 55
    const-wide/16 v13, 0x0

    .line 56
    .line 57
    const-wide/16 v15, 0x0

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const-wide/16 v18, 0x0

    .line 62
    .line 63
    const/16 v20, 0x0

    .line 64
    .line 65
    const/16 v21, 0x0

    .line 66
    .line 67
    const/16 v22, 0x0

    .line 68
    .line 69
    const/16 v23, 0x0

    .line 70
    .line 71
    const/16 v24, 0x0

    .line 72
    .line 73
    const/16 v25, 0x0

    .line 74
    .line 75
    const/16 v27, 0x0

    .line 76
    .line 77
    move-object/from16 v26, v1

    .line 78
    .line 79
    invoke-static/range {v8 .. v29}, Lu78;->b(Ljava/lang/String;Lkx4;JLmx;JJLo28;JIZIILgn2;Lo88;Llp2;III)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move-object/from16 v26, v1

    .line 84
    .line 85
    invoke-virtual/range {v26 .. v26}, Llp2;->Q()V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v7

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, Llp2;

    .line 92
    .line 93
    move-object/from16 v8, p2

    .line 94
    .line 95
    check-cast v8, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    and-int/lit8 v9, v8, 0x3

    .line 102
    .line 103
    if-eq v9, v4, :cond_2

    .line 104
    .line 105
    move v4, v6

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move v4, v5

    .line 108
    :goto_1
    and-int/2addr v8, v6

    .line 109
    invoke-virtual {v1, v8, v4}, Llp2;->N(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_7

    .line 114
    .line 115
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    if-ne v4, v2, :cond_3

    .line 120
    .line 121
    new-instance v4, Ldx4;

    .line 122
    .line 123
    invoke-direct {v4, v5}, Ldx4;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    check-cast v4, Lgn2;

    .line 130
    .line 131
    invoke-static {v3, v5, v4}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v0, Ly05;

    .line 136
    .line 137
    sget-object v3, Lpz2;->Z:Lp50;

    .line 138
    .line 139
    invoke-static {v3, v5}, Lg80;->c(Lp50;Z)Lxr4;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-static {v1}, Lkm4;->I(Llp2;)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-static {v1, v2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v9, Luz0;->j:Lpz2;

    .line 156
    .line 157
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Llp2;->Z()V

    .line 161
    .line 162
    .line 163
    iget-boolean v9, v1, Llp2;->S:Z

    .line 164
    .line 165
    if-eqz v9, :cond_4

    .line 166
    .line 167
    invoke-virtual {v1}, Llp2;->k()V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_4
    invoke-virtual {v1}, Llp2;->j0()V

    .line 172
    .line 173
    .line 174
    :goto_2
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 175
    .line 176
    invoke-static {v9, v1, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object v3, Lpz2;->A0:Ldx0;

    .line 180
    .line 181
    invoke-static {v3, v1, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 185
    .line 186
    iget-boolean v8, v1, Llp2;->S:Z

    .line 187
    .line 188
    if-nez v8, :cond_5

    .line 189
    .line 190
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-nez v8, :cond_6

    .line 203
    .line 204
    :cond_5
    invoke-static {v4, v1, v4, v3}, Lp61;->v(ILlp2;ILdx0;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    sget-object v3, Lpz2;->z0:Ldx0;

    .line 208
    .line 209
    invoke-static {v3, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Lrn2;

    .line 217
    .line 218
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-interface {v0, v1, v2}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v6}, Llp2;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_7
    invoke-virtual {v1}, Llp2;->Q()V

    .line 230
    .line 231
    .line 232
    :goto_3
    return-object v7

    .line 233
    :pswitch_1
    move-object/from16 v1, p1

    .line 234
    .line 235
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 236
    .line 237
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    move-object/from16 v2, p2

    .line 242
    .line 243
    check-cast v2, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 253
    .line 254
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0, v1, v2}, Lsu/happ/proxyutility/feature/main/MainViewModel;->B(Ljava/lang/String;Z)V

    .line 259
    .line 260
    .line 261
    return-object v7

    .line 262
    :pswitch_2
    move-object/from16 v1, p1

    .line 263
    .line 264
    check-cast v1, Llp2;

    .line 265
    .line 266
    move-object/from16 v2, p2

    .line 267
    .line 268
    check-cast v2, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    and-int/lit8 v8, v2, 0x3

    .line 275
    .line 276
    if-eq v8, v4, :cond_8

    .line 277
    .line 278
    move v5, v6

    .line 279
    :cond_8
    and-int/2addr v2, v6

    .line 280
    invoke-virtual {v1, v2, v5}, Llp2;->N(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_c

    .line 285
    .line 286
    sget-object v2, Lpz2;->o0:Lo50;

    .line 287
    .line 288
    check-cast v0, Lma7;

    .line 289
    .line 290
    iget-object v0, v0, Lma7;->f:Lsn2;

    .line 291
    .line 292
    const/16 v4, 0x36

    .line 293
    .line 294
    sget-object v5, Lht;->b:Lct;

    .line 295
    .line 296
    invoke-static {v5, v2, v1, v4}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-static {v1}, Lkm4;->I(Llp2;)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-static {v1, v3}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    sget-object v8, Luz0;->j:Lpz2;

    .line 313
    .line 314
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Llp2;->Z()V

    .line 318
    .line 319
    .line 320
    iget-boolean v8, v1, Llp2;->S:Z

    .line 321
    .line 322
    if-eqz v8, :cond_9

    .line 323
    .line 324
    invoke-virtual {v1}, Llp2;->k()V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_9
    invoke-virtual {v1}, Llp2;->j0()V

    .line 329
    .line 330
    .line 331
    :goto_4
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 332
    .line 333
    invoke-static {v8, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 337
    .line 338
    invoke-static {v2, v1, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 342
    .line 343
    iget-boolean v5, v1, Llp2;->S:Z

    .line 344
    .line 345
    if-nez v5, :cond_a

    .line 346
    .line 347
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    invoke-static {v5, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-nez v5, :cond_b

    .line 360
    .line 361
    :cond_a
    invoke-static {v4, v1, v4, v2}, Lp61;->v(ILlp2;ILdx0;)V

    .line 362
    .line 363
    .line 364
    :cond_b
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 365
    .line 366
    invoke-static {v2, v1, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    const/4 v2, 0x6

    .line 370
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    sget-object v3, Lxq6;->a:Lxq6;

    .line 375
    .line 376
    invoke-interface {v0, v3, v1, v2}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v6}, Llp2;->p(Z)V

    .line 380
    .line 381
    .line 382
    goto :goto_5

    .line 383
    :cond_c
    invoke-virtual {v1}, Llp2;->Q()V

    .line 384
    .line 385
    .line 386
    :goto_5
    return-object v7

    .line 387
    :pswitch_3
    move-object/from16 v1, p1

    .line 388
    .line 389
    check-cast v1, Llp2;

    .line 390
    .line 391
    move-object/from16 v8, p2

    .line 392
    .line 393
    check-cast v8, Ljava/lang/Number;

    .line 394
    .line 395
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    check-cast v0, Llr;

    .line 400
    .line 401
    and-int/lit8 v9, v8, 0x3

    .line 402
    .line 403
    if-eq v9, v4, :cond_d

    .line 404
    .line 405
    move v4, v6

    .line 406
    goto :goto_6

    .line 407
    :cond_d
    move v4, v5

    .line 408
    :goto_6
    and-int/2addr v8, v6

    .line 409
    invoke-virtual {v1, v8, v4}, Llp2;->N(IZ)Z

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-eqz v4, :cond_13

    .line 414
    .line 415
    sget v4, La56;->m3c_dialog:I

    .line 416
    .line 417
    invoke-static {v4, v1}, Lw79;->B(ILlp2;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    sget-object v8, Ln8;->a:Lig5;

    .line 422
    .line 423
    const/high16 v8, 0x440c0000    # 560.0f

    .line 424
    .line 425
    const/16 v9, 0xa

    .line 426
    .line 427
    const/high16 v10, 0x438c0000    # 280.0f

    .line 428
    .line 429
    const/4 v11, 0x0

    .line 430
    invoke-static {v3, v10, v11, v8, v9}, Landroidx/compose/foundation/layout/b;->j(Lkx4;FFFI)Lkx4;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-virtual {v1, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    if-nez v9, :cond_e

    .line 443
    .line 444
    if-ne v10, v2, :cond_f

    .line 445
    .line 446
    :cond_e
    new-instance v10, Lm40;

    .line 447
    .line 448
    invoke-direct {v10, v4, v6}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    :cond_f
    check-cast v10, Lgn2;

    .line 455
    .line 456
    invoke-static {v3, v5, v10}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-interface {v8, v2}, Lkx4;->y(Lkx4;)Lkx4;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    sget-object v3, Lpz2;->Z:Lp50;

    .line 465
    .line 466
    invoke-static {v3, v6}, Lg80;->c(Lp50;Z)Lxr4;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-static {v1}, Lkm4;->I(Llp2;)I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    invoke-static {v1, v2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    sget-object v9, Luz0;->j:Lpz2;

    .line 483
    .line 484
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1}, Llp2;->Z()V

    .line 488
    .line 489
    .line 490
    iget-boolean v9, v1, Llp2;->S:Z

    .line 491
    .line 492
    if-eqz v9, :cond_10

    .line 493
    .line 494
    invoke-virtual {v1}, Llp2;->k()V

    .line 495
    .line 496
    .line 497
    goto :goto_7

    .line 498
    :cond_10
    invoke-virtual {v1}, Llp2;->j0()V

    .line 499
    .line 500
    .line 501
    :goto_7
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 502
    .line 503
    invoke-static {v9, v1, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    sget-object v3, Lpz2;->A0:Ldx0;

    .line 507
    .line 508
    invoke-static {v3, v1, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 512
    .line 513
    iget-boolean v8, v1, Llp2;->S:Z

    .line 514
    .line 515
    if-nez v8, :cond_11

    .line 516
    .line 517
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    if-nez v8, :cond_12

    .line 530
    .line 531
    :cond_11
    invoke-static {v4, v1, v4, v3}, Lp61;->v(ILlp2;ILdx0;)V

    .line 532
    .line 533
    .line 534
    :cond_12
    sget-object v3, Lpz2;->z0:Ldx0;

    .line 535
    .line 536
    invoke-static {v3, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    iget-object v0, v0, Llr;->f0:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, Lzy0;

    .line 542
    .line 543
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-virtual {v0, v1, v2}, Lzy0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1, v6}, Llp2;->p(Z)V

    .line 551
    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_13
    invoke-virtual {v1}, Llp2;->Q()V

    .line 555
    .line 556
    .line 557
    :goto_8
    return-object v7

    .line 558
    :pswitch_4
    move-object/from16 v1, p1

    .line 559
    .line 560
    check-cast v1, Lug2;

    .line 561
    .line 562
    iget v1, v1, Lug2;->a:I

    .line 563
    .line 564
    move-object/from16 v2, p2

    .line 565
    .line 566
    check-cast v2, Ljava/lang/Boolean;

    .line 567
    .line 568
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    invoke-static {v1}, Lah2;->b(I)Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    if-eqz v1, :cond_15

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 583
    .line 584
    const/16 v4, 0x1f

    .line 585
    .line 586
    if-lt v3, v4, :cond_14

    .line 587
    .line 588
    sget-object v3, Ljn;->a:Ljn;

    .line 589
    .line 590
    invoke-virtual {v3, v1, v2}, Ljn;->a(IZ)I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    goto :goto_9

    .line 595
    :cond_14
    invoke-static {v1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    :goto_9
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 600
    .line 601
    invoke-virtual {v0, v1}, Landroid/view/View;->playSoundEffect(I)V

    .line 602
    .line 603
    .line 604
    :cond_15
    return-object v7

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

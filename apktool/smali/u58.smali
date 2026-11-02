.class public final Lu58;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llh7;
.implements Lyh7;


# instance fields
.field public final X:Lrh5;

.field public final Y:Lrh5;

.field public Z:Ly45;

.field public f0:Lr58;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrh5;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, Lt58;->f:Lf08;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lu58;->X:Lrh5;

    .line 13
    .line 14
    new-instance v0, Lrh5;

    .line 15
    .line 16
    sget-object v2, Ls58;->g:Ls18;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lu58;->Y:Lrh5;

    .line 22
    .line 23
    new-instance v0, Lr58;

    .line 24
    .line 25
    invoke-direct {v0}, Lr58;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lu58;->f0:Lr58;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Lt58;Ls58;)Lx78;
    .locals 30

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
    iget-object v3, v1, Lt58;->a:Lkd8;

    .line 8
    .line 9
    invoke-virtual {v3}, Lkd8;->d()Lh48;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v3, Lh48;->X:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, v3, Lh48;->Y:Lc78;

    .line 16
    .line 17
    if-eqz v5, :cond_4

    .line 18
    .line 19
    iget-object v5, v5, Lc78;->a:Lp88;

    .line 20
    .line 21
    new-instance v7, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v8, v5, Lp88;->b:Ldf3;

    .line 27
    .line 28
    iget v9, v8, Ldf3;->d:I

    .line 29
    .line 30
    iget v10, v8, Ldf3;->e:I

    .line 31
    .line 32
    if-ne v9, v10, :cond_0

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_0
    const/4 v9, 0x4

    .line 36
    :goto_0
    iget-object v10, v8, Ldf3;->b:Lzz4;

    .line 37
    .line 38
    iget v11, v10, Lzz4;->b:I

    .line 39
    .line 40
    if-ge v9, v11, :cond_5

    .line 41
    .line 42
    invoke-virtual {v10, v9}, Lzz4;->d(I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    invoke-static {v10, v11}, Ljb5;->V(J)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-nez v10, :cond_3

    .line 51
    .line 52
    iget-object v10, v8, Ldf3;->a:Lj05;

    .line 53
    .line 54
    div-int/lit8 v11, v9, 0x4

    .line 55
    .line 56
    invoke-virtual {v10, v11}, Lj05;->g(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    if-eqz v10, :cond_3

    .line 61
    .line 62
    invoke-virtual {v8, v9}, Ldf3;->n(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v11

    .line 66
    new-instance v13, Lpl;

    .line 67
    .line 68
    invoke-static {v11, v12}, Ljb5;->W(J)I

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    iget v15, v5, Lp88;->c:I

    .line 73
    .line 74
    if-gt v14, v15, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v5}, Lp88;->c()I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    sub-int/2addr v14, v15

    .line 82
    :goto_1
    const-wide/32 v15, 0x7fffffff

    .line 83
    .line 84
    .line 85
    and-long/2addr v11, v15

    .line 86
    long-to-int v11, v11

    .line 87
    iget v12, v5, Lp88;->c:I

    .line 88
    .line 89
    if-gt v11, v12, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {v5}, Lp88;->c()I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    sub-int/2addr v11, v12

    .line 97
    :goto_2
    invoke-direct {v13, v14, v11, v10}, Lpl;-><init>(IILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_3
    add-int/lit8 v9, v9, 0x4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    const/4 v7, 0x0

    .line 107
    :cond_5
    :goto_3
    if-eqz v4, :cond_6

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    :cond_6
    if-eqz v7, :cond_b

    .line 116
    .line 117
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_7

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_7
    if-eqz v4, :cond_a

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_8

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    if-eqz v7, :cond_c

    .line 134
    .line 135
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_9

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_9
    invoke-static {}, Li21;->r()Lgb4;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v5, v4}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v7}, Lgb4;->addAll(Ljava/util/Collection;)Z

    .line 150
    .line 151
    .line 152
    invoke-static {v5}, Li21;->j(Lgb4;)Lgb4;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    goto :goto_6

    .line 157
    :cond_a
    :goto_4
    move-object v4, v7

    .line 158
    goto :goto_6

    .line 159
    :cond_b
    :goto_5
    const/4 v4, 0x0

    .line 160
    :cond_c
    :goto_6
    iget-object v5, v0, Lu58;->f0:Lr58;

    .line 161
    .line 162
    invoke-static {v5}, Lkd7;->f(Lbi7;)Lbi7;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Lr58;

    .line 167
    .line 168
    iget-object v7, v5, Lr58;->n:Lx78;

    .line 169
    .line 170
    const/4 v8, 0x1

    .line 171
    const/4 v9, 0x0

    .line 172
    if-eqz v7, :cond_11

    .line 173
    .line 174
    iget-object v10, v5, Lr58;->c:Ljava/lang/CharSequence;

    .line 175
    .line 176
    if-eqz v10, :cond_11

    .line 177
    .line 178
    invoke-static {v10, v3}, Lmm7;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-ne v10, v8, :cond_11

    .line 183
    .line 184
    iget-object v10, v5, Lr58;->d:Ljava/util/List;

    .line 185
    .line 186
    invoke-static {v10, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-eqz v10, :cond_11

    .line 191
    .line 192
    iget-object v10, v5, Lr58;->e:Lf88;

    .line 193
    .line 194
    iget-object v11, v3, Lh48;->g0:Lf88;

    .line 195
    .line 196
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    if-eqz v10, :cond_11

    .line 201
    .line 202
    iget-boolean v10, v5, Lr58;->g:Z

    .line 203
    .line 204
    iget-boolean v11, v1, Lt58;->c:Z

    .line 205
    .line 206
    if-ne v10, v11, :cond_11

    .line 207
    .line 208
    iget-boolean v10, v5, Lr58;->h:Z

    .line 209
    .line 210
    iget-boolean v11, v1, Lt58;->d:Z

    .line 211
    .line 212
    if-ne v10, v11, :cond_11

    .line 213
    .line 214
    iget-object v10, v5, Lr58;->k:Lz24;

    .line 215
    .line 216
    iget-object v11, v2, Ls58;->b:Lz24;

    .line 217
    .line 218
    if-ne v10, v11, :cond_11

    .line 219
    .line 220
    iget v10, v5, Lr58;->i:F

    .line 221
    .line 222
    iget-object v11, v2, Ls58;->a:Lzr4;

    .line 223
    .line 224
    invoke-interface {v11}, Lfi1;->getDensity()F

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    cmpg-float v10, v10, v11

    .line 229
    .line 230
    if-nez v10, :cond_11

    .line 231
    .line 232
    iget v10, v5, Lr58;->j:F

    .line 233
    .line 234
    iget-object v11, v2, Ls58;->a:Lzr4;

    .line 235
    .line 236
    invoke-interface {v11}, Lfi1;->b0()F

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    cmpg-float v10, v10, v11

    .line 241
    .line 242
    if-nez v10, :cond_11

    .line 243
    .line 244
    iget-wide v10, v5, Lr58;->m:J

    .line 245
    .line 246
    iget-wide v12, v2, Ls58;->d:J

    .line 247
    .line 248
    invoke-static {v10, v11, v12, v13}, Lq31;->b(JJ)Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_11

    .line 253
    .line 254
    iget-object v10, v5, Lr58;->l:Lfi2;

    .line 255
    .line 256
    iget-object v11, v2, Ls58;->c:Lfi2;

    .line 257
    .line 258
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-eqz v10, :cond_11

    .line 263
    .line 264
    iget-object v10, v7, Lx78;->b:Lbz4;

    .line 265
    .line 266
    iget-object v10, v10, Lbz4;->a:Ly5;

    .line 267
    .line 268
    invoke-virtual {v10}, Ly5;->b()Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    if-nez v10, :cond_11

    .line 273
    .line 274
    iget-object v10, v5, Lr58;->f:Lo88;

    .line 275
    .line 276
    if-eqz v10, :cond_d

    .line 277
    .line 278
    iget-object v11, v1, Lt58;->b:Lo88;

    .line 279
    .line 280
    invoke-virtual {v10, v11}, Lo88;->c(Lo88;)Z

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    goto :goto_7

    .line 285
    :cond_d
    move v10, v9

    .line 286
    :goto_7
    iget-object v5, v5, Lr58;->f:Lo88;

    .line 287
    .line 288
    if-eqz v5, :cond_f

    .line 289
    .line 290
    iget-object v11, v1, Lt58;->b:Lo88;

    .line 291
    .line 292
    if-eq v5, v11, :cond_e

    .line 293
    .line 294
    iget-object v5, v5, Lo88;->a:Lqe7;

    .line 295
    .line 296
    iget-object v11, v11, Lo88;->a:Lqe7;

    .line 297
    .line 298
    invoke-virtual {v5, v11}, Lqe7;->b(Lqe7;)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    if-eqz v5, :cond_f

    .line 303
    .line 304
    :cond_e
    move v5, v8

    .line 305
    goto :goto_8

    .line 306
    :cond_f
    move v5, v9

    .line 307
    :goto_8
    if-eqz v10, :cond_10

    .line 308
    .line 309
    if-eqz v5, :cond_10

    .line 310
    .line 311
    return-object v7

    .line 312
    :cond_10
    if-eqz v10, :cond_11

    .line 313
    .line 314
    new-instance v11, Lw78;

    .line 315
    .line 316
    iget-object v0, v7, Lx78;->a:Lw78;

    .line 317
    .line 318
    iget-object v12, v0, Lw78;->a:Lql;

    .line 319
    .line 320
    iget-object v13, v1, Lt58;->b:Lo88;

    .line 321
    .line 322
    iget-object v14, v0, Lw78;->c:Ljava/util/List;

    .line 323
    .line 324
    iget v15, v0, Lw78;->d:I

    .line 325
    .line 326
    iget-boolean v1, v0, Lw78;->e:Z

    .line 327
    .line 328
    iget v2, v0, Lw78;->f:I

    .line 329
    .line 330
    iget-object v3, v0, Lw78;->g:Lfi1;

    .line 331
    .line 332
    iget-object v4, v0, Lw78;->h:Lz24;

    .line 333
    .line 334
    iget-object v5, v0, Lw78;->i:Lfi2;

    .line 335
    .line 336
    iget-wide v8, v0, Lw78;->j:J

    .line 337
    .line 338
    move/from16 v16, v1

    .line 339
    .line 340
    move/from16 v17, v2

    .line 341
    .line 342
    move-object/from16 v18, v3

    .line 343
    .line 344
    move-object/from16 v19, v4

    .line 345
    .line 346
    move-object/from16 v20, v5

    .line 347
    .line 348
    move-wide/from16 v21, v8

    .line 349
    .line 350
    invoke-direct/range {v11 .. v22}, Lw78;-><init>(Lql;Lo88;Ljava/util/List;IZILfi1;Lz24;Lfi2;J)V

    .line 351
    .line 352
    .line 353
    iget-wide v0, v7, Lx78;->c:J

    .line 354
    .line 355
    new-instance v2, Lx78;

    .line 356
    .line 357
    iget-object v3, v7, Lx78;->b:Lbz4;

    .line 358
    .line 359
    invoke-direct {v2, v11, v3, v0, v1}, Lx78;-><init>(Lw78;Lbz4;J)V

    .line 360
    .line 361
    .line 362
    return-object v2

    .line 363
    :cond_11
    sget-object v15, Ld02;->X:Ld02;

    .line 364
    .line 365
    iget-object v5, v0, Lu58;->Z:Ly45;

    .line 366
    .line 367
    if-nez v5, :cond_12

    .line 368
    .line 369
    new-instance v5, Ly45;

    .line 370
    .line 371
    iget-object v10, v2, Ls58;->c:Lfi2;

    .line 372
    .line 373
    iget-object v10, v2, Ls58;->a:Lzr4;

    .line 374
    .line 375
    iget-object v10, v2, Ls58;->b:Lz24;

    .line 376
    .line 377
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 378
    .line 379
    .line 380
    new-instance v10, Lzv7;

    .line 381
    .line 382
    const/4 v11, 0x3

    .line 383
    invoke-direct {v10, v11}, Lzv7;-><init>(B)V

    .line 384
    .line 385
    .line 386
    iput-object v10, v5, Ly45;->X:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v5, v0, Lu58;->Z:Ly45;

    .line 389
    .line 390
    :cond_12
    iget-boolean v10, v1, Lt58;->e:Z

    .line 391
    .line 392
    iget-object v11, v1, Lt58;->b:Lo88;

    .line 393
    .line 394
    if-eqz v10, :cond_18

    .line 395
    .line 396
    iget-object v10, v11, Lo88;->a:Lqe7;

    .line 397
    .line 398
    iget-object v10, v10, Lqe7;->k:Lge4;

    .line 399
    .line 400
    if-eqz v10, :cond_13

    .line 401
    .line 402
    iget-object v10, v10, Lge4;->X:Ljava/util/List;

    .line 403
    .line 404
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    check-cast v10, Lce4;

    .line 409
    .line 410
    if-nez v10, :cond_14

    .line 411
    .line 412
    :cond_13
    sget-object v10, Luo5;->a:Llr;

    .line 413
    .line 414
    invoke-virtual {v10}, Llr;->l()Lge4;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    iget-object v10, v10, Lge4;->X:Ljava/util/List;

    .line 419
    .line 420
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    check-cast v10, Lce4;

    .line 425
    .line 426
    :cond_14
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 427
    .line 428
    const/16 v13, 0x1c

    .line 429
    .line 430
    if-lt v12, v13, :cond_15

    .line 431
    .line 432
    invoke-static {v10}, Len;->N(Lce4;)B

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    goto :goto_9

    .line 437
    :cond_15
    iget-object v10, v10, Lce4;->a:Ljava/util/Locale;

    .line 438
    .line 439
    invoke-static {v10}, Landroid/icu/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    invoke-virtual {v10}, Landroid/icu/text/DecimalFormatSymbols;->getZeroDigit()C

    .line 444
    .line 445
    .line 446
    move-result v10

    .line 447
    invoke-static {v10}, Ljava/lang/Character;->getDirectionality(C)B

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    :goto_9
    const/4 v12, 0x2

    .line 452
    if-eq v10, v8, :cond_17

    .line 453
    .line 454
    if-ne v10, v12, :cond_16

    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_16
    move/from16 v26, v8

    .line 458
    .line 459
    goto :goto_b

    .line 460
    :cond_17
    :goto_a
    move/from16 v26, v12

    .line 461
    .line 462
    :goto_b
    new-instance v16, Lo88;

    .line 463
    .line 464
    const-wide/16 v27, 0x0

    .line 465
    .line 466
    const v29, 0xfeffff

    .line 467
    .line 468
    .line 469
    const-wide/16 v17, 0x0

    .line 470
    .line 471
    const-wide/16 v19, 0x0

    .line 472
    .line 473
    const/16 v21, 0x0

    .line 474
    .line 475
    const/16 v22, 0x0

    .line 476
    .line 477
    const-wide/16 v23, 0x0

    .line 478
    .line 479
    const/16 v25, 0x0

    .line 480
    .line 481
    invoke-direct/range {v16 .. v29}, Lo88;-><init>(JJLdj2;Lbj2;JIIJI)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v10, v16

    .line 485
    .line 486
    invoke-virtual {v11, v10}, Lo88;->d(Lo88;)Lo88;

    .line 487
    .line 488
    .line 489
    move-result-object v11

    .line 490
    :cond_18
    move-object v14, v11

    .line 491
    new-instance v13, Lql;

    .line 492
    .line 493
    iget-object v10, v3, Lh48;->Z:Ljava/lang/CharSequence;

    .line 494
    .line 495
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    if-nez v4, :cond_19

    .line 500
    .line 501
    move-object v11, v15

    .line 502
    goto :goto_c

    .line 503
    :cond_19
    move-object v11, v4

    .line 504
    :goto_c
    invoke-direct {v13, v10, v11}, Lql;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 505
    .line 506
    .line 507
    iget-boolean v10, v1, Lt58;->d:Z

    .line 508
    .line 509
    iget-boolean v11, v1, Lt58;->c:Z

    .line 510
    .line 511
    const v24, 0x7fffffff

    .line 512
    .line 513
    .line 514
    if-eqz v11, :cond_1a

    .line 515
    .line 516
    move/from16 v16, v8

    .line 517
    .line 518
    goto :goto_d

    .line 519
    :cond_1a
    move/from16 v16, v24

    .line 520
    .line 521
    :goto_d
    iget-wide v11, v2, Ls58;->d:J

    .line 522
    .line 523
    iget-object v8, v2, Ls58;->b:Lz24;

    .line 524
    .line 525
    iget-object v6, v2, Ls58;->a:Lzr4;

    .line 526
    .line 527
    iget-object v9, v2, Ls58;->c:Lfi2;

    .line 528
    .line 529
    iget-object v5, v5, Ly45;->X:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v5, Lzv7;

    .line 532
    .line 533
    move-wide/from16 v22, v11

    .line 534
    .line 535
    new-instance v12, Lw78;

    .line 536
    .line 537
    const/16 v18, 0x1

    .line 538
    .line 539
    move-object/from16 v19, v6

    .line 540
    .line 541
    move-object/from16 v20, v8

    .line 542
    .line 543
    move-object/from16 v21, v9

    .line 544
    .line 545
    move/from16 v17, v10

    .line 546
    .line 547
    invoke-direct/range {v12 .. v23}, Lw78;-><init>(Lql;Lo88;Ljava/util/List;IZILfi1;Lz24;Lfi2;J)V

    .line 548
    .line 549
    .line 550
    move-object v10, v12

    .line 551
    move/from16 v11, v18

    .line 552
    .line 553
    move-object/from16 v6, v20

    .line 554
    .line 555
    move-wide/from16 v8, v22

    .line 556
    .line 557
    move/from16 v20, v16

    .line 558
    .line 559
    move-object/from16 v16, v19

    .line 560
    .line 561
    if-eqz v5, :cond_1f

    .line 562
    .line 563
    new-instance v12, Loc0;

    .line 564
    .line 565
    invoke-direct {v12, v10}, Loc0;-><init>(Lw78;)V

    .line 566
    .line 567
    .line 568
    iget-object v11, v5, Lzv7;->X:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v11, Lej4;

    .line 571
    .line 572
    if-eqz v11, :cond_1b

    .line 573
    .line 574
    invoke-virtual {v11, v12}, Lej4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v11

    .line 578
    check-cast v11, Lx78;

    .line 579
    .line 580
    goto :goto_e

    .line 581
    :cond_1b
    iget-object v11, v5, Lzv7;->Y:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v11, Loc0;

    .line 584
    .line 585
    invoke-static {v11, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v11

    .line 589
    if-eqz v11, :cond_1c

    .line 590
    .line 591
    iget-object v11, v5, Lzv7;->Z:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v11, Lx78;

    .line 594
    .line 595
    :goto_e
    if-nez v11, :cond_1d

    .line 596
    .line 597
    :cond_1c
    :goto_f
    const/16 v25, 0x0

    .line 598
    .line 599
    goto :goto_10

    .line 600
    :cond_1d
    iget-object v12, v11, Lx78;->b:Lbz4;

    .line 601
    .line 602
    iget-object v12, v12, Lbz4;->a:Ly5;

    .line 603
    .line 604
    invoke-virtual {v12}, Ly5;->b()Z

    .line 605
    .line 606
    .line 607
    move-result v12

    .line 608
    if-eqz v12, :cond_1e

    .line 609
    .line 610
    goto :goto_f

    .line 611
    :cond_1e
    move-object/from16 v25, v11

    .line 612
    .line 613
    :goto_10
    move-object/from16 v11, v25

    .line 614
    .line 615
    goto :goto_11

    .line 616
    :cond_1f
    const/4 v11, 0x0

    .line 617
    :goto_11
    const/16 v22, 0x20

    .line 618
    .line 619
    const-wide v27, 0xffffffffL

    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    if-eqz v11, :cond_20

    .line 625
    .line 626
    iget-object v5, v11, Lx78;->b:Lbz4;

    .line 627
    .line 628
    iget v6, v5, Lbz4;->d:F

    .line 629
    .line 630
    float-to-double v12, v6

    .line 631
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 632
    .line 633
    .line 634
    move-result-wide v12

    .line 635
    double-to-float v6, v12

    .line 636
    float-to-int v6, v6

    .line 637
    iget v5, v5, Lbz4;->e:F

    .line 638
    .line 639
    float-to-double v12, v5

    .line 640
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 641
    .line 642
    .line 643
    move-result-wide v12

    .line 644
    double-to-float v5, v12

    .line 645
    float-to-int v5, v5

    .line 646
    int-to-long v12, v6

    .line 647
    shl-long v12, v12, v22

    .line 648
    .line 649
    int-to-long v5, v5

    .line 650
    and-long v5, v5, v27

    .line 651
    .line 652
    or-long/2addr v5, v12

    .line 653
    invoke-static {v8, v9, v5, v6}, Ls31;->d(JJ)J

    .line 654
    .line 655
    .line 656
    move-result-wide v5

    .line 657
    new-instance v8, Lx78;

    .line 658
    .line 659
    iget-object v9, v11, Lx78;->b:Lbz4;

    .line 660
    .line 661
    invoke-direct {v8, v10, v9, v5, v6}, Lx78;-><init>(Lw78;Lbz4;J)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_15

    .line 665
    .line 666
    :cond_20
    invoke-static {v14, v6}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 667
    .line 668
    .line 669
    move-result-object v14

    .line 670
    new-instance v12, Ly5;

    .line 671
    .line 672
    move/from16 v18, v17

    .line 673
    .line 674
    move-object/from16 v17, v21

    .line 675
    .line 676
    invoke-direct/range {v12 .. v18}, Ly5;-><init>(Lql;Lo88;Ljava/util/List;Lfi1;Lfi2;Z)V

    .line 677
    .line 678
    .line 679
    move/from16 v17, v18

    .line 680
    .line 681
    invoke-static {v8, v9}, Lq31;->j(J)I

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    if-nez v17, :cond_21

    .line 686
    .line 687
    goto :goto_12

    .line 688
    :cond_21
    invoke-static {v8, v9}, Lq31;->d(J)Z

    .line 689
    .line 690
    .line 691
    move-result v11

    .line 692
    if-eqz v11, :cond_22

    .line 693
    .line 694
    invoke-static {v8, v9}, Lq31;->h(J)I

    .line 695
    .line 696
    .line 697
    move-result v24

    .line 698
    :cond_22
    :goto_12
    move/from16 v11, v24

    .line 699
    .line 700
    if-ne v6, v11, :cond_23

    .line 701
    .line 702
    goto :goto_13

    .line 703
    :cond_23
    invoke-virtual {v12}, Ly5;->l()F

    .line 704
    .line 705
    .line 706
    move-result v13

    .line 707
    float-to-double v13, v13

    .line 708
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 709
    .line 710
    .line 711
    move-result-wide v13

    .line 712
    double-to-float v13, v13

    .line 713
    float-to-int v13, v13

    .line 714
    invoke-static {v13, v6, v11}, Lx97;->n(III)I

    .line 715
    .line 716
    .line 717
    move-result v11

    .line 718
    :goto_13
    new-instance v16, Lbz4;

    .line 719
    .line 720
    invoke-static {v8, v9}, Lq31;->g(J)I

    .line 721
    .line 722
    .line 723
    move-result v6

    .line 724
    const/4 v13, 0x0

    .line 725
    invoke-static {v13, v11, v13, v6}, Lz68;->B(IIII)J

    .line 726
    .line 727
    .line 728
    move-result-wide v13

    .line 729
    move-object/from16 v17, v12

    .line 730
    .line 731
    move-wide/from16 v18, v13

    .line 732
    .line 733
    const/16 v21, 0x1

    .line 734
    .line 735
    invoke-direct/range {v16 .. v21}, Lbz4;-><init>(Ly5;JII)V

    .line 736
    .line 737
    .line 738
    move-object/from16 v6, v16

    .line 739
    .line 740
    new-instance v11, Lx78;

    .line 741
    .line 742
    iget v12, v6, Lbz4;->d:F

    .line 743
    .line 744
    float-to-double v12, v12

    .line 745
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 746
    .line 747
    .line 748
    move-result-wide v12

    .line 749
    double-to-float v12, v12

    .line 750
    float-to-int v12, v12

    .line 751
    iget v13, v6, Lbz4;->e:F

    .line 752
    .line 753
    float-to-double v13, v13

    .line 754
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 755
    .line 756
    .line 757
    move-result-wide v13

    .line 758
    double-to-float v13, v13

    .line 759
    float-to-int v13, v13

    .line 760
    int-to-long v14, v12

    .line 761
    shl-long v14, v14, v22

    .line 762
    .line 763
    int-to-long v12, v13

    .line 764
    and-long v12, v12, v27

    .line 765
    .line 766
    or-long/2addr v12, v14

    .line 767
    invoke-static {v8, v9, v12, v13}, Ls31;->d(JJ)J

    .line 768
    .line 769
    .line 770
    move-result-wide v8

    .line 771
    invoke-direct {v11, v10, v6, v8, v9}, Lx78;-><init>(Lw78;Lbz4;J)V

    .line 772
    .line 773
    .line 774
    if-eqz v5, :cond_24

    .line 775
    .line 776
    iget-object v6, v5, Lzv7;->X:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v6, Lej4;

    .line 779
    .line 780
    if-eqz v6, :cond_25

    .line 781
    .line 782
    new-instance v5, Loc0;

    .line 783
    .line 784
    invoke-direct {v5, v10}, Loc0;-><init>(Lw78;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v6, v5, v11}, Lej4;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    :cond_24
    :goto_14
    move-object v8, v11

    .line 791
    goto :goto_15

    .line 792
    :cond_25
    new-instance v6, Loc0;

    .line 793
    .line 794
    invoke-direct {v6, v10}, Loc0;-><init>(Lw78;)V

    .line 795
    .line 796
    .line 797
    iput-object v6, v5, Lzv7;->Y:Ljava/lang/Object;

    .line 798
    .line 799
    iput-object v11, v5, Lzv7;->Z:Ljava/lang/Object;

    .line 800
    .line 801
    goto :goto_14

    .line 802
    :goto_15
    invoke-virtual {v8, v7}, Lx78;->equals(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    if-nez v5, :cond_26

    .line 807
    .line 808
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 809
    .line 810
    .line 811
    move-result-object v5

    .line 812
    invoke-virtual {v5}, Ldd7;->f()Z

    .line 813
    .line 814
    .line 815
    move-result v6

    .line 816
    if-nez v6, :cond_26

    .line 817
    .line 818
    iget-object v6, v0, Lu58;->f0:Lr58;

    .line 819
    .line 820
    sget-object v7, Lkd7;->c:Ljava/lang/Object;

    .line 821
    .line 822
    monitor-enter v7

    .line 823
    :try_start_0
    invoke-static {v6, v0, v5}, Lkd7;->w(Lbi7;Lyh7;Ldd7;)Lbi7;

    .line 824
    .line 825
    .line 826
    move-result-object v6

    .line 827
    check-cast v6, Lr58;

    .line 828
    .line 829
    iput-object v3, v6, Lr58;->c:Ljava/lang/CharSequence;

    .line 830
    .line 831
    iput-object v4, v6, Lr58;->d:Ljava/util/List;

    .line 832
    .line 833
    iget-object v3, v3, Lh48;->g0:Lf88;

    .line 834
    .line 835
    iput-object v3, v6, Lr58;->e:Lf88;

    .line 836
    .line 837
    iget-boolean v3, v1, Lt58;->c:Z

    .line 838
    .line 839
    iput-boolean v3, v6, Lr58;->g:Z

    .line 840
    .line 841
    iget-boolean v3, v1, Lt58;->d:Z

    .line 842
    .line 843
    iput-boolean v3, v6, Lr58;->h:Z

    .line 844
    .line 845
    iget-object v1, v1, Lt58;->b:Lo88;

    .line 846
    .line 847
    iput-object v1, v6, Lr58;->f:Lo88;

    .line 848
    .line 849
    iget-object v1, v2, Ls58;->b:Lz24;

    .line 850
    .line 851
    iput-object v1, v6, Lr58;->k:Lz24;

    .line 852
    .line 853
    iget v1, v2, Ls58;->e:F

    .line 854
    .line 855
    iput v1, v6, Lr58;->i:F

    .line 856
    .line 857
    iget v1, v2, Ls58;->f:F

    .line 858
    .line 859
    iput v1, v6, Lr58;->j:F

    .line 860
    .line 861
    iget-wide v3, v2, Ls58;->d:J

    .line 862
    .line 863
    iput-wide v3, v6, Lr58;->m:J

    .line 864
    .line 865
    iget-object v1, v2, Ls58;->c:Lfi2;

    .line 866
    .line 867
    iput-object v1, v6, Lr58;->l:Lfi2;

    .line 868
    .line 869
    iput-object v8, v6, Lr58;->n:Lx78;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 870
    .line 871
    monitor-exit v7

    .line 872
    invoke-static {v5, v0}, Lkd7;->l(Ldd7;Lyh7;)V

    .line 873
    .line 874
    .line 875
    return-object v8

    .line 876
    :catchall_0
    move-exception v0

    .line 877
    monitor-exit v7

    .line 878
    throw v0

    .line 879
    :cond_26
    return-object v8
.end method

.method public final c()Lbi7;
    .locals 0

    .line 1
    iget-object p0, p0, Lu58;->f0:Lr58;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Lbi7;Lbi7;Lbi7;)Lbi7;
    .locals 0

    .line 1
    return-object p3
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lu58;->X:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lt58;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lu58;->Y:Lrh5;

    .line 13
    .line 14
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ls58;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p0, v0, v1}, Lu58;->a(Lt58;Ls58;)Lx78;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final y(Lbi7;)V
    .locals 0

    .line 1
    check-cast p1, Lr58;

    .line 2
    .line 3
    iput-object p1, p0, Lu58;->f0:Lr58;

    .line 4
    .line 5
    return-void
.end method

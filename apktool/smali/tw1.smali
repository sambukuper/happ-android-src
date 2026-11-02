.class public final Ltw1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lmb6;

.field public b:Llf;

.field public c:Lg60;

.field public d:J

.field public e:J

.field public f:J

.field public g:Lz24;

.field public h:F

.field public final i:Ls67;

.field public final j:Ldf;

.field public k:Lje;


# direct methods
.method public constructor <init>(Ls67;Lmb6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltw1;->a:Lmb6;

    .line 5
    .line 6
    sget p2, Ldw0;->h:I

    .line 7
    .line 8
    sget-wide v0, Ldw0;->g:J

    .line 9
    .line 10
    iput-wide v0, p0, Ltw1;->d:J

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Ltw1;->e:J

    .line 15
    .line 16
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Ltw1;->f:J

    .line 22
    .line 23
    sget-object p2, Lz24;->X:Lz24;

    .line 24
    .line 25
    iput-object p2, p0, Ltw1;->g:Lz24;

    .line 26
    .line 27
    const/high16 p2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p2, p0, Ltw1;->h:F

    .line 30
    .line 31
    iput-object p1, p0, Ltw1;->i:Ls67;

    .line 32
    .line 33
    invoke-static {}, Lu15;->c()Ldf;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Ltw1;->j:Ldf;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(Lsv1;Lg60;JJFI)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v4, p5

    .line 8
    .line 9
    iget-object v6, v0, Ltw1;->a:Lmb6;

    .line 10
    .line 11
    instance-of v7, v6, Lzd5;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const-wide/16 v9, 0x0

    .line 15
    .line 16
    if-eqz v7, :cond_0

    .line 17
    .line 18
    check-cast v6, Lzd5;

    .line 19
    .line 20
    iget-object v6, v6, Lzd5;->j0:Llf;

    .line 21
    .line 22
    iput-object v6, v0, Ltw1;->b:Llf;

    .line 23
    .line 24
    iput-wide v9, v0, Ltw1;->e:J

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v7, v6, Lbe5;

    .line 28
    .line 29
    if-eqz v7, :cond_2

    .line 30
    .line 31
    check-cast v6, Lbe5;

    .line 32
    .line 33
    iget-object v7, v6, Lbe5;->j0:Lem6;

    .line 34
    .line 35
    invoke-static {v7}, Lpu;->z(Lem6;)Z

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    if-eqz v11, :cond_1

    .line 40
    .line 41
    iput-object v8, v0, Ltw1;->b:Llf;

    .line 42
    .line 43
    iget-wide v6, v7, Lem6;->e:J

    .line 44
    .line 45
    iput-wide v6, v0, Ltw1;->e:J

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v6, v6, Lbe5;->k0:Llf;

    .line 49
    .line 50
    iput-object v6, v0, Ltw1;->b:Llf;

    .line 51
    .line 52
    iput-wide v9, v0, Ltw1;->e:J

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of v6, v6, Lae5;

    .line 56
    .line 57
    if-eqz v6, :cond_10

    .line 58
    .line 59
    iput-object v8, v0, Ltw1;->b:Llf;

    .line 60
    .line 61
    iput-wide v9, v0, Ltw1;->e:J

    .line 62
    .line 63
    :goto_0
    if-eqz p2, :cond_3

    .line 64
    .line 65
    move-object/from16 v5, p2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const-wide/16 v6, 0x10

    .line 69
    .line 70
    cmp-long v6, v4, v6

    .line 71
    .line 72
    if-eqz v6, :cond_6

    .line 73
    .line 74
    iget-object v6, v0, Ltw1;->c:Lg60;

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    iget-wide v9, v0, Ltw1;->d:J

    .line 79
    .line 80
    sget v7, Ldw0;->h:I

    .line 81
    .line 82
    invoke-static {v9, v10, v4, v5}, Ltk8;->a(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_5

    .line 87
    .line 88
    :cond_4
    new-instance v6, Lg60;

    .line 89
    .line 90
    const/4 v7, 0x5

    .line 91
    invoke-direct {v6, v4, v5, v7}, Lg60;-><init>(JI)V

    .line 92
    .line 93
    .line 94
    iput-wide v4, v0, Ltw1;->d:J

    .line 95
    .line 96
    iput-object v6, v0, Ltw1;->c:Lg60;

    .line 97
    .line 98
    :cond_5
    move-object v5, v6

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    move-object v5, v8

    .line 101
    :goto_1
    iget-wide v6, v0, Ltw1;->f:J

    .line 102
    .line 103
    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    cmp-long v4, v6, v9

    .line 109
    .line 110
    if-nez v4, :cond_7

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-static {v6, v7, v2, v3}, Lua7;->a(JJ)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_8

    .line 118
    .line 119
    iget-object v4, v0, Ltw1;->g:Lz24;

    .line 120
    .line 121
    invoke-interface {v1}, Lsv1;->getLayoutDirection()Lz24;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-ne v4, v6, :cond_8

    .line 126
    .line 127
    iget v4, v0, Ltw1;->h:F

    .line 128
    .line 129
    invoke-interface {v1}, Lfi1;->getDensity()F

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    cmpg-float v4, v4, v6

    .line 134
    .line 135
    if-nez v4, :cond_8

    .line 136
    .line 137
    const/16 p2, 0x20

    .line 138
    .line 139
    const-wide p5, 0xffffffffL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    goto/16 :goto_b

    .line 145
    .line 146
    :cond_8
    :goto_2
    iget-wide v6, v0, Ltw1;->e:J

    .line 147
    .line 148
    iget-object v4, v0, Ltw1;->b:Llf;

    .line 149
    .line 150
    iget-object v12, v0, Ltw1;->i:Ls67;

    .line 151
    .line 152
    iget v13, v12, Ls67;->a:F

    .line 153
    .line 154
    invoke-interface {v1, v13}, Lfi1;->h0(F)F

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    iget v12, v12, Ls67;->b:F

    .line 159
    .line 160
    invoke-interface {v1, v12}, Lfi1;->h0(F)F

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    const/4 v13, 0x1

    .line 165
    iget-object v8, v0, Ltw1;->j:Ldf;

    .line 166
    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    const/high16 v18, 0x40000000    # 2.0f

    .line 170
    .line 171
    if-eqz v4, :cond_d

    .line 172
    .line 173
    mul-float v6, v15, v18

    .line 174
    .line 175
    mul-float v7, v12, v18

    .line 176
    .line 177
    add-float/2addr v6, v7

    .line 178
    const/16 p2, 0x20

    .line 179
    .line 180
    const-wide p5, 0xffffffffL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    shr-long v9, v2, p2

    .line 186
    .line 187
    long-to-int v9, v9

    .line 188
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    add-float/2addr v9, v6

    .line 193
    and-long v10, v2, p5

    .line 194
    .line 195
    long-to-int v10, v10

    .line 196
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    add-float/2addr v10, v6

    .line 201
    move v11, v15

    .line 202
    float-to-double v14, v9

    .line 203
    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    .line 204
    .line 205
    .line 206
    move-result-wide v14

    .line 207
    double-to-float v6, v14

    .line 208
    float-to-int v6, v6

    .line 209
    float-to-double v9, v10

    .line 210
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 211
    .line 212
    .line 213
    move-result-wide v9

    .line 214
    double-to-float v9, v9

    .line 215
    float-to-int v9, v9

    .line 216
    invoke-static {v6, v9, v13}, Lmb6;->d(III)Lje;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-static {v6}, Lfb;->a(Lje;)Leb;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    cmpl-float v10, v12, v17

    .line 225
    .line 226
    if-lez v10, :cond_b

    .line 227
    .line 228
    add-float v15, v11, v12

    .line 229
    .line 230
    invoke-virtual {v9, v15, v15}, Leb;->n(FF)V

    .line 231
    .line 232
    .line 233
    cmpl-float v10, v11, v17

    .line 234
    .line 235
    if-lez v10, :cond_9

    .line 236
    .line 237
    new-instance v12, Landroid/graphics/BlurMaskFilter;

    .line 238
    .line 239
    sget-object v13, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 240
    .line 241
    invoke-direct {v12, v11, v13}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 242
    .line 243
    .line 244
    :goto_3
    const/16 v13, 0xb

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_9
    const/4 v12, 0x0

    .line 248
    goto :goto_3

    .line 249
    :goto_4
    invoke-static {v8, v12, v13}, Lpu;->p(Ldf;Landroid/graphics/BlurMaskFilter;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v4, v8}, Leb;->e(Llf;Ldf;)V

    .line 253
    .line 254
    .line 255
    if-lez v10, :cond_a

    .line 256
    .line 257
    new-instance v10, Landroid/graphics/BlurMaskFilter;

    .line 258
    .line 259
    sget-object v12, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 260
    .line 261
    invoke-direct {v10, v11, v12}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_a
    const/4 v10, 0x0

    .line 266
    :goto_5
    const/4 v11, 0x3

    .line 267
    invoke-static {v8, v10, v11}, Lpu;->p(Ldf;Landroid/graphics/BlurMaskFilter;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v8, v7}, Ldf;->l(F)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9, v4, v8}, Leb;->e(Llf;Ldf;)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_a

    .line 277
    .line 278
    :cond_b
    cmpl-float v7, v11, v17

    .line 279
    .line 280
    if-lez v7, :cond_c

    .line 281
    .line 282
    new-instance v7, Landroid/graphics/BlurMaskFilter;

    .line 283
    .line 284
    sget-object v10, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 285
    .line 286
    invoke-direct {v7, v11, v10}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 287
    .line 288
    .line 289
    :goto_6
    const/16 v13, 0xb

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_c
    const/4 v7, 0x0

    .line 293
    goto :goto_6

    .line 294
    :goto_7
    invoke-static {v8, v7, v13}, Lpu;->p(Ldf;Landroid/graphics/BlurMaskFilter;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, v11, v11}, Leb;->n(FF)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9, v4, v8}, Leb;->e(Llf;Ldf;)V

    .line 301
    .line 302
    .line 303
    goto :goto_a

    .line 304
    :cond_d
    move v11, v15

    .line 305
    const/16 p2, 0x20

    .line 306
    .line 307
    const-wide p5, 0xffffffffL

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    mul-float v15, v11, v18

    .line 313
    .line 314
    mul-float v12, v12, v18

    .line 315
    .line 316
    add-float/2addr v12, v15

    .line 317
    shr-long v9, v2, p2

    .line 318
    .line 319
    long-to-int v4, v9

    .line 320
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    add-float/2addr v4, v12

    .line 325
    and-long v9, v2, p5

    .line 326
    .line 327
    long-to-int v9, v9

    .line 328
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    add-float/2addr v9, v12

    .line 333
    float-to-double v14, v4

    .line 334
    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    .line 335
    .line 336
    .line 337
    move-result-wide v14

    .line 338
    double-to-float v10, v14

    .line 339
    float-to-int v10, v10

    .line 340
    float-to-double v14, v9

    .line 341
    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    .line 342
    .line 343
    .line 344
    move-result-wide v14

    .line 345
    double-to-float v12, v14

    .line 346
    float-to-int v12, v12

    .line 347
    invoke-static {v10, v12, v13}, Lmb6;->d(III)Lje;

    .line 348
    .line 349
    .line 350
    move-result-object v10

    .line 351
    invoke-static {v10}, Lfb;->a(Lje;)Leb;

    .line 352
    .line 353
    .line 354
    move-result-object v12

    .line 355
    sub-float/2addr v4, v11

    .line 356
    sub-float v18, v9, v11

    .line 357
    .line 358
    shr-long v13, v6, p2

    .line 359
    .line 360
    long-to-int v9, v13

    .line 361
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    and-long v6, v6, p5

    .line 366
    .line 367
    long-to-int v6, v6

    .line 368
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 369
    .line 370
    .line 371
    move-result v20

    .line 372
    cmpl-float v6, v11, v17

    .line 373
    .line 374
    if-lez v6, :cond_e

    .line 375
    .line 376
    new-instance v6, Landroid/graphics/BlurMaskFilter;

    .line 377
    .line 378
    sget-object v7, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 379
    .line 380
    invoke-direct {v6, v11, v7}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 381
    .line 382
    .line 383
    :goto_8
    const/16 v13, 0xb

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_e
    const/4 v6, 0x0

    .line 387
    goto :goto_8

    .line 388
    :goto_9
    invoke-static {v8, v6, v13}, Lpu;->p(Ldf;Landroid/graphics/BlurMaskFilter;I)V

    .line 389
    .line 390
    .line 391
    iget-object v14, v12, Leb;->a:Landroid/graphics/Canvas;

    .line 392
    .line 393
    iget-object v6, v8, Ldf;->a:Landroid/graphics/Paint;

    .line 394
    .line 395
    move/from16 v16, v11

    .line 396
    .line 397
    move/from16 v17, v4

    .line 398
    .line 399
    move-object/from16 v21, v6

    .line 400
    .line 401
    move/from16 v19, v9

    .line 402
    .line 403
    move v15, v11

    .line 404
    invoke-virtual/range {v14 .. v21}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 405
    .line 406
    .line 407
    move-object v6, v10

    .line 408
    :goto_a
    iput-object v6, v0, Ltw1;->k:Lje;

    .line 409
    .line 410
    iput-wide v2, v0, Ltw1;->f:J

    .line 411
    .line 412
    invoke-interface {v1}, Lsv1;->getLayoutDirection()Lz24;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    iput-object v2, v0, Ltw1;->g:Lz24;

    .line 417
    .line 418
    invoke-interface {v1}, Lfi1;->getDensity()F

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    iput v2, v0, Ltw1;->h:F

    .line 423
    .line 424
    :goto_b
    iget-object v2, v0, Ltw1;->k:Lje;

    .line 425
    .line 426
    if-eqz v2, :cond_f

    .line 427
    .line 428
    iget-object v0, v0, Ltw1;->i:Ls67;

    .line 429
    .line 430
    iget v3, v0, Ls67;->a:F

    .line 431
    .line 432
    invoke-interface {v1, v3}, Lfi1;->h0(F)F

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    iget v0, v0, Ls67;->b:F

    .line 437
    .line 438
    invoke-interface {v1, v0}, Lfi1;->h0(F)F

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    add-float/2addr v0, v3

    .line 443
    neg-float v0, v0

    .line 444
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    int-to-long v3, v3

    .line 449
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    int-to-long v6, v0

    .line 454
    shl-long v3, v3, p2

    .line 455
    .line 456
    and-long v6, v6, p5

    .line 457
    .line 458
    or-long/2addr v3, v6

    .line 459
    const/16 v7, 0x8

    .line 460
    .line 461
    move/from16 v6, p8

    .line 462
    .line 463
    move-object v0, v1

    .line 464
    move-object v1, v2

    .line 465
    move-wide v2, v3

    .line 466
    move/from16 v4, p7

    .line 467
    .line 468
    invoke-static/range {v0 .. v7}, Lsv1;->U(Lsv1;Lje;JFLg60;II)V

    .line 469
    .line 470
    .line 471
    :cond_f
    return-void

    .line 472
    :cond_10
    invoke-static {}, Lb61;->c()V

    .line 473
    .line 474
    .line 475
    return-void
.end method

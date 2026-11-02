.class public final Lkj5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:C

.field public final b:[F


# direct methods
.method public constructor <init>(C[F)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-char p1, p0, Lkj5;->a:C

    .line 20
    iput-object p2, p0, Lkj5;->b:[F

    return-void
.end method

.method public constructor <init>(Lkj5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-char v0, p1, Lkj5;->a:C

    .line 5
    .line 6
    iput-char v0, p0, Lkj5;->a:C

    .line 7
    .line 8
    iget-object p1, p1, Lkj5;->b:[F

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    invoke-static {p1, v0}, Lyn0;->z([FI)[F

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lkj5;->b:[F

    .line 16
    .line 17
    return-void
.end method

.method public static a(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 52

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p3

    .line 4
    .line 5
    move/from16 v0, p5

    .line 6
    .line 7
    move/from16 v2, p6

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    float-to-double v4, v7

    .line 12
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v8

    .line 20
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v10

    .line 24
    float-to-double v12, v1

    .line 25
    mul-double v14, v12, v8

    .line 26
    .line 27
    move/from16 v6, p2

    .line 28
    .line 29
    move-wide/from16 v16, v4

    .line 30
    .line 31
    float-to-double v4, v6

    .line 32
    mul-double v18, v4, v10

    .line 33
    .line 34
    add-double v18, v18, v14

    .line 35
    .line 36
    float-to-double v14, v0

    .line 37
    div-double v18, v18, v14

    .line 38
    .line 39
    neg-float v0, v1

    .line 40
    float-to-double v0, v0

    .line 41
    mul-double/2addr v0, v10

    .line 42
    mul-double v20, v4, v8

    .line 43
    .line 44
    add-double v20, v20, v0

    .line 45
    .line 46
    float-to-double v0, v2

    .line 47
    div-double v20, v20, v0

    .line 48
    .line 49
    move-wide/from16 v22, v0

    .line 50
    .line 51
    float-to-double v0, v3

    .line 52
    mul-double/2addr v0, v8

    .line 53
    move-wide/from16 v24, v0

    .line 54
    .line 55
    move/from16 v0, p4

    .line 56
    .line 57
    float-to-double v1, v0

    .line 58
    mul-double v26, v1, v10

    .line 59
    .line 60
    add-double v26, v26, v24

    .line 61
    .line 62
    div-double v26, v26, v14

    .line 63
    .line 64
    neg-float v0, v3

    .line 65
    move-wide/from16 v24, v1

    .line 66
    .line 67
    float-to-double v0, v0

    .line 68
    mul-double/2addr v0, v10

    .line 69
    mul-double v24, v24, v8

    .line 70
    .line 71
    add-double v24, v24, v0

    .line 72
    .line 73
    div-double v24, v24, v22

    .line 74
    .line 75
    sub-double v0, v18, v26

    .line 76
    .line 77
    sub-double v28, v20, v24

    .line 78
    .line 79
    add-double v30, v18, v26

    .line 80
    .line 81
    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    .line 82
    .line 83
    div-double v30, v30, v32

    .line 84
    .line 85
    add-double v34, v20, v24

    .line 86
    .line 87
    div-double v34, v34, v32

    .line 88
    .line 89
    mul-double v36, v0, v0

    .line 90
    .line 91
    mul-double v38, v28, v28

    .line 92
    .line 93
    add-double v38, v38, v36

    .line 94
    .line 95
    const-wide/16 v36, 0x0

    .line 96
    .line 97
    cmpl-double v2, v38, v36

    .line 98
    .line 99
    if-nez v2, :cond_0

    .line 100
    .line 101
    return-void

    .line 102
    :cond_0
    const-wide/high16 v40, 0x3ff0000000000000L    # 1.0

    .line 103
    .line 104
    div-double v42, v40, v38

    .line 105
    .line 106
    const-wide/high16 v44, 0x3fd0000000000000L    # 0.25

    .line 107
    .line 108
    sub-double v42, v42, v44

    .line 109
    .line 110
    cmpg-double v2, v42, v36

    .line 111
    .line 112
    if-gez v2, :cond_1

    .line 113
    .line 114
    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->sqrt(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    const-wide v4, 0x3ffffff583a53b8eL    # 1.99999

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    div-double/2addr v0, v4

    .line 124
    double-to-float v0, v0

    .line 125
    mul-float v5, p5, v0

    .line 126
    .line 127
    mul-float v0, v0, p6

    .line 128
    .line 129
    move/from16 v1, p1

    .line 130
    .line 131
    move/from16 v4, p4

    .line 132
    .line 133
    move/from16 v8, p8

    .line 134
    .line 135
    move/from16 v9, p9

    .line 136
    .line 137
    move v2, v6

    .line 138
    move v6, v0

    .line 139
    move-object/from16 v0, p0

    .line 140
    .line 141
    invoke-static/range {v0 .. v9}, Lkj5;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_1
    move/from16 v2, p9

    .line 146
    .line 147
    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->sqrt(D)D

    .line 148
    .line 149
    .line 150
    move-result-wide v6

    .line 151
    mul-double/2addr v0, v6

    .line 152
    mul-double v6, v6, v28

    .line 153
    .line 154
    move/from16 v3, p8

    .line 155
    .line 156
    if-ne v3, v2, :cond_2

    .line 157
    .line 158
    sub-double v30, v30, v6

    .line 159
    .line 160
    add-double v34, v34, v0

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_2
    add-double v30, v30, v6

    .line 164
    .line 165
    sub-double v34, v34, v0

    .line 166
    .line 167
    :goto_0
    sub-double v0, v20, v34

    .line 168
    .line 169
    sub-double v6, v18, v30

    .line 170
    .line 171
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    sub-double v6, v24, v34

    .line 176
    .line 177
    move-wide/from16 p1, v0

    .line 178
    .line 179
    sub-double v0, v26, v30

    .line 180
    .line 181
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 182
    .line 183
    .line 184
    move-result-wide v0

    .line 185
    sub-double v0, v0, p1

    .line 186
    .line 187
    cmpl-double v3, v0, v36

    .line 188
    .line 189
    if-ltz v3, :cond_3

    .line 190
    .line 191
    const/4 v7, 0x1

    .line 192
    goto :goto_1

    .line 193
    :cond_3
    const/4 v7, 0x0

    .line 194
    :goto_1
    if-eq v2, v7, :cond_5

    .line 195
    .line 196
    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    if-lez v3, :cond_4

    .line 202
    .line 203
    sub-double v0, v0, v18

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    add-double v0, v0, v18

    .line 207
    .line 208
    :cond_5
    :goto_2
    mul-double v30, v30, v14

    .line 209
    .line 210
    mul-double v34, v34, v22

    .line 211
    .line 212
    mul-double v2, v30, v8

    .line 213
    .line 214
    mul-double v18, v34, v10

    .line 215
    .line 216
    sub-double v2, v2, v18

    .line 217
    .line 218
    mul-double v30, v30, v10

    .line 219
    .line 220
    mul-double v34, v34, v8

    .line 221
    .line 222
    add-double v34, v34, v30

    .line 223
    .line 224
    const-wide/high16 v7, 0x4010000000000000L    # 4.0

    .line 225
    .line 226
    mul-double v9, v0, v7

    .line 227
    .line 228
    const-wide v18, 0x400921fb54442d18L    # Math.PI

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    div-double v9, v9, v18

    .line 234
    .line 235
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    .line 236
    .line 237
    .line 238
    move-result-wide v9

    .line 239
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 240
    .line 241
    .line 242
    move-result-wide v9

    .line 243
    double-to-int v9, v9

    .line 244
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    .line 245
    .line 246
    .line 247
    move-result-wide v10

    .line 248
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    .line 249
    .line 250
    .line 251
    move-result-wide v16

    .line 252
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    .line 253
    .line 254
    .line 255
    move-result-wide v18

    .line 256
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    .line 257
    .line 258
    .line 259
    move-result-wide v20

    .line 260
    move-wide/from16 p8, v7

    .line 261
    .line 262
    neg-double v6, v14

    .line 263
    mul-double v24, v6, v10

    .line 264
    .line 265
    mul-double v26, v24, v20

    .line 266
    .line 267
    mul-double v28, v22, v16

    .line 268
    .line 269
    mul-double v30, v28, v18

    .line 270
    .line 271
    sub-double v26, v26, v30

    .line 272
    .line 273
    mul-double v6, v6, v16

    .line 274
    .line 275
    mul-double v20, v20, v6

    .line 276
    .line 277
    mul-double v22, v22, v10

    .line 278
    .line 279
    mul-double v18, v18, v22

    .line 280
    .line 281
    add-double v18, v18, v20

    .line 282
    .line 283
    move-wide/from16 p4, v0

    .line 284
    .line 285
    int-to-double v0, v9

    .line 286
    div-double v0, p4, v0

    .line 287
    .line 288
    move-wide/from16 v20, v18

    .line 289
    .line 290
    const/4 v8, 0x0

    .line 291
    move-wide/from16 v18, v12

    .line 292
    .line 293
    move-wide v12, v4

    .line 294
    move-wide/from16 v4, p1

    .line 295
    .line 296
    :goto_3
    if-ge v8, v9, :cond_6

    .line 297
    .line 298
    add-double v30, v4, v0

    .line 299
    .line 300
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->sin(D)D

    .line 301
    .line 302
    .line 303
    move-result-wide v36

    .line 304
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->cos(D)D

    .line 305
    .line 306
    .line 307
    move-result-wide v38

    .line 308
    mul-double v42, v14, v10

    .line 309
    .line 310
    mul-double v42, v42, v38

    .line 311
    .line 312
    add-double v42, v42, v2

    .line 313
    .line 314
    mul-double v44, v28, v36

    .line 315
    .line 316
    move-wide/from16 v46, v0

    .line 317
    .line 318
    sub-double v0, v42, v44

    .line 319
    .line 320
    mul-double v42, v14, v16

    .line 321
    .line 322
    mul-double v42, v42, v38

    .line 323
    .line 324
    add-double v42, v42, v34

    .line 325
    .line 326
    mul-double v44, v22, v36

    .line 327
    .line 328
    move-wide/from16 v48, v2

    .line 329
    .line 330
    add-double v2, v44, v42

    .line 331
    .line 332
    mul-double v42, v24, v36

    .line 333
    .line 334
    mul-double v44, v28, v38

    .line 335
    .line 336
    sub-double v42, v42, v44

    .line 337
    .line 338
    mul-double v36, v36, v6

    .line 339
    .line 340
    mul-double v38, v38, v22

    .line 341
    .line 342
    add-double v36, v38, v36

    .line 343
    .line 344
    sub-double v4, v30, v4

    .line 345
    .line 346
    div-double v38, v4, v32

    .line 347
    .line 348
    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->tan(D)D

    .line 349
    .line 350
    .line 351
    move-result-wide v38

    .line 352
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 353
    .line 354
    .line 355
    move-result-wide v4

    .line 356
    const-wide/high16 v44, 0x4008000000000000L    # 3.0

    .line 357
    .line 358
    mul-double v50, v38, v44

    .line 359
    .line 360
    mul-double v50, v50, v38

    .line 361
    .line 362
    add-double v50, v50, p8

    .line 363
    .line 364
    invoke-static/range {v50 .. v51}, Ljava/lang/Math;->sqrt(D)D

    .line 365
    .line 366
    .line 367
    move-result-wide v38

    .line 368
    sub-double v38, v38, v40

    .line 369
    .line 370
    mul-double v38, v38, v4

    .line 371
    .line 372
    div-double v38, v38, v44

    .line 373
    .line 374
    mul-double v26, v26, v38

    .line 375
    .line 376
    add-double v4, v26, v18

    .line 377
    .line 378
    mul-double v20, v20, v38

    .line 379
    .line 380
    add-double v12, v20, v12

    .line 381
    .line 382
    mul-double v18, v38, v42

    .line 383
    .line 384
    move-wide/from16 v20, v6

    .line 385
    .line 386
    sub-double v6, v0, v18

    .line 387
    .line 388
    mul-double v38, v38, v36

    .line 389
    .line 390
    move/from16 v19, v8

    .line 391
    .line 392
    move/from16 v18, v9

    .line 393
    .line 394
    sub-double v8, v2, v38

    .line 395
    .line 396
    move-wide/from16 v26, v10

    .line 397
    .line 398
    const/4 v10, 0x0

    .line 399
    move-object/from16 v11, p0

    .line 400
    .line 401
    invoke-virtual {v11, v10, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 402
    .line 403
    .line 404
    double-to-float v4, v4

    .line 405
    double-to-float v5, v12

    .line 406
    double-to-float v6, v6

    .line 407
    double-to-float v7, v8

    .line 408
    double-to-float v8, v0

    .line 409
    double-to-float v9, v2

    .line 410
    move/from16 p2, v4

    .line 411
    .line 412
    move/from16 p3, v5

    .line 413
    .line 414
    move/from16 p4, v6

    .line 415
    .line 416
    move/from16 p5, v7

    .line 417
    .line 418
    move/from16 p6, v8

    .line 419
    .line 420
    move/from16 p7, v9

    .line 421
    .line 422
    move-object/from16 p1, v11

    .line 423
    .line 424
    invoke-virtual/range {p1 .. p7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 425
    .line 426
    .line 427
    add-int/lit8 v8, v19, 0x1

    .line 428
    .line 429
    move-wide v12, v2

    .line 430
    move/from16 v9, v18

    .line 431
    .line 432
    move-wide/from16 v6, v20

    .line 433
    .line 434
    move-wide/from16 v10, v26

    .line 435
    .line 436
    move-wide/from16 v4, v30

    .line 437
    .line 438
    move-wide/from16 v20, v36

    .line 439
    .line 440
    move-wide/from16 v26, v42

    .line 441
    .line 442
    move-wide/from16 v2, v48

    .line 443
    .line 444
    move-wide/from16 v18, v0

    .line 445
    .line 446
    move-wide/from16 v0, v46

    .line 447
    .line 448
    goto/16 :goto_3

    .line 449
    .line 450
    :cond_6
    return-void
.end method

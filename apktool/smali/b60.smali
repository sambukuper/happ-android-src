.class public final Lb60;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsd1;


# instance fields
.field public final a:Ld73;

.field public final b:Lpd5;

.field public final c:Lk17;

.field public final d:Le62;


# direct methods
.method public constructor <init>(Ld73;Lpd5;Lk17;Le62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb60;->a:Ld73;

    .line 5
    .line 6
    iput-object p2, p0, Lb60;->b:Lpd5;

    .line 7
    .line 8
    iput-object p3, p0, Lb60;->c:Lk17;

    .line 9
    .line 10
    iput-object p4, p0, Lb60;->d:Le62;

    .line 11
    .line 12
    return-void
.end method

.method public static final b(Lb60;)Lnd1;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lb60;->b:Lpd5;

    .line 9
    .line 10
    new-instance v3, Ly50;

    .line 11
    .line 12
    iget-object v4, v0, Lb60;->a:Ld73;

    .line 13
    .line 14
    invoke-interface {v4}, Ld73;->source()Lba0;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-direct {v3, v4}, Lck2;-><init>(Lje7;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lj76;

    .line 22
    .line 23
    invoke-direct {v4, v3}, Lj76;-><init>(Lje7;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 28
    .line 29
    invoke-virtual {v4}, Lj76;->peek()Lj76;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    new-instance v7, Lh90;

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    invoke-direct {v7, v6, v8}, Lh90;-><init>(Lba0;B)V

    .line 37
    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static {v7, v6, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    iget-object v7, v3, Ly50;->X:Ljava/lang/Exception;

    .line 44
    .line 45
    if-nez v7, :cond_29

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    iput-boolean v7, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 49
    .line 50
    sget-object v9, Lf62;->a:Landroid/graphics/Paint;

    .line 51
    .line 52
    iget-object v9, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, v0, Lb60;->d:Le62;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string v0, "image/jpeg"

    .line 60
    .line 61
    if-eqz v9, :cond_1

    .line 62
    .line 63
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_0

    .line 68
    .line 69
    const-string v10, "image/webp"

    .line 70
    .line 71
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-nez v10, :cond_0

    .line 76
    .line 77
    const-string v10, "image/heic"

    .line 78
    .line 79
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_0

    .line 84
    .line 85
    const-string v10, "image/heif"

    .line 86
    .line 87
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-eqz v9, :cond_1

    .line 92
    .line 93
    :cond_0
    move v9, v5

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    move v9, v7

    .line 96
    :goto_0
    const/16 v10, 0x10e

    .line 97
    .line 98
    const/16 v11, 0x5a

    .line 99
    .line 100
    if-eqz v9, :cond_3

    .line 101
    .line 102
    new-instance v9, Lc62;

    .line 103
    .line 104
    new-instance v12, Ld62;

    .line 105
    .line 106
    invoke-virtual {v4}, Lj76;->peek()Lj76;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    new-instance v14, Lh90;

    .line 111
    .line 112
    invoke-direct {v14, v13, v8}, Lh90;-><init>(Lba0;B)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v12, v14}, Ld62;-><init>(Ljava/io/InputStream;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v9, v12}, Lc62;-><init>(Ljava/io/InputStream;)V

    .line 119
    .line 120
    .line 121
    new-instance v12, Lv52;

    .line 122
    .line 123
    const-string v13, "Orientation"

    .line 124
    .line 125
    invoke-virtual {v9, v5, v13}, Lc62;->c(ILjava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    if-eq v14, v8, :cond_2

    .line 130
    .line 131
    const/4 v15, 0x7

    .line 132
    if-eq v14, v15, :cond_2

    .line 133
    .line 134
    const/4 v15, 0x4

    .line 135
    if-eq v14, v15, :cond_2

    .line 136
    .line 137
    const/4 v15, 0x5

    .line 138
    if-eq v14, v15, :cond_2

    .line 139
    .line 140
    move v14, v7

    .line 141
    goto :goto_1

    .line 142
    :cond_2
    move v14, v5

    .line 143
    :goto_1
    invoke-virtual {v9, v5, v13}, Lc62;->c(ILjava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    packed-switch v9, :pswitch_data_0

    .line 148
    .line 149
    .line 150
    move v9, v7

    .line 151
    goto :goto_2

    .line 152
    :pswitch_0
    move v9, v11

    .line 153
    goto :goto_2

    .line 154
    :pswitch_1
    move v9, v10

    .line 155
    goto :goto_2

    .line 156
    :pswitch_2
    const/16 v9, 0xb4

    .line 157
    .line 158
    :goto_2
    invoke-direct {v12, v9, v14}, Lv52;-><init>(IZ)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    sget-object v12, Lv52;->c:Lv52;

    .line 163
    .line 164
    :goto_3
    iget v9, v12, Lv52;->b:I

    .line 165
    .line 166
    iget-boolean v12, v12, Lv52;->a:Z

    .line 167
    .line 168
    iget-object v13, v3, Ly50;->X:Ljava/lang/Exception;

    .line 169
    .line 170
    if-nez v13, :cond_28

    .line 171
    .line 172
    iput-boolean v7, v1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 173
    .line 174
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 175
    .line 176
    const/16 v14, 0x1a

    .line 177
    .line 178
    if-lt v13, v14, :cond_4

    .line 179
    .line 180
    invoke-static {v2}, Lb73;->b(Lpd5;)Landroid/graphics/ColorSpace;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    if-eqz v15, :cond_4

    .line 185
    .line 186
    sget-object v15, Lb73;->c:Lf4;

    .line 187
    .line 188
    invoke-static {v2, v15}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    invoke-static {v15}, Lbt;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    iput-object v15, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 197
    .line 198
    :cond_4
    sget-object v15, Lb73;->d:Lf4;

    .line 199
    .line 200
    invoke-static {v2, v15}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    check-cast v15, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v15

    .line 210
    move-object/from16 v16, v6

    .line 211
    .line 212
    iget-object v6, v2, Lpd5;->a:Landroid/content/Context;

    .line 213
    .line 214
    iput-boolean v15, v1, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 215
    .line 216
    sget-object v15, Lb73;->b:Lf4;

    .line 217
    .line 218
    invoke-static {v2, v15}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    check-cast v15, Landroid/graphics/Bitmap$Config;

    .line 223
    .line 224
    if-nez v12, :cond_5

    .line 225
    .line 226
    if-lez v9, :cond_7

    .line 227
    .line 228
    :cond_5
    if-eqz v15, :cond_6

    .line 229
    .line 230
    invoke-static {v15}, Lue3;->z(Landroid/graphics/Bitmap$Config;)Z

    .line 231
    .line 232
    .line 233
    move-result v17

    .line 234
    if-eqz v17, :cond_7

    .line 235
    .line 236
    :cond_6
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 237
    .line 238
    :cond_7
    sget-object v8, Lb73;->h:Lf4;

    .line 239
    .line 240
    invoke-static {v2, v8}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    if-eqz v8, :cond_8

    .line 251
    .line 252
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 253
    .line 254
    if-ne v15, v8, :cond_8

    .line 255
    .line 256
    iget-object v8, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v8, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_8

    .line 263
    .line 264
    sget-object v15, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 265
    .line 266
    :cond_8
    if-lt v13, v14, :cond_9

    .line 267
    .line 268
    iget-object v0, v1, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    .line 269
    .line 270
    invoke-static {}, Lva;->b()Landroid/graphics/Bitmap$Config;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    if-ne v0, v8, :cond_9

    .line 275
    .line 276
    invoke-static {}, Lva;->e()Landroid/graphics/Bitmap$Config;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-eq v15, v0, :cond_9

    .line 281
    .line 282
    move-object v15, v8

    .line 283
    :cond_9
    iput-object v15, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 284
    .line 285
    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 286
    .line 287
    if-lez v0, :cond_1a

    .line 288
    .line 289
    iget v8, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 290
    .line 291
    if-gtz v8, :cond_a

    .line 292
    .line 293
    move v10, v5

    .line 294
    move-object/from16 v21, v6

    .line 295
    .line 296
    move/from16 v20, v12

    .line 297
    .line 298
    goto/16 :goto_b

    .line 299
    .line 300
    :cond_a
    if-eq v9, v11, :cond_c

    .line 301
    .line 302
    if-ne v9, v10, :cond_b

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_b
    move v13, v0

    .line 306
    goto :goto_5

    .line 307
    :cond_c
    :goto_4
    move v13, v8

    .line 308
    :goto_5
    if-eq v9, v11, :cond_e

    .line 309
    .line 310
    if-ne v9, v10, :cond_d

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_d
    move v0, v8

    .line 314
    :cond_e
    :goto_6
    iget-object v8, v2, Lpd5;->b:Lta7;

    .line 315
    .line 316
    iget-object v14, v2, Lpd5;->c:Lpw6;

    .line 317
    .line 318
    sget-object v15, Ly63;->b:Lf4;

    .line 319
    .line 320
    invoke-static {v2, v15}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v18

    .line 324
    move-object/from16 v10, v18

    .line 325
    .line 326
    check-cast v10, Lta7;

    .line 327
    .line 328
    invoke-static {v13, v0, v8, v14, v10}, Lw79;->l(IILta7;Lpw6;Lta7;)J

    .line 329
    .line 330
    .line 331
    move-result-wide v18

    .line 332
    const/16 v8, 0x20

    .line 333
    .line 334
    move/from16 v20, v12

    .line 335
    .line 336
    shr-long v11, v18, v8

    .line 337
    .line 338
    long-to-int v8, v11

    .line 339
    const-wide v11, 0xffffffffL

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    and-long v11, v18, v11

    .line 345
    .line 346
    long-to-int v11, v11

    .line 347
    div-int v12, v13, v8

    .line 348
    .line 349
    invoke-static {v12}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 350
    .line 351
    .line 352
    move-result v12

    .line 353
    div-int v18, v0, v11

    .line 354
    .line 355
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    if-eqz v7, :cond_10

    .line 364
    .line 365
    if-ne v7, v5, :cond_f

    .line 366
    .line 367
    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    goto :goto_7

    .line 372
    :cond_f
    invoke-static {}, Lb61;->c()V

    .line 373
    .line 374
    .line 375
    return-object v16

    .line 376
    :cond_10
    invoke-static {v12, v10}, Ljava/lang/Math;->min(II)I

    .line 377
    .line 378
    .line 379
    move-result v7

    .line 380
    :goto_7
    if-ge v7, v5, :cond_11

    .line 381
    .line 382
    move v7, v5

    .line 383
    :cond_11
    iput v7, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 384
    .line 385
    int-to-double v12, v13

    .line 386
    move-object/from16 v21, v6

    .line 387
    .line 388
    int-to-double v5, v7

    .line 389
    div-double/2addr v12, v5

    .line 390
    move v7, v11

    .line 391
    int-to-double v10, v0

    .line 392
    div-double v5, v10, v5

    .line 393
    .line 394
    int-to-double v10, v8

    .line 395
    int-to-double v7, v7

    .line 396
    invoke-static {v2, v15}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Lta7;

    .line 401
    .line 402
    div-double/2addr v10, v12

    .line 403
    div-double/2addr v7, v5

    .line 404
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    if-eqz v14, :cond_13

    .line 409
    .line 410
    const/4 v15, 0x1

    .line 411
    if-ne v14, v15, :cond_12

    .line 412
    .line 413
    move-wide v14, v10

    .line 414
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->min(DD)D

    .line 415
    .line 416
    .line 417
    move-result-wide v7

    .line 418
    goto :goto_8

    .line 419
    :cond_12
    invoke-static {}, Lb61;->c()V

    .line 420
    .line 421
    .line 422
    return-object v16

    .line 423
    :cond_13
    move-wide v14, v10

    .line 424
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->max(DD)D

    .line 425
    .line 426
    .line 427
    move-result-wide v7

    .line 428
    :goto_8
    iget-object v11, v0, Lta7;->a:Lyo1;

    .line 429
    .line 430
    instance-of v14, v11, Lwo1;

    .line 431
    .line 432
    if-eqz v14, :cond_14

    .line 433
    .line 434
    check-cast v11, Lwo1;

    .line 435
    .line 436
    iget v11, v11, Lwo1;->a:I

    .line 437
    .line 438
    int-to-double v14, v11

    .line 439
    div-double/2addr v14, v12

    .line 440
    cmpl-double v11, v7, v14

    .line 441
    .line 442
    if-lez v11, :cond_14

    .line 443
    .line 444
    move-wide v7, v14

    .line 445
    :cond_14
    iget-object v0, v0, Lta7;->b:Lyo1;

    .line 446
    .line 447
    instance-of v11, v0, Lwo1;

    .line 448
    .line 449
    if-eqz v11, :cond_15

    .line 450
    .line 451
    check-cast v0, Lwo1;

    .line 452
    .line 453
    iget v0, v0, Lwo1;->a:I

    .line 454
    .line 455
    int-to-double v11, v0

    .line 456
    div-double/2addr v11, v5

    .line 457
    cmpl-double v0, v7, v11

    .line 458
    .line 459
    if-lez v0, :cond_15

    .line 460
    .line 461
    move-wide v7, v11

    .line 462
    :cond_15
    iget-object v0, v2, Lpd5;->d:Ltr5;

    .line 463
    .line 464
    sget-object v2, Ltr5;->Y:Ltr5;

    .line 465
    .line 466
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 467
    .line 468
    if-ne v0, v2, :cond_16

    .line 469
    .line 470
    cmpl-double v0, v7, v5

    .line 471
    .line 472
    if-lez v0, :cond_16

    .line 473
    .line 474
    move-wide v7, v5

    .line 475
    :cond_16
    cmpg-double v0, v7, v5

    .line 476
    .line 477
    if-nez v0, :cond_17

    .line 478
    .line 479
    const/4 v0, 0x1

    .line 480
    goto :goto_9

    .line 481
    :cond_17
    const/4 v0, 0x0

    .line 482
    :goto_9
    xor-int/lit8 v2, v0, 0x1

    .line 483
    .line 484
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 485
    .line 486
    if-nez v0, :cond_18

    .line 487
    .line 488
    cmpl-double v0, v7, v5

    .line 489
    .line 490
    const v2, 0x7fffffff

    .line 491
    .line 492
    .line 493
    const-wide v5, 0x41dfffffffc00000L    # 2.147483647E9

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    if-lez v0, :cond_19

    .line 499
    .line 500
    div-double/2addr v5, v7

    .line 501
    invoke-static {v5, v6}, Lnr4;->N(D)I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    iput v0, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 506
    .line 507
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 508
    .line 509
    :cond_18
    :goto_a
    const/4 v0, 0x0

    .line 510
    goto :goto_c

    .line 511
    :cond_19
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 512
    .line 513
    mul-double/2addr v5, v7

    .line 514
    invoke-static {v5, v6}, Lnr4;->N(D)I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    iput v0, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_1a
    move-object/from16 v21, v6

    .line 522
    .line 523
    move/from16 v20, v12

    .line 524
    .line 525
    move v10, v5

    .line 526
    :goto_b
    iput v10, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 527
    .line 528
    const/4 v0, 0x0

    .line 529
    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 530
    .line 531
    :goto_c
    :try_start_0
    new-instance v2, Lh90;

    .line 532
    .line 533
    const/4 v5, 0x2

    .line 534
    invoke-direct {v2, v4, v5}, Lh90;-><init>(Lba0;B)V

    .line 535
    .line 536
    .line 537
    move-object/from16 v5, v16

    .line 538
    .line 539
    invoke-static {v2, v5, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 540
    .line 541
    .line 542
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 543
    invoke-virtual {v4}, Lj76;->close()V

    .line 544
    .line 545
    .line 546
    iget-object v3, v3, Ly50;->X:Ljava/lang/Exception;

    .line 547
    .line 548
    if-nez v3, :cond_27

    .line 549
    .line 550
    if-eqz v2, :cond_26

    .line 551
    .line 552
    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 561
    .line 562
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 563
    .line 564
    .line 565
    if-nez v20, :cond_1b

    .line 566
    .line 567
    if-lez v9, :cond_23

    .line 568
    .line 569
    :cond_1b
    new-instance v3, Landroid/graphics/Matrix;

    .line 570
    .line 571
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    int-to-float v4, v4

    .line 579
    const/high16 v5, 0x40000000    # 2.0f

    .line 580
    .line 581
    div-float/2addr v4, v5

    .line 582
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    int-to-float v6, v6

    .line 587
    div-float/2addr v6, v5

    .line 588
    if-eqz v20, :cond_1c

    .line 589
    .line 590
    const/high16 v5, -0x40800000    # -1.0f

    .line 591
    .line 592
    const/high16 v7, 0x3f800000    # 1.0f

    .line 593
    .line 594
    invoke-virtual {v3, v5, v7, v4, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 595
    .line 596
    .line 597
    :cond_1c
    if-lez v9, :cond_1d

    .line 598
    .line 599
    int-to-float v5, v9

    .line 600
    invoke-virtual {v3, v5, v4, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 601
    .line 602
    .line 603
    :cond_1d
    new-instance v4, Landroid/graphics/RectF;

    .line 604
    .line 605
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 606
    .line 607
    .line 608
    move-result v5

    .line 609
    int-to-float v5, v5

    .line 610
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 611
    .line 612
    .line 613
    move-result v6

    .line 614
    int-to-float v6, v6

    .line 615
    const/4 v7, 0x0

    .line 616
    invoke-direct {v4, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 620
    .line 621
    .line 622
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 623
    .line 624
    cmpg-float v6, v5, v7

    .line 625
    .line 626
    if-nez v6, :cond_1e

    .line 627
    .line 628
    iget v6, v4, Landroid/graphics/RectF;->top:F

    .line 629
    .line 630
    cmpg-float v6, v6, v7

    .line 631
    .line 632
    if-nez v6, :cond_1e

    .line 633
    .line 634
    :goto_d
    const/16 v4, 0x5a

    .line 635
    .line 636
    goto :goto_e

    .line 637
    :cond_1e
    neg-float v5, v5

    .line 638
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 639
    .line 640
    neg-float v4, v4

    .line 641
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 642
    .line 643
    .line 644
    goto :goto_d

    .line 645
    :goto_e
    if-eq v9, v4, :cond_21

    .line 646
    .line 647
    const/16 v4, 0x10e

    .line 648
    .line 649
    if-ne v9, v4, :cond_1f

    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_1f
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    if-nez v6, :cond_20

    .line 665
    .line 666
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 667
    .line 668
    :cond_20
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    goto :goto_10

    .line 673
    :cond_21
    :goto_f
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 674
    .line 675
    .line 676
    move-result v4

    .line 677
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 682
    .line 683
    .line 684
    move-result-object v6

    .line 685
    if-nez v6, :cond_22

    .line 686
    .line 687
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 688
    .line 689
    :cond_22
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    :goto_10
    new-instance v5, Landroid/graphics/Canvas;

    .line 694
    .line 695
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 696
    .line 697
    .line 698
    sget-object v6, Lf62;->a:Landroid/graphics/Paint;

    .line 699
    .line 700
    invoke-virtual {v5, v2, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 704
    .line 705
    .line 706
    move-object v2, v4

    .line 707
    :cond_23
    new-instance v3, Lnd1;

    .line 708
    .line 709
    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 714
    .line 715
    invoke-direct {v5, v4, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 716
    .line 717
    .line 718
    invoke-static {v5}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 723
    .line 724
    const/4 v10, 0x1

    .line 725
    if-gt v4, v10, :cond_25

    .line 726
    .line 727
    iget-boolean v1, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 728
    .line 729
    if-eqz v1, :cond_24

    .line 730
    .line 731
    goto :goto_11

    .line 732
    :cond_24
    move v5, v0

    .line 733
    goto :goto_12

    .line 734
    :cond_25
    :goto_11
    move v5, v10

    .line 735
    :goto_12
    invoke-direct {v3, v2, v5}, Lnd1;-><init>(Ld53;Z)V

    .line 736
    .line 737
    .line 738
    return-object v3

    .line 739
    :cond_26
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 740
    .line 741
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    const/16 v16, 0x0

    .line 745
    .line 746
    return-object v16

    .line 747
    :cond_27
    throw v3

    .line 748
    :catchall_0
    move-exception v0

    .line 749
    move-object v1, v0

    .line 750
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 751
    :catchall_1
    move-exception v0

    .line 752
    invoke-static {v4, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 753
    .line 754
    .line 755
    throw v0

    .line 756
    :cond_28
    throw v13

    .line 757
    :cond_29
    throw v7

    .line 758
    nop

    .line 759
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a(Lq51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La60;

    .line 7
    .line 8
    iget v1, v0, La60;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La60;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La60;

    .line 21
    .line 22
    check-cast p1, Ls51;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La60;-><init>(Lb60;Ls51;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La60;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, La60;->i0:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lc71;->X:Lc71;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, La60;->f0:Lk17;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_5

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_2
    iget-object v1, v0, La60;->f0:Lk17;

    .line 57
    .line 58
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p1, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lb60;->c:Lk17;

    .line 67
    .line 68
    iput-object p1, v0, La60;->f0:Lk17;

    .line 69
    .line 70
    iput v4, v0, La60;->i0:I

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lj17;->a(Ls51;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-ne v1, v5, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    :try_start_1
    new-instance v1, Lo7;

    .line 80
    .line 81
    const/16 v4, 0xc

    .line 82
    .line 83
    invoke-direct {v1, p0, v4}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    iput-object p1, v0, La60;->f0:Lk17;

    .line 87
    .line 88
    iput v3, v0, La60;->i0:I

    .line 89
    .line 90
    sget-object p0, Lb02;->X:Lb02;

    .line 91
    .line 92
    new-instance v3, Lpg3;

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-direct {v3, v1, v2, v4}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0, v3, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    if-ne p0, v5, :cond_5

    .line 103
    .line 104
    :goto_2
    return-object v5

    .line 105
    :cond_5
    move-object v6, p1

    .line 106
    move-object p1, p0

    .line 107
    move-object p0, v6

    .line 108
    :goto_3
    :try_start_2
    check-cast p1, Lnd1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    .line 110
    invoke-virtual {p0}, Lj17;->c()V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :goto_4
    move-object v6, p1

    .line 115
    move-object p1, p0

    .line 116
    move-object p0, v6

    .line 117
    goto :goto_5

    .line 118
    :catchall_1
    move-exception p0

    .line 119
    goto :goto_4

    .line 120
    :goto_5
    invoke-virtual {p0}, Lj17;->c()V

    .line 121
    .line 122
    .line 123
    throw p1
.end method

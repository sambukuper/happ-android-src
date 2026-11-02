.class public final Lio/sentry/android/replay/util/e;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:Lio/sentry/android/replay/util/f;

.field public final synthetic Z:Landroid/graphics/Bitmap;

.field public final synthetic f0:Landroid/graphics/Matrix;

.field public final synthetic g0:Ljava/util/ArrayList;

.field public final synthetic h0:Landroid/graphics/Canvas;


# direct methods
.method public constructor <init>(Lio/sentry/android/replay/util/f;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Ljava/util/ArrayList;Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/util/e;->Y:Lio/sentry/android/replay/util/f;

    .line 2
    .line 3
    iput-object p2, p0, Lio/sentry/android/replay/util/e;->Z:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lio/sentry/android/replay/util/e;->f0:Landroid/graphics/Matrix;

    .line 6
    .line 7
    iput-object p4, p0, Lio/sentry/android/replay/util/e;->g0:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object p5, p0, Lio/sentry/android/replay/util/e;->h0:Landroid/graphics/Canvas;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lio/sentry/android/replay/viewhierarchy/g;

    .line 6
    .line 7
    iget-object v2, v0, Lio/sentry/android/replay/util/e;->Y:Lio/sentry/android/replay/util/f;

    .line 8
    .line 9
    iget-object v3, v2, Lio/sentry/android/replay/util/f;->Z:Lg44;

    .line 10
    .line 11
    iget-object v4, v2, Lio/sentry/android/replay/util/f;->X:Lg44;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-boolean v5, v1, Lio/sentry/android/replay/viewhierarchy/g;->d:Z

    .line 17
    .line 18
    if-eqz v5, :cond_15

    .line 19
    .line 20
    iget v5, v1, Lio/sentry/android/replay/viewhierarchy/g;->a:I

    .line 21
    .line 22
    if-lez v5, :cond_15

    .line 23
    .line 24
    iget v5, v1, Lio/sentry/android/replay/viewhierarchy/g;->b:I

    .line 25
    .line 26
    if-lez v5, :cond_15

    .line 27
    .line 28
    iget-object v5, v1, Lio/sentry/android/replay/viewhierarchy/g;->f:Landroid/graphics/Rect;

    .line 29
    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    instance-of v6, v1, Lio/sentry/android/replay/viewhierarchy/d;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x1

    .line 40
    const/high16 v10, -0x1000000

    .line 41
    .line 42
    if-eqz v6, :cond_4

    .line 43
    .line 44
    invoke-static {v5}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    iget-object v1, v1, Lio/sentry/android/replay/viewhierarchy/g;->f:Landroid/graphics/Rect;

    .line 49
    .line 50
    iget-object v6, v0, Lio/sentry/android/replay/util/e;->Z:Landroid/graphics/Bitmap;

    .line 51
    .line 52
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-nez v11, :cond_3

    .line 57
    .line 58
    invoke-interface {v4}, Lg44;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    check-cast v11, Landroid/graphics/Bitmap;

    .line 63
    .line 64
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance v10, Landroid/graphics/Rect;

    .line 72
    .line 73
    invoke-direct {v10, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Landroid/graphics/RectF;

    .line 77
    .line 78
    invoke-direct {v1, v10}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 79
    .line 80
    .line 81
    iget-object v11, v0, Lio/sentry/android/replay/util/e;->f0:Landroid/graphics/Matrix;

    .line 82
    .line 83
    if-eqz v11, :cond_2

    .line 84
    .line 85
    invoke-virtual {v11, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v1, v10}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v2, Lio/sentry/android/replay/util/f;->Y:Lg44;

    .line 92
    .line 93
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Landroid/graphics/Canvas;

    .line 98
    .line 99
    new-instance v2, Landroid/graphics/Rect;

    .line 100
    .line 101
    invoke-direct {v2, v8, v8, v9, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v6, v10, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v4}, Lg44;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Landroid/graphics/Bitmap;

    .line 112
    .line 113
    invoke-virtual {v1, v8, v8}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    :cond_3
    :goto_0
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v2, Lqg5;

    .line 122
    .line 123
    invoke-direct {v2, v5, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_f

    .line 127
    .line 128
    :cond_4
    instance-of v2, v1, Lio/sentry/android/replay/viewhierarchy/f;

    .line 129
    .line 130
    if-eqz v2, :cond_13

    .line 131
    .line 132
    move-object v2, v1

    .line 133
    check-cast v2, Lio/sentry/android/replay/viewhierarchy/f;

    .line 134
    .line 135
    iget-object v4, v2, Lio/sentry/android/replay/viewhierarchy/f;->h:Lio/sentry/d;

    .line 136
    .line 137
    if-eqz v4, :cond_a

    .line 138
    .line 139
    iget-byte v5, v4, Lio/sentry/d;->X:B

    .line 140
    .line 141
    packed-switch v5, :pswitch_data_0

    .line 142
    .line 143
    .line 144
    goto/16 :goto_4

    .line 145
    .line 146
    :pswitch_0
    iget-object v5, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v5, Landroid/text/Layout;

    .line 149
    .line 150
    invoke-virtual {v5}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    instance-of v6, v6, Landroid/text/Spanned;

    .line 155
    .line 156
    if-nez v6, :cond_5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    invoke-virtual {v5}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    check-cast v6, Landroid/text/Spanned;

    .line 167
    .line 168
    invoke-virtual {v5}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    const-class v12, Landroid/text/style/ForegroundColorSpan;

    .line 177
    .line 178
    invoke-interface {v6, v8, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    check-cast v6, [Landroid/text/style/ForegroundColorSpan;

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    array-length v11, v6

    .line 188
    const/high16 v12, -0x80000000

    .line 189
    .line 190
    move-object v14, v7

    .line 191
    move v13, v8

    .line 192
    :goto_1
    if-ge v13, v11, :cond_8

    .line 193
    .line 194
    aget-object v15, v6, v13

    .line 195
    .line 196
    invoke-virtual {v5}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object v16

    .line 200
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-object/from16 v7, v16

    .line 204
    .line 205
    check-cast v7, Landroid/text/Spanned;

    .line 206
    .line 207
    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    invoke-virtual {v5}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 212
    .line 213
    .line 214
    move-result-object v16

    .line 215
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-object/from16 v8, v16

    .line 219
    .line 220
    check-cast v8, Landroid/text/Spanned;

    .line 221
    .line 222
    invoke-interface {v8, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    const/4 v9, -0x1

    .line 227
    if-eq v7, v9, :cond_7

    .line 228
    .line 229
    if-ne v8, v9, :cond_6

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_6
    sub-int/2addr v8, v7

    .line 233
    if-le v8, v12, :cond_7

    .line 234
    .line 235
    invoke-virtual {v15}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    move v12, v8

    .line 244
    :cond_7
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/4 v8, 0x0

    .line 248
    const/4 v9, 0x1

    .line 249
    goto :goto_1

    .line 250
    :cond_8
    if-eqz v14, :cond_9

    .line 251
    .line 252
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    or-int/2addr v5, v10

    .line 257
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    move-object v7, v5

    .line 262
    goto :goto_4

    .line 263
    :cond_9
    :goto_3
    const/4 v7, 0x0

    .line 264
    :goto_4
    if-eqz v7, :cond_a

    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    goto :goto_5

    .line 271
    :cond_a
    iget-object v5, v2, Lio/sentry/android/replay/viewhierarchy/f;->i:Ljava/lang/Integer;

    .line 272
    .line 273
    if-eqz v5, :cond_b

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    :cond_b
    :goto_5
    iget-object v1, v1, Lio/sentry/android/replay/viewhierarchy/g;->f:Landroid/graphics/Rect;

    .line 280
    .line 281
    iget v5, v2, Lio/sentry/android/replay/viewhierarchy/f;->j:I

    .line 282
    .line 283
    iget v2, v2, Lio/sentry/android/replay/viewhierarchy/f;->k:I

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    if-nez v4, :cond_c

    .line 289
    .line 290
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    goto/16 :goto_d

    .line 295
    .line 296
    :cond_c
    new-instance v6, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    iget-byte v7, v4, Lio/sentry/d;->X:B

    .line 302
    .line 303
    packed-switch v7, :pswitch_data_1

    .line 304
    .line 305
    .line 306
    iget-object v7, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v7, Lx78;

    .line 309
    .line 310
    iget-object v7, v7, Lx78;->b:Lbz4;

    .line 311
    .line 312
    iget v7, v7, Lbz4;->f:I

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :pswitch_1
    iget-object v7, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v7, Landroid/text/Layout;

    .line 318
    .line 319
    invoke-virtual {v7}, Landroid/text/Layout;->getLineCount()I

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    :goto_6
    const/4 v8, 0x0

    .line 324
    :goto_7
    if-ge v8, v7, :cond_12

    .line 325
    .line 326
    iget-byte v9, v4, Lio/sentry/d;->X:B

    .line 327
    .line 328
    const/4 v11, 0x0

    .line 329
    const/16 v12, 0x20

    .line 330
    .line 331
    packed-switch v9, :pswitch_data_2

    .line 332
    .line 333
    .line 334
    iget-object v9, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v9, Lx78;

    .line 337
    .line 338
    iget-object v13, v9, Lx78;->b:Lbz4;

    .line 339
    .line 340
    iget v13, v13, Lbz4;->d:F

    .line 341
    .line 342
    iget-wide v14, v9, Lx78;->c:J

    .line 343
    .line 344
    shr-long/2addr v14, v12

    .line 345
    long-to-int v14, v14

    .line 346
    int-to-float v14, v14

    .line 347
    cmpl-float v13, v13, v14

    .line 348
    .line 349
    if-lez v13, :cond_d

    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_d
    invoke-virtual {v9, v8}, Lx78;->f(I)F

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    goto :goto_8

    .line 357
    :pswitch_2
    iget-object v9, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v9, Landroid/text/Layout;

    .line 360
    .line 361
    invoke-virtual {v9}, Landroid/text/Layout;->getEllipsizedWidth()I

    .line 362
    .line 363
    .line 364
    move-result v13

    .line 365
    if-lez v13, :cond_e

    .line 366
    .line 367
    invoke-virtual {v9}, Landroid/text/Layout;->getEllipsizedWidth()I

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    invoke-virtual {v9}, Landroid/text/Layout;->getWidth()I

    .line 372
    .line 373
    .line 374
    move-result v14

    .line 375
    if-ge v13, v14, :cond_e

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_e
    invoke-virtual {v9, v8}, Landroid/text/Layout;->getLineLeft(I)F

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    :goto_8
    float-to-int v9, v11

    .line 383
    iget-byte v11, v4, Lio/sentry/d;->X:B

    .line 384
    .line 385
    packed-switch v11, :pswitch_data_3

    .line 386
    .line 387
    .line 388
    iget-object v11, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v11, Lx78;

    .line 391
    .line 392
    iget-object v13, v11, Lx78;->b:Lbz4;

    .line 393
    .line 394
    iget v14, v13, Lbz4;->d:F

    .line 395
    .line 396
    move/from16 p1, v12

    .line 397
    .line 398
    move-object v15, v13

    .line 399
    iget-wide v12, v11, Lx78;->c:J

    .line 400
    .line 401
    shr-long v12, v12, p1

    .line 402
    .line 403
    long-to-int v12, v12

    .line 404
    int-to-float v12, v12

    .line 405
    cmpl-float v12, v14, v12

    .line 406
    .line 407
    if-lez v12, :cond_f

    .line 408
    .line 409
    const/4 v12, 0x1

    .line 410
    goto :goto_9

    .line 411
    :cond_f
    const/4 v12, 0x0

    .line 412
    :goto_9
    if-eqz v12, :cond_10

    .line 413
    .line 414
    invoke-virtual {v15, v8}, Lbz4;->l(I)V

    .line 415
    .line 416
    .line 417
    iget-object v11, v15, Lbz4;->h:Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-static {v8, v11}, Loc;->q(ILjava/util/List;)I

    .line 420
    .line 421
    .line 422
    move-result v12

    .line 423
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    check-cast v11, Ltg5;

    .line 428
    .line 429
    iget-object v12, v11, Ltg5;->a:Lff;

    .line 430
    .line 431
    iget v11, v11, Ltg5;->d:I

    .line 432
    .line 433
    sub-int v11, v8, v11

    .line 434
    .line 435
    iget-object v12, v12, Lff;->d:Lv78;

    .line 436
    .line 437
    iget-object v12, v12, Lv78;->f:Landroid/text/Layout;

    .line 438
    .line 439
    invoke-virtual {v12, v11}, Landroid/text/Layout;->getLineWidth(I)F

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    goto :goto_a

    .line 444
    :cond_10
    invoke-virtual {v11, v8}, Lx78;->g(I)F

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    goto :goto_a

    .line 449
    :pswitch_3
    iget-object v11, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v11, Landroid/text/Layout;

    .line 452
    .line 453
    invoke-virtual {v11}, Landroid/text/Layout;->getEllipsizedWidth()I

    .line 454
    .line 455
    .line 456
    move-result v12

    .line 457
    if-lez v12, :cond_11

    .line 458
    .line 459
    invoke-virtual {v11}, Landroid/text/Layout;->getEllipsizedWidth()I

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    invoke-virtual {v11}, Landroid/text/Layout;->getWidth()I

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    if-ge v12, v13, :cond_11

    .line 468
    .line 469
    invoke-virtual {v11}, Landroid/text/Layout;->getEllipsizedWidth()I

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    int-to-float v11, v11

    .line 474
    goto :goto_a

    .line 475
    :cond_11
    invoke-virtual {v11, v8}, Landroid/text/Layout;->getLineRight(I)F

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    :goto_a
    float-to-int v11, v11

    .line 480
    iget-byte v12, v4, Lio/sentry/d;->X:B

    .line 481
    .line 482
    packed-switch v12, :pswitch_data_4

    .line 483
    .line 484
    .line 485
    iget-object v12, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v12, Lx78;

    .line 488
    .line 489
    iget-object v12, v12, Lx78;->b:Lbz4;

    .line 490
    .line 491
    invoke-virtual {v12, v8}, Lbz4;->e(I)F

    .line 492
    .line 493
    .line 494
    move-result v12

    .line 495
    invoke-static {v12}, Lnr4;->O(F)I

    .line 496
    .line 497
    .line 498
    move-result v12

    .line 499
    goto :goto_b

    .line 500
    :pswitch_4
    iget-object v12, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v12, Landroid/text/Layout;

    .line 503
    .line 504
    invoke-virtual {v12, v8}, Landroid/text/Layout;->getLineTop(I)I

    .line 505
    .line 506
    .line 507
    move-result v12

    .line 508
    :goto_b
    iget-byte v13, v4, Lio/sentry/d;->X:B

    .line 509
    .line 510
    packed-switch v13, :pswitch_data_5

    .line 511
    .line 512
    .line 513
    iget-object v13, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v13, Lx78;

    .line 516
    .line 517
    iget-object v13, v13, Lx78;->b:Lbz4;

    .line 518
    .line 519
    invoke-virtual {v13, v8}, Lbz4;->a(I)F

    .line 520
    .line 521
    .line 522
    move-result v13

    .line 523
    invoke-static {v13}, Lnr4;->O(F)I

    .line 524
    .line 525
    .line 526
    move-result v13

    .line 527
    goto :goto_c

    .line 528
    :pswitch_5
    iget-object v13, v4, Lio/sentry/d;->Y:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v13, Landroid/text/Layout;

    .line 531
    .line 532
    invoke-virtual {v13, v8}, Landroid/text/Layout;->getLineBottom(I)I

    .line 533
    .line 534
    .line 535
    move-result v13

    .line 536
    :goto_c
    new-instance v14, Landroid/graphics/Rect;

    .line 537
    .line 538
    invoke-direct {v14}, Landroid/graphics/Rect;-><init>()V

    .line 539
    .line 540
    .line 541
    iget v15, v1, Landroid/graphics/Rect;->left:I

    .line 542
    .line 543
    add-int/2addr v15, v5

    .line 544
    add-int/2addr v15, v9

    .line 545
    iput v15, v14, Landroid/graphics/Rect;->left:I

    .line 546
    .line 547
    iget v9, v1, Landroid/graphics/Rect;->left:I

    .line 548
    .line 549
    add-int/2addr v9, v5

    .line 550
    add-int/2addr v9, v11

    .line 551
    iput v9, v14, Landroid/graphics/Rect;->right:I

    .line 552
    .line 553
    iget v9, v1, Landroid/graphics/Rect;->top:I

    .line 554
    .line 555
    add-int/2addr v9, v2

    .line 556
    add-int/2addr v9, v12

    .line 557
    iput v9, v14, Landroid/graphics/Rect;->top:I

    .line 558
    .line 559
    sub-int/2addr v13, v12

    .line 560
    add-int/2addr v13, v9

    .line 561
    iput v13, v14, Landroid/graphics/Rect;->bottom:I

    .line 562
    .line 563
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    add-int/lit8 v8, v8, 0x1

    .line 567
    .line 568
    goto/16 :goto_7

    .line 569
    .line 570
    :cond_12
    move-object v1, v6

    .line 571
    :goto_d
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    new-instance v4, Lqg5;

    .line 576
    .line 577
    invoke-direct {v4, v1, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    :goto_e
    move-object v2, v4

    .line 581
    goto :goto_f

    .line 582
    :cond_13
    invoke-static {v5}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    new-instance v4, Lqg5;

    .line 591
    .line 592
    invoke-direct {v4, v1, v2}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    goto :goto_e

    .line 596
    :goto_f
    iget-object v1, v2, Lqg5;->X:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v1, Ljava/util/List;

    .line 599
    .line 600
    iget-object v2, v2, Lqg5;->Y:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v2, Ljava/lang/Number;

    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-interface {v3}, Lg44;->getValue()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    check-cast v4, Landroid/graphics/Paint;

    .line 613
    .line 614
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 615
    .line 616
    .line 617
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    if-eqz v4, :cond_14

    .line 626
    .line 627
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    check-cast v4, Landroid/graphics/Rect;

    .line 632
    .line 633
    new-instance v5, Landroid/graphics/RectF;

    .line 634
    .line 635
    invoke-direct {v5, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 636
    .line 637
    .line 638
    invoke-interface {v3}, Lg44;->getValue()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    check-cast v4, Landroid/graphics/Paint;

    .line 643
    .line 644
    iget-object v6, v0, Lio/sentry/android/replay/util/e;->h0:Landroid/graphics/Canvas;

    .line 645
    .line 646
    const/high16 v7, 0x41200000    # 10.0f

    .line 647
    .line 648
    invoke-virtual {v6, v5, v7, v7, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 649
    .line 650
    .line 651
    goto :goto_10

    .line 652
    :cond_14
    iget-object v0, v0, Lio/sentry/android/replay/util/e;->g0:Ljava/util/ArrayList;

    .line 653
    .line 654
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 655
    .line 656
    .line 657
    :cond_15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 658
    .line 659
    return-object v0

    .line 660
    nop

    .line 661
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch

    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    :pswitch_data_1
    .packed-switch 0x5
        :pswitch_1
    .end packed-switch

    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    :pswitch_data_2
    .packed-switch 0x5
        :pswitch_2
    .end packed-switch

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    :pswitch_data_3
    .packed-switch 0x5
        :pswitch_3
    .end packed-switch

    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_4
    .end packed-switch

    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    :pswitch_data_5
    .packed-switch 0x5
        :pswitch_5
    .end packed-switch
.end method

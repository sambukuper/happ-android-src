.class public final Landroidx/constraintlayout/widget/b;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Le30;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/widget/b;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/constraintlayout/widget/b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    return-void
.end method

.method public static a(III)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    const/high16 v0, -0x80000000

    .line 21
    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    if-nez p0, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne p2, p1, :cond_2

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return p0
.end method


# virtual methods
.method public final b(Lm31;Ld30;)V
    .locals 17

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
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_10

    .line 10
    .line 11
    :cond_0
    iget-object v3, v1, Lm31;->K:Lu21;

    .line 12
    .line 13
    iget-object v4, v1, Lm31;->I:Lu21;

    .line 14
    .line 15
    iget v5, v1, Lm31;->g0:I

    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    if-ne v5, v6, :cond_1

    .line 21
    .line 22
    iput v7, v2, Ld30;->e:I

    .line 23
    .line 24
    iput v7, v2, Ld30;->f:I

    .line 25
    .line 26
    iput v7, v2, Ld30;->g:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v5, v1, Lm31;->T:Ln31;

    .line 30
    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    goto/16 :goto_10

    .line 34
    .line 35
    :cond_2
    iget v5, v2, Ld30;->a:I

    .line 36
    .line 37
    iget v6, v2, Ld30;->b:I

    .line 38
    .line 39
    iget v8, v2, Ld30;->c:I

    .line 40
    .line 41
    iget v9, v2, Ld30;->d:I

    .line 42
    .line 43
    iget v10, v0, Landroidx/constraintlayout/widget/b;->b:I

    .line 44
    .line 45
    iget v11, v0, Landroidx/constraintlayout/widget/b;->c:I

    .line 46
    .line 47
    add-int/2addr v10, v11

    .line 48
    iget v11, v0, Landroidx/constraintlayout/widget/b;->d:I

    .line 49
    .line 50
    iget-object v12, v1, Lm31;->f0:Landroid/view/View;

    .line 51
    .line 52
    invoke-static {v5}, Lp61;->B(I)I

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    const/4 v14, 0x1

    .line 57
    const/4 v15, 0x3

    .line 58
    const/4 v7, 0x2

    .line 59
    if-eqz v13, :cond_d

    .line 60
    .line 61
    if-eq v13, v14, :cond_c

    .line 62
    .line 63
    if-eq v13, v7, :cond_6

    .line 64
    .line 65
    if-eq v13, v15, :cond_3

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    iget v8, v0, Landroidx/constraintlayout/widget/b;->f:I

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    iget v13, v4, Lu21;->g:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/4 v13, 0x0

    .line 77
    :goto_0
    if-eqz v3, :cond_5

    .line 78
    .line 79
    iget v15, v3, Lu21;->g:I

    .line 80
    .line 81
    add-int/2addr v13, v15

    .line 82
    :cond_5
    add-int/2addr v11, v13

    .line 83
    const/4 v13, -0x1

    .line 84
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    goto :goto_3

    .line 89
    :cond_6
    iget v8, v0, Landroidx/constraintlayout/widget/b;->f:I

    .line 90
    .line 91
    const/4 v13, -0x2

    .line 92
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    iget v11, v1, Lm31;->r:I

    .line 97
    .line 98
    if-ne v11, v14, :cond_7

    .line 99
    .line 100
    move v11, v14

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    const/4 v11, 0x0

    .line 103
    :goto_1
    iget v13, v2, Ld30;->j:I

    .line 104
    .line 105
    if-eq v13, v14, :cond_8

    .line 106
    .line 107
    if-ne v13, v7, :cond_e

    .line 108
    .line 109
    :cond_8
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    invoke-virtual {v1}, Lm31;->k()I

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-ne v13, v15, :cond_9

    .line 118
    .line 119
    move v13, v14

    .line 120
    goto :goto_2

    .line 121
    :cond_9
    const/4 v13, 0x0

    .line 122
    :goto_2
    iget v15, v2, Ld30;->j:I

    .line 123
    .line 124
    if-eq v15, v7, :cond_b

    .line 125
    .line 126
    if-eqz v11, :cond_b

    .line 127
    .line 128
    if-eqz v11, :cond_a

    .line 129
    .line 130
    if-nez v13, :cond_b

    .line 131
    .line 132
    :cond_a
    invoke-virtual {v1}, Lm31;->A()Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_e

    .line 137
    .line 138
    :cond_b
    invoke-virtual {v1}, Lm31;->q()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    const/high16 v13, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    goto :goto_3

    .line 149
    :cond_c
    const/high16 v13, 0x40000000    # 2.0f

    .line 150
    .line 151
    iget v8, v0, Landroidx/constraintlayout/widget/b;->f:I

    .line 152
    .line 153
    const/4 v15, -0x2

    .line 154
    invoke-static {v8, v11, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    goto :goto_3

    .line 159
    :cond_d
    const/high16 v13, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    :cond_e
    :goto_3
    invoke-static {v6}, Lp61;->B(I)I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_19

    .line 170
    .line 171
    if-eq v11, v14, :cond_18

    .line 172
    .line 173
    if-eq v11, v7, :cond_12

    .line 174
    .line 175
    const/4 v9, 0x3

    .line 176
    if-eq v11, v9, :cond_f

    .line 177
    .line 178
    const/4 v3, 0x0

    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :cond_f
    iget v9, v0, Landroidx/constraintlayout/widget/b;->g:I

    .line 182
    .line 183
    if-eqz v4, :cond_10

    .line 184
    .line 185
    iget-object v4, v1, Lm31;->J:Lu21;

    .line 186
    .line 187
    iget v4, v4, Lu21;->g:I

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_10
    const/4 v4, 0x0

    .line 191
    :goto_4
    if-eqz v3, :cond_11

    .line 192
    .line 193
    iget-object v3, v1, Lm31;->L:Lu21;

    .line 194
    .line 195
    iget v3, v3, Lu21;->g:I

    .line 196
    .line 197
    add-int/2addr v4, v3

    .line 198
    :cond_11
    add-int/2addr v10, v4

    .line 199
    const/4 v13, -0x1

    .line 200
    invoke-static {v9, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    goto :goto_7

    .line 205
    :cond_12
    iget v3, v0, Landroidx/constraintlayout/widget/b;->g:I

    .line 206
    .line 207
    const/4 v13, -0x2

    .line 208
    invoke-static {v3, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    iget v4, v1, Lm31;->s:I

    .line 213
    .line 214
    if-ne v4, v14, :cond_13

    .line 215
    .line 216
    move v4, v14

    .line 217
    goto :goto_5

    .line 218
    :cond_13
    const/4 v4, 0x0

    .line 219
    :goto_5
    iget v9, v2, Ld30;->j:I

    .line 220
    .line 221
    if-eq v9, v14, :cond_14

    .line 222
    .line 223
    if-ne v9, v7, :cond_1a

    .line 224
    .line 225
    :cond_14
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-virtual {v1}, Lm31;->q()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-ne v9, v10, :cond_15

    .line 234
    .line 235
    move v9, v14

    .line 236
    goto :goto_6

    .line 237
    :cond_15
    const/4 v9, 0x0

    .line 238
    :goto_6
    iget v10, v2, Ld30;->j:I

    .line 239
    .line 240
    if-eq v10, v7, :cond_17

    .line 241
    .line 242
    if-eqz v4, :cond_17

    .line 243
    .line 244
    if-eqz v4, :cond_16

    .line 245
    .line 246
    if-nez v9, :cond_17

    .line 247
    .line 248
    :cond_16
    invoke-virtual {v1}, Lm31;->B()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_1a

    .line 253
    .line 254
    :cond_17
    invoke-virtual {v1}, Lm31;->k()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    const/high16 v13, 0x40000000    # 2.0f

    .line 259
    .line 260
    invoke-static {v3, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    goto :goto_7

    .line 265
    :cond_18
    const/high16 v13, 0x40000000    # 2.0f

    .line 266
    .line 267
    iget v3, v0, Landroidx/constraintlayout/widget/b;->g:I

    .line 268
    .line 269
    const/4 v15, -0x2

    .line 270
    invoke-static {v3, v10, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    goto :goto_7

    .line 275
    :cond_19
    const/high16 v13, 0x40000000    # 2.0f

    .line 276
    .line 277
    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    :cond_1a
    :goto_7
    iget-object v4, v1, Lm31;->T:Ln31;

    .line 282
    .line 283
    iget-object v0, v0, Landroidx/constraintlayout/widget/b;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 284
    .line 285
    if-eqz v4, :cond_1b

    .line 286
    .line 287
    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n0:I

    .line 288
    .line 289
    const/16 v10, 0x100

    .line 290
    .line 291
    invoke-static {v9, v10}, Lkm4;->y(II)Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_1b

    .line 296
    .line 297
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    invoke-virtual {v1}, Lm31;->q()I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-ne v9, v10, :cond_1b

    .line 306
    .line 307
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    invoke-virtual {v4}, Lm31;->q()I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    if-ge v9, v10, :cond_1b

    .line 316
    .line 317
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    invoke-virtual {v1}, Lm31;->k()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    if-ne v9, v10, :cond_1b

    .line 326
    .line 327
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 328
    .line 329
    .line 330
    move-result v9

    .line 331
    invoke-virtual {v4}, Lm31;->k()I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    if-ge v9, v4, :cond_1b

    .line 336
    .line 337
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    iget v9, v1, Lm31;->a0:I

    .line 342
    .line 343
    if-ne v4, v9, :cond_1b

    .line 344
    .line 345
    invoke-virtual {v1}, Lm31;->z()Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    if-nez v4, :cond_1b

    .line 350
    .line 351
    iget v4, v1, Lm31;->G:I

    .line 352
    .line 353
    invoke-virtual {v1}, Lm31;->q()I

    .line 354
    .line 355
    .line 356
    move-result v9

    .line 357
    invoke-static {v4, v8, v9}, Landroidx/constraintlayout/widget/b;->a(III)Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-eqz v4, :cond_1b

    .line 362
    .line 363
    iget v4, v1, Lm31;->H:I

    .line 364
    .line 365
    invoke-virtual {v1}, Lm31;->k()I

    .line 366
    .line 367
    .line 368
    move-result v9

    .line 369
    invoke-static {v4, v3, v9}, Landroidx/constraintlayout/widget/b;->a(III)Z

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    if-eqz v4, :cond_1b

    .line 374
    .line 375
    invoke-virtual {v1}, Lm31;->q()I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    iput v0, v2, Ld30;->e:I

    .line 380
    .line 381
    invoke-virtual {v1}, Lm31;->k()I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    iput v0, v2, Ld30;->f:I

    .line 386
    .line 387
    iget v0, v1, Lm31;->a0:I

    .line 388
    .line 389
    iput v0, v2, Ld30;->g:I

    .line 390
    .line 391
    return-void

    .line 392
    :cond_1b
    const/4 v9, 0x3

    .line 393
    if-ne v5, v9, :cond_1c

    .line 394
    .line 395
    move v4, v14

    .line 396
    goto :goto_8

    .line 397
    :cond_1c
    const/4 v4, 0x0

    .line 398
    :goto_8
    if-ne v6, v9, :cond_1d

    .line 399
    .line 400
    move v9, v14

    .line 401
    goto :goto_9

    .line 402
    :cond_1d
    const/4 v9, 0x0

    .line 403
    :goto_9
    const/4 v10, 0x4

    .line 404
    if-eq v6, v10, :cond_1f

    .line 405
    .line 406
    if-ne v6, v14, :cond_1e

    .line 407
    .line 408
    goto :goto_a

    .line 409
    :cond_1e
    const/4 v6, 0x0

    .line 410
    goto :goto_b

    .line 411
    :cond_1f
    :goto_a
    move v6, v14

    .line 412
    :goto_b
    if-eq v5, v10, :cond_21

    .line 413
    .line 414
    if-ne v5, v14, :cond_20

    .line 415
    .line 416
    goto :goto_c

    .line 417
    :cond_20
    const/4 v5, 0x0

    .line 418
    goto :goto_d

    .line 419
    :cond_21
    :goto_c
    move v5, v14

    .line 420
    :goto_d
    const/4 v10, 0x0

    .line 421
    if-eqz v4, :cond_22

    .line 422
    .line 423
    iget v11, v1, Lm31;->W:F

    .line 424
    .line 425
    cmpl-float v11, v11, v10

    .line 426
    .line 427
    if-lez v11, :cond_22

    .line 428
    .line 429
    move v11, v14

    .line 430
    goto :goto_e

    .line 431
    :cond_22
    const/4 v11, 0x0

    .line 432
    :goto_e
    if-eqz v9, :cond_23

    .line 433
    .line 434
    iget v13, v1, Lm31;->W:F

    .line 435
    .line 436
    cmpl-float v10, v13, v10

    .line 437
    .line 438
    if-lez v10, :cond_23

    .line 439
    .line 440
    move v10, v14

    .line 441
    goto :goto_f

    .line 442
    :cond_23
    const/4 v10, 0x0

    .line 443
    :goto_f
    if-nez v12, :cond_24

    .line 444
    .line 445
    :goto_10
    return-void

    .line 446
    :cond_24
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 447
    .line 448
    .line 449
    move-result-object v13

    .line 450
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 451
    .line 452
    iget v15, v2, Ld30;->j:I

    .line 453
    .line 454
    if-eq v15, v14, :cond_26

    .line 455
    .line 456
    if-eq v15, v7, :cond_26

    .line 457
    .line 458
    if-eqz v4, :cond_26

    .line 459
    .line 460
    iget v4, v1, Lm31;->r:I

    .line 461
    .line 462
    if-nez v4, :cond_26

    .line 463
    .line 464
    if-eqz v9, :cond_26

    .line 465
    .line 466
    iget v4, v1, Lm31;->s:I

    .line 467
    .line 468
    if-eqz v4, :cond_25

    .line 469
    .line 470
    goto :goto_11

    .line 471
    :cond_25
    const/4 v0, -0x1

    .line 472
    const/4 v4, 0x0

    .line 473
    const/4 v5, 0x0

    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    goto/16 :goto_19

    .line 477
    .line 478
    :cond_26
    :goto_11
    instance-of v4, v12, Landroidx/constraintlayout/widget/VirtualLayout;

    .line 479
    .line 480
    if-eqz v4, :cond_27

    .line 481
    .line 482
    instance-of v4, v1, Lye2;

    .line 483
    .line 484
    if-eqz v4, :cond_27

    .line 485
    .line 486
    move-object v4, v1

    .line 487
    check-cast v4, Lye2;

    .line 488
    .line 489
    move-object v7, v12

    .line 490
    check-cast v7, Landroidx/constraintlayout/widget/VirtualLayout;

    .line 491
    .line 492
    invoke-virtual {v7, v4, v8, v3}, Landroidx/constraintlayout/widget/VirtualLayout;->j(Lye2;II)V

    .line 493
    .line 494
    .line 495
    goto :goto_12

    .line 496
    :cond_27
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 497
    .line 498
    .line 499
    :goto_12
    iput v8, v1, Lm31;->G:I

    .line 500
    .line 501
    iput v3, v1, Lm31;->H:I

    .line 502
    .line 503
    const/4 v4, 0x0

    .line 504
    iput-boolean v4, v1, Lm31;->g:Z

    .line 505
    .line 506
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 515
    .line 516
    .line 517
    move-result v9

    .line 518
    iget v15, v1, Lm31;->u:I

    .line 519
    .line 520
    if-lez v15, :cond_28

    .line 521
    .line 522
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 523
    .line 524
    .line 525
    move-result v15

    .line 526
    goto :goto_13

    .line 527
    :cond_28
    move v15, v4

    .line 528
    :goto_13
    iget v14, v1, Lm31;->v:I

    .line 529
    .line 530
    if-lez v14, :cond_29

    .line 531
    .line 532
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 533
    .line 534
    .line 535
    move-result v15

    .line 536
    :cond_29
    iget v14, v1, Lm31;->x:I

    .line 537
    .line 538
    if-lez v14, :cond_2a

    .line 539
    .line 540
    invoke-static {v14, v7}, Ljava/lang/Math;->max(II)I

    .line 541
    .line 542
    .line 543
    move-result v14

    .line 544
    :goto_14
    move/from16 v16, v3

    .line 545
    .line 546
    goto :goto_15

    .line 547
    :cond_2a
    move v14, v7

    .line 548
    goto :goto_14

    .line 549
    :goto_15
    iget v3, v1, Lm31;->y:I

    .line 550
    .line 551
    if-lez v3, :cond_2b

    .line 552
    .line 553
    invoke-static {v3, v14}, Ljava/lang/Math;->min(II)I

    .line 554
    .line 555
    .line 556
    move-result v14

    .line 557
    :cond_2b
    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n0:I

    .line 558
    .line 559
    const/4 v3, 0x1

    .line 560
    invoke-static {v0, v3}, Lkm4;->y(II)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-nez v0, :cond_2d

    .line 565
    .line 566
    const/high16 v0, 0x3f000000    # 0.5f

    .line 567
    .line 568
    if-eqz v11, :cond_2c

    .line 569
    .line 570
    if-eqz v6, :cond_2c

    .line 571
    .line 572
    iget v3, v1, Lm31;->W:F

    .line 573
    .line 574
    int-to-float v5, v14

    .line 575
    mul-float/2addr v5, v3

    .line 576
    add-float/2addr v5, v0

    .line 577
    float-to-int v0, v5

    .line 578
    move v15, v0

    .line 579
    goto :goto_16

    .line 580
    :cond_2c
    if-eqz v10, :cond_2d

    .line 581
    .line 582
    if-eqz v5, :cond_2d

    .line 583
    .line 584
    iget v3, v1, Lm31;->W:F

    .line 585
    .line 586
    int-to-float v5, v15

    .line 587
    div-float/2addr v5, v3

    .line 588
    add-float/2addr v5, v0

    .line 589
    float-to-int v0, v5

    .line 590
    move v14, v0

    .line 591
    :cond_2d
    :goto_16
    if-ne v4, v15, :cond_2f

    .line 592
    .line 593
    if-eq v7, v14, :cond_2e

    .line 594
    .line 595
    goto :goto_17

    .line 596
    :cond_2e
    move v5, v9

    .line 597
    const/4 v0, -0x1

    .line 598
    const/4 v4, 0x0

    .line 599
    goto :goto_19

    .line 600
    :cond_2f
    :goto_17
    const/high16 v0, 0x40000000    # 2.0f

    .line 601
    .line 602
    if-eq v4, v15, :cond_30

    .line 603
    .line 604
    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 605
    .line 606
    .line 607
    move-result v8

    .line 608
    :cond_30
    if-eq v7, v14, :cond_31

    .line 609
    .line 610
    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    goto :goto_18

    .line 615
    :cond_31
    move/from16 v3, v16

    .line 616
    .line 617
    :goto_18
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 618
    .line 619
    .line 620
    iput v8, v1, Lm31;->G:I

    .line 621
    .line 622
    iput v3, v1, Lm31;->H:I

    .line 623
    .line 624
    const/4 v4, 0x0

    .line 625
    iput-boolean v4, v1, Lm31;->g:Z

    .line 626
    .line 627
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    move v15, v0

    .line 640
    move v14, v3

    .line 641
    const/4 v0, -0x1

    .line 642
    :goto_19
    if-eq v5, v0, :cond_32

    .line 643
    .line 644
    const/4 v0, 0x1

    .line 645
    goto :goto_1a

    .line 646
    :cond_32
    move v0, v4

    .line 647
    :goto_1a
    iget v3, v2, Ld30;->c:I

    .line 648
    .line 649
    if-ne v15, v3, :cond_34

    .line 650
    .line 651
    iget v3, v2, Ld30;->d:I

    .line 652
    .line 653
    if-eq v14, v3, :cond_33

    .line 654
    .line 655
    goto :goto_1b

    .line 656
    :cond_33
    move v7, v4

    .line 657
    goto :goto_1c

    .line 658
    :cond_34
    :goto_1b
    const/4 v7, 0x1

    .line 659
    :goto_1c
    iput-boolean v7, v2, Ld30;->i:Z

    .line 660
    .line 661
    iget-boolean v3, v13, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->c0:Z

    .line 662
    .line 663
    if-eqz v3, :cond_35

    .line 664
    .line 665
    const/4 v3, 0x1

    .line 666
    goto :goto_1d

    .line 667
    :cond_35
    move v3, v0

    .line 668
    :goto_1d
    if-eqz v3, :cond_36

    .line 669
    .line 670
    const/4 v13, -0x1

    .line 671
    if-eq v5, v13, :cond_36

    .line 672
    .line 673
    iget v0, v1, Lm31;->a0:I

    .line 674
    .line 675
    if-eq v0, v5, :cond_36

    .line 676
    .line 677
    const/4 v0, 0x1

    .line 678
    iput-boolean v0, v2, Ld30;->i:Z

    .line 679
    .line 680
    :cond_36
    iput v15, v2, Ld30;->e:I

    .line 681
    .line 682
    iput v14, v2, Ld30;->f:I

    .line 683
    .line 684
    iput-boolean v3, v2, Ld30;->h:Z

    .line 685
    .line 686
    iput v5, v2, Ld30;->g:I

    .line 687
    .line 688
    return-void
.end method

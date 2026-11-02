.class public final synthetic Lb68;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lea6;

.field public final synthetic Y:Ld68;

.field public final synthetic Z:I

.field public final synthetic f0:I

.field public final synthetic g0:Lzr4;

.field public final synthetic h0:I

.field public final synthetic i0:I

.field public final synthetic j0:Leo5;

.field public final synthetic k0:Leo5;

.field public final synthetic l0:Leo5;

.field public final synthetic m0:Leo5;

.field public final synthetic n0:Leo5;

.field public final synthetic o0:Leo5;

.field public final synthetic p0:Leo5;

.field public final synthetic q0:Leo5;

.field public final synthetic r0:F


# direct methods
.method public synthetic constructor <init>(Lea6;Ld68;IILzr4;IILeo5;Leo5;Leo5;Leo5;Leo5;Leo5;Leo5;Leo5;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb68;->X:Lea6;

    .line 5
    .line 6
    iput-object p2, p0, Lb68;->Y:Ld68;

    .line 7
    .line 8
    iput p3, p0, Lb68;->Z:I

    .line 9
    .line 10
    iput p4, p0, Lb68;->f0:I

    .line 11
    .line 12
    iput-object p5, p0, Lb68;->g0:Lzr4;

    .line 13
    .line 14
    iput p6, p0, Lb68;->h0:I

    .line 15
    .line 16
    iput p7, p0, Lb68;->i0:I

    .line 17
    .line 18
    iput-object p8, p0, Lb68;->j0:Leo5;

    .line 19
    .line 20
    iput-object p9, p0, Lb68;->k0:Leo5;

    .line 21
    .line 22
    iput-object p10, p0, Lb68;->l0:Leo5;

    .line 23
    .line 24
    iput-object p11, p0, Lb68;->m0:Leo5;

    .line 25
    .line 26
    iput-object p12, p0, Lb68;->n0:Leo5;

    .line 27
    .line 28
    iput-object p13, p0, Lb68;->o0:Leo5;

    .line 29
    .line 30
    iput-object p14, p0, Lb68;->p0:Leo5;

    .line 31
    .line 32
    iput-object p15, p0, Lb68;->q0:Leo5;

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput p1, p0, Lb68;->r0:F

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ldo5;

    .line 6
    .line 7
    iget-object v2, v0, Lb68;->X:Lea6;

    .line 8
    .line 9
    iget-object v3, v2, Lea6;->X:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, v0, Lb68;->Y:Ld68;

    .line 12
    .line 13
    iget-object v5, v0, Lb68;->g0:Lzr4;

    .line 14
    .line 15
    iget v6, v0, Lb68;->h0:I

    .line 16
    .line 17
    iget v7, v0, Lb68;->i0:I

    .line 18
    .line 19
    iget-object v8, v0, Lb68;->j0:Leo5;

    .line 20
    .line 21
    iget-object v9, v0, Lb68;->k0:Leo5;

    .line 22
    .line 23
    iget-object v10, v0, Lb68;->l0:Leo5;

    .line 24
    .line 25
    iget-object v11, v0, Lb68;->m0:Leo5;

    .line 26
    .line 27
    iget-object v12, v0, Lb68;->n0:Leo5;

    .line 28
    .line 29
    iget-object v13, v0, Lb68;->o0:Leo5;

    .line 30
    .line 31
    iget-object v14, v0, Lb68;->p0:Leo5;

    .line 32
    .line 33
    iget-object v15, v0, Lb68;->q0:Leo5;

    .line 34
    .line 35
    const/high16 v16, 0x40000000    # 2.0f

    .line 36
    .line 37
    const/high16 v17, 0x3f800000    # 1.0f

    .line 38
    .line 39
    move-object/from16 p1, v3

    .line 40
    .line 41
    if-eqz p1, :cond_14

    .line 42
    .line 43
    iget-boolean v3, v4, Ld68;->a:Z

    .line 44
    .line 45
    move/from16 v18, v3

    .line 46
    .line 47
    iget v3, v0, Lb68;->f0:I

    .line 48
    .line 49
    if-eqz v18, :cond_0

    .line 50
    .line 51
    move/from16 v18, v6

    .line 52
    .line 53
    move-object/from16 v6, p1

    .line 54
    .line 55
    check-cast v6, Leo5;

    .line 56
    .line 57
    iget v6, v6, Leo5;->Y:I

    .line 58
    .line 59
    move/from16 p1, v6

    .line 60
    .line 61
    iget v6, v0, Lb68;->Z:I

    .line 62
    .line 63
    sub-int v6, v6, p1

    .line 64
    .line 65
    int-to-float v6, v6

    .line 66
    div-float v6, v6, v16

    .line 67
    .line 68
    mul-float v6, v6, v17

    .line 69
    .line 70
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move/from16 v18, v6

    .line 76
    .line 77
    iget v6, v4, Ld68;->e:F

    .line 78
    .line 79
    invoke-interface {v5, v6}, Lfi1;->x0(F)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    add-int/2addr v6, v3

    .line 84
    :goto_0
    iget-object v2, v2, Lea6;->X:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Leo5;

    .line 87
    .line 88
    move-object/from16 p1, v5

    .line 89
    .line 90
    iget v5, v2, Leo5;->Y:I

    .line 91
    .line 92
    add-int/2addr v5, v3

    .line 93
    move/from16 v19, v7

    .line 94
    .line 95
    invoke-interface/range {p1 .. p1}, Lug3;->getLayoutDirection()Lz24;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    iget-object v4, v4, Ld68;->b:Lq58;

    .line 100
    .line 101
    move-object/from16 v20, v13

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    invoke-static {v1, v14, v13, v13}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 105
    .line 106
    .line 107
    if-eqz v15, :cond_1

    .line 108
    .line 109
    iget v13, v15, Leo5;->Y:I

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    const/4 v13, 0x0

    .line 113
    :goto_1
    sub-int v13, v19, v13

    .line 114
    .line 115
    if-eqz v10, :cond_2

    .line 116
    .line 117
    iget v14, v10, Leo5;->Y:I

    .line 118
    .line 119
    sub-int v14, v13, v14

    .line 120
    .line 121
    int-to-float v14, v14

    .line 122
    div-float v14, v14, v16

    .line 123
    .line 124
    mul-float v14, v14, v17

    .line 125
    .line 126
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    move/from16 p1, v13

    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    invoke-static {v1, v10, v13, v14}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_2
    move/from16 p1, v13

    .line 138
    .line 139
    :goto_2
    iget v0, v0, Lb68;->r0:F

    .line 140
    .line 141
    invoke-static {v6, v0, v3}, Lw51;->I(IFI)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    sget-object v6, Lz24;->X:Lz24;

    .line 146
    .line 147
    if-ne v7, v6, :cond_4

    .line 148
    .line 149
    if-eqz v10, :cond_3

    .line 150
    .line 151
    iget v13, v10, Leo5;->X:I

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_3
    const/4 v13, 0x0

    .line 155
    goto :goto_3

    .line 156
    :cond_4
    if-eqz v11, :cond_3

    .line 157
    .line 158
    iget v13, v11, Leo5;->X:I

    .line 159
    .line 160
    :goto_3
    instance-of v14, v4, Lq58;

    .line 161
    .line 162
    if-eqz v14, :cond_13

    .line 163
    .line 164
    iget v14, v2, Leo5;->X:I

    .line 165
    .line 166
    move/from16 p0, v13

    .line 167
    .line 168
    if-eqz v10, :cond_5

    .line 169
    .line 170
    iget v13, v10, Leo5;->X:I

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_5
    const/4 v13, 0x0

    .line 174
    :goto_4
    sub-int v13, v18, v13

    .line 175
    .line 176
    move/from16 v19, v13

    .line 177
    .line 178
    if-eqz v11, :cond_6

    .line 179
    .line 180
    iget v13, v11, Leo5;->X:I

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_6
    const/4 v13, 0x0

    .line 184
    :goto_5
    sub-int v13, v19, v13

    .line 185
    .line 186
    sub-int/2addr v13, v14

    .line 187
    int-to-float v13, v13

    .line 188
    div-float v13, v13, v16

    .line 189
    .line 190
    const/high16 v14, -0x40800000    # -1.0f

    .line 191
    .line 192
    if-ne v7, v6, :cond_7

    .line 193
    .line 194
    move/from16 v19, v14

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_7
    mul-float v19, v14, v14

    .line 198
    .line 199
    :goto_6
    add-float v19, v17, v19

    .line 200
    .line 201
    mul-float v19, v19, v13

    .line 202
    .line 203
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->round(F)I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    add-int v13, v13, p0

    .line 208
    .line 209
    invoke-static {v4}, Lpn7;->i(Lq58;)Lp8;

    .line 210
    .line 211
    .line 212
    iget v4, v2, Leo5;->X:I

    .line 213
    .line 214
    move/from16 v19, v14

    .line 215
    .line 216
    if-eqz v10, :cond_8

    .line 217
    .line 218
    iget v14, v10, Leo5;->X:I

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_8
    const/4 v14, 0x0

    .line 222
    :goto_7
    sub-int v14, v18, v14

    .line 223
    .line 224
    move/from16 v21, v4

    .line 225
    .line 226
    if-eqz v11, :cond_9

    .line 227
    .line 228
    iget v4, v11, Leo5;->X:I

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_9
    const/4 v4, 0x0

    .line 232
    :goto_8
    sub-int/2addr v14, v4

    .line 233
    sub-int v14, v14, v21

    .line 234
    .line 235
    int-to-float v4, v14

    .line 236
    div-float v4, v4, v16

    .line 237
    .line 238
    if-ne v7, v6, :cond_a

    .line 239
    .line 240
    move/from16 v14, v19

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_a
    mul-float v14, v19, v19

    .line 244
    .line 245
    :goto_9
    add-float v14, v17, v14

    .line 246
    .line 247
    mul-float/2addr v14, v4

    .line 248
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    add-int v4, v4, p0

    .line 253
    .line 254
    invoke-static {v13, v0, v4}, Lw51;->I(IFI)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-static {v1, v2, v0, v3}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 259
    .line 260
    .line 261
    if-eqz v12, :cond_c

    .line 262
    .line 263
    if-eqz v10, :cond_b

    .line 264
    .line 265
    iget v0, v10, Leo5;->X:I

    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_b
    const/4 v0, 0x0

    .line 269
    :goto_a
    invoke-static {v1, v12, v0, v5}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 270
    .line 271
    .line 272
    :cond_c
    if-eqz v10, :cond_d

    .line 273
    .line 274
    iget v0, v10, Leo5;->X:I

    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_d
    const/4 v0, 0x0

    .line 278
    :goto_b
    if-eqz v12, :cond_e

    .line 279
    .line 280
    iget v2, v12, Leo5;->X:I

    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_e
    const/4 v2, 0x0

    .line 284
    :goto_c
    add-int/2addr v0, v2

    .line 285
    invoke-static {v1, v8, v0, v5}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 286
    .line 287
    .line 288
    if-eqz v9, :cond_f

    .line 289
    .line 290
    invoke-static {v1, v9, v0, v5}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 291
    .line 292
    .line 293
    :cond_f
    if-eqz v20, :cond_11

    .line 294
    .line 295
    if-eqz v11, :cond_10

    .line 296
    .line 297
    iget v0, v11, Leo5;->X:I

    .line 298
    .line 299
    goto :goto_d

    .line 300
    :cond_10
    const/4 v0, 0x0

    .line 301
    :goto_d
    sub-int v6, v18, v0

    .line 302
    .line 303
    move-object/from16 v0, v20

    .line 304
    .line 305
    iget v2, v0, Leo5;->X:I

    .line 306
    .line 307
    sub-int/2addr v6, v2

    .line 308
    invoke-static {v1, v0, v6, v5}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 309
    .line 310
    .line 311
    :cond_11
    if-eqz v11, :cond_12

    .line 312
    .line 313
    iget v0, v11, Leo5;->X:I

    .line 314
    .line 315
    sub-int v6, v18, v0

    .line 316
    .line 317
    iget v0, v11, Leo5;->Y:I

    .line 318
    .line 319
    sub-int v13, p1, v0

    .line 320
    .line 321
    int-to-float v0, v13

    .line 322
    div-float v0, v0, v16

    .line 323
    .line 324
    mul-float v0, v0, v17

    .line 325
    .line 326
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-static {v1, v11, v6, v0}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 331
    .line 332
    .line 333
    :cond_12
    if-eqz v15, :cond_1f

    .line 334
    .line 335
    move/from16 v7, p1

    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    invoke-static {v1, v15, v13, v7}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_13

    .line 342
    .line 343
    :cond_13
    const-string v0, "Unknown position: "

    .line 344
    .line 345
    invoke-static {v4, v0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const/4 v0, 0x0

    .line 349
    return-object v0

    .line 350
    :cond_14
    move-object/from16 p1, v5

    .line 351
    .line 352
    move/from16 v18, v6

    .line 353
    .line 354
    move/from16 v19, v7

    .line 355
    .line 356
    move-object v0, v13

    .line 357
    invoke-interface/range {p1 .. p1}, Lfi1;->getDensity()F

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    const-wide/16 v5, 0x0

    .line 362
    .line 363
    invoke-static {v1, v14, v5, v6}, Ldo5;->g(Ldo5;Leo5;J)V

    .line 364
    .line 365
    .line 366
    if-eqz v15, :cond_15

    .line 367
    .line 368
    iget v3, v15, Leo5;->Y:I

    .line 369
    .line 370
    goto :goto_e

    .line 371
    :cond_15
    const/4 v3, 0x0

    .line 372
    :goto_e
    sub-int v7, v19, v3

    .line 373
    .line 374
    iget-object v3, v4, Ld68;->d:Lgg5;

    .line 375
    .line 376
    invoke-interface {v3}, Lgg5;->d()F

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    mul-float/2addr v3, v2

    .line 381
    invoke-static {v3}, Lnr4;->O(F)I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v10, :cond_16

    .line 386
    .line 387
    iget v3, v10, Leo5;->Y:I

    .line 388
    .line 389
    sub-int v3, v7, v3

    .line 390
    .line 391
    int-to-float v3, v3

    .line 392
    div-float v3, v3, v16

    .line 393
    .line 394
    mul-float v3, v3, v17

    .line 395
    .line 396
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    const/4 v13, 0x0

    .line 401
    invoke-static {v1, v10, v13, v3}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 402
    .line 403
    .line 404
    :cond_16
    if-eqz v12, :cond_18

    .line 405
    .line 406
    if-eqz v10, :cond_17

    .line 407
    .line 408
    iget v13, v10, Leo5;->X:I

    .line 409
    .line 410
    goto :goto_f

    .line 411
    :cond_17
    const/4 v13, 0x0

    .line 412
    :goto_f
    invoke-static {v4, v7, v2, v12}, Ld68;->h(Ld68;IILeo5;)I

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    invoke-static {v1, v12, v13, v3}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 417
    .line 418
    .line 419
    :cond_18
    if-eqz v10, :cond_19

    .line 420
    .line 421
    iget v13, v10, Leo5;->X:I

    .line 422
    .line 423
    goto :goto_10

    .line 424
    :cond_19
    const/4 v13, 0x0

    .line 425
    :goto_10
    if-eqz v12, :cond_1a

    .line 426
    .line 427
    iget v3, v12, Leo5;->X:I

    .line 428
    .line 429
    goto :goto_11

    .line 430
    :cond_1a
    const/4 v3, 0x0

    .line 431
    :goto_11
    add-int/2addr v13, v3

    .line 432
    invoke-static {v4, v7, v2, v8}, Ld68;->h(Ld68;IILeo5;)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    invoke-static {v1, v8, v13, v3}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 437
    .line 438
    .line 439
    if-eqz v9, :cond_1b

    .line 440
    .line 441
    invoke-static {v4, v7, v2, v9}, Ld68;->h(Ld68;IILeo5;)I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    invoke-static {v1, v9, v13, v3}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 446
    .line 447
    .line 448
    :cond_1b
    if-eqz v0, :cond_1d

    .line 449
    .line 450
    if-eqz v11, :cond_1c

    .line 451
    .line 452
    iget v13, v11, Leo5;->X:I

    .line 453
    .line 454
    goto :goto_12

    .line 455
    :cond_1c
    const/4 v13, 0x0

    .line 456
    :goto_12
    sub-int v6, v18, v13

    .line 457
    .line 458
    iget v3, v0, Leo5;->X:I

    .line 459
    .line 460
    sub-int/2addr v6, v3

    .line 461
    invoke-static {v4, v7, v2, v0}, Ld68;->h(Ld68;IILeo5;)I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    invoke-static {v1, v0, v6, v2}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 466
    .line 467
    .line 468
    :cond_1d
    if-eqz v11, :cond_1e

    .line 469
    .line 470
    iget v0, v11, Leo5;->X:I

    .line 471
    .line 472
    sub-int v6, v18, v0

    .line 473
    .line 474
    iget v0, v11, Leo5;->Y:I

    .line 475
    .line 476
    sub-int v0, v7, v0

    .line 477
    .line 478
    int-to-float v0, v0

    .line 479
    div-float v0, v0, v16

    .line 480
    .line 481
    mul-float v0, v0, v17

    .line 482
    .line 483
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    invoke-static {v1, v11, v6, v0}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 488
    .line 489
    .line 490
    :cond_1e
    if-eqz v15, :cond_1f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    invoke-static {v1, v15, v13, v7}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 494
    .line 495
    .line 496
    :cond_1f
    :goto_13
    sget-object v0, Ldn8;->a:Ldn8;

    .line 497
    .line 498
    return-object v0
.end method

.class public final synthetic Lje5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lke5;

.field public final synthetic Y:I

.field public final synthetic Z:I

.field public final synthetic f0:Leo5;

.field public final synthetic g0:Leo5;

.field public final synthetic h0:Leo5;

.field public final synthetic i0:Leo5;

.field public final synthetic j0:Leo5;

.field public final synthetic k0:Lea6;

.field public final synthetic l0:Leo5;

.field public final synthetic m0:Leo5;

.field public final synthetic n0:Leo5;

.field public final synthetic o0:Lzr4;

.field public final synthetic p0:F


# direct methods
.method public synthetic constructor <init>(Lke5;IILeo5;Leo5;Leo5;Leo5;Leo5;Lea6;Leo5;Leo5;Leo5;Lzr4;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lje5;->X:Lke5;

    .line 5
    .line 6
    iput p2, p0, Lje5;->Y:I

    .line 7
    .line 8
    iput p3, p0, Lje5;->Z:I

    .line 9
    .line 10
    iput-object p4, p0, Lje5;->f0:Leo5;

    .line 11
    .line 12
    iput-object p5, p0, Lje5;->g0:Leo5;

    .line 13
    .line 14
    iput-object p6, p0, Lje5;->h0:Leo5;

    .line 15
    .line 16
    iput-object p7, p0, Lje5;->i0:Leo5;

    .line 17
    .line 18
    iput-object p8, p0, Lje5;->j0:Leo5;

    .line 19
    .line 20
    iput-object p9, p0, Lje5;->k0:Lea6;

    .line 21
    .line 22
    iput-object p10, p0, Lje5;->l0:Leo5;

    .line 23
    .line 24
    iput-object p11, p0, Lje5;->m0:Leo5;

    .line 25
    .line 26
    iput-object p12, p0, Lje5;->n0:Leo5;

    .line 27
    .line 28
    iput-object p13, p0, Lje5;->o0:Lzr4;

    .line 29
    .line 30
    iput p14, p0, Lje5;->p0:F

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

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
    iget-object v2, v0, Lje5;->k0:Lea6;

    .line 8
    .line 9
    iget-object v2, v2, Lea6;->X:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v7, v2

    .line 12
    check-cast v7, Leo5;

    .line 13
    .line 14
    iget-object v2, v0, Lje5;->o0:Lzr4;

    .line 15
    .line 16
    invoke-interface {v2}, Lfi1;->getDensity()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-interface {v2}, Lug3;->getLayoutDirection()Lz24;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v5, v0, Lje5;->X:Lke5;

    .line 25
    .line 26
    iget v6, v5, Lke5;->f:F

    .line 27
    .line 28
    invoke-interface {v2, v6}, Lfi1;->h0(F)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget-object v6, v5, Lke5;->c:Lq58;

    .line 33
    .line 34
    iget-object v8, v5, Lke5;->e:Lgg5;

    .line 35
    .line 36
    iget-object v9, v0, Lje5;->m0:Leo5;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    move v11, v3

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {v1, v9, v10, v3}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 42
    .line 43
    .line 44
    iget-object v9, v0, Lje5;->n0:Leo5;

    .line 45
    .line 46
    if-eqz v9, :cond_0

    .line 47
    .line 48
    iget v12, v9, Leo5;->Y:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v12, v10

    .line 52
    :goto_0
    iget v13, v0, Lje5;->Y:I

    .line 53
    .line 54
    sub-int/2addr v13, v12

    .line 55
    invoke-interface {v8}, Lgg5;->d()F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    mul-float/2addr v12, v11

    .line 60
    invoke-static {v12}, Lnr4;->O(F)I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    iget-object v14, v0, Lje5;->f0:Leo5;

    .line 65
    .line 66
    const/high16 v15, 0x3f800000    # 1.0f

    .line 67
    .line 68
    const/high16 v16, 0x40000000    # 2.0f

    .line 69
    .line 70
    if-eqz v14, :cond_1

    .line 71
    .line 72
    iget v3, v14, Leo5;->Y:I

    .line 73
    .line 74
    sub-int v3, v13, v3

    .line 75
    .line 76
    int-to-float v3, v3

    .line 77
    div-float v3, v3, v16

    .line 78
    .line 79
    mul-float/2addr v3, v15

    .line 80
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-static {v1, v14, v10, v3}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget v3, v0, Lje5;->Z:I

    .line 88
    .line 89
    move/from16 v17, v15

    .line 90
    .line 91
    iget-object v15, v0, Lje5;->g0:Leo5;

    .line 92
    .line 93
    if-eqz v7, :cond_c

    .line 94
    .line 95
    iget-boolean v10, v5, Lke5;->b:Z

    .line 96
    .line 97
    if-eqz v10, :cond_2

    .line 98
    .line 99
    iget v10, v7, Leo5;->Y:I

    .line 100
    .line 101
    sub-int v10, v13, v10

    .line 102
    .line 103
    int-to-float v10, v10

    .line 104
    div-float v10, v10, v16

    .line 105
    .line 106
    mul-float v10, v10, v17

    .line 107
    .line 108
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    :goto_1
    move/from16 v18, v2

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move v10, v12

    .line 116
    goto :goto_1

    .line 117
    :goto_2
    iget v2, v7, Leo5;->Y:I

    .line 118
    .line 119
    div-int/lit8 v2, v2, 0x2

    .line 120
    .line 121
    neg-int v2, v2

    .line 122
    move/from16 v19, v3

    .line 123
    .line 124
    iget v3, v0, Lje5;->p0:F

    .line 125
    .line 126
    invoke-static {v10, v3, v2}, Lw51;->I(IFI)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-static {v8, v4}, Los4;->h(Lgg5;Lz24;)F

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    mul-float/2addr v10, v11

    .line 135
    invoke-static {v8, v4}, Los4;->g(Lgg5;Lz24;)F

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    mul-float/2addr v8, v11

    .line 140
    if-nez v14, :cond_3

    .line 141
    .line 142
    move v11, v10

    .line 143
    const/16 v20, 0x0

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    const/16 v20, 0x0

    .line 147
    .line 148
    iget v11, v14, Leo5;->X:I

    .line 149
    .line 150
    int-to-float v11, v11

    .line 151
    sub-float v21, v10, v18

    .line 152
    .line 153
    cmpg-float v22, v21, v20

    .line 154
    .line 155
    if-gez v22, :cond_4

    .line 156
    .line 157
    move/from16 v21, v20

    .line 158
    .line 159
    :cond_4
    add-float v11, v11, v21

    .line 160
    .line 161
    :goto_3
    if-nez v15, :cond_5

    .line 162
    .line 163
    move-object/from16 v21, v5

    .line 164
    .line 165
    move/from16 v18, v8

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_5
    move-object/from16 v21, v5

    .line 169
    .line 170
    iget v5, v15, Leo5;->X:I

    .line 171
    .line 172
    int-to-float v5, v5

    .line 173
    sub-float v18, v8, v18

    .line 174
    .line 175
    cmpg-float v22, v18, v20

    .line 176
    .line 177
    if-gez v22, :cond_6

    .line 178
    .line 179
    move/from16 v18, v20

    .line 180
    .line 181
    :cond_6
    add-float v5, v5, v18

    .line 182
    .line 183
    move/from16 v18, v5

    .line 184
    .line 185
    :goto_4
    sget-object v5, Lz24;->X:Lz24;

    .line 186
    .line 187
    if-ne v4, v5, :cond_7

    .line 188
    .line 189
    move/from16 v20, v10

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_7
    move/from16 v20, v8

    .line 193
    .line 194
    :goto_5
    if-ne v4, v5, :cond_8

    .line 195
    .line 196
    move/from16 v22, v11

    .line 197
    .line 198
    :goto_6
    move/from16 v23, v8

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_8
    move/from16 v22, v18

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :goto_7
    instance-of v8, v6, Lq58;

    .line 205
    .line 206
    if-eqz v8, :cond_b

    .line 207
    .line 208
    iget v8, v7, Leo5;->X:I

    .line 209
    .line 210
    add-float v11, v11, v18

    .line 211
    .line 212
    invoke-static {v11}, Lnr4;->O(F)I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    sub-int v11, v19, v11

    .line 217
    .line 218
    sub-int/2addr v11, v8

    .line 219
    int-to-float v8, v11

    .line 220
    div-float v8, v8, v16

    .line 221
    .line 222
    const/high16 v11, -0x40800000    # -1.0f

    .line 223
    .line 224
    if-ne v4, v5, :cond_9

    .line 225
    .line 226
    move/from16 v18, v11

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_9
    mul-float v18, v11, v11

    .line 230
    .line 231
    :goto_8
    add-float v18, v17, v18

    .line 232
    .line 233
    mul-float v18, v18, v8

    .line 234
    .line 235
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    int-to-float v8, v8

    .line 240
    add-float v8, v8, v22

    .line 241
    .line 242
    invoke-static {v6}, Lpn7;->i(Lq58;)Lp8;

    .line 243
    .line 244
    .line 245
    iget v6, v7, Leo5;->X:I

    .line 246
    .line 247
    add-float v10, v10, v23

    .line 248
    .line 249
    invoke-static {v10}, Lnr4;->O(F)I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    sub-int v10, v19, v10

    .line 254
    .line 255
    sub-int/2addr v10, v6

    .line 256
    int-to-float v6, v10

    .line 257
    div-float v6, v6, v16

    .line 258
    .line 259
    if-ne v4, v5, :cond_a

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_a
    mul-float/2addr v11, v11

    .line 263
    :goto_9
    add-float v4, v17, v11

    .line 264
    .line 265
    mul-float/2addr v4, v6

    .line 266
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    int-to-float v4, v4

    .line 271
    add-float v4, v4, v20

    .line 272
    .line 273
    invoke-static {v8, v4, v3}, Lw51;->H(FFF)F

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    invoke-static {v3}, Lnr4;->O(F)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-static {v1, v7, v3, v2}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 282
    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_b
    const-string v0, "Unknown position: "

    .line 286
    .line 287
    invoke-static {v6, v0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const/4 v0, 0x0

    .line 291
    return-object v0

    .line 292
    :cond_c
    move/from16 v19, v3

    .line 293
    .line 294
    move-object/from16 v21, v5

    .line 295
    .line 296
    :goto_a
    iget-object v8, v0, Lje5;->h0:Leo5;

    .line 297
    .line 298
    if-eqz v8, :cond_e

    .line 299
    .line 300
    if-eqz v14, :cond_d

    .line 301
    .line 302
    iget v2, v14, Leo5;->X:I

    .line 303
    .line 304
    :goto_b
    move v6, v12

    .line 305
    move v5, v13

    .line 306
    move-object/from16 v4, v21

    .line 307
    .line 308
    const/4 v3, 0x0

    .line 309
    goto :goto_c

    .line 310
    :cond_d
    const/4 v2, 0x0

    .line 311
    goto :goto_b

    .line 312
    :goto_c
    invoke-static/range {v3 .. v8}, Lke5;->j(ILke5;IILeo5;Leo5;)I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    invoke-static {v1, v8, v2, v10}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 317
    .line 318
    .line 319
    goto :goto_d

    .line 320
    :cond_e
    move v6, v12

    .line 321
    move v5, v13

    .line 322
    move-object/from16 v4, v21

    .line 323
    .line 324
    const/4 v3, 0x0

    .line 325
    :goto_d
    if-eqz v14, :cond_f

    .line 326
    .line 327
    iget v2, v14, Leo5;->X:I

    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_f
    const/4 v2, 0x0

    .line 331
    :goto_e
    if-eqz v8, :cond_10

    .line 332
    .line 333
    iget v8, v8, Leo5;->X:I

    .line 334
    .line 335
    goto :goto_f

    .line 336
    :cond_10
    const/4 v8, 0x0

    .line 337
    :goto_f
    add-int/2addr v2, v8

    .line 338
    iget-object v8, v0, Lje5;->j0:Leo5;

    .line 339
    .line 340
    invoke-static/range {v3 .. v8}, Lke5;->j(ILke5;IILeo5;Leo5;)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    invoke-static {v1, v8, v2, v10}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 345
    .line 346
    .line 347
    iget-object v8, v0, Lje5;->l0:Leo5;

    .line 348
    .line 349
    if-eqz v8, :cond_11

    .line 350
    .line 351
    invoke-static/range {v3 .. v8}, Lke5;->j(ILke5;IILeo5;Leo5;)I

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    invoke-static {v1, v8, v2, v10}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 356
    .line 357
    .line 358
    :cond_11
    iget-object v8, v0, Lje5;->i0:Leo5;

    .line 359
    .line 360
    if-eqz v8, :cond_13

    .line 361
    .line 362
    if-eqz v15, :cond_12

    .line 363
    .line 364
    iget v0, v15, Leo5;->X:I

    .line 365
    .line 366
    goto :goto_10

    .line 367
    :cond_12
    const/4 v0, 0x0

    .line 368
    :goto_10
    sub-int v0, v19, v0

    .line 369
    .line 370
    iget v2, v8, Leo5;->X:I

    .line 371
    .line 372
    sub-int/2addr v0, v2

    .line 373
    invoke-static/range {v3 .. v8}, Lke5;->j(ILke5;IILeo5;Leo5;)I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-static {v1, v8, v0, v2}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 378
    .line 379
    .line 380
    :cond_13
    if-eqz v15, :cond_14

    .line 381
    .line 382
    iget v0, v15, Leo5;->X:I

    .line 383
    .line 384
    sub-int v3, v19, v0

    .line 385
    .line 386
    iget v0, v15, Leo5;->Y:I

    .line 387
    .line 388
    sub-int v13, v5, v0

    .line 389
    .line 390
    int-to-float v0, v13

    .line 391
    div-float v0, v0, v16

    .line 392
    .line 393
    mul-float v0, v0, v17

    .line 394
    .line 395
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-static {v1, v15, v3, v0}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 400
    .line 401
    .line 402
    :cond_14
    if-eqz v9, :cond_15

    .line 403
    .line 404
    const/4 v0, 0x0

    .line 405
    invoke-static {v1, v9, v0, v5}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 406
    .line 407
    .line 408
    :cond_15
    sget-object v0, Ldn8;->a:Ldn8;

    .line 409
    .line 410
    return-object v0
.end method

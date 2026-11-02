.class public abstract Lxw5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lb81;

.field public static final b:Lb81;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Loy4;->a:Lb81;

    .line 2
    .line 3
    sput-object v0, Lxw5;->a:Lb81;

    .line 4
    .line 5
    sget-object v0, Loy4;->c:Lb81;

    .line 6
    .line 7
    sput-object v0, Lxw5;->b:Lb81;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lkx4;JFJIFLlp2;I)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v12, p1

    .line 4
    .line 5
    move-object/from16 v6, p8

    .line 6
    .line 7
    const v0, 0x13db87c1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v6, v0}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v6, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    or-int v0, p9, v0

    .line 24
    .line 25
    invoke-virtual {v6, v12, v13}, Llp2;->e(J)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/16 v3, 0x20

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v3, 0x10

    .line 35
    .line 36
    :goto_1
    or-int/2addr v0, v3

    .line 37
    const v3, 0x36580

    .line 38
    .line 39
    .line 40
    or-int/2addr v0, v3

    .line 41
    const v3, 0x12493

    .line 42
    .line 43
    .line 44
    and-int/2addr v3, v0

    .line 45
    const v4, 0x12492

    .line 46
    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v10, 0x1

    .line 50
    if-eq v3, v4, :cond_2

    .line 51
    .line 52
    move v3, v10

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v3, v14

    .line 55
    :goto_2
    and-int/lit8 v4, v0, 0x1

    .line 56
    .line 57
    invoke-virtual {v6, v4, v3}, Llp2;->N(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_a

    .line 62
    .line 63
    invoke-virtual {v6}, Llp2;->S()V

    .line 64
    .line 65
    .line 66
    and-int/lit8 v3, p9, 0x1

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v6}, Llp2;->x()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {v6}, Llp2;->Q()V

    .line 78
    .line 79
    .line 80
    and-int/lit16 v0, v0, -0x1c01

    .line 81
    .line 82
    move-wide/from16 v3, p4

    .line 83
    .line 84
    move/from16 v18, p6

    .line 85
    .line 86
    move/from16 v11, p7

    .line 87
    .line 88
    move/from16 v21, v0

    .line 89
    .line 90
    move/from16 v0, p3

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    :goto_3
    sget-wide v3, Ldw0;->f:J

    .line 94
    .line 95
    and-int/lit16 v0, v0, -0x1c01

    .line 96
    .line 97
    const/high16 v5, 0x40800000    # 4.0f

    .line 98
    .line 99
    move/from16 v21, v0

    .line 100
    .line 101
    move v0, v5

    .line 102
    move v11, v0

    .line 103
    move/from16 v18, v10

    .line 104
    .line 105
    :goto_4
    invoke-virtual {v6}, Llp2;->q()V

    .line 106
    .line 107
    .line 108
    sget-object v5, Ly01;->h:Lox1;

    .line 109
    .line 110
    invoke-virtual {v6, v5}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Lfi1;

    .line 115
    .line 116
    new-instance v15, Lom7;

    .line 117
    .line 118
    invoke-interface {v5, v0}, Lfi1;->h0(F)F

    .line 119
    .line 120
    .line 121
    move-result v16

    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    const/16 v20, 0x1a

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    invoke-direct/range {v15 .. v20}, Lom7;-><init>(FFIII)V

    .line 129
    .line 130
    .line 131
    invoke-static {v10, v6}, Lzc1;->h0(ILlp2;)Lnc3;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    sget-object v7, Lyx1;->d:Lb61;

    .line 136
    .line 137
    const/16 v8, 0x1770

    .line 138
    .line 139
    invoke-static {v8, v2, v7}, Lwl7;->i0(IILxx1;)Lsg8;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/4 v7, 0x6

    .line 144
    invoke-static {v2, v7}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move/from16 v16, v8

    .line 149
    .line 150
    const/16 v8, 0x8

    .line 151
    .line 152
    move-wide/from16 v19, v3

    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    const/high16 v4, 0x44870000    # 1080.0f

    .line 156
    .line 157
    move/from16 v17, v7

    .line 158
    .line 159
    const/16 v7, 0x11b8

    .line 160
    .line 161
    move-object v9, v5

    .line 162
    move-object v5, v2

    .line 163
    move-object v2, v9

    .line 164
    move/from16 v10, v16

    .line 165
    .line 166
    move/from16 v9, v17

    .line 167
    .line 168
    move-wide/from16 v22, v19

    .line 169
    .line 170
    invoke-static/range {v2 .. v8}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    new-instance v4, Ldx4;

    .line 175
    .line 176
    const/16 v5, 0x1d

    .line 177
    .line 178
    invoke-direct {v4, v5}, Ldx4;-><init>(B)V

    .line 179
    .line 180
    .line 181
    new-instance v5, Lay3;

    .line 182
    .line 183
    new-instance v6, Lzx3;

    .line 184
    .line 185
    invoke-direct {v6}, Lzx3;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v6}, Ldx4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-direct {v5, v6}, Lay3;-><init>(Lzx3;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v5, v9}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    move-object v4, v3

    .line 199
    const/4 v3, 0x0

    .line 200
    move-object v6, v4

    .line 201
    const/high16 v4, 0x43b40000    # 360.0f

    .line 202
    .line 203
    move-object/from16 v24, v6

    .line 204
    .line 205
    move-object/from16 v6, p8

    .line 206
    .line 207
    invoke-static/range {v2 .. v8}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    new-instance v3, Lay3;

    .line 212
    .line 213
    new-instance v4, Lzx3;

    .line 214
    .line 215
    invoke-direct {v4}, Lzx3;-><init>()V

    .line 216
    .line 217
    .line 218
    iput-short v10, v4, Lzx3;->a:S

    .line 219
    .line 220
    const v5, 0x3f5eb852    # 0.87f

    .line 221
    .line 222
    .line 223
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    const/16 v6, 0xbb8

    .line 228
    .line 229
    invoke-virtual {v4, v5, v6}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    sget-object v6, Lxw5;->b:Lb81;

    .line 234
    .line 235
    iput-object v6, v5, Lyx3;->b:Lxx1;

    .line 236
    .line 237
    const v5, 0x3dcccccd    # 0.1f

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-virtual {v4, v5, v10}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 245
    .line 246
    .line 247
    invoke-direct {v3, v4}, Lay3;-><init>(Lzx3;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v3, v9}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    move-object v3, v8

    .line 255
    const/16 v8, 0x8

    .line 256
    .line 257
    move-object v4, v3

    .line 258
    const v3, 0x3dcccccd    # 0.1f

    .line 259
    .line 260
    .line 261
    move-object v6, v4

    .line 262
    const v4, 0x3f5eb852    # 0.87f

    .line 263
    .line 264
    .line 265
    move-object v9, v6

    .line 266
    move-object/from16 v6, p8

    .line 267
    .line 268
    invoke-static/range {v2 .. v8}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    move-object v2, v6

    .line 273
    new-instance v4, Lzw5;

    .line 274
    .line 275
    invoke-direct {v4, v14}, Lzw5;-><init>(B)V

    .line 276
    .line 277
    .line 278
    const/4 v5, 0x1

    .line 279
    invoke-static {v1, v5, v4}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const/high16 v6, 0x42200000    # 40.0f

    .line 284
    .line 285
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v2, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    move-object/from16 v7, v24

    .line 294
    .line 295
    invoke-virtual {v2, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    or-int/2addr v6, v8

    .line 300
    invoke-virtual {v2, v9}, Llp2;->f(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    or-int/2addr v6, v8

    .line 305
    move/from16 p3, v6

    .line 306
    .line 307
    move-wide/from16 v5, v22

    .line 308
    .line 309
    invoke-virtual {v2, v5, v6}, Llp2;->e(J)Z

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    or-int v8, p3, v8

    .line 314
    .line 315
    invoke-virtual {v2, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    or-int/2addr v8, v10

    .line 320
    and-int/lit8 v10, v21, 0x70

    .line 321
    .line 322
    xor-int/lit8 v10, v10, 0x30

    .line 323
    .line 324
    const/16 v14, 0x20

    .line 325
    .line 326
    if-le v10, v14, :cond_5

    .line 327
    .line 328
    invoke-virtual {v2, v12, v13}, Llp2;->e(J)Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-nez v10, :cond_6

    .line 333
    .line 334
    :cond_5
    and-int/lit8 v10, v21, 0x30

    .line 335
    .line 336
    if-ne v10, v14, :cond_7

    .line 337
    .line 338
    :cond_6
    const/4 v10, 0x1

    .line 339
    goto :goto_5

    .line 340
    :cond_7
    const/4 v10, 0x0

    .line 341
    :goto_5
    or-int/2addr v8, v10

    .line 342
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    if-nez v8, :cond_9

    .line 347
    .line 348
    sget-object v8, Lzz0;->a:Lbe;

    .line 349
    .line 350
    if-ne v10, v8, :cond_8

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_8
    move-object v14, v4

    .line 354
    move-wide/from16 v22, v5

    .line 355
    .line 356
    move v5, v11

    .line 357
    move v6, v0

    .line 358
    move-object v0, v2

    .line 359
    goto :goto_7

    .line 360
    :cond_9
    :goto_6
    new-instance v2, Lrw5;

    .line 361
    .line 362
    move-object v14, v4

    .line 363
    move-object v8, v9

    .line 364
    move/from16 v4, v18

    .line 365
    .line 366
    move-wide v9, v5

    .line 367
    move v5, v11

    .line 368
    move-object v11, v15

    .line 369
    move v6, v0

    .line 370
    move-object/from16 v0, p8

    .line 371
    .line 372
    invoke-direct/range {v2 .. v13}, Lrw5;-><init>(Llc3;IFFLlc3;Llc3;JLom7;J)V

    .line 373
    .line 374
    .line 375
    move-wide/from16 v22, v9

    .line 376
    .line 377
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    move-object v10, v2

    .line 381
    :goto_7
    check-cast v10, Lgn2;

    .line 382
    .line 383
    const/4 v2, 0x0

    .line 384
    invoke-static {v2, v10, v0, v14}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 385
    .line 386
    .line 387
    move v8, v5

    .line 388
    move v4, v6

    .line 389
    move/from16 v7, v18

    .line 390
    .line 391
    move-wide/from16 v5, v22

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_a
    move-object v0, v6

    .line 395
    invoke-virtual {v0}, Llp2;->Q()V

    .line 396
    .line 397
    .line 398
    move/from16 v4, p3

    .line 399
    .line 400
    move-wide/from16 v5, p4

    .line 401
    .line 402
    move/from16 v7, p6

    .line 403
    .line 404
    move/from16 v8, p7

    .line 405
    .line 406
    :goto_8
    invoke-virtual {v0}, Llp2;->r()Lj86;

    .line 407
    .line 408
    .line 409
    move-result-object v10

    .line 410
    if-eqz v10, :cond_b

    .line 411
    .line 412
    new-instance v0, Lsw5;

    .line 413
    .line 414
    move-wide/from16 v2, p1

    .line 415
    .line 416
    move/from16 v9, p9

    .line 417
    .line 418
    invoke-direct/range {v0 .. v9}, Lsw5;-><init>(Lkx4;JFJIFI)V

    .line 419
    .line 420
    .line 421
    iput-object v0, v10, Lj86;->d:Lrn2;

    .line 422
    .line 423
    :cond_b
    return-void
.end method

.method public static final b(Ldn2;Lkx4;JJIFLgn2;Llp2;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v9, p2

    .line 6
    .line 7
    move-wide/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v0, p9

    .line 10
    .line 11
    const v3, -0x144387f6

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v3}, Llp2;->X(I)Llp2;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v3, p10, 0x6

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    move v3, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v3, 0x2

    .line 31
    :goto_0
    or-int v3, p10, v3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move/from16 v3, p10

    .line 35
    .line 36
    :goto_1
    and-int/lit8 v7, p10, 0x30

    .line 37
    .line 38
    if-nez v7, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    const/16 v7, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v7, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v3, v7

    .line 52
    :cond_3
    invoke-virtual {v0, v9, v10}, Llp2;->e(J)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const/16 v8, 0x100

    .line 57
    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    move v7, v8

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v7, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v3, v7

    .line 65
    invoke-virtual {v0, v5, v6}, Llp2;->e(J)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_5

    .line 70
    .line 71
    const/16 v7, 0x800

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/16 v7, 0x400

    .line 75
    .line 76
    :goto_4
    or-int/2addr v3, v7

    .line 77
    const v7, 0xb6000

    .line 78
    .line 79
    .line 80
    or-int/2addr v3, v7

    .line 81
    const v7, 0x92493

    .line 82
    .line 83
    .line 84
    and-int/2addr v7, v3

    .line 85
    const v12, 0x92492

    .line 86
    .line 87
    .line 88
    if-eq v7, v12, :cond_6

    .line 89
    .line 90
    const/4 v7, 0x1

    .line 91
    goto :goto_5

    .line 92
    :cond_6
    const/4 v7, 0x0

    .line 93
    :goto_5
    and-int/lit8 v12, v3, 0x1

    .line 94
    .line 95
    invoke-virtual {v0, v12, v7}, Llp2;->N(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v7, :cond_1b

    .line 100
    .line 101
    invoke-virtual {v0}, Llp2;->S()V

    .line 102
    .line 103
    .line 104
    and-int/lit8 v7, p10, 0x1

    .line 105
    .line 106
    const v16, -0x380001

    .line 107
    .line 108
    .line 109
    sget-object v15, Lzz0;->a:Lbe;

    .line 110
    .line 111
    if-eqz v7, :cond_8

    .line 112
    .line 113
    invoke-virtual {v0}, Llp2;->x()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_7

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_7
    invoke-virtual {v0}, Llp2;->Q()V

    .line 121
    .line 122
    .line 123
    and-int v3, v3, v16

    .line 124
    .line 125
    move/from16 v7, p7

    .line 126
    .line 127
    move-object/from16 v13, p8

    .line 128
    .line 129
    move v8, v3

    .line 130
    move/from16 v3, p6

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_8
    :goto_6
    and-int/lit16 v7, v3, 0x380

    .line 134
    .line 135
    xor-int/lit16 v7, v7, 0x180

    .line 136
    .line 137
    if-le v7, v8, :cond_9

    .line 138
    .line 139
    invoke-virtual {v0, v9, v10}, Llp2;->e(J)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-nez v7, :cond_a

    .line 144
    .line 145
    :cond_9
    and-int/lit16 v7, v3, 0x180

    .line 146
    .line 147
    if-ne v7, v8, :cond_b

    .line 148
    .line 149
    :cond_a
    const/4 v7, 0x1

    .line 150
    goto :goto_7

    .line 151
    :cond_b
    const/4 v7, 0x0

    .line 152
    :goto_7
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    if-nez v7, :cond_c

    .line 157
    .line 158
    if-ne v13, v15, :cond_d

    .line 159
    .line 160
    :cond_c
    new-instance v13, Lbd;

    .line 161
    .line 162
    invoke-direct {v13, v9, v10, v4}, Lbd;-><init>(JB)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v13}, Llp2;->g0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_d
    move-object v7, v13

    .line 169
    check-cast v7, Lgn2;

    .line 170
    .line 171
    and-int v3, v3, v16

    .line 172
    .line 173
    move v8, v3

    .line 174
    move-object v13, v7

    .line 175
    const/4 v3, 0x1

    .line 176
    const/high16 v7, 0x40800000    # 4.0f

    .line 177
    .line 178
    :goto_8
    invoke-virtual {v0}, Llp2;->q()V

    .line 179
    .line 180
    .line 181
    and-int/lit8 v11, v8, 0xe

    .line 182
    .line 183
    if-ne v11, v4, :cond_e

    .line 184
    .line 185
    const/4 v11, 0x1

    .line 186
    goto :goto_9

    .line 187
    :cond_e
    const/4 v11, 0x0

    .line 188
    :goto_9
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    if-nez v11, :cond_f

    .line 193
    .line 194
    if-ne v12, v15, :cond_10

    .line 195
    .line 196
    :cond_f
    new-instance v12, Lmv2;

    .line 197
    .line 198
    invoke-direct {v12, v1, v4}, Lmv2;-><init>(Ldn2;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_10
    check-cast v12, Ldn2;

    .line 205
    .line 206
    sget-object v11, Lm4;->b:Lkx4;

    .line 207
    .line 208
    invoke-interface {v2, v11}, Lkx4;->y(Lkx4;)Lkx4;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    invoke-virtual {v0, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v17

    .line 216
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    if-nez v17, :cond_11

    .line 221
    .line 222
    if-ne v14, v15, :cond_12

    .line 223
    .line 224
    :cond_11
    new-instance v14, Lxo;

    .line 225
    .line 226
    invoke-direct {v14, v12, v4}, Lxo;-><init>(Ldn2;B)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v14}, Llp2;->g0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_12
    check-cast v14, Lgn2;

    .line 233
    .line 234
    const/4 v4, 0x1

    .line 235
    invoke-static {v11, v4, v14}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    const/high16 v14, 0x43700000    # 240.0f

    .line 240
    .line 241
    const/high16 v4, 0x40800000    # 4.0f

    .line 242
    .line 243
    invoke-static {v11, v14, v4}, Landroidx/compose/foundation/layout/b;->h(Lkx4;FF)Lkx4;

    .line 244
    .line 245
    .line 246
    move-result-object v14

    .line 247
    invoke-virtual {v0, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    and-int/lit16 v11, v8, 0x1c00

    .line 252
    .line 253
    xor-int/lit16 v11, v11, 0xc00

    .line 254
    .line 255
    const/16 v1, 0x800

    .line 256
    .line 257
    if-le v11, v1, :cond_13

    .line 258
    .line 259
    invoke-virtual {v0, v5, v6}, Llp2;->e(J)Z

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    if-nez v11, :cond_14

    .line 264
    .line 265
    :cond_13
    and-int/lit16 v11, v8, 0xc00

    .line 266
    .line 267
    if-ne v11, v1, :cond_15

    .line 268
    .line 269
    :cond_14
    const/4 v1, 0x1

    .line 270
    goto :goto_a

    .line 271
    :cond_15
    const/4 v1, 0x0

    .line 272
    :goto_a
    or-int/2addr v1, v4

    .line 273
    and-int/lit16 v4, v8, 0x380

    .line 274
    .line 275
    xor-int/lit16 v4, v4, 0x180

    .line 276
    .line 277
    const/16 v11, 0x100

    .line 278
    .line 279
    if-le v4, v11, :cond_16

    .line 280
    .line 281
    invoke-virtual {v0, v9, v10}, Llp2;->e(J)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_17

    .line 286
    .line 287
    :cond_16
    and-int/lit16 v4, v8, 0x180

    .line 288
    .line 289
    if-ne v4, v11, :cond_18

    .line 290
    .line 291
    :cond_17
    const/16 v18, 0x1

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_18
    const/16 v18, 0x0

    .line 295
    .line 296
    :goto_b
    or-int v1, v1, v18

    .line 297
    .line 298
    invoke-virtual {v0, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    or-int/2addr v1, v4

    .line 303
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    if-nez v1, :cond_19

    .line 308
    .line 309
    if-ne v4, v15, :cond_1a

    .line 310
    .line 311
    :cond_19
    move v4, v3

    .line 312
    goto :goto_c

    .line 313
    :cond_1a
    move-object v5, v4

    .line 314
    move v4, v3

    .line 315
    move-object v3, v5

    .line 316
    move v5, v7

    .line 317
    move-object v11, v13

    .line 318
    goto :goto_d

    .line 319
    :goto_c
    new-instance v3, Ltw5;

    .line 320
    .line 321
    move-wide/from16 v19, v5

    .line 322
    .line 323
    move v5, v7

    .line 324
    move-wide/from16 v7, v19

    .line 325
    .line 326
    move-object v6, v12

    .line 327
    move-object v11, v13

    .line 328
    invoke-direct/range {v3 .. v11}, Ltw5;-><init>(IFLdn2;JJLgn2;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :goto_d
    check-cast v3, Lgn2;

    .line 335
    .line 336
    const/4 v1, 0x0

    .line 337
    invoke-static {v1, v3, v0, v14}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 338
    .line 339
    .line 340
    move v7, v4

    .line 341
    move v8, v5

    .line 342
    move-object v9, v11

    .line 343
    goto :goto_e

    .line 344
    :cond_1b
    invoke-virtual {v0}, Llp2;->Q()V

    .line 345
    .line 346
    .line 347
    move/from16 v7, p6

    .line 348
    .line 349
    move/from16 v8, p7

    .line 350
    .line 351
    move-object/from16 v9, p8

    .line 352
    .line 353
    :goto_e
    invoke-virtual {v0}, Llp2;->r()Lj86;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    if-eqz v11, :cond_1c

    .line 358
    .line 359
    new-instance v0, Luw5;

    .line 360
    .line 361
    move-object/from16 v1, p0

    .line 362
    .line 363
    move-wide/from16 v3, p2

    .line 364
    .line 365
    move-wide/from16 v5, p4

    .line 366
    .line 367
    move/from16 v10, p10

    .line 368
    .line 369
    invoke-direct/range {v0 .. v10}, Luw5;-><init>(Ldn2;Lkx4;JJIFLgn2;I)V

    .line 370
    .line 371
    .line 372
    iput-object v0, v11, Lj86;->d:Lrn2;

    .line 373
    .line 374
    :cond_1c
    return-void
.end method

.method public static final c(Lkx4;JJIFLlp2;I)V
    .locals 23

    .line 1
    move-wide/from16 v7, p1

    .line 2
    .line 3
    move-wide/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v13, p7

    .line 6
    .line 7
    move/from16 v0, p8

    .line 8
    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x21d4b971

    .line 21
    .line 22
    .line 23
    invoke-virtual {v13, v3}, Llp2;->X(I)Llp2;

    .line 24
    .line 25
    .line 26
    and-int/lit8 v3, v0, 0x30

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v13, v7, v8}, Llp2;->e(J)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const/16 v3, 0x20

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v3, 0x10

    .line 40
    .line 41
    :goto_0
    or-int/2addr v3, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v3, v0

    .line 44
    :goto_1
    and-int/lit16 v9, v0, 0x180

    .line 45
    .line 46
    if-nez v9, :cond_3

    .line 47
    .line 48
    invoke-virtual {v13, v4, v5}, Llp2;->e(J)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    const/16 v9, 0x100

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v9, 0x80

    .line 58
    .line 59
    :goto_2
    or-int/2addr v3, v9

    .line 60
    :cond_3
    or-int/lit16 v3, v3, 0x6c00

    .line 61
    .line 62
    and-int/lit16 v9, v3, 0x2493

    .line 63
    .line 64
    const/16 v11, 0x2492

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v14, 0x1

    .line 68
    if-eq v9, v11, :cond_4

    .line 69
    .line 70
    move v9, v14

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move v9, v12

    .line 73
    :goto_3
    and-int/lit8 v11, v3, 0x1

    .line 74
    .line 75
    invoke-virtual {v13, v11, v9}, Llp2;->N(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_f

    .line 80
    .line 81
    invoke-virtual {v13}, Llp2;->S()V

    .line 82
    .line 83
    .line 84
    and-int/lit8 v9, v0, 0x1

    .line 85
    .line 86
    if-eqz v9, :cond_6

    .line 87
    .line 88
    invoke-virtual {v13}, Llp2;->x()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_5

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    invoke-virtual {v13}, Llp2;->Q()V

    .line 96
    .line 97
    .line 98
    move/from16 v16, p5

    .line 99
    .line 100
    move/from16 v17, p6

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    :goto_4
    move/from16 v16, v14

    .line 104
    .line 105
    const/high16 v17, 0x40800000    # 4.0f

    .line 106
    .line 107
    :goto_5
    invoke-virtual {v13}, Llp2;->q()V

    .line 108
    .line 109
    .line 110
    invoke-static {v14, v13}, Lzc1;->h0(ILlp2;)Lnc3;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    new-instance v15, Lay3;

    .line 115
    .line 116
    new-instance v10, Lzx3;

    .line 117
    .line 118
    invoke-direct {v10}, Lzx3;-><init>()V

    .line 119
    .line 120
    .line 121
    const/16 v6, 0x6d6

    .line 122
    .line 123
    iput-short v6, v10, Lzx3;->a:S

    .line 124
    .line 125
    invoke-virtual {v10, v2, v12}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    sget-object v6, Lxw5;->a:Lb81;

    .line 130
    .line 131
    iput-object v6, v11, Lyx3;->b:Lxx1;

    .line 132
    .line 133
    const/16 v11, 0x3e8

    .line 134
    .line 135
    invoke-virtual {v10, v1, v11}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 136
    .line 137
    .line 138
    invoke-direct {v15, v10}, Lay3;-><init>(Lzx3;)V

    .line 139
    .line 140
    .line 141
    const/4 v10, 0x6

    .line 142
    invoke-static {v15, v10}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    const/16 v15, 0x8

    .line 147
    .line 148
    move/from16 v18, v10

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    move/from16 v19, v12

    .line 152
    .line 153
    move-object v12, v11

    .line 154
    const/high16 v11, 0x3f800000    # 1.0f

    .line 155
    .line 156
    move/from16 v20, v14

    .line 157
    .line 158
    const/16 v14, 0x11b8

    .line 159
    .line 160
    move/from16 v0, v18

    .line 161
    .line 162
    invoke-static/range {v9 .. v15}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    new-instance v11, Lay3;

    .line 167
    .line 168
    new-instance v12, Lzx3;

    .line 169
    .line 170
    invoke-direct {v12}, Lzx3;-><init>()V

    .line 171
    .line 172
    .line 173
    const/16 v13, 0x6d6

    .line 174
    .line 175
    iput-short v13, v12, Lzx3;->a:S

    .line 176
    .line 177
    const/16 v13, 0xfa

    .line 178
    .line 179
    invoke-virtual {v12, v2, v13}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    iput-object v6, v13, Lyx3;->b:Lxx1;

    .line 184
    .line 185
    const/16 v13, 0x4e2

    .line 186
    .line 187
    invoke-virtual {v12, v1, v13}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 188
    .line 189
    .line 190
    invoke-direct {v11, v12}, Lay3;-><init>(Lzx3;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v11, v0}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    move-object v11, v10

    .line 198
    const/4 v10, 0x0

    .line 199
    move-object v13, v11

    .line 200
    const/high16 v11, 0x3f800000    # 1.0f

    .line 201
    .line 202
    move-object/from16 v21, v13

    .line 203
    .line 204
    move-object/from16 v13, p7

    .line 205
    .line 206
    invoke-static/range {v9 .. v15}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    new-instance v11, Lay3;

    .line 211
    .line 212
    new-instance v12, Lzx3;

    .line 213
    .line 214
    invoke-direct {v12}, Lzx3;-><init>()V

    .line 215
    .line 216
    .line 217
    const/16 v13, 0x6d6

    .line 218
    .line 219
    iput-short v13, v12, Lzx3;->a:S

    .line 220
    .line 221
    const/16 v13, 0x28a

    .line 222
    .line 223
    invoke-virtual {v12, v2, v13}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    iput-object v6, v13, Lyx3;->b:Lxx1;

    .line 228
    .line 229
    const/16 v13, 0x5dc

    .line 230
    .line 231
    invoke-virtual {v12, v1, v13}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 232
    .line 233
    .line 234
    invoke-direct {v11, v12}, Lay3;-><init>(Lzx3;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v11, v0}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    move-object v11, v10

    .line 242
    const/4 v10, 0x0

    .line 243
    move-object v13, v11

    .line 244
    const/high16 v11, 0x3f800000    # 1.0f

    .line 245
    .line 246
    move-object/from16 v22, v13

    .line 247
    .line 248
    move-object/from16 v13, p7

    .line 249
    .line 250
    invoke-static/range {v9 .. v15}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    new-instance v11, Lay3;

    .line 255
    .line 256
    new-instance v12, Lzx3;

    .line 257
    .line 258
    invoke-direct {v12}, Lzx3;-><init>()V

    .line 259
    .line 260
    .line 261
    const/16 v13, 0x6d6

    .line 262
    .line 263
    iput-short v13, v12, Lzx3;->a:S

    .line 264
    .line 265
    const/16 v15, 0x384

    .line 266
    .line 267
    invoke-virtual {v12, v2, v15}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    iput-object v6, v2, Lyx3;->b:Lxx1;

    .line 272
    .line 273
    invoke-virtual {v12, v1, v13}, Lzx3;->a(Ljava/lang/Float;I)Lyx3;

    .line 274
    .line 275
    .line 276
    invoke-direct {v11, v12}, Lay3;-><init>(Lzx3;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v11, v0}, Lwl7;->N(Lhx1;I)Lkc3;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    const/16 v15, 0x8

    .line 284
    .line 285
    move-object v0, v10

    .line 286
    const/4 v10, 0x0

    .line 287
    const/high16 v11, 0x3f800000    # 1.0f

    .line 288
    .line 289
    move-object/from16 v13, p7

    .line 290
    .line 291
    invoke-static/range {v9 .. v15}, Lzc1;->l(Lnc3;FFLkc3;Llp2;II)Llc3;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    sget-object v1, Lm4;->b:Lkx4;

    .line 296
    .line 297
    move-object/from16 v11, p0

    .line 298
    .line 299
    invoke-interface {v11, v1}, Lkx4;->y(Lkx4;)Lkx4;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    new-instance v2, Lzw5;

    .line 304
    .line 305
    const/4 v6, 0x0

    .line 306
    invoke-direct {v2, v6}, Lzw5;-><init>(B)V

    .line 307
    .line 308
    .line 309
    const/4 v9, 0x1

    .line 310
    invoke-static {v1, v9, v2}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    const/high16 v2, 0x43700000    # 240.0f

    .line 315
    .line 316
    const/high16 v12, 0x40800000    # 4.0f

    .line 317
    .line 318
    invoke-static {v1, v2, v12}, Landroidx/compose/foundation/layout/b;->h(Lkx4;FF)Lkx4;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    move-object/from16 v1, v21

    .line 323
    .line 324
    invoke-virtual {v13, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    and-int/lit16 v14, v3, 0x380

    .line 329
    .line 330
    xor-int/lit16 v14, v14, 0x180

    .line 331
    .line 332
    const/16 v15, 0x100

    .line 333
    .line 334
    if-le v14, v15, :cond_7

    .line 335
    .line 336
    invoke-virtual {v13, v4, v5}, Llp2;->e(J)Z

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    if-nez v14, :cond_8

    .line 341
    .line 342
    :cond_7
    and-int/lit16 v14, v3, 0x180

    .line 343
    .line 344
    if-ne v14, v15, :cond_9

    .line 345
    .line 346
    :cond_8
    move v14, v9

    .line 347
    goto :goto_6

    .line 348
    :cond_9
    move v14, v6

    .line 349
    :goto_6
    or-int/2addr v2, v14

    .line 350
    move-object/from16 v14, v22

    .line 351
    .line 352
    invoke-virtual {v13, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v15

    .line 356
    or-int/2addr v2, v15

    .line 357
    and-int/lit8 v15, v3, 0x70

    .line 358
    .line 359
    xor-int/lit8 v15, v15, 0x30

    .line 360
    .line 361
    const/16 v6, 0x20

    .line 362
    .line 363
    if-le v15, v6, :cond_a

    .line 364
    .line 365
    invoke-virtual {v13, v7, v8}, Llp2;->e(J)Z

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    if-nez v15, :cond_c

    .line 370
    .line 371
    :cond_a
    and-int/lit8 v3, v3, 0x30

    .line 372
    .line 373
    if-ne v3, v6, :cond_b

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_b
    const/4 v9, 0x0

    .line 377
    :cond_c
    :goto_7
    or-int/2addr v2, v9

    .line 378
    invoke-virtual {v13, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    or-int/2addr v2, v3

    .line 383
    invoke-virtual {v13, v10}, Llp2;->f(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    or-int/2addr v2, v3

    .line 388
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    if-nez v2, :cond_d

    .line 393
    .line 394
    sget-object v2, Lzz0;->a:Lbe;

    .line 395
    .line 396
    if-ne v3, v2, :cond_e

    .line 397
    .line 398
    :cond_d
    move-object v9, v0

    .line 399
    goto :goto_8

    .line 400
    :cond_e
    move/from16 v1, v16

    .line 401
    .line 402
    move/from16 v2, v17

    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    goto :goto_9

    .line 406
    :goto_8
    new-instance v0, Lvw5;

    .line 407
    .line 408
    move-object v3, v1

    .line 409
    move-object v6, v14

    .line 410
    move/from16 v1, v16

    .line 411
    .line 412
    move/from16 v2, v17

    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    invoke-direct/range {v0 .. v10}, Lvw5;-><init>(IFLlc3;JLlc3;JLlc3;Llc3;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v13, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    move-object v3, v0

    .line 422
    :goto_9
    check-cast v3, Lgn2;

    .line 423
    .line 424
    invoke-static {v14, v3, v13, v12}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 425
    .line 426
    .line 427
    move v6, v1

    .line 428
    move v7, v2

    .line 429
    goto :goto_a

    .line 430
    :cond_f
    move-object/from16 v11, p0

    .line 431
    .line 432
    invoke-virtual {v13}, Llp2;->Q()V

    .line 433
    .line 434
    .line 435
    move/from16 v6, p5

    .line 436
    .line 437
    move/from16 v7, p6

    .line 438
    .line 439
    :goto_a
    invoke-virtual {v13}, Llp2;->r()Lj86;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    if-eqz v9, :cond_10

    .line 444
    .line 445
    new-instance v0, Lww5;

    .line 446
    .line 447
    move-wide/from16 v2, p1

    .line 448
    .line 449
    move-wide/from16 v4, p3

    .line 450
    .line 451
    move/from16 v8, p8

    .line 452
    .line 453
    move-object v1, v11

    .line 454
    invoke-direct/range {v0 .. v8}, Lww5;-><init>(Lkx4;JJIFI)V

    .line 455
    .line 456
    .line 457
    iput-object v0, v9, Lj86;->d:Lrn2;

    .line 458
    .line 459
    :cond_10
    return-void
.end method

.method public static final d(Lsv1;FFJLom7;)V
    .locals 10

    .line 1
    iget v0, p5, Lom7;->a:F

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    div-float/2addr v0, v1

    .line 6
    invoke-interface {p0}, Lsv1;->e()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    shr-long/2addr v2, v4

    .line 13
    long-to-int v2, v2

    .line 14
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    mul-float/2addr v1, v0

    .line 19
    sub-float/2addr v2, v1

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-long v5, v1

    .line 25
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-long v0, v0

    .line 30
    shl-long/2addr v5, v4

    .line 31
    const-wide v7, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v0, v7

    .line 37
    or-long/2addr v5, v0

    .line 38
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    int-to-long v2, v2

    .line 48
    shl-long/2addr v0, v4

    .line 49
    and-long/2addr v2, v7

    .line 50
    or-long v7, v0, v2

    .line 51
    .line 52
    move-object v0, p0

    .line 53
    move v3, p1

    .line 54
    move v4, p2

    .line 55
    move-wide v1, p3

    .line 56
    move-object v9, p5

    .line 57
    invoke-interface/range {v0 .. v9}, Lsv1;->L0(JFFJJLtv1;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static final e(Lsv1;FFJFI)V
    .locals 21

    .line 1
    invoke-interface/range {p0 .. p0}, Lsv1;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface/range {p0 .. p0}, Lsv1;->e()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide v5, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v3, v5

    .line 23
    long-to-int v1, v3

    .line 24
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v3, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float v4, v1, v3

    .line 31
    .line 32
    invoke-interface/range {p0 .. p0}, Lsv1;->getLayoutDirection()Lz24;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    sget-object v8, Lz24;->X:Lz24;

    .line 37
    .line 38
    if-ne v7, v8, :cond_0

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v7, 0x0

    .line 43
    :goto_0
    const/high16 v8, 0x3f800000    # 1.0f

    .line 44
    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    move/from16 v9, p1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sub-float v9, v8, p2

    .line 51
    .line 52
    :goto_1
    mul-float/2addr v9, v0

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    move/from16 v8, p2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    sub-float v8, v8, p1

    .line 59
    .line 60
    :goto_2
    mul-float/2addr v8, v0

    .line 61
    if-nez p6, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    cmpl-float v1, v1, v0

    .line 65
    .line 66
    if-lez v1, :cond_4

    .line 67
    .line 68
    :goto_3
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-long v0, v0

    .line 73
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    int-to-long v9, v3

    .line 78
    shl-long/2addr v0, v2

    .line 79
    and-long/2addr v9, v5

    .line 80
    or-long v14, v0, v9

    .line 81
    .line 82
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    int-to-long v0, v0

    .line 87
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    int-to-long v3, v3

    .line 92
    shl-long/2addr v0, v2

    .line 93
    and-long v2, v3, v5

    .line 94
    .line 95
    or-long v16, v0, v2

    .line 96
    .line 97
    const/16 v19, 0x0

    .line 98
    .line 99
    const/16 v20, 0x1f0

    .line 100
    .line 101
    move-object/from16 v11, p0

    .line 102
    .line 103
    move-wide/from16 v12, p3

    .line 104
    .line 105
    move/from16 v18, p5

    .line 106
    .line 107
    invoke-static/range {v11 .. v20}, Lsv1;->v0(Lsv1;JJJFII)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    div-float v1, p5, v3

    .line 112
    .line 113
    sub-float/2addr v0, v1

    .line 114
    cmpg-float v3, v9, v1

    .line 115
    .line 116
    if-gez v3, :cond_5

    .line 117
    .line 118
    move v9, v1

    .line 119
    :cond_5
    cmpl-float v3, v9, v0

    .line 120
    .line 121
    if-lez v3, :cond_6

    .line 122
    .line 123
    move v9, v0

    .line 124
    :cond_6
    cmpg-float v3, v8, v1

    .line 125
    .line 126
    if-gez v3, :cond_7

    .line 127
    .line 128
    move v8, v1

    .line 129
    :cond_7
    cmpl-float v1, v8, v0

    .line 130
    .line 131
    if-lez v1, :cond_8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    move v0, v8

    .line 135
    :goto_4
    sub-float v1, p2, p1

    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    const/4 v3, 0x0

    .line 142
    cmpl-float v1, v1, v3

    .line 143
    .line 144
    if-lez v1, :cond_9

    .line 145
    .line 146
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    int-to-long v7, v1

    .line 151
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    int-to-long v9, v1

    .line 156
    shl-long/2addr v7, v2

    .line 157
    and-long/2addr v9, v5

    .line 158
    or-long/2addr v7, v9

    .line 159
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    int-to-long v0, v0

    .line 164
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    int-to-long v3, v3

    .line 169
    shl-long/2addr v0, v2

    .line 170
    and-long v2, v3, v5

    .line 171
    .line 172
    or-long v5, v0, v2

    .line 173
    .line 174
    const/16 v9, 0x1e0

    .line 175
    .line 176
    move-object/from16 v0, p0

    .line 177
    .line 178
    move-wide/from16 v1, p3

    .line 179
    .line 180
    move-wide v3, v7

    .line 181
    move/from16 v7, p5

    .line 182
    .line 183
    move/from16 v8, p6

    .line 184
    .line 185
    invoke-static/range {v0 .. v9}, Lsv1;->v0(Lsv1;JJJFII)V

    .line 186
    .line 187
    .line 188
    :cond_9
    return-void
.end method

.class public final synthetic Ldf4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 21
    iput-byte p7, p0, Ldf4;->X:B

    iput-object p1, p0, Ldf4;->Z:Ljava/lang/Object;

    iput-object p2, p0, Ldf4;->f0:Ljava/lang/Object;

    iput-object p3, p0, Ldf4;->Y:Ljava/lang/Object;

    iput-object p4, p0, Ldf4;->g0:Ljava/lang/Object;

    iput-object p5, p0, Ldf4;->h0:Ljava/lang/Object;

    iput-object p6, p0, Ldf4;->i0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Llg4;Lci4;Lj74;Lpv3;Loh2;Ly05;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Ldf4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldf4;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ldf4;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ldf4;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Ldf4;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ldf4;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Ldf4;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lvo6;Ljava/lang/String;Ltn6;Ljava/lang/String;Lgn2;Lkx4;)V
    .locals 1

    .line 20
    const/4 v0, 0x2

    iput-byte v0, p0, Ldf4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf4;->Z:Ljava/lang/Object;

    iput-object p2, p0, Ldf4;->Y:Ljava/lang/Object;

    iput-object p3, p0, Ldf4;->g0:Ljava/lang/Object;

    iput-object p4, p0, Ldf4;->h0:Ljava/lang/Object;

    iput-object p5, p0, Ldf4;->f0:Ljava/lang/Object;

    iput-object p6, p0, Ldf4;->i0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ldf4;->X:B

    .line 4
    .line 5
    const/16 v3, 0x12

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    sget-object v5, Lzz0;->a:Lbe;

    .line 9
    .line 10
    sget-object v6, Ldn8;->a:Ldn8;

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    iget-object v9, v0, Ldf4;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v10, v0, Ldf4;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v11, v0, Ldf4;->g0:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v12, v0, Ldf4;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v13, v0, Ldf4;->f0:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v0, v0, Ldf4;->Z:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast v0, Lep6;

    .line 29
    .line 30
    move-object v15, v13

    .line 31
    check-cast v15, Lgw5;

    .line 32
    .line 33
    check-cast v12, Lsq6;

    .line 34
    .line 35
    check-cast v11, Lpv3;

    .line 36
    .line 37
    check-cast v10, Llh7;

    .line 38
    .line 39
    check-cast v9, Lo87;

    .line 40
    .line 41
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, Lgg5;

    .line 44
    .line 45
    move-object/from16 v13, p2

    .line 46
    .line 47
    check-cast v13, Llp2;

    .line 48
    .line 49
    move-object/from16 v16, p3

    .line 50
    .line 51
    check-cast v16, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v16

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    and-int/lit8 v17, v16, 0x6

    .line 61
    .line 62
    if-nez v17, :cond_1

    .line 63
    .line 64
    invoke-virtual {v13, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v17

    .line 68
    if-eqz v17, :cond_0

    .line 69
    .line 70
    const/4 v4, 0x4

    .line 71
    :cond_0
    or-int v16, v16, v4

    .line 72
    .line 73
    :cond_1
    and-int/lit8 v4, v16, 0x13

    .line 74
    .line 75
    if-eq v4, v3, :cond_2

    .line 76
    .line 77
    move v3, v8

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const/4 v3, 0x0

    .line 80
    :goto_0
    and-int/lit8 v4, v16, 0x1

    .line 81
    .line 82
    invoke-virtual {v13, v4, v3}, Llp2;->N(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_1d

    .line 87
    .line 88
    sget-object v3, Ly01;->n:Lox1;

    .line 89
    .line 90
    invoke-virtual {v13, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Lz24;

    .line 95
    .line 96
    iget-object v0, v0, Lep6;->h:Lf76;

    .line 97
    .line 98
    invoke-virtual {v13, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    if-ne v8, v5, :cond_4

    .line 109
    .line 110
    :cond_3
    move-object/from16 v17, v15

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move-object v4, v15

    .line 114
    goto :goto_2

    .line 115
    :goto_1
    new-instance v15, Lal5;

    .line 116
    .line 117
    const/16 v21, 0x0

    .line 118
    .line 119
    const/16 v22, 0x6

    .line 120
    .line 121
    const/16 v16, 0x1

    .line 122
    .line 123
    const-class v18, Lgw5;

    .line 124
    .line 125
    const-string v19, "onUiIntent"

    .line 126
    .line 127
    const-string v20, "onUiIntent(Lsu/happ/proxyutility/feature/routing/duplicated_name/ProfileDuplicatedNameUiIntent;)V"

    .line 128
    .line 129
    invoke-direct/range {v15 .. v22}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 130
    .line 131
    .line 132
    move-object/from16 v4, v17

    .line 133
    .line 134
    invoke-virtual {v13, v15}, Llp2;->g0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v8, v15

    .line 138
    :goto_2
    check-cast v8, Lpv3;

    .line 139
    .line 140
    invoke-virtual {v13, v12}, Llp2;->h(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    if-nez v15, :cond_5

    .line 149
    .line 150
    if-ne v7, v5, :cond_6

    .line 151
    .line 152
    :cond_5
    new-instance v7, Lhr5;

    .line 153
    .line 154
    const/16 v15, 0x8

    .line 155
    .line 156
    invoke-direct {v7, v12, v15}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v13, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_6
    check-cast v7, Ldn2;

    .line 163
    .line 164
    check-cast v8, Lgn2;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    sget-object v15, Lpc;->b:Lox1;

    .line 176
    .line 177
    invoke-virtual {v13, v15}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    check-cast v15, Landroid/content/Context;

    .line 182
    .line 183
    sget-object v2, Lpc;->c:Lz01;

    .line 184
    .line 185
    invoke-virtual {v13, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, Landroid/content/res/Resources;

    .line 190
    .line 191
    sget-object v14, Lyc4;->a:Lz01;

    .line 192
    .line 193
    invoke-virtual {v13, v14}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    check-cast v14, Landroid/app/Activity;

    .line 198
    .line 199
    move-object/from16 p1, v4

    .line 200
    .line 201
    sget-object v4, Lly2;->a:Lox1;

    .line 202
    .line 203
    invoke-virtual {v13, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Lky2;

    .line 208
    .line 209
    move-object/from16 v26, v6

    .line 210
    .line 211
    filled-new-array {v0, v15, v2, v14, v4}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-virtual {v13, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v16

    .line 219
    invoke-virtual {v13, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v17

    .line 223
    or-int v16, v16, v17

    .line 224
    .line 225
    invoke-virtual {v13, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v17

    .line 229
    or-int v16, v16, v17

    .line 230
    .line 231
    invoke-virtual {v13, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v17

    .line 235
    or-int v16, v16, v17

    .line 236
    .line 237
    invoke-virtual {v13, v14}, Llp2;->h(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v17

    .line 241
    or-int v16, v16, v17

    .line 242
    .line 243
    invoke-virtual {v13, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v17

    .line 247
    or-int v16, v16, v17

    .line 248
    .line 249
    invoke-virtual {v13, v8}, Llp2;->f(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v17

    .line 253
    or-int v16, v16, v17

    .line 254
    .line 255
    move-object/from16 v17, v0

    .line 256
    .line 257
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-nez v16, :cond_7

    .line 262
    .line 263
    if-ne v0, v5, :cond_8

    .line 264
    .line 265
    :cond_7
    new-instance v16, Lft1;

    .line 266
    .line 267
    const/16 v24, 0x0

    .line 268
    .line 269
    const/16 v25, 0x4

    .line 270
    .line 271
    move-object/from16 v19, v2

    .line 272
    .line 273
    move-object/from16 v18, v4

    .line 274
    .line 275
    move-object/from16 v22, v7

    .line 276
    .line 277
    move-object/from16 v23, v8

    .line 278
    .line 279
    move-object/from16 v21, v14

    .line 280
    .line 281
    move-object/from16 v20, v15

    .line 282
    .line 283
    invoke-direct/range {v16 .. v25}, Lft1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v0, v16

    .line 287
    .line 288
    invoke-virtual {v13, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_8
    check-cast v0, Lrn2;

    .line 292
    .line 293
    invoke-static {v6, v0, v13}, Lu70;->k([Ljava/lang/Object;Lrn2;Llp2;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v10}, Llh7;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, Lsn6;

    .line 301
    .line 302
    move-object v2, v11

    .line 303
    check-cast v2, Lgn2;

    .line 304
    .line 305
    sget-object v14, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 306
    .line 307
    invoke-interface {v1}, Lgg5;->d()F

    .line 308
    .line 309
    .line 310
    move-result v16

    .line 311
    invoke-static {v1, v3}, Los4;->h(Lgg5;Lz24;)F

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    invoke-static {v1, v3}, Los4;->g(Lgg5;Lz24;)F

    .line 316
    .line 317
    .line 318
    move-result v17

    .line 319
    const/16 v18, 0x0

    .line 320
    .line 321
    const/16 v19, 0x8

    .line 322
    .line 323
    invoke-static/range {v14 .. v19}, Los4;->A(Lkx4;FFFFI)Lkx4;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    const/4 v3, 0x0

    .line 328
    invoke-static {v0, v2, v1, v13, v3}, Lzc1;->i(Lsn6;Lgn2;Lkx4;Llp2;I)V

    .line 329
    .line 330
    .line 331
    invoke-interface {v10}, Llh7;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    check-cast v0, Lsn6;

    .line 336
    .line 337
    iget-boolean v0, v0, Lsn6;->k:Z

    .line 338
    .line 339
    if-eqz v0, :cond_d

    .line 340
    .line 341
    const v0, 0x20b5f29d

    .line 342
    .line 343
    .line 344
    invoke-virtual {v13, v0}, Llp2;->W(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v13, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    if-nez v0, :cond_9

    .line 356
    .line 357
    if-ne v1, v5, :cond_a

    .line 358
    .line 359
    :cond_9
    new-instance v1, Laa3;

    .line 360
    .line 361
    const/4 v0, 0x3

    .line 362
    invoke-direct {v1, v11, v0}, Laa3;-><init>(Lpv3;B)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v13, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_a
    move-object/from16 v17, v1

    .line 369
    .line 370
    check-cast v17, Ldn2;

    .line 371
    .line 372
    invoke-virtual {v13, v10}, Llp2;->f(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    invoke-virtual {v13, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    or-int/2addr v0, v1

    .line 381
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    if-nez v0, :cond_b

    .line 386
    .line 387
    if-ne v1, v5, :cond_c

    .line 388
    .line 389
    :cond_b
    new-instance v1, Ld3;

    .line 390
    .line 391
    const/16 v0, 0x10

    .line 392
    .line 393
    invoke-direct {v1, v11, v10, v0}, Ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v13, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_c
    move-object/from16 v18, v1

    .line 400
    .line 401
    check-cast v18, Lgn2;

    .line 402
    .line 403
    const/16 v21, 0x8

    .line 404
    .line 405
    move-object/from16 v19, v9

    .line 406
    .line 407
    move-object/from16 v16, v12

    .line 408
    .line 409
    move-object/from16 v20, v13

    .line 410
    .line 411
    invoke-static/range {v16 .. v21}, Lch3;->e(Lsq6;Ldn2;Lgn2;Lo87;Llp2;I)V

    .line 412
    .line 413
    .line 414
    move-object/from16 v0, v20

    .line 415
    .line 416
    const/4 v3, 0x0

    .line 417
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 418
    .line 419
    .line 420
    goto :goto_3

    .line 421
    :cond_d
    move-object v0, v13

    .line 422
    const/4 v3, 0x0

    .line 423
    const v1, 0x20c3a102

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 430
    .line 431
    .line 432
    :goto_3
    invoke-interface {v10}, Llh7;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, Lsn6;

    .line 437
    .line 438
    iget-object v1, v1, Lsn6;->e:Llw5;

    .line 439
    .line 440
    instance-of v2, v1, Ljw5;

    .line 441
    .line 442
    const/4 v4, 0x0

    .line 443
    if-eqz v2, :cond_e

    .line 444
    .line 445
    const v1, -0x283bb0f7

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 452
    .line 453
    .line 454
    goto :goto_4

    .line 455
    :cond_e
    instance-of v2, v1, Lkw5;

    .line 456
    .line 457
    if-eqz v2, :cond_1c

    .line 458
    .line 459
    const v2, -0x283ba71d

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    if-nez v2, :cond_f

    .line 474
    .line 475
    if-ne v3, v5, :cond_10

    .line 476
    .line 477
    :cond_f
    new-instance v3, Laa3;

    .line 478
    .line 479
    const/4 v2, 0x4

    .line 480
    invoke-direct {v3, v11, v2}, Laa3;-><init>(Lpv3;B)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_10
    check-cast v3, Ldn2;

    .line 487
    .line 488
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v6

    .line 496
    or-int/2addr v2, v6

    .line 497
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    if-nez v2, :cond_11

    .line 502
    .line 503
    if-ne v6, v5, :cond_12

    .line 504
    .line 505
    :cond_11
    new-instance v6, Lzw2;

    .line 506
    .line 507
    const/16 v2, 0x1c

    .line 508
    .line 509
    invoke-direct {v6, v11, v1, v2}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    :cond_12
    check-cast v6, Lgn2;

    .line 516
    .line 517
    const/4 v1, 0x0

    .line 518
    invoke-static {v3, v6, v4, v0, v1}, Lys0;->k(Ldn2;Lgn2;Lkx4;Llp2;I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    .line 522
    .line 523
    .line 524
    :goto_4
    invoke-interface {v10}, Llh7;->getValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    check-cast v1, Lsn6;

    .line 529
    .line 530
    iget-boolean v1, v1, Lsn6;->g:Z

    .line 531
    .line 532
    if-eqz v1, :cond_15

    .line 533
    .line 534
    const v1, 0x20cef3fe

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    if-nez v1, :cond_13

    .line 549
    .line 550
    if-ne v2, v5, :cond_14

    .line 551
    .line 552
    :cond_13
    new-instance v2, Laa3;

    .line 553
    .line 554
    const/4 v1, 0x5

    .line 555
    invoke-direct {v2, v11, v1}, Laa3;-><init>(Lpv3;B)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    :cond_14
    move-object/from16 v16, v2

    .line 562
    .line 563
    check-cast v16, Ldn2;

    .line 564
    .line 565
    const/16 v19, 0x8

    .line 566
    .line 567
    const/16 v20, 0xc

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    move-object/from16 v15, p1

    .line 572
    .line 573
    move-object/from16 v18, v0

    .line 574
    .line 575
    invoke-static/range {v15 .. v20}, Lyn0;->l(Lgw5;Ldn2;Ldn2;Llp2;II)V

    .line 576
    .line 577
    .line 578
    const/4 v3, 0x0

    .line 579
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 580
    .line 581
    .line 582
    goto :goto_5

    .line 583
    :cond_15
    const/4 v3, 0x0

    .line 584
    const v1, 0x20d4a482

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 591
    .line 592
    .line 593
    :goto_5
    invoke-interface {v10}, Llh7;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    check-cast v1, Lsn6;

    .line 598
    .line 599
    iget-object v1, v1, Lsn6;->i:Lbw5;

    .line 600
    .line 601
    instance-of v2, v1, Lxv5;

    .line 602
    .line 603
    if-eqz v2, :cond_16

    .line 604
    .line 605
    const v1, -0x283b25b7

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v3}, Llp2;->p(Z)V

    .line 612
    .line 613
    .line 614
    goto :goto_7

    .line 615
    :cond_16
    instance-of v2, v1, Lzv5;

    .line 616
    .line 617
    if-eqz v2, :cond_1b

    .line 618
    .line 619
    const v2, 0x20d7951b

    .line 620
    .line 621
    .line 622
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    if-nez v2, :cond_17

    .line 634
    .line 635
    if-ne v3, v5, :cond_18

    .line 636
    .line 637
    :cond_17
    new-instance v3, Laa3;

    .line 638
    .line 639
    const/4 v2, 0x6

    .line 640
    invoke-direct {v3, v11, v2}, Laa3;-><init>(Lpv3;B)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v0, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    :cond_18
    check-cast v3, Ldn2;

    .line 647
    .line 648
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v6

    .line 656
    or-int/2addr v2, v6

    .line 657
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    if-nez v2, :cond_19

    .line 662
    .line 663
    if-ne v6, v5, :cond_1a

    .line 664
    .line 665
    :cond_19
    new-instance v6, La23;

    .line 666
    .line 667
    const/16 v2, 0xf

    .line 668
    .line 669
    invoke-direct {v6, v11, v1, v2}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    :cond_1a
    check-cast v6, Ldn2;

    .line 676
    .line 677
    const/4 v1, 0x0

    .line 678
    invoke-static {v3, v6, v4, v0, v1}, Lu70;->l(Ldn2;Ldn2;Lkx4;Llp2;I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    .line 682
    .line 683
    .line 684
    goto :goto_7

    .line 685
    :cond_1b
    const/4 v1, 0x0

    .line 686
    const v2, -0x283b3068

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    .line 693
    .line 694
    .line 695
    invoke-static {}, Lb61;->c()V

    .line 696
    .line 697
    .line 698
    :goto_6
    move-object v6, v4

    .line 699
    goto :goto_8

    .line 700
    :cond_1c
    const/4 v1, 0x0

    .line 701
    const v2, -0x283bbd1d

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v2}, Llp2;->W(I)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v0, v1}, Llp2;->p(Z)V

    .line 708
    .line 709
    .line 710
    invoke-static {}, Lb61;->c()V

    .line 711
    .line 712
    .line 713
    goto :goto_6

    .line 714
    :cond_1d
    move-object/from16 v26, v6

    .line 715
    .line 716
    move-object v0, v13

    .line 717
    invoke-virtual {v0}, Llp2;->Q()V

    .line 718
    .line 719
    .line 720
    :goto_7
    move-object/from16 v6, v26

    .line 721
    .line 722
    :goto_8
    return-object v6

    .line 723
    :pswitch_0
    move-object/from16 v26, v6

    .line 724
    .line 725
    const/4 v2, 0x4

    .line 726
    move-object v7, v0

    .line 727
    check-cast v7, Lvo6;

    .line 728
    .line 729
    iget-object v0, v7, Lvo6;->c:Ljava/lang/String;

    .line 730
    .line 731
    check-cast v12, Ljava/lang/String;

    .line 732
    .line 733
    check-cast v11, Ltn6;

    .line 734
    .line 735
    check-cast v10, Ljava/lang/String;

    .line 736
    .line 737
    check-cast v13, Lgn2;

    .line 738
    .line 739
    check-cast v9, Lkx4;

    .line 740
    .line 741
    move-object/from16 v1, p1

    .line 742
    .line 743
    check-cast v1, Lk44;

    .line 744
    .line 745
    move-object v5, v13

    .line 746
    move-object/from16 v13, p2

    .line 747
    .line 748
    check-cast v13, Llp2;

    .line 749
    .line 750
    move-object/from16 v6, p3

    .line 751
    .line 752
    check-cast v6, Ljava/lang/Integer;

    .line 753
    .line 754
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 755
    .line 756
    .line 757
    move-result v6

    .line 758
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    and-int/lit8 v14, v6, 0x6

    .line 762
    .line 763
    if-nez v14, :cond_1f

    .line 764
    .line 765
    invoke-virtual {v13, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v14

    .line 769
    if-eqz v14, :cond_1e

    .line 770
    .line 771
    move v4, v2

    .line 772
    :cond_1e
    or-int/2addr v6, v4

    .line 773
    :cond_1f
    and-int/lit8 v2, v6, 0x13

    .line 774
    .line 775
    if-eq v2, v3, :cond_20

    .line 776
    .line 777
    move v2, v8

    .line 778
    goto :goto_9

    .line 779
    :cond_20
    const/4 v2, 0x0

    .line 780
    :goto_9
    and-int/lit8 v3, v6, 0x1

    .line 781
    .line 782
    invoke-virtual {v13, v3, v2}, Llp2;->N(IZ)Z

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    if-eqz v2, :cond_23

    .line 787
    .line 788
    if-nez v12, :cond_21

    .line 789
    .line 790
    const/4 v2, 0x0

    .line 791
    goto :goto_a

    .line 792
    :cond_21
    invoke-static {v0, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v2

    .line 796
    :goto_a
    iget-boolean v3, v11, Ltn6;->b:Z

    .line 797
    .line 798
    xor-int/2addr v3, v8

    .line 799
    if-nez v10, :cond_22

    .line 800
    .line 801
    const/4 v10, 0x0

    .line 802
    goto :goto_b

    .line 803
    :cond_22
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v14

    .line 807
    move v10, v14

    .line 808
    :goto_b
    invoke-static {v1, v9}, Ldh3;->p(Lk44;Lkx4;)Lkx4;

    .line 809
    .line 810
    .line 811
    move-result-object v12

    .line 812
    const/4 v14, 0x0

    .line 813
    move v8, v2

    .line 814
    move v9, v3

    .line 815
    move-object v11, v5

    .line 816
    invoke-static/range {v7 .. v14}, Lz51;->h(Lvo6;ZZZLgn2;Lkx4;Llp2;I)V

    .line 817
    .line 818
    .line 819
    goto :goto_c

    .line 820
    :cond_23
    invoke-virtual {v13}, Llp2;->Q()V

    .line 821
    .line 822
    .line 823
    :goto_c
    return-object v26

    .line 824
    :pswitch_1
    move-object/from16 v26, v6

    .line 825
    .line 826
    const/4 v2, 0x4

    .line 827
    move-object v6, v0

    .line 828
    check-cast v6, Llg4;

    .line 829
    .line 830
    check-cast v13, Lci4;

    .line 831
    .line 832
    move-object/from16 v16, v11

    .line 833
    .line 834
    check-cast v16, Lj74;

    .line 835
    .line 836
    move-object v15, v10

    .line 837
    check-cast v15, Lpv3;

    .line 838
    .line 839
    move-object/from16 v18, v12

    .line 840
    .line 841
    check-cast v18, Loh2;

    .line 842
    .line 843
    move-object v0, v9

    .line 844
    check-cast v0, Ly05;

    .line 845
    .line 846
    move-object/from16 v1, p1

    .line 847
    .line 848
    check-cast v1, Lgg5;

    .line 849
    .line 850
    move-object/from16 v10, p2

    .line 851
    .line 852
    check-cast v10, Llp2;

    .line 853
    .line 854
    move-object/from16 v7, p3

    .line 855
    .line 856
    check-cast v7, Ljava/lang/Integer;

    .line 857
    .line 858
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 859
    .line 860
    .line 861
    move-result v7

    .line 862
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    and-int/lit8 v9, v7, 0x6

    .line 866
    .line 867
    if-nez v9, :cond_25

    .line 868
    .line 869
    invoke-virtual {v10, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v9

    .line 873
    if-eqz v9, :cond_24

    .line 874
    .line 875
    move v4, v2

    .line 876
    :cond_24
    or-int/2addr v7, v4

    .line 877
    :cond_25
    and-int/lit8 v2, v7, 0x13

    .line 878
    .line 879
    if-eq v2, v3, :cond_26

    .line 880
    .line 881
    move v14, v8

    .line 882
    goto :goto_d

    .line 883
    :cond_26
    const/4 v14, 0x0

    .line 884
    :goto_d
    and-int/lit8 v2, v7, 0x1

    .line 885
    .line 886
    invoke-virtual {v10, v2, v14}, Llp2;->N(IZ)Z

    .line 887
    .line 888
    .line 889
    move-result v2

    .line 890
    if-eqz v2, :cond_29

    .line 891
    .line 892
    sget-object v7, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 893
    .line 894
    new-instance v14, Lh64;

    .line 895
    .line 896
    const/16 v19, 0x3

    .line 897
    .line 898
    move-object/from16 v17, v1

    .line 899
    .line 900
    invoke-direct/range {v14 .. v19}, Lh64;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 901
    .line 902
    .line 903
    const v1, 0x20f54d69

    .line 904
    .line 905
    .line 906
    invoke-static {v1, v14, v10}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    const/16 v11, 0xdb0

    .line 911
    .line 912
    const/4 v12, 0x0

    .line 913
    move-object v8, v7

    .line 914
    invoke-static/range {v6 .. v12}, Lhi5;->I(Ljava/lang/Object;Lkx4;Lkx4;Lzy0;Llp2;II)V

    .line 915
    .line 916
    .line 917
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    move-object/from16 v20, v0

    .line 922
    .line 923
    check-cast v20, Lng4;

    .line 924
    .line 925
    iget-object v14, v13, Lci4;->f:Lf76;

    .line 926
    .line 927
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    sget-object v0, Lpc;->b:Lox1;

    .line 937
    .line 938
    invoke-virtual {v10, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    move-object v15, v0

    .line 943
    check-cast v15, Landroid/content/Context;

    .line 944
    .line 945
    sget-object v0, Lyc4;->a:Lz01;

    .line 946
    .line 947
    invoke-virtual {v10, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    move-object/from16 v19, v0

    .line 952
    .line 953
    check-cast v19, Landroid/app/Activity;

    .line 954
    .line 955
    sget-object v0, Lpc;->c:Lz01;

    .line 956
    .line 957
    invoke-virtual {v10, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    move-object/from16 v17, v0

    .line 962
    .line 963
    check-cast v17, Landroid/content/res/Resources;

    .line 964
    .line 965
    sget-object v0, Lly2;->a:Lox1;

    .line 966
    .line 967
    invoke-virtual {v10, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    move-object/from16 v18, v0

    .line 972
    .line 973
    check-cast v18, Lky2;

    .line 974
    .line 975
    move-object/from16 v27, v19

    .line 976
    .line 977
    move-object/from16 v19, v16

    .line 978
    .line 979
    move-object/from16 v16, v27

    .line 980
    .line 981
    filled-new-array/range {v14 .. v20}, [Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    move-object/from16 v2, v16

    .line 986
    .line 987
    move-object/from16 v3, v17

    .line 988
    .line 989
    move-object/from16 v4, v18

    .line 990
    .line 991
    move-object/from16 v11, v19

    .line 992
    .line 993
    move-object/from16 v1, v20

    .line 994
    .line 995
    invoke-virtual {v10, v14}, Llp2;->h(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v6

    .line 999
    invoke-virtual {v10, v15}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v7

    .line 1003
    or-int/2addr v6, v7

    .line 1004
    invoke-virtual {v10, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v7

    .line 1008
    or-int/2addr v6, v7

    .line 1009
    invoke-virtual {v10, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v7

    .line 1013
    or-int/2addr v6, v7

    .line 1014
    invoke-virtual {v10, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v7

    .line 1018
    or-int/2addr v6, v7

    .line 1019
    invoke-virtual {v10, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v7

    .line 1023
    or-int/2addr v6, v7

    .line 1024
    invoke-virtual {v10, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v7

    .line 1028
    or-int/2addr v6, v7

    .line 1029
    invoke-virtual {v10}, Llp2;->K()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v7

    .line 1033
    if-nez v6, :cond_27

    .line 1034
    .line 1035
    if-ne v7, v5, :cond_28

    .line 1036
    .line 1037
    :cond_27
    move-object/from16 v16, v15

    .line 1038
    .line 1039
    move-object v15, v14

    .line 1040
    new-instance v14, Lft1;

    .line 1041
    .line 1042
    const/16 v22, 0x0

    .line 1043
    .line 1044
    const/16 v23, 0x3

    .line 1045
    .line 1046
    move-object/from16 v20, v1

    .line 1047
    .line 1048
    move-object/from16 v19, v2

    .line 1049
    .line 1050
    move-object/from16 v18, v3

    .line 1051
    .line 1052
    move-object/from16 v17, v4

    .line 1053
    .line 1054
    move-object/from16 v21, v11

    .line 1055
    .line 1056
    invoke-direct/range {v14 .. v23}, Lft1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v10, v14}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1060
    .line 1061
    .line 1062
    move-object v7, v14

    .line 1063
    :cond_28
    check-cast v7, Lrn2;

    .line 1064
    .line 1065
    invoke-static {v0, v7, v10}, Lu70;->k([Ljava/lang/Object;Lrn2;Llp2;)V

    .line 1066
    .line 1067
    .line 1068
    goto :goto_e

    .line 1069
    :cond_29
    invoke-virtual {v10}, Llp2;->Q()V

    .line 1070
    .line 1071
    .line 1072
    :goto_e
    return-object v26

    .line 1073
    :pswitch_2
    move-object/from16 v26, v6

    .line 1074
    .line 1075
    move-object v6, v0

    .line 1076
    check-cast v6, Llf4;

    .line 1077
    .line 1078
    check-cast v13, Lgn2;

    .line 1079
    .line 1080
    check-cast v12, Loh2;

    .line 1081
    .line 1082
    move-object v3, v11

    .line 1083
    check-cast v3, Lb71;

    .line 1084
    .line 1085
    move-object v4, v10

    .line 1086
    check-cast v4, Ldn2;

    .line 1087
    .line 1088
    move-object v2, v9

    .line 1089
    check-cast v2, Lla;

    .line 1090
    .line 1091
    move-object/from16 v0, p1

    .line 1092
    .line 1093
    check-cast v0, Ll80;

    .line 1094
    .line 1095
    move-object/from16 v7, p2

    .line 1096
    .line 1097
    check-cast v7, Llp2;

    .line 1098
    .line 1099
    move-object/from16 v1, p3

    .line 1100
    .line 1101
    check-cast v1, Ljava/lang/Integer;

    .line 1102
    .line 1103
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1104
    .line 1105
    .line 1106
    move-result v1

    .line 1107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    and-int/lit8 v0, v1, 0x11

    .line 1111
    .line 1112
    const/16 v9, 0x10

    .line 1113
    .line 1114
    if-eq v0, v9, :cond_2a

    .line 1115
    .line 1116
    move v0, v8

    .line 1117
    goto :goto_f

    .line 1118
    :cond_2a
    const/4 v0, 0x0

    .line 1119
    :goto_f
    and-int/2addr v1, v8

    .line 1120
    invoke-virtual {v7, v1, v0}, Llp2;->N(IZ)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v0

    .line 1124
    if-eqz v0, :cond_2f

    .line 1125
    .line 1126
    invoke-virtual {v7, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    invoke-virtual {v7, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v1

    .line 1134
    or-int/2addr v0, v1

    .line 1135
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v1

    .line 1139
    if-nez v0, :cond_2b

    .line 1140
    .line 1141
    if-ne v1, v5, :cond_2c

    .line 1142
    .line 1143
    :cond_2b
    new-instance v1, Lff4;

    .line 1144
    .line 1145
    const/4 v0, 0x0

    .line 1146
    invoke-direct {v1, v13, v6, v0}, Lff4;-><init>(Lgn2;Llf4;B)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v7, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    :cond_2c
    move-object v0, v1

    .line 1153
    check-cast v0, Ldn2;

    .line 1154
    .line 1155
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 1156
    .line 1157
    invoke-static {v1, v12}, Lzc1;->I(Lkx4;Loh2;)Lkx4;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v8

    .line 1161
    invoke-virtual {v7, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v1

    .line 1165
    invoke-virtual {v7, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v9

    .line 1169
    or-int/2addr v1, v9

    .line 1170
    invoke-virtual {v7, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v9

    .line 1174
    or-int/2addr v1, v9

    .line 1175
    invoke-virtual {v7, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v9

    .line 1179
    or-int/2addr v1, v9

    .line 1180
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v9

    .line 1184
    if-nez v1, :cond_2d

    .line 1185
    .line 1186
    if-ne v9, v5, :cond_2e

    .line 1187
    .line 1188
    :cond_2d
    new-instance v1, Lhf4;

    .line 1189
    .line 1190
    move-object v5, v13

    .line 1191
    invoke-direct/range {v1 .. v6}, Lhf4;-><init>(Lla;Lb71;Ldn2;Lgn2;Llf4;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v7, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    move-object v9, v1

    .line 1198
    :cond_2e
    check-cast v9, Lgn2;

    .line 1199
    .line 1200
    invoke-static {v8, v9}, Lmb6;->S(Lkx4;Lgn2;)Lkx4;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    const/4 v3, 0x0

    .line 1205
    invoke-static {v6, v0, v1, v7, v3}, Ljm4;->k(Llf4;Ldn2;Lkx4;Llp2;I)V

    .line 1206
    .line 1207
    .line 1208
    goto :goto_10

    .line 1209
    :cond_2f
    invoke-virtual {v7}, Llp2;->Q()V

    .line 1210
    .line 1211
    .line 1212
    :goto_10
    return-object v26

    .line 1213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lkh;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lkd8;

.field public final synthetic b:Ls73;

.field public final synthetic c:Lmj0;

.field public final synthetic d:Lgn2;

.field public final synthetic e:Lf81;

.field public final synthetic f:Ly78;

.field public final synthetic g:Ldn2;

.field public final synthetic h:Lfw8;

.field public final synthetic i:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lkd8;Ls73;Lmj0;Lgn2;Lf81;Ly78;Ldn2;Lfw8;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkh;->a:Lkd8;

    .line 5
    .line 6
    iput-object p2, p0, Lkh;->b:Ls73;

    .line 7
    .line 8
    iput-object p3, p0, Lkh;->c:Lmj0;

    .line 9
    .line 10
    iput-object p4, p0, Lkh;->d:Lgn2;

    .line 11
    .line 12
    iput-object p5, p0, Lkh;->e:Lf81;

    .line 13
    .line 14
    iput-object p6, p0, Lkh;->f:Ly78;

    .line 15
    .line 16
    iput-object p7, p0, Lkh;->g:Ldn2;

    .line 17
    .line 18
    iput-object p8, p0, Lkh;->h:Lfw8;

    .line 19
    .line 20
    iput-object p9, p0, Lkh;->i:Lgn2;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)Ldi7;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v3, Leb9;

    .line 6
    .line 7
    iget-object v4, v0, Lkh;->a:Lkd8;

    .line 8
    .line 9
    invoke-direct {v3, v4}, Leb9;-><init>(Lkd8;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lt6;

    .line 13
    .line 14
    iget-object v5, v0, Lkh;->c:Lmj0;

    .line 15
    .line 16
    iget-object v6, v0, Lkh;->d:Lgn2;

    .line 17
    .line 18
    iget-object v7, v0, Lkh;->e:Lf81;

    .line 19
    .line 20
    iget-object v8, v0, Lkh;->f:Ly78;

    .line 21
    .line 22
    iget-object v9, v0, Lkh;->g:Ldn2;

    .line 23
    .line 24
    iget-object v10, v0, Lkh;->h:Lfw8;

    .line 25
    .line 26
    iget-object v11, v0, Lkh;->i:Lgn2;

    .line 27
    .line 28
    invoke-direct/range {v2 .. v11}, Lt6;-><init>(Leb9;Lkd8;Lmj0;Lgn2;Lf81;Ly78;Ldn2;Lfw8;Lgn2;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Lkd8;->d()Lh48;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v4}, Lkd8;->d()Lh48;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-wide v4, v4, Lh48;->f0:J

    .line 40
    .line 41
    iget-object v0, v0, Lkh;->b:Ls73;

    .line 42
    .line 43
    iget v6, v0, Ls73;->e:I

    .line 44
    .line 45
    iget v7, v0, Ls73;->d:I

    .line 46
    .line 47
    iget-boolean v8, v0, Ls73;->a:Z

    .line 48
    .line 49
    const/4 v10, 0x5

    .line 50
    const/4 v12, 0x4

    .line 51
    const/4 v13, 0x7

    .line 52
    const/4 v14, 0x6

    .line 53
    const/4 v15, 0x3

    .line 54
    const/4 v11, 0x2

    .line 55
    const/4 v9, 0x1

    .line 56
    if-ne v6, v9, :cond_1

    .line 57
    .line 58
    if-eqz v8, :cond_0

    .line 59
    .line 60
    :goto_0
    move v6, v14

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    const/4 v6, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    if-nez v6, :cond_2

    .line 65
    .line 66
    move v6, v9

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    if-ne v6, v11, :cond_3

    .line 69
    .line 70
    move v6, v11

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    if-ne v6, v14, :cond_4

    .line 73
    .line 74
    move v6, v10

    .line 75
    goto :goto_1

    .line 76
    :cond_4
    if-ne v6, v10, :cond_5

    .line 77
    .line 78
    move v6, v13

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    if-ne v6, v15, :cond_6

    .line 81
    .line 82
    move v6, v15

    .line 83
    goto :goto_1

    .line 84
    :cond_6
    if-ne v6, v12, :cond_7

    .line 85
    .line 86
    move v6, v12

    .line 87
    goto :goto_1

    .line 88
    :cond_7
    if-ne v6, v13, :cond_34

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    iput v6, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 92
    .line 93
    iget-object v6, v0, Ls73;->f:Lge4;

    .line 94
    .line 95
    sget-object v13, Lge4;->Z:Lge4;

    .line 96
    .line 97
    invoke-static {v6, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    const/16 v14, 0xa

    .line 102
    .line 103
    if-eqz v13, :cond_8

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    iput-object v13, v1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    new-instance v13, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-static {v6, v14}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    iget-object v6, v6, Lge4;->X:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    if-eqz v10, :cond_9

    .line 129
    .line 130
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    check-cast v10, Lce4;

    .line 135
    .line 136
    iget-object v10, v10, Lce4;->a:Ljava/util/Locale;

    .line 137
    .line 138
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_9
    const/4 v10, 0x0

    .line 143
    new-array v6, v10, [Ljava/util/Locale;

    .line 144
    .line 145
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    check-cast v6, [Ljava/util/Locale;

    .line 150
    .line 151
    array-length v10, v6

    .line 152
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, [Ljava/util/Locale;

    .line 157
    .line 158
    new-instance v10, Landroid/os/LocaleList;

    .line 159
    .line 160
    invoke-direct {v10, v6}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 161
    .line 162
    .line 163
    iput-object v10, v1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    .line 164
    .line 165
    :goto_3
    const/16 v10, 0x18

    .line 166
    .line 167
    const/16 v13, 0x17

    .line 168
    .line 169
    const/16 v6, 0x8

    .line 170
    .line 171
    if-ne v7, v9, :cond_a

    .line 172
    .line 173
    :goto_4
    move v12, v9

    .line 174
    goto/16 :goto_6

    .line 175
    .line 176
    :cond_a
    if-ne v7, v11, :cond_b

    .line 177
    .line 178
    iget v12, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 179
    .line 180
    const/high16 v16, -0x80000000

    .line 181
    .line 182
    or-int v12, v12, v16

    .line 183
    .line 184
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_b
    if-ne v7, v15, :cond_c

    .line 188
    .line 189
    move v12, v11

    .line 190
    goto/16 :goto_6

    .line 191
    .line 192
    :cond_c
    if-ne v7, v12, :cond_d

    .line 193
    .line 194
    :goto_5
    move v12, v15

    .line 195
    goto/16 :goto_6

    .line 196
    .line 197
    :cond_d
    const/16 v12, 0x11

    .line 198
    .line 199
    const/4 v15, 0x5

    .line 200
    if-ne v7, v15, :cond_e

    .line 201
    .line 202
    goto/16 :goto_6

    .line 203
    .line 204
    :cond_e
    const/4 v15, 0x6

    .line 205
    if-ne v7, v15, :cond_f

    .line 206
    .line 207
    const/16 v12, 0x21

    .line 208
    .line 209
    goto/16 :goto_6

    .line 210
    .line 211
    :cond_f
    const/4 v15, 0x7

    .line 212
    if-ne v7, v15, :cond_10

    .line 213
    .line 214
    const/16 v12, 0x81

    .line 215
    .line 216
    goto/16 :goto_6

    .line 217
    .line 218
    :cond_10
    const/16 v15, 0x12

    .line 219
    .line 220
    if-ne v7, v6, :cond_11

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_11
    const/16 v6, 0x9

    .line 224
    .line 225
    if-ne v7, v6, :cond_12

    .line 226
    .line 227
    const/16 v12, 0x2002

    .line 228
    .line 229
    goto/16 :goto_6

    .line 230
    .line 231
    :cond_12
    if-ne v7, v14, :cond_13

    .line 232
    .line 233
    const/16 v12, 0x91

    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :cond_13
    const/16 v6, 0xb

    .line 238
    .line 239
    if-ne v7, v6, :cond_14

    .line 240
    .line 241
    const/16 v12, 0x71

    .line 242
    .line 243
    goto/16 :goto_6

    .line 244
    .line 245
    :cond_14
    const/16 v6, 0xc

    .line 246
    .line 247
    if-ne v7, v6, :cond_15

    .line 248
    .line 249
    const/16 v12, 0x61

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_15
    const/16 v6, 0xd

    .line 253
    .line 254
    if-ne v7, v6, :cond_16

    .line 255
    .line 256
    const/16 v12, 0x31

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_16
    const/16 v6, 0xe

    .line 260
    .line 261
    if-ne v7, v6, :cond_17

    .line 262
    .line 263
    const/16 v12, 0x41

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_17
    const/16 v6, 0xf

    .line 267
    .line 268
    if-ne v7, v6, :cond_18

    .line 269
    .line 270
    const/16 v12, 0x51

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_18
    const/16 v6, 0x10

    .line 274
    .line 275
    if-ne v7, v6, :cond_19

    .line 276
    .line 277
    const/16 v12, 0xb1

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_19
    if-ne v7, v12, :cond_1a

    .line 281
    .line 282
    const/16 v12, 0xc1

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_1a
    if-ne v7, v15, :cond_1b

    .line 286
    .line 287
    const/4 v12, 0x4

    .line 288
    goto :goto_6

    .line 289
    :cond_1b
    const/16 v6, 0x13

    .line 290
    .line 291
    const/16 v12, 0x14

    .line 292
    .line 293
    if-ne v7, v6, :cond_1c

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_1c
    if-ne v7, v12, :cond_1d

    .line 297
    .line 298
    const/16 v12, 0x24

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_1d
    const/16 v6, 0x15

    .line 302
    .line 303
    if-ne v7, v6, :cond_1e

    .line 304
    .line 305
    const/16 v12, 0x1002

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_1e
    const/16 v6, 0x16

    .line 309
    .line 310
    if-ne v7, v6, :cond_1f

    .line 311
    .line 312
    const/16 v12, 0x3002

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_1f
    if-ne v7, v13, :cond_20

    .line 316
    .line 317
    const/16 v12, 0x2012

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_20
    if-ne v7, v10, :cond_21

    .line 321
    .line 322
    const/16 v12, 0x1012

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_21
    const/16 v6, 0x19

    .line 326
    .line 327
    if-ne v7, v6, :cond_33

    .line 328
    .line 329
    const/16 v12, 0x3012

    .line 330
    .line 331
    :goto_6
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 332
    .line 333
    if-nez v8, :cond_22

    .line 334
    .line 335
    and-int/lit8 v6, v12, 0xf

    .line 336
    .line 337
    if-ne v6, v9, :cond_22

    .line 338
    .line 339
    const/high16 v6, 0x20000

    .line 340
    .line 341
    or-int/2addr v12, v6

    .line 342
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 343
    .line 344
    iget v6, v0, Ls73;->e:I

    .line 345
    .line 346
    if-ne v6, v9, :cond_22

    .line 347
    .line 348
    iget v6, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 349
    .line 350
    const/high16 v8, 0x40000000    # 2.0f

    .line 351
    .line 352
    or-int/2addr v6, v8

    .line 353
    iput v6, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 354
    .line 355
    :cond_22
    and-int/lit8 v6, v12, 0xf

    .line 356
    .line 357
    if-ne v6, v9, :cond_27

    .line 358
    .line 359
    iget v6, v0, Ls73;->b:I

    .line 360
    .line 361
    if-ne v6, v9, :cond_23

    .line 362
    .line 363
    or-int/lit16 v12, v12, 0x1000

    .line 364
    .line 365
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 366
    .line 367
    goto :goto_7

    .line 368
    :cond_23
    if-ne v6, v11, :cond_24

    .line 369
    .line 370
    or-int/lit16 v12, v12, 0x2000

    .line 371
    .line 372
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_24
    const/4 v8, 0x3

    .line 376
    if-ne v6, v8, :cond_25

    .line 377
    .line 378
    or-int/lit16 v12, v12, 0x4000

    .line 379
    .line 380
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 381
    .line 382
    :cond_25
    :goto_7
    iget-boolean v0, v0, Ls73;->c:Z

    .line 383
    .line 384
    if-eqz v0, :cond_26

    .line 385
    .line 386
    const v0, 0x8000

    .line 387
    .line 388
    .line 389
    or-int/2addr v12, v0

    .line 390
    iput v12, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 391
    .line 392
    :cond_26
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 393
    .line 394
    const/16 v6, 0x25

    .line 395
    .line 396
    if-lt v0, v6, :cond_27

    .line 397
    .line 398
    const/high16 v0, 0x200000

    .line 399
    .line 400
    or-int/2addr v0, v12

    .line 401
    iput v0, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 402
    .line 403
    :cond_27
    sget v0, Lf88;->c:I

    .line 404
    .line 405
    const/16 v0, 0x20

    .line 406
    .line 407
    shr-long v11, v4, v0

    .line 408
    .line 409
    long-to-int v0, v11

    .line 410
    iput v0, v1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 411
    .line 412
    const-wide v11, 0xffffffffL

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    and-long/2addr v4, v11

    .line 418
    long-to-int v0, v4

    .line 419
    iput v0, v1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 420
    .line 421
    invoke-static {v1, v3}, Lpy1;->d(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 422
    .line 423
    .line 424
    iget v0, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 425
    .line 426
    const/high16 v3, 0x2000000

    .line 427
    .line 428
    or-int/2addr v0, v3

    .line 429
    iput v0, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 430
    .line 431
    sget-boolean v0, Ltm7;->a:Z

    .line 432
    .line 433
    const-string v3, "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"

    .line 434
    .line 435
    const/16 v4, 0x23

    .line 436
    .line 437
    if-eqz v0, :cond_30

    .line 438
    .line 439
    const/4 v15, 0x7

    .line 440
    if-ne v7, v15, :cond_28

    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_28
    if-ne v7, v14, :cond_29

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :cond_29
    const/16 v0, 0x8

    .line 447
    .line 448
    if-ne v7, v0, :cond_2a

    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_2a
    if-ne v7, v13, :cond_2b

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_2b
    if-ne v7, v10, :cond_2c

    .line 455
    .line 456
    goto :goto_8

    .line 457
    :cond_2c
    const/16 v6, 0x19

    .line 458
    .line 459
    if-ne v7, v6, :cond_2d

    .line 460
    .line 461
    goto :goto_8

    .line 462
    :cond_2d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 463
    .line 464
    if-lt v0, v4, :cond_2e

    .line 465
    .line 466
    invoke-static {v1, v9}, Lnn;->i(Landroid/view/inputmethod/EditorInfo;Z)V

    .line 467
    .line 468
    .line 469
    :cond_2e
    iget-object v0, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 470
    .line 471
    if-nez v0, :cond_2f

    .line 472
    .line 473
    new-instance v0, Landroid/os/Bundle;

    .line 474
    .line 475
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 476
    .line 477
    .line 478
    iput-object v0, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 479
    .line 480
    :cond_2f
    invoke-virtual {v0, v3, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 481
    .line 482
    .line 483
    invoke-static {v1}, Lu3;->E(Landroid/view/inputmethod/EditorInfo;)V

    .line 484
    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_30
    :goto_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 488
    .line 489
    const/4 v10, 0x0

    .line 490
    if-lt v0, v4, :cond_31

    .line 491
    .line 492
    invoke-static {v1, v10}, Lnn;->i(Landroid/view/inputmethod/EditorInfo;Z)V

    .line 493
    .line 494
    .line 495
    :cond_31
    iget-object v0, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 496
    .line 497
    if-nez v0, :cond_32

    .line 498
    .line 499
    new-instance v0, Landroid/os/Bundle;

    .line 500
    .line 501
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 502
    .line 503
    .line 504
    iput-object v0, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 505
    .line 506
    :cond_32
    invoke-virtual {v0, v3, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 507
    .line 508
    .line 509
    :goto_9
    new-instance v0, Ldi7;

    .line 510
    .line 511
    invoke-direct {v0, v2, v1}, Ldi7;-><init>(Lt6;Landroid/view/inputmethod/EditorInfo;)V

    .line 512
    .line 513
    .line 514
    return-object v0

    .line 515
    :cond_33
    const-string v0, "Invalid Keyboard Type"

    .line 516
    .line 517
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    const/16 v16, 0x0

    .line 521
    .line 522
    return-object v16

    .line 523
    :cond_34
    const/16 v16, 0x0

    .line 524
    .line 525
    const-string v0, "invalid ImeAction"

    .line 526
    .line 527
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    return-object v16
.end method

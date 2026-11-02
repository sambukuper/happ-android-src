.class public final Lhk8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lhk8;


# instance fields
.field public final a:Lef8;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lhk8;

    .line 2
    .line 3
    invoke-direct {v0}, Lhk8;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhk8;->b:Lhk8;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    new-instance v1, Ljava/util/MissingResourceException;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, ""

    .line 17
    .line 18
    invoke-direct {v1, v0, v2, v2}, Ljava/util/MissingResourceException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v1
.end method

.method public constructor <init>()V
    .locals 18

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "uprops.icu"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v1, v0, v2}, Lb33;->e(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    new-instance v0, Ls18;

    .line 13
    .line 14
    const/4 v4, 0x7

    .line 15
    invoke-direct {v0, v4}, Ls18;-><init>(B)V

    .line 16
    .line 17
    .line 18
    const v4, 0x5550726f

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v4, v0}, Lb33;->h(Ljava/nio/ByteBuffer;ILy23;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    ushr-int/lit8 v4, v0, 0x18

    .line 26
    .line 27
    shr-int/lit8 v5, v0, 0x10

    .line 28
    .line 29
    and-int/lit16 v5, v5, 0xff

    .line 30
    .line 31
    shr-int/lit8 v6, v0, 0x8

    .line 32
    .line 33
    and-int/lit16 v6, v6, 0xff

    .line 34
    .line 35
    and-int/lit16 v0, v0, 0xff

    .line 36
    .line 37
    invoke-static {v4, v5, v6, v0}, Lbv8;->a(IIII)Lbv8;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 84
    .line 85
    .line 86
    const/16 v10, 0xc

    .line 87
    .line 88
    invoke-static {v10, v3}, Lb33;->i(ILjava/nio/ByteBuffer;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v3}, Lef8;->f(Ljava/nio/ByteBuffer;)Lef8;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    move-object/from16 v11, p0

    .line 96
    .line 97
    iput-object v10, v11, Lhk8;->a:Lef8;

    .line 98
    .line 99
    add-int/lit8 v11, v0, -0x10

    .line 100
    .line 101
    mul-int/lit8 v11, v11, 0x4

    .line 102
    .line 103
    iget-object v12, v10, Ldf8;->X:Lcf8;

    .line 104
    .line 105
    iget v12, v12, Lcf8;->b:I

    .line 106
    .line 107
    iget v10, v10, Ldf8;->h0:I

    .line 108
    .line 109
    add-int/2addr v12, v10

    .line 110
    const/4 v10, 0x2

    .line 111
    mul-int/2addr v12, v10

    .line 112
    const/16 v13, 0x10

    .line 113
    .line 114
    add-int/2addr v12, v13

    .line 115
    if-gt v12, v11, :cond_16

    .line 116
    .line 117
    sub-int/2addr v11, v12

    .line 118
    invoke-static {v11, v3}, Lb33;->i(ILjava/nio/ByteBuffer;)V

    .line 119
    .line 120
    .line 121
    sub-int v0, v4, v0

    .line 122
    .line 123
    mul-int/lit8 v0, v0, 0x4

    .line 124
    .line 125
    invoke-static {v0, v3}, Lb33;->i(ILjava/nio/ByteBuffer;)V

    .line 126
    .line 127
    .line 128
    if-lez v6, :cond_1

    .line 129
    .line 130
    invoke-static {v3}, Lef8;->f(Ljava/nio/ByteBuffer;)Lef8;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sub-int v4, v5, v4

    .line 135
    .line 136
    mul-int/lit8 v4, v4, 0x4

    .line 137
    .line 138
    iget-object v6, v0, Ldf8;->X:Lcf8;

    .line 139
    .line 140
    iget v6, v6, Lcf8;->b:I

    .line 141
    .line 142
    iget v0, v0, Ldf8;->h0:I

    .line 143
    .line 144
    add-int/2addr v6, v0

    .line 145
    mul-int/2addr v6, v10

    .line 146
    add-int/2addr v6, v13

    .line 147
    if-gt v6, v4, :cond_0

    .line 148
    .line 149
    sub-int/2addr v4, v6

    .line 150
    invoke-static {v4, v3}, Lb33;->i(ILjava/nio/ByteBuffer;)V

    .line 151
    .line 152
    .line 153
    sub-int v0, v7, v5

    .line 154
    .line 155
    invoke-static {v0, v3}, Lb33;->f(ILjava/nio/ByteBuffer;)[I

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_0
    const-string v0, "uprops.icu: not enough bytes for additional-properties trie"

    .line 160
    .line 161
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_1
    :goto_0
    sub-int v0, v8, v7

    .line 166
    .line 167
    mul-int/2addr v0, v10

    .line 168
    if-lez v0, :cond_2

    .line 169
    .line 170
    invoke-static {v0, v3}, Lb33;->d(ILjava/nio/ByteBuffer;)[C

    .line 171
    .line 172
    .line 173
    :cond_2
    sub-int/2addr v9, v8

    .line 174
    mul-int/lit8 v9, v9, 0x4

    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    :try_start_0
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-lt v4, v13, :cond_15

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const v5, 0x33697254

    .line 195
    .line 196
    .line 197
    if-eq v4, v5, :cond_4

    .line 198
    .line 199
    const v5, 0x54726933

    .line 200
    .line 201
    .line 202
    if-ne v4, v5, :cond_3

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_3
    new-instance v0, La43;

    .line 206
    .line 207
    const-string v2, "Buffer does not contain a serialized CodePointTrie"

    .line 208
    .line 209
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    goto/16 :goto_6

    .line 215
    .line 216
    :cond_4
    sget-object v4, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 217
    .line 218
    if-ne v1, v4, :cond_5

    .line 219
    .line 220
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 221
    .line 222
    :cond_5
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 223
    .line 224
    .line 225
    :goto_1
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getChar()C

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getChar()C

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getChar()C

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getChar()C

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getChar()C

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getChar()C

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    shr-int/lit8 v11, v4, 0x6

    .line 250
    .line 251
    const/4 v12, 0x3

    .line 252
    and-int/2addr v11, v12

    .line 253
    if-eqz v11, :cond_7

    .line 254
    .line 255
    if-ne v11, v2, :cond_6

    .line 256
    .line 257
    move v11, v10

    .line 258
    goto :goto_2

    .line 259
    :cond_6
    new-instance v0, La43;

    .line 260
    .line 261
    const-string v2, "CodePointTrie data header has an unsupported type"

    .line 262
    .line 263
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :cond_7
    move v11, v2

    .line 268
    :goto_2
    and-int/lit8 v13, v4, 0x7

    .line 269
    .line 270
    if-eqz v13, :cond_a

    .line 271
    .line 272
    if-eq v13, v2, :cond_9

    .line 273
    .line 274
    if-ne v13, v10, :cond_8

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_8
    new-instance v0, La43;

    .line 278
    .line 279
    const-string v2, "CodePointTrie data header has an unsupported value width"

    .line 280
    .line 281
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :cond_9
    move v12, v10

    .line 286
    goto :goto_3

    .line 287
    :cond_a
    move v12, v2

    .line 288
    :goto_3
    and-int/lit8 v13, v4, 0x38

    .line 289
    .line 290
    if-nez v13, :cond_14

    .line 291
    .line 292
    if-ne v2, v12, :cond_13

    .line 293
    .line 294
    const v12, 0xf000

    .line 295
    .line 296
    .line 297
    and-int/2addr v12, v4

    .line 298
    shl-int/lit8 v12, v12, 0x4

    .line 299
    .line 300
    or-int/2addr v6, v12

    .line 301
    and-int/lit16 v4, v4, 0xf00

    .line 302
    .line 303
    shl-int/lit8 v4, v4, 0x8

    .line 304
    .line 305
    or-int v16, v7, v4

    .line 306
    .line 307
    shl-int/lit8 v14, v8, 0x9

    .line 308
    .line 309
    mul-int/lit8 v4, v5, 0x2

    .line 310
    .line 311
    mul-int/lit8 v7, v6, 0x2

    .line 312
    .line 313
    add-int/2addr v7, v4

    .line 314
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-lt v4, v7, :cond_12

    .line 319
    .line 320
    invoke-static {v5, v3}, Lb33;->d(ILjava/nio/ByteBuffer;)[C

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    invoke-static {v2}, Lp61;->B(I)I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_f

    .line 329
    .line 330
    if-eq v4, v2, :cond_d

    .line 331
    .line 332
    if-ne v4, v10, :cond_c

    .line 333
    .line 334
    new-array v4, v6, [B

    .line 335
    .line 336
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 337
    .line 338
    .line 339
    if-ne v11, v2, :cond_b

    .line 340
    .line 341
    new-instance v11, Ldv0;

    .line 342
    .line 343
    new-instance v13, Lcv0;

    .line 344
    .line 345
    invoke-direct {v13, v4, v10}, Lcv0;-><init>(Ljava/lang/Object;B)V

    .line 346
    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    invoke-direct/range {v11 .. v17}, Lev0;-><init>([CLpu;IIIB)V

    .line 351
    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_b
    new-instance v11, Lfv0;

    .line 355
    .line 356
    new-instance v13, Lcv0;

    .line 357
    .line 358
    invoke-direct {v13, v4, v10}, Lcv0;-><init>(Ljava/lang/Object;B)V

    .line 359
    .line 360
    .line 361
    const/16 v17, 0x1

    .line 362
    .line 363
    invoke-direct/range {v11 .. v17}, Lev0;-><init>([CLpu;IIIB)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    .line 365
    .line 366
    :goto_4
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 367
    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_c
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 371
    .line 372
    const-string v2, "should be unreachable"

    .line 373
    .line 374
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    throw v0

    .line 378
    :cond_d
    invoke-static {v6, v3}, Lb33;->f(ILjava/nio/ByteBuffer;)[I

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    if-ne v11, v2, :cond_e

    .line 383
    .line 384
    new-instance v11, Ldv0;

    .line 385
    .line 386
    new-instance v13, Lcv0;

    .line 387
    .line 388
    invoke-direct {v13, v4, v2}, Lcv0;-><init>(Ljava/lang/Object;B)V

    .line 389
    .line 390
    .line 391
    const/16 v17, 0x0

    .line 392
    .line 393
    invoke-direct/range {v11 .. v17}, Lev0;-><init>([CLpu;IIIB)V

    .line 394
    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_e
    new-instance v11, Lfv0;

    .line 398
    .line 399
    new-instance v13, Lcv0;

    .line 400
    .line 401
    invoke-direct {v13, v4, v2}, Lcv0;-><init>(Ljava/lang/Object;B)V

    .line 402
    .line 403
    .line 404
    const/16 v17, 0x1

    .line 405
    .line 406
    invoke-direct/range {v11 .. v17}, Lev0;-><init>([CLpu;IIIB)V

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_f
    invoke-static {v6, v3}, Lb33;->d(ILjava/nio/ByteBuffer;)[C

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    const/4 v5, 0x0

    .line 415
    if-ne v11, v2, :cond_10

    .line 416
    .line 417
    new-instance v11, Ldv0;

    .line 418
    .line 419
    new-instance v13, Lcv0;

    .line 420
    .line 421
    invoke-direct {v13, v4, v5}, Lcv0;-><init>(Ljava/lang/Object;B)V

    .line 422
    .line 423
    .line 424
    const/16 v17, 0x0

    .line 425
    .line 426
    invoke-direct/range {v11 .. v17}, Lev0;-><init>([CLpu;IIIB)V

    .line 427
    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_10
    new-instance v11, Lfv0;

    .line 431
    .line 432
    new-instance v13, Lcv0;

    .line 433
    .line 434
    invoke-direct {v13, v4, v5}, Lcv0;-><init>(Ljava/lang/Object;B)V

    .line 435
    .line 436
    .line 437
    const/16 v17, 0x1

    .line 438
    .line 439
    invoke-direct/range {v11 .. v17}, Lev0;-><init>([CLpu;IIIB)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 440
    .line 441
    .line 442
    goto :goto_4

    .line 443
    :goto_5
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    sub-int/2addr v1, v0

    .line 448
    if-gt v1, v9, :cond_11

    .line 449
    .line 450
    sub-int/2addr v9, v1

    .line 451
    invoke-static {v9, v3}, Lb33;->i(ILjava/nio/ByteBuffer;)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :cond_11
    new-instance v0, La43;

    .line 456
    .line 457
    const-string v1, "uprops.icu: not enough bytes for blockTrie"

    .line 458
    .line 459
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v0

    .line 463
    :cond_12
    :try_start_2
    new-instance v0, La43;

    .line 464
    .line 465
    const-string v2, "Buffer too short for the CodePointTrie data"

    .line 466
    .line 467
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v0

    .line 471
    :cond_13
    new-instance v0, La43;

    .line 472
    .line 473
    const-string v2, "CodePointTrie data header has a different type or value width than required"

    .line 474
    .line 475
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v0

    .line 479
    :cond_14
    new-instance v0, La43;

    .line 480
    .line 481
    const-string v2, "CodePointTrie data header has unsupported options"

    .line 482
    .line 483
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw v0

    .line 487
    :cond_15
    new-instance v0, La43;

    .line 488
    .line 489
    const-string v2, "Buffer too short for a CodePointTrie header"

    .line 490
    .line 491
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 495
    :goto_6
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :cond_16
    const-string v0, "uprops.icu: not enough bytes for main trie"

    .line 500
    .line 501
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v1
.end method

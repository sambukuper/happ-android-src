.class public final Lze3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Lze3;

.field public static final b:Lbu5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lze3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lze3;->a:Lze3;

    .line 7
    .line 8
    new-instance v0, Lbu5;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, Lzt5;->U:Lzt5;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lbu5;-><init>(Ljava/lang/String;Lzt5;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lze3;->b:Lbu5;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lte3;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lte3;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1, p0}, Lol7;->t(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 26

    .line 1
    sget-object v0, Lte3;->Z:Lte3;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lrd1;->s()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x3

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ldq;

    .line 18
    .line 19
    const-string v3, "An empty string is not a valid Instant"

    .line 20
    .line 21
    invoke-direct {v1, v3, v0, v2}, Ldq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_15

    .line 25
    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/16 v4, 0x20

    .line 32
    .line 33
    const/16 v5, 0x2b

    .line 34
    .line 35
    const/16 v6, 0x2d

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    if-eq v3, v5, :cond_1

    .line 39
    .line 40
    if-eq v3, v6, :cond_1

    .line 41
    .line 42
    move v8, v1

    .line 43
    move v3, v4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v8, v7

    .line 46
    :goto_0
    move v10, v1

    .line 47
    move v9, v8

    .line 48
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    const/16 v12, 0x3a

    .line 53
    .line 54
    const/16 v13, 0x30

    .line 55
    .line 56
    if-ge v9, v11, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    if-gt v13, v11, :cond_2

    .line 63
    .line 64
    if-ge v11, v12, :cond_2

    .line 65
    .line 66
    mul-int/lit8 v10, v10, 0xa

    .line 67
    .line 68
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    sub-int/2addr v11, v13

    .line 73
    add-int/2addr v10, v11

    .line 74
    add-int/lit8 v9, v9, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    sub-int v11, v9, v8

    .line 78
    .line 79
    const-string v14, " digits"

    .line 80
    .line 81
    const/16 v15, 0xa

    .line 82
    .line 83
    if-le v11, v15, :cond_3

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v2, "Expected at most 10 digits for the year number, got "

    .line 88
    .line 89
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto/16 :goto_15

    .line 107
    .line 108
    :cond_3
    if-ne v11, v15, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    const/16 v1, 0x32

    .line 115
    .line 116
    if-lt v8, v1, :cond_4

    .line 117
    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 121
    .line 122
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    goto/16 :goto_15

    .line 140
    .line 141
    :cond_4
    const/4 v1, 0x4

    .line 142
    if-ge v11, v1, :cond_5

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 147
    .line 148
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    goto/16 :goto_15

    .line 166
    .line 167
    :cond_5
    if-ne v3, v5, :cond_6

    .line 168
    .line 169
    if-ne v11, v1, :cond_6

    .line 170
    .line 171
    const-string v1, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 172
    .line 173
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    goto/16 :goto_15

    .line 178
    .line 179
    :cond_6
    if-ne v3, v4, :cond_7

    .line 180
    .line 181
    if-eq v11, v1, :cond_7

    .line 182
    .line 183
    const-string v1, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 184
    .line 185
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    goto/16 :goto_15

    .line 190
    .line 191
    :cond_7
    if-ne v3, v6, :cond_8

    .line 192
    .line 193
    neg-int v10, v10

    .line 194
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    add-int/lit8 v4, v9, 0x10

    .line 199
    .line 200
    if-ge v3, v4, :cond_9

    .line 201
    .line 202
    const-string v1, "The input string is too short"

    .line 203
    .line 204
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    goto/16 :goto_15

    .line 209
    .line 210
    :cond_9
    new-instance v3, Lya2;

    .line 211
    .line 212
    const/16 v8, 0x18

    .line 213
    .line 214
    invoke-direct {v3, v8}, Lya2;-><init>(B)V

    .line 215
    .line 216
    .line 217
    const-string v8, "\'-\'"

    .line 218
    .line 219
    invoke-static {v0, v8, v9, v3}, Ljb5;->F(Ljava/lang/String;Ljava/lang/String;ILgn2;)Ldq;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-eqz v3, :cond_a

    .line 224
    .line 225
    move-object v1, v3

    .line 226
    goto/16 :goto_15

    .line 227
    .line 228
    :cond_a
    add-int/lit8 v3, v9, 0x3

    .line 229
    .line 230
    new-instance v11, Lya2;

    .line 231
    .line 232
    const/16 v1, 0x19

    .line 233
    .line 234
    invoke-direct {v11, v1}, Lya2;-><init>(B)V

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v8, v3, v11}, Ljb5;->F(Ljava/lang/String;Ljava/lang/String;ILgn2;)Ldq;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    if-eqz v1, :cond_b

    .line 242
    .line 243
    goto/16 :goto_15

    .line 244
    .line 245
    :cond_b
    add-int/lit8 v1, v9, 0x6

    .line 246
    .line 247
    new-instance v3, Lya2;

    .line 248
    .line 249
    const/16 v8, 0x1a

    .line 250
    .line 251
    invoke-direct {v3, v8}, Lya2;-><init>(B)V

    .line 252
    .line 253
    .line 254
    const-string v8, "\'T\' or \'t\'"

    .line 255
    .line 256
    invoke-static {v0, v8, v1, v3}, Ljb5;->F(Ljava/lang/String;Ljava/lang/String;ILgn2;)Ldq;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    if-eqz v1, :cond_c

    .line 261
    .line 262
    goto/16 :goto_15

    .line 263
    .line 264
    :cond_c
    add-int/lit8 v1, v9, 0x9

    .line 265
    .line 266
    new-instance v3, Lya2;

    .line 267
    .line 268
    const/16 v8, 0x1b

    .line 269
    .line 270
    invoke-direct {v3, v8}, Lya2;-><init>(B)V

    .line 271
    .line 272
    .line 273
    const-string v8, "\':\'"

    .line 274
    .line 275
    invoke-static {v0, v8, v1, v3}, Ljb5;->F(Ljava/lang/String;Ljava/lang/String;ILgn2;)Ldq;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-eqz v1, :cond_d

    .line 280
    .line 281
    goto/16 :goto_15

    .line 282
    .line 283
    :cond_d
    add-int/lit8 v1, v9, 0xc

    .line 284
    .line 285
    new-instance v3, Lya2;

    .line 286
    .line 287
    const/16 v11, 0x1c

    .line 288
    .line 289
    invoke-direct {v3, v11}, Lya2;-><init>(B)V

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v8, v1, v3}, Ljb5;->F(Ljava/lang/String;Ljava/lang/String;ILgn2;)Ldq;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-eqz v1, :cond_e

    .line 297
    .line 298
    goto/16 :goto_15

    .line 299
    .line 300
    :cond_e
    sget-object v1, Ljb5;->f0:[I

    .line 301
    .line 302
    const/4 v3, 0x0

    .line 303
    :goto_2
    const/16 v8, 0x1d

    .line 304
    .line 305
    if-ge v3, v15, :cond_10

    .line 306
    .line 307
    aget v16, v1, v3

    .line 308
    .line 309
    add-int v11, v9, v16

    .line 310
    .line 311
    new-instance v2, Lya2;

    .line 312
    .line 313
    invoke-direct {v2, v8}, Lya2;-><init>(B)V

    .line 314
    .line 315
    .line 316
    const-string v8, "an ASCII digit"

    .line 317
    .line 318
    invoke-static {v0, v8, v11, v2}, Ljb5;->F(Ljava/lang/String;Ljava/lang/String;ILgn2;)Ldq;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    if-eqz v2, :cond_f

    .line 323
    .line 324
    move-object v1, v2

    .line 325
    goto/16 :goto_15

    .line 326
    .line 327
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 328
    .line 329
    const/4 v2, 0x3

    .line 330
    const/16 v11, 0x1c

    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_10
    add-int/lit8 v1, v9, 0x1

    .line 334
    .line 335
    invoke-static {v1, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    add-int/lit8 v2, v9, 0x4

    .line 340
    .line 341
    invoke-static {v2, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    add-int/lit8 v3, v9, 0x7

    .line 346
    .line 347
    invoke-static {v3, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    add-int/lit8 v11, v9, 0xa

    .line 352
    .line 353
    invoke-static {v11, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    add-int/lit8 v8, v9, 0xd

    .line 358
    .line 359
    invoke-static {v8, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 360
    .line 361
    .line 362
    move-result v8

    .line 363
    add-int/lit8 v9, v9, 0xf

    .line 364
    .line 365
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    const/16 v5, 0x2e

    .line 370
    .line 371
    const/16 v15, 0x9

    .line 372
    .line 373
    if-ne v6, v5, :cond_13

    .line 374
    .line 375
    move v9, v4

    .line 376
    const/4 v5, 0x0

    .line 377
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-ge v9, v6, :cond_11

    .line 382
    .line 383
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    if-gt v13, v6, :cond_11

    .line 388
    .line 389
    if-ge v6, v12, :cond_11

    .line 390
    .line 391
    mul-int/lit8 v5, v5, 0xa

    .line 392
    .line 393
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    sub-int/2addr v6, v13

    .line 398
    add-int/2addr v5, v6

    .line 399
    add-int/lit8 v9, v9, 0x1

    .line 400
    .line 401
    goto :goto_3

    .line 402
    :cond_11
    sub-int v4, v9, v4

    .line 403
    .line 404
    if-gt v7, v4, :cond_12

    .line 405
    .line 406
    const/16 v6, 0xa

    .line 407
    .line 408
    if-ge v4, v6, :cond_12

    .line 409
    .line 410
    sget-object v6, Ljb5;->Z:[I

    .line 411
    .line 412
    rsub-int/lit8 v4, v4, 0x9

    .line 413
    .line 414
    aget v4, v6, v4

    .line 415
    .line 416
    mul-int/2addr v5, v4

    .line 417
    goto :goto_4

    .line 418
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 421
    .line 422
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    goto/16 :goto_15

    .line 440
    .line 441
    :cond_13
    const/4 v5, 0x0

    .line 442
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-lt v9, v4, :cond_14

    .line 447
    .line 448
    const-string v1, "The UTC offset at the end of the string is missing"

    .line 449
    .line 450
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    goto/16 :goto_15

    .line 455
    .line 456
    :cond_14
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    const/4 v6, 0x2

    .line 461
    const/16 v14, 0x27

    .line 462
    .line 463
    move/from16 v21, v7

    .line 464
    .line 465
    const-string v7, ", got \'"

    .line 466
    .line 467
    const/16 v13, 0x2b

    .line 468
    .line 469
    if-eq v4, v13, :cond_17

    .line 470
    .line 471
    const/16 v13, 0x2d

    .line 472
    .line 473
    if-eq v4, v13, :cond_17

    .line 474
    .line 475
    const/16 v12, 0x5a

    .line 476
    .line 477
    if-eq v4, v12, :cond_15

    .line 478
    .line 479
    const/16 v12, 0x7a

    .line 480
    .line 481
    if-eq v4, v12, :cond_15

    .line 482
    .line 483
    new-instance v1, Ljava/lang/StringBuilder;

    .line 484
    .line 485
    const-string v2, "Expected the UTC offset at position "

    .line 486
    .line 487
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    goto/16 :goto_15

    .line 511
    .line 512
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    add-int/lit8 v9, v9, 0x1

    .line 517
    .line 518
    if-ne v4, v9, :cond_16

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    :goto_5
    move/from16 v4, v21

    .line 522
    .line 523
    goto/16 :goto_f

    .line 524
    .line 525
    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 526
    .line 527
    const-string v2, "Extra text after the instant at position "

    .line 528
    .line 529
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    goto/16 :goto_15

    .line 544
    .line 545
    :cond_17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 546
    .line 547
    .line 548
    move-result v13

    .line 549
    sub-int/2addr v13, v9

    .line 550
    if-le v13, v15, :cond_18

    .line 551
    .line 552
    new-instance v1, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    const-string v2, "The UTC offset string \""

    .line 555
    .line 556
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    invoke-virtual {v0, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const/16 v3, 0x10

    .line 572
    .line 573
    invoke-static {v3, v2}, Ljb5;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    const-string v2, "\" is too long"

    .line 581
    .line 582
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    goto/16 :goto_15

    .line 594
    .line 595
    :cond_18
    rem-int/lit8 v20, v13, 0x3

    .line 596
    .line 597
    if-eqz v20, :cond_19

    .line 598
    .line 599
    new-instance v1, Ljava/lang/StringBuilder;

    .line 600
    .line 601
    const-string v2, "Invalid UTC offset string \""

    .line 602
    .line 603
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    invoke-virtual {v0, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const/16 v2, 0x22

    .line 622
    .line 623
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    goto/16 :goto_15

    .line 635
    .line 636
    :cond_19
    sget-object v20, Ljb5;->g0:[I

    .line 637
    .line 638
    const/4 v15, 0x0

    .line 639
    :goto_6
    if-ge v15, v6, :cond_1c

    .line 640
    .line 641
    aget v24, v20, v15

    .line 642
    .line 643
    add-int v6, v9, v24

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 646
    .line 647
    .line 648
    move-result v14

    .line 649
    if-lt v6, v14, :cond_1a

    .line 650
    .line 651
    goto :goto_7

    .line 652
    :cond_1a
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 653
    .line 654
    .line 655
    move-result v14

    .line 656
    if-eq v14, v12, :cond_1b

    .line 657
    .line 658
    const-string v1, "Expected \':\' at index "

    .line 659
    .line 660
    invoke-static {v1, v6, v7}, Lie2;->l(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    const/16 v2, 0x27

    .line 672
    .line 673
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    goto/16 :goto_15

    .line 685
    .line 686
    :cond_1b
    add-int/lit8 v15, v15, 0x1

    .line 687
    .line 688
    const/4 v6, 0x2

    .line 689
    const/16 v14, 0x27

    .line 690
    .line 691
    goto :goto_6

    .line 692
    :cond_1c
    :goto_7
    sget-object v6, Ljb5;->h0:[I

    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    :goto_8
    const/4 v15, 0x6

    .line 696
    if-ge v14, v15, :cond_1f

    .line 697
    .line 698
    aget v15, v6, v14

    .line 699
    .line 700
    add-int/2addr v15, v9

    .line 701
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 702
    .line 703
    .line 704
    move-result v12

    .line 705
    if-lt v15, v12, :cond_1d

    .line 706
    .line 707
    goto :goto_9

    .line 708
    :cond_1d
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 709
    .line 710
    .line 711
    move-result v12

    .line 712
    move-object/from16 v25, v6

    .line 713
    .line 714
    const/16 v6, 0x30

    .line 715
    .line 716
    if-gt v6, v12, :cond_1e

    .line 717
    .line 718
    const/16 v6, 0x3a

    .line 719
    .line 720
    if-ge v12, v6, :cond_1e

    .line 721
    .line 722
    add-int/lit8 v14, v14, 0x1

    .line 723
    .line 724
    move v12, v6

    .line 725
    move-object/from16 v6, v25

    .line 726
    .line 727
    goto :goto_8

    .line 728
    :cond_1e
    const-string v1, "Expected an ASCII digit at index "

    .line 729
    .line 730
    invoke-static {v1, v15, v7}, Lie2;->l(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    const/16 v2, 0x27

    .line 742
    .line 743
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    goto/16 :goto_15

    .line 755
    .line 756
    :cond_1f
    :goto_9
    add-int/lit8 v6, v9, 0x1

    .line 757
    .line 758
    invoke-static {v6, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 759
    .line 760
    .line 761
    move-result v6

    .line 762
    const/4 v7, 0x3

    .line 763
    if-le v13, v7, :cond_20

    .line 764
    .line 765
    add-int/lit8 v7, v9, 0x4

    .line 766
    .line 767
    invoke-static {v7, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 768
    .line 769
    .line 770
    move-result v7

    .line 771
    :goto_a
    const/4 v15, 0x6

    .line 772
    goto :goto_b

    .line 773
    :cond_20
    const/4 v7, 0x0

    .line 774
    goto :goto_a

    .line 775
    :goto_b
    if-le v13, v15, :cond_21

    .line 776
    .line 777
    add-int/lit8 v12, v9, 0x7

    .line 778
    .line 779
    invoke-static {v12, v0}, Ljb5;->H(ILjava/lang/String;)I

    .line 780
    .line 781
    .line 782
    move-result v12

    .line 783
    :goto_c
    const/16 v13, 0x3b

    .line 784
    .line 785
    goto :goto_d

    .line 786
    :cond_21
    const/4 v12, 0x0

    .line 787
    goto :goto_c

    .line 788
    :goto_d
    if-le v7, v13, :cond_22

    .line 789
    .line 790
    new-instance v1, Ljava/lang/StringBuilder;

    .line 791
    .line 792
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 793
    .line 794
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    goto/16 :goto_15

    .line 809
    .line 810
    :cond_22
    if-le v12, v13, :cond_23

    .line 811
    .line 812
    new-instance v1, Ljava/lang/StringBuilder;

    .line 813
    .line 814
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 815
    .line 816
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    goto/16 :goto_15

    .line 831
    .line 832
    :cond_23
    const/16 v13, 0x11

    .line 833
    .line 834
    if-le v6, v13, :cond_25

    .line 835
    .line 836
    const/16 v13, 0x12

    .line 837
    .line 838
    if-ne v6, v13, :cond_24

    .line 839
    .line 840
    if-nez v7, :cond_24

    .line 841
    .line 842
    if-eqz v12, :cond_25

    .line 843
    .line 844
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 845
    .line 846
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 847
    .line 848
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    invoke-virtual {v0, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    goto/16 :goto_15

    .line 875
    .line 876
    :cond_25
    mul-int/lit16 v6, v6, 0xe10

    .line 877
    .line 878
    mul-int/lit8 v7, v7, 0x3c

    .line 879
    .line 880
    add-int/2addr v7, v6

    .line 881
    add-int/2addr v7, v12

    .line 882
    const/16 v13, 0x2d

    .line 883
    .line 884
    if-ne v4, v13, :cond_26

    .line 885
    .line 886
    const/4 v4, -0x1

    .line 887
    goto :goto_e

    .line 888
    :cond_26
    move/from16 v4, v21

    .line 889
    .line 890
    :goto_e
    mul-int/2addr v7, v4

    .line 891
    goto/16 :goto_5

    .line 892
    .line 893
    :goto_f
    if-gt v4, v1, :cond_34

    .line 894
    .line 895
    const/16 v6, 0xd

    .line 896
    .line 897
    if-ge v1, v6, :cond_34

    .line 898
    .line 899
    if-gt v4, v2, :cond_33

    .line 900
    .line 901
    and-int/lit8 v4, v10, 0x3

    .line 902
    .line 903
    if-nez v4, :cond_28

    .line 904
    .line 905
    rem-int/lit8 v6, v10, 0x64

    .line 906
    .line 907
    if-nez v6, :cond_27

    .line 908
    .line 909
    rem-int/lit16 v6, v10, 0x190

    .line 910
    .line 911
    if-nez v6, :cond_28

    .line 912
    .line 913
    :cond_27
    const/4 v6, 0x1

    .line 914
    :goto_10
    const/4 v9, 0x2

    .line 915
    goto :goto_11

    .line 916
    :cond_28
    const/4 v6, 0x0

    .line 917
    goto :goto_10

    .line 918
    :goto_11
    if-eq v1, v9, :cond_2a

    .line 919
    .line 920
    const/4 v9, 0x4

    .line 921
    if-eq v1, v9, :cond_29

    .line 922
    .line 923
    const/4 v15, 0x6

    .line 924
    if-eq v1, v15, :cond_29

    .line 925
    .line 926
    const/16 v6, 0x9

    .line 927
    .line 928
    if-eq v1, v6, :cond_29

    .line 929
    .line 930
    const/16 v6, 0xb

    .line 931
    .line 932
    if-eq v1, v6, :cond_29

    .line 933
    .line 934
    const/16 v6, 0x1f

    .line 935
    .line 936
    goto :goto_12

    .line 937
    :cond_29
    const/16 v6, 0x1e

    .line 938
    .line 939
    goto :goto_12

    .line 940
    :cond_2a
    if-eqz v6, :cond_2b

    .line 941
    .line 942
    const/16 v6, 0x1d

    .line 943
    .line 944
    goto :goto_12

    .line 945
    :cond_2b
    const/16 v6, 0x1c

    .line 946
    .line 947
    :goto_12
    if-gt v2, v6, :cond_33

    .line 948
    .line 949
    const/16 v6, 0x17

    .line 950
    .line 951
    if-le v3, v6, :cond_2c

    .line 952
    .line 953
    new-instance v1, Ljava/lang/StringBuilder;

    .line 954
    .line 955
    const-string v2, "Expected hour in 0..23, got "

    .line 956
    .line 957
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    goto/16 :goto_15

    .line 972
    .line 973
    :cond_2c
    const/16 v13, 0x3b

    .line 974
    .line 975
    if-le v11, v13, :cond_2d

    .line 976
    .line 977
    new-instance v1, Ljava/lang/StringBuilder;

    .line 978
    .line 979
    const-string v2, "Expected minute-of-hour in 0..59, got "

    .line 980
    .line 981
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    goto/16 :goto_15

    .line 996
    .line 997
    :cond_2d
    if-le v8, v13, :cond_2e

    .line 998
    .line 999
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 1002
    .line 1003
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    goto/16 :goto_15

    .line 1018
    .line 1019
    :cond_2e
    int-to-long v12, v10

    .line 1020
    const-wide/16 v14, 0x16d

    .line 1021
    .line 1022
    mul-long/2addr v14, v12

    .line 1023
    const-wide/16 v16, 0x0

    .line 1024
    .line 1025
    cmp-long v0, v12, v16

    .line 1026
    .line 1027
    if-ltz v0, :cond_2f

    .line 1028
    .line 1029
    const-wide/16 v16, 0x3

    .line 1030
    .line 1031
    add-long v16, v12, v16

    .line 1032
    .line 1033
    const-wide/16 v18, 0x4

    .line 1034
    .line 1035
    div-long v16, v16, v18

    .line 1036
    .line 1037
    const-wide/16 v18, 0x63

    .line 1038
    .line 1039
    add-long v18, v12, v18

    .line 1040
    .line 1041
    const-wide/16 v22, 0x64

    .line 1042
    .line 1043
    div-long v18, v18, v22

    .line 1044
    .line 1045
    sub-long v16, v16, v18

    .line 1046
    .line 1047
    const-wide/16 v18, 0x18f

    .line 1048
    .line 1049
    add-long v12, v12, v18

    .line 1050
    .line 1051
    const-wide/16 v18, 0x190

    .line 1052
    .line 1053
    div-long v12, v12, v18

    .line 1054
    .line 1055
    add-long v12, v12, v16

    .line 1056
    .line 1057
    add-long/2addr v12, v14

    .line 1058
    goto :goto_13

    .line 1059
    :cond_2f
    const-wide/16 v16, -0x4

    .line 1060
    .line 1061
    div-long v16, v12, v16

    .line 1062
    .line 1063
    const-wide/16 v18, -0x64

    .line 1064
    .line 1065
    div-long v18, v12, v18

    .line 1066
    .line 1067
    sub-long v16, v16, v18

    .line 1068
    .line 1069
    const-wide/16 v18, -0x190

    .line 1070
    .line 1071
    div-long v12, v12, v18

    .line 1072
    .line 1073
    add-long v12, v12, v16

    .line 1074
    .line 1075
    sub-long v12, v14, v12

    .line 1076
    .line 1077
    :goto_13
    mul-int/lit16 v0, v1, 0x16f

    .line 1078
    .line 1079
    add-int/lit16 v0, v0, -0x16a

    .line 1080
    .line 1081
    div-int/lit8 v0, v0, 0xc

    .line 1082
    .line 1083
    int-to-long v14, v0

    .line 1084
    add-long/2addr v12, v14

    .line 1085
    const/16 v21, 0x1

    .line 1086
    .line 1087
    add-int/lit8 v2, v2, -0x1

    .line 1088
    .line 1089
    int-to-long v14, v2

    .line 1090
    add-long/2addr v12, v14

    .line 1091
    const/4 v9, 0x2

    .line 1092
    if-le v1, v9, :cond_32

    .line 1093
    .line 1094
    const-wide/16 v0, -0x1

    .line 1095
    .line 1096
    add-long/2addr v0, v12

    .line 1097
    if-nez v4, :cond_31

    .line 1098
    .line 1099
    rem-int/lit8 v2, v10, 0x64

    .line 1100
    .line 1101
    if-nez v2, :cond_30

    .line 1102
    .line 1103
    rem-int/lit16 v10, v10, 0x190

    .line 1104
    .line 1105
    if-nez v10, :cond_31

    .line 1106
    .line 1107
    :cond_30
    move-wide v12, v0

    .line 1108
    goto :goto_14

    .line 1109
    :cond_31
    const-wide/16 v0, -0x2

    .line 1110
    .line 1111
    add-long/2addr v12, v0

    .line 1112
    :cond_32
    :goto_14
    const-wide/32 v0, 0xafaa8

    .line 1113
    .line 1114
    .line 1115
    sub-long/2addr v12, v0

    .line 1116
    mul-int/lit16 v3, v3, 0xe10

    .line 1117
    .line 1118
    mul-int/lit8 v11, v11, 0x3c

    .line 1119
    .line 1120
    add-int/2addr v11, v3

    .line 1121
    add-int/2addr v11, v8

    .line 1122
    const-wide/32 v0, 0x15180

    .line 1123
    .line 1124
    .line 1125
    mul-long/2addr v12, v0

    .line 1126
    int-to-long v0, v11

    .line 1127
    add-long/2addr v12, v0

    .line 1128
    int-to-long v0, v7

    .line 1129
    sub-long/2addr v12, v0

    .line 1130
    new-instance v1, Lxe3;

    .line 1131
    .line 1132
    invoke-direct {v1, v12, v13, v5}, Lxe3;-><init>(JI)V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_15

    .line 1136
    :cond_33
    const-string v3, " of year "

    .line 1137
    .line 1138
    const-string v4, ", got "

    .line 1139
    .line 1140
    const-string v5, "Expected a valid day-of-month for month "

    .line 1141
    .line 1142
    invoke-static {v1, v5, v10, v3, v4}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v1

    .line 1153
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    goto :goto_15

    .line 1158
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1159
    .line 1160
    const-string v3, "Expected a month number in 1..12, got "

    .line 1161
    .line 1162
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v1

    .line 1172
    invoke-static {v0, v1}, Ljb5;->G(Ljava/lang/String;Ljava/lang/String;)Ldq;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v1

    .line 1176
    :goto_15
    invoke-interface {v1}, Lye3;->toInstant()Lte3;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    return-object v0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lze3;->b:Lbu5;

    .line 2
    .line 3
    return-object p0
.end method

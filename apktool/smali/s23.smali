.class public abstract Ls23;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lkb0;->f0:Lkb0;

    .line 2
    .line 3
    const-string v0, "\"\\"

    .line 4
    .line 5
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 6
    .line 7
    .line 8
    const-string v0, "\t ,="

    .line 9
    .line 10
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final a(Lzf6;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lzf6;->X:Ly5;

    .line 2
    .line 3
    iget-object v0, v0, Ly5;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "HEAD"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lzf6;->f0:I

    .line 17
    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    const/16 v1, 0xc8

    .line 23
    .line 24
    if-lt v0, v1, :cond_2

    .line 25
    .line 26
    :cond_1
    const/16 v1, 0xcc

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/16 v1, 0x130

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p0}, Lks8;->i(Lzf6;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide/16 v2, -0x1

    .line 40
    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    const-string v0, "Transfer-Encoding"

    .line 46
    .line 47
    invoke-static {p0, v0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v0, "chunked"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 61
    return p0

    .line 62
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 63
    return p0
.end method

.method public static final b(Ld61;Lu23;Lnz2;)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v3, Ld61;->l:Lra;

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_12

    .line 18
    .line 19
    :cond_0
    sget-object v3, Lc61;->j:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {v0}, Lnz2;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    move v6, v4

    .line 27
    const/4 v7, 0x0

    .line 28
    :goto_0
    if-ge v6, v3, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0, v6}, Lnz2;->b(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    const-string v9, "Set-Cookie"

    .line 35
    .line 36
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_2

    .line 41
    .line 42
    if-nez v7, :cond_1

    .line 43
    .line 44
    new-instance v7, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/4 v8, 0x2

    .line 47
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0, v6}, Lnz2;->e(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    sget-object v3, Ld02;->X:Ld02;

    .line 61
    .line 62
    if-eqz v7, :cond_4

    .line 63
    .line 64
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-object v6, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move-object v6, v3

    .line 74
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    move v8, v4

    .line 79
    const/4 v9, 0x0

    .line 80
    :goto_2
    if-ge v8, v7, :cond_24

    .line 81
    .line 82
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v10, v0

    .line 87
    check-cast v10, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v11

    .line 96
    sget-object v0, Lks8;->a:[B

    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const/16 v13, 0x3b

    .line 103
    .line 104
    invoke-static {v10, v13, v4, v0}, Lks8;->e(Ljava/lang/String;CII)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/16 v14, 0x3d

    .line 109
    .line 110
    invoke-static {v10, v14, v4, v0}, Lks8;->e(Ljava/lang/String;CII)I

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    if-ne v15, v0, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-static {v10, v4, v15}, Lks8;->l(Ljava/lang/String;II)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-static {v10, v5, v15}, Lks8;->m(Ljava/lang/String;II)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-virtual {v10, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v17

    .line 129
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_6

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    invoke-static/range {v17 .. v17}, Lks8;->k(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    const/4 v5, -0x1

    .line 141
    if-eq v4, v5, :cond_7

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    add-int/lit8 v15, v15, 0x1

    .line 145
    .line 146
    invoke-static {v10, v15, v0}, Lks8;->l(Ljava/lang/String;II)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-static {v10, v4, v0}, Lks8;->m(Ljava/lang/String;II)I

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    invoke-virtual {v10, v4, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v18

    .line 158
    invoke-static/range {v18 .. v18}, Lks8;->k(Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eq v4, v5, :cond_8

    .line 163
    .line 164
    :goto_3
    move-object/from16 v34, v3

    .line 165
    .line 166
    const/4 v0, 0x0

    .line 167
    const/4 v14, 0x0

    .line 168
    goto/16 :goto_f

    .line 169
    .line 170
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    const-wide/16 v19, -0x1

    .line 177
    .line 178
    const-wide v21, 0xe677d21fdbffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    move-wide/from16 v23, v19

    .line 184
    .line 185
    move-wide/from16 v27, v21

    .line 186
    .line 187
    const/16 p2, 0x1

    .line 188
    .line 189
    const/4 v5, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v25, 0x0

    .line 194
    .line 195
    const/16 v26, 0x1

    .line 196
    .line 197
    const/16 v29, 0x0

    .line 198
    .line 199
    :goto_4
    const-wide v30, 0x7fffffffffffffffL

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    const-wide/high16 v32, -0x8000000000000000L

    .line 205
    .line 206
    if-ge v0, v4, :cond_15

    .line 207
    .line 208
    move-object/from16 v34, v3

    .line 209
    .line 210
    invoke-static {v10, v13, v0, v4}, Lks8;->e(Ljava/lang/String;CII)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-static {v10, v14, v0, v3}, Lks8;->e(Ljava/lang/String;CII)I

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    invoke-static {v10, v0, v13}, Lks8;->l(Ljava/lang/String;II)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-static {v10, v0, v13}, Lks8;->m(Ljava/lang/String;II)I

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    invoke-virtual {v10, v0, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-ge v13, v3, :cond_9

    .line 231
    .line 232
    add-int/lit8 v13, v13, 0x1

    .line 233
    .line 234
    invoke-static {v10, v13, v3}, Lks8;->l(Ljava/lang/String;II)I

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    invoke-static {v10, v13, v3}, Lks8;->m(Ljava/lang/String;II)I

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    invoke-virtual {v10, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    goto :goto_5

    .line 247
    :cond_9
    const-string v13, ""

    .line 248
    .line 249
    :goto_5
    const-string v14, "expires"

    .line 250
    .line 251
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    if-eqz v14, :cond_a

    .line 256
    .line 257
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    invoke-static {v0, v13}, Li21;->Q(ILjava/lang/String;)J

    .line 262
    .line 263
    .line 264
    move-result-wide v27
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 265
    :goto_6
    move/from16 v25, p2

    .line 266
    .line 267
    goto/16 :goto_7

    .line 268
    .line 269
    :cond_a
    const-string v14, "max-age"

    .line 270
    .line 271
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    if-eqz v14, :cond_e

    .line 276
    .line 277
    :try_start_1
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 278
    .line 279
    .line 280
    move-result-wide v13
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 281
    const-wide/16 v23, 0x0

    .line 282
    .line 283
    cmp-long v0, v13, v23

    .line 284
    .line 285
    if-gtz v0, :cond_b

    .line 286
    .line 287
    move-wide/from16 v23, v32

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_b
    move-wide/from16 v23, v13

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :catch_0
    move-exception v0

    .line 294
    :try_start_2
    const-string v14, "-?\\d+"

    .line 295
    .line 296
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v14, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 304
    .line 305
    .line 306
    move-result-object v14

    .line 307
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    if-eqz v14, :cond_d

    .line 312
    .line 313
    const-string v0, "-"

    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    invoke-static {v13, v14, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_c

    .line 321
    .line 322
    move-wide/from16 v30, v32

    .line 323
    .line 324
    :cond_c
    move-wide/from16 v23, v30

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_d
    throw v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 328
    :cond_e
    const-string v14, "domain"

    .line 329
    .line 330
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    if-eqz v14, :cond_11

    .line 335
    .line 336
    :try_start_3
    const-string v0, "."

    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    invoke-static {v13, v14, v0}, Lmm7;->R(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 340
    .line 341
    .line 342
    move-result v30

    .line 343
    if-nez v30, :cond_10

    .line 344
    .line 345
    invoke-static {v0, v13}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lnr4;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-eqz v0, :cond_f

    .line 354
    .line 355
    move-object v15, v0

    .line 356
    const/16 v26, 0x0

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 360
    .line 361
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 362
    .line 363
    .line 364
    throw v0

    .line 365
    :cond_10
    const-string v0, "Failed requirement."

    .line 366
    .line 367
    new-instance v13, Ljava/lang/IllegalArgumentException;

    .line 368
    .line 369
    invoke-direct {v13, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v13
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 373
    :cond_11
    const-string v14, "path"

    .line 374
    .line 375
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result v14

    .line 379
    if-eqz v14, :cond_12

    .line 380
    .line 381
    move-object v5, v13

    .line 382
    goto :goto_7

    .line 383
    :cond_12
    const-string v13, "secure"

    .line 384
    .line 385
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    if-eqz v13, :cond_13

    .line 390
    .line 391
    move/from16 v29, p2

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_13
    const-string v13, "httponly"

    .line 395
    .line 396
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_14

    .line 401
    .line 402
    move/from16 v16, p2

    .line 403
    .line 404
    :catch_1
    :cond_14
    :goto_7
    add-int/lit8 v0, v3, 0x1

    .line 405
    .line 406
    move-object/from16 v3, v34

    .line 407
    .line 408
    const/16 v13, 0x3b

    .line 409
    .line 410
    const/16 v14, 0x3d

    .line 411
    .line 412
    goto/16 :goto_4

    .line 413
    .line 414
    :cond_15
    move-object/from16 v34, v3

    .line 415
    .line 416
    cmp-long v0, v23, v32

    .line 417
    .line 418
    if-nez v0, :cond_16

    .line 419
    .line 420
    move-wide/from16 v19, v32

    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_16
    cmp-long v0, v23, v19

    .line 424
    .line 425
    if-eqz v0, :cond_1a

    .line 426
    .line 427
    const-wide v3, 0x20c49ba5e353f7L

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    cmp-long v0, v23, v3

    .line 433
    .line 434
    if-gtz v0, :cond_17

    .line 435
    .line 436
    const-wide/16 v3, 0x3e8

    .line 437
    .line 438
    mul-long v30, v23, v3

    .line 439
    .line 440
    :cond_17
    add-long v30, v11, v30

    .line 441
    .line 442
    cmp-long v0, v30, v11

    .line 443
    .line 444
    if-ltz v0, :cond_19

    .line 445
    .line 446
    cmp-long v0, v30, v21

    .line 447
    .line 448
    if-lez v0, :cond_18

    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_18
    move-wide/from16 v19, v30

    .line 452
    .line 453
    goto :goto_9

    .line 454
    :cond_19
    :goto_8
    move-wide/from16 v19, v21

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_1a
    move-wide/from16 v19, v27

    .line 458
    .line 459
    :goto_9
    iget-object v0, v2, Lu23;->d:Ljava/lang/String;

    .line 460
    .line 461
    if-nez v15, :cond_1b

    .line 462
    .line 463
    move-object v15, v0

    .line 464
    goto :goto_a

    .line 465
    :cond_1b
    invoke-static {v0, v15}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_1c

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_1c
    const/4 v14, 0x0

    .line 473
    invoke-static {v0, v14, v15}, Lmm7;->R(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    if-eqz v3, :cond_1d

    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    sub-int/2addr v3, v4

    .line 488
    add-int/lit8 v3, v3, -0x1

    .line 489
    .line 490
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    const/16 v4, 0x2e

    .line 495
    .line 496
    if-ne v3, v4, :cond_1d

    .line 497
    .line 498
    sget-object v3, Lks8;->e:Lkc6;

    .line 499
    .line 500
    invoke-virtual {v3, v0}, Lkc6;->d(Ljava/lang/CharSequence;)Z

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    if-nez v3, :cond_1d

    .line 505
    .line 506
    :goto_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    if-eq v0, v3, :cond_1e

    .line 515
    .line 516
    sget-object v0, Lu16;->g:Lu16;

    .line 517
    .line 518
    invoke-virtual {v0, v15}, Lu16;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    if-nez v0, :cond_1e

    .line 523
    .line 524
    :cond_1d
    const/4 v14, 0x0

    .line 525
    const/16 v16, 0x0

    .line 526
    .line 527
    goto :goto_e

    .line 528
    :cond_1e
    const-string v0, "/"

    .line 529
    .line 530
    const/4 v14, 0x0

    .line 531
    if-eqz v5, :cond_20

    .line 532
    .line 533
    invoke-static {v5, v14, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    if-nez v3, :cond_1f

    .line 538
    .line 539
    goto :goto_c

    .line 540
    :cond_1f
    :goto_b
    move-object/from16 v22, v5

    .line 541
    .line 542
    move/from16 v24, v16

    .line 543
    .line 544
    goto :goto_d

    .line 545
    :cond_20
    :goto_c
    invoke-virtual {v2}, Lu23;->b()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    const/16 v4, 0x2f

    .line 550
    .line 551
    const/4 v5, 0x6

    .line 552
    invoke-static {v3, v4, v14, v5}, Lfm7;->q0(Ljava/lang/CharSequence;CII)I

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    if-eqz v4, :cond_21

    .line 557
    .line 558
    invoke-virtual {v3, v14, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    :cond_21
    move-object v5, v0

    .line 563
    goto :goto_b

    .line 564
    :goto_d
    new-instance v16, Lc61;

    .line 565
    .line 566
    move-object/from16 v21, v15

    .line 567
    .line 568
    move/from16 v23, v29

    .line 569
    .line 570
    invoke-direct/range {v16 .. v26}, Lc61;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 571
    .line 572
    .line 573
    :goto_e
    move-object/from16 v0, v16

    .line 574
    .line 575
    :goto_f
    if-nez v0, :cond_22

    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_22
    if-nez v9, :cond_23

    .line 579
    .line 580
    new-instance v3, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 583
    .line 584
    .line 585
    move-object v9, v3

    .line 586
    :cond_23
    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    :goto_10
    add-int/lit8 v8, v8, 0x1

    .line 590
    .line 591
    move v4, v14

    .line 592
    move-object/from16 v3, v34

    .line 593
    .line 594
    goto/16 :goto_2

    .line 595
    .line 596
    :cond_24
    move-object/from16 v34, v3

    .line 597
    .line 598
    if-eqz v9, :cond_25

    .line 599
    .line 600
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    goto :goto_11

    .line 608
    :cond_25
    move-object/from16 v3, v34

    .line 609
    .line 610
    :goto_11
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    if-eqz v0, :cond_26

    .line 615
    .line 616
    :goto_12
    return-void

    .line 617
    :cond_26
    invoke-interface {v1, v2, v3}, Ld61;->i(Lu23;Ljava/util/List;)V

    .line 618
    .line 619
    .line 620
    return-void
.end method

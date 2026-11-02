.class public final Lio/sentry/android/core/internal/tombstone/c;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final X:Ljava/io/InputStream;

.field public final Y:Ljava/util/List;

.field public final Z:Ljava/util/List;

.field public final f0:Ljava/lang/String;

.field public final g0:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/c;->g0:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lio/sentry/android/core/internal/tombstone/c;->X:Ljava/io/InputStream;

    .line 12
    .line 13
    iput-object p2, p0, Lio/sentry/android/core/internal/tombstone/c;->Y:Ljava/util/List;

    .line 14
    .line 15
    iput-object p3, p0, Lio/sentry/android/core/internal/tombstone/c;->Z:Ljava/util/List;

    .line 16
    .line 17
    iput-object p4, p0, Lio/sentry/android/core/internal/tombstone/c;->f0:Ljava/lang/String;

    .line 18
    .line 19
    const-string p0, "SIGILL"

    .line 20
    .line 21
    const-string p1, "IllegalInstruction"

    .line 22
    .line 23
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-string p0, "SIGTRAP"

    .line 27
    .line 28
    const-string p1, "Trap"

    .line 29
    .line 30
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string p0, "SIGABRT"

    .line 34
    .line 35
    const-string p1, "Abort"

    .line 36
    .line 37
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-string p0, "SIGBUS"

    .line 41
    .line 42
    const-string p1, "BusError"

    .line 43
    .line 44
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    const-string p0, "SIGFPE"

    .line 48
    .line 49
    const-string p1, "FloatingPointException"

    .line 50
    .line 51
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    const-string p0, "SIGSEGV"

    .line 55
    .line 56
    const-string p1, "Segfault"

    .line 57
    .line 58
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/internal/tombstone/c;->X:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()Lio/sentry/j5;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x2000

    .line 9
    .line 10
    new-array v2, v2, [B

    .line 11
    .line 12
    :goto_0
    iget-object v3, v0, Lio/sentry/android/core/internal/tombstone/c;->X:Ljava/io/InputStream;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/io/InputStream;->read([B)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, -0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Lx50;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-direct {v2, v3, v1}, Lx50;-><init>(B[B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v6, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v7, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v8, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v9, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v10, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v11, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v13, ""

    .line 77
    .line 78
    move v14, v5

    .line 79
    move v15, v14

    .line 80
    move/from16 v18, v15

    .line 81
    .line 82
    move-object/from16 v17, v13

    .line 83
    .line 84
    const/4 v12, 0x0

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    :goto_1
    invoke-virtual {v2}, Lx50;->i()I

    .line 88
    .line 89
    .line 90
    move-result v19

    .line 91
    const-wide/16 v20, 0x0

    .line 92
    .line 93
    if-eqz v19, :cond_27

    .line 94
    .line 95
    ushr-int/lit8 v5, v19, 0x3

    .line 96
    .line 97
    and-int/lit8 v3, v19, 0x7

    .line 98
    .line 99
    move-object/from16 v19, v13

    .line 100
    .line 101
    const/16 v24, 0x6

    .line 102
    .line 103
    packed-switch v5, :pswitch_data_0

    .line 104
    .line 105
    .line 106
    :pswitch_0
    invoke-virtual {v2, v3}, Lx50;->k(I)V

    .line 107
    .line 108
    .line 109
    move-object/from16 v26, v2

    .line 110
    .line 111
    move-object/from16 v29, v4

    .line 112
    .line 113
    move/from16 v27, v15

    .line 114
    .line 115
    :goto_2
    const/4 v13, 0x2

    .line 116
    goto/16 :goto_24

    .line 117
    .line 118
    :pswitch_1
    const/4 v13, 0x2

    .line 119
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lx50;->g()Lx50;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    new-instance v5, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    :goto_3
    invoke-virtual {v3}, Lx50;->i()I

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    if-eqz v13, :cond_7

    .line 136
    .line 137
    move-object/from16 v26, v2

    .line 138
    .line 139
    ushr-int/lit8 v2, v13, 0x3

    .line 140
    .line 141
    and-int/lit8 v13, v13, 0x7

    .line 142
    .line 143
    move/from16 v27, v15

    .line 144
    .line 145
    const/4 v15, 0x1

    .line 146
    if-eq v2, v15, :cond_6

    .line 147
    .line 148
    const/4 v15, 0x2

    .line 149
    if-eq v2, v15, :cond_1

    .line 150
    .line 151
    invoke-virtual {v3, v13}, Lx50;->k(I)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v20, v3

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_1
    invoke-static {v2, v15, v13}, Lx50;->c(III)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Lx50;->g()Lx50;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    :goto_4
    invoke-virtual {v2}, Lx50;->i()I

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    if-eqz v13, :cond_5

    .line 169
    .line 170
    ushr-int/lit8 v15, v13, 0x3

    .line 171
    .line 172
    and-int/lit8 v13, v13, 0x7

    .line 173
    .line 174
    move-object/from16 v20, v3

    .line 175
    .line 176
    const/4 v3, 0x1

    .line 177
    if-eq v15, v3, :cond_4

    .line 178
    .line 179
    const/4 v3, 0x2

    .line 180
    if-eq v15, v3, :cond_3

    .line 181
    .line 182
    const/4 v3, 0x3

    .line 183
    if-eq v15, v3, :cond_2

    .line 184
    .line 185
    invoke-virtual {v2, v13}, Lx50;->k(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_2
    const/4 v3, 0x0

    .line 190
    invoke-static {v15, v3, v13}, Lx50;->c(III)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Lx50;->j()J

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_3
    const/4 v3, 0x0

    .line 198
    invoke-static {v15, v3, v13}, Lx50;->c(III)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Lx50;->j()J

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_4
    const/4 v3, 0x2

    .line 206
    invoke-static {v15, v3, v13}, Lx50;->c(III)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lx50;->g()Lx50;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-static {v3}, Lu28;->d(Lx50;)Lb10;

    .line 214
    .line 215
    .line 216
    :goto_5
    move-object/from16 v3, v20

    .line 217
    .line 218
    const/4 v15, 0x2

    .line 219
    goto :goto_4

    .line 220
    :cond_5
    move-object/from16 v20, v3

    .line 221
    .line 222
    new-instance v2, Lwe5;

    .line 223
    .line 224
    const/16 v3, 0x18

    .line 225
    .line 226
    invoke-direct {v2, v3}, Lwe5;-><init>(B)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    :goto_6
    const/4 v15, 0x0

    .line 233
    goto :goto_7

    .line 234
    :cond_6
    move-object/from16 v20, v3

    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    invoke-static {v2, v15, v13}, Lx50;->c(III)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 241
    .line 242
    .line 243
    :goto_7
    move-object/from16 v3, v20

    .line 244
    .line 245
    move-object/from16 v2, v26

    .line 246
    .line 247
    move/from16 v15, v27

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_7
    move-object/from16 v26, v2

    .line 251
    .line 252
    move/from16 v27, v15

    .line 253
    .line 254
    const/4 v15, 0x0

    .line 255
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    :cond_8
    :goto_8
    move-object/from16 v29, v4

    .line 259
    .line 260
    :goto_9
    move/from16 v15, v27

    .line 261
    .line 262
    :goto_a
    const/4 v13, 0x2

    .line 263
    goto/16 :goto_26

    .line 264
    .line 265
    :pswitch_2
    move-object/from16 v26, v2

    .line 266
    .line 267
    move/from16 v27, v15

    .line 268
    .line 269
    const/4 v13, 0x2

    .line 270
    const/4 v15, 0x0

    .line 271
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-static {v2, v8}, Lu28;->f(Lx50;Ljava/util/HashMap;)V

    .line 279
    .line 280
    .line 281
    :goto_b
    move-object/from16 v29, v4

    .line 282
    .line 283
    goto/16 :goto_2

    .line 284
    .line 285
    :pswitch_3
    move-object/from16 v26, v2

    .line 286
    .line 287
    move/from16 v27, v15

    .line 288
    .line 289
    const/4 v15, 0x0

    .line 290
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    long-to-int v2, v2

    .line 298
    invoke-static/range {v24 .. v24}, Lp61;->G(I)[I

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    array-length v5, v3

    .line 303
    const/4 v13, 0x0

    .line 304
    :goto_c
    if-ge v13, v5, :cond_8

    .line 305
    .line 306
    aget v15, v3, v13

    .line 307
    .line 308
    invoke-static {v15}, Lp61;->d(I)B

    .line 309
    .line 310
    .line 311
    move-result v15

    .line 312
    if-ne v15, v2, :cond_9

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_9
    add-int/lit8 v13, v13, 0x1

    .line 316
    .line 317
    goto :goto_c

    .line 318
    :pswitch_4
    move-object/from16 v26, v2

    .line 319
    .line 320
    move/from16 v27, v15

    .line 321
    .line 322
    const/4 v15, 0x0

    .line 323
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v26 .. v26}, Lx50;->e()Z

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :pswitch_5
    move-object/from16 v26, v2

    .line 331
    .line 332
    move/from16 v27, v15

    .line 333
    .line 334
    const/4 v15, 0x0

    .line 335
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 339
    .line 340
    .line 341
    move-result-wide v2

    .line 342
    long-to-int v2, v2

    .line 343
    move/from16 v18, v2

    .line 344
    .line 345
    goto :goto_8

    .line 346
    :pswitch_6
    move-object/from16 v26, v2

    .line 347
    .line 348
    move/from16 v27, v15

    .line 349
    .line 350
    const/4 v13, 0x2

    .line 351
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    :goto_d
    invoke-virtual {v2}, Lx50;->i()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_c

    .line 363
    .line 364
    ushr-int/lit8 v5, v3, 0x3

    .line 365
    .line 366
    and-int/lit8 v3, v3, 0x7

    .line 367
    .line 368
    const/4 v15, 0x1

    .line 369
    if-eq v5, v15, :cond_b

    .line 370
    .line 371
    if-eq v5, v13, :cond_a

    .line 372
    .line 373
    invoke-virtual {v2, v3}, Lx50;->k(I)V

    .line 374
    .line 375
    .line 376
    goto :goto_e

    .line 377
    :cond_a
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, Lx50;->f()[B

    .line 381
    .line 382
    .line 383
    goto :goto_e

    .line 384
    :cond_b
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Lx50;->f()[B

    .line 388
    .line 389
    .line 390
    :goto_e
    const/4 v13, 0x2

    .line 391
    goto :goto_d

    .line 392
    :cond_c
    new-instance v2, Lra;

    .line 393
    .line 394
    const/16 v3, 0x12

    .line 395
    .line 396
    const/4 v15, 0x0

    .line 397
    invoke-direct {v2, v3, v15}, Lra;-><init>(BZ)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    goto :goto_b

    .line 404
    :pswitch_7
    move-object/from16 v26, v2

    .line 405
    .line 406
    move/from16 v27, v15

    .line 407
    .line 408
    const/4 v15, 0x0

    .line 409
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 413
    .line 414
    .line 415
    goto/16 :goto_8

    .line 416
    .line 417
    :pswitch_8
    move-object/from16 v26, v2

    .line 418
    .line 419
    move/from16 v27, v15

    .line 420
    .line 421
    const/4 v13, 0x2

    .line 422
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    :goto_f
    invoke-virtual {v2}, Lx50;->i()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    if-eqz v3, :cond_11

    .line 434
    .line 435
    ushr-int/lit8 v5, v3, 0x3

    .line 436
    .line 437
    and-int/lit8 v3, v3, 0x7

    .line 438
    .line 439
    const/4 v15, 0x1

    .line 440
    if-eq v5, v15, :cond_10

    .line 441
    .line 442
    if-eq v5, v13, :cond_f

    .line 443
    .line 444
    const/4 v15, 0x3

    .line 445
    if-eq v5, v15, :cond_e

    .line 446
    .line 447
    const/4 v15, 0x4

    .line 448
    if-eq v5, v15, :cond_d

    .line 449
    .line 450
    invoke-virtual {v2, v3}, Lx50;->k(I)V

    .line 451
    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_d
    const/4 v15, 0x0

    .line 455
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2}, Lx50;->j()J

    .line 459
    .line 460
    .line 461
    goto :goto_f

    .line 462
    :cond_e
    const/4 v15, 0x0

    .line 463
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Lx50;->h()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    goto :goto_f

    .line 470
    :cond_f
    const/4 v15, 0x0

    .line 471
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Lx50;->h()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    goto :goto_f

    .line 478
    :cond_10
    const/4 v15, 0x0

    .line 479
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Lx50;->j()J

    .line 483
    .line 484
    .line 485
    goto :goto_f

    .line 486
    :cond_11
    new-instance v2, Lk32;

    .line 487
    .line 488
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    :goto_10
    move-object/from16 v29, v4

    .line 495
    .line 496
    goto/16 :goto_24

    .line 497
    .line 498
    :pswitch_9
    move-object/from16 v26, v2

    .line 499
    .line 500
    move/from16 v27, v15

    .line 501
    .line 502
    const/4 v13, 0x2

    .line 503
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    new-instance v3, Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 513
    .line 514
    .line 515
    :goto_11
    invoke-virtual {v2}, Lx50;->i()I

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    if-eqz v5, :cond_15

    .line 520
    .line 521
    ushr-int/lit8 v13, v5, 0x3

    .line 522
    .line 523
    and-int/lit8 v5, v5, 0x7

    .line 524
    .line 525
    const/4 v15, 0x1

    .line 526
    if-eq v13, v15, :cond_14

    .line 527
    .line 528
    const/4 v15, 0x2

    .line 529
    if-eq v13, v15, :cond_12

    .line 530
    .line 531
    invoke-virtual {v2, v5}, Lx50;->k(I)V

    .line 532
    .line 533
    .line 534
    move-object/from16 v20, v2

    .line 535
    .line 536
    move v2, v15

    .line 537
    goto/16 :goto_15

    .line 538
    .line 539
    :cond_12
    invoke-static {v13, v15, v5}, Lx50;->c(III)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2}, Lx50;->g()Lx50;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    :goto_12
    invoke-virtual {v5}, Lx50;->i()I

    .line 547
    .line 548
    .line 549
    move-result v13

    .line 550
    if-eqz v13, :cond_13

    .line 551
    .line 552
    ushr-int/lit8 v15, v13, 0x3

    .line 553
    .line 554
    and-int/lit8 v13, v13, 0x7

    .line 555
    .line 556
    packed-switch v15, :pswitch_data_1

    .line 557
    .line 558
    .line 559
    invoke-virtual {v5, v13}, Lx50;->k(I)V

    .line 560
    .line 561
    .line 562
    move-object/from16 v20, v2

    .line 563
    .line 564
    :goto_13
    const/4 v2, 0x2

    .line 565
    goto :goto_14

    .line 566
    :pswitch_a
    move-object/from16 v20, v2

    .line 567
    .line 568
    const/4 v2, 0x2

    .line 569
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v5}, Lx50;->h()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    goto :goto_14

    .line 576
    :pswitch_b
    move-object/from16 v20, v2

    .line 577
    .line 578
    const/4 v2, 0x2

    .line 579
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v5}, Lx50;->h()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    goto :goto_13

    .line 586
    :pswitch_c
    move-object/from16 v20, v2

    .line 587
    .line 588
    const/4 v2, 0x0

    .line 589
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5}, Lx50;->j()J

    .line 593
    .line 594
    .line 595
    goto :goto_13

    .line 596
    :pswitch_d
    move-object/from16 v20, v2

    .line 597
    .line 598
    const/4 v2, 0x0

    .line 599
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v5}, Lx50;->j()J

    .line 603
    .line 604
    .line 605
    goto :goto_13

    .line 606
    :pswitch_e
    move-object/from16 v20, v2

    .line 607
    .line 608
    const/4 v2, 0x0

    .line 609
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v5}, Lx50;->j()J

    .line 613
    .line 614
    .line 615
    goto :goto_13

    .line 616
    :pswitch_f
    move-object/from16 v20, v2

    .line 617
    .line 618
    const/4 v2, 0x2

    .line 619
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v5}, Lx50;->h()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    :goto_14
    move-object/from16 v2, v20

    .line 626
    .line 627
    goto :goto_12

    .line 628
    :cond_13
    move-object/from16 v20, v2

    .line 629
    .line 630
    const/4 v2, 0x2

    .line 631
    new-instance v5, Lk42;

    .line 632
    .line 633
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_15

    .line 640
    :cond_14
    move-object/from16 v20, v2

    .line 641
    .line 642
    const/4 v2, 0x2

    .line 643
    invoke-static {v13, v2, v5}, Lx50;->c(III)V

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v20 .. v20}, Lx50;->h()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    :goto_15
    move-object/from16 v2, v20

    .line 650
    .line 651
    goto/16 :goto_11

    .line 652
    .line 653
    :cond_15
    const/4 v2, 0x2

    .line 654
    new-instance v5, Lk32;

    .line 655
    .line 656
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move v13, v2

    .line 666
    goto/16 :goto_10

    .line 667
    .line 668
    :pswitch_10
    move-object/from16 v26, v2

    .line 669
    .line 670
    move/from16 v27, v15

    .line 671
    .line 672
    const/4 v2, 0x2

    .line 673
    invoke-static {v5, v2, v3}, Lx50;->c(III)V

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    move-object/from16 v36, v19

    .line 681
    .line 682
    move-object/from16 v37, v36

    .line 683
    .line 684
    move-wide/from16 v29, v20

    .line 685
    .line 686
    move-wide/from16 v31, v29

    .line 687
    .line 688
    move-wide/from16 v33, v31

    .line 689
    .line 690
    const/16 v35, 0x0

    .line 691
    .line 692
    :goto_16
    invoke-virtual {v2}, Lx50;->i()I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    if-eqz v3, :cond_16

    .line 697
    .line 698
    ushr-int/lit8 v5, v3, 0x3

    .line 699
    .line 700
    and-int/lit8 v3, v3, 0x7

    .line 701
    .line 702
    packed-switch v5, :pswitch_data_2

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2, v3}, Lx50;->k(I)V

    .line 706
    .line 707
    .line 708
    goto :goto_16

    .line 709
    :pswitch_11
    const/4 v15, 0x0

    .line 710
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v2}, Lx50;->j()J

    .line 714
    .line 715
    .line 716
    goto :goto_16

    .line 717
    :pswitch_12
    const/4 v13, 0x2

    .line 718
    const/4 v15, 0x0

    .line 719
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2}, Lx50;->h()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v37

    .line 726
    goto :goto_16

    .line 727
    :pswitch_13
    const/4 v13, 0x2

    .line 728
    const/4 v15, 0x0

    .line 729
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Lx50;->h()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v36

    .line 736
    goto :goto_16

    .line 737
    :pswitch_14
    const/4 v15, 0x0

    .line 738
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2}, Lx50;->e()Z

    .line 742
    .line 743
    .line 744
    goto :goto_16

    .line 745
    :pswitch_15
    const/4 v15, 0x0

    .line 746
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2}, Lx50;->e()Z

    .line 750
    .line 751
    .line 752
    goto :goto_16

    .line 753
    :pswitch_16
    const/4 v15, 0x0

    .line 754
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {v2}, Lx50;->e()Z

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    move/from16 v35, v3

    .line 762
    .line 763
    goto :goto_16

    .line 764
    :pswitch_17
    const/4 v15, 0x0

    .line 765
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2}, Lx50;->j()J

    .line 769
    .line 770
    .line 771
    move-result-wide v20

    .line 772
    move-wide/from16 v33, v20

    .line 773
    .line 774
    goto :goto_16

    .line 775
    :pswitch_18
    const/4 v15, 0x0

    .line 776
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v2}, Lx50;->j()J

    .line 780
    .line 781
    .line 782
    move-result-wide v20

    .line 783
    move-wide/from16 v31, v20

    .line 784
    .line 785
    goto :goto_16

    .line 786
    :pswitch_19
    const/4 v15, 0x0

    .line 787
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2}, Lx50;->j()J

    .line 791
    .line 792
    .line 793
    move-result-wide v20

    .line 794
    move-wide/from16 v29, v20

    .line 795
    .line 796
    goto :goto_16

    .line 797
    :cond_16
    new-instance v28, Ljt4;

    .line 798
    .line 799
    invoke-direct/range {v28 .. v37}, Ljt4;-><init>(JJJZLjava/lang/String;Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    move-object/from16 v2, v28

    .line 803
    .line 804
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto/16 :goto_b

    .line 808
    .line 809
    :pswitch_1a
    move-object/from16 v26, v2

    .line 810
    .line 811
    move/from16 v27, v15

    .line 812
    .line 813
    const/4 v13, 0x2

    .line 814
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    invoke-static {v2, v7}, Lu28;->f(Lx50;Ljava/util/HashMap;)V

    .line 822
    .line 823
    .line 824
    goto/16 :goto_10

    .line 825
    .line 826
    :pswitch_1b
    move-object/from16 v26, v2

    .line 827
    .line 828
    move/from16 v27, v15

    .line 829
    .line 830
    const/4 v13, 0x2

    .line 831
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    :goto_17
    invoke-virtual {v2}, Lx50;->i()I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    if-eqz v3, :cond_23

    .line 843
    .line 844
    ushr-int/lit8 v5, v3, 0x3

    .line 845
    .line 846
    and-int/lit8 v3, v3, 0x7

    .line 847
    .line 848
    const/4 v15, 0x1

    .line 849
    if-eq v5, v15, :cond_22

    .line 850
    .line 851
    if-eq v5, v13, :cond_18

    .line 852
    .line 853
    invoke-virtual {v2, v3}, Lx50;->k(I)V

    .line 854
    .line 855
    .line 856
    :cond_17
    move-object/from16 v20, v2

    .line 857
    .line 858
    move-object/from16 v29, v4

    .line 859
    .line 860
    goto/16 :goto_21

    .line 861
    .line 862
    :cond_18
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v2}, Lx50;->g()Lx50;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    :goto_18
    invoke-virtual {v3}, Lx50;->i()I

    .line 870
    .line 871
    .line 872
    move-result v5

    .line 873
    if-eqz v5, :cond_17

    .line 874
    .line 875
    ushr-int/lit8 v15, v5, 0x3

    .line 876
    .line 877
    and-int/lit8 v5, v5, 0x7

    .line 878
    .line 879
    move-object/from16 v20, v2

    .line 880
    .line 881
    const/4 v2, 0x1

    .line 882
    if-eq v15, v2, :cond_1d

    .line 883
    .line 884
    if-eq v15, v13, :cond_1b

    .line 885
    .line 886
    const/4 v2, 0x3

    .line 887
    if-eq v15, v2, :cond_19

    .line 888
    .line 889
    invoke-virtual {v3, v5}, Lx50;->k(I)V

    .line 890
    .line 891
    .line 892
    move-object/from16 v28, v3

    .line 893
    .line 894
    move-object/from16 v29, v4

    .line 895
    .line 896
    goto/16 :goto_20

    .line 897
    .line 898
    :cond_19
    invoke-static {v15, v13, v5}, Lx50;->c(III)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v3}, Lx50;->g()Lx50;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    new-instance v13, Ljava/util/ArrayList;

    .line 906
    .line 907
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 908
    .line 909
    .line 910
    new-instance v15, Ljava/util/ArrayList;

    .line 911
    .line 912
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 913
    .line 914
    .line 915
    :goto_19
    invoke-virtual {v5}, Lx50;->i()I

    .line 916
    .line 917
    .line 918
    move-result v21

    .line 919
    if-eqz v21, :cond_1a

    .line 920
    .line 921
    ushr-int/lit8 v2, v21, 0x3

    .line 922
    .line 923
    move-object/from16 v28, v3

    .line 924
    .line 925
    and-int/lit8 v3, v21, 0x7

    .line 926
    .line 927
    packed-switch v2, :pswitch_data_3

    .line 928
    .line 929
    .line 930
    invoke-virtual {v5, v3}, Lx50;->k(I)V

    .line 931
    .line 932
    .line 933
    move-object/from16 v29, v4

    .line 934
    .line 935
    goto :goto_1a

    .line 936
    :pswitch_1c
    move-object/from16 v29, v4

    .line 937
    .line 938
    const/4 v4, 0x2

    .line 939
    invoke-static {v2, v4, v3}, Lx50;->c(III)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v5}, Lx50;->g()Lx50;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    invoke-static {v2}, Lu28;->d(Lx50;)Lb10;

    .line 947
    .line 948
    .line 949
    move-result-object v2

    .line 950
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 951
    .line 952
    .line 953
    goto :goto_1a

    .line 954
    :pswitch_1d
    move-object/from16 v29, v4

    .line 955
    .line 956
    const/4 v4, 0x0

    .line 957
    invoke-static {v2, v4, v3}, Lx50;->c(III)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v5}, Lx50;->j()J

    .line 961
    .line 962
    .line 963
    goto :goto_1b

    .line 964
    :pswitch_1e
    move-object/from16 v29, v4

    .line 965
    .line 966
    const/4 v4, 0x2

    .line 967
    invoke-static {v2, v4, v3}, Lx50;->c(III)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v5}, Lx50;->g()Lx50;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    invoke-static {v2}, Lu28;->d(Lx50;)Lb10;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    :goto_1a
    const/4 v4, 0x0

    .line 982
    goto :goto_1b

    .line 983
    :pswitch_1f
    move-object/from16 v29, v4

    .line 984
    .line 985
    const/4 v4, 0x0

    .line 986
    invoke-static {v2, v4, v3}, Lx50;->c(III)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v5}, Lx50;->j()J

    .line 990
    .line 991
    .line 992
    goto :goto_1b

    .line 993
    :pswitch_20
    move-object/from16 v29, v4

    .line 994
    .line 995
    const/4 v4, 0x0

    .line 996
    invoke-static {v2, v4, v3}, Lx50;->c(III)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v5}, Lx50;->j()J

    .line 1000
    .line 1001
    .line 1002
    goto :goto_1b

    .line 1003
    :pswitch_21
    move-object/from16 v29, v4

    .line 1004
    .line 1005
    const/4 v4, 0x0

    .line 1006
    invoke-static {v2, v4, v3}, Lx50;->c(III)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v5}, Lx50;->j()J

    .line 1010
    .line 1011
    .line 1012
    :goto_1b
    move-object/from16 v3, v28

    .line 1013
    .line 1014
    move-object/from16 v4, v29

    .line 1015
    .line 1016
    const/4 v2, 0x3

    .line 1017
    goto :goto_19

    .line 1018
    :cond_1a
    move-object/from16 v28, v3

    .line 1019
    .line 1020
    move-object/from16 v29, v4

    .line 1021
    .line 1022
    const/4 v4, 0x0

    .line 1023
    invoke-static {v13}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v15}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1027
    .line 1028
    .line 1029
    goto :goto_20

    .line 1030
    :cond_1b
    move-object/from16 v28, v3

    .line 1031
    .line 1032
    move-object/from16 v29, v4

    .line 1033
    .line 1034
    const/4 v4, 0x0

    .line 1035
    invoke-static {v15, v4, v5}, Lx50;->c(III)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v28 .. v28}, Lx50;->j()J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v2

    .line 1042
    long-to-int v2, v2

    .line 1043
    invoke-static/range {v24 .. v24}, Lp61;->G(I)[I

    .line 1044
    .line 1045
    .line 1046
    move-result-object v3

    .line 1047
    array-length v4, v3

    .line 1048
    const/4 v5, 0x0

    .line 1049
    :goto_1c
    if-ge v5, v4, :cond_21

    .line 1050
    .line 1051
    aget v13, v3, v5

    .line 1052
    .line 1053
    packed-switch v13, :pswitch_data_4

    .line 1054
    .line 1055
    .line 1056
    throw v16

    .line 1057
    :pswitch_22
    const/4 v13, 0x5

    .line 1058
    goto :goto_1d

    .line 1059
    :pswitch_23
    const/4 v13, 0x4

    .line 1060
    goto :goto_1d

    .line 1061
    :pswitch_24
    const/4 v13, 0x3

    .line 1062
    goto :goto_1d

    .line 1063
    :pswitch_25
    const/4 v13, 0x2

    .line 1064
    goto :goto_1d

    .line 1065
    :pswitch_26
    const/4 v13, 0x1

    .line 1066
    goto :goto_1d

    .line 1067
    :pswitch_27
    const/4 v13, 0x0

    .line 1068
    :goto_1d
    if-ne v13, v2, :cond_1c

    .line 1069
    .line 1070
    goto :goto_20

    .line 1071
    :cond_1c
    add-int/lit8 v5, v5, 0x1

    .line 1072
    .line 1073
    goto :goto_1c

    .line 1074
    :cond_1d
    move-object/from16 v28, v3

    .line 1075
    .line 1076
    move-object/from16 v29, v4

    .line 1077
    .line 1078
    const/4 v4, 0x0

    .line 1079
    invoke-static {v15, v4, v5}, Lx50;->c(III)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual/range {v28 .. v28}, Lx50;->j()J

    .line 1083
    .line 1084
    .line 1085
    move-result-wide v2

    .line 1086
    long-to-int v2, v2

    .line 1087
    const/4 v13, 0x2

    .line 1088
    invoke-static {v13}, Lp61;->G(I)[I

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    array-length v4, v3

    .line 1093
    const/4 v5, 0x0

    .line 1094
    :goto_1e
    if-ge v5, v4, :cond_21

    .line 1095
    .line 1096
    aget v15, v3, v5

    .line 1097
    .line 1098
    move-object/from16 v21, v3

    .line 1099
    .line 1100
    const/4 v3, 0x1

    .line 1101
    if-eq v15, v3, :cond_1f

    .line 1102
    .line 1103
    if-ne v15, v13, :cond_1e

    .line 1104
    .line 1105
    const/4 v3, 0x1

    .line 1106
    goto :goto_1f

    .line 1107
    :cond_1e
    throw v16

    .line 1108
    :cond_1f
    const/4 v3, 0x0

    .line 1109
    :goto_1f
    if-ne v3, v2, :cond_20

    .line 1110
    .line 1111
    goto :goto_20

    .line 1112
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 1113
    .line 1114
    move-object/from16 v3, v21

    .line 1115
    .line 1116
    const/4 v13, 0x2

    .line 1117
    goto :goto_1e

    .line 1118
    :cond_21
    :goto_20
    move-object/from16 v2, v20

    .line 1119
    .line 1120
    move-object/from16 v3, v28

    .line 1121
    .line 1122
    move-object/from16 v4, v29

    .line 1123
    .line 1124
    const/4 v13, 0x2

    .line 1125
    goto/16 :goto_18

    .line 1126
    .line 1127
    :cond_22
    move-object/from16 v20, v2

    .line 1128
    .line 1129
    move-object/from16 v29, v4

    .line 1130
    .line 1131
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual/range {v20 .. v20}, Lx50;->h()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    :goto_21
    move-object/from16 v2, v20

    .line 1138
    .line 1139
    move-object/from16 v4, v29

    .line 1140
    .line 1141
    goto/16 :goto_17

    .line 1142
    .line 1143
    :cond_23
    move-object/from16 v29, v4

    .line 1144
    .line 1145
    new-instance v2, Lra;

    .line 1146
    .line 1147
    const/16 v3, 0xa

    .line 1148
    .line 1149
    const/4 v15, 0x0

    .line 1150
    invoke-direct {v2, v3, v15}, Lra;-><init>(BZ)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    goto/16 :goto_24

    .line 1157
    .line 1158
    :pswitch_28
    move-object/from16 v26, v2

    .line 1159
    .line 1160
    move-object/from16 v29, v4

    .line 1161
    .line 1162
    move/from16 v27, v15

    .line 1163
    .line 1164
    const/4 v13, 0x2

    .line 1165
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual/range {v26 .. v26}, Lx50;->h()Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v17

    .line 1172
    goto/16 :goto_26

    .line 1173
    .line 1174
    :pswitch_29
    move-object/from16 v26, v2

    .line 1175
    .line 1176
    move-object/from16 v29, v4

    .line 1177
    .line 1178
    move/from16 v27, v15

    .line 1179
    .line 1180
    const/4 v13, 0x2

    .line 1181
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual/range {v26 .. v26}, Lx50;->g()Lx50;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    move-object/from16 v5, v19

    .line 1189
    .line 1190
    move-object v12, v5

    .line 1191
    const/4 v3, 0x0

    .line 1192
    const/4 v4, 0x0

    .line 1193
    :goto_22
    invoke-virtual {v2}, Lx50;->i()I

    .line 1194
    .line 1195
    .line 1196
    move-result v13

    .line 1197
    if-eqz v13, :cond_24

    .line 1198
    .line 1199
    ushr-int/lit8 v15, v13, 0x3

    .line 1200
    .line 1201
    and-int/lit8 v13, v13, 0x7

    .line 1202
    .line 1203
    packed-switch v15, :pswitch_data_5

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v2, v13}, Lx50;->k(I)V

    .line 1207
    .line 1208
    .line 1209
    move-object/from16 v20, v2

    .line 1210
    .line 1211
    goto/16 :goto_23

    .line 1212
    .line 1213
    :pswitch_2a
    move-object/from16 v20, v2

    .line 1214
    .line 1215
    const/4 v2, 0x2

    .line 1216
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual/range {v20 .. v20}, Lx50;->g()Lx50;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    invoke-static {v2}, Lu28;->e(Lx50;)Lk42;

    .line 1224
    .line 1225
    .line 1226
    goto/16 :goto_23

    .line 1227
    .line 1228
    :pswitch_2b
    move-object/from16 v20, v2

    .line 1229
    .line 1230
    const/4 v2, 0x0

    .line 1231
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 1235
    .line 1236
    .line 1237
    goto/16 :goto_23

    .line 1238
    .line 1239
    :pswitch_2c
    move-object/from16 v20, v2

    .line 1240
    .line 1241
    const/4 v2, 0x0

    .line 1242
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual/range {v20 .. v20}, Lx50;->e()Z

    .line 1246
    .line 1247
    .line 1248
    goto :goto_23

    .line 1249
    :pswitch_2d
    move-object/from16 v20, v2

    .line 1250
    .line 1251
    const/4 v2, 0x0

    .line 1252
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 1256
    .line 1257
    .line 1258
    goto :goto_23

    .line 1259
    :pswitch_2e
    move-object/from16 v20, v2

    .line 1260
    .line 1261
    const/4 v2, 0x0

    .line 1262
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 1266
    .line 1267
    .line 1268
    goto :goto_23

    .line 1269
    :pswitch_2f
    move-object/from16 v20, v2

    .line 1270
    .line 1271
    const/4 v2, 0x0

    .line 1272
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual/range {v20 .. v20}, Lx50;->e()Z

    .line 1276
    .line 1277
    .line 1278
    goto :goto_23

    .line 1279
    :pswitch_30
    move-object/from16 v20, v2

    .line 1280
    .line 1281
    const/4 v2, 0x0

    .line 1282
    const/4 v12, 0x2

    .line 1283
    invoke-static {v15, v12, v13}, Lx50;->c(III)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual/range {v20 .. v20}, Lx50;->h()Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v13

    .line 1290
    move-object v12, v13

    .line 1291
    goto :goto_23

    .line 1292
    :pswitch_31
    move-object/from16 v20, v2

    .line 1293
    .line 1294
    const/4 v2, 0x0

    .line 1295
    const/16 v22, 0x2

    .line 1296
    .line 1297
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1298
    .line 1299
    .line 1300
    move/from16 v21, v3

    .line 1301
    .line 1302
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 1303
    .line 1304
    .line 1305
    move-result-wide v2

    .line 1306
    long-to-int v2, v2

    .line 1307
    move v4, v2

    .line 1308
    move/from16 v3, v21

    .line 1309
    .line 1310
    goto :goto_23

    .line 1311
    :pswitch_32
    move-object/from16 v20, v2

    .line 1312
    .line 1313
    move/from16 v21, v3

    .line 1314
    .line 1315
    const/4 v2, 0x2

    .line 1316
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual/range {v20 .. v20}, Lx50;->h()Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v5

    .line 1323
    goto :goto_23

    .line 1324
    :pswitch_33
    move-object/from16 v20, v2

    .line 1325
    .line 1326
    const/4 v2, 0x0

    .line 1327
    invoke-static {v15, v2, v13}, Lx50;->c(III)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 1331
    .line 1332
    .line 1333
    move-result-wide v2

    .line 1334
    long-to-int v2, v2

    .line 1335
    move v3, v2

    .line 1336
    :goto_23
    move-object/from16 v2, v20

    .line 1337
    .line 1338
    goto/16 :goto_22

    .line 1339
    .line 1340
    :cond_24
    move/from16 v21, v3

    .line 1341
    .line 1342
    new-instance v2, Lnv0;

    .line 1343
    .line 1344
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1345
    .line 1346
    .line 1347
    iput v3, v2, Lnv0;->X:I

    .line 1348
    .line 1349
    iput-object v5, v2, Lnv0;->Z:Ljava/lang/Object;

    .line 1350
    .line 1351
    iput v4, v2, Lnv0;->Y:I

    .line 1352
    .line 1353
    iput-object v12, v2, Lnv0;->f0:Ljava/lang/Object;

    .line 1354
    .line 1355
    move-object v12, v2

    .line 1356
    goto/16 :goto_9

    .line 1357
    .line 1358
    :pswitch_34
    move-object/from16 v26, v2

    .line 1359
    .line 1360
    move-object/from16 v29, v4

    .line 1361
    .line 1362
    move/from16 v27, v15

    .line 1363
    .line 1364
    const/4 v13, 0x2

    .line 1365
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual/range {v26 .. v26}, Lx50;->h()Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v2

    .line 1372
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1373
    .line 1374
    .line 1375
    :cond_25
    :goto_24
    move/from16 v15, v27

    .line 1376
    .line 1377
    goto/16 :goto_26

    .line 1378
    .line 1379
    :pswitch_35
    move-object/from16 v26, v2

    .line 1380
    .line 1381
    move-object/from16 v29, v4

    .line 1382
    .line 1383
    move/from16 v27, v15

    .line 1384
    .line 1385
    const/4 v13, 0x2

    .line 1386
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual/range {v26 .. v26}, Lx50;->h()Ljava/lang/String;

    .line 1390
    .line 1391
    .line 1392
    goto/16 :goto_a

    .line 1393
    .line 1394
    :pswitch_36
    move-object/from16 v26, v2

    .line 1395
    .line 1396
    move-object/from16 v29, v4

    .line 1397
    .line 1398
    move/from16 v27, v15

    .line 1399
    .line 1400
    const/4 v15, 0x0

    .line 1401
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 1405
    .line 1406
    .line 1407
    goto/16 :goto_9

    .line 1408
    .line 1409
    :pswitch_37
    move-object/from16 v26, v2

    .line 1410
    .line 1411
    move-object/from16 v29, v4

    .line 1412
    .line 1413
    const/4 v15, 0x0

    .line 1414
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 1418
    .line 1419
    .line 1420
    move-result-wide v2

    .line 1421
    long-to-int v2, v2

    .line 1422
    move v15, v2

    .line 1423
    goto/16 :goto_a

    .line 1424
    .line 1425
    :pswitch_38
    move-object/from16 v26, v2

    .line 1426
    .line 1427
    move-object/from16 v29, v4

    .line 1428
    .line 1429
    move/from16 v27, v15

    .line 1430
    .line 1431
    const/4 v15, 0x0

    .line 1432
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v2

    .line 1439
    long-to-int v14, v2

    .line 1440
    goto/16 :goto_9

    .line 1441
    .line 1442
    :pswitch_39
    move-object/from16 v26, v2

    .line 1443
    .line 1444
    move-object/from16 v29, v4

    .line 1445
    .line 1446
    move/from16 v27, v15

    .line 1447
    .line 1448
    const/4 v13, 0x2

    .line 1449
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual/range {v26 .. v26}, Lx50;->h()Ljava/lang/String;

    .line 1453
    .line 1454
    .line 1455
    goto :goto_26

    .line 1456
    :pswitch_3a
    move-object/from16 v26, v2

    .line 1457
    .line 1458
    move-object/from16 v29, v4

    .line 1459
    .line 1460
    move/from16 v27, v15

    .line 1461
    .line 1462
    const/4 v13, 0x2

    .line 1463
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual/range {v26 .. v26}, Lx50;->h()Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    goto :goto_26

    .line 1470
    :pswitch_3b
    move-object/from16 v26, v2

    .line 1471
    .line 1472
    move-object/from16 v29, v4

    .line 1473
    .line 1474
    move/from16 v27, v15

    .line 1475
    .line 1476
    const/4 v13, 0x2

    .line 1477
    invoke-static {v5, v13, v3}, Lx50;->c(III)V

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual/range {v26 .. v26}, Lx50;->h()Ljava/lang/String;

    .line 1481
    .line 1482
    .line 1483
    goto :goto_26

    .line 1484
    :pswitch_3c
    move-object/from16 v26, v2

    .line 1485
    .line 1486
    move-object/from16 v29, v4

    .line 1487
    .line 1488
    move/from16 v27, v15

    .line 1489
    .line 1490
    const/4 v13, 0x2

    .line 1491
    const/4 v15, 0x0

    .line 1492
    invoke-static {v5, v15, v3}, Lx50;->c(III)V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual/range {v26 .. v26}, Lx50;->j()J

    .line 1496
    .line 1497
    .line 1498
    move-result-wide v2

    .line 1499
    long-to-int v2, v2

    .line 1500
    invoke-static/range {v24 .. v24}, Lp61;->G(I)[I

    .line 1501
    .line 1502
    .line 1503
    move-result-object v3

    .line 1504
    array-length v4, v3

    .line 1505
    const/4 v5, 0x0

    .line 1506
    :goto_25
    if-ge v5, v4, :cond_25

    .line 1507
    .line 1508
    aget v15, v3, v5

    .line 1509
    .line 1510
    invoke-static {v15}, Lp61;->d(I)B

    .line 1511
    .line 1512
    .line 1513
    move-result v15

    .line 1514
    if-ne v15, v2, :cond_26

    .line 1515
    .line 1516
    goto/16 :goto_24

    .line 1517
    .line 1518
    :cond_26
    add-int/lit8 v5, v5, 0x1

    .line 1519
    .line 1520
    goto :goto_25

    .line 1521
    :goto_26
    move v3, v13

    .line 1522
    move-object/from16 v13, v19

    .line 1523
    .line 1524
    move-object/from16 v2, v26

    .line 1525
    .line 1526
    move-object/from16 v4, v29

    .line 1527
    .line 1528
    const/4 v5, 0x0

    .line 1529
    goto/16 :goto_1

    .line 1530
    .line 1531
    :cond_27
    move-object/from16 v29, v4

    .line 1532
    .line 1533
    move-object/from16 v19, v13

    .line 1534
    .line 1535
    move/from16 v27, v15

    .line 1536
    .line 1537
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v1

    .line 1541
    invoke-static/range {v29 .. v29}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1542
    .line 1543
    .line 1544
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1545
    .line 1546
    .line 1547
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v2

    .line 1551
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1552
    .line 1553
    .line 1554
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v3

    .line 1558
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1559
    .line 1560
    .line 1561
    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1562
    .line 1563
    .line 1564
    new-instance v4, Lio/sentry/j5;

    .line 1565
    .line 1566
    invoke-direct {v4}, Lio/sentry/j5;-><init>()V

    .line 1567
    .line 1568
    .line 1569
    sget-object v5, Lio/sentry/s5;->FATAL:Lio/sentry/s5;

    .line 1570
    .line 1571
    iput-object v5, v4, Lio/sentry/j5;->w0:Lio/sentry/s5;

    .line 1572
    .line 1573
    const-string v5, "native"

    .line 1574
    .line 1575
    iput-object v5, v4, Lio/sentry/y4;->j0:Ljava/lang/String;

    .line 1576
    .line 1577
    new-instance v5, Lio/sentry/protocol/p;

    .line 1578
    .line 1579
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1580
    .line 1581
    .line 1582
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1583
    .line 1584
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1585
    .line 1586
    .line 1587
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v1

    .line 1591
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v7

    .line 1595
    if-eqz v7, :cond_28

    .line 1596
    .line 1597
    :goto_27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v7

    .line 1601
    check-cast v7, Ljava/lang/CharSequence;

    .line 1602
    .line 1603
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 1604
    .line 1605
    .line 1606
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1607
    .line 1608
    .line 1609
    move-result v7

    .line 1610
    if-eqz v7, :cond_28

    .line 1611
    .line 1612
    const-string v7, " "

    .line 1613
    .line 1614
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    .line 1617
    goto :goto_27

    .line 1618
    :cond_28
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v1

    .line 1622
    const-string v6, ")"

    .line 1623
    .line 1624
    const-string v7, " ("

    .line 1625
    .line 1626
    if-eqz v12, :cond_2a

    .line 1627
    .line 1628
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1629
    .line 1630
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->isEmpty()Z

    .line 1631
    .line 1632
    .line 1633
    move-result v8

    .line 1634
    if-nez v8, :cond_29

    .line 1635
    .line 1636
    const-string v8, ": "

    .line 1637
    .line 1638
    move-object/from16 v13, v17

    .line 1639
    .line 1640
    invoke-virtual {v13, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v13

    .line 1644
    goto :goto_28

    .line 1645
    :cond_29
    move-object/from16 v13, v19

    .line 1646
    .line 1647
    :goto_28
    iget-object v8, v12, Lnv0;->Z:Ljava/lang/Object;

    .line 1648
    .line 1649
    check-cast v8, Ljava/lang/String;

    .line 1650
    .line 1651
    iget v9, v12, Lnv0;->X:I

    .line 1652
    .line 1653
    iget-object v10, v12, Lnv0;->f0:Ljava/lang/Object;

    .line 1654
    .line 1655
    check-cast v10, Ljava/lang/String;

    .line 1656
    .line 1657
    iget v11, v12, Lnv0;->Y:I

    .line 1658
    .line 1659
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1660
    .line 1661
    invoke-direct {v15, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    const-string v13, "Fatal signal "

    .line 1665
    .line 1666
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1667
    .line 1668
    .line 1669
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1673
    .line 1674
    .line 1675
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1676
    .line 1677
    .line 1678
    const-string v8, "), "

    .line 1679
    .line 1680
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1690
    .line 1691
    .line 1692
    const-string v8, "), pid = "

    .line 1693
    .line 1694
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1695
    .line 1696
    .line 1697
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v1

    .line 1713
    iput-object v1, v5, Lio/sentry/protocol/p;->X:Ljava/lang/String;

    .line 1714
    .line 1715
    goto :goto_29

    .line 1716
    :cond_2a
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1717
    .line 1718
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1719
    .line 1720
    const-string v9, "Fatal exit pid = "

    .line 1721
    .line 1722
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v1

    .line 1741
    iput-object v1, v5, Lio/sentry/protocol/p;->X:Ljava/lang/String;

    .line 1742
    .line 1743
    :goto_29
    iput-object v5, v4, Lio/sentry/j5;->s0:Lio/sentry/protocol/p;

    .line 1744
    .line 1745
    new-instance v1, Ljava/util/ArrayList;

    .line 1746
    .line 1747
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1748
    .line 1749
    .line 1750
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v3

    .line 1754
    move-object/from16 v5, v16

    .line 1755
    .line 1756
    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1757
    .line 1758
    .line 1759
    move-result v6

    .line 1760
    if-eqz v6, :cond_34

    .line 1761
    .line 1762
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v6

    .line 1766
    check-cast v6, Ljt4;

    .line 1767
    .line 1768
    iget-boolean v7, v6, Ljt4;->d:Z

    .line 1769
    .line 1770
    iget-wide v8, v6, Ljt4;->b:J

    .line 1771
    .line 1772
    iget-wide v10, v6, Ljt4;->a:J

    .line 1773
    .line 1774
    move-object v13, v2

    .line 1775
    move-object v15, v3

    .line 1776
    iget-wide v2, v6, Ljt4;->c:J

    .line 1777
    .line 1778
    move/from16 v16, v7

    .line 1779
    .line 1780
    iget-object v7, v6, Ljt4;->f:Ljava/lang/String;

    .line 1781
    .line 1782
    iget-object v6, v6, Ljt4;->e:Ljava/lang/String;

    .line 1783
    .line 1784
    if-nez v16, :cond_2c

    .line 1785
    .line 1786
    :cond_2b
    move-object/from16 v16, v13

    .line 1787
    .line 1788
    goto :goto_2b

    .line 1789
    :cond_2c
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 1790
    .line 1791
    .line 1792
    move-result v16

    .line 1793
    if-nez v16, :cond_2b

    .line 1794
    .line 1795
    move-object/from16 v16, v13

    .line 1796
    .line 1797
    const-string v13, "/dev/"

    .line 1798
    .line 1799
    invoke-virtual {v6, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1800
    .line 1801
    .line 1802
    move-result v13

    .line 1803
    if-eqz v13, :cond_2d

    .line 1804
    .line 1805
    goto :goto_2b

    .line 1806
    :cond_2d
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 1807
    .line 1808
    .line 1809
    move-result v13

    .line 1810
    if-nez v13, :cond_30

    .line 1811
    .line 1812
    if-eqz v5, :cond_2e

    .line 1813
    .line 1814
    iget-object v13, v5, Lio/sentry/android/core/internal/tombstone/b;->a:Ljava/lang/String;

    .line 1815
    .line 1816
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v13

    .line 1820
    if-eqz v13, :cond_2e

    .line 1821
    .line 1822
    iget-object v13, v5, Lio/sentry/android/core/internal/tombstone/b;->b:Ljava/lang/String;

    .line 1823
    .line 1824
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v13

    .line 1828
    if-eqz v13, :cond_2e

    .line 1829
    .line 1830
    iget-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->d:J

    .line 1831
    .line 1832
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 1833
    .line 1834
    .line 1835
    move-result-wide v6

    .line 1836
    iput-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->d:J

    .line 1837
    .line 1838
    iput-wide v10, v5, Lio/sentry/android/core/internal/tombstone/b;->e:J

    .line 1839
    .line 1840
    iput-wide v8, v5, Lio/sentry/android/core/internal/tombstone/b;->f:J

    .line 1841
    .line 1842
    iput-wide v2, v5, Lio/sentry/android/core/internal/tombstone/b;->g:J

    .line 1843
    .line 1844
    goto :goto_2b

    .line 1845
    :cond_2e
    if-eqz v5, :cond_2f

    .line 1846
    .line 1847
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/b;->a()Lio/sentry/protocol/DebugImage;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v5

    .line 1851
    if-eqz v5, :cond_2f

    .line 1852
    .line 1853
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1854
    .line 1855
    .line 1856
    :cond_2f
    new-instance v5, Lio/sentry/android/core/internal/tombstone/b;

    .line 1857
    .line 1858
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1859
    .line 1860
    .line 1861
    iput-object v6, v5, Lio/sentry/android/core/internal/tombstone/b;->a:Ljava/lang/String;

    .line 1862
    .line 1863
    iput-object v7, v5, Lio/sentry/android/core/internal/tombstone/b;->b:Ljava/lang/String;

    .line 1864
    .line 1865
    iput-wide v10, v5, Lio/sentry/android/core/internal/tombstone/b;->c:J

    .line 1866
    .line 1867
    iput-wide v8, v5, Lio/sentry/android/core/internal/tombstone/b;->d:J

    .line 1868
    .line 1869
    iput-wide v10, v5, Lio/sentry/android/core/internal/tombstone/b;->e:J

    .line 1870
    .line 1871
    iput-wide v8, v5, Lio/sentry/android/core/internal/tombstone/b;->f:J

    .line 1872
    .line 1873
    iput-wide v2, v5, Lio/sentry/android/core/internal/tombstone/b;->g:J

    .line 1874
    .line 1875
    :goto_2b
    move/from16 v17, v14

    .line 1876
    .line 1877
    goto :goto_2d

    .line 1878
    :cond_30
    move/from16 v17, v14

    .line 1879
    .line 1880
    if-eqz v5, :cond_33

    .line 1881
    .line 1882
    move/from16 v7, v18

    .line 1883
    .line 1884
    int-to-long v13, v7

    .line 1885
    iget-object v7, v5, Lio/sentry/android/core/internal/tombstone/b;->a:Ljava/lang/String;

    .line 1886
    .line 1887
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1888
    .line 1889
    .line 1890
    move-result v6

    .line 1891
    if-eqz v6, :cond_33

    .line 1892
    .line 1893
    iget-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->f:J

    .line 1894
    .line 1895
    cmp-long v19, v10, v6

    .line 1896
    .line 1897
    if-ltz v19, :cond_33

    .line 1898
    .line 1899
    move-wide/from16 v22, v6

    .line 1900
    .line 1901
    iget-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->g:J

    .line 1902
    .line 1903
    cmp-long v19, v2, v6

    .line 1904
    .line 1905
    if-gez v19, :cond_31

    .line 1906
    .line 1907
    goto :goto_2d

    .line 1908
    :cond_31
    move-wide/from16 v24, v6

    .line 1909
    .line 1910
    iget-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->e:J

    .line 1911
    .line 1912
    sub-long v6, v22, v6

    .line 1913
    .line 1914
    sub-long v22, v10, v22

    .line 1915
    .line 1916
    add-long v6, v24, v6

    .line 1917
    .line 1918
    sub-long v6, v2, v6

    .line 1919
    .line 1920
    sub-long v22, v22, v6

    .line 1921
    .line 1922
    cmp-long v6, v13, v20

    .line 1923
    .line 1924
    if-lez v6, :cond_32

    .line 1925
    .line 1926
    goto :goto_2c

    .line 1927
    :cond_32
    const-wide/16 v13, 0x1000

    .line 1928
    .line 1929
    :goto_2c
    const-wide/16 v6, 0x4000

    .line 1930
    .line 1931
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 1932
    .line 1933
    .line 1934
    move-result-wide v6

    .line 1935
    neg-long v13, v6

    .line 1936
    cmp-long v13, v22, v13

    .line 1937
    .line 1938
    if-ltz v13, :cond_33

    .line 1939
    .line 1940
    cmp-long v6, v22, v6

    .line 1941
    .line 1942
    if-gtz v6, :cond_33

    .line 1943
    .line 1944
    iget-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->d:J

    .line 1945
    .line 1946
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 1947
    .line 1948
    .line 1949
    move-result-wide v6

    .line 1950
    iput-wide v6, v5, Lio/sentry/android/core/internal/tombstone/b;->d:J

    .line 1951
    .line 1952
    iput-wide v10, v5, Lio/sentry/android/core/internal/tombstone/b;->e:J

    .line 1953
    .line 1954
    iput-wide v8, v5, Lio/sentry/android/core/internal/tombstone/b;->f:J

    .line 1955
    .line 1956
    iput-wide v2, v5, Lio/sentry/android/core/internal/tombstone/b;->g:J

    .line 1957
    .line 1958
    :cond_33
    :goto_2d
    move-object v3, v15

    .line 1959
    move-object/from16 v2, v16

    .line 1960
    .line 1961
    move/from16 v14, v17

    .line 1962
    .line 1963
    goto/16 :goto_2a

    .line 1964
    .line 1965
    :cond_34
    move-object/from16 v16, v2

    .line 1966
    .line 1967
    move/from16 v17, v14

    .line 1968
    .line 1969
    if-eqz v5, :cond_35

    .line 1970
    .line 1971
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/b;->a()Lio/sentry/protocol/DebugImage;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v2

    .line 1975
    if-eqz v2, :cond_35

    .line 1976
    .line 1977
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1978
    .line 1979
    .line 1980
    :cond_35
    new-instance v2, Lio/sentry/protocol/f;

    .line 1981
    .line 1982
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1983
    .line 1984
    .line 1985
    invoke-virtual {v2, v1}, Lio/sentry/protocol/f;->b(Ljava/util/List;)V

    .line 1986
    .line 1987
    .line 1988
    iput-object v2, v4, Lio/sentry/y4;->p0:Lio/sentry/protocol/f;

    .line 1989
    .line 1990
    new-instance v1, Lio/sentry/protocol/v;

    .line 1991
    .line 1992
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1993
    .line 1994
    .line 1995
    if-eqz v12, :cond_36

    .line 1996
    .line 1997
    iget-object v2, v12, Lnv0;->Z:Ljava/lang/Object;

    .line 1998
    .line 1999
    check-cast v2, Ljava/lang/String;

    .line 2000
    .line 2001
    iput-object v2, v1, Lio/sentry/protocol/v;->X:Ljava/lang/String;

    .line 2002
    .line 2003
    iget-object v3, v0, Lio/sentry/android/core/internal/tombstone/c;->g0:Ljava/util/HashMap;

    .line 2004
    .line 2005
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v2

    .line 2009
    check-cast v2, Ljava/lang/String;

    .line 2010
    .line 2011
    iput-object v2, v1, Lio/sentry/protocol/v;->Y:Ljava/lang/String;

    .line 2012
    .line 2013
    new-instance v2, Lio/sentry/protocol/o;

    .line 2014
    .line 2015
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2016
    .line 2017
    .line 2018
    sget-object v3, Lio/sentry/android/core/internal/tombstone/a;->TOMBSTONE:Lio/sentry/android/core/internal/tombstone/a;

    .line 2019
    .line 2020
    invoke-virtual {v3}, Lio/sentry/android/core/internal/tombstone/a;->getValue()Ljava/lang/String;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v3

    .line 2024
    iput-object v3, v2, Lio/sentry/protocol/o;->X:Ljava/lang/String;

    .line 2025
    .line 2026
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2027
    .line 2028
    iput-object v3, v2, Lio/sentry/protocol/o;->f0:Ljava/lang/Boolean;

    .line 2029
    .line 2030
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2031
    .line 2032
    iput-object v3, v2, Lio/sentry/protocol/o;->i0:Ljava/lang/Boolean;

    .line 2033
    .line 2034
    new-instance v3, Ljava/util/HashMap;

    .line 2035
    .line 2036
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 2037
    .line 2038
    .line 2039
    iget v5, v12, Lnv0;->X:I

    .line 2040
    .line 2041
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v5

    .line 2045
    const-string v6, "number"

    .line 2046
    .line 2047
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2048
    .line 2049
    .line 2050
    iget-object v5, v12, Lnv0;->Z:Ljava/lang/Object;

    .line 2051
    .line 2052
    check-cast v5, Ljava/lang/String;

    .line 2053
    .line 2054
    const-string v6, "name"

    .line 2055
    .line 2056
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2057
    .line 2058
    .line 2059
    iget v5, v12, Lnv0;->Y:I

    .line 2060
    .line 2061
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v5

    .line 2065
    const-string v6, "code"

    .line 2066
    .line 2067
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2068
    .line 2069
    .line 2070
    iget-object v5, v12, Lnv0;->f0:Ljava/lang/Object;

    .line 2071
    .line 2072
    check-cast v5, Ljava/lang/String;

    .line 2073
    .line 2074
    const-string v6, "code_name"

    .line 2075
    .line 2076
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2077
    .line 2078
    .line 2079
    new-instance v5, Ljava/util/HashMap;

    .line 2080
    .line 2081
    invoke-direct {v5, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 2082
    .line 2083
    .line 2084
    iput-object v5, v2, Lio/sentry/protocol/o;->g0:Ljava/util/AbstractMap;

    .line 2085
    .line 2086
    iput-object v2, v1, Lio/sentry/protocol/v;->h0:Lio/sentry/protocol/o;

    .line 2087
    .line 2088
    :cond_36
    move/from16 v15, v27

    .line 2089
    .line 2090
    int-to-long v2, v15

    .line 2091
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v2

    .line 2095
    iput-object v2, v1, Lio/sentry/protocol/v;->f0:Ljava/lang/Long;

    .line 2096
    .line 2097
    new-instance v2, Ljava/util/ArrayList;

    .line 2098
    .line 2099
    const/4 v3, 0x1

    .line 2100
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2104
    .line 2105
    .line 2106
    invoke-virtual {v4, v2}, Lio/sentry/j5;->h(Ljava/util/List;)V

    .line 2107
    .line 2108
    .line 2109
    invoke-virtual {v4}, Lio/sentry/j5;->d()Ljava/util/ArrayList;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v1

    .line 2113
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2114
    .line 2115
    .line 2116
    const/4 v2, 0x0

    .line 2117
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v1

    .line 2121
    check-cast v1, Lio/sentry/protocol/v;

    .line 2122
    .line 2123
    new-instance v2, Ljava/util/ArrayList;

    .line 2124
    .line 2125
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2126
    .line 2127
    .line 2128
    invoke-interface/range {v16 .. v16}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v5

    .line 2132
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v5

    .line 2136
    :goto_2e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2137
    .line 2138
    .line 2139
    move-result v6

    .line 2140
    if-eqz v6, :cond_43

    .line 2141
    .line 2142
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v6

    .line 2146
    check-cast v6, Ljava/util/Map$Entry;

    .line 2147
    .line 2148
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v7

    .line 2152
    check-cast v7, Lmb8;

    .line 2153
    .line 2154
    new-instance v8, Lio/sentry/protocol/e0;

    .line 2155
    .line 2156
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 2157
    .line 2158
    .line 2159
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v6

    .line 2163
    check-cast v6, Ljava/lang/Integer;

    .line 2164
    .line 2165
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 2166
    .line 2167
    .line 2168
    move-result v6

    .line 2169
    int-to-long v9, v6

    .line 2170
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v6

    .line 2174
    iput-object v6, v8, Lio/sentry/protocol/e0;->X:Ljava/lang/Long;

    .line 2175
    .line 2176
    iget-object v6, v7, Lmb8;->b:Ljava/lang/String;

    .line 2177
    .line 2178
    iput-object v6, v8, Lio/sentry/protocol/e0;->Z:Ljava/lang/String;

    .line 2179
    .line 2180
    new-instance v6, Ljava/util/ArrayList;

    .line 2181
    .line 2182
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2183
    .line 2184
    .line 2185
    iget-object v9, v7, Lmb8;->d:Ljava/util/List;

    .line 2186
    .line 2187
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v9

    .line 2191
    :goto_2f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2192
    .line 2193
    .line 2194
    move-result v10

    .line 2195
    const-string v11, "0x%x"

    .line 2196
    .line 2197
    if-eqz v10, :cond_3f

    .line 2198
    .line 2199
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v10

    .line 2203
    check-cast v10, Lb10;

    .line 2204
    .line 2205
    iget-object v12, v10, Lb10;->d:Ljava/lang/String;

    .line 2206
    .line 2207
    iget-wide v13, v10, Lb10;->b:J

    .line 2208
    .line 2209
    iget-object v3, v10, Lb10;->c:Ljava/lang/String;

    .line 2210
    .line 2211
    move-object/from16 v16, v5

    .line 2212
    .line 2213
    const-string v5, "libart.so"

    .line 2214
    .line 2215
    invoke-virtual {v12, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 2216
    .line 2217
    .line 2218
    move-result v5

    .line 2219
    if-eqz v5, :cond_37

    .line 2220
    .line 2221
    :goto_30
    move-object/from16 v5, v16

    .line 2222
    .line 2223
    :goto_31
    const/4 v3, 0x1

    .line 2224
    goto :goto_2f

    .line 2225
    :cond_37
    const-string v5, "<anonymous"

    .line 2226
    .line 2227
    invoke-virtual {v12, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2228
    .line 2229
    .line 2230
    move-result v5

    .line 2231
    if-eqz v5, :cond_38

    .line 2232
    .line 2233
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 2234
    .line 2235
    .line 2236
    move-result v5

    .line 2237
    if-eqz v5, :cond_38

    .line 2238
    .line 2239
    goto :goto_30

    .line 2240
    :cond_38
    new-instance v5, Lio/sentry/protocol/a0;

    .line 2241
    .line 2242
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 2243
    .line 2244
    .line 2245
    iput-object v12, v5, Lio/sentry/protocol/a0;->n0:Ljava/lang/String;

    .line 2246
    .line 2247
    iput-object v3, v5, Lio/sentry/protocol/a0;->g0:Ljava/lang/String;

    .line 2248
    .line 2249
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v18

    .line 2253
    move-object/from16 v19, v9

    .line 2254
    .line 2255
    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v9

    .line 2259
    invoke-static {v11, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v9

    .line 2263
    iput-object v9, v5, Lio/sentry/protocol/a0;->s0:Ljava/lang/String;

    .line 2264
    .line 2265
    iget-object v9, v10, Lb10;->e:Ljava/lang/String;

    .line 2266
    .line 2267
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 2268
    .line 2269
    .line 2270
    move-result v9

    .line 2271
    if-nez v9, :cond_39

    .line 2272
    .line 2273
    iget-wide v9, v10, Lb10;->a:J

    .line 2274
    .line 2275
    cmp-long v18, v13, v9

    .line 2276
    .line 2277
    if-ltz v18, :cond_39

    .line 2278
    .line 2279
    sub-long/2addr v13, v9

    .line 2280
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v9

    .line 2284
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v9

    .line 2288
    invoke-static {v11, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v9

    .line 2292
    iput-object v9, v5, Lio/sentry/protocol/a0;->q0:Ljava/lang/String;

    .line 2293
    .line 2294
    :cond_39
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 2295
    .line 2296
    .line 2297
    move-result v9

    .line 2298
    if-eqz v9, :cond_3a

    .line 2299
    .line 2300
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2301
    .line 2302
    goto :goto_32

    .line 2303
    :cond_3a
    iget-object v9, v0, Lio/sentry/android/core/internal/tombstone/c;->Y:Ljava/util/List;

    .line 2304
    .line 2305
    iget-object v10, v0, Lio/sentry/android/core/internal/tombstone/c;->Z:Ljava/util/List;

    .line 2306
    .line 2307
    invoke-static {v3, v9, v10}, Lio/sentry/z;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v3

    .line 2311
    :goto_32
    iget-object v9, v0, Lio/sentry/android/core/internal/tombstone/c;->f0:Ljava/lang/String;

    .line 2312
    .line 2313
    if-eqz v9, :cond_3b

    .line 2314
    .line 2315
    invoke-virtual {v12, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2316
    .line 2317
    .line 2318
    move-result v9

    .line 2319
    if-eqz v9, :cond_3b

    .line 2320
    .line 2321
    const/4 v9, 0x1

    .line 2322
    goto :goto_33

    .line 2323
    :cond_3b
    const/4 v9, 0x0

    .line 2324
    :goto_33
    if-eqz v3, :cond_3c

    .line 2325
    .line 2326
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2327
    .line 2328
    .line 2329
    move-result v3

    .line 2330
    if-nez v3, :cond_3d

    .line 2331
    .line 2332
    :cond_3c
    if-eqz v9, :cond_3e

    .line 2333
    .line 2334
    :cond_3d
    const/4 v3, 0x1

    .line 2335
    goto :goto_34

    .line 2336
    :cond_3e
    const/4 v3, 0x0

    .line 2337
    :goto_34
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v3

    .line 2341
    iput-object v3, v5, Lio/sentry/protocol/a0;->m0:Ljava/lang/Boolean;

    .line 2342
    .line 2343
    const/4 v3, 0x0

    .line 2344
    invoke-virtual {v6, v3, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2345
    .line 2346
    .line 2347
    move-object/from16 v5, v16

    .line 2348
    .line 2349
    move-object/from16 v9, v19

    .line 2350
    .line 2351
    goto/16 :goto_31

    .line 2352
    .line 2353
    :cond_3f
    move-object/from16 v16, v5

    .line 2354
    .line 2355
    const/4 v3, 0x0

    .line 2356
    new-instance v5, Lio/sentry/protocol/c0;

    .line 2357
    .line 2358
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 2359
    .line 2360
    .line 2361
    iput-object v6, v5, Lio/sentry/protocol/c0;->X:Ljava/util/List;

    .line 2362
    .line 2363
    sget-object v6, Lio/sentry/protocol/b0;->NONE:Lio/sentry/protocol/b0;

    .line 2364
    .line 2365
    iput-object v6, v5, Lio/sentry/protocol/c0;->f0:Lio/sentry/protocol/b0;

    .line 2366
    .line 2367
    new-instance v6, Ljava/util/HashMap;

    .line 2368
    .line 2369
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 2370
    .line 2371
    .line 2372
    iget-object v9, v7, Lmb8;->c:Ljava/util/List;

    .line 2373
    .line 2374
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v9

    .line 2378
    :goto_35
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2379
    .line 2380
    .line 2381
    move-result v10

    .line 2382
    if-eqz v10, :cond_40

    .line 2383
    .line 2384
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v10

    .line 2388
    check-cast v10, Lnc6;

    .line 2389
    .line 2390
    iget-object v12, v10, Lnc6;->a:Ljava/lang/String;

    .line 2391
    .line 2392
    iget-wide v13, v10, Lnc6;->b:J

    .line 2393
    .line 2394
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v10

    .line 2398
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v10

    .line 2402
    invoke-static {v11, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v10

    .line 2406
    invoke-virtual {v6, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2407
    .line 2408
    .line 2409
    goto :goto_35

    .line 2410
    :cond_40
    iput-object v6, v5, Lio/sentry/protocol/c0;->Y:Ljava/util/AbstractMap;

    .line 2411
    .line 2412
    iput-object v5, v8, Lio/sentry/protocol/e0;->k0:Lio/sentry/protocol/c0;

    .line 2413
    .line 2414
    iget v6, v7, Lmb8;->a:I

    .line 2415
    .line 2416
    if-ne v15, v6, :cond_41

    .line 2417
    .line 2418
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2419
    .line 2420
    iput-object v7, v8, Lio/sentry/protocol/e0;->g0:Ljava/lang/Boolean;

    .line 2421
    .line 2422
    iput-object v5, v1, Lio/sentry/protocol/v;->g0:Lio/sentry/protocol/c0;

    .line 2423
    .line 2424
    :cond_41
    move/from16 v5, v17

    .line 2425
    .line 2426
    if-ne v5, v6, :cond_42

    .line 2427
    .line 2428
    const-string v6, "main"

    .line 2429
    .line 2430
    iput-object v6, v8, Lio/sentry/protocol/e0;->Z:Ljava/lang/String;

    .line 2431
    .line 2432
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2433
    .line 2434
    iput-object v6, v8, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 2435
    .line 2436
    :cond_42
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2437
    .line 2438
    .line 2439
    move/from16 v17, v5

    .line 2440
    .line 2441
    move-object/from16 v5, v16

    .line 2442
    .line 2443
    const/4 v3, 0x1

    .line 2444
    goto/16 :goto_2e

    .line 2445
    .line 2446
    :cond_43
    new-instance v0, Lio/sentry/k2;

    .line 2447
    .line 2448
    invoke-direct {v0, v2}, Lio/sentry/k2;-><init>(Ljava/util/List;)V

    .line 2449
    .line 2450
    .line 2451
    iput-object v0, v4, Lio/sentry/j5;->u0:Lio/sentry/k2;

    .line 2452
    .line 2453
    return-object v4

    .line 2454
    nop

    .line 2455
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_29
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_28
        :pswitch_1b
        :pswitch_1a
        :pswitch_10
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
    .end packed-switch
.end method

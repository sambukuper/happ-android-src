.class public final Lbv3;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lev3;

.field public final Z:Lcv3;


# direct methods
.method public synthetic constructor <init>(Lcv3;Lev3;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lbv3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lbv3;->Z:Lcv3;

    .line 4
    .line 5
    iput-object p2, p0, Lbv3;->Y:Lev3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lev3;Lcv3;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, Lbv3;->X:B

    iput-object p1, p0, Lbv3;->Y:Lev3;

    iput-object p2, p0, Lbv3;->Z:Lcv3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lbv3;->X:B

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    const/4 v3, 0x7

    .line 8
    const/16 v4, 0x2e

    .line 9
    .line 10
    const/16 v5, 0x2f

    .line 11
    .line 12
    const-string v6, "name"

    .line 13
    .line 14
    const-class v7, Lkotlin/Metadata;

    .line 15
    .line 16
    sget-object v8, Ld02;->X:Ld02;

    .line 17
    .line 18
    const/16 v9, 0xa

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x0

    .line 22
    iget-object v12, v0, Lbv3;->Y:Lev3;

    .line 23
    .line 24
    iget-object v0, v0, Lbv3;->Z:Lcv3;

    .line 25
    .line 26
    const/4 v13, 0x0

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    sget-object v0, Lli8;->d:Lli8;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_0
    sget-object v2, Lli8;->d:Lli8;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v2, v2, Lyy3;->c:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v4, Low;->e:Ldq;

    .line 66
    .line 67
    sget-object v5, Low;->a:[Lnw3;

    .line 68
    .line 69
    aget-object v5, v5, v9

    .line 70
    .line 71
    invoke-virtual {v4, v5, v0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v3, v13

    .line 79
    :goto_0
    if-eqz v3, :cond_2

    .line 80
    .line 81
    sget-object v0, Lyb6;->a:Lzb6;

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object v0, v13

    .line 89
    :goto_1
    instance-of v3, v0, Lev3;

    .line 90
    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    check-cast v0, Lev3;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move-object v0, v13

    .line 97
    :goto_2
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v0, v0, Lev3;->Z:Lg44;

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lcv3;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0}, Lcv3;->d()Lli8;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    :cond_4
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v2, v13, v12, v0}, Lhw7;->a(Ljava/util/ArrayList;Lli8;Lsw3;Ljava/lang/ClassLoader;)Lli8;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_3
    return-object v0

    .line 124
    :pswitch_0
    sget-boolean v1, Lq08;->a:Z

    .line 125
    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-virtual {v0}, Lcv3;->b()Lsx4;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lsx4;->k0()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v1, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-static {v0, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Lhi8;

    .line 163
    .line 164
    new-instance v3, Lrw3;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-direct {v3, v12, v2}, Lrw3;-><init>(Lsw3;Lhi8;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_5
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-nez v1, :cond_6

    .line 181
    .line 182
    iget-object v0, v12, Lev3;->Y:Ljava/lang/Class;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v12}, Lw51;->R([Ljava/lang/reflect/TypeVariable;Lsw3;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto :goto_5

    .line 196
    :cond_6
    invoke-virtual {v0}, Lcv3;->d()Lli8;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iget-object v1, v0, Lli8;->a:Ljava/util/List;

    .line 201
    .line 202
    :cond_7
    :goto_5
    return-object v1

    .line 203
    :pswitch_1
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 204
    .line 205
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-eqz v0, :cond_d

    .line 210
    .line 211
    invoke-static {v0}, Low;->a(Lyy3;)Lts0;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    sget-object v3, Lts0;->i0:Lts0;

    .line 216
    .line 217
    if-eq v2, v3, :cond_8

    .line 218
    .line 219
    invoke-static {v0}, Low;->a(Lyy3;)Lts0;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    sget-object v3, Lts0;->j0:Lts0;

    .line 224
    .line 225
    if-eq v2, v3, :cond_8

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_8
    invoke-static {v0}, Low;->a(Lyy3;)Lts0;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    sget-object v3, Lts0;->j0:Lts0;

    .line 233
    .line 234
    if-ne v2, v3, :cond_c

    .line 235
    .line 236
    sget-object v2, Lpx0;->a:Ljava/util/LinkedHashSet;

    .line 237
    .line 238
    iget-object v3, v0, Lyy3;->b:Ljava/lang/String;

    .line 239
    .line 240
    if-eqz v3, :cond_b

    .line 241
    .line 242
    invoke-static {v3}, Lys0;->Y(Ljava/lang/String;)Lqs0;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v3}, Lqs0;->e()Lqs0;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-static {v2, v3}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-nez v2, :cond_c

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iget-object v0, v0, Lyy3;->b:Ljava/lang/String;

    .line 261
    .line 262
    if-eqz v0, :cond_a

    .line 263
    .line 264
    const-string v2, "."

    .line 265
    .line 266
    invoke-static {v0, v11, v2}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-nez v2, :cond_9

    .line 271
    .line 272
    invoke-static {v5, v0, v0}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v4, v0, v0}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    goto :goto_6

    .line 285
    :cond_9
    const-string v1, "Local class is not supported: "

    .line 286
    .line 287
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, Lem7;->c(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_a
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v13

    .line 299
    :cond_b
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v13

    .line 303
    :cond_c
    const-string v0, "INSTANCE"

    .line 304
    .line 305
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    :goto_6
    invoke-virtual {v0, v13}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    :cond_d
    :goto_7
    return-object v13

    .line 317
    :pswitch_2
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 318
    .line 319
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v0, :cond_11

    .line 324
    .line 325
    iget-object v2, v0, Lyy3;->b:Ljava/lang/String;

    .line 326
    .line 327
    if-eqz v2, :cond_10

    .line 328
    .line 329
    invoke-static {v2}, Lys0;->Y(Ljava/lang/String;)Lqs0;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    iget-object v0, v0, Lyy3;->i:Ljava/util/ArrayList;

    .line 338
    .line 339
    new-instance v3, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_12

    .line 353
    .line 354
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    check-cast v4, Ljava/lang/String;

    .line 359
    .line 360
    invoke-static {v4}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-virtual {v2, v4}, Lqs0;->d(Lv15;)Lqs0;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-static {v1, v4, v11}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    if-eqz v4, :cond_f

    .line 373
    .line 374
    sget-object v5, Lyb6;->a:Lzb6;

    .line 375
    .line 376
    invoke-virtual {v5, v4}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    goto :goto_9

    .line 381
    :cond_f
    move-object v4, v13

    .line 382
    :goto_9
    if-eqz v4, :cond_e

    .line 383
    .line 384
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_10
    invoke-static {v6}, Ldh3;->T(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v13

    .line 392
    :cond_11
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    new-instance v3, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 402
    .line 403
    .line 404
    array-length v1, v0

    .line 405
    :goto_a
    if-ge v11, v1, :cond_12

    .line 406
    .line 407
    aget-object v2, v0, v11

    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    sget-object v4, Lyb6;->a:Lzb6;

    .line 413
    .line 414
    invoke-virtual {v4, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    add-int/lit8 v11, v11, 0x1

    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_12
    return-object v3

    .line 425
    :pswitch_3
    invoke-virtual {v12}, Lev3;->g0()Lts0;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    iget-object v2, v12, Lev3;->Y:Ljava/lang/Class;

    .line 430
    .line 431
    sget-object v3, Lts0;->Z:Lts0;

    .line 432
    .line 433
    if-eq v1, v3, :cond_27

    .line 434
    .line 435
    invoke-virtual {v12}, Lev3;->g0()Lts0;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    sget-object v3, Lts0;->i0:Lts0;

    .line 440
    .line 441
    if-eq v1, v3, :cond_27

    .line 442
    .line 443
    invoke-virtual {v12}, Lev3;->g0()Lts0;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    sget-object v3, Lts0;->j0:Lts0;

    .line 448
    .line 449
    if-eq v1, v3, :cond_27

    .line 450
    .line 451
    invoke-virtual {v12}, Lev3;->g0()Lts0;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    sget-object v3, Lts0;->g0:Lts0;

    .line 456
    .line 457
    if-eq v1, v3, :cond_27

    .line 458
    .line 459
    invoke-virtual {v2}, Ljava/lang/Class;->isSynthetic()Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_13

    .line 464
    .line 465
    goto/16 :goto_18

    .line 466
    .line 467
    :cond_13
    sget-boolean v1, Lq08;->a:Z

    .line 468
    .line 469
    if-eqz v1, :cond_14

    .line 470
    .line 471
    invoke-virtual {v12}, Lev3;->V()Ljava/util/Collection;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, Ljava/lang/Iterable;

    .line 476
    .line 477
    new-instance v8, Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-static {v0, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eqz v1, :cond_27

    .line 495
    .line 496
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    check-cast v1, La41;

    .line 501
    .line 502
    new-instance v2, Lgj1;

    .line 503
    .line 504
    invoke-direct {v2, v12, v1}, Lgj1;-><init>(Lov3;Lho2;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    goto :goto_b

    .line 511
    :cond_14
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    if-eqz v1, :cond_24

    .line 516
    .line 517
    invoke-virtual {v12}, Lev3;->W()Ljava/util/Collection;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    check-cast v1, Ljava/lang/Iterable;

    .line 522
    .line 523
    new-instance v2, Ljava/util/ArrayList;

    .line 524
    .line 525
    invoke-static {v1, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 530
    .line 531
    .line 532
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-eqz v3, :cond_16

    .line 541
    .line 542
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    check-cast v3, Lcz3;

    .line 547
    .line 548
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-static {v3}, Lch3;->D(Lcz3;)Lat3;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    iget-object v6, v6, Lat3;->a:Lpt3;

    .line 556
    .line 557
    if-eqz v6, :cond_15

    .line 558
    .line 559
    invoke-virtual {v6}, Lpt3;->toString()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    new-instance v7, Ln04;

    .line 564
    .line 565
    sget-object v14, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 566
    .line 567
    invoke-direct {v7, v12, v6, v14, v3}, Ln04;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lcz3;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_15
    new-instance v0, Lp14;

    .line 575
    .line 576
    iget-object v1, v3, Lcz3;->b:Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    new-instance v2, Ljava/lang/StringBuilder;

    .line 583
    .line 584
    const-string v3, "No signature for constructor ("

    .line 585
    .line 586
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    const-string v1, " parameters, declared in "

    .line 593
    .line 594
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    const/16 v1, 0x29

    .line 601
    .line 602
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    throw v0

    .line 613
    :cond_16
    iget-object v0, v0, Lcv3;->q:Lev3;

    .line 614
    .line 615
    invoke-static {v0}, Lw51;->E(Lzu3;)Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    iget-object v3, v0, Lev3;->Y:Ljava/lang/Class;

    .line 620
    .line 621
    if-nez v1, :cond_17

    .line 622
    .line 623
    goto/16 :goto_15

    .line 624
    .line 625
    :cond_17
    invoke-virtual {v0}, Lev3;->W()Ljava/util/Collection;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, Ljava/lang/Iterable;

    .line 630
    .line 631
    new-instance v6, Ljava/util/ArrayList;

    .line 632
    .line 633
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    :cond_18
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    if-eqz v7, :cond_1a

    .line 645
    .line 646
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    check-cast v7, Lcz3;

    .line 651
    .line 652
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-static {v7}, Lch3;->D(Lcz3;)Lat3;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    iget-object v7, v7, Lat3;->a:Lpt3;

    .line 660
    .line 661
    if-eqz v7, :cond_19

    .line 662
    .line 663
    invoke-virtual {v7}, Lpt3;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v7

    .line 667
    goto :goto_e

    .line 668
    :cond_19
    move-object v7, v13

    .line 669
    :goto_e
    if-eqz v7, :cond_18

    .line 670
    .line 671
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    goto :goto_d

    .line 675
    :cond_1a
    invoke-static {v6}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v6

    .line 683
    invoke-virtual {v6, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 691
    .line 692
    .line 693
    move-result-object v6

    .line 694
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    new-instance v8, Ljava/util/ArrayList;

    .line 698
    .line 699
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 700
    .line 701
    .line 702
    array-length v7, v6

    .line 703
    move v12, v11

    .line 704
    :goto_f
    if-ge v12, v7, :cond_22

    .line 705
    .line 706
    aget-object v14, v6, v12

    .line 707
    .line 708
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    invoke-static {v14}, Lkm4;->K(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v15

    .line 715
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 716
    .line 717
    .line 718
    move-result v16

    .line 719
    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 720
    .line 721
    .line 722
    move-result v16

    .line 723
    if-nez v16, :cond_1c

    .line 724
    .line 725
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 726
    .line 727
    .line 728
    move-result v16

    .line 729
    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 730
    .line 731
    .line 732
    move-result v16

    .line 733
    if-eqz v16, :cond_1b

    .line 734
    .line 735
    goto :goto_10

    .line 736
    :cond_1b
    move/from16 v16, v11

    .line 737
    .line 738
    goto :goto_13

    .line 739
    :cond_1c
    :goto_10
    invoke-interface {v1, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v16

    .line 743
    if-nez v16, :cond_1b

    .line 744
    .line 745
    move/from16 v16, v11

    .line 746
    .line 747
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    move-result-object v11

    .line 751
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    array-length v13, v11

    .line 755
    if-ne v13, v10, :cond_1d

    .line 756
    .line 757
    aget-object v11, v11, v16

    .line 758
    .line 759
    goto :goto_11

    .line 760
    :cond_1d
    const/4 v11, 0x0

    .line 761
    :goto_11
    if-nez v11, :cond_1e

    .line 762
    .line 763
    goto :goto_12

    .line 764
    :cond_1e
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v13

    .line 768
    if-nez v13, :cond_20

    .line 769
    .line 770
    sget-object v13, Lia6;->b:Ljava/util/LinkedHashMap;

    .line 771
    .line 772
    invoke-virtual {v13, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v13

    .line 776
    check-cast v13, Ljava/lang/Class;

    .line 777
    .line 778
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v11

    .line 782
    if-eqz v11, :cond_1f

    .line 783
    .line 784
    goto :goto_13

    .line 785
    :cond_1f
    :goto_12
    const-class v11, Ljava/lang/Deprecated;

    .line 786
    .line 787
    invoke-virtual {v14, v11}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 788
    .line 789
    .line 790
    move-result v11

    .line 791
    if-nez v11, :cond_20

    .line 792
    .line 793
    sget-object v11, Lxs3;->f:Ljava/util/LinkedHashSet;

    .line 794
    .line 795
    new-instance v13, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    invoke-direct {v13, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v13

    .line 810
    invoke-interface {v11, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    if-nez v11, :cond_20

    .line 815
    .line 816
    new-instance v11, Lpk3;

    .line 817
    .line 818
    sget-object v13, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 819
    .line 820
    invoke-direct {v11, v0, v14, v13}, Lpk3;-><init>(Lov3;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    goto :goto_14

    .line 824
    :cond_20
    :goto_13
    const/4 v11, 0x0

    .line 825
    :goto_14
    if-eqz v11, :cond_21

    .line 826
    .line 827
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    :cond_21
    add-int/lit8 v12, v12, 0x1

    .line 831
    .line 832
    move/from16 v11, v16

    .line 833
    .line 834
    const/4 v13, 0x0

    .line 835
    goto/16 :goto_f

    .line 836
    .line 837
    :cond_22
    :goto_15
    new-instance v0, Ljava/util/ArrayList;

    .line 838
    .line 839
    invoke-static {v8, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 844
    .line 845
    .line 846
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 851
    .line 852
    .line 853
    move-result v3

    .line 854
    if-eqz v3, :cond_23

    .line 855
    .line 856
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    check-cast v3, Lpk3;

    .line 861
    .line 862
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    goto :goto_16

    .line 869
    :cond_23
    invoke-static {v2, v0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    goto :goto_18

    .line 874
    :cond_24
    move/from16 v16, v11

    .line 875
    .line 876
    invoke-virtual {v2, v7}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    if-eqz v0, :cond_25

    .line 881
    .line 882
    goto :goto_18

    .line 883
    :cond_25
    invoke-virtual {v2}, Ljava/lang/Class;->isAnnotation()Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-nez v0, :cond_26

    .line 888
    .line 889
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    new-instance v8, Ljava/util/ArrayList;

    .line 897
    .line 898
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 899
    .line 900
    .line 901
    array-length v1, v0

    .line 902
    move/from16 v11, v16

    .line 903
    .line 904
    :goto_17
    if-ge v11, v1, :cond_27

    .line 905
    .line 906
    aget-object v2, v0, v11

    .line 907
    .line 908
    new-instance v3, Lpk3;

    .line 909
    .line 910
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    sget-object v4, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 914
    .line 915
    invoke-direct {v3, v12, v2, v4}, Lpk3;-><init>(Lov3;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    add-int/lit8 v11, v11, 0x1

    .line 922
    .line 923
    goto :goto_17

    .line 924
    :cond_26
    new-instance v0, Lrj3;

    .line 925
    .line 926
    invoke-direct {v0, v12}, Lrj3;-><init>(Lev3;)V

    .line 927
    .line 928
    .line 929
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 930
    .line 931
    .line 932
    move-result-object v8

    .line 933
    :cond_27
    :goto_18
    return-object v8

    .line 934
    :pswitch_4
    move/from16 v16, v11

    .line 935
    .line 936
    invoke-virtual {v0}, Lcv3;->a()Ljava/util/Collection;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    sget-object v1, Ly72;->a:Ltx0;

    .line 941
    .line 942
    sget-object v1, La32;->i:La32;

    .line 943
    .line 944
    sget-object v26, Lz22;->i:Lz22;

    .line 945
    .line 946
    new-instance v2, Ljava/util/HashMap;

    .line 947
    .line 948
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 949
    .line 950
    .line 951
    invoke-static {v12}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    move-result-object v3

    .line 955
    invoke-virtual {v3, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 956
    .line 957
    .line 958
    move-result-object v3

    .line 959
    if-eqz v3, :cond_28

    .line 960
    .line 961
    move v3, v10

    .line 962
    goto :goto_19

    .line 963
    :cond_28
    move/from16 v3, v16

    .line 964
    .line 965
    :goto_19
    new-instance v4, Ljava/util/HashMap;

    .line 966
    .line 967
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 968
    .line 969
    .line 970
    if-eqz v3, :cond_2a

    .line 971
    .line 972
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 973
    .line 974
    .line 975
    move-result-object v5

    .line 976
    :cond_29
    :goto_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 977
    .line 978
    .line 979
    move-result v6

    .line 980
    if-eqz v6, :cond_2a

    .line 981
    .line 982
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v6

    .line 986
    check-cast v6, Lkb6;

    .line 987
    .line 988
    invoke-static {v12, v6}, Ly72;->e(Lev3;Lkb6;)Z

    .line 989
    .line 990
    .line 991
    move-result v7

    .line 992
    if-nez v7, :cond_29

    .line 993
    .line 994
    invoke-static {v6, v1}, Ly72;->h(Lkb6;Lch3;)Lb32;

    .line 995
    .line 996
    .line 997
    move-result-object v7

    .line 998
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    goto :goto_1a

    .line 1002
    :cond_2a
    invoke-virtual {v12}, Lev3;->c()Ljava/util/List;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v5

    .line 1006
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v5

    .line 1010
    :cond_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v6

    .line 1014
    if-eqz v6, :cond_3c

    .line 1015
    .line 1016
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v6

    .line 1020
    check-cast v6, Lpw3;

    .line 1021
    .line 1022
    invoke-interface {v6}, Lpw3;->M()Llv3;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v7

    .line 1026
    instance-of v8, v7, Lzu3;

    .line 1027
    .line 1028
    if-eqz v8, :cond_2c

    .line 1029
    .line 1030
    check-cast v7, Lzu3;

    .line 1031
    .line 1032
    goto :goto_1b

    .line 1033
    :cond_2c
    const/4 v7, 0x0

    .line 1034
    :goto_1b
    if-eqz v7, :cond_3b

    .line 1035
    .line 1036
    sget-object v8, Lww3;->c:Lww3;

    .line 1037
    .line 1038
    invoke-static {v6}, Lmb6;->v(Lpw3;)Lww3;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v6

    .line 1042
    invoke-static {v7}, Ly72;->c(Lzu3;)Ljava/util/Map;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v7

    .line 1046
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v7

    .line 1050
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v7

    .line 1054
    :cond_2d
    :goto_1c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v8

    .line 1058
    if-eqz v8, :cond_2b

    .line 1059
    .line 1060
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v8

    .line 1064
    check-cast v8, Ljava/util/Map$Entry;

    .line 1065
    .line 1066
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v8

    .line 1070
    check-cast v8, Lkb6;

    .line 1071
    .line 1072
    move-object v9, v8

    .line 1073
    check-cast v9, Llb6;

    .line 1074
    .line 1075
    iget-object v9, v9, Llb6;->X:Lyu3;

    .line 1076
    .line 1077
    invoke-virtual {v9, v6}, Lyu3;->d(Lww3;)Lyu3;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v27

    .line 1081
    invoke-static {v8}, Ly72;->f(Lkb6;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v9

    .line 1085
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v30

    .line 1089
    invoke-static {v8}, Ly72;->d(Lkb6;)Lov3;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v31

    .line 1093
    invoke-interface {v8}, Lxu3;->getTypeParameters()Ljava/util/List;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v32

    .line 1097
    invoke-static {v8}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v33

    .line 1101
    const/16 v37, 0x0

    .line 1102
    .line 1103
    const/16 v38, 0x3c3

    .line 1104
    .line 1105
    const/16 v28, 0x0

    .line 1106
    .line 1107
    const/16 v29, 0x0

    .line 1108
    .line 1109
    const/16 v34, 0x0

    .line 1110
    .line 1111
    const/16 v35, 0x0

    .line 1112
    .line 1113
    const/16 v36, 0x0

    .line 1114
    .line 1115
    invoke-static/range {v27 .. v38}, Lyu3;->a(Lyu3;Lww3;Lex4;Ljava/lang/Boolean;Lov3;Ljava/util/List;Ljava/util/List;ZZZZI)Lyu3;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v9

    .line 1119
    invoke-interface {v8, v12, v9}, Lkb6;->A(Lov3;Lyu3;)Lkb6;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v8

    .line 1123
    invoke-static {v8, v1}, Ly72;->h(Lkb6;Lch3;)Lb32;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v9

    .line 1127
    invoke-virtual {v4, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v11

    .line 1131
    if-nez v11, :cond_2d

    .line 1132
    .line 1133
    new-instance v17, Lb32;

    .line 1134
    .line 1135
    iget-object v11, v9, Lb32;->a:Lf97;

    .line 1136
    .line 1137
    iget-object v13, v9, Lb32;->b:Ljava/lang/String;

    .line 1138
    .line 1139
    iget-object v14, v9, Lb32;->c:Ljava/lang/String;

    .line 1140
    .line 1141
    iget-object v15, v9, Lb32;->d:Ljava/util/List;

    .line 1142
    .line 1143
    iget-object v10, v9, Lb32;->e:Ljava/util/ArrayList;

    .line 1144
    .line 1145
    move-object/from16 v28, v0

    .line 1146
    .line 1147
    iget-object v0, v9, Lb32;->f:Ljava/util/List;

    .line 1148
    .line 1149
    move-object/from16 v23, v0

    .line 1150
    .line 1151
    iget-object v0, v9, Lb32;->g:Ljava/util/List;

    .line 1152
    .line 1153
    iget-boolean v9, v9, Lb32;->h:Z

    .line 1154
    .line 1155
    move-object/from16 v24, v0

    .line 1156
    .line 1157
    move/from16 v25, v9

    .line 1158
    .line 1159
    move-object/from16 v22, v10

    .line 1160
    .line 1161
    move-object/from16 v18, v11

    .line 1162
    .line 1163
    move-object/from16 v19, v13

    .line 1164
    .line 1165
    move-object/from16 v20, v14

    .line 1166
    .line 1167
    move-object/from16 v21, v15

    .line 1168
    .line 1169
    invoke-direct/range {v17 .. v26}, Lb32;-><init>(Lf97;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLch3;)V

    .line 1170
    .line 1171
    .line 1172
    move-object/from16 v0, v17

    .line 1173
    .line 1174
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v9

    .line 1178
    if-eqz v9, :cond_3a

    .line 1179
    .line 1180
    check-cast v9, Lkb6;

    .line 1181
    .line 1182
    sget-object v10, Ll71;->Y:Ll71;

    .line 1183
    .line 1184
    invoke-virtual {v10, v9, v8}, Ll71;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1185
    .line 1186
    .line 1187
    move-result v10

    .line 1188
    if-gtz v10, :cond_2e

    .line 1189
    .line 1190
    move-object v10, v9

    .line 1191
    goto :goto_1d

    .line 1192
    :cond_2e
    move-object v10, v8

    .line 1193
    :goto_1d
    instance-of v11, v9, Lpv3;

    .line 1194
    .line 1195
    if-eqz v11, :cond_38

    .line 1196
    .line 1197
    instance-of v11, v8, Lpv3;

    .line 1198
    .line 1199
    if-eqz v11, :cond_38

    .line 1200
    .line 1201
    invoke-interface {v10}, Lkb6;->D()Lov3;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v11

    .line 1205
    move-object v13, v10

    .line 1206
    check-cast v13, Llb6;

    .line 1207
    .line 1208
    iget-object v13, v13, Llb6;->X:Lyu3;

    .line 1209
    .line 1210
    sget-object v14, Ly72;->a:Ltx0;

    .line 1211
    .line 1212
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v14, v9, v8}, Ltx0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1216
    .line 1217
    .line 1218
    move-result v14

    .line 1219
    if-gtz v14, :cond_2f

    .line 1220
    .line 1221
    move-object v14, v9

    .line 1222
    goto :goto_1e

    .line 1223
    :cond_2f
    move-object v14, v8

    .line 1224
    :goto_1e
    invoke-interface {v14}, Lkb6;->m()Lex4;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v31

    .line 1228
    move-object v14, v9

    .line 1229
    check-cast v14, Llb6;

    .line 1230
    .line 1231
    iget-object v14, v14, Llb6;->X:Lyu3;

    .line 1232
    .line 1233
    iget-object v14, v14, Lyu3;->f:Ljava/util/List;

    .line 1234
    .line 1235
    move-object v15, v8

    .line 1236
    check-cast v15, Llb6;

    .line 1237
    .line 1238
    iget-object v15, v15, Llb6;->X:Lyu3;

    .line 1239
    .line 1240
    iget-object v15, v15, Lyu3;->f:Ljava/util/List;

    .line 1241
    .line 1242
    invoke-static {v14, v15}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v35

    .line 1246
    check-cast v9, Lpv3;

    .line 1247
    .line 1248
    invoke-interface {v9}, Lpv3;->k()Z

    .line 1249
    .line 1250
    .line 1251
    move-result v14

    .line 1252
    if-nez v14, :cond_31

    .line 1253
    .line 1254
    move-object v14, v8

    .line 1255
    check-cast v14, Lpv3;

    .line 1256
    .line 1257
    invoke-interface {v14}, Lpv3;->k()Z

    .line 1258
    .line 1259
    .line 1260
    move-result v14

    .line 1261
    if-eqz v14, :cond_30

    .line 1262
    .line 1263
    goto :goto_1f

    .line 1264
    :cond_30
    move/from16 v36, v16

    .line 1265
    .line 1266
    goto :goto_20

    .line 1267
    :cond_31
    :goto_1f
    const/16 v36, 0x1

    .line 1268
    .line 1269
    :goto_20
    invoke-interface {v9}, Lpv3;->o()Z

    .line 1270
    .line 1271
    .line 1272
    move-result v14

    .line 1273
    if-nez v14, :cond_33

    .line 1274
    .line 1275
    move-object v14, v8

    .line 1276
    check-cast v14, Lpv3;

    .line 1277
    .line 1278
    invoke-interface {v14}, Lpv3;->o()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v14

    .line 1282
    if-eqz v14, :cond_32

    .line 1283
    .line 1284
    goto :goto_21

    .line 1285
    :cond_32
    move/from16 v37, v16

    .line 1286
    .line 1287
    goto :goto_22

    .line 1288
    :cond_33
    :goto_21
    const/16 v37, 0x1

    .line 1289
    .line 1290
    :goto_22
    invoke-interface {v9}, Lpv3;->s()Z

    .line 1291
    .line 1292
    .line 1293
    move-result v14

    .line 1294
    if-nez v14, :cond_35

    .line 1295
    .line 1296
    move-object v14, v8

    .line 1297
    check-cast v14, Lpv3;

    .line 1298
    .line 1299
    invoke-interface {v14}, Lpv3;->s()Z

    .line 1300
    .line 1301
    .line 1302
    move-result v14

    .line 1303
    if-eqz v14, :cond_34

    .line 1304
    .line 1305
    goto :goto_23

    .line 1306
    :cond_34
    move/from16 v38, v16

    .line 1307
    .line 1308
    goto :goto_24

    .line 1309
    :cond_35
    :goto_23
    const/16 v38, 0x1

    .line 1310
    .line 1311
    :goto_24
    invoke-interface {v9}, Lpv3;->i()Z

    .line 1312
    .line 1313
    .line 1314
    move-result v9

    .line 1315
    if-nez v9, :cond_37

    .line 1316
    .line 1317
    move-object v9, v8

    .line 1318
    check-cast v9, Lpv3;

    .line 1319
    .line 1320
    invoke-interface {v9}, Lpv3;->i()Z

    .line 1321
    .line 1322
    .line 1323
    move-result v9

    .line 1324
    if-eqz v9, :cond_36

    .line 1325
    .line 1326
    goto :goto_25

    .line 1327
    :cond_36
    move/from16 v39, v16

    .line 1328
    .line 1329
    goto :goto_26

    .line 1330
    :cond_37
    :goto_25
    const/16 v39, 0x1

    .line 1331
    .line 1332
    :goto_26
    const/16 v40, 0x1d

    .line 1333
    .line 1334
    const/16 v30, 0x0

    .line 1335
    .line 1336
    const/16 v32, 0x0

    .line 1337
    .line 1338
    const/16 v33, 0x0

    .line 1339
    .line 1340
    const/16 v34, 0x0

    .line 1341
    .line 1342
    move-object/from16 v29, v13

    .line 1343
    .line 1344
    invoke-static/range {v29 .. v40}, Lyu3;->a(Lyu3;Lww3;Lex4;Ljava/lang/Boolean;Lov3;Ljava/util/List;Ljava/util/List;ZZZZI)Lyu3;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v9

    .line 1348
    invoke-interface {v10, v11, v9}, Lkb6;->A(Lov3;Lyu3;)Lkb6;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v10

    .line 1352
    :cond_38
    if-nez v10, :cond_39

    .line 1353
    .line 1354
    goto :goto_27

    .line 1355
    :cond_39
    move-object v8, v10

    .line 1356
    :cond_3a
    :goto_27
    invoke-virtual {v2, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-object/from16 v0, v28

    .line 1360
    .line 1361
    const/4 v10, 0x1

    .line 1362
    goto/16 :goto_1c

    .line 1363
    .line 1364
    :cond_3b
    const-string v0, "Non-denotable supertypes are not possible. Supertype \'"

    .line 1365
    .line 1366
    const-string v1, "\' appears non-denotable in class \'"

    .line 1367
    .line 1368
    invoke-static {v0, v6, v1, v12}, Lu52;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1369
    .line 1370
    .line 1371
    const/4 v13, 0x0

    .line 1372
    goto/16 :goto_2a

    .line 1373
    .line 1374
    :cond_3c
    move-object/from16 v28, v0

    .line 1375
    .line 1376
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1385
    .line 1386
    .line 1387
    move-result v1

    .line 1388
    if-eqz v1, :cond_3d

    .line 1389
    .line 1390
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    check-cast v1, Ljava/util/Map$Entry;

    .line 1395
    .line 1396
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v4

    .line 1400
    check-cast v4, Lb32;

    .line 1401
    .line 1402
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v1

    .line 1406
    check-cast v1, Lkb6;

    .line 1407
    .line 1408
    new-instance v17, Lb32;

    .line 1409
    .line 1410
    iget-object v5, v4, Lb32;->a:Lf97;

    .line 1411
    .line 1412
    iget-object v6, v4, Lb32;->b:Ljava/lang/String;

    .line 1413
    .line 1414
    iget-object v7, v4, Lb32;->c:Ljava/lang/String;

    .line 1415
    .line 1416
    iget-object v8, v4, Lb32;->d:Ljava/util/List;

    .line 1417
    .line 1418
    iget-object v9, v4, Lb32;->e:Ljava/util/ArrayList;

    .line 1419
    .line 1420
    iget-object v10, v4, Lb32;->f:Ljava/util/List;

    .line 1421
    .line 1422
    iget-object v11, v4, Lb32;->g:Ljava/util/List;

    .line 1423
    .line 1424
    iget-boolean v4, v4, Lb32;->h:Z

    .line 1425
    .line 1426
    move/from16 v25, v4

    .line 1427
    .line 1428
    move-object/from16 v18, v5

    .line 1429
    .line 1430
    move-object/from16 v19, v6

    .line 1431
    .line 1432
    move-object/from16 v20, v7

    .line 1433
    .line 1434
    move-object/from16 v21, v8

    .line 1435
    .line 1436
    move-object/from16 v22, v9

    .line 1437
    .line 1438
    move-object/from16 v23, v10

    .line 1439
    .line 1440
    move-object/from16 v24, v11

    .line 1441
    .line 1442
    invoke-direct/range {v17 .. v26}, Lb32;-><init>(Lf97;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLch3;)V

    .line 1443
    .line 1444
    .line 1445
    move-object/from16 v5, v17

    .line 1446
    .line 1447
    move-object/from16 v4, v26

    .line 1448
    .line 1449
    invoke-virtual {v2, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    goto :goto_28

    .line 1453
    :cond_3d
    move-object/from16 v4, v26

    .line 1454
    .line 1455
    if-nez v3, :cond_3f

    .line 1456
    .line 1457
    invoke-interface/range {v28 .. v28}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    :cond_3e
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1462
    .line 1463
    .line 1464
    move-result v1

    .line 1465
    if-eqz v1, :cond_3f

    .line 1466
    .line 1467
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v1

    .line 1471
    check-cast v1, Lkb6;

    .line 1472
    .line 1473
    invoke-static {v12, v1}, Ly72;->e(Lev3;Lkb6;)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v3

    .line 1477
    if-nez v3, :cond_3e

    .line 1478
    .line 1479
    invoke-static {v1, v4}, Ly72;->h(Lkb6;Lch3;)Lb32;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v3

    .line 1483
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    goto :goto_29

    .line 1487
    :cond_3f
    move-object v13, v2

    .line 1488
    :goto_2a
    return-object v13

    .line 1489
    :pswitch_5
    move/from16 v16, v11

    .line 1490
    .line 1491
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 1492
    .line 1493
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v2

    .line 1497
    if-eqz v2, :cond_44

    .line 1498
    .line 1499
    sget-object v3, Low;->f:Ldq;

    .line 1500
    .line 1501
    sget-object v4, Low;->a:[Lnw3;

    .line 1502
    .line 1503
    const/16 v5, 0xe

    .line 1504
    .line 1505
    aget-object v4, v4, v5

    .line 1506
    .line 1507
    invoke-virtual {v3, v4, v2}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v3

    .line 1511
    if-nez v3, :cond_40

    .line 1512
    .line 1513
    goto :goto_2c

    .line 1514
    :cond_40
    iget-object v3, v2, Lyy3;->n:Lmz3;

    .line 1515
    .line 1516
    const/16 v4, 0xc

    .line 1517
    .line 1518
    if-eqz v3, :cond_41

    .line 1519
    .line 1520
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v1

    .line 1524
    invoke-virtual {v0}, Lcv3;->d()Lli8;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    const/4 v2, 0x0

    .line 1529
    invoke-static {v3, v1, v0, v2, v4}, Lys0;->a0(Lmz3;Ljava/lang/ClassLoader;Lli8;Ldn2;I)Lu1;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v13

    .line 1533
    goto :goto_2d

    .line 1534
    :cond_41
    iget-object v3, v2, Lyy3;->f:Ljava/util/ArrayList;

    .line 1535
    .line 1536
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v3

    .line 1540
    move/from16 v11, v16

    .line 1541
    .line 1542
    const/4 v5, 0x0

    .line 1543
    :cond_42
    :goto_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1544
    .line 1545
    .line 1546
    move-result v6

    .line 1547
    if-eqz v6, :cond_45

    .line 1548
    .line 1549
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v6

    .line 1553
    move-object v7, v6

    .line 1554
    check-cast v7, Lkz3;

    .line 1555
    .line 1556
    iget-object v8, v7, Lkz3;->b:Ljava/lang/String;

    .line 1557
    .line 1558
    iget-object v9, v2, Lyy3;->m:Ljava/lang/String;

    .line 1559
    .line 1560
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1561
    .line 1562
    .line 1563
    move-result v8

    .line 1564
    if-eqz v8, :cond_42

    .line 1565
    .line 1566
    iget-object v8, v7, Lkz3;->h:Ljava/util/ArrayList;

    .line 1567
    .line 1568
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1569
    .line 1570
    .line 1571
    move-result v8

    .line 1572
    if-eqz v8, :cond_42

    .line 1573
    .line 1574
    iget-object v7, v7, Lkz3;->f:Lmz3;

    .line 1575
    .line 1576
    if-nez v7, :cond_42

    .line 1577
    .line 1578
    if-nez v11, :cond_43

    .line 1579
    .line 1580
    move-object v5, v6

    .line 1581
    const/4 v11, 0x1

    .line 1582
    goto :goto_2b

    .line 1583
    :cond_43
    const-string v0, "Collection contains more than one matching element."

    .line 1584
    .line 1585
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    :cond_44
    :goto_2c
    const/4 v13, 0x0

    .line 1589
    goto :goto_2d

    .line 1590
    :cond_45
    if-eqz v11, :cond_47

    .line 1591
    .line 1592
    check-cast v5, Lkz3;

    .line 1593
    .line 1594
    iget-object v2, v5, Lkz3;->j:Lmz3;

    .line 1595
    .line 1596
    if-eqz v2, :cond_46

    .line 1597
    .line 1598
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v1

    .line 1602
    invoke-virtual {v0}, Lcv3;->d()Lli8;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    const/4 v3, 0x0

    .line 1607
    invoke-static {v2, v1, v0, v3, v4}, Lys0;->a0(Lmz3;Ljava/lang/ClassLoader;Lli8;Ldn2;I)Lu1;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v13

    .line 1611
    goto :goto_2d

    .line 1612
    :cond_46
    const/4 v3, 0x0

    .line 1613
    const-string v0, "returnType"

    .line 1614
    .line 1615
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 1616
    .line 1617
    .line 1618
    throw v3

    .line 1619
    :cond_47
    const-string v0, "Collection contains no element matching the predicate."

    .line 1620
    .line 1621
    invoke-static {v0}, Lem7;->g(Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    goto :goto_2c

    .line 1625
    :goto_2d
    return-object v13

    .line 1626
    :pswitch_6
    move/from16 v16, v11

    .line 1627
    .line 1628
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 1629
    .line 1630
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v2

    .line 1634
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    if-eqz v0, :cond_49

    .line 1639
    .line 1640
    iget-object v0, v0, Lyy3;->l:Ljava/util/ArrayList;

    .line 1641
    .line 1642
    new-instance v8, Ljava/util/ArrayList;

    .line 1643
    .line 1644
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1652
    .line 1653
    .line 1654
    move-result v1

    .line 1655
    if-eqz v1, :cond_4e

    .line 1656
    .line 1657
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    check-cast v1, Ljava/lang/String;

    .line 1662
    .line 1663
    move/from16 v3, v16

    .line 1664
    .line 1665
    invoke-static {v2, v1, v3}, Lys0;->I(Ljava/lang/ClassLoader;Ljava/lang/String;Z)Lzu3;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v1

    .line 1669
    if-eqz v1, :cond_48

    .line 1670
    .line 1671
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1672
    .line 1673
    .line 1674
    :cond_48
    const/16 v16, 0x0

    .line 1675
    .line 1676
    goto :goto_2e

    .line 1677
    :cond_49
    invoke-static {v1}, Lz68;->r0(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1682
    .line 1683
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v0

    .line 1687
    if-eqz v0, :cond_4e

    .line 1688
    .line 1689
    invoke-static {}, Lz68;->V()Lz47;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    iget-object v0, v0, Lz47;->Z:Ljava/lang/Object;

    .line 1694
    .line 1695
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1696
    .line 1697
    if-nez v0, :cond_4a

    .line 1698
    .line 1699
    const/4 v2, 0x0

    .line 1700
    goto :goto_2f

    .line 1701
    :cond_4a
    const/4 v2, 0x0

    .line 1702
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v0

    .line 1706
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1707
    .line 1708
    .line 1709
    move-object v2, v0

    .line 1710
    check-cast v2, [Ljava/lang/Class;

    .line 1711
    .line 1712
    :goto_2f
    if-eqz v2, :cond_4b

    .line 1713
    .line 1714
    new-instance v13, Ljava/util/ArrayList;

    .line 1715
    .line 1716
    array-length v0, v2

    .line 1717
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1718
    .line 1719
    .line 1720
    array-length v0, v2

    .line 1721
    const/4 v11, 0x0

    .line 1722
    :goto_30
    if-ge v11, v0, :cond_4c

    .line 1723
    .line 1724
    aget-object v1, v2, v11

    .line 1725
    .line 1726
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1727
    .line 1728
    .line 1729
    sget-object v3, Lyb6;->a:Lzb6;

    .line 1730
    .line 1731
    invoke-virtual {v3, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v1

    .line 1735
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1736
    .line 1737
    .line 1738
    add-int/lit8 v11, v11, 0x1

    .line 1739
    .line 1740
    goto :goto_30

    .line 1741
    :cond_4b
    const/4 v13, 0x0

    .line 1742
    :cond_4c
    if-nez v13, :cond_4d

    .line 1743
    .line 1744
    goto :goto_31

    .line 1745
    :cond_4d
    move-object v8, v13

    .line 1746
    :cond_4e
    :goto_31
    return-object v8

    .line 1747
    :pswitch_7
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 1748
    .line 1749
    const-class v4, Ljava/lang/Object;

    .line 1750
    .line 1751
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v5

    .line 1755
    if-eqz v5, :cond_4f

    .line 1756
    .line 1757
    goto/16 :goto_4a

    .line 1758
    .line 1759
    :cond_4f
    sget-boolean v5, Lq08;->a:Z

    .line 1760
    .line 1761
    if-eqz v5, :cond_57

    .line 1762
    .line 1763
    invoke-virtual {v0}, Lcv3;->b()Lsx4;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v1

    .line 1767
    invoke-interface {v1}, Lot0;->l()Llh8;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v1

    .line 1771
    invoke-interface {v1}, Llh8;->c()Ljava/util/Collection;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v1

    .line 1775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1776
    .line 1777
    .line 1778
    new-instance v3, Ljava/util/ArrayList;

    .line 1779
    .line 1780
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1781
    .line 1782
    .line 1783
    move-result v4

    .line 1784
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1785
    .line 1786
    .line 1787
    check-cast v1, Ljava/lang/Iterable;

    .line 1788
    .line 1789
    iget-object v4, v0, Lcv3;->q:Lev3;

    .line 1790
    .line 1791
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v1

    .line 1795
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1796
    .line 1797
    .line 1798
    move-result v5

    .line 1799
    if-eqz v5, :cond_50

    .line 1800
    .line 1801
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v5

    .line 1805
    check-cast v5, Lt14;

    .line 1806
    .line 1807
    new-instance v6, Lkk1;

    .line 1808
    .line 1809
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    new-instance v7, Lc3;

    .line 1813
    .line 1814
    invoke-direct {v7, v5, v4, v2}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1815
    .line 1816
    .line 1817
    const/4 v8, 0x0

    .line 1818
    invoke-direct {v6, v5, v7, v8}, Lkk1;-><init>(Lt14;Ldn2;Z)V

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1822
    .line 1823
    .line 1824
    goto :goto_32

    .line 1825
    :cond_50
    invoke-virtual {v0}, Lcv3;->b()Lsx4;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v0

    .line 1829
    sget-object v1, Lzz3;->e:Lv15;

    .line 1830
    .line 1831
    sget-object v1, Ltg7;->a:Lgk2;

    .line 1832
    .line 1833
    invoke-static {v0, v1}, Lzz3;->b(Lsx4;Lgk2;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v1

    .line 1837
    if-nez v1, :cond_56

    .line 1838
    .line 1839
    sget-object v1, Ltg7;->b:Lgk2;

    .line 1840
    .line 1841
    invoke-static {v0, v1}, Lzz3;->b(Lsx4;Lgk2;)Z

    .line 1842
    .line 1843
    .line 1844
    move-result v0

    .line 1845
    if-eqz v0, :cond_51

    .line 1846
    .line 1847
    goto :goto_36

    .line 1848
    :cond_51
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1849
    .line 1850
    .line 1851
    move-result v0

    .line 1852
    if-eqz v0, :cond_52

    .line 1853
    .line 1854
    goto :goto_35

    .line 1855
    :cond_52
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    :cond_53
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v1

    .line 1863
    if-eqz v1, :cond_55

    .line 1864
    .line 1865
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    check-cast v1, Lpw3;

    .line 1870
    .line 1871
    invoke-interface {v1}, Lpw3;->M()Llv3;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v1

    .line 1875
    instance-of v2, v1, Lev3;

    .line 1876
    .line 1877
    if-eqz v2, :cond_54

    .line 1878
    .line 1879
    move-object v2, v1

    .line 1880
    check-cast v2, Lev3;

    .line 1881
    .line 1882
    goto :goto_34

    .line 1883
    :cond_54
    const/4 v2, 0x0

    .line 1884
    :goto_34
    if-eqz v2, :cond_56

    .line 1885
    .line 1886
    invoke-virtual {v2}, Lev3;->g0()Lts0;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v1

    .line 1890
    sget-object v4, Lts0;->Z:Lts0;

    .line 1891
    .line 1892
    if-eq v1, v4, :cond_53

    .line 1893
    .line 1894
    invoke-virtual {v2}, Lev3;->g0()Lts0;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v1

    .line 1898
    sget-object v2, Lts0;->h0:Lts0;

    .line 1899
    .line 1900
    if-ne v1, v2, :cond_56

    .line 1901
    .line 1902
    goto :goto_33

    .line 1903
    :cond_55
    :goto_35
    sget-object v0, Lrg7;->a:Lpw3;

    .line 1904
    .line 1905
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1906
    .line 1907
    .line 1908
    :cond_56
    :goto_36
    invoke-static {v3}, Lys0;->m(Ljava/util/ArrayList;)Ljava/util/List;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v8

    .line 1912
    goto/16 :goto_4a

    .line 1913
    .line 1914
    :cond_57
    new-instance v2, Ljava/util/ArrayList;

    .line 1915
    .line 1916
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1917
    .line 1918
    .line 1919
    invoke-virtual {v0}, Lcv3;->c()Lyy3;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v5

    .line 1923
    if-eqz v5, :cond_58

    .line 1924
    .line 1925
    iget-object v5, v5, Lyy3;->d:Ljava/util/ArrayList;

    .line 1926
    .line 1927
    goto :goto_37

    .line 1928
    :cond_58
    const/4 v5, 0x0

    .line 1929
    :goto_37
    const/4 v6, 0x2

    .line 1930
    if-eqz v5, :cond_61

    .line 1931
    .line 1932
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v3

    .line 1936
    :goto_38
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1937
    .line 1938
    .line 1939
    move-result v4

    .line 1940
    if-eqz v4, :cond_5c

    .line 1941
    .line 1942
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v4

    .line 1946
    check-cast v4, Lmz3;

    .line 1947
    .line 1948
    invoke-virtual {v4}, Lmz3;->a()Li21;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v5

    .line 1952
    instance-of v7, v5, Lzy3;

    .line 1953
    .line 1954
    if-eqz v7, :cond_59

    .line 1955
    .line 1956
    check-cast v5, Lzy3;

    .line 1957
    .line 1958
    goto :goto_39

    .line 1959
    :cond_59
    const/4 v5, 0x0

    .line 1960
    :goto_39
    if-eqz v5, :cond_5b

    .line 1961
    .line 1962
    iget-object v5, v5, Lzy3;->i0:Ljava/lang/String;

    .line 1963
    .line 1964
    if-eqz v5, :cond_5b

    .line 1965
    .line 1966
    invoke-static {v5}, Lys0;->Y(Ljava/lang/String;)Lqs0;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v5

    .line 1970
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v7

    .line 1974
    const/4 v8, 0x0

    .line 1975
    invoke-static {v7, v5, v8}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v7

    .line 1979
    if-eqz v7, :cond_5a

    .line 1980
    .line 1981
    invoke-static {v1}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v8

    .line 1985
    invoke-virtual {v0}, Lcv3;->d()Lli8;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v9

    .line 1989
    new-instance v10, Lem1;

    .line 1990
    .line 1991
    invoke-direct {v10, v12, v7, v5, v6}, Lem1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1992
    .line 1993
    .line 1994
    const/4 v5, 0x4

    .line 1995
    invoke-static {v4, v8, v9, v10, v5}, Lys0;->a0(Lmz3;Ljava/lang/ClassLoader;Lli8;Ldn2;I)Lu1;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v4

    .line 1999
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2000
    .line 2001
    .line 2002
    goto :goto_38

    .line 2003
    :cond_5a
    const-string v0, "Unsupported superclass of "

    .line 2004
    .line 2005
    const-string v1, ": "

    .line 2006
    .line 2007
    invoke-static {v0, v12, v1, v5}, Lb61;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2008
    .line 2009
    .line 2010
    const/4 v8, 0x0

    .line 2011
    goto/16 :goto_4a

    .line 2012
    .line 2013
    :cond_5b
    new-instance v0, Lp14;

    .line 2014
    .line 2015
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2016
    .line 2017
    const-string v2, "Supertype of "

    .line 2018
    .line 2019
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2023
    .line 2024
    .line 2025
    invoke-virtual {v4}, Lmz3;->a()Li21;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v2

    .line 2029
    const-string v3, " not a class: "

    .line 2030
    .line 2031
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2032
    .line 2033
    .line 2034
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2035
    .line 2036
    .line 2037
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v1

    .line 2041
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 2042
    .line 2043
    .line 2044
    throw v0

    .line 2045
    :cond_5c
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 2046
    .line 2047
    .line 2048
    move-result v3

    .line 2049
    if-eqz v3, :cond_5d

    .line 2050
    .line 2051
    sget-object v3, Lrg7;->c:Lpw3;

    .line 2052
    .line 2053
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2054
    .line 2055
    .line 2056
    :cond_5d
    invoke-static {v1}, Lia6;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v3

    .line 2060
    if-nez v3, :cond_5e

    .line 2061
    .line 2062
    move-object v3, v1

    .line 2063
    :cond_5e
    const-class v4, Ljava/io/Serializable;

    .line 2064
    .line 2065
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v3

    .line 2069
    if-eqz v3, :cond_5f

    .line 2070
    .line 2071
    sget-object v3, Lrg7;->d:Lpw3;

    .line 2072
    .line 2073
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2074
    .line 2075
    .line 2076
    move-result v4

    .line 2077
    if-nez v4, :cond_5f

    .line 2078
    .line 2079
    iget-object v0, v0, Lcv3;->g:Ltb6;

    .line 2080
    .line 2081
    sget-object v4, Lcv3;->r:[Lnw3;

    .line 2082
    .line 2083
    const/4 v5, 0x3

    .line 2084
    aget-object v4, v4, v5

    .line 2085
    .line 2086
    invoke-virtual {v0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v0

    .line 2090
    check-cast v0, Ljava/lang/String;

    .line 2091
    .line 2092
    if-eqz v0, :cond_5f

    .line 2093
    .line 2094
    const-string v4, "kotlin."

    .line 2095
    .line 2096
    const/4 v8, 0x0

    .line 2097
    invoke-static {v0, v8, v4}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 2098
    .line 2099
    .line 2100
    move-result v0

    .line 2101
    const/4 v4, 0x1

    .line 2102
    if-ne v0, v4, :cond_5f

    .line 2103
    .line 2104
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 2105
    .line 2106
    .line 2107
    move-result v0

    .line 2108
    if-nez v0, :cond_60

    .line 2109
    .line 2110
    sget-object v0, Lll3;->a:Ljava/lang/String;

    .line 2111
    .line 2112
    invoke-virtual {v12}, Lev3;->f0()Lqs0;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v0

    .line 2116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2117
    .line 2118
    .line 2119
    sget-object v1, Lll3;->n:Ljava/util/LinkedHashSet;

    .line 2120
    .line 2121
    invoke-virtual {v0}, Lqs0;->a()Lfk2;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v0

    .line 2125
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2126
    .line 2127
    .line 2128
    move-result v0

    .line 2129
    if-eqz v0, :cond_5f

    .line 2130
    .line 2131
    goto :goto_3b

    .line 2132
    :cond_5f
    :goto_3a
    const/4 v9, 0x0

    .line 2133
    goto/16 :goto_46

    .line 2134
    .line 2135
    :cond_60
    :goto_3b
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2136
    .line 2137
    .line 2138
    goto :goto_3a

    .line 2139
    :cond_61
    invoke-virtual {v12}, Lev3;->Q()Ljava/util/List;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v0

    .line 2143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v0

    .line 2147
    :cond_62
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2148
    .line 2149
    .line 2150
    move-result v5

    .line 2151
    if-eqz v5, :cond_63

    .line 2152
    .line 2153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v5

    .line 2157
    move-object v7, v5

    .line 2158
    check-cast v7, Ljava/lang/annotation/Annotation;

    .line 2159
    .line 2160
    instance-of v7, v7, Lz16;

    .line 2161
    .line 2162
    if-eqz v7, :cond_62

    .line 2163
    .line 2164
    goto :goto_3c

    .line 2165
    :cond_63
    const/4 v5, 0x0

    .line 2166
    :goto_3c
    check-cast v5, Lz16;

    .line 2167
    .line 2168
    if-eqz v5, :cond_65

    .line 2169
    .line 2170
    invoke-interface {v5}, Lz16;->value()Ljava/lang/String;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v0

    .line 2174
    if-eqz v0, :cond_65

    .line 2175
    .line 2176
    new-instance v5, Lfk2;

    .line 2177
    .line 2178
    invoke-direct {v5, v0}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 2179
    .line 2180
    .line 2181
    iget-object v0, v5, Lfk2;->a:Lgk2;

    .line 2182
    .line 2183
    invoke-virtual {v0}, Lgk2;->c()Z

    .line 2184
    .line 2185
    .line 2186
    move-result v7

    .line 2187
    if-nez v7, :cond_64

    .line 2188
    .line 2189
    sget-object v7, Lug7;->j:Lv15;

    .line 2190
    .line 2191
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2192
    .line 2193
    .line 2194
    invoke-virtual {v0, v7}, Lgk2;->h(Lv15;)Z

    .line 2195
    .line 2196
    .line 2197
    move-result v0

    .line 2198
    if-eqz v0, :cond_64

    .line 2199
    .line 2200
    goto :goto_3d

    .line 2201
    :cond_64
    const/4 v5, 0x0

    .line 2202
    :goto_3d
    if-eqz v5, :cond_65

    .line 2203
    .line 2204
    new-instance v0, Lqs0;

    .line 2205
    .line 2206
    invoke-virtual {v5}, Lfk2;->b()Lfk2;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v7

    .line 2210
    iget-object v5, v5, Lfk2;->a:Lgk2;

    .line 2211
    .line 2212
    invoke-virtual {v5}, Lgk2;->g()Lv15;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v5

    .line 2216
    invoke-direct {v0, v7, v5}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 2217
    .line 2218
    .line 2219
    goto :goto_3e

    .line 2220
    :cond_65
    const/4 v0, 0x0

    .line 2221
    :goto_3e
    if-nez v0, :cond_66

    .line 2222
    .line 2223
    sget-object v5, Lz72;->a:Ljava/util/LinkedHashMap;

    .line 2224
    .line 2225
    invoke-virtual {v12}, Lev3;->f0()Lqs0;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v5

    .line 2229
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2230
    .line 2231
    .line 2232
    sget-object v7, Lz72;->a:Ljava/util/LinkedHashMap;

    .line 2233
    .line 2234
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v5

    .line 2238
    check-cast v5, Lqs0;

    .line 2239
    .line 2240
    if-nez v5, :cond_67

    .line 2241
    .line 2242
    :goto_3f
    const/4 v0, 0x0

    .line 2243
    const/4 v9, 0x0

    .line 2244
    goto/16 :goto_43

    .line 2245
    .line 2246
    :cond_66
    move-object v5, v0

    .line 2247
    :cond_67
    invoke-static {v12}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v7

    .line 2251
    invoke-static {v7}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v7

    .line 2255
    const/4 v8, 0x0

    .line 2256
    invoke-static {v7, v5, v8}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v5

    .line 2260
    if-nez v5, :cond_68

    .line 2261
    .line 2262
    goto :goto_3f

    .line 2263
    :cond_68
    invoke-static {v5}, Lw51;->f(Ljava/lang/Class;)Ljava/util/List;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v7

    .line 2267
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 2268
    .line 2269
    .line 2270
    move-result v7

    .line 2271
    invoke-virtual {v12}, Lev3;->getTypeParameters()Ljava/util/List;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v8

    .line 2275
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2276
    .line 2277
    .line 2278
    move-result v10

    .line 2279
    if-ne v10, v7, :cond_6a

    .line 2280
    .line 2281
    new-instance v0, Ljava/util/ArrayList;

    .line 2282
    .line 2283
    invoke-static {v8, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 2284
    .line 2285
    .line 2286
    move-result v7

    .line 2287
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2288
    .line 2289
    .line 2290
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v7

    .line 2294
    :goto_40
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2295
    .line 2296
    .line 2297
    move-result v8

    .line 2298
    if-eqz v8, :cond_69

    .line 2299
    .line 2300
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2301
    .line 2302
    .line 2303
    move-result-object v8

    .line 2304
    check-cast v8, Lrw3;

    .line 2305
    .line 2306
    sget-object v9, Luw3;->c:Luw3;

    .line 2307
    .line 2308
    const/4 v9, 0x0

    .line 2309
    invoke-static {v8, v9, v3}, Lw45;->E(Llv3;Ljava/util/List;I)Lu1;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v8

    .line 2313
    invoke-static {v8}, Lhi5;->g0(Lpw3;)Luw3;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v8

    .line 2317
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2318
    .line 2319
    .line 2320
    goto :goto_40

    .line 2321
    :cond_69
    const/4 v9, 0x0

    .line 2322
    goto :goto_42

    .line 2323
    :cond_6a
    const/4 v9, 0x0

    .line 2324
    const/4 v11, 0x1

    .line 2325
    if-ne v10, v11, :cond_6c

    .line 2326
    .line 2327
    if-le v7, v11, :cond_6c

    .line 2328
    .line 2329
    if-nez v0, :cond_6c

    .line 2330
    .line 2331
    sget-object v0, Luw3;->c:Luw3;

    .line 2332
    .line 2333
    invoke-static {v8}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v0

    .line 2337
    check-cast v0, Llv3;

    .line 2338
    .line 2339
    invoke-static {v0, v9, v3}, Lw45;->E(Llv3;Ljava/util/List;I)Lu1;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v0

    .line 2343
    invoke-static {v0}, Lhi5;->g0(Lpw3;)Luw3;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v0

    .line 2347
    new-instance v3, Ljava/util/ArrayList;

    .line 2348
    .line 2349
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2350
    .line 2351
    .line 2352
    const/4 v8, 0x0

    .line 2353
    :goto_41
    if-ge v8, v7, :cond_6b

    .line 2354
    .line 2355
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2356
    .line 2357
    .line 2358
    add-int/lit8 v8, v8, 0x1

    .line 2359
    .line 2360
    goto :goto_41

    .line 2361
    :cond_6b
    move-object v0, v3

    .line 2362
    :goto_42
    sget-object v3, Lyb6;->a:Lzb6;

    .line 2363
    .line 2364
    invoke-virtual {v3, v5}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v3

    .line 2368
    const/4 v8, 0x0

    .line 2369
    invoke-static {v5, v3, v0, v8}, Lw51;->r(Ljava/lang/reflect/Type;Llv3;Ljava/util/List;Z)Ls97;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v0

    .line 2373
    invoke-static {v0, v5}, Lw51;->s(Ls97;Ljava/lang/reflect/Type;)Ls97;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v3

    .line 2377
    if-eqz v3, :cond_6d

    .line 2378
    .line 2379
    move-object v0, v3

    .line 2380
    goto :goto_43

    .line 2381
    :cond_6c
    move-object v0, v9

    .line 2382
    :cond_6d
    :goto_43
    new-instance v3, Lps;

    .line 2383
    .line 2384
    invoke-direct {v3, v6}, Lps;-><init>(I)V

    .line 2385
    .line 2386
    .line 2387
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 2388
    .line 2389
    .line 2390
    move-result-object v5

    .line 2391
    invoke-virtual {v3, v5}, Lps;->b(Ljava/lang/Object;)V

    .line 2392
    .line 2393
    .line 2394
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v1

    .line 2398
    invoke-virtual {v3, v1}, Lps;->c(Ljava/lang/Object;)V

    .line 2399
    .line 2400
    .line 2401
    iget-object v1, v3, Lps;->b:Ljava/util/ArrayList;

    .line 2402
    .line 2403
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2404
    .line 2405
    .line 2406
    move-result v3

    .line 2407
    new-array v3, v3, [Ljava/lang/reflect/Type;

    .line 2408
    .line 2409
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v1

    .line 2413
    invoke-static {v1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v1

    .line 2417
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v1

    .line 2421
    :cond_6e
    :goto_44
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2422
    .line 2423
    .line 2424
    move-result v3

    .line 2425
    if-eqz v3, :cond_71

    .line 2426
    .line 2427
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v3

    .line 2431
    move-object v10, v3

    .line 2432
    check-cast v10, Ljava/lang/reflect/Type;

    .line 2433
    .line 2434
    if-eqz v10, :cond_6e

    .line 2435
    .line 2436
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2437
    .line 2438
    .line 2439
    move-result v3

    .line 2440
    if-nez v3, :cond_6e

    .line 2441
    .line 2442
    if-eqz v0, :cond_6f

    .line 2443
    .line 2444
    iget-object v3, v0, Ls97;->Y:Llv3;

    .line 2445
    .line 2446
    goto :goto_45

    .line 2447
    :cond_6f
    move-object v3, v9

    .line 2448
    :goto_45
    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2449
    .line 2450
    .line 2451
    move-result v3

    .line 2452
    if-eqz v3, :cond_70

    .line 2453
    .line 2454
    goto :goto_44

    .line 2455
    :cond_70
    sget-object v15, Laj8;->X:Laj8;

    .line 2456
    .line 2457
    const/16 v16, 0xc

    .line 2458
    .line 2459
    sget-object v11, Le02;->X:Le02;

    .line 2460
    .line 2461
    sget-object v12, Lgi8;->X:Lgi8;

    .line 2462
    .line 2463
    const/4 v13, 0x0

    .line 2464
    const/4 v14, 0x0

    .line 2465
    invoke-static/range {v10 .. v16}, Lw51;->Q(Ljava/lang/reflect/Type;Ljava/util/Map;Lgi8;ZZLaj8;I)Lpw3;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v3

    .line 2469
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2470
    .line 2471
    .line 2472
    goto :goto_44

    .line 2473
    :cond_71
    if-eqz v0, :cond_72

    .line 2474
    .line 2475
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2476
    .line 2477
    .line 2478
    :cond_72
    :goto_46
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2479
    .line 2480
    .line 2481
    move-result v0

    .line 2482
    if-eqz v0, :cond_73

    .line 2483
    .line 2484
    goto :goto_49

    .line 2485
    :cond_73
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v0

    .line 2489
    :cond_74
    :goto_47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2490
    .line 2491
    .line 2492
    move-result v1

    .line 2493
    if-eqz v1, :cond_76

    .line 2494
    .line 2495
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v1

    .line 2499
    check-cast v1, Lpw3;

    .line 2500
    .line 2501
    invoke-interface {v1}, Lpw3;->M()Llv3;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v1

    .line 2505
    instance-of v3, v1, Lev3;

    .line 2506
    .line 2507
    if-eqz v3, :cond_75

    .line 2508
    .line 2509
    check-cast v1, Lev3;

    .line 2510
    .line 2511
    goto :goto_48

    .line 2512
    :cond_75
    move-object v1, v9

    .line 2513
    :goto_48
    if-eqz v1, :cond_77

    .line 2514
    .line 2515
    invoke-virtual {v1}, Lev3;->g0()Lts0;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v3

    .line 2519
    sget-object v4, Lts0;->Z:Lts0;

    .line 2520
    .line 2521
    if-eq v3, v4, :cond_74

    .line 2522
    .line 2523
    invoke-virtual {v1}, Lev3;->g0()Lts0;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v1

    .line 2527
    sget-object v3, Lts0;->h0:Lts0;

    .line 2528
    .line 2529
    if-ne v1, v3, :cond_77

    .line 2530
    .line 2531
    goto :goto_47

    .line 2532
    :cond_76
    :goto_49
    sget-object v0, Lrg7;->a:Lpw3;

    .line 2533
    .line 2534
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2535
    .line 2536
    .line 2537
    :cond_77
    invoke-static {v2}, Lys0;->m(Ljava/util/ArrayList;)Ljava/util/List;

    .line 2538
    .line 2539
    .line 2540
    move-result-object v8

    .line 2541
    :goto_4a
    return-object v8

    .line 2542
    :pswitch_8
    move-object v9, v13

    .line 2543
    iget-object v1, v12, Lev3;->Y:Ljava/lang/Class;

    .line 2544
    .line 2545
    sget-boolean v4, Lq08;->c:Z

    .line 2546
    .line 2547
    if-eqz v4, :cond_7a

    .line 2548
    .line 2549
    invoke-virtual {v1, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v0

    .line 2553
    check-cast v0, Lkotlin/Metadata;

    .line 2554
    .line 2555
    if-eqz v0, :cond_79

    .line 2556
    .line 2557
    sget-object v1, Lpx0;->a:Ljava/util/LinkedHashSet;

    .line 2558
    .line 2559
    invoke-virtual {v12}, Lev3;->f0()Lqs0;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v2

    .line 2563
    invoke-virtual {v2}, Lqs0;->e()Lqs0;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v2

    .line 2567
    invoke-static {v1, v2}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 2568
    .line 2569
    .line 2570
    move-result v1

    .line 2571
    if-nez v1, :cond_79

    .line 2572
    .line 2573
    invoke-static {v0}, Lz51;->O(Lkotlin/Metadata;)Lz91;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v0

    .line 2577
    instance-of v1, v0, Lc04;

    .line 2578
    .line 2579
    if-eqz v1, :cond_78

    .line 2580
    .line 2581
    move-object v2, v0

    .line 2582
    check-cast v2, Lc04;

    .line 2583
    .line 2584
    goto :goto_4b

    .line 2585
    :cond_78
    move-object v2, v9

    .line 2586
    :goto_4b
    if-eqz v2, :cond_7e

    .line 2587
    .line 2588
    iget-object v13, v2, Lc04;->f:Lyy3;

    .line 2589
    .line 2590
    goto/16 :goto_4f

    .line 2591
    .line 2592
    :cond_79
    invoke-virtual {v12}, Lev3;->f0()Lqs0;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v0

    .line 2596
    invoke-static {v0}, Lva0;->b(Lqs0;)Lyy3;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v13

    .line 2600
    goto/16 :goto_4f

    .line 2601
    .line 2602
    :cond_7a
    invoke-virtual {v0}, Lcv3;->b()Lsx4;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v0

    .line 2606
    instance-of v4, v0, Ldo2;

    .line 2607
    .line 2608
    const/16 v5, 0x8

    .line 2609
    .line 2610
    const/16 v6, 0x9

    .line 2611
    .line 2612
    if-eqz v4, :cond_7f

    .line 2613
    .line 2614
    move-object v1, v0

    .line 2615
    check-cast v1, Ldo2;

    .line 2616
    .line 2617
    iget-object v2, v1, Ldo2;->i0:Lso2;

    .line 2618
    .line 2619
    instance-of v4, v2, Loo2;

    .line 2620
    .line 2621
    if-eqz v4, :cond_7d

    .line 2622
    .line 2623
    iget v0, v1, Ldo2;->j0:I

    .line 2624
    .line 2625
    sget-object v1, Lva0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2626
    .line 2627
    new-instance v13, Lyy3;

    .line 2628
    .line 2629
    invoke-direct {v13}, Lyy3;-><init>()V

    .line 2630
    .line 2631
    .line 2632
    const-string v1, "kotlin/Function"

    .line 2633
    .line 2634
    invoke-static {v0, v1}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v2

    .line 2638
    iput-object v2, v13, Lyy3;->b:Ljava/lang/String;

    .line 2639
    .line 2640
    sget-object v2, Lts0;->Z:Lts0;

    .line 2641
    .line 2642
    sget-object v4, Low;->a:[Lnw3;

    .line 2643
    .line 2644
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2645
    .line 2646
    .line 2647
    sget-object v4, Low;->d:Lz47;

    .line 2648
    .line 2649
    sget-object v7, Low;->a:[Lnw3;

    .line 2650
    .line 2651
    aget-object v6, v7, v6

    .line 2652
    .line 2653
    invoke-virtual {v4, v13, v6, v2}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2654
    .line 2655
    .line 2656
    sget-object v2, Lex4;->f0:Lex4;

    .line 2657
    .line 2658
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2659
    .line 2660
    .line 2661
    sget-object v4, Low;->b:Lz47;

    .line 2662
    .line 2663
    aget-object v3, v7, v3

    .line 2664
    .line 2665
    invoke-virtual {v4, v13, v3, v2}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2666
    .line 2667
    .line 2668
    sget-object v2, Lgz8;->g0:Lgz8;

    .line 2669
    .line 2670
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2671
    .line 2672
    .line 2673
    sget-object v3, Low;->c:Lz47;

    .line 2674
    .line 2675
    aget-object v4, v7, v5

    .line 2676
    .line 2677
    invoke-virtual {v3, v13, v4, v2}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2678
    .line 2679
    .line 2680
    iget-object v2, v13, Lyy3;->c:Ljava/util/ArrayList;

    .line 2681
    .line 2682
    const/4 v4, 0x1

    .line 2683
    if-gt v4, v0, :cond_7c

    .line 2684
    .line 2685
    const/4 v4, 0x1

    .line 2686
    :goto_4c
    new-instance v3, Loz3;

    .line 2687
    .line 2688
    const-string v5, "P"

    .line 2689
    .line 2690
    invoke-static {v4, v5}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v5

    .line 2694
    sget-object v6, Lrz3;->Y:Lrz3;

    .line 2695
    .line 2696
    const/4 v8, 0x0

    .line 2697
    invoke-direct {v3, v8, v5, v4, v6}, Loz3;-><init>(ILjava/lang/String;ILrz3;)V

    .line 2698
    .line 2699
    .line 2700
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2701
    .line 2702
    .line 2703
    if-eq v4, v0, :cond_7b

    .line 2704
    .line 2705
    add-int/lit8 v4, v4, 0x1

    .line 2706
    .line 2707
    goto :goto_4c

    .line 2708
    :cond_7b
    const/16 v27, 0x1

    .line 2709
    .line 2710
    goto :goto_4d

    .line 2711
    :cond_7c
    move/from16 v27, v4

    .line 2712
    .line 2713
    :goto_4d
    add-int/lit8 v0, v0, 0x1

    .line 2714
    .line 2715
    new-instance v3, Loz3;

    .line 2716
    .line 2717
    const-string v4, "R"

    .line 2718
    .line 2719
    sget-object v5, Lrz3;->Z:Lrz3;

    .line 2720
    .line 2721
    const/4 v8, 0x0

    .line 2722
    invoke-direct {v3, v8, v4, v0, v5}, Loz3;-><init>(ILjava/lang/String;ILrz3;)V

    .line 2723
    .line 2724
    .line 2725
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2726
    .line 2727
    .line 2728
    new-instance v2, Lmz3;

    .line 2729
    .line 2730
    invoke-direct {v2, v8}, Lmz3;-><init>(I)V

    .line 2731
    .line 2732
    .line 2733
    new-instance v3, Lzy3;

    .line 2734
    .line 2735
    invoke-direct {v3, v1}, Lzy3;-><init>(Ljava/lang/String;)V

    .line 2736
    .line 2737
    .line 2738
    iput-object v3, v2, Lmz3;->b:Li21;

    .line 2739
    .line 2740
    new-instance v1, Lmz3;

    .line 2741
    .line 2742
    invoke-direct {v1, v8}, Lmz3;-><init>(I)V

    .line 2743
    .line 2744
    .line 2745
    new-instance v3, Lbz3;

    .line 2746
    .line 2747
    invoke-direct {v3, v0}, Lbz3;-><init>(I)V

    .line 2748
    .line 2749
    .line 2750
    iput-object v3, v1, Lmz3;->b:Li21;

    .line 2751
    .line 2752
    new-instance v0, Lpz3;

    .line 2753
    .line 2754
    sget-object v3, Lrz3;->X:Lrz3;

    .line 2755
    .line 2756
    invoke-direct {v0, v3, v1}, Lpz3;-><init>(Lrz3;Lmz3;)V

    .line 2757
    .line 2758
    .line 2759
    iget-object v1, v2, Lmz3;->c:Ljava/util/ArrayList;

    .line 2760
    .line 2761
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2762
    .line 2763
    .line 2764
    iget-object v0, v13, Lyy3;->d:Ljava/util/ArrayList;

    .line 2765
    .line 2766
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2767
    .line 2768
    .line 2769
    goto/16 :goto_4f

    .line 2770
    .line 2771
    :cond_7d
    const-string v1, "Unsupported function type kind: "

    .line 2772
    .line 2773
    const-string v3, " ("

    .line 2774
    .line 2775
    invoke-static {v1, v2, v3, v0}, Lom0;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2776
    .line 2777
    .line 2778
    :cond_7e
    move-object v13, v9

    .line 2779
    goto/16 :goto_4f

    .line 2780
    .line 2781
    :cond_7f
    const-class v4, Ljava/lang/Cloneable;

    .line 2782
    .line 2783
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2784
    .line 2785
    .line 2786
    move-result v1

    .line 2787
    if-eqz v1, :cond_80

    .line 2788
    .line 2789
    sget-object v0, Lva0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2790
    .line 2791
    new-instance v13, Lyy3;

    .line 2792
    .line 2793
    invoke-direct {v13}, Lyy3;-><init>()V

    .line 2794
    .line 2795
    .line 2796
    const-string v0, "kotlin/Cloneable"

    .line 2797
    .line 2798
    iput-object v0, v13, Lyy3;->b:Ljava/lang/String;

    .line 2799
    .line 2800
    sget-object v0, Lts0;->Z:Lts0;

    .line 2801
    .line 2802
    sget-object v1, Low;->a:[Lnw3;

    .line 2803
    .line 2804
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2805
    .line 2806
    .line 2807
    sget-object v1, Low;->d:Lz47;

    .line 2808
    .line 2809
    sget-object v4, Low;->a:[Lnw3;

    .line 2810
    .line 2811
    aget-object v6, v4, v6

    .line 2812
    .line 2813
    invoke-virtual {v1, v13, v6, v0}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2814
    .line 2815
    .line 2816
    sget-object v0, Lex4;->f0:Lex4;

    .line 2817
    .line 2818
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2819
    .line 2820
    .line 2821
    sget-object v1, Low;->b:Lz47;

    .line 2822
    .line 2823
    aget-object v3, v4, v3

    .line 2824
    .line 2825
    invoke-virtual {v1, v13, v3, v0}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2826
    .line 2827
    .line 2828
    sget-object v0, Lgz8;->g0:Lgz8;

    .line 2829
    .line 2830
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2831
    .line 2832
    .line 2833
    sget-object v1, Low;->c:Lz47;

    .line 2834
    .line 2835
    aget-object v3, v4, v5

    .line 2836
    .line 2837
    invoke-virtual {v1, v13, v3, v0}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2838
    .line 2839
    .line 2840
    new-instance v0, Liz3;

    .line 2841
    .line 2842
    const-string v1, "clone"

    .line 2843
    .line 2844
    const/4 v8, 0x0

    .line 2845
    invoke-direct {v0, v8, v1}, Liz3;-><init>(ILjava/lang/String;)V

    .line 2846
    .line 2847
    .line 2848
    sget-object v1, Lex4;->Z:Lex4;

    .line 2849
    .line 2850
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2851
    .line 2852
    .line 2853
    sget-object v3, Low;->i:Lz47;

    .line 2854
    .line 2855
    aget-object v2, v4, v2

    .line 2856
    .line 2857
    invoke-virtual {v3, v0, v2, v1}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2858
    .line 2859
    .line 2860
    sget-object v1, Lgz8;->f0:Lgz8;

    .line 2861
    .line 2862
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2863
    .line 2864
    .line 2865
    sget-object v2, Low;->h:Lz47;

    .line 2866
    .line 2867
    const/16 v3, 0x16

    .line 2868
    .line 2869
    aget-object v3, v4, v3

    .line 2870
    .line 2871
    invoke-virtual {v2, v0, v3, v1}, Lz47;->S(Ljava/lang/Object;Lnw3;Ljava/lang/Enum;)V

    .line 2872
    .line 2873
    .line 2874
    new-instance v1, Lmz3;

    .line 2875
    .line 2876
    const/4 v8, 0x0

    .line 2877
    invoke-direct {v1, v8}, Lmz3;-><init>(I)V

    .line 2878
    .line 2879
    .line 2880
    new-instance v2, Lzy3;

    .line 2881
    .line 2882
    const-string v3, "kotlin/Any"

    .line 2883
    .line 2884
    invoke-direct {v2, v3}, Lzy3;-><init>(Ljava/lang/String;)V

    .line 2885
    .line 2886
    .line 2887
    iput-object v2, v1, Lmz3;->b:Li21;

    .line 2888
    .line 2889
    iput-object v1, v0, Liz3;->h:Lmz3;

    .line 2890
    .line 2891
    iget-object v1, v13, Lyy3;->e:Ljava/util/ArrayList;

    .line 2892
    .line 2893
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2894
    .line 2895
    .line 2896
    goto :goto_4f

    .line 2897
    :cond_80
    instance-of v1, v0, Lvl1;

    .line 2898
    .line 2899
    if-eqz v1, :cond_81

    .line 2900
    .line 2901
    move-object v2, v0

    .line 2902
    check-cast v2, Lvl1;

    .line 2903
    .line 2904
    goto :goto_4e

    .line 2905
    :cond_81
    move-object v2, v9

    .line 2906
    :goto_4e
    if-eqz v2, :cond_7e

    .line 2907
    .line 2908
    iget-object v0, v2, Lvl1;->g0:Lfy5;

    .line 2909
    .line 2910
    iget-object v1, v2, Lvl1;->n0:Ljl1;

    .line 2911
    .line 2912
    iget-object v1, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 2913
    .line 2914
    check-cast v1, Lw15;

    .line 2915
    .line 2916
    const/4 v2, 0x6

    .line 2917
    const/4 v8, 0x0

    .line 2918
    invoke-static {v0, v1, v8, v2}, Lvj8;->n0(Lfy5;Lw15;ZI)Lyy3;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v13

    .line 2922
    :goto_4f
    return-object v13

    .line 2923
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

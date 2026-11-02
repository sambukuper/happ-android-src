.class public final Lj50;
.super Lf30;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j0:Lj50;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lf30;-><init>(Ls37;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj50;->j0:Lj50;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a0(Lt37;Le50;Lbl;ZLgl;)Lf50;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    invoke-virtual {v4}, Lvj8;->Q()Ldh8;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v5, Lzl;

    .line 16
    .line 17
    invoke-virtual {v3}, Le50;->n()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Le50;->i()Lix5;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    invoke-direct {v5, v6, v4, v7}, Lzl;-><init>(Ldh8;Lgl;Lix5;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v4}, Lf30;->Z(Lt37;Lvj8;)Lar3;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    iget-object v8, v1, Lt37;->X:Ll37;

    .line 32
    .line 33
    instance-of v9, v7, Lh50;

    .line 34
    .line 35
    if-eqz v9, :cond_0

    .line 36
    .line 37
    move-object v9, v7

    .line 38
    check-cast v9, Lh50;

    .line 39
    .line 40
    invoke-virtual {v9, v1}, Lh50;->t(Lt37;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {v1, v7, v5}, Lt37;->u(Lar3;Ld50;)Lar3;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v6}, Ldh8;->I0()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-nez v5, :cond_2

    .line 52
    .line 53
    invoke-virtual {v6}, Lmb6;->M()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v5, 0x0

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    invoke-virtual {v6}, Ldh8;->z0()Ldh8;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v8}, Lvp4;->d()Lm85;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-virtual {v10, v8, v4, v6}, Lm85;->s(Lvp4;Lgl;Ldh8;)Lnj7;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    if-nez v10, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0, v8, v5}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object v11, v8, Lwp4;->f0:Lmj7;

    .line 82
    .line 83
    invoke-virtual {v11, v8, v4, v5}, Lmj7;->m(Lvp4;Lgl;Ldh8;)Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-virtual {v10, v8, v5, v11}, Lnj7;->a(Ll37;Ldh8;Ljava/util/ArrayList;)Lsi8;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :goto_1
    invoke-virtual {v8}, Lvp4;->d()Lm85;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-virtual {v10, v8, v4, v6}, Lm85;->A(Lvp4;Lgl;Ldh8;)Lnj7;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    if-nez v10, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0, v8, v6}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    goto :goto_2

    .line 106
    :cond_4
    iget-object v0, v8, Lwp4;->f0:Lmj7;

    .line 107
    .line 108
    invoke-virtual {v0, v8, v4, v6}, Lmj7;->m(Lvp4;Lgl;Ldh8;)Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v10, v8, v6, v0}, Lnj7;->a(Ll37;Ldh8;Ljava/util/ArrayList;)Lsi8;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    iget-object v10, v2, Lbl;->X:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v13, v10

    .line 119
    check-cast v13, Lm85;

    .line 120
    .line 121
    iget-boolean v10, v2, Lbl;->Y:Z

    .line 122
    .line 123
    iget-object v11, v2, Lbl;->Z:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v11, Ll37;

    .line 126
    .line 127
    iget-object v12, v2, Lbl;->f0:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v12, Lz20;

    .line 130
    .line 131
    iget-object v14, v12, Lz20;->c:Lvp4;

    .line 132
    .line 133
    iget-object v15, v12, Lz20;->e:Lal;

    .line 134
    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    move/from16 v9, p4

    .line 138
    .line 139
    :try_start_0
    invoke-virtual {v2, v4, v9, v6}, Lbl;->f(Lgl;ZLdh8;)Ldh8;

    .line 140
    .line 141
    .line 142
    move-result-object v9
    :try_end_0
    .catch Lpp3; {:try_start_0 .. :try_end_0} :catch_2

    .line 143
    if-eqz v5, :cond_7

    .line 144
    .line 145
    if-nez v9, :cond_5

    .line 146
    .line 147
    move-object v9, v6

    .line 148
    :cond_5
    invoke-virtual {v9}, Ldh8;->z0()Ldh8;

    .line 149
    .line 150
    .line 151
    move-result-object v17

    .line 152
    if-eqz v17, :cond_6

    .line 153
    .line 154
    invoke-virtual {v9, v5}, Ldh8;->P0(Lsi8;)Ldh8;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v2, "serialization type "

    .line 165
    .line 166
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v2, " has no content"

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const/4 v2, 0x0

    .line 182
    new-array v2, v2, [Ljava/lang/Object;

    .line 183
    .line 184
    invoke-virtual {v1, v12, v3, v0, v2}, Lt37;->B(Lz20;Le50;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    throw v16

    .line 188
    :cond_7
    :goto_3
    if-nez v9, :cond_8

    .line 189
    .line 190
    move-object v5, v6

    .line 191
    goto :goto_4

    .line 192
    :cond_8
    move-object v5, v9

    .line 193
    :goto_4
    invoke-virtual {v3}, Le50;->e()Lgl;

    .line 194
    .line 195
    .line 196
    move-result-object v17

    .line 197
    if-eqz v17, :cond_28

    .line 198
    .line 199
    invoke-virtual/range {v17 .. v17}, Lvj8;->N()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-object/from16 v17, v0

    .line 203
    .line 204
    iget-object v0, v2, Lbl;->h0:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lep3;

    .line 207
    .line 208
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-object/from16 v3, v16

    .line 212
    .line 213
    filled-new-array {v0, v3, v3}, [Lep3;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v3, Lep3;->g0:Lep3;

    .line 218
    .line 219
    move-object/from16 p4, v0

    .line 220
    .line 221
    move-object/from16 v18, v5

    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    const/4 v3, 0x0

    .line 225
    :goto_5
    const/4 v5, 0x3

    .line 226
    if-ge v3, v5, :cond_b

    .line 227
    .line 228
    aget-object v5, p4, v3

    .line 229
    .line 230
    if-eqz v5, :cond_a

    .line 231
    .line 232
    if-nez v0, :cond_9

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_9
    invoke-virtual {v0, v5}, Lep3;->a(Lep3;)Lep3;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    :goto_6
    move-object v0, v5

    .line 240
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_b
    invoke-virtual/range {p2 .. p2}, Le50;->b()Lep3;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v0, v3}, Lep3;->a(Lep3;)Lep3;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v3, v0, Lep3;->X:Ldp3;

    .line 252
    .line 253
    sget-object v5, Ldp3;->g0:Ldp3;

    .line 254
    .line 255
    if-ne v3, v5, :cond_c

    .line 256
    .line 257
    sget-object v3, Ldp3;->X:Ldp3;

    .line 258
    .line 259
    :cond_c
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    sget-object v5, Ldp3;->Z:Ldp3;

    .line 264
    .line 265
    move-object/from16 v19, v5

    .line 266
    .line 267
    const/4 v5, 0x1

    .line 268
    if-eq v3, v5, :cond_20

    .line 269
    .line 270
    const/4 v5, 0x2

    .line 271
    if-eq v3, v5, :cond_1e

    .line 272
    .line 273
    const/4 v5, 0x3

    .line 274
    if-eq v3, v5, :cond_1a

    .line 275
    .line 276
    const/4 v5, 0x4

    .line 277
    if-eq v3, v5, :cond_e

    .line 278
    .line 279
    const/4 v2, 0x5

    .line 280
    if-eq v3, v2, :cond_d

    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    goto/16 :goto_10

    .line 284
    .line 285
    :cond_d
    iget-object v0, v0, Lep3;->Z:Ljava/lang/Class;

    .line 286
    .line 287
    invoke-virtual {v1, v0}, Lt37;->w(Ljava/lang/Class;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    move-object v11, v0

    .line 292
    const/4 v10, 0x0

    .line 293
    goto/16 :goto_11

    .line 294
    .line 295
    :cond_e
    if-eqz v10, :cond_19

    .line 296
    .line 297
    iget-object v0, v2, Lbl;->g0:Ljava/lang/Object;

    .line 298
    .line 299
    if-nez v0, :cond_12

    .line 300
    .line 301
    sget-object v0, Lxp4;->q0:Lxp4;

    .line 302
    .line 303
    invoke-virtual {v11, v0}, Lvp4;->f(Lxp4;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual {v15}, Lal;->z0()Llr;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    iget-object v3, v3, Llr;->Y:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v3, Lcl;

    .line 314
    .line 315
    if-nez v3, :cond_f

    .line 316
    .line 317
    const/4 v3, 0x0

    .line 318
    goto :goto_7

    .line 319
    :cond_f
    if-eqz v0, :cond_10

    .line 320
    .line 321
    sget-object v0, Lxp4;->r0:Lxp4;

    .line 322
    .line 323
    invoke-virtual {v14, v0}, Lvp4;->f(Lxp4;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    invoke-virtual {v3}, Lcl;->B0()Ljava/lang/reflect/Member;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    if-eqz v5, :cond_10

    .line 332
    .line 333
    invoke-static {v5, v0}, Lit0;->d(Ljava/lang/reflect/Member;Z)V

    .line 334
    .line 335
    .line 336
    :cond_10
    :try_start_1
    iget-object v0, v3, Lcl;->E0:Ljava/lang/reflect/Constructor;

    .line 337
    .line 338
    const/4 v3, 0x0

    .line 339
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 343
    move-object v3, v0

    .line 344
    :goto_7
    if-nez v3, :cond_11

    .line 345
    .line 346
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_11
    move-object v0, v3

    .line 350
    :goto_8
    iput-object v0, v2, Lbl;->g0:Ljava/lang/Object;

    .line 351
    .line 352
    :cond_12
    move-object v3, v0

    .line 353
    goto :goto_a

    .line 354
    :catch_0
    move-exception v0

    .line 355
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    if-eqz v1, :cond_13

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    goto :goto_9

    .line 366
    :cond_13
    sget-object v1, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 367
    .line 368
    instance-of v1, v0, Ljava/lang/Error;

    .line 369
    .line 370
    if-nez v1, :cond_14

    .line 371
    .line 372
    invoke-static {v0}, Lit0;->w(Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 376
    .line 377
    iget-object v2, v15, Lal;->C0:Ljava/lang/Class;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-static {v0}, Lit0;->h(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    new-instance v5, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    const-string v6, "Failed to instantiate bean of type "

    .line 398
    .line 399
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v2, ": ("

    .line 406
    .line 407
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string v2, ") "

    .line 414
    .line 415
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    throw v1

    .line 429
    :cond_14
    check-cast v0, Ljava/lang/Error;

    .line 430
    .line 431
    throw v0

    .line 432
    :goto_a
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 433
    .line 434
    if-ne v0, v2, :cond_15

    .line 435
    .line 436
    const/4 v3, 0x0

    .line 437
    :cond_15
    if-eqz v3, :cond_19

    .line 438
    .line 439
    sget-object v0, Lxp4;->q0:Lxp4;

    .line 440
    .line 441
    invoke-virtual {v8, v0}, Lvp4;->f(Lxp4;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_16

    .line 446
    .line 447
    sget-object v0, Lxp4;->r0:Lxp4;

    .line 448
    .line 449
    invoke-virtual {v11, v0}, Lvp4;->f(Lxp4;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    invoke-virtual {v4}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    if-eqz v2, :cond_16

    .line 458
    .line 459
    invoke-static {v2, v0}, Lit0;->d(Ljava/lang/reflect/Member;Z)V

    .line 460
    .line 461
    .line 462
    :cond_16
    :try_start_2
    invoke-virtual {v4, v3}, Lgl;->C0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 466
    move-object v3, v0

    .line 467
    const/4 v0, 0x0

    .line 468
    goto :goto_c

    .line 469
    :catch_1
    move-exception v0

    .line 470
    invoke-virtual/range {p2 .. p2}, Le50;->j()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    if-eqz v2, :cond_17

    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    goto :goto_b

    .line 485
    :cond_17
    sget-object v2, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 486
    .line 487
    instance-of v2, v0, Ljava/lang/Error;

    .line 488
    .line 489
    if-nez v2, :cond_18

    .line 490
    .line 491
    invoke-static {v0}, Lit0;->w(Ljava/lang/Throwable;)V

    .line 492
    .line 493
    .line 494
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 495
    .line 496
    const-string v2, "Failed to get property \'"

    .line 497
    .line 498
    const-string v4, "\' of default "

    .line 499
    .line 500
    invoke-static {v2, v1, v4}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    const-string v2, " instance"

    .line 516
    .line 517
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw v0

    .line 528
    :cond_18
    check-cast v0, Ljava/lang/Error;

    .line 529
    .line 530
    throw v0

    .line 531
    :cond_19
    invoke-static/range {v18 .. v18}, Lci8;->r(Ldh8;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    move-object v3, v0

    .line 536
    const/4 v0, 0x1

    .line 537
    :goto_c
    if-nez v3, :cond_1c

    .line 538
    .line 539
    if-nez v10, :cond_1b

    .line 540
    .line 541
    :cond_1a
    :goto_d
    move-object/from16 v11, v19

    .line 542
    .line 543
    :goto_e
    const/4 v10, 0x1

    .line 544
    goto :goto_11

    .line 545
    :cond_1b
    move-object v11, v3

    .line 546
    goto :goto_e

    .line 547
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-eqz v2, :cond_1d

    .line 556
    .line 557
    invoke-static {v3}, Lz51;->y(Ljava/lang/Object;)Lne;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    :cond_1d
    move v10, v0

    .line 562
    move-object v11, v3

    .line 563
    goto :goto_11

    .line 564
    :cond_1e
    invoke-virtual/range {v18 .. v18}, Lmb6;->M()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_1f

    .line 569
    .line 570
    goto :goto_d

    .line 571
    :cond_1f
    const/4 v10, 0x1

    .line 572
    :goto_f
    const/4 v11, 0x0

    .line 573
    goto :goto_11

    .line 574
    :cond_20
    const/4 v0, 0x1

    .line 575
    :goto_10
    sget-object v2, Ln37;->u0:Ln37;

    .line 576
    .line 577
    invoke-virtual/range {v18 .. v18}, Ldh8;->I0()Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-eqz v3, :cond_21

    .line 582
    .line 583
    invoke-virtual {v11, v2}, Ll37;->j(Ln37;)Z

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    if-nez v2, :cond_21

    .line 588
    .line 589
    move v10, v0

    .line 590
    move-object/from16 v11, v19

    .line 591
    .line 592
    goto :goto_11

    .line 593
    :cond_21
    move v10, v0

    .line 594
    goto :goto_f

    .line 595
    :goto_11
    invoke-virtual/range {p2 .. p2}, Le50;->d()[Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    if-nez v0, :cond_25

    .line 600
    .line 601
    iget-boolean v0, v12, Lz20;->g:Z

    .line 602
    .line 603
    if-nez v0, :cond_24

    .line 604
    .line 605
    const/4 v0, 0x1

    .line 606
    iput-boolean v0, v12, Lz20;->g:Z

    .line 607
    .line 608
    iget-object v0, v12, Lz20;->d:Lm85;

    .line 609
    .line 610
    if-nez v0, :cond_22

    .line 611
    .line 612
    const/16 v16, 0x0

    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_22
    invoke-virtual {v0, v15}, Lm85;->N(Lvj8;)[Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    move-object/from16 v16, v0

    .line 620
    .line 621
    :goto_12
    if-nez v16, :cond_23

    .line 622
    .line 623
    sget-object v0, Lxp4;->u0:Lxp4;

    .line 624
    .line 625
    invoke-virtual {v14, v0}, Lvp4;->f(Lxp4;)Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-nez v0, :cond_23

    .line 630
    .line 631
    sget-object v16, Lz20;->j:[Ljava/lang/Class;

    .line 632
    .line 633
    :cond_23
    move-object/from16 v0, v16

    .line 634
    .line 635
    iput-object v0, v12, Lz20;->f:[Ljava/lang/Class;

    .line 636
    .line 637
    :cond_24
    iget-object v0, v12, Lz20;->f:[Ljava/lang/Class;

    .line 638
    .line 639
    :cond_25
    move-object v12, v0

    .line 640
    iget-object v5, v15, Lal;->K0:Ltm;

    .line 641
    .line 642
    new-instance v2, Lf50;

    .line 643
    .line 644
    move-object/from16 v3, p2

    .line 645
    .line 646
    move-object/from16 v8, v17

    .line 647
    .line 648
    invoke-direct/range {v2 .. v12}, Lf50;-><init>(Le50;Lgl;Ltm;Ldh8;Lar3;Lsi8;Ldh8;ZLjava/lang/Object;[Ljava/lang/Class;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v13, v4}, Lm85;->o(Lgl;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    if-eqz v0, :cond_26

    .line 656
    .line 657
    invoke-virtual {v1, v4, v0}, Lt37;->D(Lvj8;Ljava/lang/Object;)Lar3;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v2, v0}, Lf50;->f(Lar3;)V

    .line 662
    .line 663
    .line 664
    :cond_26
    invoke-virtual {v13, v4}, Lm85;->M(Lgl;)Lc25;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    if-eqz v0, :cond_27

    .line 669
    .line 670
    new-instance v1, Lno8;

    .line 671
    .line 672
    invoke-direct {v1, v2, v0}, Lno8;-><init>(Lf50;Lc25;)V

    .line 673
    .line 674
    .line 675
    return-object v1

    .line 676
    :cond_27
    return-object v2

    .line 677
    :cond_28
    const-string v0, "could not determine property type"

    .line 678
    .line 679
    const/4 v2, 0x0

    .line 680
    new-array v2, v2, [Ljava/lang/Object;

    .line 681
    .line 682
    invoke-virtual {v1, v12, v3, v0, v2}, Lt37;->B(Lz20;Le50;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    const/16 v16, 0x0

    .line 686
    .line 687
    throw v16

    .line 688
    :catch_2
    move-exception v0

    .line 689
    const/4 v2, 0x0

    .line 690
    invoke-static {v0}, Lit0;->h(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    new-array v2, v2, [Ljava/lang/Object;

    .line 695
    .line 696
    invoke-virtual {v1, v12, v3, v0, v2}, Lt37;->B(Lz20;Le50;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    throw v16
.end method

.method public final b0(Lt37;Ldh8;Lz20;Z)Lar3;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    iget-object v8, v7, Lz20;->a:Ldh8;

    .line 10
    .line 11
    iget-object v9, v7, Lz20;->e:Lal;

    .line 12
    .line 13
    sget-object v10, Ls75;->h0:Ls75;

    .line 14
    .line 15
    iget-object v11, v1, Lt37;->X:Ll37;

    .line 16
    .line 17
    invoke-virtual {v6}, Ldh8;->I0()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v12, v6, Ldh8;->j0:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v3, Ljava/lang/Enum;

    .line 24
    .line 25
    const-class v13, Ljava/util/Map;

    .line 26
    .line 27
    sget-object v4, Lmo3;->j0:Lmo3;

    .line 28
    .line 29
    sget-object v14, Ldp3;->X:Ldp3;

    .line 30
    .line 31
    sget-object v15, Ldp3;->g0:Ldp3;

    .line 32
    .line 33
    iget-object v5, v0, Lf30;->g0:Ls37;

    .line 34
    .line 35
    move-object/from16 v22, v10

    .line 36
    .line 37
    if-eqz v2, :cond_3c

    .line 38
    .line 39
    if-nez p4, :cond_3

    .line 40
    .line 41
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2, v9}, Lm85;->H(Lvj8;)Lwq3;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    const/4 v10, 0x1

    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    if-eq v2, v10, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v2, 0x1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/16 v23, 0x0

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/16 v23, 0x0

    .line 70
    .line 71
    :goto_0
    sget-object v2, Lxp4;->t0:Lxp4;

    .line 72
    .line 73
    invoke-virtual {v11, v2}, Lvp4;->f(Lxp4;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/16 v23, 0x0

    .line 79
    .line 80
    move/from16 v2, p4

    .line 81
    .line 82
    :goto_1
    if-nez v2, :cond_5

    .line 83
    .line 84
    iget-boolean v10, v6, Ldh8;->n0:Z

    .line 85
    .line 86
    if-eqz v10, :cond_5

    .line 87
    .line 88
    invoke-virtual {v6}, Ldh8;->I0()Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_4

    .line 93
    .line 94
    invoke-virtual {v6}, Ldh8;->z0()Ldh8;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, Ldh8;->K0()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-nez v10, :cond_5

    .line 103
    .line 104
    :cond_4
    move/from16 p4, v2

    .line 105
    .line 106
    const/4 v10, 0x1

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    move/from16 p4, v2

    .line 109
    .line 110
    move/from16 v10, p4

    .line 111
    .line 112
    :goto_2
    invoke-virtual {v6}, Ldh8;->z0()Ldh8;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v0, v11, v2}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 117
    .line 118
    .line 119
    move-result-object v28

    .line 120
    if-eqz v28, :cond_6

    .line 121
    .line 122
    const/16 v27, 0x0

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    move/from16 v27, v10

    .line 126
    .line 127
    :goto_3
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2, v9}, Lm85;->c(Lvj8;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    invoke-virtual {v1, v9, v2}, Lt37;->D(Lvj8;Ljava/lang/Object;)Lar3;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    move-object/from16 v29, v2

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    move-object/from16 v29, v23

    .line 145
    .line 146
    :goto_4
    instance-of v2, v6, Ltp4;

    .line 147
    .line 148
    if-eqz v2, :cond_1e

    .line 149
    .line 150
    move-object v2, v6

    .line 151
    check-cast v2, Ltp4;

    .line 152
    .line 153
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-virtual {v10, v9}, Lm85;->k(Lvj8;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    if-eqz v10, :cond_8

    .line 162
    .line 163
    invoke-virtual {v1, v9, v10}, Lt37;->D(Lvj8;Ljava/lang/Object;)Lar3;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    move-object/from16 v30, v29

    .line 168
    .line 169
    move-object/from16 v29, v10

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_8
    move-object/from16 v30, v29

    .line 173
    .line 174
    move-object/from16 v29, v23

    .line 175
    .line 176
    :goto_5
    invoke-virtual {v7}, Lz20;->b()Lno3;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    iget-object v10, v10, Lno3;->Y:Lmo3;

    .line 181
    .line 182
    if-ne v10, v4, :cond_9

    .line 183
    .line 184
    move-object/from16 v26, v3

    .line 185
    .line 186
    move-object/from16 v33, v8

    .line 187
    .line 188
    move-object/from16 v24, v9

    .line 189
    .line 190
    move-object/from16 v32, v12

    .line 191
    .line 192
    move-object/from16 v31, v13

    .line 193
    .line 194
    move-object/from16 v2, v23

    .line 195
    .line 196
    goto/16 :goto_1e

    .line 197
    .line 198
    :cond_9
    iget-object v10, v5, Ls37;->X:[Lu37;

    .line 199
    .line 200
    move-object/from16 v33, v8

    .line 201
    .line 202
    move-object/from16 v32, v12

    .line 203
    .line 204
    move-object/from16 v24, v23

    .line 205
    .line 206
    const/4 v12, 0x0

    .line 207
    :goto_6
    array-length v8, v10

    .line 208
    if-ge v12, v8, :cond_a

    .line 209
    .line 210
    const/4 v8, 0x1

    .line 211
    goto :goto_7

    .line 212
    :cond_a
    const/4 v8, 0x0

    .line 213
    :goto_7
    if-eqz v8, :cond_d

    .line 214
    .line 215
    array-length v8, v10

    .line 216
    if-ge v12, v8, :cond_c

    .line 217
    .line 218
    add-int/lit8 v8, v12, 0x1

    .line 219
    .line 220
    aget-object v12, v10, v12

    .line 221
    .line 222
    check-cast v12, Ly97;

    .line 223
    .line 224
    invoke-virtual {v12, v2}, Ly97;->a(Ldh8;)Lar3;

    .line 225
    .line 226
    .line 227
    move-result-object v24

    .line 228
    if-eqz v24, :cond_b

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_b
    move v12, v8

    .line 232
    goto :goto_6

    .line 233
    :cond_c
    invoke-static {}, Lbt;->n()V

    .line 234
    .line 235
    .line 236
    return-object v23

    .line 237
    :cond_d
    :goto_8
    if-nez v24, :cond_1a

    .line 238
    .line 239
    invoke-virtual {v0, v1, v2, v7}, Lf30;->Y(Lt37;Ldh8;Lz20;)Llj7;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    if-nez v8, :cond_19

    .line 244
    .line 245
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    invoke-virtual {v8, v9}, Lm85;->g(Lvj8;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v31

    .line 253
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-virtual {v8, v9}, Lm85;->v(Lvj8;)Lyo3;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    sget-object v10, Lyo3;->h0:Lyo3;

    .line 262
    .line 263
    if-nez v8, :cond_e

    .line 264
    .line 265
    move-object/from16 v8, v23

    .line 266
    .line 267
    :cond_e
    if-nez v8, :cond_f

    .line 268
    .line 269
    move-object/from16 v24, v23

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_f
    iget-boolean v10, v8, Lyo3;->Z:Z

    .line 273
    .line 274
    if-eqz v10, :cond_10

    .line 275
    .line 276
    sget-object v8, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_10
    iget-object v8, v8, Lyo3;->X:Ljava/util/Set;

    .line 280
    .line 281
    :goto_9
    move-object/from16 v24, v8

    .line 282
    .line 283
    :goto_a
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-virtual {v8, v9}, Lm85;->y(Lvj8;)Lgp3;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    iget-object v8, v8, Lgp3;->X:Ljava/util/Set;

    .line 292
    .line 293
    move-object/from16 v26, v2

    .line 294
    .line 295
    move-object/from16 v25, v8

    .line 296
    .line 297
    invoke-static/range {v24 .. v31}, Lsp4;->q(Ljava/util/Set;Ljava/util/Set;Ldh8;ZLsi8;Lar3;Lar3;Ljava/lang/Object;)Lsp4;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    iget-object v8, v2, Lsp4;->h0:Ldh8;

    .line 302
    .line 303
    invoke-static {v1, v7, v8, v13}, Lf30;->X(Lt37;Lz20;Ldh8;Ljava/lang/Class;)Lep3;

    .line 304
    .line 305
    .line 306
    move-result-object v10

    .line 307
    iget-object v12, v10, Lep3;->Y:Ldp3;

    .line 308
    .line 309
    if-eq v12, v15, :cond_18

    .line 310
    .line 311
    if-ne v12, v14, :cond_11

    .line 312
    .line 313
    goto :goto_d

    .line 314
    :cond_11
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    move-object/from16 v24, v8

    .line 319
    .line 320
    const/4 v8, 0x2

    .line 321
    if-eq v12, v8, :cond_17

    .line 322
    .line 323
    const/4 v8, 0x3

    .line 324
    if-eq v12, v8, :cond_16

    .line 325
    .line 326
    const/4 v8, 0x4

    .line 327
    if-eq v12, v8, :cond_15

    .line 328
    .line 329
    const/4 v8, 0x5

    .line 330
    if-eq v12, v8, :cond_14

    .line 331
    .line 332
    :cond_12
    move-object/from16 v8, v23

    .line 333
    .line 334
    :cond_13
    :goto_b
    const/4 v10, 0x1

    .line 335
    goto :goto_c

    .line 336
    :cond_14
    iget-object v8, v10, Lep3;->f0:Ljava/lang/Class;

    .line 337
    .line 338
    invoke-virtual {v1, v8}, Lt37;->w(Ljava/lang/Class;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    if-eqz v8, :cond_13

    .line 343
    .line 344
    invoke-virtual {v1, v8}, Lt37;->x(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    goto :goto_c

    .line 349
    :cond_15
    invoke-static/range {v24 .. v24}, Lci8;->r(Ldh8;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    if-eqz v8, :cond_13

    .line 354
    .line 355
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    if-eqz v10, :cond_13

    .line 364
    .line 365
    invoke-static {v8}, Lz51;->y(Ljava/lang/Object;)Lne;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    goto :goto_b

    .line 370
    :cond_16
    sget-object v8, Lsp4;->u0:Ldp3;

    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_17
    invoke-virtual/range {v24 .. v24}, Lmb6;->M()Z

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    if-eqz v8, :cond_12

    .line 378
    .line 379
    sget-object v8, Lsp4;->u0:Ldp3;

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :goto_c
    invoke-virtual {v2, v8, v10}, Lsp4;->t(Ljava/lang/Object;Z)Lsp4;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    goto :goto_e

    .line 387
    :cond_18
    :goto_d
    sget-object v8, Ln37;->t0:Ln37;

    .line 388
    .line 389
    invoke-virtual {v11, v8}, Ll37;->j(Ln37;)Z

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    if-nez v8, :cond_1b

    .line 394
    .line 395
    move-object/from16 v8, v23

    .line 396
    .line 397
    const/4 v10, 0x1

    .line 398
    invoke-virtual {v2, v8, v10}, Lsp4;->t(Ljava/lang/Object;Z)Lsp4;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    goto :goto_e

    .line 403
    :cond_19
    move-object v2, v8

    .line 404
    goto :goto_e

    .line 405
    :cond_1a
    move-object/from16 v2, v24

    .line 406
    .line 407
    :cond_1b
    :goto_e
    invoke-virtual {v5}, Ls37;->a()Z

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    if-eqz v8, :cond_1d

    .line 412
    .line 413
    invoke-virtual {v5}, Ls37;->b()Llt;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    invoke-virtual {v8}, Llt;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    if-nez v10, :cond_1c

    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_1c
    invoke-virtual {v8}, Llt;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 432
    .line 433
    .line 434
    const/16 v23, 0x0

    .line 435
    .line 436
    return-object v23

    .line 437
    :cond_1d
    :goto_f
    move-object/from16 v26, v3

    .line 438
    .line 439
    move-object/from16 v24, v9

    .line 440
    .line 441
    move-object/from16 v31, v13

    .line 442
    .line 443
    goto/16 :goto_1e

    .line 444
    .line 445
    :cond_1e
    move-object/from16 v33, v8

    .line 446
    .line 447
    move-object/from16 v32, v12

    .line 448
    .line 449
    move-object/from16 v30, v29

    .line 450
    .line 451
    instance-of v2, v6, Lvv0;

    .line 452
    .line 453
    if-eqz v2, :cond_2f

    .line 454
    .line 455
    move-object v2, v6

    .line 456
    check-cast v2, Lvv0;

    .line 457
    .line 458
    iget-object v8, v5, Ls37;->X:[Lu37;

    .line 459
    .line 460
    const/4 v10, 0x0

    .line 461
    const/16 v24, 0x0

    .line 462
    .line 463
    :goto_10
    array-length v12, v8

    .line 464
    if-ge v10, v12, :cond_1f

    .line 465
    .line 466
    const/4 v12, 0x1

    .line 467
    goto :goto_11

    .line 468
    :cond_1f
    const/4 v12, 0x0

    .line 469
    :goto_11
    if-eqz v12, :cond_20

    .line 470
    .line 471
    array-length v12, v8

    .line 472
    if-ge v10, v12, :cond_22

    .line 473
    .line 474
    add-int/lit8 v12, v10, 0x1

    .line 475
    .line 476
    aget-object v10, v8, v10

    .line 477
    .line 478
    check-cast v10, Ly97;

    .line 479
    .line 480
    invoke-virtual {v10, v2}, Ly97;->a(Ldh8;)Lar3;

    .line 481
    .line 482
    .line 483
    move-result-object v24

    .line 484
    if-eqz v24, :cond_21

    .line 485
    .line 486
    :cond_20
    move-object/from16 v12, v24

    .line 487
    .line 488
    goto :goto_12

    .line 489
    :cond_21
    move v10, v12

    .line 490
    goto :goto_10

    .line 491
    :cond_22
    invoke-static {}, Lbt;->n()V

    .line 492
    .line 493
    .line 494
    const/16 v23, 0x0

    .line 495
    .line 496
    return-object v23

    .line 497
    :goto_12
    if-nez v12, :cond_2b

    .line 498
    .line 499
    invoke-virtual {v0, v1, v2, v7}, Lf30;->Y(Lt37;Ldh8;Lz20;)Llj7;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    iget-object v10, v2, Lvv0;->s0:Ldh8;

    .line 504
    .line 505
    if-nez v8, :cond_2a

    .line 506
    .line 507
    invoke-virtual {v7}, Lz20;->b()Lno3;

    .line 508
    .line 509
    .line 510
    move-result-object v12

    .line 511
    iget-object v12, v12, Lno3;->Y:Lmo3;

    .line 512
    .line 513
    if-ne v12, v4, :cond_23

    .line 514
    .line 515
    move-object/from16 v26, v3

    .line 516
    .line 517
    move-object/from16 v24, v9

    .line 518
    .line 519
    move-object/from16 v31, v13

    .line 520
    .line 521
    :goto_13
    const/4 v2, 0x0

    .line 522
    goto/16 :goto_1e

    .line 523
    .line 524
    :cond_23
    iget-object v12, v2, Ldh8;->j0:Ljava/lang/Class;

    .line 525
    .line 526
    move-object/from16 v24, v8

    .line 527
    .line 528
    const-class v8, Ljava/util/EnumSet;

    .line 529
    .line 530
    invoke-virtual {v8, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 531
    .line 532
    .line 533
    move-result v25

    .line 534
    if-eqz v25, :cond_25

    .line 535
    .line 536
    iget-object v2, v10, Ldh8;->j0:Ljava/lang/Class;

    .line 537
    .line 538
    sget-object v12, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 539
    .line 540
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 541
    .line 542
    .line 543
    move-result v12

    .line 544
    if-eqz v12, :cond_24

    .line 545
    .line 546
    if-eq v2, v3, :cond_24

    .line 547
    .line 548
    move-object/from16 v36, v10

    .line 549
    .line 550
    goto :goto_14

    .line 551
    :cond_24
    const/16 v36, 0x0

    .line 552
    .line 553
    :goto_14
    new-instance v34, Lw22;

    .line 554
    .line 555
    const/16 v39, 0x0

    .line 556
    .line 557
    const/16 v40, 0x0

    .line 558
    .line 559
    const/16 v37, 0x1

    .line 560
    .line 561
    const/16 v38, 0x0

    .line 562
    .line 563
    move-object/from16 v35, v8

    .line 564
    .line 565
    invoke-direct/range {v34 .. v40}, Lw22;-><init>(Ljava/lang/Class;Ldh8;ZLri8;Lar3;B)V

    .line 566
    .line 567
    .line 568
    move-object/from16 v31, v13

    .line 569
    .line 570
    move-object/from16 v8, v34

    .line 571
    .line 572
    goto/16 :goto_17

    .line 573
    .line 574
    :cond_25
    iget-object v8, v10, Ldh8;->j0:Ljava/lang/Class;

    .line 575
    .line 576
    move-object/from16 v31, v13

    .line 577
    .line 578
    const-class v13, Ljava/util/RandomAccess;

    .line 579
    .line 580
    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 581
    .line 582
    .line 583
    move-result v12

    .line 584
    const-class v13, Ljava/lang/String;

    .line 585
    .line 586
    if-eqz v12, :cond_29

    .line 587
    .line 588
    if-ne v8, v13, :cond_27

    .line 589
    .line 590
    invoke-static/range {v30 .. v30}, Lit0;->r(Lar3;)Z

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    if-eqz v2, :cond_26

    .line 595
    .line 596
    sget-object v8, Lob3;->g0:Lob3;

    .line 597
    .line 598
    move/from16 v12, v27

    .line 599
    .line 600
    move-object/from16 v2, v28

    .line 601
    .line 602
    move-object/from16 v29, v30

    .line 603
    .line 604
    goto :goto_16

    .line 605
    :cond_26
    move/from16 v12, v27

    .line 606
    .line 607
    move-object/from16 v2, v28

    .line 608
    .line 609
    move-object/from16 v29, v30

    .line 610
    .line 611
    goto :goto_15

    .line 612
    :cond_27
    iget-object v2, v2, Lvv0;->s0:Ldh8;

    .line 613
    .line 614
    new-instance v24, Lw22;

    .line 615
    .line 616
    const-class v25, Ljava/util/List;

    .line 617
    .line 618
    move-object/from16 v29, v30

    .line 619
    .line 620
    const/16 v30, 0x1

    .line 621
    .line 622
    move-object/from16 v26, v2

    .line 623
    .line 624
    invoke-direct/range {v24 .. v30}, Lw22;-><init>(Ljava/lang/Class;Ldh8;ZLri8;Lar3;B)V

    .line 625
    .line 626
    .line 627
    move/from16 v12, v27

    .line 628
    .line 629
    move-object/from16 v2, v28

    .line 630
    .line 631
    :cond_28
    :goto_15
    move-object/from16 v8, v24

    .line 632
    .line 633
    goto :goto_16

    .line 634
    :cond_29
    move/from16 v12, v27

    .line 635
    .line 636
    move-object/from16 v2, v28

    .line 637
    .line 638
    move-object/from16 v29, v30

    .line 639
    .line 640
    if-ne v8, v13, :cond_28

    .line 641
    .line 642
    invoke-static/range {v29 .. v29}, Lit0;->r(Lar3;)Z

    .line 643
    .line 644
    .line 645
    move-result v8

    .line 646
    if-eqz v8, :cond_28

    .line 647
    .line 648
    sget-object v8, Lob3;->h0:Lob3;

    .line 649
    .line 650
    :goto_16
    if-nez v8, :cond_2c

    .line 651
    .line 652
    new-instance v8, Luv0;

    .line 653
    .line 654
    move-object/from16 v13, v29

    .line 655
    .line 656
    invoke-direct {v8, v10, v12, v2, v13}, Luv0;-><init>(Ldh8;ZLsi8;Lar3;)V

    .line 657
    .line 658
    .line 659
    goto :goto_17

    .line 660
    :cond_2a
    move-object/from16 v24, v8

    .line 661
    .line 662
    move-object/from16 v31, v13

    .line 663
    .line 664
    goto :goto_17

    .line 665
    :cond_2b
    move-object/from16 v31, v13

    .line 666
    .line 667
    move-object v8, v12

    .line 668
    :cond_2c
    :goto_17
    invoke-virtual {v5}, Ls37;->a()Z

    .line 669
    .line 670
    .line 671
    move-result v2

    .line 672
    if-eqz v2, :cond_2e

    .line 673
    .line 674
    invoke-virtual {v5}, Ls37;->b()Llt;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v2}, Llt;->hasNext()Z

    .line 679
    .line 680
    .line 681
    move-result v10

    .line 682
    if-nez v10, :cond_2d

    .line 683
    .line 684
    goto :goto_18

    .line 685
    :cond_2d
    invoke-virtual {v2}, Llt;->next()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 693
    .line 694
    .line 695
    const/16 v23, 0x0

    .line 696
    .line 697
    return-object v23

    .line 698
    :cond_2e
    :goto_18
    move-object/from16 v26, v3

    .line 699
    .line 700
    move-object v2, v8

    .line 701
    move-object/from16 v24, v9

    .line 702
    .line 703
    goto/16 :goto_1e

    .line 704
    .line 705
    :cond_2f
    move-object/from16 v31, v13

    .line 706
    .line 707
    move/from16 v12, v27

    .line 708
    .line 709
    move-object/from16 v2, v28

    .line 710
    .line 711
    move-object/from16 v13, v30

    .line 712
    .line 713
    instance-of v8, v6, Lcu;

    .line 714
    .line 715
    if-eqz v8, :cond_3a

    .line 716
    .line 717
    move-object v8, v6

    .line 718
    check-cast v8, Lcu;

    .line 719
    .line 720
    iget-object v10, v5, Ls37;->X:[Lu37;

    .line 721
    .line 722
    move-object/from16 v26, v3

    .line 723
    .line 724
    move-object/from16 v24, v9

    .line 725
    .line 726
    const/4 v9, 0x0

    .line 727
    const/16 v25, 0x0

    .line 728
    .line 729
    :goto_19
    array-length v3, v10

    .line 730
    if-ge v9, v3, :cond_30

    .line 731
    .line 732
    const/4 v3, 0x1

    .line 733
    goto :goto_1a

    .line 734
    :cond_30
    const/4 v3, 0x0

    .line 735
    :goto_1a
    if-eqz v3, :cond_33

    .line 736
    .line 737
    array-length v3, v10

    .line 738
    if-ge v9, v3, :cond_32

    .line 739
    .line 740
    add-int/lit8 v3, v9, 0x1

    .line 741
    .line 742
    aget-object v9, v10, v9

    .line 743
    .line 744
    check-cast v9, Ly97;

    .line 745
    .line 746
    invoke-virtual {v9, v8}, Ly97;->a(Ldh8;)Lar3;

    .line 747
    .line 748
    .line 749
    move-result-object v25

    .line 750
    if-eqz v25, :cond_31

    .line 751
    .line 752
    goto :goto_1b

    .line 753
    :cond_31
    move v9, v3

    .line 754
    goto :goto_19

    .line 755
    :cond_32
    invoke-static {}, Lbt;->n()V

    .line 756
    .line 757
    .line 758
    const/16 v23, 0x0

    .line 759
    .line 760
    return-object v23

    .line 761
    :cond_33
    :goto_1b
    if-nez v25, :cond_37

    .line 762
    .line 763
    iget-object v3, v8, Ldh8;->j0:Ljava/lang/Class;

    .line 764
    .line 765
    if-eqz v13, :cond_34

    .line 766
    .line 767
    invoke-static {v13}, Lit0;->r(Lar3;)Z

    .line 768
    .line 769
    .line 770
    move-result v9

    .line 771
    if-eqz v9, :cond_36

    .line 772
    .line 773
    :cond_34
    const-class v9, [Ljava/lang/String;

    .line 774
    .line 775
    if-ne v9, v3, :cond_35

    .line 776
    .line 777
    sget-object v25, Lvl7;->h0:Lvl7;

    .line 778
    .line 779
    goto :goto_1c

    .line 780
    :cond_35
    sget-object v9, Ldj7;->a:Ljava/util/HashMap;

    .line 781
    .line 782
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    move-object/from16 v25, v3

    .line 791
    .line 792
    check-cast v25, Lar3;

    .line 793
    .line 794
    :cond_36
    :goto_1c
    if-nez v25, :cond_37

    .line 795
    .line 796
    new-instance v3, Ly75;

    .line 797
    .line 798
    iget-object v8, v8, Lcu;->s0:Ldh8;

    .line 799
    .line 800
    invoke-direct {v3, v8, v12, v2, v13}, Ly75;-><init>(Ldh8;ZLri8;Lar3;)V

    .line 801
    .line 802
    .line 803
    move-object/from16 v25, v3

    .line 804
    .line 805
    :cond_37
    invoke-virtual {v5}, Ls37;->a()Z

    .line 806
    .line 807
    .line 808
    move-result v2

    .line 809
    if-eqz v2, :cond_39

    .line 810
    .line 811
    invoke-virtual {v5}, Ls37;->b()Llt;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    invoke-virtual {v2}, Llt;->hasNext()Z

    .line 816
    .line 817
    .line 818
    move-result v3

    .line 819
    if-nez v3, :cond_38

    .line 820
    .line 821
    goto :goto_1d

    .line 822
    :cond_38
    invoke-virtual {v2}, Llt;->next()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 830
    .line 831
    .line 832
    const/16 v23, 0x0

    .line 833
    .line 834
    return-object v23

    .line 835
    :cond_39
    :goto_1d
    move-object/from16 v2, v25

    .line 836
    .line 837
    goto :goto_1e

    .line 838
    :cond_3a
    move-object/from16 v26, v3

    .line 839
    .line 840
    move-object/from16 v24, v9

    .line 841
    .line 842
    goto/16 :goto_13

    .line 843
    .line 844
    :goto_1e
    if-eqz v2, :cond_3b

    .line 845
    .line 846
    return-object v2

    .line 847
    :cond_3b
    :goto_1f
    move/from16 v37, p4

    .line 848
    .line 849
    goto/16 :goto_2a

    .line 850
    .line 851
    :cond_3c
    move-object/from16 v26, v3

    .line 852
    .line 853
    move-object/from16 v33, v8

    .line 854
    .line 855
    move-object/from16 v24, v9

    .line 856
    .line 857
    move-object/from16 v32, v12

    .line 858
    .line 859
    move-object/from16 v31, v13

    .line 860
    .line 861
    invoke-virtual {v6}, Lmb6;->M()Z

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    if-eqz v2, :cond_4c

    .line 866
    .line 867
    move-object v2, v6

    .line 868
    check-cast v2, Lfa6;

    .line 869
    .line 870
    iget-object v3, v2, Lfa6;->s0:Ldh8;

    .line 871
    .line 872
    iget-object v8, v3, Ldh8;->m0:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v8, Lri8;

    .line 875
    .line 876
    if-nez v8, :cond_3d

    .line 877
    .line 878
    invoke-virtual {v0, v11, v3}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 879
    .line 880
    .line 881
    move-result-object v8

    .line 882
    :cond_3d
    iget-object v9, v3, Ldh8;->l0:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v9, Lar3;

    .line 885
    .line 886
    iget-object v10, v5, Ls37;->X:[Lu37;

    .line 887
    .line 888
    const/4 v12, 0x0

    .line 889
    :goto_20
    array-length v13, v10

    .line 890
    if-ge v12, v13, :cond_3e

    .line 891
    .line 892
    const/4 v13, 0x1

    .line 893
    goto :goto_21

    .line 894
    :cond_3e
    const/4 v13, 0x0

    .line 895
    :goto_21
    if-eqz v13, :cond_41

    .line 896
    .line 897
    array-length v13, v10

    .line 898
    if-ge v12, v13, :cond_40

    .line 899
    .line 900
    add-int/lit8 v13, v12, 0x1

    .line 901
    .line 902
    aget-object v12, v10, v12

    .line 903
    .line 904
    invoke-virtual {v12, v2}, Lu37;->a(Ldh8;)Lar3;

    .line 905
    .line 906
    .line 907
    move-result-object v12

    .line 908
    if-eqz v12, :cond_3f

    .line 909
    .line 910
    goto/16 :goto_26

    .line 911
    .line 912
    :cond_3f
    move v12, v13

    .line 913
    goto :goto_20

    .line 914
    :cond_40
    invoke-static {}, Lbt;->n()V

    .line 915
    .line 916
    .line 917
    const/16 v23, 0x0

    .line 918
    .line 919
    return-object v23

    .line 920
    :cond_41
    const-class v10, Ljava/util/concurrent/atomic/AtomicReference;

    .line 921
    .line 922
    invoke-virtual {v2, v10}, Ldh8;->L0(Ljava/lang/Class;)Z

    .line 923
    .line 924
    .line 925
    move-result v12

    .line 926
    if-eqz v12, :cond_4b

    .line 927
    .line 928
    invoke-static {v1, v7, v3, v10}, Lf30;->X(Lt37;Lz20;Ldh8;Ljava/lang/Class;)Lep3;

    .line 929
    .line 930
    .line 931
    move-result-object v10

    .line 932
    iget-object v12, v10, Lep3;->Y:Ldp3;

    .line 933
    .line 934
    if-eq v12, v15, :cond_4a

    .line 935
    .line 936
    if-ne v12, v14, :cond_42

    .line 937
    .line 938
    goto :goto_24

    .line 939
    :cond_42
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 940
    .line 941
    .line 942
    move-result v12

    .line 943
    const/4 v13, 0x2

    .line 944
    if-eq v12, v13, :cond_48

    .line 945
    .line 946
    const/4 v13, 0x3

    .line 947
    if-eq v12, v13, :cond_47

    .line 948
    .line 949
    const/4 v13, 0x4

    .line 950
    if-eq v12, v13, :cond_46

    .line 951
    .line 952
    const/4 v13, 0x5

    .line 953
    if-eq v12, v13, :cond_43

    .line 954
    .line 955
    const/16 v40, 0x0

    .line 956
    .line 957
    :goto_22
    const/16 v41, 0x1

    .line 958
    .line 959
    goto :goto_25

    .line 960
    :cond_43
    iget-object v3, v10, Lep3;->f0:Ljava/lang/Class;

    .line 961
    .line 962
    invoke-virtual {v1, v3}, Lt37;->w(Ljava/lang/Class;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v3

    .line 966
    if-nez v3, :cond_45

    .line 967
    .line 968
    :cond_44
    :goto_23
    move-object/from16 v40, v3

    .line 969
    .line 970
    goto :goto_22

    .line 971
    :cond_45
    invoke-virtual {v1, v3}, Lt37;->x(Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move-result v10

    .line 975
    move-object/from16 v40, v3

    .line 976
    .line 977
    move/from16 v41, v10

    .line 978
    .line 979
    goto :goto_25

    .line 980
    :cond_46
    invoke-static {v3}, Lci8;->r(Ldh8;)Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v3

    .line 984
    if-eqz v3, :cond_44

    .line 985
    .line 986
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    move-result-object v10

    .line 990
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    .line 991
    .line 992
    .line 993
    move-result v10

    .line 994
    if-eqz v10, :cond_44

    .line 995
    .line 996
    invoke-static {v3}, Lz51;->y(Ljava/lang/Object;)Lne;

    .line 997
    .line 998
    .line 999
    move-result-object v3

    .line 1000
    goto :goto_23

    .line 1001
    :cond_47
    sget-object v3, Lsp4;->u0:Ldp3;

    .line 1002
    .line 1003
    goto :goto_23

    .line 1004
    :cond_48
    invoke-virtual {v3}, Lmb6;->M()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    if-eqz v3, :cond_49

    .line 1009
    .line 1010
    sget-object v3, Lsp4;->u0:Ldp3;

    .line 1011
    .line 1012
    goto :goto_23

    .line 1013
    :cond_49
    const/4 v3, 0x0

    .line 1014
    goto :goto_23

    .line 1015
    :cond_4a
    :goto_24
    const/16 v40, 0x0

    .line 1016
    .line 1017
    const/16 v41, 0x0

    .line 1018
    .line 1019
    :goto_25
    new-instance v3, Luv;

    .line 1020
    .line 1021
    invoke-direct {v3, v2, v8, v9}, Luv;-><init>(Lfa6;Lri8;Lar3;)V

    .line 1022
    .line 1023
    .line 1024
    new-instance v34, Luv;

    .line 1025
    .line 1026
    const/16 v36, 0x0

    .line 1027
    .line 1028
    const/16 v39, 0x0

    .line 1029
    .line 1030
    move-object/from16 v35, v3

    .line 1031
    .line 1032
    move-object/from16 v37, v8

    .line 1033
    .line 1034
    move-object/from16 v38, v9

    .line 1035
    .line 1036
    invoke-direct/range {v34 .. v41}, Luv;-><init>(Luv;Ld50;Lri8;Lar3;Lc25;Ljava/lang/Object;Z)V

    .line 1037
    .line 1038
    .line 1039
    move-object/from16 v12, v34

    .line 1040
    .line 1041
    goto :goto_26

    .line 1042
    :cond_4b
    const/4 v12, 0x0

    .line 1043
    :goto_26
    move-object v2, v12

    .line 1044
    goto :goto_29

    .line 1045
    :cond_4c
    iget-object v2, v5, Ls37;->X:[Lu37;

    .line 1046
    .line 1047
    const/4 v3, 0x0

    .line 1048
    const/4 v8, 0x0

    .line 1049
    :goto_27
    array-length v9, v2

    .line 1050
    if-ge v3, v9, :cond_4d

    .line 1051
    .line 1052
    const/4 v9, 0x1

    .line 1053
    goto :goto_28

    .line 1054
    :cond_4d
    const/4 v9, 0x0

    .line 1055
    :goto_28
    if-eqz v9, :cond_50

    .line 1056
    .line 1057
    array-length v8, v2

    .line 1058
    if-ge v3, v8, :cond_4f

    .line 1059
    .line 1060
    add-int/lit8 v8, v3, 0x1

    .line 1061
    .line 1062
    aget-object v3, v2, v3

    .line 1063
    .line 1064
    invoke-virtual {v3, v6}, Lu37;->a(Ldh8;)Lar3;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v3

    .line 1068
    if-eqz v3, :cond_4e

    .line 1069
    .line 1070
    move-object v2, v3

    .line 1071
    goto :goto_29

    .line 1072
    :cond_4e
    move/from16 v46, v8

    .line 1073
    .line 1074
    move-object v8, v3

    .line 1075
    move/from16 v3, v46

    .line 1076
    .line 1077
    goto :goto_27

    .line 1078
    :cond_4f
    invoke-static {}, Lbt;->n()V

    .line 1079
    .line 1080
    .line 1081
    const/16 v23, 0x0

    .line 1082
    .line 1083
    return-object v23

    .line 1084
    :cond_50
    move-object v2, v8

    .line 1085
    :goto_29
    if-nez v2, :cond_3b

    .line 1086
    .line 1087
    invoke-virtual/range {p0 .. p3}, Lf30;->Y(Lt37;Ldh8;Lz20;)Llj7;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    goto/16 :goto_1f

    .line 1092
    .line 1093
    :goto_2a
    if-nez v2, :cond_e7

    .line 1094
    .line 1095
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    sget-object v3, Lf30;->h0:Ljava/util/HashMap;

    .line 1100
    .line 1101
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v3

    .line 1105
    check-cast v3, Lar3;

    .line 1106
    .line 1107
    if-nez v3, :cond_51

    .line 1108
    .line 1109
    sget-object v8, Lf30;->i0:Ljava/util/HashMap;

    .line 1110
    .line 1111
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v2

    .line 1115
    check-cast v2, Ljava/lang/Class;

    .line 1116
    .line 1117
    if-eqz v2, :cond_51

    .line 1118
    .line 1119
    const/4 v8, 0x0

    .line 1120
    invoke-static {v2, v8}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v2

    .line 1124
    check-cast v2, Lar3;

    .line 1125
    .line 1126
    goto :goto_2b

    .line 1127
    :cond_51
    move-object v2, v3

    .line 1128
    :goto_2b
    if-nez v2, :cond_e7

    .line 1129
    .line 1130
    invoke-virtual {v6}, Ldh8;->J0()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v2

    .line 1134
    const-class v8, Ljava/util/Map$Entry;

    .line 1135
    .line 1136
    const-class v9, Ljava/lang/Object;

    .line 1137
    .line 1138
    if-eqz v2, :cond_5b

    .line 1139
    .line 1140
    invoke-virtual {v7}, Lz20;->b()Lno3;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    iget-object v10, v2, Lno3;->Y:Lmo3;

    .line 1145
    .line 1146
    if-ne v10, v4, :cond_58

    .line 1147
    .line 1148
    invoke-virtual {v7}, Lz20;->a()Ljava/util/List;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    :cond_52
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v4

    .line 1160
    if-eqz v4, :cond_53

    .line 1161
    .line 1162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v4

    .line 1166
    check-cast v4, Le50;

    .line 1167
    .line 1168
    invoke-virtual {v4}, Le50;->j()Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    const-string v10, "declaringClass"

    .line 1173
    .line 1174
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v4

    .line 1178
    if-eqz v4, :cond_52

    .line 1179
    .line 1180
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1181
    .line 1182
    .line 1183
    :cond_53
    invoke-virtual {v6}, Ldh8;->J0()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v2

    .line 1187
    if-eqz v2, :cond_56

    .line 1188
    .line 1189
    move-object/from16 v10, v33

    .line 1190
    .line 1191
    iget-object v2, v10, Ldh8;->j0:Ljava/lang/Class;

    .line 1192
    .line 1193
    sget-object v4, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 1194
    .line 1195
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v4

    .line 1199
    move-object/from16 v12, v26

    .line 1200
    .line 1201
    if-eq v4, v12, :cond_54

    .line 1202
    .line 1203
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v2

    .line 1207
    :cond_54
    invoke-virtual {v7}, Lz20;->a()Ljava/util/List;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v4

    .line 1215
    :cond_55
    :goto_2c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1216
    .line 1217
    .line 1218
    move-result v13

    .line 1219
    if-eqz v13, :cond_57

    .line 1220
    .line 1221
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v13

    .line 1225
    check-cast v13, Le50;

    .line 1226
    .line 1227
    invoke-virtual {v13}, Le50;->k()Ldh8;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v14

    .line 1231
    invoke-virtual {v14}, Ldh8;->J0()Z

    .line 1232
    .line 1233
    .line 1234
    move-result v15

    .line 1235
    if-eqz v15, :cond_55

    .line 1236
    .line 1237
    invoke-virtual {v14, v2}, Ldh8;->L0(Ljava/lang/Class;)Z

    .line 1238
    .line 1239
    .line 1240
    move-result v14

    .line 1241
    if-eqz v14, :cond_55

    .line 1242
    .line 1243
    invoke-virtual {v13}, Le50;->e()Lgl;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v13

    .line 1247
    invoke-virtual {v13}, Lvj8;->K()I

    .line 1248
    .line 1249
    .line 1250
    move-result v13

    .line 1251
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v13

    .line 1255
    if-eqz v13, :cond_55

    .line 1256
    .line 1257
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 1258
    .line 1259
    .line 1260
    goto :goto_2c

    .line 1261
    :cond_56
    move-object/from16 v12, v26

    .line 1262
    .line 1263
    move-object/from16 v10, v33

    .line 1264
    .line 1265
    :cond_57
    move-object/from16 v25, v5

    .line 1266
    .line 1267
    move-object/from16 v13, v32

    .line 1268
    .line 1269
    :goto_2d
    const/4 v2, 0x0

    .line 1270
    :goto_2e
    const/4 v5, 0x0

    .line 1271
    goto/16 :goto_3b

    .line 1272
    .line 1273
    :cond_58
    move-object/from16 v12, v26

    .line 1274
    .line 1275
    move-object/from16 v13, v32

    .line 1276
    .line 1277
    move-object/from16 v10, v33

    .line 1278
    .line 1279
    invoke-static {v13, v11, v7, v2}, Lv22;->s(Ljava/lang/Class;Ll37;Lz20;Lno3;)Lv22;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    invoke-virtual {v5}, Ls37;->a()Z

    .line 1284
    .line 1285
    .line 1286
    move-result v4

    .line 1287
    if-eqz v4, :cond_5a

    .line 1288
    .line 1289
    invoke-virtual {v5}, Ls37;->b()Llt;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v4

    .line 1293
    invoke-virtual {v4}, Llt;->hasNext()Z

    .line 1294
    .line 1295
    .line 1296
    move-result v14

    .line 1297
    if-nez v14, :cond_59

    .line 1298
    .line 1299
    goto :goto_2f

    .line 1300
    :cond_59
    invoke-virtual {v4}, Llt;->next()Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v0

    .line 1304
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 1305
    .line 1306
    .line 1307
    const/16 v23, 0x0

    .line 1308
    .line 1309
    throw v23

    .line 1310
    :cond_5a
    :goto_2f
    move-object/from16 v25, v5

    .line 1311
    .line 1312
    goto :goto_2e

    .line 1313
    :cond_5b
    move-object/from16 v12, v26

    .line 1314
    .line 1315
    move-object/from16 v13, v32

    .line 1316
    .line 1317
    move-object/from16 v10, v33

    .line 1318
    .line 1319
    sget-object v2, Lmd5;->f0:Lmd5;

    .line 1320
    .line 1321
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1322
    .line 1323
    .line 1324
    sget-object v3, Lmd5;->Y:Ljava/lang/Class;

    .line 1325
    .line 1326
    if-eqz v3, :cond_5c

    .line 1327
    .line 1328
    invoke-virtual {v3, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1329
    .line 1330
    .line 1331
    move-result v3

    .line 1332
    if-eqz v3, :cond_5c

    .line 1333
    .line 1334
    const-string v2, "com.fasterxml.jackson.databind.ext.DOMSerializer"

    .line 1335
    .line 1336
    invoke-static {v6, v2}, Lmd5;->b(Ldh8;Ljava/lang/String;)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    check-cast v2, Lar3;

    .line 1341
    .line 1342
    goto/16 :goto_34

    .line 1343
    .line 1344
    :cond_5c
    sget-object v3, Lmd5;->Z:Loj3;

    .line 1345
    .line 1346
    if-eqz v3, :cond_5e

    .line 1347
    .line 1348
    iget-object v3, v3, Loj3;->b:Ljava/lang/Class;

    .line 1349
    .line 1350
    invoke-virtual {v3, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v3

    .line 1354
    if-eqz v3, :cond_5d

    .line 1355
    .line 1356
    new-instance v3, Lu45;

    .line 1357
    .line 1358
    invoke-direct {v3}, Lu45;-><init>()V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_30

    .line 1362
    :cond_5d
    const/4 v3, 0x0

    .line 1363
    :goto_30
    if-eqz v3, :cond_5e

    .line 1364
    .line 1365
    move-object v2, v3

    .line 1366
    goto :goto_34

    .line 1367
    :cond_5e
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v3

    .line 1371
    iget-object v2, v2, Lmd5;->X:Ljava/util/HashMap;

    .line 1372
    .line 1373
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    if-eqz v2, :cond_60

    .line 1378
    .line 1379
    instance-of v3, v2, Lar3;

    .line 1380
    .line 1381
    if-eqz v3, :cond_5f

    .line 1382
    .line 1383
    check-cast v2, Lar3;

    .line 1384
    .line 1385
    goto :goto_34

    .line 1386
    :cond_5f
    check-cast v2, Ljava/lang/String;

    .line 1387
    .line 1388
    invoke-static {v6, v2}, Lmd5;->b(Ldh8;Ljava/lang/String;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2

    .line 1392
    check-cast v2, Lar3;

    .line 1393
    .line 1394
    goto :goto_34

    .line 1395
    :cond_60
    const-string v2, "javax.xml."

    .line 1396
    .line 1397
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v3

    .line 1401
    if-nez v3, :cond_63

    .line 1402
    .line 1403
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v3

    .line 1407
    :goto_31
    if-eqz v3, :cond_64

    .line 1408
    .line 1409
    if-ne v3, v9, :cond_61

    .line 1410
    .line 1411
    goto :goto_33

    .line 1412
    :cond_61
    move-object/from16 v25, v3

    .line 1413
    .line 1414
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v3

    .line 1418
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v3

    .line 1422
    if-eqz v3, :cond_62

    .line 1423
    .line 1424
    goto :goto_32

    .line 1425
    :cond_62
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v3

    .line 1429
    goto :goto_31

    .line 1430
    :cond_63
    :goto_32
    const-string v2, "com.fasterxml.jackson.databind.ext.CoreXMLSerializers"

    .line 1431
    .line 1432
    invoke-static {v6, v2}, Lmd5;->b(Ldh8;Ljava/lang/String;)Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v2

    .line 1436
    if-nez v2, :cond_65

    .line 1437
    .line 1438
    :cond_64
    :goto_33
    const/4 v2, 0x0

    .line 1439
    goto :goto_34

    .line 1440
    :cond_65
    check-cast v2, Lu37;

    .line 1441
    .line 1442
    invoke-virtual {v2, v6}, Lu37;->a(Ldh8;)Lar3;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    :goto_34
    if-eqz v2, :cond_66

    .line 1447
    .line 1448
    goto/16 :goto_2f

    .line 1449
    .line 1450
    :cond_66
    const-class v2, Ljava/util/Calendar;

    .line 1451
    .line 1452
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1453
    .line 1454
    .line 1455
    move-result v2

    .line 1456
    if-eqz v2, :cond_67

    .line 1457
    .line 1458
    sget-object v2, Lcd0;->i0:Lcd0;

    .line 1459
    .line 1460
    goto/16 :goto_2f

    .line 1461
    .line 1462
    :cond_67
    const-class v2, Ljava/util/Date;

    .line 1463
    .line 1464
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v2

    .line 1468
    if-eqz v2, :cond_68

    .line 1469
    .line 1470
    sget-object v2, Lxb1;->i0:Lxb1;

    .line 1471
    .line 1472
    goto/16 :goto_2f

    .line 1473
    .line 1474
    :cond_68
    invoke-virtual {v8, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v2

    .line 1478
    if-eqz v2, :cond_76

    .line 1479
    .line 1480
    invoke-virtual {v6, v8}, Ldh8;->x0(Ljava/lang/Class;)Ldh8;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v2

    .line 1484
    iget-object v3, v2, Ldh8;->q0:Lgh8;

    .line 1485
    .line 1486
    move-object/from16 v25, v5

    .line 1487
    .line 1488
    const/4 v5, 0x0

    .line 1489
    invoke-virtual {v3, v5}, Lgh8;->d(I)Ldh8;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v3

    .line 1493
    if-nez v3, :cond_69

    .line 1494
    .line 1495
    sget-object v3, Luh8;->u0:Lba7;

    .line 1496
    .line 1497
    :cond_69
    move-object/from16 v36, v3

    .line 1498
    .line 1499
    iget-object v2, v2, Ldh8;->q0:Lgh8;

    .line 1500
    .line 1501
    const/4 v3, 0x1

    .line 1502
    invoke-virtual {v2, v3}, Lgh8;->d(I)Ldh8;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v2

    .line 1506
    if-nez v2, :cond_6a

    .line 1507
    .line 1508
    sget-object v2, Luh8;->u0:Lba7;

    .line 1509
    .line 1510
    :cond_6a
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1511
    .line 1512
    .line 1513
    sget-object v3, Lno3;->k0:Lno3;

    .line 1514
    .line 1515
    invoke-virtual {v7}, Lz20;->b()Lno3;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v5

    .line 1519
    sget-object v26, Lno3;->k0:Lno3;

    .line 1520
    .line 1521
    if-nez v5, :cond_6b

    .line 1522
    .line 1523
    goto :goto_35

    .line 1524
    :cond_6b
    invoke-virtual {v5, v3}, Lno3;->c(Lno3;)Lno3;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v3

    .line 1528
    :goto_35
    iget-object v3, v3, Lno3;->Y:Lmo3;

    .line 1529
    .line 1530
    if-ne v3, v4, :cond_6c

    .line 1531
    .line 1532
    goto/16 :goto_2d

    .line 1533
    .line 1534
    :cond_6c
    new-instance v34, Lop4;

    .line 1535
    .line 1536
    invoke-virtual {v0, v11, v2}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v39

    .line 1540
    const/16 v40, 0x0

    .line 1541
    .line 1542
    move/from16 v4, v37

    .line 1543
    .line 1544
    move-object/from16 v37, v2

    .line 1545
    .line 1546
    move-object/from16 v35, v2

    .line 1547
    .line 1548
    move/from16 v38, v4

    .line 1549
    .line 1550
    invoke-direct/range {v34 .. v40}, Lop4;-><init>(Ldh8;Ldh8;Ldh8;ZLsi8;Ld50;)V

    .line 1551
    .line 1552
    .line 1553
    move-object/from16 v3, v34

    .line 1554
    .line 1555
    move/from16 v37, v38

    .line 1556
    .line 1557
    invoke-static {v1, v7, v2, v8}, Lf30;->X(Lt37;Lz20;Ldh8;Ljava/lang/Class;)Lep3;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v4

    .line 1561
    iget-object v5, v4, Lep3;->Y:Ldp3;

    .line 1562
    .line 1563
    if-eq v5, v15, :cond_6d

    .line 1564
    .line 1565
    if-ne v5, v14, :cond_6e

    .line 1566
    .line 1567
    :cond_6d
    :goto_36
    move-object/from16 v34, v3

    .line 1568
    .line 1569
    goto/16 :goto_3a

    .line 1570
    .line 1571
    :cond_6e
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 1572
    .line 1573
    .line 1574
    move-result v5

    .line 1575
    const/4 v14, 0x2

    .line 1576
    if-eq v5, v14, :cond_73

    .line 1577
    .line 1578
    const/4 v14, 0x3

    .line 1579
    if-eq v5, v14, :cond_72

    .line 1580
    .line 1581
    const/4 v14, 0x4

    .line 1582
    if-eq v5, v14, :cond_71

    .line 1583
    .line 1584
    const/4 v14, 0x5

    .line 1585
    if-eq v5, v14, :cond_6f

    .line 1586
    .line 1587
    const/16 v42, 0x0

    .line 1588
    .line 1589
    :goto_37
    const/16 v43, 0x1

    .line 1590
    .line 1591
    goto :goto_39

    .line 1592
    :cond_6f
    iget-object v2, v4, Lep3;->f0:Ljava/lang/Class;

    .line 1593
    .line 1594
    invoke-virtual {v1, v2}, Lt37;->w(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v2

    .line 1598
    if-eqz v2, :cond_70

    .line 1599
    .line 1600
    invoke-virtual {v1, v2}, Lt37;->x(Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v4

    .line 1604
    move-object/from16 v42, v2

    .line 1605
    .line 1606
    move/from16 v43, v4

    .line 1607
    .line 1608
    goto :goto_39

    .line 1609
    :cond_70
    :goto_38
    move-object/from16 v42, v2

    .line 1610
    .line 1611
    goto :goto_37

    .line 1612
    :cond_71
    invoke-static {v2}, Lci8;->r(Ldh8;)Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v2

    .line 1616
    if-eqz v2, :cond_70

    .line 1617
    .line 1618
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v4

    .line 1622
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 1623
    .line 1624
    .line 1625
    move-result v4

    .line 1626
    if-eqz v4, :cond_70

    .line 1627
    .line 1628
    invoke-static {v2}, Lz51;->y(Ljava/lang/Object;)Lne;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    goto :goto_38

    .line 1633
    :cond_72
    sget-object v2, Lsp4;->u0:Ldp3;

    .line 1634
    .line 1635
    goto :goto_38

    .line 1636
    :cond_73
    invoke-virtual {v2}, Lmb6;->M()Z

    .line 1637
    .line 1638
    .line 1639
    move-result v2

    .line 1640
    if-eqz v2, :cond_74

    .line 1641
    .line 1642
    sget-object v2, Lsp4;->u0:Ldp3;

    .line 1643
    .line 1644
    goto :goto_38

    .line 1645
    :cond_74
    const/4 v2, 0x0

    .line 1646
    goto :goto_38

    .line 1647
    :goto_39
    if-nez v42, :cond_75

    .line 1648
    .line 1649
    if-nez v43, :cond_75

    .line 1650
    .line 1651
    goto :goto_36

    .line 1652
    :cond_75
    new-instance v38, Lop4;

    .line 1653
    .line 1654
    iget-object v2, v3, Lop4;->i0:Lar3;

    .line 1655
    .line 1656
    iget-object v4, v3, Lop4;->j0:Lar3;

    .line 1657
    .line 1658
    move-object/from16 v40, v2

    .line 1659
    .line 1660
    move-object/from16 v39, v3

    .line 1661
    .line 1662
    move-object/from16 v41, v4

    .line 1663
    .line 1664
    invoke-direct/range {v38 .. v43}, Lop4;-><init>(Lop4;Lar3;Lar3;Ljava/lang/Object;Z)V

    .line 1665
    .line 1666
    .line 1667
    move-object/from16 v2, v38

    .line 1668
    .line 1669
    goto/16 :goto_2e

    .line 1670
    .line 1671
    :goto_3a
    move-object/from16 v2, v34

    .line 1672
    .line 1673
    goto/16 :goto_2e

    .line 1674
    .line 1675
    :cond_76
    move-object/from16 v25, v5

    .line 1676
    .line 1677
    const-class v2, Ljava/nio/ByteBuffer;

    .line 1678
    .line 1679
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1680
    .line 1681
    .line 1682
    move-result v2

    .line 1683
    if-eqz v2, :cond_77

    .line 1684
    .line 1685
    new-instance v2, Lbb0;

    .line 1686
    .line 1687
    const/4 v5, 0x0

    .line 1688
    invoke-direct {v2, v5}, Lbb0;-><init>(B)V

    .line 1689
    .line 1690
    .line 1691
    goto/16 :goto_3b

    .line 1692
    .line 1693
    :cond_77
    const/4 v5, 0x0

    .line 1694
    const-class v2, Ljava/net/InetAddress;

    .line 1695
    .line 1696
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1697
    .line 1698
    .line 1699
    move-result v2

    .line 1700
    if-eqz v2, :cond_78

    .line 1701
    .line 1702
    new-instance v2, Lt60;

    .line 1703
    .line 1704
    const/4 v14, 0x2

    .line 1705
    invoke-direct {v2, v14, v5}, Lt60;-><init>(BZ)V

    .line 1706
    .line 1707
    .line 1708
    goto :goto_3b

    .line 1709
    :cond_78
    const-class v2, Ljava/net/InetSocketAddress;

    .line 1710
    .line 1711
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v2

    .line 1715
    if-eqz v2, :cond_79

    .line 1716
    .line 1717
    new-instance v2, Lbb0;

    .line 1718
    .line 1719
    const/4 v3, 0x1

    .line 1720
    invoke-direct {v2, v3}, Lbb0;-><init>(B)V

    .line 1721
    .line 1722
    .line 1723
    goto :goto_3b

    .line 1724
    :cond_79
    const-class v2, Ljava/util/TimeZone;

    .line 1725
    .line 1726
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1727
    .line 1728
    .line 1729
    move-result v2

    .line 1730
    if-eqz v2, :cond_7a

    .line 1731
    .line 1732
    new-instance v2, Lbb0;

    .line 1733
    .line 1734
    const/4 v14, 0x3

    .line 1735
    invoke-direct {v2, v14}, Lbb0;-><init>(B)V

    .line 1736
    .line 1737
    .line 1738
    goto :goto_3b

    .line 1739
    :cond_7a
    const-class v2, Ljava/nio/charset/Charset;

    .line 1740
    .line 1741
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1742
    .line 1743
    .line 1744
    move-result v2

    .line 1745
    if-eqz v2, :cond_7c

    .line 1746
    .line 1747
    :cond_7b
    move-object/from16 v2, v22

    .line 1748
    .line 1749
    goto :goto_3b

    .line 1750
    :cond_7c
    const-class v2, Ljava/lang/Number;

    .line 1751
    .line 1752
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1753
    .line 1754
    .line 1755
    move-result v2

    .line 1756
    if-eqz v2, :cond_7f

    .line 1757
    .line 1758
    invoke-virtual {v7}, Lz20;->b()Lno3;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v2

    .line 1762
    iget-object v2, v2, Lno3;->Y:Lmo3;

    .line 1763
    .line 1764
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1765
    .line 1766
    .line 1767
    move-result v2

    .line 1768
    const/4 v14, 0x5

    .line 1769
    if-eq v2, v14, :cond_7b

    .line 1770
    .line 1771
    const/4 v3, 0x7

    .line 1772
    if-eq v2, v3, :cond_7d

    .line 1773
    .line 1774
    const/16 v3, 0x8

    .line 1775
    .line 1776
    if-eq v2, v3, :cond_7e

    .line 1777
    .line 1778
    sget-object v2, Lt75;->f0:Lt75;

    .line 1779
    .line 1780
    goto :goto_3b

    .line 1781
    :cond_7d
    const/16 v3, 0x8

    .line 1782
    .line 1783
    :cond_7e
    const/4 v2, 0x0

    .line 1784
    goto :goto_3b

    .line 1785
    :cond_7f
    const/16 v3, 0x8

    .line 1786
    .line 1787
    const-class v2, Ljava/lang/ClassLoader;

    .line 1788
    .line 1789
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1790
    .line 1791
    .line 1792
    move-result v2

    .line 1793
    if-eqz v2, :cond_7e

    .line 1794
    .line 1795
    new-instance v2, Lc75;

    .line 1796
    .line 1797
    invoke-direct {v2, v6, v3}, Lc75;-><init>(Ldh8;B)V

    .line 1798
    .line 1799
    .line 1800
    :goto_3b
    if-nez v2, :cond_e8

    .line 1801
    .line 1802
    sget-object v2, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 1803
    .line 1804
    invoke-virtual {v13}, Ljava/lang/Class;->isAnnotation()Z

    .line 1805
    .line 1806
    .line 1807
    move-result v2

    .line 1808
    if-eqz v2, :cond_80

    .line 1809
    .line 1810
    const-string v2, "annotation"

    .line 1811
    .line 1812
    goto :goto_3c

    .line 1813
    :cond_80
    invoke-virtual {v13}, Ljava/lang/Class;->isArray()Z

    .line 1814
    .line 1815
    .line 1816
    move-result v2

    .line 1817
    if-eqz v2, :cond_81

    .line 1818
    .line 1819
    const-string v2, "array"

    .line 1820
    .line 1821
    goto :goto_3c

    .line 1822
    :cond_81
    invoke-virtual {v12, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1823
    .line 1824
    .line 1825
    move-result v2

    .line 1826
    if-eqz v2, :cond_82

    .line 1827
    .line 1828
    const-string v2, "enum"

    .line 1829
    .line 1830
    goto :goto_3c

    .line 1831
    :cond_82
    invoke-virtual {v13}, Ljava/lang/Class;->isPrimitive()Z

    .line 1832
    .line 1833
    .line 1834
    move-result v2

    .line 1835
    if-eqz v2, :cond_83

    .line 1836
    .line 1837
    const-string v2, "primitive"

    .line 1838
    .line 1839
    goto :goto_3c

    .line 1840
    :cond_83
    const/4 v2, 0x0

    .line 1841
    :goto_3c
    if-nez v2, :cond_84

    .line 1842
    .line 1843
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v2

    .line 1847
    const-string v3, "net.sf.cglib.proxy."

    .line 1848
    .line 1849
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1850
    .line 1851
    .line 1852
    move-result v3

    .line 1853
    if-nez v3, :cond_84

    .line 1854
    .line 1855
    const-string v3, "org.hibernate.proxy."

    .line 1856
    .line 1857
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1858
    .line 1859
    .line 1860
    move-result v2

    .line 1861
    if-eqz v2, :cond_85

    .line 1862
    .line 1863
    :cond_84
    invoke-virtual {v12, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1864
    .line 1865
    .line 1866
    move-result v2

    .line 1867
    if-nez v2, :cond_85

    .line 1868
    .line 1869
    const/4 v8, 0x0

    .line 1870
    goto/16 :goto_6f

    .line 1871
    .line 1872
    :cond_85
    iget-object v2, v10, Ldh8;->j0:Ljava/lang/Class;

    .line 1873
    .line 1874
    if-ne v2, v9, :cond_86

    .line 1875
    .line 1876
    invoke-virtual {v1, v9}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    :goto_3d
    move-object v8, v0

    .line 1881
    goto/16 :goto_6f

    .line 1882
    .line 1883
    :cond_86
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v2

    .line 1887
    const-string v3, "java.time."

    .line 1888
    .line 1889
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1890
    .line 1891
    .line 1892
    move-result v3

    .line 1893
    if-eqz v3, :cond_8b

    .line 1894
    .line 1895
    const/16 v3, 0x2e

    .line 1896
    .line 1897
    const/16 v4, 0xa

    .line 1898
    .line 1899
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->indexOf(II)I

    .line 1900
    .line 1901
    .line 1902
    move-result v2

    .line 1903
    if-ltz v2, :cond_88

    .line 1904
    .line 1905
    :cond_87
    :goto_3e
    const/4 v2, 0x0

    .line 1906
    goto :goto_40

    .line 1907
    :cond_88
    const-class v2, Ljava/lang/Throwable;

    .line 1908
    .line 1909
    invoke-virtual {v6, v2}, Ldh8;->L0(Ljava/lang/Class;)Z

    .line 1910
    .line 1911
    .line 1912
    move-result v2

    .line 1913
    if-eqz v2, :cond_89

    .line 1914
    .line 1915
    goto :goto_3e

    .line 1916
    :cond_89
    sget-object v2, Lxp4;->G0:Lxp4;

    .line 1917
    .line 1918
    if-eqz v11, :cond_8a

    .line 1919
    .line 1920
    invoke-virtual {v11, v2}, Lvp4;->f(Lxp4;)Z

    .line 1921
    .line 1922
    .line 1923
    move-result v3

    .line 1924
    if-eqz v3, :cond_87

    .line 1925
    .line 1926
    :cond_8a
    const-string v3, "Java 8 date/time"

    .line 1927
    .line 1928
    const-string v4, "com.fasterxml.jackson.datatype:jackson-datatype-jsr310"

    .line 1929
    .line 1930
    goto :goto_3f

    .line 1931
    :cond_8b
    const-string v3, "org.joda.time."

    .line 1932
    .line 1933
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1934
    .line 1935
    .line 1936
    move-result v3

    .line 1937
    if-eqz v3, :cond_8c

    .line 1938
    .line 1939
    const-string v3, "Joda date/time"

    .line 1940
    .line 1941
    const-string v4, "com.fasterxml.jackson.datatype:jackson-datatype-joda"

    .line 1942
    .line 1943
    const/4 v2, 0x0

    .line 1944
    goto :goto_3f

    .line 1945
    :cond_8c
    const-string v3, "java.util.Optional"

    .line 1946
    .line 1947
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1948
    .line 1949
    .line 1950
    move-result v2

    .line 1951
    if-eqz v2, :cond_87

    .line 1952
    .line 1953
    sget-object v2, Lxp4;->F0:Lxp4;

    .line 1954
    .line 1955
    if-eqz v11, :cond_8d

    .line 1956
    .line 1957
    invoke-virtual {v11, v2}, Lvp4;->f(Lxp4;)Z

    .line 1958
    .line 1959
    .line 1960
    move-result v3

    .line 1961
    if-eqz v3, :cond_87

    .line 1962
    .line 1963
    :cond_8d
    const-string v3, "Java 8 optional"

    .line 1964
    .line 1965
    const-string v4, "com.fasterxml.jackson.datatype:jackson-datatype-jdk8"

    .line 1966
    .line 1967
    :goto_3f
    invoke-static {v6}, Lit0;->n(Ldh8;)Ljava/lang/String;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v9

    .line 1971
    const-string v12, " type "

    .line 1972
    .line 1973
    const-string v14, " not supported by default: add Module \""

    .line 1974
    .line 1975
    invoke-static {v3, v12, v9, v14, v4}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v3

    .line 1979
    const-string v4, "\" to enable handling"

    .line 1980
    .line 1981
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1982
    .line 1983
    .line 1984
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v3

    .line 1988
    if-eqz v2, :cond_8e

    .line 1989
    .line 1990
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v2

    .line 1994
    const-string v4, " (or disable `MapperFeature."

    .line 1995
    .line 1996
    const-string v9, "`)"

    .line 1997
    .line 1998
    invoke-static {v3, v4, v2, v9}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v2

    .line 2002
    goto :goto_40

    .line 2003
    :cond_8e
    move-object v2, v3

    .line 2004
    :goto_40
    if-eqz v2, :cond_8f

    .line 2005
    .line 2006
    iget-object v3, v11, Lwp4;->Z:Lu97;

    .line 2007
    .line 2008
    invoke-virtual {v3, v13}, Lu97;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v3

    .line 2012
    if-nez v3, :cond_8f

    .line 2013
    .line 2014
    new-instance v3, Lkj7;

    .line 2015
    .line 2016
    invoke-direct {v3, v6, v2}, Lkj7;-><init>(Ldh8;Ljava/lang/String;)V

    .line 2017
    .line 2018
    .line 2019
    goto :goto_41

    .line 2020
    :cond_8f
    const/4 v3, 0x0

    .line 2021
    :goto_41
    if-eqz v3, :cond_90

    .line 2022
    .line 2023
    move-object v8, v3

    .line 2024
    goto/16 :goto_6f

    .line 2025
    .line 2026
    :cond_90
    const-class v2, Lnp3;

    .line 2027
    .line 2028
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2029
    .line 2030
    .line 2031
    move-result v2

    .line 2032
    if-nez v2, :cond_e5

    .line 2033
    .line 2034
    const-class v2, Lj85;

    .line 2035
    .line 2036
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2037
    .line 2038
    .line 2039
    move-result v2

    .line 2040
    if-nez v2, :cond_e5

    .line 2041
    .line 2042
    const-class v2, Lm85;

    .line 2043
    .line 2044
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2045
    .line 2046
    .line 2047
    move-result v2

    .line 2048
    if-nez v2, :cond_e5

    .line 2049
    .line 2050
    const-class v2, Lt37;

    .line 2051
    .line 2052
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2053
    .line 2054
    .line 2055
    move-result v2

    .line 2056
    if-nez v2, :cond_e5

    .line 2057
    .line 2058
    const-class v2, Lio3;

    .line 2059
    .line 2060
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2061
    .line 2062
    .line 2063
    move-result v2

    .line 2064
    if-nez v2, :cond_e5

    .line 2065
    .line 2066
    const-class v2, Lb86;

    .line 2067
    .line 2068
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2069
    .line 2070
    .line 2071
    move-result v2

    .line 2072
    if-nez v2, :cond_e5

    .line 2073
    .line 2074
    const-class v2, Lro3;

    .line 2075
    .line 2076
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2077
    .line 2078
    .line 2079
    move-result v2

    .line 2080
    if-eqz v2, :cond_91

    .line 2081
    .line 2082
    goto/16 :goto_6e

    .line 2083
    .line 2084
    :cond_91
    invoke-virtual {v6, v8}, Ldh8;->L0(Ljava/lang/Class;)Z

    .line 2085
    .line 2086
    .line 2087
    move-result v2

    .line 2088
    if-eqz v2, :cond_92

    .line 2089
    .line 2090
    invoke-static {v13}, Lit0;->q(Ljava/lang/Class;)Z

    .line 2091
    .line 2092
    .line 2093
    move-result v2

    .line 2094
    if-eqz v2, :cond_92

    .line 2095
    .line 2096
    new-instance v0, Lc75;

    .line 2097
    .line 2098
    const/4 v13, 0x4

    .line 2099
    invoke-direct {v0, v6, v13}, Lc75;-><init>(Ldh8;B)V

    .line 2100
    .line 2101
    .line 2102
    goto/16 :goto_3d

    .line 2103
    .line 2104
    :cond_92
    new-instance v8, Lxy0;

    .line 2105
    .line 2106
    invoke-direct {v8, v7}, Lxy0;-><init>(Lz20;)V

    .line 2107
    .line 2108
    .line 2109
    iget-object v2, v8, Lxy0;->Y:Ljava/lang/Object;

    .line 2110
    .line 2111
    move-object v9, v2

    .line 2112
    check-cast v9, Lz20;

    .line 2113
    .line 2114
    iput-object v11, v8, Lxy0;->Z:Ljava/lang/Object;

    .line 2115
    .line 2116
    invoke-virtual {v7}, Lz20;->a()Ljava/util/List;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v2

    .line 2120
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v3

    .line 2124
    iget-object v12, v11, Lvp4;->Y:Ll20;

    .line 2125
    .line 2126
    new-instance v4, Ljava/util/HashMap;

    .line 2127
    .line 2128
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2129
    .line 2130
    .line 2131
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v14

    .line 2135
    :goto_42
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 2136
    .line 2137
    .line 2138
    move-result v15

    .line 2139
    if-eqz v15, :cond_98

    .line 2140
    .line 2141
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v15

    .line 2145
    check-cast v15, Le50;

    .line 2146
    .line 2147
    invoke-virtual {v15}, Le50;->e()Lgl;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v16

    .line 2151
    if-nez v16, :cond_93

    .line 2152
    .line 2153
    invoke-interface {v14}, Ljava/util/Iterator;->remove()V

    .line 2154
    .line 2155
    .line 2156
    goto :goto_42

    .line 2157
    :cond_93
    invoke-virtual {v15}, Le50;->l()Ljava/lang/Class;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v15

    .line 2161
    invoke-virtual {v4, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v16

    .line 2165
    check-cast v16, Ljava/lang/Boolean;

    .line 2166
    .line 2167
    if-nez v16, :cond_96

    .line 2168
    .line 2169
    invoke-virtual {v11, v15}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v5

    .line 2173
    iget-object v0, v12, Ll20;->Y:Lhi5;

    .line 2174
    .line 2175
    check-cast v0, Lb30;

    .line 2176
    .line 2177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2178
    .line 2179
    .line 2180
    invoke-static {v11, v5}, Lb30;->E0(Lvp4;Ldh8;)Lz20;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v0

    .line 2184
    if-nez v0, :cond_94

    .line 2185
    .line 2186
    invoke-static {v11, v5, v11}, Lbl;->g(Lvp4;Ldh8;Lvp4;)Lal;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v0

    .line 2190
    invoke-static {v11, v5, v0}, Lz20;->d(Lvp4;Ldh8;Lal;)Lz20;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v0

    .line 2194
    :cond_94
    iget-object v0, v0, Lz20;->e:Lal;

    .line 2195
    .line 2196
    invoke-virtual {v3, v0}, Lm85;->X(Lal;)Ljava/lang/Boolean;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v0

    .line 2200
    if-nez v0, :cond_95

    .line 2201
    .line 2202
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2203
    .line 2204
    :cond_95
    invoke-virtual {v4, v15, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2205
    .line 2206
    .line 2207
    move-object/from16 v16, v0

    .line 2208
    .line 2209
    :cond_96
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2210
    .line 2211
    .line 2212
    move-result v0

    .line 2213
    if-eqz v0, :cond_97

    .line 2214
    .line 2215
    invoke-interface {v14}, Ljava/util/Iterator;->remove()V

    .line 2216
    .line 2217
    .line 2218
    :cond_97
    const/4 v5, 0x0

    .line 2219
    move-object/from16 v0, p0

    .line 2220
    .line 2221
    goto :goto_42

    .line 2222
    :cond_98
    sget-object v0, Lxp4;->l0:Lxp4;

    .line 2223
    .line 2224
    invoke-virtual {v11, v0}, Lvp4;->f(Lxp4;)Z

    .line 2225
    .line 2226
    .line 2227
    move-result v0

    .line 2228
    if-eqz v0, :cond_99

    .line 2229
    .line 2230
    new-instance v0, Li50;

    .line 2231
    .line 2232
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2233
    .line 2234
    .line 2235
    invoke-interface {v2, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 2236
    .line 2237
    .line 2238
    :cond_99
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 2239
    .line 2240
    .line 2241
    move-result v0

    .line 2242
    if-eqz v0, :cond_9a

    .line 2243
    .line 2244
    move-object/from16 v14, v24

    .line 2245
    .line 2246
    const/4 v6, 0x1

    .line 2247
    const/4 v15, 0x0

    .line 2248
    :goto_43
    move-object/from16 v0, p0

    .line 2249
    .line 2250
    goto/16 :goto_48

    .line 2251
    .line 2252
    :cond_9a
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v0

    .line 2256
    move-object/from16 v14, v24

    .line 2257
    .line 2258
    invoke-virtual {v0, v14}, Lm85;->H(Lvj8;)Lwq3;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v0

    .line 2262
    if-eqz v0, :cond_9d

    .line 2263
    .line 2264
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2265
    .line 2266
    .line 2267
    move-result v0

    .line 2268
    if-eqz v0, :cond_9c

    .line 2269
    .line 2270
    const/4 v3, 0x1

    .line 2271
    if-eq v0, v3, :cond_9b

    .line 2272
    .line 2273
    goto :goto_44

    .line 2274
    :cond_9b
    move v4, v3

    .line 2275
    move/from16 v20, v4

    .line 2276
    .line 2277
    goto :goto_45

    .line 2278
    :cond_9c
    const/4 v4, 0x0

    .line 2279
    const/16 v20, 0x1

    .line 2280
    .line 2281
    goto :goto_45

    .line 2282
    :cond_9d
    const/4 v3, 0x1

    .line 2283
    :goto_44
    sget-object v0, Lxp4;->t0:Lxp4;

    .line 2284
    .line 2285
    invoke-virtual {v11, v0}, Lvp4;->f(Lxp4;)Z

    .line 2286
    .line 2287
    .line 2288
    move-result v0

    .line 2289
    move v4, v0

    .line 2290
    move/from16 v20, v3

    .line 2291
    .line 2292
    :goto_45
    new-instance v3, Lbl;

    .line 2293
    .line 2294
    invoke-direct {v3, v11, v7}, Lbl;-><init>(Ll37;Lz20;)V

    .line 2295
    .line 2296
    .line 2297
    new-instance v15, Ljava/util/ArrayList;

    .line 2298
    .line 2299
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2300
    .line 2301
    .line 2302
    move-result v0

    .line 2303
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 2304
    .line 2305
    .line 2306
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v16

    .line 2310
    :cond_9e
    :goto_46
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 2311
    .line 2312
    .line 2313
    move-result v0

    .line 2314
    if-eqz v0, :cond_a4

    .line 2315
    .line 2316
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v0

    .line 2320
    move-object v2, v0

    .line 2321
    check-cast v2, Le50;

    .line 2322
    .line 2323
    invoke-virtual {v2}, Le50;->e()Lgl;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v0

    .line 2327
    invoke-virtual {v2}, Le50;->p()Z

    .line 2328
    .line 2329
    .line 2330
    move-result v5

    .line 2331
    if-eqz v5, :cond_a0

    .line 2332
    .line 2333
    if-eqz v0, :cond_9e

    .line 2334
    .line 2335
    iget-object v2, v8, Lxy0;->i0:Ljava/lang/Object;

    .line 2336
    .line 2337
    check-cast v2, Lgl;

    .line 2338
    .line 2339
    if-nez v2, :cond_9f

    .line 2340
    .line 2341
    iput-object v0, v8, Lxy0;->i0:Ljava/lang/Object;

    .line 2342
    .line 2343
    goto :goto_46

    .line 2344
    :cond_9f
    iget-object v1, v8, Lxy0;->i0:Ljava/lang/Object;

    .line 2345
    .line 2346
    check-cast v1, Lgl;

    .line 2347
    .line 2348
    const-string v2, " and "

    .line 2349
    .line 2350
    const-string v3, "Multiple type ids specified with "

    .line 2351
    .line 2352
    invoke-static {v3, v1, v2, v0}, Lio/sentry/c2;->k(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2353
    .line 2354
    .line 2355
    const/16 v23, 0x0

    .line 2356
    .line 2357
    return-object v23

    .line 2358
    :cond_a0
    invoke-virtual {v2}, Le50;->c()Lr75;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v5

    .line 2362
    if-eqz v5, :cond_a1

    .line 2363
    .line 2364
    iget v5, v5, Lr75;->Y:I

    .line 2365
    .line 2366
    const/4 v1, 0x2

    .line 2367
    if-ne v5, v1, :cond_a2

    .line 2368
    .line 2369
    move-object/from16 v1, p1

    .line 2370
    .line 2371
    goto :goto_46

    .line 2372
    :cond_a1
    const/4 v1, 0x2

    .line 2373
    :cond_a2
    instance-of v5, v0, Lhl;

    .line 2374
    .line 2375
    if-eqz v5, :cond_a3

    .line 2376
    .line 2377
    move-object v5, v0

    .line 2378
    check-cast v5, Lhl;

    .line 2379
    .line 2380
    move-object/from16 v0, p0

    .line 2381
    .line 2382
    move/from16 v19, v1

    .line 2383
    .line 2384
    move/from16 v6, v20

    .line 2385
    .line 2386
    move-object/from16 v1, p1

    .line 2387
    .line 2388
    invoke-virtual/range {v0 .. v5}, Lj50;->a0(Lt37;Le50;Lbl;ZLgl;)Lf50;

    .line 2389
    .line 2390
    .line 2391
    move-result-object v2

    .line 2392
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2393
    .line 2394
    .line 2395
    goto :goto_47

    .line 2396
    :cond_a3
    move/from16 v19, v1

    .line 2397
    .line 2398
    move/from16 v6, v20

    .line 2399
    .line 2400
    move-object v5, v0

    .line 2401
    check-cast v5, Lel;

    .line 2402
    .line 2403
    move-object/from16 v0, p0

    .line 2404
    .line 2405
    move-object/from16 v1, p1

    .line 2406
    .line 2407
    invoke-virtual/range {v0 .. v5}, Lj50;->a0(Lt37;Le50;Lbl;ZLgl;)Lf50;

    .line 2408
    .line 2409
    .line 2410
    move-result-object v2

    .line 2411
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2412
    .line 2413
    .line 2414
    :goto_47
    move/from16 v20, v6

    .line 2415
    .line 2416
    move-object/from16 v6, p2

    .line 2417
    .line 2418
    goto :goto_46

    .line 2419
    :cond_a4
    move/from16 v6, v20

    .line 2420
    .line 2421
    goto/16 :goto_43

    .line 2422
    .line 2423
    :goto_48
    if-nez v15, :cond_a5

    .line 2424
    .line 2425
    new-instance v15, Ljava/util/ArrayList;

    .line 2426
    .line 2427
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 2428
    .line 2429
    .line 2430
    goto/16 :goto_4e

    .line 2431
    .line 2432
    :cond_a5
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 2433
    .line 2434
    .line 2435
    move-result v2

    .line 2436
    const/4 v5, 0x0

    .line 2437
    :goto_49
    if-ge v5, v2, :cond_ad

    .line 2438
    .line 2439
    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v3

    .line 2443
    check-cast v3, Lf50;

    .line 2444
    .line 2445
    iget-object v4, v3, Lf50;->n0:Lri8;

    .line 2446
    .line 2447
    if-eqz v4, :cond_ab

    .line 2448
    .line 2449
    invoke-virtual {v4}, Lri8;->c()Ltr3;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v6

    .line 2453
    move/from16 p4, v2

    .line 2454
    .line 2455
    sget-object v2, Ltr3;->f0:Ltr3;

    .line 2456
    .line 2457
    if-eq v6, v2, :cond_a6

    .line 2458
    .line 2459
    goto :goto_4d

    .line 2460
    :cond_a6
    invoke-virtual {v4}, Lri8;->b()Ljava/lang/String;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v2

    .line 2464
    invoke-static {v2}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v2

    .line 2468
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v4

    .line 2472
    :goto_4a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2473
    .line 2474
    .line 2475
    move-result v6

    .line 2476
    if-eqz v6, :cond_ac

    .line 2477
    .line 2478
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v6

    .line 2482
    check-cast v6, Lf50;

    .line 2483
    .line 2484
    move-object/from16 v16, v4

    .line 2485
    .line 2486
    if-eq v6, v3, :cond_aa

    .line 2487
    .line 2488
    iget-object v4, v6, Lf50;->Z:Ljx5;

    .line 2489
    .line 2490
    if-eqz v4, :cond_a7

    .line 2491
    .line 2492
    invoke-virtual {v4, v2}, Ljx5;->equals(Ljava/lang/Object;)Z

    .line 2493
    .line 2494
    .line 2495
    move-result v4

    .line 2496
    goto :goto_4c

    .line 2497
    :cond_a7
    iget-object v4, v6, Lf50;->Y:Lr37;

    .line 2498
    .line 2499
    iget-object v4, v4, Lr37;->X:Ljava/lang/String;

    .line 2500
    .line 2501
    iget-object v6, v2, Ljx5;->X:Ljava/lang/String;

    .line 2502
    .line 2503
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2504
    .line 2505
    .line 2506
    move-result v4

    .line 2507
    if-eqz v4, :cond_a9

    .line 2508
    .line 2509
    iget-object v4, v2, Ljx5;->Y:Ljava/lang/String;

    .line 2510
    .line 2511
    if-eqz v4, :cond_a8

    .line 2512
    .line 2513
    goto :goto_4b

    .line 2514
    :cond_a8
    const/4 v4, 0x1

    .line 2515
    goto :goto_4c

    .line 2516
    :cond_a9
    :goto_4b
    const/4 v4, 0x0

    .line 2517
    :goto_4c
    if-eqz v4, :cond_aa

    .line 2518
    .line 2519
    const/4 v4, 0x0

    .line 2520
    iput-object v4, v3, Lf50;->n0:Lri8;

    .line 2521
    .line 2522
    goto :goto_4d

    .line 2523
    :cond_aa
    move-object/from16 v4, v16

    .line 2524
    .line 2525
    goto :goto_4a

    .line 2526
    :cond_ab
    move/from16 p4, v2

    .line 2527
    .line 2528
    :cond_ac
    :goto_4d
    add-int/lit8 v5, v5, 0x1

    .line 2529
    .line 2530
    move/from16 v2, p4

    .line 2531
    .line 2532
    const/4 v6, 0x1

    .line 2533
    goto :goto_49

    .line 2534
    :cond_ad
    :goto_4e
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v2

    .line 2538
    invoke-virtual {v2, v11, v14, v15}, Lm85;->a(Lvp4;Lal;Ljava/util/ArrayList;)V

    .line 2539
    .line 2540
    .line 2541
    invoke-virtual/range {v25 .. v25}, Ls37;->a()Z

    .line 2542
    .line 2543
    .line 2544
    move-result v2

    .line 2545
    if-eqz v2, :cond_af

    .line 2546
    .line 2547
    invoke-virtual/range {v25 .. v25}, Ls37;->b()Llt;

    .line 2548
    .line 2549
    .line 2550
    move-result-object v2

    .line 2551
    invoke-virtual {v2}, Llt;->hasNext()Z

    .line 2552
    .line 2553
    .line 2554
    move-result v3

    .line 2555
    if-nez v3, :cond_ae

    .line 2556
    .line 2557
    goto :goto_4f

    .line 2558
    :cond_ae
    invoke-virtual {v2}, Llt;->next()Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v0

    .line 2562
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 2563
    .line 2564
    .line 2565
    const/16 v23, 0x0

    .line 2566
    .line 2567
    throw v23

    .line 2568
    :cond_af
    :goto_4f
    const-class v6, Ljava/lang/CharSequence;

    .line 2569
    .line 2570
    invoke-virtual {v10, v6}, Ldh8;->L0(Ljava/lang/Class;)Z

    .line 2571
    .line 2572
    .line 2573
    move-result v2

    .line 2574
    if-eqz v2, :cond_b0

    .line 2575
    .line 2576
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 2577
    .line 2578
    .line 2579
    move-result v2

    .line 2580
    const/4 v3, 0x1

    .line 2581
    if-ne v2, v3, :cond_b0

    .line 2582
    .line 2583
    const/4 v2, 0x0

    .line 2584
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v3

    .line 2588
    check-cast v3, Lf50;

    .line 2589
    .line 2590
    iget-object v3, v3, Lf50;->i0:Lgl;

    .line 2591
    .line 2592
    instance-of v4, v3, Lhl;

    .line 2593
    .line 2594
    if-eqz v4, :cond_b1

    .line 2595
    .line 2596
    check-cast v3, Lhl;

    .line 2597
    .line 2598
    iget-object v3, v3, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 2599
    .line 2600
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2601
    .line 2602
    .line 2603
    move-result-object v4

    .line 2604
    const-string v5, "isEmpty"

    .line 2605
    .line 2606
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2607
    .line 2608
    .line 2609
    move-result v4

    .line 2610
    if-eqz v4, :cond_b1

    .line 2611
    .line 2612
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v3

    .line 2616
    if-ne v3, v6, :cond_b1

    .line 2617
    .line 2618
    invoke-interface {v15, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2619
    .line 2620
    .line 2621
    goto :goto_50

    .line 2622
    :cond_b0
    const/4 v2, 0x0

    .line 2623
    :cond_b1
    :goto_50
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 2624
    .line 2625
    .line 2626
    move-result-object v3

    .line 2627
    invoke-virtual {v3, v14}, Lm85;->v(Lvj8;)Lyo3;

    .line 2628
    .line 2629
    .line 2630
    move-result-object v3

    .line 2631
    sget-object v4, Lyo3;->h0:Lyo3;

    .line 2632
    .line 2633
    if-nez v3, :cond_b2

    .line 2634
    .line 2635
    const/4 v3, 0x0

    .line 2636
    :cond_b2
    iget-object v12, v12, Ll20;->X:Luh8;

    .line 2637
    .line 2638
    if-eqz v3, :cond_b4

    .line 2639
    .line 2640
    iget-boolean v4, v3, Lyo3;->Z:Z

    .line 2641
    .line 2642
    if-eqz v4, :cond_b3

    .line 2643
    .line 2644
    sget-object v3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2645
    .line 2646
    goto :goto_51

    .line 2647
    :cond_b3
    iget-object v3, v3, Lyo3;->X:Ljava/util/Set;

    .line 2648
    .line 2649
    goto :goto_51

    .line 2650
    :cond_b4
    const/4 v3, 0x0

    .line 2651
    :goto_51
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v4

    .line 2655
    invoke-virtual {v4, v14}, Lm85;->y(Lvj8;)Lgp3;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v4

    .line 2659
    iget-object v4, v4, Lgp3;->X:Ljava/util/Set;

    .line 2660
    .line 2661
    if-nez v4, :cond_b5

    .line 2662
    .line 2663
    if-eqz v3, :cond_b7

    .line 2664
    .line 2665
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 2666
    .line 2667
    .line 2668
    move-result v5

    .line 2669
    if-nez v5, :cond_b7

    .line 2670
    .line 2671
    :cond_b5
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2672
    .line 2673
    .line 2674
    move-result-object v5

    .line 2675
    :goto_52
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2676
    .line 2677
    .line 2678
    move-result v16

    .line 2679
    if-eqz v16, :cond_b7

    .line 2680
    .line 2681
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v16

    .line 2685
    move-object/from16 v2, v16

    .line 2686
    .line 2687
    check-cast v2, Lf50;

    .line 2688
    .line 2689
    iget-object v2, v2, Lf50;->Y:Lr37;

    .line 2690
    .line 2691
    iget-object v2, v2, Lr37;->X:Ljava/lang/String;

    .line 2692
    .line 2693
    move-object/from16 p4, v3

    .line 2694
    .line 2695
    move-object/from16 v3, p4

    .line 2696
    .line 2697
    check-cast v3, Ljava/util/Set;

    .line 2698
    .line 2699
    move-object/from16 v16, v4

    .line 2700
    .line 2701
    move-object/from16 v4, v16

    .line 2702
    .line 2703
    check-cast v4, Ljava/util/Set;

    .line 2704
    .line 2705
    invoke-static {v2, v3, v4}, Lhi5;->x0(Ljava/lang/Object;Ljava/util/Set;Ljava/util/Set;)Z

    .line 2706
    .line 2707
    .line 2708
    move-result v2

    .line 2709
    if-eqz v2, :cond_b6

    .line 2710
    .line 2711
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 2712
    .line 2713
    .line 2714
    :cond_b6
    move-object/from16 v3, p4

    .line 2715
    .line 2716
    move-object/from16 v4, v16

    .line 2717
    .line 2718
    const/4 v2, 0x0

    .line 2719
    goto :goto_52

    .line 2720
    :cond_b7
    invoke-virtual/range {v25 .. v25}, Ls37;->a()Z

    .line 2721
    .line 2722
    .line 2723
    move-result v2

    .line 2724
    if-eqz v2, :cond_b9

    .line 2725
    .line 2726
    invoke-virtual/range {v25 .. v25}, Ls37;->b()Llt;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v2

    .line 2730
    invoke-virtual {v2}, Llt;->hasNext()Z

    .line 2731
    .line 2732
    .line 2733
    move-result v3

    .line 2734
    if-nez v3, :cond_b8

    .line 2735
    .line 2736
    goto :goto_53

    .line 2737
    :cond_b8
    invoke-virtual {v2}, Llt;->next()Ljava/lang/Object;

    .line 2738
    .line 2739
    .line 2740
    move-result-object v0

    .line 2741
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 2742
    .line 2743
    .line 2744
    const/16 v23, 0x0

    .line 2745
    .line 2746
    throw v23

    .line 2747
    :cond_b9
    :goto_53
    iget-object v2, v7, Lz20;->i:Lf85;

    .line 2748
    .line 2749
    if-nez v2, :cond_ba

    .line 2750
    .line 2751
    move-object/from16 p4, v6

    .line 2752
    .line 2753
    move-object/from16 v33, v10

    .line 2754
    .line 2755
    move-object/from16 v16, v12

    .line 2756
    .line 2757
    const/4 v2, 0x0

    .line 2758
    goto/16 :goto_57

    .line 2759
    .line 2760
    :cond_ba
    iget-boolean v3, v2, Lf85;->e:Z

    .line 2761
    .line 2762
    iget-object v4, v2, Lf85;->a:Ljx5;

    .line 2763
    .line 2764
    iget-object v5, v2, Lf85;->b:Ljava/lang/Class;

    .line 2765
    .line 2766
    move-object/from16 v16, v12

    .line 2767
    .line 2768
    const-class v12, Lex5;

    .line 2769
    .line 2770
    if-ne v5, v12, :cond_bf

    .line 2771
    .line 2772
    iget-object v4, v4, Ljx5;->X:Ljava/lang/String;

    .line 2773
    .line 2774
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 2775
    .line 2776
    .line 2777
    move-result v5

    .line 2778
    const/4 v12, 0x0

    .line 2779
    :goto_54
    if-eq v12, v5, :cond_bd

    .line 2780
    .line 2781
    invoke-interface {v15, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2782
    .line 2783
    .line 2784
    move-result-object v17

    .line 2785
    move/from16 p4, v5

    .line 2786
    .line 2787
    move-object/from16 v5, v17

    .line 2788
    .line 2789
    check-cast v5, Lf50;

    .line 2790
    .line 2791
    move-object/from16 v33, v10

    .line 2792
    .line 2793
    iget-object v10, v5, Lf50;->Y:Lr37;

    .line 2794
    .line 2795
    iget-object v10, v10, Lr37;->X:Ljava/lang/String;

    .line 2796
    .line 2797
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2798
    .line 2799
    .line 2800
    move-result v10

    .line 2801
    if-eqz v10, :cond_bc

    .line 2802
    .line 2803
    if-lez v12, :cond_bb

    .line 2804
    .line 2805
    invoke-interface {v15, v12}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2806
    .line 2807
    .line 2808
    const/4 v4, 0x0

    .line 2809
    invoke-interface {v15, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 2810
    .line 2811
    .line 2812
    :cond_bb
    iget-object v4, v5, Lf50;->f0:Ldh8;

    .line 2813
    .line 2814
    new-instance v10, Lex5;

    .line 2815
    .line 2816
    iget-object v2, v2, Lf85;->d:Ljava/lang/Class;

    .line 2817
    .line 2818
    invoke-direct {v10, v2, v5}, Lex5;-><init>(Ljava/lang/Class;Lf50;)V

    .line 2819
    .line 2820
    .line 2821
    const/4 v2, 0x0

    .line 2822
    invoke-static {v4, v2, v10, v3}, Lwg;->p(Ldh8;Ljx5;Lex5;Z)Lwg;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v3

    .line 2826
    move-object v2, v3

    .line 2827
    move-object/from16 p4, v6

    .line 2828
    .line 2829
    goto :goto_57

    .line 2830
    :cond_bc
    add-int/lit8 v12, v12, 0x1

    .line 2831
    .line 2832
    move/from16 v5, p4

    .line 2833
    .line 2834
    move-object/from16 v10, v33

    .line 2835
    .line 2836
    goto :goto_54

    .line 2837
    :cond_bd
    move-object/from16 v33, v10

    .line 2838
    .line 2839
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2840
    .line 2841
    invoke-static/range {v33 .. v33}, Lit0;->n(Ldh8;)Ljava/lang/String;

    .line 2842
    .line 2843
    .line 2844
    move-result-object v1

    .line 2845
    if-nez v4, :cond_be

    .line 2846
    .line 2847
    const-string v2, "[null]"

    .line 2848
    .line 2849
    goto :goto_55

    .line 2850
    :cond_be
    invoke-static {v4}, Lit0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v2

    .line 2854
    :goto_55
    const-string v3, "Invalid Object Id definition for "

    .line 2855
    .line 2856
    const-string v4, ": cannot find property with name "

    .line 2857
    .line 2858
    invoke-static {v3, v1, v4, v2}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v1

    .line 2862
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2863
    .line 2864
    .line 2865
    throw v0

    .line 2866
    :cond_bf
    move-object/from16 v33, v10

    .line 2867
    .line 2868
    if-nez v5, :cond_c0

    .line 2869
    .line 2870
    move-object/from16 p4, v6

    .line 2871
    .line 2872
    const/4 v5, 0x0

    .line 2873
    goto :goto_56

    .line 2874
    :cond_c0
    invoke-virtual {v1}, Lt37;->s()Luh8;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v10

    .line 2878
    sget-object v12, Luh8;->f0:Lgh8;

    .line 2879
    .line 2880
    move-object/from16 p4, v6

    .line 2881
    .line 2882
    const/4 v6, 0x0

    .line 2883
    invoke-virtual {v10, v6, v5, v12}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 2884
    .line 2885
    .line 2886
    move-result-object v5

    .line 2887
    :goto_56
    invoke-virtual {v1}, Lt37;->s()Luh8;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v6

    .line 2891
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2892
    .line 2893
    .line 2894
    const-class v6, Ld85;

    .line 2895
    .line 2896
    invoke-static {v5, v6}, Luh8;->h(Ldh8;Ljava/lang/Class;)[Ldh8;

    .line 2897
    .line 2898
    .line 2899
    move-result-object v5

    .line 2900
    const/16 v21, 0x0

    .line 2901
    .line 2902
    aget-object v5, v5, v21

    .line 2903
    .line 2904
    invoke-virtual {v1, v2}, Lt37;->y(Lf85;)Lex5;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v2

    .line 2908
    invoke-static {v5, v4, v2, v3}, Lwg;->p(Ldh8;Ljx5;Lex5;Z)Lwg;

    .line 2909
    .line 2910
    .line 2911
    move-result-object v2

    .line 2912
    :goto_57
    iput-object v2, v8, Lxy0;->j0:Ljava/lang/Object;

    .line 2913
    .line 2914
    iput-object v15, v8, Lxy0;->f0:Ljava/lang/Object;

    .line 2915
    .line 2916
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 2917
    .line 2918
    .line 2919
    move-result-object v2

    .line 2920
    invoke-virtual {v2, v14}, Lm85;->g(Lvj8;)Ljava/lang/Object;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v2

    .line 2924
    iput-object v2, v8, Lxy0;->h0:Ljava/lang/Object;

    .line 2925
    .line 2926
    iget-object v2, v7, Lz20;->b:Lpf5;

    .line 2927
    .line 2928
    if-eqz v2, :cond_ca

    .line 2929
    .line 2930
    iget-boolean v3, v2, Lpf5;->i:Z

    .line 2931
    .line 2932
    if-nez v3, :cond_c1

    .line 2933
    .line 2934
    invoke-virtual {v2}, Lpf5;->i()V

    .line 2935
    .line 2936
    .line 2937
    :cond_c1
    iget-object v3, v2, Lpf5;->m:Ljava/util/LinkedList;

    .line 2938
    .line 2939
    if-eqz v3, :cond_c3

    .line 2940
    .line 2941
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 2942
    .line 2943
    .line 2944
    move-result v3

    .line 2945
    iget-object v4, v2, Lpf5;->m:Ljava/util/LinkedList;

    .line 2946
    .line 2947
    const/4 v10, 0x1

    .line 2948
    if-gt v3, v10, :cond_c2

    .line 2949
    .line 2950
    invoke-virtual {v4}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 2951
    .line 2952
    .line 2953
    move-result-object v3

    .line 2954
    check-cast v3, Lgl;

    .line 2955
    .line 2956
    goto :goto_58

    .line 2957
    :cond_c2
    const/4 v5, 0x0

    .line 2958
    invoke-virtual {v4, v5}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v0

    .line 2962
    iget-object v1, v2, Lpf5;->m:Ljava/util/LinkedList;

    .line 2963
    .line 2964
    invoke-virtual {v1, v10}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 2965
    .line 2966
    .line 2967
    move-result-object v1

    .line 2968
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 2969
    .line 2970
    .line 2971
    move-result-object v0

    .line 2972
    const-string v1, "Multiple \'any-getter\' methods defined (%s vs %s)"

    .line 2973
    .line 2974
    invoke-virtual {v2, v1, v0}, Lpf5;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2975
    .line 2976
    .line 2977
    const/16 v23, 0x0

    .line 2978
    .line 2979
    throw v23

    .line 2980
    :cond_c3
    const/4 v3, 0x0

    .line 2981
    :goto_58
    if-eqz v3, :cond_c5

    .line 2982
    .line 2983
    invoke-virtual {v3}, Lvj8;->N()Ljava/lang/Class;

    .line 2984
    .line 2985
    .line 2986
    move-result-object v2

    .line 2987
    move-object/from16 v4, v31

    .line 2988
    .line 2989
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2990
    .line 2991
    .line 2992
    move-result v2

    .line 2993
    if-eqz v2, :cond_c4

    .line 2994
    .line 2995
    move-object v5, v3

    .line 2996
    const/4 v3, 0x0

    .line 2997
    goto :goto_5b

    .line 2998
    :cond_c4
    invoke-virtual {v3}, Lvj8;->L()Ljava/lang/String;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v0

    .line 3002
    const-string v1, "Invalid \'any-getter\' annotation on method "

    .line 3003
    .line 3004
    const-string v2, "(): return type is not instance of java.util.Map"

    .line 3005
    .line 3006
    invoke-static {v1, v0, v2}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3007
    .line 3008
    .line 3009
    move-result-object v0

    .line 3010
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 3011
    .line 3012
    .line 3013
    const/16 v23, 0x0

    .line 3014
    .line 3015
    return-object v23

    .line 3016
    :cond_c5
    move-object/from16 v4, v31

    .line 3017
    .line 3018
    iget-boolean v3, v2, Lpf5;->i:Z

    .line 3019
    .line 3020
    if-nez v3, :cond_c6

    .line 3021
    .line 3022
    invoke-virtual {v2}, Lpf5;->i()V

    .line 3023
    .line 3024
    .line 3025
    :cond_c6
    iget-object v3, v2, Lpf5;->n:Ljava/util/LinkedList;

    .line 3026
    .line 3027
    if-eqz v3, :cond_c8

    .line 3028
    .line 3029
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 3030
    .line 3031
    .line 3032
    move-result v3

    .line 3033
    iget-object v5, v2, Lpf5;->n:Ljava/util/LinkedList;

    .line 3034
    .line 3035
    const/4 v10, 0x1

    .line 3036
    if-gt v3, v10, :cond_c7

    .line 3037
    .line 3038
    invoke-virtual {v5}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v2

    .line 3042
    check-cast v2, Lgl;

    .line 3043
    .line 3044
    :goto_59
    const/4 v3, 0x0

    .line 3045
    goto :goto_5a

    .line 3046
    :cond_c7
    const/4 v3, 0x0

    .line 3047
    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v0

    .line 3051
    iget-object v1, v2, Lpf5;->n:Ljava/util/LinkedList;

    .line 3052
    .line 3053
    invoke-virtual {v1, v10}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 3054
    .line 3055
    .line 3056
    move-result-object v1

    .line 3057
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 3058
    .line 3059
    .line 3060
    move-result-object v0

    .line 3061
    const-string v1, "Multiple \'any-getter\' fields defined (%s vs %s)"

    .line 3062
    .line 3063
    invoke-virtual {v2, v1, v0}, Lpf5;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3064
    .line 3065
    .line 3066
    const/16 v23, 0x0

    .line 3067
    .line 3068
    throw v23

    .line 3069
    :cond_c8
    const/4 v2, 0x0

    .line 3070
    goto :goto_59

    .line 3071
    :goto_5a
    if-eqz v2, :cond_cb

    .line 3072
    .line 3073
    invoke-virtual {v2}, Lvj8;->N()Ljava/lang/Class;

    .line 3074
    .line 3075
    .line 3076
    move-result-object v5

    .line 3077
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 3078
    .line 3079
    .line 3080
    move-result v4

    .line 3081
    if-eqz v4, :cond_c9

    .line 3082
    .line 3083
    move-object v5, v2

    .line 3084
    goto :goto_5b

    .line 3085
    :cond_c9
    invoke-virtual {v2}, Lvj8;->L()Ljava/lang/String;

    .line 3086
    .line 3087
    .line 3088
    move-result-object v0

    .line 3089
    const-string v1, "Invalid \'any-getter\' annotation on field \'"

    .line 3090
    .line 3091
    const-string v2, "\': type is not instance of java.util.Map"

    .line 3092
    .line 3093
    invoke-static {v1, v0, v2}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3094
    .line 3095
    .line 3096
    move-result-object v0

    .line 3097
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 3098
    .line 3099
    .line 3100
    const/16 v23, 0x0

    .line 3101
    .line 3102
    return-object v23

    .line 3103
    :cond_ca
    const/4 v3, 0x0

    .line 3104
    :cond_cb
    const/4 v5, 0x0

    .line 3105
    :goto_5b
    if-eqz v5, :cond_d1

    .line 3106
    .line 3107
    invoke-virtual {v5}, Lvj8;->Q()Ldh8;

    .line 3108
    .line 3109
    .line 3110
    move-result-object v40

    .line 3111
    invoke-virtual/range {v40 .. v40}, Ldh8;->z0()Ldh8;

    .line 3112
    .line 3113
    .line 3114
    move-result-object v2

    .line 3115
    invoke-virtual {v0, v11, v2}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 3116
    .line 3117
    .line 3118
    move-result-object v42

    .line 3119
    invoke-static {v1, v5}, Lf30;->Z(Lt37;Lvj8;)Lar3;

    .line 3120
    .line 3121
    .line 3122
    move-result-object v4

    .line 3123
    if-nez v4, :cond_cc

    .line 3124
    .line 3125
    sget-object v4, Lxp4;->t0:Lxp4;

    .line 3126
    .line 3127
    invoke-virtual {v11, v4}, Lvp4;->f(Lxp4;)Z

    .line 3128
    .line 3129
    .line 3130
    move-result v41

    .line 3131
    const/16 v45, 0x0

    .line 3132
    .line 3133
    const/16 v39, 0x0

    .line 3134
    .line 3135
    const/16 v38, 0x0

    .line 3136
    .line 3137
    const/16 v43, 0x0

    .line 3138
    .line 3139
    const/16 v44, 0x0

    .line 3140
    .line 3141
    invoke-static/range {v38 .. v45}, Lsp4;->q(Ljava/util/Set;Ljava/util/Set;Ldh8;ZLsi8;Lar3;Lar3;Ljava/lang/Object;)Lsp4;

    .line 3142
    .line 3143
    .line 3144
    move-result-object v4

    .line 3145
    :cond_cc
    move-object v6, v4

    .line 3146
    invoke-virtual {v5}, Lvj8;->L()Ljava/lang/String;

    .line 3147
    .line 3148
    .line 3149
    move-result-object v4

    .line 3150
    invoke-static {v4}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 3151
    .line 3152
    .line 3153
    move-result-object v29

    .line 3154
    new-instance v10, Lzl;

    .line 3155
    .line 3156
    sget-object v4, Lix5;->i0:Lix5;

    .line 3157
    .line 3158
    invoke-direct {v10, v2, v5, v4}, Lzl;-><init>(Ldh8;Lgl;Lix5;)V

    .line 3159
    .line 3160
    .line 3161
    move v2, v3

    .line 3162
    :goto_5c
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 3163
    .line 3164
    .line 3165
    move-result v4

    .line 3166
    if-ge v2, v4, :cond_cf

    .line 3167
    .line 3168
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3169
    .line 3170
    .line 3171
    move-result-object v4

    .line 3172
    check-cast v4, Lf50;

    .line 3173
    .line 3174
    iget-object v3, v4, Lf50;->Y:Lr37;

    .line 3175
    .line 3176
    iget-object v3, v3, Lr37;->X:Ljava/lang/String;

    .line 3177
    .line 3178
    invoke-virtual {v5}, Lvj8;->L()Ljava/lang/String;

    .line 3179
    .line 3180
    .line 3181
    move-result-object v12

    .line 3182
    invoke-static {v3, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3183
    .line 3184
    .line 3185
    move-result v3

    .line 3186
    if-nez v3, :cond_ce

    .line 3187
    .line 3188
    iget-object v3, v4, Lf50;->i0:Lgl;

    .line 3189
    .line 3190
    invoke-virtual {v3}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 3191
    .line 3192
    .line 3193
    move-result-object v3

    .line 3194
    invoke-virtual {v5}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 3195
    .line 3196
    .line 3197
    move-result-object v12

    .line 3198
    invoke-static {v3, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3199
    .line 3200
    .line 3201
    move-result v3

    .line 3202
    if-eqz v3, :cond_cd

    .line 3203
    .line 3204
    goto :goto_5d

    .line 3205
    :cond_cd
    add-int/lit8 v2, v2, 0x1

    .line 3206
    .line 3207
    const/4 v3, 0x0

    .line 3208
    goto :goto_5c

    .line 3209
    :cond_ce
    :goto_5d
    const/4 v3, -0x1

    .line 3210
    goto :goto_5e

    .line 3211
    :cond_cf
    const/4 v2, -0x1

    .line 3212
    const/4 v4, 0x0

    .line 3213
    goto :goto_5d

    .line 3214
    :goto_5e
    if-eq v2, v3, :cond_d0

    .line 3215
    .line 3216
    new-instance v3, Lzm;

    .line 3217
    .line 3218
    invoke-direct {v3, v4, v10, v5, v6}, Lzm;-><init>(Lf50;Lzl;Lgl;Lar3;)V

    .line 3219
    .line 3220
    .line 3221
    invoke-interface {v15, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 3222
    .line 3223
    .line 3224
    const/4 v12, 0x0

    .line 3225
    goto :goto_5f

    .line 3226
    :cond_d0
    sget v2, Lm97;->h0:I

    .line 3227
    .line 3228
    sget-object v31, Le50;->X:Lep3;

    .line 3229
    .line 3230
    new-instance v2, Lm97;

    .line 3231
    .line 3232
    invoke-virtual {v11}, Lvp4;->d()Lm85;

    .line 3233
    .line 3234
    .line 3235
    move-result-object v27

    .line 3236
    const/16 v30, 0x0

    .line 3237
    .line 3238
    move-object/from16 v26, v2

    .line 3239
    .line 3240
    move-object/from16 v28, v5

    .line 3241
    .line 3242
    invoke-direct/range {v26 .. v31}, Lm97;-><init>(Lm85;Lgl;Ljx5;Lix5;Lep3;)V

    .line 3243
    .line 3244
    .line 3245
    new-instance v3, Lbl;

    .line 3246
    .line 3247
    invoke-direct {v3, v11, v7}, Lbl;-><init>(Ll37;Lz20;)V

    .line 3248
    .line 3249
    .line 3250
    move/from16 v4, v37

    .line 3251
    .line 3252
    const/4 v12, 0x0

    .line 3253
    invoke-virtual/range {v0 .. v5}, Lj50;->a0(Lt37;Le50;Lbl;ZLgl;)Lf50;

    .line 3254
    .line 3255
    .line 3256
    move-result-object v2

    .line 3257
    new-instance v3, Lzm;

    .line 3258
    .line 3259
    invoke-direct {v3, v2, v10, v5, v6}, Lzm;-><init>(Lf50;Lzl;Lgl;Lar3;)V

    .line 3260
    .line 3261
    .line 3262
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3263
    .line 3264
    .line 3265
    goto :goto_5f

    .line 3266
    :cond_d1
    move v12, v3

    .line 3267
    :goto_5f
    iget-object v2, v8, Lxy0;->f0:Ljava/lang/Object;

    .line 3268
    .line 3269
    check-cast v2, Ljava/util/List;

    .line 3270
    .line 3271
    sget-object v3, Lxp4;->u0:Lxp4;

    .line 3272
    .line 3273
    invoke-virtual {v11, v3}, Lvp4;->f(Lxp4;)Z

    .line 3274
    .line 3275
    .line 3276
    move-result v3

    .line 3277
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 3278
    .line 3279
    .line 3280
    move-result v4

    .line 3281
    new-array v5, v4, [Lf50;

    .line 3282
    .line 3283
    move v6, v12

    .line 3284
    move v10, v6

    .line 3285
    :goto_60
    if-ge v6, v4, :cond_d6

    .line 3286
    .line 3287
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v15

    .line 3291
    check-cast v15, Lf50;

    .line 3292
    .line 3293
    move/from16 v21, v12

    .line 3294
    .line 3295
    iget-object v12, v15, Lf50;->r0:[Ljava/lang/Class;

    .line 3296
    .line 3297
    move-object/from16 v17, v2

    .line 3298
    .line 3299
    if-eqz v12, :cond_d2

    .line 3300
    .line 3301
    array-length v2, v12

    .line 3302
    if-nez v2, :cond_d3

    .line 3303
    .line 3304
    :cond_d2
    move/from16 v18, v3

    .line 3305
    .line 3306
    goto :goto_62

    .line 3307
    :cond_d3
    add-int/lit8 v10, v10, 0x1

    .line 3308
    .line 3309
    array-length v2, v12

    .line 3310
    move/from16 v18, v3

    .line 3311
    .line 3312
    const/4 v3, 0x1

    .line 3313
    if-ne v2, v3, :cond_d4

    .line 3314
    .line 3315
    new-instance v2, Lja2;

    .line 3316
    .line 3317
    aget-object v12, v12, v21

    .line 3318
    .line 3319
    invoke-direct {v2, v15, v12, v3}, Lja2;-><init>(Lf50;Ljava/io/Serializable;B)V

    .line 3320
    .line 3321
    .line 3322
    goto :goto_61

    .line 3323
    :cond_d4
    new-instance v2, Lja2;

    .line 3324
    .line 3325
    move/from16 v3, v21

    .line 3326
    .line 3327
    invoke-direct {v2, v15, v12, v3}, Lja2;-><init>(Lf50;Ljava/io/Serializable;B)V

    .line 3328
    .line 3329
    .line 3330
    :goto_61
    aput-object v2, v5, v6

    .line 3331
    .line 3332
    goto :goto_63

    .line 3333
    :goto_62
    if-eqz v18, :cond_d5

    .line 3334
    .line 3335
    aput-object v15, v5, v6

    .line 3336
    .line 3337
    :cond_d5
    :goto_63
    add-int/lit8 v6, v6, 0x1

    .line 3338
    .line 3339
    move-object/from16 v2, v17

    .line 3340
    .line 3341
    move/from16 v3, v18

    .line 3342
    .line 3343
    const/4 v12, 0x0

    .line 3344
    goto :goto_60

    .line 3345
    :cond_d6
    move/from16 v18, v3

    .line 3346
    .line 3347
    if-eqz v18, :cond_d7

    .line 3348
    .line 3349
    if-nez v10, :cond_d7

    .line 3350
    .line 3351
    goto :goto_64

    .line 3352
    :cond_d7
    iget-object v2, v8, Lxy0;->f0:Ljava/lang/Object;

    .line 3353
    .line 3354
    check-cast v2, Ljava/util/List;

    .line 3355
    .line 3356
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 3357
    .line 3358
    .line 3359
    move-result v2

    .line 3360
    if-ne v4, v2, :cond_e4

    .line 3361
    .line 3362
    iput-object v5, v8, Lxy0;->g0:Ljava/lang/Object;

    .line 3363
    .line 3364
    :goto_64
    invoke-virtual/range {v25 .. v25}, Ls37;->a()Z

    .line 3365
    .line 3366
    .line 3367
    move-result v2

    .line 3368
    if-eqz v2, :cond_d9

    .line 3369
    .line 3370
    invoke-virtual/range {v25 .. v25}, Ls37;->b()Llt;

    .line 3371
    .line 3372
    .line 3373
    move-result-object v2

    .line 3374
    invoke-virtual {v2}, Llt;->hasNext()Z

    .line 3375
    .line 3376
    .line 3377
    move-result v3

    .line 3378
    if-nez v3, :cond_d8

    .line 3379
    .line 3380
    goto :goto_65

    .line 3381
    :cond_d8
    invoke-virtual {v2}, Llt;->next()Ljava/lang/Object;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v0

    .line 3385
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 3386
    .line 3387
    .line 3388
    const/16 v23, 0x0

    .line 3389
    .line 3390
    throw v23

    .line 3391
    :cond_d9
    :goto_65
    :try_start_0
    invoke-virtual {v8}, Lxy0;->c()Lg50;

    .line 3392
    .line 3393
    .line 3394
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3395
    if-nez v2, :cond_da

    .line 3396
    .line 3397
    invoke-static {v13}, Lit0;->t(Ljava/lang/Class;)Z

    .line 3398
    .line 3399
    .line 3400
    move-result v2

    .line 3401
    if-eqz v2, :cond_db

    .line 3402
    .line 3403
    invoke-static {v13}, Lg25;->a(Ljava/lang/Class;)Z

    .line 3404
    .line 3405
    .line 3406
    move-result v2

    .line 3407
    if-nez v2, :cond_db

    .line 3408
    .line 3409
    iget-object v0, v9, Lz20;->a:Ldh8;

    .line 3410
    .line 3411
    new-instance v2, Lg50;

    .line 3412
    .line 3413
    sget-object v3, Lh50;->l0:[Lf50;

    .line 3414
    .line 3415
    const/4 v4, 0x0

    .line 3416
    invoke-direct {v2, v0, v8, v3, v4}, Lh50;-><init>(Ldh8;Lxy0;[Lf50;[Lf50;)V

    .line 3417
    .line 3418
    .line 3419
    :cond_da
    :goto_66
    move-object v8, v2

    .line 3420
    :goto_67
    move-object/from16 v10, v33

    .line 3421
    .line 3422
    goto/16 :goto_6f

    .line 3423
    .line 3424
    :cond_db
    const-class v2, Ljava/util/Iterator;

    .line 3425
    .line 3426
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 3427
    .line 3428
    .line 3429
    move-result v3

    .line 3430
    if-eqz v3, :cond_de

    .line 3431
    .line 3432
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3433
    .line 3434
    .line 3435
    move-object/from16 v6, p2

    .line 3436
    .line 3437
    invoke-static {v6, v2}, Luh8;->h(Ldh8;Ljava/lang/Class;)[Ldh8;

    .line 3438
    .line 3439
    .line 3440
    move-result-object v3

    .line 3441
    if-eqz v3, :cond_dd

    .line 3442
    .line 3443
    array-length v4, v3

    .line 3444
    const/4 v10, 0x1

    .line 3445
    if-eq v4, v10, :cond_dc

    .line 3446
    .line 3447
    goto :goto_68

    .line 3448
    :cond_dc
    const/16 v21, 0x0

    .line 3449
    .line 3450
    aget-object v3, v3, v21

    .line 3451
    .line 3452
    goto :goto_69

    .line 3453
    :cond_dd
    :goto_68
    sget-object v3, Luh8;->u0:Lba7;

    .line 3454
    .line 3455
    :goto_69
    new-instance v34, Lw22;

    .line 3456
    .line 3457
    invoke-virtual {v0, v11, v3}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 3458
    .line 3459
    .line 3460
    move-result-object v38

    .line 3461
    const/16 v39, 0x0

    .line 3462
    .line 3463
    const/16 v40, 0x3

    .line 3464
    .line 3465
    move-object/from16 v35, v2

    .line 3466
    .line 3467
    move-object/from16 v36, v3

    .line 3468
    .line 3469
    invoke-direct/range {v34 .. v40}, Lw22;-><init>(Ljava/lang/Class;Ldh8;ZLri8;Lar3;B)V

    .line 3470
    .line 3471
    .line 3472
    :goto_6a
    move-object/from16 v10, v34

    .line 3473
    .line 3474
    goto :goto_6d

    .line 3475
    :cond_de
    move-object/from16 v6, p2

    .line 3476
    .line 3477
    const-class v2, Ljava/lang/Iterable;

    .line 3478
    .line 3479
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 3480
    .line 3481
    .line 3482
    move-result v3

    .line 3483
    if-eqz v3, :cond_e1

    .line 3484
    .line 3485
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3486
    .line 3487
    .line 3488
    invoke-static {v6, v2}, Luh8;->h(Ldh8;Ljava/lang/Class;)[Ldh8;

    .line 3489
    .line 3490
    .line 3491
    move-result-object v3

    .line 3492
    if-eqz v3, :cond_e0

    .line 3493
    .line 3494
    array-length v4, v3

    .line 3495
    const/4 v10, 0x1

    .line 3496
    if-eq v4, v10, :cond_df

    .line 3497
    .line 3498
    goto :goto_6b

    .line 3499
    :cond_df
    const/16 v21, 0x0

    .line 3500
    .line 3501
    aget-object v3, v3, v21

    .line 3502
    .line 3503
    goto :goto_6c

    .line 3504
    :cond_e0
    :goto_6b
    sget-object v3, Luh8;->u0:Lba7;

    .line 3505
    .line 3506
    :goto_6c
    new-instance v34, Lw22;

    .line 3507
    .line 3508
    invoke-virtual {v0, v11, v3}, Lf30;->m(Ll37;Ldh8;)Lsi8;

    .line 3509
    .line 3510
    .line 3511
    move-result-object v38

    .line 3512
    const/16 v39, 0x0

    .line 3513
    .line 3514
    const/16 v40, 0x2

    .line 3515
    .line 3516
    move-object/from16 v35, v2

    .line 3517
    .line 3518
    move-object/from16 v36, v3

    .line 3519
    .line 3520
    invoke-direct/range {v34 .. v40}, Lw22;-><init>(Ljava/lang/Class;Ldh8;ZLri8;Lar3;B)V

    .line 3521
    .line 3522
    .line 3523
    goto :goto_6a

    .line 3524
    :cond_e1
    move-object/from16 v0, p4

    .line 3525
    .line 3526
    invoke-virtual {v0, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 3527
    .line 3528
    .line 3529
    move-result v0

    .line 3530
    if-eqz v0, :cond_e2

    .line 3531
    .line 3532
    move-object/from16 v10, v22

    .line 3533
    .line 3534
    goto :goto_6d

    .line 3535
    :cond_e2
    const/4 v10, 0x0

    .line 3536
    :goto_6d
    if-nez v10, :cond_e3

    .line 3537
    .line 3538
    iget-object v0, v14, Lal;->K0:Ltm;

    .line 3539
    .line 3540
    invoke-interface {v0}, Ltm;->size()I

    .line 3541
    .line 3542
    .line 3543
    move-result v0

    .line 3544
    if-lez v0, :cond_e3

    .line 3545
    .line 3546
    iget-object v0, v9, Lz20;->a:Ldh8;

    .line 3547
    .line 3548
    new-instance v2, Lg50;

    .line 3549
    .line 3550
    sget-object v3, Lh50;->l0:[Lf50;

    .line 3551
    .line 3552
    const/4 v4, 0x0

    .line 3553
    invoke-direct {v2, v0, v8, v3, v4}, Lh50;-><init>(Ldh8;Lxy0;[Lf50;[Lf50;)V

    .line 3554
    .line 3555
    .line 3556
    goto/16 :goto_66

    .line 3557
    .line 3558
    :cond_e3
    move-object v8, v10

    .line 3559
    goto/16 :goto_67

    .line 3560
    .line 3561
    :catch_0
    move-exception v0

    .line 3562
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3563
    .line 3564
    .line 3565
    move-result-object v2

    .line 3566
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3567
    .line 3568
    .line 3569
    move-result-object v2

    .line 3570
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 3571
    .line 3572
    .line 3573
    move-result-object v0

    .line 3574
    move-object/from16 v10, v33

    .line 3575
    .line 3576
    filled-new-array {v10, v2, v0}, [Ljava/lang/Object;

    .line 3577
    .line 3578
    .line 3579
    move-result-object v0

    .line 3580
    const-string v2, "Failed to construct BeanSerializer for %s: (%s) %s"

    .line 3581
    .line 3582
    invoke-virtual {v1, v7, v2, v0}, Lt37;->C(Lz20;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3583
    .line 3584
    .line 3585
    const/16 v23, 0x0

    .line 3586
    .line 3587
    throw v23

    .line 3588
    :cond_e4
    const/16 v23, 0x0

    .line 3589
    .line 3590
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3591
    .line 3592
    .line 3593
    move-result-object v0

    .line 3594
    iget-object v1, v8, Lxy0;->f0:Ljava/lang/Object;

    .line 3595
    .line 3596
    check-cast v1, Ljava/util/List;

    .line 3597
    .line 3598
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 3599
    .line 3600
    .line 3601
    move-result v1

    .line 3602
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3603
    .line 3604
    .line 3605
    move-result-object v1

    .line 3606
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 3607
    .line 3608
    .line 3609
    move-result-object v0

    .line 3610
    const-string v1, "Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)"

    .line 3611
    .line 3612
    invoke-static {v1, v0}, Lkp5;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3613
    .line 3614
    .line 3615
    return-object v23

    .line 3616
    :cond_e5
    :goto_6e
    new-instance v8, Lc75;

    .line 3617
    .line 3618
    const/16 v3, 0x8

    .line 3619
    .line 3620
    invoke-direct {v8, v6, v3}, Lc75;-><init>(Ldh8;B)V

    .line 3621
    .line 3622
    .line 3623
    :goto_6f
    if-nez v8, :cond_e6

    .line 3624
    .line 3625
    iget-object v0, v10, Ldh8;->j0:Ljava/lang/Class;

    .line 3626
    .line 3627
    invoke-virtual {v1, v0}, Lt37;->t(Ljava/lang/Class;)Lar3;

    .line 3628
    .line 3629
    .line 3630
    move-result-object v2

    .line 3631
    goto :goto_70

    .line 3632
    :cond_e6
    move-object v2, v8

    .line 3633
    goto :goto_70

    .line 3634
    :cond_e7
    move-object/from16 v25, v5

    .line 3635
    .line 3636
    :cond_e8
    :goto_70
    if-eqz v2, :cond_ea

    .line 3637
    .line 3638
    invoke-virtual/range {v25 .. v25}, Ls37;->a()Z

    .line 3639
    .line 3640
    .line 3641
    move-result v0

    .line 3642
    if-eqz v0, :cond_ea

    .line 3643
    .line 3644
    invoke-virtual/range {v25 .. v25}, Ls37;->b()Llt;

    .line 3645
    .line 3646
    .line 3647
    move-result-object v0

    .line 3648
    invoke-virtual {v0}, Llt;->hasNext()Z

    .line 3649
    .line 3650
    .line 3651
    move-result v1

    .line 3652
    if-nez v1, :cond_e9

    .line 3653
    .line 3654
    return-object v2

    .line 3655
    :cond_e9
    invoke-virtual {v0}, Llt;->next()Ljava/lang/Object;

    .line 3656
    .line 3657
    .line 3658
    move-result-object v0

    .line 3659
    invoke-static {v0}, Lp61;->x(Ljava/lang/Object;)V

    .line 3660
    .line 3661
    .line 3662
    const/16 v23, 0x0

    .line 3663
    .line 3664
    throw v23

    .line 3665
    :cond_ea
    return-object v2
.end method

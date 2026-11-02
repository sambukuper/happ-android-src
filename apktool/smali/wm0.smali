.class public final synthetic Lwm0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Lgn2;

.field public final synthetic f0:Lkx4;


# direct methods
.method public synthetic constructor <init>(ILgn2;Lkx4;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lwm0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lwm0;->Y:I

    .line 8
    .line 9
    iput-object p2, p0, Lwm0;->Z:Lgn2;

    .line 10
    .line 11
    iput-object p3, p0, Lwm0;->f0:Lkx4;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lkx4;Lgn2;I)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput-byte v0, p0, Lwm0;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm0;->f0:Lkx4;

    iput-object p2, p0, Lwm0;->Z:Lgn2;

    iput p3, p0, Lwm0;->Y:I

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 63

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lwm0;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lwm0;->f0:Lkx4;

    .line 8
    .line 9
    iget-object v4, v0, Lwm0;->Z:Lgn2;

    .line 10
    .line 11
    iget v0, v0, Lwm0;->Y:I

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v15, p1

    .line 18
    .line 19
    check-cast v15, Llp2;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v6, v1, 0x3

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    const/4 v8, 0x0

    .line 33
    if-eq v6, v7, :cond_0

    .line 34
    .line 35
    move v6, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v6, v8

    .line 38
    :goto_0
    and-int/2addr v1, v5

    .line 39
    invoke-virtual {v15, v1, v6}, Llp2;->N(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1c

    .line 44
    .line 45
    int-to-float v13, v0

    .line 46
    sget v0, Ly46;->sub_properties_request_timeout_min:I

    .line 47
    .line 48
    invoke-static {v0, v15}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget v1, Ly46;->sub_properties_request_timeout_max:I

    .line 53
    .line 54
    invoke-static {v1, v15}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v6, Luu0;

    .line 59
    .line 60
    const/high16 v7, 0x40a00000    # 5.0f

    .line 61
    .line 62
    const/high16 v9, 0x41700000    # 15.0f

    .line 63
    .line 64
    invoke-direct {v6, v7, v9}, Luu0;-><init>(FF)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v15, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    sget-object v10, Lzz0;->a:Lbe;

    .line 76
    .line 77
    if-nez v7, :cond_1

    .line 78
    .line 79
    if-ne v9, v10, :cond_2

    .line 80
    .line 81
    :cond_1
    new-instance v9, Lpr2;

    .line 82
    .line 83
    const/16 v7, 0x15

    .line 84
    .line 85
    invoke-direct {v9, v4, v7}, Lpr2;-><init>(Lgn2;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v15, v9}, Llp2;->g0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    move-object v7, v9

    .line 92
    check-cast v7, Lgn2;

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-ne v4, v10, :cond_3

    .line 108
    .line 109
    new-instance v4, Lxz4;

    .line 110
    .line 111
    invoke-direct {v4}, Lxz4;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v15, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    check-cast v4, Lxz4;

    .line 118
    .line 119
    sget-object v9, Lpz2;->q0:Ln50;

    .line 120
    .line 121
    sget-object v11, Lht;->c:Ldt;

    .line 122
    .line 123
    invoke-static {v11, v9, v15, v8}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    move-object/from16 p1, v9

    .line 128
    .line 129
    iget-wide v8, v15, Llp2;->T:J

    .line 130
    .line 131
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    invoke-virtual {v15}, Llp2;->l()Lkl5;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-static {v15, v3}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v12, Luz0;->j:Lpz2;

    .line 144
    .line 145
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v15}, Llp2;->Z()V

    .line 149
    .line 150
    .line 151
    iget-boolean v12, v15, Llp2;->S:Z

    .line 152
    .line 153
    if-eqz v12, :cond_4

    .line 154
    .line 155
    invoke-virtual {v15}, Llp2;->k()V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    invoke-virtual {v15}, Llp2;->j0()V

    .line 160
    .line 161
    .line 162
    :goto_1
    sget-object v12, Lpz2;->B0:Ldx0;

    .line 163
    .line 164
    invoke-static {v12, v15, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    sget-object v11, Lpz2;->A0:Ldx0;

    .line 168
    .line 169
    invoke-static {v11, v15, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    sget-object v9, Lpz2;->C0:Ldx0;

    .line 177
    .line 178
    invoke-static {v9, v15, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v15}, Lpn7;->l(Llp2;)V

    .line 182
    .line 183
    .line 184
    sget-object v8, Lpz2;->z0:Ldx0;

    .line 185
    .line 186
    invoke-static {v8, v15, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 190
    .line 191
    sget-object v14, Lhr;->a:Lox1;

    .line 192
    .line 193
    invoke-virtual {v15, v14}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    check-cast v14, Lgr;

    .line 198
    .line 199
    iget-object v14, v14, Lgr;->a:Lsr;

    .line 200
    .line 201
    iget-object v14, v14, Lsr;->b:Lig5;

    .line 202
    .line 203
    invoke-static {v3, v14}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    if-ne v5, v10, :cond_5

    .line 212
    .line 213
    new-instance v5, Lya2;

    .line 214
    .line 215
    move-object/from16 p2, v0

    .line 216
    .line 217
    const/16 v0, 0x10

    .line 218
    .line 219
    invoke-direct {v5, v0}, Lya2;-><init>(B)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v15, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_5
    move-object/from16 p2, v0

    .line 227
    .line 228
    :goto_2
    check-cast v5, Lgn2;

    .line 229
    .line 230
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-ne v0, v10, :cond_6

    .line 235
    .line 236
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v15, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_6
    check-cast v0, Ly05;

    .line 246
    .line 247
    invoke-virtual {v15, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v16

    .line 251
    move-object/from16 v18, v1

    .line 252
    .line 253
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    move-object/from16 v19, v2

    .line 258
    .line 259
    const/4 v2, 0x0

    .line 260
    if-nez v16, :cond_8

    .line 261
    .line 262
    if-ne v1, v10, :cond_7

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_7
    move-object/from16 v16, v5

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_8
    :goto_3
    new-instance v1, Ltt1;

    .line 269
    .line 270
    move-object/from16 v16, v5

    .line 271
    .line 272
    const/4 v5, 0x1

    .line 273
    invoke-direct {v1, v4, v0, v2, v5}, Ltt1;-><init>(Lxz4;Ly05;Lq51;B)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v15, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :goto_4
    check-cast v1, Lrn2;

    .line 280
    .line 281
    invoke-static {v1, v15, v4}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    if-ne v1, v10, :cond_9

    .line 289
    .line 290
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 291
    .line 292
    invoke-static {v1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v15, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_9
    check-cast v1, Ly05;

    .line 300
    .line 301
    invoke-virtual {v15, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    if-nez v5, :cond_b

    .line 310
    .line 311
    if-ne v2, v10, :cond_a

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_a
    move-object/from16 v20, v0

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_b
    :goto_5
    new-instance v2, Ltt1;

    .line 318
    .line 319
    const/4 v5, 0x3

    .line 320
    move-object/from16 v20, v0

    .line 321
    .line 322
    const/4 v0, 0x0

    .line 323
    invoke-direct {v2, v4, v1, v0, v5}, Ltt1;-><init>(Lxz4;Ly05;Lq51;B)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v15, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :goto_6
    check-cast v2, Lrn2;

    .line 330
    .line 331
    invoke-static {v2, v15, v4}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-interface/range {v20 .. v20}, Llh7;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Ljava/lang/Boolean;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_d

    .line 345
    .line 346
    invoke-interface {v1}, Llh7;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_c

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_c
    const/4 v5, 0x0

    .line 360
    goto :goto_8

    .line 361
    :cond_d
    :goto_7
    const/4 v5, 0x1

    .line 362
    :goto_8
    sget-object v0, Ly01;->i:Lox1;

    .line 363
    .line 364
    invoke-virtual {v15, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, Leh2;

    .line 369
    .line 370
    sget-object v1, Lpb7;->a:Lpb7;

    .line 371
    .line 372
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 377
    .line 378
    iget-wide v1, v1, Lvr;->a:J

    .line 379
    .line 380
    move-wide/from16 v20, v1

    .line 381
    .line 382
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 387
    .line 388
    iget-wide v1, v1, Lvr;->b:J

    .line 389
    .line 390
    move-wide/from16 v22, v1

    .line 391
    .line 392
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 397
    .line 398
    iget-wide v1, v1, Lvr;->c:J

    .line 399
    .line 400
    move-wide/from16 v24, v1

    .line 401
    .line 402
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 407
    .line 408
    iget-wide v1, v1, Lvr;->d:J

    .line 409
    .line 410
    move-wide/from16 v26, v1

    .line 411
    .line 412
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 417
    .line 418
    iget-wide v1, v1, Lvr;->e:J

    .line 419
    .line 420
    move-wide/from16 v28, v1

    .line 421
    .line 422
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 427
    .line 428
    iget-wide v1, v1, Lvr;->f:J

    .line 429
    .line 430
    move-wide/from16 v30, v1

    .line 431
    .line 432
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 437
    .line 438
    iget-wide v1, v1, Lvr;->g:J

    .line 439
    .line 440
    move-wide/from16 v32, v1

    .line 441
    .line 442
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 447
    .line 448
    iget-wide v1, v1, Lvr;->h:J

    .line 449
    .line 450
    move-wide/from16 v34, v1

    .line 451
    .line 452
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 457
    .line 458
    iget-wide v1, v1, Lvr;->i:J

    .line 459
    .line 460
    move-wide/from16 v36, v1

    .line 461
    .line 462
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    iget-object v1, v1, Ldp;->o:Lvr;

    .line 467
    .line 468
    iget-wide v1, v1, Lvr;->j:J

    .line 469
    .line 470
    move-wide/from16 v38, v1

    .line 471
    .line 472
    sget-object v1, Lkw0;->a:Lox1;

    .line 473
    .line 474
    invoke-virtual {v15, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    check-cast v1, Liw0;

    .line 479
    .line 480
    invoke-static {v1}, Lpb7;->e(Liw0;)Ljb7;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    const-wide/16 v40, 0x10

    .line 485
    .line 486
    cmp-long v2, v20, v40

    .line 487
    .line 488
    if-eqz v2, :cond_e

    .line 489
    .line 490
    move-object v2, v4

    .line 491
    move/from16 v17, v5

    .line 492
    .line 493
    move-wide/from16 v43, v20

    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_e
    move-object v2, v4

    .line 497
    move/from16 v17, v5

    .line 498
    .line 499
    iget-wide v4, v1, Ljb7;->a:J

    .line 500
    .line 501
    move-wide/from16 v43, v4

    .line 502
    .line 503
    :goto_9
    cmp-long v4, v22, v40

    .line 504
    .line 505
    if-eqz v4, :cond_f

    .line 506
    .line 507
    move-wide/from16 v45, v22

    .line 508
    .line 509
    goto :goto_a

    .line 510
    :cond_f
    iget-wide v4, v1, Ljb7;->b:J

    .line 511
    .line 512
    move-wide/from16 v45, v4

    .line 513
    .line 514
    :goto_a
    cmp-long v4, v26, v40

    .line 515
    .line 516
    if-eqz v4, :cond_10

    .line 517
    .line 518
    move-wide/from16 v47, v26

    .line 519
    .line 520
    goto :goto_b

    .line 521
    :cond_10
    iget-wide v4, v1, Ljb7;->c:J

    .line 522
    .line 523
    move-wide/from16 v47, v4

    .line 524
    .line 525
    :goto_b
    cmp-long v4, v24, v40

    .line 526
    .line 527
    if-eqz v4, :cond_11

    .line 528
    .line 529
    move-wide/from16 v49, v24

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_11
    iget-wide v4, v1, Ljb7;->d:J

    .line 533
    .line 534
    move-wide/from16 v49, v4

    .line 535
    .line 536
    :goto_c
    cmp-long v4, v28, v40

    .line 537
    .line 538
    if-eqz v4, :cond_12

    .line 539
    .line 540
    move-wide/from16 v51, v28

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_12
    iget-wide v4, v1, Ljb7;->e:J

    .line 544
    .line 545
    move-wide/from16 v51, v4

    .line 546
    .line 547
    :goto_d
    cmp-long v4, v30, v40

    .line 548
    .line 549
    if-eqz v4, :cond_13

    .line 550
    .line 551
    move-wide/from16 v53, v30

    .line 552
    .line 553
    goto :goto_e

    .line 554
    :cond_13
    iget-wide v4, v1, Ljb7;->f:J

    .line 555
    .line 556
    move-wide/from16 v53, v4

    .line 557
    .line 558
    :goto_e
    cmp-long v4, v32, v40

    .line 559
    .line 560
    if-eqz v4, :cond_14

    .line 561
    .line 562
    move-wide/from16 v55, v32

    .line 563
    .line 564
    goto :goto_f

    .line 565
    :cond_14
    iget-wide v4, v1, Ljb7;->g:J

    .line 566
    .line 567
    move-wide/from16 v55, v4

    .line 568
    .line 569
    :goto_f
    cmp-long v4, v36, v40

    .line 570
    .line 571
    if-eqz v4, :cond_15

    .line 572
    .line 573
    move-wide/from16 v57, v36

    .line 574
    .line 575
    goto :goto_10

    .line 576
    :cond_15
    iget-wide v4, v1, Ljb7;->h:J

    .line 577
    .line 578
    move-wide/from16 v57, v4

    .line 579
    .line 580
    :goto_10
    cmp-long v4, v34, v40

    .line 581
    .line 582
    if-eqz v4, :cond_16

    .line 583
    .line 584
    move-wide/from16 v59, v34

    .line 585
    .line 586
    goto :goto_11

    .line 587
    :cond_16
    iget-wide v4, v1, Ljb7;->i:J

    .line 588
    .line 589
    move-wide/from16 v59, v4

    .line 590
    .line 591
    :goto_11
    cmp-long v4, v38, v40

    .line 592
    .line 593
    if-eqz v4, :cond_17

    .line 594
    .line 595
    move-wide/from16 v61, v38

    .line 596
    .line 597
    goto :goto_12

    .line 598
    :cond_17
    iget-wide v4, v1, Ljb7;->j:J

    .line 599
    .line 600
    move-wide/from16 v61, v4

    .line 601
    .line 602
    :goto_12
    new-instance v42, Ljb7;

    .line 603
    .line 604
    invoke-direct/range {v42 .. v62}, Ljb7;-><init>(JJJJJJJJJJ)V

    .line 605
    .line 606
    .line 607
    new-instance v1, Lft;

    .line 608
    .line 609
    new-instance v4, Lbt;

    .line 610
    .line 611
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 612
    .line 613
    .line 614
    const/high16 v5, 0x40800000    # 4.0f

    .line 615
    .line 616
    invoke-direct {v1, v5, v4}, Lft;-><init>(FLbt;)V

    .line 617
    .line 618
    .line 619
    const/4 v4, 0x6

    .line 620
    move-object/from16 v5, p1

    .line 621
    .line 622
    invoke-static {v1, v5, v15, v4}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    iget-wide v4, v15, Llp2;->T:J

    .line 627
    .line 628
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 629
    .line 630
    .line 631
    move-result v4

    .line 632
    invoke-virtual {v15}, Llp2;->l()Lkl5;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    invoke-static {v15, v14}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 637
    .line 638
    .line 639
    move-result-object v14

    .line 640
    invoke-virtual {v15}, Llp2;->Z()V

    .line 641
    .line 642
    .line 643
    move-object/from16 p1, v2

    .line 644
    .line 645
    iget-boolean v2, v15, Llp2;->S:Z

    .line 646
    .line 647
    if-eqz v2, :cond_18

    .line 648
    .line 649
    invoke-virtual {v15}, Llp2;->k()V

    .line 650
    .line 651
    .line 652
    goto :goto_13

    .line 653
    :cond_18
    invoke-virtual {v15}, Llp2;->j0()V

    .line 654
    .line 655
    .line 656
    :goto_13
    invoke-static {v12, v15, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    invoke-static {v11, v15, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    invoke-static {v4, v15, v9, v15}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 663
    .line 664
    .line 665
    invoke-static {v8, v15, v14}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v15, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    invoke-virtual {v15}, Llp2;->K()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    if-nez v1, :cond_19

    .line 677
    .line 678
    if-ne v2, v10, :cond_1a

    .line 679
    .line 680
    :cond_19
    new-instance v2, Lf0;

    .line 681
    .line 682
    const/16 v1, 0xf

    .line 683
    .line 684
    invoke-direct {v2, v0, v1}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v15, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    :cond_1a
    check-cast v2, Lgn2;

    .line 691
    .line 692
    invoke-static {v3, v2}, Lmb6;->T(Lkx4;Lgn2;)Lkx4;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    move-object v1, v9

    .line 697
    new-instance v9, Lxx2;

    .line 698
    .line 699
    move-object/from16 v10, p1

    .line 700
    .line 701
    move-object v4, v1

    .line 702
    move-object v2, v11

    .line 703
    move-object v1, v12

    .line 704
    move-object/from16 v12, v16

    .line 705
    .line 706
    move/from16 v14, v17

    .line 707
    .line 708
    move-object/from16 v11, v42

    .line 709
    .line 710
    invoke-direct/range {v9 .. v14}, Lxx2;-><init>(Lxz4;Ljb7;Lgn2;FZ)V

    .line 711
    .line 712
    .line 713
    const v5, -0x335db146    # -8.509589E7f

    .line 714
    .line 715
    .line 716
    invoke-static {v5, v9, v15}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 717
    .line 718
    .line 719
    move-result-object v12

    .line 720
    const/high16 v16, 0x6000000

    .line 721
    .line 722
    const/16 v17, 0x0

    .line 723
    .line 724
    const/16 v11, 0x9

    .line 725
    .line 726
    move-object v14, v6

    .line 727
    move v6, v13

    .line 728
    const/4 v13, 0x0

    .line 729
    move-object v5, v8

    .line 730
    move-object v8, v0

    .line 731
    move-object v0, v5

    .line 732
    move-object/from16 v9, v42

    .line 733
    .line 734
    const/4 v5, 0x0

    .line 735
    invoke-static/range {v6 .. v17}, Lvb7;->a(FLgn2;Lkx4;Ljb7;Lxz4;ILzy0;Lsn2;Luu0;Llp2;II)V

    .line 736
    .line 737
    .line 738
    sget-object v6, Lkm4;->d:Lct;

    .line 739
    .line 740
    sget-object v7, Lpz2;->o0:Lo50;

    .line 741
    .line 742
    const/16 v8, 0x36

    .line 743
    .line 744
    invoke-static {v6, v7, v15, v8}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    iget-wide v7, v15, Llp2;->T:J

    .line 749
    .line 750
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    invoke-virtual {v15}, Llp2;->l()Lkl5;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    invoke-static {v15, v3}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    invoke-virtual {v15}, Llp2;->Z()V

    .line 763
    .line 764
    .line 765
    iget-boolean v9, v15, Llp2;->S:Z

    .line 766
    .line 767
    if-eqz v9, :cond_1b

    .line 768
    .line 769
    invoke-virtual {v15}, Llp2;->k()V

    .line 770
    .line 771
    .line 772
    goto :goto_14

    .line 773
    :cond_1b
    invoke-virtual {v15}, Llp2;->j0()V

    .line 774
    .line 775
    .line 776
    :goto_14
    invoke-static {v1, v15, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    invoke-static {v2, v15, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    invoke-static {v7, v15, v4, v15}, Loi0;->u(ILlp2;Ldx0;Llp2;)V

    .line 783
    .line 784
    .line 785
    invoke-static {v0, v15, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    invoke-static {v15}, Lys0;->D(Llp2;)Lds;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    iget-object v0, v0, Lds;->c:Lo88;

    .line 793
    .line 794
    invoke-static {v15}, Lys0;->y(Llp2;)Ldp;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    iget-object v1, v1, Ldp;->c:Lxr;

    .line 799
    .line 800
    iget-wide v1, v1, Lxr;->a:J

    .line 801
    .line 802
    const/16 v31, 0x0

    .line 803
    .line 804
    const v32, 0xfffffe

    .line 805
    .line 806
    .line 807
    const-wide/16 v23, 0x0

    .line 808
    .line 809
    const/16 v25, 0x0

    .line 810
    .line 811
    const/16 v26, 0x0

    .line 812
    .line 813
    const-wide/16 v27, 0x0

    .line 814
    .line 815
    const-wide/16 v29, 0x0

    .line 816
    .line 817
    move-object/from16 v20, v0

    .line 818
    .line 819
    move-wide/from16 v21, v1

    .line 820
    .line 821
    invoke-static/range {v20 .. v32}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 822
    .line 823
    .line 824
    move-result-object v8

    .line 825
    const/16 v16, 0x0

    .line 826
    .line 827
    const/16 v17, 0x1fa

    .line 828
    .line 829
    const/4 v7, 0x0

    .line 830
    const/4 v9, 0x0

    .line 831
    const/4 v10, 0x0

    .line 832
    const/4 v11, 0x0

    .line 833
    const/4 v12, 0x0

    .line 834
    const/4 v13, 0x0

    .line 835
    const/4 v14, 0x0

    .line 836
    move-object/from16 v6, p2

    .line 837
    .line 838
    invoke-static/range {v6 .. v17}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 839
    .line 840
    .line 841
    move-object/from16 v6, v18

    .line 842
    .line 843
    invoke-static/range {v6 .. v17}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 844
    .line 845
    .line 846
    const/4 v1, 0x1

    .line 847
    invoke-virtual {v15, v1}, Llp2;->p(Z)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v15, v1}, Llp2;->p(Z)V

    .line 851
    .line 852
    .line 853
    const v0, -0x2381a7c4

    .line 854
    .line 855
    .line 856
    invoke-virtual {v15, v0}, Llp2;->W(I)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v15, v5}, Llp2;->p(Z)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v15, v1}, Llp2;->p(Z)V

    .line 863
    .line 864
    .line 865
    goto :goto_15

    .line 866
    :cond_1c
    move-object/from16 v19, v2

    .line 867
    .line 868
    invoke-virtual {v15}, Llp2;->Q()V

    .line 869
    .line 870
    .line 871
    :goto_15
    return-object v19

    .line 872
    :pswitch_0
    move-object/from16 v19, v2

    .line 873
    .line 874
    move v1, v5

    .line 875
    move-object/from16 v2, p1

    .line 876
    .line 877
    check-cast v2, Llp2;

    .line 878
    .line 879
    move-object/from16 v5, p2

    .line 880
    .line 881
    check-cast v5, Ljava/lang/Integer;

    .line 882
    .line 883
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 884
    .line 885
    .line 886
    or-int/2addr v0, v1

    .line 887
    invoke-static {v0}, Lw79;->P(I)I

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    invoke-static {v0, v4, v2, v3}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 892
    .line 893
    .line 894
    return-object v19

    .line 895
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

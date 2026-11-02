.class public final synthetic Lii;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb83;Lgn2;Lkx4;Lkx4;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput-byte v0, p0, Lii;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lii;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lii;->Y:Ljava/lang/Object;

    iput-object p3, p0, Lii;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lii;->g0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lj2;Ljava/lang/String;Ljava/lang/String;Lgn2;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    iput-byte v0, p0, Lii;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lii;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lii;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lii;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lii;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 17
    iput-byte p5, p0, Lii;->X:B

    iput-object p1, p0, Lii;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lii;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lii;->Y:Ljava/lang/Object;

    iput-object p4, p0, Lii;->g0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lii;->X:B

    .line 4
    .line 5
    const-string v2, "Divider"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    sget-object v6, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget-object v7, v0, Lii;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v0, Lii;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v9, v0, Lii;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, Lii;->Z:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    check-cast v9, Ljava/util/List;

    .line 25
    .line 26
    check-cast v8, Lsu/happ/proxyutility/dto/TestPingViaProxyData;

    .line 27
    .line 28
    check-cast v7, Lsu/happ/proxyutility/service/XRayTestService;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-lt v1, v2, :cond_3

    .line 49
    .line 50
    new-instance v1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v3, v2

    .line 70
    check-cast v3, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    const-wide/16 v9, 0x0

    .line 77
    .line 78
    cmp-long v3, v3, v9

    .line 79
    .line 80
    if-lez v3, :cond_0

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-static {v1}, Lwv0;->C0(Ljava/util/ArrayList;)Ljava/lang/Comparable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/Long;

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const-wide/16 v0, -0x1

    .line 100
    .line 101
    :goto_1
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/TestPingViaProxyData;->b()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v3, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;

    .line 106
    .line 107
    invoke-direct {v3, v0, v1, v2}, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;-><init>(JLjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Lyw2;->b:Lcom/google/gson/a;

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "su.happ.proxyutility.action.activity"

    .line 117
    .line 118
    const/16 v2, 0x47

    .line 119
    .line 120
    invoke-static {v7, v1, v2, v0}, Lqe4;->L0(Landroid/content/Context;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 121
    .line 122
    .line 123
    :cond_3
    return-object v6

    .line 124
    :pswitch_0
    check-cast v0, Ldn2;

    .line 125
    .line 126
    check-cast v9, Ldn2;

    .line 127
    .line 128
    check-cast v8, Lr68;

    .line 129
    .line 130
    check-cast v7, Ls88;

    .line 131
    .line 132
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, Lt38;

    .line 135
    .line 136
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    if-eqz v9, :cond_4

    .line 140
    .line 141
    invoke-interface {v9}, Ldn2;->invoke()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    :cond_4
    if-eqz v5, :cond_5

    .line 152
    .line 153
    invoke-interface {v1}, Lt38;->close()V

    .line 154
    .line 155
    .line 156
    :cond_5
    invoke-virtual {v8, v7}, Lr68;->y(Ls88;)V

    .line 157
    .line 158
    .line 159
    return-object v6

    .line 160
    :pswitch_1
    check-cast v0, Lj2;

    .line 161
    .line 162
    move-object v12, v9

    .line 163
    check-cast v12, Ljava/lang/String;

    .line 164
    .line 165
    move-object v14, v7

    .line 166
    check-cast v14, Ljava/lang/String;

    .line 167
    .line 168
    move-object v15, v8

    .line 169
    check-cast v15, Lgn2;

    .line 170
    .line 171
    move-object/from16 v1, p1

    .line 172
    .line 173
    check-cast v1, Ly64;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    move v9, v4

    .line 185
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-eqz v10, :cond_b

    .line 190
    .line 191
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    add-int/lit8 v17, v9, 0x1

    .line 196
    .line 197
    if-ltz v9, :cond_a

    .line 198
    .line 199
    check-cast v10, Ljava/util/Map$Entry;

    .line 200
    .line 201
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    move-object v13, v11

    .line 206
    check-cast v13, Ltn6;

    .line 207
    .line 208
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    move-object/from16 v18, v10

    .line 213
    .line 214
    check-cast v18, Lb83;

    .line 215
    .line 216
    iget-object v10, v13, Ltn6;->a:Ljava/lang/String;

    .line 217
    .line 218
    new-instance v11, Lo90;

    .line 219
    .line 220
    const/16 v19, 0x0

    .line 221
    .line 222
    const/16 v3, 0xd

    .line 223
    .line 224
    invoke-direct {v11, v13, v7, v3}, Lo90;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 225
    .line 226
    .line 227
    new-instance v3, Lzy0;

    .line 228
    .line 229
    const v4, 0xf1b995a

    .line 230
    .line 231
    .line 232
    invoke-direct {v3, v4, v5, v11}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v1, v10, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 236
    .line 237
    .line 238
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const/4 v4, 0x0

    .line 243
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-eqz v10, :cond_8

    .line 248
    .line 249
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    add-int/lit8 v20, v4, 0x1

    .line 254
    .line 255
    if-ltz v4, :cond_7

    .line 256
    .line 257
    move-object v11, v10

    .line 258
    check-cast v11, Lvo6;

    .line 259
    .line 260
    iget-object v10, v11, Lvo6;->c:Ljava/lang/String;

    .line 261
    .line 262
    move-object/from16 v16, v10

    .line 263
    .line 264
    new-instance v10, Ldf4;

    .line 265
    .line 266
    move-object/from16 v21, v16

    .line 267
    .line 268
    move-object/from16 v16, v7

    .line 269
    .line 270
    move-object/from16 v7, v21

    .line 271
    .line 272
    invoke-direct/range {v10 .. v16}, Ldf4;-><init>(Lvo6;Ljava/lang/String;Ltn6;Ljava/lang/String;Lgn2;Lkx4;)V

    .line 273
    .line 274
    .line 275
    move-object/from16 p0, v0

    .line 276
    .line 277
    move-object/from16 p1, v3

    .line 278
    .line 279
    move-object v0, v10

    .line 280
    move-object/from16 v10, v16

    .line 281
    .line 282
    new-instance v3, Lzy0;

    .line 283
    .line 284
    move-object/from16 v16, v6

    .line 285
    .line 286
    const v6, 0x113879ef

    .line 287
    .line 288
    .line 289
    invoke-direct {v3, v6, v5, v0}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v1, v7, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 293
    .line 294
    .line 295
    move-object/from16 v0, v18

    .line 296
    .line 297
    check-cast v0, Lz0;

    .line 298
    .line 299
    invoke-virtual {v0}, Lz0;->size()I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    sub-int/2addr v0, v5

    .line 304
    if-eq v4, v0, :cond_6

    .line 305
    .line 306
    iget-object v0, v11, Lvo6;->c:Ljava/lang/String;

    .line 307
    .line 308
    invoke-static {v2, v0}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    new-instance v3, Lhr2;

    .line 313
    .line 314
    const/4 v4, 0x3

    .line 315
    invoke-direct {v3, v10, v4}, Lhr2;-><init>(Lkx4;B)V

    .line 316
    .line 317
    .line 318
    new-instance v4, Lzy0;

    .line 319
    .line 320
    const v6, -0x6a855a76

    .line 321
    .line 322
    .line 323
    invoke-direct {v4, v6, v5, v3}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v0, v4}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 327
    .line 328
    .line 329
    :cond_6
    move-object/from16 v0, p0

    .line 330
    .line 331
    move-object/from16 v3, p1

    .line 332
    .line 333
    move-object v7, v10

    .line 334
    move-object/from16 v6, v16

    .line 335
    .line 336
    move/from16 v4, v20

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_7
    invoke-static {}, Li21;->X()V

    .line 340
    .line 341
    .line 342
    throw v19

    .line 343
    :cond_8
    move-object/from16 p0, v0

    .line 344
    .line 345
    move-object/from16 v16, v6

    .line 346
    .line 347
    move-object v10, v7

    .line 348
    invoke-virtual/range {p0 .. p0}, Lz0;->a()I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    sub-int/2addr v0, v5

    .line 353
    if-eq v9, v0, :cond_9

    .line 354
    .line 355
    iget-object v0, v13, Ltn6;->a:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v2, v0}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sget-object v3, Lvr3;->h:Lzy0;

    .line 362
    .line 363
    invoke-static {v1, v0, v3}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 364
    .line 365
    .line 366
    :cond_9
    move-object/from16 v0, p0

    .line 367
    .line 368
    move-object v7, v10

    .line 369
    move-object/from16 v6, v16

    .line 370
    .line 371
    move/from16 v9, v17

    .line 372
    .line 373
    const/4 v4, 0x0

    .line 374
    goto/16 :goto_2

    .line 375
    .line 376
    :cond_a
    const/16 v19, 0x0

    .line 377
    .line 378
    invoke-static {}, Li21;->X()V

    .line 379
    .line 380
    .line 381
    throw v19

    .line 382
    :cond_b
    move-object/from16 v16, v6

    .line 383
    .line 384
    return-object v16

    .line 385
    :pswitch_2
    move-object/from16 v16, v6

    .line 386
    .line 387
    check-cast v0, Lea6;

    .line 388
    .line 389
    check-cast v9, Landroid/os/IBinder;

    .line 390
    .line 391
    check-cast v8, Lbd6;

    .line 392
    .line 393
    check-cast v7, Landroid/os/IInterface;

    .line 394
    .line 395
    move-object/from16 v1, p1

    .line 396
    .line 397
    check-cast v1, Lq51;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    new-instance v2, Lcd6;

    .line 403
    .line 404
    invoke-direct {v2, v1}, Lcd6;-><init>(Lq51;)V

    .line 405
    .line 406
    .line 407
    iput-object v2, v0, Lea6;->X:Ljava/lang/Object;

    .line 408
    .line 409
    const/4 v0, 0x0

    .line 410
    invoke-interface {v9, v2, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 411
    .line 412
    .line 413
    new-instance v0, Led6;

    .line 414
    .line 415
    invoke-direct {v0, v1}, Led6;-><init>(Lq51;)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v8, v7, v0}, Lbd6;->K(Ljava/lang/Object;Led6;)V

    .line 419
    .line 420
    .line 421
    return-object v16

    .line 422
    :pswitch_3
    move-object/from16 v16, v6

    .line 423
    .line 424
    check-cast v0, Lba6;

    .line 425
    .line 426
    check-cast v9, Luy4;

    .line 427
    .line 428
    check-cast v8, Lry6;

    .line 429
    .line 430
    check-cast v7, Lvf;

    .line 431
    .line 432
    move-object/from16 v1, p1

    .line 433
    .line 434
    check-cast v1, Lok;

    .line 435
    .line 436
    iget-object v2, v1, Lok;->e:Lrh5;

    .line 437
    .line 438
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    check-cast v2, Ljava/lang/Number;

    .line 443
    .line 444
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    iget v3, v0, Lba6;->X:F

    .line 449
    .line 450
    sub-float/2addr v2, v3

    .line 451
    invoke-static {v2}, Lw79;->G(F)Z

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    if-nez v3, :cond_d

    .line 456
    .line 457
    invoke-virtual {v9, v8, v2}, Luy4;->c(Lry6;F)F

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    sub-float v3, v2, v3

    .line 462
    .line 463
    invoke-static {v3}, Lw79;->G(F)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-nez v3, :cond_c

    .line 468
    .line 469
    invoke-virtual {v1}, Lok;->a()V

    .line 470
    .line 471
    .line 472
    goto :goto_4

    .line 473
    :cond_c
    iget v3, v0, Lba6;->X:F

    .line 474
    .line 475
    add-float/2addr v3, v2

    .line 476
    iput v3, v0, Lba6;->X:F

    .line 477
    .line 478
    :cond_d
    iget v0, v0, Lba6;->X:F

    .line 479
    .line 480
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v7, v0}, Lvf;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, Ljava/lang/Boolean;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-eqz v0, :cond_e

    .line 495
    .line 496
    invoke-virtual {v1}, Lok;->a()V

    .line 497
    .line 498
    .line 499
    :cond_e
    :goto_4
    return-object v16

    .line 500
    :pswitch_4
    check-cast v0, Lp64;

    .line 501
    .line 502
    check-cast v9, Lf64;

    .line 503
    .line 504
    check-cast v8, Lvp7;

    .line 505
    .line 506
    check-cast v7, Lws5;

    .line 507
    .line 508
    move-object/from16 v1, p1

    .line 509
    .line 510
    check-cast v1, Leq1;

    .line 511
    .line 512
    new-instance v1, Lsa2;

    .line 513
    .line 514
    invoke-direct {v1, v9, v8, v7}, Lsa2;-><init>(Lf64;Lvp7;Lws5;)V

    .line 515
    .line 516
    .line 517
    iput-object v1, v0, Lp64;->c:Lsa2;

    .line 518
    .line 519
    new-instance v1, Ljd;

    .line 520
    .line 521
    const/4 v2, 0x7

    .line 522
    invoke-direct {v1, v0, v2}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 523
    .line 524
    .line 525
    return-object v1

    .line 526
    :pswitch_5
    move-object/from16 v16, v6

    .line 527
    .line 528
    check-cast v0, Lokhttp3/Request;

    .line 529
    .line 530
    check-cast v9, Lokhttp3/Response;

    .line 531
    .line 532
    check-cast v8, Lsu/happ/proxyutility/dto/AdditionalInfoCode;

    .line 533
    .line 534
    check-cast v7, Ljava/lang/String;

    .line 535
    .line 536
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, Ljava/io/PrintWriter;

    .line 539
    .line 540
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->pathSegments()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v9}, Lokhttp3/Response;->code()I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/AdditionalInfoCode;->a()I

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    invoke-static {v4, v7}, Lsu/happ/proxyutility/dto/AdditionalInfoCodeKt;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    new-instance v5, Ljava/lang/StringBuilder;

    .line 569
    .line 570
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    const-string v2, " API source: "

    .line 577
    .line 578
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const-string v0, " Response code: "

    .line 585
    .line 586
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    const-string v0, " Info Code: "

    .line 593
    .line 594
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    return-object v16

    .line 608
    :pswitch_6
    move-object/from16 v16, v6

    .line 609
    .line 610
    check-cast v0, Ly05;

    .line 611
    .line 612
    check-cast v9, Lnc3;

    .line 613
    .line 614
    check-cast v8, Lba6;

    .line 615
    .line 616
    check-cast v7, Lb71;

    .line 617
    .line 618
    move-object/from16 v1, p1

    .line 619
    .line 620
    check-cast v1, Ljava/lang/Long;

    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 623
    .line 624
    .line 625
    move-result-wide v1

    .line 626
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    check-cast v0, Llh7;

    .line 631
    .line 632
    if-eqz v0, :cond_f

    .line 633
    .line 634
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    check-cast v0, Ljava/lang/Number;

    .line 639
    .line 640
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 641
    .line 642
    .line 643
    move-result-wide v3

    .line 644
    goto :goto_5

    .line 645
    :cond_f
    move-wide v3, v1

    .line 646
    :goto_5
    iget-wide v10, v9, Lnc3;->c:J

    .line 647
    .line 648
    iget-object v0, v9, Lnc3;->a:Lc15;

    .line 649
    .line 650
    const-wide/high16 v12, -0x8000000000000000L

    .line 651
    .line 652
    cmp-long v6, v10, v12

    .line 653
    .line 654
    if-eqz v6, :cond_10

    .line 655
    .line 656
    iget v6, v8, Lba6;->X:F

    .line 657
    .line 658
    invoke-interface {v7}, Lb71;->getCoroutineContext()Ls61;

    .line 659
    .line 660
    .line 661
    move-result-object v10

    .line 662
    invoke-static {v10}, Lry7;->h(Ls61;)F

    .line 663
    .line 664
    .line 665
    move-result v10

    .line 666
    cmpg-float v6, v6, v10

    .line 667
    .line 668
    if-nez v6, :cond_10

    .line 669
    .line 670
    goto :goto_7

    .line 671
    :cond_10
    iput-wide v1, v9, Lnc3;->c:J

    .line 672
    .line 673
    iget-object v1, v0, Lc15;->X:[Ljava/lang/Object;

    .line 674
    .line 675
    iget v2, v0, Lc15;->Z:I

    .line 676
    .line 677
    const/4 v6, 0x0

    .line 678
    :goto_6
    if-ge v6, v2, :cond_11

    .line 679
    .line 680
    aget-object v10, v1, v6

    .line 681
    .line 682
    check-cast v10, Llc3;

    .line 683
    .line 684
    iput-boolean v5, v10, Llc3;->h0:Z

    .line 685
    .line 686
    add-int/lit8 v6, v6, 0x1

    .line 687
    .line 688
    goto :goto_6

    .line 689
    :cond_11
    invoke-interface {v7}, Lb71;->getCoroutineContext()Ls61;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-static {v1}, Lry7;->h(Ls61;)F

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    iput v1, v8, Lba6;->X:F

    .line 698
    .line 699
    :goto_7
    iget v1, v8, Lba6;->X:F

    .line 700
    .line 701
    const/4 v2, 0x0

    .line 702
    cmpg-float v2, v1, v2

    .line 703
    .line 704
    if-nez v2, :cond_12

    .line 705
    .line 706
    iget-object v1, v0, Lc15;->X:[Ljava/lang/Object;

    .line 707
    .line 708
    iget v0, v0, Lc15;->Z:I

    .line 709
    .line 710
    const/4 v4, 0x0

    .line 711
    :goto_8
    if-ge v4, v0, :cond_17

    .line 712
    .line 713
    aget-object v2, v1, v4

    .line 714
    .line 715
    check-cast v2, Llc3;

    .line 716
    .line 717
    iget-object v3, v2, Llc3;->f0:Lt18;

    .line 718
    .line 719
    iget-object v3, v3, Lt18;->c:Ljava/lang/Object;

    .line 720
    .line 721
    iget-object v6, v2, Llc3;->Z:Lrh5;

    .line 722
    .line 723
    invoke-virtual {v6, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    iput-boolean v5, v2, Llc3;->h0:Z

    .line 727
    .line 728
    add-int/lit8 v4, v4, 0x1

    .line 729
    .line 730
    goto :goto_8

    .line 731
    :cond_12
    iget-wide v6, v9, Lnc3;->c:J

    .line 732
    .line 733
    sub-long/2addr v3, v6

    .line 734
    long-to-float v2, v3

    .line 735
    div-float/2addr v2, v1

    .line 736
    float-to-long v1, v2

    .line 737
    iget-object v3, v0, Lc15;->X:[Ljava/lang/Object;

    .line 738
    .line 739
    iget v0, v0, Lc15;->Z:I

    .line 740
    .line 741
    move v6, v5

    .line 742
    const/4 v4, 0x0

    .line 743
    :goto_9
    if-ge v4, v0, :cond_16

    .line 744
    .line 745
    aget-object v7, v3, v4

    .line 746
    .line 747
    check-cast v7, Llc3;

    .line 748
    .line 749
    iget-boolean v8, v7, Llc3;->g0:Z

    .line 750
    .line 751
    if-nez v8, :cond_14

    .line 752
    .line 753
    iget-object v8, v7, Llc3;->j0:Lnc3;

    .line 754
    .line 755
    iget-object v8, v8, Lnc3;->b:Lrh5;

    .line 756
    .line 757
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 758
    .line 759
    invoke-virtual {v8, v10}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    iget-boolean v8, v7, Llc3;->h0:Z

    .line 763
    .line 764
    if-eqz v8, :cond_13

    .line 765
    .line 766
    const/4 v8, 0x0

    .line 767
    iput-boolean v8, v7, Llc3;->h0:Z

    .line 768
    .line 769
    iput-wide v1, v7, Llc3;->i0:J

    .line 770
    .line 771
    :cond_13
    iget-wide v10, v7, Llc3;->i0:J

    .line 772
    .line 773
    sub-long v10, v1, v10

    .line 774
    .line 775
    iget-object v8, v7, Llc3;->f0:Lt18;

    .line 776
    .line 777
    invoke-virtual {v8, v10, v11}, Lt18;->f(J)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v8

    .line 781
    iget-object v12, v7, Llc3;->Z:Lrh5;

    .line 782
    .line 783
    invoke-virtual {v12, v8}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    iget-object v8, v7, Llc3;->f0:Lt18;

    .line 787
    .line 788
    invoke-interface {v8, v10, v11}, Lgk;->e(J)Z

    .line 789
    .line 790
    .line 791
    move-result v8

    .line 792
    iput-boolean v8, v7, Llc3;->g0:Z

    .line 793
    .line 794
    :cond_14
    if-nez v8, :cond_15

    .line 795
    .line 796
    const/4 v6, 0x0

    .line 797
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 798
    .line 799
    goto :goto_9

    .line 800
    :cond_16
    xor-int/lit8 v0, v6, 0x1

    .line 801
    .line 802
    iget-object v1, v9, Lnc3;->d:Lrh5;

    .line 803
    .line 804
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {v1, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    :cond_17
    return-object v16

    .line 812
    :pswitch_7
    move-object/from16 v16, v6

    .line 813
    .line 814
    const/16 v19, 0x0

    .line 815
    .line 816
    check-cast v0, Lb83;

    .line 817
    .line 818
    check-cast v8, Lgn2;

    .line 819
    .line 820
    check-cast v9, Lkx4;

    .line 821
    .line 822
    check-cast v7, Lkx4;

    .line 823
    .line 824
    move-object/from16 v1, p1

    .line 825
    .line 826
    check-cast v1, Ly64;

    .line 827
    .line 828
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v3

    .line 835
    const/4 v4, 0x0

    .line 836
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 837
    .line 838
    .line 839
    move-result v6

    .line 840
    if-eqz v6, :cond_1a

    .line 841
    .line 842
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v6

    .line 846
    add-int/lit8 v10, v4, 0x1

    .line 847
    .line 848
    if-ltz v4, :cond_19

    .line 849
    .line 850
    check-cast v6, Lir2;

    .line 851
    .line 852
    iget-object v11, v6, Lir2;->a:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 853
    .line 854
    new-instance v12, Lp90;

    .line 855
    .line 856
    invoke-direct {v12, v6, v8, v9, v5}, Lp90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 857
    .line 858
    .line 859
    new-instance v13, Lzy0;

    .line 860
    .line 861
    const v14, -0x112ef7eb

    .line 862
    .line 863
    .line 864
    invoke-direct {v13, v14, v5, v12}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    invoke-static {v1, v11, v13}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 868
    .line 869
    .line 870
    move-object v11, v0

    .line 871
    check-cast v11, Lz0;

    .line 872
    .line 873
    invoke-virtual {v11}, Lz0;->a()I

    .line 874
    .line 875
    .line 876
    move-result v11

    .line 877
    sub-int/2addr v11, v5

    .line 878
    if-eq v4, v11, :cond_18

    .line 879
    .line 880
    iget-object v4, v6, Lir2;->a:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 881
    .line 882
    new-instance v6, Ljava/lang/StringBuilder;

    .line 883
    .line 884
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    new-instance v6, Lhr2;

    .line 895
    .line 896
    const/4 v11, 0x0

    .line 897
    invoke-direct {v6, v7, v11}, Lhr2;-><init>(Lkx4;B)V

    .line 898
    .line 899
    .line 900
    new-instance v12, Lzy0;

    .line 901
    .line 902
    const v13, 0xc84c69a

    .line 903
    .line 904
    .line 905
    invoke-direct {v12, v13, v5, v6}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    invoke-static {v1, v4, v12}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 909
    .line 910
    .line 911
    goto :goto_b

    .line 912
    :cond_18
    const/4 v11, 0x0

    .line 913
    :goto_b
    move v4, v10

    .line 914
    goto :goto_a

    .line 915
    :cond_19
    invoke-static {}, Li21;->X()V

    .line 916
    .line 917
    .line 918
    throw v19

    .line 919
    :cond_1a
    return-object v16

    .line 920
    :pswitch_8
    move-object/from16 v16, v6

    .line 921
    .line 922
    check-cast v0, Loi;

    .line 923
    .line 924
    check-cast v9, Lqk;

    .line 925
    .line 926
    check-cast v8, Lgn2;

    .line 927
    .line 928
    check-cast v7, Laa6;

    .line 929
    .line 930
    move-object/from16 v1, p1

    .line 931
    .line 932
    check-cast v1, Lok;

    .line 933
    .line 934
    iget-object v2, v0, Loi;->c:Lqk;

    .line 935
    .line 936
    invoke-static {v1, v2}, Lry7;->j(Lok;Lqk;)V

    .line 937
    .line 938
    .line 939
    iget-object v2, v1, Lok;->e:Lrh5;

    .line 940
    .line 941
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v3

    .line 945
    invoke-virtual {v0, v3}, Loi;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    invoke-static {v3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-nez v2, :cond_1c

    .line 958
    .line 959
    iget-object v2, v0, Loi;->c:Lqk;

    .line 960
    .line 961
    iget-object v2, v2, Lqk;->Y:Lrh5;

    .line 962
    .line 963
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 964
    .line 965
    .line 966
    iget-object v2, v9, Lqk;->Y:Lrh5;

    .line 967
    .line 968
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    if-eqz v8, :cond_1b

    .line 972
    .line 973
    invoke-interface {v8, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    :cond_1b
    invoke-virtual {v1}, Lok;->a()V

    .line 977
    .line 978
    .line 979
    iput-boolean v5, v7, Laa6;->X:Z

    .line 980
    .line 981
    goto :goto_c

    .line 982
    :cond_1c
    if-eqz v8, :cond_1d

    .line 983
    .line 984
    invoke-interface {v8, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    :cond_1d
    :goto_c
    return-object v16

    .line 988
    nop

    .line 989
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

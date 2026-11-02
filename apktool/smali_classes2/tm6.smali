.class public final Ltm6;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Ltm6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ltm6;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ltm6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ltm6;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ltm6;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Ltm6;->X:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    iget-object v5, v0, Ltm6;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v7, v0, Ltm6;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v8, v0, Ltm6;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, Ltm6;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x3

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v0, Lb71;

    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, Lcx3;

    .line 26
    .line 27
    iget-object v1, v1, Lcx3;->a:Landroid/view/KeyEvent;

    .line 28
    .line 29
    check-cast v8, Lgn2;

    .line 30
    .line 31
    check-cast v7, Lvo6;

    .line 32
    .line 33
    iget-object v2, v7, Lvo6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 34
    .line 35
    check-cast v5, Lla;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Lpu;->d(I)J

    .line 45
    .line 46
    .line 47
    move-result-wide v12

    .line 48
    sget-wide v14, Lax3;->g:J

    .line 49
    .line 50
    invoke-static {v12, v13, v14, v15}, Lax3;->a(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    sget-object v7, Lbv1;->X:Lbv1;

    .line 55
    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-static {v1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-ne v3, v9, :cond_0

    .line 63
    .line 64
    iget-object v3, v5, Lla;->d:Lrh5;

    .line 65
    .line 66
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-ne v3, v7, :cond_0

    .line 71
    .line 72
    new-instance v1, Lgf4;

    .line 73
    .line 74
    const/4 v2, 0x7

    .line 75
    invoke-direct {v1, v5, v10, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v10, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 79
    .line 80
    .line 81
    :goto_0
    const/4 v4, 0x1

    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_0
    invoke-static {v12, v13, v14, v15}, Lax3;->a(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    sget-object v4, Lbv1;->Y:Lbv1;

    .line 89
    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    invoke-static {v1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-ne v3, v9, :cond_1

    .line 97
    .line 98
    iget-object v3, v5, Lla;->d:Lrh5;

    .line 99
    .line 100
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-ne v3, v4, :cond_1

    .line 105
    .line 106
    new-instance v0, Lko6;

    .line 107
    .line 108
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-direct {v0, v1, v2}, Lko6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v8, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    move-object/from16 p0, v7

    .line 124
    .line 125
    sget-wide v6, Lax3;->f:J

    .line 126
    .line 127
    invoke-static {v12, v13, v6, v7}, Lax3;->a(JJ)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_2

    .line 132
    .line 133
    invoke-static {v1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-ne v3, v9, :cond_2

    .line 138
    .line 139
    iget-object v3, v5, Lla;->d:Lrh5;

    .line 140
    .line 141
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-ne v3, v4, :cond_2

    .line 146
    .line 147
    new-instance v1, Lgf4;

    .line 148
    .line 149
    const/16 v2, 0x8

    .line 150
    .line 151
    invoke-direct {v1, v5, v10, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v10, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_2
    invoke-static {v12, v13, v6, v7}, Lax3;->a(JJ)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_3

    .line 163
    .line 164
    invoke-static {v1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-ne v3, v9, :cond_3

    .line 169
    .line 170
    iget-object v3, v5, Lla;->d:Lrh5;

    .line 171
    .line 172
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    move-object/from16 v4, p0

    .line 177
    .line 178
    if-ne v3, v4, :cond_3

    .line 179
    .line 180
    new-instance v1, Lgf4;

    .line 181
    .line 182
    const/16 v2, 0x9

    .line 183
    .line 184
    invoke-direct {v1, v5, v10, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v10, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_3
    invoke-static {v12, v13, v6, v7}, Lax3;->a(JJ)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    sget-object v4, Lbv1;->Z:Lbv1;

    .line 196
    .line 197
    if-eqz v3, :cond_4

    .line 198
    .line 199
    invoke-static {v1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-ne v3, v9, :cond_4

    .line 204
    .line 205
    iget-object v3, v5, Lla;->d:Lrh5;

    .line 206
    .line 207
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    if-ne v3, v4, :cond_4

    .line 212
    .line 213
    new-instance v1, Lgf4;

    .line 214
    .line 215
    const/16 v3, 0xa

    .line 216
    .line 217
    invoke-direct {v1, v5, v10, v3}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 218
    .line 219
    .line 220
    invoke-static {v0, v10, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 221
    .line 222
    .line 223
    new-instance v0, Lso6;

    .line 224
    .line 225
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-direct {v0, v1, v2}, Lso6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v8, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_4
    invoke-static {v12, v13, v14, v15}, Lax3;->a(JJ)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_5

    .line 246
    .line 247
    invoke-static {v1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-ne v1, v9, :cond_5

    .line 252
    .line 253
    iget-object v1, v5, Lla;->d:Lrh5;

    .line 254
    .line 255
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-ne v1, v4, :cond_5

    .line 260
    .line 261
    new-instance v1, Lgf4;

    .line 262
    .line 263
    const/16 v2, 0xb

    .line 264
    .line 265
    invoke-direct {v1, v5, v10, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 266
    .line 267
    .line 268
    invoke-static {v0, v10, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 269
    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_5
    const/4 v4, 0x0

    .line 274
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_0
    move-object/from16 v1, p1

    .line 280
    .line 281
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 282
    .line 283
    if-eqz v1, :cond_6

    .line 284
    .line 285
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;->c()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    goto :goto_2

    .line 290
    :cond_6
    move-object v1, v10

    .line 291
    :goto_2
    check-cast v5, Ljava/lang/String;

    .line 292
    .line 293
    if-nez v1, :cond_7

    .line 294
    .line 295
    const/4 v1, 0x0

    .line 296
    goto :goto_3

    .line 297
    :cond_7
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    :goto_3
    if-eqz v1, :cond_13

    .line 302
    .line 303
    check-cast v0, Ljava/util/List;

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_9

    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    move-object v4, v1

    .line 320
    check-cast v4, Lat1;

    .line 321
    .line 322
    iget-object v4, v4, Lat1;->a:Ljava/lang/String;

    .line 323
    .line 324
    invoke-static {v4, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_8

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_9
    move-object v1, v10

    .line 332
    :goto_4
    check-cast v1, Lat1;

    .line 333
    .line 334
    if-eqz v1, :cond_a

    .line 335
    .line 336
    iget-object v0, v1, Lat1;->d:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 337
    .line 338
    if-eqz v0, :cond_a

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_a
    sget-object v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->SUCCESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 342
    .line 343
    :goto_5
    sget-object v1, Lbn6;->a:[I

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    aget v0, v1, v0

    .line 350
    .line 351
    const/4 v1, 0x1

    .line 352
    if-eq v0, v1, :cond_e

    .line 353
    .line 354
    if-eq v0, v9, :cond_d

    .line 355
    .line 356
    if-eq v0, v11, :cond_d

    .line 357
    .line 358
    if-eq v0, v3, :cond_c

    .line 359
    .line 360
    if-ne v0, v2, :cond_b

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_b
    invoke-static {}, Lb61;->c()V

    .line 364
    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_c
    :goto_6
    const/4 v4, 0x1

    .line 368
    goto :goto_a

    .line 369
    :cond_d
    const/4 v4, 0x0

    .line 370
    goto :goto_a

    .line 371
    :cond_e
    check-cast v8, Lmn6;

    .line 372
    .line 373
    check-cast v7, Ljava/lang/String;

    .line 374
    .line 375
    iget-object v0, v8, Lmn6;->e:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 376
    .line 377
    invoke-static {v0}, Lwv0;->s0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 382
    .line 383
    if-eqz v1, :cond_f

    .line 384
    .line 385
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;->c()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    goto :goto_7

    .line 390
    :cond_f
    move-object v1, v10

    .line 391
    :goto_7
    if-nez v1, :cond_10

    .line 392
    .line 393
    const/4 v1, 0x0

    .line 394
    goto :goto_8

    .line 395
    :cond_10
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    :goto_8
    if-eqz v1, :cond_11

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->clear()V

    .line 402
    .line 403
    .line 404
    :cond_11
    const/4 v1, 0x1

    .line 405
    invoke-virtual {v8, v7, v1}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 406
    .line 407
    .line 408
    const/4 v4, 0x0

    .line 409
    invoke-virtual {v8, v7, v4}, Lmn6;->p(Ljava/lang/String;Z)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-nez v0, :cond_12

    .line 414
    .line 415
    move v0, v4

    .line 416
    goto :goto_9

    .line 417
    :cond_12
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    :goto_9
    if-nez v0, :cond_14

    .line 422
    .line 423
    invoke-virtual {v8, v5, v10}, Lmn6;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_13
    const/4 v1, 0x1

    .line 428
    move v4, v1

    .line 429
    :cond_14
    :goto_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    :goto_b
    return-object v10

    .line 434
    :pswitch_1
    const/4 v1, 0x1

    .line 435
    const/4 v4, 0x0

    .line 436
    check-cast v0, Lb71;

    .line 437
    .line 438
    move-object/from16 v6, p1

    .line 439
    .line 440
    check-cast v6, Lcx3;

    .line 441
    .line 442
    iget-object v6, v6, Lcx3;->a:Landroid/view/KeyEvent;

    .line 443
    .line 444
    check-cast v7, Lum6;

    .line 445
    .line 446
    check-cast v8, Lgn2;

    .line 447
    .line 448
    check-cast v5, Lla;

    .line 449
    .line 450
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v6}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 454
    .line 455
    .line 456
    move-result v12

    .line 457
    invoke-static {v12}, Lpu;->d(I)J

    .line 458
    .line 459
    .line 460
    move-result-wide v12

    .line 461
    sget-wide v14, Lax3;->g:J

    .line 462
    .line 463
    invoke-static {v12, v13, v14, v15}, Lax3;->a(JJ)Z

    .line 464
    .line 465
    .line 466
    move-result v16

    .line 467
    sget-object v1, Lcv1;->X:Lcv1;

    .line 468
    .line 469
    if-eqz v16, :cond_15

    .line 470
    .line 471
    invoke-static {v6}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-ne v4, v9, :cond_15

    .line 476
    .line 477
    iget-object v4, v5, Lla;->d:Lrh5;

    .line 478
    .line 479
    invoke-virtual {v4}, Lrh5;->getValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    if-ne v4, v1, :cond_15

    .line 484
    .line 485
    new-instance v1, Lgf4;

    .line 486
    .line 487
    invoke-direct {v1, v5, v10, v9}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 488
    .line 489
    .line 490
    invoke-static {v0, v10, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 491
    .line 492
    .line 493
    :goto_c
    const/4 v4, 0x1

    .line 494
    goto/16 :goto_d

    .line 495
    .line 496
    :cond_15
    invoke-static {v12, v13, v14, v15}, Lax3;->a(JJ)Z

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    sget-object v2, Lcv1;->Y:Lcv1;

    .line 501
    .line 502
    if-eqz v4, :cond_16

    .line 503
    .line 504
    invoke-static {v6}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    if-ne v4, v9, :cond_16

    .line 509
    .line 510
    iget-object v4, v5, Lla;->d:Lrh5;

    .line 511
    .line 512
    invoke-virtual {v4}, Lrh5;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    if-ne v4, v2, :cond_16

    .line 517
    .line 518
    iget-object v0, v7, Lum6;->c:Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    new-instance v1, Lro7;

    .line 524
    .line 525
    invoke-direct {v1, v0}, Lro7;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v8, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_16
    sget-wide v3, Lax3;->f:J

    .line 533
    .line 534
    invoke-static {v12, v13, v3, v4}, Lax3;->a(JJ)Z

    .line 535
    .line 536
    .line 537
    move-result v17

    .line 538
    if-eqz v17, :cond_17

    .line 539
    .line 540
    invoke-static {v6}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 541
    .line 542
    .line 543
    move-result v10

    .line 544
    if-ne v10, v9, :cond_17

    .line 545
    .line 546
    iget-object v10, v5, Lla;->d:Lrh5;

    .line 547
    .line 548
    invoke-virtual {v10}, Lrh5;->getValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    if-ne v10, v2, :cond_17

    .line 553
    .line 554
    new-instance v1, Lgf4;

    .line 555
    .line 556
    const/4 v2, 0x0

    .line 557
    invoke-direct {v1, v5, v2, v11}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 558
    .line 559
    .line 560
    invoke-static {v0, v2, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 561
    .line 562
    .line 563
    goto :goto_c

    .line 564
    :cond_17
    invoke-static {v12, v13, v3, v4}, Lax3;->a(JJ)Z

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-eqz v2, :cond_18

    .line 569
    .line 570
    invoke-static {v6}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-ne v2, v9, :cond_18

    .line 575
    .line 576
    iget-object v2, v5, Lla;->d:Lrh5;

    .line 577
    .line 578
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    if-ne v2, v1, :cond_18

    .line 583
    .line 584
    new-instance v1, Lgf4;

    .line 585
    .line 586
    const/4 v2, 0x4

    .line 587
    const/4 v3, 0x0

    .line 588
    invoke-direct {v1, v5, v3, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 589
    .line 590
    .line 591
    invoke-static {v0, v3, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 592
    .line 593
    .line 594
    goto :goto_c

    .line 595
    :cond_18
    invoke-static {v12, v13, v3, v4}, Lax3;->a(JJ)Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    sget-object v2, Lcv1;->Z:Lcv1;

    .line 600
    .line 601
    if-eqz v1, :cond_19

    .line 602
    .line 603
    invoke-static {v6}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-ne v1, v9, :cond_19

    .line 608
    .line 609
    iget-object v1, v5, Lla;->d:Lrh5;

    .line 610
    .line 611
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    if-ne v1, v2, :cond_19

    .line 616
    .line 617
    new-instance v1, Lgf4;

    .line 618
    .line 619
    const/4 v2, 0x5

    .line 620
    const/4 v3, 0x0

    .line 621
    invoke-direct {v1, v5, v3, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 622
    .line 623
    .line 624
    invoke-static {v0, v3, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 625
    .line 626
    .line 627
    iget-object v0, v7, Lum6;->c:Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    new-instance v1, Lvo7;

    .line 633
    .line 634
    invoke-direct {v1, v0}, Lvo7;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-interface {v8, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    goto/16 :goto_c

    .line 641
    .line 642
    :cond_19
    invoke-static {v12, v13, v14, v15}, Lax3;->a(JJ)Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-eqz v1, :cond_1a

    .line 647
    .line 648
    invoke-static {v6}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    if-ne v1, v9, :cond_1a

    .line 653
    .line 654
    iget-object v1, v5, Lla;->d:Lrh5;

    .line 655
    .line 656
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    if-ne v1, v2, :cond_1a

    .line 661
    .line 662
    new-instance v1, Lgf4;

    .line 663
    .line 664
    const/4 v2, 0x6

    .line 665
    const/4 v3, 0x0

    .line 666
    invoke-direct {v1, v5, v3, v2}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 667
    .line 668
    .line 669
    invoke-static {v0, v3, v1, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 670
    .line 671
    .line 672
    goto/16 :goto_c

    .line 673
    .line 674
    :cond_1a
    const/4 v4, 0x0

    .line 675
    :goto_d
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    return-object v0

    .line 680
    nop

    .line 681
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

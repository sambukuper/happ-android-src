.class public final synthetic Lzw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lzw2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzw2;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lzw2;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Lzw2;->X:B

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    const/high16 v6, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const-wide v7, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const/16 v10, 0x8

    .line 19
    .line 20
    const/4 v11, 0x2

    .line 21
    const/4 v12, 0x1

    .line 22
    const/4 v13, 0x0

    .line 23
    const/4 v14, 0x0

    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 30
    .line 31
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    sget v3, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v3, v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    iget-object v3, v3, Ls6;->H0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 47
    .line 48
    invoke-virtual {v2}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v2, v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->S0:Ljava/lang/String;

    .line 53
    .line 54
    sget-object v5, Lmn6;->j:Lvz7;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v5, Lm40;

    .line 63
    .line 64
    const/16 v6, 0x13

    .line 65
    .line 66
    invoke-direct {v5, v1, v6}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v2, v14, v5}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-nez v2, :cond_0

    .line 74
    .line 75
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->e()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_0
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Ldn8;->a:Ldn8;

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_1
    const-string v0, "binding"

    .line 86
    .line 87
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v14

    .line 91
    :pswitch_0
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lpv3;

    .line 94
    .line 95
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Llw5;

    .line 98
    .line 99
    check-cast v1, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast v2, Lgn2;

    .line 105
    .line 106
    new-instance v3, Lio6;

    .line 107
    .line 108
    check-cast v0, Lkw5;

    .line 109
    .line 110
    iget-object v0, v0, Lkw5;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-direct {v3, v1, v0}, Lio6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v2, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget-object v0, Ldn8;->a:Ldn8;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_1
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Lgn2;

    .line 124
    .line 125
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lvo6;

    .line 128
    .line 129
    check-cast v1, Lbv1;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    if-eq v1, v12, :cond_3

    .line 141
    .line 142
    if-ne v1, v11, :cond_2

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    :goto_0
    iget-object v0, v0, Lvo6;->c:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v1, Lno6;

    .line 155
    .line 156
    invoke-direct {v1, v0}, Lno6;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :cond_4
    sget-object v14, Ldn8;->a:Ldn8;

    .line 163
    .line 164
    :goto_1
    return-object v14

    .line 165
    :pswitch_2
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v2, Lgn2;

    .line 168
    .line 169
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Lum6;

    .line 172
    .line 173
    check-cast v1, Lcv1;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    if-eq v1, v12, :cond_6

    .line 185
    .line 186
    if-ne v1, v11, :cond_5

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_5
    invoke-static {}, Lb61;->c()V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    :goto_2
    iget-object v0, v0, Lum6;->c:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v1, Lto7;

    .line 199
    .line 200
    invoke-direct {v1, v0}, Lto7;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :cond_7
    sget-object v14, Ldn8;->a:Ldn8;

    .line 207
    .line 208
    :goto_3
    return-object v14

    .line 209
    :pswitch_3
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, Lp86;

    .line 212
    .line 213
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Ljava/lang/Throwable;

    .line 216
    .line 217
    check-cast v1, Ljava/lang/Throwable;

    .line 218
    .line 219
    iget-object v3, v2, Lp86;->c:Ljava/lang/Object;

    .line 220
    .line 221
    monitor-enter v3

    .line 222
    if-eqz v0, :cond_9

    .line 223
    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    :try_start_0
    instance-of v4, v1, Ljava/util/concurrent/CancellationException;

    .line 227
    .line 228
    if-nez v4, :cond_8

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_8
    move-object v1, v14

    .line 232
    :goto_4
    if-eqz v1, :cond_a

    .line 233
    .line 234
    invoke-static {v0, v1}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    goto :goto_6

    .line 240
    :cond_9
    move-object v0, v14

    .line 241
    :cond_a
    :goto_5
    iput-object v0, v2, Lp86;->e:Ljava/lang/Throwable;

    .line 242
    .line 243
    iget-object v0, v2, Lp86;->u:Loh7;

    .line 244
    .line 245
    sget-object v1, Lm86;->X:Lm86;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v14, v1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    .line 252
    .line 253
    monitor-exit v3

    .line 254
    sget-object v0, Ldn8;->a:Ldn8;

    .line 255
    .line 256
    return-object v0

    .line 257
    :goto_6
    monitor-exit v3

    .line 258
    throw v0

    .line 259
    :pswitch_4
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v2, Lr01;

    .line 262
    .line 263
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lt05;

    .line 266
    .line 267
    invoke-virtual {v2, v1}, Lr01;->z(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    if-eqz v0, :cond_b

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Lt05;->a(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    :cond_b
    sget-object v0, Ldn8;->a:Ldn8;

    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_5
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v2, Llh7;

    .line 281
    .line 282
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Llh7;

    .line 285
    .line 286
    move-object v10, v1

    .line 287
    check-cast v10, Lsv1;

    .line 288
    .line 289
    const/high16 v1, 0x40000000    # 2.0f

    .line 290
    .line 291
    invoke-interface {v10, v1}, Lfi1;->h0(F)F

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    check-cast v3, Ldw0;

    .line 300
    .line 301
    iget-wide v11, v3, Ldw0;->a:J

    .line 302
    .line 303
    sget v3, Loc;->p:F

    .line 304
    .line 305
    div-float/2addr v3, v1

    .line 306
    invoke-interface {v10, v3}, Lfi1;->h0(F)F

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    div-float v1, v4, v1

    .line 311
    .line 312
    sub-float v13, v3, v1

    .line 313
    .line 314
    new-instance v16, Lom7;

    .line 315
    .line 316
    const/4 v7, 0x0

    .line 317
    const/16 v8, 0x1e

    .line 318
    .line 319
    const/4 v5, 0x0

    .line 320
    const/4 v6, 0x0

    .line 321
    move-object/from16 v3, v16

    .line 322
    .line 323
    invoke-direct/range {v3 .. v8}, Lom7;-><init>(FFIII)V

    .line 324
    .line 325
    .line 326
    const/16 v17, 0x6c

    .line 327
    .line 328
    const-wide/16 v14, 0x0

    .line 329
    .line 330
    invoke-static/range {v10 .. v17}, Lsv1;->o0(Lsv1;JFJLtv1;I)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    check-cast v3, Lkt1;

    .line 338
    .line 339
    iget v3, v3, Lkt1;->X:F

    .line 340
    .line 341
    invoke-static {v3, v9}, Lkt1;->a(FF)I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-lez v3, :cond_c

    .line 346
    .line 347
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Ldw0;

    .line 352
    .line 353
    iget-wide v11, v2, Ldw0;->a:J

    .line 354
    .line 355
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Lkt1;

    .line 360
    .line 361
    iget v0, v0, Lkt1;->X:F

    .line 362
    .line 363
    invoke-interface {v10, v0}, Lfi1;->h0(F)F

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    sub-float v13, v0, v1

    .line 368
    .line 369
    sget-object v16, Lea2;->a:Lea2;

    .line 370
    .line 371
    const/16 v17, 0x6c

    .line 372
    .line 373
    const-wide/16 v14, 0x0

    .line 374
    .line 375
    invoke-static/range {v10 .. v17}, Lsv1;->o0(Lsv1;JFJLtv1;I)V

    .line 376
    .line 377
    .line 378
    :cond_c
    sget-object v0, Ldn8;->a:Ldn8;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_6
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v2, Lgs5;

    .line 384
    .line 385
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v0, Lfs5;

    .line 388
    .line 389
    check-cast v1, Lqr6;

    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v2, v2, Lgs5;->b:Loi1;

    .line 395
    .line 396
    invoke-virtual {v2, v1, v0}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    sget-object v0, Ldn8;->a:Ldn8;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_7
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v2, Lfg5;

    .line 405
    .line 406
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v0, Leo5;

    .line 409
    .line 410
    check-cast v1, Ldo5;

    .line 411
    .line 412
    iget-boolean v3, v2, Lfg5;->u0:Z

    .line 413
    .line 414
    iget v4, v2, Lfg5;->q0:F

    .line 415
    .line 416
    if-eqz v3, :cond_d

    .line 417
    .line 418
    invoke-interface {v1, v4}, Lfi1;->x0(F)I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    iget v2, v2, Lfg5;->r0:F

    .line 423
    .line 424
    invoke-interface {v1, v2}, Lfi1;->x0(F)I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-static {v1, v0, v3, v2}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_d
    invoke-interface {v1, v4}, Lfi1;->x0(F)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    iget v2, v2, Lfg5;->r0:F

    .line 437
    .line 438
    invoke-interface {v1, v2}, Lfi1;->x0(F)I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    invoke-static {v1, v0, v3, v2}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 443
    .line 444
    .line 445
    :goto_7
    sget-object v0, Ldn8;->a:Ldn8;

    .line 446
    .line 447
    return-object v0

    .line 448
    :pswitch_8
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v2, Li95;

    .line 451
    .line 452
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 453
    .line 454
    move-object v10, v0

    .line 455
    check-cast v10, Leo5;

    .line 456
    .line 457
    move-object v9, v1

    .line 458
    check-cast v9, Ldo5;

    .line 459
    .line 460
    iget-object v0, v2, Li95;->q0:Lgn2;

    .line 461
    .line 462
    invoke-interface {v0, v9}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, Lhf3;

    .line 467
    .line 468
    iget-wide v0, v0, Lhf3;->a:J

    .line 469
    .line 470
    iget-boolean v2, v2, Li95;->r0:Z

    .line 471
    .line 472
    const/16 v3, 0x20

    .line 473
    .line 474
    if-eqz v2, :cond_e

    .line 475
    .line 476
    shr-long v2, v0, v3

    .line 477
    .line 478
    long-to-int v2, v2

    .line 479
    and-long/2addr v0, v7

    .line 480
    long-to-int v0, v0

    .line 481
    invoke-static {v9, v10, v2, v0}, Ldo5;->j(Ldo5;Leo5;II)V

    .line 482
    .line 483
    .line 484
    goto :goto_8

    .line 485
    :cond_e
    shr-long v2, v0, v3

    .line 486
    .line 487
    long-to-int v11, v2

    .line 488
    and-long/2addr v0, v7

    .line 489
    long-to-int v12, v0

    .line 490
    const/4 v13, 0x0

    .line 491
    const/16 v14, 0xc

    .line 492
    .line 493
    invoke-static/range {v9 .. v14}, Ldo5;->k(Ldo5;Leo5;IILgn2;I)V

    .line 494
    .line 495
    .line 496
    :goto_8
    sget-object v0, Ldn8;->a:Ldn8;

    .line 497
    .line 498
    return-object v0

    .line 499
    :pswitch_9
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v2, Log7;

    .line 502
    .line 503
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Lkv5;

    .line 506
    .line 507
    check-cast v1, Lx31;

    .line 508
    .line 509
    invoke-virtual {v2, v14}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v1}, Lkv5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    sget-object v0, Ldn8;->a:Ldn8;

    .line 516
    .line 517
    return-object v0

    .line 518
    :pswitch_a
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v2, Ljz4;

    .line 521
    .line 522
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Ln17;

    .line 525
    .line 526
    iget-object v2, v2, Ljz4;->g0:Ljava/util/ArrayList;

    .line 527
    .line 528
    new-instance v3, Lgz4;

    .line 529
    .line 530
    invoke-direct {v3, v0, v1}, Lgz4;-><init>(Ln17;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    sget-object v0, Ldn8;->a:Ldn8;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_b
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v2, Lo87;

    .line 542
    .line 543
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, Loi;

    .line 546
    .line 547
    check-cast v1, Lpk6;

    .line 548
    .line 549
    iget-object v2, v2, Lo87;->d:Lt5;

    .line 550
    .line 551
    iget-object v2, v2, Lt5;->k0:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v2, Lnh5;

    .line 554
    .line 555
    invoke-virtual {v2}, Lnh5;->l()F

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    iget-wide v3, v1, Lpk6;->t0:J

    .line 560
    .line 561
    and-long/2addr v3, v7

    .line 562
    long-to-int v3, v3

    .line 563
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-nez v4, :cond_10

    .line 572
    .line 573
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    if-nez v4, :cond_10

    .line 578
    .line 579
    cmpg-float v4, v3, v9

    .line 580
    .line 581
    if-nez v4, :cond_f

    .line 582
    .line 583
    goto :goto_9

    .line 584
    :cond_f
    invoke-virtual {v0}, Loi;->d()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    check-cast v0, Ljava/lang/Number;

    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    invoke-static {v1, v0}, Lzw4;->d(Lpk6;F)F

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    invoke-virtual {v1, v4}, Lpk6;->g(F)V

    .line 599
    .line 600
    .line 601
    invoke-static {v1, v0}, Lzw4;->e(Lpk6;F)F

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    invoke-virtual {v1, v0}, Lpk6;->h(F)V

    .line 606
    .line 607
    .line 608
    add-float/2addr v2, v3

    .line 609
    div-float/2addr v2, v3

    .line 610
    const/high16 v0, 0x3f000000    # 0.5f

    .line 611
    .line 612
    invoke-static {v0, v2}, Lpn7;->h(FF)J

    .line 613
    .line 614
    .line 615
    move-result-wide v2

    .line 616
    invoke-virtual {v1, v2, v3}, Lpk6;->m(J)V

    .line 617
    .line 618
    .line 619
    :cond_10
    :goto_9
    sget-object v0, Ldn8;->a:Ldn8;

    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_c
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v2, Ljava/lang/String;

    .line 625
    .line 626
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast v0, Ldn2;

    .line 629
    .line 630
    check-cast v1, Lf17;

    .line 631
    .line 632
    sget-object v3, Ld17;->a:[Lnw3;

    .line 633
    .line 634
    sget-object v3, Lc17;->u:Le17;

    .line 635
    .line 636
    sget-object v4, Ld17;->a:[Lnw3;

    .line 637
    .line 638
    const/16 v5, 0xb

    .line 639
    .line 640
    aget-object v4, v4, v5

    .line 641
    .line 642
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-interface {v1, v3, v4}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    invoke-static {v1, v2}, Ld17;->b(Lf17;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    new-instance v2, Lmv2;

    .line 656
    .line 657
    invoke-direct {v2, v0, v12}, Lmv2;-><init>(Ldn2;B)V

    .line 658
    .line 659
    .line 660
    sget-object v0, Ls07;->b:Le17;

    .line 661
    .line 662
    new-instance v3, Lq3;

    .line 663
    .line 664
    invoke-direct {v3, v14, v2}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 665
    .line 666
    .line 667
    invoke-interface {v1, v0, v3}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    sget-object v0, Ldn8;->a:Ldn8;

    .line 671
    .line 672
    return-object v0

    .line 673
    :pswitch_d
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v2, Lnm4;

    .line 676
    .line 677
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v0, Ljava/lang/String;

    .line 680
    .line 681
    check-cast v1, Ljava/lang/Long;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v2, v0, v1}, Lnm4;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    sget-object v0, Ldn8;->a:Ldn8;

    .line 690
    .line 691
    return-object v0

    .line 692
    :pswitch_e
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v2, Lnn1;

    .line 695
    .line 696
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 699
    .line 700
    check-cast v1, Ljava/lang/String;

    .line 701
    .line 702
    sget v3, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 703
    .line 704
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2}, Lqk2;->h()Lg94;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    invoke-static {v2}, Lys0;->z(Lg94;)Lu84;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    sget-object v3, Ltp1;->a:Lnf1;

    .line 716
    .line 717
    sget-object v3, Ldm4;->a:Lhv2;

    .line 718
    .line 719
    new-instance v4, Lbk4;

    .line 720
    .line 721
    invoke-direct {v4, v0, v1, v14, v11}, Lbk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 722
    .line 723
    .line 724
    invoke-static {v2, v3, v14, v4, v11}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 725
    .line 726
    .line 727
    sget-object v0, Ldn8;->a:Ldn8;

    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_f
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v2, Ljava/lang/String;

    .line 733
    .line 734
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 737
    .line 738
    check-cast v1, Ljava/io/PrintWriter;

    .line 739
    .line 740
    sget v3, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 741
    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    sget-object v3, Lkw4;->a:Lkw4;

    .line 746
    .line 747
    invoke-static {v2}, Lkw4;->a(Ljava/lang/String;)I

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    new-instance v3, Ljava/util/Date;

    .line 752
    .line 753
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 754
    .line 755
    .line 756
    if-eqz v0, :cond_11

    .line 757
    .line 758
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v14

    .line 762
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    const-string v3, " Sub "

    .line 771
    .line 772
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    const-string v3, " servers: "

    .line 779
    .line 780
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    const-string v2, " servers"

    .line 787
    .line 788
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    sget-object v0, Ldn8;->a:Ldn8;

    .line 799
    .line 800
    return-object v0

    .line 801
    :pswitch_10
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v2, Lgn2;

    .line 804
    .line 805
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v0, Llf4;

    .line 808
    .line 809
    check-cast v1, Ldv1;

    .line 810
    .line 811
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    if-eqz v1, :cond_13

    .line 819
    .line 820
    if-ne v1, v12, :cond_12

    .line 821
    .line 822
    iget-object v0, v0, Llf4;->b:Ljava/lang/String;

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    new-instance v1, Lzf4;

    .line 828
    .line 829
    invoke-direct {v1, v0}, Lzf4;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-interface {v2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    goto :goto_a

    .line 836
    :cond_12
    invoke-static {}, Lb61;->c()V

    .line 837
    .line 838
    .line 839
    goto :goto_b

    .line 840
    :cond_13
    :goto_a
    sget-object v14, Ldn8;->a:Ldn8;

    .line 841
    .line 842
    :goto_b
    return-object v14

    .line 843
    :pswitch_11
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v2, Ljava/util/List;

    .line 846
    .line 847
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v0, Lcb4;

    .line 850
    .line 851
    check-cast v1, Ldo5;

    .line 852
    .line 853
    iget-object v0, v0, Lcb4;->b:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v0, Ldn2;

    .line 856
    .line 857
    invoke-static {v2, v0}, Lwl7;->R(Ljava/util/List;Ldn2;)Ljava/util/ArrayList;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    if-eqz v0, :cond_15

    .line 862
    .line 863
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    :goto_c
    if-ge v13, v2, :cond_15

    .line 868
    .line 869
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v3

    .line 873
    check-cast v3, Lqg5;

    .line 874
    .line 875
    iget-object v6, v3, Lqg5;->X:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v6, Leo5;

    .line 878
    .line 879
    iget-object v3, v3, Lqg5;->Y:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v3, Ldn2;

    .line 882
    .line 883
    if-eqz v3, :cond_14

    .line 884
    .line 885
    invoke-interface {v3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    check-cast v3, Lhf3;

    .line 890
    .line 891
    iget-wide v7, v3, Lhf3;->a:J

    .line 892
    .line 893
    goto :goto_d

    .line 894
    :cond_14
    move-wide v7, v4

    .line 895
    :goto_d
    invoke-static {v1, v6, v7, v8}, Ldo5;->g(Ldo5;Leo5;J)V

    .line 896
    .line 897
    .line 898
    add-int/lit8 v13, v13, 0x1

    .line 899
    .line 900
    goto :goto_c

    .line 901
    :cond_15
    sget-object v0, Ldn8;->a:Ldn8;

    .line 902
    .line 903
    return-object v0

    .line 904
    :pswitch_12
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v2, Lkv6;

    .line 907
    .line 908
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v0, Ljv6;

    .line 911
    .line 912
    check-cast v1, Ljava/util/Map;

    .line 913
    .line 914
    new-instance v3, Lo74;

    .line 915
    .line 916
    invoke-direct {v3, v2, v1, v0}, Lo74;-><init>(Lkv6;Ljava/util/Map;Ljv6;)V

    .line 917
    .line 918
    .line 919
    return-object v3

    .line 920
    :pswitch_13
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v2, Lo74;

    .line 923
    .line 924
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v1, Leq1;

    .line 927
    .line 928
    iget-object v1, v2, Lo74;->Z:Lt05;

    .line 929
    .line 930
    invoke-virtual {v1, v0}, Lt05;->i(Ljava/lang/Object;)V

    .line 931
    .line 932
    .line 933
    new-instance v1, Lp00;

    .line 934
    .line 935
    invoke-direct {v1, v2, v0, v11}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 936
    .line 937
    .line 938
    return-object v1

    .line 939
    :pswitch_14
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v2, Lnc3;

    .line 942
    .line 943
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast v0, Llc3;

    .line 946
    .line 947
    check-cast v1, Leq1;

    .line 948
    .line 949
    iget-object v1, v2, Lnc3;->a:Lc15;

    .line 950
    .line 951
    invoke-virtual {v1, v0}, Lc15;->b(Ljava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    iget-object v1, v2, Lnc3;->b:Lrh5;

    .line 955
    .line 956
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 957
    .line 958
    invoke-virtual {v1, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    new-instance v1, Lp00;

    .line 962
    .line 963
    invoke-direct {v1, v2, v0, v12}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 964
    .line 965
    .line 966
    return-object v1

    .line 967
    :pswitch_15
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 968
    .line 969
    move-object v4, v2

    .line 970
    check-cast v4, Llf;

    .line 971
    .line 972
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 973
    .line 974
    check-cast v0, Lwb3;

    .line 975
    .line 976
    move-object v3, v1

    .line 977
    check-cast v3, Lp34;

    .line 978
    .line 979
    invoke-virtual {v3}, Lp34;->a()V

    .line 980
    .line 981
    .line 982
    new-instance v5, Lfe7;

    .line 983
    .line 984
    iget-object v0, v0, Lwb3;->A0:Loi;

    .line 985
    .line 986
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    invoke-virtual {v0}, Loi;->d()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    check-cast v0, Ldw0;

    .line 994
    .line 995
    iget-wide v0, v0, Ldw0;->a:J

    .line 996
    .line 997
    invoke-direct {v5, v0, v1}, Lfe7;-><init>(J)V

    .line 998
    .line 999
    .line 1000
    const/4 v7, 0x0

    .line 1001
    const/16 v8, 0x3c

    .line 1002
    .line 1003
    const/4 v6, 0x0

    .line 1004
    invoke-static/range {v3 .. v8}, Lsv1;->d0(Lsv1;Llf;Ld90;FLom7;I)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_16
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v2, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 1013
    .line 1014
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v0, Lzo8;

    .line 1017
    .line 1018
    check-cast v1, Lja3;

    .line 1019
    .line 1020
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->h()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    if-eqz v3, :cond_1a

    .line 1025
    .line 1026
    new-instance v0, Lfa3;

    .line 1027
    .line 1028
    instance-of v2, v1, Lia3;

    .line 1029
    .line 1030
    if-eqz v2, :cond_16

    .line 1031
    .line 1032
    goto :goto_e

    .line 1033
    :cond_16
    instance-of v2, v1, Lha3;

    .line 1034
    .line 1035
    if-eqz v2, :cond_17

    .line 1036
    .line 1037
    check-cast v1, Lha3;

    .line 1038
    .line 1039
    iget-boolean v12, v1, Lha3;->b:Z

    .line 1040
    .line 1041
    goto :goto_e

    .line 1042
    :cond_17
    instance-of v2, v1, Lga3;

    .line 1043
    .line 1044
    if-eqz v2, :cond_18

    .line 1045
    .line 1046
    check-cast v1, Lga3;

    .line 1047
    .line 1048
    iget-boolean v12, v1, Lga3;->c:Z

    .line 1049
    .line 1050
    goto :goto_e

    .line 1051
    :cond_18
    instance-of v2, v1, Lfa3;

    .line 1052
    .line 1053
    if-eqz v2, :cond_19

    .line 1054
    .line 1055
    check-cast v1, Lfa3;

    .line 1056
    .line 1057
    iget-boolean v12, v1, Lfa3;->a:Z

    .line 1058
    .line 1059
    :goto_e
    invoke-direct {v0, v12, v13}, Lfa3;-><init>(ZZ)V

    .line 1060
    .line 1061
    .line 1062
    move-object v14, v0

    .line 1063
    goto :goto_10

    .line 1064
    :cond_19
    invoke-static {}, Lb61;->c()V

    .line 1065
    .line 1066
    .line 1067
    goto :goto_10

    .line 1068
    :cond_1a
    new-instance v3, Lga3;

    .line 1069
    .line 1070
    instance-of v4, v1, Lia3;

    .line 1071
    .line 1072
    if-eqz v4, :cond_1b

    .line 1073
    .line 1074
    goto :goto_f

    .line 1075
    :cond_1b
    instance-of v4, v1, Lha3;

    .line 1076
    .line 1077
    if-eqz v4, :cond_1c

    .line 1078
    .line 1079
    check-cast v1, Lha3;

    .line 1080
    .line 1081
    iget-boolean v12, v1, Lha3;->b:Z

    .line 1082
    .line 1083
    goto :goto_f

    .line 1084
    :cond_1c
    instance-of v4, v1, Lga3;

    .line 1085
    .line 1086
    if-eqz v4, :cond_1d

    .line 1087
    .line 1088
    check-cast v1, Lga3;

    .line 1089
    .line 1090
    iget-boolean v12, v1, Lga3;->c:Z

    .line 1091
    .line 1092
    goto :goto_f

    .line 1093
    :cond_1d
    instance-of v4, v1, Lfa3;

    .line 1094
    .line 1095
    if-eqz v4, :cond_1e

    .line 1096
    .line 1097
    check-cast v1, Lfa3;

    .line 1098
    .line 1099
    iget-boolean v12, v1, Lfa3;->a:Z

    .line 1100
    .line 1101
    :goto_f
    invoke-direct {v3, v0, v2, v12, v13}, Lga3;-><init>(Lzo8;Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;ZZ)V

    .line 1102
    .line 1103
    .line 1104
    move-object v14, v3

    .line 1105
    goto :goto_10

    .line 1106
    :cond_1e
    invoke-static {}, Lb61;->c()V

    .line 1107
    .line 1108
    .line 1109
    :goto_10
    return-object v14

    .line 1110
    :pswitch_17
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 1113
    .line 1114
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v0, Landroid/content/Context;

    .line 1117
    .line 1118
    check-cast v1, Landroid/content/res/TypedArray;

    .line 1119
    .line 1120
    sget v3, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;->i0:I

    .line 1121
    .line 1122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1123
    .line 1124
    .line 1125
    iget-object v3, v2, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;->f0:Landroid/widget/TextView;

    .line 1126
    .line 1127
    sget v4, Lx56;->HappToggleField_title:I

    .line 1128
    .line 1129
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v4

    .line 1133
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1134
    .line 1135
    .line 1136
    sget v4, Lx56;->HappToggleField_titleColor:I

    .line 1137
    .line 1138
    sget v5, Lv26;->settingsText:I

    .line 1139
    .line 1140
    invoke-static {v0, v5}, Los4;->q(Landroid/content/Context;I)I

    .line 1141
    .line 1142
    .line 1143
    move-result v0

    .line 1144
    invoke-virtual {v1, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1149
    .line 1150
    .line 1151
    sget v0, Lx56;->HappToggleField_description:I

    .line 1152
    .line 1153
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    iget-object v3, v2, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;->h0:Landroid/widget/TextView;

    .line 1158
    .line 1159
    if-eqz v0, :cond_1f

    .line 1160
    .line 1161
    move v10, v13

    .line 1162
    :cond_1f
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1166
    .line 1167
    .line 1168
    iget-object v0, v2, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;->g0:Landroidx/appcompat/widget/SwitchCompat;

    .line 1169
    .line 1170
    sget v2, Lx56;->HappToggleField_checked:I

    .line 1171
    .line 1172
    invoke-virtual {v1, v2, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v1

    .line 1176
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1177
    .line 1178
    .line 1179
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1180
    .line 1181
    return-object v0

    .line 1182
    :pswitch_18
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1183
    .line 1184
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 1185
    .line 1186
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1187
    .line 1188
    check-cast v0, Landroid/content/Context;

    .line 1189
    .line 1190
    check-cast v1, Landroid/content/res/TypedArray;

    .line 1191
    .line 1192
    sget v4, Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;->i0:I

    .line 1193
    .line 1194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    iget-object v4, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;->f0:Landroid/widget/TextView;

    .line 1198
    .line 1199
    iget-object v5, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;->g0:Lsu/happ/proxyutility/ui/widget/CustomSpinner;

    .line 1200
    .line 1201
    sget v6, Lx56;->HappSpinnerField_title:I

    .line 1202
    .line 1203
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v6

    .line 1207
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1208
    .line 1209
    .line 1210
    sget v6, Lx56;->HappSpinnerField_titleColor:I

    .line 1211
    .line 1212
    sget v7, Lv26;->settingsText:I

    .line 1213
    .line 1214
    invoke-static {v0, v7}, Los4;->q(Landroid/content/Context;I)I

    .line 1215
    .line 1216
    .line 1217
    move-result v7

    .line 1218
    invoke-virtual {v1, v6, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1219
    .line 1220
    .line 1221
    move-result v6

    .line 1222
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1223
    .line 1224
    .line 1225
    iget-object v4, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;->h0:Landroid/widget/TextView;

    .line 1226
    .line 1227
    sget v6, Lx56;->HappSpinnerField_description:I

    .line 1228
    .line 1229
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v6

    .line 1233
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1234
    .line 1235
    .line 1236
    sget v6, Lx56;->HappForwardField_description:I

    .line 1237
    .line 1238
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v6

    .line 1242
    if-eqz v6, :cond_20

    .line 1243
    .line 1244
    move v10, v13

    .line 1245
    :cond_20
    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1249
    .line 1250
    .line 1251
    sget v4, Lx56;->HappSpinnerField_entries:I

    .line 1252
    .line 1253
    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1254
    .line 1255
    .line 1256
    move-result v1

    .line 1257
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    if-eq v1, v3, :cond_21

    .line 1262
    .line 1263
    goto :goto_11

    .line 1264
    :cond_21
    move-object v4, v14

    .line 1265
    :goto_11
    if-eqz v4, :cond_22

    .line 1266
    .line 1267
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v1

    .line 1271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1275
    .line 1276
    .line 1277
    move-result v2

    .line 1278
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v14

    .line 1282
    :cond_22
    if-eqz v14, :cond_23

    .line 1283
    .line 1284
    new-instance v1, Lrf7;

    .line 1285
    .line 1286
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v2

    .line 1290
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1291
    .line 1292
    .line 1293
    invoke-direct {v1, v0, v2, v5, v14}, Lrf7;-><init>(Landroid/content/Context;Landroid/view/LayoutInflater;Lsu/happ/proxyutility/ui/widget/CustomSpinner;[Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v5, v1}, Landroid/widget/AbsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 1297
    .line 1298
    .line 1299
    :cond_23
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1300
    .line 1301
    return-object v0

    .line 1302
    :pswitch_19
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappSliderField;

    .line 1305
    .line 1306
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1307
    .line 1308
    check-cast v0, Landroid/content/Context;

    .line 1309
    .line 1310
    check-cast v1, Landroid/content/res/TypedArray;

    .line 1311
    .line 1312
    sget v4, Lsu/happ/proxyutility/ui/foundation/component/HappSliderField;->j0:I

    .line 1313
    .line 1314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    sget v4, Lx56;->HappSliderField_description:I

    .line 1318
    .line 1319
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v4

    .line 1323
    iget-object v5, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSliderField;->i0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1324
    .line 1325
    iget-object v7, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSliderField;->f0:Lcom/google/android/material/slider/Slider;

    .line 1326
    .line 1327
    if-eqz v4, :cond_24

    .line 1328
    .line 1329
    move v10, v13

    .line 1330
    :cond_24
    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1334
    .line 1335
    .line 1336
    sget v4, Lx56;->HappSliderField_valueFrom:I

    .line 1337
    .line 1338
    invoke-virtual {v1, v4, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 1339
    .line 1340
    .line 1341
    move-result v4

    .line 1342
    invoke-virtual {v7, v4}, Lcom/google/android/material/slider/Slider;->setValueFrom(F)V

    .line 1343
    .line 1344
    .line 1345
    sget v4, Lx56;->HappSliderField_valueTo:I

    .line 1346
    .line 1347
    const/high16 v5, 0x42c80000    # 100.0f

    .line 1348
    .line 1349
    invoke-virtual {v1, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 1350
    .line 1351
    .line 1352
    move-result v4

    .line 1353
    invoke-virtual {v7, v4}, Lcom/google/android/material/slider/Slider;->setValueTo(F)V

    .line 1354
    .line 1355
    .line 1356
    sget v4, Lx56;->HappSliderField_progress:I

    .line 1357
    .line 1358
    invoke-virtual {v1, v4, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 1359
    .line 1360
    .line 1361
    move-result v4

    .line 1362
    invoke-virtual {v7}, Lcom/google/android/material/slider/Slider;->getValueFrom()F

    .line 1363
    .line 1364
    .line 1365
    move-result v5

    .line 1366
    invoke-virtual {v7}, Lcom/google/android/material/slider/Slider;->getValueTo()F

    .line 1367
    .line 1368
    .line 1369
    move-result v8

    .line 1370
    invoke-static {v4, v5, v8}, Lx97;->m(FFF)F

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    invoke-virtual {v7, v4}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 1375
    .line 1376
    .line 1377
    sget v4, Lx56;->HappSliderField_stepSize:I

    .line 1378
    .line 1379
    invoke-virtual {v1, v4, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 1380
    .line 1381
    .line 1382
    move-result v4

    .line 1383
    invoke-virtual {v7, v4}, Lcom/google/android/material/slider/Slider;->setStepSize(F)V

    .line 1384
    .line 1385
    .line 1386
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    invoke-virtual {v7, v3}, Lcom/google/android/material/slider/Slider;->setTickActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 1391
    .line 1392
    .line 1393
    const/high16 v3, -0x1000000

    .line 1394
    .line 1395
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v3

    .line 1399
    invoke-virtual {v7, v3}, Lcom/google/android/material/slider/Slider;->setTickInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 1400
    .line 1401
    .line 1402
    sget v3, Lv26;->colorButtonGrey:I

    .line 1403
    .line 1404
    invoke-static {v0, v3}, Los4;->q(Landroid/content/Context;I)I

    .line 1405
    .line 1406
    .line 1407
    move-result v3

    .line 1408
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v3

    .line 1412
    invoke-virtual {v7, v3}, Lcom/google/android/material/slider/Slider;->setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 1413
    .line 1414
    .line 1415
    sget v3, Lv26;->colorButtonPrimary:I

    .line 1416
    .line 1417
    invoke-static {v0, v3}, Los4;->q(Landroid/content/Context;I)I

    .line 1418
    .line 1419
    .line 1420
    move-result v3

    .line 1421
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v3

    .line 1425
    invoke-virtual {v7, v3}, Lcom/google/android/material/slider/Slider;->setTrackActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 1426
    .line 1427
    .line 1428
    sget v3, Lv26;->colorButtonPrimary:I

    .line 1429
    .line 1430
    invoke-static {v0, v3}, Los4;->q(Landroid/content/Context;I)I

    .line 1431
    .line 1432
    .line 1433
    move-result v0

    .line 1434
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-virtual {v7, v0}, Lcom/google/android/material/slider/Slider;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 1439
    .line 1440
    .line 1441
    sget v0, Lx56;->HappSliderField_valueFromLabel:I

    .line 1442
    .line 1443
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    iget-object v3, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSliderField;->g0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1448
    .line 1449
    if-eqz v0, :cond_25

    .line 1450
    .line 1451
    goto :goto_12

    .line 1452
    :cond_25
    invoke-virtual {v7}, Lcom/google/android/material/slider/Slider;->getValueFrom()F

    .line 1453
    .line 1454
    .line 1455
    move-result v0

    .line 1456
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    :goto_12
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1461
    .line 1462
    .line 1463
    sget v0, Lx56;->HappSliderField_valueToLabel:I

    .line 1464
    .line 1465
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v0

    .line 1469
    iget-object v1, v2, Lsu/happ/proxyutility/ui/foundation/component/HappSliderField;->h0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1470
    .line 1471
    if-eqz v0, :cond_26

    .line 1472
    .line 1473
    goto :goto_13

    .line 1474
    :cond_26
    invoke-virtual {v7}, Lcom/google/android/material/slider/Slider;->getValueTo()F

    .line 1475
    .line 1476
    .line 1477
    move-result v0

    .line 1478
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    :goto_13
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1483
    .line 1484
    .line 1485
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1486
    .line 1487
    return-object v0

    .line 1488
    :pswitch_1a
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v2, Ls86;

    .line 1491
    .line 1492
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1493
    .line 1494
    check-cast v0, Llh7;

    .line 1495
    .line 1496
    move-object v14, v1

    .line 1497
    check-cast v14, Lsv1;

    .line 1498
    .line 1499
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1500
    .line 1501
    .line 1502
    invoke-interface {v14}, Lsv1;->n0()Llr;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    invoke-virtual {v1}, Llr;->k()Lsm0;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v6

    .line 1510
    invoke-interface {v14}, Lsv1;->e()J

    .line 1511
    .line 1512
    .line 1513
    move-result-wide v7

    .line 1514
    invoke-static {v4, v5, v7, v8}, Lu70;->n(JJ)Ls86;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v1

    .line 1518
    invoke-static {}, Lu15;->c()Ldf;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v3

    .line 1522
    invoke-interface {v6, v1, v3}, Lsm0;->r(Ls86;Ldf;)V

    .line 1523
    .line 1524
    .line 1525
    sget-wide v3, Ldw0;->b:J

    .line 1526
    .line 1527
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    check-cast v0, Ljava/lang/Number;

    .line 1532
    .line 1533
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1534
    .line 1535
    .line 1536
    move-result v0

    .line 1537
    invoke-static {v0, v3, v4}, Ldw0;->b(FJ)J

    .line 1538
    .line 1539
    .line 1540
    move-result-wide v15

    .line 1541
    const/16 v21, 0x0

    .line 1542
    .line 1543
    const/16 v22, 0x7e

    .line 1544
    .line 1545
    const-wide/16 v17, 0x0

    .line 1546
    .line 1547
    const-wide/16 v19, 0x0

    .line 1548
    .line 1549
    invoke-static/range {v14 .. v22}, Lsv1;->k0(Lsv1;JJJFI)V

    .line 1550
    .line 1551
    .line 1552
    if-eqz v2, :cond_27

    .line 1553
    .line 1554
    invoke-static {}, Lu15;->c()Ldf;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v11

    .line 1558
    invoke-virtual {v11, v13}, Ldf;->e(I)V

    .line 1559
    .line 1560
    .line 1561
    iget v7, v2, Ls86;->a:F

    .line 1562
    .line 1563
    iget v8, v2, Ls86;->b:F

    .line 1564
    .line 1565
    iget v9, v2, Ls86;->c:F

    .line 1566
    .line 1567
    iget v10, v2, Ls86;->d:F

    .line 1568
    .line 1569
    invoke-interface/range {v6 .. v11}, Lsm0;->j(FFFFLdf;)V

    .line 1570
    .line 1571
    .line 1572
    :cond_27
    invoke-interface {v6}, Lsm0;->p()V

    .line 1573
    .line 1574
    .line 1575
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1576
    .line 1577
    return-object v0

    .line 1578
    :pswitch_1b
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1579
    .line 1580
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 1581
    .line 1582
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v0, Landroid/content/Context;

    .line 1585
    .line 1586
    check-cast v1, Landroid/content/res/TypedArray;

    .line 1587
    .line 1588
    sget v3, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->k0:I

    .line 1589
    .line 1590
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1591
    .line 1592
    .line 1593
    iget-object v3, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1594
    .line 1595
    sget v4, Lx56;->HappInputField_title:I

    .line 1596
    .line 1597
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v4

    .line 1601
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1602
    .line 1603
    .line 1604
    sget v4, Lx56;->HappInputField_titleColor:I

    .line 1605
    .line 1606
    sget v5, Lv26;->settingsText:I

    .line 1607
    .line 1608
    invoke-static {v0, v5}, Los4;->q(Landroid/content/Context;I)I

    .line 1609
    .line 1610
    .line 1611
    move-result v0

    .line 1612
    invoke-virtual {v1, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1613
    .line 1614
    .line 1615
    move-result v0

    .line 1616
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1617
    .line 1618
    .line 1619
    iget-object v0, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->g0:Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 1620
    .line 1621
    sget v3, Lx56;->HappInputField_hint:I

    .line 1622
    .line 1623
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v3

    .line 1627
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 1628
    .line 1629
    .line 1630
    sget v0, Lx56;->HappInputField_description:I

    .line 1631
    .line 1632
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    iget-object v3, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->h0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1637
    .line 1638
    if-eqz v0, :cond_28

    .line 1639
    .line 1640
    move v10, v13

    .line 1641
    :cond_28
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1645
    .line 1646
    .line 1647
    sget v0, Lx56;->HappInfoField_copyOnShortClick:I

    .line 1648
    .line 1649
    invoke-virtual {v1, v0, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v0

    .line 1653
    iput-boolean v0, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->j0:Z

    .line 1654
    .line 1655
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1656
    .line 1657
    return-object v0

    .line 1658
    :pswitch_1c
    iget-object v2, v0, Lzw2;->Z:Ljava/lang/Object;

    .line 1659
    .line 1660
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;

    .line 1661
    .line 1662
    iget-object v0, v0, Lzw2;->Y:Ljava/lang/Object;

    .line 1663
    .line 1664
    check-cast v0, Landroid/content/Context;

    .line 1665
    .line 1666
    check-cast v1, Landroid/content/res/TypedArray;

    .line 1667
    .line 1668
    sget v3, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;->j0:I

    .line 1669
    .line 1670
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    iget-object v3, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1674
    .line 1675
    iget-object v4, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;->h0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1676
    .line 1677
    sget v5, Lx56;->HappInfoField_title:I

    .line 1678
    .line 1679
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v5

    .line 1683
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1684
    .line 1685
    .line 1686
    sget v5, Lx56;->HappInfoField_titleColor:I

    .line 1687
    .line 1688
    sget v6, Lv26;->settingsText:I

    .line 1689
    .line 1690
    invoke-static {v0, v6}, Los4;->q(Landroid/content/Context;I)I

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    invoke-virtual {v1, v5, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1695
    .line 1696
    .line 1697
    move-result v0

    .line 1698
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1699
    .line 1700
    .line 1701
    iget-object v0, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;->g0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 1702
    .line 1703
    sget v3, Lx56;->HappInfoField_info:I

    .line 1704
    .line 1705
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v3

    .line 1709
    if-eqz v3, :cond_29

    .line 1710
    .line 1711
    invoke-static {v3}, Lwl7;->e0(Ljava/lang/String;)Landroid/text/Editable;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v14

    .line 1715
    :cond_29
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1716
    .line 1717
    .line 1718
    sget v3, Lx56;->HappInfoField_hint:I

    .line 1719
    .line 1720
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v3

    .line 1724
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 1725
    .line 1726
    .line 1727
    sget v0, Lx56;->HappInfoField_description:I

    .line 1728
    .line 1729
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    if-eqz v0, :cond_2a

    .line 1734
    .line 1735
    move v10, v13

    .line 1736
    :cond_2a
    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1740
    .line 1741
    .line 1742
    sget v0, Lx56;->HappInfoField_copyOnShortClick:I

    .line 1743
    .line 1744
    invoke-virtual {v1, v0, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v0

    .line 1748
    iput-boolean v0, v2, Lsu/happ/proxyutility/ui/foundation/component/HappInfoField;->i0:Z

    .line 1749
    .line 1750
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1751
    .line 1752
    return-object v0

    .line 1753
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

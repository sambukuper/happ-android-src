.class public final synthetic Luh3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, Luh3;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILe74;)V
    .locals 0

    .line 1
    const/4 p1, 0x7

    .line 2
    iput-byte p1, p0, Luh3;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public synthetic constructor <init>(Lak3;)V
    .locals 0

    .line 9
    const/4 p1, 0x1

    iput-byte p1, p0, Luh3;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, Luh3;->X:B

    .line 2
    .line 3
    const/16 v0, 0x3a

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x5

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    sget-object v9, Ldn8;->a:Ldn8;

    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Lf17;

    .line 20
    .line 21
    invoke-static {p1}, Ld17;->f(Lf17;)V

    .line 22
    .line 23
    .line 24
    return-object v9

    .line 25
    :pswitch_0
    check-cast p1, Lp87;

    .line 26
    .line 27
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    check-cast p1, Lkn3;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iput-boolean v8, p1, Lkn3;->b:Z

    .line 36
    .line 37
    iput-boolean v8, p1, Lkn3;->a:Z

    .line 38
    .line 39
    return-object v9

    .line 40
    :pswitch_2
    check-cast p1, Lyf8;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p0, p1, Lyf8;->Y:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 48
    .line 49
    iget-object p1, p1, Lyf8;->Z:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lqs7;

    .line 52
    .line 53
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_1

    .line 64
    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    iget-boolean p0, p1, Lqs7;->b:Z

    .line 68
    .line 69
    if-ne p0, v8, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v6, v8

    .line 73
    :cond_1
    :goto_0
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_3
    check-cast p1, Lom4;

    .line 79
    .line 80
    if-nez p1, :cond_2

    .line 81
    .line 82
    const/4 p0, -0x1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    sget-object p0, Lln4;->a:[I

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    aget p0, p0, p1

    .line 91
    .line 92
    :goto_1
    if-eq p0, v8, :cond_4

    .line 93
    .line 94
    if-eq p0, v5, :cond_5

    .line 95
    .line 96
    if-eq p0, v3, :cond_4

    .line 97
    .line 98
    if-eq p0, v2, :cond_5

    .line 99
    .line 100
    if-ne p0, v4, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    move v6, v8

    .line 108
    :cond_5
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    :goto_3
    return-object v7

    .line 113
    :pswitch_4
    check-cast p1, Lp87;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    if-eq p0, v8, :cond_7

    .line 125
    .line 126
    if-ne p0, v5, :cond_6

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_7
    :goto_4
    move v6, v8

    .line 134
    :cond_8
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    :goto_5
    return-object v7

    .line 139
    :pswitch_5
    check-cast p1, Ljava/io/PrintWriter;

    .line 140
    .line 141
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const-string p0, "Connection error from anti-filter"

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v9

    .line 152
    :pswitch_6
    check-cast p1, Lqg5;

    .line 153
    .line 154
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object p0, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 162
    .line 163
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    new-instance p1, Ljava/util/ArrayList;

    .line 168
    .line 169
    const/16 v0, 0xa

    .line 170
    .line 171
    invoke-static {p0, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Lsu/happ/proxyutility/dto/ServerCache;

    .line 193
    .line 194
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    new-instance v1, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 199
    .line 200
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/domain/sub/GuId;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_9
    return-object p1

    .line 208
    :pswitch_7
    check-cast p1, Lqg5;

    .line 209
    .line 210
    sget p0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object p0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p0, Lqs7;

    .line 218
    .line 219
    iget-boolean p0, p0, Lqs7;->c:Z

    .line 220
    .line 221
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_8
    check-cast p1, Ljava/lang/Long;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    return-object v9

    .line 232
    :pswitch_9
    check-cast p1, Lgo5;

    .line 233
    .line 234
    invoke-virtual {p1}, Lgo5;->t()Z

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    if-eqz p0, :cond_c

    .line 239
    .line 240
    iget-object p0, p1, Lgo5;->Z:Lw03;

    .line 241
    .line 242
    if-eqz p0, :cond_c

    .line 243
    .line 244
    iget-object p1, p1, Lgo5;->Y:Lvi4;

    .line 245
    .line 246
    iget-object v0, p1, Lvi4;->t0:Ls05;

    .line 247
    .line 248
    if-eqz v0, :cond_a

    .line 249
    .line 250
    invoke-virtual {v0, p0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    move-object v7, v0

    .line 255
    check-cast v7, Lt05;

    .line 256
    .line 257
    :cond_a
    if-eqz v7, :cond_c

    .line 258
    .line 259
    iget-object v0, p1, Lvi4;->s0:Ld7;

    .line 260
    .line 261
    if-eqz v0, :cond_b

    .line 262
    .line 263
    invoke-virtual {v0, p0}, Ld7;->K(Lw03;)V

    .line 264
    .line 265
    .line 266
    :cond_b
    invoke-virtual {p1, v7}, Lvi4;->B0(Lt05;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7}, Lt05;->b()V

    .line 270
    .line 271
    .line 272
    :cond_c
    return-object v9

    .line 273
    :pswitch_a
    move-object v2, p1

    .line 274
    check-cast v2, Lgo5;

    .line 275
    .line 276
    invoke-virtual {v2}, Lgo5;->t()Z

    .line 277
    .line 278
    .line 279
    move-result p0

    .line 280
    if-eqz p0, :cond_10

    .line 281
    .line 282
    iget-object v1, v2, Lgo5;->Y:Lvi4;

    .line 283
    .line 284
    iget-boolean p0, v1, Lvi4;->q0:Z

    .line 285
    .line 286
    if-eqz p0, :cond_d

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_d
    iget-object p0, v2, Lgo5;->X:Lyr4;

    .line 290
    .line 291
    invoke-interface {p0}, Lyr4;->g()Lgn2;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    iget-object p1, v2, Lgo5;->X:Lyr4;

    .line 296
    .line 297
    invoke-interface {p1}, Lyr4;->f()Lrn2;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    if-eqz p1, :cond_e

    .line 302
    .line 303
    invoke-virtual {v1}, Lvi4;->I0()V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_e
    if-nez p0, :cond_f

    .line 308
    .line 309
    iput-object v7, v1, Lvi4;->j0:Lrn2;

    .line 310
    .line 311
    iput-object v7, v1, Lvi4;->k0:Lgn2;

    .line 312
    .line 313
    iput-object v7, v1, Lvi4;->i0:Lgn2;

    .line 314
    .line 315
    invoke-virtual {v1}, Lvi4;->I0()V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_f
    iput-object v7, v1, Lvi4;->j0:Lrn2;

    .line 320
    .line 321
    iput-object v7, v1, Lvi4;->k0:Lgn2;

    .line 322
    .line 323
    const-wide v3, 0x7fffffff7fffffffL

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    const-wide/16 v5, 0x0

    .line 329
    .line 330
    invoke-virtual/range {v1 .. v6}, Lvi4;->i0(Lgo5;JJ)V

    .line 331
    .line 332
    .line 333
    iput-object p0, v1, Lvi4;->i0:Lgn2;

    .line 334
    .line 335
    :cond_10
    :goto_7
    return-object v9

    .line 336
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    if-nez p0, :cond_11

    .line 346
    .line 347
    new-instance p0, Lhu;

    .line 348
    .line 349
    invoke-direct {p0, v1, v4}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_11
    const/16 p0, 0x1000

    .line 354
    .line 355
    invoke-static {p1, p0, p0, v8}, Lfm7;->T0(Ljava/lang/CharSequence;IIZ)Ljava/util/ArrayList;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    new-instance p1, Lhu;

    .line 360
    .line 361
    invoke-direct {p1, p0, v8}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 362
    .line 363
    .line 364
    move-object p0, p1

    .line 365
    :goto_8
    return-object p0

    .line 366
    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    return-object v9

    .line 372
    :pswitch_d
    check-cast p1, Lqg5;

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    iget-object p0, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast p0, Ljava/io/File;

    .line 380
    .line 381
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    return-object p0

    .line 390
    :pswitch_e
    check-cast p1, Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 391
    .line 392
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    new-instance p0, Ljava/io/File;

    .line 396
    .line 397
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/LogFileInfo;->c()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    new-instance v0, Lqg5;

    .line 405
    .line 406
    invoke-direct {v0, p1, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-object v0

    .line 410
    :pswitch_f
    check-cast p1, Lac1;

    .line 411
    .line 412
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    const/16 p0, 0x2e

    .line 416
    .line 417
    invoke-static {p1, p0}, Lz68;->t(Lcc1;C)V

    .line 418
    .line 419
    .line 420
    check-cast p1, Lo3;

    .line 421
    .line 422
    new-instance p0, Lc30;

    .line 423
    .line 424
    new-instance v0, Lik2;

    .line 425
    .line 426
    const/16 v1, 0x9

    .line 427
    .line 428
    invoke-direct {v0, v8, v1}, Lik2;-><init>(II)V

    .line 429
    .line 430
    .line 431
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 432
    .line 433
    .line 434
    invoke-interface {p1, p0}, Lo3;->k(Lqj2;)V

    .line 435
    .line 436
    .line 437
    return-object v9

    .line 438
    :pswitch_10
    check-cast p1, Lac1;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-static {p1, v0}, Lz68;->t(Lcc1;C)V

    .line 444
    .line 445
    .line 446
    sget-object p0, Ldg5;->Y:Ldg5;

    .line 447
    .line 448
    invoke-interface {p1, p0}, Lac1;->c(Ldg5;)V

    .line 449
    .line 450
    .line 451
    new-instance p0, Luh3;

    .line 452
    .line 453
    const/16 v0, 0xd

    .line 454
    .line 455
    invoke-direct {p0, v0}, Luh3;-><init>(B)V

    .line 456
    .line 457
    .line 458
    invoke-static {p1, v1, p0}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 459
    .line 460
    .line 461
    return-object v9

    .line 462
    :pswitch_11
    check-cast p1, Lac1;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    return-object v9

    .line 468
    :pswitch_12
    check-cast p1, Lmd4;

    .line 469
    .line 470
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    const/16 p0, 0x54

    .line 474
    .line 475
    invoke-static {p1, p0}, Lz68;->t(Lcc1;C)V

    .line 476
    .line 477
    .line 478
    return-object v9

    .line 479
    :pswitch_13
    check-cast p1, Lmd4;

    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    const/16 p0, 0x74

    .line 485
    .line 486
    invoke-static {p1, p0}, Lz68;->t(Lcc1;C)V

    .line 487
    .line 488
    .line 489
    return-object v9

    .line 490
    :pswitch_14
    check-cast p1, Lkl5;

    .line 491
    .line 492
    sget-object p0, Lpc;->b:Lox1;

    .line 493
    .line 494
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    check-cast p0, Landroid/content/Context;

    .line 502
    .line 503
    :goto_9
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 504
    .line 505
    if-eqz p1, :cond_13

    .line 506
    .line 507
    instance-of p1, p0, Landroid/app/Activity;

    .line 508
    .line 509
    if-eqz p1, :cond_12

    .line 510
    .line 511
    move-object v7, p0

    .line 512
    goto :goto_a

    .line 513
    :cond_12
    check-cast p0, Landroid/content/ContextWrapper;

    .line 514
    .line 515
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    goto :goto_9

    .line 520
    :cond_13
    :goto_a
    check-cast v7, Landroid/app/Activity;

    .line 521
    .line 522
    return-object v7

    .line 523
    :pswitch_15
    check-cast p1, Lvs5;

    .line 524
    .line 525
    return-object v9

    .line 526
    :pswitch_16
    check-cast p1, Ljava/util/List;

    .line 527
    .line 528
    new-instance p0, Lj74;

    .line 529
    .line 530
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    check-cast v0, Ljava/lang/Number;

    .line 535
    .line 536
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    check-cast p1, Ljava/lang/Number;

    .line 545
    .line 546
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 547
    .line 548
    .line 549
    move-result p1

    .line 550
    invoke-direct {p0, v0, p1}, Lj74;-><init>(II)V

    .line 551
    .line 552
    .line 553
    return-object p0

    .line 554
    :pswitch_17
    check-cast p1, Ldo5;

    .line 555
    .line 556
    return-object v9

    .line 557
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    return-object v7

    .line 563
    :pswitch_19
    check-cast p1, Ljava/util/Map$Entry;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    check-cast p0, Ljava/lang/String;

    .line 573
    .line 574
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    check-cast p1, Lao3;

    .line 579
    .line 580
    new-instance v1, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 583
    .line 584
    .line 585
    invoke-static {v1, p0}, Lxl7;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object p0

    .line 598
    return-object p0

    .line 599
    :pswitch_1a
    check-cast p1, Ldt0;

    .line 600
    .line 601
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    new-instance p0, Lei3;

    .line 605
    .line 606
    invoke-direct {p0, v5}, Lei3;-><init>(B)V

    .line 607
    .line 608
    .line 609
    new-instance v0, Lfo3;

    .line 610
    .line 611
    invoke-direct {v0, p0}, Lfo3;-><init>(Ldn2;)V

    .line 612
    .line 613
    .line 614
    const-string p0, "JsonPrimitive"

    .line 615
    .line 616
    invoke-virtual {p1, p0, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 617
    .line 618
    .line 619
    new-instance p0, Lei3;

    .line 620
    .line 621
    invoke-direct {p0, v3}, Lei3;-><init>(B)V

    .line 622
    .line 623
    .line 624
    new-instance v0, Lfo3;

    .line 625
    .line 626
    invoke-direct {v0, p0}, Lfo3;-><init>(Ldn2;)V

    .line 627
    .line 628
    .line 629
    const-string p0, "JsonNull"

    .line 630
    .line 631
    invoke-virtual {p1, p0, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 632
    .line 633
    .line 634
    new-instance p0, Lei3;

    .line 635
    .line 636
    invoke-direct {p0, v2}, Lei3;-><init>(B)V

    .line 637
    .line 638
    .line 639
    new-instance v0, Lfo3;

    .line 640
    .line 641
    invoke-direct {v0, p0}, Lfo3;-><init>(Ldn2;)V

    .line 642
    .line 643
    .line 644
    const-string p0, "JsonLiteral"

    .line 645
    .line 646
    invoke-virtual {p1, p0, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 647
    .line 648
    .line 649
    new-instance p0, Lei3;

    .line 650
    .line 651
    invoke-direct {p0, v4}, Lei3;-><init>(B)V

    .line 652
    .line 653
    .line 654
    new-instance v0, Lfo3;

    .line 655
    .line 656
    invoke-direct {v0, p0}, Lfo3;-><init>(Ldn2;)V

    .line 657
    .line 658
    .line 659
    const-string p0, "JsonObject"

    .line 660
    .line 661
    invoke-virtual {p1, p0, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 662
    .line 663
    .line 664
    new-instance p0, Lei3;

    .line 665
    .line 666
    const/4 v0, 0x6

    .line 667
    invoke-direct {p0, v0}, Lei3;-><init>(B)V

    .line 668
    .line 669
    .line 670
    new-instance v0, Lfo3;

    .line 671
    .line 672
    invoke-direct {v0, p0}, Lfo3;-><init>(Ldn2;)V

    .line 673
    .line 674
    .line 675
    const-string p0, "JsonArray"

    .line 676
    .line 677
    invoke-virtual {p1, p0, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 678
    .line 679
    .line 680
    return-object v9

    .line 681
    :pswitch_1b
    check-cast p1, Lj71;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    const-class p0, Lak3;

    .line 687
    .line 688
    sget-object p1, Lyb6;->a:Lzb6;

    .line 689
    .line 690
    invoke-virtual {p1, p0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    invoke-interface {p0}, Lzu3;->E()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 698
    .line 699
    .line 700
    new-instance p0, Lo05;

    .line 701
    .line 702
    invoke-direct {p0, v8}, Lo05;-><init>(Z)V

    .line 703
    .line 704
    .line 705
    return-object p0

    .line 706
    :pswitch_1c
    check-cast p1, Lvh3;

    .line 707
    .line 708
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    return-object v9

    .line 712
    nop

    .line 713
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

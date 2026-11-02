.class public final synthetic Lzs1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lzs1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzs1;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lzs1;->Y:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, Lzs1;->X:B

    iput-boolean p1, p0, Lzs1;->Y:Z

    iput-object p2, p0, Lzs1;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lzs1;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Ldn8;->a:Ldn8;

    .line 9
    .line 10
    iget-object v6, v0, Lzs1;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    iget-boolean v0, v0, Lzs1;->Y:Z

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v6, Lg09;

    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Lwr8;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/16 v2, 0x3a

    .line 29
    .line 30
    invoke-static {v1, v2}, Lz68;->t(Lcc1;C)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-static {v1}, Lwr8;->q(Lwr8;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Las;

    .line 37
    .line 38
    const/16 v3, 0xe

    .line 39
    .line 40
    invoke-direct {v2, v3, v0}, Las;-><init>(BZ)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v6, v2}, Lzr8;->a(Lwr8;Lg09;Lgn2;)V

    .line 44
    .line 45
    .line 46
    return-object v5

    .line 47
    :pswitch_0
    check-cast v6, Ljava/util/List;

    .line 48
    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, Ljava/io/PrintWriter;

    .line 52
    .line 53
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, " send token with providerid:"

    .line 70
    .line 71
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, " success:"

    .line 78
    .line 79
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v5

    .line 93
    :pswitch_1
    check-cast v6, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 94
    .line 95
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, Lsu/happ/proxyutility/dto/ImportResult;

    .line 98
    .line 99
    sget v4, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ImportResult;->c()Lx83;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    instance-of v4, v4, Lr83;

    .line 109
    .line 110
    if-nez v4, :cond_1

    .line 111
    .line 112
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    instance-of v4, v4, Lr83;

    .line 117
    .line 118
    if-nez v4, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    instance-of v4, v4, Lm83;

    .line 125
    .line 126
    if-nez v4, :cond_1

    .line 127
    .line 128
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ImportResult;->b()Lt83;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    instance-of v4, v4, Lp83;

    .line 133
    .line 134
    if-nez v4, :cond_1

    .line 135
    .line 136
    invoke-virtual {v6, v1, v0, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->W(Lsu/happ/proxyutility/dto/ImportResult;ZZ)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_2

    .line 141
    .line 142
    :cond_1
    move v2, v3

    .line 143
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_2
    check-cast v6, Lla;

    .line 149
    .line 150
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, Lfi1;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v1, v6, Lla;->f:Lnh5;

    .line 158
    .line 159
    invoke-virtual {v1}, Lnh5;->l()F

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-nez v1, :cond_3

    .line 172
    .line 173
    move-object v4, v3

    .line 174
    :cond_3
    if-eqz v4, :cond_4

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-static {v1}, Lnr4;->O(F)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    :cond_4
    if-eqz v0, :cond_5

    .line 185
    .line 186
    neg-int v2, v2

    .line 187
    :cond_5
    int-to-long v0, v2

    .line 188
    const/16 v2, 0x20

    .line 189
    .line 190
    shl-long/2addr v0, v2

    .line 191
    new-instance v2, Lhf3;

    .line 192
    .line 193
    invoke-direct {v2, v0, v1}, Lhf3;-><init>(J)V

    .line 194
    .line 195
    .line 196
    return-object v2

    .line 197
    :pswitch_3
    check-cast v6, Ldn2;

    .line 198
    .line 199
    move-object/from16 v1, p1

    .line 200
    .line 201
    check-cast v1, Lz85;

    .line 202
    .line 203
    if-eqz v0, :cond_6

    .line 204
    .line 205
    invoke-interface {v6}, Ldn2;->invoke()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_6
    return-object v5

    .line 209
    :pswitch_4
    check-cast v6, Ll72;

    .line 210
    .line 211
    move-object/from16 v1, p1

    .line 212
    .line 213
    check-cast v1, Ljava/io/PrintWriter;

    .line 214
    .line 215
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v6}, Ll72;->f()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    iget-object v6, v6, Ll72;->a:Lvz7;

    .line 224
    .line 225
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    check-cast v6, Lcom/tencent/mmkv/MMKV;

    .line 230
    .line 231
    const-wide/16 v7, -0x1

    .line 232
    .line 233
    const-string v9, "extra_file_timestamp"

    .line 234
    .line 235
    invoke-virtual {v6, v7, v8, v9}, Lcom/tencent/mmkv/MMKV;->f(JLjava/lang/String;)J

    .line 236
    .line 237
    .line 238
    move-result-wide v9

    .line 239
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    cmp-long v7, v9, v7

    .line 244
    .line 245
    if-eqz v7, :cond_7

    .line 246
    .line 247
    move-object v4, v6

    .line 248
    :cond_7
    const-string v6, "1792654306601"

    .line 249
    .line 250
    invoke-static {v6}, Lmm7;->c0(Ljava/lang/String;)Ljava/lang/Long;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    sget-object v7, Lwe3;->a:Lmu0;

    .line 255
    .line 256
    invoke-interface {v7}, Lmu0;->a()Lte3;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-virtual {v7}, Lte3;->a()J

    .line 261
    .line 262
    .line 263
    move-result-wide v7

    .line 264
    new-instance v9, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v2, " Hash is found: "

    .line 273
    .line 274
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v0, "\nIs extra file outdated: "

    .line 281
    .line 282
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v0, ":\nDownload ts: "

    .line 289
    .line 290
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string v0, "\nBuild ts: "

    .line 297
    .line 298
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v0, "\nNow: "

    .line 305
    .line 306
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v5

    .line 320
    :pswitch_5
    check-cast v6, Lmr2;

    .line 321
    .line 322
    move-object/from16 v7, p1

    .line 323
    .line 324
    check-cast v7, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 325
    .line 326
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_b

    .line 334
    .line 335
    if-ne v1, v3, :cond_a

    .line 336
    .line 337
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->g()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    if-eqz v8, :cond_9

    .line 342
    .line 343
    if-eqz v0, :cond_8

    .line 344
    .line 345
    new-instance v0, Ljava/util/Date;

    .line 346
    .line 347
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 351
    .line 352
    .line 353
    move-result-wide v0

    .line 354
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    :cond_8
    move-object/from16 v28, v4

    .line 359
    .line 360
    const/16 v29, 0x0

    .line 361
    .line 362
    const v30, 0x6fffff

    .line 363
    .line 364
    .line 365
    const/4 v9, 0x0

    .line 366
    const/4 v10, 0x0

    .line 367
    const/4 v11, 0x0

    .line 368
    const/4 v12, 0x0

    .line 369
    const/4 v13, 0x0

    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    const/16 v16, 0x0

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    const/16 v18, 0x0

    .line 377
    .line 378
    const/16 v19, 0x0

    .line 379
    .line 380
    const/16 v20, 0x0

    .line 381
    .line 382
    const/16 v21, 0x0

    .line 383
    .line 384
    const/16 v22, 0x0

    .line 385
    .line 386
    const/16 v23, 0x0

    .line 387
    .line 388
    const/16 v24, 0x0

    .line 389
    .line 390
    const/16 v25, 0x0

    .line 391
    .line 392
    const/16 v26, 0x0

    .line 393
    .line 394
    const/16 v27, 0x0

    .line 395
    .line 396
    invoke-static/range {v8 .. v30}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    :cond_9
    :goto_0
    move-object v11, v4

    .line 401
    goto :goto_1

    .line 402
    :cond_a
    invoke-static {}, Lb61;->c()V

    .line 403
    .line 404
    .line 405
    goto :goto_2

    .line 406
    :cond_b
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->g()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    if-eqz v8, :cond_9

    .line 411
    .line 412
    if-eqz v0, :cond_c

    .line 413
    .line 414
    new-instance v0, Ljava/util/Date;

    .line 415
    .line 416
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 420
    .line 421
    .line 422
    move-result-wide v0

    .line 423
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    :cond_c
    move-object/from16 v27, v4

    .line 428
    .line 429
    const/16 v29, 0x0

    .line 430
    .line 431
    const v30, 0x77ffff

    .line 432
    .line 433
    .line 434
    const/4 v9, 0x0

    .line 435
    const/4 v10, 0x0

    .line 436
    const/4 v11, 0x0

    .line 437
    const/4 v12, 0x0

    .line 438
    const/4 v13, 0x0

    .line 439
    const/4 v14, 0x0

    .line 440
    const/4 v15, 0x0

    .line 441
    const/16 v16, 0x0

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const/16 v18, 0x0

    .line 446
    .line 447
    const/16 v19, 0x0

    .line 448
    .line 449
    const/16 v20, 0x0

    .line 450
    .line 451
    const/16 v21, 0x0

    .line 452
    .line 453
    const/16 v22, 0x0

    .line 454
    .line 455
    const/16 v23, 0x0

    .line 456
    .line 457
    const/16 v24, 0x0

    .line 458
    .line 459
    const/16 v25, 0x0

    .line 460
    .line 461
    const/16 v26, 0x0

    .line 462
    .line 463
    const/16 v28, 0x0

    .line 464
    .line 465
    invoke-static/range {v8 .. v30}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    goto :goto_0

    .line 470
    :goto_1
    const/4 v12, 0x0

    .line 471
    const/16 v13, 0x17

    .line 472
    .line 473
    const/4 v8, 0x0

    .line 474
    const/4 v9, 0x0

    .line 475
    const/4 v10, 0x0

    .line 476
    invoke-static/range {v7 .. v13}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    :goto_2
    return-object v4

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

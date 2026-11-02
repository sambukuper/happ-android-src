.class public final synthetic Lyn1;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lyn1;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lmo2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lyn1;->X:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Lt14;

    .line 14
    .line 15
    move-object/from16 v2, p2

    .line 16
    .line 17
    check-cast v2, Lt14;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lq45;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lq45;->a(Lt14;Lt14;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, Lt14;

    .line 41
    .line 42
    move-object/from16 v2, p2

    .line 43
    .line 44
    check-cast v2, Lt14;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lbi8;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v0, Lp45;->b:Lo45;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lo45;->b:Lq45;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lq45;->b(Lt14;Lt14;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0, v2, v1}, Lq45;->b(Lt14;Lt14;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_0

    .line 77
    .line 78
    move v3, v4

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    const/4 v3, 0x0

    .line 81
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_1
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 89
    .line 90
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    move-object/from16 v2, p2

    .line 95
    .line 96
    check-cast v2, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v3, v0, Lsu/happ/proxyutility/feature/main/MainViewModel;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    move-object v6, v4

    .line 128
    check-cast v6, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 129
    .line 130
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v6, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eqz v6, :cond_1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    move-object v4, v5

    .line 142
    :goto_1
    check-cast v4, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 143
    .line 144
    if-eqz v4, :cond_3

    .line 145
    .line 146
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-eqz v3, :cond_3

    .line 151
    .line 152
    sget-object v4, Lsu/happ/proxyutility/dto/SubscriptionItem;->Companion:Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;

    .line 153
    .line 154
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;->a()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem$Companion;->a(I)Lsu/happ/proxyutility/dto/SubscriptionItem$Status;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const/4 v4, 0x6

    .line 166
    invoke-static {v3, v2, v5, v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u0(Lsu/happ/proxyutility/dto/SubscriptionItem;Lsu/happ/proxyutility/dto/SubscriptionItem$Status;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 167
    .line 168
    .line 169
    sget-object v2, Lwe3;->a:Lmu0;

    .line 170
    .line 171
    invoke-interface {v2}, Lmu0;->a()Lte3;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Lte3;->a()J

    .line 176
    .line 177
    .line 178
    move-result-wide v4

    .line 179
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v3, v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->m0(Ljava/lang/Long;)V

    .line 184
    .line 185
    .line 186
    sget-object v2, Lkw4;->a:Lkw4;

    .line 187
    .line 188
    invoke-static {v3, v1}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->s()V

    .line 192
    .line 193
    .line 194
    sget-object v0, Ldn8;->a:Ldn8;

    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_2
    move-object/from16 v1, p1

    .line 198
    .line 199
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 200
    .line 201
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    move-object/from16 v6, p2

    .line 206
    .line 207
    check-cast v6, Lx83;

    .line 208
    .line 209
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 216
    .line 217
    move-object v4, v0

    .line 218
    check-cast v4, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-static {v4}, Lzw8;->a(Lxw8;)Ltu0;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    sget-object v1, Ltp1;->a:Lnf1;

    .line 228
    .line 229
    sget-object v1, Lye1;->Z:Lye1;

    .line 230
    .line 231
    new-instance v3, Lqk4;

    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const/4 v8, 0x5

    .line 235
    invoke-direct/range {v3 .. v8}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v1, v3, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 239
    .line 240
    .line 241
    sget-object v0, Ldn8;->a:Ldn8;

    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_3
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 247
    .line 248
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    move-object/from16 v2, p2

    .line 253
    .line 254
    check-cast v2, Ljava/lang/Boolean;

    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    new-instance v4, Lpo4;

    .line 275
    .line 276
    invoke-direct {v4, v0, v1, v2, v5}, Lpo4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/lang/String;ZLq51;)V

    .line 277
    .line 278
    .line 279
    const/4 v0, 0x3

    .line 280
    invoke-static {v3, v5, v4, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 281
    .line 282
    .line 283
    sget-object v0, Ldn8;->a:Ldn8;

    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_4
    move-object/from16 v1, p1

    .line 287
    .line 288
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 289
    .line 290
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    move-object/from16 v1, p2

    .line 295
    .line 296
    check-cast v1, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 297
    .line 298
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/GuId;->b()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 309
    .line 310
    move-object v5, v0

    .line 311
    check-cast v5, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 312
    .line 313
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 314
    .line 315
    iget-object v0, v5, Lsu/happ/proxyutility/feature/main/MainActivity;->U0:Lvz7;

    .line 316
    .line 317
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 322
    .line 323
    const-string v1, "SELECTED_SERVER"

    .line 324
    .line 325
    invoke-virtual {v0, v1}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    const/4 v1, 0x0

    .line 330
    if-eqz v0, :cond_4

    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_4
    move-object v0, v1

    .line 334
    :goto_2
    invoke-virtual {v5}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    iget-object v4, v4, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 339
    .line 340
    :goto_3
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    move-object v9, v8

    .line 345
    move-object v8, v9

    .line 346
    check-cast v8, Lxm4;

    .line 347
    .line 348
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    const/16 v25, 0x0

    .line 352
    .line 353
    const v26, 0xfffe

    .line 354
    .line 355
    .line 356
    const-wide/16 v10, 0x0

    .line 357
    .line 358
    const/4 v12, 0x0

    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const/16 v16, 0x0

    .line 363
    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    .line 370
    const/16 v20, 0x0

    .line 371
    .line 372
    const/16 v21, 0x0

    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const/16 v23, 0x0

    .line 377
    .line 378
    const/16 v24, 0x0

    .line 379
    .line 380
    move-object/from16 v27, v9

    .line 381
    .line 382
    move-object v9, v6

    .line 383
    move-object/from16 v6, v27

    .line 384
    .line 385
    invoke-static/range {v8 .. v26}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 386
    .line 387
    .line 388
    move-result-object v8

    .line 389
    invoke-virtual {v4, v6, v8}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    if-eqz v6, :cond_8

    .line 394
    .line 395
    if-nez v0, :cond_5

    .line 396
    .line 397
    const/4 v3, 0x0

    .line 398
    goto :goto_4

    .line 399
    :cond_5
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    :goto_4
    if-eqz v3, :cond_6

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_6
    invoke-static {v5}, Lue3;->y(Landroid/content/Context;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-eqz v0, :cond_7

    .line 411
    .line 412
    sget v0, Ly46;->connection_test_pending:I

    .line 413
    .line 414
    invoke-virtual {v5, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    goto :goto_5

    .line 419
    :cond_7
    sget v0, Ly46;->connection_test_pending_mobile:I

    .line 420
    .line 421
    invoke-virtual {v5, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v5, v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->d0(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    iget-object v0, v5, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 432
    .line 433
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    sget-object v3, Ltp1;->a:Lnf1;

    .line 438
    .line 439
    sget-object v3, Ldm4;->a:Lhv2;

    .line 440
    .line 441
    new-instance v4, Lbv;

    .line 442
    .line 443
    move-object v6, v9

    .line 444
    const/4 v9, 0x6

    .line 445
    move-object v8, v1

    .line 446
    invoke-direct/range {v4 .. v9}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v3, v4, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 450
    .line 451
    .line 452
    :goto_6
    sget-object v0, Ldn8;->a:Ldn8;

    .line 453
    .line 454
    return-object v0

    .line 455
    :cond_8
    move-object v6, v9

    .line 456
    goto :goto_3

    .line 457
    :pswitch_5
    move-object/from16 v1, p1

    .line 458
    .line 459
    check-cast v1, Le37;

    .line 460
    .line 461
    move-object/from16 v2, p2

    .line 462
    .line 463
    check-cast v2, Ljava/lang/Number;

    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Ldo3;

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-interface {v1, v2}, Le37;->j(I)Z

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    if-nez v5, :cond_9

    .line 484
    .line 485
    invoke-interface {v1, v2}, Le37;->h(I)Le37;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-interface {v1}, Le37;->c()Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_9

    .line 494
    .line 495
    move v3, v4

    .line 496
    goto :goto_7

    .line 497
    :cond_9
    const/4 v3, 0x0

    .line 498
    :goto_7
    iput-boolean v3, v0, Ldo3;->b:Z

    .line 499
    .line 500
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    return-object v0

    .line 505
    :pswitch_6
    move-object/from16 v1, p1

    .line 506
    .line 507
    check-cast v1, Ljava/lang/String;

    .line 508
    .line 509
    move-object/from16 v2, p2

    .line 510
    .line 511
    check-cast v2, Lq51;

    .line 512
    .line 513
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v0, Lgn2;

    .line 516
    .line 517
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    sget-object v0, Ldn8;->a:Ldn8;

    .line 521
    .line 522
    return-object v0

    .line 523
    :pswitch_7
    move-object/from16 v1, p1

    .line 524
    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    move-object/from16 v2, p2

    .line 528
    .line 529
    check-cast v2, Lq51;

    .line 530
    .line 531
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Lgn2;

    .line 534
    .line 535
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    sget-object v0, Ldn8;->a:Ldn8;

    .line 539
    .line 540
    return-object v0

    .line 541
    :pswitch_8
    move-object/from16 v1, p1

    .line 542
    .line 543
    check-cast v1, Ljava/util/List;

    .line 544
    .line 545
    move-object/from16 v2, p2

    .line 546
    .line 547
    check-cast v2, Lq51;

    .line 548
    .line 549
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lht2;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    sget-object v6, Lvs2;->c:Lvs2;

    .line 557
    .line 558
    sget-object v7, Lvs2;->b:Lvs2;

    .line 559
    .line 560
    sget-object v8, Ldn8;->a:Ldn8;

    .line 561
    .line 562
    sget-object v9, Lvs2;->a:Lvs2;

    .line 563
    .line 564
    sget-object v10, Lvs2;->d:Lvs2;

    .line 565
    .line 566
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 567
    .line 568
    .line 569
    move-result v11

    .line 570
    if-ne v11, v4, :cond_b

    .line 571
    .line 572
    :cond_a
    const/4 v11, 0x0

    .line 573
    goto/16 :goto_f

    .line 574
    .line 575
    :cond_b
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    const/4 v12, -0x1

    .line 580
    add-int/2addr v11, v12

    .line 581
    if-ltz v11, :cond_f

    .line 582
    .line 583
    move v13, v12

    .line 584
    :goto_8
    add-int/lit8 v14, v11, -0x1

    .line 585
    .line 586
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v15

    .line 590
    check-cast v15, Lct2;

    .line 591
    .line 592
    invoke-static {v15, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v16

    .line 596
    if-nez v16, :cond_1a

    .line 597
    .line 598
    invoke-static {v15, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v16

    .line 602
    if-nez v16, :cond_1a

    .line 603
    .line 604
    invoke-static {v15, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v16

    .line 608
    if-nez v16, :cond_1a

    .line 609
    .line 610
    invoke-static {v15, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v16

    .line 614
    if-eqz v16, :cond_c

    .line 615
    .line 616
    goto/16 :goto_f

    .line 617
    .line 618
    :cond_c
    instance-of v15, v15, Lat2;

    .line 619
    .line 620
    if-eqz v15, :cond_d

    .line 621
    .line 622
    if-gez v13, :cond_d

    .line 623
    .line 624
    move v13, v11

    .line 625
    :cond_d
    if-gez v14, :cond_e

    .line 626
    .line 627
    move v11, v13

    .line 628
    goto :goto_9

    .line 629
    :cond_e
    move v11, v14

    .line 630
    goto :goto_8

    .line 631
    :cond_f
    move v11, v12

    .line 632
    :goto_9
    if-ltz v11, :cond_10

    .line 633
    .line 634
    goto/16 :goto_f

    .line 635
    .line 636
    :cond_10
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 637
    .line 638
    .line 639
    move-result v11

    .line 640
    move v13, v12

    .line 641
    move v14, v13

    .line 642
    const/4 v15, 0x0

    .line 643
    :goto_a
    if-ge v15, v11, :cond_14

    .line 644
    .line 645
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v16

    .line 649
    move-object/from16 v3, v16

    .line 650
    .line 651
    check-cast v3, Lct2;

    .line 652
    .line 653
    instance-of v12, v3, Lys2;

    .line 654
    .line 655
    if-eqz v12, :cond_11

    .line 656
    .line 657
    move v13, v15

    .line 658
    goto :goto_b

    .line 659
    :cond_11
    instance-of v12, v3, Lxs2;

    .line 660
    .line 661
    if-eqz v12, :cond_12

    .line 662
    .line 663
    move v14, v15

    .line 664
    goto :goto_b

    .line 665
    :cond_12
    instance-of v3, v3, Lzs2;

    .line 666
    .line 667
    if-nez v3, :cond_13

    .line 668
    .line 669
    goto :goto_c

    .line 670
    :cond_13
    :goto_b
    add-int/lit8 v15, v15, 0x1

    .line 671
    .line 672
    const/4 v12, -0x1

    .line 673
    goto :goto_a

    .line 674
    :cond_14
    :goto_c
    if-ltz v13, :cond_15

    .line 675
    .line 676
    move v11, v13

    .line 677
    goto :goto_f

    .line 678
    :cond_15
    if-ltz v14, :cond_16

    .line 679
    .line 680
    move v11, v14

    .line 681
    goto :goto_f

    .line 682
    :cond_16
    iget-object v3, v0, Lht2;->p0:Lne6;

    .line 683
    .line 684
    if-eqz v3, :cond_18

    .line 685
    .line 686
    iget-object v3, v0, Lht2;->o0:Lpv;

    .line 687
    .line 688
    invoke-virtual {v3}, Lpv;->b()Z

    .line 689
    .line 690
    .line 691
    move-result v3

    .line 692
    if-eqz v3, :cond_18

    .line 693
    .line 694
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    const/4 v11, 0x0

    .line 699
    :goto_d
    if-ge v11, v3, :cond_18

    .line 700
    .line 701
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v12

    .line 705
    check-cast v12, Lct2;

    .line 706
    .line 707
    instance-of v13, v12, Lws2;

    .line 708
    .line 709
    if-nez v13, :cond_1a

    .line 710
    .line 711
    instance-of v12, v12, Lbt2;

    .line 712
    .line 713
    if-eqz v12, :cond_17

    .line 714
    .line 715
    goto :goto_f

    .line 716
    :cond_17
    add-int/lit8 v11, v11, 0x1

    .line 717
    .line 718
    goto :goto_d

    .line 719
    :cond_18
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    const/4 v11, -0x1

    .line 724
    const/4 v12, 0x0

    .line 725
    :goto_e
    if-ge v12, v3, :cond_19

    .line 726
    .line 727
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v13

    .line 731
    check-cast v13, Lct2;

    .line 732
    .line 733
    instance-of v13, v13, Lzs2;

    .line 734
    .line 735
    if-eqz v13, :cond_19

    .line 736
    .line 737
    add-int/lit8 v11, v12, 0x1

    .line 738
    .line 739
    move/from16 v27, v12

    .line 740
    .line 741
    move v12, v11

    .line 742
    move/from16 v11, v27

    .line 743
    .line 744
    goto :goto_e

    .line 745
    :cond_19
    if-ltz v11, :cond_a

    .line 746
    .line 747
    :cond_1a
    :goto_f
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    check-cast v3, Lct2;

    .line 752
    .line 753
    invoke-static {v3, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v7

    .line 757
    if-eqz v7, :cond_1c

    .line 758
    .line 759
    invoke-interface {v1, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    :cond_1b
    :goto_10
    move-object v5, v8

    .line 763
    goto/16 :goto_18

    .line 764
    .line 765
    :cond_1c
    invoke-static {v3, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v6

    .line 769
    if-eqz v6, :cond_1d

    .line 770
    .line 771
    invoke-virtual {v0, v1, v2}, Lht2;->D(Ljava/util/List;Lq51;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    sget-object v0, Lc71;->X:Lc71;

    .line 776
    .line 777
    if-ne v5, v0, :cond_1b

    .line 778
    .line 779
    goto/16 :goto_18

    .line 780
    .line 781
    :cond_1d
    invoke-static {v3, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v6

    .line 785
    if-eqz v6, :cond_22

    .line 786
    .line 787
    iget-object v2, v0, Lht2;->u0:Lxm0;

    .line 788
    .line 789
    if-eqz v2, :cond_1e

    .line 790
    .line 791
    invoke-virtual {v2}, Lxm0;->a()V

    .line 792
    .line 793
    .line 794
    :cond_1e
    iput-object v5, v0, Lht2;->p0:Lne6;

    .line 795
    .line 796
    invoke-interface {v1, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    const/4 v3, 0x0

    .line 800
    :goto_11
    if-ge v3, v11, :cond_1b

    .line 801
    .line 802
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    check-cast v2, Lct2;

    .line 807
    .line 808
    invoke-static {v2, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    if-nez v4, :cond_21

    .line 813
    .line 814
    invoke-static {v2, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v4

    .line 818
    if-nez v4, :cond_21

    .line 819
    .line 820
    instance-of v4, v2, Lzs2;

    .line 821
    .line 822
    if-nez v4, :cond_21

    .line 823
    .line 824
    instance-of v4, v2, Lbt2;

    .line 825
    .line 826
    if-eqz v4, :cond_1f

    .line 827
    .line 828
    goto :goto_12

    .line 829
    :cond_1f
    instance-of v2, v2, Lws2;

    .line 830
    .line 831
    if-eqz v2, :cond_20

    .line 832
    .line 833
    invoke-virtual {v0, v5}, Lht2;->g(Ljava/util/ArrayList;)V

    .line 834
    .line 835
    .line 836
    goto :goto_12

    .line 837
    :cond_20
    add-int/lit8 v3, v3, 0x1

    .line 838
    .line 839
    goto :goto_11

    .line 840
    :cond_21
    :goto_12
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    add-int/lit8 v11, v11, -0x1

    .line 844
    .line 845
    goto :goto_11

    .line 846
    :cond_22
    invoke-static {v3, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v6

    .line 850
    if-eqz v6, :cond_26

    .line 851
    .line 852
    iget-object v2, v0, Lht2;->u0:Lxm0;

    .line 853
    .line 854
    if-eqz v2, :cond_23

    .line 855
    .line 856
    iget-object v2, v2, Lxm0;->f0:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v2, Lsf0;

    .line 859
    .line 860
    iget-object v3, v2, Lsf0;->i:Ljava/lang/Object;

    .line 861
    .line 862
    monitor-enter v3

    .line 863
    :try_start_0
    invoke-virtual {v2}, Lsf0;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    iget-object v2, v2, Lsf0;->a:Lgh0;

    .line 867
    .line 868
    invoke-interface {v2}, Lgh0;->A0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 869
    .line 870
    .line 871
    monitor-exit v3

    .line 872
    goto :goto_13

    .line 873
    :catchall_0
    move-exception v0

    .line 874
    monitor-exit v3

    .line 875
    throw v0

    .line 876
    :cond_23
    :goto_13
    iput-object v5, v0, Lht2;->p0:Lne6;

    .line 877
    .line 878
    invoke-interface {v1, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    const/4 v3, 0x0

    .line 882
    :goto_14
    if-ge v3, v11, :cond_1b

    .line 883
    .line 884
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    check-cast v0, Lct2;

    .line 889
    .line 890
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    if-nez v2, :cond_25

    .line 895
    .line 896
    instance-of v0, v0, Lzs2;

    .line 897
    .line 898
    if-eqz v0, :cond_24

    .line 899
    .line 900
    goto :goto_15

    .line 901
    :cond_24
    add-int/lit8 v3, v3, 0x1

    .line 902
    .line 903
    goto :goto_14

    .line 904
    :cond_25
    :goto_15
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    add-int/lit8 v11, v11, -0x1

    .line 908
    .line 909
    goto :goto_14

    .line 910
    :cond_26
    instance-of v6, v3, Lat2;

    .line 911
    .line 912
    if-eqz v6, :cond_27

    .line 913
    .line 914
    check-cast v3, Lat2;

    .line 915
    .line 916
    invoke-virtual {v0, v1, v11, v3, v2}, Lht2;->C(Ljava/util/List;ILat2;Lq51;)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v5

    .line 920
    sget-object v0, Lc71;->X:Lc71;

    .line 921
    .line 922
    if-ne v5, v0, :cond_1b

    .line 923
    .line 924
    goto/16 :goto_18

    .line 925
    .line 926
    :cond_27
    instance-of v2, v3, Lws2;

    .line 927
    .line 928
    if-eqz v2, :cond_28

    .line 929
    .line 930
    check-cast v3, Lws2;

    .line 931
    .line 932
    invoke-virtual {v0, v1, v11, v3, v4}, Lht2;->p(Ljava/util/List;ILws2;Z)V

    .line 933
    .line 934
    .line 935
    goto/16 :goto_10

    .line 936
    .line 937
    :cond_28
    instance-of v2, v3, Lbt2;

    .line 938
    .line 939
    if-eqz v2, :cond_29

    .line 940
    .line 941
    check-cast v3, Lbt2;

    .line 942
    .line 943
    invoke-virtual {v0, v1, v11, v3}, Lht2;->J(Ljava/util/List;ILbt2;)V

    .line 944
    .line 945
    .line 946
    goto/16 :goto_10

    .line 947
    .line 948
    :cond_29
    instance-of v2, v3, Lys2;

    .line 949
    .line 950
    if-eqz v2, :cond_2d

    .line 951
    .line 952
    check-cast v3, Lys2;

    .line 953
    .line 954
    iget-object v2, v0, Lht2;->Z:Ljava/util/Map;

    .line 955
    .line 956
    iget-object v4, v3, Lys2;->a:Ljava/util/Map;

    .line 957
    .line 958
    iput-object v4, v0, Lht2;->q0:Ljava/util/Map;

    .line 959
    .line 960
    iget-object v3, v3, Lys2;->b:Ljava/util/Map;

    .line 961
    .line 962
    iput-object v3, v0, Lht2;->r0:Ljava/util/Map;

    .line 963
    .line 964
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 965
    .line 966
    .line 967
    move-result v4

    .line 968
    if-eqz v4, :cond_2a

    .line 969
    .line 970
    goto :goto_16

    .line 971
    :cond_2a
    new-instance v4, Lip4;

    .line 972
    .line 973
    invoke-direct {v4}, Lip4;-><init>()V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v4, v3}, Lip4;->putAll(Ljava/util/Map;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v4, v2}, Lip4;->putAll(Ljava/util/Map;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v4}, Lip4;->b()Lip4;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    :goto_16
    iput-object v2, v0, Lht2;->s0:Ljava/util/Map;

    .line 987
    .line 988
    invoke-interface {v1, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    const/4 v3, 0x0

    .line 992
    :goto_17
    if-ge v3, v11, :cond_2c

    .line 993
    .line 994
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    check-cast v2, Lct2;

    .line 999
    .line 1000
    instance-of v2, v2, Lys2;

    .line 1001
    .line 1002
    if-eqz v2, :cond_2b

    .line 1003
    .line 1004
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    add-int/lit8 v11, v11, -0x1

    .line 1008
    .line 1009
    goto :goto_17

    .line 1010
    :cond_2b
    add-int/lit8 v3, v3, 0x1

    .line 1011
    .line 1012
    goto :goto_17

    .line 1013
    :cond_2c
    invoke-virtual {v0}, Lht2;->R()Z

    .line 1014
    .line 1015
    .line 1016
    goto/16 :goto_10

    .line 1017
    .line 1018
    :cond_2d
    instance-of v2, v3, Lxs2;

    .line 1019
    .line 1020
    if-nez v2, :cond_2f

    .line 1021
    .line 1022
    instance-of v2, v3, Lzs2;

    .line 1023
    .line 1024
    if-eqz v2, :cond_2e

    .line 1025
    .line 1026
    invoke-virtual {v0, v11, v1, v4}, Lht2;->u(ILjava/util/List;Z)V

    .line 1027
    .line 1028
    .line 1029
    goto/16 :goto_10

    .line 1030
    .line 1031
    :cond_2e
    invoke-static {}, Lb61;->c()V

    .line 1032
    .line 1033
    .line 1034
    :goto_18
    return-object v5

    .line 1035
    :cond_2f
    throw v5

    .line 1036
    :pswitch_9
    move-object/from16 v1, p1

    .line 1037
    .line 1038
    check-cast v1, Lyh2;

    .line 1039
    .line 1040
    move-object/from16 v2, p2

    .line 1041
    .line 1042
    check-cast v2, Lyh2;

    .line 1043
    .line 1044
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v0, Lci2;

    .line 1047
    .line 1048
    iget-boolean v3, v0, Ljx4;->p0:Z

    .line 1049
    .line 1050
    if-nez v3, :cond_30

    .line 1051
    .line 1052
    goto/16 :goto_1b

    .line 1053
    .line 1054
    :cond_30
    invoke-virtual {v2}, Lyh2;->b()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    invoke-virtual {v1}, Lyh2;->b()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v1

    .line 1062
    if-ne v2, v1, :cond_31

    .line 1063
    .line 1064
    goto/16 :goto_1b

    .line 1065
    .line 1066
    :cond_31
    iget-object v1, v0, Lci2;->t0:Lgn2;

    .line 1067
    .line 1068
    if-eqz v1, :cond_32

    .line 1069
    .line 1070
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v3

    .line 1074
    invoke-interface {v1, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    :cond_32
    if-eqz v2, :cond_34

    .line 1078
    .line 1079
    invoke-virtual {v0}, Ljx4;->M0()Lb71;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    sget-object v3, Le71;->f0:Le71;

    .line 1084
    .line 1085
    new-instance v6, Lr5;

    .line 1086
    .line 1087
    const/16 v7, 0xd

    .line 1088
    .line 1089
    invoke-direct {v6, v0, v5, v7}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 1090
    .line 1091
    .line 1092
    invoke-static {v1, v5, v3, v6, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 1093
    .line 1094
    .line 1095
    new-instance v1, Lea6;

    .line 1096
    .line 1097
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1098
    .line 1099
    .line 1100
    new-instance v3, Lp5;

    .line 1101
    .line 1102
    const/16 v4, 0x18

    .line 1103
    .line 1104
    invoke-direct {v3, v1, v0, v4}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1105
    .line 1106
    .line 1107
    invoke-static {v0, v3}, Lch3;->N(Ljx4;Ldn2;)V

    .line 1108
    .line 1109
    .line 1110
    iget-object v1, v1, Lea6;->X:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v1, Lk64;

    .line 1113
    .line 1114
    if-eqz v1, :cond_33

    .line 1115
    .line 1116
    invoke-virtual {v1}, Lk64;->a()Lk64;

    .line 1117
    .line 1118
    .line 1119
    goto :goto_19

    .line 1120
    :cond_33
    move-object v1, v5

    .line 1121
    :goto_19
    iput-object v1, v0, Lci2;->v0:Lk64;

    .line 1122
    .line 1123
    iget-object v1, v0, Lci2;->w0:Li55;

    .line 1124
    .line 1125
    if-eqz v1, :cond_36

    .line 1126
    .line 1127
    invoke-virtual {v1}, Li55;->V0()Ljx4;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    iget-boolean v1, v1, Ljx4;->p0:Z

    .line 1132
    .line 1133
    if-eqz v1, :cond_36

    .line 1134
    .line 1135
    invoke-virtual {v0}, Lci2;->c1()V

    .line 1136
    .line 1137
    .line 1138
    goto :goto_1a

    .line 1139
    :cond_34
    iget-object v1, v0, Lci2;->v0:Lk64;

    .line 1140
    .line 1141
    if-eqz v1, :cond_35

    .line 1142
    .line 1143
    invoke-virtual {v1}, Lk64;->b()V

    .line 1144
    .line 1145
    .line 1146
    :cond_35
    iput-object v5, v0, Lci2;->v0:Lk64;

    .line 1147
    .line 1148
    invoke-virtual {v0}, Lci2;->c1()V

    .line 1149
    .line 1150
    .line 1151
    :cond_36
    :goto_1a
    invoke-static {v0}, Lch3;->I(Lw07;)V

    .line 1152
    .line 1153
    .line 1154
    iget-object v1, v0, Lci2;->s0:Lxz4;

    .line 1155
    .line 1156
    if-eqz v1, :cond_39

    .line 1157
    .line 1158
    iget-object v3, v0, Lci2;->u0:Lyg2;

    .line 1159
    .line 1160
    if-eqz v2, :cond_38

    .line 1161
    .line 1162
    if-eqz v3, :cond_37

    .line 1163
    .line 1164
    new-instance v2, Lzg2;

    .line 1165
    .line 1166
    invoke-direct {v2, v3}, Lzg2;-><init>(Lyg2;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v0, v1, v2}, Lci2;->b1(Lxz4;Lvf3;)V

    .line 1170
    .line 1171
    .line 1172
    iput-object v5, v0, Lci2;->u0:Lyg2;

    .line 1173
    .line 1174
    :cond_37
    new-instance v2, Lyg2;

    .line 1175
    .line 1176
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v0, v1, v2}, Lci2;->b1(Lxz4;Lvf3;)V

    .line 1180
    .line 1181
    .line 1182
    iput-object v2, v0, Lci2;->u0:Lyg2;

    .line 1183
    .line 1184
    goto :goto_1b

    .line 1185
    :cond_38
    if-eqz v3, :cond_39

    .line 1186
    .line 1187
    new-instance v2, Lzg2;

    .line 1188
    .line 1189
    invoke-direct {v2, v3}, Lzg2;-><init>(Lyg2;)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v0, v1, v2}, Lci2;->b1(Lxz4;Lvf3;)V

    .line 1193
    .line 1194
    .line 1195
    iput-object v5, v0, Lci2;->u0:Lyg2;

    .line 1196
    .line 1197
    :cond_39
    :goto_1b
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1198
    .line 1199
    return-object v0

    .line 1200
    :pswitch_a
    move-object/from16 v1, p1

    .line 1201
    .line 1202
    check-cast v1, Lmv7;

    .line 1203
    .line 1204
    iget-object v2, v1, Lmv7;->a:Ljava/lang/String;

    .line 1205
    .line 1206
    move-object/from16 v3, p2

    .line 1207
    .line 1208
    check-cast v3, Ljava/lang/Boolean;

    .line 1209
    .line 1210
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v3

    .line 1214
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1218
    .line 1219
    check-cast v0, Ll27;

    .line 1220
    .line 1221
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1222
    .line 1223
    .line 1224
    iget-object v0, v0, Ll27;->e:Loh7;

    .line 1225
    .line 1226
    :cond_3a
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    move-object v4, v2

    .line 1231
    check-cast v4, Le27;

    .line 1232
    .line 1233
    if-eqz v3, :cond_3b

    .line 1234
    .line 1235
    iget-object v6, v4, Le27;->c:Lc83;

    .line 1236
    .line 1237
    invoke-static {v6, v1}, Loc;->z(Lc83;Ljava/lang/Object;)Lkm5;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v6

    .line 1241
    goto :goto_1c

    .line 1242
    :cond_3b
    iget-object v6, v4, Le27;->c:Lc83;

    .line 1243
    .line 1244
    invoke-static {v6, v1}, Loc;->x(Lc83;Ljava/lang/Object;)Lkm5;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v6

    .line 1248
    :goto_1c
    const/16 v7, 0xb

    .line 1249
    .line 1250
    invoke-static {v4, v5, v6, v5, v7}, Le27;->a(Le27;Lb83;Lkm5;Lc83;I)Le27;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v4

    .line 1254
    invoke-virtual {v0, v2, v4}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v2

    .line 1258
    if-eqz v2, :cond_3a

    .line 1259
    .line 1260
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1261
    .line 1262
    return-object v0

    .line 1263
    :pswitch_data_0
    .packed-switch 0x0
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

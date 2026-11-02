.class public final synthetic Lzw5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Lzw5;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lql6;)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    .line 2
    .line 3
    iput-byte p1, p0, Lzw5;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, Lzw5;->X:B

    .line 4
    .line 5
    const-string v1, "Required value was null."

    .line 6
    .line 7
    sget-object v2, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v5

    .line 32
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move-object v5, v0

    .line 46
    check-cast v5, Ljava/lang/Integer;

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v1, v0}, Lct7;->c(II)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    new-instance v2, Lf88;

    .line 60
    .line 61
    invoke-direct {v2, v0, v1}, Lf88;-><init>(J)V

    .line 62
    .line 63
    .line 64
    return-object v2

    .line 65
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-object/from16 v0, p1

    .line 69
    .line 70
    check-cast v0, Ljava/lang/Float;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    new-instance v1, Lx20;

    .line 77
    .line 78
    invoke-direct {v1, v0}, Lx20;-><init>(F)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_1
    new-instance v0, Ldj2;

    .line 83
    .line 84
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-object/from16 v1, p1

    .line 88
    .line 89
    check-cast v1, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-direct {v0, v1}, Ldj2;-><init>(I)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-object/from16 v0, p1

    .line 103
    .line 104
    check-cast v0, Ljava/util/List;

    .line 105
    .line 106
    new-instance v1, Li78;

    .line 107
    .line 108
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sget-object v3, Lv88;->b:[Lw88;

    .line 113
    .line 114
    sget-object v3, Lgw6;->v:Lfw6;

    .line 115
    .line 116
    iget-object v3, v3, Lfw6;->Y:Lgn2;

    .line 117
    .line 118
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-static {v2, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    if-eqz v2, :cond_2

    .line 124
    .line 125
    invoke-interface {v3, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lv88;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    move-object v2, v5

    .line 133
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-wide v7, v2, Lv88;->a:J

    .line 137
    .line 138
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    invoke-interface {v3, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v5, v0

    .line 152
    check-cast v5, Lv88;

    .line 153
    .line 154
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-wide v2, v5, Lv88;->a:J

    .line 158
    .line 159
    invoke-direct {v1, v7, v8, v2, v3}, Li78;-><init>(JJ)V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-object/from16 v0, p1

    .line 167
    .line 168
    check-cast v0, Ljava/util/List;

    .line 169
    .line 170
    new-instance v1, Lg78;

    .line 171
    .line 172
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/Number;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-direct {v1, v2, v0}, Lg78;-><init>(FF)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :pswitch_4
    new-instance v0, Lx38;

    .line 197
    .line 198
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-object/from16 v1, p1

    .line 202
    .line 203
    check-cast v1, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-direct {v0, v1}, Lx38;-><init>(I)V

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, Ljava/util/List;

    .line 219
    .line 220
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    sget-object v2, Lgw6;->a:Lxd6;

    .line 225
    .line 226
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-static {v1, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_5

    .line 233
    .line 234
    :cond_4
    move-object v1, v5

    .line 235
    goto :goto_2

    .line 236
    :cond_5
    if-eqz v1, :cond_4

    .line 237
    .line 238
    iget-object v2, v2, Lxd6;->Z:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Lgn2;

    .line 241
    .line 242
    invoke-interface {v2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Ljava/util/List;

    .line 247
    .line 248
    :goto_2
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-eqz v0, :cond_6

    .line 253
    .line 254
    move-object v5, v0

    .line 255
    check-cast v5, Ljava/lang/String;

    .line 256
    .line 257
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    new-instance v0, Lql;

    .line 261
    .line 262
    invoke-direct {v0, v1, v5}, Lql;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-object/from16 v0, p1

    .line 270
    .line 271
    check-cast v0, Ljava/util/List;

    .line 272
    .line 273
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    sget-object v2, Lgw6;->h:Lxd6;

    .line 278
    .line 279
    iget-object v2, v2, Lxd6;->Z:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v2, Lgn2;

    .line 282
    .line 283
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 284
    .line 285
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_8

    .line 290
    .line 291
    :cond_7
    move-object v1, v5

    .line 292
    goto :goto_3

    .line 293
    :cond_8
    if-eqz v1, :cond_7

    .line 294
    .line 295
    invoke-interface {v2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    check-cast v1, Lqe7;

    .line 300
    .line 301
    :goto_3
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-static {v4, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-eqz v6, :cond_a

    .line 310
    .line 311
    :cond_9
    move-object v4, v5

    .line 312
    goto :goto_4

    .line 313
    :cond_a
    if-eqz v4, :cond_9

    .line 314
    .line 315
    invoke-interface {v2, v4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    check-cast v4, Lqe7;

    .line 320
    .line 321
    :goto_4
    const/4 v6, 0x2

    .line 322
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-static {v6, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    if-eqz v7, :cond_c

    .line 331
    .line 332
    :cond_b
    move-object v6, v5

    .line 333
    goto :goto_5

    .line 334
    :cond_c
    if-eqz v6, :cond_b

    .line 335
    .line 336
    invoke-interface {v2, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    check-cast v6, Lqe7;

    .line 341
    .line 342
    :goto_5
    const/4 v7, 0x3

    .line 343
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-static {v0, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_d

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_d
    if-eqz v0, :cond_e

    .line 355
    .line 356
    invoke-interface {v2, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    move-object v5, v0

    .line 361
    check-cast v5, Lqe7;

    .line 362
    .line 363
    :cond_e
    :goto_6
    new-instance v0, Lc88;

    .line 364
    .line 365
    invoke-direct {v0, v1, v4, v6, v5}, Lc88;-><init>(Lqe7;Lqe7;Lqe7;Lqe7;)V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_7
    return-object p1

    .line 370
    :pswitch_8
    move-object/from16 v0, p1

    .line 371
    .line 372
    check-cast v0, Ljava/util/Map;

    .line 373
    .line 374
    new-instance v1, Ljv6;

    .line 375
    .line 376
    invoke-direct {v1, v0}, Ljv6;-><init>(Ljava/util/Map;)V

    .line 377
    .line 378
    .line 379
    return-object v1

    .line 380
    :pswitch_9
    move-object/from16 v0, p1

    .line 381
    .line 382
    check-cast v0, Lqg5;

    .line 383
    .line 384
    iget-object v0, v0, Lqg5;->X:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 387
    .line 388
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v1, Lkw4;->a:Lkw4;

    .line 393
    .line 394
    invoke-static {v0}, Lkw4;->o(Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    xor-int/2addr v0, v4

    .line 399
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    return-object v0

    .line 404
    :pswitch_a
    move-object/from16 v0, p1

    .line 405
    .line 406
    check-cast v0, Ljava/util/List;

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    return-object v2

    .line 412
    :pswitch_b
    move-object/from16 v3, p1

    .line 413
    .line 414
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 415
    .line 416
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 417
    .line 418
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    const/16 v25, 0x0

    .line 426
    .line 427
    const v26, 0x6fffff

    .line 428
    .line 429
    .line 430
    const/4 v5, 0x0

    .line 431
    const/4 v6, 0x0

    .line 432
    const/4 v7, 0x0

    .line 433
    const/4 v8, 0x0

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
    invoke-static/range {v4 .. v26}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    const/4 v8, 0x0

    .line 464
    const/16 v9, 0x1d

    .line 465
    .line 466
    const/4 v4, 0x0

    .line 467
    invoke-static/range {v3 .. v9}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    return-object v0

    .line 472
    :pswitch_c
    move-object v0, v1

    .line 473
    move-object/from16 v1, p1

    .line 474
    .line 475
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 476
    .line 477
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->d()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    if-eqz v2, :cond_f

    .line 491
    .line 492
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    const/16 v27, 0x0

    .line 497
    .line 498
    const v28, 0x7fff7f

    .line 499
    .line 500
    .line 501
    const/4 v7, 0x0

    .line 502
    const/4 v8, 0x0

    .line 503
    const/4 v9, 0x0

    .line 504
    const/4 v10, 0x0

    .line 505
    const/4 v11, 0x0

    .line 506
    const/4 v12, 0x0

    .line 507
    const/4 v13, 0x0

    .line 508
    const/4 v15, 0x0

    .line 509
    const/16 v16, 0x0

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/16 v18, 0x0

    .line 514
    .line 515
    const/16 v19, 0x0

    .line 516
    .line 517
    const/16 v20, 0x0

    .line 518
    .line 519
    const/16 v21, 0x0

    .line 520
    .line 521
    const/16 v22, 0x0

    .line 522
    .line 523
    const/16 v23, 0x0

    .line 524
    .line 525
    const/16 v24, 0x0

    .line 526
    .line 527
    const/16 v25, 0x0

    .line 528
    .line 529
    const/16 v26, 0x0

    .line 530
    .line 531
    invoke-static/range {v6 .. v28}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    const/4 v6, 0x0

    .line 536
    const/16 v7, 0x1d

    .line 537
    .line 538
    const/4 v2, 0x0

    .line 539
    const/4 v4, 0x0

    .line 540
    const/4 v5, 0x0

    .line 541
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    goto :goto_7

    .line 546
    :cond_f
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    :goto_7
    return-object v5

    .line 550
    :pswitch_d
    move-object/from16 v6, p1

    .line 551
    .line 552
    check-cast v6, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 553
    .line 554
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 555
    .line 556
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    const/16 v28, 0x0

    .line 564
    .line 565
    const v29, 0x77ffff

    .line 566
    .line 567
    .line 568
    const/4 v8, 0x0

    .line 569
    const/4 v9, 0x0

    .line 570
    const/4 v10, 0x0

    .line 571
    const/4 v11, 0x0

    .line 572
    const/4 v12, 0x0

    .line 573
    const/4 v13, 0x0

    .line 574
    const/4 v14, 0x0

    .line 575
    const/4 v15, 0x0

    .line 576
    const/16 v16, 0x0

    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    const/16 v18, 0x0

    .line 581
    .line 582
    const/16 v19, 0x0

    .line 583
    .line 584
    const/16 v20, 0x0

    .line 585
    .line 586
    const/16 v21, 0x0

    .line 587
    .line 588
    const/16 v22, 0x0

    .line 589
    .line 590
    const/16 v23, 0x0

    .line 591
    .line 592
    const/16 v24, 0x0

    .line 593
    .line 594
    const/16 v25, 0x0

    .line 595
    .line 596
    const/16 v26, 0x0

    .line 597
    .line 598
    const/16 v27, 0x0

    .line 599
    .line 600
    invoke-static/range {v7 .. v29}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 601
    .line 602
    .line 603
    move-result-object v8

    .line 604
    const/4 v11, 0x0

    .line 605
    const/16 v12, 0x1d

    .line 606
    .line 607
    const/4 v7, 0x0

    .line 608
    invoke-static/range {v6 .. v12}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    return-object v0

    .line 613
    :pswitch_e
    move-object v0, v1

    .line 614
    move-object/from16 v1, p1

    .line 615
    .line 616
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 617
    .line 618
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 619
    .line 620
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 624
    .line 625
    .line 626
    move-result-object v6

    .line 627
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->d()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    if-eqz v2, :cond_10

    .line 632
    .line 633
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v15

    .line 637
    const/16 v27, 0x0

    .line 638
    .line 639
    const v28, 0x7ffeff

    .line 640
    .line 641
    .line 642
    const/4 v7, 0x0

    .line 643
    const/4 v8, 0x0

    .line 644
    const/4 v9, 0x0

    .line 645
    const/4 v10, 0x0

    .line 646
    const/4 v11, 0x0

    .line 647
    const/4 v12, 0x0

    .line 648
    const/4 v13, 0x0

    .line 649
    const/4 v14, 0x0

    .line 650
    const/16 v16, 0x0

    .line 651
    .line 652
    const/16 v17, 0x0

    .line 653
    .line 654
    const/16 v18, 0x0

    .line 655
    .line 656
    const/16 v19, 0x0

    .line 657
    .line 658
    const/16 v20, 0x0

    .line 659
    .line 660
    const/16 v21, 0x0

    .line 661
    .line 662
    const/16 v22, 0x0

    .line 663
    .line 664
    const/16 v23, 0x0

    .line 665
    .line 666
    const/16 v24, 0x0

    .line 667
    .line 668
    const/16 v25, 0x0

    .line 669
    .line 670
    const/16 v26, 0x0

    .line 671
    .line 672
    invoke-static/range {v6 .. v28}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    const/4 v6, 0x0

    .line 677
    const/16 v7, 0x1d

    .line 678
    .line 679
    const/4 v2, 0x0

    .line 680
    const/4 v4, 0x0

    .line 681
    const/4 v5, 0x0

    .line 682
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    goto :goto_8

    .line 687
    :cond_10
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    :goto_8
    return-object v5

    .line 691
    :pswitch_f
    move-object/from16 v6, p1

    .line 692
    .line 693
    check-cast v6, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 694
    .line 695
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 696
    .line 697
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 701
    .line 702
    .line 703
    move-result-object v7

    .line 704
    const/16 v28, 0x0

    .line 705
    .line 706
    const v29, 0x6fffff

    .line 707
    .line 708
    .line 709
    const/4 v8, 0x0

    .line 710
    const/4 v9, 0x0

    .line 711
    const/4 v10, 0x0

    .line 712
    const/4 v11, 0x0

    .line 713
    const/4 v12, 0x0

    .line 714
    const/4 v13, 0x0

    .line 715
    const/4 v14, 0x0

    .line 716
    const/4 v15, 0x0

    .line 717
    const/16 v16, 0x0

    .line 718
    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    const/16 v18, 0x0

    .line 722
    .line 723
    const/16 v19, 0x0

    .line 724
    .line 725
    const/16 v20, 0x0

    .line 726
    .line 727
    const/16 v21, 0x0

    .line 728
    .line 729
    const/16 v22, 0x0

    .line 730
    .line 731
    const/16 v23, 0x0

    .line 732
    .line 733
    const/16 v24, 0x0

    .line 734
    .line 735
    const/16 v25, 0x0

    .line 736
    .line 737
    const/16 v26, 0x0

    .line 738
    .line 739
    const/16 v27, 0x0

    .line 740
    .line 741
    invoke-static/range {v7 .. v29}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 742
    .line 743
    .line 744
    move-result-object v8

    .line 745
    const/4 v11, 0x0

    .line 746
    const/16 v12, 0x1d

    .line 747
    .line 748
    const/4 v7, 0x0

    .line 749
    invoke-static/range {v6 .. v12}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    return-object v0

    .line 754
    :pswitch_10
    move-object/from16 v1, p1

    .line 755
    .line 756
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 757
    .line 758
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    const/16 v23, 0x0

    .line 768
    .line 769
    const v24, 0x77ffff

    .line 770
    .line 771
    .line 772
    const/4 v3, 0x0

    .line 773
    const/4 v4, 0x0

    .line 774
    const/4 v5, 0x0

    .line 775
    const/4 v6, 0x0

    .line 776
    const/4 v7, 0x0

    .line 777
    const/4 v8, 0x0

    .line 778
    const/4 v9, 0x0

    .line 779
    const/4 v10, 0x0

    .line 780
    const/4 v11, 0x0

    .line 781
    const/4 v12, 0x0

    .line 782
    const/4 v13, 0x0

    .line 783
    const/4 v14, 0x0

    .line 784
    const/4 v15, 0x0

    .line 785
    const/16 v16, 0x0

    .line 786
    .line 787
    const/16 v17, 0x0

    .line 788
    .line 789
    const/16 v18, 0x0

    .line 790
    .line 791
    const/16 v19, 0x0

    .line 792
    .line 793
    const/16 v20, 0x0

    .line 794
    .line 795
    const/16 v21, 0x0

    .line 796
    .line 797
    const/16 v22, 0x0

    .line 798
    .line 799
    invoke-static/range {v2 .. v24}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    const/4 v6, 0x0

    .line 804
    const/16 v7, 0x1d

    .line 805
    .line 806
    const/4 v2, 0x0

    .line 807
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    return-object v0

    .line 812
    :pswitch_11
    move-object/from16 v0, p1

    .line 813
    .line 814
    check-cast v0, Ldo5;

    .line 815
    .line 816
    return-object v2

    .line 817
    :pswitch_12
    move-object/from16 v0, p1

    .line 818
    .line 819
    check-cast v0, Llb1;

    .line 820
    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    new-instance v0, Lg65;

    .line 825
    .line 826
    invoke-direct {v0, v3}, Lg65;-><init>(I)V

    .line 827
    .line 828
    .line 829
    throw v0

    .line 830
    :pswitch_13
    move-object/from16 v0, p1

    .line 831
    .line 832
    check-cast v0, Ldn8;

    .line 833
    .line 834
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 838
    .line 839
    return-object v0

    .line 840
    :pswitch_14
    move-object/from16 v0, p1

    .line 841
    .line 842
    check-cast v0, Lk79;

    .line 843
    .line 844
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    sget-object v1, Lof6;->f0:Loi5;

    .line 848
    .line 849
    iget-object v0, v0, Lk79;->a:Loi5;

    .line 850
    .line 851
    invoke-static {v0}, Lx97;->N(Loi5;)Z

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    return-object v0

    .line 860
    :pswitch_15
    move-object/from16 v0, p1

    .line 861
    .line 862
    check-cast v0, Ljava/lang/Boolean;

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    sget v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;->s0:I

    .line 868
    .line 869
    return-object v2

    .line 870
    :pswitch_16
    move-object/from16 v0, p1

    .line 871
    .line 872
    check-cast v0, Ljava/util/List;

    .line 873
    .line 874
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    return-object v2

    .line 878
    :pswitch_17
    move-object/from16 v0, p1

    .line 879
    .line 880
    check-cast v0, Lbo3;

    .line 881
    .line 882
    invoke-virtual {v0}, Lbo3;->c()Lbq3;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    return-object v0

    .line 887
    :pswitch_18
    move-object/from16 v0, p1

    .line 888
    .line 889
    check-cast v0, Lbo3;

    .line 890
    .line 891
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    instance-of v0, v0, Lbq3;

    .line 895
    .line 896
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    return-object v0

    .line 901
    :pswitch_19
    move-object/from16 v0, p1

    .line 902
    .line 903
    check-cast v0, Lbo3;

    .line 904
    .line 905
    invoke-virtual {v0}, Lbo3;->c()Lbq3;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    return-object v0

    .line 910
    :pswitch_1a
    move-object/from16 v0, p1

    .line 911
    .line 912
    check-cast v0, Lbo3;

    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    instance-of v0, v0, Lbq3;

    .line 918
    .line 919
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    return-object v0

    .line 924
    :pswitch_1b
    move-object/from16 v0, p1

    .line 925
    .line 926
    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 927
    .line 928
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 929
    .line 930
    if-eqz v1, :cond_11

    .line 931
    .line 932
    new-instance v5, Lqg5;

    .line 933
    .line 934
    invoke-direct {v5, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    :cond_11
    return-object v5

    .line 938
    :pswitch_1c
    move-object/from16 v0, p1

    .line 939
    .line 940
    check-cast v0, Lf17;

    .line 941
    .line 942
    sget-object v1, Lqw5;->d:Lqw5;

    .line 943
    .line 944
    sget-object v3, Ld17;->a:[Lnw3;

    .line 945
    .line 946
    sget-object v3, Lc17;->c:Le17;

    .line 947
    .line 948
    sget-object v5, Ld17;->a:[Lnw3;

    .line 949
    .line 950
    aget-object v4, v5, v4

    .line 951
    .line 952
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    invoke-interface {v0, v3, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    return-object v2

    .line 959
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

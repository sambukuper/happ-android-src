.class public final synthetic Lal5;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lal5;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lmo2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Lal5;->X:B

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x0

    .line 11
    sget-object v7, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    packed-switch v2, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lbx5;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lbx5;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Integer;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    check-cast v1, Lgn2;

    .line 28
    .line 29
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Le38;

    .line 32
    .line 33
    iget-object v0, v0, Le38;->b:Lj05;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lj05;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-object v7

    .line 39
    :pswitch_1
    check-cast v1, Lz85;

    .line 40
    .line 41
    iget-wide v10, v1, Lz85;->a:J

    .line 42
    .line 43
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v9, v0

    .line 46
    check-cast v9, Ll38;

    .line 47
    .line 48
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lr38;->a:Lox1;

    .line 52
    .line 53
    invoke-static {v9, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v12, v0

    .line 58
    check-cast v12, Lq38;

    .line 59
    .line 60
    if-nez v12, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance v13, Lk38;

    .line 64
    .line 65
    invoke-direct {v13, v9, v10, v11}, Lk38;-><init>(Ll38;J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v9}, Ljx4;->M0()Lb71;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v8, Ls0;

    .line 73
    .line 74
    const/4 v14, 0x0

    .line 75
    invoke-direct/range {v8 .. v14}, Ls0;-><init>(Ll38;JLq38;Lk38;Lq51;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v6, v6, v8, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 79
    .line 80
    .line 81
    :goto_0
    return-object v7

    .line 82
    :pswitch_2
    check-cast v1, Lq51;

    .line 83
    .line 84
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lxg1;

    .line 87
    .line 88
    invoke-interface {v0, v1}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :pswitch_3
    check-cast v1, Llu7;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lmu7;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lmu7;->e(Llu7;)V

    .line 103
    .line 104
    .line 105
    return-object v7

    .line 106
    :pswitch_4
    check-cast v1, Lwt7;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lyt7;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lyt7;->f(Lwt7;)V

    .line 116
    .line 117
    .line 118
    return-object v7

    .line 119
    :pswitch_5
    check-cast v1, Lgr7;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Lkr7;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lkr7;->f(Lgr7;)V

    .line 129
    .line 130
    .line 131
    return-object v7

    .line 132
    :pswitch_6
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 133
    .line 134
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Lnp7;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Lnp7;->e(Ljava/lang/String;)Lj2;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0

    .line 150
    :pswitch_7
    check-cast v1, Lap7;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lnp7;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lnp7;->g(Lap7;)V

    .line 160
    .line 161
    .line 162
    return-object v7

    .line 163
    :pswitch_8
    check-cast v1, Ltv5;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lvv5;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lvv5;->f(Ltv5;)V

    .line 173
    .line 174
    .line 175
    return-object v7

    .line 176
    :pswitch_9
    check-cast v1, Lfw5;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Lgw5;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Lgw5;->e(Lfw5;)V

    .line 186
    .line 187
    .line 188
    return-object v7

    .line 189
    :pswitch_a
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lbx5;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Lbx5;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Ljava/lang/Integer;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_b
    check-cast v1, Ll67;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Lp67;

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Lp67;->f(Ll67;)V

    .line 210
    .line 211
    .line 212
    return-object v7

    .line 213
    :pswitch_c
    check-cast v1, Lxa3;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lza3;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Lza3;->f(Lxa3;)V

    .line 223
    .line 224
    .line 225
    return-object v7

    .line 226
    :pswitch_d
    check-cast v1, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Lfa0;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->Q()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-eqz v0, :cond_1

    .line 243
    .line 244
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->Q()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    goto/16 :goto_10

    .line 249
    .line 250
    :cond_1
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const/16 v2, 0x23

    .line 255
    .line 256
    invoke-static {v0, v2}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    const-string v2, ""

    .line 261
    .line 262
    if-eqz v0, :cond_2

    .line 263
    .line 264
    move-object v0, v2

    .line 265
    goto :goto_1

    .line 266
    :cond_2
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    :goto_1
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v4, "Required value was null."

    .line 275
    .line 276
    if-eqz v3, :cond_5

    .line 277
    .line 278
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    if-eqz v3, :cond_3

    .line 283
    .line 284
    new-instance v7, Lsu/happ/proxyutility/dto/InstallId;

    .line 285
    .line 286
    invoke-direct {v7, v3}, Lsu/happ/proxyutility/dto/InstallId;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_3
    move-object v7, v6

    .line 291
    :goto_2
    if-eqz v7, :cond_4

    .line 292
    .line 293
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/InstallId;->c()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    const-string v4, "installid="

    .line 298
    .line 299
    invoke-static {v4, v3}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    :goto_3
    move-object v7, v3

    .line 304
    goto :goto_5

    .line 305
    :cond_4
    invoke-static {v4}, Lbt;->q(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_10

    .line 309
    .line 310
    :cond_5
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    if-eqz v3, :cond_8

    .line 315
    .line 316
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    if-eqz v3, :cond_6

    .line 321
    .line 322
    new-instance v7, Lsu/happ/proxyutility/dto/ProviderId;

    .line 323
    .line 324
    invoke-direct {v7, v3}, Lsu/happ/proxyutility/dto/ProviderId;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_6
    move-object v7, v6

    .line 329
    :goto_4
    if-eqz v7, :cond_7

    .line 330
    .line 331
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    const-string v4, "providerid="

    .line 336
    .line 337
    invoke-static {v4, v3}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    goto :goto_3

    .line 342
    :cond_7
    invoke-static {v4}, Lbt;->q(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_10

    .line 346
    .line 347
    :cond_8
    move-object v7, v6

    .line 348
    :goto_5
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->E()Ljava/util/Map;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    if-eqz v3, :cond_b

    .line 353
    .line 354
    invoke-static {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->e(Ljava/util/Map;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-static {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    invoke-static {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->k(Ljava/util/Map;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    filled-new-array {v4, v8, v3}, [Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    invoke-static {v3}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-ne v4, v5, :cond_9

    .line 379
    .line 380
    move-object v8, v3

    .line 381
    goto :goto_6

    .line 382
    :cond_9
    move-object v8, v6

    .line 383
    :goto_6
    if-eqz v8, :cond_a

    .line 384
    .line 385
    const/4 v12, 0x0

    .line 386
    const/16 v13, 0x3e

    .line 387
    .line 388
    const-string v9, ","

    .line 389
    .line 390
    const/4 v10, 0x0

    .line 391
    const/4 v11, 0x0

    .line 392
    invoke-static/range {v8 .. v13}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    goto :goto_7

    .line 397
    :cond_a
    move-object v3, v6

    .line 398
    :goto_7
    if-eqz v3, :cond_b

    .line 399
    .line 400
    const-string v4, "fragment="

    .line 401
    .line 402
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    move-object v8, v3

    .line 407
    goto :goto_8

    .line 408
    :cond_b
    move-object v8, v6

    .line 409
    :goto_8
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->L()Ljava/lang/Boolean;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    if-eqz v3, :cond_c

    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    new-instance v4, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v5, "insecure="

    .line 422
    .line 423
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    move-object v9, v3

    .line 434
    goto :goto_9

    .line 435
    :cond_c
    move-object v9, v6

    .line 436
    :goto_9
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->H()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    if-eqz v3, :cond_d

    .line 441
    .line 442
    const-string v4, "host="

    .line 443
    .line 444
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    move-object v10, v3

    .line 449
    goto :goto_a

    .line 450
    :cond_d
    move-object v10, v6

    .line 451
    :goto_a
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->T()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    if-eqz v3, :cond_e

    .line 456
    .line 457
    const-string v4, "resolve-address="

    .line 458
    .line 459
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    move-object v11, v3

    .line 464
    goto :goto_b

    .line 465
    :cond_e
    move-object v11, v6

    .line 466
    :goto_b
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->I()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    if-eqz v3, :cond_f

    .line 471
    .line 472
    const-string v4, "hwidlink="

    .line 473
    .line 474
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    move-object v12, v3

    .line 479
    goto :goto_c

    .line 480
    :cond_f
    move-object v12, v6

    .line 481
    :goto_c
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    if-eqz v3, :cond_10

    .line 486
    .line 487
    const-string v3, "hide-settings=true"

    .line 488
    .line 489
    move-object v13, v3

    .line 490
    goto :goto_d

    .line 491
    :cond_10
    move-object v13, v6

    .line 492
    :goto_d
    filled-new-array/range {v7 .. v13}, [Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-static {v3}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    if-nez v4, :cond_11

    .line 505
    .line 506
    move-object v7, v3

    .line 507
    goto :goto_e

    .line 508
    :cond_11
    move-object v7, v6

    .line 509
    :goto_e
    if-eqz v7, :cond_12

    .line 510
    .line 511
    const/4 v11, 0x0

    .line 512
    const/16 v12, 0x3e

    .line 513
    .line 514
    const-string v8, "&"

    .line 515
    .line 516
    const/4 v9, 0x0

    .line 517
    const/4 v10, 0x0

    .line 518
    invoke-static/range {v7 .. v12}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    const-string v4, "?"

    .line 523
    .line 524
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v6

    .line 528
    :cond_12
    if-nez v6, :cond_13

    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_13
    move-object v2, v6

    .line 532
    :goto_f
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->m()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    const-string v3, "#"

    .line 537
    .line 538
    invoke-static {v1, v3, v0, v2}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    :goto_10
    return-object v6

    .line 543
    :pswitch_e
    check-cast v1, Lqq6;

    .line 544
    .line 545
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Lsq6;

    .line 551
    .line 552
    invoke-virtual {v0, v1}, Lsq6;->f(Lqq6;)V

    .line 553
    .line 554
    .line 555
    return-object v7

    .line 556
    :pswitch_f
    check-cast v1, Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;

    .line 564
    .line 565
    sget v2, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;->U0:I

    .line 566
    .line 567
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;->A()Leq6;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget-object v2, v0, Leq6;->g:Ljava/util/ArrayList;

    .line 572
    .line 573
    iget-object v5, v0, Leq6;->f:Ljava/util/ArrayList;

    .line 574
    .line 575
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v8

    .line 579
    if-nez v8, :cond_17

    .line 580
    .line 581
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    const-string v5, "geosite:"

    .line 585
    .line 586
    invoke-static {v1, v4, v5}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    if-eqz v4, :cond_14

    .line 591
    .line 592
    sget-object v4, Lmr2;->Y:Lmr2;

    .line 593
    .line 594
    goto :goto_11

    .line 595
    :cond_14
    sget-object v4, Lmr2;->Z:Lmr2;

    .line 596
    .line 597
    :goto_11
    iget-object v8, v0, Leq6;->b:Lvz7;

    .line 598
    .line 599
    invoke-virtual {v8}, Lvz7;->getValue()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    check-cast v8, Lmn6;

    .line 604
    .line 605
    iget-object v9, v0, Leq6;->e:Ljava/lang/String;

    .line 606
    .line 607
    new-instance v10, Lsn;

    .line 608
    .line 609
    const/16 v11, 0x17

    .line 610
    .line 611
    invoke-direct {v10, v0, v4, v1, v11}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 612
    .line 613
    .line 614
    sget-object v1, Lmn6;->j:Lvz7;

    .line 615
    .line 616
    invoke-virtual {v8, v9, v6, v10}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 617
    .line 618
    .line 619
    iget-object v1, v0, Leq6;->c:Lmr2;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    if-eqz v1, :cond_16

    .line 626
    .line 627
    if-ne v1, v3, :cond_15

    .line 628
    .line 629
    const-string v5, "geoip:"

    .line 630
    .line 631
    goto :goto_12

    .line 632
    :cond_15
    invoke-static {}, Lb61;->c()V

    .line 633
    .line 634
    .line 635
    goto :goto_13

    .line 636
    :cond_16
    :goto_12
    invoke-static {v2}, Law0;->b0(Ljava/util/List;)V

    .line 637
    .line 638
    .line 639
    iget-object v1, v0, Leq6;->k:Lyz4;

    .line 640
    .line 641
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    invoke-virtual {v0, v3, v2}, Leq6;->e(ILjava/util/ArrayList;)Ljava/util/ArrayList;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-virtual {v1, v2}, Lqc4;->j(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0}, Leq6;->f()Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    if-eqz v1, :cond_17

    .line 657
    .line 658
    iget-object v0, v0, Leq6;->i:Lgn2;

    .line 659
    .line 660
    invoke-static {v1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    :cond_17
    move-object v6, v7

    .line 668
    :goto_13
    return-object v6

    .line 669
    :pswitch_10
    check-cast v1, Luo6;

    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v0, Lep6;

    .line 677
    .line 678
    invoke-virtual {v0, v1}, Lep6;->i(Luo6;)V

    .line 679
    .line 680
    .line 681
    return-object v7

    .line 682
    :pswitch_11
    check-cast v1, Lfw5;

    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, Lgw5;

    .line 690
    .line 691
    invoke-virtual {v0, v1}, Lgw5;->e(Lfw5;)V

    .line 692
    .line 693
    .line 694
    return-object v7

    .line 695
    :pswitch_12
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, Lbx5;

    .line 698
    .line 699
    invoke-virtual {v0, v1}, Lbx5;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    check-cast v0, Ljava/lang/Integer;

    .line 704
    .line 705
    return-object v0

    .line 706
    :pswitch_13
    check-cast v1, Ljava/util/List;

    .line 707
    .line 708
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v0, Ls16;

    .line 714
    .line 715
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    new-instance v0, Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 721
    .line 722
    .line 723
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    :cond_18
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 728
    .line 729
    .line 730
    move-result v5

    .line 731
    if-eqz v5, :cond_19

    .line 732
    .line 733
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v5

    .line 737
    move-object v8, v5

    .line 738
    check-cast v8, Lkk0;

    .line 739
    .line 740
    instance-of v8, v8, Loe6;

    .line 741
    .line 742
    if-eqz v8, :cond_18

    .line 743
    .line 744
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    goto :goto_14

    .line 748
    :cond_19
    invoke-interface {v1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 749
    .line 750
    .line 751
    invoke-static {v0}, Lwv0;->M0(Ljava/util/List;)Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    if-eqz v2, :cond_1a

    .line 764
    .line 765
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    check-cast v2, Lkk0;

    .line 770
    .line 771
    invoke-interface {v1, v4, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    goto :goto_15

    .line 775
    :cond_1a
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    invoke-interface {v1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    :cond_1b
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 784
    .line 785
    .line 786
    move-result v2

    .line 787
    if-eqz v2, :cond_1c

    .line 788
    .line 789
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    check-cast v2, Lkk0;

    .line 794
    .line 795
    instance-of v2, v2, Lpe6;

    .line 796
    .line 797
    if-eqz v2, :cond_1b

    .line 798
    .line 799
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    goto :goto_16

    .line 804
    :cond_1c
    const/4 v0, -0x1

    .line 805
    :goto_16
    if-lez v0, :cond_21

    .line 806
    .line 807
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    check-cast v2, Lpe6;

    .line 815
    .line 816
    move v5, v4

    .line 817
    :goto_17
    if-ge v5, v0, :cond_21

    .line 818
    .line 819
    invoke-interface {v1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v8

    .line 823
    check-cast v8, Lkk0;

    .line 824
    .line 825
    instance-of v9, v8, Lqe6;

    .line 826
    .line 827
    if-eqz v9, :cond_1d

    .line 828
    .line 829
    move-object v9, v8

    .line 830
    check-cast v9, Lqe6;

    .line 831
    .line 832
    iget-object v9, v9, Lqe6;->b:Lux0;

    .line 833
    .line 834
    goto :goto_18

    .line 835
    :cond_1d
    instance-of v9, v8, Lpe6;

    .line 836
    .line 837
    if-eqz v9, :cond_1e

    .line 838
    .line 839
    move-object v9, v8

    .line 840
    check-cast v9, Lpe6;

    .line 841
    .line 842
    iget-object v9, v9, Lpe6;->a:Lux0;

    .line 843
    .line 844
    goto :goto_18

    .line 845
    :cond_1e
    move-object v9, v6

    .line 846
    :goto_18
    if-eqz v9, :cond_1f

    .line 847
    .line 848
    iget-object v10, v2, Lpe6;->a:Lux0;

    .line 849
    .line 850
    new-instance v11, Lvj2;

    .line 851
    .line 852
    const/16 v12, 0x1b

    .line 853
    .line 854
    invoke-direct {v11, v9, v12}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v10, v11}, Lrm3;->D(Lgn2;)Lgq1;

    .line 858
    .line 859
    .line 860
    :cond_1f
    instance-of v9, v8, Lve6;

    .line 861
    .line 862
    if-eqz v9, :cond_20

    .line 863
    .line 864
    check-cast v8, Lve6;

    .line 865
    .line 866
    iget-object v8, v8, Lve6;->a:Lsy8;

    .line 867
    .line 868
    invoke-virtual {v8, v6}, Lsy8;->a(Lai0;)V

    .line 869
    .line 870
    .line 871
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 872
    .line 873
    goto :goto_17

    .line 874
    :cond_21
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 875
    .line 876
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 877
    .line 878
    .line 879
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    move v5, v4

    .line 884
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 885
    .line 886
    .line 887
    move-result v8

    .line 888
    if-eqz v8, :cond_2a

    .line 889
    .line 890
    add-int/lit8 v8, v5, 0x1

    .line 891
    .line 892
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v9

    .line 896
    check-cast v9, Lkk0;

    .line 897
    .line 898
    instance-of v10, v9, Lve6;

    .line 899
    .line 900
    if-eqz v10, :cond_27

    .line 901
    .line 902
    move-object v10, v9

    .line 903
    check-cast v10, Lve6;

    .line 904
    .line 905
    iget-object v11, v10, Lve6;->a:Lsy8;

    .line 906
    .line 907
    iget-object v11, v11, Lsy8;->a:Ljava/lang/String;

    .line 908
    .line 909
    iget-object v10, v10, Lve6;->b:Ljava/util/List;

    .line 910
    .line 911
    new-instance v12, Lvi0;

    .line 912
    .line 913
    invoke-direct {v12, v11}, Lvi0;-><init>(Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    invoke-static {v10, v12}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 917
    .line 918
    .line 919
    move-result-object v10

    .line 920
    invoke-static {v10}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 921
    .line 922
    .line 923
    move-result-object v10

    .line 924
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 925
    .line 926
    .line 927
    move-result v12

    .line 928
    move v13, v8

    .line 929
    :goto_1a
    if-ge v13, v12, :cond_26

    .line 930
    .line 931
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v14

    .line 935
    check-cast v14, Lkk0;

    .line 936
    .line 937
    instance-of v15, v14, Lqe6;

    .line 938
    .line 939
    if-eqz v15, :cond_22

    .line 940
    .line 941
    check-cast v14, Lqe6;

    .line 942
    .line 943
    iget-object v14, v14, Lqe6;->a:Ljava/lang/String;

    .line 944
    .line 945
    new-instance v15, Lvi0;

    .line 946
    .line 947
    invoke-direct {v15, v14}, Lvi0;-><init>(Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    invoke-interface {v10, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 951
    .line 952
    .line 953
    move-result v14

    .line 954
    goto :goto_1c

    .line 955
    :cond_22
    instance-of v15, v14, Lve6;

    .line 956
    .line 957
    if-eqz v15, :cond_23

    .line 958
    .line 959
    check-cast v14, Lve6;

    .line 960
    .line 961
    iget-object v15, v14, Lve6;->a:Lsy8;

    .line 962
    .line 963
    iget-object v15, v15, Lsy8;->a:Ljava/lang/String;

    .line 964
    .line 965
    iget-object v14, v14, Lve6;->b:Ljava/util/List;

    .line 966
    .line 967
    new-instance v3, Lvi0;

    .line 968
    .line 969
    invoke-direct {v3, v15}, Lvi0;-><init>(Ljava/lang/String;)V

    .line 970
    .line 971
    .line 972
    invoke-static {v14, v3}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    invoke-static {v3}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 977
    .line 978
    .line 979
    move-result-object v3

    .line 980
    invoke-static {v11, v15}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v14

    .line 984
    if-nez v14, :cond_24

    .line 985
    .line 986
    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    if-nez v3, :cond_23

    .line 991
    .line 992
    goto :goto_1b

    .line 993
    :cond_23
    move v14, v4

    .line 994
    goto :goto_1c

    .line 995
    :cond_24
    :goto_1b
    const/4 v14, 0x1

    .line 996
    :goto_1c
    if-eqz v14, :cond_25

    .line 997
    .line 998
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    goto :goto_1e

    .line 1003
    :cond_25
    add-int/lit8 v13, v13, 0x1

    .line 1004
    .line 1005
    const/4 v3, 0x1

    .line 1006
    goto :goto_1a

    .line 1007
    :cond_26
    move-object v3, v6

    .line 1008
    goto :goto_1e

    .line 1009
    :cond_27
    instance-of v3, v9, Lqe6;

    .line 1010
    .line 1011
    if-eqz v3, :cond_26

    .line 1012
    .line 1013
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1014
    .line 1015
    .line 1016
    move-result v3

    .line 1017
    move v10, v8

    .line 1018
    :goto_1d
    if-ge v10, v3, :cond_26

    .line 1019
    .line 1020
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v11

    .line 1024
    check-cast v11, Lkk0;

    .line 1025
    .line 1026
    instance-of v12, v11, Lqe6;

    .line 1027
    .line 1028
    if-eqz v12, :cond_28

    .line 1029
    .line 1030
    check-cast v11, Lqe6;

    .line 1031
    .line 1032
    iget-object v11, v11, Lqe6;->a:Ljava/lang/String;

    .line 1033
    .line 1034
    move-object v12, v9

    .line 1035
    check-cast v12, Lqe6;

    .line 1036
    .line 1037
    iget-object v12, v12, Lqe6;->a:Ljava/lang/String;

    .line 1038
    .line 1039
    invoke-static {v11, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v11

    .line 1043
    if-eqz v11, :cond_28

    .line 1044
    .line 1045
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    goto :goto_1e

    .line 1050
    :cond_28
    add-int/lit8 v10, v10, 0x1

    .line 1051
    .line 1052
    goto :goto_1d

    .line 1053
    :goto_1e
    if-eqz v3, :cond_29

    .line 1054
    .line 1055
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1056
    .line 1057
    .line 1058
    move-result v3

    .line 1059
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v3

    .line 1063
    check-cast v3, Lkk0;

    .line 1064
    .line 1065
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    instance-of v5, v9, Lqe6;

    .line 1079
    .line 1080
    if-eqz v5, :cond_29

    .line 1081
    .line 1082
    instance-of v5, v3, Lqe6;

    .line 1083
    .line 1084
    if-eqz v5, :cond_29

    .line 1085
    .line 1086
    check-cast v3, Lqe6;

    .line 1087
    .line 1088
    iget-object v3, v3, Lqe6;->b:Lux0;

    .line 1089
    .line 1090
    new-instance v5, Lvj2;

    .line 1091
    .line 1092
    check-cast v9, Lqe6;

    .line 1093
    .line 1094
    const/16 v10, 0x1c

    .line 1095
    .line 1096
    invoke-direct {v5, v9, v10}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v3, v5}, Lrm3;->D(Lgn2;)Lgq1;

    .line 1100
    .line 1101
    .line 1102
    :cond_29
    move v5, v8

    .line 1103
    const/4 v3, 0x1

    .line 1104
    goto/16 :goto_19

    .line 1105
    .line 1106
    :cond_2a
    new-instance v2, Ljava/util/ArrayList;

    .line 1107
    .line 1108
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v0}, Lwv0;->R0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1120
    .line 1121
    .line 1122
    move-result v3

    .line 1123
    if-eqz v3, :cond_2b

    .line 1124
    .line 1125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    check-cast v3, Ljava/lang/Number;

    .line 1130
    .line 1131
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1132
    .line 1133
    .line 1134
    move-result v3

    .line 1135
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1136
    .line 1137
    .line 1138
    move-result v4

    .line 1139
    sub-int/2addr v3, v4

    .line 1140
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v3

    .line 1144
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1145
    .line 1146
    .line 1147
    goto :goto_1f

    .line 1148
    :cond_2b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    :cond_2c
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1153
    .line 1154
    .line 1155
    move-result v1

    .line 1156
    if-eqz v1, :cond_2d

    .line 1157
    .line 1158
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    check-cast v1, Lkk0;

    .line 1163
    .line 1164
    instance-of v2, v1, Lve6;

    .line 1165
    .line 1166
    if-eqz v2, :cond_2c

    .line 1167
    .line 1168
    check-cast v1, Lve6;

    .line 1169
    .line 1170
    iget-object v1, v1, Lve6;->a:Lsy8;

    .line 1171
    .line 1172
    invoke-virtual {v1, v6}, Lsy8;->a(Lai0;)V

    .line 1173
    .line 1174
    .line 1175
    goto :goto_20

    .line 1176
    :cond_2d
    return-object v7

    .line 1177
    :pswitch_14
    check-cast v1, Lfw5;

    .line 1178
    .line 1179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1183
    .line 1184
    check-cast v0, Lgw5;

    .line 1185
    .line 1186
    invoke-virtual {v0, v1}, Lgw5;->e(Lfw5;)V

    .line 1187
    .line 1188
    .line 1189
    return-object v7

    .line 1190
    :pswitch_15
    check-cast v1, Ltv5;

    .line 1191
    .line 1192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1193
    .line 1194
    .line 1195
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, Lvv5;

    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, Lvv5;->f(Ltv5;)V

    .line 1200
    .line 1201
    .line 1202
    return-object v7

    .line 1203
    :pswitch_16
    check-cast v1, Lsu/happ/proxyutility/dto/enums/EPingType;

    .line 1204
    .line 1205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1206
    .line 1207
    .line 1208
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v0, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;

    .line 1211
    .line 1212
    sget v2, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->U0:I

    .line 1213
    .line 1214
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->A()Lcom/tencent/mmkv/MMKV;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    const-string v2, "pref_ping_type"

    .line 1219
    .line 1220
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1221
    .line 1222
    .line 1223
    move-result v1

    .line 1224
    invoke-virtual {v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    return-object v7

    .line 1228
    :pswitch_17
    check-cast v1, Ljava/lang/String;

    .line 1229
    .line 1230
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1231
    .line 1232
    .line 1233
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v0, Lkm5;

    .line 1236
    .line 1237
    iget-object v0, v0, Lkm5;->Z:Lll5;

    .line 1238
    .line 1239
    invoke-virtual {v0, v1}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v0

    .line 1243
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    return-object v0

    .line 1248
    nop

    .line 1249
    :pswitch_data_0
    .packed-switch 0x0
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

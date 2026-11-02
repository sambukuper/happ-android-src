.class public final Ld3;
.super Ljava/lang/Object;

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;

.field public final Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ld3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ld3;->Z:Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, Ld3;->X:B

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    const/16 v2, 0x24

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Throwable;

    .line 15
    .line 16
    instance-of v0, p1, Lr49;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lec4;

    .line 23
    .line 24
    check-cast p1, Lr49;

    .line 25
    .line 26
    iget p1, p1, Lr49;->X:I

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lec4;->d(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lxb4;

    .line 34
    .line 35
    invoke-interface {p0, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 36
    .line 37
    .line 38
    sget-object p0, Ldn8;->a:Ldn8;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 42
    .line 43
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkd8;

    .line 46
    .line 47
    iget-object p1, p1, Lkd8;->a:Ly68;

    .line 48
    .line 49
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Llh;

    .line 52
    .line 53
    iget-object p1, p1, Ly68;->h:Lc15;

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Lc15;->j(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    sget-object p0, Ldn8;->a:Ldn8;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 62
    .line 63
    :try_start_0
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;

    .line 66
    .line 67
    iget-object p1, p1, Lec4;->a:Landroid/content/Context;

    .line 68
    .line 69
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask$isUiAlive$2$1$receiver$1;

    .line 72
    .line 73
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    :catch_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_2
    check-cast p1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 80
    .line 81
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lpv3;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Llh7;

    .line 95
    .line 96
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Lsn6;

    .line 101
    .line 102
    iget-object p0, p0, Lsn6;->f:Lop7;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_3

    .line 109
    .line 110
    if-eq p0, v4, :cond_2

    .line 111
    .line 112
    if-ne p0, v3, :cond_1

    .line 113
    .line 114
    move-object p0, v0

    .line 115
    check-cast p0, Lgn2;

    .line 116
    .line 117
    new-instance v1, Loo6;

    .line 118
    .line 119
    invoke-direct {v1, p1}, Loo6;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    move-object p0, v0

    .line 131
    check-cast p0, Lgn2;

    .line 132
    .line 133
    new-instance v1, Lgo6;

    .line 134
    .line 135
    invoke-direct {v1, p1}, Lgo6;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_3
    :goto_0
    check-cast v0, Lgn2;

    .line 142
    .line 143
    sget-object p0, Lmo6;->a:Lmo6;

    .line 144
    .line 145
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    sget-object v6, Ldn8;->a:Ldn8;

    .line 149
    .line 150
    :goto_1
    return-object v6

    .line 151
    :pswitch_3
    check-cast p1, Lld0;

    .line 152
    .line 153
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lz51;

    .line 156
    .line 157
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Lld0;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p0, p1}, Lz51;->u(Lld0;Lld0;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Ldn8;->a:Ldn8;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_4
    check-cast p1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 171
    .line 172
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 182
    .line 183
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, Lwm4;

    .line 186
    .line 187
    check-cast p0, Lvm4;

    .line 188
    .line 189
    iget-object p0, p0, Lvm4;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    new-instance v2, Ljo4;

    .line 202
    .line 203
    invoke-direct {v2, v6, p0, p1, v0}, Ljo4;-><init>(Lq51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainViewModel;)V

    .line 204
    .line 205
    .line 206
    const/4 p0, 0x3

    .line 207
    invoke-static {v1, v6, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->v()V

    .line 211
    .line 212
    .line 213
    sget-object p0, Ldn8;->a:Ldn8;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 217
    .line 218
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p1, Lux0;

    .line 221
    .line 222
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, Ldj4;

    .line 225
    .line 226
    iget-object v0, p0, Ldj4;->h:Lux0;

    .line 227
    .line 228
    if-eq p1, v0, :cond_4

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_4
    iput-object v6, p0, Ldj4;->h:Lux0;

    .line 232
    .line 233
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_6
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lb54;

    .line 239
    .line 240
    iget-object v3, v0, Lf54;->b:Lz47;

    .line 241
    .line 242
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Lz47;

    .line 245
    .line 246
    check-cast p1, Lx44;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v0, v0, Lb54;->o:Lv44;

    .line 252
    .line 253
    iget-object v4, v0, Luf5;->i0:Lfk2;

    .line 254
    .line 255
    iget-object v7, p1, Lx44;->a:Lv15;

    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object v8, v4, Lfk2;->a:Lgk2;

    .line 261
    .line 262
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    sget-object v9, Lfk2;->c:Lfk2;

    .line 266
    .line 267
    invoke-static {v7}, Lwl7;->h0(Lv15;)Lfk2;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    iget-object v7, v7, Lfk2;->a:Lgk2;

    .line 272
    .line 273
    invoke-virtual {v7}, Lgk2;->c()Z

    .line 274
    .line 275
    .line 276
    iget-object v7, v7, Lgk2;->a:Ljava/lang/String;

    .line 277
    .line 278
    iget-object p1, p1, Lx44;->b:Lta6;

    .line 279
    .line 280
    iget-object v9, p0, Lz47;->Y:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v9, Lc6;

    .line 283
    .line 284
    if-eqz p1, :cond_7

    .line 285
    .line 286
    iget-object v4, v9, Lc6;->i0:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v4, Ly45;

    .line 289
    .line 290
    iget-object v10, v3, Lz47;->Y:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v10, Lc6;

    .line 293
    .line 294
    iget-object v10, v10, Lc6;->j0:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v10, Lzl1;

    .line 297
    .line 298
    invoke-virtual {v10}, Lzl1;->c()Lhl1;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    iget-object v10, v10, Lhl1;->c:Lpz2;

    .line 303
    .line 304
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    sget-object v10, Lhv4;->g:Lhv4;

    .line 308
    .line 309
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1}, Lta6;->c()Lfk2;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    if-eqz v10, :cond_6

    .line 317
    .line 318
    iget-object v10, v10, Lfk2;->a:Lgk2;

    .line 319
    .line 320
    iget-object v10, v10, Lgk2;->a:Ljava/lang/String;

    .line 321
    .line 322
    if-nez v10, :cond_5

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_5
    invoke-virtual {v4, v10}, Ly45;->C(Ljava/lang/String;)Lvk1;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    goto :goto_5

    .line 330
    :cond_6
    :goto_3
    move-object v4, v6

    .line 331
    goto :goto_5

    .line 332
    :cond_7
    iget-object v10, v9, Lc6;->i0:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v10, Ly45;

    .line 335
    .line 336
    iget-object v11, v3, Lz47;->Y:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v11, Lc6;

    .line 339
    .line 340
    iget-object v11, v11, Lc6;->j0:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v11, Lzl1;

    .line 343
    .line 344
    invoke-virtual {v11}, Lzl1;->c()Lhl1;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    iget-object v11, v11, Lhl1;->c:Lpz2;

    .line 349
    .line 350
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    sget-object v11, Lhv4;->g:Lhv4;

    .line 354
    .line 355
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-static {v7, v1, v2}, Lmm7;->X(Ljava/lang/String;CC)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    invoke-virtual {v8}, Lgk2;->c()Z

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    if-eqz v12, :cond_8

    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_8
    new-instance v12, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v11

    .line 387
    :goto_4
    invoke-virtual {v10, v11}, Ly45;->C(Ljava/lang/String;)Lvk1;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    :goto_5
    if-eqz v4, :cond_9

    .line 392
    .line 393
    iget-object v4, v4, Lvk1;->Y:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v4, Lqb6;

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_9
    move-object v4, v6

    .line 399
    :goto_6
    if-eqz v4, :cond_a

    .line 400
    .line 401
    iget-object v10, v4, Lqb6;->a:Ljava/lang/Class;

    .line 402
    .line 403
    invoke-static {v10}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    goto :goto_7

    .line 408
    :cond_a
    move-object v10, v6

    .line 409
    :goto_7
    if-eqz v10, :cond_b

    .line 410
    .line 411
    invoke-virtual {v10}, Lqs0;->g()Z

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    if-nez v11, :cond_18

    .line 416
    .line 417
    iget-boolean v10, v10, Lqs0;->c:Z

    .line 418
    .line 419
    if-eqz v10, :cond_b

    .line 420
    .line 421
    goto/16 :goto_e

    .line 422
    .line 423
    :cond_b
    sget-object v10, Lz44;->j0:Lz44;

    .line 424
    .line 425
    if-nez v4, :cond_c

    .line 426
    .line 427
    goto :goto_9

    .line 428
    :cond_c
    iget-object v11, v4, Lqb6;->b:Lb04;

    .line 429
    .line 430
    iget-object v11, v11, Lb04;->a:La04;

    .line 431
    .line 432
    sget-object v12, La04;->g0:La04;

    .line 433
    .line 434
    if-ne v11, v12, :cond_e

    .line 435
    .line 436
    iget-object v3, v3, Lz47;->Y:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v3, Lc6;

    .line 439
    .line 440
    iget-object v3, v3, Lc6;->j0:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v3, Lzl1;

    .line 443
    .line 444
    invoke-virtual {v3, v4}, Lzl1;->g(Lqb6;)Lhs0;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    if-nez v11, :cond_d

    .line 449
    .line 450
    move-object v3, v6

    .line 451
    goto :goto_8

    .line 452
    :cond_d
    invoke-virtual {v3}, Lzl1;->c()Lhl1;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    iget-object v3, v3, Lhl1;->t:Los0;

    .line 457
    .line 458
    iget-object v4, v4, Lqb6;->a:Ljava/lang/Class;

    .line 459
    .line 460
    invoke-static {v4}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    invoke-virtual {v3, v4, v11}, Los0;->a(Lqs0;Lhs0;)Lsx4;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    :goto_8
    if-eqz v3, :cond_f

    .line 469
    .line 470
    new-instance v10, Ly44;

    .line 471
    .line 472
    invoke-direct {v10, v3}, Ly44;-><init>(Lsx4;)V

    .line 473
    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_e
    sget-object v10, La54;->j0:La54;

    .line 477
    .line 478
    :cond_f
    :goto_9
    instance-of v3, v10, Ly44;

    .line 479
    .line 480
    if-eqz v3, :cond_10

    .line 481
    .line 482
    check-cast v10, Ly44;

    .line 483
    .line 484
    iget-object v6, v10, Ly44;->j0:Lsx4;

    .line 485
    .line 486
    goto/16 :goto_e

    .line 487
    .line 488
    :cond_10
    instance-of v3, v10, La54;

    .line 489
    .line 490
    if-eqz v3, :cond_11

    .line 491
    .line 492
    goto/16 :goto_e

    .line 493
    .line 494
    :cond_11
    instance-of v3, v10, Lz44;

    .line 495
    .line 496
    if-eqz v3, :cond_17

    .line 497
    .line 498
    if-nez p1, :cond_14

    .line 499
    .line 500
    iget-object p1, v9, Lc6;->Y:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast p1, Llr5;

    .line 503
    .line 504
    invoke-static {v7, v1, v2}, Lmm7;->X(Ljava/lang/String;CC)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    invoke-virtual {v8}, Lgk2;->c()Z

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    if-eqz v3, :cond_12

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    iget-object v4, v8, Lgk2;->a:Ljava/lang/String;

    .line 521
    .line 522
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    :goto_a
    iget-object p1, p1, Llr5;->Y:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast p1, Ljava/lang/ClassLoader;

    .line 538
    .line 539
    :try_start_1
    invoke-static {v2, v5, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 543
    goto :goto_b

    .line 544
    :catch_1
    move-object p1, v6

    .line 545
    :goto_b
    if-eqz p1, :cond_13

    .line 546
    .line 547
    new-instance v1, Lta6;

    .line 548
    .line 549
    invoke-direct {v1, p1}, Lta6;-><init>(Ljava/lang/Class;)V

    .line 550
    .line 551
    .line 552
    move-object p1, v1

    .line 553
    goto :goto_c

    .line 554
    :cond_13
    move-object p1, v6

    .line 555
    :cond_14
    :goto_c
    if-eqz p1, :cond_15

    .line 556
    .line 557
    invoke-virtual {p1}, Lta6;->c()Lfk2;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    goto :goto_d

    .line 562
    :cond_15
    move-object v1, v6

    .line 563
    :goto_d
    if-eqz v1, :cond_18

    .line 564
    .line 565
    iget-object v2, v1, Lfk2;->a:Lgk2;

    .line 566
    .line 567
    invoke-virtual {v2}, Lgk2;->c()Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-nez v2, :cond_18

    .line 572
    .line 573
    invoke-virtual {v1}, Lfk2;->b()Lfk2;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    iget-object v2, v0, Luf5;->i0:Lfk2;

    .line 578
    .line 579
    invoke-virtual {v1, v2}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-nez v1, :cond_16

    .line 584
    .line 585
    goto :goto_e

    .line 586
    :cond_16
    new-instance v1, Lp44;

    .line 587
    .line 588
    invoke-direct {v1, p0, v0, p1, v6}, Lp44;-><init>(Lz47;Led1;Lta6;Lsx4;)V

    .line 589
    .line 590
    .line 591
    move-object v6, v1

    .line 592
    goto :goto_e

    .line 593
    :cond_17
    invoke-static {}, Lb61;->c()V

    .line 594
    .line 595
    .line 596
    :cond_18
    :goto_e
    return-object v6

    .line 597
    :pswitch_7
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Lq97;

    .line 600
    .line 601
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast p0, Lt44;

    .line 604
    .line 605
    check-cast p1, Lv15;

    .line 606
    .line 607
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0}, Lfd1;->getName()Lv15;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-static {v1, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    if-eqz v1, :cond_19

    .line 619
    .line 620
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object p0

    .line 624
    goto :goto_f

    .line 625
    :cond_19
    invoke-virtual {p0, p1}, Lt44;->N(Lv15;)Ljava/util/ArrayList;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {p0, p1}, Lt44;->O(Lv15;)Ljava/util/ArrayList;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    invoke-static {v0, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    :goto_f
    return-object p0

    .line 638
    :pswitch_8
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, Lt44;

    .line 641
    .line 642
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast p0, Lz47;

    .line 645
    .line 646
    move-object v9, p1

    .line 647
    check-cast v9, Lv15;

    .line 648
    .line 649
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    iget-object p1, v0, Lt44;->r:Lte4;

    .line 653
    .line 654
    iget-object v7, v0, Lt44;->n:Lsx4;

    .line 655
    .line 656
    invoke-virtual {p1}, Lte4;->invoke()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    check-cast p1, Ljava/util/Set;

    .line 661
    .line 662
    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result p1

    .line 666
    if-eqz p1, :cond_1c

    .line 667
    .line 668
    iget-object p1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast p1, Lc6;

    .line 671
    .line 672
    iget-object p1, p1, Lc6;->Y:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast p1, Llr5;

    .line 675
    .line 676
    invoke-static {v7}, Lel1;->f(Lot0;)Lqs0;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0, v9}, Lqs0;->d(Lv15;)Lqs0;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    iget-object v3, v0, Lqs0;->a:Lfk2;

    .line 688
    .line 689
    iget-object v0, v0, Lqs0;->b:Lfk2;

    .line 690
    .line 691
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 692
    .line 693
    iget-object v0, v0, Lgk2;->a:Ljava/lang/String;

    .line 694
    .line 695
    invoke-static {v0, v1, v2}, Lmm7;->X(Ljava/lang/String;CC)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    iget-object v2, v3, Lfk2;->a:Lgk2;

    .line 700
    .line 701
    invoke-virtual {v2}, Lgk2;->c()Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    if-eqz v2, :cond_1a

    .line 706
    .line 707
    goto :goto_10

    .line 708
    :cond_1a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 709
    .line 710
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 711
    .line 712
    .line 713
    iget-object v3, v3, Lfk2;->a:Lgk2;

    .line 714
    .line 715
    iget-object v3, v3, Lgk2;->a:Ljava/lang/String;

    .line 716
    .line 717
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    :goto_10
    iget-object p1, p1, Llr5;->Y:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast p1, Ljava/lang/ClassLoader;

    .line 733
    .line 734
    :try_start_2
    invoke-static {v0, v5, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 738
    goto :goto_11

    .line 739
    :catch_2
    move-object p1, v6

    .line 740
    :goto_11
    if-eqz p1, :cond_1b

    .line 741
    .line 742
    new-instance v0, Lta6;

    .line 743
    .line 744
    invoke-direct {v0, p1}, Lta6;-><init>(Ljava/lang/Class;)V

    .line 745
    .line 746
    .line 747
    goto :goto_12

    .line 748
    :cond_1b
    move-object v0, v6

    .line 749
    :goto_12
    if-eqz v0, :cond_1f

    .line 750
    .line 751
    new-instance p1, Lp44;

    .line 752
    .line 753
    invoke-direct {p1, p0, v7, v0, v6}, Lp44;-><init>(Lz47;Led1;Lta6;Lsx4;)V

    .line 754
    .line 755
    .line 756
    move-object v6, p1

    .line 757
    goto :goto_13

    .line 758
    :cond_1c
    iget-object p1, v0, Lt44;->s:Lte4;

    .line 759
    .line 760
    invoke-virtual {p1}, Lte4;->invoke()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object p1

    .line 764
    check-cast p1, Ljava/util/Set;

    .line 765
    .line 766
    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result p1

    .line 770
    if-eqz p1, :cond_1e

    .line 771
    .line 772
    invoke-static {}, Li21;->r()Lgb4;

    .line 773
    .line 774
    .line 775
    move-result-object p1

    .line 776
    iget-object v0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, Lc6;

    .line 779
    .line 780
    iget-object v0, v0, Lc6;->r0:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v0, La08;

    .line 783
    .line 784
    check-cast v0, Lra;

    .line 785
    .line 786
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    invoke-static {p1}, Li21;->j(Lgb4;)Lgb4;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    invoke-virtual {p0}, Lf2;->a()I

    .line 797
    .line 798
    .line 799
    move-result p1

    .line 800
    if-eqz p1, :cond_1f

    .line 801
    .line 802
    if-ne p1, v4, :cond_1d

    .line 803
    .line 804
    invoke-static {p0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    move-object v6, p0

    .line 809
    check-cast v6, Lsx4;

    .line 810
    .line 811
    goto :goto_13

    .line 812
    :cond_1d
    const-string p1, "Multiple classes with same name are generated: "

    .line 813
    .line 814
    invoke-static {p0, p1}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    goto :goto_13

    .line 818
    :cond_1e
    iget-object p1, v0, Lt44;->t:Lte4;

    .line 819
    .line 820
    invoke-virtual {p1}, Lte4;->invoke()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object p1

    .line 824
    check-cast p1, Ljava/util/Map;

    .line 825
    .line 826
    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object p1

    .line 830
    check-cast p1, Lza6;

    .line 831
    .line 832
    if-eqz p1, :cond_1f

    .line 833
    .line 834
    iget-object v1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v1, Lc6;

    .line 837
    .line 838
    iget-object v1, v1, Lc6;->f0:Ljava/lang/Object;

    .line 839
    .line 840
    move-object v7, v1

    .line 841
    check-cast v7, Lve4;

    .line 842
    .line 843
    new-instance v1, Lr44;

    .line 844
    .line 845
    invoke-direct {v1, v0, v3}, Lr44;-><init>(Lt44;B)V

    .line 846
    .line 847
    .line 848
    new-instance v10, Lte4;

    .line 849
    .line 850
    invoke-direct {v10, v7, v1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 851
    .line 852
    .line 853
    iget-object v8, v0, Lt44;->n:Lsx4;

    .line 854
    .line 855
    invoke-static {p0, p1}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 856
    .line 857
    .line 858
    move-result-object v11

    .line 859
    invoke-static {p1}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 860
    .line 861
    .line 862
    move-result-object v12

    .line 863
    invoke-static/range {v7 .. v12}, Lq22;->B0(Lve4;Lsx4;Lv15;Lte4;Lsm;Lke7;)Lq22;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    :cond_1f
    :goto_13
    return-object v6

    .line 868
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 869
    .line 870
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast p1, Lsa2;

    .line 873
    .line 874
    iget-object v1, p1, Lsa2;->a:Ljava/lang/Object;

    .line 875
    .line 876
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast p0, Lmm0;

    .line 879
    .line 880
    monitor-enter v1

    .line 881
    :try_start_3
    iget-object p1, p1, Lsa2;->c:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast p1, Ljava/util/ArrayList;

    .line 884
    .line 885
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 886
    .line 887
    .line 888
    monitor-exit v1

    .line 889
    sget-object p0, Ldn8;->a:Ldn8;

    .line 890
    .line 891
    return-object p0

    .line 892
    :catchall_0
    move-exception v0

    .line 893
    move-object p0, v0

    .line 894
    monitor-exit v1

    .line 895
    throw p0

    .line 896
    :pswitch_a
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v0, Lvk3;

    .line 899
    .line 900
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast p0, Lev3;

    .line 903
    .line 904
    check-cast p1, Ljava/lang/String;

    .line 905
    .line 906
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0}, Lvk3;->getName()Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    if-eqz v1, :cond_20

    .line 918
    .line 919
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 920
    .line 921
    .line 922
    move-result-object p0

    .line 923
    goto :goto_15

    .line 924
    :cond_20
    invoke-static {p0}, Lgv3;->w(Lev3;)Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object p0

    .line 928
    new-instance v0, Ljava/util/ArrayList;

    .line 929
    .line 930
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 931
    .line 932
    .line 933
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 934
    .line 935
    .line 936
    move-result-object p0

    .line 937
    :cond_21
    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-eqz v1, :cond_22

    .line 942
    .line 943
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    move-object v2, v1

    .line 948
    check-cast v2, Lvk3;

    .line 949
    .line 950
    invoke-virtual {v2}, Lvk3;->getName()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    if-eqz v2, :cond_21

    .line 959
    .line 960
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    goto :goto_14

    .line 964
    :cond_22
    move-object p0, v0

    .line 965
    :goto_15
    return-object p0

    .line 966
    :pswitch_b
    move-object v3, p1

    .line 967
    check-cast v3, Lid7;

    .line 968
    .line 969
    sget-object p1, Lkd7;->c:Ljava/lang/Object;

    .line 970
    .line 971
    monitor-enter p1

    .line 972
    :try_start_4
    sget-wide v1, Lkd7;->e:J

    .line 973
    .line 974
    const-wide/16 v4, 0x1

    .line 975
    .line 976
    add-long/2addr v4, v1

    .line 977
    sput-wide v4, Lkd7;->e:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 978
    .line 979
    monitor-exit p1

    .line 980
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 981
    .line 982
    move-object v4, p1

    .line 983
    check-cast v4, Lgn2;

    .line 984
    .line 985
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 986
    .line 987
    move-object v5, p0

    .line 988
    check-cast v5, Lgn2;

    .line 989
    .line 990
    new-instance v0, Lx05;

    .line 991
    .line 992
    invoke-direct/range {v0 .. v5}, Lx05;-><init>(JLid7;Lgn2;Lgn2;)V

    .line 993
    .line 994
    .line 995
    return-object v0

    .line 996
    :catchall_1
    move-exception v0

    .line 997
    move-object p0, v0

    .line 998
    monitor-exit p1

    .line 999
    throw p0

    .line 1000
    :pswitch_c
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v0, Lz47;

    .line 1003
    .line 1004
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1005
    .line 1006
    move-object v8, p0

    .line 1007
    check-cast v8, Lvl1;

    .line 1008
    .line 1009
    iget-object p0, v8, Lvl1;->n0:Ljl1;

    .line 1010
    .line 1011
    move-object v9, p1

    .line 1012
    check-cast v9, Lv15;

    .line 1013
    .line 1014
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    iget-object p1, v0, Lz47;->Y:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 1020
    .line 1021
    invoke-virtual {p1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p1

    .line 1025
    check-cast p1, Lqy5;

    .line 1026
    .line 1027
    if-eqz p1, :cond_23

    .line 1028
    .line 1029
    iget-object v1, p0, Ljl1;->X:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v1, Lhl1;

    .line 1032
    .line 1033
    iget-object v7, v1, Lhl1;->a:Lve4;

    .line 1034
    .line 1035
    iget-object v0, v0, Lz47;->f0:Ljava/lang/Object;

    .line 1036
    .line 1037
    move-object v10, v0

    .line 1038
    check-cast v10, Lte4;

    .line 1039
    .line 1040
    new-instance v11, Lll1;

    .line 1041
    .line 1042
    iget-object p0, p0, Ljl1;->X:Ljava/lang/Object;

    .line 1043
    .line 1044
    check-cast p0, Lhl1;

    .line 1045
    .line 1046
    iget-object p0, p0, Lhl1;->a:Lve4;

    .line 1047
    .line 1048
    new-instance v0, Lc3;

    .line 1049
    .line 1050
    const/16 v1, 0xb

    .line 1051
    .line 1052
    invoke-direct {v0, v8, p1, v1}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1053
    .line 1054
    .line 1055
    invoke-direct {v11, p0, v0}, Lll1;-><init>(Lve4;Ldn2;)V

    .line 1056
    .line 1057
    .line 1058
    sget-object v12, Lke7;->G:Lg55;

    .line 1059
    .line 1060
    invoke-static/range {v7 .. v12}, Lq22;->B0(Lve4;Lsx4;Lv15;Lte4;Lsm;Lke7;)Lq22;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v6

    .line 1064
    :cond_23
    return-object v6

    .line 1065
    :pswitch_d
    check-cast p1, Lcx3;

    .line 1066
    .line 1067
    iget-object p1, p1, Lcx3;->a:Landroid/view/KeyEvent;

    .line 1068
    .line 1069
    iget-object p1, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast p1, Ly05;

    .line 1072
    .line 1073
    iget-object p0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast p0, Ljc8;

    .line 1076
    .line 1077
    invoke-virtual {p0}, Ljc8;->b()Z

    .line 1078
    .line 1079
    .line 1080
    move-result p0

    .line 1081
    if-nez p0, :cond_24

    .line 1082
    .line 1083
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1084
    .line 1085
    invoke-interface {p1, p0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    :cond_24
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1089
    .line 1090
    return-object p0

    .line 1091
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 1092
    .line 1093
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast p1, Lai;

    .line 1096
    .line 1097
    iget-object p1, p1, Lai;->Y:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast p1, Landroid/view/Choreographer;

    .line 1100
    .line 1101
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast p0, Lzh;

    .line 1104
    .line 1105
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 1106
    .line 1107
    .line 1108
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1109
    .line 1110
    return-object p0

    .line 1111
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 1112
    .line 1113
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast p1, Lyh;

    .line 1116
    .line 1117
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1118
    .line 1119
    check-cast p0, Lzh;

    .line 1120
    .line 1121
    iget-object v1, p1, Lyh;->g0:Ljava/lang/Object;

    .line 1122
    .line 1123
    monitor-enter v1

    .line 1124
    :try_start_5
    iget-object p1, p1, Lyh;->i0:Ljava/util/ArrayList;

    .line 1125
    .line 1126
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1127
    .line 1128
    .line 1129
    monitor-exit v1

    .line 1130
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1131
    .line 1132
    return-object p0

    .line 1133
    :catchall_2
    move-exception v0

    .line 1134
    move-object p0, v0

    .line 1135
    monitor-exit v1

    .line 1136
    throw p0

    .line 1137
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 1138
    .line 1139
    iget-object p1, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1140
    .line 1141
    check-cast p1, Lwd3;

    .line 1142
    .line 1143
    iget-object v1, p1, Lwd3;->c:Ljava/lang/Object;

    .line 1144
    .line 1145
    monitor-enter v1

    .line 1146
    :try_start_6
    iput-boolean v4, p1, Lwd3;->e:Z

    .line 1147
    .line 1148
    iget-object v0, p1, Lwd3;->d:Lc15;

    .line 1149
    .line 1150
    iget-object v2, v0, Lc15;->X:[Ljava/lang/Object;

    .line 1151
    .line 1152
    iget v0, v0, Lc15;->Z:I

    .line 1153
    .line 1154
    :goto_16
    if-ge v5, v0, :cond_26

    .line 1155
    .line 1156
    aget-object v3, v2, v5

    .line 1157
    .line 1158
    check-cast v3, Lb09;

    .line 1159
    .line 1160
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v3

    .line 1164
    check-cast v3, Li75;

    .line 1165
    .line 1166
    if-eqz v3, :cond_25

    .line 1167
    .line 1168
    iget-object v4, v3, Li75;->b:Ldi7;

    .line 1169
    .line 1170
    if-eqz v4, :cond_25

    .line 1171
    .line 1172
    invoke-virtual {v4}, Ldi7;->closeConnection()V

    .line 1173
    .line 1174
    .line 1175
    iput-object v6, v3, Li75;->b:Ldi7;

    .line 1176
    .line 1177
    :cond_25
    add-int/lit8 v5, v5, 0x1

    .line 1178
    .line 1179
    goto :goto_16

    .line 1180
    :catchall_3
    move-exception v0

    .line 1181
    move-object p0, v0

    .line 1182
    goto :goto_17

    .line 1183
    :cond_26
    iget-object p1, p1, Lwd3;->d:Lc15;

    .line 1184
    .line 1185
    invoke-virtual {p1}, Lc15;->g()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1186
    .line 1187
    .line 1188
    monitor-exit v1

    .line 1189
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast p0, Lrf;

    .line 1192
    .line 1193
    iget-object p0, p0, Lrf;->Y:Lo78;

    .line 1194
    .line 1195
    iget-object p1, p0, Lo78;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1196
    .line 1197
    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1198
    .line 1199
    .line 1200
    iget-object p0, p0, Lo78;->a:Lq78;

    .line 1201
    .line 1202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1203
    .line 1204
    .line 1205
    sget-object p1, Lp78;->Y:Lp78;

    .line 1206
    .line 1207
    invoke-virtual {p0, p1}, Lq78;->a(Lp78;)V

    .line 1208
    .line 1209
    .line 1210
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1211
    .line 1212
    return-object p0

    .line 1213
    :goto_17
    monitor-exit v1

    .line 1214
    throw p0

    .line 1215
    :pswitch_11
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v0, Lw39;

    .line 1218
    .line 1219
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1220
    .line 1221
    check-cast p0, Lxi8;

    .line 1222
    .line 1223
    check-cast p1, Le3;

    .line 1224
    .line 1225
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    iget-object v1, p1, Le3;->a:Lx14;

    .line 1229
    .line 1230
    invoke-virtual {v0}, Lw39;->R()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v2

    .line 1234
    if-eqz v2, :cond_27

    .line 1235
    .line 1236
    if-eqz v1, :cond_27

    .line 1237
    .line 1238
    invoke-interface {p0, v1}, Lxi8;->m(Lx14;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v2

    .line 1242
    if-ne v2, v4, :cond_27

    .line 1243
    .line 1244
    goto :goto_1a

    .line 1245
    :cond_27
    if-eqz v1, :cond_2b

    .line 1246
    .line 1247
    invoke-interface {p0, v1}, Lxi8;->p0(Lx14;)Lmh8;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v2

    .line 1251
    if-nez v2, :cond_28

    .line 1252
    .line 1253
    goto :goto_1a

    .line 1254
    :cond_28
    invoke-interface {p0, v2}, Lxi8;->Z(Lmh8;)I

    .line 1255
    .line 1256
    .line 1257
    move-result v3

    .line 1258
    new-instance v4, Ljava/util/ArrayList;

    .line 1259
    .line 1260
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1261
    .line 1262
    .line 1263
    :goto_18
    if-ge v5, v3, :cond_2a

    .line 1264
    .line 1265
    invoke-interface {p0, v2, v5}, Lxi8;->h0(Lmh8;I)Lji8;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v7

    .line 1269
    invoke-interface {p0, v1, v5}, Lxi8;->A0(Lx14;I)Lbh8;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v8

    .line 1273
    invoke-interface {p0, v8}, Lxi8;->p(Lbh8;)Lx14;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v8

    .line 1277
    iget-object v9, p1, Le3;->b:Lrl3;

    .line 1278
    .line 1279
    if-nez v8, :cond_29

    .line 1280
    .line 1281
    new-instance v8, Le3;

    .line 1282
    .line 1283
    invoke-direct {v8, v6, v9, v7}, Le3;-><init>(Lx14;Lrl3;Lji8;)V

    .line 1284
    .line 1285
    .line 1286
    goto :goto_19

    .line 1287
    :cond_29
    new-instance v10, Le3;

    .line 1288
    .line 1289
    invoke-virtual {v0}, Lw39;->A()Le0;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v11

    .line 1293
    invoke-virtual {v0, v8}, Lw39;->B(Lx14;)Ljava/lang/Iterable;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v12

    .line 1297
    invoke-static {v11, v9, v12}, Le0;->b(Le0;Lrl3;Ljava/lang/Iterable;)Lrl3;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v9

    .line 1301
    invoke-direct {v10, v8, v9, v7}, Le3;-><init>(Lx14;Lrl3;Lji8;)V

    .line 1302
    .line 1303
    .line 1304
    move-object v8, v10

    .line 1305
    :goto_19
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    add-int/lit8 v5, v5, 0x1

    .line 1309
    .line 1310
    goto :goto_18

    .line 1311
    :cond_2a
    move-object v6, v4

    .line 1312
    :cond_2b
    :goto_1a
    return-object v6

    .line 1313
    :pswitch_12
    iget-object v0, p0, Ld3;->Y:Ljava/lang/Object;

    .line 1314
    .line 1315
    check-cast v0, Lrh8;

    .line 1316
    .line 1317
    iget-object p0, p0, Ld3;->Z:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast p0, [Lql3;

    .line 1320
    .line 1321
    check-cast p1, Ljava/lang/Number;

    .line 1322
    .line 1323
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 1324
    .line 1325
    .line 1326
    move-result p1

    .line 1327
    if-eqz v0, :cond_2c

    .line 1328
    .line 1329
    iget-object v0, v0, Lrh8;->a:Ljava/util/LinkedHashMap;

    .line 1330
    .line 1331
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    check-cast v0, Lql3;

    .line 1340
    .line 1341
    if-nez v0, :cond_2e

    .line 1342
    .line 1343
    :cond_2c
    if-ltz p1, :cond_2d

    .line 1344
    .line 1345
    array-length v0, p0

    .line 1346
    if-ge p1, v0, :cond_2d

    .line 1347
    .line 1348
    aget-object v0, p0, p1

    .line 1349
    .line 1350
    goto :goto_1b

    .line 1351
    :cond_2d
    sget-object v0, Lql3;->f:Lql3;

    .line 1352
    .line 1353
    :cond_2e
    :goto_1b
    return-object v0

    .line 1354
    nop

    .line 1355
    :pswitch_data_0
    .packed-switch 0x0
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

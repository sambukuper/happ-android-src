.class public final synthetic Lzx6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lzx6;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p0, p0, Lzx6;->X:B

    .line 2
    .line 3
    const-wide v0, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    sget-object v6, Ldn8;->a:Ldn8;

    .line 14
    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Ljava/lang/Float;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object v6

    .line 24
    :pswitch_0
    check-cast p1, Lqr6;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-string p0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 30
    .line 31
    invoke-interface {p1, p0}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-interface {p0}, Lxr6;->S0()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-interface {p0, v5}, Lxr6;->p0(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :pswitch_1
    check-cast p1, Landroid/content/Context;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 82
    .line 83
    const/high16 p0, 0x3f800000    # 1.0f

    .line 84
    .line 85
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_3
    check-cast p1, Lok;

    .line 91
    .line 92
    return-object v6

    .line 93
    :pswitch_4
    check-cast p1, Lf17;

    .line 94
    .line 95
    sget-object p0, Ld17;->a:[Lnw3;

    .line 96
    .line 97
    sget-object p0, Lc17;->m:Le17;

    .line 98
    .line 99
    sget-object v0, Ld17;->a:[Lnw3;

    .line 100
    .line 101
    const/4 v1, 0x5

    .line 102
    aget-object v0, v0, v1

    .line 103
    .line 104
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, p0, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v6

    .line 113
    :pswitch_5
    check-cast p1, Lrv7;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p0, p1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 119
    .line 120
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-eqz p1, :cond_1

    .line 125
    .line 126
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    :cond_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :pswitch_6
    check-cast p1, Lrv7;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object p0, p1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 163
    .line 164
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->e()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :pswitch_7
    check-cast p1, Lrv7;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget-object p0, p1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 195
    .line 196
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-eqz p1, :cond_2

    .line 201
    .line 202
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    goto :goto_2

    .line 207
    :cond_2
    move-object p1, v4

    .line 208
    :goto_2
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_3

    .line 213
    .line 214
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_3

    .line 219
    :cond_3
    move-object v0, v4

    .line 220
    :goto_3
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-eqz v1, :cond_4

    .line 225
    .line 226
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    goto :goto_4

    .line 235
    :cond_4
    move-object v1, v4

    .line 236
    :goto_4
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    if-eqz v2, :cond_5

    .line 241
    .line 242
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->y()Lb12;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    goto :goto_5

    .line 247
    :cond_5
    move-object v2, v4

    .line 248
    :goto_5
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    if-eqz p0, :cond_6

    .line 253
    .line 254
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    :cond_6
    filled-new-array {p1, v0, v1, v2, v4}, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0

    .line 267
    :pswitch_8
    check-cast p1, Lrv7;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object p0, p1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 273
    .line 274
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    if-eqz p1, :cond_7

    .line 279
    .line 280
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    if-ne p1, v3, :cond_7

    .line 285
    .line 286
    move v5, v3

    .line 287
    :cond_7
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-static {p0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    xor-int/2addr p0, v3

    .line 300
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    return-object p0

    .line 309
    :pswitch_9
    check-cast p1, Lrv7;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    iget-object p0, p1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 315
    .line 316
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_8

    .line 321
    .line 322
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->O()J

    .line 323
    .line 324
    .line 325
    move-result-wide v0

    .line 326
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    goto :goto_6

    .line 331
    :cond_8
    move-object v0, v4

    .line 332
    :goto_6
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    if-eqz p0, :cond_9

    .line 337
    .line 338
    new-instance v4, Ljava/util/Date;

    .line 339
    .line 340
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->k()J

    .line 341
    .line 342
    .line 343
    move-result-wide v1

    .line 344
    invoke-direct {v4, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 345
    .line 346
    .line 347
    :cond_9
    iget-object p0, p1, Lrv7;->e:Ljava/lang/Integer;

    .line 348
    .line 349
    filled-new-array {v0, v4, p0}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    return-object p0

    .line 354
    :pswitch_a
    check-cast p1, Lyf8;

    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    iget-object p0, p1, Lyf8;->Y:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 362
    .line 363
    iget-object p1, p1, Lyf8;->Z:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p1, Lqs7;

    .line 366
    .line 367
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->l()Z

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    if-nez p0, :cond_b

    .line 372
    .line 373
    if-eqz p1, :cond_a

    .line 374
    .line 375
    iget-object p0, p1, Lqs7;->a:Lis7;

    .line 376
    .line 377
    if-eqz p0, :cond_a

    .line 378
    .line 379
    iget-boolean p0, p0, Lis7;->a:Z

    .line 380
    .line 381
    if-ne p0, v3, :cond_a

    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_a
    move v3, v5

    .line 385
    :cond_b
    :goto_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    return-object p0

    .line 390
    :pswitch_b
    check-cast p1, Lqg5;

    .line 391
    .line 392
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget-object p0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast p0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 398
    .line 399
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast p1, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 406
    .line 407
    sget-object v0, Lev7;->c:Lvz7;

    .line 408
    .line 409
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, Lzt7;

    .line 414
    .line 415
    invoke-virtual {v0, p0}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    new-instance v1, Lyf8;

    .line 420
    .line 421
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 422
    .line 423
    invoke-direct {v2, p0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-direct {v1, v2, p1, v0}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-object v1

    .line 430
    :pswitch_c
    check-cast p1, Ljava/io/PrintWriter;

    .line 431
    .line 432
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    new-instance v0, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    const-string p0, " SubscriptionUpdater: skipping update since UI is running"

    .line 445
    .line 446
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    return-object v6

    .line 457
    :pswitch_d
    check-cast p1, Ljava/io/PrintWriter;

    .line 458
    .line 459
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    new-instance v0, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    const-string p0, " SubscriptionUpdater: skipping update since notifications are disabled"

    .line 472
    .line 473
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-object v6

    .line 484
    :pswitch_e
    check-cast p1, Lqg5;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    iget-object p0, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast p0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 492
    .line 493
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->a0()Z

    .line 494
    .line 495
    .line 496
    move-result p0

    .line 497
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    return-object p0

    .line 502
    :pswitch_f
    check-cast p1, Lqg5;

    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object p0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast p0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 510
    .line 511
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p1, Ljava/lang/String;

    .line 518
    .line 519
    :try_start_1
    sget-object v0, Lmr;->a:Lcp3;

    .line 520
    .line 521
    iget-object v1, v0, Lvm3;->b:Lg55;

    .line 522
    .line 523
    sget-object v1, Lqs7;->Companion:Ljs7;

    .line 524
    .line 525
    invoke-virtual {v1}, Ljs7;->serializer()Low3;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    check-cast v1, Low3;

    .line 530
    .line 531
    invoke-virtual {v0, v1, p1}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 535
    goto :goto_8

    .line 536
    :catchall_1
    move-exception p1

    .line 537
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 538
    .line 539
    if-nez v0, :cond_e

    .line 540
    .line 541
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 542
    .line 543
    if-nez v0, :cond_e

    .line 544
    .line 545
    new-instance v0, Lrj6;

    .line 546
    .line 547
    invoke-direct {v0, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 548
    .line 549
    .line 550
    move-object p1, v0

    .line 551
    :goto_8
    nop

    .line 552
    instance-of v0, p1, Lrj6;

    .line 553
    .line 554
    if-eqz v0, :cond_c

    .line 555
    .line 556
    move-object p1, v4

    .line 557
    :cond_c
    check-cast p1, Lqs7;

    .line 558
    .line 559
    if-eqz p1, :cond_d

    .line 560
    .line 561
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 562
    .line 563
    invoke-direct {v0, p0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    new-instance v4, Lqg5;

    .line 567
    .line 568
    invoke-direct {v4, v0, p1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    :cond_d
    return-object v4

    .line 572
    :cond_e
    throw p1

    .line 573
    :pswitch_10
    check-cast p1, Ljava/io/PrintWriter;

    .line 574
    .line 575
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    new-instance v0, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    const-string p0, " Fallback request (4)"

    .line 588
    .line 589
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    return-object v6

    .line 600
    :pswitch_11
    check-cast p1, Ljava/io/PrintWriter;

    .line 601
    .line 602
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    new-instance v0, Ljava/lang/StringBuilder;

    .line 607
    .line 608
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    const-string p0, " Fallback request (3)"

    .line 615
    .line 616
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    return-object v6

    .line 627
    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    .line 628
    .line 629
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    return-object v6

    .line 633
    :pswitch_13
    check-cast p1, Ldo5;

    .line 634
    .line 635
    return-object v6

    .line 636
    :pswitch_14
    check-cast p1, Lid7;

    .line 637
    .line 638
    return-object v6

    .line 639
    :pswitch_15
    check-cast p1, Lp87;

    .line 640
    .line 641
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 645
    .line 646
    .line 647
    move-result p0

    .line 648
    if-eqz p0, :cond_10

    .line 649
    .line 650
    if-eq p0, v3, :cond_11

    .line 651
    .line 652
    const/4 p1, 0x2

    .line 653
    if-ne p0, p1, :cond_f

    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_f
    invoke-static {}, Lb61;->c()V

    .line 657
    .line 658
    .line 659
    goto :goto_a

    .line 660
    :cond_10
    move v3, v5

    .line 661
    :cond_11
    :goto_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    :goto_a
    return-object v4

    .line 666
    :pswitch_16
    if-nez p1, :cond_12

    .line 667
    .line 668
    goto :goto_b

    .line 669
    :cond_12
    move v3, v5

    .line 670
    :goto_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 671
    .line 672
    .line 673
    move-result-object p0

    .line 674
    return-object p0

    .line 675
    :pswitch_17
    return-object p1

    .line 676
    :pswitch_18
    check-cast p1, Lu27;

    .line 677
    .line 678
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    invoke-interface {p1}, Lu27;->iterator()Ljava/util/Iterator;

    .line 682
    .line 683
    .line 684
    move-result-object p0

    .line 685
    return-object p0

    .line 686
    :pswitch_19
    check-cast p1, Lsu/happ/proxyutility/dto/ServerCache;

    .line 687
    .line 688
    sget-object p0, Lkw2;->a:Lkw2;

    .line 689
    .line 690
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    invoke-static {p0}, Lkw2;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    return-object p0

    .line 699
    :pswitch_1a
    check-cast p1, Ltk;

    .line 700
    .line 701
    iget p0, p1, Ltk;->a:F

    .line 702
    .line 703
    iget p1, p1, Ltk;->b:F

    .line 704
    .line 705
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 706
    .line 707
    .line 708
    move-result p0

    .line 709
    int-to-long v3, p0

    .line 710
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 711
    .line 712
    .line 713
    move-result p0

    .line 714
    int-to-long p0, p0

    .line 715
    shl-long v2, v3, v2

    .line 716
    .line 717
    and-long/2addr p0, v0

    .line 718
    or-long/2addr p0, v2

    .line 719
    new-instance v0, Lz85;

    .line 720
    .line 721
    invoke-direct {v0, p0, p1}, Lz85;-><init>(J)V

    .line 722
    .line 723
    .line 724
    return-object v0

    .line 725
    :pswitch_1b
    check-cast p1, Lz85;

    .line 726
    .line 727
    iget-wide v3, p1, Lz85;->a:J

    .line 728
    .line 729
    const-wide v5, 0x7fffffff7fffffffL

    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    and-long/2addr v5, v3

    .line 735
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    cmp-long p0, v5, v7

    .line 741
    .line 742
    if-eqz p0, :cond_13

    .line 743
    .line 744
    new-instance p0, Ltk;

    .line 745
    .line 746
    shr-long v2, v3, v2

    .line 747
    .line 748
    long-to-int v2, v2

    .line 749
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    iget-wide v3, p1, Lz85;->a:J

    .line 754
    .line 755
    and-long/2addr v0, v3

    .line 756
    long-to-int p1, v0

    .line 757
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 758
    .line 759
    .line 760
    move-result p1

    .line 761
    invoke-direct {p0, v2, p1}, Ltk;-><init>(FF)V

    .line 762
    .line 763
    .line 764
    goto :goto_c

    .line 765
    :cond_13
    sget-object p0, Lo07;->a:Ltk;

    .line 766
    .line 767
    :goto_c
    return-object p0

    .line 768
    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    .line 769
    .line 770
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 771
    .line 772
    .line 773
    move-result p0

    .line 774
    new-instance p1, Lay6;

    .line 775
    .line 776
    invoke-direct {p1, p0}, Lay6;-><init>(I)V

    .line 777
    .line 778
    .line 779
    return-object p1

    .line 780
    nop

    .line 781
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

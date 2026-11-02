.class public final Lzk3;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lzk3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzk3;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 9
    iput-byte p3, p0, Lzk3;->X:B

    iput-object p2, p0, Lzk3;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lzk3;->X:B

    .line 2
    .line 3
    sget-object v1, Le02;->X:Le02;

    .line 4
    .line 5
    sget-object v2, Ld02;->X:Ld02;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object p0, p0, Lzk3;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, [Lxe2;

    .line 16
    .line 17
    array-length p0, p0

    .line 18
    new-array p0, p0, [Lx31;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p0, Lnt8;

    .line 22
    .line 23
    iget-object p0, p0, Lnt8;->p0:Lvz7;

    .line 24
    .line 25
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/List;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    check-cast p0, Lxd6;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    filled-new-array {p0}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, Ls32;->A0:Ls32;

    .line 43
    .line 44
    invoke-static {v0, p0}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    check-cast p0, Lfw7;

    .line 50
    .line 51
    iget-object v0, p0, Lfw7;->b:Let4;

    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    invoke-static {v0, v5, v1}, Lhi5;->b0(Let4;Lpk1;I)Ljava/util/Collection;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lfw7;->i(Ljava/util/Collection;)Ljava/util/Collection;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_3
    check-cast p0, Lwi8;

    .line 64
    .line 65
    iget-object p0, p0, Lwi8;->a:Lui8;

    .line 66
    .line 67
    new-instance v0, Lwi8;

    .line 68
    .line 69
    invoke-direct {v0, p0}, Lwi8;-><init>(Lui8;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_4
    check-cast p0, Lzk3;

    .line 74
    .line 75
    invoke-virtual {p0}, Lzk3;->invoke()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Lfx8;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_5
    check-cast p0, Lwu7;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_6
    check-cast p0, Lzk3;

    .line 86
    .line 87
    invoke-virtual {p0}, Lzk3;->invoke()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lfx8;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_7
    check-cast p0, Lok7;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_8
    check-cast p0, Lwg7;

    .line 98
    .line 99
    iget-object p0, p0, Lwg7;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Lhi8;

    .line 102
    .line 103
    invoke-static {p0}, Los4;->O(Lhi8;)Lt14;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_9
    check-cast p0, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const-string v0, "guid"

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-eqz p0, :cond_0

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    sget-object p0, Lsu/happ/proxyutility/domain/sub/GuId;->Companion:Lwu2;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/GuId;->a()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    :goto_0
    new-instance v0, Lsu/happ/proxyutility/domain/sub/GuId;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Lsu/happ/proxyutility/domain/sub/GuId;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_a
    check-cast p0, Lgx6;

    .line 139
    .line 140
    iget-object p0, p0, Lgx6;->b:Lgn2;

    .line 141
    .line 142
    sget-object v0, Lz14;->t:Lz14;

    .line 143
    .line 144
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, Let4;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_b
    check-cast p0, Lob6;

    .line 152
    .line 153
    invoke-virtual {p0}, Lob6;->f()Lkb6;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, Lmb6;->J(Lkb6;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_2

    .line 162
    .line 163
    instance-of v0, p0, Lz04;

    .line 164
    .line 165
    if-nez v0, :cond_1

    .line 166
    .line 167
    goto/16 :goto_6

    .line 168
    .line 169
    :cond_1
    check-cast p0, Lz04;

    .line 170
    .line 171
    iget-object v0, p0, Lz04;->Y:Lqz3;

    .line 172
    .line 173
    iget-object v0, v0, Lqz3;->e:Ljava/util/ArrayList;

    .line 174
    .line 175
    new-instance v2, Ljava/util/ArrayList;

    .line 176
    .line 177
    const/16 v1, 0xa

    .line 178
    .line 179
    invoke-static {v0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_a

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Ldy3;

    .line 201
    .line 202
    iget-object v3, p0, Lz04;->X:Lm04;

    .line 203
    .line 204
    invoke-interface {v3}, Lkb6;->D()Lov3;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-interface {v3}, Lfs0;->t()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v3}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v1, v3}, Lys0;->W(Ldy3;Ljava/lang/ClassLoader;)Ljava/lang/annotation/Annotation;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_2
    invoke-virtual {p0}, Lob6;->f()Lkb6;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0}, Lkb6;->r()Lwd0;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0}, Lwd0;->b()Ljava/lang/reflect/Member;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 237
    .line 238
    const/4 v6, 0x5

    .line 239
    const/4 v7, -0x1

    .line 240
    if-eqz v1, :cond_4

    .line 241
    .line 242
    new-instance v1, Lb8;

    .line 243
    .line 244
    invoke-virtual {p0}, Lob6;->v()I

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    move-object v3, v0

    .line 249
    check-cast v3, Ljava/lang/reflect/Method;

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-eqz v3, :cond_3

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_3
    move v4, v7

    .line 263
    :goto_2
    add-int/2addr p0, v4

    .line 264
    invoke-direct {v1, v0, p0, v6}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_4
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    .line 269
    .line 270
    if-eqz v1, :cond_9

    .line 271
    .line 272
    move-object v1, v0

    .line 273
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget-object v8, Lyb6;->a:Lzb6;

    .line 283
    .line 284
    invoke-virtual {v8, v5}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-interface {v5}, Lzu3;->n()Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-eqz v5, :cond_5

    .line 293
    .line 294
    const-string v5, "java.version"

    .line 295
    .line 296
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    if-eqz v5, :cond_5

    .line 301
    .line 302
    const-string v8, "1."

    .line 303
    .line 304
    invoke-static {v5, v4, v8}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-ne v5, v3, :cond_5

    .line 309
    .line 310
    move v4, v7

    .line 311
    goto :goto_3

    .line 312
    :cond_5
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_6

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    array-length v3, v3

    .line 327
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    array-length v1, v1

    .line 332
    sub-int/2addr v3, v1

    .line 333
    add-int/lit8 v4, v3, 0x2

    .line 334
    .line 335
    :cond_6
    :goto_3
    new-instance v1, Lb8;

    .line 336
    .line 337
    invoke-virtual {p0}, Lob6;->v()I

    .line 338
    .line 339
    .line 340
    move-result p0

    .line 341
    add-int/2addr p0, v4

    .line 342
    invoke-direct {v1, v0, p0, v6}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 343
    .line 344
    .line 345
    :goto_4
    iget p0, v1, Lb8;->b:I

    .line 346
    .line 347
    iget-object v0, v1, Lb8;->c:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Ljava/lang/reflect/Member;

    .line 350
    .line 351
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 352
    .line 353
    if-eqz v1, :cond_7

    .line 354
    .line 355
    check-cast v0, Ljava/lang/reflect/Method;

    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    aget-object p0, v0, p0

    .line 362
    .line 363
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-static {p0}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    goto :goto_5

    .line 371
    :cond_7
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    .line 372
    .line 373
    if-eqz v1, :cond_8

    .line 374
    .line 375
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    aget-object p0, v0, p0

    .line 382
    .line 383
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-static {p0}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    :cond_8
    :goto_5
    invoke-static {v2}, Lms8;->t(Ljava/util/List;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    goto :goto_6

    .line 395
    :cond_9
    const-string p0, "Unsupported parameter owner: "

    .line 396
    .line 397
    invoke-static {v0, p0}, Lxw3;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    move-object v2, v5

    .line 401
    :cond_a
    :goto_6
    return-object v2

    .line 402
    :pswitch_c
    check-cast p0, Ld45;

    .line 403
    .line 404
    iget-object p0, p0, Ld45;->Y:Ldn2;

    .line 405
    .line 406
    if-eqz p0, :cond_b

    .line 407
    .line 408
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    move-object v5, p0

    .line 413
    check-cast v5, Ljava/util/List;

    .line 414
    .line 415
    :cond_b
    return-object v5

    .line 416
    :pswitch_d
    check-cast p0, Lz74;

    .line 417
    .line 418
    iget-object p0, p0, Lz74;->Z:Ldn2;

    .line 419
    .line 420
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    check-cast p0, Lx14;

    .line 425
    .line 426
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    check-cast p0, Lt14;

    .line 430
    .line 431
    return-object p0

    .line 432
    :pswitch_e
    check-cast p0, Lb54;

    .line 433
    .line 434
    iget-object p0, p0, Lb54;->o:Lv44;

    .line 435
    .line 436
    iget-object p0, p0, Luf5;->i0:Lfk2;

    .line 437
    .line 438
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    return-object v5

    .line 442
    :pswitch_f
    check-cast p0, Ln14;

    .line 443
    .line 444
    new-instance v0, Lm14;

    .line 445
    .line 446
    invoke-direct {v0, p0}, Lm14;-><init>(Ln14;)V

    .line 447
    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_10
    check-cast p0, Lc14;

    .line 451
    .line 452
    invoke-static {p0, v3}, Lch3;->p(Lb14;Z)Lwd0;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    return-object p0

    .line 457
    :pswitch_11
    check-cast p0, Lz04;

    .line 458
    .line 459
    iget-object v0, p0, Lz04;->X:Lm04;

    .line 460
    .line 461
    invoke-interface {v0}, Lkb6;->D()Lov3;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    instance-of v1, v1, Lew3;

    .line 466
    .line 467
    if-nez v1, :cond_d

    .line 468
    .line 469
    invoke-static {v0}, Lmb6;->L(Lkb6;)Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-eqz v1, :cond_c

    .line 474
    .line 475
    goto :goto_7

    .line 476
    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    const-string v2, "Only constructors and top-level callables are supported for now: "

    .line 479
    .line 480
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-interface {v0}, Lkb6;->D()Lov3;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-interface {v0}, Lxu3;->getName()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iget-object p0, p0, Lz04;->g0:Ljava/lang/String;

    .line 495
    .line 496
    invoke-static {v1, v0, p0}, Lxw3;->p(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    goto :goto_8

    .line 500
    :cond_d
    :goto_7
    invoke-interface {v0}, Lkb6;->r()Lwd0;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-interface {v0}, Lwd0;->a()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    iget p0, p0, Lz04;->Z:I

    .line 509
    .line 510
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    move-object v5, p0

    .line 515
    check-cast v5, Ljava/lang/reflect/Type;

    .line 516
    .line 517
    :goto_8
    return-object v5

    .line 518
    :pswitch_12
    check-cast p0, Lv04;

    .line 519
    .line 520
    new-instance v0, Lu04;

    .line 521
    .line 522
    invoke-direct {v0, p0}, Lu04;-><init>(Lv04;)V

    .line 523
    .line 524
    .line 525
    return-object v0

    .line 526
    :pswitch_13
    check-cast p0, Lt04;

    .line 527
    .line 528
    new-instance v0, Ls04;

    .line 529
    .line 530
    invoke-direct {v0, p0}, Ls04;-><init>(Lt04;)V

    .line 531
    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_14
    check-cast p0, Lr04;

    .line 535
    .line 536
    new-instance v0, Lq04;

    .line 537
    .line 538
    invoke-direct {v0, p0}, Lq04;-><init>(Lr04;)V

    .line 539
    .line 540
    .line 541
    return-object v0

    .line 542
    :pswitch_15
    check-cast p0, Ldw3;

    .line 543
    .line 544
    iget-object v0, p0, Ldw3;->d:Ltb6;

    .line 545
    .line 546
    sget-object v1, Ldw3;->g:[Lnw3;

    .line 547
    .line 548
    aget-object v1, v1, v4

    .line 549
    .line 550
    invoke-virtual {v0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    check-cast v0, Lqb6;

    .line 555
    .line 556
    if-eqz v0, :cond_1b

    .line 557
    .line 558
    iget-object p0, p0, Lnv3;->a:Ltb6;

    .line 559
    .line 560
    sget-object v1, Lnv3;->b:[Lnw3;

    .line 561
    .line 562
    aget-object v1, v1, v4

    .line 563
    .line 564
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    check-cast p0, Lgr6;

    .line 572
    .line 573
    iget-object p0, p0, Lgr6;->b:Lf63;

    .line 574
    .line 575
    iget-object v1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v1, Lzl1;

    .line 578
    .line 579
    iget-object v3, p0, Lf63;->f0:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 582
    .line 583
    iget-object v6, v0, Lqb6;->a:Ljava/lang/Class;

    .line 584
    .line 585
    invoke-static {v6}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 586
    .line 587
    .line 588
    move-result-object v7

    .line 589
    invoke-virtual {v3, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    if-nez v8, :cond_1a

    .line 594
    .line 595
    invoke-static {v6}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    iget-object v6, v6, Lqs0;->a:Lfk2;

    .line 600
    .line 601
    iget-object v8, v0, Lqb6;->b:Lb04;

    .line 602
    .line 603
    iget-object v9, v8, Lb04;->a:La04;

    .line 604
    .line 605
    sget-object v10, La04;->j0:La04;

    .line 606
    .line 607
    if-ne v9, v10, :cond_15

    .line 608
    .line 609
    iget-object v8, v8, Lb04;->c:[Ljava/lang/String;

    .line 610
    .line 611
    if-ne v9, v10, :cond_e

    .line 612
    .line 613
    goto :goto_9

    .line 614
    :cond_e
    move-object v8, v5

    .line 615
    :goto_9
    if-eqz v8, :cond_f

    .line 616
    .line 617
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    goto :goto_a

    .line 625
    :cond_f
    move-object v8, v5

    .line 626
    :goto_a
    if-nez v8, :cond_10

    .line 627
    .line 628
    goto :goto_b

    .line 629
    :cond_10
    move-object v2, v8

    .line 630
    :goto_b
    new-instance v8, Ljava/util/ArrayList;

    .line 631
    .line 632
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 633
    .line 634
    .line 635
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    :cond_11
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 640
    .line 641
    .line 642
    move-result v9

    .line 643
    if-eqz v9, :cond_16

    .line 644
    .line 645
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v9

    .line 649
    check-cast v9, Ljava/lang/String;

    .line 650
    .line 651
    if-eqz v9, :cond_14

    .line 652
    .line 653
    new-instance v10, Lfk2;

    .line 654
    .line 655
    const/16 v11, 0x2f

    .line 656
    .line 657
    const/16 v12, 0x2e

    .line 658
    .line 659
    invoke-virtual {v9, v11, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v9

    .line 663
    invoke-direct {v10, v9}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v10}, Lfk2;->b()Lfk2;

    .line 667
    .line 668
    .line 669
    move-result-object v9

    .line 670
    iget-object v10, v10, Lfk2;->a:Lgk2;

    .line 671
    .line 672
    invoke-virtual {v10}, Lgk2;->g()Lv15;

    .line 673
    .line 674
    .line 675
    move-result-object v10

    .line 676
    sget-object v11, Lfk2;->c:Lfk2;

    .line 677
    .line 678
    invoke-static {v10}, Lwl7;->h0(Lv15;)Lfk2;

    .line 679
    .line 680
    .line 681
    move-result-object v10

    .line 682
    iget-object v10, v10, Lfk2;->a:Lgk2;

    .line 683
    .line 684
    invoke-virtual {v10}, Lgk2;->c()Z

    .line 685
    .line 686
    .line 687
    iget-object v11, p0, Lf63;->Z:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v11, Ly45;

    .line 690
    .line 691
    invoke-virtual {v1}, Lzl1;->c()Lhl1;

    .line 692
    .line 693
    .line 694
    move-result-object v13

    .line 695
    iget-object v13, v13, Lhl1;->c:Lpz2;

    .line 696
    .line 697
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    sget-object v13, Lhv4;->g:Lhv4;

    .line 701
    .line 702
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    iget-object v10, v10, Lgk2;->a:Ljava/lang/String;

    .line 706
    .line 707
    const/16 v13, 0x24

    .line 708
    .line 709
    invoke-static {v10, v12, v13}, Lmm7;->X(Ljava/lang/String;CC)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v10

    .line 713
    iget-object v13, v9, Lfk2;->a:Lgk2;

    .line 714
    .line 715
    invoke-virtual {v13}, Lgk2;->c()Z

    .line 716
    .line 717
    .line 718
    move-result v13

    .line 719
    if-eqz v13, :cond_12

    .line 720
    .line 721
    goto :goto_d

    .line 722
    :cond_12
    new-instance v13, Ljava/lang/StringBuilder;

    .line 723
    .line 724
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v10

    .line 740
    :goto_d
    invoke-virtual {v11, v10}, Ly45;->C(Ljava/lang/String;)Lvk1;

    .line 741
    .line 742
    .line 743
    move-result-object v9

    .line 744
    if-eqz v9, :cond_13

    .line 745
    .line 746
    iget-object v9, v9, Lvk1;->Y:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v9, Lqb6;

    .line 749
    .line 750
    goto :goto_e

    .line 751
    :cond_13
    move-object v9, v5

    .line 752
    :goto_e
    if-eqz v9, :cond_11

    .line 753
    .line 754
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_c

    .line 758
    :cond_14
    invoke-static {v4}, Lzs3;->a(I)V

    .line 759
    .line 760
    .line 761
    throw v5

    .line 762
    :cond_15
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 763
    .line 764
    .line 765
    move-result-object v8

    .line 766
    :cond_16
    new-instance p0, Lh02;

    .line 767
    .line 768
    invoke-virtual {v1}, Lzl1;->c()Lhl1;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    iget-object v2, v2, Lhl1;->b:Lvx4;

    .line 773
    .line 774
    invoke-direct {p0, v2, v6, v4}, Lh02;-><init>(Lvx4;Lfk2;B)V

    .line 775
    .line 776
    .line 777
    new-instance v2, Ljava/util/ArrayList;

    .line 778
    .line 779
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 780
    .line 781
    .line 782
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    :cond_17
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v5

    .line 790
    if-eqz v5, :cond_18

    .line 791
    .line 792
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    check-cast v5, Lqb6;

    .line 797
    .line 798
    invoke-virtual {v1, p0, v5}, Lzl1;->a(Ltf5;Lqb6;)Lhm1;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    if-eqz v5, :cond_17

    .line 803
    .line 804
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto :goto_f

    .line 808
    :cond_18
    invoke-static {v2}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object p0

    .line 812
    new-instance v1, Ljava/lang/StringBuilder;

    .line 813
    .line 814
    const-string v2, "package "

    .line 815
    .line 816
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    const-string v2, " ("

    .line 823
    .line 824
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    const/16 v0, 0x29

    .line 831
    .line 832
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-static {v0, p0}, Ldh3;->o(Ljava/lang/String;Ljava/lang/Iterable;)Let4;

    .line 840
    .line 841
    .line 842
    move-result-object p0

    .line 843
    invoke-virtual {v3, v7, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    if-nez v0, :cond_19

    .line 848
    .line 849
    move-object v8, p0

    .line 850
    goto :goto_10

    .line 851
    :cond_19
    move-object v8, v0

    .line 852
    :cond_1a
    :goto_10
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    check-cast v8, Let4;

    .line 856
    .line 857
    goto :goto_11

    .line 858
    :cond_1b
    sget-object v8, Ldt4;->b:Ldt4;

    .line 859
    .line 860
    :goto_11
    return-object v8

    .line 861
    :pswitch_16
    check-cast p0, Ltt3;

    .line 862
    .line 863
    iget-object v0, p0, Ltt3;->c:Lv44;

    .line 864
    .line 865
    iget-object v1, v0, Lv44;->m0:Lte4;

    .line 866
    .line 867
    sget-object v2, Lv44;->q0:[Lnw3;

    .line 868
    .line 869
    aget-object v2, v2, v4

    .line 870
    .line 871
    invoke-static {v1, v2}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    check-cast v1, Ljava/util/Map;

    .line 876
    .line 877
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    check-cast v1, Ljava/lang/Iterable;

    .line 882
    .line 883
    new-instance v2, Ljava/util/ArrayList;

    .line 884
    .line 885
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 886
    .line 887
    .line 888
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    :cond_1c
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    if-eqz v3, :cond_1d

    .line 897
    .line 898
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    check-cast v3, Lqb6;

    .line 903
    .line 904
    iget-object v5, p0, Ltt3;->b:Lz47;

    .line 905
    .line 906
    iget-object v5, v5, Lz47;->Y:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v5, Lc6;

    .line 909
    .line 910
    iget-object v5, v5, Lc6;->j0:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v5, Lzl1;

    .line 913
    .line 914
    invoke-virtual {v5, v0, v3}, Lzl1;->a(Ltf5;Lqb6;)Lhm1;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    if-eqz v3, :cond_1c

    .line 919
    .line 920
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    goto :goto_12

    .line 924
    :cond_1d
    invoke-static {v2}, Lz39;->A(Ljava/util/ArrayList;)Loc7;

    .line 925
    .line 926
    .line 927
    move-result-object p0

    .line 928
    new-array v0, v4, [Let4;

    .line 929
    .line 930
    invoke-virtual {p0, v0}, Loc7;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object p0

    .line 934
    check-cast p0, [Let4;

    .line 935
    .line 936
    return-object p0

    .line 937
    :pswitch_17
    check-cast p0, Lrs3;

    .line 938
    .line 939
    iget-object v0, p0, Lrs3;->f:Lps3;

    .line 940
    .line 941
    if-eqz v0, :cond_1e

    .line 942
    .line 943
    invoke-virtual {v0}, Lps3;->invoke()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    check-cast v0, Lqs3;

    .line 948
    .line 949
    iput-object v5, p0, Lrs3;->f:Lps3;

    .line 950
    .line 951
    move-object v5, v0

    .line 952
    goto :goto_13

    .line 953
    :cond_1e
    const-string p0, "JvmBuiltins instance has not been initialized properly"

    .line 954
    .line 955
    invoke-static {p0}, Lbt;->g(Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    :goto_13
    return-object v5

    .line 959
    :pswitch_18
    check-cast p0, Lis3;

    .line 960
    .line 961
    invoke-static {}, Li21;->r()Lgb4;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    iget-object v1, p0, Lis3;->a:Lje6;

    .line 966
    .line 967
    iget-object v1, v1, Lje6;->X:Ljava/lang/String;

    .line 968
    .line 969
    invoke-virtual {v0, v1}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    iget-object v1, p0, Lis3;->b:Lje6;

    .line 973
    .line 974
    if-eqz v1, :cond_1f

    .line 975
    .line 976
    iget-object v1, v1, Lje6;->X:Ljava/lang/String;

    .line 977
    .line 978
    const-string v2, "under-migration:"

    .line 979
    .line 980
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    invoke-virtual {v0, v1}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    :cond_1f
    iget-object p0, p0, Lis3;->c:Ljava/util/Map;

    .line 988
    .line 989
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 990
    .line 991
    .line 992
    move-result-object p0

    .line 993
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 994
    .line 995
    .line 996
    move-result-object p0

    .line 997
    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 998
    .line 999
    .line 1000
    move-result v1

    .line 1001
    if-eqz v1, :cond_20

    .line 1002
    .line 1003
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    check-cast v1, Ljava/util/Map$Entry;

    .line 1008
    .line 1009
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    const-string v3, "@"

    .line 1012
    .line 1013
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v3

    .line 1020
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    const/16 v3, 0x3a

    .line 1024
    .line 1025
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    check-cast v1, Lje6;

    .line 1033
    .line 1034
    iget-object v1, v1, Lje6;->X:Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v1

    .line 1043
    invoke-virtual {v0, v1}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    goto :goto_14

    .line 1047
    :cond_20
    invoke-static {v0}, Li21;->j(Lgb4;)Lgb4;

    .line 1048
    .line 1049
    .line 1050
    move-result-object p0

    .line 1051
    new-array v0, v4, [Ljava/lang/String;

    .line 1052
    .line 1053
    invoke-virtual {p0, v0}, Lgb4;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object p0

    .line 1057
    check-cast p0, [Ljava/lang/String;

    .line 1058
    .line 1059
    return-object p0

    .line 1060
    :pswitch_19
    check-cast p0, Lil3;

    .line 1061
    .line 1062
    iget-object p0, p0, Ltj3;->d:Lka6;

    .line 1063
    .line 1064
    instance-of v0, p0, Lma6;

    .line 1065
    .line 1066
    if-eqz v0, :cond_21

    .line 1067
    .line 1068
    sget-object v0, Lwj3;->a:Ljava/util/Map;

    .line 1069
    .line 1070
    check-cast p0, Lma6;

    .line 1071
    .line 1072
    invoke-virtual {p0}, Lma6;->a()Ljava/util/ArrayList;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p0

    .line 1076
    invoke-static {p0}, Lwj3;->a(Ljava/util/List;)Ldu;

    .line 1077
    .line 1078
    .line 1079
    move-result-object p0

    .line 1080
    goto :goto_15

    .line 1081
    :cond_21
    instance-of v0, p0, Lya6;

    .line 1082
    .line 1083
    if-eqz v0, :cond_22

    .line 1084
    .line 1085
    sget-object v0, Lwj3;->a:Ljava/util/Map;

    .line 1086
    .line 1087
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 1088
    .line 1089
    .line 1090
    move-result-object p0

    .line 1091
    invoke-static {p0}, Lwj3;->a(Ljava/util/List;)Ldu;

    .line 1092
    .line 1093
    .line 1094
    move-result-object p0

    .line 1095
    goto :goto_15

    .line 1096
    :cond_22
    move-object p0, v5

    .line 1097
    :goto_15
    if-eqz p0, :cond_23

    .line 1098
    .line 1099
    sget-object v0, Luj3;->b:Lv15;

    .line 1100
    .line 1101
    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1106
    .line 1107
    .line 1108
    :cond_23
    if-nez v5, :cond_24

    .line 1109
    .line 1110
    goto :goto_16

    .line 1111
    :cond_24
    move-object v1, v5

    .line 1112
    :goto_16
    return-object v1

    .line 1113
    :pswitch_1a
    check-cast p0, Lhl3;

    .line 1114
    .line 1115
    sget-object v0, Lwj3;->a:Ljava/util/Map;

    .line 1116
    .line 1117
    iget-object p0, p0, Ltj3;->d:Lka6;

    .line 1118
    .line 1119
    instance-of v0, p0, Lya6;

    .line 1120
    .line 1121
    if-eqz v0, :cond_25

    .line 1122
    .line 1123
    check-cast p0, Lya6;

    .line 1124
    .line 1125
    goto :goto_17

    .line 1126
    :cond_25
    move-object p0, v5

    .line 1127
    :goto_17
    if-eqz p0, :cond_26

    .line 1128
    .line 1129
    sget-object v0, Lwj3;->b:Ljava/util/Map;

    .line 1130
    .line 1131
    iget-object p0, p0, Lya6;->b:Ljava/lang/Enum;

    .line 1132
    .line 1133
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object p0

    .line 1137
    invoke-static {p0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 1138
    .line 1139
    .line 1140
    move-result-object p0

    .line 1141
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object p0

    .line 1145
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object p0

    .line 1149
    check-cast p0, Lr14;

    .line 1150
    .line 1151
    if-eqz p0, :cond_26

    .line 1152
    .line 1153
    new-instance v0, Lx22;

    .line 1154
    .line 1155
    sget-object v2, Ltg7;->v:Lfk2;

    .line 1156
    .line 1157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    new-instance v3, Lqs0;

    .line 1161
    .line 1162
    invoke-virtual {v2}, Lfk2;->b()Lfk2;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v4

    .line 1166
    iget-object v2, v2, Lfk2;->a:Lgk2;

    .line 1167
    .line 1168
    invoke-virtual {v2}, Lgk2;->g()Lv15;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v2

    .line 1172
    invoke-direct {v3, v4, v2}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object p0

    .line 1179
    invoke-static {p0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p0

    .line 1183
    invoke-direct {v0, v3, p0}, Lx22;-><init>(Lqs0;Lv15;)V

    .line 1184
    .line 1185
    .line 1186
    goto :goto_18

    .line 1187
    :cond_26
    move-object v0, v5

    .line 1188
    :goto_18
    if-eqz v0, :cond_27

    .line 1189
    .line 1190
    sget-object p0, Luj3;->c:Lv15;

    .line 1191
    .line 1192
    invoke-static {p0, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v5

    .line 1196
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    :cond_27
    if-nez v5, :cond_28

    .line 1200
    .line 1201
    goto :goto_19

    .line 1202
    :cond_28
    move-object v1, v5

    .line 1203
    :goto_19
    return-object v1

    .line 1204
    :pswitch_1b
    check-cast p0, Lbl3;

    .line 1205
    .line 1206
    invoke-static {p0, v3}, Lw79;->k(Lyk3;Z)Lne0;

    .line 1207
    .line 1208
    .line 1209
    move-result-object p0

    .line 1210
    return-object p0

    .line 1211
    :pswitch_data_0
    .packed-switch 0x0
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

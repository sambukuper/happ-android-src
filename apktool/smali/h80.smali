.class public final synthetic Lh80;
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
    iput-byte p1, p0, Lh80;->X:B

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
    .locals 7

    .line 1
    iget-byte p0, p0, Lh80;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x3a

    .line 5
    .line 6
    const/16 v2, 0x2d

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    sget-object v5, Ldn8;->a:Ldn8;

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance p1, Lja7;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lja7;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    check-cast p1, Ljava/io/PrintWriter;

    .line 38
    .line 39
    new-instance p0, Ljava/util/Date;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, " Happ file failed"

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v5

    .line 65
    :pswitch_1
    check-cast p1, Ljava/io/PrintWriter;

    .line 66
    .line 67
    new-instance p0, Ljava/util/Date;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, " Happ file updated"

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v5

    .line 93
    :pswitch_2
    check-cast p1, Lmd4;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lzb1;->n(Lzb1;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v2}, Lz68;->t(Lcc1;C)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lbc1;->m(Lbc1;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1, v2}, Lz68;->t(Lcc1;C)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lbc1;->j(Lbc1;)V

    .line 111
    .line 112
    .line 113
    const/16 p0, 0x20

    .line 114
    .line 115
    invoke-static {p1, p0}, Lz68;->t(Lcc1;C)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Ldg5;->Y:Ldg5;

    .line 119
    .line 120
    invoke-interface {p1, p0}, Lac1;->b(Ldg5;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v1}, Lz68;->t(Lcc1;C)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, p0}, Lac1;->f(Ldg5;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v1}, Lz68;->t(Lcc1;C)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p1, p0}, Lac1;->c(Ldg5;)V

    .line 133
    .line 134
    .line 135
    return-object v5

    .line 136
    :pswitch_3
    check-cast p1, Ljava/io/PrintWriter;

    .line 137
    .line 138
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p0, " Fallback to assets"

    .line 151
    .line 152
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v5

    .line 163
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance p0, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 169
    .line 170
    invoke-static {p1}, Ljm4;->E(Ljava/lang/String;)Landroid/net/IpPrefix;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-direct {p0, p1, v0}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;-><init>(Ljava/lang/String;Landroid/net/IpPrefix;)V

    .line 175
    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {p1}, Ljm4;->N(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :pswitch_6
    check-cast p1, Lqg5;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object p0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Ljava/lang/String;

    .line 200
    .line 201
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p1, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 219
    .line 220
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_8
    check-cast p1, Ldo5;

    .line 224
    .line 225
    return-object v5

    .line 226
    :pswitch_9
    check-cast p1, Loq5;

    .line 227
    .line 228
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_a
    check-cast p1, Ljava/net/InetAddress;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_b
    check-cast p1, [B

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance p0, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    array-length v0, p1

    .line 252
    :goto_0
    if-ge v3, v0, :cond_4

    .line 253
    .line 254
    aget-byte v5, p1, v3

    .line 255
    .line 256
    and-int/lit16 v5, v5, 0xff

    .line 257
    .line 258
    if-eq v5, v2, :cond_3

    .line 259
    .line 260
    const/16 v6, 0x30

    .line 261
    .line 262
    if-gt v6, v5, :cond_0

    .line 263
    .line 264
    if-ge v5, v1, :cond_0

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_0
    const/16 v6, 0x41

    .line 268
    .line 269
    if-gt v6, v5, :cond_1

    .line 270
    .line 271
    const/16 v6, 0x5b

    .line 272
    .line 273
    if-ge v5, v6, :cond_1

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_1
    const/16 v6, 0x61

    .line 277
    .line 278
    if-gt v6, v5, :cond_2

    .line 279
    .line 280
    const/16 v6, 0x7b

    .line 281
    .line 282
    if-ge v5, v6, :cond_2

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    const-string v6, "\\x%02x"

    .line 298
    .line 299
    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    goto :goto_2

    .line 307
    :cond_3
    :goto_1
    int-to-char v5, v5

    .line 308
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 312
    .line 313
    goto :goto_0

    .line 314
    :cond_4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    return-object p0

    .line 319
    :pswitch_c
    check-cast p1, [B

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    new-instance p0, Ljava/lang/String;

    .line 325
    .line 326
    sget-object v0, Liq0;->a:Ljava/nio/charset/Charset;

    .line 327
    .line 328
    invoke-direct {p0, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 329
    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_d
    check-cast p1, Ljava/net/InetAddress;

    .line 333
    .line 334
    invoke-static {p1}, Lokhttp3/Dns$Record$ServiceMetadata;->a(Ljava/net/InetAddress;)Ljava/lang/CharSequence;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    return-object p0

    .line 339
    :pswitch_e
    invoke-static {p1}, Lw39;->j(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    return-object p0

    .line 348
    :pswitch_f
    check-cast p1, Lko1;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1, v3, v3}, Lsn1;->R(ZZ)V

    .line 354
    .line 355
    .line 356
    return-object v5

    .line 357
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    return-object v5

    .line 363
    :pswitch_11
    check-cast p1, Lf17;

    .line 364
    .line 365
    invoke-static {p1}, Ld17;->f(Lf17;)V

    .line 366
    .line 367
    .line 368
    return-object v5

    .line 369
    :pswitch_12
    instance-of p0, p1, [Ljava/lang/Object;

    .line 370
    .line 371
    if-eqz p0, :cond_5

    .line 372
    .line 373
    move-object v0, p1

    .line 374
    check-cast v0, [Ljava/lang/Object;

    .line 375
    .line 376
    new-instance v4, Lh80;

    .line 377
    .line 378
    const/16 p0, 0xa

    .line 379
    .line 380
    invoke-direct {v4, p0}, Lh80;-><init>(B)V

    .line 381
    .line 382
    .line 383
    const/16 v5, 0x19

    .line 384
    .line 385
    const/4 v1, 0x0

    .line 386
    const-string v2, "["

    .line 387
    .line 388
    const-string v3, "]"

    .line 389
    .line 390
    invoke-static/range {v0 .. v5}, Leu;->x0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    goto :goto_3

    .line 395
    :cond_5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    :goto_3
    return-object p0

    .line 400
    :pswitch_13
    check-cast p1, Ljava/util/Map$Entry;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    check-cast p0, Ljava/lang/String;

    .line 410
    .line 411
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    instance-of v0, p1, [Ljava/lang/Object;

    .line 416
    .line 417
    if-eqz v0, :cond_6

    .line 418
    .line 419
    check-cast p1, [Ljava/lang/Object;

    .line 420
    .line 421
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    const-string p0, " : "

    .line 437
    .line 438
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    return-object p0

    .line 449
    :pswitch_14
    check-cast p1, Lq61;

    .line 450
    .line 451
    instance-of p0, p1, Lu61;

    .line 452
    .line 453
    if-eqz p0, :cond_7

    .line 454
    .line 455
    move-object v0, p1

    .line 456
    check-cast v0, Lu61;

    .line 457
    .line 458
    :cond_7
    return-object v0

    .line 459
    :pswitch_15
    check-cast p1, Lix4;

    .line 460
    .line 461
    instance-of p0, p1, Lyz0;

    .line 462
    .line 463
    xor-int/2addr p0, v4

    .line 464
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    return-object p0

    .line 469
    :pswitch_16
    check-cast p1, Luz0;

    .line 470
    .line 471
    instance-of p0, p1, Landroidx/compose/ui/node/LayoutNode;

    .line 472
    .line 473
    if-eqz p0, :cond_8

    .line 474
    .line 475
    move-object v0, p1

    .line 476
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 477
    .line 478
    :cond_8
    if-eqz v0, :cond_9

    .line 479
    .line 480
    iget-boolean p0, v0, Landroidx/compose/ui/node/LayoutNode;->Q0:Z

    .line 481
    .line 482
    if-ne p0, v4, :cond_9

    .line 483
    .line 484
    new-instance p0, Ljava/lang/StringBuilder;

    .line 485
    .line 486
    const-string v0, "Apply is called on deactivated node "

    .line 487
    .line 488
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    invoke-static {p0}, Lwc3;->b(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :cond_9
    return-object v5

    .line 502
    :pswitch_17
    check-cast p1, Ljava/lang/Long;

    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    return-object v5

    .line 508
    :pswitch_18
    check-cast p1, Lye8;

    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    check-cast p1, Ldi5;

    .line 514
    .line 515
    iput-boolean v3, p1, Ldi5;->r0:Z

    .line 516
    .line 517
    invoke-static {p1}, Lch3;->I(Lw07;)V

    .line 518
    .line 519
    .line 520
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 521
    .line 522
    return-object p0

    .line 523
    :pswitch_19
    check-cast p1, Lf17;

    .line 524
    .line 525
    return-object v5

    .line 526
    :pswitch_1a
    check-cast p1, Ljava/io/PrintWriter;

    .line 527
    .line 528
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    const-string p0, "subscription try add"

    .line 532
    .line 533
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-object v5

    .line 537
    :pswitch_1b
    check-cast p1, Lkl5;

    .line 538
    .line 539
    sget-object p0, Lpc;->b:Lox1;

    .line 540
    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    check-cast p0, Landroid/content/Context;

    .line 549
    .line 550
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    const-string p1, "android.software.leanback"

    .line 555
    .line 556
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 557
    .line 558
    .line 559
    move-result p0

    .line 560
    if-nez p0, :cond_a

    .line 561
    .line 562
    sget-object p0, Lw80;->a:Lv80;

    .line 563
    .line 564
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    sget-object p0, Lv80;->c:Lu80;

    .line 568
    .line 569
    goto :goto_4

    .line 570
    :cond_a
    sget-object p0, Ly80;->b:Lx80;

    .line 571
    .line 572
    :goto_4
    return-object p0

    .line 573
    :pswitch_1c
    check-cast p1, Ldo5;

    .line 574
    .line 575
    return-object v5

    .line 576
    nop

    .line 577
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

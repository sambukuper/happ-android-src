.class public final synthetic Lmq7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Lmq7;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly45;)V
    .locals 0

    .line 1
    const/16 p1, 0x14

    .line 2
    .line 3
    iput-byte p1, p0, Lmq7;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, Lmq7;->X:B

    .line 2
    .line 3
    const-string v0, "SETTING"

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkw4;->a:Lkw4;

    .line 13
    .line 14
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    new-array p0, v4, [Le37;

    .line 20
    .line 21
    const-string v5, "kotlinx.datetime.TimeBased"

    .line 22
    .line 23
    invoke-static {v5}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    new-instance v9, Ldt0;

    .line 30
    .line 31
    invoke-direct {v9, v5}, Ldt0;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Loi4;->a:Loi4;

    .line 35
    .line 36
    sget-object v0, Loi4;->b:Lbu5;

    .line 37
    .line 38
    const-string v1, "nanoseconds"

    .line 39
    .line 40
    invoke-virtual {v9, v1, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Lg37;

    .line 44
    .line 45
    sget-object v6, Lpm7;->M:Lpm7;

    .line 46
    .line 47
    iget-object v0, v9, Ldt0;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-static {p0}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-direct/range {v4 .. v9}, Lg37;-><init>(Ljava/lang/String;Lnr4;ILjava/util/List;Ldt0;)V

    .line 58
    .line 59
    .line 60
    move-object v3, v4

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p0, "Blank serial names are prohibited"

    .line 63
    .line 64
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-object v3

    .line 68
    :pswitch_1
    sget-object p0, Log1;->a:Lh88;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_2
    new-instance p0, Lhf3;

    .line 72
    .line 73
    invoke-direct {p0, v1, v2}, Lhf3;-><init>(J)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_3
    new-instance p0, Lhf3;

    .line 78
    .line 79
    invoke-direct {p0, v1, v2}, Lhf3;-><init>(J)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_4
    sget-object p0, Lak8;->a:Lo88;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_5
    return-object v3

    .line 87
    :pswitch_6
    sget-object p0, Lsu/happ/tunnel/TProxyService;->Companion:Lv08;

    .line 88
    .line 89
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_7
    const-string p0, ""

    .line 99
    .line 100
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "get"

    .line 107
    .line 108
    const-class v2, Ljava/lang/String;

    .line 109
    .line 110
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v2, "ro.build.backported_fixes.alias_bitset.long_list"

    .line 119
    .line 120
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    move-object p0, v0

    .line 134
    :catch_0
    invoke-static {}, Li21;->r()Lgb4;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const/4 v1, 0x1

    .line 139
    new-array v1, v1, [C

    .line 140
    .line 141
    const/16 v2, 0x2c

    .line 142
    .line 143
    aput-char v2, v1, v4

    .line 144
    .line 145
    invoke-static {p0, v1}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_1

    .line 158
    .line 159
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ljava/lang/String;

    .line 164
    .line 165
    :try_start_1
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 166
    .line 167
    .line 168
    move-result-wide v1

    .line 169
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v0, v1}, Lgb4;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :catch_1
    :cond_1
    invoke-static {v0}, Li21;->j(Lgb4;)Lgb4;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lf2;->a()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    new-array v0, v0, [J

    .line 189
    .line 190
    invoke-virtual {p0, v4}, Lgb4;->listIterator(I)Ljava/util/ListIterator;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    move v1, v4

    .line 195
    :goto_2
    move-object v2, p0

    .line 196
    check-cast v2, Lo03;

    .line 197
    .line 198
    invoke-virtual {v2}, Lo03;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_2

    .line 203
    .line 204
    invoke-virtual {v2}, Lo03;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 211
    .line 212
    .line 213
    move-result-wide v2

    .line 214
    add-int/lit8 v5, v1, 0x1

    .line 215
    .line 216
    aput-wide v2, v0, v1

    .line 217
    .line 218
    move v1, v5

    .line 219
    goto :goto_2

    .line 220
    :cond_2
    invoke-static {v0}, Ljava/util/BitSet;->valueOf([J)Ljava/util/BitSet;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Ljava/util/BitSet;->size()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_3

    .line 229
    .line 230
    sget-object p0, Lm02;->X:Lm02;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_3
    new-instance v1, Lo57;

    .line 234
    .line 235
    invoke-direct {v1, v0}, Lo57;-><init>(I)V

    .line 236
    .line 237
    .line 238
    :goto_3
    if-ltz v4, :cond_6

    .line 239
    .line 240
    invoke-virtual {p0, v4}, Ljava/util/BitSet;->get(I)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_4

    .line 245
    .line 246
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v1, v0}, Lo57;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :cond_4
    const v0, 0x7fffffff

    .line 254
    .line 255
    .line 256
    if-ne v4, v0, :cond_5

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 260
    .line 261
    invoke-virtual {p0, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    goto :goto_3

    .line 266
    :cond_6
    :goto_4
    invoke-static {v1}, Lw45;->m(Lo57;)Lo57;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    :goto_5
    return-object p0

    .line 271
    :pswitch_8
    sget-object p0, Lkw4;->a:Lkw4;

    .line 272
    .line 273
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_9
    new-instance p0, Lkt1;

    .line 279
    .line 280
    const/4 v0, 0x0

    .line 281
    invoke-direct {p0, v0}, Lkt1;-><init>(F)V

    .line 282
    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 286
    .line 287
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->r0:Lvz7;

    .line 292
    .line 293
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    check-cast p0, Lpv0;

    .line 298
    .line 299
    return-object p0

    .line 300
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 301
    .line 302
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :pswitch_c
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    :pswitch_d
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 321
    .line 322
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    return-object p0

    .line 331
    :pswitch_e
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 332
    .line 333
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->X:Lvz7;

    .line 338
    .line 339
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    check-cast p0, Lan7;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_f
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 347
    .line 348
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->G0:Lvz7;

    .line 353
    .line 354
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    check-cast p0, Lpr7;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_10
    new-instance p0, Ld27;

    .line 362
    .line 363
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 364
    .line 365
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->a()Lqo;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-direct {p0, v0}, Ld27;-><init>(Lqo;)V

    .line 374
    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_11
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 378
    .line 379
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->g()Lgk7;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    return-object p0

    .line 388
    :pswitch_12
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 389
    .line 390
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    return-object p0

    .line 399
    :pswitch_13
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;->values()[Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    new-instance v0, Lu22;

    .line 407
    .line 408
    const-string v1, "su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType"

    .line 409
    .line 410
    invoke-direct {v0, v1, p0}, Lu22;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 411
    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_14
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;->values()[Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    new-instance v0, Lu22;

    .line 422
    .line 423
    const-string v1, "su.happ.proxyutility.dto.enums.SubscriptionSortType"

    .line 424
    .line 425
    invoke-direct {v0, v1, p0}, Lu22;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 426
    .line 427
    .line 428
    return-object v0

    .line 429
    :pswitch_15
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 430
    .line 431
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->C0:Lvz7;

    .line 436
    .line 437
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    check-cast p0, La93;

    .line 442
    .line 443
    return-object p0

    .line 444
    :pswitch_16
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 445
    .line 446
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->g()Lgk7;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    return-object p0

    .line 455
    :pswitch_17
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 456
    .line 457
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->m0:Lvz7;

    .line 462
    .line 463
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    check-cast p0, Lus;

    .line 468
    .line 469
    return-object p0

    .line 470
    :pswitch_18
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 471
    .line 472
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 473
    .line 474
    .line 475
    move-result-object p0

    .line 476
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->k0:Lvz7;

    .line 477
    .line 478
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    check-cast p0, Ls24;

    .line 483
    .line 484
    return-object p0

    .line 485
    :pswitch_19
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 486
    .line 487
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->j0:Lvz7;

    .line 492
    .line 493
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    check-cast p0, Lqq0;

    .line 498
    .line 499
    return-object p0

    .line 500
    :pswitch_1a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 501
    .line 502
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    return-object p0

    .line 511
    :pswitch_1b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 512
    .line 513
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    return-object p0

    .line 522
    nop

    .line 523
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

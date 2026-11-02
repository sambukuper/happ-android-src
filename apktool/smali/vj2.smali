.class public final synthetic Lvj2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p2, p0, Lvj2;->X:B

    iput-object p1, p0, Lvj2;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq15;Lp15;)V
    .locals 0

    .line 1
    const/16 p2, 0x13

    .line 2
    .line 3
    iput-byte p2, p0, Lvj2;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lvj2;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lvj2;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    sget-object v6, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget-object p0, p0, Lvj2;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Ls16;

    .line 17
    .line 18
    check-cast p1, Ls5;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ls16;->e:Lfu6;

    .line 24
    .line 25
    new-instance v0, Loe6;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Loe6;-><init>(Ls5;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lfu6;->h0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lx90;

    .line 33
    .line 34
    invoke-interface {p0, v0}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-object v6

    .line 38
    :pswitch_0
    check-cast p0, Lqe6;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    iget-object p0, p0, Lqe6;->b:Lux0;

    .line 43
    .line 44
    invoke-virtual {p0, v6}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-object v6

    .line 48
    :pswitch_1
    check-cast p0, Lux0;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-virtual {p0, v6}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :pswitch_2
    check-cast p0, Landroid/content/pm/PackageManager;

    .line 57
    .line 58
    check-cast p1, Lqg5;

    .line 59
    .line 60
    iget-object v0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 63
    .line 64
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Landroid/content/pm/ApplicationInfo;

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {p1, p0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    iget p0, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 81
    .line 82
    and-int/2addr p0, v5

    .line 83
    if-lez p0, :cond_0

    .line 84
    .line 85
    move v10, v5

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    move v10, v3

    .line 88
    :goto_0
    new-instance v6, Lsu/happ/proxyutility/dto/AppInfo;

    .line 89
    .line 90
    iget-object v8, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    invoke-direct/range {v6 .. v11}, Lsu/happ/proxyutility/dto/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZI)V

    .line 100
    .line 101
    .line 102
    return-object v6

    .line 103
    :pswitch_3
    check-cast p0, Ly5;

    .line 104
    .line 105
    iget-object p0, p0, Ly5;->h0:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lkt;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lkt;->addLast(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v6

    .line 113
    :pswitch_4
    check-cast p0, Le37;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, p1}, Le37;->f(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ": "

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-interface {p0, p1}, Le37;->h(I)Le37;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-interface {p0}, Le37;->a()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :pswitch_5
    check-cast p0, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;

    .line 155
    .line 156
    check-cast p1, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    sget v0, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->U0:I

    .line 163
    .line 164
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;->A()Lcom/tencent/mmkv/MMKV;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-string v0, "pref_ping_mode"

    .line 169
    .line 170
    invoke-virtual {p0, p1, v0}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object v6

    .line 174
    :pswitch_6
    check-cast p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;

    .line 175
    .line 176
    check-cast p1, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    iget-object p0, p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->d1:Lvz7;

    .line 183
    .line 184
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 189
    .line 190
    const-string v0, "pref_beta_version"

    .line 191
    .line 192
    invoke-virtual {p0, v0, p1}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 193
    .line 194
    .line 195
    return-object v6

    .line 196
    :pswitch_7
    check-cast p0, Lld5;

    .line 197
    .line 198
    iget-object p0, p0, Lld5;->c:Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_1

    .line 209
    .line 210
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Lkd5;

    .line 215
    .line 216
    iget-object v1, v0, Lkd5;->a:Lbx5;

    .line 217
    .line 218
    iget-object v0, v0, Lkd5;->b:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v1, p1, v0}, Lbx5;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_1
    return-object v6

    .line 225
    :pswitch_8
    check-cast p0, Lj05;

    .line 226
    .line 227
    check-cast p1, Lix4;

    .line 228
    .line 229
    invoke-virtual {p0, p1}, Lj05;->a(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_9
    check-cast p0, Lq15;

    .line 236
    .line 237
    check-cast p1, Ljava/lang/Throwable;

    .line 238
    .line 239
    invoke-virtual {p0, v4}, Lq15;->m(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-object v6

    .line 243
    :pswitch_a
    check-cast p0, Low4;

    .line 244
    .line 245
    check-cast p1, Leq1;

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 248
    .line 249
    .line 250
    new-instance p1, Ljd;

    .line 251
    .line 252
    const/16 v0, 0x9

    .line 253
    .line 254
    invoke-direct {p1, p0, v0}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 255
    .line 256
    .line 257
    return-object p1

    .line 258
    :pswitch_b
    check-cast p0, Leq4;

    .line 259
    .line 260
    check-cast p1, Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-virtual {p0, p1}, Leq4;->b(I)Lcq4;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :pswitch_c
    check-cast p0, Llg4;

    .line 272
    .line 273
    check-cast p1, Ly64;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object p0, p0, Llg4;->e:Lj2;

    .line 279
    .line 280
    invoke-virtual {p0}, Lz0;->a()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    new-instance v1, Lf0;

    .line 285
    .line 286
    const/16 v3, 0x17

    .line 287
    .line 288
    invoke-direct {v1, p0, v3}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 289
    .line 290
    .line 291
    new-instance v3, Lyh4;

    .line 292
    .line 293
    invoke-direct {v3, p0}, Lyh4;-><init>(Ljava/util/List;)V

    .line 294
    .line 295
    .line 296
    new-instance p0, Lzy0;

    .line 297
    .line 298
    const v7, 0x2fd4df92

    .line 299
    .line 300
    .line 301
    invoke-direct {p0, v7, v5, v3}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iget-object p1, p1, Ly64;->a:Lne;

    .line 305
    .line 306
    new-instance v3, Lf63;

    .line 307
    .line 308
    invoke-direct {v3, v4, v1, p0, v2}, Lf63;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, v0, v3}, Lne;->a(ILf63;)V

    .line 312
    .line 313
    .line 314
    return-object v6

    .line 315
    :pswitch_d
    check-cast p0, Lzl0;

    .line 316
    .line 317
    check-cast p1, Ljava/lang/Void;

    .line 318
    .line 319
    iget-object p0, p0, Lzl0;->m:Lud0;

    .line 320
    .line 321
    return-object p0

    .line 322
    :pswitch_e
    check-cast p0, Lkv6;

    .line 323
    .line 324
    if-eqz p0, :cond_2

    .line 325
    .line 326
    invoke-interface {p0, p1}, Lkv6;->c(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    :cond_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_f
    check-cast p0, Lj74;

    .line 336
    .line 337
    check-cast p1, Ljava/lang/Float;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    neg-float p1, p1

    .line 344
    cmpg-float v0, p1, v1

    .line 345
    .line 346
    if-gez v0, :cond_3

    .line 347
    .line 348
    invoke-virtual {p0}, Lj74;->m()Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_c

    .line 353
    .line 354
    :cond_3
    cmpl-float v0, p1, v1

    .line 355
    .line 356
    if-lez v0, :cond_4

    .line 357
    .line 358
    invoke-virtual {p0}, Lj74;->j()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-nez v0, :cond_4

    .line 363
    .line 364
    goto/16 :goto_5

    .line 365
    .line 366
    :cond_4
    iget v0, p0, Lj74;->j0:F

    .line 367
    .line 368
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    const/high16 v2, 0x3f000000    # 0.5f

    .line 373
    .line 374
    cmpg-float v0, v0, v2

    .line 375
    .line 376
    if-gtz v0, :cond_5

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_5
    const-string v0, "entered drag with non-zero pending scroll"

    .line 380
    .line 381
    invoke-static {v0}, Lzc3;->c(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :goto_2
    iput-boolean v5, p0, Lj74;->f0:Z

    .line 385
    .line 386
    iget v0, p0, Lj74;->j0:F

    .line 387
    .line 388
    add-float/2addr v0, p1

    .line 389
    iput v0, p0, Lj74;->j0:F

    .line 390
    .line 391
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    cmpl-float v0, v0, v2

    .line 396
    .line 397
    if-lez v0, :cond_a

    .line 398
    .line 399
    iget v0, p0, Lj74;->j0:F

    .line 400
    .line 401
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    iget-object v7, p0, Lj74;->h0:Lrh5;

    .line 406
    .line 407
    invoke-virtual {v7}, Lrh5;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    check-cast v7, Le74;

    .line 412
    .line 413
    iget-boolean v8, p0, Lj74;->Y:Z

    .line 414
    .line 415
    xor-int/2addr v8, v5

    .line 416
    invoke-virtual {v7, v3, v8}, Le74;->h(IZ)Le74;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    if-eqz v7, :cond_6

    .line 421
    .line 422
    iget-object v8, p0, Lj74;->Z:Le74;

    .line 423
    .line 424
    if-eqz v8, :cond_6

    .line 425
    .line 426
    invoke-virtual {v8, v3, v5}, Le74;->h(IZ)Le74;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    if-eqz v3, :cond_7

    .line 431
    .line 432
    iput-object v3, p0, Lj74;->Z:Le74;

    .line 433
    .line 434
    :cond_6
    move-object v4, v7

    .line 435
    :cond_7
    if-eqz v4, :cond_8

    .line 436
    .line 437
    iget-boolean v3, p0, Lj74;->Y:Z

    .line 438
    .line 439
    invoke-virtual {p0, v4, v3, v5}, Lj74;->a(Le74;ZZ)V

    .line 440
    .line 441
    .line 442
    iget-object v3, p0, Lj74;->y0:Ly05;

    .line 443
    .line 444
    invoke-interface {v3, v6}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    iget v3, p0, Lj74;->j0:F

    .line 448
    .line 449
    sub-float/2addr v0, v3

    .line 450
    invoke-virtual {p0, v0, v4}, Lj74;->e(FLe74;)V

    .line 451
    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_8
    iget-object v3, p0, Lj74;->m0:Landroidx/compose/ui/node/LayoutNode;

    .line 455
    .line 456
    if-eqz v3, :cond_9

    .line 457
    .line 458
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->k()V

    .line 459
    .line 460
    .line 461
    :cond_9
    iget v3, p0, Lj74;->j0:F

    .line 462
    .line 463
    sub-float/2addr v0, v3

    .line 464
    invoke-virtual {p0}, Lj74;->d()Le74;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-virtual {p0, v0, v3}, Lj74;->e(FLe74;)V

    .line 469
    .line 470
    .line 471
    :cond_a
    :goto_3
    iget v0, p0, Lj74;->j0:F

    .line 472
    .line 473
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    cmpg-float v0, v0, v2

    .line 478
    .line 479
    if-gtz v0, :cond_b

    .line 480
    .line 481
    :goto_4
    move v1, p1

    .line 482
    goto :goto_5

    .line 483
    :cond_b
    iget v0, p0, Lj74;->j0:F

    .line 484
    .line 485
    sub-float/2addr p1, v0

    .line 486
    iput v1, p0, Lj74;->j0:F

    .line 487
    .line 488
    goto :goto_4

    .line 489
    :cond_c
    :goto_5
    neg-float p0, v1

    .line 490
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    return-object p0

    .line 495
    :pswitch_10
    check-cast p1, Ljava/lang/Integer;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    return-object p0

    .line 501
    :pswitch_11
    check-cast p0, Lk64;

    .line 502
    .line 503
    check-cast p1, Leq1;

    .line 504
    .line 505
    new-instance p1, Ljd;

    .line 506
    .line 507
    invoke-direct {p1, p0, v2}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 508
    .line 509
    .line 510
    return-object p1

    .line 511
    :pswitch_12
    check-cast p0, Le64;

    .line 512
    .line 513
    check-cast p1, Leq1;

    .line 514
    .line 515
    new-instance p1, Ljd;

    .line 516
    .line 517
    const/4 v0, 0x6

    .line 518
    invoke-direct {p1, p0, v0}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 519
    .line 520
    .line 521
    return-object p1

    .line 522
    :pswitch_13
    check-cast p0, Lak3;

    .line 523
    .line 524
    move-object v6, p1

    .line 525
    check-cast v6, Landroid/content/Context;

    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    iget-object v7, p0, Lak3;->a:Ljava/lang/String;

    .line 531
    .line 532
    sget-object p0, Lc87;->a:Ljava/util/LinkedHashSet;

    .line 533
    .line 534
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    new-instance v5, Lb87;

    .line 538
    .line 539
    new-instance v9, Lar6;

    .line 540
    .line 541
    const/4 p1, 0x3

    .line 542
    invoke-direct {v9, p0, v4, p1}, Lar6;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 543
    .line 544
    .line 545
    new-instance v10, Ldl4;

    .line 546
    .line 547
    const/4 p0, 0x2

    .line 548
    invoke-direct {v10, p1, v4, p0}, Ldl4;-><init>(ILq51;B)V

    .line 549
    .line 550
    .line 551
    sget-object v8, Ld87;->a:Ljava/util/LinkedHashSet;

    .line 552
    .line 553
    invoke-direct/range {v5 .. v10}, Lb87;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lar6;Ldl4;)V

    .line 554
    .line 555
    .line 556
    invoke-static {v5}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    return-object p0

    .line 561
    :pswitch_14
    check-cast p0, Lwd3;

    .line 562
    .line 563
    check-cast p1, Li75;

    .line 564
    .line 565
    iget-object v0, p1, Li75;->b:Ldi7;

    .line 566
    .line 567
    if-eqz v0, :cond_d

    .line 568
    .line 569
    invoke-virtual {v0}, Ldi7;->closeConnection()V

    .line 570
    .line 571
    .line 572
    iput-object v4, p1, Li75;->b:Ldi7;

    .line 573
    .line 574
    :cond_d
    iget-object v0, p0, Lwd3;->d:Lc15;

    .line 575
    .line 576
    iget-object v1, v0, Lc15;->X:[Ljava/lang/Object;

    .line 577
    .line 578
    iget v2, v0, Lc15;->Z:I

    .line 579
    .line 580
    :goto_6
    if-ge v3, v2, :cond_f

    .line 581
    .line 582
    aget-object v4, v1, v3

    .line 583
    .line 584
    check-cast v4, Lb09;

    .line 585
    .line 586
    invoke-static {v4, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    if-eqz v4, :cond_e

    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 594
    .line 595
    goto :goto_6

    .line 596
    :cond_f
    const/4 v3, -0x1

    .line 597
    :goto_7
    if-ltz v3, :cond_10

    .line 598
    .line 599
    invoke-virtual {v0, v3}, Lc15;->k(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    :cond_10
    iget p1, v0, Lc15;->Z:I

    .line 603
    .line 604
    if-nez p1, :cond_11

    .line 605
    .line 606
    iget-object p0, p0, Lwd3;->b:Lo7;

    .line 607
    .line 608
    invoke-virtual {p0}, Lo7;->invoke()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    :cond_11
    return-object v6

    .line 612
    :pswitch_15
    check-cast p0, Lwb3;

    .line 613
    .line 614
    check-cast p1, Ljc0;

    .line 615
    .line 616
    iget-object v0, p0, Lwb3;->C0:Loi;

    .line 617
    .line 618
    invoke-virtual {v0}, Loi;->d()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    check-cast v0, Lkt1;

    .line 623
    .line 624
    iget v0, v0, Lkt1;->X:F

    .line 625
    .line 626
    invoke-virtual {p1}, Ljc0;->getDensity()F

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    mul-float/2addr v2, v0

    .line 631
    invoke-static {}, Lnf;->a()Llf;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    iget-object v3, p0, Lwb3;->B0:Lx67;

    .line 636
    .line 637
    if-nez v3, :cond_12

    .line 638
    .line 639
    sget-object v3, Lq77;->a:Lox1;

    .line 640
    .line 641
    invoke-static {p0, v3}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    check-cast v3, Lp77;

    .line 646
    .line 647
    sget-object v6, Li21;->k:Ld77;

    .line 648
    .line 649
    invoke-static {v3, v6}, Lq77;->a(Lp77;Ld77;)Lx67;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    :cond_12
    iget-object v6, p1, Ljc0;->X:Lea0;

    .line 654
    .line 655
    invoke-interface {v6}, Lea0;->e()J

    .line 656
    .line 657
    .line 658
    move-result-wide v6

    .line 659
    iget-object v8, p1, Ljc0;->X:Lea0;

    .line 660
    .line 661
    invoke-interface {v8}, Lea0;->getLayoutDirection()Lz24;

    .line 662
    .line 663
    .line 664
    move-result-object v8

    .line 665
    invoke-interface {v3, v6, v7, v8, p1}, Lx67;->a(JLz24;Lfi1;)Lmb6;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    instance-of v6, v3, Lae5;

    .line 670
    .line 671
    if-eqz v6, :cond_13

    .line 672
    .line 673
    check-cast v3, Lae5;

    .line 674
    .line 675
    iget-object v3, v3, Lae5;->j0:Ls86;

    .line 676
    .line 677
    invoke-static {v0, v3}, Llf;->b(Llf;Ls86;)V

    .line 678
    .line 679
    .line 680
    goto :goto_8

    .line 681
    :cond_13
    instance-of v6, v3, Lbe5;

    .line 682
    .line 683
    if-eqz v6, :cond_14

    .line 684
    .line 685
    check-cast v3, Lbe5;

    .line 686
    .line 687
    iget-object v3, v3, Lbe5;->j0:Lem6;

    .line 688
    .line 689
    invoke-static {v0, v3}, Llf;->c(Llf;Lem6;)V

    .line 690
    .line 691
    .line 692
    goto :goto_8

    .line 693
    :cond_14
    instance-of v6, v3, Lzd5;

    .line 694
    .line 695
    if-eqz v6, :cond_18

    .line 696
    .line 697
    check-cast v3, Lzd5;

    .line 698
    .line 699
    iget-object v3, v3, Lzd5;->j0:Llf;

    .line 700
    .line 701
    invoke-static {v0, v3}, Llf;->a(Llf;Llf;)V

    .line 702
    .line 703
    .line 704
    :goto_8
    invoke-static {}, Lnf;->a()Llf;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    iget-object v4, p1, Ljc0;->X:Lea0;

    .line 709
    .line 710
    invoke-interface {v4}, Lea0;->e()J

    .line 711
    .line 712
    .line 713
    move-result-wide v6

    .line 714
    const-wide v8, 0xffffffffL

    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    and-long/2addr v6, v8

    .line 720
    long-to-int v4, v6

    .line 721
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    sub-float/2addr v4, v2

    .line 726
    iget-object v2, p1, Ljc0;->X:Lea0;

    .line 727
    .line 728
    invoke-interface {v2}, Lea0;->e()J

    .line 729
    .line 730
    .line 731
    move-result-wide v6

    .line 732
    const/16 v2, 0x20

    .line 733
    .line 734
    shr-long/2addr v6, v2

    .line 735
    long-to-int v2, v6

    .line 736
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 737
    .line 738
    .line 739
    move-result v2

    .line 740
    iget-object v6, p1, Ljc0;->X:Lea0;

    .line 741
    .line 742
    invoke-interface {v6}, Lea0;->e()J

    .line 743
    .line 744
    .line 745
    move-result-wide v6

    .line 746
    and-long/2addr v6, v8

    .line 747
    long-to-int v6, v6

    .line 748
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 749
    .line 750
    .line 751
    move-result v6

    .line 752
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 753
    .line 754
    .line 755
    move-result v7

    .line 756
    if-nez v7, :cond_15

    .line 757
    .line 758
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    if-nez v7, :cond_15

    .line 763
    .line 764
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    if-nez v7, :cond_15

    .line 769
    .line 770
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 771
    .line 772
    .line 773
    move-result v7

    .line 774
    if-eqz v7, :cond_16

    .line 775
    .line 776
    :cond_15
    const-string v7, "Invalid rectangle, make sure no value is NaN"

    .line 777
    .line 778
    invoke-static {v7}, Lnf;->b(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    :cond_16
    iget-object v7, v3, Llf;->b:Landroid/graphics/RectF;

    .line 782
    .line 783
    if-nez v7, :cond_17

    .line 784
    .line 785
    new-instance v7, Landroid/graphics/RectF;

    .line 786
    .line 787
    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 788
    .line 789
    .line 790
    iput-object v7, v3, Llf;->b:Landroid/graphics/RectF;

    .line 791
    .line 792
    :cond_17
    invoke-virtual {v7, v1, v4, v2, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 793
    .line 794
    .line 795
    iget-object v1, v3, Llf;->a:Landroid/graphics/Path;

    .line 796
    .line 797
    iget-object v2, v3, Llf;->b:Landroid/graphics/RectF;

    .line 798
    .line 799
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 803
    .line 804
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 805
    .line 806
    .line 807
    invoke-static {}, Lnf;->a()Llf;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    invoke-virtual {v1, v3, v0, v5}, Llf;->f(Llf;Llf;I)Z

    .line 812
    .line 813
    .line 814
    new-instance v0, Lzw2;

    .line 815
    .line 816
    const/4 v2, 0x7

    .line 817
    invoke-direct {v0, v1, p0, v2}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {p1, v0}, Ljc0;->a(Lgn2;)Lvk1;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    goto :goto_9

    .line 825
    :cond_18
    invoke-static {}, Lb61;->c()V

    .line 826
    .line 827
    .line 828
    :goto_9
    return-object v4

    .line 829
    :pswitch_16
    check-cast p0, Laa6;

    .line 830
    .line 831
    check-cast p1, Lc13;

    .line 832
    .line 833
    iget-boolean p1, p1, Lc13;->s0:Z

    .line 834
    .line 835
    if-eqz p1, :cond_19

    .line 836
    .line 837
    iput-boolean v3, p0, Laa6;->X:Z

    .line 838
    .line 839
    sget-object p0, Lxe8;->Z:Lxe8;

    .line 840
    .line 841
    goto :goto_a

    .line 842
    :cond_19
    sget-object p0, Lxe8;->X:Lxe8;

    .line 843
    .line 844
    :goto_a
    return-object p0

    .line 845
    :pswitch_17
    check-cast p0, Lp34;

    .line 846
    .line 847
    check-cast p1, Lsv1;

    .line 848
    .line 849
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-virtual {p0}, Lp34;->a()V

    .line 853
    .line 854
    .line 855
    return-object v6

    .line 856
    :pswitch_18
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 857
    .line 858
    check-cast p1, Ljava/lang/String;

    .line 859
    .line 860
    sget v0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->k0:I

    .line 861
    .line 862
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    iget-object p0, p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;->i0:Landroid/widget/ImageView;

    .line 866
    .line 867
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 868
    .line 869
    .line 870
    move-result p1

    .line 871
    if-lez p1, :cond_1a

    .line 872
    .line 873
    move v2, v3

    .line 874
    :cond_1a
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 875
    .line 876
    .line 877
    return-object v6

    .line 878
    :pswitch_19
    check-cast p0, Lou2;

    .line 879
    .line 880
    check-cast p1, Ldt8;

    .line 881
    .line 882
    invoke-virtual {p0, p1}, Lou2;->g(Ldt8;)V

    .line 883
    .line 884
    .line 885
    iget-object p0, p0, Lou2;->i:Lgn2;

    .line 886
    .line 887
    if-eqz p0, :cond_1b

    .line 888
    .line 889
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    :cond_1b
    return-object v6

    .line 893
    :pswitch_1a
    check-cast p0, Lau2;

    .line 894
    .line 895
    check-cast p1, Lsv1;

    .line 896
    .line 897
    invoke-interface {p1}, Lsv1;->n0()Llr;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-virtual {v0}, Llr;->k()Lsm0;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    iget-object p0, p0, Lau2;->f0:Lrn2;

    .line 906
    .line 907
    if-eqz p0, :cond_1c

    .line 908
    .line 909
    invoke-interface {p1}, Lsv1;->n0()Llr;

    .line 910
    .line 911
    .line 912
    move-result-object p1

    .line 913
    iget-object p1, p1, Llr;->Z:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast p1, Lxt2;

    .line 916
    .line 917
    invoke-interface {p0, v0, p1}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    :cond_1c
    return-object v6

    .line 921
    :pswitch_1b
    check-cast p0, Lx90;

    .line 922
    .line 923
    sget-object p1, Lfs2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 924
    .line 925
    invoke-virtual {p1, v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 926
    .line 927
    .line 928
    move-result p1

    .line 929
    if-eqz p1, :cond_1d

    .line 930
    .line 931
    invoke-interface {p0, v6}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    :cond_1d
    return-object v6

    .line 935
    :pswitch_1c
    check-cast p0, Lwj2;

    .line 936
    .line 937
    check-cast p1, Loi5;

    .line 938
    .line 939
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    const-string v0, "listRecursively"

    .line 943
    .line 944
    invoke-virtual {p0, p1, v0}, Lwj2;->onPathResult(Loi5;Ljava/lang/String;)Loi5;

    .line 945
    .line 946
    .line 947
    move-result-object p0

    .line 948
    return-object p0

    .line 949
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

.class public final synthetic Ltb2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ltb2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ltb2;->Y:Ljava/lang/Object;

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
    iget-byte v0, p0, Ltb2;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    iget-object p0, p0, Ltb2;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lko5;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Unexpected end of input: yet to parse \'"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lko5;->a:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v1, 0x27

    .line 25
    .line 26
    invoke-static {v0, p0, v1}, Loi0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p0, Lxm5;

    .line 32
    .line 33
    iget-object p0, p0, Lxm5;->X:Lqj0;

    .line 34
    .line 35
    new-instance v0, Ljf0;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lqj0;->a:Ljh0;

    .line 41
    .line 42
    iget-object p0, p0, Ljh0;->Y:Ljava/lang/String;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    check-cast p0, Lz95;

    .line 46
    .line 47
    new-instance v0, Lx95;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Lx95;-><init>(Lz95;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    check-cast p0, Lw75;

    .line 54
    .line 55
    invoke-virtual {p0}, Lw75;->b()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "Unexpected end of input: yet to parse "

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_3
    check-cast p0, Lv76;

    .line 67
    .line 68
    iget-object p0, p0, Lv76;->a:Ls76;

    .line 69
    .line 70
    iget-object p0, p0, Ls76;->e:Lvz7;

    .line 71
    .line 72
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lr76;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_4
    check-cast p0, Lz25;

    .line 80
    .line 81
    invoke-virtual {p0}, Lz25;->Y0()Lb71;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    check-cast p0, Lz47;

    .line 87
    .line 88
    iget-object p0, p0, Lz47;->g0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, Lb71;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_6
    check-cast p0, Lmx4;

    .line 94
    .line 95
    iput-boolean v1, p0, Lmx4;->f:Z

    .line 96
    .line 97
    new-instance v0, Ljava/util/HashSet;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-object v2, p0, Lmx4;->d:Lj05;

    .line 103
    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    iget-object v3, v2, Lj05;->a:[Ljava/lang/Object;

    .line 107
    .line 108
    iget v5, v2, Lj05;->b:I

    .line 109
    .line 110
    move v6, v1

    .line 111
    :goto_0
    if-ge v6, v5, :cond_2

    .line 112
    .line 113
    aget-object v7, v3, v6

    .line 114
    .line 115
    check-cast v7, Landroidx/compose/ui/node/LayoutNode;

    .line 116
    .line 117
    iget-object v8, p0, Lmx4;->e:Lj05;

    .line 118
    .line 119
    if-nez v8, :cond_0

    .line 120
    .line 121
    new-instance v8, Lj05;

    .line 122
    .line 123
    invoke-direct {v8}, Lj05;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v8, p0, Lmx4;->e:Lj05;

    .line 127
    .line 128
    :cond_0
    invoke-virtual {v8, v6}, Lj05;->g(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    check-cast v8, Lr06;

    .line 133
    .line 134
    iget-object v7, v7, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 135
    .line 136
    iget-object v7, v7, Lt6;->i0:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v7, Ljx4;

    .line 139
    .line 140
    iget-boolean v9, v7, Ljx4;->p0:Z

    .line 141
    .line 142
    if-eqz v9, :cond_1

    .line 143
    .line 144
    invoke-static {v7, v8}, Lmx4;->b(Ljx4;Lr06;)V

    .line 145
    .line 146
    .line 147
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    invoke-virtual {v2}, Lj05;->d()V

    .line 151
    .line 152
    .line 153
    iget-object v2, p0, Lmx4;->e:Lj05;

    .line 154
    .line 155
    if-eqz v2, :cond_3

    .line 156
    .line 157
    invoke-virtual {v2}, Lj05;->d()V

    .line 158
    .line 159
    .line 160
    :cond_3
    iget-object v2, p0, Lmx4;->b:Lj05;

    .line 161
    .line 162
    if-eqz v2, :cond_7

    .line 163
    .line 164
    iget-object v3, v2, Lj05;->a:[Ljava/lang/Object;

    .line 165
    .line 166
    iget v5, v2, Lj05;->b:I

    .line 167
    .line 168
    :goto_1
    if-ge v1, v5, :cond_6

    .line 169
    .line 170
    aget-object v6, v3, v1

    .line 171
    .line 172
    check-cast v6, Ld10;

    .line 173
    .line 174
    iget-object v7, p0, Lmx4;->c:Lj05;

    .line 175
    .line 176
    if-nez v7, :cond_4

    .line 177
    .line 178
    new-instance v7, Lj05;

    .line 179
    .line 180
    invoke-direct {v7}, Lj05;-><init>()V

    .line 181
    .line 182
    .line 183
    iput-object v7, p0, Lmx4;->c:Lj05;

    .line 184
    .line 185
    :cond_4
    invoke-virtual {v7, v1}, Lj05;->g(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, Lr06;

    .line 190
    .line 191
    iget-boolean v8, v6, Ljx4;->p0:Z

    .line 192
    .line 193
    if-eqz v8, :cond_5

    .line 194
    .line 195
    invoke-static {v6, v7}, Lmx4;->b(Ljx4;Lr06;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_6
    invoke-virtual {v2}, Lj05;->d()V

    .line 202
    .line 203
    .line 204
    iget-object p0, p0, Lmx4;->c:Lj05;

    .line 205
    .line 206
    if-eqz p0, :cond_7

    .line 207
    .line 208
    invoke-virtual {p0}, Lj05;->d()V

    .line 209
    .line 210
    .line 211
    :cond_7
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_8

    .line 220
    .line 221
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Ld10;

    .line 226
    .line 227
    invoke-virtual {v0}, Ld10;->a1()V

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_8
    return-object v4

    .line 232
    :pswitch_7
    check-cast p0, Low4;

    .line 233
    .line 234
    iget-object p0, p0, Low4;->g0:Ldn2;

    .line 235
    .line 236
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    return-object v4

    .line 240
    :pswitch_8
    check-cast p0, Lj94;

    .line 241
    .line 242
    iget-object p0, p0, Lj94;->a:Lvk1;

    .line 243
    .line 244
    iget-object p0, p0, Lvk1;->Y:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p0, Ldp4;

    .line 247
    .line 248
    iget-boolean v0, p0, Ldp4;->Y:Z

    .line 249
    .line 250
    if-eqz v0, :cond_9

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_9
    iget-boolean v0, p0, Ldp4;->Z:Z

    .line 254
    .line 255
    if-eqz v0, :cond_a

    .line 256
    .line 257
    const-string v0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 258
    .line 259
    invoke-static {v0}, Lxr5;->a(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_a
    invoke-virtual {p0}, Ldp4;->a()V

    .line 263
    .line 264
    .line 265
    iput-boolean v2, p0, Ldp4;->Z:Z

    .line 266
    .line 267
    :goto_3
    return-object v4

    .line 268
    :pswitch_9
    check-cast p0, Ld64;

    .line 269
    .line 270
    iget-object p0, p0, Ld64;->j:Laq1;

    .line 271
    .line 272
    if-eqz p0, :cond_b

    .line 273
    .line 274
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 275
    .line 276
    .line 277
    :cond_b
    return-object v4

    .line 278
    :pswitch_a
    check-cast p0, Lt34;

    .line 279
    .line 280
    iget-object v0, p0, Lt34;->g:Lrh5;

    .line 281
    .line 282
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_c

    .line 293
    .line 294
    iget-object p0, p0, Lt34;->c:Lr01;

    .line 295
    .line 296
    if-eqz p0, :cond_c

    .line 297
    .line 298
    invoke-virtual {p0}, Lr01;->l()V

    .line 299
    .line 300
    .line 301
    :cond_c
    return-object v4

    .line 302
    :pswitch_b
    check-cast p0, Landroidx/compose/ui/node/LayoutNode;

    .line 303
    .line 304
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 305
    .line 306
    iget-object v0, p0, Lr34;->p:Lwr4;

    .line 307
    .line 308
    iput-boolean v2, v0, Lwr4;->C0:Z

    .line 309
    .line 310
    iget-object p0, p0, Lr34;->q:Lbj4;

    .line 311
    .line 312
    if-eqz p0, :cond_d

    .line 313
    .line 314
    iput-boolean v2, p0, Lbj4;->w0:Z

    .line 315
    .line 316
    :cond_d
    return-object v4

    .line 317
    :pswitch_c
    check-cast p0, Lrw3;

    .line 318
    .line 319
    iget-object p0, p0, Lrw3;->X:Ljava/lang/Object;

    .line 320
    .line 321
    instance-of v0, p0, Lh04;

    .line 322
    .line 323
    if-eqz v0, :cond_e

    .line 324
    .line 325
    check-cast p0, Lh04;

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_e
    move-object p0, v3

    .line 329
    :goto_4
    if-eqz p0, :cond_f

    .line 330
    .line 331
    invoke-interface {p0}, Lh04;->v()Ljava/lang/reflect/GenericDeclaration;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    :cond_f
    return-object v3

    .line 336
    :pswitch_d
    check-cast p0, Lfi3;

    .line 337
    .line 338
    iget-object p0, p0, Lfi3;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 339
    .line 340
    invoke-virtual {p0}, Lql6;->j()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_10

    .line 345
    .line 346
    invoke-virtual {p0}, Lql6;->m()Z

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    if-eqz p0, :cond_11

    .line 351
    .line 352
    :cond_10
    move v1, v2

    .line 353
    :cond_11
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    return-object p0

    .line 358
    :pswitch_e
    check-cast p0, Lf63;

    .line 359
    .line 360
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p0, Landroid/view/View;

    .line 363
    .line 364
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    const-string v0, "input_method"

    .line 369
    .line 370
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 378
    .line 379
    return-object p0

    .line 380
    :pswitch_f
    check-cast p0, Ljava/lang/Integer;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_10
    check-cast p0, Lb71;

    .line 384
    .line 385
    invoke-interface {p0}, Lb71;->getCoroutineContext()Ls61;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-static {p0}, Lry7;->h(Ls61;)F

    .line 390
    .line 391
    .line 392
    move-result p0

    .line 393
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    return-object p0

    .line 398
    :pswitch_11
    check-cast p0, Lga3;

    .line 399
    .line 400
    iget-object p0, p0, Lga3;->b:Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 401
    .line 402
    invoke-virtual {p0}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->e()I

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    int-to-float p0, p0

    .line 407
    const/high16 v0, 0x42c80000    # 100.0f

    .line 408
    .line 409
    div-float/2addr p0, v0

    .line 410
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    return-object p0

    .line 415
    :pswitch_12
    check-cast p0, Lsu/happ/proxyutility/feature/inbound_auth/InboundAuthActivity;

    .line 416
    .line 417
    new-instance v0, Ll93;

    .line 418
    .line 419
    iget-object p0, p0, Lsu/happ/proxyutility/feature/inbound_auth/InboundAuthActivity;->Q0:Lz5;

    .line 420
    .line 421
    if-eqz p0, :cond_12

    .line 422
    .line 423
    invoke-direct {v0, p0}, Ll93;-><init>(Lz5;)V

    .line 424
    .line 425
    .line 426
    return-object v0

    .line 427
    :cond_12
    const-string p0, "binding"

    .line 428
    .line 429
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v3

    .line 433
    :pswitch_13
    check-cast p0, Lf63;

    .line 434
    .line 435
    const-class v0, Landroid/app/ActivityManager;

    .line 436
    .line 437
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast p0, Landroid/content/Context;

    .line 440
    .line 441
    const-wide v1, 0x3fc999999999999aL    # 0.2

    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    check-cast v4, Landroid/app/ActivityManager;

    .line 454
    .line 455
    invoke-virtual {v4}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 456
    .line 457
    .line 458
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 459
    if-eqz v4, :cond_13

    .line 460
    .line 461
    const-wide v1, 0x3fc3333333333333L    # 0.15

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    :catch_0
    :cond_13
    const-wide/16 v4, 0x0

    .line 467
    .line 468
    cmpg-double v4, v4, v1

    .line 469
    .line 470
    if-gtz v4, :cond_15

    .line 471
    .line 472
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 473
    .line 474
    cmpg-double v4, v1, v4

    .line 475
    .line 476
    if-gtz v4, :cond_15

    .line 477
    .line 478
    new-instance v3, Lb8;

    .line 479
    .line 480
    invoke-direct {v3}, Lb8;-><init>()V

    .line 481
    .line 482
    .line 483
    :try_start_1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    check-cast v0, Landroid/app/ActivityManager;

    .line 491
    .line 492
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 497
    .line 498
    const/high16 v4, 0x100000

    .line 499
    .line 500
    and-int/2addr p0, v4

    .line 501
    if-eqz p0, :cond_14

    .line 502
    .line 503
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 504
    .line 505
    .line 506
    move-result p0

    .line 507
    goto :goto_5

    .line 508
    :cond_14
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 509
    .line 510
    .line 511
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 512
    goto :goto_5

    .line 513
    :catch_1
    const/16 p0, 0x100

    .line 514
    .line 515
    :goto_5
    int-to-long v4, p0

    .line 516
    const-wide/32 v6, 0x100000

    .line 517
    .line 518
    .line 519
    mul-long/2addr v4, v6

    .line 520
    long-to-double v4, v4

    .line 521
    mul-double/2addr v1, v4

    .line 522
    double-to-long v0, v1

    .line 523
    new-instance p0, Lgj4;

    .line 524
    .line 525
    invoke-direct {p0, v0, v1, v3}, Lgj4;-><init>(JLb8;)V

    .line 526
    .line 527
    .line 528
    new-instance v0, La86;

    .line 529
    .line 530
    invoke-direct {v0, p0, v3}, La86;-><init>(Lgj4;Lb8;)V

    .line 531
    .line 532
    .line 533
    move-object v3, v0

    .line 534
    goto :goto_6

    .line 535
    :cond_15
    const-string p0, "percent must be in the range [0.0, 1.0]."

    .line 536
    .line 537
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    :goto_6
    return-object v3

    .line 541
    :pswitch_14
    check-cast p0, Lokhttp3/internal/http2/Http2Connection;

    .line 542
    .line 543
    invoke-static {p0}, Lokhttp3/internal/http2/Http2Connection;->D(Lokhttp3/internal/http2/Http2Connection;)Ldn8;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    return-object p0

    .line 548
    :pswitch_15
    check-cast p0, Lky2;

    .line 549
    .line 550
    iget-object v0, p0, Lky2;->c:Lrh5;

    .line 551
    .line 552
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    check-cast v0, Ljava/lang/Boolean;

    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    iget-object p0, p0, Lky2;->b:Lrh5;

    .line 562
    .line 563
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    check-cast p0, Lby2;

    .line 568
    .line 569
    new-instance v1, Lqg5;

    .line 570
    .line 571
    invoke-direct {v1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    return-object v1

    .line 575
    :pswitch_16
    check-cast p0, Low2;

    .line 576
    .line 577
    iget-object p0, p0, Low2;->a:Lrh5;

    .line 578
    .line 579
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 580
    .line 581
    invoke-virtual {p0, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    return-object v4

    .line 585
    :pswitch_17
    check-cast p0, Landroid/view/Window;

    .line 586
    .line 587
    const/16 v0, 0x30

    .line 588
    .line 589
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {p0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 593
    .line 594
    .line 595
    const/4 v0, 0x0

    .line 596
    invoke-virtual {p0, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 597
    .line 598
    .line 599
    return-object v4

    .line 600
    :pswitch_18
    check-cast p0, Lru2;

    .line 601
    .line 602
    invoke-virtual {p0}, Lru2;->a()Ls82;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 607
    .line 608
    .line 609
    move-result p0

    .line 610
    if-eqz p0, :cond_18

    .line 611
    .line 612
    if-eq p0, v2, :cond_17

    .line 613
    .line 614
    const/4 v1, 0x2

    .line 615
    if-eq p0, v1, :cond_18

    .line 616
    .line 617
    const/4 v1, 0x3

    .line 618
    if-eq p0, v1, :cond_18

    .line 619
    .line 620
    const/4 v1, 0x4

    .line 621
    if-ne p0, v1, :cond_16

    .line 622
    .line 623
    goto :goto_7

    .line 624
    :cond_16
    invoke-static {}, Lb61;->c()V

    .line 625
    .line 626
    .line 627
    goto :goto_8

    .line 628
    :cond_17
    move v1, v2

    .line 629
    :cond_18
    :goto_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    :goto_8
    return-object v3

    .line 634
    :pswitch_19
    check-cast p0, Lur2;

    .line 635
    .line 636
    iget-object v0, p0, Lur2;->a:Ld73;

    .line 637
    .line 638
    iget-object p0, p0, Lur2;->b:Lpd5;

    .line 639
    .line 640
    invoke-static {v0, v2}, Lw39;->b0(Ld73;Z)Ld73;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    :try_start_2
    invoke-interface {v2}, Ld73;->source()Lba0;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-interface {v0}, Lba0;->Y0()Ljava/io/InputStream;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static {v0}, Landroid/graphics/Movie;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Movie;

    .line 653
    .line 654
    .line 655
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 656
    invoke-static {v2, v3}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 657
    .line 658
    .line 659
    if-eqz v0, :cond_20

    .line 660
    .line 661
    invoke-virtual {v0}, Landroid/graphics/Movie;->width()I

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-lez v2, :cond_20

    .line 666
    .line 667
    invoke-virtual {v0}, Landroid/graphics/Movie;->height()I

    .line 668
    .line 669
    .line 670
    move-result v2

    .line 671
    if-lez v2, :cond_20

    .line 672
    .line 673
    new-instance v2, Lxy4;

    .line 674
    .line 675
    invoke-virtual {v0}, Landroid/graphics/Movie;->isOpaque()Z

    .line 676
    .line 677
    .line 678
    move-result v4

    .line 679
    if-eqz v4, :cond_19

    .line 680
    .line 681
    sget-object v4, Lb73;->h:Lf4;

    .line 682
    .line 683
    invoke-static {p0, v4}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    check-cast v4, Ljava/lang/Boolean;

    .line 688
    .line 689
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    if-eqz v4, :cond_19

    .line 694
    .line 695
    sget-object v4, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 696
    .line 697
    goto :goto_9

    .line 698
    :cond_19
    invoke-static {p0}, Lb73;->a(Lpd5;)Landroid/graphics/Bitmap$Config;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    invoke-static {v4}, Lue3;->z(Landroid/graphics/Bitmap$Config;)Z

    .line 703
    .line 704
    .line 705
    move-result v4

    .line 706
    if-eqz v4, :cond_1a

    .line 707
    .line 708
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 709
    .line 710
    goto :goto_9

    .line 711
    :cond_1a
    sget-object v4, Lb73;->b:Lf4;

    .line 712
    .line 713
    invoke-static {p0, v4}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    check-cast v4, Landroid/graphics/Bitmap$Config;

    .line 718
    .line 719
    :goto_9
    iget-object v5, p0, Lpd5;->c:Lpw6;

    .line 720
    .line 721
    invoke-direct {v2, v0, v4, v5}, Lxy4;-><init>(Landroid/graphics/Movie;Landroid/graphics/Bitmap$Config;Lpw6;)V

    .line 722
    .line 723
    .line 724
    sget-object v0, Lw63;->a:Lf4;

    .line 725
    .line 726
    invoke-static {p0, v0}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    check-cast v4, Ljava/lang/Number;

    .line 731
    .line 732
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    const/4 v5, -0x2

    .line 737
    if-eq v4, v5, :cond_1c

    .line 738
    .line 739
    invoke-static {p0, v0}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    check-cast v0, Ljava/lang/Number;

    .line 744
    .line 745
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    const/4 v4, -0x1

    .line 750
    if-lt v0, v4, :cond_1b

    .line 751
    .line 752
    iput v0, v2, Lxy4;->s0:I

    .line 753
    .line 754
    goto :goto_a

    .line 755
    :cond_1b
    const-string p0, "Invalid repeatCount: "

    .line 756
    .line 757
    invoke-static {v0, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    goto :goto_b

    .line 765
    :cond_1c
    :goto_a
    sget-object v0, Lw63;->c:Lf4;

    .line 766
    .line 767
    invoke-static {p0, v0}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    check-cast v0, Ldn2;

    .line 772
    .line 773
    sget-object v4, Lw63;->d:Lf4;

    .line 774
    .line 775
    invoke-static {p0, v4}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v4

    .line 779
    check-cast v4, Ldn2;

    .line 780
    .line 781
    if-nez v0, :cond_1d

    .line 782
    .line 783
    if-eqz v4, :cond_1e

    .line 784
    .line 785
    :cond_1d
    new-instance v5, Lvs8;

    .line 786
    .line 787
    invoke-direct {v5, v0, v4}, Lvs8;-><init>(Ldn2;Ldn2;)V

    .line 788
    .line 789
    .line 790
    iget-object v0, v2, Lxy4;->g0:Ljava/util/ArrayList;

    .line 791
    .line 792
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    :cond_1e
    sget-object v0, Lw63;->b:Lf4;

    .line 796
    .line 797
    invoke-static {p0, v0}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object p0

    .line 801
    if-nez p0, :cond_1f

    .line 802
    .line 803
    iput-object v3, v2, Lxy4;->t0:Landroid/graphics/Picture;

    .line 804
    .line 805
    sget-object p0, Lco5;->X:Lco5;

    .line 806
    .line 807
    iput-object p0, v2, Lxy4;->u0:Lco5;

    .line 808
    .line 809
    iput-boolean v1, v2, Lxy4;->v0:Z

    .line 810
    .line 811
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 812
    .line 813
    .line 814
    new-instance v3, Lnd1;

    .line 815
    .line 816
    invoke-static {v2}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    invoke-direct {v3, p0, v1}, Lnd1;-><init>(Ld53;Z)V

    .line 821
    .line 822
    .line 823
    goto :goto_b

    .line 824
    :cond_1f
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 825
    .line 826
    .line 827
    goto :goto_b

    .line 828
    :cond_20
    const-string p0, "Failed to decode GIF."

    .line 829
    .line 830
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    :goto_b
    return-object v3

    .line 834
    :catchall_0
    move-exception v0

    .line 835
    move-object p0, v0

    .line 836
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 837
    :catchall_1
    move-exception v0

    .line 838
    invoke-static {v2, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 839
    .line 840
    .line 841
    throw v0

    .line 842
    :pswitch_1a
    check-cast p0, Lxm2;

    .line 843
    .line 844
    iget-object v1, p0, Lxm2;->X:Landroid/content/Context;

    .line 845
    .line 846
    iget-object v0, p0, Lxm2;->Y:Ljava/lang/String;

    .line 847
    .line 848
    const/16 v2, 0xc

    .line 849
    .line 850
    if-eqz v0, :cond_21

    .line 851
    .line 852
    iget-boolean v3, p0, Lxm2;->f0:Z

    .line 853
    .line 854
    if-eqz v3, :cond_21

    .line 855
    .line 856
    new-instance v3, Ljava/io/File;

    .line 857
    .line 858
    invoke-virtual {v1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    invoke-direct {v3, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    new-instance v0, Lwm2;

    .line 869
    .line 870
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    move v4, v2

    .line 875
    move-object v2, v3

    .line 876
    new-instance v3, Lvk1;

    .line 877
    .line 878
    invoke-direct {v3, v4}, Lvk1;-><init>(B)V

    .line 879
    .line 880
    .line 881
    iget-object v4, p0, Lxm2;->Z:Lb8;

    .line 882
    .line 883
    iget-boolean v5, p0, Lxm2;->g0:Z

    .line 884
    .line 885
    invoke-direct/range {v0 .. v5}, Lwm2;-><init>(Landroid/content/Context;Ljava/lang/String;Lvk1;Lb8;Z)V

    .line 886
    .line 887
    .line 888
    goto :goto_c

    .line 889
    :cond_21
    move v4, v2

    .line 890
    new-instance v0, Lwm2;

    .line 891
    .line 892
    iget-object v2, p0, Lxm2;->Y:Ljava/lang/String;

    .line 893
    .line 894
    new-instance v3, Lvk1;

    .line 895
    .line 896
    invoke-direct {v3, v4}, Lvk1;-><init>(B)V

    .line 897
    .line 898
    .line 899
    iget-object v4, p0, Lxm2;->Z:Lb8;

    .line 900
    .line 901
    iget-boolean v5, p0, Lxm2;->g0:Z

    .line 902
    .line 903
    invoke-direct/range {v0 .. v5}, Lwm2;-><init>(Landroid/content/Context;Ljava/lang/String;Lvk1;Lb8;Z)V

    .line 904
    .line 905
    .line 906
    :goto_c
    iget-boolean p0, p0, Lxm2;->i0:Z

    .line 907
    .line 908
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 909
    .line 910
    .line 911
    return-object v0

    .line 912
    :pswitch_1b
    check-cast p0, Lai2;

    .line 913
    .line 914
    invoke-virtual {p0}, Lai2;->a1()Ljh2;

    .line 915
    .line 916
    .line 917
    return-object v4

    .line 918
    :pswitch_1c
    check-cast p0, Lsu/happ/proxyutility/firebase/FirebaseMessagingService;

    .line 919
    .line 920
    sget v0, Lsu/happ/proxyutility/firebase/FirebaseMessagingService;->n0:I

    .line 921
    .line 922
    new-instance v0, Ltc2;

    .line 923
    .line 924
    invoke-direct {v0, p0}, Ltc2;-><init>(Landroid/content/Context;)V

    .line 925
    .line 926
    .line 927
    return-object v0

    .line 928
    nop

    .line 929
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

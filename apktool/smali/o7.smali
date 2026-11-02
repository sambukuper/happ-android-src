.class public final synthetic Lo7;
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

    .line 10
    iput-byte p2, p0, Lo7;->X:B

    iput-object p1, p0, Lo7;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljj0;Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput-byte p2, p0, Lo7;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lo7;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lo7;->X:B

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/io/File;

    .line 16
    .line 17
    sget-object v0, Lm92;->d:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    sget-object v1, Lm92;->c:Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    sget-object p0, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0

    .line 35
    throw p0

    .line 36
    :pswitch_0
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 39
    .line 40
    new-instance v0, Ltj;

    .line 41
    .line 42
    invoke-direct {v0, p0, v4}, Ltj;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lin1;

    .line 49
    .line 50
    iget-object v0, p0, Lin1;->u1:Ljl1;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    new-instance v1, Lhn1;

    .line 55
    .line 56
    invoke-direct {v1, p0, v0}, Lhn1;-><init>(Lin1;Ljl1;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_0
    const-string p0, "binding"

    .line 61
    .line 62
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v5

    .line 66
    :pswitch_2
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lh30;

    .line 69
    .line 70
    invoke-virtual {p0}, Lh30;->close()V

    .line 71
    .line 72
    .line 73
    sget-object p0, Ldn8;->a:Ldn8;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_3
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Lf81;

    .line 79
    .line 80
    invoke-virtual {p0}, Lf81;->a()Landroid/view/inputmethod/CursorAnchorInfo;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_4
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, Ldq;

    .line 88
    .line 89
    const-string v0, ":memory:"

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Ldq;->o(Ljava/lang/String;)Lqr6;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_5
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lokhttp3/Handshake;

    .line 99
    .line 100
    invoke-static {p0}, Lokhttp3/internal/connection/ConnectPlan;->b(Lokhttp3/Handshake;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_6
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lxz0;

    .line 108
    .line 109
    const-wide/16 v3, 0x0

    .line 110
    .line 111
    invoke-static {v3, v4, v3, v4}, Lpf3;->a(JJ)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object p0, p0, Lxz0;->a:Landroid/view/View;

    .line 116
    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    move-object v0, p0

    .line 124
    :goto_0
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 125
    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    instance-of v3, v0, Landroid/app/Activity;

    .line 129
    .line 130
    if-eqz v3, :cond_1

    .line 131
    .line 132
    :goto_1
    move-object v5, v0

    .line 133
    goto :goto_2

    .line 134
    :cond_1
    instance-of v3, v0, Landroid/inputmethodservice/InputMethodService;

    .line 135
    .line 136
    if-eqz v3, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    instance-of v3, v0, Landroid/app/Application;

    .line 140
    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    check-cast v0, Landroid/content/ContextWrapper;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-nez v3, :cond_4

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto :goto_0

    .line 158
    :cond_5
    :goto_2
    const-wide v3, 0xffffffffL

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    const/16 v0, 0x20

    .line 164
    .line 165
    if-eqz v5, :cond_8

    .line 166
    .line 167
    sget-object p0, Lj29;->a:Li29;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object p0, Li29;->a:Li29;

    .line 173
    .line 174
    sget-object p0, Li29;->b:Lk29;

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 180
    .line 181
    if-lt v6, v2, :cond_6

    .line 182
    .line 183
    sget-object v1, Lhi1;->Y:Lhi1;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_6
    if-lt v6, v1, :cond_7

    .line 187
    .line 188
    sget-object v1, Lc80;->Y:Lc80;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_7
    sget-object v1, Lqe4;->D0:Lqe4;

    .line 192
    .line 193
    :goto_3
    iget-object p0, p0, Lk29;->b:Lgi1;

    .line 194
    .line 195
    invoke-interface {v1, v5, p0}, Ll29;->y(Landroid/content/Context;Lgi1;)Lh29;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Lh29;->a()Landroid/graphics/Rect;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-virtual {p0}, Lh29;->a()Landroid/graphics/Rect;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    int-to-long v1, v1

    .line 216
    shl-long v0, v1, v0

    .line 217
    .line 218
    int-to-long v6, p0

    .line 219
    and-long v2, v6, v3

    .line 220
    .line 221
    or-long/2addr v0, v2

    .line 222
    invoke-static {v5}, Lgv3;->d(Landroid/content/Context;)Lji1;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {v0, v1}, Lu15;->R(J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    invoke-interface {p0, v2, v3}, Lfi1;->r(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    new-instance p0, Lxi1;

    .line 235
    .line 236
    invoke-direct {p0, v0, v1, v2, v3}, Lxi1;-><init>(JJ)V

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_8
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {p0}, Lgv3;->d(Landroid/content/Context;)Lji1;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    iget v2, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 253
    .line 254
    int-to-float v2, v2

    .line 255
    iget v1, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 256
    .line 257
    int-to-float v1, v1

    .line 258
    invoke-static {v2, v1}, Lhi5;->G(FF)J

    .line 259
    .line 260
    .line 261
    move-result-wide v1

    .line 262
    invoke-interface {p0, v1, v2}, Lfi1;->D0(J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v5

    .line 266
    shr-long v7, v5, v0

    .line 267
    .line 268
    long-to-int p0, v7

    .line 269
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    float-to-int p0, p0

    .line 274
    and-long/2addr v5, v3

    .line 275
    long-to-int v5, v5

    .line 276
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    float-to-int v5, v5

    .line 281
    int-to-long v6, p0

    .line 282
    shl-long/2addr v6, v0

    .line 283
    int-to-long v8, v5

    .line 284
    and-long/2addr v3, v8

    .line 285
    or-long/2addr v3, v6

    .line 286
    new-instance p0, Lxi1;

    .line 287
    .line 288
    invoke-direct {p0, v3, v4, v1, v2}, Lxi1;-><init>(JJ)V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {p0}, Lgv3;->d(Landroid/content/Context;)Lji1;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-static {v3, v4}, Lu15;->R(J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v0

    .line 304
    invoke-interface {p0, v0, v1}, Lfi1;->r(J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v0

    .line 308
    new-instance p0, Lxi1;

    .line 309
    .line 310
    invoke-direct {p0, v3, v4, v0, v1}, Lxi1;-><init>(JJ)V

    .line 311
    .line 312
    .line 313
    :goto_4
    return-object p0

    .line 314
    :pswitch_7
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p0, Lqg5;

    .line 317
    .line 318
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    return-object p0

    .line 323
    :pswitch_8
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p0, Lcx0;

    .line 326
    .line 327
    iget-object p0, p0, Lcx0;->M0:Ldn2;

    .line 328
    .line 329
    if-eqz p0, :cond_a

    .line 330
    .line 331
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    :cond_a
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 335
    .line 336
    return-object p0

    .line 337
    :pswitch_9
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p0, Ljava/lang/Iterable;

    .line 340
    .line 341
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_a
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast p0, Lin0;

    .line 349
    .line 350
    iget-object p0, p0, Lin0;->a:Lv06;

    .line 351
    .line 352
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    check-cast p0, Lhn0;

    .line 357
    .line 358
    return-object p0

    .line 359
    :pswitch_b
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p0, Lhn0;

    .line 362
    .line 363
    iget-object p0, p0, Lhn0;->a:Lv06;

    .line 364
    .line 365
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    check-cast p0, Lbr8;

    .line 370
    .line 371
    return-object p0

    .line 372
    :pswitch_c
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast p0, Lik0;

    .line 375
    .line 376
    const-string v0, "Motorola"

    .line 377
    .line 378
    const-string v1, "Huawei"

    .line 379
    .line 380
    const-string v2, "Samsung"

    .line 381
    .line 382
    sget-object v6, Lh26;->c:Lh26;

    .line 383
    .line 384
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    :try_start_1
    iget-object v6, v6, Lh26;->a:Lz05;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 388
    .line 389
    :try_start_2
    iget-object v6, v6, Lz05;->f0:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v6, Ljava/util/concurrent/atomic/AtomicReference;

    .line 392
    .line 393
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    instance-of v7, v6, Lhz;

    .line 398
    .line 399
    if-eqz v7, :cond_b

    .line 400
    .line 401
    new-instance v6, Lu73;

    .line 402
    .line 403
    invoke-direct {v6, v5, v4}, Lu73;-><init>(Ljava/lang/Object;B)V

    .line 404
    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_b
    invoke-static {v6}, Lvr3;->H(Ljava/lang/Object;)Lu73;

    .line 408
    .line 409
    .line 410
    move-result-object v6
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 411
    :goto_5
    :try_start_3
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    check-cast v5, Lg26;
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    .line 416
    .line 417
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    new-instance v6, Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 423
    .line 424
    .line 425
    iget-object v7, p0, Lik0;->a:Ljj0;

    .line 426
    .line 427
    if-nez v7, :cond_c

    .line 428
    .line 429
    invoke-static {}, Lhi5;->j0()Z

    .line 430
    .line 431
    .line 432
    new-instance p0, Li26;

    .line 433
    .line 434
    invoke-direct {p0, v6}, Li26;-><init>(Ljava/util/ArrayList;)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_28

    .line 438
    .line 439
    :cond_c
    const-class v8, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;

    .line 440
    .line 441
    sget-object v9, Ljj0;->h:Lij0;

    .line 442
    .line 443
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-static {v7}, Lij0;->c(Ljj0;)Z

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    invoke-virtual {v5, v8, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    if-eqz v8, :cond_d

    .line 455
    .line 456
    new-instance v8, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;

    .line 457
    .line 458
    invoke-direct {v8, v7}, Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;-><init>(Ljj0;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    :cond_d
    const-class v8, Landroidx/camera/camera2/compat/quirk/AfRegionFlipHorizontallyQuirk;

    .line 465
    .line 466
    sget-object v9, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    if-nez v9, :cond_e

    .line 476
    .line 477
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 483
    .line 484
    .line 485
    move-result v9

    .line 486
    if-eqz v9, :cond_10

    .line 487
    .line 488
    :cond_e
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 489
    .line 490
    const/16 v10, 0x21

    .line 491
    .line 492
    if-ge v9, v10, :cond_10

    .line 493
    .line 494
    sget-object v9, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 495
    .line 496
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    move-object v10, v7

    .line 500
    check-cast v10, Llf0;

    .line 501
    .line 502
    invoke-virtual {v10, v9}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    check-cast v9, Ljava/lang/Integer;

    .line 507
    .line 508
    if-nez v9, :cond_f

    .line 509
    .line 510
    goto :goto_6

    .line 511
    :cond_f
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 512
    .line 513
    .line 514
    move-result v9

    .line 515
    if-nez v9, :cond_10

    .line 516
    .line 517
    move v9, v4

    .line 518
    goto :goto_7

    .line 519
    :cond_10
    :goto_6
    move v9, v3

    .line 520
    :goto_7
    invoke-virtual {v5, v8, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    if-eqz v8, :cond_11

    .line 525
    .line 526
    new-instance v8, Landroidx/camera/camera2/compat/quirk/AfRegionFlipHorizontallyQuirk;

    .line 527
    .line 528
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    :cond_11
    const-class v8, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 535
    .line 536
    invoke-static {v7}, Lij0;->c(Ljj0;)Z

    .line 537
    .line 538
    .line 539
    invoke-virtual {v5, v8, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    if-eqz v8, :cond_12

    .line 544
    .line 545
    new-instance v8, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 546
    .line 547
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    :cond_12
    const-class v8, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;

    .line 554
    .line 555
    invoke-static {v7}, Lij0;->c(Ljj0;)Z

    .line 556
    .line 557
    .line 558
    move-result v9

    .line 559
    invoke-virtual {v5, v8, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 560
    .line 561
    .line 562
    move-result v8

    .line 563
    if-eqz v8, :cond_13

    .line 564
    .line 565
    new-instance v8, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;

    .line 566
    .line 567
    iget-object p0, p0, Lik0;->b:Lvk7;

    .line 568
    .line 569
    invoke-direct {v8, p0}, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;-><init>(Lvk7;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    :cond_13
    const-class p0, Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;

    .line 576
    .line 577
    sget-object v8, Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;->a:Ljava/util/List;

    .line 578
    .line 579
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 580
    .line 581
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 585
    .line 586
    invoke-virtual {v9, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v9

    .line 590
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v8

    .line 597
    if-eqz v8, :cond_15

    .line 598
    .line 599
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 600
    .line 601
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-object v9, v7

    .line 605
    check-cast v9, Llf0;

    .line 606
    .line 607
    invoke-virtual {v9, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    check-cast v8, Ljava/lang/Integer;

    .line 612
    .line 613
    if-nez v8, :cond_14

    .line 614
    .line 615
    goto :goto_8

    .line 616
    :cond_14
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    if-ne v8, v4, :cond_15

    .line 621
    .line 622
    move v8, v4

    .line 623
    goto :goto_9

    .line 624
    :cond_15
    :goto_8
    move v8, v3

    .line 625
    :goto_9
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 626
    .line 627
    .line 628
    move-result p0

    .line 629
    if-eqz p0, :cond_16

    .line 630
    .line 631
    new-instance p0, Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;

    .line 632
    .line 633
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    :cond_16
    const-class p0, Landroidx/camera/camera2/compat/quirk/CaptureSessionStuckQuirk;

    .line 640
    .line 641
    invoke-virtual {v5, p0, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 642
    .line 643
    .line 644
    move-result p0

    .line 645
    if-eqz p0, :cond_17

    .line 646
    .line 647
    new-instance p0, Landroidx/camera/camera2/compat/quirk/CaptureSessionStuckQuirk;

    .line 648
    .line 649
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    :cond_17
    const-class p0, Landroidx/camera/camera2/compat/quirk/CloseCaptureSessionOnVideoQuirk;

    .line 656
    .line 657
    invoke-virtual {v5, p0, v4}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 658
    .line 659
    .line 660
    move-result p0

    .line 661
    if-eqz p0, :cond_18

    .line 662
    .line 663
    new-instance p0, Landroidx/camera/camera2/compat/quirk/CloseCaptureSessionOnVideoQuirk;

    .line 664
    .line 665
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    :cond_18
    const-class p0, Landroidx/camera/camera2/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    .line 672
    .line 673
    invoke-static {v7}, Lij0;->c(Ljj0;)Z

    .line 674
    .line 675
    .line 676
    move-result v8

    .line 677
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 678
    .line 679
    .line 680
    move-result p0

    .line 681
    if-eqz p0, :cond_19

    .line 682
    .line 683
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    .line 684
    .line 685
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    :cond_19
    const-class p0, Landroidx/camera/camera2/compat/quirk/FinalizeSessionOnCloseQuirk;

    .line 692
    .line 693
    invoke-virtual {v5, p0, v4}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 694
    .line 695
    .line 696
    move-result p0

    .line 697
    if-eqz p0, :cond_1a

    .line 698
    .line 699
    new-instance p0, Landroidx/camera/camera2/compat/quirk/FinalizeSessionOnCloseQuirk;

    .line 700
    .line 701
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    :cond_1a
    const-class p0, Landroidx/camera/camera2/compat/quirk/FlashTooSlowQuirk;

    .line 708
    .line 709
    sget-object v8, Landroidx/camera/camera2/compat/quirk/FlashTooSlowQuirk;->a:Ljava/util/List;

    .line 710
    .line 711
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 712
    .line 713
    .line 714
    move-result-object v8

    .line 715
    :cond_1b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 716
    .line 717
    .line 718
    move-result v9

    .line 719
    if-eqz v9, :cond_1d

    .line 720
    .line 721
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v9

    .line 725
    check-cast v9, Ljava/lang/String;

    .line 726
    .line 727
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 728
    .line 729
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 733
    .line 734
    invoke-virtual {v10, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v10

    .line 738
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    invoke-static {v10, v3, v9}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 742
    .line 743
    .line 744
    move-result v9

    .line 745
    if-eqz v9, :cond_1b

    .line 746
    .line 747
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 748
    .line 749
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    move-object v9, v7

    .line 753
    check-cast v9, Llf0;

    .line 754
    .line 755
    invoke-virtual {v9, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v8

    .line 759
    check-cast v8, Ljava/lang/Integer;

    .line 760
    .line 761
    if-nez v8, :cond_1c

    .line 762
    .line 763
    goto :goto_a

    .line 764
    :cond_1c
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 765
    .line 766
    .line 767
    move-result v8

    .line 768
    if-ne v8, v4, :cond_1d

    .line 769
    .line 770
    move v8, v4

    .line 771
    goto :goto_b

    .line 772
    :cond_1d
    :goto_a
    move v8, v3

    .line 773
    :goto_b
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 774
    .line 775
    .line 776
    move-result p0

    .line 777
    if-eqz p0, :cond_1e

    .line 778
    .line 779
    new-instance p0, Landroidx/camera/camera2/compat/quirk/FlashTooSlowQuirk;

    .line 780
    .line 781
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    :cond_1e
    const-class p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;

    .line 788
    .line 789
    sget-object v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;->a:Ljava/util/List;

    .line 790
    .line 791
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 792
    .line 793
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 797
    .line 798
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v11

    .line 802
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-interface {v8, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v8

    .line 809
    if-eqz v8, :cond_20

    .line 810
    .line 811
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 812
    .line 813
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    move-object v11, v7

    .line 817
    check-cast v11, Llf0;

    .line 818
    .line 819
    invoke-virtual {v11, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v8

    .line 823
    check-cast v8, Ljava/lang/Integer;

    .line 824
    .line 825
    if-nez v8, :cond_1f

    .line 826
    .line 827
    goto :goto_c

    .line 828
    :cond_1f
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 829
    .line 830
    .line 831
    move-result v8

    .line 832
    if-nez v8, :cond_20

    .line 833
    .line 834
    move v8, v4

    .line 835
    goto :goto_d

    .line 836
    :cond_20
    :goto_c
    move v8, v3

    .line 837
    :goto_d
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 838
    .line 839
    .line 840
    move-result p0

    .line 841
    if-eqz p0, :cond_21

    .line 842
    .line 843
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;

    .line 844
    .line 845
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    :cond_21
    const-class p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;

    .line 852
    .line 853
    sget-object v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;->b:Ljava/util/List;

    .line 854
    .line 855
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v11

    .line 859
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    invoke-interface {v8, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v8

    .line 866
    if-eqz v8, :cond_23

    .line 867
    .line 868
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 869
    .line 870
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move-object v11, v7

    .line 874
    check-cast v11, Llf0;

    .line 875
    .line 876
    invoke-virtual {v11, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v8

    .line 880
    check-cast v8, Ljava/lang/Integer;

    .line 881
    .line 882
    if-nez v8, :cond_22

    .line 883
    .line 884
    goto :goto_e

    .line 885
    :cond_22
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 886
    .line 887
    .line 888
    move-result v8

    .line 889
    if-nez v8, :cond_23

    .line 890
    .line 891
    move v8, v4

    .line 892
    goto :goto_f

    .line 893
    :cond_23
    :goto_e
    move v8, v3

    .line 894
    :goto_f
    sget-object v11, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;->a:Ljava/util/List;

    .line 895
    .line 896
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v12

    .line 900
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    invoke-interface {v11, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v11

    .line 907
    if-nez v8, :cond_25

    .line 908
    .line 909
    if-eqz v11, :cond_24

    .line 910
    .line 911
    goto :goto_10

    .line 912
    :cond_24
    move v8, v3

    .line 913
    goto :goto_11

    .line 914
    :cond_25
    :goto_10
    move v8, v4

    .line 915
    :goto_11
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 916
    .line 917
    .line 918
    move-result p0

    .line 919
    if-eqz p0, :cond_26

    .line 920
    .line 921
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;

    .line 922
    .line 923
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    :cond_26
    const-class p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWashedOutImageQuirk;

    .line 930
    .line 931
    sget-object v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureWashedOutImageQuirk;->a:Ljava/util/List;

    .line 932
    .line 933
    invoke-virtual {v9, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v11

    .line 937
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    .line 939
    .line 940
    invoke-interface {v8, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    move-result v8

    .line 944
    if-eqz v8, :cond_28

    .line 945
    .line 946
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 947
    .line 948
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    move-object v11, v7

    .line 952
    check-cast v11, Llf0;

    .line 953
    .line 954
    invoke-virtual {v11, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v8

    .line 958
    check-cast v8, Ljava/lang/Integer;

    .line 959
    .line 960
    if-nez v8, :cond_27

    .line 961
    .line 962
    goto :goto_12

    .line 963
    :cond_27
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 964
    .line 965
    .line 966
    move-result v8

    .line 967
    if-ne v8, v4, :cond_28

    .line 968
    .line 969
    move v8, v4

    .line 970
    goto :goto_13

    .line 971
    :cond_28
    :goto_12
    move v8, v3

    .line 972
    :goto_13
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 973
    .line 974
    .line 975
    move-result p0

    .line 976
    if-eqz p0, :cond_29

    .line 977
    .line 978
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWashedOutImageQuirk;

    .line 979
    .line 980
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    :cond_29
    const-class p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWithFlashUnderexposureQuirk;

    .line 987
    .line 988
    sget-object v8, Landroidx/camera/camera2/compat/quirk/ImageCaptureWithFlashUnderexposureQuirk;->a:Ljava/util/List;

    .line 989
    .line 990
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v11

    .line 994
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    invoke-interface {v8, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v8

    .line 1001
    if-eqz v8, :cond_2b

    .line 1002
    .line 1003
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1004
    .line 1005
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    move-object v11, v7

    .line 1009
    check-cast v11, Llf0;

    .line 1010
    .line 1011
    invoke-virtual {v11, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v8

    .line 1015
    check-cast v8, Ljava/lang/Integer;

    .line 1016
    .line 1017
    if-nez v8, :cond_2a

    .line 1018
    .line 1019
    goto :goto_14

    .line 1020
    :cond_2a
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1021
    .line 1022
    .line 1023
    move-result v8

    .line 1024
    if-ne v8, v4, :cond_2b

    .line 1025
    .line 1026
    move v8, v4

    .line 1027
    goto :goto_15

    .line 1028
    :cond_2b
    :goto_14
    move v8, v3

    .line 1029
    :goto_15
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1030
    .line 1031
    .line 1032
    move-result p0

    .line 1033
    if-eqz p0, :cond_2c

    .line 1034
    .line 1035
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureWithFlashUnderexposureQuirk;

    .line 1036
    .line 1037
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    :cond_2c
    const-class p0, Landroidx/camera/camera2/compat/quirk/JpegHalCorruptImageQuirk;

    .line 1044
    .line 1045
    sget-object v8, Landroidx/camera/camera2/compat/quirk/JpegHalCorruptImageQuirk;->a:Ljava/util/List;

    .line 1046
    .line 1047
    sget-object v11, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v11, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v11

    .line 1056
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    invoke-interface {v8, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v8

    .line 1063
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1064
    .line 1065
    .line 1066
    move-result p0

    .line 1067
    if-eqz p0, :cond_2d

    .line 1068
    .line 1069
    new-instance p0, Landroidx/camera/camera2/compat/quirk/JpegHalCorruptImageQuirk;

    .line 1070
    .line 1071
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    :cond_2d
    const-class p0, Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;

    .line 1078
    .line 1079
    sget-object v8, Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;->a:Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;

    .line 1080
    .line 1081
    sget-object v11, Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;->b:Ljava/util/Set;

    .line 1082
    .line 1083
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v9

    .line 1087
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    invoke-interface {v11, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v9

    .line 1094
    if-eqz v9, :cond_2f

    .line 1095
    .line 1096
    sget-object v9, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1097
    .line 1098
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1099
    .line 1100
    .line 1101
    move-object v10, v7

    .line 1102
    check-cast v10, Llf0;

    .line 1103
    .line 1104
    invoke-virtual {v10, v9}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v9

    .line 1108
    check-cast v9, Ljava/lang/Integer;

    .line 1109
    .line 1110
    if-nez v9, :cond_2e

    .line 1111
    .line 1112
    goto :goto_16

    .line 1113
    :cond_2e
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1114
    .line 1115
    .line 1116
    move-result v9

    .line 1117
    if-nez v9, :cond_2f

    .line 1118
    .line 1119
    move v9, v4

    .line 1120
    goto :goto_17

    .line 1121
    :cond_2f
    :goto_16
    move v9, v3

    .line 1122
    :goto_17
    invoke-virtual {v5, p0, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1123
    .line 1124
    .line 1125
    move-result p0

    .line 1126
    if-eqz p0, :cond_30

    .line 1127
    .line 1128
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    :cond_30
    const-class p0, Landroidx/camera/camera2/compat/quirk/PreviewOrientationIncorrectQuirk;

    .line 1132
    .line 1133
    sget-object v8, Ljj0;->h:Lij0;

    .line 1134
    .line 1135
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-static {v7}, Lij0;->c(Ljj0;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v8

    .line 1142
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1143
    .line 1144
    .line 1145
    move-result p0

    .line 1146
    if-eqz p0, :cond_31

    .line 1147
    .line 1148
    new-instance p0, Landroidx/camera/camera2/compat/quirk/PreviewOrientationIncorrectQuirk;

    .line 1149
    .line 1150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    :cond_31
    const-class p0, Landroidx/camera/camera2/compat/quirk/TextureViewIsClosedQuirk;

    .line 1157
    .line 1158
    invoke-virtual {v5, p0, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1159
    .line 1160
    .line 1161
    move-result p0

    .line 1162
    if-eqz p0, :cond_32

    .line 1163
    .line 1164
    new-instance p0, Landroidx/camera/camera2/compat/quirk/TextureViewIsClosedQuirk;

    .line 1165
    .line 1166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    :cond_32
    const-class p0, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;

    .line 1173
    .line 1174
    sget-object v8, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;->a:Ljava/util/ArrayList;

    .line 1175
    .line 1176
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    :cond_33
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v9

    .line 1184
    if-eqz v9, :cond_35

    .line 1185
    .line 1186
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v9

    .line 1190
    check-cast v9, Ljava/lang/String;

    .line 1191
    .line 1192
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1193
    .line 1194
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1198
    .line 1199
    invoke-virtual {v10, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v10

    .line 1203
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v9

    .line 1210
    if-eqz v9, :cond_33

    .line 1211
    .line 1212
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1213
    .line 1214
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    move-object v9, v7

    .line 1218
    check-cast v9, Llf0;

    .line 1219
    .line 1220
    invoke-virtual {v9, v8}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v8

    .line 1224
    check-cast v8, Ljava/lang/Integer;

    .line 1225
    .line 1226
    if-nez v8, :cond_34

    .line 1227
    .line 1228
    goto :goto_18

    .line 1229
    :cond_34
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1230
    .line 1231
    .line 1232
    move-result v8

    .line 1233
    if-nez v8, :cond_35

    .line 1234
    .line 1235
    move v8, v4

    .line 1236
    goto :goto_19

    .line 1237
    :cond_35
    :goto_18
    move v8, v3

    .line 1238
    :goto_19
    invoke-virtual {v5, p0, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1239
    .line 1240
    .line 1241
    move-result p0

    .line 1242
    if-eqz p0, :cond_36

    .line 1243
    .line 1244
    new-instance p0, Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;

    .line 1245
    .line 1246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    :cond_36
    const-class p0, Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk;

    .line 1253
    .line 1254
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1255
    .line 1256
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1260
    .line 1261
    .line 1262
    move-result v9

    .line 1263
    if-nez v9, :cond_37

    .line 1264
    .line 1265
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1266
    .line 1267
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v9

    .line 1274
    if-eqz v9, :cond_38

    .line 1275
    .line 1276
    :cond_37
    const-string v9, "MotoG3"

    .line 1277
    .line 1278
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1279
    .line 1280
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v9

    .line 1284
    if-eqz v9, :cond_38

    .line 1285
    .line 1286
    goto/16 :goto_1a

    .line 1287
    .line 1288
    :cond_38
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v9

    .line 1292
    if-nez v9, :cond_39

    .line 1293
    .line 1294
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1295
    .line 1296
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v9

    .line 1303
    if-eqz v9, :cond_3a

    .line 1304
    .line 1305
    :cond_39
    const-string v9, "SM-G532F"

    .line 1306
    .line 1307
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1308
    .line 1309
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v9

    .line 1313
    if-eqz v9, :cond_3a

    .line 1314
    .line 1315
    goto/16 :goto_1a

    .line 1316
    .line 1317
    :cond_3a
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v9

    .line 1321
    if-nez v9, :cond_3b

    .line 1322
    .line 1323
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1324
    .line 1325
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1329
    .line 1330
    .line 1331
    move-result v9

    .line 1332
    if-eqz v9, :cond_3c

    .line 1333
    .line 1334
    :cond_3b
    const-string v9, "SM-J700F"

    .line 1335
    .line 1336
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1337
    .line 1338
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v9

    .line 1342
    if-eqz v9, :cond_3c

    .line 1343
    .line 1344
    goto :goto_1a

    .line 1345
    :cond_3c
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1346
    .line 1347
    .line 1348
    move-result v9

    .line 1349
    if-nez v9, :cond_3d

    .line 1350
    .line 1351
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1352
    .line 1353
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v9

    .line 1360
    if-eqz v9, :cond_3e

    .line 1361
    .line 1362
    :cond_3d
    const-string v9, "SM-A920F"

    .line 1363
    .line 1364
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1365
    .line 1366
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v9

    .line 1370
    if-eqz v9, :cond_3e

    .line 1371
    .line 1372
    goto :goto_1a

    .line 1373
    :cond_3e
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v9

    .line 1377
    if-nez v9, :cond_3f

    .line 1378
    .line 1379
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1380
    .line 1381
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1385
    .line 1386
    .line 1387
    move-result v9

    .line 1388
    if-eqz v9, :cond_40

    .line 1389
    .line 1390
    :cond_3f
    const-string v9, "SM-J415F"

    .line 1391
    .line 1392
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1393
    .line 1394
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v9

    .line 1398
    if-eqz v9, :cond_40

    .line 1399
    .line 1400
    goto :goto_1a

    .line 1401
    :cond_40
    const-string v9, "Xiaomi"

    .line 1402
    .line 1403
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v10

    .line 1407
    if-nez v10, :cond_41

    .line 1408
    .line 1409
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1410
    .line 1411
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1415
    .line 1416
    .line 1417
    move-result v9

    .line 1418
    if-eqz v9, :cond_42

    .line 1419
    .line 1420
    :cond_41
    const-string v9, "Mi A1"

    .line 1421
    .line 1422
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1423
    .line 1424
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1425
    .line 1426
    .line 1427
    move-result v9

    .line 1428
    if-eqz v9, :cond_42

    .line 1429
    .line 1430
    :goto_1a
    move v9, v4

    .line 1431
    goto :goto_1b

    .line 1432
    :cond_42
    move v9, v3

    .line 1433
    :goto_1b
    invoke-virtual {v5, p0, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1434
    .line 1435
    .line 1436
    move-result p0

    .line 1437
    if-eqz p0, :cond_43

    .line 1438
    .line 1439
    new-instance p0, Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk;

    .line 1440
    .line 1441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    :cond_43
    const-class p0, Landroidx/camera/camera2/compat/quirk/PreviewStretchWhenVideoCaptureIsBoundQuirk;

    .line 1448
    .line 1449
    invoke-virtual {v8, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1450
    .line 1451
    .line 1452
    move-result v9

    .line 1453
    if-nez v9, :cond_44

    .line 1454
    .line 1455
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1456
    .line 1457
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v9, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1461
    .line 1462
    .line 1463
    move-result v9

    .line 1464
    if-eqz v9, :cond_45

    .line 1465
    .line 1466
    :cond_44
    const-string v9, "HUAWEI ALE-L04"

    .line 1467
    .line 1468
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1469
    .line 1470
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1471
    .line 1472
    .line 1473
    move-result v9

    .line 1474
    if-eqz v9, :cond_45

    .line 1475
    .line 1476
    goto/16 :goto_1c

    .line 1477
    .line 1478
    :cond_45
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v9

    .line 1482
    if-nez v9, :cond_46

    .line 1483
    .line 1484
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1485
    .line 1486
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v9

    .line 1493
    if-eqz v9, :cond_47

    .line 1494
    .line 1495
    :cond_46
    const-string v9, "sm-j320f"

    .line 1496
    .line 1497
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1498
    .line 1499
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1500
    .line 1501
    .line 1502
    move-result v9

    .line 1503
    if-eqz v9, :cond_47

    .line 1504
    .line 1505
    goto/16 :goto_1c

    .line 1506
    .line 1507
    :cond_47
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v9

    .line 1511
    if-nez v9, :cond_48

    .line 1512
    .line 1513
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1514
    .line 1515
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v9

    .line 1522
    if-eqz v9, :cond_49

    .line 1523
    .line 1524
    :cond_48
    const-string v9, "sm-j700f"

    .line 1525
    .line 1526
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1527
    .line 1528
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v9

    .line 1532
    if-eqz v9, :cond_49

    .line 1533
    .line 1534
    goto :goto_1c

    .line 1535
    :cond_49
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v9

    .line 1539
    if-nez v9, :cond_4a

    .line 1540
    .line 1541
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1542
    .line 1543
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1547
    .line 1548
    .line 1549
    move-result v9

    .line 1550
    if-eqz v9, :cond_4b

    .line 1551
    .line 1552
    :cond_4a
    const-string v9, "sm-j111f"

    .line 1553
    .line 1554
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1555
    .line 1556
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1557
    .line 1558
    .line 1559
    move-result v9

    .line 1560
    if-eqz v9, :cond_4b

    .line 1561
    .line 1562
    goto :goto_1c

    .line 1563
    :cond_4b
    const-string v9, "Oppo"

    .line 1564
    .line 1565
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v10

    .line 1569
    if-nez v10, :cond_4c

    .line 1570
    .line 1571
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1572
    .line 1573
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1577
    .line 1578
    .line 1579
    move-result v9

    .line 1580
    if-eqz v9, :cond_4d

    .line 1581
    .line 1582
    :cond_4c
    const-string v9, "A37F"

    .line 1583
    .line 1584
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1585
    .line 1586
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v9

    .line 1590
    if-eqz v9, :cond_4d

    .line 1591
    .line 1592
    goto :goto_1c

    .line 1593
    :cond_4d
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v9

    .line 1597
    if-nez v9, :cond_4e

    .line 1598
    .line 1599
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1600
    .line 1601
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v9

    .line 1608
    if-eqz v9, :cond_4f

    .line 1609
    .line 1610
    :cond_4e
    const-string v9, "sm-j510fn"

    .line 1611
    .line 1612
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1613
    .line 1614
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1615
    .line 1616
    .line 1617
    move-result v9

    .line 1618
    if-eqz v9, :cond_4f

    .line 1619
    .line 1620
    :goto_1c
    move v9, v4

    .line 1621
    goto :goto_1d

    .line 1622
    :cond_4f
    move v9, v3

    .line 1623
    :goto_1d
    invoke-virtual {v5, p0, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1624
    .line 1625
    .line 1626
    move-result p0

    .line 1627
    if-eqz p0, :cond_50

    .line 1628
    .line 1629
    new-instance p0, Landroidx/camera/camera2/compat/quirk/PreviewStretchWhenVideoCaptureIsBoundQuirk;

    .line 1630
    .line 1631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1632
    .line 1633
    .line 1634
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1635
    .line 1636
    .line 1637
    :cond_50
    const-class p0, Landroidx/camera/camera2/compat/quirk/PreviewDelayWhenVideoCaptureIsBoundQuirk;

    .line 1638
    .line 1639
    invoke-virtual {v8, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v9

    .line 1643
    if-nez v9, :cond_52

    .line 1644
    .line 1645
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1646
    .line 1647
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v9, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1651
    .line 1652
    .line 1653
    move-result v9

    .line 1654
    if-eqz v9, :cond_51

    .line 1655
    .line 1656
    goto :goto_1e

    .line 1657
    :cond_51
    move v9, v3

    .line 1658
    goto :goto_1f

    .line 1659
    :cond_52
    :goto_1e
    move v9, v4

    .line 1660
    :goto_1f
    invoke-virtual {v5, p0, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1661
    .line 1662
    .line 1663
    move-result p0

    .line 1664
    if-eqz p0, :cond_53

    .line 1665
    .line 1666
    new-instance p0, Landroidx/camera/camera2/compat/quirk/PreviewDelayWhenVideoCaptureIsBoundQuirk;

    .line 1667
    .line 1668
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1669
    .line 1670
    .line 1671
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1672
    .line 1673
    .line 1674
    :cond_53
    const-class p0, Landroidx/camera/camera2/compat/quirk/QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;

    .line 1675
    .line 1676
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1677
    .line 1678
    .line 1679
    move-result v9

    .line 1680
    if-nez v9, :cond_54

    .line 1681
    .line 1682
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1683
    .line 1684
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1688
    .line 1689
    .line 1690
    move-result v9

    .line 1691
    if-eqz v9, :cond_55

    .line 1692
    .line 1693
    :cond_54
    sget-object v9, Ljj0;->h:Lij0;

    .line 1694
    .line 1695
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    invoke-static {v7}, Lij0;->c(Ljj0;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v9

    .line 1702
    if-eqz v9, :cond_55

    .line 1703
    .line 1704
    move v9, v4

    .line 1705
    goto :goto_20

    .line 1706
    :cond_55
    move v9, v3

    .line 1707
    :goto_20
    invoke-virtual {v5, p0, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1708
    .line 1709
    .line 1710
    move-result p0

    .line 1711
    if-eqz p0, :cond_56

    .line 1712
    .line 1713
    new-instance p0, Landroidx/camera/camera2/compat/quirk/QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;

    .line 1714
    .line 1715
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1719
    .line 1720
    .line 1721
    :cond_56
    const-class p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;

    .line 1722
    .line 1723
    invoke-static {}, Lx97;->E()Z

    .line 1724
    .line 1725
    .line 1726
    move-result v9

    .line 1727
    if-nez v9, :cond_5f

    .line 1728
    .line 1729
    invoke-static {}, Lx97;->I()Z

    .line 1730
    .line 1731
    .line 1732
    move-result v9

    .line 1733
    if-nez v9, :cond_5f

    .line 1734
    .line 1735
    invoke-static {}, Lx97;->L()Z

    .line 1736
    .line 1737
    .line 1738
    move-result v9

    .line 1739
    if-nez v9, :cond_5f

    .line 1740
    .line 1741
    invoke-static {}, Lx97;->J()Z

    .line 1742
    .line 1743
    .line 1744
    move-result v9

    .line 1745
    if-nez v9, :cond_5f

    .line 1746
    .line 1747
    const-string v9, "pixel 4 xl"

    .line 1748
    .line 1749
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1750
    .line 1751
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v9

    .line 1755
    if-eqz v9, :cond_57

    .line 1756
    .line 1757
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1758
    .line 1759
    const/16 v11, 0x1d

    .line 1760
    .line 1761
    if-ne v9, v11, :cond_57

    .line 1762
    .line 1763
    goto :goto_21

    .line 1764
    :cond_57
    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1765
    .line 1766
    .line 1767
    move-result v9

    .line 1768
    if-nez v9, :cond_58

    .line 1769
    .line 1770
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1771
    .line 1772
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v0

    .line 1779
    if-eqz v0, :cond_59

    .line 1780
    .line 1781
    :cond_58
    const-string v0, "moto e13"

    .line 1782
    .line 1783
    invoke-virtual {v0, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1784
    .line 1785
    .line 1786
    move-result v0

    .line 1787
    if-eqz v0, :cond_59

    .line 1788
    .line 1789
    goto :goto_21

    .line 1790
    :cond_59
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1791
    .line 1792
    .line 1793
    move-result v0

    .line 1794
    if-nez v0, :cond_5a

    .line 1795
    .line 1796
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1797
    .line 1798
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1802
    .line 1803
    .line 1804
    move-result v0

    .line 1805
    if-eqz v0, :cond_5b

    .line 1806
    .line 1807
    :cond_5a
    const-string v0, "gta8"

    .line 1808
    .line 1809
    sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1810
    .line 1811
    invoke-virtual {v0, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1812
    .line 1813
    .line 1814
    move-result v0

    .line 1815
    if-nez v0, :cond_5f

    .line 1816
    .line 1817
    const-string v0, "gta8wifi"

    .line 1818
    .line 1819
    invoke-virtual {v0, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1820
    .line 1821
    .line 1822
    move-result v0

    .line 1823
    if-eqz v0, :cond_5b

    .line 1824
    .line 1825
    goto :goto_21

    .line 1826
    :cond_5b
    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1827
    .line 1828
    .line 1829
    move-result v0

    .line 1830
    if-nez v0, :cond_5c

    .line 1831
    .line 1832
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1833
    .line 1834
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1835
    .line 1836
    .line 1837
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1838
    .line 1839
    .line 1840
    move-result v0

    .line 1841
    if-eqz v0, :cond_5d

    .line 1842
    .line 1843
    :cond_5c
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1844
    .line 1845
    .line 1846
    const-string v0, "SM-A536"

    .line 1847
    .line 1848
    invoke-static {v10, v3, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1849
    .line 1850
    .line 1851
    move-result v0

    .line 1852
    if-eqz v0, :cond_5d

    .line 1853
    .line 1854
    goto :goto_21

    .line 1855
    :cond_5d
    invoke-static {}, Ltc;->r()Z

    .line 1856
    .line 1857
    .line 1858
    move-result v0

    .line 1859
    if-eqz v0, :cond_5e

    .line 1860
    .line 1861
    goto :goto_21

    .line 1862
    :cond_5e
    move v0, v3

    .line 1863
    goto :goto_22

    .line 1864
    :cond_5f
    :goto_21
    move v0, v4

    .line 1865
    :goto_22
    invoke-virtual {v5, p0, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1866
    .line 1867
    .line 1868
    move-result p0

    .line 1869
    if-eqz p0, :cond_60

    .line 1870
    .line 1871
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;

    .line 1872
    .line 1873
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1877
    .line 1878
    .line 1879
    :cond_60
    const-class p0, Landroidx/camera/camera2/compat/quirk/TemporalNoiseQuirk;

    .line 1880
    .line 1881
    const-string v0, "Pixel 8"

    .line 1882
    .line 1883
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1884
    .line 1885
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1886
    .line 1887
    .line 1888
    move-result v0

    .line 1889
    if-eqz v0, :cond_62

    .line 1890
    .line 1891
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1892
    .line 1893
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1894
    .line 1895
    .line 1896
    move-object v9, v7

    .line 1897
    check-cast v9, Llf0;

    .line 1898
    .line 1899
    invoke-virtual {v9, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0

    .line 1903
    check-cast v0, Ljava/lang/Integer;

    .line 1904
    .line 1905
    if-nez v0, :cond_61

    .line 1906
    .line 1907
    goto :goto_23

    .line 1908
    :cond_61
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1909
    .line 1910
    .line 1911
    move-result v0

    .line 1912
    if-nez v0, :cond_62

    .line 1913
    .line 1914
    move v0, v4

    .line 1915
    goto :goto_24

    .line 1916
    :cond_62
    :goto_23
    move v0, v3

    .line 1917
    :goto_24
    invoke-virtual {v5, p0, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1918
    .line 1919
    .line 1920
    move-result p0

    .line 1921
    if-eqz p0, :cond_63

    .line 1922
    .line 1923
    new-instance p0, Landroidx/camera/camera2/compat/quirk/TemporalNoiseQuirk;

    .line 1924
    .line 1925
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1926
    .line 1927
    .line 1928
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1929
    .line 1930
    .line 1931
    :cond_63
    const-class p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedForVideoSnapshotQuirk;

    .line 1932
    .line 1933
    sget-object v0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedForVideoSnapshotQuirk;->a:Ljava/util/Set;

    .line 1934
    .line 1935
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1936
    .line 1937
    .line 1938
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1939
    .line 1940
    invoke-virtual {v2, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v9

    .line 1944
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1945
    .line 1946
    .line 1947
    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1948
    .line 1949
    .line 1950
    move-result v0

    .line 1951
    if-nez v0, :cond_66

    .line 1952
    .line 1953
    invoke-static {}, Ltc;->r()Z

    .line 1954
    .line 1955
    .line 1956
    move-result v0

    .line 1957
    if-nez v0, :cond_66

    .line 1958
    .line 1959
    invoke-virtual {v8, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1960
    .line 1961
    .line 1962
    move-result v0

    .line 1963
    if-nez v0, :cond_64

    .line 1964
    .line 1965
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1966
    .line 1967
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1968
    .line 1969
    .line 1970
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1971
    .line 1972
    .line 1973
    move-result v0

    .line 1974
    if-eqz v0, :cond_65

    .line 1975
    .line 1976
    :cond_64
    const-string v0, "FIG-LX1"

    .line 1977
    .line 1978
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1979
    .line 1980
    .line 1981
    move-result v0

    .line 1982
    if-eqz v0, :cond_65

    .line 1983
    .line 1984
    goto :goto_25

    .line 1985
    :cond_65
    move v0, v3

    .line 1986
    goto :goto_26

    .line 1987
    :cond_66
    :goto_25
    move v0, v4

    .line 1988
    :goto_26
    invoke-virtual {v5, p0, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1989
    .line 1990
    .line 1991
    move-result p0

    .line 1992
    if-eqz p0, :cond_67

    .line 1993
    .line 1994
    new-instance p0, Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedForVideoSnapshotQuirk;

    .line 1995
    .line 1996
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1997
    .line 1998
    .line 1999
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2000
    .line 2001
    .line 2002
    :cond_67
    const-class p0, Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;

    .line 2003
    .line 2004
    invoke-static {}, Lu15;->C()Z

    .line 2005
    .line 2006
    .line 2007
    move-result v0

    .line 2008
    invoke-virtual {v5, p0, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 2009
    .line 2010
    .line 2011
    move-result p0

    .line 2012
    if-eqz p0, :cond_68

    .line 2013
    .line 2014
    new-instance p0, Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;

    .line 2015
    .line 2016
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2020
    .line 2021
    .line 2022
    :cond_68
    const-class p0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;

    .line 2023
    .line 2024
    sget-object v0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;->a:Ljava/util/List;

    .line 2025
    .line 2026
    if-eqz v0, :cond_69

    .line 2027
    .line 2028
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2029
    .line 2030
    .line 2031
    move-result v1

    .line 2032
    if-eqz v1, :cond_69

    .line 2033
    .line 2034
    goto :goto_27

    .line 2035
    :cond_69
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v0

    .line 2039
    :cond_6a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2040
    .line 2041
    .line 2042
    move-result v1

    .line 2043
    if-eqz v1, :cond_6c

    .line 2044
    .line 2045
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v1

    .line 2049
    check-cast v1, Ljava/lang/String;

    .line 2050
    .line 2051
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2052
    .line 2053
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2054
    .line 2055
    .line 2056
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2057
    .line 2058
    invoke-virtual {v2, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v2

    .line 2062
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2063
    .line 2064
    .line 2065
    invoke-static {v2, v3, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v1

    .line 2069
    if-eqz v1, :cond_6a

    .line 2070
    .line 2071
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2072
    .line 2073
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2074
    .line 2075
    .line 2076
    check-cast v7, Llf0;

    .line 2077
    .line 2078
    invoke-virtual {v7, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v0

    .line 2082
    check-cast v0, Ljava/lang/Integer;

    .line 2083
    .line 2084
    if-nez v0, :cond_6b

    .line 2085
    .line 2086
    goto :goto_27

    .line 2087
    :cond_6b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2088
    .line 2089
    .line 2090
    move-result v0

    .line 2091
    if-ne v0, v4, :cond_6c

    .line 2092
    .line 2093
    move v3, v4

    .line 2094
    :cond_6c
    :goto_27
    invoke-virtual {v5, p0, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 2095
    .line 2096
    .line 2097
    move-result p0

    .line 2098
    if-eqz p0, :cond_6d

    .line 2099
    .line 2100
    new-instance p0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;

    .line 2101
    .line 2102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2103
    .line 2104
    .line 2105
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2106
    .line 2107
    .line 2108
    :cond_6d
    new-instance p0, Li26;

    .line 2109
    .line 2110
    invoke-direct {p0, v6}, Li26;-><init>(Ljava/util/ArrayList;)V

    .line 2111
    .line 2112
    .line 2113
    const-string v0, "CameraQuirks"

    .line 2114
    .line 2115
    invoke-static {p0}, Li26;->d(Li26;)V

    .line 2116
    .line 2117
    .line 2118
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 2119
    .line 2120
    .line 2121
    :goto_28
    return-object p0

    .line 2122
    :catch_0
    move-exception p0

    .line 2123
    goto :goto_29

    .line 2124
    :catch_1
    move-exception p0

    .line 2125
    :goto_29
    new-instance v0, Ljava/lang/AssertionError;

    .line 2126
    .line 2127
    const-string v1, "Unexpected error in QuirkSettings StateObservable"

    .line 2128
    .line 2129
    invoke-direct {v0, v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2130
    .line 2131
    .line 2132
    throw v0

    .line 2133
    :pswitch_d
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2134
    .line 2135
    check-cast p0, Lzf0;

    .line 2136
    .line 2137
    iget-object p0, p0, Lzf0;->d:Lv06;

    .line 2138
    .line 2139
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 2140
    .line 2141
    .line 2142
    move-result-object p0

    .line 2143
    check-cast p0, Lxh0;

    .line 2144
    .line 2145
    return-object p0

    .line 2146
    :pswitch_e
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2147
    .line 2148
    check-cast p0, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;

    .line 2149
    .line 2150
    iget-object p0, p0, Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;->a:Lvk7;

    .line 2151
    .line 2152
    invoke-virtual {p0, v2}, Lvk7;->a(I)[Landroid/util/Size;

    .line 2153
    .line 2154
    .line 2155
    move-result-object p0

    .line 2156
    if-eqz p0, :cond_6e

    .line 2157
    .line 2158
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2159
    .line 2160
    .line 2161
    move-result-object p0

    .line 2162
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2163
    .line 2164
    .line 2165
    goto :goto_2a

    .line 2166
    :cond_6e
    sget-object p0, Ld02;->X:Ld02;

    .line 2167
    .line 2168
    :goto_2a
    const-string v0, "CXCP"

    .line 2169
    .line 2170
    invoke-static {v0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 2171
    .line 2172
    .line 2173
    move-result v0

    .line 2174
    if-eqz v0, :cond_6f

    .line 2175
    .line 2176
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2177
    .line 2178
    .line 2179
    :cond_6f
    return-object p0

    .line 2180
    :pswitch_f
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2181
    .line 2182
    check-cast p0, Ls86;

    .line 2183
    .line 2184
    return-object p0

    .line 2185
    :pswitch_10
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2186
    .line 2187
    check-cast p0, Lb60;

    .line 2188
    .line 2189
    invoke-static {p0}, Lb60;->b(Lb60;)Lnd1;

    .line 2190
    .line 2191
    .line 2192
    move-result-object p0

    .line 2193
    return-object p0

    .line 2194
    :pswitch_11
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2195
    .line 2196
    check-cast p0, Lql;

    .line 2197
    .line 2198
    return-object p0

    .line 2199
    :pswitch_12
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2200
    .line 2201
    check-cast p0, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 2202
    .line 2203
    sget v0, Lsu/happ/proxyutility/ui/BaseActivity;->P0:I

    .line 2204
    .line 2205
    new-instance v0, Ly2;

    .line 2206
    .line 2207
    invoke-direct {v0, p0}, Ly2;-><init>(Lsu/happ/proxyutility/ui/BaseActivity;)V

    .line 2208
    .line 2209
    .line 2210
    new-instance p0, Le08;

    .line 2211
    .line 2212
    invoke-direct {p0, v0}, Le08;-><init>(Lgn2;)V

    .line 2213
    .line 2214
    .line 2215
    return-object p0

    .line 2216
    :pswitch_13
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2217
    .line 2218
    check-cast p0, Ld10;

    .line 2219
    .line 2220
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2221
    .line 2222
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2223
    .line 2224
    .line 2225
    new-instance p0, Ljava/lang/ClassCastException;

    .line 2226
    .line 2227
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 2228
    .line 2229
    .line 2230
    throw p0

    .line 2231
    :pswitch_14
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2232
    .line 2233
    check-cast p0, [Ljava/lang/Object;

    .line 2234
    .line 2235
    invoke-static {p0}, Lzc1;->W([Ljava/lang/Object;)Lw1;

    .line 2236
    .line 2237
    .line 2238
    move-result-object p0

    .line 2239
    return-object p0

    .line 2240
    :pswitch_15
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2241
    .line 2242
    check-cast p0, Lus;

    .line 2243
    .line 2244
    new-instance v0, Lh03;

    .line 2245
    .line 2246
    iget-object p0, p0, Lus;->a:Landroid/content/Context;

    .line 2247
    .line 2248
    invoke-direct {v0, p0}, Lh03;-><init>(Landroid/content/Context;)V

    .line 2249
    .line 2250
    .line 2251
    return-object v0

    .line 2252
    :pswitch_16
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2253
    .line 2254
    check-cast p0, Lqo;

    .line 2255
    .line 2256
    iget-object p0, p0, Lqo;->a:Landroid/content/Context;

    .line 2257
    .line 2258
    invoke-static {p0}, Lue3;->y(Landroid/content/Context;)Z

    .line 2259
    .line 2260
    .line 2261
    move-result p0

    .line 2262
    if-eqz p0, :cond_70

    .line 2263
    .line 2264
    const-string p0, "AndroidTV"

    .line 2265
    .line 2266
    goto :goto_2b

    .line 2267
    :cond_70
    const-string p0, "Android"

    .line 2268
    .line 2269
    :goto_2b
    invoke-static {p0}, Lch3;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 2270
    .line 2271
    .line 2272
    move-result-object p0

    .line 2273
    return-object p0

    .line 2274
    :pswitch_17
    sget-object p0, Ldn8;->a:Ldn8;

    .line 2275
    .line 2276
    return-object p0

    .line 2277
    :pswitch_18
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2278
    .line 2279
    check-cast p0, Lh38;

    .line 2280
    .line 2281
    invoke-interface {p0}, Lh38;->S()Lg38;

    .line 2282
    .line 2283
    .line 2284
    move-result-object p0

    .line 2285
    return-object p0

    .line 2286
    :pswitch_19
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2287
    .line 2288
    check-cast p0, Lrf;

    .line 2289
    .line 2290
    iget-object p0, p0, Lrf;->Z:Lb71;

    .line 2291
    .line 2292
    invoke-static {p0, v5}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 2293
    .line 2294
    .line 2295
    sget-object p0, Ldn8;->a:Ldn8;

    .line 2296
    .line 2297
    return-object p0

    .line 2298
    :pswitch_1a
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2299
    .line 2300
    check-cast p0, Lfi1;

    .line 2301
    .line 2302
    const/high16 v0, 0x42fa0000    # 125.0f

    .line 2303
    .line 2304
    invoke-interface {p0, v0}, Lfi1;->h0(F)F

    .line 2305
    .line 2306
    .line 2307
    move-result p0

    .line 2308
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2309
    .line 2310
    .line 2311
    move-result-object p0

    .line 2312
    return-object p0

    .line 2313
    :pswitch_1b
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2314
    .line 2315
    check-cast p0, Ljj0;

    .line 2316
    .line 2317
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2318
    .line 2319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2320
    .line 2321
    .line 2322
    check-cast p0, Llf0;

    .line 2323
    .line 2324
    invoke-virtual {p0, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 2325
    .line 2326
    .line 2327
    move-result-object p0

    .line 2328
    check-cast p0, [Landroid/util/Range;

    .line 2329
    .line 2330
    if-eqz p0, :cond_78

    .line 2331
    .line 2332
    array-length v0, p0

    .line 2333
    if-nez v0, :cond_71

    .line 2334
    .line 2335
    goto/16 :goto_2f

    .line 2336
    .line 2337
    :cond_71
    array-length v0, p0

    .line 2338
    :goto_2c
    if-ge v3, v0, :cond_78

    .line 2339
    .line 2340
    aget-object v2, p0, v3

    .line 2341
    .line 2342
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v4

    .line 2346
    check-cast v4, Ljava/lang/Integer;

    .line 2347
    .line 2348
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v6

    .line 2352
    check-cast v6, Ljava/lang/Integer;

    .line 2353
    .line 2354
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v7

    .line 2358
    check-cast v7, Ljava/lang/Number;

    .line 2359
    .line 2360
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 2361
    .line 2362
    .line 2363
    move-result v7

    .line 2364
    const/16 v8, 0x3e8

    .line 2365
    .line 2366
    if-lt v7, v8, :cond_72

    .line 2367
    .line 2368
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v4

    .line 2372
    check-cast v4, Ljava/lang/Number;

    .line 2373
    .line 2374
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 2375
    .line 2376
    .line 2377
    move-result v4

    .line 2378
    div-int/2addr v4, v8

    .line 2379
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v4

    .line 2383
    :cond_72
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v7

    .line 2387
    check-cast v7, Ljava/lang/Number;

    .line 2388
    .line 2389
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 2390
    .line 2391
    .line 2392
    move-result v7

    .line 2393
    if-lt v7, v8, :cond_73

    .line 2394
    .line 2395
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v2

    .line 2399
    check-cast v2, Ljava/lang/Number;

    .line 2400
    .line 2401
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2402
    .line 2403
    .line 2404
    move-result v2

    .line 2405
    div-int/2addr v2, v8

    .line 2406
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v6

    .line 2410
    :cond_73
    new-instance v2, Landroid/util/Range;

    .line 2411
    .line 2412
    invoke-direct {v2, v6, v4}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 2413
    .line 2414
    .line 2415
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2416
    .line 2417
    .line 2418
    move-result-object v4

    .line 2419
    check-cast v4, Ljava/lang/Integer;

    .line 2420
    .line 2421
    if-nez v4, :cond_74

    .line 2422
    .line 2423
    goto :goto_2e

    .line 2424
    :cond_74
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2425
    .line 2426
    .line 2427
    move-result v4

    .line 2428
    if-eq v4, v1, :cond_75

    .line 2429
    .line 2430
    goto :goto_2e

    .line 2431
    :cond_75
    if-nez v5, :cond_76

    .line 2432
    .line 2433
    goto :goto_2d

    .line 2434
    :cond_76
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v4

    .line 2438
    check-cast v4, Ljava/lang/Number;

    .line 2439
    .line 2440
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 2441
    .line 2442
    .line 2443
    move-result v4

    .line 2444
    invoke-virtual {v5}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v6

    .line 2448
    check-cast v6, Ljava/lang/Number;

    .line 2449
    .line 2450
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2451
    .line 2452
    .line 2453
    move-result v6

    .line 2454
    if-ge v4, v6, :cond_77

    .line 2455
    .line 2456
    :goto_2d
    move-object v5, v2

    .line 2457
    :cond_77
    :goto_2e
    add-int/lit8 v3, v3, 0x1

    .line 2458
    .line 2459
    goto :goto_2c

    .line 2460
    :cond_78
    :goto_2f
    return-object v5

    .line 2461
    :pswitch_1c
    iget-object p0, p0, Lo7;->Y:Ljava/lang/Object;

    .line 2462
    .line 2463
    check-cast p0, Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;

    .line 2464
    .line 2465
    sget-object v0, Lpx;->b:Lox;

    .line 2466
    .line 2467
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2468
    .line 2469
    .line 2470
    sget-object v0, Lpx;->c:Lvz7;

    .line 2471
    .line 2472
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v0

    .line 2476
    check-cast v0, Lpx;

    .line 2477
    .line 2478
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v1

    .line 2482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2483
    .line 2484
    .line 2485
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v2

    .line 2489
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    .line 2490
    .line 2491
    .line 2492
    move-result-object v2

    .line 2493
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2494
    .line 2495
    .line 2496
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2497
    .line 2498
    .line 2499
    move-result-object v2

    .line 2500
    :cond_79
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2501
    .line 2502
    .line 2503
    move-result v6

    .line 2504
    if-eqz v6, :cond_7a

    .line 2505
    .line 2506
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v6

    .line 2510
    check-cast v6, Landroid/content/pm/ApplicationInfo;

    .line 2511
    .line 2512
    iget-object v7, v0, Lpx;->a:Ljava/util/List;

    .line 2513
    .line 2514
    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2515
    .line 2516
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2517
    .line 2518
    .line 2519
    move-result v6

    .line 2520
    if-eqz v6, :cond_79

    .line 2521
    .line 2522
    invoke-static {v0, v1, v3}, Lpx;->c(Lpx;Landroid/content/Context;Z)Z

    .line 2523
    .line 2524
    .line 2525
    move-result v6

    .line 2526
    if-eqz v6, :cond_79

    .line 2527
    .line 2528
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 2529
    .line 2530
    .line 2531
    move-result-object p0

    .line 2532
    invoke-static {v0, p0, v4}, Lpx;->c(Lpx;Landroid/content/Context;Z)Z

    .line 2533
    .line 2534
    .line 2535
    goto :goto_30

    .line 2536
    :cond_7a
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 2537
    .line 2538
    .line 2539
    move-result-object p0

    .line 2540
    new-instance v0, Landroid/content/Intent;

    .line 2541
    .line 2542
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 2543
    .line 2544
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2545
    .line 2546
    .line 2547
    const-string v1, "package"

    .line 2548
    .line 2549
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v2

    .line 2553
    invoke-static {v1, v2, v5}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v1

    .line 2557
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v0

    .line 2561
    const/high16 v1, 0x10000000

    .line 2562
    .line 2563
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v0

    .line 2567
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2568
    .line 2569
    .line 2570
    :goto_30
    sget-object p0, Ldn8;->a:Ldn8;

    .line 2571
    .line 2572
    return-object p0

    .line 2573
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

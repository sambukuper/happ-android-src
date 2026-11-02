.class public final synthetic Lv28;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lv28;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv28;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lv28;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lv28;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lv28;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lv28;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lv28;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, Lv28;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v9, v0

    .line 18
    check-cast v9, Lr68;

    .line 19
    .line 20
    check-cast v4, Lb71;

    .line 21
    .line 22
    check-cast v3, Landroid/content/Context;

    .line 23
    .line 24
    move-object/from16 v0, p1

    .line 25
    .line 26
    check-cast v0, Le38;

    .line 27
    .line 28
    iget-object v1, v0, Le38;->a:Lj05;

    .line 29
    .line 30
    iget-object v0, v0, Le38;->a:Lj05;

    .line 31
    .line 32
    sget-object v12, Ls38;->b:Ls38;

    .line 33
    .line 34
    invoke-virtual {v1, v12}, Lj05;->a(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lo38;->f0:Lo38;

    .line 38
    .line 39
    iget-object v1, v9, Lr68;->a:Lkd8;

    .line 40
    .line 41
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v6, v1, Lh48;->f0:J

    .line 46
    .line 47
    invoke-static {v6, v7}, Lf88;->b(J)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v13, 0x0

    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v9}, Lr68;->m()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    move v1, v5

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move v1, v13

    .line 63
    :goto_0
    new-instance v6, Lt68;

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-direct {v6, v9, v8, v13}, Lt68;-><init>(Lr68;Lq51;B)V

    .line 67
    .line 68
    .line 69
    new-instance v7, La23;

    .line 70
    .line 71
    const/16 v14, 0x1c

    .line 72
    .line 73
    invoke-direct {v7, v4, v6, v14}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    new-instance v6, Lii;

    .line 81
    .line 82
    const/16 v11, 0x8

    .line 83
    .line 84
    sget-object v10, Ls88;->X:Ls88;

    .line 85
    .line 86
    invoke-direct/range {v6 .. v11}, Lii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    sget-object v1, Lw79;->c:Ljava/lang/Object;

    .line 92
    .line 93
    const v7, 0x1040003

    .line 94
    .line 95
    .line 96
    invoke-virtual {v15, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    new-instance v11, Ln38;

    .line 101
    .line 102
    const v15, 0x1010311

    .line 103
    .line 104
    .line 105
    invoke-direct {v11, v1, v7, v15, v6}, Ln38;-><init>(Ljava/lang/Object;Ljava/lang/String;ILgn2;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v11}, Lj05;->a(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    sget-object v1, Lo38;->f0:Lo38;

    .line 112
    .line 113
    iget-object v1, v9, Lr68;->a:Lkd8;

    .line 114
    .line 115
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-wide v6, v1, Lh48;->f0:J

    .line 120
    .line 121
    invoke-static {v6, v7}, Lf88;->b(J)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    new-instance v6, Lt68;

    .line 126
    .line 127
    invoke-direct {v6, v9, v8, v5}, Lt68;-><init>(Lr68;Lq51;B)V

    .line 128
    .line 129
    .line 130
    new-instance v7, La23;

    .line 131
    .line 132
    invoke-direct {v7, v4, v6, v14}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    new-instance v6, Lii;

    .line 140
    .line 141
    const/16 v11, 0x8

    .line 142
    .line 143
    invoke-direct/range {v6 .. v11}, Lii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    if-nez v1, :cond_2

    .line 147
    .line 148
    sget-object v1, Lw79;->d:Ljava/lang/Object;

    .line 149
    .line 150
    const v7, 0x1040001

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    new-instance v11, Ln38;

    .line 158
    .line 159
    const v15, 0x1010312

    .line 160
    .line 161
    .line 162
    invoke-direct {v11, v1, v7, v15, v6}, Ln38;-><init>(Ljava/lang/Object;Ljava/lang/String;ILgn2;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v11}, Lj05;->a(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_2
    sget-object v1, Lo38;->f0:Lo38;

    .line 169
    .line 170
    invoke-virtual {v9}, Lr68;->m()Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    iget-object v1, v9, Lr68;->y:Lh70;

    .line 177
    .line 178
    iget-boolean v1, v1, Lh70;->Y:Z

    .line 179
    .line 180
    if-eqz v1, :cond_3

    .line 181
    .line 182
    move v1, v5

    .line 183
    goto :goto_2

    .line 184
    :cond_3
    iget-object v1, v9, Lr68;->m:Ldn2;

    .line 185
    .line 186
    if-eqz v1, :cond_5

    .line 187
    .line 188
    invoke-interface {v1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-nez v1, :cond_4

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_4
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 196
    .line 197
    .line 198
    :cond_5
    :goto_1
    move v1, v13

    .line 199
    :goto_2
    new-instance v6, Lt68;

    .line 200
    .line 201
    const/4 v7, 0x2

    .line 202
    invoke-direct {v6, v9, v8, v7}, Lt68;-><init>(Lr68;Lq51;B)V

    .line 203
    .line 204
    .line 205
    new-instance v7, La23;

    .line 206
    .line 207
    invoke-direct {v7, v4, v6, v14}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    new-instance v6, Lii;

    .line 215
    .line 216
    const/16 v11, 0x8

    .line 217
    .line 218
    invoke-direct/range {v6 .. v11}, Lii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 219
    .line 220
    .line 221
    move-object v14, v8

    .line 222
    move-object v15, v10

    .line 223
    if-eqz v1, :cond_6

    .line 224
    .line 225
    sget-object v1, Lw79;->e:Ljava/lang/Object;

    .line 226
    .line 227
    const v7, 0x104000b

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    new-instance v7, Ln38;

    .line 235
    .line 236
    const v8, 0x1010313

    .line 237
    .line 238
    .line 239
    invoke-direct {v7, v1, v4, v8, v6}, Ln38;-><init>(Ljava/lang/Object;Ljava/lang/String;ILgn2;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v7}, Lj05;->a(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_6
    sget-object v1, Lo38;->f0:Lo38;

    .line 246
    .line 247
    iget-object v1, v9, Lr68;->a:Lkd8;

    .line 248
    .line 249
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    iget-wide v6, v4, Lh48;->f0:J

    .line 254
    .line 255
    invoke-static {v6, v7}, Lf88;->c(J)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-static {v6, v7}, Lf88;->d(J)I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    sub-int/2addr v4, v6

    .line 264
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-object v1, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 269
    .line 270
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-eq v4, v1, :cond_7

    .line 275
    .line 276
    move v1, v5

    .line 277
    goto :goto_3

    .line 278
    :cond_7
    move v1, v13

    .line 279
    :goto_3
    new-instance v8, Ln30;

    .line 280
    .line 281
    const/4 v4, 0x7

    .line 282
    invoke-direct {v8, v9, v4}, Ln30;-><init>(Lr68;B)V

    .line 283
    .line 284
    .line 285
    new-instance v7, Ln30;

    .line 286
    .line 287
    const/16 v4, 0x8

    .line 288
    .line 289
    invoke-direct {v7, v9, v4}, Ln30;-><init>(Lr68;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    new-instance v6, Lii;

    .line 297
    .line 298
    const/16 v11, 0x8

    .line 299
    .line 300
    sget-object v10, Ls88;->Z:Ls88;

    .line 301
    .line 302
    invoke-direct/range {v6 .. v11}, Lii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 303
    .line 304
    .line 305
    if-eqz v1, :cond_8

    .line 306
    .line 307
    sget-object v1, Lw79;->f:Ljava/lang/Object;

    .line 308
    .line 309
    const v7, 0x104000d

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    new-instance v7, Ln38;

    .line 317
    .line 318
    const v8, 0x101037e

    .line 319
    .line 320
    .line 321
    invoke-direct {v7, v1, v4, v8, v6}, Ln38;-><init>(Ljava/lang/Object;Ljava/lang/String;ILgn2;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v7}, Lj05;->a(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 328
    .line 329
    const/16 v4, 0x1a

    .line 330
    .line 331
    if-lt v1, v4, :cond_a

    .line 332
    .line 333
    sget-object v1, Lo38;->f0:Lo38;

    .line 334
    .line 335
    invoke-virtual {v9}, Lr68;->m()Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-eqz v4, :cond_9

    .line 340
    .line 341
    iget-object v4, v9, Lr68;->a:Lkd8;

    .line 342
    .line 343
    invoke-virtual {v4}, Lkd8;->d()Lh48;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    iget-wide v6, v4, Lh48;->f0:J

    .line 348
    .line 349
    invoke-static {v6, v7}, Lf88;->b(J)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_9

    .line 354
    .line 355
    goto :goto_4

    .line 356
    :cond_9
    move v5, v13

    .line 357
    :goto_4
    new-instance v7, Ln30;

    .line 358
    .line 359
    const/16 v4, 0x9

    .line 360
    .line 361
    invoke-direct {v7, v9, v4}, Ln30;-><init>(Lr68;B)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    new-instance v6, Lii;

    .line 369
    .line 370
    const/16 v11, 0x8

    .line 371
    .line 372
    move-object v8, v14

    .line 373
    move-object v10, v15

    .line 374
    invoke-direct/range {v6 .. v11}, Lii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 375
    .line 376
    .line 377
    if-eqz v5, :cond_a

    .line 378
    .line 379
    iget-object v4, v1, Lo38;->X:Ljava/lang/Object;

    .line 380
    .line 381
    iget v5, v1, Lo38;->Y:I

    .line 382
    .line 383
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    iget v1, v1, Lo38;->Z:I

    .line 388
    .line 389
    new-instance v5, Ln38;

    .line 390
    .line 391
    invoke-direct {v5, v4, v3, v1, v6}, Ln38;-><init>(Ljava/lang/Object;Ljava/lang/String;ILgn2;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v5}, Lj05;->a(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :cond_a
    invoke-virtual {v0, v12}, Lj05;->a(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    return-object v2

    .line 401
    :pswitch_0
    check-cast v0, La23;

    .line 402
    .line 403
    check-cast v4, Lr68;

    .line 404
    .line 405
    check-cast v3, Ls48;

    .line 406
    .line 407
    move-object/from16 v1, p1

    .line 408
    .line 409
    check-cast v1, Lz85;

    .line 410
    .line 411
    invoke-virtual {v0}, La23;->invoke()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    iget-boolean v0, v4, Lr68;->i:Z

    .line 415
    .line 416
    iget-object v6, v4, Lr68;->b:Ly78;

    .line 417
    .line 418
    if-eqz v0, :cond_c

    .line 419
    .line 420
    iget-boolean v0, v4, Lr68;->h:Z

    .line 421
    .line 422
    if-eqz v0, :cond_c

    .line 423
    .line 424
    invoke-virtual {v3}, Ls48;->invoke()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    iget-object v0, v4, Lr68;->a:Lkd8;

    .line 428
    .line 429
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    iget-object v0, v0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 434
    .line 435
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-lez v0, :cond_b

    .line 440
    .line 441
    invoke-virtual {v4, v5}, Lr68;->x(Z)V

    .line 442
    .line 443
    .line 444
    :cond_b
    sget-object v0, Ls88;->X:Ls88;

    .line 445
    .line 446
    invoke-virtual {v4, v0}, Lr68;->y(Ls88;)V

    .line 447
    .line 448
    .line 449
    iget-wide v0, v1, Lz85;->a:J

    .line 450
    .line 451
    invoke-virtual {v6, v0, v1}, Ly78;->a(J)J

    .line 452
    .line 453
    .line 454
    move-result-wide v0

    .line 455
    invoke-static {v6, v0, v1}, Lys7;->c(Ly78;J)J

    .line 456
    .line 457
    .line 458
    move-result-wide v0

    .line 459
    invoke-virtual {v4, v0, v1}, Lr68;->v(J)Z

    .line 460
    .line 461
    .line 462
    :cond_c
    return-object v2

    .line 463
    :pswitch_1
    check-cast v0, Lda6;

    .line 464
    .line 465
    check-cast v4, Lr68;

    .line 466
    .line 467
    check-cast v3, Lda6;

    .line 468
    .line 469
    move-object/from16 v1, p1

    .line 470
    .line 471
    check-cast v1, Lz85;

    .line 472
    .line 473
    invoke-virtual {v4}, Lr68;->k()Ls86;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v1}, Ls86;->c()J

    .line 478
    .line 479
    .line 480
    move-result-wide v6

    .line 481
    invoke-static {v6, v7}, Ln07;->a(J)J

    .line 482
    .line 483
    .line 484
    move-result-wide v6

    .line 485
    iput-wide v6, v0, Lda6;->X:J

    .line 486
    .line 487
    const-wide/16 v6, 0x0

    .line 488
    .line 489
    iput-wide v6, v3, Lda6;->X:J

    .line 490
    .line 491
    invoke-virtual {v4, v5}, Lr68;->w(Z)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4}, Lr68;->q()Ly24;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    if-eqz v1, :cond_d

    .line 499
    .line 500
    invoke-interface {v1, v6, v7}, Ly24;->b(J)J

    .line 501
    .line 502
    .line 503
    move-result-wide v5

    .line 504
    goto :goto_5

    .line 505
    :cond_d
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    :goto_5
    iget-object v1, v4, Lr68;->n:Lrh5;

    .line 511
    .line 512
    new-instance v3, Lz85;

    .line 513
    .line 514
    invoke-direct {v3, v5, v6}, Lz85;-><init>(J)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    sget-object v1, Lev2;->X:Lev2;

    .line 521
    .line 522
    iget-wide v5, v0, Lda6;->X:J

    .line 523
    .line 524
    invoke-virtual {v4, v1, v5, v6}, Lr68;->B(Lev2;J)V

    .line 525
    .line 526
    .line 527
    return-object v2

    .line 528
    :pswitch_2
    check-cast v0, Laa6;

    .line 529
    .line 530
    check-cast v4, Lpl;

    .line 531
    .line 532
    check-cast v3, Lqe7;

    .line 533
    .line 534
    move-object/from16 v1, p1

    .line 535
    .line 536
    check-cast v1, Lpl;

    .line 537
    .line 538
    iget-boolean v2, v0, Laa6;->X:Z

    .line 539
    .line 540
    if-eqz v2, :cond_f

    .line 541
    .line 542
    iget-object v2, v1, Lpl;->a:Ljava/lang/Object;

    .line 543
    .line 544
    iget v5, v1, Lpl;->c:I

    .line 545
    .line 546
    iget v6, v1, Lpl;->b:I

    .line 547
    .line 548
    instance-of v2, v2, Lqe7;

    .line 549
    .line 550
    if-eqz v2, :cond_f

    .line 551
    .line 552
    iget v2, v4, Lpl;->b:I

    .line 553
    .line 554
    if-ne v6, v2, :cond_f

    .line 555
    .line 556
    iget v2, v4, Lpl;->c:I

    .line 557
    .line 558
    if-ne v5, v2, :cond_f

    .line 559
    .line 560
    new-instance v2, Lpl;

    .line 561
    .line 562
    if-nez v3, :cond_e

    .line 563
    .line 564
    new-instance v7, Lqe7;

    .line 565
    .line 566
    const/16 v25, 0x0

    .line 567
    .line 568
    const v26, 0xffff

    .line 569
    .line 570
    .line 571
    const-wide/16 v8, 0x0

    .line 572
    .line 573
    const-wide/16 v10, 0x0

    .line 574
    .line 575
    const/4 v12, 0x0

    .line 576
    const/4 v13, 0x0

    .line 577
    const/4 v14, 0x0

    .line 578
    const/4 v15, 0x0

    .line 579
    const/16 v16, 0x0

    .line 580
    .line 581
    const-wide/16 v17, 0x0

    .line 582
    .line 583
    const/16 v19, 0x0

    .line 584
    .line 585
    const/16 v20, 0x0

    .line 586
    .line 587
    const/16 v21, 0x0

    .line 588
    .line 589
    const-wide/16 v22, 0x0

    .line 590
    .line 591
    const/16 v24, 0x0

    .line 592
    .line 593
    invoke-direct/range {v7 .. v26}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    .line 594
    .line 595
    .line 596
    move-object v3, v7

    .line 597
    :cond_e
    invoke-direct {v2, v6, v5, v3}, Lpl;-><init>(IILjava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    goto :goto_6

    .line 601
    :cond_f
    move-object v2, v1

    .line 602
    :goto_6
    invoke-virtual {v4, v1}, Lpl;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    iput-boolean v1, v0, Laa6;->X:Z

    .line 607
    .line 608
    return-object v2

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

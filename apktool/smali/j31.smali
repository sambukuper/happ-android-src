.class public final Lj31;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lj31;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lj31;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lj31;->X:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    sget-object v4, Ldn8;->a:Ldn8;

    .line 9
    .line 10
    sget-object v5, Lc71;->X:Lc71;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, p0, Lj31;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v7, [Lxe2;

    .line 19
    .line 20
    new-instance p0, Lzk3;

    .line 21
    .line 22
    const/16 v0, 0x1c

    .line 23
    .line 24
    invoke-direct {p0, v7, v0}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lja;

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    invoke-direct {v0, v1, v6}, Lja;-><init>(ILq51;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p1, p0, v0, v7}, Lg33;->k(Lq51;Lze2;Ldn2;Lsn2;[Lxe2;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-ne p0, v5, :cond_0

    .line 38
    .line 39
    move-object v4, p0

    .line 40
    :cond_0
    return-object v4

    .line 41
    :pswitch_0
    instance-of v0, p2, Lch7;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move-object v0, p2

    .line 46
    check-cast v0, Lch7;

    .line 47
    .line 48
    iget v4, v0, Lch7;->g0:I

    .line 49
    .line 50
    and-int v8, v4, v2

    .line 51
    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    sub-int/2addr v4, v2

    .line 55
    iput v4, v0, Lch7;->g0:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v0, Lch7;

    .line 59
    .line 60
    invoke-direct {v0, p0, p2}, Lch7;-><init>(Lj31;Lq51;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget-object p0, v0, Lch7;->f0:Ljava/lang/Object;

    .line 64
    .line 65
    iget p2, v0, Lch7;->g0:I

    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    if-eq p2, v3, :cond_2

    .line 70
    .line 71
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    move-object v5, v6

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lb61;->n()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p0, Laa6;

    .line 87
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    check-cast v7, Llq7;

    .line 92
    .line 93
    new-instance p2, Lte0;

    .line 94
    .line 95
    const/16 v1, 0xd

    .line 96
    .line 97
    invoke-direct {p2, p0, p1, v1}, Lte0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    iput v3, v0, Lch7;->g0:I

    .line 101
    .line 102
    invoke-virtual {v7, p2, v0}, Lu77;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :goto_2
    return-object v5

    .line 106
    :pswitch_1
    instance-of v0, p2, Lj1;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    move-object v0, p2

    .line 111
    check-cast v0, Lj1;

    .line 112
    .line 113
    iget v8, v0, Lj1;->i0:I

    .line 114
    .line 115
    and-int v9, v8, v2

    .line 116
    .line 117
    if-eqz v9, :cond_4

    .line 118
    .line 119
    sub-int/2addr v8, v2

    .line 120
    iput v8, v0, Lj1;->i0:I

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    new-instance v0, Lj1;

    .line 124
    .line 125
    invoke-direct {v0, p0, p2}, Lj1;-><init>(Lj31;Lq51;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    iget-object p0, v0, Lj1;->g0:Ljava/lang/Object;

    .line 129
    .line 130
    iget p2, v0, Lj1;->i0:I

    .line 131
    .line 132
    if-eqz p2, :cond_6

    .line 133
    .line 134
    if-ne p2, v3, :cond_5

    .line 135
    .line 136
    iget-object p1, v0, Lj1;->f0:Lqu6;

    .line 137
    .line 138
    :try_start_0
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    goto :goto_8

    .line 144
    :cond_5
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object v4, v6

    .line 148
    goto :goto_6

    .line 149
    :cond_6
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance p0, Lqu6;

    .line 153
    .line 154
    iget-object p2, v0, Ls51;->Y:Ls61;

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, p1, p2}, Lqu6;-><init>(Lze2;Ls61;)V

    .line 160
    .line 161
    .line 162
    :try_start_1
    iput-object p0, v0, Lj1;->f0:Lqu6;

    .line 163
    .line 164
    iput v3, v0, Lj1;->i0:I

    .line 165
    .line 166
    check-cast v7, Lrn2;

    .line 167
    .line 168
    invoke-interface {v7, p0, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 172
    if-ne p1, v5, :cond_7

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_7
    move-object p1, v4

    .line 176
    :goto_4
    if-ne p1, v5, :cond_8

    .line 177
    .line 178
    move-object v4, v5

    .line 179
    goto :goto_6

    .line 180
    :cond_8
    move-object p1, p0

    .line 181
    :goto_5
    invoke-virtual {p1}, Ls51;->r()V

    .line 182
    .line 183
    .line 184
    :goto_6
    return-object v4

    .line 185
    :goto_7
    move-object v10, p1

    .line 186
    move-object p1, p0

    .line 187
    move-object p0, v10

    .line 188
    goto :goto_8

    .line 189
    :catchall_1
    move-exception p1

    .line 190
    goto :goto_7

    .line 191
    :goto_8
    invoke-virtual {p1}, Ls51;->r()V

    .line 192
    .line 193
    .line 194
    throw p0

    .line 195
    :pswitch_2
    instance-of v0, p2, Lbo4;

    .line 196
    .line 197
    if-eqz v0, :cond_9

    .line 198
    .line 199
    move-object v0, p2

    .line 200
    check-cast v0, Lbo4;

    .line 201
    .line 202
    iget v8, v0, Lbo4;->g0:I

    .line 203
    .line 204
    and-int v9, v8, v2

    .line 205
    .line 206
    if-eqz v9, :cond_9

    .line 207
    .line 208
    sub-int/2addr v8, v2

    .line 209
    iput v8, v0, Lbo4;->g0:I

    .line 210
    .line 211
    goto :goto_9

    .line 212
    :cond_9
    new-instance v0, Lbo4;

    .line 213
    .line 214
    invoke-direct {v0, p0, p2}, Lbo4;-><init>(Lj31;Lq51;)V

    .line 215
    .line 216
    .line 217
    :goto_9
    iget-object p0, v0, Lbo4;->f0:Ljava/lang/Object;

    .line 218
    .line 219
    iget p2, v0, Lbo4;->g0:I

    .line 220
    .line 221
    if-eqz p2, :cond_b

    .line 222
    .line 223
    if-ne p2, v3, :cond_a

    .line 224
    .line 225
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    goto :goto_a

    .line 229
    :cond_a
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    move-object v4, v6

    .line 233
    goto :goto_a

    .line 234
    :cond_b
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    check-cast v7, Lo;

    .line 238
    .line 239
    new-instance p0, Ln;

    .line 240
    .line 241
    const/16 p2, 0x13

    .line 242
    .line 243
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 244
    .line 245
    .line 246
    iput v3, v0, Lbo4;->g0:I

    .line 247
    .line 248
    invoke-virtual {v7, p0, v0}, Lo;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    if-ne p0, v5, :cond_c

    .line 253
    .line 254
    move-object v4, v5

    .line 255
    :cond_c
    :goto_a
    return-object v4

    .line 256
    :pswitch_3
    instance-of v0, p2, Lql4;

    .line 257
    .line 258
    if-eqz v0, :cond_d

    .line 259
    .line 260
    move-object v0, p2

    .line 261
    check-cast v0, Lql4;

    .line 262
    .line 263
    iget v8, v0, Lql4;->g0:I

    .line 264
    .line 265
    and-int v9, v8, v2

    .line 266
    .line 267
    if-eqz v9, :cond_d

    .line 268
    .line 269
    sub-int/2addr v8, v2

    .line 270
    iput v8, v0, Lql4;->g0:I

    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_d
    new-instance v0, Lql4;

    .line 274
    .line 275
    invoke-direct {v0, p0, p2}, Lql4;-><init>(Lj31;Lq51;)V

    .line 276
    .line 277
    .line 278
    :goto_b
    iget-object p0, v0, Lql4;->f0:Ljava/lang/Object;

    .line 279
    .line 280
    iget p2, v0, Lql4;->g0:I

    .line 281
    .line 282
    if-eqz p2, :cond_f

    .line 283
    .line 284
    if-ne p2, v3, :cond_e

    .line 285
    .line 286
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_c

    .line 290
    :cond_e
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    move-object v4, v6

    .line 294
    goto :goto_c

    .line 295
    :cond_f
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    check-cast v7, Lo;

    .line 299
    .line 300
    new-instance p0, Ln;

    .line 301
    .line 302
    const/16 p2, 0x10

    .line 303
    .line 304
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 305
    .line 306
    .line 307
    iput v3, v0, Lql4;->g0:I

    .line 308
    .line 309
    invoke-virtual {v7, p0, v0}, Lo;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    if-ne p0, v5, :cond_10

    .line 314
    .line 315
    move-object v4, v5

    .line 316
    :cond_10
    :goto_c
    return-object v4

    .line 317
    :pswitch_4
    instance-of v0, p2, Lvf2;

    .line 318
    .line 319
    if-eqz v0, :cond_11

    .line 320
    .line 321
    move-object v0, p2

    .line 322
    check-cast v0, Lvf2;

    .line 323
    .line 324
    iget v8, v0, Lvf2;->g0:I

    .line 325
    .line 326
    and-int v9, v8, v2

    .line 327
    .line 328
    if-eqz v9, :cond_11

    .line 329
    .line 330
    sub-int/2addr v8, v2

    .line 331
    iput v8, v0, Lvf2;->g0:I

    .line 332
    .line 333
    goto :goto_d

    .line 334
    :cond_11
    new-instance v0, Lvf2;

    .line 335
    .line 336
    invoke-direct {v0, p0, p2}, Lvf2;-><init>(Lj31;Lq51;)V

    .line 337
    .line 338
    .line 339
    :goto_d
    iget-object p0, v0, Lvf2;->f0:Ljava/lang/Object;

    .line 340
    .line 341
    iget p2, v0, Lvf2;->g0:I

    .line 342
    .line 343
    if-eqz p2, :cond_13

    .line 344
    .line 345
    if-ne p2, v3, :cond_12

    .line 346
    .line 347
    iget-object p1, v0, Lvf2;->i0:Ljava/lang/Object;

    .line 348
    .line 349
    :try_start_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catch Lh; {:try_start_2 .. :try_end_2} :catch_0

    .line 350
    .line 351
    .line 352
    goto :goto_f

    .line 353
    :catch_0
    move-exception p0

    .line 354
    goto :goto_e

    .line 355
    :cond_12
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    move-object v4, v6

    .line 359
    goto :goto_f

    .line 360
    :cond_13
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    new-instance p0, Ljava/lang/Object;

    .line 364
    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 366
    .line 367
    .line 368
    new-instance p2, Lca6;

    .line 369
    .line 370
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 371
    .line 372
    .line 373
    :try_start_3
    check-cast v7, Lo;

    .line 374
    .line 375
    new-instance v1, Lzj;

    .line 376
    .line 377
    const/4 v2, 0x4

    .line 378
    invoke-direct {v1, p2, p1, p0, v2}, Lzj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 379
    .line 380
    .line 381
    iput-object p0, v0, Lvf2;->i0:Ljava/lang/Object;

    .line 382
    .line 383
    iput v3, v0, Lvf2;->g0:I

    .line 384
    .line 385
    invoke-virtual {v7, v1, v0}, Lo;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object p0
    :try_end_3
    .catch Lh; {:try_start_3 .. :try_end_3} :catch_1

    .line 389
    if-ne p0, v5, :cond_14

    .line 390
    .line 391
    move-object v4, v5

    .line 392
    goto :goto_f

    .line 393
    :catch_1
    move-exception p1

    .line 394
    move-object v10, p1

    .line 395
    move-object p1, p0

    .line 396
    move-object p0, v10

    .line 397
    :goto_e
    iget-object p2, p0, Lh;->X:Ljava/lang/Object;

    .line 398
    .line 399
    if-ne p2, p1, :cond_15

    .line 400
    .line 401
    :cond_14
    :goto_f
    return-object v4

    .line 402
    :cond_15
    throw p0

    .line 403
    :pswitch_5
    instance-of v0, p2, Ldf2;

    .line 404
    .line 405
    if-eqz v0, :cond_16

    .line 406
    .line 407
    move-object v0, p2

    .line 408
    check-cast v0, Ldf2;

    .line 409
    .line 410
    iget v8, v0, Ldf2;->g0:I

    .line 411
    .line 412
    and-int v9, v8, v2

    .line 413
    .line 414
    if-eqz v9, :cond_16

    .line 415
    .line 416
    sub-int/2addr v8, v2

    .line 417
    iput v8, v0, Ldf2;->g0:I

    .line 418
    .line 419
    goto :goto_10

    .line 420
    :cond_16
    new-instance v0, Ldf2;

    .line 421
    .line 422
    invoke-direct {v0, p0, p2}, Ldf2;-><init>(Lj31;Lq51;)V

    .line 423
    .line 424
    .line 425
    :goto_10
    iget-object p0, v0, Ldf2;->f0:Ljava/lang/Object;

    .line 426
    .line 427
    iget p2, v0, Ldf2;->g0:I

    .line 428
    .line 429
    if-eqz p2, :cond_18

    .line 430
    .line 431
    if-ne p2, v3, :cond_17

    .line 432
    .line 433
    iget p1, v0, Ldf2;->l0:I

    .line 434
    .line 435
    iget p2, v0, Ldf2;->k0:I

    .line 436
    .line 437
    iget-object v1, v0, Ldf2;->j0:Ljava/util/Iterator;

    .line 438
    .line 439
    iget-object v2, v0, Ldf2;->i0:Lze2;

    .line 440
    .line 441
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    move p0, p2

    .line 445
    move p2, p1

    .line 446
    move-object p1, v2

    .line 447
    goto :goto_11

    .line 448
    :cond_17
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    move-object v4, v6

    .line 452
    goto :goto_12

    .line 453
    :cond_18
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    check-cast v7, Lkf3;

    .line 457
    .line 458
    invoke-virtual {v7}, Lif3;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    const/4 p2, 0x0

    .line 463
    move-object v1, p0

    .line 464
    move p0, p2

    .line 465
    :cond_19
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-eqz v2, :cond_1a

    .line 470
    .line 471
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, Ljava/lang/Number;

    .line 476
    .line 477
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    new-instance v6, Ljava/lang/Integer;

    .line 482
    .line 483
    invoke-direct {v6, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 484
    .line 485
    .line 486
    iput-object p1, v0, Ldf2;->i0:Lze2;

    .line 487
    .line 488
    iput-object v1, v0, Ldf2;->j0:Ljava/util/Iterator;

    .line 489
    .line 490
    iput p0, v0, Ldf2;->k0:I

    .line 491
    .line 492
    iput p2, v0, Ldf2;->l0:I

    .line 493
    .line 494
    iput v3, v0, Ldf2;->g0:I

    .line 495
    .line 496
    invoke-interface {p1, v6, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    if-ne v2, v5, :cond_19

    .line 501
    .line 502
    move-object v4, v5

    .line 503
    :cond_1a
    :goto_12
    return-object v4

    .line 504
    :pswitch_6
    new-instance p0, Lr0;

    .line 505
    .line 506
    check-cast v7, Lif2;

    .line 507
    .line 508
    const/16 v0, 0x15

    .line 509
    .line 510
    invoke-direct {p0, v7, p1, v6, v0}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 511
    .line 512
    .line 513
    new-instance p1, Laf2;

    .line 514
    .line 515
    invoke-interface {p2}, Lq51;->w()Ls61;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-direct {p1, p2, v0}, Lfx6;-><init>(Lq51;Ls61;)V

    .line 520
    .line 521
    .line 522
    invoke-static {p1, v3, p1, p0}, Lz38;->d(Lfx6;ZLjava/lang/Object;Lrn2;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    if-ne p0, v5, :cond_1b

    .line 527
    .line 528
    move-object v4, p0

    .line 529
    :cond_1b
    return-object v4

    .line 530
    :pswitch_7
    instance-of v0, p2, Ldc2;

    .line 531
    .line 532
    if-eqz v0, :cond_1c

    .line 533
    .line 534
    move-object v0, p2

    .line 535
    check-cast v0, Ldc2;

    .line 536
    .line 537
    iget v8, v0, Ldc2;->g0:I

    .line 538
    .line 539
    and-int v9, v8, v2

    .line 540
    .line 541
    if-eqz v9, :cond_1c

    .line 542
    .line 543
    sub-int/2addr v8, v2

    .line 544
    iput v8, v0, Ldc2;->g0:I

    .line 545
    .line 546
    goto :goto_13

    .line 547
    :cond_1c
    new-instance v0, Ldc2;

    .line 548
    .line 549
    invoke-direct {v0, p0, p2}, Ldc2;-><init>(Lj31;Lq51;)V

    .line 550
    .line 551
    .line 552
    :goto_13
    iget-object p0, v0, Ldc2;->f0:Ljava/lang/Object;

    .line 553
    .line 554
    iget p2, v0, Ldc2;->g0:I

    .line 555
    .line 556
    if-eqz p2, :cond_1e

    .line 557
    .line 558
    if-ne p2, v3, :cond_1d

    .line 559
    .line 560
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    goto :goto_14

    .line 564
    :cond_1d
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    move-object v4, v6

    .line 568
    goto :goto_14

    .line 569
    :cond_1e
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    check-cast v7, Lcc2;

    .line 573
    .line 574
    new-instance p0, Ln;

    .line 575
    .line 576
    const/4 p2, 0x6

    .line 577
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 578
    .line 579
    .line 580
    iput v3, v0, Ldc2;->g0:I

    .line 581
    .line 582
    invoke-virtual {v7, p0, v0}, Lcc2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    if-ne p0, v5, :cond_1f

    .line 587
    .line 588
    move-object v4, v5

    .line 589
    :cond_1f
    :goto_14
    return-object v4

    .line 590
    :pswitch_8
    check-cast v7, Lsf2;

    .line 591
    .line 592
    new-instance p0, Ln;

    .line 593
    .line 594
    invoke-direct {p0, p1, v3}, Ln;-><init>(Lze2;B)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v7, p0, p2}, Lsf2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    if-ne p0, v5, :cond_20

    .line 602
    .line 603
    move-object v4, p0

    .line 604
    :cond_20
    return-object v4

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
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

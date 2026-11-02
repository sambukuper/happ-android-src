.class public final Lo91;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu06;


# instance fields
.field public final X:Ll91;

.field public final Y:Ln91;

.field public final Z:Lt5;

.field public final f0:B


# direct methods
.method public constructor <init>(Ll91;Ln91;Lt5;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo91;->X:Ll91;

    .line 5
    .line 6
    iput-object p2, p0, Lo91;->Y:Ln91;

    .line 7
    .line 8
    iput-object p3, p0, Lo91;->Z:Lt5;

    .line 9
    .line 10
    iput-byte p4, p0, Lo91;->f0:B

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lo91;->X:Ll91;

    .line 3
    .line 4
    iget-object v2, p0, Lo91;->Z:Lt5;

    .line 5
    .line 6
    iget-object v3, p0, Lo91;->Y:Ln91;

    .line 7
    .line 8
    iget-byte p0, p0, Lo91;->f0:B

    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/AssertionError;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(I)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :pswitch_0
    iget-object p0, v2, Lt5;->X:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljq8;

    .line 22
    .line 23
    iget-object p0, p0, Ljq8;->c:Lh57;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    new-instance p0, Lor8;

    .line 27
    .line 28
    iget-object v0, v3, Ln91;->k:Lu06;

    .line 29
    .line 30
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lpr8;

    .line 35
    .line 36
    iget-object v1, v1, Ll91;->a:Lfu6;

    .line 37
    .line 38
    iget-object v1, v1, Lfu6;->f0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lrj0;

    .line 41
    .line 42
    invoke-static {v1}, Lhi5;->R(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, v3, Ln91;->j:Lu06;

    .line 46
    .line 47
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lik0;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lik0;->a()Li26;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const-class v4, Landroidx/camera/camera2/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Li26;->a(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    const-class v4, Landroidx/camera/camera2/compat/quirk/PreviewOrientationIncorrectQuirk;

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Li26;->a(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_1

    .line 75
    .line 76
    const-class v4, Landroidx/camera/camera2/compat/quirk/TextureViewIsClosedQuirk;

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Li26;->a(Ljava/lang/Class;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    sget-object v3, Llh4;->j0:Llh4;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    :goto_0
    new-instance v3, Le93;

    .line 89
    .line 90
    invoke-direct {v3}, Le93;-><init>()V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v2, v2, Lt5;->k0:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Lu06;

    .line 96
    .line 97
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lh57;

    .line 102
    .line 103
    invoke-direct {p0, v0, v1, v3, v2}, Lor8;-><init>(Lpr8;Lrj0;Lc93;Lh57;)V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_2
    new-instance p0, Lin0;

    .line 108
    .line 109
    iget-object v0, v3, Ln91;->e:Lu06;

    .line 110
    .line 111
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lqj0;

    .line 116
    .line 117
    iget-object v1, v2, Lt5;->h0:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lu06;

    .line 120
    .line 121
    iget-object v2, v3, Ln91;->k:Lu06;

    .line 122
    .line 123
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Lpr8;

    .line 128
    .line 129
    iget-object v3, v3, Ln91;->q:Lu06;

    .line 130
    .line 131
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Luc8;

    .line 136
    .line 137
    invoke-direct {p0, v0, v1, v2, v3}, Lin0;-><init>(Lqj0;Lv06;Lpr8;Luc8;)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_3
    new-instance p0, Lbr8;

    .line 142
    .line 143
    iget-object v0, v2, Lt5;->Y:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lu06;

    .line 146
    .line 147
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljr8;

    .line 152
    .line 153
    invoke-virtual {v3}, Ln91;->a()Lk28;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-direct {p0, v0, v1}, Lbr8;-><init>(Ljr8;Lk28;)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_4
    new-instance p0, Lzm0;

    .line 162
    .line 163
    iget-object v0, v3, Ln91;->e:Lu06;

    .line 164
    .line 165
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Lqj0;

    .line 170
    .line 171
    iget-object v1, v2, Lt5;->Y:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Lu06;

    .line 174
    .line 175
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Ljr8;

    .line 180
    .line 181
    iget-object v2, v3, Ln91;->f:Lu06;

    .line 182
    .line 183
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Lt79;

    .line 188
    .line 189
    iget-object v4, v3, Ln91;->k:Lu06;

    .line 190
    .line 191
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    check-cast v4, Lpr8;

    .line 196
    .line 197
    invoke-virtual {v3}, Ln91;->a()Lk28;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    .line 214
    .line 215
    sget-object v1, Ljj0;->h:Lij0;

    .line 216
    .line 217
    iget-object v0, v0, Lqj0;->b:Ljj0;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {v0}, Lij0;->c(Ljj0;)Z

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_5
    move-object p0, v2

    .line 227
    new-instance v2, Lhn0;

    .line 228
    .line 229
    iget-object v0, p0, Lt5;->f0:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, Lu06;

    .line 232
    .line 233
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Lzm0;

    .line 238
    .line 239
    iget-object v1, v3, Ln91;->r:Lu06;

    .line 240
    .line 241
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    move-object v4, v1

    .line 246
    check-cast v4, Lpd2;

    .line 247
    .line 248
    iget-object v1, v3, Ln91;->q:Lu06;

    .line 249
    .line 250
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    move-object v5, v1

    .line 255
    check-cast v5, Luc8;

    .line 256
    .line 257
    iget-object v1, v3, Ln91;->u:Lu06;

    .line 258
    .line 259
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    move-object v6, v1

    .line 264
    check-cast v6, Lnv8;

    .line 265
    .line 266
    iget-object v1, v3, Ln91;->k:Lu06;

    .line 267
    .line 268
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    move-object v7, v1

    .line 273
    check-cast v7, Lpr8;

    .line 274
    .line 275
    iget-object v1, v3, Ln91;->m:Lu06;

    .line 276
    .line 277
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    move-object v8, v1

    .line 282
    check-cast v8, Llx0;

    .line 283
    .line 284
    iget-object v1, v3, Ln91;->j:Lu06;

    .line 285
    .line 286
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Lik0;

    .line 291
    .line 292
    iget-object v9, v3, Ln91;->c:Ll91;

    .line 293
    .line 294
    invoke-virtual {v9}, Ll91;->a()Lzh0;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    iget-object v10, v3, Ln91;->E:Lu06;

    .line 299
    .line 300
    invoke-interface {v10}, Lv06;->get()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    check-cast v10, Lbh3;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1}, Lik0;->a()Li26;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    const-class v12, Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;

    .line 317
    .line 318
    invoke-virtual {v11, v12}, Li26;->a(Ljava/lang/Class;)Z

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-eqz v11, :cond_2

    .line 323
    .line 324
    new-instance v11, Llr5;

    .line 325
    .line 326
    invoke-direct {v11, v1, v9, v10}, Llr5;-><init>(Lik0;Lzh0;Lbh3;)V

    .line 327
    .line 328
    .line 329
    :goto_2
    move-object v9, v11

    .line 330
    goto :goto_3

    .line 331
    :cond_2
    sget-object v11, Lqe4;->k0:Lqe4;

    .line 332
    .line 333
    goto :goto_2

    .line 334
    :goto_3
    iget-object v1, v3, Ln91;->e:Lu06;

    .line 335
    .line 336
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    move-object v10, v1

    .line 341
    check-cast v10, Lqj0;

    .line 342
    .line 343
    iget-object v1, p0, Lt5;->g0:Ljava/lang/Object;

    .line 344
    .line 345
    move-object v11, v1

    .line 346
    check-cast v11, Lu06;

    .line 347
    .line 348
    iget-object p0, p0, Lt5;->Y:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p0, Lu06;

    .line 351
    .line 352
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    move-object v12, p0

    .line 357
    check-cast v12, Ljr8;

    .line 358
    .line 359
    move-object v3, v0

    .line 360
    invoke-direct/range {v2 .. v12}, Lhn0;-><init>(Lzm0;Lpd2;Luc8;Lnv8;Lpr8;Llx0;Lrr8;Lqj0;Lv06;Ljr8;)V

    .line 361
    .line 362
    .line 363
    return-object v2

    .line 364
    :pswitch_6
    move-object p0, v2

    .line 365
    iget-object v0, p0, Lt5;->h0:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Lu06;

    .line 368
    .line 369
    iget-object p0, p0, Lt5;->i0:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast p0, Lu06;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    sget-boolean v1, Lin0;->c:Z

    .line 380
    .line 381
    if-eqz v1, :cond_3

    .line 382
    .line 383
    invoke-interface {p0}, Lv06;->get()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    check-cast p0, Len0;

    .line 391
    .line 392
    return-object p0

    .line 393
    :cond_3
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    check-cast p0, Len0;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_7
    move-object p0, v2

    .line 404
    new-instance v0, Lwq8;

    .line 405
    .line 406
    iget-object v2, p0, Lt5;->j0:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v2, Lu06;

    .line 409
    .line 410
    iget-object v4, p0, Lt5;->g0:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v4, Lu06;

    .line 413
    .line 414
    iget-object v5, p0, Lt5;->Y:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v5, Lu06;

    .line 417
    .line 418
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    check-cast v5, Ljr8;

    .line 423
    .line 424
    iget-object p0, p0, Lt5;->l0:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast p0, Lu06;

    .line 427
    .line 428
    iget-object v3, v3, Ln91;->k:Lu06;

    .line 429
    .line 430
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    check-cast v3, Lpr8;

    .line 435
    .line 436
    iget-object v1, v1, Ll91;->a:Lfu6;

    .line 437
    .line 438
    iget-object v1, v1, Lfu6;->i0:Ljava/lang/Object;

    .line 439
    .line 440
    move-object v6, v1

    .line 441
    check-cast v6, Lbm0;

    .line 442
    .line 443
    move-object v1, v5

    .line 444
    move-object v5, v3

    .line 445
    move-object v3, v1

    .line 446
    move-object v1, v2

    .line 447
    move-object v2, v4

    .line 448
    move-object v4, p0

    .line 449
    invoke-direct/range {v0 .. v6}, Lwq8;-><init>(Lv06;Lv06;Ljr8;Lv06;Lpr8;Lbm0;)V

    .line 450
    .line 451
    .line 452
    return-object v0

    .line 453
    :pswitch_8
    move-object p0, v2

    .line 454
    new-instance v0, Lgh1;

    .line 455
    .line 456
    iget-object p0, p0, Lt5;->m0:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast p0, Lu06;

    .line 459
    .line 460
    iget-object v1, v3, Ln91;->k:Lu06;

    .line 461
    .line 462
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, Lpr8;

    .line 467
    .line 468
    invoke-direct {v0, p0, v1}, Lgh1;-><init>(Lv06;Lpr8;)V

    .line 469
    .line 470
    .line 471
    return-object v0

    .line 472
    :pswitch_9
    move-object p0, v2

    .line 473
    iget-object p0, p0, Lt5;->X:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast p0, Ljq8;

    .line 476
    .line 477
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_a
    move-object p0, v2

    .line 482
    iget-object p0, p0, Lt5;->X:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast p0, Ljq8;

    .line 485
    .line 486
    iget-object v0, v3, Ln91;->y:Lu06;

    .line 487
    .line 488
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    check-cast v0, Lok0;

    .line 493
    .line 494
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    const-string v1, "CXCP"

    .line 501
    .line 502
    invoke-static {v1}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 503
    .line 504
    .line 505
    new-instance v1, Liq8;

    .line 506
    .line 507
    const/4 v2, 0x0

    .line 508
    invoke-direct {v1, p0, v2}, Liq8;-><init>(Ljq8;B)V

    .line 509
    .line 510
    .line 511
    new-instance v2, Liq8;

    .line 512
    .line 513
    const/4 v3, 0x1

    .line 514
    invoke-direct {v2, p0, v3}, Liq8;-><init>(Ljq8;B)V

    .line 515
    .line 516
    .line 517
    iget-object p0, p0, Ljq8;->b:Lst2;

    .line 518
    .line 519
    new-instance v3, Ljr8;

    .line 520
    .line 521
    invoke-direct {v3, v1, v0, p0, v2}, Ljr8;-><init>(Liq8;Lok0;Lst2;Liq8;)V

    .line 522
    .line 523
    .line 524
    return-object v3

    .line 525
    :pswitch_b
    move-object p0, v2

    .line 526
    new-instance v4, Lnq8;

    .line 527
    .line 528
    iget-object v1, p0, Lt5;->Y:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v1, Lu06;

    .line 531
    .line 532
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    move-object v5, v1

    .line 537
    check-cast v5, Ljr8;

    .line 538
    .line 539
    iget-object v1, v3, Ln91;->k:Lu06;

    .line 540
    .line 541
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    move-object v6, v1

    .line 546
    check-cast v6, Lpr8;

    .line 547
    .line 548
    iget-object v1, p0, Lt5;->Z:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v1, Lu06;

    .line 551
    .line 552
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    if-nez v1, :cond_4

    .line 557
    .line 558
    iget-object v0, p0, Lt5;->n0:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, Lu06;

    .line 561
    .line 562
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    move-object v7, v0

    .line 567
    check-cast v7, Lqq8;

    .line 568
    .line 569
    iget-object v0, p0, Lt5;->l0:Ljava/lang/Object;

    .line 570
    .line 571
    move-object v8, v0

    .line 572
    check-cast v8, Lu06;

    .line 573
    .line 574
    iget-object v0, p0, Lt5;->k0:Ljava/lang/Object;

    .line 575
    .line 576
    move-object v9, v0

    .line 577
    check-cast v9, Lu06;

    .line 578
    .line 579
    iget-object p0, p0, Lt5;->j0:Ljava/lang/Object;

    .line 580
    .line 581
    move-object v10, p0

    .line 582
    check-cast v10, Lu06;

    .line 583
    .line 584
    invoke-direct/range {v4 .. v10}, Lnq8;-><init>(Ljr8;Lpr8;Lqq8;Lv06;Lv06;Lv06;)V

    .line 585
    .line 586
    .line 587
    return-object v4

    .line 588
    :cond_4
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 589
    .line 590
    .line 591
    return-object v0

    .line 592
    nop

    .line 593
    :pswitch_data_0
    .packed-switch 0x0
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

.class public final Lj70;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu4;
.implements Lu06;


# instance fields
.field public final X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lj70;->X:B

    .line 2
    .line 3
    iput-object p2, p0, Lj70;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 9
    iput-object p1, p0, Lj70;->Y:Ljava/lang/Object;

    iput-byte p2, p0, Lj70;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lj70;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget-byte p0, p0, Lj70;->X:B

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public get()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj70;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lr91;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    iget-byte v0, v0, Lj70;->X:B

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(I)V

    .line 17
    .line 18
    .line 19
    throw v1

    .line 20
    :pswitch_0
    new-instance v0, Lj11;

    .line 21
    .line 22
    invoke-direct {v0}, Lj11;-><init>()V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Ljl0;

    .line 27
    .line 28
    invoke-direct {v0}, Ljl0;-><init>()V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 36
    .line 37
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ls98;

    .line 42
    .line 43
    iget-object v1, v1, Lr91;->w:Lu06;

    .line 44
    .line 45
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Log0;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v0, Lyj0;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_3
    new-instance v0, Lbg0;

    .line 64
    .line 65
    iget-object v2, v1, Lr91;->f:Lu06;

    .line 66
    .line 67
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ls98;

    .line 72
    .line 73
    iget-object v3, v1, Lr91;->p:Lu06;

    .line 74
    .line 75
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljg0;

    .line 80
    .line 81
    iget-object v1, v1, Lr91;->s:Lu06;

    .line 82
    .line 83
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lhk6;

    .line 88
    .line 89
    invoke-direct {v0, v2, v3, v1}, Lbg0;-><init>(Ls98;Ljg0;Lhk6;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_4
    new-instance v0, Lpw;

    .line 94
    .line 95
    iget-object v2, v1, Lr91;->f:Lu06;

    .line 96
    .line 97
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Ls98;

    .line 102
    .line 103
    iget-object v3, v1, Lr91;->e:Lu06;

    .line 104
    .line 105
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lwj0;

    .line 110
    .line 111
    iget-object v1, v1, Lr91;->d:Lu06;

    .line 112
    .line 113
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lbm3;

    .line 118
    .line 119
    invoke-direct {v0, v2, v3, v1}, Lpw;-><init>(Ls98;Lwj0;Lbm3;)V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_5
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "device_policy"

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-instance v1, Led;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast v0, Landroid/app/admin/DevicePolicyManager;

    .line 139
    .line 140
    invoke-direct {v1, v0}, Led;-><init>(Landroid/app/admin/DevicePolicyManager;)V

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    :pswitch_6
    iget-object v0, v1, Lr91;->a:Lwl6;

    .line 145
    .line 146
    new-instance v0, Ltl7;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_7
    new-instance v0, Ljg0;

    .line 153
    .line 154
    iget-object v2, v1, Lr91;->n:Lu06;

    .line 155
    .line 156
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Lig0;

    .line 161
    .line 162
    iget-object v1, v1, Lr91;->o:Lu06;

    .line 163
    .line 164
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Ltl7;

    .line 169
    .line 170
    invoke-direct {v0, v2, v1}, Ljg0;-><init>(Lig0;Ltl7;)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_8
    new-instance v3, Lhk6;

    .line 175
    .line 176
    new-instance v4, Ld6;

    .line 177
    .line 178
    new-instance v5, Ldq;

    .line 179
    .line 180
    iget-object v0, v1, Lr91;->g:Lu06;

    .line 181
    .line 182
    iget-object v2, v1, Lr91;->a:Lwl6;

    .line 183
    .line 184
    iget-object v6, v1, Lr91;->f:Lu06;

    .line 185
    .line 186
    invoke-interface {v6}, Lv06;->get()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    check-cast v6, Ls98;

    .line 191
    .line 192
    invoke-direct {v5, v0, v6}, Ldq;-><init>(Lv06;Ls98;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, v1, Lr91;->n:Lu06;

    .line 196
    .line 197
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    move-object v6, v0

    .line 202
    check-cast v6, Lig0;

    .line 203
    .line 204
    iget-object v0, v1, Lr91;->i:Lu06;

    .line 205
    .line 206
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move-object v7, v0

    .line 211
    check-cast v7, Leg0;

    .line 212
    .line 213
    iget-object v0, v1, Lr91;->p:Lu06;

    .line 214
    .line 215
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    move-object v8, v0

    .line 220
    check-cast v8, Ljg0;

    .line 221
    .line 222
    iget-object v0, v1, Lr91;->m:Lu06;

    .line 223
    .line 224
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    move-object v9, v0

    .line 229
    check-cast v9, Lu08;

    .line 230
    .line 231
    iget-object v0, v2, Lwl6;->Y:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Lnj0;

    .line 234
    .line 235
    iget-object v10, v0, Lnj0;->e:Llj0;

    .line 236
    .line 237
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 238
    .line 239
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    move-object v11, v0

    .line 244
    check-cast v11, Ls98;

    .line 245
    .line 246
    invoke-direct/range {v4 .. v11}, Ld6;-><init>(Ldq;Lig0;Leg0;Ljg0;Lu08;Llj0;Ls98;)V

    .line 247
    .line 248
    .line 249
    iget-object v0, v1, Lr91;->i:Lu06;

    .line 250
    .line 251
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    move-object v5, v0

    .line 256
    check-cast v5, Leg0;

    .line 257
    .line 258
    new-instance v6, Lz47;

    .line 259
    .line 260
    iget-object v0, v1, Lr91;->g:Lu06;

    .line 261
    .line 262
    iget-object v7, v1, Lr91;->f:Lu06;

    .line 263
    .line 264
    invoke-interface {v7}, Lv06;->get()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    check-cast v7, Ls98;

    .line 269
    .line 270
    iget-object v8, v1, Lr91;->d:Lu06;

    .line 271
    .line 272
    invoke-interface {v8}, Lv06;->get()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Lbm3;

    .line 277
    .line 278
    invoke-direct {v6, v0, v7, v8}, Lz47;-><init>(Lv06;Ls98;Lbm3;)V

    .line 279
    .line 280
    .line 281
    iget-object v0, v1, Lr91;->m:Lu06;

    .line 282
    .line 283
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    move-object v7, v0

    .line 288
    check-cast v7, Lu08;

    .line 289
    .line 290
    iget-object v0, v1, Lr91;->q:Lu06;

    .line 291
    .line 292
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    move-object v8, v0

    .line 297
    check-cast v8, Led;

    .line 298
    .line 299
    iget-object v0, v1, Lr91;->r:Lu06;

    .line 300
    .line 301
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    move-object v9, v0

    .line 306
    check-cast v9, Lpw;

    .line 307
    .line 308
    iget-object v0, v2, Lwl6;->Y:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Lnj0;

    .line 311
    .line 312
    iget-object v10, v0, Lnj0;->e:Llj0;

    .line 313
    .line 314
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 315
    .line 316
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    move-object v11, v0

    .line 321
    check-cast v11, Ls98;

    .line 322
    .line 323
    invoke-direct/range {v3 .. v11}, Lhk6;-><init>(Ld6;Leg0;Lz47;Lu08;Led;Lpw;Llj0;Ls98;)V

    .line 324
    .line 325
    .line 326
    return-object v3

    .line 327
    :pswitch_9
    new-instance v4, Ls16;

    .line 328
    .line 329
    iget-object v0, v1, Lr91;->l:Lu06;

    .line 330
    .line 331
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object v5, v0

    .line 336
    check-cast v5, Lhl5;

    .line 337
    .line 338
    iget-object v0, v1, Lr91;->s:Lu06;

    .line 339
    .line 340
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    move-object v6, v0

    .line 345
    check-cast v6, Lhk6;

    .line 346
    .line 347
    iget-object v0, v1, Lr91;->t:Lu06;

    .line 348
    .line 349
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    move-object v7, v0

    .line 354
    check-cast v7, Lbg0;

    .line 355
    .line 356
    iget-object v0, v1, Lr91;->i:Lu06;

    .line 357
    .line 358
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    move-object v8, v0

    .line 363
    check-cast v8, Leg0;

    .line 364
    .line 365
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 366
    .line 367
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    move-object v9, v0

    .line 372
    check-cast v9, Ls98;

    .line 373
    .line 374
    invoke-direct/range {v4 .. v9}, Ls16;-><init>(Lhl5;Lhk6;Lbg0;Leg0;Ls98;)V

    .line 375
    .line 376
    .line 377
    return-object v4

    .line 378
    :pswitch_a
    new-instance v0, Lu08;

    .line 379
    .line 380
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 381
    .line 382
    .line 383
    return-object v0

    .line 384
    :pswitch_b
    new-instance v0, Lhl5;

    .line 385
    .line 386
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-direct {v0, v1}, Lhl5;-><init>(Landroid/content/Context;)V

    .line 391
    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_c
    new-instance v2, Lhg0;

    .line 395
    .line 396
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    iget-object v0, v1, Lr91;->f:Lu06;

    .line 401
    .line 402
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    move-object v4, v0

    .line 407
    check-cast v4, Ls98;

    .line 408
    .line 409
    iget-object v0, v1, Lr91;->l:Lu06;

    .line 410
    .line 411
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    move-object v5, v0

    .line 416
    check-cast v5, Lhl5;

    .line 417
    .line 418
    iget-object v0, v1, Lr91;->a:Lwl6;

    .line 419
    .line 420
    iget-object v0, v0, Lwl6;->Y:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v0, Lnj0;

    .line 423
    .line 424
    iget-object v6, v0, Lnj0;->c:Lmj0;

    .line 425
    .line 426
    iget-object v0, v1, Lr91;->m:Lu06;

    .line 427
    .line 428
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    move-object v7, v0

    .line 433
    check-cast v7, Lu08;

    .line 434
    .line 435
    invoke-direct/range {v2 .. v7}, Lhg0;-><init>(Landroid/content/Context;Ls98;Lhl5;Lmj0;Lu08;)V

    .line 436
    .line 437
    .line 438
    return-object v2

    .line 439
    :pswitch_d
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    new-instance v1, Lxh0;

    .line 444
    .line 445
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 446
    .line 447
    .line 448
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 449
    .line 450
    const/16 v5, 0x23

    .line 451
    .line 452
    if-lt v4, v5, :cond_0

    .line 453
    .line 454
    new-instance v4, Lgf0;

    .line 455
    .line 456
    invoke-direct {v4, v0}, Lgf0;-><init>(Landroid/content/Context;)V

    .line 457
    .line 458
    .line 459
    iput-object v4, v1, Lxh0;->b:Lgf0;

    .line 460
    .line 461
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    const/16 v6, 0x84

    .line 470
    .line 471
    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 472
    .line 473
    .line 474
    move-result-object v4
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 475
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 476
    .line 477
    if-nez v4, :cond_1

    .line 478
    .line 479
    goto :goto_2

    .line 480
    :cond_1
    array-length v5, v4

    .line 481
    move-object v6, v3

    .line 482
    :goto_0
    if-ge v2, v5, :cond_5

    .line 483
    .line 484
    aget-object v7, v4, v2

    .line 485
    .line 486
    iget-object v7, v7, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 487
    .line 488
    if-nez v7, :cond_2

    .line 489
    .line 490
    goto :goto_1

    .line 491
    :cond_2
    const-string v8, "androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY"

    .line 492
    .line 493
    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    if-eqz v7, :cond_4

    .line 498
    .line 499
    if-nez v6, :cond_3

    .line 500
    .line 501
    move-object v6, v7

    .line 502
    goto :goto_1

    .line 503
    :cond_3
    const-string v0, "Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest."

    .line 504
    .line 505
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    return-object v3

    .line 509
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 510
    .line 511
    goto :goto_0

    .line 512
    :cond_5
    if-nez v6, :cond_6

    .line 513
    .line 514
    goto :goto_2

    .line 515
    :cond_6
    :try_start_1
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const-class v3, Landroid/content/Context;

    .line 520
    .line 521
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    move-object v3, v0

    .line 538
    check-cast v3, Lgf0;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 539
    .line 540
    goto :goto_2

    .line 541
    :catch_0
    move-exception v0

    .line 542
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 543
    .line 544
    const-string v2, "Failed to instantiate Play Services CameraDeviceSetupCompat implementation"

    .line 545
    .line 546
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 547
    .line 548
    .line 549
    throw v1

    .line 550
    :catch_1
    :goto_2
    iput-object v3, v1, Lxh0;->a:Lgf0;

    .line 551
    .line 552
    return-object v1

    .line 553
    :pswitch_e
    new-instance v0, Leg0;

    .line 554
    .line 555
    invoke-direct {v0}, Leg0;-><init>()V

    .line 556
    .line 557
    .line 558
    return-object v0

    .line 559
    :pswitch_f
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_10
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    const-string v1, "camera"

    .line 576
    .line 577
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_11
    new-instance v0, Lzf0;

    .line 588
    .line 589
    iget-object v2, v1, Lr91;->g:Lu06;

    .line 590
    .line 591
    iget-object v3, v1, Lr91;->f:Lu06;

    .line 592
    .line 593
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    check-cast v3, Ls98;

    .line 598
    .line 599
    invoke-virtual {v1}, Lr91;->a()Landroid/content/Context;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    iget-object v5, v1, Lr91;->h:Lu06;

    .line 604
    .line 605
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    check-cast v5, Landroid/content/pm/PackageManager;

    .line 610
    .line 611
    iget-object v6, v1, Lr91;->i:Lu06;

    .line 612
    .line 613
    invoke-interface {v6}, Lv06;->get()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    check-cast v6, Leg0;

    .line 618
    .line 619
    iget-object v7, v1, Lr91;->j:Lu06;

    .line 620
    .line 621
    iget-object v8, v1, Lr91;->e:Lu06;

    .line 622
    .line 623
    invoke-interface {v8}, Lv06;->get()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v8

    .line 627
    check-cast v8, Lwj0;

    .line 628
    .line 629
    iget-object v1, v1, Lr91;->d:Lu06;

    .line 630
    .line 631
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    move-object v9, v1

    .line 636
    check-cast v9, Lbm3;

    .line 637
    .line 638
    move-object v1, v0

    .line 639
    invoke-direct/range {v1 .. v9}, Lzf0;-><init>(Lv06;Ls98;Landroid/content/Context;Landroid/content/pm/PackageManager;Leg0;Lv06;Lwj0;Lbm3;)V

    .line 640
    .line 641
    .line 642
    return-object v1

    .line 643
    :pswitch_12
    iget-object v0, v1, Lr91;->b:Lb8;

    .line 644
    .line 645
    iget-object v3, v1, Lr91;->e:Lu06;

    .line 646
    .line 647
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    check-cast v3, Lwj0;

    .line 652
    .line 653
    iget-object v1, v1, Lr91;->d:Lu06;

    .line 654
    .line 655
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    check-cast v1, Lbm3;

    .line 660
    .line 661
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    new-instance v4, Ljava/util/ArrayList;

    .line 668
    .line 669
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 670
    .line 671
    .line 672
    sget-object v5, Luh;->b:Ljava/util/concurrent/ThreadFactory;

    .line 673
    .line 674
    const-string v6, "CXCP-IO-"

    .line 675
    .line 676
    invoke-static {v5, v6}, Luh;->b(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Lth;

    .line 677
    .line 678
    .line 679
    move-result-object v6

    .line 680
    new-instance v7, Lsh;

    .line 681
    .line 682
    const/4 v8, -0x1

    .line 683
    invoke-direct {v7, v8, v6}, Lsh;-><init>(ILth;)V

    .line 684
    .line 685
    .line 686
    const/16 v6, 0x8

    .line 687
    .line 688
    invoke-static {v7, v6}, Luh;->a(Lsh;I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 689
    .line 690
    .line 691
    move-result-object v12

    .line 692
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    invoke-static {v12}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 696
    .line 697
    .line 698
    move-result-object v13

    .line 699
    const-string v6, "CXCP-BG-"

    .line 700
    .line 701
    invoke-static {v5, v6}, Luh;->b(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Lth;

    .line 702
    .line 703
    .line 704
    move-result-object v6

    .line 705
    new-instance v7, Lsh;

    .line 706
    .line 707
    invoke-direct {v7, v8, v6}, Lsh;-><init>(ILth;)V

    .line 708
    .line 709
    .line 710
    const/4 v6, 0x4

    .line 711
    invoke-static {v7, v6}, Luh;->a(Lsh;I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 712
    .line 713
    .line 714
    move-result-object v14

    .line 715
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    invoke-static {v14}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 719
    .line 720
    .line 721
    move-result-object v15

    .line 722
    const-string v6, "CXCP-"

    .line 723
    .line 724
    invoke-static {v5, v6}, Luh;->b(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Lth;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    new-instance v6, Lsh;

    .line 729
    .line 730
    const/4 v7, -0x3

    .line 731
    invoke-direct {v6, v7, v5}, Lsh;-><init>(ILth;)V

    .line 732
    .line 733
    .line 734
    iget v5, v0, Lb8;->b:I

    .line 735
    .line 736
    invoke-static {v6, v5}, Luh;->a(Lsh;I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    invoke-static {v5}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    new-instance v7, Lfl6;

    .line 748
    .line 749
    const/16 v8, 0xd

    .line 750
    .line 751
    invoke-direct {v7, v4, v8}, Lfl6;-><init>(Ljava/lang/Object;B)V

    .line 752
    .line 753
    .line 754
    sget-object v4, Luj0;->Z:Luj0;

    .line 755
    .line 756
    invoke-virtual {v3, v4, v7}, Lwj0;->a(Luj0;Ljava/lang/Runnable;)V

    .line 757
    .line 758
    .line 759
    new-instance v4, Lv38;

    .line 760
    .line 761
    invoke-direct {v4, v0, v3}, Lv38;-><init>(Lb8;Lwj0;)V

    .line 762
    .line 763
    .line 764
    new-instance v7, Lf98;

    .line 765
    .line 766
    invoke-direct {v7, v0, v3, v2}, Lf98;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 767
    .line 768
    .line 769
    new-instance v0, Lea6;

    .line 770
    .line 771
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 772
    .line 773
    .line 774
    new-instance v2, Lea6;

    .line 775
    .line 776
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 777
    .line 778
    .line 779
    new-instance v8, Low7;

    .line 780
    .line 781
    invoke-direct {v8, v1}, Ldm3;-><init>(Lbm3;)V

    .line 782
    .line 783
    .line 784
    invoke-static {v8, v6}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 785
    .line 786
    .line 787
    move-result-object v8

    .line 788
    new-instance v9, Lx61;

    .line 789
    .line 790
    const-string v10, "CXCP"

    .line 791
    .line 792
    invoke-direct {v9, v10}, Lx61;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    invoke-interface {v8, v9}, Ls61;->B0(Ls61;)Ls61;

    .line 796
    .line 797
    .line 798
    move-result-object v8

    .line 799
    invoke-static {v8}, Lgv3;->c(Ls61;)Lm51;

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    iput-object v8, v0, Lea6;->X:Ljava/lang/Object;

    .line 804
    .line 805
    new-instance v8, Low7;

    .line 806
    .line 807
    invoke-direct {v8, v1}, Ldm3;-><init>(Lbm3;)V

    .line 808
    .line 809
    .line 810
    new-instance v1, Lx61;

    .line 811
    .line 812
    const-string v9, "CXCP-Dispatch"

    .line 813
    .line 814
    invoke-direct {v1, v9}, Lx61;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    invoke-static {v8, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-static {v1}, Lgv3;->c(Ls61;)Lm51;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    iput-object v1, v2, Lea6;->X:Ljava/lang/Object;

    .line 826
    .line 827
    new-instance v1, Lsc4;

    .line 828
    .line 829
    const/16 v8, 0xf

    .line 830
    .line 831
    invoke-direct {v1, v0, v2, v8}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 832
    .line 833
    .line 834
    sget-object v8, Luj0;->Y:Luj0;

    .line 835
    .line 836
    invoke-virtual {v3, v8, v1}, Lwj0;->a(Luj0;Ljava/lang/Runnable;)V

    .line 837
    .line 838
    .line 839
    new-instance v9, Ls98;

    .line 840
    .line 841
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 842
    .line 843
    move-object v10, v0

    .line 844
    check-cast v10, Lb71;

    .line 845
    .line 846
    iget-object v0, v2, Lea6;->X:Ljava/lang/Object;

    .line 847
    .line 848
    move-object v11, v0

    .line 849
    check-cast v11, Lb71;

    .line 850
    .line 851
    move-object/from16 v18, v4

    .line 852
    .line 853
    move-object/from16 v16, v5

    .line 854
    .line 855
    move-object/from16 v17, v6

    .line 856
    .line 857
    move-object/from16 v19, v7

    .line 858
    .line 859
    invoke-direct/range {v9 .. v19}, Ls98;-><init>(Lb71;Lb71;Ljava/util/concurrent/Executor;Lu61;Ljava/util/concurrent/Executor;Lu61;Ljava/util/concurrent/Executor;Lu61;Ldn2;Lf98;)V

    .line 860
    .line 861
    .line 862
    return-object v9

    .line 863
    :pswitch_13
    new-instance v0, Lre0;

    .line 864
    .line 865
    iget-object v2, v1, Lr91;->f:Lu06;

    .line 866
    .line 867
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    check-cast v2, Ls98;

    .line 872
    .line 873
    iget-object v3, v1, Lr91;->k:Lu06;

    .line 874
    .line 875
    invoke-interface {v3}, Lv06;->get()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v3

    .line 879
    check-cast v3, Lzf0;

    .line 880
    .line 881
    iget-object v4, v1, Lr91;->n:Lu06;

    .line 882
    .line 883
    invoke-interface {v4}, Lv06;->get()Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v4

    .line 887
    check-cast v4, Lhg0;

    .line 888
    .line 889
    iget-object v5, v1, Lr91;->u:Lu06;

    .line 890
    .line 891
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    check-cast v5, Ls16;

    .line 896
    .line 897
    move-object v6, v2

    .line 898
    move-object v2, v3

    .line 899
    move-object v3, v4

    .line 900
    move-object v4, v5

    .line 901
    new-instance v5, Lyr2;

    .line 902
    .line 903
    const/16 v7, 0x13

    .line 904
    .line 905
    invoke-direct {v5, v1, v7}, Lyr2;-><init>(Ljava/lang/Object;B)V

    .line 906
    .line 907
    .line 908
    move-object/from16 v20, v6

    .line 909
    .line 910
    move-object v6, v1

    .line 911
    move-object/from16 v1, v20

    .line 912
    .line 913
    invoke-virtual {v6}, Lr91;->a()Landroid/content/Context;

    .line 914
    .line 915
    .line 916
    move-result-object v6

    .line 917
    invoke-direct/range {v0 .. v6}, Lre0;-><init>(Ls98;Lzf0;Lhg0;Ls16;Lyr2;Landroid/content/Context;)V

    .line 918
    .line 919
    .line 920
    return-object v0

    .line 921
    :pswitch_14
    move-object v6, v1

    .line 922
    iget-object v0, v6, Lr91;->a:Lwl6;

    .line 923
    .line 924
    iget-object v0, v0, Lwl6;->Y:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, Lnj0;

    .line 927
    .line 928
    iget-object v1, v6, Lr91;->v:Lj70;

    .line 929
    .line 930
    invoke-virtual {v6}, Lr91;->a()Landroid/content/Context;

    .line 931
    .line 932
    .line 933
    move-result-object v10

    .line 934
    iget-object v2, v6, Lr91;->f:Lu06;

    .line 935
    .line 936
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    move-object v11, v2

    .line 941
    check-cast v11, Ls98;

    .line 942
    .line 943
    iget-object v2, v6, Lr91;->e:Lu06;

    .line 944
    .line 945
    invoke-interface {v2}, Lv06;->get()Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    move-object v12, v2

    .line 950
    check-cast v12, Lwj0;

    .line 951
    .line 952
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    iget-object v0, v0, Lnj0;->d:Lyr2;

    .line 962
    .line 963
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 964
    .line 965
    check-cast v0, Ljava/util/Map;

    .line 966
    .line 967
    const-string v2, "Initialize defaultCameraBackend"

    .line 968
    .line 969
    :try_start_2
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v1}, Lj70;->get()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, Lmg0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 977
    .line 978
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 979
    .line 980
    .line 981
    new-instance v2, Lng0;

    .line 982
    .line 983
    const-string v8, "CXCP-Camera2"

    .line 984
    .line 985
    invoke-direct {v2, v8}, Lng0;-><init>(Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    if-nez v2, :cond_9

    .line 993
    .line 994
    new-instance v2, Lng0;

    .line 995
    .line 996
    invoke-direct {v2, v8}, Lng0;-><init>(Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    new-instance v4, Lxj0;

    .line 1000
    .line 1001
    invoke-direct {v4, v1}, Lxj0;-><init>(Lmg0;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v1

    .line 1008
    if-eqz v1, :cond_7

    .line 1009
    .line 1010
    invoke-static {v2, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    move-object v9, v0

    .line 1018
    goto :goto_3

    .line 1019
    :cond_7
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1020
    .line 1021
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v1, v2, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-object v9, v1

    .line 1028
    :goto_3
    new-instance v0, Lng0;

    .line 1029
    .line 1030
    invoke-direct {v0, v8}, Lng0;-><init>(Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-interface {v9, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v0

    .line 1037
    if-eqz v0, :cond_8

    .line 1038
    .line 1039
    new-instance v7, Log0;

    .line 1040
    .line 1041
    invoke-direct/range {v7 .. v12}, Log0;-><init>(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Ls98;Lwj0;)V

    .line 1042
    .line 1043
    .line 1044
    return-object v7

    .line 1045
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    const-string v1, "Failed to find "

    .line 1048
    .line 1049
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-static {v8}, Lng0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    const-string v1, " in the list of available CameraPipe backends! Available values are "

    .line 1060
    .line 1061
    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    invoke-static {v0, v1, v2}, Lbt;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1066
    .line 1067
    .line 1068
    return-object v3

    .line 1069
    :cond_9
    invoke-static {v8}, Lng0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    const-string v1, ". Use CameraBackendConfig#internalBackend field instead."

    .line 1074
    .line 1075
    const-string v2, "CameraBackendConfig#cameraBackends should not contain a backend with "

    .line 1076
    .line 1077
    invoke-static {v2, v0, v1}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    return-object v3

    .line 1081
    :catchall_0
    move-exception v0

    .line 1082
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1083
    .line 1084
    .line 1085
    throw v0

    .line 1086
    :pswitch_15
    move-object v6, v1

    .line 1087
    new-instance v0, Lzh0;

    .line 1088
    .line 1089
    iget-object v1, v6, Lr91;->w:Lu06;

    .line 1090
    .line 1091
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    check-cast v1, Log0;

    .line 1096
    .line 1097
    invoke-direct {v0, v1}, Lzh0;-><init>(Log0;)V

    .line 1098
    .line 1099
    .line 1100
    return-object v0

    .line 1101
    :pswitch_16
    invoke-static {}, Lu70;->g()Ldm3;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    return-object v0

    .line 1106
    :pswitch_17
    move-object v6, v1

    .line 1107
    new-instance v0, Lwj0;

    .line 1108
    .line 1109
    iget-object v1, v6, Lr91;->d:Lu06;

    .line 1110
    .line 1111
    invoke-interface {v1}, Lv06;->get()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v1

    .line 1115
    check-cast v1, Lbm3;

    .line 1116
    .line 1117
    invoke-direct {v0, v1}, Lwj0;-><init>(Lbm3;)V

    .line 1118
    .line 1119
    .line 1120
    return-object v0

    .line 1121
    :pswitch_data_0
    .packed-switch 0x0
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

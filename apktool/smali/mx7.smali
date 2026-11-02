.class public final Lmx7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final A:Ls18;

.field public final B:Lo8;

.field public final C:Ll03;

.field public final a:Ljj0;

.field public final b:Lw02;

.field public final c:Lm82;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public v:Lnz;

.field public final w:Ljava/util/ArrayList;

.field public final x:Lvk7;

.field public final y:Lwp1;

.field public final z:Lsr4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljj0;Lw02;Lm82;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v2, Lqx7;->g0:Lqx7;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lmx7;->a:Ljj0;

    .line 20
    .line 21
    move-object/from16 v3, p3

    .line 22
    .line 23
    iput-object v3, v0, Lmx7;->b:Lw02;

    .line 24
    .line 25
    move-object/from16 v3, p4

    .line 26
    .line 27
    iput-object v3, v0, Lmx7;->c:Lm82;

    .line 28
    .line 29
    move-object v3, v1

    .line 30
    check-cast v3, Llf0;

    .line 31
    .line 32
    iget-object v4, v3, Llf0;->X:Ljava/lang/String;

    .line 33
    .line 34
    iput-object v4, v0, Lmx7;->d:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v5}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/lang/Integer;

    .line 46
    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v5, 0x2

    .line 55
    :goto_0
    iput v5, v0, Lmx7;->e:I

    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v6, v0, Lmx7;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    new-instance v7, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v7, v0, Lmx7;->g:Ljava/util/ArrayList;

    .line 70
    .line 71
    new-instance v8, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v8, v0, Lmx7;->h:Ljava/util/ArrayList;

    .line 77
    .line 78
    new-instance v9, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v9, v0, Lmx7;->i:Ljava/util/ArrayList;

    .line 84
    .line 85
    new-instance v10, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v10, v0, Lmx7;->j:Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance v11, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v11, v0, Lmx7;->k:Ljava/util/ArrayList;

    .line 98
    .line 99
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v11, v0, Lmx7;->l:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    new-instance v11, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v11, v0, Lmx7;->m:Ljava/util/ArrayList;

    .line 112
    .line 113
    new-instance v12, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v12, v0, Lmx7;->n:Ljava/util/ArrayList;

    .line 119
    .line 120
    sget-object v12, Ljj0;->h:Lij0;

    .line 121
    .line 122
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lij0;->b(Ljj0;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    iput-boolean v12, v0, Lmx7;->t:Z

    .line 130
    .line 131
    new-instance v13, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v13, v0, Lmx7;->w:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {v0}, Lmx7;->j()Lvk7;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    iput-object v13, v0, Lmx7;->x:Lvk7;

    .line 143
    .line 144
    sget-object v13, Lum1;->a:Li26;

    .line 145
    .line 146
    const-class v13, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 147
    .line 148
    invoke-static {}, Lum1;->a()Li26;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-virtual {v14, v13}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    check-cast v13, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 157
    .line 158
    sget-object v14, Lwp1;->g:Lbe;

    .line 159
    .line 160
    move-object/from16 v15, p1

    .line 161
    .line 162
    invoke-virtual {v14, v15}, Lbe;->i(Landroid/content/Context;)Lwp1;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    iput-object v14, v0, Lmx7;->y:Lwp1;

    .line 167
    .line 168
    new-instance v14, Lsr4;

    .line 169
    .line 170
    move/from16 p3, v12

    .line 171
    .line 172
    const/4 v12, 0x1

    .line 173
    invoke-direct {v14, v12}, Lsr4;-><init>(B)V

    .line 174
    .line 175
    .line 176
    iput-object v14, v0, Lmx7;->z:Lsr4;

    .line 177
    .line 178
    new-instance v14, Ls18;

    .line 179
    .line 180
    const/4 v12, 0x0

    .line 181
    invoke-direct {v14, v12}, Ls18;-><init>(B)V

    .line 182
    .line 183
    .line 184
    iput-object v14, v0, Lmx7;->A:Ls18;

    .line 185
    .line 186
    new-instance v12, Lo8;

    .line 187
    .line 188
    invoke-direct {v12, v1}, Lo8;-><init>(Ljj0;)V

    .line 189
    .line 190
    .line 191
    iput-object v12, v0, Lmx7;->B:Lo8;

    .line 192
    .line 193
    new-instance v14, Ll03;

    .line 194
    .line 195
    invoke-direct {v14, v1}, Ll03;-><init>(Ljj0;)V

    .line 196
    .line 197
    .line 198
    iput-object v14, v0, Lmx7;->C:Ll03;

    .line 199
    .line 200
    sget-object v14, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 201
    .line 202
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v14}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, [I

    .line 210
    .line 211
    const/4 v14, 0x3

    .line 212
    if-eqz v3, :cond_1

    .line 213
    .line 214
    invoke-static {v3, v14}, Leu;->a0([II)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    iput-boolean v1, v0, Lmx7;->o:Z

    .line 219
    .line 220
    const/4 v1, 0x6

    .line 221
    invoke-static {v3, v1}, Leu;->a0([II)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    iput-boolean v1, v0, Lmx7;->p:Z

    .line 226
    .line 227
    const/16 v1, 0x10

    .line 228
    .line 229
    invoke-static {v3, v1}, Leu;->a0([II)Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    iput-boolean v1, v0, Lmx7;->s:Z

    .line 234
    .line 235
    const/4 v1, 0x1

    .line 236
    invoke-static {v3, v1}, Leu;->a0([II)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    iput-boolean v3, v0, Lmx7;->u:Z

    .line 241
    .line 242
    :cond_1
    iget-boolean v1, v0, Lmx7;->o:Z

    .line 243
    .line 244
    iget-boolean v3, v0, Lmx7;->p:Z

    .line 245
    .line 246
    sget-object v16, Lxu2;->a:Lvz7;

    .line 247
    .line 248
    new-instance v14, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    move/from16 v17, v1

    .line 254
    .line 255
    new-instance v1, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    move/from16 v18, v3

    .line 261
    .line 262
    new-instance v3, Lnx7;

    .line 263
    .line 264
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 265
    .line 266
    .line 267
    sget-object v19, Lrx7;->e:Ljl7;

    .line 268
    .line 269
    move-object/from16 v19, v13

    .line 270
    .line 271
    sget-object v13, Lqx7;->X:Lqx7;

    .line 272
    .line 273
    sget-object v15, Lox7;->o0:Lox7;

    .line 274
    .line 275
    move-object/from16 v20, v8

    .line 276
    .line 277
    sget-object v8, Lrx7;->e:Ljl7;

    .line 278
    .line 279
    move-object/from16 v21, v10

    .line 280
    .line 281
    invoke-static {v13, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    invoke-virtual {v3, v10}, Lnx7;->a(Lrx7;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    new-instance v3, Lnx7;

    .line 292
    .line 293
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 294
    .line 295
    .line 296
    sget-object v10, Lqx7;->Z:Lqx7;

    .line 297
    .line 298
    move-object/from16 v22, v11

    .line 299
    .line 300
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    invoke-virtual {v3, v11}, Lnx7;->a(Lrx7;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    new-instance v3, Lnx7;

    .line 311
    .line 312
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 313
    .line 314
    .line 315
    sget-object v11, Lqx7;->Y:Lqx7;

    .line 316
    .line 317
    move-object/from16 v23, v12

    .line 318
    .line 319
    invoke-static {v11, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    invoke-virtual {v3, v12}, Lnx7;->a(Lrx7;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    new-instance v3, Lnx7;

    .line 330
    .line 331
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 332
    .line 333
    .line 334
    sget-object v12, Lox7;->h0:Lox7;

    .line 335
    .line 336
    move-object/from16 v24, v6

    .line 337
    .line 338
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-static {v3, v6, v10, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v3, v6, v10, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-static {v3, v6, v13, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    invoke-static {v3, v6, v11, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-static {v3, v6, v11, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 400
    .line 401
    .line 402
    if-eqz v5, :cond_2

    .line 403
    .line 404
    const/4 v1, 0x1

    .line 405
    if-eq v5, v1, :cond_2

    .line 406
    .line 407
    const/4 v1, 0x3

    .line 408
    if-eq v5, v1, :cond_2

    .line 409
    .line 410
    const/4 v1, 0x4

    .line 411
    if-eq v5, v1, :cond_2

    .line 412
    .line 413
    move-object/from16 v25, v9

    .line 414
    .line 415
    :goto_1
    const/4 v1, 0x1

    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 421
    .line 422
    .line 423
    new-instance v3, Lnx7;

    .line 424
    .line 425
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 426
    .line 427
    .line 428
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 433
    .line 434
    .line 435
    sget-object v6, Lox7;->n0:Lox7;

    .line 436
    .line 437
    move-object/from16 v25, v9

    .line 438
    .line 439
    invoke-static {v13, v6, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    invoke-virtual {v3, v9}, Lnx7;->a(Lrx7;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    new-instance v3, Lnx7;

    .line 450
    .line 451
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    invoke-static {v3, v9, v11, v6, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 459
    .line 460
    .line 461
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    invoke-static {v3, v9, v11, v6, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 470
    .line 471
    .line 472
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    invoke-static {v3, v9, v13, v6, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 481
    .line 482
    .line 483
    invoke-static {v10, v6, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-virtual {v3, v9}, Lnx7;->a(Lrx7;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    new-instance v3, Lnx7;

    .line 494
    .line 495
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 496
    .line 497
    .line 498
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    invoke-static {v3, v9, v11, v6, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 503
    .line 504
    .line 505
    invoke-static {v10, v6, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    new-instance v3, Lnx7;

    .line 516
    .line 517
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 521
    .line 522
    .line 523
    move-result-object v6

    .line 524
    invoke-static {v3, v6, v11, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 538
    .line 539
    .line 540
    goto :goto_1

    .line 541
    :goto_2
    if-eq v5, v1, :cond_3

    .line 542
    .line 543
    const/4 v1, 0x3

    .line 544
    if-eq v5, v1, :cond_3

    .line 545
    .line 546
    goto :goto_3

    .line 547
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 550
    .line 551
    .line 552
    new-instance v3, Lnx7;

    .line 553
    .line 554
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 555
    .line 556
    .line 557
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 558
    .line 559
    .line 560
    move-result-object v6

    .line 561
    invoke-static {v3, v6, v13, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 569
    .line 570
    .line 571
    move-result-object v6

    .line 572
    invoke-static {v3, v6, v11, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 573
    .line 574
    .line 575
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    invoke-static {v3, v6, v11, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 584
    .line 585
    .line 586
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    invoke-static {v3, v6, v13, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 595
    .line 596
    .line 597
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    new-instance v3, Lnx7;

    .line 608
    .line 609
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 610
    .line 611
    .line 612
    sget-object v6, Lox7;->Z:Lox7;

    .line 613
    .line 614
    invoke-static {v11, v6, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 615
    .line 616
    .line 617
    move-result-object v9

    .line 618
    invoke-static {v3, v9, v13, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 619
    .line 620
    .line 621
    invoke-static {v11, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 622
    .line 623
    .line 624
    move-result-object v9

    .line 625
    invoke-virtual {v3, v9}, Lnx7;->a(Lrx7;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    new-instance v3, Lnx7;

    .line 632
    .line 633
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-static {v11, v6, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 637
    .line 638
    .line 639
    move-result-object v6

    .line 640
    invoke-static {v3, v6, v11, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 641
    .line 642
    .line 643
    invoke-static {v11, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 644
    .line 645
    .line 646
    move-result-object v6

    .line 647
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 654
    .line 655
    .line 656
    :goto_3
    if-eqz v17, :cond_4

    .line 657
    .line 658
    new-instance v1, Ljava/util/ArrayList;

    .line 659
    .line 660
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 661
    .line 662
    .line 663
    new-instance v3, Lnx7;

    .line 664
    .line 665
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 666
    .line 667
    .line 668
    invoke-static {v2, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 669
    .line 670
    .line 671
    move-result-object v6

    .line 672
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    new-instance v3, Lnx7;

    .line 679
    .line 680
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 684
    .line 685
    .line 686
    move-result-object v6

    .line 687
    invoke-static {v3, v6, v2, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 688
    .line 689
    .line 690
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 691
    .line 692
    .line 693
    move-result-object v3

    .line 694
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    invoke-static {v3, v6, v2, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 699
    .line 700
    .line 701
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    invoke-static {v3, v6, v13, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 710
    .line 711
    .line 712
    invoke-static {v2, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 713
    .line 714
    .line 715
    move-result-object v6

    .line 716
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    new-instance v3, Lnx7;

    .line 723
    .line 724
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 725
    .line 726
    .line 727
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 728
    .line 729
    .line 730
    move-result-object v6

    .line 731
    invoke-static {v3, v6, v11, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 732
    .line 733
    .line 734
    invoke-static {v2, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    new-instance v3, Lnx7;

    .line 745
    .line 746
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 747
    .line 748
    .line 749
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 750
    .line 751
    .line 752
    move-result-object v6

    .line 753
    invoke-static {v3, v6, v11, v12, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 754
    .line 755
    .line 756
    invoke-static {v2, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    new-instance v3, Lnx7;

    .line 767
    .line 768
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 769
    .line 770
    .line 771
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    invoke-static {v3, v6, v10, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 776
    .line 777
    .line 778
    invoke-static {v2, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 779
    .line 780
    .line 781
    move-result-object v6

    .line 782
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    new-instance v3, Lnx7;

    .line 789
    .line 790
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 791
    .line 792
    .line 793
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 794
    .line 795
    .line 796
    move-result-object v6

    .line 797
    invoke-static {v3, v6, v10, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 798
    .line 799
    .line 800
    invoke-static {v2, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 801
    .line 802
    .line 803
    move-result-object v6

    .line 804
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 811
    .line 812
    .line 813
    :cond_4
    if-eqz v18, :cond_5

    .line 814
    .line 815
    if-nez v5, :cond_5

    .line 816
    .line 817
    new-instance v1, Ljava/util/ArrayList;

    .line 818
    .line 819
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 820
    .line 821
    .line 822
    new-instance v3, Lnx7;

    .line 823
    .line 824
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 825
    .line 826
    .line 827
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 828
    .line 829
    .line 830
    move-result-object v6

    .line 831
    invoke-static {v3, v6, v13, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 832
    .line 833
    .line 834
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 839
    .line 840
    .line 841
    move-result-object v6

    .line 842
    invoke-static {v3, v6, v11, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 843
    .line 844
    .line 845
    invoke-static {v1, v3}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    invoke-static {v11, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 850
    .line 851
    .line 852
    move-result-object v6

    .line 853
    invoke-static {v3, v6, v11, v15, v8}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 860
    .line 861
    .line 862
    :cond_5
    const/4 v1, 0x3

    .line 863
    if-ne v5, v1, :cond_6

    .line 864
    .line 865
    new-instance v1, Ljava/util/ArrayList;

    .line 866
    .line 867
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 868
    .line 869
    .line 870
    new-instance v3, Lnx7;

    .line 871
    .line 872
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 873
    .line 874
    .line 875
    invoke-static {v13, v12, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 876
    .line 877
    .line 878
    move-result-object v5

    .line 879
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 880
    .line 881
    .line 882
    sget-object v5, Lox7;->Z:Lox7;

    .line 883
    .line 884
    invoke-static {v13, v5, v3, v11, v15}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 885
    .line 886
    .line 887
    invoke-static {v2, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    new-instance v3, Lnx7;

    .line 898
    .line 899
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 900
    .line 901
    .line 902
    invoke-static {v13, v12, v3, v13, v5}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 903
    .line 904
    .line 905
    invoke-static {v10, v15, v3, v2, v15}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 912
    .line 913
    .line 914
    :cond_6
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 915
    .line 916
    .line 917
    sget-object v1, Ld02;->X:Ld02;

    .line 918
    .line 919
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    if-eqz v19, :cond_a

    .line 923
    .line 924
    sget-object v3, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:Lnx7;

    .line 925
    .line 926
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 927
    .line 928
    const-string v5, "heroqltevzw"

    .line 929
    .line 930
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 931
    .line 932
    .line 933
    move-result v5

    .line 934
    if-nez v5, :cond_9

    .line 935
    .line 936
    const-string v5, "heroqltetmo"

    .line 937
    .line 938
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 939
    .line 940
    .line 941
    move-result v3

    .line 942
    if-eqz v3, :cond_7

    .line 943
    .line 944
    goto :goto_4

    .line 945
    :cond_7
    invoke-static {}, Lwl7;->W()Z

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    if-nez v3, :cond_8

    .line 950
    .line 951
    invoke-static {}, Lwl7;->X()Z

    .line 952
    .line 953
    .line 954
    move-result v3

    .line 955
    if-eqz v3, :cond_a

    .line 956
    .line 957
    :cond_8
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->b:Lnx7;

    .line 958
    .line 959
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    goto :goto_5

    .line 964
    :cond_9
    :goto_4
    new-instance v1, Ljava/util/ArrayList;

    .line 965
    .line 966
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 967
    .line 968
    .line 969
    const-string v3, "1"

    .line 970
    .line 971
    invoke-static {v4, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    if-eqz v3, :cond_a

    .line 976
    .line 977
    sget-object v3, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:Lnx7;

    .line 978
    .line 979
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    :cond_a
    :goto_5
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 983
    .line 984
    .line 985
    iget-boolean v1, v0, Lmx7;->s:Z

    .line 986
    .line 987
    if-eqz v1, :cond_b

    .line 988
    .line 989
    new-instance v1, Ljava/util/ArrayList;

    .line 990
    .line 991
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 992
    .line 993
    .line 994
    new-instance v3, Lnx7;

    .line 995
    .line 996
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 997
    .line 998
    .line 999
    sget-object v4, Lox7;->r0:Lox7;

    .line 1000
    .line 1001
    invoke-static {v11, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1002
    .line 1003
    .line 1004
    sget-object v5, Lox7;->n0:Lox7;

    .line 1005
    .line 1006
    invoke-static {v13, v5}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v6

    .line 1010
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1014
    .line 1015
    .line 1016
    new-instance v3, Lnx7;

    .line 1017
    .line 1018
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1019
    .line 1020
    .line 1021
    invoke-static {v10, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v13, v5}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v6

    .line 1028
    invoke-virtual {v3, v6}, Lnx7;->a(Lrx7;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    new-instance v3, Lnx7;

    .line 1035
    .line 1036
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v2, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v13, v5}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v5

    .line 1046
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1050
    .line 1051
    .line 1052
    new-instance v3, Lnx7;

    .line 1053
    .line 1054
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1055
    .line 1056
    .line 1057
    invoke-static {v11, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1058
    .line 1059
    .line 1060
    invoke-static {v10, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v5

    .line 1064
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    new-instance v3, Lnx7;

    .line 1071
    .line 1072
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v10, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-static {v10, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v5

    .line 1082
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    new-instance v3, Lnx7;

    .line 1089
    .line 1090
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1091
    .line 1092
    .line 1093
    invoke-static {v2, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-static {v10, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v5

    .line 1100
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    new-instance v3, Lnx7;

    .line 1107
    .line 1108
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v11, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v11, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v5

    .line 1118
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    new-instance v3, Lnx7;

    .line 1125
    .line 1126
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    invoke-static {v10, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1130
    .line 1131
    .line 1132
    invoke-static {v11, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    new-instance v3, Lnx7;

    .line 1143
    .line 1144
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    invoke-static {v2, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-static {v11, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v5

    .line 1154
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    new-instance v3, Lnx7;

    .line 1161
    .line 1162
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1163
    .line 1164
    .line 1165
    invoke-static {v11, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-static {v2, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v5

    .line 1172
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    new-instance v3, Lnx7;

    .line 1179
    .line 1180
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1181
    .line 1182
    .line 1183
    invoke-static {v10, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-static {v2, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v5

    .line 1190
    invoke-virtual {v3, v5}, Lnx7;->a(Lrx7;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    new-instance v3, Lnx7;

    .line 1197
    .line 1198
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1199
    .line 1200
    .line 1201
    invoke-static {v2, v4, v3, v13, v12}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1202
    .line 1203
    .line 1204
    invoke-static {v2, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    invoke-virtual {v3, v2}, Lnx7;->a(Lrx7;)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-object/from16 v2, v25

    .line 1215
    .line 1216
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1217
    .line 1218
    .line 1219
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v1

    .line 1223
    const-string v2, "android.hardware.camera.concurrent"

    .line 1224
    .line 1225
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v1

    .line 1229
    iput-boolean v1, v0, Lmx7;->q:Z

    .line 1230
    .line 1231
    if-eqz v1, :cond_c

    .line 1232
    .line 1233
    new-instance v1, Ljava/util/ArrayList;

    .line 1234
    .line 1235
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1236
    .line 1237
    .line 1238
    new-instance v2, Lnx7;

    .line 1239
    .line 1240
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1241
    .line 1242
    .line 1243
    sget-object v3, Lox7;->k0:Lox7;

    .line 1244
    .line 1245
    invoke-static {v11, v3}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    invoke-virtual {v2, v4}, Lnx7;->a(Lrx7;)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    new-instance v2, Lnx7;

    .line 1256
    .line 1257
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1258
    .line 1259
    .line 1260
    invoke-static {v13, v3}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v4

    .line 1264
    invoke-virtual {v2, v4}, Lnx7;->a(Lrx7;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1268
    .line 1269
    .line 1270
    new-instance v2, Lnx7;

    .line 1271
    .line 1272
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1273
    .line 1274
    .line 1275
    invoke-static {v10, v3}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v4

    .line 1279
    invoke-virtual {v2, v4}, Lnx7;->a(Lrx7;)V

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    new-instance v2, Lnx7;

    .line 1286
    .line 1287
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1288
    .line 1289
    .line 1290
    sget-object v4, Lox7;->g0:Lox7;

    .line 1291
    .line 1292
    invoke-static {v11, v4, v2, v10, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    invoke-static {v13, v4, v2, v10, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v2

    .line 1306
    invoke-static {v11, v4, v2, v11, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1307
    .line 1308
    .line 1309
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v2

    .line 1313
    invoke-static {v11, v4, v2, v13, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1314
    .line 1315
    .line 1316
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v2

    .line 1320
    invoke-static {v13, v4, v2, v11, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1321
    .line 1322
    .line 1323
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v2

    .line 1327
    invoke-static {v13, v4, v2, v13, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1331
    .line 1332
    .line 1333
    move-object/from16 v2, v24

    .line 1334
    .line 1335
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1336
    .line 1337
    .line 1338
    :cond_c
    move-object/from16 v1, v23

    .line 1339
    .line 1340
    iget-boolean v1, v1, Lo8;->Y:Z

    .line 1341
    .line 1342
    if-eqz v1, :cond_d

    .line 1343
    .line 1344
    new-instance v2, Lnx7;

    .line 1345
    .line 1346
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1347
    .line 1348
    .line 1349
    invoke-static {v13, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    invoke-virtual {v2, v1}, Lnx7;->a(Lrx7;)V

    .line 1354
    .line 1355
    .line 1356
    new-instance v3, Lnx7;

    .line 1357
    .line 1358
    invoke-direct {v3}, Lnx7;-><init>()V

    .line 1359
    .line 1360
    .line 1361
    invoke-static {v11, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v1

    .line 1365
    invoke-virtual {v3, v1}, Lnx7;->a(Lrx7;)V

    .line 1366
    .line 1367
    .line 1368
    new-instance v4, Lnx7;

    .line 1369
    .line 1370
    invoke-direct {v4}, Lnx7;-><init>()V

    .line 1371
    .line 1372
    .line 1373
    invoke-static {v13, v12}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    invoke-virtual {v4, v1}, Lnx7;->a(Lrx7;)V

    .line 1378
    .line 1379
    .line 1380
    invoke-static {v10, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v1

    .line 1384
    invoke-virtual {v4, v1}, Lnx7;->a(Lrx7;)V

    .line 1385
    .line 1386
    .line 1387
    new-instance v5, Lnx7;

    .line 1388
    .line 1389
    invoke-direct {v5}, Lnx7;-><init>()V

    .line 1390
    .line 1391
    .line 1392
    invoke-static {v13, v12}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    invoke-virtual {v5, v1}, Lnx7;->a(Lrx7;)V

    .line 1397
    .line 1398
    .line 1399
    invoke-static {v11, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    invoke-virtual {v5, v1}, Lnx7;->a(Lrx7;)V

    .line 1404
    .line 1405
    .line 1406
    new-instance v6, Lnx7;

    .line 1407
    .line 1408
    invoke-direct {v6}, Lnx7;-><init>()V

    .line 1409
    .line 1410
    .line 1411
    invoke-static {v11, v12}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v1

    .line 1415
    invoke-virtual {v6, v1}, Lnx7;->a(Lrx7;)V

    .line 1416
    .line 1417
    .line 1418
    invoke-static {v11, v15}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v1

    .line 1422
    invoke-virtual {v6, v1}, Lnx7;->a(Lrx7;)V

    .line 1423
    .line 1424
    .line 1425
    new-instance v7, Lnx7;

    .line 1426
    .line 1427
    invoke-direct {v7}, Lnx7;-><init>()V

    .line 1428
    .line 1429
    .line 1430
    invoke-static {v13, v12}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    invoke-virtual {v7, v1}, Lnx7;->a(Lrx7;)V

    .line 1435
    .line 1436
    .line 1437
    sget-object v1, Lox7;->n0:Lox7;

    .line 1438
    .line 1439
    invoke-static {v13, v1}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v8

    .line 1443
    invoke-virtual {v7, v8}, Lnx7;->a(Lrx7;)V

    .line 1444
    .line 1445
    .line 1446
    new-instance v8, Lnx7;

    .line 1447
    .line 1448
    invoke-direct {v8}, Lnx7;-><init>()V

    .line 1449
    .line 1450
    .line 1451
    invoke-static {v13, v12, v8, v13, v1}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1452
    .line 1453
    .line 1454
    invoke-static {v11, v1}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v9

    .line 1458
    invoke-virtual {v8, v9}, Lnx7;->a(Lrx7;)V

    .line 1459
    .line 1460
    .line 1461
    new-instance v9, Lnx7;

    .line 1462
    .line 1463
    invoke-direct {v9}, Lnx7;-><init>()V

    .line 1464
    .line 1465
    .line 1466
    invoke-static {v13, v12, v9, v13, v1}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1467
    .line 1468
    .line 1469
    invoke-static {v10, v1}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    invoke-virtual {v9, v1}, Lnx7;->a(Lrx7;)V

    .line 1474
    .line 1475
    .line 1476
    filled-new-array/range {v2 .. v9}, [Lnx7;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v1

    .line 1480
    invoke-static {v1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v1

    .line 1484
    move-object/from16 v2, v22

    .line 1485
    .line 1486
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1487
    .line 1488
    .line 1489
    :cond_d
    if-eqz p3, :cond_e

    .line 1490
    .line 1491
    new-instance v1, Ljava/util/ArrayList;

    .line 1492
    .line 1493
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1494
    .line 1495
    .line 1496
    new-instance v2, Lnx7;

    .line 1497
    .line 1498
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1499
    .line 1500
    .line 1501
    sget-object v3, Lox7;->k0:Lox7;

    .line 1502
    .line 1503
    invoke-static {v13, v3}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v4

    .line 1507
    invoke-virtual {v2, v4}, Lnx7;->a(Lrx7;)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    new-instance v2, Lnx7;

    .line 1514
    .line 1515
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1516
    .line 1517
    .line 1518
    invoke-static {v11, v3}, Lwe5;->g(Lqx7;Lox7;)Lrx7;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    invoke-virtual {v2, v4}, Lnx7;->a(Lrx7;)V

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    new-instance v2, Lnx7;

    .line 1529
    .line 1530
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1531
    .line 1532
    .line 1533
    invoke-static {v13, v3, v2, v10, v15}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1534
    .line 1535
    .line 1536
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v2

    .line 1540
    invoke-static {v11, v3, v2, v10, v15}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1541
    .line 1542
    .line 1543
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v2

    .line 1547
    invoke-static {v13, v3, v2, v11, v15}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1548
    .line 1549
    .line 1550
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v2

    .line 1554
    invoke-static {v11, v3, v2, v11, v15}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1555
    .line 1556
    .line 1557
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v2

    .line 1561
    invoke-static {v13, v12, v2, v13, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1562
    .line 1563
    .line 1564
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v2

    .line 1568
    invoke-static {v11, v12, v2, v13, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1569
    .line 1570
    .line 1571
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v2

    .line 1575
    invoke-static {v13, v12, v2, v11, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v1, v2}, Lie2;->e(Ljava/util/ArrayList;Lnx7;)Lnx7;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v2

    .line 1582
    invoke-static {v11, v12, v2, v11, v3}, Lpc6;->u(Lqx7;Lox7;Lnx7;Lqx7;Lox7;)V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1586
    .line 1587
    .line 1588
    move-object/from16 v2, v21

    .line 1589
    .line 1590
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1591
    .line 1592
    .line 1593
    :cond_e
    invoke-static/range {p2 .. p2}, Lkl7;->d(Ljj0;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v1

    .line 1597
    iput-boolean v1, v0, Lmx7;->r:Z

    .line 1598
    .line 1599
    if-eqz v1, :cond_f

    .line 1600
    .line 1601
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1602
    .line 1603
    const/16 v2, 0x21

    .line 1604
    .line 1605
    if-lt v1, v2, :cond_f

    .line 1606
    .line 1607
    new-instance v1, Lnx7;

    .line 1608
    .line 1609
    invoke-direct {v1}, Lnx7;-><init>()V

    .line 1610
    .line 1611
    .line 1612
    sget-object v2, Lox7;->k0:Lox7;

    .line 1613
    .line 1614
    sget-object v3, Ljl7;->h0:Ljl7;

    .line 1615
    .line 1616
    invoke-static {v13, v2, v3}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v4

    .line 1620
    invoke-virtual {v1, v4}, Lnx7;->a(Lrx7;)V

    .line 1621
    .line 1622
    .line 1623
    new-instance v4, Lnx7;

    .line 1624
    .line 1625
    invoke-direct {v4}, Lnx7;-><init>()V

    .line 1626
    .line 1627
    .line 1628
    invoke-static {v11, v2, v3}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    invoke-virtual {v4, v2}, Lnx7;->a(Lrx7;)V

    .line 1633
    .line 1634
    .line 1635
    new-instance v2, Lnx7;

    .line 1636
    .line 1637
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1638
    .line 1639
    .line 1640
    sget-object v3, Lox7;->n0:Lox7;

    .line 1641
    .line 1642
    sget-object v5, Ljl7;->f0:Ljl7;

    .line 1643
    .line 1644
    invoke-static {v13, v3, v5}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v6

    .line 1648
    invoke-virtual {v2, v6}, Lnx7;->a(Lrx7;)V

    .line 1649
    .line 1650
    .line 1651
    new-instance v6, Lnx7;

    .line 1652
    .line 1653
    invoke-direct {v6}, Lnx7;-><init>()V

    .line 1654
    .line 1655
    .line 1656
    invoke-static {v11, v3, v5}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v7

    .line 1660
    invoke-virtual {v6, v7}, Lnx7;->a(Lrx7;)V

    .line 1661
    .line 1662
    .line 1663
    new-instance v7, Lnx7;

    .line 1664
    .line 1665
    invoke-direct {v7}, Lnx7;-><init>()V

    .line 1666
    .line 1667
    .line 1668
    sget-object v8, Ljl7;->g0:Ljl7;

    .line 1669
    .line 1670
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v9

    .line 1674
    invoke-virtual {v7, v9}, Lnx7;->a(Lrx7;)V

    .line 1675
    .line 1676
    .line 1677
    new-instance v9, Lnx7;

    .line 1678
    .line 1679
    invoke-direct {v9}, Lnx7;-><init>()V

    .line 1680
    .line 1681
    .line 1682
    invoke-static {v11, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v14

    .line 1686
    invoke-virtual {v9, v14}, Lnx7;->a(Lrx7;)V

    .line 1687
    .line 1688
    .line 1689
    new-instance v14, Lnx7;

    .line 1690
    .line 1691
    invoke-direct {v14}, Lnx7;-><init>()V

    .line 1692
    .line 1693
    .line 1694
    sget-object v0, Ljl7;->Z:Ljl7;

    .line 1695
    .line 1696
    move-object/from16 v21, v1

    .line 1697
    .line 1698
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v1

    .line 1702
    invoke-virtual {v14, v1}, Lnx7;->a(Lrx7;)V

    .line 1703
    .line 1704
    .line 1705
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v1

    .line 1709
    invoke-virtual {v14, v1}, Lnx7;->a(Lrx7;)V

    .line 1710
    .line 1711
    .line 1712
    new-instance v1, Lnx7;

    .line 1713
    .line 1714
    invoke-direct {v1}, Lnx7;-><init>()V

    .line 1715
    .line 1716
    .line 1717
    move-object/from16 v23, v2

    .line 1718
    .line 1719
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v2

    .line 1723
    invoke-virtual {v1, v2}, Lnx7;->a(Lrx7;)V

    .line 1724
    .line 1725
    .line 1726
    invoke-static {v11, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v2

    .line 1730
    invoke-virtual {v1, v2}, Lnx7;->a(Lrx7;)V

    .line 1731
    .line 1732
    .line 1733
    new-instance v2, Lnx7;

    .line 1734
    .line 1735
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1736
    .line 1737
    .line 1738
    move-object/from16 v28, v1

    .line 1739
    .line 1740
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v1

    .line 1744
    invoke-virtual {v2, v1}, Lnx7;->a(Lrx7;)V

    .line 1745
    .line 1746
    .line 1747
    invoke-static {v13, v3, v5}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v1

    .line 1751
    invoke-virtual {v2, v1}, Lnx7;->a(Lrx7;)V

    .line 1752
    .line 1753
    .line 1754
    new-instance v1, Lnx7;

    .line 1755
    .line 1756
    invoke-direct {v1}, Lnx7;-><init>()V

    .line 1757
    .line 1758
    .line 1759
    move-object/from16 v29, v2

    .line 1760
    .line 1761
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v2

    .line 1765
    invoke-virtual {v1, v2}, Lnx7;->a(Lrx7;)V

    .line 1766
    .line 1767
    .line 1768
    invoke-static {v11, v3, v5}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v2

    .line 1772
    invoke-virtual {v1, v2}, Lnx7;->a(Lrx7;)V

    .line 1773
    .line 1774
    .line 1775
    new-instance v2, Lnx7;

    .line 1776
    .line 1777
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1778
    .line 1779
    .line 1780
    move-object/from16 v30, v1

    .line 1781
    .line 1782
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    invoke-virtual {v2, v1}, Lnx7;->a(Lrx7;)V

    .line 1787
    .line 1788
    .line 1789
    invoke-static {v11, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v1

    .line 1793
    invoke-virtual {v2, v1}, Lnx7;->a(Lrx7;)V

    .line 1794
    .line 1795
    .line 1796
    new-instance v1, Lnx7;

    .line 1797
    .line 1798
    invoke-direct {v1}, Lnx7;-><init>()V

    .line 1799
    .line 1800
    .line 1801
    move-object/from16 v31, v2

    .line 1802
    .line 1803
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v2

    .line 1807
    invoke-static {v1, v2, v13, v3, v5}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 1808
    .line 1809
    .line 1810
    invoke-static {v10, v3, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v2

    .line 1814
    invoke-virtual {v1, v2}, Lnx7;->a(Lrx7;)V

    .line 1815
    .line 1816
    .line 1817
    new-instance v2, Lnx7;

    .line 1818
    .line 1819
    invoke-direct {v2}, Lnx7;-><init>()V

    .line 1820
    .line 1821
    .line 1822
    move-object/from16 v32, v1

    .line 1823
    .line 1824
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v1

    .line 1828
    invoke-static {v2, v1, v11, v3, v5}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 1829
    .line 1830
    .line 1831
    invoke-static {v10, v3, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v1

    .line 1835
    invoke-virtual {v2, v1}, Lnx7;->a(Lrx7;)V

    .line 1836
    .line 1837
    .line 1838
    new-instance v1, Lnx7;

    .line 1839
    .line 1840
    invoke-direct {v1}, Lnx7;-><init>()V

    .line 1841
    .line 1842
    .line 1843
    invoke-static {v13, v12, v0}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v3

    .line 1847
    invoke-static {v1, v3, v11, v12, v0}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 1848
    .line 1849
    .line 1850
    invoke-static {v10, v15, v8}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v0

    .line 1854
    invoke-virtual {v1, v0}, Lnx7;->a(Lrx7;)V

    .line 1855
    .line 1856
    .line 1857
    move-object/from16 v34, v1

    .line 1858
    .line 1859
    move-object/from16 v33, v2

    .line 1860
    .line 1861
    move-object/from16 v22, v4

    .line 1862
    .line 1863
    move-object/from16 v24, v6

    .line 1864
    .line 1865
    move-object/from16 v25, v7

    .line 1866
    .line 1867
    move-object/from16 v26, v9

    .line 1868
    .line 1869
    move-object/from16 v27, v14

    .line 1870
    .line 1871
    filled-new-array/range {v21 .. v34}, [Lnx7;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v0

    .line 1879
    move-object/from16 v1, v20

    .line 1880
    .line 1881
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1882
    .line 1883
    .line 1884
    :cond_f
    invoke-virtual/range {p0 .. p0}, Lmx7;->b()V

    .line 1885
    .line 1886
    .line 1887
    return-void
.end method

.method public static c(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;
    .locals 19

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v2, Liz;->h:Landroid/util/Range;

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    invoke-static {v3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_1
    new-instance v4, Landroid/util/Range;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast v5, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v3}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast v3, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-direct {v4, v5, v3}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 70
    .line 71
    .line 72
    array-length v3, v1

    .line 73
    const/4 v5, 0x0

    .line 74
    move v6, v5

    .line 75
    :goto_0
    if-ge v5, v3, :cond_f

    .line 76
    .line 77
    aget-object v7, v1, v5

    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-ge v0, v8, :cond_2

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_2
    sget-object v8, Liz;->h:Landroid/util/Range;

    .line 94
    .line 95
    invoke-static {v2, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_3

    .line 100
    .line 101
    move-object v2, v7

    .line 102
    :cond_3
    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    move-object v2, v7

    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_4
    :try_start_0
    invoke-virtual {v7, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v8}, Lmx7;->h(Landroid/util/Range;)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v6, :cond_5

    .line 123
    .line 124
    move-object v2, v7

    .line 125
    move v6, v8

    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_5
    if-lt v8, v6, :cond_e

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v8}, Lmx7;->h(Landroid/util/Range;)I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    int-to-double v8, v8

    .line 145
    invoke-virtual {v7, v4}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v10}, Lmx7;->h(Landroid/util/Range;)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    int-to-double v10, v10

    .line 157
    invoke-static {v7}, Lmx7;->h(Landroid/util/Range;)I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    int-to-double v12, v12

    .line 162
    div-double v12, v10, v12

    .line 163
    .line 164
    invoke-static {v2}, Lmx7;->h(Landroid/util/Range;)I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    int-to-double v14, v14

    .line 169
    div-double v14, v8, v14

    .line 170
    .line 171
    cmpl-double v16, v10, v8

    .line 172
    .line 173
    const-wide/high16 v17, 0x3fe0000000000000L    # 0.5

    .line 174
    .line 175
    if-lez v16, :cond_6

    .line 176
    .line 177
    cmpl-double v8, v12, v17

    .line 178
    .line 179
    if-gez v8, :cond_9

    .line 180
    .line 181
    cmpl-double v8, v12, v14

    .line 182
    .line 183
    if-ltz v8, :cond_a

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_6
    cmpg-double v8, v10, v8

    .line 187
    .line 188
    if-nez v8, :cond_8

    .line 189
    .line 190
    cmpl-double v8, v12, v14

    .line 191
    .line 192
    if-lez v8, :cond_7

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_7
    cmpg-double v8, v12, v14

    .line 196
    .line 197
    if-nez v8, :cond_a

    .line 198
    .line 199
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    check-cast v8, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    check-cast v9, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-le v8, v9, :cond_a

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_8
    cmpg-double v8, v14, v17

    .line 223
    .line 224
    if-gez v8, :cond_a

    .line 225
    .line 226
    cmpl-double v8, v12, v14

    .line 227
    .line 228
    if-lez v8, :cond_a

    .line 229
    .line 230
    :cond_9
    :goto_1
    move-object v2, v7

    .line 231
    :cond_a
    invoke-virtual {v4, v2}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {v8}, Lmx7;->h(Landroid/util/Range;)I

    .line 239
    .line 240
    .line 241
    move-result v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    goto :goto_3

    .line 243
    :catch_0
    if-eqz v6, :cond_b

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_b
    invoke-static {v7, v4}, Lmx7;->g(Landroid/util/Range;Landroid/util/Range;)I

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v2, v4}, Lmx7;->g(Landroid/util/Range;Landroid/util/Range;)I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-ge v8, v9, :cond_c

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_c
    invoke-static {v7, v4}, Lmx7;->g(Landroid/util/Range;Landroid/util/Range;)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    invoke-static {v2, v4}, Lmx7;->g(Landroid/util/Range;Landroid/util/Range;)I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    if-ne v8, v9, :cond_e

    .line 269
    .line 270
    invoke-virtual {v7}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    check-cast v8, Ljava/lang/Number;

    .line 275
    .line 276
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    check-cast v9, Ljava/lang/Number;

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-le v8, v9, :cond_d

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_d
    invoke-static {v7}, Lmx7;->h(Landroid/util/Range;)I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    invoke-static {v2}, Lmx7;->h(Landroid/util/Range;)I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    if-ge v8, v9, :cond_e

    .line 302
    .line 303
    :goto_2
    move-object v2, v7

    .line 304
    :cond_e
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_f
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    return-object v2
.end method

.method public static e(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;
    .locals 8

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    :try_start_0
    const-class v0, Landroid/graphics/SurfaceTexture;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_1

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_1

    .line 26
    :goto_0
    new-instance v2, Lrj6;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :goto_1
    move-object v2, v0

    .line 33
    :goto_2
    nop

    .line 34
    instance-of v0, v2, Lrj6;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    :cond_2
    check-cast v2, [Landroid/util/Size;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    if-eqz v2, :cond_5

    .line 43
    .line 44
    if-eqz p3, :cond_6

    .line 45
    .line 46
    new-instance v3, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    array-length v4, v2

    .line 52
    move v5, v0

    .line 53
    :goto_3
    if-ge v5, v4, :cond_4

    .line 54
    .line 55
    aget-object v6, v2, v5

    .line 56
    .line 57
    invoke-static {p3, v6}, Lru;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    new-array p3, v0, [Landroid/util/Size;

    .line 70
    .line 71
    invoke-virtual {v3, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    move-object v2, p3

    .line 76
    check-cast v2, [Landroid/util/Size;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    move-object v2, v1

    .line 80
    :cond_6
    :goto_4
    if-eqz v2, :cond_b

    .line 81
    .line 82
    array-length p3, v2

    .line 83
    if-nez p3, :cond_7

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_7
    new-instance p3, Lrx0;

    .line 87
    .line 88
    invoke-direct {p3, v0}, Lrx0;-><init>(Z)V

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v0, p3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Landroid/util/Size;

    .line 103
    .line 104
    sget-object v2, Lcb7;->a:Landroid/util/Size;

    .line 105
    .line 106
    if-eqz p2, :cond_a

    .line 107
    .line 108
    if-eqz p0, :cond_8

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighResolutionOutputSizes(I)[Landroid/util/Size;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_8
    if-eqz v1, :cond_a

    .line 115
    .line 116
    array-length p0, v1

    .line 117
    if-nez p0, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {p0, p3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    move-object v2, p0

    .line 132
    check-cast v2, Landroid/util/Size;

    .line 133
    .line 134
    :cond_a
    :goto_5
    filled-new-array {v0, v2}, [Landroid/util/Size;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0, p3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    check-cast p0, Landroid/util/Size;

    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_b
    :goto_6
    return-object v1
.end method

.method public static g(Landroid/util/Range;Landroid/util/Range;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-le v0, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    sub-int/2addr p0, p1

    .line 67
    return p0

    .line 68
    :cond_0
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast p0, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    sub-int/2addr p1, p0

    .line 92
    return p1

    .line 93
    :cond_1
    const-string p0, "Ranges must not intersect"

    .line 94
    .line 95
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return p0
.end method

.method public static h(Landroid/util/Range;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    sub-int/2addr v0, p0

    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    return v0
.end method

.method public static n(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;
    .locals 2

    .line 1
    sget-object v0, Liz;->h:Landroid/util/Range;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    if-eqz p2, :cond_3

    .line 34
    .line 35
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const-string p2, "All targetFrameRate should be the same if strict fps is required"

    .line 40
    .line 41
    invoke-static {p2, p1}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :catch_0
    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    iget-object v6, v1, Llx7;->d:Llv8;

    .line 13
    .line 14
    iget-boolean v7, v1, Llx7;->h:Z

    .line 15
    .line 16
    iget-object v8, v0, Lmx7;->l:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-interface {v8, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    sget-object v10, Llv8;->g0:Llv8;

    .line 23
    .line 24
    if-eqz v9, :cond_0

    .line 25
    .line 26
    invoke-virtual {v8, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v8, Ljava/util/List;

    .line 34
    .line 35
    move-object/from16 v18, v5

    .line 36
    .line 37
    move/from16 v17, v7

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iget v12, v1, Llx7;->a:I

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    sget-object v12, Lxu2;->a:Lvz7;

    .line 51
    .line 52
    iget-object v12, v0, Lmx7;->a:Ljj0;

    .line 53
    .line 54
    invoke-static {v12, v6}, Lxu2;->b(Ljj0;Llv8;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    move-object/from16 v18, v5

    .line 62
    .line 63
    move/from16 v17, v7

    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_1
    iget-boolean v13, v1, Llx7;->e:Z

    .line 68
    .line 69
    if-eqz v13, :cond_3

    .line 70
    .line 71
    iget-object v13, v0, Lmx7;->n:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    if-eqz v14, :cond_2

    .line 78
    .line 79
    sget-object v14, Lxu2;->a:Lvz7;

    .line 80
    .line 81
    new-instance v14, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v15, Lnx7;

    .line 87
    .line 88
    invoke-direct {v15}, Lnx7;-><init>()V

    .line 89
    .line 90
    .line 91
    sget-object v16, Lrx7;->e:Ljl7;

    .line 92
    .line 93
    sget-object v4, Lox7;->o0:Lox7;

    .line 94
    .line 95
    sget-object v11, Lrx7;->e:Ljl7;

    .line 96
    .line 97
    move/from16 v17, v7

    .line 98
    .line 99
    sget-object v7, Lqx7;->f0:Lqx7;

    .line 100
    .line 101
    move-object/from16 v18, v5

    .line 102
    .line 103
    invoke-static {v7, v4, v11}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v15, v5}, Lnx7;->a(Lrx7;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    new-instance v5, Lnx7;

    .line 114
    .line 115
    invoke-direct {v5}, Lnx7;-><init>()V

    .line 116
    .line 117
    .line 118
    sget-object v15, Lqx7;->X:Lqx7;

    .line 119
    .line 120
    sget-object v3, Lox7;->h0:Lox7;

    .line 121
    .line 122
    invoke-static {v15, v3, v11}, Lwe5;->f(Lqx7;Lox7;Ljl7;)Lrx7;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v5, v3, v7, v4, v11}, Lie2;->o(Lnx7;Lrx7;Lqx7;Lox7;Ljl7;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    move-object/from16 v18, v5

    .line 137
    .line 138
    move/from16 v17, v7

    .line 139
    .line 140
    :goto_0
    if-nez v12, :cond_b

    .line 141
    .line 142
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 143
    .line 144
    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    :cond_3
    move-object/from16 v18, v5

    .line 148
    .line 149
    move/from16 v17, v7

    .line 150
    .line 151
    iget-boolean v3, v1, Llx7;->f:Z

    .line 152
    .line 153
    if-eqz v3, :cond_6

    .line 154
    .line 155
    iget-object v3, v0, Lmx7;->k:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_5

    .line 162
    .line 163
    iget-object v4, v0, Lmx7;->C:Ll03;

    .line 164
    .line 165
    iget-object v5, v4, Ll03;->b:Lvz7;

    .line 166
    .line 167
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    check-cast v5, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-nez v5, :cond_4

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 181
    .line 182
    .line 183
    iget-object v4, v4, Ll03;->c:Lvz7;

    .line 184
    .line 185
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    move-object/from16 v20, v4

    .line 190
    .line 191
    check-cast v20, Landroid/util/Size;

    .line 192
    .line 193
    if-eqz v20, :cond_5

    .line 194
    .line 195
    const/16 v4, 0x22

    .line 196
    .line 197
    invoke-virtual {v0, v4}, Lmx7;->m(I)Lnz;

    .line 198
    .line 199
    .line 200
    move-result-object v21

    .line 201
    sget-object v4, Lxu2;->a:Lvz7;

    .line 202
    .line 203
    new-instance v4, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    sget-object v5, Lrx7;->e:Ljl7;

    .line 209
    .line 210
    sget-object v23, Lpx7;->Y:Lpx7;

    .line 211
    .line 212
    sget-object v24, Lrx7;->e:Ljl7;

    .line 213
    .line 214
    const/16 v19, 0x22

    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    .line 218
    invoke-static/range {v19 .. v24}, Lwe5;->p(ILandroid/util/Size;Lnz;ILpx7;Ljl7;)Lrx7;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    new-instance v7, Lnx7;

    .line 223
    .line 224
    invoke-direct {v7}, Lnx7;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v5}, Lnx7;->a(Lrx7;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    new-instance v7, Lnx7;

    .line 234
    .line 235
    invoke-direct {v7}, Lnx7;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v7, v5}, Lnx7;->a(Lrx7;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v5}, Lnx7;->a(Lrx7;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 248
    .line 249
    .line 250
    :cond_5
    :goto_1
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_6
    iget v3, v1, Llx7;->b:I

    .line 255
    .line 256
    const/16 v4, 0x8

    .line 257
    .line 258
    if-ne v3, v4, :cond_a

    .line 259
    .line 260
    const/4 v4, 0x1

    .line 261
    if-eq v12, v4, :cond_9

    .line 262
    .line 263
    iget-object v3, v0, Lmx7;->g:Ljava/util/ArrayList;

    .line 264
    .line 265
    const/4 v4, 0x2

    .line 266
    if-eq v12, v4, :cond_8

    .line 267
    .line 268
    if-ne v6, v10, :cond_7

    .line 269
    .line 270
    iget-object v3, v0, Lmx7;->j:Ljava/util/ArrayList;

    .line 271
    .line 272
    :cond_7
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_8
    iget-object v4, v0, Lmx7;->i:Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_9
    iget-object v3, v0, Lmx7;->f:Ljava/util/ArrayList;

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_a
    const/16 v4, 0xa

    .line 289
    .line 290
    if-ne v3, v4, :cond_b

    .line 291
    .line 292
    if-nez v12, :cond_b

    .line 293
    .line 294
    iget-object v3, v0, Lmx7;->m:Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 297
    .line 298
    .line 299
    :cond_b
    :goto_2
    move-object v3, v9

    .line 300
    :goto_3
    invoke-interface {v8, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-object v8, v3

    .line 304
    :goto_4
    if-eqz v8, :cond_d

    .line 305
    .line 306
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_d

    .line 311
    .line 312
    :cond_c
    const/4 v3, 0x0

    .line 313
    goto :goto_5

    .line 314
    :cond_d
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_c

    .line 323
    .line 324
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    check-cast v5, Lnx7;

    .line 329
    .line 330
    invoke-virtual {v5, v2}, Lnx7;->c(Ljava/util/ArrayList;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    if-eqz v5, :cond_e

    .line 335
    .line 336
    const/4 v3, 0x1

    .line 337
    :goto_5
    if-eqz v3, :cond_1f

    .line 338
    .line 339
    if-eqz v17, :cond_1f

    .line 340
    .line 341
    new-instance v3, Le57;

    .line 342
    .line 343
    invoke-direct {v3}, Le57;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    const/4 v7, 0x0

    .line 351
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    if-eqz v8, :cond_1d

    .line 356
    .line 357
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    add-int/lit8 v9, v7, 0x1

    .line 362
    .line 363
    if-ltz v7, :cond_1c

    .line 364
    .line 365
    check-cast v8, Lrx7;

    .line 366
    .line 367
    iget v12, v8, Lrx7;->d:I

    .line 368
    .line 369
    invoke-virtual {v0, v12}, Lmx7;->m(I)Lnz;

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    iget-object v13, v12, Lnz;->f:Ljava/util/LinkedHashMap;

    .line 374
    .line 375
    iget v14, v8, Lrx7;->d:I

    .line 376
    .line 377
    iget-object v15, v8, Lrx7;->b:Lox7;

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    const/16 v19, 0x0

    .line 386
    .line 387
    const/4 v11, 0x3

    .line 388
    if-eq v4, v11, :cond_f

    .line 389
    .line 390
    packed-switch v4, :pswitch_data_0

    .line 391
    .line 392
    .line 393
    iget-object v4, v15, Lox7;->Y:Landroid/util/Size;

    .line 394
    .line 395
    goto :goto_7

    .line 396
    :pswitch_0
    const-string v0, "Not supported config size"

    .line 397
    .line 398
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return v17

    .line 402
    :pswitch_1
    iget-object v4, v12, Lnz;->i:Ljava/util/LinkedHashMap;

    .line 403
    .line 404
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    invoke-virtual {v4, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    check-cast v4, Landroid/util/Size;

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :pswitch_2
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v13, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    check-cast v4, Landroid/util/Size;

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :pswitch_3
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-virtual {v13, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    check-cast v4, Landroid/util/Size;

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :pswitch_4
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-virtual {v13, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    check-cast v4, Landroid/util/Size;

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :pswitch_5
    iget-object v4, v12, Lnz;->e:Landroid/util/Size;

    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_f
    iget-object v4, v12, Lnz;->c:Landroid/util/Size;

    .line 452
    .line 453
    :goto_7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    move-object/from16 v12, p5

    .line 457
    .line 458
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    check-cast v7, Ljava/lang/Number;

    .line 463
    .line 464
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    move-object/from16 v13, p4

    .line 469
    .line 470
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    check-cast v7, Ler8;

    .line 475
    .line 476
    move-object/from16 v14, p3

    .line 477
    .line 478
    invoke-interface {v14, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v15

    .line 482
    if-eqz v15, :cond_1b

    .line 483
    .line 484
    check-cast v15, Lpx1;

    .line 485
    .line 486
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-interface {v7}, Le63;->n()I

    .line 490
    .line 491
    .line 492
    move-result v11

    .line 493
    move-object/from16 v21, v5

    .line 494
    .line 495
    new-instance v5, Ll82;

    .line 496
    .line 497
    invoke-direct {v5, v11, v4}, Lwg1;-><init>(ILandroid/util/Size;)V

    .line 498
    .line 499
    .line 500
    sget-object v11, Lqr8;->Y:Ls18;

    .line 501
    .line 502
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    invoke-interface {v7}, Ler8;->s()Lgr8;

    .line 506
    .line 507
    .line 508
    move-result-object v11

    .line 509
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 510
    .line 511
    .line 512
    move-result v11

    .line 513
    move/from16 v22, v9

    .line 514
    .line 515
    if-eqz v11, :cond_14

    .line 516
    .line 517
    const/4 v9, 0x1

    .line 518
    if-eq v11, v9, :cond_13

    .line 519
    .line 520
    const/4 v9, 0x2

    .line 521
    if-eq v11, v9, :cond_12

    .line 522
    .line 523
    const/4 v9, 0x3

    .line 524
    if-eq v11, v9, :cond_11

    .line 525
    .line 526
    const/4 v9, 0x4

    .line 527
    if-eq v11, v9, :cond_10

    .line 528
    .line 529
    sget-object v9, Lqr8;->j0:Lqr8;

    .line 530
    .line 531
    goto :goto_8

    .line 532
    :cond_10
    sget-object v9, Lqr8;->i0:Lqr8;

    .line 533
    .line 534
    goto :goto_8

    .line 535
    :cond_11
    sget-object v9, Lqr8;->h0:Lqr8;

    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_12
    sget-object v9, Lqr8;->g0:Lqr8;

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_13
    sget-object v9, Lqr8;->Z:Lqr8;

    .line 542
    .line 543
    goto :goto_8

    .line 544
    :cond_14
    sget-object v9, Lqr8;->f0:Lqr8;

    .line 545
    .line 546
    :goto_8
    iget-object v9, v9, Lqr8;->X:Ljava/lang/Class;

    .line 547
    .line 548
    if-eqz v9, :cond_15

    .line 549
    .line 550
    iput-object v9, v5, Lwg1;->j:Ljava/lang/Class;

    .line 551
    .line 552
    :cond_15
    invoke-static {v7, v4}, Lb57;->d(Ler8;Landroid/util/Size;)Lb57;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    iget-object v9, v4, La57;->b:Lxm0;

    .line 557
    .line 558
    const/4 v11, -0x1

    .line 559
    invoke-virtual {v4, v5, v15, v11}, Lb57;->b(Lwg1;Lpx1;I)V

    .line 560
    .line 561
    .line 562
    iget-object v5, v1, Llx7;->i:Landroid/util/Range;

    .line 563
    .line 564
    sget-object v11, Liz;->h:Landroid/util/Range;

    .line 565
    .line 566
    invoke-static {v5, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v11

    .line 570
    if-nez v11, :cond_16

    .line 571
    .line 572
    move-object v11, v5

    .line 573
    goto :goto_9

    .line 574
    :cond_16
    move-object/from16 v11, v19

    .line 575
    .line 576
    :goto_9
    if-nez v11, :cond_17

    .line 577
    .line 578
    sget-object v11, Lek2;->d:Landroid/util/Range;

    .line 579
    .line 580
    :cond_17
    sget-object v5, Lym0;->f:Lzx;

    .line 581
    .line 582
    iget-object v15, v9, Lxm0;->g0:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v15, Lk05;

    .line 585
    .line 586
    invoke-virtual {v15, v5, v11}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    if-ne v6, v10, :cond_18

    .line 590
    .line 591
    sget-object v5, Ler8;->a0:Lzx;

    .line 592
    .line 593
    iget-object v9, v9, Lxm0;->g0:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v9, Lk05;

    .line 596
    .line 597
    move-object/from16 v11, v18

    .line 598
    .line 599
    invoke-virtual {v9, v5, v11}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    goto :goto_a

    .line 603
    :cond_18
    move-object/from16 v11, v18

    .line 604
    .line 605
    sget-object v5, Llv8;->f0:Llv8;

    .line 606
    .line 607
    if-ne v6, v5, :cond_19

    .line 608
    .line 609
    sget-object v5, Ler8;->b0:Lzx;

    .line 610
    .line 611
    iget-object v9, v9, Lxm0;->g0:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v9, Lk05;

    .line 614
    .line 615
    invoke-virtual {v9, v5, v11}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    :cond_19
    :goto_a
    invoke-virtual {v4}, Lb57;->c()Lf57;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    invoke-virtual {v3, v4}, Le57;->a(Lf57;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v3}, Le57;->c()Z

    .line 626
    .line 627
    .line 628
    move-result v4

    .line 629
    new-instance v5, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    const-string v9, "Cannot create a combined SessionConfig for feature combo after adding "

    .line 632
    .line 633
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    const-string v7, " with "

    .line 640
    .line 641
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    const-string v7, " due to ["

    .line 648
    .line 649
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    iget-boolean v7, v3, Le57;->m:Z

    .line 653
    .line 654
    if-nez v7, :cond_1a

    .line 655
    .line 656
    const-string v7, "Template is not set"

    .line 657
    .line 658
    goto :goto_b

    .line 659
    :cond_1a
    iget-object v7, v3, Le57;->l:Ljava/lang/StringBuilder;

    .line 660
    .line 661
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v7

    .line 665
    :goto_b
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    const-string v7, "]; surfaceConfigList = "

    .line 669
    .line 670
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const-string v7, ", featureSettings = "

    .line 677
    .line 678
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    const-string v7, ", newUseCaseConfigs = "

    .line 685
    .line 686
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    invoke-static {v5, v4}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 697
    .line 698
    .line 699
    move-object/from16 v18, v11

    .line 700
    .line 701
    move-object/from16 v5, v21

    .line 702
    .line 703
    move/from16 v7, v22

    .line 704
    .line 705
    goto/16 :goto_6

    .line 706
    .line 707
    :cond_1b
    const-string v0, "Required value was null."

    .line 708
    .line 709
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    return v17

    .line 713
    :cond_1c
    const/16 v19, 0x0

    .line 714
    .line 715
    invoke-static {}, Li21;->X()V

    .line 716
    .line 717
    .line 718
    throw v19

    .line 719
    :cond_1d
    invoke-virtual {v3}, Le57;->b()Lf57;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    iget-object v0, v0, Lmx7;->c:Lm82;

    .line 724
    .line 725
    invoke-interface {v0, v1}, Lm82;->c(Lf57;)Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    invoke-virtual {v1}, Lf57;->b()Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v2

    .line 744
    if-eqz v2, :cond_1e

    .line 745
    .line 746
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    check-cast v2, Lwg1;

    .line 751
    .line 752
    invoke-virtual {v2}, Lwg1;->a()V

    .line 753
    .line 754
    .line 755
    goto :goto_c

    .line 756
    :cond_1e
    return v0

    .line 757
    :cond_1f
    return v3

    .line 758
    nop

    .line 759
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 11

    .line 1
    iget-object v0, p0, Lmx7;->y:Lwp1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwp1;->c()Landroid/util/Size;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    :try_start_0
    iget-object v0, p0, Lmx7;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lmx7;->i()Landroid/util/Size;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    :goto_0
    move-object v6, v0

    .line 19
    goto :goto_5

    .line 20
    :catch_0
    :cond_0
    iget-object v0, p0, Lmx7;->x:Lvk7;

    .line 21
    .line 22
    iget-object v0, v0, Lvk7;->c:Ly45;

    .line 23
    .line 24
    iget-object v0, v0, Ly45;->X:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :try_start_1
    const-class v2, Landroid/media/MediaRecorder;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    .line 34
    .line 35
    .line 36
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    new-instance v2, Lrj6;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    move-object v0, v1

    .line 46
    :goto_1
    move-object v2, v0

    .line 47
    :goto_2
    nop

    .line 48
    instance-of v0, v2, Lrj6;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    move-object v2, v1

    .line 53
    :cond_2
    check-cast v2, [Landroid/util/Size;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    :cond_3
    move-object v0, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    new-instance v0, Lrx0;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-direct {v0, v3}, Lrx0;-><init>(Z)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 66
    .line 67
    .line 68
    array-length v0, v2

    .line 69
    const/4 v3, 0x0

    .line 70
    :goto_3
    if-ge v3, v0, :cond_3

    .line 71
    .line 72
    aget-object v5, v2, v3

    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    sget-object v7, Lcb7;->e:Landroid/util/Size;

    .line 79
    .line 80
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-gt v6, v8, :cond_5

    .line 85
    .line 86
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-gt v6, v7, :cond_5

    .line 95
    .line 96
    move-object v0, v5

    .line 97
    goto :goto_4

    .line 98
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :goto_4
    if-eqz v0, :cond_6

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    sget-object v0, Lcb7;->c:Landroid/util/Size;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :goto_5
    sget-object v2, Lcb7;->b:Landroid/util/Size;

    .line 111
    .line 112
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 115
    .line 116
    .line 117
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 118
    .line 119
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 125
    .line 126
    .line 127
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 135
    .line 136
    .line 137
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v1, Lnz;

    .line 143
    .line 144
    invoke-direct/range {v1 .. v10}, Lnz;-><init>(Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    .line 145
    .line 146
    .line 147
    iput-object v1, p0, Lmx7;->v:Lnz;

    .line 148
    .line 149
    return-void
.end method

.method public final d(ILandroid/util/Size;ZI)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_6

    .line 3
    .line 4
    const/16 p3, 0x22

    .line 5
    .line 6
    if-ne p1, p3, :cond_5

    .line 7
    .line 8
    iget-object p0, p0, Lmx7;->C:Ll03;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ll03;->c(Landroid/util/Size;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-nez p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    const-string p0, "HighSpeedResolver"

    .line 34
    .line 35
    invoke-static {p0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Landroid/util/Range;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Integer;

    .line 61
    .line 62
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Landroid/util/Range;

    .line 73
    .line 74
    invoke-virtual {p2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-gez p3, :cond_2

    .line 85
    .line 86
    move-object p1, p2

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    invoke-static {}, Lbt;->n()V

    .line 97
    .line 98
    .line 99
    return v0

    .line 100
    :cond_5
    const-string p0, "Check failed."

    .line 101
    .line 102
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return v0

    .line 106
    :cond_6
    invoke-virtual {p0}, Lmx7;->j()Lvk7;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const-wide/16 v1, 0x0

    .line 114
    .line 115
    :try_start_0
    iget-object p3, p3, Lvk7;->c:Ly45;

    .line 116
    .line 117
    invoke-virtual {p3, p1, p2}, Ly45;->F(ILandroid/util/Size;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    goto :goto_2

    .line 122
    :catch_0
    invoke-static {}, Lhi5;->m0()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    :cond_7
    move-wide v3, v1

    .line 132
    :goto_2
    cmp-long p1, v3, v1

    .line 133
    .line 134
    if-gtz p1, :cond_9

    .line 135
    .line 136
    iget-boolean p0, p0, Lmx7;->u:Z

    .line 137
    .line 138
    if-eqz p0, :cond_8

    .line 139
    .line 140
    invoke-static {}, Lhi5;->m0()Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_a

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    const v0, 0x7fffffff

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_9
    const-wide p0, 0x41cdcd6500000000L    # 1.0E9

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    long-to-double p2, v3

    .line 160
    div-double/2addr p0, p2

    .line 161
    double-to-int v0, p0

    .line 162
    :cond_a
    :goto_3
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    return p0
.end method

.method public final f(Llx7;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 11

    .line 1
    sget-object v0, Lkl7;->a:Lzx;

    .line 2
    .line 3
    iget v0, p1, Llx7;->a:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    iget v0, p1, Llx7;->b:I

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    if-ne v0, v2, :cond_7

    .line 13
    .line 14
    iget-boolean p1, p1, Llx7;->f:Z

    .line 15
    .line 16
    if-nez p1, :cond_7

    .line 17
    .line 18
    iget-object p1, p0, Lmx7;->h:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_7

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lnx7;

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Lnx7;->c(Ljava/util/ArrayList;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object v2, Lkl7;->a:Lzx;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x0

    .line 49
    move v4, v3

    .line 50
    :goto_0
    const/4 v5, 0x1

    .line 51
    if-ge v4, v2, :cond_6

    .line 52
    .line 53
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Lrx7;

    .line 58
    .line 59
    iget-object v6, v6, Lrx7;->c:Ljl7;

    .line 60
    .line 61
    iget-wide v6, v6, Ljl7;->X:J

    .line 62
    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-interface {p3, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    sget-object v9, Lgr8;->g0:Lgr8;

    .line 72
    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {p3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Lrx;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v8, v8, Lrx;->e:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-ne v10, v5, :cond_1

    .line 95
    .line 96
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    move-object v9, v5

    .line 101
    check-cast v9, Lgr8;

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v9, v6, v7, v8}, Lkl7;->c(Lgr8;JLjava/util/List;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-interface {p4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_5

    .line 122
    .line 123
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {p4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    check-cast v5, Ler8;

    .line 135
    .line 136
    invoke-interface {v5}, Ler8;->s()Lgr8;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-interface {v5}, Ler8;->s()Lgr8;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    if-ne v10, v9, :cond_3

    .line 148
    .line 149
    check-cast v5, Lhl7;

    .line 150
    .line 151
    sget-object v9, Lhl7;->Y:Lzx;

    .line 152
    .line 153
    invoke-interface {v5, v9}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    sget-object v5, Ld02;->X:Ld02;

    .line 164
    .line 165
    :goto_1
    invoke-static {v8, v6, v7, v5}, Lkl7;->c(Lgr8;JLjava/util/List;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-nez v5, :cond_4

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_5
    const-string p0, "SurfaceConfig does not map to any use case"

    .line 176
    .line 177
    invoke-static {p0}, Lbt;->g(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-object v1

    .line 181
    :cond_6
    move v3, v5

    .line 182
    :goto_2
    new-instance v2, La23;

    .line 183
    .line 184
    const/16 v4, 0x18

    .line 185
    .line 186
    invoke-direct {v2, p0, v0, v4}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    new-instance v4, Lvz7;

    .line 190
    .line 191
    invoke-direct {v4, v2}, Lvz7;-><init>(Ldn2;)V

    .line 192
    .line 193
    .line 194
    if-eqz v3, :cond_0

    .line 195
    .line 196
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_0

    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_7
    return-object v1
.end method

.method public final i()Landroid/util/Size;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/16 v0, 0xd

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/16 v0, 0xc

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v0, 0x6

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const/4 v0, 0x5

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    iget-object v2, p0, Lmx7;->b:Lw02;

    .line 74
    .line 75
    invoke-interface {v2, v1}, Lw02;->a(I)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    invoke-interface {v2, v1}, Lw02;->b(I)Lgy;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    iget-object v1, v1, Lgy;->d:Ljava/util/List;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_0

    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast p0, Lhy;

    .line 107
    .line 108
    new-instance v0, Landroid/util/Size;

    .line 109
    .line 110
    iget v1, p0, Lhy;->e:I

    .line 111
    .line 112
    iget p0, p0, Lhy;->f:I

    .line 113
    .line 114
    invoke-direct {v0, v1, p0}, Landroid/util/Size;-><init>(II)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_1
    const/4 p0, 0x0

    .line 119
    return-object p0
.end method

.method public final j()Lvk7;
    .locals 3

    .line 1
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lmx7;->a:Ljj0;

    .line 7
    .line 8
    move-object v1, p0

    .line 9
    check-cast v1, Llf0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, Lvk7;

    .line 20
    .line 21
    new-instance v2, Lue5;

    .line 22
    .line 23
    invoke-direct {v2, p0}, Lue5;-><init>(Ljj0;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, Lvk7;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lue5;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    const-string p0, "Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP"

    .line 31
    .line 32
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public final k(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Z)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lrx;

    .line 21
    .line 22
    iget-object v2, v1, Lrx;->a:Lrx7;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    move-object v3, p6

    .line 38
    invoke-interface {p6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const/4 p3, 0x0

    .line 47
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    add-int/lit8 v1, p3, 0x1

    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v4, v2

    .line 60
    check-cast v4, Landroid/util/Size;

    .line 61
    .line 62
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    check-cast p3, Ler8;

    .line 77
    .line 78
    invoke-interface {p3}, Le63;->n()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-interface {p3}, Ler8;->r()Ljl7;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    sget-object v5, Lrx7;->e:Ljl7;

    .line 87
    .line 88
    invoke-virtual {p0, v3}, Lmx7;->m(I)Lnz;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz p8, :cond_1

    .line 93
    .line 94
    sget-object v6, Lpx7;->X:Lpx7;

    .line 95
    .line 96
    :goto_2
    move-object v7, v6

    .line 97
    move v6, p1

    .line 98
    goto :goto_3

    .line 99
    :cond_1
    sget-object v6, Lpx7;->Y:Lpx7;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :goto_3
    invoke-static/range {v3 .. v8}, Lwe5;->p(ILandroid/util/Size;Lnz;ILpx7;Ljl7;)Lrx7;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/lit8 v3, v3, -0x1

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    move-object/from16 v4, p7

    .line 120
    .line 121
    invoke-interface {v4, v3, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move p3, v1

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    return-object v0
.end method

.method public final l()Lnz;
    .locals 0

    .line 1
    iget-object p0, p0, Lmx7;->v:Lnz;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "surfaceSizeDefinition"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final m(I)Lnz;
    .locals 5

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lmx7;->w:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Lnz;->b:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    sget-object v2, Lcb7;->d:Landroid/util/Size;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v2, p1}, Lmx7;->r(Ljava/util/LinkedHashMap;Landroid/util/Size;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Lnz;->d:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    sget-object v2, Lcb7;->f:Landroid/util/Size;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0, v2, p1}, Lmx7;->r(Ljava/util/LinkedHashMap;Landroid/util/Size;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, Lnz;->f:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p0, v0, p1, v2}, Lmx7;->q(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, Lnz;->g:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    sget-object v3, Lru;->a:Landroid/util/Rational;

    .line 58
    .line 59
    invoke-virtual {p0, v0, p1, v3}, Lmx7;->q(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v0, v0, Lnz;->h:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    sget-object v3, Lru;->c:Landroid/util/Rational;

    .line 69
    .line 70
    invoke-virtual {p0, v0, p1, v3}, Lmx7;->q(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, Lnz;->i:Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    const/16 v4, 0x1f

    .line 82
    .line 83
    if-lt v3, v4, :cond_2

    .line 84
    .line 85
    iget-boolean v3, p0, Lmx7;->s:Z

    .line 86
    .line 87
    if-nez v3, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v4, p0, Lmx7;->a:Ljj0;

    .line 96
    .line 97
    check-cast v4, Llf0;

    .line 98
    .line 99
    invoke-virtual {v4, v3}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 104
    .line 105
    if-nez v3, :cond_1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    const/4 v4, 0x1

    .line 109
    invoke-static {v3, p1, v4, v2}, Lmx7;->e(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_2
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-virtual {p0}, Lmx7;->l()Lnz;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0
.end method

.method public final o(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)Liy7;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    move-object/from16 v8, p4

    .line 10
    .line 11
    move-object/from16 v9, p6

    .line 12
    .line 13
    iget-boolean v10, v1, Llx7;->f:Z

    .line 14
    .line 15
    const-string v11, "CXCP"

    .line 16
    .line 17
    invoke-static {v11}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-boolean v12, v1, Llx7;->g:Z

    .line 27
    .line 28
    iget-object v13, v1, Llx7;->i:Landroid/util/Range;

    .line 29
    .line 30
    sget-object v4, Ld02;->X:Ld02;

    .line 31
    .line 32
    sget-object v18, Lpx7;->Y:Lpx7;

    .line 33
    .line 34
    const-string v2, ". New configs: "

    .line 35
    .line 36
    iget-object v3, v0, Lmx7;->d:Ljava/lang/String;

    .line 37
    .line 38
    const-string v5, "No supported surface combination is found for camera device - Id : "

    .line 39
    .line 40
    const/16 v20, 0x0

    .line 41
    .line 42
    const/4 v15, 0x0

    .line 43
    if-nez v12, :cond_5

    .line 44
    .line 45
    move-object/from16 v21, v2

    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v16

    .line 56
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v17

    .line 60
    if-eqz v17, :cond_1

    .line 61
    .line 62
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v17

    .line 66
    move-object/from16 v14, v17

    .line 67
    .line 68
    check-cast v14, Lrx;

    .line 69
    .line 70
    iget-object v14, v14, Lrx;->a:Lrx7;

    .line 71
    .line 72
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    new-instance v14, Lrx0;

    .line 77
    .line 78
    invoke-direct {v14, v15}, Lrx0;-><init>(Z)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v16

    .line 85
    invoke-interface/range {v16 .. v16}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v22

    .line 89
    :goto_1
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v16

    .line 93
    if-eqz v16, :cond_3

    .line 94
    .line 95
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    move-object/from16 v15, v16

    .line 100
    .line 101
    check-cast v15, Ler8;

    .line 102
    .line 103
    invoke-interface {v7, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v16

    .line 107
    move-object/from16 v23, v3

    .line 108
    .line 109
    move-object/from16 v3, v16

    .line 110
    .line 111
    check-cast v3, Ljava/util/List;

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    if-nez v16, :cond_2

    .line 120
    .line 121
    invoke-static {v3, v14}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Landroid/util/Size;

    .line 126
    .line 127
    move-object/from16 v16, v14

    .line 128
    .line 129
    invoke-interface {v15}, Le63;->n()I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const/16 v24, 0x2e

    .line 134
    .line 135
    invoke-interface {v15}, Ler8;->r()Ljl7;

    .line 136
    .line 137
    .line 138
    move-result-object v19

    .line 139
    sget-object v15, Lrx7;->e:Ljl7;

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-object/from16 v15, v16

    .line 145
    .line 146
    invoke-virtual {v0, v14}, Lmx7;->m(I)Lnz;

    .line 147
    .line 148
    .line 149
    move-result-object v16

    .line 150
    iget v0, v1, Llx7;->a:I

    .line 151
    .line 152
    move-object/from16 v17, v15

    .line 153
    .line 154
    move-object v15, v3

    .line 155
    move-object/from16 v3, v17

    .line 156
    .line 157
    move/from16 v17, v24

    .line 158
    .line 159
    move-object/from16 v24, v11

    .line 160
    .line 161
    move/from16 v11, v17

    .line 162
    .line 163
    move/from16 v17, v0

    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-static/range {v14 .. v19}, Lwe5;->p(ILandroid/util/Size;Lnz;ILpx7;Ljl7;)Lrx7;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move v15, v0

    .line 174
    move-object v14, v3

    .line 175
    move-object/from16 v3, v23

    .line 176
    .line 177
    move-object/from16 v11, v24

    .line 178
    .line 179
    move-object/from16 v0, p0

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_2
    const/16 v11, 0x2e

    .line 183
    .line 184
    const-string v0, "No available output size is found for "

    .line 185
    .line 186
    invoke-static {v11, v15, v0}, Lu52;->f(ILjava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-object v20

    .line 190
    :cond_3
    move-object/from16 v23, v3

    .line 191
    .line 192
    move-object/from16 v24, v11

    .line 193
    .line 194
    move v0, v15

    .line 195
    const/16 v11, 0x2e

    .line 196
    .line 197
    sget-object v3, Le02;->X:Le02;

    .line 198
    .line 199
    move-object v14, v5

    .line 200
    move-object v5, v4

    .line 201
    move/from16 v16, v12

    .line 202
    .line 203
    move-object v11, v14

    .line 204
    move-object/from16 v14, v21

    .line 205
    .line 206
    move-object/from16 v15, v23

    .line 207
    .line 208
    move v12, v0

    .line 209
    move-object/from16 v0, p0

    .line 210
    .line 211
    invoke-virtual/range {v0 .. v5}, Lmx7;->a(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_4

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v2, ". May be attempting to bind too many use cases. Existing surfaces: "

    .line 227
    .line 228
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v2, ". GroupableFeature settings: "

    .line 241
    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const/16 v11, 0x2e

    .line 249
    .line 250
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v1

    .line 267
    :cond_5
    move-object v14, v2

    .line 268
    move-object/from16 v24, v11

    .line 269
    .line 270
    move/from16 v16, v12

    .line 271
    .line 272
    move v12, v15

    .line 273
    move-object v15, v3

    .line 274
    move-object v11, v5

    .line 275
    :goto_2
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 276
    .line 277
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-eqz v5, :cond_c

    .line 293
    .line 294
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    check-cast v5, Ler8;

    .line 299
    .line 300
    new-instance v12, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    move-object/from16 v22, v3

    .line 306
    .line 307
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 308
    .line 309
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v23

    .line 316
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    check-cast v23, Ljava/util/List;

    .line 320
    .line 321
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v23

    .line 325
    :goto_4
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v25

    .line 329
    if-eqz v25, :cond_b

    .line 330
    .line 331
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v25

    .line 335
    move-object/from16 v32, v4

    .line 336
    .line 337
    move-object/from16 v4, v25

    .line 338
    .line 339
    check-cast v4, Landroid/util/Size;

    .line 340
    .line 341
    invoke-interface {v5}, Le63;->n()I

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    invoke-interface {v5, v4}, Ler8;->v(Landroid/util/Size;)I

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    invoke-interface {v5}, Ler8;->r()Ljl7;

    .line 350
    .line 351
    .line 352
    move-result-object v31

    .line 353
    sget-object v25, Lrx7;->e:Ljl7;

    .line 354
    .line 355
    invoke-virtual {v0, v6}, Lmx7;->m(I)Lnz;

    .line 356
    .line 357
    .line 358
    move-result-object v28

    .line 359
    move-object/from16 v27, v4

    .line 360
    .line 361
    iget v4, v1, Llx7;->a:I

    .line 362
    .line 363
    move/from16 v29, v4

    .line 364
    .line 365
    iget-boolean v4, v1, Llx7;->h:Z

    .line 366
    .line 367
    if-eqz v4, :cond_6

    .line 368
    .line 369
    sget-object v4, Lpx7;->X:Lpx7;

    .line 370
    .line 371
    move-object/from16 v30, v4

    .line 372
    .line 373
    :goto_5
    move/from16 v26, v6

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_6
    move-object/from16 v30, v18

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :goto_6
    invoke-static/range {v26 .. v31}, Lwe5;->p(ILandroid/util/Size;Lnz;ILpx7;Ljl7;)Lrx7;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    move-object/from16 v25, v14

    .line 384
    .line 385
    move/from16 v14, v26

    .line 386
    .line 387
    move-object/from16 v6, v27

    .line 388
    .line 389
    iget-object v4, v4, Lrx7;->b:Lox7;

    .line 390
    .line 391
    move-object/from16 v26, v11

    .line 392
    .line 393
    sget-object v11, Liz;->h:Landroid/util/Range;

    .line 394
    .line 395
    invoke-static {v13, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v27

    .line 399
    if-eqz v27, :cond_7

    .line 400
    .line 401
    const v7, 0x7fffffff

    .line 402
    .line 403
    .line 404
    goto :goto_7

    .line 405
    :cond_7
    invoke-virtual {v0, v14, v6, v10, v7}, Lmx7;->d(ILandroid/util/Size;ZI)I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    :goto_7
    if-eqz v16, :cond_8

    .line 410
    .line 411
    sget-object v14, Lox7;->s0:Lox7;

    .line 412
    .line 413
    if-eq v4, v14, :cond_a

    .line 414
    .line 415
    invoke-static {v13, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v11

    .line 419
    if-nez v11, :cond_8

    .line 420
    .line 421
    invoke-virtual {v13}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    check-cast v11, Ljava/lang/Number;

    .line 426
    .line 427
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    if-ge v7, v11, :cond_8

    .line 432
    .line 433
    goto :goto_8

    .line 434
    :cond_8
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    check-cast v11, Ljava/util/Set;

    .line 439
    .line 440
    if-nez v11, :cond_9

    .line 441
    .line 442
    new-instance v11, Ljava/util/LinkedHashSet;

    .line 443
    .line 444
    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-interface {v3, v4, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-interface {v11, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    if-nez v4, :cond_a

    .line 459
    .line 460
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    invoke-interface {v11, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    :cond_a
    :goto_8
    move-object/from16 v6, p2

    .line 471
    .line 472
    move-object/from16 v7, p3

    .line 473
    .line 474
    move-object/from16 v14, v25

    .line 475
    .line 476
    move-object/from16 v11, v26

    .line 477
    .line 478
    move-object/from16 v4, v32

    .line 479
    .line 480
    goto/16 :goto_4

    .line 481
    .line 482
    :cond_b
    move-object/from16 v32, v4

    .line 483
    .line 484
    move-object/from16 v26, v11

    .line 485
    .line 486
    move-object/from16 v25, v14

    .line 487
    .line 488
    invoke-interface {v2, v5, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-object/from16 v6, p2

    .line 492
    .line 493
    move-object/from16 v7, p3

    .line 494
    .line 495
    move-object/from16 v3, v22

    .line 496
    .line 497
    const/4 v12, 0x0

    .line 498
    goto/16 :goto_3

    .line 499
    .line 500
    :cond_c
    move-object/from16 v32, v4

    .line 501
    .line 502
    move-object/from16 v26, v11

    .line 503
    .line 504
    move-object/from16 v25, v14

    .line 505
    .line 506
    new-instance v3, Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    iget-object v11, v0, Lmx7;->a:Ljj0;

    .line 520
    .line 521
    if-eqz v5, :cond_17

    .line 522
    .line 523
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    check-cast v5, Ljava/lang/Number;

    .line 528
    .line 529
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v6

    .line 537
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    check-cast v6, Ljava/util/List;

    .line 545
    .line 546
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    check-cast v5, Ler8;

    .line 551
    .line 552
    invoke-interface {v5}, Le63;->n()I

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    iget-object v7, v0, Lmx7;->A:Ls18;

    .line 557
    .line 558
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    iget-object v7, v0, Lmx7;->x:Lvk7;

    .line 565
    .line 566
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    new-instance v12, Lik0;

    .line 570
    .line 571
    invoke-direct {v12, v11, v7}, Lik0;-><init>(Ljj0;Lvk7;)V

    .line 572
    .line 573
    .line 574
    const-class v7, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 575
    .line 576
    invoke-static {}, Lum1;->a()Li26;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    invoke-virtual {v11, v7}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 581
    .line 582
    .line 583
    move-result-object v7

    .line 584
    check-cast v7, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 585
    .line 586
    if-eqz v7, :cond_d

    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_d
    invoke-virtual {v12}, Lik0;->a()Li26;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    const-class v11, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 594
    .line 595
    invoke-virtual {v7, v11}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 596
    .line 597
    .line 598
    move-result-object v7

    .line 599
    check-cast v7, Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;

    .line 600
    .line 601
    if-eqz v7, :cond_e

    .line 602
    .line 603
    :goto_a
    const/16 v7, 0x100

    .line 604
    .line 605
    invoke-virtual {v0, v7}, Lmx7;->m(I)Lnz;

    .line 606
    .line 607
    .line 608
    move-result-object v11

    .line 609
    iget-object v11, v11, Lnz;->f:Ljava/util/LinkedHashMap;

    .line 610
    .line 611
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 612
    .line 613
    .line 614
    move-result-object v7

    .line 615
    invoke-virtual {v11, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v7

    .line 619
    check-cast v7, Landroid/util/Size;

    .line 620
    .line 621
    if-eqz v7, :cond_e

    .line 622
    .line 623
    new-instance v11, Landroid/util/Rational;

    .line 624
    .line 625
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 626
    .line 627
    .line 628
    move-result v12

    .line 629
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 630
    .line 631
    .line 632
    move-result v7

    .line 633
    invoke-direct {v11, v12, v7}, Landroid/util/Rational;-><init>(II)V

    .line 634
    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_e
    move-object/from16 v11, v20

    .line 638
    .line 639
    :goto_b
    if-nez v11, :cond_f

    .line 640
    .line 641
    new-instance v7, Ljava/util/ArrayList;

    .line 642
    .line 643
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 644
    .line 645
    .line 646
    goto :goto_d

    .line 647
    :cond_f
    new-instance v7, Ljava/util/ArrayList;

    .line 648
    .line 649
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 650
    .line 651
    .line 652
    new-instance v12, Ljava/util/ArrayList;

    .line 653
    .line 654
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 655
    .line 656
    .line 657
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 662
    .line 663
    .line 664
    move-result v14

    .line 665
    if-eqz v14, :cond_11

    .line 666
    .line 667
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v14

    .line 671
    check-cast v14, Landroid/util/Size;

    .line 672
    .line 673
    invoke-static {v11, v14}, Lru;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 674
    .line 675
    .line 676
    move-result v18

    .line 677
    if-eqz v18, :cond_10

    .line 678
    .line 679
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    goto :goto_c

    .line 683
    :cond_10
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_c

    .line 687
    :cond_11
    const/4 v14, 0x0

    .line 688
    invoke-virtual {v12, v14, v7}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 689
    .line 690
    .line 691
    move-object v7, v12

    .line 692
    :goto_d
    sget-object v6, Lrx7;->e:Ljl7;

    .line 693
    .line 694
    sget-object v6, Lrx7;->h:Ljava/util/LinkedHashMap;

    .line 695
    .line 696
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 697
    .line 698
    .line 699
    move-result-object v5

    .line 700
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v5

    .line 704
    check-cast v5, Lqx7;

    .line 705
    .line 706
    if-nez v5, :cond_12

    .line 707
    .line 708
    sget-object v5, Lqx7;->X:Lqx7;

    .line 709
    .line 710
    :cond_12
    iget-object v6, v0, Lmx7;->z:Lsr4;

    .line 711
    .line 712
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    iget-object v6, v6, Lsr4;->a:Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    .line 716
    .line 717
    if-nez v6, :cond_13

    .line 718
    .line 719
    goto :goto_f

    .line 720
    :cond_13
    invoke-static {v5}, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;->b(Lqx7;)Landroid/util/Size;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    if-nez v5, :cond_14

    .line 725
    .line 726
    goto :goto_f

    .line 727
    :cond_14
    new-instance v6, Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 736
    .line 737
    .line 738
    move-result-object v7

    .line 739
    :cond_15
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v11

    .line 743
    if-eqz v11, :cond_16

    .line 744
    .line 745
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v11

    .line 749
    check-cast v11, Landroid/util/Size;

    .line 750
    .line 751
    invoke-static {v11, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v12

    .line 755
    if-nez v12, :cond_15

    .line 756
    .line 757
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    goto :goto_e

    .line 761
    :cond_16
    move-object v7, v6

    .line 762
    :goto_f
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    goto/16 :goto_9

    .line 766
    .line 767
    :cond_17
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 768
    .line 769
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 770
    .line 771
    .line 772
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 773
    .line 774
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 775
    .line 776
    .line 777
    iget-object v12, v0, Lmx7;->C:Ll03;

    .line 778
    .line 779
    if-eqz v10, :cond_1b

    .line 780
    .line 781
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-eqz v2, :cond_19

    .line 789
    .line 790
    move-object/from16 v4, v32

    .line 791
    .line 792
    :cond_18
    move-object/from16 v22, v6

    .line 793
    .line 794
    const/16 p3, 0x1

    .line 795
    .line 796
    goto :goto_12

    .line 797
    :cond_19
    invoke-static {v3}, Ll03;->a(Ljava/util/List;)Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    new-instance v4, Ljava/util/ArrayList;

    .line 802
    .line 803
    const/16 v5, 0xa

    .line 804
    .line 805
    invoke-static {v2, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 806
    .line 807
    .line 808
    move-result v5

    .line 809
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 810
    .line 811
    .line 812
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    if-eqz v5, :cond_18

    .line 821
    .line 822
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    check-cast v5, Landroid/util/Size;

    .line 827
    .line 828
    const/16 p3, 0x1

    .line 829
    .line 830
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 831
    .line 832
    .line 833
    move-result v14

    .line 834
    move-object/from16 v18, v2

    .line 835
    .line 836
    new-instance v2, Ljava/util/ArrayList;

    .line 837
    .line 838
    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 839
    .line 840
    .line 841
    move-object/from16 v22, v6

    .line 842
    .line 843
    const/4 v6, 0x0

    .line 844
    :goto_11
    if-ge v6, v14, :cond_1a

    .line 845
    .line 846
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    add-int/lit8 v6, v6, 0x1

    .line 850
    .line 851
    goto :goto_11

    .line 852
    :cond_1a
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-object/from16 v2, v18

    .line 856
    .line 857
    move-object/from16 v6, v22

    .line 858
    .line 859
    goto :goto_10

    .line 860
    :goto_12
    move-object/from16 v29, v4

    .line 861
    .line 862
    goto/16 :goto_18

    .line 863
    .line 864
    :cond_1b
    move-object/from16 v22, v6

    .line 865
    .line 866
    const/16 p3, 0x1

    .line 867
    .line 868
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    move/from16 v4, p3

    .line 873
    .line 874
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 875
    .line 876
    .line 877
    move-result v5

    .line 878
    if-eqz v5, :cond_1c

    .line 879
    .line 880
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v5

    .line 884
    check-cast v5, Ljava/util/List;

    .line 885
    .line 886
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 887
    .line 888
    .line 889
    move-result v5

    .line 890
    mul-int/2addr v4, v5

    .line 891
    goto :goto_13

    .line 892
    :cond_1c
    if-eqz v4, :cond_58

    .line 893
    .line 894
    new-instance v2, Ljava/util/ArrayList;

    .line 895
    .line 896
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 897
    .line 898
    .line 899
    const/4 v5, 0x0

    .line 900
    :goto_14
    if-ge v5, v4, :cond_1d

    .line 901
    .line 902
    new-instance v6, Ljava/util/ArrayList;

    .line 903
    .line 904
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    add-int/lit8 v5, v5, 0x1

    .line 911
    .line 912
    goto :goto_14

    .line 913
    :cond_1d
    const/4 v14, 0x0

    .line 914
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v5

    .line 918
    check-cast v5, Ljava/util/List;

    .line 919
    .line 920
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 921
    .line 922
    .line 923
    move-result v5

    .line 924
    div-int v5, v4, v5

    .line 925
    .line 926
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 927
    .line 928
    .line 929
    move-result v6

    .line 930
    move/from16 v18, v4

    .line 931
    .line 932
    const/4 v14, 0x0

    .line 933
    :goto_15
    if-ge v14, v6, :cond_20

    .line 934
    .line 935
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v23

    .line 939
    move/from16 v27, v5

    .line 940
    .line 941
    move-object/from16 v5, v23

    .line 942
    .line 943
    check-cast v5, Ljava/util/List;

    .line 944
    .line 945
    move/from16 v23, v6

    .line 946
    .line 947
    const/4 v6, 0x0

    .line 948
    :goto_16
    if-ge v6, v4, :cond_1e

    .line 949
    .line 950
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v28

    .line 954
    move-object/from16 v29, v2

    .line 955
    .line 956
    move-object/from16 v2, v28

    .line 957
    .line 958
    check-cast v2, Ljava/util/List;

    .line 959
    .line 960
    rem-int v28, v6, v18

    .line 961
    .line 962
    move/from16 v30, v4

    .line 963
    .line 964
    div-int v4, v28, v27

    .line 965
    .line 966
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v4

    .line 970
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    add-int/lit8 v6, v6, 0x1

    .line 974
    .line 975
    move-object/from16 v2, v29

    .line 976
    .line 977
    move/from16 v4, v30

    .line 978
    .line 979
    goto :goto_16

    .line 980
    :cond_1e
    move-object/from16 v29, v2

    .line 981
    .line 982
    move/from16 v30, v4

    .line 983
    .line 984
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 985
    .line 986
    .line 987
    move-result v2

    .line 988
    add-int/lit8 v2, v2, -0x1

    .line 989
    .line 990
    if-ge v14, v2, :cond_1f

    .line 991
    .line 992
    add-int/lit8 v2, v14, 0x1

    .line 993
    .line 994
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    check-cast v2, Ljava/util/List;

    .line 999
    .line 1000
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1001
    .line 1002
    .line 1003
    move-result v2

    .line 1004
    div-int v5, v27, v2

    .line 1005
    .line 1006
    move/from16 v18, v27

    .line 1007
    .line 1008
    goto :goto_17

    .line 1009
    :cond_1f
    move/from16 v5, v27

    .line 1010
    .line 1011
    :goto_17
    add-int/lit8 v14, v14, 0x1

    .line 1012
    .line 1013
    move/from16 v6, v23

    .line 1014
    .line 1015
    move-object/from16 v2, v29

    .line 1016
    .line 1017
    move/from16 v4, v30

    .line 1018
    .line 1019
    goto :goto_15

    .line 1020
    :cond_20
    move-object/from16 v29, v2

    .line 1021
    .line 1022
    :goto_18
    sget-object v2, Lkl7;->a:Lzx;

    .line 1023
    .line 1024
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    :cond_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1029
    .line 1030
    .line 1031
    move-result v3

    .line 1032
    if-eqz v3, :cond_22

    .line 1033
    .line 1034
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    check-cast v3, Lrx;

    .line 1039
    .line 1040
    iget-object v4, v3, Lrx;->e:Ljava/util/List;

    .line 1041
    .line 1042
    const/4 v14, 0x0

    .line 1043
    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    check-cast v4, Lgr8;

    .line 1048
    .line 1049
    iget-object v3, v3, Lrx;->f:Ll11;

    .line 1050
    .line 1051
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1055
    .line 1056
    .line 1057
    invoke-static {v3, v4}, Lkl7;->e(Ll11;Lgr8;)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v3

    .line 1061
    if-eqz v3, :cond_21

    .line 1062
    .line 1063
    :goto_19
    move/from16 v2, p3

    .line 1064
    .line 1065
    goto :goto_1a

    .line 1066
    :cond_22
    const/4 v14, 0x0

    .line 1067
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    :cond_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    if-eqz v3, :cond_24

    .line 1076
    .line 1077
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v3

    .line 1081
    check-cast v3, Ler8;

    .line 1082
    .line 1083
    invoke-interface {v3}, Ler8;->s()Lgr8;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v4

    .line 1087
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    invoke-static {v3, v4}, Lkl7;->e(Ll11;Lgr8;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v3

    .line 1094
    if-eqz v3, :cond_23

    .line 1095
    .line 1096
    goto :goto_19

    .line 1097
    :cond_24
    move v2, v14

    .line 1098
    :goto_1a
    iget-boolean v3, v0, Lmx7;->r:Z

    .line 1099
    .line 1100
    if-eqz v3, :cond_27

    .line 1101
    .line 1102
    if-nez v2, :cond_27

    .line 1103
    .line 1104
    invoke-interface/range {v29 .. v29}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v17

    .line 1108
    move-object/from16 v2, v20

    .line 1109
    .line 1110
    :goto_1b
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v3

    .line 1114
    if-eqz v3, :cond_26

    .line 1115
    .line 1116
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v2

    .line 1120
    move-object v3, v2

    .line 1121
    check-cast v3, Ljava/util/List;

    .line 1122
    .line 1123
    move-object v2, v1

    .line 1124
    iget v1, v2, Llx7;->a:I

    .line 1125
    .line 1126
    const/4 v8, 0x0

    .line 1127
    move-object/from16 v4, p4

    .line 1128
    .line 1129
    move-object/from16 v5, p5

    .line 1130
    .line 1131
    move-object v14, v2

    .line 1132
    move-object/from16 v6, v22

    .line 1133
    .line 1134
    move-object/from16 v2, p2

    .line 1135
    .line 1136
    invoke-virtual/range {v0 .. v8}, Lmx7;->k(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Z)Ljava/util/ArrayList;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    move-object v3, v6

    .line 1141
    move-object v4, v7

    .line 1142
    invoke-virtual {v0, v14, v1, v3, v4}, Lmx7;->f(Llx7;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    if-eqz v2, :cond_25

    .line 1147
    .line 1148
    goto :goto_1c

    .line 1149
    :cond_25
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    .line 1153
    .line 1154
    .line 1155
    move-object/from16 v8, p4

    .line 1156
    .line 1157
    move-object/from16 v22, v3

    .line 1158
    .line 1159
    move-object v7, v4

    .line 1160
    move-object v1, v14

    .line 1161
    const/4 v14, 0x0

    .line 1162
    goto :goto_1b

    .line 1163
    :cond_26
    move-object v14, v1

    .line 1164
    move-object v4, v7

    .line 1165
    move-object/from16 v3, v22

    .line 1166
    .line 1167
    :goto_1c
    invoke-static/range {v24 .. v24}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    if-eqz v1, :cond_28

    .line 1172
    .line 1173
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    goto :goto_1d

    .line 1177
    :cond_27
    move-object v14, v1

    .line 1178
    move-object v4, v7

    .line 1179
    move-object/from16 v3, v22

    .line 1180
    .line 1181
    move-object/from16 v2, v20

    .line 1182
    .line 1183
    :cond_28
    :goto_1d
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v1

    .line 1187
    const v5, 0x7fffffff

    .line 1188
    .line 1189
    .line 1190
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v6

    .line 1194
    if-eqz v6, :cond_29

    .line 1195
    .line 1196
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v6

    .line 1200
    check-cast v6, Lrx;

    .line 1201
    .line 1202
    iget v7, v6, Lrx;->b:I

    .line 1203
    .line 1204
    iget-object v8, v6, Lrx;->c:Landroid/util/Size;

    .line 1205
    .line 1206
    iget v6, v6, Lrx;->j:I

    .line 1207
    .line 1208
    invoke-virtual {v0, v7, v8, v10, v6}, Lmx7;->d(ILandroid/util/Size;ZI)I

    .line 1209
    .line 1210
    .line 1211
    move-result v6

    .line 1212
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 1213
    .line 1214
    .line 1215
    move-result v5

    .line 1216
    goto :goto_1e

    .line 1217
    :cond_29
    invoke-interface/range {v29 .. v29}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v17

    .line 1221
    move-object/from16 v27, v20

    .line 1222
    .line 1223
    move-object/from16 v28, v27

    .line 1224
    .line 1225
    const v1, 0x7fffffff

    .line 1226
    .line 1227
    .line 1228
    const v6, 0x7fffffff

    .line 1229
    .line 1230
    .line 1231
    const/16 v22, 0x0

    .line 1232
    .line 1233
    const/16 v23, 0x0

    .line 1234
    .line 1235
    :goto_1f
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 1236
    .line 1237
    .line 1238
    move-result v7

    .line 1239
    const-string v29, "Required value was null."

    .line 1240
    .line 1241
    if-eqz v7, :cond_3a

    .line 1242
    .line 1243
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v7

    .line 1247
    check-cast v7, Ljava/util/List;

    .line 1248
    .line 1249
    move v8, v6

    .line 1250
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 1251
    .line 1252
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1253
    .line 1254
    .line 1255
    move-object/from16 v30, v3

    .line 1256
    .line 1257
    move-object v3, v7

    .line 1258
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1259
    .line 1260
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1261
    .line 1262
    .line 1263
    move/from16 v31, v1

    .line 1264
    .line 1265
    iget v1, v14, Llx7;->a:I

    .line 1266
    .line 1267
    move/from16 v32, v8

    .line 1268
    .line 1269
    iget-boolean v8, v14, Llx7;->h:Z

    .line 1270
    .line 1271
    move-object/from16 v34, v4

    .line 1272
    .line 1273
    move-object/from16 v33, v30

    .line 1274
    .line 1275
    move/from16 v14, v31

    .line 1276
    .line 1277
    move-object/from16 v4, p4

    .line 1278
    .line 1279
    move-object/from16 v31, v11

    .line 1280
    .line 1281
    move-object/from16 v30, v15

    .line 1282
    .line 1283
    move/from16 v11, v32

    .line 1284
    .line 1285
    move v15, v5

    .line 1286
    move-object/from16 v32, v12

    .line 1287
    .line 1288
    move-object/from16 v5, p5

    .line 1289
    .line 1290
    move-object v12, v2

    .line 1291
    move-object/from16 v2, p2

    .line 1292
    .line 1293
    invoke-virtual/range {v0 .. v8}, Lmx7;->k(ILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Z)Ljava/util/ArrayList;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v1

    .line 1297
    move-object v8, v3

    .line 1298
    move-object v2, v6

    .line 1299
    move-object v3, v7

    .line 1300
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v6

    .line 1304
    move-object/from16 v35, v1

    .line 1305
    .line 1306
    move v7, v15

    .line 1307
    const/4 v1, 0x0

    .line 1308
    :goto_20
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1309
    .line 1310
    .line 1311
    move-result v36

    .line 1312
    if-eqz v36, :cond_2a

    .line 1313
    .line 1314
    add-int/lit8 v36, v1, 0x1

    .line 1315
    .line 1316
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v37

    .line 1320
    move-object/from16 v38, v6

    .line 1321
    .line 1322
    move-object/from16 v6, v37

    .line 1323
    .line 1324
    check-cast v6, Landroid/util/Size;

    .line 1325
    .line 1326
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v1

    .line 1330
    check-cast v1, Ljava/lang/Number;

    .line 1331
    .line 1332
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1333
    .line 1334
    .line 1335
    move-result v1

    .line 1336
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    check-cast v1, Ler8;

    .line 1341
    .line 1342
    invoke-interface {v1}, Le63;->n()I

    .line 1343
    .line 1344
    .line 1345
    move-result v4

    .line 1346
    invoke-interface {v1, v6}, Ler8;->v(Landroid/util/Size;)I

    .line 1347
    .line 1348
    .line 1349
    move-result v1

    .line 1350
    invoke-virtual {v0, v4, v6, v10, v1}, Lmx7;->d(ILandroid/util/Size;ZI)I

    .line 1351
    .line 1352
    .line 1353
    move-result v1

    .line 1354
    invoke-static {v7, v1}, Ljava/lang/Math;->min(II)I

    .line 1355
    .line 1356
    .line 1357
    move-result v7

    .line 1358
    move-object/from16 v4, p4

    .line 1359
    .line 1360
    move/from16 v1, v36

    .line 1361
    .line 1362
    move-object/from16 v6, v38

    .line 1363
    .line 1364
    goto :goto_20

    .line 1365
    :cond_2a
    sget-object v1, Liz;->h:Landroid/util/Range;

    .line 1366
    .line 1367
    invoke-static {v13, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v1

    .line 1371
    if-nez v1, :cond_2b

    .line 1372
    .line 1373
    if-ge v7, v15, :cond_2b

    .line 1374
    .line 1375
    invoke-virtual {v13}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v1

    .line 1379
    check-cast v1, Ljava/lang/Number;

    .line 1380
    .line 1381
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1382
    .line 1383
    .line 1384
    move-result v1

    .line 1385
    if-ge v7, v1, :cond_2b

    .line 1386
    .line 1387
    const/16 v36, 0x0

    .line 1388
    .line 1389
    goto :goto_21

    .line 1390
    :cond_2b
    move/from16 v36, p3

    .line 1391
    .line 1392
    :goto_21
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 1393
    .line 1394
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    const/4 v6, 0x0

    .line 1402
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1403
    .line 1404
    .line 1405
    move-result v37

    .line 1406
    if-eqz v37, :cond_30

    .line 1407
    .line 1408
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v37

    .line 1412
    add-int/lit8 v38, v6, 0x1

    .line 1413
    .line 1414
    if-ltz v6, :cond_2f

    .line 1415
    .line 1416
    move-object/from16 v0, v37

    .line 1417
    .line 1418
    check-cast v0, Lrx7;

    .line 1419
    .line 1420
    move-object/from16 v37, v1

    .line 1421
    .line 1422
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v1

    .line 1426
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v1

    .line 1430
    check-cast v1, Lrx;

    .line 1431
    .line 1432
    if-eqz v1, :cond_2c

    .line 1433
    .line 1434
    iget-object v1, v1, Lrx;->d:Lpx1;

    .line 1435
    .line 1436
    if-nez v1, :cond_2d

    .line 1437
    .line 1438
    :cond_2c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v1

    .line 1442
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v1

    .line 1446
    invoke-virtual {v9, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v1

    .line 1450
    if-eqz v1, :cond_2e

    .line 1451
    .line 1452
    check-cast v1, Lpx1;

    .line 1453
    .line 1454
    :cond_2d
    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-object/from16 v0, p0

    .line 1458
    .line 1459
    move-object/from16 v1, v37

    .line 1460
    .line 1461
    move/from16 v6, v38

    .line 1462
    .line 1463
    goto :goto_22

    .line 1464
    :cond_2e
    invoke-static/range {v29 .. v29}, Lbt;->q(Ljava/lang/String;)V

    .line 1465
    .line 1466
    .line 1467
    return-object v20

    .line 1468
    :cond_2f
    invoke-static {}, Li21;->X()V

    .line 1469
    .line 1470
    .line 1471
    throw v20

    .line 1472
    :cond_30
    new-instance v0, Lwc6;

    .line 1473
    .line 1474
    move v1, v7

    .line 1475
    const/4 v7, 0x1

    .line 1476
    move-object v6, v5

    .line 1477
    move-object/from16 v37, v8

    .line 1478
    .line 1479
    move-object/from16 v39, v12

    .line 1480
    .line 1481
    move/from16 v38, v15

    .line 1482
    .line 1483
    move-object/from16 v8, p2

    .line 1484
    .line 1485
    move-object/from16 v5, p4

    .line 1486
    .line 1487
    move v12, v1

    .line 1488
    move-object v15, v3

    .line 1489
    move-object/from16 v3, v35

    .line 1490
    .line 1491
    move-object/from16 v1, p0

    .line 1492
    .line 1493
    move/from16 v35, v10

    .line 1494
    .line 1495
    move-object v10, v2

    .line 1496
    move-object/from16 v2, p1

    .line 1497
    .line 1498
    invoke-direct/range {v0 .. v7}, Lwc6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1499
    .line 1500
    .line 1501
    move-object v4, v2

    .line 1502
    move-object v2, v0

    .line 1503
    move-object v0, v1

    .line 1504
    move-object v1, v4

    .line 1505
    move-object v4, v5

    .line 1506
    move-object v5, v6

    .line 1507
    sget-object v6, Lw74;->Y:Lw74;

    .line 1508
    .line 1509
    invoke-static {v6, v2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v2

    .line 1513
    if-nez v22, :cond_34

    .line 1514
    .line 1515
    invoke-interface {v2}, Lg44;->getValue()Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    check-cast v2, Ljava/lang/Boolean;

    .line 1520
    .line 1521
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1522
    .line 1523
    .line 1524
    move-result v2

    .line 1525
    if-eqz v2, :cond_34

    .line 1526
    .line 1527
    const v2, 0x7fffffff

    .line 1528
    .line 1529
    .line 1530
    if-ne v14, v2, :cond_31

    .line 1531
    .line 1532
    goto :goto_23

    .line 1533
    :cond_31
    if-ge v14, v12, :cond_32

    .line 1534
    .line 1535
    :goto_23
    move v14, v12

    .line 1536
    move-object/from16 v27, v37

    .line 1537
    .line 1538
    :cond_32
    if-eqz v36, :cond_34

    .line 1539
    .line 1540
    if-eqz v23, :cond_33

    .line 1541
    .line 1542
    move/from16 v44, v11

    .line 1543
    .line 1544
    move v14, v12

    .line 1545
    move-object/from16 v42, v28

    .line 1546
    .line 1547
    move-object/from16 v41, v37

    .line 1548
    .line 1549
    goto/16 :goto_28

    .line 1550
    .line 1551
    :cond_33
    move/from16 v22, p3

    .line 1552
    .line 1553
    move v14, v12

    .line 1554
    move-object/from16 v27, v37

    .line 1555
    .line 1556
    :cond_34
    if-eqz v39, :cond_39

    .line 1557
    .line 1558
    if-nez v23, :cond_39

    .line 1559
    .line 1560
    invoke-virtual {v0, v1, v3, v10, v15}, Lmx7;->f(Llx7;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v2

    .line 1564
    if-eqz v2, :cond_39

    .line 1565
    .line 1566
    const v2, 0x7fffffff

    .line 1567
    .line 1568
    .line 1569
    if-ne v11, v2, :cond_35

    .line 1570
    .line 1571
    goto :goto_24

    .line 1572
    :cond_35
    if-ge v11, v12, :cond_36

    .line 1573
    .line 1574
    :goto_24
    move v6, v12

    .line 1575
    move-object/from16 v28, v37

    .line 1576
    .line 1577
    goto :goto_25

    .line 1578
    :cond_36
    move v6, v11

    .line 1579
    :goto_25
    if-eqz v36, :cond_38

    .line 1580
    .line 1581
    if-eqz v22, :cond_37

    .line 1582
    .line 1583
    move/from16 v44, v12

    .line 1584
    .line 1585
    move-object/from16 v41, v27

    .line 1586
    .line 1587
    move-object/from16 v42, v37

    .line 1588
    .line 1589
    goto/16 :goto_28

    .line 1590
    .line 1591
    :cond_37
    move v2, v14

    .line 1592
    move-object v14, v1

    .line 1593
    move v1, v2

    .line 1594
    move/from16 v23, p3

    .line 1595
    .line 1596
    move v6, v12

    .line 1597
    move-object/from16 v15, v30

    .line 1598
    .line 1599
    move-object/from16 v11, v31

    .line 1600
    .line 1601
    move-object/from16 v12, v32

    .line 1602
    .line 1603
    move-object/from16 v3, v33

    .line 1604
    .line 1605
    move-object/from16 v4, v34

    .line 1606
    .line 1607
    move/from16 v10, v35

    .line 1608
    .line 1609
    move-object/from16 v28, v37

    .line 1610
    .line 1611
    :goto_26
    move/from16 v5, v38

    .line 1612
    .line 1613
    move-object/from16 v2, v39

    .line 1614
    .line 1615
    goto/16 :goto_1f

    .line 1616
    .line 1617
    :cond_38
    move v2, v14

    .line 1618
    move-object v14, v1

    .line 1619
    move v1, v2

    .line 1620
    :goto_27
    move-object/from16 v15, v30

    .line 1621
    .line 1622
    move-object/from16 v11, v31

    .line 1623
    .line 1624
    move-object/from16 v12, v32

    .line 1625
    .line 1626
    move-object/from16 v3, v33

    .line 1627
    .line 1628
    move-object/from16 v4, v34

    .line 1629
    .line 1630
    move/from16 v10, v35

    .line 1631
    .line 1632
    goto :goto_26

    .line 1633
    :cond_39
    move v2, v14

    .line 1634
    move-object v14, v1

    .line 1635
    move v1, v2

    .line 1636
    move v6, v11

    .line 1637
    goto :goto_27

    .line 1638
    :cond_3a
    move-object v5, v14

    .line 1639
    move v14, v1

    .line 1640
    move-object v1, v5

    .line 1641
    move-object/from16 v8, p2

    .line 1642
    .line 1643
    move-object/from16 v5, p5

    .line 1644
    .line 1645
    move-object/from16 v39, v2

    .line 1646
    .line 1647
    move-object/from16 v33, v3

    .line 1648
    .line 1649
    move-object/from16 v34, v4

    .line 1650
    .line 1651
    move/from16 v35, v10

    .line 1652
    .line 1653
    move-object/from16 v31, v11

    .line 1654
    .line 1655
    move-object/from16 v32, v12

    .line 1656
    .line 1657
    move-object/from16 v30, v15

    .line 1658
    .line 1659
    move-object/from16 v4, p4

    .line 1660
    .line 1661
    move v11, v6

    .line 1662
    move/from16 v44, v11

    .line 1663
    .line 1664
    move-object/from16 v41, v27

    .line 1665
    .line 1666
    move-object/from16 v42, v28

    .line 1667
    .line 1668
    :goto_28
    if-nez v41, :cond_3c

    .line 1669
    .line 1670
    :cond_3b
    :goto_29
    move-object/from16 v2, v20

    .line 1671
    .line 1672
    goto :goto_2a

    .line 1673
    :cond_3c
    if-eqz v16, :cond_3d

    .line 1674
    .line 1675
    sget-object v2, Liz;->h:Landroid/util/Range;

    .line 1676
    .line 1677
    invoke-static {v13, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v2

    .line 1681
    if-nez v2, :cond_3d

    .line 1682
    .line 1683
    const v2, 0x7fffffff

    .line 1684
    .line 1685
    .line 1686
    if-eq v14, v2, :cond_3b

    .line 1687
    .line 1688
    invoke-virtual {v13}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v2

    .line 1692
    check-cast v2, Ljava/lang/Number;

    .line 1693
    .line 1694
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1695
    .line 1696
    .line 1697
    move-result v2

    .line 1698
    if-ge v14, v2, :cond_3d

    .line 1699
    .line 1700
    goto :goto_29

    .line 1701
    :cond_3d
    new-instance v40, Ljx7;

    .line 1702
    .line 1703
    const v45, 0x7fffffff

    .line 1704
    .line 1705
    .line 1706
    move/from16 v43, v14

    .line 1707
    .line 1708
    invoke-direct/range {v40 .. v45}, Ljx7;-><init>(Ljava/util/List;Ljava/util/List;III)V

    .line 1709
    .line 1710
    .line 1711
    move-object/from16 v2, v40

    .line 1712
    .line 1713
    :goto_2a
    if-eqz v2, :cond_57

    .line 1714
    .line 1715
    iget v0, v2, Ljx7;->c:I

    .line 1716
    .line 1717
    iget-object v3, v2, Ljx7;->a:Ljava/util/List;

    .line 1718
    .line 1719
    invoke-static/range {v24 .. v24}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 1720
    .line 1721
    .line 1722
    move-result v6

    .line 1723
    if-eqz v6, :cond_3e

    .line 1724
    .line 1725
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1726
    .line 1727
    .line 1728
    :cond_3e
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 1729
    .line 1730
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1731
    .line 1732
    .line 1733
    sget-object v7, Liz;->h:Landroid/util/Range;

    .line 1734
    .line 1735
    invoke-static {v13, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1736
    .line 1737
    .line 1738
    move-result v10

    .line 1739
    if-nez v10, :cond_43

    .line 1740
    .line 1741
    if-eqz v35, :cond_3f

    .line 1742
    .line 1743
    move-object/from16 v10, v32

    .line 1744
    .line 1745
    invoke-virtual {v10, v3}, Ll03;->b(Ljava/util/List;)[Landroid/util/Range;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v7

    .line 1749
    goto :goto_2b

    .line 1750
    :cond_3f
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 1751
    .line 1752
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1753
    .line 1754
    .line 1755
    move-object/from16 v11, v31

    .line 1756
    .line 1757
    check-cast v11, Llf0;

    .line 1758
    .line 1759
    invoke-virtual {v11, v7}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v7

    .line 1763
    check-cast v7, [Landroid/util/Range;

    .line 1764
    .line 1765
    :goto_2b
    invoke-static {v13, v0, v7}, Lmx7;->c(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v10

    .line 1769
    if-nez v16, :cond_40

    .line 1770
    .line 1771
    iget-boolean v11, v1, Llx7;->j:Z

    .line 1772
    .line 1773
    if-eqz v11, :cond_41

    .line 1774
    .line 1775
    :cond_40
    invoke-virtual {v10, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v11

    .line 1779
    if-eqz v11, :cond_42

    .line 1780
    .line 1781
    :cond_41
    move-object v7, v10

    .line 1782
    goto :goto_2c

    .line 1783
    :cond_42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1784
    .line 1785
    const-string v2, "Target FPS range "

    .line 1786
    .line 1787
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1791
    .line 1792
    .line 1793
    const-string v2, " is not supported. Max FPS supported by the calculated best combination: "

    .line 1794
    .line 1795
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1799
    .line 1800
    .line 1801
    const-string v0, ". Calculated best FPS range for device: "

    .line 1802
    .line 1803
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1807
    .line 1808
    .line 1809
    invoke-static {v7}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1814
    .line 1815
    .line 1816
    const-string v2, ". Device supported FPS ranges: "

    .line 1817
    .line 1818
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1822
    .line 1823
    .line 1824
    const/16 v11, 0x2e

    .line 1825
    .line 1826
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v0

    .line 1833
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1834
    .line 1835
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v0

    .line 1839
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1840
    .line 1841
    .line 1842
    throw v1

    .line 1843
    :cond_43
    move-object/from16 v10, v32

    .line 1844
    .line 1845
    if-eqz v35, :cond_44

    .line 1846
    .line 1847
    invoke-virtual {v10, v3}, Ll03;->b(Ljava/util/List;)[Landroid/util/Range;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v7

    .line 1851
    sget-object v10, Ll03;->f:Landroid/util/Range;

    .line 1852
    .line 1853
    invoke-static {v10, v0, v7}, Lmx7;->c(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v7

    .line 1857
    :cond_44
    :goto_2c
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v4

    .line 1861
    const/4 v15, 0x0

    .line 1862
    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1863
    .line 1864
    .line 1865
    move-result v10

    .line 1866
    const-string v11, "Null expectedFrameRateRange"

    .line 1867
    .line 1868
    if-eqz v10, :cond_4c

    .line 1869
    .line 1870
    add-int/lit8 v10, v15, 0x1

    .line 1871
    .line 1872
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v12

    .line 1876
    check-cast v12, Ler8;

    .line 1877
    .line 1878
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v13

    .line 1882
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 1883
    .line 1884
    .line 1885
    move-result v13

    .line 1886
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v13

    .line 1890
    check-cast v13, Landroid/util/Size;

    .line 1891
    .line 1892
    invoke-static {v13}, Liz;->a(Landroid/util/Size;)Lxy0;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v13

    .line 1896
    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v14

    .line 1900
    iput-object v14, v13, Lxy0;->g0:Ljava/lang/Object;

    .line 1901
    .line 1902
    invoke-virtual {v9, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v14

    .line 1906
    if-eqz v14, :cond_4b

    .line 1907
    .line 1908
    check-cast v14, Lpx1;

    .line 1909
    .line 1910
    iput-object v14, v13, Lxy0;->f0:Ljava/lang/Object;

    .line 1911
    .line 1912
    sget-object v14, Lkl7;->a:Lzx;

    .line 1913
    .line 1914
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1915
    .line 1916
    .line 1917
    invoke-static {}, Lk05;->j()Lk05;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v14

    .line 1921
    sget-object v15, Lgg0;->n0:Lzx;

    .line 1922
    .line 1923
    invoke-interface {v12, v15}, Lb76;->h(Lzx;)Z

    .line 1924
    .line 1925
    .line 1926
    move-result v16

    .line 1927
    move-object/from16 p0, v4

    .line 1928
    .line 1929
    if-eqz v16, :cond_45

    .line 1930
    .line 1931
    invoke-interface {v12, v15}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v4

    .line 1935
    invoke-virtual {v14, v15, v4}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 1936
    .line 1937
    .line 1938
    :cond_45
    sget-object v4, Ler8;->U:Lzx;

    .line 1939
    .line 1940
    invoke-interface {v12, v4}, Lb76;->h(Lzx;)Z

    .line 1941
    .line 1942
    .line 1943
    move-result v15

    .line 1944
    if-eqz v15, :cond_46

    .line 1945
    .line 1946
    invoke-interface {v12, v4}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v15

    .line 1950
    invoke-virtual {v14, v4, v15}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 1951
    .line 1952
    .line 1953
    :cond_46
    sget-object v4, Ly53;->Y:Lzx;

    .line 1954
    .line 1955
    invoke-interface {v12, v4}, Lb76;->h(Lzx;)Z

    .line 1956
    .line 1957
    .line 1958
    move-result v15

    .line 1959
    if-eqz v15, :cond_47

    .line 1960
    .line 1961
    invoke-interface {v12, v4}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v15

    .line 1965
    invoke-virtual {v14, v4, v15}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 1966
    .line 1967
    .line 1968
    :cond_47
    sget-object v4, Le63;->p:Lzx;

    .line 1969
    .line 1970
    invoke-interface {v12, v4}, Lb76;->h(Lzx;)Z

    .line 1971
    .line 1972
    .line 1973
    move-result v15

    .line 1974
    if-eqz v15, :cond_48

    .line 1975
    .line 1976
    invoke-interface {v12, v4}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v15

    .line 1980
    invoke-virtual {v14, v4, v15}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 1981
    .line 1982
    .line 1983
    :cond_48
    new-instance v4, Lgg0;

    .line 1984
    .line 1985
    const/16 v15, 0x12

    .line 1986
    .line 1987
    invoke-direct {v4, v14, v15}, Lwl6;-><init>(Ljava/lang/Object;B)V

    .line 1988
    .line 1989
    .line 1990
    iput-object v4, v13, Lxy0;->i0:Ljava/lang/Object;

    .line 1991
    .line 1992
    iget-boolean v4, v1, Llx7;->c:Z

    .line 1993
    .line 1994
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v4

    .line 1998
    iput-object v4, v13, Lxy0;->j0:Ljava/lang/Object;

    .line 1999
    .line 2000
    sget-object v4, Liz;->h:Landroid/util/Range;

    .line 2001
    .line 2002
    invoke-static {v7, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2003
    .line 2004
    .line 2005
    move-result v4

    .line 2006
    if-nez v4, :cond_4a

    .line 2007
    .line 2008
    if-eqz v7, :cond_49

    .line 2009
    .line 2010
    iput-object v7, v13, Lxy0;->h0:Ljava/lang/Object;

    .line 2011
    .line 2012
    goto :goto_2e

    .line 2013
    :cond_49
    invoke-static {v11}, Lb61;->i(Ljava/lang/String;)V

    .line 2014
    .line 2015
    .line 2016
    return-object v20

    .line 2017
    :cond_4a
    :goto_2e
    invoke-virtual {v13}, Lxy0;->b()Liz;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v4

    .line 2021
    invoke-interface {v6, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2022
    .line 2023
    .line 2024
    move-object/from16 v4, p0

    .line 2025
    .line 2026
    move v15, v10

    .line 2027
    goto/16 :goto_2d

    .line 2028
    .line 2029
    :cond_4b
    invoke-static/range {v29 .. v29}, Lbt;->i(Ljava/lang/String;)V

    .line 2030
    .line 2031
    .line 2032
    return-object v20

    .line 2033
    :cond_4c
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 2034
    .line 2035
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2036
    .line 2037
    .line 2038
    if-eqz v39, :cond_56

    .line 2039
    .line 2040
    iget-object v4, v2, Ljx7;->b:Ljava/util/List;

    .line 2041
    .line 2042
    iget v5, v2, Ljx7;->d:I

    .line 2043
    .line 2044
    if-ne v0, v5, :cond_56

    .line 2045
    .line 2046
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2047
    .line 2048
    .line 2049
    move-result v0

    .line 2050
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2051
    .line 2052
    .line 2053
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 2054
    .line 2055
    .line 2056
    move-result v5

    .line 2057
    if-ne v0, v5, :cond_56

    .line 2058
    .line 2059
    invoke-static {v3, v4}, Lwv0;->e1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v0

    .line 2063
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2064
    .line 2065
    .line 2066
    move-result v3

    .line 2067
    if-eqz v3, :cond_4e

    .line 2068
    .line 2069
    :cond_4d
    move-object/from16 v0, v31

    .line 2070
    .line 2071
    goto :goto_2f

    .line 2072
    :cond_4e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v0

    .line 2076
    :cond_4f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2077
    .line 2078
    .line 2079
    move-result v3

    .line 2080
    if-eqz v3, :cond_4d

    .line 2081
    .line 2082
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v3

    .line 2086
    check-cast v3, Lqg5;

    .line 2087
    .line 2088
    iget-object v4, v3, Lqg5;->X:Ljava/lang/Object;

    .line 2089
    .line 2090
    iget-object v3, v3, Lqg5;->Y:Ljava/lang/Object;

    .line 2091
    .line 2092
    invoke-static {v4, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2093
    .line 2094
    .line 2095
    move-result v3

    .line 2096
    if-nez v3, :cond_4f

    .line 2097
    .line 2098
    goto/16 :goto_32

    .line 2099
    .line 2100
    :goto_2f
    invoke-static {v0, v8, v6, v1}, Lkl7;->f(Ljj0;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z

    .line 2101
    .line 2102
    .line 2103
    move-result v0

    .line 2104
    if-nez v0, :cond_56

    .line 2105
    .line 2106
    invoke-interface/range {v39 .. v39}, Ljava/util/Collection;->size()I

    .line 2107
    .line 2108
    .line 2109
    move-result v0

    .line 2110
    const/4 v15, 0x0

    .line 2111
    :goto_30
    if-ge v15, v0, :cond_56

    .line 2112
    .line 2113
    move-object/from16 v12, v39

    .line 2114
    .line 2115
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v3

    .line 2119
    check-cast v3, Lrx7;

    .line 2120
    .line 2121
    iget-object v3, v3, Lrx7;->c:Ljl7;

    .line 2122
    .line 2123
    iget-wide v3, v3, Ljl7;->X:J

    .line 2124
    .line 2125
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v5

    .line 2129
    move-object/from16 v7, v33

    .line 2130
    .line 2131
    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2132
    .line 2133
    .line 2134
    move-result v5

    .line 2135
    if-eqz v5, :cond_53

    .line 2136
    .line 2137
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v5

    .line 2141
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v5

    .line 2145
    check-cast v5, Lrx;

    .line 2146
    .line 2147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2148
    .line 2149
    .line 2150
    iget-object v8, v5, Lrx;->f:Ll11;

    .line 2151
    .line 2152
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2153
    .line 2154
    .line 2155
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v3

    .line 2159
    invoke-static {v8, v3}, Lkl7;->b(Ll11;Ljava/lang/Long;)Lgg0;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v3

    .line 2163
    if-eqz v3, :cond_50

    .line 2164
    .line 2165
    iget-object v4, v5, Lrx;->c:Landroid/util/Size;

    .line 2166
    .line 2167
    invoke-static {v4}, Liz;->a(Landroid/util/Size;)Lxy0;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v4

    .line 2171
    iget v8, v5, Lrx;->g:I

    .line 2172
    .line 2173
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v8

    .line 2177
    iput-object v8, v4, Lxy0;->g0:Ljava/lang/Object;

    .line 2178
    .line 2179
    iget-object v8, v5, Lrx;->h:Landroid/util/Range;

    .line 2180
    .line 2181
    if-eqz v8, :cond_52

    .line 2182
    .line 2183
    iput-object v8, v4, Lxy0;->h0:Ljava/lang/Object;

    .line 2184
    .line 2185
    iget-object v8, v5, Lrx;->d:Lpx1;

    .line 2186
    .line 2187
    if-eqz v8, :cond_51

    .line 2188
    .line 2189
    iput-object v8, v4, Lxy0;->f0:Ljava/lang/Object;

    .line 2190
    .line 2191
    iput-object v3, v4, Lxy0;->i0:Ljava/lang/Object;

    .line 2192
    .line 2193
    invoke-virtual {v4}, Lxy0;->b()Liz;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v3

    .line 2197
    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2198
    .line 2199
    .line 2200
    :cond_50
    move-object/from16 v8, v34

    .line 2201
    .line 2202
    goto :goto_31

    .line 2203
    :cond_51
    const-string v0, "Null dynamicRange"

    .line 2204
    .line 2205
    invoke-static {v0}, Lb61;->i(Ljava/lang/String;)V

    .line 2206
    .line 2207
    .line 2208
    return-object v20

    .line 2209
    :cond_52
    invoke-static {v11}, Lb61;->i(Ljava/lang/String;)V

    .line 2210
    .line 2211
    .line 2212
    return-object v20

    .line 2213
    :cond_53
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v5

    .line 2217
    move-object/from16 v8, v34

    .line 2218
    .line 2219
    invoke-interface {v8, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2220
    .line 2221
    .line 2222
    move-result v5

    .line 2223
    if-eqz v5, :cond_55

    .line 2224
    .line 2225
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v5

    .line 2229
    invoke-virtual {v8, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v5

    .line 2233
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2234
    .line 2235
    .line 2236
    check-cast v5, Ler8;

    .line 2237
    .line 2238
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v9

    .line 2242
    check-cast v9, Liz;

    .line 2243
    .line 2244
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2245
    .line 2246
    .line 2247
    iget-object v10, v9, Liz;->f:Ll11;

    .line 2248
    .line 2249
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2250
    .line 2251
    .line 2252
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v3

    .line 2256
    invoke-static {v10, v3}, Lkl7;->b(Ll11;Ljava/lang/Long;)Lgg0;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v3

    .line 2260
    if-eqz v3, :cond_54

    .line 2261
    .line 2262
    invoke-virtual {v9}, Liz;->b()Lxy0;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v4

    .line 2266
    iput-object v3, v4, Lxy0;->i0:Ljava/lang/Object;

    .line 2267
    .line 2268
    invoke-virtual {v4}, Lxy0;->b()Liz;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v3

    .line 2272
    invoke-interface {v6, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2273
    .line 2274
    .line 2275
    :cond_54
    :goto_31
    add-int/lit8 v15, v15, 0x1

    .line 2276
    .line 2277
    move-object/from16 v33, v7

    .line 2278
    .line 2279
    move-object/from16 v34, v8

    .line 2280
    .line 2281
    move-object/from16 v39, v12

    .line 2282
    .line 2283
    goto/16 :goto_30

    .line 2284
    .line 2285
    :cond_55
    const-string v0, "SurfaceConfig does not map to any use case"

    .line 2286
    .line 2287
    invoke-static {v0}, Lbt;->g(Ljava/lang/Object;)V

    .line 2288
    .line 2289
    .line 2290
    return-object v20

    .line 2291
    :cond_56
    :goto_32
    new-instance v0, Liy7;

    .line 2292
    .line 2293
    iget v2, v2, Ljx7;->e:I

    .line 2294
    .line 2295
    invoke-direct {v0, v6, v1, v2}, Liy7;-><init>(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)V

    .line 2296
    .line 2297
    .line 2298
    return-object v0

    .line 2299
    :cond_57
    const-string v1, " and Hardware level: "

    .line 2300
    .line 2301
    move-object/from16 v11, v26

    .line 2302
    .line 2303
    move-object/from16 v15, v30

    .line 2304
    .line 2305
    invoke-static {v11, v15, v1}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v1

    .line 2309
    iget v0, v0, Lmx7;->e:I

    .line 2310
    .line 2311
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2312
    .line 2313
    .line 2314
    const-string v0, ". May be the specified resolution is too large and not supported. Existing surfaces: "

    .line 2315
    .line 2316
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2317
    .line 2318
    .line 2319
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2320
    .line 2321
    .line 2322
    move-object/from16 v14, v25

    .line 2323
    .line 2324
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2325
    .line 2326
    .line 2327
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2328
    .line 2329
    .line 2330
    const/16 v11, 0x2e

    .line 2331
    .line 2332
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2333
    .line 2334
    .line 2335
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v0

    .line 2339
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 2340
    .line 2341
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v0

    .line 2345
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2346
    .line 2347
    .line 2348
    throw v1

    .line 2349
    :cond_58
    const-string v0, "Failed to find supported resolutions."

    .line 2350
    .line 2351
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 2352
    .line 2353
    .line 2354
    return-object v20
.end method

.method public final p(IILandroid/util/Size;Ljl7;)Lrx7;
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrx7;->e:Ljl7;

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lmx7;->m(I)Lnz;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    sget-object v5, Lpx7;->Y:Lpx7;

    .line 11
    .line 12
    move v4, p1

    .line 13
    move v1, p2

    .line 14
    move-object v2, p3

    .line 15
    move-object v6, p4

    .line 16
    invoke-static/range {v1 .. v6}, Lwe5;->p(ILandroid/util/Size;Lnz;ILpx7;Ljl7;)Lrx7;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final q(Ljava/util/LinkedHashMap;ILandroid/util/Rational;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lmx7;->x:Lvk7;

    .line 2
    .line 3
    iget-object p0, p0, Lvk7;->c:Ly45;

    .line 4
    .line 5
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, p2, v0, p3}, Lmx7;->e(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p1, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final r(Ljava/util/LinkedHashMap;Landroid/util/Size;I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmx7;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lmx7;->x:Lvk7;

    .line 7
    .line 8
    iget-object p0, p0, Lvk7;->c:Ly45;

    .line 9
    .line 10
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, p3, v1, v0}, Lmx7;->e(Landroid/hardware/camera2/params/StreamConfigurationMap;IZLandroid/util/Rational;)Landroid/util/Size;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    filled-new-array {p2, p0}, [Landroid/util/Size;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance p2, Lrx0;

    .line 36
    .line 37
    invoke-direct {p2, v1}, Lrx0;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p2}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    move-object p2, p0

    .line 45
    check-cast p2, Landroid/util/Size;

    .line 46
    .line 47
    :goto_0
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final s(Llx7;)V
    .locals 12

    .line 1
    iget v0, p1, Llx7;->a:I

    .line 2
    .line 3
    iget-boolean v1, p1, Llx7;->g:Z

    .line 4
    .line 5
    const-string v2, "CONCURRENT_CAMERA"

    .line 6
    .line 7
    const-string v3, "ULTRA_HIGH_RESOLUTION_CAMERA"

    .line 8
    .line 9
    const-string v4, "DEFAULT"

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const-string v7, " camera mode."

    .line 14
    .line 15
    iget-object v8, p0, Lmx7;->d:Ljava/lang/String;

    .line 16
    .line 17
    const-string v9, "Camera device Id is "

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-boolean v10, p1, Llx7;->e:Z

    .line 22
    .line 23
    if-nez v10, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const-string p0, ". Ultra HDR is not currently supported in "

    .line 27
    .line 28
    invoke-static {v9, v8, p0}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eq v0, v6, :cond_2

    .line 33
    .line 34
    if-eq v0, v5, :cond_1

    .line 35
    .line 36
    move-object v2, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v3

    .line 39
    :cond_2
    :goto_0
    invoke-static {p0, v2, v7}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    :goto_1
    if-eqz v0, :cond_7

    .line 48
    .line 49
    iget v10, p1, Llx7;->b:I

    .line 50
    .line 51
    const/16 v11, 0xa

    .line 52
    .line 53
    if-eq v10, v11, :cond_4

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    const-string p0, ". 10 bit dynamic range is not currently supported in "

    .line 57
    .line 58
    invoke-static {v9, v8, p0}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eq v0, v6, :cond_6

    .line 63
    .line 64
    if-eq v0, v5, :cond_5

    .line 65
    .line 66
    move-object v2, v4

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    move-object v2, v3

    .line 69
    :cond_6
    :goto_2
    invoke-static {p0, v2, v7}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_7
    :goto_3
    if-eqz v0, :cond_b

    .line 78
    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_8
    const-string p0, ". feature combination is not currently supported in "

    .line 83
    .line 84
    invoke-static {v9, v8, p0}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eq v0, v6, :cond_a

    .line 89
    .line 90
    if-eq v0, v5, :cond_9

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    goto :goto_4

    .line 94
    :cond_9
    move-object v2, v3

    .line 95
    :cond_a
    :goto_4
    invoke-static {p0, v2, v7}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_b
    :goto_5
    iget-boolean p1, p1, Llx7;->f:Z

    .line 104
    .line 105
    if-eqz p1, :cond_d

    .line 106
    .line 107
    if-nez v1, :cond_c

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_c
    const-string p0, "High-speed session is not supported with feature combination"

    .line 111
    .line 112
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_d
    :goto_6
    if-eqz p1, :cond_f

    .line 117
    .line 118
    iget-object p0, p0, Lmx7;->C:Ll03;

    .line 119
    .line 120
    iget-object p0, p0, Ll03;->b:Lvz7;

    .line 121
    .line 122
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_e

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_e
    const-string p0, "High-speed session is not supported on this device."

    .line 136
    .line 137
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_f
    :goto_7
    return-void
.end method

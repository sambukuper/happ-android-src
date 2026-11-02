.class public abstract Ltx4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltx4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/Class;)Lgr6;
    .locals 40

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p0 .. p0}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, La09;

    .line 9
    .line 10
    invoke-direct {v1, v0}, La09;-><init>(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ltx4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lgr6;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    return-object v4

    .line 32
    :cond_0
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object v21, Loy1;->G0:Loy1;

    .line 36
    .line 37
    new-instance v6, Ly45;

    .line 38
    .line 39
    invoke-direct {v6, v0}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Ly45;

    .line 43
    .line 44
    const-class v4, Ldn8;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, v4}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Llr5;

    .line 57
    .line 58
    const/4 v4, 0x5

    .line 59
    invoke-direct {v5, v0, v4}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    new-instance v7, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v8, "runtime module for "

    .line 65
    .line 66
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v18, Lqe4;->r0:Lqe4;

    .line 77
    .line 78
    move v7, v4

    .line 79
    new-instance v4, Lve4;

    .line 80
    .line 81
    const-string v8, "DeserializationComponentsForJava.ModuleData"

    .line 82
    .line 83
    invoke-direct {v4, v8}, Lve4;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v8, Lrs3;

    .line 87
    .line 88
    invoke-direct {v8, v4}, Lrs3;-><init>(Lve4;)V

    .line 89
    .line 90
    .line 91
    new-instance v11, Lwx4;

    .line 92
    .line 93
    new-instance v9, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v10, "<"

    .line 96
    .line 97
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 v0, 0x3e

    .line 104
    .line 105
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lv15;->g(Ljava/lang/String;)Lv15;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const/16 v9, 0x38

    .line 117
    .line 118
    invoke-direct {v11, v0, v4, v8, v9}, Lwx4;-><init>(Lv15;Lve4;Lzz3;I)V

    .line 119
    .line 120
    .line 121
    iget-object v9, v4, Lve4;->a:Lt97;

    .line 122
    .line 123
    invoke-interface {v9}, Lt97;->lock()V

    .line 124
    .line 125
    .line 126
    :try_start_0
    iget-object v0, v8, Lzz3;->a:Lwx4;

    .line 127
    .line 128
    if-nez v0, :cond_a

    .line 129
    .line 130
    iput-object v11, v8, Lzz3;->a:Lwx4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    invoke-interface {v9}, Lt97;->unlock()V

    .line 133
    .line 134
    .line 135
    new-instance v0, Lps3;

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    invoke-direct {v0, v11, v9}, Lps3;-><init>(Lwx4;B)V

    .line 139
    .line 140
    .line 141
    iput-object v0, v8, Lrs3;->f:Lps3;

    .line 142
    .line 143
    move v0, v7

    .line 144
    new-instance v7, Lzl1;

    .line 145
    .line 146
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v10, Llr5;

    .line 150
    .line 151
    const/16 v12, 0xd

    .line 152
    .line 153
    invoke-direct {v10, v12, v9}, Llr5;-><init>(BZ)V

    .line 154
    .line 155
    .line 156
    new-instance v12, Lz47;

    .line 157
    .line 158
    invoke-direct {v12, v4, v11}, Lz47;-><init>(Lve4;Lvx4;)V

    .line 159
    .line 160
    .line 161
    move-object v13, v10

    .line 162
    sget-object v10, Lqe4;->m0:Lqe4;

    .line 163
    .line 164
    new-instance v14, Lb24;

    .line 165
    .line 166
    const/16 v15, 0x9

    .line 167
    .line 168
    const/4 v0, 0x1

    .line 169
    invoke-direct {v14, v0, v15, v9}, Lb24;-><init>(III)V

    .line 170
    .line 171
    .line 172
    new-instance v15, Lo8;

    .line 173
    .line 174
    sget-object v0, Lel3;->d:Lfl3;

    .line 175
    .line 176
    iget-object v9, v0, Lfl3;->b:Lb24;

    .line 177
    .line 178
    if-eqz v9, :cond_2

    .line 179
    .line 180
    iget v9, v9, Lb24;->f0:I

    .line 181
    .line 182
    move-object/from16 v17, v3

    .line 183
    .line 184
    iget v3, v14, Lb24;->f0:I

    .line 185
    .line 186
    sub-int/2addr v9, v3

    .line 187
    if-gtz v9, :cond_3

    .line 188
    .line 189
    iget-object v0, v0, Lfl3;->c:Lje6;

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_2
    move-object/from16 v17, v3

    .line 193
    .line 194
    :cond_3
    iget-object v0, v0, Lfl3;->a:Lje6;

    .line 195
    .line 196
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    sget-object v3, Lje6;->Z:Lje6;

    .line 200
    .line 201
    const/16 v19, 0x0

    .line 202
    .line 203
    if-ne v0, v3, :cond_4

    .line 204
    .line 205
    move-object/from16 v3, v19

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_4
    move-object v3, v0

    .line 209
    :goto_1
    new-instance v9, Lis3;

    .line 210
    .line 211
    invoke-direct {v9, v0, v3}, Lis3;-><init>(Lje6;Lje6;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lf0;

    .line 215
    .line 216
    const/16 v3, 0x11

    .line 217
    .line 218
    invoke-direct {v0, v14, v3}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 219
    .line 220
    .line 221
    invoke-direct {v15, v9, v0}, Lo8;-><init>(Lis3;Lf0;)V

    .line 222
    .line 223
    .line 224
    new-instance v3, Lc6;

    .line 225
    .line 226
    move-object v0, v8

    .line 227
    new-instance v8, Lg55;

    .line 228
    .line 229
    invoke-direct {v8, v4}, Lg55;-><init>(Lve4;)V

    .line 230
    .line 231
    .line 232
    new-instance v9, Lhc6;

    .line 233
    .line 234
    invoke-direct {v9, v11, v12}, Lhc6;-><init>(Lwx4;Lz47;)V

    .line 235
    .line 236
    .line 237
    move-object/from16 v29, v12

    .line 238
    .line 239
    move-object v12, v9

    .line 240
    move-object v9, v13

    .line 241
    new-instance v13, Lmm;

    .line 242
    .line 243
    invoke-direct {v13, v15}, Le0;-><init>(Lo8;)V

    .line 244
    .line 245
    .line 246
    new-instance v14, Lwe5;

    .line 247
    .line 248
    move-object/from16 v20, v0

    .line 249
    .line 250
    new-instance v0, Lk32;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    move-object/from16 v22, v3

    .line 256
    .line 257
    const/16 v3, 0x16

    .line 258
    .line 259
    invoke-direct {v14, v0, v3}, Lwe5;-><init>(Ljava/lang/Object;B)V

    .line 260
    .line 261
    .line 262
    sget-object v0, Lp45;->b:Lo45;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    sget-object v33, Lo45;->b:Lq45;

    .line 268
    .line 269
    new-instance v0, Lra;

    .line 270
    .line 271
    const/16 v3, 0x19

    .line 272
    .line 273
    move-object/from16 v23, v4

    .line 274
    .line 275
    const/4 v4, 0x0

    .line 276
    invoke-direct {v0, v3, v4}, Lra;-><init>(BZ)V

    .line 277
    .line 278
    .line 279
    move-object/from16 p0, v17

    .line 280
    .line 281
    move-object/from16 v17, v0

    .line 282
    .line 283
    move-object/from16 v0, p0

    .line 284
    .line 285
    move-object/from16 v37, v1

    .line 286
    .line 287
    move-object/from16 v38, v2

    .line 288
    .line 289
    move/from16 v39, v4

    .line 290
    .line 291
    move-object/from16 v16, v15

    .line 292
    .line 293
    move-object/from16 p0, v20

    .line 294
    .line 295
    move-object/from16 v3, v22

    .line 296
    .line 297
    move-object/from16 v4, v23

    .line 298
    .line 299
    move-object/from16 v1, v29

    .line 300
    .line 301
    move-object/from16 v15, v33

    .line 302
    .line 303
    const/4 v2, 0x5

    .line 304
    invoke-direct/range {v3 .. v17}, Lc6;-><init>(Lve4;Llr5;Ly45;Lzl1;Lg55;Llr5;Lqe4;Lwx4;Lhc6;Lmm;Lwe5;Lp45;Lo8;Lra;)V

    .line 305
    .line 306
    .line 307
    move-object v5, v6

    .line 308
    move-object v6, v3

    .line 309
    move-object v3, v5

    .line 310
    move-object v5, v7

    .line 311
    move-object v7, v11

    .line 312
    new-instance v10, Lw44;

    .line 313
    .line 314
    invoke-direct {v10, v6}, Lw44;-><init>(Lc6;)V

    .line 315
    .line 316
    .line 317
    sget-object v6, Lhv4;->g:Lhv4;

    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    new-instance v8, Lzz2;

    .line 323
    .line 324
    invoke-direct {v8, v3, v5, v2}, Lzz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 325
    .line 326
    .line 327
    move-object v13, v9

    .line 328
    new-instance v9, Lfu6;

    .line 329
    .line 330
    invoke-direct {v9, v7, v1, v4, v3}, Lfu6;-><init>(Lwx4;Lz47;Lve4;Ly45;)V

    .line 331
    .line 332
    .line 333
    iput-object v6, v9, Lfu6;->i0:Ljava/lang/Object;

    .line 334
    .line 335
    sget-object v2, Lqg1;->a:Lqg1;

    .line 336
    .line 337
    invoke-static {v2}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v20

    .line 341
    iget-object v2, v7, Lwx4;->h0:Lzz3;

    .line 342
    .line 343
    instance-of v6, v2, Lrs3;

    .line 344
    .line 345
    if-eqz v6, :cond_5

    .line 346
    .line 347
    move-object/from16 v19, v2

    .line 348
    .line 349
    check-cast v19, Lrs3;

    .line 350
    .line 351
    :cond_5
    move-object v2, v5

    .line 352
    new-instance v5, Lhl1;

    .line 353
    .line 354
    sget-object v12, Loy1;->D0:Loy1;

    .line 355
    .line 356
    if-eqz v19, :cond_6

    .line 357
    .line 358
    invoke-virtual/range {v19 .. v19}, Lrs3;->L()Lus3;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    if-eqz v6, :cond_6

    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_6
    sget-object v6, Loy1;->Z:Loy1;

    .line 366
    .line 367
    :goto_2
    if-eqz v19, :cond_7

    .line 368
    .line 369
    invoke-virtual/range {v19 .. v19}, Lrs3;->L()Lus3;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    if-eqz v11, :cond_7

    .line 374
    .line 375
    :goto_3
    move-object/from16 v16, v11

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :cond_7
    sget-object v11, Lqe4;->o0:Lqe4;

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :goto_4
    sget-object v17, Lmu3;->a:Lr62;

    .line 382
    .line 383
    new-instance v11, Lg55;

    .line 384
    .line 385
    invoke-direct {v11, v4}, Lg55;-><init>(Lve4;)V

    .line 386
    .line 387
    .line 388
    move-object v14, v13

    .line 389
    sget-object v13, Ld02;->X:Ld02;

    .line 390
    .line 391
    move-object/from16 v19, v14

    .line 392
    .line 393
    move-object v14, v1

    .line 394
    move-object/from16 v1, v19

    .line 395
    .line 396
    move-object/from16 v19, v11

    .line 397
    .line 398
    move-object/from16 v11, v18

    .line 399
    .line 400
    move-object/from16 v18, v15

    .line 401
    .line 402
    move-object v15, v6

    .line 403
    move-object v6, v4

    .line 404
    invoke-direct/range {v5 .. v21}, Lhl1;-><init>(Lve4;Lvx4;Lis0;Lvl;Lwf5;Ll32;Lde2;Ljava/lang/Iterable;Lz47;Li7;Lpo5;Lr62;Lp45;Lg55;Ljava/util/List;Lm22;)V

    .line 405
    .line 406
    .line 407
    move-object/from16 v15, v18

    .line 408
    .line 409
    iput-object v5, v2, Lzl1;->a:Lhl1;

    .line 410
    .line 411
    new-instance v6, Lq02;

    .line 412
    .line 413
    const/16 v8, 0xa

    .line 414
    .line 415
    invoke-direct {v6, v10, v8}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 416
    .line 417
    .line 418
    iput-object v6, v1, Llr5;->Y:Ljava/lang/Object;

    .line 419
    .line 420
    new-instance v1, Lws3;

    .line 421
    .line 422
    invoke-virtual/range {p0 .. p0}, Lrs3;->L()Lus3;

    .line 423
    .line 424
    .line 425
    move-result-object v30

    .line 426
    invoke-virtual/range {p0 .. p0}, Lrs3;->L()Lus3;

    .line 427
    .line 428
    .line 429
    move-result-object v31

    .line 430
    new-instance v6, Lg55;

    .line 431
    .line 432
    invoke-direct {v6, v4}, Lg55;-><init>(Lve4;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-direct {v1, v4, v0, v7}, Lws3;-><init>(Lve4;Ly45;Lwx4;)V

    .line 442
    .line 443
    .line 444
    new-instance v22, Lhl1;

    .line 445
    .line 446
    new-instance v0, Lvk1;

    .line 447
    .line 448
    const/4 v8, 0x1

    .line 449
    invoke-direct {v0, v1, v8}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 450
    .line 451
    .line 452
    new-instance v9, Ldq;

    .line 453
    .line 454
    sget-object v11, Lja0;->m:Lja0;

    .line 455
    .line 456
    invoke-direct {v9, v7, v14, v11}, Ldq;-><init>(Lvx4;Lz47;Lja0;)V

    .line 457
    .line 458
    .line 459
    new-instance v12, Lha0;

    .line 460
    .line 461
    invoke-direct {v12, v4, v7}, Lha0;-><init>(Lve4;Lwx4;)V

    .line 462
    .line 463
    .line 464
    new-instance v13, Los3;

    .line 465
    .line 466
    invoke-direct {v13, v4, v7}, Los3;-><init>(Lve4;Lwx4;)V

    .line 467
    .line 468
    .line 469
    move/from16 v36, v8

    .line 470
    .line 471
    const/4 v8, 0x2

    .line 472
    move-object/from16 v25, v0

    .line 473
    .line 474
    new-array v0, v8, [Lls0;

    .line 475
    .line 476
    aput-object v12, v0, v39

    .line 477
    .line 478
    aput-object v13, v0, v36

    .line 479
    .line 480
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v28

    .line 484
    iget-object v0, v11, Lja0;->a:Lr62;

    .line 485
    .line 486
    const/high16 v35, 0x40000

    .line 487
    .line 488
    move-object/from16 v32, v0

    .line 489
    .line 490
    move-object/from16 v27, v1

    .line 491
    .line 492
    move-object/from16 v23, v4

    .line 493
    .line 494
    move-object/from16 v34, v6

    .line 495
    .line 496
    move-object/from16 v24, v7

    .line 497
    .line 498
    move-object/from16 v26, v9

    .line 499
    .line 500
    move-object/from16 v29, v14

    .line 501
    .line 502
    move-object/from16 v33, v15

    .line 503
    .line 504
    invoke-direct/range {v22 .. v35}, Lhl1;-><init>(Lve4;Lvx4;Lvk1;Ldq;Lwf5;Ljava/lang/Iterable;Lz47;Li7;Lpo5;Lr62;Lp45;Lg55;I)V

    .line 505
    .line 506
    .line 507
    move-object/from16 v1, v22

    .line 508
    .line 509
    move-object/from16 v0, v27

    .line 510
    .line 511
    iput-object v1, v0, Lws3;->c:Lhl1;

    .line 512
    .line 513
    filled-new-array {v7}, [Lwx4;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v1}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    new-instance v4, Lux4;

    .line 522
    .line 523
    invoke-direct {v4, v1}, Lux4;-><init>(Ljava/util/List;)V

    .line 524
    .line 525
    .line 526
    iput-object v4, v7, Lwx4;->k0:Lux4;

    .line 527
    .line 528
    new-instance v1, Lj01;

    .line 529
    .line 530
    new-array v4, v8, [Lwf5;

    .line 531
    .line 532
    aput-object v10, v4, v39

    .line 533
    .line 534
    const/16 v36, 0x1

    .line 535
    .line 536
    aput-object v0, v4, v36

    .line 537
    .line 538
    invoke-static {v4}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    new-instance v4, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    const-string v6, "CompositeProvider@RuntimeModuleData for "

    .line 545
    .line 546
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-direct {v1, v0, v4}, Lj01;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    iput-object v1, v7, Lwx4;->l0:Lwf5;

    .line 560
    .line 561
    new-instance v0, Lgr6;

    .line 562
    .line 563
    new-instance v1, Lf63;

    .line 564
    .line 565
    invoke-direct {v1, v2, v3}, Lf63;-><init>(Lzl1;Ly45;)V

    .line 566
    .line 567
    .line 568
    invoke-direct {v0, v5, v1}, Lgr6;-><init>(Lhl1;Lf63;)V

    .line 569
    .line 570
    .line 571
    :goto_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 572
    .line 573
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    move-object/from16 v2, v37

    .line 577
    .line 578
    move-object/from16 v3, v38

    .line 579
    .line 580
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 585
    .line 586
    if-nez v1, :cond_8

    .line 587
    .line 588
    return-object v0

    .line 589
    :cond_8
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    check-cast v4, Lgr6;

    .line 594
    .line 595
    if-eqz v4, :cond_9

    .line 596
    .line 597
    return-object v4

    .line 598
    :cond_9
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-object/from16 v37, v2

    .line 602
    .line 603
    move-object/from16 v38, v3

    .line 604
    .line 605
    goto :goto_5

    .line 606
    :cond_a
    move-object/from16 p0, v8

    .line 607
    .line 608
    move-object v7, v11

    .line 609
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 610
    .line 611
    new-instance v1, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    const-string v2, "Built-ins module is already set: "

    .line 614
    .line 615
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    move-object/from16 v2, p0

    .line 619
    .line 620
    iget-object v2, v2, Lzz3;->a:Lwx4;

    .line 621
    .line 622
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string v2, " (attempting to reset to "

    .line 626
    .line 627
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    const-string v2, ")"

    .line 634
    .line 635
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 646
    :catchall_0
    move-exception v0

    .line 647
    :try_start_2
    iget-object v1, v4, Lve4;->b:Lqe4;

    .line 648
    .line 649
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 653
    :catchall_1
    move-exception v0

    .line 654
    invoke-interface {v9}, Lt97;->unlock()V

    .line 655
    .line 656
    .line 657
    throw v0
.end method

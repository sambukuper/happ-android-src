.class public abstract Lq12;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Llh4;->a1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Ll39;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll39;->a:Lx39;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v1}, Ll39;->b(Ll39;Ljava/util/HashSet;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lx39;->j0:Lxy0;

    .line 18
    .line 19
    iget-object v2, v0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lql6;->b()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v1, p0}, Lz51;->q(Landroidx/work/impl/WorkDatabase;Lxy0;Ll39;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lq12;->b(Ll39;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-virtual {v2}, Lql6;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lql6;->l()V

    .line 41
    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    iget-object p0, v0, Lx39;->m0:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v1, v2, p0}, Lax6;->b(Lxy0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    invoke-virtual {v2}, Lql6;->l()V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_1
    const-string v0, "WorkContinuation has cycles ("

    .line 57
    .line 58
    const-string v1, ")"

    .line 59
    .line 60
    invoke-static {v0, p0, v1}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static b(Ll39;)Z
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ll39;->g:Ljava/util/List;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_2

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ll39;

    .line 24
    .line 25
    iget-boolean v5, v4, Ll39;->h:Z

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    invoke-static {v4}, Lq12;->b(Ll39;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    or-int/2addr v3, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Llh4;->P0()Llh4;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v6, ", "

    .line 40
    .line 41
    iget-object v4, v4, Ll39;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {v6, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v3, v2

    .line 51
    :cond_2
    invoke-static {v0}, Ll39;->c(Ll39;)Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v4, v0, Ll39;->a:Lx39;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v5, v4, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 61
    .line 62
    iget-object v6, v0, Ll39;->d:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-array v7, v2, [Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, [Ljava/lang/String;

    .line 74
    .line 75
    iget-object v7, v0, Ll39;->b:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v8, v0, Ll39;->c:Lg62;

    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v9, v4, Lx39;->j0:Lxy0;

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v9, v4, Lx39;->l0:Ly5;

    .line 88
    .line 89
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    array-length v11, v1

    .line 100
    if-nez v11, :cond_3

    .line 101
    .line 102
    const/4 v11, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move v11, v2

    .line 105
    :goto_1
    xor-int/lit8 v13, v11, 0x1

    .line 106
    .line 107
    sget-object v14, Lu39;->Z:Lu39;

    .line 108
    .line 109
    sget-object v15, Lu39;->h0:Lu39;

    .line 110
    .line 111
    sget-object v12, Lu39;->f0:Lu39;

    .line 112
    .line 113
    if-nez v11, :cond_9

    .line 114
    .line 115
    array-length v2, v1

    .line 116
    move-object/from16 v19, v1

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    const/16 v16, 0x1

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    :goto_2
    if-ge v1, v2, :cond_a

    .line 126
    .line 127
    move/from16 v20, v1

    .line 128
    .line 129
    aget-object v1, v19, v20

    .line 130
    .line 131
    move/from16 v21, v2

    .line 132
    .line 133
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2, v1}, Ln49;->c(Ljava/lang/String;)Ll49;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-nez v1, :cond_5

    .line 142
    .line 143
    invoke-static {}, Llh4;->P0()Llh4;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move/from16 v21, v3

    .line 151
    .line 152
    :cond_4
    :goto_3
    const/4 v2, 0x0

    .line 153
    const/4 v5, 0x1

    .line 154
    goto/16 :goto_13

    .line 155
    .line 156
    :cond_5
    iget-object v1, v1, Ll49;->b:Lu39;

    .line 157
    .line 158
    if-ne v1, v14, :cond_6

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    goto :goto_4

    .line 162
    :cond_6
    const/4 v2, 0x0

    .line 163
    :goto_4
    and-int v16, v16, v2

    .line 164
    .line 165
    if-ne v1, v12, :cond_7

    .line 166
    .line 167
    const/16 v18, 0x1

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    if-ne v1, v15, :cond_8

    .line 171
    .line 172
    const/16 v17, 0x1

    .line 173
    .line 174
    :cond_8
    :goto_5
    add-int/lit8 v1, v20, 0x1

    .line 175
    .line 176
    move/from16 v2, v21

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_9
    move-object/from16 v19, v1

    .line 180
    .line 181
    const/16 v16, 0x1

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const/16 v18, 0x0

    .line 186
    .line 187
    :cond_a
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    sget-object v2, Lu39;->X:Lu39;

    .line 192
    .line 193
    if-nez v1, :cond_1a

    .line 194
    .line 195
    if-eqz v11, :cond_1a

    .line 196
    .line 197
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v11, v7}, Ln49;->d(Ljava/lang/String;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v20

    .line 212
    if-nez v20, :cond_1a

    .line 213
    .line 214
    move/from16 v20, v1

    .line 215
    .line 216
    sget-object v1, Lg62;->Z:Lg62;

    .line 217
    .line 218
    move/from16 v21, v3

    .line 219
    .line 220
    sget-object v3, Lg62;->f0:Lg62;

    .line 221
    .line 222
    if-eq v8, v1, :cond_f

    .line 223
    .line 224
    if-ne v8, v3, :cond_b

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_b
    sget-object v1, Lg62;->Y:Lg62;

    .line 228
    .line 229
    if-ne v8, v1, :cond_d

    .line 230
    .line 231
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_d

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Lj49;

    .line 246
    .line 247
    iget-object v3, v3, Lj49;->b:Lu39;

    .line 248
    .line 249
    if-eq v3, v2, :cond_4

    .line 250
    .line 251
    sget-object v8, Lu39;->Y:Lu39;

    .line 252
    .line 253
    if-ne v3, v8, :cond_c

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_d
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    new-instance v1, Ljm0;

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    invoke-direct {v1, v5, v7, v4, v3}, Ljm0;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Lx39;B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v1}, Lql6;->o(Ljava/lang/Runnable;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_e

    .line 281
    .line 282
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    check-cast v8, Lj49;

    .line 287
    .line 288
    iget-object v8, v8, Lj49;->a:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v1, v8}, Ln49;->a(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_e
    move-object/from16 v22, v5

    .line 295
    .line 296
    move-object/from16 v23, v6

    .line 297
    .line 298
    move-object/from16 v1, v19

    .line 299
    .line 300
    const/4 v0, 0x1

    .line 301
    goto/16 :goto_e

    .line 302
    .line 303
    :cond_f
    :goto_7
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->r()Lpi1;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    new-instance v13, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v19

    .line 320
    if-eqz v19, :cond_14

    .line 321
    .line 322
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v19

    .line 326
    move-object/from16 v22, v5

    .line 327
    .line 328
    move-object/from16 v5, v19

    .line 329
    .line 330
    check-cast v5, Lj49;

    .line 331
    .line 332
    move-object/from16 v23, v6

    .line 333
    .line 334
    iget-object v6, v5, Lj49;->a:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-object/from16 v19, v11

    .line 343
    .line 344
    iget-object v11, v1, Lpi1;->a:Lql6;

    .line 345
    .line 346
    move-object/from16 v24, v1

    .line 347
    .line 348
    new-instance v1, Lm40;

    .line 349
    .line 350
    const/4 v0, 0x3

    .line 351
    invoke-direct {v1, v6, v0}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 352
    .line 353
    .line 354
    const/4 v0, 0x0

    .line 355
    const/4 v6, 0x1

    .line 356
    invoke-static {v11, v6, v0, v1}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    check-cast v1, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-nez v0, :cond_13

    .line 367
    .line 368
    iget-object v0, v5, Lj49;->b:Lu39;

    .line 369
    .line 370
    if-ne v0, v14, :cond_10

    .line 371
    .line 372
    const/4 v1, 0x1

    .line 373
    goto :goto_9

    .line 374
    :cond_10
    const/4 v1, 0x0

    .line 375
    :goto_9
    and-int v16, v16, v1

    .line 376
    .line 377
    if-ne v0, v12, :cond_11

    .line 378
    .line 379
    const/16 v18, 0x1

    .line 380
    .line 381
    goto :goto_a

    .line 382
    :cond_11
    if-ne v0, v15, :cond_12

    .line 383
    .line 384
    const/16 v17, 0x1

    .line 385
    .line 386
    :cond_12
    :goto_a
    iget-object v0, v5, Lj49;->a:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    :cond_13
    move-object/from16 v0, p0

    .line 392
    .line 393
    move-object/from16 v11, v19

    .line 394
    .line 395
    move-object/from16 v5, v22

    .line 396
    .line 397
    move-object/from16 v6, v23

    .line 398
    .line 399
    move-object/from16 v1, v24

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_14
    move-object/from16 v22, v5

    .line 403
    .line 404
    move-object/from16 v23, v6

    .line 405
    .line 406
    if-ne v8, v3, :cond_18

    .line 407
    .line 408
    if-nez v17, :cond_15

    .line 409
    .line 410
    if-eqz v18, :cond_18

    .line 411
    .line 412
    :cond_15
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v0, v7}, Ln49;->d(Ljava/lang/String;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    new-instance v3, Ljava/util/ArrayList;

    .line 421
    .line 422
    const/16 v5, 0xa

    .line 423
    .line 424
    invoke-static {v1, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    if-eqz v6, :cond_16

    .line 440
    .line 441
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    check-cast v6, Lj49;

    .line 446
    .line 447
    iget-object v6, v6, Lj49;->a:Ljava/lang/String;

    .line 448
    .line 449
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_16
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_17

    .line 462
    .line 463
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    check-cast v3, Lj49;

    .line 468
    .line 469
    iget-object v3, v3, Lj49;->a:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {v0, v3}, Ln49;->a(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    goto :goto_c

    .line 475
    :cond_17
    new-instance v13, Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 478
    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const/16 v18, 0x0

    .line 483
    .line 484
    :cond_18
    const/4 v0, 0x0

    .line 485
    new-array v1, v0, [Ljava/lang/String;

    .line 486
    .line 487
    invoke-interface {v13, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    move-object v1, v0

    .line 492
    check-cast v1, [Ljava/lang/String;

    .line 493
    .line 494
    array-length v0, v1

    .line 495
    if-lez v0, :cond_19

    .line 496
    .line 497
    const/4 v13, 0x1

    .line 498
    goto :goto_d

    .line 499
    :cond_19
    const/4 v13, 0x0

    .line 500
    :goto_d
    const/4 v0, 0x0

    .line 501
    goto :goto_e

    .line 502
    :cond_1a
    move/from16 v20, v1

    .line 503
    .line 504
    move/from16 v21, v3

    .line 505
    .line 506
    move-object/from16 v22, v5

    .line 507
    .line 508
    move-object/from16 v23, v6

    .line 509
    .line 510
    move-object/from16 v1, v19

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :goto_e
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    move v6, v0

    .line 518
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-eqz v0, :cond_21

    .line 523
    .line 524
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    check-cast v0, Lg49;

    .line 529
    .line 530
    iget-object v5, v0, Lg49;->b:Ll49;

    .line 531
    .line 532
    iget-object v8, v0, Lg49;->a:Ljava/util/UUID;

    .line 533
    .line 534
    if-eqz v13, :cond_1d

    .line 535
    .line 536
    if-nez v16, :cond_1d

    .line 537
    .line 538
    if-eqz v18, :cond_1b

    .line 539
    .line 540
    iput-object v12, v5, Ll49;->b:Lu39;

    .line 541
    .line 542
    goto :goto_10

    .line 543
    :cond_1b
    if-eqz v17, :cond_1c

    .line 544
    .line 545
    iput-object v15, v5, Ll49;->b:Lu39;

    .line 546
    .line 547
    goto :goto_10

    .line 548
    :cond_1c
    sget-object v11, Lu39;->g0:Lu39;

    .line 549
    .line 550
    iput-object v11, v5, Ll49;->b:Lu39;

    .line 551
    .line 552
    goto :goto_10

    .line 553
    :cond_1d
    iput-wide v9, v5, Ll49;->n:J

    .line 554
    .line 555
    :goto_10
    iget-object v11, v5, Ll49;->b:Lu39;

    .line 556
    .line 557
    if-ne v11, v2, :cond_1e

    .line 558
    .line 559
    const/4 v6, 0x1

    .line 560
    :cond_1e
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    iget-object v14, v4, Lx39;->m0:Ljava/util/List;

    .line 565
    .line 566
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-static {v14, v5}, Lz51;->Z(Ljava/util/List;Ll49;)Ll49;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    iget-object v14, v11, Ln49;->a:Lql6;

    .line 577
    .line 578
    move-object/from16 v19, v2

    .line 579
    .line 580
    new-instance v2, Lgq6;

    .line 581
    .line 582
    move-object/from16 v23, v3

    .line 583
    .line 584
    const/16 v3, 0x1c

    .line 585
    .line 586
    invoke-direct {v2, v11, v5, v3}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 587
    .line 588
    .line 589
    const/4 v3, 0x0

    .line 590
    const/4 v5, 0x1

    .line 591
    invoke-static {v14, v3, v5, v2}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    if-eqz v13, :cond_1f

    .line 595
    .line 596
    array-length v2, v1

    .line 597
    const/4 v3, 0x0

    .line 598
    :goto_11
    if-ge v3, v2, :cond_1f

    .line 599
    .line 600
    aget-object v5, v1, v3

    .line 601
    .line 602
    new-instance v11, Lki1;

    .line 603
    .line 604
    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v14

    .line 608
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-direct {v11, v14, v5}, Lki1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->r()Lpi1;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget-object v14, v5, Lpi1;->a:Lql6;

    .line 622
    .line 623
    move-object/from16 v24, v1

    .line 624
    .line 625
    new-instance v1, Lp0;

    .line 626
    .line 627
    move/from16 v25, v2

    .line 628
    .line 629
    const/16 v2, 0xe

    .line 630
    .line 631
    invoke-direct {v1, v5, v11, v2}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 632
    .line 633
    .line 634
    const/4 v2, 0x0

    .line 635
    const/4 v5, 0x1

    .line 636
    invoke-static {v14, v2, v5, v1}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    add-int/lit8 v3, v3, 0x1

    .line 640
    .line 641
    move-object/from16 v1, v24

    .line 642
    .line 643
    move/from16 v2, v25

    .line 644
    .line 645
    goto :goto_11

    .line 646
    :cond_1f
    move-object/from16 v24, v1

    .line 647
    .line 648
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->y()Lp49;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    iget-object v0, v0, Lg49;->c:Ljava/util/Set;

    .line 660
    .line 661
    invoke-virtual {v1, v2, v0}, Lp49;->a(Ljava/lang/String;Ljava/util/Set;)V

    .line 662
    .line 663
    .line 664
    if-nez v20, :cond_20

    .line 665
    .line 666
    invoke-virtual/range {v22 .. v22}, Landroidx/work/impl/WorkDatabase;->v()Lb49;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    new-instance v1, La49;

    .line 671
    .line 672
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-direct {v1, v7, v2}, La49;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    iget-object v2, v0, Lb49;->a:Lql6;

    .line 689
    .line 690
    new-instance v3, Lgq6;

    .line 691
    .line 692
    const/16 v5, 0x18

    .line 693
    .line 694
    invoke-direct {v3, v0, v1, v5}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 695
    .line 696
    .line 697
    const/4 v0, 0x0

    .line 698
    const/4 v5, 0x1

    .line 699
    invoke-static {v2, v0, v5, v3}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    goto :goto_12

    .line 703
    :cond_20
    const/4 v0, 0x0

    .line 704
    const/4 v5, 0x1

    .line 705
    :goto_12
    move-object/from16 v2, v19

    .line 706
    .line 707
    move-object/from16 v3, v23

    .line 708
    .line 709
    move-object/from16 v1, v24

    .line 710
    .line 711
    goto/16 :goto_f

    .line 712
    .line 713
    :cond_21
    const/4 v5, 0x1

    .line 714
    move-object/from16 v0, p0

    .line 715
    .line 716
    move v2, v6

    .line 717
    :goto_13
    iput-boolean v5, v0, Ll39;->h:Z

    .line 718
    .line 719
    or-int v0, v21, v2

    .line 720
    .line 721
    return v0
.end method

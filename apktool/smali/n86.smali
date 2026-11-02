.class public final synthetic Ln86;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lp86;

.field public final synthetic Y:Lt05;

.field public final synthetic Z:Lt05;

.field public final synthetic f0:Ljava/util/List;

.field public final synthetic g0:Ljava/util/List;

.field public final synthetic h0:Lt05;

.field public final synthetic i0:Ljava/util/List;

.field public final synthetic j0:Lt05;

.field public final synthetic k0:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Lp86;Lt05;Lt05;Ljava/util/List;Ljava/util/List;Lt05;Ljava/util/List;Lt05;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln86;->X:Lp86;

    .line 5
    .line 6
    iput-object p2, p0, Ln86;->Y:Lt05;

    .line 7
    .line 8
    iput-object p3, p0, Ln86;->Z:Lt05;

    .line 9
    .line 10
    iput-object p4, p0, Ln86;->f0:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Ln86;->g0:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Ln86;->h0:Lt05;

    .line 15
    .line 16
    iput-object p7, p0, Ln86;->i0:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Ln86;->j0:Lt05;

    .line 19
    .line 20
    iput-object p9, p0, Ln86;->k0:Ljava/util/Set;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, v0, Ln86;->X:Lp86;

    .line 6
    .line 7
    iget-object v8, v0, Ln86;->Y:Lt05;

    .line 8
    .line 9
    iget-object v9, v0, Ln86;->Z:Lt05;

    .line 10
    .line 11
    iget-object v3, v0, Ln86;->f0:Ljava/util/List;

    .line 12
    .line 13
    iget-object v4, v0, Ln86;->g0:Ljava/util/List;

    .line 14
    .line 15
    iget-object v6, v0, Ln86;->h0:Lt05;

    .line 16
    .line 17
    iget-object v5, v0, Ln86;->i0:Ljava/util/List;

    .line 18
    .line 19
    iget-object v7, v0, Ln86;->j0:Lt05;

    .line 20
    .line 21
    iget-object v0, v0, Ln86;->k0:Ljava/util/Set;

    .line 22
    .line 23
    move-object/from16 v10, p1

    .line 24
    .line 25
    check-cast v10, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v10

    .line 31
    sget-object v12, Lp86;->z:Loh7;

    .line 32
    .line 33
    iget-object v12, v2, Lp86;->c:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v12

    .line 36
    :try_start_0
    invoke-virtual {v2}, Lp86;->z()Z

    .line 37
    .line 38
    .line 39
    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_12

    .line 40
    monitor-exit v12

    .line 41
    const/4 v12, 0x1

    .line 42
    const/4 v14, 0x0

    .line 43
    if-eqz v13, :cond_2

    .line 44
    .line 45
    const-string v13, "Recomposer:animation"

    .line 46
    .line 47
    invoke-static {v13}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    iget-object v13, v2, Lp86;->a:Lai;

    .line 51
    .line 52
    iget-object v13, v13, Lai;->Z:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v13, Ly5;

    .line 55
    .line 56
    new-instance v15, Lbd;

    .line 57
    .line 58
    invoke-direct {v15, v10, v11, v12}, Lbd;-><init>(JB)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v13, v15}, Ly5;->J(Lgn2;)V

    .line 62
    .line 63
    .line 64
    sget-object v10, Lkd7;->c:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    :try_start_2
    sget-object v11, Lkd7;->j:Les2;

    .line 68
    .line 69
    iget-object v11, v11, Lx05;->h:Lt05;

    .line 70
    .line 71
    if-eqz v11, :cond_0

    .line 72
    .line 73
    invoke-virtual {v11}, Lt05;->h()Z

    .line 74
    .line 75
    .line 76
    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    if-ne v11, v12, :cond_0

    .line 78
    .line 79
    move v11, v12

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move v11, v14

    .line 82
    :goto_0
    :try_start_3
    monitor-exit v10

    .line 83
    if-eqz v11, :cond_1

    .line 84
    .line 85
    invoke-static {}, Lkd7;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 86
    .line 87
    .line 88
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    :try_start_4
    monitor-exit v10

    .line 94
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_2
    :goto_1
    const-string v10, "Recomposer:recompose"

    .line 101
    .line 102
    invoke-static {v10}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :try_start_5
    invoke-virtual {v2}, Lp86;->K()Z

    .line 106
    .line 107
    .line 108
    iget-object v10, v2, Lp86;->c:Ljava/lang/Object;

    .line 109
    .line 110
    monitor-enter v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_11

    .line 111
    :try_start_6
    iget-object v11, v2, Lp86;->i:Lc15;

    .line 112
    .line 113
    iget-object v13, v11, Lc15;->X:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v11, v11, Lc15;->Z:I

    .line 116
    .line 117
    move v15, v14

    .line 118
    :goto_2
    if-ge v15, v11, :cond_3

    .line 119
    .line 120
    aget-object v16, v13, v15

    .line 121
    .line 122
    move-object/from16 v12, v16

    .line 123
    .line 124
    check-cast v12, Lr01;

    .line 125
    .line 126
    invoke-interface {v3, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 v15, v15, 0x1

    .line 130
    .line 131
    const/4 v12, 0x1

    .line 132
    goto :goto_2

    .line 133
    :catchall_2
    move-exception v0

    .line 134
    goto/16 :goto_27

    .line 135
    .line 136
    :cond_3
    iget-object v11, v2, Lp86;->i:Lc15;

    .line 137
    .line 138
    invoke-virtual {v11}, Lc15;->g()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 139
    .line 140
    .line 141
    :try_start_7
    monitor-exit v10

    .line 142
    invoke-virtual {v8}, Lt05;->b()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9}, Lt05;->b()V

    .line 146
    .line 147
    .line 148
    :goto_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    const/4 v11, 0x0

    .line 153
    if-eqz v10, :cond_4

    .line 154
    .line 155
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-nez v10, :cond_5

    .line 160
    .line 161
    :cond_4
    move-object/from16 v23, v1

    .line 162
    .line 163
    const/4 v10, 0x1

    .line 164
    goto/16 :goto_1a

    .line 165
    .line 166
    :cond_5
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    instance-of v10, v0, Lx05;

    .line 171
    .line 172
    if-eqz v10, :cond_6

    .line 173
    .line 174
    new-instance v15, Lpe8;

    .line 175
    .line 176
    move-object/from16 v16, v0

    .line 177
    .line 178
    check-cast v16, Lx05;

    .line 179
    .line 180
    const/16 v19, 0x1

    .line 181
    .line 182
    const/16 v20, 0x0

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/16 v18, 0x0

    .line 187
    .line 188
    invoke-direct/range {v15 .. v20}, Lpe8;-><init>(Lx05;Lgn2;Lgn2;ZZ)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_6
    new-instance v15, Lqe8;

    .line 193
    .line 194
    const/4 v10, 0x1

    .line 195
    invoke-direct {v15, v0, v11, v10, v14}, Lqe8;-><init>(Ldd7;Lgn2;ZZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_11

    .line 196
    .line 197
    .line 198
    :goto_4
    :try_start_8
    invoke-virtual {v15}, Ldd7;->j()Ldd7;

    .line 199
    .line 200
    .line 201
    move-result-object v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 202
    :try_start_9
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 206
    if-nez v0, :cond_9

    .line 207
    .line 208
    :try_start_a
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    move v12, v14

    .line 213
    :goto_5
    if-ge v12, v0, :cond_7

    .line 214
    .line 215
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    check-cast v13, Lr01;

    .line 220
    .line 221
    invoke-virtual {v7, v13}, Lt05;->a(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    add-int/lit8 v12, v12, 0x1

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :catchall_3
    move-exception v0

    .line 228
    goto :goto_7

    .line 229
    :cond_7
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    move v12, v14

    .line 234
    :goto_6
    if-ge v12, v0, :cond_8

    .line 235
    .line 236
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    check-cast v13, Lr01;

    .line 241
    .line 242
    invoke-virtual {v13}, Lr01;->d()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 243
    .line 244
    .line 245
    add-int/lit8 v12, v12, 0x1

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_8
    :try_start_b
    invoke-interface {v5}, Ljava/util/List;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :catchall_4
    move-exception v0

    .line 253
    goto/16 :goto_18

    .line 254
    .line 255
    :goto_7
    :try_start_c
    invoke-virtual {v2, v0, v11}, Lp86;->J(Ljava/lang/Throwable;Lr01;)V

    .line 256
    .line 257
    .line 258
    invoke-static/range {v2 .. v9}, Lo86;->u(Lp86;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt05;Lt05;Lt05;Lt05;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 259
    .line 260
    .line 261
    :try_start_d
    invoke-interface {v5}, Ljava/util/List;->clear()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 262
    .line 263
    .line 264
    :try_start_e
    invoke-static {v10}, Ldd7;->q(Ldd7;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 265
    .line 266
    .line 267
    :try_start_f
    invoke-virtual {v15}, Ldd7;->c()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_11

    .line 268
    .line 269
    .line 270
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 271
    .line 272
    .line 273
    move-object/from16 v23, v1

    .line 274
    .line 275
    goto/16 :goto_26

    .line 276
    .line 277
    :catchall_5
    move-exception v0

    .line 278
    goto/16 :goto_19

    .line 279
    .line 280
    :catchall_6
    move-exception v0

    .line 281
    :try_start_10
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :cond_9
    :goto_8
    invoke-virtual {v6}, Lt05;->h()Z

    .line 286
    .line 287
    .line 288
    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 289
    const-wide/16 v16, 0xff

    .line 290
    .line 291
    const/16 v18, 0x7

    .line 292
    .line 293
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    const-wide/16 p0, 0x80

    .line 299
    .line 300
    if-eqz v0, :cond_f

    .line 301
    .line 302
    :try_start_11
    invoke-virtual {v7, v6}, Lt05;->j(Lt05;)V

    .line 303
    .line 304
    .line 305
    iget-object v0, v6, Lt05;->b:[Ljava/lang/Object;

    .line 306
    .line 307
    iget-object v13, v6, Lt05;->a:[J

    .line 308
    .line 309
    array-length v14, v13

    .line 310
    add-int/lit8 v14, v14, -0x2

    .line 311
    .line 312
    if-ltz v14, :cond_d

    .line 313
    .line 314
    move-object/from16 v22, v13

    .line 315
    .line 316
    const/4 v11, 0x0

    .line 317
    :goto_9
    const/16 v21, 0x8

    .line 318
    .line 319
    aget-wide v12, v22, v11
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 320
    .line 321
    move-object/from16 v24, v0

    .line 322
    .line 323
    move-object/from16 v23, v1

    .line 324
    .line 325
    not-long v0, v12

    .line 326
    shl-long v0, v0, v18

    .line 327
    .line 328
    and-long/2addr v0, v12

    .line 329
    and-long v0, v0, v19

    .line 330
    .line 331
    cmp-long v0, v0, v19

    .line 332
    .line 333
    if-eqz v0, :cond_c

    .line 334
    .line 335
    sub-int v0, v11, v14

    .line 336
    .line 337
    not-int v0, v0

    .line 338
    ushr-int/lit8 v0, v0, 0x1f

    .line 339
    .line 340
    rsub-int/lit8 v0, v0, 0x8

    .line 341
    .line 342
    const/4 v1, 0x0

    .line 343
    :goto_a
    if-ge v1, v0, :cond_b

    .line 344
    .line 345
    and-long v25, v12, v16

    .line 346
    .line 347
    cmp-long v25, v25, p0

    .line 348
    .line 349
    if-gez v25, :cond_a

    .line 350
    .line 351
    shl-int/lit8 v25, v11, 0x3

    .line 352
    .line 353
    add-int v25, v25, v1

    .line 354
    .line 355
    :try_start_12
    aget-object v25, v24, v25

    .line 356
    .line 357
    check-cast v25, Lr01;

    .line 358
    .line 359
    invoke-virtual/range {v25 .. v25}, Lr01;->f()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 360
    .line 361
    .line 362
    goto :goto_c

    .line 363
    :catchall_7
    move-exception v0

    .line 364
    :goto_b
    const/4 v1, 0x0

    .line 365
    goto :goto_d

    .line 366
    :cond_a
    :goto_c
    shr-long v12, v12, v21

    .line 367
    .line 368
    add-int/lit8 v1, v1, 0x1

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_b
    move/from16 v1, v21

    .line 372
    .line 373
    if-ne v0, v1, :cond_e

    .line 374
    .line 375
    :cond_c
    if-eq v11, v14, :cond_e

    .line 376
    .line 377
    add-int/lit8 v11, v11, 0x1

    .line 378
    .line 379
    move-object/from16 v1, v23

    .line 380
    .line 381
    move-object/from16 v0, v24

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :catchall_8
    move-exception v0

    .line 385
    move-object/from16 v23, v1

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_d
    move-object/from16 v23, v1

    .line 389
    .line 390
    :cond_e
    :try_start_13
    invoke-virtual {v6}, Lt05;->b()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 391
    .line 392
    .line 393
    goto :goto_10

    .line 394
    :goto_d
    :try_start_14
    invoke-virtual {v2, v0, v1}, Lp86;->J(Ljava/lang/Throwable;Lr01;)V

    .line 395
    .line 396
    .line 397
    invoke-static/range {v2 .. v9}, Lo86;->u(Lp86;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt05;Lt05;Lt05;Lt05;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 398
    .line 399
    .line 400
    :try_start_15
    invoke-virtual {v6}, Lt05;->b()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 401
    .line 402
    .line 403
    :try_start_16
    invoke-static {v10}, Ldd7;->q(Ldd7;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    .line 404
    .line 405
    .line 406
    :goto_e
    :try_start_17
    invoke-virtual {v15}, Ldd7;->c()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    .line 407
    .line 408
    .line 409
    :goto_f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_26

    .line 413
    .line 414
    :catchall_9
    move-exception v0

    .line 415
    :try_start_18
    invoke-virtual {v6}, Lt05;->b()V

    .line 416
    .line 417
    .line 418
    throw v0

    .line 419
    :cond_f
    move-object/from16 v23, v1

    .line 420
    .line 421
    :goto_10
    invoke-virtual {v7}, Lt05;->h()Z

    .line 422
    .line 423
    .line 424
    move-result v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    .line 425
    if-eqz v0, :cond_14

    .line 426
    .line 427
    :try_start_19
    iget-object v0, v7, Lt05;->b:[Ljava/lang/Object;

    .line 428
    .line 429
    iget-object v1, v7, Lt05;->a:[J

    .line 430
    .line 431
    array-length v11, v1

    .line 432
    add-int/lit8 v11, v11, -0x2

    .line 433
    .line 434
    if-ltz v11, :cond_13

    .line 435
    .line 436
    const/4 v12, 0x0

    .line 437
    :goto_11
    aget-wide v13, v1, v12

    .line 438
    .line 439
    move-object/from16 v22, v0

    .line 440
    .line 441
    move-object/from16 v24, v1

    .line 442
    .line 443
    not-long v0, v13

    .line 444
    shl-long v0, v0, v18

    .line 445
    .line 446
    and-long/2addr v0, v13

    .line 447
    and-long v0, v0, v19

    .line 448
    .line 449
    cmp-long v0, v0, v19

    .line 450
    .line 451
    if-eqz v0, :cond_12

    .line 452
    .line 453
    sub-int v0, v12, v11

    .line 454
    .line 455
    not-int v0, v0

    .line 456
    ushr-int/lit8 v0, v0, 0x1f

    .line 457
    .line 458
    const/16 v21, 0x8

    .line 459
    .line 460
    rsub-int/lit8 v0, v0, 0x8

    .line 461
    .line 462
    const/4 v1, 0x0

    .line 463
    :goto_12
    if-ge v1, v0, :cond_11

    .line 464
    .line 465
    and-long v25, v13, v16

    .line 466
    .line 467
    cmp-long v25, v25, p0

    .line 468
    .line 469
    if-gez v25, :cond_10

    .line 470
    .line 471
    shl-int/lit8 v25, v12, 0x3

    .line 472
    .line 473
    add-int v25, v25, v1

    .line 474
    .line 475
    aget-object v25, v22, v25

    .line 476
    .line 477
    check-cast v25, Lr01;

    .line 478
    .line 479
    invoke-virtual/range {v25 .. v25}, Lr01;->g()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    .line 480
    .line 481
    .line 482
    :cond_10
    move/from16 v25, v1

    .line 483
    .line 484
    const/16 v1, 0x8

    .line 485
    .line 486
    goto :goto_13

    .line 487
    :catchall_a
    move-exception v0

    .line 488
    const/4 v1, 0x0

    .line 489
    goto :goto_15

    .line 490
    :goto_13
    shr-long/2addr v13, v1

    .line 491
    add-int/lit8 v21, v25, 0x1

    .line 492
    .line 493
    move/from16 v1, v21

    .line 494
    .line 495
    goto :goto_12

    .line 496
    :cond_11
    const/16 v1, 0x8

    .line 497
    .line 498
    if-ne v0, v1, :cond_13

    .line 499
    .line 500
    goto :goto_14

    .line 501
    :cond_12
    const/16 v1, 0x8

    .line 502
    .line 503
    :goto_14
    if-eq v12, v11, :cond_13

    .line 504
    .line 505
    add-int/lit8 v12, v12, 0x1

    .line 506
    .line 507
    move-object/from16 v0, v22

    .line 508
    .line 509
    move-object/from16 v1, v24

    .line 510
    .line 511
    goto :goto_11

    .line 512
    :cond_13
    :try_start_1a
    invoke-virtual {v7}, Lt05;->b()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    .line 513
    .line 514
    .line 515
    goto :goto_16

    .line 516
    :goto_15
    :try_start_1b
    invoke-virtual {v2, v0, v1}, Lp86;->J(Ljava/lang/Throwable;Lr01;)V

    .line 517
    .line 518
    .line 519
    invoke-static/range {v2 .. v9}, Lo86;->u(Lp86;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt05;Lt05;Lt05;Lt05;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    .line 520
    .line 521
    .line 522
    :try_start_1c
    invoke-virtual {v7}, Lt05;->b()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    .line 523
    .line 524
    .line 525
    :try_start_1d
    invoke-static {v10}, Ldd7;->q(Ldd7;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    .line 526
    .line 527
    .line 528
    goto :goto_e

    .line 529
    :catchall_b
    move-exception v0

    .line 530
    :try_start_1e
    invoke-virtual {v7}, Lt05;->b()V

    .line 531
    .line 532
    .line 533
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    .line 534
    :cond_14
    :goto_16
    :try_start_1f
    invoke-static {v10}, Ldd7;->q(Ldd7;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    .line 535
    .line 536
    .line 537
    :try_start_20
    invoke-virtual {v15}, Ldd7;->c()V

    .line 538
    .line 539
    .line 540
    iget-object v1, v2, Lp86;->c:Ljava/lang/Object;

    .line 541
    .line 542
    monitor-enter v1
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_11

    .line 543
    :try_start_21
    invoke-virtual {v2}, Lp86;->y()Llm0;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    if-nez v0, :cond_15

    .line 548
    .line 549
    goto :goto_17

    .line 550
    :cond_15
    const-string v0, "unexpected to get continuation here"

    .line 551
    .line 552
    invoke-static {v0}, Ld01;->a(Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_c

    .line 553
    .line 554
    .line 555
    :goto_17
    :try_start_22
    monitor-exit v1

    .line 556
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Ldd7;->m()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v9}, Lt05;->b()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v8}, Lt05;->b()V

    .line 567
    .line 568
    .line 569
    const/4 v1, 0x0

    .line 570
    iput-object v1, v2, Lp86;->q:Lt05;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_11

    .line 571
    .line 572
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 573
    .line 574
    .line 575
    return-object v23

    .line 576
    :catchall_c
    move-exception v0

    .line 577
    :try_start_23
    monitor-exit v1

    .line 578
    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_11

    .line 579
    :goto_18
    :try_start_24
    invoke-static {v10}, Ldd7;->q(Ldd7;)V

    .line 580
    .line 581
    .line 582
    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_5

    .line 583
    :goto_19
    :try_start_25
    invoke-virtual {v15}, Ldd7;->c()V

    .line 584
    .line 585
    .line 586
    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_11

    .line 587
    :goto_1a
    :try_start_26
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    const/4 v11, 0x0

    .line 592
    :goto_1b
    if-ge v11, v1, :cond_17

    .line 593
    .line 594
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v12

    .line 598
    check-cast v12, Lr01;

    .line 599
    .line 600
    invoke-virtual {v2, v12, v8}, Lp86;->I(Lr01;Lt05;)Lr01;

    .line 601
    .line 602
    .line 603
    move-result-object v13

    .line 604
    if-eqz v13, :cond_16

    .line 605
    .line 606
    invoke-interface {v5, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    goto :goto_1c

    .line 610
    :catchall_d
    move-exception v0

    .line 611
    const/4 v1, 0x0

    .line 612
    goto/16 :goto_25

    .line 613
    .line 614
    :cond_16
    :goto_1c
    invoke-virtual {v9, v12}, Lt05;->a(Ljava/lang/Object;)Z
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_d

    .line 615
    .line 616
    .line 617
    add-int/lit8 v11, v11, 0x1

    .line 618
    .line 619
    goto :goto_1b

    .line 620
    :cond_17
    :try_start_27
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v8}, Lt05;->h()Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-nez v1, :cond_18

    .line 628
    .line 629
    iget-object v1, v2, Lp86;->i:Lc15;

    .line 630
    .line 631
    iget v1, v1, Lc15;->Z:I

    .line 632
    .line 633
    if-eqz v1, :cond_1e

    .line 634
    .line 635
    :cond_18
    iget-object v1, v2, Lp86;->c:Ljava/lang/Object;

    .line 636
    .line 637
    monitor-enter v1
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_11

    .line 638
    :try_start_28
    invoke-virtual {v2}, Lp86;->D()Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 643
    .line 644
    .line 645
    move-result v12

    .line 646
    const/4 v13, 0x0

    .line 647
    :goto_1d
    if-ge v13, v12, :cond_1a

    .line 648
    .line 649
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v14

    .line 653
    check-cast v14, Lr01;

    .line 654
    .line 655
    invoke-virtual {v9, v14}, Lt05;->c(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v15

    .line 659
    if-nez v15, :cond_19

    .line 660
    .line 661
    invoke-virtual {v14, v0}, Lr01;->v(Ljava/util/Set;)Z

    .line 662
    .line 663
    .line 664
    move-result v15

    .line 665
    if-eqz v15, :cond_19

    .line 666
    .line 667
    invoke-interface {v3, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    goto :goto_1e

    .line 671
    :catchall_e
    move-exception v0

    .line 672
    goto/16 :goto_24

    .line 673
    .line 674
    :cond_19
    :goto_1e
    add-int/lit8 v13, v13, 0x1

    .line 675
    .line 676
    goto :goto_1d

    .line 677
    :cond_1a
    iget-object v11, v2, Lp86;->i:Lc15;

    .line 678
    .line 679
    iget v12, v11, Lc15;->Z:I
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_e

    .line 680
    .line 681
    const/4 v13, 0x0

    .line 682
    const/4 v14, 0x0

    .line 683
    :goto_1f
    iget-object v15, v11, Lc15;->X:[Ljava/lang/Object;

    .line 684
    .line 685
    if-ge v13, v12, :cond_1d

    .line 686
    .line 687
    :try_start_29
    aget-object v15, v15, v13

    .line 688
    .line 689
    check-cast v15, Lr01;

    .line 690
    .line 691
    invoke-virtual {v9, v15}, Lt05;->c(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v16

    .line 695
    if-nez v16, :cond_1b

    .line 696
    .line 697
    invoke-interface {v3, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v16

    .line 701
    if-nez v16, :cond_1b

    .line 702
    .line 703
    invoke-interface {v3, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    add-int/lit8 v14, v14, 0x1

    .line 707
    .line 708
    goto :goto_20

    .line 709
    :cond_1b
    if-lez v14, :cond_1c

    .line 710
    .line 711
    iget-object v15, v11, Lc15;->X:[Ljava/lang/Object;

    .line 712
    .line 713
    sub-int v16, v13, v14

    .line 714
    .line 715
    aget-object v17, v15, v13

    .line 716
    .line 717
    aput-object v17, v15, v16

    .line 718
    .line 719
    :cond_1c
    :goto_20
    add-int/lit8 v13, v13, 0x1

    .line 720
    .line 721
    goto :goto_1f

    .line 722
    :cond_1d
    sub-int v13, v12, v14

    .line 723
    .line 724
    const/4 v14, 0x0

    .line 725
    invoke-static {v15, v13, v12, v14}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    iput v13, v11, Lc15;->Z:I
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_e

    .line 729
    .line 730
    :try_start_2a
    monitor-exit v1

    .line 731
    :cond_1e
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 732
    .line 733
    .line 734
    move-result v1
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_11

    .line 735
    if-eqz v1, :cond_20

    .line 736
    .line 737
    :try_start_2b
    invoke-static {v4, v2}, Lo86;->v(Ljava/util/List;Lp86;)V

    .line 738
    .line 739
    .line 740
    :goto_21
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    if-nez v1, :cond_20

    .line 745
    .line 746
    invoke-virtual {v2, v4, v8}, Lp86;->H(Ljava/util/List;Lt05;)Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 758
    .line 759
    .line 760
    move-result v11

    .line 761
    if-eqz v11, :cond_1f

    .line 762
    .line 763
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v11

    .line 767
    invoke-virtual {v6, v11}, Lt05;->k(Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    goto :goto_22

    .line 771
    :cond_1f
    invoke-static {v4, v2}, Lo86;->v(Ljava/util/List;Lp86;)V
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_f

    .line 772
    .line 773
    .line 774
    goto :goto_21

    .line 775
    :catchall_f
    move-exception v0

    .line 776
    const/4 v1, 0x0

    .line 777
    goto :goto_23

    .line 778
    :cond_20
    move-object/from16 v1, v23

    .line 779
    .line 780
    const/4 v14, 0x0

    .line 781
    goto/16 :goto_3

    .line 782
    .line 783
    :goto_23
    :try_start_2c
    invoke-virtual {v2, v0, v1}, Lp86;->J(Ljava/lang/Throwable;Lr01;)V

    .line 784
    .line 785
    .line 786
    invoke-static/range {v2 .. v9}, Lo86;->u(Lp86;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt05;Lt05;Lt05;Lt05;)V

    .line 787
    .line 788
    .line 789
    goto/16 :goto_f

    .line 790
    .line 791
    :goto_24
    monitor-exit v1

    .line 792
    throw v0
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_11

    .line 793
    :goto_25
    :try_start_2d
    invoke-virtual {v2, v0, v1}, Lp86;->J(Ljava/lang/Throwable;Lr01;)V

    .line 794
    .line 795
    .line 796
    invoke-static/range {v2 .. v9}, Lo86;->u(Lp86;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt05;Lt05;Lt05;Lt05;)V
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_10

    .line 797
    .line 798
    .line 799
    :try_start_2e
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 800
    .line 801
    .line 802
    goto/16 :goto_f

    .line 803
    .line 804
    :goto_26
    return-object v23

    .line 805
    :catchall_10
    move-exception v0

    .line 806
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 807
    .line 808
    .line 809
    throw v0

    .line 810
    :goto_27
    monitor-exit v10

    .line 811
    throw v0
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_11

    .line 812
    :catchall_11
    move-exception v0

    .line 813
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 814
    .line 815
    .line 816
    throw v0

    .line 817
    :catchall_12
    move-exception v0

    .line 818
    monitor-exit v12

    .line 819
    throw v0
.end method

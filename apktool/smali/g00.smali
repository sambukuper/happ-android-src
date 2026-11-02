.class public final synthetic Lg00;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, Lg00;->X:B

    iput-object p1, p0, Lg00;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lg00;->Z:Ljava/lang/Object;

    iput-object p3, p0, Lg00;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Llp2;Lep0;Lxb7;Lwy4;)V
    .locals 0

    .line 1
    const/4 p4, 0x6

    .line 2
    iput-byte p4, p0, Lg00;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lg00;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lg00;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lg00;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lg00;->X:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v7, v1

    .line 15
    check-cast v7, Lx39;

    .line 16
    .line 17
    iget-object v1, v0, Lg00;->Z:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v8, v1

    .line 20
    check-cast v8, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lg49;

    .line 25
    .line 26
    sget-object v1, Ldn8;->a:Ldn8;

    .line 27
    .line 28
    iget-object v2, v7, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2, v8}, Ln49;->d(Ljava/lang/String;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-gt v9, v3, :cond_c

    .line 43
    .line 44
    invoke-static {v6}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Lj49;

    .line 49
    .line 50
    if-nez v6, :cond_1

    .line 51
    .line 52
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    new-instance v6, Ll39;

    .line 57
    .line 58
    sget-object v9, Lg62;->Y:Lg62;

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    invoke-direct/range {v6 .. v11}, Ll39;-><init>(Lx39;Ljava/lang/String;Lg62;Ljava/util/List;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Lq12;->a(Ll39;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    :goto_0
    move-object v5, v1

    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_1
    iget-object v9, v6, Lj49;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v2, v9}, Ln49;->c(Ljava/lang/String;)Ll49;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    if-eqz v10, :cond_b

    .line 77
    .line 78
    invoke-virtual {v10}, Ll49;->c()Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_a

    .line 83
    .line 84
    iget-object v10, v6, Lj49;->b:Lu39;

    .line 85
    .line 86
    sget-object v11, Lu39;->h0:Lu39;

    .line 87
    .line 88
    if-ne v10, v11, :cond_2

    .line 89
    .line 90
    invoke-virtual {v2, v9}, Ln49;->a(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    new-instance v6, Ll39;

    .line 98
    .line 99
    sget-object v9, Lg62;->Y:Lg62;

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    invoke-direct/range {v6 .. v11}, Ll39;-><init>(Lx39;Ljava/lang/String;Lg62;Ljava/util/List;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v6}, Lq12;->a(Ll39;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    iget-object v8, v0, Lg49;->b:Ll49;

    .line 110
    .line 111
    iget-object v9, v6, Lj49;->a:Ljava/lang/String;

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const v21, 0x1fffffe

    .line 116
    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    const/4 v11, 0x0

    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const-wide/16 v14, 0x0

    .line 123
    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const-wide/16 v18, 0x0

    .line 129
    .line 130
    invoke-static/range {v8 .. v21}, Ll49;->b(Ll49;Ljava/lang/String;Lu39;Ljava/lang/String;Lu91;IJIIJII)Ll49;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    iget-object v2, v7, Lx39;->n0:Lfv5;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v6, v7, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v15, v7, Lx39;->j0:Lxy0;

    .line 145
    .line 146
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v11, v7, Lx39;->m0:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v12, v0, Lg49;->c:Ljava/util/Set;

    .line 155
    .line 156
    const-string v0, "OneTime"

    .line 157
    .line 158
    const-string v8, "Periodic"

    .line 159
    .line 160
    move-object v9, v8

    .line 161
    iget-object v8, v10, Ll49;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-virtual {v13, v8}, Ln49;->c(Ljava/lang/String;)Ll49;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    if-eqz v13, :cond_9

    .line 172
    .line 173
    iget-object v5, v13, Ll49;->b:Lu39;

    .line 174
    .line 175
    invoke-virtual {v5}, Lu39;->a()Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_3

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_3
    invoke-virtual {v13}, Ll49;->c()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    invoke-virtual {v10}, Ll49;->c()Z

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    xor-int/2addr v5, v14

    .line 191
    if-nez v5, :cond_6

    .line 192
    .line 193
    iget-object v5, v2, Lfv5;->k:Ljava/lang/Object;

    .line 194
    .line 195
    monitor-enter v5

    .line 196
    :try_start_0
    invoke-virtual {v2, v8}, Lfv5;->c(Ljava/lang/String;)La59;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_4

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_4
    move v3, v4

    .line 204
    :goto_1
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    if-nez v3, :cond_5

    .line 206
    .line 207
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_5

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Lxw6;

    .line 222
    .line 223
    invoke-interface {v2, v8}, Lxw6;->d(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_5
    move-object v14, v7

    .line 228
    move-object v7, v6

    .line 229
    new-instance v6, Ld40;

    .line 230
    .line 231
    move-object v9, v13

    .line 232
    move v13, v3

    .line 233
    invoke-direct/range {v6 .. v14}, Ld40;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ll49;Ll49;Ljava/util/List;Ljava/util/Set;ZLx39;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v6}, Lql6;->o(Ljava/lang/Runnable;)V

    .line 237
    .line 238
    .line 239
    if-nez v13, :cond_0

    .line 240
    .line 241
    invoke-static {v15, v7, v11}, Lax6;->b(Lxy0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :catchall_0
    move-exception v0

    .line 247
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    throw v0

    .line 249
    :cond_6
    move-object v1, v13

    .line 250
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    .line 251
    .line 252
    invoke-virtual {v1}, Ll49;->c()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_7

    .line 257
    .line 258
    move-object v1, v9

    .line 259
    goto :goto_3

    .line 260
    :cond_7
    move-object v1, v0

    .line 261
    :goto_3
    invoke-virtual {v10}, Ll49;->c()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_8

    .line 266
    .line 267
    move-object v0, v9

    .line 268
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v4, "Can\'t update "

    .line 271
    .line 272
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const-string v1, " Worker to "

    .line 279
    .line 280
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v0, " Worker. Update operation must preserve worker\'s type."

    .line 287
    .line 288
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-direct {v2, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v2

    .line 299
    :cond_9
    const-string v0, "Worker with "

    .line 300
    .line 301
    const-string v1, " doesn\'t exist"

    .line 302
    .line 303
    invoke-static {v0, v8, v1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_a
    const-string v0, "Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type."

    .line 312
    .line 313
    invoke-static {v0}, Lu52;->k(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_b
    const-string v0, "WorkSpec with "

    .line 318
    .line 319
    const-string v1, ", that matches a name \""

    .line 320
    .line 321
    const-string v2, "\", wasn\'t found"

    .line 322
    .line 323
    invoke-static {v0, v9, v1, v8, v2}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_c
    const-string v0, "Can\'t apply UPDATE policy to the chains of work."

    .line 332
    .line 333
    invoke-static {v0}, Lu52;->k(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :goto_4
    return-object v5

    .line 337
    :pswitch_0
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, Le49;

    .line 340
    .line 341
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v2, Ljava/util/UUID;

    .line 344
    .line 345
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Lu91;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {}, Llh4;->P0()Llh4;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object v1, v1, Le49;->a:Landroidx/work/impl/WorkDatabase;

    .line 367
    .line 368
    invoke-virtual {v1}, Lql6;->b()V

    .line 369
    .line 370
    .line 371
    :try_start_2
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v2, v6}, Ln49;->c(Ljava/lang/String;)Ll49;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    if-eqz v2, :cond_e

    .line 380
    .line 381
    iget-object v2, v2, Ll49;->b:Lu39;

    .line 382
    .line 383
    sget-object v7, Lu39;->Y:Lu39;

    .line 384
    .line 385
    if-ne v2, v7, :cond_d

    .line 386
    .line 387
    new-instance v2, Lc49;

    .line 388
    .line 389
    invoke-direct {v2, v6, v0}, Lc49;-><init>(Ljava/lang/String;Lu91;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->w()Ld49;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    iget-object v6, v0, Ld49;->a:Lql6;

    .line 400
    .line 401
    new-instance v7, Lgq6;

    .line 402
    .line 403
    const/16 v8, 0x19

    .line 404
    .line 405
    invoke-direct {v7, v0, v2, v8}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 406
    .line 407
    .line 408
    invoke-static {v6, v4, v3, v7}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    goto :goto_5

    .line 412
    :catchall_1
    move-exception v0

    .line 413
    goto :goto_6

    .line 414
    :cond_d
    invoke-static {}, Llh4;->P0()Llh4;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    :goto_5
    invoke-virtual {v1}, Lql6;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1}, Lql6;->l()V

    .line 425
    .line 426
    .line 427
    return-object v5

    .line 428
    :cond_e
    :try_start_3
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 429
    .line 430
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 431
    .line 432
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 436
    :goto_6
    :try_start_4
    invoke-static {}, Llh4;->P0()Llh4;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 444
    :catchall_2
    move-exception v0

    .line 445
    invoke-virtual {v1}, Lql6;->l()V

    .line 446
    .line 447
    .line 448
    throw v0

    .line 449
    :pswitch_1
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v1, Landroidx/compose/ui/platform/AbstractComposeView;

    .line 452
    .line 453
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v2, Lge;

    .line 456
    .line 457
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v0, Ldw8;

    .line 460
    .line 461
    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 462
    .line 463
    .line 464
    invoke-static {v1}, Lcr5;->b(Landroid/view/View;)Ldr5;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    iget-object v1, v1, Ldr5;->a:Ljava/util/ArrayList;

    .line 469
    .line 470
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    sget-object v0, Ldn8;->a:Ldn8;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_2
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v1, Lh57;

    .line 479
    .line 480
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 481
    .line 482
    move-object v6, v2

    .line 483
    check-cast v6, Lmi0;

    .line 484
    .line 485
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 486
    .line 487
    move-object v10, v0

    .line 488
    check-cast v10, Lst2;

    .line 489
    .line 490
    iget-object v0, v1, Lh57;->e:Lvz7;

    .line 491
    .line 492
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    check-cast v0, Le57;

    .line 497
    .line 498
    invoke-virtual {v0}, Le57;->c()Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-eqz v0, :cond_f

    .line 503
    .line 504
    iget-object v0, v1, Lh57;->f:Lvz7;

    .line 505
    .line 506
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, Lf57;

    .line 511
    .line 512
    move-object v8, v0

    .line 513
    goto :goto_7

    .line 514
    :cond_f
    move-object v8, v5

    .line 515
    :goto_7
    if-nez v8, :cond_10

    .line 516
    .line 517
    :goto_8
    move v7, v4

    .line 518
    goto :goto_9

    .line 519
    :cond_10
    iget v0, v8, Lf57;->h:I

    .line 520
    .line 521
    if-ne v0, v3, :cond_11

    .line 522
    .line 523
    move v7, v3

    .line 524
    goto :goto_9

    .line 525
    :cond_11
    if-nez v0, :cond_12

    .line 526
    .line 527
    goto :goto_8

    .line 528
    :cond_12
    if-eqz v0, :cond_13

    .line 529
    .line 530
    if-eq v0, v3, :cond_13

    .line 531
    .line 532
    move v7, v0

    .line 533
    :goto_9
    iget-object v0, v1, Lh57;->c:Lvz7;

    .line 534
    .line 535
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    move-object v12, v0

    .line 540
    check-cast v12, Ljava/util/Map;

    .line 541
    .line 542
    iget-object v0, v1, Lh57;->d:Lvz7;

    .line 543
    .line 544
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    move-object v13, v0

    .line 549
    check-cast v13, Ljava/util/Map;

    .line 550
    .line 551
    const/4 v9, 0x0

    .line 552
    const/4 v11, 0x0

    .line 553
    invoke-virtual/range {v6 .. v13}, Lmi0;->a(ILf57;ZLst2;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Lli0;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    goto :goto_a

    .line 558
    :cond_13
    const-string v0, "kotlin.Unit"

    .line 559
    .line 560
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    :goto_a
    return-object v5

    .line 564
    :pswitch_3
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v1, Landroid/content/Context;

    .line 567
    .line 568
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v2, Landroid/content/Intent;

    .line 571
    .line 572
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, Ldn2;

    .line 575
    .line 576
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 577
    .line 578
    .line 579
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    sget-object v0, Ldn8;->a:Ldn8;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_4
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, Ly68;

    .line 588
    .line 589
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v2, Lgn2;

    .line 592
    .line 593
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v0, Ldn2;

    .line 596
    .line 597
    invoke-virtual {v1}, Ly68;->c()Lh48;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    iget-object v1, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 602
    .line 603
    invoke-static {v1}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-interface {v2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    sget-object v0, Ldn8;->a:Ldn8;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_5
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v1, Lpv3;

    .line 623
    .line 624
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v2, Ldn2;

    .line 627
    .line 628
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v0, Ldn2;

    .line 631
    .line 632
    check-cast v1, Lgn2;

    .line 633
    .line 634
    sget-object v3, Lew5;->a:Lew5;

    .line 635
    .line 636
    invoke-interface {v1, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    if-eqz v2, :cond_14

    .line 640
    .line 641
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    :cond_14
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    sget-object v0, Ldn8;->a:Ldn8;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_6
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v1, Lgp2;

    .line 653
    .line 654
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v2, Lbc7;

    .line 657
    .line 658
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v0, Lvc5;

    .line 661
    .line 662
    if-eqz v1, :cond_15

    .line 663
    .line 664
    invoke-virtual {v2, v1}, Lbc7;->c(Lgp2;)I

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    iget v4, v2, Lbc7;->t:I

    .line 669
    .line 670
    sub-int/2addr v1, v4

    .line 671
    invoke-virtual {v2, v1}, Lbc7;->a(I)V

    .line 672
    .line 673
    .line 674
    :cond_15
    iget v1, v2, Lbc7;->t:I

    .line 675
    .line 676
    invoke-static {v2, v5, v1, v5}, Lnr4;->k(Lbc7;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-static {v1}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    check-cast v2, Ltz0;

    .line 685
    .line 686
    if-eqz v2, :cond_16

    .line 687
    .line 688
    iget-object v2, v2, Ltz0;->b:Ljava/lang/Integer;

    .line 689
    .line 690
    goto :goto_b

    .line 691
    :cond_16
    move-object v2, v5

    .line 692
    :goto_b
    invoke-interface {v0, v2}, Lvc5;->b(Ljava/lang/Integer;)Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    if-eqz v2, :cond_18

    .line 697
    .line 698
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 699
    .line 700
    .line 701
    move-result v6

    .line 702
    if-eqz v6, :cond_17

    .line 703
    .line 704
    goto :goto_c

    .line 705
    :cond_17
    invoke-static {v4}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    check-cast v6, Ltz0;

    .line 710
    .line 711
    invoke-static {v4, v3}, Lwv0;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    iget v4, v6, Ltz0;->a:I

    .line 716
    .line 717
    new-instance v6, Ltz0;

    .line 718
    .line 719
    invoke-direct {v6, v4, v5, v2}, Ltz0;-><init>(ILzc1;Ljava/lang/Integer;)V

    .line 720
    .line 721
    .line 722
    invoke-static {v6}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-static {v2, v3}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    :cond_18
    :goto_c
    new-instance v2, Lrz0;

    .line 731
    .line 732
    invoke-static {v1, v4}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-interface {v0}, Lvc5;->z()Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    invoke-direct {v2, v1, v0}, Lrz0;-><init>(Ljava/util/List;Z)V

    .line 741
    .line 742
    .line 743
    return-object v2

    .line 744
    :pswitch_7
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v1, Lgn2;

    .line 747
    .line 748
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v2, Li55;

    .line 751
    .line 752
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Laa6;

    .line 755
    .line 756
    sget-object v5, Ls86;->e:Ls86;

    .line 757
    .line 758
    sget-object v6, Li55;->Z0:Lpk6;

    .line 759
    .line 760
    invoke-interface {v1, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    iget-object v1, v2, Li55;->L0:Lx67;

    .line 764
    .line 765
    iget-object v7, v6, Lpk6;->q0:Lx67;

    .line 766
    .line 767
    invoke-static {v1, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    iget-boolean v7, v2, Li55;->O0:Z

    .line 772
    .line 773
    iget-boolean v8, v6, Lpk6;->r0:Z

    .line 774
    .line 775
    if-eq v7, v8, :cond_19

    .line 776
    .line 777
    move v4, v3

    .line 778
    :cond_19
    iget-object v7, v6, Lpk6;->q0:Lx67;

    .line 779
    .line 780
    iget-wide v8, v6, Lpk6;->t0:J

    .line 781
    .line 782
    iget-object v10, v6, Lpk6;->w0:Lz24;

    .line 783
    .line 784
    iget-object v11, v6, Lpk6;->v0:Lfi1;

    .line 785
    .line 786
    invoke-interface {v7, v8, v9, v10, v11}, Lx67;->a(JLz24;Lfi1;)Lmb6;

    .line 787
    .line 788
    .line 789
    move-result-object v7

    .line 790
    iput-object v7, v6, Lpk6;->A0:Lmb6;

    .line 791
    .line 792
    iget-object v8, v2, Li55;->N0:Ls86;

    .line 793
    .line 794
    invoke-virtual {v7}, Lmb6;->D()Ls86;

    .line 795
    .line 796
    .line 797
    move-result-object v7

    .line 798
    invoke-static {v8, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v7

    .line 802
    xor-int/lit8 v8, v7, 0x1

    .line 803
    .line 804
    iput-boolean v8, v0, Laa6;->X:Z

    .line 805
    .line 806
    if-eqz v1, :cond_1a

    .line 807
    .line 808
    if-nez v4, :cond_1a

    .line 809
    .line 810
    if-nez v7, :cond_1f

    .line 811
    .line 812
    :cond_1a
    iget-object v0, v6, Lpk6;->q0:Lx67;

    .line 813
    .line 814
    iput-object v0, v2, Li55;->L0:Lx67;

    .line 815
    .line 816
    iget-boolean v0, v6, Lpk6;->r0:Z

    .line 817
    .line 818
    iput-boolean v0, v2, Li55;->O0:Z

    .line 819
    .line 820
    iget-object v0, v6, Lpk6;->A0:Lmb6;

    .line 821
    .line 822
    if-eqz v0, :cond_1b

    .line 823
    .line 824
    invoke-virtual {v0}, Lmb6;->D()Ls86;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    if-nez v0, :cond_1c

    .line 829
    .line 830
    :cond_1b
    move-object v0, v5

    .line 831
    :cond_1c
    iput-object v0, v2, Li55;->N0:Ls86;

    .line 832
    .line 833
    iget-object v0, v6, Lpk6;->A0:Lmb6;

    .line 834
    .line 835
    if-eqz v0, :cond_1d

    .line 836
    .line 837
    invoke-virtual {v0}, Lmb6;->D()Ls86;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    if-eqz v0, :cond_1d

    .line 842
    .line 843
    invoke-static {v0}, Los4;->L(Ls86;)Llf3;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    new-instance v5, Ls86;

    .line 848
    .line 849
    iget v6, v0, Llf3;->a:I

    .line 850
    .line 851
    int-to-float v6, v6

    .line 852
    iget v7, v0, Llf3;->b:I

    .line 853
    .line 854
    int-to-float v7, v7

    .line 855
    iget v8, v0, Llf3;->c:I

    .line 856
    .line 857
    int-to-float v8, v8

    .line 858
    iget v0, v0, Llf3;->d:I

    .line 859
    .line 860
    int-to-float v0, v0

    .line 861
    invoke-direct {v5, v6, v7, v8, v0}, Ls86;-><init>(FFFF)V

    .line 862
    .line 863
    .line 864
    :cond_1d
    iput-object v5, v2, Li55;->M0:Ls86;

    .line 865
    .line 866
    iget-boolean v0, v2, Li55;->P0:Z

    .line 867
    .line 868
    if-eqz v0, :cond_1f

    .line 869
    .line 870
    if-nez v4, :cond_1e

    .line 871
    .line 872
    iget-boolean v0, v2, Li55;->O0:Z

    .line 873
    .line 874
    if-eqz v0, :cond_1f

    .line 875
    .line 876
    if-nez v1, :cond_1f

    .line 877
    .line 878
    :cond_1e
    iget-object v0, v2, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 879
    .line 880
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->I()V

    .line 881
    .line 882
    .line 883
    :cond_1f
    iput-boolean v3, v2, Li55;->P0:Z

    .line 884
    .line 885
    sget-object v0, Ldn8;->a:Ldn8;

    .line 886
    .line 887
    return-object v0

    .line 888
    :pswitch_8
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v1, Lo87;

    .line 891
    .line 892
    iget-object v3, v0, Lg00;->Z:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v3, Lb71;

    .line 895
    .line 896
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v0, Lo87;

    .line 899
    .line 900
    iget-object v1, v1, Lo87;->d:Lt5;

    .line 901
    .line 902
    iget-object v1, v1, Lt5;->f0:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v1, Lgn2;

    .line 905
    .line 906
    sget-object v4, Lp87;->Y:Lp87;

    .line 907
    .line 908
    invoke-interface {v1, v4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    check-cast v1, Ljava/lang/Boolean;

    .line 913
    .line 914
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 915
    .line 916
    .line 917
    move-result v1

    .line 918
    if-eqz v1, :cond_20

    .line 919
    .line 920
    new-instance v1, Luw4;

    .line 921
    .line 922
    const/4 v4, 0x6

    .line 923
    invoke-direct {v1, v0, v5, v4}, Luw4;-><init>(Lo87;Lq51;B)V

    .line 924
    .line 925
    .line 926
    invoke-static {v3, v5, v5, v1, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 927
    .line 928
    .line 929
    :cond_20
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 930
    .line 931
    return-object v0

    .line 932
    :pswitch_9
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 935
    .line 936
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v2, Ljava/lang/String;

    .line 939
    .line 940
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 941
    .line 942
    check-cast v0, Ljava/io/File;

    .line 943
    .line 944
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    :try_start_5
    new-instance v2, Ljava/io/FileOutputStream;

    .line 953
    .line 954
    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 955
    .line 956
    .line 957
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-static {v1, v2}, Lgv3;->m(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 961
    .line 962
    .line 963
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 964
    .line 965
    .line 966
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 967
    .line 968
    .line 969
    const-string v1, "HAPP"

    .line 970
    .line 971
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    new-instance v2, Ljava/lang/StringBuilder;

    .line 976
    .line 977
    const-string v3, "Copied from apk assets folder to "

    .line 978
    .line 979
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 990
    .line 991
    .line 992
    move-result v0

    .line 993
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    return-object v0

    .line 998
    :catchall_3
    move-exception v0

    .line 999
    move-object v2, v0

    .line 1000
    goto :goto_d

    .line 1001
    :catchall_4
    move-exception v0

    .line 1002
    move-object v3, v0

    .line 1003
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 1004
    :catchall_5
    move-exception v0

    .line 1005
    :try_start_9
    invoke-static {v2, v3}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1006
    .line 1007
    .line 1008
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1009
    :goto_d
    :try_start_a
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 1010
    :catchall_6
    move-exception v0

    .line 1011
    invoke-static {v1, v2}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1012
    .line 1013
    .line 1014
    throw v0

    .line 1015
    :pswitch_a
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v1, Lrn2;

    .line 1018
    .line 1019
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v2, Lea6;

    .line 1022
    .line 1023
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast v0, Lw03;

    .line 1026
    .line 1027
    iget-object v2, v2, Lea6;->X:Ljava/lang/Object;

    .line 1028
    .line 1029
    check-cast v2, Lvi4;

    .line 1030
    .line 1031
    iget-object v3, v2, Lvi4;->o0:Ls05;

    .line 1032
    .line 1033
    if-nez v3, :cond_21

    .line 1034
    .line 1035
    sget-object v3, Luw6;->a:[J

    .line 1036
    .line 1037
    new-instance v3, Ls05;

    .line 1038
    .line 1039
    invoke-direct {v3}, Ls05;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    iput-object v3, v2, Lvi4;->o0:Ls05;

    .line 1043
    .line 1044
    :cond_21
    invoke-virtual {v3, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v5

    .line 1048
    if-nez v5, :cond_22

    .line 1049
    .line 1050
    new-instance v5, Lti4;

    .line 1051
    .line 1052
    invoke-direct {v5, v2}, Lti4;-><init>(Lvi4;)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v3, v0, v5}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    :cond_22
    check-cast v5, Lti4;

    .line 1059
    .line 1060
    iput-boolean v4, v5, Lti4;->X:Z

    .line 1061
    .line 1062
    invoke-interface {v1, v5, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1066
    .line 1067
    return-object v0

    .line 1068
    :pswitch_b
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v1, Lzi1;

    .line 1071
    .line 1072
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v2, Lj74;

    .line 1075
    .line 1076
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v0, Lk44;

    .line 1079
    .line 1080
    invoke-virtual {v1}, Lzi1;->getValue()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    check-cast v1, Ly64;

    .line 1085
    .line 1086
    new-instance v3, Lne;

    .line 1087
    .line 1088
    iget-object v4, v2, Lj74;->g0:Lwg;

    .line 1089
    .line 1090
    iget-object v4, v4, Lwg;->e:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v4, Lj64;

    .line 1093
    .line 1094
    invoke-virtual {v4}, Lj64;->getValue()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v4

    .line 1098
    check-cast v4, Lkf3;

    .line 1099
    .line 1100
    invoke-direct {v3, v4, v1}, Lne;-><init>(Lkf3;Ly64;)V

    .line 1101
    .line 1102
    .line 1103
    new-instance v4, Lz64;

    .line 1104
    .line 1105
    invoke-direct {v4, v2, v1, v0, v3}, Lz64;-><init>(Lj74;Ly64;Lk44;Lne;)V

    .line 1106
    .line 1107
    .line 1108
    return-object v4

    .line 1109
    :pswitch_c
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v1, Laa6;

    .line 1112
    .line 1113
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 1116
    .line 1117
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1118
    .line 1119
    check-cast v0, Lq7;

    .line 1120
    .line 1121
    iget-boolean v1, v1, Laa6;->X:Z

    .line 1122
    .line 1123
    if-eqz v1, :cond_23

    .line 1124
    .line 1125
    invoke-static {}, Llh4;->P0()Llh4;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    sget v3, Lk39;->a:I

    .line 1130
    .line 1131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 1135
    .line 1136
    .line 1137
    :cond_23
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1138
    .line 1139
    return-object v0

    .line 1140
    :pswitch_d
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v1, Lgn2;

    .line 1143
    .line 1144
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1145
    .line 1146
    check-cast v2, Lzo8;

    .line 1147
    .line 1148
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v0, Ly05;

    .line 1151
    .line 1152
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1153
    .line 1154
    invoke-interface {v0, v3}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    new-instance v0, Lwa3;

    .line 1158
    .line 1159
    invoke-direct {v0, v2}, Lwa3;-><init>(Lzo8;)V

    .line 1160
    .line 1161
    .line 1162
    invoke-interface {v1, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1166
    .line 1167
    return-object v0

    .line 1168
    :pswitch_e
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1169
    .line 1170
    check-cast v1, Lgn2;

    .line 1171
    .line 1172
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v2, Ly05;

    .line 1175
    .line 1176
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v0, Lgn2;

    .line 1179
    .line 1180
    if-eqz v1, :cond_24

    .line 1181
    .line 1182
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v3

    .line 1186
    check-cast v3, Ljava/lang/Boolean;

    .line 1187
    .line 1188
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1189
    .line 1190
    .line 1191
    invoke-interface {v1, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v1

    .line 1195
    check-cast v1, Ljava/lang/Boolean;

    .line 1196
    .line 1197
    if-eqz v1, :cond_24

    .line 1198
    .line 1199
    invoke-interface {v2, v1}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 1200
    .line 1201
    .line 1202
    goto :goto_e

    .line 1203
    :cond_24
    invoke-static {v0, v2, v5}, Lg33;->b(Lgn2;Ly05;Ljava/lang/Boolean;)V

    .line 1204
    .line 1205
    .line 1206
    :goto_e
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1207
    .line 1208
    return-object v0

    .line 1209
    :pswitch_f
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v1, Llp2;

    .line 1212
    .line 1213
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v2, Lep0;

    .line 1216
    .line 1217
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1218
    .line 1219
    check-cast v0, Lxb7;

    .line 1220
    .line 1221
    iget-object v3, v1, Llp2;->M:La01;

    .line 1222
    .line 1223
    iget-object v6, v3, La01;->b:Lep0;

    .line 1224
    .line 1225
    :try_start_b
    iput-object v2, v3, La01;->b:Lep0;

    .line 1226
    .line 1227
    iget-object v2, v1, Llp2;->G:Lxb7;

    .line 1228
    .line 1229
    iget-object v7, v1, Llp2;->o:[I

    .line 1230
    .line 1231
    iget-object v8, v1, Llp2;->v:Lvz4;

    .line 1232
    .line 1233
    iput-object v5, v1, Llp2;->o:[I

    .line 1234
    .line 1235
    iput-object v5, v1, Llp2;->v:Lvz4;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1236
    .line 1237
    :try_start_c
    iput-object v0, v1, Llp2;->G:Lxb7;

    .line 1238
    .line 1239
    iget-boolean v9, v3, La01;->e:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1240
    .line 1241
    :try_start_d
    iput-boolean v4, v3, La01;->e:Z

    .line 1242
    .line 1243
    invoke-virtual {v1, v5, v5}, Llp2;->B(Lkl5;Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 1244
    .line 1245
    .line 1246
    :try_start_e
    iput-boolean v9, v3, La01;->e:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1247
    .line 1248
    :try_start_f
    iput-object v2, v1, Llp2;->G:Lxb7;

    .line 1249
    .line 1250
    iput-object v7, v1, Llp2;->o:[I

    .line 1251
    .line 1252
    iput-object v8, v1, Llp2;->v:Lvz4;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1253
    .line 1254
    iput-object v6, v3, La01;->b:Lep0;

    .line 1255
    .line 1256
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1257
    .line 1258
    return-object v0

    .line 1259
    :catchall_7
    move-exception v0

    .line 1260
    goto :goto_10

    .line 1261
    :catchall_8
    move-exception v0

    .line 1262
    goto :goto_f

    .line 1263
    :catchall_9
    move-exception v0

    .line 1264
    :try_start_10
    iput-boolean v9, v3, La01;->e:Z

    .line 1265
    .line 1266
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1267
    :goto_f
    :try_start_11
    iput-object v2, v1, Llp2;->G:Lxb7;

    .line 1268
    .line 1269
    iput-object v7, v1, Llp2;->o:[I

    .line 1270
    .line 1271
    iput-object v8, v1, Llp2;->v:Lvz4;

    .line 1272
    .line 1273
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 1274
    :goto_10
    iput-object v6, v3, La01;->b:Lep0;

    .line 1275
    .line 1276
    throw v0

    .line 1277
    :pswitch_10
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1278
    .line 1279
    move-object v6, v1

    .line 1280
    check-cast v6, Lo41;

    .line 1281
    .line 1282
    iget-object v1, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1283
    .line 1284
    check-cast v1, Lqo8;

    .line 1285
    .line 1286
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v0, Lw80;

    .line 1289
    .line 1290
    sget-object v2, Ldn8;->a:Ldn8;

    .line 1291
    .line 1292
    iget-object v13, v6, Lo41;->v0:Lyr2;

    .line 1293
    .line 1294
    :goto_11
    iget-object v7, v13, Lyr2;->Y:Ljava/lang/Object;

    .line 1295
    .line 1296
    check-cast v7, Lc15;

    .line 1297
    .line 1298
    iget v8, v7, Lc15;->Z:I

    .line 1299
    .line 1300
    if-eqz v8, :cond_27

    .line 1301
    .line 1302
    if-eqz v8, :cond_26

    .line 1303
    .line 1304
    add-int/lit8 v8, v8, -0x1

    .line 1305
    .line 1306
    iget-object v7, v7, Lc15;->X:[Ljava/lang/Object;

    .line 1307
    .line 1308
    aget-object v7, v7, v8

    .line 1309
    .line 1310
    check-cast v7, Ll41;

    .line 1311
    .line 1312
    iget-object v7, v7, Ll41;->a:Ls80;

    .line 1313
    .line 1314
    invoke-virtual {v7}, Ls80;->invoke()Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v7

    .line 1318
    check-cast v7, Ls86;

    .line 1319
    .line 1320
    if-nez v7, :cond_25

    .line 1321
    .line 1322
    move v7, v3

    .line 1323
    goto :goto_12

    .line 1324
    :cond_25
    const-wide/16 v10, 0x0

    .line 1325
    .line 1326
    const/4 v12, 0x3

    .line 1327
    const-wide/16 v8, 0x0

    .line 1328
    .line 1329
    invoke-static/range {v6 .. v12}, Lo41;->a1(Lo41;Ls86;JJI)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v7

    .line 1333
    :goto_12
    if-eqz v7, :cond_27

    .line 1334
    .line 1335
    iget-object v7, v13, Lyr2;->Y:Ljava/lang/Object;

    .line 1336
    .line 1337
    check-cast v7, Lc15;

    .line 1338
    .line 1339
    iget v8, v7, Lc15;->Z:I

    .line 1340
    .line 1341
    sub-int/2addr v8, v3

    .line 1342
    invoke-virtual {v7, v8}, Lc15;->k(I)Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v7

    .line 1346
    check-cast v7, Ll41;

    .line 1347
    .line 1348
    iget-object v7, v7, Ll41;->b:Lmm0;

    .line 1349
    .line 1350
    invoke-virtual {v7, v2}, Lmm0;->f(Ljava/lang/Object;)V

    .line 1351
    .line 1352
    .line 1353
    goto :goto_11

    .line 1354
    :cond_26
    const-string v0, "MutableVector is empty."

    .line 1355
    .line 1356
    invoke-static {v0}, Lem7;->g(Ljava/lang/String;)V

    .line 1357
    .line 1358
    .line 1359
    goto :goto_13

    .line 1360
    :cond_27
    iget-boolean v5, v6, Lo41;->w0:Z

    .line 1361
    .line 1362
    if-eqz v5, :cond_28

    .line 1363
    .line 1364
    iget-object v5, v6, Lo41;->u0:Lly6;

    .line 1365
    .line 1366
    invoke-virtual {v5}, Lly6;->invoke()Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v5

    .line 1370
    move-object v7, v5

    .line 1371
    check-cast v7, Ls86;

    .line 1372
    .line 1373
    if-eqz v7, :cond_28

    .line 1374
    .line 1375
    const-wide/16 v10, 0x0

    .line 1376
    .line 1377
    const/4 v12, 0x3

    .line 1378
    const-wide/16 v8, 0x0

    .line 1379
    .line 1380
    invoke-static/range {v6 .. v12}, Lo41;->a1(Lo41;Ls86;JJI)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v5

    .line 1384
    if-ne v5, v3, :cond_28

    .line 1385
    .line 1386
    iput-boolean v4, v6, Lo41;->w0:Z

    .line 1387
    .line 1388
    :cond_28
    const-wide/16 v3, 0x0

    .line 1389
    .line 1390
    invoke-virtual {v6, v0, v3, v4}, Lo41;->Y0(Lw80;J)F

    .line 1391
    .line 1392
    .line 1393
    move-result v0

    .line 1394
    iput v0, v1, Lqo8;->e:F

    .line 1395
    .line 1396
    move-object v5, v2

    .line 1397
    :goto_13
    return-object v5

    .line 1398
    :pswitch_11
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v1, Lokhttp3/CertificatePinner;

    .line 1401
    .line 1402
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v2, Lokhttp3/Handshake;

    .line 1405
    .line 1406
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v0, Lokhttp3/Address;

    .line 1409
    .line 1410
    invoke-static {v1, v2, v0}, Lokhttp3/internal/connection/ConnectPlan;->a(Lokhttp3/CertificatePinner;Lokhttp3/Handshake;Lokhttp3/Address;)Ljava/util/List;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    return-object v0

    .line 1415
    :pswitch_12
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v1, Lokhttp3/CertificatePinner;

    .line 1418
    .line 1419
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v2, Ljava/util/List;

    .line 1422
    .line 1423
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v0, Ljava/lang/String;

    .line 1426
    .line 1427
    invoke-static {v1, v2, v0}, Lokhttp3/CertificatePinner;->a(Lokhttp3/CertificatePinner;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    return-object v0

    .line 1432
    :pswitch_13
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1433
    .line 1434
    check-cast v1, Lt80;

    .line 1435
    .line 1436
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1437
    .line 1438
    check-cast v2, Li55;

    .line 1439
    .line 1440
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1441
    .line 1442
    check-cast v0, Lp5;

    .line 1443
    .line 1444
    invoke-static {v1, v2, v0}, Lt80;->Y0(Lt80;Li55;Lp5;)Ls86;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v7

    .line 1448
    if-eqz v7, :cond_2a

    .line 1449
    .line 1450
    iget-object v6, v1, Lt80;->q0:Lo41;

    .line 1451
    .line 1452
    iget-wide v0, v6, Lo41;->x0:J

    .line 1453
    .line 1454
    const-wide/16 v2, -0x1

    .line 1455
    .line 1456
    invoke-static {v0, v1, v2, v3}, Lpf3;->a(JJ)Z

    .line 1457
    .line 1458
    .line 1459
    move-result v0

    .line 1460
    if-eqz v0, :cond_29

    .line 1461
    .line 1462
    const-string v0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 1463
    .line 1464
    invoke-static {v0}, Lzc3;->c(Ljava/lang/String;)V

    .line 1465
    .line 1466
    .line 1467
    :cond_29
    invoke-virtual {v6}, Lo41;->Z0()J

    .line 1468
    .line 1469
    .line 1470
    move-result-wide v8

    .line 1471
    const-wide/16 v10, 0x0

    .line 1472
    .line 1473
    invoke-virtual/range {v6 .. v11}, Lo41;->c1(Ls86;JJ)J

    .line 1474
    .line 1475
    .line 1476
    move-result-wide v0

    .line 1477
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    xor-long/2addr v0, v2

    .line 1483
    invoke-virtual {v7, v0, v1}, Ls86;->k(J)Ls86;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v5

    .line 1487
    :cond_2a
    return-object v5

    .line 1488
    :pswitch_14
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v1, Ljc8;

    .line 1491
    .line 1492
    iget-object v3, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1493
    .line 1494
    check-cast v3, Lb71;

    .line 1495
    .line 1496
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1497
    .line 1498
    check-cast v0, Ly05;

    .line 1499
    .line 1500
    invoke-virtual {v1}, Ljc8;->b()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v6

    .line 1504
    if-eqz v6, :cond_2b

    .line 1505
    .line 1506
    new-instance v6, Ll40;

    .line 1507
    .line 1508
    invoke-direct {v6, v1, v5, v4}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 1509
    .line 1510
    .line 1511
    invoke-static {v3, v5, v5, v6, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 1512
    .line 1513
    .line 1514
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1515
    .line 1516
    invoke-interface {v0, v1}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 1517
    .line 1518
    .line 1519
    :cond_2b
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1520
    .line 1521
    return-object v0

    .line 1522
    :pswitch_15
    iget-object v1, v0, Lg00;->Y:Ljava/lang/Object;

    .line 1523
    .line 1524
    check-cast v1, Lh00;

    .line 1525
    .line 1526
    iget-object v2, v0, Lg00;->Z:Ljava/lang/Object;

    .line 1527
    .line 1528
    check-cast v2, Ly5;

    .line 1529
    .line 1530
    iget-object v0, v0, Lg00;->f0:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v0, Lca6;

    .line 1533
    .line 1534
    invoke-virtual {v1}, Lh00;->a()V

    .line 1535
    .line 1536
    .line 1537
    iget-object v1, v2, Ly5;->g0:Ljava/lang/Object;

    .line 1538
    .line 1539
    check-cast v1, Lrv;

    .line 1540
    .line 1541
    iget v0, v0, Lca6;->X:I

    .line 1542
    .line 1543
    :cond_2c
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1544
    .line 1545
    .line 1546
    move-result v2

    .line 1547
    ushr-int/lit8 v3, v2, 0x1b

    .line 1548
    .line 1549
    and-int/lit8 v3, v3, 0xf

    .line 1550
    .line 1551
    if-ne v3, v0, :cond_2d

    .line 1552
    .line 1553
    add-int/lit8 v3, v2, -0x1

    .line 1554
    .line 1555
    goto :goto_14

    .line 1556
    :cond_2d
    move v3, v2

    .line 1557
    :goto_14
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v2

    .line 1561
    if-eqz v2, :cond_2c

    .line 1562
    .line 1563
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1564
    .line 1565
    return-object v0

    .line 1566
    nop

    .line 1567
    :pswitch_data_0
    .packed-switch 0x0
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

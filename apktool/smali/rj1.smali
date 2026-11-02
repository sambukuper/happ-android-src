.class public final Lrj1;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lgk1;


# direct methods
.method public synthetic constructor <init>(Lgk1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lrj1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrj1;->Y:Lgk1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lrj1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lrj1;->Y:Lgk1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lgk1;->r()Lwd0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lwd0;->j()Ljava/lang/reflect/Type;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lgk1;->i0:Lov3;

    .line 19
    .line 20
    iget-object v2, p0, Lgk1;->j0:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p0, p0, Lgk1;->k0:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v3, Lov3;->X:Lkc6;

    .line 34
    .line 35
    invoke-virtual {v3, p0}, Lkc6;->c(Ljava/lang/CharSequence;)Lfq4;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Lfq4;->a()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ldq4;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ldq4;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0, v1}, Lov3;->Y(I)Lfx5;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_0
    new-instance v1, Lp14;

    .line 66
    .line 67
    const-string v2, "Local property #"

    .line 68
    .line 69
    const-string v3, " not found in "

    .line 70
    .line 71
    invoke-static {v2, p0, v3}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {v0}, Lfs0;->t()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {v1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_1
    invoke-static {v2}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v0, v3}, Lov3;->b0(Lv15;)Ljava/util/Collection;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Ljava/lang/Iterable;

    .line 99
    .line 100
    new-instance v4, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    move-object v6, v5

    .line 120
    check-cast v6, Lfx5;

    .line 121
    .line 122
    invoke-static {v6}, Lir6;->b(Lfx5;)Ljm4;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v6}, Ljm4;->o()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v6, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_2

    .line 135
    .line 136
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const-string v5, ") not resolved in "

    .line 145
    .line 146
    const-string v6, "\' (JVM signature: "

    .line 147
    .line 148
    const-string v7, "Property \'"

    .line 149
    .line 150
    if-nez v3, :cond_9

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eq v3, v1, :cond_8

    .line 157
    .line 158
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_5

    .line 172
    .line 173
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    move-object v9, v8

    .line 178
    check-cast v9, Lfx5;

    .line 179
    .line 180
    invoke-interface {v9}, Lts4;->e()Lfl1;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-virtual {v3, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    if-nez v10, :cond_4

    .line 189
    .line 190
    new-instance v10, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-interface {v3, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_4
    check-cast v10, Ljava/util/List;

    .line 199
    .line 200
    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_5
    new-instance v4, Ll71;

    .line 205
    .line 206
    const/16 v8, 0x18

    .line 207
    .line 208
    invoke-direct {v4, v8}, Ll71;-><init>(B)V

    .line 209
    .line 210
    .line 211
    new-instance v8, Ljava/util/TreeMap;

    .line 212
    .line 213
    invoke-direct {v8, v4}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8, v3}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v8}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    check-cast v3, Ljava/lang/Iterable;

    .line 227
    .line 228
    invoke-static {v3}, Lwv0;->z0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    check-cast v3, Ljava/util/List;

    .line 233
    .line 234
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-ne v4, v1, :cond_6

    .line 239
    .line 240
    invoke-static {v3}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    move-object v1, p0

    .line 245
    check-cast v1, Lfx5;

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_6
    invoke-static {v2}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v0, v1}, Lov3;->b0(Lv15;)Ljava/util/Collection;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v8, v1

    .line 257
    check-cast v8, Ljava/lang/Iterable;

    .line 258
    .line 259
    sget-object v12, Lcl1;->r0:Lcl1;

    .line 260
    .line 261
    const/16 v13, 0x1e

    .line 262
    .line 263
    const-string v9, "\n"

    .line 264
    .line 265
    const/4 v10, 0x0

    .line 266
    const/4 v11, 0x0

    .line 267
    invoke-static/range {v8 .. v13}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    new-instance v3, Lp14;

    .line 272
    .line 273
    invoke-static {v7, v2, v6, p0, v5}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const/16 v0, 0x3a

    .line 281
    .line 282
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_7

    .line 290
    .line 291
    const-string v0, " no members found"

    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_7
    const-string v0, "\n"

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    :goto_2
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-direct {v3, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v3

    .line 311
    :cond_8
    invoke-static {v4}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    move-object v1, p0

    .line 316
    check-cast v1, Lfx5;

    .line 317
    .line 318
    :goto_3
    return-object v1

    .line 319
    :cond_9
    new-instance v1, Lp14;

    .line 320
    .line 321
    invoke-static {v7, v2, v6, p0, v5}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    invoke-direct {v1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v1

    .line 336
    :pswitch_1
    sget-object v0, Lir6;->a:Lqs0;

    .line 337
    .line 338
    invoke-virtual {p0}, Lgk1;->X()Lfx5;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iget-object p0, p0, Lgk1;->i0:Lov3;

    .line 343
    .line 344
    invoke-static {v0}, Lir6;->b(Lfx5;)Ljm4;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    instance-of v2, v0, Lyt3;

    .line 349
    .line 350
    const/4 v3, 0x0

    .line 351
    if-eqz v2, :cond_14

    .line 352
    .line 353
    check-cast v0, Lyt3;

    .line 354
    .line 355
    iget-object v2, v0, Lyt3;->n0:Lcz5;

    .line 356
    .line 357
    iget-object v4, v0, Lyt3;->m0:Lfx5;

    .line 358
    .line 359
    sget-object v5, Lmu3;->a:Lr62;

    .line 360
    .line 361
    iget-object v5, v0, Lyt3;->p0:Lw15;

    .line 362
    .line 363
    iget-object v0, v0, Lyt3;->q0:Lux4;

    .line 364
    .line 365
    invoke-static {v2, v5, v0, v1}, Lmu3;->b(Lcz5;Lw15;Lux4;Z)Lkt3;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_18

    .line 370
    .line 371
    invoke-interface {v4}, Lld0;->r()I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    const/4 v6, 0x2

    .line 376
    if-ne v5, v6, :cond_a

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_a
    invoke-interface {v4}, Led1;->p()Led1;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    if-eqz v5, :cond_13

    .line 384
    .line 385
    invoke-static {v5}, Lbl1;->k(Led1;)Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    if-eqz v6, :cond_d

    .line 390
    .line 391
    invoke-interface {v5}, Led1;->p()Led1;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    sget-object v7, Lus0;->X:Lus0;

    .line 396
    .line 397
    invoke-static {v6, v7}, Lbl1;->l(Led1;Lus0;)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-nez v7, :cond_b

    .line 402
    .line 403
    sget-object v7, Lus0;->Z:Lus0;

    .line 404
    .line 405
    invoke-static {v6, v7}, Lbl1;->l(Led1;Lus0;)Z

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    if-eqz v6, :cond_d

    .line 410
    .line 411
    :cond_b
    check-cast v5, Lsx4;

    .line 412
    .line 413
    sget-object v6, Lpx0;->a:Ljava/util/LinkedHashSet;

    .line 414
    .line 415
    invoke-static {v5}, Lbl1;->k(Led1;)Z

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    if-eqz v6, :cond_10

    .line 420
    .line 421
    sget-object v6, Lpx0;->a:Ljava/util/LinkedHashSet;

    .line 422
    .line 423
    invoke-static {v5}, Lel1;->f(Lot0;)Lqs0;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    if-eqz v5, :cond_c

    .line 428
    .line 429
    invoke-virtual {v5}, Lqs0;->e()Lqs0;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    goto :goto_4

    .line 434
    :cond_c
    move-object v5, v3

    .line 435
    :goto_4
    invoke-static {v6, v5}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-eqz v5, :cond_10

    .line 440
    .line 441
    :cond_d
    invoke-interface {v4}, Led1;->p()Led1;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-static {v5}, Lbl1;->k(Led1;)Z

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    if-eqz v5, :cond_f

    .line 450
    .line 451
    invoke-interface {v4}, Lfx5;->V()Ly82;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    if-eqz v5, :cond_e

    .line 456
    .line 457
    invoke-virtual {v5}, Lcw0;->getAnnotations()Lsm;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    sget-object v6, Ljs3;->a:Lfk2;

    .line 462
    .line 463
    invoke-interface {v5, v6}, Lsm;->k(Lfk2;)Z

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    if-eqz v5, :cond_e

    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_e
    invoke-interface {v4}, Lzk;->getAnnotations()Lsm;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    sget-object v5, Ljs3;->a:Lfk2;

    .line 475
    .line 476
    invoke-interface {v1, v5}, Lsm;->k(Lfk2;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    :goto_5
    if-eqz v1, :cond_f

    .line 481
    .line 482
    goto :goto_7

    .line 483
    :cond_f
    :goto_6
    invoke-static {v2}, Lmu3;->d(Lcz5;)Z

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    if-eqz v1, :cond_11

    .line 488
    .line 489
    :cond_10
    :goto_7
    invoke-interface {p0}, Lfs0;->t()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    goto :goto_8

    .line 498
    :cond_11
    invoke-interface {v4}, Led1;->p()Led1;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    instance-of v2, v1, Lsx4;

    .line 503
    .line 504
    if-eqz v2, :cond_12

    .line 505
    .line 506
    check-cast v1, Lsx4;

    .line 507
    .line 508
    invoke-static {v1}, Lms8;->q(Lsx4;)Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    goto :goto_8

    .line 513
    :cond_12
    invoke-interface {p0}, Lfs0;->t()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    :goto_8
    if-eqz p0, :cond_18

    .line 518
    .line 519
    :try_start_0
    iget-object v0, v0, Lkt3;->l:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 522
    .line 523
    .line 524
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 525
    goto :goto_9

    .line 526
    :cond_13
    invoke-static {v1}, Lgv3;->a(I)V

    .line 527
    .line 528
    .line 529
    throw v3

    .line 530
    :cond_14
    instance-of p0, v0, Lwt3;

    .line 531
    .line 532
    if-eqz p0, :cond_15

    .line 533
    .line 534
    check-cast v0, Lwt3;

    .line 535
    .line 536
    iget-object v3, v0, Lwt3;->m0:Ljava/lang/reflect/Field;

    .line 537
    .line 538
    goto :goto_9

    .line 539
    :cond_15
    instance-of p0, v0, Lxt3;

    .line 540
    .line 541
    if-eqz p0, :cond_16

    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_16
    instance-of p0, v0, Lzt3;

    .line 545
    .line 546
    if-eqz p0, :cond_17

    .line 547
    .line 548
    goto :goto_9

    .line 549
    :cond_17
    invoke-static {}, Lb61;->c()V

    .line 550
    .line 551
    .line 552
    :catch_0
    :cond_18
    :goto_9
    return-object v3

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

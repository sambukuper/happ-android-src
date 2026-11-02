.class public final Ld54;
.super Ljava/lang/Object;

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lf54;


# direct methods
.method public synthetic constructor <init>(Lf54;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ld54;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ld54;->Y:Lf54;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Ld54;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Ld54;->Y:Lf54;

    .line 5
    .line 6
    check-cast p1, Lv15;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lf54;->g:Lvt1;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0, p1, v0}, Lf54;->n(Lv15;Ljava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lf54;->q()Led1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget v1, Lbl1;->a:I

    .line 38
    .line 39
    sget-object v1, Lus0;->g0:Lus0;

    .line 40
    .line 41
    invoke-static {p1, v1}, Lbl1;->l(Led1;Lus0;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object p0, p0, Lf54;->b:Lz47;

    .line 53
    .line 54
    iget-object p1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lc6;

    .line 57
    .line 58
    iget-object p1, p1, Lc6;->q0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lwe5;

    .line 61
    .line 62
    invoke-virtual {p1, p0, v0}, Lwe5;->k(Lz47;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_0
    return-object p0

    .line 71
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    iget-object v2, p0, Lf54;->f:Lpe4;

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ljava/util/Collection;

    .line 83
    .line 84
    invoke-direct {v0, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    move-object v5, v4

    .line 107
    check-cast v5, Lq97;

    .line 108
    .line 109
    const/4 v6, 0x2

    .line 110
    invoke-static {v5, v6}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-nez v6, :cond_2

    .line 119
    .line 120
    new-instance v6, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    :cond_2
    check-cast v6, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_5

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    check-cast v3, Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eq v4, v1, :cond_4

    .line 159
    .line 160
    sget-object v4, Lcl1;->B0:Lcl1;

    .line 161
    .line 162
    invoke-static {v3, v4}, Lz68;->E0(Ljava/util/Collection;Lgn2;)Ljava/util/Collection;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v0, v3}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 167
    .line 168
    .line 169
    invoke-interface {v0, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    invoke-virtual {p0, v0, p1}, Lf54;->m(Ljava/util/LinkedHashSet;Lv15;)V

    .line 174
    .line 175
    .line 176
    iget-object p0, p0, Lf54;->b:Lz47;

    .line 177
    .line 178
    iget-object p1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Lc6;

    .line 181
    .line 182
    iget-object p1, p1, Lc6;->q0:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p1, Lwe5;

    .line 185
    .line 186
    invoke-virtual {p1, p0, v0}, Lwe5;->k(Lz47;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Lf54;->c:Lf54;

    .line 199
    .line 200
    if-eqz v0, :cond_6

    .line 201
    .line 202
    iget-object p0, v0, Lf54;->g:Lvt1;

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    check-cast p0, Lfx5;

    .line 209
    .line 210
    goto/16 :goto_a

    .line 211
    .line 212
    :cond_6
    iget-object v0, p0, Lf54;->e:Lte4;

    .line 213
    .line 214
    invoke-virtual {v0}, Lte4;->invoke()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Lld1;

    .line 219
    .line 220
    invoke-interface {v0, p1}, Lld1;->d(Lv15;)Lza6;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    const/4 v0, 0x0

    .line 225
    if-eqz p1, :cond_17

    .line 226
    .line 227
    iget-object v2, p1, Lza6;->a:Ljava/lang/reflect/Field;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-nez v3, :cond_17

    .line 234
    .line 235
    new-instance v3, Lea6;

    .line 236
    .line 237
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Lza6;->b()Ljava/lang/reflect/Member;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    check-cast v4, Ljava/lang/reflect/Field;

    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    xor-int/lit8 v8, v4, 0x1

    .line 255
    .line 256
    iget-object v4, p0, Lf54;->b:Lz47;

    .line 257
    .line 258
    invoke-static {v4, p1}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {p0}, Lf54;->q()Led1;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {p1}, Lbb6;->e()Ll5;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-static {v7}, Ls08;->k(Ll5;)Lfl1;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-virtual {p1}, Lbb6;->c()Lv15;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-static {p1}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {p1}, Lza6;->b()Ljava/lang/reflect/Member;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    check-cast v11, Ljava/lang/reflect/Field;

    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    const/4 v12, 0x0

    .line 297
    if-eqz v11, :cond_7

    .line 298
    .line 299
    invoke-virtual {p1}, Lza6;->b()Ljava/lang/reflect/Member;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    check-cast v11, Ljava/lang/reflect/Field;

    .line 304
    .line 305
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    if-eqz v11, :cond_7

    .line 314
    .line 315
    move v11, v1

    .line 316
    goto :goto_3

    .line 317
    :cond_7
    move v11, v12

    .line 318
    :goto_3
    invoke-static/range {v5 .. v11}, Lgl3;->P0(Led1;Ln44;Lfl1;ZLv15;Lhr6;Z)Lgl3;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    iput-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 323
    .line 324
    invoke-virtual {v1, v0, v0, v0, v0}, Lgx5;->L0(Lhx5;Ltx5;Ly82;Ly82;)V

    .line 325
    .line 326
    .line 327
    iget-object v1, v4, Lz47;->g0:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v1, Lf63;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    instance-of v4, v2, Ljava/lang/Class;

    .line 339
    .line 340
    if-eqz v4, :cond_8

    .line 341
    .line 342
    move-object v5, v2

    .line 343
    check-cast v5, Ljava/lang/Class;

    .line 344
    .line 345
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-eqz v6, :cond_8

    .line 350
    .line 351
    new-instance v2, Leb6;

    .line 352
    .line 353
    invoke-direct {v2, v5}, Leb6;-><init>(Ljava/lang/Class;)V

    .line 354
    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_8
    instance-of v5, v2, Ljava/lang/reflect/GenericArrayType;

    .line 358
    .line 359
    if-nez v5, :cond_b

    .line 360
    .line 361
    if-eqz v4, :cond_9

    .line 362
    .line 363
    move-object v4, v2

    .line 364
    check-cast v4, Ljava/lang/Class;

    .line 365
    .line 366
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-eqz v4, :cond_9

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_9
    instance-of v4, v2, Ljava/lang/reflect/WildcardType;

    .line 374
    .line 375
    if-eqz v4, :cond_a

    .line 376
    .line 377
    new-instance v4, Ljb6;

    .line 378
    .line 379
    check-cast v2, Ljava/lang/reflect/WildcardType;

    .line 380
    .line 381
    invoke-direct {v4, v2}, Ljb6;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 382
    .line 383
    .line 384
    :goto_4
    move-object v2, v4

    .line 385
    goto :goto_6

    .line 386
    :cond_a
    new-instance v4, Lva6;

    .line 387
    .line 388
    invoke-direct {v4, v2}, Lva6;-><init>(Ljava/lang/reflect/Type;)V

    .line 389
    .line 390
    .line 391
    goto :goto_4

    .line 392
    :cond_b
    :goto_5
    new-instance v4, Lna6;

    .line 393
    .line 394
    invoke-direct {v4, v2}, Lna6;-><init>(Ljava/lang/reflect/Type;)V

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :goto_6
    sget-object v4, Lzi8;->Y:Lzi8;

    .line 399
    .line 400
    const/4 v5, 0x7

    .line 401
    invoke-static {v4, v12, v0, v5}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v1, v2, v4}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    invoke-static {v6}, Lzz3;->H(Lt14;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-nez v1, :cond_c

    .line 414
    .line 415
    invoke-static {v6}, Lzz3;->I(Lt14;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_d

    .line 420
    .line 421
    :cond_c
    invoke-virtual {p1}, Lza6;->b()Ljava/lang/reflect/Member;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Ljava/lang/reflect/Field;

    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-eqz v1, :cond_d

    .line 436
    .line 437
    invoke-virtual {p1}, Lza6;->b()Ljava/lang/reflect/Member;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    check-cast v1, Ljava/lang/reflect/Field;

    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    :cond_d
    iget-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 452
    .line 453
    move-object v5, v1

    .line 454
    check-cast v5, Lgx5;

    .line 455
    .line 456
    invoke-virtual {p0}, Lf54;->p()Li44;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    const/4 v9, 0x0

    .line 461
    sget-object v7, Ld02;->X:Ld02;

    .line 462
    .line 463
    move-object v10, v7

    .line 464
    invoke-virtual/range {v5 .. v10}, Lgx5;->O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {p0}, Lf54;->q()Led1;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    instance-of v2, v1, Lsx4;

    .line 472
    .line 473
    if-eqz v2, :cond_e

    .line 474
    .line 475
    check-cast v1, Lsx4;

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_e
    move-object v1, v0

    .line 479
    :goto_7
    if-eqz v1, :cond_f

    .line 480
    .line 481
    iget-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v1, Lgx5;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    iput-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 489
    .line 490
    :cond_f
    iget-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 491
    .line 492
    move-object v2, v1

    .line 493
    check-cast v2, Lpt8;

    .line 494
    .line 495
    check-cast v1, Lgx5;

    .line 496
    .line 497
    invoke-virtual {v1}, Lqt8;->c()Lt14;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    if-eqz v2, :cond_16

    .line 502
    .line 503
    if-eqz v1, :cond_15

    .line 504
    .line 505
    sget v4, Lbl1;->a:I

    .line 506
    .line 507
    invoke-interface {v2}, Lpt8;->R()Z

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    if-nez v4, :cond_13

    .line 512
    .line 513
    invoke-static {v1}, Lvr3;->J(Lt14;)Z

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-eqz v4, :cond_10

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_10
    invoke-static {v1}, Lcj8;->b(Lt14;)Z

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    if-eqz v4, :cond_11

    .line 525
    .line 526
    goto :goto_8

    .line 527
    :cond_11
    invoke-static {v2}, Lel1;->e(Led1;)Lzz3;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-static {v1}, Lzz3;->H(Lt14;)Z

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    if-nez v4, :cond_12

    .line 536
    .line 537
    sget-object v4, Lv14;->a:Lq45;

    .line 538
    .line 539
    invoke-virtual {v2}, Lzz3;->v()Laa7;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    invoke-virtual {v4, v5, v1}, Lq45;->a(Lt14;Lt14;)Z

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    if-nez v5, :cond_12

    .line 548
    .line 549
    const-string v5, "Number"

    .line 550
    .line 551
    invoke-virtual {v2, v5}, Lzz3;->k(Ljava/lang/String;)Lsx4;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    invoke-virtual {v5}, Lsx4;->X()Laa7;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    invoke-virtual {v4, v5, v1}, Lq45;->a(Lt14;Lt14;)Z

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    if-nez v5, :cond_12

    .line 564
    .line 565
    invoke-virtual {v2}, Lzz3;->e()Laa7;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual {v4, v2, v1}, Lq45;->a(Lt14;Lt14;)Z

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    if-nez v2, :cond_12

    .line 574
    .line 575
    invoke-static {v1}, Lho8;->a(Lt14;)Z

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    if-eqz v1, :cond_13

    .line 580
    .line 581
    :cond_12
    :goto_8
    iget-object v1, v3, Lea6;->X:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v1, Lgx5;

    .line 584
    .line 585
    new-instance v2, Lem1;

    .line 586
    .line 587
    const/4 v4, 0x3

    .line 588
    invoke-direct {v2, p0, p1, v3, v4}, Lem1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v0, v2}, Lgx5;->M0(Lse4;Ldn2;)V

    .line 592
    .line 593
    .line 594
    :cond_13
    :goto_9
    iget-object p0, v3, Lea6;->X:Ljava/lang/Object;

    .line 595
    .line 596
    move-object p1, p0

    .line 597
    check-cast p1, Lfx5;

    .line 598
    .line 599
    if-eqz p1, :cond_14

    .line 600
    .line 601
    check-cast p0, Lfx5;

    .line 602
    .line 603
    goto :goto_a

    .line 604
    :cond_14
    const/4 p0, 0x6

    .line 605
    invoke-static {p0}, Loc;->a(I)V

    .line 606
    .line 607
    .line 608
    throw v0

    .line 609
    :cond_15
    const/16 p0, 0x42

    .line 610
    .line 611
    invoke-static {p0}, Lbl1;->a(I)V

    .line 612
    .line 613
    .line 614
    throw v0

    .line 615
    :cond_16
    const/16 p0, 0x41

    .line 616
    .line 617
    invoke-static {p0}, Lbl1;->a(I)V

    .line 618
    .line 619
    .line 620
    throw v0

    .line 621
    :cond_17
    move-object p0, v0

    .line 622
    :goto_a
    return-object p0

    .line 623
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    iget-object v0, p0, Lf54;->c:Lf54;

    .line 627
    .line 628
    if-eqz v0, :cond_18

    .line 629
    .line 630
    iget-object p0, v0, Lf54;->f:Lpe4;

    .line 631
    .line 632
    invoke-virtual {p0, p1}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    check-cast p0, Ljava/util/Collection;

    .line 637
    .line 638
    goto :goto_c

    .line 639
    :cond_18
    new-instance v0, Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 642
    .line 643
    .line 644
    iget-object v1, p0, Lf54;->e:Lte4;

    .line 645
    .line 646
    invoke-virtual {v1}, Lte4;->invoke()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    check-cast v1, Lld1;

    .line 651
    .line 652
    invoke-interface {v1, p1}, Lld1;->c(Lv15;)Ljava/util/Collection;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    :cond_19
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    if-eqz v2, :cond_1a

    .line 665
    .line 666
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    check-cast v2, Lcb6;

    .line 671
    .line 672
    invoke-virtual {p0, v2}, Lf54;->t(Lcb6;)Ldl3;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-virtual {p0, v2}, Lf54;->r(Ldl3;)Z

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    if-eqz v3, :cond_19

    .line 681
    .line 682
    iget-object v3, p0, Lf54;->b:Lz47;

    .line 683
    .line 684
    iget-object v3, v3, Lz47;->Y:Ljava/lang/Object;

    .line 685
    .line 686
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    goto :goto_b

    .line 690
    :cond_1a
    invoke-virtual {p0, p1, v0}, Lf54;->j(Lv15;Ljava/util/ArrayList;)V

    .line 691
    .line 692
    .line 693
    move-object p0, v0

    .line 694
    :goto_c
    return-object p0

    .line 695
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

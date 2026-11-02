.class public final Lol1;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lvl1;


# direct methods
.method public synthetic constructor <init>(Lvl1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lol1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lol1;->Y:Lvl1;

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
    iget-byte v0, p0, Lol1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lol1;->Y:Lvl1;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {v3}, Lpw7;->d(Lpt0;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    iget-object p0, v3, Lvl1;->n0:Ljl1;

    .line 17
    .line 18
    iget-object p0, p0, Ljl1;->X:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lhl1;

    .line 21
    .line 22
    iget-object p0, p0, Lhl1;->e:Lvl;

    .line 23
    .line 24
    iget-object v0, v3, Lvl1;->w0:Lc06;

    .line 25
    .line 26
    invoke-interface {p0, v0}, Ljm;->q(Lc06;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_1
    iget-object v7, p0, Lol1;->Y:Lvl1;

    .line 36
    .line 37
    invoke-virtual {v7}, Lvl1;->i()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v7}, Lvl1;->y0()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_0

    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_0
    iget-object p0, v7, Lvl1;->h0:Ls50;

    .line 52
    .line 53
    const/4 v0, 0x5

    .line 54
    invoke-virtual {p0, v2, v0, v2}, Ls50;->a(III)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    iget-object v0, v7, Lvl1;->g0:Lfy5;

    .line 59
    .line 60
    iget-object v1, v7, Lvl1;->n0:Ljl1;

    .line 61
    .line 62
    iget-object v3, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lw15;

    .line 65
    .line 66
    iget-object v5, v1, Ljl1;->f0:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v13, v5

    .line 69
    check-cast v13, Lux4;

    .line 70
    .line 71
    iget-object v1, v1, Ljl1;->j0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lfc8;

    .line 74
    .line 75
    new-instance v5, Ld0;

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x7

    .line 79
    const/4 v6, 0x1

    .line 80
    const-class v8, Lvl1;

    .line 81
    .line 82
    const-string v9, "getValueClassPropertyType"

    .line 83
    .line 84
    const-string v10, "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;"

    .line 85
    .line 86
    invoke-direct/range {v5 .. v12}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v6, v0, Lfy5;->B0:Ljava/util/List;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_3

    .line 116
    .line 117
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Lcy5;

    .line 122
    .line 123
    iget v8, v8, Lcy5;->Z:I

    .line 124
    .line 125
    invoke-static {v3, v8}, Lu70;->L(Lw15;I)Lqs0;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    iget-object v9, v8, Lqs0;->b:Lfk2;

    .line 130
    .line 131
    iget-object v9, v9, Lfk2;->a:Lgk2;

    .line 132
    .line 133
    iget-object v9, v9, Lgk2;->a:Ljava/lang/String;

    .line 134
    .line 135
    const-string v10, "JvmInline"

    .line 136
    .line 137
    invoke-static {v9, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_2

    .line 142
    .line 143
    iget-object v8, v8, Lqs0;->a:Lfk2;

    .line 144
    .line 145
    iget-object v8, v8, Lfk2;->a:Lgk2;

    .line 146
    .line 147
    iget-object v8, v8, Lgk2;->a:Ljava/lang/String;

    .line 148
    .line 149
    const-string v9, "kotlin.jvm"

    .line 150
    .line 151
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_2

    .line 156
    .line 157
    :cond_3
    :goto_0
    iget v6, v0, Lfy5;->Z:I

    .line 158
    .line 159
    const/16 v8, 0x8

    .line 160
    .line 161
    and-int/2addr v6, v8

    .line 162
    if-ne v6, v8, :cond_9

    .line 163
    .line 164
    iget v6, v0, Lfy5;->y0:I

    .line 165
    .line 166
    invoke-interface {v3, v6}, Lw15;->getString(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-static {v6}, Lv15;->d(Ljava/lang/String;)Lv15;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    iget v8, v0, Lfy5;->Z:I

    .line 175
    .line 176
    and-int/lit8 v9, v8, 0x10

    .line 177
    .line 178
    const/16 v10, 0x10

    .line 179
    .line 180
    if-ne v9, v10, :cond_4

    .line 181
    .line 182
    iget-object v8, v0, Lfy5;->z0:Lnz5;

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_4
    const/16 v9, 0x20

    .line 186
    .line 187
    and-int/2addr v8, v9

    .line 188
    if-ne v8, v9, :cond_5

    .line 189
    .line 190
    iget v8, v0, Lfy5;->A0:I

    .line 191
    .line 192
    invoke-virtual {v13, v8}, Lux4;->a(I)Lnz5;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    goto :goto_1

    .line 197
    :cond_5
    move-object v8, v4

    .line 198
    :goto_1
    if-eqz v8, :cond_6

    .line 199
    .line 200
    invoke-virtual {v1, v8, v2}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-nez v1, :cond_7

    .line 205
    .line 206
    :cond_6
    invoke-virtual {v5, v6}, Ld0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lzk6;

    .line 211
    .line 212
    if-eqz v1, :cond_8

    .line 213
    .line 214
    :cond_7
    new-instance v0, Lad3;

    .line 215
    .line 216
    invoke-direct {v0, v6, v1}, Lad3;-><init>(Lv15;Lzk6;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_8
    iget p0, v0, Lfy5;->g0:I

    .line 221
    .line 222
    invoke-interface {v3, p0}, Lw15;->getString(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p0}, Lv15;->d(Ljava/lang/String;)Lv15;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string v1, "cannot determine underlying type for value class "

    .line 233
    .line 234
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string p0, " with property "

    .line 241
    .line 242
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_9
    move-object v0, v4

    .line 263
    :goto_2
    if-eqz v0, :cond_a

    .line 264
    .line 265
    move-object v4, v0

    .line 266
    goto :goto_3

    .line 267
    :cond_a
    if-nez p0, :cond_d

    .line 268
    .line 269
    invoke-virtual {v7}, Lvl1;->t0()Lgs0;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-eqz p0, :cond_c

    .line 274
    .line 275
    invoke-virtual {p0}, Ljo2;->L()Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {p0}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p0, Lot8;

    .line 287
    .line 288
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, p0}, Lvl1;->C0(Lv15;)Laa7;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-eqz v0, :cond_b

    .line 300
    .line 301
    new-instance v4, Lad3;

    .line 302
    .line 303
    invoke-direct {v4, p0, v0}, Lad3;-><init>(Lv15;Lzk6;)V

    .line 304
    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_b
    const-string p0, "Value class has no underlying property: "

    .line 308
    .line 309
    invoke-static {v7, p0}, Lb61;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_c
    const-string p0, "Inline class has no primary constructor: "

    .line 314
    .line 315
    invoke-static {v7, p0}, Lb61;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :cond_d
    :goto_3
    return-object v4

    .line 319
    :pswitch_2
    iget-object p0, v3, Lvl1;->k0:Lfx4;

    .line 320
    .line 321
    sget-object v0, Lfx4;->Z:Lfx4;

    .line 322
    .line 323
    if-eq p0, v0, :cond_e

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_e
    iget-object v5, v3, Lvl1;->g0:Lfy5;

    .line 327
    .line 328
    iget-object v5, v5, Lfy5;->w0:Ljava/util/List;

    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-nez v6, :cond_10

    .line 338
    .line 339
    new-instance p0, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    :cond_f
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_13

    .line 353
    .line 354
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    check-cast v1, Ljava/lang/Integer;

    .line 359
    .line 360
    iget-object v2, v3, Lvl1;->n0:Ljl1;

    .line 361
    .line 362
    iget-object v5, v2, Ljl1;->X:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v5, Lhl1;

    .line 365
    .line 366
    iget-object v2, v2, Ljl1;->Y:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v2, Lw15;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    invoke-static {v2, v1}, Lu70;->L(Lw15;I)Lqs0;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget-object v2, v5, Lhl1;->t:Los0;

    .line 382
    .line 383
    sget-object v5, Los0;->c:Ljava/util/Set;

    .line 384
    .line 385
    invoke-virtual {v2, v1, v4}, Los0;->a(Lqs0;Lhs0;)Lsx4;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    if-eqz v1, :cond_f

    .line 390
    .line 391
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    goto :goto_4

    .line 395
    :cond_10
    if-eq p0, v0, :cond_11

    .line 396
    .line 397
    :goto_5
    sget-object p0, Ld02;->X:Ld02;

    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_11
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 401
    .line 402
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 403
    .line 404
    .line 405
    iget-object v0, v3, Lvl1;->s0:Led1;

    .line 406
    .line 407
    instance-of v4, v0, Ltf5;

    .line 408
    .line 409
    if-eqz v4, :cond_12

    .line 410
    .line 411
    check-cast v0, Ltf5;

    .line 412
    .line 413
    invoke-interface {v0}, Ltf5;->K()Let4;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v3, p0, v0, v1}, Lci8;->n(Lsx4;Ljava/util/LinkedHashSet;Let4;Z)V

    .line 418
    .line 419
    .line 420
    :cond_12
    invoke-virtual {v3}, Lm0;->q0()Let4;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v3, p0, v0, v2}, Lci8;->n(Lsx4;Ljava/util/LinkedHashSet;Let4;Z)V

    .line 425
    .line 426
    .line 427
    new-instance v0, Ll71;

    .line 428
    .line 429
    const/16 v1, 0xb

    .line 430
    .line 431
    invoke-direct {v0, v1}, Ll71;-><init>(B)V

    .line 432
    .line 433
    .line 434
    invoke-static {p0, v0}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    :cond_13
    :goto_6
    return-object p0

    .line 439
    :pswitch_3
    iget-object p0, v3, Lvl1;->g0:Lfy5;

    .line 440
    .line 441
    iget v0, p0, Lfy5;->Z:I

    .line 442
    .line 443
    const/4 v1, 0x4

    .line 444
    and-int/2addr v0, v1

    .line 445
    if-ne v0, v1, :cond_14

    .line 446
    .line 447
    iget-object v0, v3, Lvl1;->n0:Ljl1;

    .line 448
    .line 449
    iget-object v0, v0, Ljl1;->Y:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Lw15;

    .line 452
    .line 453
    iget p0, p0, Lfy5;->h0:I

    .line 454
    .line 455
    invoke-static {v0, p0}, Lu70;->S(Lw15;I)Lv15;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    invoke-virtual {v3}, Lvl1;->B0()Lsl1;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sget-object v1, Lx45;->i0:Lx45;

    .line 464
    .line 465
    invoke-virtual {v0, p0, v1}, Lsl1;->e(Lv15;Lx45;)Lot0;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    instance-of v0, p0, Lsx4;

    .line 470
    .line 471
    if-eqz v0, :cond_14

    .line 472
    .line 473
    move-object v4, p0

    .line 474
    check-cast v4, Lsx4;

    .line 475
    .line 476
    :cond_14
    return-object v4

    .line 477
    :pswitch_4
    iget-object p0, v3, Lvl1;->n0:Ljl1;

    .line 478
    .line 479
    iget-object v0, v3, Lvl1;->g0:Lfy5;

    .line 480
    .line 481
    iget-object v0, v0, Lfy5;->r0:Ljava/util/List;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    new-instance v2, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    :cond_15
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    if-eqz v4, :cond_16

    .line 500
    .line 501
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    move-object v5, v4

    .line 506
    check-cast v5, Liy5;

    .line 507
    .line 508
    sget-object v6, Lmd2;->n:Ljd2;

    .line 509
    .line 510
    iget v5, v5, Liy5;->f0:I

    .line 511
    .line 512
    invoke-virtual {v6, v5}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    if-eqz v5, :cond_15

    .line 521
    .line 522
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    .line 527
    .line 528
    const/16 v4, 0xa

    .line 529
    .line 530
    invoke-static {v2, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    if-eqz v4, :cond_17

    .line 546
    .line 547
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    check-cast v4, Liy5;

    .line 552
    .line 553
    iget-object v5, p0, Ljl1;->k0:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v5, Lys4;

    .line 556
    .line 557
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v5, v4, v1}, Lys4;->e(Liy5;Z)Lnl1;

    .line 561
    .line 562
    .line 563
    move-result-object v4

    .line 564
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    goto :goto_8

    .line 568
    :cond_17
    invoke-virtual {v3}, Lvl1;->t0()Lgs0;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-static {v1}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-static {v0, v1}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object p0, p0, Ljl1;->X:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast p0, Lhl1;

    .line 583
    .line 584
    iget-object p0, p0, Lhl1;->n:Li7;

    .line 585
    .line 586
    invoke-interface {p0, v3}, Li7;->e(Lsx4;)Ljava/util/Collection;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    check-cast p0, Ljava/lang/Iterable;

    .line 591
    .line 592
    invoke-static {v0, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    return-object p0

    .line 597
    :pswitch_5
    iget-object v6, p0, Lol1;->Y:Lvl1;

    .line 598
    .line 599
    iget-object p0, v6, Lvl1;->m0:Lus0;

    .line 600
    .line 601
    invoke-virtual {p0}, Lus0;->a()Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_20

    .line 606
    .line 607
    new-instance v5, Lbj1;

    .line 608
    .line 609
    sget-object v8, Loy1;->f0:Lrm;

    .line 610
    .line 611
    const/4 v9, 0x1

    .line 612
    const/4 v10, 0x1

    .line 613
    const/4 v7, 0x0

    .line 614
    sget-object v11, Lke7;->G:Lg55;

    .line 615
    .line 616
    invoke-direct/range {v5 .. v11}, Lgs0;-><init>(Lsx4;La41;Lsm;ZILke7;)V

    .line 617
    .line 618
    .line 619
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 620
    .line 621
    sget v1, Lbl1;->a:I

    .line 622
    .line 623
    sget-object v1, Lus0;->Z:Lus0;

    .line 624
    .line 625
    if-eq p0, v1, :cond_1e

    .line 626
    .line 627
    invoke-virtual {p0}, Lus0;->a()Z

    .line 628
    .line 629
    .line 630
    move-result p0

    .line 631
    if-eqz p0, :cond_18

    .line 632
    .line 633
    goto :goto_9

    .line 634
    :cond_18
    invoke-static {v6}, Lbl1;->o(Led1;)Z

    .line 635
    .line 636
    .line 637
    move-result p0

    .line 638
    if-eqz p0, :cond_1a

    .line 639
    .line 640
    sget-object p0, Lgl1;->a:Lfl1;

    .line 641
    .line 642
    if-eqz p0, :cond_19

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_19
    const/16 p0, 0x33

    .line 646
    .line 647
    invoke-static {p0}, Lbl1;->a(I)V

    .line 648
    .line 649
    .line 650
    throw v4

    .line 651
    :cond_1a
    invoke-static {v6}, Lbl1;->j(Led1;)Z

    .line 652
    .line 653
    .line 654
    move-result p0

    .line 655
    if-eqz p0, :cond_1c

    .line 656
    .line 657
    sget-object p0, Lgl1;->j:Lfl1;

    .line 658
    .line 659
    if-eqz p0, :cond_1b

    .line 660
    .line 661
    goto :goto_a

    .line 662
    :cond_1b
    const/16 p0, 0x34

    .line 663
    .line 664
    invoke-static {p0}, Lbl1;->a(I)V

    .line 665
    .line 666
    .line 667
    throw v4

    .line 668
    :cond_1c
    sget-object p0, Lgl1;->e:Lfl1;

    .line 669
    .line 670
    if-eqz p0, :cond_1d

    .line 671
    .line 672
    goto :goto_a

    .line 673
    :cond_1d
    const/16 p0, 0x35

    .line 674
    .line 675
    invoke-static {p0}, Lbl1;->a(I)V

    .line 676
    .line 677
    .line 678
    throw v4

    .line 679
    :cond_1e
    :goto_9
    sget-object p0, Lgl1;->a:Lfl1;

    .line 680
    .line 681
    if-eqz p0, :cond_1f

    .line 682
    .line 683
    :goto_a
    invoke-virtual {v5, v0, p0}, Lgs0;->U0(Ljava/util/List;Lfl1;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v6}, Lm0;->X()Laa7;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    iput-object p0, v5, Ljo2;->k0:Lt14;

    .line 691
    .line 692
    move-object v4, v5

    .line 693
    goto :goto_c

    .line 694
    :cond_1f
    const/16 p0, 0x31

    .line 695
    .line 696
    invoke-static {p0}, Lbl1;->a(I)V

    .line 697
    .line 698
    .line 699
    throw v4

    .line 700
    :cond_20
    iget-object p0, v6, Lvl1;->g0:Lfy5;

    .line 701
    .line 702
    iget-object p0, p0, Lfy5;->r0:Ljava/util/List;

    .line 703
    .line 704
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    :cond_21
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    if-eqz v0, :cond_22

    .line 716
    .line 717
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    move-object v1, v0

    .line 722
    check-cast v1, Liy5;

    .line 723
    .line 724
    sget-object v3, Lmd2;->n:Ljd2;

    .line 725
    .line 726
    iget v1, v1, Liy5;->f0:I

    .line 727
    .line 728
    invoke-virtual {v3, v1}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 733
    .line 734
    .line 735
    move-result v1

    .line 736
    if-nez v1, :cond_21

    .line 737
    .line 738
    goto :goto_b

    .line 739
    :cond_22
    move-object v0, v4

    .line 740
    :goto_b
    check-cast v0, Liy5;

    .line 741
    .line 742
    if-eqz v0, :cond_23

    .line 743
    .line 744
    iget-object p0, v6, Lvl1;->n0:Ljl1;

    .line 745
    .line 746
    iget-object p0, p0, Ljl1;->k0:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast p0, Lys4;

    .line 749
    .line 750
    invoke-virtual {p0, v0, v2}, Lys4;->e(Liy5;Z)Lnl1;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    :cond_23
    :goto_c
    return-object v4

    .line 755
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

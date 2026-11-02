.class public final Lcm1;
.super Ljava/lang/Object;

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lfm1;


# direct methods
.method public synthetic constructor <init>(Lfm1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcm1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lcm1;->Y:Lfm1;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lcm1;->X:B

    .line 4
    .line 5
    sget-object v2, Ld02;->X:Ld02;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, Lcm1;->Y:Lfm1;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lv15;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, Lfm1;->i:Lgm1;

    .line 22
    .line 23
    iget-object v2, v2, Lgm1;->b:Ljl1;

    .line 24
    .line 25
    iget-object v0, v0, Lfm1;->c:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, [B

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v2, Ljl1;->X:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lhl1;

    .line 45
    .line 46
    iget-object v0, v0, Lhl1;->p:Lr62;

    .line 47
    .line 48
    sget-object v5, Lpz5;->s0:Lau3;

    .line 49
    .line 50
    invoke-virtual {v5, v1, v0}, Lau3;->a(Ljava/io/ByteArrayInputStream;Lr62;)Ld2;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v11, v0

    .line 55
    check-cast v11, Lpz5;

    .line 56
    .line 57
    if-nez v11, :cond_1

    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    iget-object v0, v2, Ljl1;->k0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lys4;

    .line 64
    .line 65
    iget-object v1, v0, Lys4;->a:Ljl1;

    .line 66
    .line 67
    iget-object v2, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lw15;

    .line 70
    .line 71
    iget-object v3, v1, Ljl1;->f0:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v13, v3

    .line 74
    check-cast v13, Lux4;

    .line 75
    .line 76
    iget-object v3, v11, Lpz5;->m0:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v5, Ljava/util/ArrayList;

    .line 82
    .line 83
    const/16 v6, 0xa

    .line 84
    .line 85
    invoke-static {v3, v6}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lcy5;

    .line 107
    .line 108
    iget-object v7, v0, Lys4;->b:Ldq;

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7, v6, v2}, Ldq;->m(Lcy5;Lw15;)Lhm;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    sget-object v0, Loy1;->f0:Lrm;

    .line 128
    .line 129
    :goto_1
    move-object v8, v0

    .line 130
    goto :goto_2

    .line 131
    :cond_3
    new-instance v0, Lvm;

    .line 132
    .line 133
    invoke-direct {v0, v5, v4}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :goto_2
    sget-object v0, Lmd2;->d:Lkd2;

    .line 138
    .line 139
    iget v3, v11, Lpz5;->f0:I

    .line 140
    .line 141
    invoke-virtual {v0, v3}, Lkd2;->e(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Lb06;

    .line 146
    .line 147
    if-nez v0, :cond_4

    .line 148
    .line 149
    const/4 v0, -0x1

    .line 150
    goto :goto_3

    .line 151
    :cond_4
    sget-object v3, Li06;->b:[I

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    aget v0, v3, v0

    .line 158
    .line 159
    :goto_3
    packed-switch v0, :pswitch_data_1

    .line 160
    .line 161
    .line 162
    sget-object v0, Lgl1;->a:Lfl1;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    :goto_4
    move-object v10, v0

    .line 168
    goto :goto_5

    .line 169
    :pswitch_0
    sget-object v0, Lgl1;->f:Lfl1;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :pswitch_1
    sget-object v0, Lgl1;->e:Lfl1;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :pswitch_2
    sget-object v0, Lgl1;->c:Lfl1;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :pswitch_3
    sget-object v0, Lgl1;->b:Lfl1;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :pswitch_4
    sget-object v0, Lgl1;->a:Lfl1;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :pswitch_5
    sget-object v0, Lgl1;->d:Lfl1;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :goto_5
    new-instance v5, Lkm1;

    .line 206
    .line 207
    iget-object v0, v1, Ljl1;->X:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Lhl1;

    .line 210
    .line 211
    iget-object v6, v0, Lhl1;->a:Lve4;

    .line 212
    .line 213
    iget-object v0, v1, Ljl1;->Z:Ljava/lang/Object;

    .line 214
    .line 215
    move-object v7, v0

    .line 216
    check-cast v7, Led1;

    .line 217
    .line 218
    iget v0, v11, Lpz5;->g0:I

    .line 219
    .line 220
    invoke-static {v2, v0}, Lu70;->S(Lw15;I)Lv15;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    iget-object v0, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 225
    .line 226
    move-object v12, v0

    .line 227
    check-cast v12, Lw15;

    .line 228
    .line 229
    iget-object v0, v1, Ljl1;->g0:Ljava/lang/Object;

    .line 230
    .line 231
    move-object v14, v0

    .line 232
    check-cast v14, Ldv8;

    .line 233
    .line 234
    iget-object v0, v1, Ljl1;->i0:Ljava/lang/Object;

    .line 235
    .line 236
    move-object v15, v0

    .line 237
    check-cast v15, Lxl1;

    .line 238
    .line 239
    invoke-direct/range {v5 .. v15}, Lkm1;-><init>(Lve4;Led1;Lsm;Lv15;Lfl1;Lpz5;Lw15;Lux4;Ldv8;Lxl1;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, v11, Lpz5;->h0:Ljava/util/List;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v1, v5, v0}, Ljl1;->b(Ljl1;Lhd1;Ljava/util/List;)Ljl1;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v0, v0, Ljl1;->j0:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lfc8;

    .line 254
    .line 255
    invoke-virtual {v0}, Lfc8;->b()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v11, v13}, Lvr3;->i0(Lpz5;Lux4;)Lnz5;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v0, v2, v4}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {v11, v13}, Lvr3;->v(Lpz5;Lux4;)Lnz5;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v0, v3, v4}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v5, v1, v2, v0}, Lkm1;->K0(Ljava/util/List;Laa7;Laa7;)V

    .line 276
    .line 277
    .line 278
    move-object v3, v5

    .line 279
    :goto_6
    return-object v3

    .line 280
    :pswitch_6
    move-object/from16 v1, p1

    .line 281
    .line 282
    check-cast v1, Lv15;

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v3, v0, Lfm1;->b:Ljava/util/LinkedHashMap;

    .line 288
    .line 289
    sget-object v5, Lcz5;->H0:Lau3;

    .line 290
    .line 291
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v0, v0, Lfm1;->i:Lgm1;

    .line 295
    .line 296
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, [B

    .line 301
    .line 302
    if-eqz v3, :cond_5

    .line 303
    .line 304
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 305
    .line 306
    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 307
    .line 308
    .line 309
    new-instance v3, Lem1;

    .line 310
    .line 311
    invoke-direct {v3, v5, v2, v0, v4}, Lem1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 312
    .line 313
    .line 314
    invoke-static {v3}, Lw27;->h0(Ldn2;)Lu27;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-static {v2}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 323
    .line 324
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 329
    .line 330
    .line 331
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-eqz v5, :cond_6

    .line 340
    .line 341
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    check-cast v5, Lcz5;

    .line 346
    .line 347
    iget-object v6, v0, Lgm1;->b:Ljl1;

    .line 348
    .line 349
    iget-object v6, v6, Ljl1;->k0:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v6, Lys4;

    .line 352
    .line 353
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v6, v5, v4}, Lys4;->g(Lcz5;Z)Lim1;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_6
    invoke-virtual {v0, v1, v3}, Lgm1;->k(Lv15;Ljava/util/ArrayList;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v3}, Lys0;->m(Ljava/util/ArrayList;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    :pswitch_7
    move-object/from16 v1, p1

    .line 373
    .line 374
    check-cast v1, Lv15;

    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    iget-object v5, v0, Lfm1;->a:Ljava/util/LinkedHashMap;

    .line 380
    .line 381
    sget-object v6, Lvy5;->B0:Lau3;

    .line 382
    .line 383
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    iget-object v0, v0, Lfm1;->i:Lgm1;

    .line 387
    .line 388
    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    check-cast v5, [B

    .line 393
    .line 394
    if-eqz v5, :cond_7

    .line 395
    .line 396
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 397
    .line 398
    invoke-direct {v2, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 399
    .line 400
    .line 401
    new-instance v5, Lem1;

    .line 402
    .line 403
    invoke-direct {v5, v6, v2, v0, v4}, Lem1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 404
    .line 405
    .line 406
    invoke-static {v5}, Lw27;->h0(Ldn2;)Lu27;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-static {v2}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    :cond_8
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    if-eqz v5, :cond_a

    .line 432
    .line 433
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    check-cast v5, Lvy5;

    .line 438
    .line 439
    iget-object v6, v0, Lgm1;->b:Ljl1;

    .line 440
    .line 441
    iget-object v6, v6, Ljl1;->k0:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v6, Lys4;

    .line 444
    .line 445
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v6, v5}, Lys4;->f(Lvy5;)Ljm1;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    invoke-virtual {v0, v5}, Lgm1;->r(Ljm1;)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_9

    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_9
    move-object v5, v3

    .line 460
    :goto_9
    if-eqz v5, :cond_8

    .line 461
    .line 462
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_a
    invoke-virtual {v0, v1, v4}, Lgm1;->j(Lv15;Ljava/util/ArrayList;)V

    .line 467
    .line 468
    .line 469
    invoke-static {v4}, Lys0;->m(Ljava/util/ArrayList;)Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    return-object v0

    .line 474
    nop

    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

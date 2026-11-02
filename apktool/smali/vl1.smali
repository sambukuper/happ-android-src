.class public final Lvl1;
.super Lm0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Led1;


# instance fields
.field public final g0:Lfy5;

.field public final h0:Ls50;

.field public final i0:Lke7;

.field public final j0:Lqs0;

.field public final k0:Lfx4;

.field public final l0:Lfl1;

.field public final m0:Lus0;

.field public final n0:Ljl1;

.field public final o0:Let4;

.field public final p0:Lul1;

.field public final q0:Lgx6;

.field public final r0:Lz47;

.field public final s0:Led1;

.field public final t0:Lse4;

.field public final u0:Lte4;

.field public final v0:Lse4;

.field public final w0:Lc06;

.field public final x0:Lsm;


# direct methods
.method public constructor <init>(Ljl1;Lfy5;Lw15;Ls50;Lke7;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, Ljl1;->X:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lhl1;

    .line 24
    .line 25
    iget-object v2, v2, Lhl1;->a:Lve4;

    .line 26
    .line 27
    iget v4, v8, Lfy5;->g0:I

    .line 28
    .line 29
    invoke-static {v3, v4}, Lu70;->L(Lw15;I)Lqs0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Lqs0;->f()Lv15;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-direct {v1, v2, v4}, Lm0;-><init>(Lve4;Lv15;)V

    .line 38
    .line 39
    .line 40
    iput-object v8, v1, Lvl1;->g0:Lfy5;

    .line 41
    .line 42
    move-object/from16 v6, p4

    .line 43
    .line 44
    iput-object v6, v1, Lvl1;->h0:Ls50;

    .line 45
    .line 46
    move-object/from16 v9, p5

    .line 47
    .line 48
    iput-object v9, v1, Lvl1;->i0:Lke7;

    .line 49
    .line 50
    iget v2, v8, Lfy5;->g0:I

    .line 51
    .line 52
    invoke-static {v3, v2}, Lu70;->L(Lw15;I)Lqs0;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, v1, Lvl1;->j0:Lqs0;

    .line 57
    .line 58
    sget-object v2, Lmd2;->e:Lkd2;

    .line 59
    .line 60
    iget v4, v8, Lfy5;->f0:I

    .line 61
    .line 62
    invoke-virtual {v2, v4}, Lkd2;->e(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lxy5;

    .line 67
    .line 68
    invoke-static {v2}, Llh4;->R0(Lxy5;)Lfx4;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-object v2, v1, Lvl1;->k0:Lfx4;

    .line 73
    .line 74
    sget-object v2, Lmd2;->d:Lkd2;

    .line 75
    .line 76
    iget v4, v8, Lfy5;->f0:I

    .line 77
    .line 78
    invoke-virtual {v2, v4}, Lkd2;->e(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lb06;

    .line 83
    .line 84
    invoke-static {v2}, Ldh3;->q(Lb06;)Lfl1;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iput-object v2, v1, Lvl1;->l0:Lfl1;

    .line 89
    .line 90
    sget-object v2, Lmd2;->f:Lkd2;

    .line 91
    .line 92
    iget v4, v8, Lfy5;->f0:I

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Lkd2;->e(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ley5;

    .line 99
    .line 100
    if-nez v2, :cond_0

    .line 101
    .line 102
    const/4 v2, -0x1

    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object v4, Lh06;->b:[I

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    aget v2, v4, v2

    .line 111
    .line 112
    :goto_0
    sget-object v10, Lus0;->Z:Lus0;

    .line 113
    .line 114
    sget-object v4, Lus0;->X:Lus0;

    .line 115
    .line 116
    packed-switch v2, :pswitch_data_0

    .line 117
    .line 118
    .line 119
    :goto_1
    :pswitch_0
    move-object v11, v4

    .line 120
    goto :goto_2

    .line 121
    :pswitch_1
    sget-object v4, Lus0;->h0:Lus0;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_2
    sget-object v4, Lus0;->g0:Lus0;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :pswitch_3
    sget-object v4, Lus0;->f0:Lus0;

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :pswitch_4
    move-object v11, v10

    .line 131
    goto :goto_2

    .line 132
    :pswitch_5
    sget-object v4, Lus0;->Y:Lus0;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_2
    iput-object v11, v1, Lvl1;->m0:Lus0;

    .line 136
    .line 137
    iget-object v2, v8, Lfy5;->i0:Ljava/util/List;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v4, Lux4;

    .line 143
    .line 144
    iget-object v5, v8, Lfy5;->C0:Ltz5;

    .line 145
    .line 146
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-direct {v4, v5}, Lux4;-><init>(Ltz5;)V

    .line 150
    .line 151
    .line 152
    sget-object v5, Ldv8;->b:Ldv8;

    .line 153
    .line 154
    iget-object v5, v8, Lfy5;->E0:La06;

    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v5}, Lz38;->b(La06;)Ldv8;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual/range {v0 .. v6}, Ljl1;->a(Led1;Ljava/util/List;Lw15;Lux4;Ldv8;Ls50;)Ljl1;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    move-object v13, v0

    .line 168
    iget-object v0, v12, Ljl1;->X:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lhl1;

    .line 171
    .line 172
    iget-object v14, v0, Lhl1;->a:Lve4;

    .line 173
    .line 174
    iput-object v12, v1, Lvl1;->n0:Ljl1;

    .line 175
    .line 176
    sget-object v2, Lmd2;->m:Ljd2;

    .line 177
    .line 178
    iget v3, v8, Lfy5;->f0:I

    .line 179
    .line 180
    invoke-virtual {v2, v3}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    new-instance v3, Ltl1;

    .line 189
    .line 190
    invoke-direct {v3, v1}, Ltl1;-><init>(Lvl1;)V

    .line 191
    .line 192
    .line 193
    const/4 v15, 0x2

    .line 194
    const/4 v4, 0x1

    .line 195
    const/4 v5, 0x0

    .line 196
    if-ne v11, v10, :cond_3

    .line 197
    .line 198
    if-nez v2, :cond_2

    .line 199
    .line 200
    iget-object v2, v0, Lhl1;->s:Lm22;

    .line 201
    .line 202
    invoke-interface {v2}, Lm22;->o()Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 207
    .line 208
    invoke-static {v2, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_1

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_1
    move v2, v5

    .line 216
    goto :goto_4

    .line 217
    :cond_2
    :goto_3
    move v2, v4

    .line 218
    :goto_4
    invoke-virtual {v1}, Lm0;->getName()Lv15;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v6}, Lv15;->b()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v7, Lki7;

    .line 230
    .line 231
    invoke-direct {v7, v14, v1, v2}, Lki7;-><init>(Lve4;Lvl1;Z)V

    .line 232
    .line 233
    .line 234
    new-array v2, v15, [Let4;

    .line 235
    .line 236
    aput-object v3, v2, v5

    .line 237
    .line 238
    aput-object v7, v2, v4

    .line 239
    .line 240
    invoke-static {v2}, Leu;->W([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v6, v2}, Ldh3;->o(Ljava/lang/String;Ljava/lang/Iterable;)Let4;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    :cond_3
    iput-object v3, v1, Lvl1;->o0:Let4;

    .line 249
    .line 250
    new-instance v2, Lul1;

    .line 251
    .line 252
    invoke-direct {v2, v1}, Lul1;-><init>(Lvl1;)V

    .line 253
    .line 254
    .line 255
    iput-object v2, v1, Lvl1;->p0:Lul1;

    .line 256
    .line 257
    sget-object v16, Lgx6;->d:Lwe5;

    .line 258
    .line 259
    iget-object v0, v0, Lhl1;->q:Lp45;

    .line 260
    .line 261
    check-cast v0, Lq45;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v0, Ld0;

    .line 267
    .line 268
    const/4 v6, 0x0

    .line 269
    const/16 v7, 0x8

    .line 270
    .line 271
    const/4 v1, 0x1

    .line 272
    const-class v3, Lsl1;

    .line 273
    .line 274
    move v2, v4

    .line 275
    const-string v4, "<init>"

    .line 276
    .line 277
    move/from16 v17, v5

    .line 278
    .line 279
    const-string v5, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;)V"

    .line 280
    .line 281
    move-object/from16 v2, p0

    .line 282
    .line 283
    move/from16 v15, v17

    .line 284
    .line 285
    invoke-direct/range {v0 .. v7}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 286
    .line 287
    .line 288
    move-object v6, v2

    .line 289
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    new-instance v1, Lgx6;

    .line 296
    .line 297
    invoke-direct {v1, v6, v14, v0}, Lgx6;-><init>(Lm0;Lve4;Lgn2;)V

    .line 298
    .line 299
    .line 300
    iput-object v1, v6, Lvl1;->q0:Lgx6;

    .line 301
    .line 302
    const/4 v0, 0x0

    .line 303
    if-ne v11, v10, :cond_4

    .line 304
    .line 305
    new-instance v1, Lz47;

    .line 306
    .line 307
    invoke-direct {v1, v6}, Lz47;-><init>(Lvl1;)V

    .line 308
    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_4
    move-object v1, v0

    .line 312
    :goto_5
    iput-object v1, v6, Lvl1;->r0:Lz47;

    .line 313
    .line 314
    iget-object v1, v13, Ljl1;->Z:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v1, Led1;

    .line 317
    .line 318
    iput-object v1, v6, Lvl1;->s0:Led1;

    .line 319
    .line 320
    new-instance v2, Lol1;

    .line 321
    .line 322
    invoke-direct {v2, v6, v15}, Lol1;-><init>(Lvl1;B)V

    .line 323
    .line 324
    .line 325
    new-instance v3, Lse4;

    .line 326
    .line 327
    invoke-direct {v3, v14, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 328
    .line 329
    .line 330
    iput-object v3, v6, Lvl1;->t0:Lse4;

    .line 331
    .line 332
    new-instance v2, Lol1;

    .line 333
    .line 334
    const/4 v3, 0x1

    .line 335
    invoke-direct {v2, v6, v3}, Lol1;-><init>(Lvl1;B)V

    .line 336
    .line 337
    .line 338
    new-instance v3, Lte4;

    .line 339
    .line 340
    invoke-direct {v3, v14, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 341
    .line 342
    .line 343
    iput-object v3, v6, Lvl1;->u0:Lte4;

    .line 344
    .line 345
    new-instance v2, Lol1;

    .line 346
    .line 347
    const/4 v3, 0x2

    .line 348
    invoke-direct {v2, v6, v3}, Lol1;-><init>(Lvl1;B)V

    .line 349
    .line 350
    .line 351
    new-instance v3, Lse4;

    .line 352
    .line 353
    invoke-direct {v3, v14, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 354
    .line 355
    .line 356
    new-instance v2, Lol1;

    .line 357
    .line 358
    const/4 v3, 0x3

    .line 359
    invoke-direct {v2, v6, v3}, Lol1;-><init>(Lvl1;B)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v14, v2}, Lve4;->a(Ldn2;)Lte4;

    .line 363
    .line 364
    .line 365
    new-instance v2, Lol1;

    .line 366
    .line 367
    const/4 v3, 0x4

    .line 368
    invoke-direct {v2, v6, v3}, Lol1;-><init>(Lvl1;B)V

    .line 369
    .line 370
    .line 371
    new-instance v3, Lse4;

    .line 372
    .line 373
    invoke-direct {v3, v14, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 374
    .line 375
    .line 376
    iput-object v3, v6, Lvl1;->v0:Lse4;

    .line 377
    .line 378
    move-object v2, v0

    .line 379
    new-instance v0, Lc06;

    .line 380
    .line 381
    iget-object v3, v12, Ljl1;->Y:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v3, Lw15;

    .line 384
    .line 385
    iget-object v4, v12, Ljl1;->f0:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v4, Lux4;

    .line 388
    .line 389
    instance-of v5, v1, Lvl1;

    .line 390
    .line 391
    if-eqz v5, :cond_5

    .line 392
    .line 393
    check-cast v1, Lvl1;

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_5
    move-object v1, v2

    .line 397
    :goto_6
    if-eqz v1, :cond_6

    .line 398
    .line 399
    iget-object v1, v1, Lvl1;->w0:Lc06;

    .line 400
    .line 401
    move-object v5, v1

    .line 402
    :goto_7
    move-object v2, v3

    .line 403
    move-object v3, v4

    .line 404
    move-object v1, v8

    .line 405
    move-object v4, v9

    .line 406
    goto :goto_8

    .line 407
    :cond_6
    move-object v5, v2

    .line 408
    goto :goto_7

    .line 409
    :goto_8
    invoke-direct/range {v0 .. v5}, Lc06;-><init>(Lfy5;Lw15;Lux4;Lke7;Lc06;)V

    .line 410
    .line 411
    .line 412
    iput-object v0, v6, Lvl1;->w0:Lc06;

    .line 413
    .line 414
    sget-object v0, Lmd2;->c:Ljd2;

    .line 415
    .line 416
    iget v1, v1, Lfy5;->f0:I

    .line 417
    .line 418
    invoke-virtual {v0, v1}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-nez v0, :cond_7

    .line 427
    .line 428
    sget-object v0, Loy1;->f0:Lrm;

    .line 429
    .line 430
    goto :goto_9

    .line 431
    :cond_7
    new-instance v0, Lu55;

    .line 432
    .line 433
    new-instance v1, Lol1;

    .line 434
    .line 435
    const/4 v2, 0x5

    .line 436
    invoke-direct {v1, v6, v2}, Lol1;-><init>(Lvl1;B)V

    .line 437
    .line 438
    .line 439
    invoke-direct {v0, v14, v1}, Lu55;-><init>(Lve4;Ldn2;)V

    .line 440
    .line 441
    .line 442
    :goto_9
    iput-object v0, v6, Lvl1;->x0:Lsm;

    .line 443
    .line 444
    return-void

    .line 445
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final B()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->u0:Lte4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object p0
.end method

.method public final B0()Lsl1;
    .locals 2

    .line 1
    iget-object v0, p0, Lvl1;->n0:Ljl1;

    .line 2
    .line 3
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lhl1;

    .line 6
    .line 7
    iget-object v0, v0, Lhl1;->q:Lp45;

    .line 8
    .line 9
    check-cast v0, Lq45;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lvl1;->q0:Lgx6;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lgx6;->a:Lm0;

    .line 20
    .line 21
    sget v1, Lel1;->a:I

    .line 22
    .line 23
    invoke-static {v0}, Lbl1;->c(Led1;)Lvx4;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lgx6;->c:Lte4;

    .line 31
    .line 32
    sget-object v0, Lgx6;->e:[Lnw3;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    aget-object v0, v0, v1

    .line 36
    .line 37
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Let4;

    .line 42
    .line 43
    check-cast p0, Lsl1;

    .line 44
    .line 45
    return-object p0
.end method

.method public final C()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->j:Ljd2;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget p0, p0, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final C0(Lv15;)Laa7;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lvl1;->B0()Lsl1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lx45;->i0:Lx45;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lsl1;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    const/4 v0, 0x0

    .line 19
    move-object v1, p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Lfx5;

    .line 32
    .line 33
    invoke-interface {v3}, Ljd0;->S()Li44;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Ljd0;->Y()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    :goto_1
    move-object v1, p1

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const/4 v0, 0x1

    .line 54
    move-object v1, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_2
    check-cast v1, Lfx5;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v1}, Lgt8;->c()Lt14;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_4
    check-cast p1, Laa7;

    .line 68
    .line 69
    return-object p1
.end method

.method public final e()Lfl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->l0:Lfl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f0()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lvl1;->n0:Ljl1;

    .line 2
    .line 3
    iget-object v1, v0, Ljl1;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lux4;

    .line 6
    .line 7
    iget-object v2, p0, Lvl1;->g0:Lfy5;

    .line 8
    .line 9
    invoke-static {v2, v1}, Lvr3;->p(Lfy5;Lux4;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v1, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lnz5;

    .line 39
    .line 40
    iget-object v4, v0, Ljl1;->j0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lfc8;

    .line 43
    .line 44
    invoke-virtual {v4, v3}, Lfc8;->i(Lnz5;)Lt14;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v4, Li44;

    .line 49
    .line 50
    invoke-virtual {p0}, Lm0;->p0()Li44;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, Lg51;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-direct {v6, p0, v3, v7}, Lg51;-><init>(Lsx4;Lt14;Lv15;)V

    .line 58
    .line 59
    .line 60
    sget-object v3, Loy1;->f0:Lrm;

    .line 61
    .line 62
    invoke-direct {v4, v5, v6, v3}, Li44;-><init>(Led1;Lcw0;Lsm;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object v2
.end method

.method public final g0()Lus0;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->m0:Lus0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->x0:Lsm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Lke7;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->i0:Lke7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 3

    .line 1
    sget-object v0, Lmd2;->k:Ljd2;

    .line 2
    .line 3
    iget-object v1, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget v1, v1, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget-object p0, p0, Lvl1;->h0:Ls50;

    .line 18
    .line 19
    iget v0, p0, Ls50;->b:I

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-le v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget v0, p0, Ls50;->c:I

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    if-ge v0, v2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-le v0, v2, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget p0, p0, Ls50;->d:I

    .line 38
    .line 39
    if-gt p0, v1, :cond_4

    .line 40
    .line 41
    :goto_0
    return v1

    .line 42
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final j0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->i:Ljd2;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget p0, p0, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final k0()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->n0:Ljl1;

    .line 2
    .line 3
    iget-object p0, p0, Ljl1;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lfc8;

    .line 6
    .line 7
    invoke-virtual {p0}, Lfc8;->b()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final l()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->p0:Lul1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Lfx4;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->k0:Lfx4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->g:Ljd2;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget p0, p0, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final o0()Let4;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->o0:Let4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Led1;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->s0:Led1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s0(Lz14;)Let4;
    .locals 1

    .line 1
    iget-object p0, p0, Lvl1;->q0:Lgx6;

    .line 2
    .line 3
    iget-object p1, p0, Lgx6;->a:Lm0;

    .line 4
    .line 5
    sget v0, Lel1;->a:I

    .line 6
    .line 7
    invoke-static {p1}, Lbl1;->c(Led1;)Lvx4;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lgx6;->c:Lte4;

    .line 15
    .line 16
    sget-object p1, Lgx6;->e:[Lnw3;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    invoke-static {p0, p1}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Let4;

    .line 26
    .line 27
    return-object p0
.end method

.method public final t0()Lgs0;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->t0:Lse4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lse4;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgs0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "deserialized "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lvl1;->C()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, "expect "

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, ""

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "class "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lm0;->getName()Lv15;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final u0()Lft8;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl1;->v0:Lse4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lse4;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lft8;

    .line 8
    .line 9
    return-object p0
.end method

.method public final v0()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->f:Lkd2;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget p0, p0, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lkd2;->e(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Ley5;->h0:Ley5;

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final w0()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->h:Ljd2;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget p0, p0, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final x0()Z
    .locals 1

    .line 1
    sget-object v0, Lmd2;->l:Ljd2;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget p0, p0, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final y0()Z
    .locals 3

    .line 1
    sget-object v0, Lmd2;->k:Ljd2;

    .line 2
    .line 3
    iget-object v1, p0, Lvl1;->g0:Lfy5;

    .line 4
    .line 5
    iget v1, v1, Lfy5;->f0:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const/4 v1, 0x2

    .line 19
    iget-object p0, p0, Lvl1;->h0:Ls50;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0, v2, v0, v1}, Ls50;->a(III)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    return v2

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

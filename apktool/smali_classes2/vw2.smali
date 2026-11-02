.class public final synthetic Lvw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/String;

.field public final synthetic Z:Z

.field public final synthetic f0:Lo88;

.field public final synthetic g0:B

.field public final synthetic h0:B

.field public final synthetic i0:I

.field public final synthetic j0:Z

.field public final synthetic k0:Z

.field public final synthetic l0:Lx67;

.field public final synthetic m0:Ldn2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLo88;IIIIZLx67;Ldn2;B)V
    .locals 0

    .line 1
    iput-byte p11, p0, Lvw2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lvw2;->Y:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p2, p0, Lvw2;->Z:Z

    .line 6
    .line 7
    iput-object p3, p0, Lvw2;->f0:Lo88;

    .line 8
    .line 9
    iput-byte p4, p0, Lvw2;->g0:B

    .line 10
    .line 11
    iput-byte p5, p0, Lvw2;->h0:B

    .line 12
    .line 13
    iput p6, p0, Lvw2;->i0:I

    .line 14
    .line 15
    iput-boolean p7, p0, Lvw2;->j0:Z

    .line 16
    .line 17
    iput-boolean p8, p0, Lvw2;->k0:Z

    .line 18
    .line 19
    iput-object p9, p0, Lvw2;->l0:Lx67;

    .line 20
    .line 21
    iput-object p10, p0, Lvw2;->m0:Ldn2;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lvw2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/high16 v3, 0x41c00000    # 24.0f

    .line 8
    .line 9
    sget-object v4, Lhx4;->X:Lhx4;

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    move-object/from16 v11, p2

    .line 30
    .line 31
    check-cast v11, Llp2;

    .line 32
    .line 33
    move-object/from16 v12, p3

    .line 34
    .line 35
    check-cast v12, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    sget-object v13, Lpz2;->i0:Lp50;

    .line 42
    .line 43
    and-int/lit8 v14, v12, 0x6

    .line 44
    .line 45
    if-nez v14, :cond_1

    .line 46
    .line 47
    invoke-virtual {v11, v1}, Llp2;->g(Z)Z

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    if-eqz v14, :cond_0

    .line 52
    .line 53
    move v6, v7

    .line 54
    :cond_0
    or-int/2addr v12, v6

    .line 55
    :cond_1
    and-int/lit8 v6, v12, 0x13

    .line 56
    .line 57
    if-eq v6, v5, :cond_2

    .line 58
    .line 59
    move v5, v9

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v5, v8

    .line 62
    :goto_0
    and-int/lit8 v6, v12, 0x1

    .line 63
    .line 64
    invoke-virtual {v11, v6, v5}, Llp2;->N(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_5

    .line 69
    .line 70
    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 71
    .line 72
    sget-object v6, Lpz2;->Z:Lp50;

    .line 73
    .line 74
    invoke-static {v6, v8}, Lg80;->c(Lp50;Z)Lxr4;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    iget-wide v14, v11, Llp2;->T:J

    .line 79
    .line 80
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    invoke-virtual {v11}, Llp2;->l()Lkl5;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    invoke-static {v11, v5}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    sget-object v15, Luz0;->j:Lpz2;

    .line 93
    .line 94
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11}, Llp2;->Z()V

    .line 98
    .line 99
    .line 100
    iget-boolean v15, v11, Llp2;->S:Z

    .line 101
    .line 102
    if-eqz v15, :cond_3

    .line 103
    .line 104
    invoke-virtual {v11}, Llp2;->k()V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {v11}, Llp2;->j0()V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-object v15, Lpz2;->B0:Ldx0;

    .line 112
    .line 113
    invoke-static {v15, v11, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v6, Lpz2;->A0:Ldx0;

    .line 117
    .line 118
    invoke-static {v6, v11, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    sget-object v7, Lpz2;->C0:Ldx0;

    .line 126
    .line 127
    invoke-static {v7, v11, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v11}, Lpn7;->l(Llp2;)V

    .line 131
    .line 132
    .line 133
    sget-object v6, Lpz2;->z0:Ldx0;

    .line 134
    .line 135
    invoke-static {v6, v11, v14}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    const v0, -0x5d1d9162

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11, v0}, Llp2;->W(I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0, v13}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v11, v0}, Lhi5;->L(Llp2;Lkx4;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v8}, Llp2;->p(Z)V

    .line 158
    .line 159
    .line 160
    move-object v0, v11

    .line 161
    goto :goto_2

    .line 162
    :cond_4
    const v1, -0x46915487

    .line 163
    .line 164
    .line 165
    invoke-virtual {v11, v1}, Llp2;->W(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v5, v13}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    new-instance v1, Lig5;

    .line 173
    .line 174
    invoke-direct {v1, v10, v10, v10, v10}, Lig5;-><init>(FFFF)V

    .line 175
    .line 176
    .line 177
    const/high16 v24, 0x30000000

    .line 178
    .line 179
    const/16 v25, 0x0

    .line 180
    .line 181
    move-object/from16 v23, v11

    .line 182
    .line 183
    iget-object v11, v0, Lvw2;->Y:Ljava/lang/String;

    .line 184
    .line 185
    iget-boolean v13, v0, Lvw2;->Z:Z

    .line 186
    .line 187
    iget-object v14, v0, Lvw2;->f0:Lo88;

    .line 188
    .line 189
    iget-byte v15, v0, Lvw2;->g0:B

    .line 190
    .line 191
    iget-byte v3, v0, Lvw2;->h0:B

    .line 192
    .line 193
    iget v4, v0, Lvw2;->i0:I

    .line 194
    .line 195
    iget-boolean v5, v0, Lvw2;->j0:Z

    .line 196
    .line 197
    iget-boolean v6, v0, Lvw2;->k0:Z

    .line 198
    .line 199
    iget-object v7, v0, Lvw2;->l0:Lx67;

    .line 200
    .line 201
    iget-object v0, v0, Lvw2;->m0:Ldn2;

    .line 202
    .line 203
    move-object/from16 v22, v0

    .line 204
    .line 205
    move-object/from16 v20, v1

    .line 206
    .line 207
    move/from16 v16, v3

    .line 208
    .line 209
    move/from16 v17, v4

    .line 210
    .line 211
    move/from16 v18, v5

    .line 212
    .line 213
    move/from16 v19, v6

    .line 214
    .line 215
    move-object/from16 v21, v7

    .line 216
    .line 217
    invoke-static/range {v11 .. v25}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v0, v23

    .line 221
    .line 222
    invoke-virtual {v0, v8}, Llp2;->p(Z)V

    .line 223
    .line 224
    .line 225
    :goto_2
    invoke-virtual {v0, v9}, Llp2;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    move-object v0, v11

    .line 230
    invoke-virtual {v0}, Llp2;->Q()V

    .line 231
    .line 232
    .line 233
    :goto_3
    return-object v2

    .line 234
    :pswitch_0
    move-object/from16 v1, p1

    .line 235
    .line 236
    check-cast v1, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    move-object/from16 v11, p2

    .line 243
    .line 244
    check-cast v11, Llp2;

    .line 245
    .line 246
    move-object/from16 v12, p3

    .line 247
    .line 248
    check-cast v12, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    sget-object v13, Lpz2;->i0:Lp50;

    .line 255
    .line 256
    and-int/lit8 v14, v12, 0x6

    .line 257
    .line 258
    if-nez v14, :cond_7

    .line 259
    .line 260
    invoke-virtual {v11, v1}, Llp2;->g(Z)Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    if-eqz v14, :cond_6

    .line 265
    .line 266
    move v6, v7

    .line 267
    :cond_6
    or-int/2addr v12, v6

    .line 268
    :cond_7
    and-int/lit8 v6, v12, 0x13

    .line 269
    .line 270
    if-eq v6, v5, :cond_8

    .line 271
    .line 272
    move v5, v9

    .line 273
    goto :goto_4

    .line 274
    :cond_8
    move v5, v8

    .line 275
    :goto_4
    and-int/lit8 v6, v12, 0x1

    .line 276
    .line 277
    invoke-virtual {v11, v6, v5}, Llp2;->N(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-eqz v5, :cond_b

    .line 282
    .line 283
    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 284
    .line 285
    sget-object v6, Lpz2;->Z:Lp50;

    .line 286
    .line 287
    invoke-static {v6, v8}, Lg80;->c(Lp50;Z)Lxr4;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    iget-wide v14, v11, Llp2;->T:J

    .line 292
    .line 293
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    invoke-virtual {v11}, Llp2;->l()Lkl5;

    .line 298
    .line 299
    .line 300
    move-result-object v12

    .line 301
    invoke-static {v11, v5}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    sget-object v15, Luz0;->j:Lpz2;

    .line 306
    .line 307
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11}, Llp2;->Z()V

    .line 311
    .line 312
    .line 313
    iget-boolean v15, v11, Llp2;->S:Z

    .line 314
    .line 315
    if-eqz v15, :cond_9

    .line 316
    .line 317
    invoke-virtual {v11}, Llp2;->k()V

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_9
    invoke-virtual {v11}, Llp2;->j0()V

    .line 322
    .line 323
    .line 324
    :goto_5
    sget-object v15, Lpz2;->B0:Ldx0;

    .line 325
    .line 326
    invoke-static {v15, v11, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    sget-object v6, Lpz2;->A0:Ldx0;

    .line 330
    .line 331
    invoke-static {v6, v11, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    sget-object v7, Lpz2;->C0:Ldx0;

    .line 339
    .line 340
    invoke-static {v7, v11, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v11}, Lpn7;->l(Llp2;)V

    .line 344
    .line 345
    .line 346
    sget-object v6, Lpz2;->z0:Ldx0;

    .line 347
    .line 348
    invoke-static {v6, v11, v14}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    if-eqz v1, :cond_a

    .line 352
    .line 353
    const v0, -0x212b65af

    .line 354
    .line 355
    .line 356
    invoke-virtual {v11, v0}, Llp2;->W(I)V

    .line 357
    .line 358
    .line 359
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v0, v13}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v11, v0}, Lhi5;->L(Llp2;Lkx4;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v11, v8}, Llp2;->p(Z)V

    .line 371
    .line 372
    .line 373
    move-object v0, v11

    .line 374
    goto :goto_6

    .line 375
    :cond_a
    const v1, -0x43e0619

    .line 376
    .line 377
    .line 378
    invoke-virtual {v11, v1}, Llp2;->W(I)V

    .line 379
    .line 380
    .line 381
    invoke-static {v5, v13}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    new-instance v1, Lig5;

    .line 386
    .line 387
    invoke-direct {v1, v10, v10, v10, v10}, Lig5;-><init>(FFFF)V

    .line 388
    .line 389
    .line 390
    const/high16 v24, 0x30000000

    .line 391
    .line 392
    const/16 v25, 0x0

    .line 393
    .line 394
    move-object/from16 v23, v11

    .line 395
    .line 396
    iget-object v11, v0, Lvw2;->Y:Ljava/lang/String;

    .line 397
    .line 398
    iget-boolean v13, v0, Lvw2;->Z:Z

    .line 399
    .line 400
    iget-object v14, v0, Lvw2;->f0:Lo88;

    .line 401
    .line 402
    iget-byte v15, v0, Lvw2;->g0:B

    .line 403
    .line 404
    iget-byte v3, v0, Lvw2;->h0:B

    .line 405
    .line 406
    iget v4, v0, Lvw2;->i0:I

    .line 407
    .line 408
    iget-boolean v5, v0, Lvw2;->j0:Z

    .line 409
    .line 410
    iget-boolean v6, v0, Lvw2;->k0:Z

    .line 411
    .line 412
    iget-object v7, v0, Lvw2;->l0:Lx67;

    .line 413
    .line 414
    iget-object v0, v0, Lvw2;->m0:Ldn2;

    .line 415
    .line 416
    move-object/from16 v22, v0

    .line 417
    .line 418
    move-object/from16 v20, v1

    .line 419
    .line 420
    move/from16 v16, v3

    .line 421
    .line 422
    move/from16 v17, v4

    .line 423
    .line 424
    move/from16 v18, v5

    .line 425
    .line 426
    move/from16 v19, v6

    .line 427
    .line 428
    move-object/from16 v21, v7

    .line 429
    .line 430
    invoke-static/range {v11 .. v25}, Lz51;->g(Ljava/lang/String;Lkx4;ZLo88;IIIIZLig5;Lx67;Ldn2;Llp2;II)V

    .line 431
    .line 432
    .line 433
    move-object/from16 v0, v23

    .line 434
    .line 435
    invoke-virtual {v0, v8}, Llp2;->p(Z)V

    .line 436
    .line 437
    .line 438
    :goto_6
    invoke-virtual {v0, v9}, Llp2;->p(Z)V

    .line 439
    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_b
    move-object v0, v11

    .line 443
    invoke-virtual {v0}, Llp2;->Q()V

    .line 444
    .line 445
    .line 446
    :goto_7
    return-object v2

    .line 447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

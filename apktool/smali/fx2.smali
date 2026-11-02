.class public final synthetic Lfx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Lon2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lon2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lfx2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lfx2;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lfx2;->Z:Lon2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, Lfx2;->X:B

    .line 6
    .line 7
    sget-object v3, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    const/high16 v4, 0x41400000    # 12.0f

    .line 10
    .line 11
    sget-object v5, Lhx4;->X:Lhx4;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v9, v0, Lfx2;->Z:Lon2;

    .line 17
    .line 18
    iget-object v0, v0, Lfx2;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v2, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, Ly05;

    .line 24
    .line 25
    check-cast v9, Lpv3;

    .line 26
    .line 27
    move-object/from16 v2, p1

    .line 28
    .line 29
    check-cast v2, Luw0;

    .line 30
    .line 31
    check-cast v1, Ldn2;

    .line 32
    .line 33
    move-object/from16 v15, p3

    .line 34
    .line 35
    check-cast v15, Llp2;

    .line 36
    .line 37
    move-object/from16 v10, p4

    .line 38
    .line 39
    check-cast v10, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    and-int/lit16 v1, v10, 0x81

    .line 52
    .line 53
    const/16 v2, 0x80

    .line 54
    .line 55
    if-eq v1, v2, :cond_0

    .line 56
    .line 57
    move v7, v6

    .line 58
    :cond_0
    and-int/lit8 v1, v10, 0x1

    .line 59
    .line 60
    invoke-virtual {v15, v1, v7}, Llp2;->N(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    sget-object v1, Lpz2;->o0:Lo50;

    .line 67
    .line 68
    new-instance v2, Lft;

    .line 69
    .line 70
    new-instance v7, Lbt;

    .line 71
    .line 72
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    const/high16 v10, 0x41800000    # 16.0f

    .line 76
    .line 77
    invoke-direct {v2, v10, v7}, Lft;-><init>(FLbt;)V

    .line 78
    .line 79
    .line 80
    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 81
    .line 82
    const/4 v11, 0x2

    .line 83
    invoke-static {v7, v10, v8, v11}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    const/16 v10, 0x36

    .line 88
    .line 89
    invoke-static {v2, v1, v15, v10}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-wide v10, v15, Llp2;->T:J

    .line 94
    .line 95
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {v15}, Llp2;->l()Lkl5;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-static {v15, v8}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    sget-object v11, Luz0;->j:Lpz2;

    .line 108
    .line 109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15}, Llp2;->Z()V

    .line 113
    .line 114
    .line 115
    iget-boolean v11, v15, Llp2;->S:Z

    .line 116
    .line 117
    if-eqz v11, :cond_1

    .line 118
    .line 119
    invoke-virtual {v15}, Llp2;->k()V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {v15}, Llp2;->j0()V

    .line 124
    .line 125
    .line 126
    :goto_0
    sget-object v11, Lpz2;->B0:Ldx0;

    .line 127
    .line 128
    invoke-static {v11, v15, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 132
    .line 133
    invoke-static {v1, v15, v10}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 141
    .line 142
    invoke-static {v2, v15, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v15}, Lpn7;->l(Llp2;)V

    .line 146
    .line 147
    .line 148
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 149
    .line 150
    invoke-static {v1, v15, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-instance v11, Ld44;

    .line 154
    .line 155
    const/high16 v1, 0x3f800000    # 1.0f

    .line 156
    .line 157
    invoke-direct {v11, v1, v6}, Ld44;-><init>(FZ)V

    .line 158
    .line 159
    .line 160
    sget v1, Ly46;->app_update_header:I

    .line 161
    .line 162
    invoke-static {v1, v15}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    sget-object v1, Les;->a:Lox1;

    .line 167
    .line 168
    invoke-virtual {v15, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Lds;

    .line 173
    .line 174
    iget-object v1, v1, Lds;->a:Lcs;

    .line 175
    .line 176
    iget-object v1, v1, Lcs;->c:Lo88;

    .line 177
    .line 178
    sget-object v2, Lep;->z:Lox1;

    .line 179
    .line 180
    invoke-virtual {v15, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ldp;

    .line 185
    .line 186
    iget-object v2, v2, Ldp;->c:Lxr;

    .line 187
    .line 188
    iget-wide v12, v2, Lxr;->a:J

    .line 189
    .line 190
    const/16 v27, 0x0

    .line 191
    .line 192
    const v28, 0xfffffe

    .line 193
    .line 194
    .line 195
    const-wide/16 v19, 0x0

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const-wide/16 v23, 0x0

    .line 202
    .line 203
    const-wide/16 v25, 0x0

    .line 204
    .line 205
    move-object/from16 v16, v1

    .line 206
    .line 207
    move-wide/from16 v17, v12

    .line 208
    .line 209
    invoke-static/range {v16 .. v28}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    const/high16 v20, 0x30000

    .line 214
    .line 215
    const/16 v21, 0x1d8

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    move-object/from16 v19, v15

    .line 220
    .line 221
    const/4 v15, 0x1

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    invoke-static/range {v10 .. v21}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 229
    .line 230
    .line 231
    move-object/from16 v15, v19

    .line 232
    .line 233
    invoke-virtual {v15, v6}, Llp2;->p(Z)V

    .line 234
    .line 235
    .line 236
    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v15, v1}, Lch3;->f(Llp2;Lkx4;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, Lja3;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    sget-object v2, Lyb6;->a:Lzb6;

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-interface {v1}, Lzu3;->E()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    invoke-static {v7}, Lg33;->e(Lkx4;)Lkx4;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    new-instance v1, Lo90;

    .line 268
    .line 269
    const/4 v2, 0x6

    .line 270
    invoke-direct {v1, v9, v0, v2}, Lo90;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 271
    .line 272
    .line 273
    const v0, -0x6e9bd84d

    .line 274
    .line 275
    .line 276
    invoke-static {v0, v1, v15}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    const/16 v16, 0x6000

    .line 281
    .line 282
    const/4 v12, 0x0

    .line 283
    const/4 v13, 0x0

    .line 284
    invoke-static/range {v10 .. v16}, Lkm4;->c(Ljava/lang/Object;Lkx4;Lta2;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 285
    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_2
    invoke-virtual {v15}, Llp2;->Q()V

    .line 289
    .line 290
    .line 291
    :goto_1
    return-object v3

    .line 292
    :pswitch_0
    check-cast v0, Lkx4;

    .line 293
    .line 294
    check-cast v9, Lzy0;

    .line 295
    .line 296
    move-object/from16 v2, p1

    .line 297
    .line 298
    check-cast v2, Lej;

    .line 299
    .line 300
    move-object/from16 v10, p3

    .line 301
    .line 302
    check-cast v10, Llp2;

    .line 303
    .line 304
    move-object/from16 v11, p4

    .line 305
    .line 306
    check-cast v11, Ljava/lang/Integer;

    .line 307
    .line 308
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    and-int/lit8 v2, v11, 0x30

    .line 316
    .line 317
    if-nez v2, :cond_5

    .line 318
    .line 319
    and-int/lit8 v2, v11, 0x40

    .line 320
    .line 321
    if-nez v2, :cond_3

    .line 322
    .line 323
    invoke-virtual {v10, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    goto :goto_2

    .line 328
    :cond_3
    invoke-virtual {v10, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    :goto_2
    if-eqz v2, :cond_4

    .line 333
    .line 334
    const/16 v2, 0x20

    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_4
    const/16 v2, 0x10

    .line 338
    .line 339
    :goto_3
    or-int/2addr v11, v2

    .line 340
    :cond_5
    and-int/lit16 v2, v11, 0x91

    .line 341
    .line 342
    const/16 v12, 0x90

    .line 343
    .line 344
    if-eq v2, v12, :cond_6

    .line 345
    .line 346
    move v2, v6

    .line 347
    goto :goto_4

    .line 348
    :cond_6
    move v2, v7

    .line 349
    :goto_4
    and-int/lit8 v12, v11, 0x1

    .line 350
    .line 351
    invoke-virtual {v10, v12, v2}, Llp2;->N(IZ)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_9

    .line 356
    .line 357
    if-nez v1, :cond_8

    .line 358
    .line 359
    const v1, 0x2ed70029

    .line 360
    .line 361
    .line 362
    invoke-virtual {v10, v1}, Llp2;->W(I)V

    .line 363
    .line 364
    .line 365
    sget-object v1, Lpz2;->Z:Lp50;

    .line 366
    .line 367
    invoke-static {v1, v7}, Lg80;->c(Lp50;Z)Lxr4;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    iget-wide v11, v10, Llp2;->T:J

    .line 372
    .line 373
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-virtual {v10}, Llp2;->l()Lkl5;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    invoke-static {v10, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sget-object v11, Luz0;->j:Lpz2;

    .line 386
    .line 387
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v10}, Llp2;->Z()V

    .line 391
    .line 392
    .line 393
    iget-boolean v11, v10, Llp2;->S:Z

    .line 394
    .line 395
    if-eqz v11, :cond_7

    .line 396
    .line 397
    invoke-virtual {v10}, Llp2;->k()V

    .line 398
    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_7
    invoke-virtual {v10}, Llp2;->j0()V

    .line 402
    .line 403
    .line 404
    :goto_5
    sget-object v11, Lpz2;->B0:Ldx0;

    .line 405
    .line 406
    invoke-static {v11, v10, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 410
    .line 411
    invoke-static {v1, v10, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 419
    .line 420
    invoke-static {v2, v10, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-static {v10}, Lpn7;->l(Llp2;)V

    .line 424
    .line 425
    .line 426
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 427
    .line 428
    invoke-static {v1, v10, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v5, v8, v4, v6}, Los4;->z(Lkx4;FFI)Lkx4;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    sget-object v1, Lpz2;->i0:Lp50;

    .line 436
    .line 437
    invoke-static {v0, v1}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-static {v10, v0}, Lhi5;->L(Llp2;Lkx4;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v10, v6}, Llp2;->p(Z)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v10, v7}, Llp2;->p(Z)V

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :cond_8
    const v0, 0x2ed7146e

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10, v0}, Llp2;->W(I)V

    .line 455
    .line 456
    .line 457
    shr-int/lit8 v0, v11, 0x3

    .line 458
    .line 459
    and-int/lit8 v0, v0, 0xe

    .line 460
    .line 461
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v9, v1, v10, v0}, Lzy0;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v10, v7}, Llp2;->p(Z)V

    .line 469
    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_9
    invoke-virtual {v10}, Llp2;->Q()V

    .line 473
    .line 474
    .line 475
    :goto_6
    return-object v3

    .line 476
    nop

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

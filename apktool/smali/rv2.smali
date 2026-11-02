.class public final synthetic Lrv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lrv2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrv2;->Y:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lrv2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v15, p1

    .line 14
    .line 15
    check-cast v15, Llp2;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/lit8 v6, v1, 0x3

    .line 26
    .line 27
    if-eq v6, v4, :cond_0

    .line 28
    .line 29
    move v3, v5

    .line 30
    :cond_0
    and-int/2addr v1, v5

    .line 31
    invoke-virtual {v15, v1, v3}, Llp2;->N(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    sget-object v1, Les;->a:Lox1;

    .line 38
    .line 39
    invoke-virtual {v15, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lds;

    .line 44
    .line 45
    iget-object v1, v1, Lds;->c:Lo88;

    .line 46
    .line 47
    sget-object v3, Lep;->z:Lox1;

    .line 48
    .line 49
    invoke-virtual {v15, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ldp;

    .line 54
    .line 55
    iget-object v3, v3, Ldp;->c:Lxr;

    .line 56
    .line 57
    iget-wide v3, v3, Lxr;->a:J

    .line 58
    .line 59
    const/16 v27, 0x0

    .line 60
    .line 61
    const v28, 0xfffffe

    .line 62
    .line 63
    .line 64
    const-wide/16 v19, 0x0

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    const/16 v22, 0x0

    .line 69
    .line 70
    const-wide/16 v23, 0x0

    .line 71
    .line 72
    const-wide/16 v25, 0x0

    .line 73
    .line 74
    move-object/from16 v16, v1

    .line 75
    .line 76
    move-wide/from16 v17, v3

    .line 77
    .line 78
    invoke-static/range {v16 .. v28}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x1fa

    .line 85
    .line 86
    iget-object v6, v0, Lrv2;->Y:Ljava/lang/String;

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    const/4 v14, 0x0

    .line 95
    invoke-static/range {v6 .. v17}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v15}, Llp2;->Q()V

    .line 100
    .line 101
    .line 102
    :goto_0
    return-object v2

    .line 103
    :pswitch_0
    move-object/from16 v12, p1

    .line 104
    .line 105
    check-cast v12, Llp2;

    .line 106
    .line 107
    move-object/from16 v1, p2

    .line 108
    .line 109
    check-cast v1, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    and-int/lit8 v6, v1, 0x3

    .line 116
    .line 117
    if-eq v6, v4, :cond_2

    .line 118
    .line 119
    move v3, v5

    .line 120
    :cond_2
    and-int/2addr v1, v5

    .line 121
    invoke-virtual {v12, v1, v3}, Llp2;->N(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    const/high16 v1, 0x41000000    # 8.0f

    .line 128
    .line 129
    const/high16 v3, 0x40800000    # 4.0f

    .line 130
    .line 131
    sget-object v4, Lhx4;->X:Lhx4;

    .line 132
    .line 133
    invoke-static {v4, v1, v3}, Los4;->y(Lkx4;FF)Lkx4;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    sget-object v1, Les;->a:Lox1;

    .line 138
    .line 139
    invoke-virtual {v12, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lds;

    .line 144
    .line 145
    iget-object v13, v1, Lds;->c:Lo88;

    .line 146
    .line 147
    sget-object v1, Lep;->z:Lox1;

    .line 148
    .line 149
    invoke-virtual {v12, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Ldp;

    .line 154
    .line 155
    iget-object v1, v1, Ldp;->c:Lxr;

    .line 156
    .line 157
    iget-wide v14, v1, Lxr;->a:J

    .line 158
    .line 159
    const/16 v24, 0x0

    .line 160
    .line 161
    const v25, 0xfffffe

    .line 162
    .line 163
    .line 164
    const-wide/16 v16, 0x0

    .line 165
    .line 166
    const/16 v18, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    const-wide/16 v20, 0x0

    .line 171
    .line 172
    const-wide/16 v22, 0x0

    .line 173
    .line 174
    invoke-static/range {v13 .. v25}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    const/16 v13, 0x30

    .line 179
    .line 180
    const/16 v14, 0x1f8

    .line 181
    .line 182
    iget-object v3, v0, Lrv2;->Y:Ljava/lang/String;

    .line 183
    .line 184
    const/4 v6, 0x0

    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    const/4 v10, 0x0

    .line 189
    const/4 v11, 0x0

    .line 190
    invoke-static/range {v3 .. v14}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_3
    invoke-virtual {v12}, Llp2;->Q()V

    .line 195
    .line 196
    .line 197
    :goto_1
    return-object v2

    .line 198
    :pswitch_1
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, Llp2;

    .line 201
    .line 202
    move-object/from16 v6, p2

    .line 203
    .line 204
    check-cast v6, Ljava/lang/Integer;

    .line 205
    .line 206
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    and-int/lit8 v7, v6, 0x3

    .line 211
    .line 212
    if-eq v7, v4, :cond_4

    .line 213
    .line 214
    move v3, v5

    .line 215
    :cond_4
    and-int/lit8 v4, v6, 0x1

    .line 216
    .line 217
    invoke-virtual {v1, v4, v3}, Llp2;->N(IZ)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_5

    .line 222
    .line 223
    sget-object v3, Les;->a:Lox1;

    .line 224
    .line 225
    invoke-virtual {v1, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Lds;

    .line 230
    .line 231
    iget-object v3, v3, Lds;->a:Lcs;

    .line 232
    .line 233
    iget-object v4, v3, Lcs;->c:Lo88;

    .line 234
    .line 235
    sget-object v3, Lep;->z:Lox1;

    .line 236
    .line 237
    invoke-virtual {v1, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, Ldp;

    .line 242
    .line 243
    iget-object v3, v3, Ldp;->c:Lxr;

    .line 244
    .line 245
    iget-wide v5, v3, Lxr;->a:J

    .line 246
    .line 247
    const/4 v15, 0x0

    .line 248
    const v16, 0xfffffe

    .line 249
    .line 250
    .line 251
    const-wide/16 v7, 0x0

    .line 252
    .line 253
    const/4 v9, 0x0

    .line 254
    const/4 v10, 0x0

    .line 255
    const-wide/16 v11, 0x0

    .line 256
    .line 257
    const-wide/16 v13, 0x0

    .line 258
    .line 259
    invoke-static/range {v4 .. v16}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 260
    .line 261
    .line 262
    move-result-object v15

    .line 263
    const/16 v23, 0x0

    .line 264
    .line 265
    const/16 v24, 0x1fa

    .line 266
    .line 267
    iget-object v13, v0, Lrv2;->Y:Ljava/lang/String;

    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const/16 v16, 0x0

    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const/16 v18, 0x0

    .line 275
    .line 276
    const/16 v19, 0x0

    .line 277
    .line 278
    const/16 v20, 0x0

    .line 279
    .line 280
    const/16 v21, 0x0

    .line 281
    .line 282
    move-object/from16 v22, v1

    .line 283
    .line 284
    invoke-static/range {v13 .. v24}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 285
    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_5
    move-object/from16 v22, v1

    .line 289
    .line 290
    invoke-virtual/range {v22 .. v22}, Llp2;->Q()V

    .line 291
    .line 292
    .line 293
    :goto_2
    return-object v2

    .line 294
    :pswitch_2
    sget-object v1, Lpz2;->h0:Lp50;

    .line 295
    .line 296
    move-object/from16 v15, p1

    .line 297
    .line 298
    check-cast v15, Llp2;

    .line 299
    .line 300
    move-object/from16 v6, p2

    .line 301
    .line 302
    check-cast v6, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    and-int/lit8 v7, v6, 0x3

    .line 309
    .line 310
    if-eq v7, v4, :cond_6

    .line 311
    .line 312
    move v4, v5

    .line 313
    goto :goto_3

    .line 314
    :cond_6
    move v4, v3

    .line 315
    :goto_3
    and-int/2addr v6, v5

    .line 316
    invoke-virtual {v15, v6, v4}, Llp2;->N(IZ)Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-eqz v4, :cond_8

    .line 321
    .line 322
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 323
    .line 324
    invoke-static {v1, v3}, Lg80;->c(Lp50;Z)Lxr4;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iget-wide v6, v15, Llp2;->T:J

    .line 329
    .line 330
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    invoke-virtual {v15}, Llp2;->l()Lkl5;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-static {v15, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    sget-object v7, Luz0;->j:Lpz2;

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v15}, Llp2;->Z()V

    .line 348
    .line 349
    .line 350
    iget-boolean v7, v15, Llp2;->S:Z

    .line 351
    .line 352
    if-eqz v7, :cond_7

    .line 353
    .line 354
    invoke-virtual {v15}, Llp2;->k()V

    .line 355
    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_7
    invoke-virtual {v15}, Llp2;->j0()V

    .line 359
    .line 360
    .line 361
    :goto_4
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 362
    .line 363
    invoke-static {v7, v15, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 367
    .line 368
    invoke-static {v1, v15, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    sget-object v3, Lpz2;->C0:Ldx0;

    .line 376
    .line 377
    invoke-static {v3, v15, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v15}, Lpn7;->l(Llp2;)V

    .line 381
    .line 382
    .line 383
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 384
    .line 385
    invoke-static {v1, v15, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    sget-object v1, Les;->a:Lox1;

    .line 389
    .line 390
    invoke-virtual {v15, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    check-cast v1, Lds;

    .line 395
    .line 396
    iget-object v1, v1, Lds;->b:Lo88;

    .line 397
    .line 398
    sget-object v3, Lep;->z:Lox1;

    .line 399
    .line 400
    invoke-virtual {v15, v3}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    check-cast v3, Ldp;

    .line 405
    .line 406
    iget-object v3, v3, Ldp;->j:Ler;

    .line 407
    .line 408
    iget-wide v3, v3, Ler;->a:J

    .line 409
    .line 410
    sget-object v21, Ldj2;->f0:Ldj2;

    .line 411
    .line 412
    const/16 v27, 0x0

    .line 413
    .line 414
    const v28, 0xfffffa

    .line 415
    .line 416
    .line 417
    const-wide/16 v19, 0x0

    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const-wide/16 v23, 0x0

    .line 422
    .line 423
    const-wide/16 v25, 0x0

    .line 424
    .line 425
    move-object/from16 v16, v1

    .line 426
    .line 427
    move-wide/from16 v17, v3

    .line 428
    .line 429
    invoke-static/range {v16 .. v28}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    const/16 v16, 0x0

    .line 434
    .line 435
    const/16 v17, 0x1fa

    .line 436
    .line 437
    iget-object v6, v0, Lrv2;->Y:Ljava/lang/String;

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    const/4 v9, 0x0

    .line 441
    const/4 v10, 0x0

    .line 442
    const/4 v11, 0x0

    .line 443
    const/4 v12, 0x0

    .line 444
    const/4 v13, 0x0

    .line 445
    const/4 v14, 0x0

    .line 446
    invoke-static/range {v6 .. v17}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v15, v5}, Llp2;->p(Z)V

    .line 450
    .line 451
    .line 452
    goto :goto_5

    .line 453
    :cond_8
    invoke-virtual {v15}, Llp2;->Q()V

    .line 454
    .line 455
    .line 456
    :goto_5
    return-object v2

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

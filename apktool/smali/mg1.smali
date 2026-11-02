.class public final Lmg1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lmg1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lmg1;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lmg1;->X:B

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x1

    .line 10
    sget-object v6, Ldn8;->a:Ldn8;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v0, v0, Lmg1;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v8, p1

    .line 19
    .line 20
    check-cast v8, Lkx4;

    .line 21
    .line 22
    move-object/from16 v14, p2

    .line 23
    .line 24
    check-cast v14, Llp2;

    .line 25
    .line 26
    move-object/from16 v1, p3

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    const v1, -0x59518a75

    .line 34
    .line 35
    .line 36
    invoke-virtual {v14, v1}, Llp2;->W(I)V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lly4;->Y:Lly4;

    .line 40
    .line 41
    invoke-static {v1, v14}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    sget-object v1, Lly4;->f0:Lly4;

    .line 46
    .line 47
    invoke-static {v1, v14}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v9, v0

    .line 52
    check-cast v9, Lce8;

    .line 53
    .line 54
    sget-object v13, Lys0;->j0:Lug8;

    .line 55
    .line 56
    invoke-virtual {v9}, Lce8;->c()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v2, v9, Lce8;->d:Lrh5;

    .line 61
    .line 62
    check-cast v0, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const v3, -0x5c966d11

    .line 69
    .line 70
    .line 71
    invoke-virtual {v14, v3}, Llp2;->W(I)V

    .line 72
    .line 73
    .line 74
    const v4, 0x3f4ccccd    # 0.8f

    .line 75
    .line 76
    .line 77
    const/high16 v5, 0x3f800000    # 1.0f

    .line 78
    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    move v0, v5

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v0, v4

    .line 84
    :goto_0
    invoke-virtual {v14, v7}, Llp2;->p(Z)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {v14, v3}, Llp2;->W(I)V

    .line 102
    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    move v4, v5

    .line 107
    :cond_1
    invoke-virtual {v14, v7}, Llp2;->p(Z)V

    .line 108
    .line 109
    .line 110
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v9}, Lce8;->f()Lwd8;

    .line 115
    .line 116
    .line 117
    const v0, 0x170ecc34

    .line 118
    .line 119
    .line 120
    invoke-virtual {v14, v0}, Llp2;->W(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v14, v7}, Llp2;->p(Z)V

    .line 124
    .line 125
    .line 126
    const/high16 v15, 0x30000

    .line 127
    .line 128
    invoke-static/range {v9 .. v15}, Lrq7;->h(Lce8;Ljava/lang/Object;Ljava/lang/Object;Lta2;Lug8;Llp2;I)Lyd8;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v9}, Lce8;->c()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    const v4, 0x7b90285b

    .line 143
    .line 144
    .line 145
    invoke-virtual {v14, v4}, Llp2;->W(I)V

    .line 146
    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    if-eqz v3, :cond_2

    .line 150
    .line 151
    move v3, v5

    .line 152
    goto :goto_1

    .line 153
    :cond_2
    move v3, v6

    .line 154
    :goto_1
    invoke-virtual {v14, v7}, Llp2;->p(Z)V

    .line 155
    .line 156
    .line 157
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-virtual {v14, v4}, Llp2;->W(I)V

    .line 172
    .line 173
    .line 174
    if-eqz v2, :cond_3

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_3
    move v5, v6

    .line 178
    :goto_2
    invoke-virtual {v14, v7}, Llp2;->p(Z)V

    .line 179
    .line 180
    .line 181
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-virtual {v9}, Lce8;->f()Lwd8;

    .line 186
    .line 187
    .line 188
    const v2, -0x10ca9e60

    .line 189
    .line 190
    .line 191
    invoke-virtual {v14, v2}, Llp2;->W(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v14, v7}, Llp2;->p(Z)V

    .line 195
    .line 196
    .line 197
    move-object v12, v1

    .line 198
    invoke-static/range {v9 .. v15}, Lrq7;->h(Lce8;Ljava/lang/Object;Ljava/lang/Object;Lta2;Lug8;Llp2;I)Lyd8;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    move-object v2, v14

    .line 203
    iget-object v3, v0, Lyd8;->j0:Lrh5;

    .line 204
    .line 205
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    iget-object v0, v0, Lyd8;->j0:Lrh5;

    .line 216
    .line 217
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    iget-object v0, v1, Lyd8;->j0:Lrh5;

    .line 228
    .line 229
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Ljava/lang/Number;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    const/4 v13, 0x0

    .line 240
    const v14, 0x1fff8

    .line 241
    .line 242
    .line 243
    const/4 v12, 0x0

    .line 244
    invoke-static/range {v8 .. v14}, Ljm4;->K(Lkx4;FFFFLx67;I)Lkx4;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v2, v7}, Llp2;->p(Z)V

    .line 249
    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_0
    move-object/from16 v9, p1

    .line 253
    .line 254
    check-cast v9, Lwb7;

    .line 255
    .line 256
    move-object/from16 v16, p2

    .line 257
    .line 258
    check-cast v16, Llp2;

    .line 259
    .line 260
    move-object/from16 v1, p3

    .line 261
    .line 262
    check-cast v1, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    sget-object v8, Lpb7;->a:Lpb7;

    .line 269
    .line 270
    move-object v11, v0

    .line 271
    check-cast v11, Ljb7;

    .line 272
    .line 273
    const/high16 v0, 0x6000000

    .line 274
    .line 275
    and-int/lit8 v1, v1, 0xe

    .line 276
    .line 277
    or-int v17, v1, v0

    .line 278
    .line 279
    const/4 v10, 0x0

    .line 280
    const/4 v12, 0x0

    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    invoke-virtual/range {v8 .. v17}, Lpb7;->b(Lwb7;Lkx4;Ljb7;Lrn2;Lsn2;FFLlp2;I)V

    .line 285
    .line 286
    .line 287
    return-object v6

    .line 288
    :pswitch_1
    move-object/from16 v1, p1

    .line 289
    .line 290
    check-cast v1, Lhc8;

    .line 291
    .line 292
    move-object/from16 v8, p2

    .line 293
    .line 294
    check-cast v8, Llp2;

    .line 295
    .line 296
    move-object/from16 v9, p3

    .line 297
    .line 298
    check-cast v9, Ljava/lang/Number;

    .line 299
    .line 300
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    and-int/lit8 v10, v9, 0x6

    .line 305
    .line 306
    if-nez v10, :cond_6

    .line 307
    .line 308
    and-int/lit8 v10, v9, 0x8

    .line 309
    .line 310
    if-nez v10, :cond_4

    .line 311
    .line 312
    invoke-virtual {v8, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    goto :goto_3

    .line 317
    :cond_4
    invoke-virtual {v8, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    :goto_3
    if-eqz v10, :cond_5

    .line 322
    .line 323
    move v3, v4

    .line 324
    :cond_5
    or-int/2addr v9, v3

    .line 325
    :cond_6
    and-int/lit8 v3, v9, 0x13

    .line 326
    .line 327
    if-eq v3, v2, :cond_7

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_7
    move v5, v7

    .line 331
    :goto_4
    and-int/lit8 v2, v9, 0x1

    .line 332
    .line 333
    invoke-virtual {v8, v2, v5}, Llp2;->N(IZ)Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eqz v2, :cond_8

    .line 338
    .line 339
    new-instance v2, Lsb;

    .line 340
    .line 341
    check-cast v0, Ljava/lang/String;

    .line 342
    .line 343
    const/4 v3, 0x5

    .line 344
    invoke-direct {v2, v0, v3}, Lsb;-><init>(Ljava/lang/Object;B)V

    .line 345
    .line 346
    .line 347
    const v0, -0x3b99a1f7

    .line 348
    .line 349
    .line 350
    invoke-static {v0, v2, v8}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 351
    .line 352
    .line 353
    move-result-object v26

    .line 354
    const/high16 v0, 0x30000000

    .line 355
    .line 356
    and-int/lit8 v2, v9, 0xe

    .line 357
    .line 358
    or-int v28, v2, v0

    .line 359
    .line 360
    const/16 v19, 0x0

    .line 361
    .line 362
    const/16 v20, 0x0

    .line 363
    .line 364
    const/16 v21, 0x0

    .line 365
    .line 366
    const-wide/16 v22, 0x0

    .line 367
    .line 368
    const-wide/16 v24, 0x0

    .line 369
    .line 370
    move-object/from16 v18, v1

    .line 371
    .line 372
    move-object/from16 v27, v8

    .line 373
    .line 374
    invoke-static/range {v18 .. v28}, Lec8;->a(Lhc8;Lkx4;FLx67;JJLzy0;Llp2;I)V

    .line 375
    .line 376
    .line 377
    goto :goto_5

    .line 378
    :cond_8
    move-object/from16 v27, v8

    .line 379
    .line 380
    invoke-virtual/range {v27 .. v27}, Llp2;->Q()V

    .line 381
    .line 382
    .line 383
    :goto_5
    return-object v6

    .line 384
    :pswitch_2
    move-object/from16 v1, p1

    .line 385
    .line 386
    check-cast v1, Ldw0;

    .line 387
    .line 388
    iget-wide v8, v1, Ldw0;->a:J

    .line 389
    .line 390
    move-object/from16 v1, p2

    .line 391
    .line 392
    check-cast v1, Llp2;

    .line 393
    .line 394
    move-object/from16 v10, p3

    .line 395
    .line 396
    check-cast v10, Ljava/lang/Number;

    .line 397
    .line 398
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    and-int/lit8 v11, v10, 0x6

    .line 403
    .line 404
    if-nez v11, :cond_a

    .line 405
    .line 406
    invoke-virtual {v1, v8, v9}, Llp2;->e(J)Z

    .line 407
    .line 408
    .line 409
    move-result v11

    .line 410
    if-eqz v11, :cond_9

    .line 411
    .line 412
    move v3, v4

    .line 413
    :cond_9
    or-int/2addr v10, v3

    .line 414
    :cond_a
    and-int/lit8 v3, v10, 0x13

    .line 415
    .line 416
    if-eq v3, v2, :cond_b

    .line 417
    .line 418
    goto :goto_6

    .line 419
    :cond_b
    move v5, v7

    .line 420
    :goto_6
    and-int/lit8 v2, v10, 0x1

    .line 421
    .line 422
    invoke-virtual {v1, v2, v5}, Llp2;->N(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-eqz v2, :cond_c

    .line 427
    .line 428
    check-cast v0, Ln38;

    .line 429
    .line 430
    iget v0, v0, Ln38;->c:I

    .line 431
    .line 432
    shl-int/lit8 v2, v10, 0x3

    .line 433
    .line 434
    and-int/lit8 v2, v2, 0x70

    .line 435
    .line 436
    invoke-static {v0, v8, v9, v1, v2}, Lng1;->b(IJLlp2;I)V

    .line 437
    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_c
    invoke-virtual {v1}, Llp2;->Q()V

    .line 441
    .line 442
    .line 443
    :goto_7
    return-object v6

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

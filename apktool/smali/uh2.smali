.class public final synthetic Luh2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lvh2;


# direct methods
.method public synthetic constructor <init>(Lvh2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Luh2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Luh2;->Y:Lvh2;

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
    .locals 11

    .line 1
    iget-byte v0, p0, Luh2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const-string v2, "visitChildren called on an unattached node"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/16 v6, 0x10

    .line 11
    .line 12
    iget-object p0, p0, Luh2;->Y:Lvh2;

    .line 13
    .line 14
    check-cast p1, Lfm0;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 20
    .line 21
    move-object v7, v3

    .line 22
    :goto_0
    if-eqz v0, :cond_7

    .line 23
    .line 24
    instance-of v8, v0, Lai2;

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    check-cast v0, Lai2;

    .line 29
    .line 30
    invoke-static {v0}, Lg33;->P(Lai2;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_6

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_0
    iget v8, v0, Ljx4;->Z:I

    .line 39
    .line 40
    and-int/lit16 v8, v8, 0x400

    .line 41
    .line 42
    if-eqz v8, :cond_6

    .line 43
    .line 44
    instance-of v8, v0, Loh1;

    .line 45
    .line 46
    if-eqz v8, :cond_6

    .line 47
    .line 48
    move-object v8, v0

    .line 49
    check-cast v8, Loh1;

    .line 50
    .line 51
    iget-object v8, v8, Loh1;->r0:Ljx4;

    .line 52
    .line 53
    move v9, v4

    .line 54
    :goto_1
    if-eqz v8, :cond_5

    .line 55
    .line 56
    iget v10, v8, Ljx4;->Z:I

    .line 57
    .line 58
    and-int/lit16 v10, v10, 0x400

    .line 59
    .line 60
    if-eqz v10, :cond_4

    .line 61
    .line 62
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    if-ne v9, v5, :cond_1

    .line 65
    .line 66
    move-object v0, v8

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    if-nez v7, :cond_2

    .line 69
    .line 70
    new-instance v7, Lc15;

    .line 71
    .line 72
    new-array v10, v6, [Ljx4;

    .line 73
    .line 74
    invoke-direct {v7, v4, v10}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v7, v0}, Lc15;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v0, v3

    .line 83
    :cond_3
    invoke-virtual {v7, v8}, Lc15;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_2
    iget-object v8, v8, Ljx4;->h0:Ljx4;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    if-ne v9, v5, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    invoke-static {v7}, Lyn0;->T(Lc15;)Ljx4;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_0

    .line 97
    :cond_7
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 98
    .line 99
    iget-boolean v0, v0, Ljx4;->p0:Z

    .line 100
    .line 101
    if-nez v0, :cond_8

    .line 102
    .line 103
    invoke-static {v2}, Lwc3;->b(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_8
    new-instance v0, Lc15;

    .line 107
    .line 108
    new-array v2, v6, [Ljx4;

    .line 109
    .line 110
    invoke-direct {v0, v4, v2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, Ljx4;->X:Ljx4;

    .line 114
    .line 115
    iget-object v7, v2, Ljx4;->h0:Ljx4;

    .line 116
    .line 117
    if-nez v7, :cond_9

    .line 118
    .line 119
    invoke-static {v0, v2}, Lyn0;->n(Lc15;Ljx4;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_9
    invoke-virtual {v0, v7}, Lc15;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_a
    :goto_3
    iget v2, v0, Lc15;->Z:I

    .line 127
    .line 128
    if-eqz v2, :cond_14

    .line 129
    .line 130
    add-int/lit8 v2, v2, -0x1

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lc15;->k(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljx4;

    .line 137
    .line 138
    iget v7, v2, Ljx4;->f0:I

    .line 139
    .line 140
    and-int/lit16 v7, v7, 0x400

    .line 141
    .line 142
    if-nez v7, :cond_b

    .line 143
    .line 144
    invoke-static {v0, v2}, Lyn0;->n(Lc15;Ljx4;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_b
    :goto_4
    if-eqz v2, :cond_a

    .line 149
    .line 150
    iget v7, v2, Ljx4;->Z:I

    .line 151
    .line 152
    and-int/lit16 v7, v7, 0x400

    .line 153
    .line 154
    if-eqz v7, :cond_13

    .line 155
    .line 156
    move-object v7, v3

    .line 157
    :goto_5
    if-eqz v2, :cond_a

    .line 158
    .line 159
    instance-of v8, v2, Lai2;

    .line 160
    .line 161
    if-eqz v8, :cond_c

    .line 162
    .line 163
    check-cast v2, Lai2;

    .line 164
    .line 165
    invoke-static {v2}, Lg33;->P(Lai2;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_12

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_c
    iget v8, v2, Ljx4;->Z:I

    .line 173
    .line 174
    and-int/lit16 v8, v8, 0x400

    .line 175
    .line 176
    if-eqz v8, :cond_12

    .line 177
    .line 178
    instance-of v8, v2, Loh1;

    .line 179
    .line 180
    if-eqz v8, :cond_12

    .line 181
    .line 182
    move-object v8, v2

    .line 183
    check-cast v8, Loh1;

    .line 184
    .line 185
    iget-object v8, v8, Loh1;->r0:Ljx4;

    .line 186
    .line 187
    move v9, v4

    .line 188
    :goto_6
    if-eqz v8, :cond_11

    .line 189
    .line 190
    iget v10, v8, Ljx4;->Z:I

    .line 191
    .line 192
    and-int/lit16 v10, v10, 0x400

    .line 193
    .line 194
    if-eqz v10, :cond_10

    .line 195
    .line 196
    add-int/lit8 v9, v9, 0x1

    .line 197
    .line 198
    if-ne v9, v5, :cond_d

    .line 199
    .line 200
    move-object v2, v8

    .line 201
    goto :goto_7

    .line 202
    :cond_d
    if-nez v7, :cond_e

    .line 203
    .line 204
    new-instance v7, Lc15;

    .line 205
    .line 206
    new-array v10, v6, [Ljx4;

    .line 207
    .line 208
    invoke-direct {v7, v4, v10}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_e
    if-eqz v2, :cond_f

    .line 212
    .line 213
    invoke-virtual {v7, v2}, Lc15;->b(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    move-object v2, v3

    .line 217
    :cond_f
    invoke-virtual {v7, v8}, Lc15;->b(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_10
    :goto_7
    iget-object v8, v8, Ljx4;->h0:Ljx4;

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_11
    if-ne v9, v5, :cond_12

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_12
    invoke-static {v7}, Lyn0;->T(Lc15;)Ljx4;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    goto :goto_5

    .line 231
    :cond_13
    iget-object v2, v2, Ljx4;->h0:Ljx4;

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_14
    iget-object v0, p0, Lvh2;->q0:Loh2;

    .line 235
    .line 236
    sget-object v2, Loh2;->b:Loh2;

    .line 237
    .line 238
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-nez v0, :cond_16

    .line 243
    .line 244
    iget-object v0, p0, Lvh2;->q0:Loh2;

    .line 245
    .line 246
    sget-object v2, Loh2;->c:Loh2;

    .line 247
    .line 248
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_15

    .line 253
    .line 254
    iput-boolean v5, p1, Lfm0;->a:Z

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_15
    iget-object p0, p0, Lvh2;->q0:Loh2;

    .line 258
    .line 259
    invoke-static {p0}, Loh2;->a(Loh2;)Z

    .line 260
    .line 261
    .line 262
    :cond_16
    :goto_8
    return-object v1

    .line 263
    :pswitch_0
    iget-object p1, p0, Ljx4;->X:Ljx4;

    .line 264
    .line 265
    move-object v0, v3

    .line 266
    :goto_9
    if-eqz p1, :cond_1e

    .line 267
    .line 268
    instance-of v7, p1, Lai2;

    .line 269
    .line 270
    if-eqz v7, :cond_17

    .line 271
    .line 272
    check-cast p1, Lai2;

    .line 273
    .line 274
    invoke-static {p1}, Lg33;->Q(Lai2;)Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_1d

    .line 279
    .line 280
    goto/16 :goto_11

    .line 281
    .line 282
    :cond_17
    iget v7, p1, Ljx4;->Z:I

    .line 283
    .line 284
    and-int/lit16 v7, v7, 0x400

    .line 285
    .line 286
    if-eqz v7, :cond_1d

    .line 287
    .line 288
    instance-of v7, p1, Loh1;

    .line 289
    .line 290
    if-eqz v7, :cond_1d

    .line 291
    .line 292
    move-object v7, p1

    .line 293
    check-cast v7, Loh1;

    .line 294
    .line 295
    iget-object v7, v7, Loh1;->r0:Ljx4;

    .line 296
    .line 297
    move v8, v4

    .line 298
    :goto_a
    if-eqz v7, :cond_1c

    .line 299
    .line 300
    iget v9, v7, Ljx4;->Z:I

    .line 301
    .line 302
    and-int/lit16 v9, v9, 0x400

    .line 303
    .line 304
    if-eqz v9, :cond_1b

    .line 305
    .line 306
    add-int/lit8 v8, v8, 0x1

    .line 307
    .line 308
    if-ne v8, v5, :cond_18

    .line 309
    .line 310
    move-object p1, v7

    .line 311
    goto :goto_b

    .line 312
    :cond_18
    if-nez v0, :cond_19

    .line 313
    .line 314
    new-instance v0, Lc15;

    .line 315
    .line 316
    new-array v9, v6, [Ljx4;

    .line 317
    .line 318
    invoke-direct {v0, v4, v9}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_19
    if-eqz p1, :cond_1a

    .line 322
    .line 323
    invoke-virtual {v0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    move-object p1, v3

    .line 327
    :cond_1a
    invoke-virtual {v0, v7}, Lc15;->b(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_1b
    :goto_b
    iget-object v7, v7, Ljx4;->h0:Ljx4;

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_1c
    if-ne v8, v5, :cond_1d

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_1d
    invoke-static {v0}, Lyn0;->T(Lc15;)Ljx4;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    goto :goto_9

    .line 341
    :cond_1e
    iget-object p1, p0, Ljx4;->X:Ljx4;

    .line 342
    .line 343
    iget-boolean p1, p1, Ljx4;->p0:Z

    .line 344
    .line 345
    if-nez p1, :cond_1f

    .line 346
    .line 347
    invoke-static {v2}, Lwc3;->b(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_1f
    new-instance p1, Lc15;

    .line 351
    .line 352
    new-array v0, v6, [Ljx4;

    .line 353
    .line 354
    invoke-direct {p1, v4, v0}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    iget-object p0, p0, Ljx4;->X:Ljx4;

    .line 358
    .line 359
    iget-object v0, p0, Ljx4;->h0:Ljx4;

    .line 360
    .line 361
    if-nez v0, :cond_20

    .line 362
    .line 363
    invoke-static {p1, p0}, Lyn0;->n(Lc15;Ljx4;)V

    .line 364
    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_20
    invoke-virtual {p1, v0}, Lc15;->b(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    :cond_21
    :goto_c
    iget p0, p1, Lc15;->Z:I

    .line 371
    .line 372
    if-eqz p0, :cond_2b

    .line 373
    .line 374
    add-int/lit8 p0, p0, -0x1

    .line 375
    .line 376
    invoke-virtual {p1, p0}, Lc15;->k(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    check-cast p0, Ljx4;

    .line 381
    .line 382
    iget v0, p0, Ljx4;->f0:I

    .line 383
    .line 384
    and-int/lit16 v0, v0, 0x400

    .line 385
    .line 386
    if-nez v0, :cond_22

    .line 387
    .line 388
    invoke-static {p1, p0}, Lyn0;->n(Lc15;Ljx4;)V

    .line 389
    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_22
    :goto_d
    if-eqz p0, :cond_21

    .line 393
    .line 394
    iget v0, p0, Ljx4;->Z:I

    .line 395
    .line 396
    and-int/lit16 v0, v0, 0x400

    .line 397
    .line 398
    if-eqz v0, :cond_2a

    .line 399
    .line 400
    move-object v0, v3

    .line 401
    :goto_e
    if-eqz p0, :cond_21

    .line 402
    .line 403
    instance-of v2, p0, Lai2;

    .line 404
    .line 405
    if-eqz v2, :cond_23

    .line 406
    .line 407
    check-cast p0, Lai2;

    .line 408
    .line 409
    invoke-static {p0}, Lg33;->Q(Lai2;)Z

    .line 410
    .line 411
    .line 412
    move-result p0

    .line 413
    if-eqz p0, :cond_29

    .line 414
    .line 415
    goto :goto_11

    .line 416
    :cond_23
    iget v2, p0, Ljx4;->Z:I

    .line 417
    .line 418
    and-int/lit16 v2, v2, 0x400

    .line 419
    .line 420
    if-eqz v2, :cond_29

    .line 421
    .line 422
    instance-of v2, p0, Loh1;

    .line 423
    .line 424
    if-eqz v2, :cond_29

    .line 425
    .line 426
    move-object v2, p0

    .line 427
    check-cast v2, Loh1;

    .line 428
    .line 429
    iget-object v2, v2, Loh1;->r0:Ljx4;

    .line 430
    .line 431
    move v7, v4

    .line 432
    :goto_f
    if-eqz v2, :cond_28

    .line 433
    .line 434
    iget v8, v2, Ljx4;->Z:I

    .line 435
    .line 436
    and-int/lit16 v8, v8, 0x400

    .line 437
    .line 438
    if-eqz v8, :cond_27

    .line 439
    .line 440
    add-int/lit8 v7, v7, 0x1

    .line 441
    .line 442
    if-ne v7, v5, :cond_24

    .line 443
    .line 444
    move-object p0, v2

    .line 445
    goto :goto_10

    .line 446
    :cond_24
    if-nez v0, :cond_25

    .line 447
    .line 448
    new-instance v0, Lc15;

    .line 449
    .line 450
    new-array v8, v6, [Ljx4;

    .line 451
    .line 452
    invoke-direct {v0, v4, v8}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_25
    if-eqz p0, :cond_26

    .line 456
    .line 457
    invoke-virtual {v0, p0}, Lc15;->b(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    move-object p0, v3

    .line 461
    :cond_26
    invoke-virtual {v0, v2}, Lc15;->b(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    :cond_27
    :goto_10
    iget-object v2, v2, Ljx4;->h0:Ljx4;

    .line 465
    .line 466
    goto :goto_f

    .line 467
    :cond_28
    if-ne v7, v5, :cond_29

    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_29
    invoke-static {v0}, Lyn0;->T(Lc15;)Ljx4;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    goto :goto_e

    .line 475
    :cond_2a
    iget-object p0, p0, Ljx4;->h0:Ljx4;

    .line 476
    .line 477
    goto :goto_d

    .line 478
    :cond_2b
    :goto_11
    return-object v1

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

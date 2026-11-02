.class public final Lx7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgx5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx7;->k:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1}, Lhd1;->p()Led1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lx7;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p1}, Lgx5;->m()Lfx4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lx7;->d:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1}, Lgx5;->e()Lfl1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lx7;->e:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lx7;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {p1}, Lgx5;->r()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lx7;->a:I

    .line 32
    .line 33
    sget-object v0, Lui8;->a:Lti8;

    .line 34
    .line 35
    iput-object v0, p0, Lx7;->g:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lx7;->b:Z

    .line 39
    .line 40
    iget-object v0, p1, Lgx5;->x0:Li44;

    .line 41
    .line 42
    iput-object v0, p0, Lx7;->h:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p1}, Lfd1;->getName()Lv15;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lx7;->i:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {p1}, Lqt8;->c()Lt14;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lx7;->j:Ljava/lang/Object;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public a()Lgx5;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx7;->k:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, Lgx5;

    .line 7
    .line 8
    iget-object v1, v0, Lx7;->c:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Led1;

    .line 12
    .line 13
    iget-object v1, v0, Lx7;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Lfx4;

    .line 17
    .line 18
    iget-object v1, v0, Lx7;->e:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Lfl1;

    .line 22
    .line 23
    iget-object v1, v0, Lx7;->f:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v6, v1

    .line 26
    check-cast v6, Lfx5;

    .line 27
    .line 28
    iget v7, v0, Lx7;->a:I

    .line 29
    .line 30
    iget-object v1, v0, Lx7;->i:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v8, v1

    .line 33
    check-cast v8, Lv15;

    .line 34
    .line 35
    invoke-virtual/range {v2 .. v8}, Lgx5;->J0(Led1;Lfx4;Lfl1;Lfx5;ILv15;)Lgx5;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-virtual {v2}, Lgx5;->getTypeParameters()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v11, Ljava/util/ArrayList;

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    check-cast v3, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iget-object v3, v0, Lx7;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lui8;

    .line 58
    .line 59
    invoke-static {v1, v3, v10, v11}, Ldh3;->R(Ljava/util/List;Lui8;Led1;Ljava/util/ArrayList;)Lwi8;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iget-object v1, v0, Lx7;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lt14;

    .line 66
    .line 67
    sget-object v3, Lrt8;->g0:Lrt8;

    .line 68
    .line 69
    invoke-virtual {v6, v1, v3}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    if-nez v4, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    sget-object v5, Lrt8;->f0:Lrt8;

    .line 79
    .line 80
    invoke-virtual {v6, v1, v5}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    invoke-virtual {v10, v1}, Lgx5;->N0(Lt14;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    iget-object v1, v0, Lx7;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Li44;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Li44;->I0(Lwi8;)Li44;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-nez v1, :cond_2

    .line 100
    .line 101
    :goto_0
    return-object v20

    .line 102
    :cond_2
    move-object v12, v1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move-object/from16 v12, v20

    .line 105
    .line 106
    :goto_1
    iget-object v1, v2, Lgx5;->y0:Li44;

    .line 107
    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {v1}, Li44;->c()Lt14;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v6, v7, v5}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    if-nez v7, :cond_4

    .line 119
    .line 120
    move-object/from16 v8, v20

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    new-instance v8, Li44;

    .line 124
    .line 125
    new-instance v9, Lo62;

    .line 126
    .line 127
    invoke-virtual {v1}, Li44;->H0()Li86;

    .line 128
    .line 129
    .line 130
    invoke-direct {v9, v10, v7}, Lo62;-><init>(Ljd0;Lt14;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lcw0;->getAnnotations()Lsm;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-direct {v8, v10, v9, v1}, Li44;-><init>(Led1;Lcw0;Lsm;)V

    .line 138
    .line 139
    .line 140
    :goto_2
    move-object v13, v8

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move-object/from16 v13, v20

    .line 143
    .line 144
    :goto_3
    new-instance v14, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    iget-object v1, v2, Lgx5;->w0:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-eqz v7, :cond_8

    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    check-cast v7, Li44;

    .line 166
    .line 167
    invoke-virtual {v7}, Li44;->c()Lt14;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-virtual {v6, v8, v5}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    if-nez v8, :cond_6

    .line 176
    .line 177
    move-object/from16 v17, v1

    .line 178
    .line 179
    move-object/from16 v9, v20

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_6
    new-instance v9, Li44;

    .line 183
    .line 184
    new-instance v15, Lg51;

    .line 185
    .line 186
    invoke-virtual {v7}, Li44;->H0()Li86;

    .line 187
    .line 188
    .line 189
    move-result-object v16

    .line 190
    check-cast v16, Lg51;

    .line 191
    .line 192
    move-object/from16 v17, v1

    .line 193
    .line 194
    invoke-virtual/range {v16 .. v16}, Lg51;->F0()Lv15;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v7}, Li44;->H0()Li86;

    .line 199
    .line 200
    .line 201
    invoke-direct {v15, v10, v8, v1}, Lg51;-><init>(Ljd0;Lt14;Lv15;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7}, Lcw0;->getAnnotations()Lsm;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-direct {v9, v10, v15, v1}, Li44;-><init>(Led1;Lcw0;Lsm;)V

    .line 209
    .line 210
    .line 211
    :goto_5
    if-eqz v9, :cond_7

    .line 212
    .line 213
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    :cond_7
    move-object/from16 v1, v17

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_8
    move-object v9, v10

    .line 220
    move-object v10, v4

    .line 221
    invoke-virtual/range {v9 .. v14}, Lgx5;->O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    move-object v10, v9

    .line 225
    iget-object v1, v2, Lgx5;->A0:Lhx5;

    .line 226
    .line 227
    const/4 v4, 0x2

    .line 228
    sget-object v19, Lke7;->G:Lg55;

    .line 229
    .line 230
    if-nez v1, :cond_9

    .line 231
    .line 232
    move-object/from16 v1, v20

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_9
    new-instance v9, Lhx5;

    .line 236
    .line 237
    invoke-virtual {v1}, Lcw0;->getAnnotations()Lsm;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    iget-object v1, v0, Lx7;->d:Ljava/lang/Object;

    .line 242
    .line 243
    move-object v12, v1

    .line 244
    check-cast v12, Lfx4;

    .line 245
    .line 246
    iget-object v1, v2, Lgx5;->A0:Lhx5;

    .line 247
    .line 248
    invoke-virtual {v1}, Lcx5;->e()Lfl1;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iget v5, v0, Lx7;->a:I

    .line 253
    .line 254
    if-ne v5, v4, :cond_a

    .line 255
    .line 256
    iget-object v5, v1, Lfl1;->a:Ll5;

    .line 257
    .line 258
    invoke-virtual {v5}, Ll5;->k()Ll5;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    invoke-static {v5}, Lgl1;->g(Ll5;)Lfl1;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-static {v5}, Lgl1;->e(Lfl1;)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-eqz v5, :cond_a

    .line 271
    .line 272
    sget-object v1, Lgl1;->h:Lfl1;

    .line 273
    .line 274
    :cond_a
    move-object v13, v1

    .line 275
    iget-object v1, v2, Lgx5;->A0:Lhx5;

    .line 276
    .line 277
    iget-boolean v14, v1, Lcx5;->i0:Z

    .line 278
    .line 279
    iget-boolean v15, v1, Lcx5;->j0:Z

    .line 280
    .line 281
    iget-boolean v1, v1, Lcx5;->m0:Z

    .line 282
    .line 283
    iget v5, v0, Lx7;->a:I

    .line 284
    .line 285
    iget-object v7, v0, Lx7;->f:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v7, Lfx5;

    .line 288
    .line 289
    if-nez v7, :cond_b

    .line 290
    .line 291
    move-object/from16 v18, v20

    .line 292
    .line 293
    :goto_6
    move/from16 v16, v1

    .line 294
    .line 295
    move/from16 v17, v5

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_b
    invoke-interface {v7}, Lfx5;->b()Lhx5;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    move-object/from16 v18, v7

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :goto_7
    invoke-direct/range {v9 .. v19}, Lhx5;-><init>(Lfx5;Lsm;Lfx4;Lfl1;ZZZILhx5;Lke7;)V

    .line 306
    .line 307
    .line 308
    move-object v1, v9

    .line 309
    :goto_8
    if-eqz v1, :cond_d

    .line 310
    .line 311
    iget-object v5, v2, Lgx5;->A0:Lhx5;

    .line 312
    .line 313
    iget-object v7, v5, Lhx5;->q0:Lt14;

    .line 314
    .line 315
    invoke-static {v6, v5}, Lgx5;->K0(Lwi8;Lcx5;)Lho2;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    iput-object v5, v1, Lcx5;->p0:Lho2;

    .line 320
    .line 321
    if-eqz v7, :cond_c

    .line 322
    .line 323
    invoke-virtual {v6, v7, v3}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    goto :goto_9

    .line 328
    :cond_c
    move-object/from16 v3, v20

    .line 329
    .line 330
    :goto_9
    invoke-virtual {v1, v3}, Lhx5;->J0(Lt14;)V

    .line 331
    .line 332
    .line 333
    :cond_d
    iget-object v3, v2, Lgx5;->B0:Ltx5;

    .line 334
    .line 335
    if-nez v3, :cond_e

    .line 336
    .line 337
    move-object/from16 v4, v20

    .line 338
    .line 339
    goto :goto_c

    .line 340
    :cond_e
    new-instance v9, Ltx5;

    .line 341
    .line 342
    invoke-virtual {v3}, Lcw0;->getAnnotations()Lsm;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    iget-object v3, v0, Lx7;->d:Ljava/lang/Object;

    .line 347
    .line 348
    move-object v12, v3

    .line 349
    check-cast v12, Lfx4;

    .line 350
    .line 351
    iget-object v3, v2, Lgx5;->B0:Ltx5;

    .line 352
    .line 353
    invoke-virtual {v3}, Lcx5;->e()Lfl1;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    iget v5, v0, Lx7;->a:I

    .line 358
    .line 359
    if-ne v5, v4, :cond_f

    .line 360
    .line 361
    iget-object v4, v3, Lfl1;->a:Ll5;

    .line 362
    .line 363
    invoke-virtual {v4}, Ll5;->k()Ll5;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-static {v4}, Lgl1;->g(Ll5;)Lfl1;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-static {v4}, Lgl1;->e(Lfl1;)Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_f

    .line 376
    .line 377
    sget-object v3, Lgl1;->h:Lfl1;

    .line 378
    .line 379
    :cond_f
    move-object v13, v3

    .line 380
    iget-object v3, v2, Lgx5;->B0:Ltx5;

    .line 381
    .line 382
    iget-boolean v14, v3, Lcx5;->i0:Z

    .line 383
    .line 384
    iget-boolean v15, v3, Lcx5;->j0:Z

    .line 385
    .line 386
    iget-boolean v3, v3, Lcx5;->m0:Z

    .line 387
    .line 388
    iget v4, v0, Lx7;->a:I

    .line 389
    .line 390
    iget-object v5, v0, Lx7;->f:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v5, Lfx5;

    .line 393
    .line 394
    if-nez v5, :cond_10

    .line 395
    .line 396
    move-object/from16 v18, v20

    .line 397
    .line 398
    :goto_a
    move/from16 v16, v3

    .line 399
    .line 400
    move/from16 v17, v4

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_10
    invoke-interface {v5}, Lfx5;->d()Ltx5;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    move-object/from16 v18, v5

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :goto_b
    invoke-direct/range {v9 .. v19}, Ltx5;-><init>(Lfx5;Lsm;Lfx4;Lfl1;ZZZILtx5;Lke7;)V

    .line 411
    .line 412
    .line 413
    move-object v4, v9

    .line 414
    :goto_c
    if-eqz v4, :cond_14

    .line 415
    .line 416
    iget-object v3, v2, Lgx5;->B0:Ltx5;

    .line 417
    .line 418
    invoke-virtual {v3}, Ltx5;->L()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    const/4 v8, 0x0

    .line 423
    const/4 v9, 0x0

    .line 424
    const/4 v7, 0x0

    .line 425
    invoke-static/range {v4 .. v9}, Ljo2;->K0(Lho2;Ljava/util/List;Lwi8;ZZ[Z)Ljava/util/ArrayList;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    const/4 v5, 0x0

    .line 430
    if-nez v3, :cond_11

    .line 431
    .line 432
    iget-object v3, v0, Lx7;->c:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v3, Led1;

    .line 435
    .line 436
    invoke-static {v3}, Lel1;->e(Led1;)Lzz3;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-virtual {v3}, Lzz3;->o()Laa7;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    iget-object v7, v2, Lgx5;->B0:Ltx5;

    .line 445
    .line 446
    invoke-virtual {v7}, Ltx5;->L()Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    check-cast v7, Lot8;

    .line 455
    .line 456
    invoke-virtual {v7}, Lcw0;->getAnnotations()Lsm;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    invoke-static {v4, v3, v7}, Ltx5;->I0(Ltx5;Lt14;Lsm;)Lot8;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    :cond_11
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    const/4 v8, 0x1

    .line 473
    if-ne v7, v8, :cond_13

    .line 474
    .line 475
    iget-object v7, v2, Lgx5;->B0:Ltx5;

    .line 476
    .line 477
    invoke-static {v6, v7}, Lgx5;->K0(Lwi8;Lcx5;)Lho2;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    iput-object v7, v4, Lcx5;->p0:Lho2;

    .line 482
    .line 483
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Lot8;

    .line 488
    .line 489
    if-eqz v3, :cond_12

    .line 490
    .line 491
    iput-object v3, v4, Ltx5;->q0:Lot8;

    .line 492
    .line 493
    goto :goto_d

    .line 494
    :cond_12
    const/4 v0, 0x6

    .line 495
    invoke-static {v0}, Ltx5;->B(I)V

    .line 496
    .line 497
    .line 498
    throw v20

    .line 499
    :cond_13
    invoke-static {}, Lio/sentry/c2;->g()V

    .line 500
    .line 501
    .line 502
    return-object v20

    .line 503
    :cond_14
    :goto_d
    iget-object v3, v2, Lgx5;->C0:Ly82;

    .line 504
    .line 505
    if-nez v3, :cond_15

    .line 506
    .line 507
    move-object/from16 v5, v20

    .line 508
    .line 509
    goto :goto_e

    .line 510
    :cond_15
    new-instance v5, Ly82;

    .line 511
    .line 512
    invoke-virtual {v3}, Lcw0;->getAnnotations()Lsm;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-direct {v5, v3, v10}, Ly82;-><init>(Lsm;Lgx5;)V

    .line 517
    .line 518
    .line 519
    :goto_e
    iget-object v3, v2, Lgx5;->D0:Ly82;

    .line 520
    .line 521
    if-nez v3, :cond_16

    .line 522
    .line 523
    move-object/from16 v7, v20

    .line 524
    .line 525
    goto :goto_f

    .line 526
    :cond_16
    new-instance v7, Ly82;

    .line 527
    .line 528
    invoke-virtual {v3}, Lcw0;->getAnnotations()Lsm;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-direct {v7, v3, v10}, Ly82;-><init>(Lsm;Lgx5;)V

    .line 533
    .line 534
    .line 535
    :goto_f
    invoke-virtual {v10, v1, v4, v5, v7}, Lgx5;->L0(Lhx5;Ltx5;Ly82;Ly82;)V

    .line 536
    .line 537
    .line 538
    iget-boolean v0, v0, Lx7;->b:Z

    .line 539
    .line 540
    if-eqz v0, :cond_18

    .line 541
    .line 542
    new-instance v0, Lpc7;

    .line 543
    .line 544
    invoke-direct {v0}, Lh2;-><init>()V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Lgx5;->q()Ljava/util/Collection;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    if-eqz v3, :cond_17

    .line 560
    .line 561
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    check-cast v3, Lfx5;

    .line 566
    .line 567
    invoke-interface {v3, v6}, Lfx5;->g(Lwi8;)Lfx5;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    invoke-virtual {v0, v3}, Lpc7;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    goto :goto_10

    .line 575
    :cond_17
    iput-object v0, v10, Lgx5;->o0:Ljava/util/Collection;

    .line 576
    .line 577
    :cond_18
    invoke-virtual {v2}, Lgx5;->w()Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-eqz v0, :cond_19

    .line 582
    .line 583
    iget-object v0, v2, Lgx5;->l0:Ldn2;

    .line 584
    .line 585
    if-eqz v0, :cond_19

    .line 586
    .line 587
    iget-object v1, v2, Lgx5;->k0:Lse4;

    .line 588
    .line 589
    invoke-virtual {v10, v1, v0}, Lgx5;->M0(Lse4;Ldn2;)V

    .line 590
    .line 591
    .line 592
    :cond_19
    return-object v10
.end method

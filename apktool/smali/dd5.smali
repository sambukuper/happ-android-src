.class public abstract Ldd5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 35

    .line 1
    new-instance v1, Ler0;

    .line 2
    .line 3
    sget-object v0, Lid5;->i:Lv15;

    .line 4
    .line 5
    sget-object v2, Lbt4;->e:Lbt4;

    .line 6
    .line 7
    new-instance v3, Llt8;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v3, v4}, Llt8;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    new-array v6, v5, [Ljq0;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    aput-object v2, v6, v7

    .line 18
    .line 19
    aput-object v3, v6, v4

    .line 20
    .line 21
    invoke-direct {v1, v0, v6}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v2

    .line 25
    new-instance v2, Ler0;

    .line 26
    .line 27
    sget-object v3, Lid5;->j:Lv15;

    .line 28
    .line 29
    new-instance v6, Llt8;

    .line 30
    .line 31
    invoke-direct {v6, v5}, Llt8;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-array v8, v5, [Ljq0;

    .line 35
    .line 36
    aput-object v0, v8, v7

    .line 37
    .line 38
    aput-object v6, v8, v4

    .line 39
    .line 40
    sget-object v6, Lcd5;->Y:Lcd5;

    .line 41
    .line 42
    invoke-direct {v2, v3, v8, v6}, Ler0;-><init>(Lv15;[Ljq0;Lgn2;)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Ler0;

    .line 46
    .line 47
    sget-object v6, Lid5;->a:Lv15;

    .line 48
    .line 49
    sget-object v8, Lli3;->c:Lli3;

    .line 50
    .line 51
    new-instance v9, Llt8;

    .line 52
    .line 53
    invoke-direct {v9, v5}, Llt8;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sget-object v10, Lli3;->b:Lli3;

    .line 57
    .line 58
    const/4 v11, 0x4

    .line 59
    new-array v12, v11, [Ljq0;

    .line 60
    .line 61
    aput-object v0, v12, v7

    .line 62
    .line 63
    aput-object v8, v12, v4

    .line 64
    .line 65
    aput-object v9, v12, v5

    .line 66
    .line 67
    const/4 v9, 0x3

    .line 68
    aput-object v10, v12, v9

    .line 69
    .line 70
    invoke-direct {v3, v6, v12}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Ler0;

    .line 74
    .line 75
    sget-object v12, Lid5;->b:Lv15;

    .line 76
    .line 77
    new-instance v13, Llt8;

    .line 78
    .line 79
    invoke-direct {v13, v9}, Llt8;-><init>(I)V

    .line 80
    .line 81
    .line 82
    new-array v14, v11, [Ljq0;

    .line 83
    .line 84
    aput-object v0, v14, v7

    .line 85
    .line 86
    aput-object v8, v14, v4

    .line 87
    .line 88
    aput-object v13, v14, v5

    .line 89
    .line 90
    aput-object v10, v14, v9

    .line 91
    .line 92
    invoke-direct {v6, v12, v14}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 93
    .line 94
    .line 95
    new-instance v12, Ler0;

    .line 96
    .line 97
    sget-object v13, Lid5;->c:Lv15;

    .line 98
    .line 99
    new-instance v14, Lmt8;

    .line 100
    .line 101
    const-string v15, "must have exactly 2 value parameters"

    .line 102
    .line 103
    invoke-direct {v14, v15, v5}, Lmt8;-><init>(Ljava/lang/String;B)V

    .line 104
    .line 105
    .line 106
    new-array v15, v11, [Ljq0;

    .line 107
    .line 108
    aput-object v0, v15, v7

    .line 109
    .line 110
    aput-object v8, v15, v4

    .line 111
    .line 112
    aput-object v14, v15, v5

    .line 113
    .line 114
    aput-object v10, v15, v9

    .line 115
    .line 116
    invoke-direct {v12, v13, v15}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 117
    .line 118
    .line 119
    move-object v10, v6

    .line 120
    new-instance v6, Ler0;

    .line 121
    .line 122
    sget-object v13, Lid5;->g:Lv15;

    .line 123
    .line 124
    new-array v14, v4, [Ljq0;

    .line 125
    .line 126
    aput-object v0, v14, v7

    .line 127
    .line 128
    invoke-direct {v6, v13, v14}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 129
    .line 130
    .line 131
    move v13, v7

    .line 132
    new-instance v7, Ler0;

    .line 133
    .line 134
    sget-object v14, Lid5;->f:Lv15;

    .line 135
    .line 136
    sget-object v15, Lmt8;->e:Lmt8;

    .line 137
    .line 138
    sget-object v16, Lkk6;->c:Lkk6;

    .line 139
    .line 140
    move/from16 v17, v13

    .line 141
    .line 142
    new-array v13, v11, [Ljq0;

    .line 143
    .line 144
    aput-object v0, v13, v17

    .line 145
    .line 146
    aput-object v15, v13, v4

    .line 147
    .line 148
    aput-object v8, v13, v5

    .line 149
    .line 150
    aput-object v16, v13, v9

    .line 151
    .line 152
    invoke-direct {v7, v14, v13}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 153
    .line 154
    .line 155
    move-object v13, v8

    .line 156
    new-instance v8, Ler0;

    .line 157
    .line 158
    sget-object v14, Lid5;->h:Lv15;

    .line 159
    .line 160
    sget-object v18, Lmt8;->d:Lmt8;

    .line 161
    .line 162
    new-array v11, v5, [Ljq0;

    .line 163
    .line 164
    aput-object v0, v11, v17

    .line 165
    .line 166
    aput-object v18, v11, v4

    .line 167
    .line 168
    invoke-direct {v8, v14, v11}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 169
    .line 170
    .line 171
    new-instance v11, Ler0;

    .line 172
    .line 173
    sget-object v14, Lid5;->k:Lv15;

    .line 174
    .line 175
    move/from16 v20, v4

    .line 176
    .line 177
    new-array v4, v5, [Ljq0;

    .line 178
    .line 179
    aput-object v0, v4, v17

    .line 180
    .line 181
    aput-object v18, v4, v20

    .line 182
    .line 183
    invoke-direct {v11, v14, v4}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 184
    .line 185
    .line 186
    move-object v4, v10

    .line 187
    new-instance v10, Ler0;

    .line 188
    .line 189
    sget-object v14, Lid5;->l:Lv15;

    .line 190
    .line 191
    move/from16 v21, v5

    .line 192
    .line 193
    new-array v5, v9, [Ljq0;

    .line 194
    .line 195
    aput-object v0, v5, v17

    .line 196
    .line 197
    aput-object v18, v5, v20

    .line 198
    .line 199
    aput-object v16, v5, v21

    .line 200
    .line 201
    invoke-direct {v10, v14, v5}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 202
    .line 203
    .line 204
    move-object v5, v11

    .line 205
    new-instance v11, Ler0;

    .line 206
    .line 207
    sget-object v14, Lid5;->p:Lv15;

    .line 208
    .line 209
    move-object/from16 v16, v0

    .line 210
    .line 211
    new-array v0, v9, [Ljq0;

    .line 212
    .line 213
    aput-object v16, v0, v17

    .line 214
    .line 215
    aput-object v15, v0, v20

    .line 216
    .line 217
    aput-object v13, v0, v21

    .line 218
    .line 219
    invoke-direct {v11, v14, v0}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 220
    .line 221
    .line 222
    move-object v0, v5

    .line 223
    move-object v5, v12

    .line 224
    new-instance v12, Ler0;

    .line 225
    .line 226
    sget-object v14, Lid5;->q:Lv15;

    .line 227
    .line 228
    move-object/from16 v22, v0

    .line 229
    .line 230
    new-array v0, v9, [Ljq0;

    .line 231
    .line 232
    aput-object v16, v0, v17

    .line 233
    .line 234
    aput-object v15, v0, v20

    .line 235
    .line 236
    aput-object v13, v0, v21

    .line 237
    .line 238
    invoke-direct {v12, v14, v0}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 239
    .line 240
    .line 241
    move-object v0, v13

    .line 242
    new-instance v13, Ler0;

    .line 243
    .line 244
    sget-object v14, Lid5;->d:Lv15;

    .line 245
    .line 246
    move/from16 v23, v9

    .line 247
    .line 248
    move/from16 v9, v20

    .line 249
    .line 250
    move-object/from16 v20, v0

    .line 251
    .line 252
    new-array v0, v9, [Ljq0;

    .line 253
    .line 254
    sget-object v24, Lbt4;->d:Lbt4;

    .line 255
    .line 256
    aput-object v24, v0, v17

    .line 257
    .line 258
    move/from16 v24, v9

    .line 259
    .line 260
    sget-object v9, Lcd5;->Z:Lcd5;

    .line 261
    .line 262
    invoke-direct {v13, v14, v0, v9}, Ler0;-><init>(Lv15;[Ljq0;Lgn2;)V

    .line 263
    .line 264
    .line 265
    new-instance v14, Ler0;

    .line 266
    .line 267
    sget-object v0, Lid5;->e:Lv15;

    .line 268
    .line 269
    move-object/from16 v25, v1

    .line 270
    .line 271
    const/4 v9, 0x4

    .line 272
    new-array v1, v9, [Ljq0;

    .line 273
    .line 274
    aput-object v16, v1, v17

    .line 275
    .line 276
    sget-object v9, Llk6;->c:Llk6;

    .line 277
    .line 278
    aput-object v9, v1, v24

    .line 279
    .line 280
    aput-object v15, v1, v21

    .line 281
    .line 282
    aput-object v20, v1, v23

    .line 283
    .line 284
    invoke-direct {v14, v0, v1}, Ler0;-><init>(Lv15;[Ljq0;)V

    .line 285
    .line 286
    .line 287
    move-object v0, v15

    .line 288
    new-instance v15, Ler0;

    .line 289
    .line 290
    sget-object v1, Lid5;->y:Ljava/util/Set;

    .line 291
    .line 292
    check-cast v1, Ljava/util/Collection;

    .line 293
    .line 294
    move-object/from16 v26, v0

    .line 295
    .line 296
    move/from16 v9, v23

    .line 297
    .line 298
    new-array v0, v9, [Ljq0;

    .line 299
    .line 300
    aput-object v16, v0, v17

    .line 301
    .line 302
    aput-object v26, v0, v24

    .line 303
    .line 304
    aput-object v20, v0, v21

    .line 305
    .line 306
    invoke-direct {v15, v1, v0}, Ler0;-><init>(Ljava/util/Collection;[Ljq0;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, Ler0;

    .line 310
    .line 311
    sget-object v1, Lid5;->x:Ljava/util/Set;

    .line 312
    .line 313
    check-cast v1, Ljava/util/Collection;

    .line 314
    .line 315
    move-object/from16 v27, v2

    .line 316
    .line 317
    move/from16 v9, v21

    .line 318
    .line 319
    new-array v2, v9, [Ljq0;

    .line 320
    .line 321
    aput-object v16, v2, v17

    .line 322
    .line 323
    aput-object v18, v2, v24

    .line 324
    .line 325
    invoke-direct {v0, v1, v2}, Ler0;-><init>(Ljava/util/Collection;[Ljq0;)V

    .line 326
    .line 327
    .line 328
    new-instance v1, Ler0;

    .line 329
    .line 330
    sget-object v2, Lid5;->n:Lv15;

    .line 331
    .line 332
    sget-object v9, Lid5;->o:Lv15;

    .line 333
    .line 334
    filled-new-array {v2, v9}, [Lv15;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-static {v2}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    move/from16 v9, v24

    .line 343
    .line 344
    move-object/from16 v24, v0

    .line 345
    .line 346
    new-array v0, v9, [Ljq0;

    .line 347
    .line 348
    aput-object v16, v0, v17

    .line 349
    .line 350
    move/from16 v28, v9

    .line 351
    .line 352
    sget-object v9, Lcd5;->f0:Lcd5;

    .line 353
    .line 354
    invoke-direct {v1, v2, v0, v9}, Ler0;-><init>(Ljava/util/Collection;[Ljq0;Lgn2;)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Ler0;

    .line 358
    .line 359
    sget-object v2, Lid5;->z:Ljava/util/Set;

    .line 360
    .line 361
    check-cast v2, Ljava/util/Collection;

    .line 362
    .line 363
    const/4 v9, 0x4

    .line 364
    new-array v9, v9, [Ljq0;

    .line 365
    .line 366
    aput-object v16, v9, v17

    .line 367
    .line 368
    sget-object v19, Lmk6;->c:Lmk6;

    .line 369
    .line 370
    aput-object v19, v9, v28

    .line 371
    .line 372
    move-object/from16 v19, v1

    .line 373
    .line 374
    const/4 v1, 0x2

    .line 375
    aput-object v26, v9, v1

    .line 376
    .line 377
    const/16 v23, 0x3

    .line 378
    .line 379
    aput-object v20, v9, v23

    .line 380
    .line 381
    invoke-direct {v0, v2, v9}, Ler0;-><init>(Ljava/util/Collection;[Ljq0;)V

    .line 382
    .line 383
    .line 384
    new-instance v29, Ler0;

    .line 385
    .line 386
    sget-object v31, Lid5;->m:Lkc6;

    .line 387
    .line 388
    new-array v2, v1, [Ljq0;

    .line 389
    .line 390
    aput-object v16, v2, v17

    .line 391
    .line 392
    aput-object v18, v2, v28

    .line 393
    .line 394
    sget-object v33, Lag;->q0:Lag;

    .line 395
    .line 396
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    move-object/from16 v34, v1

    .line 404
    .line 405
    check-cast v34, [Ljq0;

    .line 406
    .line 407
    const/16 v30, 0x0

    .line 408
    .line 409
    const/16 v32, 0x0

    .line 410
    .line 411
    invoke-direct/range {v29 .. v34}, Ler0;-><init>(Lv15;Lkc6;Ljava/util/Collection;Lgn2;[Ljq0;)V

    .line 412
    .line 413
    .line 414
    move-object/from16 v18, v0

    .line 415
    .line 416
    move-object/from16 v17, v19

    .line 417
    .line 418
    move-object/from16 v9, v22

    .line 419
    .line 420
    move-object/from16 v16, v24

    .line 421
    .line 422
    move-object/from16 v1, v25

    .line 423
    .line 424
    move-object/from16 v2, v27

    .line 425
    .line 426
    move-object/from16 v19, v29

    .line 427
    .line 428
    filled-new-array/range {v1 .. v19}, [Ler0;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    sput-object v0, Ldd5;->a:Ljava/util/List;

    .line 437
    .line 438
    return-void
.end method

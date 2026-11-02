.class public abstract Lx97;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ll71;

.field public static final b:[Ljava/lang/StackTraceElement;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll71;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll71;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lx97;->a:Ll71;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 12
    .line 13
    sput-object v0, Lx97;->b:[Ljava/lang/StackTraceElement;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lx97;->c:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public static final A(Lpt1;)J
    .locals 6

    .line 1
    iget-object p0, p0, Lpt1;->a:Landroid/view/DragEvent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/DragEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/view/DragEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-long v0, v0

    .line 16
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-long v2, p0

    .line 21
    const/16 p0, 0x20

    .line 22
    .line 23
    shl-long/2addr v0, p0

    .line 24
    const-wide v4, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v2, v4

    .line 30
    or-long/2addr v0, v2

    .line 31
    return-wide v0
.end method

.method public static final B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const-string p1, "No valid saved state was found for the key \'"

    .line 9
    .line 10
    const-string v0, "\'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."

    .line 11
    .line 12
    invoke-static {p1, p0, v0}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static C(Lld0;)Z
    .locals 2

    .line 1
    sget-object v0, Lua0;->d:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0}, Led1;->getName()Lv15;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget-object v0, Lua0;->c:Ljava/util/Set;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-static {p0}, Lel1;->c(Led1;)Lfk2;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljd0;->L()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {p0}, Lzz3;->A(Led1;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-interface {p0}, Lld0;->q()Ljava/util/Collection;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast p0, Ljava/lang/Iterable;

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    check-cast v0, Ljava/util/Collection;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lld0;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lx97;->C(Lld0;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    :goto_0
    const/4 p0, 0x1

    .line 91
    return p0

    .line 92
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 93
    return p0
.end method

.method public static final D([F[F)Z
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x10

    .line 8
    .line 9
    if-lt v2, v4, :cond_0

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ge v2, v4, :cond_1

    .line 13
    .line 14
    :cond_0
    move/from16 v19, v3

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_1
    aget v2, v0, v3

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    aget v5, v0, v4

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    aget v7, v0, v6

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    aget v9, v0, v8

    .line 28
    .line 29
    const/4 v10, 0x4

    .line 30
    aget v11, v0, v10

    .line 31
    .line 32
    const/4 v12, 0x5

    .line 33
    aget v13, v0, v12

    .line 34
    .line 35
    const/4 v14, 0x6

    .line 36
    aget v15, v0, v14

    .line 37
    .line 38
    const/16 v16, 0x7

    .line 39
    .line 40
    aget v17, v0, v16

    .line 41
    .line 42
    const/16 v18, 0x8

    .line 43
    .line 44
    move/from16 v19, v3

    .line 45
    .line 46
    aget v3, v0, v18

    .line 47
    .line 48
    const/16 v20, 0x9

    .line 49
    .line 50
    move/from16 v21, v4

    .line 51
    .line 52
    aget v4, v0, v20

    .line 53
    .line 54
    const/16 v22, 0xa

    .line 55
    .line 56
    aget v23, v0, v22

    .line 57
    .line 58
    const/16 v24, 0xb

    .line 59
    .line 60
    aget v25, v0, v24

    .line 61
    .line 62
    const/16 v26, 0xc

    .line 63
    .line 64
    move/from16 v27, v6

    .line 65
    .line 66
    aget v6, v0, v26

    .line 67
    .line 68
    const/16 v28, 0xd

    .line 69
    .line 70
    aget v29, v0, v28

    .line 71
    .line 72
    const/16 v30, 0xe

    .line 73
    .line 74
    aget v31, v0, v30

    .line 75
    .line 76
    const/16 v32, 0xf

    .line 77
    .line 78
    aget v0, v0, v32

    .line 79
    .line 80
    mul-float v33, v2, v13

    .line 81
    .line 82
    mul-float v34, v5, v11

    .line 83
    .line 84
    sub-float v33, v33, v34

    .line 85
    .line 86
    mul-float v34, v2, v15

    .line 87
    .line 88
    mul-float v35, v7, v11

    .line 89
    .line 90
    sub-float v34, v34, v35

    .line 91
    .line 92
    mul-float v35, v2, v17

    .line 93
    .line 94
    mul-float v36, v9, v11

    .line 95
    .line 96
    sub-float v35, v35, v36

    .line 97
    .line 98
    mul-float v36, v5, v15

    .line 99
    .line 100
    mul-float v37, v7, v13

    .line 101
    .line 102
    sub-float v36, v36, v37

    .line 103
    .line 104
    mul-float v37, v5, v17

    .line 105
    .line 106
    mul-float v38, v9, v13

    .line 107
    .line 108
    sub-float v37, v37, v38

    .line 109
    .line 110
    mul-float v38, v7, v17

    .line 111
    .line 112
    mul-float v39, v9, v15

    .line 113
    .line 114
    sub-float v38, v38, v39

    .line 115
    .line 116
    mul-float v39, v3, v29

    .line 117
    .line 118
    mul-float v40, v4, v6

    .line 119
    .line 120
    sub-float v39, v39, v40

    .line 121
    .line 122
    mul-float v40, v3, v31

    .line 123
    .line 124
    mul-float v41, v23, v6

    .line 125
    .line 126
    sub-float v40, v40, v41

    .line 127
    .line 128
    mul-float v41, v3, v0

    .line 129
    .line 130
    mul-float v42, v25, v6

    .line 131
    .line 132
    sub-float v41, v41, v42

    .line 133
    .line 134
    mul-float v42, v4, v31

    .line 135
    .line 136
    mul-float v43, v23, v29

    .line 137
    .line 138
    sub-float v42, v42, v43

    .line 139
    .line 140
    mul-float v43, v4, v0

    .line 141
    .line 142
    mul-float v44, v25, v29

    .line 143
    .line 144
    sub-float v43, v43, v44

    .line 145
    .line 146
    mul-float v44, v23, v0

    .line 147
    .line 148
    mul-float v45, v25, v31

    .line 149
    .line 150
    sub-float v44, v44, v45

    .line 151
    .line 152
    mul-float v45, v33, v44

    .line 153
    .line 154
    mul-float v46, v34, v43

    .line 155
    .line 156
    sub-float v45, v45, v46

    .line 157
    .line 158
    mul-float v46, v35, v42

    .line 159
    .line 160
    add-float v46, v46, v45

    .line 161
    .line 162
    mul-float v45, v36, v41

    .line 163
    .line 164
    add-float v45, v45, v46

    .line 165
    .line 166
    mul-float v46, v37, v40

    .line 167
    .line 168
    sub-float v45, v45, v46

    .line 169
    .line 170
    mul-float v46, v38, v39

    .line 171
    .line 172
    add-float v46, v46, v45

    .line 173
    .line 174
    const/16 v45, 0x0

    .line 175
    .line 176
    cmpg-float v45, v46, v45

    .line 177
    .line 178
    if-nez v45, :cond_2

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_2
    const/high16 v47, 0x3f800000    # 1.0f

    .line 183
    .line 184
    div-float v47, v47, v46

    .line 185
    .line 186
    mul-float v46, v13, v44

    .line 187
    .line 188
    mul-float v48, v15, v43

    .line 189
    .line 190
    sub-float v46, v46, v48

    .line 191
    .line 192
    mul-float v48, v17, v42

    .line 193
    .line 194
    add-float v48, v48, v46

    .line 195
    .line 196
    mul-float v48, v48, v47

    .line 197
    .line 198
    aput v48, v1, v19

    .line 199
    .line 200
    move/from16 v46, v8

    .line 201
    .line 202
    neg-float v8, v5

    .line 203
    mul-float v8, v8, v44

    .line 204
    .line 205
    mul-float v48, v7, v43

    .line 206
    .line 207
    add-float v48, v48, v8

    .line 208
    .line 209
    mul-float v8, v9, v42

    .line 210
    .line 211
    sub-float v48, v48, v8

    .line 212
    .line 213
    mul-float v48, v48, v47

    .line 214
    .line 215
    aput v48, v1, v21

    .line 216
    .line 217
    mul-float v8, v29, v38

    .line 218
    .line 219
    mul-float v48, v31, v37

    .line 220
    .line 221
    sub-float v8, v8, v48

    .line 222
    .line 223
    mul-float v48, v0, v36

    .line 224
    .line 225
    add-float v48, v48, v8

    .line 226
    .line 227
    mul-float v48, v48, v47

    .line 228
    .line 229
    aput v48, v1, v27

    .line 230
    .line 231
    neg-float v8, v4

    .line 232
    mul-float v8, v8, v38

    .line 233
    .line 234
    mul-float v27, v23, v37

    .line 235
    .line 236
    add-float v27, v27, v8

    .line 237
    .line 238
    mul-float v8, v25, v36

    .line 239
    .line 240
    sub-float v27, v27, v8

    .line 241
    .line 242
    mul-float v27, v27, v47

    .line 243
    .line 244
    aput v27, v1, v46

    .line 245
    .line 246
    neg-float v8, v11

    .line 247
    mul-float v27, v8, v44

    .line 248
    .line 249
    mul-float v46, v15, v41

    .line 250
    .line 251
    add-float v46, v46, v27

    .line 252
    .line 253
    mul-float v27, v17, v40

    .line 254
    .line 255
    sub-float v46, v46, v27

    .line 256
    .line 257
    mul-float v46, v46, v47

    .line 258
    .line 259
    aput v46, v1, v10

    .line 260
    .line 261
    mul-float v44, v44, v2

    .line 262
    .line 263
    mul-float v10, v7, v41

    .line 264
    .line 265
    sub-float v44, v44, v10

    .line 266
    .line 267
    mul-float v10, v9, v40

    .line 268
    .line 269
    add-float v10, v10, v44

    .line 270
    .line 271
    mul-float v10, v10, v47

    .line 272
    .line 273
    aput v10, v1, v12

    .line 274
    .line 275
    neg-float v10, v6

    .line 276
    mul-float v12, v10, v38

    .line 277
    .line 278
    mul-float v27, v31, v35

    .line 279
    .line 280
    add-float v27, v27, v12

    .line 281
    .line 282
    mul-float v12, v0, v34

    .line 283
    .line 284
    sub-float v27, v27, v12

    .line 285
    .line 286
    mul-float v27, v27, v47

    .line 287
    .line 288
    aput v27, v1, v14

    .line 289
    .line 290
    mul-float v38, v38, v3

    .line 291
    .line 292
    mul-float v12, v23, v35

    .line 293
    .line 294
    sub-float v38, v38, v12

    .line 295
    .line 296
    mul-float v12, v25, v34

    .line 297
    .line 298
    add-float v12, v12, v38

    .line 299
    .line 300
    mul-float v12, v12, v47

    .line 301
    .line 302
    aput v12, v1, v16

    .line 303
    .line 304
    mul-float v11, v11, v43

    .line 305
    .line 306
    mul-float v12, v13, v41

    .line 307
    .line 308
    sub-float/2addr v11, v12

    .line 309
    mul-float v17, v17, v39

    .line 310
    .line 311
    add-float v17, v17, v11

    .line 312
    .line 313
    mul-float v17, v17, v47

    .line 314
    .line 315
    aput v17, v1, v18

    .line 316
    .line 317
    neg-float v11, v2

    .line 318
    mul-float v11, v11, v43

    .line 319
    .line 320
    mul-float v41, v41, v5

    .line 321
    .line 322
    add-float v41, v41, v11

    .line 323
    .line 324
    mul-float v9, v9, v39

    .line 325
    .line 326
    sub-float v41, v41, v9

    .line 327
    .line 328
    mul-float v41, v41, v47

    .line 329
    .line 330
    aput v41, v1, v20

    .line 331
    .line 332
    mul-float v6, v6, v37

    .line 333
    .line 334
    mul-float v9, v29, v35

    .line 335
    .line 336
    sub-float/2addr v6, v9

    .line 337
    mul-float v0, v0, v33

    .line 338
    .line 339
    add-float/2addr v0, v6

    .line 340
    mul-float v0, v0, v47

    .line 341
    .line 342
    aput v0, v1, v22

    .line 343
    .line 344
    neg-float v0, v3

    .line 345
    mul-float v0, v0, v37

    .line 346
    .line 347
    mul-float v35, v35, v4

    .line 348
    .line 349
    add-float v35, v35, v0

    .line 350
    .line 351
    mul-float v25, v25, v33

    .line 352
    .line 353
    sub-float v35, v35, v25

    .line 354
    .line 355
    mul-float v35, v35, v47

    .line 356
    .line 357
    aput v35, v1, v24

    .line 358
    .line 359
    mul-float v8, v8, v42

    .line 360
    .line 361
    mul-float v13, v13, v40

    .line 362
    .line 363
    add-float/2addr v13, v8

    .line 364
    mul-float v15, v15, v39

    .line 365
    .line 366
    sub-float/2addr v13, v15

    .line 367
    mul-float v13, v13, v47

    .line 368
    .line 369
    aput v13, v1, v26

    .line 370
    .line 371
    mul-float v2, v2, v42

    .line 372
    .line 373
    mul-float v5, v5, v40

    .line 374
    .line 375
    sub-float/2addr v2, v5

    .line 376
    mul-float v7, v7, v39

    .line 377
    .line 378
    add-float/2addr v7, v2

    .line 379
    mul-float v7, v7, v47

    .line 380
    .line 381
    aput v7, v1, v28

    .line 382
    .line 383
    mul-float v10, v10, v36

    .line 384
    .line 385
    mul-float v29, v29, v34

    .line 386
    .line 387
    add-float v29, v29, v10

    .line 388
    .line 389
    mul-float v31, v31, v33

    .line 390
    .line 391
    sub-float v29, v29, v31

    .line 392
    .line 393
    mul-float v29, v29, v47

    .line 394
    .line 395
    aput v29, v1, v30

    .line 396
    .line 397
    mul-float v3, v3, v36

    .line 398
    .line 399
    mul-float v4, v4, v34

    .line 400
    .line 401
    sub-float/2addr v3, v4

    .line 402
    mul-float v23, v23, v33

    .line 403
    .line 404
    add-float v23, v23, v3

    .line 405
    .line 406
    mul-float v23, v23, v47

    .line 407
    .line 408
    aput v23, v1, v32

    .line 409
    .line 410
    :goto_0
    if-nez v45, :cond_3

    .line 411
    .line 412
    move/from16 v3, v21

    .line 413
    .line 414
    goto :goto_1

    .line 415
    :cond_3
    move/from16 v3, v19

    .line 416
    .line 417
    :goto_1
    xor-int/lit8 v0, v3, 0x1

    .line 418
    .line 419
    return v0

    .line 420
    :goto_2
    return v19
.end method

.method public static E()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Blu"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v0, "studio x10"

    .line 26
    .line 27
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public static final F(J)Z
    .locals 7

    .line 1
    sget-wide v0, Ldw0;->f:J

    .line 2
    .line 3
    invoke-static {p0, p1, v0, v1}, Ltk8;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-static {p0, p1}, Ldw0;->e(J)Llw0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-wide v1, v0, Llw0;->b:J

    .line 14
    .line 15
    const-wide v3, 0x300000000L

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2, v3, v4}, Lz91;->B(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-wide v1, v0, Llw0;->b:J

    .line 27
    .line 28
    invoke-static {v1, v2}, Lz91;->R(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "The specified color must be encoded in an RGB color space. The supplied color space is "

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lvc3;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    check-cast v0, Lwk6;

    .line 42
    .line 43
    iget-object v0, v0, Lwk6;->p:Lsk6;

    .line 44
    .line 45
    invoke-static {p0, p1}, Ldw0;->g(J)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    float-to-double v1, v1

    .line 50
    invoke-virtual {v0, v1, v2}, Lsk6;->a(D)D

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-static {p0, p1}, Ldw0;->f(J)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    float-to-double v3, v3

    .line 59
    invoke-virtual {v0, v3, v4}, Lsk6;->a(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-static {p0, p1}, Ldw0;->d(J)F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    float-to-double p0, p0

    .line 68
    invoke-virtual {v0, p0, p1}, Lsk6;->a(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    const-wide v5, 0x3fcb367a0f9096bcL    # 0.2126

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    mul-double/2addr v1, v5

    .line 78
    const-wide v5, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    mul-double/2addr v3, v5

    .line 84
    add-double/2addr v3, v1

    .line 85
    const-wide v0, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    mul-double/2addr p0, v0

    .line 91
    add-double/2addr p0, v3

    .line 92
    double-to-float p0, p0

    .line 93
    const/4 p1, 0x0

    .line 94
    cmpg-float v0, p0, p1

    .line 95
    .line 96
    if-gez v0, :cond_1

    .line 97
    .line 98
    move p0, p1

    .line 99
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 100
    .line 101
    cmpl-float v0, p0, p1

    .line 102
    .line 103
    if-lez v0, :cond_2

    .line 104
    .line 105
    move p0, p1

    .line 106
    :cond_2
    float-to-double p0, p0

    .line 107
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 108
    .line 109
    cmpg-double p0, p0, v0

    .line 110
    .line 111
    if-gtz p0, :cond_3

    .line 112
    .line 113
    const/4 p0, 0x1

    .line 114
    return p0

    .line 115
    :cond_3
    const/4 p0, 0x0

    .line 116
    return p0
.end method

.method public static final G(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lw39;->N(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget p0, Lax3;->O:I

    .line 6
    .line 7
    sget-wide v2, Lax3;->h:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    sget-wide v2, Lax3;->r:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-wide v2, Lax3;->E:J

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    sget-wide v2, Lax3;->q:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static final H(FFLlf;)Z
    .locals 4

    .line 1
    const v0, 0x3ba3d70a    # 0.005f

    .line 2
    .line 3
    .line 4
    sub-float v1, p0, v0

    .line 5
    .line 6
    sub-float v2, p1, v0

    .line 7
    .line 8
    add-float/2addr p0, v0

    .line 9
    add-float/2addr p1, v0

    .line 10
    invoke-static {}, Lnf;->a()Llf;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    :cond_0
    const-string v3, "Invalid rectangle, make sure no value is NaN"

    .line 39
    .line 40
    invoke-static {v3}, Lnf;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v3, v0, Llf;->b:Landroid/graphics/RectF;

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    new-instance v3, Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v3, v0, Llf;->b:Landroid/graphics/RectF;

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v3, v1, v2, p0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 55
    .line 56
    .line 57
    iget-object p0, v0, Llf;->a:Landroid/graphics/Path;

    .line 58
    .line 59
    iget-object p1, v0, Llf;->b:Landroid/graphics/RectF;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v1, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 65
    .line 66
    invoke-virtual {p0, p1, v1}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lnf;->a()Llf;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-virtual {p0, p2, v0, p1}, Llf;->f(Llf;Llf;I)Z

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Llf;->a:Landroid/graphics/Path;

    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/graphics/Path;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-virtual {p0}, Llf;->g()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Llf;->g()V

    .line 87
    .line 88
    .line 89
    xor-int/lit8 p0, p2, 0x1

    .line 90
    .line 91
    return p0
.end method

.method public static I()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Itel"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v0, "itel w6004"

    .line 26
    .line 27
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public static J()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Positivo"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v0, "twist 2 pro"

    .line 26
    .line 27
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public static K()Z
    .locals 4

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Samsung"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    :cond_0
    sget-object v0, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;->a:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroid/util/Range;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    return v0

    .line 73
    :cond_1
    const/4 v0, 0x1

    .line 74
    return v0

    .line 75
    :cond_2
    const/4 v0, 0x0

    .line 76
    return v0
.end method

.method public static L()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Vivo"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v0, "vivo 1805"

    .line 26
    .line 27
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public static final M(FFFFJ)Z
    .locals 2

    .line 1
    sub-float/2addr p0, p2

    .line 2
    sub-float/2addr p1, p3

    .line 3
    const/16 p2, 0x20

    .line 4
    .line 5
    shr-long p2, p4, p2

    .line 6
    .line 7
    long-to-int p2, p2

    .line 8
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const-wide v0, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long p3, p4, v0

    .line 18
    .line 19
    long-to-int p3, p3

    .line 20
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    mul-float/2addr p0, p0

    .line 25
    mul-float/2addr p2, p2

    .line 26
    div-float/2addr p0, p2

    .line 27
    mul-float/2addr p1, p1

    .line 28
    mul-float/2addr p3, p3

    .line 29
    div-float/2addr p1, p3

    .line 30
    add-float/2addr p1, p0

    .line 31
    const/high16 p0, 0x3f800000    # 1.0f

    .line 32
    .line 33
    cmpg-float p0, p1, p0

    .line 34
    .line 35
    if-gtz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static N(Loi5;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Loi5;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    const-string v1, ".class"

    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Lmm7;->R(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    xor-int/2addr p0, v0

    .line 13
    return p0
.end method

.method public static final O(Lkx4;Ljava/lang/Object;)Lkx4;
    .locals 1

    .line 1
    new-instance v0, Lc34;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lc34;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static P(Lw74;Ldn2;)Lg44;
    .locals 2

    .line 1
    sget-object v0, Llh4;->L0:Llh4;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq p0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-ne p0, v1, :cond_0

    .line 17
    .line 18
    new-instance p0, Lzl;

    .line 19
    .line 20
    invoke-direct {p0}, Lzl;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lzl;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, Lzl;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance p0, Lbv6;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lbv6;->X:Ldn2;

    .line 39
    .line 40
    iput-object v0, p0, Lbv6;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    new-instance p0, Lvz7;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 46
    .line 47
    .line 48
    return-object p0
.end method

.method public static Q(Ldn2;)Lvz7;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvz7;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lvz7;-><init>(Ldn2;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static R(Ljava/lang/String;Llr5;Lvj2;I)Lis5;
    .locals 1

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    new-instance p2, Ldx4;

    .line 11
    .line 12
    const/16 p3, 0x1a

    .line 13
    .line 14
    invoke-direct {p2, p3}, Ldx4;-><init>(B)V

    .line 15
    .line 16
    .line 17
    :cond_1
    sget-object p3, Ltp1;->a:Lnf1;

    .line 18
    .line 19
    sget-object p3, Lye1;->Z:Lye1;

    .line 20
    .line 21
    invoke-static {}, Lpw7;->b()Low7;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p3, v0}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-static {p3}, Lgv3;->c(Ls61;)Lm51;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    new-instance v0, Lis5;

    .line 37
    .line 38
    invoke-direct {v0, p0, p1, p2, p3}, Lis5;-><init>(Ljava/lang/String;Llr5;Lgn2;Lb71;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static final S(Lkl5;Lq06;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lkl5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lq06;->b()Ljt8;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    check-cast v0, Ljt8;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljt8;->a(Lkl5;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static T(Loi5;Loi5;)Loi5;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Loi5;->X:Lkb0;

    .line 5
    .line 6
    invoke-virtual {p1}, Lkb0;->t()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lof6;->f0:Loi5;

    .line 11
    .line 12
    iget-object p0, p0, Loi5;->X:Lkb0;

    .line 13
    .line 14
    invoke-virtual {p0}, Lkb0;->t()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p1, p0}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/16 p1, 0x5c

    .line 23
    .line 24
    const/16 v1, 0x2f

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Loi5;->f(Ljava/lang/String;)Loi5;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final U(Landroid/view/View;Lh91;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Li91;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Li91;-><init>(Lh91;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final V(Ls86;)J
    .locals 6

    .line 1
    iget v0, p0, Ls86;->c:F

    .line 2
    .line 3
    iget v1, p0, Ls86;->a:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, Ls86;->d:F

    .line 7
    .line 8
    iget p0, p0, Ls86;->b:F

    .line 9
    .line 10
    sub-float/2addr v1, p0

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-long v2, p0

    .line 16
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-long v0, p0

    .line 21
    const/16 p0, 0x20

    .line 22
    .line 23
    shl-long/2addr v2, p0

    .line 24
    const-wide v4, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v0, v4

    .line 30
    or-long/2addr v0, v2

    .line 31
    return-wide v0
.end method

.method public static W(Lkf3;I)Lif3;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lx97;->h(ZLjava/lang/Number;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lif3;->X:I

    .line 17
    .line 18
    iget v1, p0, Lif3;->Y:I

    .line 19
    .line 20
    iget p0, p0, Lif3;->Z:I

    .line 21
    .line 22
    if-lez p0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    neg-int p1, p1

    .line 26
    :goto_1
    new-instance p0, Lif3;

    .line 27
    .line 28
    invoke-direct {p0, v0, v1, p1}, Lif3;-><init>(III)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public static X(JLni4;)Lli4;
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v2, v3}, Lx97;->h(ZLjava/lang/Number;)V

    .line 18
    .line 19
    .line 20
    iget-wide v5, p2, Lli4;->X:J

    .line 21
    .line 22
    iget-wide v7, p2, Lli4;->Y:J

    .line 23
    .line 24
    iget-wide v2, p2, Lli4;->Z:J

    .line 25
    .line 26
    cmp-long p2, v2, v0

    .line 27
    .line 28
    if-lez p2, :cond_1

    .line 29
    .line 30
    :goto_1
    move-wide v9, p0

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    neg-long p0, p0

    .line 33
    goto :goto_1

    .line 34
    :goto_2
    new-instance v4, Lli4;

    .line 35
    .line 36
    invoke-direct/range {v4 .. v10}, Lli4;-><init>(JJJ)V

    .line 37
    .line 38
    .line 39
    return-object v4
.end method

.method public static final Y(I)Landroid/graphics/Shader$TileMode;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    sget-object p0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    sget-object p0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x3

    .line 19
    if-ne p0, v0, :cond_4

    .line 20
    .line 21
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v0, 0x1f

    .line 24
    .line 25
    if-lt p0, v0, :cond_3

    .line 26
    .line 27
    invoke-static {}, Ltc;->l()Landroid/graphics/Shader$TileMode;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_3
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_4
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final Z(B)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const-string p0, "quotation mark \'\"\'"

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    const-string p0, "string escape sequence \'\\\'"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/4 v0, 0x4

    .line 14
    if-ne p0, v0, :cond_2

    .line 15
    .line 16
    const-string p0, "comma \',\'"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    const/4 v0, 0x5

    .line 20
    if-ne p0, v0, :cond_3

    .line 21
    .line 22
    const-string p0, "colon \':\'"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    const/4 v0, 0x6

    .line 26
    if-ne p0, v0, :cond_4

    .line 27
    .line 28
    const-string p0, "start of the object \'{\'"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_4
    const/4 v0, 0x7

    .line 32
    if-ne p0, v0, :cond_5

    .line 33
    .line 34
    const-string p0, "end of the object \'}\'"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_5
    const/16 v0, 0x8

    .line 38
    .line 39
    if-ne p0, v0, :cond_6

    .line 40
    .line 41
    const-string p0, "start of the array \'[\'"

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_6
    const/16 v0, 0x9

    .line 45
    .line 46
    if-ne p0, v0, :cond_7

    .line 47
    .line 48
    const-string p0, "end of the array \']\'"

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_7
    const/16 v0, 0xa

    .line 52
    .line 53
    if-ne p0, v0, :cond_8

    .line 54
    .line 55
    const-string p0, "end of the input"

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_8
    const/16 v0, 0x7f

    .line 59
    .line 60
    if-ne p0, v0, :cond_9

    .line 61
    .line 62
    const-string p0, "invalid token"

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_9
    const-string p0, "valid token"

    .line 66
    .line 67
    return-object p0
.end method

.method public static final a(Ljava/lang/String;Lgn2;Lkx4;Ly68;Lo88;ZLwx3;Lw58;Lde3;Llp2;I)V
    .locals 100

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-object/from16 v3, p9

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v4, -0xe1f600d

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v4}, Llp2;->X(I)Llp2;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x2

    .line 30
    :goto_0
    or-int v4, p10, v4

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/16 v6, 0x800

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    move v5, v6

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v5, 0x400

    .line 43
    .line 44
    :goto_1
    or-int/2addr v4, v5

    .line 45
    invoke-virtual {v3, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    const/16 v5, 0x4000

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v5, 0x2000

    .line 55
    .line 56
    :goto_2
    or-int/2addr v4, v5

    .line 57
    const/high16 v5, 0xdb0000

    .line 58
    .line 59
    or-int/2addr v4, v5

    .line 60
    move/from16 v8, p5

    .line 61
    .line 62
    invoke-virtual {v3, v8}, Llp2;->g(Z)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    const/high16 v5, 0x4000000

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const/high16 v5, 0x2000000

    .line 72
    .line 73
    :goto_3
    or-int/2addr v4, v5

    .line 74
    const/high16 v5, 0x30000000

    .line 75
    .line 76
    or-int/2addr v4, v5

    .line 77
    const v5, 0x12492493

    .line 78
    .line 79
    .line 80
    and-int/2addr v5, v4

    .line 81
    const v7, 0x12492492

    .line 82
    .line 83
    .line 84
    const/4 v9, 0x1

    .line 85
    const/4 v10, 0x0

    .line 86
    if-ne v5, v7, :cond_4

    .line 87
    .line 88
    move v5, v10

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    move v5, v9

    .line 91
    :goto_4
    and-int/lit8 v7, v4, 0x1

    .line 92
    .line 93
    invoke-virtual {v3, v7, v5}, Llp2;->N(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_d

    .line 98
    .line 99
    invoke-virtual {v3}, Llp2;->S()V

    .line 100
    .line 101
    .line 102
    and-int/lit8 v5, p10, 0x1

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    invoke-virtual {v3}, Llp2;->x()Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    invoke-virtual {v3}, Llp2;->Q()V

    .line 114
    .line 115
    .line 116
    move-object/from16 v5, p6

    .line 117
    .line 118
    move-object/from16 v11, p7

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_6
    :goto_5
    sget-object v5, Lwx3;->g:Lwx3;

    .line 122
    .line 123
    sget-object v7, Lqe4;->x0:Lqe4;

    .line 124
    .line 125
    move-object v11, v7

    .line 126
    :goto_6
    invoke-virtual {v3}, Llp2;->q()V

    .line 127
    .line 128
    .line 129
    and-int/lit16 v7, v4, 0x1c00

    .line 130
    .line 131
    xor-int/lit16 v7, v7, 0xc00

    .line 132
    .line 133
    if-le v7, v6, :cond_7

    .line 134
    .line 135
    invoke-virtual {v3, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-nez v7, :cond_9

    .line 140
    .line 141
    :cond_7
    and-int/lit16 v7, v4, 0xc00

    .line 142
    .line 143
    if-ne v7, v6, :cond_8

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_8
    move v9, v10

    .line 147
    :cond_9
    :goto_7
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-nez v9, :cond_b

    .line 152
    .line 153
    sget-object v7, Lzz0;->a:Lbe;

    .line 154
    .line 155
    if-ne v6, v7, :cond_a

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_a
    move-object/from16 v9, p1

    .line 159
    .line 160
    goto :goto_9

    .line 161
    :cond_b
    :goto_8
    new-instance v6, Lkx2;

    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    move-object/from16 v9, p1

    .line 165
    .line 166
    invoke-direct {v6, v9, v2, v7, v10}, Lkx2;-><init>(Lgn2;Ly68;Lq51;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :goto_9
    check-cast v6, Lrn2;

    .line 173
    .line 174
    shr-int/lit8 v7, v4, 0x9

    .line 175
    .line 176
    and-int/lit8 v7, v7, 0xe

    .line 177
    .line 178
    invoke-static {v6, v3, v2}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    if-nez v0, :cond_c

    .line 182
    .line 183
    const v6, -0x3c719e6

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v6}, Llp2;->W(I)V

    .line 187
    .line 188
    .line 189
    sget-object v6, Lu78;->a:Lox1;

    .line 190
    .line 191
    invoke-virtual {v3, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    check-cast v6, Lo88;

    .line 196
    .line 197
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    .line 198
    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_c
    const v6, -0x3c71cce

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3, v6}, Llp2;->W(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    .line 208
    .line 209
    .line 210
    move-object v6, v0

    .line 211
    :goto_a
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    iget-object v12, v12, Ldp;->c:Lxr;

    .line 216
    .line 217
    iget-wide v14, v12, Lxr;->a:J

    .line 218
    .line 219
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    iget-object v12, v12, Ldp;->c:Lxr;

    .line 224
    .line 225
    iget-wide v12, v12, Lxr;->a:J

    .line 226
    .line 227
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 232
    .line 233
    move/from16 v99, v4

    .line 234
    .line 235
    move-object/from16 p6, v5

    .line 236
    .line 237
    iget-wide v4, v10, Lxr;->c:J

    .line 238
    .line 239
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 244
    .line 245
    move-wide/from16 v18, v4

    .line 246
    .line 247
    iget-wide v4, v10, Lxr;->e:J

    .line 248
    .line 249
    sget-wide v22, Ldw0;->f:J

    .line 250
    .line 251
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 256
    .line 257
    move-wide/from16 v20, v4

    .line 258
    .line 259
    iget-wide v4, v10, Lyr;->a:J

    .line 260
    .line 261
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 266
    .line 267
    move-wide/from16 v30, v4

    .line 268
    .line 269
    iget-wide v4, v10, Lyr;->c:J

    .line 270
    .line 271
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 276
    .line 277
    move-wide/from16 v32, v4

    .line 278
    .line 279
    iget-wide v4, v10, Lyr;->a:J

    .line 280
    .line 281
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 286
    .line 287
    move-wide/from16 v35, v4

    .line 288
    .line 289
    iget-wide v4, v10, Lyr;->a:J

    .line 290
    .line 291
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 296
    .line 297
    move-wide/from16 v37, v4

    .line 298
    .line 299
    iget-wide v4, v10, Lyr;->b:J

    .line 300
    .line 301
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 306
    .line 307
    move-wide/from16 v39, v4

    .line 308
    .line 309
    iget-wide v4, v10, Lyr;->c:J

    .line 310
    .line 311
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 316
    .line 317
    move-wide/from16 v41, v4

    .line 318
    .line 319
    iget-wide v4, v10, Lxr;->a:J

    .line 320
    .line 321
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 326
    .line 327
    move-wide/from16 v43, v4

    .line 328
    .line 329
    iget-wide v4, v10, Lxr;->a:J

    .line 330
    .line 331
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 336
    .line 337
    move-wide/from16 v45, v4

    .line 338
    .line 339
    iget-wide v4, v10, Lxr;->c:J

    .line 340
    .line 341
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 346
    .line 347
    move-wide/from16 v47, v4

    .line 348
    .line 349
    iget-wide v4, v10, Lxr;->e:J

    .line 350
    .line 351
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 356
    .line 357
    move-wide/from16 v49, v4

    .line 358
    .line 359
    iget-wide v4, v10, Lxr;->a:J

    .line 360
    .line 361
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 366
    .line 367
    move-wide/from16 v51, v4

    .line 368
    .line 369
    iget-wide v4, v10, Lxr;->a:J

    .line 370
    .line 371
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 376
    .line 377
    move-wide/from16 v53, v4

    .line 378
    .line 379
    iget-wide v4, v10, Lxr;->c:J

    .line 380
    .line 381
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 382
    .line 383
    .line 384
    move-result-object v10

    .line 385
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 386
    .line 387
    move-wide/from16 v55, v4

    .line 388
    .line 389
    iget-wide v4, v10, Lxr;->e:J

    .line 390
    .line 391
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 396
    .line 397
    move-wide/from16 v57, v4

    .line 398
    .line 399
    iget-wide v4, v10, Lyr;->a:J

    .line 400
    .line 401
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 406
    .line 407
    move-wide/from16 v59, v4

    .line 408
    .line 409
    iget-wide v4, v10, Lxr;->a:J

    .line 410
    .line 411
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 412
    .line 413
    .line 414
    move-result-object v10

    .line 415
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 416
    .line 417
    move-wide/from16 v61, v4

    .line 418
    .line 419
    iget-wide v4, v10, Lxr;->c:J

    .line 420
    .line 421
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    iget-object v10, v10, Ldp;->k:Lyr;

    .line 426
    .line 427
    move-wide/from16 v63, v4

    .line 428
    .line 429
    iget-wide v4, v10, Lyr;->c:J

    .line 430
    .line 431
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 436
    .line 437
    move-wide/from16 v65, v4

    .line 438
    .line 439
    iget-wide v4, v10, Lxr;->b:J

    .line 440
    .line 441
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 446
    .line 447
    move-wide/from16 v75, v4

    .line 448
    .line 449
    iget-wide v4, v10, Lxr;->b:J

    .line 450
    .line 451
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 452
    .line 453
    .line 454
    move-result-object v10

    .line 455
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 456
    .line 457
    move-wide/from16 v77, v4

    .line 458
    .line 459
    iget-wide v4, v10, Lxr;->c:J

    .line 460
    .line 461
    invoke-static {v3}, Lys0;->y(Llp2;)Ldp;

    .line 462
    .line 463
    .line 464
    move-result-object v10

    .line 465
    iget-object v10, v10, Ldp;->c:Lxr;

    .line 466
    .line 467
    move-wide/from16 v79, v4

    .line 468
    .line 469
    iget-wide v4, v10, Lxr;->e:J

    .line 470
    .line 471
    sget-wide v67, Ldw0;->g:J

    .line 472
    .line 473
    sget-object v10, Lkw0;->a:Lox1;

    .line 474
    .line 475
    invoke-virtual {v3, v10}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    check-cast v10, Liw0;

    .line 480
    .line 481
    invoke-static {v10, v3}, Lqe4;->c0(Liw0;Llp2;)Li48;

    .line 482
    .line 483
    .line 484
    move-result-object v10

    .line 485
    const/16 v34, 0x0

    .line 486
    .line 487
    move-wide/from16 v24, v22

    .line 488
    .line 489
    move-wide/from16 v26, v22

    .line 490
    .line 491
    move-wide/from16 v28, v22

    .line 492
    .line 493
    move-wide/from16 v69, v67

    .line 494
    .line 495
    move-wide/from16 v71, v67

    .line 496
    .line 497
    move-wide/from16 v73, v67

    .line 498
    .line 499
    move-wide/from16 v83, v67

    .line 500
    .line 501
    move-wide/from16 v85, v67

    .line 502
    .line 503
    move-wide/from16 v87, v67

    .line 504
    .line 505
    move-wide/from16 v89, v67

    .line 506
    .line 507
    move-wide/from16 v91, v67

    .line 508
    .line 509
    move-wide/from16 v93, v67

    .line 510
    .line 511
    move-wide/from16 v95, v67

    .line 512
    .line 513
    move-wide/from16 v97, v67

    .line 514
    .line 515
    move-wide/from16 v81, v4

    .line 516
    .line 517
    move-wide/from16 v16, v12

    .line 518
    .line 519
    move-object v13, v10

    .line 520
    invoke-virtual/range {v13 .. v98}, Li48;->a(JJJJJJJJJJLh88;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Li48;

    .line 521
    .line 522
    .line 523
    move-result-object v14

    .line 524
    new-instance v4, Lhx2;

    .line 525
    .line 526
    const/4 v5, 0x0

    .line 527
    invoke-direct {v4, v1, v5}, Lhx2;-><init>(Ljava/lang/String;B)V

    .line 528
    .line 529
    .line 530
    const v5, -0x89bc548

    .line 531
    .line 532
    .line 533
    invoke-static {v5, v4, v3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    const v5, 0x36180030

    .line 538
    .line 539
    .line 540
    or-int v17, v7, v5

    .line 541
    .line 542
    shr-int/lit8 v5, v99, 0xf

    .line 543
    .line 544
    and-int/lit16 v5, v5, 0x1f80

    .line 545
    .line 546
    const v7, 0x6186000

    .line 547
    .line 548
    .line 549
    or-int v18, v5, v7

    .line 550
    .line 551
    move-object v7, v4

    .line 552
    const/4 v4, 0x0

    .line 553
    move-object v5, v6

    .line 554
    const/4 v6, 0x0

    .line 555
    const/4 v12, 0x0

    .line 556
    const/4 v13, 0x0

    .line 557
    const/4 v15, 0x0

    .line 558
    move-object/from16 v10, p6

    .line 559
    .line 560
    move-object/from16 v9, p8

    .line 561
    .line 562
    move-object/from16 v16, v3

    .line 563
    .line 564
    move-object/from16 v3, p2

    .line 565
    .line 566
    invoke-static/range {v2 .. v18}, Lwl7;->g(Ly68;Lkx4;ZLo88;Lq58;Lsn2;ZLde3;Lwx3;Lw58;Lay6;Lx67;Li48;Lgg5;Llp2;II)V

    .line 567
    .line 568
    .line 569
    move-object v7, v10

    .line 570
    move-object v8, v11

    .line 571
    goto :goto_b

    .line 572
    :cond_d
    invoke-virtual/range {p9 .. p9}, Llp2;->Q()V

    .line 573
    .line 574
    .line 575
    move-object/from16 v7, p6

    .line 576
    .line 577
    move-object/from16 v8, p7

    .line 578
    .line 579
    :goto_b
    invoke-virtual/range {p9 .. p9}, Llp2;->r()Lj86;

    .line 580
    .line 581
    .line 582
    move-result-object v11

    .line 583
    if-eqz v11, :cond_e

    .line 584
    .line 585
    new-instance v0, Lix2;

    .line 586
    .line 587
    move-object/from16 v2, p1

    .line 588
    .line 589
    move-object/from16 v3, p2

    .line 590
    .line 591
    move-object/from16 v4, p3

    .line 592
    .line 593
    move-object/from16 v5, p4

    .line 594
    .line 595
    move/from16 v6, p5

    .line 596
    .line 597
    move-object/from16 v9, p8

    .line 598
    .line 599
    move/from16 v10, p10

    .line 600
    .line 601
    invoke-direct/range {v0 .. v10}, Lix2;-><init>(Ljava/lang/String;Lgn2;Lkx4;Ly68;Lo88;ZLwx3;Lw58;Lde3;I)V

    .line 602
    .line 603
    .line 604
    iput-object v0, v11, Lj86;->d:Lrn2;

    .line 605
    .line 606
    :cond_e
    return-void
.end method

.method public static a0(II)Lkf3;
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lkf3;->f0:Lkf3;

    .line 6
    .line 7
    sget-object p0, Lkf3;->f0:Lkf3;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lkf3;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr p1, v1

    .line 14
    invoke-direct {v0, p0, p1, v1}, Lif3;-><init>(III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final b(Lth4;Lkx4;Llp2;I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x2ee18bdc

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lth4;->e:Lh76;

    .line 11
    .line 12
    invoke-static {v0, p2}, Li21;->o(Lmh7;Llp2;)Ly05;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    invoke-virtual {p2, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v10, Lzz0;->a:Lbe;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    if-ne v2, v10, :cond_1

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ld0;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/16 v7, 0x16

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    const-class v3, Lth4;

    .line 37
    .line 38
    const-string v4, "onUiIntent"

    .line 39
    .line 40
    const-string v5, "onUiIntent(Lsu/happ/proxyutility/feature/logs/settings/LogSettingsUiIntent;)V"

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    invoke-direct/range {v0 .. v7}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v2, v0

    .line 50
    :cond_1
    move-object v4, v2

    .line 51
    check-cast v4, Lpv3;

    .line 52
    .line 53
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-ne v0, v10, :cond_2

    .line 58
    .line 59
    new-instance v0, Loh2;

    .line 60
    .line 61
    invoke-direct {v0}, Loh2;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    move-object v3, v0

    .line 68
    check-cast v3, Loh2;

    .line 69
    .line 70
    new-instance v0, Loh4;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {v0, v3, v1}, Loh4;-><init>(Loh2;B)V

    .line 74
    .line 75
    .line 76
    const v1, 0x7dc19327

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-instance v0, Lh64;

    .line 84
    .line 85
    const/4 v5, 0x2

    .line 86
    move-object v1, p0

    .line 87
    move-object v2, v8

    .line 88
    invoke-direct/range {v0 .. v5}, Lh64;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    const v1, 0x5d864c3e

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    const v10, 0xc00036

    .line 99
    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    move-object v1, v6

    .line 105
    const-wide/16 v5, 0x0

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    move-object v0, p1

    .line 109
    move-object v9, p2

    .line 110
    invoke-static/range {v0 .. v10}, Lsx2;->b(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Llp2;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    new-instance v1, Li9;

    .line 120
    .line 121
    const/16 v2, 0x14

    .line 122
    .line 123
    invoke-direct {v1, v2, p3, p0, p1}, Li9;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 127
    .line 128
    :cond_3
    return-void
.end method

.method public static b0(J)Lni4;
    .locals 3

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lni4;->f0:Lni4;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lni4;

    .line 11
    .line 12
    const-wide/16 v1, 0x1

    .line 13
    .line 14
    sub-long/2addr p0, v1

    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p0, p1}, Lni4;-><init>(JJ)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static final c(Ldn2;JLax4;Loi;Lzy0;Llp2;I)V
    .locals 22

    .line 1
    move-object/from16 v9, p4

    .line 2
    .line 3
    move-object/from16 v11, p6

    .line 4
    .line 5
    move/from16 v12, p7

    .line 6
    .line 7
    const v0, 0x2db43478

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v0}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v12, 0x6

    .line 14
    .line 15
    move-object/from16 v1, p0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v11, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v12

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v12

    .line 31
    :goto_1
    and-int/lit8 v2, v12, 0x30

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    move-wide/from16 v2, p1

    .line 36
    .line 37
    invoke-virtual {v11, v2, v3}, Llp2;->e(J)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    const/16 v4, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v4, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v0, v4

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move-wide/from16 v2, p1

    .line 51
    .line 52
    :goto_3
    and-int/lit16 v4, v12, 0x180

    .line 53
    .line 54
    if-nez v4, :cond_5

    .line 55
    .line 56
    move-object/from16 v4, p3

    .line 57
    .line 58
    invoke-virtual {v11, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x100

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    const/16 v5, 0x80

    .line 68
    .line 69
    :goto_4
    or-int/2addr v0, v5

    .line 70
    goto :goto_5

    .line 71
    :cond_5
    move-object/from16 v4, p3

    .line 72
    .line 73
    :goto_5
    and-int/lit16 v5, v12, 0xc00

    .line 74
    .line 75
    if-nez v5, :cond_8

    .line 76
    .line 77
    and-int/lit16 v5, v12, 0x1000

    .line 78
    .line 79
    if-nez v5, :cond_6

    .line 80
    .line 81
    invoke-virtual {v11, v9}, Llp2;->f(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    goto :goto_6

    .line 86
    :cond_6
    invoke-virtual {v11, v9}, Llp2;->h(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    :goto_6
    if-eqz v5, :cond_7

    .line 91
    .line 92
    const/16 v5, 0x800

    .line 93
    .line 94
    goto :goto_7

    .line 95
    :cond_7
    const/16 v5, 0x400

    .line 96
    .line 97
    :goto_7
    or-int/2addr v0, v5

    .line 98
    :cond_8
    and-int/lit16 v5, v12, 0x6000

    .line 99
    .line 100
    if-nez v5, :cond_a

    .line 101
    .line 102
    move-object/from16 v5, p5

    .line 103
    .line 104
    invoke-virtual {v11, v5}, Llp2;->h(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_9

    .line 109
    .line 110
    const/16 v6, 0x4000

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_9
    const/16 v6, 0x2000

    .line 114
    .line 115
    :goto_8
    or-int/2addr v0, v6

    .line 116
    goto :goto_9

    .line 117
    :cond_a
    move-object/from16 v5, p5

    .line 118
    .line 119
    :goto_9
    and-int/lit16 v6, v0, 0x2493

    .line 120
    .line 121
    const/16 v7, 0x2492

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    if-eq v6, v7, :cond_b

    .line 125
    .line 126
    const/4 v6, 0x1

    .line 127
    goto :goto_a

    .line 128
    :cond_b
    move v6, v10

    .line 129
    :goto_a
    and-int/lit8 v7, v0, 0x1

    .line 130
    .line 131
    invoke-virtual {v11, v7, v6}, Llp2;->N(IZ)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_17

    .line 136
    .line 137
    sget-object v6, Lpc;->f:Lox1;

    .line 138
    .line 139
    invoke-virtual {v11, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, Landroid/view/View;

    .line 144
    .line 145
    sget-object v7, Ly01;->h:Lox1;

    .line 146
    .line 147
    invoke-virtual {v11, v7}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    check-cast v7, Lfi1;

    .line 152
    .line 153
    sget-object v8, Ly01;->n:Lox1;

    .line 154
    .line 155
    invoke-virtual {v11, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    check-cast v8, Lz24;

    .line 160
    .line 161
    invoke-static {v11}, Lkm4;->j0(Llp2;)Ljp2;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    invoke-static/range {p5 .. p6}, Lz51;->P(Ljava/lang/Object;Llp2;)Ly05;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    new-array v13, v10, [Ljava/lang/Object;

    .line 170
    .line 171
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    sget-object v12, Lzz0;->a:Lbe;

    .line 176
    .line 177
    if-ne v10, v12, :cond_c

    .line 178
    .line 179
    new-instance v10, Ldw4;

    .line 180
    .line 181
    move/from16 v17, v0

    .line 182
    .line 183
    const/4 v0, 0x7

    .line 184
    invoke-direct {v10, v0}, Ldw4;-><init>(B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v11, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_b

    .line 191
    :cond_c
    move/from16 v17, v0

    .line 192
    .line 193
    :goto_b
    check-cast v10, Ldn2;

    .line 194
    .line 195
    invoke-static {v13, v10, v11}, Ljm4;->W([Ljava/lang/Object;Ldn2;Llp2;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Ljava/util/UUID;

    .line 200
    .line 201
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    if-ne v10, v12, :cond_d

    .line 206
    .line 207
    invoke-static {v11}, Lu70;->D(Llp2;)Lb71;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v11, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_d
    check-cast v10, Lb71;

    .line 215
    .line 216
    invoke-virtual {v11, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    invoke-virtual {v11, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v18

    .line 224
    or-int v13, v13, v18

    .line 225
    .line 226
    move-object/from16 v18, v0

    .line 227
    .line 228
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-nez v13, :cond_f

    .line 233
    .line 234
    if-ne v0, v12, :cond_e

    .line 235
    .line 236
    goto :goto_c

    .line 237
    :cond_e
    move-object v6, v8

    .line 238
    move/from16 v19, v17

    .line 239
    .line 240
    const/4 v13, 0x1

    .line 241
    const/16 v16, 0x0

    .line 242
    .line 243
    goto :goto_d

    .line 244
    :cond_f
    :goto_c
    new-instance v0, Low4;

    .line 245
    .line 246
    move-wide/from16 v20, v2

    .line 247
    .line 248
    move-object v2, v4

    .line 249
    move-wide/from16 v3, v20

    .line 250
    .line 251
    move-object v5, v6

    .line 252
    move-object v6, v8

    .line 253
    move/from16 v19, v17

    .line 254
    .line 255
    move-object/from16 v8, v18

    .line 256
    .line 257
    const/4 v13, 0x1

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    invoke-direct/range {v0 .. v10}, Low4;-><init>(Ldn2;Lax4;JLandroid/view/View;Lz24;Lfi1;Ljava/util/UUID;Loi;Lb71;)V

    .line 261
    .line 262
    .line 263
    new-instance v1, Lsb;

    .line 264
    .line 265
    const/4 v2, 0x4

    .line 266
    invoke-direct {v1, v15, v2}, Lsb;-><init>(Ljava/lang/Object;B)V

    .line 267
    .line 268
    .line 269
    new-instance v2, Lzy0;

    .line 270
    .line 271
    const v3, -0x3eaaaf9b

    .line 272
    .line 273
    .line 274
    invoke-direct {v2, v3, v13, v1}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    iget-object v1, v0, Low4;->k0:Llw4;

    .line 278
    .line 279
    invoke-virtual {v1, v14}, Landroidx/compose/ui/platform/AbstractComposeView;->setParentCompositionContext(Lm01;)V

    .line 280
    .line 281
    .line 282
    iget-object v3, v1, Llw4;->q0:Lrh5;

    .line 283
    .line 284
    invoke-virtual {v3, v2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iput-boolean v13, v1, Llw4;->r0:Z

    .line 288
    .line 289
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AbstractComposeView;->d()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v11, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :goto_d
    move-object v2, v0

    .line 296
    check-cast v2, Low4;

    .line 297
    .line 298
    invoke-virtual {v11, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    if-nez v0, :cond_10

    .line 307
    .line 308
    if-ne v1, v12, :cond_11

    .line 309
    .line 310
    :cond_10
    new-instance v1, Lvj2;

    .line 311
    .line 312
    const/16 v0, 0x12

    .line 313
    .line 314
    invoke-direct {v1, v2, v0}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v11, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_11
    check-cast v1, Lgn2;

    .line 321
    .line 322
    invoke-static {v2, v1, v11}, Lu70;->a(Ljava/lang/Object;Lgn2;Llp2;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v11, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    move/from16 v1, v19

    .line 330
    .line 331
    and-int/lit8 v3, v1, 0xe

    .line 332
    .line 333
    const/4 v4, 0x4

    .line 334
    if-ne v3, v4, :cond_12

    .line 335
    .line 336
    move v8, v13

    .line 337
    goto :goto_e

    .line 338
    :cond_12
    move/from16 v8, v16

    .line 339
    .line 340
    :goto_e
    or-int/2addr v0, v8

    .line 341
    and-int/lit16 v3, v1, 0x380

    .line 342
    .line 343
    const/16 v4, 0x100

    .line 344
    .line 345
    if-ne v3, v4, :cond_13

    .line 346
    .line 347
    move v8, v13

    .line 348
    goto :goto_f

    .line 349
    :cond_13
    move/from16 v8, v16

    .line 350
    .line 351
    :goto_f
    or-int/2addr v0, v8

    .line 352
    and-int/lit8 v1, v1, 0x70

    .line 353
    .line 354
    const/16 v3, 0x20

    .line 355
    .line 356
    if-ne v1, v3, :cond_14

    .line 357
    .line 358
    move v8, v13

    .line 359
    goto :goto_10

    .line 360
    :cond_14
    move/from16 v8, v16

    .line 361
    .line 362
    :goto_10
    or-int/2addr v0, v8

    .line 363
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-virtual {v11, v1}, Llp2;->d(I)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    or-int/2addr v0, v1

    .line 372
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    if-nez v0, :cond_15

    .line 377
    .line 378
    if-ne v1, v12, :cond_16

    .line 379
    .line 380
    :cond_15
    new-instance v1, Lbx4;

    .line 381
    .line 382
    move-object/from16 v3, p0

    .line 383
    .line 384
    move-object/from16 v4, p3

    .line 385
    .line 386
    move-object v7, v6

    .line 387
    move-wide/from16 v5, p1

    .line 388
    .line 389
    invoke-direct/range {v1 .. v7}, Lbx4;-><init>(Low4;Ldn2;Lax4;JLz24;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    :cond_16
    check-cast v1, Ldn2;

    .line 396
    .line 397
    invoke-static {v1, v11}, Lu70;->q(Ldn2;Llp2;)V

    .line 398
    .line 399
    .line 400
    goto :goto_11

    .line 401
    :cond_17
    invoke-virtual {v11}, Llp2;->Q()V

    .line 402
    .line 403
    .line 404
    :goto_11
    invoke-virtual {v11}, Llp2;->r()Lj86;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    if-eqz v8, :cond_18

    .line 409
    .line 410
    new-instance v0, Lcx4;

    .line 411
    .line 412
    move-object/from16 v1, p0

    .line 413
    .line 414
    move-wide/from16 v2, p1

    .line 415
    .line 416
    move-object/from16 v4, p3

    .line 417
    .line 418
    move-object/from16 v5, p4

    .line 419
    .line 420
    move-object/from16 v6, p5

    .line 421
    .line 422
    move/from16 v7, p7

    .line 423
    .line 424
    invoke-direct/range {v0 .. v7}, Lcx4;-><init>(Ldn2;JLax4;Loi;Lzy0;I)V

    .line 425
    .line 426
    .line 427
    iput-object v0, v8, Lj86;->d:Lrn2;

    .line 428
    .line 429
    :cond_18
    return-void
.end method

.method public static final c0([Lt06;Lkl5;Lkl5;)Lkl5;
    .locals 6

    .line 1
    sget-object v0, Lkl5;->f0:Lkl5;

    .line 2
    .line 3
    new-instance v1, Ljl5;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ljl5;-><init>(Lkl5;)V

    .line 6
    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    iget-object v4, v3, Lt06;->a:Lq06;

    .line 15
    .line 16
    iget-boolean v5, v3, Lt06;->g:Z

    .line 17
    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Lkl5;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p2, v4}, Lkl5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljt8;

    .line 31
    .line 32
    invoke-virtual {v4, v3, v5}, Lq06;->d(Lt06;Ljt8;)Ljt8;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v4, v3}, Ljl5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v1}, Ljl5;->f()Lkl5;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static final d(Lkx4;Lq06;Lzy0;Llp2;I)V
    .locals 11

    .line 1
    sget-object v1, Lw39;->X:Lzy0;

    .line 2
    .line 3
    const v3, -0x2a95dc91

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v3}, Llp2;->X(I)Llp2;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v3, p4, 0x6

    .line 10
    .line 11
    if-nez v3, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x2

    .line 22
    :goto_0
    or-int/2addr v3, p4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v3, p4

    .line 25
    :goto_1
    and-int/lit8 v5, p4, 0x30

    .line 26
    .line 27
    if-nez v5, :cond_3

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    const/16 v5, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v5, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v3, v5

    .line 41
    :cond_3
    and-int/lit16 v5, p4, 0x180

    .line 42
    .line 43
    if-nez v5, :cond_5

    .line 44
    .line 45
    invoke-virtual {p3, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    const/16 v5, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v5, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v3, v5

    .line 57
    :cond_5
    and-int/lit16 v5, p4, 0xc00

    .line 58
    .line 59
    if-nez v5, :cond_7

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_6

    .line 66
    .line 67
    const/16 v5, 0x800

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    const/16 v5, 0x400

    .line 71
    .line 72
    :goto_4
    or-int/2addr v3, v5

    .line 73
    :cond_7
    and-int/lit16 v5, v3, 0x493

    .line 74
    .line 75
    const/16 v7, 0x492

    .line 76
    .line 77
    if-eq v5, v7, :cond_8

    .line 78
    .line 79
    const/4 v5, 0x1

    .line 80
    goto :goto_5

    .line 81
    :cond_8
    const/4 v5, 0x0

    .line 82
    :goto_5
    and-int/lit8 v7, v3, 0x1

    .line 83
    .line 84
    invoke-virtual {p3, v7, v5}, Llp2;->N(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_a

    .line 89
    .line 90
    invoke-virtual {p3}, Llp2;->K()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    sget-object v7, Lzz0;->a:Lbe;

    .line 95
    .line 96
    if-ne v5, v7, :cond_9

    .line 97
    .line 98
    sget-object v5, Llh4;->i0:Llh4;

    .line 99
    .line 100
    new-instance v7, Lrh5;

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    invoke-direct {v7, v9, v5}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v5, v7

    .line 110
    :cond_9
    move-object v7, v5

    .line 111
    check-cast v7, Ly05;

    .line 112
    .line 113
    shr-int/lit8 v3, v3, 0x6

    .line 114
    .line 115
    and-int/lit8 v3, v3, 0xe

    .line 116
    .line 117
    invoke-static {v1, p3, v3}, Lx97;->f(Lzy0;Llp2;I)Li30;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {p1, v9}, Lq06;->a(Ljava/lang/Object;)Lt06;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v5, Lj30;

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    move-object v6, p0

    .line 129
    move-object v8, p2

    .line 130
    invoke-direct/range {v5 .. v10}, Lj30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    const v3, 0x1059082f

    .line 134
    .line 135
    .line 136
    invoke-static {v3, v5, p3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const/16 v5, 0x38

    .line 141
    .line 142
    invoke-static {v1, v3, p3, v5}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_a
    invoke-virtual {p3}, Llp2;->Q()V

    .line 147
    .line 148
    .line 149
    :goto_6
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-eqz v6, :cond_b

    .line 154
    .line 155
    new-instance v0, Lg8;

    .line 156
    .line 157
    const/4 v5, 0x2

    .line 158
    move-object v1, p0

    .line 159
    move-object v2, p1

    .line 160
    move-object v3, p2

    .line 161
    move v4, p4

    .line 162
    invoke-direct/range {v0 .. v5}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 163
    .line 164
    .line 165
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 166
    .line 167
    :cond_b
    return-void
.end method

.method public static final e(Lgb4;Lqj2;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lc30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lc30;

    .line 6
    .line 7
    iget-object p1, p1, Lc30;->a:Lz82;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    instance-of v0, p1, Lb11;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p1, Lb11;

    .line 18
    .line 19
    iget-object p1, p1, Lb11;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ls55;

    .line 36
    .line 37
    invoke-static {p0, v0}, Lx97;->e(Lgb4;Lqj2;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v0, p1, Lq21;

    .line 42
    .line 43
    if-nez v0, :cond_6

    .line 44
    .line 45
    instance-of v0, p1, Li97;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    check-cast p1, Li97;

    .line 50
    .line 51
    iget-object p1, p1, Li97;->a:Lc30;

    .line 52
    .line 53
    invoke-static {p0, p1}, Lx97;->e(Lgb4;Lqj2;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    instance-of v0, p1, Lz8;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    check-cast p1, Lz8;

    .line 62
    .line 63
    iget-object v0, p1, Lz8;->a:Lb11;

    .line 64
    .line 65
    invoke-static {p0, v0}, Lx97;->e(Lgb4;Lqj2;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p1, Lz8;->b:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lqj2;

    .line 85
    .line 86
    invoke-static {p0, v0}, Lx97;->e(Lgb4;Lqj2;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    return-void

    .line 91
    :cond_4
    instance-of v0, p1, Lld5;

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    check-cast p1, Lld5;

    .line 96
    .line 97
    iget-object p1, p1, Lld5;->b:Lb11;

    .line 98
    .line 99
    invoke-static {p0, p1}, Lx97;->e(Lgb4;Lqj2;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_5
    invoke-static {}, Lb61;->c()V

    .line 104
    .line 105
    .line 106
    :cond_6
    return-void
.end method

.method public static final f(Lzy0;Llp2;I)Li30;
    .locals 2

    .line 1
    and-int/lit8 v0, p2, 0xe

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p2, p2, 0x6

    .line 15
    .line 16
    if-ne p2, v1, :cond_2

    .line 17
    .line 18
    :cond_1
    const/4 p2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 p2, 0x0

    .line 21
    :goto_0
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lzz0;->a:Lbe;

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    if-ne v0, v1, :cond_4

    .line 30
    .line 31
    :cond_3
    new-instance v0, Li30;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Li30;-><init>(Lzy0;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_4
    check-cast v0, Li30;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-nez p0, :cond_5

    .line 50
    .line 51
    if-ne p2, v1, :cond_6

    .line 52
    .line 53
    :cond_5
    new-instance p2, Ly0;

    .line 54
    .line 55
    const/16 p0, 0xb

    .line 56
    .line 57
    invoke-direct {p2, v0, p0}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_6
    check-cast p2, Lgn2;

    .line 64
    .line 65
    invoke-static {v0, p2, p1}, Lu70;->a(Ljava/lang/Object;Lgn2;Llp2;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public static final g(C)B
    .locals 1

    .line 1
    const/16 v0, 0x7e

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lzp0;->b:[B

    .line 6
    .line 7
    aget-byte p0, v0, p0

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public static final h(ZLjava/lang/Number;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Step must be positive, was: "

    .line 5
    .line 6
    invoke-static {p1, p0}, Lkp5;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final i(Lkx4;Lxz4;Ltb3;ZLkl6;Ldn2;)Lkx4;
    .locals 8

    .line 1
    const/4 v5, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    new-instance v0, Lyt0;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v4, p3

    .line 10
    move-object v6, p4

    .line 11
    move-object v7, p5

    .line 12
    invoke-direct/range {v0 .. v7}, Lyt0;-><init>(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, p1

    .line 17
    move-object v2, p2

    .line 18
    move v4, p3

    .line 19
    move-object v6, p4

    .line 20
    move-object v7, p5

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    new-instance v0, Lyt0;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct/range {v0 .. v7}, Lyt0;-><init>(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sget-object p1, Lhx4;->X:Lhx4;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-static {p1, v1, v2}, Lqb3;->a(Lkx4;Lxz4;Ltb3;)Lkx4;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Lyt0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct/range {v0 .. v7}, Lyt0;-><init>(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance p2, Lau0;

    .line 52
    .line 53
    invoke-direct {p2, v2, v4, v6, v7}, Lau0;-><init>(Ltb3;ZLkl6;Ldn2;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Lw45;->x(Lkx4;Lsn2;)Lkx4;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static synthetic j(Lkx4;Lxz4;Landroidx/compose/material3/c;ZLkl6;Ldn2;I)Lkx4;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-static/range {v0 .. v5}, Lx97;->i(Lkx4;Lxz4;Ltb3;ZLkl6;Ldn2;)Lkx4;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static k(Lkx4;ZLjava/lang/String;Ldn2;)Lkx4;
    .locals 8

    .line 1
    new-instance v0, Lyt0;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v6, 0x0

    .line 7
    move v4, p1

    .line 8
    move-object v5, p2

    .line 9
    move-object v7, p3

    .line 10
    invoke-direct/range {v0 .. v7}, Lyt0;-><init>(Lxz4;Ltb3;ZZLjava/lang/String;Lkl6;Ldn2;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static l(DDD)D
    .locals 1

    .line 1
    cmpl-double v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-double v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmpl-double p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static m(FFF)F
    .locals 2

    .line 1
    cmpl-float v0, p1, p2

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-float v0, p0, p1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    cmpl-float p1, p0, p2

    .line 11
    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    return p2

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x2e

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static n(III)I
    .locals 2

    .line 1
    if-gt p1, p2, :cond_2

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    if-le p0, p2, :cond_1

    .line 7
    .line 8
    return p2

    .line 9
    :cond_1
    return p0

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, " is less than minimum "

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x2e

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static o(ILvu0;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Luu0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p1, Luu0;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lx97;->r(Ljava/lang/Comparable;Luu0;)Ljava/lang/Comparable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    invoke-interface {p1}, Lvu0;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    invoke-interface {p1}, Lvu0;->a()Ljava/lang/Comparable;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ge p0, v0, :cond_1

    .line 42
    .line 43
    invoke-interface {p1}, Lvu0;->a()Ljava/lang/Comparable;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0

    .line 54
    :cond_1
    invoke-interface {p1}, Lvu0;->b()Ljava/lang/Comparable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-le p0, v0, :cond_2

    .line 65
    .line 66
    invoke-interface {p1}, Lvu0;->b()Ljava/lang/Comparable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    :cond_2
    return p0

    .line 77
    :cond_3
    const-string p0, "Cannot coerce value to an empty range: "

    .line 78
    .line 79
    invoke-static {p1, p0}, Lkp5;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    return p0
.end method

.method public static p(JJJ)J
    .locals 1

    .line 1
    cmp-long v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmp-long v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmp-long p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p1, "Cannot coerce value to an empty range: maximum "

    .line 19
    .line 20
    const-string v0, " is less than minimum "

    .line 21
    .line 22
    invoke-static {p4, p5, p1, v0}, Lpc6;->s(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x2e

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method public static q(JLni4;)J
    .locals 6

    .line 1
    iget-wide v0, p2, Lli4;->Y:J

    .line 2
    .line 3
    iget-wide v2, p2, Lli4;->X:J

    .line 4
    .line 5
    invoke-virtual {p2}, Lni4;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    if-nez v4, :cond_2

    .line 10
    .line 11
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    cmp-long p2, p0, v4

    .line 20
    .line 21
    if-gez p2, :cond_0

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0

    .line 32
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    cmp-long p2, p0, v2

    .line 41
    .line 42
    if-lez p2, :cond_1

    .line 43
    .line 44
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide p0

    .line 52
    :cond_1
    return-wide p0

    .line 53
    :cond_2
    const-string p0, "Cannot coerce value to an empty range: "

    .line 54
    .line 55
    invoke-static {p2, p0}, Lkp5;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-wide/16 p0, 0x0

    .line 59
    .line 60
    return-wide p0
.end method

.method public static r(Ljava/lang/Comparable;Luu0;)Ljava/lang/Comparable;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Luu0;->Y:F

    .line 5
    .line 6
    iget v1, p1, Luu0;->X:F

    .line 7
    .line 8
    invoke-virtual {p1}, Luu0;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, Luu0;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, p0}, Luu0;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1, p0}, Luu0;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p0, p1}, Luu0;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :cond_1
    return-object p0

    .line 64
    :cond_2
    const-string p0, "Cannot coerce value to an empty range: "

    .line 65
    .line 66
    invoke-static {p1, p0}, Lkp5;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static s(Lkx4;Lxz4;Ltb3;ZLdn2;Ldn2;I)Lkx4;
    .locals 6

    .line 1
    and-int/lit8 v0, p6, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    move v5, p3

    .line 7
    and-int/lit8 p3, p6, 0x40

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :cond_1
    move-object v2, p4

    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    new-instance v0, Lzw0;

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    move-object v3, p2

    .line 19
    move-object v1, p5

    .line 20
    invoke-direct/range {v0 .. v5}, Lzw0;-><init>(Ldn2;Ldn2;Ltb3;Lxz4;Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move-object v4, p1

    .line 25
    move-object v3, p2

    .line 26
    move-object v1, p5

    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    new-instance v0, Lzw0;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct/range {v0 .. v5}, Lzw0;-><init>(Ldn2;Ldn2;Ltb3;Lxz4;Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    sget-object p1, Lhx4;->X:Lhx4;

    .line 37
    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    invoke-static {p1, v4, v3}, Lqb3;->a(Lkx4;Lxz4;Ltb3;)Lkx4;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Lzw0;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct/range {v0 .. v5}, Lzw0;-><init>(Ldn2;Ldn2;Ltb3;Lxz4;Z)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_0

    .line 55
    :cond_4
    new-instance p2, Lau0;

    .line 56
    .line 57
    invoke-direct {p2, v3, v5, v1, v2}, Lau0;-><init>(Ltb3;ZLdn2;Ldn2;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p2}, Lw45;->x(Lkx4;Lsn2;)Lkx4;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_0
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static final t(Lue7;I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lue7;->X:[I

    .line 5
    .line 6
    iget v1, p0, Lue7;->Z:I

    .line 7
    .line 8
    invoke-static {v1, p1, v0}, Lw45;->k(II[I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-ltz p1, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lue7;->Y:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object p0, p0, p1

    .line 17
    .line 18
    sget-object p1, Lx97;->c:Ljava/lang/Object;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static u(Lsv1;Lmb6;J)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Lae5;

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lae5;

    .line 15
    .line 16
    iget-object v0, v0, Lae5;->j0:Ls86;

    .line 17
    .line 18
    iget v1, v0, Ls86;->a:F

    .line 19
    .line 20
    iget v5, v0, Ls86;->b:F

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-long v6, v1

    .line 27
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-long v8, v1

    .line 32
    shl-long v4, v6, v4

    .line 33
    .line 34
    and-long v1, v8, v2

    .line 35
    .line 36
    or-long v3, v4, v1

    .line 37
    .line 38
    invoke-static {v0}, Lx97;->V(Ls86;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    const/high16 v7, 0x3f800000    # 1.0f

    .line 43
    .line 44
    const/4 v8, 0x3

    .line 45
    move-object/from16 v0, p0

    .line 46
    .line 47
    move-wide/from16 v1, p2

    .line 48
    .line 49
    invoke-interface/range {v0 .. v8}, Lsv1;->H0(JJJFI)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    move-object/from16 v1, p0

    .line 54
    .line 55
    move-wide/from16 v5, p2

    .line 56
    .line 57
    instance-of v7, v0, Lbe5;

    .line 58
    .line 59
    if-eqz v7, :cond_2

    .line 60
    .line 61
    check-cast v0, Lbe5;

    .line 62
    .line 63
    iget-object v7, v0, Lbe5;->k0:Llf;

    .line 64
    .line 65
    if-eqz v7, :cond_1

    .line 66
    .line 67
    invoke-interface {v1, v7, v5, v6}, Lsv1;->C0(Llf;J)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    iget-object v0, v0, Lbe5;->j0:Lem6;

    .line 72
    .line 73
    iget v7, v0, Lem6;->b:F

    .line 74
    .line 75
    iget v8, v0, Lem6;->a:F

    .line 76
    .line 77
    iget-wide v9, v0, Lem6;->h:J

    .line 78
    .line 79
    shr-long/2addr v9, v4

    .line 80
    long-to-int v9, v9

    .line 81
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    int-to-long v10, v10

    .line 90
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    int-to-long v12, v12

    .line 95
    shl-long/2addr v10, v4

    .line 96
    and-long/2addr v12, v2

    .line 97
    or-long/2addr v10, v12

    .line 98
    iget v12, v0, Lem6;->c:F

    .line 99
    .line 100
    sub-float/2addr v12, v8

    .line 101
    iget v0, v0, Lem6;->d:F

    .line 102
    .line 103
    sub-float/2addr v0, v7

    .line 104
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    int-to-long v7, v7

    .line 109
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    int-to-long v12, v0

    .line 114
    shl-long/2addr v7, v4

    .line 115
    and-long/2addr v12, v2

    .line 116
    or-long/2addr v7, v12

    .line 117
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    int-to-long v12, v0

    .line 122
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-long v14, v0

    .line 127
    shl-long/2addr v12, v4

    .line 128
    and-long/2addr v2, v14

    .line 129
    or-long/2addr v2, v12

    .line 130
    move-object v0, v1

    .line 131
    move-wide/from16 v16, v7

    .line 132
    .line 133
    move-wide v7, v2

    .line 134
    move-wide v1, v5

    .line 135
    move-wide/from16 v5, v16

    .line 136
    .line 137
    move-wide v3, v10

    .line 138
    invoke-interface/range {v0 .. v8}, Lsv1;->f0(JJJJ)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_2
    instance-of v2, v0, Lzd5;

    .line 143
    .line 144
    if-eqz v2, :cond_3

    .line 145
    .line 146
    check-cast v0, Lzd5;

    .line 147
    .line 148
    iget-object v0, v0, Lzd5;->j0:Llf;

    .line 149
    .line 150
    invoke-interface {v1, v0, v5, v6}, Lsv1;->C0(Llf;J)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public static final v(Lpw3;Lpw3;Z)Lpw3;
    .locals 10

    .line 1
    sget-object v0, Lcl1;->y0:Lcl1;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw27;->i0(Ljava/lang/Object;Lgn2;)Lu27;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lw27;->k0(Lu27;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lpw3;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-object v0, p0

    .line 17
    check-cast v0, Lu1;

    .line 18
    .line 19
    invoke-interface {v0}, Lpw3;->L()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    sget-object v2, Lqe4;->q0:Lqe4;

    .line 31
    .line 32
    move-object v3, p0

    .line 33
    check-cast v3, Lzk6;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lqe4;->E(Lzk6;)Lmh8;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Lqe4;->Z(Lmh8;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    new-instance v5, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    move v7, v6

    .line 50
    :goto_0
    if-ge v7, v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, v3, v7}, Lqe4;->h0(Lmh8;I)Lji8;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, Lrw3;

    .line 57
    .line 58
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v7, v7, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const-string v4, "Error inside type \'"

    .line 73
    .line 74
    if-ne v2, v3, :cond_7

    .line 75
    .line 76
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v2, 0xa

    .line 79
    .line 80
    invoke-static {v5, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x1

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Lrw3;

    .line 104
    .line 105
    if-eqz p2, :cond_2

    .line 106
    .line 107
    sget-object v3, Luw3;->c:Luw3;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    invoke-virtual {v3}, Lrw3;->getUpperBounds()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-static {v9}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    check-cast v9, Lpw3;

    .line 119
    .line 120
    if-eqz v9, :cond_3

    .line 121
    .line 122
    invoke-static {v9, p1, v8}, Lx97;->v(Lpw3;Lpw3;Z)Lpw3;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    sget-object v7, Luw3;->c:Luw3;

    .line 127
    .line 128
    invoke-static {v3}, Lhi5;->g0(Lpw3;)Luw3;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    :goto_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    const-string p0, "\'. Parameter \'"

    .line 137
    .line 138
    const-string p2, "\' has no upper bounds. There must always be at least the default \'Any?\' upper bound"

    .line 139
    .line 140
    invoke-static {v4, p1, p0, v3, p2}, Lxw3;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-object v7

    .line 144
    :cond_4
    invoke-interface {v0}, Lpw3;->M()Llv3;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    if-eqz v2, :cond_6

    .line 149
    .line 150
    invoke-interface {v0}, Lpw3;->z()Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    const/16 p1, 0xc

    .line 155
    .line 156
    invoke-static {v2, v1, p0, v7, p1}, Lw45;->G(Llv3;Ljava/util/List;ZLjava/util/List;I)Lu1;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    new-instance v1, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    :goto_3
    if-ge v6, v0, :cond_5

    .line 170
    .line 171
    sget-object v3, Luw3;->c:Luw3;

    .line 172
    .line 173
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    add-int/lit8 v6, v6, 0x1

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_5
    invoke-static {v2, v1, v8, v7, p1}, Lw45;->G(Llv3;Ljava/util/List;ZLjava/util/List;I)Lu1;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    xor-int/2addr p2, v8

    .line 184
    invoke-static {p0, p1, p2}, Leu7;->e(Lpw3;Lpw3;Z)Lu1;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :cond_6
    const-string p2, "\'. The current type \'"

    .line 190
    .line 191
    const-string v0, "\' is not denotable"

    .line 192
    .line 193
    invoke-static {v4, p1, p2, p0, v0}, Lxw3;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-object v7

    .line 197
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string p1, "\'. \'"

    .line 206
    .line 207
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    const-string v0, "\' params ("

    .line 222
    .line 223
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string p0, ") vs args ("

    .line 230
    .line 231
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string p0, ") mismatch."

    .line 238
    .line 239
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 247
    .line 248
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1
.end method

.method public static final w(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static final x(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    :goto_0
    if-lez p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static y(Ljava/lang/Exception;)I
    .locals 6

    .line 1
    instance-of v0, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xb

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v3, 0x3

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eq v0, v4, :cond_4

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eq v0, v5, :cond_3

    .line 20
    .line 21
    if-eq v0, v3, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    return v5

    .line 34
    :cond_1
    return v4

    .line 35
    :cond_2
    return v1

    .line 36
    :cond_3
    const/4 p0, 0x6

    .line 37
    return p0

    .line 38
    :cond_4
    return v3

    .line 39
    :cond_5
    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    if-eqz v0, :cond_6

    .line 42
    .line 43
    const/4 p0, 0x7

    .line 44
    return p0

    .line 45
    :cond_6
    instance-of v0, p0, Ljava/lang/SecurityException;

    .line 46
    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    const/16 p0, 0x8

    .line 50
    .line 51
    return p0

    .line 52
    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v3, 0x1c

    .line 55
    .line 56
    if-ne v0, v3, :cond_a

    .line 57
    .line 58
    instance-of v0, p0, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    if-nez v0, :cond_8

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_8
    move-object v0, p0

    .line 64
    check-cast v0, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    array-length v3, v0

    .line 74
    if-nez v3, :cond_9

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    goto :goto_0

    .line 78
    :cond_9
    aget-object v0, v0, v1

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_0
    const-string v1, "_enableShutterSound"

    .line 85
    .line 86
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    :goto_1
    if-eqz v1, :cond_a

    .line 91
    .line 92
    const/16 p0, 0xa

    .line 93
    .line 94
    return p0

    .line 95
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    return v2
.end method

.method public static final z(Ltr4;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p0}, Ltr4;->w()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Ld34;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Ld34;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Ld34;->q0:Ljava/lang/Object;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    return-object v1
.end method

.class public final Lcl7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final k0:Lqv;

.field public static final l0:Lqv;

.field public static final m0:Lqv;

.field public static final n0:Lqv;

.field public static final o0:Lqv;

.field public static final p0:Ljava/util/List;

.field public static final q0:Lmv4;

.field public static final r0:Ljava/util/List;

.field public static final s0:Lmv4;


# instance fields
.field public final X:Lhi0;

.field public final Y:Ljava/util/LinkedHashMap;

.field public final Z:Ljava/util/List;

.field public final f0:Ljava/util/LinkedHashMap;

.field public final g0:Lip4;

.field public final h0:Ljava/util/List;

.field public final i0:Ljava/util/ArrayList;

.field public final j0:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sput-object v1, Lcl7;->k0:Lqv;

    .line 7
    .line 8
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Lcl7;->l0:Lqv;

    .line 13
    .line 14
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lcl7;->m0:Lqv;

    .line 19
    .line 20
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sput-object v1, Lcl7;->n0:Lqv;

    .line 25
    .line 26
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sput-object v1, Lcl7;->o0:Lqv;

    .line 31
    .line 32
    sget-object v1, Llh4;->o0:Llh4;

    .line 33
    .line 34
    sget-object v2, Llh4;->p0:Llh4;

    .line 35
    .line 36
    filled-new-array {v1, v2}, [Llh4;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lcl7;->p0:Ljava/util/List;

    .line 45
    .line 46
    new-instance v1, Lmv4;

    .line 47
    .line 48
    const/16 v2, 0x8

    .line 49
    .line 50
    invoke-direct {v1, v2}, Lmv4;-><init>(B)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lcl7;->q0:Lmv4;

    .line 54
    .line 55
    new-instance v1, Lyk7;

    .line 56
    .line 57
    invoke-direct {v1, v0}, Lyk7;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lyk7;

    .line 61
    .line 62
    const/16 v2, 0x22

    .line 63
    .line 64
    invoke-direct {v0, v2}, Lyk7;-><init>(I)V

    .line 65
    .line 66
    .line 67
    filled-new-array {v1, v0}, [Lyk7;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lcl7;->r0:Ljava/util/List;

    .line 76
    .line 77
    new-instance v0, Lmv4;

    .line 78
    .line 79
    const/16 v1, 0x9

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lmv4;-><init>(B)V

    .line 82
    .line 83
    .line 84
    sput-object v0, Lcl7;->s0:Lmv4;

    .line 85
    .line 86
    return-void
.end method

.method public constructor <init>(Ljj0;Lhi0;Lk32;Lyr2;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lcl7;->X:Lhi0;

    .line 15
    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v7, 0x1a

    .line 39
    .line 40
    if-lt v6, v7, :cond_4

    .line 41
    .line 42
    iget v7, v1, Lhi0;->h:I

    .line 43
    .line 44
    if-nez v7, :cond_4

    .line 45
    .line 46
    sget-object v7, Ljj0;->h:Lij0;

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, Lij0;->c(Ljj0;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-nez v7, :cond_4

    .line 56
    .line 57
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-object/from16 v9, p1

    .line 63
    .line 64
    check-cast v9, Llf0;

    .line 65
    .line 66
    invoke-virtual {v9, v7}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, Ljava/lang/Integer;

    .line 71
    .line 72
    if-nez v10, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-nez v10, :cond_1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    :goto_0
    const/16 v10, 0x1c

    .line 83
    .line 84
    if-lt v6, v10, :cond_3

    .line 85
    .line 86
    invoke-virtual {v9, v7}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/Integer;

    .line 91
    .line 92
    if-nez v6, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const/4 v7, 0x4

    .line 100
    if-ne v6, v7, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    :goto_1
    const/4 v6, 0x1

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    :goto_2
    const/4 v6, 0x0

    .line 106
    :goto_3
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-object v1, v1, Lhi0;->c:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    const/4 v10, 0x0

    .line 122
    if-eqz v9, :cond_c

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    const-string v12, "Check failed."

    .line 135
    .line 136
    if-nez v11, :cond_b

    .line 137
    .line 138
    iget-object v11, v0, Lcl7;->X:Lhi0;

    .line 139
    .line 140
    iget-object v11, v11, Lhi0;->b:Ljava/util/List;

    .line 141
    .line 142
    new-instance v13, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_6

    .line 156
    .line 157
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    check-cast v14, Lel0;

    .line 162
    .line 163
    iget-object v14, v14, Lel0;->a:Ljava/util/List;

    .line 164
    .line 165
    invoke-static {v13, v14}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_6
    new-instance v11, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_7

    .line 183
    .line 184
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_7
    new-instance v13, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    if-nez v14, :cond_a

    .line 202
    .line 203
    sget-object v11, Lcl7;->o0:Lqv;

    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    sget-object v14, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 209
    .line 210
    invoke-virtual {v14, v11}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    :goto_6
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    if-eqz v15, :cond_8

    .line 223
    .line 224
    sget-object v14, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 225
    .line 226
    invoke-virtual {v14, v11}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    goto :goto_6

    .line 231
    :cond_8
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    if-eqz v11, :cond_5

    .line 240
    .line 241
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    check-cast v11, Lel0;

    .line 246
    .line 247
    invoke-interface {v7, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v13

    .line 251
    if-nez v13, :cond_9

    .line 252
    .line 253
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v13

    .line 257
    invoke-interface {v7, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_9
    invoke-static {v12}, Lbt;->i(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v10

    .line 265
    :cond_a
    invoke-static {v11}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    throw v0

    .line 270
    :cond_b
    invoke-static {v12}, Lbt;->i(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v10

    .line 274
    :cond_c
    iget-object v1, v0, Lcl7;->X:Lhi0;

    .line 275
    .line 276
    iget-object v1, v1, Lhi0;->b:Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_12

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    check-cast v9, Lel0;

    .line 293
    .line 294
    iget-object v11, v9, Lel0;->a:Ljava/util/List;

    .line 295
    .line 296
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-eqz v12, :cond_d

    .line 305
    .line 306
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    check-cast v12, Lze5;

    .line 311
    .line 312
    invoke-interface {v3, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v13

    .line 316
    if-eqz v13, :cond_e

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_e
    sget-object v13, Lcl7;->n0:Lqv;

    .line 320
    .line 321
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    sget-object v14, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 325
    .line 326
    invoke-virtual {v14, v13}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 327
    .line 328
    .line 329
    move-result v16

    .line 330
    iget-object v13, v12, Lze5;->a:Landroid/util/Size;

    .line 331
    .line 332
    iget v14, v12, Lze5;->b:I

    .line 333
    .line 334
    iget-object v15, v12, Lze5;->c:Ljava/lang/String;

    .line 335
    .line 336
    if-nez v15, :cond_f

    .line 337
    .line 338
    iget-object v15, v0, Lcl7;->X:Lhi0;

    .line 339
    .line 340
    iget-object v15, v15, Lhi0;->a:Ljava/lang/String;

    .line 341
    .line 342
    :cond_f
    move-object/from16 v19, v15

    .line 343
    .line 344
    invoke-virtual {v7, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v15

    .line 348
    move-object/from16 v20, v15

    .line 349
    .line 350
    check-cast v20, Ljava/lang/Integer;

    .line 351
    .line 352
    if-eqz v6, :cond_11

    .line 353
    .line 354
    instance-of v15, v12, Lxe5;

    .line 355
    .line 356
    if-eqz v15, :cond_10

    .line 357
    .line 358
    move-object v15, v12

    .line 359
    check-cast v15, Lxe5;

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_10
    move-object v15, v10

    .line 363
    :goto_9
    if-eqz v15, :cond_11

    .line 364
    .line 365
    iget-object v15, v15, Lxe5;->i:Llh4;

    .line 366
    .line 367
    move-object/from16 v21, v15

    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_11
    move-object/from16 v21, v10

    .line 371
    .line 372
    :goto_a
    iget-object v15, v12, Lze5;->d:Lbf5;

    .line 373
    .line 374
    iget-object v8, v12, Lze5;->e:Laf5;

    .line 375
    .line 376
    iget-object v10, v12, Lze5;->f:Lcf5;

    .line 377
    .line 378
    move-object/from16 p2, v1

    .line 379
    .line 380
    iget-object v1, v12, Lze5;->g:Ldf5;

    .line 381
    .line 382
    move-object/from16 v25, v1

    .line 383
    .line 384
    iget-object v1, v12, Lze5;->h:Ljava/util/List;

    .line 385
    .line 386
    move-object/from16 v22, v15

    .line 387
    .line 388
    new-instance v15, Lal7;

    .line 389
    .line 390
    move-object/from16 v26, v1

    .line 391
    .line 392
    move-object/from16 v23, v8

    .line 393
    .line 394
    move-object/from16 v24, v10

    .line 395
    .line 396
    move-object/from16 v17, v13

    .line 397
    .line 398
    move/from16 v18, v14

    .line 399
    .line 400
    invoke-direct/range {v15 .. v26}, Lal7;-><init>(ILandroid/util/Size;ILjava/lang/String;Ljava/lang/Integer;Llh4;Lbf5;Laf5;Lcf5;Ldf5;Ljava/util/List;)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v3, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-object/from16 v1, p2

    .line 410
    .line 411
    const/4 v10, 0x0

    .line 412
    goto :goto_8

    .line 413
    :cond_12
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 414
    .line 415
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 416
    .line 417
    .line 418
    iget-object v6, v0, Lcl7;->X:Lhi0;

    .line 419
    .line 420
    iget-object v6, v6, Lhi0;->b:Ljava/util/List;

    .line 421
    .line 422
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    const/4 v7, 0x0

    .line 427
    :goto_b
    iget-object v8, v0, Lcl7;->X:Lhi0;

    .line 428
    .line 429
    const/16 v9, 0xa

    .line 430
    .line 431
    if-ge v7, v6, :cond_16

    .line 432
    .line 433
    iget-object v8, v8, Lhi0;->b:Ljava/util/List;

    .line 434
    .line 435
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    check-cast v8, Lel0;

    .line 440
    .line 441
    iget-object v10, v8, Lel0;->a:Ljava/util/List;

    .line 442
    .line 443
    new-instance v11, Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-static {v10, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 446
    .line 447
    .line 448
    move-result v9

    .line 449
    invoke-direct {v11, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v10

    .line 460
    if-eqz v10, :cond_13

    .line 461
    .line 462
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    check-cast v10, Lze5;

    .line 467
    .line 468
    invoke-virtual {v3, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    check-cast v10, Lal7;

    .line 476
    .line 477
    new-instance v12, Lbl7;

    .line 478
    .line 479
    sget-object v13, Lcl7;->l0:Lqv;

    .line 480
    .line 481
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    sget-object v14, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 485
    .line 486
    invoke-virtual {v14, v13}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 487
    .line 488
    .line 489
    move-result v13

    .line 490
    iget-object v14, v10, Lal7;->b:Landroid/util/Size;

    .line 491
    .line 492
    move-object/from16 v20, v14

    .line 493
    .line 494
    iget v14, v10, Lal7;->c:I

    .line 495
    .line 496
    iget-object v15, v10, Lal7;->d:Ljava/lang/String;

    .line 497
    .line 498
    move/from16 p1, v6

    .line 499
    .line 500
    iget-object v6, v10, Lal7;->g:Lbf5;

    .line 501
    .line 502
    move-object/from16 v17, v6

    .line 503
    .line 504
    iget-object v6, v10, Lal7;->h:Laf5;

    .line 505
    .line 506
    move-object/from16 v16, v6

    .line 507
    .line 508
    iget-object v6, v10, Lal7;->i:Lcf5;

    .line 509
    .line 510
    move-object/from16 v21, v15

    .line 511
    .line 512
    iget-object v15, v10, Lal7;->f:Llh4;

    .line 513
    .line 514
    move-object/from16 v18, v6

    .line 515
    .line 516
    iget-object v6, v10, Lal7;->j:Ldf5;

    .line 517
    .line 518
    move-object/from16 v19, v6

    .line 519
    .line 520
    invoke-direct/range {v12 .. v21}, Lbl7;-><init>(IILlh4;Laf5;Lbf5;Lcf5;Ldf5;Landroid/util/Size;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-interface {v1, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move/from16 v6, p1

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_13
    move/from16 p1, v6

    .line 533
    .line 534
    new-instance v6, Lfl0;

    .line 535
    .line 536
    sget-object v9, Lcl7;->k0:Lqv;

    .line 537
    .line 538
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    sget-object v10, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 542
    .line 543
    invoke-virtual {v10, v9}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 544
    .line 545
    .line 546
    move-result v9

    .line 547
    invoke-direct {v6, v9, v11}, Lfl0;-><init>(ILjava/util/ArrayList;)V

    .line 548
    .line 549
    .line 550
    invoke-interface {v5, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v9

    .line 560
    :goto_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v10

    .line 564
    if-eqz v10, :cond_14

    .line 565
    .line 566
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v10

    .line 570
    check-cast v10, Lbl7;

    .line 571
    .line 572
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    iput-object v6, v10, Lbl7;->j:Lfl0;

    .line 576
    .line 577
    goto :goto_d

    .line 578
    :cond_14
    iget-object v8, v8, Lel0;->a:Ljava/util/List;

    .line 579
    .line 580
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v9

    .line 588
    if-eqz v9, :cond_15

    .line 589
    .line 590
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    check-cast v9, Lze5;

    .line 595
    .line 596
    invoke-virtual {v3, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    check-cast v9, Lal7;

    .line 604
    .line 605
    iget-object v9, v9, Lal7;->l:Ljava/util/ArrayList;

    .line 606
    .line 607
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    goto :goto_e

    .line 611
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 612
    .line 613
    move/from16 v6, p1

    .line 614
    .line 615
    goto/16 :goto_b

    .line 616
    .line 617
    :cond_16
    iget-object v3, v8, Lhi0;->d:Ljava/util/ArrayList;

    .line 618
    .line 619
    if-eqz v3, :cond_17

    .line 620
    .line 621
    new-instance v6, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-static {v3, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 624
    .line 625
    .line 626
    move-result v7

    .line 627
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 628
    .line 629
    .line 630
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v3

    .line 634
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    if-eqz v7, :cond_18

    .line 639
    .line 640
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v7

    .line 644
    check-cast v7, Lbe3;

    .line 645
    .line 646
    new-instance v8, Lzk7;

    .line 647
    .line 648
    sget-object v10, Lcl7;->m0:Lqv;

    .line 649
    .line 650
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    sget-object v11, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 654
    .line 655
    invoke-virtual {v11, v10}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 656
    .line 657
    .line 658
    move-result v10

    .line 659
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    iget v7, v7, Lbe3;->b:I

    .line 663
    .line 664
    invoke-direct {v8, v10, v7}, Lzk7;-><init>(II)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    goto :goto_f

    .line 671
    :cond_17
    sget-object v6, Ld02;->X:Ld02;

    .line 672
    .line 673
    :cond_18
    iput-object v6, v0, Lcl7;->h0:Ljava/util/List;

    .line 674
    .line 675
    new-instance v3, Ljava/util/ArrayList;

    .line 676
    .line 677
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 678
    .line 679
    .line 680
    new-instance v6, Ljava/util/ArrayList;

    .line 681
    .line 682
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v8

    .line 693
    const-wide/16 v10, 0x1

    .line 694
    .line 695
    if-eqz v8, :cond_1d

    .line 696
    .line 697
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v8

    .line 701
    move-object v12, v8

    .line 702
    check-cast v12, Lfl0;

    .line 703
    .line 704
    iget-object v12, v12, Lfl0;->b:Ljava/util/ArrayList;

    .line 705
    .line 706
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 707
    .line 708
    .line 709
    move-result v13

    .line 710
    if-eqz v13, :cond_19

    .line 711
    .line 712
    goto :goto_12

    .line 713
    :cond_19
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 714
    .line 715
    .line 716
    move-result-object v12

    .line 717
    :cond_1a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 718
    .line 719
    .line 720
    move-result v13

    .line 721
    if-eqz v13, :cond_1c

    .line 722
    .line 723
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v13

    .line 727
    check-cast v13, Lbl7;

    .line 728
    .line 729
    iget-object v13, v13, Lbl7;->g:Lcf5;

    .line 730
    .line 731
    if-nez v13, :cond_1b

    .line 732
    .line 733
    const/4 v13, 0x0

    .line 734
    goto :goto_11

    .line 735
    :cond_1b
    iget-wide v13, v13, Lcf5;->a:J

    .line 736
    .line 737
    invoke-static {v13, v14, v10, v11}, Lcf5;->a(JJ)Z

    .line 738
    .line 739
    .line 740
    move-result v13

    .line 741
    :goto_11
    if-eqz v13, :cond_1a

    .line 742
    .line 743
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    goto :goto_10

    .line 747
    :cond_1c
    :goto_12
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_10

    .line 751
    :cond_1d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 752
    .line 753
    .line 754
    move-result v7

    .line 755
    if-nez v7, :cond_1e

    .line 756
    .line 757
    invoke-static {v3, v6}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    goto/16 :goto_17

    .line 762
    .line 763
    :cond_1e
    new-instance v3, Ljava/util/ArrayList;

    .line 764
    .line 765
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 766
    .line 767
    .line 768
    new-instance v6, Ljava/util/ArrayList;

    .line 769
    .line 770
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 774
    .line 775
    .line 776
    move-result-object v7

    .line 777
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 778
    .line 779
    .line 780
    move-result v8

    .line 781
    if-eqz v8, :cond_22

    .line 782
    .line 783
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    move-object v12, v8

    .line 788
    check-cast v12, Lfl0;

    .line 789
    .line 790
    iget-object v12, v12, Lfl0;->b:Ljava/util/ArrayList;

    .line 791
    .line 792
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 793
    .line 794
    .line 795
    move-result v13

    .line 796
    if-eqz v13, :cond_1f

    .line 797
    .line 798
    goto :goto_14

    .line 799
    :cond_1f
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v12

    .line 803
    :cond_20
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v13

    .line 807
    if-eqz v13, :cond_21

    .line 808
    .line 809
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v13

    .line 813
    check-cast v13, Lbl7;

    .line 814
    .line 815
    sget-object v14, Lcl7;->p0:Ljava/util/List;

    .line 816
    .line 817
    iget-object v13, v13, Lbl7;->h:Llh4;

    .line 818
    .line 819
    invoke-static {v14, v13}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v13

    .line 823
    if-eqz v13, :cond_20

    .line 824
    .line 825
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    goto :goto_13

    .line 829
    :cond_21
    :goto_14
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    goto :goto_13

    .line 833
    :cond_22
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 834
    .line 835
    .line 836
    move-result v7

    .line 837
    if-nez v7, :cond_23

    .line 838
    .line 839
    sget-object v4, Lcl7;->q0:Lmv4;

    .line 840
    .line 841
    invoke-static {v3, v4}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    invoke-static {v3, v6}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    goto :goto_17

    .line 850
    :cond_23
    new-instance v3, Ljava/util/ArrayList;

    .line 851
    .line 852
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 853
    .line 854
    .line 855
    new-instance v6, Ljava/util/ArrayList;

    .line 856
    .line 857
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 861
    .line 862
    .line 863
    move-result-object v7

    .line 864
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 865
    .line 866
    .line 867
    move-result v8

    .line 868
    if-eqz v8, :cond_27

    .line 869
    .line 870
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v8

    .line 874
    move-object v12, v8

    .line 875
    check-cast v12, Lfl0;

    .line 876
    .line 877
    iget-object v12, v12, Lfl0;->b:Ljava/util/ArrayList;

    .line 878
    .line 879
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 880
    .line 881
    .line 882
    move-result v13

    .line 883
    if-eqz v13, :cond_24

    .line 884
    .line 885
    goto :goto_16

    .line 886
    :cond_24
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 887
    .line 888
    .line 889
    move-result-object v12

    .line 890
    :cond_25
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 891
    .line 892
    .line 893
    move-result v13

    .line 894
    if-eqz v13, :cond_26

    .line 895
    .line 896
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v13

    .line 900
    check-cast v13, Lbl7;

    .line 901
    .line 902
    iget v13, v13, Lbl7;->c:I

    .line 903
    .line 904
    new-instance v14, Lyk7;

    .line 905
    .line 906
    invoke-direct {v14, v13}, Lyk7;-><init>(I)V

    .line 907
    .line 908
    .line 909
    sget-object v13, Lcl7;->r0:Ljava/util/List;

    .line 910
    .line 911
    invoke-interface {v13, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v13

    .line 915
    if-eqz v13, :cond_25

    .line 916
    .line 917
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    goto :goto_15

    .line 921
    :cond_26
    :goto_16
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    goto :goto_15

    .line 925
    :cond_27
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 926
    .line 927
    .line 928
    move-result v7

    .line 929
    if-nez v7, :cond_28

    .line 930
    .line 931
    sget-object v4, Lcl7;->s0:Lmv4;

    .line 932
    .line 933
    invoke-static {v3, v4}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-static {v3, v6}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    :cond_28
    :goto_17
    new-instance v3, Ljava/util/ArrayList;

    .line 942
    .line 943
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 944
    .line 945
    .line 946
    new-instance v6, Ljava/util/ArrayList;

    .line 947
    .line 948
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 949
    .line 950
    .line 951
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 952
    .line 953
    .line 954
    move-result-object v7

    .line 955
    :goto_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 956
    .line 957
    .line 958
    move-result v8

    .line 959
    if-eqz v8, :cond_2d

    .line 960
    .line 961
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    move-object v12, v8

    .line 966
    check-cast v12, Lfl0;

    .line 967
    .line 968
    iget-object v12, v12, Lfl0;->b:Ljava/util/ArrayList;

    .line 969
    .line 970
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 971
    .line 972
    .line 973
    move-result v13

    .line 974
    if-eqz v13, :cond_29

    .line 975
    .line 976
    goto :goto_1b

    .line 977
    :cond_29
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 978
    .line 979
    .line 980
    move-result-object v12

    .line 981
    :goto_19
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 982
    .line 983
    .line 984
    move-result v13

    .line 985
    if-eqz v13, :cond_2c

    .line 986
    .line 987
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v13

    .line 991
    check-cast v13, Lbl7;

    .line 992
    .line 993
    iget-object v13, v13, Lbl7;->g:Lcf5;

    .line 994
    .line 995
    if-nez v13, :cond_2a

    .line 996
    .line 997
    const/4 v9, 0x0

    .line 998
    goto :goto_1a

    .line 999
    :cond_2a
    iget-wide v13, v13, Lcf5;->a:J

    .line 1000
    .line 1001
    const-wide/16 v9, 0x3

    .line 1002
    .line 1003
    invoke-static {v13, v14, v9, v10}, Lcf5;->a(JJ)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v9

    .line 1007
    :goto_1a
    if-eqz v9, :cond_2b

    .line 1008
    .line 1009
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    goto :goto_1c

    .line 1013
    :cond_2b
    const/16 v9, 0xa

    .line 1014
    .line 1015
    const-wide/16 v10, 0x1

    .line 1016
    .line 1017
    goto :goto_19

    .line 1018
    :cond_2c
    :goto_1b
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    :goto_1c
    const/16 v9, 0xa

    .line 1022
    .line 1023
    const-wide/16 v10, 0x1

    .line 1024
    .line 1025
    goto :goto_18

    .line 1026
    :cond_2d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v7

    .line 1030
    if-nez v7, :cond_2e

    .line 1031
    .line 1032
    invoke-static {v6, v3}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    goto :goto_20

    .line 1037
    :cond_2e
    new-instance v3, Ljava/util/ArrayList;

    .line 1038
    .line 1039
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    new-instance v6, Ljava/util/ArrayList;

    .line 1043
    .line 1044
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1045
    .line 1046
    .line 1047
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v7

    .line 1051
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1052
    .line 1053
    .line 1054
    move-result v8

    .line 1055
    if-eqz v8, :cond_33

    .line 1056
    .line 1057
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v8

    .line 1061
    move-object v9, v8

    .line 1062
    check-cast v9, Lfl0;

    .line 1063
    .line 1064
    iget-object v9, v9, Lfl0;->b:Ljava/util/ArrayList;

    .line 1065
    .line 1066
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v10

    .line 1070
    if-eqz v10, :cond_30

    .line 1071
    .line 1072
    :cond_2f
    const-wide/16 v12, 0x1

    .line 1073
    .line 1074
    goto :goto_1f

    .line 1075
    :cond_30
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v9

    .line 1079
    :cond_31
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1080
    .line 1081
    .line 1082
    move-result v10

    .line 1083
    if-eqz v10, :cond_2f

    .line 1084
    .line 1085
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v10

    .line 1089
    check-cast v10, Lbl7;

    .line 1090
    .line 1091
    iget-object v10, v10, Lbl7;->i:Ldf5;

    .line 1092
    .line 1093
    if-nez v10, :cond_32

    .line 1094
    .line 1095
    const/4 v10, 0x0

    .line 1096
    const-wide/16 v12, 0x1

    .line 1097
    .line 1098
    goto :goto_1e

    .line 1099
    :cond_32
    iget-wide v10, v10, Ldf5;->a:J

    .line 1100
    .line 1101
    const-wide/16 v12, 0x1

    .line 1102
    .line 1103
    invoke-static {v10, v11, v12, v13}, Ldf5;->a(JJ)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v10

    .line 1107
    :goto_1e
    if-eqz v10, :cond_31

    .line 1108
    .line 1109
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    goto :goto_1d

    .line 1113
    :goto_1f
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    goto :goto_1d

    .line 1117
    :cond_33
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v7

    .line 1121
    if-nez v7, :cond_34

    .line 1122
    .line 1123
    invoke-static {v6, v3}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v4

    .line 1127
    :cond_34
    :goto_20
    iput-object v4, v0, Lcl7;->i0:Ljava/util/ArrayList;

    .line 1128
    .line 1129
    new-instance v3, Ljava/util/ArrayList;

    .line 1130
    .line 1131
    const/16 v6, 0xa

    .line 1132
    .line 1133
    invoke-static {v4, v6}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 1134
    .line 1135
    .line 1136
    move-result v6

    .line 1137
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1138
    .line 1139
    .line 1140
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v4

    .line 1144
    :goto_21
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v6

    .line 1148
    if-eqz v6, :cond_35

    .line 1149
    .line 1150
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v6

    .line 1154
    check-cast v6, Lfl0;

    .line 1155
    .line 1156
    iget v6, v6, Lfl0;->a:I

    .line 1157
    .line 1158
    new-instance v7, Ldl7;

    .line 1159
    .line 1160
    invoke-direct {v7, v6}, Ldl7;-><init>(I)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    goto :goto_21

    .line 1167
    :cond_35
    invoke-static {v3}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1168
    .line 1169
    .line 1170
    iput-object v5, v0, Lcl7;->Y:Ljava/util/LinkedHashMap;

    .line 1171
    .line 1172
    new-instance v3, Lx72;

    .line 1173
    .line 1174
    const/4 v4, 0x5

    .line 1175
    invoke-direct {v3, v0, v4}, Lx72;-><init>(Ljava/lang/Object;B)V

    .line 1176
    .line 1177
    .line 1178
    invoke-static {v2, v3}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    iput-object v2, v0, Lcl7;->Z:Ljava/util/List;

    .line 1183
    .line 1184
    iput-object v1, v0, Lcl7;->f0:Ljava/util/LinkedHashMap;

    .line 1185
    .line 1186
    iget-object v1, v0, Lcl7;->i0:Ljava/util/ArrayList;

    .line 1187
    .line 1188
    new-instance v2, Ljava/util/ArrayList;

    .line 1189
    .line 1190
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1191
    .line 1192
    .line 1193
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1198
    .line 1199
    .line 1200
    move-result v3

    .line 1201
    if-eqz v3, :cond_36

    .line 1202
    .line 1203
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v3

    .line 1207
    check-cast v3, Lfl0;

    .line 1208
    .line 1209
    iget-object v3, v3, Lfl0;->b:Ljava/util/ArrayList;

    .line 1210
    .line 1211
    invoke-static {v2, v3}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_22

    .line 1215
    :cond_36
    iput-object v2, v0, Lcl7;->j0:Ljava/util/ArrayList;

    .line 1216
    .line 1217
    new-instance v1, Lip4;

    .line 1218
    .line 1219
    invoke-direct {v1}, Lip4;-><init>()V

    .line 1220
    .line 1221
    .line 1222
    iget-object v2, v0, Lcl7;->X:Lhi0;

    .line 1223
    .line 1224
    iget-object v2, v2, Lhi0;->b:Ljava/util/List;

    .line 1225
    .line 1226
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    :goto_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v3

    .line 1234
    if-eqz v3, :cond_37

    .line 1235
    .line 1236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v3

    .line 1240
    check-cast v3, Lel0;

    .line 1241
    .line 1242
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    goto :goto_23

    .line 1246
    :cond_37
    invoke-virtual {v1}, Lip4;->b()Lip4;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    iput-object v1, v0, Lcl7;->g0:Lip4;

    .line 1251
    .line 1252
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 1
    iget-object p0, p0, Lcl7;->g0:Lip4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lip4;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkp4;

    .line 8
    .line 9
    invoke-virtual {p0}, Lkp4;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lo63;

    .line 24
    .line 25
    instance-of v1, v0, Ljava/lang/AutoCloseable;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lo63;->close()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v1, v0, Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    :cond_3
    :goto_1
    if-nez v1, :cond_4

    .line 57
    .line 58
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 59
    .line 60
    const-wide/16 v4, 0x1

    .line 61
    .line 62
    invoke-interface {v0, v4, v5, v3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 63
    .line 64
    .line 65
    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_1

    .line 67
    :catch_0
    if-nez v2, :cond_3

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    if-eqz v2, :cond_0

    .line 75
    .line 76
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    invoke-static {}, Lkp5;->e()V

    .line 85
    .line 86
    .line 87
    :cond_6
    return-void
.end method

.method public final g(I)Lfl0;
    .locals 2

    .line 1
    iget-object p0, p0, Lcl7;->i0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lfl0;

    .line 19
    .line 20
    iget v1, v1, Lfl0;->a:I

    .line 21
    .line 22
    if-ne v1, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    check-cast v0, Lfl0;

    .line 27
    .line 28
    return-object v0
.end method

.method public final k(I)Lel0;
    .locals 3

    .line 1
    iget-object p0, p0, Lcl7;->Y:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v2, v0

    .line 25
    check-cast v2, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lfl0;

    .line 32
    .line 33
    iget v2, v2, Lfl0;->a:I

    .line 34
    .line 35
    if-ne v2, p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v1

    .line 39
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lel0;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "StreamGraph("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcl7;->Y:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

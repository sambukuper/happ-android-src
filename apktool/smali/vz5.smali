.class public final Lvz5;
.super Lyp2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final p0:Lvz5;

.field public static final q0:Lau3;


# instance fields
.field public final Y:Ljb0;

.field public Z:I

.field public f0:I

.field public g0:I

.field public h0:Lnz5;

.field public i0:I

.field public j0:Lnz5;

.field public k0:I

.field public l0:Ljava/util/List;

.field public m0:Lzx5;

.field public n0:B

.field public o0:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lau3;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lau3;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvz5;->q0:Lau3;

    .line 9
    .line 10
    new-instance v0, Lvz5;

    .line 11
    .line 12
    invoke-direct {v0}, Lvz5;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lvz5;->p0:Lvz5;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lvz5;->f0:I

    .line 19
    .line 20
    iput v1, v0, Lvz5;->g0:I

    .line 21
    .line 22
    sget-object v2, Lnz5;->w0:Lnz5;

    .line 23
    .line 24
    iput-object v2, v0, Lvz5;->h0:Lnz5;

    .line 25
    .line 26
    iput v1, v0, Lvz5;->i0:I

    .line 27
    .line 28
    iput-object v2, v0, Lvz5;->j0:Lnz5;

    .line 29
    .line 30
    iput v1, v0, Lvz5;->k0:I

    .line 31
    .line 32
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iput-object v1, v0, Lvz5;->l0:Ljava/util/List;

    .line 35
    .line 36
    sget-object v1, Lzx5;->r0:Lzx5;

    .line 37
    .line 38
    iput-object v1, v0, Lvz5;->m0:Lzx5;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 393
    invoke-direct {p0}, Lyp2;-><init>()V

    const/4 v0, -0x1

    .line 394
    iput-byte v0, p0, Lvz5;->n0:B

    .line 395
    iput v0, p0, Lvz5;->o0:I

    .line 396
    sget-object v0, Ljb0;->X:Lmc4;

    iput-object v0, p0, Lvz5;->Y:Ljb0;

    return-void
.end method

.method public constructor <init>(Liv0;Lr62;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lyp2;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lvz5;->n0:B

    .line 6
    .line 7
    iput v0, p0, Lvz5;->o0:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lvz5;->f0:I

    .line 11
    .line 12
    iput v0, p0, Lvz5;->g0:I

    .line 13
    .line 14
    sget-object v1, Lnz5;->w0:Lnz5;

    .line 15
    .line 16
    iput-object v1, p0, Lvz5;->h0:Lnz5;

    .line 17
    .line 18
    iput v0, p0, Lvz5;->i0:I

    .line 19
    .line 20
    iput-object v1, p0, Lvz5;->j0:Lnz5;

    .line 21
    .line 22
    iput v0, p0, Lvz5;->k0:I

    .line 23
    .line 24
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    iput-object v1, p0, Lvz5;->l0:Ljava/util/List;

    .line 27
    .line 28
    sget-object v1, Lzx5;->r0:Lzx5;

    .line 29
    .line 30
    iput-object v1, p0, Lvz5;->m0:Lzx5;

    .line 31
    .line 32
    new-instance v1, Lib0;

    .line 33
    .line 34
    invoke-direct {v1}, Lib0;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-static {v1, v2}, Lnv0;->G(Ljava/io/OutputStream;I)Lnv0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move v4, v0

    .line 43
    :cond_0
    :goto_0
    const/16 v5, 0x40

    .line 44
    .line 45
    if-nez v0, :cond_12

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {p1}, Liv0;->n()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    if-eq v6, v7, :cond_10

    .line 56
    .line 57
    const/16 v8, 0x10

    .line 58
    .line 59
    if-eq v6, v8, :cond_f

    .line 60
    .line 61
    const/16 v9, 0x1a

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    if-eq v6, v9, :cond_c

    .line 65
    .line 66
    const/16 v9, 0x22

    .line 67
    .line 68
    if-eq v6, v9, :cond_9

    .line 69
    .line 70
    const/16 v8, 0x28

    .line 71
    .line 72
    if-eq v6, v8, :cond_8

    .line 73
    .line 74
    const/16 v7, 0x30

    .line 75
    .line 76
    if-eq v6, v7, :cond_7

    .line 77
    .line 78
    const/16 v7, 0x3a

    .line 79
    .line 80
    if-eq v6, v7, :cond_5

    .line 81
    .line 82
    const/16 v7, 0x42

    .line 83
    .line 84
    if-eq v6, v7, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0, p1, v3, p2, v6}, Lyp2;->n(Liv0;Lnv0;Lr62;I)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_0

    .line 91
    .line 92
    :cond_1
    move v0, v2

    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :catch_0
    move-exception p1

    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :catch_1
    move-exception p1

    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :cond_2
    iget v6, p0, Lvz5;->Z:I

    .line 104
    .line 105
    and-int/2addr v6, v5

    .line 106
    if-ne v6, v5, :cond_3

    .line 107
    .line 108
    iget-object v6, p0, Lvz5;->m0:Lzx5;

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lxx5;->g()Lxx5;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v10, v6}, Lxx5;->h(Lzx5;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    sget-object v6, Lzx5;->s0:Lau3;

    .line 121
    .line 122
    invoke-virtual {p1, v6, p2}, Liv0;->g(Lau3;Lr62;)Ld2;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Lzx5;

    .line 127
    .line 128
    iput-object v6, p0, Lvz5;->m0:Lzx5;

    .line 129
    .line 130
    if-eqz v10, :cond_4

    .line 131
    .line 132
    invoke-virtual {v10, v6}, Lxx5;->h(Lzx5;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10}, Lxx5;->f()Lzx5;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    iput-object v6, p0, Lvz5;->m0:Lzx5;

    .line 140
    .line 141
    :cond_4
    iget v6, p0, Lvz5;->Z:I

    .line 142
    .line 143
    or-int/2addr v6, v5

    .line 144
    iput v6, p0, Lvz5;->Z:I

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_5
    and-int/lit8 v6, v4, 0x40

    .line 148
    .line 149
    if-eq v6, v5, :cond_6

    .line 150
    .line 151
    new-instance v6, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object v6, p0, Lvz5;->l0:Ljava/util/List;

    .line 157
    .line 158
    move v4, v5

    .line 159
    :cond_6
    iget-object v6, p0, Lvz5;->l0:Ljava/util/List;

    .line 160
    .line 161
    sget-object v7, Lcy5;->j0:Lau3;

    .line 162
    .line 163
    invoke-virtual {p1, v7, p2}, Liv0;->g(Lau3;Lr62;)Ld2;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_7
    iget v6, p0, Lvz5;->Z:I

    .line 172
    .line 173
    or-int/lit8 v6, v6, 0x20

    .line 174
    .line 175
    iput v6, p0, Lvz5;->Z:I

    .line 176
    .line 177
    invoke-virtual {p1}, Liv0;->k()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    iput v6, p0, Lvz5;->k0:I

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_8
    iget v6, p0, Lvz5;->Z:I

    .line 186
    .line 187
    or-int/2addr v6, v7

    .line 188
    iput v6, p0, Lvz5;->Z:I

    .line 189
    .line 190
    invoke-virtual {p1}, Liv0;->k()I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    iput v6, p0, Lvz5;->i0:I

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_9
    iget v6, p0, Lvz5;->Z:I

    .line 199
    .line 200
    and-int/2addr v6, v8

    .line 201
    if-ne v6, v8, :cond_a

    .line 202
    .line 203
    iget-object v6, p0, Lvz5;->j0:Lnz5;

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {v6}, Lnz5;->r(Lnz5;)Lmz5;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    :cond_a
    sget-object v6, Lnz5;->x0:Lau3;

    .line 213
    .line 214
    invoke-virtual {p1, v6, p2}, Liv0;->g(Lau3;Lr62;)Ld2;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    check-cast v6, Lnz5;

    .line 219
    .line 220
    iput-object v6, p0, Lvz5;->j0:Lnz5;

    .line 221
    .line 222
    if-eqz v10, :cond_b

    .line 223
    .line 224
    invoke-virtual {v10, v6}, Lmz5;->i(Lnz5;)Lmz5;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10}, Lmz5;->g()Lnz5;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    iput-object v6, p0, Lvz5;->j0:Lnz5;

    .line 232
    .line 233
    :cond_b
    iget v6, p0, Lvz5;->Z:I

    .line 234
    .line 235
    or-int/2addr v6, v8

    .line 236
    iput v6, p0, Lvz5;->Z:I

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_c
    iget v6, p0, Lvz5;->Z:I

    .line 241
    .line 242
    const/4 v7, 0x4

    .line 243
    and-int/2addr v6, v7

    .line 244
    if-ne v6, v7, :cond_d

    .line 245
    .line 246
    iget-object v6, p0, Lvz5;->h0:Lnz5;

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {v6}, Lnz5;->r(Lnz5;)Lmz5;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    :cond_d
    sget-object v6, Lnz5;->x0:Lau3;

    .line 256
    .line 257
    invoke-virtual {p1, v6, p2}, Liv0;->g(Lau3;Lr62;)Ld2;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, Lnz5;

    .line 262
    .line 263
    iput-object v6, p0, Lvz5;->h0:Lnz5;

    .line 264
    .line 265
    if-eqz v10, :cond_e

    .line 266
    .line 267
    invoke-virtual {v10, v6}, Lmz5;->i(Lnz5;)Lmz5;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10}, Lmz5;->g()Lnz5;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    iput-object v6, p0, Lvz5;->h0:Lnz5;

    .line 275
    .line 276
    :cond_e
    iget v6, p0, Lvz5;->Z:I

    .line 277
    .line 278
    or-int/2addr v6, v7

    .line 279
    iput v6, p0, Lvz5;->Z:I

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_f
    iget v6, p0, Lvz5;->Z:I

    .line 284
    .line 285
    or-int/lit8 v6, v6, 0x2

    .line 286
    .line 287
    iput v6, p0, Lvz5;->Z:I

    .line 288
    .line 289
    invoke-virtual {p1}, Liv0;->k()I

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    iput v6, p0, Lvz5;->g0:I

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_10
    iget v6, p0, Lvz5;->Z:I

    .line 298
    .line 299
    or-int/2addr v6, v2

    .line 300
    iput v6, p0, Lvz5;->Z:I

    .line 301
    .line 302
    invoke-virtual {p1}, Liv0;->k()I

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    iput v6, p0, Lvz5;->f0:I
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :goto_1
    :try_start_1
    new-instance p2, Lrh3;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-direct {p2, p1}, Lrh3;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iput-object p0, p2, Lrh3;->X:Ld2;

    .line 320
    .line 321
    throw p2

    .line 322
    :goto_2
    iput-object p0, p1, Lrh3;->X:Ld2;

    .line 323
    .line 324
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    :goto_3
    and-int/lit8 p2, v4, 0x40

    .line 326
    .line 327
    if-ne p2, v5, :cond_11

    .line 328
    .line 329
    iget-object p2, p0, Lvz5;->l0:Ljava/util/List;

    .line 330
    .line 331
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object p2

    .line 335
    iput-object p2, p0, Lvz5;->l0:Ljava/util/List;

    .line 336
    .line 337
    :cond_11
    :try_start_2
    invoke-virtual {v3}, Lnv0;->R()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 338
    .line 339
    .line 340
    :catch_2
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    iput-object p2, p0, Lvz5;->Y:Ljb0;

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :catchall_1
    move-exception p1

    .line 348
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    iput-object p2, p0, Lvz5;->Y:Ljb0;

    .line 353
    .line 354
    throw p1

    .line 355
    :goto_4
    invoke-virtual {p0}, Lyp2;->m()V

    .line 356
    .line 357
    .line 358
    throw p1

    .line 359
    :cond_12
    and-int/lit8 p1, v4, 0x40

    .line 360
    .line 361
    if-ne p1, v5, :cond_13

    .line 362
    .line 363
    iget-object p1, p0, Lvz5;->l0:Ljava/util/List;

    .line 364
    .line 365
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    iput-object p1, p0, Lvz5;->l0:Ljava/util/List;

    .line 370
    .line 371
    :cond_13
    :try_start_3
    invoke-virtual {v3}, Lnv0;->R()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 372
    .line 373
    .line 374
    :catch_3
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    iput-object p1, p0, Lvz5;->Y:Ljb0;

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :catchall_2
    move-exception p1

    .line 382
    invoke-virtual {v1}, Lib0;->m()Ljb0;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    iput-object p2, p0, Lvz5;->Y:Ljb0;

    .line 387
    .line 388
    throw p1

    .line 389
    :goto_5
    invoke-virtual {p0}, Lyp2;->m()V

    .line 390
    .line 391
    .line 392
    return-void
.end method

.method public constructor <init>(Luz5;)V
    .locals 1

    .line 397
    invoke-direct {p0, p1}, Lyp2;-><init>(Lxp2;)V

    const/4 v0, -0x1

    .line 398
    iput-byte v0, p0, Lvz5;->n0:B

    .line 399
    iput v0, p0, Lvz5;->o0:I

    .line 400
    iget-object p1, p1, Lup2;->X:Ljb0;

    .line 401
    iput-object p1, p0, Lvz5;->Y:Ljb0;

    return-void
.end method


# virtual methods
.method public final a()Ld2;
    .locals 0

    .line 1
    sget-object p0, Lvz5;->p0:Lvz5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()I
    .locals 5

    .line 1
    iget v0, p0, Lvz5;->o0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lvz5;->Z:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lvz5;->f0:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lnv0;->l(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, Lvz5;->Z:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lvz5;->g0:I

    .line 29
    .line 30
    invoke-static {v3, v1}, Lnv0;->l(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Lvz5;->Z:I

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    and-int/2addr v1, v3

    .line 39
    if-ne v1, v3, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget-object v4, p0, Lvz5;->h0:Lnz5;

    .line 43
    .line 44
    invoke-static {v1, v4}, Lnv0;->n(ILd2;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    iget v1, p0, Lvz5;->Z:I

    .line 50
    .line 51
    const/16 v4, 0x10

    .line 52
    .line 53
    and-int/2addr v1, v4

    .line 54
    if-ne v1, v4, :cond_4

    .line 55
    .line 56
    iget-object v1, p0, Lvz5;->j0:Lnz5;

    .line 57
    .line 58
    invoke-static {v3, v1}, Lnv0;->n(ILd2;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v0, v1

    .line 63
    :cond_4
    iget v1, p0, Lvz5;->Z:I

    .line 64
    .line 65
    const/16 v3, 0x8

    .line 66
    .line 67
    and-int/2addr v1, v3

    .line 68
    if-ne v1, v3, :cond_5

    .line 69
    .line 70
    const/4 v1, 0x5

    .line 71
    iget v4, p0, Lvz5;->i0:I

    .line 72
    .line 73
    invoke-static {v1, v4}, Lnv0;->l(II)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    :cond_5
    iget v1, p0, Lvz5;->Z:I

    .line 79
    .line 80
    const/16 v4, 0x20

    .line 81
    .line 82
    and-int/2addr v1, v4

    .line 83
    if-ne v1, v4, :cond_6

    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    iget v4, p0, Lvz5;->k0:I

    .line 87
    .line 88
    invoke-static {v1, v4}, Lnv0;->l(II)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/2addr v0, v1

    .line 93
    :cond_6
    :goto_1
    iget-object v1, p0, Lvz5;->l0:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-ge v2, v1, :cond_7

    .line 100
    .line 101
    iget-object v1, p0, Lvz5;->l0:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ld2;

    .line 108
    .line 109
    const/4 v4, 0x7

    .line 110
    invoke-static {v4, v1}, Lnv0;->n(ILd2;)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v0, v1

    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    iget v1, p0, Lvz5;->Z:I

    .line 119
    .line 120
    const/16 v2, 0x40

    .line 121
    .line 122
    and-int/2addr v1, v2

    .line 123
    if-ne v1, v2, :cond_8

    .line 124
    .line 125
    iget-object v1, p0, Lvz5;->m0:Lzx5;

    .line 126
    .line 127
    invoke-static {v3, v1}, Lnv0;->n(ILd2;)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-int/2addr v0, v1

    .line 132
    :cond_8
    invoke-virtual {p0}, Lyp2;->j()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    add-int/2addr v1, v0

    .line 137
    iget-object v0, p0, Lvz5;->Y:Ljb0;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljb0;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/2addr v0, v1

    .line 144
    iput v0, p0, Lvz5;->o0:I

    .line 145
    .line 146
    return v0
.end method

.method public final c()Lup2;
    .locals 0

    .line 1
    invoke-static {}, Luz5;->h()Luz5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final d()Z
    .locals 5

    .line 1
    iget-byte v0, p0, Lvz5;->n0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v0, p0, Lvz5;->Z:I

    .line 12
    .line 13
    and-int/lit8 v3, v0, 0x2

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-ne v3, v4, :cond_8

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    and-int/2addr v0, v3

    .line 20
    if-ne v0, v3, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lvz5;->h0:Lnz5;

    .line 23
    .line 24
    invoke-virtual {v0}, Lnz5;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iput-byte v2, p0, Lvz5;->n0:B

    .line 31
    .line 32
    return v2

    .line 33
    :cond_2
    iget v0, p0, Lvz5;->Z:I

    .line 34
    .line 35
    const/16 v3, 0x10

    .line 36
    .line 37
    and-int/2addr v0, v3

    .line 38
    if-ne v0, v3, :cond_3

    .line 39
    .line 40
    iget-object v0, p0, Lvz5;->j0:Lnz5;

    .line 41
    .line 42
    invoke-virtual {v0}, Lnz5;->d()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    iput-byte v2, p0, Lvz5;->n0:B

    .line 49
    .line 50
    return v2

    .line 51
    :cond_3
    move v0, v2

    .line 52
    :goto_0
    iget-object v3, p0, Lvz5;->l0:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-ge v0, v3, :cond_5

    .line 59
    .line 60
    iget-object v3, p0, Lvz5;->l0:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lcy5;

    .line 67
    .line 68
    invoke-virtual {v3}, Lcy5;->d()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    iput-byte v2, p0, Lvz5;->n0:B

    .line 75
    .line 76
    return v2

    .line 77
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    iget v0, p0, Lvz5;->Z:I

    .line 81
    .line 82
    const/16 v3, 0x40

    .line 83
    .line 84
    and-int/2addr v0, v3

    .line 85
    if-ne v0, v3, :cond_6

    .line 86
    .line 87
    iget-object v0, p0, Lvz5;->m0:Lzx5;

    .line 88
    .line 89
    invoke-virtual {v0}, Lzx5;->d()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    iput-byte v2, p0, Lvz5;->n0:B

    .line 96
    .line 97
    return v2

    .line 98
    :cond_6
    invoke-virtual {p0}, Lyp2;->i()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    iput-byte v2, p0, Lvz5;->n0:B

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    iput-byte v1, p0, Lvz5;->n0:B

    .line 108
    .line 109
    return v1

    .line 110
    :cond_8
    iput-byte v2, p0, Lvz5;->n0:B

    .line 111
    .line 112
    return v2
.end method

.method public final e()Lup2;
    .locals 1

    .line 1
    invoke-static {}, Luz5;->h()Luz5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Luz5;->i(Lvz5;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final f(Lnv0;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lvz5;->b()I

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmj0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lmj0;-><init>(Lyp2;)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lvz5;->Z:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    and-int/2addr v1, v2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lvz5;->f0:I

    .line 16
    .line 17
    invoke-virtual {p1, v2, v1}, Lnv0;->V(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lvz5;->Z:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    and-int/2addr v1, v2

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget v1, p0, Lvz5;->g0:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Lnv0;->V(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v1, p0, Lvz5;->Z:I

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    iget-object v3, p0, Lvz5;->h0:Lnz5;

    .line 39
    .line 40
    invoke-virtual {p1, v1, v3}, Lnv0;->X(ILd2;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget v1, p0, Lvz5;->Z:I

    .line 44
    .line 45
    const/16 v3, 0x10

    .line 46
    .line 47
    and-int/2addr v1, v3

    .line 48
    if-ne v1, v3, :cond_3

    .line 49
    .line 50
    iget-object v1, p0, Lvz5;->j0:Lnz5;

    .line 51
    .line 52
    invoke-virtual {p1, v2, v1}, Lnv0;->X(ILd2;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    iget v1, p0, Lvz5;->Z:I

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    and-int/2addr v1, v2

    .line 60
    if-ne v1, v2, :cond_4

    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    iget v3, p0, Lvz5;->i0:I

    .line 64
    .line 65
    invoke-virtual {p1, v1, v3}, Lnv0;->V(II)V

    .line 66
    .line 67
    .line 68
    :cond_4
    iget v1, p0, Lvz5;->Z:I

    .line 69
    .line 70
    const/16 v3, 0x20

    .line 71
    .line 72
    and-int/2addr v1, v3

    .line 73
    if-ne v1, v3, :cond_5

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    iget v3, p0, Lvz5;->k0:I

    .line 77
    .line 78
    invoke-virtual {p1, v1, v3}, Lnv0;->V(II)V

    .line 79
    .line 80
    .line 81
    :cond_5
    const/4 v1, 0x0

    .line 82
    :goto_0
    iget-object v3, p0, Lvz5;->l0:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v1, v3, :cond_6

    .line 89
    .line 90
    iget-object v3, p0, Lvz5;->l0:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ld2;

    .line 97
    .line 98
    const/4 v4, 0x7

    .line 99
    invoke-virtual {p1, v4, v3}, Lnv0;->X(ILd2;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    iget v1, p0, Lvz5;->Z:I

    .line 106
    .line 107
    const/16 v3, 0x40

    .line 108
    .line 109
    and-int/2addr v1, v3

    .line 110
    if-ne v1, v3, :cond_7

    .line 111
    .line 112
    iget-object v1, p0, Lvz5;->m0:Lzx5;

    .line 113
    .line 114
    invoke-virtual {p1, v2, v1}, Lnv0;->X(ILd2;)V

    .line 115
    .line 116
    .line 117
    :cond_7
    const/16 v1, 0xc8

    .line 118
    .line 119
    invoke-virtual {v0, v1, p1}, Lmj0;->b0(ILnv0;)V

    .line 120
    .line 121
    .line 122
    iget-object p0, p0, Lvz5;->Y:Ljb0;

    .line 123
    .line 124
    invoke-virtual {p1, p0}, Lnv0;->a0(Ljb0;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.class public final Lld;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxr4;


# static fields
.field public static final b:Lld;

.field public static final c:Lld;

.field public static final d:Lld;

.field public static final e:Lld;

.field public static final f:Lld;

.field public static final g:Lh80;

.field public static final h:Lld;

.field public static final i:Lld;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lld;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lld;->b:Lld;

    .line 8
    .line 9
    new-instance v0, Lld;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lld;->c:Lld;

    .line 16
    .line 17
    new-instance v0, Lld;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lld;->d:Lld;

    .line 24
    .line 25
    new-instance v0, Lld;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lld;->e:Lld;

    .line 32
    .line 33
    new-instance v0, Lld;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lld;->f:Lld;

    .line 40
    .line 41
    new-instance v0, Lh80;

    .line 42
    .line 43
    const/16 v1, 0x14

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lh80;-><init>(B)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lld;->g:Lh80;

    .line 49
    .line 50
    new-instance v0, Lld;

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lld;->h:Lld;

    .line 57
    .line 58
    new-instance v0, Lld;

    .line 59
    .line 60
    const/4 v1, 0x6

    .line 61
    invoke-direct {v0, v1}, Lld;-><init>(B)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lld;->i:Lld;

    .line 65
    .line 66
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lld;->a:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Ljava/util/ArrayList;Lca6;Lzr4;Ljava/util/ArrayList;Ljava/util/ArrayList;Lca6;Ljava/util/ArrayList;Lca6;Lca6;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p1, Lca6;->X:I

    .line 8
    .line 9
    const/high16 v1, 0x41400000    # 12.0f

    .line 10
    .line 11
    invoke-interface {p2, v1}, Lfi1;->x0(F)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    add-int/2addr p2, v0

    .line 16
    iput p2, p1, Lca6;->X:I

    .line 17
    .line 18
    :cond_0
    invoke-static {p3}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget p0, p5, Lca6;->X:I

    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget p0, p1, Lca6;->X:I

    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget p0, p1, Lca6;->X:I

    .line 45
    .line 46
    iget p2, p5, Lca6;->X:I

    .line 47
    .line 48
    add-int/2addr p0, p2

    .line 49
    iput p0, p1, Lca6;->X:I

    .line 50
    .line 51
    iget p0, p7, Lca6;->X:I

    .line 52
    .line 53
    iget p1, p8, Lca6;->X:I

    .line 54
    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    iput p0, p7, Lca6;->X:I

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    .line 62
    .line 63
    .line 64
    iput v0, p8, Lca6;->X:I

    .line 65
    .line 66
    iput v0, p5, Lca6;->X:I

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final c(Lzr4;Ljava/util/List;J)Lyr4;
    .locals 18

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    move-object/from16 v0, p0

    .line 6
    .line 7
    move-wide/from16 v10, p3

    .line 8
    .line 9
    iget-byte v0, v0, Lld;->a:B

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    sget-object v12, Le02;->X:Le02;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v4, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lca6;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lca6;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    move v5, v3

    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lca6;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    move v13, v5

    .line 55
    new-instance v5, Lca6;

    .line 56
    .line 57
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    :goto_0
    if-ge v13, v14, :cond_3

    .line 65
    .line 66
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v15

    .line 70
    check-cast v15, Ltr4;

    .line 71
    .line 72
    invoke-interface {v15, v10, v11}, Ltr4;->o(J)Leo5;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v16

    .line 80
    move/from16 p0, v13

    .line 81
    .line 82
    const/high16 v13, 0x41000000    # 8.0f

    .line 83
    .line 84
    if-nez v16, :cond_1

    .line 85
    .line 86
    move-object/from16 v16, v0

    .line 87
    .line 88
    iget v0, v8, Lca6;->X:I

    .line 89
    .line 90
    invoke-interface {v2, v13}, Lfi1;->x0(F)I

    .line 91
    .line 92
    .line 93
    move-result v17

    .line 94
    add-int v17, v17, v0

    .line 95
    .line 96
    iget v0, v15, Leo5;->X:I

    .line 97
    .line 98
    add-int v0, v17, v0

    .line 99
    .line 100
    invoke-static {v10, v11}, Lq31;->h(J)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    if-gt v0, v13, :cond_0

    .line 105
    .line 106
    move-object/from16 v0, v16

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_0
    move-object/from16 v0, v16

    .line 110
    .line 111
    invoke-static/range {v0 .. v8}, Lld;->a(Ljava/util/ArrayList;Lca6;Lzr4;Ljava/util/ArrayList;Ljava/util/ArrayList;Lca6;Ljava/util/ArrayList;Lca6;Lca6;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-nez v13, :cond_2

    .line 119
    .line 120
    iget v13, v8, Lca6;->X:I

    .line 121
    .line 122
    move-object/from16 v16, v0

    .line 123
    .line 124
    const/high16 v0, 0x41000000    # 8.0f

    .line 125
    .line 126
    invoke-interface {v2, v0}, Lfi1;->x0(F)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    add-int/2addr v0, v13

    .line 131
    iput v0, v8, Lca6;->X:I

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_2
    move-object/from16 v16, v0

    .line 135
    .line 136
    :goto_2
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    iget v0, v8, Lca6;->X:I

    .line 140
    .line 141
    iget v13, v15, Leo5;->X:I

    .line 142
    .line 143
    add-int/2addr v0, v13

    .line 144
    iput v0, v8, Lca6;->X:I

    .line 145
    .line 146
    iget v0, v5, Lca6;->X:I

    .line 147
    .line 148
    iget v13, v15, Leo5;->Y:I

    .line 149
    .line 150
    invoke-static {v0, v13}, Ljava/lang/Math;->max(II)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iput v0, v5, Lca6;->X:I

    .line 155
    .line 156
    add-int/lit8 v13, p0, 0x1

    .line 157
    .line 158
    move-object/from16 v0, v16

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_3
    move-object/from16 v16, v0

    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_4

    .line 168
    .line 169
    move-object/from16 v0, v16

    .line 170
    .line 171
    invoke-static/range {v0 .. v8}, Lld;->a(Ljava/util/ArrayList;Lca6;Lzr4;Ljava/util/ArrayList;Ljava/util/ArrayList;Lca6;Ljava/util/ArrayList;Lca6;Lca6;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_4
    move-object/from16 v0, v16

    .line 176
    .line 177
    :goto_3
    iget v3, v7, Lca6;->X:I

    .line 178
    .line 179
    invoke-static {v10, v11}, Lq31;->j(J)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    iget v1, v1, Lca6;->X:I

    .line 188
    .line 189
    invoke-static {v10, v11}, Lq31;->i(J)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    new-instance v4, Lk8;

    .line 198
    .line 199
    invoke-direct {v4, v0, v2, v3, v6}, Lk8;-><init>(Ljava/util/ArrayList;Lzr4;ILjava/util/ArrayList;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v2, v3, v1, v12, v4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_0
    invoke-static {v10, v11}, Lq31;->j(J)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-static {v10, v11}, Lq31;->i(J)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    new-instance v3, Lb58;

    .line 216
    .line 217
    const/16 v4, 0x16

    .line 218
    .line 219
    invoke-direct {v3, v4}, Lb58;-><init>(B)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v2, v0, v1, v12, v3}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    return-object v0

    .line 227
    :pswitch_1
    move v13, v3

    .line 228
    invoke-static {v10, v11}, Lq31;->f(J)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_5

    .line 233
    .line 234
    invoke-static {v10, v11}, Lq31;->h(J)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    goto :goto_4

    .line 239
    :cond_5
    move v0, v13

    .line 240
    :goto_4
    invoke-static {v10, v11}, Lq31;->e(J)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_6

    .line 245
    .line 246
    invoke-static {v10, v11}, Lq31;->g(J)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    goto :goto_5

    .line 251
    :cond_6
    move v3, v13

    .line 252
    :goto_5
    new-instance v1, Lzx6;

    .line 253
    .line 254
    const/16 v4, 0x9

    .line 255
    .line 256
    invoke-direct {v1, v4}, Lzx6;-><init>(B)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v2, v0, v3, v12, v1}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    return-object v0

    .line 264
    :pswitch_2
    invoke-static {v10, v11}, Lq31;->h(J)I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-static {v10, v11}, Lq31;->g(J)I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    sget-object v3, Lld;->g:Lh80;

    .line 273
    .line 274
    invoke-interface {v2, v0, v1, v12, v3}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_3
    invoke-static {v10, v11}, Lq31;->j(J)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-static {v10, v11}, Lq31;->i(J)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    new-instance v3, Ly2;

    .line 288
    .line 289
    const/16 v4, 0x1d

    .line 290
    .line 291
    invoke-direct {v3, v4}, Ly2;-><init>(B)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v2, v0, v1, v12, v3}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    return-object v0

    .line 299
    :pswitch_4
    move v13, v3

    .line 300
    new-instance v0, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    :goto_6
    if-ge v13, v3, :cond_7

    .line 314
    .line 315
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    check-cast v4, Ltr4;

    .line 320
    .line 321
    invoke-interface {v4, v10, v11}, Ltr4;->o(J)Leo5;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    add-int/lit8 v13, v13, 0x1

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_7
    invoke-static {v10, v11}, Lq31;->h(J)I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    invoke-static {v10, v11}, Lq31;->g(J)I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    new-instance v5, Lkd;

    .line 340
    .line 341
    invoke-direct {v5, v0, v1}, Lkd;-><init>(Ljava/util/ArrayList;B)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v2, v3, v4, v12, v5}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :pswitch_5
    move v13, v3

    .line 350
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_a

    .line 355
    .line 356
    if-eq v0, v1, :cond_9

    .line 357
    .line 358
    new-instance v0, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    move v3, v13

    .line 372
    move v4, v3

    .line 373
    :goto_7
    if-ge v3, v1, :cond_8

    .line 374
    .line 375
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    check-cast v5, Ltr4;

    .line 380
    .line 381
    invoke-interface {v5, v10, v11}, Ltr4;->o(J)Leo5;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    iget v6, v5, Leo5;->X:I

    .line 386
    .line 387
    invoke-static {v13, v6}, Ljava/lang/Math;->max(II)I

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    iget v6, v5, Leo5;->Y:I

    .line 392
    .line 393
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    add-int/lit8 v3, v3, 0x1

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_8
    new-instance v1, Lf0;

    .line 404
    .line 405
    const/4 v3, 0x6

    .line 406
    invoke-direct {v1, v0, v3}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v2, v13, v4, v12, v1}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    goto :goto_8

    .line 414
    :cond_9
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, Ltr4;

    .line 419
    .line 420
    invoke-interface {v0, v10, v11}, Ltr4;->o(J)Leo5;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    iget v1, v0, Leo5;->X:I

    .line 425
    .line 426
    iget v3, v0, Leo5;->Y:I

    .line 427
    .line 428
    new-instance v4, Lf0;

    .line 429
    .line 430
    const/4 v5, 0x5

    .line 431
    invoke-direct {v4, v0, v5}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v2, v1, v3, v12, v4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    goto :goto_8

    .line 439
    :cond_a
    sget-object v0, Lag;->Y:Lag;

    .line 440
    .line 441
    invoke-interface {v2, v13, v13, v12, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    :goto_8
    return-object v0

    .line 446
    :pswitch_6
    move v13, v3

    .line 447
    new-instance v0, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    move v4, v3

    .line 461
    move v5, v4

    .line 462
    :goto_9
    if-ge v3, v1, :cond_b

    .line 463
    .line 464
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    check-cast v6, Ltr4;

    .line 469
    .line 470
    invoke-interface {v6, v10, v11}, Ltr4;->o(J)Leo5;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    iget v7, v6, Leo5;->X:I

    .line 475
    .line 476
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    iget v7, v6, Leo5;->Y:I

    .line 481
    .line 482
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    add-int/lit8 v3, v3, 0x1

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_b
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    if-eqz v1, :cond_c

    .line 497
    .line 498
    invoke-static {v10, v11}, Lq31;->j(J)I

    .line 499
    .line 500
    .line 501
    move-result v4

    .line 502
    invoke-static {v10, v11}, Lq31;->i(J)I

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    :cond_c
    new-instance v1, Lkd;

    .line 507
    .line 508
    invoke-direct {v1, v0, v13}, Lkd;-><init>(Ljava/util/ArrayList;B)V

    .line 509
    .line 510
    .line 511
    invoke-interface {v2, v4, v5, v12, v1}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    return-object v0

    .line 516
    nop

    .line 517
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

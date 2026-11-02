.class public abstract Lzo;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lzo;->a:Lox1;

    .line 15
    .line 16
    new-instance v0, Lx;

    .line 17
    .line 18
    const/16 v1, 0x14

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lx74;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lx74;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lb81;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const v2, 0x3e19999a    # 0.15f

    .line 32
    .line 33
    .line 34
    const v3, 0x3f4ccccd    # 0.8f

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v3, v1, v3, v2}, Lb81;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    const/high16 v0, 0x40800000    # 4.0f

    .line 41
    .line 42
    sput v0, Lzo;->b:F

    .line 43
    .line 44
    const/high16 v0, 0x41400000    # 12.0f

    .line 45
    .line 46
    sput v0, Lzo;->c:F

    .line 47
    .line 48
    return-void
.end method

.method public static final a(Lkx4;Lzy0;Lo88;Lo88;Lzy0;Lsn2;FLv09;Lkc8;Llp2;II)V
    .locals 21

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    move/from16 v10, p10

    .line 4
    .line 5
    sget-object v1, Lpz2;->q0:Ln50;

    .line 6
    .line 7
    const v2, -0x793953af

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v10, 0x6

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    move-object/from16 v12, p0

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move v2, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v10

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v10

    .line 32
    :goto_1
    and-int/lit8 v5, v10, 0x30

    .line 33
    .line 34
    const/16 v6, 0x10

    .line 35
    .line 36
    const/16 v7, 0x20

    .line 37
    .line 38
    move-object/from16 v13, p1

    .line 39
    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v13}, Llp2;->h(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    move v5, v7

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v5, v6

    .line 51
    :goto_2
    or-int/2addr v2, v5

    .line 52
    :cond_3
    and-int/lit16 v5, v10, 0x180

    .line 53
    .line 54
    move-object/from16 v14, p2

    .line 55
    .line 56
    if-nez v5, :cond_5

    .line 57
    .line 58
    invoke-virtual {v0, v14}, Llp2;->f(Ljava/lang/Object;)Z

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
    goto :goto_3

    .line 67
    :cond_4
    const/16 v5, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v2, v5

    .line 70
    :cond_5
    and-int/lit16 v5, v10, 0xc00

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    if-nez v5, :cond_7

    .line 74
    .line 75
    invoke-virtual {v0, v8}, Llp2;->h(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_6

    .line 80
    .line 81
    const/16 v5, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v5, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v2, v5

    .line 87
    :cond_7
    and-int/lit16 v5, v10, 0x6000

    .line 88
    .line 89
    move-object/from16 v15, p3

    .line 90
    .line 91
    if-nez v5, :cond_9

    .line 92
    .line 93
    invoke-virtual {v0, v15}, Llp2;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_8

    .line 98
    .line 99
    const/16 v5, 0x4000

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    const/16 v5, 0x2000

    .line 103
    .line 104
    :goto_5
    or-int/2addr v2, v5

    .line 105
    :cond_9
    const/high16 v5, 0x30000

    .line 106
    .line 107
    and-int/2addr v5, v10

    .line 108
    if-nez v5, :cond_b

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_a

    .line 115
    .line 116
    const/high16 v1, 0x20000

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/high16 v1, 0x10000

    .line 120
    .line 121
    :goto_6
    or-int/2addr v2, v1

    .line 122
    :cond_b
    const/high16 v1, 0x180000

    .line 123
    .line 124
    and-int/2addr v1, v10

    .line 125
    move-object/from16 v5, p4

    .line 126
    .line 127
    if-nez v1, :cond_d

    .line 128
    .line 129
    invoke-virtual {v0, v5}, Llp2;->h(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_c

    .line 134
    .line 135
    const/high16 v1, 0x100000

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_c
    const/high16 v1, 0x80000

    .line 139
    .line 140
    :goto_7
    or-int/2addr v2, v1

    .line 141
    :cond_d
    const/high16 v1, 0xc00000

    .line 142
    .line 143
    and-int/2addr v1, v10

    .line 144
    if-nez v1, :cond_f

    .line 145
    .line 146
    move-object/from16 v1, p5

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-eqz v9, :cond_e

    .line 153
    .line 154
    const/high16 v9, 0x800000

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_e
    const/high16 v9, 0x400000

    .line 158
    .line 159
    :goto_8
    or-int/2addr v2, v9

    .line 160
    goto :goto_9

    .line 161
    :cond_f
    move-object/from16 v1, p5

    .line 162
    .line 163
    :goto_9
    const/high16 v9, 0x6000000

    .line 164
    .line 165
    and-int/2addr v9, v10

    .line 166
    if-nez v9, :cond_11

    .line 167
    .line 168
    move/from16 v9, p6

    .line 169
    .line 170
    invoke-virtual {v0, v9}, Llp2;->c(F)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-eqz v11, :cond_10

    .line 175
    .line 176
    const/high16 v11, 0x4000000

    .line 177
    .line 178
    goto :goto_a

    .line 179
    :cond_10
    const/high16 v11, 0x2000000

    .line 180
    .line 181
    :goto_a
    or-int/2addr v2, v11

    .line 182
    goto :goto_b

    .line 183
    :cond_11
    move/from16 v9, p6

    .line 184
    .line 185
    :goto_b
    const/high16 v11, 0x30000000

    .line 186
    .line 187
    and-int/2addr v11, v10

    .line 188
    if-nez v11, :cond_13

    .line 189
    .line 190
    move-object/from16 v11, p7

    .line 191
    .line 192
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v16

    .line 196
    if-eqz v16, :cond_12

    .line 197
    .line 198
    const/high16 v16, 0x20000000

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_12
    const/high16 v16, 0x10000000

    .line 202
    .line 203
    :goto_c
    or-int v2, v2, v16

    .line 204
    .line 205
    goto :goto_d

    .line 206
    :cond_13
    move-object/from16 v11, p7

    .line 207
    .line 208
    :goto_d
    and-int/lit8 v16, p11, 0x6

    .line 209
    .line 210
    move-object/from16 v3, p8

    .line 211
    .line 212
    if-nez v16, :cond_15

    .line 213
    .line 214
    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v17

    .line 218
    if-eqz v17, :cond_14

    .line 219
    .line 220
    goto :goto_e

    .line 221
    :cond_14
    const/4 v4, 0x2

    .line 222
    :goto_e
    or-int v4, p11, v4

    .line 223
    .line 224
    goto :goto_f

    .line 225
    :cond_15
    move/from16 v4, p11

    .line 226
    .line 227
    :goto_f
    and-int/lit8 v16, p11, 0x30

    .line 228
    .line 229
    if-nez v16, :cond_17

    .line 230
    .line 231
    invoke-virtual {v0, v8}, Llp2;->f(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_16

    .line 236
    .line 237
    move v6, v7

    .line 238
    :cond_16
    or-int/2addr v4, v6

    .line 239
    :cond_17
    const v6, 0x12492493

    .line 240
    .line 241
    .line 242
    and-int/2addr v6, v2

    .line 243
    const v7, 0x12492492

    .line 244
    .line 245
    .line 246
    const/4 v8, 0x0

    .line 247
    const/16 v16, 0x1

    .line 248
    .line 249
    if-ne v6, v7, :cond_19

    .line 250
    .line 251
    and-int/lit8 v4, v4, 0x13

    .line 252
    .line 253
    const/16 v6, 0x12

    .line 254
    .line 255
    if-eq v4, v6, :cond_18

    .line 256
    .line 257
    goto :goto_10

    .line 258
    :cond_18
    move v4, v8

    .line 259
    goto :goto_11

    .line 260
    :cond_19
    :goto_10
    move/from16 v4, v16

    .line 261
    .line 262
    :goto_11
    and-int/lit8 v2, v2, 0x1

    .line 263
    .line 264
    invoke-virtual {v0, v2, v4}, Llp2;->N(IZ)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_1a

    .line 269
    .line 270
    new-instance v11, Lma7;

    .line 271
    .line 272
    move-object/from16 v19, p7

    .line 273
    .line 274
    move-object/from16 v17, v1

    .line 275
    .line 276
    move-object/from16 v20, v3

    .line 277
    .line 278
    move-object/from16 v16, v5

    .line 279
    .line 280
    move/from16 v18, v9

    .line 281
    .line 282
    invoke-direct/range {v11 .. v20}, Lma7;-><init>(Lkx4;Lzy0;Lo88;Lo88;Lzy0;Lsn2;FLv09;Lkc8;)V

    .line 283
    .line 284
    .line 285
    sget-object v1, Lzo;->a:Lox1;

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, Lvf1;

    .line 292
    .line 293
    invoke-virtual {v1, v11, v0, v8}, Lvf1;->a(Lma7;Llp2;I)V

    .line 294
    .line 295
    .line 296
    goto :goto_12

    .line 297
    :cond_1a
    invoke-virtual {v0}, Llp2;->Q()V

    .line 298
    .line 299
    .line 300
    :goto_12
    invoke-virtual {v0}, Llp2;->r()Lj86;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    if-eqz v12, :cond_1b

    .line 305
    .line 306
    new-instance v0, Lwo;

    .line 307
    .line 308
    move-object/from16 v1, p0

    .line 309
    .line 310
    move-object/from16 v2, p1

    .line 311
    .line 312
    move-object/from16 v3, p2

    .line 313
    .line 314
    move-object/from16 v4, p3

    .line 315
    .line 316
    move-object/from16 v5, p4

    .line 317
    .line 318
    move-object/from16 v6, p5

    .line 319
    .line 320
    move/from16 v7, p6

    .line 321
    .line 322
    move-object/from16 v8, p7

    .line 323
    .line 324
    move-object/from16 v9, p8

    .line 325
    .line 326
    move/from16 v11, p11

    .line 327
    .line 328
    invoke-direct/range {v0 .. v11}, Lwo;-><init>(Lkx4;Lzy0;Lo88;Lo88;Lzy0;Lsn2;FLv09;Lkc8;II)V

    .line 329
    .line 330
    .line 331
    iput-object v0, v12, Lj86;->d:Lrn2;

    .line 332
    .line 333
    :cond_1b
    return-void
.end method

.method public static final b(Lzy0;Lkx4;Lzy0;Lsn2;FLv09;Lkc8;Llp2;I)V
    .locals 14

    .line 1
    move-object/from16 v9, p7

    .line 2
    .line 3
    move/from16 v12, p8

    .line 4
    .line 5
    const v0, 0x6a5c1dd0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v9, v0}, Llp2;->X(I)Llp2;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v12, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v9, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int/2addr v0, v12

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, v12

    .line 27
    :goto_1
    and-int/lit8 v1, v12, 0x30

    .line 28
    .line 29
    const/16 v2, 0x10

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v9, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const/16 v1, 0x20

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v1, v2

    .line 43
    :goto_2
    or-int/2addr v0, v1

    .line 44
    :cond_3
    and-int/lit16 v1, v12, 0x180

    .line 45
    .line 46
    move-object/from16 v3, p2

    .line 47
    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    invoke-virtual {v9, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    const/16 v1, 0x100

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/16 v1, 0x80

    .line 60
    .line 61
    :goto_3
    or-int/2addr v0, v1

    .line 62
    :cond_5
    and-int/lit16 v1, v12, 0xc00

    .line 63
    .line 64
    move-object/from16 v4, p3

    .line 65
    .line 66
    if-nez v1, :cond_7

    .line 67
    .line 68
    invoke-virtual {v9, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    const/16 v1, 0x800

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_6
    const/16 v1, 0x400

    .line 78
    .line 79
    :goto_4
    or-int/2addr v0, v1

    .line 80
    :cond_7
    or-int/lit16 v1, v0, 0x6000

    .line 81
    .line 82
    const/high16 v5, 0x30000

    .line 83
    .line 84
    and-int/2addr v5, v12

    .line 85
    if-nez v5, :cond_8

    .line 86
    .line 87
    const v1, 0x16000

    .line 88
    .line 89
    .line 90
    or-int/2addr v1, v0

    .line 91
    :cond_8
    const/high16 v0, 0x180000

    .line 92
    .line 93
    and-int/2addr v0, v12

    .line 94
    move-object/from16 v7, p6

    .line 95
    .line 96
    if-nez v0, :cond_a

    .line 97
    .line 98
    invoke-virtual {v9, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_9

    .line 103
    .line 104
    const/high16 v0, 0x100000

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_9
    const/high16 v0, 0x80000

    .line 108
    .line 109
    :goto_5
    or-int/2addr v1, v0

    .line 110
    :cond_a
    const/high16 v0, 0xc00000

    .line 111
    .line 112
    or-int/2addr v0, v1

    .line 113
    const v1, 0x492493

    .line 114
    .line 115
    .line 116
    and-int/2addr v1, v0

    .line 117
    const v5, 0x492492

    .line 118
    .line 119
    .line 120
    if-eq v1, v5, :cond_b

    .line 121
    .line 122
    const/4 v1, 0x1

    .line 123
    goto :goto_6

    .line 124
    :cond_b
    const/4 v1, 0x0

    .line 125
    :goto_6
    and-int/lit8 v5, v0, 0x1

    .line 126
    .line 127
    invoke-virtual {v9, v5, v1}, Llp2;->N(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_10

    .line 132
    .line 133
    invoke-virtual {v9}, Llp2;->S()V

    .line 134
    .line 135
    .line 136
    and-int/lit8 v1, v12, 0x1

    .line 137
    .line 138
    const/high16 v5, 0x42800000    # 64.0f

    .line 139
    .line 140
    const v6, -0x70001

    .line 141
    .line 142
    .line 143
    if-eqz v1, :cond_d

    .line 144
    .line 145
    invoke-virtual {v9}, Llp2;->x()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_c

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_c
    invoke-virtual {v9}, Llp2;->Q()V

    .line 153
    .line 154
    .line 155
    and-int/2addr v0, v6

    .line 156
    move/from16 v13, p4

    .line 157
    .line 158
    move-object/from16 v7, p5

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_d
    :goto_7
    sget-object v1, Lc29;->w:Ljava/util/WeakHashMap;

    .line 162
    .line 163
    invoke-static {v9}, Lhw7;->b(Llp2;)Lc29;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v1, v1, Lc29;->g:Lhi;

    .line 168
    .line 169
    invoke-static {v9}, Lhw7;->b(Llp2;)Lc29;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    iget-object v8, v8, Lc29;->b:Lhi;

    .line 174
    .line 175
    new-instance v10, Lan8;

    .line 176
    .line 177
    invoke-direct {v10, v1, v8}, Lan8;-><init>(Lv09;Lv09;)V

    .line 178
    .line 179
    .line 180
    const/16 v1, 0xf

    .line 181
    .line 182
    or-int/2addr v1, v2

    .line 183
    new-instance v2, Ls94;

    .line 184
    .line 185
    invoke-direct {v2, v10, v1}, Ls94;-><init>(Lv09;I)V

    .line 186
    .line 187
    .line 188
    and-int/2addr v0, v6

    .line 189
    move-object v7, v2

    .line 190
    move v13, v5

    .line 191
    :goto_8
    invoke-virtual {v9}, Llp2;->q()V

    .line 192
    .line 193
    .line 194
    sget-object v1, Ldh3;->a:Lxj8;

    .line 195
    .line 196
    invoke-static {v1, v9}, Lyj8;->a(Lxj8;Llp2;)Lo88;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    sget-object v3, Lo88;->d:Lo88;

    .line 201
    .line 202
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 203
    .line 204
    invoke-static {v13, v1}, Lkt1;->b(FF)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_f

    .line 209
    .line 210
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 211
    .line 212
    invoke-static {v13, v1}, Lkt1;->b(FF)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_e

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_e
    move v6, v13

    .line 220
    goto :goto_a

    .line 221
    :cond_f
    :goto_9
    move v6, v5

    .line 222
    :goto_a
    shr-int/lit8 v1, v0, 0x3

    .line 223
    .line 224
    and-int/lit8 v1, v1, 0xe

    .line 225
    .line 226
    const v5, 0x36c00

    .line 227
    .line 228
    .line 229
    or-int/2addr v1, v5

    .line 230
    shl-int/lit8 v5, v0, 0x3

    .line 231
    .line 232
    and-int/lit8 v5, v5, 0x70

    .line 233
    .line 234
    or-int/2addr v1, v5

    .line 235
    shl-int/lit8 v5, v0, 0xc

    .line 236
    .line 237
    const/high16 v8, 0x380000

    .line 238
    .line 239
    and-int/2addr v8, v5

    .line 240
    or-int/2addr v1, v8

    .line 241
    const/high16 v8, 0x1c00000

    .line 242
    .line 243
    and-int/2addr v5, v8

    .line 244
    or-int v10, v1, v5

    .line 245
    .line 246
    shr-int/lit8 v0, v0, 0x12

    .line 247
    .line 248
    and-int/lit8 v11, v0, 0x7e

    .line 249
    .line 250
    move-object v1, p0

    .line 251
    move-object v0, p1

    .line 252
    move-object/from16 v8, p6

    .line 253
    .line 254
    move-object v5, v4

    .line 255
    move-object/from16 v4, p2

    .line 256
    .line 257
    invoke-static/range {v0 .. v11}, Lzo;->a(Lkx4;Lzy0;Lo88;Lo88;Lzy0;Lsn2;FLv09;Lkc8;Llp2;II)V

    .line 258
    .line 259
    .line 260
    move-object v6, v7

    .line 261
    move v5, v13

    .line 262
    goto :goto_b

    .line 263
    :cond_10
    invoke-virtual/range {p7 .. p7}, Llp2;->Q()V

    .line 264
    .line 265
    .line 266
    move/from16 v5, p4

    .line 267
    .line 268
    move-object/from16 v6, p5

    .line 269
    .line 270
    :goto_b
    invoke-virtual/range {p7 .. p7}, Llp2;->r()Lj86;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    if-eqz v9, :cond_11

    .line 275
    .line 276
    new-instance v0, Lvo;

    .line 277
    .line 278
    move-object v1, p0

    .line 279
    move-object v2, p1

    .line 280
    move-object/from16 v3, p2

    .line 281
    .line 282
    move-object/from16 v4, p3

    .line 283
    .line 284
    move-object/from16 v7, p6

    .line 285
    .line 286
    move v8, v12

    .line 287
    invoke-direct/range {v0 .. v8}, Lvo;-><init>(Lzy0;Lkx4;Lzy0;Lsn2;FLv09;Lkc8;I)V

    .line 288
    .line 289
    .line 290
    iput-object v0, v9, Lj86;->d:Lrn2;

    .line 291
    .line 292
    :cond_11
    return-void
.end method

.method public static final c(Lkx4;Lre2;JJJJLzy0;Lo88;Lo88;Ldn2;Lzy0;Lzy0;FLlp2;I)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v9, p8

    move-object/from16 v15, p14

    move/from16 v0, p16

    move-object/from16 v5, p17

    sget-object v6, Lpz2;->q0:Ln50;

    const v7, 0x788a5dc

    .line 1
    invoke-virtual {v5, v7}, Llp2;->X(I)Llp2;

    invoke-virtual {v5, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int v7, p18, v7

    invoke-virtual {v5, v2}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/16 v11, 0x20

    goto :goto_1

    :cond_1
    const/16 v11, 0x10

    :goto_1
    or-int/2addr v7, v11

    invoke-virtual {v5, v3, v4}, Llp2;->e(J)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x100

    goto :goto_2

    :cond_2
    const/16 v11, 0x80

    :goto_2
    or-int/2addr v7, v11

    move-wide/from16 v13, p4

    invoke-virtual {v5, v13, v14}, Llp2;->e(J)Z

    move-result v17

    if-eqz v17, :cond_3

    const/16 v17, 0x800

    goto :goto_3

    :cond_3
    const/16 v17, 0x400

    :goto_3
    or-int v7, v7, v17

    move-wide/from16 v11, p6

    invoke-virtual {v5, v11, v12}, Llp2;->e(J)Z

    move-result v19

    if-eqz v19, :cond_4

    const/16 v19, 0x4000

    goto :goto_4

    :cond_4
    const/16 v19, 0x2000

    :goto_4
    or-int v7, v7, v19

    invoke-virtual {v5, v9, v10}, Llp2;->e(J)Z

    move-result v19

    const/high16 v20, 0x10000

    const/high16 v21, 0x20000

    if-eqz v19, :cond_5

    move/from16 v19, v21

    goto :goto_5

    :cond_5
    move/from16 v19, v20

    :goto_5
    or-int v7, v7, v19

    move-object/from16 v8, p10

    invoke-virtual {v5, v8}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_6

    const/high16 v22, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v22, 0x80000

    :goto_6
    or-int v7, v7, v22

    move/from16 v22, v7

    move-object/from16 v7, p11

    invoke-virtual {v5, v7}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v23

    const/high16 v24, 0x400000

    if-eqz v23, :cond_7

    const/high16 v23, 0x800000

    goto :goto_7

    :cond_7
    move/from16 v23, v24

    :goto_7
    or-int v22, v22, v23

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/high16 v7, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v7, 0x2000000

    :goto_8
    or-int v7, v22, v7

    move/from16 v22, v7

    move-object/from16 v7, p12

    invoke-virtual {v5, v7}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_9

    const/high16 v25, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v25, 0x10000000

    :goto_9
    or-int v22, v22, v25

    invoke-virtual {v5, v6}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v18, 0x100

    goto :goto_a

    :cond_a
    const/16 v18, 0x80

    :goto_a
    const v6, 0x186c36

    or-int v6, v6, v18

    invoke-virtual {v5, v15}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v20, v21

    :cond_b
    or-int v6, v6, v20

    invoke-virtual {v5, v0}, Llp2;->c(F)Z

    move-result v18

    if-eqz v18, :cond_c

    const/high16 v24, 0x800000

    :cond_c
    or-int v6, v6, v24

    const v18, 0x12492493

    and-int v7, v22, v18

    const v8, 0x12492492

    if-ne v7, v8, :cond_e

    const v7, 0x492493

    and-int/2addr v7, v6

    const v8, 0x492492

    if-eq v7, v8, :cond_d

    goto :goto_b

    :cond_d
    const/4 v7, 0x0

    goto :goto_c

    :cond_e
    :goto_b
    const/4 v7, 0x1

    :goto_c
    and-int/lit8 v8, v22, 0x1

    invoke-virtual {v5, v8, v7}, Llp2;->N(IZ)Z

    move-result v7

    if-eqz v7, :cond_21

    and-int/lit8 v7, v22, 0x70

    const/16 v8, 0x20

    if-eq v7, v8, :cond_f

    const/4 v7, 0x0

    goto :goto_d

    :cond_f
    const/4 v7, 0x1

    :goto_d
    and-int/lit16 v8, v6, 0x380

    const/16 v11, 0x100

    if-ne v8, v11, :cond_10

    const/4 v8, 0x1

    goto :goto_e

    :cond_10
    const/4 v8, 0x0

    :goto_e
    or-int/2addr v7, v8

    const/high16 v8, 0x1c00000

    and-int/2addr v8, v6

    const/high16 v11, 0x800000

    if-ne v8, v11, :cond_11

    const/4 v8, 0x1

    goto :goto_f

    :cond_11
    const/4 v8, 0x0

    :goto_f
    or-int/2addr v7, v8

    .line 2
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v8

    .line 3
    sget-object v11, Lzz0;->a:Lbe;

    if-nez v7, :cond_12

    if-ne v8, v11, :cond_13

    .line 4
    :cond_12
    new-instance v8, Lmc8;

    .line 5
    invoke-direct {v8, v2, v0}, Lmc8;-><init>(Lre2;F)V

    .line 6
    invoke-virtual {v5, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 7
    :cond_13
    check-cast v8, Lmc8;

    .line 8
    invoke-static {v5}, Lkm4;->I(Llp2;)I

    move-result v7

    .line 9
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    move-result-object v12

    .line 10
    invoke-static {v5, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 11
    sget-object v16, Luz0;->j:Lpz2;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-virtual {v5}, Llp2;->Z()V

    .line 13
    iget-boolean v1, v5, Llp2;->S:Z

    if-eqz v1, :cond_14

    .line 14
    invoke-virtual {v5}, Llp2;->k()V

    goto :goto_10

    .line 15
    :cond_14
    invoke-virtual {v5}, Llp2;->j0()V

    .line 16
    :goto_10
    sget-object v1, Lpz2;->B0:Ldx0;

    .line 17
    invoke-static {v1, v5, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 18
    sget-object v8, Lpz2;->A0:Ldx0;

    .line 19
    invoke-static {v8, v5, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 20
    sget-object v12, Lpz2;->C0:Ldx0;

    .line 21
    iget-boolean v2, v5, Llp2;->S:Z

    if-nez v2, :cond_15

    .line 22
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    move/from16 v16, v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_11

    :cond_15
    move/from16 v16, v6

    .line 23
    :goto_11
    invoke-static {v7, v5, v7, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 24
    :cond_16
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 25
    invoke-static {v2, v5, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 26
    const-string v0, "navigationIcon"

    sget-object v6, Lhx4;->X:Lhx4;

    invoke-static {v6, v0}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v25

    const/16 v29, 0x0

    const/16 v30, 0xe

    sget v34, Lzo;->b:F

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v26, v34

    invoke-static/range {v25 .. v30}, Los4;->A(Lkx4;FFFFI)Lkx4;

    move-result-object v0

    move/from16 v7, v26

    .line 27
    sget-object v13, Lpz2;->Z:Lp50;

    const/4 v14, 0x0

    .line 28
    invoke-static {v13, v14}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v9

    .line 29
    invoke-static {v5}, Lkm4;->I(Llp2;)I

    move-result v10

    .line 30
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    move-result-object v14

    .line 31
    invoke-static {v5, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 32
    invoke-virtual {v5}, Llp2;->Z()V

    move-object/from16 v25, v13

    .line 33
    iget-boolean v13, v5, Llp2;->S:Z

    if-eqz v13, :cond_17

    .line 34
    invoke-virtual {v5}, Llp2;->k()V

    goto :goto_12

    .line 35
    :cond_17
    invoke-virtual {v5}, Llp2;->j0()V

    .line 36
    :goto_12
    invoke-static {v1, v5, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 37
    invoke-static {v8, v5, v14}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 38
    iget-boolean v9, v5, Llp2;->S:Z

    if-nez v9, :cond_18

    .line 39
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    .line 40
    :cond_18
    invoke-static {v10, v5, v10, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 41
    :cond_19
    invoke-static {v2, v5, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 42
    sget-object v0, Lj41;->a:Lox1;

    .line 43
    new-instance v9, Ldw0;

    invoke-direct {v9, v3, v4}, Ldw0;-><init>(J)V

    .line 44
    invoke-virtual {v0, v9}, Lox1;->a(Ljava/lang/Object;)Lt06;

    move-result-object v9

    shr-int/lit8 v10, v16, 0xc

    and-int/lit8 v10, v10, 0x70

    const/16 v13, 0x8

    or-int/2addr v10, v13

    .line 45
    invoke-static {v9, v15, v5, v10}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    const/4 v9, 0x1

    .line 46
    invoke-virtual {v5, v9}, Llp2;->p(Z)V

    const v9, -0x510b6613

    .line 47
    invoke-virtual {v5, v9}, Llp2;->W(I)V

    .line 48
    const-string v9, "title"

    invoke-static {v6, v9}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v13, 0x2

    .line 49
    invoke-static {v9, v7, v10, v13}, Los4;->z(Lkx4;FFI)Lkx4;

    move-result-object v9

    const v10, 0x1e6b2c0d

    .line 50
    invoke-virtual {v5, v10}, Llp2;->W(I)V

    const/4 v14, 0x0

    .line 51
    invoke-virtual {v5, v14}, Llp2;->p(Z)V

    .line 52
    invoke-interface {v9, v6}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v9

    .line 53
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v11, :cond_1a

    .line 54
    new-instance v10, Lxo;

    move-object/from16 v11, p13

    invoke-direct {v10, v11, v14}, Lxo;-><init>(Ldn2;B)V

    .line 55
    invoke-virtual {v5, v10}, Llp2;->g0(Ljava/lang/Object;)V

    goto :goto_13

    :cond_1a
    move-object/from16 v11, p13

    .line 56
    :goto_13
    check-cast v10, Lgn2;

    invoke-static {v9, v10}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    move-result-object v9

    move-object/from16 v10, v25

    .line 57
    invoke-static {v10, v14}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v13

    .line 58
    invoke-static {v5}, Lkm4;->I(Llp2;)I

    move-result v14

    .line 59
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    move-result-object v3

    .line 60
    invoke-static {v5, v9}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v4

    .line 61
    invoke-virtual {v5}, Llp2;->Z()V

    .line 62
    iget-boolean v9, v5, Llp2;->S:Z

    if-eqz v9, :cond_1b

    .line 63
    invoke-virtual {v5}, Llp2;->k()V

    goto :goto_14

    .line 64
    :cond_1b
    invoke-virtual {v5}, Llp2;->j0()V

    .line 65
    :goto_14
    invoke-static {v1, v5, v13}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 66
    invoke-static {v8, v5, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 67
    iget-boolean v3, v5, Llp2;->S:Z

    if-nez v3, :cond_1c

    .line 68
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    .line 69
    :cond_1c
    invoke-static {v14, v5, v14, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 70
    :cond_1d
    invoke-static {v2, v5, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v3, v22, 0x9

    and-int/lit8 v3, v3, 0xe

    shr-int/lit8 v4, v22, 0x12

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v22, 0xc

    and-int/lit16 v4, v4, 0x380

    or-int v21, v3, v4

    move-wide/from16 v16, p4

    move-object/from16 v19, p10

    move-object/from16 v18, p11

    move-object/from16 v20, v5

    .line 71
    invoke-static/range {v16 .. v21}, Ljm4;->l(JLo88;Lrn2;Llp2;I)V

    const/4 v9, 0x1

    .line 72
    invoke-virtual {v5, v9}, Llp2;->p(Z)V

    const/4 v14, 0x0

    .line 73
    invoke-virtual {v5, v14}, Llp2;->p(Z)V

    .line 74
    const-string v3, "actionIcons"

    invoke-static {v6, v3}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v31

    const/16 v35, 0x0

    const/16 v36, 0xb

    const/16 v32, 0x0

    const/16 v33, 0x0

    move/from16 v34, v7

    invoke-static/range {v31 .. v36}, Los4;->A(Lkx4;FFFFI)Lkx4;

    move-result-object v3

    .line 75
    invoke-static {v10, v14}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v4

    .line 76
    invoke-static {v5}, Lkm4;->I(Llp2;)I

    move-result v6

    .line 77
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    move-result-object v7

    .line 78
    invoke-static {v5, v3}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v3

    .line 79
    invoke-virtual {v5}, Llp2;->Z()V

    .line 80
    iget-boolean v9, v5, Llp2;->S:Z

    if-eqz v9, :cond_1e

    .line 81
    invoke-virtual {v5}, Llp2;->k()V

    goto :goto_15

    .line 82
    :cond_1e
    invoke-virtual {v5}, Llp2;->j0()V

    .line 83
    :goto_15
    invoke-static {v1, v5, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 84
    invoke-static {v8, v5, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 85
    iget-boolean v1, v5, Llp2;->S:Z

    if-nez v1, :cond_1f

    .line 86
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    .line 87
    :cond_1f
    invoke-static {v6, v5, v6, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 88
    :cond_20
    invoke-static {v2, v5, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 89
    new-instance v1, Ldw0;

    move-wide/from16 v9, p8

    invoke-direct {v1, v9, v10}, Ldw0;-><init>(J)V

    .line 90
    invoke-virtual {v0, v1}, Lox1;->a(Ljava/lang/Object;)Lt06;

    move-result-object v0

    const/16 v1, 0x38

    move-object/from16 v2, p15

    .line 91
    invoke-static {v0, v2, v5, v1}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    const/4 v0, 0x1

    .line 92
    invoke-virtual {v5, v0}, Llp2;->p(Z)V

    .line 93
    invoke-virtual {v5, v0}, Llp2;->p(Z)V

    goto :goto_16

    :cond_21
    move-object/from16 v11, p13

    move-object/from16 v2, p15

    .line 94
    invoke-virtual {v5}, Llp2;->Q()V

    .line 95
    :goto_16
    invoke-virtual {v5}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object v1, v0

    new-instance v0, Lyo;

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v17, p16

    move/from16 v18, p18

    move-object/from16 v37, v1

    move-object/from16 v16, v2

    move-object v14, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v18}, Lyo;-><init>(Lkx4;Lre2;JJJJLzy0;Lo88;Lo88;Ldn2;Lzy0;Lzy0;FI)V

    move-object/from16 v1, v37

    .line 96
    iput-object v0, v1, Lj86;->d:Lrn2;

    :cond_22
    return-void
.end method

.class public abstract Lvb7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:J

.field public static final d:F

.field public static final e:F

.field public static final f:Liv8;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget v0, Lu15;->u:F

    .line 2
    .line 3
    sput v0, Lvb7;->a:F

    .line 4
    .line 5
    sget v0, Lu15;->s:F

    .line 6
    .line 7
    sput v0, Lvb7;->b:F

    .line 8
    .line 9
    sget v1, Lu15;->q:F

    .line 10
    .line 11
    invoke-static {v0, v1}, Lhi5;->G(FF)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    sput-wide v2, Lvb7;->c:J

    .line 16
    .line 17
    invoke-static {v1, v0}, Lhi5;->G(FF)J

    .line 18
    .line 19
    .line 20
    const/high16 v0, 0x40c00000    # 6.0f

    .line 21
    .line 22
    sput v0, Lvb7;->d:F

    .line 23
    .line 24
    const/high16 v0, 0x40000000    # 2.0f

    .line 25
    .line 26
    sput v0, Lvb7;->e:F

    .line 27
    .line 28
    new-instance v0, Liv8;

    .line 29
    .line 30
    sget-object v1, Lsb7;->X:Lsb7;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lr8;-><init>(Lrn2;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lvb7;->f:Liv8;

    .line 36
    .line 37
    return-void
.end method

.method public static final a(FLgn2;Lkx4;Ljb7;Lxz4;ILzy0;Lsn2;Luu0;Llp2;II)V
    .locals 18

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move/from16 v6, p5

    .line 8
    .line 9
    move-object/from16 v9, p8

    .line 10
    .line 11
    move-object/from16 v0, p9

    .line 12
    .line 13
    const v3, 0x3ac3ab6f

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Llp2;->X(I)Llp2;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Llp2;->c(F)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v5, 0x2

    .line 24
    const/4 v7, 0x4

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    move v3, v7

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v3, v5

    .line 30
    :goto_0
    or-int v3, p10, v3

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-eqz v8, :cond_1

    .line 37
    .line 38
    const/16 v8, 0x20

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v8, 0x10

    .line 42
    .line 43
    :goto_1
    or-int/2addr v3, v8

    .line 44
    move-object/from16 v11, p2

    .line 45
    .line 46
    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    const/16 v8, 0x100

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v8, 0x80

    .line 56
    .line 57
    :goto_2
    or-int/2addr v3, v8

    .line 58
    const/4 v8, 0x1

    .line 59
    invoke-virtual {v0, v8}, Llp2;->g(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_3

    .line 64
    .line 65
    const/16 v10, 0x800

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    const/16 v10, 0x400

    .line 69
    .line 70
    :goto_3
    or-int/2addr v3, v10

    .line 71
    const/4 v10, 0x0

    .line 72
    invoke-virtual {v0, v10}, Llp2;->h(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eqz v10, :cond_4

    .line 77
    .line 78
    const/16 v10, 0x4000

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    const/16 v10, 0x2000

    .line 82
    .line 83
    :goto_4
    or-int/2addr v3, v10

    .line 84
    invoke-virtual {v0, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eqz v10, :cond_5

    .line 89
    .line 90
    const/high16 v10, 0x20000

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    const/high16 v10, 0x10000

    .line 94
    .line 95
    :goto_5
    or-int/2addr v3, v10

    .line 96
    move-object/from16 v13, p4

    .line 97
    .line 98
    invoke-virtual {v0, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_6

    .line 103
    .line 104
    const/high16 v10, 0x100000

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    const/high16 v10, 0x80000

    .line 108
    .line 109
    :goto_6
    or-int/2addr v3, v10

    .line 110
    invoke-virtual {v0, v6}, Llp2;->d(I)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    const/high16 v12, 0x800000

    .line 115
    .line 116
    if-eqz v10, :cond_7

    .line 117
    .line 118
    move v10, v12

    .line 119
    goto :goto_7

    .line 120
    :cond_7
    const/high16 v10, 0x400000

    .line 121
    .line 122
    :goto_7
    or-int/2addr v3, v10

    .line 123
    const/high16 v10, 0x30000000

    .line 124
    .line 125
    or-int/2addr v3, v10

    .line 126
    and-int/lit8 v10, p11, 0x6

    .line 127
    .line 128
    if-nez v10, :cond_9

    .line 129
    .line 130
    invoke-virtual {v0, v9}, Llp2;->f(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_8

    .line 135
    .line 136
    move v10, v7

    .line 137
    goto :goto_8

    .line 138
    :cond_8
    move v10, v5

    .line 139
    :goto_8
    or-int v10, p11, v10

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_9
    move/from16 v10, p11

    .line 143
    .line 144
    :goto_9
    const v14, 0x12492493

    .line 145
    .line 146
    .line 147
    and-int/2addr v14, v3

    .line 148
    const v15, 0x12492492

    .line 149
    .line 150
    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    if-ne v14, v15, :cond_b

    .line 154
    .line 155
    and-int/lit8 v14, v10, 0x3

    .line 156
    .line 157
    if-eq v14, v5, :cond_a

    .line 158
    .line 159
    goto :goto_a

    .line 160
    :cond_a
    move/from16 v14, v16

    .line 161
    .line 162
    goto :goto_b

    .line 163
    :cond_b
    :goto_a
    move v14, v8

    .line 164
    :goto_b
    and-int/lit8 v15, v3, 0x1

    .line 165
    .line 166
    invoke-virtual {v0, v15, v14}, Llp2;->N(IZ)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_14

    .line 171
    .line 172
    invoke-virtual {v0}, Llp2;->S()V

    .line 173
    .line 174
    .line 175
    and-int/lit8 v14, p10, 0x1

    .line 176
    .line 177
    if-eqz v14, :cond_d

    .line 178
    .line 179
    invoke-virtual {v0}, Llp2;->x()Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-eqz v14, :cond_c

    .line 184
    .line 185
    goto :goto_c

    .line 186
    :cond_c
    invoke-virtual {v0}, Llp2;->Q()V

    .line 187
    .line 188
    .line 189
    move-object/from16 v15, p7

    .line 190
    .line 191
    goto :goto_d

    .line 192
    :cond_d
    :goto_c
    new-instance v14, Lmg1;

    .line 193
    .line 194
    invoke-direct {v14, v4, v5}, Lmg1;-><init>(Ljava/lang/Object;B)V

    .line 195
    .line 196
    .line 197
    const v5, -0x118d9ccc

    .line 198
    .line 199
    .line 200
    invoke-static {v5, v14, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    move-object v15, v5

    .line 205
    :goto_d
    invoke-virtual {v0}, Llp2;->q()V

    .line 206
    .line 207
    .line 208
    const/high16 v5, 0x1c00000

    .line 209
    .line 210
    and-int/2addr v5, v3

    .line 211
    if-ne v5, v12, :cond_e

    .line 212
    .line 213
    move v5, v8

    .line 214
    goto :goto_e

    .line 215
    :cond_e
    move/from16 v5, v16

    .line 216
    .line 217
    :goto_e
    and-int/lit8 v12, v10, 0xe

    .line 218
    .line 219
    xor-int/lit8 v12, v12, 0x6

    .line 220
    .line 221
    if-le v12, v7, :cond_f

    .line 222
    .line 223
    invoke-virtual {v0, v9}, Llp2;->f(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    if-nez v12, :cond_11

    .line 228
    .line 229
    :cond_f
    and-int/lit8 v10, v10, 0x6

    .line 230
    .line 231
    if-ne v10, v7, :cond_10

    .line 232
    .line 233
    goto :goto_f

    .line 234
    :cond_10
    move/from16 v8, v16

    .line 235
    .line 236
    :cond_11
    :goto_f
    or-int/2addr v5, v8

    .line 237
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    if-nez v5, :cond_12

    .line 242
    .line 243
    sget-object v5, Lzz0;->a:Lbe;

    .line 244
    .line 245
    if-ne v7, v5, :cond_13

    .line 246
    .line 247
    :cond_12
    new-instance v7, Lwb7;

    .line 248
    .line 249
    invoke-direct {v7, v1, v6, v9}, Lwb7;-><init>(FILuu0;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_13
    move-object v10, v7

    .line 256
    check-cast v10, Lwb7;

    .line 257
    .line 258
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iput-object v2, v10, Lwb7;->f0:Lgn2;

    .line 262
    .line 263
    invoke-virtual {v10, v1}, Lwb7;->c(F)V

    .line 264
    .line 265
    .line 266
    shr-int/lit8 v5, v3, 0x3

    .line 267
    .line 268
    and-int/lit16 v5, v5, 0x3f0

    .line 269
    .line 270
    const v7, 0xe000

    .line 271
    .line 272
    .line 273
    shr-int/lit8 v3, v3, 0x6

    .line 274
    .line 275
    and-int/2addr v3, v7

    .line 276
    or-int/2addr v3, v5

    .line 277
    const/high16 v5, 0x1b0000

    .line 278
    .line 279
    or-int v17, v3, v5

    .line 280
    .line 281
    const/4 v12, 0x0

    .line 282
    move-object/from16 v14, p6

    .line 283
    .line 284
    move-object/from16 v16, v0

    .line 285
    .line 286
    invoke-static/range {v10 .. v17}, Lvb7;->b(Lwb7;Lkx4;Ljb7;Lxz4;Lzy0;Lsn2;Llp2;I)V

    .line 287
    .line 288
    .line 289
    move-object v8, v15

    .line 290
    goto :goto_10

    .line 291
    :cond_14
    invoke-virtual/range {p9 .. p9}, Llp2;->Q()V

    .line 292
    .line 293
    .line 294
    move-object/from16 v8, p7

    .line 295
    .line 296
    :goto_10
    invoke-virtual/range {p9 .. p9}, Llp2;->r()Lj86;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    if-eqz v12, :cond_15

    .line 301
    .line 302
    new-instance v0, Lqb7;

    .line 303
    .line 304
    move-object/from16 v3, p2

    .line 305
    .line 306
    move-object/from16 v5, p4

    .line 307
    .line 308
    move-object/from16 v7, p6

    .line 309
    .line 310
    move/from16 v10, p10

    .line 311
    .line 312
    move/from16 v11, p11

    .line 313
    .line 314
    invoke-direct/range {v0 .. v11}, Lqb7;-><init>(FLgn2;Lkx4;Ljb7;Lxz4;ILzy0;Lsn2;Luu0;II)V

    .line 315
    .line 316
    .line 317
    iput-object v0, v12, Lj86;->d:Lrn2;

    .line 318
    .line 319
    :cond_15
    return-void
.end method

.method public static final b(Lwb7;Lkx4;Ljb7;Lxz4;Lzy0;Lsn2;Llp2;I)V
    .locals 8

    .line 1
    const v0, 0x186dff48

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p7, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p6, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p7

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p7

    .line 23
    :goto_1
    and-int/lit8 v1, p7, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p6, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p7, 0x180

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    invoke-virtual {p6, v2}, Llp2;->g(Z)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/16 v1, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v1, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v0, v1

    .line 56
    :cond_5
    and-int/lit16 v1, p7, 0xc00

    .line 57
    .line 58
    if-nez v1, :cond_6

    .line 59
    .line 60
    or-int/lit16 v0, v0, 0x400

    .line 61
    .line 62
    :cond_6
    and-int/lit16 v1, p7, 0x6000

    .line 63
    .line 64
    if-nez v1, :cond_8

    .line 65
    .line 66
    invoke-virtual {p6, p3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    const/16 v1, 0x4000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_7
    const/16 v1, 0x2000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v1

    .line 78
    :cond_8
    const/high16 v1, 0x30000

    .line 79
    .line 80
    and-int/2addr v1, p7

    .line 81
    if-nez v1, :cond_a

    .line 82
    .line 83
    invoke-virtual {p6, p4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_9

    .line 88
    .line 89
    const/high16 v1, 0x20000

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_9
    const/high16 v1, 0x10000

    .line 93
    .line 94
    :goto_5
    or-int/2addr v0, v1

    .line 95
    :cond_a
    const/high16 v1, 0x180000

    .line 96
    .line 97
    and-int/2addr v1, p7

    .line 98
    if-nez v1, :cond_c

    .line 99
    .line 100
    invoke-virtual {p6, p5}, Llp2;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    const/high16 v1, 0x100000

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_b
    const/high16 v1, 0x80000

    .line 110
    .line 111
    :goto_6
    or-int/2addr v0, v1

    .line 112
    :cond_c
    const v1, 0x92493

    .line 113
    .line 114
    .line 115
    and-int/2addr v1, v0

    .line 116
    const v6, 0x92492

    .line 117
    .line 118
    .line 119
    if-eq v1, v6, :cond_d

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_d
    const/4 v2, 0x0

    .line 123
    :goto_7
    and-int/lit8 v1, v0, 0x1

    .line 124
    .line 125
    invoke-virtual {p6, v1, v2}, Llp2;->N(IZ)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_11

    .line 130
    .line 131
    invoke-virtual {p6}, Llp2;->S()V

    .line 132
    .line 133
    .line 134
    and-int/lit8 v1, p7, 0x1

    .line 135
    .line 136
    if-eqz v1, :cond_f

    .line 137
    .line 138
    invoke-virtual {p6}, Llp2;->x()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_e

    .line 143
    .line 144
    goto :goto_9

    .line 145
    :cond_e
    invoke-virtual {p6}, Llp2;->Q()V

    .line 146
    .line 147
    .line 148
    :goto_8
    and-int/lit16 v0, v0, -0x1c01

    .line 149
    .line 150
    goto :goto_a

    .line 151
    :cond_f
    :goto_9
    sget-object p2, Lpb7;->a:Lpb7;

    .line 152
    .line 153
    sget-object p2, Lkw0;->a:Lox1;

    .line 154
    .line 155
    invoke-virtual {p6, p2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, Liw0;

    .line 160
    .line 161
    invoke-static {p2}, Lpb7;->e(Liw0;)Ljb7;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    goto :goto_8

    .line 166
    :goto_a
    invoke-virtual {p6}, Llp2;->q()V

    .line 167
    .line 168
    .line 169
    iget-byte v1, p0, Lwb7;->X:B

    .line 170
    .line 171
    if-ltz v1, :cond_10

    .line 172
    .line 173
    shr-int/lit8 v1, v0, 0x3

    .line 174
    .line 175
    and-int/lit8 v2, v1, 0xe

    .line 176
    .line 177
    shl-int/lit8 v6, v0, 0x3

    .line 178
    .line 179
    and-int/lit8 v6, v6, 0x70

    .line 180
    .line 181
    or-int/2addr v2, v6

    .line 182
    and-int/lit16 v0, v0, 0x380

    .line 183
    .line 184
    or-int/2addr v0, v2

    .line 185
    and-int/lit16 v2, v1, 0x1c00

    .line 186
    .line 187
    or-int/2addr v0, v2

    .line 188
    const v2, 0xe000

    .line 189
    .line 190
    .line 191
    and-int/2addr v2, v1

    .line 192
    or-int/2addr v0, v2

    .line 193
    const/high16 v2, 0x70000

    .line 194
    .line 195
    and-int/2addr v1, v2

    .line 196
    or-int v6, v0, v1

    .line 197
    .line 198
    move-object v1, p0

    .line 199
    move-object v0, p1

    .line 200
    move-object v2, p3

    .line 201
    move-object v3, p4

    .line 202
    move-object v4, p5

    .line 203
    move-object v5, p6

    .line 204
    invoke-static/range {v0 .. v6}, Lvb7;->c(Lkx4;Lwb7;Lxz4;Lzy0;Lsn2;Llp2;I)V

    .line 205
    .line 206
    .line 207
    :goto_b
    move-object v3, p2

    .line 208
    goto :goto_c

    .line 209
    :cond_10
    const-string p0, "steps should be >= 0"

    .line 210
    .line 211
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_11
    invoke-virtual {p6}, Llp2;->Q()V

    .line 216
    .line 217
    .line 218
    goto :goto_b

    .line 219
    :goto_c
    invoke-virtual {p6}, Llp2;->r()Lj86;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    if-eqz p2, :cond_12

    .line 224
    .line 225
    new-instance v0, Lwu;

    .line 226
    .line 227
    move-object v1, p0

    .line 228
    move-object v2, p1

    .line 229
    move-object v4, p3

    .line 230
    move-object v5, p4

    .line 231
    move-object v6, p5

    .line 232
    move v7, p7

    .line 233
    invoke-direct/range {v0 .. v7}, Lwu;-><init>(Lwb7;Lkx4;Ljb7;Lxz4;Lzy0;Lsn2;I)V

    .line 234
    .line 235
    .line 236
    iput-object v0, p2, Lj86;->d:Lrn2;

    .line 237
    .line 238
    :cond_12
    return-void
.end method

.method public static final c(Lkx4;Lwb7;Lxz4;Lzy0;Lsn2;Llp2;I)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move-object/from16 v11, p4

    .line 10
    .line 11
    move-object/from16 v12, p5

    .line 12
    .line 13
    move/from16 v13, p6

    .line 14
    .line 15
    iget-object v14, v2, Lwb7;->Y:Luu0;

    .line 16
    .line 17
    const v4, 0x358907a3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v12, v4}, Llp2;->X(I)Llp2;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v4, v13, 0x6

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    const/4 v6, 0x4

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {v12, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move v4, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v5

    .line 38
    :goto_0
    or-int/2addr v4, v13

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v4, v13

    .line 41
    :goto_1
    and-int/lit8 v7, v13, 0x30

    .line 42
    .line 43
    if-nez v7, :cond_3

    .line 44
    .line 45
    invoke-virtual {v12, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    const/16 v7, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v7, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v4, v7

    .line 57
    :cond_3
    and-int/lit16 v7, v13, 0x180

    .line 58
    .line 59
    const/4 v8, 0x1

    .line 60
    if-nez v7, :cond_5

    .line 61
    .line 62
    invoke-virtual {v12, v8}, Llp2;->g(Z)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    const/16 v7, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v7, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v4, v7

    .line 74
    :cond_5
    and-int/lit16 v7, v13, 0xc00

    .line 75
    .line 76
    if-nez v7, :cond_7

    .line 77
    .line 78
    invoke-virtual {v12, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_6

    .line 83
    .line 84
    const/16 v7, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v7, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v4, v7

    .line 90
    :cond_7
    and-int/lit16 v7, v13, 0x6000

    .line 91
    .line 92
    if-nez v7, :cond_9

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_8

    .line 99
    .line 100
    const/16 v7, 0x4000

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v7, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v4, v7

    .line 106
    :cond_9
    const/high16 v7, 0x30000

    .line 107
    .line 108
    and-int/2addr v7, v13

    .line 109
    if-nez v7, :cond_b

    .line 110
    .line 111
    invoke-virtual {v12, v11}, Llp2;->h(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_a

    .line 116
    .line 117
    const/high16 v7, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v7, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v4, v7

    .line 123
    :cond_b
    move v15, v4

    .line 124
    const v4, 0x12493

    .line 125
    .line 126
    .line 127
    and-int/2addr v4, v15

    .line 128
    const v7, 0x12492

    .line 129
    .line 130
    .line 131
    const/4 v9, 0x1

    .line 132
    if-eq v4, v7, :cond_c

    .line 133
    .line 134
    move v4, v9

    .line 135
    goto :goto_7

    .line 136
    :cond_c
    const/4 v4, 0x0

    .line 137
    :goto_7
    and-int/lit8 v7, v15, 0x1

    .line 138
    .line 139
    invoke-virtual {v12, v7, v4}, Llp2;->N(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_24

    .line 144
    .line 145
    sget-object v4, Ly01;->n:Lox1;

    .line 146
    .line 147
    invoke-virtual {v12, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    sget-object v7, Lz24;->Y:Lz24;

    .line 152
    .line 153
    if-ne v4, v7, :cond_d

    .line 154
    .line 155
    move v4, v9

    .line 156
    goto :goto_8

    .line 157
    :cond_d
    const/4 v4, 0x0

    .line 158
    :goto_8
    iput-boolean v4, v2, Lwb7;->k0:Z

    .line 159
    .line 160
    iget-object v7, v2, Lwb7;->Z:Lnh5;

    .line 161
    .line 162
    move/from16 v16, v4

    .line 163
    .line 164
    iget-object v4, v2, Lwb7;->n0:Lsd5;

    .line 165
    .line 166
    sget-object v8, Lsd5;->Y:Lsd5;

    .line 167
    .line 168
    if-ne v4, v8, :cond_e

    .line 169
    .line 170
    if-nez v16, :cond_f

    .line 171
    .line 172
    :cond_e
    const/4 v9, 0x0

    .line 173
    :cond_f
    new-instance v8, Lsd;

    .line 174
    .line 175
    invoke-direct {v8, v2, v5}, Lsd;-><init>(Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    sget-object v18, Lyy7;->a:Laq5;

    .line 179
    .line 180
    new-instance v10, Lvy7;

    .line 181
    .line 182
    invoke-direct {v10, v2, v3, v8, v6}, Lvy7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 183
    .line 184
    .line 185
    iget-object v6, v2, Lwb7;->o0:Lrh5;

    .line 186
    .line 187
    invoke-virtual {v6}, Lrh5;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    invoke-virtual {v12, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    move-object/from16 v20, v10

    .line 206
    .line 207
    sget-object v10, Lzz0;->a:Lbe;

    .line 208
    .line 209
    if-nez v8, :cond_10

    .line 210
    .line 211
    if-ne v5, v10, :cond_11

    .line 212
    .line 213
    :cond_10
    new-instance v5, Lar2;

    .line 214
    .line 215
    const/4 v8, 0x0

    .line 216
    const/4 v3, 0x2

    .line 217
    invoke-direct {v5, v2, v8, v3}, Lar2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_11
    move-object v8, v5

    .line 224
    check-cast v8, Lsn2;

    .line 225
    .line 226
    move-object v3, v10

    .line 227
    const/16 v10, 0x20

    .line 228
    .line 229
    sget-object v2, Lhx4;->X:Lhx4;

    .line 230
    .line 231
    move-object/from16 v16, v7

    .line 232
    .line 233
    move/from16 v17, v15

    .line 234
    .line 235
    move-object/from16 v13, v20

    .line 236
    .line 237
    const/4 v5, 0x1

    .line 238
    const/4 v11, 0x1

    .line 239
    move-object v15, v3

    .line 240
    move v7, v6

    .line 241
    move-object/from16 v3, p1

    .line 242
    .line 243
    move-object/from16 v6, p2

    .line 244
    .line 245
    invoke-static/range {v2 .. v10}, Ljv1;->a(Lkx4;Llv1;Lsd5;ZLxz4;ZLsn2;ZI)Lkx4;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    move-object v10, v6

    .line 250
    move v6, v9

    .line 251
    move-object v9, v3

    .line 252
    sget-object v3, Lkb7;->X:Lkb7;

    .line 253
    .line 254
    sget-object v7, Lsd5;->X:Lsd5;

    .line 255
    .line 256
    if-ne v4, v7, :cond_12

    .line 257
    .line 258
    invoke-static {v2, v3}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-static {v3}, Landroidx/compose/foundation/layout/b;->m(Lkx4;)Lkx4;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    goto :goto_9

    .line 267
    :cond_12
    invoke-static {v2, v3}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-static {v3}, Landroidx/compose/foundation/layout/b;->o(Lkx4;)Lkx4;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    :goto_9
    sget-object v18, Lyf3;->a:Lt03;

    .line 276
    .line 277
    sget-object v5, Lxv4;->X:Lxv4;

    .line 278
    .line 279
    invoke-interface {v1, v5}, Lkx4;->y(Lkx4;)Lkx4;

    .line 280
    .line 281
    .line 282
    move-result-object v21

    .line 283
    sget v5, Lvb7;->b:F

    .line 284
    .line 285
    sget v19, Lvb7;->a:F

    .line 286
    .line 287
    if-ne v4, v7, :cond_13

    .line 288
    .line 289
    move/from16 v22, v19

    .line 290
    .line 291
    goto :goto_a

    .line 292
    :cond_13
    move/from16 v22, v5

    .line 293
    .line 294
    :goto_a
    if-ne v4, v7, :cond_14

    .line 295
    .line 296
    move/from16 v23, v5

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_14
    move/from16 v23, v19

    .line 300
    .line 301
    :goto_b
    const/16 v25, 0x0

    .line 302
    .line 303
    const/16 v26, 0xc

    .line 304
    .line 305
    const/16 v24, 0x0

    .line 306
    .line 307
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/b;->f(Lkx4;FFFFI)Lkx4;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    new-instance v1, Lrb7;

    .line 312
    .line 313
    invoke-direct {v1, v9, v11}, Lrb7;-><init>(Lwb7;B)V

    .line 314
    .line 315
    .line 316
    const/4 v11, 0x0

    .line 317
    invoke-static {v5, v11, v1}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    if-ne v4, v7, :cond_15

    .line 322
    .line 323
    sget-object v4, Lm4;->b:Lkx4;

    .line 324
    .line 325
    goto :goto_c

    .line 326
    :cond_15
    sget-object v4, Lm4;->a:Lkx4;

    .line 327
    .line 328
    :goto_c
    invoke-interface {v1, v4}, Lkx4;->y(Lkx4;)Lkx4;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual/range {v16 .. v16}, Lnh5;->l()F

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    iget v5, v14, Luu0;->X:F

    .line 337
    .line 338
    iget v7, v14, Luu0;->Y:F

    .line 339
    .line 340
    new-instance v11, Luu0;

    .line 341
    .line 342
    invoke-direct {v11, v5, v7}, Luu0;-><init>(FF)V

    .line 343
    .line 344
    .line 345
    iget-byte v5, v9, Lwb7;->X:B

    .line 346
    .line 347
    new-instance v7, Lyw5;

    .line 348
    .line 349
    invoke-direct {v7, v4, v5, v11}, Lyw5;-><init>(FILuu0;)V

    .line 350
    .line 351
    .line 352
    const/4 v11, 0x1

    .line 353
    invoke-static {v1, v11, v7}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    const/4 v5, 0x1

    .line 358
    invoke-static {v1, v5, v10}, Lch3;->v(Lkx4;ZLxz4;)Lkx4;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    iget-byte v5, v9, Lwb7;->X:B

    .line 363
    .line 364
    invoke-virtual/range {v16 .. v16}, Lnh5;->l()F

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    move-object v4, v3

    .line 369
    iget-object v3, v9, Lwb7;->f0:Lgn2;

    .line 370
    .line 371
    if-ltz v5, :cond_23

    .line 372
    .line 373
    move-object v11, v2

    .line 374
    new-instance v2, Lub7;

    .line 375
    .line 376
    move-object/from16 v27, v11

    .line 377
    .line 378
    move-object v11, v4

    .line 379
    move-object v4, v14

    .line 380
    move-object/from16 v14, v27

    .line 381
    .line 382
    invoke-direct/range {v2 .. v7}, Lub7;-><init>(Lgn2;Luu0;IZF)V

    .line 383
    .line 384
    .line 385
    invoke-static {v1, v2}, Lmb6;->S(Lkx4;Lgn2;)Lkx4;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-interface {v1, v13}, Lkx4;->y(Lkx4;)Lkx4;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-interface {v1, v8}, Lkx4;->y(Lkx4;)Lkx4;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v12, v9}, Llp2;->h(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    if-nez v2, :cond_16

    .line 406
    .line 407
    if-ne v3, v15, :cond_17

    .line 408
    .line 409
    :cond_16
    new-instance v3, Lcb4;

    .line 410
    .line 411
    const/4 v2, 0x1

    .line 412
    invoke-direct {v3, v9, v2}, Lcb4;-><init>(Ljava/lang/Object;B)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    :cond_17
    check-cast v3, Lxr4;

    .line 419
    .line 420
    invoke-static {v12}, Lkm4;->I(Llp2;)I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    invoke-virtual {v12}, Llp2;->l()Lkl5;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-static {v12, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    sget-object v5, Luz0;->j:Lpz2;

    .line 433
    .line 434
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Llp2;->Z()V

    .line 438
    .line 439
    .line 440
    iget-boolean v5, v12, Llp2;->S:Z

    .line 441
    .line 442
    if-eqz v5, :cond_18

    .line 443
    .line 444
    invoke-virtual {v12}, Llp2;->k()V

    .line 445
    .line 446
    .line 447
    goto :goto_d

    .line 448
    :cond_18
    invoke-virtual {v12}, Llp2;->j0()V

    .line 449
    .line 450
    .line 451
    :goto_d
    sget-object v5, Lpz2;->B0:Ldx0;

    .line 452
    .line 453
    invoke-static {v5, v12, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    sget-object v3, Lpz2;->A0:Ldx0;

    .line 457
    .line 458
    invoke-static {v3, v12, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    sget-object v4, Lpz2;->C0:Ldx0;

    .line 462
    .line 463
    iget-boolean v6, v12, Llp2;->S:Z

    .line 464
    .line 465
    if-nez v6, :cond_19

    .line 466
    .line 467
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-nez v6, :cond_1a

    .line 480
    .line 481
    :cond_19
    invoke-static {v2, v12, v2, v4}, Lp61;->v(ILlp2;ILdx0;)V

    .line 482
    .line 483
    .line 484
    :cond_1a
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 485
    .line 486
    invoke-static {v2, v12, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v9}, Llp2;->h(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    if-nez v1, :cond_1c

    .line 498
    .line 499
    if-ne v6, v15, :cond_1b

    .line 500
    .line 501
    goto :goto_e

    .line 502
    :cond_1b
    const/4 v1, 0x0

    .line 503
    goto :goto_f

    .line 504
    :cond_1c
    :goto_e
    new-instance v6, Lrb7;

    .line 505
    .line 506
    const/4 v1, 0x0

    .line 507
    invoke-direct {v6, v9, v1}, Lrb7;-><init>(Lwb7;B)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    :goto_f
    check-cast v6, Lgn2;

    .line 514
    .line 515
    invoke-static {v11, v6}, Lgv3;->L(Lkx4;Lgn2;)Lkx4;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    sget-object v7, Lpz2;->Z:Lp50;

    .line 520
    .line 521
    invoke-static {v7, v1}, Lg80;->c(Lp50;Z)Lxr4;

    .line 522
    .line 523
    .line 524
    move-result-object v8

    .line 525
    invoke-static {v12}, Lkm4;->I(Llp2;)I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    invoke-virtual {v12}, Llp2;->l()Lkl5;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    invoke-static {v12, v6}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 534
    .line 535
    .line 536
    move-result-object v6

    .line 537
    invoke-virtual {v12}, Llp2;->Z()V

    .line 538
    .line 539
    .line 540
    iget-boolean v13, v12, Llp2;->S:Z

    .line 541
    .line 542
    if-eqz v13, :cond_1d

    .line 543
    .line 544
    invoke-virtual {v12}, Llp2;->k()V

    .line 545
    .line 546
    .line 547
    goto :goto_10

    .line 548
    :cond_1d
    invoke-virtual {v12}, Llp2;->j0()V

    .line 549
    .line 550
    .line 551
    :goto_10
    invoke-static {v5, v12, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    invoke-static {v3, v12, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    iget-boolean v8, v12, Llp2;->S:Z

    .line 558
    .line 559
    if-nez v8, :cond_1e

    .line 560
    .line 561
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object v11

    .line 569
    invoke-static {v8, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v8

    .line 573
    if-nez v8, :cond_1f

    .line 574
    .line 575
    :cond_1e
    invoke-static {v1, v12, v1, v4}, Lp61;->v(ILlp2;ILdx0;)V

    .line 576
    .line 577
    .line 578
    :cond_1f
    invoke-static {v2, v12, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    shr-int/lit8 v1, v17, 0x3

    .line 582
    .line 583
    and-int/lit8 v1, v1, 0xe

    .line 584
    .line 585
    shr-int/lit8 v6, v17, 0x9

    .line 586
    .line 587
    and-int/lit8 v6, v6, 0x70

    .line 588
    .line 589
    or-int/2addr v6, v1

    .line 590
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    invoke-virtual {v0, v9, v12, v6}, Lzy0;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    const/4 v11, 0x1

    .line 598
    invoke-virtual {v12, v11}, Llp2;->p(Z)V

    .line 599
    .line 600
    .line 601
    sget-object v6, Lkb7;->Y:Lkb7;

    .line 602
    .line 603
    invoke-static {v14, v6}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    const/4 v11, 0x0

    .line 608
    invoke-static {v7, v11}, Lg80;->c(Lp50;Z)Lxr4;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    invoke-static {v12}, Lkm4;->I(Llp2;)I

    .line 613
    .line 614
    .line 615
    move-result v8

    .line 616
    invoke-virtual {v12}, Llp2;->l()Lkl5;

    .line 617
    .line 618
    .line 619
    move-result-object v11

    .line 620
    invoke-static {v12, v6}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    invoke-virtual {v12}, Llp2;->Z()V

    .line 625
    .line 626
    .line 627
    iget-boolean v13, v12, Llp2;->S:Z

    .line 628
    .line 629
    if-eqz v13, :cond_20

    .line 630
    .line 631
    invoke-virtual {v12}, Llp2;->k()V

    .line 632
    .line 633
    .line 634
    goto :goto_11

    .line 635
    :cond_20
    invoke-virtual {v12}, Llp2;->j0()V

    .line 636
    .line 637
    .line 638
    :goto_11
    invoke-static {v5, v12, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    invoke-static {v3, v12, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    iget-boolean v3, v12, Llp2;->S:Z

    .line 645
    .line 646
    if-nez v3, :cond_21

    .line 647
    .line 648
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    invoke-static {v3, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    if-nez v3, :cond_22

    .line 661
    .line 662
    :cond_21
    invoke-static {v8, v12, v8, v4}, Lp61;->v(ILlp2;ILdx0;)V

    .line 663
    .line 664
    .line 665
    :cond_22
    invoke-static {v2, v12, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    shr-int/lit8 v2, v17, 0xc

    .line 669
    .line 670
    and-int/lit8 v2, v2, 0x70

    .line 671
    .line 672
    or-int/2addr v1, v2

    .line 673
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    move-object/from16 v11, p4

    .line 678
    .line 679
    invoke-interface {v11, v9, v12, v1}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    const/4 v2, 0x1

    .line 683
    invoke-virtual {v12, v2}, Llp2;->p(Z)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v2}, Llp2;->p(Z)V

    .line 687
    .line 688
    .line 689
    goto :goto_12

    .line 690
    :cond_23
    const-string v0, "steps should be >= 0"

    .line 691
    .line 692
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    return-void

    .line 696
    :cond_24
    move-object v9, v2

    .line 697
    move-object v10, v3

    .line 698
    invoke-virtual {v12}, Llp2;->Q()V

    .line 699
    .line 700
    .line 701
    :goto_12
    invoke-virtual {v12}, Llp2;->r()Lj86;

    .line 702
    .line 703
    .line 704
    move-result-object v7

    .line 705
    if-eqz v7, :cond_25

    .line 706
    .line 707
    new-instance v0, Lkr4;

    .line 708
    .line 709
    move-object/from16 v1, p0

    .line 710
    .line 711
    move-object/from16 v4, p3

    .line 712
    .line 713
    move/from16 v6, p6

    .line 714
    .line 715
    move-object v2, v9

    .line 716
    move-object v3, v10

    .line 717
    move-object v5, v11

    .line 718
    invoke-direct/range {v0 .. v6}, Lkr4;-><init>(Lkx4;Lwb7;Lxz4;Lzy0;Lsn2;I)V

    .line 719
    .line 720
    .line 721
    iput-object v0, v7, Lj86;->d:Lrn2;

    .line 722
    .line 723
    :cond_25
    return-void
.end method

.method public static final d(F[FFF)F
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    aget v0, p1, v0

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    const/4 v2, 0x1

    .line 11
    sub-int/2addr v1, v2

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-static {p2, p3, v0}, Lw51;->H(FFF)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sub-float/2addr v3, p0

    .line 24
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-gt v2, v1, :cond_3

    .line 29
    .line 30
    :goto_0
    aget v4, p1, v2

    .line 31
    .line 32
    invoke-static {p2, p3, v4}, Lw51;->H(FFF)F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    sub-float/2addr v5, p0

    .line 37
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v3, v5}, Ljava/lang/Float;->compare(FF)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-lez v6, :cond_2

    .line 46
    .line 47
    move v0, v4

    .line 48
    move v3, v5

    .line 49
    :cond_2
    if-eq v2, v1, :cond_3

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_1
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-static {p2, p3, p0}, Lw51;->H(FFF)F

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    :cond_4
    return p0
.end method

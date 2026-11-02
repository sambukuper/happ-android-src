.class public abstract Lsx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ltv2;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lsx2;->a:Lox1;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lkx4;Llp2;I)V
    .locals 11

    .line 1
    const v0, -0x23289126

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    and-int/lit8 v3, p2, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v3, v0}, Llp2;->N(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    sget-object v0, Lsx2;->a:Lox1;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lpx2;

    .line 31
    .line 32
    iget-object v3, v0, Lpx2;->a:Lrh5;

    .line 33
    .line 34
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    const/high16 v3, 0x3f000000    # 0.5f

    .line 48
    .line 49
    move v5, v3

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v5, v4

    .line 52
    :goto_1
    const/16 v9, 0xc00

    .line 53
    .line 54
    const/16 v10, 0x16

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    const-string v7, "BackgroundAlpha"

    .line 58
    .line 59
    move-object v8, p1

    .line 60
    invoke-static/range {v5 .. v10}, Lri;->b(FLwf7;Ljava/lang/String;Llp2;II)Llh7;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Llh7;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    cmpl-float v3, v3, v4

    .line 75
    .line 76
    if-lez v3, :cond_4

    .line 77
    .line 78
    const v3, -0x6dcee71c

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v3}, Llp2;->W(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v0, Lpx2;->b:Lrh5;

    .line 85
    .line 86
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ls86;

    .line 91
    .line 92
    invoke-virtual {v8, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {v8, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    or-int/2addr v3, v4

    .line 101
    invoke-virtual {v8}, Llp2;->K()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-nez v3, :cond_2

    .line 106
    .line 107
    sget-object v3, Lzz0;->a:Lbe;

    .line 108
    .line 109
    if-ne v4, v3, :cond_3

    .line 110
    .line 111
    :cond_2
    new-instance v4, Lzw2;

    .line 112
    .line 113
    invoke-direct {v4, v0, p1, v1}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    check-cast v4, Lgn2;

    .line 120
    .line 121
    const/4 p1, 0x6

    .line 122
    invoke-static {p1, v4, v8, p0}, Lyn0;->b(ILgn2;Llp2;Lkx4;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v2}, Llp2;->p(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    const p1, -0x6dc665d8

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, p1}, Llp2;->W(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8, v2}, Llp2;->p(Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    move-object v8, p1

    .line 140
    invoke-virtual {v8}, Llp2;->Q()V

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-virtual {v8}, Llp2;->r()Lj86;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    new-instance v0, Lf80;

    .line 150
    .line 151
    invoke-direct {v0, p0, p2, v1}, Lf80;-><init>(Lkx4;IB)V

    .line 152
    .line 153
    .line 154
    iput-object v0, p1, Lj86;->d:Lrn2;

    .line 155
    .line 156
    :cond_6
    return-void
.end method

.method public static final b(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Llp2;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    move/from16 v10, p10

    .line 4
    .line 5
    const v1, 0x33656621

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Llp2;->X(I)Llp2;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v10, 0x6

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    move-object/from16 v13, p0

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    or-int/2addr v1, v10

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v10

    .line 30
    :goto_1
    and-int/lit8 v3, v10, 0x30

    .line 31
    .line 32
    move-object/from16 v14, p1

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0, v14}, Llp2;->h(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v3, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v1, v3

    .line 48
    :cond_3
    or-int/lit16 v3, v1, 0xd80

    .line 49
    .line 50
    and-int/lit16 v4, v10, 0x6000

    .line 51
    .line 52
    if-nez v4, :cond_4

    .line 53
    .line 54
    or-int/lit16 v3, v1, 0x2d80

    .line 55
    .line 56
    :cond_4
    const/high16 v1, 0x30000

    .line 57
    .line 58
    and-int/2addr v1, v10

    .line 59
    if-nez v1, :cond_5

    .line 60
    .line 61
    const/high16 v1, 0x10000

    .line 62
    .line 63
    or-int/2addr v3, v1

    .line 64
    :cond_5
    const/high16 v1, 0x180000

    .line 65
    .line 66
    and-int/2addr v1, v10

    .line 67
    if-nez v1, :cond_6

    .line 68
    .line 69
    const/high16 v1, 0x80000

    .line 70
    .line 71
    or-int/2addr v3, v1

    .line 72
    :cond_6
    const/high16 v1, 0xc00000

    .line 73
    .line 74
    and-int/2addr v1, v10

    .line 75
    move-object/from16 v9, p8

    .line 76
    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    invoke-virtual {v0, v9}, Llp2;->h(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    const/high16 v1, 0x800000

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_7
    const/high16 v1, 0x400000

    .line 89
    .line 90
    :goto_3
    or-int/2addr v3, v1

    .line 91
    :cond_8
    const v1, 0x492493

    .line 92
    .line 93
    .line 94
    and-int/2addr v1, v3

    .line 95
    const v4, 0x492492

    .line 96
    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    if-eq v1, v4, :cond_9

    .line 100
    .line 101
    move v1, v5

    .line 102
    goto :goto_4

    .line 103
    :cond_9
    const/4 v1, 0x0

    .line 104
    :goto_4
    and-int/2addr v3, v5

    .line 105
    invoke-virtual {v0, v3, v1}, Llp2;->N(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_f

    .line 110
    .line 111
    invoke-virtual {v0}, Llp2;->S()V

    .line 112
    .line 113
    .line 114
    and-int/lit8 v1, v10, 0x1

    .line 115
    .line 116
    if-eqz v1, :cond_b

    .line 117
    .line 118
    invoke-virtual {v0}, Llp2;->x()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_a

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_a
    invoke-virtual {v0}, Llp2;->Q()V

    .line 126
    .line 127
    .line 128
    move-object/from16 v15, p2

    .line 129
    .line 130
    move-object/from16 v16, p3

    .line 131
    .line 132
    move/from16 v17, p4

    .line 133
    .line 134
    move-wide/from16 v18, p5

    .line 135
    .line 136
    move-object/from16 v20, p7

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_b
    :goto_5
    sget-object v1, Lpu;->e:Lzy0;

    .line 140
    .line 141
    sget-object v3, Lpu;->f:Lzy0;

    .line 142
    .line 143
    sget-object v4, Lep;->z:Lox1;

    .line 144
    .line 145
    invoke-virtual {v0, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Ldp;

    .line 150
    .line 151
    iget-object v4, v4, Ldp;->b:Luo;

    .line 152
    .line 153
    iget-wide v4, v4, Luo;->a:J

    .line 154
    .line 155
    sget-object v6, Lc29;->w:Ljava/util/WeakHashMap;

    .line 156
    .line 157
    invoke-static {v0}, Lhw7;->b(Llp2;)Lc29;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    iget-object v6, v6, Lc29;->g:Lhi;

    .line 162
    .line 163
    invoke-static {v0}, Lhw7;->b(Llp2;)Lc29;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    iget-object v7, v7, Lc29;->b:Lhi;

    .line 168
    .line 169
    new-instance v8, Lan8;

    .line 170
    .line 171
    invoke-direct {v8, v6, v7}, Lan8;-><init>(Lv09;Lv09;)V

    .line 172
    .line 173
    .line 174
    move-object v15, v1

    .line 175
    move/from16 v17, v2

    .line 176
    .line 177
    move-object/from16 v16, v3

    .line 178
    .line 179
    move-wide/from16 v18, v4

    .line 180
    .line 181
    move-object/from16 v20, v8

    .line 182
    .line 183
    :goto_6
    invoke-virtual {v0}, Llp2;->q()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    sget-object v2, Lzz0;->a:Lbe;

    .line 191
    .line 192
    if-ne v1, v2, :cond_c

    .line 193
    .line 194
    new-instance v1, Lpx2;

    .line 195
    .line 196
    invoke-direct {v1}, Lpx2;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_c
    move-object v12, v1

    .line 203
    check-cast v12, Lpx2;

    .line 204
    .line 205
    iget-object v1, v12, Lpx2;->a:Lrh5;

    .line 206
    .line 207
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_d

    .line 218
    .line 219
    const/high16 v1, 0x40800000    # 4.0f

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_d
    const/4 v1, 0x0

    .line 223
    :goto_7
    const/16 v3, 0xc00

    .line 224
    .line 225
    const/16 v4, 0x16

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    const-string v6, "BlurRadius"

    .line 229
    .line 230
    move-object/from16 p5, v0

    .line 231
    .line 232
    move/from16 p2, v1

    .line 233
    .line 234
    move/from16 p6, v3

    .line 235
    .line 236
    move/from16 p7, v4

    .line 237
    .line 238
    move-object/from16 p3, v5

    .line 239
    .line 240
    move-object/from16 p4, v6

    .line 241
    .line 242
    invoke-static/range {p2 .. p7}, Lri;->b(FLwf7;Ljava/lang/String;Llp2;II)Llh7;

    .line 243
    .line 244
    .line 245
    move-result-object v23

    .line 246
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-ne v1, v2, :cond_e

    .line 251
    .line 252
    new-instance v1, Lky2;

    .line 253
    .line 254
    invoke-direct {v1}, Lky2;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_e
    check-cast v1, Lky2;

    .line 261
    .line 262
    sget-object v2, Lsx2;->a:Lox1;

    .line 263
    .line 264
    invoke-virtual {v2, v12}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    sget-object v3, Lly2;->a:Lox1;

    .line 269
    .line 270
    invoke-virtual {v3, v1}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    filled-new-array {v2, v3}, [Lt06;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    new-instance v11, Lqx2;

    .line 279
    .line 280
    move-object/from16 v22, v1

    .line 281
    .line 282
    move-object/from16 v21, v9

    .line 283
    .line 284
    invoke-direct/range {v11 .. v23}, Lqx2;-><init>(Lpx2;Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Lky2;Llh7;)V

    .line 285
    .line 286
    .line 287
    const v1, 0x6e2e1ae1

    .line 288
    .line 289
    .line 290
    invoke-static {v1, v11, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    const/16 v3, 0x30

    .line 295
    .line 296
    invoke-static {v2, v1, v0, v3}, Lmb6;->b([Lt06;Lrn2;Llp2;I)V

    .line 297
    .line 298
    .line 299
    move-object v3, v15

    .line 300
    move-object/from16 v4, v16

    .line 301
    .line 302
    move/from16 v5, v17

    .line 303
    .line 304
    move-wide/from16 v6, v18

    .line 305
    .line 306
    move-object/from16 v8, v20

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_f
    invoke-virtual {v0}, Llp2;->Q()V

    .line 310
    .line 311
    .line 312
    move-object/from16 v3, p2

    .line 313
    .line 314
    move-object/from16 v4, p3

    .line 315
    .line 316
    move/from16 v5, p4

    .line 317
    .line 318
    move-wide/from16 v6, p5

    .line 319
    .line 320
    move-object/from16 v8, p7

    .line 321
    .line 322
    :goto_8
    invoke-virtual {v0}, Llp2;->r()Lj86;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    if-eqz v11, :cond_10

    .line 327
    .line 328
    new-instance v0, Lrx2;

    .line 329
    .line 330
    move-object/from16 v1, p0

    .line 331
    .line 332
    move-object/from16 v2, p1

    .line 333
    .line 334
    move-object/from16 v9, p8

    .line 335
    .line 336
    invoke-direct/range {v0 .. v10}, Lrx2;-><init>(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;I)V

    .line 337
    .line 338
    .line 339
    iput-object v0, v11, Lj86;->d:Lrn2;

    .line 340
    .line 341
    :cond_10
    return-void
.end method

.class public final Lb88;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lrh5;

.field public b:Lql;

.field public final c:Lvd7;


# direct methods
.method public constructor <init>(Lql;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Lb88;->a:Lrh5;

    .line 12
    .line 13
    new-instance v1, Lb58;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, v2}, Lb58;-><init>(B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v2, Lol;

    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lol;-><init>(Lql;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v4, v2, Lol;->Z:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v7, 0x0

    .line 45
    :goto_0
    if-ge v7, v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    check-cast v8, Lnl;

    .line 52
    .line 53
    const/high16 v9, -0x80000000

    .line 54
    .line 55
    invoke-virtual {v8, v9}, Lnl;->a(I)Lpl;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v1, v8}, Lb58;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    check-cast v8, Ljava/util/List;

    .line 64
    .line 65
    new-instance v9, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    const/4 v11, 0x0

    .line 79
    :goto_1
    if-ge v11, v10, :cond_0

    .line 80
    .line 81
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    check-cast v12, Lpl;

    .line 86
    .line 87
    new-instance v13, Lnl;

    .line 88
    .line 89
    iget-object v14, v12, Lpl;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iget v15, v12, Lpl;->b:I

    .line 92
    .line 93
    iget v6, v12, Lpl;->c:I

    .line 94
    .line 95
    iget-object v12, v12, Lpl;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v13, v12, v15, v6, v14}, Lnl;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_0
    invoke-static {v3, v9}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Lol;->e()Lql;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v1, v0, Lb88;->b:Lql;

    .line 123
    .line 124
    new-instance v1, Lvd7;

    .line 125
    .line 126
    invoke-direct {v1}, Lvd7;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v1, v0, Lb88;->c:Lvd7;

    .line 130
    .line 131
    return-void
.end method

.method public static c(Lpl;Lx78;)Lpl;
    .locals 3

    .line 1
    iget-object p1, p1, Lx78;->b:Lbz4;

    .line 2
    .line 3
    iget v0, p1, Lbz4;->f:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Lbz4;->b(IZ)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget v0, p0, Lpl;->b:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lpl;->c:I

    .line 18
    .line 19
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/16 v0, 0xb

    .line 24
    .line 25
    invoke-static {p0, v2, v1, p1, v0}, Lpl;->a(Lpl;Lml;III)Lpl;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    return-object v2
.end method


# virtual methods
.method public final a(ILlp2;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const v3, 0x44d294da

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x4

    .line 18
    const/4 v5, 0x2

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move v3, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v5

    .line 24
    :goto_0
    or-int/2addr v3, v1

    .line 25
    and-int/lit8 v6, v3, 0x3

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    if-eq v6, v5, :cond_1

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v6, v8

    .line 33
    :goto_1
    and-int/lit8 v9, v3, 0x1

    .line 34
    .line 35
    invoke-virtual {v2, v9, v6}, Llp2;->N(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_14

    .line 40
    .line 41
    sget-object v6, Ly01;->s:Lox1;

    .line 42
    .line 43
    invoke-virtual {v2, v6}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Lbi;

    .line 48
    .line 49
    iget-object v9, v0, Lb88;->b:Lql;

    .line 50
    .line 51
    iget-object v10, v9, Lql;->Y:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    invoke-virtual {v9, v10}, Lql;->a(I)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    move v11, v8

    .line 66
    :goto_2
    if-ge v11, v10, :cond_15

    .line 67
    .line 68
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    check-cast v12, Lpl;

    .line 73
    .line 74
    iget v13, v12, Lpl;->b:I

    .line 75
    .line 76
    iget-object v14, v12, Lpl;->a:Ljava/lang/Object;

    .line 77
    .line 78
    iget v15, v12, Lpl;->c:I

    .line 79
    .line 80
    if-eq v13, v15, :cond_13

    .line 81
    .line 82
    const v13, 0x2b3dee17

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v13}, Llp2;->W(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    sget-object v15, Lzz0;->a:Lbe;

    .line 93
    .line 94
    if-ne v13, v15, :cond_2

    .line 95
    .line 96
    new-instance v13, Lxz4;

    .line 97
    .line 98
    invoke-direct {v13}, Lxz4;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v13}, Llp2;->g0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    check-cast v13, Lxz4;

    .line 105
    .line 106
    move/from16 v23, v5

    .line 107
    .line 108
    new-instance v5, Lgq6;

    .line 109
    .line 110
    const/16 v24, 0x1

    .line 111
    .line 112
    const/16 v7, 0xf

    .line 113
    .line 114
    invoke-direct {v5, v0, v12, v7}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    sget-object v7, Lhx4;->X:Lhx4;

    .line 118
    .line 119
    invoke-static {v7, v5}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    if-ne v7, v15, :cond_3

    .line 128
    .line 129
    new-instance v7, Lb58;

    .line 130
    .line 131
    invoke-direct {v7, v4}, Lb58;-><init>(B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    check-cast v7, Lgn2;

    .line 138
    .line 139
    invoke-static {v5, v8, v7}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    new-instance v7, Lg88;

    .line 144
    .line 145
    move/from16 v25, v4

    .line 146
    .line 147
    new-instance v4, Ljn0;

    .line 148
    .line 149
    const/16 v8, 0xe

    .line 150
    .line 151
    invoke-direct {v4, v0, v12, v8}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v7, v4}, Lg88;-><init>(Ljn0;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v5, v7}, Lkx4;->y(Lkx4;)Lkx4;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v4, v13}, Lu15;->z(Lkx4;Lxz4;)Lkx4;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    sget-object v5, Lfq5;->a:Llh4;

    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v5, Lci8;->e:Lsf;

    .line 171
    .line 172
    invoke-static {v4, v5}, Lgv3;->N(Lkx4;Lsf;)Lkx4;

    .line 173
    .line 174
    .line 175
    move-result-object v16

    .line 176
    invoke-virtual {v2, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    or-int/2addr v4, v5

    .line 185
    invoke-virtual {v2, v6}, Llp2;->h(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    or-int/2addr v4, v5

    .line 190
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    if-nez v4, :cond_4

    .line 195
    .line 196
    if-ne v5, v15, :cond_5

    .line 197
    .line 198
    :cond_4
    new-instance v5, La23;

    .line 199
    .line 200
    invoke-direct {v5, v0, v12, v6}, La23;-><init>(Lb88;Lpl;Lbi;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_5
    move-object/from16 v21, v5

    .line 207
    .line 208
    check-cast v21, Ldn2;

    .line 209
    .line 210
    const/16 v22, 0x1fc

    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const/16 v19, 0x0

    .line 215
    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    move-object/from16 v17, v13

    .line 219
    .line 220
    invoke-static/range {v16 .. v22}, Lx97;->s(Lkx4;Lxz4;Ltb3;ZLdn2;Ldn2;I)Lkx4;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    const/4 v5, 0x0

    .line 225
    invoke-static {v4, v2, v5}, Lg80;->a(Lkx4;Llp2;I)V

    .line 226
    .line 227
    .line 228
    check-cast v14, Lpa4;

    .line 229
    .line 230
    invoke-virtual {v14}, Lpa4;->a()Lc88;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    if-eqz v4, :cond_6

    .line 235
    .line 236
    iget-object v5, v4, Lc88;->a:Lqe7;

    .line 237
    .line 238
    if-nez v5, :cond_7

    .line 239
    .line 240
    iget-object v5, v4, Lc88;->b:Lqe7;

    .line 241
    .line 242
    if-nez v5, :cond_7

    .line 243
    .line 244
    iget-object v5, v4, Lc88;->c:Lqe7;

    .line 245
    .line 246
    if-nez v5, :cond_7

    .line 247
    .line 248
    iget-object v4, v4, Lc88;->d:Lqe7;

    .line 249
    .line 250
    if-nez v4, :cond_7

    .line 251
    .line 252
    :cond_6
    const/4 v5, 0x0

    .line 253
    goto/16 :goto_9

    .line 254
    .line 255
    :cond_7
    const v4, 0x2b4a813f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4}, Llp2;->W(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    if-ne v4, v15, :cond_8

    .line 266
    .line 267
    new-instance v4, Lqa4;

    .line 268
    .line 269
    invoke-direct {v4, v13}, Lqa4;-><init>(Lxz4;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_8
    check-cast v4, Lqa4;

    .line 276
    .line 277
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    const/4 v7, 0x0

    .line 282
    if-ne v5, v15, :cond_9

    .line 283
    .line 284
    new-instance v5, Lym7;

    .line 285
    .line 286
    const/4 v13, 0x5

    .line 287
    invoke-direct {v5, v4, v7, v13}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_9
    check-cast v5, Lrn2;

    .line 294
    .line 295
    sget-object v13, Ldn8;->a:Ldn8;

    .line 296
    .line 297
    invoke-static {v5, v2, v13}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    iget-object v5, v4, Lqa4;->b:Loh5;

    .line 301
    .line 302
    iget-object v13, v4, Lqa4;->b:Loh5;

    .line 303
    .line 304
    invoke-virtual {v5}, Loh5;->l()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    and-int/lit8 v5, v5, 0x2

    .line 309
    .line 310
    if-eqz v5, :cond_a

    .line 311
    .line 312
    move/from16 v5, v24

    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_a
    const/4 v5, 0x0

    .line 316
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 317
    .line 318
    .line 319
    move-result-object v16

    .line 320
    invoke-virtual {v13}, Loh5;->l()I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    and-int/lit8 v5, v5, 0x1

    .line 325
    .line 326
    if-eqz v5, :cond_b

    .line 327
    .line 328
    move/from16 v5, v24

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_b
    const/4 v5, 0x0

    .line 332
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 333
    .line 334
    .line 335
    move-result-object v17

    .line 336
    invoke-virtual {v13}, Loh5;->l()I

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    and-int/lit8 v5, v5, 0x4

    .line 341
    .line 342
    if-eqz v5, :cond_c

    .line 343
    .line 344
    move/from16 v5, v24

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_c
    const/4 v5, 0x0

    .line 348
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 349
    .line 350
    .line 351
    move-result-object v18

    .line 352
    invoke-virtual {v14}, Lpa4;->a()Lc88;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    if-eqz v5, :cond_d

    .line 357
    .line 358
    iget-object v5, v5, Lc88;->a:Lqe7;

    .line 359
    .line 360
    move-object/from16 v19, v5

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_d
    move-object/from16 v19, v7

    .line 364
    .line 365
    :goto_6
    invoke-virtual {v14}, Lpa4;->a()Lc88;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    if-eqz v5, :cond_e

    .line 370
    .line 371
    iget-object v5, v5, Lc88;->b:Lqe7;

    .line 372
    .line 373
    move-object/from16 v20, v5

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_e
    move-object/from16 v20, v7

    .line 377
    .line 378
    :goto_7
    invoke-virtual {v14}, Lpa4;->a()Lc88;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    if-eqz v5, :cond_f

    .line 383
    .line 384
    iget-object v5, v5, Lc88;->c:Lqe7;

    .line 385
    .line 386
    move-object/from16 v21, v5

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_f
    move-object/from16 v21, v7

    .line 390
    .line 391
    :goto_8
    invoke-virtual {v14}, Lpa4;->a()Lc88;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    if-eqz v5, :cond_10

    .line 396
    .line 397
    iget-object v7, v5, Lc88;->d:Lqe7;

    .line 398
    .line 399
    :cond_10
    move-object/from16 v22, v7

    .line 400
    .line 401
    filled-new-array/range {v16 .. v22}, [Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    invoke-virtual {v2, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    invoke-virtual {v2, v12}, Llp2;->f(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v13

    .line 413
    or-int/2addr v7, v13

    .line 414
    invoke-virtual {v2}, Llp2;->K()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v13

    .line 418
    if-nez v7, :cond_11

    .line 419
    .line 420
    if-ne v13, v15, :cond_12

    .line 421
    .line 422
    :cond_11
    new-instance v13, Lgq6;

    .line 423
    .line 424
    invoke-direct {v13, v0, v12, v4, v8}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v13}, Llp2;->g0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_12
    check-cast v13, Lgn2;

    .line 431
    .line 432
    shl-int/lit8 v4, v3, 0x6

    .line 433
    .line 434
    and-int/lit16 v4, v4, 0x380

    .line 435
    .line 436
    invoke-virtual {v0, v5, v13, v2, v4}, Lb88;->b([Ljava/lang/Object;Lgn2;Llp2;I)V

    .line 437
    .line 438
    .line 439
    const/4 v5, 0x0

    .line 440
    invoke-virtual {v2, v5}, Llp2;->p(Z)V

    .line 441
    .line 442
    .line 443
    goto :goto_a

    .line 444
    :goto_9
    const v4, 0x2b6975be

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v4}, Llp2;->W(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v5}, Llp2;->p(Z)V

    .line 451
    .line 452
    .line 453
    :goto_a
    invoke-virtual {v2, v5}, Llp2;->p(Z)V

    .line 454
    .line 455
    .line 456
    goto :goto_b

    .line 457
    :cond_13
    move/from16 v25, v4

    .line 458
    .line 459
    move/from16 v23, v5

    .line 460
    .line 461
    move v5, v8

    .line 462
    const/16 v24, 0x1

    .line 463
    .line 464
    const v4, 0x2b69abfe

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v4}, Llp2;->W(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2, v5}, Llp2;->p(Z)V

    .line 471
    .line 472
    .line 473
    :goto_b
    add-int/lit8 v11, v11, 0x1

    .line 474
    .line 475
    move v8, v5

    .line 476
    move/from16 v5, v23

    .line 477
    .line 478
    move/from16 v4, v25

    .line 479
    .line 480
    goto/16 :goto_2

    .line 481
    .line 482
    :cond_14
    invoke-virtual {v2}, Llp2;->Q()V

    .line 483
    .line 484
    .line 485
    :cond_15
    invoke-virtual {v2}, Llp2;->r()Lj86;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    if-eqz v2, :cond_16

    .line 490
    .line 491
    new-instance v3, Lb1;

    .line 492
    .line 493
    const/16 v4, 0x1c

    .line 494
    .line 495
    invoke-direct {v3, v0, v1, v4}, Lb1;-><init>(Ljava/lang/Object;IB)V

    .line 496
    .line 497
    .line 498
    iput-object v3, v2, Lj86;->d:Lrn2;

    .line 499
    .line 500
    :cond_16
    return-void
.end method

.method public final b([Ljava/lang/Object;Lgn2;Llp2;I)V
    .locals 7

    .line 1
    const v0, -0x7c28da43

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x30

    .line 8
    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v0, 0x10

    .line 22
    .line 23
    :goto_0
    or-int/2addr v0, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p4

    .line 26
    :goto_1
    and-int/lit16 v2, p4, 0x180

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p3, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    const/16 v2, 0x100

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v2, 0x80

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v2

    .line 42
    :cond_3
    array-length v2, p1

    .line 43
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const v3, -0x155b52f2

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, v3, v2}, Llp2;->U(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    array-length v2, p1

    .line 54
    invoke-virtual {p3, v2}, Llp2;->d(I)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, 0x4

    .line 59
    const/4 v4, 0x0

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move v2, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    move v2, v4

    .line 65
    :goto_3
    or-int/2addr v0, v2

    .line 66
    array-length v2, p1

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ge v5, v2, :cond_6

    .line 69
    .line 70
    aget-object v6, p1, v5

    .line 71
    .line 72
    invoke-virtual {p3, v6}, Llp2;->h(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_5

    .line 77
    .line 78
    move v6, v3

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    move v6, v4

    .line 81
    :goto_5
    or-int/2addr v0, v6

    .line 82
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    invoke-virtual {p3, v4}, Llp2;->p(Z)V

    .line 86
    .line 87
    .line 88
    and-int/lit8 v2, v0, 0xe

    .line 89
    .line 90
    if-nez v2, :cond_7

    .line 91
    .line 92
    or-int/lit8 v0, v0, 0x2

    .line 93
    .line 94
    :cond_7
    and-int/lit16 v2, v0, 0x93

    .line 95
    .line 96
    const/16 v3, 0x92

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    if-eq v2, v3, :cond_8

    .line 100
    .line 101
    move v2, v5

    .line 102
    goto :goto_6

    .line 103
    :cond_8
    move v2, v4

    .line 104
    :goto_6
    and-int/lit8 v3, v0, 0x1

    .line 105
    .line 106
    invoke-virtual {p3, v3, v2}, Llp2;->N(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_c

    .line 111
    .line 112
    new-instance v2, Lps;

    .line 113
    .line 114
    const/4 v3, 0x2

    .line 115
    invoke-direct {v2, v3}, Lps;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, p2}, Lps;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p1}, Lps;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, v2, Lps;->b:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    new-array v3, v3, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {p3, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    and-int/lit8 v0, v0, 0x70

    .line 141
    .line 142
    if-ne v0, v1, :cond_9

    .line 143
    .line 144
    move v4, v5

    .line 145
    :cond_9
    or-int v0, v3, v4

    .line 146
    .line 147
    invoke-virtual {p3}, Llp2;->K()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-nez v0, :cond_a

    .line 152
    .line 153
    sget-object v0, Lzz0;->a:Lbe;

    .line 154
    .line 155
    if-ne v1, v0, :cond_b

    .line 156
    .line 157
    :cond_a
    new-instance v1, La40;

    .line 158
    .line 159
    invoke-direct {v1, p0, p2, v5}, La40;-><init>(Lb88;Lgn2;B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p3, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_b
    check-cast v1, Lgn2;

    .line 166
    .line 167
    invoke-static {v2, v1, p3}, Lu70;->c([Ljava/lang/Object;Lgn2;Llp2;)V

    .line 168
    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_c
    invoke-virtual {p3}, Llp2;->Q()V

    .line 172
    .line 173
    .line 174
    :goto_7
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    if-eqz p3, :cond_d

    .line 179
    .line 180
    new-instance v0, Lg8;

    .line 181
    .line 182
    const/16 v5, 0x16

    .line 183
    .line 184
    move-object v1, p0

    .line 185
    move-object v2, p1

    .line 186
    move-object v3, p2

    .line 187
    move v4, p4

    .line 188
    invoke-direct/range {v0 .. v5}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 189
    .line 190
    .line 191
    iput-object v0, p3, Lj86;->d:Lrn2;

    .line 192
    .line 193
    :cond_d
    return-void
.end method

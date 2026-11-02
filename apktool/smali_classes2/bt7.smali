.class public abstract Lbt7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(ZZLqs7;Lgn2;Lkx4;Llp2;I)V
    .locals 16

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v7, p4

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move/from16 v8, p6

    .line 12
    .line 13
    const v1, -0x1c6dc331

    .line 14
    .line 15
    .line 16
    invoke-virtual {v5, v1}, Llp2;->X(I)Llp2;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v1, v8, 0x6

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v5, v0}, Llp2;->g(Z)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x2

    .line 32
    :goto_0
    or-int/2addr v1, v8

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v1, v8

    .line 35
    :goto_1
    and-int/lit8 v4, v8, 0x30

    .line 36
    .line 37
    if-nez v4, :cond_3

    .line 38
    .line 39
    move/from16 v4, p1

    .line 40
    .line 41
    invoke-virtual {v5, v4}, Llp2;->g(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    const/16 v6, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v6, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v1, v6

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    move/from16 v4, p1

    .line 55
    .line 56
    :goto_3
    and-int/lit16 v6, v8, 0x180

    .line 57
    .line 58
    if-nez v6, :cond_5

    .line 59
    .line 60
    invoke-virtual {v5, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    const/16 v6, 0x100

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_4
    const/16 v6, 0x80

    .line 70
    .line 71
    :goto_4
    or-int/2addr v1, v6

    .line 72
    :cond_5
    and-int/lit16 v6, v8, 0xc00

    .line 73
    .line 74
    if-nez v6, :cond_7

    .line 75
    .line 76
    invoke-virtual {v5, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    const/16 v6, 0x800

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_6
    const/16 v6, 0x400

    .line 86
    .line 87
    :goto_5
    or-int/2addr v1, v6

    .line 88
    :cond_7
    and-int/lit16 v6, v8, 0x6000

    .line 89
    .line 90
    if-nez v6, :cond_9

    .line 91
    .line 92
    invoke-virtual {v5, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_8

    .line 97
    .line 98
    const/16 v6, 0x4000

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_8
    const/16 v6, 0x2000

    .line 102
    .line 103
    :goto_6
    or-int/2addr v1, v6

    .line 104
    :cond_9
    move v9, v1

    .line 105
    and-int/lit16 v1, v9, 0x2493

    .line 106
    .line 107
    const/16 v6, 0x2492

    .line 108
    .line 109
    const/4 v10, 0x1

    .line 110
    const/4 v11, 0x0

    .line 111
    if-eq v1, v6, :cond_a

    .line 112
    .line 113
    move v1, v10

    .line 114
    goto :goto_7

    .line 115
    :cond_a
    move v1, v11

    .line 116
    :goto_7
    and-int/lit8 v6, v9, 0x1

    .line 117
    .line 118
    invoke-virtual {v5, v6, v1}, Llp2;->N(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_e

    .line 123
    .line 124
    sget-object v1, Lht;->c:Ldt;

    .line 125
    .line 126
    sget-object v6, Lpz2;->q0:Ln50;

    .line 127
    .line 128
    invoke-static {v1, v6, v5, v11}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-wide v12, v5, Llp2;->T:J

    .line 133
    .line 134
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    invoke-static {v5, v7}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    sget-object v14, Luz0;->j:Lpz2;

    .line 147
    .line 148
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Llp2;->Z()V

    .line 152
    .line 153
    .line 154
    iget-boolean v14, v5, Llp2;->S:Z

    .line 155
    .line 156
    if-eqz v14, :cond_b

    .line 157
    .line 158
    invoke-virtual {v5}, Llp2;->k()V

    .line 159
    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_b
    invoke-virtual {v5}, Llp2;->j0()V

    .line 163
    .line 164
    .line 165
    :goto_8
    sget-object v14, Lpz2;->B0:Ldx0;

    .line 166
    .line 167
    invoke-static {v14, v5, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 171
    .line 172
    invoke-static {v1, v5, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    sget-object v6, Lpz2;->C0:Ldx0;

    .line 180
    .line 181
    invoke-static {v6, v5, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v5}, Lpn7;->l(Llp2;)V

    .line 185
    .line 186
    .line 187
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 188
    .line 189
    invoke-static {v1, v5, v13}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 193
    .line 194
    invoke-static {v1}, Lch3;->u(Lkx4;)Lkx4;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const/high16 v6, 0x41800000    # 16.0f

    .line 199
    .line 200
    sget-object v12, Lhx4;->X:Lhx4;

    .line 201
    .line 202
    invoke-static {v12, v6}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    if-nez v0, :cond_c

    .line 207
    .line 208
    const v6, 0x1b827731

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v6}, Llp2;->W(I)V

    .line 212
    .line 213
    .line 214
    iget-object v6, v2, Lqs7;->a:Lis7;

    .line 215
    .line 216
    shr-int/lit8 v13, v9, 0x6

    .line 217
    .line 218
    and-int/lit8 v13, v13, 0x70

    .line 219
    .line 220
    or-int/lit16 v13, v13, 0x180

    .line 221
    .line 222
    invoke-static {v6, v3, v1, v5, v13}, Lus7;->a(Lis7;Lgn2;Lkx4;Llp2;I)V

    .line 223
    .line 224
    .line 225
    invoke-static {v5, v12}, Lch3;->f(Llp2;Lkx4;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v11}, Llp2;->p(Z)V

    .line 229
    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_c
    const v6, 0x1b861a29

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5, v6}, Llp2;->W(I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5, v11}, Llp2;->p(Z)V

    .line 239
    .line 240
    .line 241
    :goto_9
    and-int/lit8 v6, v9, 0xe

    .line 242
    .line 243
    or-int/lit16 v6, v6, 0x6000

    .line 244
    .line 245
    and-int/lit8 v13, v9, 0x70

    .line 246
    .line 247
    or-int/2addr v6, v13

    .line 248
    and-int/lit16 v13, v9, 0x380

    .line 249
    .line 250
    or-int/2addr v6, v13

    .line 251
    and-int/lit16 v13, v9, 0x1c00

    .line 252
    .line 253
    or-int/2addr v6, v13

    .line 254
    move v15, v4

    .line 255
    move-object v4, v1

    .line 256
    move v1, v15

    .line 257
    invoke-static/range {v0 .. v6}, Lys7;->a(ZZLqs7;Lgn2;Lkx4;Llp2;I)V

    .line 258
    .line 259
    .line 260
    if-nez p0, :cond_d

    .line 261
    .line 262
    const v0, 0x1b8a9da3

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    .line 266
    .line 267
    .line 268
    invoke-static {v5, v12}, Lch3;->f(Llp2;Lkx4;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, v2, Lqs7;->g:Lms7;

    .line 272
    .line 273
    shr-int/lit8 v1, v9, 0x6

    .line 274
    .line 275
    and-int/lit8 v1, v1, 0x70

    .line 276
    .line 277
    or-int/lit16 v1, v1, 0x180

    .line 278
    .line 279
    invoke-static {v0, v3, v4, v5, v1}, Lct7;->b(Lms7;Lgn2;Lkx4;Llp2;I)V

    .line 280
    .line 281
    .line 282
    invoke-static {v5, v12}, Lch3;->f(Llp2;Lkx4;)V

    .line 283
    .line 284
    .line 285
    iget v0, v2, Lqs7;->h:I

    .line 286
    .line 287
    invoke-static {v0, v3, v4, v5, v1}, Lgs8;->a(ILgn2;Lkx4;Llp2;I)V

    .line 288
    .line 289
    .line 290
    invoke-static {v5, v12}, Lch3;->f(Llp2;Lkx4;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, v2, Lqs7;->i:Lps7;

    .line 294
    .line 295
    invoke-static {v0, v3, v4, v5, v1}, Lxt7;->a(Lps7;Lgn2;Lkx4;Llp2;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5, v11}, Llp2;->p(Z)V

    .line 299
    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_d
    const v0, 0x1b957f09

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v11}, Llp2;->p(Z)V

    .line 309
    .line 310
    .line 311
    :goto_a
    invoke-static {v5, v12}, Lch3;->f(Llp2;Lkx4;)V

    .line 312
    .line 313
    .line 314
    iget-object v0, v2, Lqs7;->j:Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 315
    .line 316
    shr-int/lit8 v1, v9, 0x6

    .line 317
    .line 318
    and-int/lit8 v1, v1, 0x70

    .line 319
    .line 320
    or-int/lit16 v1, v1, 0x180

    .line 321
    .line 322
    invoke-static {v0, v3, v4, v5, v1}, Ldt7;->a(Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;Lgn2;Lkx4;Llp2;I)V

    .line 323
    .line 324
    .line 325
    invoke-static {v5, v12}, Lch3;->f(Llp2;Lkx4;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5, v10}, Llp2;->p(Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_e
    invoke-virtual {v5}, Llp2;->Q()V

    .line 333
    .line 334
    .line 335
    :goto_b
    invoke-virtual {v5}, Llp2;->r()Lj86;

    .line 336
    .line 337
    .line 338
    move-result-object v9

    .line 339
    if-eqz v9, :cond_f

    .line 340
    .line 341
    new-instance v0, Lws7;

    .line 342
    .line 343
    const/4 v7, 0x1

    .line 344
    move/from16 v1, p0

    .line 345
    .line 346
    move-object/from16 v5, p4

    .line 347
    .line 348
    move-object v4, v3

    .line 349
    move v6, v8

    .line 350
    move-object v3, v2

    .line 351
    move/from16 v2, p1

    .line 352
    .line 353
    invoke-direct/range {v0 .. v7}, Lws7;-><init>(ZZLqs7;Lgn2;Lkx4;IB)V

    .line 354
    .line 355
    .line 356
    iput-object v0, v9, Lj86;->d:Lrn2;

    .line 357
    .line 358
    :cond_f
    return-void
.end method

.method public static final b(Lyt7;Lkx4;Llp2;I)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x33b8994d    # -5.227182E7f

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 8
    .line 9
    .line 10
    sget-object v0, Ly01;->n:Lox1;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v8, v0

    .line 17
    check-cast v8, Lz24;

    .line 18
    .line 19
    iget-object v0, p0, Lyt7;->e:Lh76;

    .line 20
    .line 21
    invoke-static {v0, p2}, Li21;->o(Lmh7;Llp2;)Ly05;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    invoke-virtual {p2, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v11, Lzz0;->a:Lbe;

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-ne v1, v11, :cond_1

    .line 38
    .line 39
    :cond_0
    new-instance v0, Lal5;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/16 v7, 0x13

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    const-class v3, Lyt7;

    .line 46
    .line 47
    const-string v4, "onUiIntent"

    .line 48
    .line 49
    const-string v5, "onUiIntent(Lsu/happ/proxyutility/feature/subscription_properties/SubscriptionPropertiesUiIntent;)V"

    .line 50
    .line 51
    move-object v2, p0

    .line 52
    invoke-direct/range {v0 .. v7}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v0

    .line 59
    :cond_1
    move-object v5, v1

    .line 60
    check-cast v5, Lpv3;

    .line 61
    .line 62
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-ne v0, v11, :cond_2

    .line 67
    .line 68
    new-instance v0, Loh2;

    .line 69
    .line 70
    invoke-direct {v0}, Loh2;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    move-object v2, v0

    .line 77
    check-cast v2, Loh2;

    .line 78
    .line 79
    invoke-virtual {p2, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    if-ne v1, v11, :cond_4

    .line 90
    .line 91
    :cond_3
    new-instance v1, Laa3;

    .line 92
    .line 93
    const/16 v0, 0xf

    .line 94
    .line 95
    invoke-direct {v1, v5, v0}, Laa3;-><init>(Lpv3;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    check-cast v1, Ldn2;

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-static {v0, v1, p2, v0}, Lhi5;->F(ZLdn2;Llp2;I)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Ld67;

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    invoke-direct {v0, v5, v2, v1}, Ld67;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    const v1, -0x1afff94a

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    new-instance v0, Lzv2;

    .line 121
    .line 122
    const/4 v6, 0x4

    .line 123
    move-object v3, p0

    .line 124
    move-object v1, v8

    .line 125
    move-object v4, v10

    .line 126
    invoke-direct/range {v0 .. v6}, Lzv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    const v1, 0x123b9ccd    # 5.920007E-28f

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    const v10, 0xc00036

    .line 137
    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    const-wide/16 v5, 0x0

    .line 143
    .line 144
    move-object v1, v7

    .line 145
    const/4 v7, 0x0

    .line 146
    move-object v0, p1

    .line 147
    move-object v9, p2

    .line 148
    invoke-static/range {v0 .. v10}, Lsx2;->b(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Llp2;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-eqz v0, :cond_5

    .line 156
    .line 157
    new-instance v1, Ld67;

    .line 158
    .line 159
    const/4 v2, 0x2

    .line 160
    invoke-direct {v1, v2, p3, p0, p1}, Ld67;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 164
    .line 165
    :cond_5
    return-void
.end method

.method public static final c(IILkd8;)J
    .locals 9

    .line 1
    const/4 v0, -0x1

    .line 2
    const-wide v1, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    int-to-long p0, p1

    .line 12
    shl-long/2addr p0, v3

    .line 13
    or-long/2addr p0, v1

    .line 14
    return-wide p0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-le p0, p1, :cond_1

    .line 18
    .line 19
    move p1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move p1, v0

    .line 22
    :goto_0
    iget-object v5, p2, Lkd8;->d:Lzi1;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    invoke-virtual {v5}, Lzi1;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lid8;

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    iget-object v5, v5, Lid8;->b:Lqf3;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 v5, 0x0

    .line 38
    :goto_1
    if-eqz v5, :cond_3

    .line 39
    .line 40
    invoke-virtual {v5, p0, v0}, Lqf3;->a(IZ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    invoke-static {p0, p0}, Lct7;->c(II)J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    :goto_2
    invoke-virtual {p2, v5, v6}, Lkd8;->f(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v7

    .line 53
    invoke-static {v5, v6}, Lf88;->b(J)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    invoke-static {v7, v8}, Lf88;->b(J)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    sget-object p2, Lmb3;->X:Lmb3;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-static {v5, v6}, Lf88;->b(J)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_5

    .line 73
    .line 74
    invoke-static {v7, v8}, Lf88;->b(J)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-nez p2, :cond_5

    .line 79
    .line 80
    sget-object p2, Lmb3;->Z:Lmb3;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-static {v5, v6}, Lf88;->b(J)Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_6

    .line 88
    .line 89
    invoke-static {v7, v8}, Lf88;->b(J)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-nez p2, :cond_6

    .line 94
    .line 95
    sget-object p2, Lmb3;->Y:Lmb3;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    sget-object p2, Lmb3;->f0:Lmb3;

    .line 99
    .line 100
    :goto_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    sget-object v0, Lf09;->Y:Lf09;

    .line 105
    .line 106
    sget-object v5, Lf09;->X:Lf09;

    .line 107
    .line 108
    if-eqz p2, :cond_e

    .line 109
    .line 110
    if-eq p2, v4, :cond_a

    .line 111
    .line 112
    const/4 v4, 0x2

    .line 113
    if-eq p2, v4, :cond_8

    .line 114
    .line 115
    const/4 p1, 0x3

    .line 116
    if-ne p2, p1, :cond_7

    .line 117
    .line 118
    int-to-long p0, p0

    .line 119
    shl-long/2addr p0, v3

    .line 120
    or-long/2addr p0, v1

    .line 121
    return-wide p0

    .line 122
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 123
    .line 124
    .line 125
    const-wide/16 p0, 0x0

    .line 126
    .line 127
    return-wide p0

    .line 128
    :cond_8
    if-eqz p1, :cond_9

    .line 129
    .line 130
    and-long p0, v7, v1

    .line 131
    .line 132
    long-to-int p0, p0

    .line 133
    invoke-static {p0, v5}, Lnr4;->n(ILf09;)J

    .line 134
    .line 135
    .line 136
    move-result-wide p0

    .line 137
    return-wide p0

    .line 138
    :cond_9
    shr-long p0, v7, v3

    .line 139
    .line 140
    long-to-int p0, p0

    .line 141
    invoke-static {p0, v0}, Lnr4;->n(ILf09;)J

    .line 142
    .line 143
    .line 144
    move-result-wide p0

    .line 145
    return-wide p0

    .line 146
    :cond_a
    if-eqz p1, :cond_c

    .line 147
    .line 148
    shr-long p1, v7, v3

    .line 149
    .line 150
    long-to-int p1, p1

    .line 151
    if-ne p0, p1, :cond_b

    .line 152
    .line 153
    invoke-static {p0, v5}, Lnr4;->n(ILf09;)J

    .line 154
    .line 155
    .line 156
    move-result-wide p0

    .line 157
    return-wide p0

    .line 158
    :cond_b
    and-long p0, v7, v1

    .line 159
    .line 160
    long-to-int p0, p0

    .line 161
    invoke-static {p0, v0}, Lnr4;->n(ILf09;)J

    .line 162
    .line 163
    .line 164
    move-result-wide p0

    .line 165
    return-wide p0

    .line 166
    :cond_c
    and-long p1, v7, v1

    .line 167
    .line 168
    long-to-int p1, p1

    .line 169
    if-ne p0, p1, :cond_d

    .line 170
    .line 171
    invoke-static {p0, v0}, Lnr4;->n(ILf09;)J

    .line 172
    .line 173
    .line 174
    move-result-wide p0

    .line 175
    return-wide p0

    .line 176
    :cond_d
    shr-long p0, v7, v3

    .line 177
    .line 178
    long-to-int p0, p0

    .line 179
    invoke-static {p0, v5}, Lnr4;->n(ILf09;)J

    .line 180
    .line 181
    .line 182
    move-result-wide p0

    .line 183
    return-wide p0

    .line 184
    :cond_e
    if-eqz p1, :cond_f

    .line 185
    .line 186
    move-object v0, v5

    .line 187
    :cond_f
    invoke-static {p0, v0}, Lnr4;->n(ILf09;)J

    .line 188
    .line 189
    .line 190
    move-result-wide p0

    .line 191
    return-wide p0
.end method

.method public static d(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x1020002

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    if-eq v0, p0, :cond_1

    .line 18
    .line 19
    instance-of p0, v0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    check-cast v0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static e(II)I
    .locals 1

    .line 1
    const/16 v0, -0xc

    .line 2
    .line 3
    if-gt p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, -0x41

    .line 6
    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    shl-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    xor-int/2addr p0, p1

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public static f(II[B)I
    .locals 5

    .line 1
    add-int/lit8 v0, p0, -0x1

    .line 2
    .line 3
    aget-byte v0, p2, v0

    .line 4
    .line 5
    sub-int/2addr p1, p0

    .line 6
    const/4 v1, -0x1

    .line 7
    const/16 v2, -0xc

    .line 8
    .line 9
    if-eqz p1, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq p1, v3, :cond_3

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    if-ne p1, v4, :cond_2

    .line 16
    .line 17
    aget-byte p1, p2, p0

    .line 18
    .line 19
    add-int/2addr p0, v3

    .line 20
    aget-byte p0, p2, p0

    .line 21
    .line 22
    if-gt v0, v2, :cond_1

    .line 23
    .line 24
    const/16 p2, -0x41

    .line 25
    .line 26
    if-gt p1, p2, :cond_1

    .line 27
    .line 28
    if-le p0, p2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    shl-int/lit8 p1, p1, 0x8

    .line 32
    .line 33
    xor-int/2addr p1, v0

    .line 34
    shl-int/lit8 p0, p0, 0x10

    .line 35
    .line 36
    xor-int/2addr p0, p1

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    return v1

    .line 39
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_3
    aget-byte p0, p2, p0

    .line 46
    .line 47
    invoke-static {v0, p0}, Lbt7;->e(II)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_4
    if-le v0, v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    return v0
.end method

.method public static g(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x9

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static h(II[B)I
    .locals 7

    .line 1
    :goto_0
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    aget-byte v0, p2, p0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-lt p0, p1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    :goto_1
    if-lt p0, p1, :cond_2

    .line 15
    .line 16
    return v0

    .line 17
    :cond_2
    add-int/lit8 v1, p0, 0x1

    .line 18
    .line 19
    aget-byte v2, p2, p0

    .line 20
    .line 21
    if-gez v2, :cond_b

    .line 22
    .line 23
    const/16 v3, -0x20

    .line 24
    .line 25
    const/16 v4, -0x41

    .line 26
    .line 27
    if-ge v2, v3, :cond_4

    .line 28
    .line 29
    if-lt v1, p1, :cond_3

    .line 30
    .line 31
    return v2

    .line 32
    :cond_3
    const/16 v3, -0x3e

    .line 33
    .line 34
    if-lt v2, v3, :cond_a

    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x2

    .line 37
    .line 38
    aget-byte v1, p2, v1

    .line 39
    .line 40
    if-le v1, v4, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_4
    const/16 v5, -0x10

    .line 44
    .line 45
    if-ge v2, v5, :cond_8

    .line 46
    .line 47
    add-int/lit8 v5, p1, -0x1

    .line 48
    .line 49
    if-lt v1, v5, :cond_5

    .line 50
    .line 51
    invoke-static {v1, p1, p2}, Lbt7;->f(II[B)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0

    .line 56
    :cond_5
    add-int/lit8 v5, p0, 0x2

    .line 57
    .line 58
    aget-byte v1, p2, v1

    .line 59
    .line 60
    if-gt v1, v4, :cond_a

    .line 61
    .line 62
    const/16 v6, -0x60

    .line 63
    .line 64
    if-ne v2, v3, :cond_6

    .line 65
    .line 66
    if-lt v1, v6, :cond_a

    .line 67
    .line 68
    :cond_6
    const/16 v3, -0x13

    .line 69
    .line 70
    if-ne v2, v3, :cond_7

    .line 71
    .line 72
    if-ge v1, v6, :cond_a

    .line 73
    .line 74
    :cond_7
    add-int/lit8 p0, p0, 0x3

    .line 75
    .line 76
    aget-byte v1, p2, v5

    .line 77
    .line 78
    if-le v1, v4, :cond_1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_8
    add-int/lit8 v3, p1, -0x2

    .line 82
    .line 83
    if-lt v1, v3, :cond_9

    .line 84
    .line 85
    invoke-static {v1, p1, p2}, Lbt7;->f(II[B)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_9
    add-int/lit8 v3, p0, 0x2

    .line 91
    .line 92
    aget-byte v1, p2, v1

    .line 93
    .line 94
    if-gt v1, v4, :cond_a

    .line 95
    .line 96
    shl-int/lit8 v2, v2, 0x1c

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x70

    .line 99
    .line 100
    add-int/2addr v1, v2

    .line 101
    shr-int/lit8 v1, v1, 0x1e

    .line 102
    .line 103
    if-nez v1, :cond_a

    .line 104
    .line 105
    add-int/lit8 v1, p0, 0x3

    .line 106
    .line 107
    aget-byte v2, p2, v3

    .line 108
    .line 109
    if-gt v2, v4, :cond_a

    .line 110
    .line 111
    add-int/lit8 p0, p0, 0x4

    .line 112
    .line 113
    aget-byte v1, p2, v1

    .line 114
    .line 115
    if-le v1, v4, :cond_1

    .line 116
    .line 117
    :cond_a
    :goto_2
    const/4 p0, -0x1

    .line 118
    return p0

    .line 119
    :cond_b
    move p0, v1

    .line 120
    goto :goto_1
.end method

.method public static final i(Lch8;Lsm;)Lch8;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lxm;->a(Lch8;)Lsm;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object v0, Lxm;->b:Lr75;

    .line 12
    .line 13
    sget-object v1, Lxm;->a:[Lnw3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aget-object v1, v1, v2

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Lr75;->a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lwm;

    .line 23
    .line 24
    if-eqz v0, :cond_6

    .line 25
    .line 26
    invoke-virtual {p0}, Lch8;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v1, p0, Lch8;->X:Lut;

    .line 34
    .line 35
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    move-object v4, v3

    .line 55
    check-cast v4, Lwm;

    .line 56
    .line 57
    invoke-static {v4, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v1, p0, Lch8;->X:Lut;

    .line 72
    .line 73
    invoke-virtual {v1}, Lut;->a()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-ne v0, v1, :cond_4

    .line 78
    .line 79
    :goto_1
    move-object v0, p0

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    sget-object v0, Lch8;->Y:Lxd6;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :goto_2
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move-object p0, v0

    .line 94
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    invoke-interface {p1}, Lsm;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    new-instance v0, Lwm;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lwm;-><init>(Lsm;)V

    .line 114
    .line 115
    .line 116
    sget-object p1, Lch8;->Y:Lxd6;

    .line 117
    .line 118
    const-class v1, Lwm;

    .line 119
    .line 120
    sget-object v2, Lyb6;->a:Lzb6;

    .line 121
    .line 122
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, Lzu3;->p()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v1}, Lxd6;->r(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    iget-object v1, p0, Lch8;->X:Lut;

    .line 141
    .line 142
    invoke-virtual {v1, p1}, Lut;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_8

    .line 147
    .line 148
    :goto_4
    return-object p0

    .line 149
    :cond_8
    invoke-virtual {p0}, Lch8;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_9

    .line 154
    .line 155
    new-instance p0, Lch8;

    .line 156
    .line 157
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {p0, p1}, Lch8;-><init>(Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    return-object p0

    .line 165
    :cond_9
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {p0, v0}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {p0}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method

.method public static final j(Lsm;)Lch8;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lsm;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lch8;->Y:Lxd6;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object p0, Lch8;->Z:Lch8;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v0, Lch8;->Y:Lxd6;

    .line 19
    .line 20
    new-instance v1, Lwm;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lwm;-><init>(Lsm;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

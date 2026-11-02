.class public final Lai2;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Lw85;
.implements Lnx4;
.implements Lnh1;


# instance fields
.field public final q0:Lrn2;

.field public r0:Z

.field public s0:Z

.field public final t0:B

.field public u0:Ljava/lang/Integer;

.field public v0:Lf63;


# direct methods
.method public constructor <init>(ILrn2;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lai2;->q0:Lrn2;

    .line 10
    .line 11
    iput-byte p1, p0, Lai2;->t0:B

    .line 12
    .line 13
    return-void
.end method

.method public static h1(Lai2;)Z
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p0, v0}, Lai2;->g1(I)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final R0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lai2;->d1()Lyh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Lmf5;->getFocusOwner()Leh2;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lu15;->l(Lai2;)Lai2;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Lmf5;->getFocusOwner()Leh2;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lgh2;

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v0, v2, v1, v3}, Lgh2;->b(IZZ)Z

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lgh2;->d:Lbh2;

    .line 53
    .line 54
    invoke-virtual {v0}, Lbh2;->a()V

    .line 55
    .line 56
    .line 57
    :goto_0
    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lai2;->u0:Ljava/lang/Integer;

    .line 59
    .line 60
    iget-object v1, p0, Lai2;->v0:Lf63;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1}, Lf63;->D()V

    .line 65
    .line 66
    .line 67
    :cond_3
    iput-object v0, p0, Lai2;->v0:Lf63;

    .line 68
    .line 69
    return-void
.end method

.method public final S0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lai2;->d1()Lyh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lyh2;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Lmf5;->getFocusOwner()Leh2;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    check-cast p0, Lgh2;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {p0, v0, v1, v1}, Lgh2;->b(IZZ)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final Y0()Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Los4;->D(Lai2;)Lm81;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v5, :cond_0

    .line 18
    .line 19
    if-eq v1, v4, :cond_2

    .line 20
    .line 21
    if-ne v1, v3, :cond_1

    .line 22
    .line 23
    :cond_0
    :goto_0
    move/from16 v19, v2

    .line 24
    .line 25
    goto/16 :goto_1d

    .line 26
    .line 27
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    move/from16 v18, v5

    .line 32
    .line 33
    goto/16 :goto_1e

    .line 34
    .line 35
    :cond_3
    invoke-static {v0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lmf5;->getFocusOwner()Leh2;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lgh2;

    .line 44
    .line 45
    invoke-virtual {v1}, Lgh2;->f()Lai2;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v0}, Lai2;->d1()Lyh2;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    if-ne v6, v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0, v7, v7}, Lai2;->Z0(Lyh2;Lyh2;)V

    .line 56
    .line 57
    .line 58
    return v5

    .line 59
    :cond_4
    if-eqz v6, :cond_5

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    invoke-static {v0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-interface {v8}, Lmf5;->getFocusOwner()Leh2;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, Lgh2;

    .line 71
    .line 72
    iget-object v8, v8, Lgh2;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 73
    .line 74
    invoke-virtual {v8}, Landroidx/compose/ui/platform/AndroidComposeView;->B()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-nez v8, :cond_6

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_6
    :goto_1
    const-string v8, "visitAncestors called on an unattached node"

    .line 82
    .line 83
    const/16 v9, 0x10

    .line 84
    .line 85
    if-eqz v6, :cond_12

    .line 86
    .line 87
    new-instance v11, Lc15;

    .line 88
    .line 89
    new-array v12, v9, [Lai2;

    .line 90
    .line 91
    invoke-direct {v11, v2, v12}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v12, v6, Ljx4;->X:Ljx4;

    .line 95
    .line 96
    iget-boolean v12, v12, Ljx4;->p0:Z

    .line 97
    .line 98
    if-nez v12, :cond_7

    .line 99
    .line 100
    invoke-static {v8}, Lwc3;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    iget-object v12, v6, Ljx4;->X:Ljx4;

    .line 104
    .line 105
    iget-object v12, v12, Ljx4;->g0:Ljx4;

    .line 106
    .line 107
    invoke-static {v6}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    :goto_2
    if-eqz v13, :cond_13

    .line 112
    .line 113
    iget-object v14, v13, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 114
    .line 115
    iget-object v14, v14, Lt6;->i0:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v14, Ljx4;

    .line 118
    .line 119
    iget v14, v14, Ljx4;->f0:I

    .line 120
    .line 121
    and-int/lit16 v14, v14, 0x400

    .line 122
    .line 123
    if-eqz v14, :cond_10

    .line 124
    .line 125
    :goto_3
    if-eqz v12, :cond_10

    .line 126
    .line 127
    iget v14, v12, Ljx4;->Z:I

    .line 128
    .line 129
    and-int/lit16 v14, v14, 0x400

    .line 130
    .line 131
    if-eqz v14, :cond_f

    .line 132
    .line 133
    move-object v14, v12

    .line 134
    const/4 v15, 0x0

    .line 135
    :goto_4
    if-eqz v14, :cond_f

    .line 136
    .line 137
    instance-of v10, v14, Lai2;

    .line 138
    .line 139
    if-eqz v10, :cond_8

    .line 140
    .line 141
    check-cast v14, Lai2;

    .line 142
    .line 143
    invoke-virtual {v11, v14}, Lc15;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_8
    iget v10, v14, Ljx4;->Z:I

    .line 148
    .line 149
    and-int/lit16 v10, v10, 0x400

    .line 150
    .line 151
    if-eqz v10, :cond_e

    .line 152
    .line 153
    instance-of v10, v14, Loh1;

    .line 154
    .line 155
    if-eqz v10, :cond_e

    .line 156
    .line 157
    move-object v10, v14

    .line 158
    check-cast v10, Loh1;

    .line 159
    .line 160
    iget-object v10, v10, Loh1;->r0:Ljx4;

    .line 161
    .line 162
    move v3, v2

    .line 163
    :goto_5
    if-eqz v10, :cond_d

    .line 164
    .line 165
    iget v4, v10, Ljx4;->Z:I

    .line 166
    .line 167
    and-int/lit16 v4, v4, 0x400

    .line 168
    .line 169
    if-eqz v4, :cond_c

    .line 170
    .line 171
    add-int/lit8 v3, v3, 0x1

    .line 172
    .line 173
    if-ne v3, v5, :cond_9

    .line 174
    .line 175
    move-object v14, v10

    .line 176
    goto :goto_6

    .line 177
    :cond_9
    if-nez v15, :cond_a

    .line 178
    .line 179
    new-instance v4, Lc15;

    .line 180
    .line 181
    new-array v15, v9, [Ljx4;

    .line 182
    .line 183
    invoke-direct {v4, v2, v15}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v15, v4

    .line 187
    :cond_a
    if-eqz v14, :cond_b

    .line 188
    .line 189
    invoke-virtual {v15, v14}, Lc15;->b(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    :cond_b
    invoke-virtual {v15, v10}, Lc15;->b(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    :goto_6
    iget-object v10, v10, Ljx4;->h0:Ljx4;

    .line 197
    .line 198
    const/4 v4, 0x2

    .line 199
    goto :goto_5

    .line 200
    :cond_d
    if-ne v3, v5, :cond_e

    .line 201
    .line 202
    :goto_7
    const/4 v3, 0x3

    .line 203
    const/4 v4, 0x2

    .line 204
    goto :goto_4

    .line 205
    :cond_e
    :goto_8
    invoke-static {v15}, Lyn0;->T(Lc15;)Ljx4;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    goto :goto_7

    .line 210
    :cond_f
    iget-object v12, v12, Ljx4;->g0:Ljx4;

    .line 211
    .line 212
    const/4 v3, 0x3

    .line 213
    const/4 v4, 0x2

    .line 214
    goto :goto_3

    .line 215
    :cond_10
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    if-eqz v13, :cond_11

    .line 220
    .line 221
    iget-object v3, v13, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 222
    .line 223
    if-eqz v3, :cond_11

    .line 224
    .line 225
    iget-object v3, v3, Lt6;->h0:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v3, Lf18;

    .line 228
    .line 229
    move-object v12, v3

    .line 230
    goto :goto_9

    .line 231
    :cond_11
    const/4 v12, 0x0

    .line 232
    :goto_9
    const/4 v3, 0x3

    .line 233
    const/4 v4, 0x2

    .line 234
    goto :goto_2

    .line 235
    :cond_12
    const/4 v11, 0x0

    .line 236
    :cond_13
    new-array v3, v9, [Lai2;

    .line 237
    .line 238
    new-array v4, v9, [Lai2;

    .line 239
    .line 240
    iget-object v10, v0, Ljx4;->X:Ljx4;

    .line 241
    .line 242
    iget-boolean v10, v10, Ljx4;->p0:Z

    .line 243
    .line 244
    if-nez v10, :cond_14

    .line 245
    .line 246
    invoke-static {v8}, Lwc3;->b(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :cond_14
    iget-object v8, v0, Ljx4;->X:Ljx4;

    .line 250
    .line 251
    iget-object v8, v8, Ljx4;->g0:Ljx4;

    .line 252
    .line 253
    invoke-static {v0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    move v13, v2

    .line 258
    move v14, v13

    .line 259
    move v12, v5

    .line 260
    :goto_a
    if-eqz v10, :cond_24

    .line 261
    .line 262
    iget-object v15, v10, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 263
    .line 264
    iget-object v15, v15, Lt6;->i0:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v15, Ljx4;

    .line 267
    .line 268
    iget v15, v15, Ljx4;->f0:I

    .line 269
    .line 270
    and-int/lit16 v15, v15, 0x400

    .line 271
    .line 272
    if-eqz v15, :cond_22

    .line 273
    .line 274
    :goto_b
    if-eqz v8, :cond_22

    .line 275
    .line 276
    iget v15, v8, Ljx4;->Z:I

    .line 277
    .line 278
    and-int/lit16 v15, v15, 0x400

    .line 279
    .line 280
    if-eqz v15, :cond_21

    .line 281
    .line 282
    move-object v15, v8

    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    :goto_c
    if-eqz v15, :cond_21

    .line 286
    .line 287
    instance-of v9, v15, Lai2;

    .line 288
    .line 289
    if-eqz v9, :cond_1a

    .line 290
    .line 291
    move-object v9, v15

    .line 292
    check-cast v9, Lai2;

    .line 293
    .line 294
    if-eqz v11, :cond_15

    .line 295
    .line 296
    invoke-virtual {v11, v9}, Lc15;->j(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v18

    .line 300
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 301
    .line 302
    .line 303
    move-result-object v18

    .line 304
    move-object/from16 v5, v18

    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_15
    const/4 v5, 0x0

    .line 308
    :goto_d
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-static {v5, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_17

    .line 315
    .line 316
    add-int/lit8 v2, v13, 0x1

    .line 317
    .line 318
    array-length v5, v3

    .line 319
    if-ge v5, v2, :cond_16

    .line 320
    .line 321
    array-length v5, v3

    .line 322
    move-object/from16 v20, v1

    .line 323
    .line 324
    mul-int/lit8 v1, v5, 0x2

    .line 325
    .line 326
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    new-array v1, v1, [Ljava/lang/Object;

    .line 331
    .line 332
    move/from16 v21, v2

    .line 333
    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-static {v3, v2, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 336
    .line 337
    .line 338
    move-object v3, v1

    .line 339
    goto :goto_e

    .line 340
    :cond_16
    move-object/from16 v20, v1

    .line 341
    .line 342
    move/from16 v21, v2

    .line 343
    .line 344
    :goto_e
    aput-object v9, v3, v13

    .line 345
    .line 346
    move/from16 v13, v21

    .line 347
    .line 348
    goto :goto_10

    .line 349
    :cond_17
    move-object/from16 v20, v1

    .line 350
    .line 351
    add-int/lit8 v1, v14, 0x1

    .line 352
    .line 353
    array-length v2, v4

    .line 354
    if-ge v2, v1, :cond_18

    .line 355
    .line 356
    array-length v2, v4

    .line 357
    mul-int/lit8 v5, v2, 0x2

    .line 358
    .line 359
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    new-array v5, v5, [Ljava/lang/Object;

    .line 364
    .line 365
    move/from16 v21, v1

    .line 366
    .line 367
    const/4 v1, 0x0

    .line 368
    invoke-static {v4, v1, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 369
    .line 370
    .line 371
    move-object v4, v5

    .line 372
    goto :goto_f

    .line 373
    :cond_18
    move/from16 v21, v1

    .line 374
    .line 375
    :goto_f
    aput-object v9, v4, v14

    .line 376
    .line 377
    move/from16 v14, v21

    .line 378
    .line 379
    :goto_10
    if-ne v9, v6, :cond_19

    .line 380
    .line 381
    const/4 v12, 0x0

    .line 382
    :cond_19
    const/4 v1, 0x0

    .line 383
    goto :goto_11

    .line 384
    :cond_1a
    move-object/from16 v20, v1

    .line 385
    .line 386
    const/4 v1, 0x1

    .line 387
    :goto_11
    if-eqz v1, :cond_20

    .line 388
    .line 389
    iget v1, v15, Ljx4;->Z:I

    .line 390
    .line 391
    and-int/lit16 v1, v1, 0x400

    .line 392
    .line 393
    if-eqz v1, :cond_20

    .line 394
    .line 395
    instance-of v1, v15, Loh1;

    .line 396
    .line 397
    if-eqz v1, :cond_20

    .line 398
    .line 399
    move-object v1, v15

    .line 400
    check-cast v1, Loh1;

    .line 401
    .line 402
    iget-object v1, v1, Loh1;->r0:Ljx4;

    .line 403
    .line 404
    const/4 v2, 0x0

    .line 405
    :goto_12
    if-eqz v1, :cond_1f

    .line 406
    .line 407
    iget v5, v1, Ljx4;->Z:I

    .line 408
    .line 409
    and-int/lit16 v5, v5, 0x400

    .line 410
    .line 411
    if-eqz v5, :cond_1e

    .line 412
    .line 413
    add-int/lit8 v2, v2, 0x1

    .line 414
    .line 415
    const/4 v5, 0x1

    .line 416
    if-ne v2, v5, :cond_1b

    .line 417
    .line 418
    move-object v15, v1

    .line 419
    move/from16 v17, v2

    .line 420
    .line 421
    goto :goto_14

    .line 422
    :cond_1b
    if-nez v16, :cond_1c

    .line 423
    .line 424
    new-instance v5, Lc15;

    .line 425
    .line 426
    move/from16 v17, v2

    .line 427
    .line 428
    const/16 v9, 0x10

    .line 429
    .line 430
    new-array v2, v9, [Ljx4;

    .line 431
    .line 432
    const/4 v9, 0x0

    .line 433
    invoke-direct {v5, v9, v2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    goto :goto_13

    .line 437
    :cond_1c
    move/from16 v17, v2

    .line 438
    .line 439
    move-object/from16 v5, v16

    .line 440
    .line 441
    :goto_13
    if-eqz v15, :cond_1d

    .line 442
    .line 443
    invoke-virtual {v5, v15}, Lc15;->b(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    const/4 v15, 0x0

    .line 447
    :cond_1d
    invoke-virtual {v5, v1}, Lc15;->b(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    move-object/from16 v16, v5

    .line 451
    .line 452
    :goto_14
    move/from16 v2, v17

    .line 453
    .line 454
    :cond_1e
    iget-object v1, v1, Ljx4;->h0:Ljx4;

    .line 455
    .line 456
    goto :goto_12

    .line 457
    :cond_1f
    const/4 v5, 0x1

    .line 458
    if-ne v2, v5, :cond_20

    .line 459
    .line 460
    move-object/from16 v1, v20

    .line 461
    .line 462
    const/4 v2, 0x0

    .line 463
    :goto_15
    const/16 v9, 0x10

    .line 464
    .line 465
    goto/16 :goto_c

    .line 466
    .line 467
    :cond_20
    invoke-static/range {v16 .. v16}, Lyn0;->T(Lc15;)Ljx4;

    .line 468
    .line 469
    .line 470
    move-result-object v15

    .line 471
    move-object/from16 v1, v20

    .line 472
    .line 473
    const/4 v2, 0x0

    .line 474
    const/4 v5, 0x1

    .line 475
    goto :goto_15

    .line 476
    :cond_21
    move-object/from16 v20, v1

    .line 477
    .line 478
    iget-object v8, v8, Ljx4;->g0:Ljx4;

    .line 479
    .line 480
    move-object/from16 v1, v20

    .line 481
    .line 482
    const/4 v2, 0x0

    .line 483
    const/4 v5, 0x1

    .line 484
    const/16 v9, 0x10

    .line 485
    .line 486
    goto/16 :goto_b

    .line 487
    .line 488
    :cond_22
    move-object/from16 v20, v1

    .line 489
    .line 490
    invoke-virtual {v10}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    if-eqz v10, :cond_23

    .line 495
    .line 496
    iget-object v1, v10, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 497
    .line 498
    if-eqz v1, :cond_23

    .line 499
    .line 500
    iget-object v1, v1, Lt6;->h0:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v1, Lf18;

    .line 503
    .line 504
    move-object v8, v1

    .line 505
    goto :goto_16

    .line 506
    :cond_23
    const/4 v8, 0x0

    .line 507
    :goto_16
    move-object/from16 v1, v20

    .line 508
    .line 509
    const/4 v2, 0x0

    .line 510
    const/4 v5, 0x1

    .line 511
    const/16 v9, 0x10

    .line 512
    .line 513
    goto/16 :goto_a

    .line 514
    .line 515
    :cond_24
    move-object/from16 v20, v1

    .line 516
    .line 517
    if-eqz v12, :cond_25

    .line 518
    .line 519
    if-eqz v6, :cond_25

    .line 520
    .line 521
    const/4 v1, 0x0

    .line 522
    invoke-static {v6, v1}, Los4;->F(Lai2;Z)Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-nez v2, :cond_25

    .line 527
    .line 528
    :goto_17
    const/16 v19, 0x0

    .line 529
    .line 530
    goto/16 :goto_1d

    .line 531
    .line 532
    :cond_25
    new-instance v1, Ltb2;

    .line 533
    .line 534
    const/4 v5, 0x1

    .line 535
    invoke-direct {v1, v0, v5}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 536
    .line 537
    .line 538
    invoke-static {v0, v1}, Lch3;->N(Ljx4;Ldn2;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0}, Lai2;->d1()Lyh2;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-eqz v1, :cond_28

    .line 550
    .line 551
    if-eq v1, v5, :cond_27

    .line 552
    .line 553
    const/4 v2, 0x2

    .line 554
    if-eq v1, v2, :cond_28

    .line 555
    .line 556
    const/4 v2, 0x3

    .line 557
    if-ne v1, v2, :cond_26

    .line 558
    .line 559
    goto :goto_18

    .line 560
    :cond_26
    invoke-static {}, Lb61;->c()V

    .line 561
    .line 562
    .line 563
    const/16 v19, 0x0

    .line 564
    .line 565
    return v19

    .line 566
    :cond_27
    :goto_18
    invoke-static {v0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-interface {v1}, Lmf5;->getFocusOwner()Leh2;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    check-cast v1, Lgh2;

    .line 575
    .line 576
    invoke-virtual {v1, v0}, Lgh2;->i(Lai2;)V

    .line 577
    .line 578
    .line 579
    :cond_28
    sget-object v1, Lyh2;->Z:Lyh2;

    .line 580
    .line 581
    sget-object v2, Lyh2;->X:Lyh2;

    .line 582
    .line 583
    if-eqz v12, :cond_29

    .line 584
    .line 585
    if-eqz v6, :cond_29

    .line 586
    .line 587
    invoke-virtual {v6, v2, v1}, Lai2;->Z0(Lyh2;Lyh2;)V

    .line 588
    .line 589
    .line 590
    :cond_29
    sget-object v3, Lyh2;->Y:Lyh2;

    .line 591
    .line 592
    if-eqz v11, :cond_2b

    .line 593
    .line 594
    iget v5, v11, Lc15;->Z:I

    .line 595
    .line 596
    const/16 v18, 0x1

    .line 597
    .line 598
    add-int/lit8 v5, v5, -0x1

    .line 599
    .line 600
    iget-object v8, v11, Lc15;->X:[Ljava/lang/Object;

    .line 601
    .line 602
    array-length v9, v8

    .line 603
    if-ge v5, v9, :cond_2b

    .line 604
    .line 605
    :goto_19
    if-ltz v5, :cond_2b

    .line 606
    .line 607
    aget-object v9, v8, v5

    .line 608
    .line 609
    check-cast v9, Lai2;

    .line 610
    .line 611
    invoke-virtual/range {v20 .. v20}, Lgh2;->f()Lai2;

    .line 612
    .line 613
    .line 614
    move-result-object v10

    .line 615
    if-eq v10, v0, :cond_2a

    .line 616
    .line 617
    goto :goto_17

    .line 618
    :cond_2a
    invoke-virtual {v9, v3, v1}, Lai2;->Z0(Lyh2;Lyh2;)V

    .line 619
    .line 620
    .line 621
    add-int/lit8 v5, v5, -0x1

    .line 622
    .line 623
    goto :goto_19

    .line 624
    :cond_2b
    const/16 v18, 0x1

    .line 625
    .line 626
    add-int/lit8 v14, v14, -0x1

    .line 627
    .line 628
    array-length v5, v4

    .line 629
    if-ge v14, v5, :cond_2e

    .line 630
    .line 631
    :goto_1a
    if-ltz v14, :cond_2e

    .line 632
    .line 633
    aget-object v5, v4, v14

    .line 634
    .line 635
    check-cast v5, Lai2;

    .line 636
    .line 637
    invoke-virtual/range {v20 .. v20}, Lgh2;->f()Lai2;

    .line 638
    .line 639
    .line 640
    move-result-object v8

    .line 641
    if-eq v8, v0, :cond_2c

    .line 642
    .line 643
    :goto_1b
    goto :goto_17

    .line 644
    :cond_2c
    if-ne v5, v6, :cond_2d

    .line 645
    .line 646
    move-object v8, v2

    .line 647
    goto :goto_1c

    .line 648
    :cond_2d
    move-object v8, v1

    .line 649
    :goto_1c
    invoke-virtual {v5, v8, v3}, Lai2;->Z0(Lyh2;Lyh2;)V

    .line 650
    .line 651
    .line 652
    add-int/lit8 v14, v14, -0x1

    .line 653
    .line 654
    goto :goto_1a

    .line 655
    :cond_2e
    invoke-virtual/range {v20 .. v20}, Lgh2;->f()Lai2;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    if-eq v1, v0, :cond_2f

    .line 660
    .line 661
    goto/16 :goto_17

    .line 662
    .line 663
    :cond_2f
    invoke-virtual {v0, v7, v2}, Lai2;->Z0(Lyh2;Lyh2;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v20 .. v20}, Lgh2;->f()Lai2;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    if-eq v1, v0, :cond_30

    .line 671
    .line 672
    goto :goto_1b

    .line 673
    :goto_1d
    return v19

    .line 674
    :cond_30
    const/16 v18, 0x1

    .line 675
    .line 676
    :goto_1e
    return v18
.end method

.method public final Z0(Lyh2;Lyh2;)V
    .locals 11

    .line 1
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lmf5;->getFocusOwner()Leh2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lgh2;

    .line 10
    .line 11
    invoke-virtual {v0}, Lgh2;->f()Lai2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lai2;->q0:Lrn2;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v2, p1, p2}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Ljx4;->X:Ljx4;

    .line 29
    .line 30
    iget-boolean v2, p1, Ljx4;->p0:Z

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    const-string v2, "visitAncestors called on an unattached node"

    .line 35
    .line 36
    invoke-static {v2}, Lwc3;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v2, p0, Ljx4;->X:Ljx4;

    .line 40
    .line 41
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    if-eqz p0, :cond_e

    .line 46
    .line 47
    iget-object v3, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 48
    .line 49
    iget-object v3, v3, Lt6;->i0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Ljx4;

    .line 52
    .line 53
    iget v3, v3, Ljx4;->f0:I

    .line 54
    .line 55
    and-int/lit16 v3, v3, 0x1400

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz v3, :cond_c

    .line 59
    .line 60
    :goto_1
    if-eqz v2, :cond_c

    .line 61
    .line 62
    iget v3, v2, Ljx4;->Z:I

    .line 63
    .line 64
    and-int/lit16 v5, v3, 0x1400

    .line 65
    .line 66
    if-eqz v5, :cond_b

    .line 67
    .line 68
    if-eq v2, p1, :cond_2

    .line 69
    .line 70
    and-int/lit16 v5, v3, 0x400

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_2
    and-int/lit16 v3, v3, 0x1000

    .line 77
    .line 78
    if-eqz v3, :cond_b

    .line 79
    .line 80
    move-object v3, v2

    .line 81
    move-object v5, v4

    .line 82
    :goto_2
    if-eqz v3, :cond_b

    .line 83
    .line 84
    instance-of v6, v3, Lvg2;

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    check-cast v3, Lvg2;

    .line 89
    .line 90
    invoke-virtual {v0}, Lgh2;->f()Lai2;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eq v1, v6, :cond_3

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_3
    invoke-interface {v3, p2}, Lvg2;->H(Lyh2;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_4
    iget v6, v3, Ljx4;->Z:I

    .line 102
    .line 103
    and-int/lit16 v6, v6, 0x1000

    .line 104
    .line 105
    if-eqz v6, :cond_a

    .line 106
    .line 107
    instance-of v6, v3, Loh1;

    .line 108
    .line 109
    if-eqz v6, :cond_a

    .line 110
    .line 111
    move-object v6, v3

    .line 112
    check-cast v6, Loh1;

    .line 113
    .line 114
    iget-object v6, v6, Loh1;->r0:Ljx4;

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    move v8, v7

    .line 118
    :goto_3
    const/4 v9, 0x1

    .line 119
    if-eqz v6, :cond_9

    .line 120
    .line 121
    iget v10, v6, Ljx4;->Z:I

    .line 122
    .line 123
    and-int/lit16 v10, v10, 0x1000

    .line 124
    .line 125
    if-eqz v10, :cond_8

    .line 126
    .line 127
    add-int/lit8 v8, v8, 0x1

    .line 128
    .line 129
    if-ne v8, v9, :cond_5

    .line 130
    .line 131
    move-object v3, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    if-nez v5, :cond_6

    .line 134
    .line 135
    new-instance v5, Lc15;

    .line 136
    .line 137
    const/16 v9, 0x10

    .line 138
    .line 139
    new-array v9, v9, [Ljx4;

    .line 140
    .line 141
    invoke-direct {v5, v7, v9}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    if-eqz v3, :cond_7

    .line 145
    .line 146
    invoke-virtual {v5, v3}, Lc15;->b(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    move-object v3, v4

    .line 150
    :cond_7
    invoke-virtual {v5, v6}, Lc15;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_8
    :goto_4
    iget-object v6, v6, Ljx4;->h0:Ljx4;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    if-ne v8, v9, :cond_a

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_a
    :goto_5
    invoke-static {v5}, Lyn0;->T(Lc15;)Ljx4;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    goto :goto_2

    .line 164
    :cond_b
    iget-object v2, v2, Ljx4;->g0:Ljx4;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_c
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    if-eqz p0, :cond_d

    .line 172
    .line 173
    iget-object v2, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 174
    .line 175
    if-eqz v2, :cond_d

    .line 176
    .line 177
    iget-object v2, v2, Lt6;->h0:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Lf18;

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_d
    move-object v2, v4

    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_e
    :goto_6
    return-void
.end method

.method public final a1()Ljh2;
    .locals 11

    .line 1
    new-instance v0, Ljh2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Ljh2;->a:Z

    .line 8
    .line 9
    sget-object v2, Loh2;->b:Loh2;

    .line 10
    .line 11
    iput-object v2, v0, Ljh2;->b:Loh2;

    .line 12
    .line 13
    iput-object v2, v0, Ljh2;->c:Loh2;

    .line 14
    .line 15
    iput-object v2, v0, Ljh2;->d:Loh2;

    .line 16
    .line 17
    iput-object v2, v0, Ljh2;->e:Loh2;

    .line 18
    .line 19
    iput-object v2, v0, Ljh2;->f:Loh2;

    .line 20
    .line 21
    iput-object v2, v0, Ljh2;->g:Loh2;

    .line 22
    .line 23
    iput-object v2, v0, Ljh2;->h:Loh2;

    .line 24
    .line 25
    iput-object v2, v0, Ljh2;->i:Loh2;

    .line 26
    .line 27
    new-instance v2, Lya2;

    .line 28
    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    invoke-direct {v2, v3}, Lya2;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, Ljh2;->j:Lgn2;

    .line 35
    .line 36
    new-instance v2, Lya2;

    .line 37
    .line 38
    const/16 v3, 0x9

    .line 39
    .line 40
    invoke-direct {v2, v3}, Lya2;-><init>(B)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v0, Ljh2;->k:Lgn2;

    .line 44
    .line 45
    sget-object v2, Loy1;->A0:Ls86;

    .line 46
    .line 47
    iput-object v2, v0, Ljh2;->l:Ls86;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    iget-byte v3, p0, Lai2;->t0:B

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    if-ne v3, v1, :cond_0

    .line 54
    .line 55
    move v3, v1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    if-nez v3, :cond_2

    .line 58
    .line 59
    sget-object v3, Ly01;->m:Lox1;

    .line 60
    .line 61
    invoke-static {p0, v3}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lyd3;

    .line 66
    .line 67
    check-cast v3, Lzd3;

    .line 68
    .line 69
    iget-object v3, v3, Lzd3;->a:Lrh5;

    .line 70
    .line 71
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lxd3;

    .line 76
    .line 77
    iget v3, v3, Lxd3;->a:I

    .line 78
    .line 79
    if-ne v3, v1, :cond_1

    .line 80
    .line 81
    move v3, v1

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v3, v4

    .line 84
    :goto_0
    xor-int/2addr v3, v1

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const/4 v5, 0x2

    .line 87
    if-ne v3, v5, :cond_10

    .line 88
    .line 89
    move v3, v4

    .line 90
    :goto_1
    iput-boolean v3, v0, Ljh2;->a:Z

    .line 91
    .line 92
    iget-object v3, p0, Ljx4;->X:Ljx4;

    .line 93
    .line 94
    iget-boolean v5, v3, Ljx4;->p0:Z

    .line 95
    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    const-string v5, "visitAncestors called on an unattached node"

    .line 99
    .line 100
    invoke-static {v5}, Lwc3;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    iget-object v5, p0, Ljx4;->X:Ljx4;

    .line 104
    .line 105
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    :goto_2
    if-eqz p0, :cond_f

    .line 110
    .line 111
    iget-object v6, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 112
    .line 113
    iget-object v6, v6, Lt6;->i0:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v6, Ljx4;

    .line 116
    .line 117
    iget v6, v6, Ljx4;->f0:I

    .line 118
    .line 119
    and-int/lit16 v6, v6, 0xc00

    .line 120
    .line 121
    if-eqz v6, :cond_d

    .line 122
    .line 123
    :goto_3
    if-eqz v5, :cond_d

    .line 124
    .line 125
    iget v6, v5, Ljx4;->Z:I

    .line 126
    .line 127
    and-int/lit16 v7, v6, 0xc00

    .line 128
    .line 129
    if-eqz v7, :cond_c

    .line 130
    .line 131
    if-eq v5, v3, :cond_4

    .line 132
    .line 133
    and-int/lit16 v7, v6, 0x400

    .line 134
    .line 135
    if-eqz v7, :cond_4

    .line 136
    .line 137
    goto/16 :goto_8

    .line 138
    .line 139
    :cond_4
    and-int/lit16 v6, v6, 0x800

    .line 140
    .line 141
    if-eqz v6, :cond_c

    .line 142
    .line 143
    move-object v7, v2

    .line 144
    move-object v6, v5

    .line 145
    :goto_4
    if-eqz v6, :cond_c

    .line 146
    .line 147
    instance-of v8, v6, Llh2;

    .line 148
    .line 149
    if-eqz v8, :cond_5

    .line 150
    .line 151
    check-cast v6, Llh2;

    .line 152
    .line 153
    invoke-interface {v6, v0}, Llh2;->E(Lhh2;)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_5
    iget v8, v6, Ljx4;->Z:I

    .line 158
    .line 159
    and-int/lit16 v8, v8, 0x800

    .line 160
    .line 161
    if-eqz v8, :cond_b

    .line 162
    .line 163
    instance-of v8, v6, Loh1;

    .line 164
    .line 165
    if-eqz v8, :cond_b

    .line 166
    .line 167
    move-object v8, v6

    .line 168
    check-cast v8, Loh1;

    .line 169
    .line 170
    iget-object v8, v8, Loh1;->r0:Ljx4;

    .line 171
    .line 172
    move v9, v4

    .line 173
    :goto_5
    if-eqz v8, :cond_a

    .line 174
    .line 175
    iget v10, v8, Ljx4;->Z:I

    .line 176
    .line 177
    and-int/lit16 v10, v10, 0x800

    .line 178
    .line 179
    if-eqz v10, :cond_9

    .line 180
    .line 181
    add-int/lit8 v9, v9, 0x1

    .line 182
    .line 183
    if-ne v9, v1, :cond_6

    .line 184
    .line 185
    move-object v6, v8

    .line 186
    goto :goto_6

    .line 187
    :cond_6
    if-nez v7, :cond_7

    .line 188
    .line 189
    new-instance v7, Lc15;

    .line 190
    .line 191
    const/16 v10, 0x10

    .line 192
    .line 193
    new-array v10, v10, [Ljx4;

    .line 194
    .line 195
    invoke-direct {v7, v4, v10}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_7
    if-eqz v6, :cond_8

    .line 199
    .line 200
    invoke-virtual {v7, v6}, Lc15;->b(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    move-object v6, v2

    .line 204
    :cond_8
    invoke-virtual {v7, v8}, Lc15;->b(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_9
    :goto_6
    iget-object v8, v8, Ljx4;->h0:Ljx4;

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_a
    if-ne v9, v1, :cond_b

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    :goto_7
    invoke-static {v7}, Lyn0;->T(Lc15;)Ljx4;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    goto :goto_4

    .line 218
    :cond_c
    iget-object v5, v5, Ljx4;->g0:Ljx4;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_d
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    if-eqz p0, :cond_e

    .line 226
    .line 227
    iget-object v5, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 228
    .line 229
    if-eqz v5, :cond_e

    .line 230
    .line 231
    iget-object v5, v5, Lt6;->h0:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v5, Lf18;

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_e
    move-object v5, v2

    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_f
    :goto_8
    return-object v0

    .line 240
    :cond_10
    const-string p0, "Unknown Focusability"

    .line 241
    .line 242
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-object v2
.end method

.method public final b1(Ly24;)Ls86;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lai2;->a1()Ljh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ljh2;->l:Ls86;

    .line 6
    .line 7
    sget-object v1, Loy1;->A0:Ls86;

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {p0}, Lyn0;->Y(Lnh1;)Li55;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1, p0, v2, v3}, Ly24;->F(Ly24;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-virtual {v0, p0, p1}, Ls86;->k(J)Ls86;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Lyn0;->Y(Lnh1;)Li55;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-interface {p1, p0, v0}, Ly24;->H(Ly24;Z)Ls86;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {p0}, Lyn0;->Y(Lnh1;)Li55;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-wide p0, p0, Leo5;->Z:J

    .line 46
    .line 47
    invoke-static {p0, p1}, Lu15;->R(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-static {v2, v3, p0, p1}, Lu70;->n(JJ)Ls86;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final c1()Lv54;
    .locals 6

    .line 1
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 2
    .line 3
    iget-boolean v0, v0, Ljx4;->p0:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ljx4;->X:Ljx4;

    .line 13
    .line 14
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 15
    .line 16
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_d

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 24
    .line 25
    iget-object v2, v2, Lt6;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ljx4;

    .line 28
    .line 29
    iget v2, v2, Ljx4;->f0:I

    .line 30
    .line 31
    const v3, 0x800020

    .line 32
    .line 33
    .line 34
    and-int/2addr v2, v3

    .line 35
    if-eqz v2, :cond_b

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_b

    .line 38
    .line 39
    iget v2, v0, Ljx4;->Z:I

    .line 40
    .line 41
    and-int v4, v2, v3

    .line 42
    .line 43
    if-eqz v4, :cond_a

    .line 44
    .line 45
    const/high16 v4, 0x800000

    .line 46
    .line 47
    and-int/2addr v4, v2

    .line 48
    if-eqz v4, :cond_5

    .line 49
    .line 50
    instance-of p0, v0, Lv54;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    instance-of p0, v0, Loh1;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    check-cast v0, Loh1;

    .line 60
    .line 61
    iget-object p0, v0, Loh1;->r0:Ljx4;

    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :goto_2
    if-eqz p0, :cond_4

    .line 65
    .line 66
    instance-of v2, p0, Lv54;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    :cond_2
    iget-object p0, p0, Ljx4;->h0:Ljx4;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v0, v1

    .line 75
    :cond_4
    :goto_3
    check-cast v0, Lv54;

    .line 76
    .line 77
    if-eqz v0, :cond_d

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_5
    and-int/lit8 v2, v2, 0x20

    .line 81
    .line 82
    if-eqz v2, :cond_a

    .line 83
    .line 84
    instance-of v2, v0, Lnx4;

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    move-object v4, v0

    .line 89
    goto :goto_5

    .line 90
    :cond_6
    instance-of v2, v0, Loh1;

    .line 91
    .line 92
    if-eqz v2, :cond_8

    .line 93
    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, Loh1;

    .line 96
    .line 97
    iget-object v2, v2, Loh1;->r0:Ljx4;

    .line 98
    .line 99
    move-object v4, v1

    .line 100
    :goto_4
    if-eqz v2, :cond_9

    .line 101
    .line 102
    instance-of v5, v2, Lnx4;

    .line 103
    .line 104
    if-eqz v5, :cond_7

    .line 105
    .line 106
    move-object v4, v2

    .line 107
    :cond_7
    iget-object v2, v2, Ljx4;->h0:Ljx4;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    move-object v4, v1

    .line 111
    :cond_9
    :goto_5
    check-cast v4, Lnx4;

    .line 112
    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    invoke-interface {v4}, Lnx4;->Z()Lwl7;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    sget-object v5, Ljb5;->X:Lr06;

    .line 120
    .line 121
    invoke-virtual {v2, v5}, Lwl7;->v(Lr06;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_a

    .line 126
    .line 127
    invoke-interface {v4}, Lnx4;->Z()Lwl7;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0, v5}, Lwl7;->C(Lr06;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lv54;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_a
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_b
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_c

    .line 146
    .line 147
    iget-object v0, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 148
    .line 149
    if-eqz v0, :cond_c

    .line 150
    .line 151
    iget-object v0, v0, Lt6;->h0:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lf18;

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_c
    move-object v0, v1

    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_d
    return-object v1
.end method

.method public final d1()Lyh2;
    .locals 11

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    sget-object v1, Lyh2;->Z:Lyh2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lmf5;->getFocusOwner()Leh2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lgh2;

    .line 17
    .line 18
    invoke-virtual {v0}, Lgh2;->f()Lai2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    if-ne p0, v0, :cond_2

    .line 26
    .line 27
    sget-object p0, Lyh2;->X:Lyh2;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    iget-boolean v2, v0, Ljx4;->p0:Z

    .line 31
    .line 32
    if-eqz v2, :cond_e

    .line 33
    .line 34
    iget-object v2, v0, Ljx4;->X:Ljx4;

    .line 35
    .line 36
    iget-boolean v2, v2, Ljx4;->p0:Z

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    const-string v2, "visitAncestors called on an unattached node"

    .line 41
    .line 42
    invoke-static {v2}, Lwc3;->b(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    iget-object v2, v0, Ljx4;->X:Ljx4;

    .line 46
    .line 47
    iget-object v2, v2, Ljx4;->g0:Ljx4;

    .line 48
    .line 49
    invoke-static {v0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    if-eqz v0, :cond_e

    .line 54
    .line 55
    iget-object v3, v0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 56
    .line 57
    iget-object v3, v3, Lt6;->i0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Ljx4;

    .line 60
    .line 61
    iget v3, v3, Ljx4;->f0:I

    .line 62
    .line 63
    and-int/lit16 v3, v3, 0x400

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    if-eqz v3, :cond_c

    .line 67
    .line 68
    :goto_1
    if-eqz v2, :cond_c

    .line 69
    .line 70
    iget v3, v2, Ljx4;->Z:I

    .line 71
    .line 72
    and-int/lit16 v3, v3, 0x400

    .line 73
    .line 74
    if-eqz v3, :cond_b

    .line 75
    .line 76
    move-object v3, v2

    .line 77
    move-object v5, v4

    .line 78
    :goto_2
    if-eqz v3, :cond_b

    .line 79
    .line 80
    instance-of v6, v3, Lai2;

    .line 81
    .line 82
    if-eqz v6, :cond_4

    .line 83
    .line 84
    check-cast v3, Lai2;

    .line 85
    .line 86
    if-ne p0, v3, :cond_a

    .line 87
    .line 88
    sget-object p0, Lyh2;->Y:Lyh2;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    iget v6, v3, Ljx4;->Z:I

    .line 92
    .line 93
    and-int/lit16 v6, v6, 0x400

    .line 94
    .line 95
    if-eqz v6, :cond_a

    .line 96
    .line 97
    instance-of v6, v3, Loh1;

    .line 98
    .line 99
    if-eqz v6, :cond_a

    .line 100
    .line 101
    move-object v6, v3

    .line 102
    check-cast v6, Loh1;

    .line 103
    .line 104
    iget-object v6, v6, Loh1;->r0:Ljx4;

    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    move v8, v7

    .line 108
    :goto_3
    const/4 v9, 0x1

    .line 109
    if-eqz v6, :cond_9

    .line 110
    .line 111
    iget v10, v6, Ljx4;->Z:I

    .line 112
    .line 113
    and-int/lit16 v10, v10, 0x400

    .line 114
    .line 115
    if-eqz v10, :cond_8

    .line 116
    .line 117
    add-int/lit8 v8, v8, 0x1

    .line 118
    .line 119
    if-ne v8, v9, :cond_5

    .line 120
    .line 121
    move-object v3, v6

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    if-nez v5, :cond_6

    .line 124
    .line 125
    new-instance v5, Lc15;

    .line 126
    .line 127
    const/16 v9, 0x10

    .line 128
    .line 129
    new-array v9, v9, [Ljx4;

    .line 130
    .line 131
    invoke-direct {v5, v7, v9}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    if-eqz v3, :cond_7

    .line 135
    .line 136
    invoke-virtual {v5, v3}, Lc15;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object v3, v4

    .line 140
    :cond_7
    invoke-virtual {v5, v6}, Lc15;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    :goto_4
    iget-object v6, v6, Ljx4;->h0:Ljx4;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    if-ne v8, v9, :cond_a

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_a
    invoke-static {v5}, Lyn0;->T(Lc15;)Ljx4;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    goto :goto_2

    .line 154
    :cond_b
    iget-object v2, v2, Ljx4;->g0:Ljx4;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_c
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_d

    .line 162
    .line 163
    iget-object v2, v0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 164
    .line 165
    if-eqz v2, :cond_d

    .line 166
    .line 167
    iget-object v2, v2, Lt6;->h0:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Lf18;

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_d
    move-object v2, v4

    .line 173
    goto :goto_0

    .line 174
    :cond_e
    return-object v1
.end method

.method public final e1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lai2;->d1()Lyh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Lea6;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lp5;

    .line 31
    .line 32
    const/16 v3, 0x17

    .line 33
    .line 34
    invoke-direct {v2, v0, p0, v3}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v2}, Lch3;->N(Ljx4;Ldn2;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    check-cast v0, Lhh2;

    .line 45
    .line 46
    invoke-interface {v0}, Lhh2;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, Lmf5;->getFocusOwner()Leh2;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lgh2;

    .line 61
    .line 62
    const/16 v0, 0x8

    .line 63
    .line 64
    invoke-virtual {p0, v0, v1, v1}, Lgh2;->b(IZZ)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    return-void

    .line 68
    :cond_3
    const-string p0, "focusProperties"

    .line 69
    .line 70
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    throw p0
.end method

.method public final f1()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g1(I)Z
    .locals 1

    .line 1
    const-string v0, "FocusTransactions:requestFocus"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lai2;->a1()Ljh2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v0, v0, Ljh2;->a:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lai2;->Y0()Z

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    :try_start_1
    new-instance v0, Lya2;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lya2;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v0}, Lgs8;->h(Lai2;ILgn2;)Z

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public final q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lai2;->e1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

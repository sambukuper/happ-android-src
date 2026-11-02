.class public final Lxo0;
.super Lk09;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final k:Ljava/util/ArrayList;

.field public l:I


# direct methods
.method public constructor <init>(Lm31;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lk09;-><init>(Lm31;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput p2, p0, Lk09;->f:I

    .line 12
    .line 13
    iget-object v0, p0, Lk09;->b:Lm31;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lm31;->m(I)Lm31;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    move-object v3, v0

    .line 20
    move-object v0, p2

    .line 21
    move-object p2, v3

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget p2, p0, Lk09;->f:I

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Lm31;->m(I)Lm31;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput-object p2, p0, Lk09;->b:Lm31;

    .line 32
    .line 33
    iget v0, p0, Lk09;->f:I

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x1

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p2, Lm31;->d:Ly03;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    if-ne v0, v2, :cond_2

    .line 43
    .line 44
    iget-object v0, p2, Lm31;->e:Lkv8;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v0, v1

    .line 48
    :goto_1
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget v0, p0, Lk09;->f:I

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Lm31;->l(I)Lm31;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :goto_2
    if-eqz p2, :cond_5

    .line 58
    .line 59
    iget v0, p0, Lk09;->f:I

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    iget-object v0, p2, Lm31;->d:Ly03;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    if-ne v0, v2, :cond_4

    .line 67
    .line 68
    iget-object v0, p2, Lm31;->e:Lkv8;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    move-object v0, v1

    .line 72
    :goto_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget v0, p0, Lk09;->f:I

    .line 76
    .line 77
    invoke-virtual {p2, v0}, Lm31;->l(I)Lm31;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :cond_6
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_8

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Lk09;

    .line 97
    .line 98
    iget v1, p0, Lk09;->f:I

    .line 99
    .line 100
    if-nez v1, :cond_7

    .line 101
    .line 102
    iget-object v0, v0, Lk09;->b:Lm31;

    .line 103
    .line 104
    iput-object p0, v0, Lm31;->b:Lxo0;

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    if-ne v1, v2, :cond_6

    .line 108
    .line 109
    iget-object v0, v0, Lk09;->b:Lm31;

    .line 110
    .line 111
    iput-object p0, v0, Lm31;->c:Lxo0;

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    iget p2, p0, Lk09;->f:I

    .line 115
    .line 116
    if-nez p2, :cond_9

    .line 117
    .line 118
    iget-object p2, p0, Lk09;->b:Lm31;

    .line 119
    .line 120
    iget-object p2, p2, Lm31;->T:Ln31;

    .line 121
    .line 122
    iget-boolean p2, p2, Ln31;->v0:Z

    .line 123
    .line 124
    if-eqz p2, :cond_9

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-le p2, v2, :cond_9

    .line 131
    .line 132
    invoke-static {v2, p1}, Loi0;->h(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lk09;

    .line 137
    .line 138
    iget-object p1, p1, Lk09;->b:Lm31;

    .line 139
    .line 140
    iput-object p1, p0, Lk09;->b:Lm31;

    .line 141
    .line 142
    :cond_9
    iget p1, p0, Lk09;->f:I

    .line 143
    .line 144
    iget-object p2, p0, Lk09;->b:Lm31;

    .line 145
    .line 146
    if-nez p1, :cond_a

    .line 147
    .line 148
    iget p1, p2, Lm31;->i0:I

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_a
    iget p1, p2, Lm31;->j0:I

    .line 152
    .line 153
    :goto_5
    iput p1, p0, Lxo0;->l:I

    .line 154
    .line 155
    return-void
.end method


# virtual methods
.method public final a(Lmi1;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk09;->h:Lsi1;

    .line 4
    .line 5
    iget-boolean v2, v1, Lsi1;->j:Z

    .line 6
    .line 7
    if-eqz v2, :cond_56

    .line 8
    .line 9
    iget-object v2, v0, Lk09;->i:Lsi1;

    .line 10
    .line 11
    iget-boolean v3, v2, Lsi1;->j:Z

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_32

    .line 16
    .line 17
    :cond_0
    iget-object v3, v0, Lk09;->b:Lm31;

    .line 18
    .line 19
    iget-object v3, v3, Lm31;->T:Ln31;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-boolean v3, v3, Ln31;->v0:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget v5, v2, Lsi1;->g:I

    .line 28
    .line 29
    iget v6, v1, Lsi1;->g:I

    .line 30
    .line 31
    sub-int/2addr v5, v6

    .line 32
    iget-object v6, v0, Lxo0;->k:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v8, 0x0

    .line 39
    :goto_1
    const/4 v9, -0x1

    .line 40
    const/16 v10, 0x8

    .line 41
    .line 42
    if-ge v8, v7, :cond_2

    .line 43
    .line 44
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    check-cast v11, Lk09;

    .line 49
    .line 50
    iget-object v11, v11, Lk09;->b:Lm31;

    .line 51
    .line 52
    iget v11, v11, Lm31;->g0:I

    .line 53
    .line 54
    if-ne v11, v10, :cond_3

    .line 55
    .line 56
    add-int/lit8 v8, v8, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v8, v9

    .line 60
    :cond_3
    add-int/lit8 v11, v7, -0x1

    .line 61
    .line 62
    move v12, v11

    .line 63
    :goto_2
    if-ltz v12, :cond_5

    .line 64
    .line 65
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    check-cast v13, Lk09;

    .line 70
    .line 71
    iget-object v13, v13, Lk09;->b:Lm31;

    .line 72
    .line 73
    iget v13, v13, Lm31;->g0:I

    .line 74
    .line 75
    if-ne v13, v10, :cond_4

    .line 76
    .line 77
    add-int/lit8 v12, v12, -0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move v9, v12

    .line 81
    :cond_5
    const/4 v12, 0x0

    .line 82
    :goto_3
    const/4 v15, 0x2

    .line 83
    const/16 p1, 0x0

    .line 84
    .line 85
    if-ge v12, v15, :cond_14

    .line 86
    .line 87
    move/from16 v19, p1

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/16 v18, 0x0

    .line 94
    .line 95
    :goto_4
    if-ge v4, v7, :cond_11

    .line 96
    .line 97
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v20

    .line 101
    move-object/from16 v13, v20

    .line 102
    .line 103
    check-cast v13, Lk09;

    .line 104
    .line 105
    iget-object v14, v13, Lk09;->b:Lm31;

    .line 106
    .line 107
    move/from16 v22, v3

    .line 108
    .line 109
    iget v3, v14, Lm31;->g0:I

    .line 110
    .line 111
    if-ne v3, v10, :cond_6

    .line 112
    .line 113
    move/from16 v24, v12

    .line 114
    .line 115
    goto/16 :goto_a

    .line 116
    .line 117
    :cond_6
    add-int/lit8 v18, v18, 0x1

    .line 118
    .line 119
    if-lez v4, :cond_7

    .line 120
    .line 121
    if-lt v4, v8, :cond_7

    .line 122
    .line 123
    iget-object v3, v13, Lk09;->h:Lsi1;

    .line 124
    .line 125
    iget v3, v3, Lsi1;->f:I

    .line 126
    .line 127
    add-int/2addr v15, v3

    .line 128
    :cond_7
    iget-object v3, v13, Lk09;->e:Lzo1;

    .line 129
    .line 130
    iget v10, v3, Lsi1;->g:I

    .line 131
    .line 132
    move/from16 v23, v10

    .line 133
    .line 134
    iget v10, v13, Lk09;->d:I

    .line 135
    .line 136
    move/from16 v24, v12

    .line 137
    .line 138
    const/4 v12, 0x3

    .line 139
    if-eq v10, v12, :cond_8

    .line 140
    .line 141
    const/4 v10, 0x1

    .line 142
    goto :goto_5

    .line 143
    :cond_8
    const/4 v10, 0x0

    .line 144
    :goto_5
    if-eqz v10, :cond_b

    .line 145
    .line 146
    iget v3, v0, Lk09;->f:I

    .line 147
    .line 148
    if-nez v3, :cond_9

    .line 149
    .line 150
    iget-object v12, v14, Lm31;->d:Ly03;

    .line 151
    .line 152
    iget-object v12, v12, Lk09;->e:Lzo1;

    .line 153
    .line 154
    iget-boolean v12, v12, Lsi1;->j:Z

    .line 155
    .line 156
    if-nez v12, :cond_9

    .line 157
    .line 158
    goto/16 :goto_32

    .line 159
    .line 160
    :cond_9
    const/4 v12, 0x1

    .line 161
    if-ne v3, v12, :cond_a

    .line 162
    .line 163
    iget-object v3, v14, Lm31;->e:Lkv8;

    .line 164
    .line 165
    iget-object v3, v3, Lk09;->e:Lzo1;

    .line 166
    .line 167
    iget-boolean v3, v3, Lsi1;->j:Z

    .line 168
    .line 169
    if-nez v3, :cond_a

    .line 170
    .line 171
    goto/16 :goto_32

    .line 172
    .line 173
    :cond_a
    move/from16 v25, v10

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_b
    move/from16 v25, v10

    .line 177
    .line 178
    const/4 v12, 0x1

    .line 179
    iget v10, v13, Lk09;->a:I

    .line 180
    .line 181
    if-ne v10, v12, :cond_c

    .line 182
    .line 183
    if-nez v24, :cond_c

    .line 184
    .line 185
    iget v10, v3, Lzo1;->m:I

    .line 186
    .line 187
    add-int/lit8 v17, v17, 0x1

    .line 188
    .line 189
    :goto_6
    const/16 v25, 0x1

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_c
    iget-boolean v3, v3, Lsi1;->j:Z

    .line 193
    .line 194
    if-eqz v3, :cond_d

    .line 195
    .line 196
    move/from16 v10, v23

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_d
    :goto_7
    move/from16 v10, v23

    .line 200
    .line 201
    :goto_8
    if-nez v25, :cond_e

    .line 202
    .line 203
    add-int/lit8 v17, v17, 0x1

    .line 204
    .line 205
    iget-object v3, v14, Lm31;->k0:[F

    .line 206
    .line 207
    iget v10, v0, Lk09;->f:I

    .line 208
    .line 209
    aget v3, v3, v10

    .line 210
    .line 211
    cmpl-float v10, v3, p1

    .line 212
    .line 213
    if-ltz v10, :cond_f

    .line 214
    .line 215
    add-float v19, v19, v3

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_e
    add-int/2addr v15, v10

    .line 219
    :cond_f
    :goto_9
    if-ge v4, v11, :cond_10

    .line 220
    .line 221
    if-ge v4, v9, :cond_10

    .line 222
    .line 223
    iget-object v3, v13, Lk09;->i:Lsi1;

    .line 224
    .line 225
    iget v3, v3, Lsi1;->f:I

    .line 226
    .line 227
    neg-int v3, v3

    .line 228
    add-int/2addr v15, v3

    .line 229
    :cond_10
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 230
    .line 231
    move/from16 v3, v22

    .line 232
    .line 233
    move/from16 v12, v24

    .line 234
    .line 235
    const/16 v10, 0x8

    .line 236
    .line 237
    goto/16 :goto_4

    .line 238
    .line 239
    :cond_11
    move/from16 v22, v3

    .line 240
    .line 241
    move/from16 v24, v12

    .line 242
    .line 243
    if-lt v15, v5, :cond_13

    .line 244
    .line 245
    if-nez v17, :cond_12

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_12
    add-int/lit8 v12, v24, 0x1

    .line 249
    .line 250
    move/from16 v3, v22

    .line 251
    .line 252
    const/16 v10, 0x8

    .line 253
    .line 254
    goto/16 :goto_3

    .line 255
    .line 256
    :cond_13
    :goto_b
    move/from16 v3, v17

    .line 257
    .line 258
    move/from16 v4, v18

    .line 259
    .line 260
    goto :goto_c

    .line 261
    :cond_14
    move/from16 v22, v3

    .line 262
    .line 263
    move/from16 v19, p1

    .line 264
    .line 265
    const/4 v3, 0x0

    .line 266
    const/4 v4, 0x0

    .line 267
    const/4 v15, 0x0

    .line 268
    :goto_c
    iget v1, v1, Lsi1;->g:I

    .line 269
    .line 270
    if-eqz v22, :cond_15

    .line 271
    .line 272
    iget v1, v2, Lsi1;->g:I

    .line 273
    .line 274
    :cond_15
    const/high16 v2, 0x3f000000    # 0.5f

    .line 275
    .line 276
    if-le v15, v5, :cond_17

    .line 277
    .line 278
    const/high16 v10, 0x40000000    # 2.0f

    .line 279
    .line 280
    if-eqz v22, :cond_16

    .line 281
    .line 282
    sub-int v12, v15, v5

    .line 283
    .line 284
    int-to-float v12, v12

    .line 285
    div-float/2addr v12, v10

    .line 286
    add-float/2addr v12, v2

    .line 287
    float-to-int v10, v12

    .line 288
    add-int/2addr v1, v10

    .line 289
    goto :goto_d

    .line 290
    :cond_16
    sub-int v12, v15, v5

    .line 291
    .line 292
    int-to-float v12, v12

    .line 293
    div-float/2addr v12, v10

    .line 294
    add-float/2addr v12, v2

    .line 295
    float-to-int v10, v12

    .line 296
    sub-int/2addr v1, v10

    .line 297
    :cond_17
    :goto_d
    if-lez v3, :cond_26

    .line 298
    .line 299
    sub-int v10, v5, v15

    .line 300
    .line 301
    int-to-float v10, v10

    .line 302
    int-to-float v12, v3

    .line 303
    div-float v12, v10, v12

    .line 304
    .line 305
    add-float/2addr v12, v2

    .line 306
    float-to-int v12, v12

    .line 307
    const/4 v13, 0x0

    .line 308
    const/4 v14, 0x0

    .line 309
    :goto_e
    if-ge v13, v7, :cond_1f

    .line 310
    .line 311
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v17

    .line 315
    move/from16 v18, v2

    .line 316
    .line 317
    move-object/from16 v2, v17

    .line 318
    .line 319
    check-cast v2, Lk09;

    .line 320
    .line 321
    move/from16 v17, v1

    .line 322
    .line 323
    iget-object v1, v2, Lk09;->b:Lm31;

    .line 324
    .line 325
    move/from16 v23, v3

    .line 326
    .line 327
    iget-object v3, v2, Lk09;->e:Lzo1;

    .line 328
    .line 329
    move/from16 v24, v10

    .line 330
    .line 331
    iget v10, v1, Lm31;->g0:I

    .line 332
    .line 333
    move/from16 v25, v12

    .line 334
    .line 335
    const/16 v12, 0x8

    .line 336
    .line 337
    if-ne v10, v12, :cond_19

    .line 338
    .line 339
    :cond_18
    move/from16 v26, v13

    .line 340
    .line 341
    goto :goto_12

    .line 342
    :cond_19
    iget v10, v2, Lk09;->d:I

    .line 343
    .line 344
    const/4 v12, 0x3

    .line 345
    if-ne v10, v12, :cond_18

    .line 346
    .line 347
    iget-boolean v10, v3, Lsi1;->j:Z

    .line 348
    .line 349
    if-nez v10, :cond_18

    .line 350
    .line 351
    cmpl-float v10, v19, p1

    .line 352
    .line 353
    if-lez v10, :cond_1a

    .line 354
    .line 355
    iget-object v10, v1, Lm31;->k0:[F

    .line 356
    .line 357
    iget v12, v0, Lk09;->f:I

    .line 358
    .line 359
    aget v10, v10, v12

    .line 360
    .line 361
    mul-float v10, v10, v24

    .line 362
    .line 363
    div-float v10, v10, v19

    .line 364
    .line 365
    add-float v10, v10, v18

    .line 366
    .line 367
    float-to-int v10, v10

    .line 368
    goto :goto_f

    .line 369
    :cond_1a
    move/from16 v10, v25

    .line 370
    .line 371
    :goto_f
    iget v12, v0, Lk09;->f:I

    .line 372
    .line 373
    if-nez v12, :cond_1b

    .line 374
    .line 375
    iget v12, v1, Lm31;->v:I

    .line 376
    .line 377
    iget v1, v1, Lm31;->u:I

    .line 378
    .line 379
    goto :goto_10

    .line 380
    :cond_1b
    iget v12, v1, Lm31;->y:I

    .line 381
    .line 382
    iget v1, v1, Lm31;->x:I

    .line 383
    .line 384
    :goto_10
    iget v2, v2, Lk09;->a:I

    .line 385
    .line 386
    move/from16 v26, v13

    .line 387
    .line 388
    const/4 v13, 0x1

    .line 389
    if-ne v2, v13, :cond_1c

    .line 390
    .line 391
    iget v2, v3, Lzo1;->m:I

    .line 392
    .line 393
    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    goto :goto_11

    .line 398
    :cond_1c
    move v2, v10

    .line 399
    :goto_11
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-lez v12, :cond_1d

    .line 404
    .line 405
    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    :cond_1d
    if-eq v1, v10, :cond_1e

    .line 410
    .line 411
    add-int/lit8 v14, v14, 0x1

    .line 412
    .line 413
    move v10, v1

    .line 414
    :cond_1e
    invoke-virtual {v3, v10}, Lzo1;->d(I)V

    .line 415
    .line 416
    .line 417
    :goto_12
    add-int/lit8 v13, v26, 0x1

    .line 418
    .line 419
    move/from16 v1, v17

    .line 420
    .line 421
    move/from16 v2, v18

    .line 422
    .line 423
    move/from16 v3, v23

    .line 424
    .line 425
    move/from16 v10, v24

    .line 426
    .line 427
    move/from16 v12, v25

    .line 428
    .line 429
    goto :goto_e

    .line 430
    :cond_1f
    move/from16 v17, v1

    .line 431
    .line 432
    move/from16 v18, v2

    .line 433
    .line 434
    move/from16 v23, v3

    .line 435
    .line 436
    if-lez v14, :cond_23

    .line 437
    .line 438
    sub-int v3, v23, v14

    .line 439
    .line 440
    const/4 v1, 0x0

    .line 441
    const/4 v15, 0x0

    .line 442
    :goto_13
    if-ge v1, v7, :cond_24

    .line 443
    .line 444
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    check-cast v2, Lk09;

    .line 449
    .line 450
    iget-object v10, v2, Lk09;->b:Lm31;

    .line 451
    .line 452
    iget v10, v10, Lm31;->g0:I

    .line 453
    .line 454
    const/16 v12, 0x8

    .line 455
    .line 456
    if-ne v10, v12, :cond_20

    .line 457
    .line 458
    goto :goto_14

    .line 459
    :cond_20
    if-lez v1, :cond_21

    .line 460
    .line 461
    if-lt v1, v8, :cond_21

    .line 462
    .line 463
    iget-object v10, v2, Lk09;->h:Lsi1;

    .line 464
    .line 465
    iget v10, v10, Lsi1;->f:I

    .line 466
    .line 467
    add-int/2addr v15, v10

    .line 468
    :cond_21
    iget-object v10, v2, Lk09;->e:Lzo1;

    .line 469
    .line 470
    iget v10, v10, Lsi1;->g:I

    .line 471
    .line 472
    add-int/2addr v15, v10

    .line 473
    if-ge v1, v11, :cond_22

    .line 474
    .line 475
    if-ge v1, v9, :cond_22

    .line 476
    .line 477
    iget-object v2, v2, Lk09;->i:Lsi1;

    .line 478
    .line 479
    iget v2, v2, Lsi1;->f:I

    .line 480
    .line 481
    neg-int v2, v2

    .line 482
    add-int/2addr v15, v2

    .line 483
    :cond_22
    :goto_14
    add-int/lit8 v1, v1, 0x1

    .line 484
    .line 485
    goto :goto_13

    .line 486
    :cond_23
    move/from16 v3, v23

    .line 487
    .line 488
    :cond_24
    iget v1, v0, Lxo0;->l:I

    .line 489
    .line 490
    const/4 v2, 0x2

    .line 491
    if-ne v1, v2, :cond_25

    .line 492
    .line 493
    if-nez v14, :cond_25

    .line 494
    .line 495
    const/4 v1, 0x0

    .line 496
    iput v1, v0, Lxo0;->l:I

    .line 497
    .line 498
    goto :goto_15

    .line 499
    :cond_25
    const/4 v1, 0x0

    .line 500
    goto :goto_15

    .line 501
    :cond_26
    move/from16 v17, v1

    .line 502
    .line 503
    move/from16 v18, v2

    .line 504
    .line 505
    move/from16 v23, v3

    .line 506
    .line 507
    const/4 v1, 0x0

    .line 508
    const/4 v2, 0x2

    .line 509
    :goto_15
    if-le v15, v5, :cond_27

    .line 510
    .line 511
    iput v2, v0, Lxo0;->l:I

    .line 512
    .line 513
    :cond_27
    if-lez v4, :cond_28

    .line 514
    .line 515
    if-nez v3, :cond_28

    .line 516
    .line 517
    if-ne v8, v9, :cond_28

    .line 518
    .line 519
    iput v2, v0, Lxo0;->l:I

    .line 520
    .line 521
    :cond_28
    iget v2, v0, Lxo0;->l:I

    .line 522
    .line 523
    const/4 v12, 0x1

    .line 524
    if-ne v2, v12, :cond_38

    .line 525
    .line 526
    if-le v4, v12, :cond_29

    .line 527
    .line 528
    sub-int/2addr v5, v15

    .line 529
    sub-int/2addr v4, v12

    .line 530
    div-int/2addr v5, v4

    .line 531
    goto :goto_16

    .line 532
    :cond_29
    if-ne v4, v12, :cond_2a

    .line 533
    .line 534
    sub-int/2addr v5, v15

    .line 535
    const/16 v16, 0x2

    .line 536
    .line 537
    div-int/lit8 v5, v5, 0x2

    .line 538
    .line 539
    goto :goto_16

    .line 540
    :cond_2a
    move v5, v1

    .line 541
    :goto_16
    if-lez v3, :cond_2b

    .line 542
    .line 543
    move v5, v1

    .line 544
    :cond_2b
    move v4, v1

    .line 545
    move/from16 v1, v17

    .line 546
    .line 547
    :goto_17
    if-ge v4, v7, :cond_56

    .line 548
    .line 549
    if-eqz v22, :cond_2c

    .line 550
    .line 551
    add-int/lit8 v0, v4, 0x1

    .line 552
    .line 553
    sub-int v0, v7, v0

    .line 554
    .line 555
    goto :goto_18

    .line 556
    :cond_2c
    move v0, v4

    .line 557
    :goto_18
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, Lk09;

    .line 562
    .line 563
    iget-object v2, v0, Lk09;->b:Lm31;

    .line 564
    .line 565
    iget-object v3, v0, Lk09;->i:Lsi1;

    .line 566
    .line 567
    iget-object v10, v0, Lk09;->h:Lsi1;

    .line 568
    .line 569
    iget v2, v2, Lm31;->g0:I

    .line 570
    .line 571
    const/16 v12, 0x8

    .line 572
    .line 573
    if-ne v2, v12, :cond_2d

    .line 574
    .line 575
    invoke-virtual {v10, v1}, Lsi1;->d(I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3, v1}, Lsi1;->d(I)V

    .line 579
    .line 580
    .line 581
    goto :goto_1f

    .line 582
    :cond_2d
    if-lez v4, :cond_2f

    .line 583
    .line 584
    if-eqz v22, :cond_2e

    .line 585
    .line 586
    sub-int/2addr v1, v5

    .line 587
    goto :goto_19

    .line 588
    :cond_2e
    add-int/2addr v1, v5

    .line 589
    :cond_2f
    :goto_19
    if-lez v4, :cond_31

    .line 590
    .line 591
    if-lt v4, v8, :cond_31

    .line 592
    .line 593
    if-eqz v22, :cond_30

    .line 594
    .line 595
    iget v2, v10, Lsi1;->f:I

    .line 596
    .line 597
    sub-int/2addr v1, v2

    .line 598
    goto :goto_1a

    .line 599
    :cond_30
    iget v2, v10, Lsi1;->f:I

    .line 600
    .line 601
    add-int/2addr v1, v2

    .line 602
    :cond_31
    :goto_1a
    if-eqz v22, :cond_32

    .line 603
    .line 604
    invoke-virtual {v3, v1}, Lsi1;->d(I)V

    .line 605
    .line 606
    .line 607
    goto :goto_1b

    .line 608
    :cond_32
    invoke-virtual {v10, v1}, Lsi1;->d(I)V

    .line 609
    .line 610
    .line 611
    :goto_1b
    iget-object v2, v0, Lk09;->e:Lzo1;

    .line 612
    .line 613
    iget v12, v2, Lsi1;->g:I

    .line 614
    .line 615
    iget v13, v0, Lk09;->d:I

    .line 616
    .line 617
    const/4 v14, 0x3

    .line 618
    if-ne v13, v14, :cond_33

    .line 619
    .line 620
    iget v13, v0, Lk09;->a:I

    .line 621
    .line 622
    const/4 v14, 0x1

    .line 623
    if-ne v13, v14, :cond_33

    .line 624
    .line 625
    iget v12, v2, Lzo1;->m:I

    .line 626
    .line 627
    :cond_33
    if-eqz v22, :cond_34

    .line 628
    .line 629
    sub-int/2addr v1, v12

    .line 630
    goto :goto_1c

    .line 631
    :cond_34
    add-int/2addr v1, v12

    .line 632
    :goto_1c
    if-eqz v22, :cond_35

    .line 633
    .line 634
    invoke-virtual {v10, v1}, Lsi1;->d(I)V

    .line 635
    .line 636
    .line 637
    :goto_1d
    const/4 v12, 0x1

    .line 638
    goto :goto_1e

    .line 639
    :cond_35
    invoke-virtual {v3, v1}, Lsi1;->d(I)V

    .line 640
    .line 641
    .line 642
    goto :goto_1d

    .line 643
    :goto_1e
    iput-boolean v12, v0, Lk09;->g:Z

    .line 644
    .line 645
    if-ge v4, v11, :cond_37

    .line 646
    .line 647
    if-ge v4, v9, :cond_37

    .line 648
    .line 649
    if-eqz v22, :cond_36

    .line 650
    .line 651
    iget v0, v3, Lsi1;->f:I

    .line 652
    .line 653
    neg-int v0, v0

    .line 654
    sub-int/2addr v1, v0

    .line 655
    goto :goto_1f

    .line 656
    :cond_36
    iget v0, v3, Lsi1;->f:I

    .line 657
    .line 658
    neg-int v0, v0

    .line 659
    add-int/2addr v1, v0

    .line 660
    :cond_37
    :goto_1f
    add-int/lit8 v4, v4, 0x1

    .line 661
    .line 662
    goto :goto_17

    .line 663
    :cond_38
    if-nez v2, :cond_45

    .line 664
    .line 665
    sub-int/2addr v5, v15

    .line 666
    const/16 v21, 0x1

    .line 667
    .line 668
    add-int/lit8 v4, v4, 0x1

    .line 669
    .line 670
    div-int/2addr v5, v4

    .line 671
    if-lez v3, :cond_39

    .line 672
    .line 673
    move v5, v1

    .line 674
    :cond_39
    move v4, v1

    .line 675
    move/from16 v1, v17

    .line 676
    .line 677
    :goto_20
    if-ge v4, v7, :cond_56

    .line 678
    .line 679
    if-eqz v22, :cond_3a

    .line 680
    .line 681
    add-int/lit8 v0, v4, 0x1

    .line 682
    .line 683
    sub-int v0, v7, v0

    .line 684
    .line 685
    goto :goto_21

    .line 686
    :cond_3a
    move v0, v4

    .line 687
    :goto_21
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    check-cast v0, Lk09;

    .line 692
    .line 693
    iget-object v2, v0, Lk09;->b:Lm31;

    .line 694
    .line 695
    iget-object v3, v0, Lk09;->i:Lsi1;

    .line 696
    .line 697
    iget-object v10, v0, Lk09;->h:Lsi1;

    .line 698
    .line 699
    iget v2, v2, Lm31;->g0:I

    .line 700
    .line 701
    const/16 v12, 0x8

    .line 702
    .line 703
    if-ne v2, v12, :cond_3b

    .line 704
    .line 705
    invoke-virtual {v10, v1}, Lsi1;->d(I)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v3, v1}, Lsi1;->d(I)V

    .line 709
    .line 710
    .line 711
    goto :goto_27

    .line 712
    :cond_3b
    if-eqz v22, :cond_3c

    .line 713
    .line 714
    sub-int/2addr v1, v5

    .line 715
    goto :goto_22

    .line 716
    :cond_3c
    add-int/2addr v1, v5

    .line 717
    :goto_22
    if-lez v4, :cond_3e

    .line 718
    .line 719
    if-lt v4, v8, :cond_3e

    .line 720
    .line 721
    if-eqz v22, :cond_3d

    .line 722
    .line 723
    iget v2, v10, Lsi1;->f:I

    .line 724
    .line 725
    sub-int/2addr v1, v2

    .line 726
    goto :goto_23

    .line 727
    :cond_3d
    iget v2, v10, Lsi1;->f:I

    .line 728
    .line 729
    add-int/2addr v1, v2

    .line 730
    :cond_3e
    :goto_23
    if-eqz v22, :cond_3f

    .line 731
    .line 732
    invoke-virtual {v3, v1}, Lsi1;->d(I)V

    .line 733
    .line 734
    .line 735
    goto :goto_24

    .line 736
    :cond_3f
    invoke-virtual {v10, v1}, Lsi1;->d(I)V

    .line 737
    .line 738
    .line 739
    :goto_24
    iget-object v2, v0, Lk09;->e:Lzo1;

    .line 740
    .line 741
    iget v12, v2, Lsi1;->g:I

    .line 742
    .line 743
    iget v13, v0, Lk09;->d:I

    .line 744
    .line 745
    const/4 v14, 0x3

    .line 746
    if-ne v13, v14, :cond_40

    .line 747
    .line 748
    iget v0, v0, Lk09;->a:I

    .line 749
    .line 750
    const/4 v14, 0x1

    .line 751
    if-ne v0, v14, :cond_40

    .line 752
    .line 753
    iget v0, v2, Lzo1;->m:I

    .line 754
    .line 755
    invoke-static {v12, v0}, Ljava/lang/Math;->min(II)I

    .line 756
    .line 757
    .line 758
    move-result v12

    .line 759
    :cond_40
    if-eqz v22, :cond_41

    .line 760
    .line 761
    sub-int/2addr v1, v12

    .line 762
    goto :goto_25

    .line 763
    :cond_41
    add-int/2addr v1, v12

    .line 764
    :goto_25
    if-eqz v22, :cond_42

    .line 765
    .line 766
    invoke-virtual {v10, v1}, Lsi1;->d(I)V

    .line 767
    .line 768
    .line 769
    goto :goto_26

    .line 770
    :cond_42
    invoke-virtual {v3, v1}, Lsi1;->d(I)V

    .line 771
    .line 772
    .line 773
    :goto_26
    if-ge v4, v11, :cond_44

    .line 774
    .line 775
    if-ge v4, v9, :cond_44

    .line 776
    .line 777
    if-eqz v22, :cond_43

    .line 778
    .line 779
    iget v0, v3, Lsi1;->f:I

    .line 780
    .line 781
    neg-int v0, v0

    .line 782
    sub-int/2addr v1, v0

    .line 783
    goto :goto_27

    .line 784
    :cond_43
    iget v0, v3, Lsi1;->f:I

    .line 785
    .line 786
    neg-int v0, v0

    .line 787
    add-int/2addr v1, v0

    .line 788
    :cond_44
    :goto_27
    add-int/lit8 v4, v4, 0x1

    .line 789
    .line 790
    goto :goto_20

    .line 791
    :cond_45
    const/4 v4, 0x2

    .line 792
    if-ne v2, v4, :cond_56

    .line 793
    .line 794
    iget v2, v0, Lk09;->f:I

    .line 795
    .line 796
    iget-object v0, v0, Lk09;->b:Lm31;

    .line 797
    .line 798
    if-nez v2, :cond_46

    .line 799
    .line 800
    iget v0, v0, Lm31;->d0:F

    .line 801
    .line 802
    goto :goto_28

    .line 803
    :cond_46
    iget v0, v0, Lm31;->e0:F

    .line 804
    .line 805
    :goto_28
    if-eqz v22, :cond_47

    .line 806
    .line 807
    const/high16 v2, 0x3f800000    # 1.0f

    .line 808
    .line 809
    sub-float v0, v2, v0

    .line 810
    .line 811
    :cond_47
    sub-int/2addr v5, v15

    .line 812
    int-to-float v2, v5

    .line 813
    mul-float/2addr v2, v0

    .line 814
    add-float v2, v2, v18

    .line 815
    .line 816
    float-to-int v0, v2

    .line 817
    if-ltz v0, :cond_48

    .line 818
    .line 819
    if-lez v3, :cond_49

    .line 820
    .line 821
    :cond_48
    move v0, v1

    .line 822
    :cond_49
    if-eqz v22, :cond_4a

    .line 823
    .line 824
    sub-int v0, v17, v0

    .line 825
    .line 826
    goto :goto_29

    .line 827
    :cond_4a
    add-int v0, v17, v0

    .line 828
    .line 829
    :goto_29
    move v4, v1

    .line 830
    :goto_2a
    if-ge v4, v7, :cond_56

    .line 831
    .line 832
    if-eqz v22, :cond_4b

    .line 833
    .line 834
    add-int/lit8 v1, v4, 0x1

    .line 835
    .line 836
    sub-int v1, v7, v1

    .line 837
    .line 838
    goto :goto_2b

    .line 839
    :cond_4b
    move v1, v4

    .line 840
    :goto_2b
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    check-cast v1, Lk09;

    .line 845
    .line 846
    iget-object v2, v1, Lk09;->b:Lm31;

    .line 847
    .line 848
    iget-object v3, v1, Lk09;->i:Lsi1;

    .line 849
    .line 850
    iget-object v5, v1, Lk09;->h:Lsi1;

    .line 851
    .line 852
    iget v2, v2, Lm31;->g0:I

    .line 853
    .line 854
    const/16 v12, 0x8

    .line 855
    .line 856
    if-ne v2, v12, :cond_4c

    .line 857
    .line 858
    invoke-virtual {v5, v0}, Lsi1;->d(I)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v3, v0}, Lsi1;->d(I)V

    .line 862
    .line 863
    .line 864
    const/4 v13, 0x1

    .line 865
    const/4 v14, 0x3

    .line 866
    goto :goto_31

    .line 867
    :cond_4c
    if-lez v4, :cond_4e

    .line 868
    .line 869
    if-lt v4, v8, :cond_4e

    .line 870
    .line 871
    if-eqz v22, :cond_4d

    .line 872
    .line 873
    iget v2, v5, Lsi1;->f:I

    .line 874
    .line 875
    sub-int/2addr v0, v2

    .line 876
    goto :goto_2c

    .line 877
    :cond_4d
    iget v2, v5, Lsi1;->f:I

    .line 878
    .line 879
    add-int/2addr v0, v2

    .line 880
    :cond_4e
    :goto_2c
    if-eqz v22, :cond_4f

    .line 881
    .line 882
    invoke-virtual {v3, v0}, Lsi1;->d(I)V

    .line 883
    .line 884
    .line 885
    goto :goto_2d

    .line 886
    :cond_4f
    invoke-virtual {v5, v0}, Lsi1;->d(I)V

    .line 887
    .line 888
    .line 889
    :goto_2d
    iget-object v2, v1, Lk09;->e:Lzo1;

    .line 890
    .line 891
    iget v10, v2, Lsi1;->g:I

    .line 892
    .line 893
    iget v13, v1, Lk09;->d:I

    .line 894
    .line 895
    const/4 v14, 0x3

    .line 896
    if-ne v13, v14, :cond_50

    .line 897
    .line 898
    iget v1, v1, Lk09;->a:I

    .line 899
    .line 900
    const/4 v13, 0x1

    .line 901
    if-ne v1, v13, :cond_51

    .line 902
    .line 903
    iget v10, v2, Lzo1;->m:I

    .line 904
    .line 905
    goto :goto_2e

    .line 906
    :cond_50
    const/4 v13, 0x1

    .line 907
    :cond_51
    :goto_2e
    if-eqz v22, :cond_52

    .line 908
    .line 909
    sub-int/2addr v0, v10

    .line 910
    goto :goto_2f

    .line 911
    :cond_52
    add-int/2addr v0, v10

    .line 912
    :goto_2f
    if-eqz v22, :cond_53

    .line 913
    .line 914
    invoke-virtual {v5, v0}, Lsi1;->d(I)V

    .line 915
    .line 916
    .line 917
    goto :goto_30

    .line 918
    :cond_53
    invoke-virtual {v3, v0}, Lsi1;->d(I)V

    .line 919
    .line 920
    .line 921
    :goto_30
    if-ge v4, v11, :cond_55

    .line 922
    .line 923
    if-ge v4, v9, :cond_55

    .line 924
    .line 925
    if-eqz v22, :cond_54

    .line 926
    .line 927
    iget v1, v3, Lsi1;->f:I

    .line 928
    .line 929
    neg-int v1, v1

    .line 930
    sub-int/2addr v0, v1

    .line 931
    goto :goto_31

    .line 932
    :cond_54
    iget v1, v3, Lsi1;->f:I

    .line 933
    .line 934
    neg-int v1, v1

    .line 935
    add-int/2addr v0, v1

    .line 936
    :cond_55
    :goto_31
    add-int/lit8 v4, v4, 0x1

    .line 937
    .line 938
    goto :goto_2a

    .line 939
    :cond_56
    :goto_32
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v0, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lk09;

    .line 18
    .line 19
    invoke-virtual {v2}, Lk09;->d()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lk09;

    .line 37
    .line 38
    iget-object v4, v4, Lk09;->b:Lm31;

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lk09;

    .line 46
    .line 47
    iget-object v0, v0, Lk09;->b:Lm31;

    .line 48
    .line 49
    iget v1, p0, Lk09;->f:I

    .line 50
    .line 51
    iget-object v5, p0, Lk09;->i:Lsi1;

    .line 52
    .line 53
    iget-object v6, p0, Lk09;->h:Lsi1;

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    iget-object v1, v4, Lm31;->I:Lu21;

    .line 58
    .line 59
    iget-object v0, v0, Lm31;->K:Lu21;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lk09;->i(Lu21;I)Lsi1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1}, Lu21;->e()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p0}, Lxo0;->m()Lm31;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    iget-object v1, v4, Lm31;->I:Lu21;

    .line 76
    .line 77
    invoke-virtual {v1}, Lu21;->e()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    :cond_2
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-static {v6, v2, v1}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-static {v0, v3}, Lk09;->i(Lu21;I)Lsi1;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0}, Lu21;->e()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0}, Lxo0;->n()Lm31;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    iget-object v0, v2, Lm31;->K:Lu21;

    .line 101
    .line 102
    invoke-virtual {v0}, Lu21;->e()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :cond_4
    if-eqz v1, :cond_9

    .line 107
    .line 108
    neg-int v0, v0

    .line 109
    invoke-static {v5, v1, v0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    iget-object v1, v4, Lm31;->J:Lu21;

    .line 114
    .line 115
    iget-object v0, v0, Lm31;->L:Lu21;

    .line 116
    .line 117
    invoke-static {v1, v2}, Lk09;->i(Lu21;I)Lsi1;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1}, Lu21;->e()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p0}, Lxo0;->m()Lm31;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    iget-object v1, v4, Lm31;->J:Lu21;

    .line 132
    .line 133
    invoke-virtual {v1}, Lu21;->e()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :cond_6
    if-eqz v3, :cond_7

    .line 138
    .line 139
    invoke-static {v6, v3, v1}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-static {v0, v2}, Lk09;->i(Lu21;I)Lsi1;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v0}, Lu21;->e()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {p0}, Lxo0;->n()Lm31;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    iget-object v0, v2, Lm31;->L:Lu21;

    .line 157
    .line 158
    invoke-virtual {v0}, Lu21;->e()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :cond_8
    if-eqz v1, :cond_9

    .line 163
    .line 164
    neg-int v0, v0

    .line 165
    invoke-static {v5, v1, v0}, Lk09;->b(Lsi1;Lsi1;I)V

    .line 166
    .line 167
    .line 168
    :cond_9
    :goto_1
    iput-object p0, v6, Lsi1;->a:Lk09;

    .line 169
    .line 170
    iput-object p0, v5, Lsi1;->a:Lk09;

    .line 171
    .line 172
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lk09;

    .line 15
    .line 16
    invoke-virtual {v1}, Lk09;->e()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lk09;->c:Lbr6;

    .line 3
    .line 4
    iget-object p0, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lk09;

    .line 21
    .line 22
    invoke-virtual {v0}, Lk09;->f()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final j()J
    .locals 7

    .line 1
    iget-object p0, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lk09;

    .line 17
    .line 18
    iget-object v5, v4, Lk09;->h:Lsi1;

    .line 19
    .line 20
    iget v5, v5, Lsi1;->f:I

    .line 21
    .line 22
    int-to-long v5, v5

    .line 23
    add-long/2addr v1, v5

    .line 24
    invoke-virtual {v4}, Lk09;->j()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    add-long/2addr v5, v1

    .line 29
    iget-object v1, v4, Lk09;->i:Lsi1;

    .line 30
    .line 31
    iget v1, v1, Lsi1;->f:I

    .line 32
    .line 33
    int-to-long v1, v1

    .line 34
    add-long/2addr v1, v5

    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-wide v1
.end method

.method public final k()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lk09;

    .line 16
    .line 17
    invoke-virtual {v3}, Lk09;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final m()Lm31;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lk09;

    .line 15
    .line 16
    iget-object v1, v1, Lk09;->b:Lm31;

    .line 17
    .line 18
    iget v2, v1, Lm31;->g0:I

    .line 19
    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public final n()Lm31;
    .locals 4

    .line 1
    iget-object p0, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lk09;

    .line 16
    .line 17
    iget-object v1, v1, Lk09;->b:Lm31;

    .line 18
    .line 19
    iget v2, v1, Lm31;->g0:I

    .line 20
    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    if-eq v2, v3, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChainRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lk09;->f:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "horizontal : "

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "vertical : "

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lxo0;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lk09;

    .line 37
    .line 38
    const-string v2, "<"

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "> "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.class public final Lez4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Lql;

.field public b:Lfi2;

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:Ljava/util/List;

.field public h:Lmx;

.field public i:Lsv4;

.field public j:J

.field public k:Lfi1;

.field public l:Lo88;

.field public m:Ly5;

.field public n:Lz24;

.field public o:Lx78;

.field public p:I

.field public q:I

.field public r:Ldz4;

.field public s:J


# direct methods
.method public constructor <init>(Lql;Lo88;Lfi2;IZIILjava/util/List;Lmx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lez4;->a:Lql;

    .line 5
    .line 6
    iput-object p3, p0, Lez4;->b:Lfi2;

    .line 7
    .line 8
    iput p4, p0, Lez4;->c:I

    .line 9
    .line 10
    iput-boolean p5, p0, Lez4;->d:Z

    .line 11
    .line 12
    iput p6, p0, Lez4;->e:I

    .line 13
    .line 14
    iput p7, p0, Lez4;->f:I

    .line 15
    .line 16
    iput-object p8, p0, Lez4;->g:Ljava/util/List;

    .line 17
    .line 18
    iput-object p9, p0, Lez4;->h:Lmx;

    .line 19
    .line 20
    sget p1, Lcd3;->b:I

    .line 21
    .line 22
    sget-wide p3, Lcd3;->a:J

    .line 23
    .line 24
    iput-wide p3, p0, Lez4;->j:J

    .line 25
    .line 26
    iput-object p2, p0, Lez4;->l:Lo88;

    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    iput p1, p0, Lez4;->p:I

    .line 30
    .line 31
    iput p1, p0, Lez4;->q:I

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(ILz24;)I
    .locals 4

    .line 1
    iget v0, p0, Lez4;->p:I

    .line 2
    .line 3
    iget v1, p0, Lez4;->q:I

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, p1, v1, v0}, Ls31;->a(IIII)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget v2, p0, Lez4;->f:I

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-le v2, v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1, p2}, Lez4;->h(JLz24;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :cond_1
    invoke-virtual {p0, v0, v1, p2}, Lez4;->b(JLz24;)Lbz4;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget p2, p2, Lbz4;->e:F

    .line 33
    .line 34
    invoke-static {p2}, Lz38;->a(F)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-static {v0, v1}, Lq31;->i(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ge p2, v0, :cond_2

    .line 43
    .line 44
    move p2, v0

    .line 45
    :cond_2
    iput p1, p0, Lez4;->p:I

    .line 46
    .line 47
    iput p2, p0, Lez4;->q:I

    .line 48
    .line 49
    return p2
.end method

.method public final b(JLz24;)Lbz4;
    .locals 6

    .line 1
    invoke-virtual {p0, p3}, Lez4;->e(Lz24;)Ly5;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v0, Lbz4;

    .line 6
    .line 7
    iget-boolean p3, p0, Lez4;->d:Z

    .line 8
    .line 9
    iget v2, p0, Lez4;->c:I

    .line 10
    .line 11
    invoke-virtual {v1}, Ly5;->l()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {v3, v2, p1, p2, p3}, Lw45;->I(FIJZ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-boolean p1, p0, Lez4;->d:Z

    .line 20
    .line 21
    iget v5, p0, Lez4;->c:I

    .line 22
    .line 23
    iget p0, p0, Lez4;->e:I

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    if-ne v5, p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x4

    .line 33
    if-ne v5, p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x5

    .line 37
    if-ne v5, p1, :cond_2

    .line 38
    .line 39
    :goto_0
    move v4, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-ge p0, p2, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move v4, p0

    .line 45
    :goto_1
    invoke-direct/range {v0 .. v5}, Lbz4;-><init>(Ly5;JII)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public final c(JLz24;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    iget-wide v4, v0, Lez4;->s:J

    .line 8
    .line 9
    const/4 v6, 0x2

    .line 10
    shl-long/2addr v4, v6

    .line 11
    const-wide/16 v6, 0x3

    .line 12
    .line 13
    or-long/2addr v4, v6

    .line 14
    iput-wide v4, v0, Lez4;->s:J

    .line 15
    .line 16
    iget v4, v0, Lez4;->f:I

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-le v4, v5, :cond_0

    .line 20
    .line 21
    invoke-virtual/range {p0 .. p3}, Lez4;->h(JLz24;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide v6, v1

    .line 27
    :goto_0
    iget-object v4, v0, Lez4;->o:Lx78;

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    iget-object v8, v4, Lx78;->b:Lbz4;

    .line 33
    .line 34
    iget-object v4, v4, Lx78;->a:Lw78;

    .line 35
    .line 36
    iget-object v9, v8, Lbz4;->a:Ly5;

    .line 37
    .line 38
    invoke-virtual {v9}, Ly5;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object v9, v4, Lw78;->h:Lz24;

    .line 46
    .line 47
    iget-wide v10, v4, Lw78;->j:J

    .line 48
    .line 49
    if-eq v3, v9, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-static {v6, v7, v10, v11}, Lq31;->b(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-static {v6, v7}, Lq31;->h(J)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-static {v10, v11}, Lq31;->h(J)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eq v4, v9, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    invoke-static {v6, v7}, Lq31;->j(J)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-static {v10, v11}, Lq31;->j(J)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eq v4, v9, :cond_6

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    invoke-static {v6, v7}, Lq31;->g(J)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    int-to-float v4, v4

    .line 86
    iget v9, v8, Lbz4;->e:F

    .line 87
    .line 88
    cmpg-float v4, v4, v9

    .line 89
    .line 90
    if-ltz v4, :cond_9

    .line 91
    .line 92
    iget-boolean v4, v8, Lbz4;->c:Z

    .line 93
    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_7
    :goto_1
    iget-object v1, v0, Lez4;->o:Lx78;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v1, v1, Lx78;->a:Lw78;

    .line 103
    .line 104
    iget-wide v1, v1, Lw78;->j:J

    .line 105
    .line 106
    invoke-static {v6, v7, v1, v2}, Lq31;->b(JJ)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_8

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    return v0

    .line 114
    :cond_8
    iget-object v1, v0, Lez4;->o:Lx78;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v1, v1, Lx78;->b:Lbz4;

    .line 120
    .line 121
    invoke-virtual {v0, v3, v6, v7, v1}, Lez4;->g(Lz24;JLbz4;)Lx78;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iput-object v1, v0, Lez4;->o:Lx78;

    .line 126
    .line 127
    return v5

    .line 128
    :cond_9
    :goto_2
    iget-object v4, v0, Lez4;->h:Lmx;

    .line 129
    .line 130
    if-eqz v4, :cond_11

    .line 131
    .line 132
    iput-object v3, v0, Lez4;->n:Lz24;

    .line 133
    .line 134
    iget-object v8, v0, Lez4;->l:Lo88;

    .line 135
    .line 136
    iget-object v8, v8, Lo88;->a:Lqe7;

    .line 137
    .line 138
    iget-wide v8, v8, Lqe7;->b:J

    .line 139
    .line 140
    iget-object v10, v0, Lez4;->r:Ldz4;

    .line 141
    .line 142
    if-nez v10, :cond_a

    .line 143
    .line 144
    new-instance v10, Ldz4;

    .line 145
    .line 146
    invoke-direct {v10, v0}, Ldz4;-><init>(Lez4;)V

    .line 147
    .line 148
    .line 149
    iput-object v10, v0, Lez4;->r:Ldz4;

    .line 150
    .line 151
    :cond_a
    iget-wide v11, v4, Lmx;->c:J

    .line 152
    .line 153
    invoke-virtual {v10, v11, v12}, Ldz4;->G0(J)F

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    iget-wide v12, v4, Lmx;->a:J

    .line 158
    .line 159
    invoke-virtual {v10, v12, v13}, Ldz4;->G0(J)F

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    iget-wide v13, v4, Lmx;->b:J

    .line 164
    .line 165
    invoke-virtual {v10, v13, v14}, Ldz4;->G0(J)F

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    add-float v13, v12, v4

    .line 170
    .line 171
    const/high16 v14, 0x40000000    # 2.0f

    .line 172
    .line 173
    div-float/2addr v13, v14

    .line 174
    move v15, v4

    .line 175
    move/from16 v16, v12

    .line 176
    .line 177
    :goto_3
    sub-float v17, v15, v16

    .line 178
    .line 179
    cmpl-float v17, v17, v11

    .line 180
    .line 181
    if-ltz v17, :cond_c

    .line 182
    .line 183
    move/from16 v17, v14

    .line 184
    .line 185
    move/from16 v18, v15

    .line 186
    .line 187
    invoke-interface {v10, v13}, Lfi1;->M(F)J

    .line 188
    .line 189
    .line 190
    move-result-wide v14

    .line 191
    invoke-virtual {v10, v1, v2, v14, v15}, Ldz4;->a(JJ)Lx78;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-static {v14}, Lmx;->a(Lx78;)Z

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    if-eqz v14, :cond_b

    .line 200
    .line 201
    move v15, v13

    .line 202
    goto :goto_4

    .line 203
    :cond_b
    move/from16 v16, v13

    .line 204
    .line 205
    move/from16 v15, v18

    .line 206
    .line 207
    :goto_4
    add-float v13, v16, v15

    .line 208
    .line 209
    div-float v13, v13, v17

    .line 210
    .line 211
    move/from16 v14, v17

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_c
    sub-float v16, v16, v12

    .line 215
    .line 216
    div-float v13, v16, v11

    .line 217
    .line 218
    float-to-double v13, v13

    .line 219
    invoke-static {v13, v14}, Ljava/lang/Math;->floor(D)D

    .line 220
    .line 221
    .line 222
    move-result-wide v13

    .line 223
    double-to-float v13, v13

    .line 224
    mul-float/2addr v13, v11

    .line 225
    add-float/2addr v13, v12

    .line 226
    add-float/2addr v11, v13

    .line 227
    cmpg-float v4, v11, v4

    .line 228
    .line 229
    if-gtz v4, :cond_d

    .line 230
    .line 231
    invoke-interface {v10, v11}, Lfi1;->M(F)J

    .line 232
    .line 233
    .line 234
    move-result-wide v14

    .line 235
    invoke-virtual {v10, v1, v2, v14, v15}, Ldz4;->a(JJ)Lx78;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v1}, Lmx;->a(Lx78;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_d

    .line 244
    .line 245
    move v13, v11

    .line 246
    :cond_d
    invoke-interface {v10, v13}, Lfi1;->M(F)J

    .line 247
    .line 248
    .line 249
    move-result-wide v1

    .line 250
    invoke-static {v1, v2}, Lv88;->d(J)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_e

    .line 255
    .line 256
    invoke-static {v8, v9, v1, v2}, Lfz4;->a(JJ)J

    .line 257
    .line 258
    .line 259
    move-result-wide v1

    .line 260
    :cond_e
    move-wide v11, v1

    .line 261
    iget-object v1, v0, Lez4;->r:Ldz4;

    .line 262
    .line 263
    if-nez v1, :cond_f

    .line 264
    .line 265
    new-instance v1, Ldz4;

    .line 266
    .line 267
    invoke-direct {v1, v0}, Ldz4;-><init>(Lez4;)V

    .line 268
    .line 269
    .line 270
    iput-object v1, v0, Lez4;->r:Ldz4;

    .line 271
    .line 272
    :cond_f
    iget-object v1, v1, Ldz4;->X:Lx78;

    .line 273
    .line 274
    if-eqz v1, :cond_10

    .line 275
    .line 276
    iget-object v2, v1, Lx78;->a:Lw78;

    .line 277
    .line 278
    iget-object v4, v2, Lw78;->b:Lo88;

    .line 279
    .line 280
    iget-object v4, v4, Lo88;->a:Lqe7;

    .line 281
    .line 282
    iget-wide v8, v4, Lqe7;->b:J

    .line 283
    .line 284
    invoke-static {v11, v12, v8, v9}, Lv88;->a(JJ)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-eqz v4, :cond_10

    .line 289
    .line 290
    iget v2, v2, Lw78;->f:I

    .line 291
    .line 292
    iget v4, v0, Lez4;->c:I

    .line 293
    .line 294
    if-ne v2, v4, :cond_10

    .line 295
    .line 296
    iput-object v1, v0, Lez4;->o:Lx78;

    .line 297
    .line 298
    return v5

    .line 299
    :cond_10
    iget-object v8, v0, Lez4;->l:Lo88;

    .line 300
    .line 301
    const/16 v19, 0x0

    .line 302
    .line 303
    const v20, 0xfffffd

    .line 304
    .line 305
    .line 306
    const-wide/16 v9, 0x0

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const-wide/16 v15, 0x0

    .line 311
    .line 312
    const-wide/16 v17, 0x0

    .line 313
    .line 314
    invoke-static/range {v8 .. v20}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v0, v1}, Lez4;->f(Lo88;)V

    .line 319
    .line 320
    .line 321
    :cond_11
    invoke-virtual {v0, v6, v7, v3}, Lez4;->b(JLz24;)Lbz4;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v0, v3, v6, v7, v1}, Lez4;->g(Lz24;JLbz4;)Lx78;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iput-object v1, v0, Lez4;->o:Lx78;

    .line 330
    .line 331
    return v5
.end method

.method public final d(Lfi1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lez4;->k:Lfi1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget v1, Lcd3;->b:I

    .line 6
    .line 7
    invoke-interface {p1}, Lfi1;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p1}, Lfi1;->b0()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Lcd3;->a(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-wide v1, Lcd3;->a:J

    .line 21
    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput-object p1, p0, Lez4;->k:Lfi1;

    .line 25
    .line 26
    iput-wide v1, p0, Lez4;->j:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-wide v3, p0, Lez4;->j:J

    .line 32
    .line 33
    cmp-long v0, v3, v1

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iput-object p1, p0, Lez4;->k:Lfi1;

    .line 39
    .line 40
    iput-wide v1, p0, Lez4;->j:J

    .line 41
    .line 42
    iget-wide v0, p0, Lez4;->s:J

    .line 43
    .line 44
    const/4 p1, 0x2

    .line 45
    shl-long/2addr v0, p1

    .line 46
    const-wide/16 v2, 0x1

    .line 47
    .line 48
    or-long/2addr v0, v2

    .line 49
    iput-wide v0, p0, Lez4;->s:J

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Lez4;->m:Ly5;

    .line 53
    .line 54
    iput-object p1, p0, Lez4;->o:Lx78;

    .line 55
    .line 56
    const/4 v0, -0x1

    .line 57
    iput v0, p0, Lez4;->q:I

    .line 58
    .line 59
    iput v0, p0, Lez4;->p:I

    .line 60
    .line 61
    iput-object p1, p0, Lez4;->r:Ldz4;

    .line 62
    .line 63
    return-void
.end method

.method public final e(Lz24;)Ly5;
    .locals 9

    .line 1
    iget-object v0, p0, Lez4;->m:Ly5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lez4;->n:Lz24;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ly5;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Lez4;->n:Lz24;

    .line 16
    .line 17
    iget-object v3, p0, Lez4;->a:Lql;

    .line 18
    .line 19
    iget-object v0, p0, Lez4;->l:Lo88;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v6, p0, Lez4;->k:Lfi1;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v7, p0, Lez4;->b:Lfi2;

    .line 31
    .line 32
    iget-object p1, p0, Lez4;->g:Ljava/util/List;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    sget-object p1, Ld02;->X:Ld02;

    .line 37
    .line 38
    :cond_1
    move-object v5, p1

    .line 39
    iget-boolean v8, p0, Lez4;->d:Z

    .line 40
    .line 41
    new-instance v2, Ly5;

    .line 42
    .line 43
    invoke-direct/range {v2 .. v8}, Ly5;-><init>(Lql;Lo88;Ljava/util/List;Lfi1;Lfi2;Z)V

    .line 44
    .line 45
    .line 46
    move-object v0, v2

    .line 47
    :cond_2
    iput-object v0, p0, Lez4;->m:Ly5;

    .line 48
    .line 49
    return-object v0
.end method

.method public final f(Lo88;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lez4;->l:Lo88;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lo88;->c(Lo88;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput-object p1, p0, Lez4;->l:Lo88;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Lez4;->s:J

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    shl-long/2addr v0, p1

    .line 15
    iput-wide v0, p0, Lez4;->s:J

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lez4;->m:Ly5;

    .line 19
    .line 20
    iput-object p1, p0, Lez4;->o:Lx78;

    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, Lez4;->q:I

    .line 24
    .line 25
    iput p1, p0, Lez4;->p:I

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final g(Lz24;JLbz4;)Lx78;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    iget-object v2, v1, Lbz4;->a:Ly5;

    .line 6
    .line 7
    invoke-virtual {v2}, Ly5;->l()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget v3, v1, Lbz4;->d:F

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    new-instance v3, Lx78;

    .line 18
    .line 19
    new-instance v4, Lw78;

    .line 20
    .line 21
    iget-object v5, v0, Lez4;->a:Lql;

    .line 22
    .line 23
    iget-object v6, v0, Lez4;->l:Lo88;

    .line 24
    .line 25
    iget-object v7, v0, Lez4;->g:Ljava/util/List;

    .line 26
    .line 27
    if-nez v7, :cond_0

    .line 28
    .line 29
    sget-object v7, Ld02;->X:Ld02;

    .line 30
    .line 31
    :cond_0
    iget v8, v0, Lez4;->e:I

    .line 32
    .line 33
    iget-boolean v9, v0, Lez4;->d:Z

    .line 34
    .line 35
    iget v10, v0, Lez4;->c:I

    .line 36
    .line 37
    iget-object v11, v0, Lez4;->k:Lfi1;

    .line 38
    .line 39
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v13, v0, Lez4;->b:Lfi2;

    .line 43
    .line 44
    move-object/from16 v12, p1

    .line 45
    .line 46
    move-wide/from16 v14, p2

    .line 47
    .line 48
    invoke-direct/range {v4 .. v15}, Lw78;-><init>(Lql;Lo88;Ljava/util/List;IZILfi1;Lz24;Lfi2;J)V

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, Lz38;->a(F)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v2, v1, Lbz4;->e:F

    .line 56
    .line 57
    invoke-static {v2}, Lz38;->a(F)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    int-to-long v5, v0

    .line 62
    const/16 v0, 0x20

    .line 63
    .line 64
    shl-long/2addr v5, v0

    .line 65
    int-to-long v7, v2

    .line 66
    const-wide v9, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v7, v9

    .line 72
    or-long/2addr v5, v7

    .line 73
    invoke-static {v14, v15, v5, v6}, Ls31;->d(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    invoke-direct {v3, v4, v1, v5, v6}, Lx78;-><init>(Lw78;Lbz4;J)V

    .line 78
    .line 79
    .line 80
    return-object v3
.end method

.method public final h(JLz24;)J
    .locals 4

    .line 1
    iget-object v0, p0, Lez4;->i:Lsv4;

    .line 2
    .line 3
    iget-object v1, p0, Lez4;->l:Lo88;

    .line 4
    .line 5
    iget-object v2, p0, Lez4;->k:Lfi1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lez4;->b:Lfi2;

    .line 11
    .line 12
    invoke-static {v0, p3, v1, v2, v3}, Lhi5;->Z(Lsv4;Lz24;Lo88;Lfi1;Lfi2;)Lsv4;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iput-object p3, p0, Lez4;->i:Lsv4;

    .line 17
    .line 18
    iget p0, p0, Lez4;->f:I

    .line 19
    .line 20
    invoke-virtual {p3, p0, p1, p2}, Lsv4;->a(IJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    return-wide p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lez4;->o:Lx78;

    .line 2
    .line 3
    const-string v1, "null"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "<TextLayoutResult>"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    iget-wide v2, p0, Lez4;->j:J

    .line 12
    .line 13
    invoke-static {v2, v3}, Lcd3;->b(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-wide v3, p0, Lez4;->s:J

    .line 18
    .line 19
    iget-object p0, p0, Lez4;->o:Lx78;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    iget-object p0, p0, Lx78;->a:Lw78;

    .line 24
    .line 25
    iget-wide v5, p0, Lw78;->j:J

    .line 26
    .line 27
    new-instance v1, Lq31;

    .line 28
    .line 29
    invoke-direct {v1, v5, v6}, Lq31;-><init>(J)V

    .line 30
    .line 31
    .line 32
    :cond_1
    const-string p0, ", lastDensity="

    .line 33
    .line 34
    const-string v5, ", history="

    .line 35
    .line 36
    const-string v6, "MultiParagraphLayoutCache(textLayoutResult="

    .line 37
    .line 38
    invoke-static {v6, v0, p0, v2, v5}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", constraints="

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ")"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

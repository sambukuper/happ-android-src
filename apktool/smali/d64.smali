.class public final Ld64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ls05;

.field public b:Lne;

.field public c:I

.field public final d:Lt05;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public j:Laq1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Luw6;->a:[J

    .line 5
    .line 6
    new-instance v0, Ls05;

    .line 7
    .line 8
    invoke-direct {v0}, Ls05;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ld64;->a:Ls05;

    .line 12
    .line 13
    sget-object v0, Lvw6;->a:Lt05;

    .line 14
    .line 15
    new-instance v0, Lt05;

    .line 16
    .line 17
    invoke-direct {v0}, Lt05;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ld64;->d:Lt05;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ld64;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Ld64;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ld64;->g:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Ld64;->h:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Ld64;->i:Ljava/util/ArrayList;

    .line 56
    .line 57
    return-void
.end method

.method public static b(Lf74;ILb64;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf74;->b(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    const/4 v3, 0x1

    .line 7
    and-int v4, v3, v3

    .line 8
    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    shr-long v6, v1, v5

    .line 14
    .line 15
    long-to-int v4, v6

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v0

    .line 18
    :goto_0
    and-int/lit8 v3, v3, 0x2

    .line 19
    .line 20
    const-wide v6, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    and-long v8, v1, v6

    .line 28
    .line 29
    long-to-int p1, v8

    .line 30
    :cond_1
    int-to-long v3, v4

    .line 31
    shl-long/2addr v3, v5

    .line 32
    int-to-long v8, p1

    .line 33
    and-long v5, v8, v6

    .line 34
    .line 35
    or-long/2addr v3, v5

    .line 36
    iget-object p1, p2, Lb64;->a:[Lz54;

    .line 37
    .line 38
    array-length p2, p1

    .line 39
    move v5, v0

    .line 40
    :goto_1
    if-ge v0, p2, :cond_3

    .line 41
    .line 42
    aget-object v6, p1, v0

    .line 43
    .line 44
    add-int/lit8 v7, v5, 0x1

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, v5}, Lf74;->b(I)J

    .line 49
    .line 50
    .line 51
    move-result-wide v8

    .line 52
    invoke-static {v8, v9, v1, v2}, Lhf3;->b(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    invoke-static {v3, v4, v8, v9}, Lhf3;->c(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    iput-wide v8, v6, Lz54;->l:J

    .line 61
    .line 62
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    move v5, v7

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    return-void
.end method

.method public static g([ILf74;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    aget v1, p0, v0

    .line 6
    .line 7
    iget v2, p1, Lf74;->o:I

    .line 8
    .line 9
    iget p1, p1, Lf74;->p:I

    .line 10
    .line 11
    add-int/2addr v2, p1

    .line 12
    add-int/2addr v2, v1

    .line 13
    aput v2, p0, v0

    .line 14
    .line 15
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method


# virtual methods
.method public final a()J
    .locals 12

    .line 1
    iget-object p0, p0, Ld64;->i:Ljava/util/ArrayList;

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
    if-ge v3, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lz54;

    .line 17
    .line 18
    iget-object v5, v4, Lz54;->o:Lxt2;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const/16 v6, 0x20

    .line 23
    .line 24
    shr-long v7, v1, v6

    .line 25
    .line 26
    long-to-int v7, v7

    .line 27
    iget-wide v8, v4, Lz54;->l:J

    .line 28
    .line 29
    shr-long/2addr v8, v6

    .line 30
    long-to-int v8, v8

    .line 31
    iget-wide v9, v5, Lxt2;->u:J

    .line 32
    .line 33
    shr-long/2addr v9, v6

    .line 34
    long-to-int v9, v9

    .line 35
    add-int/2addr v8, v9

    .line 36
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    const-wide v8, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v1, v8

    .line 46
    long-to-int v1, v1

    .line 47
    iget-wide v10, v4, Lz54;->l:J

    .line 48
    .line 49
    and-long/2addr v10, v8

    .line 50
    long-to-int v2, v10

    .line 51
    iget-wide v4, v5, Lxt2;->u:J

    .line 52
    .line 53
    and-long/2addr v4, v8

    .line 54
    long-to-int v4, v4

    .line 55
    add-int/2addr v2, v4

    .line 56
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-long v4, v7

    .line 61
    shl-long/2addr v4, v6

    .line 62
    int-to-long v1, v1

    .line 63
    and-long/2addr v1, v8

    .line 64
    or-long/2addr v1, v4

    .line 65
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-wide v1
.end method

.method public final c(IIILjava/util/ArrayList;Lne;Lc74;ZZIILb71;Lvt2;)V
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p4

    .line 4
    .line 5
    move-object/from16 v4, p5

    .line 6
    .line 7
    iget-object v5, v0, Ld64;->b:Lne;

    .line 8
    .line 9
    iput-object v4, v0, Ld64;->b:Lne;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const/4 v8, 0x0

    .line 16
    :goto_0
    iget-object v15, v0, Ld64;->a:Ls05;

    .line 17
    .line 18
    if-ge v8, v6, :cond_3

    .line 19
    .line 20
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    check-cast v9, Lf74;

    .line 25
    .line 26
    iget-object v10, v9, Lf74;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    const/4 v11, 0x0

    .line 33
    :goto_1
    if-ge v11, v10, :cond_2

    .line 34
    .line 35
    iget-object v12, v9, Lf74;->b:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v12

    .line 41
    check-cast v12, Leo5;

    .line 42
    .line 43
    invoke-virtual {v12}, Leo5;->w()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    instance-of v14, v12, Lq54;

    .line 48
    .line 49
    if-eqz v14, :cond_0

    .line 50
    .line 51
    check-cast v12, Lq54;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    const/4 v12, 0x0

    .line 55
    :goto_2
    if-eqz v12, :cond_1

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {v15}, Ls05;->i()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ld64;->d()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :goto_3
    iget v6, v0, Ld64;->c:I

    .line 75
    .line 76
    invoke-static {v3}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, Lf74;

    .line 81
    .line 82
    if-eqz v8, :cond_5

    .line 83
    .line 84
    iget v8, v8, Lf74;->a:I

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    const/4 v8, 0x0

    .line 88
    :goto_4
    iput v8, v0, Ld64;->c:I

    .line 89
    .line 90
    move/from16 v8, p1

    .line 91
    .line 92
    int-to-long v8, v8

    .line 93
    const-wide v16, 0xffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long v8, v8, v16

    .line 99
    .line 100
    if-nez p7, :cond_7

    .line 101
    .line 102
    if-nez p8, :cond_6

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_6
    const/16 v18, 0x0

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_7
    :goto_5
    const/16 v18, 0x1

    .line 109
    .line 110
    :goto_6
    iget-object v11, v15, Ls05;->b:[Ljava/lang/Object;

    .line 111
    .line 112
    iget-object v12, v15, Ls05;->a:[J

    .line 113
    .line 114
    array-length v14, v12

    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    const/4 v13, 0x2

    .line 118
    sub-int/2addr v14, v13

    .line 119
    const-wide/16 v20, 0x80

    .line 120
    .line 121
    const-wide/16 v22, 0xff

    .line 122
    .line 123
    const/16 v24, 0x7

    .line 124
    .line 125
    iget-object v13, v0, Ld64;->d:Lt05;

    .line 126
    .line 127
    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    if-ltz v14, :cond_b

    .line 133
    .line 134
    move-object/from16 p8, v11

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    :goto_7
    const/16 v27, 0x8

    .line 138
    .line 139
    aget-wide v10, v12, v7

    .line 140
    .line 141
    not-long v1, v10

    .line 142
    shl-long v1, v1, v24

    .line 143
    .line 144
    and-long/2addr v1, v10

    .line 145
    and-long v1, v1, v25

    .line 146
    .line 147
    cmp-long v1, v1, v25

    .line 148
    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    sub-int v1, v7, v14

    .line 152
    .line 153
    not-int v1, v1

    .line 154
    ushr-int/lit8 v1, v1, 0x1f

    .line 155
    .line 156
    rsub-int/lit8 v1, v1, 0x8

    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    :goto_8
    if-ge v2, v1, :cond_9

    .line 160
    .line 161
    and-long v28, v10, v22

    .line 162
    .line 163
    cmp-long v28, v28, v20

    .line 164
    .line 165
    if-gez v28, :cond_8

    .line 166
    .line 167
    shl-int/lit8 v28, v7, 0x3

    .line 168
    .line 169
    add-int v28, v28, v2

    .line 170
    .line 171
    move/from16 v29, v2

    .line 172
    .line 173
    aget-object v2, p8, v28

    .line 174
    .line 175
    invoke-virtual {v13, v2}, Lt05;->a(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_8
    move/from16 v29, v2

    .line 180
    .line 181
    :goto_9
    shr-long v10, v10, v27

    .line 182
    .line 183
    add-int/lit8 v2, v29, 0x1

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_9
    move/from16 v2, v27

    .line 187
    .line 188
    if-ne v1, v2, :cond_b

    .line 189
    .line 190
    :cond_a
    if-eq v7, v14, :cond_b

    .line 191
    .line 192
    add-int/lit8 v7, v7, 0x1

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    const/4 v2, 0x0

    .line 200
    :goto_a
    iget-object v7, v0, Ld64;->i:Ljava/util/ArrayList;

    .line 201
    .line 202
    iget-object v11, v0, Ld64;->f:Ljava/util/ArrayList;

    .line 203
    .line 204
    iget-object v12, v0, Ld64;->e:Ljava/util/ArrayList;

    .line 205
    .line 206
    if-ge v2, v1, :cond_1b

    .line 207
    .line 208
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    check-cast v14, Lf74;

    .line 213
    .line 214
    iget-object v10, v14, Lf74;->i:Ljava/lang/Object;

    .line 215
    .line 216
    move/from16 v34, v1

    .line 217
    .line 218
    iget-object v1, v14, Lf74;->b:Ljava/util/List;

    .line 219
    .line 220
    invoke-virtual {v13, v10}, Lt05;->l(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move/from16 v35, v2

    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    move-object/from16 v29, v14

    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    :goto_b
    if-ge v14, v2, :cond_19

    .line 233
    .line 234
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v28

    .line 238
    check-cast v28, Leo5;

    .line 239
    .line 240
    move-object/from16 v30, v1

    .line 241
    .line 242
    invoke-virtual/range {v28 .. v28}, Leo5;->w()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move/from16 v28, v2

    .line 247
    .line 248
    instance-of v2, v1, Lq54;

    .line 249
    .line 250
    if-eqz v2, :cond_c

    .line 251
    .line 252
    check-cast v1, Lq54;

    .line 253
    .line 254
    goto :goto_c

    .line 255
    :cond_c
    move-object/from16 v1, v19

    .line 256
    .line 257
    :goto_c
    if-eqz v1, :cond_18

    .line 258
    .line 259
    invoke-virtual {v15, v10}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    move-object/from16 v28, v1

    .line 264
    .line 265
    check-cast v28, Lb64;

    .line 266
    .line 267
    if-eqz v5, :cond_d

    .line 268
    .line 269
    invoke-virtual {v5, v10}, Lne;->e(Ljava/lang/Object;)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    :goto_d
    const/4 v2, -0x1

    .line 274
    goto :goto_e

    .line 275
    :cond_d
    const/4 v1, -0x1

    .line 276
    goto :goto_d

    .line 277
    :goto_e
    if-ne v1, v2, :cond_e

    .line 278
    .line 279
    if-eqz v5, :cond_e

    .line 280
    .line 281
    const/4 v2, 0x1

    .line 282
    goto :goto_f

    .line 283
    :cond_e
    const/4 v2, 0x0

    .line 284
    :goto_f
    if-nez v28, :cond_12

    .line 285
    .line 286
    new-instance v7, Lb64;

    .line 287
    .line 288
    invoke-direct {v7, v0}, Lb64;-><init>(Ld64;)V

    .line 289
    .line 290
    .line 291
    move/from16 v32, p9

    .line 292
    .line 293
    move/from16 v33, p10

    .line 294
    .line 295
    move-object/from16 v30, p11

    .line 296
    .line 297
    move-object/from16 v31, p12

    .line 298
    .line 299
    move-object/from16 v28, v7

    .line 300
    .line 301
    invoke-static/range {v28 .. v33}, Lb64;->b(Lb64;Lf74;Lb71;Lvt2;II)V

    .line 302
    .line 303
    .line 304
    move-object/from16 v14, v29

    .line 305
    .line 306
    invoke-virtual {v15, v10, v7}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    iget v10, v14, Lf74;->a:I

    .line 310
    .line 311
    if-eq v10, v1, :cond_10

    .line 312
    .line 313
    const/4 v10, -0x1

    .line 314
    if-eq v1, v10, :cond_10

    .line 315
    .line 316
    if-ge v1, v6, :cond_f

    .line 317
    .line 318
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto/16 :goto_13

    .line 322
    .line 323
    :cond_f
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto/16 :goto_13

    .line 327
    .line 328
    :cond_10
    const/4 v1, 0x0

    .line 329
    invoke-virtual {v14, v1}, Lf74;->b(I)J

    .line 330
    .line 331
    .line 332
    move-result-wide v10

    .line 333
    and-long v10, v10, v16

    .line 334
    .line 335
    long-to-int v1, v10

    .line 336
    invoke-static {v14, v1, v7}, Ld64;->b(Lf74;ILb64;)V

    .line 337
    .line 338
    .line 339
    if-eqz v2, :cond_1a

    .line 340
    .line 341
    iget-object v1, v7, Lb64;->a:[Lz54;

    .line 342
    .line 343
    array-length v2, v1

    .line 344
    const/4 v7, 0x0

    .line 345
    :goto_10
    if-ge v7, v2, :cond_1a

    .line 346
    .line 347
    aget-object v10, v1, v7

    .line 348
    .line 349
    if-eqz v10, :cond_11

    .line 350
    .line 351
    invoke-virtual {v10}, Lz54;->a()V

    .line 352
    .line 353
    .line 354
    :cond_11
    add-int/lit8 v7, v7, 0x1

    .line 355
    .line 356
    goto :goto_10

    .line 357
    :cond_12
    move-object/from16 v14, v29

    .line 358
    .line 359
    if-eqz v18, :cond_1a

    .line 360
    .line 361
    move/from16 v32, p9

    .line 362
    .line 363
    move/from16 v33, p10

    .line 364
    .line 365
    move-object/from16 v30, p11

    .line 366
    .line 367
    move-object/from16 v31, p12

    .line 368
    .line 369
    move-object/from16 v29, v14

    .line 370
    .line 371
    invoke-static/range {v28 .. v33}, Lb64;->b(Lb64;Lf74;Lb71;Lvt2;II)V

    .line 372
    .line 373
    .line 374
    move-object/from16 v10, v28

    .line 375
    .line 376
    move-object/from16 v1, v29

    .line 377
    .line 378
    iget-object v11, v10, Lb64;->a:[Lz54;

    .line 379
    .line 380
    array-length v12, v11

    .line 381
    const/4 v14, 0x0

    .line 382
    :goto_11
    if-ge v14, v12, :cond_14

    .line 383
    .line 384
    move/from16 p8, v2

    .line 385
    .line 386
    aget-object v2, v11, v14

    .line 387
    .line 388
    move-object/from16 v28, v11

    .line 389
    .line 390
    move/from16 v29, v12

    .line 391
    .line 392
    if-eqz v2, :cond_13

    .line 393
    .line 394
    iget-wide v11, v2, Lz54;->l:J

    .line 395
    .line 396
    const-wide v3, 0x7fffffff7fffffffL

    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    invoke-static {v11, v12, v3, v4}, Lhf3;->a(JJ)Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-nez v3, :cond_13

    .line 406
    .line 407
    iget-wide v3, v2, Lz54;->l:J

    .line 408
    .line 409
    invoke-static {v3, v4, v8, v9}, Lhf3;->c(JJ)J

    .line 410
    .line 411
    .line 412
    move-result-wide v3

    .line 413
    iput-wide v3, v2, Lz54;->l:J

    .line 414
    .line 415
    :cond_13
    add-int/lit8 v14, v14, 0x1

    .line 416
    .line 417
    move-object/from16 v3, p4

    .line 418
    .line 419
    move-object/from16 v4, p5

    .line 420
    .line 421
    move/from16 v2, p8

    .line 422
    .line 423
    move-object/from16 v11, v28

    .line 424
    .line 425
    move/from16 v12, v29

    .line 426
    .line 427
    goto :goto_11

    .line 428
    :cond_14
    move/from16 p8, v2

    .line 429
    .line 430
    if-eqz p8, :cond_17

    .line 431
    .line 432
    iget-object v2, v10, Lb64;->a:[Lz54;

    .line 433
    .line 434
    array-length v3, v2

    .line 435
    const/4 v4, 0x0

    .line 436
    :goto_12
    if-ge v4, v3, :cond_17

    .line 437
    .line 438
    aget-object v10, v2, v4

    .line 439
    .line 440
    if-eqz v10, :cond_16

    .line 441
    .line 442
    invoke-virtual {v10}, Lz54;->b()Z

    .line 443
    .line 444
    .line 445
    move-result v11

    .line 446
    if-eqz v11, :cond_15

    .line 447
    .line 448
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    iget-object v11, v0, Ld64;->j:Laq1;

    .line 452
    .line 453
    if-eqz v11, :cond_15

    .line 454
    .line 455
    invoke-static {v11}, Lz68;->W(Lrv1;)V

    .line 456
    .line 457
    .line 458
    :cond_15
    invoke-virtual {v10}, Lz54;->a()V

    .line 459
    .line 460
    .line 461
    :cond_16
    add-int/lit8 v4, v4, 0x1

    .line 462
    .line 463
    goto :goto_12

    .line 464
    :cond_17
    const/4 v2, 0x0

    .line 465
    invoke-virtual {v0, v1, v2}, Ld64;->f(Lf74;Z)V

    .line 466
    .line 467
    .line 468
    goto :goto_13

    .line 469
    :cond_18
    move-object/from16 v1, v29

    .line 470
    .line 471
    add-int/lit8 v14, v14, 0x1

    .line 472
    .line 473
    move-object/from16 v3, p4

    .line 474
    .line 475
    move-object/from16 v4, p5

    .line 476
    .line 477
    move/from16 v2, v28

    .line 478
    .line 479
    move-object/from16 v1, v30

    .line 480
    .line 481
    goto/16 :goto_b

    .line 482
    .line 483
    :cond_19
    invoke-virtual {v0, v10}, Ld64;->e(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_1a
    :goto_13
    add-int/lit8 v2, v35, 0x1

    .line 487
    .line 488
    move-object/from16 v3, p4

    .line 489
    .line 490
    move-object/from16 v4, p5

    .line 491
    .line 492
    move/from16 v1, v34

    .line 493
    .line 494
    goto/16 :goto_a

    .line 495
    .line 496
    :cond_1b
    const/4 v1, 0x1

    .line 497
    new-array v2, v1, [I

    .line 498
    .line 499
    if-eqz v18, :cond_21

    .line 500
    .line 501
    if-eqz v5, :cond_21

    .line 502
    .line 503
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    if-nez v3, :cond_1e

    .line 508
    .line 509
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    if-le v3, v1, :cond_1c

    .line 514
    .line 515
    new-instance v1, Lc64;

    .line 516
    .line 517
    const/4 v3, 0x2

    .line 518
    invoke-direct {v1, v5, v3}, Lc64;-><init>(Lne;B)V

    .line 519
    .line 520
    .line 521
    invoke-static {v12, v1}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 522
    .line 523
    .line 524
    :cond_1c
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    const/4 v3, 0x0

    .line 529
    :goto_14
    if-ge v3, v1, :cond_1d

    .line 530
    .line 531
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    check-cast v4, Lf74;

    .line 536
    .line 537
    invoke-static {v2, v4}, Ld64;->g([ILf74;)I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    sub-int v6, p9, v6

    .line 542
    .line 543
    iget-object v8, v4, Lf74;->i:Ljava/lang/Object;

    .line 544
    .line 545
    invoke-virtual {v15, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    check-cast v8, Lb64;

    .line 553
    .line 554
    invoke-static {v4, v6, v8}, Ld64;->b(Lf74;ILb64;)V

    .line 555
    .line 556
    .line 557
    const/4 v6, 0x0

    .line 558
    invoke-virtual {v0, v4, v6}, Ld64;->f(Lf74;Z)V

    .line 559
    .line 560
    .line 561
    add-int/lit8 v3, v3, 0x1

    .line 562
    .line 563
    goto :goto_14

    .line 564
    :cond_1d
    const/4 v3, 0x1

    .line 565
    const/4 v6, 0x0

    .line 566
    invoke-static {v2, v6, v3, v6}, Ljava/util/Arrays;->fill([IIII)V

    .line 567
    .line 568
    .line 569
    goto :goto_15

    .line 570
    :cond_1e
    move v3, v1

    .line 571
    const/4 v6, 0x0

    .line 572
    :goto_15
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    if-nez v1, :cond_21

    .line 577
    .line 578
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    if-le v1, v3, :cond_1f

    .line 583
    .line 584
    new-instance v1, Lc64;

    .line 585
    .line 586
    invoke-direct {v1, v5, v6}, Lc64;-><init>(Lne;B)V

    .line 587
    .line 588
    .line 589
    invoke-static {v11, v1}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 590
    .line 591
    .line 592
    :cond_1f
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    const/4 v3, 0x0

    .line 597
    :goto_16
    if-ge v3, v1, :cond_20

    .line 598
    .line 599
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    check-cast v4, Lf74;

    .line 604
    .line 605
    invoke-static {v2, v4}, Ld64;->g([ILf74;)I

    .line 606
    .line 607
    .line 608
    move-result v6

    .line 609
    add-int v6, v6, p10

    .line 610
    .line 611
    iget v8, v4, Lf74;->o:I

    .line 612
    .line 613
    iget v9, v4, Lf74;->p:I

    .line 614
    .line 615
    add-int/2addr v8, v9

    .line 616
    sub-int/2addr v6, v8

    .line 617
    iget-object v8, v4, Lf74;->i:Ljava/lang/Object;

    .line 618
    .line 619
    invoke-virtual {v15, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v8

    .line 623
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    check-cast v8, Lb64;

    .line 627
    .line 628
    invoke-static {v4, v6, v8}, Ld64;->b(Lf74;ILb64;)V

    .line 629
    .line 630
    .line 631
    const/4 v6, 0x0

    .line 632
    invoke-virtual {v0, v4, v6}, Ld64;->f(Lf74;Z)V

    .line 633
    .line 634
    .line 635
    add-int/lit8 v3, v3, 0x1

    .line 636
    .line 637
    goto :goto_16

    .line 638
    :cond_20
    const/4 v3, 0x1

    .line 639
    const/4 v6, 0x0

    .line 640
    invoke-static {v2, v6, v3, v6}, Ljava/util/Arrays;->fill([IIII)V

    .line 641
    .line 642
    .line 643
    :cond_21
    iget-object v1, v13, Lt05;->b:[Ljava/lang/Object;

    .line 644
    .line 645
    iget-object v3, v13, Lt05;->a:[J

    .line 646
    .line 647
    array-length v4, v3

    .line 648
    const/4 v6, 0x2

    .line 649
    sub-int/2addr v4, v6

    .line 650
    iget-object v8, v0, Ld64;->h:Ljava/util/ArrayList;

    .line 651
    .line 652
    iget-object v9, v0, Ld64;->g:Ljava/util/ArrayList;

    .line 653
    .line 654
    if-ltz v4, :cond_36

    .line 655
    .line 656
    move-object/from16 v28, v7

    .line 657
    .line 658
    const/4 v10, 0x0

    .line 659
    :goto_17
    aget-wide v6, v3, v10

    .line 660
    .line 661
    move-object v14, v9

    .line 662
    move/from16 v29, v10

    .line 663
    .line 664
    not-long v9, v6

    .line 665
    shl-long v9, v9, v24

    .line 666
    .line 667
    and-long/2addr v9, v6

    .line 668
    and-long v9, v9, v25

    .line 669
    .line 670
    cmp-long v9, v9, v25

    .line 671
    .line 672
    if-eqz v9, :cond_35

    .line 673
    .line 674
    sub-int v10, v29, v4

    .line 675
    .line 676
    not-int v9, v10

    .line 677
    ushr-int/lit8 v9, v9, 0x1f

    .line 678
    .line 679
    const/16 v27, 0x8

    .line 680
    .line 681
    rsub-int/lit8 v9, v9, 0x8

    .line 682
    .line 683
    const/4 v10, 0x0

    .line 684
    :goto_18
    if-ge v10, v9, :cond_34

    .line 685
    .line 686
    and-long v30, v6, v22

    .line 687
    .line 688
    cmp-long v30, v30, v20

    .line 689
    .line 690
    if-gez v30, :cond_33

    .line 691
    .line 692
    shl-int/lit8 v30, v29, 0x3

    .line 693
    .line 694
    add-int v30, v30, v10

    .line 695
    .line 696
    move-object/from16 v31, v13

    .line 697
    .line 698
    aget-object v13, v1, v30

    .line 699
    .line 700
    invoke-virtual {v15, v13}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v30

    .line 704
    move-object/from16 v32, v14

    .line 705
    .line 706
    move-object/from16 v14, v30

    .line 707
    .line 708
    check-cast v14, Lb64;

    .line 709
    .line 710
    if-nez v14, :cond_22

    .line 711
    .line 712
    move-object/from16 v30, v1

    .line 713
    .line 714
    move-object/from16 v33, v3

    .line 715
    .line 716
    move-wide/from16 v34, v6

    .line 717
    .line 718
    move/from16 v46, v9

    .line 719
    .line 720
    move/from16 v19, v10

    .line 721
    .line 722
    move-object/from16 v44, v15

    .line 723
    .line 724
    move/from16 p8, v27

    .line 725
    .line 726
    move-object/from16 v6, v28

    .line 727
    .line 728
    move/from16 v45, v29

    .line 729
    .line 730
    move-object/from16 v15, v32

    .line 731
    .line 732
    const/16 v28, -0x1

    .line 733
    .line 734
    move-object/from16 v27, v2

    .line 735
    .line 736
    move-object/from16 v29, v11

    .line 737
    .line 738
    move-object/from16 v32, v12

    .line 739
    .line 740
    goto/16 :goto_21

    .line 741
    .line 742
    :cond_22
    move-object/from16 v30, v1

    .line 743
    .line 744
    move-object/from16 v33, v3

    .line 745
    .line 746
    move-object/from16 v1, p5

    .line 747
    .line 748
    invoke-virtual {v1, v13}, Lne;->e(Ljava/lang/Object;)I

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    move-wide/from16 v34, v6

    .line 753
    .line 754
    iget v6, v14, Lb64;->e:I

    .line 755
    .line 756
    const/4 v7, 0x1

    .line 757
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 758
    .line 759
    .line 760
    move-result v6

    .line 761
    iput v6, v14, Lb64;->e:I

    .line 762
    .line 763
    rsub-int/lit8 v6, v6, 0x1

    .line 764
    .line 765
    iget v7, v14, Lb64;->d:I

    .line 766
    .line 767
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    iput v6, v14, Lb64;->d:I

    .line 772
    .line 773
    const/4 v6, -0x1

    .line 774
    if-ne v3, v6, :cond_2e

    .line 775
    .line 776
    iget-object v3, v14, Lb64;->a:[Lz54;

    .line 777
    .line 778
    array-length v7, v3

    .line 779
    const/4 v6, 0x0

    .line 780
    const/16 v36, 0x0

    .line 781
    .line 782
    const/16 v37, 0x0

    .line 783
    .line 784
    :goto_19
    if-ge v6, v7, :cond_2c

    .line 785
    .line 786
    move/from16 v38, v10

    .line 787
    .line 788
    aget-object v10, v3, v6

    .line 789
    .line 790
    add-int/lit8 v39, v37, 0x1

    .line 791
    .line 792
    if-eqz v10, :cond_2b

    .line 793
    .line 794
    invoke-virtual {v10}, Lz54;->b()Z

    .line 795
    .line 796
    .line 797
    move-result v40

    .line 798
    if-eqz v40, :cond_23

    .line 799
    .line 800
    move-object/from16 v40, v3

    .line 801
    .line 802
    move/from16 v42, v6

    .line 803
    .line 804
    move/from16 v43, v7

    .line 805
    .line 806
    move/from16 v46, v9

    .line 807
    .line 808
    move-object v7, v13

    .line 809
    move-object/from16 v44, v15

    .line 810
    .line 811
    move-object/from16 v13, v19

    .line 812
    .line 813
    move/from16 v1, v27

    .line 814
    .line 815
    move-object/from16 v3, v28

    .line 816
    .line 817
    move/from16 v45, v29

    .line 818
    .line 819
    move-object/from16 v15, v32

    .line 820
    .line 821
    move/from16 v19, v38

    .line 822
    .line 823
    const/4 v10, 0x1

    .line 824
    :goto_1a
    const/16 v28, -0x1

    .line 825
    .line 826
    move-object/from16 v27, v2

    .line 827
    .line 828
    move-object/from16 v29, v11

    .line 829
    .line 830
    move-object/from16 v32, v12

    .line 831
    .line 832
    move-object v2, v14

    .line 833
    goto/16 :goto_1d

    .line 834
    .line 835
    :cond_23
    move-object/from16 v40, v3

    .line 836
    .line 837
    iget-object v3, v10, Lz54;->k:Lrh5;

    .line 838
    .line 839
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v3

    .line 843
    check-cast v3, Ljava/lang/Boolean;

    .line 844
    .line 845
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 846
    .line 847
    .line 848
    move-result v3

    .line 849
    if-eqz v3, :cond_25

    .line 850
    .line 851
    invoke-virtual {v10}, Lz54;->c()V

    .line 852
    .line 853
    .line 854
    iget-object v3, v14, Lb64;->a:[Lz54;

    .line 855
    .line 856
    aput-object v19, v3, v37

    .line 857
    .line 858
    move-object/from16 v3, v28

    .line 859
    .line 860
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    iget-object v10, v0, Ld64;->j:Laq1;

    .line 864
    .line 865
    if-eqz v10, :cond_24

    .line 866
    .line 867
    invoke-static {v10}, Lz68;->W(Lrv1;)V

    .line 868
    .line 869
    .line 870
    :cond_24
    move/from16 v42, v6

    .line 871
    .line 872
    move/from16 v43, v7

    .line 873
    .line 874
    move/from16 v46, v9

    .line 875
    .line 876
    move-object v7, v13

    .line 877
    move-object/from16 v44, v15

    .line 878
    .line 879
    move-object/from16 v13, v19

    .line 880
    .line 881
    move/from16 v1, v27

    .line 882
    .line 883
    move/from16 v45, v29

    .line 884
    .line 885
    move-object/from16 v15, v32

    .line 886
    .line 887
    move/from16 v10, v36

    .line 888
    .line 889
    move/from16 v19, v38

    .line 890
    .line 891
    goto :goto_1a

    .line 892
    :cond_25
    move-object/from16 v3, v28

    .line 893
    .line 894
    move-object/from16 v28, v12

    .line 895
    .line 896
    iget-object v12, v10, Lz54;->o:Lxt2;

    .line 897
    .line 898
    if-eqz v12, :cond_28

    .line 899
    .line 900
    move-object/from16 v41, v11

    .line 901
    .line 902
    iget-object v11, v10, Lz54;->f:Lta2;

    .line 903
    .line 904
    invoke-virtual {v10}, Lz54;->b()Z

    .line 905
    .line 906
    .line 907
    move-result v42

    .line 908
    if-nez v42, :cond_26

    .line 909
    .line 910
    if-nez v11, :cond_27

    .line 911
    .line 912
    :cond_26
    move/from16 v42, v6

    .line 913
    .line 914
    move/from16 v43, v7

    .line 915
    .line 916
    move/from16 v46, v9

    .line 917
    .line 918
    move-object v7, v13

    .line 919
    move-object/from16 v44, v15

    .line 920
    .line 921
    move-object/from16 v13, v19

    .line 922
    .line 923
    move/from16 v1, v27

    .line 924
    .line 925
    move/from16 v45, v29

    .line 926
    .line 927
    move-object/from16 v15, v32

    .line 928
    .line 929
    move/from16 v19, v38

    .line 930
    .line 931
    move-object/from16 v29, v41

    .line 932
    .line 933
    move-object/from16 v27, v2

    .line 934
    .line 935
    goto :goto_1b

    .line 936
    :cond_27
    move/from16 v42, v6

    .line 937
    .line 938
    iget-object v6, v10, Lz54;->j:Lrh5;

    .line 939
    .line 940
    move/from16 v43, v7

    .line 941
    .line 942
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 943
    .line 944
    invoke-virtual {v6, v7}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    iget-object v6, v10, Lz54;->a:Lb71;

    .line 948
    .line 949
    move v7, v9

    .line 950
    new-instance v9, Lr0;

    .line 951
    .line 952
    move-object/from16 v44, v14

    .line 953
    .line 954
    const/16 v14, 0x1c

    .line 955
    .line 956
    move/from16 v46, v7

    .line 957
    .line 958
    move-object v7, v13

    .line 959
    move-object/from16 v13, v19

    .line 960
    .line 961
    move/from16 v1, v27

    .line 962
    .line 963
    move/from16 v45, v29

    .line 964
    .line 965
    move/from16 v19, v38

    .line 966
    .line 967
    move-object/from16 v29, v41

    .line 968
    .line 969
    move-object/from16 v27, v2

    .line 970
    .line 971
    move-object/from16 v2, v44

    .line 972
    .line 973
    move-object/from16 v44, v15

    .line 974
    .line 975
    move-object/from16 v15, v32

    .line 976
    .line 977
    move-object/from16 v32, v28

    .line 978
    .line 979
    const/16 v28, -0x1

    .line 980
    .line 981
    invoke-direct/range {v9 .. v14}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 982
    .line 983
    .line 984
    const/4 v11, 0x3

    .line 985
    invoke-static {v6, v13, v13, v9, v11}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 986
    .line 987
    .line 988
    goto :goto_1c

    .line 989
    :cond_28
    move/from16 v42, v6

    .line 990
    .line 991
    move/from16 v43, v7

    .line 992
    .line 993
    move/from16 v46, v9

    .line 994
    .line 995
    move-object v7, v13

    .line 996
    move-object/from16 v44, v15

    .line 997
    .line 998
    move-object/from16 v13, v19

    .line 999
    .line 1000
    move/from16 v1, v27

    .line 1001
    .line 1002
    move/from16 v45, v29

    .line 1003
    .line 1004
    move-object/from16 v15, v32

    .line 1005
    .line 1006
    move/from16 v19, v38

    .line 1007
    .line 1008
    move-object/from16 v27, v2

    .line 1009
    .line 1010
    move-object/from16 v29, v11

    .line 1011
    .line 1012
    :goto_1b
    move-object v2, v14

    .line 1013
    move-object/from16 v32, v28

    .line 1014
    .line 1015
    const/16 v28, -0x1

    .line 1016
    .line 1017
    :goto_1c
    invoke-virtual {v10}, Lz54;->b()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    if-eqz v6, :cond_2a

    .line 1022
    .line 1023
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    iget-object v6, v0, Ld64;->j:Laq1;

    .line 1027
    .line 1028
    if-eqz v6, :cond_29

    .line 1029
    .line 1030
    invoke-static {v6}, Lz68;->W(Lrv1;)V

    .line 1031
    .line 1032
    .line 1033
    :cond_29
    const/4 v10, 0x1

    .line 1034
    goto :goto_1d

    .line 1035
    :cond_2a
    invoke-virtual {v10}, Lz54;->c()V

    .line 1036
    .line 1037
    .line 1038
    iget-object v6, v2, Lb64;->a:[Lz54;

    .line 1039
    .line 1040
    aput-object v13, v6, v37

    .line 1041
    .line 1042
    move/from16 v10, v36

    .line 1043
    .line 1044
    :goto_1d
    move/from16 v36, v10

    .line 1045
    .line 1046
    goto :goto_1e

    .line 1047
    :cond_2b
    move-object/from16 v40, v3

    .line 1048
    .line 1049
    move/from16 v42, v6

    .line 1050
    .line 1051
    move/from16 v43, v7

    .line 1052
    .line 1053
    move/from16 v46, v9

    .line 1054
    .line 1055
    move-object v7, v13

    .line 1056
    move-object/from16 v44, v15

    .line 1057
    .line 1058
    move-object/from16 v13, v19

    .line 1059
    .line 1060
    move/from16 v1, v27

    .line 1061
    .line 1062
    move-object/from16 v3, v28

    .line 1063
    .line 1064
    move/from16 v45, v29

    .line 1065
    .line 1066
    move-object/from16 v15, v32

    .line 1067
    .line 1068
    move/from16 v19, v38

    .line 1069
    .line 1070
    const/16 v28, -0x1

    .line 1071
    .line 1072
    move-object/from16 v27, v2

    .line 1073
    .line 1074
    move-object/from16 v29, v11

    .line 1075
    .line 1076
    move-object/from16 v32, v12

    .line 1077
    .line 1078
    move-object v2, v14

    .line 1079
    :goto_1e
    add-int/lit8 v6, v42, 0x1

    .line 1080
    .line 1081
    move-object v14, v2

    .line 1082
    move-object/from16 v28, v3

    .line 1083
    .line 1084
    move/from16 v10, v19

    .line 1085
    .line 1086
    move-object/from16 v2, v27

    .line 1087
    .line 1088
    move-object/from16 v11, v29

    .line 1089
    .line 1090
    move-object/from16 v12, v32

    .line 1091
    .line 1092
    move/from16 v37, v39

    .line 1093
    .line 1094
    move-object/from16 v3, v40

    .line 1095
    .line 1096
    move/from16 v29, v45

    .line 1097
    .line 1098
    move/from16 v9, v46

    .line 1099
    .line 1100
    move/from16 v27, v1

    .line 1101
    .line 1102
    move-object/from16 v19, v13

    .line 1103
    .line 1104
    move-object/from16 v32, v15

    .line 1105
    .line 1106
    move-object/from16 v15, v44

    .line 1107
    .line 1108
    move-object/from16 v1, p5

    .line 1109
    .line 1110
    move-object v13, v7

    .line 1111
    move/from16 v7, v43

    .line 1112
    .line 1113
    goto/16 :goto_19

    .line 1114
    .line 1115
    :cond_2c
    move/from16 v46, v9

    .line 1116
    .line 1117
    move-object v7, v13

    .line 1118
    move-object/from16 v44, v15

    .line 1119
    .line 1120
    move-object/from16 v13, v19

    .line 1121
    .line 1122
    move/from16 v1, v27

    .line 1123
    .line 1124
    move-object/from16 v3, v28

    .line 1125
    .line 1126
    move/from16 v45, v29

    .line 1127
    .line 1128
    move-object/from16 v15, v32

    .line 1129
    .line 1130
    const/16 v28, -0x1

    .line 1131
    .line 1132
    move-object/from16 v27, v2

    .line 1133
    .line 1134
    move/from16 v19, v10

    .line 1135
    .line 1136
    move-object/from16 v29, v11

    .line 1137
    .line 1138
    move-object/from16 v32, v12

    .line 1139
    .line 1140
    if-nez v36, :cond_2d

    .line 1141
    .line 1142
    invoke-virtual {v0, v7}, Ld64;->e(Ljava/lang/Object;)V

    .line 1143
    .line 1144
    .line 1145
    :cond_2d
    move-object/from16 v11, p6

    .line 1146
    .line 1147
    move/from16 p8, v1

    .line 1148
    .line 1149
    move-object v6, v3

    .line 1150
    goto/16 :goto_22

    .line 1151
    .line 1152
    :cond_2e
    move-object/from16 v1, v28

    .line 1153
    .line 1154
    move/from16 v28, v6

    .line 1155
    .line 1156
    move-object v6, v1

    .line 1157
    move/from16 v46, v9

    .line 1158
    .line 1159
    move-object v7, v13

    .line 1160
    move-object/from16 v44, v15

    .line 1161
    .line 1162
    move-object/from16 v13, v19

    .line 1163
    .line 1164
    move/from16 v1, v27

    .line 1165
    .line 1166
    move/from16 v45, v29

    .line 1167
    .line 1168
    move-object/from16 v15, v32

    .line 1169
    .line 1170
    move-object/from16 v27, v2

    .line 1171
    .line 1172
    move/from16 v19, v10

    .line 1173
    .line 1174
    move-object/from16 v29, v11

    .line 1175
    .line 1176
    move-object/from16 v32, v12

    .line 1177
    .line 1178
    move-object v2, v14

    .line 1179
    iget-object v9, v2, Lb64;->b:Lq31;

    .line 1180
    .line 1181
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1182
    .line 1183
    .line 1184
    iget-wide v9, v9, Lq31;->a:J

    .line 1185
    .line 1186
    move-object/from16 v11, p6

    .line 1187
    .line 1188
    invoke-virtual {v11, v3, v9, v10}, Lc74;->a(IJ)Lf74;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v9

    .line 1192
    const/4 v10, 0x1

    .line 1193
    iput-boolean v10, v9, Lf74;->r:Z

    .line 1194
    .line 1195
    iget-object v12, v2, Lb64;->a:[Lz54;

    .line 1196
    .line 1197
    array-length v14, v12

    .line 1198
    const/4 v13, 0x0

    .line 1199
    :goto_1f
    if-ge v13, v14, :cond_30

    .line 1200
    .line 1201
    move/from16 p8, v1

    .line 1202
    .line 1203
    aget-object v1, v12, v13

    .line 1204
    .line 1205
    if-eqz v1, :cond_2f

    .line 1206
    .line 1207
    iget-object v1, v1, Lz54;->h:Lrh5;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    check-cast v1, Ljava/lang/Boolean;

    .line 1214
    .line 1215
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1216
    .line 1217
    .line 1218
    move-result v1

    .line 1219
    if-ne v1, v10, :cond_2f

    .line 1220
    .line 1221
    goto :goto_20

    .line 1222
    :cond_2f
    add-int/lit8 v13, v13, 0x1

    .line 1223
    .line 1224
    move/from16 v1, p8

    .line 1225
    .line 1226
    const/4 v10, 0x1

    .line 1227
    goto :goto_1f

    .line 1228
    :cond_30
    move/from16 p8, v1

    .line 1229
    .line 1230
    if-eqz v5, :cond_31

    .line 1231
    .line 1232
    invoke-virtual {v5, v7}, Lne;->e(Ljava/lang/Object;)I

    .line 1233
    .line 1234
    .line 1235
    move-result v1

    .line 1236
    if-ne v3, v1, :cond_31

    .line 1237
    .line 1238
    invoke-virtual {v0, v7}, Ld64;->e(Ljava/lang/Object;)V

    .line 1239
    .line 1240
    .line 1241
    goto :goto_22

    .line 1242
    :cond_31
    :goto_20
    iget v1, v2, Lb64;->c:I

    .line 1243
    .line 1244
    move/from16 v40, p9

    .line 1245
    .line 1246
    move/from16 v41, p10

    .line 1247
    .line 1248
    move-object/from16 v38, p11

    .line 1249
    .line 1250
    move-object/from16 v39, p12

    .line 1251
    .line 1252
    move/from16 v42, v1

    .line 1253
    .line 1254
    move-object/from16 v36, v2

    .line 1255
    .line 1256
    move-object/from16 v37, v9

    .line 1257
    .line 1258
    invoke-virtual/range {v36 .. v42}, Lb64;->a(Lf74;Lb71;Lvt2;III)V

    .line 1259
    .line 1260
    .line 1261
    move-object/from16 v1, v37

    .line 1262
    .line 1263
    iget v2, v0, Ld64;->c:I

    .line 1264
    .line 1265
    if-ge v3, v2, :cond_32

    .line 1266
    .line 1267
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1268
    .line 1269
    .line 1270
    goto :goto_22

    .line 1271
    :cond_32
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    goto :goto_22

    .line 1275
    :cond_33
    move-object/from16 v30, v1

    .line 1276
    .line 1277
    move-object/from16 v33, v3

    .line 1278
    .line 1279
    move-wide/from16 v34, v6

    .line 1280
    .line 1281
    move/from16 v46, v9

    .line 1282
    .line 1283
    move/from16 v19, v10

    .line 1284
    .line 1285
    move-object/from16 v32, v12

    .line 1286
    .line 1287
    move-object/from16 v31, v13

    .line 1288
    .line 1289
    move-object/from16 v44, v15

    .line 1290
    .line 1291
    move/from16 p8, v27

    .line 1292
    .line 1293
    move-object/from16 v6, v28

    .line 1294
    .line 1295
    move/from16 v45, v29

    .line 1296
    .line 1297
    const/16 v28, -0x1

    .line 1298
    .line 1299
    move-object/from16 v27, v2

    .line 1300
    .line 1301
    move-object/from16 v29, v11

    .line 1302
    .line 1303
    move-object v15, v14

    .line 1304
    :goto_21
    move-object/from16 v11, p6

    .line 1305
    .line 1306
    :goto_22
    shr-long v1, v34, p8

    .line 1307
    .line 1308
    add-int/lit8 v10, v19, 0x1

    .line 1309
    .line 1310
    move-object/from16 v28, v6

    .line 1311
    .line 1312
    move-object v14, v15

    .line 1313
    move-object/from16 v11, v29

    .line 1314
    .line 1315
    move-object/from16 v13, v31

    .line 1316
    .line 1317
    move-object/from16 v12, v32

    .line 1318
    .line 1319
    move-object/from16 v3, v33

    .line 1320
    .line 1321
    move-object/from16 v15, v44

    .line 1322
    .line 1323
    move/from16 v29, v45

    .line 1324
    .line 1325
    move/from16 v9, v46

    .line 1326
    .line 1327
    const/16 v19, 0x0

    .line 1328
    .line 1329
    move-wide v6, v1

    .line 1330
    move-object/from16 v2, v27

    .line 1331
    .line 1332
    move-object/from16 v1, v30

    .line 1333
    .line 1334
    move/from16 v27, p8

    .line 1335
    .line 1336
    goto/16 :goto_18

    .line 1337
    .line 1338
    :cond_34
    move-object/from16 v30, v1

    .line 1339
    .line 1340
    move-object/from16 v33, v3

    .line 1341
    .line 1342
    move v7, v9

    .line 1343
    move-object/from16 v32, v12

    .line 1344
    .line 1345
    move-object/from16 v31, v13

    .line 1346
    .line 1347
    move-object/from16 v44, v15

    .line 1348
    .line 1349
    move/from16 v1, v27

    .line 1350
    .line 1351
    move-object/from16 v6, v28

    .line 1352
    .line 1353
    move/from16 v45, v29

    .line 1354
    .line 1355
    const/16 v28, -0x1

    .line 1356
    .line 1357
    move-object/from16 v27, v2

    .line 1358
    .line 1359
    move-object/from16 v29, v11

    .line 1360
    .line 1361
    move-object v15, v14

    .line 1362
    move-object/from16 v11, p6

    .line 1363
    .line 1364
    if-ne v7, v1, :cond_37

    .line 1365
    .line 1366
    :goto_23
    move/from16 v2, v45

    .line 1367
    .line 1368
    goto :goto_24

    .line 1369
    :cond_35
    move-object/from16 v30, v1

    .line 1370
    .line 1371
    move-object/from16 v27, v2

    .line 1372
    .line 1373
    move-object/from16 v33, v3

    .line 1374
    .line 1375
    move-object/from16 v32, v12

    .line 1376
    .line 1377
    move-object/from16 v31, v13

    .line 1378
    .line 1379
    move-object/from16 v44, v15

    .line 1380
    .line 1381
    move-object/from16 v6, v28

    .line 1382
    .line 1383
    move/from16 v45, v29

    .line 1384
    .line 1385
    const/16 v1, 0x8

    .line 1386
    .line 1387
    const/16 v28, -0x1

    .line 1388
    .line 1389
    move-object/from16 v29, v11

    .line 1390
    .line 1391
    move-object v15, v14

    .line 1392
    move-object/from16 v11, p6

    .line 1393
    .line 1394
    goto :goto_23

    .line 1395
    :goto_24
    if-eq v2, v4, :cond_37

    .line 1396
    .line 1397
    add-int/lit8 v10, v2, 0x1

    .line 1398
    .line 1399
    move-object/from16 v28, v6

    .line 1400
    .line 1401
    move-object v9, v15

    .line 1402
    move-object/from16 v2, v27

    .line 1403
    .line 1404
    move-object/from16 v11, v29

    .line 1405
    .line 1406
    move-object/from16 v1, v30

    .line 1407
    .line 1408
    move-object/from16 v13, v31

    .line 1409
    .line 1410
    move-object/from16 v12, v32

    .line 1411
    .line 1412
    move-object/from16 v3, v33

    .line 1413
    .line 1414
    move-object/from16 v15, v44

    .line 1415
    .line 1416
    const/16 v19, 0x0

    .line 1417
    .line 1418
    goto/16 :goto_17

    .line 1419
    .line 1420
    :cond_36
    move-object/from16 v27, v2

    .line 1421
    .line 1422
    move-object/from16 v29, v11

    .line 1423
    .line 1424
    move-object/from16 v32, v12

    .line 1425
    .line 1426
    move-object/from16 v31, v13

    .line 1427
    .line 1428
    move-object/from16 v44, v15

    .line 1429
    .line 1430
    move-object v15, v9

    .line 1431
    :cond_37
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1432
    .line 1433
    .line 1434
    move-result v1

    .line 1435
    if-nez v1, :cond_3c

    .line 1436
    .line 1437
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1438
    .line 1439
    .line 1440
    move-result v1

    .line 1441
    const/4 v3, 0x1

    .line 1442
    if-le v1, v3, :cond_38

    .line 1443
    .line 1444
    new-instance v1, Lc64;

    .line 1445
    .line 1446
    move-object/from16 v4, p5

    .line 1447
    .line 1448
    const/4 v11, 0x3

    .line 1449
    invoke-direct {v1, v4, v11}, Lc64;-><init>(Lne;B)V

    .line 1450
    .line 1451
    .line 1452
    invoke-static {v15, v1}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1453
    .line 1454
    .line 1455
    goto :goto_25

    .line 1456
    :cond_38
    move-object/from16 v4, p5

    .line 1457
    .line 1458
    :goto_25
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1459
    .line 1460
    .line 1461
    move-result v1

    .line 1462
    const/4 v2, 0x0

    .line 1463
    :goto_26
    if-ge v2, v1, :cond_3b

    .line 1464
    .line 1465
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    check-cast v3, Lf74;

    .line 1470
    .line 1471
    iget-object v5, v3, Lf74;->i:Ljava/lang/Object;

    .line 1472
    .line 1473
    move-object/from16 v6, v44

    .line 1474
    .line 1475
    invoke-virtual {v6, v5}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v5

    .line 1479
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1480
    .line 1481
    .line 1482
    check-cast v5, Lb64;

    .line 1483
    .line 1484
    move-object/from16 v7, v27

    .line 1485
    .line 1486
    invoke-static {v7, v3}, Ld64;->g([ILf74;)I

    .line 1487
    .line 1488
    .line 1489
    move-result v9

    .line 1490
    if-eqz p7, :cond_39

    .line 1491
    .line 1492
    invoke-static/range {p4 .. p4}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v5

    .line 1496
    check-cast v5, Lf74;

    .line 1497
    .line 1498
    const/4 v10, 0x0

    .line 1499
    invoke-virtual {v5, v10}, Lf74;->b(I)J

    .line 1500
    .line 1501
    .line 1502
    move-result-wide v11

    .line 1503
    and-long v10, v11, v16

    .line 1504
    .line 1505
    long-to-int v5, v10

    .line 1506
    goto :goto_27

    .line 1507
    :cond_39
    iget v5, v5, Lb64;->f:I

    .line 1508
    .line 1509
    :goto_27
    sub-int/2addr v5, v9

    .line 1510
    move/from16 v9, p2

    .line 1511
    .line 1512
    move/from16 v10, p3

    .line 1513
    .line 1514
    invoke-virtual {v3, v5, v9, v10}, Lf74;->d(III)V

    .line 1515
    .line 1516
    .line 1517
    const/4 v5, 0x1

    .line 1518
    if-eqz v18, :cond_3a

    .line 1519
    .line 1520
    invoke-virtual {v0, v3, v5}, Ld64;->f(Lf74;Z)V

    .line 1521
    .line 1522
    .line 1523
    :cond_3a
    add-int/lit8 v2, v2, 0x1

    .line 1524
    .line 1525
    move-object/from16 v44, v6

    .line 1526
    .line 1527
    move-object/from16 v27, v7

    .line 1528
    .line 1529
    goto :goto_26

    .line 1530
    :cond_3b
    move/from16 v9, p2

    .line 1531
    .line 1532
    move/from16 v10, p3

    .line 1533
    .line 1534
    move-object/from16 v7, v27

    .line 1535
    .line 1536
    move-object/from16 v6, v44

    .line 1537
    .line 1538
    const/4 v2, 0x0

    .line 1539
    const/4 v5, 0x1

    .line 1540
    invoke-static {v7, v2, v5, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 1541
    .line 1542
    .line 1543
    goto :goto_28

    .line 1544
    :cond_3c
    move/from16 v9, p2

    .line 1545
    .line 1546
    move/from16 v10, p3

    .line 1547
    .line 1548
    move-object/from16 v4, p5

    .line 1549
    .line 1550
    move-object/from16 v7, v27

    .line 1551
    .line 1552
    move-object/from16 v6, v44

    .line 1553
    .line 1554
    const/4 v5, 0x1

    .line 1555
    :goto_28
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1556
    .line 1557
    .line 1558
    move-result v1

    .line 1559
    if-nez v1, :cond_3f

    .line 1560
    .line 1561
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1562
    .line 1563
    .line 1564
    move-result v1

    .line 1565
    if-le v1, v5, :cond_3d

    .line 1566
    .line 1567
    new-instance v1, Lc64;

    .line 1568
    .line 1569
    invoke-direct {v1, v4, v5}, Lc64;-><init>(Lne;B)V

    .line 1570
    .line 1571
    .line 1572
    invoke-static {v8, v1}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1573
    .line 1574
    .line 1575
    :cond_3d
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1576
    .line 1577
    .line 1578
    move-result v1

    .line 1579
    const/4 v2, 0x0

    .line 1580
    :goto_29
    if-ge v2, v1, :cond_3f

    .line 1581
    .line 1582
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v3

    .line 1586
    check-cast v3, Lf74;

    .line 1587
    .line 1588
    iget-object v4, v3, Lf74;->i:Ljava/lang/Object;

    .line 1589
    .line 1590
    invoke-virtual {v6, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v4

    .line 1594
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1595
    .line 1596
    .line 1597
    check-cast v4, Lb64;

    .line 1598
    .line 1599
    invoke-static {v7, v3}, Ld64;->g([ILf74;)I

    .line 1600
    .line 1601
    .line 1602
    move-result v5

    .line 1603
    iget v4, v4, Lb64;->g:I

    .line 1604
    .line 1605
    iget v11, v3, Lf74;->o:I

    .line 1606
    .line 1607
    iget v12, v3, Lf74;->p:I

    .line 1608
    .line 1609
    add-int/2addr v11, v12

    .line 1610
    sub-int/2addr v4, v11

    .line 1611
    add-int/2addr v4, v5

    .line 1612
    invoke-virtual {v3, v4, v9, v10}, Lf74;->d(III)V

    .line 1613
    .line 1614
    .line 1615
    const/4 v5, 0x1

    .line 1616
    if-eqz v18, :cond_3e

    .line 1617
    .line 1618
    invoke-virtual {v0, v3, v5}, Ld64;->f(Lf74;Z)V

    .line 1619
    .line 1620
    .line 1621
    :cond_3e
    add-int/lit8 v2, v2, 0x1

    .line 1622
    .line 1623
    goto :goto_29

    .line 1624
    :cond_3f
    invoke-static {v15}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1625
    .line 1626
    .line 1627
    move-object/from16 v3, p4

    .line 1628
    .line 1629
    const/4 v6, 0x0

    .line 1630
    invoke-virtual {v3, v6, v15}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 1631
    .line 1632
    .line 1633
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->clear()V

    .line 1637
    .line 1638
    .line 1639
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->clear()V

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual/range {v31 .. v31}, Lt05;->b()V

    .line 1649
    .line 1650
    .line 1651
    return-void
.end method

.method public final d()V
    .locals 14

    .line 1
    iget-object p0, p0, Ld64;->a:Ls05;

    .line 2
    .line 3
    iget v0, p0, Ls05;->e:I

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, Ls05;->c:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, p0, Ls05;->a:[J

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    add-int/lit8 v2, v2, -0x2

    .line 13
    .line 14
    if-ltz v2, :cond_4

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    aget-wide v5, v1, v4

    .line 19
    .line 20
    not-long v7, v5

    .line 21
    const/4 v9, 0x7

    .line 22
    shl-long/2addr v7, v9

    .line 23
    and-long/2addr v7, v5

    .line 24
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v7, v9

    .line 30
    cmp-long v7, v7, v9

    .line 31
    .line 32
    if-eqz v7, :cond_3

    .line 33
    .line 34
    sub-int v7, v4, v2

    .line 35
    .line 36
    not-int v7, v7

    .line 37
    ushr-int/lit8 v7, v7, 0x1f

    .line 38
    .line 39
    const/16 v8, 0x8

    .line 40
    .line 41
    rsub-int/lit8 v7, v7, 0x8

    .line 42
    .line 43
    move v9, v3

    .line 44
    :goto_1
    if-ge v9, v7, :cond_2

    .line 45
    .line 46
    const-wide/16 v10, 0xff

    .line 47
    .line 48
    and-long/2addr v10, v5

    .line 49
    const-wide/16 v12, 0x80

    .line 50
    .line 51
    cmp-long v10, v10, v12

    .line 52
    .line 53
    if-gez v10, :cond_1

    .line 54
    .line 55
    shl-int/lit8 v10, v4, 0x3

    .line 56
    .line 57
    add-int/2addr v10, v9

    .line 58
    aget-object v10, v0, v10

    .line 59
    .line 60
    check-cast v10, Lb64;

    .line 61
    .line 62
    iget-object v10, v10, Lb64;->a:[Lz54;

    .line 63
    .line 64
    array-length v11, v10

    .line 65
    move v12, v3

    .line 66
    :goto_2
    if-ge v12, v11, :cond_1

    .line 67
    .line 68
    aget-object v13, v10, v12

    .line 69
    .line 70
    if-eqz v13, :cond_0

    .line 71
    .line 72
    invoke-virtual {v13}, Lz54;->c()V

    .line 73
    .line 74
    .line 75
    :cond_0
    add-int/lit8 v12, v12, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    shr-long/2addr v5, v8

    .line 79
    add-int/lit8 v9, v9, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    if-ne v7, v8, :cond_4

    .line 83
    .line 84
    :cond_3
    if-eq v4, v2, :cond_4

    .line 85
    .line 86
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-virtual {p0}, Ls05;->a()V

    .line 90
    .line 91
    .line 92
    :cond_5
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ld64;->a:Ls05;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls05;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lb64;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lb64;->a:[Lz54;

    .line 12
    .line 13
    array-length p1, p0

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p1, :cond_1

    .line 16
    .line 17
    aget-object v1, p0, v0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Lz54;->c()V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public final f(Lf74;Z)V
    .locals 12

    .line 1
    iget-object p0, p0, Ld64;->a:Ls05;

    .line 2
    .line 3
    iget-object v0, p1, Lf74;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lb64;

    .line 13
    .line 14
    iget-object p0, p0, Lb64;->a:[Lz54;

    .line 15
    .line 16
    array-length v0, p0

    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    :goto_0
    if-ge v1, v0, :cond_3

    .line 20
    .line 21
    aget-object v4, p0, v1

    .line 22
    .line 23
    add-int/lit8 v9, v2, 0x1

    .line 24
    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Lf74;->b(I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v10

    .line 31
    iget-wide v2, v4, Lz54;->l:J

    .line 32
    .line 33
    const-wide v5, 0x7fffffff7fffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3, v5, v6}, Lhf3;->a(JJ)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-static {v2, v3, v10, v11}, Lhf3;->a(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    invoke-static {v10, v11, v2, v3}, Lhf3;->b(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-object v5, v4, Lz54;->e:Lta2;

    .line 55
    .line 56
    if-nez v5, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    iget-object v6, v4, Lz54;->r:Lrh5;

    .line 60
    .line 61
    invoke-virtual {v6}, Lrh5;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lhf3;

    .line 66
    .line 67
    iget-wide v6, v6, Lhf3;->a:J

    .line 68
    .line 69
    invoke-static {v6, v7, v2, v3}, Lhf3;->b(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    invoke-virtual {v4, v6, v7}, Lz54;->d(J)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v4, Lz54;->h:Lrh5;

    .line 77
    .line 78
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-boolean p2, v4, Lz54;->g:Z

    .line 84
    .line 85
    iget-object v2, v4, Lz54;->a:Lb71;

    .line 86
    .line 87
    new-instance v3, Ls0;

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    invoke-direct/range {v3 .. v8}, Ls0;-><init>(Lz54;Lta2;JLq51;)V

    .line 91
    .line 92
    .line 93
    const/4 v5, 0x3

    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static {v2, v6, v6, v3, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 96
    .line 97
    .line 98
    :cond_1
    :goto_1
    iput-wide v10, v4, Lz54;->l:J

    .line 99
    .line 100
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    move v2, v9

    .line 103
    goto :goto_0

    .line 104
    :cond_3
    return-void
.end method

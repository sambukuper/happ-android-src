.class public final Le74;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lyr4;


# instance fields
.field public final a:Lf74;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Lyr4;

.field public final f:F

.field public final g:Z

.field public final h:Lb71;

.field public final i:Lfi1;

.field public final j:J

.field public final k:I

.field public final l:Ljava/util/List;

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:Lsd5;

.field public final q:I

.field public final r:I


# direct methods
.method public constructor <init>(Lf74;IZFLyr4;FZLb71;Lfi1;JILjava/util/List;IIILsd5;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le74;->a:Lf74;

    .line 5
    .line 6
    iput p2, p0, Le74;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Le74;->c:Z

    .line 9
    .line 10
    iput p4, p0, Le74;->d:F

    .line 11
    .line 12
    iput-object p5, p0, Le74;->e:Lyr4;

    .line 13
    .line 14
    iput p6, p0, Le74;->f:F

    .line 15
    .line 16
    iput-boolean p7, p0, Le74;->g:Z

    .line 17
    .line 18
    iput-object p8, p0, Le74;->h:Lb71;

    .line 19
    .line 20
    iput-object p9, p0, Le74;->i:Lfi1;

    .line 21
    .line 22
    iput-wide p10, p0, Le74;->j:J

    .line 23
    .line 24
    iput p12, p0, Le74;->k:I

    .line 25
    .line 26
    iput-object p13, p0, Le74;->l:Ljava/util/List;

    .line 27
    .line 28
    iput p14, p0, Le74;->m:I

    .line 29
    .line 30
    iput p15, p0, Le74;->n:I

    .line 31
    .line 32
    move/from16 p1, p16

    .line 33
    .line 34
    iput p1, p0, Le74;->o:I

    .line 35
    .line 36
    move-object/from16 p1, p17

    .line 37
    .line 38
    iput-object p1, p0, Le74;->p:Lsd5;

    .line 39
    .line 40
    move/from16 p1, p18

    .line 41
    .line 42
    iput p1, p0, Le74;->q:I

    .line 43
    .line 44
    move/from16 p1, p19

    .line 45
    .line 46
    iput p1, p0, Le74;->r:I

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->a()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->b()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->e()Lgn2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f()Lrn2;
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->f()Lrn2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->g()Lgn2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(IZ)Le74;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Le74;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Le74;->l:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    iget-object v4, v0, Le74;->a:Lf74;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4}, Lf74;->a()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget v5, v0, Le74;->b:I

    .line 26
    .line 27
    sub-int v6, v5, v1

    .line 28
    .line 29
    if-ltz v6, :cond_0

    .line 30
    .line 31
    if-ge v6, v4, :cond_0

    .line 32
    .line 33
    invoke-static {v2}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lf74;

    .line 38
    .line 39
    invoke-static {v2}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lf74;

    .line 44
    .line 45
    iget-boolean v7, v4, Lf74;->r:Z

    .line 46
    .line 47
    if-nez v7, :cond_0

    .line 48
    .line 49
    iget-boolean v7, v5, Lf74;->r:Z

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    :cond_0
    const/4 v15, 0x0

    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    :cond_1
    iget v7, v4, Lf74;->m:I

    .line 57
    .line 58
    iget v8, v0, Le74;->n:I

    .line 59
    .line 60
    iget v9, v0, Le74;->m:I

    .line 61
    .line 62
    if-gez v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v4}, Lf74;->a()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    add-int/2addr v4, v7

    .line 69
    sub-int/2addr v4, v9

    .line 70
    iget v7, v5, Lf74;->m:I

    .line 71
    .line 72
    invoke-virtual {v5}, Lf74;->a()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    add-int/2addr v5, v7

    .line 77
    sub-int/2addr v5, v8

    .line 78
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    neg-int v5, v1

    .line 83
    if-le v4, v5, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    sub-int/2addr v9, v7

    .line 87
    iget v4, v5, Lf74;->m:I

    .line 88
    .line 89
    sub-int/2addr v8, v4

    .line 90
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-le v4, v1, :cond_0

    .line 95
    .line 96
    :goto_0
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const/4 v5, 0x0

    .line 101
    move v7, v5

    .line 102
    :goto_1
    if-ge v7, v4, :cond_9

    .line 103
    .line 104
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Lf74;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v9, v8, Lf74;->v:[I

    .line 114
    .line 115
    iget-boolean v10, v8, Lf74;->r:Z

    .line 116
    .line 117
    if-eqz v10, :cond_4

    .line 118
    .line 119
    :cond_3
    move/from16 v16, v4

    .line 120
    .line 121
    const/4 v15, 0x0

    .line 122
    goto :goto_7

    .line 123
    :cond_4
    iget v10, v8, Lf74;->m:I

    .line 124
    .line 125
    add-int/2addr v10, v1

    .line 126
    iput v10, v8, Lf74;->m:I

    .line 127
    .line 128
    array-length v10, v9

    .line 129
    move v11, v5

    .line 130
    :goto_2
    if-ge v11, v10, :cond_6

    .line 131
    .line 132
    and-int/lit8 v12, v11, 0x1

    .line 133
    .line 134
    if-nez v12, :cond_5

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    aget v12, v9, v11

    .line 138
    .line 139
    add-int/2addr v12, v1

    .line 140
    aput v12, v9, v11

    .line 141
    .line 142
    :goto_3
    add-int/lit8 v11, v11, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    if-eqz p2, :cond_3

    .line 146
    .line 147
    iget-object v9, v8, Lf74;->b:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    move v10, v5

    .line 154
    :goto_4
    if-ge v10, v9, :cond_3

    .line 155
    .line 156
    iget-object v11, v8, Lf74;->k:Ld64;

    .line 157
    .line 158
    iget-object v12, v8, Lf74;->i:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v11, v11, Ld64;->a:Ls05;

    .line 161
    .line 162
    invoke-virtual {v11, v12}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    check-cast v11, Lb64;

    .line 167
    .line 168
    if-eqz v11, :cond_7

    .line 169
    .line 170
    iget-object v11, v11, Lb64;->a:[Lz54;

    .line 171
    .line 172
    aget-object v11, v11, v10

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_7
    const/4 v11, 0x0

    .line 176
    :goto_5
    if-eqz v11, :cond_8

    .line 177
    .line 178
    iget-wide v12, v11, Lz54;->l:J

    .line 179
    .line 180
    const/16 v14, 0x20

    .line 181
    .line 182
    move/from16 v16, v4

    .line 183
    .line 184
    const/4 v15, 0x0

    .line 185
    shr-long v3, v12, v14

    .line 186
    .line 187
    long-to-int v3, v3

    .line 188
    const-wide v17, 0xffffffffL

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    and-long v12, v12, v17

    .line 194
    .line 195
    long-to-int v4, v12

    .line 196
    add-int/2addr v4, v1

    .line 197
    int-to-long v12, v3

    .line 198
    shl-long/2addr v12, v14

    .line 199
    int-to-long v3, v4

    .line 200
    and-long v3, v3, v17

    .line 201
    .line 202
    or-long/2addr v3, v12

    .line 203
    iput-wide v3, v11, Lz54;->l:J

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_8
    move/from16 v16, v4

    .line 207
    .line 208
    const/4 v15, 0x0

    .line 209
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 210
    .line 211
    move/from16 v4, v16

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 215
    .line 216
    move/from16 v4, v16

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_9
    iget-boolean v3, v0, Le74;->c:Z

    .line 220
    .line 221
    if-nez v3, :cond_b

    .line 222
    .line 223
    if-lez v1, :cond_a

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_a
    :goto_8
    move v7, v5

    .line 227
    goto :goto_a

    .line 228
    :cond_b
    :goto_9
    const/4 v5, 0x1

    .line 229
    goto :goto_8

    .line 230
    :goto_a
    int-to-float v8, v1

    .line 231
    new-instance v4, Le74;

    .line 232
    .line 233
    iget-object v5, v0, Le74;->a:Lf74;

    .line 234
    .line 235
    iget-object v9, v0, Le74;->e:Lyr4;

    .line 236
    .line 237
    iget v10, v0, Le74;->f:F

    .line 238
    .line 239
    iget-boolean v11, v0, Le74;->g:Z

    .line 240
    .line 241
    iget-object v12, v0, Le74;->h:Lb71;

    .line 242
    .line 243
    iget-object v13, v0, Le74;->i:Lfi1;

    .line 244
    .line 245
    iget-wide v14, v0, Le74;->j:J

    .line 246
    .line 247
    iget v1, v0, Le74;->k:I

    .line 248
    .line 249
    iget v3, v0, Le74;->m:I

    .line 250
    .line 251
    move/from16 v16, v1

    .line 252
    .line 253
    iget v1, v0, Le74;->n:I

    .line 254
    .line 255
    move/from16 v19, v1

    .line 256
    .line 257
    iget v1, v0, Le74;->o:I

    .line 258
    .line 259
    move/from16 v20, v1

    .line 260
    .line 261
    iget-object v1, v0, Le74;->p:Lsd5;

    .line 262
    .line 263
    move-object/from16 v21, v1

    .line 264
    .line 265
    iget v1, v0, Le74;->q:I

    .line 266
    .line 267
    iget v0, v0, Le74;->r:I

    .line 268
    .line 269
    move/from16 v23, v0

    .line 270
    .line 271
    move/from16 v22, v1

    .line 272
    .line 273
    move-object/from16 v17, v2

    .line 274
    .line 275
    move/from16 v18, v3

    .line 276
    .line 277
    invoke-direct/range {v4 .. v23}, Le74;-><init>(Lf74;IZFLyr4;FZLb71;Lfi1;JILjava/util/List;IIILsd5;II)V

    .line 278
    .line 279
    .line 280
    return-object v4

    .line 281
    :goto_b
    return-object v15
.end method

.method public final i()J
    .locals 6

    .line 1
    iget-object p0, p0, Le74;->e:Lyr4;

    .line 2
    .line 3
    invoke-interface {p0}, Lyr4;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Lyr4;->a()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-long v0, v0

    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    shl-long/2addr v0, v2

    .line 15
    int-to-long v2, p0

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    or-long/2addr v0, v2

    .line 23
    return-wide v0
.end method

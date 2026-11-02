.class public final Lhc3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lhv1;


# instance fields
.field public final X:Lxu1;

.field public Y:Lcc3;

.field public Z:Lfc3;

.field public f0:Lec3;

.field public g0:Ldc3;

.field public h0:Lw51;

.field public i0:Lrb8;

.field public j0:Lkr0;

.field public final k0:Lb8;

.field public final l0:Lb8;


# direct methods
.method public constructor <init>(Lxu1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhc3;->X:Lxu1;

    .line 5
    .line 6
    new-instance p1, Lb8;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    invoke-direct {p1, v0}, Lb8;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lj05;

    .line 13
    .line 14
    invoke-direct {v0}, Lj05;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p1, Lb8;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p1, p0, Lhc3;->k0:Lb8;

    .line 20
    .line 21
    new-instance p1, Lb8;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lb8;-><init>(B)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lzz4;

    .line 29
    .line 30
    invoke-direct {v0}, Lzz4;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p1, Lb8;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p1, p0, Lhc3;->l0:Lb8;

    .line 36
    .line 37
    return-void
.end method

.method public static c(Lhc3;Lac3;JJI)V
    .locals 4

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, Lhc3;->X:Lxu1;

    .line 8
    .line 9
    iget-object v0, p0, Lhc3;->f0:Lec3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lec3;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v0, Lec3;->q:Lac3;

    .line 21
    .line 22
    const-wide v2, 0x7fffffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iput-wide v2, v0, Lec3;->r:J

    .line 28
    .line 29
    iput-boolean v1, v0, Lec3;->s:Z

    .line 30
    .line 31
    iput-object v0, p0, Lhc3;->f0:Lec3;

    .line 32
    .line 33
    :cond_1
    iput-object p1, v0, Lec3;->q:Lac3;

    .line 34
    .line 35
    iput-wide p2, v0, Lec3;->r:J

    .line 36
    .line 37
    iget-object p1, p0, Lhc3;->j0:Lkr0;

    .line 38
    .line 39
    iget-object p2, p6, Lxu1;->s0:Lsd5;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Lkr0;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Lkr0;-><init>(Lsd5;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lhc3;->j0:Lkr0;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iput-object p2, p1, Lkr0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iput-wide p4, p1, Lkr0;->b:J

    .line 54
    .line 55
    :goto_0
    iput-boolean v1, v0, Lec3;->s:Z

    .line 56
    .line 57
    iput-object v0, p0, Lhc3;->h0:Lw51;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final Q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lhc3;->h0:Lw51;

    .line 2
    .line 3
    instance-of v0, p0, Lcc3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcc3;

    .line 8
    .line 9
    iget-boolean p0, p0, Lcc3;->s:Z

    .line 10
    .line 11
    if-eqz p0, :cond_3

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of v0, p0, Lec3;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    instance-of v0, p0, Ldc3;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :goto_0
    const-string p0, "waiting"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    instance-of p0, p0, Lfc3;

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    const-string p0, "recognized"

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_3
    const-string p0, "idle"

    .line 34
    .line 35
    return-object p0
.end method

.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lhc3;->Y:Lcc3;

    .line 2
    .line 3
    sget-object v1, Lbc3;->Z:Lbc3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcc3;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, Lcc3;->q:Lbc3;

    .line 14
    .line 15
    iput-boolean v2, v0, Lcc3;->r:Z

    .line 16
    .line 17
    iput-boolean v2, v0, Lcc3;->s:Z

    .line 18
    .line 19
    iput-object v0, p0, Lhc3;->Y:Lcc3;

    .line 20
    .line 21
    :cond_0
    iput-object v1, v0, Lcc3;->q:Lbc3;

    .line 22
    .line 23
    iput-boolean v2, v0, Lcc3;->r:Z

    .line 24
    .line 25
    iput-boolean v2, v0, Lcc3;->s:Z

    .line 26
    .line 27
    iput-object v0, p0, Lhc3;->h0:Lw51;

    .line 28
    .line 29
    return-void
.end method

.method public final a0()Lsd5;
    .locals 0

    .line 1
    iget-object p0, p0, Lhc3;->X:Lxu1;

    .line 2
    .line 3
    iget-object p0, p0, Lxu1;->s0:Lsd5;

    .line 4
    .line 5
    return-object p0
.end method

.method public final b(Lac3;JLkr0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhc3;->g0:Ldc3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldc3;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Ldc3;->q:Lac3;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Ldc3;->r:J

    .line 19
    .line 20
    iput-object v0, p0, Lhc3;->g0:Ldc3;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Ldc3;->q:Lac3;

    .line 23
    .line 24
    iput-wide p2, v0, Ldc3;->r:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lkr0;->b:J

    .line 29
    .line 30
    iput-object v0, p0, Lhc3;->h0:Lw51;

    .line 31
    .line 32
    return-void
.end method

.method public final d()Lrb8;
    .locals 0

    .line 1
    iget-object p0, p0, Lhc3;->i0:Lrb8;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final e(Lac3;Lzb3;J)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    iget-wide v4, v1, Lac3;->c:J

    .line 8
    .line 9
    iget-object v6, v0, Lhc3;->X:Lxu1;

    .line 10
    .line 11
    iget-object v7, v6, Lxu1;->s0:Lsd5;

    .line 12
    .line 13
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v8, Ljv1;->a:Liv1;

    .line 17
    .line 18
    sget-object v8, Lsd5;->X:Lsd5;

    .line 19
    .line 20
    const/16 v9, 0x20

    .line 21
    .line 22
    const-wide v10, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-ne v7, v8, :cond_0

    .line 28
    .line 29
    and-long v7, v2, v10

    .line 30
    .line 31
    :goto_0
    long-to-int v7, v7

    .line 32
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    shr-long v7, v2, v9

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    const/high16 v8, 0x40000000    # 2.0f

    .line 45
    .line 46
    cmpl-float v7, v7, v8

    .line 47
    .line 48
    if-lez v7, :cond_f

    .line 49
    .line 50
    invoke-virtual {v0}, Lhc3;->d()Lrb8;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget-object v8, v6, Lxu1;->s0:Lsd5;

    .line 55
    .line 56
    iget-object v12, v0, Lhc3;->k0:Lb8;

    .line 57
    .line 58
    iget-object v13, v12, Lb8;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v13, Lj05;

    .line 61
    .line 62
    shr-long v14, v4, v9

    .line 63
    .line 64
    long-to-int v14, v14

    .line 65
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    and-long/2addr v4, v10

    .line 70
    long-to-int v4, v4

    .line 71
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-static {v1}, Lz51;->o(Lac3;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const/4 v15, 0x0

    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    iput v15, v12, Lb8;->b:I

    .line 83
    .line 84
    invoke-virtual {v13}, Lj05;->d()V

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-static {v1}, Lz51;->p(Lac3;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    move/from16 v16, v9

    .line 92
    .line 93
    const/4 v9, 0x3

    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    if-nez v5, :cond_6

    .line 97
    .line 98
    invoke-static {v1}, Lz51;->o(Lac3;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-nez v5, :cond_6

    .line 103
    .line 104
    iget v4, v13, Lj05;->b:I

    .line 105
    .line 106
    if-ne v4, v9, :cond_2

    .line 107
    .line 108
    iget v4, v12, Lb8;->b:I

    .line 109
    .line 110
    add-int/lit8 v5, v4, 0x1

    .line 111
    .line 112
    iput v5, v12, Lb8;->b:I

    .line 113
    .line 114
    invoke-virtual {v13, v4, v1}, Lj05;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    invoke-virtual {v13, v1}, Lj05;->a(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    iget v4, v12, Lb8;->b:I

    .line 122
    .line 123
    if-ne v4, v9, :cond_3

    .line 124
    .line 125
    iput v15, v12, Lb8;->b:I

    .line 126
    .line 127
    :cond_3
    iget-object v4, v13, Lj05;->a:[Ljava/lang/Object;

    .line 128
    .line 129
    iget v5, v13, Lj05;->b:I

    .line 130
    .line 131
    move v12, v15

    .line 132
    move/from16 v14, v17

    .line 133
    .line 134
    :goto_3
    if-ge v12, v5, :cond_4

    .line 135
    .line 136
    aget-object v18, v4, v12

    .line 137
    .line 138
    move-wide/from16 v19, v10

    .line 139
    .line 140
    move-object/from16 v10, v18

    .line 141
    .line 142
    check-cast v10, Lac3;

    .line 143
    .line 144
    iget-wide v10, v10, Lac3;->c:J

    .line 145
    .line 146
    shr-long v10, v10, v16

    .line 147
    .line 148
    long-to-int v10, v10

    .line 149
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    add-float/2addr v14, v10

    .line 154
    add-int/lit8 v12, v12, 0x1

    .line 155
    .line 156
    move-wide/from16 v10, v19

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    move-wide/from16 v19, v10

    .line 160
    .line 161
    iget v4, v13, Lj05;->b:I

    .line 162
    .line 163
    int-to-float v5, v4

    .line 164
    div-float/2addr v14, v5

    .line 165
    iget-object v5, v13, Lj05;->a:[Ljava/lang/Object;

    .line 166
    .line 167
    move v10, v15

    .line 168
    move/from16 v11, v17

    .line 169
    .line 170
    :goto_4
    if-ge v10, v4, :cond_5

    .line 171
    .line 172
    aget-object v12, v5, v10

    .line 173
    .line 174
    check-cast v12, Lac3;

    .line 175
    .line 176
    move/from16 v21, v10

    .line 177
    .line 178
    iget-wide v9, v12, Lac3;->c:J

    .line 179
    .line 180
    and-long v9, v9, v19

    .line 181
    .line 182
    long-to-int v9, v9

    .line 183
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    add-float/2addr v11, v9

    .line 188
    add-int/lit8 v10, v21, 0x1

    .line 189
    .line 190
    const/4 v9, 0x3

    .line 191
    goto :goto_4

    .line 192
    :cond_5
    iget v4, v13, Lj05;->b:I

    .line 193
    .line 194
    int-to-float v4, v4

    .line 195
    div-float v4, v11, v4

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_6
    move-wide/from16 v19, v10

    .line 199
    .line 200
    :goto_5
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    int-to-long v9, v5

    .line 205
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    int-to-long v4, v4

    .line 210
    shl-long v9, v9, v16

    .line 211
    .line 212
    and-long v4, v4, v19

    .line 213
    .line 214
    or-long/2addr v4, v9

    .line 215
    const/4 v9, 0x1

    .line 216
    if-nez v8, :cond_7

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_7
    move-object/from16 v10, p2

    .line 220
    .line 221
    iget v10, v10, Lzb3;->a:I

    .line 222
    .line 223
    if-ne v10, v9, :cond_8

    .line 224
    .line 225
    shr-long v4, v4, v16

    .line 226
    .line 227
    long-to-int v4, v4

    .line 228
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    goto :goto_6

    .line 233
    :cond_8
    const/4 v11, 0x2

    .line 234
    if-ne v10, v11, :cond_a

    .line 235
    .line 236
    and-long v4, v4, v19

    .line 237
    .line 238
    long-to-int v4, v4

    .line 239
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    :goto_6
    sget-object v5, Lsd5;->Y:Lsd5;

    .line 244
    .line 245
    if-ne v8, v5, :cond_9

    .line 246
    .line 247
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    int-to-long v4, v4

    .line 252
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    int-to-long v10, v8

    .line 257
    shl-long v4, v4, v16

    .line 258
    .line 259
    and-long v10, v10, v19

    .line 260
    .line 261
    or-long/2addr v4, v10

    .line 262
    goto :goto_7

    .line 263
    :cond_9
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    int-to-long v10, v5

    .line 268
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    int-to-long v4, v4

    .line 273
    shl-long v10, v10, v16

    .line 274
    .line 275
    and-long v4, v4, v19

    .line 276
    .line 277
    or-long/2addr v4, v10

    .line 278
    :cond_a
    :goto_7
    iget-wide v10, v1, Lac3;->b:J

    .line 279
    .line 280
    iget-object v1, v7, Lrb8;->Y:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v1, Lgj4;

    .line 283
    .line 284
    invoke-virtual {v1, v10, v11, v4, v5}, Lgj4;->f(JJ)V

    .line 285
    .line 286
    .line 287
    new-instance v1, Lfu1;

    .line 288
    .line 289
    iget-object v0, v0, Lhc3;->l0:Lb8;

    .line 290
    .line 291
    iget-object v4, v0, Lb8;->c:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v4, Lzz4;

    .line 294
    .line 295
    iget v5, v4, Lzz4;->b:I

    .line 296
    .line 297
    const/4 v7, 0x3

    .line 298
    if-ne v5, v7, :cond_b

    .line 299
    .line 300
    iget v5, v0, Lb8;->b:I

    .line 301
    .line 302
    add-int/lit8 v8, v5, 0x1

    .line 303
    .line 304
    iput v8, v0, Lb8;->b:I

    .line 305
    .line 306
    invoke-virtual {v4, v5, v2, v3}, Lzz4;->f(IJ)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_b
    invoke-virtual {v4, v2, v3}, Lzz4;->a(J)V

    .line 311
    .line 312
    .line 313
    :goto_8
    iget v2, v0, Lb8;->b:I

    .line 314
    .line 315
    if-ne v2, v7, :cond_c

    .line 316
    .line 317
    iput v15, v0, Lb8;->b:I

    .line 318
    .line 319
    :cond_c
    iget-object v0, v4, Lzz4;->a:[J

    .line 320
    .line 321
    iget v2, v4, Lzz4;->b:I

    .line 322
    .line 323
    move v3, v15

    .line 324
    move/from16 v5, v17

    .line 325
    .line 326
    :goto_9
    if-ge v3, v2, :cond_d

    .line 327
    .line 328
    aget-wide v7, v0, v3

    .line 329
    .line 330
    shr-long v7, v7, v16

    .line 331
    .line 332
    long-to-int v7, v7

    .line 333
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    add-float/2addr v5, v7

    .line 338
    add-int/lit8 v3, v3, 0x1

    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_d
    iget v0, v4, Lzz4;->b:I

    .line 342
    .line 343
    int-to-float v2, v0

    .line 344
    div-float/2addr v5, v2

    .line 345
    iget-object v2, v4, Lzz4;->a:[J

    .line 346
    .line 347
    :goto_a
    if-ge v15, v0, :cond_e

    .line 348
    .line 349
    aget-wide v7, v2, v15

    .line 350
    .line 351
    and-long v7, v7, v19

    .line 352
    .line 353
    long-to-int v3, v7

    .line 354
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    add-float v17, v3, v17

    .line 359
    .line 360
    add-int/lit8 v15, v15, 0x1

    .line 361
    .line 362
    goto :goto_a

    .line 363
    :cond_e
    iget v0, v4, Lzz4;->b:I

    .line 364
    .line 365
    int-to-float v0, v0

    .line 366
    div-float v17, v17, v0

    .line 367
    .line 368
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    int-to-long v2, v0

    .line 373
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    int-to-long v4, v0

    .line 378
    shl-long v2, v2, v16

    .line 379
    .line 380
    and-long v4, v4, v19

    .line 381
    .line 382
    or-long/2addr v2, v4

    .line 383
    invoke-direct {v1, v2, v3, v9}, Lfu1;-><init>(JZ)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v6, v1}, Lxu1;->g1(Liu1;)V

    .line 387
    .line 388
    .line 389
    :cond_f
    return-void
.end method

.method public final f(Lac3;Lac3;Lzb3;J)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lhc3;->i0:Lrb8;

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    new-instance v3, Lrb8;

    .line 12
    .line 13
    const/4 v4, 0x6

    .line 14
    invoke-direct {v3, v4}, Lrb8;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object v3, v0, Lhc3;->i0:Lrb8;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Lhc3;->d()Lrb8;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, v0, Lhc3;->X:Lxu1;

    .line 24
    .line 25
    iget-object v5, v4, Lxu1;->s0:Lsd5;

    .line 26
    .line 27
    iget-object v6, v0, Lhc3;->k0:Lb8;

    .line 28
    .line 29
    iget-object v7, v6, Lb8;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v7, Lj05;

    .line 32
    .line 33
    iget-wide v8, v1, Lac3;->c:J

    .line 34
    .line 35
    const/16 v10, 0x20

    .line 36
    .line 37
    shr-long/2addr v8, v10

    .line 38
    long-to-int v8, v8

    .line 39
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    iget-wide v11, v1, Lac3;->c:J

    .line 44
    .line 45
    const-wide v13, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v11, v13

    .line 51
    long-to-int v9, v11

    .line 52
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    invoke-static {v1}, Lz51;->o(Lac3;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    const/4 v12, 0x0

    .line 61
    if-eqz v11, :cond_1

    .line 62
    .line 63
    iput v12, v6, Lb8;->b:I

    .line 64
    .line 65
    invoke-virtual {v7}, Lj05;->d()V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-static {v1}, Lz51;->p(Lac3;)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    const/4 v15, 0x0

    .line 73
    if-nez v11, :cond_6

    .line 74
    .line 75
    invoke-static {v1}, Lz51;->o(Lac3;)Z

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-nez v11, :cond_6

    .line 80
    .line 81
    iget v8, v7, Lj05;->b:I

    .line 82
    .line 83
    const/4 v9, 0x3

    .line 84
    if-ne v8, v9, :cond_2

    .line 85
    .line 86
    iget v8, v6, Lb8;->b:I

    .line 87
    .line 88
    add-int/lit8 v11, v8, 0x1

    .line 89
    .line 90
    iput v11, v6, Lb8;->b:I

    .line 91
    .line 92
    invoke-virtual {v7, v8, v1}, Lj05;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {v7, v1}, Lj05;->a(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    iget v8, v6, Lb8;->b:I

    .line 100
    .line 101
    if-ne v8, v9, :cond_3

    .line 102
    .line 103
    iput v12, v6, Lb8;->b:I

    .line 104
    .line 105
    :cond_3
    iget-object v6, v7, Lj05;->a:[Ljava/lang/Object;

    .line 106
    .line 107
    iget v8, v7, Lj05;->b:I

    .line 108
    .line 109
    move v9, v12

    .line 110
    move v11, v15

    .line 111
    :goto_1
    if-ge v9, v8, :cond_4

    .line 112
    .line 113
    aget-object v16, v6, v9

    .line 114
    .line 115
    move/from16 v17, v10

    .line 116
    .line 117
    move-object/from16 v10, v16

    .line 118
    .line 119
    check-cast v10, Lac3;

    .line 120
    .line 121
    move-wide/from16 v18, v13

    .line 122
    .line 123
    iget-wide v13, v10, Lac3;->c:J

    .line 124
    .line 125
    shr-long v13, v13, v17

    .line 126
    .line 127
    long-to-int v10, v13

    .line 128
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    add-float/2addr v11, v10

    .line 133
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    move/from16 v10, v17

    .line 136
    .line 137
    move-wide/from16 v13, v18

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    move/from16 v17, v10

    .line 141
    .line 142
    move-wide/from16 v18, v13

    .line 143
    .line 144
    iget v6, v7, Lj05;->b:I

    .line 145
    .line 146
    int-to-float v8, v6

    .line 147
    div-float v8, v11, v8

    .line 148
    .line 149
    iget-object v9, v7, Lj05;->a:[Ljava/lang/Object;

    .line 150
    .line 151
    move v10, v12

    .line 152
    move v11, v15

    .line 153
    :goto_2
    if-ge v10, v6, :cond_5

    .line 154
    .line 155
    aget-object v13, v9, v10

    .line 156
    .line 157
    check-cast v13, Lac3;

    .line 158
    .line 159
    iget-wide v13, v13, Lac3;->c:J

    .line 160
    .line 161
    and-long v13, v13, v18

    .line 162
    .line 163
    long-to-int v13, v13

    .line 164
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    add-float/2addr v11, v13

    .line 169
    add-int/lit8 v10, v10, 0x1

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_5
    iget v6, v7, Lj05;->b:I

    .line 173
    .line 174
    int-to-float v6, v6

    .line 175
    div-float v9, v11, v6

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_6
    move/from16 v17, v10

    .line 179
    .line 180
    move-wide/from16 v18, v13

    .line 181
    .line 182
    :goto_3
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    int-to-long v6, v6

    .line 187
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    int-to-long v8, v8

    .line 192
    shl-long v6, v6, v17

    .line 193
    .line 194
    and-long v8, v8, v18

    .line 195
    .line 196
    or-long/2addr v6, v8

    .line 197
    const/4 v8, 0x1

    .line 198
    if-nez v5, :cond_7

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_7
    iget v9, v2, Lzb3;->a:I

    .line 202
    .line 203
    if-ne v9, v8, :cond_8

    .line 204
    .line 205
    shr-long v6, v6, v17

    .line 206
    .line 207
    long-to-int v6, v6

    .line 208
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    goto :goto_4

    .line 213
    :cond_8
    const/4 v10, 0x2

    .line 214
    if-ne v9, v10, :cond_a

    .line 215
    .line 216
    and-long v6, v6, v18

    .line 217
    .line 218
    long-to-int v6, v6

    .line 219
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    :goto_4
    sget-object v7, Lsd5;->Y:Lsd5;

    .line 224
    .line 225
    if-ne v5, v7, :cond_9

    .line 226
    .line 227
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    int-to-long v5, v5

    .line 232
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    int-to-long v9, v7

    .line 237
    shl-long v5, v5, v17

    .line 238
    .line 239
    and-long v9, v9, v18

    .line 240
    .line 241
    or-long v6, v5, v9

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_9
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    int-to-long v9, v5

    .line 249
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    int-to-long v5, v5

    .line 254
    shl-long v9, v9, v17

    .line 255
    .line 256
    and-long v5, v5, v18

    .line 257
    .line 258
    or-long v6, v9, v5

    .line 259
    .line 260
    :cond_a
    :goto_5
    iget-wide v9, v1, Lac3;->b:J

    .line 261
    .line 262
    iget-object v1, v3, Lrb8;->Y:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Lgj4;

    .line 265
    .line 266
    invoke-virtual {v1, v9, v10, v6, v7}, Lgj4;->f(JJ)V

    .line 267
    .line 268
    .line 269
    iget-object v1, v4, Lxu1;->s0:Lsd5;

    .line 270
    .line 271
    move-object/from16 v3, p2

    .line 272
    .line 273
    invoke-static {v3, v1, v2}, Lz51;->N(Lac3;Lsd5;Lzb3;)J

    .line 274
    .line 275
    .line 276
    move-result-wide v1

    .line 277
    move-wide/from16 v5, p4

    .line 278
    .line 279
    invoke-static {v1, v2, v5, v6}, Lz85;->e(JJ)J

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    iget-object v3, v4, Lxu1;->t0:Lgn2;

    .line 284
    .line 285
    new-instance v5, Loq5;

    .line 286
    .line 287
    invoke-direct {v5, v8}, Loq5;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v3, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Ljava/lang/Boolean;

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_b

    .line 301
    .line 302
    new-instance v3, Lgu1;

    .line 303
    .line 304
    invoke-direct {v3, v1, v2}, Lgu1;-><init>(J)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v3}, Lxu1;->g1(Liu1;)V

    .line 308
    .line 309
    .line 310
    :cond_b
    iget-object v0, v0, Lhc3;->l0:Lb8;

    .line 311
    .line 312
    iput v12, v0, Lb8;->b:I

    .line 313
    .line 314
    iget-object v0, v0, Lb8;->c:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Lzz4;

    .line 317
    .line 318
    iput v12, v0, Lzz4;->b:I

    .line 319
    .line 320
    return-void
.end method

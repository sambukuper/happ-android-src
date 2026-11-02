.class public final Lhs2;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrv1;


# instance fields
.field public final s0:Ltd;

.field public final t0:Ldy1;

.field public final u0:Lig5;


# direct methods
.method public constructor <init>(Lcz7;Ltd;Ldy1;Lig5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lhs2;->s0:Ltd;

    .line 5
    .line 6
    iput-object p3, p0, Lhs2;->t0:Ldy1;

    .line 7
    .line 8
    iput-object p4, p0, Lhs2;->u0:Lig5;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static b1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    .line 1
    invoke-virtual {p4}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p4, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x20

    .line 9
    .line 10
    shr-long v1, p1, p0

    .line 11
    .line 12
    long-to-int p0, v1

    .line 13
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const-wide v1, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v1

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p4, p0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p4}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p4, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 36
    .line 37
    .line 38
    return p0
.end method


# virtual methods
.method public final u0(Lp34;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lp34;->X:Lum0;

    .line 6
    .line 7
    invoke-interface {v2}, Lsv1;->e()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-object v5, v0, Lhs2;->s0:Ltd;

    .line 12
    .line 13
    invoke-virtual {v5, v3, v4}, Ltd;->j(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Lsv1;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-static {v3, v4}, Lua7;->e(J)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lp34;->a()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {v1}, Lp34;->a()V

    .line 31
    .line 32
    .line 33
    iget-object v3, v5, Ltd;->d:Lrh5;

    .line 34
    .line 35
    invoke-virtual {v3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v3, v2, Lum0;->Y:Llr;

    .line 39
    .line 40
    invoke-virtual {v3}, Llr;->k()Lsm0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lfb;->b(Lsm0;)Landroid/graphics/Canvas;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v4, v0, Lhs2;->t0:Ldy1;

    .line 49
    .line 50
    iget-object v6, v4, Ldy1;->f:Landroid/widget/EdgeEffect;

    .line 51
    .line 52
    invoke-static {v6}, Ldy1;->f(Landroid/widget/EdgeEffect;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const/16 v7, 0x20

    .line 57
    .line 58
    iget-object v0, v0, Lhs2;->u0:Lig5;

    .line 59
    .line 60
    const-wide v8, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    invoke-virtual {v4}, Ldy1;->c()Landroid/widget/EdgeEffect;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface {v2}, Lsv1;->e()J

    .line 73
    .line 74
    .line 75
    move-result-wide v11

    .line 76
    and-long/2addr v11, v8

    .line 77
    long-to-int v11, v11

    .line 78
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    neg-float v11, v11

    .line 83
    invoke-virtual {v1}, Lp34;->getLayoutDirection()Lz24;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    invoke-virtual {v0, v12}, Lig5;->b(Lz24;)F

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    invoke-virtual {v1, v12}, Lp34;->h0(F)F

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    int-to-long v13, v11

    .line 100
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    int-to-long v11, v11

    .line 105
    shl-long/2addr v13, v7

    .line 106
    and-long/2addr v11, v8

    .line 107
    or-long/2addr v11, v13

    .line 108
    const/high16 v13, 0x43870000    # 270.0f

    .line 109
    .line 110
    invoke-static {v13, v11, v12, v6, v3}, Lhs2;->b1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    move v6, v10

    .line 116
    :goto_0
    iget-object v11, v4, Ldy1;->d:Landroid/widget/EdgeEffect;

    .line 117
    .line 118
    invoke-static {v11}, Ldy1;->f(Landroid/widget/EdgeEffect;)Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    const/4 v12, 0x0

    .line 123
    const/4 v13, 0x1

    .line 124
    if-eqz v11, :cond_4

    .line 125
    .line 126
    invoke-virtual {v4}, Ldy1;->e()Landroid/widget/EdgeEffect;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    iget v14, v0, Lig5;->b:F

    .line 131
    .line 132
    invoke-virtual {v1, v14}, Lp34;->h0(F)F

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    move/from16 v16, v7

    .line 141
    .line 142
    move-wide/from16 v17, v8

    .line 143
    .line 144
    int-to-long v7, v15

    .line 145
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    int-to-long v14, v9

    .line 150
    shl-long v7, v7, v16

    .line 151
    .line 152
    and-long v14, v14, v17

    .line 153
    .line 154
    or-long/2addr v7, v14

    .line 155
    invoke-static {v12, v7, v8, v11, v3}, Lhs2;->b1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-nez v7, :cond_3

    .line 160
    .line 161
    if-eqz v6, :cond_2

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    move v6, v10

    .line 165
    goto :goto_2

    .line 166
    :cond_3
    :goto_1
    move v6, v13

    .line 167
    goto :goto_2

    .line 168
    :cond_4
    move/from16 v16, v7

    .line 169
    .line 170
    move-wide/from16 v17, v8

    .line 171
    .line 172
    :goto_2
    iget-object v7, v4, Ldy1;->g:Landroid/widget/EdgeEffect;

    .line 173
    .line 174
    invoke-static {v7}, Ldy1;->f(Landroid/widget/EdgeEffect;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_7

    .line 179
    .line 180
    invoke-virtual {v4}, Ldy1;->d()Landroid/widget/EdgeEffect;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-interface {v2}, Lsv1;->e()J

    .line 185
    .line 186
    .line 187
    move-result-wide v8

    .line 188
    shr-long v8, v8, v16

    .line 189
    .line 190
    long-to-int v8, v8

    .line 191
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    invoke-static {v8}, Lnr4;->O(F)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-virtual {v1}, Lp34;->getLayoutDirection()Lz24;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-virtual {v0, v9}, Lig5;->c(Lz24;)F

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    int-to-float v8, v8

    .line 208
    neg-float v8, v8

    .line 209
    invoke-virtual {v1, v9}, Lp34;->h0(F)F

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    add-float/2addr v9, v8

    .line 214
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    int-to-long v11, v8

    .line 219
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    int-to-long v8, v8

    .line 224
    shl-long v11, v11, v16

    .line 225
    .line 226
    and-long v8, v8, v17

    .line 227
    .line 228
    or-long/2addr v8, v11

    .line 229
    const/high16 v11, 0x42b40000    # 90.0f

    .line 230
    .line 231
    invoke-static {v11, v8, v9, v7, v3}, Lhs2;->b1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-nez v7, :cond_6

    .line 236
    .line 237
    if-eqz v6, :cond_5

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_5
    move v6, v10

    .line 241
    goto :goto_4

    .line 242
    :cond_6
    :goto_3
    move v6, v13

    .line 243
    :cond_7
    :goto_4
    iget-object v7, v4, Ldy1;->e:Landroid/widget/EdgeEffect;

    .line 244
    .line 245
    invoke-static {v7}, Ldy1;->f(Landroid/widget/EdgeEffect;)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-eqz v7, :cond_a

    .line 250
    .line 251
    invoke-virtual {v4}, Ldy1;->b()Landroid/widget/EdgeEffect;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    iget v0, v0, Lig5;->d:F

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Lp34;->h0(F)F

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    invoke-interface {v2}, Lsv1;->e()J

    .line 262
    .line 263
    .line 264
    move-result-wide v7

    .line 265
    shr-long v7, v7, v16

    .line 266
    .line 267
    long-to-int v1, v7

    .line 268
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    neg-float v1, v1

    .line 273
    invoke-interface {v2}, Lsv1;->e()J

    .line 274
    .line 275
    .line 276
    move-result-wide v7

    .line 277
    and-long v7, v7, v17

    .line 278
    .line 279
    long-to-int v2, v7

    .line 280
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    neg-float v2, v2

    .line 285
    add-float/2addr v2, v0

    .line 286
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    int-to-long v0, v0

    .line 291
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    int-to-long v7, v2

    .line 296
    shl-long v0, v0, v16

    .line 297
    .line 298
    and-long v7, v7, v17

    .line 299
    .line 300
    or-long/2addr v0, v7

    .line 301
    const/high16 v2, 0x43340000    # 180.0f

    .line 302
    .line 303
    invoke-static {v2, v0, v1, v4, v3}, Lhs2;->b1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_8

    .line 308
    .line 309
    if-eqz v6, :cond_9

    .line 310
    .line 311
    :cond_8
    move v10, v13

    .line 312
    :cond_9
    move v6, v10

    .line 313
    :cond_a
    if-eqz v6, :cond_b

    .line 314
    .line 315
    invoke-virtual {v5}, Ltd;->d()V

    .line 316
    .line 317
    .line 318
    :cond_b
    return-void
.end method

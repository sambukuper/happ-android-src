.class public final Ly00;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrv1;
.implements Lw85;
.implements Lw07;


# instance fields
.field public q0:J

.field public r0:Ld90;

.field public s0:F

.field public t0:Lx67;

.field public u0:J

.field public v0:Lz24;

.field public w0:Lmb6;

.field public x0:Lx67;

.field public y0:Lmb6;


# virtual methods
.method public final h(Lf17;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly00;->t0:Lx67;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ld17;->e(Lf17;Lx67;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Ly00;->u0:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ly00;->v0:Lz24;

    .line 10
    .line 11
    iput-object v0, p0, Ly00;->w0:Lmb6;

    .line 12
    .line 13
    iput-object v0, p0, Ly00;->x0:Lx67;

    .line 14
    .line 15
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final u0(Lp34;)V
    .locals 16

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
    iget-object v3, v0, Ly00;->t0:Lx67;

    .line 8
    .line 9
    sget-object v4, Lu70;->e:Lx03;

    .line 10
    .line 11
    if-ne v3, v4, :cond_2

    .line 12
    .line 13
    iget-wide v2, v0, Ly00;->q0:J

    .line 14
    .line 15
    sget-wide v4, Ldw0;->g:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Ltk8;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, v0, Ly00;->q0:J

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/16 v9, 0x7e

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    invoke-static/range {v1 .. v9}, Lsv1;->k0(Lsv1;JJJFI)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v1, v0, Ly00;->r0:Ld90;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget v6, v0, Ly00;->s0:F

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/16 v9, 0x76

    .line 43
    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    const-wide/16 v4, 0x0

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    move-object/from16 v0, p1

    .line 50
    .line 51
    invoke-static/range {v0 .. v9}, Lsv1;->E0(Lsv1;Ld90;JJFLtv1;II)V

    .line 52
    .line 53
    .line 54
    move-object v1, v0

    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_1
    move-object/from16 v1, p1

    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_2
    invoke-interface {v2}, Lsv1;->e()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    iget-wide v5, v0, Ly00;->u0:J

    .line 66
    .line 67
    invoke-static {v3, v4, v5, v6}, Lua7;->a(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v1}, Lp34;->getLayoutDirection()Lz24;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget-object v4, v0, Ly00;->v0:Lz24;

    .line 78
    .line 79
    if-ne v3, v4, :cond_3

    .line 80
    .line 81
    iget-object v3, v0, Ly00;->x0:Lx67;

    .line 82
    .line 83
    iget-object v4, v0, Ly00;->t0:Lx67;

    .line 84
    .line 85
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    iget-object v3, v0, Ly00;->w0:Lmb6;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    new-instance v3, Lp5;

    .line 98
    .line 99
    const/4 v4, 0x7

    .line 100
    invoke-direct {v3, v0, v1, v4}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v3}, Lch3;->N(Ljx4;Ldn2;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, v0, Ly00;->y0:Lmb6;

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    iput-object v4, v0, Ly00;->y0:Lmb6;

    .line 110
    .line 111
    :goto_0
    iput-object v3, v0, Ly00;->w0:Lmb6;

    .line 112
    .line 113
    invoke-interface {v2}, Lsv1;->e()J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    iput-wide v4, v0, Ly00;->u0:J

    .line 118
    .line 119
    invoke-virtual {v1}, Lp34;->getLayoutDirection()Lz24;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iput-object v2, v0, Ly00;->v0:Lz24;

    .line 124
    .line 125
    iget-object v2, v0, Ly00;->t0:Lx67;

    .line 126
    .line 127
    iput-object v2, v0, Ly00;->x0:Lx67;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-wide v4, v0, Ly00;->q0:J

    .line 133
    .line 134
    sget-wide v6, Ldw0;->g:J

    .line 135
    .line 136
    invoke-static {v4, v5, v6, v7}, Ltk8;->a(JJ)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_4

    .line 141
    .line 142
    iget-wide v4, v0, Ly00;->q0:J

    .line 143
    .line 144
    invoke-static {v1, v3, v4, v5}, Lx97;->u(Lsv1;Lmb6;J)V

    .line 145
    .line 146
    .line 147
    :cond_4
    iget-object v2, v0, Ly00;->r0:Ld90;

    .line 148
    .line 149
    if-eqz v2, :cond_9

    .line 150
    .line 151
    iget v6, v0, Ly00;->s0:F

    .line 152
    .line 153
    instance-of v0, v3, Lae5;

    .line 154
    .line 155
    const-wide v7, 0xffffffffL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    const/16 v9, 0x20

    .line 161
    .line 162
    sget-object v4, Lea2;->a:Lea2;

    .line 163
    .line 164
    const/4 v5, 0x3

    .line 165
    if-eqz v0, :cond_5

    .line 166
    .line 167
    check-cast v3, Lae5;

    .line 168
    .line 169
    iget-object v0, v3, Lae5;->j0:Ls86;

    .line 170
    .line 171
    iget v3, v0, Ls86;->a:F

    .line 172
    .line 173
    iget v10, v0, Ls86;->b:F

    .line 174
    .line 175
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    int-to-long v11, v3

    .line 180
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    int-to-long v13, v3

    .line 185
    shl-long v9, v11, v9

    .line 186
    .line 187
    and-long/2addr v7, v13

    .line 188
    or-long/2addr v7, v9

    .line 189
    invoke-static {v0}, Lx97;->V(Ls86;)J

    .line 190
    .line 191
    .line 192
    move-result-wide v9

    .line 193
    move-object v0, v1

    .line 194
    move-object v1, v2

    .line 195
    move-wide v2, v7

    .line 196
    move-object v7, v4

    .line 197
    move v8, v5

    .line 198
    move-wide v4, v9

    .line 199
    invoke-virtual/range {v0 .. v8}, Lp34;->Y(Ld90;JJFLtv1;I)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :cond_5
    move-object v1, v2

    .line 205
    instance-of v0, v3, Lbe5;

    .line 206
    .line 207
    if-eqz v0, :cond_7

    .line 208
    .line 209
    move-object v10, v3

    .line 210
    check-cast v10, Lbe5;

    .line 211
    .line 212
    move-object v2, v1

    .line 213
    iget-object v1, v10, Lbe5;->k0:Llf;

    .line 214
    .line 215
    if-eqz v1, :cond_6

    .line 216
    .line 217
    move-object/from16 v0, p1

    .line 218
    .line 219
    move v3, v6

    .line 220
    :goto_1
    invoke-virtual/range {v0 .. v5}, Lp34;->i(Llf;Ld90;FLtv1;I)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_6
    move-object v1, v2

    .line 225
    move v3, v6

    .line 226
    iget-object v0, v10, Lbe5;->j0:Lem6;

    .line 227
    .line 228
    iget v2, v0, Lem6;->b:F

    .line 229
    .line 230
    iget v5, v0, Lem6;->a:F

    .line 231
    .line 232
    iget-wide v10, v0, Lem6;->h:J

    .line 233
    .line 234
    shr-long/2addr v10, v9

    .line 235
    long-to-int v6, v10

    .line 236
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    int-to-long v10, v10

    .line 245
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    int-to-long v12, v12

    .line 250
    shl-long/2addr v10, v9

    .line 251
    and-long/2addr v12, v7

    .line 252
    or-long/2addr v10, v12

    .line 253
    iget v12, v0, Lem6;->c:F

    .line 254
    .line 255
    sub-float/2addr v12, v5

    .line 256
    iget v0, v0, Lem6;->d:F

    .line 257
    .line 258
    sub-float/2addr v0, v2

    .line 259
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    int-to-long v12, v2

    .line 264
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    int-to-long v14, v0

    .line 269
    shl-long/2addr v12, v9

    .line 270
    and-long/2addr v14, v7

    .line 271
    or-long/2addr v12, v14

    .line 272
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    int-to-long v14, v0

    .line 277
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    int-to-long v5, v0

    .line 282
    shl-long/2addr v14, v9

    .line 283
    and-long/2addr v5, v7

    .line 284
    or-long v6, v14, v5

    .line 285
    .line 286
    move-object/from16 v0, p1

    .line 287
    .line 288
    move v8, v3

    .line 289
    move-object v9, v4

    .line 290
    move-wide v2, v10

    .line 291
    move-wide v4, v12

    .line 292
    invoke-virtual/range {v0 .. v9}, Lp34;->c(Ld90;JJJFLtv1;)V

    .line 293
    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_7
    instance-of v0, v3, Lzd5;

    .line 297
    .line 298
    if-eqz v0, :cond_8

    .line 299
    .line 300
    check-cast v3, Lzd5;

    .line 301
    .line 302
    iget-object v0, v3, Lzd5;->j0:Llf;

    .line 303
    .line 304
    move-object v2, v1

    .line 305
    move v3, v6

    .line 306
    move-object v1, v0

    .line 307
    move-object/from16 v0, p1

    .line 308
    .line 309
    goto :goto_1

    .line 310
    :cond_8
    invoke-static {}, Lb61;->c()V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_9
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lp34;->a()V

    .line 315
    .line 316
    .line 317
    return-void
.end method

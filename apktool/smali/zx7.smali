.class public final Lzx7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lx67;

.field public final synthetic Z:J

.field public final synthetic f0:F

.field public final synthetic g0:Ld70;

.field public final synthetic h0:F

.field public final synthetic i0:Lzy0;


# direct methods
.method public constructor <init>(Lkx4;Lx67;JFLd70;FLzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzx7;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lzx7;->Y:Lx67;

    .line 7
    .line 8
    iput-wide p3, p0, Lzx7;->Z:J

    .line 9
    .line 10
    iput p5, p0, Lzx7;->f0:F

    .line 11
    .line 12
    iput-object p6, p0, Lzx7;->g0:Ld70;

    .line 13
    .line 14
    iput p7, p0, Lzx7;->h0:F

    .line 15
    .line 16
    iput-object p8, p0, Lzx7;->i0:Lzy0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Llp2;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    move v3, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v5

    .line 25
    :goto_0
    and-int/2addr v2, v6

    .line 26
    invoke-virtual {v1, v2, v3}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    sget-object v3, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    if-eqz v2, :cond_a

    .line 33
    .line 34
    sget-object v2, Lkw0;->a:Lox1;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Liw0;

    .line 41
    .line 42
    sget-object v4, Lkw0;->b:Lox1;

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    iget-wide v7, v2, Liw0;->p:J

    .line 55
    .line 56
    sget v9, Ldw0;->h:I

    .line 57
    .line 58
    iget-wide v9, v0, Lzx7;->Z:J

    .line 59
    .line 60
    invoke-static {v9, v10, v7, v8}, Ltk8;->a(JJ)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    const/4 v12, 0x0

    .line 65
    if-eqz v11, :cond_2

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    iget v4, v0, Lzx7;->f0:F

    .line 70
    .line 71
    invoke-static {v4, v12}, Lkt1;->b(FF)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const/high16 v9, 0x3f800000    # 1.0f

    .line 79
    .line 80
    add-float/2addr v4, v9

    .line 81
    float-to-double v9, v4

    .line 82
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    .line 83
    .line 84
    .line 85
    move-result-wide v9

    .line 86
    double-to-float v4, v9

    .line 87
    const/high16 v9, 0x40900000    # 4.5f

    .line 88
    .line 89
    mul-float/2addr v4, v9

    .line 90
    const/high16 v9, 0x40000000    # 2.0f

    .line 91
    .line 92
    add-float/2addr v4, v9

    .line 93
    const/high16 v9, 0x42c80000    # 100.0f

    .line 94
    .line 95
    div-float/2addr v4, v9

    .line 96
    iget-wide v9, v2, Liw0;->t:J

    .line 97
    .line 98
    invoke-static {v4, v9, v10}, Ldw0;->b(FJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    invoke-static {v9, v10, v7, v8}, Lz51;->s(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v7

    .line 106
    :goto_1
    move-wide v9, v7

    .line 107
    :cond_2
    sget-object v2, Ly01;->h:Lox1;

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iget v4, v0, Lzx7;->h0:F

    .line 114
    .line 115
    check-cast v2, Lfi1;

    .line 116
    .line 117
    invoke-interface {v2, v4}, Lfi1;->h0(F)F

    .line 118
    .line 119
    .line 120
    move-result v17

    .line 121
    cmpl-float v2, v17, v12

    .line 122
    .line 123
    sget-object v13, Lhx4;->X:Lhx4;

    .line 124
    .line 125
    iget-object v4, v0, Lzx7;->Y:Lx67;

    .line 126
    .line 127
    if-lez v2, :cond_3

    .line 128
    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    const v19, 0x1e7df

    .line 132
    .line 133
    .line 134
    const/4 v14, 0x0

    .line 135
    const/4 v15, 0x0

    .line 136
    move-object/from16 v18, v4

    .line 137
    .line 138
    invoke-static/range {v13 .. v19}, Ljm4;->K(Lkx4;FFFFLx67;I)Lkx4;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object v2, v13

    .line 144
    :goto_2
    iget-object v7, v0, Lzx7;->X:Lkx4;

    .line 145
    .line 146
    invoke-interface {v7, v2}, Lkx4;->y(Lkx4;)Lkx4;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iget-object v7, v0, Lzx7;->g0:Ld70;

    .line 151
    .line 152
    if-eqz v7, :cond_4

    .line 153
    .line 154
    iget v8, v7, Ld70;->a:F

    .line 155
    .line 156
    iget-object v7, v7, Ld70;->b:Lfe7;

    .line 157
    .line 158
    new-instance v13, Lc70;

    .line 159
    .line 160
    invoke-direct {v13, v8, v7, v4}, Lc70;-><init>(FLfe7;Lx67;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    invoke-interface {v2, v13}, Lkx4;->y(Lkx4;)Lkx4;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v2, v9, v10, v4}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v2, v4}, Lw39;->k(Lkx4;Lx67;)Lkx4;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    sget-object v7, Lzz0;->a:Lbe;

    .line 180
    .line 181
    if-ne v4, v7, :cond_5

    .line 182
    .line 183
    new-instance v4, Lzx6;

    .line 184
    .line 185
    const/16 v8, 0x18

    .line 186
    .line 187
    invoke-direct {v4, v8}, Lzx6;-><init>(B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_5
    check-cast v4, Lgn2;

    .line 194
    .line 195
    invoke-static {v2, v5, v4}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    if-ne v4, v7, :cond_6

    .line 204
    .line 205
    sget-object v4, Luf1;->c:Luf1;

    .line 206
    .line 207
    invoke-virtual {v1, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_6
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 211
    .line 212
    invoke-static {v2, v3, v4}, Lyy7;->a(Lkx4;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lkx4;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    sget-object v4, Lpz2;->Z:Lp50;

    .line 217
    .line 218
    invoke-static {v4, v6}, Lg80;->c(Lp50;Z)Lxr4;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-static {v1}, Lkm4;->I(Llp2;)I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-static {v1, v2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    sget-object v9, Luz0;->j:Lpz2;

    .line 235
    .line 236
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Llp2;->Z()V

    .line 240
    .line 241
    .line 242
    iget-boolean v9, v1, Llp2;->S:Z

    .line 243
    .line 244
    if-eqz v9, :cond_7

    .line 245
    .line 246
    invoke-virtual {v1}, Llp2;->k()V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_7
    invoke-virtual {v1}, Llp2;->j0()V

    .line 251
    .line 252
    .line 253
    :goto_3
    sget-object v9, Lpz2;->B0:Ldx0;

    .line 254
    .line 255
    invoke-static {v9, v1, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    sget-object v4, Lpz2;->A0:Ldx0;

    .line 259
    .line 260
    invoke-static {v4, v1, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v4, Lpz2;->C0:Ldx0;

    .line 264
    .line 265
    iget-boolean v8, v1, Llp2;->S:Z

    .line 266
    .line 267
    if-nez v8, :cond_8

    .line 268
    .line 269
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    if-nez v8, :cond_9

    .line 282
    .line 283
    :cond_8
    invoke-static {v7, v1, v7, v4}, Lp61;->v(ILlp2;ILdx0;)V

    .line 284
    .line 285
    .line 286
    :cond_9
    sget-object v4, Lpz2;->z0:Ldx0;

    .line 287
    .line 288
    invoke-static {v4, v1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    iget-object v0, v0, Lzx7;->i0:Lzy0;

    .line 296
    .line 297
    invoke-virtual {v0, v1, v2}, Lzy0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v6}, Llp2;->p(Z)V

    .line 301
    .line 302
    .line 303
    return-object v3

    .line 304
    :cond_a
    invoke-virtual {v1}, Llp2;->Q()V

    .line 305
    .line 306
    .line 307
    return-object v3
.end method

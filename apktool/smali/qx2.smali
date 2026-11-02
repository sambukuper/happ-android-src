.class public final synthetic Lqx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lpx2;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Lzy0;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:Lrn2;

.field public final synthetic h0:B

.field public final synthetic i0:J

.field public final synthetic j0:Lv09;

.field public final synthetic k0:Lzy0;

.field public final synthetic l0:Lky2;

.field public final synthetic m0:Llh7;


# direct methods
.method public synthetic constructor <init>(Lpx2;Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Lky2;Llh7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqx2;->X:Lpx2;

    .line 5
    .line 6
    iput-object p2, p0, Lqx2;->Y:Lkx4;

    .line 7
    .line 8
    iput-object p3, p0, Lqx2;->Z:Lzy0;

    .line 9
    .line 10
    iput-object p4, p0, Lqx2;->f0:Lrn2;

    .line 11
    .line 12
    iput-object p5, p0, Lqx2;->g0:Lrn2;

    .line 13
    .line 14
    iput-byte p6, p0, Lqx2;->h0:B

    .line 15
    .line 16
    iput-wide p7, p0, Lqx2;->i0:J

    .line 17
    .line 18
    iput-object p9, p0, Lqx2;->j0:Lv09;

    .line 19
    .line 20
    iput-object p10, p0, Lqx2;->k0:Lzy0;

    .line 21
    .line 22
    iput-object p11, p0, Lqx2;->l0:Lky2;

    .line 23
    .line 24
    iput-object p12, p0, Lqx2;->m0:Llh7;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v15, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v15

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v15

    .line 26
    invoke-virtual {v13, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_8

    .line 31
    .line 32
    sget-object v1, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 33
    .line 34
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, Lzz0;->a:Lbe;

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    new-instance v5, Ld0;

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/16 v12, 0xc

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    iget-object v7, v0, Lqx2;->X:Lpx2;

    .line 49
    .line 50
    const-class v8, Lpx2;

    .line 51
    .line 52
    const-string v9, "updateRootCoordinates"

    .line 53
    .line 54
    const-string v10, "updateRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V"

    .line 55
    .line 56
    invoke-direct/range {v5 .. v12}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v13, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v2, v5

    .line 63
    :cond_1
    check-cast v2, Lpv3;

    .line 64
    .line 65
    check-cast v2, Lgn2;

    .line 66
    .line 67
    invoke-static {v1, v2}, Lvr3;->Q(Lkx4;Lgn2;)Lkx4;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    sget-object v5, Lpz2;->Z:Lp50;

    .line 72
    .line 73
    invoke-static {v5, v4}, Lg80;->c(Lp50;Z)Lxr4;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-wide v6, v13, Llp2;->T:J

    .line 78
    .line 79
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-virtual {v13}, Llp2;->l()Lkl5;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v13, v2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    sget-object v8, Luz0;->j:Lpz2;

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v13}, Llp2;->Z()V

    .line 97
    .line 98
    .line 99
    iget-boolean v8, v13, Llp2;->S:Z

    .line 100
    .line 101
    if-eqz v8, :cond_2

    .line 102
    .line 103
    invoke-virtual {v13}, Llp2;->k()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {v13}, Llp2;->j0()V

    .line 108
    .line 109
    .line 110
    :goto_1
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 111
    .line 112
    invoke-static {v8, v13, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v5, Lpz2;->A0:Ldx0;

    .line 116
    .line 117
    invoke-static {v5, v13, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    sget-object v6, Lpz2;->C0:Ldx0;

    .line 125
    .line 126
    invoke-static {v6, v13, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v13}, Lpn7;->l(Llp2;)V

    .line 130
    .line 131
    .line 132
    sget-object v5, Lpz2;->z0:Ldx0;

    .line 133
    .line 134
    invoke-static {v5, v13, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, v0, Lqx2;->m0:Llh7;

    .line 138
    .line 139
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    const v5, -0x1f6aaf6a

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13, v5}, Llp2;->W(I)V

    .line 153
    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    cmpg-float v5, v2, v5

    .line 157
    .line 158
    iget-object v6, v0, Lqx2;->Y:Lkx4;

    .line 159
    .line 160
    if-gtz v5, :cond_3

    .line 161
    .line 162
    :goto_2
    invoke-virtual {v13, v4}, Llp2;->p(Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_3
    sget-object v5, Lsx2;->a:Lox1;

    .line 167
    .line 168
    invoke-virtual {v13, v5}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Lpx2;

    .line 173
    .line 174
    sget v7, Lbu2;->b:I

    .line 175
    .line 176
    sget-object v7, Ly01;->g:Lox1;

    .line 177
    .line 178
    invoke-virtual {v13, v7}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, Lvt2;

    .line 183
    .line 184
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    if-ne v8, v3, :cond_4

    .line 189
    .line 190
    new-instance v8, Lwt2;

    .line 191
    .line 192
    invoke-direct {v8, v7}, Lwt2;-><init>(Lvt2;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_4
    check-cast v8, Lwt2;

    .line 199
    .line 200
    iget-object v7, v8, Lwt2;->Y:Lxt2;

    .line 201
    .line 202
    iget-object v5, v5, Lpx2;->b:Lrh5;

    .line 203
    .line 204
    invoke-virtual {v5}, Lrh5;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, Ls86;

    .line 209
    .line 210
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    if-ne v8, v3, :cond_5

    .line 215
    .line 216
    invoke-static {}, Lu15;->c()Ldf;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-virtual {v8, v4}, Ldf;->e(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_5
    check-cast v8, Ldf;

    .line 227
    .line 228
    invoke-virtual {v13, v7}, Llp2;->h(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    invoke-virtual {v13, v2}, Llp2;->c(F)Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    or-int/2addr v9, v10

    .line 237
    invoke-virtual {v13, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    or-int/2addr v9, v10

    .line 242
    invoke-virtual {v13, v8}, Llp2;->h(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    or-int/2addr v9, v10

    .line 247
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    if-nez v9, :cond_6

    .line 252
    .line 253
    if-ne v10, v3, :cond_7

    .line 254
    .line 255
    :cond_6
    new-instance v10, Lyc7;

    .line 256
    .line 257
    invoke-direct {v10, v7, v2, v5, v8}, Lyc7;-><init>(Lxt2;FLs86;Ldf;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v13, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_7
    check-cast v10, Lgn2;

    .line 264
    .line 265
    invoke-static {v6, v10}, Lw79;->t(Lkx4;Lgn2;)Lkx4;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    goto :goto_2

    .line 270
    :goto_3
    const-wide/16 v9, 0x0

    .line 271
    .line 272
    const/4 v14, 0x0

    .line 273
    iget-object v2, v0, Lqx2;->Z:Lzy0;

    .line 274
    .line 275
    iget-object v3, v0, Lqx2;->f0:Lrn2;

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    iget-object v5, v0, Lqx2;->g0:Lrn2;

    .line 279
    .line 280
    move-object v7, v1

    .line 281
    move-object v1, v6

    .line 282
    iget-byte v6, v0, Lqx2;->h0:B

    .line 283
    .line 284
    move-object v11, v7

    .line 285
    iget-wide v7, v0, Lqx2;->i0:J

    .line 286
    .line 287
    move-object v12, v11

    .line 288
    iget-object v11, v0, Lqx2;->j0:Lv09;

    .line 289
    .line 290
    move-object/from16 v16, v12

    .line 291
    .line 292
    iget-object v12, v0, Lqx2;->k0:Lzy0;

    .line 293
    .line 294
    move-object/from16 v15, v16

    .line 295
    .line 296
    invoke-static/range {v1 .. v14}, Lwl7;->i(Lkx4;Lzy0;Lrn2;Lrn2;Lrn2;IJJLv09;Lzy0;Llp2;I)V

    .line 297
    .line 298
    .line 299
    sget-object v1, Lpz2;->f0:Lp50;

    .line 300
    .line 301
    sget-object v2, Lhx4;->X:Lhx4;

    .line 302
    .line 303
    invoke-static {v2, v1}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    sget-object v2, Lz91;->d:Lut8;

    .line 308
    .line 309
    invoke-static {v1, v2}, Lz91;->T(Lkx4;Lgn2;)Lkx4;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    iget-object v0, v0, Lqx2;->l0:Lky2;

    .line 314
    .line 315
    const/4 v2, 0x6

    .line 316
    invoke-static {v0, v1, v13, v2}, Lyn0;->g(Lky2;Lkx4;Llp2;I)V

    .line 317
    .line 318
    .line 319
    invoke-static {v15, v13, v2}, Lsx2;->a(Lkx4;Llp2;I)V

    .line 320
    .line 321
    .line 322
    const/4 v0, 0x1

    .line 323
    invoke-virtual {v13, v0}, Llp2;->p(Z)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_8
    invoke-virtual {v13}, Llp2;->Q()V

    .line 328
    .line 329
    .line 330
    :goto_4
    sget-object v0, Ldn8;->a:Ldn8;

    .line 331
    .line 332
    return-object v0
.end method

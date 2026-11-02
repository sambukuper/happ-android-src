.class public final Lht2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final X:Lni0;

.field public final Y:Ljava/util/Map;

.field public final Z:Ljava/util/Map;

.field public final f0:Ljava/util/ArrayList;

.field public final g0:Lb71;

.field public final h0:Lm51;

.field public final i0:Ly5;

.field public final j0:Ljava/lang/Object;

.field public volatile k0:Z

.field public l0:Lxm0;

.field public m0:Lne6;

.field public final n0:Ljava/util/Map;

.field public final o0:Lpv;

.field public p0:Lne6;

.field public q0:Ljava/util/Map;

.field public r0:Ljava/util/Map;

.field public s0:Ljava/util/Map;

.field public final t0:Ljava/util/List;

.field public u0:Lxm0;


# direct methods
.method public constructor <init>(Lni0;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;Lb71;Lu61;)V
    .locals 11

    .line 1
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lht2;->X:Lni0;

    .line 8
    .line 9
    iput-object p2, p0, Lht2;->Y:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p3, p0, Lht2;->Z:Ljava/util/Map;

    .line 12
    .line 13
    move-object/from16 v0, p5

    .line 14
    .line 15
    iput-object v0, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 16
    .line 17
    move-object/from16 v0, p6

    .line 18
    .line 19
    iput-object v0, p0, Lht2;->g0:Lb71;

    .line 20
    .line 21
    new-instance v0, Lx61;

    .line 22
    .line 23
    const-string v1, "CXCP-GraphLoop"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lx61;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p7

    .line 29
    .line 30
    invoke-static {v1, v0}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    iput-object v8, p0, Lht2;->h0:Lm51;

    .line 39
    .line 40
    new-instance v9, Ly5;

    .line 41
    .line 42
    new-instance v0, Ld0;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0xb

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    const-class v3, Lht2;

    .line 49
    .line 50
    const-string v4, "finalizeUnprocessedCommands"

    .line 51
    .line 52
    const-string v5, "finalizeUnprocessedCommands(Ljava/util/List;)V"

    .line 53
    .line 54
    move-object v2, p0

    .line 55
    invoke-direct/range {v0 .. v7}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 56
    .line 57
    .line 58
    move-object v10, v0

    .line 59
    new-instance v0, Lyn1;

    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    const/4 v1, 0x2

    .line 63
    const-string v4, "process"

    .line 64
    .line 65
    const-string v5, "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 66
    .line 67
    invoke-direct/range {v0 .. v7}, Lyn1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v9, v10, v0}, Ly5;-><init>(Ld0;Lyn1;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v9, Ly5;->g0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lpv;

    .line 76
    .line 77
    invoke-virtual {v0}, Lpv;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/4 v1, 0x0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    new-instance v0, Lr5;

    .line 85
    .line 86
    const/16 v3, 0x19

    .line 87
    .line 88
    invoke-direct {v0, v9, v1, v3}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x3

    .line 92
    invoke-static {v8, v1, v1, v0, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lrm3;->isCancelled()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    invoke-virtual {v9, v1}, Ly5;->Z(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_0
    iput-object v9, p0, Lht2;->i0:Ly5;

    .line 106
    .line 107
    new-instance v0, Ljava/lang/Object;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lht2;->j0:Ljava/lang/Object;

    .line 113
    .line 114
    sget-object v0, Le02;->X:Le02;

    .line 115
    .line 116
    iput-object v0, p0, Lht2;->n0:Ljava/util/Map;

    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    invoke-static {v1}, Lnr4;->e(Z)Lpv;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v1, p0, Lht2;->o0:Lpv;

    .line 124
    .line 125
    iput-object v0, p0, Lht2;->q0:Ljava/util/Map;

    .line 126
    .line 127
    iput-object v0, p0, Lht2;->r0:Ljava/util/Map;

    .line 128
    .line 129
    iput-object p3, p0, Lht2;->s0:Ljava/util/Map;

    .line 130
    .line 131
    move-object v0, p4

    .line 132
    iput-object v0, p0, Lht2;->t0:Ljava/util/List;

    .line 133
    .line 134
    return-void

    .line 135
    :cond_1
    const-string v0, "ProcessingQueue cannot be re-started!"

    .line 136
    .line 137
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1
.end method


# virtual methods
.method public final C(Ljava/util/List;ILat2;Lq51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lft2;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lft2;

    .line 11
    .line 12
    iget v3, v2, Lft2;->o0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lft2;->o0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lft2;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lft2;-><init>(Lht2;Lq51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lft2;->m0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lft2;->o0:I

    .line 32
    .line 33
    sget-object v4, Ldn8;->a:Ldn8;

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    sget-object v10, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    if-eq v3, v9, :cond_3

    .line 44
    .line 45
    if-eq v3, v6, :cond_2

    .line 46
    .line 47
    if-ne v3, v5, :cond_1

    .line 48
    .line 49
    iget-object v3, v2, Lft2;->h0:Lca6;

    .line 50
    .line 51
    iget-object v5, v2, Lft2;->g0:Lat2;

    .line 52
    .line 53
    iget-object v2, v2, Lft2;->f0:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v8

    .line 66
    :cond_2
    iget v3, v2, Lft2;->l0:I

    .line 67
    .line 68
    iget v11, v2, Lft2;->k0:I

    .line 69
    .line 70
    iget-object v12, v2, Lft2;->i0:Ljava/util/List;

    .line 71
    .line 72
    iget-object v13, v2, Lft2;->h0:Lca6;

    .line 73
    .line 74
    iget-object v14, v2, Lft2;->g0:Lat2;

    .line 75
    .line 76
    iget-object v15, v2, Lft2;->f0:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_3
    iget v3, v2, Lft2;->l0:I

    .line 84
    .line 85
    iget v11, v2, Lft2;->k0:I

    .line 86
    .line 87
    iget-object v12, v2, Lft2;->j0:Lat2;

    .line 88
    .line 89
    iget-object v13, v2, Lft2;->i0:Ljava/util/List;

    .line 90
    .line 91
    iget-object v14, v2, Lft2;->h0:Lca6;

    .line 92
    .line 93
    iget-object v15, v2, Lft2;->g0:Lat2;

    .line 94
    .line 95
    iget-object v7, v2, Lft2;->f0:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lca6;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 107
    .line 108
    .line 109
    iput v9, v1, Lca6;->X:I

    .line 110
    .line 111
    invoke-interface/range {p1 .. p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move/from16 v3, p2

    .line 115
    .line 116
    move-object/from16 v7, p3

    .line 117
    .line 118
    move-object v12, v1

    .line 119
    move-object v11, v2

    .line 120
    const/4 v13, 0x0

    .line 121
    move-object/from16 v1, p1

    .line 122
    .line 123
    move-object v2, v1

    .line 124
    :goto_1
    if-ge v13, v3, :cond_b

    .line 125
    .line 126
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    check-cast v14, Lct2;

    .line 131
    .line 132
    instance-of v15, v14, Lat2;

    .line 133
    .line 134
    if-eqz v15, :cond_9

    .line 135
    .line 136
    move-object v15, v14

    .line 137
    check-cast v15, Lat2;

    .line 138
    .line 139
    iget-object v5, v15, Lat2;->a:Lxm0;

    .line 140
    .line 141
    if-eqz v5, :cond_6

    .line 142
    .line 143
    iput-object v2, v11, Lft2;->f0:Ljava/util/List;

    .line 144
    .line 145
    iput-object v7, v11, Lft2;->g0:Lat2;

    .line 146
    .line 147
    iput-object v12, v11, Lft2;->h0:Lca6;

    .line 148
    .line 149
    iput-object v1, v11, Lft2;->i0:Ljava/util/List;

    .line 150
    .line 151
    iput-object v15, v11, Lft2;->j0:Lat2;

    .line 152
    .line 153
    iput v13, v11, Lft2;->k0:I

    .line 154
    .line 155
    iput v3, v11, Lft2;->l0:I

    .line 156
    .line 157
    iput v9, v11, Lft2;->o0:I

    .line 158
    .line 159
    invoke-virtual {v5}, Lxm0;->f()Ldn8;

    .line 160
    .line 161
    .line 162
    if-ne v4, v10, :cond_5

    .line 163
    .line 164
    goto/16 :goto_7

    .line 165
    .line 166
    :cond_5
    move-object v15, v14

    .line 167
    move-object v14, v12

    .line 168
    move-object v12, v15

    .line 169
    move-object v15, v7

    .line 170
    move-object v7, v2

    .line 171
    move-object v2, v11

    .line 172
    move v11, v13

    .line 173
    move-object v13, v1

    .line 174
    :goto_2
    move-object/from16 v16, v14

    .line 175
    .line 176
    move-object v14, v12

    .line 177
    move-object v12, v13

    .line 178
    move-object/from16 v13, v16

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    move-object v15, v7

    .line 182
    move-object v7, v2

    .line 183
    move-object v2, v11

    .line 184
    move v11, v13

    .line 185
    move-object v13, v12

    .line 186
    move-object v12, v1

    .line 187
    :goto_3
    check-cast v14, Lat2;

    .line 188
    .line 189
    iget-object v1, v14, Lat2;->b:Lxm0;

    .line 190
    .line 191
    if-eqz v1, :cond_8

    .line 192
    .line 193
    iput-object v7, v2, Lft2;->f0:Ljava/util/List;

    .line 194
    .line 195
    iput-object v15, v2, Lft2;->g0:Lat2;

    .line 196
    .line 197
    iput-object v13, v2, Lft2;->h0:Lca6;

    .line 198
    .line 199
    iput-object v12, v2, Lft2;->i0:Ljava/util/List;

    .line 200
    .line 201
    iput-object v8, v2, Lft2;->j0:Lat2;

    .line 202
    .line 203
    iput v11, v2, Lft2;->k0:I

    .line 204
    .line 205
    iput v3, v2, Lft2;->l0:I

    .line 206
    .line 207
    iput v6, v2, Lft2;->o0:I

    .line 208
    .line 209
    invoke-virtual {v1}, Lxm0;->f()Ldn8;

    .line 210
    .line 211
    .line 212
    if-ne v4, v10, :cond_7

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_7
    move-object v14, v15

    .line 216
    move-object v15, v7

    .line 217
    :goto_4
    move-object v7, v15

    .line 218
    move-object v15, v14

    .line 219
    :cond_8
    move-object v1, v12

    .line 220
    move-object v12, v13

    .line 221
    move v13, v11

    .line 222
    iget v5, v12, Lca6;->X:I

    .line 223
    .line 224
    add-int/2addr v5, v9

    .line 225
    iput v5, v12, Lca6;->X:I

    .line 226
    .line 227
    move-object v11, v2

    .line 228
    move-object v2, v7

    .line 229
    move v5, v9

    .line 230
    move-object v7, v15

    .line 231
    goto :goto_5

    .line 232
    :cond_9
    const/4 v5, 0x0

    .line 233
    :goto_5
    if-eqz v5, :cond_a

    .line 234
    .line 235
    invoke-interface {v1, v13}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    add-int/lit8 v3, v3, -0x1

    .line 239
    .line 240
    :goto_6
    const/4 v5, 0x3

    .line 241
    goto :goto_1

    .line 242
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_b
    iget-object v1, v7, Lat2;->a:Lxm0;

    .line 246
    .line 247
    if-eqz v1, :cond_d

    .line 248
    .line 249
    iput-object v2, v11, Lft2;->f0:Ljava/util/List;

    .line 250
    .line 251
    iput-object v7, v11, Lft2;->g0:Lat2;

    .line 252
    .line 253
    iput-object v12, v11, Lft2;->h0:Lca6;

    .line 254
    .line 255
    iput-object v8, v11, Lft2;->i0:Ljava/util/List;

    .line 256
    .line 257
    iput-object v8, v11, Lft2;->j0:Lat2;

    .line 258
    .line 259
    const/4 v3, 0x3

    .line 260
    iput v3, v11, Lft2;->o0:I

    .line 261
    .line 262
    invoke-virtual {v1}, Lxm0;->f()Ldn8;

    .line 263
    .line 264
    .line 265
    if-ne v4, v10, :cond_c

    .line 266
    .line 267
    :goto_7
    return-object v10

    .line 268
    :cond_c
    move-object v5, v7

    .line 269
    move-object v3, v12

    .line 270
    :goto_8
    move-object v12, v3

    .line 271
    move-object v7, v5

    .line 272
    :cond_d
    iget-object v1, v7, Lat2;->b:Lxm0;

    .line 273
    .line 274
    iput-object v1, v0, Lht2;->u0:Lxm0;

    .line 275
    .line 276
    invoke-virtual {v0}, Lht2;->R()Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-nez v1, :cond_f

    .line 281
    .line 282
    iget-object v1, v0, Lht2;->p0:Lne6;

    .line 283
    .line 284
    if-eqz v1, :cond_e

    .line 285
    .line 286
    new-instance v3, Lzs2;

    .line 287
    .line 288
    invoke-direct {v3, v1}, Lzs2;-><init>(Lne6;)V

    .line 289
    .line 290
    .line 291
    const/4 v1, 0x0

    .line 292
    invoke-interface {v2, v1, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    iget v1, v12, Lca6;->X:I

    .line 296
    .line 297
    if-ne v1, v9, :cond_e

    .line 298
    .line 299
    sget-object v1, Lvs2;->b:Lvs2;

    .line 300
    .line 301
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_e
    iput-object v8, v0, Lht2;->p0:Lne6;

    .line 305
    .line 306
    :cond_f
    return-object v4
.end method

.method public final D(Ljava/util/List;Lq51;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, Lgt2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lgt2;

    .line 7
    .line 8
    iget v1, v0, Lgt2;->l0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lgt2;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgt2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lgt2;-><init>(Lht2;Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lgt2;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgt2;->l0:I

    .line 28
    .line 29
    sget-object v2, Ldn8;->a:Ldn8;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x1

    .line 36
    sget-object v8, Lc71;->X:Lc71;

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eq v1, v7, :cond_3

    .line 41
    .line 42
    if-eq v1, v5, :cond_2

    .line 43
    .line 44
    if-ne v1, v4, :cond_1

    .line 45
    .line 46
    iget p1, v0, Lgt2;->i0:I

    .line 47
    .line 48
    iget v1, v0, Lgt2;->h0:I

    .line 49
    .line 50
    iget-object v3, v0, Lgt2;->f0:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v6

    .line 63
    :cond_2
    iget p1, v0, Lgt2;->i0:I

    .line 64
    .line 65
    iget v1, v0, Lgt2;->h0:I

    .line 66
    .line 67
    iget-object v3, v0, Lgt2;->g0:Lat2;

    .line 68
    .line 69
    iget-object v9, v0, Lgt2;->f0:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_3
    iget-object p1, v0, Lgt2;->f0:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iput-object v6, p0, Lht2;->p0:Lne6;

    .line 86
    .line 87
    sget-object p2, Le02;->X:Le02;

    .line 88
    .line 89
    iput-object p2, p0, Lht2;->q0:Ljava/util/Map;

    .line 90
    .line 91
    iput-object p2, p0, Lht2;->r0:Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    move v1, v3

    .line 98
    :goto_1
    if-ge v1, p2, :cond_6

    .line 99
    .line 100
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, Lct2;

    .line 105
    .line 106
    instance-of v9, v9, Lws2;

    .line 107
    .line 108
    if-eqz v9, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v6}, Lht2;->g(Ljava/util/ArrayList;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    iget-object p2, p0, Lht2;->u0:Lxm0;

    .line 117
    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    iput-object p1, v0, Lgt2;->f0:Ljava/util/List;

    .line 121
    .line 122
    iput v7, v0, Lgt2;->l0:I

    .line 123
    .line 124
    invoke-virtual {p2}, Lxm0;->f()Ldn8;

    .line 125
    .line 126
    .line 127
    if-ne v2, v8, :cond_7

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_7
    :goto_2
    iput-object v6, p0, Lht2;->u0:Lxm0;

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    move-object v9, p1

    .line 137
    move p1, p2

    .line 138
    :goto_3
    if-ge v3, p1, :cond_c

    .line 139
    .line 140
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Lct2;

    .line 145
    .line 146
    instance-of v1, p2, Lat2;

    .line 147
    .line 148
    if-eqz v1, :cond_b

    .line 149
    .line 150
    move-object v1, p2

    .line 151
    check-cast v1, Lat2;

    .line 152
    .line 153
    iget-object v10, v1, Lat2;->a:Lxm0;

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    iput-object v9, v0, Lgt2;->f0:Ljava/util/List;

    .line 158
    .line 159
    iput-object v1, v0, Lgt2;->g0:Lat2;

    .line 160
    .line 161
    iput v3, v0, Lgt2;->h0:I

    .line 162
    .line 163
    iput p1, v0, Lgt2;->i0:I

    .line 164
    .line 165
    iput v5, v0, Lgt2;->l0:I

    .line 166
    .line 167
    invoke-virtual {v10}, Lxm0;->f()Ldn8;

    .line 168
    .line 169
    .line 170
    if-ne v2, v8, :cond_8

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_8
    move v1, v3

    .line 174
    move-object v3, p2

    .line 175
    :goto_4
    move-object p2, v3

    .line 176
    :goto_5
    move-object v3, v9

    .line 177
    goto :goto_6

    .line 178
    :cond_9
    move v1, v3

    .line 179
    goto :goto_5

    .line 180
    :goto_6
    check-cast p2, Lat2;

    .line 181
    .line 182
    iget-object p2, p2, Lat2;->b:Lxm0;

    .line 183
    .line 184
    if-eqz p2, :cond_a

    .line 185
    .line 186
    iput-object v3, v0, Lgt2;->f0:Ljava/util/List;

    .line 187
    .line 188
    iput-object v6, v0, Lgt2;->g0:Lat2;

    .line 189
    .line 190
    iput v1, v0, Lgt2;->h0:I

    .line 191
    .line 192
    iput p1, v0, Lgt2;->i0:I

    .line 193
    .line 194
    iput v4, v0, Lgt2;->l0:I

    .line 195
    .line 196
    invoke-virtual {p2}, Lxm0;->f()Ldn8;

    .line 197
    .line 198
    .line 199
    if-ne v2, v8, :cond_a

    .line 200
    .line 201
    :goto_7
    return-object v8

    .line 202
    :cond_a
    :goto_8
    move-object v9, v3

    .line 203
    move v3, v1

    .line 204
    :cond_b
    add-int/2addr v3, v7

    .line 205
    goto :goto_3

    .line 206
    :cond_c
    invoke-interface {v9}, Ljava/util/List;->clear()V

    .line 207
    .line 208
    .line 209
    iget-object p0, p0, Lht2;->h0:Lm51;

    .line 210
    .line 211
    invoke-static {p0, v6}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 212
    .line 213
    .line 214
    return-object v2
.end method

.method public final J(Ljava/util/List;ILbt2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lht2;->p0:Lne6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v1, p0, Lht2;->o0:Lpv;

    .line 12
    .line 13
    invoke-virtual {v1}, Lpv;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p3, p3, Lbt2;->a:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p0, v2, v0, p3}, Lht2;->k(ZLjava/util/List;Ljava/util/Map;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    if-lez p2, :cond_3

    .line 39
    .line 40
    add-int/lit8 p2, p2, -0x1

    .line 41
    .line 42
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, Lct2;

    .line 47
    .line 48
    instance-of p3, p3, Lzs2;

    .line 49
    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p2, p1, v2}, Lht2;->u(ILjava/util/List;Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const-string p0, "Check failed."

    .line 57
    .line 58
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public final R()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lht2;->u0:Lxm0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lht2;->p0:Lne6;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v4, p0, Lht2;->q0:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v5, p0, Lht2;->s0:Ljava/util/Map;

    .line 16
    .line 17
    iget-object v6, p0, Lht2;->t0:Ljava/util/List;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iget-object v3, p0, Lht2;->Y:Ljava/util/Map;

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v6}, Lxm0;->g(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public final U(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lht2;->o0:Lpv;

    .line 2
    .line 3
    iput p1, v0, Lpv;->a:I

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lht2;->i0:Ly5;

    .line 8
    .line 9
    sget-object p1, Lvs2;->b:Lvs2;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ly5;->g0(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final X(Lxm0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lht2;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lht2;->l0:Lxm0;

    .line 5
    .line 6
    iput-object p1, p0, Lht2;->l0:Lxm0;

    .line 7
    .line 8
    iget-boolean v2, p0, Lht2;->k0:Z

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lht2;->l0:Lxm0;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lht2;->g0:Lb71;

    .line 18
    .line 19
    new-instance v2, Let2;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, p1, v1, v3}, Let2;-><init>(Lxm0;Lq51;B)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    invoke-static {p0, v1, v1, v2, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    :goto_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :cond_1
    if-ne v1, p1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :try_start_1
    iget-object v2, p0, Lht2;->i0:Ly5;

    .line 38
    .line 39
    new-instance v3, Lat2;

    .line 40
    .line 41
    invoke-direct {v3, v1, p1}, Lat2;-><init>(Lxm0;Lxm0;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ly5;->g0(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    :goto_1
    monitor-exit v0

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    iget-object p1, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    const/4 v0, 0x0

    .line 57
    :goto_2
    if-ge v0, p1, :cond_3

    .line 58
    .line 59
    iget-object v1, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ldt2;

    .line 66
    .line 67
    invoke-interface {v1}, Ldt2;->a()V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    return-void

    .line 74
    :goto_3
    monitor-exit v0

    .line 75
    throw p0
.end method

.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lht2;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lht2;->k0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :try_start_1
    iput-boolean v1, p0, Lht2;->k0:Z

    .line 12
    .line 13
    iget-object v1, p0, Lht2;->l0:Lxm0;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v4, p0, Lht2;->g0:Lb71;

    .line 20
    .line 21
    new-instance v5, Let2;

    .line 22
    .line 23
    invoke-direct {v5, v1, v3, v2}, Let2;-><init>(Lxm0;Lq51;B)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-static {v4, v3, v3, v5, v1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    iput-object v3, p0, Lht2;->l0:Lxm0;

    .line 34
    .line 35
    iget-object v1, p0, Lht2;->i0:Ly5;

    .line 36
    .line 37
    sget-object v3, Lvs2;->c:Lvs2;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ly5;->g0(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    iget-object v0, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :goto_1
    if-ge v2, v0, :cond_2

    .line 50
    .line 51
    iget-object v1, p0, Lht2;->f0:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ldt2;

    .line 58
    .line 59
    invoke-interface {v1}, Ldt2;->b()V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    return-void

    .line 66
    :goto_2
    monitor-exit v0

    .line 67
    throw p0
.end method

.method public final g(Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lne6;

    .line 14
    .line 15
    iget-object v4, p0, Lht2;->t0:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    move v6, v1

    .line 22
    :goto_1
    if-ge v6, v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    check-cast v7, Lme6;

    .line 29
    .line 30
    invoke-interface {v7, v3}, Lme6;->a0(Lne6;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    move v0, v1

    .line 44
    :goto_2
    if-ge v0, p0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lne6;

    .line 51
    .line 52
    iget-object v3, v2, Lne6;->d:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    move v4, v1

    .line 59
    :goto_3
    if-ge v4, v3, :cond_2

    .line 60
    .line 61
    iget-object v5, v2, Lne6;->d:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lme6;

    .line 68
    .line 69
    invoke-interface {v5, v2}, Lme6;->a0(Lne6;)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    return-void
.end method

.method public final k(ZLjava/util/List;Ljava/util/Map;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lht2;->u0:Lxm0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object v4, p0, Lht2;->q0:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lht2;->s0:Ljava/util/Map;

    .line 16
    .line 17
    :goto_0
    move-object v5, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    new-instance v1, Lip4;

    .line 20
    .line 21
    invoke-direct {v1}, Lip4;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lht2;->r0:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lip4;->putAll(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p3}, Lip4;->putAll(Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lht2;->Z:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lip4;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lip4;->b()Lip4;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    iget-object v6, p0, Lht2;->t0:Ljava/util/List;

    .line 46
    .line 47
    iget-object v3, p0, Lht2;->Y:Ljava/util/Map;

    .line 48
    .line 49
    move v1, p1

    .line 50
    move-object v2, p2

    .line 51
    invoke-virtual/range {v0 .. v6}, Lxm0;->g(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_4

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-static {v2}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    return p0

    .line 67
    :cond_2
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    return p0

    .line 77
    :cond_3
    invoke-static {v2}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    :cond_4
    return p0
.end method

.method public final m()Lne6;
    .locals 1

    .line 1
    iget-object v0, p0, Lht2;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lht2;->m0:Lne6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0

    .line 10
    throw p0
.end method

.method public final p(Ljava/util/List;ILws2;Z)V
    .locals 2

    .line 1
    iget-object p3, p0, Lht2;->o0:Lpv;

    .line 2
    .line 3
    invoke-virtual {p3}, Lpv;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    sget-object v1, Le02;->X:Le02;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p3, v1}, Lht2;->k(ZLjava/util/List;Ljava/util/Map;)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    if-eqz p4, :cond_2

    .line 24
    .line 25
    if-lez p2, :cond_2

    .line 26
    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Lct2;

    .line 34
    .line 35
    instance-of p3, p3, Lzs2;

    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p2, p1, v0}, Lht2;->u(ILjava/util/List;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string p0, "Check failed."

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GraphLoop("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lht2;->X:Lni0;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final u(ILjava/util/List;Z)V
    .locals 6

    .line 1
    move v0, p1

    .line 2
    :goto_0
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, -0x1

    .line 5
    if-ge v3, v0, :cond_2

    .line 6
    .line 7
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Lct2;

    .line 12
    .line 13
    instance-of v4, v3, Lzs2;

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    check-cast v3, Lzs2;

    .line 18
    .line 19
    iget-object v3, v3, Lzs2;->a:Lne6;

    .line 20
    .line 21
    invoke-static {v3}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    sget-object v5, Le02;->X:Le02;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v4, v5}, Lht2;->k(ZLjava/util/List;Ljava/util/Map;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iput-object v3, p0, Lht2;->p0:Lne6;

    .line 34
    .line 35
    invoke-interface {p2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_1
    if-ge v2, v0, :cond_4

    .line 39
    .line 40
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lct2;

    .line 45
    .line 46
    instance-of p0, p0, Lzs2;

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    invoke-interface {p2, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    add-int/lit8 v0, v0, -0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-eqz p3, :cond_4

    .line 63
    .line 64
    add-int/2addr p1, v1

    .line 65
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-ge p1, p3, :cond_4

    .line 70
    .line 71
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Lct2;

    .line 76
    .line 77
    instance-of v0, p3, Lws2;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    check-cast p3, Lws2;

    .line 82
    .line 83
    invoke-virtual {p0, p2, p1, p3, v2}, Lht2;->p(Ljava/util/List;ILws2;Z)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    instance-of v0, p3, Lbt2;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    check-cast p3, Lbt2;

    .line 92
    .line 93
    invoke-virtual {p0, p2, p1, p3}, Lht2;->J(Ljava/util/List;ILbt2;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    return-void
.end method

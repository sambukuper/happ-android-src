.class public final Lxk0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lea6;

.field public h0:Lea6;

.field public i0:Lea6;

.field public j0:Lea6;

.field public k0:Z

.field public synthetic l0:Ljava/lang/Object;

.field public final synthetic m0:Ld6;

.field public final synthetic n0:Ljava/lang/String;

.field public final synthetic o0:Ldb;


# direct methods
.method public constructor <init>(Ld6;Ljava/lang/String;Ldb;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxk0;->m0:Ld6;

    .line 2
    .line 3
    iput-object p2, p0, Lxk0;->n0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lxk0;->o0:Ldb;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lxk0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxk0;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Lxk0;

    .line 2
    .line 3
    iget-object v1, p0, Lxk0;->n0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lxk0;->o0:Ldb;

    .line 6
    .line 7
    iget-object p0, p0, Lxk0;->m0:Ld6;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lxk0;-><init>(Ld6;Ljava/lang/String;Ldb;Lq51;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Lxk0;->l0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v5, Loe0;->f0:Loe0;

    .line 4
    .line 5
    iget-boolean v1, v0, Lxk0;->k0:Z

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    iget-object v12, v0, Lxk0;->n0:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v13, v0, Lxk0;->o0:Ldb;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v14, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lxk0;->j0:Lea6;

    .line 19
    .line 20
    iget-object v3, v0, Lxk0;->i0:Lea6;

    .line 21
    .line 22
    iget-object v4, v0, Lxk0;->h0:Lea6;

    .line 23
    .line 24
    iget-object v6, v0, Lxk0;->g0:Lea6;

    .line 25
    .line 26
    iget-object v7, v0, Lxk0;->l0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v7, Lb71;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v10, v1

    .line 34
    move-object v11, v3

    .line 35
    move-object v15, v4

    .line 36
    move-object v3, v6

    .line 37
    move-object/from16 v16, v12

    .line 38
    .line 39
    move-object/from16 v1, p1

    .line 40
    .line 41
    move v12, v2

    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return-object v0

    .line 51
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, Lxk0;->l0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lb71;

    .line 57
    .line 58
    new-instance v3, Lea6;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v10, Lr0;

    .line 64
    .line 65
    const/16 v15, 0x8

    .line 66
    .line 67
    iget-object v11, v0, Lxk0;->m0:Ld6;

    .line 68
    .line 69
    invoke-direct/range {v10 .. v15}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 70
    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    invoke-static {v1, v14, v10, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iput-object v6, v3, Lea6;->X:Ljava/lang/Object;

    .line 78
    .line 79
    new-instance v6, Lea6;

    .line 80
    .line 81
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v7, Lr5;

    .line 85
    .line 86
    const/4 v8, 0x5

    .line 87
    invoke-direct {v7, v13, v14, v8}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v14, v7, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iput-object v7, v6, Lea6;->X:Ljava/lang/Object;

    .line 95
    .line 96
    new-instance v7, Lea6;

    .line 97
    .line 98
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v8, Lwk0;

    .line 102
    .line 103
    const/4 v10, 0x2

    .line 104
    invoke-direct {v8, v10, v14, v9}, Lwk0;-><init>(ILq51;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v14, v14, v8, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    iput-object v8, v7, Lea6;->X:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance v8, Lea6;

    .line 114
    .line 115
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance v10, Ltk0;

    .line 119
    .line 120
    invoke-direct {v10, v11, v14, v9}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v14, v14, v10, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iput-object v4, v8, Lea6;->X:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v15, v6

    .line 130
    move-object v11, v7

    .line 131
    move-object v10, v8

    .line 132
    move-object v7, v1

    .line 133
    :goto_0
    move-object v1, v3

    .line 134
    invoke-static {v7}, Lgv3;->E(Lb71;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_c

    .line 139
    .line 140
    new-instance v3, Ltz6;

    .line 141
    .line 142
    iget-object v4, v0, Ls51;->Y:Ls61;

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-direct {v3, v4}, Ltz6;-><init>(Ls61;)V

    .line 148
    .line 149
    .line 150
    iget-object v4, v1, Lea6;->X:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v4, Lxg1;

    .line 153
    .line 154
    if-eqz v4, :cond_2

    .line 155
    .line 156
    invoke-interface {v4}, Lxg1;->u()Lyr6;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    new-instance v6, Luk0;

    .line 161
    .line 162
    invoke-direct {v6, v1, v12, v14, v9}, Luk0;-><init>(Lea6;Ljava/lang/String;Lq51;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v4, v6}, Ltz6;->g(Lyr6;Lrn2;)V

    .line 166
    .line 167
    .line 168
    :cond_2
    iget-object v4, v15, Lea6;->X:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v4, Lxg1;

    .line 171
    .line 172
    if-eqz v4, :cond_3

    .line 173
    .line 174
    invoke-interface {v4}, Lxg1;->u()Lyr6;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    new-instance v6, Luk0;

    .line 179
    .line 180
    invoke-direct {v6, v15, v12, v14, v2}, Luk0;-><init>(Lea6;Ljava/lang/String;Lq51;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v4, v6}, Ltz6;->g(Lyr6;Lrn2;)V

    .line 184
    .line 185
    .line 186
    :cond_3
    iget-object v4, v11, Lea6;->X:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v4, Lbm3;

    .line 189
    .line 190
    sget-object v6, Luz6;->e:Lz31;

    .line 191
    .line 192
    if-eqz v4, :cond_4

    .line 193
    .line 194
    invoke-interface {v4}, Lbm3;->C0()Ly45;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    move-object v8, v7

    .line 199
    new-instance v7, Lvk0;

    .line 200
    .line 201
    invoke-direct {v7, v11, v1, v13, v14}, Lvk0;-><init>(Lea6;Lea6;Ldb;Lq51;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v16, v1

    .line 205
    .line 206
    new-instance v1, Lrz6;

    .line 207
    .line 208
    iget-object v4, v4, Ly45;->X:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v4, Lrm3;

    .line 211
    .line 212
    move/from16 v17, v2

    .line 213
    .line 214
    move-object v2, v3

    .line 215
    move-object v3, v4

    .line 216
    sget-object v4, Lqm3;->X:Lqm3;

    .line 217
    .line 218
    move-object/from16 v18, v8

    .line 219
    .line 220
    const/4 v8, 0x0

    .line 221
    move-object/from16 v20, v16

    .line 222
    .line 223
    move-object/from16 v19, v18

    .line 224
    .line 225
    move-object/from16 v16, v12

    .line 226
    .line 227
    move/from16 v12, v17

    .line 228
    .line 229
    invoke-direct/range {v1 .. v8}, Lrz6;-><init>(Ltz6;Ljava/lang/Object;Lsn2;Lsn2;Ljava/lang/Object;Luy7;Lsn2;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v1, v9}, Ltz6;->h(Lrz6;Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_4
    move-object/from16 v20, v1

    .line 237
    .line 238
    move-object/from16 v19, v7

    .line 239
    .line 240
    move-object/from16 v16, v12

    .line 241
    .line 242
    move v12, v2

    .line 243
    move-object v2, v3

    .line 244
    :goto_1
    iget-object v1, v10, Lea6;->X:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Lbm3;

    .line 247
    .line 248
    if-eqz v1, :cond_5

    .line 249
    .line 250
    invoke-interface {v1}, Lbm3;->C0()Ly45;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    new-instance v7, Lli;

    .line 255
    .line 256
    invoke-direct {v7, v10, v14, v12}, Lli;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 257
    .line 258
    .line 259
    new-instance v3, Lrz6;

    .line 260
    .line 261
    iget-object v1, v1, Ly45;->X:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Lrm3;

    .line 264
    .line 265
    sget-object v4, Lqm3;->X:Lqm3;

    .line 266
    .line 267
    const/4 v8, 0x0

    .line 268
    move-object/from16 v21, v3

    .line 269
    .line 270
    move-object v3, v1

    .line 271
    move-object/from16 v1, v21

    .line 272
    .line 273
    invoke-direct/range {v1 .. v8}, Lrz6;-><init>(Ltz6;Ljava/lang/Object;Lsn2;Lsn2;Ljava/lang/Object;Luy7;Lsn2;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v1, v9}, Ltz6;->h(Lrz6;Z)V

    .line 277
    .line 278
    .line 279
    :cond_5
    move-object/from16 v8, v19

    .line 280
    .line 281
    iput-object v8, v0, Lxk0;->l0:Ljava/lang/Object;

    .line 282
    .line 283
    move-object/from16 v3, v20

    .line 284
    .line 285
    iput-object v3, v0, Lxk0;->g0:Lea6;

    .line 286
    .line 287
    iput-object v15, v0, Lxk0;->h0:Lea6;

    .line 288
    .line 289
    iput-object v11, v0, Lxk0;->i0:Lea6;

    .line 290
    .line 291
    iput-object v10, v0, Lxk0;->j0:Lea6;

    .line 292
    .line 293
    iput-boolean v12, v0, Lxk0;->k0:Z

    .line 294
    .line 295
    invoke-static {v2, v0}, Ltz6;->d(Ltz6;Luy7;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    sget-object v2, Lc71;->X:Lc71;

    .line 300
    .line 301
    if-ne v1, v2, :cond_6

    .line 302
    .line 303
    return-object v2

    .line 304
    :cond_6
    move-object v7, v8

    .line 305
    :goto_2
    check-cast v1, Lhb5;

    .line 306
    .line 307
    if-eqz v1, :cond_b

    .line 308
    .line 309
    invoke-virtual {v1}, Lhb5;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    iget-object v0, v3, Lea6;->X:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Lxg1;

    .line 315
    .line 316
    if-eqz v0, :cond_7

    .line 317
    .line 318
    check-cast v0, Lrm3;

    .line 319
    .line 320
    invoke-virtual {v0, v14}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 321
    .line 322
    .line 323
    :cond_7
    iget-object v0, v15, Lea6;->X:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, Lxg1;

    .line 326
    .line 327
    if-eqz v0, :cond_8

    .line 328
    .line 329
    check-cast v0, Lrm3;

    .line 330
    .line 331
    invoke-virtual {v0, v14}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 332
    .line 333
    .line 334
    :cond_8
    iget-object v0, v11, Lea6;->X:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, Lbm3;

    .line 337
    .line 338
    if-eqz v0, :cond_9

    .line 339
    .line 340
    invoke-interface {v0, v14}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 341
    .line 342
    .line 343
    :cond_9
    iget-object v0, v10, Lea6;->X:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lbm3;

    .line 346
    .line 347
    if-eqz v0, :cond_a

    .line 348
    .line 349
    invoke-interface {v0, v14}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 350
    .line 351
    .line 352
    :cond_a
    return-object v1

    .line 353
    :cond_b
    move v2, v12

    .line 354
    move-object/from16 v12, v16

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_c
    move v12, v2

    .line 359
    new-instance v0, Lhb5;

    .line 360
    .line 361
    new-instance v1, Lai0;

    .line 362
    .line 363
    const/16 v2, 0xc

    .line 364
    .line 365
    invoke-direct {v1, v2}, Lai0;-><init>(I)V

    .line 366
    .line 367
    .line 368
    invoke-direct {v0, v14, v1, v12}, Lhb5;-><init>(Ldb;Lai0;I)V

    .line 369
    .line 370
    .line 371
    return-object v0
.end method

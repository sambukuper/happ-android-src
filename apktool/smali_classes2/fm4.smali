.class public final synthetic Lfm4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lza3;

.field public final synthetic Z:Lxw8;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lp67;Lpv3;Lza3;Lo87;Lky2;Ly05;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lfm4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfm4;->Z:Lxw8;

    .line 8
    .line 9
    iput-object p2, p0, Lfm4;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lfm4;->Y:Lza3;

    .line 12
    .line 13
    iput-object p4, p0, Lfm4;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lfm4;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lfm4;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lsq6;Lgw5;Ldr2;Lza3;Lkr7;I)V
    .locals 0

    .line 20
    const/4 p7, 0x0

    iput-byte p7, p0, Lfm4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm4;->Z:Lxw8;

    iput-object p2, p0, Lfm4;->f0:Ljava/lang/Object;

    iput-object p3, p0, Lfm4;->g0:Ljava/lang/Object;

    iput-object p4, p0, Lfm4;->h0:Ljava/lang/Object;

    iput-object p5, p0, Lfm4;->Y:Lza3;

    iput-object p6, p0, Lfm4;->i0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lfm4;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object v3, v0, Lfm4;->i0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lfm4;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lfm4;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lfm4;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lfm4;->Z:Lxw8;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v7, Lp67;

    .line 21
    .line 22
    check-cast v6, Lpv3;

    .line 23
    .line 24
    check-cast v5, Lo87;

    .line 25
    .line 26
    check-cast v4, Lky2;

    .line 27
    .line 28
    check-cast v3, Llh7;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Llp2;

    .line 33
    .line 34
    move-object/from16 v8, p2

    .line 35
    .line 36
    check-cast v8, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    and-int/lit8 v9, v8, 0x3

    .line 43
    .line 44
    const/4 v10, 0x2

    .line 45
    const/4 v11, 0x1

    .line 46
    const/4 v12, 0x0

    .line 47
    if-eq v9, v10, :cond_0

    .line 48
    .line 49
    move v9, v11

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v9, v12

    .line 52
    :goto_0
    and-int/2addr v8, v11

    .line 53
    invoke-virtual {v1, v8, v9}, Llp2;->N(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_9

    .line 58
    .line 59
    iget-object v14, v7, Lp67;->f:Lf76;

    .line 60
    .line 61
    move-object v7, v6

    .line 62
    check-cast v7, Lgn2;

    .line 63
    .line 64
    iget-object v0, v0, Lfm4;->Y:Lza3;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    sget-object v10, Lzz0;->a:Lbe;

    .line 75
    .line 76
    if-nez v8, :cond_1

    .line 77
    .line 78
    if-ne v9, v10, :cond_2

    .line 79
    .line 80
    :cond_1
    new-instance v15, Lal5;

    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const/16 v22, 0xb

    .line 85
    .line 86
    const/16 v16, 0x1

    .line 87
    .line 88
    const-class v18, Lza3;

    .line 89
    .line 90
    const-string v19, "onUiIntent"

    .line 91
    .line 92
    const-string v20, "onUiIntent(Lsu/happ/proxyutility/feature/app_update/IncomingUpdateUiIntent;)V"

    .line 93
    .line 94
    move-object/from16 v17, v0

    .line 95
    .line 96
    invoke-direct/range {v15 .. v22}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v15}, Llp2;->g0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v9, v15

    .line 103
    :cond_2
    check-cast v9, Lpv3;

    .line 104
    .line 105
    move-object v15, v9

    .line 106
    check-cast v15, Lgn2;

    .line 107
    .line 108
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object v8, Lpc;->b:Lox1;

    .line 118
    .line 119
    invoke-virtual {v1, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Landroid/content/Context;

    .line 124
    .line 125
    sget-object v9, Lly2;->a:Lox1;

    .line 126
    .line 127
    invoke-virtual {v1, v9}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    check-cast v9, Lky2;

    .line 132
    .line 133
    filled-new-array {v14, v7, v15, v9}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    invoke-virtual {v1, v14}, Llp2;->h(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v16

    .line 141
    invoke-virtual {v1, v15}, Llp2;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v17

    .line 145
    or-int v16, v16, v17

    .line 146
    .line 147
    invoke-virtual {v1, v7}, Llp2;->f(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v17

    .line 151
    or-int v16, v16, v17

    .line 152
    .line 153
    invoke-virtual {v1, v9}, Llp2;->f(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v17

    .line 157
    or-int v16, v16, v17

    .line 158
    .line 159
    invoke-virtual {v1, v8}, Llp2;->h(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v17

    .line 163
    or-int v16, v16, v17

    .line 164
    .line 165
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    if-nez v16, :cond_3

    .line 170
    .line 171
    if-ne v11, v10, :cond_4

    .line 172
    .line 173
    :cond_3
    move-object v11, v13

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    move-object/from16 v23, v13

    .line 176
    .line 177
    move-object v13, v11

    .line 178
    move-object/from16 v11, v23

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :goto_1
    new-instance v13, Lcf2;

    .line 182
    .line 183
    const/16 v19, 0x0

    .line 184
    .line 185
    const/16 v20, 0x4

    .line 186
    .line 187
    move-object/from16 v16, v7

    .line 188
    .line 189
    move-object/from16 v18, v8

    .line 190
    .line 191
    move-object/from16 v17, v9

    .line 192
    .line 193
    invoke-direct/range {v13 .. v20}, Lcf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v13}, Llp2;->g0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :goto_2
    check-cast v13, Lrn2;

    .line 200
    .line 201
    invoke-static {v11, v13, v1}, Lu70;->k([Ljava/lang/Object;Lrn2;Llp2;)V

    .line 202
    .line 203
    .line 204
    sget-object v7, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 205
    .line 206
    sget-object v8, Lpz2;->Z:Lp50;

    .line 207
    .line 208
    invoke-static {v8, v12}, Lg80;->c(Lp50;Z)Lxr4;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    iget-wide v13, v1, Llp2;->T:J

    .line 213
    .line 214
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    invoke-virtual {v1}, Llp2;->l()Lkl5;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    invoke-static {v1, v7}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    sget-object v13, Luz0;->j:Lpz2;

    .line 227
    .line 228
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Llp2;->Z()V

    .line 232
    .line 233
    .line 234
    iget-boolean v13, v1, Llp2;->S:Z

    .line 235
    .line 236
    if-eqz v13, :cond_5

    .line 237
    .line 238
    invoke-virtual {v1}, Llp2;->k()V

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_5
    invoke-virtual {v1}, Llp2;->j0()V

    .line 243
    .line 244
    .line 245
    :goto_3
    sget-object v13, Lpz2;->B0:Ldx0;

    .line 246
    .line 247
    invoke-static {v13, v1, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object v8, Lpz2;->A0:Ldx0;

    .line 251
    .line 252
    invoke-static {v8, v1, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    sget-object v9, Lpz2;->C0:Ldx0;

    .line 260
    .line 261
    invoke-static {v9, v1, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v1}, Lpn7;->l(Llp2;)V

    .line 265
    .line 266
    .line 267
    sget-object v8, Lpz2;->z0:Ldx0;

    .line 268
    .line 269
    invoke-static {v8, v1, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    sget-object v7, Lpz2;->f0:Lp50;

    .line 273
    .line 274
    sget-object v8, Lhx4;->X:Lhx4;

    .line 275
    .line 276
    invoke-static {v8, v7}, Ll80;->a(Lkx4;Lp50;)Lkx4;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    sget-object v8, Lz91;->d:Lut8;

    .line 281
    .line 282
    invoke-static {v7, v8}, Lz91;->T(Lkx4;Lgn2;)Lkx4;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    const/4 v8, 0x6

    .line 287
    invoke-static {v4, v7, v1, v8}, Lyn0;->g(Lky2;Lkx4;Llp2;I)V

    .line 288
    .line 289
    .line 290
    const/4 v4, 0x1

    .line 291
    invoke-virtual {v1, v4}, Llp2;->p(Z)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v3}, Llh7;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    check-cast v3, Le67;

    .line 299
    .line 300
    iget-boolean v3, v3, Le67;->a:Z

    .line 301
    .line 302
    if-eqz v3, :cond_8

    .line 303
    .line 304
    const v3, -0x1c31b05c

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v3}, Llp2;->W(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    invoke-virtual {v1}, Llp2;->K()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    const/16 v7, 0x8

    .line 319
    .line 320
    if-nez v3, :cond_6

    .line 321
    .line 322
    if-ne v4, v10, :cond_7

    .line 323
    .line 324
    :cond_6
    new-instance v4, Laa3;

    .line 325
    .line 326
    invoke-direct {v4, v6, v7}, Laa3;-><init>(Lpv3;B)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_7
    check-cast v4, Ldn2;

    .line 333
    .line 334
    invoke-static {v0, v4, v5, v1, v7}, Lpu;->c(Lza3;Ldn2;Lo87;Llp2;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v12}, Llp2;->p(Z)V

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_8
    const v0, -0x1c2e0d64

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v0}, Llp2;->W(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v12}, Llp2;->p(Z)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_9
    invoke-virtual {v1}, Llp2;->Q()V

    .line 352
    .line 353
    .line 354
    :goto_4
    return-object v2

    .line 355
    :pswitch_0
    check-cast v7, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 356
    .line 357
    check-cast v6, Lsq6;

    .line 358
    .line 359
    check-cast v5, Lgw5;

    .line 360
    .line 361
    check-cast v4, Ldr2;

    .line 362
    .line 363
    move-object v8, v3

    .line 364
    check-cast v8, Lkr7;

    .line 365
    .line 366
    move-object/from16 v9, p1

    .line 367
    .line 368
    check-cast v9, Llp2;

    .line 369
    .line 370
    move-object/from16 v1, p2

    .line 371
    .line 372
    check-cast v1, Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    const v1, 0x49249

    .line 378
    .line 379
    .line 380
    invoke-static {v1}, Lw79;->P(I)I

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    iget-object v0, v0, Lfm4;->Y:Lza3;

    .line 385
    .line 386
    move-object v3, v6

    .line 387
    move-object v6, v4

    .line 388
    move-object v4, v3

    .line 389
    move-object v3, v7

    .line 390
    move-object v7, v0

    .line 391
    invoke-static/range {v3 .. v10}, Lw39;->e(Lsu/happ/proxyutility/feature/main/MainViewModel;Lsq6;Lgw5;Ldr2;Lza3;Lkr7;Llp2;I)V

    .line 392
    .line 393
    .line 394
    return-object v2

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

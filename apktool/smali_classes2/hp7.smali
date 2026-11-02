.class public final Lhp7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lyg1;

.field public h0:Lxg1;

.field public i0:Lxg1;

.field public j0:Lxg1;

.field public k0:Lxg1;

.field public l0:Ljava/lang/String;

.field public m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

.field public n0:Lj2;

.field public o0:Ljava/lang/String;

.field public p0:Z

.field public q0:B

.field public synthetic r0:Ljava/lang/Object;

.field public final synthetic s0:Lnp7;

.field public final synthetic t0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnp7;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhp7;->s0:Lnp7;

    .line 2
    .line 3
    iput-object p2, p0, Lhp7;->t0:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Lhp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lhp7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lhp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance v0, Lhp7;

    .line 2
    .line 3
    iget-object v1, p0, Lhp7;->s0:Lnp7;

    .line 4
    .line 5
    iget-object p0, p0, Lhp7;->t0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lhp7;-><init>(Lnp7;Ljava/lang/String;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lb71;

    .line 6
    .line 7
    iget-byte v2, v0, Lhp7;->q0:B

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    iget-object v5, v0, Lhp7;->s0:Lnp7;

    .line 12
    .line 13
    iget-object v7, v0, Lhp7;->t0:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    sget-object v8, Lc71;->X:Lc71;

    .line 17
    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v6

    .line 27
    :pswitch_0
    iget-boolean v1, v0, Lhp7;->p0:Z

    .line 28
    .line 29
    iget-object v2, v0, Lhp7;->o0:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, v0, Lhp7;->n0:Lj2;

    .line 32
    .line 33
    iget-object v4, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 34
    .line 35
    iget-object v0, v0, Lhp7;->l0:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v8, v0

    .line 41
    move-object v12, v2

    .line 42
    move-object v11, v3

    .line 43
    move-object/from16 v0, p1

    .line 44
    .line 45
    :goto_0
    move v9, v1

    .line 46
    move-object v10, v4

    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :pswitch_1
    iget-boolean v1, v0, Lhp7;->p0:Z

    .line 50
    .line 51
    iget-object v2, v0, Lhp7;->n0:Lj2;

    .line 52
    .line 53
    iget-object v3, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 54
    .line 55
    iget-object v4, v0, Lhp7;->l0:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v9, v0, Lhp7;->k0:Lxg1;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v10, v4

    .line 63
    move-object v4, v3

    .line 64
    move-object v3, v10

    .line 65
    move-object/from16 v10, p1

    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :pswitch_2
    iget-boolean v1, v0, Lhp7;->p0:Z

    .line 70
    .line 71
    iget-object v2, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 72
    .line 73
    iget-object v3, v0, Lhp7;->l0:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, v0, Lhp7;->k0:Lxg1;

    .line 76
    .line 77
    iget-object v9, v0, Lhp7;->j0:Lxg1;

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v10, v9

    .line 83
    move-object/from16 v9, p1

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :pswitch_3
    iget-object v1, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 88
    .line 89
    iget-object v2, v0, Lhp7;->l0:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v3, v0, Lhp7;->k0:Lxg1;

    .line 92
    .line 93
    iget-object v4, v0, Lhp7;->j0:Lxg1;

    .line 94
    .line 95
    iget-object v9, v0, Lhp7;->i0:Lxg1;

    .line 96
    .line 97
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v10, v4

    .line 101
    move-object v4, v2

    .line 102
    move-object v2, v1

    .line 103
    move-object v1, v3

    .line 104
    move-object/from16 v3, p1

    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :pswitch_4
    iget-object v1, v0, Lhp7;->l0:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v2, v0, Lhp7;->k0:Lxg1;

    .line 111
    .line 112
    iget-object v4, v0, Lhp7;->j0:Lxg1;

    .line 113
    .line 114
    iget-object v9, v0, Lhp7;->i0:Lxg1;

    .line 115
    .line 116
    iget-object v10, v0, Lhp7;->h0:Lxg1;

    .line 117
    .line 118
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object v15, v9

    .line 122
    move-object v9, v4

    .line 123
    move-object/from16 v4, p1

    .line 124
    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :pswitch_5
    iget-object v1, v0, Lhp7;->k0:Lxg1;

    .line 128
    .line 129
    iget-object v2, v0, Lhp7;->j0:Lxg1;

    .line 130
    .line 131
    iget-object v9, v0, Lhp7;->i0:Lxg1;

    .line 132
    .line 133
    iget-object v10, v0, Lhp7;->h0:Lxg1;

    .line 134
    .line 135
    iget-object v11, v0, Lhp7;->g0:Lyg1;

    .line 136
    .line 137
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v15, v9

    .line 141
    move-object/from16 v9, p1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :pswitch_6
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object v2, Ltp1;->a:Lnf1;

    .line 148
    .line 149
    sget-object v2, Lye1;->Z:Lye1;

    .line 150
    .line 151
    new-instance v9, Lgp7;

    .line 152
    .line 153
    const/4 v10, 0x1

    .line 154
    invoke-direct {v9, v7, v6, v10}, Lgp7;-><init>(Ljava/lang/String;Lq51;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v2, v9, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    new-instance v11, Lfp7;

    .line 162
    .line 163
    invoke-direct {v11, v5, v7, v6, v4}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 164
    .line 165
    .line 166
    invoke-static {v1, v2, v11, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    sget-object v12, Ltp1;->a:Lnf1;

    .line 171
    .line 172
    new-instance v13, Lgp7;

    .line 173
    .line 174
    const/4 v14, 0x0

    .line 175
    invoke-direct {v13, v7, v6, v14}, Lgp7;-><init>(Ljava/lang/String;Lq51;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v12, v13, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    new-instance v15, Lfp7;

    .line 183
    .line 184
    invoke-direct {v15, v5, v7, v6, v10}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1, v2, v15, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 188
    .line 189
    .line 190
    move-result-object v15

    .line 191
    new-instance v10, Lfp7;

    .line 192
    .line 193
    invoke-direct {v10, v5, v7, v6, v3}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v2, v10, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    new-instance v10, Lfp7;

    .line 201
    .line 202
    invoke-direct {v10, v5, v7, v6, v14}, Lfp7;-><init>(Lnp7;Ljava/lang/String;Lq51;B)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v12, v10, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iput-object v6, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v11, v0, Lhp7;->g0:Lyg1;

    .line 212
    .line 213
    iput-object v13, v0, Lhp7;->h0:Lxg1;

    .line 214
    .line 215
    iput-object v15, v0, Lhp7;->i0:Lxg1;

    .line 216
    .line 217
    iput-object v2, v0, Lhp7;->j0:Lxg1;

    .line 218
    .line 219
    iput-object v1, v0, Lhp7;->k0:Lxg1;

    .line 220
    .line 221
    const/4 v10, 0x1

    .line 222
    iput-byte v10, v0, Lhp7;->q0:B

    .line 223
    .line 224
    invoke-virtual {v9, v0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    if-ne v9, v8, :cond_0

    .line 229
    .line 230
    goto/16 :goto_7

    .line 231
    .line 232
    :cond_0
    move-object v10, v13

    .line 233
    :goto_1
    check-cast v9, Ljava/lang/String;

    .line 234
    .line 235
    iput-object v6, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v6, v0, Lhp7;->g0:Lyg1;

    .line 238
    .line 239
    iput-object v10, v0, Lhp7;->h0:Lxg1;

    .line 240
    .line 241
    iput-object v15, v0, Lhp7;->i0:Lxg1;

    .line 242
    .line 243
    iput-object v2, v0, Lhp7;->j0:Lxg1;

    .line 244
    .line 245
    iput-object v1, v0, Lhp7;->k0:Lxg1;

    .line 246
    .line 247
    iput-object v9, v0, Lhp7;->l0:Ljava/lang/String;

    .line 248
    .line 249
    iput-byte v4, v0, Lhp7;->q0:B

    .line 250
    .line 251
    invoke-interface {v11, v0}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    if-ne v4, v8, :cond_1

    .line 256
    .line 257
    goto/16 :goto_7

    .line 258
    .line 259
    :cond_1
    move-object/from16 v16, v2

    .line 260
    .line 261
    move-object v2, v1

    .line 262
    move-object v1, v9

    .line 263
    move-object/from16 v9, v16

    .line 264
    .line 265
    :goto_2
    check-cast v4, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 266
    .line 267
    iput-object v6, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v6, v0, Lhp7;->g0:Lyg1;

    .line 270
    .line 271
    iput-object v6, v0, Lhp7;->h0:Lxg1;

    .line 272
    .line 273
    iput-object v15, v0, Lhp7;->i0:Lxg1;

    .line 274
    .line 275
    iput-object v9, v0, Lhp7;->j0:Lxg1;

    .line 276
    .line 277
    iput-object v2, v0, Lhp7;->k0:Lxg1;

    .line 278
    .line 279
    iput-object v1, v0, Lhp7;->l0:Ljava/lang/String;

    .line 280
    .line 281
    iput-object v4, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 282
    .line 283
    iput-byte v3, v0, Lhp7;->q0:B

    .line 284
    .line 285
    invoke-interface {v10, v0}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    if-ne v3, v8, :cond_2

    .line 290
    .line 291
    goto/16 :goto_7

    .line 292
    .line 293
    :cond_2
    move-object v10, v4

    .line 294
    move-object v4, v1

    .line 295
    move-object v1, v2

    .line 296
    move-object v2, v10

    .line 297
    move-object v10, v9

    .line 298
    move-object v9, v15

    .line 299
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    .line 300
    .line 301
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    iput-object v6, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v6, v0, Lhp7;->g0:Lyg1;

    .line 308
    .line 309
    iput-object v6, v0, Lhp7;->h0:Lxg1;

    .line 310
    .line 311
    iput-object v6, v0, Lhp7;->i0:Lxg1;

    .line 312
    .line 313
    iput-object v10, v0, Lhp7;->j0:Lxg1;

    .line 314
    .line 315
    iput-object v1, v0, Lhp7;->k0:Lxg1;

    .line 316
    .line 317
    iput-object v4, v0, Lhp7;->l0:Ljava/lang/String;

    .line 318
    .line 319
    iput-object v2, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 320
    .line 321
    iput-boolean v3, v0, Lhp7;->p0:Z

    .line 322
    .line 323
    const/4 v11, 0x4

    .line 324
    iput-byte v11, v0, Lhp7;->q0:B

    .line 325
    .line 326
    invoke-interface {v9, v0}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    if-ne v9, v8, :cond_3

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_3
    move-object/from16 v16, v4

    .line 334
    .line 335
    move-object v4, v1

    .line 336
    move v1, v3

    .line 337
    move-object/from16 v3, v16

    .line 338
    .line 339
    :goto_4
    check-cast v9, Lj2;

    .line 340
    .line 341
    iput-object v6, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 342
    .line 343
    iput-object v6, v0, Lhp7;->g0:Lyg1;

    .line 344
    .line 345
    iput-object v6, v0, Lhp7;->h0:Lxg1;

    .line 346
    .line 347
    iput-object v6, v0, Lhp7;->i0:Lxg1;

    .line 348
    .line 349
    iput-object v6, v0, Lhp7;->j0:Lxg1;

    .line 350
    .line 351
    iput-object v4, v0, Lhp7;->k0:Lxg1;

    .line 352
    .line 353
    iput-object v3, v0, Lhp7;->l0:Ljava/lang/String;

    .line 354
    .line 355
    iput-object v2, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 356
    .line 357
    iput-object v9, v0, Lhp7;->n0:Lj2;

    .line 358
    .line 359
    iput-boolean v1, v0, Lhp7;->p0:Z

    .line 360
    .line 361
    const/4 v11, 0x5

    .line 362
    iput-byte v11, v0, Lhp7;->q0:B

    .line 363
    .line 364
    invoke-interface {v10, v0}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    if-ne v10, v8, :cond_4

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_4
    move-object/from16 v16, v4

    .line 372
    .line 373
    move-object v4, v2

    .line 374
    move-object v2, v9

    .line 375
    move-object/from16 v9, v16

    .line 376
    .line 377
    :goto_5
    check-cast v10, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 378
    .line 379
    if-eqz v10, :cond_5

    .line 380
    .line 381
    invoke-virtual {v10}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;->c()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v10

    .line 385
    goto :goto_6

    .line 386
    :cond_5
    move-object v10, v6

    .line 387
    :goto_6
    iput-object v6, v0, Lhp7;->r0:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v6, v0, Lhp7;->g0:Lyg1;

    .line 390
    .line 391
    iput-object v6, v0, Lhp7;->h0:Lxg1;

    .line 392
    .line 393
    iput-object v6, v0, Lhp7;->i0:Lxg1;

    .line 394
    .line 395
    iput-object v6, v0, Lhp7;->j0:Lxg1;

    .line 396
    .line 397
    iput-object v6, v0, Lhp7;->k0:Lxg1;

    .line 398
    .line 399
    iput-object v3, v0, Lhp7;->l0:Ljava/lang/String;

    .line 400
    .line 401
    iput-object v4, v0, Lhp7;->m0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 402
    .line 403
    iput-object v2, v0, Lhp7;->n0:Lj2;

    .line 404
    .line 405
    iput-object v10, v0, Lhp7;->o0:Ljava/lang/String;

    .line 406
    .line 407
    iput-boolean v1, v0, Lhp7;->p0:Z

    .line 408
    .line 409
    const/4 v6, 0x6

    .line 410
    iput-byte v6, v0, Lhp7;->q0:B

    .line 411
    .line 412
    invoke-interface {v9, v0}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    if-ne v0, v8, :cond_6

    .line 417
    .line 418
    :goto_7
    return-object v8

    .line 419
    :cond_6
    move-object v11, v2

    .line 420
    move-object v8, v3

    .line 421
    move-object v12, v10

    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 427
    .line 428
    .line 429
    move-result v13

    .line 430
    iget-object v0, v5, Lnp7;->e:Loh7;

    .line 431
    .line 432
    new-instance v6, Lep7;

    .line 433
    .line 434
    invoke-direct/range {v6 .. v13}, Lep7;-><init>(Ljava/lang/String;Ljava/lang/String;ZLsu/happ/proxyutility/domain/routing/entity/SubRoutingState;Lj2;Ljava/lang/String;Z)V

    .line 435
    .line 436
    .line 437
    invoke-static {v0, v6}, Lu15;->S(Loh7;Lgn2;)V

    .line 438
    .line 439
    .line 440
    sget-object v0, Ldn8;->a:Ldn8;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

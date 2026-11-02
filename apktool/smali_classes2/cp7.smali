.class public final Lcp7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lnp7;

.field public final synthetic j0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnp7;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcp7;->i0:Lnp7;

    .line 2
    .line 3
    iput-object p2, p0, Lcp7;->j0:Ljava/lang/String;

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
    invoke-virtual {p0, p2, p1}, Lcp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcp7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lcp7;

    .line 2
    .line 3
    iget-object v1, p0, Lcp7;->i0:Lnp7;

    .line 4
    .line 5
    iget-object p0, p0, Lcp7;->j0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lcp7;-><init>(Lnp7;Ljava/lang/String;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcp7;->i0:Lnp7;

    .line 4
    .line 5
    iget-object v2, v1, Lnp7;->f:Lh76;

    .line 6
    .line 7
    iget-object v3, v1, Lnp7;->e:Loh7;

    .line 8
    .line 9
    iget-object v4, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Lb71;

    .line 12
    .line 13
    iget-byte v5, v0, Lcp7;->g0:B

    .line 14
    .line 15
    const/4 v6, 0x5

    .line 16
    const/4 v7, 0x4

    .line 17
    const/4 v8, 0x3

    .line 18
    const/4 v9, 0x2

    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v11, 0x0

    .line 21
    sget-object v12, Lc71;->X:Lc71;

    .line 22
    .line 23
    if-eqz v5, :cond_3

    .line 24
    .line 25
    if-eq v5, v10, :cond_2

    .line 26
    .line 27
    if-eq v5, v9, :cond_1

    .line 28
    .line 29
    if-eq v5, v8, :cond_1

    .line 30
    .line 31
    if-eq v5, v7, :cond_1

    .line 32
    .line 33
    if-ne v5, v6, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v11

    .line 42
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v5, p1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lnp7;->f()Lmn6;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget-object v13, v2, Lh76;->X:Loh7;

    .line 61
    .line 62
    invoke-virtual {v13}, Loh7;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    check-cast v13, Lqn7;

    .line 67
    .line 68
    iget-object v13, v13, Lqn7;->a:Ljava/lang/String;

    .line 69
    .line 70
    const/4 v14, 0x0

    .line 71
    new-array v14, v14, [Lfn6;

    .line 72
    .line 73
    iput-object v4, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-byte v10, v0, Lcp7;->g0:B

    .line 76
    .line 77
    iget-object v10, v0, Lcp7;->j0:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v5, v10, v13, v14, v0}, Lmn6;->e(Ljava/lang/String;Ljava/lang/String;[Lfn6;Ls51;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-ne v5, v12, :cond_4

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_4
    :goto_1
    check-cast v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 88
    .line 89
    instance-of v10, v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Create;

    .line 90
    .line 91
    if-nez v10, :cond_c

    .line 92
    .line 93
    instance-of v10, v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$Ignored;

    .line 94
    .line 95
    if-eqz v10, :cond_5

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_5
    instance-of v4, v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$EmptyName;

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    iput-object v11, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 104
    .line 105
    iput-byte v8, v0, Lcp7;->g0:B

    .line 106
    .line 107
    sget-object v2, Lun7;->a:Lun7;

    .line 108
    .line 109
    invoke-virtual {v1, v2, v0}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-ne v0, v12, :cond_e

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_6
    instance-of v4, v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$InvalidDeeplink;

    .line 118
    .line 119
    if-nez v4, :cond_a

    .line 120
    .line 121
    instance-of v4, v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$UnknownError;

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    instance-of v4, v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 127
    .line 128
    if-eqz v4, :cond_9

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    :cond_8
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    move-object v13, v4

    .line 138
    check-cast v13, Lqn7;

    .line 139
    .line 140
    const/16 v27, 0x0

    .line 141
    .line 142
    const/16 v28, 0x77ff

    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v16, 0x0

    .line 147
    .line 148
    const/16 v17, 0x0

    .line 149
    .line 150
    const/16 v18, 0x0

    .line 151
    .line 152
    const/16 v19, 0x0

    .line 153
    .line 154
    const/16 v20, 0x0

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const/16 v22, 0x0

    .line 159
    .line 160
    const/16 v23, 0x0

    .line 161
    .line 162
    const/16 v24, 0x0

    .line 163
    .line 164
    const/16 v25, 0x0

    .line 165
    .line 166
    const/16 v26, 0x0

    .line 167
    .line 168
    invoke-static/range {v13 .. v28}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v3, v4, v7}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_8

    .line 177
    .line 178
    new-instance v13, Ltn7;

    .line 179
    .line 180
    check-cast v5, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;

    .line 181
    .line 182
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->e()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->g()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->d()Z

    .line 191
    .line 192
    .line 193
    move-result v18

    .line 194
    iget-object v2, v2, Lh76;->X:Loh7;

    .line 195
    .line 196
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lqn7;

    .line 201
    .line 202
    iget-object v2, v2, Lqn7;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v5}, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile$DuplicatedName;->k()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v17

    .line 208
    move-object/from16 v16, v2

    .line 209
    .line 210
    invoke-direct/range {v13 .. v18}, Ltn7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 211
    .line 212
    .line 213
    iput-object v11, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-byte v6, v0, Lcp7;->g0:B

    .line 216
    .line 217
    invoke-virtual {v1, v13, v0}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-ne v0, v12, :cond_e

    .line 222
    .line 223
    goto/16 :goto_4

    .line 224
    .line 225
    :cond_9
    invoke-static {}, Lb61;->c()V

    .line 226
    .line 227
    .line 228
    return-object v11

    .line 229
    :cond_a
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    :cond_b
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    move-object v13, v2

    .line 237
    check-cast v13, Lqn7;

    .line 238
    .line 239
    const/16 v27, 0x0

    .line 240
    .line 241
    const/16 v28, 0x77ff

    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    const/16 v19, 0x0

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const/16 v22, 0x0

    .line 258
    .line 259
    const/16 v23, 0x0

    .line 260
    .line 261
    const/16 v24, 0x0

    .line 262
    .line 263
    const/16 v25, 0x0

    .line 264
    .line 265
    const/16 v26, 0x0

    .line 266
    .line 267
    invoke-static/range {v13 .. v28}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v3, v2, v4}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_b

    .line 276
    .line 277
    iput-object v11, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 278
    .line 279
    iput-byte v7, v0, Lcp7;->g0:B

    .line 280
    .line 281
    sget-object v2, Lvn7;->a:Lvn7;

    .line 282
    .line 283
    invoke-virtual {v1, v2, v0}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-ne v0, v12, :cond_e

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_c
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    :cond_d
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    move-object v13, v2

    .line 298
    check-cast v13, Lqn7;

    .line 299
    .line 300
    const/16 v27, 0x0

    .line 301
    .line 302
    const/16 v28, 0x77ff

    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    const/16 v16, 0x0

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    const/16 v18, 0x0

    .line 311
    .line 312
    const/16 v19, 0x0

    .line 313
    .line 314
    const/16 v20, 0x0

    .line 315
    .line 316
    const/16 v21, 0x0

    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const/16 v23, 0x0

    .line 321
    .line 322
    const/16 v24, 0x0

    .line 323
    .line 324
    const/16 v25, 0x0

    .line 325
    .line 326
    const/16 v26, 0x0

    .line 327
    .line 328
    invoke-static/range {v13 .. v28}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    invoke-virtual {v3, v2, v5}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-eqz v2, :cond_d

    .line 337
    .line 338
    iput-object v11, v0, Lcp7;->h0:Ljava/lang/Object;

    .line 339
    .line 340
    iput-byte v9, v0, Lcp7;->g0:B

    .line 341
    .line 342
    invoke-virtual {v1, v4, v0}, Lnp7;->j(Lb71;Ls51;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-ne v0, v12, :cond_e

    .line 347
    .line 348
    :goto_4
    return-object v12

    .line 349
    :cond_e
    :goto_5
    sget-object v0, Ldn8;->a:Ldn8;

    .line 350
    .line 351
    return-object v0
.end method

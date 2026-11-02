.class public final Luc7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lba6;

.field public h0:B

.field public final synthetic i0:Lxc7;

.field public final synthetic j0:F

.field public final synthetic k0:Lgn2;

.field public final synthetic l0:Lxx6;


# direct methods
.method public constructor <init>(Lxc7;FLgn2;Lxx6;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luc7;->i0:Lxc7;

    .line 2
    .line 3
    iput p2, p0, Luc7;->j0:F

    .line 4
    .line 5
    iput-object p3, p0, Luc7;->k0:Lgn2;

    .line 6
    .line 7
    iput-object p4, p0, Luc7;->l0:Lxx6;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p2, p1}, Luc7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Luc7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Luc7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Luc7;

    .line 2
    .line 3
    iget-object v3, p0, Luc7;->k0:Lgn2;

    .line 4
    .line 5
    iget-object v4, p0, Luc7;->l0:Lxx6;

    .line 6
    .line 7
    iget-object v1, p0, Luc7;->i0:Lxc7;

    .line 8
    .line 9
    iget v2, p0, Luc7;->j0:F

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Luc7;-><init>(Lxc7;FLgn2;Lxx6;Lq51;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, Luc7;->h0:B

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    const/4 v8, 0x0

    .line 8
    const/4 v9, 0x2

    .line 9
    const/4 v10, 0x1

    .line 10
    iget-object v11, v5, Luc7;->k0:Lgn2;

    .line 11
    .line 12
    iget-object v1, v5, Luc7;->i0:Lxc7;

    .line 13
    .line 14
    sget-object v12, Lc71;->X:Lc71;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    if-eq v0, v10, :cond_1

    .line 19
    .line 20
    if-ne v0, v9, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_1
    iget-object v0, v5, Luc7;->g0:Lba6;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v13, v0

    .line 38
    move-object v0, v1

    .line 39
    move-object/from16 v1, p1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lt9;->b:Lbd1;

    .line 46
    .line 47
    iget v2, v5, Luc7;->j0:F

    .line 48
    .line 49
    invoke-static {v0, v8, v2}, Lz39;->k(Lbd1;FF)F

    .line 50
    .line 51
    .line 52
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    const-string v0, "calculateApproachOffset returned NaN. Please use a valid value."

    .line 59
    .line 60
    invoke-static {v0}, Lzc3;->c(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    new-instance v13, Lba6;

    .line 64
    .line 65
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    mul-float/2addr v2, v0

    .line 77
    iput v2, v13, Lba6;->X:F

    .line 78
    .line 79
    new-instance v0, Ljava/lang/Float;

    .line 80
    .line 81
    invoke-direct {v0, v2}, Ljava/lang/Float;-><init>(F)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v11, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    iget v2, v13, Lba6;->X:F

    .line 88
    .line 89
    new-instance v4, Ltc7;

    .line 90
    .line 91
    invoke-direct {v4, v13, v11, v6}, Ltc7;-><init>(Lba6;Lgn2;B)V

    .line 92
    .line 93
    .line 94
    iput-object v13, v5, Luc7;->g0:Lba6;

    .line 95
    .line 96
    iput-byte v10, v5, Luc7;->h0:B

    .line 97
    .line 98
    move-object v0, v1

    .line 99
    iget-object v1, v5, Luc7;->l0:Lxx6;

    .line 100
    .line 101
    iget v3, v5, Luc7;->j0:F

    .line 102
    .line 103
    invoke-virtual/range {v0 .. v5}, Lxc7;->d(Lxx6;FFLtc7;Ls51;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-ne v1, v12, :cond_4

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_4
    :goto_0
    check-cast v1, Lqk;

    .line 112
    .line 113
    iget-object v2, v0, Lxc7;->a:Llr;

    .line 114
    .line 115
    invoke-virtual {v1}, Lqk;->a()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    iget-object v4, v2, Llr;->Y:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Lla;

    .line 128
    .line 129
    iget-object v14, v4, Lla;->f:Lnh5;

    .line 130
    .line 131
    invoke-virtual {v14}, Lnh5;->l()F

    .line 132
    .line 133
    .line 134
    move-result v15

    .line 135
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    if-eqz v15, :cond_5

    .line 140
    .line 141
    const-string v15, "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"

    .line 142
    .line 143
    invoke-static {v15}, Lzc3;->c(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    invoke-virtual {v14}, Lnh5;->l()F

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    invoke-virtual {v4}, Lla;->b()Lke1;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    iget-object v9, v2, Llr;->Z:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v9, Lgn2;

    .line 157
    .line 158
    iget-object v2, v2, Llr;->f0:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v2, Lo7;

    .line 161
    .line 162
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    .line 163
    .line 164
    .line 165
    move-result v16

    .line 166
    if-nez v16, :cond_12

    .line 167
    .line 168
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 169
    .line 170
    .line 171
    move-result v16

    .line 172
    cmpl-float v16, v16, v8

    .line 173
    .line 174
    if-lez v16, :cond_6

    .line 175
    .line 176
    move/from16 v16, v10

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_6
    move/from16 v16, v6

    .line 180
    .line 181
    :goto_1
    if-eqz v16, :cond_7

    .line 182
    .line 183
    cmpl-float v17, v3, v8

    .line 184
    .line 185
    if-lez v17, :cond_7

    .line 186
    .line 187
    move v7, v10

    .line 188
    goto :goto_2

    .line 189
    :cond_7
    move v7, v6

    .line 190
    :goto_2
    if-nez v16, :cond_8

    .line 191
    .line 192
    invoke-virtual {v15, v14}, Lke1;->a(F)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    goto/16 :goto_6

    .line 200
    .line 201
    :cond_8
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-virtual {v2}, Lo7;->invoke()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    cmpl-float v2, v3, v2

    .line 220
    .line 221
    if-ltz v2, :cond_9

    .line 222
    .line 223
    invoke-virtual {v15, v14, v7}, Lke1;->b(FZ)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_9
    invoke-virtual {v15, v14, v6}, Lke1;->b(FZ)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v15, v2}, Lke1;->c(Ljava/lang/Object;)F

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v15, v14, v10}, Lke1;->b(FZ)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v15, v6}, Lke1;->c(Ljava/lang/Object;)F

    .line 250
    .line 251
    .line 252
    move-result v15

    .line 253
    sub-float v18, v3, v15

    .line 254
    .line 255
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->abs(F)F

    .line 256
    .line 257
    .line 258
    move-result v18

    .line 259
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-interface {v9, v8}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    check-cast v8, Ljava/lang/Number;

    .line 268
    .line 269
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    if-eqz v7, :cond_a

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_a
    move v3, v15

    .line 281
    :goto_3
    sub-float/2addr v3, v14

    .line 282
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    cmpl-float v3, v3, v8

    .line 287
    .line 288
    if-ltz v3, :cond_b

    .line 289
    .line 290
    move v3, v10

    .line 291
    goto :goto_4

    .line 292
    :cond_b
    const/4 v3, 0x0

    .line 293
    :goto_4
    if-ne v3, v10, :cond_c

    .line 294
    .line 295
    if-eqz v7, :cond_e

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_c
    if-nez v3, :cond_11

    .line 299
    .line 300
    if-eqz v7, :cond_d

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_d
    :goto_5
    move-object v2, v6

    .line 304
    :cond_e
    :goto_6
    invoke-virtual {v4}, Lla;->b()Lke1;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v3, v2}, Lke1;->c(Ljava/lang/Object;)F

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    sub-float/2addr v2, v14

    .line 313
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_f

    .line 318
    .line 319
    const-string v3, "calculateSnapOffset returned NaN. Please use a valid value."

    .line 320
    .line 321
    invoke-static {v3}, Lzc3;->c(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_f
    iput v2, v13, Lba6;->X:F

    .line 325
    .line 326
    const/16 v3, 0x1e

    .line 327
    .line 328
    const/4 v4, 0x0

    .line 329
    invoke-static {v1, v4, v4, v3}, Lz68;->u(Lqk;FFI)Lqk;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    iget-object v4, v0, Lxc7;->b:Lpk;

    .line 334
    .line 335
    new-instance v0, Ltc7;

    .line 336
    .line 337
    invoke-direct {v0, v13, v11, v10}, Ltc7;-><init>(Lba6;Lgn2;B)V

    .line 338
    .line 339
    .line 340
    const/4 v1, 0x0

    .line 341
    iput-object v1, v5, Luc7;->g0:Lba6;

    .line 342
    .line 343
    const/4 v1, 0x2

    .line 344
    iput-byte v1, v5, Luc7;->h0:B

    .line 345
    .line 346
    move-object v1, v0

    .line 347
    iget-object v0, v5, Luc7;->l0:Lxx6;

    .line 348
    .line 349
    move-object v5, v1

    .line 350
    move v1, v2

    .line 351
    move-object/from16 v6, p0

    .line 352
    .line 353
    invoke-static/range {v0 .. v6}, Lu70;->v(Lxx6;FFLqk;Lpk;Lgn2;Ls51;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-ne v0, v12, :cond_10

    .line 358
    .line 359
    :goto_7
    return-object v12

    .line 360
    :cond_10
    return-object v0

    .line 361
    :cond_11
    const/4 v1, 0x0

    .line 362
    invoke-static {}, Lb61;->c()V

    .line 363
    .line 364
    .line 365
    return-object v1

    .line 366
    :cond_12
    move-object v1, v7

    .line 367
    const-string v0, "The offset provided to computeTarget must not be NaN."

    .line 368
    .line 369
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-object v1
.end method

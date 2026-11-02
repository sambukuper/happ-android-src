.class public final Lij2;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Z:B

.field public f0:B

.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lij2;->Z:B

    .line 2
    .line 3
    iput-object p1, p0, Lij2;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lij2;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lqj6;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lij2;->Z:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lbz7;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lij2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lij2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lij2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lij2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lij2;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lij2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    iget-byte v0, p0, Lij2;->Z:B

    .line 2
    .line 3
    iget-object v1, p0, Lij2;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lij2;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Lij2;

    .line 11
    .line 12
    check-cast p0, Lbq5;

    .line 13
    .line 14
    check-cast v1, Lea6;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, p0, v1, p1, v2}, Lij2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 18
    .line 19
    .line 20
    iput-object p2, v0, Lij2;->g0:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Lij2;

    .line 24
    .line 25
    check-cast p0, Ls61;

    .line 26
    .line 27
    check-cast v1, Lrn2;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, p0, v1, p1, v2}, Lij2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 31
    .line 32
    .line 33
    iput-object p2, v0, Lij2;->g0:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, Lij2;->Z:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    sget-object v3, Lbq5;->Z:Lbq5;

    .line 8
    .line 9
    iget-object v4, v1, Lij2;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    sget-object v7, Lc71;->X:Lc71;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    iget-object v9, v1, Lij2;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v10, 0x2

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v9, Lea6;

    .line 24
    .line 25
    iget-byte v0, v1, Lij2;->f0:B

    .line 26
    .line 27
    sget-object v11, Lhi4;->a:Lhi4;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    if-eq v0, v8, :cond_1

    .line 32
    .line 33
    if-ne v0, v10, :cond_0

    .line 34
    .line 35
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lbz7;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v5, p1

    .line 43
    .line 44
    move-object v15, v9

    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_0
    invoke-static {v6}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move-object v2, v5

    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lbz7;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v5, p1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lbz7;

    .line 69
    .line 70
    :goto_0
    move-object v5, v4

    .line 71
    check-cast v5, Lbq5;

    .line 72
    .line 73
    iput-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-byte v8, v1, Lij2;->f0:B

    .line 76
    .line 77
    invoke-virtual {v0, v5, v1}, Lbz7;->a(Lbq5;Lr10;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-ne v5, v7, :cond_3

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_3
    :goto_1
    check-cast v5, Laq5;

    .line 85
    .line 86
    iget-object v6, v5, Laq5;->a:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const/4 v14, 0x0

    .line 93
    :goto_2
    if-ge v14, v13, :cond_c

    .line 94
    .line 95
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    check-cast v15, Lhq5;

    .line 100
    .line 101
    invoke-static {v15}, Lvr3;->l(Lhq5;)Z

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    if-nez v15, :cond_b

    .line 106
    .line 107
    iget v5, v5, Laq5;->c:I

    .line 108
    .line 109
    if-ne v5, v10, :cond_4

    .line 110
    .line 111
    sget-object v0, Lji4;->a:Lji4;

    .line 112
    .line 113
    iput-object v0, v9, Lea6;->X:Ljava/lang/Object;

    .line 114
    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :cond_4
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    const/4 v13, 0x0

    .line 122
    :goto_3
    if-ge v13, v5, :cond_7

    .line 123
    .line 124
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    check-cast v14, Lhq5;

    .line 129
    .line 130
    invoke-virtual {v14}, Lhq5;->c()Z

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    if-nez v15, :cond_6

    .line 135
    .line 136
    iget-object v15, v0, Lbz7;->g0:Lcz7;

    .line 137
    .line 138
    move/from16 p1, v13

    .line 139
    .line 140
    iget-wide v12, v15, Lcz7;->z0:J

    .line 141
    .line 142
    move-object v15, v9

    .line 143
    invoke-virtual {v0}, Lbz7;->b()J

    .line 144
    .line 145
    .line 146
    move-result-wide v8

    .line 147
    invoke-static {v14, v12, v13, v8, v9}, Lvr3;->K(Lhq5;JJ)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v8, :cond_5

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    add-int/lit8 v13, p1, 0x1

    .line 155
    .line 156
    move-object v9, v15

    .line 157
    const/4 v8, 0x1

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    move-object v15, v9

    .line 160
    :goto_4
    iput-object v11, v15, Lea6;->X:Ljava/lang/Object;

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_7
    move-object v15, v9

    .line 164
    iput-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 165
    .line 166
    iput-byte v10, v1, Lij2;->f0:B

    .line 167
    .line 168
    invoke-virtual {v0, v3, v1}, Lbz7;->a(Lbq5;Lr10;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    if-ne v5, v7, :cond_8

    .line 173
    .line 174
    :goto_5
    move-object v2, v7

    .line 175
    goto :goto_8

    .line 176
    :cond_8
    :goto_6
    check-cast v5, Laq5;

    .line 177
    .line 178
    iget-object v5, v5, Laq5;->a:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    const/4 v8, 0x0

    .line 185
    :goto_7
    if-ge v8, v6, :cond_a

    .line 186
    .line 187
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    check-cast v9, Lhq5;

    .line 192
    .line 193
    invoke-virtual {v9}, Lhq5;->c()Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_9

    .line 198
    .line 199
    iput-object v11, v15, Lea6;->X:Ljava/lang/Object;

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_a
    move-object v9, v15

    .line 206
    const/4 v8, 0x1

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_b
    move-object v15, v9

    .line 210
    add-int/lit8 v14, v14, 0x1

    .line 211
    .line 212
    const/4 v8, 0x1

    .line 213
    goto :goto_2

    .line 214
    :cond_c
    move-object v15, v9

    .line 215
    new-instance v0, Lii4;

    .line 216
    .line 217
    const/4 v1, 0x0

    .line 218
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, Lhq5;

    .line 223
    .line 224
    invoke-direct {v0, v1}, Lii4;-><init>(Lhq5;)V

    .line 225
    .line 226
    .line 227
    iput-object v0, v15, Lea6;->X:Ljava/lang/Object;

    .line 228
    .line 229
    :goto_8
    return-object v2

    .line 230
    :pswitch_0
    check-cast v4, Ls61;

    .line 231
    .line 232
    iget-byte v0, v1, Lij2;->f0:B

    .line 233
    .line 234
    const/4 v8, 0x3

    .line 235
    if-eqz v0, :cond_10

    .line 236
    .line 237
    const/4 v11, 0x1

    .line 238
    if-eq v0, v11, :cond_f

    .line 239
    .line 240
    if-eq v0, v10, :cond_e

    .line 241
    .line 242
    if-ne v0, v8, :cond_d

    .line 243
    .line 244
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lbz7;

    .line 247
    .line 248
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    move-object v5, v0

    .line 252
    goto :goto_9

    .line 253
    :cond_d
    invoke-static {v6}, Lbt;->i(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    move-object v2, v5

    .line 257
    goto :goto_e

    .line 258
    :cond_e
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 259
    .line 260
    move-object v5, v0

    .line 261
    check-cast v5, Lbz7;

    .line 262
    .line 263
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    .line 265
    .line 266
    :goto_9
    const/4 v11, 0x1

    .line 267
    goto :goto_a

    .line 268
    :catch_0
    move-exception v0

    .line 269
    const/4 v11, 0x1

    .line 270
    goto :goto_c

    .line 271
    :cond_f
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 272
    .line 273
    move-object v5, v0

    .line 274
    check-cast v5, Lbz7;

    .line 275
    .line 276
    :try_start_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 277
    .line 278
    .line 279
    const/4 v11, 0x1

    .line 280
    goto :goto_b

    .line 281
    :cond_10
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v1, Lij2;->g0:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Lbz7;

    .line 287
    .line 288
    move-object v5, v0

    .line 289
    :cond_11
    :goto_a
    invoke-static {v4}, Lu70;->X(Ls61;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_14

    .line 294
    .line 295
    :try_start_2
    move-object v0, v9

    .line 296
    check-cast v0, Lrn2;

    .line 297
    .line 298
    iput-object v5, v1, Lij2;->g0:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 299
    .line 300
    const/4 v11, 0x1

    .line 301
    :try_start_3
    iput-byte v11, v1, Lij2;->f0:B

    .line 302
    .line 303
    invoke-interface {v0, v5, v1}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-ne v0, v7, :cond_12

    .line 308
    .line 309
    goto :goto_d

    .line 310
    :cond_12
    :goto_b
    iput-object v5, v1, Lij2;->g0:Ljava/lang/Object;

    .line 311
    .line 312
    iput-byte v10, v1, Lij2;->f0:B

    .line 313
    .line 314
    invoke-static {v5, v3, v1}, Lmb6;->h(Lbz7;Lbq5;Lr10;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 318
    if-ne v0, v7, :cond_11

    .line 319
    .line 320
    goto :goto_d

    .line 321
    :catch_1
    move-exception v0

    .line 322
    :goto_c
    invoke-static {v4}, Lu70;->X(Ls61;)Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_13

    .line 327
    .line 328
    iput-object v5, v1, Lij2;->g0:Ljava/lang/Object;

    .line 329
    .line 330
    iput-byte v8, v1, Lij2;->f0:B

    .line 331
    .line 332
    invoke-static {v5, v3, v1}, Lmb6;->h(Lbz7;Lbq5;Lr10;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-ne v0, v7, :cond_11

    .line 337
    .line 338
    :goto_d
    move-object v2, v7

    .line 339
    goto :goto_e

    .line 340
    :cond_13
    throw v0

    .line 341
    :cond_14
    :goto_e
    return-object v2

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

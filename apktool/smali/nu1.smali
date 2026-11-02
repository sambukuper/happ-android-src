.class public final Lnu1;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Z:B

.field public f0:B

.field public synthetic g0:Ljava/lang/Object;

.field public h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Lon2;

.field public final synthetic k0:Lon2;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb71;Lgs1;Lv28;Ldt5;Lq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lnu1;->Z:B

    .line 19
    iput-object p1, p0, Lnu1;->i0:Ljava/lang/Object;

    iput-object p2, p0, Lnu1;->j0:Lon2;

    iput-object p3, p0, Lnu1;->k0:Lon2;

    iput-object p4, p0, Lnu1;->l0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lqj6;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lw01;Lm30;Lrn2;Ldn2;Lxo;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lnu1;->Z:B

    .line 3
    .line 4
    iput-object p1, p0, Lnu1;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lnu1;->i0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lnu1;->j0:Lon2;

    .line 9
    .line 10
    iput-object p4, p0, Lnu1;->k0:Lon2;

    .line 11
    .line 12
    iput-object p5, p0, Lnu1;->l0:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Lqj6;-><init>(ILq51;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lnu1;->Z:B

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
    invoke-virtual {p0, p2, p1}, Lnu1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lnu1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lnu1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lnu1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lnu1;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lnu1;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, Lnu1;->Z:B

    .line 2
    .line 3
    iget-object v1, p0, Lnu1;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lnu1;->k0:Lon2;

    .line 6
    .line 7
    iget-object v3, p0, Lnu1;->j0:Lon2;

    .line 8
    .line 9
    iget-object v4, p0, Lnu1;->i0:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v5, Lnu1;

    .line 15
    .line 16
    move-object v6, v4

    .line 17
    check-cast v6, Lb71;

    .line 18
    .line 19
    move-object v7, v3

    .line 20
    check-cast v7, Lgs1;

    .line 21
    .line 22
    move-object v8, v2

    .line 23
    check-cast v8, Lv28;

    .line 24
    .line 25
    move-object v9, v1

    .line 26
    check-cast v9, Ldt5;

    .line 27
    .line 28
    move-object v10, p1

    .line 29
    invoke-direct/range {v5 .. v10}, Lnu1;-><init>(Lb71;Lgs1;Lv28;Ldt5;Lq51;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, v5, Lnu1;->g0:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v5

    .line 35
    :pswitch_0
    move-object v10, p1

    .line 36
    new-instance v6, Lnu1;

    .line 37
    .line 38
    iget-object p0, p0, Lnu1;->h0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v7, p0

    .line 41
    check-cast v7, Lw01;

    .line 42
    .line 43
    move-object v8, v4

    .line 44
    check-cast v8, Lm30;

    .line 45
    .line 46
    move-object v9, v3

    .line 47
    check-cast v9, Lrn2;

    .line 48
    .line 49
    check-cast v2, Ldn2;

    .line 50
    .line 51
    move-object v11, v1

    .line 52
    check-cast v11, Lxo;

    .line 53
    .line 54
    move-object v12, v10

    .line 55
    move-object v10, v2

    .line 56
    invoke-direct/range {v6 .. v12}, Lnu1;-><init>(Lw01;Lm30;Lrn2;Ldn2;Lxo;Lq51;)V

    .line 57
    .line 58
    .line 59
    iput-object p2, v6, Lnu1;->g0:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v6

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-byte v0, v7, Lnu1;->Z:B

    .line 4
    .line 5
    iget-object v1, v7, Lnu1;->k0:Lon2;

    .line 6
    .line 7
    iget-object v2, v7, Lnu1;->j0:Lon2;

    .line 8
    .line 9
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v8, Lc71;->X:Lc71;

    .line 12
    .line 13
    iget-object v4, v7, Lnu1;->l0:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    iget-object v6, v7, Lnu1;->i0:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v9, Ldn8;->a:Ldn8;

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x1

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v6, Lb71;

    .line 27
    .line 28
    move-object v15, v4

    .line 29
    check-cast v15, Ldt5;

    .line 30
    .line 31
    iget-byte v0, v7, Lnu1;->f0:B

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-eq v0, v12, :cond_1

    .line 37
    .line 38
    if-ne v0, v5, :cond_0

    .line 39
    .line 40
    iget-object v0, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lbm3;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v3, p1

    .line 48
    .line 49
    move-object v2, v4

    .line 50
    goto :goto_2

    .line 51
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v8, v11

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    iget-object v0, v7, Lnu1;->h0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Log7;

    .line 60
    .line 61
    iget-object v3, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Lbz7;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v11, p1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v3, v0

    .line 77
    check-cast v3, Lbz7;

    .line 78
    .line 79
    new-instance v0, Lk18;

    .line 80
    .line 81
    invoke-direct {v0, v15, v4, v10}, Lk18;-><init>(Ldt5;Lq51;B)V

    .line 82
    .line 83
    .line 84
    sget-object v11, Le71;->f0:Le71;

    .line 85
    .line 86
    invoke-static {v6, v4, v11, v0, v12}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v3, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v0, v7, Lnu1;->h0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-byte v12, v7, Lnu1;->f0:B

    .line 95
    .line 96
    const/4 v11, 0x3

    .line 97
    invoke-static {v3, v7, v11}, Lq18;->b(Lbz7;Lr10;I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    if-ne v11, v8, :cond_3

    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_3
    :goto_0
    move-object/from16 v16, v11

    .line 106
    .line 107
    check-cast v16, Lhq5;

    .line 108
    .line 109
    invoke-virtual/range {v16 .. v16}, Lhq5;->a()V

    .line 110
    .line 111
    .line 112
    move-object v14, v2

    .line 113
    check-cast v14, Lgs1;

    .line 114
    .line 115
    sget-object v2, Lq18;->a:Liv1;

    .line 116
    .line 117
    if-eq v14, v2, :cond_4

    .line 118
    .line 119
    new-instance v13, Lqk4;

    .line 120
    .line 121
    const/16 v18, 0x15

    .line 122
    .line 123
    move-object/from16 v17, v4

    .line 124
    .line 125
    invoke-direct/range {v13 .. v18}, Lqk4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v2, v17

    .line 129
    .line 130
    invoke-static {v6, v0, v13}, Lq18;->f(Lb71;Lbm3;Lrn2;)Log7;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    move-object v2, v4

    .line 135
    :goto_1
    iput-object v0, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v2, v7, Lnu1;->h0:Ljava/lang/Object;

    .line 138
    .line 139
    iput-byte v5, v7, Lnu1;->f0:B

    .line 140
    .line 141
    sget-object v4, Lbq5;->Y:Lbq5;

    .line 142
    .line 143
    invoke-static {v3, v4, v7}, Lq18;->i(Lbz7;Lbq5;Lr10;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-ne v3, v8, :cond_5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    :goto_2
    check-cast v3, Lhq5;

    .line 151
    .line 152
    if-nez v3, :cond_6

    .line 153
    .line 154
    new-instance v1, Lj18;

    .line 155
    .line 156
    invoke-direct {v1, v15, v2, v10}, Lj18;-><init>(Ldt5;Lq51;B)V

    .line 157
    .line 158
    .line 159
    invoke-static {v6, v0, v1}, Lq18;->f(Lb71;Lbm3;Lrn2;)Log7;

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    invoke-virtual {v3}, Lhq5;->a()V

    .line 164
    .line 165
    .line 166
    new-instance v4, Lj18;

    .line 167
    .line 168
    invoke-direct {v4, v15, v2, v12}, Lj18;-><init>(Ldt5;Lq51;B)V

    .line 169
    .line 170
    .line 171
    invoke-static {v6, v0, v4}, Lq18;->f(Lb71;Lbm3;Lrn2;)Log7;

    .line 172
    .line 173
    .line 174
    check-cast v1, Lv28;

    .line 175
    .line 176
    iget-wide v2, v3, Lhq5;->c:J

    .line 177
    .line 178
    iget-object v0, v1, Lv28;->Y:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La23;

    .line 181
    .line 182
    iget-object v4, v1, Lv28;->Z:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v4, Lr68;

    .line 185
    .line 186
    iget-object v1, v1, Lv28;->f0:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Ls48;

    .line 189
    .line 190
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    iget-boolean v0, v4, Lr68;->i:Z

    .line 194
    .line 195
    iget-object v5, v4, Lr68;->b:Ly78;

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    iget-boolean v0, v4, Lr68;->h:Z

    .line 200
    .line 201
    if-eqz v0, :cond_8

    .line 202
    .line 203
    invoke-interface {v1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    iget-object v0, v4, Lr68;->a:Lkd8;

    .line 207
    .line 208
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Lh48;->length()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-lez v0, :cond_7

    .line 217
    .line 218
    invoke-virtual {v4, v12}, Lr68;->x(Z)V

    .line 219
    .line 220
    .line 221
    :cond_7
    sget-object v0, Ls88;->X:Ls88;

    .line 222
    .line 223
    invoke-virtual {v4, v0}, Lr68;->y(Ls88;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5, v2, v3}, Ly78;->a(J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v0

    .line 230
    invoke-static {v5, v0, v1}, Lys7;->c(Ly78;J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v0

    .line 234
    invoke-virtual {v4, v0, v1}, Lr68;->v(J)Z

    .line 235
    .line 236
    .line 237
    :cond_8
    :goto_3
    move-object v8, v9

    .line 238
    :goto_4
    return-object v8

    .line 239
    :pswitch_0
    iget-byte v0, v7, Lnu1;->f0:B

    .line 240
    .line 241
    if-eqz v0, :cond_b

    .line 242
    .line 243
    if-eq v0, v12, :cond_a

    .line 244
    .line 245
    if-ne v0, v5, :cond_9

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_9
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    move-object v8, v11

    .line 255
    goto :goto_7

    .line 256
    :cond_a
    iget-object v0, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lbz7;

    .line 259
    .line 260
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    move-object/from16 v3, p1

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iget-object v0, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Lbz7;

    .line 272
    .line 273
    iput-object v0, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 274
    .line 275
    iput-byte v12, v7, Lnu1;->f0:B

    .line 276
    .line 277
    sget-object v3, Lbq5;->X:Lbq5;

    .line 278
    .line 279
    invoke-static {v0, v10, v3, v7}, Lq18;->a(Lbz7;ZLbq5;Lr10;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    if-ne v3, v8, :cond_c

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_c
    :goto_5
    check-cast v3, Lhq5;

    .line 287
    .line 288
    iget-object v10, v7, Lnu1;->h0:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v10, Lw01;

    .line 291
    .line 292
    check-cast v6, Lm30;

    .line 293
    .line 294
    check-cast v2, Lrn2;

    .line 295
    .line 296
    check-cast v1, Ldn2;

    .line 297
    .line 298
    check-cast v4, Lxo;

    .line 299
    .line 300
    iput-object v11, v7, Lnu1;->g0:Ljava/lang/Object;

    .line 301
    .line 302
    iput-byte v5, v7, Lnu1;->f0:B

    .line 303
    .line 304
    move-object v5, v1

    .line 305
    move-object v1, v3

    .line 306
    move-object v3, v6

    .line 307
    move-object v6, v4

    .line 308
    move-object v4, v2

    .line 309
    move-object v2, v10

    .line 310
    invoke-static/range {v0 .. v7}, Lqu1;->h(Lbz7;Lhq5;Lw01;Lm30;Lrn2;Ldn2;Lxo;Lr10;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-ne v0, v8, :cond_d

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_d
    :goto_6
    move-object v8, v9

    .line 318
    :goto_7
    return-object v8

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

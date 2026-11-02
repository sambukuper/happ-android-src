.class public final Lrd;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Z:B

.field public f0:B

.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lrd;->Z:B

    .line 2
    .line 3
    iput-object p1, p0, Lrd;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lqj6;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lrd;->Z:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lv27;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lrd;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lrd;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lrd;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lbz7;

    .line 24
    .line 25
    check-cast p2, Lq51;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lrd;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lrd;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lrd;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lbz7;

    .line 39
    .line 40
    check-cast p2, Lq51;

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Lrd;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lrd;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lrd;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lrd;->Z:B

    .line 2
    .line 3
    iget-object p0, p0, Lrd;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lrd;

    .line 9
    .line 10
    check-cast p0, Landroid/view/View;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lrd;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 14
    .line 15
    .line 16
    iput-object p2, v0, Lrd;->g0:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lrd;

    .line 20
    .line 21
    check-cast p0, Lgn2;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, p1, v1}, Lrd;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v0, Lrd;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, Lrd;

    .line 31
    .line 32
    check-cast p0, Ltd;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p0, p1, v1}, Lrd;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 36
    .line 37
    .line 38
    iput-object p2, v0, Lrd;->g0:Ljava/lang/Object;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lrd;->Z:B

    .line 2
    .line 3
    sget-object v1, Lbq5;->Y:Lbq5;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lc71;->X:Lc71;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, p0, Lrd;->h0:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v7, Ldn8;->a:Ldn8;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v6, Landroid/view/View;

    .line 20
    .line 21
    iget-byte v0, p0, Lrd;->f0:B

    .line 22
    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    if-eq v0, v5, :cond_2

    .line 26
    .line 27
    if-ne v0, v4, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v3, v7

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object v3, v8

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lv27;

    .line 42
    .line 43
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    instance-of p1, v6, Landroid/view/ViewGroup;

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    check-cast v6, Landroid/view/ViewGroup;

    .line 51
    .line 52
    iput-object v8, p0, Lrd;->g0:Ljava/lang/Object;

    .line 53
    .line 54
    iput-byte v4, p0, Lrd;->f0:B

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance p1, Lld8;

    .line 60
    .line 61
    new-instance v1, Lw1;

    .line 62
    .line 63
    const/4 v2, 0x7

    .line 64
    invoke-direct {v1, v6, v2}, Lw1;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, v1}, Lld8;-><init>(Lw1;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p1, Lld8;->Y:Ljava/util/Iterator;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    move-object p0, v7

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iput-object p1, v0, Lv27;->Z:Ljava/util/Iterator;

    .line 81
    .line 82
    iput-byte v4, v0, Lv27;->X:B

    .line 83
    .line 84
    iput-object p0, v0, Lv27;->f0:Lq51;

    .line 85
    .line 86
    move-object p0, v3

    .line 87
    :goto_0
    if-ne p0, v3, :cond_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lrd;->g0:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Lv27;

    .line 96
    .line 97
    iput-object p1, p0, Lrd;->g0:Ljava/lang/Object;

    .line 98
    .line 99
    iput-byte v5, p0, Lrd;->f0:B

    .line 100
    .line 101
    invoke-virtual {p1, p0, v6}, Lv27;->b(Lq51;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    return-object v3

    .line 105
    :pswitch_0
    iget-byte v0, p0, Lrd;->f0:B

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    if-eq v0, v5, :cond_6

    .line 110
    .line 111
    if-ne v0, v4, :cond_5

    .line 112
    .line 113
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    move-object v3, v8

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    iget-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lbz7;

    .line 125
    .line 126
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lrd;->g0:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v0, p1

    .line 136
    check-cast v0, Lbz7;

    .line 137
    .line 138
    iput-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 139
    .line 140
    iput-byte v5, p0, Lrd;->f0:B

    .line 141
    .line 142
    invoke-static {v0, p0}, Loc;->f(Lbz7;Lr10;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v3, :cond_8

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    :goto_2
    check-cast p1, Lhq5;

    .line 150
    .line 151
    invoke-virtual {p1}, Lhq5;->a()V

    .line 152
    .line 153
    .line 154
    check-cast v6, Lgn2;

    .line 155
    .line 156
    iget-wide v9, p1, Lhq5;->c:J

    .line 157
    .line 158
    new-instance p1, Lz85;

    .line 159
    .line 160
    invoke-direct {p1, v9, v10}, Lz85;-><init>(J)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v6, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    iput-object v8, p0, Lrd;->g0:Ljava/lang/Object;

    .line 167
    .line 168
    iput-byte v4, p0, Lrd;->f0:B

    .line 169
    .line 170
    invoke-static {v0, v1, p0}, Lq18;->i(Lbz7;Lbq5;Lr10;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, v3, :cond_9

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    :goto_3
    check-cast p1, Lhq5;

    .line 178
    .line 179
    if-eqz p1, :cond_a

    .line 180
    .line 181
    invoke-virtual {p1}, Lhq5;->a()V

    .line 182
    .line 183
    .line 184
    :cond_a
    move-object v3, v7

    .line 185
    :goto_4
    return-object v3

    .line 186
    :pswitch_1
    check-cast v6, Ltd;

    .line 187
    .line 188
    iget-byte v0, p0, Lrd;->f0:B

    .line 189
    .line 190
    if-eqz v0, :cond_d

    .line 191
    .line 192
    if-eq v0, v5, :cond_c

    .line 193
    .line 194
    if-ne v0, v4, :cond_b

    .line 195
    .line 196
    iget-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lbz7;

    .line 199
    .line 200
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_b
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    move-object v3, v8

    .line 208
    goto/16 :goto_a

    .line 209
    .line 210
    :cond_c
    iget-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lbz7;

    .line 213
    .line 214
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_d
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lrd;->g0:Ljava/lang/Object;

    .line 222
    .line 223
    move-object v0, p1

    .line 224
    check-cast v0, Lbz7;

    .line 225
    .line 226
    iput-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 227
    .line 228
    iput-byte v5, p0, Lrd;->f0:B

    .line 229
    .line 230
    invoke-static {v0, p0, v4}, Lq18;->b(Lbz7;Lr10;I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v3, :cond_e

    .line 235
    .line 236
    goto/16 :goto_a

    .line 237
    .line 238
    :cond_e
    :goto_5
    check-cast p1, Lhq5;

    .line 239
    .line 240
    iget-wide v9, p1, Lhq5;->a:J

    .line 241
    .line 242
    iput-wide v9, v6, Ltd;->h:J

    .line 243
    .line 244
    iget-wide v9, p1, Lhq5;->c:J

    .line 245
    .line 246
    iput-wide v9, v6, Ltd;->b:J

    .line 247
    .line 248
    :cond_f
    iput-object v0, p0, Lrd;->g0:Ljava/lang/Object;

    .line 249
    .line 250
    iput-byte v4, p0, Lrd;->f0:B

    .line 251
    .line 252
    invoke-virtual {v0, v1, p0}, Lbz7;->a(Lbq5;Lr10;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-ne p1, v3, :cond_10

    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_10
    :goto_6
    check-cast p1, Laq5;

    .line 260
    .line 261
    iget-object p1, p1, Laq5;->a:Ljava/util/List;

    .line 262
    .line 263
    new-instance v2, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    const/4 v9, 0x0

    .line 277
    move v10, v9

    .line 278
    :goto_7
    if-ge v10, v5, :cond_12

    .line 279
    .line 280
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    move-object v12, v11

    .line 285
    check-cast v12, Lhq5;

    .line 286
    .line 287
    iget-boolean v12, v12, Lhq5;->d:Z

    .line 288
    .line 289
    if-eqz v12, :cond_11

    .line 290
    .line 291
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    :cond_11
    add-int/lit8 v10, v10, 0x1

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    :goto_8
    if-ge v9, p1, :cond_14

    .line 302
    .line 303
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    move-object v10, v5

    .line 308
    check-cast v10, Lhq5;

    .line 309
    .line 310
    iget-wide v10, v10, Lhq5;->a:J

    .line 311
    .line 312
    iget-wide v12, v6, Ltd;->h:J

    .line 313
    .line 314
    invoke-static {v10, v11, v12, v13}, Ljm4;->w(JJ)Z

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    if-eqz v10, :cond_13

    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_13
    add-int/lit8 v9, v9, 0x1

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_14
    move-object v5, v8

    .line 325
    :goto_9
    check-cast v5, Lhq5;

    .line 326
    .line 327
    if-nez v5, :cond_15

    .line 328
    .line 329
    invoke-static {v2}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    move-object v5, p1

    .line 334
    check-cast v5, Lhq5;

    .line 335
    .line 336
    :cond_15
    if-eqz v5, :cond_16

    .line 337
    .line 338
    iget-wide v9, v5, Lhq5;->a:J

    .line 339
    .line 340
    iput-wide v9, v6, Ltd;->h:J

    .line 341
    .line 342
    iget-wide v9, v5, Lhq5;->c:J

    .line 343
    .line 344
    iput-wide v9, v6, Ltd;->b:J

    .line 345
    .line 346
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    if-eqz p1, :cond_f

    .line 351
    .line 352
    const-wide/16 p0, -0x1

    .line 353
    .line 354
    iput-wide p0, v6, Ltd;->h:J

    .line 355
    .line 356
    move-object v3, v7

    .line 357
    :goto_a
    return-object v3

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

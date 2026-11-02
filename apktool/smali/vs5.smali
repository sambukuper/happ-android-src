.class public final Lvs5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lo64;


# instance fields
.field public final X:I

.field public final Y:Lf63;

.field public final Z:Lgn2;

.field public f0:Lq31;

.field public g0:Lup7;

.field public h0:La44;

.field public i0:Z

.field public j0:Z

.field public k0:Z

.field public l0:Ljava/lang/Object;

.field public m0:Z

.field public n0:Lus5;

.field public o0:Z

.field public p0:J

.field public q0:J

.field public r0:J

.field public s0:Z

.field public final synthetic t0:Lsa2;


# direct methods
.method public constructor <init>(Lsa2;ILf63;Luh3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvs5;->t0:Lsa2;

    .line 5
    .line 6
    iput p2, p0, Lvs5;->X:I

    .line 7
    .line 8
    iput-object p3, p0, Lvs5;->Y:Lf63;

    .line 9
    .line 10
    iput-object p4, p0, Lvs5;->Z:Lgn2;

    .line 11
    .line 12
    invoke-static {}, Lyx4;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iput-wide p1, p0, Lvs5;->r0:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lvs5;->h0:La44;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-byte v2, v0, La44;->a:B

    .line 7
    .line 8
    packed-switch v2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La44;->b()Lt34;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lt34;->f:Lmj5;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    :goto_0
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v0, La44;->b:Lb44;

    .line 24
    .line 25
    iget-object v0, v0, La44;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Lb44;->g(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :pswitch_0
    iput-object v1, p0, Lvs5;->h0:La44;

    .line 31
    .line 32
    iget-object v0, p0, Lvs5;->g0:Lup7;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Lup7;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v1, p0, Lvs5;->g0:Lup7;

    .line 40
    .line 41
    iput-object v1, p0, Lvs5;->n0:Lus5;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ldg;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lvs5;->t0:Lsa2;

    .line 2
    .line 3
    iget-boolean v0, v0, Lsa2;->b:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Lvs5;->o0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v0, "compose:lazy:prefetch:execute:urgent"

    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0, p1}, Lvs5;->c(Ldg;)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Lvs5;->c(Ldg;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    :goto_0
    const-string p1, "compose:lazy:prefetch:execute:item"

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    invoke-static {v0, v1, p1}, Lwa;->O(JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return p0
.end method

.method public final c(Ldg;)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvs5;->X:I

    .line 4
    .line 5
    int-to-long v2, v1

    .line 6
    const-string v4, "compose:lazy:prefetch:execute:item"

    .line 7
    .line 8
    invoke-static {v2, v3, v4}, Lwa;->O(JLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v5, v0, Lvs5;->t0:Lsa2;

    .line 12
    .line 13
    iget-object v5, v5, Lsa2;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Lf64;

    .line 16
    .line 17
    iget-object v5, v5, Lf64;->b:Leh;

    .line 18
    .line 19
    invoke-virtual {v5}, Leh;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lz64;

    .line 24
    .line 25
    iget-boolean v6, v0, Lvs5;->j0:Z

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_28

    .line 29
    .line 30
    invoke-virtual {v5}, Lz64;->c()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ltz v1, :cond_28

    .line 35
    .line 36
    if-ge v1, v6, :cond_28

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Lz64;->d(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v8, v0, Lvs5;->l0:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v8, :cond_0

    .line 45
    .line 46
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-nez v8, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Lvs5;->a()V

    .line 53
    .line 54
    .line 55
    return v7

    .line 56
    :cond_0
    invoke-virtual {v5, v1}, Lz64;->b(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v5, v0, Lvs5;->Y:Lf63;

    .line 61
    .line 62
    iget-object v8, v5, Lf63;->f0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Lyz;

    .line 65
    .line 66
    iget-object v9, v5, Lf63;->Z:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v10, -0x1

    .line 69
    if-ne v9, v1, :cond_1

    .line 70
    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v8, v5, Lf63;->Y:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Ls05;

    .line 77
    .line 78
    invoke-virtual {v8, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    new-instance v9, Lyz;

    .line 85
    .line 86
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput v10, v9, Lyz;->e:I

    .line 90
    .line 91
    invoke-virtual {v8, v1, v9}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v8, v9

    .line 95
    check-cast v8, Lyz;

    .line 96
    .line 97
    iput-object v1, v5, Lf63;->Z:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v8, v5, Lf63;->f0:Ljava/lang/Object;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v0}, Lvs5;->d()Z

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, Ldg;->a()J

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    iput-wide v11, v0, Lvs5;->p0:J

    .line 109
    .line 110
    invoke-static {}, Lyx4;->a()J

    .line 111
    .line 112
    .line 113
    move-result-wide v13

    .line 114
    iput-wide v13, v0, Lvs5;->r0:J

    .line 115
    .line 116
    const-wide/16 v13, 0x0

    .line 117
    .line 118
    iput-wide v13, v0, Lvs5;->q0:J

    .line 119
    .line 120
    const-string v5, "compose:lazy:prefetch:available_time_nanos"

    .line 121
    .line 122
    invoke-static {v11, v12, v5}, Lwa;->O(JLjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lvs5;->d()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_5

    .line 130
    .line 131
    iget-wide v11, v0, Lvs5;->p0:J

    .line 132
    .line 133
    move-wide v15, v13

    .line 134
    iget-wide v13, v8, Lyz;->a:J

    .line 135
    .line 136
    iget-wide v9, v8, Lyz;->b:J

    .line 137
    .line 138
    add-long/2addr v13, v9

    .line 139
    invoke-virtual {v0, v11, v12, v13, v14}, Lvs5;->f(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eqz v9, :cond_3

    .line 144
    .line 145
    const-string v9, "compose:lazy:prefetch:compose"

    .line 146
    .line 147
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :try_start_0
    invoke-virtual {v0, v6, v1, v8}, Lvs5;->e(Ljava/lang/Object;Ljava/lang/Object;Lyz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lvs5;->d()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_6

    .line 167
    .line 168
    :cond_4
    const/16 v17, 0x1

    .line 169
    .line 170
    goto/16 :goto_11

    .line 171
    .line 172
    :cond_5
    move-wide v15, v13

    .line 173
    :cond_6
    iget-object v1, v0, Lvs5;->h0:La44;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    if-eqz v1, :cond_9

    .line 177
    .line 178
    iget-wide v9, v0, Lvs5;->p0:J

    .line 179
    .line 180
    iget-wide v11, v8, Lyz;->c:J

    .line 181
    .line 182
    invoke-virtual {v0, v9, v10, v11, v12}, Lvs5;->f(JJ)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_4

    .line 187
    .line 188
    const-string v1, "compose:lazy:prefetch:apply"

    .line 189
    .line 190
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :try_start_1
    iget-object v1, v0, Lvs5;->h0:La44;

    .line 194
    .line 195
    if-eqz v1, :cond_8

    .line 196
    .line 197
    iget-byte v9, v1, La44;->a:B

    .line 198
    .line 199
    packed-switch v9, :pswitch_data_0

    .line 200
    .line 201
    .line 202
    iget-object v9, v1, La44;->b:Lb44;

    .line 203
    .line 204
    invoke-virtual {v1}, La44;->b()Lt34;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    if-eqz v10, :cond_7

    .line 209
    .line 210
    invoke-virtual {v9, v10, v7}, Lb44;->c(Lt34;Z)V

    .line 211
    .line 212
    .line 213
    :cond_7
    iget-object v1, v1, La44;->c:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-virtual {v9, v1}, Lb44;->e(Ljava/lang/Object;)Lup7;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    goto :goto_2

    .line 220
    :pswitch_0
    iget-object v9, v1, La44;->b:Lb44;

    .line 221
    .line 222
    iget-object v1, v1, La44;->c:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-virtual {v9, v1}, Lb44;->e(Ljava/lang/Object;)Lup7;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    :goto_2
    iput-object v1, v0, Lvs5;->g0:Lup7;

    .line 229
    .line 230
    iput-object v6, v0, Lvs5;->h0:La44;

    .line 231
    .line 232
    const/4 v1, 0x1

    .line 233
    iput-boolean v1, v0, Lvs5;->k0:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    .line 235
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lvs5;->h()V

    .line 239
    .line 240
    .line 241
    iget-wide v9, v0, Lvs5;->q0:J

    .line 242
    .line 243
    iget-wide v11, v8, Lyz;->c:J

    .line 244
    .line 245
    invoke-static {v9, v10, v11, v12}, Lyz;->a(JJ)J

    .line 246
    .line 247
    .line 248
    move-result-wide v9

    .line 249
    iput-wide v9, v8, Lyz;->c:J

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_8
    :try_start_2
    const-string v0, "Nothing to apply!"

    .line 253
    .line 254
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 255
    .line 256
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 262
    .line 263
    .line 264
    throw v0

    .line 265
    :cond_9
    :goto_3
    iget-boolean v1, v0, Lvs5;->m0:Z

    .line 266
    .line 267
    const/4 v9, 0x4

    .line 268
    if-nez v1, :cond_c

    .line 269
    .line 270
    iget-wide v10, v0, Lvs5;->p0:J

    .line 271
    .line 272
    cmp-long v1, v10, v15

    .line 273
    .line 274
    if-lez v1, :cond_4

    .line 275
    .line 276
    const-string v1, "compose:lazy:prefetch:resolve-nested"

    .line 277
    .line 278
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :try_start_3
    iget-object v1, v0, Lvs5;->g0:Lup7;

    .line 282
    .line 283
    if-eqz v1, :cond_b

    .line 284
    .line 285
    new-instance v10, Lea6;

    .line 286
    .line 287
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 288
    .line 289
    .line 290
    new-instance v11, Lnb;

    .line 291
    .line 292
    invoke-direct {v11, v10, v9}, Lnb;-><init>(Lea6;B)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v1, v11}, Lup7;->b(Lnb;)V

    .line 296
    .line 297
    .line 298
    iget-object v1, v10, Lea6;->X:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v1, Ljava/util/List;

    .line 301
    .line 302
    if-eqz v1, :cond_a

    .line 303
    .line 304
    new-instance v10, Lus5;

    .line 305
    .line 306
    invoke-direct {v10, v0, v1}, Lus5;-><init>(Lvs5;Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_a
    move-object v10, v6

    .line 311
    :goto_4
    iput-object v10, v0, Lvs5;->n0:Lus5;

    .line 312
    .line 313
    const/4 v1, 0x1

    .line 314
    iput-boolean v1, v0, Lvs5;->m0:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 315
    .line 316
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 317
    .line 318
    .line 319
    goto :goto_6

    .line 320
    :catchall_2
    move-exception v0

    .line 321
    goto :goto_5

    .line 322
    :cond_b
    :try_start_4
    const-string v0, "Should precompose before resolving nested prefetch states"

    .line 323
    .line 324
    invoke-static {v0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 329
    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 330
    .line 331
    .line 332
    throw v0

    .line 333
    :cond_c
    :goto_6
    iget-object v1, v0, Lvs5;->n0:Lus5;

    .line 334
    .line 335
    if-eqz v1, :cond_d

    .line 336
    .line 337
    iget v10, v8, Lyz;->e:I

    .line 338
    .line 339
    iget-boolean v11, v0, Lvs5;->o0:Z

    .line 340
    .line 341
    iget-object v12, v1, Lus5;->e:Ljava/io/Serializable;

    .line 342
    .line 343
    check-cast v12, [Ljava/util/List;

    .line 344
    .line 345
    iget v13, v1, Lus5;->a:I

    .line 346
    .line 347
    iget-object v14, v1, Lus5;->d:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v14, Ljava/util/List;

    .line 350
    .line 351
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-lt v13, v5, :cond_e

    .line 356
    .line 357
    :cond_d
    move/from16 v19, v9

    .line 358
    .line 359
    goto/16 :goto_f

    .line 360
    .line 361
    :cond_e
    iget-object v5, v1, Lus5;->f:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v5, Lvs5;

    .line 364
    .line 365
    iget-boolean v5, v5, Lvs5;->j0:Z

    .line 366
    .line 367
    if-eqz v5, :cond_f

    .line 368
    .line 369
    const-string v5, "Should not execute nested prefetch on canceled request"

    .line 370
    .line 371
    invoke-static {v5}, Lzc3;->c(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :cond_f
    const-string v5, "compose:lazy:prefetch:update_nested_prefetch_count"

    .line 375
    .line 376
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :try_start_5
    invoke-interface {v14}, Ljava/util/Collection;->size()I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    move v13, v7

    .line 384
    :goto_7
    if-ge v13, v5, :cond_10

    .line 385
    .line 386
    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v18

    .line 390
    move/from16 v19, v9

    .line 391
    .line 392
    move-object/from16 v9, v18

    .line 393
    .line 394
    check-cast v9, Lp64;

    .line 395
    .line 396
    iput v10, v9, Lp64;->d:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 397
    .line 398
    add-int/lit8 v13, v13, 0x1

    .line 399
    .line 400
    move/from16 v9, v19

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_10
    move/from16 v19, v9

    .line 404
    .line 405
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 406
    .line 407
    .line 408
    const-string v5, "compose:lazy:prefetch:nested"

    .line 409
    .line 410
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :goto_8
    :try_start_6
    iget v5, v1, Lus5;->a:I

    .line 414
    .line 415
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    if-ge v5, v9, :cond_1b

    .line 420
    .line 421
    iget v5, v1, Lus5;->a:I

    .line 422
    .line 423
    aget-object v5, v12, v5

    .line 424
    .line 425
    if-nez v5, :cond_16

    .line 426
    .line 427
    invoke-virtual/range {p1 .. p1}, Ldg;->a()J

    .line 428
    .line 429
    .line 430
    move-result-wide v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 431
    cmp-long v5, v9, v15

    .line 432
    .line 433
    if-gtz v5, :cond_11

    .line 434
    .line 435
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 436
    .line 437
    .line 438
    const/16 v17, 0x1

    .line 439
    .line 440
    return v17

    .line 441
    :cond_11
    :try_start_7
    iget v9, v1, Lus5;->a:I

    .line 442
    .line 443
    invoke-interface {v14, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    move-object v10, v5

    .line 448
    check-cast v10, Lp64;

    .line 449
    .line 450
    iget-object v5, v10, Lp64;->a:Lqb;

    .line 451
    .line 452
    iget v13, v10, Lp64;->d:I

    .line 453
    .line 454
    new-instance v15, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    iget v5, v5, Lqb;->Y:I

    .line 460
    .line 461
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    if-eqz v7, :cond_12

    .line 466
    .line 467
    invoke-virtual {v7}, Ldd7;->e()Lgn2;

    .line 468
    .line 469
    .line 470
    move-result-object v18

    .line 471
    move-object/from16 v6, v18

    .line 472
    .line 473
    :cond_12
    move/from16 v20, v5

    .line 474
    .line 475
    invoke-static {v7}, Lyn0;->P(Ldd7;)Ldd7;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-static {v7, v5, v6}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 480
    .line 481
    .line 482
    const/4 v5, -0x1

    .line 483
    if-ne v13, v5, :cond_13

    .line 484
    .line 485
    const/4 v13, 0x2

    .line 486
    :cond_13
    const/4 v6, 0x0

    .line 487
    :goto_9
    if-ge v6, v13, :cond_15

    .line 488
    .line 489
    add-int v7, v20, v6

    .line 490
    .line 491
    iget-object v5, v10, Lp64;->c:Lsa2;

    .line 492
    .line 493
    if-nez v5, :cond_14

    .line 494
    .line 495
    move/from16 v21, v6

    .line 496
    .line 497
    move/from16 v22, v9

    .line 498
    .line 499
    move/from16 v23, v11

    .line 500
    .line 501
    const/4 v11, 0x0

    .line 502
    goto :goto_a

    .line 503
    :cond_14
    move/from16 v21, v6

    .line 504
    .line 505
    iget-object v6, v10, Lp64;->b:Lf63;

    .line 506
    .line 507
    move/from16 v22, v9

    .line 508
    .line 509
    new-instance v9, Lvs5;

    .line 510
    .line 511
    move/from16 v23, v11

    .line 512
    .line 513
    const/4 v11, 0x0

    .line 514
    invoke-direct {v9, v5, v7, v6, v11}, Lvs5;-><init>(Lsa2;ILf63;Luh3;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    :goto_a
    add-int/lit8 v6, v21, 0x1

    .line 521
    .line 522
    move/from16 v9, v22

    .line 523
    .line 524
    move/from16 v11, v23

    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_15
    move/from16 v22, v9

    .line 528
    .line 529
    move/from16 v23, v11

    .line 530
    .line 531
    const/4 v11, 0x0

    .line 532
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    iput v5, v10, Lp64;->f:I

    .line 537
    .line 538
    aput-object v15, v12, v22

    .line 539
    .line 540
    goto :goto_b

    .line 541
    :cond_16
    move/from16 v23, v11

    .line 542
    .line 543
    move-object v11, v6

    .line 544
    :goto_b
    iget v5, v1, Lus5;->a:I

    .line 545
    .line 546
    aget-object v5, v12, v5

    .line 547
    .line 548
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    :goto_c
    iget v6, v1, Lus5;->b:I

    .line 552
    .line 553
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    if-ge v6, v7, :cond_1a

    .line 558
    .line 559
    iget v6, v1, Lus5;->b:I

    .line 560
    .line 561
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    check-cast v6, Lvs5;

    .line 566
    .line 567
    if-eqz v23, :cond_18

    .line 568
    .line 569
    if-eqz v6, :cond_17

    .line 570
    .line 571
    move-object v7, v6

    .line 572
    goto :goto_d

    .line 573
    :cond_17
    move-object v7, v11

    .line 574
    :goto_d
    if-eqz v7, :cond_18

    .line 575
    .line 576
    const/4 v9, 0x1

    .line 577
    iput-boolean v9, v7, Lvs5;->o0:Z

    .line 578
    .line 579
    goto :goto_e

    .line 580
    :cond_18
    const/4 v9, 0x1

    .line 581
    :goto_e
    iput-boolean v9, v1, Lus5;->c:Z

    .line 582
    .line 583
    move-object/from16 v7, p1

    .line 584
    .line 585
    invoke-virtual {v6, v7}, Lvs5;->b(Ldg;)Z

    .line 586
    .line 587
    .line 588
    move-result v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 589
    if-eqz v6, :cond_19

    .line 590
    .line 591
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 592
    .line 593
    .line 594
    return v9

    .line 595
    :cond_19
    :try_start_8
    iget v6, v1, Lus5;->b:I

    .line 596
    .line 597
    add-int/2addr v6, v9

    .line 598
    iput v6, v1, Lus5;->b:I

    .line 599
    .line 600
    goto :goto_c

    .line 601
    :cond_1a
    move-object/from16 v7, p1

    .line 602
    .line 603
    const/4 v5, 0x0

    .line 604
    iput v5, v1, Lus5;->b:I

    .line 605
    .line 606
    iget v5, v1, Lus5;->a:I

    .line 607
    .line 608
    const/16 v17, 0x1

    .line 609
    .line 610
    add-int/lit8 v5, v5, 0x1

    .line 611
    .line 612
    iput v5, v1, Lus5;->a:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 613
    .line 614
    move-object v6, v11

    .line 615
    move/from16 v11, v23

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const-wide/16 v15, 0x0

    .line 619
    .line 620
    goto/16 :goto_8

    .line 621
    .line 622
    :cond_1b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 623
    .line 624
    .line 625
    goto :goto_f

    .line 626
    :catchall_3
    move-exception v0

    .line 627
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 628
    .line 629
    .line 630
    throw v0

    .line 631
    :catchall_4
    move-exception v0

    .line 632
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 633
    .line 634
    .line 635
    throw v0

    .line 636
    :goto_f
    iget-object v1, v0, Lvs5;->n0:Lus5;

    .line 637
    .line 638
    if-eqz v1, :cond_1c

    .line 639
    .line 640
    iget-boolean v1, v1, Lus5;->c:Z

    .line 641
    .line 642
    const/4 v9, 0x1

    .line 643
    if-ne v1, v9, :cond_1c

    .line 644
    .line 645
    invoke-virtual {v0}, Lvs5;->h()V

    .line 646
    .line 647
    .line 648
    invoke-static {v2, v3, v4}, Lwa;->O(JLjava/lang/String;)V

    .line 649
    .line 650
    .line 651
    iget-object v1, v0, Lvs5;->n0:Lus5;

    .line 652
    .line 653
    if-eqz v1, :cond_1c

    .line 654
    .line 655
    const/4 v5, 0x0

    .line 656
    iput-boolean v5, v1, Lus5;->c:Z

    .line 657
    .line 658
    :cond_1c
    iget-object v1, v0, Lvs5;->f0:Lq31;

    .line 659
    .line 660
    iget-boolean v2, v0, Lvs5;->i0:Z

    .line 661
    .line 662
    if-nez v2, :cond_21

    .line 663
    .line 664
    if-eqz v1, :cond_21

    .line 665
    .line 666
    iget-wide v2, v0, Lvs5;->p0:J

    .line 667
    .line 668
    iget-wide v4, v8, Lyz;->d:J

    .line 669
    .line 670
    invoke-virtual {v0, v2, v3, v4, v5}, Lvs5;->f(JJ)Z

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    if-eqz v2, :cond_4

    .line 675
    .line 676
    const-string v2, "compose:lazy:prefetch:measure"

    .line 677
    .line 678
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    :try_start_9
    iget-wide v1, v1, Lq31;->a:J

    .line 682
    .line 683
    iget-boolean v3, v0, Lvs5;->j0:Z

    .line 684
    .line 685
    if-eqz v3, :cond_1d

    .line 686
    .line 687
    const-string v3, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 688
    .line 689
    invoke-static {v3}, Lzc3;->a(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    :cond_1d
    iget-boolean v3, v0, Lvs5;->i0:Z

    .line 693
    .line 694
    if-eqz v3, :cond_1e

    .line 695
    .line 696
    const-string v3, "Request was already measured!"

    .line 697
    .line 698
    invoke-static {v3}, Lzc3;->a(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    :cond_1e
    const/4 v9, 0x1

    .line 702
    iput-boolean v9, v0, Lvs5;->i0:Z

    .line 703
    .line 704
    iget-object v3, v0, Lvs5;->g0:Lup7;

    .line 705
    .line 706
    if-eqz v3, :cond_20

    .line 707
    .line 708
    invoke-interface {v3}, Lup7;->c()I

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    const/4 v5, 0x0

    .line 713
    :goto_10
    if-ge v5, v4, :cond_1f

    .line 714
    .line 715
    invoke-interface {v3, v5, v1, v2}, Lup7;->d(IJ)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 716
    .line 717
    .line 718
    add-int/lit8 v5, v5, 0x1

    .line 719
    .line 720
    goto :goto_10

    .line 721
    :cond_1f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0}, Lvs5;->h()V

    .line 725
    .line 726
    .line 727
    iget-wide v1, v0, Lvs5;->q0:J

    .line 728
    .line 729
    iget-wide v3, v8, Lyz;->d:J

    .line 730
    .line 731
    invoke-static {v1, v2, v3, v4}, Lyz;->a(JJ)J

    .line 732
    .line 733
    .line 734
    move-result-wide v1

    .line 735
    iput-wide v1, v8, Lyz;->d:J

    .line 736
    .line 737
    iget-object v1, v0, Lvs5;->Z:Lgn2;

    .line 738
    .line 739
    if-eqz v1, :cond_21

    .line 740
    .line 741
    invoke-interface {v1, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    goto :goto_12

    .line 745
    :cond_20
    :try_start_a
    const-string v0, "performComposition() must be called before performMeasure()"

    .line 746
    .line 747
    invoke-static {v0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 752
    :catchall_5
    move-exception v0

    .line 753
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 754
    .line 755
    .line 756
    throw v0

    .line 757
    :goto_11
    return v17

    .line 758
    :cond_21
    :goto_12
    iget-object v1, v0, Lvs5;->n0:Lus5;

    .line 759
    .line 760
    iget-boolean v2, v0, Lvs5;->i0:Z

    .line 761
    .line 762
    if-eqz v2, :cond_27

    .line 763
    .line 764
    iget-boolean v0, v0, Lvs5;->m0:Z

    .line 765
    .line 766
    if-eqz v0, :cond_27

    .line 767
    .line 768
    if-eqz v1, :cond_27

    .line 769
    .line 770
    iget-object v0, v1, Lus5;->d:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, Ljava/util/List;

    .line 773
    .line 774
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 775
    .line 776
    .line 777
    move-result v1

    .line 778
    const v2, 0x7fffffff

    .line 779
    .line 780
    .line 781
    move v3, v2

    .line 782
    const/4 v5, 0x0

    .line 783
    :goto_13
    if-ge v5, v1, :cond_22

    .line 784
    .line 785
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    check-cast v4, Lp64;

    .line 790
    .line 791
    iget v4, v4, Lp64;->e:I

    .line 792
    .line 793
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 794
    .line 795
    .line 796
    move-result v3

    .line 797
    add-int/lit8 v5, v5, 0x1

    .line 798
    .line 799
    goto :goto_13

    .line 800
    :cond_22
    if-ne v3, v2, :cond_23

    .line 801
    .line 802
    const/4 v5, 0x0

    .line 803
    goto :goto_14

    .line 804
    :cond_23
    move v5, v3

    .line 805
    :goto_14
    iget v1, v8, Lyz;->e:I

    .line 806
    .line 807
    const/4 v3, -0x1

    .line 808
    if-ne v1, v3, :cond_24

    .line 809
    .line 810
    move v1, v5

    .line 811
    goto :goto_15

    .line 812
    :cond_24
    mul-int/lit8 v1, v1, 0x3

    .line 813
    .line 814
    add-int/2addr v1, v5

    .line 815
    div-int/lit8 v1, v1, 0x4

    .line 816
    .line 817
    :goto_15
    iput v1, v8, Lyz;->e:I

    .line 818
    .line 819
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 820
    .line 821
    .line 822
    move-result v1

    .line 823
    move v4, v2

    .line 824
    const/4 v3, 0x0

    .line 825
    :goto_16
    if-ge v3, v1, :cond_25

    .line 826
    .line 827
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v6

    .line 831
    check-cast v6, Lp64;

    .line 832
    .line 833
    iget v6, v6, Lp64;->f:I

    .line 834
    .line 835
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 836
    .line 837
    .line 838
    move-result v4

    .line 839
    add-int/lit8 v3, v3, 0x1

    .line 840
    .line 841
    goto :goto_16

    .line 842
    :cond_25
    if-ne v4, v2, :cond_26

    .line 843
    .line 844
    const/4 v4, 0x0

    .line 845
    :cond_26
    if-ge v4, v5, :cond_27

    .line 846
    .line 847
    const-wide/16 v0, 0x0

    .line 848
    .line 849
    iput-wide v0, v8, Lyz;->d:J

    .line 850
    .line 851
    const/16 v16, 0x0

    .line 852
    .line 853
    return v16

    .line 854
    :cond_27
    const/16 v16, 0x0

    .line 855
    .line 856
    return v16

    .line 857
    :cond_28
    move/from16 v16, v7

    .line 858
    .line 859
    invoke-virtual {v0}, Lvs5;->a()V

    .line 860
    .line 861
    .line 862
    return v16

    .line 863
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvs5;->j0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lvs5;->j0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lvs5;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lvs5;->k0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lvs5;->h0:La44;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, La44;->c()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    return v1
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;Lyz;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lvs5;->h0:La44;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lvs5;->t0:Lsa2;

    .line 7
    .line 8
    iget-object v2, v0, Lsa2;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lf64;

    .line 11
    .line 12
    iget v3, p0, Lvs5;->X:I

    .line 13
    .line 14
    invoke-virtual {v2, v3, p1, p2}, Lf64;->a(ILjava/lang/Object;Ljava/lang/Object;)Lrn2;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v0, v0, Lsa2;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lvp7;

    .line 21
    .line 22
    invoke-virtual {v0}, Lvp7;->a()Lb44;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, v0, Lb44;->X:Landroidx/compose/ui/node/LayoutNode;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    new-instance p2, La44;

    .line 35
    .line 36
    invoke-direct {p2, v0, p1, v1}, La44;-><init>(Lb44;Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object v0, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v2, 0x1

    .line 42
    invoke-virtual {v0, p1, p2, v2}, Lb44;->k(Ljava/lang/Object;Lrn2;Z)V

    .line 43
    .line 44
    .line 45
    new-instance p2, La44;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1, v2}, La44;-><init>(Lb44;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iput-object v0, p0, Lvs5;->h0:La44;

    .line 52
    .line 53
    iput-object p1, p0, Lvs5;->l0:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_1
    iput-boolean v1, p0, Lvs5;->s0:Z

    .line 56
    .line 57
    :cond_2
    :goto_2
    :pswitch_0
    invoke-virtual {v0}, La44;->c()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_5

    .line 62
    .line 63
    iget-boolean p1, p0, Lvs5;->s0:Z

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    new-instance p1, Ljn0;

    .line 68
    .line 69
    const/4 p2, 0x7

    .line 70
    invoke-direct {p1, p0, p3, p2}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    iget-byte p2, v0, La44;->a:B

    .line 74
    .line 75
    packed-switch p2, :pswitch_data_0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, La44;->b()Lt34;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const/4 v1, 0x0

    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    iget-object v2, p2, Lt34;->f:Lmj5;

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    move-object v2, v1

    .line 89
    :goto_3
    if-eqz v2, :cond_2

    .line 90
    .line 91
    invoke-virtual {v2}, Lmj5;->c()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_2

    .line 96
    .line 97
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    invoke-virtual {v3}, Ldd7;->e()Lgn2;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :cond_4
    invoke-static {v3}, Lyn0;->P(Ldd7;)Ldd7;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    :try_start_0
    invoke-virtual {v2, p1}, Lmj5;->e(Lu87;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-static {v3, v4, v1}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception p0

    .line 119
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 123
    :catchall_1
    move-exception p0

    .line 124
    invoke-static {v3, v4, v1}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 125
    .line 126
    .line 127
    throw p0

    .line 128
    :cond_5
    invoke-virtual {p0}, Lvs5;->h()V

    .line 129
    .line 130
    .line 131
    iget-boolean p1, p0, Lvs5;->s0:Z

    .line 132
    .line 133
    iget-wide v0, p0, Lvs5;->q0:J

    .line 134
    .line 135
    if-eqz p1, :cond_6

    .line 136
    .line 137
    iget-wide p0, p3, Lyz;->b:J

    .line 138
    .line 139
    invoke-static {v0, v1, p0, p1}, Lyz;->a(JJ)J

    .line 140
    .line 141
    .line 142
    move-result-wide p0

    .line 143
    iput-wide p0, p3, Lyz;->b:J

    .line 144
    .line 145
    return-void

    .line 146
    :cond_6
    iget-wide p0, p3, Lyz;->a:J

    .line 147
    .line 148
    invoke-static {v0, v1, p0, p1}, Lyz;->a(JJ)J

    .line 149
    .line 150
    .line 151
    move-result-wide p0

    .line 152
    iput-wide p0, p3, Lyz;->a:J

    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(JJ)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lvs5;->o0:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, 0x0

    .line 6
    .line 7
    :cond_0
    cmp-long p0, p1, p3

    .line 8
    .line 9
    if-lez p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lvs5;->o0:Z

    .line 3
    .line 4
    return-void
.end method

.method public final h()V
    .locals 8

    .line 1
    invoke-static {}, Lyx4;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lvs5;->r0:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Lka8;->c(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    const/4 v4, 0x1

    .line 12
    shr-long v5, v2, v4

    .line 13
    .line 14
    sget-object v7, Lgx1;->Y:Lbe;

    .line 15
    .line 16
    long-to-int v2, v2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide v2, 0x8637bd05af6L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v2, v5, v2

    .line 27
    .line 28
    if-lez v2, :cond_1

    .line 29
    .line 30
    const-wide v5, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-wide v2, -0x8637bd05af6L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v2, v5, v2

    .line 42
    .line 43
    if-gez v2, :cond_2

    .line 44
    .line 45
    const-wide/high16 v5, -0x8000000000000000L

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-wide/32 v2, 0xf4240

    .line 49
    .line 50
    .line 51
    mul-long/2addr v5, v2

    .line 52
    :goto_0
    iput-wide v5, p0, Lvs5;->q0:J

    .line 53
    .line 54
    iget-wide v2, p0, Lvs5;->p0:J

    .line 55
    .line 56
    sub-long/2addr v2, v5

    .line 57
    iput-wide v2, p0, Lvs5;->p0:J

    .line 58
    .line 59
    iput-wide v0, p0, Lvs5;->r0:J

    .line 60
    .line 61
    const-string p0, "compose:lazy:prefetch:available_time_nanos"

    .line 62
    .line 63
    invoke-static {v2, v3, p0}, Lwa;->O(JLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lvs5;->f0:Lq31;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvs5;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-boolean v2, p0, Lvs5;->i0:Z

    .line 8
    .line 9
    iget-boolean v3, p0, Lvs5;->j0:Z

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v5, "HandleAndRequestImpl { index = "

    .line 14
    .line 15
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget p0, p0, Lvs5;->X:I

    .line 19
    .line 20
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ", constraints = "

    .line 24
    .line 25
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", isComposed = "

    .line 32
    .line 33
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ", isMeasured = "

    .line 40
    .line 41
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, ", isCanceled = "

    .line 48
    .line 49
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, " }"

    .line 53
    .line 54
    invoke-static {v4, v3, p0}, Lp61;->o(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

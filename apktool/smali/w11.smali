.class public final Lw11;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lt11;


# instance fields
.field public final X:Lsq5;

.field public final Y:Lsq5;

.field public final Z:Ljava/lang/ThreadLocal;

.field public final f0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g0:J


# direct methods
.method public constructor <init>(Ldq;)V
    .locals 3

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lw11;->Z:Ljava/lang/ThreadLocal;

    .line 71
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lw11;->f0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    sget-object v0, Lgx1;->Y:Lbe;

    const/16 v0, 0x1e

    sget-object v1, Llx1;->f0:Llx1;

    invoke-static {v0, v1}, Lvj8;->l0(ILlx1;)J

    move-result-wide v0

    iput-wide v0, p0, Lw11;->g0:J

    .line 73
    new-instance v0, Lsq5;

    new-instance v1, Lo7;

    const/16 v2, 0x18

    invoke-direct {v1, p1, v2}, Lo7;-><init>(Ljava/lang/Object;B)V

    const/4 p1, 0x1

    invoke-direct {v0, p1, v1}, Lsq5;-><init>(ILdn2;)V

    iput-object v0, p0, Lw11;->X:Lsq5;

    .line 74
    iput-object v0, p0, Lw11;->Y:Lsq5;

    return-void
.end method

.method public constructor <init>(Ldq;Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lw11;->Z:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lw11;->f0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    sget-object v0, Lgx1;->Y:Lbe;

    .line 23
    .line 24
    const/16 v0, 0x1e

    .line 25
    .line 26
    sget-object v2, Llx1;->f0:Llx1;

    .line 27
    .line 28
    invoke-static {v0, v2}, Lvj8;->l0(ILlx1;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iput-wide v2, p0, Lw11;->g0:J

    .line 33
    .line 34
    if-lez p3, :cond_0

    .line 35
    .line 36
    new-instance v0, Lsq5;

    .line 37
    .line 38
    new-instance v2, Lu11;

    .line 39
    .line 40
    invoke-direct {v2, p1, p2, v1}, Lu11;-><init>(Ldq;Ljava/lang/String;B)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, p3, v2}, Lsq5;-><init>(ILdn2;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lw11;->X:Lsq5;

    .line 47
    .line 48
    new-instance p3, Lsq5;

    .line 49
    .line 50
    new-instance v0, Lu11;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, p1, p2, v1}, Lu11;-><init>(Ldq;Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p3, v1, v0}, Lsq5;-><init>(ILdn2;)V

    .line 57
    .line 58
    .line 59
    iput-object p3, p0, Lw11;->Y:Lsq5;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "Maximum number of readers must be greater than 0"

    .line 63
    .line 64
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method


# virtual methods
.method public final E(ZLrn2;Ls51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    instance-of v4, v0, Lv11;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lv11;

    .line 15
    .line 16
    iget v5, v4, Lv11;->o0:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lv11;->o0:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lv11;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, Lv11;-><init>(Lw11;Ls51;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v5, v4, Ls51;->Y:Ls61;

    .line 34
    .line 35
    iget-object v0, v4, Lv11;->m0:Ljava/lang/Object;

    .line 36
    .line 37
    iget v6, v4, Lv11;->o0:I

    .line 38
    .line 39
    const-string v7, "ROLLBACK TRANSACTION"

    .line 40
    .line 41
    const/4 v9, 0x4

    .line 42
    const/4 v10, 0x3

    .line 43
    const/4 v11, 0x2

    .line 44
    const/4 v12, 0x1

    .line 45
    const/4 v13, 0x0

    .line 46
    sget-object v14, Lc71;->X:Lc71;

    .line 47
    .line 48
    if-eqz v6, :cond_5

    .line 49
    .line 50
    if-eq v6, v12, :cond_4

    .line 51
    .line 52
    if-eq v6, v11, :cond_3

    .line 53
    .line 54
    if-eq v6, v10, :cond_2

    .line 55
    .line 56
    if-ne v6, v9, :cond_1

    .line 57
    .line 58
    iget-object v1, v4, Lv11;->g0:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast v1, Lea6;

    .line 61
    .line 62
    iget-object v2, v4, Lv11;->f0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lsq5;

    .line 65
    .line 66
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto/16 :goto_c

    .line 70
    .line 71
    :catchall_0
    move-exception v0

    .line 72
    move-object v11, v1

    .line 73
    :goto_1
    move-object v1, v0

    .line 74
    goto/16 :goto_d

    .line 75
    .line 76
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v13

    .line 82
    :cond_2
    iget-boolean v1, v4, Lv11;->l0:Z

    .line 83
    .line 84
    iget-object v2, v4, Lv11;->k0:Lea6;

    .line 85
    .line 86
    iget-object v5, v4, Lv11;->j0:Ls61;

    .line 87
    .line 88
    iget-object v3, v4, Lv11;->i0:Lea6;

    .line 89
    .line 90
    iget-object v6, v4, Lv11;->h0:Lsq5;

    .line 91
    .line 92
    iget-object v10, v4, Lv11;->g0:Ljava/io/Serializable;

    .line 93
    .line 94
    check-cast v10, Lrn2;

    .line 95
    .line 96
    iget-object v11, v4, Lv11;->f0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v11, Lw11;

    .line 99
    .line 100
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    move-object v15, v2

    .line 104
    move v2, v1

    .line 105
    move-object v1, v11

    .line 106
    move-object v11, v3

    .line 107
    move-object v3, v10

    .line 108
    goto/16 :goto_6

    .line 109
    .line 110
    :catchall_1
    move-exception v0

    .line 111
    move-object v15, v2

    .line 112
    move v2, v1

    .line 113
    move-object v1, v11

    .line 114
    move-object v11, v3

    .line 115
    move-object v3, v10

    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_4
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v1, Lw11;->f0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_1b

    .line 136
    .line 137
    iget-object v0, v1, Lw11;->Z:Ljava/lang/ThreadLocal;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, Lbr5;

    .line 144
    .line 145
    sget-object v15, Ls11;->Y:Lbe;

    .line 146
    .line 147
    if-nez v6, :cond_7

    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-interface {v5, v15}, Ls61;->H0(Lr61;)Lq61;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ls11;

    .line 157
    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    iget-object v6, v6, Ls11;->X:Lbr5;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_6
    move-object v6, v13

    .line 164
    :cond_7
    :goto_2
    if-eqz v6, :cond_d

    .line 165
    .line 166
    if-nez v2, :cond_9

    .line 167
    .line 168
    iget-boolean v1, v6, Lbr5;->b:Z

    .line 169
    .line 170
    if-nez v1, :cond_8

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 174
    .line 175
    invoke-static {v12, v0}, Lnr4;->T(ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v13

    .line 179
    :cond_9
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-interface {v5, v15}, Ls61;->H0(Lr61;)Lq61;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez v1, :cond_b

    .line 187
    .line 188
    new-instance v1, Ls11;

    .line 189
    .line 190
    invoke-direct {v1, v6}, Ls11;-><init>(Lbr5;)V

    .line 191
    .line 192
    .line 193
    new-instance v2, Li98;

    .line 194
    .line 195
    invoke-direct {v2, v6, v0}, Li98;-><init>(Lbr5;Ljava/lang/ThreadLocal;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v2}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v1, Lq0;

    .line 203
    .line 204
    const/16 v2, 0xf

    .line 205
    .line 206
    invoke-direct {v1, v3, v6, v13, v2}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 207
    .line 208
    .line 209
    iput v12, v4, Lv11;->o0:I

    .line 210
    .line 211
    invoke-static {v0, v1, v4}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-ne v0, v14, :cond_a

    .line 216
    .line 217
    goto/16 :goto_b

    .line 218
    .line 219
    :cond_a
    return-object v0

    .line 220
    :cond_b
    iput v11, v4, Lv11;->o0:I

    .line 221
    .line 222
    invoke-interface {v3, v6, v4}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v14, :cond_c

    .line 227
    .line 228
    goto/16 :goto_b

    .line 229
    .line 230
    :cond_c
    return-object v0

    .line 231
    :cond_d
    if-eqz v2, :cond_e

    .line 232
    .line 233
    iget-object v0, v1, Lw11;->X:Lsq5;

    .line 234
    .line 235
    :goto_4
    move-object v6, v0

    .line 236
    goto :goto_5

    .line 237
    :cond_e
    iget-object v0, v1, Lw11;->Y:Lsq5;

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :goto_5
    new-instance v11, Lea6;

    .line 241
    .line 242
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 243
    .line 244
    .line 245
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v15, Lea6;

    .line 249
    .line 250
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 251
    .line 252
    .line 253
    :try_start_3
    iget-wide v8, v1, Lw11;->g0:J

    .line 254
    .line 255
    new-instance v0, Lr0;

    .line 256
    .line 257
    const/16 v12, 0xb

    .line 258
    .line 259
    invoke-direct {v0, v15, v6, v13, v12}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 260
    .line 261
    .line 262
    iput-object v1, v4, Lv11;->f0:Ljava/lang/Object;

    .line 263
    .line 264
    move-object v12, v3

    .line 265
    check-cast v12, Ljava/io/Serializable;

    .line 266
    .line 267
    iput-object v12, v4, Lv11;->g0:Ljava/io/Serializable;

    .line 268
    .line 269
    iput-object v6, v4, Lv11;->h0:Lsq5;

    .line 270
    .line 271
    iput-object v11, v4, Lv11;->i0:Lea6;

    .line 272
    .line 273
    iput-object v5, v4, Lv11;->j0:Ls61;

    .line 274
    .line 275
    iput-object v15, v4, Lv11;->k0:Lea6;

    .line 276
    .line 277
    iput-boolean v2, v4, Lv11;->l0:Z

    .line 278
    .line 279
    iput v10, v4, Lv11;->o0:I

    .line 280
    .line 281
    invoke-static {v8, v9}, Lu70;->s0(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v8

    .line 285
    const-wide/16 v16, 0x0

    .line 286
    .line 287
    cmp-long v10, v8, v16

    .line 288
    .line 289
    if-lez v10, :cond_10

    .line 290
    .line 291
    new-instance v10, Lva8;

    .line 292
    .line 293
    invoke-direct {v10, v8, v9, v4}, Lva8;-><init>(JLs51;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v10, v0}, La28;->t(Lva8;Lrn2;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-ne v0, v14, :cond_f

    .line 301
    .line 302
    goto/16 :goto_b

    .line 303
    .line 304
    :cond_f
    :goto_6
    move-object v0, v13

    .line 305
    :goto_7
    move-object v8, v5

    .line 306
    move-object v5, v3

    .line 307
    move v3, v2

    .line 308
    move-object v2, v1

    .line 309
    move-object v1, v11

    .line 310
    goto :goto_8

    .line 311
    :cond_10
    new-instance v0, Lua8;

    .line 312
    .line 313
    const-string v8, "Timed out immediately"

    .line 314
    .line 315
    invoke-direct {v0, v8, v13}, Lua8;-><init>(Ljava/lang/String;Lva8;)V

    .line 316
    .line 317
    .line 318
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 319
    :catchall_2
    move-exception v0

    .line 320
    goto :goto_7

    .line 321
    :goto_8
    :try_start_4
    iget-object v9, v15, Lea6;->X:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v9, Le21;

    .line 324
    .line 325
    if-eqz v9, :cond_12

    .line 326
    .line 327
    new-instance v10, Lbr5;

    .line 328
    .line 329
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iput-object v8, v9, Le21;->Z:Ls61;

    .line 333
    .line 334
    new-instance v8, Ljava/lang/Throwable;

    .line 335
    .line 336
    invoke-direct {v8}, Ljava/lang/Throwable;-><init>()V

    .line 337
    .line 338
    .line 339
    iput-object v8, v9, Le21;->f0:Ljava/lang/Throwable;

    .line 340
    .line 341
    iget-object v8, v2, Lw11;->X:Lsq5;

    .line 342
    .line 343
    iget-object v11, v2, Lw11;->Y:Lsq5;

    .line 344
    .line 345
    if-eq v8, v11, :cond_11

    .line 346
    .line 347
    if-eqz v3, :cond_11

    .line 348
    .line 349
    const/4 v8, 0x1

    .line 350
    goto :goto_9

    .line 351
    :cond_11
    const/4 v8, 0x0

    .line 352
    :goto_9
    invoke-direct {v10, v9, v8}, Lbr5;-><init>(Le21;Z)V

    .line 353
    .line 354
    .line 355
    goto :goto_a

    .line 356
    :catchall_3
    move-exception v0

    .line 357
    move-object v11, v1

    .line 358
    move-object v2, v6

    .line 359
    goto/16 :goto_1

    .line 360
    .line 361
    :cond_12
    move-object v10, v13

    .line 362
    :goto_a
    iput-object v10, v1, Lea6;->X:Ljava/lang/Object;

    .line 363
    .line 364
    instance-of v8, v0, Lua8;

    .line 365
    .line 366
    if-nez v8, :cond_18

    .line 367
    .line 368
    if-nez v0, :cond_17

    .line 369
    .line 370
    if-eqz v10, :cond_16

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    new-instance v0, Ls11;

    .line 376
    .line 377
    invoke-direct {v0, v10}, Ls11;-><init>(Lbr5;)V

    .line 378
    .line 379
    .line 380
    iget-object v2, v2, Lw11;->Z:Ljava/lang/ThreadLocal;

    .line 381
    .line 382
    new-instance v3, Li98;

    .line 383
    .line 384
    invoke-direct {v3, v10, v2}, Li98;-><init>(Lbr5;Ljava/lang/ThreadLocal;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v0, v3}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    new-instance v2, Lq0;

    .line 392
    .line 393
    const/16 v3, 0x10

    .line 394
    .line 395
    invoke-direct {v2, v5, v1, v13, v3}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 396
    .line 397
    .line 398
    iput-object v6, v4, Lv11;->f0:Ljava/lang/Object;

    .line 399
    .line 400
    iput-object v1, v4, Lv11;->g0:Ljava/io/Serializable;

    .line 401
    .line 402
    iput-object v13, v4, Lv11;->h0:Lsq5;

    .line 403
    .line 404
    iput-object v13, v4, Lv11;->i0:Lea6;

    .line 405
    .line 406
    iput-object v13, v4, Lv11;->j0:Ls61;

    .line 407
    .line 408
    iput-object v13, v4, Lv11;->k0:Lea6;

    .line 409
    .line 410
    const/4 v3, 0x4

    .line 411
    iput v3, v4, Lv11;->o0:I

    .line 412
    .line 413
    invoke-static {v0, v2, v4}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 417
    if-ne v0, v14, :cond_13

    .line 418
    .line 419
    :goto_b
    return-object v14

    .line 420
    :cond_13
    move-object v2, v6

    .line 421
    :goto_c
    :try_start_5
    iget-object v1, v1, Lea6;->X:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v1, Lbr5;

    .line 424
    .line 425
    if-eqz v1, :cond_15

    .line 426
    .line 427
    iget-object v3, v1, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 428
    .line 429
    const/4 v4, 0x0

    .line 430
    const/4 v5, 0x1

    .line 431
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 432
    .line 433
    .line 434
    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 435
    if-eqz v3, :cond_14

    .line 436
    .line 437
    :try_start_6
    iget-object v3, v1, Lbr5;->a:Le21;

    .line 438
    .line 439
    invoke-static {v3, v7}, Lnr4;->r(Lqr6;Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/database/SQLException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 440
    .line 441
    .line 442
    :catch_0
    :cond_14
    :try_start_7
    iget-object v1, v1, Lbr5;->a:Le21;

    .line 443
    .line 444
    iput-object v13, v1, Le21;->Z:Ls61;

    .line 445
    .line 446
    iput-object v13, v1, Le21;->f0:Ljava/lang/Throwable;

    .line 447
    .line 448
    invoke-virtual {v2, v1}, Lsq5;->d(Le21;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 449
    .line 450
    .line 451
    :catchall_4
    :cond_15
    return-object v0

    .line 452
    :cond_16
    :try_start_8
    const-string v0, "Required value was null."

    .line 453
    .line 454
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 455
    .line 456
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw v2

    .line 460
    :cond_17
    throw v0

    .line 461
    :cond_18
    invoke-virtual {v2, v3}, Lw11;->g(Z)V

    .line 462
    .line 463
    .line 464
    throw v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 465
    :catchall_5
    move-exception v0

    .line 466
    move-object v1, v0

    .line 467
    move-object v2, v6

    .line 468
    :goto_d
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 469
    :catchall_6
    move-exception v0

    .line 470
    move-object v3, v0

    .line 471
    :try_start_a
    iget-object v0, v11, Lea6;->X:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lbr5;

    .line 474
    .line 475
    if-eqz v0, :cond_1a

    .line 476
    .line 477
    iget-object v4, v0, Lbr5;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 478
    .line 479
    const/4 v5, 0x0

    .line 480
    const/4 v6, 0x1

    .line 481
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 482
    .line 483
    .line 484
    move-result v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 485
    if-eqz v4, :cond_19

    .line 486
    .line 487
    :try_start_b
    iget-object v4, v0, Lbr5;->a:Le21;

    .line 488
    .line 489
    invoke-static {v4, v7}, Lnr4;->r(Lqr6;Ljava/lang/String;)V
    :try_end_b
    .catch Landroid/database/SQLException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 490
    .line 491
    .line 492
    :catch_1
    :cond_19
    :try_start_c
    iget-object v0, v0, Lbr5;->a:Le21;

    .line 493
    .line 494
    iput-object v13, v0, Le21;->Z:Ls61;

    .line 495
    .line 496
    iput-object v13, v0, Le21;->f0:Ljava/lang/Throwable;

    .line 497
    .line 498
    invoke-virtual {v2, v0}, Lsq5;->d(Le21;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 499
    .line 500
    .line 501
    goto :goto_e

    .line 502
    :catchall_7
    move-exception v0

    .line 503
    invoke-static {v1, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 504
    .line 505
    .line 506
    :cond_1a
    :goto_e
    throw v3

    .line 507
    :cond_1b
    const/16 v0, 0x15

    .line 508
    .line 509
    const-string v1, "Connection pool is closed"

    .line 510
    .line 511
    invoke-static {v0, v1}, Lnr4;->T(ILjava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v13
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lw11;->f0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lw11;->X:Lsq5;

    .line 12
    .line 13
    invoke-virtual {v0}, Lsq5;->b()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lw11;->Y:Lsq5;

    .line 17
    .line 18
    invoke-virtual {p0}, Lsq5;->b()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final g(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "reader"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "writer"

    .line 7
    .line 8
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Timed out attempting to acquire a "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " connection."

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "\n\nWriter pool:\n"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lw11;->Y:Lsq5;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lsq5;->c(Ljava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "Reader pool:"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xa

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lw11;->X:Lsq5;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lsq5;->c(Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const/4 p1, 0x5

    .line 65
    invoke-static {p1, p0}, Lnr4;->T(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0
.end method

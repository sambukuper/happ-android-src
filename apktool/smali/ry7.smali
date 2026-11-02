.class public abstract Lry7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(FFFLpk;Lrn2;Luy7;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v2, Lys0;->j0:Lug8;

    .line 2
    .line 3
    new-instance v3, Ljava/lang/Float;

    .line 4
    .line 5
    invoke-direct {v3, p0}, Ljava/lang/Float;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance v4, Ljava/lang/Float;

    .line 9
    .line 10
    invoke-direct {v4, p1}, Ljava/lang/Float;-><init>(F)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/lang/Float;

    .line 14
    .line 15
    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v2, Lug8;->a:Lgn2;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lwk;

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    invoke-interface {p1, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lwk;

    .line 33
    .line 34
    invoke-virtual {p0}, Lwk;->c()Lwk;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_0
    move-object v5, p0

    .line 39
    new-instance p1, Lt18;

    .line 40
    .line 41
    move-object v0, p1

    .line 42
    move-object v1, p3

    .line 43
    invoke-direct/range {v0 .. v5}, Lt18;-><init>(Lpk;Lug8;Ljava/lang/Object;Ljava/lang/Object;Lwk;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Lqk;

    .line 47
    .line 48
    const/16 p2, 0x38

    .line 49
    .line 50
    invoke-direct {p0, v2, v3, v5, p2}, Lqk;-><init>(Lug8;Ljava/lang/Object;Lwk;I)V

    .line 51
    .line 52
    .line 53
    move-object p2, p4

    .line 54
    new-instance p4, Lpy7;

    .line 55
    .line 56
    const/4 p3, 0x0

    .line 57
    invoke-direct {p4, p2, p3}, Lpy7;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    const-wide/high16 p2, -0x8000000000000000L

    .line 61
    .line 62
    invoke-static/range {p0 .. p5}, Lry7;->b(Lqk;Lgk;JLgn2;Ls51;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Ldn8;->a:Ldn8;

    .line 67
    .line 68
    sget-object p2, Lc71;->X:Lc71;

    .line 69
    .line 70
    if-ne p0, p2, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object p0, p1

    .line 74
    :goto_0
    if-ne p0, p2, :cond_2

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    return-object p1
.end method

.method public static final b(Lqk;Lgk;JLgn2;Ls51;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    sget-object v8, Lpz2;->T0:Lpz2;

    .line 6
    .line 7
    instance-of v1, v0, Lqy7;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lqy7;

    .line 13
    .line 14
    iget v2, v1, Lqy7;->k0:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v2, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v4

    .line 23
    iput v2, v1, Lqy7;->k0:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, Lqy7;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Ls51;-><init>(Lq51;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v10, v9, Ls51;->Y:Ls61;

    .line 34
    .line 35
    iget-object v0, v9, Lqy7;->j0:Ljava/lang/Object;

    .line 36
    .line 37
    iget v1, v9, Lqy7;->k0:I

    .line 38
    .line 39
    const/16 v11, 0x19

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v13, 0x2

    .line 43
    const/4 v14, 0x1

    .line 44
    sget-object v15, Lc71;->X:Lc71;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    if-eq v1, v14, :cond_1

    .line 49
    .line 50
    if-ne v1, v13, :cond_2

    .line 51
    .line 52
    :cond_1
    iget-object v1, v9, Lqy7;->i0:Lea6;

    .line 53
    .line 54
    iget-object v2, v9, Lqy7;->h0:Lgn2;

    .line 55
    .line 56
    iget-object v3, v9, Lqy7;->g0:Lgk;

    .line 57
    .line 58
    iget-object v4, v9, Lqy7;->f0:Lqk;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto/16 :goto_a

    .line 67
    .line 68
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const-wide/16 v0, 0x0

    .line 79
    .line 80
    invoke-interface {v3, v0, v1}, Lgk;->f(J)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v17

    .line 84
    invoke-interface {v3, v0, v1}, Lgk;->d(J)Lwk;

    .line 85
    .line 86
    .line 87
    move-result-object v19

    .line 88
    new-instance v1, Lea6;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    const-wide/high16 v4, -0x8000000000000000L

    .line 94
    .line 95
    cmp-long v0, p2, v4

    .line 96
    .line 97
    if-nez v0, :cond_7

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v10}, Lry7;->h(Ls61;)F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    new-instance v0, Lmy7;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    .line 107
    .line 108
    move-object/from16 v5, p0

    .line 109
    .line 110
    move-object/from16 v7, p4

    .line 111
    .line 112
    move-object/from16 v2, v17

    .line 113
    .line 114
    move-object/from16 v4, v19

    .line 115
    .line 116
    :try_start_2
    invoke-direct/range {v0 .. v7}, Lmy7;-><init>(Lea6;Ljava/lang/Object;Lgk;Lwk;Lqk;FLgn2;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 117
    .line 118
    .line 119
    move-object v7, v1

    .line 120
    :try_start_3
    iput-object v5, v9, Lqy7;->f0:Lqk;

    .line 121
    .line 122
    iput-object v3, v9, Lqy7;->g0:Lgk;

    .line 123
    .line 124
    move-object/from16 v6, p4

    .line 125
    .line 126
    iput-object v6, v9, Lqy7;->h0:Lgn2;

    .line 127
    .line 128
    iput-object v7, v9, Lqy7;->i0:Lea6;

    .line 129
    .line 130
    iput v14, v9, Lqy7;->k0:I

    .line 131
    .line 132
    invoke-interface {v3}, Lgk;->a()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    invoke-virtual {v9}, Ls51;->w()Ls61;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {v1, v8}, Ls61;->H0(Lr61;)Lq61;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    if-nez v1, :cond_4

    .line 147
    .line 148
    invoke-virtual {v9}, Ls51;->w()Ls61;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1}, Lz68;->H(Ls61;)Lai;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1, v0, v9}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_2

    .line 161
    :cond_4
    new-instance v0, Ljava/lang/ClassCastException;

    .line 162
    .line 163
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :cond_5
    new-instance v1, Lpr2;

    .line 168
    .line 169
    invoke-direct {v1, v0, v11}, Lpr2;-><init>(Lgn2;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {v10}, Lz68;->H(Ls61;)Lai;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0, v1, v9}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 183
    :goto_2
    if-ne v0, v15, :cond_6

    .line 184
    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_6
    move-object v4, v5

    .line 188
    move-object v2, v6

    .line 189
    goto :goto_6

    .line 190
    :goto_3
    move-object v4, v5

    .line 191
    :goto_4
    move-object v1, v7

    .line 192
    goto/16 :goto_a

    .line 193
    .line 194
    :catch_1
    move-exception v0

    .line 195
    goto :goto_3

    .line 196
    :catch_2
    move-exception v0

    .line 197
    :goto_5
    move-object v7, v1

    .line 198
    move-object v4, v5

    .line 199
    goto/16 :goto_a

    .line 200
    .line 201
    :catch_3
    move-exception v0

    .line 202
    move-object/from16 v5, p0

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_7
    move-object/from16 v5, p0

    .line 206
    .line 207
    move-object/from16 v6, p4

    .line 208
    .line 209
    move-object v7, v1

    .line 210
    :try_start_4
    new-instance v16, Lok;

    .line 211
    .line 212
    invoke-interface {v3}, Lgk;->c()Lug8;

    .line 213
    .line 214
    .line 215
    move-result-object v18

    .line 216
    invoke-interface {v3}, Lgk;->g()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v22

    .line 220
    new-instance v0, Lny7;

    .line 221
    .line 222
    invoke-direct {v0, v5, v12}, Lny7;-><init>(Lqk;B)V

    .line 223
    .line 224
    .line 225
    move-wide/from16 v23, p2

    .line 226
    .line 227
    move-wide/from16 v20, p2

    .line 228
    .line 229
    move-object/from16 v25, v0

    .line 230
    .line 231
    invoke-direct/range {v16 .. v25}, Lok;-><init>(Ljava/lang/Object;Lug8;Lwk;JLjava/lang/Object;JLdn2;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-static {v10}, Lry7;->h(Ls61;)F

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    move-wide/from16 v1, p2

    .line 242
    .line 243
    move-object v4, v3

    .line 244
    move v3, v0

    .line 245
    move-object/from16 v0, v16

    .line 246
    .line 247
    invoke-static/range {v0 .. v6}, Lry7;->g(Lok;JFLgk;Lqk;Lgn2;)V

    .line 248
    .line 249
    .line 250
    iput-object v0, v7, Lea6;->X:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    .line 251
    .line 252
    move-object/from16 v4, p0

    .line 253
    .line 254
    move-object/from16 v3, p1

    .line 255
    .line 256
    move-object/from16 v2, p4

    .line 257
    .line 258
    :goto_6
    move-object v1, v7

    .line 259
    :cond_8
    :goto_7
    :try_start_5
    iget-object v0, v9, Ls51;->Y:Ls61;

    .line 260
    .line 261
    iget-object v5, v1, Lea6;->X:Ljava/lang/Object;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    check-cast v5, Lok;

    .line 267
    .line 268
    iget-object v5, v5, Lok;->i:Lrh5;

    .line 269
    .line 270
    invoke-virtual {v5}, Lrh5;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    check-cast v5, Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    if-eqz v5, :cond_b

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-static {v0}, Lry7;->h(Ls61;)F

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    new-instance v6, Loy7;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 290
    .line 291
    move-object/from16 p1, v1

    .line 292
    .line 293
    move-object/from16 p5, v2

    .line 294
    .line 295
    move-object/from16 p3, v3

    .line 296
    .line 297
    move-object/from16 p4, v4

    .line 298
    .line 299
    move/from16 p2, v5

    .line 300
    .line 301
    move-object/from16 p0, v6

    .line 302
    .line 303
    :try_start_6
    invoke-direct/range {p0 .. p5}, Loy7;-><init>(Lea6;FLgk;Lqk;Lgn2;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    .line 304
    .line 305
    .line 306
    move-object/from16 v5, p0

    .line 307
    .line 308
    move-object/from16 v1, p1

    .line 309
    .line 310
    move-object/from16 v3, p3

    .line 311
    .line 312
    move-object/from16 v4, p4

    .line 313
    .line 314
    move-object/from16 v2, p5

    .line 315
    .line 316
    :try_start_7
    iput-object v4, v9, Lqy7;->f0:Lqk;

    .line 317
    .line 318
    iput-object v3, v9, Lqy7;->g0:Lgk;

    .line 319
    .line 320
    iput-object v2, v9, Lqy7;->h0:Lgn2;

    .line 321
    .line 322
    iput-object v1, v9, Lqy7;->i0:Lea6;

    .line 323
    .line 324
    iput v13, v9, Lqy7;->k0:I

    .line 325
    .line 326
    invoke-interface {v3}, Lgk;->a()Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_a

    .line 331
    .line 332
    invoke-virtual {v9}, Ls51;->w()Ls61;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-interface {v0, v8}, Ls61;->H0(Lr61;)Lq61;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-nez v0, :cond_9

    .line 341
    .line 342
    invoke-virtual {v9}, Ls51;->w()Ls61;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v0}, Lz68;->H(Ls61;)Lai;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0, v5, v9}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    goto :goto_8

    .line 355
    :cond_9
    new-instance v0, Ljava/lang/ClassCastException;

    .line 356
    .line 357
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 358
    .line 359
    .line 360
    throw v0

    .line 361
    :cond_a
    new-instance v6, Lpr2;

    .line 362
    .line 363
    invoke-direct {v6, v5, v11}, Lpr2;-><init>(Lgn2;B)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-static {v0}, Lz68;->H(Ls61;)Lai;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0, v6, v9}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 377
    :goto_8
    if-ne v0, v15, :cond_8

    .line 378
    .line 379
    :goto_9
    return-object v15

    .line 380
    :catch_4
    move-exception v0

    .line 381
    move-object/from16 v1, p1

    .line 382
    .line 383
    move-object/from16 v4, p4

    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_b
    sget-object v0, Ldn8;->a:Ldn8;

    .line 387
    .line 388
    return-object v0

    .line 389
    :catch_5
    move-exception v0

    .line 390
    move-object/from16 v4, p0

    .line 391
    .line 392
    goto/16 :goto_4

    .line 393
    .line 394
    :goto_a
    iget-object v2, v1, Lea6;->X:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v2, Lok;

    .line 397
    .line 398
    if-eqz v2, :cond_c

    .line 399
    .line 400
    iget-object v2, v2, Lok;->i:Lrh5;

    .line 401
    .line 402
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 403
    .line 404
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    :cond_c
    iget-object v1, v1, Lea6;->X:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, Lok;

    .line 410
    .line 411
    if-eqz v1, :cond_d

    .line 412
    .line 413
    iget-wide v1, v1, Lok;->g:J

    .line 414
    .line 415
    iget-wide v5, v4, Lqk;->f0:J

    .line 416
    .line 417
    cmp-long v1, v1, v5

    .line 418
    .line 419
    if-nez v1, :cond_d

    .line 420
    .line 421
    iput-boolean v12, v4, Lqk;->h0:Z

    .line 422
    .line 423
    :cond_d
    throw v0
.end method

.method public static final c(Lqk;Lbd1;ZLgn2;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lqk;->Y:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lqk;->Z:Lwk;

    .line 8
    .line 9
    iget-object v2, p0, Lqk;->X:Lug8;

    .line 10
    .line 11
    new-instance v4, Lad1;

    .line 12
    .line 13
    invoke-direct {v4, p1, v2, v0, v1}, Lad1;-><init>(Lbd1;Lug8;Ljava/lang/Object;Lwk;)V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-wide p1, p0, Lqk;->f0:J

    .line 19
    .line 20
    :goto_0
    move-object v3, p0

    .line 21
    move-wide v5, p1

    .line 22
    move-object v7, p3

    .line 23
    move-object v8, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-static/range {v3 .. v8}, Lry7;->b(Lqk;Lgk;JLgn2;Ls51;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final d(Lqk;Ljava/lang/Float;Lpk;ZLgn2;Ls51;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lqk;->Y:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    iget-object v3, p0, Lqk;->X:Lug8;

    .line 8
    .line 9
    iget-object v6, p0, Lqk;->Z:Lwk;

    .line 10
    .line 11
    new-instance v1, Lt18;

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-direct/range {v1 .. v6}, Lt18;-><init>(Lpk;Lug8;Ljava/lang/Object;Ljava/lang/Object;Lwk;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v1

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    iget-wide p2, p0, Lqk;->f0:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/high16 p2, -0x8000000000000000L

    .line 25
    .line 26
    :goto_0
    invoke-static/range {p0 .. p5}, Lry7;->b(Lqk;Lgk;JLgn2;Ls51;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Lc71;->X:Lc71;

    .line 31
    .line 32
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final e(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    check-cast p0, Lsu3;

    .line 7
    .line 8
    instance-of p1, p0, Lru3;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    move-object p1, p0

    .line 13
    check-cast p1, Lru3;

    .line 14
    .line 15
    iget-object p1, p1, Lru3;->i:Lut3;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p0, p1, Lut3;->f0:Lfk2;

    .line 20
    .line 21
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 22
    .line 23
    iget-object p0, p0, Lgk2;->a:Ljava/lang/String;

    .line 24
    .line 25
    const/16 p1, 0x2e

    .line 26
    .line 27
    const/16 v0, 0x2f

    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    new-instance p1, Lqu3;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Lqu3;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    const/4 p0, 0x7

    .line 42
    invoke-static {p0}, Lzs3;->a(I)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    return-object p0
.end method

.method public static final f()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final g(Lok;JFLgk;Lqk;Lgn2;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p3, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p4}, Lgk;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, Lok;->c:J

    .line 12
    .line 13
    sub-long v0, p1, v0

    .line 14
    .line 15
    long-to-float v0, v0

    .line 16
    div-float/2addr v0, p3

    .line 17
    float-to-long v0, v0

    .line 18
    :goto_0
    iput-wide p1, p0, Lok;->g:J

    .line 19
    .line 20
    invoke-interface {p4, v0, v1}, Lgk;->f(J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p0, Lok;->e:Lrh5;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p4, v0, v1}, Lgk;->d(J)Lwk;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lok;->f:Lwk;

    .line 34
    .line 35
    invoke-interface {p4, v0, v1}, Lgk;->e(J)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-wide p1, p0, Lok;->g:J

    .line 42
    .line 43
    iput-wide p1, p0, Lok;->h:J

    .line 44
    .line 45
    iget-object p1, p0, Lok;->i:Lrh5;

    .line 46
    .line 47
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p0, p5}, Lry7;->j(Lok;Lqk;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p6, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final h(Ls61;)F
    .locals 1

    .line 1
    sget-object v0, Llh4;->h0:Llh4;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ley4;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ley4;->c0()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    cmpl-float v0, p0, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_1
    const-string v0, "negative scale factor"

    .line 25
    .line 26
    invoke-static {v0}, Lyr5;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return p0
.end method

.method public static final i(Lfe3;)Lpe3;
    .locals 4

    .line 1
    new-instance v0, Lpe3;

    .line 2
    .line 3
    iget v1, p0, Lfe3;->a:I

    .line 4
    .line 5
    iget v2, p0, Lfe3;->b:I

    .line 6
    .line 7
    iget v3, p0, Lfe3;->c:I

    .line 8
    .line 9
    iget p0, p0, Lfe3;->d:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, p0}, Lpe3;-><init>(IIII)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final j(Lok;Lqk;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lok;->e:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lqk;->Y:Lrh5;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lqk;->Z:Lwk;

    .line 13
    .line 14
    iget-object v1, p0, Lok;->f:Lwk;

    .line 15
    .line 16
    invoke-virtual {v0}, Lwk;->b()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lwk;->a(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0, v3, v4}, Lwk;->e(IF)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v0, p0, Lok;->h:J

    .line 34
    .line 35
    iput-wide v0, p1, Lqk;->g0:J

    .line 36
    .line 37
    iget-wide v0, p0, Lok;->g:J

    .line 38
    .line 39
    iput-wide v0, p1, Lqk;->f0:J

    .line 40
    .line 41
    iget-object p0, p0, Lok;->i:Lrh5;

    .line 42
    .line 43
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput-boolean p0, p1, Lqk;->h0:Z

    .line 54
    .line 55
    return-void
.end method

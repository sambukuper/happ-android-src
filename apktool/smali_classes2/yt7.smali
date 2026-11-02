.class public final Lyt7;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Loh7;

.field public final e:Lh76;

.field public final f:Lu77;

.field public final g:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmq7;

    .line 5
    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lyt7;->b:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lmq7;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lyt7;->c:Lvz7;

    .line 31
    .line 32
    new-instance v0, Let7;

    .line 33
    .line 34
    sget-object v1, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v0, v1, v2, v3}, Let7;-><init>(Ljava/lang/String;ZLqs7;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lyt7;->d:Loh7;

    .line 53
    .line 54
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lyt7;->e:Lh76;

    .line 59
    .line 60
    const/4 v0, 0x7

    .line 61
    invoke-static {v2, v0, v3}, Lv77;->b(IILl90;)Lu77;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lyt7;->f:Lu77;

    .line 66
    .line 67
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lyt7;->g:Lf76;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final e()Lzt7;
    .locals 0

    .line 1
    iget-object p0, p0, Lyt7;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzt7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f(Lwt7;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lpt7;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, Lyt7;->d:Loh7;

    .line 10
    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    check-cast v1, Lpt7;

    .line 14
    .line 15
    iget-object v2, v1, Lpt7;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v2}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lqs7;

    .line 28
    .line 29
    invoke-direct {v1}, Lqs7;-><init>()V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v6, v1

    .line 33
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne v0, v4, :cond_1

    .line 51
    .line 52
    move v7, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v7, v3

    .line 55
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v1, v0

    .line 63
    check-cast v1, Let7;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v1, Let7;

    .line 69
    .line 70
    invoke-direct {v1, v2, v7, v6}, Let7;-><init>(Ljava/lang/String;ZLqs7;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :cond_3
    instance-of v2, v1, Ljt7;

    .line 82
    .line 83
    iget-object v6, v0, Lyt7;->e:Lh76;

    .line 84
    .line 85
    const/4 v7, 0x2

    .line 86
    if-eqz v2, :cond_8

    .line 87
    .line 88
    check-cast v1, Ljt7;

    .line 89
    .line 90
    iget-boolean v9, v1, Ljt7;->a:Z

    .line 91
    .line 92
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 93
    .line 94
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Let7;

    .line 99
    .line 100
    iget-object v1, v1, Let7;->c:Lqs7;

    .line 101
    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    iget-object v8, v1, Lqs7;->a:Lis7;

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const/16 v14, 0x1e

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    const/4 v12, 0x0

    .line 112
    invoke-static/range {v8 .. v14}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    const/16 v20, 0x0

    .line 117
    .line 118
    const/16 v21, 0x3fe

    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const/4 v15, 0x0

    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    move-object v10, v1

    .line 131
    invoke-static/range {v10 .. v21}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    move-object v3, v2

    .line 143
    check-cast v3, Let7;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_4

    .line 157
    .line 158
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 163
    .line 164
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Let7;

    .line 169
    .line 170
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 171
    .line 172
    new-instance v3, Lzo6;

    .line 173
    .line 174
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 178
    .line 179
    .line 180
    :cond_5
    if-eqz v9, :cond_7

    .line 181
    .line 182
    sget-object v0, Lev7;->a:Lvz7;

    .line 183
    .line 184
    iget-object v0, v6, Lh76;->X:Loh7;

    .line 185
    .line 186
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Let7;

    .line 191
    .line 192
    iget-object v0, v0, Let7;->c:Lqs7;

    .line 193
    .line 194
    if-eqz v0, :cond_6

    .line 195
    .line 196
    iget-object v0, v0, Lqs7;->a:Lis7;

    .line 197
    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    iget v4, v0, Lis7;->c:I

    .line 201
    .line 202
    :cond_6
    iget-object v0, v6, Lh76;->X:Loh7;

    .line 203
    .line 204
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Let7;

    .line 209
    .line 210
    iget-object v0, v0, Let7;->a:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v4, v0}, Lev7;->b(ILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_7
    sget-object v0, Lev7;->a:Lvz7;

    .line 217
    .line 218
    iget-object v0, v6, Lh76;->X:Loh7;

    .line 219
    .line 220
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Let7;

    .line 225
    .line 226
    iget-object v0, v0, Let7;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v0}, Lev7;->a(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_8
    instance-of v2, v1, Lkt7;

    .line 233
    .line 234
    const/4 v8, 0x0

    .line 235
    if-eqz v2, :cond_b

    .line 236
    .line 237
    check-cast v1, Lkt7;

    .line 238
    .line 239
    iget-object v1, v1, Lkt7;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    if-eqz v1, :cond_25

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    sget-object v3, Lqs7;->Companion:Ljs7;

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget-object v3, Lqs7;->l:Lkf3;

    .line 257
    .line 258
    iget v4, v3, Lif3;->X:I

    .line 259
    .line 260
    iget v3, v3, Lif3;->Y:I

    .line 261
    .line 262
    if-gt v2, v3, :cond_9

    .line 263
    .line 264
    if-gt v4, v2, :cond_9

    .line 265
    .line 266
    move-object v8, v1

    .line 267
    :cond_9
    if-eqz v8, :cond_25

    .line 268
    .line 269
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 274
    .line 275
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Let7;

    .line 280
    .line 281
    iget-object v1, v1, Let7;->c:Lqs7;

    .line 282
    .line 283
    if-eqz v1, :cond_25

    .line 284
    .line 285
    iget-object v9, v1, Lqs7;->a:Lis7;

    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const/16 v15, 0x1b

    .line 289
    .line 290
    const/4 v10, 0x0

    .line 291
    const/4 v11, 0x0

    .line 292
    const/4 v13, 0x0

    .line 293
    invoke-static/range {v9 .. v15}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 294
    .line 295
    .line 296
    move-result-object v14

    .line 297
    const/16 v23, 0x0

    .line 298
    .line 299
    const/16 v24, 0x3fe

    .line 300
    .line 301
    const/4 v15, 0x0

    .line 302
    const/16 v16, 0x0

    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const/16 v18, 0x0

    .line 307
    .line 308
    const/16 v19, 0x0

    .line 309
    .line 310
    const/16 v20, 0x0

    .line 311
    .line 312
    const/16 v21, 0x0

    .line 313
    .line 314
    const/16 v22, 0x0

    .line 315
    .line 316
    move-object v13, v1

    .line 317
    invoke-static/range {v13 .. v24}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    :cond_a
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    move-object v3, v2

    .line 329
    check-cast v3, Let7;

    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-eqz v2, :cond_a

    .line 343
    .line 344
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 349
    .line 350
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    check-cast v2, Let7;

    .line 355
    .line 356
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 357
    .line 358
    new-instance v3, Lzo6;

    .line 359
    .line 360
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :cond_b
    instance-of v2, v1, Llt7;

    .line 368
    .line 369
    if-eqz v2, :cond_d

    .line 370
    .line 371
    check-cast v1, Llt7;

    .line 372
    .line 373
    iget-boolean v13, v1, Llt7;->a:Z

    .line 374
    .line 375
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 376
    .line 377
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Let7;

    .line 382
    .line 383
    iget-object v1, v1, Let7;->c:Lqs7;

    .line 384
    .line 385
    if-eqz v1, :cond_25

    .line 386
    .line 387
    iget-object v8, v1, Lqs7;->a:Lis7;

    .line 388
    .line 389
    const/4 v12, 0x0

    .line 390
    const/16 v14, 0xf

    .line 391
    .line 392
    const/4 v9, 0x0

    .line 393
    const/4 v10, 0x0

    .line 394
    const/4 v11, 0x0

    .line 395
    invoke-static/range {v8 .. v14}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    const/16 v24, 0x0

    .line 400
    .line 401
    const/16 v25, 0x3fe

    .line 402
    .line 403
    const/16 v16, 0x0

    .line 404
    .line 405
    const/16 v17, 0x0

    .line 406
    .line 407
    const/16 v18, 0x0

    .line 408
    .line 409
    const/16 v19, 0x0

    .line 410
    .line 411
    const/16 v20, 0x0

    .line 412
    .line 413
    const/16 v21, 0x0

    .line 414
    .line 415
    const/16 v22, 0x0

    .line 416
    .line 417
    const/16 v23, 0x0

    .line 418
    .line 419
    move-object v14, v1

    .line 420
    invoke-static/range {v14 .. v25}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    :cond_c
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    move-object v3, v2

    .line 432
    check-cast v3, Let7;

    .line 433
    .line 434
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-eqz v2, :cond_c

    .line 446
    .line 447
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 452
    .line 453
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    check-cast v2, Let7;

    .line 458
    .line 459
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 460
    .line 461
    new-instance v3, Lzo6;

    .line 462
    .line 463
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 467
    .line 468
    .line 469
    return-void

    .line 470
    :cond_d
    instance-of v2, v1, Lut7;

    .line 471
    .line 472
    if-eqz v2, :cond_f

    .line 473
    .line 474
    check-cast v1, Lut7;

    .line 475
    .line 476
    iget-boolean v10, v1, Lut7;->a:Z

    .line 477
    .line 478
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 479
    .line 480
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    check-cast v1, Let7;

    .line 485
    .line 486
    iget-object v8, v1, Let7;->c:Lqs7;

    .line 487
    .line 488
    if-eqz v8, :cond_25

    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const/16 v19, 0x3fd

    .line 493
    .line 494
    const/4 v9, 0x0

    .line 495
    const/4 v11, 0x0

    .line 496
    const/4 v12, 0x0

    .line 497
    const/4 v13, 0x0

    .line 498
    const/4 v14, 0x0

    .line 499
    const/4 v15, 0x0

    .line 500
    const/16 v16, 0x0

    .line 501
    .line 502
    const/16 v17, 0x0

    .line 503
    .line 504
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    :cond_e
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    move-object v3, v2

    .line 516
    check-cast v3, Let7;

    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_e

    .line 530
    .line 531
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 536
    .line 537
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    check-cast v2, Let7;

    .line 542
    .line 543
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 544
    .line 545
    new-instance v3, Lzo6;

    .line 546
    .line 547
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 551
    .line 552
    .line 553
    return-void

    .line 554
    :cond_f
    instance-of v2, v1, Lqt7;

    .line 555
    .line 556
    if-eqz v2, :cond_11

    .line 557
    .line 558
    check-cast v1, Lqt7;

    .line 559
    .line 560
    iget-boolean v11, v1, Lqt7;->a:Z

    .line 561
    .line 562
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 563
    .line 564
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    check-cast v1, Let7;

    .line 569
    .line 570
    iget-object v8, v1, Let7;->c:Lqs7;

    .line 571
    .line 572
    if-eqz v8, :cond_25

    .line 573
    .line 574
    const/16 v18, 0x0

    .line 575
    .line 576
    const/16 v19, 0x3fb

    .line 577
    .line 578
    const/4 v9, 0x0

    .line 579
    const/4 v10, 0x0

    .line 580
    const/4 v12, 0x0

    .line 581
    const/4 v13, 0x0

    .line 582
    const/4 v14, 0x0

    .line 583
    const/4 v15, 0x0

    .line 584
    const/16 v16, 0x0

    .line 585
    .line 586
    const/16 v17, 0x0

    .line 587
    .line 588
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    :cond_10
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    move-object v3, v2

    .line 600
    check-cast v3, Let7;

    .line 601
    .line 602
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    if-eqz v2, :cond_10

    .line 614
    .line 615
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 620
    .line 621
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    check-cast v2, Let7;

    .line 626
    .line 627
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 628
    .line 629
    new-instance v3, Lzo6;

    .line 630
    .line 631
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 635
    .line 636
    .line 637
    return-void

    .line 638
    :cond_11
    instance-of v2, v1, Lht7;

    .line 639
    .line 640
    if-eqz v2, :cond_13

    .line 641
    .line 642
    check-cast v1, Lht7;

    .line 643
    .line 644
    iget-boolean v1, v1, Lht7;->a:Z

    .line 645
    .line 646
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 647
    .line 648
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    check-cast v2, Let7;

    .line 653
    .line 654
    iget-object v9, v2, Let7;->c:Lqs7;

    .line 655
    .line 656
    if-eqz v9, :cond_25

    .line 657
    .line 658
    iget-object v2, v9, Lqs7;->d:Lfs7;

    .line 659
    .line 660
    invoke-static {v2, v1, v8, v7}, Lfs7;->a(Lfs7;ZLsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;I)Lfs7;

    .line 661
    .line 662
    .line 663
    move-result-object v13

    .line 664
    const/16 v19, 0x0

    .line 665
    .line 666
    const/16 v20, 0x3f7

    .line 667
    .line 668
    const/4 v10, 0x0

    .line 669
    const/4 v11, 0x0

    .line 670
    const/4 v12, 0x0

    .line 671
    const/4 v14, 0x0

    .line 672
    const/4 v15, 0x0

    .line 673
    const/16 v16, 0x0

    .line 674
    .line 675
    const/16 v17, 0x0

    .line 676
    .line 677
    const/16 v18, 0x0

    .line 678
    .line 679
    invoke-static/range {v9 .. v20}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    :cond_12
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    move-object v3, v2

    .line 691
    check-cast v3, Let7;

    .line 692
    .line 693
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    if-eqz v2, :cond_12

    .line 705
    .line 706
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 711
    .line 712
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    check-cast v2, Let7;

    .line 717
    .line 718
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 719
    .line 720
    new-instance v3, Lzo6;

    .line 721
    .line 722
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :cond_13
    instance-of v2, v1, Lit7;

    .line 730
    .line 731
    if-eqz v2, :cond_16

    .line 732
    .line 733
    check-cast v1, Lit7;

    .line 734
    .line 735
    iget v1, v1, Lit7;->a:I

    .line 736
    .line 737
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;->c()Ll22;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    invoke-static {v1, v2}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    check-cast v1, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 746
    .line 747
    if-nez v1, :cond_14

    .line 748
    .line 749
    goto/16 :goto_1

    .line 750
    .line 751
    :cond_14
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 752
    .line 753
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    check-cast v2, Let7;

    .line 758
    .line 759
    iget-object v8, v2, Let7;->c:Lqs7;

    .line 760
    .line 761
    if-eqz v8, :cond_25

    .line 762
    .line 763
    iget-object v2, v8, Lqs7;->d:Lfs7;

    .line 764
    .line 765
    invoke-static {v2, v3, v1, v4}, Lfs7;->a(Lfs7;ZLsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;I)Lfs7;

    .line 766
    .line 767
    .line 768
    move-result-object v12

    .line 769
    const/16 v18, 0x0

    .line 770
    .line 771
    const/16 v19, 0x3f7

    .line 772
    .line 773
    const/4 v9, 0x0

    .line 774
    const/4 v10, 0x0

    .line 775
    const/4 v11, 0x0

    .line 776
    const/4 v13, 0x0

    .line 777
    const/4 v14, 0x0

    .line 778
    const/4 v15, 0x0

    .line 779
    const/16 v16, 0x0

    .line 780
    .line 781
    const/16 v17, 0x0

    .line 782
    .line 783
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    :cond_15
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    move-object v3, v2

    .line 795
    check-cast v3, Let7;

    .line 796
    .line 797
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v2

    .line 808
    if-eqz v2, :cond_15

    .line 809
    .line 810
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 815
    .line 816
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    check-cast v2, Let7;

    .line 821
    .line 822
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 823
    .line 824
    new-instance v3, Lzo6;

    .line 825
    .line 826
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 830
    .line 831
    .line 832
    return-void

    .line 833
    :cond_16
    instance-of v2, v1, Lgt7;

    .line 834
    .line 835
    if-eqz v2, :cond_18

    .line 836
    .line 837
    check-cast v1, Lgt7;

    .line 838
    .line 839
    iget-boolean v13, v1, Lgt7;->a:Z

    .line 840
    .line 841
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 842
    .line 843
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    check-cast v1, Let7;

    .line 848
    .line 849
    iget-object v8, v1, Let7;->c:Lqs7;

    .line 850
    .line 851
    if-eqz v8, :cond_25

    .line 852
    .line 853
    const/16 v18, 0x0

    .line 854
    .line 855
    const/16 v19, 0x3ef

    .line 856
    .line 857
    const/4 v9, 0x0

    .line 858
    const/4 v10, 0x0

    .line 859
    const/4 v11, 0x0

    .line 860
    const/4 v12, 0x0

    .line 861
    const/4 v14, 0x0

    .line 862
    const/4 v15, 0x0

    .line 863
    const/16 v16, 0x0

    .line 864
    .line 865
    const/16 v17, 0x0

    .line 866
    .line 867
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    :cond_17
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    move-object v3, v2

    .line 879
    check-cast v3, Let7;

    .line 880
    .line 881
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-eqz v2, :cond_17

    .line 893
    .line 894
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 899
    .line 900
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    check-cast v2, Let7;

    .line 905
    .line 906
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 907
    .line 908
    new-instance v3, Lzo6;

    .line 909
    .line 910
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 914
    .line 915
    .line 916
    return-void

    .line 917
    :cond_18
    instance-of v2, v1, Lnt7;

    .line 918
    .line 919
    if-eqz v2, :cond_1a

    .line 920
    .line 921
    check-cast v1, Lnt7;

    .line 922
    .line 923
    iget-boolean v14, v1, Lnt7;->a:Z

    .line 924
    .line 925
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 926
    .line 927
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    check-cast v1, Let7;

    .line 932
    .line 933
    iget-object v8, v1, Let7;->c:Lqs7;

    .line 934
    .line 935
    if-eqz v8, :cond_25

    .line 936
    .line 937
    const/16 v18, 0x0

    .line 938
    .line 939
    const/16 v19, 0x3df

    .line 940
    .line 941
    const/4 v9, 0x0

    .line 942
    const/4 v10, 0x0

    .line 943
    const/4 v11, 0x0

    .line 944
    const/4 v12, 0x0

    .line 945
    const/4 v13, 0x0

    .line 946
    const/4 v15, 0x0

    .line 947
    const/16 v16, 0x0

    .line 948
    .line 949
    const/16 v17, 0x0

    .line 950
    .line 951
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 952
    .line 953
    .line 954
    move-result-object v1

    .line 955
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    :cond_19
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    move-object v3, v2

    .line 963
    check-cast v3, Let7;

    .line 964
    .line 965
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    if-eqz v2, :cond_19

    .line 977
    .line 978
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 983
    .line 984
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    check-cast v2, Let7;

    .line 989
    .line 990
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 991
    .line 992
    new-instance v3, Lzo6;

    .line 993
    .line 994
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 998
    .line 999
    .line 1000
    return-void

    .line 1001
    :cond_1a
    instance-of v2, v1, Lst7;

    .line 1002
    .line 1003
    if-eqz v2, :cond_1c

    .line 1004
    .line 1005
    check-cast v1, Lst7;

    .line 1006
    .line 1007
    iget-boolean v1, v1, Lst7;->a:Z

    .line 1008
    .line 1009
    iget-object v0, v0, Lyt7;->c:Lvz7;

    .line 1010
    .line 1011
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    check-cast v0, Lgk7;

    .line 1016
    .line 1017
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1018
    .line 1019
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    check-cast v2, Let7;

    .line 1024
    .line 1025
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 1026
    .line 1027
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    iget-object v0, v0, Lgk7;->c:Lvz7;

    .line 1034
    .line 1035
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    check-cast v0, Lfk7;

    .line 1040
    .line 1041
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1042
    .line 1043
    .line 1044
    iget-object v0, v0, Lfk7;->a:Lzt7;

    .line 1045
    .line 1046
    new-instance v3, Las;

    .line 1047
    .line 1048
    const/16 v4, 0xc

    .line 1049
    .line 1050
    invoke-direct {v3, v4, v1}, Las;-><init>(BZ)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v2

    .line 1057
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    :cond_1b
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    move-object v1, v0

    .line 1065
    check-cast v1, Let7;

    .line 1066
    .line 1067
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v1, v2}, Let7;->a(Let7;Lqs7;)Let7;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    invoke-virtual {v5, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    if-eqz v0, :cond_1b

    .line 1079
    .line 1080
    goto/16 :goto_1

    .line 1081
    .line 1082
    :cond_1c
    instance-of v2, v1, Lrt7;

    .line 1083
    .line 1084
    if-eqz v2, :cond_1e

    .line 1085
    .line 1086
    check-cast v1, Lrt7;

    .line 1087
    .line 1088
    iget v1, v1, Lrt7;->a:I

    .line 1089
    .line 1090
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1091
    .line 1092
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v2

    .line 1096
    check-cast v2, Let7;

    .line 1097
    .line 1098
    iget-object v8, v2, Let7;->c:Lqs7;

    .line 1099
    .line 1100
    if-eqz v8, :cond_25

    .line 1101
    .line 1102
    const/16 v18, 0x0

    .line 1103
    .line 1104
    const/16 v19, 0x37f

    .line 1105
    .line 1106
    const/4 v9, 0x0

    .line 1107
    const/4 v10, 0x0

    .line 1108
    const/4 v11, 0x0

    .line 1109
    const/4 v12, 0x0

    .line 1110
    const/4 v13, 0x0

    .line 1111
    const/4 v14, 0x0

    .line 1112
    const/4 v15, 0x0

    .line 1113
    const/16 v17, 0x0

    .line 1114
    .line 1115
    move/from16 v16, v1

    .line 1116
    .line 1117
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    :cond_1d
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    move-object v3, v2

    .line 1129
    check-cast v3, Let7;

    .line 1130
    .line 1131
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v3

    .line 1138
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v2

    .line 1142
    if-eqz v2, :cond_1d

    .line 1143
    .line 1144
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v0

    .line 1148
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1149
    .line 1150
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    check-cast v2, Let7;

    .line 1155
    .line 1156
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 1157
    .line 1158
    new-instance v3, Lzo6;

    .line 1159
    .line 1160
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 1164
    .line 1165
    .line 1166
    return-void

    .line 1167
    :cond_1e
    instance-of v2, v1, Lvt7;

    .line 1168
    .line 1169
    if-eqz v2, :cond_20

    .line 1170
    .line 1171
    check-cast v1, Lvt7;

    .line 1172
    .line 1173
    iget-object v1, v1, Lvt7;->a:Ljava/lang/String;

    .line 1174
    .line 1175
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1176
    .line 1177
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    check-cast v2, Let7;

    .line 1182
    .line 1183
    iget-object v8, v2, Let7;->c:Lqs7;

    .line 1184
    .line 1185
    if-eqz v8, :cond_25

    .line 1186
    .line 1187
    iget-object v2, v8, Lqs7;->i:Lps7;

    .line 1188
    .line 1189
    invoke-static {v2, v1, v3, v7}, Lps7;->a(Lps7;Ljava/lang/String;ZI)Lps7;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v17

    .line 1193
    const/16 v18, 0x0

    .line 1194
    .line 1195
    const/16 v19, 0x2ff

    .line 1196
    .line 1197
    const/4 v9, 0x0

    .line 1198
    const/4 v10, 0x0

    .line 1199
    const/4 v11, 0x0

    .line 1200
    const/4 v12, 0x0

    .line 1201
    const/4 v13, 0x0

    .line 1202
    const/4 v14, 0x0

    .line 1203
    const/4 v15, 0x0

    .line 1204
    const/16 v16, 0x0

    .line 1205
    .line 1206
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1211
    .line 1212
    .line 1213
    :cond_1f
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v2

    .line 1217
    move-object v3, v2

    .line 1218
    check-cast v3, Let7;

    .line 1219
    .line 1220
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1221
    .line 1222
    .line 1223
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v3

    .line 1227
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    if-eqz v2, :cond_1f

    .line 1232
    .line 1233
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1238
    .line 1239
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v2

    .line 1243
    check-cast v2, Let7;

    .line 1244
    .line 1245
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 1246
    .line 1247
    new-instance v3, Lzo6;

    .line 1248
    .line 1249
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 1253
    .line 1254
    .line 1255
    return-void

    .line 1256
    :cond_20
    instance-of v2, v1, Ltt7;

    .line 1257
    .line 1258
    if-eqz v2, :cond_23

    .line 1259
    .line 1260
    check-cast v1, Ltt7;

    .line 1261
    .line 1262
    iget v1, v1, Ltt7;->a:I

    .line 1263
    .line 1264
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;->a()Ll22;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    invoke-static {v1, v2}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v1

    .line 1272
    move-object/from16 v18, v1

    .line 1273
    .line 1274
    check-cast v18, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 1275
    .line 1276
    if-nez v18, :cond_21

    .line 1277
    .line 1278
    goto/16 :goto_1

    .line 1279
    .line 1280
    :cond_21
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 1281
    .line 1282
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    check-cast v1, Let7;

    .line 1287
    .line 1288
    iget-object v8, v1, Let7;->c:Lqs7;

    .line 1289
    .line 1290
    if-eqz v8, :cond_25

    .line 1291
    .line 1292
    const/16 v17, 0x0

    .line 1293
    .line 1294
    const/16 v19, 0x1ff

    .line 1295
    .line 1296
    const/4 v9, 0x0

    .line 1297
    const/4 v10, 0x0

    .line 1298
    const/4 v11, 0x0

    .line 1299
    const/4 v12, 0x0

    .line 1300
    const/4 v13, 0x0

    .line 1301
    const/4 v14, 0x0

    .line 1302
    const/4 v15, 0x0

    .line 1303
    const/16 v16, 0x0

    .line 1304
    .line 1305
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1310
    .line 1311
    .line 1312
    :cond_22
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    move-object v3, v2

    .line 1317
    check-cast v3, Let7;

    .line 1318
    .line 1319
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v3

    .line 1326
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v2

    .line 1330
    if-eqz v2, :cond_22

    .line 1331
    .line 1332
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1337
    .line 1338
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v2

    .line 1342
    check-cast v2, Let7;

    .line 1343
    .line 1344
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 1345
    .line 1346
    new-instance v3, Lzo6;

    .line 1347
    .line 1348
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 1352
    .line 1353
    .line 1354
    return-void

    .line 1355
    :cond_23
    instance-of v2, v1, Lot7;

    .line 1356
    .line 1357
    if-eqz v2, :cond_26

    .line 1358
    .line 1359
    check-cast v1, Lot7;

    .line 1360
    .line 1361
    iget-object v1, v1, Lot7;->a:Ljava/lang/String;

    .line 1362
    .line 1363
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v1

    .line 1367
    if-eqz v1, :cond_25

    .line 1368
    .line 1369
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1370
    .line 1371
    .line 1372
    move-result v1

    .line 1373
    new-instance v2, Lkf3;

    .line 1374
    .line 1375
    const/16 v8, 0x9

    .line 1376
    .line 1377
    invoke-direct {v2, v3, v8, v4}, Lif3;-><init>(III)V

    .line 1378
    .line 1379
    .line 1380
    invoke-static {v1, v2}, Lx97;->o(ILvu0;)I

    .line 1381
    .line 1382
    .line 1383
    move-result v13

    .line 1384
    iget-object v1, v6, Lh76;->X:Loh7;

    .line 1385
    .line 1386
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v1

    .line 1390
    check-cast v1, Let7;

    .line 1391
    .line 1392
    iget-object v1, v1, Let7;->c:Lqs7;

    .line 1393
    .line 1394
    if-eqz v1, :cond_25

    .line 1395
    .line 1396
    iget-object v9, v1, Lqs7;->a:Lis7;

    .line 1397
    .line 1398
    const/4 v14, 0x0

    .line 1399
    const/16 v15, 0x17

    .line 1400
    .line 1401
    const/4 v10, 0x0

    .line 1402
    const/4 v11, 0x0

    .line 1403
    const/4 v12, 0x0

    .line 1404
    invoke-static/range {v9 .. v15}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v15

    .line 1408
    const/16 v24, 0x0

    .line 1409
    .line 1410
    const/16 v25, 0x3fe

    .line 1411
    .line 1412
    const/16 v16, 0x0

    .line 1413
    .line 1414
    const/16 v17, 0x0

    .line 1415
    .line 1416
    const/16 v18, 0x0

    .line 1417
    .line 1418
    const/16 v19, 0x0

    .line 1419
    .line 1420
    const/16 v20, 0x0

    .line 1421
    .line 1422
    const/16 v21, 0x0

    .line 1423
    .line 1424
    const/16 v22, 0x0

    .line 1425
    .line 1426
    const/16 v23, 0x0

    .line 1427
    .line 1428
    move-object v14, v1

    .line 1429
    invoke-static/range {v14 .. v25}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v1

    .line 1433
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1434
    .line 1435
    .line 1436
    :cond_24
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v2

    .line 1440
    move-object v3, v2

    .line 1441
    check-cast v3, Let7;

    .line 1442
    .line 1443
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1444
    .line 1445
    .line 1446
    invoke-static {v3, v1}, Let7;->a(Let7;Lqs7;)Let7;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v3

    .line 1450
    invoke-virtual {v5, v2, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v2

    .line 1454
    if-eqz v2, :cond_24

    .line 1455
    .line 1456
    invoke-virtual {v0}, Lyt7;->e()Lzt7;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    iget-object v2, v6, Lh76;->X:Loh7;

    .line 1461
    .line 1462
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    check-cast v2, Let7;

    .line 1467
    .line 1468
    iget-object v2, v2, Let7;->a:Ljava/lang/String;

    .line 1469
    .line 1470
    new-instance v3, Lzo6;

    .line 1471
    .line 1472
    invoke-direct {v3, v1, v7}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v0, v2, v3}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 1476
    .line 1477
    .line 1478
    :cond_25
    :goto_1
    return-void

    .line 1479
    :cond_26
    instance-of v1, v1, Lmt7;

    .line 1480
    .line 1481
    if-eqz v1, :cond_27

    .line 1482
    .line 1483
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v1

    .line 1487
    new-instance v2, Lym7;

    .line 1488
    .line 1489
    invoke-direct {v2, v0, v8, v4}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 1490
    .line 1491
    .line 1492
    const/4 v0, 0x3

    .line 1493
    invoke-static {v1, v8, v2, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1494
    .line 1495
    .line 1496
    return-void

    .line 1497
    :cond_27
    invoke-static {}, Lb61;->c()V

    .line 1498
    .line 1499
    .line 1500
    return-void
.end method

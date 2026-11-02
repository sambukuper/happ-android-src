.class public final Lth4;
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
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsh4;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lsh4;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lvz7;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lth4;->b:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lsh4;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, v2}, Lsh4;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lvz7;

    .line 24
    .line 25
    invoke-direct {v2, v0}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lth4;->c:Lvz7;

    .line 29
    .line 30
    sget-object v0, Ltf4;->a:Ltf4;

    .line 31
    .line 32
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lth4;->d:Loh7;

    .line 37
    .line 38
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lth4;->e:Lh76;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    const/4 v2, 0x7

    .line 46
    invoke-static {v1, v2, v0}, Lv77;->b(IILl90;)Lu77;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lth4;->f:Lu77;

    .line 51
    .line 52
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lth4;->g:Lf76;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final e()Lkf4;
    .locals 0

    .line 1
    iget-object p0, p0, Lth4;->c:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkf4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f(Lfg4;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lag4;

    .line 6
    .line 7
    sget-object v3, Lec7;->Y:Lec7;

    .line 8
    .line 9
    iget-object v4, v0, Lth4;->b:Lvz7;

    .line 10
    .line 11
    const-string v5, "pref_logs_output_type"

    .line 12
    .line 13
    const-string v6, "pref_logs_type"

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    iget-object v8, v0, Lth4;->d:Loh7;

    .line 17
    .line 18
    if-eqz v2, :cond_b

    .line 19
    .line 20
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Luf4;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v2, Ltf4;->a:Ltf4;

    .line 34
    .line 35
    invoke-virtual {v8, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    invoke-virtual {v1, v2, v6}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    sget-object v6, Le69;->Z:Lf08;

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lf08;->i(I)Le69;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 66
    .line 67
    invoke-virtual {v1, v2, v5}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sget-object v2, Lnf4;->Y:Lk32;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v2, Lnf4;->g0:Ln22;

    .line 77
    .line 78
    invoke-static {v1, v2}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lnf4;

    .line 83
    .line 84
    if-nez v1, :cond_1

    .line 85
    .line 86
    sget-object v1, Lnf4;->Z:Lnf4;

    .line 87
    .line 88
    :cond_1
    move-object v11, v1

    .line 89
    invoke-virtual {v0}, Lth4;->e()Lkf4;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v2, Ljava/io/File;

    .line 97
    .line 98
    iget-object v1, v1, Lkf4;->g:Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 99
    .line 100
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/LogFileInfo;->c()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v4, 0x1

    .line 108
    invoke-static {v2, v4}, Lkf4;->c(Ljava/io/File;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move-object v1, v7

    .line 119
    :goto_0
    if-eqz v1, :cond_3

    .line 120
    .line 121
    invoke-static {v1}, Lsu/happ/proxyutility/dto/LogFileInfoKt;->a(Lsu/happ/proxyutility/dto/LogFileInfo;)Llf4;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    move-object v12, v1

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object v12, v7

    .line 128
    :goto_1
    invoke-virtual {v0}, Lth4;->e()Lkf4;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v2, Ljava/io/File;

    .line 136
    .line 137
    iget-object v1, v1, Lkf4;->h:Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 138
    .line 139
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/LogFileInfo;->c()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v2, v4}, Lkf4;->c(Ljava/io/File;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    move-object v1, v7

    .line 157
    :goto_2
    if-eqz v1, :cond_5

    .line 158
    .line 159
    invoke-static {v1}, Lsu/happ/proxyutility/dto/LogFileInfoKt;->a(Lsu/happ/proxyutility/dto/LogFileInfo;)Llf4;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    move-object v13, v1

    .line 164
    goto :goto_3

    .line 165
    :cond_5
    move-object v13, v7

    .line 166
    :goto_3
    invoke-virtual {v0}, Lth4;->e()Lkf4;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v2, Ljava/io/File;

    .line 174
    .line 175
    iget-object v1, v1, Lkf4;->i:Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 176
    .line 177
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/LogFileInfo;->c()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2, v4}, Lkf4;->c(Ljava/io/File;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_6

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_6
    move-object v1, v7

    .line 195
    :goto_4
    if-eqz v1, :cond_7

    .line 196
    .line 197
    invoke-static {v1}, Lsu/happ/proxyutility/dto/LogFileInfoKt;->a(Lsu/happ/proxyutility/dto/LogFileInfo;)Llf4;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    :cond_7
    move-object v14, v7

    .line 202
    invoke-virtual {v0}, Lth4;->e()Lkf4;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Lkf4;->f()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v3}, Lec7;->c()Lqm5;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_9

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 229
    .line 230
    invoke-static {v2}, Lsu/happ/proxyutility/dto/LogFileInfoKt;->a(Lsu/happ/proxyutility/dto/LogFileInfo;)Llf4;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    if-eqz v2, :cond_8

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_9
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    :cond_a
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    move-object v1, v0

    .line 249
    check-cast v1, Luf4;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    new-instance v9, Lsf4;

    .line 255
    .line 256
    const/16 v16, 0x0

    .line 257
    .line 258
    invoke-direct/range {v9 .. v16}, Lsf4;-><init>(Le69;Lnf4;Llf4;Llf4;Llf4;Lj2;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v8, v0, v9}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_a

    .line 266
    .line 267
    goto/16 :goto_b

    .line 268
    .line 269
    :cond_b
    instance-of v2, v1, Lbg4;

    .line 270
    .line 271
    if-eqz v2, :cond_f

    .line 272
    .line 273
    move-object v0, v1

    .line 274
    check-cast v0, Lbg4;

    .line 275
    .line 276
    iget-object v10, v0, Lbg4;->a:Le69;

    .line 277
    .line 278
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 283
    .line 284
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-virtual {v0, v1, v6}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    :cond_c
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    move-object v1, v0

    .line 299
    check-cast v1, Luf4;

    .line 300
    .line 301
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    instance-of v2, v1, Lsf4;

    .line 305
    .line 306
    if-eqz v2, :cond_d

    .line 307
    .line 308
    move-object v9, v1

    .line 309
    check-cast v9, Lsf4;

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const/16 v14, 0x7e

    .line 313
    .line 314
    const/4 v11, 0x0

    .line 315
    const/4 v12, 0x0

    .line 316
    invoke-static/range {v9 .. v14}, Lsf4;->a(Lsf4;Le69;Lnf4;Lj2;Ljava/lang/String;I)Lsf4;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    goto :goto_6

    .line 321
    :cond_d
    instance-of v2, v1, Ltf4;

    .line 322
    .line 323
    if-eqz v2, :cond_e

    .line 324
    .line 325
    :goto_6
    invoke-virtual {v8, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eqz v0, :cond_c

    .line 330
    .line 331
    goto/16 :goto_b

    .line 332
    .line 333
    :cond_e
    invoke-static {}, Lb61;->c()V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :cond_f
    instance-of v2, v1, Lcg4;

    .line 338
    .line 339
    if-eqz v2, :cond_13

    .line 340
    .line 341
    move-object v0, v1

    .line 342
    check-cast v0, Lcg4;

    .line 343
    .line 344
    iget-object v11, v0, Lcg4;->a:Lnf4;

    .line 345
    .line 346
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 351
    .line 352
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    invoke-virtual {v0, v1, v5}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    :cond_10
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object v1, v0

    .line 367
    check-cast v1, Luf4;

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    instance-of v2, v1, Lsf4;

    .line 373
    .line 374
    if-eqz v2, :cond_11

    .line 375
    .line 376
    move-object v9, v1

    .line 377
    check-cast v9, Lsf4;

    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    const/16 v14, 0x7d

    .line 381
    .line 382
    const/4 v10, 0x0

    .line 383
    const/4 v12, 0x0

    .line 384
    invoke-static/range {v9 .. v14}, Lsf4;->a(Lsf4;Le69;Lnf4;Lj2;Ljava/lang/String;I)Lsf4;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    goto :goto_7

    .line 389
    :cond_11
    instance-of v2, v1, Ltf4;

    .line 390
    .line 391
    if-eqz v2, :cond_12

    .line 392
    .line 393
    :goto_7
    invoke-virtual {v8, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-eqz v0, :cond_10

    .line 398
    .line 399
    goto/16 :goto_b

    .line 400
    .line 401
    :cond_12
    invoke-static {}, Lb61;->c()V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_13
    instance-of v2, v1, Leg4;

    .line 406
    .line 407
    const/4 v4, 0x3

    .line 408
    if-eqz v2, :cond_14

    .line 409
    .line 410
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    new-instance v2, Lr5;

    .line 415
    .line 416
    const/16 v3, 0x12

    .line 417
    .line 418
    invoke-direct {v2, v0, v7, v3}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 419
    .line 420
    .line 421
    invoke-static {v1, v7, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_14
    instance-of v2, v1, Ldg4;

    .line 426
    .line 427
    if-eqz v2, :cond_15

    .line 428
    .line 429
    check-cast v1, Ldg4;

    .line 430
    .line 431
    iget-object v1, v1, Ldg4;->a:Llf4;

    .line 432
    .line 433
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    new-instance v3, Ljy2;

    .line 438
    .line 439
    const/4 v5, 0x7

    .line 440
    invoke-direct {v3, v0, v1, v7, v5}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 441
    .line 442
    .line 443
    invoke-static {v2, v7, v3, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :cond_15
    instance-of v2, v1, Lzf4;

    .line 448
    .line 449
    if-eqz v2, :cond_19

    .line 450
    .line 451
    move-object v0, v1

    .line 452
    check-cast v0, Lzf4;

    .line 453
    .line 454
    iget-object v5, v0, Lzf4;->a:Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    :cond_16
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    move-object v1, v0

    .line 464
    check-cast v1, Luf4;

    .line 465
    .line 466
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    instance-of v2, v1, Lsf4;

    .line 470
    .line 471
    if-eqz v2, :cond_17

    .line 472
    .line 473
    check-cast v1, Lsf4;

    .line 474
    .line 475
    const/4 v4, 0x0

    .line 476
    const/16 v6, 0x3f

    .line 477
    .line 478
    const/4 v2, 0x0

    .line 479
    const/4 v3, 0x0

    .line 480
    invoke-static/range {v1 .. v6}, Lsf4;->a(Lsf4;Le69;Lnf4;Lj2;Ljava/lang/String;I)Lsf4;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    goto :goto_8

    .line 485
    :cond_17
    instance-of v2, v1, Ltf4;

    .line 486
    .line 487
    if-eqz v2, :cond_18

    .line 488
    .line 489
    :goto_8
    invoke-virtual {v8, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_16

    .line 494
    .line 495
    goto :goto_b

    .line 496
    :cond_18
    invoke-static {}, Lb61;->c()V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :cond_19
    instance-of v2, v1, Lyf4;

    .line 501
    .line 502
    if-eqz v2, :cond_1f

    .line 503
    .line 504
    check-cast v1, Lyf4;

    .line 505
    .line 506
    iget-object v1, v1, Lyf4;->a:Ljava/lang/String;

    .line 507
    .line 508
    invoke-virtual {v0}, Lth4;->e()Lkf4;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v2, v1}, Lkf4;->j(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0}, Lth4;->e()Lkf4;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0}, Lkf4;->f()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v3}, Lec7;->c()Lqm5;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    :cond_1a
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-eqz v2, :cond_1b

    .line 536
    .line 537
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    check-cast v2, Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 542
    .line 543
    invoke-static {v2}, Lsu/happ/proxyutility/dto/LogFileInfoKt;->a(Lsu/happ/proxyutility/dto/LogFileInfo;)Llf4;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    if-eqz v2, :cond_1a

    .line 548
    .line 549
    invoke-virtual {v1, v2}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    goto :goto_9

    .line 553
    :cond_1b
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    :cond_1c
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    move-object v1, v0

    .line 565
    check-cast v1, Luf4;

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    instance-of v2, v1, Lsf4;

    .line 571
    .line 572
    if-eqz v2, :cond_1d

    .line 573
    .line 574
    move-object v9, v1

    .line 575
    check-cast v9, Lsf4;

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    const/16 v14, 0x5f

    .line 579
    .line 580
    const/4 v10, 0x0

    .line 581
    const/4 v11, 0x0

    .line 582
    invoke-static/range {v9 .. v14}, Lsf4;->a(Lsf4;Le69;Lnf4;Lj2;Ljava/lang/String;I)Lsf4;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    goto :goto_a

    .line 587
    :cond_1d
    instance-of v2, v1, Ltf4;

    .line 588
    .line 589
    if-eqz v2, :cond_1e

    .line 590
    .line 591
    :goto_a
    invoke-virtual {v8, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    if-eqz v0, :cond_1c

    .line 596
    .line 597
    :goto_b
    return-void

    .line 598
    :cond_1e
    invoke-static {}, Lb61;->c()V

    .line 599
    .line 600
    .line 601
    return-void

    .line 602
    :cond_1f
    invoke-static {}, Lb61;->c()V

    .line 603
    .line 604
    .line 605
    return-void
.end method

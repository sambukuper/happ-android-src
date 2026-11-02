.class public final Lvq8;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Ljava/util/LinkedHashSet;

.field public final synthetic i0:Z

.field public final synthetic j0:Lwq8;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;ZLwq8;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvq8;->h0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iput-boolean p2, p0, Lvq8;->i0:Z

    .line 4
    .line 5
    iput-object p3, p0, Lvq8;->j0:Lwq8;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq51;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lvq8;->m(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvq8;

    .line 8
    .line 9
    sget-object p1, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lvq8;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final m(Lq51;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Lvq8;

    .line 2
    .line 3
    iget-boolean v1, p0, Lvq8;->i0:Z

    .line 4
    .line 5
    iget-object v2, p0, Lvq8;->j0:Lwq8;

    .line 6
    .line 7
    iget-object p0, p0, Lvq8;->h0:Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lvq8;-><init>(Ljava/util/LinkedHashSet;ZLwq8;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lvq8;->j0:Lwq8;

    .line 4
    .line 5
    iget-object v2, v1, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iget-boolean v3, v0, Lvq8;->g0:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v8, 0x1

    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    if-ne v3, v8, :cond_0

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v4

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string v3, "CXCP"

    .line 29
    .line 30
    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    new-instance v5, Lh57;

    .line 34
    .line 35
    iget-object v6, v0, Lvq8;->h0:Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    iget-boolean v7, v0, Lvq8;->i0:Z

    .line 38
    .line 39
    invoke-direct {v5, v6, v7}, Lh57;-><init>(Ljava/util/Collection;Z)V

    .line 40
    .line 41
    .line 42
    iget-object v6, v5, Lh57;->e:Lvz7;

    .line 43
    .line 44
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Le57;

    .line 49
    .line 50
    invoke-virtual {v6}, Le57;->c()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    iget-object v4, v5, Lh57;->f:Lvz7;

    .line 57
    .line 58
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lf57;

    .line 63
    .line 64
    :cond_2
    if-nez v4, :cond_4

    .line 65
    .line 66
    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v5, Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lk05;->j()Lk05;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-instance v7, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {}, La15;->a()La15;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    new-instance v10, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v11, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v12, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v13, Lf57;

    .line 108
    .line 109
    new-instance v14, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 112
    .line 113
    .line 114
    new-instance v15, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 117
    .line 118
    .line 119
    new-instance v4, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v4, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 122
    .line 123
    .line 124
    new-instance v11, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    new-instance v18, Lym0;

    .line 130
    .line 131
    move-object v10, v6

    .line 132
    new-instance v6, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v10}, Lqd5;->c(Ll11;)Lqd5;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    new-instance v10, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    sget-object v7, Ld18;->b:Ld18;

    .line 147
    .line 148
    new-instance v7, Landroid/util/ArrayMap;

    .line 149
    .line 150
    invoke-direct {v7}, Landroid/util/ArrayMap;-><init>()V

    .line 151
    .line 152
    .line 153
    iget-object v9, v9, Ld18;->a:Landroid/util/ArrayMap;

    .line 154
    .line 155
    invoke-virtual {v9}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-eqz v16, :cond_3

    .line 168
    .line 169
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    move-object/from16 v8, v16

    .line 174
    .line 175
    check-cast v8, Ljava/lang/String;

    .line 176
    .line 177
    move-object/from16 p1, v3

    .line 178
    .line 179
    invoke-virtual {v9, v8}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v7, v8, v3}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-object/from16 v3, p1

    .line 187
    .line 188
    const/4 v8, 0x1

    .line 189
    goto :goto_0

    .line 190
    :cond_3
    move-object/from16 p1, v3

    .line 191
    .line 192
    new-instance v3, Ld18;

    .line 193
    .line 194
    invoke-direct {v3, v7}, Ld18;-><init>(Landroid/util/ArrayMap;)V

    .line 195
    .line 196
    .line 197
    move-object v7, v5

    .line 198
    move-object v9, v10

    .line 199
    move-object/from16 v5, v18

    .line 200
    .line 201
    const/4 v8, 0x1

    .line 202
    move-object v10, v3

    .line 203
    invoke-direct/range {v5 .. v10}, Lym0;-><init>(Ljava/util/ArrayList;Lqd5;ILjava/util/ArrayList;Ld18;)V

    .line 204
    .line 205
    .line 206
    const/16 v19, 0x0

    .line 207
    .line 208
    const/16 v20, 0x0

    .line 209
    .line 210
    const/16 v21, 0x0

    .line 211
    .line 212
    const/16 v22, 0x0

    .line 213
    .line 214
    move-object/from16 v16, v4

    .line 215
    .line 216
    move-object/from16 v17, v11

    .line 217
    .line 218
    invoke-direct/range {v13 .. v22}, Lf57;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lym0;Ld57;Landroid/hardware/camera2/params/InputConfiguration;ILfz;)V

    .line 219
    .line 220
    .line 221
    move-object v4, v13

    .line 222
    goto :goto_1

    .line 223
    :cond_4
    move-object/from16 p1, v3

    .line 224
    .line 225
    :goto_1
    iget-object v3, v4, Lf57;->g:Lym0;

    .line 226
    .line 227
    invoke-static/range {p1 .. p1}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    sget-object v4, Lwq8;->l:Lux0;

    .line 231
    .line 232
    iget-object v4, v1, Lwq8;->e:Lpr8;

    .line 233
    .line 234
    iget-object v4, v4, Lpr8;->e:Lob;

    .line 235
    .line 236
    new-instance v5, Lsq8;

    .line 237
    .line 238
    new-instance v6, Lfg0;

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    invoke-direct {v6, v7}, Lfg0;-><init>(B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3}, Lym0;->a()Landroid/util/Range;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    sget-object v10, Liz;->h:Landroid/util/Range;

    .line 249
    .line 250
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-nez v9, :cond_5

    .line 255
    .line 256
    sget-object v9, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Lym0;->a()Landroid/util/Range;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    invoke-static {v9}, Lw45;->B(Landroid/hardware/camera2/CaptureRequest$Key;)Lzx;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    iget-object v11, v6, Lfg0;->Y:Lk05;

    .line 270
    .line 271
    invoke-virtual {v11, v9, v10}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_5
    iget-object v9, v3, Lym0;->b:Lqd5;

    .line 275
    .line 276
    invoke-virtual {v6, v9}, Lfg0;->c(Ll11;)V

    .line 277
    .line 278
    .line 279
    iget-object v9, v3, Lym0;->e:Ld18;

    .line 280
    .line 281
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 282
    .line 283
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 284
    .line 285
    .line 286
    iget-object v9, v9, Ld18;->a:Landroid/util/ArrayMap;

    .line 287
    .line 288
    invoke-virtual {v9}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    check-cast v11, Ljava/lang/Iterable;

    .line 296
    .line 297
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    if-eqz v12, :cond_6

    .line 306
    .line 307
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    check-cast v12, Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {v9, v12}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-interface {v10, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_6
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 325
    .line 326
    invoke-direct {v9, v10}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object v10, v3, Lym0;->d:Ljava/util/List;

    .line 333
    .line 334
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    new-instance v11, Lwg0;

    .line 338
    .line 339
    invoke-direct {v11}, Lwg0;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    if-eqz v12, :cond_7

    .line 351
    .line 352
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v12

    .line 356
    check-cast v12, Lxg0;

    .line 357
    .line 358
    invoke-virtual {v11, v12, v4}, Lwg0;->a(Lxg0;Ljava/util/concurrent/Executor;)V

    .line 359
    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_7
    const/4 v4, 0x1

    .line 363
    new-array v10, v4, [Lme6;

    .line 364
    .line 365
    aput-object v11, v10, v7

    .line 366
    .line 367
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 368
    .line 369
    invoke-static {v4}, Laq4;->G(I)I

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    invoke-direct {v7, v4}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-static {v10, v7}, Leu;->I0([Ljava/lang/Object;Ljava/util/HashSet;)V

    .line 377
    .line 378
    .line 379
    iget v4, v3, Lym0;->c:I

    .line 380
    .line 381
    new-instance v10, Lwe6;

    .line 382
    .line 383
    invoke-direct {v10, v4}, Lwe6;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-direct {v5, v6, v9, v7, v10}, Lsq8;-><init>(Lfg0;Ljava/util/Map;Ljava/util/Set;Lwe6;)V

    .line 387
    .line 388
    .line 389
    sget-object v4, Lpq8;->X:Lpq8;

    .line 390
    .line 391
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    iget-object v4, v1, Lwq8;->c:Ljr8;

    .line 395
    .line 396
    iget-object v3, v3, Lym0;->a:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v4, v3}, Ljr8;->b(Ljava/util/List;)Ljava/util/LinkedHashSet;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    invoke-static/range {p1 .. p1}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 410
    .line 411
    .line 412
    invoke-static {v2}, Lwq8;->j(Ljava/util/LinkedHashMap;)Lsq8;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    iput-boolean v8, v0, Lvq8;->g0:Z

    .line 417
    .line 418
    invoke-virtual {v1, v2, v3, v0}, Lwq8;->m(Lsq8;Ljava/util/LinkedHashSet;Ls51;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    sget-object v1, Lc71;->X:Lc71;

    .line 423
    .line 424
    if-ne v0, v1, :cond_8

    .line 425
    .line 426
    return-object v1

    .line 427
    :cond_8
    return-object v0
.end method

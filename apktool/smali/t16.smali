.class public final synthetic Lt16;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, Lt16;->X:B

    iput-object p1, p0, Lt16;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmn6;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;)V
    .locals 0

    .line 1
    const/4 p1, 0x7

    .line 2
    iput-byte p1, p0, Lt16;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lt16;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Lt16;->X:B

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    iget-object v0, v0, Lt16;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;

    .line 16
    .line 17
    check-cast v1, Ljava/io/PrintWriter;

    .line 18
    .line 19
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v0, v0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 24
    .line 25
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 26
    .line 27
    const-string v3, "subIdData"

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v2, " SubscriptionUpdater done: "

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Ldn8;->a:Ldn8;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    check-cast v0, Lwu7;

    .line 60
    .line 61
    check-cast v1, Lu95;

    .line 62
    .line 63
    sget-object v2, Lwu7;->y1:Lcom/google/gson/a;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v5, v5}, Lsn1;->R(ZZ)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Ldn8;->a:Ldn8;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_1
    check-cast v0, Lzt7;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v0, v0, Lzt7;->b:Lcom/tencent/mmkv/MMKV;

    .line 79
    .line 80
    invoke-virtual {v0, v1, v6}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    sget-object v2, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-string v2, "Server-List"

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_0

    .line 101
    .line 102
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_0
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 107
    .line 108
    invoke-direct {v2, v1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v6, Lqg5;

    .line 112
    .line 113
    invoke-direct {v6, v2, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    return-object v6

    .line 117
    :pswitch_2
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 118
    .line 119
    check-cast v1, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Ldn8;->a:Ldn8;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_3
    check-cast v0, Lpv3;

    .line 131
    .line 132
    check-cast v1, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    check-cast v0, Lgn2;

    .line 138
    .line 139
    new-instance v2, Llo7;

    .line 140
    .line 141
    invoke-direct {v2, v1}, Llo7;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    sget-object v0, Ldn8;->a:Ldn8;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_4
    move-object v11, v0

    .line 151
    check-cast v11, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 152
    .line 153
    check-cast v1, Lqs7;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    const/4 v10, 0x0

    .line 159
    const/16 v12, 0x1ff

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    const/4 v3, 0x0

    .line 163
    const/4 v4, 0x0

    .line 164
    const/4 v5, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    const/4 v9, 0x0

    .line 169
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_5
    check-cast v0, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 175
    .line 176
    move-object v8, v1

    .line 177
    check-cast v8, Lqs7;

    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object v1, v8, Lqs7;->d:Lfs7;

    .line 183
    .line 184
    invoke-static {v1, v5, v0, v7}, Lfs7;->a(Lfs7;ZLsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;I)Lfs7;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    const/16 v19, 0x3f7

    .line 191
    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v10, 0x0

    .line 194
    const/4 v11, 0x0

    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    const/16 v16, 0x0

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_6
    check-cast v0, Lyr6;

    .line 208
    .line 209
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    sget-object v2, Ll49;->z:Lem7;

    .line 215
    .line 216
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->t()Lt66;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-string v8, "))"

    .line 221
    .line 222
    const-string v9, ")"

    .line 223
    .line 224
    const-string v10, " AND"

    .line 225
    .line 226
    iget-object v11, v0, Lyr6;->Z:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v11, Ljava/util/ArrayList;

    .line 229
    .line 230
    iget-object v12, v0, Lyr6;->f0:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v12, Ljava/util/ArrayList;

    .line 233
    .line 234
    iget-object v13, v0, Lyr6;->Y:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v13, Ljava/util/ArrayList;

    .line 237
    .line 238
    new-instance v14, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    new-instance v15, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v6, "SELECT * FROM workspec"

    .line 246
    .line 247
    invoke-direct {v15, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const-string v6, " WHERE"

    .line 251
    .line 252
    iget-object v0, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Ljava/util/ArrayList;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v17

    .line 260
    const/16 v3, 0xa

    .line 261
    .line 262
    if-nez v17, :cond_3

    .line 263
    .line 264
    new-instance v6, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-static {v0, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_2

    .line 282
    .line 283
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    check-cast v4, Lu39;

    .line 288
    .line 289
    invoke-static {v4}, La28;->u(Lu39;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_0

    .line 301
    :cond_2
    const-string v0, " WHERE state IN ("

    .line 302
    .line 303
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    invoke-static {v0, v15}, Lwl7;->n(ILjava/lang/StringBuilder;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 317
    .line 318
    .line 319
    move-object v6, v10

    .line 320
    :cond_3
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_5

    .line 325
    .line 326
    new-instance v0, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-static {v13, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_4

    .line 344
    .line 345
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    check-cast v4, Ljava/util/UUID;

    .line 350
    .line 351
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_1

    .line 359
    :cond_4
    const-string v3, " id IN ("

    .line 360
    .line 361
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    invoke-static {v3, v15}, Lwl7;->n(ILjava/lang/StringBuilder;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 379
    .line 380
    .line 381
    move-object v6, v10

    .line 382
    :cond_5
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-nez v0, :cond_6

    .line 387
    .line 388
    const-string v0, " id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("

    .line 389
    .line 390
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    invoke-static {v0, v15}, Lwl7;->n(ILjava/lang/StringBuilder;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 408
    .line 409
    .line 410
    goto :goto_2

    .line 411
    :cond_6
    move-object v10, v6

    .line 412
    :goto_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-nez v0, :cond_7

    .line 417
    .line 418
    const-string v0, " id IN (SELECT work_spec_id FROM workname WHERE name IN ("

    .line 419
    .line 420
    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    invoke-static {v0, v15}, Lwl7;->n(ILjava/lang/StringBuilder;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 438
    .line 439
    .line 440
    :cond_7
    const-string v0, ";"

    .line 441
    .line 442
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    new-array v3, v5, [Ljava/lang/Object;

    .line 450
    .line 451
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    sget-object v4, Lsl6;->j0:Ljava/util/TreeMap;

    .line 459
    .line 460
    if-eqz v3, :cond_8

    .line 461
    .line 462
    array-length v4, v3

    .line 463
    goto :goto_3

    .line 464
    :cond_8
    move v4, v5

    .line 465
    :goto_3
    sget-object v6, Lsl6;->j0:Ljava/util/TreeMap;

    .line 466
    .line 467
    monitor-enter v6

    .line 468
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    invoke-virtual {v6, v8}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    if-eqz v8, :cond_9

    .line 477
    .line 478
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v9

    .line 482
    invoke-virtual {v6, v9}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    check-cast v8, Lsl6;

    .line 490
    .line 491
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    iput-object v0, v8, Lsl6;->X:Ljava/lang/String;

    .line 495
    .line 496
    iput v4, v8, Lsl6;->i0:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 497
    .line 498
    monitor-exit v6

    .line 499
    goto :goto_4

    .line 500
    :catchall_0
    move-exception v0

    .line 501
    goto :goto_6

    .line 502
    :cond_9
    monitor-exit v6

    .line 503
    new-instance v8, Lsl6;

    .line 504
    .line 505
    invoke-direct {v8, v4}, Lsl6;-><init>(I)V

    .line 506
    .line 507
    .line 508
    iput-object v0, v8, Lsl6;->X:Ljava/lang/String;

    .line 509
    .line 510
    iput v4, v8, Lsl6;->i0:I

    .line 511
    .line 512
    :goto_4
    new-instance v0, Lym2;

    .line 513
    .line 514
    invoke-direct {v0, v8, v7}, Lym2;-><init>(Ljava/io/Closeable;B)V

    .line 515
    .line 516
    .line 517
    invoke-static {v0, v3}, Lci8;->j(Ldx7;[Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    new-instance v0, Ly45;

    .line 521
    .line 522
    iget-object v3, v8, Lsl6;->X:Ljava/lang/String;

    .line 523
    .line 524
    if-eqz v3, :cond_a

    .line 525
    .line 526
    move-object v6, v3

    .line 527
    goto :goto_5

    .line 528
    :cond_a
    const-string v3, "Required value was null."

    .line 529
    .line 530
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    const/4 v6, 0x0

    .line 534
    :goto_5
    new-instance v3, Lt16;

    .line 535
    .line 536
    const/4 v4, 0x5

    .line 537
    invoke-direct {v3, v8, v4}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 538
    .line 539
    .line 540
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 541
    .line 542
    .line 543
    new-instance v4, Lt16;

    .line 544
    .line 545
    const/4 v8, 0x4

    .line 546
    invoke-direct {v4, v3, v8}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 547
    .line 548
    .line 549
    iput-object v4, v0, Ly45;->X:Ljava/lang/Object;

    .line 550
    .line 551
    iget-object v3, v1, Lt66;->a:Lql6;

    .line 552
    .line 553
    new-instance v4, Lsn;

    .line 554
    .line 555
    const/16 v8, 0x14

    .line 556
    .line 557
    invoke-direct {v4, v6, v0, v1, v8}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 558
    .line 559
    .line 560
    invoke-static {v3, v7, v5, v4}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    check-cast v0, Ljava/util/List;

    .line 565
    .line 566
    invoke-virtual {v2, v0}, Lem7;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    check-cast v0, Ljava/util/List;

    .line 574
    .line 575
    return-object v0

    .line 576
    :goto_6
    monitor-exit v6

    .line 577
    throw v0

    .line 578
    :pswitch_7
    check-cast v0, Lxd7;

    .line 579
    .line 580
    iget-object v2, v0, Lxd7;->g:Ljava/lang/Object;

    .line 581
    .line 582
    monitor-enter v2

    .line 583
    :try_start_1
    iget-object v0, v0, Lxd7;->i:Lwd7;

    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    iget-object v3, v0, Lwd7;->b:Ljava/lang/Object;

    .line 589
    .line 590
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    iget v4, v0, Lwd7;->d:I

    .line 594
    .line 595
    iget-object v5, v0, Lwd7;->c:Lf05;

    .line 596
    .line 597
    if-nez v5, :cond_b

    .line 598
    .line 599
    new-instance v5, Lf05;

    .line 600
    .line 601
    invoke-direct {v5}, Lf05;-><init>()V

    .line 602
    .line 603
    .line 604
    iput-object v5, v0, Lwd7;->c:Lf05;

    .line 605
    .line 606
    iget-object v6, v0, Lwd7;->f:Ls05;

    .line 607
    .line 608
    invoke-virtual {v6, v3, v5}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    :cond_b
    invoke-virtual {v0, v1, v4, v3, v5}, Lwd7;->b(Ljava/lang/Object;ILjava/lang/Object;Lf05;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 612
    .line 613
    .line 614
    monitor-exit v2

    .line 615
    sget-object v0, Ldn8;->a:Ldn8;

    .line 616
    .line 617
    return-object v0

    .line 618
    :catchall_1
    move-exception v0

    .line 619
    monitor-exit v2

    .line 620
    throw v0

    .line 621
    :pswitch_8
    check-cast v0, Lna7;

    .line 622
    .line 623
    iget-object v2, v0, Lna7;->j0:Ln17;

    .line 624
    .line 625
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    iget-object v3, v0, Lna7;->j0:Ln17;

    .line 629
    .line 630
    invoke-static {v3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    if-nez v2, :cond_c

    .line 635
    .line 636
    const-string v2, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 637
    .line 638
    invoke-static {v2}, Lwr5;->b(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    :cond_c
    iget-object v2, v0, Lna7;->i0:Lt05;

    .line 642
    .line 643
    iget-object v3, v0, Lna7;->g0:Ljava/lang/Object;

    .line 644
    .line 645
    if-nez v2, :cond_e

    .line 646
    .line 647
    if-nez v3, :cond_d

    .line 648
    .line 649
    iput-object v1, v0, Lna7;->g0:Ljava/lang/Object;

    .line 650
    .line 651
    goto :goto_8

    .line 652
    :cond_d
    sget-object v2, Lvw6;->a:Lt05;

    .line 653
    .line 654
    new-instance v2, Lt05;

    .line 655
    .line 656
    invoke-direct {v2}, Lt05;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2, v3}, Lt05;->a(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v1}, Lt05;->a(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    iput-object v2, v0, Lna7;->i0:Lt05;

    .line 666
    .line 667
    const/4 v1, 0x0

    .line 668
    iput-object v1, v0, Lna7;->g0:Ljava/lang/Object;

    .line 669
    .line 670
    goto :goto_8

    .line 671
    :cond_e
    if-nez v3, :cond_f

    .line 672
    .line 673
    goto :goto_7

    .line 674
    :cond_f
    const-string v0, "workingSoleWatchedObject must be null when workingWatchSet is non-null"

    .line 675
    .line 676
    invoke-static {v0}, Lwr5;->b(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    :goto_7
    invoke-virtual {v2, v1}, Lt05;->a(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    :goto_8
    sget-object v0, Ldn8;->a:Ldn8;

    .line 683
    .line 684
    return-object v0

    .line 685
    :pswitch_9
    check-cast v0, Lr97;

    .line 686
    .line 687
    check-cast v1, Lpk6;

    .line 688
    .line 689
    iget v2, v0, Lr97;->q0:F

    .line 690
    .line 691
    invoke-virtual {v1, v2}, Lpk6;->g(F)V

    .line 692
    .line 693
    .line 694
    iget v2, v0, Lr97;->r0:F

    .line 695
    .line 696
    invoke-virtual {v1, v2}, Lpk6;->h(F)V

    .line 697
    .line 698
    .line 699
    iget v2, v0, Lr97;->s0:F

    .line 700
    .line 701
    invoke-virtual {v1, v2}, Lpk6;->b(F)V

    .line 702
    .line 703
    .line 704
    iget v2, v0, Lr97;->t0:F

    .line 705
    .line 706
    invoke-virtual {v1, v2}, Lpk6;->n(F)V

    .line 707
    .line 708
    .line 709
    iget v2, v0, Lr97;->u0:F

    .line 710
    .line 711
    invoke-virtual {v1, v2}, Lpk6;->o(F)V

    .line 712
    .line 713
    .line 714
    iget v2, v0, Lr97;->v0:F

    .line 715
    .line 716
    invoke-virtual {v1, v2}, Lpk6;->j(F)V

    .line 717
    .line 718
    .line 719
    iget v2, v0, Lr97;->w0:F

    .line 720
    .line 721
    iget v3, v1, Lpk6;->l0:F

    .line 722
    .line 723
    cmpg-float v3, v3, v2

    .line 724
    .line 725
    if-nez v3, :cond_10

    .line 726
    .line 727
    goto :goto_9

    .line 728
    :cond_10
    iget v3, v1, Lpk6;->X:I

    .line 729
    .line 730
    or-int/lit16 v3, v3, 0x100

    .line 731
    .line 732
    iput v3, v1, Lpk6;->X:I

    .line 733
    .line 734
    iput v2, v1, Lpk6;->l0:F

    .line 735
    .line 736
    :goto_9
    iget v2, v0, Lr97;->x0:F

    .line 737
    .line 738
    iget v3, v1, Lpk6;->m0:F

    .line 739
    .line 740
    cmpg-float v3, v3, v2

    .line 741
    .line 742
    if-nez v3, :cond_11

    .line 743
    .line 744
    goto :goto_a

    .line 745
    :cond_11
    iget v3, v1, Lpk6;->X:I

    .line 746
    .line 747
    or-int/lit16 v3, v3, 0x200

    .line 748
    .line 749
    iput v3, v1, Lpk6;->X:I

    .line 750
    .line 751
    iput v2, v1, Lpk6;->m0:F

    .line 752
    .line 753
    :goto_a
    iget v2, v0, Lr97;->y0:F

    .line 754
    .line 755
    iget v3, v1, Lpk6;->n0:F

    .line 756
    .line 757
    cmpg-float v3, v3, v2

    .line 758
    .line 759
    if-nez v3, :cond_12

    .line 760
    .line 761
    goto :goto_b

    .line 762
    :cond_12
    iget v3, v1, Lpk6;->X:I

    .line 763
    .line 764
    or-int/lit16 v3, v3, 0x400

    .line 765
    .line 766
    iput v3, v1, Lpk6;->X:I

    .line 767
    .line 768
    iput v2, v1, Lpk6;->n0:F

    .line 769
    .line 770
    :goto_b
    iget v2, v0, Lr97;->z0:F

    .line 771
    .line 772
    iget v3, v1, Lpk6;->o0:F

    .line 773
    .line 774
    cmpg-float v3, v3, v2

    .line 775
    .line 776
    if-nez v3, :cond_13

    .line 777
    .line 778
    goto :goto_c

    .line 779
    :cond_13
    iget v3, v1, Lpk6;->X:I

    .line 780
    .line 781
    or-int/lit16 v3, v3, 0x800

    .line 782
    .line 783
    iput v3, v1, Lpk6;->X:I

    .line 784
    .line 785
    iput v2, v1, Lpk6;->o0:F

    .line 786
    .line 787
    :goto_c
    iget-wide v2, v0, Lr97;->A0:J

    .line 788
    .line 789
    invoke-virtual {v1, v2, v3}, Lpk6;->m(J)V

    .line 790
    .line 791
    .line 792
    iget-object v2, v0, Lr97;->B0:Lx67;

    .line 793
    .line 794
    invoke-virtual {v1, v2}, Lpk6;->k(Lx67;)V

    .line 795
    .line 796
    .line 797
    iget-boolean v2, v0, Lr97;->C0:Z

    .line 798
    .line 799
    invoke-virtual {v1, v2}, Lpk6;->d(Z)V

    .line 800
    .line 801
    .line 802
    iget-object v2, v0, Lr97;->D0:Lo60;

    .line 803
    .line 804
    iget-object v3, v1, Lpk6;->x0:Lo60;

    .line 805
    .line 806
    invoke-static {v3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    if-nez v3, :cond_14

    .line 811
    .line 812
    iget v3, v1, Lpk6;->X:I

    .line 813
    .line 814
    const/high16 v4, 0x20000

    .line 815
    .line 816
    or-int/2addr v3, v4

    .line 817
    iput v3, v1, Lpk6;->X:I

    .line 818
    .line 819
    iput-object v2, v1, Lpk6;->x0:Lo60;

    .line 820
    .line 821
    :cond_14
    iget-wide v2, v0, Lr97;->E0:J

    .line 822
    .line 823
    invoke-virtual {v1, v2, v3}, Lpk6;->c(J)V

    .line 824
    .line 825
    .line 826
    iget-wide v2, v0, Lr97;->F0:J

    .line 827
    .line 828
    invoke-virtual {v1, v2, v3}, Lpk6;->l(J)V

    .line 829
    .line 830
    .line 831
    iget v2, v0, Lr97;->G0:I

    .line 832
    .line 833
    iget v3, v1, Lpk6;->s0:I

    .line 834
    .line 835
    if-ne v3, v2, :cond_15

    .line 836
    .line 837
    goto :goto_d

    .line 838
    :cond_15
    iget v3, v1, Lpk6;->X:I

    .line 839
    .line 840
    const v4, 0x8000

    .line 841
    .line 842
    .line 843
    or-int/2addr v3, v4

    .line 844
    iput v3, v1, Lpk6;->X:I

    .line 845
    .line 846
    iput v2, v1, Lpk6;->s0:I

    .line 847
    .line 848
    :goto_d
    iget v2, v0, Lr97;->H0:I

    .line 849
    .line 850
    iget v3, v1, Lpk6;->z0:I

    .line 851
    .line 852
    if-ne v3, v2, :cond_16

    .line 853
    .line 854
    goto :goto_e

    .line 855
    :cond_16
    iget v3, v1, Lpk6;->X:I

    .line 856
    .line 857
    const/high16 v4, 0x80000

    .line 858
    .line 859
    or-int/2addr v3, v4

    .line 860
    iput v3, v1, Lpk6;->X:I

    .line 861
    .line 862
    iput v2, v1, Lpk6;->z0:I

    .line 863
    .line 864
    :goto_e
    iget-object v2, v0, Lr97;->I0:Lg60;

    .line 865
    .line 866
    iget-object v3, v1, Lpk6;->y0:Lg60;

    .line 867
    .line 868
    invoke-static {v3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    if-nez v3, :cond_17

    .line 873
    .line 874
    iget v3, v1, Lpk6;->X:I

    .line 875
    .line 876
    const/high16 v4, 0x40000

    .line 877
    .line 878
    or-int/2addr v3, v4

    .line 879
    iput v3, v1, Lpk6;->X:I

    .line 880
    .line 881
    iput-object v2, v1, Lpk6;->y0:Lg60;

    .line 882
    .line 883
    :cond_17
    iget-object v0, v0, Lr97;->J0:Lu24;

    .line 884
    .line 885
    invoke-virtual {v1, v0}, Lpk6;->f(Lu24;)V

    .line 886
    .line 887
    .line 888
    sget-object v0, Ldn8;->a:Ldn8;

    .line 889
    .line 890
    return-object v0

    .line 891
    :pswitch_a
    check-cast v0, Lu67;

    .line 892
    .line 893
    check-cast v1, Lpk6;

    .line 894
    .line 895
    iget v2, v0, Lu67;->X:F

    .line 896
    .line 897
    iget-object v3, v1, Lpk6;->v0:Lfi1;

    .line 898
    .line 899
    invoke-interface {v3}, Lfi1;->getDensity()F

    .line 900
    .line 901
    .line 902
    move-result v3

    .line 903
    mul-float/2addr v3, v2

    .line 904
    invoke-virtual {v1, v3}, Lpk6;->j(F)V

    .line 905
    .line 906
    .line 907
    iget-object v2, v0, Lu67;->Y:Ljm6;

    .line 908
    .line 909
    invoke-virtual {v1, v2}, Lpk6;->k(Lx67;)V

    .line 910
    .line 911
    .line 912
    iget-boolean v2, v0, Lu67;->Z:Z

    .line 913
    .line 914
    invoke-virtual {v1, v2}, Lpk6;->d(Z)V

    .line 915
    .line 916
    .line 917
    iget-wide v2, v0, Lu67;->f0:J

    .line 918
    .line 919
    invoke-virtual {v1, v2, v3}, Lpk6;->c(J)V

    .line 920
    .line 921
    .line 922
    iget-wide v2, v0, Lu67;->g0:J

    .line 923
    .line 924
    invoke-virtual {v1, v2, v3}, Lpk6;->l(J)V

    .line 925
    .line 926
    .line 927
    sget-object v0, Ldn8;->a:Ldn8;

    .line 928
    .line 929
    return-object v0

    .line 930
    :pswitch_b
    check-cast v0, Lsu/happ/proxyutility/ui/ServerActivity;

    .line 931
    .line 932
    check-cast v1, Ljava/lang/Integer;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 935
    .line 936
    .line 937
    move-result v1

    .line 938
    iget-object v2, v0, Lsu/happ/proxyutility/ui/ServerActivity;->a2:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 939
    .line 940
    if-nez v1, :cond_1b

    .line 941
    .line 942
    const/16 v1, 0x8

    .line 943
    .line 944
    if-eqz v2, :cond_18

    .line 945
    .line 946
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 947
    .line 948
    .line 949
    :cond_18
    iget-object v2, v0, Lsu/happ/proxyutility/ui/ServerActivity;->d2:Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 950
    .line 951
    if-eqz v2, :cond_19

    .line 952
    .line 953
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 954
    .line 955
    .line 956
    :cond_19
    iget-object v2, v0, Lsu/happ/proxyutility/ui/ServerActivity;->e2:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 957
    .line 958
    if-eqz v2, :cond_1a

    .line 959
    .line 960
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 961
    .line 962
    .line 963
    :cond_1a
    iget-object v0, v0, Lsu/happ/proxyutility/ui/ServerActivity;->h2:Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 964
    .line 965
    if-eqz v0, :cond_1f

    .line 966
    .line 967
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 968
    .line 969
    .line 970
    goto :goto_f

    .line 971
    :cond_1b
    if-eqz v2, :cond_1c

    .line 972
    .line 973
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 974
    .line 975
    .line 976
    :cond_1c
    iget-object v1, v0, Lsu/happ/proxyutility/ui/ServerActivity;->d2:Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 977
    .line 978
    if-eqz v1, :cond_1d

    .line 979
    .line 980
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 981
    .line 982
    .line 983
    :cond_1d
    iget-object v1, v0, Lsu/happ/proxyutility/ui/ServerActivity;->e2:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 984
    .line 985
    if-eqz v1, :cond_1e

    .line 986
    .line 987
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 988
    .line 989
    .line 990
    :cond_1e
    iget-object v0, v0, Lsu/happ/proxyutility/ui/ServerActivity;->h2:Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 991
    .line 992
    if-eqz v0, :cond_1f

    .line 993
    .line 994
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 995
    .line 996
    .line 997
    :cond_1f
    :goto_f
    sget-object v0, Ldn8;->a:Ldn8;

    .line 998
    .line 999
    return-object v0

    .line 1000
    :pswitch_c
    check-cast v0, Lv64;

    .line 1001
    .line 1002
    check-cast v1, Ljava/util/List;

    .line 1003
    .line 1004
    invoke-virtual {v0}, Lv64;->invoke()Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    check-cast v0, Ljava/lang/Float;

    .line 1009
    .line 1010
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    return-object v0

    .line 1018
    :pswitch_d
    check-cast v0, Lkl6;

    .line 1019
    .line 1020
    check-cast v1, Lf17;

    .line 1021
    .line 1022
    iget-byte v0, v0, Lkl6;->a:B

    .line 1023
    .line 1024
    invoke-static {v1, v0}, Ld17;->d(Lf17;I)V

    .line 1025
    .line 1026
    .line 1027
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1028
    .line 1029
    return-object v0

    .line 1030
    :pswitch_e
    check-cast v0, Lh68;

    .line 1031
    .line 1032
    check-cast v1, Lhq5;

    .line 1033
    .line 1034
    iget-wide v2, v1, Lhq5;->c:J

    .line 1035
    .line 1036
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v1}, Lhq5;->a()V

    .line 1040
    .line 1041
    .line 1042
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1043
    .line 1044
    return-object v0

    .line 1045
    :pswitch_f
    check-cast v0, Lsy6;

    .line 1046
    .line 1047
    check-cast v1, Lz85;

    .line 1048
    .line 1049
    iget-object v2, v0, Lsy6;->k:Lxx6;

    .line 1050
    .line 1051
    iget-wide v3, v1, Lz85;->a:J

    .line 1052
    .line 1053
    iget-byte v1, v0, Lsy6;->j:B

    .line 1054
    .line 1055
    invoke-virtual {v0, v2, v3, v4, v1}, Lsy6;->d(Lxx6;JI)J

    .line 1056
    .line 1057
    .line 1058
    move-result-wide v0

    .line 1059
    new-instance v2, Lz85;

    .line 1060
    .line 1061
    invoke-direct {v2, v0, v1}, Lz85;-><init>(J)V

    .line 1062
    .line 1063
    .line 1064
    return-object v2

    .line 1065
    :pswitch_10
    check-cast v0, Lay6;

    .line 1066
    .line 1067
    check-cast v1, Ljava/lang/Float;

    .line 1068
    .line 1069
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1070
    .line 1071
    .line 1072
    move-result v1

    .line 1073
    iget-object v2, v0, Lay6;->X:Loh5;

    .line 1074
    .line 1075
    invoke-virtual {v2}, Loh5;->l()I

    .line 1076
    .line 1077
    .line 1078
    move-result v3

    .line 1079
    int-to-float v3, v3

    .line 1080
    add-float/2addr v3, v1

    .line 1081
    iget v4, v0, Lay6;->i0:F

    .line 1082
    .line 1083
    add-float/2addr v3, v4

    .line 1084
    iget-object v4, v0, Lay6;->h0:Loh5;

    .line 1085
    .line 1086
    invoke-virtual {v4}, Loh5;->l()I

    .line 1087
    .line 1088
    .line 1089
    move-result v4

    .line 1090
    int-to-float v4, v4

    .line 1091
    const/4 v6, 0x0

    .line 1092
    invoke-static {v3, v6, v4}, Lx97;->m(FFF)F

    .line 1093
    .line 1094
    .line 1095
    move-result v4

    .line 1096
    cmpg-float v3, v3, v4

    .line 1097
    .line 1098
    if-nez v3, :cond_20

    .line 1099
    .line 1100
    move v5, v7

    .line 1101
    :cond_20
    invoke-virtual {v2}, Loh5;->l()I

    .line 1102
    .line 1103
    .line 1104
    move-result v3

    .line 1105
    int-to-float v3, v3

    .line 1106
    sub-float/2addr v4, v3

    .line 1107
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 1108
    .line 1109
    .line 1110
    move-result v3

    .line 1111
    invoke-virtual {v2}, Loh5;->l()I

    .line 1112
    .line 1113
    .line 1114
    move-result v6

    .line 1115
    add-int/2addr v6, v3

    .line 1116
    invoke-virtual {v2, v6}, Loh5;->m(I)V

    .line 1117
    .line 1118
    .line 1119
    int-to-float v2, v3

    .line 1120
    sub-float v2, v4, v2

    .line 1121
    .line 1122
    iput v2, v0, Lay6;->i0:F

    .line 1123
    .line 1124
    if-nez v5, :cond_21

    .line 1125
    .line 1126
    move v1, v4

    .line 1127
    :cond_21
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    return-object v0

    .line 1132
    :pswitch_11
    check-cast v0, Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 1133
    .line 1134
    check-cast v1, Ljava/lang/Integer;

    .line 1135
    .line 1136
    iget-object v0, v0, Lsu/happ/proxyutility/ui/ScannerActivity;->Q0:Llr;

    .line 1137
    .line 1138
    if-eqz v0, :cond_24

    .line 1139
    .line 1140
    iget-object v0, v0, Llr;->Z:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v0, Lsu/happ/proxyutility/ui/widget/QROverlayView;

    .line 1143
    .line 1144
    if-nez v1, :cond_22

    .line 1145
    .line 1146
    goto :goto_10

    .line 1147
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1148
    .line 1149
    .line 1150
    move-result v1

    .line 1151
    if-ne v1, v7, :cond_23

    .line 1152
    .line 1153
    move v5, v7

    .line 1154
    :cond_23
    :goto_10
    invoke-virtual {v0, v5}, Lsu/happ/proxyutility/ui/widget/QROverlayView;->setTorchState(Z)V

    .line 1155
    .line 1156
    .line 1157
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1158
    .line 1159
    return-object v0

    .line 1160
    :cond_24
    const-string v0, "binding"

    .line 1161
    .line 1162
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    const/16 v16, 0x0

    .line 1166
    .line 1167
    throw v16

    .line 1168
    :pswitch_12
    check-cast v0, Lp84;

    .line 1169
    .line 1170
    check-cast v1, Ljava/lang/Boolean;

    .line 1171
    .line 1172
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1173
    .line 1174
    .line 1175
    move-result v1

    .line 1176
    sget v2, Lsu/happ/proxyutility/ui/ScannerActivity;->T0:I

    .line 1177
    .line 1178
    iget-object v0, v0, Lp84;->Z:Ltl0;

    .line 1179
    .line 1180
    iget-object v0, v0, Ltl0;->X:Lb7;

    .line 1181
    .line 1182
    iget-object v0, v0, Lb7;->Z:Lz6;

    .line 1183
    .line 1184
    invoke-virtual {v0, v1}, Lz6;->f(Z)Lxb4;

    .line 1185
    .line 1186
    .line 1187
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1188
    .line 1189
    return-object v0

    .line 1190
    :pswitch_13
    check-cast v0, Lsu/happ/proxyutility/ui/ScScannerActivity;

    .line 1191
    .line 1192
    check-cast v1, Ljava/lang/Boolean;

    .line 1193
    .line 1194
    sget v2, Lsu/happ/proxyutility/ui/ScScannerActivity;->R0:I

    .line 1195
    .line 1196
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1197
    .line 1198
    .line 1199
    move-result v1

    .line 1200
    if-eqz v1, :cond_25

    .line 1201
    .line 1202
    iget-object v1, v0, Lsu/happ/proxyutility/ui/ScScannerActivity;->Q0:Lr6;

    .line 1203
    .line 1204
    new-instance v2, Landroid/content/Intent;

    .line 1205
    .line 1206
    const-class v3, Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 1207
    .line 1208
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v1, v2}, Lr6;->h0(Ljava/lang/Object;)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_11

    .line 1215
    :cond_25
    sget v1, Ly46;->toast_permission_denied:I

    .line 1216
    .line 1217
    sget v2, Ly46;->permission_camera:I

    .line 1218
    .line 1219
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v2

    .line 1227
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v1

    .line 1231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1232
    .line 1233
    .line 1234
    invoke-static {v0, v1}, Lx79;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    :goto_11
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1238
    .line 1239
    return-object v0

    .line 1240
    :pswitch_14
    check-cast v0, Ljv6;

    .line 1241
    .line 1242
    iget-object v0, v0, Ljv6;->Z:Lkv6;

    .line 1243
    .line 1244
    if-eqz v0, :cond_26

    .line 1245
    .line 1246
    invoke-interface {v0, v1}, Lkv6;->c(Ljava/lang/Object;)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v7

    .line 1250
    :cond_26
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    return-object v0

    .line 1255
    :pswitch_15
    check-cast v0, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 1256
    .line 1257
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 1258
    .line 1259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    invoke-static {v2, v0}, Lmn6;->w(Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    const/4 v6, 0x0

    .line 1271
    const/16 v7, 0x1d

    .line 1272
    .line 1273
    const/4 v2, 0x0

    .line 1274
    const/4 v4, 0x0

    .line 1275
    const/4 v5, 0x0

    .line 1276
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    return-object v0

    .line 1281
    :pswitch_16
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 1282
    .line 1283
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 1284
    .line 1285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1286
    .line 1287
    .line 1288
    return-object v0

    .line 1289
    :pswitch_17
    check-cast v0, Lsl6;

    .line 1290
    .line 1291
    check-cast v1, Lxr6;

    .line 1292
    .line 1293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    .line 1295
    .line 1296
    const-string v2, "Required value was null."

    .line 1297
    .line 1298
    iget v3, v0, Lsl6;->i0:I

    .line 1299
    .line 1300
    if-gt v7, v3, :cond_2e

    .line 1301
    .line 1302
    move v4, v7

    .line 1303
    :goto_12
    iget-object v5, v0, Lsl6;->h0:[I

    .line 1304
    .line 1305
    aget v5, v5, v4

    .line 1306
    .line 1307
    if-eq v5, v7, :cond_2d

    .line 1308
    .line 1309
    const/4 v6, 0x2

    .line 1310
    if-eq v5, v6, :cond_2c

    .line 1311
    .line 1312
    const/4 v6, 0x3

    .line 1313
    if-eq v5, v6, :cond_2b

    .line 1314
    .line 1315
    const/4 v8, 0x4

    .line 1316
    if-eq v5, v8, :cond_29

    .line 1317
    .line 1318
    const/4 v6, 0x5

    .line 1319
    if-eq v5, v6, :cond_27

    .line 1320
    .line 1321
    goto :goto_14

    .line 1322
    :cond_27
    iget-object v5, v0, Lsl6;->g0:[[B

    .line 1323
    .line 1324
    aget-object v5, v5, v4

    .line 1325
    .line 1326
    if-eqz v5, :cond_28

    .line 1327
    .line 1328
    invoke-interface {v1, v4, v5}, Lxr6;->j(I[B)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_14

    .line 1332
    :cond_28
    invoke-static {v2}, Lbt;->q(Ljava/lang/String;)V

    .line 1333
    .line 1334
    .line 1335
    :goto_13
    const/4 v6, 0x0

    .line 1336
    goto :goto_15

    .line 1337
    :cond_29
    const/4 v6, 0x5

    .line 1338
    iget-object v5, v0, Lsl6;->f0:[Ljava/lang/String;

    .line 1339
    .line 1340
    aget-object v5, v5, v4

    .line 1341
    .line 1342
    if-eqz v5, :cond_2a

    .line 1343
    .line 1344
    invoke-interface {v1, v4, v5}, Lxr6;->T(ILjava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_14

    .line 1348
    :cond_2a
    invoke-static {v2}, Lbt;->q(Ljava/lang/String;)V

    .line 1349
    .line 1350
    .line 1351
    goto :goto_13

    .line 1352
    :cond_2b
    const/4 v6, 0x5

    .line 1353
    const/4 v8, 0x4

    .line 1354
    iget-object v5, v0, Lsl6;->Z:[D

    .line 1355
    .line 1356
    aget-wide v9, v5, v4

    .line 1357
    .line 1358
    invoke-interface {v1, v4, v9, v10}, Lxr6;->h(ID)V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_14

    .line 1362
    :cond_2c
    const/4 v6, 0x5

    .line 1363
    const/4 v8, 0x4

    .line 1364
    iget-object v5, v0, Lsl6;->Y:[J

    .line 1365
    .line 1366
    aget-wide v9, v5, v4

    .line 1367
    .line 1368
    invoke-interface {v1, v4, v9, v10}, Lxr6;->i(IJ)V

    .line 1369
    .line 1370
    .line 1371
    goto :goto_14

    .line 1372
    :cond_2d
    const/4 v6, 0x5

    .line 1373
    const/4 v8, 0x4

    .line 1374
    invoke-interface {v1, v4}, Lxr6;->l(I)V

    .line 1375
    .line 1376
    .line 1377
    :goto_14
    if-eq v4, v3, :cond_2e

    .line 1378
    .line 1379
    add-int/lit8 v4, v4, 0x1

    .line 1380
    .line 1381
    goto :goto_12

    .line 1382
    :cond_2e
    sget-object v6, Ldn8;->a:Ldn8;

    .line 1383
    .line 1384
    :goto_15
    return-object v6

    .line 1385
    :pswitch_18
    check-cast v0, Lt16;

    .line 1386
    .line 1387
    check-cast v1, Lxr6;

    .line 1388
    .line 1389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1390
    .line 1391
    .line 1392
    new-instance v2, Lt50;

    .line 1393
    .line 1394
    invoke-direct {v2, v1}, Lt50;-><init>(Lxr6;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v0, v2}, Lt16;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1401
    .line 1402
    return-object v0

    .line 1403
    :pswitch_19
    check-cast v0, Lby0;

    .line 1404
    .line 1405
    check-cast v1, Lsm2;

    .line 1406
    .line 1407
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1408
    .line 1409
    .line 1410
    iput-object v1, v0, Lby0;->g:Ljava/lang/Object;

    .line 1411
    .line 1412
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1413
    .line 1414
    return-object v0

    .line 1415
    :pswitch_1a
    check-cast v0, Lp86;

    .line 1416
    .line 1417
    check-cast v1, Ljava/lang/Throwable;

    .line 1418
    .line 1419
    const-string v2, "Recomposer effect job completed"

    .line 1420
    .line 1421
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 1422
    .line 1423
    invoke-direct {v3, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1427
    .line 1428
    .line 1429
    iget-object v2, v0, Lp86;->c:Ljava/lang/Object;

    .line 1430
    .line 1431
    monitor-enter v2

    .line 1432
    :try_start_2
    iget-object v4, v0, Lp86;->d:Lbm3;

    .line 1433
    .line 1434
    if-eqz v4, :cond_2f

    .line 1435
    .line 1436
    iget-object v5, v0, Lp86;->u:Loh7;

    .line 1437
    .line 1438
    sget-object v6, Lm86;->Y:Lm86;

    .line 1439
    .line 1440
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1441
    .line 1442
    .line 1443
    const/4 v7, 0x0

    .line 1444
    invoke-virtual {v5, v7, v6}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    invoke-interface {v4, v3}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 1448
    .line 1449
    .line 1450
    iput-object v7, v0, Lp86;->r:Lmm0;

    .line 1451
    .line 1452
    new-instance v3, Lzw2;

    .line 1453
    .line 1454
    const/16 v5, 0x19

    .line 1455
    .line 1456
    invoke-direct {v3, v0, v1, v5}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1457
    .line 1458
    .line 1459
    invoke-interface {v4, v3}, Lbm3;->D(Lgn2;)Lgq1;

    .line 1460
    .line 1461
    .line 1462
    goto :goto_16

    .line 1463
    :catchall_2
    move-exception v0

    .line 1464
    goto :goto_17

    .line 1465
    :cond_2f
    iput-object v3, v0, Lp86;->e:Ljava/lang/Throwable;

    .line 1466
    .line 1467
    iget-object v0, v0, Lp86;->u:Loh7;

    .line 1468
    .line 1469
    sget-object v1, Lm86;->X:Lm86;

    .line 1470
    .line 1471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    const/4 v7, 0x0

    .line 1475
    invoke-virtual {v0, v7, v1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1476
    .line 1477
    .line 1478
    :goto_16
    monitor-exit v2

    .line 1479
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1480
    .line 1481
    return-object v0

    .line 1482
    :goto_17
    monitor-exit v2

    .line 1483
    throw v0

    .line 1484
    :pswitch_1b
    check-cast v0, Lr01;

    .line 1485
    .line 1486
    invoke-virtual {v0, v1}, Lr01;->y(Ljava/lang/Object;)V

    .line 1487
    .line 1488
    .line 1489
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1490
    .line 1491
    return-object v0

    .line 1492
    :pswitch_1c
    check-cast v0, Lfu6;

    .line 1493
    .line 1494
    iget-object v0, v0, Lfu6;->i0:Ljava/lang/Object;

    .line 1495
    .line 1496
    check-cast v0, Lkt;

    .line 1497
    .line 1498
    invoke-virtual {v0, v1}, Lkt;->addLast(Ljava/lang/Object;)V

    .line 1499
    .line 1500
    .line 1501
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1502
    .line 1503
    return-object v0

    .line 1504
    nop

    .line 1505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

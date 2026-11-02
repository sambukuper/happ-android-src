.class public final Lsu/happ/proxyutility/feature/main/MainViewModel$mMsgReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu/happ/proxyutility/feature/main/MainViewModel;-><init>(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "su/happ/proxyutility/feature/main/MainViewModel$mMsgReceiver$1",
        "Landroid/content/BroadcastReceiver;",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lsu/happ/proxyutility/feature/main/MainViewModel;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsu/happ/proxyutility/feature/main/MainViewModel$mMsgReceiver$1;->a:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 31

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v3, "key"

    .line 8
    .line 9
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v2

    .line 19
    :goto_0
    const-string v4, "content"

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v5, v2

    .line 29
    :goto_1
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    move-object/from16 v8, p0

    .line 32
    .line 33
    iget-object v8, v8, Lsu/happ/proxyutility/feature/main/MainViewModel$mMsgReceiver$1;->a:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    const/16 v10, 0xb

    .line 43
    .line 44
    if-ne v9, v10, :cond_3

    .line 45
    .line 46
    sget-object v1, Lrg8;->Z:Lrg8;

    .line 47
    .line 48
    invoke-virtual {v8, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->X(Lrg8;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lwe3;->a:Lmu0;

    .line 52
    .line 53
    invoke-interface {v1}, Lmu0;->a()Lte3;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Lte3;->a()J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    invoke-virtual {v0, v4, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    sub-long/2addr v1, v3

    .line 66
    invoke-virtual {v8, v1, v2}, Lsu/happ/proxyutility/feature/main/MainViewModel;->J(J)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    :goto_2
    if-nez v3, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    const/16 v10, 0xc

    .line 78
    .line 79
    if-ne v9, v10, :cond_6

    .line 80
    .line 81
    sget-object v0, Lrg8;->f0:Lrg8;

    .line 82
    .line 83
    invoke-virtual {v8, v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->X(Lrg8;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->B:Log7;

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iput-object v2, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->B:Log7;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    :goto_3
    const/4 v9, 0x3

    .line 97
    if-nez v3, :cond_7

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    const/16 v11, 0x1f

    .line 105
    .line 106
    if-ne v10, v11, :cond_9

    .line 107
    .line 108
    sget-object v3, Lrg8;->X:Lrg8;

    .line 109
    .line 110
    invoke-virtual {v8, v3}, Lsu/happ/proxyutility/feature/main/MainViewModel;->X(Lrg8;)V

    .line 111
    .line 112
    .line 113
    const-class v3, Lsu/happ/proxyutility/dto/StartServiceDataInfo;

    .line 114
    .line 115
    invoke-static {v0, v4, v3}, Lx79;->c(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lsu/happ/proxyutility/dto/StartServiceDataInfo;

    .line 120
    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    sget-object v3, Lwe3;->a:Lmu0;

    .line 124
    .line 125
    invoke-interface {v3}, Lmu0;->a()Lte3;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3}, Lte3;->a()J

    .line 130
    .line 131
    .line 132
    move-result-wide v3

    .line 133
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/StartServiceDataInfo;->a()J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    sub-long/2addr v3, v5

    .line 138
    invoke-virtual {v8, v3, v4}, Lsu/happ/proxyutility/feature/main/MainViewModel;->J(J)V

    .line 139
    .line 140
    .line 141
    :cond_8
    invoke-static {v8}, Lzw8;->a(Lxw8;)Ltu0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v3, Lho4;

    .line 146
    .line 147
    invoke-direct {v3, v8, v2, v1}, Lho4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v2, v3, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_9
    :goto_4
    if-nez v3, :cond_a

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    const/16 v11, 0x20

    .line 162
    .line 163
    if-ne v10, v11, :cond_c

    .line 164
    .line 165
    sget-object v0, Lrg8;->g0:Lrg8;

    .line 166
    .line 167
    invoke-virtual {v8, v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->X(Lrg8;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->B:Log7;

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 175
    .line 176
    .line 177
    :cond_b
    iput-object v2, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->B:Log7;

    .line 178
    .line 179
    return-void

    .line 180
    :cond_c
    :goto_5
    if-nez v3, :cond_d

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    const/16 v11, 0x29

    .line 188
    .line 189
    if-ne v10, v11, :cond_f

    .line 190
    .line 191
    sget-object v0, Lrg8;->Y:Lrg8;

    .line 192
    .line 193
    invoke-virtual {v8, v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->X(Lrg8;)V

    .line 194
    .line 195
    .line 196
    iget-object v0, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->B:Log7;

    .line 197
    .line 198
    if-eqz v0, :cond_e

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 201
    .line 202
    .line 203
    :cond_e
    iput-object v2, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->B:Log7;

    .line 204
    .line 205
    return-void

    .line 206
    :cond_f
    :goto_6
    if-nez v3, :cond_10

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    const/16 v11, 0x3d

    .line 214
    .line 215
    if-ne v10, v11, :cond_11

    .line 216
    .line 217
    iget-object v1, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->J:Lvz7;

    .line 218
    .line 219
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Lyz4;

    .line 224
    .line 225
    const-class v2, Ll69;

    .line 226
    .line 227
    invoke-static {v0, v4, v2}, Lx79;->c(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v1, v0}, Lqc4;->j(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_11
    :goto_7
    const/4 v10, 0x1

    .line 236
    if-nez v3, :cond_12

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_12
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    const/16 v12, 0x47

    .line 244
    .line 245
    if-ne v11, v12, :cond_15

    .line 246
    .line 247
    iget-object v11, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 248
    .line 249
    :cond_13
    invoke-virtual {v11}, Loh7;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    move-object v12, v1

    .line 254
    check-cast v12, Lxm4;

    .line 255
    .line 256
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget v2, v12, Lxm4;->f:I

    .line 260
    .line 261
    add-int/lit8 v19, v2, -0x1

    .line 262
    .line 263
    const/16 v29, 0x0

    .line 264
    .line 265
    const v30, 0xffdf

    .line 266
    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const-wide/16 v14, 0x0

    .line 270
    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    const/16 v18, 0x0

    .line 276
    .line 277
    const/16 v20, 0x0

    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const/16 v22, 0x0

    .line 282
    .line 283
    const/16 v23, 0x0

    .line 284
    .line 285
    const/16 v24, 0x0

    .line 286
    .line 287
    const/16 v25, 0x0

    .line 288
    .line 289
    const/16 v26, 0x0

    .line 290
    .line 291
    const/16 v27, 0x0

    .line 292
    .line 293
    const/16 v28, 0x0

    .line 294
    .line 295
    invoke-static/range {v12 .. v30}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v11, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_13

    .line 304
    .line 305
    :try_start_0
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_34

    .line 310
    .line 311
    sget-object v1, Lyw2;->b:Lcom/google/gson/a;

    .line 312
    .line 313
    const-class v2, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;

    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    new-instance v3, Lyi8;

    .line 319
    .line 320
    invoke-direct {v3, v2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v0, v3}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;

    .line 328
    .line 329
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;->a()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/TestPingViaProxyResultData;->b()J

    .line 334
    .line 335
    .line 336
    move-result-wide v2

    .line 337
    invoke-virtual {v8, v2, v3, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->V(JLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :catchall_0
    move-exception v0

    .line 342
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 343
    .line 344
    if-nez v1, :cond_14

    .line 345
    .line 346
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 347
    .line 348
    if-nez v1, :cond_14

    .line 349
    .line 350
    goto/16 :goto_17

    .line 351
    .line 352
    :cond_14
    throw v0

    .line 353
    :cond_15
    :goto_8
    if-nez v3, :cond_16

    .line 354
    .line 355
    goto :goto_9

    .line 356
    :cond_16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    const/16 v12, 0x49

    .line 361
    .line 362
    if-ne v11, v12, :cond_17

    .line 363
    .line 364
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->K()V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_17
    :goto_9
    if-nez v3, :cond_18

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_18
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    const/16 v12, 0xe

    .line 376
    .line 377
    if-ne v11, v12, :cond_19

    .line 378
    .line 379
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sget-object v1, Lom4;->Z:Lom4;

    .line 384
    .line 385
    invoke-virtual {v0, v1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :cond_19
    :goto_a
    if-nez v3, :cond_1a

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_1a
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    const/16 v12, 0xf

    .line 397
    .line 398
    if-ne v11, v12, :cond_1b

    .line 399
    .line 400
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    sget-object v1, Lom4;->f0:Lom4;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :cond_1b
    :goto_b
    if-nez v3, :cond_1c

    .line 411
    .line 412
    goto :goto_c

    .line 413
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    const/16 v12, 0x21

    .line 418
    .line 419
    if-ne v11, v12, :cond_1d

    .line 420
    .line 421
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    sget-object v1, Lom4;->X:Lom4;

    .line 426
    .line 427
    invoke-virtual {v0, v1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :cond_1d
    :goto_c
    if-nez v3, :cond_1e

    .line 432
    .line 433
    goto :goto_d

    .line 434
    :cond_1e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    const/16 v12, 0x22

    .line 439
    .line 440
    if-ne v11, v12, :cond_1f

    .line 441
    .line 442
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    sget-object v1, Lom4;->g0:Lom4;

    .line 447
    .line 448
    invoke-virtual {v0, v1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-void

    .line 452
    :cond_1f
    :goto_d
    if-nez v3, :cond_20

    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    const/16 v12, 0x2b

    .line 460
    .line 461
    if-ne v11, v12, :cond_21

    .line 462
    .line 463
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sget-object v1, Lom4;->Y:Lom4;

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :cond_21
    :goto_e
    if-nez v3, :cond_22

    .line 474
    .line 475
    goto :goto_f

    .line 476
    :cond_22
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    const/16 v12, 0x7b

    .line 481
    .line 482
    if-ne v11, v12, :cond_23

    .line 483
    .line 484
    const-class v1, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 485
    .line 486
    sget-object v2, Lyb6;->a:Lzb6;

    .line 487
    .line 488
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-static {v0, v1}, Lc4;->m(Landroid/content/Intent;Lzu3;)Landroid/os/Parcelable;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateCreateProfile;

    .line 497
    .line 498
    return-void

    .line 499
    :cond_23
    :goto_f
    if-nez v3, :cond_24

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_24
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 503
    .line 504
    .line 505
    move-result v11

    .line 506
    const/16 v12, 0x7d

    .line 507
    .line 508
    if-ne v11, v12, :cond_26

    .line 509
    .line 510
    const-class v1, Lsu/happ/proxyutility/dto/error/CoreRoutingError;

    .line 511
    .line 512
    invoke-static {v0, v4, v1}, Lx79;->c(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    check-cast v0, Lsu/happ/proxyutility/dto/error/CoreRoutingError;

    .line 517
    .line 518
    if-eqz v0, :cond_34

    .line 519
    .line 520
    iget-object v1, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->v:Lq02;

    .line 521
    .line 522
    if-eqz v1, :cond_34

    .line 523
    .line 524
    iget-object v1, v1, Lq02;->Y:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 527
    .line 528
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/error/CoreRoutingError;->a()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/error/CoreRoutingError;->c()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/error/CoreRoutingError;->b()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    sget v5, Le46;->fragment_container_view:I

    .line 541
    .line 542
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    new-instance v7, Lkn1;

    .line 553
    .line 554
    invoke-direct {v7}, Lkn1;-><init>()V

    .line 555
    .line 556
    .line 557
    new-instance v8, Landroid/os/Bundle;

    .line 558
    .line 559
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 560
    .line 561
    .line 562
    const-string v9, "core_routing_file_name"

    .line 563
    .line 564
    invoke-virtual {v8, v9, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    const-string v3, "core_routing_sections_name"

    .line 568
    .line 569
    invoke-virtual {v8, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    if-eqz v0, :cond_25

    .line 573
    .line 574
    const-string v3, "core_routing_message"

    .line 575
    .line 576
    invoke-virtual {v8, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    :cond_25
    invoke-virtual {v7, v8}, Lqk2;->Q(Landroid/os/Bundle;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v7}, Lsn1;->V()V

    .line 583
    .line 584
    .line 585
    new-instance v0, Lr00;

    .line 586
    .line 587
    invoke-direct {v0, v6}, Lr00;-><init>(Lml2;)V

    .line 588
    .line 589
    .line 590
    iput-boolean v10, v0, Lr00;->o:Z

    .line 591
    .line 592
    invoke-virtual {v0, v5, v7, v2, v10}, Lr00;->g(ILqk2;Ljava/lang/String;I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, Lr00;->e()V

    .line 596
    .line 597
    .line 598
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 599
    .line 600
    invoke-virtual {v1}, Lsu/happ/proxyutility/feature/main/MainActivity;->j0()V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :cond_26
    :goto_10
    if-nez v3, :cond_27

    .line 605
    .line 606
    goto :goto_11

    .line 607
    :cond_27
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v11

    .line 611
    const/16 v12, 0x23

    .line 612
    .line 613
    if-ne v11, v12, :cond_28

    .line 614
    .line 615
    invoke-virtual {v0, v4, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 616
    .line 617
    .line 618
    move-result-wide v0

    .line 619
    invoke-virtual {v8, v0, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->J(J)V

    .line 620
    .line 621
    .line 622
    return-void

    .line 623
    :cond_28
    :goto_11
    const/4 v4, 0x2

    .line 624
    if-nez v3, :cond_29

    .line 625
    .line 626
    goto :goto_12

    .line 627
    :cond_29
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 628
    .line 629
    .line 630
    move-result v6

    .line 631
    const/16 v7, 0x7e

    .line 632
    .line 633
    if-ne v6, v7, :cond_2a

    .line 634
    .line 635
    invoke-static {v8, v10, v4}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 636
    .line 637
    .line 638
    return-void

    .line 639
    :cond_2a
    :goto_12
    if-nez v3, :cond_2b

    .line 640
    .line 641
    goto :goto_13

    .line 642
    :cond_2b
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v6

    .line 646
    const/16 v7, 0x81

    .line 647
    .line 648
    if-ne v6, v7, :cond_2c

    .line 649
    .line 650
    invoke-static {v8, v1, v4}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :cond_2c
    :goto_13
    if-nez v3, :cond_2d

    .line 655
    .line 656
    goto :goto_14

    .line 657
    :cond_2d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 658
    .line 659
    .line 660
    move-result v4

    .line 661
    const/16 v6, 0x7f

    .line 662
    .line 663
    if-ne v4, v6, :cond_2e

    .line 664
    .line 665
    invoke-static {v8}, Lzw8;->a(Lxw8;)Ltu0;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    new-instance v3, Lio4;

    .line 670
    .line 671
    invoke-direct {v3, v8, v5, v2, v1}, Lio4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/io/Serializable;Lq51;B)V

    .line 672
    .line 673
    .line 674
    invoke-static {v0, v2, v3, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 675
    .line 676
    .line 677
    return-void

    .line 678
    :cond_2e
    :goto_14
    if-nez v3, :cond_2f

    .line 679
    .line 680
    goto :goto_15

    .line 681
    :cond_2f
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    const/16 v6, 0x80

    .line 686
    .line 687
    if-ne v4, v6, :cond_30

    .line 688
    .line 689
    invoke-static {v8}, Lzw8;->a(Lxw8;)Ltu0;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    new-instance v1, Lio4;

    .line 694
    .line 695
    invoke-direct {v1, v8, v5, v2, v10}, Lio4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/io/Serializable;Lq51;B)V

    .line 696
    .line 697
    .line 698
    invoke-static {v0, v2, v1, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 699
    .line 700
    .line 701
    return-void

    .line 702
    :cond_30
    :goto_15
    if-nez v3, :cond_31

    .line 703
    .line 704
    goto :goto_16

    .line 705
    :cond_31
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 706
    .line 707
    .line 708
    move-result v4

    .line 709
    const/16 v5, 0x82

    .line 710
    .line 711
    if-ne v4, v5, :cond_32

    .line 712
    .line 713
    invoke-static {v8}, Lzw8;->a(Lxw8;)Ltu0;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    new-instance v3, Lgo4;

    .line 718
    .line 719
    invoke-direct {v3, v0, v8, v2, v10}, Lgo4;-><init>(Landroid/content/Intent;Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 720
    .line 721
    .line 722
    invoke-static {v1, v2, v3, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 723
    .line 724
    .line 725
    return-void

    .line 726
    :cond_32
    :goto_16
    if-nez v3, :cond_33

    .line 727
    .line 728
    goto :goto_17

    .line 729
    :cond_33
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    const/16 v4, 0x83

    .line 734
    .line 735
    if-ne v3, v4, :cond_34

    .line 736
    .line 737
    invoke-static {v8}, Lzw8;->a(Lxw8;)Ltu0;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    new-instance v4, Lgo4;

    .line 742
    .line 743
    invoke-direct {v4, v0, v8, v2, v1}, Lgo4;-><init>(Landroid/content/Intent;Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 744
    .line 745
    .line 746
    invoke-static {v3, v2, v4, v9}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 747
    .line 748
    .line 749
    :cond_34
    :goto_17
    return-void
.end method

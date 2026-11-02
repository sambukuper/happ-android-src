.class public final Lp91;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 3

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 416
    new-instance p1, Lc15;

    const/16 v1, 0x10

    new-array v2, v1, [Lpp2;

    invoke-direct {p1, v0, v2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 417
    iput-object p1, p0, Lp91;->c:Ljava/lang/Object;

    .line 418
    sget-object v2, Lvw6;->a:Lt05;

    .line 419
    new-instance v2, Lt05;

    invoke-direct {v2}, Lt05;-><init>()V

    .line 420
    iput-object v2, p0, Lp91;->d:Ljava/lang/Object;

    .line 421
    iput-object p1, p0, Lp91;->e:Ljava/lang/Object;

    .line 422
    new-instance p1, Lc15;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {p1, v0, v2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 423
    iput-object p1, p0, Lp91;->f:Ljava/lang/Object;

    .line 424
    new-instance p1, Lc15;

    new-array v1, v1, [Ldn2;

    invoke-direct {p1, v0, v1}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 425
    iput-object p1, p0, Lp91;->g:Ljava/lang/Object;

    return-void

    .line 426
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    .line 427
    new-array v1, p1, [Ll77;

    iput-object v1, p0, Lp91;->a:Ljava/lang/Object;

    .line 428
    new-array v1, p1, [Landroid/graphics/Matrix;

    iput-object v1, p0, Lp91;->b:Ljava/lang/Object;

    .line 429
    new-array v1, p1, [Landroid/graphics/Matrix;

    iput-object v1, p0, Lp91;->c:Ljava/lang/Object;

    .line 430
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lp91;->d:Ljava/lang/Object;

    .line 431
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lp91;->e:Ljava/lang/Object;

    .line 432
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lp91;->f:Ljava/lang/Object;

    .line 433
    new-instance v1, Ll77;

    invoke-direct {v1}, Ll77;-><init>()V

    iput-object v1, p0, Lp91;->g:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 434
    new-array v2, v1, [F

    iput-object v2, p0, Lp91;->h:Ljava/lang/Object;

    .line 435
    new-array v1, v1, [F

    iput-object v1, p0, Lp91;->i:Ljava/lang/Object;

    .line 436
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lp91;->j:Ljava/lang/Object;

    .line 437
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lp91;->k:Ljava/lang/Object;

    :goto_0
    if-ge v0, p1, :cond_0

    .line 438
    iget-object v1, p0, Lp91;->a:Ljava/lang/Object;

    check-cast v1, [Ll77;

    new-instance v2, Ll77;

    invoke-direct {v2}, Ll77;-><init>()V

    aput-object v2, v1, v0

    .line 439
    iget-object v1, p0, Lp91;->b:Ljava/lang/Object;

    check-cast v1, [Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    aput-object v2, v1, v0

    .line 440
    iget-object v1, p0, Lp91;->c:Ljava/lang/Object;

    check-cast v1, [Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lyr2;)V
    .locals 92

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    iput-object v2, v1, Lp91;->a:Ljava/lang/Object;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    iput-object v2, v1, Lp91;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v0, v1, Lp91;->c:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v90, "223.5.5.5"

    .line 19
    .line 20
    const-string v91, "223.6.6.6"

    .line 21
    .line 22
    const-string v2, "1.0.0.1"

    .line 23
    .line 24
    const-string v3, "1.0.0.2"

    .line 25
    .line 26
    const-string v4, "1.1.1.1"

    .line 27
    .line 28
    const-string v5, "2.56.220.2"

    .line 29
    .line 30
    const-string v6, "3.7.156.128"

    .line 31
    .line 32
    const-string v7, "8.8.4.4"

    .line 33
    .line 34
    const-string v8, "8.8.8.8"

    .line 35
    .line 36
    const-string v9, "9.9.9.9"

    .line 37
    .line 38
    const-string v10, "9.9.9.10"

    .line 39
    .line 40
    const-string v11, "9.9.9.11"

    .line 41
    .line 42
    const-string v12, "45.11.45.11"

    .line 43
    .line 44
    const-string v13, "45.67.219.208"

    .line 45
    .line 46
    const-string v14, "52.80.52.52"

    .line 47
    .line 48
    const-string v15, "52.80.60.30"

    .line 49
    .line 50
    const-string v16, "52.80.66.66"

    .line 51
    .line 52
    const-string v17, "62.192.153.242"

    .line 53
    .line 54
    const-string v18, "64.6.64.6"

    .line 55
    .line 56
    const-string v19, "64.6.65.6"

    .line 57
    .line 58
    const-string v20, "74.82.42.42"

    .line 59
    .line 60
    const-string v21, "76.76.2.0"

    .line 61
    .line 62
    const-string v22, "76.76.2.1"

    .line 63
    .line 64
    const-string v23, "76.76.2.3"

    .line 65
    .line 66
    const-string v24, "76.76.10.0"

    .line 67
    .line 68
    const-string v25, "77.88.8.1"

    .line 69
    .line 70
    const-string v26, "77.88.8.2"

    .line 71
    .line 72
    const-string v27, "77.88.8.3"

    .line 73
    .line 74
    const-string v28, "77.88.8.7"

    .line 75
    .line 76
    const-string v29, "77.88.8.8"

    .line 77
    .line 78
    const-string v30, "77.88.8.88"

    .line 79
    .line 80
    const-string v31, "78.47.64.161"

    .line 81
    .line 82
    const-string v32, "83.220.169.155"

    .line 83
    .line 84
    const-string v33, "88.198.92.222"

    .line 85
    .line 86
    const-string v34, "94.130.110.178"

    .line 87
    .line 88
    const-string v35, "94.130.180.225"

    .line 89
    .line 90
    const-string v36, "94.140.14.14"

    .line 91
    .line 92
    const-string v37, "95.85.95.85"

    .line 93
    .line 94
    const-string v38, "101.226.4.6"

    .line 95
    .line 96
    const-string v39, "104.155.237.225"

    .line 97
    .line 98
    const-string v40, "104.197.28.121"

    .line 99
    .line 100
    const-string v41, "114.114.114.114"

    .line 101
    .line 102
    const-string v42, "117.50.10.10"

    .line 103
    .line 104
    const-string v43, "117.50.60.30"

    .line 105
    .line 106
    const-string v44, "119.28.28.28"

    .line 107
    .line 108
    const-string v45, "119.29.29.29"

    .line 109
    .line 110
    const-string v46, "123.125.81.6"

    .line 111
    .line 112
    const-string v47, "149.112.112.10"

    .line 113
    .line 114
    const-string v48, "149.112.112.11"

    .line 115
    .line 116
    const-string v49, "149.112.121.10"

    .line 117
    .line 118
    const-string v50, "149.112.121.20"

    .line 119
    .line 120
    const-string v51, "149.112.121.30"

    .line 121
    .line 122
    const-string v52, "149.112.122.10"

    .line 123
    .line 124
    const-string v53, "149.112.122.20"

    .line 125
    .line 126
    const-string v54, "149.112.122.30"

    .line 127
    .line 128
    const-string v55, "155.248.232.226"

    .line 129
    .line 130
    const-string v56, "156.154.70.1"

    .line 131
    .line 132
    const-string v57, "156.154.70.2"

    .line 133
    .line 134
    const-string v58, "156.154.70.3"

    .line 135
    .line 136
    const-string v59, "156.154.70.4"

    .line 137
    .line 138
    const-string v60, "156.154.70.5"

    .line 139
    .line 140
    const-string v61, "156.154.71.1"

    .line 141
    .line 142
    const-string v62, "156.154.71.2"

    .line 143
    .line 144
    const-string v63, "156.154.71.3"

    .line 145
    .line 146
    const-string v64, "156.154.71.4"

    .line 147
    .line 148
    const-string v65, "156.154.71.5"

    .line 149
    .line 150
    const-string v66, "172.104.93.80"

    .line 151
    .line 152
    const-string v67, "174.138.21.128"

    .line 153
    .line 154
    const-string v68, "176.9.1.117"

    .line 155
    .line 156
    const-string v69, "176.9.93.198"

    .line 157
    .line 158
    const-string v70, "180.184.2.2"

    .line 159
    .line 160
    const-string v71, "180.76.76.76"

    .line 161
    .line 162
    const-string v72, "185.222.222.222"

    .line 163
    .line 164
    const-string v73, "185.228.168.9"

    .line 165
    .line 166
    const-string v74, "185.228.168.10"

    .line 167
    .line 168
    const-string v75, "185.228.168.168"

    .line 169
    .line 170
    const-string v76, "185.228.169.9"

    .line 171
    .line 172
    const-string v77, "185.228.169.11"

    .line 173
    .line 174
    const-string v78, "185.228.169.168"

    .line 175
    .line 176
    const-string v79, "194.169.169.169"

    .line 177
    .line 178
    const-string v80, "195.46.39.39"

    .line 179
    .line 180
    const-string v81, "195.46.39.40"

    .line 181
    .line 182
    const-string v82, "195.133.25.16"

    .line 183
    .line 184
    const-string v83, "195.208.4.1"

    .line 185
    .line 186
    const-string v84, "195.208.5.1"

    .line 187
    .line 188
    const-string v85, "208.67.222.2"

    .line 189
    .line 190
    const-string v86, "212.109.195.93"

    .line 191
    .line 192
    const-string v87, "212.188.31.154"

    .line 193
    .line 194
    const-string v88, "212.188.31.155"

    .line 195
    .line 196
    const-string v89, "218.30.118.6"

    .line 197
    .line 198
    filled-new-array/range {v2 .. v91}, [Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {v2}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    iput-object v2, v1, Lp91;->d:Ljava/lang/Object;

    .line 207
    .line 208
    const-string v2, "1.1.1.1"

    .line 209
    .line 210
    const-string v3, "77.88.8.8"

    .line 211
    .line 212
    const-string v4, "8.8.8.8"

    .line 213
    .line 214
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v2}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iput-object v2, v1, Lp91;->e:Ljava/lang/Object;

    .line 223
    .line 224
    new-instance v2, Lw01;

    .line 225
    .line 226
    const/16 v3, 0x11

    .line 227
    .line 228
    invoke-direct {v2, v3}, Lw01;-><init>(B)V

    .line 229
    .line 230
    .line 231
    new-instance v3, Lvz7;

    .line 232
    .line 233
    invoke-direct {v3, v2}, Lvz7;-><init>(Ldn2;)V

    .line 234
    .line 235
    .line 236
    iput-object v3, v1, Lp91;->f:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {}, Lpw7;->b()Low7;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    sget-object v4, Ltp1;->a:Lnf1;

    .line 243
    .line 244
    sget-object v4, Lye1;->Z:Lye1;

    .line 245
    .line 246
    invoke-static {v2, v4}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-static {v2}, Lgv3;->c(Ls61;)Lm51;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    iput-object v2, v1, Lp91;->h:Ljava/lang/Object;

    .line 255
    .line 256
    const-string v2, "google.com"

    .line 257
    .line 258
    iput-object v2, v1, Lp91;->i:Ljava/lang/Object;

    .line 259
    .line 260
    const/4 v2, 0x0

    .line 261
    :try_start_0
    invoke-virtual {v3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, Lcom/tencent/mmkv/MMKV;

    .line 266
    .line 267
    const-string v4, "WorkDomainsInStorage"

    .line 268
    .line 269
    invoke-virtual {v3, v4}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    if-eqz v3, :cond_0

    .line 274
    .line 275
    sget-object v4, Lyw2;->c:Lcom/google/gson/a;

    .line 276
    .line 277
    new-instance v5, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    new-instance v6, Lyi8;

    .line 290
    .line 291
    invoke-direct {v6, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, v3, v6}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    check-cast v3, Ljava/lang/Iterable;

    .line 302
    .line 303
    invoke-static {v3}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    iput-object v3, v1, Lp91;->j:Ljava/lang/Object;

    .line 308
    .line 309
    const-string v3, "loadData"

    .line 310
    .line 311
    const/4 v4, 0x6

    .line 312
    invoke-static {v0, v3, v2, v4}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    .line 314
    .line 315
    goto :goto_0

    .line 316
    :catchall_0
    move-exception v0

    .line 317
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 318
    .line 319
    if-nez v3, :cond_3

    .line 320
    .line 321
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 322
    .line 323
    if-nez v3, :cond_3

    .line 324
    .line 325
    :cond_0
    :goto_0
    iget-object v0, v1, Lp91;->f:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Lvz7;

    .line 328
    .line 329
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 334
    .line 335
    const-string v3, "DateLastCheckDomains"

    .line 336
    .line 337
    invoke-virtual {v0, v3}, Lcom/tencent/mmkv/MMKV;->g(Ljava/lang/String;)J

    .line 338
    .line 339
    .line 340
    move-result-wide v3

    .line 341
    const-wide/16 v5, 0x1

    .line 342
    .line 343
    cmp-long v0, v3, v5

    .line 344
    .line 345
    if-lez v0, :cond_2

    .line 346
    .line 347
    const-wide/32 v5, 0xf731400

    .line 348
    .line 349
    .line 350
    add-long/2addr v5, v3

    .line 351
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 352
    .line 353
    .line 354
    move-result-wide v7

    .line 355
    cmp-long v0, v5, v7

    .line 356
    .line 357
    if-gez v0, :cond_1

    .line 358
    .line 359
    goto :goto_1

    .line 360
    :cond_1
    const/4 v0, 0x0

    .line 361
    goto :goto_2

    .line 362
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 363
    :goto_2
    iget-object v5, v1, Lp91;->c:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v5, Lyr2;

    .line 366
    .line 367
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    const-string v8, "lastCheck:"

    .line 372
    .line 373
    const-string v9, " current:"

    .line 374
    .line 375
    invoke-static {v3, v4, v8, v9}, Lpc6;->s(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v4, " isExpired:"

    .line 383
    .line 384
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    sget-object v4, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 395
    .line 396
    const/4 v6, 0x4

    .line 397
    invoke-static {v5, v3, v4, v6}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 398
    .line 399
    .line 400
    iget-object v3, v1, Lp91;->h:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v3, Lm51;

    .line 403
    .line 404
    new-instance v4, Lqq1;

    .line 405
    .line 406
    invoke-direct {v4, v0, v1, v2}, Lqq1;-><init>(ZLp91;Lq51;)V

    .line 407
    .line 408
    .line 409
    const/4 v0, 0x3

    .line 410
    invoke-static {v3, v2, v4, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :cond_3
    throw v0
.end method

.method public constructor <init>(Lr91;Lfu6;)V
    .locals 2

    .line 441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 442
    iput-object p1, p0, Lp91;->b:Ljava/lang/Object;

    .line 443
    iput-object p2, p0, Lp91;->a:Ljava/lang/Object;

    .line 444
    new-instance p2, Lm91;

    const/4 v0, 0x1

    invoke-direct {p2, v0, v0, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lrs1;->a(Lu06;)Lu06;

    move-result-object p2

    iput-object p2, p0, Lp91;->c:Ljava/lang/Object;

    .line 445
    new-instance p2, Lm91;

    const/4 v1, 0x2

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lrs1;->a(Lu06;)Lu06;

    move-result-object p2

    iput-object p2, p0, Lp91;->d:Ljava/lang/Object;

    .line 446
    new-instance p2, Lm91;

    const/4 v1, 0x4

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lp91;->g:Ljava/lang/Object;

    .line 447
    new-instance p2, Lm91;

    const/4 v1, 0x5

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lp91;->h:Ljava/lang/Object;

    .line 448
    new-instance p2, Lm91;

    const/4 v1, 0x6

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lp91;->i:Ljava/lang/Object;

    .line 449
    new-instance p2, Lm91;

    const/4 v1, 0x7

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lp91;->j:Ljava/lang/Object;

    .line 450
    new-instance p2, Lm91;

    const/16 v1, 0x8

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lp91;->k:Ljava/lang/Object;

    .line 451
    new-instance p2, Lm91;

    const/4 v1, 0x3

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lrs1;->a(Lu06;)Lu06;

    move-result-object p2

    iput-object p2, p0, Lp91;->e:Ljava/lang/Object;

    .line 452
    new-instance p2, Lm91;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1, p1, p0}, Lm91;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lrs1;->a(Lu06;)Lu06;

    move-result-object p1

    iput-object p1, p0, Lp91;->f:Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lpp2;Lc15;)Z
    .locals 5

    .line 1
    iget-object v0, p1, Lc15;->X:[Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p1, Lc15;->Z:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, p1, :cond_2

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    check-cast v3, Lpp2;

    .line 12
    .line 13
    iget-object v3, v3, Lpp2;->a:Lvc6;

    .line 14
    .line 15
    instance-of v4, v3, Lnj5;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    check-cast v3, Lnj5;

    .line 20
    .line 21
    iget-object v3, v3, Lnj5;->Y:Lc15;

    .line 22
    .line 23
    invoke-virtual {v3, p0}, Lc15;->j(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {p0, v3}, Lp91;->g(Lpp2;Lc15;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    :goto_1
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v1
.end method

.method public static h()Lp91;
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    sget-object v0, Lb77;->a:Lp91;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lp91;

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {v0, v1}, Lp91;-><init>(B)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method


# virtual methods
.method public a(La77;[FFLandroid/graphics/RectF;Lq02;Landroid/graphics/Path;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    iget-object v6, v0, Lp91;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, [Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-object v7, v0, Lp91;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v7, [F

    .line 20
    .line 21
    iget-object v8, v0, Lp91;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v8, [Ll77;

    .line 24
    .line 25
    iget-object v9, v0, Lp91;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v9, [Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 30
    .line 31
    .line 32
    iget-object v10, v0, Lp91;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v10, Landroid/graphics/Path;

    .line 35
    .line 36
    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    .line 37
    .line 38
    .line 39
    iget-object v11, v0, Lp91;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v11, Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {v11}, Landroid/graphics/Path;->rewind()V

    .line 44
    .line 45
    .line 46
    sget-object v12, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 47
    .line 48
    invoke-virtual {v11, v3, v12}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 49
    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    :goto_0
    const/4 v14, 0x2

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/4 v12, 0x4

    .line 56
    const/4 v15, 0x1

    .line 57
    if-ge v13, v12, :cond_a

    .line 58
    .line 59
    iget-object v12, v0, Lp91;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v12, Landroid/graphics/PointF;

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    if-eq v13, v15, :cond_2

    .line 66
    .line 67
    if-eq v13, v14, :cond_1

    .line 68
    .line 69
    const/4 v14, 0x3

    .line 70
    if-eq v13, v14, :cond_0

    .line 71
    .line 72
    iget-object v14, v1, La77;->f:Lm61;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    iget-object v14, v1, La77;->e:Lm61;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-object v14, v1, La77;->h:Lm61;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iget-object v14, v1, La77;->g:Lm61;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    new-instance v14, Les0;

    .line 85
    .line 86
    aget v15, p2, v13

    .line 87
    .line 88
    invoke-direct {v14, v15}, Les0;-><init>(F)V

    .line 89
    .line 90
    .line 91
    const/4 v15, 0x1

    .line 92
    :goto_1
    if-eq v13, v15, :cond_6

    .line 93
    .line 94
    const/4 v15, 0x2

    .line 95
    if-eq v13, v15, :cond_5

    .line 96
    .line 97
    const/4 v15, 0x3

    .line 98
    if-eq v13, v15, :cond_4

    .line 99
    .line 100
    iget-object v15, v1, La77;->b:Lz91;

    .line 101
    .line 102
    :goto_2
    move-object/from16 v19, v6

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    iget-object v15, v1, La77;->a:Lz91;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    iget-object v15, v1, La77;->d:Lz91;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    iget-object v15, v1, La77;->c:Lz91;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_3
    aget-object v6, v8, v13

    .line 115
    .line 116
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-interface {v14, v3}, Lm61;->a(Landroid/graphics/RectF;)F

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-virtual {v15, v6, v2, v14}, Lz91;->D(Ll77;FF)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v6, v13, 0x1

    .line 127
    .line 128
    rem-int/lit8 v14, v6, 0x4

    .line 129
    .line 130
    mul-int/lit8 v14, v14, 0x5a

    .line 131
    .line 132
    int-to-float v14, v14

    .line 133
    aget-object v15, v9, v13

    .line 134
    .line 135
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 136
    .line 137
    .line 138
    const/4 v15, 0x1

    .line 139
    if-eq v13, v15, :cond_9

    .line 140
    .line 141
    const/4 v15, 0x2

    .line 142
    if-eq v13, v15, :cond_8

    .line 143
    .line 144
    const/4 v15, 0x3

    .line 145
    if-eq v13, v15, :cond_7

    .line 146
    .line 147
    iget v15, v3, Landroid/graphics/RectF;->right:F

    .line 148
    .line 149
    move/from16 v17, v6

    .line 150
    .line 151
    iget v6, v3, Landroid/graphics/RectF;->top:F

    .line 152
    .line 153
    invoke-virtual {v12, v15, v6}, Landroid/graphics/PointF;->set(FF)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    move/from16 v17, v6

    .line 158
    .line 159
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 160
    .line 161
    iget v15, v3, Landroid/graphics/RectF;->top:F

    .line 162
    .line 163
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    move/from16 v17, v6

    .line 168
    .line 169
    iget v6, v3, Landroid/graphics/RectF;->left:F

    .line 170
    .line 171
    iget v15, v3, Landroid/graphics/RectF;->bottom:F

    .line 172
    .line 173
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    move/from16 v17, v6

    .line 178
    .line 179
    iget v6, v3, Landroid/graphics/RectF;->right:F

    .line 180
    .line 181
    iget v15, v3, Landroid/graphics/RectF;->bottom:F

    .line 182
    .line 183
    invoke-virtual {v12, v6, v15}, Landroid/graphics/PointF;->set(FF)V

    .line 184
    .line 185
    .line 186
    :goto_4
    aget-object v6, v9, v13

    .line 187
    .line 188
    iget v15, v12, Landroid/graphics/PointF;->x:F

    .line 189
    .line 190
    iget v12, v12, Landroid/graphics/PointF;->y:F

    .line 191
    .line 192
    invoke-virtual {v6, v15, v12}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 193
    .line 194
    .line 195
    aget-object v6, v9, v13

    .line 196
    .line 197
    invoke-virtual {v6, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 198
    .line 199
    .line 200
    aget-object v6, v8, v13

    .line 201
    .line 202
    iget v12, v6, Ll77;->c:F

    .line 203
    .line 204
    aput v12, v7, v16

    .line 205
    .line 206
    iget v6, v6, Ll77;->d:F

    .line 207
    .line 208
    const/16 v18, 0x1

    .line 209
    .line 210
    aput v6, v7, v18

    .line 211
    .line 212
    aget-object v6, v9, v13

    .line 213
    .line 214
    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 215
    .line 216
    .line 217
    aget-object v6, v19, v13

    .line 218
    .line 219
    invoke-virtual {v6}, Landroid/graphics/Matrix;->reset()V

    .line 220
    .line 221
    .line 222
    aget-object v6, v19, v13

    .line 223
    .line 224
    aget v12, v7, v16

    .line 225
    .line 226
    aget v15, v7, v18

    .line 227
    .line 228
    invoke-virtual {v6, v12, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 229
    .line 230
    .line 231
    aget-object v6, v19, v13

    .line 232
    .line 233
    invoke-virtual {v6, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 234
    .line 235
    .line 236
    move/from16 v13, v17

    .line 237
    .line 238
    move-object/from16 v6, v19

    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_a
    move-object/from16 v19, v6

    .line 243
    .line 244
    move/from16 v18, v15

    .line 245
    .line 246
    move/from16 v6, v16

    .line 247
    .line 248
    :goto_5
    if-ge v6, v12, :cond_14

    .line 249
    .line 250
    aget-object v13, v8, v6

    .line 251
    .line 252
    iget v14, v13, Ll77;->a:F

    .line 253
    .line 254
    aput v14, v7, v16

    .line 255
    .line 256
    iget v13, v13, Ll77;->b:F

    .line 257
    .line 258
    aput v13, v7, v18

    .line 259
    .line 260
    aget-object v13, v9, v6

    .line 261
    .line 262
    invoke-virtual {v13, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 263
    .line 264
    .line 265
    if-nez v6, :cond_b

    .line 266
    .line 267
    aget v13, v7, v16

    .line 268
    .line 269
    aget v14, v7, v18

    .line 270
    .line 271
    invoke-virtual {v5, v13, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_b
    aget v13, v7, v16

    .line 276
    .line 277
    aget v14, v7, v18

    .line 278
    .line 279
    invoke-virtual {v5, v13, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 280
    .line 281
    .line 282
    :goto_6
    aget-object v13, v8, v6

    .line 283
    .line 284
    aget-object v14, v9, v6

    .line 285
    .line 286
    invoke-virtual {v13, v14, v5}, Ll77;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 287
    .line 288
    .line 289
    if-eqz v4, :cond_c

    .line 290
    .line 291
    aget-object v13, v8, v6

    .line 292
    .line 293
    aget-object v14, v9, v6

    .line 294
    .line 295
    iget-object v15, v4, Lq02;->Y:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v15, Lgr4;

    .line 298
    .line 299
    iget-object v12, v15, Lgr4;->g0:Ljava/util/BitSet;

    .line 300
    .line 301
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move/from16 v3, v16

    .line 305
    .line 306
    invoke-virtual {v12, v6, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 307
    .line 308
    .line 309
    iget-object v3, v15, Lgr4;->Z:[Lk77;

    .line 310
    .line 311
    iget v12, v13, Ll77;->f:F

    .line 312
    .line 313
    invoke-virtual {v13, v12}, Ll77;->a(F)V

    .line 314
    .line 315
    .line 316
    new-instance v12, Landroid/graphics/Matrix;

    .line 317
    .line 318
    invoke-direct {v12, v14}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 319
    .line 320
    .line 321
    new-instance v14, Ljava/util/ArrayList;

    .line 322
    .line 323
    iget-object v13, v13, Ll77;->h:Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 326
    .line 327
    .line 328
    new-instance v13, Le77;

    .line 329
    .line 330
    invoke-direct {v13, v14, v12}, Le77;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 331
    .line 332
    .line 333
    aput-object v13, v3, v6

    .line 334
    .line 335
    :cond_c
    iget-object v3, v0, Lp91;->j:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v3, Landroid/graphics/Path;

    .line 338
    .line 339
    iget-object v12, v0, Lp91;->g:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v12, Ll77;

    .line 342
    .line 343
    add-int/lit8 v13, v6, 0x1

    .line 344
    .line 345
    rem-int/lit8 v14, v13, 0x4

    .line 346
    .line 347
    aget-object v15, v8, v6

    .line 348
    .line 349
    move-object/from16 v20, v8

    .line 350
    .line 351
    iget v8, v15, Ll77;->c:F

    .line 352
    .line 353
    const/16 v16, 0x0

    .line 354
    .line 355
    aput v8, v7, v16

    .line 356
    .line 357
    iget v8, v15, Ll77;->d:F

    .line 358
    .line 359
    const/16 v18, 0x1

    .line 360
    .line 361
    aput v8, v7, v18

    .line 362
    .line 363
    aget-object v8, v9, v6

    .line 364
    .line 365
    invoke-virtual {v8, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 366
    .line 367
    .line 368
    iget-object v8, v0, Lp91;->i:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v8, [F

    .line 371
    .line 372
    aget-object v15, v20, v14

    .line 373
    .line 374
    move-object/from16 v21, v9

    .line 375
    .line 376
    iget v9, v15, Ll77;->a:F

    .line 377
    .line 378
    aput v9, v8, v16

    .line 379
    .line 380
    iget v9, v15, Ll77;->b:F

    .line 381
    .line 382
    aput v9, v8, v18

    .line 383
    .line 384
    aget-object v9, v21, v14

    .line 385
    .line 386
    invoke-virtual {v9, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 387
    .line 388
    .line 389
    aget v9, v7, v16

    .line 390
    .line 391
    aget v15, v8, v16

    .line 392
    .line 393
    sub-float/2addr v9, v15

    .line 394
    move-object/from16 p2, v8

    .line 395
    .line 396
    float-to-double v8, v9

    .line 397
    aget v15, v7, v18

    .line 398
    .line 399
    aget v22, p2, v18

    .line 400
    .line 401
    sub-float v15, v15, v22

    .line 402
    .line 403
    move-object/from16 v22, v10

    .line 404
    .line 405
    move-object/from16 v23, v11

    .line 406
    .line 407
    float-to-double v10, v15

    .line 408
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    .line 409
    .line 410
    .line 411
    move-result-wide v8

    .line 412
    double-to-float v8, v8

    .line 413
    const v9, 0x3a83126f    # 0.001f

    .line 414
    .line 415
    .line 416
    sub-float/2addr v8, v9

    .line 417
    const/4 v9, 0x0

    .line 418
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    aget-object v10, v20, v6

    .line 423
    .line 424
    iget v11, v10, Ll77;->c:F

    .line 425
    .line 426
    const/16 v16, 0x0

    .line 427
    .line 428
    aput v11, v7, v16

    .line 429
    .line 430
    iget v10, v10, Ll77;->d:F

    .line 431
    .line 432
    const/4 v15, 0x1

    .line 433
    aput v10, v7, v15

    .line 434
    .line 435
    aget-object v10, v21, v6

    .line 436
    .line 437
    invoke-virtual {v10, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 438
    .line 439
    .line 440
    if-eq v6, v15, :cond_d

    .line 441
    .line 442
    const/4 v10, 0x3

    .line 443
    if-eq v6, v10, :cond_d

    .line 444
    .line 445
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->centerY()F

    .line 446
    .line 447
    .line 448
    move-result v10

    .line 449
    aget v11, v7, v15

    .line 450
    .line 451
    sub-float/2addr v10, v11

    .line 452
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 453
    .line 454
    .line 455
    move-result v10

    .line 456
    goto :goto_7

    .line 457
    :cond_d
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/RectF;->centerX()F

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    const/16 v16, 0x0

    .line 462
    .line 463
    aget v11, v7, v16

    .line 464
    .line 465
    sub-float/2addr v10, v11

    .line 466
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    :goto_7
    const/high16 v11, 0x43870000    # 270.0f

    .line 471
    .line 472
    invoke-virtual {v12, v9, v9, v11, v9}, Ll77;->d(FFFF)V

    .line 473
    .line 474
    .line 475
    const/4 v15, 0x1

    .line 476
    if-eq v6, v15, :cond_10

    .line 477
    .line 478
    const/4 v15, 0x2

    .line 479
    if-eq v6, v15, :cond_f

    .line 480
    .line 481
    const/4 v9, 0x3

    .line 482
    if-eq v6, v9, :cond_e

    .line 483
    .line 484
    iget-object v11, v1, La77;->j:Loy1;

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :cond_e
    iget-object v11, v1, La77;->i:Loy1;

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_f
    const/4 v9, 0x3

    .line 491
    iget-object v11, v1, La77;->l:Loy1;

    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_10
    const/4 v9, 0x3

    .line 495
    const/4 v15, 0x2

    .line 496
    iget-object v11, v1, La77;->k:Loy1;

    .line 497
    .line 498
    :goto_8
    invoke-virtual {v11, v8, v10, v2, v12}, Loy1;->x(FFFLl77;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 502
    .line 503
    .line 504
    aget-object v8, v19, v6

    .line 505
    .line 506
    invoke-virtual {v12, v8, v3}, Ll77;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v11}, Loy1;->w()Z

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    if-nez v8, :cond_12

    .line 514
    .line 515
    invoke-virtual {v0, v3, v6}, Lp91;->k(Landroid/graphics/Path;I)Z

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    if-nez v8, :cond_12

    .line 520
    .line 521
    invoke-virtual {v0, v3, v14}, Lp91;->k(Landroid/graphics/Path;I)Z

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    if-eqz v8, :cond_11

    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_11
    aget-object v3, v19, v6

    .line 529
    .line 530
    invoke-virtual {v12, v3, v5}, Ll77;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 531
    .line 532
    .line 533
    move-object/from16 v10, v22

    .line 534
    .line 535
    move-object/from16 v11, v23

    .line 536
    .line 537
    const/16 v18, 0x1

    .line 538
    .line 539
    goto :goto_a

    .line 540
    :cond_12
    :goto_9
    sget-object v8, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 541
    .line 542
    move-object/from16 v11, v23

    .line 543
    .line 544
    invoke-virtual {v3, v3, v11, v8}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 545
    .line 546
    .line 547
    iget v3, v12, Ll77;->a:F

    .line 548
    .line 549
    const/16 v16, 0x0

    .line 550
    .line 551
    aput v3, v7, v16

    .line 552
    .line 553
    iget v3, v12, Ll77;->b:F

    .line 554
    .line 555
    const/16 v18, 0x1

    .line 556
    .line 557
    aput v3, v7, v18

    .line 558
    .line 559
    aget-object v3, v19, v6

    .line 560
    .line 561
    invoke-virtual {v3, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 562
    .line 563
    .line 564
    aget v3, v7, v16

    .line 565
    .line 566
    aget v8, v7, v18

    .line 567
    .line 568
    move-object/from16 v10, v22

    .line 569
    .line 570
    invoke-virtual {v10, v3, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 571
    .line 572
    .line 573
    aget-object v3, v19, v6

    .line 574
    .line 575
    invoke-virtual {v12, v3, v10}, Ll77;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 576
    .line 577
    .line 578
    :goto_a
    if-eqz v4, :cond_13

    .line 579
    .line 580
    aget-object v3, v19, v6

    .line 581
    .line 582
    iget-object v8, v4, Lq02;->Y:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v8, Lgr4;

    .line 585
    .line 586
    iget-object v14, v8, Lgr4;->g0:Ljava/util/BitSet;

    .line 587
    .line 588
    add-int/lit8 v9, v6, 0x4

    .line 589
    .line 590
    const/4 v15, 0x0

    .line 591
    invoke-virtual {v14, v9, v15}, Ljava/util/BitSet;->set(IZ)V

    .line 592
    .line 593
    .line 594
    iget-object v8, v8, Lgr4;->f0:[Lk77;

    .line 595
    .line 596
    iget v9, v12, Ll77;->f:F

    .line 597
    .line 598
    invoke-virtual {v12, v9}, Ll77;->a(F)V

    .line 599
    .line 600
    .line 601
    new-instance v9, Landroid/graphics/Matrix;

    .line 602
    .line 603
    invoke-direct {v9, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 604
    .line 605
    .line 606
    new-instance v3, Ljava/util/ArrayList;

    .line 607
    .line 608
    iget-object v12, v12, Ll77;->h:Ljava/util/ArrayList;

    .line 609
    .line 610
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 611
    .line 612
    .line 613
    new-instance v12, Le77;

    .line 614
    .line 615
    invoke-direct {v12, v3, v9}, Le77;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 616
    .line 617
    .line 618
    aput-object v12, v8, v6

    .line 619
    .line 620
    goto :goto_b

    .line 621
    :cond_13
    const/4 v15, 0x0

    .line 622
    :goto_b
    move-object/from16 v3, p4

    .line 623
    .line 624
    move v6, v13

    .line 625
    move/from16 v16, v15

    .line 626
    .line 627
    move-object/from16 v8, v20

    .line 628
    .line 629
    move-object/from16 v9, v21

    .line 630
    .line 631
    const/4 v12, 0x4

    .line 632
    goto/16 :goto_5

    .line 633
    .line 634
    :cond_14
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v10}, Landroid/graphics/Path;->close()V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v10}, Landroid/graphics/Path;->isEmpty()Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-nez v0, :cond_15

    .line 645
    .line 646
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 647
    .line 648
    invoke-virtual {v5, v10, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 649
    .line 650
    .line 651
    :cond_15
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lp91;->a:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object v0, p0, Lp91;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v1, p0, Lp91;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lc15;

    .line 9
    .line 10
    invoke-virtual {v1}, Lc15;->g()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lp91;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lt05;

    .line 16
    .line 17
    invoke-virtual {v2}, Lt05;->b()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lp91;->e:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v1, p0, Lp91;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lc15;

    .line 25
    .line 26
    invoke-virtual {v1}, Lc15;->g()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lp91;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lc15;

    .line 32
    .line 33
    invoke-virtual {v1}, Lc15;->g()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lp91;->h:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v0, p0, Lp91;->i:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v0, p0, Lp91;->j:Ljava/lang/Object;

    .line 41
    .line 42
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object p0, p0, Lp91;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/Set;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    move-object v0, p0

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const-string v0, "Compose:abandons"

    .line 18
    .line 19
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lvc6;

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lvc6;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    :goto_1
    return-void
.end method

.method public d()V
    .locals 8

    .line 1
    iget-object v0, p0, Lp91;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc15;

    .line 4
    .line 5
    iget-object v1, p0, Lp91;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc15;

    .line 8
    .line 9
    iget-object v2, p0, Lp91;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/Set;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    iput-object v3, p0, Lp91;->k:Ljava/lang/Object;

    .line 19
    .line 20
    iget v3, v1, Lc15;->Z:I

    .line 21
    .line 22
    const/16 v4, 0x12

    .line 23
    .line 24
    if-eqz v3, :cond_6

    .line 25
    .line 26
    const-string v3, "Compose:onForgotten"

    .line 27
    .line 28
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v3, p0, Lp91;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Lt05;

    .line 34
    .line 35
    iget v5, v1, Lc15;->Z:I

    .line 36
    .line 37
    add-int/lit8 v5, v5, -0x1

    .line 38
    .line 39
    :goto_0
    const/4 v6, -0x1

    .line 40
    if-ge v6, v5, :cond_5

    .line 41
    .line 42
    iget-object v6, v1, Lc15;->X:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object v6, v6, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    .line 46
    :try_start_1
    instance-of v7, v6, Lpp2;

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    move-object v7, v6

    .line 51
    check-cast v7, Lpp2;

    .line 52
    .line 53
    iget-object v7, v7, Lpp2;->a:Lvc6;

    .line 54
    .line 55
    invoke-interface {v2, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-interface {v7}, Lvc6;->b()V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_3

    .line 64
    :cond_1
    :goto_1
    instance-of v7, v6, Ljz0;

    .line 65
    .line 66
    if-eqz v7, :cond_3

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {v3, v6}, Lt05;->c(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    move-object v7, v6

    .line 77
    check-cast v7, Ljz0;

    .line 78
    .line 79
    invoke-interface {v7}, Ljz0;->a()V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move-object v7, v6

    .line 84
    check-cast v7, Ljz0;

    .line 85
    .line 86
    invoke-interface {v7}, Ljz0;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, -0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :goto_3
    :try_start_2
    iget-object p0, p0, Lp91;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lp01;

    .line 95
    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    new-instance v1, Lp5;

    .line 99
    .line 100
    invoke-direct {v1, p0, v6, v4}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Los4;->U(Ljava/lang/Throwable;Ldn2;)Z

    .line 104
    .line 105
    .line 106
    :cond_4
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 107
    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :catchall_1
    move-exception p0

    .line 112
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_6
    :goto_4
    iget v1, v0, Lc15;->Z:I

    .line 117
    .line 118
    if-eqz v1, :cond_a

    .line 119
    .line 120
    const-string v1, "Compose:onRemembered"

    .line 121
    .line 122
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :try_start_3
    iget-object v1, p0, Lp91;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Ljava/util/Set;

    .line 128
    .line 129
    if-nez v1, :cond_7

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_7
    iget-object v2, v0, Lc15;->X:[Ljava/lang/Object;

    .line 133
    .line 134
    iget v0, v0, Lc15;->Z:I

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    :goto_5
    if-ge v3, v0, :cond_9

    .line 138
    .line 139
    aget-object v5, v2, v3

    .line 140
    .line 141
    check-cast v5, Lpp2;

    .line 142
    .line 143
    iget-object v6, v5, Lpp2;->a:Lvc6;

    .line 144
    .line 145
    invoke-interface {v1, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 146
    .line 147
    .line 148
    :try_start_4
    invoke-interface {v6}, Lvc6;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 149
    .line 150
    .line 151
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :catchall_2
    move-exception v0

    .line 155
    :try_start_5
    iget-object p0, p0, Lp91;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, Lp01;

    .line 158
    .line 159
    if-eqz p0, :cond_8

    .line 160
    .line 161
    new-instance v1, Lp5;

    .line 162
    .line 163
    invoke-direct {v1, p0, v5, v4}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v1}, Los4;->U(Ljava/lang/Throwable;Ldn2;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_6

    .line 170
    :catchall_3
    move-exception p0

    .line 171
    goto :goto_8

    .line 172
    :cond_8
    :goto_6
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 173
    :cond_9
    :goto_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :goto_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 178
    .line 179
    .line 180
    throw p0

    .line 181
    :cond_a
    :goto_9
    return-void
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object p0, p0, Lp91;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lc15;

    .line 4
    .line 5
    iget v0, p0, Lc15;->Z:I

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "Compose:sideeffects"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, Lc15;->X:[Ljava/lang/Object;

    .line 15
    .line 16
    iget v1, p0, Lc15;->Z:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    check-cast v3, Ldn2;

    .line 24
    .line 25
    invoke-interface {v3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lc15;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    return-void
.end method

.method public f(Lpp2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp91;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc15;

    .line 4
    .line 5
    iget-object v1, p0, Lp91;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lt05;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lt05;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    iget-object v1, p0, Lp91;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lt05;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lt05;->l(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lp91;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lc15;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lc15;->j(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lc15;->j(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1, v0}, Lp91;->g(Lpp2;Lc15;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object p0, p0, Lp91;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/util/Set;

    .line 45
    .line 46
    if-nez p0, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object p1, p1, Lpp2;->a:Lvc6;

    .line 50
    .line 51
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    iget-object v0, p0, Lp91;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lt05;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lt05;->c(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    :goto_1
    return-void

    .line 69
    :cond_5
    :goto_2
    iget-object p0, p0, Lp91;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lc15;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public i()Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lp91;->g:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v1}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object p0, p0, Lp91;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p0, Ld02;->X:Ld02;

    .line 18
    .line 19
    :goto_0
    invoke-static {v1, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object p0, v0

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    instance-of v1, p0, Ljava/lang/InterruptedException;

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    instance-of v1, p0, Ljava/util/concurrent/CancellationException;

    .line 37
    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    new-instance v1, Lrj6;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p0, v1

    .line 46
    :cond_1
    :goto_1
    nop

    .line 47
    instance-of v1, p0, Lrj6;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v0, p0

    .line 53
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_3
    throw p0
.end method

.method public j()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lp91;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    const-string v1, "systemResolvers:"

    .line 6
    .line 7
    :try_start_0
    iget-object v2, p0, Lp91;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v2}, Lt08;->c(Landroid/content/Context;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lp91;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lyr2;

    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x6

    .line 33
    invoke-static {v3, v1, v4, v5}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lwv0;->a1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    new-instance v1, Lrj6;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v1

    .line 66
    :goto_0
    iget-object p0, p0, Lp91;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Ljava/util/List;

    .line 69
    .line 70
    instance-of v1, v0, Lrj6;

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    move-object v0, p0

    .line 75
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_1
    throw v0
.end method

.method public k(Landroid/graphics/Path;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp91;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp91;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [Ll77;

    .line 11
    .line 12
    aget-object v1, v1, p2

    .line 13
    .line 14
    iget-object p0, p0, Lp91;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, [Landroid/graphics/Matrix;

    .line 17
    .line 18
    aget-object p0, p0, p2

    .line 19
    .line 20
    invoke-virtual {v1, p0, v0}, Ll77;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/graphics/RectF;->width()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpl-float p1, p1, v0

    .line 56
    .line 57
    if-lez p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/RectF;->height()F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    cmpl-float p0, p0, v0

    .line 64
    .line 65
    if-lez p0, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 p0, 0x0

    .line 69
    return p0

    .line 70
    :cond_1
    :goto_0
    return p2
.end method

.method public l(Ljava/util/Set;Lp01;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lp91;->b()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp91;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lp91;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public m(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lrq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lrq1;

    .line 7
    .line 8
    iget v1, v0, Lrq1;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lrq1;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lrq1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lrq1;-><init>(Lp91;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lrq1;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lrq1;->h0:I

    .line 28
    .line 29
    sget-object v2, Ldn8;->a:Ldn8;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lp91;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/util/List;

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iput v3, v0, Lrq1;->h0:I

    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, Lp91;->p(Ljava/util/List;Ls51;)Ljava/io/Serializable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lc71;->X:Lc71;

    .line 64
    .line 65
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    iput-object p1, p0, Lp91;->k:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_5
    :goto_2
    return-object v2
.end method

.method public n(Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lp91;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lvz7;

    .line 4
    .line 5
    instance-of v1, p1, Lsq1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, Lsq1;

    .line 11
    .line 12
    iget v2, v1, Lsq1;->h0:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lsq1;->h0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lsq1;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, Lsq1;-><init>(Lp91;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, Lsq1;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lsq1;->h0:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    sget-object v6, Lc71;->X:Lc71;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput v5, v1, Lsq1;->h0:I

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lp91;->o(Ls51;)Ljava/io/Serializable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v6, :cond_4

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 71
    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_5
    iput-object p1, p0, Lp91;->j:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_7

    .line 82
    .line 83
    :try_start_0
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lcom/tencent/mmkv/MMKV;

    .line 88
    .line 89
    const-string v5, "WorkDomainsInStorage"

    .line 90
    .line 91
    sget-object v7, Lkw4;->a:Lkw4;

    .line 92
    .line 93
    invoke-static {}, Lkw4;->g()Lcom/google/gson/a;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    iget-object v8, p0, Lp91;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v8, Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v2, v5, v7}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 113
    .line 114
    const-string v2, "DateLastCheckDomains"

    .line 115
    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    invoke-virtual {v0, v7, v8, v2}, Lcom/tencent/mmkv/MMKV;->m(JLjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lp91;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Lyr2;

    .line 126
    .line 127
    const-string v2, "saveData"

    .line 128
    .line 129
    const/4 v5, 0x6

    .line 130
    invoke-static {v0, v2, v3, v5}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 136
    .line 137
    if-nez v2, :cond_6

    .line 138
    .line 139
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 140
    .line 141
    if-nez v2, :cond_6

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    throw v0

    .line 145
    :cond_7
    :goto_2
    iput v4, v1, Lsq1;->h0:I

    .line 146
    .line 147
    invoke-virtual {p0, p1, v1}, Lp91;->p(Ljava/util/List;Ls51;)Ljava/io/Serializable;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v6, :cond_8

    .line 152
    .line 153
    :goto_3
    return-object v6

    .line 154
    :cond_8
    :goto_4
    check-cast p1, Ljava/util/List;

    .line 155
    .line 156
    if-eqz p1, :cond_9

    .line 157
    .line 158
    iput-object p1, p0, Lp91;->k:Ljava/lang/Object;

    .line 159
    .line 160
    :cond_9
    :goto_5
    sget-object p0, Ldn8;->a:Ldn8;

    .line 161
    .line 162
    return-object p0
.end method

.method public o(Ls51;)Ljava/io/Serializable;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lp91;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lyr2;

    .line 8
    .line 9
    const-string v3, "checkDnsDomains for TUNNEL END time:"

    .line 10
    .line 11
    const-string v4, "sortMap:"

    .line 12
    .line 13
    const-string v5, "mapResult:"

    .line 14
    .line 15
    const-string v6, "checkDnsDomains for TUNNEL END successCount:"

    .line 16
    .line 17
    instance-of v7, v1, Ltq1;

    .line 18
    .line 19
    if-eqz v7, :cond_0

    .line 20
    .line 21
    move-object v7, v1

    .line 22
    check-cast v7, Ltq1;

    .line 23
    .line 24
    iget v8, v7, Ltq1;->i0:I

    .line 25
    .line 26
    const/high16 v9, -0x80000000

    .line 27
    .line 28
    and-int v10, v8, v9

    .line 29
    .line 30
    if-eqz v10, :cond_0

    .line 31
    .line 32
    sub-int/2addr v8, v9

    .line 33
    iput v8, v7, Ltq1;->i0:I

    .line 34
    .line 35
    :goto_0
    move-object v15, v7

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v7, Ltq1;

    .line 38
    .line 39
    invoke-direct {v7, v0, v1}, Ltq1;-><init>(Lp91;Ls51;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    iget-object v1, v15, Ltq1;->g0:Ljava/lang/Object;

    .line 44
    .line 45
    iget v7, v15, Ltq1;->i0:I

    .line 46
    .line 47
    const/4 v8, 0x4

    .line 48
    const/4 v9, 0x1

    .line 49
    const/4 v10, 0x0

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    if-ne v7, v9, :cond_1

    .line 53
    .line 54
    iget-wide v11, v15, Ltq1;->f0:J

    .line 55
    .line 56
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    move-object v7, v1

    .line 60
    move v0, v8

    .line 61
    move-object v1, v10

    .line 62
    goto :goto_2

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object v1, v10

    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v10

    .line 73
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v11

    .line 80
    const-string v1, "checkDnsDomains for TUNNEL START"

    .line 81
    .line 82
    sget-object v7, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 83
    .line 84
    invoke-static {v2, v1, v7, v8}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 85
    .line 86
    .line 87
    move v1, v8

    .line 88
    sget-object v8, Lbs1;->a:Lbs1;

    .line 89
    .line 90
    invoke-virtual {v0}, Lp91;->j()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iget-object v13, v0, Lp91;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v13, Ljava/util/List;

    .line 97
    .line 98
    new-instance v14, Lpq1;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v14, v0, v1}, Lpq1;-><init>(Lp91;B)V

    .line 102
    .line 103
    .line 104
    iput-wide v11, v15, Ltq1;->f0:J

    .line 105
    .line 106
    iput v9, v15, Ltq1;->i0:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    move-wide v0, v11

    .line 109
    const/16 v11, 0x9c4

    .line 110
    .line 111
    move-object v9, v10

    .line 112
    move-object v10, v13

    .line 113
    const-wide/16 v12, 0x5dc

    .line 114
    .line 115
    move-wide/from16 v16, v0

    .line 116
    .line 117
    move-object v1, v9

    .line 118
    const/4 v0, 0x4

    .line 119
    move-object v9, v7

    .line 120
    :try_start_2
    invoke-virtual/range {v8 .. v15}, Lbs1;->d(Ljava/util/List;Ljava/util/List;IJLpq1;Ls51;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    sget-object v8, Lc71;->X:Lc71;

    .line 125
    .line 126
    if-ne v7, v8, :cond_3

    .line 127
    .line 128
    return-object v8

    .line 129
    :cond_3
    move-wide/from16 v11, v16

    .line 130
    .line 131
    :goto_2
    :try_start_3
    check-cast v7, Ljava/util/Map;

    .line 132
    .line 133
    if-eqz v7, :cond_4

    .line 134
    .line 135
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    new-instance v10, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-direct {v10, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catchall_1
    move-exception v0

    .line 146
    goto/16 :goto_5

    .line 147
    .line 148
    :cond_4
    move-object v10, v1

    .line 149
    :goto_3
    new-instance v8, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    sget-object v8, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 162
    .line 163
    invoke-static {v2, v6, v8, v0}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 164
    .line 165
    .line 166
    new-instance v6, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    const/4 v6, 0x6

    .line 179
    invoke-static {v2, v5, v1, v6}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 180
    .line 181
    .line 182
    if-eqz v7, :cond_5

    .line 183
    .line 184
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    if-eqz v5, :cond_5

    .line 189
    .line 190
    check-cast v5, Ljava/lang/Iterable;

    .line 191
    .line 192
    new-instance v6, Ll71;

    .line 193
    .line 194
    const/16 v7, 0x11

    .line 195
    .line 196
    invoke-direct {v6, v7}, Ll71;-><init>(B)V

    .line 197
    .line 198
    .line 199
    invoke-static {v5, v6}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    new-instance v6, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-static {v2, v4, v8, v0}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 216
    .line 217
    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 219
    .line 220
    .line 221
    move-result-wide v6

    .line 222
    sub-long/2addr v6, v11

    .line 223
    new-instance v4, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-static {v2, v3, v8, v0}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 236
    .line 237
    .line 238
    new-instance v10, Ljava/util/ArrayList;

    .line 239
    .line 240
    const/16 v0, 0xa

    .line 241
    .line 242
    invoke-static {v5, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_6

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    check-cast v2, Ljava/util/Map$Entry;

    .line 264
    .line 265
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, Ljava/lang/String;

    .line 270
    .line 271
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_5
    move-object v10, v1

    .line 276
    goto :goto_6

    .line 277
    :goto_5
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 278
    .line 279
    if-nez v2, :cond_8

    .line 280
    .line 281
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 282
    .line 283
    if-nez v2, :cond_8

    .line 284
    .line 285
    new-instance v2, Lrj6;

    .line 286
    .line 287
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    move-object v10, v2

    .line 291
    :cond_6
    :goto_6
    instance-of v0, v10, Lrj6;

    .line 292
    .line 293
    if-eqz v0, :cond_7

    .line 294
    .line 295
    move-object v10, v1

    .line 296
    :cond_7
    return-object v10

    .line 297
    :cond_8
    throw v0
.end method

.method public p(Ljava/util/List;Ls51;)Ljava/io/Serializable;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lp91;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lyr2;

    .line 8
    .line 9
    const-string v3, "checkDnsDomains for RESOLVE END time:"

    .line 10
    .line 11
    const-string v4, "sortMap:"

    .line 12
    .line 13
    const-string v5, "mapResult:"

    .line 14
    .line 15
    const-string v6, "END successCount:"

    .line 16
    .line 17
    instance-of v7, v1, Luq1;

    .line 18
    .line 19
    if-eqz v7, :cond_0

    .line 20
    .line 21
    move-object v7, v1

    .line 22
    check-cast v7, Luq1;

    .line 23
    .line 24
    iget v8, v7, Luq1;->i0:I

    .line 25
    .line 26
    const/high16 v9, -0x80000000

    .line 27
    .line 28
    and-int v10, v8, v9

    .line 29
    .line 30
    if-eqz v10, :cond_0

    .line 31
    .line 32
    sub-int/2addr v8, v9

    .line 33
    iput v8, v7, Luq1;->i0:I

    .line 34
    .line 35
    :goto_0
    move-object v13, v7

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v7, Luq1;

    .line 38
    .line 39
    invoke-direct {v7, v0, v1}, Luq1;-><init>(Lp91;Ls51;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    iget-object v1, v13, Luq1;->g0:Ljava/lang/Object;

    .line 44
    .line 45
    iget v7, v13, Luq1;->i0:I

    .line 46
    .line 47
    const/4 v14, 0x4

    .line 48
    const/4 v8, 0x1

    .line 49
    const/4 v15, 0x0

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    if-ne v7, v8, :cond_1

    .line 53
    .line 54
    iget-wide v7, v13, Luq1;->f0:J

    .line 55
    .line 56
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v15

    .line 69
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    const-string v1, "checkDnsDomains for RESOLVE START"

    .line 77
    .line 78
    sget-object v7, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 79
    .line 80
    invoke-static {v2, v1, v7, v14}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Loy1;->t0:Loy1;

    .line 84
    .line 85
    iget-object v7, v0, Lp91;->i:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v7, Ljava/lang/String;

    .line 88
    .line 89
    new-instance v12, Lpq1;

    .line 90
    .line 91
    invoke-direct {v12, v0, v8}, Lpq1;-><init>(Lp91;B)V

    .line 92
    .line 93
    .line 94
    iput-wide v9, v13, Luq1;->f0:J

    .line 95
    .line 96
    iput v8, v13, Luq1;->i0:I

    .line 97
    .line 98
    const/16 v11, 0x1f4

    .line 99
    .line 100
    move-object v8, v1

    .line 101
    move-wide v0, v9

    .line 102
    move-object/from16 v9, p1

    .line 103
    .line 104
    move-object v10, v7

    .line 105
    invoke-virtual/range {v8 .. v13}, Loy1;->F(Ljava/util/List;Ljava/lang/String;ILpq1;Ls51;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    sget-object v8, Lc71;->X:Lc71;

    .line 110
    .line 111
    if-ne v7, v8, :cond_3

    .line 112
    .line 113
    return-object v8

    .line 114
    :cond_3
    move-wide/from16 v16, v0

    .line 115
    .line 116
    move-object v1, v7

    .line 117
    move-wide/from16 v7, v16

    .line 118
    .line 119
    :goto_2
    :try_start_2
    check-cast v1, Ljava/util/Map;

    .line 120
    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    new-instance v9, Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-direct {v9, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    move-object v9, v15

    .line 134
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v6, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 147
    .line 148
    invoke-static {v2, v0, v6, v14}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const/4 v5, 0x6

    .line 164
    invoke-static {v2, v0, v15, v5}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 165
    .line 166
    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    check-cast v0, Ljava/lang/Iterable;

    .line 176
    .line 177
    new-instance v1, Ll71;

    .line 178
    .line 179
    const/16 v5, 0x12

    .line 180
    .line 181
    invoke-direct {v1, v5}, Ll71;-><init>(B)V

    .line 182
    .line 183
    .line 184
    invoke-static {v0, v1}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v2, v1, v6, v14}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    sub-long/2addr v4, v7

    .line 208
    new-instance v1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v2, v1, v6, v14}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 221
    .line 222
    .line 223
    new-instance v1, Ljava/util/ArrayList;

    .line 224
    .line 225
    const/16 v2, 0xa

    .line 226
    .line 227
    invoke-static {v0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eqz v2, :cond_6

    .line 243
    .line 244
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    check-cast v2, Ljava/util/Map$Entry;

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_5
    move-object v1, v15

    .line 261
    goto :goto_6

    .line 262
    :goto_5
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 263
    .line 264
    if-nez v1, :cond_8

    .line 265
    .line 266
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 267
    .line 268
    if-nez v1, :cond_8

    .line 269
    .line 270
    new-instance v1, Lrj6;

    .line 271
    .line 272
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    :cond_6
    :goto_6
    instance-of v0, v1, Lrj6;

    .line 276
    .line 277
    if-eqz v0, :cond_7

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_7
    move-object v15, v1

    .line 281
    :goto_7
    return-object v15

    .line 282
    :cond_8
    throw v0
.end method

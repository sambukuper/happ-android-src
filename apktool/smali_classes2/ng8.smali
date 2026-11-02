.class public final synthetic Lng8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Lng8;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/work/Worker;)V
    .locals 0

    .line 1
    const/16 p1, 0x13

    .line 2
    .line 3
    iput-byte p1, p0, Lng8;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, Lng8;->X:B

    .line 2
    .line 3
    const-string v0, "MAIN"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    sget p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->k0:I

    .line 20
    .line 21
    new-instance p0, Lsu/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver;

    .line 22
    .line 23
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    sget p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->k0:I

    .line 28
    .line 29
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 30
    .line 31
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_2
    sget p0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->k0:I

    .line 41
    .line 42
    sget-object p0, Lkw4;->a:Lkw4;

    .line 43
    .line 44
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_3
    const-string p0, "{\"version\":\"1.1\",\"method\":\"GET\",\"headers\":{\"User-Agent\":[\"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36\",\"Mozilla/5.0 (iPhone; CPU iPhone OS 10_0_2 like Mac OS X) AppleWebKit/601.1 (KHTML, like Gecko) CriOS/53.0.2785.109 Mobile/14A456 Safari/601.1.46\"],\"Accept-Encoding\":[\"gzip, deflate\"],\"Connection\":[\"keep-alive\"],\"Pragma\":\"no-cache\"}}"

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_4
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 53
    .line 54
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_5
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 64
    .line 65
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_6
    sget-object p0, Lkw4;->a:Lkw4;

    .line 75
    .line 76
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_7
    const-string p0, "SERVER_RAW"

    .line 82
    .line 83
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_8
    sget-object p0, Lkw4;->a:Lkw4;

    .line 93
    .line 94
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string v0, "Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`"

    .line 102
    .line 103
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p0

    .line 107
    :pswitch_a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 108
    .line 109
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :pswitch_b
    sget p0, Lsu/happ/proxyutility/feature/vpn_settings/VpnSettingsActivity;->U0:I

    .line 119
    .line 120
    sget-object p0, Lkw4;->a:Lkw4;

    .line 121
    .line 122
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :pswitch_c
    sget-object p0, Ldn8;->a:Ldn8;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_d
    sget-object p0, Ls92;->SYSTEM:Ls92;

    .line 131
    .line 132
    sget-object v0, Ls92;->SYSTEM_TEMPORARY_DIRECTORY:Loi5;

    .line 133
    .line 134
    const-string v1, "coil3_disk_cache"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Loi5;->f(Ljava/lang/String;)Loi5;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-wide/32 v3, 0xa00000

    .line 141
    .line 142
    .line 143
    :try_start_0
    invoke-virtual {v0}, Loi5;->toFile()Ljava/io/File;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    new-instance v2, Landroid/os/StatFs;

    .line 155
    .line 156
    invoke-direct {v2, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 164
    .line 165
    .line 166
    move-result-wide v1

    .line 167
    mul-long/2addr v1, v5

    .line 168
    long-to-double v1, v1

    .line 169
    const-wide v5, 0x3f947ae147ae147bL    # 0.02

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    mul-double/2addr v5, v1

    .line 175
    double-to-long v1, v5

    .line 176
    const-wide/32 v5, 0xfa00000

    .line 177
    .line 178
    .line 179
    invoke-static/range {v1 .. v6}, Lx97;->p(JJJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :catch_0
    new-instance v1, Lr76;

    .line 184
    .line 185
    invoke-direct {v1, p0, v0, v3, v4}, Lr76;-><init>(Ls92;Loi5;J)V

    .line 186
    .line 187
    .line 188
    return-object v1

    .line 189
    :pswitch_e
    sget-object p0, Lyb6;->a:Lzb6;

    .line 190
    .line 191
    const-class v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 192
    .line 193
    invoke-virtual {p0, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const-class v3, Ljava/net/SocketTimeoutException;

    .line 198
    .line 199
    invoke-virtual {p0, v3}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    const-class v4, Ljava/net/ConnectException;

    .line 204
    .line 205
    invoke-virtual {p0, v4}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    const-class v5, Ljava/io/InterruptedIOException;

    .line 210
    .line 211
    invoke-virtual {p0, v5}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    const-class v6, Ljava/io/IOException;

    .line 216
    .line 217
    invoke-virtual {p0, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    const/4 v6, 0x5

    .line 222
    new-array v6, v6, [Lzu3;

    .line 223
    .line 224
    aput-object v0, v6, v2

    .line 225
    .line 226
    aput-object v3, v6, v1

    .line 227
    .line 228
    const/4 v0, 0x2

    .line 229
    aput-object v4, v6, v0

    .line 230
    .line 231
    const/4 v0, 0x3

    .line 232
    aput-object v5, v6, v0

    .line 233
    .line 234
    const/4 v0, 0x4

    .line 235
    aput-object p0, v6, v0

    .line 236
    .line 237
    return-object v6

    .line 238
    :pswitch_f
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 239
    .line 240
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_10
    sget-object p0, Lkw4;->a:Lkw4;

    .line 250
    .line 251
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    return-object p0

    .line 256
    :pswitch_11
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-static {v0, p0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :pswitch_12
    new-instance p0, Lj$/time/format/DateTimeFormatterBuilder;

    .line 266
    .line 267
    invoke-direct {p0}, Lj$/time/format/DateTimeFormatterBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Lj$/time/format/DateTimeFormatterBuilder;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    const-string v0, "+HHMM"

    .line 275
    .line 276
    const-string v1, "+0000"

    .line 277
    .line 278
    invoke-virtual {p0, v0, v1}, Lj$/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Lj$/time/format/DateTimeFormatterBuilder;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->toFormatter()Lj$/time/format/DateTimeFormatter;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    return-object p0

    .line 287
    :pswitch_13
    new-instance p0, Lj$/time/format/DateTimeFormatterBuilder;

    .line 288
    .line 289
    invoke-direct {p0}, Lj$/time/format/DateTimeFormatterBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Lj$/time/format/DateTimeFormatterBuilder;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    const-string v0, "+HHmmss"

    .line 297
    .line 298
    const-string v1, "Z"

    .line 299
    .line 300
    invoke-virtual {p0, v0, v1}, Lj$/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Lj$/time/format/DateTimeFormatterBuilder;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->toFormatter()Lj$/time/format/DateTimeFormatter;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    return-object p0

    .line 309
    :pswitch_14
    new-instance p0, Lj$/time/format/DateTimeFormatterBuilder;

    .line 310
    .line 311
    invoke-direct {p0}, Lj$/time/format/DateTimeFormatterBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Lj$/time/format/DateTimeFormatterBuilder;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->appendOffsetId()Lj$/time/format/DateTimeFormatterBuilder;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-virtual {p0}, Lj$/time/format/DateTimeFormatterBuilder;->toFormatter()Lj$/time/format/DateTimeFormatter;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    return-object p0

    .line 327
    :pswitch_15
    new-instance p0, Lps;

    .line 328
    .line 329
    invoke-direct {p0, v2}, Lps;-><init>(B)V

    .line 330
    .line 331
    .line 332
    new-instance v0, Li97;

    .line 333
    .line 334
    new-instance v1, Lc30;

    .line 335
    .line 336
    new-instance v2, Lfs8;

    .line 337
    .line 338
    sget-object v3, Ldg5;->Y:Ldg5;

    .line 339
    .line 340
    invoke-direct {v2, v3}, Lfs8;-><init>(Ldg5;)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v1, v2}, Lc30;-><init>(Lz82;)V

    .line 344
    .line 345
    .line 346
    invoke-direct {v0, v1}, Li97;-><init>(Lc30;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0, v0}, Lps;->a(Lqj2;)V

    .line 350
    .line 351
    .line 352
    new-instance v0, Lc30;

    .line 353
    .line 354
    new-instance v1, Lcs8;

    .line 355
    .line 356
    invoke-direct {v1, v3}, Lcs8;-><init>(Ldg5;)V

    .line 357
    .line 358
    .line 359
    invoke-direct {v0, v1}, Lc30;-><init>(Lz82;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0, v0}, Lps;->a(Lqj2;)V

    .line 363
    .line 364
    .line 365
    new-instance v0, Lxr8;

    .line 366
    .line 367
    new-instance v1, Lsc0;

    .line 368
    .line 369
    iget-object p0, p0, Lps;->b:Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v1, p0}, Lsc0;-><init>(Ljava/util/ArrayList;)V

    .line 372
    .line 373
    .line 374
    invoke-direct {v0, v1}, Lxr8;-><init>(Lsc0;)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_16
    new-instance p0, Lwr8;

    .line 379
    .line 380
    new-instance v0, Lps;

    .line 381
    .line 382
    invoke-direct {v0, v2}, Lps;-><init>(B)V

    .line 383
    .line 384
    .line 385
    invoke-direct {p0, v0}, Lwr8;-><init>(Lps;)V

    .line 386
    .line 387
    .line 388
    new-instance v0, Lb58;

    .line 389
    .line 390
    const/16 v3, 0x11

    .line 391
    .line 392
    invoke-direct {v0, v3}, Lb58;-><init>(B)V

    .line 393
    .line 394
    .line 395
    new-array v1, v1, [Lgn2;

    .line 396
    .line 397
    aput-object v0, v1, v2

    .line 398
    .line 399
    new-instance v0, Lb58;

    .line 400
    .line 401
    const/16 v2, 0x12

    .line 402
    .line 403
    invoke-direct {v0, v2}, Lb58;-><init>(B)V

    .line 404
    .line 405
    .line 406
    invoke-static {p0, v1, v0}, Lz68;->i(Lcc1;[Lgn2;Lgn2;)V

    .line 407
    .line 408
    .line 409
    new-instance v0, Lxr8;

    .line 410
    .line 411
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-direct {v0, p0}, Lxr8;-><init>(Lsc0;)V

    .line 416
    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_17
    new-instance p0, Lwr8;

    .line 420
    .line 421
    new-instance v0, Lps;

    .line 422
    .line 423
    invoke-direct {v0, v2}, Lps;-><init>(B)V

    .line 424
    .line 425
    .line 426
    invoke-direct {p0, v0}, Lwr8;-><init>(Lps;)V

    .line 427
    .line 428
    .line 429
    new-instance v0, Lb58;

    .line 430
    .line 431
    const/16 v3, 0xf

    .line 432
    .line 433
    invoke-direct {v0, v3}, Lb58;-><init>(B)V

    .line 434
    .line 435
    .line 436
    new-array v1, v1, [Lgn2;

    .line 437
    .line 438
    aput-object v0, v1, v2

    .line 439
    .line 440
    new-instance v0, Lb58;

    .line 441
    .line 442
    const/16 v2, 0x10

    .line 443
    .line 444
    invoke-direct {v0, v2}, Lb58;-><init>(B)V

    .line 445
    .line 446
    .line 447
    invoke-static {p0, v1, v0}, Lz68;->i(Lcc1;[Lgn2;Lgn2;)V

    .line 448
    .line 449
    .line 450
    new-instance v0, Lxr8;

    .line 451
    .line 452
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    invoke-direct {v0, p0}, Lxr8;-><init>(Lsc0;)V

    .line 457
    .line 458
    .line 459
    return-object v0

    .line 460
    :pswitch_18
    new-instance p0, Lot;

    .line 461
    .line 462
    sget-object v0, Lyl7;->a:Lyl7;

    .line 463
    .line 464
    invoke-direct {p0, v0}, Lot;-><init>(Low3;)V

    .line 465
    .line 466
    .line 467
    return-object p0

    .line 468
    :pswitch_19
    sget-object p0, Lkw4;->a:Lkw4;

    .line 469
    .line 470
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    return-object p0

    .line 475
    :pswitch_1a
    sget p0, Lsu/happ/proxyutility/feature/ui_settings/UISettingsActivity;->T0:I

    .line 476
    .line 477
    sget-object p0, Lkw4;->a:Lkw4;

    .line 478
    .line 479
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    return-object p0

    .line 484
    :pswitch_1b
    new-instance p0, Lwj8;

    .line 485
    .line 486
    invoke-direct {p0}, Lwj8;-><init>()V

    .line 487
    .line 488
    .line 489
    return-object p0

    .line 490
    :pswitch_1c
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 491
    .line 492
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 497
    .line 498
    .line 499
    move-result-object p0

    .line 500
    return-object p0

    .line 501
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

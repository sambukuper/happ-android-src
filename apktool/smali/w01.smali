.class public final synthetic Lw01;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lw01;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p0, p0, Lw01;->X:B

    .line 2
    .line 3
    const-class v0, Llc1;

    .line 4
    .line 5
    const-class v1, Ljc1;

    .line 6
    .line 7
    sget-object v2, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-string p0, "Mozilla/5.0 (Linux; Android 16; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.7680.177 Mobile Safari/537.36"

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    new-instance p0, Lokhttp3/OkHttpClient$Builder;

    .line 21
    .line 22
    invoke-direct {p0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-wide/16 v0, 0x14

    .line 26
    .line 27
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v0, Lsr8;

    .line 46
    .line 47
    new-instance v1, Lw01;

    .line 48
    .line 49
    const/16 v2, 0x1d

    .line 50
    .line 51
    invoke-direct {v1, v2}, Lw01;-><init>(B)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1}, Lsr8;-><init>(Ldn2;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v0, Lg72;

    .line 62
    .line 63
    invoke-direct {v0}, Lg72;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_1
    sget-object p0, Lyb6;->a:Lzb6;

    .line 72
    .line 73
    const-class v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-class v1, Ljava/net/SocketTimeoutException;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-class v2, Ljava/net/ConnectException;

    .line 86
    .line 87
    invoke-virtual {p0, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-class v7, Ljava/io/InterruptedIOException;

    .line 92
    .line 93
    invoke-virtual {p0, v7}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    const-class v8, Ljava/io/IOException;

    .line 98
    .line 99
    invoke-virtual {p0, v8}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const/4 v8, 0x5

    .line 104
    new-array v8, v8, [Lzu3;

    .line 105
    .line 106
    aput-object v0, v8, v6

    .line 107
    .line 108
    aput-object v1, v8, v5

    .line 109
    .line 110
    aput-object v2, v8, v4

    .line 111
    .line 112
    aput-object v7, v8, v3

    .line 113
    .line 114
    const/4 v0, 0x4

    .line 115
    aput-object p0, v8, v0

    .line 116
    .line 117
    return-object v8

    .line 118
    :pswitch_2
    new-instance p0, Ljava/net/CookieManager;

    .line 119
    .line 120
    invoke-direct {p0}, Ljava/net/CookieManager;-><init>()V

    .line 121
    .line 122
    .line 123
    sget-object v0, Ljava/net/CookiePolicy;->ACCEPT_ALL:Ljava/net/CookiePolicy;

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/net/CookieManager;->setCookiePolicy(Ljava/net/CookiePolicy;)V

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_3
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 130
    .line 131
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->s0:Lvz7;

    .line 136
    .line 137
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, Lu42;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_4
    sget-object p0, Lkw4;->a:Lkw4;

    .line 145
    .line 146
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_5
    new-instance p0, Landroid/os/Handler;

    .line 152
    .line 153
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_6
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_7
    sget-object p0, Lkw4;->a:Lkw4;

    .line 165
    .line 166
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_8
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 172
    .line 173
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :pswitch_9
    sget-object p0, Lkw4;->a:Lkw4;

    .line 183
    .line 184
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :pswitch_a
    sget-object p0, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->Companion:Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo$Companion;

    .line 190
    .line 191
    invoke-static {}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->values()[Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v0, Lu22;

    .line 199
    .line 200
    const-string v1, "su.happ.proxyutility.domain.routing.entity.StateDownloadFile"

    .line 201
    .line 202
    invoke-direct {v0, v1, p0}, Lu22;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 203
    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_b
    sget-object p0, Lkw4;->a:Lkw4;

    .line 207
    .line 208
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_c
    return-object v2

    .line 214
    :pswitch_d
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 215
    .line 216
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_e
    const/high16 p0, 0x3f800000    # 1.0f

    .line 226
    .line 227
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :pswitch_f
    new-array p0, v6, [Le37;

    .line 233
    .line 234
    const-string v1, "kotlinx.datetime.DayBased"

    .line 235
    .line 236
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-nez v0, :cond_0

    .line 241
    .line 242
    new-instance v5, Ldt0;

    .line 243
    .line 244
    invoke-direct {v5, v1}, Ldt0;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    sget-object v0, Lnf3;->a:Lnf3;

    .line 248
    .line 249
    sget-object v0, Lnf3;->b:Lbu5;

    .line 250
    .line 251
    const-string v2, "days"

    .line 252
    .line 253
    invoke-virtual {v5, v2, v0}, Ldt0;->a(Ljava/lang/String;Le37;)V

    .line 254
    .line 255
    .line 256
    new-instance v0, Lg37;

    .line 257
    .line 258
    sget-object v2, Lpm7;->M:Lpm7;

    .line 259
    .line 260
    iget-object v3, v5, Ldt0;->b:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    invoke-static {p0}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-direct/range {v0 .. v5}, Lg37;-><init>(Ljava/lang/String;Lnr4;ILjava/util/List;Ldt0;)V

    .line 271
    .line 272
    .line 273
    move-object v7, v0

    .line 274
    goto :goto_0

    .line 275
    :cond_0
    const-string p0, "Blank serial names are prohibited"

    .line 276
    .line 277
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_0
    return-object v7

    .line 281
    :pswitch_10
    new-instance p0, Luy6;

    .line 282
    .line 283
    sget-object v2, Lyb6;->a:Lzb6;

    .line 284
    .line 285
    const-class v7, Loc1;

    .line 286
    .line 287
    invoke-virtual {v2, v7}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v2, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const-class v8, Lnc1;

    .line 300
    .line 301
    invoke-virtual {v2, v8}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    new-array v8, v3, [Lzu3;

    .line 306
    .line 307
    aput-object v1, v8, v6

    .line 308
    .line 309
    aput-object v0, v8, v5

    .line 310
    .line 311
    aput-object v2, v8, v4

    .line 312
    .line 313
    new-array v0, v3, [Low3;

    .line 314
    .line 315
    sget-object v1, Lsc1;->a:Lsc1;

    .line 316
    .line 317
    aput-object v1, v0, v6

    .line 318
    .line 319
    sget-object v1, Lcy4;->a:Lcy4;

    .line 320
    .line 321
    aput-object v1, v0, v5

    .line 322
    .line 323
    sget-object v1, Lba8;->a:Lba8;

    .line 324
    .line 325
    aput-object v1, v0, v4

    .line 326
    .line 327
    const-string v1, "kotlinx.datetime.DateTimeUnit"

    .line 328
    .line 329
    invoke-direct {p0, v1, v7, v8, v0}, Luy6;-><init>(Ljava/lang/String;Lzu3;[Lzu3;[Low3;)V

    .line 330
    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_11
    new-instance p0, Luy6;

    .line 334
    .line 335
    sget-object v2, Lyb6;->a:Lzb6;

    .line 336
    .line 337
    const-class v3, Lhc1;

    .line 338
    .line 339
    invoke-virtual {v2, v3}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v2, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    new-array v2, v4, [Lzu3;

    .line 352
    .line 353
    aput-object v1, v2, v6

    .line 354
    .line 355
    aput-object v0, v2, v5

    .line 356
    .line 357
    new-array v0, v4, [Low3;

    .line 358
    .line 359
    sget-object v1, Lsc1;->a:Lsc1;

    .line 360
    .line 361
    aput-object v1, v0, v6

    .line 362
    .line 363
    sget-object v1, Lcy4;->a:Lcy4;

    .line 364
    .line 365
    aput-object v1, v0, v5

    .line 366
    .line 367
    const-string v1, "kotlinx.datetime.DateTimeUnit.DateBased"

    .line 368
    .line 369
    invoke-direct {p0, v1, v3, v2, v0}, Luy6;-><init>(Ljava/lang/String;Lzu3;[Lzu3;[Low3;)V

    .line 370
    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_12
    const-string p0, "Unexpected call to default provider"

    .line 374
    .line 375
    invoke-static {p0}, Ld01;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 376
    .line 377
    .line 378
    new-instance p0, Lo14;

    .line 379
    .line 380
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 381
    .line 382
    .line 383
    throw p0

    .line 384
    :pswitch_13
    const-string p0, "LocalUriHandler"

    .line 385
    .line 386
    invoke-static {p0}, Ly01;->b(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v7

    .line 390
    :pswitch_14
    const-string p0, "LocalTextToolbar"

    .line 391
    .line 392
    invoke-static {p0}, Ly01;->b(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v7

    .line 396
    :pswitch_15
    return-object v7

    .line 397
    :pswitch_16
    const-string p0, "LocalProvidableLocaleList"

    .line 398
    .line 399
    invoke-static {p0}, Ly01;->b(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v7

    .line 403
    :pswitch_17
    const-string p0, "LocalLayoutDirection"

    .line 404
    .line 405
    invoke-static {p0}, Ly01;->b(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v7

    .line 409
    :pswitch_18
    const-string p0, "LocalInputManager"

    .line 410
    .line 411
    invoke-static {p0}, Ly01;->b(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v7

    .line 415
    :pswitch_19
    const-string p0, "LocalHapticFeedback"

    .line 416
    .line 417
    invoke-static {p0}, Ly01;->b(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw v7

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
        :pswitch_c
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

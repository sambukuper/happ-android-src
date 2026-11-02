.class public final synthetic Lei3;
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
    iput-byte p1, p0, Lei3;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lfi3;B)V
    .locals 0

    .line 7
    iput-byte p2, p0, Lei3;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p0, p0, Lei3;->X:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string p0, "SETTING"

    .line 13
    .line 14
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance p0, Lyd4;

    .line 24
    .line 25
    new-instance v0, Lps;

    .line 26
    .line 27
    invoke-direct {v0, v4}, Lps;-><init>(B)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v0}, Lyd4;-><init>(Lps;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Ldg5;->Y:Ldg5;

    .line 34
    .line 35
    invoke-interface {p0, v0}, Lac1;->b(Ldg5;)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x3a

    .line 39
    .line 40
    invoke-static {p0, v1}, Lz68;->t(Lcc1;C)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v0}, Lac1;->f(Ldg5;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Luh3;

    .line 47
    .line 48
    const/16 v1, 0xb

    .line 49
    .line 50
    invoke-direct {v0, v1}, Luh3;-><init>(B)V

    .line 51
    .line 52
    .line 53
    new-array v1, v3, [Lgn2;

    .line 54
    .line 55
    aput-object v0, v1, v4

    .line 56
    .line 57
    new-instance v0, Luh3;

    .line 58
    .line 59
    const/16 v2, 0xc

    .line 60
    .line 61
    invoke-direct {v0, v2}, Luh3;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v1, v0}, Lz68;->i(Lcc1;[Lgn2;Lgn2;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lzd4;

    .line 68
    .line 69
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-direct {v0, p0}, Lzd4;-><init>(Lsc0;)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 80
    .line 81
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :pswitch_2
    sget-object p0, Lud4;->a:Lox1;

    .line 86
    .line 87
    sget-object p0, Lpz2;->S0:Lpz2;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_3
    return-object v1

    .line 91
    :pswitch_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v0, "CompositionLocal LocalLifecycleOwner not present"

    .line 94
    .line 95
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :pswitch_5
    new-instance p0, Lmd4;

    .line 100
    .line 101
    new-instance v0, Lps;

    .line 102
    .line 103
    invoke-direct {v0, v4}, Lps;-><init>(B)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v0}, Lmd4;-><init>(Lps;)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lgd4;->a:Lvz7;

    .line 110
    .line 111
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lg1;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast v0, Lfd4;

    .line 121
    .line 122
    iget-object v0, v0, Lfd4;->a:Lsc0;

    .line 123
    .line 124
    invoke-interface {p0, v0}, Ln3;->l(Lqj2;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Luh3;

    .line 128
    .line 129
    const/16 v1, 0x9

    .line 130
    .line 131
    invoke-direct {v0, v1}, Luh3;-><init>(B)V

    .line 132
    .line 133
    .line 134
    new-array v1, v3, [Lgn2;

    .line 135
    .line 136
    aput-object v0, v1, v4

    .line 137
    .line 138
    new-instance v0, Luh3;

    .line 139
    .line 140
    const/16 v2, 0xa

    .line 141
    .line 142
    invoke-direct {v0, v2}, Luh3;-><init>(B)V

    .line 143
    .line 144
    .line 145
    invoke-static {p0, v1, v0}, Lz68;->i(Lcc1;[Lgn2;Lgn2;)V

    .line 146
    .line 147
    .line 148
    sget-object v0, Lae4;->a:Lvz7;

    .line 149
    .line 150
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lzd4;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v0, v0, Lzd4;->a:Lsc0;

    .line 160
    .line 161
    invoke-interface {p0, v0}, Lo3;->k(Lqj2;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lnd4;

    .line 165
    .line 166
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-direct {v0, p0}, Lnd4;-><init>(Lsc0;)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_6
    new-instance p0, Led4;

    .line 175
    .line 176
    new-instance v0, Lps;

    .line 177
    .line 178
    invoke-direct {v0, v4}, Lps;-><init>(B)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, v0}, Led4;-><init>(Lps;)V

    .line 182
    .line 183
    .line 184
    invoke-static {p0}, Lbc1;->j(Lbc1;)V

    .line 185
    .line 186
    .line 187
    invoke-static {p0}, Lbc1;->m(Lbc1;)V

    .line 188
    .line 189
    .line 190
    invoke-static {p0}, Lzb1;->n(Lzb1;)V

    .line 191
    .line 192
    .line 193
    new-instance v0, Lfd4;

    .line 194
    .line 195
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-direct {v0, p0}, Lfd4;-><init>(Lsc0;)V

    .line 200
    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_7
    new-instance p0, Led4;

    .line 204
    .line 205
    new-instance v0, Lps;

    .line 206
    .line 207
    invoke-direct {v0, v4}, Lps;-><init>(B)V

    .line 208
    .line 209
    .line 210
    invoke-direct {p0, v0}, Led4;-><init>(Lps;)V

    .line 211
    .line 212
    .line 213
    invoke-static {p0}, Lbc1;->j(Lbc1;)V

    .line 214
    .line 215
    .line 216
    const/16 v0, 0x2d

    .line 217
    .line 218
    invoke-static {p0, v0}, Lz68;->t(Lcc1;C)V

    .line 219
    .line 220
    .line 221
    invoke-static {p0}, Lbc1;->m(Lbc1;)V

    .line 222
    .line 223
    .line 224
    invoke-static {p0, v0}, Lz68;->t(Lcc1;C)V

    .line 225
    .line 226
    .line 227
    invoke-static {p0}, Lzb1;->n(Lzb1;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Lfd4;

    .line 231
    .line 232
    invoke-interface {p0}, Lh1;->build()Lsc0;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-direct {v0, p0}, Lfd4;-><init>(Lsc0;)V

    .line 237
    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_8
    sget-object p0, Lev;->a:Lev;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_9
    sget-object p0, Lxu;->a:Lxu;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_a
    new-instance p0, Lak7;

    .line 247
    .line 248
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 249
    .line 250
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-direct {p0, v0}, Lak7;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 266
    .line 267
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0

    .line 276
    :pswitch_c
    sget-object p0, Lyb6;->a:Lzb6;

    .line 277
    .line 278
    const-class v1, Ljavax/net/ssl/SSLHandshakeException;

    .line 279
    .line 280
    invoke-virtual {p0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    const-class v2, Ljava/net/SocketTimeoutException;

    .line 285
    .line 286
    invoke-virtual {p0, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const-class v5, Ljava/net/ConnectException;

    .line 291
    .line 292
    invoke-virtual {p0, v5}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    const-class v6, Ljava/io/InterruptedIOException;

    .line 297
    .line 298
    invoke-virtual {p0, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    const-class v7, Ljava/io/IOException;

    .line 303
    .line 304
    invoke-virtual {p0, v7}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    const/4 v7, 0x5

    .line 309
    new-array v7, v7, [Lzu3;

    .line 310
    .line 311
    aput-object v1, v7, v4

    .line 312
    .line 313
    aput-object v2, v7, v3

    .line 314
    .line 315
    const/4 v1, 0x2

    .line 316
    aput-object v5, v7, v1

    .line 317
    .line 318
    aput-object v6, v7, v0

    .line 319
    .line 320
    const/4 v0, 0x4

    .line 321
    aput-object p0, v7, v0

    .line 322
    .line 323
    return-object v7

    .line 324
    :pswitch_d
    new-instance p0, Ljava/net/CookieManager;

    .line 325
    .line 326
    invoke-direct {p0}, Ljava/net/CookieManager;-><init>()V

    .line 327
    .line 328
    .line 329
    sget-object v0, Ljava/net/CookiePolicy;->ACCEPT_ALL:Ljava/net/CookiePolicy;

    .line 330
    .line 331
    invoke-virtual {p0, v0}, Ljava/net/CookieManager;->setCookiePolicy(Ljava/net/CookiePolicy;)V

    .line 332
    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_e
    new-instance p0, Lj74;

    .line 336
    .line 337
    invoke-direct {p0, v4, v4}, Lj74;-><init>(II)V

    .line 338
    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_f
    new-instance p0, Landroidx/compose/ui/node/LayoutNode;

    .line 342
    .line 343
    invoke-direct {p0, v0}, Landroidx/compose/ui/node/LayoutNode;-><init>(I)V

    .line 344
    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_10
    new-instance p0, Lgv6;

    .line 348
    .line 349
    invoke-direct {p0}, Lgv6;-><init>()V

    .line 350
    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_11
    new-instance p0, Lvc4;

    .line 354
    .line 355
    invoke-direct {p0}, Lvc4;-><init>()V

    .line 356
    .line 357
    .line 358
    return-object p0

    .line 359
    :pswitch_12
    return-object v2

    .line 360
    :pswitch_13
    sget p0, Lsu/happ/proxyutility/feature/language/LanguageActivitySettings;->V0:I

    .line 361
    .line 362
    sget-object p0, Lkw4;->a:Lkw4;

    .line 363
    .line 364
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    return-object p0

    .line 369
    :pswitch_14
    sget-object p0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 370
    .line 371
    const-string v0, "google"

    .line 372
    .line 373
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result p0

    .line 377
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    return-object p0

    .line 382
    :pswitch_15
    sget-object p0, Lgn3;->b:Lfn3;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_16
    sget-object p0, Ldq3;->b:Lcq3;

    .line 386
    .line 387
    return-object p0

    .line 388
    :pswitch_17
    sget-object p0, Llp3;->b:Lbu5;

    .line 389
    .line 390
    return-object p0

    .line 391
    :pswitch_18
    sget-object p0, Lyp3;->b:Lg37;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_19
    sget-object p0, Lkq3;->b:Lg37;

    .line 395
    .line 396
    return-object p0

    .line 397
    :pswitch_1a
    return-object v2

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

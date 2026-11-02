.class public final synthetic Lr47;
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
    iput-byte p1, p0, Lr47;->X:B

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
    .locals 7

    .line 1
    iget-byte p0, p0, Lr47;->X:B

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 8
    .line 9
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 19
    .line 20
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    new-instance p0, Lr45;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_2
    new-instance p0, Ll45;

    .line 36
    .line 37
    invoke-direct {p0}, Ll45;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_3
    sget-object p0, Lkw4;->a:Lkw4;

    .line 42
    .line 43
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_4
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->c()Lqc2;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_5
    new-instance p0, Lfk7;

    .line 60
    .line 61
    invoke-direct {p0}, Lfk7;-><init>()V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_6
    new-instance p0, Lek7;

    .line 66
    .line 67
    invoke-direct {p0}, Lek7;-><init>()V

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_7
    new-instance p0, Lbk7;

    .line 72
    .line 73
    invoke-direct {p0}, Lbk7;-><init>()V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_8
    new-instance p0, Lak7;

    .line 78
    .line 79
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 80
    .line 81
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {p0, v0}, Lak7;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_9
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 90
    .line 91
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->r0:Lvz7;

    .line 96
    .line 97
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Lpv0;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 105
    .line 106
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_b
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 116
    .line 117
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->s0:Lvz7;

    .line 122
    .line 123
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Lu42;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_c
    sget-object p0, Lkw4;->a:Lkw4;

    .line 131
    .line 132
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :pswitch_d
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 138
    .line 139
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->h()Lzt7;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :pswitch_e
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 149
    .line 150
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_f
    sget-object p0, Lkw4;->a:Lkw4;

    .line 160
    .line 161
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :pswitch_10
    new-instance p0, Ljava/io/File;

    .line 167
    .line 168
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 169
    .line 170
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v1, "qr_codes"

    .line 179
    .line 180
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_11
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 185
    .line 186
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_12
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 196
    .line 197
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_13
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 207
    .line 208
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->c()Lqc2;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0

    .line 217
    :pswitch_14
    sget p0, Lsu/happ/proxyutility/feature/statistics/StatisticsSettingsActivity;->W0:I

    .line 218
    .line 219
    new-instance p0, Lyz4;

    .line 220
    .line 221
    invoke-direct {p0}, Lqc4;-><init>()V

    .line 222
    .line 223
    .line 224
    new-instance v0, Loi7;

    .line 225
    .line 226
    invoke-static {}, Lw51;->M()Ljava/util/LinkedHashMap;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {}, Lw51;->M()Ljava/util/LinkedHashMap;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    const-wide/16 v1, 0x0

    .line 235
    .line 236
    const-wide/16 v3, 0x0

    .line 237
    .line 238
    invoke-direct/range {v0 .. v6}, Loi7;-><init>(JJLjava/util/Map;Ljava/util/LinkedHashMap;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0}, Lqc4;->j(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_15
    sget-object p0, Ldn8;->a:Ldn8;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_16
    new-instance p0, Lp77;

    .line 249
    .line 250
    invoke-direct {p0}, Lp77;-><init>()V

    .line 251
    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_17
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 255
    .line 256
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->K0:Lvz7;

    .line 261
    .line 262
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, Lmq0;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_18
    sget-object p0, Lkw4;->a:Lkw4;

    .line 270
    .line 271
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0

    .line 276
    :pswitch_19
    :try_start_0
    new-instance p0, Lvr2;

    .line 277
    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    new-instance v1, Lhz7;

    .line 282
    .line 283
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 284
    .line 285
    .line 286
    const/4 v2, 0x2

    .line 287
    new-array v2, v2, [Lud1;

    .line 288
    .line 289
    const/4 v3, 0x0

    .line 290
    aput-object p0, v2, v3

    .line 291
    .line 292
    const/4 p0, 0x1

    .line 293
    aput-object v1, v2, p0

    .line 294
    .line 295
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v1, Lhu;

    .line 307
    .line 308
    invoke-direct {v1, p0, v0}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 309
    .line 310
    .line 311
    new-instance p0, Lt21;

    .line 312
    .line 313
    invoke-direct {p0, v1}, Lt21;-><init>(Lu27;)V

    .line 314
    .line 315
    .line 316
    invoke-static {p0}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-static {p0}, Lw51;->O(Ljava/util/List;)Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    return-object p0

    .line 325
    :catchall_0
    move-exception v0

    .line 326
    move-object p0, v0

    .line 327
    new-instance v0, Ljava/util/ServiceConfigurationError;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-direct {v0, v1, p0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :pswitch_1a
    :try_start_1
    new-instance p0, Lm95;

    .line 338
    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    .line 341
    .line 342
    filled-new-array {p0}, [Lm95;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 354
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v1, Lhu;

    .line 358
    .line 359
    invoke-direct {v1, p0, v0}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 360
    .line 361
    .line 362
    new-instance p0, Lt21;

    .line 363
    .line 364
    invoke-direct {p0, v1}, Lt21;-><init>(Lu27;)V

    .line 365
    .line 366
    .line 367
    invoke-static {p0}, Lw27;->n0(Lu27;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    invoke-static {p0}, Lw51;->O(Ljava/util/List;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    return-object p0

    .line 376
    :catchall_1
    move-exception v0

    .line 377
    move-object p0, v0

    .line 378
    new-instance v0, Ljava/util/ServiceConfigurationError;

    .line 379
    .line 380
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-direct {v0, v1, p0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    throw v0

    .line 388
    :pswitch_1b
    sget p0, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;->X0:I

    .line 389
    .line 390
    const-string p0, "SERVER_RAW"

    .line 391
    .line 392
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    return-object p0

    .line 401
    :pswitch_1c
    sget p0, Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;->X0:I

    .line 402
    .line 403
    const-string p0, "MAIN"

    .line 404
    .line 405
    invoke-static {}, Lvj8;->M()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {p0, v0}, Lcom/tencent/mmkv/MMKV;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    return-object p0

    .line 414
    nop

    .line 415
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

.class public final Ljv7;
.super Lnr4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic M:Luv7;


# direct methods
.method public constructor <init>(Luv7;)V
    .locals 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnr4;-><init>(B)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ljv7;->M:Luv7;

    .line 7
    .line 8
    return-void
.end method

.method public static final Y(Ltv7;Ltv7;Lgn2;)Z
    .locals 0

    .line 1
    invoke-interface {p2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {p2, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    xor-int/lit8 p0, p0, 0x1

    .line 18
    .line 19
    return p0
.end method


# virtual methods
.method public final y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ltv7;

    .line 2
    .line 3
    check-cast p2, Ltv7;

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    instance-of v1, p1, Lpv7;

    .line 11
    .line 12
    sget-object v2, Luv7;->Y:Luv7;

    .line 13
    .line 14
    const-string v3, "corners"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    iget-object p0, p0, Ljv7;->M:Luv7;

    .line 19
    .line 20
    if-eqz v1, :cond_8

    .line 21
    .line 22
    instance-of v1, p2, Lpv7;

    .line 23
    .line 24
    if-eqz v1, :cond_8

    .line 25
    .line 26
    check-cast p1, Lpv7;

    .line 27
    .line 28
    iget-object v1, p1, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 29
    .line 30
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerCache;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast p2, Lpv7;

    .line 39
    .line 40
    iget-object v7, p2, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 41
    .line 42
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->e()Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-nez v6, :cond_0

    .line 55
    .line 56
    const-string v6, "selection_change"

    .line 57
    .line 58
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerCache;->c()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->c()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-static {v6, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_1

    .line 82
    .line 83
    const-string v6, "name_change"

    .line 84
    .line 85
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    :cond_1
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerCache;->c()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;->a()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move-object v6, v4

    .line 104
    :goto_0
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->c()Lsu/happ/proxyutility/dto/ServerConfig;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    if-eqz v8, :cond_3

    .line 113
    .line 114
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;->a()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    goto :goto_1

    .line 119
    :cond_3
    move-object v8, v4

    .line 120
    :goto_1
    invoke-static {v6, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-nez v6, :cond_4

    .line 125
    .line 126
    const-string v6, "description_change"

    .line 127
    .line 128
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 129
    .line 130
    .line 131
    :cond_4
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerCache;->b()Lsu/happ/proxyutility/dto/ServerAffiliationInfo;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-object v6, p1, Lpv7;->e:Lvn5;

    .line 136
    .line 137
    new-instance v8, Lqg5;

    .line 138
    .line 139
    invoke-direct {v8, v1, v6}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/ServerCache;->b()Lsu/happ/proxyutility/dto/ServerAffiliationInfo;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v6, p2, Lpv7;->e:Lvn5;

    .line 147
    .line 148
    new-instance v7, Lqg5;

    .line 149
    .line 150
    invoke-direct {v7, v1, v6}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v7}, Lqg5;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_5

    .line 158
    .line 159
    const-string v1, "ping_change"

    .line 160
    .line 161
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    :cond_5
    iget-boolean v1, p1, Lpv7;->f:Z

    .line 165
    .line 166
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    iget-boolean v6, p2, Lpv7;->f:Z

    .line 171
    .line 172
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_6

    .line 181
    .line 182
    const-string v1, "checked_change"

    .line 183
    .line 184
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    :cond_6
    if-ne p0, v2, :cond_7

    .line 188
    .line 189
    iget-boolean p0, p1, Lpv7;->d:Z

    .line 190
    .line 191
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iget-boolean v1, p2, Lpv7;->d:Z

    .line 196
    .line 197
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-nez p0, :cond_7

    .line 206
    .line 207
    const-string p0, "hide_settings"

    .line 208
    .line 209
    invoke-virtual {v0, p0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 210
    .line 211
    .line 212
    :cond_7
    iget-boolean p0, p1, Lpv7;->c:Z

    .line 213
    .line 214
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    iget-boolean p1, p2, Lpv7;->c:Z

    .line 219
    .line 220
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-nez p0, :cond_1a

    .line 229
    .line 230
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :cond_8
    instance-of v1, p1, Lrv7;

    .line 236
    .line 237
    if-eqz v1, :cond_18

    .line 238
    .line 239
    instance-of v1, p2, Lrv7;

    .line 240
    .line 241
    if-eqz v1, :cond_18

    .line 242
    .line 243
    new-instance v1, Lzx6;

    .line 244
    .line 245
    const/16 v6, 0x16

    .line 246
    .line 247
    invoke-direct {v1, v6}, Lzx6;-><init>(B)V

    .line 248
    .line 249
    .line 250
    invoke-static {p1, p2, v1}, Ljv7;->Y(Ltv7;Ltv7;Lgn2;)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_9

    .line 255
    .line 256
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 257
    .line 258
    .line 259
    :cond_9
    move-object v1, p1

    .line 260
    check-cast v1, Lrv7;

    .line 261
    .line 262
    iget-object v3, v1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 263
    .line 264
    iget-boolean v6, v1, Lrv7;->d:Z

    .line 265
    .line 266
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    move-object v7, p2

    .line 275
    check-cast v7, Lrv7;

    .line 276
    .line 277
    iget-object v8, v7, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 278
    .line 279
    iget-boolean v9, v7, Lrv7;->d:Z

    .line 280
    .line 281
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    invoke-static {v6, v9}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    if-nez v6, :cond_a

    .line 294
    .line 295
    const-string v6, "collapse"

    .line 296
    .line 297
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 298
    .line 299
    .line 300
    :cond_a
    if-ne p0, v2, :cond_b

    .line 301
    .line 302
    new-instance v6, Lzx6;

    .line 303
    .line 304
    const/16 v9, 0x17

    .line 305
    .line 306
    invoke-direct {v6, v9}, Lzx6;-><init>(B)V

    .line 307
    .line 308
    .line 309
    invoke-static {p1, p2, v6}, Ljv7;->Y(Ltv7;Ltv7;Lgn2;)Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-eqz v6, :cond_b

    .line 314
    .line 315
    const-string v6, "action_menu"

    .line 316
    .line 317
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 318
    .line 319
    .line 320
    :cond_b
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    if-eqz v6, :cond_c

    .line 325
    .line 326
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    goto :goto_2

    .line 331
    :cond_c
    move-object v6, v4

    .line 332
    :goto_2
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    if-eqz v9, :cond_d

    .line 341
    .line 342
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    goto :goto_3

    .line 347
    :cond_d
    move-object v9, v4

    .line 348
    :goto_3
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    invoke-static {v6, v9}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-nez v6, :cond_e

    .line 357
    .line 358
    const-string v6, "title"

    .line 359
    .line 360
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 361
    .line 362
    .line 363
    :cond_e
    const-string v6, "description"

    .line 364
    .line 365
    if-ne p0, v2, :cond_f

    .line 366
    .line 367
    new-instance v9, Lzx6;

    .line 368
    .line 369
    const/16 v10, 0x13

    .line 370
    .line 371
    invoke-direct {v9, v10}, Lzx6;-><init>(B)V

    .line 372
    .line 373
    .line 374
    invoke-static {p1, p2, v9}, Ljv7;->Y(Ltv7;Ltv7;Lgn2;)Z

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-eqz v9, :cond_f

    .line 379
    .line 380
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 381
    .line 382
    .line 383
    :cond_f
    if-ne p0, v2, :cond_10

    .line 384
    .line 385
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v9

    .line 401
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->b()Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v9

    .line 421
    if-nez v9, :cond_10

    .line 422
    .line 423
    const-string v9, "ping"

    .line 424
    .line 425
    invoke-virtual {v0, v9, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 426
    .line 427
    .line 428
    :cond_10
    if-ne p0, v2, :cond_11

    .line 429
    .line 430
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->f()Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->f()Z

    .line 443
    .line 444
    .line 445
    move-result v10

    .line 446
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v10

    .line 454
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v9

    .line 458
    if-nez v9, :cond_11

    .line 459
    .line 460
    const-string v9, "pin"

    .line 461
    .line 462
    invoke-virtual {v0, v9, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 463
    .line 464
    .line 465
    :cond_11
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->e()Z

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->e()Z

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 482
    .line 483
    .line 484
    move-result-object v10

    .line 485
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-nez v9, :cond_12

    .line 494
    .line 495
    const-string v9, "expand"

    .line 496
    .line 497
    invoke-virtual {v0, v9, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 498
    .line 499
    .line 500
    :cond_12
    sget-object v9, Luv7;->X:Luv7;

    .line 501
    .line 502
    if-ne p0, v9, :cond_13

    .line 503
    .line 504
    iget-boolean v1, v1, Lrv7;->c:Z

    .line 505
    .line 506
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    iget-boolean v7, v7, Lrv7;->c:Z

    .line 515
    .line 516
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 517
    .line 518
    .line 519
    move-result-object v7

    .line 520
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    invoke-static {v1, v7}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    if-nez v1, :cond_13

    .line 529
    .line 530
    const-string v1, "check"

    .line 531
    .line 532
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 533
    .line 534
    .line 535
    :cond_13
    if-ne p0, v2, :cond_14

    .line 536
    .line 537
    new-instance p0, Lzx6;

    .line 538
    .line 539
    const/16 v1, 0x14

    .line 540
    .line 541
    invoke-direct {p0, v1}, Lzx6;-><init>(B)V

    .line 542
    .line 543
    .line 544
    invoke-static {p1, p2, p0}, Ljv7;->Y(Ltv7;Ltv7;Lgn2;)Z

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    if-eqz p0, :cond_14

    .line 549
    .line 550
    const-string p0, "extra"

    .line 551
    .line 552
    invoke-virtual {v0, p0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 553
    .line 554
    .line 555
    :cond_14
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    if-eqz p0, :cond_15

    .line 560
    .line 561
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    goto :goto_4

    .line 566
    :cond_15
    move-object p0, v4

    .line 567
    :goto_4
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    if-eqz v1, :cond_16

    .line 576
    .line 577
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    goto :goto_5

    .line 582
    :cond_16
    move-object v1, v4

    .line 583
    :goto_5
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-static {p0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result p0

    .line 591
    if-nez p0, :cond_17

    .line 592
    .line 593
    const-string p0, "import"

    .line 594
    .line 595
    invoke-virtual {v0, p0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 596
    .line 597
    .line 598
    :cond_17
    new-instance p0, Lzx6;

    .line 599
    .line 600
    const/16 v1, 0x15

    .line 601
    .line 602
    invoke-direct {p0, v1}, Lzx6;-><init>(B)V

    .line 603
    .line 604
    .line 605
    invoke-static {p1, p2, p0}, Ljv7;->Y(Ltv7;Ltv7;Lgn2;)Z

    .line 606
    .line 607
    .line 608
    move-result p0

    .line 609
    if-eqz p0, :cond_1a

    .line 610
    .line 611
    const-string p0, "meta_params"

    .line 612
    .line 613
    invoke-virtual {v0, p0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 614
    .line 615
    .line 616
    const/4 p0, 0x0

    .line 617
    invoke-virtual {v0, v6, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 618
    .line 619
    .line 620
    goto :goto_6

    .line 621
    :cond_18
    instance-of p0, p1, Lov7;

    .line 622
    .line 623
    if-eqz p0, :cond_1a

    .line 624
    .line 625
    instance-of p0, p2, Lov7;

    .line 626
    .line 627
    if-eqz p0, :cond_1a

    .line 628
    .line 629
    check-cast p1, Lov7;

    .line 630
    .line 631
    iget-object p0, p1, Lov7;->a:La45;

    .line 632
    .line 633
    check-cast p2, Lov7;

    .line 634
    .line 635
    iget-object v1, p2, Lov7;->a:La45;

    .line 636
    .line 637
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result p0

    .line 641
    if-nez p0, :cond_19

    .line 642
    .line 643
    const-string p0, "network_transport"

    .line 644
    .line 645
    invoke-virtual {v0, p0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 646
    .line 647
    .line 648
    :cond_19
    iget-boolean p0, p1, Lov7;->b:Z

    .line 649
    .line 650
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 651
    .line 652
    .line 653
    move-result-object p0

    .line 654
    iget-boolean p1, p2, Lov7;->b:Z

    .line 655
    .line 656
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result p0

    .line 664
    if-nez p0, :cond_1a

    .line 665
    .line 666
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 667
    .line 668
    .line 669
    :cond_1a
    :goto_6
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 670
    .line 671
    .line 672
    move-result p0

    .line 673
    if-nez p0, :cond_1b

    .line 674
    .line 675
    return-object v0

    .line 676
    :cond_1b
    return-object v4
.end method

.class public final Lm47;
.super Li47;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final b(Ljava/lang/String;)Lx83;
    .locals 20

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p1 .. p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lsu/happ/proxyutility/dto/ServerConfig;->Companion:Lsu/happ/proxyutility/dto/ServerConfig$Companion;

    .line 9
    .line 10
    sget-object v2, Lsu/happ/proxyutility/dto/enums/EConfigType;->TROJAN:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lsu/happ/proxyutility/dto/ServerConfig$Companion;->a(Lsu/happ/proxyutility/dto/enums/EConfigType;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0}, Lwl7;->E(Landroid/net/Uri;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, ""

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    move-object v2, v3

    .line 28
    :cond_0
    invoke-static {v2}, Li47;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-static {v0}, Lx79;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_1
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v4, 0x6

    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    const-string v2, "flow"

    .line 50
    .line 51
    invoke-static {v0, v2, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    :cond_2
    move-object v2, v3

    .line 58
    :cond_3
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    const/4 v7, 0x0

    .line 63
    if-eqz v6, :cond_4

    .line 64
    .line 65
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_4

    .line 70
    .line 71
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->d()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    move-object v11, v6

    .line 82
    goto :goto_0

    .line 83
    :cond_4
    move-object v11, v7

    .line 84
    :goto_0
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    if-eqz v6, :cond_c

    .line 89
    .line 90
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_9

    .line 95
    .line 96
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    if-eqz v8, :cond_9

    .line 101
    .line 102
    invoke-static {v8, v0}, Li47;->f(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    const-string v9, "security"

    .line 107
    .line 108
    invoke-static {v0, v9, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    if-nez v9, :cond_5

    .line 113
    .line 114
    const-string v9, "tls"

    .line 115
    .line 116
    :cond_5
    const-string v10, "sni"

    .line 117
    .line 118
    invoke-static {v0, v10, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    if-nez v10, :cond_6

    .line 123
    .line 124
    move-object v10, v6

    .line 125
    :cond_6
    invoke-static {v0}, Li47;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    const-string v6, "pbk"

    .line 130
    .line 131
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    const-string v6, "sid"

    .line 136
    .line 137
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    const-string v6, "spx"

    .line 142
    .line 143
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v17

    .line 147
    const-string v6, "pqv"

    .line 148
    .line 149
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v18

    .line 153
    const-string v6, "alpn"

    .line 154
    .line 155
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    const-string v6, "pcs"

    .line 160
    .line 161
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    const-string v6, "pcn"

    .line 166
    .line 167
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-nez v6, :cond_7

    .line 172
    .line 173
    const-string v6, "vcn"

    .line 174
    .line 175
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    :cond_7
    move-object v13, v6

    .line 180
    const-string v6, "ech"

    .line 181
    .line 182
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-nez v6, :cond_8

    .line 187
    .line 188
    const-string v6, "echcl"

    .line 189
    .line 190
    invoke-static {v0, v6, v5, v4}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    :cond_8
    move-object/from16 v19, v6

    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static/range {v8 .. v19}, Lcb8;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_9
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    if-eqz v6, :cond_a

    .line 207
    .line 208
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    if-eqz v6, :cond_a

    .line 213
    .line 214
    invoke-static {v6, v0}, Li47;->d(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)V

    .line 215
    .line 216
    .line 217
    :cond_a
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    if-eqz v6, :cond_b

    .line 222
    .line 223
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-eqz v6, :cond_b

    .line 228
    .line 229
    invoke-static {v6, v0}, Li47;->e(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)V

    .line 230
    .line 231
    .line 232
    :cond_b
    invoke-static {v1, v0}, Li47;->c(Lsu/happ/proxyutility/dto/ServerConfig;Landroid/net/Uri;)V

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_c
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    if-eqz v6, :cond_d

    .line 241
    .line 242
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    if-eqz v8, :cond_d

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const-string v10, ""

    .line 250
    .line 251
    const-string v9, "tls"

    .line 252
    .line 253
    const/4 v12, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const/4 v15, 0x0

    .line 256
    const/16 v16, 0x0

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    const/16 v19, 0x0

    .line 263
    .line 264
    invoke-static/range {v8 .. v19}, Lcb8;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_d
    :goto_1
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    if-eqz v6, :cond_f

    .line 272
    .line 273
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    if-eqz v6, :cond_f

    .line 278
    .line 279
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->k()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    if-eqz v6, :cond_f

    .line 284
    .line 285
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    check-cast v5, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;

    .line 290
    .line 291
    if-eqz v5, :cond_f

    .line 292
    .line 293
    invoke-static {v0}, Lx79;->b(Landroid/net/Uri;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-virtual {v5, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->g(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/net/Uri;->getPort()I

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    invoke-virtual {v5, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->k(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    if-nez v6, :cond_e

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_e
    move-object v3, v6

    .line 315
    :goto_2
    invoke-virtual {v5, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->j(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->h(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_f
    new-instance v2, Lkf3;

    .line 322
    .line 323
    const/4 v3, 0x1

    .line 324
    const/4 v5, 0x3

    .line 325
    invoke-direct {v2, v3, v5, v3}, Lif3;-><init>(III)V

    .line 326
    .line 327
    .line 328
    new-instance v5, Lhu;

    .line 329
    .line 330
    invoke-direct {v5, v2, v3}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 331
    .line 332
    .line 333
    new-instance v2, Lzo6;

    .line 334
    .line 335
    invoke-direct {v2, v0, v4}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 336
    .line 337
    .line 338
    invoke-static {v5, v2}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    new-instance v2, Lka2;

    .line 343
    .line 344
    invoke-direct {v2, v0}, Lka2;-><init>(Lla2;)V

    .line 345
    .line 346
    .line 347
    :cond_10
    invoke-virtual {v2}, Lka2;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_13

    .line 352
    .line 353
    invoke-virtual {v2}, Lka2;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, Ljava/lang/String;

    .line 358
    .line 359
    :try_start_0
    sget-object v3, Lyw2;->c:Lcom/google/gson/a;

    .line 360
    .line 361
    const-class v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 362
    .line 363
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance v5, Lyi8;

    .line 367
    .line 368
    invoke-direct {v5, v4}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3, v0, v5}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 375
    goto :goto_3

    .line 376
    :catchall_0
    move-exception v0

    .line 377
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 378
    .line 379
    if-nez v3, :cond_12

    .line 380
    .line 381
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 382
    .line 383
    if-nez v3, :cond_12

    .line 384
    .line 385
    new-instance v3, Lrj6;

    .line 386
    .line 387
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 388
    .line 389
    .line 390
    move-object v0, v3

    .line 391
    :goto_3
    nop

    .line 392
    instance-of v3, v0, Lrj6;

    .line 393
    .line 394
    if-eqz v3, :cond_11

    .line 395
    .line 396
    move-object v0, v7

    .line 397
    :cond_11
    if-eqz v0, :cond_10

    .line 398
    .line 399
    move-object v7, v0

    .line 400
    goto :goto_4

    .line 401
    :cond_12
    throw v0

    .line 402
    :cond_13
    :goto_4
    check-cast v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 403
    .line 404
    if-eqz v7, :cond_14

    .line 405
    .line 406
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-eqz v0, :cond_14

    .line 411
    .line 412
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    if-eqz v0, :cond_14

    .line 417
    .line 418
    invoke-virtual {v0, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 419
    .line 420
    .line 421
    :cond_14
    invoke-static/range {p1 .. p1}, Li47;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    if-eqz v0, :cond_16

    .line 426
    .line 427
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-eqz v2, :cond_15

    .line 432
    .line 433
    new-instance v2, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 434
    .line 435
    invoke-direct {v2, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_15
    new-instance v2, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 440
    .line 441
    invoke-direct {v2, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    :goto_5
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/ServerConfig;->l(Lsu/happ/proxyutility/dto/ServerConfig$Meta;)V

    .line 445
    .line 446
    .line 447
    :cond_16
    new-instance v0, Lj83;

    .line 448
    .line 449
    invoke-direct {v0, v1}, Lj83;-><init>(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 450
    .line 451
    .line 452
    return-object v0
.end method

.method public final g(Lsu/happ/proxyutility/dto/ServerConfig;)Ljava/lang/String;
    .locals 17

    .line 1
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->d()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget-object v4, Lss8;->a:Lss8;

    .line 26
    .line 27
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->g()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    :goto_0
    return-object v1

    .line 34
    :cond_2
    invoke-static {v4}, Lss8;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->h()Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    new-instance v6, Landroid/net/Uri$Builder;

    .line 43
    .line 44
    invoke-direct {v6}, Landroid/net/Uri$Builder;-><init>()V

    .line 45
    .line 46
    .line 47
    sget-object v7, Lsu/happ/proxyutility/dto/enums/EConfigType;->TROJAN:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 48
    .line 49
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v6, v8}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v8, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v3, "@"

    .line 63
    .line 64
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, ":"

    .line 71
    .line 72
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v6, v3}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->k()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;

    .line 111
    .line 112
    if-eqz v4, :cond_4

    .line 113
    .line 114
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->b()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-nez v8, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object v4, v6

    .line 128
    :goto_1
    if-eqz v4, :cond_4

    .line 129
    .line 130
    const-string v8, "flow"

    .line 131
    .line 132
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->h()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    const-string v9, "none"

    .line 144
    .line 145
    if-nez v8, :cond_5

    .line 146
    .line 147
    move-object v4, v9

    .line 148
    :cond_5
    const-string v8, "security"

    .line 149
    .line 150
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-nez v4, :cond_6

    .line 158
    .line 159
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    :cond_6
    if-eqz v4, :cond_16

    .line 164
    .line 165
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->h()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    if-eqz v8, :cond_8

    .line 170
    .line 171
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-nez v10, :cond_7

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_7
    move-object v8, v6

    .line 179
    :goto_2
    if-eqz v8, :cond_8

    .line 180
    .line 181
    const-string v10, "sni"

    .line 182
    .line 183
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 184
    .line 185
    .line 186
    :cond_8
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->b()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    if-eqz v11, :cond_a

    .line 191
    .line 192
    const/4 v15, 0x0

    .line 193
    const/16 v16, 0x3f

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    invoke-static/range {v11 .. v16}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-nez v10, :cond_9

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_9
    move-object v8, v6

    .line 210
    :goto_3
    if-eqz v8, :cond_a

    .line 211
    .line 212
    const-string v10, "alpn"

    .line 213
    .line 214
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 215
    .line 216
    .line 217
    :cond_a
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->d()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    if-eqz v8, :cond_c

    .line 222
    .line 223
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    if-nez v10, :cond_b

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    move-object v8, v6

    .line 231
    :goto_4
    if-eqz v8, :cond_c

    .line 232
    .line 233
    const-string v10, "fp"

    .line 234
    .line 235
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 236
    .line 237
    .line 238
    :cond_c
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->g()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-eqz v8, :cond_e

    .line 243
    .line 244
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    if-nez v10, :cond_d

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_d
    move-object v8, v6

    .line 252
    :goto_5
    if-eqz v8, :cond_e

    .line 253
    .line 254
    const-string v10, "pbk"

    .line 255
    .line 256
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 257
    .line 258
    .line 259
    :cond_e
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->i()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    if-eqz v8, :cond_10

    .line 264
    .line 265
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-nez v10, :cond_f

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_f
    move-object v8, v6

    .line 273
    :goto_6
    if-eqz v8, :cond_10

    .line 274
    .line 275
    const-string v10, "sid"

    .line 276
    .line 277
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 278
    .line 279
    .line 280
    :cond_10
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->j()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    if-eqz v8, :cond_12

    .line 285
    .line 286
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-nez v10, :cond_11

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_11
    move-object v8, v6

    .line 294
    :goto_7
    if-eqz v8, :cond_12

    .line 295
    .line 296
    const-string v10, "spx"

    .line 297
    .line 298
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 299
    .line 300
    .line 301
    :cond_12
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->f()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    if-eqz v8, :cond_14

    .line 306
    .line 307
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 308
    .line 309
    .line 310
    move-result v10

    .line 311
    if-nez v10, :cond_13

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_13
    move-object v8, v6

    .line 315
    :goto_8
    if-eqz v8, :cond_14

    .line 316
    .line 317
    const-string v10, "pcs"

    .line 318
    .line 319
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 320
    .line 321
    .line 322
    :cond_14
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->k()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    if-eqz v4, :cond_16

    .line 327
    .line 328
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    if-nez v8, :cond_15

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_15
    move-object v4, v6

    .line 336
    :goto_9
    if-eqz v4, :cond_16

    .line 337
    .line 338
    const-string v8, "pcn"

    .line 339
    .line 340
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 341
    .line 342
    .line 343
    :cond_16
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    if-nez v8, :cond_17

    .line 352
    .line 353
    sget-object v4, Lsu/happ/proxyutility/dto/XRayConfig;->Companion:Lsu/happ/proxyutility/dto/XRayConfig$Companion;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-static {}, Lsu/happ/proxyutility/dto/XRayConfig;->a()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    :cond_17
    const-string v8, "type"

    .line 363
    .line 364
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->l()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-eqz v0, :cond_2c

    .line 372
    .line 373
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->TCP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 378
    .line 379
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    const-string v10, "headerType"

    .line 388
    .line 389
    const-string v11, "host"

    .line 390
    .line 391
    const/4 v12, 0x1

    .line 392
    if-eqz v8, :cond_1a

    .line 393
    .line 394
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    check-cast v4, Ljava/lang/CharSequence;

    .line 399
    .line 400
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-nez v8, :cond_18

    .line 405
    .line 406
    goto :goto_a

    .line 407
    :cond_18
    move-object v9, v4

    .line 408
    :goto_a
    check-cast v9, Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 411
    .line 412
    .line 413
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    move-object v4, v0

    .line 418
    check-cast v4, Ljava/lang/String;

    .line 419
    .line 420
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    if-nez v4, :cond_19

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_19
    move-object v0, v6

    .line 428
    :goto_b
    check-cast v0, Ljava/lang/String;

    .line 429
    .line 430
    if-eqz v0, :cond_2c

    .line 431
    .line 432
    invoke-virtual {v3, v11, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 433
    .line 434
    .line 435
    goto/16 :goto_16

    .line 436
    .line 437
    :cond_1a
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->KCP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 438
    .line 439
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    const/4 v13, 0x2

    .line 448
    if-eqz v8, :cond_1d

    .line 449
    .line 450
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    check-cast v4, Ljava/lang/CharSequence;

    .line 455
    .line 456
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    if-nez v8, :cond_1b

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_1b
    move-object v9, v4

    .line 464
    :goto_c
    check-cast v9, Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 467
    .line 468
    .line 469
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    move-object v4, v0

    .line 474
    check-cast v4, Ljava/lang/String;

    .line 475
    .line 476
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-nez v4, :cond_1c

    .line 481
    .line 482
    goto :goto_d

    .line 483
    :cond_1c
    move-object v0, v6

    .line 484
    :goto_d
    check-cast v0, Ljava/lang/String;

    .line 485
    .line 486
    if-eqz v0, :cond_2c

    .line 487
    .line 488
    const-string v4, "seed"

    .line 489
    .line 490
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 491
    .line 492
    .line 493
    goto/16 :goto_16

    .line 494
    .line 495
    :cond_1d
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->WS:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 496
    .line 497
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v8

    .line 505
    const-string v9, "path"

    .line 506
    .line 507
    if-nez v8, :cond_28

    .line 508
    .line 509
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->HTTP_UPGRADE:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 510
    .line 511
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v8

    .line 515
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    if-eqz v8, :cond_1e

    .line 520
    .line 521
    goto/16 :goto_13

    .line 522
    .line 523
    :cond_1e
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->SPLIT_HTTP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 524
    .line 525
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v8

    .line 529
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    const-string v10, "mode"

    .line 534
    .line 535
    if-nez v8, :cond_20

    .line 536
    .line 537
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->XHTTP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 538
    .line 539
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    if-eqz v8, :cond_1f

    .line 548
    .line 549
    goto :goto_e

    .line 550
    :cond_1f
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->GRPC:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 551
    .line 552
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    invoke-static {v4, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_2c

    .line 561
    .line 562
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    check-cast v4, Ljava/lang/String;

    .line 567
    .line 568
    invoke-virtual {v3, v10, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 569
    .line 570
    .line 571
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    check-cast v4, Ljava/lang/String;

    .line 576
    .line 577
    const-string v8, "authority"

    .line 578
    .line 579
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 580
    .line 581
    .line 582
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    check-cast v0, Ljava/lang/String;

    .line 587
    .line 588
    const-string v4, "serviceName"

    .line 589
    .line 590
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 591
    .line 592
    .line 593
    goto/16 :goto_16

    .line 594
    .line 595
    :cond_20
    :goto_e
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    move-object v8, v4

    .line 600
    check-cast v8, Ljava/lang/String;

    .line 601
    .line 602
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    if-nez v8, :cond_21

    .line 607
    .line 608
    goto :goto_f

    .line 609
    :cond_21
    move-object v4, v6

    .line 610
    :goto_f
    check-cast v4, Ljava/lang/String;

    .line 611
    .line 612
    if-eqz v4, :cond_22

    .line 613
    .line 614
    invoke-virtual {v3, v10, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 615
    .line 616
    .line 617
    :cond_22
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    move-object v8, v4

    .line 622
    check-cast v8, Ljava/lang/String;

    .line 623
    .line 624
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 625
    .line 626
    .line 627
    move-result v8

    .line 628
    if-nez v8, :cond_23

    .line 629
    .line 630
    goto :goto_10

    .line 631
    :cond_23
    move-object v4, v6

    .line 632
    :goto_10
    check-cast v4, Ljava/lang/String;

    .line 633
    .line 634
    if-eqz v4, :cond_24

    .line 635
    .line 636
    invoke-virtual {v3, v11, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 637
    .line 638
    .line 639
    :cond_24
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    move-object v8, v4

    .line 644
    check-cast v8, Ljava/lang/String;

    .line 645
    .line 646
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 647
    .line 648
    .line 649
    move-result v8

    .line 650
    if-nez v8, :cond_25

    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_25
    move-object v4, v6

    .line 654
    :goto_11
    check-cast v4, Ljava/lang/String;

    .line 655
    .line 656
    if-eqz v4, :cond_26

    .line 657
    .line 658
    invoke-virtual {v3, v9, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 659
    .line 660
    .line 661
    :cond_26
    const/4 v4, 0x3

    .line 662
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    move-object v4, v0

    .line 667
    check-cast v4, Ljava/lang/String;

    .line 668
    .line 669
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    if-nez v4, :cond_27

    .line 674
    .line 675
    goto :goto_12

    .line 676
    :cond_27
    move-object v0, v6

    .line 677
    :goto_12
    check-cast v0, Ljava/lang/String;

    .line 678
    .line 679
    if-eqz v0, :cond_2c

    .line 680
    .line 681
    const-string v4, "extra"

    .line 682
    .line 683
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 684
    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_28
    :goto_13
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    move-object v8, v4

    .line 692
    check-cast v8, Ljava/lang/String;

    .line 693
    .line 694
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 695
    .line 696
    .line 697
    move-result v8

    .line 698
    if-nez v8, :cond_29

    .line 699
    .line 700
    goto :goto_14

    .line 701
    :cond_29
    move-object v4, v6

    .line 702
    :goto_14
    check-cast v4, Ljava/lang/String;

    .line 703
    .line 704
    if-eqz v4, :cond_2a

    .line 705
    .line 706
    invoke-virtual {v3, v11, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 707
    .line 708
    .line 709
    :cond_2a
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    move-object v4, v0

    .line 714
    check-cast v4, Ljava/lang/String;

    .line 715
    .line 716
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    if-nez v4, :cond_2b

    .line 721
    .line 722
    goto :goto_15

    .line 723
    :cond_2b
    move-object v0, v6

    .line 724
    :goto_15
    check-cast v0, Ljava/lang/String;

    .line 725
    .line 726
    if-eqz v0, :cond_2c

    .line 727
    .line 728
    invoke-virtual {v3, v9, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 729
    .line 730
    .line 731
    :cond_2c
    :goto_16
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    const-string v4, ","

    .line 736
    .line 737
    if-eqz v0, :cond_2e

    .line 738
    .line 739
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->b()Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    if-eqz v0, :cond_2d

    .line 744
    .line 745
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;

    .line 750
    .line 751
    if-eqz v0, :cond_2d

    .line 752
    .line 753
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;->c()Ljava/util/Map;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    goto :goto_17

    .line 758
    :cond_2d
    move-object v0, v6

    .line 759
    :goto_17
    if-eqz v0, :cond_2e

    .line 760
    .line 761
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->e(Ljava/util/Map;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->k(Ljava/util/Map;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v10

    .line 773
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->g(Ljava/util/Map;)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    new-instance v11, Ljava/lang/StringBuilder;

    .line 778
    .line 779
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    const-string v8, "fragment"

    .line 808
    .line 809
    invoke-virtual {v3, v8, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 810
    .line 811
    .line 812
    :cond_2e
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    if-eqz v0, :cond_30

    .line 817
    .line 818
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->c()Ljava/util/List;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    if-eqz v0, :cond_2f

    .line 823
    .line 824
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;

    .line 829
    .line 830
    if-eqz v0, :cond_2f

    .line 831
    .line 832
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;->a()Ljava/util/Map;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    if-eqz v0, :cond_2f

    .line 837
    .line 838
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;->b(Ljava/util/Map;)Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    if-eqz v0, :cond_2f

    .line 843
    .line 844
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;

    .line 849
    .line 850
    goto :goto_18

    .line 851
    :cond_2f
    move-object v0, v6

    .line 852
    :goto_18
    if-eqz v0, :cond_30

    .line 853
    .line 854
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->b()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v8

    .line 858
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->c()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v9

    .line 862
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->a()Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    new-instance v10, Ljava/lang/StringBuilder;

    .line 867
    .line 868
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 878
    .line 879
    .line 880
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    const-string v4, "noises"

    .line 891
    .line 892
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 893
    .line 894
    .line 895
    :cond_30
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->b()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    if-eqz v0, :cond_31

    .line 900
    .line 901
    const-string v4, "advancedfragment"

    .line 902
    .line 903
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 904
    .line 905
    .line 906
    :cond_31
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    if-eqz v0, :cond_32

    .line 911
    .line 912
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 913
    .line 914
    invoke-virtual {v2, v0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    const-string v2, "fm"

    .line 919
    .line 920
    invoke-virtual {v3, v2, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 921
    .line 922
    .line 923
    :cond_32
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    if-eqz v0, :cond_33

    .line 928
    .line 929
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;->a()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    goto :goto_19

    .line 934
    :cond_33
    move-object v0, v6

    .line 935
    :goto_19
    if-eqz v0, :cond_34

    .line 936
    .line 937
    invoke-static {v5, v0}, Lwl7;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    const-string v2, "?serverDescription="

    .line 942
    .line 943
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v6

    .line 947
    :cond_34
    if-nez v6, :cond_35

    .line 948
    .line 949
    move-object v6, v1

    .line 950
    :cond_35
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    new-instance v2, Ljava/lang/StringBuilder;

    .line 955
    .line 956
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    new-instance v3, Ljava/lang/StringBuilder;

    .line 988
    .line 989
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 993
    .line 994
    .line 995
    const-string v2, "://"

    .line 996
    .line 997
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    invoke-static {v0, v2, v1, v5}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    return-object v0
.end method

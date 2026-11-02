.class public final Lk47;
.super Li47;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final b(Ljava/lang/String;)Lx83;
    .locals 38

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-class v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 4
    .line 5
    const-string v0, "fm"

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v3, Lss8;->a:Lss8;

    .line 11
    .line 12
    invoke-static {v1}, Lss8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lsu/happ/proxyutility/dto/ServerConfig;->Companion:Lsu/happ/proxyutility/dto/ServerConfig$Companion;

    .line 21
    .line 22
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EConfigType;->SHADOWSOCKS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v5}, Lsu/happ/proxyutility/dto/ServerConfig$Companion;->a(Lsu/happ/proxyutility/dto/enums/EConfigType;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, "plugin"

    .line 32
    .line 33
    const-string v6, ":"

    .line 34
    .line 35
    const-string v7, ""

    .line 36
    .line 37
    const/4 v8, 0x6

    .line 38
    const/4 v10, 0x2

    .line 39
    const/4 v12, 0x0

    .line 40
    :try_start_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-virtual {v13}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v14

    .line 48
    if-nez v14, :cond_0

    .line 49
    .line 50
    move v0, v12

    .line 51
    const/16 v17, 0x1

    .line 52
    .line 53
    goto/16 :goto_a

    .line 54
    .line 55
    :cond_0
    invoke-static {v13}, Lwl7;->E(Landroid/net/Uri;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v15

    .line 59
    if-nez v15, :cond_1

    .line 60
    .line 61
    move-object v15, v7

    .line 62
    :cond_1
    invoke-static {v15}, Li47;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    if-nez v15, :cond_2

    .line 67
    .line 68
    invoke-static {v13}, Lx79;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    const/16 v17, 0x1

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_2
    :goto_0
    invoke-virtual {v4, v15}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v14, v6, v12}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v15

    .line 85
    if-eqz v15, :cond_3

    .line 86
    .line 87
    filled-new-array {v6}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-static {v14, v6, v10}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-static {v14}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    filled-new-array {v6}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v14, v6, v10}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-ne v14, v10, :cond_12

    .line 113
    .line 114
    invoke-static {v6}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    check-cast v14, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v6}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v13}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    if-nez v15, :cond_4

    .line 131
    .line 132
    move-object v15, v7

    .line 133
    :cond_4
    invoke-static {v8, v15}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v16

    .line 141
    if-nez v16, :cond_e

    .line 142
    .line 143
    new-instance v11, Ljava/util/HashMap;

    .line 144
    .line 145
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v16, ";"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    const/16 v17, 0x1

    .line 151
    .line 152
    :try_start_1
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-static {v15, v9, v8}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    if-eqz v15, :cond_6

    .line 172
    .line 173
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    check-cast v15, Ljava/lang/String;

    .line 178
    .line 179
    const-string v10, "="

    .line 180
    .line 181
    invoke-static {v15, v10, v12, v12, v8}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    const/4 v12, -0x1

    .line 186
    if-ne v10, v12, :cond_5

    .line 187
    .line 188
    invoke-static {v8, v15}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v11, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :goto_3
    const/4 v10, 0x2

    .line 196
    const/4 v12, 0x0

    .line 197
    goto :goto_2

    .line 198
    :catchall_1
    move-exception v0

    .line 199
    goto/16 :goto_8

    .line 200
    .line 201
    :cond_5
    move-object/from16 v18, v9

    .line 202
    .line 203
    const/4 v12, 0x0

    .line 204
    invoke-virtual {v15, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-static {v8, v9}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    add-int/lit8 v10, v10, 0x1

    .line 213
    .line 214
    invoke-virtual {v15, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-static {v8, v10}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    invoke-virtual {v11, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-object/from16 v9, v18

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_6
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    const-string v10, "obfs-local"

    .line 236
    .line 237
    invoke-static {v9, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    const-string v10, "path"

    .line 242
    .line 243
    if-eqz v9, :cond_8

    .line 244
    .line 245
    :try_start_2
    const-string v9, "obfs"

    .line 246
    .line 247
    invoke-virtual {v11, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    sget-object v12, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->HTTP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 252
    .line 253
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    invoke-static {v9, v15}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    if-eqz v9, :cond_8

    .line 262
    .line 263
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    if-eqz v5, :cond_7

    .line 268
    .line 269
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 270
    .line 271
    .line 272
    move-result-object v18

    .line 273
    if-eqz v18, :cond_7

    .line 274
    .line 275
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->TCP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 276
    .line 277
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v19

    .line 281
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v20

    .line 285
    const-string v5, "obfs-host"

    .line 286
    .line 287
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    move-object/from16 v21, v5

    .line 292
    .line 293
    check-cast v21, Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    move-object/from16 v22, v5

    .line 300
    .line 301
    check-cast v22, Ljava/lang/String;

    .line 302
    .line 303
    const/16 v36, 0x0

    .line 304
    .line 305
    const v37, 0x3ff00

    .line 306
    .line 307
    .line 308
    const/16 v23, 0x0

    .line 309
    .line 310
    const/16 v24, 0x0

    .line 311
    .line 312
    const/16 v25, 0x0

    .line 313
    .line 314
    const/16 v26, 0x0

    .line 315
    .line 316
    const/16 v27, 0x0

    .line 317
    .line 318
    const/16 v28, 0x0

    .line 319
    .line 320
    const/16 v29, 0x0

    .line 321
    .line 322
    const/16 v30, 0x0

    .line 323
    .line 324
    const/16 v31, 0x0

    .line 325
    .line 326
    const/16 v32, 0x0

    .line 327
    .line 328
    const/16 v33, 0x0

    .line 329
    .line 330
    const/16 v34, 0x0

    .line 331
    .line 332
    const/16 v35, 0x0

    .line 333
    .line 334
    invoke-static/range {v18 .. v37}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->n(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    goto :goto_4

    .line 339
    :cond_7
    const/4 v5, 0x0

    .line 340
    goto :goto_4

    .line 341
    :cond_8
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    const-string v9, "v2ray-plugin"

    .line 346
    .line 347
    invoke-static {v5, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_9

    .line 352
    .line 353
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->WS:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 354
    .line 355
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v19

    .line 359
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    if-eqz v5, :cond_7

    .line 364
    .line 365
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 366
    .line 367
    .line 368
    move-result-object v18

    .line 369
    if-eqz v18, :cond_7

    .line 370
    .line 371
    const-string v5, "host"

    .line 372
    .line 373
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    move-object/from16 v21, v5

    .line 378
    .line 379
    check-cast v21, Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    move-object/from16 v22, v5

    .line 386
    .line 387
    check-cast v22, Ljava/lang/String;

    .line 388
    .line 389
    const/16 v36, 0x0

    .line 390
    .line 391
    const v37, 0x3ff00

    .line 392
    .line 393
    .line 394
    const/16 v20, 0x0

    .line 395
    .line 396
    const/16 v23, 0x0

    .line 397
    .line 398
    const/16 v24, 0x0

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v28, 0x0

    .line 407
    .line 408
    const/16 v29, 0x0

    .line 409
    .line 410
    const/16 v30, 0x0

    .line 411
    .line 412
    const/16 v31, 0x0

    .line 413
    .line 414
    const/16 v32, 0x0

    .line 415
    .line 416
    const/16 v33, 0x0

    .line 417
    .line 418
    const/16 v34, 0x0

    .line 419
    .line 420
    const/16 v35, 0x0

    .line 421
    .line 422
    invoke-static/range {v18 .. v37}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->n(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    goto :goto_4

    .line 427
    :cond_9
    move-object v5, v7

    .line 428
    :goto_4
    const-string v9, "tls"

    .line 429
    .line 430
    invoke-virtual {v11, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-eqz v9, :cond_c

    .line 435
    .line 436
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    if-eqz v9, :cond_c

    .line 441
    .line 442
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 443
    .line 444
    .line 445
    move-result-object v18

    .line 446
    if-eqz v18, :cond_c

    .line 447
    .line 448
    const-string v19, "tls"

    .line 449
    .line 450
    if-nez v5, :cond_a

    .line 451
    .line 452
    move-object/from16 v20, v7

    .line 453
    .line 454
    goto :goto_5

    .line 455
    :cond_a
    move-object/from16 v20, v5

    .line 456
    .line 457
    :goto_5
    const-string v5, "pcs"

    .line 458
    .line 459
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    move-object/from16 v22, v5

    .line 464
    .line 465
    check-cast v22, Ljava/lang/String;

    .line 466
    .line 467
    const-string v5, "pcn"

    .line 468
    .line 469
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    check-cast v5, Ljava/lang/String;

    .line 474
    .line 475
    if-nez v5, :cond_b

    .line 476
    .line 477
    const-string v5, "vcn"

    .line 478
    .line 479
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    check-cast v5, Ljava/lang/String;

    .line 484
    .line 485
    :cond_b
    move-object/from16 v23, v5

    .line 486
    .line 487
    const/16 v21, 0x0

    .line 488
    .line 489
    const/16 v24, 0x0

    .line 490
    .line 491
    invoke-static/range {v18 .. v24}, Lcb8;->b(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_c
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    if-eqz v5, :cond_f

    .line 499
    .line 500
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    if-eqz v5, :cond_f

    .line 505
    .line 506
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, Ljava/lang/String;

    .line 511
    .line 512
    if-eqz v0, :cond_d

    .line 513
    .line 514
    sget-object v9, Lyw2;->c:Lcom/google/gson/a;

    .line 515
    .line 516
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    new-instance v10, Lyi8;

    .line 520
    .line 521
    invoke-direct {v10, v2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v9, v0, v10}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 529
    .line 530
    goto :goto_6

    .line 531
    :cond_d
    const/4 v0, 0x0

    .line 532
    :goto_6
    invoke-virtual {v5, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 533
    .line 534
    .line 535
    goto :goto_7

    .line 536
    :cond_e
    const/16 v17, 0x1

    .line 537
    .line 538
    :cond_f
    :goto_7
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    if-eqz v0, :cond_11

    .line 543
    .line 544
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    if-eqz v0, :cond_11

    .line 549
    .line 550
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->k()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    if-eqz v0, :cond_11

    .line 555
    .line 556
    const/4 v12, 0x0

    .line 557
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;

    .line 562
    .line 563
    if-eqz v0, :cond_11

    .line 564
    .line 565
    invoke-virtual {v13}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    if-nez v5, :cond_10

    .line 570
    .line 571
    move-object v5, v7

    .line 572
    :cond_10
    invoke-virtual {v0, v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->g(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v13}, Landroid/net/Uri;->getPort()I

    .line 576
    .line 577
    .line 578
    move-result v5

    .line 579
    invoke-virtual {v0, v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->k(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->j(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v14}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->i(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 589
    .line 590
    goto :goto_9

    .line 591
    :cond_11
    const/4 v0, 0x0

    .line 592
    goto :goto_9

    .line 593
    :cond_12
    const/16 v17, 0x1

    .line 594
    .line 595
    const/4 v0, 0x0

    .line 596
    goto :goto_a

    .line 597
    :goto_8
    instance-of v5, v0, Ljava/lang/InterruptedException;

    .line 598
    .line 599
    if-nez v5, :cond_21

    .line 600
    .line 601
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 602
    .line 603
    if-nez v5, :cond_21

    .line 604
    .line 605
    new-instance v5, Lrj6;

    .line 606
    .line 607
    invoke-direct {v5, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 608
    .line 609
    .line 610
    move-object v0, v5

    .line 611
    :goto_9
    instance-of v0, v0, Lrj6;

    .line 612
    .line 613
    xor-int/lit8 v0, v0, 0x1

    .line 614
    .line 615
    :goto_a
    const/4 v5, 0x3

    .line 616
    if-nez v0, :cond_19

    .line 617
    .line 618
    sget-object v0, Lsu/happ/proxyutility/dto/enums/EConfigType;->SHADOWSOCKS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 619
    .line 620
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    new-instance v6, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    const-string v0, "://"

    .line 633
    .line 634
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    const/4 v12, 0x0

    .line 642
    invoke-static {v1, v0, v7, v12}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    const-string v6, "#"

    .line 647
    .line 648
    invoke-static {v0, v6, v12, v12, v8}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 649
    .line 650
    .line 651
    move-result v6

    .line 652
    if-lez v6, :cond_14

    .line 653
    .line 654
    invoke-static {v0}, Li47;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v7

    .line 658
    if-nez v7, :cond_13

    .line 659
    .line 660
    invoke-static {v3}, Lx79;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v7

    .line 664
    :cond_13
    invoke-virtual {v4, v7}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v12, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    :cond_14
    const-string v6, "@"

    .line 672
    .line 673
    invoke-static {v0, v6, v12, v12, v8}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    if-lez v6, :cond_15

    .line 678
    .line 679
    sget-object v7, Lss8;->a:Lss8;

    .line 680
    .line 681
    invoke-virtual {v0, v12, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    invoke-static {v7}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 690
    .line 691
    .line 692
    move-result v9

    .line 693
    invoke-virtual {v0, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    goto :goto_b

    .line 702
    :cond_15
    sget-object v6, Lss8;->a:Lss8;

    .line 703
    .line 704
    invoke-static {v0}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    :goto_b
    const-string v6, "^(.+?):(.*)@(.+?):(\\d+?)/?$"

    .line 709
    .line 710
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 718
    .line 719
    .line 720
    move-result-object v7

    .line 721
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 725
    .line 726
    .line 727
    move-result v9

    .line 728
    if-nez v9, :cond_16

    .line 729
    .line 730
    const/4 v9, 0x0

    .line 731
    goto :goto_c

    .line 732
    :cond_16
    new-instance v9, Lfq4;

    .line 733
    .line 734
    invoke-direct {v9, v7, v0}, Lfq4;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 735
    .line 736
    .line 737
    :goto_c
    if-nez v9, :cond_18

    .line 738
    .line 739
    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 747
    .line 748
    .line 749
    move-result v6

    .line 750
    if-nez v6, :cond_17

    .line 751
    .line 752
    const/4 v9, 0x0

    .line 753
    goto :goto_d

    .line 754
    :cond_17
    new-instance v6, Lfq4;

    .line 755
    .line 756
    invoke-direct {v6, v0, v1}, Lfq4;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 757
    .line 758
    .line 759
    move-object v9, v6

    .line 760
    :goto_d
    if-nez v9, :cond_18

    .line 761
    .line 762
    new-instance v0, Ll83;

    .line 763
    .line 764
    sget v1, Ly46;->toast_incorrect_protocol:I

    .line 765
    .line 766
    invoke-direct {v0, v1}, Ll83;-><init>(I)V

    .line 767
    .line 768
    .line 769
    return-object v0

    .line 770
    :cond_18
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    if-eqz v0, :cond_19

    .line 775
    .line 776
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    if-eqz v0, :cond_19

    .line 781
    .line 782
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->k()Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    if-eqz v0, :cond_19

    .line 787
    .line 788
    const/4 v12, 0x0

    .line 789
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;

    .line 794
    .line 795
    if-eqz v0, :cond_19

    .line 796
    .line 797
    invoke-virtual {v9}, Lfq4;->a()Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v6

    .line 801
    check-cast v6, Ldq4;

    .line 802
    .line 803
    invoke-virtual {v6, v5}, Ldq4;->get(I)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v6

    .line 807
    check-cast v6, Ljava/lang/String;

    .line 808
    .line 809
    const-string v7, "["

    .line 810
    .line 811
    const-string v10, "]"

    .line 812
    .line 813
    invoke-static {v6, v7, v10}, Lfm7;->z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v6

    .line 817
    invoke-virtual {v0, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->g(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v9}, Lfq4;->a()Ljava/util/List;

    .line 821
    .line 822
    .line 823
    move-result-object v6

    .line 824
    const/4 v7, 0x4

    .line 825
    check-cast v6, Ldq4;

    .line 826
    .line 827
    invoke-virtual {v6, v7}, Ldq4;->get(I)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v6

    .line 831
    check-cast v6, Ljava/lang/String;

    .line 832
    .line 833
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 834
    .line 835
    .line 836
    move-result v6

    .line 837
    invoke-virtual {v0, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->k(I)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v9}, Lfq4;->a()Ljava/util/List;

    .line 841
    .line 842
    .line 843
    move-result-object v6

    .line 844
    check-cast v6, Ldq4;

    .line 845
    .line 846
    const/4 v7, 0x2

    .line 847
    invoke-virtual {v6, v7}, Ldq4;->get(I)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v6

    .line 851
    check-cast v6, Ljava/lang/String;

    .line 852
    .line 853
    invoke-virtual {v0, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->j(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v9}, Lfq4;->a()Ljava/util/List;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    check-cast v6, Ldq4;

    .line 861
    .line 862
    move/from16 v7, v17

    .line 863
    .line 864
    invoke-virtual {v6, v7}, Ldq4;->get(I)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v6

    .line 868
    check-cast v6, Ljava/lang/String;

    .line 869
    .line 870
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 871
    .line 872
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v6

    .line 876
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;->i(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    :cond_19
    new-instance v0, Lkf3;

    .line 883
    .line 884
    const/4 v7, 0x1

    .line 885
    invoke-direct {v0, v7, v5, v7}, Lif3;-><init>(III)V

    .line 886
    .line 887
    .line 888
    new-instance v5, Lhu;

    .line 889
    .line 890
    invoke-direct {v5, v0, v7}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 891
    .line 892
    .line 893
    new-instance v0, Lzo6;

    .line 894
    .line 895
    invoke-direct {v0, v3, v8}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 896
    .line 897
    .line 898
    invoke-static {v5, v0}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    new-instance v3, Lka2;

    .line 903
    .line 904
    invoke-direct {v3, v0}, Lka2;-><init>(Lla2;)V

    .line 905
    .line 906
    .line 907
    :cond_1a
    invoke-virtual {v3}, Lka2;->hasNext()Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-eqz v0, :cond_1d

    .line 912
    .line 913
    invoke-virtual {v3}, Lka2;->next()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    check-cast v0, Ljava/lang/String;

    .line 918
    .line 919
    :try_start_3
    sget-object v5, Lyw2;->c:Lcom/google/gson/a;

    .line 920
    .line 921
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    new-instance v6, Lyi8;

    .line 925
    .line 926
    invoke-direct {v6, v2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v5, v0, v6}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 933
    goto :goto_e

    .line 934
    :catchall_2
    move-exception v0

    .line 935
    instance-of v5, v0, Ljava/lang/InterruptedException;

    .line 936
    .line 937
    if-nez v5, :cond_1c

    .line 938
    .line 939
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 940
    .line 941
    if-nez v5, :cond_1c

    .line 942
    .line 943
    new-instance v5, Lrj6;

    .line 944
    .line 945
    invoke-direct {v5, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 946
    .line 947
    .line 948
    move-object v0, v5

    .line 949
    :goto_e
    nop

    .line 950
    instance-of v5, v0, Lrj6;

    .line 951
    .line 952
    if-eqz v5, :cond_1b

    .line 953
    .line 954
    const/4 v0, 0x0

    .line 955
    :cond_1b
    if-eqz v0, :cond_1a

    .line 956
    .line 957
    move-object v11, v0

    .line 958
    goto :goto_f

    .line 959
    :cond_1c
    throw v0

    .line 960
    :cond_1d
    const/4 v11, 0x0

    .line 961
    :goto_f
    check-cast v11, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 962
    .line 963
    if-eqz v11, :cond_1e

    .line 964
    .line 965
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    if-eqz v0, :cond_1e

    .line 970
    .line 971
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    if-eqz v0, :cond_1e

    .line 976
    .line 977
    invoke-virtual {v0, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 978
    .line 979
    .line 980
    :cond_1e
    invoke-static {v1}, Li47;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    if-eqz v0, :cond_20

    .line 985
    .line 986
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 987
    .line 988
    .line 989
    move-result-object v1

    .line 990
    if-eqz v1, :cond_1f

    .line 991
    .line 992
    new-instance v1, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 993
    .line 994
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    goto :goto_10

    .line 998
    :cond_1f
    new-instance v1, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 999
    .line 1000
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    :goto_10
    invoke-virtual {v4, v1}, Lsu/happ/proxyutility/dto/ServerConfig;->l(Lsu/happ/proxyutility/dto/ServerConfig$Meta;)V

    .line 1004
    .line 1005
    .line 1006
    :cond_20
    new-instance v0, Lj83;

    .line 1007
    .line 1008
    invoke-direct {v0, v4}, Lj83;-><init>(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 1009
    .line 1010
    .line 1011
    return-object v0

    .line 1012
    :cond_21
    throw v0
.end method

.method public final g(Lsu/happ/proxyutility/dto/ServerConfig;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, ""

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->f()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->d()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ":"

    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v4, Lss8;->a:Lss8;

    .line 46
    .line 47
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->g()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    :goto_0
    return-object v0

    .line 54
    :cond_2
    invoke-static {v4}, Lss8;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->h()Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v5, Landroid/net/Uri$Builder;

    .line 63
    .line 64
    invoke-direct {v5}, Landroid/net/Uri$Builder;-><init>()V

    .line 65
    .line 66
    .line 67
    sget-object v6, Lsu/happ/proxyutility/dto/enums/EConfigType;->SHADOWSOCKS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 68
    .line 69
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v5, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    new-instance v7, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v3, "@"

    .line 83
    .line 84
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v5, p0}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const-string v2, "fm"

    .line 117
    .line 118
    invoke-virtual {p0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const/4 v2, 0x0

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;->a()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object v1, v2

    .line 134
    :goto_1
    const/4 v3, 0x0

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-static {v3, v1}, Lwl7;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "?serverDescription="

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :cond_5
    if-nez v2, :cond_6

    .line 148
    .line 149
    move-object v2, v0

    .line 150
    :cond_6
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string p1, "://"

    .line 196
    .line 197
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p0, p1, v0, v3}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0
.end method

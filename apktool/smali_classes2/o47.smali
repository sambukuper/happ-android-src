.class public final Lo47;
.super Li47;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final b(Ljava/lang/String;)Lx83;
    .locals 36

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const-string v3, "auto"

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lsu/happ/proxyutility/dto/ServerConfig;->Companion:Lsu/happ/proxyutility/dto/ServerConfig$Companion;

    .line 11
    .line 12
    sget-object v4, Lsu/happ/proxyutility/dto/enums/EConfigType;->VMESS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v4}, Lsu/happ/proxyutility/dto/ServerConfig$Companion;->a(Lsu/happ/proxyutility/dto/enums/EConfigType;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v5, "vmess"

    .line 26
    .line 27
    if-eqz v0, :cond_2d

    .line 28
    .line 29
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    goto/16 :goto_15

    .line 36
    .line 37
    :cond_0
    const-string v0, "parse user info fail: RAW: "

    .line 38
    .line 39
    const/4 v7, 0x6

    .line 40
    const/4 v8, 0x3

    .line 41
    const/4 v9, 0x2

    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v11, 0x1

    .line 44
    :try_start_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    invoke-virtual {v13}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v14

    .line 52
    invoke-static {v14, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v14

    .line 56
    if-eqz v14, :cond_15

    .line 57
    .line 58
    const-string v14, "(tcp|ws|kcp|grpc)(\\+tls)?:([0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12})"

    .line 59
    .line 60
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 61
    .line 62
    .line 63
    move-result-object v14

    .line 64
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v13}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    if-nez v15, :cond_1

    .line 72
    .line 73
    move-object v15, v2

    .line 74
    :cond_1
    invoke-virtual {v14, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 82
    .line 83
    .line 84
    move-result v16

    .line 85
    if-nez v16, :cond_2

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance v12, Lfq4;

    .line 90
    .line 91
    invoke-direct {v12, v14, v15}, Lfq4;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    if-eqz v12, :cond_14

    .line 95
    .line 96
    invoke-virtual {v12}, Lfq4;->a()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ldq4;

    .line 101
    .line 102
    invoke-virtual {v0, v11}, Ldq4;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    move-object v15, v12

    .line 107
    check-cast v15, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v9}, Ldq4;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    check-cast v12, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v8}, Ldq4;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v12}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    if-eqz v14, :cond_3

    .line 130
    .line 131
    invoke-virtual {v14}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    if-nez v14, :cond_4

    .line 136
    .line 137
    :cond_3
    move/from16 v35, v11

    .line 138
    .line 139
    goto/16 :goto_9

    .line 140
    .line 141
    :cond_4
    invoke-static {v13}, Lwl7;->E(Landroid/net/Uri;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v16

    .line 145
    if-nez v16, :cond_5

    .line 146
    .line 147
    move-object/from16 v16, v2

    .line 148
    .line 149
    :cond_5
    invoke-static/range {v16 .. v16}, Li47;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v16

    .line 153
    if-nez v16, :cond_6

    .line 154
    .line 155
    invoke-static {v13}, Lx79;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v16

    .line 159
    :cond_6
    move-object/from16 v8, v16

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    move/from16 v35, v11

    .line 164
    .line 165
    goto/16 :goto_a

    .line 166
    .line 167
    :goto_1
    invoke-virtual {v4, v8}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    if-eqz v8, :cond_7

    .line 179
    .line 180
    invoke-static {v13}, Lx79;->b(Landroid/net/Uri;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-virtual {v8, v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->m(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v13}, Landroid/net/Uri;->getPort()I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-virtual {v8, v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->s(Ljava/lang/Integer;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->q(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->v(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    invoke-virtual {v14}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-eqz v0, :cond_8

    .line 209
    .line 210
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->d()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    goto :goto_2

    .line 215
    :cond_8
    const/4 v0, 0x0

    .line 216
    :goto_2
    const-string v8, "type"

    .line 217
    .line 218
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v16

    .line 222
    const-string v8, "host"

    .line 223
    .line 224
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    if-eqz v8, :cond_a

    .line 229
    .line 230
    const-string v9, "|"

    .line 231
    .line 232
    filled-new-array {v9}, [Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-static {v8, v9, v7}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, Ljava/lang/String;

    .line 245
    .line 246
    if-nez v8, :cond_9

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_9
    move-object/from16 v17, v8

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_a
    :goto_3
    move-object/from16 v17, v2

    .line 253
    .line 254
    :goto_4
    const-string v8, "path"

    .line 255
    .line 256
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    if-eqz v8, :cond_d

    .line 261
    .line 262
    invoke-static {v8}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    move/from16 v35, v11

    .line 271
    .line 272
    :try_start_1
    const-string v11, "/"

    .line 273
    .line 274
    invoke-static {v9, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-nez v9, :cond_b

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_b
    const/4 v8, 0x0

    .line 282
    :goto_5
    if-nez v8, :cond_c

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_c
    move-object/from16 v18, v8

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :catchall_1
    move-exception v0

    .line 289
    goto/16 :goto_a

    .line 290
    .line 291
    :cond_d
    move/from16 v35, v11

    .line 292
    .line 293
    :goto_6
    move-object/from16 v18, v2

    .line 294
    .line 295
    :goto_7
    const-string v8, "seed"

    .line 296
    .line 297
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v19

    .line 301
    const-string v8, "mode"

    .line 302
    .line 303
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v20

    .line 307
    const-string v8, "serviceName"

    .line 308
    .line 309
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v21

    .line 313
    const-string v8, "authority"

    .line 314
    .line 315
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v22

    .line 319
    const/16 v32, 0x0

    .line 320
    .line 321
    const v33, 0x3ff00

    .line 322
    .line 323
    .line 324
    const/16 v23, 0x0

    .line 325
    .line 326
    const/16 v24, 0x0

    .line 327
    .line 328
    const/16 v25, 0x0

    .line 329
    .line 330
    const/16 v26, 0x0

    .line 331
    .line 332
    const/16 v27, 0x0

    .line 333
    .line 334
    const/16 v28, 0x0

    .line 335
    .line 336
    const/16 v29, 0x0

    .line 337
    .line 338
    const/16 v30, 0x0

    .line 339
    .line 340
    const/16 v31, 0x0

    .line 341
    .line 342
    invoke-static/range {v14 .. v33}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->n(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v18

    .line 346
    if-nez v12, :cond_e

    .line 347
    .line 348
    const-string v8, "tls"

    .line 349
    .line 350
    move-object/from16 v17, v8

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_e
    move-object/from16 v17, v2

    .line 354
    .line 355
    :goto_8
    const-string v8, "pcs"

    .line 356
    .line 357
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v20

    .line 361
    const-string v8, "pcn"

    .line 362
    .line 363
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    if-nez v8, :cond_f

    .line 368
    .line 369
    const-string v8, "vcn"

    .line 370
    .line 371
    invoke-static {v13, v8, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    :cond_f
    move-object/from16 v21, v8

    .line 376
    .line 377
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    const/16 v22, 0x0

    .line 381
    .line 382
    move-object/from16 v19, v0

    .line 383
    .line 384
    move-object/from16 v16, v14

    .line 385
    .line 386
    invoke-static/range {v16 .. v22}, Lcb8;->b(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-eqz v0, :cond_10

    .line 398
    .line 399
    invoke-static {v0, v13}, Li47;->d(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)V

    .line 400
    .line 401
    .line 402
    :cond_10
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-eqz v0, :cond_11

    .line 411
    .line 412
    invoke-static {v0, v13}, Li47;->e(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)V

    .line 413
    .line 414
    .line 415
    :cond_11
    invoke-static {v4, v13}, Li47;->c(Lsu/happ/proxyutility/dto/ServerConfig;Landroid/net/Uri;)V

    .line 416
    .line 417
    .line 418
    const-string v0, "fm"

    .line 419
    .line 420
    invoke-static {v13, v0, v10, v7}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-eqz v0, :cond_13

    .line 425
    .line 426
    sget-object v8, Lyw2;->c:Lcom/google/gson/a;

    .line 427
    .line 428
    const-class v9, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 429
    .line 430
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    new-instance v11, Lyi8;

    .line 434
    .line 435
    invoke-direct {v11, v9}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v8, v0, v11}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 443
    .line 444
    if-eqz v0, :cond_13

    .line 445
    .line 446
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    if-eqz v8, :cond_12

    .line 455
    .line 456
    invoke-virtual {v8, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 457
    .line 458
    .line 459
    :cond_12
    sget-object v0, Ldn8;->a:Ldn8;

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_13
    const/4 v0, 0x0

    .line 463
    goto :goto_b

    .line 464
    :goto_9
    move v0, v10

    .line 465
    goto :goto_c

    .line 466
    :cond_14
    move/from16 v35, v11

    .line 467
    .line 468
    new-instance v8, Ljava/lang/IllegalStateException;

    .line 469
    .line 470
    invoke-virtual {v13}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    new-instance v11, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    const-string v0, "; URI: "

    .line 483
    .line 484
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    const-string v0, "; USER: "

    .line 491
    .line 492
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    const-string v0, ";"

    .line 499
    .line 500
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-direct {v8, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v8

    .line 515
    :cond_15
    move/from16 v35, v11

    .line 516
    .line 517
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 518
    .line 519
    const-string v8, "Check failed."

    .line 520
    .line 521
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 525
    :goto_a
    instance-of v8, v0, Ljava/lang/InterruptedException;

    .line 526
    .line 527
    if-nez v8, :cond_2c

    .line 528
    .line 529
    instance-of v8, v0, Ljava/util/concurrent/CancellationException;

    .line 530
    .line 531
    if-nez v8, :cond_2c

    .line 532
    .line 533
    new-instance v8, Lrj6;

    .line 534
    .line 535
    invoke-direct {v8, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 536
    .line 537
    .line 538
    move-object v0, v8

    .line 539
    :goto_b
    instance-of v0, v0, Lrj6;

    .line 540
    .line 541
    xor-int/lit8 v0, v0, 0x1

    .line 542
    .line 543
    :goto_c
    if-nez v0, :cond_2b

    .line 544
    .line 545
    const-string v0, "?"

    .line 546
    .line 547
    invoke-static {v1, v0, v10, v10, v7}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    const-string v9, "://"

    .line 552
    .line 553
    if-lez v8, :cond_19

    .line 554
    .line 555
    sget-object v3, Lsu/happ/proxyutility/dto/enums/EConfigType;->VMESS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 556
    .line 557
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    new-instance v6, Ljava/lang/StringBuilder;

    .line 562
    .line 563
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    invoke-static {v1, v3, v2, v10}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-static {v1, v0, v10, v10, v7}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-lez v0, :cond_16

    .line 585
    .line 586
    invoke-static {v0, v1}, Lfm7;->Q0(ILjava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    :cond_16
    sget-object v0, Lss8;->a:Lss8;

    .line 591
    .line 592
    invoke-static {v1}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    move/from16 v1, v35

    .line 597
    .line 598
    new-array v2, v1, [C

    .line 599
    .line 600
    const/16 v3, 0x40

    .line 601
    .line 602
    aput-char v3, v2, v10

    .line 603
    .line 604
    invoke-static {v0, v2}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    const/4 v3, 0x2

    .line 613
    if-eq v2, v3, :cond_17

    .line 614
    .line 615
    goto :goto_d

    .line 616
    :cond_17
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    check-cast v2, Ljava/lang/CharSequence;

    .line 621
    .line 622
    new-array v3, v1, [C

    .line 623
    .line 624
    const/16 v6, 0x3a

    .line 625
    .line 626
    aput-char v6, v3, v10

    .line 627
    .line 628
    invoke-static {v2, v3}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    check-cast v0, Ljava/lang/CharSequence;

    .line 637
    .line 638
    new-array v3, v1, [C

    .line 639
    .line 640
    aput-char v6, v3, v10

    .line 641
    .line 642
    invoke-static {v0, v3}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    const/4 v8, 0x2

    .line 651
    if-eq v1, v8, :cond_18

    .line 652
    .line 653
    :goto_d
    new-instance v0, Lq83;

    .line 654
    .line 655
    invoke-direct {v0, v5}, Lq83;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    return-object v0

    .line 659
    :cond_18
    const-string v1, "Alien"

    .line 660
    .line 661
    invoke-virtual {v4, v1}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    if-eqz v1, :cond_2b

    .line 669
    .line 670
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    if-eqz v1, :cond_2b

    .line 675
    .line 676
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    invoke-virtual {v1, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->m(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    const/4 v11, 0x1

    .line 684
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    check-cast v0, Ljava/lang/String;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    invoke-static {v10, v0}, Lss8;->C(ILjava/lang/String;)I

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->s(Ljava/lang/Integer;)V

    .line 702
    .line 703
    .line 704
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    check-cast v0, Ljava/lang/String;

    .line 709
    .line 710
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->q(Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    check-cast v0, Ljava/lang/String;

    .line 718
    .line 719
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->v(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    goto/16 :goto_14

    .line 723
    .line 724
    :cond_19
    move/from16 v11, v35

    .line 725
    .line 726
    const/4 v8, 0x2

    .line 727
    sget-object v0, Lsu/happ/proxyutility/dto/enums/EConfigType;->VMESS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 728
    .line 729
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    new-instance v12, Ljava/lang/StringBuilder;

    .line 734
    .line 735
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v1, v0, v2, v10}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    sget-object v1, Lss8;->a:Lss8;

    .line 753
    .line 754
    invoke-static {v0}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    if-eqz v1, :cond_1a

    .line 763
    .line 764
    new-instance v0, Ll83;

    .line 765
    .line 766
    sget v1, Ly46;->toast_decoding_failed:I

    .line 767
    .line 768
    invoke-direct {v0, v1}, Ll83;-><init>(I)V

    .line 769
    .line 770
    .line 771
    return-object v0

    .line 772
    :cond_1a
    sget-object v1, Lyw2;->b:Lcom/google/gson/a;

    .line 773
    .line 774
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    new-instance v2, Lyi8;

    .line 778
    .line 779
    const-class v9, Lsu/happ/proxyutility/dto/VmessQRCode;

    .line 780
    .line 781
    invoke-direct {v2, v9}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    check-cast v0, Lsu/happ/proxyutility/dto/VmessQRCode;

    .line 789
    .line 790
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->a()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    if-nez v1, :cond_2a

    .line 799
    .line 800
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->m()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    if-nez v1, :cond_2a

    .line 809
    .line 810
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->g()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    if-nez v1, :cond_2a

    .line 819
    .line 820
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->h()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 825
    .line 826
    .line 827
    move-result v1

    .line 828
    if-eqz v1, :cond_1b

    .line 829
    .line 830
    goto/16 :goto_13

    .line 831
    .line 832
    :cond_1b
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->n()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    invoke-virtual {v4, v1}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    if-eqz v1, :cond_1d

    .line 848
    .line 849
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->a()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->m(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->m()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    invoke-static {v10, v2}, Lss8;->C(ILjava/lang/String;)I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->s(Ljava/lang/Integer;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->g()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->q(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->o()Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    if-eqz v2, :cond_1c

    .line 890
    .line 891
    goto :goto_e

    .line 892
    :cond_1c
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->o()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    :goto_e
    invoke-virtual {v1, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->v(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    :cond_1d
    move v1, v7

    .line 900
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->h()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v7

    .line 904
    move/from16 v34, v8

    .line 905
    .line 906
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->s()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v8

    .line 910
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->f()Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v9

    .line 914
    move v2, v10

    .line 915
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->j()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v10

    .line 919
    move/from16 v35, v11

    .line 920
    .line 921
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->j()Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v11

    .line 925
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->s()Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v12

    .line 929
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->j()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v13

    .line 933
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->f()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v14

    .line 937
    const/16 v24, 0x0

    .line 938
    .line 939
    const v25, 0x3ff00

    .line 940
    .line 941
    .line 942
    const/4 v15, 0x0

    .line 943
    const/16 v16, 0x0

    .line 944
    .line 945
    const/16 v17, 0x0

    .line 946
    .line 947
    const/16 v18, 0x0

    .line 948
    .line 949
    const/16 v19, 0x0

    .line 950
    .line 951
    const/16 v20, 0x0

    .line 952
    .line 953
    const/16 v21, 0x0

    .line 954
    .line 955
    const/16 v22, 0x0

    .line 956
    .line 957
    const/16 v23, 0x0

    .line 958
    .line 959
    move v3, v2

    .line 960
    move/from16 v5, v35

    .line 961
    .line 962
    move v2, v1

    .line 963
    const/4 v1, 0x0

    .line 964
    invoke-static/range {v6 .. v25}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->n(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v7

    .line 968
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->d()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v9

    .line 972
    move-object v8, v7

    .line 973
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->r()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v7

    .line 977
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->q()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v10

    .line 981
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 982
    .line 983
    .line 984
    move-result v10

    .line 985
    if-eqz v10, :cond_1e

    .line 986
    .line 987
    goto :goto_f

    .line 988
    :cond_1e
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->q()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v8

    .line 992
    :goto_f
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->c()Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v12

    .line 996
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->l()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v10

    .line 1000
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->k()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v11

    .line 1004
    if-nez v11, :cond_1f

    .line 1005
    .line 1006
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->t()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v11

    .line 1010
    :cond_1f
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    invoke-static/range {v6 .. v12}, Lcb8;->b(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->e()Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v6

    .line 1023
    const/4 v7, 0x7

    .line 1024
    const-string v8, ","

    .line 1025
    .line 1026
    if-eqz v6, :cond_23

    .line 1027
    .line 1028
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v9

    .line 1032
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v9

    .line 1036
    if-eqz v9, :cond_20

    .line 1037
    .line 1038
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v12

    .line 1042
    goto :goto_10

    .line 1043
    :cond_20
    move-object v12, v1

    .line 1044
    :goto_10
    if-nez v12, :cond_21

    .line 1045
    .line 1046
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v9

    .line 1050
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v9

    .line 1054
    if-eqz v9, :cond_21

    .line 1055
    .line 1056
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1057
    .line 1058
    invoke-direct {v10, v1, v1, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v9, v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 1062
    .line 1063
    .line 1064
    :cond_21
    filled-new-array {v8}, [Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v9

    .line 1068
    invoke-static {v6, v9, v2}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v6

    .line 1072
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v9

    .line 1076
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v9

    .line 1080
    if-eqz v9, :cond_23

    .line 1081
    .line 1082
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v9

    .line 1086
    if-eqz v9, :cond_23

    .line 1087
    .line 1088
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;

    .line 1089
    .line 1090
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v11

    .line 1094
    check-cast v11, Ljava/lang/String;

    .line 1095
    .line 1096
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v12

    .line 1100
    check-cast v12, Ljava/lang/String;

    .line 1101
    .line 1102
    const/4 v13, 0x2

    .line 1103
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v14

    .line 1107
    check-cast v14, Ljava/lang/String;

    .line 1108
    .line 1109
    const/4 v13, 0x3

    .line 1110
    invoke-static {v13, v6}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v6

    .line 1114
    check-cast v6, Ljava/lang/String;

    .line 1115
    .line 1116
    if-nez v6, :cond_22

    .line 1117
    .line 1118
    const-string v6, "100-200"

    .line 1119
    .line 1120
    :cond_22
    invoke-static {v6, v12, v11, v14}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v6

    .line 1124
    invoke-direct {v10, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;-><init>(Ljava/util/LinkedHashMap;)V

    .line 1125
    .line 1126
    .line 1127
    invoke-static {v10}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v6

    .line 1131
    invoke-virtual {v9, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->e(Ljava/util/List;)V

    .line 1132
    .line 1133
    .line 1134
    :cond_23
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->i()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v6

    .line 1138
    if-eqz v6, :cond_26

    .line 1139
    .line 1140
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v9

    .line 1144
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v9

    .line 1148
    if-eqz v9, :cond_24

    .line 1149
    .line 1150
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v12

    .line 1154
    goto :goto_11

    .line 1155
    :cond_24
    move-object v12, v1

    .line 1156
    :goto_11
    if-nez v12, :cond_25

    .line 1157
    .line 1158
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v9

    .line 1162
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v9

    .line 1166
    if-eqz v9, :cond_25

    .line 1167
    .line 1168
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1169
    .line 1170
    invoke-direct {v10, v1, v1, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v9, v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 1174
    .line 1175
    .line 1176
    :cond_25
    filled-new-array {v8}, [Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v1

    .line 1180
    invoke-static {v6, v1, v2}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v1

    .line 1184
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v2

    .line 1192
    if-eqz v2, :cond_26

    .line 1193
    .line 1194
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v2

    .line 1198
    if-eqz v2, :cond_26

    .line 1199
    .line 1200
    new-instance v6, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;

    .line 1201
    .line 1202
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;

    .line 1203
    .line 1204
    invoke-static {v3, v1}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v3

    .line 1208
    check-cast v3, Ljava/lang/String;

    .line 1209
    .line 1210
    invoke-static {v5, v1}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v8

    .line 1214
    check-cast v8, Ljava/lang/String;

    .line 1215
    .line 1216
    const/4 v13, 0x2

    .line 1217
    invoke-static {v13, v1}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    check-cast v1, Ljava/lang/String;

    .line 1222
    .line 1223
    const/16 v9, 0x11

    .line 1224
    .line 1225
    invoke-direct {v7, v9, v3, v8, v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-static {v7}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v12

    .line 1232
    const/4 v14, 0x0

    .line 1233
    const/16 v15, 0x1ef

    .line 1234
    .line 1235
    const/4 v10, 0x0

    .line 1236
    const/4 v11, 0x0

    .line 1237
    const/4 v13, 0x0

    .line 1238
    invoke-static/range {v10 .. v15}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/LinkedHashMap;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    invoke-direct {v6, v1, v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;-><init>(Ljava/util/LinkedHashMap;I)V

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v6}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    invoke-virtual {v2, v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->f(Ljava/util/List;)V

    .line 1250
    .line 1251
    .line 1252
    :cond_26
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->b()Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    if-eqz v1, :cond_27

    .line 1257
    .line 1258
    invoke-static {v1}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v1

    .line 1262
    invoke-virtual {v4, v1}, Lsu/happ/proxyutility/dto/ServerConfig;->j(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    :cond_27
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->p()Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    if-eqz v0, :cond_29

    .line 1270
    .line 1271
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    if-eqz v1, :cond_28

    .line 1276
    .line 1277
    new-instance v1, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 1278
    .line 1279
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 1280
    .line 1281
    .line 1282
    goto :goto_12

    .line 1283
    :cond_28
    new-instance v1, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 1284
    .line 1285
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 1286
    .line 1287
    .line 1288
    :goto_12
    invoke-virtual {v4, v1}, Lsu/happ/proxyutility/dto/ServerConfig;->l(Lsu/happ/proxyutility/dto/ServerConfig$Meta;)V

    .line 1289
    .line 1290
    .line 1291
    :cond_29
    new-instance v0, Lj83;

    .line 1292
    .line 1293
    invoke-direct {v0, v4}, Lj83;-><init>(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 1294
    .line 1295
    .line 1296
    return-object v0

    .line 1297
    :cond_2a
    :goto_13
    new-instance v0, Lq83;

    .line 1298
    .line 1299
    invoke-direct {v0, v5}, Lq83;-><init>(Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    return-object v0

    .line 1303
    :cond_2b
    :goto_14
    new-instance v0, Lq83;

    .line 1304
    .line 1305
    invoke-direct {v0, v5}, Lq83;-><init>(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    return-object v0

    .line 1309
    :cond_2c
    throw v0

    .line 1310
    :cond_2d
    :goto_15
    new-instance v0, Lq83;

    .line 1311
    .line 1312
    invoke-direct {v0, v5}, Lq83;-><init>(Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    return-object v0
.end method

.method public final g(Lsu/happ/proxyutility/dto/ServerConfig;)Ljava/lang/String;
    .locals 12

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
    :goto_0
    return-object v0

    .line 17
    :cond_1
    new-instance v2, Lsu/happ/proxyutility/dto/VmessQRCode;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v2, v3}, Lsu/happ/proxyutility/dto/VmessQRCode;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/VmessQRCode;->P()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->J(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v4, v5

    .line 46
    :goto_1
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->L(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->g()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    :cond_3
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->u(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->h()Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->I(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->d()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-nez v4, :cond_4

    .line 75
    .line 76
    move-object v4, v0

    .line 77
    :cond_4
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->C(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/VmessQRCode;->w()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->l()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;

    .line 100
    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;->c()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-eqz v4, :cond_5

    .line 108
    .line 109
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;->d()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-nez v4, :cond_7

    .line 122
    .line 123
    :cond_5
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-eqz v4, :cond_6

    .line 128
    .line 129
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->j()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    goto :goto_2

    .line 134
    :cond_6
    move-object v4, v5

    .line 135
    :cond_7
    :goto_2
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->K(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->D(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->h()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->N(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    if-eqz v4, :cond_8

    .line 161
    .line 162
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->h()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    goto :goto_3

    .line 167
    :cond_8
    move-object v4, v5

    .line 168
    :goto_3
    if-nez v4, :cond_9

    .line 169
    .line 170
    move-object v4, v0

    .line 171
    :cond_9
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->M(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sget-object v4, Lss8;->a:Lss8;

    .line 175
    .line 176
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    if-eqz v4, :cond_a

    .line 181
    .line 182
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->b()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-eqz v6, :cond_a

    .line 187
    .line 188
    const/4 v10, 0x0

    .line 189
    const/16 v11, 0x3f

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const/4 v9, 0x0

    .line 194
    invoke-static/range {v6 .. v11}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    goto :goto_4

    .line 199
    :cond_a
    move-object v4, v5

    .line 200
    :goto_4
    if-eqz v4, :cond_b

    .line 201
    .line 202
    const-string v6, " "

    .line 203
    .line 204
    invoke-static {v4, v6, v0, v3}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    goto :goto_5

    .line 209
    :cond_b
    move-object v4, v5

    .line 210
    :goto_5
    if-nez v4, :cond_c

    .line 211
    .line 212
    move-object v4, v0

    .line 213
    :cond_c
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/VmessQRCode;->x(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    if-eqz v4, :cond_d

    .line 221
    .line 222
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->d()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    goto :goto_6

    .line 227
    :cond_d
    move-object v4, v5

    .line 228
    :goto_6
    if-nez v4, :cond_e

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_e
    move-object v0, v4

    .line 232
    :goto_7
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->z(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-eqz v0, :cond_f

    .line 240
    .line 241
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->f()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    goto :goto_8

    .line 246
    :cond_f
    move-object v0, v5

    .line 247
    :goto_8
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->H(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_10

    .line 255
    .line 256
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->k()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    goto :goto_9

    .line 261
    :cond_10
    move-object v0, v5

    .line 262
    :goto_9
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->G(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const-string v1, ","

    .line 270
    .line 271
    if-eqz v0, :cond_12

    .line 272
    .line 273
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-eqz v0, :cond_12

    .line 278
    .line 279
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->b()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-eqz v0, :cond_11

    .line 284
    .line 285
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;

    .line 290
    .line 291
    if-eqz v0, :cond_11

    .line 292
    .line 293
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;->c()Ljava/util/Map;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    goto :goto_a

    .line 298
    :cond_11
    move-object v0, v5

    .line 299
    :goto_a
    if-eqz v0, :cond_12

    .line 300
    .line 301
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->e(Ljava/util/Map;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->k(Ljava/util/Map;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->g(Ljava/util/Map;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v8, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->A(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_12
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-eqz v0, :cond_14

    .line 355
    .line 356
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    if-eqz v0, :cond_14

    .line 361
    .line 362
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->c()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    if-eqz v0, :cond_13

    .line 367
    .line 368
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;

    .line 373
    .line 374
    if-eqz v0, :cond_13

    .line 375
    .line 376
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;->a()Ljava/util/Map;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-eqz v0, :cond_13

    .line 381
    .line 382
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;->b(Ljava/util/Map;)Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    if-eqz v0, :cond_13

    .line 387
    .line 388
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    move-object v5, v0

    .line 393
    check-cast v5, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;

    .line 394
    .line 395
    :cond_13
    if-eqz v5, :cond_14

    .line 396
    .line 397
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->b()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->c()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->a()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    new-instance v6, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/VmessQRCode;->E(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    :cond_14
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerConfig;->b()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    if-eqz p1, :cond_15

    .line 441
    .line 442
    invoke-static {p1}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {v2, p1}, Lsu/happ/proxyutility/dto/VmessQRCode;->v(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    :cond_15
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    if-eqz p1, :cond_18

    .line 454
    .line 455
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    if-eqz p1, :cond_18

    .line 460
    .line 461
    sget-object v0, Lyw2;->c:Lcom/google/gson/a;

    .line 462
    .line 463
    invoke-virtual {v0, p1}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    :try_start_0
    const-string v0, "UTF-8"

    .line 468
    .line 469
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 473
    goto :goto_b

    .line 474
    :catchall_0
    move-exception v0

    .line 475
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 476
    .line 477
    if-nez v1, :cond_17

    .line 478
    .line 479
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 480
    .line 481
    if-nez v1, :cond_17

    .line 482
    .line 483
    new-instance v1, Lrj6;

    .line 484
    .line 485
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 486
    .line 487
    .line 488
    move-object v0, v1

    .line 489
    :goto_b
    nop

    .line 490
    instance-of v1, v0, Lrj6;

    .line 491
    .line 492
    if-eqz v1, :cond_16

    .line 493
    .line 494
    goto :goto_c

    .line 495
    :cond_16
    move-object p1, v0

    .line 496
    :goto_c
    check-cast p1, Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {v2, p1}, Lsu/happ/proxyutility/dto/VmessQRCode;->y(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    goto :goto_d

    .line 502
    :cond_17
    throw v0

    .line 503
    :cond_18
    :goto_d
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->l()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    if-eqz p0, :cond_19

    .line 508
    .line 509
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    check-cast p1, Ljava/lang/String;

    .line 514
    .line 515
    invoke-virtual {v2, p1}, Lsu/happ/proxyutility/dto/VmessQRCode;->O(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    const/4 p1, 0x1

    .line 519
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    check-cast p1, Ljava/lang/String;

    .line 524
    .line 525
    invoke-virtual {v2, p1}, Lsu/happ/proxyutility/dto/VmessQRCode;->B(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    const/4 p1, 0x2

    .line 529
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    check-cast p0, Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v2, p0}, Lsu/happ/proxyutility/dto/VmessQRCode;->F(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :cond_19
    sget-object p0, Lyw2;->b:Lcom/google/gson/a;

    .line 539
    .line 540
    invoke-virtual {p0, v2}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    sget-object p1, Lss8;->a:Lss8;

    .line 545
    .line 546
    invoke-static {p0}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    return-object p0
.end method

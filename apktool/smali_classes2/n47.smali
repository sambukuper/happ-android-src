.class public final Ln47;
.super Li47;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public final b(Ljava/lang/String;)Lx83;
    .locals 17

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lss8;->a:Lss8;

    .line 5
    .line 6
    invoke-static/range {p1 .. p1}, Lss8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lsu/happ/proxyutility/dto/ServerConfig;->Companion:Lsu/happ/proxyutility/dto/ServerConfig$Companion;

    .line 15
    .line 16
    sget-object v3, Lsu/happ/proxyutility/dto/enums/EConfigType;->VLESS:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lsu/happ/proxyutility/dto/ServerConfig$Companion;->a(Lsu/happ/proxyutility/dto/enums/EConfigType;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_16

    .line 30
    .line 31
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_0
    invoke-static {v0}, Lwl7;->E(Landroid/net/Uri;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v5, ""

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    move-object v3, v5

    .line 48
    :cond_1
    invoke-static {v3}, Li47;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    invoke-static {v0}, Lx79;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_2
    invoke-virtual {v2, v3}, Lsu/happ/proxyutility/dto/ServerConfig;->m(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v6, 0x6

    .line 70
    const/4 v7, 0x0

    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    if-eqz v3, :cond_8

    .line 74
    .line 75
    invoke-static {v0}, Lx79;->b(Landroid/net/Uri;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {v3, v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->m(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/net/Uri;->getPort()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v3, v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->s(Ljava/lang/Integer;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    if-nez v8, :cond_3

    .line 98
    .line 99
    move-object v8, v5

    .line 100
    :cond_3
    invoke-virtual {v3, v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->q(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v8, "encryption"

    .line 104
    .line 105
    invoke-static {v0, v8, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const-string v9, "none"

    .line 110
    .line 111
    if-nez v8, :cond_4

    .line 112
    .line 113
    move-object v8, v9

    .line 114
    :cond_4
    invoke-virtual {v3, v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->o(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-string v8, "flow"

    .line 118
    .line 119
    invoke-static {v0, v8, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    if-eqz v8, :cond_6

    .line 124
    .line 125
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_5

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_5
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-nez v9, :cond_6

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    :goto_0
    move-object/from16 v8, v16

    .line 140
    .line 141
    :goto_1
    if-nez v8, :cond_7

    .line 142
    .line 143
    move-object v8, v5

    .line 144
    :cond_7
    invoke-virtual {v3, v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->p(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_8
    invoke-static {v4, v0}, Li47;->f(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    const-string v8, "security"

    .line 152
    .line 153
    invoke-static {v0, v8, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    if-nez v8, :cond_9

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_9
    move-object v5, v8

    .line 161
    :goto_2
    const-string v8, "sni"

    .line 162
    .line 163
    invoke-static {v0, v8, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    if-nez v8, :cond_a

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    move-object v3, v8

    .line 171
    :goto_3
    invoke-static {v0}, Li47;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    const-string v9, "alpn"

    .line 176
    .line 177
    invoke-static {v0, v9, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    const-string v9, "pbk"

    .line 182
    .line 183
    invoke-static {v0, v9, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    const-string v9, "sid"

    .line 188
    .line 189
    invoke-static {v0, v9, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    const-string v9, "spx"

    .line 194
    .line 195
    invoke-static {v0, v9, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    const-string v9, "pqv"

    .line 200
    .line 201
    invoke-static {v0, v9, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    const-string v9, "pcs"

    .line 206
    .line 207
    invoke-static {v0, v9, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    const-string v15, "pcn"

    .line 212
    .line 213
    invoke-static {v0, v15, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    if-nez v15, :cond_b

    .line 218
    .line 219
    const-string v15, "vcn"

    .line 220
    .line 221
    invoke-static {v0, v15, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    :cond_b
    move-object/from16 p0, v1

    .line 226
    .line 227
    const-string v1, "ech"

    .line 228
    .line 229
    invoke-static {v0, v1, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-nez v1, :cond_c

    .line 234
    .line 235
    const-string v1, "echcl"

    .line 236
    .line 237
    invoke-static {v0, v1, v7, v6}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    :cond_c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-object v7, v8

    .line 245
    move-object v8, v9

    .line 246
    move-object v9, v15

    .line 247
    move-object v15, v1

    .line 248
    move v1, v6

    .line 249
    move-object v6, v3

    .line 250
    invoke-static/range {v4 .. v15}, Lcb8;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    if-eqz v3, :cond_d

    .line 262
    .line 263
    invoke-static {v3, v0}, Li47;->d(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)V

    .line 264
    .line 265
    .line 266
    :cond_d
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    if-eqz v3, :cond_e

    .line 275
    .line 276
    invoke-static {v3, v0}, Li47;->e(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;Landroid/net/Uri;)V

    .line 277
    .line 278
    .line 279
    :cond_e
    invoke-static {v2, v0}, Li47;->c(Lsu/happ/proxyutility/dto/ServerConfig;Landroid/net/Uri;)V

    .line 280
    .line 281
    .line 282
    new-instance v3, Lkf3;

    .line 283
    .line 284
    const/4 v4, 0x1

    .line 285
    const/4 v5, 0x3

    .line 286
    invoke-direct {v3, v4, v5, v4}, Lif3;-><init>(III)V

    .line 287
    .line 288
    .line 289
    new-instance v5, Lhu;

    .line 290
    .line 291
    invoke-direct {v5, v3, v4}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 292
    .line 293
    .line 294
    new-instance v3, Lzo6;

    .line 295
    .line 296
    invoke-direct {v3, v0, v1}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 297
    .line 298
    .line 299
    invoke-static {v5, v3}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v1, Lka2;

    .line 304
    .line 305
    invoke-direct {v1, v0}, Lka2;-><init>(Lla2;)V

    .line 306
    .line 307
    .line 308
    :cond_f
    invoke-virtual {v1}, Lka2;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_12

    .line 313
    .line 314
    invoke-virtual {v1}, Lka2;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Ljava/lang/String;

    .line 319
    .line 320
    :try_start_0
    sget-object v3, Lyw2;->c:Lcom/google/gson/a;

    .line 321
    .line 322
    const-class v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 323
    .line 324
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    new-instance v5, Lyi8;

    .line 328
    .line 329
    invoke-direct {v5, v4}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v0, v5}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    goto :goto_4

    .line 337
    :catchall_0
    move-exception v0

    .line 338
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 339
    .line 340
    if-nez v3, :cond_11

    .line 341
    .line 342
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 343
    .line 344
    if-nez v3, :cond_11

    .line 345
    .line 346
    new-instance v3, Lrj6;

    .line 347
    .line 348
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 349
    .line 350
    .line 351
    move-object v0, v3

    .line 352
    :goto_4
    nop

    .line 353
    instance-of v3, v0, Lrj6;

    .line 354
    .line 355
    if-eqz v3, :cond_10

    .line 356
    .line 357
    move-object/from16 v0, v16

    .line 358
    .line 359
    :cond_10
    if-eqz v0, :cond_f

    .line 360
    .line 361
    move-object/from16 v16, v0

    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_11
    throw v0

    .line 365
    :cond_12
    :goto_5
    move-object/from16 v0, v16

    .line 366
    .line 367
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 368
    .line 369
    if-eqz v0, :cond_13

    .line 370
    .line 371
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    if-eqz v1, :cond_13

    .line 380
    .line 381
    invoke-virtual {v1, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 382
    .line 383
    .line 384
    :cond_13
    invoke-static/range {p0 .. p0}, Li47;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    if-eqz v0, :cond_15

    .line 389
    .line 390
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    if-eqz v1, :cond_14

    .line 395
    .line 396
    new-instance v1, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 397
    .line 398
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_14
    new-instance v1, Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 403
    .line 404
    invoke-direct {v1, v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    :goto_6
    invoke-virtual {v2, v1}, Lsu/happ/proxyutility/dto/ServerConfig;->l(Lsu/happ/proxyutility/dto/ServerConfig$Meta;)V

    .line 408
    .line 409
    .line 410
    :cond_15
    new-instance v0, Lj83;

    .line 411
    .line 412
    invoke-direct {v0, v2}, Lj83;-><init>(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :cond_16
    :goto_7
    new-instance v0, Lq83;

    .line 417
    .line 418
    const-string v1, "vless"

    .line 419
    .line 420
    invoke-direct {v0, v1}, Lq83;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
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
    sget-object v7, Lsu/happ/proxyutility/dto/enums/EConfigType;->VLESS:Lsu/happ/proxyutility/dto/enums/EConfigType;

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
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v5, 0x0

    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->c()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-nez v4, :cond_5

    .line 98
    .line 99
    :cond_3
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz v4, :cond_4

    .line 104
    .line 105
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->l()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;

    .line 116
    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean;->c()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    if-eqz v4, :cond_4

    .line 124
    .line 125
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;

    .line 130
    .line 131
    if-eqz v4, :cond_4

    .line 132
    .line 133
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;->b()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    goto :goto_1

    .line 138
    :cond_4
    const/4 v4, 0x0

    .line 139
    :cond_5
    :goto_1
    if-eqz v4, :cond_7

    .line 140
    .line 141
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-nez v8, :cond_6

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    const/4 v4, 0x0

    .line 149
    :goto_2
    if-eqz v4, :cond_7

    .line 150
    .line 151
    const-string v8, "flow"

    .line 152
    .line 153
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 154
    .line 155
    .line 156
    :cond_7
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->f()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const-string v8, "none"

    .line 161
    .line 162
    if-eqz v4, :cond_9

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->f()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-nez v4, :cond_a

    .line 176
    .line 177
    move-object v4, v1

    .line 178
    goto :goto_4

    .line 179
    :cond_9
    :goto_3
    move-object v4, v8

    .line 180
    :cond_a
    :goto_4
    const-string v9, "encryption"

    .line 181
    .line 182
    invoke-virtual {v3, v9, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->h()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    if-nez v9, :cond_b

    .line 194
    .line 195
    move-object v4, v8

    .line 196
    :cond_b
    const-string v9, "security"

    .line 197
    .line 198
    invoke-virtual {v3, v9, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-nez v4, :cond_c

    .line 206
    .line 207
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    :cond_c
    if-eqz v4, :cond_20

    .line 212
    .line 213
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->h()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    if-eqz v9, :cond_e

    .line 218
    .line 219
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    if-nez v10, :cond_d

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_d
    const/4 v9, 0x0

    .line 227
    :goto_5
    if-eqz v9, :cond_e

    .line 228
    .line 229
    const-string v10, "sni"

    .line 230
    .line 231
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 232
    .line 233
    .line 234
    :cond_e
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->b()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    if-eqz v11, :cond_10

    .line 239
    .line 240
    const/4 v15, 0x0

    .line 241
    const/16 v16, 0x3f

    .line 242
    .line 243
    const/4 v12, 0x0

    .line 244
    const/4 v13, 0x0

    .line 245
    const/4 v14, 0x0

    .line 246
    invoke-static/range {v11 .. v16}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-nez v10, :cond_f

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_f
    const/4 v9, 0x0

    .line 258
    :goto_6
    if-eqz v9, :cond_10

    .line 259
    .line 260
    const-string v10, "alpn"

    .line 261
    .line 262
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 263
    .line 264
    .line 265
    :cond_10
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->d()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    if-eqz v9, :cond_12

    .line 270
    .line 271
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    if-nez v10, :cond_11

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_11
    const/4 v9, 0x0

    .line 279
    :goto_7
    if-eqz v9, :cond_12

    .line 280
    .line 281
    const-string v10, "fp"

    .line 282
    .line 283
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 284
    .line 285
    .line 286
    :cond_12
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->c()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    if-eqz v9, :cond_14

    .line 291
    .line 292
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    if-nez v10, :cond_13

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_13
    const/4 v9, 0x0

    .line 300
    :goto_8
    if-eqz v9, :cond_14

    .line 301
    .line 302
    const-string v10, "ech"

    .line 303
    .line 304
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 305
    .line 306
    .line 307
    :cond_14
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->g()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    if-eqz v9, :cond_16

    .line 312
    .line 313
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 314
    .line 315
    .line 316
    move-result v10

    .line 317
    if-nez v10, :cond_15

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_15
    const/4 v9, 0x0

    .line 321
    :goto_9
    if-eqz v9, :cond_16

    .line 322
    .line 323
    const-string v10, "pbk"

    .line 324
    .line 325
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 326
    .line 327
    .line 328
    :cond_16
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->i()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    if-eqz v9, :cond_18

    .line 333
    .line 334
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    if-nez v10, :cond_17

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_17
    const/4 v9, 0x0

    .line 342
    :goto_a
    if-eqz v9, :cond_18

    .line 343
    .line 344
    const-string v10, "sid"

    .line 345
    .line 346
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 347
    .line 348
    .line 349
    :cond_18
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->j()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    if-eqz v9, :cond_1a

    .line 354
    .line 355
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-nez v10, :cond_19

    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_19
    const/4 v9, 0x0

    .line 363
    :goto_b
    if-eqz v9, :cond_1a

    .line 364
    .line 365
    const-string v10, "spx"

    .line 366
    .line 367
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 368
    .line 369
    .line 370
    :cond_1a
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->e()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    if-eqz v9, :cond_1c

    .line 375
    .line 376
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    if-nez v10, :cond_1b

    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_1b
    const/4 v9, 0x0

    .line 384
    :goto_c
    if-eqz v9, :cond_1c

    .line 385
    .line 386
    const-string v10, "pqv"

    .line 387
    .line 388
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 389
    .line 390
    .line 391
    :cond_1c
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->f()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v9

    .line 395
    if-eqz v9, :cond_1e

    .line 396
    .line 397
    invoke-static {v9}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    if-nez v10, :cond_1d

    .line 402
    .line 403
    goto :goto_d

    .line 404
    :cond_1d
    const/4 v9, 0x0

    .line 405
    :goto_d
    if-eqz v9, :cond_1e

    .line 406
    .line 407
    const-string v10, "pcs"

    .line 408
    .line 409
    invoke-virtual {v3, v10, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 410
    .line 411
    .line 412
    :cond_1e
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->k()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    if-eqz v4, :cond_20

    .line 417
    .line 418
    invoke-static {v4}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    if-nez v9, :cond_1f

    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_1f
    const/4 v4, 0x0

    .line 426
    :goto_e
    if-eqz v4, :cond_20

    .line 427
    .line 428
    const-string v9, "pcn"

    .line 429
    .line 430
    invoke-virtual {v3, v9, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 431
    .line 432
    .line 433
    :cond_20
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    if-nez v9, :cond_21

    .line 442
    .line 443
    sget-object v4, Lsu/happ/proxyutility/dto/XRayConfig;->Companion:Lsu/happ/proxyutility/dto/XRayConfig$Companion;

    .line 444
    .line 445
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {}, Lsu/happ/proxyutility/dto/XRayConfig;->a()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    :cond_21
    const-string v9, "type"

    .line 453
    .line 454
    invoke-virtual {v3, v9, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->l()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    const-string v9, "fm"

    .line 462
    .line 463
    if-eqz v4, :cond_38

    .line 464
    .line 465
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    sget-object v11, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->TCP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 470
    .line 471
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v11

    .line 475
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    const-string v12, "host"

    .line 480
    .line 481
    const/4 v13, 0x1

    .line 482
    if-eqz v11, :cond_24

    .line 483
    .line 484
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    check-cast v10, Ljava/lang/CharSequence;

    .line 489
    .line 490
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 491
    .line 492
    .line 493
    move-result v11

    .line 494
    if-nez v11, :cond_22

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_22
    move-object v8, v10

    .line 498
    :goto_f
    check-cast v8, Ljava/lang/String;

    .line 499
    .line 500
    const-string v10, "headerType"

    .line 501
    .line 502
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 503
    .line 504
    .line 505
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    move-object v8, v4

    .line 510
    check-cast v8, Ljava/lang/String;

    .line 511
    .line 512
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    if-nez v8, :cond_23

    .line 517
    .line 518
    goto :goto_10

    .line 519
    :cond_23
    const/4 v4, 0x0

    .line 520
    :goto_10
    check-cast v4, Ljava/lang/String;

    .line 521
    .line 522
    if-eqz v4, :cond_38

    .line 523
    .line 524
    invoke-virtual {v3, v12, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 525
    .line 526
    .line 527
    goto/16 :goto_1a

    .line 528
    .line 529
    :cond_24
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->KCP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 530
    .line 531
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    invoke-static {v10, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v8

    .line 539
    if-eqz v8, :cond_27

    .line 540
    .line 541
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    if-eqz v4, :cond_25

    .line 546
    .line 547
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    if-eqz v4, :cond_25

    .line 552
    .line 553
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    if-eqz v4, :cond_25

    .line 558
    .line 559
    sget-object v8, Lyw2;->c:Lcom/google/gson/a;

    .line 560
    .line 561
    invoke-virtual {v8, v4}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-virtual {v3, v9, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 566
    .line 567
    .line 568
    :cond_25
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->f()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    if-eqz v4, :cond_38

    .line 573
    .line 574
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    if-eqz v4, :cond_38

    .line 579
    .line 580
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->e()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    if-eqz v4, :cond_38

    .line 585
    .line 586
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;->d()I

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v8

    .line 594
    const-string v10, "mtu"

    .line 595
    .line 596
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;->f()I

    .line 600
    .line 601
    .line 602
    move-result v8

    .line 603
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    const-string v10, "tti"

    .line 608
    .line 609
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;->a()Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    if-eqz v8, :cond_26

    .line 617
    .line 618
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 619
    .line 620
    .line 621
    move-result v8

    .line 622
    const-string v10, "cwndMultiplier"

    .line 623
    .line 624
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v8

    .line 628
    invoke-virtual {v3, v10, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 629
    .line 630
    .line 631
    :cond_26
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;->c()Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v4

    .line 635
    if-eqz v4, :cond_38

    .line 636
    .line 637
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    const-string v8, "maxSendingWindow"

    .line 642
    .line 643
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 648
    .line 649
    .line 650
    goto/16 :goto_1a

    .line 651
    .line 652
    :cond_27
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->WS:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 653
    .line 654
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    invoke-static {v10, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v8

    .line 662
    const/4 v11, 0x3

    .line 663
    const-string v14, "path"

    .line 664
    .line 665
    const/4 v15, 0x2

    .line 666
    if-nez v8, :cond_32

    .line 667
    .line 668
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->HTTP_UPGRADE:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 669
    .line 670
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    invoke-static {v10, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v8

    .line 678
    if-eqz v8, :cond_28

    .line 679
    .line 680
    goto/16 :goto_16

    .line 681
    .line 682
    :cond_28
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->SPLIT_HTTP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 683
    .line 684
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    invoke-static {v10, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v8

    .line 692
    const-string v6, "mode"

    .line 693
    .line 694
    if-nez v8, :cond_2a

    .line 695
    .line 696
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->XHTTP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 697
    .line 698
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v8

    .line 702
    invoke-static {v10, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v8

    .line 706
    if-eqz v8, :cond_29

    .line 707
    .line 708
    goto :goto_11

    .line 709
    :cond_29
    sget-object v8, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->GRPC:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    .line 710
    .line 711
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v8

    .line 715
    invoke-static {v10, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v8

    .line 719
    if-eqz v8, :cond_38

    .line 720
    .line 721
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    check-cast v8, Ljava/lang/String;

    .line 726
    .line 727
    invoke-virtual {v3, v6, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 728
    .line 729
    .line 730
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    check-cast v6, Ljava/lang/String;

    .line 735
    .line 736
    const-string v8, "authority"

    .line 737
    .line 738
    invoke-virtual {v3, v8, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 739
    .line 740
    .line 741
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    check-cast v4, Ljava/lang/String;

    .line 746
    .line 747
    const-string v6, "serviceName"

    .line 748
    .line 749
    invoke-virtual {v3, v6, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 750
    .line 751
    .line 752
    goto/16 :goto_1a

    .line 753
    .line 754
    :cond_2a
    :goto_11
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    move-object v10, v8

    .line 759
    check-cast v10, Ljava/lang/String;

    .line 760
    .line 761
    invoke-static {v10}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 762
    .line 763
    .line 764
    move-result v10

    .line 765
    if-nez v10, :cond_2b

    .line 766
    .line 767
    goto :goto_12

    .line 768
    :cond_2b
    const/4 v8, 0x0

    .line 769
    :goto_12
    check-cast v8, Ljava/lang/String;

    .line 770
    .line 771
    if-eqz v8, :cond_2c

    .line 772
    .line 773
    invoke-virtual {v3, v6, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 774
    .line 775
    .line 776
    :cond_2c
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v6

    .line 780
    move-object v8, v6

    .line 781
    check-cast v8, Ljava/lang/String;

    .line 782
    .line 783
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 784
    .line 785
    .line 786
    move-result v8

    .line 787
    if-nez v8, :cond_2d

    .line 788
    .line 789
    goto :goto_13

    .line 790
    :cond_2d
    const/4 v6, 0x0

    .line 791
    :goto_13
    check-cast v6, Ljava/lang/String;

    .line 792
    .line 793
    if-eqz v6, :cond_2e

    .line 794
    .line 795
    invoke-virtual {v3, v12, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 796
    .line 797
    .line 798
    :cond_2e
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    move-object v8, v6

    .line 803
    check-cast v8, Ljava/lang/String;

    .line 804
    .line 805
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 806
    .line 807
    .line 808
    move-result v8

    .line 809
    if-nez v8, :cond_2f

    .line 810
    .line 811
    goto :goto_14

    .line 812
    :cond_2f
    const/4 v6, 0x0

    .line 813
    :goto_14
    check-cast v6, Ljava/lang/String;

    .line 814
    .line 815
    if-eqz v6, :cond_30

    .line 816
    .line 817
    invoke-virtual {v3, v14, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 818
    .line 819
    .line 820
    :cond_30
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    move-object v6, v4

    .line 825
    check-cast v6, Ljava/lang/String;

    .line 826
    .line 827
    invoke-static {v6}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    if-nez v6, :cond_31

    .line 832
    .line 833
    goto :goto_15

    .line 834
    :cond_31
    const/4 v4, 0x0

    .line 835
    :goto_15
    check-cast v4, Ljava/lang/String;

    .line 836
    .line 837
    if-eqz v4, :cond_38

    .line 838
    .line 839
    const-string v6, "extra"

    .line 840
    .line 841
    invoke-virtual {v3, v6, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 842
    .line 843
    .line 844
    goto :goto_1a

    .line 845
    :cond_32
    :goto_16
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    move-object v8, v6

    .line 850
    check-cast v8, Ljava/lang/String;

    .line 851
    .line 852
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    if-nez v8, :cond_33

    .line 857
    .line 858
    goto :goto_17

    .line 859
    :cond_33
    const/4 v6, 0x0

    .line 860
    :goto_17
    check-cast v6, Ljava/lang/String;

    .line 861
    .line 862
    if-eqz v6, :cond_34

    .line 863
    .line 864
    invoke-virtual {v3, v12, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 865
    .line 866
    .line 867
    :cond_34
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v6

    .line 871
    move-object v8, v6

    .line 872
    check-cast v8, Ljava/lang/String;

    .line 873
    .line 874
    invoke-static {v8}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    if-nez v8, :cond_35

    .line 879
    .line 880
    goto :goto_18

    .line 881
    :cond_35
    const/4 v6, 0x0

    .line 882
    :goto_18
    check-cast v6, Ljava/lang/String;

    .line 883
    .line 884
    if-eqz v6, :cond_36

    .line 885
    .line 886
    invoke-virtual {v3, v14, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 887
    .line 888
    .line 889
    :cond_36
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    move-object v6, v4

    .line 894
    check-cast v6, Ljava/lang/String;

    .line 895
    .line 896
    invoke-static {v6}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 897
    .line 898
    .line 899
    move-result v6

    .line 900
    if-nez v6, :cond_37

    .line 901
    .line 902
    goto :goto_19

    .line 903
    :cond_37
    const/4 v4, 0x0

    .line 904
    :goto_19
    check-cast v4, Ljava/lang/String;

    .line 905
    .line 906
    if-eqz v4, :cond_38

    .line 907
    .line 908
    const-string v6, "headers"

    .line 909
    .line 910
    invoke-virtual {v3, v6, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 911
    .line 912
    .line 913
    :cond_38
    :goto_1a
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    const-string v6, ","

    .line 918
    .line 919
    if-eqz v4, :cond_3a

    .line 920
    .line 921
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    if-eqz v4, :cond_3a

    .line 926
    .line 927
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->b()Ljava/util/List;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    if-eqz v4, :cond_39

    .line 932
    .line 933
    invoke-static {v4}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v4

    .line 937
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;

    .line 938
    .line 939
    if-eqz v4, :cond_39

    .line 940
    .line 941
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;->c()Ljava/util/Map;

    .line 942
    .line 943
    .line 944
    move-result-object v4

    .line 945
    goto :goto_1b

    .line 946
    :cond_39
    const/4 v4, 0x0

    .line 947
    :goto_1b
    if-eqz v4, :cond_3a

    .line 948
    .line 949
    invoke-static {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->e(Ljava/util/Map;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v8

    .line 953
    invoke-static {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v10

    .line 957
    invoke-static {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->k(Ljava/util/Map;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v11

    .line 961
    invoke-static {v4}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->g(Ljava/util/Map;)Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v4

    .line 965
    new-instance v12, Ljava/lang/StringBuilder;

    .line 966
    .line 967
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 989
    .line 990
    .line 991
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v4

    .line 995
    const-string v8, "fragment"

    .line 996
    .line 997
    invoke-virtual {v3, v8, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 998
    .line 999
    .line 1000
    :cond_3a
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    if-eqz v0, :cond_3c

    .line 1005
    .line 1006
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    if-eqz v0, :cond_3c

    .line 1011
    .line 1012
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->c()Ljava/util/List;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    if-eqz v0, :cond_3b

    .line 1017
    .line 1018
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;

    .line 1023
    .line 1024
    if-eqz v0, :cond_3b

    .line 1025
    .line 1026
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;->a()Ljava/util/Map;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    if-eqz v0, :cond_3b

    .line 1031
    .line 1032
    invoke-static {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;->b(Ljava/util/Map;)Ljava/util/List;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    if-eqz v0, :cond_3b

    .line 1037
    .line 1038
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;

    .line 1043
    .line 1044
    goto :goto_1c

    .line 1045
    :cond_3b
    const/4 v0, 0x0

    .line 1046
    :goto_1c
    if-eqz v0, :cond_3c

    .line 1047
    .line 1048
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->b()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->c()Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v8

    .line 1056
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;->a()Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    const-string v4, "noises"

    .line 1085
    .line 1086
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1087
    .line 1088
    .line 1089
    :cond_3c
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->b()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    if-eqz v0, :cond_3d

    .line 1094
    .line 1095
    const-string v4, "advancedfragment"

    .line 1096
    .line 1097
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1098
    .line 1099
    .line 1100
    :cond_3d
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    if-eqz v0, :cond_3e

    .line 1105
    .line 1106
    sget-object v2, Lyw2;->c:Lcom/google/gson/a;

    .line 1107
    .line 1108
    invoke-virtual {v2, v0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    invoke-virtual {v3, v9, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1113
    .line 1114
    .line 1115
    :cond_3e
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->e()Lsu/happ/proxyutility/dto/ServerConfig$Meta;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    if-eqz v0, :cond_3f

    .line 1120
    .line 1121
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig$Meta;->a()Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    goto :goto_1d

    .line 1126
    :cond_3f
    const/4 v0, 0x0

    .line 1127
    :goto_1d
    if-eqz v0, :cond_40

    .line 1128
    .line 1129
    invoke-static {v5, v0}, Lwl7;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    const-string v2, "?serverDescription="

    .line 1134
    .line 1135
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v6

    .line 1139
    goto :goto_1e

    .line 1140
    :cond_40
    const/4 v6, 0x0

    .line 1141
    :goto_1e
    if-nez v6, :cond_41

    .line 1142
    .line 1143
    move-object v6, v1

    .line 1144
    :cond_41
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v0

    .line 1148
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1149
    .line 1150
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/enums/EConfigType;->b()Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1182
    .line 1183
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1187
    .line 1188
    .line 1189
    const-string v2, "://"

    .line 1190
    .line 1191
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v2

    .line 1198
    invoke-static {v0, v2, v1, v5}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    return-object v0
.end method

.class public final synthetic Ld0;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Ld0;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lmo2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Ld0;->X:B

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x0

    .line 12
    sget-object v8, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->B()Lcl5;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v4, v2, Lcl5;->f:Loh7;

    .line 34
    .line 35
    iget-object v9, v2, Lcl5;->g:Lh76;

    .line 36
    .line 37
    iget-object v10, v9, Lh76;->X:Loh7;

    .line 38
    .line 39
    invoke-virtual {v10}, Loh7;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    check-cast v10, Llk5;

    .line 44
    .line 45
    iget-object v10, v10, Llk5;->c:Lj2;

    .line 46
    .line 47
    invoke-static {v10}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-virtual {v10}, Lgu;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    :cond_0
    move-object v11, v10

    .line 56
    check-cast v11, Lrw1;

    .line 57
    .line 58
    iget-object v12, v11, Lrw1;->Y:Ljava/util/Iterator;

    .line 59
    .line 60
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    if-eqz v12, :cond_1

    .line 65
    .line 66
    invoke-virtual {v11}, Lrw1;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    move-object v12, v11

    .line 71
    check-cast v12, Lpb3;

    .line 72
    .line 73
    iget-object v12, v12, Lpb3;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v12, Lsu/happ/proxyutility/dto/AppInfo;

    .line 76
    .line 77
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-static {v12, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move-object v11, v7

    .line 93
    :goto_0
    check-cast v11, Lpb3;

    .line 94
    .line 95
    if-eqz v11, :cond_2

    .line 96
    .line 97
    iget v10, v11, Lpb3;->a:I

    .line 98
    .line 99
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v10, v7

    .line 105
    :goto_1
    if-eqz v10, :cond_5

    .line 106
    .line 107
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget-object v9, v9, Lh76;->X:Loh7;

    .line 112
    .line 113
    invoke-virtual {v9}, Loh7;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    check-cast v9, Llk5;

    .line 118
    .line 119
    iget-object v9, v9, Llk5;->d:Lkm5;

    .line 120
    .line 121
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    iget-object v9, v9, Lkm5;->Z:Lll5;

    .line 126
    .line 127
    invoke-virtual {v9, v11}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_3

    .line 132
    .line 133
    new-instance v5, Lwq0;

    .line 134
    .line 135
    invoke-direct {v5, v1, v10, v6}, Lwq0;-><init>(Ljava/lang/Object;IB)V

    .line 136
    .line 137
    .line 138
    invoke-static {v4, v5}, Lu15;->S(Loh7;Lgn2;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    move-object v11, v9

    .line 150
    check-cast v11, Llk5;

    .line 151
    .line 152
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v12, v11, Llk5;->d:Lkm5;

    .line 156
    .line 157
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    invoke-virtual {v12, v13}, Lkm5;->b(Ljava/lang/String;)Lkm5;

    .line 162
    .line 163
    .line 164
    move-result-object v15

    .line 165
    iget-object v12, v11, Llk5;->c:Lj2;

    .line 166
    .line 167
    invoke-virtual {v12}, Lj2;->c()Lqm5;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v12, v10}, Lqm5;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    check-cast v13, Lsu/happ/proxyutility/dto/AppInfo;

    .line 176
    .line 177
    invoke-static {v13, v5}, Lsu/happ/proxyutility/dto/AppInfo;->a(Lsu/happ/proxyutility/dto/AppInfo;I)Lsu/happ/proxyutility/dto/AppInfo;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    invoke-virtual {v12, v10, v13}, Lqm5;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Lqm5;->c()Lj2;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    const/16 v18, 0x33

    .line 191
    .line 192
    const/4 v12, 0x0

    .line 193
    const/4 v13, 0x0

    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    invoke-static/range {v11 .. v18}, Llk5;->a(Llk5;Ljk5;Ljava/lang/String;Lj2;Lkm5;Lj2;ZI)Llk5;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v4, v9, v11}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_4

    .line 205
    .line 206
    :goto_2
    sget v1, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->V0:I

    .line 207
    .line 208
    iget-object v1, v0, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->T0:Lvz7;

    .line 209
    .line 210
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Lik5;

    .line 215
    .line 216
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;->B()Lcl5;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v0, v0, Lcl5;->g:Lh76;

    .line 221
    .line 222
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 223
    .line 224
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Llk5;

    .line 229
    .line 230
    iget-object v0, v0, Llk5;->e:Lj2;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget-object v1, v1, Lik5;->e:Liv;

    .line 239
    .line 240
    invoke-virtual {v1, v0}, Liv;->b(Ljava/util/List;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, Lzw8;->a(Lxw8;)Ltu0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v1, Lyk5;

    .line 248
    .line 249
    invoke-direct {v1, v2, v7, v6}, Lyk5;-><init>(Lcl5;Lq51;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v7, v1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 253
    .line 254
    .line 255
    :cond_5
    return-object v8

    .line 256
    :pswitch_0
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lag8;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_1
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Lds5;

    .line 269
    .line 270
    invoke-interface {v0, v1}, Lds5;->test(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_2
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lbx5;

    .line 282
    .line 283
    iget-object v0, v0, Lbx5;->a:Lyv3;

    .line 284
    .line 285
    invoke-interface {v0, v1}, Llw3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :pswitch_3
    check-cast v1, Lq51;

    .line 291
    .line 292
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Lo35;

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Lo35;->b(Lq51;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    return-object v0

    .line 301
    :pswitch_4
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 302
    .line 303
    if-eqz v1, :cond_6

    .line 304
    .line 305
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    goto :goto_3

    .line 310
    :cond_6
    move-object v1, v7

    .line 311
    :goto_3
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 314
    .line 315
    sget v2, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 316
    .line 317
    iget-object v2, v0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 318
    .line 319
    invoke-static {v2}, Lys0;->z(Lg94;)Lu84;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    sget-object v3, Ltp1;->a:Lnf1;

    .line 324
    .line 325
    sget-object v3, Lye1;->Z:Lye1;

    .line 326
    .line 327
    new-instance v4, Lqk4;

    .line 328
    .line 329
    invoke-direct {v4, v1, v0, v7}, Lqk4;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v2, v3, v4, v6}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 333
    .line 334
    .line 335
    return-object v8

    .line 336
    :pswitch_5
    check-cast v1, Lfh4;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, Lci4;

    .line 344
    .line 345
    invoke-virtual {v0, v1}, Lci4;->g(Lfh4;)V

    .line 346
    .line 347
    .line 348
    return-object v8

    .line 349
    :pswitch_6
    check-cast v1, Lfg4;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lth4;

    .line 357
    .line 358
    invoke-virtual {v0, v1}, Lth4;->f(Lfg4;)V

    .line 359
    .line 360
    .line 361
    return-object v8

    .line 362
    :pswitch_7
    check-cast v1, Lv15;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Lt44;

    .line 370
    .line 371
    invoke-virtual {v0, v1}, Lt44;->O(Lv15;)Ljava/util/ArrayList;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    return-object v0

    .line 376
    :pswitch_8
    check-cast v1, Lv15;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v0, Lt44;

    .line 384
    .line 385
    invoke-virtual {v0, v1}, Lt44;->N(Lv15;)Ljava/util/ArrayList;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    return-object v0

    .line 390
    :pswitch_9
    move-object v2, v1

    .line 391
    check-cast v2, Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 397
    .line 398
    move-object v3, v0

    .line 399
    check-cast v3, Lsu/happ/proxyutility/feature/language/LanguageActivitySettings;

    .line 400
    .line 401
    sget v0, Lsu/happ/proxyutility/feature/language/LanguageActivitySettings;->V0:I

    .line 402
    .line 403
    iget-object v0, v3, Lsu/happ/proxyutility/feature/language/LanguageActivitySettings;->R0:Ly5;

    .line 404
    .line 405
    invoke-virtual {v0}, Ly5;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    check-cast v0, Lr24;

    .line 410
    .line 411
    iget-object v4, v0, Lr24;->b:Loh7;

    .line 412
    .line 413
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    :cond_7
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    move-object v1, v0

    .line 421
    check-cast v1, Lp24;

    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    new-instance v1, Lp24;

    .line 427
    .line 428
    invoke-direct {v1, v2}, Lp24;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_7

    .line 436
    .line 437
    iget-object v0, v3, Lsu/happ/proxyutility/feature/language/LanguageActivitySettings;->S0:Lvz7;

    .line 438
    .line 439
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 444
    .line 445
    const-string v1, "pref_language"

    .line 446
    .line 447
    invoke-virtual {v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 448
    .line 449
    .line 450
    invoke-virtual {v3}, Lsu/happ/proxyutility/ui/BaseActivity;->y()V

    .line 451
    .line 452
    .line 453
    return-object v8

    .line 454
    :pswitch_a
    check-cast v1, Lx14;

    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Ly14;

    .line 462
    .line 463
    invoke-virtual {v0, v1}, Ly14;->R(Lx14;)Lmo8;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_b
    check-cast v1, Ljava/lang/Throwable;

    .line 469
    .line 470
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Lgm3;

    .line 473
    .line 474
    invoke-virtual {v0, v1}, Lgm3;->n(Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    return-object v8

    .line 478
    :pswitch_c
    check-cast v1, Ljava/util/Set;

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v0, Lfi3;

    .line 486
    .line 487
    iget-object v1, v0, Lfi3;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 490
    .line 491
    .line 492
    :try_start_0
    iget-object v0, v0, Lfi3;->c:Ljava/util/LinkedHashMap;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    check-cast v0, Ljava/lang/Iterable;

    .line 499
    .line 500
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 504
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 505
    .line 506
    .line 507
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-nez v1, :cond_8

    .line 516
    .line 517
    return-object v8

    .line 518
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    check-cast v0, Ly85;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    throw v7

    .line 528
    :catchall_0
    move-exception v0

    .line 529
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 530
    .line 531
    .line 532
    throw v0

    .line 533
    :pswitch_d
    check-cast v1, Lxa3;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, Lza3;

    .line 541
    .line 542
    invoke-virtual {v0, v1}, Lza3;->f(Lxa3;)V

    .line 543
    .line 544
    .line 545
    return-object v8

    .line 546
    :pswitch_e
    move-object v10, v1

    .line 547
    check-cast v10, Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Lz93;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-static {v10}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    if-eqz v1, :cond_a

    .line 572
    .line 573
    iget-object v2, v0, Lz93;->e:Loh7;

    .line 574
    .line 575
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    :cond_9
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    move-object v6, v5

    .line 583
    check-cast v6, Lq93;

    .line 584
    .line 585
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    iget-object v9, v6, Lq93;->c:Lm93;

    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const/16 v14, 0xe

    .line 592
    .line 593
    const/4 v11, 0x0

    .line 594
    const/4 v12, 0x0

    .line 595
    invoke-static/range {v9 .. v14}, Lm93;->a(Lm93;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/InboundAuthMode;Ljava/lang/String;Ljava/lang/String;I)Lm93;

    .line 596
    .line 597
    .line 598
    move-result-object v9

    .line 599
    invoke-static {v6, v7, v4, v9, v3}, Lq93;->a(Lq93;Lm93;ZLm93;I)Lq93;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    invoke-virtual {v2, v5, v6}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    if-eqz v5, :cond_9

    .line 608
    .line 609
    invoke-virtual {v0}, Lz93;->e()Lcom/tencent/mmkv/MMKV;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    const-string v4, "pref_http_port"

    .line 622
    .line 623
    invoke-virtual {v2, v4, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 624
    .line 625
    .line 626
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    new-instance v2, Lv93;

    .line 631
    .line 632
    const/4 v4, 0x5

    .line 633
    invoke-direct {v2, v0, v7, v4}, Lv93;-><init>(Lz93;Lq51;B)V

    .line 634
    .line 635
    .line 636
    invoke-static {v1, v7, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 637
    .line 638
    .line 639
    :cond_a
    return-object v8

    .line 640
    :pswitch_f
    move-object v10, v1

    .line 641
    check-cast v10, Ljava/lang/String;

    .line 642
    .line 643
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Lz93;

    .line 649
    .line 650
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    invoke-static {v10}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    if-eqz v1, :cond_c

    .line 666
    .line 667
    iget-object v2, v0, Lz93;->e:Loh7;

    .line 668
    .line 669
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    :cond_b
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    move-object v6, v5

    .line 677
    check-cast v6, Lq93;

    .line 678
    .line 679
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    iget-object v9, v6, Lq93;->a:Lm93;

    .line 683
    .line 684
    const/4 v13, 0x0

    .line 685
    const/16 v14, 0xe

    .line 686
    .line 687
    const/4 v11, 0x0

    .line 688
    const/4 v12, 0x0

    .line 689
    invoke-static/range {v9 .. v14}, Lm93;->a(Lm93;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/InboundAuthMode;Ljava/lang/String;Ljava/lang/String;I)Lm93;

    .line 690
    .line 691
    .line 692
    move-result-object v9

    .line 693
    const/4 v11, 0x6

    .line 694
    invoke-static {v6, v9, v4, v7, v11}, Lq93;->a(Lq93;Lm93;ZLm93;I)Lq93;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    invoke-virtual {v2, v5, v6}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    if-eqz v5, :cond_b

    .line 703
    .line 704
    invoke-virtual {v0}, Lz93;->e()Lcom/tencent/mmkv/MMKV;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 709
    .line 710
    .line 711
    move-result v1

    .line 712
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    const-string v4, "pref_socks_port"

    .line 717
    .line 718
    invoke-virtual {v2, v4, v1}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 719
    .line 720
    .line 721
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    new-instance v2, Lv93;

    .line 726
    .line 727
    const/16 v4, 0x9

    .line 728
    .line 729
    invoke-direct {v2, v0, v7, v4}, Lv93;-><init>(Lz93;Lq51;B)V

    .line 730
    .line 731
    .line 732
    invoke-static {v1, v7, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 733
    .line 734
    .line 735
    :cond_c
    return-object v8

    .line 736
    :pswitch_10
    check-cast v1, Ly24;

    .line 737
    .line 738
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v0, Lpx2;

    .line 741
    .line 742
    iget-object v0, v0, Lpx2;->c:Lrh5;

    .line 743
    .line 744
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    return-object v8

    .line 748
    :pswitch_11
    check-cast v1, Ljava/util/List;

    .line 749
    .line 750
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v0, Lht2;

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    :cond_d
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    if-eqz v2, :cond_f

    .line 769
    .line 770
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    check-cast v2, Lct2;

    .line 775
    .line 776
    instance-of v3, v2, Lws2;

    .line 777
    .line 778
    if-eqz v3, :cond_e

    .line 779
    .line 780
    invoke-virtual {v0, v7}, Lht2;->g(Ljava/util/ArrayList;)V

    .line 781
    .line 782
    .line 783
    goto :goto_4

    .line 784
    :cond_e
    instance-of v3, v2, Lat2;

    .line 785
    .line 786
    if-eqz v3, :cond_d

    .line 787
    .line 788
    iget-object v3, v0, Lht2;->g0:Lb71;

    .line 789
    .line 790
    new-instance v4, Ltk0;

    .line 791
    .line 792
    check-cast v2, Lat2;

    .line 793
    .line 794
    invoke-direct {v4, v2, v7, v6}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 795
    .line 796
    .line 797
    sget-object v2, Le71;->f0:Le71;

    .line 798
    .line 799
    invoke-static {v3, v7, v2, v4, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 800
    .line 801
    .line 802
    goto :goto_4

    .line 803
    :cond_f
    return-object v8

    .line 804
    :pswitch_12
    check-cast v1, Lyq2;

    .line 805
    .line 806
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v0, Ldr2;

    .line 812
    .line 813
    invoke-virtual {v0, v1}, Ldr2;->e(Lyq2;)V

    .line 814
    .line 815
    .line 816
    return-object v8

    .line 817
    :pswitch_13
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 818
    .line 819
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v0, Ll27;

    .line 829
    .line 830
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    iget-object v2, v0, Ll27;->f:Lh76;

    .line 834
    .line 835
    iget-object v2, v2, Lh76;->X:Loh7;

    .line 836
    .line 837
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    check-cast v2, Le27;

    .line 842
    .line 843
    iget-object v2, v2, Le27;->b:Lb83;

    .line 844
    .line 845
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 850
    .line 851
    .line 852
    move-result v6

    .line 853
    const/4 v9, -0x1

    .line 854
    if-eqz v6, :cond_11

    .line 855
    .line 856
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    check-cast v6, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 861
    .line 862
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v6

    .line 866
    invoke-static {v6, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v6

    .line 870
    if-eqz v6, :cond_10

    .line 871
    .line 872
    goto :goto_6

    .line 873
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 874
    .line 875
    goto :goto_5

    .line 876
    :cond_11
    move v4, v9

    .line 877
    :goto_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    if-le v4, v9, :cond_12

    .line 882
    .line 883
    goto :goto_7

    .line 884
    :cond_12
    move-object v1, v7

    .line 885
    :goto_7
    if-eqz v1, :cond_16

    .line 886
    .line 887
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v3

    .line 895
    move-object v9, v3

    .line 896
    check-cast v9, Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 897
    .line 898
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->e()Z

    .line 899
    .line 900
    .line 901
    move-result v3

    .line 902
    xor-int/lit8 v12, v3, 0x1

    .line 903
    .line 904
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 905
    .line 906
    .line 907
    move-result-object v13

    .line 908
    if-eqz v13, :cond_13

    .line 909
    .line 910
    invoke-virtual {v13}, Lsu/happ/proxyutility/dto/SubscriptionItem;->Z()Z

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    xor-int/lit8 v16, v3, 0x1

    .line 915
    .line 916
    const/16 v19, 0x0

    .line 917
    .line 918
    const v20, 0xffff7ff

    .line 919
    .line 920
    .line 921
    const-wide/16 v14, 0x0

    .line 922
    .line 923
    const/16 v17, 0x0

    .line 924
    .line 925
    const/16 v18, 0x0

    .line 926
    .line 927
    invoke-static/range {v13 .. v20}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    move-object v10, v3

    .line 932
    goto :goto_8

    .line 933
    :cond_13
    move-object v10, v7

    .line 934
    :goto_8
    const/4 v13, 0x0

    .line 935
    const/16 v14, 0x15

    .line 936
    .line 937
    const/4 v11, 0x0

    .line 938
    invoke-static/range {v9 .. v14}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->a(Lsu/happ/proxyutility/dto/ConfigGroupCache;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/util/ArrayList;ZZI)Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->d()Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 943
    .line 944
    .line 945
    move-result-object v4

    .line 946
    if-eqz v4, :cond_14

    .line 947
    .line 948
    sget-object v6, Lkw4;->a:Lkw4;

    .line 949
    .line 950
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v6

    .line 954
    invoke-static {v4, v6}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    goto :goto_9

    .line 958
    :cond_14
    iget-object v4, v0, Ll27;->b:Lvz7;

    .line 959
    .line 960
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v4

    .line 964
    check-cast v4, Lak7;

    .line 965
    .line 966
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->e()Z

    .line 967
    .line 968
    .line 969
    move-result v6

    .line 970
    invoke-virtual {v4, v6}, Lak7;->c(Z)V

    .line 971
    .line 972
    .line 973
    :goto_9
    iget-object v0, v0, Ll27;->e:Loh7;

    .line 974
    .line 975
    :cond_15
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v4

    .line 979
    move-object v6, v4

    .line 980
    check-cast v6, Le27;

    .line 981
    .line 982
    sget-object v9, Lec7;->Y:Lec7;

    .line 983
    .line 984
    invoke-virtual {v9}, Lec7;->c()Lqm5;

    .line 985
    .line 986
    .line 987
    move-result-object v9

    .line 988
    invoke-static {v2, v1}, Lwv0;->U0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 989
    .line 990
    .line 991
    move-result-object v10

    .line 992
    invoke-virtual {v9, v10}, Lqm5;->addAll(Ljava/util/Collection;)Z

    .line 993
    .line 994
    .line 995
    invoke-virtual {v9, v3}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    add-int/lit8 v10, v1, 0x1

    .line 999
    .line 1000
    invoke-static {v2, v10}, Lwv0;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v10

    .line 1004
    invoke-virtual {v9, v10}, Lqm5;->addAll(Ljava/util/Collection;)Z

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v9}, Lqm5;->c()Lj2;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v9

    .line 1011
    const/16 v10, 0xd

    .line 1012
    .line 1013
    invoke-static {v6, v9, v7, v7, v10}, Le27;->a(Le27;Lb83;Lkm5;Lc83;I)Le27;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v6

    .line 1017
    invoke-virtual {v0, v4, v6}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v4

    .line 1021
    if-eqz v4, :cond_15

    .line 1022
    .line 1023
    :cond_16
    return-object v8

    .line 1024
    :pswitch_14
    check-cast v1, Lz14;

    .line 1025
    .line 1026
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v0, Lvl1;

    .line 1032
    .line 1033
    new-instance v2, Lsl1;

    .line 1034
    .line 1035
    invoke-direct {v2, v0, v1}, Lsl1;-><init>(Lvl1;Lz14;)V

    .line 1036
    .line 1037
    .line 1038
    return-object v2

    .line 1039
    :pswitch_15
    check-cast v1, Lv15;

    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1042
    .line 1043
    .line 1044
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v0, Lvl1;

    .line 1047
    .line 1048
    invoke-virtual {v0, v1}, Lvl1;->C0(Lv15;)Laa7;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    return-object v0

    .line 1053
    :pswitch_16
    check-cast v1, Ljava/lang/String;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v0, Lwk1;

    .line 1061
    .line 1062
    invoke-virtual {v0, v1}, Lwk1;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    return-object v0

    .line 1067
    :pswitch_17
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v0, Lbx5;

    .line 1070
    .line 1071
    invoke-virtual {v0, v1}, Lbx5;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    check-cast v0, Lcd1;

    .line 1076
    .line 1077
    return-object v0

    .line 1078
    :pswitch_18
    check-cast v1, Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1081
    .line 1082
    .line 1083
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v0, Lqa0;

    .line 1086
    .line 1087
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    invoke-static {v1}, Lqa0;->a(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    return-object v0

    .line 1095
    :pswitch_19
    check-cast v1, Lsm0;

    .line 1096
    .line 1097
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v0, Lff;

    .line 1100
    .line 1101
    invoke-virtual {v0, v1}, Lff;->d(Lsm0;)V

    .line 1102
    .line 1103
    .line 1104
    return-object v8

    .line 1105
    :pswitch_1a
    check-cast v1, Lsm0;

    .line 1106
    .line 1107
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v0, Lff;

    .line 1110
    .line 1111
    invoke-virtual {v0, v1}, Lff;->d(Lsm0;)V

    .line 1112
    .line 1113
    .line 1114
    return-object v8

    .line 1115
    :pswitch_1b
    check-cast v1, Ljava/lang/Boolean;

    .line 1116
    .line 1117
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1122
    .line 1123
    check-cast v0, Lx0;

    .line 1124
    .line 1125
    iget-object v2, v0, Lx0;->G0:La05;

    .line 1126
    .line 1127
    if-eqz v1, :cond_17

    .line 1128
    .line 1129
    invoke-virtual {v0}, Lx0;->j1()V

    .line 1130
    .line 1131
    .line 1132
    goto/16 :goto_e

    .line 1133
    .line 1134
    :cond_17
    iget-object v1, v0, Lx0;->s0:Lxz4;

    .line 1135
    .line 1136
    if-eqz v1, :cond_1c

    .line 1137
    .line 1138
    iget-object v1, v2, La05;->c:[Ljava/lang/Object;

    .line 1139
    .line 1140
    iget-object v9, v2, La05;->a:[J

    .line 1141
    .line 1142
    array-length v10, v9

    .line 1143
    sub-int/2addr v10, v6

    .line 1144
    if-ltz v10, :cond_1b

    .line 1145
    .line 1146
    move v6, v4

    .line 1147
    :goto_a
    aget-wide v11, v9, v6

    .line 1148
    .line 1149
    not-long v13, v11

    .line 1150
    const/4 v15, 0x7

    .line 1151
    shl-long/2addr v13, v15

    .line 1152
    and-long/2addr v13, v11

    .line 1153
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    and-long/2addr v13, v15

    .line 1159
    cmp-long v13, v13, v15

    .line 1160
    .line 1161
    if-eqz v13, :cond_1a

    .line 1162
    .line 1163
    sub-int v13, v6, v10

    .line 1164
    .line 1165
    not-int v13, v13

    .line 1166
    ushr-int/lit8 v13, v13, 0x1f

    .line 1167
    .line 1168
    const/16 v14, 0x8

    .line 1169
    .line 1170
    rsub-int/lit8 v13, v13, 0x8

    .line 1171
    .line 1172
    move v15, v4

    .line 1173
    :goto_b
    if-ge v15, v13, :cond_19

    .line 1174
    .line 1175
    const-wide/16 v16, 0xff

    .line 1176
    .line 1177
    and-long v16, v11, v16

    .line 1178
    .line 1179
    const-wide/16 v18, 0x80

    .line 1180
    .line 1181
    cmp-long v16, v16, v18

    .line 1182
    .line 1183
    if-gez v16, :cond_18

    .line 1184
    .line 1185
    shl-int/lit8 v16, v6, 0x3

    .line 1186
    .line 1187
    add-int v16, v16, v15

    .line 1188
    .line 1189
    aget-object v16, v1, v16

    .line 1190
    .line 1191
    move-object/from16 v5, v16

    .line 1192
    .line 1193
    check-cast v5, Lft5;

    .line 1194
    .line 1195
    move/from16 p0, v14

    .line 1196
    .line 1197
    invoke-virtual {v0}, Ljx4;->M0()Lb71;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v14

    .line 1201
    move-object/from16 v16, v1

    .line 1202
    .line 1203
    new-instance v1, Lv0;

    .line 1204
    .line 1205
    invoke-direct {v1, v0, v5, v7, v4}, Lv0;-><init>(Lx0;Lft5;Lq51;B)V

    .line 1206
    .line 1207
    .line 1208
    invoke-static {v14, v7, v7, v1, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 1209
    .line 1210
    .line 1211
    goto :goto_c

    .line 1212
    :cond_18
    move-object/from16 v16, v1

    .line 1213
    .line 1214
    move/from16 p0, v14

    .line 1215
    .line 1216
    :goto_c
    shr-long v11, v11, p0

    .line 1217
    .line 1218
    add-int/lit8 v15, v15, 0x1

    .line 1219
    .line 1220
    move/from16 v14, p0

    .line 1221
    .line 1222
    move-object/from16 v1, v16

    .line 1223
    .line 1224
    const/4 v5, 0x1

    .line 1225
    goto :goto_b

    .line 1226
    :cond_19
    move-object/from16 v16, v1

    .line 1227
    .line 1228
    move v1, v14

    .line 1229
    if-ne v13, v1, :cond_1b

    .line 1230
    .line 1231
    goto :goto_d

    .line 1232
    :cond_1a
    move-object/from16 v16, v1

    .line 1233
    .line 1234
    :goto_d
    if-eq v6, v10, :cond_1b

    .line 1235
    .line 1236
    add-int/lit8 v6, v6, 0x1

    .line 1237
    .line 1238
    move-object/from16 v1, v16

    .line 1239
    .line 1240
    const/4 v5, 0x1

    .line 1241
    goto :goto_a

    .line 1242
    :cond_1b
    iget-object v1, v0, Lx0;->I0:Lft5;

    .line 1243
    .line 1244
    if-eqz v1, :cond_1c

    .line 1245
    .line 1246
    invoke-virtual {v0}, Ljx4;->M0()Lb71;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v4

    .line 1250
    new-instance v5, Lv0;

    .line 1251
    .line 1252
    const/4 v6, 0x1

    .line 1253
    invoke-direct {v5, v0, v1, v7, v6}, Lv0;-><init>(Lx0;Lft5;Lq51;B)V

    .line 1254
    .line 1255
    .line 1256
    invoke-static {v4, v7, v7, v5, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 1257
    .line 1258
    .line 1259
    :cond_1c
    invoke-virtual {v2}, La05;->a()V

    .line 1260
    .line 1261
    .line 1262
    iput-object v7, v0, Lx0;->I0:Lft5;

    .line 1263
    .line 1264
    invoke-virtual {v0}, Lx0;->k1()V

    .line 1265
    .line 1266
    .line 1267
    :goto_e
    return-object v8

    .line 1268
    :pswitch_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    iget-object v0, v0, Lnd0;->receiver:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v0, Le0;

    .line 1274
    .line 1275
    invoke-virtual {v0, v1}, Le0;->d(Ljava/lang/Object;)Lfk2;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v1

    .line 1279
    if-nez v1, :cond_1d

    .line 1280
    .line 1281
    goto :goto_10

    .line 1282
    :cond_1d
    sget-object v2, Lls3;->n:Ljava/util/Set;

    .line 1283
    .line 1284
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    if-eqz v2, :cond_1e

    .line 1289
    .line 1290
    sget-object v2, Lmz4;->X:Lmz4;

    .line 1291
    .line 1292
    goto :goto_f

    .line 1293
    :cond_1e
    sget-object v2, Lls3;->o:Ljava/util/Set;

    .line 1294
    .line 1295
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    if-eqz v2, :cond_21

    .line 1300
    .line 1301
    sget-object v2, Lmz4;->Y:Lmz4;

    .line 1302
    .line 1303
    :goto_f
    iget-object v3, v0, Le0;->a:Lo8;

    .line 1304
    .line 1305
    iget-object v3, v3, Lo8;->f0:Ljava/lang/Object;

    .line 1306
    .line 1307
    check-cast v3, Lf0;

    .line 1308
    .line 1309
    invoke-virtual {v3, v1}, Lf0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v1

    .line 1313
    check-cast v1, Lje6;

    .line 1314
    .line 1315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1316
    .line 1317
    .line 1318
    sget-object v3, Lje6;->Y:Lje6;

    .line 1319
    .line 1320
    if-ne v1, v3, :cond_1f

    .line 1321
    .line 1322
    goto :goto_10

    .line 1323
    :cond_1f
    invoke-virtual {v1}, Lje6;->a()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v3

    .line 1327
    if-eqz v3, :cond_20

    .line 1328
    .line 1329
    invoke-virtual {v0}, Le0;->h()Z

    .line 1330
    .line 1331
    .line 1332
    move-result v0

    .line 1333
    if-nez v0, :cond_20

    .line 1334
    .line 1335
    goto :goto_10

    .line 1336
    :cond_20
    new-instance v7, Lg39;

    .line 1337
    .line 1338
    invoke-virtual {v1}, Lje6;->a()Z

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    invoke-direct {v7, v2, v0}, Lg39;-><init>(Ljava/lang/Object;Z)V

    .line 1343
    .line 1344
    .line 1345
    :cond_21
    :goto_10
    return-object v7

    .line 1346
    nop

    .line 1347
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

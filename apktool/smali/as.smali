.class public final synthetic Las;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z


# direct methods
.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 1
    iput-byte p1, p0, Las;->X:B

    .line 2
    .line 3
    iput-boolean p2, p0, Las;->Y:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Las;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-boolean v7, v0, Las;->Y:Z

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Lwr8;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    if-eqz v7, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x3a

    .line 26
    .line 27
    invoke-static {v0, v1}, Lz68;->t(Lcc1;C)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {v0}, Lwr8;->r(Lwr8;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_0
    move-object/from16 v0, p1

    .line 35
    .line 36
    check-cast v0, Ljava/io/PrintWriter;

    .line 37
    .line 38
    invoke-static {v0}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, " Should handle extra params: "

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :pswitch_1
    move v0, v4

    .line 67
    move-object/from16 v4, p1

    .line 68
    .line 69
    check-cast v4, Lqs7;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, v4, Lqs7;->g:Lms7;

    .line 75
    .line 76
    if-nez v7, :cond_2

    .line 77
    .line 78
    iget-boolean v2, v1, Lms7;->b:Z

    .line 79
    .line 80
    if-nez v2, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v0, v6

    .line 84
    :cond_2
    :goto_0
    invoke-static {v1, v0, v6, v5}, Lms7;->a(Lms7;ZZI)Lms7;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    const/4 v14, 0x0

    .line 89
    const/16 v15, 0x3bf

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    invoke-static/range {v4 .. v15}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_2
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, Lqs7;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const/4 v11, 0x0

    .line 112
    const/16 v12, 0x3fb

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    const/4 v3, 0x0

    .line 116
    iget-boolean v4, v0, Las;->Y:Z

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_3
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, Lqs7;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    const/16 v12, 0x3fd

    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    iget-boolean v3, v0, Las;->Y:Z

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    const/4 v5, 0x0

    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_4
    move v0, v4

    .line 155
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, Lqs7;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v3, v1, Lqs7;->i:Lps7;

    .line 163
    .line 164
    invoke-static {v3, v2, v7, v0}, Lps7;->a(Lps7;Ljava/lang/String;ZI)Lps7;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v7, :cond_3

    .line 169
    .line 170
    const-string v2, ""

    .line 171
    .line 172
    invoke-static {v0, v2, v6, v5}, Lps7;->a(Lps7;Ljava/lang/String;ZI)Lps7;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :cond_3
    move-object v10, v0

    .line 177
    const/4 v11, 0x0

    .line 178
    const/16 v12, 0x2ff

    .line 179
    .line 180
    const/4 v2, 0x0

    .line 181
    const/4 v3, 0x0

    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    :pswitch_5
    move v0, v4

    .line 194
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, Lqs7;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v2, v1, Lqs7;->g:Lms7;

    .line 202
    .line 203
    if-nez v7, :cond_5

    .line 204
    .line 205
    iget-boolean v3, v2, Lms7;->b:Z

    .line 206
    .line 207
    if-eqz v3, :cond_4

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_4
    move v3, v6

    .line 211
    goto :goto_2

    .line 212
    :cond_5
    :goto_1
    move v3, v0

    .line 213
    :goto_2
    invoke-static {v2, v6, v3, v0}, Lms7;->a(Lms7;ZZI)Lms7;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    if-eqz v3, :cond_6

    .line 218
    .line 219
    invoke-static {v2, v0, v6, v5}, Lms7;->a(Lms7;ZZI)Lms7;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    :cond_6
    move-object v8, v2

    .line 224
    const/4 v11, 0x0

    .line 225
    const/16 v12, 0x3bf

    .line 226
    .line 227
    const/4 v2, 0x0

    .line 228
    const/4 v3, 0x0

    .line 229
    const/4 v4, 0x0

    .line 230
    const/4 v5, 0x0

    .line 231
    const/4 v6, 0x0

    .line 232
    const/4 v7, 0x0

    .line 233
    const/4 v9, 0x0

    .line 234
    const/4 v10, 0x0

    .line 235
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    return-object v0

    .line 240
    :pswitch_6
    move-object/from16 v1, p1

    .line 241
    .line 242
    check-cast v1, Lqs7;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget-object v0, v1, Lqs7;->g:Lms7;

    .line 248
    .line 249
    invoke-static {v0, v7, v6, v5}, Lms7;->a(Lms7;ZZI)Lms7;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    const/4 v11, 0x0

    .line 254
    const/16 v12, 0x3bf

    .line 255
    .line 256
    const/4 v2, 0x0

    .line 257
    const/4 v3, 0x0

    .line 258
    const/4 v4, 0x0

    .line 259
    const/4 v5, 0x0

    .line 260
    const/4 v6, 0x0

    .line 261
    const/4 v7, 0x0

    .line 262
    const/4 v9, 0x0

    .line 263
    const/4 v10, 0x0

    .line 264
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    return-object v0

    .line 269
    :pswitch_7
    move-object/from16 v1, p1

    .line 270
    .line 271
    check-cast v1, Lqs7;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    const/4 v11, 0x0

    .line 277
    const/16 v12, 0x3df

    .line 278
    .line 279
    const/4 v2, 0x0

    .line 280
    const/4 v3, 0x0

    .line 281
    const/4 v4, 0x0

    .line 282
    const/4 v5, 0x0

    .line 283
    const/4 v6, 0x0

    .line 284
    iget-boolean v7, v0, Las;->Y:Z

    .line 285
    .line 286
    const/4 v8, 0x0

    .line 287
    const/4 v9, 0x0

    .line 288
    const/4 v10, 0x0

    .line 289
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :pswitch_8
    move-object/from16 v1, p1

    .line 295
    .line 296
    check-cast v1, Lqs7;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    const/4 v11, 0x0

    .line 302
    const/16 v12, 0x3ef

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    const/4 v3, 0x0

    .line 306
    const/4 v4, 0x0

    .line 307
    const/4 v5, 0x0

    .line 308
    iget-boolean v6, v0, Las;->Y:Z

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/4 v8, 0x0

    .line 312
    const/4 v9, 0x0

    .line 313
    const/4 v10, 0x0

    .line 314
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :pswitch_9
    move-object/from16 v1, p1

    .line 320
    .line 321
    check-cast v1, Lqs7;

    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-object v0, v1, Lqs7;->d:Lfs7;

    .line 327
    .line 328
    invoke-static {v0, v7, v2, v5}, Lfs7;->a(Lfs7;ZLsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;I)Lfs7;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    const/4 v11, 0x0

    .line 333
    const/16 v12, 0x3f7

    .line 334
    .line 335
    const/4 v2, 0x0

    .line 336
    const/4 v3, 0x0

    .line 337
    const/4 v4, 0x0

    .line 338
    const/4 v6, 0x0

    .line 339
    const/4 v7, 0x0

    .line 340
    const/4 v8, 0x0

    .line 341
    const/4 v9, 0x0

    .line 342
    const/4 v10, 0x0

    .line 343
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    return-object v0

    .line 348
    :pswitch_a
    move-object/from16 v1, p1

    .line 349
    .line 350
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 351
    .line 352
    sget v2, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->T0:I

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    const/16 v24, 0x0

    .line 362
    .line 363
    const v25, 0x7ffffe

    .line 364
    .line 365
    .line 366
    iget-boolean v4, v0, Las;->Y:Z

    .line 367
    .line 368
    const/4 v5, 0x0

    .line 369
    const/4 v6, 0x0

    .line 370
    const/4 v7, 0x0

    .line 371
    const/4 v8, 0x0

    .line 372
    const/4 v9, 0x0

    .line 373
    const/4 v10, 0x0

    .line 374
    const/4 v11, 0x0

    .line 375
    const/4 v12, 0x0

    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const/16 v16, 0x0

    .line 380
    .line 381
    const/16 v17, 0x0

    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    const/16 v19, 0x0

    .line 386
    .line 387
    const/16 v20, 0x0

    .line 388
    .line 389
    const/16 v21, 0x0

    .line 390
    .line 391
    const/16 v22, 0x0

    .line 392
    .line 393
    const/16 v23, 0x0

    .line 394
    .line 395
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    const/4 v6, 0x0

    .line 400
    const/16 v7, 0x1d

    .line 401
    .line 402
    const/4 v2, 0x0

    .line 403
    const/4 v4, 0x0

    .line 404
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    return-object v0

    .line 409
    :pswitch_b
    move-object/from16 v1, p1

    .line 410
    .line 411
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 412
    .line 413
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    const/16 v24, 0x0

    .line 423
    .line 424
    const v25, 0x7dffff

    .line 425
    .line 426
    .line 427
    const/4 v4, 0x0

    .line 428
    const/4 v5, 0x0

    .line 429
    const/4 v6, 0x0

    .line 430
    const/4 v7, 0x0

    .line 431
    const/4 v8, 0x0

    .line 432
    const/4 v9, 0x0

    .line 433
    const/4 v10, 0x0

    .line 434
    const/4 v11, 0x0

    .line 435
    const/4 v12, 0x0

    .line 436
    const/4 v13, 0x0

    .line 437
    const/4 v14, 0x0

    .line 438
    const/4 v15, 0x0

    .line 439
    const/16 v16, 0x0

    .line 440
    .line 441
    const/16 v17, 0x0

    .line 442
    .line 443
    const/16 v18, 0x0

    .line 444
    .line 445
    const/16 v19, 0x0

    .line 446
    .line 447
    iget-boolean v0, v0, Las;->Y:Z

    .line 448
    .line 449
    const/16 v21, 0x0

    .line 450
    .line 451
    const/16 v22, 0x0

    .line 452
    .line 453
    const/16 v23, 0x0

    .line 454
    .line 455
    move/from16 v20, v0

    .line 456
    .line 457
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    const/4 v6, 0x0

    .line 462
    const/16 v7, 0x1d

    .line 463
    .line 464
    const/4 v2, 0x0

    .line 465
    const/4 v4, 0x0

    .line 466
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    return-object v0

    .line 471
    :pswitch_c
    move v0, v4

    .line 472
    move-object/from16 v1, p1

    .line 473
    .line 474
    check-cast v1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 475
    .line 476
    if-eqz v7, :cond_7

    .line 477
    .line 478
    :goto_3
    move v4, v0

    .line 479
    goto :goto_4

    .line 480
    :cond_7
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppInfo;->f()Z

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-nez v1, :cond_8

    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_8
    move v4, v6

    .line 488
    :goto_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    return-object v0

    .line 493
    :pswitch_d
    move-object/from16 v0, p1

    .line 494
    .line 495
    check-cast v0, Landroid/content/res/Resources;

    .line 496
    .line 497
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    return-object v0

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
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

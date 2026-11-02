.class public final synthetic Ly0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lib2;Lhd6;)V
    .locals 0

    .line 1
    const/16 p1, 0x1c

    .line 2
    .line 3
    iput-byte p1, p0, Ly0;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ly0;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p2, p0, Ly0;->X:B

    iput-object p1, p0, Ly0;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Ly0;->X:B

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x5

    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v11, 0x1

    .line 13
    sget-object v12, Ldn8;->a:Ldn8;

    .line 14
    .line 15
    iget-object v0, v0, Ly0;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, Lhi2;

    .line 21
    .line 22
    check-cast v1, Lqj8;

    .line 23
    .line 24
    iget-object v4, v1, Lqj8;->b:Ldj2;

    .line 25
    .line 26
    iget v5, v1, Lqj8;->c:I

    .line 27
    .line 28
    iget v6, v1, Lqj8;->d:I

    .line 29
    .line 30
    iget-object v7, v1, Lqj8;->e:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance v2, Lqj8;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct/range {v2 .. v7}, Lqj8;-><init>(Lgi2;Ldj2;IILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lhi2;->a(Lqj8;)Lrj8;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Lrj8;->X:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    check-cast v0, Lhd6;

    .line 46
    .line 47
    check-cast v1, Ljava/io/PrintWriter;

    .line 48
    .line 49
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v0}, Lib2;->j(Lhd6;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0}, Lib2;->c(Lhd6;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v0}, Lib2;->g(Lhd6;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v0}, Lib2;->f(Lhd6;)Lsu/happ/proxyutility/dto/enums/SubInfoColor;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {v0}, Lib2;->e(Lhd6;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-static {v0}, Lib2;->d(Lhd6;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v8, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v2, " control type:sub-info params[SubExpire:"

    .line 86
    .line 87
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, ", SubExpireButtonLink:"

    .line 94
    .line 95
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v2, "SubInfoText:"

    .line 102
    .line 103
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v2, "SubInfoColor:"

    .line 110
    .line 111
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v2, "SubInfoButtonText:"

    .line 118
    .line 119
    const-string v3, "SubInfoButtonLink:"

    .line 120
    .line 121
    invoke-static {v8, v2, v7, v3, v0}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v0, "]"

    .line 125
    .line 126
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v12

    .line 137
    :pswitch_1
    check-cast v0, Lru1;

    .line 138
    .line 139
    check-cast v1, Lnr2;

    .line 140
    .line 141
    instance-of v2, v1, Lhv1;

    .line 142
    .line 143
    if-eqz v2, :cond_0

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Lru1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    :cond_0
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :pswitch_2
    check-cast v0, Lpt1;

    .line 161
    .line 162
    check-cast v1, Lwt1;

    .line 163
    .line 164
    iget-object v2, v1, Ljx4;->X:Ljx4;

    .line 165
    .line 166
    iget-boolean v2, v2, Ljx4;->p0:Z

    .line 167
    .line 168
    if-nez v2, :cond_1

    .line 169
    .line 170
    sget-object v0, Lxe8;->Y:Lxe8;

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_1
    iget-object v2, v1, Lwt1;->s0:Lxt1;

    .line 174
    .line 175
    if-eqz v2, :cond_2

    .line 176
    .line 177
    invoke-interface {v2, v0}, Lxt1;->C(Lpt1;)V

    .line 178
    .line 179
    .line 180
    :cond_2
    iput-object v10, v1, Lwt1;->s0:Lxt1;

    .line 181
    .line 182
    iput-object v10, v1, Lwt1;->r0:Lwt1;

    .line 183
    .line 184
    sget-object v0, Lxe8;->X:Lxe8;

    .line 185
    .line 186
    :goto_0
    return-object v0

    .line 187
    :pswitch_3
    check-cast v0, Lmr2;

    .line 188
    .line 189
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_4

    .line 196
    .line 197
    if-ne v0, v11, :cond_3

    .line 198
    .line 199
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    const/16 v33, 0x0

    .line 204
    .line 205
    const v34, 0x6fffff

    .line 206
    .line 207
    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    const/16 v20, 0x0

    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const/16 v23, 0x0

    .line 226
    .line 227
    const/16 v24, 0x0

    .line 228
    .line 229
    const/16 v25, 0x0

    .line 230
    .line 231
    const/16 v26, 0x0

    .line 232
    .line 233
    const/16 v27, 0x0

    .line 234
    .line 235
    const/16 v28, 0x0

    .line 236
    .line 237
    const/16 v29, 0x0

    .line 238
    .line 239
    const/16 v30, 0x0

    .line 240
    .line 241
    const/16 v31, 0x0

    .line 242
    .line 243
    const/16 v32, 0x0

    .line 244
    .line 245
    invoke-static/range {v12 .. v34}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    const/4 v6, 0x0

    .line 250
    const/16 v7, 0x1d

    .line 251
    .line 252
    const/4 v2, 0x0

    .line 253
    const/4 v4, 0x0

    .line 254
    const/4 v5, 0x0

    .line 255
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    goto :goto_1

    .line 260
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_4
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/16 v23, 0x0

    .line 269
    .line 270
    const v24, 0x77ffff

    .line 271
    .line 272
    .line 273
    const/4 v3, 0x0

    .line 274
    const/4 v4, 0x0

    .line 275
    const/4 v5, 0x0

    .line 276
    const/4 v6, 0x0

    .line 277
    const/4 v7, 0x0

    .line 278
    const/4 v8, 0x0

    .line 279
    const/4 v9, 0x0

    .line 280
    const/4 v10, 0x0

    .line 281
    const/4 v11, 0x0

    .line 282
    const/4 v12, 0x0

    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v15, 0x0

    .line 286
    const/16 v16, 0x0

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const/16 v18, 0x0

    .line 291
    .line 292
    const/16 v19, 0x0

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    const/16 v21, 0x0

    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    invoke-static/range {v2 .. v24}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    const/4 v6, 0x0

    .line 305
    const/16 v7, 0x1d

    .line 306
    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    :goto_1
    return-object v10

    .line 313
    :pswitch_4
    check-cast v0, Lht1;

    .line 314
    .line 315
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->v()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    new-instance v3, Ljava/io/File;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    sget-object v0, Lmr2;->Z:Lmr2;

    .line 334
    .line 335
    invoke-static {v0, v2}, Lht1;->c(Lmr2;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    const-string v5, ".temp"

    .line 340
    .line 341
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    new-instance v4, Ljava/io/File;

    .line 349
    .line 350
    invoke-static {v0, v2}, Lht1;->c(Lmr2;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Ljava/io/File;

    .line 358
    .line 359
    sget-object v6, Lmr2;->Y:Lmr2;

    .line 360
    .line 361
    invoke-static {v6, v2}, Lht1;->c(Lmr2;Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    new-instance v5, Ljava/io/File;

    .line 373
    .line 374
    invoke-static {v6, v2}, Lht1;->c(Lmr2;Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-direct {v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v2, :cond_5

    .line 386
    .line 387
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 391
    .line 392
    .line 393
    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-eqz v2, :cond_6

    .line 398
    .line 399
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 403
    .line 404
    .line 405
    :cond_6
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->g()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    if-nez v3, :cond_7

    .line 410
    .line 411
    goto :goto_2

    .line 412
    :cond_7
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/RouteSettings;->k()Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-static {v0}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 417
    .line 418
    .line 419
    move-result-object v19

    .line 420
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/RouteSettings;->j()Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v0}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 425
    .line 426
    .line 427
    move-result-object v20

    .line 428
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/RouteSettings;->w()Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-static {v0}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 433
    .line 434
    .line 435
    move-result-object v18

    .line 436
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/RouteSettings;->x()Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v0}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 441
    .line 442
    .line 443
    move-result-object v17

    .line 444
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/RouteSettings;->f()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-static {v0}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 449
    .line 450
    .line 451
    move-result-object v22

    .line 452
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/RouteSettings;->g()Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-static {v0}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 457
    .line 458
    .line 459
    move-result-object v21

    .line 460
    const/16 v27, 0x0

    .line 461
    .line 462
    const v28, 0x7e07ff

    .line 463
    .line 464
    .line 465
    const/4 v7, 0x0

    .line 466
    const/4 v8, 0x0

    .line 467
    const/4 v9, 0x0

    .line 468
    const/4 v10, 0x0

    .line 469
    const/4 v11, 0x0

    .line 470
    const/4 v12, 0x0

    .line 471
    const/4 v13, 0x0

    .line 472
    const/4 v14, 0x0

    .line 473
    const/4 v15, 0x0

    .line 474
    const/16 v16, 0x0

    .line 475
    .line 476
    const/16 v23, 0x0

    .line 477
    .line 478
    const/16 v24, 0x0

    .line 479
    .line 480
    const/16 v25, 0x0

    .line 481
    .line 482
    const/16 v26, 0x0

    .line 483
    .line 484
    move-object v6, v3

    .line 485
    invoke-static/range {v6 .. v28}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    const/4 v6, 0x0

    .line 490
    const/16 v7, 0x11

    .line 491
    .line 492
    const/4 v2, 0x0

    .line 493
    const/4 v5, 0x0

    .line 494
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    :goto_2
    return-object v1

    .line 499
    :pswitch_5
    check-cast v0, Llp1;

    .line 500
    .line 501
    check-cast v1, Ljava/io/IOException;

    .line 502
    .line 503
    iput-boolean v11, v0, Llp1;->n0:Z

    .line 504
    .line 505
    return-object v12

    .line 506
    :pswitch_6
    check-cast v0, Lokhttp3/internal/cache/DiskLruCache;

    .line 507
    .line 508
    check-cast v1, Ljava/io/IOException;

    .line 509
    .line 510
    invoke-static {v0, v1}, Lokhttp3/internal/cache/DiskLruCache;->g(Lokhttp3/internal/cache/DiskLruCache;Ljava/io/IOException;)Ldn8;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    return-object v0

    .line 515
    :pswitch_7
    check-cast v0, Lin1;

    .line 516
    .line 517
    check-cast v1, Lu95;

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0}, Lr70;->Y()V

    .line 523
    .line 524
    .line 525
    return-object v12

    .line 526
    :pswitch_8
    check-cast v0, Lib1;

    .line 527
    .line 528
    iget-object v2, v0, Lib1;->l0:Lvz7;

    .line 529
    .line 530
    check-cast v1, Ljava/lang/Throwable;

    .line 531
    .line 532
    if-eqz v1, :cond_8

    .line 533
    .line 534
    iget-object v0, v0, Lib1;->j0:Ljb1;

    .line 535
    .line 536
    new-instance v3, Lma2;

    .line 537
    .line 538
    invoke-direct {v3, v1}, Lma2;-><init>(Ljava/lang/Throwable;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v3}, Ljb1;->c(Lhh7;)V

    .line 542
    .line 543
    .line 544
    :cond_8
    invoke-virtual {v2}, Lvz7;->d()Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-eqz v0, :cond_9

    .line 549
    .line 550
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    check-cast v0, Lp92;

    .line 555
    .line 556
    invoke-virtual {v0}, Lp92;->close()V

    .line 557
    .line 558
    .line 559
    :cond_9
    return-object v12

    .line 560
    :pswitch_9
    check-cast v0, Lqd0;

    .line 561
    .line 562
    check-cast v1, Ljava/lang/Throwable;

    .line 563
    .line 564
    if-eqz v1, :cond_b

    .line 565
    .line 566
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 567
    .line 568
    if-eqz v2, :cond_a

    .line 569
    .line 570
    invoke-virtual {v0}, Lqd0;->c()V

    .line 571
    .line 572
    .line 573
    goto :goto_3

    .line 574
    :cond_a
    invoke-virtual {v0, v1}, Lqd0;->d(Ljava/lang/Throwable;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_3

    .line 578
    :cond_b
    invoke-virtual {v0, v10}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    :goto_3
    return-object v12

    .line 582
    :pswitch_a
    check-cast v0, Lxz0;

    .line 583
    .line 584
    check-cast v1, Lkl5;

    .line 585
    .line 586
    iget-object v1, v0, Lxz0;->x:Lug;

    .line 587
    .line 588
    if-nez v1, :cond_c

    .line 589
    .line 590
    new-instance v1, Lug;

    .line 591
    .line 592
    iget-object v2, v0, Lxz0;->a:Landroid/view/View;

    .line 593
    .line 594
    invoke-direct {v1, v2}, Lug;-><init>(Landroid/view/View;)V

    .line 595
    .line 596
    .line 597
    iput-object v1, v0, Lxz0;->x:Lug;

    .line 598
    .line 599
    :cond_c
    return-object v1

    .line 600
    :pswitch_b
    check-cast v0, Landroid/os/CancellationSignal;

    .line 601
    .line 602
    check-cast v1, Ljava/lang/Throwable;

    .line 603
    .line 604
    if-eqz v1, :cond_d

    .line 605
    .line 606
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 607
    .line 608
    .line 609
    :cond_d
    return-object v12

    .line 610
    :pswitch_c
    check-cast v0, Lpv0;

    .line 611
    .line 612
    check-cast v1, Lqg5;

    .line 613
    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    iget-object v1, v1, Lqg5;->X:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 620
    .line 621
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    iget-object v0, v0, Lpv0;->a:Lvz7;

    .line 629
    .line 630
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    check-cast v0, Lzt7;

    .line 635
    .line 636
    invoke-virtual {v0, v1}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    if-eqz v0, :cond_e

    .line 641
    .line 642
    iget-boolean v0, v0, Lqs7;->e:Z

    .line 643
    .line 644
    if-nez v0, :cond_e

    .line 645
    .line 646
    move v9, v11

    .line 647
    :cond_e
    xor-int/lit8 v0, v9, 0x1

    .line 648
    .line 649
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    return-object v0

    .line 654
    :pswitch_d
    check-cast v0, Ld6;

    .line 655
    .line 656
    check-cast v1, Lck0;

    .line 657
    .line 658
    iget-object v1, v1, Lck0;->a:Ld6;

    .line 659
    .line 660
    if-eq v1, v0, :cond_f

    .line 661
    .line 662
    goto :goto_4

    .line 663
    :cond_f
    move v9, v11

    .line 664
    :goto_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    return-object v0

    .line 669
    :pswitch_e
    check-cast v0, Lgq6;

    .line 670
    .line 671
    check-cast v1, Lp34;

    .line 672
    .line 673
    invoke-virtual {v0, v1}, Lgq6;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v1}, Lp34;->a()V

    .line 677
    .line 678
    .line 679
    return-object v12

    .line 680
    :pswitch_f
    check-cast v0, Lb70;

    .line 681
    .line 682
    check-cast v1, Ljc0;

    .line 683
    .line 684
    iget v2, v0, Lb70;->t0:F

    .line 685
    .line 686
    invoke-virtual {v1}, Ljc0;->getDensity()F

    .line 687
    .line 688
    .line 689
    move-result v12

    .line 690
    mul-float/2addr v12, v2

    .line 691
    const/4 v2, 0x0

    .line 692
    cmpl-float v12, v12, v2

    .line 693
    .line 694
    if-ltz v12, :cond_29

    .line 695
    .line 696
    iget-object v12, v1, Ljc0;->X:Lea0;

    .line 697
    .line 698
    invoke-interface {v12}, Lea0;->e()J

    .line 699
    .line 700
    .line 701
    move-result-wide v12

    .line 702
    invoke-static {v12, v13}, Lua7;->c(J)F

    .line 703
    .line 704
    .line 705
    move-result v12

    .line 706
    cmpl-float v12, v12, v2

    .line 707
    .line 708
    if-lez v12, :cond_29

    .line 709
    .line 710
    iget v12, v0, Lb70;->t0:F

    .line 711
    .line 712
    invoke-static {v12, v2}, Lkt1;->b(FF)Z

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    const/high16 v12, 0x3f800000    # 1.0f

    .line 717
    .line 718
    if-eqz v2, :cond_10

    .line 719
    .line 720
    move v2, v12

    .line 721
    goto :goto_5

    .line 722
    :cond_10
    iget v2, v0, Lb70;->t0:F

    .line 723
    .line 724
    invoke-virtual {v1}, Ljc0;->getDensity()F

    .line 725
    .line 726
    .line 727
    move-result v13

    .line 728
    mul-float/2addr v13, v2

    .line 729
    float-to-double v13, v13

    .line 730
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 731
    .line 732
    .line 733
    move-result-wide v13

    .line 734
    double-to-float v2, v13

    .line 735
    :goto_5
    iget-object v13, v1, Ljc0;->X:Lea0;

    .line 736
    .line 737
    invoke-interface {v13}, Lea0;->e()J

    .line 738
    .line 739
    .line 740
    move-result-wide v13

    .line 741
    invoke-static {v13, v14}, Lua7;->c(J)F

    .line 742
    .line 743
    .line 744
    move-result v13

    .line 745
    const/high16 v14, 0x40000000    # 2.0f

    .line 746
    .line 747
    div-float/2addr v13, v14

    .line 748
    const/16 v15, 0x20

    .line 749
    .line 750
    const-wide v16, 0xffffffffL

    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    float-to-double v6, v13

    .line 756
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 757
    .line 758
    .line 759
    move-result-wide v6

    .line 760
    double-to-float v6, v6

    .line 761
    invoke-static {v2, v6}, Ljava/lang/Math;->min(FF)F

    .line 762
    .line 763
    .line 764
    move-result v19

    .line 765
    div-float v2, v19, v14

    .line 766
    .line 767
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    int-to-long v6, v6

    .line 772
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 773
    .line 774
    .line 775
    move-result v8

    .line 776
    move/from16 p0, v14

    .line 777
    .line 778
    move v13, v15

    .line 779
    int-to-long v14, v8

    .line 780
    shl-long/2addr v6, v13

    .line 781
    and-long v14, v14, v16

    .line 782
    .line 783
    or-long v25, v6, v14

    .line 784
    .line 785
    iget-object v6, v1, Ljc0;->X:Lea0;

    .line 786
    .line 787
    invoke-interface {v6}, Lea0;->e()J

    .line 788
    .line 789
    .line 790
    move-result-wide v6

    .line 791
    shr-long/2addr v6, v13

    .line 792
    long-to-int v6, v6

    .line 793
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 794
    .line 795
    .line 796
    move-result v6

    .line 797
    sub-float v6, v6, v19

    .line 798
    .line 799
    iget-object v7, v1, Ljc0;->X:Lea0;

    .line 800
    .line 801
    invoke-interface {v7}, Lea0;->e()J

    .line 802
    .line 803
    .line 804
    move-result-wide v7

    .line 805
    and-long v7, v7, v16

    .line 806
    .line 807
    long-to-int v7, v7

    .line 808
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 809
    .line 810
    .line 811
    move-result v7

    .line 812
    sub-float v7, v7, v19

    .line 813
    .line 814
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 815
    .line 816
    .line 817
    move-result v6

    .line 818
    int-to-long v14, v6

    .line 819
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 820
    .line 821
    .line 822
    move-result v6

    .line 823
    int-to-long v6, v6

    .line 824
    shl-long/2addr v14, v13

    .line 825
    and-long v6, v6, v16

    .line 826
    .line 827
    or-long v27, v14, v6

    .line 828
    .line 829
    mul-float v30, v19, p0

    .line 830
    .line 831
    iget-object v6, v1, Ljc0;->X:Lea0;

    .line 832
    .line 833
    invoke-interface {v6}, Lea0;->e()J

    .line 834
    .line 835
    .line 836
    move-result-wide v6

    .line 837
    invoke-static {v6, v7}, Lua7;->c(J)F

    .line 838
    .line 839
    .line 840
    move-result v6

    .line 841
    cmpl-float v6, v30, v6

    .line 842
    .line 843
    if-lez v6, :cond_11

    .line 844
    .line 845
    move v6, v11

    .line 846
    goto :goto_6

    .line 847
    :cond_11
    move v6, v9

    .line 848
    :goto_6
    iget-object v7, v0, Lb70;->v0:Lx67;

    .line 849
    .line 850
    iget-object v8, v1, Ljc0;->X:Lea0;

    .line 851
    .line 852
    invoke-interface {v8}, Lea0;->e()J

    .line 853
    .line 854
    .line 855
    move-result-wide v14

    .line 856
    iget-object v8, v1, Ljc0;->X:Lea0;

    .line 857
    .line 858
    invoke-interface {v8}, Lea0;->getLayoutDirection()Lz24;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    invoke-interface {v7, v14, v15, v8, v1}, Lx67;->a(JLz24;Lfi1;)Lmb6;

    .line 863
    .line 864
    .line 865
    move-result-object v7

    .line 866
    instance-of v8, v7, Lzd5;

    .line 867
    .line 868
    if-eqz v8, :cond_1f

    .line 869
    .line 870
    iget-object v2, v0, Lb70;->u0:Lfe7;

    .line 871
    .line 872
    check-cast v7, Lzd5;

    .line 873
    .line 874
    iget-object v3, v7, Lzd5;->j0:Llf;

    .line 875
    .line 876
    if-eqz v6, :cond_12

    .line 877
    .line 878
    new-instance v0, Lp0;

    .line 879
    .line 880
    const/16 v3, 0xa

    .line 881
    .line 882
    invoke-direct {v0, v7, v2, v3}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v1, v0}, Ljc0;->a(Lgn2;)Lvk1;

    .line 886
    .line 887
    .line 888
    move-result-object v10

    .line 889
    goto/16 :goto_12

    .line 890
    .line 891
    :cond_12
    if-eqz v2, :cond_13

    .line 892
    .line 893
    iget-wide v14, v2, Lfe7;->a:J

    .line 894
    .line 895
    invoke-static {v12, v14, v15}, Ldw0;->b(FJ)J

    .line 896
    .line 897
    .line 898
    move-result-wide v14

    .line 899
    new-instance v4, Lg60;

    .line 900
    .line 901
    invoke-direct {v4, v14, v15, v5}, Lg60;-><init>(JI)V

    .line 902
    .line 903
    .line 904
    move-object/from16 v23, v4

    .line 905
    .line 906
    move v4, v11

    .line 907
    goto :goto_7

    .line 908
    :cond_13
    move v4, v9

    .line 909
    move-object/from16 v23, v10

    .line 910
    .line 911
    :goto_7
    invoke-virtual {v3}, Llf;->d()Ls86;

    .line 912
    .line 913
    .line 914
    move-result-object v5

    .line 915
    iget v6, v5, Ls86;->b:F

    .line 916
    .line 917
    iget v8, v5, Ls86;->a:F

    .line 918
    .line 919
    iget-object v14, v0, Lb70;->s0:Lx60;

    .line 920
    .line 921
    if-nez v14, :cond_14

    .line 922
    .line 923
    new-instance v14, Lx60;

    .line 924
    .line 925
    invoke-direct {v14}, Lx60;-><init>()V

    .line 926
    .line 927
    .line 928
    iput-object v14, v0, Lb70;->s0:Lx60;

    .line 929
    .line 930
    :cond_14
    iget-object v15, v14, Lx60;->d:Llf;

    .line 931
    .line 932
    if-nez v15, :cond_15

    .line 933
    .line 934
    invoke-static {}, Lnf;->a()Llf;

    .line 935
    .line 936
    .line 937
    move-result-object v15

    .line 938
    iput-object v15, v14, Lx60;->d:Llf;

    .line 939
    .line 940
    :cond_15
    invoke-virtual {v15}, Llf;->g()V

    .line 941
    .line 942
    .line 943
    invoke-static {v15, v5}, Llf;->b(Llf;Ls86;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v15, v15, v3, v9}, Llf;->f(Llf;Llf;I)Z

    .line 947
    .line 948
    .line 949
    new-instance v3, Lea6;

    .line 950
    .line 951
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 952
    .line 953
    .line 954
    iget v14, v5, Ls86;->c:F

    .line 955
    .line 956
    sub-float/2addr v14, v8

    .line 957
    move/from16 p0, v12

    .line 958
    .line 959
    move/from16 v18, v13

    .line 960
    .line 961
    float-to-double v12, v14

    .line 962
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 963
    .line 964
    .line 965
    move-result-wide v12

    .line 966
    double-to-float v12, v12

    .line 967
    float-to-int v12, v12

    .line 968
    iget v13, v5, Ls86;->d:F

    .line 969
    .line 970
    sub-float/2addr v13, v6

    .line 971
    float-to-double v13, v13

    .line 972
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 973
    .line 974
    .line 975
    move-result-wide v13

    .line 976
    double-to-float v13, v13

    .line 977
    float-to-int v13, v13

    .line 978
    int-to-long v10, v12

    .line 979
    shl-long v10, v10, v18

    .line 980
    .line 981
    int-to-long v12, v13

    .line 982
    and-long v12, v12, v16

    .line 983
    .line 984
    or-long v21, v10, v12

    .line 985
    .line 986
    iget-object v0, v0, Lb70;->s0:Lx60;

    .line 987
    .line 988
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    iget-object v10, v0, Lx60;->a:Lje;

    .line 992
    .line 993
    iget-object v11, v0, Lx60;->b:Leb;

    .line 994
    .line 995
    if-eqz v10, :cond_16

    .line 996
    .line 997
    iget-object v12, v10, Lje;->a:Landroid/graphics/Bitmap;

    .line 998
    .line 999
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v12

    .line 1003
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    invoke-static {v12}, Lue3;->k0(Landroid/graphics/Bitmap$Config;)I

    .line 1007
    .line 1008
    .line 1009
    move-result v12

    .line 1010
    new-instance v13, Ls53;

    .line 1011
    .line 1012
    invoke-direct {v13, v12}, Ls53;-><init>(I)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_8

    .line 1016
    :cond_16
    const/4 v13, 0x0

    .line 1017
    :goto_8
    if-nez v13, :cond_17

    .line 1018
    .line 1019
    goto :goto_9

    .line 1020
    :cond_17
    iget v12, v13, Ls53;->a:I

    .line 1021
    .line 1022
    if-nez v12, :cond_18

    .line 1023
    .line 1024
    goto :goto_b

    .line 1025
    :cond_18
    :goto_9
    if-eqz v10, :cond_19

    .line 1026
    .line 1027
    iget-object v12, v10, Lje;->a:Landroid/graphics/Bitmap;

    .line 1028
    .line 1029
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v12

    .line 1033
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v12}, Lue3;->k0(Landroid/graphics/Bitmap$Config;)I

    .line 1037
    .line 1038
    .line 1039
    move-result v12

    .line 1040
    new-instance v13, Ls53;

    .line 1041
    .line 1042
    invoke-direct {v13, v12}, Ls53;-><init>(I)V

    .line 1043
    .line 1044
    .line 1045
    move-object v14, v13

    .line 1046
    goto :goto_a

    .line 1047
    :cond_19
    const/4 v14, 0x0

    .line 1048
    :goto_a
    if-nez v14, :cond_1a

    .line 1049
    .line 1050
    goto :goto_c

    .line 1051
    :cond_1a
    iget v12, v14, Ls53;->a:I

    .line 1052
    .line 1053
    if-eq v4, v12, :cond_1b

    .line 1054
    .line 1055
    goto :goto_c

    .line 1056
    :cond_1b
    :goto_b
    const/4 v9, 0x1

    .line 1057
    :goto_c
    if-eqz v10, :cond_1d

    .line 1058
    .line 1059
    if-eqz v11, :cond_1d

    .line 1060
    .line 1061
    iget-object v12, v1, Ljc0;->X:Lea0;

    .line 1062
    .line 1063
    invoke-interface {v12}, Lea0;->e()J

    .line 1064
    .line 1065
    .line 1066
    move-result-wide v12

    .line 1067
    shr-long v12, v12, v18

    .line 1068
    .line 1069
    long-to-int v12, v12

    .line 1070
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1071
    .line 1072
    .line 1073
    move-result v12

    .line 1074
    iget-object v13, v10, Lje;->a:Landroid/graphics/Bitmap;

    .line 1075
    .line 1076
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1077
    .line 1078
    .line 1079
    move-result v14

    .line 1080
    int-to-float v14, v14

    .line 1081
    cmpl-float v12, v12, v14

    .line 1082
    .line 1083
    if-gtz v12, :cond_1d

    .line 1084
    .line 1085
    iget-object v12, v1, Ljc0;->X:Lea0;

    .line 1086
    .line 1087
    invoke-interface {v12}, Lea0;->e()J

    .line 1088
    .line 1089
    .line 1090
    move-result-wide v19

    .line 1091
    move/from16 p1, v9

    .line 1092
    .line 1093
    move-object v12, v10

    .line 1094
    and-long v9, v19, v16

    .line 1095
    .line 1096
    long-to-int v9, v9

    .line 1097
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1098
    .line 1099
    .line 1100
    move-result v9

    .line 1101
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1102
    .line 1103
    .line 1104
    move-result v10

    .line 1105
    int-to-float v10, v10

    .line 1106
    cmpl-float v9, v9, v10

    .line 1107
    .line 1108
    if-gtz v9, :cond_1d

    .line 1109
    .line 1110
    if-nez p1, :cond_1c

    .line 1111
    .line 1112
    goto :goto_d

    .line 1113
    :cond_1c
    move-object v10, v12

    .line 1114
    goto :goto_e

    .line 1115
    :cond_1d
    :goto_d
    shr-long v9, v21, v18

    .line 1116
    .line 1117
    long-to-int v9, v9

    .line 1118
    and-long v10, v21, v16

    .line 1119
    .line 1120
    long-to-int v10, v10

    .line 1121
    invoke-static {v9, v10, v4}, Lmb6;->d(III)Lje;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v10

    .line 1125
    iput-object v10, v0, Lx60;->a:Lje;

    .line 1126
    .line 1127
    invoke-static {v10}, Lfb;->a(Lje;)Leb;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v11

    .line 1131
    iput-object v11, v0, Lx60;->b:Leb;

    .line 1132
    .line 1133
    :goto_e
    iget-object v4, v0, Lx60;->c:Lum0;

    .line 1134
    .line 1135
    if-nez v4, :cond_1e

    .line 1136
    .line 1137
    new-instance v4, Lum0;

    .line 1138
    .line 1139
    invoke-direct {v4}, Lum0;-><init>()V

    .line 1140
    .line 1141
    .line 1142
    iput-object v4, v0, Lx60;->c:Lum0;

    .line 1143
    .line 1144
    :cond_1e
    iget-object v9, v4, Lum0;->Y:Llr;

    .line 1145
    .line 1146
    iget-object v0, v4, Lum0;->X:Ltm0;

    .line 1147
    .line 1148
    invoke-static/range {v21 .. v22}, Lu15;->R(J)J

    .line 1149
    .line 1150
    .line 1151
    move-result-wide v12

    .line 1152
    iget-object v14, v1, Ljc0;->X:Lea0;

    .line 1153
    .line 1154
    invoke-interface {v14}, Lea0;->getLayoutDirection()Lz24;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v14

    .line 1158
    move-object/from16 v19, v2

    .line 1159
    .line 1160
    iget-object v2, v0, Ltm0;->a:Lfi1;

    .line 1161
    .line 1162
    move-object/from16 v31, v4

    .line 1163
    .line 1164
    iget-object v4, v0, Ltm0;->b:Lz24;

    .line 1165
    .line 1166
    move-object/from16 p1, v5

    .line 1167
    .line 1168
    iget-object v5, v0, Ltm0;->c:Lsm0;

    .line 1169
    .line 1170
    move-object/from16 v24, v3

    .line 1171
    .line 1172
    move-object/from16 v20, v4

    .line 1173
    .line 1174
    iget-wide v3, v0, Ltm0;->d:J

    .line 1175
    .line 1176
    iput-object v1, v0, Ltm0;->a:Lfi1;

    .line 1177
    .line 1178
    iput-object v14, v0, Ltm0;->b:Lz24;

    .line 1179
    .line 1180
    iput-object v11, v0, Ltm0;->c:Lsm0;

    .line 1181
    .line 1182
    iput-wide v12, v0, Ltm0;->d:J

    .line 1183
    .line 1184
    invoke-virtual {v11}, Leb;->g()V

    .line 1185
    .line 1186
    .line 1187
    sget-wide v32, Ldw0;->b:J

    .line 1188
    .line 1189
    const/16 v38, 0x0

    .line 1190
    .line 1191
    const/16 v39, 0x3a

    .line 1192
    .line 1193
    const-wide/16 v34, 0x0

    .line 1194
    .line 1195
    move-wide/from16 v36, v12

    .line 1196
    .line 1197
    invoke-static/range {v31 .. v39}, Lsv1;->k0(Lsv1;JJJFI)V

    .line 1198
    .line 1199
    .line 1200
    move-object/from16 v12, v31

    .line 1201
    .line 1202
    neg-float v8, v8

    .line 1203
    neg-float v6, v6

    .line 1204
    iget-object v13, v9, Llr;->Y:Ljava/lang/Object;

    .line 1205
    .line 1206
    check-cast v13, Lwl6;

    .line 1207
    .line 1208
    invoke-virtual {v13, v8, v6}, Lwl6;->V(FF)V

    .line 1209
    .line 1210
    .line 1211
    :try_start_0
    iget-object v7, v7, Lzd5;->j0:Llf;

    .line 1212
    .line 1213
    new-instance v35, Lom7;

    .line 1214
    .line 1215
    const/16 v33, 0x0

    .line 1216
    .line 1217
    const/16 v34, 0x1e

    .line 1218
    .line 1219
    const/16 v31, 0x0

    .line 1220
    .line 1221
    const/16 v32, 0x0

    .line 1222
    .line 1223
    move-object/from16 v29, v35

    .line 1224
    .line 1225
    invoke-direct/range {v29 .. v34}, Lom7;-><init>(FFIII)V

    .line 1226
    .line 1227
    .line 1228
    const/16 v36, 0x34

    .line 1229
    .line 1230
    const/16 v34, 0x0

    .line 1231
    .line 1232
    move-object/from16 v32, v7

    .line 1233
    .line 1234
    move-object/from16 v31, v12

    .line 1235
    .line 1236
    move-object/from16 v33, v19

    .line 1237
    .line 1238
    invoke-static/range {v31 .. v36}, Lsv1;->d0(Lsv1;Llf;Ld90;FLom7;I)V

    .line 1239
    .line 1240
    .line 1241
    invoke-interface/range {v31 .. v31}, Lsv1;->e()J

    .line 1242
    .line 1243
    .line 1244
    move-result-wide v12

    .line 1245
    shr-long v12, v12, v18

    .line 1246
    .line 1247
    long-to-int v7, v12

    .line 1248
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1249
    .line 1250
    .line 1251
    move-result v7

    .line 1252
    add-float v7, v7, p0

    .line 1253
    .line 1254
    invoke-interface/range {v31 .. v31}, Lsv1;->e()J

    .line 1255
    .line 1256
    .line 1257
    move-result-wide v12

    .line 1258
    shr-long v12, v12, v18

    .line 1259
    .line 1260
    long-to-int v12, v12

    .line 1261
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1262
    .line 1263
    .line 1264
    move-result v12

    .line 1265
    div-float/2addr v7, v12

    .line 1266
    invoke-interface/range {v31 .. v31}, Lsv1;->e()J

    .line 1267
    .line 1268
    .line 1269
    move-result-wide v12

    .line 1270
    and-long v12, v12, v16

    .line 1271
    .line 1272
    long-to-int v12, v12

    .line 1273
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1274
    .line 1275
    .line 1276
    move-result v12

    .line 1277
    add-float v12, v12, p0

    .line 1278
    .line 1279
    invoke-interface/range {v31 .. v31}, Lsv1;->e()J

    .line 1280
    .line 1281
    .line 1282
    move-result-wide v13

    .line 1283
    and-long v13, v13, v16

    .line 1284
    .line 1285
    long-to-int v13, v13

    .line 1286
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1287
    .line 1288
    .line 1289
    move-result v13

    .line 1290
    div-float/2addr v12, v13

    .line 1291
    invoke-interface/range {v31 .. v31}, Lsv1;->A0()J

    .line 1292
    .line 1293
    .line 1294
    move-result-wide v13

    .line 1295
    move-object/from16 v19, v10

    .line 1296
    .line 1297
    move-object/from16 v25, v11

    .line 1298
    .line 1299
    invoke-virtual {v9}, Llr;->p()J

    .line 1300
    .line 1301
    .line 1302
    move-result-wide v10

    .line 1303
    invoke-virtual {v9}, Llr;->k()Lsm0;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v16

    .line 1307
    invoke-interface/range {v16 .. v16}, Lsm0;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1308
    .line 1309
    .line 1310
    move-object/from16 v32, v15

    .line 1311
    .line 1312
    :try_start_1
    iget-object v15, v9, Llr;->Y:Ljava/lang/Object;

    .line 1313
    .line 1314
    check-cast v15, Lwl6;

    .line 1315
    .line 1316
    invoke-virtual {v15, v7, v12, v13, v14}, Lwl6;->U(FFJ)V

    .line 1317
    .line 1318
    .line 1319
    const/16 v35, 0x0

    .line 1320
    .line 1321
    const/16 v36, 0x1c

    .line 1322
    .line 1323
    const/16 v34, 0x0

    .line 1324
    .line 1325
    invoke-static/range {v31 .. v36}, Lsv1;->d0(Lsv1;Llf;Ld90;FLom7;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1326
    .line 1327
    .line 1328
    :try_start_2
    invoke-virtual {v9}, Llr;->k()Lsm0;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v7

    .line 1332
    invoke-interface {v7}, Lsm0;->p()V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v9, v10, v11}, Llr;->D(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1336
    .line 1337
    .line 1338
    iget-object v7, v9, Llr;->Y:Ljava/lang/Object;

    .line 1339
    .line 1340
    check-cast v7, Lwl6;

    .line 1341
    .line 1342
    neg-float v8, v8

    .line 1343
    neg-float v6, v6

    .line 1344
    invoke-virtual {v7, v8, v6}, Lwl6;->V(FF)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual/range {v25 .. v25}, Leb;->p()V

    .line 1348
    .line 1349
    .line 1350
    iput-object v2, v0, Ltm0;->a:Lfi1;

    .line 1351
    .line 1352
    move-object/from16 v2, v20

    .line 1353
    .line 1354
    iput-object v2, v0, Ltm0;->b:Lz24;

    .line 1355
    .line 1356
    iput-object v5, v0, Ltm0;->c:Lsm0;

    .line 1357
    .line 1358
    iput-wide v3, v0, Ltm0;->d:J

    .line 1359
    .line 1360
    move-object/from16 v10, v19

    .line 1361
    .line 1362
    iget-object v0, v10, Lje;->a:Landroid/graphics/Bitmap;

    .line 1363
    .line 1364
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 1365
    .line 1366
    .line 1367
    move-object/from16 v0, v24

    .line 1368
    .line 1369
    iput-object v10, v0, Lea6;->X:Ljava/lang/Object;

    .line 1370
    .line 1371
    new-instance v18, La70;

    .line 1372
    .line 1373
    move-object/from16 v19, p1

    .line 1374
    .line 1375
    move-object/from16 v20, v0

    .line 1376
    .line 1377
    invoke-direct/range {v18 .. v23}, La70;-><init>(Ls86;Lea6;JLg60;)V

    .line 1378
    .line 1379
    .line 1380
    move-object/from16 v0, v18

    .line 1381
    .line 1382
    invoke-virtual {v1, v0}, Ljc0;->a(Lgn2;)Lvk1;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v10

    .line 1386
    goto/16 :goto_12

    .line 1387
    .line 1388
    :catchall_0
    move-exception v0

    .line 1389
    goto :goto_f

    .line 1390
    :catchall_1
    move-exception v0

    .line 1391
    :try_start_3
    invoke-virtual {v9}, Llr;->k()Lsm0;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v1

    .line 1395
    invoke-interface {v1}, Lsm0;->p()V

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v9, v10, v11}, Llr;->D(J)V

    .line 1399
    .line 1400
    .line 1401
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1402
    :goto_f
    iget-object v1, v9, Llr;->Y:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v1, Lwl6;

    .line 1405
    .line 1406
    neg-float v2, v8

    .line 1407
    neg-float v3, v6

    .line 1408
    invoke-virtual {v1, v2, v3}, Lwl6;->V(FF)V

    .line 1409
    .line 1410
    .line 1411
    throw v0

    .line 1412
    :cond_1f
    instance-of v5, v7, Lbe5;

    .line 1413
    .line 1414
    if-eqz v5, :cond_24

    .line 1415
    .line 1416
    iget-object v3, v0, Lb70;->u0:Lfe7;

    .line 1417
    .line 1418
    check-cast v7, Lbe5;

    .line 1419
    .line 1420
    iget-object v4, v7, Lbe5;->j0:Lem6;

    .line 1421
    .line 1422
    invoke-static {v4}, Lpu;->z(Lem6;)Z

    .line 1423
    .line 1424
    .line 1425
    move-result v5

    .line 1426
    if-eqz v5, :cond_20

    .line 1427
    .line 1428
    iget-wide v4, v4, Lem6;->e:J

    .line 1429
    .line 1430
    new-instance v18, Lom7;

    .line 1431
    .line 1432
    const/16 v22, 0x0

    .line 1433
    .line 1434
    const/16 v23, 0x1e

    .line 1435
    .line 1436
    const/16 v20, 0x0

    .line 1437
    .line 1438
    const/16 v21, 0x0

    .line 1439
    .line 1440
    invoke-direct/range {v18 .. v23}, Lom7;-><init>(FFIII)V

    .line 1441
    .line 1442
    .line 1443
    new-instance v0, Lz60;

    .line 1444
    .line 1445
    move/from16 v23, v2

    .line 1446
    .line 1447
    move-object/from16 v20, v3

    .line 1448
    .line 1449
    move-wide/from16 v21, v4

    .line 1450
    .line 1451
    move-object/from16 v29, v18

    .line 1452
    .line 1453
    move/from16 v24, v19

    .line 1454
    .line 1455
    move-object/from16 v18, v0

    .line 1456
    .line 1457
    move/from16 v19, v6

    .line 1458
    .line 1459
    invoke-direct/range {v18 .. v29}, Lz60;-><init>(ZLfe7;JFFJJLom7;)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v1, v0}, Ljc0;->a(Lgn2;)Lvk1;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v10

    .line 1466
    goto/16 :goto_12

    .line 1467
    .line 1468
    :cond_20
    move/from16 v2, v19

    .line 1469
    .line 1470
    move/from16 v19, v6

    .line 1471
    .line 1472
    iget-object v5, v0, Lb70;->s0:Lx60;

    .line 1473
    .line 1474
    if-nez v5, :cond_21

    .line 1475
    .line 1476
    new-instance v5, Lx60;

    .line 1477
    .line 1478
    invoke-direct {v5}, Lx60;-><init>()V

    .line 1479
    .line 1480
    .line 1481
    iput-object v5, v0, Lb70;->s0:Lx60;

    .line 1482
    .line 1483
    :cond_21
    iget-object v0, v5, Lx60;->d:Llf;

    .line 1484
    .line 1485
    if-nez v0, :cond_22

    .line 1486
    .line 1487
    invoke-static {}, Lnf;->a()Llf;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    iput-object v0, v5, Lx60;->d:Llf;

    .line 1492
    .line 1493
    :cond_22
    invoke-virtual {v0}, Llf;->g()V

    .line 1494
    .line 1495
    .line 1496
    invoke-static {v0, v4}, Llf;->c(Llf;Lem6;)V

    .line 1497
    .line 1498
    .line 1499
    if-nez v19, :cond_23

    .line 1500
    .line 1501
    invoke-static {}, Lnf;->a()Llf;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v5

    .line 1505
    iget v6, v4, Lem6;->c:F

    .line 1506
    .line 1507
    iget v7, v4, Lem6;->a:F

    .line 1508
    .line 1509
    sub-float/2addr v6, v7

    .line 1510
    sub-float v21, v6, v2

    .line 1511
    .line 1512
    iget v6, v4, Lem6;->d:F

    .line 1513
    .line 1514
    iget v7, v4, Lem6;->b:F

    .line 1515
    .line 1516
    sub-float/2addr v6, v7

    .line 1517
    sub-float v22, v6, v2

    .line 1518
    .line 1519
    iget-wide v6, v4, Lem6;->e:J

    .line 1520
    .line 1521
    invoke-static {v2, v6, v7}, Lu70;->o0(FJ)J

    .line 1522
    .line 1523
    .line 1524
    move-result-wide v23

    .line 1525
    iget-wide v6, v4, Lem6;->f:J

    .line 1526
    .line 1527
    invoke-static {v2, v6, v7}, Lu70;->o0(FJ)J

    .line 1528
    .line 1529
    .line 1530
    move-result-wide v25

    .line 1531
    iget-wide v6, v4, Lem6;->h:J

    .line 1532
    .line 1533
    invoke-static {v2, v6, v7}, Lu70;->o0(FJ)J

    .line 1534
    .line 1535
    .line 1536
    move-result-wide v29

    .line 1537
    iget-wide v6, v4, Lem6;->g:J

    .line 1538
    .line 1539
    invoke-static {v2, v6, v7}, Lu70;->o0(FJ)J

    .line 1540
    .line 1541
    .line 1542
    move-result-wide v27

    .line 1543
    new-instance v18, Lem6;

    .line 1544
    .line 1545
    move/from16 v20, v2

    .line 1546
    .line 1547
    move/from16 v19, v2

    .line 1548
    .line 1549
    invoke-direct/range {v18 .. v30}, Lem6;-><init>(FFFFJJJJ)V

    .line 1550
    .line 1551
    .line 1552
    move-object/from16 v2, v18

    .line 1553
    .line 1554
    invoke-static {v5, v2}, Llf;->c(Llf;Lem6;)V

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v0, v0, v5, v9}, Llf;->f(Llf;Llf;I)Z

    .line 1558
    .line 1559
    .line 1560
    :cond_23
    new-instance v2, Lp0;

    .line 1561
    .line 1562
    const/16 v4, 0x9

    .line 1563
    .line 1564
    invoke-direct {v2, v0, v3, v4}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1, v2}, Ljc0;->a(Lgn2;)Lvk1;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v10

    .line 1571
    goto :goto_12

    .line 1572
    :cond_24
    move/from16 v2, v19

    .line 1573
    .line 1574
    move/from16 v19, v6

    .line 1575
    .line 1576
    instance-of v5, v7, Lae5;

    .line 1577
    .line 1578
    if-eqz v5, :cond_28

    .line 1579
    .line 1580
    iget-object v7, v0, Lb70;->u0:Lfe7;

    .line 1581
    .line 1582
    if-eqz v19, :cond_25

    .line 1583
    .line 1584
    move-wide v8, v3

    .line 1585
    goto :goto_10

    .line 1586
    :cond_25
    move-wide/from16 v8, v25

    .line 1587
    .line 1588
    :goto_10
    if-eqz v19, :cond_26

    .line 1589
    .line 1590
    iget-object v0, v1, Ljc0;->X:Lea0;

    .line 1591
    .line 1592
    invoke-interface {v0}, Lea0;->e()J

    .line 1593
    .line 1594
    .line 1595
    move-result-wide v27

    .line 1596
    :cond_26
    move-wide/from16 v10, v27

    .line 1597
    .line 1598
    if-eqz v19, :cond_27

    .line 1599
    .line 1600
    sget-object v0, Lea2;->a:Lea2;

    .line 1601
    .line 1602
    move-object v12, v0

    .line 1603
    goto :goto_11

    .line 1604
    :cond_27
    new-instance v18, Lom7;

    .line 1605
    .line 1606
    const/16 v22, 0x0

    .line 1607
    .line 1608
    const/16 v23, 0x1e

    .line 1609
    .line 1610
    const/16 v20, 0x0

    .line 1611
    .line 1612
    const/16 v21, 0x0

    .line 1613
    .line 1614
    move/from16 v19, v2

    .line 1615
    .line 1616
    invoke-direct/range {v18 .. v23}, Lom7;-><init>(FFIII)V

    .line 1617
    .line 1618
    .line 1619
    move-object/from16 v12, v18

    .line 1620
    .line 1621
    :goto_11
    new-instance v6, Ly60;

    .line 1622
    .line 1623
    invoke-direct/range {v6 .. v12}, Ly60;-><init>(Lfe7;JJLtv1;)V

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v1, v6}, Ljc0;->a(Lgn2;)Lvk1;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v10

    .line 1630
    goto :goto_12

    .line 1631
    :cond_28
    invoke-static {}, Lb61;->c()V

    .line 1632
    .line 1633
    .line 1634
    const/4 v10, 0x0

    .line 1635
    goto :goto_12

    .line 1636
    :cond_29
    new-instance v0, Ly2;

    .line 1637
    .line 1638
    const/16 v2, 0x1c

    .line 1639
    .line 1640
    invoke-direct {v0, v2}, Ly2;-><init>(B)V

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v1, v0}, Ljc0;->a(Lgn2;)Lvk1;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v10

    .line 1647
    :goto_12
    return-object v10

    .line 1648
    :pswitch_10
    check-cast v0, Ljc8;

    .line 1649
    .line 1650
    check-cast v1, Leq1;

    .line 1651
    .line 1652
    new-instance v1, Ljd;

    .line 1653
    .line 1654
    invoke-direct {v1, v0, v5}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 1655
    .line 1656
    .line 1657
    return-object v1

    .line 1658
    :pswitch_11
    check-cast v0, Li30;

    .line 1659
    .line 1660
    check-cast v1, Leq1;

    .line 1661
    .line 1662
    new-instance v1, Ljd;

    .line 1663
    .line 1664
    const/4 v2, 0x3

    .line 1665
    invoke-direct {v1, v0, v2}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 1666
    .line 1667
    .line 1668
    return-object v1

    .line 1669
    :pswitch_12
    check-cast v0, Ls10;

    .line 1670
    .line 1671
    check-cast v1, Lu95;

    .line 1672
    .line 1673
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v0, v9, v9}, Lsn1;->R(ZZ)V

    .line 1677
    .line 1678
    .line 1679
    return-object v12

    .line 1680
    :pswitch_13
    check-cast v0, Lfz0;

    .line 1681
    .line 1682
    check-cast v1, Ll94;

    .line 1683
    .line 1684
    iget-object v2, v0, Lfz0;->a:Ll00;

    .line 1685
    .line 1686
    const/4 v3, 0x1

    .line 1687
    invoke-virtual {v2, v3}, Lu95;->f(Z)V

    .line 1688
    .line 1689
    .line 1690
    iget-object v2, v0, Lfz0;->b:Lk00;

    .line 1691
    .line 1692
    invoke-virtual {v2, v3}, Lk25;->f(Z)V

    .line 1693
    .line 1694
    .line 1695
    new-instance v2, Lo00;

    .line 1696
    .line 1697
    invoke-direct {v2, v1, v0}, Lo00;-><init>(Ll94;Lfz0;)V

    .line 1698
    .line 1699
    .line 1700
    return-object v2

    .line 1701
    :pswitch_14
    check-cast v0, Lv30;

    .line 1702
    .line 1703
    check-cast v1, Lf17;

    .line 1704
    .line 1705
    sget-object v2, Ln07;->a:Le17;

    .line 1706
    .line 1707
    new-instance v3, Lm07;

    .line 1708
    .line 1709
    invoke-virtual {v0}, Lv30;->a()J

    .line 1710
    .line 1711
    .line 1712
    move-result-wide v5

    .line 1713
    sget-object v7, Ll07;->Y:Ll07;

    .line 1714
    .line 1715
    const/4 v8, 0x1

    .line 1716
    sget-object v4, Lev2;->X:Lev2;

    .line 1717
    .line 1718
    invoke-direct/range {v3 .. v8}, Lm07;-><init>(Lev2;JLl07;Z)V

    .line 1719
    .line 1720
    .line 1721
    invoke-interface {v1, v2, v3}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 1722
    .line 1723
    .line 1724
    return-object v12

    .line 1725
    :pswitch_15
    check-cast v0, Landroid/content/res/Resources;

    .line 1726
    .line 1727
    check-cast v1, Ly07;

    .line 1728
    .line 1729
    invoke-static {v1, v0}, Lvr3;->L(Ly07;Landroid/content/res/Resources;)Z

    .line 1730
    .line 1731
    .line 1732
    move-result v0

    .line 1733
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    return-object v0

    .line 1738
    :pswitch_16
    check-cast v0, Lff3;

    .line 1739
    .line 1740
    check-cast v1, Ly07;

    .line 1741
    .line 1742
    iget v1, v1, Ly07;->f:I

    .line 1743
    .line 1744
    invoke-virtual {v0, v1}, Lff3;->a(I)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v0

    .line 1748
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    return-object v0

    .line 1753
    :pswitch_17
    const-wide v16, 0xffffffffL

    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    const/16 v18, 0x20

    .line 1759
    .line 1760
    check-cast v0, Ltb;

    .line 1761
    .line 1762
    check-cast v1, Lti4;

    .line 1763
    .line 1764
    iget-object v0, v0, Ltb;->r0:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1765
    .line 1766
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lje3;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v2

    .line 1770
    iget-object v2, v2, Lje3;->i0:Loh5;

    .line 1771
    .line 1772
    invoke-virtual {v2}, Loh5;->l()I

    .line 1773
    .line 1774
    .line 1775
    move-result v2

    .line 1776
    if-lez v2, :cond_2d

    .line 1777
    .line 1778
    sget-object v2, Lg29;->a:Lvz4;

    .line 1779
    .line 1780
    const/4 v2, 0x1

    .line 1781
    iput-boolean v2, v1, Lti4;->X:Z

    .line 1782
    .line 1783
    iget-object v2, v1, Lti4;->f0:Lvi4;

    .line 1784
    .line 1785
    invoke-virtual {v2}, Lvi4;->m0()Ly24;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v5

    .line 1789
    iget-wide v6, v1, Lti4;->Y:J

    .line 1790
    .line 1791
    const-wide v10, 0x7fffffff7fffffffL

    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    invoke-static {v6, v7, v10, v11}, Lhf3;->a(JJ)Z

    .line 1797
    .line 1798
    .line 1799
    move-result v6

    .line 1800
    if-eqz v6, :cond_2a

    .line 1801
    .line 1802
    invoke-interface {v5, v3, v4}, Ly24;->n(J)J

    .line 1803
    .line 1804
    .line 1805
    move-result-wide v3

    .line 1806
    invoke-static {v3, v4}, Lnr4;->M(J)J

    .line 1807
    .line 1808
    .line 1809
    move-result-wide v3

    .line 1810
    iput-wide v3, v1, Lti4;->Y:J

    .line 1811
    .line 1812
    invoke-interface {v5}, Ly24;->j()J

    .line 1813
    .line 1814
    .line 1815
    move-result-wide v3

    .line 1816
    iput-wide v3, v1, Lti4;->Z:J

    .line 1817
    .line 1818
    :cond_2a
    invoke-virtual {v2}, Lvi4;->r0()Landroidx/compose/ui/node/LayoutNode;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v2

    .line 1822
    iget-object v2, v2, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 1823
    .line 1824
    invoke-virtual {v2}, Lr34;->b()V

    .line 1825
    .line 1826
    .line 1827
    invoke-interface {v5}, Ly24;->j()J

    .line 1828
    .line 1829
    .line 1830
    move-result-wide v2

    .line 1831
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lje3;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v4

    .line 1835
    iget-object v4, v4, Lje3;->h0:Ls05;

    .line 1836
    .line 1837
    shr-long v5, v2, v18

    .line 1838
    .line 1839
    long-to-int v5, v5

    .line 1840
    and-long v2, v2, v16

    .line 1841
    .line 1842
    long-to-int v2, v2

    .line 1843
    sget-object v3, Lg29;->b:[Le29;

    .line 1844
    .line 1845
    array-length v6, v3

    .line 1846
    move v7, v9

    .line 1847
    :goto_13
    if-ge v7, v6, :cond_2c

    .line 1848
    .line 1849
    aget-object v8, v3, v7

    .line 1850
    .line 1851
    invoke-virtual {v4, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v10

    .line 1855
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1856
    .line 1857
    .line 1858
    check-cast v10, Lr29;

    .line 1859
    .line 1860
    move-object v11, v8

    .line 1861
    check-cast v11, Lf29;

    .line 1862
    .line 1863
    iget-object v11, v11, Lf29;->c:Lgd3;

    .line 1864
    .line 1865
    iget-wide v13, v10, Lr29;->h:J

    .line 1866
    .line 1867
    move-object/from16 v21, v1

    .line 1868
    .line 1869
    move/from16 v26, v2

    .line 1870
    .line 1871
    move/from16 v25, v5

    .line 1872
    .line 1873
    move-object/from16 v22, v11

    .line 1874
    .line 1875
    move-wide/from16 v23, v13

    .line 1876
    .line 1877
    invoke-static/range {v21 .. v26}, Lg29;->a(Lti4;Lgd3;JII)V

    .line 1878
    .line 1879
    .line 1880
    iget-object v1, v10, Lr29;->b:Lrh5;

    .line 1881
    .line 1882
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v1

    .line 1886
    check-cast v1, Ljava/lang/Boolean;

    .line 1887
    .line 1888
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1889
    .line 1890
    .line 1891
    move-result v1

    .line 1892
    if-eqz v1, :cond_2b

    .line 1893
    .line 1894
    iget-object v1, v10, Lr29;->f:Lgd3;

    .line 1895
    .line 1896
    iget-wide v13, v10, Lr29;->j:J

    .line 1897
    .line 1898
    move-object/from16 v22, v1

    .line 1899
    .line 1900
    move-wide/from16 v23, v13

    .line 1901
    .line 1902
    invoke-static/range {v21 .. v26}, Lg29;->a(Lti4;Lgd3;JII)V

    .line 1903
    .line 1904
    .line 1905
    iget-object v1, v10, Lr29;->g:Lgd3;

    .line 1906
    .line 1907
    iget-wide v13, v10, Lr29;->k:J

    .line 1908
    .line 1909
    move-object/from16 v22, v1

    .line 1910
    .line 1911
    move-wide/from16 v23, v13

    .line 1912
    .line 1913
    invoke-static/range {v21 .. v26}, Lg29;->a(Lti4;Lgd3;JII)V

    .line 1914
    .line 1915
    .line 1916
    :cond_2b
    check-cast v8, Lf29;

    .line 1917
    .line 1918
    iget-object v1, v8, Lf29;->d:Lgd3;

    .line 1919
    .line 1920
    iget-wide v10, v10, Lr29;->i:J

    .line 1921
    .line 1922
    move-object/from16 v22, v1

    .line 1923
    .line 1924
    move-wide/from16 v23, v10

    .line 1925
    .line 1926
    invoke-static/range {v21 .. v26}, Lg29;->a(Lti4;Lgd3;JII)V

    .line 1927
    .line 1928
    .line 1929
    move-object/from16 v1, v21

    .line 1930
    .line 1931
    add-int/lit8 v7, v7, 0x1

    .line 1932
    .line 1933
    move/from16 v5, v25

    .line 1934
    .line 1935
    move/from16 v2, v26

    .line 1936
    .line 1937
    goto :goto_13

    .line 1938
    :cond_2c
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lje3;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v2

    .line 1942
    iget-object v2, v2, Lje3;->j0:Lj05;

    .line 1943
    .line 1944
    invoke-virtual {v2}, Lj05;->j()Z

    .line 1945
    .line 1946
    .line 1947
    move-result v3

    .line 1948
    if-eqz v3, :cond_2d

    .line 1949
    .line 1950
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()Lje3;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v0

    .line 1954
    iget-object v0, v0, Lje3;->k0:Lvd7;

    .line 1955
    .line 1956
    iget-object v3, v2, Lj05;->a:[Ljava/lang/Object;

    .line 1957
    .line 1958
    iget v2, v2, Lj05;->b:I

    .line 1959
    .line 1960
    :goto_14
    if-ge v9, v2, :cond_2d

    .line 1961
    .line 1962
    aget-object v4, v3, v9

    .line 1963
    .line 1964
    check-cast v4, Ly05;

    .line 1965
    .line 1966
    invoke-virtual {v0, v9}, Lvd7;->get(I)Ljava/lang/Object;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v5

    .line 1970
    check-cast v5, Lgd3;

    .line 1971
    .line 1972
    invoke-interface {v4}, Llh7;->getValue()Ljava/lang/Object;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v4

    .line 1976
    check-cast v4, Landroid/graphics/Rect;

    .line 1977
    .line 1978
    invoke-virtual {v5}, Lgd3;->b()Lw03;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v6

    .line 1982
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 1983
    .line 1984
    int-to-float v7, v7

    .line 1985
    invoke-virtual {v1, v6, v7}, Lti4;->a(Lw03;F)V

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual {v5}, Lgd3;->d()Lw03;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v6

    .line 1992
    iget v7, v4, Landroid/graphics/Rect;->top:I

    .line 1993
    .line 1994
    int-to-float v7, v7

    .line 1995
    invoke-virtual {v1, v6, v7}, Lti4;->a(Lw03;F)V

    .line 1996
    .line 1997
    .line 1998
    invoke-virtual {v5}, Lgd3;->c()Lw03;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v6

    .line 2002
    iget v7, v4, Landroid/graphics/Rect;->right:I

    .line 2003
    .line 2004
    int-to-float v7, v7

    .line 2005
    invoke-virtual {v1, v6, v7}, Lti4;->a(Lw03;F)V

    .line 2006
    .line 2007
    .line 2008
    invoke-virtual {v5}, Lgd3;->a()Lw03;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v5

    .line 2012
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 2013
    .line 2014
    int-to-float v4, v4

    .line 2015
    invoke-virtual {v1, v5, v4}, Lti4;->a(Lw03;F)V

    .line 2016
    .line 2017
    .line 2018
    add-int/lit8 v9, v9, 0x1

    .line 2019
    .line 2020
    goto :goto_14

    .line 2021
    :cond_2d
    return-object v12

    .line 2022
    :pswitch_18
    check-cast v0, Lug2;

    .line 2023
    .line 2024
    check-cast v1, Lai2;

    .line 2025
    .line 2026
    iget v0, v0, Lug2;->a:I

    .line 2027
    .line 2028
    invoke-virtual {v1, v0}, Lai2;->g1(I)Z

    .line 2029
    .line 2030
    .line 2031
    move-result v0

    .line 2032
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v0

    .line 2036
    return-object v0

    .line 2037
    :pswitch_19
    check-cast v0, Lo34;

    .line 2038
    .line 2039
    check-cast v1, Lv8;

    .line 2040
    .line 2041
    invoke-interface {v1}, Lv8;->l()I

    .line 2042
    .line 2043
    .line 2044
    move-result v2

    .line 2045
    const v3, 0x7fffffff

    .line 2046
    .line 2047
    .line 2048
    if-ne v2, v3, :cond_2e

    .line 2049
    .line 2050
    goto/16 :goto_18

    .line 2051
    .line 2052
    :cond_2e
    invoke-interface {v1}, Lv8;->c()Lo34;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v2

    .line 2056
    iget-boolean v2, v2, Lo34;->b:Z

    .line 2057
    .line 2058
    if-eqz v2, :cond_2f

    .line 2059
    .line 2060
    invoke-interface {v1}, Lv8;->B()V

    .line 2061
    .line 2062
    .line 2063
    :cond_2f
    invoke-interface {v1}, Lv8;->c()Lo34;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v2

    .line 2067
    iget-object v2, v2, Lo34;->i:Ljava/util/HashMap;

    .line 2068
    .line 2069
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v2

    .line 2073
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v2

    .line 2077
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2078
    .line 2079
    .line 2080
    move-result v3

    .line 2081
    if-eqz v3, :cond_30

    .line 2082
    .line 2083
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v3

    .line 2087
    check-cast v3, Ljava/util/Map$Entry;

    .line 2088
    .line 2089
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v4

    .line 2093
    check-cast v4, Lr8;

    .line 2094
    .line 2095
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v3

    .line 2099
    check-cast v3, Ljava/lang/Number;

    .line 2100
    .line 2101
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2102
    .line 2103
    .line 2104
    move-result v3

    .line 2105
    invoke-interface {v1}, Lv8;->d()Lfd3;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v5

    .line 2109
    invoke-virtual {v0, v4, v3, v5}, Lo34;->a(Lr8;ILi55;)V

    .line 2110
    .line 2111
    .line 2112
    goto :goto_15

    .line 2113
    :cond_30
    invoke-interface {v1}, Lv8;->d()Lfd3;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v1

    .line 2117
    iget-object v1, v1, Li55;->y0:Li55;

    .line 2118
    .line 2119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2120
    .line 2121
    .line 2122
    :goto_16
    iget-object v2, v0, Lo34;->a:Lv8;

    .line 2123
    .line 2124
    invoke-interface {v2}, Lv8;->d()Lfd3;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v2

    .line 2128
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2129
    .line 2130
    .line 2131
    move-result v2

    .line 2132
    if-nez v2, :cond_32

    .line 2133
    .line 2134
    invoke-virtual {v0, v1}, Lo34;->b(Li55;)Ljava/util/Map;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v2

    .line 2138
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v2

    .line 2142
    check-cast v2, Ljava/lang/Iterable;

    .line 2143
    .line 2144
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v2

    .line 2148
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2149
    .line 2150
    .line 2151
    move-result v3

    .line 2152
    if-eqz v3, :cond_31

    .line 2153
    .line 2154
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v3

    .line 2158
    check-cast v3, Lr8;

    .line 2159
    .line 2160
    invoke-virtual {v0, v1, v3}, Lo34;->c(Li55;Lr8;)I

    .line 2161
    .line 2162
    .line 2163
    move-result v4

    .line 2164
    invoke-virtual {v0, v3, v4, v1}, Lo34;->a(Lr8;ILi55;)V

    .line 2165
    .line 2166
    .line 2167
    goto :goto_17

    .line 2168
    :cond_31
    iget-object v1, v1, Li55;->y0:Li55;

    .line 2169
    .line 2170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2171
    .line 2172
    .line 2173
    goto :goto_16

    .line 2174
    :cond_32
    :goto_18
    return-object v12

    .line 2175
    :pswitch_1a
    check-cast v0, Lg7;

    .line 2176
    .line 2177
    check-cast v1, Le38;

    .line 2178
    .line 2179
    iget-object v2, v0, Lg7;->s0:Ld67;

    .line 2180
    .line 2181
    sget-object v3, Lpc;->b:Lox1;

    .line 2182
    .line 2183
    invoke-static {v0, v3}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v0

    .line 2187
    invoke-virtual {v2, v1, v0}, Ld67;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2188
    .line 2189
    .line 2190
    return-object v12

    .line 2191
    :pswitch_1b
    check-cast v0, Lb2;

    .line 2192
    .line 2193
    check-cast v1, Ljava/util/Map$Entry;

    .line 2194
    .line 2195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2199
    .line 2200
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v3

    .line 2204
    const-string v4, "(this Map)"

    .line 2205
    .line 2206
    if-ne v3, v0, :cond_33

    .line 2207
    .line 2208
    move-object v3, v4

    .line 2209
    goto :goto_19

    .line 2210
    :cond_33
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v3

    .line 2214
    :goto_19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2215
    .line 2216
    .line 2217
    const/16 v3, 0x3d

    .line 2218
    .line 2219
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2220
    .line 2221
    .line 2222
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v1

    .line 2226
    if-ne v1, v0, :cond_34

    .line 2227
    .line 2228
    goto :goto_1a

    .line 2229
    :cond_34
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v4

    .line 2233
    :goto_1a
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2234
    .line 2235
    .line 2236
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v0

    .line 2240
    return-object v0

    .line 2241
    :pswitch_1c
    check-cast v0, Lz0;

    .line 2242
    .line 2243
    if-ne v1, v0, :cond_35

    .line 2244
    .line 2245
    const-string v0, "(this Collection)"

    .line 2246
    .line 2247
    goto :goto_1b

    .line 2248
    :cond_35
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v0

    .line 2252
    :goto_1b
    return-object v0

    .line 2253
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

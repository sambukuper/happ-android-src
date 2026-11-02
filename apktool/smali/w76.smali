.class public final synthetic Lw76;
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
    iput-byte p1, p0, Lw76;->X:B

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
    .locals 6

    .line 1
    iget-byte p0, p0, Lw76;->X:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget p0, Lsu/happ/proxyutility/ui/ServerActivity;->c3:I

    .line 11
    .line 12
    const-string p0, "MAIN"

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
    new-instance p0, Lfa0;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    new-instance p0, Lu17;

    .line 30
    .line 31
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 32
    .line 33
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->a()Lqo;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0, v0}, Lu17;-><init>(Lqo;)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 46
    .line 47
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_3
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 57
    .line 58
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->x0:Lvz7;

    .line 63
    .line 64
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lvr1;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 72
    .line 73
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->a()Lqo;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_5
    return-object v2

    .line 83
    :pswitch_6
    new-instance p0, Lay6;

    .line 84
    .line 85
    invoke-direct {p0, v1}, Lay6;-><init>(I)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_7
    return-object v2

    .line 90
    :pswitch_8
    new-instance p0, Ljv6;

    .line 91
    .line 92
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v0}, Ljv6;-><init>(Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_9
    new-instance p0, Lak7;

    .line 102
    .line 103
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 104
    .line 105
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-direct {p0, v0}, Lak7;-><init>(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_a
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 121
    .line 122
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_b
    sget p0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->T0:I

    .line 132
    .line 133
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 134
    .line 135
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_c
    sget p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 145
    .line 146
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/EDnsType;->a()Ll22;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    .line 151
    .line 152
    const/16 v2, 0xa

    .line 153
    .line 154
    invoke-static {p0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_0

    .line 170
    .line 171
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 176
    .line 177
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/enums/EDnsType;->b()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_0
    new-array p0, v1, [Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    check-cast p0, [Ljava/lang/String;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_d
    sget p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 195
    .line 196
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 197
    .line 198
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :pswitch_e
    sget-object p0, Lkw4;->a:Lkw4;

    .line 208
    .line 209
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_f
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 215
    .line 216
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->i()Lig8;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_10
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 226
    .line 227
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :pswitch_11
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 237
    .line 238
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->f0:Lvz7;

    .line 243
    .line 244
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    check-cast p0, Lht1;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_12
    sget-object p0, Lyw2;->a:Lsu2;

    .line 252
    .line 253
    new-instance v0, Lan6;

    .line 254
    .line 255
    invoke-direct {v0}, Lyi8;-><init>()V

    .line 256
    .line 257
    .line 258
    new-instance v1, Lsu/happ/proxyutility/util/adapters/ParsingRoutingAdapter;

    .line 259
    .line 260
    invoke-direct {v1}, Lsu/happ/proxyutility/util/adapters/ParsingRoutingAdapter;-><init>()V

    .line 261
    .line 262
    .line 263
    iget-object v0, v0, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 264
    .line 265
    invoke-virtual {p0, v0, v1}, Lsu2;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Lcom/google/gson/a;

    .line 269
    .line 270
    invoke-direct {v0, p0}, Lcom/google/gson/a;-><init>(Lsu2;)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_13
    sget-object p0, Lyw2;->a:Lsu2;

    .line 275
    .line 276
    new-instance v0, Lsu/happ/proxyutility/util/adapters/ParsingTypeAdapter;

    .line 277
    .line 278
    invoke-direct {v0}, Lsu/happ/proxyutility/util/adapters/ParsingTypeAdapter;-><init>()V

    .line 279
    .line 280
    .line 281
    const-class v1, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 282
    .line 283
    invoke-virtual {p0, v1, v0}, Lsu2;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    new-instance v0, Lcom/google/gson/a;

    .line 287
    .line 288
    invoke-direct {v0, p0}, Lcom/google/gson/a;-><init>(Lsu2;)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_14
    new-instance p0, Ldl6;

    .line 293
    .line 294
    invoke-direct {p0}, Ldl6;-><init>()V

    .line 295
    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_15
    sget p0, Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;->T0:I

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_16
    sget p0, Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;->T0:I

    .line 302
    .line 303
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 304
    .line 305
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    const-string v1, "activity"

    .line 310
    .line 311
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    instance-of v1, p0, Landroid/app/ActivityManager;

    .line 316
    .line 317
    if-eqz v1, :cond_1

    .line 318
    .line 319
    move-object v2, p0

    .line 320
    check-cast v2, Landroid/app/ActivityManager;

    .line 321
    .line 322
    :cond_1
    if-eqz v2, :cond_2

    .line 323
    .line 324
    invoke-virtual {v2}, Landroid/app/ActivityManager;->clearApplicationUserData()Z

    .line 325
    .line 326
    .line 327
    :cond_2
    return-object v0

    .line 328
    :pswitch_17
    sget p0, Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;->T0:I

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_18
    sget p0, Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;->T0:I

    .line 332
    .line 333
    sget-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 334
    .line 335
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->o0:Lvz7;

    .line 340
    .line 341
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    check-cast p0, Lxj7;

    .line 346
    .line 347
    return-object p0

    .line 348
    :pswitch_19
    invoke-static {}, Lkd6;->values()[Lkd6;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    new-instance v0, Lu22;

    .line 356
    .line 357
    const-string v1, "su.happ.proxyutility.firebase.entity.notification.RemoteMessageEntity.PushType"

    .line 358
    .line 359
    invoke-direct {v0, v1, p0}, Lu22;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 360
    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_1a
    return-object v2

    .line 364
    :pswitch_1b
    sget-object p0, Ly47;->b:Lvz7;

    .line 365
    .line 366
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    check-cast p0, Ljava/util/List;

    .line 371
    .line 372
    new-instance v0, Lmv4;

    .line 373
    .line 374
    const/4 v2, 0x5

    .line 375
    invoke-direct {v0, v2}, Lmv4;-><init>(B)V

    .line 376
    .line 377
    .line 378
    invoke-static {p0, v0}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    new-instance v0, Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    :goto_1
    if-ge v1, v2, :cond_3

    .line 392
    .line 393
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    check-cast v3, Lud1;

    .line 398
    .line 399
    invoke-interface {v3}, Lud1;->a()Lqd1;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    add-int/lit8 v1, v1, 0x1

    .line 407
    .line 408
    goto :goto_1

    .line 409
    :cond_3
    return-object v0

    .line 410
    :pswitch_1c
    sget-object p0, Ly47;->a:Lvz7;

    .line 411
    .line 412
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    check-cast p0, Ljava/util/List;

    .line 417
    .line 418
    new-instance v0, Lmv4;

    .line 419
    .line 420
    const/4 v2, 0x4

    .line 421
    invoke-direct {v0, v2}, Lmv4;-><init>(B)V

    .line 422
    .line 423
    .line 424
    invoke-static {p0, v0}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    new-instance v0, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    :goto_2
    if-ge v1, v2, :cond_4

    .line 438
    .line 439
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    check-cast v3, Lm95;

    .line 444
    .line 445
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    new-instance v3, Lk35;

    .line 449
    .line 450
    new-instance v4, Ldw4;

    .line 451
    .line 452
    const/16 v5, 0xd

    .line 453
    .line 454
    invoke-direct {v4, v5}, Ldw4;-><init>(B)V

    .line 455
    .line 456
    .line 457
    invoke-direct {v3, v4}, Lk35;-><init>(Ldw4;)V

    .line 458
    .line 459
    .line 460
    const-class v4, Ldq8;

    .line 461
    .line 462
    sget-object v5, Lyb6;->a:Lzb6;

    .line 463
    .line 464
    invoke-virtual {v5, v4}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    new-instance v5, Lqg5;

    .line 469
    .line 470
    invoke-direct {v5, v3, v4}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    add-int/lit8 v1, v1, 0x1

    .line 477
    .line 478
    goto :goto_2

    .line 479
    :cond_4
    return-object v0

    .line 480
    nop

    .line 481
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

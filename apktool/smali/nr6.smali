.class public final Lnr6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:[Ljava/lang/String;

.field public final synthetic Z:Ly45;


# direct methods
.method public synthetic constructor <init>(Ly45;[Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lnr6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lnr6;->Z:Ly45;

    .line 4
    .line 5
    iput-object p2, p0, Lnr6;->Y:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lnr6;->X:B

    .line 2
    .line 3
    sget-object v1, Los8;->X:Los8;

    .line 4
    .line 5
    iget-object v2, p0, Lnr6;->Y:[Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lnr6;->Z:Ly45;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lor6;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    array-length v0, v2

    .line 21
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    array-length v5, v2

    .line 30
    move v6, v4

    .line 31
    :goto_0
    if-ge v6, v5, :cond_3

    .line 32
    .line 33
    aget-object v7, v2, v6

    .line 34
    .line 35
    iget-object v8, p0, Lor6;->X:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v9, v7}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-nez v9, :cond_0

    .line 46
    .line 47
    new-instance v8, Lgl5;

    .line 48
    .line 49
    invoke-direct {v8, v7, v3, v4}, Lgl5;-><init>(Ljava/lang/String;ZZ)V

    .line 50
    .line 51
    .line 52
    new-instance v7, Low6;

    .line 53
    .line 54
    invoke-direct {v7, v8}, Low6;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-virtual {v9, v7, v10}, Landroid/content/pm/PackageManager;->isPermissionRevokedByPolicy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_1

    .line 82
    .line 83
    new-instance v8, Lgl5;

    .line 84
    .line 85
    invoke-direct {v8, v7, v4, v4}, Lgl5;-><init>(Ljava/lang/String;ZZ)V

    .line 86
    .line 87
    .line 88
    new-instance v7, Low6;

    .line 89
    .line 90
    invoke-direct {v7, v8}, Low6;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    check-cast v9, Lx16;

    .line 102
    .line 103
    if-nez v9, :cond_2

    .line 104
    .line 105
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    new-instance v9, Lx16;

    .line 109
    .line 110
    new-instance v10, Lw16;

    .line 111
    .line 112
    invoke-direct {v10}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 113
    .line 114
    .line 115
    sget-object v11, Lw16;->Y:[Lv16;

    .line 116
    .line 117
    invoke-virtual {v10, v11}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v9, v10}, Lx16;-><init>(Lw16;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Lx16;

    .line 128
    .line 129
    :cond_2
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_4

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    new-array v2, v2, [Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, [Ljava/lang/String;

    .line 152
    .line 153
    const-string v2, ", "

    .line 154
    .line 155
    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    const/16 v2, 0x2a

    .line 159
    .line 160
    invoke-virtual {p0, v0, v2}, Landroid/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    :cond_4
    new-instance p0, Lva5;

    .line 164
    .line 165
    const/4 v0, 0x2

    .line 166
    invoke-direct {p0, p1, v0}, Lva5;-><init>(Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0}, Lq85;->c(Lo85;)Lq85;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    instance-of p1, p0, Low6;

    .line 174
    .line 175
    if-eqz p1, :cond_5

    .line 176
    .line 177
    check-cast p0, Low6;

    .line 178
    .line 179
    new-instance p1, Lya5;

    .line 180
    .line 181
    invoke-direct {p1, p0, v1}, Lya5;-><init>(Low6;Lcn2;)V

    .line 182
    .line 183
    .line 184
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    goto :goto_2

    .line 189
    :cond_5
    new-instance p1, Lva5;

    .line 190
    .line 191
    invoke-direct {p1, p0, v4}, Lva5;-><init>(Ljava/lang/Object;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    :goto_2
    return-object p0

    .line 199
    :pswitch_0
    sget-object v0, Ljm4;->g0:Lhd5;

    .line 200
    .line 201
    check-cast p1, Lq85;

    .line 202
    .line 203
    array-length v5, v2

    .line 204
    const/4 v6, 0x0

    .line 205
    if-eqz v5, :cond_e

    .line 206
    .line 207
    array-length v5, v2

    .line 208
    move v7, v4

    .line 209
    :goto_3
    if-ge v7, v5, :cond_7

    .line 210
    .line 211
    aget-object v8, v2, v7

    .line 212
    .line 213
    iget-object v9, p0, Ly45;->X:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v9, Lor6;

    .line 216
    .line 217
    iget-object v9, v9, Lor6;->X:Ljava/util/HashMap;

    .line 218
    .line 219
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-nez v8, :cond_6

    .line 224
    .line 225
    sget-object v5, Lg02;->X:Lq85;

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_7
    new-instance v5, Low6;

    .line 232
    .line 233
    invoke-direct {v5, v6}, Low6;-><init>(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :goto_4
    const-class v7, Low6;

    .line 237
    .line 238
    if-nez p1, :cond_8

    .line 239
    .line 240
    new-instance p1, Low6;

    .line 241
    .line 242
    invoke-direct {p1, v6}, Low6;-><init>(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_8
    filled-new-array {p1, v5}, [Lq85;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    new-instance v5, Lva5;

    .line 251
    .line 252
    invoke-direct {v5, p1, v3}, Lva5;-><init>(Ljava/lang/Object;B)V

    .line 253
    .line 254
    .line 255
    invoke-static {v5}, Lq85;->c(Lo85;)Lq85;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    if-ne v5, v7, :cond_9

    .line 264
    .line 265
    check-cast p1, Low6;

    .line 266
    .line 267
    new-instance v5, Lya5;

    .line 268
    .line 269
    invoke-direct {v5, p1, v1}, Lya5;-><init>(Low6;Lcn2;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v5}, Lq85;->c(Lo85;)Lq85;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    goto :goto_5

    .line 277
    :cond_9
    new-instance v5, Lya5;

    .line 278
    .line 279
    iget-object p1, p1, Lq85;->X:Lo85;

    .line 280
    .line 281
    invoke-direct {v5, p1, v0, v4}, Lya5;-><init>(Ljava/lang/Object;Lcn2;B)V

    .line 282
    .line 283
    .line 284
    invoke-static {v5}, Lq85;->c(Lo85;)Lq85;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    :goto_5
    new-instance v5, Lnr6;

    .line 289
    .line 290
    invoke-direct {v5, p0, v2, v3}, Lnr6;-><init>(Ly45;[Ljava/lang/String;B)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    if-ne p0, v7, :cond_a

    .line 298
    .line 299
    check-cast p1, Low6;

    .line 300
    .line 301
    new-instance p0, Lya5;

    .line 302
    .line 303
    invoke-direct {p0, p1, v5}, Lya5;-><init>(Low6;Lcn2;)V

    .line 304
    .line 305
    .line 306
    invoke-static {p0}, Lq85;->c(Lo85;)Lq85;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    goto :goto_6

    .line 311
    :cond_a
    new-instance p0, Lya5;

    .line 312
    .line 313
    invoke-direct {p0, p1, v5, v3}, Lya5;-><init>(Ljava/lang/Object;Lcn2;B)V

    .line 314
    .line 315
    .line 316
    invoke-static {p0}, Lq85;->c(Lo85;)Lq85;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    if-ne p1, v7, :cond_b

    .line 325
    .line 326
    check-cast p0, Low6;

    .line 327
    .line 328
    new-instance p1, Lya5;

    .line 329
    .line 330
    invoke-direct {p1, p0, v1}, Lya5;-><init>(Low6;Lcn2;)V

    .line 331
    .line 332
    .line 333
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    goto :goto_6

    .line 338
    :cond_b
    new-instance p1, Lya5;

    .line 339
    .line 340
    iget-object p0, p0, Lq85;->X:Lo85;

    .line 341
    .line 342
    invoke-direct {p1, p0, v0, v4}, Lya5;-><init>(Ljava/lang/Object;Lcn2;B)V

    .line 343
    .line 344
    .line 345
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    :goto_6
    array-length p1, v2

    .line 350
    new-instance v2, Lbd5;

    .line 351
    .line 352
    invoke-direct {v2, p1, p1}, Lbd5;-><init>(II)V

    .line 353
    .line 354
    .line 355
    new-instance p1, Lya5;

    .line 356
    .line 357
    iget-object p0, p0, Lq85;->X:Lo85;

    .line 358
    .line 359
    invoke-direct {p1, p0, v2, v4}, Lya5;-><init>(Ljava/lang/Object;Lcn2;B)V

    .line 360
    .line 361
    .line 362
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    new-instance p1, Lwe5;

    .line 367
    .line 368
    const/16 v2, 0x11

    .line 369
    .line 370
    invoke-direct {p1, v2}, Lwe5;-><init>(B)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    if-ne v2, v7, :cond_c

    .line 378
    .line 379
    check-cast p0, Low6;

    .line 380
    .line 381
    new-instance v0, Lya5;

    .line 382
    .line 383
    invoke-direct {v0, p0, p1}, Lya5;-><init>(Low6;Lcn2;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v0}, Lq85;->c(Lo85;)Lq85;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    goto :goto_7

    .line 391
    :cond_c
    new-instance v2, Lya5;

    .line 392
    .line 393
    invoke-direct {v2, p0, p1, v3}, Lya5;-><init>(Ljava/lang/Object;Lcn2;B)V

    .line 394
    .line 395
    .line 396
    invoke-static {v2}, Lq85;->c(Lo85;)Lq85;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    if-ne p1, v7, :cond_d

    .line 405
    .line 406
    check-cast p0, Low6;

    .line 407
    .line 408
    new-instance p1, Lya5;

    .line 409
    .line 410
    invoke-direct {p1, p0, v1}, Lya5;-><init>(Low6;Lcn2;)V

    .line 411
    .line 412
    .line 413
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    goto :goto_7

    .line 418
    :cond_d
    new-instance p1, Lya5;

    .line 419
    .line 420
    iget-object p0, p0, Lq85;->X:Lo85;

    .line 421
    .line 422
    invoke-direct {p1, p0, v0, v4}, Lya5;-><init>(Ljava/lang/Object;Lcn2;B)V

    .line 423
    .line 424
    .line 425
    invoke-static {p1}, Lq85;->c(Lo85;)Lq85;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    goto :goto_7

    .line 430
    :cond_e
    const-string p0, "RxPermissions.request/requestEach requires at least one input permission"

    .line 431
    .line 432
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    :goto_7
    return-object v6

    .line 436
    nop

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

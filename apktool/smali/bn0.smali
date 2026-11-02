.class public final synthetic Lbn0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld41;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lbn0;->a:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Llr;B)V
    .locals 0

    .line 7
    iput-byte p2, p0, Lbn0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, Lbn0;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "Samsung"

    .line 7
    .line 8
    const-string v3, "Vivo"

    .line 9
    .line 10
    const/16 v4, 0x21

    .line 11
    .line 12
    const-string v5, "DeviceQuirks"

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Ljava/util/Set;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    sget-object v0, Lui7;->X:Lui7;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Lg26;

    .line 28
    .line 29
    new-instance v8, Li26;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v9, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    sget v10, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;->b:I

    .line 40
    .line 41
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v11, 0x22

    .line 44
    .line 45
    if-lt v10, v11, :cond_5

    .line 46
    .line 47
    new-instance v12, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;

    .line 48
    .line 49
    sget-object v12, Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;->a:Lvz7;

    .line 50
    .line 51
    invoke-virtual {v12}, Lvz7;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    check-cast v12, La10;

    .line 56
    .line 57
    sget-object v13, Lwz3;->a:Lvz3;

    .line 58
    .line 59
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v14, v13, Lvz3;->d:Lei3;

    .line 66
    .line 67
    invoke-virtual {v14}, Lei3;->invoke()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    check-cast v14, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    if-eqz v14, :cond_2

    .line 78
    .line 79
    iget-object v13, v13, Lvz3;->c:Ljava/util/Set;

    .line 80
    .line 81
    sget-object v14, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 82
    .line 83
    invoke-interface {v13, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    if-eqz v13, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    iget-object v12, v12, La10;->a:Ly45;

    .line 91
    .line 92
    iget-object v12, v12, Ly45;->X:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v12, Lvz7;

    .line 95
    .line 96
    invoke-virtual {v12}, Lvz7;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    check-cast v12, Ljava/util/Set;

    .line 101
    .line 102
    const/4 v13, 0x5

    .line 103
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-interface {v12, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    if-eqz v12, :cond_1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    sget-object v0, Lui7;->Z:Lui7;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    sget-object v0, Lui7;->Y:Lui7;

    .line 118
    .line 119
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    if-eq v0, v7, :cond_5

    .line 126
    .line 127
    const/4 v12, 0x2

    .line 128
    if-eq v0, v12, :cond_5

    .line 129
    .line 130
    const/4 v12, 0x3

    .line 131
    if-ne v0, v12, :cond_3

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_1d

    .line 138
    .line 139
    :cond_4
    :goto_1
    move v0, v7

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    const/4 v0, 0x0

    .line 142
    :goto_2
    const-class v12, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;

    .line 143
    .line 144
    invoke-virtual {v1, v12, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    new-instance v0, Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_6
    sget-boolean v0, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->a:Z

    .line 159
    .line 160
    if-nez v0, :cond_8

    .line 161
    .line 162
    sget-boolean v0, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->b:Z

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_7
    const/16 v0, 0x1e

    .line 168
    .line 169
    if-gt v0, v10, :cond_9

    .line 170
    .line 171
    if-ge v10, v11, :cond_9

    .line 172
    .line 173
    const-string v0, "Oppo"

    .line 174
    .line 175
    invoke-static {v0}, Ltc;->q(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_8

    .line 180
    .line 181
    const-string v0, "OnePlus"

    .line 182
    .line 183
    invoke-static {v0}, Ltc;->q(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-nez v0, :cond_8

    .line 188
    .line 189
    const-string v0, "Realme"

    .line 190
    .line 191
    invoke-static {v0}, Ltc;->q(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_9

    .line 196
    .line 197
    :cond_8
    :goto_3
    move v0, v7

    .line 198
    goto :goto_4

    .line 199
    :cond_9
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_8

    .line 209
    .line 210
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_a

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_a
    sget-boolean v0, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->c:Z

    .line 223
    .line 224
    if-eqz v0, :cond_b

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_b
    sget-boolean v0, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->e:Z

    .line 228
    .line 229
    if-eqz v0, :cond_c

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_c
    sget-boolean v0, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->d:Z

    .line 233
    .line 234
    if-eqz v0, :cond_d

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_d
    const/4 v0, 0x0

    .line 238
    :goto_4
    const-class v11, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;

    .line 239
    .line 240
    invoke-virtual {v1, v11, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_e

    .line 245
    .line 246
    new-instance v0, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;

    .line 247
    .line 248
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    :cond_e
    sget-object v0, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;->a:Ljava/util/List;

    .line 255
    .line 256
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 262
    .line 263
    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-interface {v0, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    const-class v13, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 275
    .line 276
    invoke-virtual {v1, v13, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_f

    .line 281
    .line 282
    new-instance v0, Landroidx/camera/camera2/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 283
    .line 284
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    :cond_f
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    const-string v13, "Jio"

    .line 296
    .line 297
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v14

    .line 301
    if-nez v14, :cond_10

    .line 302
    .line 303
    sget-object v14, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v14, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    if-eqz v13, :cond_11

    .line 313
    .line 314
    :cond_10
    const-string v13, "LS1542QW"

    .line 315
    .line 316
    invoke-static {v11, v7, v13}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result v13

    .line 320
    if-eqz v13, :cond_11

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v13

    .line 327
    if-nez v13, :cond_12

    .line 328
    .line 329
    sget-object v13, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result v13

    .line 338
    if-eqz v13, :cond_13

    .line 339
    .line 340
    :cond_12
    const-string v13, "SM-A025"

    .line 341
    .line 342
    invoke-static {v11, v7, v13}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    if-nez v13, :cond_16

    .line 347
    .line 348
    const-string v13, "SM-S124DL"

    .line 349
    .line 350
    invoke-virtual {v11, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v13

    .line 354
    if-eqz v13, :cond_13

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_13
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    if-nez v13, :cond_14

    .line 362
    .line 363
    sget-object v13, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v13, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    if-eqz v3, :cond_15

    .line 373
    .line 374
    :cond_14
    const-string v3, "VIVO 2039"

    .line 375
    .line 376
    invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-eqz v3, :cond_15

    .line 381
    .line 382
    goto :goto_5

    .line 383
    :cond_15
    const/4 v3, 0x0

    .line 384
    goto :goto_6

    .line 385
    :cond_16
    :goto_5
    move v3, v7

    .line 386
    :goto_6
    const-class v13, Landroidx/camera/camera2/compat/quirk/ControlZoomRatioRangeAssertionErrorQuirk;

    .line 387
    .line 388
    invoke-virtual {v1, v13, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_17

    .line 393
    .line 394
    new-instance v3, Landroidx/camera/camera2/compat/quirk/ControlZoomRatioRangeAssertionErrorQuirk;

    .line 395
    .line 396
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    :cond_17
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;->a:Z

    .line 403
    .line 404
    const-string v3, "Tecno"

    .line 405
    .line 406
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    if-nez v13, :cond_1b

    .line 411
    .line 412
    sget-object v13, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v13, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-eqz v3, :cond_18

    .line 422
    .line 423
    goto :goto_7

    .line 424
    :cond_18
    const-string v3, "Tecno-mobile"

    .line 425
    .line 426
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 427
    .line 428
    .line 429
    move-result v14

    .line 430
    if-nez v14, :cond_1b

    .line 431
    .line 432
    invoke-virtual {v13, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eqz v3, :cond_19

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_19
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;->a:Z

    .line 440
    .line 441
    if-nez v3, :cond_1b

    .line 442
    .line 443
    sget-boolean v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;->b:Z

    .line 444
    .line 445
    if-eqz v3, :cond_1a

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_1a
    const/4 v3, 0x0

    .line 449
    goto :goto_8

    .line 450
    :cond_1b
    :goto_7
    move v3, v7

    .line 451
    :goto_8
    const-class v13, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;

    .line 452
    .line 453
    invoke-virtual {v1, v13, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    if-eqz v3, :cond_1c

    .line 458
    .line 459
    new-instance v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;

    .line 460
    .line 461
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    :cond_1c
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    const-string v13, "Xiaomi"

    .line 472
    .line 473
    if-nez v3, :cond_1f

    .line 474
    .line 475
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 481
    .line 482
    .line 483
    move-result v14

    .line 484
    if-eqz v14, :cond_1d

    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_1d
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 488
    .line 489
    .line 490
    move-result v14

    .line 491
    if-nez v14, :cond_1f

    .line 492
    .line 493
    invoke-virtual {v3, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-eqz v3, :cond_1e

    .line 498
    .line 499
    goto :goto_9

    .line 500
    :cond_1e
    const/4 v3, 0x0

    .line 501
    goto :goto_a

    .line 502
    :cond_1f
    :goto_9
    move v3, v7

    .line 503
    :goto_a
    const-class v14, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopWithSessionProcessorQuirk;

    .line 504
    .line 505
    invoke-virtual {v1, v14, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-eqz v3, :cond_20

    .line 510
    .line 511
    new-instance v3, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopWithSessionProcessorQuirk;

    .line 512
    .line 513
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    :cond_20
    sget-object v3, Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;->a:Ljava/util/Set;

    .line 520
    .line 521
    new-instance v14, Lnd2;

    .line 522
    .line 523
    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 524
    .line 525
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v6

    .line 532
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v11, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v15

    .line 539
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-direct {v14, v6, v15}, Lnd2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-interface {v3, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    const-class v6, Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;

    .line 550
    .line 551
    invoke-virtual {v1, v6, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-eqz v3, :cond_21

    .line 556
    .line 557
    new-instance v3, Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;

    .line 558
    .line 559
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    :cond_21
    sget-object v3, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;->a:Ljava/util/List;

    .line 566
    .line 567
    invoke-interface {v3, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    const-string v6, "Google"

    .line 572
    .line 573
    if-eqz v3, :cond_23

    .line 574
    .line 575
    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-nez v3, :cond_22

    .line 580
    .line 581
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-eqz v3, :cond_23

    .line 591
    .line 592
    :cond_22
    const/16 v3, 0x1a

    .line 593
    .line 594
    if-lt v10, v3, :cond_23

    .line 595
    .line 596
    move v3, v7

    .line 597
    goto :goto_b

    .line 598
    :cond_23
    const/4 v3, 0x0

    .line 599
    :goto_b
    const-class v14, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 600
    .line 601
    invoke-virtual {v1, v14, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-eqz v3, :cond_24

    .line 606
    .line 607
    new-instance v3, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 608
    .line 609
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    :cond_24
    sget-object v3, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->a:Ljava/util/List;

    .line 616
    .line 617
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    const-string v14, "TP1A"

    .line 622
    .line 623
    if-nez v3, :cond_25

    .line 624
    .line 625
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 626
    .line 627
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 631
    .line 632
    .line 633
    move-result v3

    .line 634
    if-eqz v3, :cond_26

    .line 635
    .line 636
    :cond_25
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 637
    .line 638
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-static {v3, v7, v14}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    if-eqz v3, :cond_26

    .line 646
    .line 647
    goto/16 :goto_10

    .line 648
    .line 649
    :cond_26
    sget-object v3, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->a:Ljava/util/List;

    .line 650
    .line 651
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v15

    .line 655
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-interface {v3, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    if-eqz v3, :cond_27

    .line 663
    .line 664
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 665
    .line 666
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-static {v3, v7, v14}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v15

    .line 673
    if-nez v15, :cond_2e

    .line 674
    .line 675
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    const-string v15, "TD1A"

    .line 679
    .line 680
    invoke-static {v3, v7, v15}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    if-eqz v3, :cond_27

    .line 685
    .line 686
    goto/16 :goto_10

    .line 687
    .line 688
    :cond_27
    const-string v3, "Redmi"

    .line 689
    .line 690
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 691
    .line 692
    .line 693
    move-result v15

    .line 694
    if-nez v15, :cond_29

    .line 695
    .line 696
    sget-object v15, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 697
    .line 698
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v15, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-eqz v3, :cond_28

    .line 706
    .line 707
    goto :goto_c

    .line 708
    :cond_28
    const/4 v3, 0x0

    .line 709
    goto :goto_d

    .line 710
    :cond_29
    :goto_c
    move v3, v7

    .line 711
    :goto_d
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 712
    .line 713
    .line 714
    move-result v15

    .line 715
    if-nez v15, :cond_2b

    .line 716
    .line 717
    sget-object v15, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 718
    .line 719
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 723
    .line 724
    .line 725
    move-result v15

    .line 726
    if-eqz v15, :cond_2a

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_2a
    const/4 v15, 0x0

    .line 730
    goto :goto_f

    .line 731
    :cond_2b
    :goto_e
    move v15, v7

    .line 732
    :goto_f
    or-int/2addr v3, v15

    .line 733
    if-eqz v3, :cond_2c

    .line 734
    .line 735
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 736
    .line 737
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    const-string v15, "TKQ1"

    .line 741
    .line 742
    invoke-static {v3, v7, v15}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 743
    .line 744
    .line 745
    move-result v15

    .line 746
    if-nez v15, :cond_2e

    .line 747
    .line 748
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    invoke-static {v3, v7, v14}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    if-eqz v3, :cond_2c

    .line 756
    .line 757
    goto :goto_10

    .line 758
    :cond_2c
    sget-object v3, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->c:Ljava/util/List;

    .line 759
    .line 760
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v14

    .line 764
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    invoke-interface {v3, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    if-eqz v3, :cond_2d

    .line 772
    .line 773
    if-ne v10, v4, :cond_2d

    .line 774
    .line 775
    goto :goto_10

    .line 776
    :cond_2d
    sget-object v3, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;->b:Ljava/util/List;

    .line 777
    .line 778
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v14

    .line 782
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    invoke-interface {v3, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    if-eqz v3, :cond_2f

    .line 790
    .line 791
    if-ne v10, v4, :cond_2f

    .line 792
    .line 793
    :cond_2e
    :goto_10
    move v3, v7

    .line 794
    goto :goto_11

    .line 795
    :cond_2f
    const/4 v3, 0x0

    .line 796
    :goto_11
    const-class v4, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;

    .line 797
    .line 798
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    if-eqz v3, :cond_30

    .line 803
    .line 804
    new-instance v3, Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;

    .line 805
    .line 806
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    :cond_30
    invoke-static {}, Lkm4;->T()Z

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    if-nez v3, :cond_32

    .line 817
    .line 818
    invoke-static {}, Lkm4;->U()Z

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    if-nez v3, :cond_32

    .line 823
    .line 824
    invoke-static {}, Lkm4;->Q()Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    if-nez v3, :cond_32

    .line 829
    .line 830
    invoke-static {}, Lkm4;->Y()Z

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    if-nez v3, :cond_32

    .line 835
    .line 836
    invoke-static {}, Lkm4;->X()Z

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    if-nez v3, :cond_32

    .line 841
    .line 842
    invoke-static {}, Lkm4;->V()Z

    .line 843
    .line 844
    .line 845
    move-result v3

    .line 846
    if-nez v3, :cond_32

    .line 847
    .line 848
    invoke-static {}, Lkm4;->W()Z

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    if-nez v3, :cond_32

    .line 853
    .line 854
    invoke-static {}, Lkm4;->S()Z

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    if-nez v3, :cond_32

    .line 859
    .line 860
    invoke-static {}, Lkm4;->Z()Z

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    if-eqz v3, :cond_31

    .line 865
    .line 866
    goto :goto_12

    .line 867
    :cond_31
    const/4 v3, 0x0

    .line 868
    goto :goto_13

    .line 869
    :cond_32
    :goto_12
    move v3, v7

    .line 870
    :goto_13
    const-class v4, Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 871
    .line 872
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    if-eqz v3, :cond_33

    .line 877
    .line 878
    new-instance v3, Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 879
    .line 880
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    :cond_33
    sget-object v3, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;->a:Ljava/util/LinkedHashMap;

    .line 887
    .line 888
    invoke-static {}, Lx97;->K()Z

    .line 889
    .line 890
    .line 891
    move-result v3

    .line 892
    const-class v4, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    .line 893
    .line 894
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 895
    .line 896
    .line 897
    move-result v3

    .line 898
    if-eqz v3, :cond_34

    .line 899
    .line 900
    new-instance v3, Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;

    .line 901
    .line 902
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    :cond_34
    const-string v3, "Motorola"

    .line 909
    .line 910
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 911
    .line 912
    .line 913
    move-result v4

    .line 914
    if-nez v4, :cond_35

    .line 915
    .line 916
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 917
    .line 918
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 922
    .line 923
    .line 924
    move-result v3

    .line 925
    if-eqz v3, :cond_36

    .line 926
    .line 927
    :cond_35
    const-string v3, "moto e5 play"

    .line 928
    .line 929
    invoke-virtual {v3, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    if-eqz v3, :cond_36

    .line 934
    .line 935
    move v3, v7

    .line 936
    goto :goto_14

    .line 937
    :cond_36
    const/4 v3, 0x0

    .line 938
    :goto_14
    const-class v4, Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 939
    .line 940
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 941
    .line 942
    .line 943
    move-result v3

    .line 944
    if-eqz v3, :cond_37

    .line 945
    .line 946
    new-instance v3, Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 947
    .line 948
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    :cond_37
    sget-object v3, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:Lnx7;

    .line 955
    .line 956
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 957
    .line 958
    const-string v4, "heroqltevzw"

    .line 959
    .line 960
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 961
    .line 962
    .line 963
    move-result v4

    .line 964
    if-nez v4, :cond_3a

    .line 965
    .line 966
    const-string v4, "heroqltetmo"

    .line 967
    .line 968
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 969
    .line 970
    .line 971
    move-result v4

    .line 972
    if-eqz v4, :cond_38

    .line 973
    .line 974
    goto :goto_15

    .line 975
    :cond_38
    invoke-static {}, Lwl7;->W()Z

    .line 976
    .line 977
    .line 978
    move-result v4

    .line 979
    if-nez v4, :cond_3a

    .line 980
    .line 981
    invoke-static {}, Lwl7;->X()Z

    .line 982
    .line 983
    .line 984
    move-result v4

    .line 985
    if-eqz v4, :cond_39

    .line 986
    .line 987
    goto :goto_15

    .line 988
    :cond_39
    const/4 v4, 0x0

    .line 989
    goto :goto_16

    .line 990
    :cond_3a
    :goto_15
    move v4, v7

    .line 991
    :goto_16
    const-class v10, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 992
    .line 993
    invoke-virtual {v1, v10, v4}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    if-eqz v4, :cond_3b

    .line 998
    .line 999
    new-instance v4, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 1000
    .line 1001
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    :cond_3b
    sget v4, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;->a:I

    .line 1008
    .line 1009
    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v4

    .line 1013
    if-nez v4, :cond_3c

    .line 1014
    .line 1015
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1016
    .line 1017
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1021
    .line 1022
    .line 1023
    :cond_3c
    const-class v4, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 1024
    .line 1025
    const/4 v10, 0x0

    .line 1026
    invoke-virtual {v1, v4, v10}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v4

    .line 1030
    if-eqz v4, :cond_3d

    .line 1031
    .line 1032
    new-instance v4, Landroidx/camera/camera2/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 1033
    .line 1034
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    :cond_3d
    sget-object v4, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;->a:Ljava/util/List;

    .line 1041
    .line 1042
    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v4

    .line 1046
    if-nez v4, :cond_3e

    .line 1047
    .line 1048
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1049
    .line 1050
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v4

    .line 1057
    if-eqz v4, :cond_3f

    .line 1058
    .line 1059
    :cond_3e
    sget-object v4, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;->a:Ljava/util/List;

    .line 1060
    .line 1061
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1062
    .line 1063
    .line 1064
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v6

    .line 1068
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v3

    .line 1075
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    if-eqz v3, :cond_3f

    .line 1083
    .line 1084
    move v3, v7

    .line 1085
    goto :goto_17

    .line 1086
    :cond_3f
    const/4 v3, 0x0

    .line 1087
    :goto_17
    const-class v4, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 1088
    .line 1089
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v3

    .line 1093
    if-eqz v3, :cond_40

    .line 1094
    .line 1095
    new-instance v3, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 1096
    .line 1097
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    :cond_40
    const-string v3, "Huawei"

    .line 1104
    .line 1105
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v4

    .line 1109
    if-nez v4, :cond_41

    .line 1110
    .line 1111
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1112
    .line 1113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v3

    .line 1120
    if-eqz v3, :cond_42

    .line 1121
    .line 1122
    :cond_41
    const-string v3, "mha-l29"

    .line 1123
    .line 1124
    invoke-virtual {v3, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v3

    .line 1128
    if-eqz v3, :cond_42

    .line 1129
    .line 1130
    move v3, v7

    .line 1131
    goto :goto_18

    .line 1132
    :cond_42
    const/4 v3, 0x0

    .line 1133
    :goto_18
    const-class v4, Landroidx/camera/camera2/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 1134
    .line 1135
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v3

    .line 1139
    if-eqz v3, :cond_43

    .line 1140
    .line 1141
    new-instance v3, Landroidx/camera/camera2/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 1142
    .line 1143
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    :cond_43
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v3

    .line 1153
    if-nez v3, :cond_44

    .line 1154
    .line 1155
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1156
    .line 1157
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v3

    .line 1164
    if-eqz v3, :cond_45

    .line 1165
    .line 1166
    :cond_44
    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v3

    .line 1170
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1171
    .line 1172
    .line 1173
    const-string v4, "SM-A716"

    .line 1174
    .line 1175
    const/4 v10, 0x0

    .line 1176
    invoke-static {v3, v10, v4}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v3

    .line 1180
    if-eqz v3, :cond_45

    .line 1181
    .line 1182
    move v10, v7

    .line 1183
    goto :goto_19

    .line 1184
    :cond_45
    const/4 v10, 0x0

    .line 1185
    :goto_19
    const-class v3, Landroidx/camera/camera2/compat/quirk/StillCaptureFlashStopRepeatingQuirk;

    .line 1186
    .line 1187
    invoke-virtual {v1, v3, v10}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v3

    .line 1191
    if-eqz v3, :cond_46

    .line 1192
    .line 1193
    new-instance v3, Landroidx/camera/camera2/compat/quirk/StillCaptureFlashStopRepeatingQuirk;

    .line 1194
    .line 1195
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    :cond_46
    sget-object v3, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;->a:Ljava/util/List;

    .line 1202
    .line 1203
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v4

    .line 1207
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v3

    .line 1214
    const-class v4, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 1215
    .line 1216
    invoke-virtual {v1, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v3

    .line 1220
    if-eqz v3, :cond_47

    .line 1221
    .line 1222
    new-instance v3, Landroidx/camera/camera2/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 1223
    .line 1224
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    :cond_47
    sget-object v3, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;->a:Ljava/util/List;

    .line 1231
    .line 1232
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1233
    .line 1234
    .line 1235
    move-result v3

    .line 1236
    if-nez v3, :cond_48

    .line 1237
    .line 1238
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1239
    .line 1240
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v3

    .line 1247
    if-eqz v3, :cond_49

    .line 1248
    .line 1249
    :cond_48
    sget-object v3, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;->a:Ljava/util/List;

    .line 1250
    .line 1251
    sget-object v4, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1254
    .line 1255
    .line 1256
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v6

    .line 1260
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v4

    .line 1267
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v3

    .line 1274
    if-eqz v3, :cond_49

    .line 1275
    .line 1276
    move v10, v7

    .line 1277
    goto :goto_1a

    .line 1278
    :cond_49
    const/4 v10, 0x0

    .line 1279
    :goto_1a
    const-class v3, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;

    .line 1280
    .line 1281
    invoke-virtual {v1, v3, v10}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    if-eqz v3, :cond_4a

    .line 1286
    .line 1287
    new-instance v3, Landroidx/camera/camera2/compat/quirk/SurfaceOrderQuirk;

    .line 1288
    .line 1289
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1293
    .line 1294
    .line 1295
    :cond_4a
    const-class v3, Landroidx/camera/camera2/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 1296
    .line 1297
    const/4 v10, 0x0

    .line 1298
    invoke-virtual {v1, v3, v10}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v3

    .line 1302
    if-eqz v3, :cond_4b

    .line 1303
    .line 1304
    new-instance v3, Landroidx/camera/camera2/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 1305
    .line 1306
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1310
    .line 1311
    .line 1312
    :cond_4b
    sget-object v3, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;->a:Ljava/util/List;

    .line 1313
    .line 1314
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v3

    .line 1318
    if-nez v3, :cond_4c

    .line 1319
    .line 1320
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1321
    .line 1322
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v2

    .line 1329
    if-eqz v2, :cond_4d

    .line 1330
    .line 1331
    :cond_4c
    sget-object v2, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;->a:Ljava/util/List;

    .line 1332
    .line 1333
    invoke-static {v2}, La38;->c(Ljava/util/List;)Z

    .line 1334
    .line 1335
    .line 1336
    move-result v2

    .line 1337
    if-eqz v2, :cond_4d

    .line 1338
    .line 1339
    goto :goto_1b

    .line 1340
    :cond_4d
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v0

    .line 1344
    if-nez v0, :cond_4e

    .line 1345
    .line 1346
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1347
    .line 1348
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v0

    .line 1355
    if-eqz v0, :cond_4f

    .line 1356
    .line 1357
    :cond_4e
    sget-object v0, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;->b:Ljava/util/List;

    .line 1358
    .line 1359
    invoke-static {v0}, La38;->c(Ljava/util/List;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v0

    .line 1363
    if-eqz v0, :cond_4f

    .line 1364
    .line 1365
    :goto_1b
    move v6, v7

    .line 1366
    goto :goto_1c

    .line 1367
    :cond_4f
    move v6, v10

    .line 1368
    :goto_1c
    const-class v0, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;

    .line 1369
    .line 1370
    invoke-virtual {v1, v0, v6}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v0

    .line 1374
    if-eqz v0, :cond_50

    .line 1375
    .line 1376
    new-instance v0, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;

    .line 1377
    .line 1378
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1382
    .line 1383
    .line 1384
    :cond_50
    sget-object v0, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;->a:Ljava/util/Map;

    .line 1385
    .line 1386
    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v2

    .line 1390
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1391
    .line 1392
    .line 1393
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v0

    .line 1397
    const-class v2, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;

    .line 1398
    .line 1399
    invoke-virtual {v1, v2, v0}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    if-eqz v0, :cond_51

    .line 1404
    .line 1405
    new-instance v0, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;

    .line 1406
    .line 1407
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1411
    .line 1412
    .line 1413
    :cond_51
    const-class v0, Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;

    .line 1414
    .line 1415
    sget-boolean v2, Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;->b:Z

    .line 1416
    .line 1417
    invoke-virtual {v1, v0, v2}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-eqz v0, :cond_52

    .line 1422
    .line 1423
    sget-object v0, Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;->a:Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;

    .line 1424
    .line 1425
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    :cond_52
    invoke-direct {v8, v9}, Li26;-><init>(Ljava/util/ArrayList;)V

    .line 1429
    .line 1430
    .line 1431
    sput-object v8, Lum1;->a:Li26;

    .line 1432
    .line 1433
    invoke-static {}, Lum1;->a()Li26;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    invoke-static {v0}, Li26;->d(Li26;)V

    .line 1438
    .line 1439
    .line 1440
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    :goto_1d
    return-void

    .line 1444
    :pswitch_1
    const/4 v10, 0x0

    .line 1445
    move-object/from16 v0, p1

    .line 1446
    .line 1447
    check-cast v0, Lg26;

    .line 1448
    .line 1449
    new-instance v1, Li26;

    .line 1450
    .line 1451
    new-instance v2, Ljava/util/ArrayList;

    .line 1452
    .line 1453
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1454
    .line 1455
    .line 1456
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1457
    .line 1458
    if-ge v3, v4, :cond_56

    .line 1459
    .line 1460
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1461
    .line 1462
    const-string v4, "SAMSUNG"

    .line 1463
    .line 1464
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v4

    .line 1468
    if-eqz v4, :cond_53

    .line 1469
    .line 1470
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1471
    .line 1472
    const-string v6, "F2Q"

    .line 1473
    .line 1474
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v6

    .line 1478
    if-nez v6, :cond_55

    .line 1479
    .line 1480
    const-string v6, "Q2Q"

    .line 1481
    .line 1482
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v4

    .line 1486
    if-eqz v4, :cond_53

    .line 1487
    .line 1488
    goto :goto_1e

    .line 1489
    :cond_53
    const-string v4, "OPPO"

    .line 1490
    .line 1491
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1492
    .line 1493
    .line 1494
    move-result v4

    .line 1495
    if-eqz v4, :cond_54

    .line 1496
    .line 1497
    const-string v4, "OP4E75L1"

    .line 1498
    .line 1499
    sget-object v6, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1500
    .line 1501
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1502
    .line 1503
    .line 1504
    move-result v4

    .line 1505
    if-eqz v4, :cond_54

    .line 1506
    .line 1507
    goto :goto_1e

    .line 1508
    :cond_54
    const-string v4, "LENOVO"

    .line 1509
    .line 1510
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v3

    .line 1514
    if-eqz v3, :cond_56

    .line 1515
    .line 1516
    const-string v3, "Q706F"

    .line 1517
    .line 1518
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1519
    .line 1520
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1521
    .line 1522
    .line 1523
    move-result v3

    .line 1524
    if-eqz v3, :cond_56

    .line 1525
    .line 1526
    :cond_55
    :goto_1e
    move v3, v7

    .line 1527
    goto :goto_1f

    .line 1528
    :cond_56
    move v3, v10

    .line 1529
    :goto_1f
    const-class v4, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    .line 1530
    .line 1531
    invoke-virtual {v0, v4, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1532
    .line 1533
    .line 1534
    move-result v3

    .line 1535
    if-eqz v3, :cond_57

    .line 1536
    .line 1537
    new-instance v3, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    .line 1538
    .line 1539
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1543
    .line 1544
    .line 1545
    :cond_57
    const-string v3, "XIAOMI"

    .line 1546
    .line 1547
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1548
    .line 1549
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1550
    .line 1551
    .line 1552
    move-result v3

    .line 1553
    if-eqz v3, :cond_58

    .line 1554
    .line 1555
    const-string v3, "M2101K7AG"

    .line 1556
    .line 1557
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1558
    .line 1559
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1560
    .line 1561
    .line 1562
    move-result v3

    .line 1563
    if-eqz v3, :cond_58

    .line 1564
    .line 1565
    move v6, v7

    .line 1566
    goto :goto_20

    .line 1567
    :cond_58
    move v6, v10

    .line 1568
    :goto_20
    const-class v3, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    .line 1569
    .line 1570
    invoke-virtual {v0, v3, v6}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1571
    .line 1572
    .line 1573
    move-result v0

    .line 1574
    if-eqz v0, :cond_59

    .line 1575
    .line 1576
    new-instance v0, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    .line 1577
    .line 1578
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1582
    .line 1583
    .line 1584
    :cond_59
    invoke-direct {v1, v2}, Li26;-><init>(Ljava/util/ArrayList;)V

    .line 1585
    .line 1586
    .line 1587
    sput-object v1, Ltm1;->a:Li26;

    .line 1588
    .line 1589
    sget-object v0, Ltm1;->a:Li26;

    .line 1590
    .line 1591
    invoke-static {v0}, Li26;->d(Li26;)V

    .line 1592
    .line 1593
    .line 1594
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 1595
    .line 1596
    .line 1597
    return-void

    .line 1598
    :pswitch_2
    const/4 v10, 0x0

    .line 1599
    move-object/from16 v0, p1

    .line 1600
    .line 1601
    check-cast v0, Lg26;

    .line 1602
    .line 1603
    new-instance v1, Li26;

    .line 1604
    .line 1605
    new-instance v4, Ljava/util/ArrayList;

    .line 1606
    .line 1607
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1608
    .line 1609
    .line 1610
    sget-object v6, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1611
    .line 1612
    const-string v8, "HUAWEI"

    .line 1613
    .line 1614
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1615
    .line 1616
    .line 1617
    move-result v8

    .line 1618
    if-eqz v8, :cond_5a

    .line 1619
    .line 1620
    const-string v8, "SNE-LX1"

    .line 1621
    .line 1622
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1623
    .line 1624
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1625
    .line 1626
    .line 1627
    move-result v8

    .line 1628
    if-eqz v8, :cond_5a

    .line 1629
    .line 1630
    goto :goto_21

    .line 1631
    :cond_5a
    const-string v8, "HONOR"

    .line 1632
    .line 1633
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v8

    .line 1637
    if-eqz v8, :cond_5b

    .line 1638
    .line 1639
    const-string v8, "STK-LX1"

    .line 1640
    .line 1641
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1642
    .line 1643
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v8

    .line 1647
    if-eqz v8, :cond_5b

    .line 1648
    .line 1649
    :goto_21
    move v8, v7

    .line 1650
    goto :goto_22

    .line 1651
    :cond_5b
    move v8, v10

    .line 1652
    :goto_22
    const-class v9, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 1653
    .line 1654
    invoke-virtual {v0, v9, v8}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v8

    .line 1658
    if-eqz v8, :cond_5c

    .line 1659
    .line 1660
    new-instance v8, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 1661
    .line 1662
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1666
    .line 1667
    .line 1668
    :cond_5c
    const-class v8, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 1669
    .line 1670
    invoke-virtual {v0, v8, v7}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v8

    .line 1674
    if-eqz v8, :cond_5d

    .line 1675
    .line 1676
    new-instance v8, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 1677
    .line 1678
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    :cond_5d
    sget-object v8, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->a:Ljava/util/HashSet;

    .line 1685
    .line 1686
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1687
    .line 1688
    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v9

    .line 1692
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1693
    .line 1694
    invoke-virtual {v11, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v12

    .line 1698
    sget-object v13, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->a:Ljava/util/HashSet;

    .line 1699
    .line 1700
    invoke-static {v9, v12}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v9

    .line 1704
    invoke-virtual {v13, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v9

    .line 1708
    const-class v12, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 1709
    .line 1710
    invoke-virtual {v0, v12, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1711
    .line 1712
    .line 1713
    move-result v9

    .line 1714
    if-eqz v9, :cond_5e

    .line 1715
    .line 1716
    new-instance v9, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 1717
    .line 1718
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1722
    .line 1723
    .line 1724
    :cond_5e
    sget-object v9, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;->a:Ljava/util/HashSet;

    .line 1725
    .line 1726
    invoke-virtual {v11, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v12

    .line 1730
    invoke-virtual {v9, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1731
    .line 1732
    .line 1733
    move-result v9

    .line 1734
    const-class v12, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 1735
    .line 1736
    invoke-virtual {v0, v12, v9}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v9

    .line 1740
    if-eqz v9, :cond_5f

    .line 1741
    .line 1742
    new-instance v9, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 1743
    .line 1744
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1748
    .line 1749
    .line 1750
    :cond_5f
    sget-object v9, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->a:Ljava/util/HashSet;

    .line 1751
    .line 1752
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1753
    .line 1754
    .line 1755
    move-result v9

    .line 1756
    if-nez v9, :cond_61

    .line 1757
    .line 1758
    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1759
    .line 1760
    .line 1761
    move-result v3

    .line 1762
    if-eqz v3, :cond_60

    .line 1763
    .line 1764
    sget-object v3, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->a:Ljava/util/HashSet;

    .line 1765
    .line 1766
    invoke-virtual {v11, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v9

    .line 1770
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1771
    .line 1772
    .line 1773
    move-result v3

    .line 1774
    if-eqz v3, :cond_60

    .line 1775
    .line 1776
    goto :goto_23

    .line 1777
    :cond_60
    move v3, v10

    .line 1778
    goto :goto_24

    .line 1779
    :cond_61
    :goto_23
    move v3, v7

    .line 1780
    :goto_24
    const-class v9, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 1781
    .line 1782
    invoke-virtual {v0, v9, v3}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v3

    .line 1786
    if-eqz v3, :cond_62

    .line 1787
    .line 1788
    new-instance v3, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 1789
    .line 1790
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1791
    .line 1792
    .line 1793
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1794
    .line 1795
    .line 1796
    :cond_62
    sget-object v3, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;->a:Ljava/util/HashSet;

    .line 1797
    .line 1798
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result v2

    .line 1802
    if-eqz v2, :cond_63

    .line 1803
    .line 1804
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;->a:Ljava/util/HashSet;

    .line 1805
    .line 1806
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1807
    .line 1808
    invoke-virtual {v3, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v3

    .line 1812
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1813
    .line 1814
    .line 1815
    move-result v2

    .line 1816
    if-eqz v2, :cond_63

    .line 1817
    .line 1818
    move v2, v7

    .line 1819
    goto :goto_25

    .line 1820
    :cond_63
    move v2, v10

    .line 1821
    :goto_25
    const-class v3, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 1822
    .line 1823
    invoke-virtual {v0, v3, v2}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v2

    .line 1827
    if-eqz v2, :cond_64

    .line 1828
    .line 1829
    new-instance v2, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 1830
    .line 1831
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1835
    .line 1836
    .line 1837
    :cond_64
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->a:Ljava/util/HashSet;

    .line 1838
    .line 1839
    const-string v2, "oneplus"

    .line 1840
    .line 1841
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1842
    .line 1843
    .line 1844
    move-result v2

    .line 1845
    if-eqz v2, :cond_65

    .line 1846
    .line 1847
    const-string v2, "cph2583"

    .line 1848
    .line 1849
    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1850
    .line 1851
    .line 1852
    move-result v2

    .line 1853
    if-eqz v2, :cond_65

    .line 1854
    .line 1855
    goto :goto_26

    .line 1856
    :cond_65
    const-string v2, "google"

    .line 1857
    .line 1858
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1859
    .line 1860
    .line 1861
    move-result v2

    .line 1862
    if-eqz v2, :cond_66

    .line 1863
    .line 1864
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->a:Ljava/util/HashSet;

    .line 1865
    .line 1866
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v3

    .line 1870
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1871
    .line 1872
    .line 1873
    move-result v2

    .line 1874
    if-eqz v2, :cond_66

    .line 1875
    .line 1876
    :goto_26
    move v2, v7

    .line 1877
    goto :goto_27

    .line 1878
    :cond_66
    move v2, v10

    .line 1879
    :goto_27
    const-class v3, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 1880
    .line 1881
    invoke-virtual {v0, v3, v2}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1882
    .line 1883
    .line 1884
    move-result v2

    .line 1885
    if-eqz v2, :cond_67

    .line 1886
    .line 1887
    new-instance v2, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 1888
    .line 1889
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1890
    .line 1891
    .line 1892
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1893
    .line 1894
    .line 1895
    :cond_67
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;->a:Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 1896
    .line 1897
    const-string v3, "motorola"

    .line 1898
    .line 1899
    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1900
    .line 1901
    .line 1902
    move-result v3

    .line 1903
    if-eqz v3, :cond_68

    .line 1904
    .line 1905
    const-string v3, "moto e20"

    .line 1906
    .line 1907
    invoke-virtual {v3, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1908
    .line 1909
    .line 1910
    move-result v3

    .line 1911
    if-eqz v3, :cond_68

    .line 1912
    .line 1913
    move v6, v7

    .line 1914
    goto :goto_28

    .line 1915
    :cond_68
    move v6, v10

    .line 1916
    :goto_28
    const-class v3, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 1917
    .line 1918
    invoke-virtual {v0, v3, v6}, Lg26;->a(Ljava/lang/Class;Z)Z

    .line 1919
    .line 1920
    .line 1921
    move-result v0

    .line 1922
    if-eqz v0, :cond_69

    .line 1923
    .line 1924
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1925
    .line 1926
    .line 1927
    :cond_69
    invoke-direct {v1, v4}, Li26;-><init>(Ljava/util/ArrayList;)V

    .line 1928
    .line 1929
    .line 1930
    sput-object v1, Lsm1;->a:Li26;

    .line 1931
    .line 1932
    sget-object v0, Lsm1;->a:Li26;

    .line 1933
    .line 1934
    invoke-static {v0}, Li26;->d(Li26;)V

    .line 1935
    .line 1936
    .line 1937
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 1938
    .line 1939
    .line 1940
    return-void

    .line 1941
    :pswitch_3
    move-object/from16 v0, p1

    .line 1942
    .line 1943
    check-cast v0, Loz;

    .line 1944
    .line 1945
    invoke-static {}, Ls08;->b()V

    .line 1946
    .line 1947
    .line 1948
    return-void

    .line 1949
    :pswitch_4
    if-nez p1, :cond_6a

    .line 1950
    .line 1951
    invoke-static {}, Ls08;->b()V

    .line 1952
    .line 1953
    .line 1954
    throw v1

    .line 1955
    :cond_6a
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1956
    .line 1957
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1958
    .line 1959
    .line 1960
    throw v0

    .line 1961
    :pswitch_5
    if-nez p1, :cond_6b

    .line 1962
    .line 1963
    invoke-static {}, Ls08;->b()V

    .line 1964
    .line 1965
    .line 1966
    throw v1

    .line 1967
    :cond_6b
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1968
    .line 1969
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1970
    .line 1971
    .line 1972
    throw v0

    .line 1973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

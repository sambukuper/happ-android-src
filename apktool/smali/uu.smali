.class public final Luu;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw82;


# instance fields
.field public final synthetic a:B

.field public final b:Ldq8;

.field public final c:Lpd5;


# direct methods
.method public synthetic constructor <init>(Ldq8;Lpd5;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Luu;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Luu;->b:Ldq8;

    .line 4
    .line 5
    iput-object p2, p0, Luu;->c:Lpd5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ll12;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Luu;->a:B

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/4 v5, 0x6

    .line 11
    const/16 v6, 0x2f

    .line 12
    .line 13
    const/16 v7, 0x3f

    .line 14
    .line 15
    const/16 v8, 0x23

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const-string v10, ""

    .line 19
    .line 20
    const/16 v11, 0x2e

    .line 21
    .line 22
    const/4 v12, 0x1

    .line 23
    sget-object v13, Lma1;->Z:Lma1;

    .line 24
    .line 25
    iget-object v14, v0, Luu;->b:Ldq8;

    .line 26
    .line 27
    iget-object v0, v0, Luu;->c:Lpd5;

    .line 28
    .line 29
    const/4 v15, 0x0

    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    iget-object v1, v14, Ldq8;->d:Ljava/lang/String;

    .line 34
    .line 35
    const-string v2, "Invalid android.resource URI: "

    .line 36
    .line 37
    if-eqz v1, :cond_10

    .line 38
    .line 39
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v1, v15

    .line 47
    :goto_0
    if-eqz v1, :cond_10

    .line 48
    .line 49
    invoke-static {v14}, Lrq7;->j(Ldq8;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v3, :cond_f

    .line 60
    .line 61
    invoke-static {v3}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-eqz v3, :cond_f

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iget-object v3, v0, Lpd5;->a:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :goto_1
    new-instance v5, Landroid/util/TypedValue;

    .line 97
    .line 98
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v2, v5, v12}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 102
    .line 103
    .line 104
    iget-object v5, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v5}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    if-eqz v14, :cond_2

    .line 115
    .line 116
    :goto_2
    move-object v6, v15

    .line 117
    goto :goto_3

    .line 118
    :cond_2
    invoke-static {v8, v5}, Lfm7;->O0(CLjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {v7, v5}, Lfm7;->O0(CLjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-static {v6, v5, v5}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v11, v5, v10}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v5}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eqz v6, :cond_3

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 142
    .line 143
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object v6, Lrv4;->a:Lip4;

    .line 151
    .line 152
    invoke-virtual {v6, v5}, Lip4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/String;

    .line 157
    .line 158
    if-nez v6, :cond_4

    .line 159
    .line 160
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6, v5}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    :cond_4
    :goto_3
    const-string v5, "text/xml"

    .line 169
    .line 170
    invoke-static {v6, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_e

    .line 175
    .line 176
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    const-string v5, "Invalid resource ID: "

    .line 185
    .line 186
    if-eqz v1, :cond_6

    .line 187
    .line 188
    invoke-static {v3, v2}, Lu70;->O(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-eqz v1, :cond_5

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_5
    invoke-static {v2, v5}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, Lkp5;->h(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_b

    .line 203
    .line 204
    :cond_6
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    :goto_4
    const/4 v7, 0x2

    .line 213
    if-eq v6, v7, :cond_7

    .line 214
    .line 215
    if-eq v6, v12, :cond_7

    .line 216
    .line 217
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    goto :goto_4

    .line 222
    :cond_7
    if-ne v6, v7, :cond_d

    .line 223
    .line 224
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    sget-object v6, Lxf6;->a:Ljava/lang/ThreadLocal;

    .line 229
    .line 230
    invoke-virtual {v4, v2, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    if-eqz v1, :cond_c

    .line 235
    .line 236
    :goto_5
    sget-object v2, Lat8;->a:[Landroid/graphics/Bitmap$Config;

    .line 237
    .line 238
    instance-of v2, v1, Landroid/graphics/drawable/VectorDrawable;

    .line 239
    .line 240
    if-nez v2, :cond_9

    .line 241
    .line 242
    instance-of v2, v1, Leu8;

    .line 243
    .line 244
    if-eqz v2, :cond_8

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_8
    move v2, v9

    .line 248
    goto :goto_7

    .line 249
    :cond_9
    :goto_6
    move v2, v12

    .line 250
    :goto_7
    new-instance v15, Lb63;

    .line 251
    .line 252
    if-eqz v2, :cond_b

    .line 253
    .line 254
    sget-object v4, Lb73;->b:Lf4;

    .line 255
    .line 256
    invoke-static {v0, v4}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    move-object/from16 v17, v4

    .line 261
    .line 262
    check-cast v17, Landroid/graphics/Bitmap$Config;

    .line 263
    .line 264
    iget-object v4, v0, Lpd5;->b:Lta7;

    .line 265
    .line 266
    iget-object v5, v0, Lpd5;->c:Lpw6;

    .line 267
    .line 268
    sget-object v6, Ly63;->b:Lf4;

    .line 269
    .line 270
    invoke-static {v0, v6}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    move-object/from16 v20, v6

    .line 275
    .line 276
    check-cast v20, Lta7;

    .line 277
    .line 278
    iget-object v0, v0, Lpd5;->d:Ltr5;

    .line 279
    .line 280
    sget-object v6, Ltr5;->Y:Ltr5;

    .line 281
    .line 282
    if-ne v0, v6, :cond_a

    .line 283
    .line 284
    move/from16 v21, v12

    .line 285
    .line 286
    :goto_8
    move-object/from16 v16, v1

    .line 287
    .line 288
    move-object/from16 v18, v4

    .line 289
    .line 290
    move-object/from16 v19, v5

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_a
    move/from16 v21, v9

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :goto_9
    invoke-static/range {v16 .. v21}, Lci8;->o(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lta7;Lpw6;Lta7;Z)Landroid/graphics/Bitmap;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 305
    .line 306
    invoke-direct {v3, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 307
    .line 308
    .line 309
    move-object v1, v3

    .line 310
    goto :goto_a

    .line 311
    :cond_b
    move-object/from16 v16, v1

    .line 312
    .line 313
    :goto_a
    invoke-static {v1}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-direct {v15, v0, v2, v13}, Lb63;-><init>(Ld53;ZLma1;)V

    .line 318
    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_c
    invoke-static {v2, v5}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v0}, Lkp5;->h(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_d
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 330
    .line 331
    const-string v1, "No start tag found."

    .line 332
    .line 333
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :cond_e
    new-instance v3, Landroid/util/TypedValue;

    .line 338
    .line 339
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v2, v3}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    new-instance v15, Lle7;

    .line 347
    .line 348
    invoke-static {v3}, Ldh3;->Q(Ljava/io/InputStream;)Lmv;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    new-instance v4, Lj76;

    .line 353
    .line 354
    invoke-direct {v4, v3}, Lj76;-><init>(Lje7;)V

    .line 355
    .line 356
    .line 357
    iget-object v0, v0, Lpd5;->f:Ls92;

    .line 358
    .line 359
    new-instance v3, Lsf6;

    .line 360
    .line 361
    invoke-direct {v3, v1, v2}, Lsf6;-><init>(Ljava/lang/String;I)V

    .line 362
    .line 363
    .line 364
    new-instance v1, Lme7;

    .line 365
    .line 366
    invoke-direct {v1, v4, v0, v3}, Lme7;-><init>(Lba0;Ls92;Lci8;)V

    .line 367
    .line 368
    .line 369
    invoke-direct {v15, v1, v6, v13}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 370
    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_f
    invoke-static {v14, v2}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    goto :goto_b

    .line 377
    :cond_10
    invoke-static {v14, v2}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :goto_b
    return-object v15

    .line 381
    :pswitch_0
    iget-object v1, v14, Ldq8;->e:Ljava/lang/String;

    .line 382
    .line 383
    if-nez v1, :cond_11

    .line 384
    .line 385
    move-object v1, v10

    .line 386
    :cond_11
    const/16 v6, 0x21

    .line 387
    .line 388
    invoke-static {v1, v6, v9, v5}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-eq v5, v4, :cond_14

    .line 393
    .line 394
    sget-object v4, Loi5;->Y:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v1, v9, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    invoke-static {v4}, Lg55;->r(Ljava/lang/String;)Loi5;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    add-int/2addr v5, v12

    .line 405
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    invoke-virtual {v1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-static {v1}, Lg55;->r(Ljava/lang/String;)Loi5;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    new-instance v5, Lle7;

    .line 418
    .line 419
    iget-object v0, v0, Lpd5;->f:Ls92;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    new-instance v6, La69;

    .line 425
    .line 426
    invoke-direct {v6, v3}, La69;-><init>(B)V

    .line 427
    .line 428
    .line 429
    invoke-static {v4, v0, v6}, Lu28;->l(Loi5;Ls92;Lgn2;)Ll79;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-static {v1, v0, v15, v15, v2}, Lvj8;->i(Loi5;Ls92;Ljava/lang/String;Lq76;I)Lh92;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v1}, Loi5;->b()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-static {v11, v1, v10}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    if-eqz v2, :cond_12

    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_12
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 453
    .line 454
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v2, Lrv4;->a:Lip4;

    .line 462
    .line 463
    invoke-virtual {v2, v1}, Lip4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    move-object v15, v2

    .line 468
    check-cast v15, Ljava/lang/String;

    .line 469
    .line 470
    if-nez v15, :cond_13

    .line 471
    .line 472
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v15

    .line 480
    :cond_13
    :goto_c
    invoke-direct {v5, v0, v15, v13}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 481
    .line 482
    .line 483
    move-object v15, v5

    .line 484
    goto :goto_d

    .line 485
    :cond_14
    const-string v0, "Invalid jar:file URI: "

    .line 486
    .line 487
    invoke-static {v14, v0}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    :goto_d
    return-object v15

    .line 491
    :pswitch_1
    sget-object v1, Loi5;->Y:Ljava/lang/String;

    .line 492
    .line 493
    invoke-static {v14}, Lrq7;->i(Ldq8;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    if-eqz v1, :cond_17

    .line 498
    .line 499
    invoke-static {v1}, Lg55;->r(Ljava/lang/String;)Loi5;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    new-instance v3, Lle7;

    .line 504
    .line 505
    iget-object v0, v0, Lpd5;->f:Ls92;

    .line 506
    .line 507
    invoke-static {v1, v0, v15, v15, v2}, Lvj8;->i(Loi5;Ls92;Ljava/lang/String;Lq76;I)Lh92;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v1}, Loi5;->b()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-static {v11, v1, v10}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-eqz v2, :cond_15

    .line 524
    .line 525
    goto :goto_e

    .line 526
    :cond_15
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 527
    .line 528
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    sget-object v2, Lrv4;->a:Lip4;

    .line 536
    .line 537
    invoke-virtual {v2, v1}, Lip4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    move-object v15, v2

    .line 542
    check-cast v15, Ljava/lang/String;

    .line 543
    .line 544
    if-nez v15, :cond_16

    .line 545
    .line 546
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    :cond_16
    :goto_e
    invoke-direct {v3, v0, v15, v13}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 555
    .line 556
    .line 557
    move-object v15, v3

    .line 558
    goto :goto_f

    .line 559
    :cond_17
    const-string v0, "filePath == null"

    .line 560
    .line 561
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    :goto_f
    return-object v15

    .line 565
    :pswitch_2
    iget-object v1, v14, Ldq8;->a:Ljava/lang/String;

    .line 566
    .line 567
    const-string v2, ";base64,"

    .line 568
    .line 569
    invoke-static {v1, v2, v9, v9, v5}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    const-string v6, "invalid data uri: "

    .line 574
    .line 575
    if-eq v2, v4, :cond_39

    .line 576
    .line 577
    const/16 v7, 0x3a

    .line 578
    .line 579
    invoke-static {v1, v7, v9, v5}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 580
    .line 581
    .line 582
    move-result v7

    .line 583
    if-eq v7, v4, :cond_38

    .line 584
    .line 585
    add-int/2addr v7, v12

    .line 586
    invoke-virtual {v1, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    sget-object v7, Lj10;->c:Lh10;

    .line 591
    .line 592
    add-int/2addr v2, v3

    .line 593
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 594
    .line 595
    .line 596
    move-result v8

    .line 597
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    iget-boolean v10, v7, Lj10;->b:Z

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 603
    .line 604
    .line 605
    move-result v11

    .line 606
    invoke-static {v2, v8, v11}, Lwl7;->s(III)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    sget-object v2, Liq0;->e:Ljava/nio/charset/Charset;

    .line 614
    .line 615
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    array-length v2, v1

    .line 623
    array-length v8, v1

    .line 624
    invoke-static {v9, v2, v8}, Lwl7;->s(III)V

    .line 625
    .line 626
    .line 627
    const/16 v8, 0x3d

    .line 628
    .line 629
    const/4 v11, -0x2

    .line 630
    if-nez v2, :cond_18

    .line 631
    .line 632
    move/from16 p1, v5

    .line 633
    .line 634
    move v5, v9

    .line 635
    goto :goto_12

    .line 636
    :cond_18
    if-eq v2, v12, :cond_37

    .line 637
    .line 638
    if-eqz v10, :cond_1b

    .line 639
    .line 640
    move v14, v2

    .line 641
    move v13, v9

    .line 642
    :goto_10
    move/from16 p1, v5

    .line 643
    .line 644
    if-ge v13, v2, :cond_1d

    .line 645
    .line 646
    aget-byte v5, v1, v13

    .line 647
    .line 648
    and-int/lit16 v5, v5, 0xff

    .line 649
    .line 650
    sget-object v16, Lk10;->a:[I

    .line 651
    .line 652
    aget v5, v16, v5

    .line 653
    .line 654
    if-gez v5, :cond_1a

    .line 655
    .line 656
    if-ne v5, v11, :cond_19

    .line 657
    .line 658
    sub-int v5, v2, v13

    .line 659
    .line 660
    sub-int/2addr v14, v5

    .line 661
    goto :goto_11

    .line 662
    :cond_19
    add-int/lit8 v14, v14, -0x1

    .line 663
    .line 664
    :cond_1a
    add-int/lit8 v13, v13, 0x1

    .line 665
    .line 666
    move/from16 v5, p1

    .line 667
    .line 668
    goto :goto_10

    .line 669
    :cond_1b
    move/from16 p1, v5

    .line 670
    .line 671
    add-int/lit8 v5, v2, -0x1

    .line 672
    .line 673
    aget-byte v5, v1, v5

    .line 674
    .line 675
    if-ne v5, v8, :cond_1c

    .line 676
    .line 677
    add-int/lit8 v14, v2, -0x1

    .line 678
    .line 679
    add-int/lit8 v5, v2, -0x2

    .line 680
    .line 681
    aget-byte v5, v1, v5

    .line 682
    .line 683
    if-ne v5, v8, :cond_1d

    .line 684
    .line 685
    add-int/lit8 v14, v2, -0x2

    .line 686
    .line 687
    goto :goto_11

    .line 688
    :cond_1c
    move v14, v2

    .line 689
    :cond_1d
    :goto_11
    int-to-long v13, v14

    .line 690
    const-wide/16 v16, 0x6

    .line 691
    .line 692
    mul-long v13, v13, v16

    .line 693
    .line 694
    const-wide/16 v16, 0x8

    .line 695
    .line 696
    div-long v13, v13, v16

    .line 697
    .line 698
    long-to-int v5, v13

    .line 699
    :goto_12
    new-array v13, v5, [B

    .line 700
    .line 701
    iget-boolean v7, v7, Lj10;->a:Z

    .line 702
    .line 703
    if-eqz v7, :cond_1e

    .line 704
    .line 705
    sget-object v7, Lk10;->b:[I

    .line 706
    .line 707
    goto :goto_13

    .line 708
    :cond_1e
    sget-object v7, Lk10;->a:[I

    .line 709
    .line 710
    :goto_13
    const/4 v14, -0x8

    .line 711
    move/from16 v19, v3

    .line 712
    .line 713
    move v15, v9

    .line 714
    move/from16 v17, v15

    .line 715
    .line 716
    move/from16 v16, v12

    .line 717
    .line 718
    move v12, v14

    .line 719
    :goto_14
    const-string v3, ") at index "

    .line 720
    .line 721
    const-string v8, "\'("

    .line 722
    .line 723
    if-ge v15, v2, :cond_2d

    .line 724
    .line 725
    if-ne v12, v14, :cond_1f

    .line 726
    .line 727
    add-int/lit8 v4, v15, 0x3

    .line 728
    .line 729
    if-ge v4, v2, :cond_1f

    .line 730
    .line 731
    add-int/lit8 v22, v15, 0x1

    .line 732
    .line 733
    aget-byte v14, v1, v15

    .line 734
    .line 735
    and-int/lit16 v14, v14, 0xff

    .line 736
    .line 737
    aget v14, v7, v14

    .line 738
    .line 739
    add-int/lit8 v23, v15, 0x2

    .line 740
    .line 741
    aget-byte v11, v1, v22

    .line 742
    .line 743
    and-int/lit16 v11, v11, 0xff

    .line 744
    .line 745
    aget v11, v7, v11

    .line 746
    .line 747
    move-object/from16 v22, v1

    .line 748
    .line 749
    aget-byte v1, v22, v23

    .line 750
    .line 751
    and-int/lit16 v1, v1, 0xff

    .line 752
    .line 753
    aget v1, v7, v1

    .line 754
    .line 755
    add-int/lit8 v23, v15, 0x4

    .line 756
    .line 757
    aget-byte v4, v22, v4

    .line 758
    .line 759
    and-int/lit16 v4, v4, 0xff

    .line 760
    .line 761
    aget v4, v7, v4

    .line 762
    .line 763
    shl-int/lit8 v14, v14, 0x12

    .line 764
    .line 765
    shl-int/lit8 v11, v11, 0xc

    .line 766
    .line 767
    or-int/2addr v11, v14

    .line 768
    shl-int/lit8 v1, v1, 0x6

    .line 769
    .line 770
    or-int/2addr v1, v11

    .line 771
    or-int/2addr v1, v4

    .line 772
    if-ltz v1, :cond_20

    .line 773
    .line 774
    add-int/lit8 v3, v9, 0x1

    .line 775
    .line 776
    shr-int/lit8 v4, v1, 0x10

    .line 777
    .line 778
    int-to-byte v4, v4

    .line 779
    aput-byte v4, v13, v9

    .line 780
    .line 781
    add-int/lit8 v4, v9, 0x2

    .line 782
    .line 783
    shr-int/lit8 v8, v1, 0x8

    .line 784
    .line 785
    int-to-byte v8, v8

    .line 786
    aput-byte v8, v13, v3

    .line 787
    .line 788
    add-int/lit8 v9, v9, 0x3

    .line 789
    .line 790
    int-to-byte v1, v1

    .line 791
    aput-byte v1, v13, v4

    .line 792
    .line 793
    move-object/from16 v1, v22

    .line 794
    .line 795
    move/from16 v15, v23

    .line 796
    .line 797
    const/4 v4, -0x1

    .line 798
    const/16 v8, 0x3d

    .line 799
    .line 800
    :goto_15
    const/4 v11, -0x2

    .line 801
    const/4 v14, -0x8

    .line 802
    goto :goto_14

    .line 803
    :cond_1f
    move-object/from16 v22, v1

    .line 804
    .line 805
    :cond_20
    aget-byte v1, v22, v15

    .line 806
    .line 807
    and-int/lit16 v1, v1, 0xff

    .line 808
    .line 809
    aget v4, v7, v1

    .line 810
    .line 811
    if-gez v4, :cond_2b

    .line 812
    .line 813
    const/4 v11, -0x2

    .line 814
    if-ne v4, v11, :cond_29

    .line 815
    .line 816
    const/4 v4, -0x8

    .line 817
    if-eq v12, v4, :cond_28

    .line 818
    .line 819
    const/4 v1, -0x6

    .line 820
    if-eq v12, v1, :cond_21

    .line 821
    .line 822
    const/4 v1, -0x4

    .line 823
    if-eq v12, v1, :cond_23

    .line 824
    .line 825
    if-ne v12, v11, :cond_22

    .line 826
    .line 827
    :cond_21
    add-int/lit8 v15, v15, 0x1

    .line 828
    .line 829
    goto :goto_19

    .line 830
    :cond_22
    const-string v0, "Unreachable"

    .line 831
    .line 832
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    :goto_16
    const/4 v15, 0x0

    .line 836
    goto/16 :goto_1f

    .line 837
    .line 838
    :cond_23
    add-int/lit8 v15, v15, 0x1

    .line 839
    .line 840
    if-nez v10, :cond_24

    .line 841
    .line 842
    goto :goto_18

    .line 843
    :cond_24
    :goto_17
    if-ge v15, v2, :cond_26

    .line 844
    .line 845
    aget-byte v1, v22, v15

    .line 846
    .line 847
    and-int/lit16 v1, v1, 0xff

    .line 848
    .line 849
    sget-object v4, Lk10;->a:[I

    .line 850
    .line 851
    aget v1, v4, v1

    .line 852
    .line 853
    const/4 v4, -0x1

    .line 854
    if-eq v1, v4, :cond_25

    .line 855
    .line 856
    goto :goto_18

    .line 857
    :cond_25
    add-int/lit8 v15, v15, 0x1

    .line 858
    .line 859
    goto :goto_17

    .line 860
    :cond_26
    :goto_18
    if-eq v15, v2, :cond_27

    .line 861
    .line 862
    aget-byte v1, v22, v15

    .line 863
    .line 864
    const/16 v11, 0x3d

    .line 865
    .line 866
    if-ne v1, v11, :cond_27

    .line 867
    .line 868
    add-int/lit8 v15, v15, 0x1

    .line 869
    .line 870
    goto :goto_19

    .line 871
    :cond_27
    const-string v0, "Missing one pad character at index "

    .line 872
    .line 873
    invoke-static {v15, v0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    goto :goto_16

    .line 881
    :goto_19
    move/from16 v1, v16

    .line 882
    .line 883
    const/4 v11, -0x2

    .line 884
    goto/16 :goto_1b

    .line 885
    .line 886
    :cond_28
    const-string v0, "Redundant pad character at index "

    .line 887
    .line 888
    invoke-static {v15, v0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    goto :goto_16

    .line 896
    :cond_29
    const/16 v11, 0x3d

    .line 897
    .line 898
    if-eqz v10, :cond_2a

    .line 899
    .line 900
    add-int/lit8 v15, v15, 0x1

    .line 901
    .line 902
    move v8, v11

    .line 903
    move-object/from16 v1, v22

    .line 904
    .line 905
    const/4 v4, -0x1

    .line 906
    goto :goto_15

    .line 907
    :cond_2a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 908
    .line 909
    int-to-char v2, v1

    .line 910
    invoke-static/range {v19 .. v19}, Lkm4;->q(I)V

    .line 911
    .line 912
    .line 913
    move/from16 v4, v19

    .line 914
    .line 915
    invoke-static {v1, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    new-instance v4, Ljava/lang/StringBuilder;

    .line 923
    .line 924
    const-string v5, "Invalid symbol \'"

    .line 925
    .line 926
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 930
    .line 931
    .line 932
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    throw v0

    .line 952
    :cond_2b
    const/16 v11, 0x3d

    .line 953
    .line 954
    add-int/lit8 v15, v15, 0x1

    .line 955
    .line 956
    shl-int/lit8 v1, v17, 0x6

    .line 957
    .line 958
    or-int v17, v1, v4

    .line 959
    .line 960
    add-int/lit8 v4, v12, 0x6

    .line 961
    .line 962
    if-ltz v4, :cond_2c

    .line 963
    .line 964
    add-int/lit8 v1, v9, 0x1

    .line 965
    .line 966
    ushr-int v3, v17, v4

    .line 967
    .line 968
    int-to-byte v3, v3

    .line 969
    aput-byte v3, v13, v9

    .line 970
    .line 971
    shl-int v3, v16, v4

    .line 972
    .line 973
    add-int/lit8 v3, v3, -0x1

    .line 974
    .line 975
    and-int v17, v17, v3

    .line 976
    .line 977
    add-int/lit8 v12, v12, -0x2

    .line 978
    .line 979
    move v9, v1

    .line 980
    :goto_1a
    move v8, v11

    .line 981
    move-object/from16 v1, v22

    .line 982
    .line 983
    const/4 v4, -0x1

    .line 984
    const/4 v11, -0x2

    .line 985
    const/4 v14, -0x8

    .line 986
    const/16 v19, 0x8

    .line 987
    .line 988
    goto/16 :goto_14

    .line 989
    .line 990
    :cond_2c
    move v12, v4

    .line 991
    goto :goto_1a

    .line 992
    :cond_2d
    move-object/from16 v22, v1

    .line 993
    .line 994
    const/4 v1, 0x0

    .line 995
    :goto_1b
    if-eq v12, v11, :cond_36

    .line 996
    .line 997
    const/4 v4, -0x8

    .line 998
    if-eq v12, v4, :cond_2f

    .line 999
    .line 1000
    if-eqz v1, :cond_2e

    .line 1001
    .line 1002
    goto :goto_1c

    .line 1003
    :cond_2e
    const-string v0, "The padding option is set to PRESENT, but the input is not properly padded"

    .line 1004
    .line 1005
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    goto/16 :goto_16

    .line 1009
    .line 1010
    :cond_2f
    :goto_1c
    if-nez v17, :cond_35

    .line 1011
    .line 1012
    if-nez v10, :cond_30

    .line 1013
    .line 1014
    goto :goto_1e

    .line 1015
    :cond_30
    :goto_1d
    if-ge v15, v2, :cond_32

    .line 1016
    .line 1017
    aget-byte v1, v22, v15

    .line 1018
    .line 1019
    and-int/lit16 v1, v1, 0xff

    .line 1020
    .line 1021
    sget-object v4, Lk10;->a:[I

    .line 1022
    .line 1023
    aget v1, v4, v1

    .line 1024
    .line 1025
    const/4 v4, -0x1

    .line 1026
    if-eq v1, v4, :cond_31

    .line 1027
    .line 1028
    goto :goto_1e

    .line 1029
    :cond_31
    add-int/lit8 v15, v15, 0x1

    .line 1030
    .line 1031
    goto :goto_1d

    .line 1032
    :cond_32
    :goto_1e
    if-lt v15, v2, :cond_34

    .line 1033
    .line 1034
    if-ne v9, v5, :cond_33

    .line 1035
    .line 1036
    new-instance v1, Li90;

    .line 1037
    .line 1038
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1039
    .line 1040
    .line 1041
    const/4 v2, 0x0

    .line 1042
    invoke-virtual {v1, v13, v2, v5}, Li90;->write([BII)V

    .line 1043
    .line 1044
    .line 1045
    iget-object v0, v0, Lpd5;->f:Ls92;

    .line 1046
    .line 1047
    invoke-static {v1, v0}, Lvj8;->j(Lba0;Ls92;)Lme7;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    new-instance v15, Lle7;

    .line 1052
    .line 1053
    sget-object v1, Lma1;->Y:Lma1;

    .line 1054
    .line 1055
    invoke-direct {v15, v0, v6, v1}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 1056
    .line 1057
    .line 1058
    goto :goto_1f

    .line 1059
    :cond_33
    const-string v0, "Check failed."

    .line 1060
    .line 1061
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 1062
    .line 1063
    .line 1064
    goto/16 :goto_16

    .line 1065
    .line 1066
    :cond_34
    aget-byte v0, v22, v15

    .line 1067
    .line 1068
    and-int/lit16 v0, v0, 0xff

    .line 1069
    .line 1070
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    const-string v2, "Symbol \'"

    .line 1073
    .line 1074
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    int-to-char v2, v0

    .line 1078
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    .line 1084
    const/16 v4, 0x8

    .line 1085
    .line 1086
    invoke-static {v4}, Lkm4;->q(I)V

    .line 1087
    .line 1088
    .line 1089
    invoke-static {v0, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1100
    .line 1101
    .line 1102
    add-int/lit8 v15, v15, -0x1

    .line 1103
    .line 1104
    const-string v0, " is prohibited after the pad character"

    .line 1105
    .line 1106
    invoke-static {v1, v15, v0}, Loi0;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_16

    .line 1114
    .line 1115
    :cond_35
    const-string v0, "The pad bits must be zeros"

    .line 1116
    .line 1117
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    goto/16 :goto_16

    .line 1121
    .line 1122
    :cond_36
    const-string v0, "The last unit of input does not have enough bits"

    .line 1123
    .line 1124
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1125
    .line 1126
    .line 1127
    goto/16 :goto_16

    .line 1128
    .line 1129
    :cond_37
    const-string v0, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "

    .line 1130
    .line 1131
    invoke-static {v2, v0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    goto/16 :goto_16

    .line 1139
    .line 1140
    :cond_38
    invoke-static {v14, v6}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    goto/16 :goto_16

    .line 1144
    .line 1145
    :cond_39
    invoke-static {v14, v6}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1146
    .line 1147
    .line 1148
    goto/16 :goto_16

    .line 1149
    .line 1150
    :goto_1f
    return-object v15

    .line 1151
    :pswitch_3
    move/from16 v16, v12

    .line 1152
    .line 1153
    invoke-static {v14}, Lrq7;->j(Ldq8;)Ljava/util/List;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    move/from16 v2, v16

    .line 1158
    .line 1159
    invoke-static {v1, v2}, Lwv0;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v14

    .line 1163
    const/16 v18, 0x0

    .line 1164
    .line 1165
    const/16 v19, 0x3e

    .line 1166
    .line 1167
    const-string v15, "/"

    .line 1168
    .line 1169
    const/16 v16, 0x0

    .line 1170
    .line 1171
    const/16 v17, 0x0

    .line 1172
    .line 1173
    invoke-static/range {v14 .. v19}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v1

    .line 1177
    new-instance v2, Lle7;

    .line 1178
    .line 1179
    iget-object v3, v0, Lpd5;->a:Landroid/content/Context;

    .line 1180
    .line 1181
    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    invoke-virtual {v3, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v3

    .line 1189
    invoke-static {v3}, Ldh3;->Q(Ljava/io/InputStream;)Lmv;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v3

    .line 1193
    new-instance v4, Lj76;

    .line 1194
    .line 1195
    invoke-direct {v4, v3}, Lj76;-><init>(Lje7;)V

    .line 1196
    .line 1197
    .line 1198
    iget-object v0, v0, Lpd5;->f:Ls92;

    .line 1199
    .line 1200
    new-instance v3, Lsu;

    .line 1201
    .line 1202
    invoke-direct {v3, v1}, Lsu;-><init>(Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    new-instance v5, Lme7;

    .line 1206
    .line 1207
    invoke-direct {v5, v4, v0, v3}, Lme7;-><init>(Lba0;Ls92;Lci8;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    if-eqz v0, :cond_3a

    .line 1215
    .line 1216
    :goto_20
    const/4 v15, 0x0

    .line 1217
    goto :goto_21

    .line 1218
    :cond_3a
    invoke-static {v8, v1}, Lfm7;->O0(CLjava/lang/String;)Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    invoke-static {v7, v0}, Lfm7;->O0(CLjava/lang/String;)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    invoke-static {v6, v0, v0}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-static {v11, v0, v10}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    invoke-static {v0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v1

    .line 1238
    if-eqz v1, :cond_3b

    .line 1239
    .line 1240
    goto :goto_20

    .line 1241
    :cond_3b
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1242
    .line 1243
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    sget-object v1, Lrv4;->a:Lip4;

    .line 1251
    .line 1252
    invoke-virtual {v1, v0}, Lip4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    move-object v15, v1

    .line 1257
    check-cast v15, Ljava/lang/String;

    .line 1258
    .line 1259
    if-nez v15, :cond_3c

    .line 1260
    .line 1261
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v1

    .line 1265
    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v15

    .line 1269
    :cond_3c
    :goto_21
    invoke-direct {v2, v5, v15, v13}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 1270
    .line 1271
    .line 1272
    return-object v2

    .line 1273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lhg;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhg;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lhg;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lhg;->Y:B

    .line 2
    .line 3
    sget-object v1, Ld02;->X:Ld02;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, Lhg;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v0, "Encoder doesn\'t support the provided bitRate: "

    .line 15
    .line 16
    check-cast p0, Lio/sentry/android/core/d;

    .line 17
    .line 18
    iget-object v1, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lio/sentry/android/replay/video/a;

    .line 21
    .line 22
    iget-object v2, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lio/sentry/s6;

    .line 25
    .line 26
    iget-object v3, v1, Lio/sentry/android/replay/video/a;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget v5, v1, Lio/sentry/android/replay/video/a;->e:I

    .line 29
    .line 30
    :try_start_0
    iget-object p0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroid/media/MediaCodec;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0, v3}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v6, v7}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    sget-object v7, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 67
    .line 68
    new-instance v8, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ", the value will be clamped to the closest one"

    .line 77
    .line 78
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-array v4, v4, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-interface {v6, v7, v0, v4}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p0, v0}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast p0, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v2, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 118
    .line 119
    const-string v4, "Could not retrieve MediaCodec info"

    .line 120
    .line 121
    invoke-interface {v0, v2, v4, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :cond_0
    :goto_0
    iget p0, v1, Lio/sentry/android/replay/video/a;->b:I

    .line 125
    .line 126
    iget v0, v1, Lio/sentry/android/replay/video/a;->c:I

    .line 127
    .line 128
    invoke-static {v3, p0, v0}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const-string v0, "color-format"

    .line 136
    .line 137
    const v2, 0x7f000789

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v0, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    const-string v0, "bitrate"

    .line 144
    .line 145
    invoke-virtual {p0, v0, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 146
    .line 147
    .line 148
    iget v0, v1, Lio/sentry/android/replay/video/a;->d:I

    .line 149
    .line 150
    int-to-float v0, v0

    .line 151
    const-string v1, "frame-rate"

    .line 152
    .line 153
    invoke-virtual {p0, v1, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 154
    .line 155
    .line 156
    const-string v0, "i-frame-interval"

    .line 157
    .line 158
    const/4 v1, 0x6

    .line 159
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_0
    new-instance v0, Landroid/graphics/Canvas;

    .line 164
    .line 165
    check-cast p0, Lio/sentry/android/replay/util/f;

    .line 166
    .line 167
    iget-object p0, p0, Lio/sentry/android/replay/util/f;->X:Lg44;

    .line 168
    .line 169
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Landroid/graphics/Bitmap;

    .line 174
    .line 175
    invoke-direct {v0, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 176
    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_1
    new-instance v0, Landroid/graphics/Matrix;

    .line 180
    .line 181
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 182
    .line 183
    .line 184
    check-cast p0, Lio/sentry/android/replay/screenshot/b;

    .line 185
    .line 186
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/b;->d:Lio/sentry/android/replay/d0;

    .line 187
    .line 188
    iget v1, p0, Lio/sentry/android/replay/d0;->c:F

    .line 189
    .line 190
    iget p0, p0, Lio/sentry/android/replay/d0;->d:F

    .line 191
    .line 192
    invoke-virtual {v0, v1, p0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_2
    check-cast p0, Lio/sentry/android/replay/c0;

    .line 197
    .line 198
    iget-object p0, p0, Lio/sentry/android/replay/c0;->f0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 199
    .line 200
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 201
    .line 202
    .line 203
    return-object v3

    .line 204
    :pswitch_3
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;

    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;->getLanguage()Lh24;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_2

    .line 211
    .line 212
    sget-object v0, Lk42;->X:Lk42;

    .line 213
    .line 214
    if-nez v0, :cond_1

    .line 215
    .line 216
    new-instance v0, Lk42;

    .line 217
    .line 218
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    sput-object v0, Lk42;->X:Lk42;

    .line 222
    .line 223
    :cond_1
    invoke-virtual {p0}, Lcom/blacksquircle/ui/editorkit/widget/internal/LineNumbersEditText;->getStructure()Ln88;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget-object p0, p0, Ln88;->a:Landroid/text/SpannableStringBuilder;

    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    new-instance v1, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    new-instance v0, Ljava/io/StringReader;

    .line 242
    .line 243
    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    new-instance p0, Ljp3;

    .line 247
    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    .line 250
    .line 251
    const/16 v2, 0x4000

    .line 252
    .line 253
    new-array v2, v2, [C

    .line 254
    .line 255
    iput-object v2, p0, Ljp3;->c:[C

    .line 256
    .line 257
    iput-boolean v4, p0, Ljp3;->i:Z

    .line 258
    .line 259
    iput-object v0, p0, Ljp3;->a:Ljava/io/StringReader;

    .line 260
    .line 261
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Ljp3;->a()Lhr3;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    const/16 v2, 0x11

    .line 270
    .line 271
    if-eq v0, v2, :cond_2

    .line 272
    .line 273
    packed-switch v0, :pswitch_data_1

    .line 274
    .line 275
    .line 276
    goto :goto_1

    .line 277
    :pswitch_4
    sget-object v0, Llb8;->g0:Llb8;

    .line 278
    .line 279
    new-instance v2, Lxz7;

    .line 280
    .line 281
    iget-wide v3, p0, Ljp3;->j:J

    .line 282
    .line 283
    long-to-int v3, v3

    .line 284
    invoke-virtual {p0}, Ljp3;->b()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-direct {v2, v0, v3, v4}, Lxz7;-><init>(Llb8;II)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_1

    .line 295
    :catchall_1
    move-exception p0

    .line 296
    goto :goto_2

    .line 297
    :pswitch_5
    sget-object v0, Llb8;->f0:Llb8;

    .line 298
    .line 299
    new-instance v2, Lxz7;

    .line 300
    .line 301
    iget-wide v3, p0, Ljp3;->j:J

    .line 302
    .line 303
    long-to-int v3, v3

    .line 304
    invoke-virtual {p0}, Ljp3;->b()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-direct {v2, v0, v3, v4}, Lxz7;-><init>(Llb8;II)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :pswitch_6
    sget-object v0, Llb8;->Y:Llb8;

    .line 316
    .line 317
    new-instance v2, Lxz7;

    .line 318
    .line 319
    iget-wide v3, p0, Ljp3;->j:J

    .line 320
    .line 321
    long-to-int v3, v3

    .line 322
    invoke-virtual {p0}, Ljp3;->b()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    invoke-direct {v2, v0, v3, v4}, Lxz7;-><init>(Llb8;II)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_1

    .line 333
    :pswitch_7
    sget-object v0, Llb8;->Z:Llb8;

    .line 334
    .line 335
    new-instance v2, Lxz7;

    .line 336
    .line 337
    iget-wide v3, p0, Ljp3;->j:J

    .line 338
    .line 339
    long-to-int v3, v3

    .line 340
    invoke-virtual {p0}, Ljp3;->b()I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    invoke-direct {v2, v0, v3, v4}, Lxz7;-><init>(Llb8;II)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_1

    .line 351
    :pswitch_8
    sget-object v0, Llb8;->X:Llb8;

    .line 352
    .line 353
    new-instance v2, Lxz7;

    .line 354
    .line 355
    iget-wide v3, p0, Ljp3;->j:J

    .line 356
    .line 357
    long-to-int v3, v3

    .line 358
    invoke-virtual {p0}, Ljp3;->b()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    invoke-direct {v2, v0, v3, v4}, Lxz7;-><init>(Llb8;II)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 366
    .line 367
    .line 368
    goto :goto_1

    .line 369
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 370
    .line 371
    .line 372
    :cond_2
    return-object v1

    .line 373
    :pswitch_9
    :try_start_2
    check-cast p0, Ldn2;

    .line 374
    .line 375
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    check-cast p0, Ljava/util/List;
    :try_end_2
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 380
    .line 381
    move-object v1, p0

    .line 382
    :catch_0
    return-object v1

    .line 383
    :pswitch_a
    check-cast p0, Ljava/util/List;

    .line 384
    .line 385
    return-object p0

    .line 386
    :pswitch_b
    check-cast p0, Lce8;

    .line 387
    .line 388
    invoke-virtual {p0}, Lce8;->c()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v1, Lr12;->Z:Lr12;

    .line 393
    .line 394
    if-ne v0, v1, :cond_3

    .line 395
    .line 396
    iget-object p0, p0, Lce8;->d:Lrh5;

    .line 397
    .line 398
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    if-ne p0, v1, :cond_3

    .line 403
    .line 404
    goto :goto_3

    .line 405
    :cond_3
    move v2, v4

    .line 406
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    return-object p0

    .line 411
    :pswitch_c
    check-cast p0, Ly05;

    .line 412
    .line 413
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-interface {p0, v0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    return-object v3

    .line 419
    :pswitch_d
    check-cast p0, Lig;

    .line 420
    .line 421
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 422
    .line 423
    .line 424
    return-object v3

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

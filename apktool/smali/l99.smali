.class public final Ll99;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# static fields
.field public static final b:Ll99;


# instance fields
.field public final synthetic a:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll99;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll99;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll99;->b:Ll99;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Ll99;->a:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte p0, p0, Ll99;->a:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Lb35;

    .line 11
    .line 12
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lb35;->X:I

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p0, p1}, Lay4;->c(II)Lay4;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 40
    .line 41
    invoke-direct {p1, p0, v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Lg43;)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_2
    new-instance p0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    .line 46
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v0, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 51
    .line 52
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Landroid/os/ResultReceiver;

    .line 57
    .line 58
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->X:Landroid/os/ResultReceiver;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_3
    new-instance p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 62
    .line 63
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/os/Parcel;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_4
    new-instance p0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 68
    .line 69
    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_5
    sget-object p0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 74
    .line 75
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    move-object p1, p0

    .line 82
    check-cast p1, Landroid/media/MediaDescription;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "android.support.v4.media.description.MEDIA_URI"

    .line 113
    .line 114
    if-eqz v1, :cond_0

    .line 115
    .line 116
    invoke-static {v1}, Los4;->p(Landroid/os/Bundle;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Landroid/net/Uri;

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    move-object v4, v3

    .line 127
    :goto_0
    if-eqz v4, :cond_2

    .line 128
    .line 129
    const-string v11, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 130
    .line 131
    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-eqz v12, :cond_1

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-ne v12, v0, :cond_1

    .line 142
    .line 143
    move-object v11, v3

    .line 144
    goto :goto_1

    .line 145
    :cond_1
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    move-object v11, v1

    .line 152
    :goto_1
    if-eqz v4, :cond_3

    .line 153
    .line 154
    :goto_2
    move-object v12, v4

    .line 155
    goto :goto_3

    .line 156
    :cond_3
    invoke-virtual {p1}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    goto :goto_2

    .line 161
    :goto_3
    new-instance v4, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 162
    .line 163
    invoke-direct/range {v4 .. v12}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 164
    .line 165
    .line 166
    iput-object p0, v4, Landroid/support/v4/media/MediaDescriptionCompat;->k0:Ljava/lang/Object;

    .line 167
    .line 168
    move-object v3, v4

    .line 169
    :cond_4
    return-object v3

    .line 170
    :pswitch_6
    new-instance p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 171
    .line 172
    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_7
    new-instance p0, Lar4;

    .line 177
    .line 178
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 179
    .line 180
    .line 181
    const-class v0, Lar4;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    iput p1, p0, Lar4;->X:I

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_8
    new-instance p0, Lja4;

    .line 201
    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iput v0, p0, Lja4;->X:I

    .line 210
    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    iput v0, p0, Lja4;->Y:I

    .line 216
    .line 217
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-ne p1, v1, :cond_5

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_5
    move v1, v2

    .line 225
    :goto_4
    iput-boolean v1, p0, Lja4;->Z:Z

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance p0, Lp24;

    .line 232
    .line 233
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {p0, p1}, Lp24;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    new-instance p0, Luf3;

    .line 245
    .line 246
    const-class v0, Landroid/content/IntentSender;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    check-cast v0, Landroid/content/IntentSender;

    .line 260
    .line 261
    const-class v1, Landroid/content/Intent;

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, Landroid/content/Intent;

    .line 272
    .line 273
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    invoke-direct {p0, v0, v1, v2, p1}, Luf3;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 282
    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_b
    new-instance p0, Lnu2;

    .line 286
    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 288
    .line 289
    .line 290
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 291
    .line 292
    iput-object v0, p0, Lnu2;->Y:Landroid/os/Bundle;

    .line 293
    .line 294
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    iput v0, p0, Lnu2;->X:I

    .line 299
    .line 300
    const-class v0, Landroidx/leanback/widget/GridLayoutManager;

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    iput-object p1, p0, Lnu2;->Y:Landroid/os/Bundle;

    .line 311
    .line 312
    return-object p0

    .line 313
    :pswitch_c
    new-instance p0, Ltl2;

    .line 314
    .line 315
    invoke-direct {p0, p1}, Ltl2;-><init>(Landroid/os/Parcel;)V

    .line 316
    .line 317
    .line 318
    return-object p0

    .line 319
    :pswitch_d
    new-instance p0, Lnl2;

    .line 320
    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 322
    .line 323
    .line 324
    iput-object v3, p0, Lnl2;->g0:Ljava/lang/String;

    .line 325
    .line 326
    new-instance v0, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 329
    .line 330
    .line 331
    iput-object v0, p0, Lnl2;->h0:Ljava/util/ArrayList;

    .line 332
    .line 333
    new-instance v0, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 336
    .line 337
    .line 338
    iput-object v0, p0, Lnl2;->i0:Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    iput-object v0, p0, Lnl2;->X:Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iput-object v0, p0, Lnl2;->Y:Ljava/util/ArrayList;

    .line 351
    .line 352
    sget-object v0, Ls00;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 353
    .line 354
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, [Ls00;

    .line 359
    .line 360
    iput-object v0, p0, Lnl2;->Z:[Ls00;

    .line 361
    .line 362
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    iput v0, p0, Lnl2;->f0:I

    .line 367
    .line 368
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v0, p0, Lnl2;->g0:Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iput-object v0, p0, Lnl2;->h0:Ljava/util/ArrayList;

    .line 379
    .line 380
    sget-object v0, Lt00;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 381
    .line 382
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iput-object v0, p0, Lnl2;->i0:Ljava/util/ArrayList;

    .line 387
    .line 388
    sget-object v0, Lil2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 389
    .line 390
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    iput-object p1, p0, Lnl2;->j0:Ljava/util/ArrayList;

    .line 395
    .line 396
    return-object p0

    .line 397
    :pswitch_e
    new-instance p0, Lil2;

    .line 398
    .line 399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    iput-object v0, p0, Lil2;->X:Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 409
    .line 410
    .line 411
    move-result p1

    .line 412
    iput p1, p0, Lil2;->Y:I

    .line 413
    .line 414
    return-object p0

    .line 415
    :pswitch_f
    new-instance p0, Lzd2;

    .line 416
    .line 417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    iput v0, p0, Lzd2;->X:I

    .line 425
    .line 426
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 427
    .line 428
    .line 429
    move-result p1

    .line 430
    iput p1, p0, Lzd2;->Y:I

    .line 431
    .line 432
    return-object p0

    .line 433
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    invoke-static {p0}, Lb12;->valueOf(Ljava/lang/String;)Lb12;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    return-object p0

    .line 445
    :pswitch_11
    new-instance p0, Lgf1;

    .line 446
    .line 447
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    invoke-direct {p0, p1}, Lgf1;-><init>(I)V

    .line 452
    .line 453
    .line 454
    return-object p0

    .line 455
    :pswitch_12
    new-instance p0, Lqc1;

    .line 456
    .line 457
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 458
    .line 459
    .line 460
    move-result-wide v0

    .line 461
    invoke-direct {p0, v0, v1}, Lqc1;-><init>(J)V

    .line 462
    .line 463
    .line 464
    return-object p0

    .line 465
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    new-instance p0, Lga1;

    .line 469
    .line 470
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-direct {p0, v0, v1, p1}, Lga1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    return-object p0

    .line 486
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    new-instance v2, Lda1;

    .line 490
    .line 491
    sget-object p0, Lga1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 492
    .line 493
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    check-cast v0, Lga1;

    .line 498
    .line 499
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-nez v1, :cond_6

    .line 504
    .line 505
    move-object v4, v3

    .line 506
    goto :goto_5

    .line 507
    :cond_6
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, Lga1;

    .line 512
    .line 513
    move-object v4, v1

    .line 514
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-nez v1, :cond_7

    .line 519
    .line 520
    move-object v5, v3

    .line 521
    goto :goto_6

    .line 522
    :cond_7
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    check-cast v1, Lga1;

    .line 527
    .line 528
    move-object v5, v1

    .line 529
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    if-nez v1, :cond_8

    .line 534
    .line 535
    move-object v6, v3

    .line 536
    goto :goto_7

    .line 537
    :cond_8
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    check-cast v1, Lga1;

    .line 542
    .line 543
    move-object v6, v1

    .line 544
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    if-nez v1, :cond_9

    .line 549
    .line 550
    :goto_8
    move-object v7, v3

    .line 551
    move-object v3, v0

    .line 552
    goto :goto_9

    .line 553
    :cond_9
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    move-object v3, p0

    .line 558
    check-cast v3, Lga1;

    .line 559
    .line 560
    goto :goto_8

    .line 561
    :goto_9
    invoke-direct/range {v2 .. v7}, Lda1;-><init>(Lga1;Lga1;Lga1;Lga1;Lga1;)V

    .line 562
    .line 563
    .line 564
    return-object v2

    .line 565
    :pswitch_15
    const-class p0, Lay4;

    .line 566
    .line 567
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    move-object v2, v0

    .line 576
    check-cast v2, Lay4;

    .line 577
    .line 578
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    move-object v3, v0

    .line 587
    check-cast v3, Lay4;

    .line 588
    .line 589
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 590
    .line 591
    .line 592
    move-result-object p0

    .line 593
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    move-object v5, p0

    .line 598
    check-cast v5, Lay4;

    .line 599
    .line 600
    const-class p0, Lqc1;

    .line 601
    .line 602
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 607
    .line 608
    .line 609
    move-result-object p0

    .line 610
    move-object v4, p0

    .line 611
    check-cast v4, Lqc1;

    .line 612
    .line 613
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 614
    .line 615
    .line 616
    move-result v6

    .line 617
    new-instance v1, Lbd0;

    .line 618
    .line 619
    invoke-direct/range {v1 .. v6}, Lbd0;-><init>(Lay4;Lay4;Lqc1;Lay4;I)V

    .line 620
    .line 621
    .line 622
    return-object v1

    .line 623
    :pswitch_16
    new-instance p0, Lm20;

    .line 624
    .line 625
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    iput v0, p0, Lm20;->X:F

    .line 633
    .line 634
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    iput v0, p0, Lm20;->Y:F

    .line 639
    .line 640
    new-instance v0, Ljava/util/ArrayList;

    .line 641
    .line 642
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 643
    .line 644
    .line 645
    iput-object v0, p0, Lm20;->Z:Ljava/util/ArrayList;

    .line 646
    .line 647
    const-class v1, Ljava/lang/Float;

    .line 648
    .line 649
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    iput v0, p0, Lm20;->f0:F

    .line 661
    .line 662
    invoke-virtual {p1}, Landroid/os/Parcel;->createBooleanArray()[Z

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    aget-boolean p1, p1, v2

    .line 667
    .line 668
    iput-boolean p1, p0, Lm20;->g0:Z

    .line 669
    .line 670
    return-object p0

    .line 671
    :pswitch_17
    new-instance p0, Lt00;

    .line 672
    .line 673
    invoke-direct {p0, p1}, Lt00;-><init>(Landroid/os/Parcel;)V

    .line 674
    .line 675
    .line 676
    return-object p0

    .line 677
    :pswitch_18
    new-instance p0, Ls00;

    .line 678
    .line 679
    invoke-direct {p0, p1}, Ls00;-><init>(Landroid/os/Parcel;)V

    .line 680
    .line 681
    .line 682
    return-object p0

    .line 683
    :pswitch_19
    new-instance p0, Lmq;

    .line 684
    .line 685
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 689
    .line 690
    .line 691
    move-result p1

    .line 692
    if-eqz p1, :cond_a

    .line 693
    .line 694
    goto :goto_a

    .line 695
    :cond_a
    move v1, v2

    .line 696
    :goto_a
    iput-boolean v1, p0, Lmq;->X:Z

    .line 697
    .line 698
    return-object p0

    .line 699
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    new-instance p0, Li6;

    .line 703
    .line 704
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 709
    .line 710
    .line 711
    move-result v1

    .line 712
    if-nez v1, :cond_b

    .line 713
    .line 714
    goto :goto_b

    .line 715
    :cond_b
    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 716
    .line 717
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object p1

    .line 721
    move-object v3, p1

    .line 722
    check-cast v3, Landroid/content/Intent;

    .line 723
    .line 724
    :goto_b
    invoke-direct {p0, v3, v0}, Li6;-><init>(Landroid/content/Intent;I)V

    .line 725
    .line 726
    .line 727
    return-object p0

    .line 728
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    new-instance p0, Lw;

    .line 732
    .line 733
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-nez v0, :cond_c

    .line 738
    .line 739
    goto :goto_c

    .line 740
    :cond_c
    sget-object v0, Lsu/happ/proxyutility/dto/ProviderId;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 741
    .line 742
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object p1

    .line 746
    check-cast p1, Lsu/happ/proxyutility/dto/ProviderId;

    .line 747
    .line 748
    if-eqz p1, :cond_d

    .line 749
    .line 750
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    :cond_d
    :goto_c
    invoke-direct {p0, v3}, Lw;-><init>(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    return-object p0

    .line 758
    :pswitch_1c
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 759
    .line 760
    .line 761
    move-result p0

    .line 762
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    const v5, -0xc2a5d3a

    .line 767
    .line 768
    .line 769
    if-ne v4, v5, :cond_11

    .line 770
    .line 771
    invoke-static {p1}, Lhi5;->A0(Landroid/os/Parcel;)I

    .line 772
    .line 773
    .line 774
    move-result p0

    .line 775
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 776
    .line 777
    .line 778
    move-result v4

    .line 779
    if-ge v4, p0, :cond_10

    .line 780
    .line 781
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    int-to-char v5, v4

    .line 786
    if-eq v5, v1, :cond_f

    .line 787
    .line 788
    if-eq v5, v0, :cond_e

    .line 789
    .line 790
    invoke-static {p1, v4}, Lhi5;->y0(Landroid/os/Parcel;I)V

    .line 791
    .line 792
    .line 793
    goto :goto_d

    .line 794
    :cond_e
    invoke-static {p1, v4}, Lhi5;->t0(Landroid/os/Parcel;I)Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    goto :goto_d

    .line 799
    :cond_f
    sget-object v3, Lzx0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 800
    .line 801
    invoke-static {p1, v4, v3}, Lhi5;->T(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    check-cast v3, Lzx0;

    .line 806
    .line 807
    goto :goto_d

    .line 808
    :cond_10
    invoke-static {p1, p0}, Lhi5;->Y(Landroid/os/Parcel;I)V

    .line 809
    .line 810
    .line 811
    new-instance p0, Lso;

    .line 812
    .line 813
    invoke-direct {p0, v3, v2}, Lso;-><init>(Lzx0;Z)V

    .line 814
    .line 815
    .line 816
    goto :goto_e

    .line 817
    :cond_11
    add-int/lit8 p0, p0, -0x4

    .line 818
    .line 819
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 820
    .line 821
    .line 822
    sget-object p0, Lso;->f0:Lso;

    .line 823
    .line 824
    :goto_e
    return-object p0

    .line 825
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Ll99;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lb35;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lay4;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lar4;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lja4;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lp24;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Luf3;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lnu2;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Ltl2;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lnl2;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lil2;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lzd2;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lb12;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lgf1;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lqc1;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lga1;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lda1;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lbd0;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lm20;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lt00;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Ls00;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lmq;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Li6;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lw;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lso;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
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

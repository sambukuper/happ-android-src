.class public abstract Lhj8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lg28;

.field public static final b:Lej4;

.field public static c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lnj8;

    .line 13
    .line 14
    invoke-direct {v0}, Lg28;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lhj8;->a:Lg28;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v1, 0x1d

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Lmj8;

    .line 25
    .line 26
    invoke-direct {v0}, Lg28;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lhj8;->a:Lg28;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/16 v1, 0x1c

    .line 33
    .line 34
    if-lt v0, v1, :cond_2

    .line 35
    .line 36
    new-instance v0, Llj8;

    .line 37
    .line 38
    invoke-direct {v0}, Lkj8;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lhj8;->a:Lg28;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/16 v1, 0x1a

    .line 45
    .line 46
    if-lt v0, v1, :cond_3

    .line 47
    .line 48
    new-instance v0, Lkj8;

    .line 49
    .line 50
    invoke-direct {v0}, Lkj8;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lhj8;->a:Lg28;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object v0, Ljj8;->c:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    new-instance v0, Ljj8;

    .line 61
    .line 62
    invoke-direct {v0}, Lg28;-><init>()V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lhj8;->a:Lg28;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    new-instance v0, Lij8;

    .line 69
    .line 70
    invoke-direct {v0}, Lg28;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lhj8;->a:Lg28;

    .line 74
    .line 75
    :goto_0
    new-instance v0, Lej4;

    .line 76
    .line 77
    const/16 v1, 0x10

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lej4;-><init>(I)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lhj8;->b:Lej4;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    sput-object v0, Lhj8;->c:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static a(Landroid/content/Context;Lti2;Landroid/content/res/Resources;ILjava/lang/String;IILwl7;Z)Landroid/graphics/Typeface;
    .locals 14

    .line 1
    move/from16 v4, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, p1, Lwi2;

    .line 6
    .line 7
    const/16 v3, 0x9

    .line 8
    .line 9
    const/4 v6, -0x3

    .line 10
    if-eqz v2, :cond_16

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Lwi2;

    .line 14
    .line 15
    iget-object v2, v0, Lwi2;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x1

    .line 23
    const/4 v9, 0x0

    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    invoke-static {v2}, Lhj8;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    iget-object v2, v0, Lwi2;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ne v5, v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lni2;

    .line 47
    .line 48
    iget-object v2, v2, Lni2;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2}, Lhj8;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v10, 0x1f

    .line 59
    .line 60
    if-ge v5, v10, :cond_2

    .line 61
    .line 62
    :catch_0
    :goto_0
    move-object v2, v7

    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_2
    move v5, v9

    .line 66
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    if-ge v5, v10, :cond_4

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    check-cast v10, Lni2;

    .line 77
    .line 78
    iget-object v10, v10, Lni2;->e:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v10}, Lhj8;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    if-nez v10, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object v10, v7

    .line 91
    move v5, v9

    .line 92
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    if-ge v5, v11, :cond_9

    .line 97
    .line 98
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    check-cast v11, Lni2;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    sub-int/2addr v12, v8

    .line 109
    if-ne v5, v12, :cond_5

    .line 110
    .line 111
    iget-object v12, v11, Lni2;->f:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-eqz v12, :cond_5

    .line 118
    .line 119
    iget-object v2, v11, Lni2;->e:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v10, v2}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setSystemFallback(Ljava/lang/String;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_5
    iget-object v12, v11, Lni2;->e:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v11, v11, Lni2;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v12}, Lhj8;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-static {v12}, Lhj8;->d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    if-nez v12, :cond_6

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-nez v13, :cond_7

    .line 145
    .line 146
    :try_start_0
    new-instance v13, Landroid/graphics/fonts/FontFamily$Builder;

    .line 147
    .line 148
    new-instance v13, Landroid/graphics/fonts/Font$Builder;

    .line 149
    .line 150
    invoke-static {v12}, Lrc;->a(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-virtual {v12, v11}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    invoke-virtual {v11}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    new-instance v12, Landroid/graphics/fonts/FontFamily$Builder;

    .line 163
    .line 164
    invoke-direct {v12, v11}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 168
    .line 169
    .line 170
    move-result-object v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    goto :goto_3

    .line 172
    :cond_7
    new-instance v11, Landroid/graphics/fonts/FontFamily$Builder;

    .line 173
    .line 174
    invoke-direct {v11, v12}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    :goto_3
    if-nez v10, :cond_8

    .line 182
    .line 183
    new-instance v10, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 184
    .line 185
    invoke-direct {v10, v11}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_8
    invoke-virtual {v10, v11}, Landroid/graphics/Typeface$CustomFallbackBuilder;->addCustomFallback(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 190
    .line 191
    .line 192
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_9
    :goto_5
    invoke-virtual {v10}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    :goto_6
    if-eqz v2, :cond_b

    .line 200
    .line 201
    if-eqz v1, :cond_a

    .line 202
    .line 203
    new-instance p0, Landroid/os/Handler;

    .line 204
    .line 205
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 210
    .line 211
    .line 212
    new-instance v0, Lsc4;

    .line 213
    .line 214
    invoke-direct {v0, v1, v2, v3}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 218
    .line 219
    .line 220
    :cond_a
    sget-object p0, Lhj8;->b:Lej4;

    .line 221
    .line 222
    invoke-static/range {p2 .. p6}, Lhj8;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p0, v0, v2}, Lej4;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    return-object v2

    .line 230
    :cond_b
    if-eqz p8, :cond_d

    .line 231
    .line 232
    iget v2, v0, Lwi2;->c:I

    .line 233
    .line 234
    if-nez v2, :cond_c

    .line 235
    .line 236
    :goto_7
    move v2, v8

    .line 237
    goto :goto_8

    .line 238
    :cond_c
    move v2, v9

    .line 239
    goto :goto_8

    .line 240
    :cond_d
    if-nez v1, :cond_c

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :goto_8
    const/4 v3, -0x1

    .line 244
    if-eqz p8, :cond_e

    .line 245
    .line 246
    iget v5, v0, Lwi2;->b:I

    .line 247
    .line 248
    move v10, v5

    .line 249
    goto :goto_9

    .line 250
    :cond_e
    move v10, v3

    .line 251
    :goto_9
    new-instance v5, Landroid/os/Handler;

    .line 252
    .line 253
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    invoke-direct {v5, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 258
    .line 259
    .line 260
    new-instance v11, Lrb8;

    .line 261
    .line 262
    const/4 v12, 0x2

    .line 263
    invoke-direct {v11, v12, v9}, Lrb8;-><init>(BZ)V

    .line 264
    .line 265
    .line 266
    iput-object v1, v11, Lrb8;->Y:Ljava/lang/Object;

    .line 267
    .line 268
    iget-object v0, v0, Lwi2;->a:Ljava/util/ArrayList;

    .line 269
    .line 270
    new-instance v13, Ldq;

    .line 271
    .line 272
    new-instance v1, Lr52;

    .line 273
    .line 274
    invoke-direct {v1, v5, v8}, Lr52;-><init>(Landroid/os/Handler;B)V

    .line 275
    .line 276
    .line 277
    const/16 v5, 0x19

    .line 278
    .line 279
    invoke-direct {v13, v11, v1, v5}, Ldq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 280
    .line 281
    .line 282
    const/4 v5, 0x6

    .line 283
    if-eqz v2, :cond_12

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-gt v2, v8, :cond_11

    .line 290
    .line 291
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Lni2;

    .line 296
    .line 297
    sget-object v2, Lsi2;->a:Lej4;

    .line 298
    .line 299
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    new-instance v12, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .line 307
    .line 308
    aget-object v2, v2, v9

    .line 309
    .line 310
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-static {v4, v2}, Lsi2;->a(ILjava/util/List;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    sget-object v12, Lsi2;->a:Lej4;

    .line 325
    .line 326
    invoke-virtual {v12, v2}, Lej4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    check-cast v12, Landroid/graphics/Typeface;

    .line 331
    .line 332
    if-eqz v12, :cond_f

    .line 333
    .line 334
    new-instance p0, Lzo2;

    .line 335
    .line 336
    invoke-direct {p0, v11, v12, v5}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, p0}, Lr52;->execute(Ljava/lang/Runnable;)V

    .line 340
    .line 341
    .line 342
    move-object v7, v12

    .line 343
    goto/16 :goto_d

    .line 344
    .line 345
    :cond_f
    if-ne v10, v3, :cond_10

    .line 346
    .line 347
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    new-instance v1, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 354
    .line 355
    .line 356
    aget-object v0, v0, v9

    .line 357
    .line 358
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-static {v2, p0, v0, v4}, Lsi2;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lri2;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-virtual {v13, p0}, Ldq;->H(Lri2;)V

    .line 373
    .line 374
    .line 375
    iget-object v7, p0, Lri2;->a:Landroid/graphics/Typeface;

    .line 376
    .line 377
    goto/16 :goto_d

    .line 378
    .line 379
    :cond_10
    move-object v3, v0

    .line 380
    new-instance v0, Lqi2;

    .line 381
    .line 382
    const/4 v5, 0x0

    .line 383
    move-object v1, v2

    .line 384
    move-object v2, p0

    .line 385
    invoke-direct/range {v0 .. v5}, Lqi2;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;IB)V

    .line 386
    .line 387
    .line 388
    :try_start_1
    sget-object p0, Lsi2;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 389
    .line 390
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 391
    .line 392
    .line 393
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    .line 394
    int-to-long v0, v10

    .line 395
    :try_start_2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 396
    .line 397
    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 401
    :try_start_3
    check-cast p0, Lri2;

    .line 402
    .line 403
    invoke-virtual {v13, p0}, Ldq;->H(Lri2;)V

    .line 404
    .line 405
    .line 406
    iget-object v7, p0, Lri2;->a:Landroid/graphics/Typeface;

    .line 407
    .line 408
    goto/16 :goto_d

    .line 409
    .line 410
    :catch_1
    move-exception v0

    .line 411
    move-object p0, v0

    .line 412
    goto :goto_a

    .line 413
    :catch_2
    move-exception v0

    .line 414
    move-object p0, v0

    .line 415
    goto :goto_b

    .line 416
    :catch_3
    new-instance p0, Ljava/lang/InterruptedException;

    .line 417
    .line 418
    const-string v0, "timeout"

    .line 419
    .line 420
    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw p0

    .line 424
    :goto_a
    throw p0

    .line 425
    :goto_b
    new-instance v0, Ljava/lang/RuntimeException;

    .line 426
    .line 427
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 428
    .line 429
    .line 430
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 431
    :catch_4
    iget-object p0, v13, Ldq;->Z:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast p0, Lr52;

    .line 434
    .line 435
    iget-object v0, v13, Ldq;->Y:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lrb8;

    .line 438
    .line 439
    new-instance v1, Lvd0;

    .line 440
    .line 441
    invoke-direct {v1, v0, v6, v9}, Lvd0;-><init>(Ljava/lang/Object;IB)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {p0, v1}, Lr52;->execute(Ljava/lang/Runnable;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_d

    .line 448
    .line 449
    :cond_11
    const-string p0, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 450
    .line 451
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v7

    .line 455
    :cond_12
    invoke-static {v4, v0}, Lsi2;->a(ILjava/util/List;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    sget-object v3, Lsi2;->a:Lej4;

    .line 460
    .line 461
    invoke-virtual {v3, v2}, Lej4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    check-cast v3, Landroid/graphics/Typeface;

    .line 466
    .line 467
    if-eqz v3, :cond_13

    .line 468
    .line 469
    new-instance p0, Lzo2;

    .line 470
    .line 471
    invoke-direct {p0, v11, v3, v5}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, p0}, Lr52;->execute(Ljava/lang/Runnable;)V

    .line 475
    .line 476
    .line 477
    move-object v7, v3

    .line 478
    goto :goto_d

    .line 479
    :cond_13
    new-instance v1, Lay1;

    .line 480
    .line 481
    invoke-direct {v1, v13, v8}, Lay1;-><init>(Ljava/lang/Object;B)V

    .line 482
    .line 483
    .line 484
    sget-object v5, Lsi2;->c:Ljava/lang/Object;

    .line 485
    .line 486
    monitor-enter v5

    .line 487
    :try_start_4
    sget-object v3, Lsi2;->d:Ll97;

    .line 488
    .line 489
    invoke-virtual {v3, v2}, Ll97;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    check-cast v6, Ljava/util/ArrayList;

    .line 494
    .line 495
    if-eqz v6, :cond_14

    .line 496
    .line 497
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    monitor-exit v5

    .line 501
    goto :goto_d

    .line 502
    :catchall_0
    move-exception v0

    .line 503
    move-object p0, v0

    .line 504
    goto :goto_e

    .line 505
    :cond_14
    new-instance v6, Ljava/util/ArrayList;

    .line 506
    .line 507
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3, v2, v6}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 517
    move-object v3, v0

    .line 518
    new-instance v0, Lqi2;

    .line 519
    .line 520
    const/4 v5, 0x1

    .line 521
    move-object v1, v2

    .line 522
    move-object v2, p0

    .line 523
    invoke-direct/range {v0 .. v5}, Lqi2;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;IB)V

    .line 524
    .line 525
    .line 526
    sget-object p0, Lsi2;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 527
    .line 528
    new-instance v2, Lay1;

    .line 529
    .line 530
    invoke-direct {v2, v1, v12}, Lay1;-><init>(Ljava/lang/Object;B)V

    .line 531
    .line 532
    .line 533
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-nez v1, :cond_15

    .line 538
    .line 539
    new-instance v1, Landroid/os/Handler;

    .line 540
    .line 541
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 546
    .line 547
    .line 548
    goto :goto_c

    .line 549
    :cond_15
    new-instance v1, Landroid/os/Handler;

    .line 550
    .line 551
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 552
    .line 553
    .line 554
    :goto_c
    new-instance v3, Lgc4;

    .line 555
    .line 556
    invoke-direct {v3}, Lgc4;-><init>()V

    .line 557
    .line 558
    .line 559
    iput-object v0, v3, Lgc4;->Y:Ljava/lang/Object;

    .line 560
    .line 561
    iput-object v2, v3, Lgc4;->Z:Ljava/lang/Object;

    .line 562
    .line 563
    iput-object v1, v3, Lgc4;->f0:Ljava/lang/Object;

    .line 564
    .line 565
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 566
    .line 567
    .line 568
    :goto_d
    move-object p0, v7

    .line 569
    move-object/from16 v7, p2

    .line 570
    .line 571
    goto :goto_f

    .line 572
    :goto_e
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 573
    throw p0

    .line 574
    :cond_16
    sget-object v5, Lhj8;->a:Lg28;

    .line 575
    .line 576
    move-object v0, p1

    .line 577
    check-cast v0, Lui2;

    .line 578
    .line 579
    move-object/from16 v7, p2

    .line 580
    .line 581
    invoke-virtual {v5, p0, v0, v7, v4}, Lg28;->e(Landroid/content/Context;Lui2;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    if-eqz v1, :cond_18

    .line 586
    .line 587
    if-eqz p0, :cond_17

    .line 588
    .line 589
    new-instance v0, Landroid/os/Handler;

    .line 590
    .line 591
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 596
    .line 597
    .line 598
    new-instance v2, Lsc4;

    .line 599
    .line 600
    invoke-direct {v2, v1, p0, v3}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 604
    .line 605
    .line 606
    goto :goto_f

    .line 607
    :cond_17
    invoke-virtual {v1, v6}, Lwl7;->r(I)V

    .line 608
    .line 609
    .line 610
    :cond_18
    :goto_f
    if-eqz p0, :cond_19

    .line 611
    .line 612
    sget-object v0, Lhj8;->b:Lej4;

    .line 613
    .line 614
    invoke-static/range {p2 .. p6}, Lhj8;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-virtual {v0, v1, p0}, Lej4;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    :cond_19
    return-object p0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 10

    .line 1
    sget-object v0, Lhj8;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lhj8;->c:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    const/high16 v1, 0x41200000    # 10.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lhj8;->c:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 20
    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    sget-object v9, Lhj8;->c:Landroid/graphics/Paint;

    .line 24
    .line 25
    const-string v1, " "

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x1

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-static/range {v1 .. v9}, Landroid/graphics/text/TextRunShaper;->shapeTextRun(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/graphics/text/PositionedGlyphs;->glyphCount()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, v0}, Landroid/graphics/text/PositionedGlyphs;->getFont(I)Landroid/graphics/fonts/Font;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.class public final synthetic Li82;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Li82;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Li82;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Li82;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Li82;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x200

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/ContentResolver;

    .line 13
    .line 14
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroid/net/Uri;

    .line 17
    .line 18
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lio/sentry/s6;->getMaxAttachmentSize()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-static {v0, v3, v4}, Lio/sentry/util/b;->k(Ljava/io/InputStream;J)[B

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v0, "Unable to open image attachment: "

    .line 42
    .line 43
    invoke-static {p0, v0}, Lb61;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-object v2

    .line 47
    :pswitch_0
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lio/sentry/android/core/ScreenshotEventProcessor;

    .line 50
    .line 51
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Landroid/graphics/Bitmap;

    .line 54
    .line 55
    iget-object v0, v0, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 56
    .line 57
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_1
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 69
    .line 70
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_1
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 74
    .line 75
    invoke-virtual {p0, v4, v1, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-gtz p0, :cond_2

    .line 86
    .line 87
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 88
    .line 89
    const-string v4, "Screenshot is 0 bytes, not attaching the image."

    .line 90
    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    .line 92
    .line 93
    invoke-interface {v0, p0, v4, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    .line 95
    .line 96
    :try_start_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_0
    move-exception p0

    .line 101
    goto :goto_3

    .line 102
    :catchall_1
    move-exception p0

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 108
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 109
    .line 110
    .line 111
    move-object v2, p0

    .line 112
    goto :goto_4

    .line 113
    :goto_1
    :try_start_5
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_2
    move-exception v1

    .line 118
    :try_start_6
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 122
    :goto_3
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 123
    .line 124
    const-string v3, "Compressing bitmap failed."

    .line 125
    .line 126
    invoke-interface {v0, v1, v3, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    :goto_4
    return-object v2

    .line 130
    :pswitch_1
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Lio/sentry/android/core/p0;

    .line 133
    .line 134
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 137
    .line 138
    iget-object v0, v0, Lio/sentry/android/core/p0;->a:Landroid/content/Context;

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Lio/sentry/android/core/SentryAndroidOptions;->getOrCreateDeviceInfoUtil(Landroid/content/Context;)Lio/sentry/android/core/r0;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_2
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lio/sentry/o1;

    .line 148
    .line 149
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, Lio/sentry/clientreport/b;

    .line 152
    .line 153
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 156
    .line 157
    .line 158
    :try_start_7
    new-instance v2, Ljava/io/BufferedWriter;

    .line 159
    .line 160
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 161
    .line 162
    sget-object v5, Lio/sentry/h5;->d:Ljava/nio/charset/Charset;

    .line 163
    .line 164
    invoke-direct {v4, v1, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v2, v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 168
    .line 169
    .line 170
    :try_start_8
    invoke-interface {v0, p0, v2}, Lio/sentry/o1;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 174
    .line 175
    .line 176
    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 177
    :try_start_9
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :catchall_3
    move-exception p0

    .line 185
    goto :goto_6

    .line 186
    :catchall_4
    move-exception p0

    .line 187
    :try_start_a
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :catchall_5
    move-exception v0

    .line 192
    :try_start_b
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    :goto_5
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 196
    :goto_6
    :try_start_c
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :catchall_6
    move-exception v0

    .line 201
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    :goto_7
    throw p0

    .line 205
    :pswitch_3
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Lio/sentry/o1;

    .line 208
    .line 209
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p0, Lio/sentry/y4;

    .line 212
    .line 213
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 214
    .line 215
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 216
    .line 217
    .line 218
    :try_start_d
    new-instance v2, Ljava/io/BufferedWriter;

    .line 219
    .line 220
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 221
    .line 222
    sget-object v5, Lio/sentry/h5;->d:Ljava/nio/charset/Charset;

    .line 223
    .line 224
    invoke-direct {v4, v1, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v2, v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 228
    .line 229
    .line 230
    :try_start_e
    invoke-interface {v0, p0, v2}, Lio/sentry/o1;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 234
    .line 235
    .line 236
    move-result-object p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 237
    :try_start_f
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 241
    .line 242
    .line 243
    return-object p0

    .line 244
    :catchall_7
    move-exception p0

    .line 245
    goto :goto_9

    .line 246
    :catchall_8
    move-exception p0

    .line 247
    :try_start_10
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 248
    .line 249
    .line 250
    goto :goto_8

    .line 251
    :catchall_9
    move-exception v0

    .line 252
    :try_start_11
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    :goto_8
    throw p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 256
    :goto_9
    :try_start_12
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 257
    .line 258
    .line 259
    goto :goto_a

    .line 260
    :catchall_a
    move-exception v0

    .line 261
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    :goto_a
    throw p0

    .line 265
    :pswitch_4
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Lio/sentry/o1;

    .line 268
    .line 269
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p0, Lio/sentry/v5;

    .line 272
    .line 273
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 274
    .line 275
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 276
    .line 277
    .line 278
    :try_start_13
    new-instance v2, Ljava/io/BufferedWriter;

    .line 279
    .line 280
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 281
    .line 282
    sget-object v5, Lio/sentry/h5;->d:Ljava/nio/charset/Charset;

    .line 283
    .line 284
    invoke-direct {v4, v1, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {v2, v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 288
    .line 289
    .line 290
    :try_start_14
    invoke-interface {v0, p0, v2}, Lio/sentry/o1;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 294
    .line 295
    .line 296
    move-result-object p0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 297
    :try_start_15
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 301
    .line 302
    .line 303
    return-object p0

    .line 304
    :catchall_b
    move-exception p0

    .line 305
    goto :goto_c

    .line 306
    :catchall_c
    move-exception p0

    .line 307
    :try_start_16
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 308
    .line 309
    .line 310
    goto :goto_b

    .line 311
    :catchall_d
    move-exception v0

    .line 312
    :try_start_17
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    :goto_b
    throw p0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 316
    :goto_c
    :try_start_18
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    .line 317
    .line 318
    .line 319
    goto :goto_d

    .line 320
    :catchall_e
    move-exception v0

    .line 321
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    :goto_d
    throw p0

    .line 325
    :pswitch_5
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Lio/sentry/o1;

    .line 328
    .line 329
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p0, Lio/sentry/d7;

    .line 332
    .line 333
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 334
    .line 335
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 336
    .line 337
    .line 338
    :try_start_19
    new-instance v2, Ljava/io/BufferedWriter;

    .line 339
    .line 340
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 341
    .line 342
    sget-object v5, Lio/sentry/h5;->d:Ljava/nio/charset/Charset;

    .line 343
    .line 344
    invoke-direct {v4, v1, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 345
    .line 346
    .line 347
    invoke-direct {v2, v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    .line 348
    .line 349
    .line 350
    :try_start_1a
    invoke-interface {v0, p0, v2}, Lio/sentry/o1;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 354
    .line 355
    .line 356
    move-result-object p0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_10

    .line 357
    :try_start_1b
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 361
    .line 362
    .line 363
    return-object p0

    .line 364
    :catchall_f
    move-exception p0

    .line 365
    goto :goto_f

    .line 366
    :catchall_10
    move-exception p0

    .line 367
    :try_start_1c
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_11

    .line 368
    .line 369
    .line 370
    goto :goto_e

    .line 371
    :catchall_11
    move-exception v0

    .line 372
    :try_start_1d
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    :goto_e
    throw p0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_f

    .line 376
    :goto_f
    :try_start_1e
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_12

    .line 377
    .line 378
    .line 379
    goto :goto_10

    .line 380
    :catchall_12
    move-exception v0

    .line 381
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 382
    .line 383
    .line 384
    :goto_10
    throw p0

    .line 385
    :pswitch_6
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v0, Lio/sentry/o1;

    .line 388
    .line 389
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast p0, Lio/sentry/z5;

    .line 392
    .line 393
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 394
    .line 395
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 396
    .line 397
    .line 398
    :try_start_1f
    new-instance v2, Ljava/io/BufferedWriter;

    .line 399
    .line 400
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 401
    .line 402
    sget-object v5, Lio/sentry/h5;->d:Ljava/nio/charset/Charset;

    .line 403
    .line 404
    invoke-direct {v4, v1, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 405
    .line 406
    .line 407
    invoke-direct {v2, v4, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_13

    .line 408
    .line 409
    .line 410
    :try_start_20
    invoke-interface {v0, p0, v2}, Lio/sentry/o1;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 414
    .line 415
    .line 416
    move-result-object p0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_14

    .line 417
    :try_start_21
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_13

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 421
    .line 422
    .line 423
    return-object p0

    .line 424
    :catchall_13
    move-exception p0

    .line 425
    goto :goto_12

    .line 426
    :catchall_14
    move-exception p0

    .line 427
    :try_start_22
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_15

    .line 428
    .line 429
    .line 430
    goto :goto_11

    .line 431
    :catchall_15
    move-exception v0

    .line 432
    :try_start_23
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    :goto_11
    throw p0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_13

    .line 436
    :goto_12
    :try_start_24
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_16

    .line 437
    .line 438
    .line 439
    goto :goto_13

    .line 440
    :catchall_16
    move-exception v0

    .line 441
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 442
    .line 443
    .line 444
    :goto_13
    throw p0

    .line 445
    :pswitch_7
    iget-object v0, p0, Li82;->b:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, Landroid/content/Context;

    .line 448
    .line 449
    iget-object p0, p0, Li82;->c:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast p0, Landroid/content/Intent;

    .line 452
    .line 453
    invoke-static {}, Lz47;->H()Lz47;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    iget-object v4, v3, Lz47;->g0:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v4, Ljava/util/ArrayDeque;

    .line 460
    .line 461
    invoke-virtual {v4, p0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    new-instance p0, Landroid/content/Intent;

    .line 465
    .line 466
    const-string v4, "com.google.firebase.MESSAGING_EVENT"

    .line 467
    .line 468
    invoke-direct {p0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    invoke-virtual {p0, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 476
    .line 477
    .line 478
    monitor-enter v3

    .line 479
    :try_start_25
    iget-object v4, v3, Lz47;->Y:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v4, Ljava/lang/String;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_17

    .line 482
    .line 483
    if-eqz v4, :cond_3

    .line 484
    .line 485
    monitor-exit v3

    .line 486
    move-object v2, v4

    .line 487
    goto :goto_18

    .line 488
    :cond_3
    :try_start_26
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-virtual {v4, p0, v1}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    if-eqz v1, :cond_8

    .line 497
    .line 498
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 499
    .line 500
    if-nez v1, :cond_4

    .line 501
    .line 502
    goto :goto_17

    .line 503
    :cond_4
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-eqz v4, :cond_7

    .line 514
    .line 515
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 516
    .line 517
    if-nez v4, :cond_5

    .line 518
    .line 519
    goto :goto_16

    .line 520
    :cond_5
    const-string v2, "."

    .line 521
    .line 522
    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-eqz v2, :cond_6

    .line 527
    .line 528
    new-instance v2, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 541
    .line 542
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    iput-object v1, v3, Lz47;->Y:Ljava/lang/Object;

    .line 550
    .line 551
    :goto_14
    move-object v2, v1

    .line 552
    goto :goto_15

    .line 553
    :catchall_17
    move-exception p0

    .line 554
    goto :goto_1b

    .line 555
    :cond_6
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 556
    .line 557
    iput-object v1, v3, Lz47;->Y:Ljava/lang/Object;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_17

    .line 558
    .line 559
    goto :goto_14

    .line 560
    :goto_15
    monitor-exit v3

    .line 561
    goto :goto_18

    .line 562
    :cond_7
    :goto_16
    monitor-exit v3

    .line 563
    goto :goto_18

    .line 564
    :cond_8
    :goto_17
    monitor-exit v3

    .line 565
    :goto_18
    if-eqz v2, :cond_9

    .line 566
    .line 567
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 572
    .line 573
    .line 574
    :cond_9
    :try_start_27
    invoke-virtual {v3, v0}, Lz47;->L(Landroid/content/Context;)Z

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    if-eqz v1, :cond_a

    .line 579
    .line 580
    invoke-static {v0, p0}, Li21;->V(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 581
    .line 582
    .line 583
    move-result-object p0

    .line 584
    goto :goto_19

    .line 585
    :cond_a
    invoke-virtual {v0, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 586
    .line 587
    .line 588
    move-result-object p0
    :try_end_27
    .catch Ljava/lang/SecurityException; {:try_start_27 .. :try_end_27} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_27 .. :try_end_27} :catch_0

    .line 589
    :goto_19
    if-nez p0, :cond_b

    .line 590
    .line 591
    const/16 p0, 0x194

    .line 592
    .line 593
    goto :goto_1a

    .line 594
    :cond_b
    const/4 p0, -0x1

    .line 595
    goto :goto_1a

    .line 596
    :catch_0
    move-exception p0

    .line 597
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    const/16 p0, 0x192

    .line 601
    .line 602
    goto :goto_1a

    .line 603
    :catch_1
    const/16 p0, 0x191

    .line 604
    .line 605
    :goto_1a
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    return-object p0

    .line 610
    :goto_1b
    :try_start_28
    monitor-exit v3
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_17

    .line 611
    throw p0

    .line 612
    nop

    .line 613
    :pswitch_data_0
    .packed-switch 0x0
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

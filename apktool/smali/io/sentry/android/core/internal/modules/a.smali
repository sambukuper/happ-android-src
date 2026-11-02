.class public final synthetic Lio/sentry/android/core/internal/modules/a;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/ndk/b;Lio/sentry/f7;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, Lio/sentry/android/core/internal/modules/a;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lio/sentry/android/core/internal/modules/a;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, Lio/sentry/android/core/internal/modules/a;->X:B

    iput-object p1, p0, Lio/sentry/android/core/internal/modules/a;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lio/sentry/android/core/internal/modules/a;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, Lio/sentry/android/core/internal/modules/a;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Ls91;

    .line 13
    .line 14
    iget-object v1, v0, Ls91;->g0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lio/sentry/transport/o;

    .line 33
    .line 34
    invoke-interface {v2, v0}, Lio/sentry/transport/o;->p(Ls91;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_0
    check-cast v0, Lio/sentry/android/replay/capture/c;

    .line 40
    .line 41
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Lio/sentry/android/replay/l;->close()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 49
    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v0, v0, Lio/sentry/android/replay/capture/c;->m:Lio/sentry/android/replay/capture/a;

    .line 64
    .line 65
    sget-object v2, Lio/sentry/android/replay/capture/c;->u:[Lnw3;

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    aget-object v2, v2, v4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, v0, Lio/sentry/android/replay/capture/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    new-instance v4, Lo76;

    .line 89
    .line 90
    iget-object v5, v0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/android/replay/capture/c;

    .line 91
    .line 92
    invoke-direct {v4, v2, v1, v5, v3}, Lo76;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    iget-object v0, v0, Lio/sentry/android/replay/capture/a;->c:Lio/sentry/android/replay/capture/c;

    .line 96
    .line 97
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/s6;

    .line 98
    .line 99
    invoke-virtual {v1}, Lio/sentry/s6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v2}, Lio/sentry/util/thread/a;->c()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    iget-object v0, v0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 110
    .line 111
    new-instance v1, Lio/sentry/android/replay/util/h;

    .line 112
    .line 113
    new-instance v2, Lio/sentry/t2;

    .line 114
    .line 115
    invoke-direct {v2, v4, v3}, Lio/sentry/t2;-><init>(Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    const-string v3, "CaptureStrategy.runInBackground"

    .line 119
    .line 120
    invoke-direct {v1, v2, v3}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    :try_start_0
    invoke-virtual {v4}, Lo76;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 137
    .line 138
    const-string v3, "Failed to execute task CaptureStrategy.runInBackground"

    .line 139
    .line 140
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    :goto_1
    return-void

    .line 144
    :pswitch_1
    check-cast v0, Lio/sentry/android/replay/a0;

    .line 145
    .line 146
    iget-object v1, v0, Lio/sentry/android/replay/a0;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_4

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    :try_start_1
    sget-object v1, Lio/sentry/android/replay/g0;->b:Lg44;

    .line 156
    .line 157
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    sget-object v3, Lio/sentry/android/replay/g0;->c:Lg44;

    .line 164
    .line 165
    invoke-interface {v3}, Lg44;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Ljava/lang/reflect/Field;

    .line 170
    .line 171
    if-eqz v3, :cond_5

    .line 172
    .line 173
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    check-cast v4, Ljava/util/ArrayList;

    .line 181
    .line 182
    iget-object v5, v0, Lio/sentry/android/replay/a0;->Y:Lio/sentry/util/a;

    .line 183
    .line 184
    invoke-virtual {v5}, Lio/sentry/util/a;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 185
    .line 186
    .line 187
    :try_start_2
    iget-object v0, v0, Lio/sentry/android/replay/a0;->f0:Lio/sentry/android/replay/z;

    .line 188
    .line 189
    invoke-virtual {v0, v4}, Lio/sentry/android/replay/z;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 190
    .line 191
    .line 192
    :try_start_3
    invoke-static {v5, v2}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catchall_1
    move-exception v0

    .line 200
    move-object v1, v0

    .line 201
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 202
    :catchall_2
    move-exception v0

    .line 203
    :try_start_5
    invoke-static {v5, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 207
    :catchall_3
    :cond_5
    :goto_2
    return-void

    .line 208
    :pswitch_2
    check-cast v0, Lio/sentry/android/replay/ReplayIntegration;

    .line 209
    .line 210
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->f0:Lio/sentry/android/core/SentryAndroidOptions;

    .line 211
    .line 212
    const-string v4, "options"

    .line 213
    .line 214
    if-eqz v1, :cond_2a

    .line 215
    .line 216
    invoke-virtual {v1}, Lio/sentry/s6;->findPersistingScopeObserver()Lio/sentry/cache/g;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-string v5, ""

    .line 221
    .line 222
    if-eqz v1, :cond_29

    .line 223
    .line 224
    iget-object v6, v0, Lio/sentry/android/replay/ReplayIntegration;->f0:Lio/sentry/android/core/SentryAndroidOptions;

    .line 225
    .line 226
    if-eqz v6, :cond_28

    .line 227
    .line 228
    const-string v7, "replay.json"

    .line 229
    .line 230
    const-class v8, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v1, v6, v7, v8}, Lio/sentry/cache/g;->j(Lio/sentry/s6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Ljava/lang/String;

    .line 237
    .line 238
    if-nez v6, :cond_6

    .line 239
    .line 240
    goto/16 :goto_1c

    .line 241
    .line 242
    :cond_6
    new-instance v12, Lio/sentry/protocol/w;

    .line 243
    .line 244
    invoke-direct {v12, v6}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    sget-object v7, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 248
    .line 249
    invoke-virtual {v12, v7}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-eqz v7, :cond_7

    .line 254
    .line 255
    invoke-virtual {v0, v5}, Lio/sentry/android/replay/ReplayIntegration;->a0(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_1d

    .line 259
    .line 260
    :cond_7
    iget-object v7, v0, Lio/sentry/android/replay/ReplayIntegration;->f0:Lio/sentry/android/core/SentryAndroidOptions;

    .line 261
    .line 262
    if-eqz v7, :cond_27

    .line 263
    .line 264
    invoke-virtual {v7}, Lio/sentry/s6;->getCacheDirPath()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    const/4 v9, 0x0

    .line 269
    if-eqz v8, :cond_9

    .line 270
    .line 271
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-nez v8, :cond_8

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_8
    new-instance v8, Ljava/io/File;

    .line 279
    .line 280
    invoke-virtual {v7}, Lio/sentry/s6;->getCacheDirPath()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    new-instance v11, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    const-string v13, "replay_"

    .line 290
    .line 291
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    invoke-direct {v8, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 305
    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_9
    :goto_3
    invoke-virtual {v7}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    sget-object v10, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 313
    .line 314
    const-string v11, "SentryOptions.cacheDirPath is not set, session replay is no-op"

    .line 315
    .line 316
    new-array v13, v9, [Ljava/lang/Object;

    .line 317
    .line 318
    invoke-interface {v8, v10, v11, v13}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    move-object v8, v2

    .line 322
    :goto_4
    new-instance v10, Ljava/io/File;

    .line 323
    .line 324
    const-string v11, ".ongoing_segment"

    .line 325
    .line 326
    invoke-direct {v10, v8, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    sget-object v23, Ld02;->X:Ld02;

    .line 334
    .line 335
    if-nez v11, :cond_a

    .line 336
    .line 337
    invoke-virtual {v7}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    sget-object v7, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 342
    .line 343
    const-string v9, "No ongoing segment found for replay: %s"

    .line 344
    .line 345
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    invoke-interface {v3, v7, v9, v10}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v8}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 353
    .line 354
    .line 355
    move-object/from16 v16, v2

    .line 356
    .line 357
    move-object/from16 v19, v4

    .line 358
    .line 359
    goto/16 :goto_19

    .line 360
    .line 361
    :cond_a
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 362
    .line 363
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 364
    .line 365
    .line 366
    sget-object v13, Liq0;->a:Ljava/nio/charset/Charset;

    .line 367
    .line 368
    new-instance v14, Ljava/io/InputStreamReader;

    .line 369
    .line 370
    new-instance v15, Ljava/io/FileInputStream;

    .line 371
    .line 372
    invoke-direct {v15, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 373
    .line 374
    .line 375
    invoke-direct {v14, v15, v13}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 376
    .line 377
    .line 378
    new-instance v10, Ljava/io/BufferedReader;

    .line 379
    .line 380
    const/16 v13, 0x2000

    .line 381
    .line 382
    invoke-direct {v10, v14, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 383
    .line 384
    .line 385
    :try_start_6
    invoke-static {v10}, Ldt7;->c(Ljava/io/BufferedReader;)Lu27;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    check-cast v13, Lt21;

    .line 390
    .line 391
    invoke-virtual {v13}, Lt21;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v13

    .line 395
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v14

    .line 399
    if-eqz v14, :cond_b

    .line 400
    .line 401
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    check-cast v14, Ljava/lang/String;

    .line 406
    .line 407
    const-string v15, "="

    .line 408
    .line 409
    filled-new-array {v15}, [Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v15

    .line 413
    move-object/from16 v16, v2

    .line 414
    .line 415
    const/4 v2, 0x2

    .line 416
    invoke-static {v14, v15, v2}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v14

    .line 424
    check-cast v14, Ljava/lang/String;

    .line 425
    .line 426
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    check-cast v2, Ljava/lang/String;

    .line 431
    .line 432
    invoke-interface {v11, v14, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 433
    .line 434
    .line 435
    move-object/from16 v2, v16

    .line 436
    .line 437
    goto :goto_5

    .line 438
    :catchall_4
    move-exception v0

    .line 439
    move-object v1, v0

    .line 440
    goto/16 :goto_1b

    .line 441
    .line 442
    :cond_b
    move-object/from16 v16, v2

    .line 443
    .line 444
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    .line 445
    .line 446
    .line 447
    const-string v2, "config.height"

    .line 448
    .line 449
    invoke-virtual {v11, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    check-cast v2, Ljava/lang/String;

    .line 454
    .line 455
    if-eqz v2, :cond_c

    .line 456
    .line 457
    invoke-static {v2}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    goto :goto_6

    .line 462
    :cond_c
    move-object/from16 v2, v16

    .line 463
    .line 464
    :goto_6
    const-string v10, "config.width"

    .line 465
    .line 466
    invoke-virtual {v11, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    check-cast v10, Ljava/lang/String;

    .line 471
    .line 472
    if-eqz v10, :cond_d

    .line 473
    .line 474
    invoke-static {v10}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v10

    .line 478
    goto :goto_7

    .line 479
    :cond_d
    move-object/from16 v10, v16

    .line 480
    .line 481
    :goto_7
    const-string v13, "config.frame-rate"

    .line 482
    .line 483
    invoke-virtual {v11, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v13

    .line 487
    check-cast v13, Ljava/lang/String;

    .line 488
    .line 489
    if-eqz v13, :cond_e

    .line 490
    .line 491
    invoke-static {v13}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v13

    .line 495
    goto :goto_8

    .line 496
    :cond_e
    move-object/from16 v13, v16

    .line 497
    .line 498
    :goto_8
    const-string v14, "config.bit-rate"

    .line 499
    .line 500
    invoke-virtual {v11, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v14

    .line 504
    check-cast v14, Ljava/lang/String;

    .line 505
    .line 506
    if-eqz v14, :cond_f

    .line 507
    .line 508
    invoke-static {v14}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v14

    .line 512
    goto :goto_9

    .line 513
    :cond_f
    move-object/from16 v14, v16

    .line 514
    .line 515
    :goto_9
    const-string v15, "segment.id"

    .line 516
    .line 517
    invoke-virtual {v11, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v15

    .line 521
    check-cast v15, Ljava/lang/String;

    .line 522
    .line 523
    if-eqz v15, :cond_10

    .line 524
    .line 525
    invoke-static {v15}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v15

    .line 529
    goto :goto_a

    .line 530
    :cond_10
    move-object/from16 v15, v16

    .line 531
    .line 532
    :goto_a
    :try_start_7
    const-string v9, "segment.timestamp"

    .line 533
    .line 534
    invoke-virtual {v11, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v9

    .line 538
    check-cast v9, Ljava/lang/String;

    .line 539
    .line 540
    if-nez v9, :cond_11

    .line 541
    .line 542
    move-object v9, v5

    .line 543
    :cond_11
    invoke-static {v9}, Lio/sentry/config/a;->h(Ljava/lang/String;)Ljava/util/Date;

    .line 544
    .line 545
    .line 546
    move-result-object v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 547
    goto :goto_b

    .line 548
    :catchall_5
    move-object/from16 v9, v16

    .line 549
    .line 550
    :goto_b
    :try_start_8
    const-string v3, "replay.type"

    .line 551
    .line 552
    invoke-virtual {v11, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    check-cast v3, Ljava/lang/String;

    .line 557
    .line 558
    if-nez v3, :cond_12

    .line 559
    .line 560
    move-object v3, v5

    .line 561
    :cond_12
    invoke-static {v3}, Lio/sentry/t6;->valueOf(Ljava/lang/String;)Lio/sentry/t6;

    .line 562
    .line 563
    .line 564
    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 565
    goto :goto_c

    .line 566
    :catchall_6
    move-object/from16 v3, v16

    .line 567
    .line 568
    :goto_c
    if-eqz v2, :cond_20

    .line 569
    .line 570
    if-eqz v10, :cond_20

    .line 571
    .line 572
    if-eqz v13, :cond_20

    .line 573
    .line 574
    if-eqz v14, :cond_20

    .line 575
    .line 576
    if-eqz v15, :cond_20

    .line 577
    .line 578
    move-object/from16 v18, v2

    .line 579
    .line 580
    const/4 v2, -0x1

    .line 581
    move-object/from16 v19, v4

    .line 582
    .line 583
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-eq v4, v2, :cond_21

    .line 588
    .line 589
    if-eqz v9, :cond_21

    .line 590
    .line 591
    if-nez v3, :cond_13

    .line 592
    .line 593
    goto/16 :goto_18

    .line 594
    .line 595
    :cond_13
    new-instance v24, Lio/sentry/android/replay/d0;

    .line 596
    .line 597
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 598
    .line 599
    .line 600
    move-result v25

    .line 601
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 602
    .line 603
    .line 604
    move-result v26

    .line 605
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 606
    .line 607
    .line 608
    move-result v29

    .line 609
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 610
    .line 611
    .line 612
    move-result v30

    .line 613
    const/high16 v27, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/high16 v28, 0x3f800000    # 1.0f

    .line 616
    .line 617
    invoke-direct/range {v24 .. v30}, Lio/sentry/android/replay/d0;-><init>(IIFFII)V

    .line 618
    .line 619
    .line 620
    new-instance v2, Lio/sentry/android/replay/l;

    .line 621
    .line 622
    invoke-direct {v2, v7, v12}, Lio/sentry/android/replay/l;-><init>(Lio/sentry/s6;Lio/sentry/protocol/w;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2}, Lio/sentry/android/replay/l;->m()Ljava/io/File;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    if-eqz v4, :cond_14

    .line 630
    .line 631
    new-instance v10, Lio/sentry/a0;

    .line 632
    .line 633
    const/4 v14, 0x1

    .line 634
    invoke-direct {v10, v2, v14}, Lio/sentry/a0;-><init>(Ljava/lang/Object;B)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4, v10}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 638
    .line 639
    .line 640
    :cond_14
    iget-object v4, v2, Lio/sentry/android/replay/l;->j0:Ljava/util/ArrayList;

    .line 641
    .line 642
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 643
    .line 644
    .line 645
    move-result v10

    .line 646
    if-eqz v10, :cond_15

    .line 647
    .line 648
    invoke-virtual {v7}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 653
    .line 654
    const-string v4, "No frames found for replay: %s, deleting the replay"

    .line 655
    .line 656
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v7

    .line 660
    invoke-interface {v2, v3, v4, v7}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    invoke-static {v8}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 664
    .line 665
    .line 666
    :goto_d
    move-object/from16 v2, v16

    .line 667
    .line 668
    goto/16 :goto_19

    .line 669
    .line 670
    :cond_15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v8

    .line 674
    const/4 v14, 0x1

    .line 675
    if-le v8, v14, :cond_16

    .line 676
    .line 677
    new-instance v8, Lio/sentry/android/replay/i;

    .line 678
    .line 679
    const/4 v10, 0x0

    .line 680
    invoke-direct {v8, v10}, Lio/sentry/android/replay/i;-><init>(B)V

    .line 681
    .line 682
    .line 683
    invoke-static {v4, v8}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 684
    .line 685
    .line 686
    goto :goto_e

    .line 687
    :cond_16
    const/4 v10, 0x0

    .line 688
    :goto_e
    const-string v8, "replay.flushed"

    .line 689
    .line 690
    invoke-virtual {v11, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    check-cast v8, Ljava/lang/String;

    .line 695
    .line 696
    if-eqz v8, :cond_19

    .line 697
    .line 698
    const-string v14, "true"

    .line 699
    .line 700
    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v14

    .line 704
    if-eqz v14, :cond_17

    .line 705
    .line 706
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 707
    .line 708
    goto :goto_f

    .line 709
    :cond_17
    const-string v14, "false"

    .line 710
    .line 711
    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v8

    .line 715
    if-eqz v8, :cond_18

    .line 716
    .line 717
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 718
    .line 719
    goto :goto_f

    .line 720
    :cond_18
    move-object/from16 v8, v16

    .line 721
    .line 722
    :goto_f
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 723
    .line 724
    invoke-static {v8, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v8

    .line 728
    goto :goto_10

    .line 729
    :cond_19
    move v8, v10

    .line 730
    :goto_10
    sget-object v14, Lio/sentry/t6;->SESSION:Lio/sentry/t6;

    .line 731
    .line 732
    if-eq v3, v14, :cond_1b

    .line 733
    .line 734
    if-eqz v8, :cond_1a

    .line 735
    .line 736
    goto :goto_11

    .line 737
    :cond_1a
    move/from16 v28, v10

    .line 738
    .line 739
    goto :goto_12

    .line 740
    :cond_1b
    :goto_11
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 741
    .line 742
    .line 743
    move-result v8

    .line 744
    move/from16 v28, v8

    .line 745
    .line 746
    :goto_12
    if-ne v3, v14, :cond_1c

    .line 747
    .line 748
    move-object/from16 v27, v9

    .line 749
    .line 750
    goto :goto_13

    .line 751
    :cond_1c
    invoke-static {v4}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v8

    .line 755
    check-cast v8, Lio/sentry/android/replay/m;

    .line 756
    .line 757
    iget-wide v8, v8, Lio/sentry/android/replay/m;->b:J

    .line 758
    .line 759
    new-instance v10, Ljava/util/Date;

    .line 760
    .line 761
    invoke-direct {v10, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 762
    .line 763
    .line 764
    move-object/from16 v27, v10

    .line 765
    .line 766
    :goto_13
    invoke-static {v4}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    check-cast v4, Lio/sentry/android/replay/m;

    .line 771
    .line 772
    iget-wide v8, v4, Lio/sentry/android/replay/m;->b:J

    .line 773
    .line 774
    invoke-virtual/range {v27 .. v27}, Ljava/util/Date;->getTime()J

    .line 775
    .line 776
    .line 777
    move-result-wide v14

    .line 778
    sub-long/2addr v8, v14

    .line 779
    const/16 v4, 0x3e8

    .line 780
    .line 781
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 782
    .line 783
    .line 784
    move-result v10

    .line 785
    div-int/2addr v4, v10

    .line 786
    int-to-long v13, v4

    .line 787
    add-long v29, v8, v13

    .line 788
    .line 789
    const-string v4, "replay.recording"

    .line 790
    .line 791
    invoke-virtual {v11, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    check-cast v4, Ljava/lang/String;

    .line 796
    .line 797
    if-eqz v4, :cond_1f

    .line 798
    .line 799
    new-instance v8, Ljava/io/StringReader;

    .line 800
    .line 801
    invoke-direct {v8, v4}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v7}, Lio/sentry/s6;->getSerializer()Lio/sentry/o1;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    const-class v7, Lio/sentry/f4;

    .line 809
    .line 810
    invoke-interface {v4, v8, v7}, Lio/sentry/o1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v4

    .line 814
    check-cast v4, Lio/sentry/f4;

    .line 815
    .line 816
    if-eqz v4, :cond_1d

    .line 817
    .line 818
    iget-object v7, v4, Lio/sentry/f4;->Y:Ljava/util/List;

    .line 819
    .line 820
    goto :goto_14

    .line 821
    :cond_1d
    move-object/from16 v7, v16

    .line 822
    .line 823
    :goto_14
    if-eqz v7, :cond_1e

    .line 824
    .line 825
    new-instance v7, Ljava/util/LinkedList;

    .line 826
    .line 827
    iget-object v4, v4, Lio/sentry/f4;->Y:Ljava/util/List;

    .line 828
    .line 829
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    invoke-direct {v7, v4}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 833
    .line 834
    .line 835
    goto :goto_15

    .line 836
    :cond_1e
    move-object/from16 v7, v16

    .line 837
    .line 838
    :goto_15
    if-eqz v7, :cond_1f

    .line 839
    .line 840
    :goto_16
    move-object/from16 v25, v24

    .line 841
    .line 842
    goto :goto_17

    .line 843
    :cond_1f
    move-object/from16 v7, v23

    .line 844
    .line 845
    goto :goto_16

    .line 846
    :goto_17
    new-instance v24, Lio/sentry/android/replay/f;

    .line 847
    .line 848
    const-string v4, "replay.screen-at-start"

    .line 849
    .line 850
    invoke-virtual {v11, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    move-object/from16 v32, v4

    .line 855
    .line 856
    check-cast v32, Ljava/lang/String;

    .line 857
    .line 858
    new-instance v4, Lio/sentry/android/replay/i;

    .line 859
    .line 860
    const/4 v14, 0x1

    .line 861
    invoke-direct {v4, v14}, Lio/sentry/android/replay/i;-><init>(B)V

    .line 862
    .line 863
    .line 864
    invoke-static {v7, v4}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v33

    .line 868
    move-object/from16 v26, v2

    .line 869
    .line 870
    move-object/from16 v31, v3

    .line 871
    .line 872
    invoke-direct/range {v24 .. v33}, Lio/sentry/android/replay/f;-><init>(Lio/sentry/android/replay/d0;Lio/sentry/android/replay/l;Ljava/util/Date;IJLio/sentry/t6;Ljava/lang/String;Ljava/util/List;)V

    .line 873
    .line 874
    .line 875
    move-object/from16 v2, v24

    .line 876
    .line 877
    goto :goto_19

    .line 878
    :cond_20
    move-object/from16 v19, v4

    .line 879
    .line 880
    :cond_21
    :goto_18
    invoke-virtual {v7}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 885
    .line 886
    const-string v4, "Incorrect segment values found for replay: %s, deleting the replay"

    .line 887
    .line 888
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    invoke-interface {v2, v3, v4, v7}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    invoke-static {v8}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 896
    .line 897
    .line 898
    goto/16 :goto_d

    .line 899
    .line 900
    :goto_19
    if-nez v2, :cond_22

    .line 901
    .line 902
    invoke-virtual {v0, v5}, Lio/sentry/android/replay/ReplayIntegration;->a0(Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    goto/16 :goto_1d

    .line 906
    .line 907
    :cond_22
    iget-object v3, v0, Lio/sentry/android/replay/ReplayIntegration;->f0:Lio/sentry/android/core/SentryAndroidOptions;

    .line 908
    .line 909
    if-eqz v3, :cond_26

    .line 910
    .line 911
    const-string v4, "breadcrumbs.json"

    .line 912
    .line 913
    const-class v5, Ljava/util/List;

    .line 914
    .line 915
    invoke-virtual {v1, v3, v4, v5}, Lio/sentry/cache/g;->j(Lio/sentry/s6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    instance-of v3, v1, Ljava/util/List;

    .line 920
    .line 921
    if-eqz v3, :cond_23

    .line 922
    .line 923
    check-cast v1, Ljava/util/List;

    .line 924
    .line 925
    move-object/from16 v21, v1

    .line 926
    .line 927
    goto :goto_1a

    .line 928
    :cond_23
    move-object/from16 v21, v16

    .line 929
    .line 930
    :goto_1a
    iget-object v7, v0, Lio/sentry/android/replay/ReplayIntegration;->g0:Lio/sentry/i1;

    .line 931
    .line 932
    iget-object v8, v0, Lio/sentry/android/replay/ReplayIntegration;->f0:Lio/sentry/android/core/SentryAndroidOptions;

    .line 933
    .line 934
    if-eqz v8, :cond_25

    .line 935
    .line 936
    iget-wide v9, v2, Lio/sentry/android/replay/f;->e:J

    .line 937
    .line 938
    iget-object v11, v2, Lio/sentry/android/replay/f;->c:Ljava/util/Date;

    .line 939
    .line 940
    iget v13, v2, Lio/sentry/android/replay/f;->d:I

    .line 941
    .line 942
    iget-object v1, v2, Lio/sentry/android/replay/f;->a:Lio/sentry/android/replay/d0;

    .line 943
    .line 944
    iget v14, v1, Lio/sentry/android/replay/d0;->b:I

    .line 945
    .line 946
    iget v15, v1, Lio/sentry/android/replay/d0;->a:I

    .line 947
    .line 948
    iget v3, v1, Lio/sentry/android/replay/d0;->e:I

    .line 949
    .line 950
    iget v1, v1, Lio/sentry/android/replay/d0;->f:I

    .line 951
    .line 952
    iget-object v4, v2, Lio/sentry/android/replay/f;->b:Lio/sentry/android/replay/l;

    .line 953
    .line 954
    iget-object v5, v2, Lio/sentry/android/replay/f;->f:Lio/sentry/t6;

    .line 955
    .line 956
    move/from16 v19, v1

    .line 957
    .line 958
    iget-object v1, v2, Lio/sentry/android/replay/f;->g:Ljava/lang/String;

    .line 959
    .line 960
    move-object/from16 v20, v1

    .line 961
    .line 962
    new-instance v1, Ljava/util/LinkedList;

    .line 963
    .line 964
    iget-object v2, v2, Lio/sentry/android/replay/f;->h:Ljava/util/List;

    .line 965
    .line 966
    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 967
    .line 968
    .line 969
    move-object/from16 v24, v23

    .line 970
    .line 971
    move-object/from16 v22, v1

    .line 972
    .line 973
    move/from16 v18, v3

    .line 974
    .line 975
    move-object/from16 v17, v4

    .line 976
    .line 977
    move-object/from16 v16, v5

    .line 978
    .line 979
    invoke-static/range {v7 .. v24}, Lio/sentry/android/replay/capture/h;->a(Lio/sentry/i1;Lio/sentry/s6;JLjava/util/Date;Lio/sentry/protocol/w;IIILio/sentry/t6;Lio/sentry/android/replay/l;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;Ljava/util/List;Ljava/util/List;)Lio/sentry/android/replay/capture/k;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    instance-of v2, v1, Lio/sentry/android/replay/capture/i;

    .line 984
    .line 985
    if-eqz v2, :cond_24

    .line 986
    .line 987
    new-instance v2, Lio/sentry/android/replay/o;

    .line 988
    .line 989
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 990
    .line 991
    .line 992
    invoke-static {v2}, Lio/sentry/util/b;->f(Ljava/lang/Object;)Lio/sentry/n0;

    .line 993
    .line 994
    .line 995
    move-result-object v2

    .line 996
    check-cast v1, Lio/sentry/android/replay/capture/i;

    .line 997
    .line 998
    iget-object v3, v0, Lio/sentry/android/replay/ReplayIntegration;->g0:Lio/sentry/i1;

    .line 999
    .line 1000
    if-eqz v3, :cond_24

    .line 1001
    .line 1002
    iget-object v4, v1, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/u6;

    .line 1003
    .line 1004
    iget-object v1, v1, Lio/sentry/android/replay/capture/i;->b:Lio/sentry/f4;

    .line 1005
    .line 1006
    iput-object v1, v2, Lio/sentry/n0;->h:Lio/sentry/f4;

    .line 1007
    .line 1008
    invoke-interface {v3, v4, v2}, Lio/sentry/i1;->r(Lio/sentry/u6;Lio/sentry/n0;)Lio/sentry/protocol/w;

    .line 1009
    .line 1010
    .line 1011
    :cond_24
    invoke-virtual {v0, v6}, Lio/sentry/android/replay/ReplayIntegration;->a0(Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_1d

    .line 1015
    :cond_25
    invoke-static/range {v19 .. v19}, Ldh3;->T(Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    throw v16

    .line 1019
    :cond_26
    invoke-static/range {v19 .. v19}, Ldh3;->T(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    throw v16

    .line 1023
    :goto_1b
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 1024
    :catchall_7
    move-exception v0

    .line 1025
    invoke-static {v10, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1026
    .line 1027
    .line 1028
    throw v0

    .line 1029
    :cond_27
    move-object/from16 v16, v2

    .line 1030
    .line 1031
    move-object/from16 v19, v4

    .line 1032
    .line 1033
    invoke-static/range {v19 .. v19}, Ldh3;->T(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    throw v16

    .line 1037
    :cond_28
    move-object/from16 v16, v2

    .line 1038
    .line 1039
    move-object/from16 v19, v4

    .line 1040
    .line 1041
    invoke-static/range {v19 .. v19}, Ldh3;->T(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    throw v16

    .line 1045
    :cond_29
    :goto_1c
    invoke-virtual {v0, v5}, Lio/sentry/android/replay/ReplayIntegration;->a0(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    :goto_1d
    return-void

    .line 1049
    :cond_2a
    move-object/from16 v16, v2

    .line 1050
    .line 1051
    move-object/from16 v19, v4

    .line 1052
    .line 1053
    invoke-static/range {v19 .. v19}, Ldh3;->T(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    throw v16

    .line 1057
    :pswitch_3
    check-cast v0, Lio/sentry/f7;

    .line 1058
    .line 1059
    iget-object v1, v0, Lio/sentry/f7;->X:Lio/sentry/protocol/w;

    .line 1060
    .line 1061
    invoke-virtual {v1}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    iget-object v0, v0, Lio/sentry/f7;->Y:Lio/sentry/h7;

    .line 1066
    .line 1067
    invoke-virtual {v0}, Lio/sentry/h7;->a()Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-static {v1, v0}, Lio/sentry/ndk/NativeScope;->nativeSetTrace(Ljava/lang/String;Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    return-void

    .line 1075
    :pswitch_4
    check-cast v0, Lio/sentry/internal/modules/f;

    .line 1076
    .line 1077
    invoke-virtual {v0}, Lio/sentry/internal/modules/d;->a()Ljava/util/Map;

    .line 1078
    .line 1079
    .line 1080
    return-void

    .line 1081
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

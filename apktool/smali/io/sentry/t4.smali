.class public final synthetic Lio/sentry/t4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lio/sentry/t4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/t4;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-byte v0, p0, Lio/sentry/t4;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/t4;->Y:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/s6;->getFlushTimeoutMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0, v0, v1}, Lio/sentry/i1;->f(J)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/s6;->getOptionsObservers()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lio/sentry/c1;

    .line 39
    .line 40
    invoke-virtual {p0}, Lio/sentry/s6;->getRelease()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v1, v2}, Lio/sentry/c1;->g(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lio/sentry/s6;->getProguardUuid()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v1, v2}, Lio/sentry/c1;->f(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lio/sentry/s6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v1, v2}, Lio/sentry/c1;->b(Lio/sentry/protocol/u;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lio/sentry/s6;->getDist()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v1, v2}, Lio/sentry/c1;->c(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lio/sentry/s6;->getEnvironment()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v1, v2}, Lio/sentry/c1;->e(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lio/sentry/s6;->getTags()Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v1, v2}, Lio/sentry/c1;->a(Ljava/util/Map;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v2, v2, Lio/sentry/w6;->e:Ljava/lang/Double;

    .line 87
    .line 88
    invoke-interface {v1, v2}, Lio/sentry/c1;->d(Ljava/lang/Double;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p0}, Lio/sentry/s6;->findPersistingScopeObserver()Lio/sentry/cache/g;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-eqz p0, :cond_1

    .line 97
    .line 98
    :try_start_0
    iget-object v0, p0, Lio/sentry/cache/g;->b:Lio/sentry/util/g;

    .line 99
    .line 100
    invoke-virtual {v0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lio/sentry/cache/tape/g;

    .line 105
    .line 106
    invoke-virtual {v0}, Lio/sentry/cache/tape/g;->clear()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lio/sentry/cache/tape/g;->Y()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catch_0
    move-exception v0

    .line 114
    iget-object v1, p0, Lio/sentry/cache/g;->a:Lio/sentry/s6;

    .line 115
    .line 116
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 121
    .line 122
    const-string v3, "Failed to clear breadcrumbs from file queue"

    .line 123
    .line 124
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :goto_1
    const-string v0, "user.json"

    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v0, "level.json"

    .line 133
    .line 134
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v0, "request.json"

    .line 138
    .line 139
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v0, "fingerprint.json"

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string v0, "contexts.json"

    .line 148
    .line 149
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v0, "extras.json"

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v0, "tags.json"

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v0, "trace.json"

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-string v0, "transaction.json"

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v0, "replay.json"

    .line 173
    .line 174
    invoke-virtual {p0, v0}, Lio/sentry/cache/g;->g(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_1
    return-void

    .line 178
    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/s6;->getCacheDirPathWithoutDsn()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_6

    .line 183
    .line 184
    new-instance v1, Ljava/io/File;

    .line 185
    .line 186
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    new-instance v2, Ljava/io/File;

    .line 190
    .line 191
    const-string v3, "app_start_profiling_config"

    .line 192
    .line 193
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :try_start_1
    invoke-static {v2}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lio/sentry/s6;->isEnableAppStartProfiling()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-nez v3, :cond_2

    .line 204
    .line 205
    invoke-virtual {p0}, Lio/sentry/s6;->isStartProfilerOnAppStart()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_2

    .line 210
    .line 211
    goto/16 :goto_7

    .line 212
    .line 213
    :catchall_0
    move-exception v0

    .line 214
    goto/16 :goto_6

    .line 215
    .line 216
    :cond_2
    invoke-virtual {p0}, Lio/sentry/s6;->isStartProfilerOnAppStart()Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-nez v3, :cond_3

    .line 221
    .line 222
    invoke-virtual {p0}, Lio/sentry/s6;->isTracingEnabled()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_3

    .line 227
    .line 228
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    sget-object v1, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 233
    .line 234
    const-string v2, "Tracing is disabled and app start profiling will not start."

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    new-array v3, v3, [Ljava/lang/Object;

    .line 238
    .line 239
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_7

    .line 243
    .line 244
    :cond_3
    invoke-static {v1}, Lio/sentry/util/b;->e(Ljava/io/File;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-nez v1, :cond_4

    .line 249
    .line 250
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 255
    .line 256
    const-string v3, "Failed to create cache dir %s"

    .line 257
    .line 258
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_7

    .line 266
    .line 267
    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_6

    .line 272
    .line 273
    invoke-virtual {p0}, Lio/sentry/s6;->isEnableAppStartProfiling()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    const/4 v1, 0x0

    .line 278
    if-eqz v0, :cond_5

    .line 279
    .line 280
    new-instance v0, Lio/sentry/n7;

    .line 281
    .line 282
    const-string v3, "app.launch"

    .line 283
    .line 284
    const-string v4, "profile"

    .line 285
    .line 286
    sget-object v5, Lio/sentry/protocol/h0;->CUSTOM:Lio/sentry/protocol/h0;

    .line 287
    .line 288
    invoke-direct {v0, v3, v5, v4, v1}, Lio/sentry/n7;-><init>(Ljava/lang/String;Lio/sentry/protocol/h0;Ljava/lang/String;Lio/sentry/b4;)V

    .line 289
    .line 290
    .line 291
    new-instance v1, Lio/sentry/internal/debugmeta/c;

    .line 292
    .line 293
    invoke-static {}, Lio/sentry/util/o;->a()Lio/sentry/util/l;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v3}, Lio/sentry/util/l;->c()D

    .line 298
    .line 299
    .line 300
    move-result-wide v3

    .line 301
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-direct {v1, v0, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/n7;Ljava/lang/Double;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, Lio/sentry/s6;->getInternalTracesSampler()Lio/sentry/m7;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0, v1}, Lio/sentry/m7;->a(Lio/sentry/internal/debugmeta/c;)Lio/sentry/b4;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    goto :goto_2

    .line 317
    :cond_5
    new-instance v0, Lio/sentry/b4;

    .line 318
    .line 319
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-direct {v0, v3, v1}, Lio/sentry/b4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 322
    .line 323
    .line 324
    :goto_2
    new-instance v1, Lio/sentry/w4;

    .line 325
    .line 326
    invoke-direct {v1, p0, v0}, Lio/sentry/w4;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/b4;)V

    .line 327
    .line 328
    .line 329
    new-instance v0, Ljava/io/FileOutputStream;

    .line 330
    .line 331
    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 332
    .line 333
    .line 334
    :try_start_2
    new-instance v2, Ljava/io/BufferedWriter;

    .line 335
    .line 336
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 337
    .line 338
    sget-object v4, Lio/sentry/v4;->e:Ljava/nio/charset/Charset;

    .line 339
    .line 340
    invoke-direct {v3, v0, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 344
    .line 345
    .line 346
    :try_start_3
    invoke-virtual {p0}, Lio/sentry/s6;->getSerializer()Lio/sentry/o1;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-interface {v3, v1, v2}, Lio/sentry/o1;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 351
    .line 352
    .line 353
    :try_start_4
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 354
    .line 355
    .line 356
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :catchall_1
    move-exception v1

    .line 361
    goto :goto_4

    .line 362
    :catchall_2
    move-exception v1

    .line 363
    :try_start_6
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 364
    .line 365
    .line 366
    goto :goto_3

    .line 367
    :catchall_3
    move-exception v2

    .line 368
    :try_start_7
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 369
    .line 370
    .line 371
    :goto_3
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 372
    :goto_4
    :try_start_8
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 373
    .line 374
    .line 375
    goto :goto_5

    .line 376
    :catchall_4
    move-exception v0

    .line 377
    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    :goto_5
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 381
    :goto_6
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 386
    .line 387
    const-string v2, "Unable to create app start profiling config file. "

    .line 388
    .line 389
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    :cond_6
    :goto_7
    return-void

    .line 393
    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/s6;->loadLazyFields()V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

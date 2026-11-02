.class public abstract Lio/sentry/android/core/z0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static a(Landroid/content/Context;Lio/sentry/android/core/n0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 12

    .line 1
    const-string p1, ""

    .line 2
    .line 3
    const-string v0, "io.sentry.traces.trace-propagation-targets"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 6
    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x21

    .line 11
    .line 12
    if-lt v1, v2, :cond_0

    .line 13
    .line 14
    sget-object v1, Lio/sentry/android/core/m0;->d:Lf51;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lf51;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Landroid/content/pm/ApplicationInfo;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v1, Lio/sentry/android/core/m0;->e:Lf51;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lf51;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    :goto_0
    const/4 v1, 0x0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object p0, v1

    .line 38
    :goto_1
    invoke-virtual {p2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz p0, :cond_27

    .line 44
    .line 45
    const-string v4, "io.sentry.debug"

    .line 46
    .line 47
    invoke-virtual {p2}, Lio/sentry/s6;->isDebug()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setDebug(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lio/sentry/s6;->isDebug()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    const-string v4, "io.sentry.debug.level"

    .line 65
    .line 66
    invoke-virtual {p2}, Lio/sentry/s6;->getDiagnosticLevel()Lio/sentry/s5;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v4}, Lio/sentry/s5;->valueOf(Ljava/lang/String;)Lio/sentry/s5;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setDiagnosticLevel(Lio/sentry/s5;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto/16 :goto_e

    .line 100
    .line 101
    :cond_2
    :goto_2
    const-string v4, "io.sentry.anr.enable"

    .line 102
    .line 103
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrEnabled(Z)V

    .line 112
    .line 113
    .line 114
    const-string v4, "io.sentry.tombstone.enable"

    .line 115
    .line 116
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isTombstoneEnabled()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setTombstoneEnabled(Z)V

    .line 125
    .line 126
    .line 127
    const-string v4, "io.sentry.tombstone.attach-raw"

    .line 128
    .line 129
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachRawTombstone()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachRawTombstone(Z)V

    .line 138
    .line 139
    .line 140
    const-string v4, "io.sentry.tombstone.report-historical"

    .line 141
    .line 142
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalTombstones()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setReportHistoricalTombstones(Z)V

    .line 151
    .line 152
    .line 153
    const-string v4, "io.sentry.tombstone.merge-time-threshold-millis"

    .line 154
    .line 155
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getTombstoneMergeTimeThresholdMillis()J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    invoke-static {p0, v2, v4, v5, v6}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v4

    .line 163
    invoke-virtual {p2, v4, v5}, Lio/sentry/android/core/SentryAndroidOptions;->setTombstoneMergeTimeThresholdMillis(J)V

    .line 164
    .line 165
    .line 166
    const-string v4, "io.sentry.memory-limiter.enable"

    .line 167
    .line 168
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isMemoryLimiterEnabled()Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setMemoryLimiterEnabled(Z)V

    .line 177
    .line 178
    .line 179
    const-string v4, "io.sentry.memory-limiter.report-historical"

    .line 180
    .line 181
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalMemoryLimiterExits()Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setReportHistoricalMemoryLimiterExits(Z)V

    .line 190
    .line 191
    .line 192
    const-string v4, "io.sentry.auto-session-tracking.enable"

    .line 193
    .line 194
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableAutoSessionTracking()Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setEnableAutoSessionTracking(Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Lio/sentry/s6;->getSampleRate()Ljava/lang/Double;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 210
    .line 211
    if-nez v4, :cond_3

    .line 212
    .line 213
    const-string v4, "io.sentry.sample-rate"

    .line 214
    .line 215
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 216
    .line 217
    .line 218
    move-result-wide v7

    .line 219
    cmpl-double v4, v7, v5

    .line 220
    .line 221
    if-eqz v4, :cond_3

    .line 222
    .line 223
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setSampleRate(Ljava/lang/Double;)V

    .line 228
    .line 229
    .line 230
    :cond_3
    const-string v4, "io.sentry.anr.report-debug"

    .line 231
    .line 232
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrReportInDebug(Z)V

    .line 241
    .line 242
    .line 243
    const-string v4, "io.sentry.anr.timeout-interval-millis"

    .line 244
    .line 245
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    .line 246
    .line 247
    .line 248
    move-result-wide v7

    .line 249
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 250
    .line 251
    .line 252
    move-result-wide v7

    .line 253
    invoke-virtual {p2, v7, v8}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrTimeoutIntervalMillis(J)V

    .line 254
    .line 255
    .line 256
    const-string v4, "io.sentry.anr.attach-thread-dumps"

    .line 257
    .line 258
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachAnrThreadDump(Z)V

    .line 267
    .line 268
    .line 269
    const-string v4, "io.sentry.anr.report-historical"

    .line 270
    .line 271
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalAnrs()Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setReportHistoricalAnrs(Z)V

    .line 280
    .line 281
    .line 282
    const-string v4, "io.sentry.ndk.app-hang.enable"

    .line 283
    .line 284
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNdkAppHangTracking()Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdkAppHangTracking(Z)V

    .line 293
    .line 294
    .line 295
    const-string v4, "io.sentry.ndk.app-hang.timeout-interval-millis"

    .line 296
    .line 297
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getNdkAppHangTimeoutIntervalMillis()J

    .line 298
    .line 299
    .line 300
    move-result-wide v7

    .line 301
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 302
    .line 303
    .line 304
    move-result-wide v7

    .line 305
    invoke-virtual {p2, v7, v8}, Lio/sentry/android/core/SentryAndroidOptions;->setNdkAppHangTimeoutIntervalMillis(J)V

    .line 306
    .line 307
    .line 308
    const-string v4, "io.sentry.dsn"

    .line 309
    .line 310
    invoke-virtual {p2}, Lio/sentry/s6;->getDsn()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    const-string v7, "io.sentry.enabled"

    .line 319
    .line 320
    invoke-virtual {p2}, Lio/sentry/s6;->isEnabled()Z

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    invoke-static {p0, v2, v7, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    if-eqz v7, :cond_5

    .line 329
    .line 330
    if-eqz v4, :cond_4

    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-eqz v8, :cond_4

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_4
    if-nez v4, :cond_6

    .line 340
    .line 341
    invoke-virtual {p2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    sget-object v9, Lio/sentry/s5;->FATAL:Lio/sentry/s5;

    .line 346
    .line 347
    const-string v10, "DSN is required. Use empty string to disable SDK."

    .line 348
    .line 349
    new-array v11, v3, [Ljava/lang/Object;

    .line 350
    .line 351
    invoke-interface {v8, v9, v10, v11}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_5
    :goto_3
    invoke-virtual {p2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    sget-object v9, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 360
    .line 361
    const-string v10, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android"

    .line 362
    .line 363
    new-array v11, v3, [Ljava/lang/Object;

    .line 364
    .line 365
    invoke-interface {v8, v9, v10, v11}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_6
    :goto_4
    invoke-virtual {p2, v7}, Lio/sentry/s6;->setEnabled(Z)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setDsn(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    const-string v4, "io.sentry.ndk.enable"

    .line 375
    .line 376
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNdk()Z

    .line 377
    .line 378
    .line 379
    move-result v7

    .line 380
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdk(Z)V

    .line 385
    .line 386
    .line 387
    const-string v4, "io.sentry.ndk.scope-sync.enable"

    .line 388
    .line 389
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableScopeSync()Z

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableScopeSync(Z)V

    .line 398
    .line 399
    .line 400
    const-string v4, "io.sentry.ndk.sdk-name"

    .line 401
    .line 402
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getNativeSdkName()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    if-eqz v4, :cond_7

    .line 411
    .line 412
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setNativeSdkName(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    :cond_7
    const-string v4, "io.sentry.release"

    .line 416
    .line 417
    invoke-virtual {p2}, Lio/sentry/s6;->getRelease()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setRelease(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    const-string v4, "io.sentry.dist"

    .line 429
    .line 430
    invoke-virtual {p2}, Lio/sentry/s6;->getDist()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setDist(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    const-string v4, "io.sentry.environment"

    .line 442
    .line 443
    invoke-virtual {p2}, Lio/sentry/s6;->getEnvironment()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setEnvironment(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    const-string v4, "io.sentry.session-tracking.timeout-interval-millis"

    .line 455
    .line 456
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionTrackingIntervalMillis()J

    .line 457
    .line 458
    .line 459
    move-result-wide v7

    .line 460
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 461
    .line 462
    .line 463
    move-result-wide v7

    .line 464
    invoke-virtual {p2, v7, v8}, Lio/sentry/s6;->setSessionTrackingIntervalMillis(J)V

    .line 465
    .line 466
    .line 467
    const-string v4, "io.sentry.max-breadcrumbs"

    .line 468
    .line 469
    invoke-virtual {p2}, Lio/sentry/s6;->getMaxBreadcrumbs()I

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    int-to-long v7, v7

    .line 474
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 475
    .line 476
    .line 477
    move-result-wide v7

    .line 478
    long-to-int v4, v7

    .line 479
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setMaxBreadcrumbs(I)V

    .line 480
    .line 481
    .line 482
    const-string v4, "io.sentry.breadcrumbs.activity-lifecycle"

    .line 483
    .line 484
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleBreadcrumbs(Z)V

    .line 493
    .line 494
    .line 495
    const-string v4, "io.sentry.breadcrumbs.app-lifecycle"

    .line 496
    .line 497
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    .line 498
    .line 499
    .line 500
    move-result v7

    .line 501
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppLifecycleBreadcrumbs(Z)V

    .line 506
    .line 507
    .line 508
    const-string v4, "io.sentry.breadcrumbs.system-events"

    .line 509
    .line 510
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    .line 519
    .line 520
    .line 521
    const-string v4, "io.sentry.breadcrumbs.app-components"

    .line 522
    .line 523
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    .line 524
    .line 525
    .line 526
    move-result v7

    .line 527
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    .line 532
    .line 533
    .line 534
    const-string v4, "io.sentry.breadcrumbs.user-interaction"

    .line 535
    .line 536
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableUserInteractionBreadcrumbs()Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setEnableUserInteractionBreadcrumbs(Z)V

    .line 545
    .line 546
    .line 547
    const-string v4, "io.sentry.breadcrumbs.network-events"

    .line 548
    .line 549
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNetworkEventBreadcrumbs(Z)V

    .line 558
    .line 559
    .line 560
    const-string v4, "io.sentry.uncaught-exception-handler.enable"

    .line 561
    .line 562
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableUncaughtExceptionHandler()Z

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 567
    .line 568
    .line 569
    move-result v4

    .line 570
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setEnableUncaughtExceptionHandler(Z)V

    .line 571
    .line 572
    .line 573
    const-string v4, "io.sentry.attach-threads"

    .line 574
    .line 575
    invoke-virtual {p2}, Lio/sentry/s6;->isAttachThreads()Z

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setAttachThreads(Z)V

    .line 584
    .line 585
    .line 586
    const-string v4, "io.sentry.attach-screenshot"

    .line 587
    .line 588
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 589
    .line 590
    .line 591
    move-result v7

    .line 592
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    .line 597
    .line 598
    .line 599
    const-string v4, "io.sentry.attach-view-hierarchy"

    .line 600
    .line 601
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    .line 602
    .line 603
    .line 604
    move-result v7

    .line 605
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachViewHierarchy(Z)V

    .line 610
    .line 611
    .line 612
    const-string v4, "io.sentry.send-client-reports"

    .line 613
    .line 614
    invoke-virtual {p2}, Lio/sentry/s6;->isSendClientReports()Z

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setSendClientReports(Z)V

    .line 623
    .line 624
    .line 625
    const-string v4, "io.sentry.auto-init"

    .line 626
    .line 627
    const/4 v7, 0x1

    .line 628
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 629
    .line 630
    .line 631
    move-result v4

    .line 632
    if-eqz v4, :cond_8

    .line 633
    .line 634
    sget-object v4, Lio/sentry/w1;->LOW:Lio/sentry/w1;

    .line 635
    .line 636
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setInitPriority(Lio/sentry/w1;)V

    .line 637
    .line 638
    .line 639
    :cond_8
    const-string v4, "io.sentry.force-init"

    .line 640
    .line 641
    invoke-virtual {p2}, Lio/sentry/s6;->isForceInit()Z

    .line 642
    .line 643
    .line 644
    move-result v8

    .line 645
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 646
    .line 647
    .line 648
    move-result v4

    .line 649
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setForceInit(Z)V

    .line 650
    .line 651
    .line 652
    const-string v4, "io.sentry.additional-context"

    .line 653
    .line 654
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    .line 655
    .line 656
    .line 657
    move-result v8

    .line 658
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectAdditionalContext(Z)V

    .line 663
    .line 664
    .line 665
    const-string v4, "io.sentry.external-storage-context"

    .line 666
    .line 667
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectExternalStorageContext()Z

    .line 668
    .line 669
    .line 670
    move-result v8

    .line 671
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectExternalStorageContext(Z)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {p2}, Lio/sentry/s6;->getTracesSampleRate()Ljava/lang/Double;

    .line 679
    .line 680
    .line 681
    move-result-object v4

    .line 682
    if-nez v4, :cond_9

    .line 683
    .line 684
    const-string v4, "io.sentry.traces.sample-rate"

    .line 685
    .line 686
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 687
    .line 688
    .line 689
    move-result-wide v8

    .line 690
    cmpl-double v4, v8, v5

    .line 691
    .line 692
    if-eqz v4, :cond_9

    .line 693
    .line 694
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setTracesSampleRate(Ljava/lang/Double;)V

    .line 699
    .line 700
    .line 701
    :cond_9
    const-string v4, "io.sentry.traces.trace-sampling"

    .line 702
    .line 703
    invoke-virtual {p2}, Lio/sentry/s6;->isTraceSampling()Z

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 708
    .line 709
    .line 710
    move-result v4

    .line 711
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setTraceSampling(Z)V

    .line 712
    .line 713
    .line 714
    const-string v4, "io.sentry.traces.activity.enable"

    .line 715
    .line 716
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    .line 717
    .line 718
    .line 719
    move-result v8

    .line 720
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 721
    .line 722
    .line 723
    move-result v4

    .line 724
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoActivityLifecycleTracing(Z)V

    .line 725
    .line 726
    .line 727
    const-string v4, "io.sentry.traces.activity.auto-finish.enable"

    .line 728
    .line 729
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleTracingAutoFinish(Z)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {p2}, Lio/sentry/s6;->getProfilesSampleRate()Ljava/lang/Double;

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    if-nez v4, :cond_a

    .line 745
    .line 746
    const-string v4, "io.sentry.traces.profiling.sample-rate"

    .line 747
    .line 748
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 749
    .line 750
    .line 751
    move-result-wide v8

    .line 752
    cmpl-double v4, v8, v5

    .line 753
    .line 754
    if-eqz v4, :cond_a

    .line 755
    .line 756
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setProfilesSampleRate(Ljava/lang/Double;)V

    .line 761
    .line 762
    .line 763
    :cond_a
    invoke-virtual {p2}, Lio/sentry/s6;->getProfileSessionSampleRate()Ljava/lang/Double;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    if-nez v4, :cond_b

    .line 768
    .line 769
    const-string v4, "io.sentry.traces.profiling.session-sample-rate"

    .line 770
    .line 771
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 772
    .line 773
    .line 774
    move-result-wide v8

    .line 775
    cmpl-double v4, v8, v5

    .line 776
    .line 777
    if-eqz v4, :cond_b

    .line 778
    .line 779
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    .line 784
    .line 785
    .line 786
    :cond_b
    const-string v4, "io.sentry.traces.profiling.lifecycle"

    .line 787
    .line 788
    invoke-virtual {p2}, Lio/sentry/s6;->getProfileLifecycle()Lio/sentry/y3;

    .line 789
    .line 790
    .line 791
    move-result-object v8

    .line 792
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v8

    .line 796
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 797
    .line 798
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v8

    .line 802
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    if-eqz v4, :cond_c

    .line 807
    .line 808
    invoke-virtual {v4, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    invoke-static {v4}, Lio/sentry/y3;->valueOf(Ljava/lang/String;)Lio/sentry/y3;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setProfileLifecycle(Lio/sentry/y3;)V

    .line 817
    .line 818
    .line 819
    :cond_c
    const-string v4, "io.sentry.traces.profiling.start-on-app-start"

    .line 820
    .line 821
    invoke-virtual {p2}, Lio/sentry/s6;->isStartProfilerOnAppStart()Z

    .line 822
    .line 823
    .line 824
    move-result v8

    .line 825
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 826
    .line 827
    .line 828
    move-result v4

    .line 829
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setStartProfilerOnAppStart(Z)V

    .line 830
    .line 831
    .line 832
    const-string v4, "io.sentry.traces.user-interaction.enable"

    .line 833
    .line 834
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableUserInteractionTracing()Z

    .line 835
    .line 836
    .line 837
    move-result v8

    .line 838
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 839
    .line 840
    .line 841
    move-result v4

    .line 842
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setEnableUserInteractionTracing(Z)V

    .line 843
    .line 844
    .line 845
    const-string v4, "io.sentry.traces.time-to-full-display.enable"

    .line 846
    .line 847
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableTimeToFullDisplayTracing()Z

    .line 848
    .line 849
    .line 850
    move-result v8

    .line 851
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setEnableTimeToFullDisplayTracing(Z)V

    .line 856
    .line 857
    .line 858
    const-string v4, "io.sentry.traces.idle-timeout"

    .line 859
    .line 860
    const-wide/16 v8, -0x1

    .line 861
    .line 862
    invoke-static {p0, v2, v4, v8, v9}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 863
    .line 864
    .line 865
    move-result-wide v10

    .line 866
    cmp-long v4, v10, v8

    .line 867
    .line 868
    if-eqz v4, :cond_d

    .line 869
    .line 870
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setIdleTimeout(Ljava/lang/Long;)V

    .line 875
    .line 876
    .line 877
    :cond_d
    invoke-static {p0, v2, v0}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    invoke-static {v0, p0}, Lio/sentry/android/core/z0;->b(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    if-eqz v0, :cond_e

    .line 886
    .line 887
    if-nez v4, :cond_e

    .line 888
    .line 889
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 890
    .line 891
    invoke-virtual {p2, v0}, Lio/sentry/s6;->setTracePropagationTargets(Ljava/util/List;)V

    .line 892
    .line 893
    .line 894
    goto :goto_5

    .line 895
    :cond_e
    if-eqz v4, :cond_f

    .line 896
    .line 897
    invoke-virtual {p2, v4}, Lio/sentry/s6;->setTracePropagationTargets(Ljava/util/List;)V

    .line 898
    .line 899
    .line 900
    :cond_f
    :goto_5
    const-string v0, "io.sentry.traces.frames-tracking"

    .line 901
    .line 902
    invoke-static {p0, v2, v0, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    invoke-virtual {p2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableFramesTracking(Z)V

    .line 907
    .line 908
    .line 909
    const-string v0, "io.sentry.proguard-uuid"

    .line 910
    .line 911
    invoke-virtual {p2}, Lio/sentry/s6;->getProguardUuid()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-virtual {p2, v0}, Lio/sentry/s6;->setProguardUuid(Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {p2}, Lio/sentry/s6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    if-nez v0, :cond_10

    .line 927
    .line 928
    new-instance v0, Lio/sentry/protocol/u;

    .line 929
    .line 930
    invoke-direct {v0, p1, p1}, Lio/sentry/protocol/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    :cond_10
    const-string p1, "io.sentry.sdk.name"

    .line 934
    .line 935
    iget-object v4, v0, Lio/sentry/protocol/u;->X:Ljava/lang/String;

    .line 936
    .line 937
    invoke-static {p0, v2, p1, v4}, Lio/sentry/android/core/z0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object p1

    .line 941
    const-string v4, "name is required."

    .line 942
    .line 943
    invoke-static {p1, v4}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    iput-object p1, v0, Lio/sentry/protocol/u;->X:Ljava/lang/String;

    .line 947
    .line 948
    const-string p1, "io.sentry.sdk.version"

    .line 949
    .line 950
    iget-object v4, v0, Lio/sentry/protocol/u;->Y:Ljava/lang/String;

    .line 951
    .line 952
    invoke-static {p0, v2, p1, v4}, Lio/sentry/android/core/z0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object p1

    .line 956
    const-string v4, "version is required."

    .line 957
    .line 958
    invoke-static {p1, v4}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    iput-object p1, v0, Lio/sentry/protocol/u;->Y:Ljava/lang/String;

    .line 962
    .line 963
    invoke-virtual {p2, v0}, Lio/sentry/s6;->setSdkVersion(Lio/sentry/protocol/u;)V

    .line 964
    .line 965
    .line 966
    const-string p1, "io.sentry.send-default-pii"

    .line 967
    .line 968
    invoke-virtual {p2}, Lio/sentry/s6;->isSendDefaultPii()Z

    .line 969
    .line 970
    .line 971
    move-result v0

    .line 972
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 973
    .line 974
    .line 975
    move-result p1

    .line 976
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setSendDefaultPii(Z)V

    .line 977
    .line 978
    .line 979
    const-string p1, "io.sentry.gradle-plugin-integrations"

    .line 980
    .line 981
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 982
    .line 983
    .line 984
    move-result-object p1

    .line 985
    if-eqz p1, :cond_11

    .line 986
    .line 987
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 988
    .line 989
    .line 990
    move-result-object p1

    .line 991
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    if-eqz v0, :cond_11

    .line 996
    .line 997
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    check-cast v0, Ljava/lang/String;

    .line 1002
    .line 1003
    invoke-static {}, Lio/sentry/q5;->d()Lio/sentry/q5;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    invoke-virtual {v4, v0}, Lio/sentry/q5;->a(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    goto :goto_6

    .line 1011
    :cond_11
    const-string p1, "io.sentry.enable-root-check"

    .line 1012
    .line 1013
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1018
    .line 1019
    .line 1020
    move-result p1

    .line 1021
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableRootCheck(Z)V

    .line 1022
    .line 1023
    .line 1024
    const-string p1, "io.sentry.send-modules"

    .line 1025
    .line 1026
    invoke-virtual {p2}, Lio/sentry/s6;->isSendModules()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v0

    .line 1030
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1031
    .line 1032
    .line 1033
    move-result p1

    .line 1034
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setSendModules(Z)V

    .line 1035
    .line 1036
    .line 1037
    const-string p1, "io.sentry.performance-v2.enable"

    .line 1038
    .line 1039
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1044
    .line 1045
    .line 1046
    move-result p1

    .line 1047
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnablePerformanceV2(Z)V

    .line 1048
    .line 1049
    .line 1050
    const-string p1, "io.sentry.standalone-app-start-tracing.enable"

    .line 1051
    .line 1052
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableStandaloneAppStartTracing()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v0

    .line 1056
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1057
    .line 1058
    .line 1059
    move-result p1

    .line 1060
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableStandaloneAppStartTracing(Z)V

    .line 1061
    .line 1062
    .line 1063
    const-string p1, "io.sentry.profiling.enable-app-start"

    .line 1064
    .line 1065
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableAppStartProfiling()Z

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1070
    .line 1071
    .line 1072
    move-result p1

    .line 1073
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setEnableAppStartProfiling(Z)V

    .line 1074
    .line 1075
    .line 1076
    const-string p1, "io.sentry.profiling.enable-legacy-profiling"

    .line 1077
    .line 1078
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableLegacyProfiling()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v0

    .line 1082
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1083
    .line 1084
    .line 1085
    move-result p1

    .line 1086
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setEnableLegacyProfiling(Z)V

    .line 1087
    .line 1088
    .line 1089
    const-string p1, "io.sentry.enable-scope-persistence"

    .line 1090
    .line 1091
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableScopePersistence()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v0

    .line 1095
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1096
    .line 1097
    .line 1098
    move-result p1

    .line 1099
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setEnableScopePersistence(Z)V

    .line 1100
    .line 1101
    .line 1102
    const-string p1, "io.sentry.traces.enable-auto-id-generation"

    .line 1103
    .line 1104
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v0

    .line 1108
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1109
    .line 1110
    .line 1111
    move-result p1

    .line 1112
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoTraceIdGeneration(Z)V

    .line 1113
    .line 1114
    .line 1115
    const-string p1, "io.sentry.traces.deadline-timeout"

    .line 1116
    .line 1117
    invoke-virtual {p2}, Lio/sentry/s6;->getDeadlineTimeout()J

    .line 1118
    .line 1119
    .line 1120
    move-result-wide v8

    .line 1121
    invoke-static {p0, v2, p1, v8, v9}, Lio/sentry/android/core/z0;->i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 1122
    .line 1123
    .line 1124
    move-result-wide v8

    .line 1125
    invoke-virtual {p2, v8, v9}, Lio/sentry/s6;->setDeadlineTimeout(J)V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1129
    .line 1130
    .line 1131
    move-result-object p1

    .line 1132
    iget-object p1, p1, Lio/sentry/w6;->d:Ljava/lang/Double;

    .line 1133
    .line 1134
    if-nez p1, :cond_12

    .line 1135
    .line 1136
    const-string p1, "io.sentry.session-replay.session-sample-rate"

    .line 1137
    .line 1138
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 1139
    .line 1140
    .line 1141
    move-result-wide v8

    .line 1142
    cmpl-double p1, v8, v5

    .line 1143
    .line 1144
    if-eqz p1, :cond_12

    .line 1145
    .line 1146
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1147
    .line 1148
    .line 1149
    move-result-object p1

    .line 1150
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    invoke-virtual {p1, v0}, Lio/sentry/w6;->D(Ljava/lang/Double;)V

    .line 1155
    .line 1156
    .line 1157
    :cond_12
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1158
    .line 1159
    .line 1160
    move-result-object p1

    .line 1161
    iget-object p1, p1, Lio/sentry/w6;->e:Ljava/lang/Double;

    .line 1162
    .line 1163
    if-nez p1, :cond_13

    .line 1164
    .line 1165
    const-string p1, "io.sentry.session-replay.on-error-sample-rate"

    .line 1166
    .line 1167
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 1168
    .line 1169
    .line 1170
    move-result-wide v8

    .line 1171
    cmpl-double p1, v8, v5

    .line 1172
    .line 1173
    if-eqz p1, :cond_13

    .line 1174
    .line 1175
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1176
    .line 1177
    .line 1178
    move-result-object p1

    .line 1179
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-virtual {p1, v0}, Lio/sentry/w6;->C(Ljava/lang/Double;)V

    .line 1184
    .line 1185
    .line 1186
    :cond_13
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1187
    .line 1188
    .line 1189
    move-result-object p1

    .line 1190
    const-string v0, "io.sentry.session-replay.mask-all-text"

    .line 1191
    .line 1192
    invoke-static {p0, v2, v0, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v0

    .line 1196
    invoke-virtual {p1, v0}, Lio/sentry/w6;->t(Z)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1200
    .line 1201
    .line 1202
    move-result-object p1

    .line 1203
    const-string v0, "io.sentry.session-replay.mask-all-images"

    .line 1204
    .line 1205
    invoke-static {p0, v2, v0, v7}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v0

    .line 1209
    invoke-virtual {p1, v0}, Lio/sentry/w6;->s(Z)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1213
    .line 1214
    .line 1215
    move-result-object p1

    .line 1216
    const-string v0, "io.sentry.session-replay.debug"

    .line 1217
    .line 1218
    invoke-static {p0, v2, v0, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v0

    .line 1222
    iput-boolean v0, p1, Lio/sentry/w6;->m:Z

    .line 1223
    .line 1224
    const-string p1, "io.sentry.session-replay.screenshot-strategy"

    .line 1225
    .line 1226
    invoke-static {p0, v2, p1, v1}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object p1

    .line 1230
    if-eqz p1, :cond_15

    .line 1231
    .line 1232
    const-string v0, "canvas"

    .line 1233
    .line 1234
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1235
    .line 1236
    invoke-virtual {p1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object p1

    .line 1240
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result p1

    .line 1244
    if-eqz p1, :cond_14

    .line 1245
    .line 1246
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p1

    .line 1250
    sget-object v0, Lio/sentry/q4;->CANVAS:Lio/sentry/q4;

    .line 1251
    .line 1252
    iput-object v0, p1, Lio/sentry/w6;->n:Lio/sentry/q4;

    .line 1253
    .line 1254
    goto :goto_7

    .line 1255
    :cond_14
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1256
    .line 1257
    .line 1258
    move-result-object p1

    .line 1259
    sget-object v0, Lio/sentry/q4;->PIXEL_COPY:Lio/sentry/q4;

    .line 1260
    .line 1261
    iput-object v0, p1, Lio/sentry/w6;->n:Lio/sentry/q4;

    .line 1262
    .line 1263
    :cond_15
    :goto_7
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1264
    .line 1265
    .line 1266
    move-result-object p1

    .line 1267
    const-string v0, "io.sentry.session-replay.capture-surface-views"

    .line 1268
    .line 1269
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v4

    .line 1273
    iget-boolean v4, v4, Lio/sentry/w6;->o:Z

    .line 1274
    .line 1275
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1276
    .line 1277
    .line 1278
    move-result v0

    .line 1279
    iput-boolean v0, p1, Lio/sentry/w6;->o:Z

    .line 1280
    .line 1281
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1282
    .line 1283
    .line 1284
    move-result-object p1

    .line 1285
    iget-object p1, p1, Lio/sentry/w6;->p:Ljava/util/List;

    .line 1286
    .line 1287
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1288
    .line 1289
    .line 1290
    move-result p1

    .line 1291
    if-eqz p1, :cond_18

    .line 1292
    .line 1293
    const-string p1, "io.sentry.session-replay.network-detail-allow-urls"

    .line 1294
    .line 1295
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1296
    .line 1297
    .line 1298
    move-result-object p1

    .line 1299
    if-eqz p1, :cond_18

    .line 1300
    .line 1301
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1302
    .line 1303
    .line 1304
    move-result v0

    .line 1305
    if-nez v0, :cond_18

    .line 1306
    .line 1307
    new-instance v0, Ljava/util/ArrayList;

    .line 1308
    .line 1309
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1310
    .line 1311
    .line 1312
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1313
    .line 1314
    .line 1315
    move-result-object p1

    .line 1316
    :cond_16
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1317
    .line 1318
    .line 1319
    move-result v4

    .line 1320
    if-eqz v4, :cond_17

    .line 1321
    .line 1322
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v4

    .line 1326
    check-cast v4, Ljava/lang/String;

    .line 1327
    .line 1328
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1333
    .line 1334
    .line 1335
    move-result v7

    .line 1336
    if-nez v7, :cond_16

    .line 1337
    .line 1338
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1339
    .line 1340
    .line 1341
    goto :goto_8

    .line 1342
    :cond_17
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1343
    .line 1344
    .line 1345
    move-result p1

    .line 1346
    if-nez p1, :cond_18

    .line 1347
    .line 1348
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1349
    .line 1350
    .line 1351
    move-result-object p1

    .line 1352
    invoke-virtual {p1, v0}, Lio/sentry/w6;->y(Ljava/util/ArrayList;)V

    .line 1353
    .line 1354
    .line 1355
    :cond_18
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1356
    .line 1357
    .line 1358
    move-result-object p1

    .line 1359
    iget-object p1, p1, Lio/sentry/w6;->q:Ljava/util/List;

    .line 1360
    .line 1361
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1362
    .line 1363
    .line 1364
    move-result p1

    .line 1365
    if-eqz p1, :cond_1b

    .line 1366
    .line 1367
    const-string p1, "io.sentry.session-replay.network-detail-deny-urls"

    .line 1368
    .line 1369
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1370
    .line 1371
    .line 1372
    move-result-object p1

    .line 1373
    if-eqz p1, :cond_1b

    .line 1374
    .line 1375
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v0

    .line 1379
    if-nez v0, :cond_1b

    .line 1380
    .line 1381
    new-instance v0, Ljava/util/ArrayList;

    .line 1382
    .line 1383
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1384
    .line 1385
    .line 1386
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1387
    .line 1388
    .line 1389
    move-result-object p1

    .line 1390
    :cond_19
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1391
    .line 1392
    .line 1393
    move-result v4

    .line 1394
    if-eqz v4, :cond_1a

    .line 1395
    .line 1396
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v4

    .line 1400
    check-cast v4, Ljava/lang/String;

    .line 1401
    .line 1402
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v4

    .line 1406
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1407
    .line 1408
    .line 1409
    move-result v7

    .line 1410
    if-nez v7, :cond_19

    .line 1411
    .line 1412
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1413
    .line 1414
    .line 1415
    goto :goto_9

    .line 1416
    :cond_1a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1417
    .line 1418
    .line 1419
    move-result p1

    .line 1420
    if-nez p1, :cond_1b

    .line 1421
    .line 1422
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1423
    .line 1424
    .line 1425
    move-result-object p1

    .line 1426
    invoke-virtual {p1, v0}, Lio/sentry/w6;->z(Ljava/util/ArrayList;)V

    .line 1427
    .line 1428
    .line 1429
    :cond_1b
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1430
    .line 1431
    .line 1432
    move-result-object p1

    .line 1433
    const-string v0, "io.sentry.session-replay.network-capture-bodies"

    .line 1434
    .line 1435
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v4

    .line 1439
    iget-boolean v4, v4, Lio/sentry/w6;->r:Z

    .line 1440
    .line 1441
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    iput-boolean v0, p1, Lio/sentry/w6;->r:Z

    .line 1446
    .line 1447
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1448
    .line 1449
    .line 1450
    move-result-object p1

    .line 1451
    iget-object p1, p1, Lio/sentry/w6;->s:Ljava/util/List;

    .line 1452
    .line 1453
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1454
    .line 1455
    .line 1456
    move-result p1

    .line 1457
    sget-object v0, Lio/sentry/w6;->u:Ljava/util/List;

    .line 1458
    .line 1459
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1460
    .line 1461
    .line 1462
    move-result v0

    .line 1463
    if-ne p1, v0, :cond_1e

    .line 1464
    .line 1465
    const-string p1, "io.sentry.session-replay.network-request-headers"

    .line 1466
    .line 1467
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1468
    .line 1469
    .line 1470
    move-result-object p1

    .line 1471
    if-eqz p1, :cond_1e

    .line 1472
    .line 1473
    new-instance v0, Ljava/util/ArrayList;

    .line 1474
    .line 1475
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1476
    .line 1477
    .line 1478
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1479
    .line 1480
    .line 1481
    move-result-object p1

    .line 1482
    :cond_1c
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v4

    .line 1486
    if-eqz v4, :cond_1d

    .line 1487
    .line 1488
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v4

    .line 1492
    check-cast v4, Ljava/lang/String;

    .line 1493
    .line 1494
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v4

    .line 1498
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1499
    .line 1500
    .line 1501
    move-result v7

    .line 1502
    if-nez v7, :cond_1c

    .line 1503
    .line 1504
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1505
    .line 1506
    .line 1507
    goto :goto_a

    .line 1508
    :cond_1d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1509
    .line 1510
    .line 1511
    move-result p1

    .line 1512
    if-nez p1, :cond_1e

    .line 1513
    .line 1514
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1515
    .line 1516
    .line 1517
    move-result-object p1

    .line 1518
    invoke-virtual {p1, v0}, Lio/sentry/w6;->A(Ljava/util/ArrayList;)V

    .line 1519
    .line 1520
    .line 1521
    :cond_1e
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1522
    .line 1523
    .line 1524
    move-result-object p1

    .line 1525
    iget-object p1, p1, Lio/sentry/w6;->t:Ljava/util/List;

    .line 1526
    .line 1527
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1528
    .line 1529
    .line 1530
    move-result p1

    .line 1531
    sget-object v0, Lio/sentry/w6;->u:Ljava/util/List;

    .line 1532
    .line 1533
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1534
    .line 1535
    .line 1536
    move-result v0

    .line 1537
    if-ne p1, v0, :cond_21

    .line 1538
    .line 1539
    const-string p1, "io.sentry.session-replay.network-response-headers"

    .line 1540
    .line 1541
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1542
    .line 1543
    .line 1544
    move-result-object p1

    .line 1545
    if-eqz p1, :cond_21

    .line 1546
    .line 1547
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1548
    .line 1549
    .line 1550
    move-result v0

    .line 1551
    if-nez v0, :cond_21

    .line 1552
    .line 1553
    new-instance v0, Ljava/util/ArrayList;

    .line 1554
    .line 1555
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1556
    .line 1557
    .line 1558
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1559
    .line 1560
    .line 1561
    move-result-object p1

    .line 1562
    :cond_1f
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1563
    .line 1564
    .line 1565
    move-result v4

    .line 1566
    if-eqz v4, :cond_20

    .line 1567
    .line 1568
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v4

    .line 1572
    check-cast v4, Ljava/lang/String;

    .line 1573
    .line 1574
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v4

    .line 1578
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1579
    .line 1580
    .line 1581
    move-result v7

    .line 1582
    if-nez v7, :cond_1f

    .line 1583
    .line 1584
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1585
    .line 1586
    .line 1587
    goto :goto_b

    .line 1588
    :cond_20
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1589
    .line 1590
    .line 1591
    move-result p1

    .line 1592
    if-nez p1, :cond_21

    .line 1593
    .line 1594
    invoke-virtual {p2}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 1595
    .line 1596
    .line 1597
    move-result-object p1

    .line 1598
    invoke-virtual {p1, v0}, Lio/sentry/w6;->B(Ljava/util/ArrayList;)V

    .line 1599
    .line 1600
    .line 1601
    :cond_21
    const-string p1, "io.sentry.ignored-errors"

    .line 1602
    .line 1603
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1604
    .line 1605
    .line 1606
    move-result-object p1

    .line 1607
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setIgnoredErrors(Ljava/util/List;)V

    .line 1608
    .line 1609
    .line 1610
    const-string p1, "io.sentry.in-app-includes"

    .line 1611
    .line 1612
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1613
    .line 1614
    .line 1615
    move-result-object p1

    .line 1616
    if-eqz p1, :cond_22

    .line 1617
    .line 1618
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1619
    .line 1620
    .line 1621
    move-result v0

    .line 1622
    if-nez v0, :cond_22

    .line 1623
    .line 1624
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1625
    .line 1626
    .line 1627
    move-result-object p1

    .line 1628
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1629
    .line 1630
    .line 1631
    move-result v0

    .line 1632
    if-eqz v0, :cond_22

    .line 1633
    .line 1634
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    check-cast v0, Ljava/lang/String;

    .line 1639
    .line 1640
    invoke-virtual {p2, v0}, Lio/sentry/s6;->addInAppInclude(Ljava/lang/String;)V

    .line 1641
    .line 1642
    .line 1643
    goto :goto_c

    .line 1644
    :cond_22
    const-string p1, "io.sentry.in-app-excludes"

    .line 1645
    .line 1646
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1647
    .line 1648
    .line 1649
    move-result-object p1

    .line 1650
    if-eqz p1, :cond_23

    .line 1651
    .line 1652
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1653
    .line 1654
    .line 1655
    move-result v0

    .line 1656
    if-nez v0, :cond_23

    .line 1657
    .line 1658
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1659
    .line 1660
    .line 1661
    move-result-object p1

    .line 1662
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1663
    .line 1664
    .line 1665
    move-result v0

    .line 1666
    if-eqz v0, :cond_23

    .line 1667
    .line 1668
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    check-cast v0, Ljava/lang/String;

    .line 1673
    .line 1674
    invoke-virtual {p2, v0}, Lio/sentry/s6;->addInAppExclude(Ljava/lang/String;)V

    .line 1675
    .line 1676
    .line 1677
    goto :goto_d

    .line 1678
    :cond_23
    invoke-virtual {p2}, Lio/sentry/s6;->getLogs()Lio/sentry/k6;

    .line 1679
    .line 1680
    .line 1681
    move-result-object p1

    .line 1682
    const-string v0, "io.sentry.logs.enabled"

    .line 1683
    .line 1684
    invoke-virtual {p2}, Lio/sentry/s6;->getLogs()Lio/sentry/k6;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v4

    .line 1688
    iget-boolean v4, v4, Lio/sentry/k6;->a:Z

    .line 1689
    .line 1690
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    iput-boolean v0, p1, Lio/sentry/k6;->a:Z

    .line 1695
    .line 1696
    invoke-virtual {p2}, Lio/sentry/s6;->getMetrics()Lio/sentry/l6;

    .line 1697
    .line 1698
    .line 1699
    move-result-object p1

    .line 1700
    const-string v0, "io.sentry.metrics.enabled"

    .line 1701
    .line 1702
    invoke-virtual {p2}, Lio/sentry/s6;->getMetrics()Lio/sentry/l6;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v4

    .line 1706
    iget-boolean v4, v4, Lio/sentry/l6;->a:Z

    .line 1707
    .line 1708
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v0

    .line 1712
    iput-boolean v0, p1, Lio/sentry/l6;->a:Z

    .line 1713
    .line 1714
    invoke-virtual {p2}, Lio/sentry/s6;->getFeedbackOptions()Lio/sentry/n5;

    .line 1715
    .line 1716
    .line 1717
    move-result-object p1

    .line 1718
    const-string v0, "io.sentry.feedback.is-name-required"

    .line 1719
    .line 1720
    iget-boolean v4, p1, Lio/sentry/n5;->a:Z

    .line 1721
    .line 1722
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v0

    .line 1726
    iput-boolean v0, p1, Lio/sentry/n5;->a:Z

    .line 1727
    .line 1728
    const-string v0, "io.sentry.feedback.show-name"

    .line 1729
    .line 1730
    iget-boolean v4, p1, Lio/sentry/n5;->b:Z

    .line 1731
    .line 1732
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1733
    .line 1734
    .line 1735
    move-result v0

    .line 1736
    iput-boolean v0, p1, Lio/sentry/n5;->b:Z

    .line 1737
    .line 1738
    const-string v0, "io.sentry.feedback.is-email-required"

    .line 1739
    .line 1740
    iget-boolean v4, p1, Lio/sentry/n5;->c:Z

    .line 1741
    .line 1742
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1743
    .line 1744
    .line 1745
    move-result v0

    .line 1746
    iput-boolean v0, p1, Lio/sentry/n5;->c:Z

    .line 1747
    .line 1748
    const-string v0, "io.sentry.feedback.show-email"

    .line 1749
    .line 1750
    iget-boolean v4, p1, Lio/sentry/n5;->d:Z

    .line 1751
    .line 1752
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1753
    .line 1754
    .line 1755
    move-result v0

    .line 1756
    iput-boolean v0, p1, Lio/sentry/n5;->d:Z

    .line 1757
    .line 1758
    const-string v0, "io.sentry.feedback.use-sentry-user"

    .line 1759
    .line 1760
    iget-boolean v4, p1, Lio/sentry/n5;->e:Z

    .line 1761
    .line 1762
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    iput-boolean v0, p1, Lio/sentry/n5;->e:Z

    .line 1767
    .line 1768
    const-string v0, "io.sentry.feedback.show-branding"

    .line 1769
    .line 1770
    iget-boolean v4, p1, Lio/sentry/n5;->f:Z

    .line 1771
    .line 1772
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1773
    .line 1774
    .line 1775
    move-result v0

    .line 1776
    iput-boolean v0, p1, Lio/sentry/n5;->f:Z

    .line 1777
    .line 1778
    const-string v0, "io.sentry.feedback.use-shake-gesture"

    .line 1779
    .line 1780
    iget-boolean v4, p1, Lio/sentry/n5;->g:Z

    .line 1781
    .line 1782
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1783
    .line 1784
    .line 1785
    move-result v0

    .line 1786
    iput-boolean v0, p1, Lio/sentry/n5;->g:Z

    .line 1787
    .line 1788
    const-string v0, "io.sentry.feedback.enable-attach-screenshot"

    .line 1789
    .line 1790
    iget-boolean v4, p1, Lio/sentry/n5;->h:Z

    .line 1791
    .line 1792
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1793
    .line 1794
    .line 1795
    move-result v0

    .line 1796
    iput-boolean v0, p1, Lio/sentry/n5;->h:Z

    .line 1797
    .line 1798
    const-string p1, "io.sentry.strict-trace-continuation.enabled"

    .line 1799
    .line 1800
    invoke-virtual {p2}, Lio/sentry/s6;->isStrictTraceContinuation()Z

    .line 1801
    .line 1802
    .line 1803
    move-result v0

    .line 1804
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1805
    .line 1806
    .line 1807
    move-result p1

    .line 1808
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setStrictTraceContinuation(Z)V

    .line 1809
    .line 1810
    .line 1811
    const-string p1, "io.sentry.org-id"

    .line 1812
    .line 1813
    invoke-static {p0, v2, p1, v1}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1814
    .line 1815
    .line 1816
    move-result-object p1

    .line 1817
    if-eqz p1, :cond_24

    .line 1818
    .line 1819
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setOrgId(Ljava/lang/String;)V

    .line 1820
    .line 1821
    .line 1822
    :cond_24
    const-string p1, "io.sentry.spotlight.enable"

    .line 1823
    .line 1824
    invoke-virtual {p2}, Lio/sentry/s6;->isEnableSpotlight()Z

    .line 1825
    .line 1826
    .line 1827
    move-result v0

    .line 1828
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1829
    .line 1830
    .line 1831
    move-result p1

    .line 1832
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setEnableSpotlight(Z)V

    .line 1833
    .line 1834
    .line 1835
    const-string p1, "io.sentry.spotlight.url"

    .line 1836
    .line 1837
    invoke-static {p0, v2, p1, v1}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1838
    .line 1839
    .line 1840
    move-result-object p1

    .line 1841
    if-eqz p1, :cond_25

    .line 1842
    .line 1843
    invoke-virtual {p2, p1}, Lio/sentry/s6;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    .line 1844
    .line 1845
    .line 1846
    :cond_25
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/v1;

    .line 1847
    .line 1848
    .line 1849
    move-result-object p1

    .line 1850
    const-string v0, "io.sentry.screenshot.mask-all-text"

    .line 1851
    .line 1852
    invoke-static {p0, v2, v0, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1853
    .line 1854
    .line 1855
    move-result v0

    .line 1856
    invoke-virtual {p1, v0}, Lv3;->t(Z)V

    .line 1857
    .line 1858
    .line 1859
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/v1;

    .line 1860
    .line 1861
    .line 1862
    move-result-object p1

    .line 1863
    const-string v0, "io.sentry.screenshot.mask-all-images"

    .line 1864
    .line 1865
    invoke-static {p0, v2, v0, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1866
    .line 1867
    .line 1868
    move-result v0

    .line 1869
    invoke-virtual {p1, v0}, Lio/sentry/android/core/v1;->s(Z)V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrProfilingSampleRate()Ljava/lang/Double;

    .line 1873
    .line 1874
    .line 1875
    move-result-object p1

    .line 1876
    if-nez p1, :cond_26

    .line 1877
    .line 1878
    const-string p1, "io.sentry.anr.profiling.sample-rate"

    .line 1879
    .line 1880
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 1881
    .line 1882
    .line 1883
    move-result-wide v0

    .line 1884
    cmpl-double p1, v0, v5

    .line 1885
    .line 1886
    if-eqz p1, :cond_26

    .line 1887
    .line 1888
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1889
    .line 1890
    .line 1891
    move-result-object p1

    .line 1892
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrProfilingSampleRate(Ljava/lang/Double;)V

    .line 1893
    .line 1894
    .line 1895
    :cond_26
    const-string p1, "io.sentry.anr.enable-fingerprinting"

    .line 1896
    .line 1897
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAnrFingerprinting()Z

    .line 1898
    .line 1899
    .line 1900
    move-result v0

    .line 1901
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1902
    .line 1903
    .line 1904
    move-result p1

    .line 1905
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAnrFingerprinting(Z)V

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {p2}, Lio/sentry/s6;->getDataCollection()Lio/sentry/q;

    .line 1909
    .line 1910
    .line 1911
    move-result-object p1

    .line 1912
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/z0;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Lio/sentry/q;)Lio/sentry/q;

    .line 1913
    .line 1914
    .line 1915
    move-result-object p0

    .line 1916
    if-eqz p0, :cond_27

    .line 1917
    .line 1918
    invoke-virtual {p2}, Lio/sentry/s6;->getDataCollection()Lio/sentry/q;

    .line 1919
    .line 1920
    .line 1921
    move-result-object p1

    .line 1922
    invoke-static {p1, p0}, Lio/sentry/android/core/z0;->c(Lio/sentry/q;Lio/sentry/q;)V

    .line 1923
    .line 1924
    .line 1925
    :cond_27
    invoke-virtual {p2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 1926
    .line 1927
    .line 1928
    move-result-object p0

    .line 1929
    sget-object p1, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 1930
    .line 1931
    const-string v0, "Retrieving configuration from AndroidManifest.xml"

    .line 1932
    .line 1933
    new-array v1, v3, [Ljava/lang/Object;

    .line 1934
    .line 1935
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1936
    .line 1937
    .line 1938
    return-void

    .line 1939
    :goto_e
    invoke-virtual {p2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 1940
    .line 1941
    .line 1942
    move-result-object p1

    .line 1943
    sget-object p2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 1944
    .line 1945
    const-string v0, "Failed to read configuration from android manifest metadata."

    .line 1946
    .line 1947
    invoke-interface {p1, p2, v0, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1948
    .line 1949
    .line 1950
    return-void
.end method

.method public static b(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static c(Lio/sentry/q;Lio/sentry/q;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lio/sentry/q;->a:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object v0, p0, Lio/sentry/q;->a:Ljava/lang/Boolean;

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, Lio/sentry/q;->d:Ljava/util/Set;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lio/sentry/q;->b(Ljava/util/Set;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    iget-object v0, p1, Lio/sentry/q;->b:Lio/sentry/q2;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iput-object v0, p0, Lio/sentry/q;->b:Lio/sentry/q2;

    .line 19
    .line 20
    :cond_2
    iget-object v0, p1, Lio/sentry/q;->g:Lio/sentry/internal/debugmeta/c;

    .line 21
    .line 22
    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lio/sentry/q2;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    iget-object v2, p0, Lio/sentry/q;->g:Lio/sentry/internal/debugmeta/c;

    .line 29
    .line 30
    iput-object v1, v2, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_3
    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lio/sentry/q2;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    iget-object v1, p0, Lio/sentry/q;->g:Lio/sentry/internal/debugmeta/c;

    .line 39
    .line 40
    iput-object v0, v1, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_4
    iget-object v0, p1, Lio/sentry/q;->c:Lio/sentry/q2;

    .line 43
    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    iput-object v0, p0, Lio/sentry/q;->c:Lio/sentry/q2;

    .line 47
    .line 48
    :cond_5
    iget-object v0, p1, Lio/sentry/q;->h:Lio/sentry/internal/debugmeta/c;

    .line 49
    .line 50
    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Boolean;

    .line 53
    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    iget-object v2, p0, Lio/sentry/q;->h:Lio/sentry/internal/debugmeta/c;

    .line 57
    .line 58
    iput-object v1, v2, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 59
    .line 60
    :cond_6
    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Ljava/lang/Boolean;

    .line 63
    .line 64
    if-eqz v0, :cond_7

    .line 65
    .line 66
    iget-object v1, p0, Lio/sentry/q;->h:Lio/sentry/internal/debugmeta/c;

    .line 67
    .line 68
    iput-object v0, v1, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 69
    .line 70
    :cond_7
    iget-object v0, p1, Lio/sentry/q;->e:Ljava/lang/Boolean;

    .line 71
    .line 72
    if-eqz v0, :cond_8

    .line 73
    .line 74
    iput-object v0, p0, Lio/sentry/q;->e:Ljava/lang/Boolean;

    .line 75
    .line 76
    :cond_8
    iget-object p1, p1, Lio/sentry/q;->f:Ljava/lang/Boolean;

    .line 77
    .line 78
    if-eqz p1, :cond_9

    .line 79
    .line 80
    iput-object p1, p0, Lio/sentry/q;->f:Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_9
    return-void
.end method

.method public static d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object p3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 6
    .line 7
    invoke-interface {p1, p3}, Lio/sentry/ILogger;->i(Lio/sentry/s5;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p2, " read: "

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 v0, 0x0

    .line 31
    new-array v0, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return p0
.end method

.method public static e(Landroid/os/Bundle;Lio/sentry/ILogger;Lio/sentry/q;)Lio/sentry/q;
    .locals 6

    .line 1
    new-instance v0, Lio/sentry/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/q;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "io.sentry.data-collection.user-info"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1, v1, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lio/sentry/q;->a:Ljava/lang/Boolean;

    .line 24
    .line 25
    :cond_0
    const-string v1, "io.sentry.data-collection.http-bodies"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    invoke-static {p0, p1, v1}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v4, 0x1

    .line 44
    if-ne v2, v4, :cond_1

    .line 45
    .line 46
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const-class v2, Lio/sentry/r0;

    .line 60
    .line 61
    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/lang/String;

    .line 80
    .line 81
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v4}, Lio/sentry/r0;->valueOf(Ljava/lang/String;)Lio/sentry/r0;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    :goto_1
    sget-object v2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 96
    .line 97
    :cond_3
    invoke-virtual {v0, v2}, Lio/sentry/q;->b(Ljava/util/Set;)V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-object v1, p2, Lio/sentry/q;->b:Lio/sentry/q2;

    .line 101
    .line 102
    iget-object v2, p2, Lio/sentry/q;->g:Lio/sentry/internal/debugmeta/c;

    .line 103
    .line 104
    const-string v4, "io.sentry.data-collection.cookies"

    .line 105
    .line 106
    invoke-static {p0, p1, v4, v1}, Lio/sentry/android/core/z0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Lio/sentry/q2;)Lio/sentry/q2;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    iput-object v1, v0, Lio/sentry/q;->b:Lio/sentry/q2;

    .line 113
    .line 114
    :cond_5
    iget-object v1, v2, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lio/sentry/q2;

    .line 117
    .line 118
    const-string v4, "io.sentry.data-collection.http-headers.request"

    .line 119
    .line 120
    invoke-static {p0, p1, v4, v1}, Lio/sentry/android/core/z0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Lio/sentry/q2;)Lio/sentry/q2;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v4, v0, Lio/sentry/q;->g:Lio/sentry/internal/debugmeta/c;

    .line 125
    .line 126
    if-eqz v1, :cond_6

    .line 127
    .line 128
    iput-object v1, v4, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 129
    .line 130
    :cond_6
    iget-object v1, v2, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lio/sentry/q2;

    .line 133
    .line 134
    const-string v2, "io.sentry.data-collection.http-headers.response"

    .line 135
    .line 136
    invoke-static {p0, p1, v2, v1}, Lio/sentry/android/core/z0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Lio/sentry/q2;)Lio/sentry/q2;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-eqz v1, :cond_7

    .line 141
    .line 142
    iput-object v1, v4, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 143
    .line 144
    :cond_7
    const-string v1, "io.sentry.data-collection.url-query-params"

    .line 145
    .line 146
    iget-object p2, p2, Lio/sentry/q;->c:Lio/sentry/q2;

    .line 147
    .line 148
    invoke-static {p0, p1, v1, p2}, Lio/sentry/android/core/z0;->g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Lio/sentry/q2;)Lio/sentry/q2;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-eqz p2, :cond_8

    .line 153
    .line 154
    iput-object p2, v0, Lio/sentry/q;->c:Lio/sentry/q2;

    .line 155
    .line 156
    :cond_8
    const-string p2, "io.sentry.data-collection.graphql.document"

    .line 157
    .line 158
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    iget-object v2, v0, Lio/sentry/q;->h:Lio/sentry/internal/debugmeta/c;

    .line 163
    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    invoke-static {p0, p1, p2, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    iput-object p2, v2, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 175
    .line 176
    :cond_9
    const-string p2, "io.sentry.data-collection.graphql.variables"

    .line 177
    .line 178
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_a

    .line 183
    .line 184
    invoke-static {p0, p1, p2, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    iput-object p2, v2, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 193
    .line 194
    :cond_a
    const-string p2, "io.sentry.data-collection.database-query-data"

    .line 195
    .line 196
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_b

    .line 201
    .line 202
    invoke-static {p0, p1, p2, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    iput-object p2, v0, Lio/sentry/q;->e:Ljava/lang/Boolean;

    .line 211
    .line 212
    :cond_b
    const-string p2, "io.sentry.data-collection.file-paths"

    .line 213
    .line 214
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_c

    .line 219
    .line 220
    invoke-static {p0, p1, p2, v3}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    iput-object p0, v0, Lio/sentry/q;->f:Ljava/lang/Boolean;

    .line 229
    .line 230
    :cond_c
    invoke-virtual {v0}, Lio/sentry/q;->a()Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    if-eqz p0, :cond_d

    .line 235
    .line 236
    return-object v0

    .line 237
    :cond_d
    const/4 p0, 0x0

    .line 238
    return-object p0
.end method

.method public static f(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D
    .locals 4

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    invoke-virtual {p0, p2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 16
    .line 17
    cmpl-double v2, v0, v2

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    :cond_0
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 35
    .line 36
    invoke-interface {p1, p0}, Lio/sentry/ILogger;->i(Lio/sentry/s5;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string p2, " read: "

    .line 48
    .line 49
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const/4 v2, 0x0

    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    .line 61
    .line 62
    invoke-interface {p1, p0, p2, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-wide v0
.end method

.method public static g(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Lio/sentry/q2;)Lio/sentry/q2;
    .locals 4

    .line 1
    const-string v0, ".mode"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ".terms"

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    new-instance v1, Lio/sentry/q2;

    .line 28
    .line 29
    invoke-direct {v1}, Lio/sentry/q2;-><init>()V

    .line 30
    .line 31
    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    iget-object v3, p3, Lio/sentry/q2;->a:Lio/sentry/p2;

    .line 35
    .line 36
    iput-object v3, v1, Lio/sentry/q2;->a:Lio/sentry/p2;

    .line 37
    .line 38
    iget-object p3, p3, Lio/sentry/q2;->b:Ljava/util/List;

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    iput-object p3, v1, Lio/sentry/q2;->b:Ljava/util/List;

    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    invoke-static {p0, p1, v0, v2}, Lio/sentry/android/core/z0;->j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 64
    .line 65
    invoke-virtual {p3, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-static {p3}, Lio/sentry/p2;->valueOf(Ljava/lang/String;)Lio/sentry/p2;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    iput-object p3, v1, Lio/sentry/q2;->a:Lio/sentry/p2;

    .line 74
    .line 75
    :cond_2
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    invoke-static {p0, p1, p2}, Lio/sentry/android/core/z0;->h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-nez p0, :cond_3

    .line 86
    .line 87
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 88
    .line 89
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iput-object p0, v1, Lio/sentry/q2;->b:Ljava/util/List;

    .line 99
    .line 100
    :cond_4
    return-object v1
.end method

.method public static h(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lio/sentry/ILogger;->i(Lio/sentry/s5;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v1, " read: "

    .line 14
    .line 15
    invoke-static {p2, v1, p0}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    if-eqz p0, :cond_1

    .line 26
    .line 27
    const-string p1, ","

    .line 28
    .line 29
    const/4 p2, -0x1

    .line 30
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static i(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J
    .locals 1

    .line 1
    long-to-int p3, p3

    .line 2
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    int-to-long p3, p0

    .line 7
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lio/sentry/ILogger;->i(Lio/sentry/s5;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p2, " read: "

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const/4 v0, 0x0

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {p1, p0, p2, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-wide p3
.end method

.method public static j(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 6
    .line 7
    invoke-interface {p1, p3}, Lio/sentry/ILogger;->i(Lio/sentry/s5;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, " read: "

    .line 14
    .line 15
    invoke-static {p2, v0, p0}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p0
.end method

.method public static k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 6
    .line 7
    invoke-interface {p1, p3}, Lio/sentry/ILogger;->i(Lio/sentry/s5;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, " read: "

    .line 14
    .line 15
    invoke-static {p2, v0, p0}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p0
.end method

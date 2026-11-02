.class public final synthetic Lsc4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/q1;Lio/sentry/q1;)V
    .locals 0

    .line 1
    const/16 p1, 0x18

    .line 2
    .line 3
    iput-byte p1, p0, Lsc4;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, Lsc4;->X:B

    iput-object p1, p0, Lsc4;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lsc4;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-byte v0, p0, Lsc4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/high16 v3, 0x3f000000    # 0.5f

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/android/core/c2;

    .line 15
    .line 16
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/app/Activity;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Lio/sentry/android/core/c2;->show()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 39
    .line 40
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Landroid/app/Activity;

    .line 43
    .line 44
    iget-boolean v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->f0:Z

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Lio/sentry/android/core/FeedbackShakeIntegration;->g(Landroid/app/Activity;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    :try_start_0
    new-instance v1, Lio/sentry/android/core/c2;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Lio/sentry/android/core/c2;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 70
    .line 71
    .line 72
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/android/core/c2;->show()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    move-object v4, v1

    .line 78
    goto :goto_0

    .line 79
    :catchall_1
    move-exception p0

    .line 80
    :goto_0
    if-eqz v4, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0, v4}, Lio/sentry/android/core/FeedbackShakeIntegration;->k(Lio/sentry/android/core/c2;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    iget-object v0, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->Z:Lio/sentry/android/core/SentryAndroidOptions;

    .line 86
    .line 87
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 92
    .line 93
    const-string v2, "Failed to show feedback dialog on shake."

    .line 94
    .line 95
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_1
    return-void

    .line 99
    :pswitch_1
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 102
    .line 103
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 106
    .line 107
    iget-object v1, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->Y:Lio/sentry/android/core/y1;

    .line 108
    .line 109
    iget-object v0, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->X:Landroid/app/Application;

    .line 110
    .line 111
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    monitor-enter v1

    .line 116
    :try_start_2
    iput-object p0, v1, Lio/sentry/android/core/y1;->f:Lio/sentry/ILogger;

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Lio/sentry/android/core/y1;->b(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 119
    .line 120
    .line 121
    monitor-exit v1

    .line 122
    return-void

    .line 123
    :catchall_2
    move-exception p0

    .line 124
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    throw p0

    .line 126
    :pswitch_2
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lio/sentry/android/core/g0;

    .line 129
    .line 130
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Lio/sentry/ILogger;

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Lio/sentry/android/core/g0;->k(Lio/sentry/ILogger;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_3
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lio/sentry/android/core/AnrIntegration;

    .line 141
    .line 142
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 145
    .line 146
    sget-object v1, Lio/sentry/android/core/AnrIntegration;->g0:Lio/sentry/android/core/a;

    .line 147
    .line 148
    iget-object v1, v0, Lio/sentry/android/core/AnrIntegration;->Z:Lio/sentry/util/a;

    .line 149
    .line 150
    invoke-virtual {v1}, Lio/sentry/util/a;->g()V

    .line 151
    .line 152
    .line 153
    :try_start_4
    iget-boolean v2, v0, Lio/sentry/android/core/AnrIntegration;->Y:Z

    .line 154
    .line 155
    if-nez v2, :cond_4

    .line 156
    .line 157
    invoke-virtual {v0, p0}, Lio/sentry/android/core/AnrIntegration;->g(Lio/sentry/android/core/SentryAndroidOptions;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :catchall_3
    move-exception p0

    .line 162
    goto :goto_3

    .line 163
    :cond_4
    :goto_2
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :goto_3
    :try_start_5
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :catchall_4
    move-exception v0

    .line 172
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    :goto_4
    throw p0

    .line 176
    :pswitch_4
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lio/sentry/q1;

    .line 179
    .line 180
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, Lio/sentry/q1;

    .line 183
    .line 184
    invoke-static {v0, p0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->k(Lio/sentry/q1;Lio/sentry/q1;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_5
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Lio/sentry/ShutdownHookIntegration;

    .line 191
    .line 192
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 195
    .line 196
    iget-object v1, v0, Lio/sentry/ShutdownHookIntegration;->X:Ljava/lang/Runtime;

    .line 197
    .line 198
    iget-object v0, v0, Lio/sentry/ShutdownHookIntegration;->Y:Ljava/lang/Thread;

    .line 199
    .line 200
    invoke-virtual {v1, v0}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 208
    .line 209
    const-string v1, "ShutdownHookIntegration installed."

    .line 210
    .line 211
    new-array v2, v5, [Ljava/lang/Object;

    .line 212
    .line 213
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const-string p0, "ShutdownHook"

    .line 217
    .line 218
    invoke-static {p0}, Lio/sentry/util/b;->a(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_6
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lio/sentry/o4;

    .line 225
    .line 226
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p0, Lio/sentry/m1;

    .line 229
    .line 230
    invoke-virtual {v0}, Lio/sentry/o4;->i()Lio/sentry/s6;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Lio/sentry/s6;->getShutdownTimeoutMillis()J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    invoke-interface {p0, v0, v1}, Lio/sentry/m1;->a(J)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_7
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Landroid/content/Context;

    .line 245
    .line 246
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p0, Ljava/lang/String;

    .line 249
    .line 250
    sget v1, Lfb8;->b:I

    .line 251
    .line 252
    invoke-static {v0, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {p0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    new-instance v2, Lfv6;

    .line 261
    .line 262
    invoke-direct {v2, v0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v1, v2}, Lfb8;->a(Landroid/view/View;Lfv6;)V

    .line 266
    .line 267
    .line 268
    new-instance v1, Lfb8;

    .line 269
    .line 270
    invoke-direct {v1, v0, p0}, Lfb8;-><init>(Landroid/content/Context;Landroid/widget/Toast;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Lfb8;->show()V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_8
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Lh59;

    .line 280
    .line 281
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p0, Lg94;

    .line 284
    .line 285
    iget-boolean v1, v0, Lh59;->Z:Z

    .line 286
    .line 287
    if-nez v1, :cond_5

    .line 288
    .line 289
    iput-object p0, v0, Lh59;->f0:Lg94;

    .line 290
    .line 291
    invoke-virtual {p0, v0}, Lg94;->a(Lc94;)V

    .line 292
    .line 293
    .line 294
    :cond_5
    return-void

    .line 295
    :pswitch_9
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Lpr8;

    .line 298
    .line 299
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p0, Ljava/lang/Runnable;

    .line 302
    .line 303
    iget-object v0, v0, Lpr8;->d:Ljava/lang/ThreadLocal;

    .line 304
    .line 305
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 306
    .line 307
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :try_start_6
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :catchall_5
    move-exception p0

    .line 318
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 319
    .line 320
    .line 321
    throw p0

    .line 322
    :pswitch_a
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, Ljava/lang/Runnable;

    .line 325
    .line 326
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p0, Llp;

    .line 329
    .line 330
    :try_start_7
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0}, Llp;->a()V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :catchall_6
    move-exception v0

    .line 338
    invoke-virtual {p0}, Llp;->a()V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :pswitch_b
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lyr6;

    .line 345
    .line 346
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast p0, Lbh7;

    .line 349
    .line 350
    iget-object v0, v0, Lyr6;->Z:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Lxd6;

    .line 353
    .line 354
    const/4 v1, 0x3

    .line 355
    invoke-virtual {v0, p0, v1}, Lxd6;->J(Lbh7;I)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :pswitch_c
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, Lc1;

    .line 362
    .line 363
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 366
    .line 367
    :try_start_8
    invoke-virtual {v0}, Lc1;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :catchall_7
    move-exception v0

    .line 375
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :pswitch_d
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, Lea6;

    .line 382
    .line 383
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast p0, Lea6;

    .line 386
    .line 387
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lb71;

    .line 390
    .line 391
    invoke-static {v0, v4}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 392
    .line 393
    .line 394
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast p0, Lb71;

    .line 397
    .line 398
    invoke-static {p0, v4}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :pswitch_e
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lb98;

    .line 405
    .line 406
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p0, Lhy7;

    .line 409
    .line 410
    iget-object v1, v0, Lb98;->h:Lhy7;

    .line 411
    .line 412
    if-eqz v1, :cond_6

    .line 413
    .line 414
    if-ne v1, p0, :cond_6

    .line 415
    .line 416
    iput-object v4, v0, Lb98;->h:Lhy7;

    .line 417
    .line 418
    iput-object v4, v0, Lb98;->g:Lud0;

    .line 419
    .line 420
    :cond_6
    iget-object p0, v0, Lb98;->l:Lmf1;

    .line 421
    .line 422
    if-eqz p0, :cond_7

    .line 423
    .line 424
    invoke-virtual {p0}, Lmf1;->c()V

    .line 425
    .line 426
    .line 427
    iput-object v4, v0, Lb98;->l:Lmf1;

    .line 428
    .line 429
    :cond_7
    return-void

    .line 430
    :pswitch_f
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, Lby7;

    .line 433
    .line 434
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 437
    .line 438
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    check-cast p0, Ld41;

    .line 443
    .line 444
    new-instance v1, Lkz;

    .line 445
    .line 446
    invoke-direct {v1, v0}, Lkz;-><init>(Lby7;)V

    .line 447
    .line 448
    .line 449
    invoke-interface {p0, v1}, Ld41;->accept(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :pswitch_10
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lyr6;

    .line 456
    .line 457
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast p0, Ljava/util/List;

    .line 460
    .line 461
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    iget-object v1, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 467
    .line 468
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-nez v1, :cond_8

    .line 473
    .line 474
    iget-object v0, v0, Lyr6;->Z:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v0, Lwi;

    .line 477
    .line 478
    invoke-virtual {v0, p0}, Lwi;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    :cond_8
    return-void

    .line 482
    :pswitch_11
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, Landroid/widget/ScrollView;

    .line 485
    .line 486
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast p0, Landroid/view/View;

    .line 489
    .line 490
    new-instance v4, Landroid/graphics/Rect;

    .line 491
    .line 492
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v4}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 499
    .line 500
    .line 501
    move-result v4

    .line 502
    int-to-float v4, v4

    .line 503
    mul-float/2addr v4, v3

    .line 504
    float-to-int v3, v4

    .line 505
    new-array v4, v2, [I

    .line 506
    .line 507
    invoke-virtual {p0, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 508
    .line 509
    .line 510
    aget v1, v4, v1

    .line 511
    .line 512
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    sub-int/2addr v1, v4

    .line 517
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    add-int/2addr v4, v1

    .line 522
    sub-int/2addr v4, v3

    .line 523
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 524
    .line 525
    .line 526
    move-result p0

    .line 527
    div-int/2addr p0, v2

    .line 528
    sub-int/2addr v4, p0

    .line 529
    invoke-virtual {v0, v5, v4}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_12
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Landroidx/core/widget/NestedScrollView;

    .line 536
    .line 537
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast p0, Landroid/view/View;

    .line 540
    .line 541
    new-instance v4, Landroid/graphics/Rect;

    .line 542
    .line 543
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v4}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    int-to-float v4, v4

    .line 554
    mul-float/2addr v4, v3

    .line 555
    float-to-int v3, v4

    .line 556
    new-array v2, v2, [I

    .line 557
    .line 558
    invoke-virtual {p0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 559
    .line 560
    .line 561
    aget p0, v2, v1

    .line 562
    .line 563
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    sub-int/2addr p0, v1

    .line 568
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    add-int/2addr v1, p0

    .line 573
    sub-int/2addr v1, v3

    .line 574
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 575
    .line 576
    .line 577
    move-result p0

    .line 578
    rsub-int/lit8 p0, p0, 0x0

    .line 579
    .line 580
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    sub-int/2addr v1, v2

    .line 585
    invoke-virtual {v0, p0, v1, v5}, Landroidx/core/widget/NestedScrollView;->u(IIZ)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_13
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, Lwl7;

    .line 592
    .line 593
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast p0, Landroid/graphics/Typeface;

    .line 596
    .line 597
    invoke-virtual {v0, p0}, Lwl7;->T(Landroid/graphics/Typeface;)V

    .line 598
    .line 599
    .line 600
    return-void

    .line 601
    :pswitch_14
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;

    .line 604
    .line 605
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast p0, Lxb4;

    .line 608
    .line 609
    sget-object v1, Landroidx/work/multiprocess/RemoteWorkManagerClient;->j:Lkp5;

    .line 610
    .line 611
    :try_start_9
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_0

    .line 612
    .line 613
    .line 614
    goto :goto_5

    .line 615
    :catch_0
    invoke-virtual {v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->d()V

    .line 616
    .line 617
    .line 618
    :goto_5
    return-void

    .line 619
    :pswitch_15
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v0, Lfv5;

    .line 622
    .line 623
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast p0, Ls39;

    .line 626
    .line 627
    iget-object v1, v0, Lfv5;->k:Ljava/lang/Object;

    .line 628
    .line 629
    monitor-enter v1

    .line 630
    :try_start_a
    new-instance v2, Ljava/util/ArrayList;

    .line 631
    .line 632
    iget-object v0, v0, Lfv5;->j:Ljava/util/ArrayList;

    .line 633
    .line 634
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 635
    .line 636
    .line 637
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 638
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-eqz v1, :cond_9

    .line 647
    .line 648
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    check-cast v1, Lp52;

    .line 653
    .line 654
    invoke-interface {v1, p0, v5}, Lp52;->b(Ls39;Z)V

    .line 655
    .line 656
    .line 657
    goto :goto_6

    .line 658
    :cond_9
    return-void

    .line 659
    :catchall_8
    move-exception p0

    .line 660
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 661
    throw p0

    .line 662
    :pswitch_16
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Ly45;

    .line 665
    .line 666
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast p0, Lhy7;

    .line 669
    .line 670
    iget-object v0, v0, Ly45;->X:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 673
    .line 674
    iget-object v0, v0, Landroidx/camera/view/PreviewView;->q0:Ly45;

    .line 675
    .line 676
    invoke-virtual {v0, p0}, Ly45;->o(Lhy7;)V

    .line 677
    .line 678
    .line 679
    return-void

    .line 680
    :pswitch_17
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, Lkt5;

    .line 683
    .line 684
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast p0, Lhy7;

    .line 687
    .line 688
    invoke-interface {v0, p0}, Lkt5;->o(Lhy7;)V

    .line 689
    .line 690
    .line 691
    return-void

    .line 692
    :pswitch_18
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v0, Landroid/view/Surface;

    .line 695
    .line 696
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast p0, Landroid/graphics/SurfaceTexture;

    .line 699
    .line 700
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 701
    .line 702
    .line 703
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :pswitch_19
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, Lcv4;

    .line 710
    .line 711
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast p0, Lp63;

    .line 714
    .line 715
    invoke-interface {p0, v0}, Lp63;->k(Lq63;)V

    .line 716
    .line 717
    .line 718
    return-void

    .line 719
    :pswitch_1a
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 722
    .line 723
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast p0, Ljava/lang/Runnable;

    .line 726
    .line 727
    sget-object v1, Lcom/google/android/material/button/MaterialButton;->T0:[I

    .line 728
    .line 729
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 730
    .line 731
    .line 732
    iget-object p0, v0, Lcom/google/android/material/button/MaterialButton;->I0:Landroid/widget/LinearLayout$LayoutParams;

    .line 733
    .line 734
    if-eqz p0, :cond_a

    .line 735
    .line 736
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 737
    .line 738
    .line 739
    iput-object v4, v0, Lcom/google/android/material/button/MaterialButton;->I0:Landroid/widget/LinearLayout$LayoutParams;

    .line 740
    .line 741
    const/high16 p0, -0x31000000

    .line 742
    .line 743
    iput p0, v0, Lcom/google/android/material/button/MaterialButton;->F0:F

    .line 744
    .line 745
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 746
    .line 747
    .line 748
    return-void

    .line 749
    :pswitch_1b
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v0, Lf63;

    .line 752
    .line 753
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast p0, Ln85;

    .line 756
    .line 757
    iget-object v0, v0, Lf63;->Y:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v0, Lyz4;

    .line 760
    .line 761
    invoke-virtual {v0}, Lqc4;->d()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    check-cast v0, Ltc4;

    .line 766
    .line 767
    if-nez v0, :cond_b

    .line 768
    .line 769
    goto :goto_7

    .line 770
    :cond_b
    iget-object v0, v0, Ltc4;->a:Ljava/lang/Object;

    .line 771
    .line 772
    invoke-interface {p0, v0}, Ln85;->a(Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    :goto_7
    return-void

    .line 776
    :pswitch_1c
    iget-object v0, p0, Lsc4;->Y:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, Ljava/util/Map$Entry;

    .line 779
    .line 780
    iget-object p0, p0, Lsc4;->Z:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast p0, Ltc4;

    .line 783
    .line 784
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    check-cast v0, Ln85;

    .line 789
    .line 790
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    iget-object p0, p0, Ltc4;->a:Ljava/lang/Object;

    .line 794
    .line 795
    invoke-interface {v0, p0}, Ln85;->a(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    return-void

    .line 799
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

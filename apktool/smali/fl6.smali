.class public final synthetic Lfl6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/a;Lio/sentry/c2;)V
    .locals 0

    .line 1
    const/16 p2, 0x13

    .line 2
    .line 3
    iput-byte p2, p0, Lfl6;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lfl6;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/g0;Lio/sentry/android/core/f0;)V
    .locals 0

    .line 11
    const/16 p1, 0x17

    iput-byte p1, p0, Lfl6;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfl6;->Y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 12
    iput-byte p2, p0, Lfl6;->X:B

    iput-object p1, p0, Lfl6;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-byte v0, p0, Lfl6;->X:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    iget-object p0, p0, Lfl6;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Lio/sentry/android/core/anr/AnrProfilingIntegration;->g0:J

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->Z:Lio/sentry/android/core/SentryAndroidOptions;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->p(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    check-cast p0, Lio/sentry/android/core/y1;

    .line 32
    .line 33
    iget-object p0, p0, Lio/sentry/android/core/y1;->h:Ldi;

    .line 34
    .line 35
    :goto_0
    iget-object v0, p0, Ldi;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lio/sentry/android/core/x1;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v1, v0, Lio/sentry/android/core/x1;->c:Lio/sentry/android/core/x1;

    .line 42
    .line 43
    iput-object v1, p0, Ldi;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, p0, Ldi;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lio/sentry/android/core/n0;

    .line 48
    .line 49
    iget-object v2, v1, Lio/sentry/android/core/n0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lio/sentry/android/core/x1;

    .line 52
    .line 53
    iput-object v2, v0, Lio/sentry/android/core/x1;->c:Lio/sentry/android/core/x1;

    .line 54
    .line 55
    iput-object v0, v1, Lio/sentry/android/core/n0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iput-object v5, p0, Ldi;->e:Ljava/lang/Object;

    .line 59
    .line 60
    iput v6, p0, Ldi;->a:I

    .line 61
    .line 62
    iput v6, p0, Ldi;->c:I

    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_2
    check-cast p0, Lio/sentry/android/core/m1;

    .line 66
    .line 67
    iget-object v0, p0, Lio/sentry/android/core/m1;->e:Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter v0

    .line 70
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/m1;->g:Ljava/util/function/Consumer;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    iget-object v1, p0, Lio/sentry/android/core/m1;->a:Lio/sentry/ILogger;

    .line 75
    .line 76
    sget-object v2, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 77
    .line 78
    const-string v3, "Timed out waiting for Perfetto profiling result."

    .line 79
    .line 80
    new-array v6, v6, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-interface {v1, v2, v3, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lio/sentry/android/core/m1;->g:Ljava/util/function/Consumer;

    .line 86
    .line 87
    invoke-interface {v1, v5}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lio/sentry/android/core/l1;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Lio/sentry/android/core/l1;-><init>(Lio/sentry/android/core/m1;)V

    .line 93
    .line 94
    .line 95
    iput-object v1, p0, Lio/sentry/android/core/m1;->g:Ljava/util/function/Consumer;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto :goto_2

    .line 100
    :cond_1
    move v4, v6

    .line 101
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object p0, p0, Lio/sentry/android/core/m1;->i:Lio/sentry/android/core/internal/profiling/a;

    .line 105
    .line 106
    if-eqz p0, :cond_2

    .line 107
    .line 108
    sget-object v0, Lio/sentry/profiling/c;->NOT_RECORDED:Lio/sentry/profiling/c;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/profiling/a;->a(Lio/sentry/profiling/c;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    return-void

    .line 114
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    throw p0

    .line 116
    :pswitch_3
    check-cast p0, Lio/sentry/android/core/j1;

    .line 117
    .line 118
    iget-object v0, p0, Lio/sentry/android/core/j1;->t0:Lio/sentry/util/a;

    .line 119
    .line 120
    invoke-virtual {v0}, Lio/sentry/util/a;->g()V

    .line 121
    .line 122
    .line 123
    :try_start_2
    invoke-virtual {p0, v4}, Lio/sentry/android/core/j1;->i(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catchall_1
    move-exception p0

    .line 131
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catchall_2
    move-exception v0

    .line 136
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    throw p0

    .line 140
    :pswitch_4
    check-cast p0, Lio/sentry/android/core/y0;

    .line 141
    .line 142
    iget-boolean p0, p0, Lio/sentry/android/core/y0;->g0:Z

    .line 143
    .line 144
    if-eqz p0, :cond_3

    .line 145
    .line 146
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-interface {p0}, Lio/sentry/i1;->k()V

    .line 151
    .line 152
    .line 153
    :cond_3
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-interface {p0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Lio/sentry/s6;->getReplayController()Lio/sentry/d4;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p0}, Lio/sentry/d4;->U()V

    .line 166
    .line 167
    .line 168
    invoke-static {}, Lio/sentry/v4;->b()Lio/sentry/i1;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-interface {p0}, Lio/sentry/i1;->i()Lio/sentry/s6;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Lio/sentry/s6;->getContinuousProfiler()Lio/sentry/x0;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-interface {p0, v6}, Lio/sentry/x0;->close(Z)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_5
    check-cast p0, Lio/sentry/android/core/f0;

    .line 185
    .line 186
    if-eqz p0, :cond_4

    .line 187
    .line 188
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->k0:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 189
    .line 190
    iget-object v0, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->h0:Lg94;

    .line 191
    .line 192
    invoke-virtual {v0, p0}, Lg94;->f(Lc94;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    return-void

    .line 196
    :pswitch_6
    check-cast p0, Lio/sentry/android/core/u;

    .line 197
    .line 198
    invoke-virtual {p0, v5, v4}, Lio/sentry/android/core/u;->a(Ljava/util/List;Z)Lio/sentry/android/core/s;

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_7
    check-cast p0, Lio/sentry/android/core/h;

    .line 203
    .line 204
    invoke-virtual {p0, v4}, Lio/sentry/android/core/h;->h(Z)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :pswitch_8
    check-cast p0, Lio/sentry/android/core/d;

    .line 209
    .line 210
    iget-object p0, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p0, Lio/sentry/util/g;

    .line 213
    .line 214
    invoke-virtual {p0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, Landroidx/core/app/FrameMetricsAggregator;

    .line 219
    .line 220
    iget-object p0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Leb9;

    .line 221
    .line 222
    iget-object v0, p0, Leb9;->f0:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    sub-int/2addr v1, v4

    .line 231
    :goto_4
    if-ltz v1, :cond_6

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, Landroid/app/Activity;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    if-eqz v2, :cond_5

    .line 250
    .line 251
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    iget-object v3, p0, Leb9;->g0:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v3, Llm2;

    .line 258
    .line 259
    invoke-virtual {v2, v3}, Landroid/view/Window;->removeOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_6
    return-void

    .line 269
    :pswitch_9
    check-cast p0, Lio/sentry/android/core/a;

    .line 270
    .line 271
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    iput-wide v0, p0, Lio/sentry/android/core/a;->j0:J

    .line 276
    .line 277
    iget-object p0, p0, Lio/sentry/android/core/a;->k0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 278
    .line 279
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :pswitch_a
    check-cast p0, Ljava/io/File;

    .line 284
    .line 285
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    if-nez p0, :cond_7

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_7
    array-length v0, p0

    .line 293
    :goto_5
    if-ge v6, v0, :cond_9

    .line 294
    .line 295
    aget-object v1, p0, v6

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 298
    .line 299
    .line 300
    move-result-wide v2

    .line 301
    sget-wide v4, Lio/sentry/v4;->f:J

    .line 302
    .line 303
    const-wide/32 v7, 0x493e0

    .line 304
    .line 305
    .line 306
    sub-long/2addr v4, v7

    .line 307
    cmp-long v2, v2, v4

    .line 308
    .line 309
    if-gez v2, :cond_8

    .line 310
    .line 311
    invoke-static {v1}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 312
    .line 313
    .line 314
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_9
    :goto_6
    return-void

    .line 318
    :pswitch_b
    check-cast p0, Lyr6;

    .line 319
    .line 320
    iget-object v0, p0, Lyr6;->g0:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lwr6;

    .line 323
    .line 324
    new-instance v1, Lj78;

    .line 325
    .line 326
    const/4 v2, 0x7

    .line 327
    invoke-direct {v1, p0, v2}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v1}, Lwr6;->C(Luz7;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_c
    check-cast p0, Li39;

    .line 335
    .line 336
    iget-object v0, p0, Li39;->a:Landroid/content/Intent;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    iget-object p0, p0, Li39;->b:Lz18;

    .line 342
    .line 343
    invoke-virtual {p0, v5}, Lz18;->c(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_d
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 348
    .line 349
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 353
    .line 354
    invoke-interface {p0, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_e
    check-cast p0, Landroid/os/HandlerThread;

    .line 359
    .line 360
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 361
    .line 362
    .line 363
    const-wide/16 v0, 0x3e8

    .line 364
    .line 365
    invoke-virtual {p0, v0, v1}, Ljava/lang/Thread;->join(J)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :pswitch_f
    check-cast p0, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_a

    .line 380
    .line 381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 386
    .line 387
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 388
    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_a
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_b

    .line 400
    .line 401
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 406
    .line 407
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 408
    .line 409
    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_b
    return-void

    .line 414
    :pswitch_10
    check-cast p0, Lq78;

    .line 415
    .line 416
    iget-object v0, p0, Lq78;->b:Lf63;

    .line 417
    .line 418
    iput-object v5, p0, Lq78;->e:Lfl6;

    .line 419
    .line 420
    iget-object v2, p0, Lq78;->d:Lc15;

    .line 421
    .line 422
    iget-object p0, p0, Lq78;->a:Landroid/view/View;

    .line 423
    .line 424
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-nez v3, :cond_c

    .line 429
    .line 430
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    if-eqz p0, :cond_c

    .line 439
    .line 440
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 441
    .line 442
    .line 443
    move-result p0

    .line 444
    if-ne p0, v4, :cond_c

    .line 445
    .line 446
    invoke-virtual {v2}, Lc15;->g()V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_f

    .line 450
    .line 451
    :cond_c
    iget-object p0, v2, Lc15;->X:[Ljava/lang/Object;

    .line 452
    .line 453
    iget v3, v2, Lc15;->Z:I

    .line 454
    .line 455
    move-object v7, v5

    .line 456
    move v8, v6

    .line 457
    :goto_9
    if-ge v8, v3, :cond_13

    .line 458
    .line 459
    aget-object v9, p0, v8

    .line 460
    .line 461
    check-cast v9, Lp78;

    .line 462
    .line 463
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    if-eqz v10, :cond_11

    .line 468
    .line 469
    if-eq v10, v4, :cond_10

    .line 470
    .line 471
    if-eq v10, v1, :cond_e

    .line 472
    .line 473
    const/4 v11, 0x3

    .line 474
    if-ne v10, v11, :cond_d

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_d
    invoke-static {}, Lb61;->c()V

    .line 478
    .line 479
    .line 480
    goto/16 :goto_f

    .line 481
    .line 482
    :cond_e
    :goto_a
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 483
    .line 484
    invoke-static {v5, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    if-nez v10, :cond_12

    .line 489
    .line 490
    sget-object v7, Lp78;->Z:Lp78;

    .line 491
    .line 492
    if-ne v9, v7, :cond_f

    .line 493
    .line 494
    move v7, v4

    .line 495
    goto :goto_b

    .line 496
    :cond_f
    move v7, v6

    .line 497
    :goto_b
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    goto :goto_d

    .line 502
    :cond_10
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 503
    .line 504
    :goto_c
    move-object v7, v5

    .line 505
    goto :goto_d

    .line 506
    :cond_11
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 507
    .line 508
    goto :goto_c

    .line 509
    :cond_12
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 510
    .line 511
    goto :goto_9

    .line 512
    :cond_13
    invoke-virtual {v2}, Lc15;->g()V

    .line 513
    .line 514
    .line 515
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 516
    .line 517
    invoke-static {v5, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    if-eqz p0, :cond_14

    .line 522
    .line 523
    iget-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast p0, Lg44;

    .line 526
    .line 527
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 532
    .line 533
    iget-object v1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v1, Landroid/view/View;

    .line 536
    .line 537
    invoke-virtual {p0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 538
    .line 539
    .line 540
    :cond_14
    if-eqz v7, :cond_16

    .line 541
    .line 542
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 543
    .line 544
    .line 545
    move-result p0

    .line 546
    if-eqz p0, :cond_15

    .line 547
    .line 548
    iget-object p0, v0, Lf63;->f0:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast p0, Llr5;

    .line 551
    .line 552
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast p0, Ly45;

    .line 555
    .line 556
    invoke-virtual {p0}, Ly45;->O()V

    .line 557
    .line 558
    .line 559
    goto :goto_e

    .line 560
    :cond_15
    iget-object p0, v0, Lf63;->f0:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast p0, Llr5;

    .line 563
    .line 564
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast p0, Ly45;

    .line 567
    .line 568
    invoke-virtual {p0}, Ly45;->H()V

    .line 569
    .line 570
    .line 571
    :cond_16
    :goto_e
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 572
    .line 573
    invoke-static {v5, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    if-eqz p0, :cond_17

    .line 578
    .line 579
    iget-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast p0, Lg44;

    .line 582
    .line 583
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object p0

    .line 587
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 588
    .line 589
    iget-object v0, v0, Lf63;->Y:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, Landroid/view/View;

    .line 592
    .line 593
    invoke-virtual {p0, v0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 594
    .line 595
    .line 596
    :cond_17
    :goto_f
    return-void

    .line 597
    :pswitch_11
    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 598
    .line 599
    sget v0, Lcom/google/android/material/textfield/TextInputLayout;->F1:I

    .line 600
    .line 601
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:Landroid/widget/EditText;

    .line 602
    .line 603
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :pswitch_12
    check-cast p0, Lg18;

    .line 608
    .line 609
    invoke-virtual {p0}, Lg18;->b()V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :pswitch_13
    check-cast p0, Ld08;

    .line 614
    .line 615
    iget-object p0, p0, Ld08;->a:Lb08;

    .line 616
    .line 617
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 622
    .line 623
    if-eqz v1, :cond_18

    .line 624
    .line 625
    check-cast v0, Landroid/view/ViewGroup;

    .line 626
    .line 627
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 628
    .line 629
    .line 630
    :cond_18
    return-void

    .line 631
    :pswitch_14
    check-cast p0, Lmf1;

    .line 632
    .line 633
    invoke-virtual {p0}, Lmf1;->c()V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :pswitch_15
    check-cast p0, Lzv7;

    .line 638
    .line 639
    iget-object p0, p0, Lzv7;->Z:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast p0, Lex1;

    .line 642
    .line 643
    if-eqz p0, :cond_19

    .line 644
    .line 645
    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 646
    .line 647
    .line 648
    move-result-object p0

    .line 649
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-eqz v0, :cond_19

    .line 658
    .line 659
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    check-cast v0, Lxx7;

    .line 664
    .line 665
    invoke-virtual {v0}, Lxx7;->b()V

    .line 666
    .line 667
    .line 668
    goto :goto_10

    .line 669
    :cond_19
    return-void

    .line 670
    :pswitch_16
    check-cast p0, Lyr6;

    .line 671
    .line 672
    :try_start_4
    iget-object v0, p0, Lyr6;->Y:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v0, Lhg;

    .line 675
    .line 676
    invoke-virtual {v0}, Lhg;->invoke()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    check-cast v0, Ljava/util/List;

    .line 681
    .line 682
    iget-object v1, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v1, Landroid/os/Handler;

    .line 685
    .line 686
    new-instance v2, Lsc4;

    .line 687
    .line 688
    const/16 v3, 0xc

    .line 689
    .line 690
    invoke-direct {v2, p0, v0, v3}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 694
    .line 695
    .line 696
    goto :goto_11

    .line 697
    :catchall_3
    move-exception p0

    .line 698
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    :goto_11
    return-void

    .line 702
    :pswitch_17
    check-cast p0, Lorg/conscrypt/metrics/StatsLogImpl;

    .line 703
    .line 704
    invoke-static {p0}, Lorg/conscrypt/metrics/StatsLogImpl;->b(Lorg/conscrypt/metrics/StatsLogImpl;)V

    .line 705
    .line 706
    .line 707
    return-void

    .line 708
    :pswitch_18
    check-cast p0, Lm70;

    .line 709
    .line 710
    iput-boolean v6, p0, Lm70;->c:Z

    .line 711
    .line 712
    iget-object v0, p0, Lm70;->e:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 715
    .line 716
    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lmw8;

    .line 717
    .line 718
    if-eqz v2, :cond_1a

    .line 719
    .line 720
    invoke-virtual {v2}, Lmw8;->g()Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-eqz v2, :cond_1a

    .line 725
    .line 726
    iget v0, p0, Lm70;->b:I

    .line 727
    .line 728
    invoke-virtual {p0, v0}, Lm70;->d(I)V

    .line 729
    .line 730
    .line 731
    goto :goto_12

    .line 732
    :cond_1a
    iget v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 733
    .line 734
    if-ne v2, v1, :cond_1b

    .line 735
    .line 736
    iget p0, p0, Lm70;->b:I

    .line 737
    .line 738
    invoke-virtual {v0, p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->w(I)V

    .line 739
    .line 740
    .line 741
    :cond_1b
    :goto_12
    return-void

    .line 742
    :pswitch_19
    check-cast p0, Lf63;

    .line 743
    .line 744
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v0, Ljava/util/ArrayDeque;

    .line 747
    .line 748
    monitor-enter v0

    .line 749
    :try_start_5
    iget-object v1, p0, Lf63;->Y:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v1, Landroid/content/SharedPreferences;

    .line 752
    .line 753
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    const-string v2, "topic_operation_queue"

    .line 758
    .line 759
    new-instance v3, Ljava/lang/StringBuilder;

    .line 760
    .line 761
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 762
    .line 763
    .line 764
    iget-object p0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast p0, Ljava/util/ArrayDeque;

    .line 767
    .line 768
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 769
    .line 770
    .line 771
    move-result-object p0

    .line 772
    :goto_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    if-eqz v4, :cond_1c

    .line 777
    .line 778
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    check-cast v4, Ljava/lang/String;

    .line 783
    .line 784
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    const-string v4, ","

    .line 788
    .line 789
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    goto :goto_13

    .line 793
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object p0

    .line 797
    invoke-interface {v1, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 798
    .line 799
    .line 800
    move-result-object p0

    .line 801
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 802
    .line 803
    .line 804
    monitor-exit v0

    .line 805
    return-void

    .line 806
    :catchall_4
    move-exception p0

    .line 807
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 808
    throw p0

    .line 809
    :pswitch_1a
    check-cast p0, Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 810
    .line 811
    sget v0, Lsu/happ/proxyutility/ui/ScannerActivity;->T0:I

    .line 812
    .line 813
    :try_start_6
    iget-object v0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->R0:Lzo0;

    .line 814
    .line 815
    if-eqz v0, :cond_1d

    .line 816
    .line 817
    invoke-virtual {v0}, Lzo0;->get()Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    check-cast v0, Lxu5;

    .line 825
    .line 826
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/ui/ScannerActivity;->A(Lxu5;)V

    .line 827
    .line 828
    .line 829
    sget-object v0, Ldn8;->a:Ldn8;

    .line 830
    .line 831
    goto :goto_15

    .line 832
    :catchall_5
    move-exception v0

    .line 833
    goto :goto_14

    .line 834
    :cond_1d
    const-string v0, "cameraProviderFuture"

    .line 835
    .line 836
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    throw v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 840
    :goto_14
    new-instance v1, Lrj6;

    .line 841
    .line 842
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 843
    .line 844
    .line 845
    move-object v0, v1

    .line 846
    :goto_15
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    if-eqz v0, :cond_1f

    .line 851
    .line 852
    instance-of v1, v0, Ljava/util/concurrent/ExecutionException;

    .line 853
    .line 854
    if-nez v1, :cond_1e

    .line 855
    .line 856
    instance-of v0, v0, Ljava/lang/InterruptedException;

    .line 857
    .line 858
    if-eqz v0, :cond_1f

    .line 859
    .line 860
    :cond_1e
    sget v0, Ly46;->toast_camera_failure:I

    .line 861
    .line 862
    invoke-static {p0, v0}, Lx79;->h(Landroid/content/Context;I)V

    .line 863
    .line 864
    .line 865
    :cond_1f
    return-void

    .line 866
    :pswitch_1b
    check-cast p0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditActivity;

    .line 867
    .line 868
    iget-object v0, p0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditActivity;->Q0:Lfu6;

    .line 869
    .line 870
    if-eqz v0, :cond_20

    .line 871
    .line 872
    iget-object v0, v0, Lfu6;->Z:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 875
    .line 876
    new-instance v1, Lx42;

    .line 877
    .line 878
    const/4 v2, 0x5

    .line 879
    invoke-direct {v1, p0, v2}, Lx42;-><init>(Ljava/lang/Object;B)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 883
    .line 884
    .line 885
    return-void

    .line 886
    :cond_20
    const-string p0, "binding"

    .line 887
    .line 888
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    throw v5

    .line 892
    :pswitch_1c
    check-cast p0, Lgl6;

    .line 893
    .line 894
    invoke-static {p0}, Lgl6;->a(Lgl6;)V

    .line 895
    .line 896
    .line 897
    return-void

    .line 898
    nop

    .line 899
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

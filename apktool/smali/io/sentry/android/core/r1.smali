.class public final synthetic Lio/sentry/android/core/r1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/i1;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, Lio/sentry/android/core/r1;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, Lio/sentry/android/core/r1;->X:B

    iput-object p1, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-byte v0, p0, Lio/sentry/android/core/r1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 11
    .line 12
    iget-object v3, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lio/sentry/i1;

    .line 15
    .line 16
    iget-object p0, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 19
    .line 20
    iget-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->m0:Lio/sentry/util/a;

    .line 21
    .line 22
    invoke-virtual {v4}, Lio/sentry/util/a;->g()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-boolean v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h0:Z

    .line 26
    .line 27
    if-nez v5, :cond_3

    .line 28
    .line 29
    iget-boolean v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i0:Z

    .line 30
    .line 31
    if-nez v5, :cond_3

    .line 32
    .line 33
    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->Y:Lio/sentry/android/core/h2;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    new-instance v5, Lio/sentry/android/core/h2;

    .line 40
    .line 41
    invoke-direct {v5, v0, v3, p0}, Lio/sentry/android/core/h2;-><init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/i1;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 42
    .line 43
    .line 44
    iput-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->Y:Lio/sentry/android/core/h2;

    .line 45
    .line 46
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->j0:Landroid/content/IntentFilter;

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    new-instance v3, Landroid/content/IntentFilter;

    .line 51
    .line 52
    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->j0:Landroid/content/IntentFilter;

    .line 56
    .line 57
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->g0:[Ljava/lang/String;

    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_0
    if-ge v6, v5, :cond_1

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    iget-object v8, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->j0:Landroid/content/IntentFilter;

    .line 66
    .line 67
    invoke-virtual {v8, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k0:Landroid/os/HandlerThread;

    .line 77
    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    new-instance v3, Landroid/os/HandlerThread;

    .line 81
    .line 82
    const-string v5, "SystemEventsReceiver"

    .line 83
    .line 84
    const/16 v6, 0xa

    .line 85
    .line 86
    invoke-direct {v3, v5, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k0:Landroid/os/HandlerThread;

    .line 90
    .line 91
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k0:Landroid/os/HandlerThread;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    :cond_2
    :try_start_1
    new-instance v3, Landroid/os/Handler;

    .line 97
    .line 98
    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k0:Landroid/os/HandlerThread;

    .line 99
    .line 100
    invoke-virtual {v5}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-direct {v3, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 105
    .line 106
    .line 107
    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->X:Landroid/content/Context;

    .line 108
    .line 109
    iget-object v6, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->Y:Lio/sentry/android/core/h2;

    .line 110
    .line 111
    iget-object v7, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->j0:Landroid/content/IntentFilter;

    .line 112
    .line 113
    invoke-static {v5, p0, v6, v7, v3}, Lio/sentry/android/core/m0;->i(Landroid/content/Context;Lio/sentry/s6;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->l0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sget-object v1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 129
    .line 130
    const-string v3, "SystemEventsBreadcrumbsIntegration installed."

    .line 131
    .line 132
    new-array v5, v2, [Ljava/lang/Object;

    .line 133
    .line 134
    invoke-interface {v0, v1, v3, v5}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    const-string v0, "SystemEventsBreadcrumbs"

    .line 138
    .line 139
    invoke-static {v0}, Lio/sentry/util/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    :try_start_2
    invoke-virtual {p0, v2}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 152
    .line 153
    const-string v2, "Failed to initialize SystemEventsBreadcrumbsIntegration."

    .line 154
    .line 155
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 156
    .line 157
    .line 158
    :cond_3
    :goto_1
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_2
    :try_start_3
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :catchall_2
    move-exception v0

    .line 167
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    :goto_3
    throw p0

    .line 171
    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;

    .line 174
    .line 175
    iget-object v1, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 178
    .line 179
    iget-object p0, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Ljava/lang/String;

    .line 182
    .line 183
    iget-object v2, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->f0:Lio/sentry/util/a;

    .line 184
    .line 185
    invoke-virtual {v2}, Lio/sentry/util/a;->g()V

    .line 186
    .line 187
    .line 188
    :try_start_4
    iget-boolean v3, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->Z:Z

    .line 189
    .line 190
    if-nez v3, :cond_4

    .line 191
    .line 192
    invoke-virtual {v0, v1, p0}, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->g(Lio/sentry/android/core/SentryAndroidOptions;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :catchall_3
    move-exception v0

    .line 197
    move-object p0, v0

    .line 198
    goto :goto_5

    .line 199
    :cond_4
    :goto_4
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :goto_5
    :try_start_5
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 204
    .line 205
    .line 206
    goto :goto_6

    .line 207
    :catchall_4
    move-exception v0

    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    :goto_6
    throw p0

    .line 212
    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, Lio/sentry/android/core/h;

    .line 215
    .line 216
    iget-object v1, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    .line 217
    .line 218
    move-object v8, v1

    .line 219
    check-cast v8, Lio/sentry/s6;

    .line 220
    .line 221
    iget-object p0, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, Lio/sentry/i1;

    .line 224
    .line 225
    iget-object v1, v0, Lio/sentry/android/core/h;->o0:Ljava/util/ArrayList;

    .line 226
    .line 227
    iget-object v2, v0, Lio/sentry/android/core/h;->r0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_5

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_5
    new-instance v9, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    .line 244
    .line 245
    iget-object v10, v0, Lio/sentry/android/core/h;->y0:Lio/sentry/util/a;

    .line 246
    .line 247
    invoke-virtual {v10}, Lio/sentry/util/a;->g()V

    .line 248
    .line 249
    .line 250
    :try_start_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_6

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    move-object v11, v2

    .line 265
    check-cast v11, Lio/sentry/v3;

    .line 266
    .line 267
    new-instance v2, Lio/sentry/w3;

    .line 268
    .line 269
    iget-object v3, v11, Lio/sentry/v3;->a:Lio/sentry/protocol/w;

    .line 270
    .line 271
    iget-object v4, v11, Lio/sentry/v3;->b:Lio/sentry/protocol/w;

    .line 272
    .line 273
    iget-object v5, v11, Lio/sentry/v3;->d:Ljava/io/File;

    .line 274
    .line 275
    iget-object v6, v11, Lio/sentry/v3;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 276
    .line 277
    iget-wide v12, v11, Lio/sentry/v3;->e:D

    .line 278
    .line 279
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-direct/range {v2 .. v8}, Lio/sentry/w3;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Ljava/io/File;Ljava/util/AbstractMap;Ljava/lang/Double;Lio/sentry/s6;)V

    .line 284
    .line 285
    .line 286
    iget-object v3, v11, Lio/sentry/v3;->f:Ljava/lang/String;

    .line 287
    .line 288
    iput-object v3, v2, Lio/sentry/w3;->m0:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :catchall_5
    move-exception v0

    .line 295
    move-object p0, v0

    .line 296
    goto :goto_a

    .line 297
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 298
    .line 299
    .line 300
    invoke-virtual {v10}, Lio/sentry/util/a;->close()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_7

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Lio/sentry/w3;

    .line 318
    .line 319
    invoke-interface {p0, v1}, Lio/sentry/i1;->h(Lio/sentry/w3;)Lio/sentry/protocol/w;

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_7
    :goto_9
    return-void

    .line 324
    :goto_a
    :try_start_7
    invoke-virtual {v10}, Lio/sentry/util/a;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 325
    .line 326
    .line 327
    goto :goto_b

    .line 328
    :catchall_6
    move-exception v0

    .line 329
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :goto_b
    throw p0

    .line 333
    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Lio/sentry/android/core/d;

    .line 336
    .line 337
    iget-object v1, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, Ljava/lang/Runnable;

    .line 340
    .line 341
    iget-object p0, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p0, Ljava/lang/String;

    .line 344
    .line 345
    :try_start_8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 346
    .line 347
    .line 348
    goto :goto_c

    .line 349
    :catchall_7
    if-eqz p0, :cond_8

    .line 350
    .line 351
    iget-object v0, v0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 354
    .line 355
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 360
    .line 361
    const-string v3, "Failed to execute "

    .line 362
    .line 363
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    new-array v2, v2, [Ljava/lang/Object;

    .line 368
    .line 369
    invoke-interface {v0, v1, p0, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_8
    :goto_c
    return-void

    .line 373
    :pswitch_3
    iget-object v0, p0, Lio/sentry/android/core/r1;->Y:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    .line 376
    .line 377
    iget-object v3, p0, Lio/sentry/android/core/r1;->Z:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v3, Lio/sentry/android/core/SentryAndroidOptions;

    .line 380
    .line 381
    iget-object p0, p0, Lio/sentry/android/core/r1;->f0:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast p0, Lio/sentry/i1;

    .line 384
    .line 385
    :try_start_9
    iget-object v4, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->k0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 386
    .line 387
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_9

    .line 392
    .line 393
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 398
    .line 399
    const-string v1, "SendCachedEnvelopeIntegration, not trying to send after closing."

    .line 400
    .line 401
    new-array v2, v2, [Ljava/lang/Object;

    .line 402
    .line 403
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_e

    .line 407
    .line 408
    :catchall_8
    move-exception v0

    .line 409
    move-object p0, v0

    .line 410
    goto :goto_d

    .line 411
    :cond_9
    iget-object v4, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->j0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 412
    .line 413
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-nez v1, :cond_a

    .line 418
    .line 419
    invoke-virtual {v3}, Lio/sentry/s6;->getConnectionStatusProvider()Lio/sentry/w0;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    iput-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->f0:Lio/sentry/w0;

    .line 424
    .line 425
    invoke-interface {v1, v0}, Lio/sentry/w0;->s0(Lio/sentry/v0;)Z

    .line 426
    .line 427
    .line 428
    iget-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->X:Lio/sentry/s4;

    .line 429
    .line 430
    invoke-virtual {v1, p0, v3}, Lio/sentry/s4;->a(Lio/sentry/i1;Lio/sentry/s6;)Lio/sentry/r4;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    iput-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->i0:Lio/sentry/r4;

    .line 435
    .line 436
    :cond_a
    iget-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->f0:Lio/sentry/w0;

    .line 437
    .line 438
    if-eqz v1, :cond_b

    .line 439
    .line 440
    invoke-interface {v1}, Lio/sentry/w0;->n0()Lio/sentry/u0;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    sget-object v4, Lio/sentry/u0;->DISCONNECTED:Lio/sentry/u0;

    .line 445
    .line 446
    if-ne v1, v4, :cond_b

    .line 447
    .line 448
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 453
    .line 454
    const-string v1, "SendCachedEnvelopeIntegration, no connection."

    .line 455
    .line 456
    new-array v2, v2, [Ljava/lang/Object;

    .line 457
    .line 458
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto :goto_e

    .line 462
    :cond_b
    invoke-interface {p0}, Lio/sentry/i1;->d()Ls91;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    if-eqz p0, :cond_c

    .line 467
    .line 468
    sget-object v1, Lio/sentry/p;->All:Lio/sentry/p;

    .line 469
    .line 470
    invoke-virtual {p0, v1}, Ls91;->k(Lio/sentry/p;)Z

    .line 471
    .line 472
    .line 473
    move-result p0

    .line 474
    if-eqz p0, :cond_c

    .line 475
    .line 476
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 481
    .line 482
    const-string v1, "SendCachedEnvelopeIntegration, rate limiting active."

    .line 483
    .line 484
    new-array v2, v2, [Ljava/lang/Object;

    .line 485
    .line 486
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    goto :goto_e

    .line 490
    :cond_c
    iget-object p0, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->i0:Lio/sentry/r4;

    .line 491
    .line 492
    if-nez p0, :cond_d

    .line 493
    .line 494
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 499
    .line 500
    const-string v1, "SendCachedEnvelopeIntegration factory is null."

    .line 501
    .line 502
    new-array v2, v2, [Ljava/lang/Object;

    .line 503
    .line 504
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    goto :goto_e

    .line 508
    :cond_d
    invoke-virtual {p0}, Lio/sentry/r4;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 509
    .line 510
    .line 511
    goto :goto_e

    .line 512
    :goto_d
    invoke-virtual {v3}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 517
    .line 518
    const-string v2, "Failed trying to send cached events."

    .line 519
    .line 520
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    :goto_e
    return-void

    .line 524
    nop

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

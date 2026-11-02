.class public final synthetic Lvg0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:J

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JLandroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lvg0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvg0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p2, p0, Lvg0;->Y:J

    .line 10
    .line 11
    iput-object p4, p0, Lvg0;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JB)V
    .locals 0

    .line 14
    iput-byte p5, p0, Lvg0;->X:B

    iput-object p1, p0, Lvg0;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lvg0;->f0:Ljava/lang/Object;

    iput-wide p3, p0, Lvg0;->Y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-byte v0, p0, Lvg0;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-wide v3, p0, Lvg0;->Y:J

    .line 6
    .line 7
    iget-object v5, p0, Lvg0;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lvg0;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v9, p0

    .line 15
    check-cast v9, Lio/sentry/android/replay/capture/f;

    .line 16
    .line 17
    check-cast v5, Lio/sentry/android/replay/w;

    .line 18
    .line 19
    iget-object p0, v9, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v5, p0, v0}, Lio/sentry/android/replay/w;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, v9, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/f;

    .line 31
    .line 32
    invoke-interface {p0}, Lio/sentry/transport/f;->d()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    iget-object p0, v9, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/s6;

    .line 37
    .line 38
    invoke-virtual {p0}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-short p0, p0, Lio/sentry/w6;->h:S

    .line 43
    .line 44
    int-to-long v5, p0

    .line 45
    sub-long v7, v3, v5

    .line 46
    .line 47
    iget-object p0, v9, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/l;

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0, v7, v8}, Lio/sentry/android/replay/l;->u(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object p0, v1

    .line 57
    :goto_0
    iget-object v0, v9, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/a;

    .line 58
    .line 59
    sget-object v3, Lio/sentry/android/replay/capture/c;->u:[Lnw3;

    .line 60
    .line 61
    aget-object v3, v3, v2

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v3, v0, Lio/sentry/android/replay/capture/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 70
    .line 71
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    new-instance v4, Lio/sentry/android/replay/capture/b;

    .line 82
    .line 83
    iget-object v5, v0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/android/replay/capture/c;

    .line 84
    .line 85
    invoke-direct {v4, v3, p0, v5, v2}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;B)V

    .line 86
    .line 87
    .line 88
    iget-object p0, v0, Lio/sentry/android/replay/capture/a;->c:Lio/sentry/android/replay/capture/c;

    .line 89
    .line 90
    iget-object v2, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/s6;

    .line 91
    .line 92
    invoke-virtual {v2}, Lio/sentry/s6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 103
    .line 104
    new-instance v0, Lio/sentry/android/replay/util/h;

    .line 105
    .line 106
    new-instance v2, Lio/sentry/t2;

    .line 107
    .line 108
    const/4 v3, 0x7

    .line 109
    invoke-direct {v2, v4, v3}, Lio/sentry/t2;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    const-string v3, "CaptureStrategy.runInBackground"

    .line 113
    .line 114
    invoke-direct {v0, v2, v3}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    :try_start_0
    invoke-virtual {v4}, Lio/sentry/android/replay/capture/b;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    move-object p0, v0

    .line 127
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 132
    .line 133
    const-string v3, "Failed to execute task CaptureStrategy.runInBackground"

    .line 134
    .line 135
    invoke-interface {v0, v2, v3, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    :goto_1
    iget-object p0, v9, Lio/sentry/android/replay/capture/f;->y:Ljava/util/ArrayList;

    .line 139
    .line 140
    new-instance v10, Laa6;

    .line 141
    .line 142
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v6, Lio/sentry/android/replay/k;

    .line 146
    .line 147
    const/4 v11, 0x1

    .line 148
    invoke-direct/range {v6 .. v11}, Lio/sentry/android/replay/k;-><init>(JLjava/lang/Object;Ljava/io/Serializable;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v6}, Lbw0;->h0(Ljava/util/List;Lgn2;)V

    .line 152
    .line 153
    .line 154
    iget-boolean v0, v10, Laa6;->X:Z

    .line 155
    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const/4 v0, 0x0

    .line 163
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_7

    .line 168
    .line 169
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    add-int/lit8 v3, v0, 0x1

    .line 174
    .line 175
    if-ltz v0, :cond_6

    .line 176
    .line 177
    check-cast v2, Lio/sentry/android/replay/capture/i;

    .line 178
    .line 179
    iget-object v4, v2, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/u6;

    .line 180
    .line 181
    iput v0, v4, Lio/sentry/u6;->v0:I

    .line 182
    .line 183
    iget-object v2, v2, Lio/sentry/android/replay/capture/i;->b:Lio/sentry/f4;

    .line 184
    .line 185
    iget-object v2, v2, Lio/sentry/f4;->Y:Ljava/util/List;

    .line 186
    .line 187
    if-eqz v2, :cond_5

    .line 188
    .line 189
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_5

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    check-cast v4, Lio/sentry/rrweb/b;

    .line 204
    .line 205
    instance-of v5, v4, Lio/sentry/rrweb/m;

    .line 206
    .line 207
    if-eqz v5, :cond_4

    .line 208
    .line 209
    check-cast v4, Lio/sentry/rrweb/m;

    .line 210
    .line 211
    iput v0, v4, Lio/sentry/rrweb/m;->f0:I

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_5
    move v0, v3

    .line 215
    goto :goto_2

    .line 216
    :cond_6
    invoke-static {}, Li21;->X()V

    .line 217
    .line 218
    .line 219
    throw v1

    .line 220
    :cond_7
    return-void

    .line 221
    :pswitch_0
    check-cast p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    .line 222
    .line 223
    check-cast v5, Landroid/content/res/Configuration;

    .line 224
    .line 225
    sget-object v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->g0:Lio/sentry/n0;

    .line 226
    .line 227
    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->Y:Lio/sentry/i1;

    .line 228
    .line 229
    if-eqz v0, :cond_b

    .line 230
    .line 231
    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->X:Landroid/content/Context;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 242
    .line 243
    const/4 v6, 0x1

    .line 244
    if-eq v0, v6, :cond_9

    .line 245
    .line 246
    if-eq v0, v2, :cond_8

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_8
    sget-object v1, Lio/sentry/protocol/g;->LANDSCAPE:Lio/sentry/protocol/g;

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_9
    sget-object v1, Lio/sentry/protocol/g;->PORTRAIT:Lio/sentry/protocol/g;

    .line 253
    .line 254
    :goto_4
    if-eqz v1, :cond_a

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    goto :goto_5

    .line 267
    :cond_a
    const-string v0, "undefined"

    .line 268
    .line 269
    :goto_5
    new-instance v1, Lio/sentry/g;

    .line 270
    .line 271
    invoke-direct {v1, v3, v4}, Lio/sentry/g;-><init>(J)V

    .line 272
    .line 273
    .line 274
    const-string v2, "navigation"

    .line 275
    .line 276
    iput-object v2, v1, Lio/sentry/g;->g0:Ljava/lang/String;

    .line 277
    .line 278
    const-string v2, "device.orientation"

    .line 279
    .line 280
    iput-object v2, v1, Lio/sentry/g;->i0:Ljava/lang/String;

    .line 281
    .line 282
    const-string v2, "position"

    .line 283
    .line 284
    invoke-virtual {v1, v0, v2}, Lio/sentry/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 288
    .line 289
    iput-object v0, v1, Lio/sentry/g;->k0:Lio/sentry/s5;

    .line 290
    .line 291
    new-instance v0, Lio/sentry/n0;

    .line 292
    .line 293
    invoke-direct {v0}, Lio/sentry/n0;-><init>()V

    .line 294
    .line 295
    .line 296
    const-string v2, "android:configuration"

    .line 297
    .line 298
    invoke-virtual {v0, v5, v2}, Lio/sentry/n0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    iget-object p0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->Y:Lio/sentry/i1;

    .line 302
    .line 303
    invoke-interface {p0, v1, v0}, Lio/sentry/i1;->a(Lio/sentry/g;Lio/sentry/n0;)V

    .line 304
    .line 305
    .line 306
    :cond_b
    return-void

    .line 307
    :pswitch_1
    check-cast p0, Lme6;

    .line 308
    .line 309
    check-cast v5, Lte6;

    .line 310
    .line 311
    invoke-interface {p0, v5, v3, v4}, Lme6;->p(Lte6;J)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_2
    check-cast p0, Lol0;

    .line 316
    .line 317
    check-cast v5, Landroid/hardware/camera2/CameraCaptureSession;

    .line 318
    .line 319
    iget-object p0, p0, Lol0;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 320
    .line 321
    const/4 v0, -0x1

    .line 322
    invoke-virtual {p0, v5, v0, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureSequenceCompleted(Landroid/hardware/camera2/CameraCaptureSession;IJ)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
